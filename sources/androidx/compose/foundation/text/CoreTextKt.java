package androidx.compose.foundation.text;

import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.Placeholder;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\u001a>\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\r2'\u0010\u000e\u001a#\u0012\u001f\u0012\u001d\u0012\u0015\u0012\u0013\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0002\b\t0\u0003j\u0002`\n0\u0002H\u0001¢\u0006\u0002\u0010\u000f\u001aa\u0010\u0010\u001a?\u0012\u0014\u0012\u0012\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020\u00040\u0003j\u0002`\u00050\u0002\u0012%\u0012#\u0012\u001f\u0012\u001d\u0012\u0015\u0012\u0013\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0002\b\t0\u0003j\u0002`\n0\u00020\u00012\u0006\u0010\f\u001a\u00020\r2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00130\u0012H\u0000\u001ay\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\b\b\u0002\u0010\u001d\u001a\u00020\u001e2\b\b\u0002\u0010\u001f\u001a\u00020 2\b\b\u0002\u0010!\u001a\u00020\"2\b\b\u0002\u0010#\u001a\u00020\"2\u0012\u0010$\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b%\u0010&\u001ae\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\f\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\b\b\u0002\u0010\u001d\u001a\u00020\u001e2\b\b\u0002\u0010\u001f\u001a\u00020 2\b\b\u0002\u0010!\u001a\u00020\"2\b\b\u0002\u0010#\u001a\u00020\"H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b'\u0010(\"K\u0010\u0000\u001a?\u0012\u0014\u0012\u0012\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020\u00040\u0003j\u0002`\u00050\u0002\u0012%\u0012#\u0012\u001f\u0012\u001d\u0012\u0015\u0012\u0013\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0002\b\t0\u0003j\u0002`\n0\u00020\u0001X\u0004¢\u0006\u0002\n\u0000*:\b\u0002\u0010)\"\u0019\u0012\u0015\u0012\u0013\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0002\b\t0\u00032\u0019\u0012\u0015\u0012\u0013\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0002\b\t0\u0003*\u0018\b\u0002\u0010*\"\b\u0012\u0004\u0012\u00020\u00040\u00032\b\u0012\u0004\u0012\u00020\u00040\u0003\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006+"}, d2 = {"EmptyInlineContent", "Lkotlin/Pair;", "", "Landroidx/compose/ui/text/AnnotatedString$Range;", "Landroidx/compose/ui/text/Placeholder;", "Landroidx/compose/foundation/text/PlaceholderRange;", "Lkotlin/Function1;", "", "", "Landroidx/compose/runtime/Composable;", "Landroidx/compose/foundation/text/InlineContentRange;", "InlineChildren", "text", "Landroidx/compose/ui/text/AnnotatedString;", "inlineContents", "(Landroidx/compose/ui/text/AnnotatedString;Ljava/util/List;Landroidx/compose/runtime/Composer;I)V", "resolveInlineContent", "inlineContent", "", "Landroidx/compose/foundation/text/InlineTextContent;", "updateTextDelegate", "Landroidx/compose/foundation/text/TextDelegate;", "current", "style", "Landroidx/compose/ui/text/TextStyle;", "density", "Landroidx/compose/ui/unit/Density;", "fontFamilyResolver", "Landroidx/compose/ui/text/font/FontFamily$Resolver;", "softWrap", "", "overflow", "Landroidx/compose/ui/text/style/TextOverflow;", "maxLines", "", "minLines", "placeholders", "updateTextDelegate-rm0N8CA", "(Landroidx/compose/foundation/text/TextDelegate;Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/unit/Density;Landroidx/compose/ui/text/font/FontFamily$Resolver;ZIIILjava/util/List;)Landroidx/compose/foundation/text/TextDelegate;", "updateTextDelegate-x_uQXYA", "(Landroidx/compose/foundation/text/TextDelegate;Ljava/lang/String;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/unit/Density;Landroidx/compose/ui/text/font/FontFamily$Resolver;ZIII)Landroidx/compose/foundation/text/TextDelegate;", "InlineContentRange", "PlaceholderRange", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: CoreText.kt */
public final class CoreTextKt {
    private static final Pair<List<AnnotatedString.Range<Placeholder>>, List<AnnotatedString.Range<Function3<String, Composer, Integer, Unit>>>> EmptyInlineContent = new Pair<>(CollectionsKt.emptyList(), CollectionsKt.emptyList());

    public static final void InlineChildren(AnnotatedString annotatedString, List<AnnotatedString.Range<Function3<String, Composer, Integer, Unit>>> list, Composer composer, int i) {
        AnnotatedString annotatedString2 = annotatedString;
        List<AnnotatedString.Range<Function3<String, Composer, Integer, Unit>>> list2 = list;
        int i2 = i;
        Intrinsics.checkNotNullParameter(annotatedString2, "text");
        Intrinsics.checkNotNullParameter(list2, "inlineContents");
        Composer startRestartGroup = composer.startRestartGroup(-110905764);
        ComposerKt.sourceInformation(startRestartGroup, "C(InlineChildren)P(1)*81@3639L356:CoreText.kt#423gt5");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-110905764, i2, -1, "androidx.compose.foundation.text.InlineChildren (CoreText.kt:76)");
        }
        int size = list.size();
        for (int i3 = 0; i3 < size; i3++) {
            AnnotatedString.Range range = list2.get(i3);
            Function3 function3 = (Function3) range.component1();
            int component2 = range.component2();
            int component3 = range.component3();
            MeasurePolicy measurePolicy = CoreTextKt$InlineChildren$1$2.INSTANCE;
            startRestartGroup.startReplaceableGroup(-1323940314);
            ComposerKt.sourceInformation(startRestartGroup, "CC(Layout)P(!1,2)73@2855L7,74@2910L7,75@2969L7,76@2981L460:Layout.kt#80mrfh");
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object consume = startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            Density density = (Density) consume;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object consume2 = startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            LayoutDirection layoutDirection = (LayoutDirection) consume2;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object consume3 = startRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ViewConfiguration viewConfiguration = (ViewConfiguration) consume3;
            Function0<ComposeUiNode> constructor = ComposeUiNode.Companion.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf = LayoutKt.materializerOf(Modifier.Companion);
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor);
            } else {
                startRestartGroup.useNode();
            }
            Composer r13 = Updater.m2444constructorimpl(startRestartGroup);
            Updater.m2451setimpl(r13, measurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.m2451setimpl(r13, density, ComposeUiNode.Companion.getSetDensity());
            Updater.m2451setimpl(r13, layoutDirection, ComposeUiNode.Companion.getSetLayoutDirection());
            Updater.m2451setimpl(r13, viewConfiguration, ComposeUiNode.Companion.getSetViewConfiguration());
            materializerOf.invoke(SkippableUpdater.m2435boximpl(SkippableUpdater.m2436constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1487999110, "C82@3671L42:CoreText.kt#423gt5");
            function3.invoke(annotatedString2.subSequence(component2, component3).getText(), startRestartGroup, 0);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endNode();
            startRestartGroup.endReplaceableGroup();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new CoreTextKt$InlineChildren$2(annotatedString2, list2, i2));
        }
    }

    /* renamed from: updateTextDelegate-rm0N8CA$default  reason: not valid java name */
    public static /* synthetic */ TextDelegate m875updateTextDelegaterm0N8CA$default(TextDelegate textDelegate, AnnotatedString annotatedString, TextStyle textStyle, Density density, FontFamily.Resolver resolver, boolean z, int i, int i2, int i3, List list, int i4, Object obj) {
        int i5 = i4;
        return m874updateTextDelegaterm0N8CA(textDelegate, annotatedString, textStyle, density, resolver, (i5 & 32) != 0 ? true : z, (i5 & 64) != 0 ? TextOverflow.Companion.m5555getClipgIe3tQ8() : i, (i5 & 128) != 0 ? Integer.MAX_VALUE : i2, (i5 & 256) != 0 ? 1 : i3, list);
    }

    /* renamed from: updateTextDelegate-rm0N8CA  reason: not valid java name */
    public static final TextDelegate m874updateTextDelegaterm0N8CA(TextDelegate textDelegate, AnnotatedString annotatedString, TextStyle textStyle, Density density, FontFamily.Resolver resolver, boolean z, int i, int i2, int i3, List<AnnotatedString.Range<Placeholder>> list) {
        AnnotatedString annotatedString2 = annotatedString;
        TextStyle textStyle2 = textStyle;
        Density density2 = density;
        FontFamily.Resolver resolver2 = resolver;
        List<AnnotatedString.Range<Placeholder>> list2 = list;
        TextDelegate textDelegate2 = textDelegate;
        Intrinsics.checkNotNullParameter(textDelegate, "current");
        Intrinsics.checkNotNullParameter(annotatedString, "text");
        Intrinsics.checkNotNullParameter(textStyle, "style");
        Intrinsics.checkNotNullParameter(density2, "density");
        Intrinsics.checkNotNullParameter(resolver2, "fontFamilyResolver");
        Intrinsics.checkNotNullParameter(list2, "placeholders");
        if (!Intrinsics.areEqual((Object) textDelegate.getText(), (Object) annotatedString) || !Intrinsics.areEqual((Object) textDelegate.getStyle(), (Object) textStyle)) {
            boolean z2 = z;
        } else if (textDelegate.getSoftWrap() == z) {
            if (TextOverflow.m5548equalsimpl0(textDelegate.m933getOverflowgIe3tQ8(), i)) {
                if (textDelegate.getMaxLines() == i2) {
                    if (textDelegate.getMinLines() == i3 && Intrinsics.areEqual((Object) textDelegate.getDensity(), (Object) density2) && Intrinsics.areEqual((Object) textDelegate.getPlaceholders(), (Object) list2) && textDelegate.getFontFamilyResolver() == resolver2) {
                        return textDelegate2;
                    }
                    return new TextDelegate(annotatedString, textStyle, i2, i3, z, i, density, resolver, list, (DefaultConstructorMarker) null);
                }
                int i4 = i3;
                return new TextDelegate(annotatedString, textStyle, i2, i3, z, i, density, resolver, list, (DefaultConstructorMarker) null);
            }
            int i5 = i2;
            int i42 = i3;
            return new TextDelegate(annotatedString, textStyle, i2, i3, z, i, density, resolver, list, (DefaultConstructorMarker) null);
        }
        int i6 = i;
        int i52 = i2;
        int i422 = i3;
        return new TextDelegate(annotatedString, textStyle, i2, i3, z, i, density, resolver, list, (DefaultConstructorMarker) null);
    }

    /* renamed from: updateTextDelegate-x_uQXYA$default  reason: not valid java name */
    public static /* synthetic */ TextDelegate m877updateTextDelegatex_uQXYA$default(TextDelegate textDelegate, String str, TextStyle textStyle, Density density, FontFamily.Resolver resolver, boolean z, int i, int i2, int i3, int i4, Object obj) {
        int i5 = i4;
        return m876updateTextDelegatex_uQXYA(textDelegate, str, textStyle, density, resolver, (i5 & 32) != 0 ? true : z, (i5 & 64) != 0 ? TextOverflow.Companion.m5555getClipgIe3tQ8() : i, (i5 & 128) != 0 ? Integer.MAX_VALUE : i2, (i5 & 256) != 0 ? 1 : i3);
    }

    /* renamed from: updateTextDelegate-x_uQXYA  reason: not valid java name */
    public static final TextDelegate m876updateTextDelegatex_uQXYA(TextDelegate textDelegate, String str, TextStyle textStyle, Density density, FontFamily.Resolver resolver, boolean z, int i, int i2, int i3) {
        String str2 = str;
        TextStyle textStyle2 = textStyle;
        Density density2 = density;
        FontFamily.Resolver resolver2 = resolver;
        TextDelegate textDelegate2 = textDelegate;
        Intrinsics.checkNotNullParameter(textDelegate2, "current");
        Intrinsics.checkNotNullParameter(str2, "text");
        Intrinsics.checkNotNullParameter(textStyle2, "style");
        Intrinsics.checkNotNullParameter(density2, "density");
        Intrinsics.checkNotNullParameter(resolver2, "fontFamilyResolver");
        if (!Intrinsics.areEqual((Object) textDelegate.getText().getText(), (Object) str2) || !Intrinsics.areEqual((Object) textDelegate.getStyle(), (Object) textStyle2)) {
            boolean z2 = z;
        } else if (textDelegate.getSoftWrap() == z) {
            if (TextOverflow.m5548equalsimpl0(textDelegate.m933getOverflowgIe3tQ8(), i)) {
                if (textDelegate.getMaxLines() == i2) {
                    if (textDelegate.getMinLines() == i3 && Intrinsics.areEqual((Object) textDelegate.getDensity(), (Object) density2) && textDelegate.getFontFamilyResolver() == resolver2) {
                        return textDelegate2;
                    }
                    return new TextDelegate(new AnnotatedString(str, (List) null, (List) null, 6, (DefaultConstructorMarker) null), textStyle, i2, i3, z, i, density, resolver, (List) null, 256, (DefaultConstructorMarker) null);
                }
                int i4 = i3;
                return new TextDelegate(new AnnotatedString(str, (List) null, (List) null, 6, (DefaultConstructorMarker) null), textStyle, i2, i3, z, i, density, resolver, (List) null, 256, (DefaultConstructorMarker) null);
            }
            int i5 = i2;
            int i42 = i3;
            return new TextDelegate(new AnnotatedString(str, (List) null, (List) null, 6, (DefaultConstructorMarker) null), textStyle, i2, i3, z, i, density, resolver, (List) null, 256, (DefaultConstructorMarker) null);
        }
        int i6 = i;
        int i52 = i2;
        int i422 = i3;
        return new TextDelegate(new AnnotatedString(str, (List) null, (List) null, 6, (DefaultConstructorMarker) null), textStyle, i2, i3, z, i, density, resolver, (List) null, 256, (DefaultConstructorMarker) null);
    }

    public static final Pair<List<AnnotatedString.Range<Placeholder>>, List<AnnotatedString.Range<Function3<String, Composer, Integer, Unit>>>> resolveInlineContent(AnnotatedString annotatedString, Map<String, InlineTextContent> map) {
        Intrinsics.checkNotNullParameter(annotatedString, "text");
        Intrinsics.checkNotNullParameter(map, "inlineContent");
        if (map.isEmpty()) {
            return EmptyInlineContent;
        }
        List<AnnotatedString.Range<String>> stringAnnotations = annotatedString.getStringAnnotations(InlineTextContentKt.INLINE_CONTENT_TAG, 0, annotatedString.length());
        List arrayList = new ArrayList();
        List arrayList2 = new ArrayList();
        int size = stringAnnotations.size();
        for (int i = 0; i < size; i++) {
            AnnotatedString.Range range = stringAnnotations.get(i);
            InlineTextContent inlineTextContent = map.get(range.getItem());
            if (inlineTextContent != null) {
                arrayList.add(new AnnotatedString.Range(inlineTextContent.getPlaceholder(), range.getStart(), range.getEnd()));
                arrayList2.add(new AnnotatedString.Range(inlineTextContent.getChildren(), range.getStart(), range.getEnd()));
            }
        }
        return new Pair<>(arrayList, arrayList2);
    }
}
