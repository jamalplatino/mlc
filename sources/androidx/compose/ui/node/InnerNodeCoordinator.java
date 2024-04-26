package androidx.compose.ui.node;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.AndroidPaint_androidKt;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.graphics.Paint;
import androidx.compose.ui.graphics.PaintingStyle;
import androidx.compose.ui.layout.AlignmentLine;
import androidx.compose.ui.layout.LookaheadScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.LayoutNodeLayoutDelegate;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 <2\u00020\u0001:\u0002<=B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0016JS\u0010\u0013\u001a\u00020\u0014\"\b\b\u0000\u0010\u0015*\u00020\u00162\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u0002H\u00150\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u0002H\u00150\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u001eH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\f2\u0006\u0010#\u001a\u00020\fH\u0016J\u0010\u0010$\u001a\u00020\f2\u0006\u0010%\u001a\u00020\fH\u0016J\u001d\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020)H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b*\u0010+J\u0010\u0010,\u001a\u00020\f2\u0006\u0010#\u001a\u00020\fH\u0016J\u0010\u0010-\u001a\u00020\f2\u0006\u0010%\u001a\u00020\fH\u0016J\u0010\u0010.\u001a\u00020\u00142\u0006\u0010/\u001a\u000200H\u0016J@\u00101\u001a\u00020\u00142\u0006\u00102\u001a\u0002032\u0006\u00104\u001a\u0002052\u0019\u00106\u001a\u0015\u0012\u0004\u0012\u000208\u0012\u0004\u0012\u00020\u0014\u0018\u000107¢\u0006\u0002\b9H\u0014ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b:\u0010;R\u001a\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006>"}, d2 = {"Landroidx/compose/ui/node/InnerNodeCoordinator;", "Landroidx/compose/ui/node/NodeCoordinator;", "layoutNode", "Landroidx/compose/ui/node/LayoutNode;", "(Landroidx/compose/ui/node/LayoutNode;)V", "tail", "Landroidx/compose/ui/Modifier$Node;", "getTail$annotations", "()V", "getTail", "()Landroidx/compose/ui/Modifier$Node;", "calculateAlignmentLine", "", "alignmentLine", "Landroidx/compose/ui/layout/AlignmentLine;", "createLookaheadDelegate", "Landroidx/compose/ui/node/LookaheadDelegate;", "scope", "Landroidx/compose/ui/layout/LookaheadScope;", "hitTestChild", "", "T", "Landroidx/compose/ui/node/DelegatableNode;", "hitTestSource", "Landroidx/compose/ui/node/NodeCoordinator$HitTestSource;", "pointerPosition", "Landroidx/compose/ui/geometry/Offset;", "hitTestResult", "Landroidx/compose/ui/node/HitTestResult;", "isTouchEvent", "", "isInLayer", "hitTestChild-YqVAtuI", "(Landroidx/compose/ui/node/NodeCoordinator$HitTestSource;JLandroidx/compose/ui/node/HitTestResult;ZZ)V", "maxIntrinsicHeight", "width", "maxIntrinsicWidth", "height", "measure", "Landroidx/compose/ui/layout/Placeable;", "constraints", "Landroidx/compose/ui/unit/Constraints;", "measure-BRTryo0", "(J)Landroidx/compose/ui/layout/Placeable;", "minIntrinsicHeight", "minIntrinsicWidth", "performDraw", "canvas", "Landroidx/compose/ui/graphics/Canvas;", "placeAt", "position", "Landroidx/compose/ui/unit/IntOffset;", "zIndex", "", "layerBlock", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/GraphicsLayerScope;", "Lkotlin/ExtensionFunctionType;", "placeAt-f8xVGno", "(JFLkotlin/jvm/functions/Function1;)V", "Companion", "LookaheadDelegateImpl", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* compiled from: InnerNodeCoordinator.kt */
public final class InnerNodeCoordinator extends NodeCoordinator {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */
    public static final Paint innerBoundsPaint;
    private final Modifier.Node tail = new InnerNodeCoordinator$tail$1();

    public static /* synthetic */ void getTail$annotations() {
    }

    public Modifier.Node getTail() {
        return this.tail;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public InnerNodeCoordinator(LayoutNode layoutNode) {
        super(layoutNode);
        Intrinsics.checkNotNullParameter(layoutNode, "layoutNode");
        getTail().updateCoordinator$ui_release(this);
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0010\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0006H\u0016J\u0010\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0006H\u0016J\u001d\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0006H\u0016J\u0010\u0010\u0014\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0006H\u0016J\b\u0010\u0015\u001a\u00020\u0016H\u0014\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0017"}, d2 = {"Landroidx/compose/ui/node/InnerNodeCoordinator$LookaheadDelegateImpl;", "Landroidx/compose/ui/node/LookaheadDelegate;", "scope", "Landroidx/compose/ui/layout/LookaheadScope;", "(Landroidx/compose/ui/node/InnerNodeCoordinator;Landroidx/compose/ui/layout/LookaheadScope;)V", "calculateAlignmentLine", "", "alignmentLine", "Landroidx/compose/ui/layout/AlignmentLine;", "maxIntrinsicHeight", "width", "maxIntrinsicWidth", "height", "measure", "Landroidx/compose/ui/layout/Placeable;", "constraints", "Landroidx/compose/ui/unit/Constraints;", "measure-BRTryo0", "(J)Landroidx/compose/ui/layout/Placeable;", "minIntrinsicHeight", "minIntrinsicWidth", "placeChildren", "", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* compiled from: InnerNodeCoordinator.kt */
    private final class LookaheadDelegateImpl extends LookaheadDelegate {
        final /* synthetic */ InnerNodeCoordinator this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public LookaheadDelegateImpl(InnerNodeCoordinator innerNodeCoordinator, LookaheadScope lookaheadScope) {
            super(innerNodeCoordinator, lookaheadScope);
            Intrinsics.checkNotNullParameter(lookaheadScope, "scope");
            this.this$0 = innerNodeCoordinator;
        }

        /* renamed from: measure-BRTryo0  reason: not valid java name */
        public Placeable m4643measureBRTryo0(long j) {
            LookaheadDelegate lookaheadDelegate = this;
            lookaheadDelegate.m4559setMeasurementConstraintsBRTryo0(j);
            MutableVector<LayoutNode> mutableVector = getLayoutNode().get_children$ui_release();
            int size = mutableVector.getSize();
            if (size > 0) {
                Object[] content = mutableVector.getContent();
                int i = 0;
                do {
                    ((LayoutNode) content[i]).setMeasuredByParentInLookahead$ui_release(LayoutNode.UsageByParent.NotUsed);
                    i++;
                } while (i < size);
            }
            lookaheadDelegate.set_measureResult(getLayoutNode().getMeasurePolicy().m4521measure3p2s80s(this, getLayoutNode().getChildLookaheadMeasurables$ui_release(), j));
            return lookaheadDelegate;
        }

        public int calculateAlignmentLine(AlignmentLine alignmentLine) {
            Intrinsics.checkNotNullParameter(alignmentLine, "alignmentLine");
            Integer num = getAlignmentLinesOwner().calculateAlignmentLines().get(alignmentLine);
            int intValue = num != null ? num.intValue() : Integer.MIN_VALUE;
            getCachedAlignmentLinesMap().put(alignmentLine, Integer.valueOf(intValue));
            return intValue;
        }

        /* access modifiers changed from: protected */
        public void placeChildren() {
            LayoutNodeLayoutDelegate.LookaheadPassDelegate lookaheadPassDelegate$ui_release = getLayoutNode().getLayoutDelegate$ui_release().getLookaheadPassDelegate$ui_release();
            Intrinsics.checkNotNull(lookaheadPassDelegate$ui_release);
            lookaheadPassDelegate$ui_release.onPlaced();
            getAlignmentLinesOwner().layoutChildren();
        }

        public int minIntrinsicWidth(int i) {
            return getLayoutNode().getIntrinsicsPolicy$ui_release().minLookaheadIntrinsicWidth(i);
        }

        public int minIntrinsicHeight(int i) {
            return getLayoutNode().getIntrinsicsPolicy$ui_release().minLookaheadIntrinsicHeight(i);
        }

        public int maxIntrinsicWidth(int i) {
            return getLayoutNode().getIntrinsicsPolicy$ui_release().maxLookaheadIntrinsicWidth(i);
        }

        public int maxIntrinsicHeight(int i) {
            return getLayoutNode().getIntrinsicsPolicy$ui_release().maxLookaheadIntrinsicHeight(i);
        }
    }

    public LookaheadDelegate createLookaheadDelegate(LookaheadScope lookaheadScope) {
        Intrinsics.checkNotNullParameter(lookaheadScope, "scope");
        return new LookaheadDelegateImpl(this, lookaheadScope);
    }

    /* renamed from: measure-BRTryo0  reason: not valid java name */
    public Placeable m4641measureBRTryo0(long j) {
        m4559setMeasurementConstraintsBRTryo0(j);
        MutableVector<LayoutNode> mutableVector = getLayoutNode().get_children$ui_release();
        int size = mutableVector.getSize();
        if (size > 0) {
            Object[] content = mutableVector.getContent();
            int i = 0;
            do {
                ((LayoutNode) content[i]).setMeasuredByParent$ui_release(LayoutNode.UsageByParent.NotUsed);
                i++;
            } while (i < size);
        }
        setMeasureResult$ui_release(getLayoutNode().getMeasurePolicy().m4521measure3p2s80s(this, getLayoutNode().getChildMeasurables$ui_release(), j));
        onMeasured();
        return this;
    }

    public int minIntrinsicWidth(int i) {
        return getLayoutNode().getIntrinsicsPolicy$ui_release().minIntrinsicWidth(i);
    }

    public int minIntrinsicHeight(int i) {
        return getLayoutNode().getIntrinsicsPolicy$ui_release().minIntrinsicHeight(i);
    }

    public int maxIntrinsicWidth(int i) {
        return getLayoutNode().getIntrinsicsPolicy$ui_release().maxIntrinsicWidth(i);
    }

    public int maxIntrinsicHeight(int i) {
        return getLayoutNode().getIntrinsicsPolicy$ui_release().maxIntrinsicHeight(i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: placeAt-f8xVGno  reason: not valid java name */
    public void m4642placeAtf8xVGno(long j, float f, Function1<? super GraphicsLayerScope, Unit> function1) {
        super.m4764placeAtf8xVGno(j, f, function1);
        if (!isShallowPlacing$ui_release()) {
            onPlaced();
            getLayoutNode().onNodePlaced$ui_release();
        }
    }

    public int calculateAlignmentLine(AlignmentLine alignmentLine) {
        Intrinsics.checkNotNullParameter(alignmentLine, "alignmentLine");
        LookaheadDelegate lookaheadDelegate$ui_release = getLookaheadDelegate$ui_release();
        if (lookaheadDelegate$ui_release != null) {
            return lookaheadDelegate$ui_release.calculateAlignmentLine(alignmentLine);
        }
        Integer num = getAlignmentLinesOwner().calculateAlignmentLines().get(alignmentLine);
        if (num != null) {
            return num.intValue();
        }
        return Integer.MIN_VALUE;
    }

    public void performDraw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Owner requireOwner = LayoutNodeKt.requireOwner(getLayoutNode());
        MutableVector<LayoutNode> zSortedChildren = getLayoutNode().getZSortedChildren();
        int size = zSortedChildren.getSize();
        if (size > 0) {
            Object[] content = zSortedChildren.getContent();
            int i = 0;
            do {
                LayoutNode layoutNode = (LayoutNode) content[i];
                if (layoutNode.isPlaced()) {
                    layoutNode.draw$ui_release(canvas);
                }
                i++;
            } while (i < size);
        }
        if (requireOwner.getShowLayoutBounds()) {
            drawBorder(canvas, innerBoundsPaint);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0046  */
    /* JADX WARNING: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    /* renamed from: hitTestChild-YqVAtuI  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public <T extends androidx.compose.ui.node.DelegatableNode> void m4640hitTestChildYqVAtuI(androidx.compose.ui.node.NodeCoordinator.HitTestSource<T> r18, long r19, androidx.compose.ui.node.HitTestResult<T> r21, boolean r22, boolean r23) {
        /*
            r17 = this;
            r0 = r17
            r8 = r18
            r9 = r19
            r11 = r21
            java.lang.String r1 = "hitTestSource"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r1)
            java.lang.String r1 = "hitTestResult"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r1)
            androidx.compose.ui.node.LayoutNode r1 = r17.getLayoutNode()
            boolean r1 = r8.shouldHitTestChildren(r1)
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L_0x0042
            boolean r1 = r0.m4770withinLayerBoundsk4lQ0M(r9)
            if (r1 == 0) goto L_0x002a
            r12 = r23
        L_0x0028:
            r3 = r2
            goto L_0x0044
        L_0x002a:
            if (r22 == 0) goto L_0x0042
            long r4 = r17.m4751getMinimumTouchTargetSizeNHjbRc()
            float r1 = r0.m4748distanceInMinimumTouchTargettz77jQw(r9, r4)
            boolean r4 = java.lang.Float.isInfinite(r1)
            if (r4 != 0) goto L_0x0042
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0042
            r12 = r3
            goto L_0x0028
        L_0x0042:
            r12 = r23
        L_0x0044:
            if (r3 == 0) goto L_0x0093
            int r13 = r21.hitDepth
            androidx.compose.ui.node.LayoutNode r1 = r17.getLayoutNode()
            androidx.compose.runtime.collection.MutableVector r1 = r1.getZSortedChildren()
            int r3 = r1.getSize()
            if (r3 <= 0) goto L_0x0090
            int r3 = r3 - r2
            java.lang.Object[] r14 = r1.getContent()
            r15 = r3
        L_0x005e:
            r1 = r14[r15]
            r16 = r1
            androidx.compose.ui.node.LayoutNode r16 = (androidx.compose.ui.node.LayoutNode) r16
            boolean r1 = r16.isPlaced()
            if (r1 == 0) goto L_0x008c
            r1 = r18
            r2 = r16
            r3 = r19
            r5 = r21
            r6 = r22
            r7 = r12
            r1.m4775childHitTestYqVAtuI(r2, r3, r5, r6, r7)
            boolean r1 = r21.hasHit()
            if (r1 != 0) goto L_0x007f
            goto L_0x008c
        L_0x007f:
            androidx.compose.ui.node.NodeCoordinator r1 = r16.getOuterCoordinator$ui_release()
            boolean r1 = r1.shouldSharePointerInputWithSiblings()
            if (r1 == 0) goto L_0x0090
            r21.acceptHits()
        L_0x008c:
            int r15 = r15 + -1
            if (r15 >= 0) goto L_0x005e
        L_0x0090:
            r11.hitDepth = r13
        L_0x0093:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.node.InnerNodeCoordinator.m4640hitTestChildYqVAtuI(androidx.compose.ui.node.NodeCoordinator$HitTestSource, long, androidx.compose.ui.node.HitTestResult, boolean, boolean):void");
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroidx/compose/ui/node/InnerNodeCoordinator$Companion;", "", "()V", "innerBoundsPaint", "Landroidx/compose/ui/graphics/Paint;", "getInnerBoundsPaint", "()Landroidx/compose/ui/graphics/Paint;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* compiled from: InnerNodeCoordinator.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final Paint getInnerBoundsPaint() {
            return InnerNodeCoordinator.innerBoundsPaint;
        }
    }

    static {
        Paint Paint = AndroidPaint_androidKt.Paint();
        Paint.m3084setColor8_81llA(Color.Companion.m2855getRed0d7_KjU());
        Paint.setStrokeWidth(1.0f);
        Paint.m3088setStylek9PVt8s(PaintingStyle.Companion.m3097getStrokeTiuSbCo());
        innerBoundsPaint = Paint;
    }
}
