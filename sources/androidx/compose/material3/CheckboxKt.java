package androidx.compose.material3;

import androidx.compose.ui.geometry.CornerRadiusKt;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.PathEffect;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.Fill;
import androidx.compose.ui.graphics.drawscope.Stroke;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.util.MathHelpersKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000h\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aS\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0014\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\r2\b\b\u0002\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u0016H\u0007¢\u0006\u0002\u0010\u0017\u001a-\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0014H\u0003¢\u0006\u0002\u0010\u001b\u001aM\u0010\u001c\u001a\u00020\u000b2\u0006\u0010\u001d\u001a\u00020\u001a2\u000e\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u001f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\r2\b\b\u0002\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u0016H\u0007¢\u0006\u0002\u0010 \u001a9\u0010!\u001a\u00020\u000b*\u00020\"2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020$2\u0006\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020'H\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b)\u0010*\u001aA\u0010+\u001a\u00020\u000b*\u00020\"2\u0006\u0010,\u001a\u00020$2\u0006\u0010-\u001a\u00020'2\u0006\u0010.\u001a\u00020'2\u0006\u0010/\u001a\u00020'2\u0006\u00100\u001a\u000201H\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b2\u00103\"\u000e\u0010\u0000\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000\"\u0013\u0010\u0004\u001a\u00020\u0005X\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0006\"\u0013\u0010\u0007\u001a\u00020\u0005X\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0006\"\u0013\u0010\b\u001a\u00020\u0005X\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0006\"\u0013\u0010\t\u001a\u00020\u0005X\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0006\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u00064"}, d2 = {"BoxInDuration", "", "BoxOutDuration", "CheckAnimationDuration", "CheckboxDefaultPadding", "Landroidx/compose/ui/unit/Dp;", "F", "CheckboxSize", "RadiusSize", "StrokeWidth", "Checkbox", "", "checked", "", "onCheckedChange", "Lkotlin/Function1;", "modifier", "Landroidx/compose/ui/Modifier;", "enabled", "colors", "Landroidx/compose/material3/CheckboxColors;", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "(ZLkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZLandroidx/compose/material3/CheckboxColors;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/Composer;II)V", "CheckboxImpl", "value", "Landroidx/compose/ui/state/ToggleableState;", "(ZLandroidx/compose/ui/state/ToggleableState;Landroidx/compose/ui/Modifier;Landroidx/compose/material3/CheckboxColors;Landroidx/compose/runtime/Composer;I)V", "TriStateCheckbox", "state", "onClick", "Lkotlin/Function0;", "(Landroidx/compose/ui/state/ToggleableState;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZLandroidx/compose/material3/CheckboxColors;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/Composer;II)V", "drawBox", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "boxColor", "Landroidx/compose/ui/graphics/Color;", "borderColor", "radius", "", "strokeWidth", "drawBox-1wkBAMs", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;JJFF)V", "drawCheck", "checkColor", "checkFraction", "crossCenterGravitation", "strokeWidthPx", "drawingCache", "Landroidx/compose/material3/CheckDrawingCache;", "drawCheck-3IgeMak", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;JFFFLandroidx/compose/material3/CheckDrawingCache;)V", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: Checkbox.kt */
public final class CheckboxKt {
    private static final int BoxInDuration = 50;
    private static final int BoxOutDuration = 100;
    private static final int CheckAnimationDuration = 100;
    private static final float CheckboxDefaultPadding;
    private static final float CheckboxSize = Dp.m5626constructorimpl((float) 20);
    /* access modifiers changed from: private */
    public static final float RadiusSize;
    /* access modifiers changed from: private */
    public static final float StrokeWidth;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* compiled from: Checkbox.kt */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|2|3|4|5|6|7|9) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        static {
            /*
                androidx.compose.ui.state.ToggleableState[] r0 = androidx.compose.ui.state.ToggleableState.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                androidx.compose.ui.state.ToggleableState r1 = androidx.compose.ui.state.ToggleableState.On     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                androidx.compose.ui.state.ToggleableState r1 = androidx.compose.ui.state.ToggleableState.Off     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                androidx.compose.ui.state.ToggleableState r1 = androidx.compose.ui.state.ToggleableState.Indeterminate     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                $EnumSwitchMapping$0 = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.CheckboxKt.WhenMappings.<clinit>():void");
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:112:0x01db  */
    /* JADX WARNING: Removed duplicated region for block: B:114:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0081  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0096  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x009e  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00a4  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00c6  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x00ce  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void Checkbox(boolean r29, kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> r30, androidx.compose.ui.Modifier r31, boolean r32, androidx.compose.material3.CheckboxColors r33, androidx.compose.foundation.interaction.MutableInteractionSource r34, androidx.compose.runtime.Composer r35, int r36, int r37) {
        /*
            r1 = r29
            r2 = r30
            r7 = r36
            r0 = -1406741137(0xffffffffac26d56f, float:-2.3708498E-12)
            r3 = r35
            androidx.compose.runtime.Composer r3 = r3.startRestartGroup(r0)
            java.lang.String r4 = "C(Checkbox)P(!1,5,4,2)92@4250L8,93@4310L39,95@4358L328:Checkbox.kt#uh7d8r"
            androidx.compose.runtime.ComposerKt.sourceInformation(r3, r4)
            r4 = r37 & 1
            if (r4 == 0) goto L_0x001b
            r4 = r7 | 6
            goto L_0x002b
        L_0x001b:
            r4 = r7 & 14
            if (r4 != 0) goto L_0x002a
            boolean r4 = r3.changed((boolean) r1)
            if (r4 == 0) goto L_0x0027
            r4 = 4
            goto L_0x0028
        L_0x0027:
            r4 = 2
        L_0x0028:
            r4 = r4 | r7
            goto L_0x002b
        L_0x002a:
            r4 = r7
        L_0x002b:
            r5 = r37 & 2
            if (r5 == 0) goto L_0x0032
            r4 = r4 | 48
            goto L_0x0042
        L_0x0032:
            r5 = r7 & 112(0x70, float:1.57E-43)
            if (r5 != 0) goto L_0x0042
            boolean r5 = r3.changedInstance(r2)
            if (r5 == 0) goto L_0x003f
            r5 = 32
            goto L_0x0041
        L_0x003f:
            r5 = 16
        L_0x0041:
            r4 = r4 | r5
        L_0x0042:
            r5 = r37 & 4
            if (r5 == 0) goto L_0x0049
            r4 = r4 | 384(0x180, float:5.38E-43)
            goto L_0x005c
        L_0x0049:
            r6 = r7 & 896(0x380, float:1.256E-42)
            if (r6 != 0) goto L_0x005c
            r6 = r31
            boolean r8 = r3.changed((java.lang.Object) r6)
            if (r8 == 0) goto L_0x0058
            r8 = 256(0x100, float:3.59E-43)
            goto L_0x005a
        L_0x0058:
            r8 = 128(0x80, float:1.794E-43)
        L_0x005a:
            r4 = r4 | r8
            goto L_0x005e
        L_0x005c:
            r6 = r31
        L_0x005e:
            r8 = r37 & 8
            if (r8 == 0) goto L_0x0065
            r4 = r4 | 3072(0xc00, float:4.305E-42)
            goto L_0x0078
        L_0x0065:
            r9 = r7 & 7168(0x1c00, float:1.0045E-41)
            if (r9 != 0) goto L_0x0078
            r9 = r32
            boolean r10 = r3.changed((boolean) r9)
            if (r10 == 0) goto L_0x0074
            r10 = 2048(0x800, float:2.87E-42)
            goto L_0x0076
        L_0x0074:
            r10 = 1024(0x400, float:1.435E-42)
        L_0x0076:
            r4 = r4 | r10
            goto L_0x007a
        L_0x0078:
            r9 = r32
        L_0x007a:
            r24 = 57344(0xe000, float:8.0356E-41)
            r10 = r7 & r24
            if (r10 != 0) goto L_0x0096
            r10 = r37 & 16
            if (r10 != 0) goto L_0x0090
            r10 = r33
            boolean r11 = r3.changed((java.lang.Object) r10)
            if (r11 == 0) goto L_0x0092
            r11 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0094
        L_0x0090:
            r10 = r33
        L_0x0092:
            r11 = 8192(0x2000, float:1.14794E-41)
        L_0x0094:
            r4 = r4 | r11
            goto L_0x0098
        L_0x0096:
            r10 = r33
        L_0x0098:
            r25 = r37 & 32
            r26 = 458752(0x70000, float:6.42848E-40)
            if (r25 == 0) goto L_0x00a4
            r11 = 196608(0x30000, float:2.75506E-40)
            r4 = r4 | r11
            r15 = r34
            goto L_0x00b6
        L_0x00a4:
            r11 = r7 & r26
            r15 = r34
            if (r11 != 0) goto L_0x00b6
            boolean r11 = r3.changed((java.lang.Object) r15)
            if (r11 == 0) goto L_0x00b3
            r11 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00b5
        L_0x00b3:
            r11 = 65536(0x10000, float:9.18355E-41)
        L_0x00b5:
            r4 = r4 | r11
        L_0x00b6:
            r11 = 374491(0x5b6db, float:5.24774E-40)
            r11 = r11 & r4
            r12 = 74898(0x12492, float:1.04954E-40)
            if (r11 != r12) goto L_0x00ce
            boolean r11 = r3.getSkipping()
            if (r11 != 0) goto L_0x00c6
            goto L_0x00ce
        L_0x00c6:
            r3.skipToGroupEnd()
            r5 = r6
            r4 = r9
            r6 = r15
            goto L_0x01d4
        L_0x00ce:
            r3.startDefaults()
            r11 = r7 & 1
            r27 = -57345(0xffffffffffff1fff, float:NaN)
            if (r11 == 0) goto L_0x00f0
            boolean r11 = r3.getDefaultsInvalid()
            if (r11 == 0) goto L_0x00df
            goto L_0x00f0
        L_0x00df:
            r3.skipToGroupEnd()
            r5 = r37 & 16
            if (r5 == 0) goto L_0x00e8
            r4 = r4 & r27
        L_0x00e8:
            r8 = r4
            r5 = r6
            r6 = r9
            r4 = r10
            r17 = r15
            goto L_0x0152
        L_0x00f0:
            if (r5 == 0) goto L_0x00f7
            androidx.compose.ui.Modifier$Companion r5 = androidx.compose.ui.Modifier.Companion
            androidx.compose.ui.Modifier r5 = (androidx.compose.ui.Modifier) r5
            goto L_0x00f8
        L_0x00f7:
            r5 = r6
        L_0x00f8:
            if (r8 == 0) goto L_0x00fc
            r6 = 1
            goto L_0x00fd
        L_0x00fc:
            r6 = r9
        L_0x00fd:
            r8 = r37 & 16
            if (r8 == 0) goto L_0x0122
            androidx.compose.material3.CheckboxDefaults r8 = androidx.compose.material3.CheckboxDefaults.INSTANCE
            r9 = 0
            r11 = 0
            r13 = 0
            r16 = 0
            r18 = 0
            r20 = 0
            r22 = 1572864(0x180000, float:2.204052E-39)
            r23 = 63
            r15 = r16
            r17 = r18
            r19 = r20
            r21 = r3
            androidx.compose.material3.CheckboxColors r8 = r8.m1168colors5tl4gsc(r9, r11, r13, r15, r17, r19, r21, r22, r23)
            r4 = r4 & r27
            goto L_0x0123
        L_0x0122:
            r8 = r10
        L_0x0123:
            if (r25 == 0) goto L_0x014b
            r9 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r3.startReplaceableGroup(r9)
            java.lang.String r9 = "CC(remember):Composables.kt#9igjgp"
            androidx.compose.runtime.ComposerKt.sourceInformation(r3, r9)
            java.lang.Object r9 = r3.rememberedValue()
            androidx.compose.runtime.Composer$Companion r10 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r10 = r10.getEmpty()
            if (r9 != r10) goto L_0x0143
            androidx.compose.foundation.interaction.MutableInteractionSource r9 = androidx.compose.foundation.interaction.InteractionSourceKt.MutableInteractionSource()
            r3.updateRememberedValue(r9)
        L_0x0143:
            r3.endReplaceableGroup()
            androidx.compose.foundation.interaction.MutableInteractionSource r9 = (androidx.compose.foundation.interaction.MutableInteractionSource) r9
            r17 = r9
            goto L_0x014d
        L_0x014b:
            r17 = r34
        L_0x014d:
            r28 = r8
            r8 = r4
            r4 = r28
        L_0x0152:
            r3.endDefaults()
            boolean r9 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r9 == 0) goto L_0x0162
            r9 = -1
            java.lang.String r10 = "androidx.compose.material3.Checkbox (Checkbox.kt:87)"
            androidx.compose.runtime.ComposerKt.traceEventStart(r0, r8, r9, r10)
        L_0x0162:
            androidx.compose.ui.state.ToggleableState r0 = androidx.compose.ui.state.ToggleableStateKt.ToggleableState(r29)
            r9 = 1557792622(0x5cda076e, float:4.90957712E17)
            r3.startReplaceableGroup(r9)
            java.lang.String r9 = "98@4479L29"
            androidx.compose.runtime.ComposerKt.sourceInformation(r3, r9)
            if (r2 == 0) goto L_0x01ab
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r29)
            r10 = 511388516(0x1e7b2b64, float:1.3296802E-20)
            r3.startReplaceableGroup(r10)
            java.lang.String r10 = "CC(remember)P(1,2):Composables.kt#9igjgp"
            androidx.compose.runtime.ComposerKt.sourceInformation(r3, r10)
            boolean r10 = r3.changed((java.lang.Object) r2)
            boolean r9 = r3.changed((java.lang.Object) r9)
            r9 = r9 | r10
            java.lang.Object r10 = r3.rememberedValue()
            if (r9 != 0) goto L_0x0199
            androidx.compose.runtime.Composer$Companion r9 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r9 = r9.getEmpty()
            if (r10 != r9) goto L_0x01a4
        L_0x0199:
            androidx.compose.material3.CheckboxKt$Checkbox$2$1 r9 = new androidx.compose.material3.CheckboxKt$Checkbox$2$1
            r9.<init>(r2, r1)
            r10 = r9
            kotlin.jvm.functions.Function0 r10 = (kotlin.jvm.functions.Function0) r10
            r3.updateRememberedValue(r10)
        L_0x01a4:
            r3.endReplaceableGroup()
            kotlin.jvm.functions.Function0 r10 = (kotlin.jvm.functions.Function0) r10
            r9 = r10
            goto L_0x01ac
        L_0x01ab:
            r9 = 0
        L_0x01ac:
            r3.endReplaceableGroup()
            r10 = r8 & 896(0x380, float:1.256E-42)
            r11 = r8 & 7168(0x1c00, float:1.0045E-41)
            r10 = r10 | r11
            r11 = r8 & r24
            r10 = r10 | r11
            r8 = r8 & r26
            r15 = r10 | r8
            r16 = 0
            r8 = r0
            r10 = r5
            r11 = r6
            r12 = r4
            r13 = r17
            r14 = r3
            TriStateCheckbox(r8, r9, r10, r11, r12, r13, r14, r15, r16)
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto L_0x01d0
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L_0x01d0:
            r10 = r4
            r4 = r6
            r6 = r17
        L_0x01d4:
            androidx.compose.runtime.ScopeUpdateScope r9 = r3.endRestartGroup()
            if (r9 != 0) goto L_0x01db
            goto L_0x01f0
        L_0x01db:
            androidx.compose.material3.CheckboxKt$Checkbox$3 r11 = new androidx.compose.material3.CheckboxKt$Checkbox$3
            r0 = r11
            r1 = r29
            r2 = r30
            r3 = r5
            r5 = r10
            r7 = r36
            r8 = r37
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            kotlin.jvm.functions.Function2 r11 = (kotlin.jvm.functions.Function2) r11
            r9.updateScope(r11)
        L_0x01f0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.CheckboxKt.Checkbox(boolean, kotlin.jvm.functions.Function1, androidx.compose.ui.Modifier, boolean, androidx.compose.material3.CheckboxColors, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:102:0x01c3  */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x01cc  */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x01fd  */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x020e  */
    /* JADX WARNING: Removed duplicated region for block: B:112:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x009c  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00a2  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00a8  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00cb  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x00d5  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x016c  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x0180  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x01b7  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void TriStateCheckbox(androidx.compose.ui.state.ToggleableState r28, kotlin.jvm.functions.Function0<kotlin.Unit> r29, androidx.compose.ui.Modifier r30, boolean r31, androidx.compose.material3.CheckboxColors r32, androidx.compose.foundation.interaction.MutableInteractionSource r33, androidx.compose.runtime.Composer r34, int r35, int r36) {
        /*
            r7 = r28
            r8 = r29
            r9 = r35
            java.lang.String r0 = "state"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            r0 = -1608358065(0xffffffffa022674f, float:-1.3756116E-19)
            r1 = r34
            androidx.compose.runtime.Composer r6 = r1.startRestartGroup(r0)
            java.lang.String r1 = "C(TriStateCheckbox)P(5,4,3,1)142@6643L8,143@6703L39,161@7271L412:Checkbox.kt#uh7d8r"
            androidx.compose.runtime.ComposerKt.sourceInformation(r6, r1)
            r1 = r36 & 1
            r2 = 2
            if (r1 == 0) goto L_0x0022
            r1 = r9 | 6
            goto L_0x0032
        L_0x0022:
            r1 = r9 & 14
            if (r1 != 0) goto L_0x0031
            boolean r1 = r6.changed((java.lang.Object) r7)
            if (r1 == 0) goto L_0x002e
            r1 = 4
            goto L_0x002f
        L_0x002e:
            r1 = r2
        L_0x002f:
            r1 = r1 | r9
            goto L_0x0032
        L_0x0031:
            r1 = r9
        L_0x0032:
            r3 = r36 & 2
            if (r3 == 0) goto L_0x0039
            r1 = r1 | 48
            goto L_0x0049
        L_0x0039:
            r3 = r9 & 112(0x70, float:1.57E-43)
            if (r3 != 0) goto L_0x0049
            boolean r3 = r6.changedInstance(r8)
            if (r3 == 0) goto L_0x0046
            r3 = 32
            goto L_0x0048
        L_0x0046:
            r3 = 16
        L_0x0048:
            r1 = r1 | r3
        L_0x0049:
            r3 = r36 & 4
            if (r3 == 0) goto L_0x0050
            r1 = r1 | 384(0x180, float:5.38E-43)
            goto L_0x0063
        L_0x0050:
            r4 = r9 & 896(0x380, float:1.256E-42)
            if (r4 != 0) goto L_0x0063
            r4 = r30
            boolean r5 = r6.changed((java.lang.Object) r4)
            if (r5 == 0) goto L_0x005f
            r5 = 256(0x100, float:3.59E-43)
            goto L_0x0061
        L_0x005f:
            r5 = 128(0x80, float:1.794E-43)
        L_0x0061:
            r1 = r1 | r5
            goto L_0x0065
        L_0x0063:
            r4 = r30
        L_0x0065:
            r5 = r36 & 8
            if (r5 == 0) goto L_0x006c
            r1 = r1 | 3072(0xc00, float:4.305E-42)
            goto L_0x007f
        L_0x006c:
            r10 = r9 & 7168(0x1c00, float:1.0045E-41)
            if (r10 != 0) goto L_0x007f
            r10 = r31
            boolean r11 = r6.changed((boolean) r10)
            if (r11 == 0) goto L_0x007b
            r11 = 2048(0x800, float:2.87E-42)
            goto L_0x007d
        L_0x007b:
            r11 = 1024(0x400, float:1.435E-42)
        L_0x007d:
            r1 = r1 | r11
            goto L_0x0081
        L_0x007f:
            r10 = r31
        L_0x0081:
            r11 = 57344(0xe000, float:8.0356E-41)
            r11 = r11 & r9
            if (r11 != 0) goto L_0x009c
            r11 = r36 & 16
            if (r11 != 0) goto L_0x0096
            r11 = r32
            boolean r12 = r6.changed((java.lang.Object) r11)
            if (r12 == 0) goto L_0x0098
            r12 = 16384(0x4000, float:2.2959E-41)
            goto L_0x009a
        L_0x0096:
            r11 = r32
        L_0x0098:
            r12 = 8192(0x2000, float:1.14794E-41)
        L_0x009a:
            r1 = r1 | r12
            goto L_0x009e
        L_0x009c:
            r11 = r32
        L_0x009e:
            r26 = r36 & 32
            if (r26 == 0) goto L_0x00a8
            r12 = 196608(0x30000, float:2.75506E-40)
            r1 = r1 | r12
            r15 = r33
            goto L_0x00bb
        L_0x00a8:
            r12 = 458752(0x70000, float:6.42848E-40)
            r12 = r12 & r9
            r15 = r33
            if (r12 != 0) goto L_0x00bb
            boolean r12 = r6.changed((java.lang.Object) r15)
            if (r12 == 0) goto L_0x00b8
            r12 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00ba
        L_0x00b8:
            r12 = 65536(0x10000, float:9.18355E-41)
        L_0x00ba:
            r1 = r1 | r12
        L_0x00bb:
            r12 = 374491(0x5b6db, float:5.24774E-40)
            r12 = r12 & r1
            r13 = 74898(0x12492, float:1.04954E-40)
            if (r12 != r13) goto L_0x00d5
            boolean r12 = r6.getSkipping()
            if (r12 != 0) goto L_0x00cb
            goto L_0x00d5
        L_0x00cb:
            r6.skipToGroupEnd()
            r3 = r4
            r4 = r10
            r5 = r11
            r10 = r6
            r6 = r15
            goto L_0x0207
        L_0x00d5:
            r6.startDefaults()
            r12 = r9 & 1
            r27 = -57345(0xffffffffffff1fff, float:NaN)
            if (r12 == 0) goto L_0x00f9
            boolean r12 = r6.getDefaultsInvalid()
            if (r12 == 0) goto L_0x00e6
            goto L_0x00f9
        L_0x00e6:
            r6.skipToGroupEnd()
            r3 = r36 & 16
            if (r3 == 0) goto L_0x00ef
            r1 = r1 & r27
        L_0x00ef:
            r5 = r4
            r17 = r10
            r18 = r11
            r19 = r15
        L_0x00f6:
            r4 = r1
            goto L_0x0163
        L_0x00f9:
            if (r3 == 0) goto L_0x0100
            androidx.compose.ui.Modifier$Companion r3 = androidx.compose.ui.Modifier.Companion
            androidx.compose.ui.Modifier r3 = (androidx.compose.ui.Modifier) r3
            goto L_0x0101
        L_0x0100:
            r3 = r4
        L_0x0101:
            if (r5 == 0) goto L_0x0105
            r4 = 1
            goto L_0x0106
        L_0x0105:
            r4 = r10
        L_0x0106:
            r5 = r36 & 16
            if (r5 == 0) goto L_0x012d
            androidx.compose.material3.CheckboxDefaults r10 = androidx.compose.material3.CheckboxDefaults.INSTANCE
            r11 = 0
            r13 = 0
            r16 = 0
            r18 = 0
            r20 = 0
            r22 = 0
            r24 = 1572864(0x180000, float:2.204052E-39)
            r25 = 63
            r15 = r16
            r17 = r18
            r19 = r20
            r21 = r22
            r23 = r6
            androidx.compose.material3.CheckboxColors r5 = r10.m1168colors5tl4gsc(r11, r13, r15, r17, r19, r21, r23, r24, r25)
            r1 = r1 & r27
            r11 = r5
        L_0x012d:
            if (r26 == 0) goto L_0x015b
            r5 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r6.startReplaceableGroup(r5)
            java.lang.String r5 = "CC(remember):Composables.kt#9igjgp"
            androidx.compose.runtime.ComposerKt.sourceInformation(r6, r5)
            java.lang.Object r5 = r6.rememberedValue()
            androidx.compose.runtime.Composer$Companion r10 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r10 = r10.getEmpty()
            if (r5 != r10) goto L_0x014d
            androidx.compose.foundation.interaction.MutableInteractionSource r5 = androidx.compose.foundation.interaction.InteractionSourceKt.MutableInteractionSource()
            r6.updateRememberedValue(r5)
        L_0x014d:
            r6.endReplaceableGroup()
            androidx.compose.foundation.interaction.MutableInteractionSource r5 = (androidx.compose.foundation.interaction.MutableInteractionSource) r5
            r17 = r4
            r19 = r5
            r18 = r11
            r4 = r1
            r5 = r3
            goto L_0x0163
        L_0x015b:
            r19 = r33
            r5 = r3
            r17 = r4
            r18 = r11
            goto L_0x00f6
        L_0x0163:
            r6.endDefaults()
            boolean r1 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r1 == 0) goto L_0x0173
            r1 = -1
            java.lang.String r3 = "androidx.compose.material3.TriStateCheckbox (Checkbox.kt:137)"
            androidx.compose.runtime.ComposerKt.traceEventStart(r0, r4, r1, r3)
        L_0x0173:
            r0 = 1797978260(0x6b2af894, float:2.0669127E26)
            r6.startReplaceableGroup(r0)
            java.lang.String r0 = "153@7071L133"
            androidx.compose.runtime.ComposerKt.sourceInformation(r6, r0)
            if (r8 == 0) goto L_0x01b7
            androidx.compose.ui.Modifier$Companion r0 = androidx.compose.ui.Modifier.Companion
            androidx.compose.ui.semantics.Role$Companion r1 = androidx.compose.ui.semantics.Role.Companion
            int r1 = r1.m4971getCheckboxo7Vup1c()
            r10 = 0
            androidx.compose.material3.tokens.CheckboxTokens r3 = androidx.compose.material3.tokens.CheckboxTokens.INSTANCE
            float r3 = r3.m1888getStateLayerSizeD9Ej5fM()
            float r2 = (float) r2
            float r3 = r3 / r2
            float r11 = androidx.compose.ui.unit.Dp.m5626constructorimpl(r3)
            r12 = 0
            r15 = 54
            r16 = 4
            r14 = r6
            androidx.compose.foundation.Indication r3 = androidx.compose.material.ripple.RippleKt.m1106rememberRipple9IZ8Weo(r10, r11, r12, r14, r15, r16)
            androidx.compose.ui.Modifier r0 = (androidx.compose.ui.Modifier) r0
            androidx.compose.ui.semantics.Role r10 = androidx.compose.ui.semantics.Role.m4963boximpl(r1)
            r1 = r28
            r2 = r19
            r11 = r4
            r4 = r17
            r12 = r5
            r5 = r10
            r10 = r6
            r6 = r29
            androidx.compose.ui.Modifier r0 = androidx.compose.foundation.selection.ToggleableKt.m820triStateToggleableO2vRcR0(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x01be
        L_0x01b7:
            r11 = r4
            r12 = r5
            r10 = r6
            androidx.compose.ui.Modifier$Companion r0 = androidx.compose.ui.Modifier.Companion
            androidx.compose.ui.Modifier r0 = (androidx.compose.ui.Modifier) r0
        L_0x01be:
            r10.endReplaceableGroup()
            if (r8 == 0) goto L_0x01cc
            androidx.compose.ui.Modifier$Companion r1 = androidx.compose.ui.Modifier.Companion
            androidx.compose.ui.Modifier r1 = (androidx.compose.ui.Modifier) r1
            androidx.compose.ui.Modifier r1 = androidx.compose.material3.InteractiveComponentSizeKt.minimumInteractiveComponentSize(r1)
            goto L_0x01d0
        L_0x01cc:
            androidx.compose.ui.Modifier$Companion r1 = androidx.compose.ui.Modifier.Companion
            androidx.compose.ui.Modifier r1 = (androidx.compose.ui.Modifier) r1
        L_0x01d0:
            androidx.compose.ui.Modifier r1 = r12.then(r1)
            androidx.compose.ui.Modifier r0 = r1.then(r0)
            float r1 = CheckboxDefaultPadding
            androidx.compose.ui.Modifier r2 = androidx.compose.foundation.layout.PaddingKt.m493padding3ABfNKs(r0, r1)
            int r0 = r11 >> 9
            r0 = r0 & 14
            int r1 = r11 << 3
            r1 = r1 & 112(0x70, float:1.57E-43)
            r0 = r0 | r1
            int r1 = r11 >> 3
            r1 = r1 & 7168(0x1c00, float:1.0045E-41)
            r5 = r0 | r1
            r0 = r17
            r1 = r28
            r3 = r18
            r4 = r10
            CheckboxImpl(r0, r1, r2, r3, r4, r5)
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto L_0x0200
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L_0x0200:
            r3 = r12
            r4 = r17
            r5 = r18
            r6 = r19
        L_0x0207:
            androidx.compose.runtime.ScopeUpdateScope r10 = r10.endRestartGroup()
            if (r10 != 0) goto L_0x020e
            goto L_0x0221
        L_0x020e:
            androidx.compose.material3.CheckboxKt$TriStateCheckbox$2 r11 = new androidx.compose.material3.CheckboxKt$TriStateCheckbox$2
            r0 = r11
            r1 = r28
            r2 = r29
            r7 = r35
            r8 = r36
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            kotlin.jvm.functions.Function2 r11 = (kotlin.jvm.functions.Function2) r11
            r10.updateScope(r11)
        L_0x0221:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.CheckboxKt.TriStateCheckbox(androidx.compose.ui.state.ToggleableState, kotlin.jvm.functions.Function0, androidx.compose.ui.Modifier, boolean, androidx.compose.material3.CheckboxColors, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v20, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v38, resolved type: androidx.compose.material3.CheckDrawingCache} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v12, resolved type: androidx.compose.material3.CheckDrawingCache} */
    /* JADX WARNING: type inference failed for: r6v21 */
    /* access modifiers changed from: private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00ed  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0109  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x010f  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x011b  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0133  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x01ab  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x01b1  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x01c0  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x01cc  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x01d4  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x01f0  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x0204  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x0207  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void CheckboxImpl(boolean r35, androidx.compose.ui.state.ToggleableState r36, androidx.compose.ui.Modifier r37, androidx.compose.material3.CheckboxColors r38, androidx.compose.runtime.Composer r39, int r40) {
        /*
            r1 = r35
            r2 = r36
            r3 = r37
            r4 = r38
            r5 = r40
            r0 = 2007131616(0x77a265e0, float:6.5876434E33)
            r6 = r39
            androidx.compose.runtime.Composer r14 = r6.startRestartGroup(r0)
            java.lang.String r6 = "C(CheckboxImpl)P(1,3,2)235@10358L23,236@10421L443,252@10923L458,267@11403L32,268@11464L21,269@11512L24,270@11566L27,275@11716L538,271@11598L656:Checkbox.kt#uh7d8r"
            androidx.compose.runtime.ComposerKt.sourceInformation(r14, r6)
            r6 = r5 & 14
            r15 = 2
            if (r6 != 0) goto L_0x0028
            boolean r6 = r14.changed((boolean) r1)
            if (r6 == 0) goto L_0x0025
            r6 = 4
            goto L_0x0026
        L_0x0025:
            r6 = r15
        L_0x0026:
            r6 = r6 | r5
            goto L_0x0029
        L_0x0028:
            r6 = r5
        L_0x0029:
            r7 = r5 & 112(0x70, float:1.57E-43)
            if (r7 != 0) goto L_0x0039
            boolean r7 = r14.changed((java.lang.Object) r2)
            if (r7 == 0) goto L_0x0036
            r7 = 32
            goto L_0x0038
        L_0x0036:
            r7 = 16
        L_0x0038:
            r6 = r6 | r7
        L_0x0039:
            r7 = r5 & 896(0x380, float:1.256E-42)
            if (r7 != 0) goto L_0x0049
            boolean r7 = r14.changed((java.lang.Object) r3)
            if (r7 == 0) goto L_0x0046
            r7 = 256(0x100, float:3.59E-43)
            goto L_0x0048
        L_0x0046:
            r7 = 128(0x80, float:1.794E-43)
        L_0x0048:
            r6 = r6 | r7
        L_0x0049:
            r7 = r5 & 7168(0x1c00, float:1.0045E-41)
            if (r7 != 0) goto L_0x0059
            boolean r7 = r14.changed((java.lang.Object) r4)
            if (r7 == 0) goto L_0x0056
            r7 = 2048(0x800, float:2.87E-42)
            goto L_0x0058
        L_0x0056:
            r7 = 1024(0x400, float:1.435E-42)
        L_0x0058:
            r6 = r6 | r7
        L_0x0059:
            r13 = r6
            r6 = r13 & 5851(0x16db, float:8.199E-42)
            r7 = 1170(0x492, float:1.64E-42)
            if (r6 != r7) goto L_0x006c
            boolean r6 = r14.getSkipping()
            if (r6 != 0) goto L_0x0067
            goto L_0x006c
        L_0x0067:
            r14.skipToGroupEnd()
            goto L_0x02f6
        L_0x006c:
            boolean r6 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            r12 = -1
            if (r6 == 0) goto L_0x0079
            java.lang.String r6 = "androidx.compose.material3.CheckboxImpl (Checkbox.kt:229)"
            androidx.compose.runtime.ComposerKt.traceEventStart(r0, r13, r12, r6)
        L_0x0079:
            int r0 = r13 >> 3
            r11 = r0 & 14
            r10 = 0
            androidx.compose.animation.core.Transition r16 = androidx.compose.animation.core.TransitionKt.updateTransition(r2, (java.lang.String) r10, (androidx.compose.runtime.Composer) r14, (int) r11, (int) r15)
            androidx.compose.material3.CheckboxKt$CheckboxImpl$checkDrawFraction$1 r6 = androidx.compose.material3.CheckboxKt$CheckboxImpl$checkDrawFraction$1.INSTANCE
            kotlin.jvm.functions.Function3 r6 = (kotlin.jvm.functions.Function3) r6
            r9 = -1338768149(0xffffffffb03404eb, float:-6.549061E-10)
            r14.startReplaceableGroup(r9)
            java.lang.String r8 = "CC(animateFloat)P(2)938@37489L78:Transition.kt#pdpnli"
            androidx.compose.runtime.ComposerKt.sourceInformation(r14, r8)
            java.lang.String r17 = "FloatAnimation"
            kotlin.jvm.internal.FloatCompanionObject r7 = kotlin.jvm.internal.FloatCompanionObject.INSTANCE
            androidx.compose.animation.core.TwoWayConverter r18 = androidx.compose.animation.core.VectorConvertersKt.getVectorConverter((kotlin.jvm.internal.FloatCompanionObject) r7)
            r7 = -142660079(0xfffffffff77f2e11, float:-5.1756642E33)
            r14.startReplaceableGroup(r7)
            r39 = r13
            java.lang.String r13 = "CC(animateValue)P(3,2)856@34079L32,857@34134L31,858@34190L23,860@34226L89:Transition.kt#pdpnli"
            androidx.compose.runtime.ComposerKt.sourceInformation(r14, r13)
            java.lang.Object r19 = r16.getCurrentState()
            androidx.compose.ui.state.ToggleableState r19 = (androidx.compose.ui.state.ToggleableState) r19
            r7 = 1800065638(0x6b4ad266, float:2.451966E26)
            r14.startReplaceableGroup(r7)
            r21 = r13
            java.lang.String r13 = "C:Checkbox.kt#uh7d8r"
            androidx.compose.runtime.ComposerKt.sourceInformation(r14, r13)
            boolean r22 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            java.lang.String r9 = "androidx.compose.material3.CheckboxImpl.<anonymous> (Checkbox.kt:244)"
            r15 = 0
            if (r22 == 0) goto L_0x00c6
            androidx.compose.runtime.ComposerKt.traceEventStart(r7, r15, r12, r9)
        L_0x00c6:
            int[] r22 = androidx.compose.material3.CheckboxKt.WhenMappings.$EnumSwitchMapping$0
            int r19 = r19.ordinal()
            r10 = r22[r19]
            r12 = 1
            r15 = 3
            r23 = 0
            r24 = 1065353216(0x3f800000, float:1.0)
            if (r10 == r12) goto L_0x00e5
            r12 = 2
            if (r10 == r12) goto L_0x00e2
            if (r10 != r15) goto L_0x00dc
            goto L_0x00e5
        L_0x00dc:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x00e2:
            r10 = r23
            goto L_0x00e7
        L_0x00e5:
            r10 = r24
        L_0x00e7:
            boolean r12 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r12 == 0) goto L_0x00f0
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L_0x00f0:
            r14.endReplaceableGroup()
            java.lang.Float r10 = java.lang.Float.valueOf(r10)
            java.lang.Object r12 = r16.getTargetState()
            androidx.compose.ui.state.ToggleableState r12 = (androidx.compose.ui.state.ToggleableState) r12
            r14.startReplaceableGroup(r7)
            androidx.compose.runtime.ComposerKt.sourceInformation(r14, r13)
            boolean r25 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r25 == 0) goto L_0x010f
            r5 = 0
            r15 = -1
            androidx.compose.runtime.ComposerKt.traceEventStart(r7, r5, r15, r9)
            goto L_0x0110
        L_0x010f:
            r15 = -1
        L_0x0110:
            int[] r5 = androidx.compose.material3.CheckboxKt.WhenMappings.$EnumSwitchMapping$0
            int r7 = r12.ordinal()
            r5 = r5[r7]
            r12 = 1
            if (r5 == r12) goto L_0x012b
            r7 = 2
            if (r5 == r7) goto L_0x0128
            r7 = 3
            if (r5 != r7) goto L_0x0122
            goto L_0x012b
        L_0x0122:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x0128:
            r5 = r23
            goto L_0x012d
        L_0x012b:
            r5 = r24
        L_0x012d:
            boolean r7 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r7 == 0) goto L_0x0136
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L_0x0136:
            r14.endReplaceableGroup()
            java.lang.Float r5 = java.lang.Float.valueOf(r5)
            androidx.compose.animation.core.Transition$Segment r7 = r16.getSegment()
            r9 = 0
            java.lang.Integer r12 = java.lang.Integer.valueOf(r9)
            java.lang.Object r6 = r6.invoke(r7, r14, r12)
            r9 = r6
            androidx.compose.animation.core.FiniteAnimationSpec r9 = (androidx.compose.animation.core.FiniteAnimationSpec) r9
            r19 = 0
            r6 = r16
            r12 = -142660079(0xfffffffff77f2e11, float:-5.1756642E33)
            r7 = r10
            r10 = r8
            r8 = r5
            r5 = -1338768149(0xffffffffb03404eb, float:-6.549061E-10)
            r15 = r10
            r10 = r18
            r18 = r11
            r11 = r17
            r12 = r14
            r17 = r39
            r27 = r13
            r26 = r21
            r13 = r19
            androidx.compose.runtime.State r20 = androidx.compose.animation.core.TransitionKt.createTransitionAnimation(r6, r7, r8, r9, r10, r11, r12, r13)
            r14.endReplaceableGroup()
            r14.endReplaceableGroup()
            androidx.compose.material3.CheckboxKt$CheckboxImpl$checkCenterGravitationShiftFraction$1 r6 = androidx.compose.material3.CheckboxKt$CheckboxImpl$checkCenterGravitationShiftFraction$1.INSTANCE
            kotlin.jvm.functions.Function3 r6 = (kotlin.jvm.functions.Function3) r6
            r14.startReplaceableGroup(r5)
            androidx.compose.runtime.ComposerKt.sourceInformation(r14, r15)
            java.lang.String r11 = "FloatAnimation"
            kotlin.jvm.internal.FloatCompanionObject r5 = kotlin.jvm.internal.FloatCompanionObject.INSTANCE
            androidx.compose.animation.core.TwoWayConverter r10 = androidx.compose.animation.core.VectorConvertersKt.getVectorConverter((kotlin.jvm.internal.FloatCompanionObject) r5)
            r5 = -142660079(0xfffffffff77f2e11, float:-5.1756642E33)
            r14.startReplaceableGroup(r5)
            r5 = r26
            androidx.compose.runtime.ComposerKt.sourceInformation(r14, r5)
            java.lang.Object r5 = r16.getCurrentState()
            androidx.compose.ui.state.ToggleableState r5 = (androidx.compose.ui.state.ToggleableState) r5
            r7 = -1426969489(0xffffffffaaf22c6f, float:-4.3018668E-13)
            r14.startReplaceableGroup(r7)
            r8 = r27
            androidx.compose.runtime.ComposerKt.sourceInformation(r14, r8)
            boolean r9 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            java.lang.String r12 = "androidx.compose.material3.CheckboxImpl.<anonymous> (Checkbox.kt:260)"
            if (r9 == 0) goto L_0x01b1
            r9 = -1
            r13 = 0
            androidx.compose.runtime.ComposerKt.traceEventStart(r7, r13, r9, r12)
            goto L_0x01b2
        L_0x01b1:
            r9 = -1
        L_0x01b2:
            int[] r13 = androidx.compose.material3.CheckboxKt.WhenMappings.$EnumSwitchMapping$0
            int r5 = r5.ordinal()
            r5 = r13[r5]
            r13 = 1
            if (r5 == r13) goto L_0x01cc
            r15 = 2
            if (r5 == r15) goto L_0x01cc
            r15 = 3
            if (r5 != r15) goto L_0x01c6
            r5 = r24
            goto L_0x01ce
        L_0x01c6:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x01cc:
            r5 = r23
        L_0x01ce:
            boolean r15 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r15 == 0) goto L_0x01d7
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L_0x01d7:
            r14.endReplaceableGroup()
            java.lang.Float r5 = java.lang.Float.valueOf(r5)
            java.lang.Object r15 = r16.getTargetState()
            androidx.compose.ui.state.ToggleableState r15 = (androidx.compose.ui.state.ToggleableState) r15
            r14.startReplaceableGroup(r7)
            androidx.compose.runtime.ComposerKt.sourceInformation(r14, r8)
            boolean r8 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r8 == 0) goto L_0x01f4
            r8 = 0
            androidx.compose.runtime.ComposerKt.traceEventStart(r7, r8, r9, r12)
        L_0x01f4:
            int[] r7 = androidx.compose.material3.CheckboxKt.WhenMappings.$EnumSwitchMapping$0
            int r8 = r15.ordinal()
            r7 = r7[r8]
            if (r7 == r13) goto L_0x020d
            r8 = 2
            if (r7 == r8) goto L_0x020d
            r8 = 3
            if (r7 != r8) goto L_0x0207
            r23 = r24
            goto L_0x020d
        L_0x0207:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x020d:
            boolean r7 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r7 == 0) goto L_0x0216
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L_0x0216:
            r14.endReplaceableGroup()
            java.lang.Float r8 = java.lang.Float.valueOf(r23)
            androidx.compose.animation.core.Transition$Segment r7 = r16.getSegment()
            r9 = 0
            java.lang.Integer r12 = java.lang.Integer.valueOf(r9)
            java.lang.Object r6 = r6.invoke(r7, r14, r12)
            r9 = r6
            androidx.compose.animation.core.FiniteAnimationSpec r9 = (androidx.compose.animation.core.FiniteAnimationSpec) r9
            r6 = r16
            r7 = r5
            r12 = r14
            r13 = r19
            androidx.compose.runtime.State r5 = androidx.compose.animation.core.TransitionKt.createTransitionAnimation(r6, r7, r8, r9, r10, r11, r12, r13)
            r14.endReplaceableGroup()
            r14.endReplaceableGroup()
            r6 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r14.startReplaceableGroup(r6)
            java.lang.String r6 = "CC(remember):Composables.kt#9igjgp"
            androidx.compose.runtime.ComposerKt.sourceInformation(r14, r6)
            java.lang.Object r6 = r14.rememberedValue()
            androidx.compose.runtime.Composer$Companion r7 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r7 = r7.getEmpty()
            if (r6 != r7) goto L_0x0262
            androidx.compose.material3.CheckDrawingCache r6 = new androidx.compose.material3.CheckDrawingCache
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 7
            r13 = 0
            r8 = r6
            r8.<init>(r9, r10, r11, r12, r13)
            r14.updateRememberedValue(r6)
        L_0x0262:
            r14.endReplaceableGroup()
            r34 = r6
            androidx.compose.material3.CheckDrawingCache r34 = (androidx.compose.material3.CheckDrawingCache) r34
            int r6 = r17 >> 6
            r6 = r6 & 112(0x70, float:1.57E-43)
            r6 = r18 | r6
            androidx.compose.runtime.State r6 = r4.checkmarkColor$material3_release(r2, r14, r6)
            r7 = r17 & 14
            r8 = r17 & 112(0x70, float:1.57E-43)
            r7 = r7 | r8
            r0 = r0 & 896(0x380, float:1.256E-42)
            r0 = r0 | r7
            androidx.compose.runtime.State r7 = r4.boxColor$material3_release(r1, r2, r14, r0)
            androidx.compose.runtime.State r0 = r4.borderColor$material3_release(r1, r2, r14, r0)
            androidx.compose.ui.Alignment$Companion r8 = androidx.compose.ui.Alignment.Companion
            androidx.compose.ui.Alignment r8 = r8.getCenter()
            r9 = 0
            r10 = 0
            r11 = 2
            androidx.compose.ui.Modifier r8 = androidx.compose.foundation.layout.SizeKt.wrapContentSize$default(r3, r8, r10, r11, r9)
            float r9 = CheckboxSize
            androidx.compose.ui.Modifier r8 = androidx.compose.foundation.layout.SizeKt.m555requiredSize3ABfNKs(r8, r9)
            r28 = r7
            r29 = r0
            r30 = r6
            r31 = r20
            r32 = r5
            r33 = r34
            java.lang.Object[] r9 = new java.lang.Object[]{r28, r29, r30, r31, r32, r33}
            r10 = -568225417(0xffffffffde219177, float:-2.91055434E18)
            r14.startReplaceableGroup(r10)
            java.lang.String r10 = "CC(remember)P(1):Composables.kt#9igjgp"
            androidx.compose.runtime.ComposerKt.sourceInformation(r14, r10)
            r10 = 0
            r11 = 0
        L_0x02b3:
            r12 = 6
            if (r10 >= r12) goto L_0x02c0
            r12 = r9[r10]
            boolean r12 = r14.changed((java.lang.Object) r12)
            r11 = r11 | r12
            int r10 = r10 + 1
            goto L_0x02b3
        L_0x02c0:
            java.lang.Object r9 = r14.rememberedValue()
            if (r11 != 0) goto L_0x02ce
            androidx.compose.runtime.Composer$Companion r10 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r10 = r10.getEmpty()
            if (r9 != r10) goto L_0x02e4
        L_0x02ce:
            androidx.compose.material3.CheckboxKt$CheckboxImpl$1$1 r9 = new androidx.compose.material3.CheckboxKt$CheckboxImpl$1$1
            r28 = r9
            r29 = r7
            r30 = r0
            r31 = r6
            r32 = r20
            r33 = r5
            r28.<init>(r29, r30, r31, r32, r33, r34)
            kotlin.jvm.functions.Function1 r9 = (kotlin.jvm.functions.Function1) r9
            r14.updateRememberedValue(r9)
        L_0x02e4:
            r14.endReplaceableGroup()
            kotlin.jvm.functions.Function1 r9 = (kotlin.jvm.functions.Function1) r9
            r0 = 0
            androidx.compose.foundation.CanvasKt.Canvas(r8, r9, r14, r0)
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto L_0x02f6
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L_0x02f6:
            androidx.compose.runtime.ScopeUpdateScope r6 = r14.endRestartGroup()
            if (r6 != 0) goto L_0x02fd
            goto L_0x0312
        L_0x02fd:
            androidx.compose.material3.CheckboxKt$CheckboxImpl$2 r7 = new androidx.compose.material3.CheckboxKt$CheckboxImpl$2
            r0 = r7
            r1 = r35
            r2 = r36
            r3 = r37
            r4 = r38
            r5 = r40
            r0.<init>(r1, r2, r3, r4, r5)
            kotlin.jvm.functions.Function2 r7 = (kotlin.jvm.functions.Function2) r7
            r6.updateScope(r7)
        L_0x0312:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.CheckboxKt.CheckboxImpl(boolean, androidx.compose.ui.state.ToggleableState, androidx.compose.ui.Modifier, androidx.compose.material3.CheckboxColors, androidx.compose.runtime.Composer, int):void");
    }

    /* access modifiers changed from: private */
    /* renamed from: drawBox-1wkBAMs  reason: not valid java name */
    public static final void m1171drawBox1wkBAMs(DrawScope drawScope, long j, long j2, float f, float f2) {
        float f3 = f;
        float f4 = f2;
        float f5 = f4 / 2.0f;
        Stroke stroke = new Stroke(f2, 0.0f, 0, 0, (PathEffect) null, 30, (DefaultConstructorMarker) null);
        float r1 = Size.m2641getWidthimpl(drawScope.m3429getSizeNHjbRc());
        if (Color.m2822equalsimpl0(j, j2)) {
            DrawScope.m3407drawRoundRectuAw5IA$default(drawScope, j, 0, SizeKt.Size(r1, r1), CornerRadiusKt.CornerRadius$default(f3, 0.0f, 2, (Object) null), Fill.INSTANCE, 0.0f, (ColorFilter) null, 0, 226, (Object) null);
            return;
        }
        float f6 = r1 - (((float) 2) * f4);
        DrawScope.m3407drawRoundRectuAw5IA$default(drawScope, j, OffsetKt.Offset(f4, f4), SizeKt.Size(f6, f6), CornerRadiusKt.CornerRadius$default(Math.max(0.0f, f3 - f4), 0.0f, 2, (Object) null), Fill.INSTANCE, 0.0f, (ColorFilter) null, 0, 224, (Object) null);
        float f7 = r1 - f4;
        DrawScope.m3407drawRoundRectuAw5IA$default(drawScope, j2, OffsetKt.Offset(f5, f5), SizeKt.Size(f7, f7), CornerRadiusKt.CornerRadius$default(f3 - f5, 0.0f, 2, (Object) null), stroke, 0.0f, (ColorFilter) null, 0, 224, (Object) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: drawCheck-3IgeMak  reason: not valid java name */
    public static final void m1172drawCheck3IgeMak(DrawScope drawScope, long j, float f, float f2, float f3, CheckDrawingCache checkDrawingCache) {
        float f4 = f2;
        Stroke stroke = new Stroke(f3, 0.0f, StrokeCap.Companion.m3206getSquareKaPHkGw(), 0, (PathEffect) null, 26, (DefaultConstructorMarker) null);
        float r1 = Size.m2641getWidthimpl(drawScope.m3429getSizeNHjbRc());
        float lerp = MathHelpersKt.lerp(0.4f, 0.5f, f4);
        float lerp2 = MathHelpersKt.lerp(0.7f, 0.5f, f4);
        float lerp3 = MathHelpersKt.lerp(0.5f, 0.5f, f4);
        float lerp4 = MathHelpersKt.lerp(0.3f, 0.5f, f4);
        checkDrawingCache.getCheckPath().reset();
        checkDrawingCache.getCheckPath().moveTo(0.2f * r1, lerp3 * r1);
        checkDrawingCache.getCheckPath().lineTo(lerp * r1, lerp2 * r1);
        checkDrawingCache.getCheckPath().lineTo(0.8f * r1, r1 * lerp4);
        checkDrawingCache.getPathMeasure().setPath(checkDrawingCache.getCheckPath(), false);
        checkDrawingCache.getPathToDraw().reset();
        checkDrawingCache.getPathMeasure().getSegment(0.0f, checkDrawingCache.getPathMeasure().getLength() * f, checkDrawingCache.getPathToDraw(), true);
        DrawScope.m3401drawPathLG529CI$default(drawScope, checkDrawingCache.getPathToDraw(), j, 0.0f, stroke, (ColorFilter) null, 0, 52, (Object) null);
    }

    static {
        float f = (float) 2;
        CheckboxDefaultPadding = Dp.m5626constructorimpl(f);
        StrokeWidth = Dp.m5626constructorimpl(f);
        RadiusSize = Dp.m5626constructorimpl(f);
    }
}
