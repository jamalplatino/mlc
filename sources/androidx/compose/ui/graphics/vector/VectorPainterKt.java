package androidx.compose.ui.graphics.vector;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.BlendMode;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.drawscope.DrawContext;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.vector.VectorProperty;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000v\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a+\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\b0\u0007H\u0007¢\u0006\u0002\u0010\t\u001a\u0015\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0007¢\u0006\u0002\u0010\u000e\u001a\u0001\u0010\n\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0015\u001a\u00020\u00012\b\b\u0002\u0010\u0016\u001a\u00020\u00172\b\b\u0002\u0010\u0018\u001a\u00020\u00192@\u0010\u001a\u001a<\u0012\u0013\u0012\u00110\u0013¢\u0006\f\b\u001c\u0012\b\b\u0015\u0012\u0004\b\b(\u0012\u0012\u0013\u0012\u00110\u0013¢\u0006\f\b\u001c\u0012\b\b\u0015\u0012\u0004\b\b(\u0014\u0012\u0004\u0012\u00020\u00030\u001b¢\u0006\u0002\b\u001d¢\u0006\u0002\b\u001eH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001f\u0010 \u001a£\u0001\u0010\n\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0015\u001a\u00020\u00012\b\b\u0002\u0010\u0016\u001a\u00020\u00172\b\b\u0002\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010!\u001a\u00020\"2@\u0010\u001a\u001a<\u0012\u0013\u0012\u00110\u0013¢\u0006\f\b\u001c\u0012\b\b\u0015\u0012\u0004\b\b(\u0012\u0012\u0013\u0012\u00110\u0013¢\u0006\f\b\u001c\u0012\b\b\u0015\u0012\u0004\b\b(\u0014\u0012\u0004\u0012\u00020\u00030\u001b¢\u0006\u0002\b\u001d¢\u0006\u0002\b\u001eH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b#\u0010$\u001a&\u0010%\u001a\u00020\u0003*\u00020&2\u0017\u0010'\u001a\u0013\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020\u00030(¢\u0006\u0002\b)H\b\"\u000e\u0010\u0000\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006*"}, d2 = {"RootGroupName", "", "RenderVectorGroup", "", "group", "Landroidx/compose/ui/graphics/vector/VectorGroup;", "configs", "", "Landroidx/compose/ui/graphics/vector/VectorConfig;", "(Landroidx/compose/ui/graphics/vector/VectorGroup;Ljava/util/Map;Landroidx/compose/runtime/Composer;II)V", "rememberVectorPainter", "Landroidx/compose/ui/graphics/vector/VectorPainter;", "image", "Landroidx/compose/ui/graphics/vector/ImageVector;", "(Landroidx/compose/ui/graphics/vector/ImageVector;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/vector/VectorPainter;", "defaultWidth", "Landroidx/compose/ui/unit/Dp;", "defaultHeight", "viewportWidth", "", "viewportHeight", "name", "tintColor", "Landroidx/compose/ui/graphics/Color;", "tintBlendMode", "Landroidx/compose/ui/graphics/BlendMode;", "content", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "Landroidx/compose/runtime/Composable;", "Landroidx/compose/ui/graphics/vector/VectorComposable;", "rememberVectorPainter-mlNsNFs", "(FFFFLjava/lang/String;JILkotlin/jvm/functions/Function4;Landroidx/compose/runtime/Composer;II)Landroidx/compose/ui/graphics/vector/VectorPainter;", "autoMirror", "", "rememberVectorPainter-vIP8VLU", "(FFFFLjava/lang/String;JIZLkotlin/jvm/functions/Function4;Landroidx/compose/runtime/Composer;II)Landroidx/compose/ui/graphics/vector/VectorPainter;", "mirror", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "block", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: VectorPainter.kt */
public final class VectorPainterKt {
    public static final String RootGroupName = "VectorRootGroup";

    @Deprecated(message = "Replace rememberVectorPainter graphicsLayer that consumes the auto mirror flag", replaceWith = @ReplaceWith(expression = "rememberVectorPainter(defaultWidth, defaultHeight, viewportWidth, viewportHeight, name, tintColor, tintBlendMode, false, content)", imports = {"androidx.compose.ui.graphics.vector"}))
    /* renamed from: rememberVectorPainter-mlNsNFs  reason: not valid java name */
    public static final VectorPainter m3547rememberVectorPaintermlNsNFs(float f, float f2, float f3, float f4, String str, long j, int i, Function4<? super Float, ? super Float, ? super Composer, ? super Integer, Unit> function4, Composer composer, int i2, int i3) {
        Composer composer2 = composer;
        int i4 = i2;
        Intrinsics.checkNotNullParameter(function4, "content");
        composer2.startReplaceableGroup(-964365210);
        ComposerKt.sourceInformation(composer2, "C(rememberVectorPainter)P(2:c#ui.unit.Dp,1:c#ui.unit.Dp,7,6,3,5:c#ui.graphics.Color,4:c#ui.graphics.BlendMode)83@3597L207:VectorPainter.kt#huu6hf");
        float f5 = Float.NaN;
        float f6 = (i3 & 4) != 0 ? Float.NaN : f3;
        if ((i3 & 8) == 0) {
            f5 = f4;
        }
        String str2 = (i3 & 16) != 0 ? RootGroupName : str;
        long r5 = (i3 & 32) != 0 ? Color.Companion.m2857getUnspecified0d7_KjU() : j;
        int r7 = (i3 & 64) != 0 ? BlendMode.Companion.m2752getSrcIn0nO6VwU() : i;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-964365210, i4, -1, "androidx.compose.ui.graphics.vector.rememberVectorPainter (VectorPainter.kt:73)");
        }
        VectorPainter r0 = m3548rememberVectorPaintervIP8VLU(f, f2, f6, f5, str2, r5, r7, false, function4, composer, (i4 & 14) | 12582912 | (i4 & 112) | (i4 & 896) | (i4 & 7168) | (57344 & i4) | (458752 & i4) | (3670016 & i4) | ((i4 << 3) & 234881024), 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return r0;
    }

    /* renamed from: rememberVectorPainter-vIP8VLU  reason: not valid java name */
    public static final VectorPainter m3548rememberVectorPaintervIP8VLU(float f, float f2, float f3, float f4, String str, long j, int i, boolean z, Function4<? super Float, ? super Float, ? super Composer, ? super Integer, Unit> function4, Composer composer, int i2, int i3) {
        Composer composer2 = composer;
        int i4 = i2;
        int i5 = i3;
        Intrinsics.checkNotNullParameter(function4, "content");
        composer2.startReplaceableGroup(1068590786);
        ComposerKt.sourceInformation(composer2, "C(rememberVectorPainter)P(3:c#ui.unit.Dp,2:c#ui.unit.Dp,8,7,4,6:c#ui.graphics.Color,5:c#ui.graphics.BlendMode)126@5382L7,133@5685L187,*141@5885L28,146@6158L46:VectorPainter.kt#huu6hf");
        float f5 = Float.NaN;
        float f6 = (i5 & 4) != 0 ? Float.NaN : f3;
        if ((i5 & 8) == 0) {
            f5 = f4;
        }
        String str2 = (i5 & 16) != 0 ? RootGroupName : str;
        long r8 = (i5 & 32) != 0 ? Color.Companion.m2857getUnspecified0d7_KjU() : j;
        int r10 = (i5 & 64) != 0 ? BlendMode.Companion.m2752getSrcIn0nO6VwU() : i;
        boolean z2 = (i5 & 128) != 0 ? false : z;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1068590786, i4, -1, "androidx.compose.ui.graphics.vector.rememberVectorPainter (VectorPainter.kt:115)");
        }
        ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object consume = composer2.consume(CompositionLocalsKt.getLocalDensity());
        ComposerKt.sourceInformationMarkerEnd(composer);
        Density density = (Density) consume;
        float r11 = density.m5607toPx0680j_4(f);
        float r3 = density.m5607toPx0680j_4(f2);
        if (Float.isNaN(f6)) {
            f6 = r11;
        }
        if (Float.isNaN(f5)) {
            f5 = r3;
        }
        Color r12 = Color.m2811boximpl(r8);
        BlendMode r13 = BlendMode.m2720boximpl(r10);
        int i6 = i4 >> 15;
        composer2.startReplaceableGroup(511388516);
        ComposerKt.sourceInformation(composer2, "CC(remember)P(1,2):Composables.kt#9igjgp");
        boolean changed = composer2.changed((Object) r12) | composer2.changed((Object) r13);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = !Color.m2822equalsimpl0(r8, Color.Companion.m2857getUnspecified0d7_KjU()) ? ColorFilter.Companion.m2865tintxETnrds(r8, r10) : null;
            composer2.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        ColorFilter colorFilter = (ColorFilter) rememberedValue;
        composer2.startReplaceableGroup(-492369756);
        ComposerKt.sourceInformation(composer2, "CC(remember):Composables.kt#9igjgp");
        Object rememberedValue2 = composer.rememberedValue();
        if (rememberedValue2 == Composer.Companion.getEmpty()) {
            rememberedValue2 = new VectorPainter();
            composer2.updateRememberedValue(rememberedValue2);
        }
        composer.endReplaceableGroup();
        VectorPainter vectorPainter = (VectorPainter) rememberedValue2;
        vectorPainter.m3546setSizeuvyYCjk$ui_release(SizeKt.Size(r11, r3));
        vectorPainter.setAutoMirror$ui_release(z2);
        vectorPainter.setIntrinsicColorFilter$ui_release(colorFilter);
        vectorPainter.RenderVector$ui_release(str2, f6, f5, function4, composer, ((i4 >> 12) & 14) | 32768 | (i6 & 7168));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return vectorPainter;
    }

    public static final VectorPainter rememberVectorPainter(ImageVector imageVector, Composer composer, int i) {
        ImageVector imageVector2 = imageVector;
        Composer composer2 = composer;
        Intrinsics.checkNotNullParameter(imageVector, "image");
        composer.startReplaceableGroup(1413834416);
        ComposerKt.sourceInformation(composer, "C(rememberVectorPainter)158@6529L424:VectorPainter.kt#huu6hf");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1413834416, i, -1, "androidx.compose.ui.graphics.vector.rememberVectorPainter (VectorPainter.kt:157)");
        }
        VectorPainter r0 = m3548rememberVectorPaintervIP8VLU(imageVector.m3527getDefaultWidthD9Ej5fM(), imageVector.m3526getDefaultHeightD9Ej5fM(), imageVector.getViewportWidth(), imageVector.getViewportHeight(), imageVector.getName(), imageVector.m3529getTintColor0d7_KjU(), imageVector.m3528getTintBlendMode0nO6VwU(), imageVector.getAutoMirror(), ComposableLambdaKt.composableLambda(composer, 1873274766, true, new VectorPainterKt$rememberVectorPainter$3(imageVector)), composer, 100663296, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return r0;
    }

    public static final void RenderVectorGroup(VectorGroup vectorGroup, Map<String, ? extends VectorConfig> map, Composer composer, int i, int i2) {
        int i3;
        Map<String, ? extends VectorConfig> map2;
        Composer composer2;
        Map<String, ? extends VectorConfig> map3;
        Map<String, ? extends VectorConfig> map4;
        VectorGroup vectorGroup2 = vectorGroup;
        int i4 = i;
        int i5 = i2;
        Intrinsics.checkNotNullParameter(vectorGroup2, "group");
        Composer startRestartGroup = composer.startRestartGroup(-446179233);
        ComposerKt.sourceInformation(startRestartGroup, "C(RenderVectorGroup)P(1):VectorPainter.kt#huu6hf");
        if ((i5 & 1) != 0) {
            i3 = i4 | 6;
        } else if ((i4 & 14) == 0) {
            i3 = (startRestartGroup.changed((Object) vectorGroup2) ? 4 : 2) | i4;
        } else {
            i3 = i4;
        }
        int i6 = i5 & 2;
        if (i6 != 0) {
            i3 |= 16;
        }
        if (i6 == 2 && (i3 & 91) == 18 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
            map2 = map;
            composer2 = startRestartGroup;
        } else {
            Map<String, ? extends VectorConfig> emptyMap = i6 != 0 ? MapsKt.emptyMap() : map;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-446179233, i4, -1, "androidx.compose.ui.graphics.vector.RenderVectorGroup (VectorPainter.kt:327)");
            }
            Iterator<VectorNode> it = vectorGroup.iterator();
            while (it.hasNext()) {
                VectorNode next = it.next();
                if (next instanceof VectorPath) {
                    startRestartGroup.startReplaceableGroup(-326285735);
                    ComposerKt.sourceInformation(startRestartGroup, "334@12154L1719");
                    VectorPath vectorPath = (VectorPath) next;
                    VectorConfig vectorConfig = (VectorConfig) emptyMap.get(vectorPath.getName());
                    if (vectorConfig == null) {
                        vectorConfig = new VectorPainterKt$RenderVectorGroup$config$1();
                    }
                    VectorConfig vectorConfig2 = vectorConfig;
                    Iterator<VectorNode> it2 = it;
                    VectorConfig vectorConfig3 = vectorConfig2;
                    Composer composer3 = startRestartGroup;
                    VectorComposeKt.m3540Path9cdaXJ4((List) vectorConfig2.getOrDefault(VectorProperty.PathData.INSTANCE, vectorPath.getPathData()), vectorPath.m3549getPathFillTypeRgk1Os(), vectorPath.getName(), (Brush) vectorConfig2.getOrDefault(VectorProperty.Fill.INSTANCE, vectorPath.getFill()), ((Number) vectorConfig2.getOrDefault(VectorProperty.FillAlpha.INSTANCE, Float.valueOf(vectorPath.getFillAlpha()))).floatValue(), (Brush) vectorConfig2.getOrDefault(VectorProperty.Stroke.INSTANCE, vectorPath.getStroke()), ((Number) vectorConfig2.getOrDefault(VectorProperty.StrokeAlpha.INSTANCE, Float.valueOf(vectorPath.getStrokeAlpha()))).floatValue(), ((Number) vectorConfig2.getOrDefault(VectorProperty.StrokeLineWidth.INSTANCE, Float.valueOf(vectorPath.getStrokeLineWidth()))).floatValue(), vectorPath.m3550getStrokeLineCapKaPHkGw(), vectorPath.m3551getStrokeLineJoinLxFBmk8(), vectorPath.getStrokeLineMiter(), ((Number) vectorConfig3.getOrDefault(VectorProperty.TrimPathStart.INSTANCE, Float.valueOf(vectorPath.getTrimPathStart()))).floatValue(), ((Number) vectorConfig3.getOrDefault(VectorProperty.TrimPathEnd.INSTANCE, Float.valueOf(vectorPath.getTrimPathEnd()))).floatValue(), ((Number) vectorConfig3.getOrDefault(VectorProperty.TrimPathOffset.INSTANCE, Float.valueOf(vectorPath.getTrimPathOffset()))).floatValue(), composer3, 8, 0, 0);
                    composer3.endReplaceableGroup();
                    VectorGroup vectorGroup3 = vectorGroup;
                    it = it2;
                    map4 = emptyMap;
                    int i7 = i2;
                    startRestartGroup = composer3;
                } else {
                    Iterator<VectorNode> it3 = it;
                    Map<String, ? extends VectorConfig> map5 = emptyMap;
                    Composer composer4 = startRestartGroup;
                    if (next instanceof VectorGroup) {
                        composer4.startReplaceableGroup(-326283877);
                        ComposerKt.sourceInformation(composer4, "379@14012L1368");
                        VectorGroup vectorGroup4 = (VectorGroup) next;
                        map3 = map5;
                        VectorConfig vectorConfig4 = (VectorConfig) map3.get(vectorGroup4.getName());
                        if (vectorConfig4 == null) {
                            vectorConfig4 = new VectorPainterKt$RenderVectorGroup$config$2();
                        }
                        VectorComposeKt.Group(vectorGroup4.getName(), ((Number) vectorConfig4.getOrDefault(VectorProperty.Rotation.INSTANCE, Float.valueOf(vectorGroup4.getRotation()))).floatValue(), ((Number) vectorConfig4.getOrDefault(VectorProperty.PivotX.INSTANCE, Float.valueOf(vectorGroup4.getPivotX()))).floatValue(), ((Number) vectorConfig4.getOrDefault(VectorProperty.PivotY.INSTANCE, Float.valueOf(vectorGroup4.getPivotY()))).floatValue(), ((Number) vectorConfig4.getOrDefault(VectorProperty.ScaleX.INSTANCE, Float.valueOf(vectorGroup4.getScaleX()))).floatValue(), ((Number) vectorConfig4.getOrDefault(VectorProperty.ScaleY.INSTANCE, Float.valueOf(vectorGroup4.getScaleY()))).floatValue(), ((Number) vectorConfig4.getOrDefault(VectorProperty.TranslateX.INSTANCE, Float.valueOf(vectorGroup4.getTranslationX()))).floatValue(), ((Number) vectorConfig4.getOrDefault(VectorProperty.TranslateY.INSTANCE, Float.valueOf(vectorGroup4.getTranslationY()))).floatValue(), (List) vectorConfig4.getOrDefault(VectorProperty.PathData.INSTANCE, vectorGroup4.getClipPathData()), ComposableLambdaKt.composableLambda(composer4, 1450046638, true, new VectorPainterKt$RenderVectorGroup$1(next, map3)), composer4, 939524096, 0);
                        composer4.endReplaceableGroup();
                    } else {
                        map3 = map5;
                        composer4.startReplaceableGroup(-326282407);
                        composer4.endReplaceableGroup();
                    }
                    VectorGroup vectorGroup5 = vectorGroup;
                    int i8 = i2;
                    startRestartGroup = composer4;
                    map4 = map3;
                    it = it3;
                }
                int i9 = i;
            }
            map2 = emptyMap;
            composer2 = startRestartGroup;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new VectorPainterKt$RenderVectorGroup$2(vectorGroup, map2, i, i2));
        }
    }

    private static final void mirror(DrawScope drawScope, Function1<? super DrawScope, Unit> function1) {
        long r0 = drawScope.m3428getCenterF1C5BW0();
        DrawContext drawContext = drawScope.getDrawContext();
        long r3 = drawContext.m3372getSizeNHjbRc();
        drawContext.getCanvas().save();
        drawContext.getTransform().m3488scale0AR0LA0(-1.0f, 1.0f, r0);
        function1.invoke(drawScope);
        drawContext.getCanvas().restore();
        drawContext.m3373setSizeuvyYCjk(r3);
    }
}
