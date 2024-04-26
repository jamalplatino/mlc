package androidx.compose.ui.platform;

import android.graphics.Region;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.layout.LayoutInfo;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.SemanticsModifierNode;
import androidx.compose.ui.node.SemanticsModifierNodeKt;
import androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat;
import androidx.compose.ui.semantics.AccessibilityAction;
import androidx.compose.ui.semantics.SemanticsActions;
import androidx.compose.ui.semantics.SemanticsConfiguration;
import androidx.compose.ui.semantics.SemanticsConfigurationKt;
import androidx.compose.ui.semantics.SemanticsNode;
import androidx.compose.ui.semantics.SemanticsNodeKt;
import androidx.compose.ui.semantics.SemanticsOwner;
import androidx.compose.ui.semantics.SemanticsProperties;
import androidx.compose.ui.semantics.SemanticsPropertyKey;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;

@Metadata(d1 = {"\u0000\\\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001a\u0010\u0010\u001a\u00020\u0001*\u0006\u0012\u0002\b\u00030\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0002\u001a\f\u0010\u0014\u001a\u00020\u0001*\u00020\u0002H\u0002\u001a\f\u0010\u0015\u001a\u00020\u0001*\u00020\u0002H\u0002\u001a\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u0017*\b\u0012\u0004\u0012\u00020\u00170\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0000\u001a\"\u0010\u001b\u001a\u0004\u0018\u00010\u001c*\u00020\u001c2\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u00010\u001eH\u0002\u001a\u0018\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020!0 *\u00020\"H\u0000\u001a\f\u0010#\u001a\u00020\u0001*\u00020\u0002H\u0002\u001a \u0010$\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020&0%2\f\u0010'\u001a\b\u0012\u0004\u0012\u00020&0%H\u0002\u001a\u0014\u0010(\u001a\u00020\u0001*\u00020\u00022\u0006\u0010)\u001a\u00020*H\u0002\u001a\u001b\u0010+\u001a\b\u0012\u0004\u0012\u00020&0%*\u00020&2\u0006\u0010,\u001a\u00020&H\u0002\"\u0018\u0010\u0000\u001a\u00020\u0001*\u00020\u00028BX\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u001a\u0010\u0005\u001a\u0004\u0018\u00010\u0001*\u00020\u00028BX\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\"\u0018\u0010\u0007\u001a\u00020\u0001*\u00020\u00028BX\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0004\"\u0018\u0010\b\u001a\u00020\u0001*\u00020\u00028BX\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\u0004\"\u0018\u0010\t\u001a\u00020\u0001*\u00020\u00028BX\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u0004\"\u0018\u0010\n\u001a\u00020\u0001*\u00020\u00028BX\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u0004\"\u001e\u0010\u000b\u001a\u00020\u0001*\u00020\u00028BX\u0004¢\u0006\f\u0012\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\u0004\"\u0018\u0010\u000e\u001a\u00020\u0001*\u00020\u00028BX\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0004¨\u0006-"}, d2 = {"hasCollectionInfo", "", "Landroidx/compose/ui/semantics/SemanticsNode;", "getHasCollectionInfo", "(Landroidx/compose/ui/semantics/SemanticsNode;)Z", "isContainer", "(Landroidx/compose/ui/semantics/SemanticsNode;)Ljava/lang/Boolean;", "isPassword", "isRtl", "isScrollable", "isTextField", "isVisible", "isVisible$annotations", "(Landroidx/compose/ui/semantics/SemanticsNode;)V", "semanticsNodeIsStructurallySignificant", "getSemanticsNodeIsStructurallySignificant", "accessibilityEquals", "Landroidx/compose/ui/semantics/AccessibilityAction;", "other", "", "enabled", "excludeLineAndPageGranularities", "findById", "Landroidx/compose/ui/platform/ScrollObservationScope;", "", "id", "", "findClosestParentNode", "Landroidx/compose/ui/node/LayoutNode;", "selector", "Lkotlin/Function1;", "getAllUncoveredSemanticsNodesToMap", "", "Landroidx/compose/ui/platform/SemanticsNodeWithAdjustedBounds;", "Landroidx/compose/ui/semantics/SemanticsOwner;", "hasPaneTitle", "overlaps", "Landroidx/compose/ui/platform/OpenEndRange;", "", "it", "propertiesDeleted", "oldNode", "Landroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat$SemanticsNodeCopy;", "rangeUntil", "that", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: AndroidComposeViewAccessibilityDelegateCompat.android.kt */
public final class AndroidComposeViewAccessibilityDelegateCompat_androidKt {
    private static /* synthetic */ void isVisible$annotations(SemanticsNode semanticsNode) {
    }

    public static final OpenEndRange<Float> rangeUntil(float f, float f2) {
        return new OpenEndFloatRange(f, f2);
    }

    /* access modifiers changed from: private */
    public static final boolean overlaps(OpenEndRange<Float> openEndRange, OpenEndRange<Float> openEndRange2) {
        return !openEndRange.isEmpty() && !openEndRange2.isEmpty() && Math.max(openEndRange.getStart().floatValue(), openEndRange2.getStart().floatValue()) < Math.min(openEndRange.getEndExclusive().floatValue(), openEndRange2.getEndExclusive().floatValue());
    }

    /* access modifiers changed from: private */
    public static final LayoutNode findClosestParentNode(LayoutNode layoutNode, Function1<? super LayoutNode, Boolean> function1) {
        for (LayoutNode parent$ui_release = layoutNode.getParent$ui_release(); parent$ui_release != null; parent$ui_release = parent$ui_release.getParent$ui_release()) {
            if (function1.invoke(parent$ui_release).booleanValue()) {
                return parent$ui_release;
            }
        }
        return null;
    }

    /* access modifiers changed from: private */
    public static final boolean enabled(SemanticsNode semanticsNode) {
        return SemanticsConfigurationKt.getOrNull(semanticsNode.getConfig(), SemanticsProperties.INSTANCE.getDisabled()) == null;
    }

    /* access modifiers changed from: private */
    public static final boolean isVisible(SemanticsNode semanticsNode) {
        return !semanticsNode.isTransparent$ui_release() && !semanticsNode.getUnmergedConfig$ui_release().contains(SemanticsProperties.INSTANCE.getInvisibleToUser());
    }

    /* access modifiers changed from: private */
    public static final boolean propertiesDeleted(SemanticsNode semanticsNode, AndroidComposeViewAccessibilityDelegateCompat.SemanticsNodeCopy semanticsNodeCopy) {
        Iterator<Map.Entry<SemanticsPropertyKey<?>, Object>> it = semanticsNodeCopy.getUnmergedConfig().iterator();
        while (it.hasNext()) {
            if (!semanticsNode.getConfig().contains((SemanticsPropertyKey) it.next().getKey())) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: private */
    public static final boolean hasPaneTitle(SemanticsNode semanticsNode) {
        return semanticsNode.getConfig().contains(SemanticsProperties.INSTANCE.getPaneTitle());
    }

    /* access modifiers changed from: private */
    public static final boolean isPassword(SemanticsNode semanticsNode) {
        return semanticsNode.getConfig().contains(SemanticsProperties.INSTANCE.getPassword());
    }

    /* access modifiers changed from: private */
    public static final boolean isTextField(SemanticsNode semanticsNode) {
        return semanticsNode.getUnmergedConfig$ui_release().contains(SemanticsActions.INSTANCE.getSetText());
    }

    /* access modifiers changed from: private */
    public static final boolean isRtl(SemanticsNode semanticsNode) {
        return semanticsNode.getLayoutInfo().getLayoutDirection() == LayoutDirection.Rtl;
    }

    private static final Boolean isContainer(SemanticsNode semanticsNode) {
        return (Boolean) SemanticsConfigurationKt.getOrNull(semanticsNode.getConfig(), SemanticsProperties.INSTANCE.getIsContainer());
    }

    private static final boolean getHasCollectionInfo(SemanticsNode semanticsNode) {
        return semanticsNode.getConfig().contains(SemanticsProperties.INSTANCE.getCollectionInfo());
    }

    private static final boolean isScrollable(SemanticsNode semanticsNode) {
        return semanticsNode.getConfig().contains(SemanticsActions.INSTANCE.getScrollBy());
    }

    /* access modifiers changed from: private */
    public static final boolean getSemanticsNodeIsStructurallySignificant(SemanticsNode semanticsNode) {
        if (Intrinsics.areEqual((Object) isContainer(semanticsNode), (Object) false)) {
            return false;
        }
        if (Intrinsics.areEqual((Object) isContainer(semanticsNode), (Object) true) || getHasCollectionInfo(semanticsNode) || isScrollable(semanticsNode)) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: private */
    public static final boolean excludeLineAndPageGranularities(SemanticsNode semanticsNode) {
        SemanticsModifierNode outerSemantics;
        SemanticsConfiguration collapsedSemanticsConfiguration;
        if (isTextField(semanticsNode) && !Intrinsics.areEqual(SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui_release(), SemanticsProperties.INSTANCE.getFocused()), (Object) true)) {
            return true;
        }
        LayoutNode findClosestParentNode = findClosestParentNode(semanticsNode.getLayoutNode$ui_release(), AndroidComposeViewAccessibilityDelegateCompat_androidKt$excludeLineAndPageGranularities$ancestor$1.INSTANCE);
        if (findClosestParentNode == null || ((outerSemantics = SemanticsNodeKt.getOuterSemantics(findClosestParentNode)) != null && (collapsedSemanticsConfiguration = SemanticsModifierNodeKt.collapsedSemanticsConfiguration(outerSemantics)) != null && Intrinsics.areEqual(SemanticsConfigurationKt.getOrNull(collapsedSemanticsConfiguration, SemanticsProperties.INSTANCE.getFocused()), (Object) true))) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: private */
    public static final boolean accessibilityEquals(AccessibilityAction<?> accessibilityAction, Object obj) {
        if (accessibilityAction == obj) {
            return true;
        }
        if (!(obj instanceof AccessibilityAction)) {
            return false;
        }
        AccessibilityAction accessibilityAction2 = (AccessibilityAction) obj;
        if (!Intrinsics.areEqual((Object) accessibilityAction.getLabel(), (Object) accessibilityAction2.getLabel())) {
            return false;
        }
        if (accessibilityAction.getAction() != null || accessibilityAction2.getAction() == null) {
            return accessibilityAction.getAction() == null || accessibilityAction2.getAction() != null;
        }
        return false;
    }

    public static final Map<Integer, SemanticsNodeWithAdjustedBounds> getAllUncoveredSemanticsNodesToMap(SemanticsOwner semanticsOwner) {
        Intrinsics.checkNotNullParameter(semanticsOwner, "<this>");
        SemanticsNode unmergedRootSemanticsNode = semanticsOwner.getUnmergedRootSemanticsNode();
        Map<Integer, SemanticsNodeWithAdjustedBounds> linkedHashMap = new LinkedHashMap<>();
        if (unmergedRootSemanticsNode.getLayoutNode$ui_release().isPlaced() && unmergedRootSemanticsNode.getLayoutNode$ui_release().isAttached()) {
            Region region = new Region();
            Rect boundsInRoot = unmergedRootSemanticsNode.getBoundsInRoot();
            region.set(new android.graphics.Rect(MathKt.roundToInt(boundsInRoot.getLeft()), MathKt.roundToInt(boundsInRoot.getTop()), MathKt.roundToInt(boundsInRoot.getRight()), MathKt.roundToInt(boundsInRoot.getBottom())));
            getAllUncoveredSemanticsNodesToMap$findAllSemanticNodesRecursive(region, unmergedRootSemanticsNode, linkedHashMap, unmergedRootSemanticsNode);
        }
        return linkedHashMap;
    }

    private static final void getAllUncoveredSemanticsNodesToMap$findAllSemanticNodesRecursive(Region region, SemanticsNode semanticsNode, Map<Integer, SemanticsNodeWithAdjustedBounds> map, SemanticsNode semanticsNode2) {
        int i;
        Rect rect;
        LayoutInfo layoutInfo;
        boolean z = !semanticsNode2.getLayoutNode$ui_release().isPlaced() || !semanticsNode2.getLayoutNode$ui_release().isAttached();
        if (region.isEmpty() && semanticsNode2.getId() != semanticsNode.getId()) {
            return;
        }
        if (!z || semanticsNode2.isFake$ui_release()) {
            android.graphics.Rect rect2 = new android.graphics.Rect(MathKt.roundToInt(semanticsNode2.getTouchBoundsInRoot().getLeft()), MathKt.roundToInt(semanticsNode2.getTouchBoundsInRoot().getTop()), MathKt.roundToInt(semanticsNode2.getTouchBoundsInRoot().getRight()), MathKt.roundToInt(semanticsNode2.getTouchBoundsInRoot().getBottom()));
            Region region2 = new Region();
            region2.set(rect2);
            if (semanticsNode2.getId() == semanticsNode.getId()) {
                i = -1;
            } else {
                i = semanticsNode2.getId();
            }
            if (region2.op(region, region2, Region.Op.INTERSECT)) {
                Integer valueOf = Integer.valueOf(i);
                android.graphics.Rect bounds = region2.getBounds();
                Intrinsics.checkNotNullExpressionValue(bounds, "region.bounds");
                map.put(valueOf, new SemanticsNodeWithAdjustedBounds(semanticsNode2, bounds));
                List<SemanticsNode> replacedChildren$ui_release = semanticsNode2.getReplacedChildren$ui_release();
                for (int size = replacedChildren$ui_release.size() - 1; -1 < size; size--) {
                    getAllUncoveredSemanticsNodesToMap$findAllSemanticNodesRecursive(region, semanticsNode, map, replacedChildren$ui_release.get(size));
                }
                region.op(rect2, region, Region.Op.REVERSE_DIFFERENCE);
            } else if (semanticsNode2.isFake$ui_release()) {
                SemanticsNode parent = semanticsNode2.getParent();
                if (parent == null || (layoutInfo = parent.getLayoutInfo()) == null || !layoutInfo.isPlaced()) {
                    rect = new Rect(0.0f, 0.0f, 10.0f, 10.0f);
                } else {
                    rect = parent.getBoundsInRoot();
                }
                map.put(Integer.valueOf(i), new SemanticsNodeWithAdjustedBounds(semanticsNode2, new android.graphics.Rect(MathKt.roundToInt(rect.getLeft()), MathKt.roundToInt(rect.getTop()), MathKt.roundToInt(rect.getRight()), MathKt.roundToInt(rect.getBottom()))));
            } else if (i == -1) {
                Integer valueOf2 = Integer.valueOf(i);
                android.graphics.Rect bounds2 = region2.getBounds();
                Intrinsics.checkNotNullExpressionValue(bounds2, "region.bounds");
                map.put(valueOf2, new SemanticsNodeWithAdjustedBounds(semanticsNode2, bounds2));
            }
        }
    }

    public static final ScrollObservationScope findById(List<ScrollObservationScope> list, int i) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (list.get(i2).getSemanticsNodeId() == i) {
                return list.get(i2);
            }
        }
        return null;
    }
}
