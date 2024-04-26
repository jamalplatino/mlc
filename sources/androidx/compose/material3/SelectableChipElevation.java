package androidx.compose.material3;

import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B:\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003ø\u0001\u0000¢\u0006\u0002\u0010\tJ&\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0003ø\u0001\u0000¢\u0006\u0002\u0010\u0011J\u0013\u0010\u0012\u001a\u00020\u000e2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001H\u0002J\b\u0010\u0014\u001a\u00020\u0015H\u0016J(\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00030\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0001ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0011J(\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00030\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0001ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u0011R\u0019\u0010\b\u001a\u00020\u0003X\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\n\u0002\u0010\nR\u0019\u0010\u0007\u001a\u00020\u0003X\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\n\u0002\u0010\nR\u0019\u0010\u0002\u001a\u00020\u0003X\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\n\u0002\u0010\nR\u0019\u0010\u0005\u001a\u00020\u0003X\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\n\u0002\u0010\nR\u0019\u0010\u0006\u001a\u00020\u0003X\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\n\u0002\u0010\nR\u0019\u0010\u0004\u001a\u00020\u0003X\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\n\u0002\u0010\n\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001a"}, d2 = {"Landroidx/compose/material3/SelectableChipElevation;", "", "elevation", "Landroidx/compose/ui/unit/Dp;", "pressedElevation", "focusedElevation", "hoveredElevation", "draggedElevation", "disabledElevation", "(FFFFFFLkotlin/jvm/internal/DefaultConstructorMarker;)V", "F", "animateElevation", "Landroidx/compose/runtime/State;", "enabled", "", "interactionSource", "Landroidx/compose/foundation/interaction/InteractionSource;", "(ZLandroidx/compose/foundation/interaction/InteractionSource;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "equals", "other", "hashCode", "", "shadowElevation", "shadowElevation$material3_release", "tonalElevation", "tonalElevation$material3_release", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* compiled from: Chip.kt */
public final class SelectableChipElevation {
    public static final int $stable = 0;
    private final float disabledElevation;
    /* access modifiers changed from: private */
    public final float draggedElevation;
    private final float elevation;
    /* access modifiers changed from: private */
    public final float focusedElevation;
    /* access modifiers changed from: private */
    public final float hoveredElevation;
    /* access modifiers changed from: private */
    public final float pressedElevation;

    public /* synthetic */ SelectableChipElevation(float f, float f2, float f3, float f4, float f5, float f6, DefaultConstructorMarker defaultConstructorMarker) {
        this(f, f2, f3, f4, f5, f6);
    }

    private SelectableChipElevation(float f, float f2, float f3, float f4, float f5, float f6) {
        this.elevation = f;
        this.pressedElevation = f2;
        this.focusedElevation = f3;
        this.hoveredElevation = f4;
        this.draggedElevation = f5;
        this.disabledElevation = f6;
    }

    public final State<Dp> tonalElevation$material3_release(boolean z, InteractionSource interactionSource, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(interactionSource, "interactionSource");
        composer.startReplaceableGroup(-93383461);
        ComposerKt.sourceInformation(composer, "C(tonalElevation)1627@77905L74:Chip.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-93383461, i, -1, "androidx.compose.material3.SelectableChipElevation.tonalElevation (Chip.kt:1623)");
        }
        State<Dp> animateElevation = animateElevation(z, interactionSource, composer, (i & 896) | (i & 14) | (i & 112));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return animateElevation;
    }

    public final State<Dp> shadowElevation$material3_release(boolean z, InteractionSource interactionSource, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(interactionSource, "interactionSource");
        composer.startReplaceableGroup(-1888175651);
        ComposerKt.sourceInformation(composer, "C(shadowElevation)1646@78663L74:Chip.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1888175651, i, -1, "androidx.compose.material3.SelectableChipElevation.shadowElevation (Chip.kt:1642)");
        }
        State<Dp> animateElevation = animateElevation(z, interactionSource, composer, (i & 896) | (i & 14) | (i & 112));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return animateElevation;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v12, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v23, resolved type: androidx.compose.animation.core.Animatable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v3, resolved type: androidx.compose.animation.core.Animatable} */
    /* JADX WARNING: type inference failed for: r0v13 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final androidx.compose.runtime.State<androidx.compose.ui.unit.Dp> animateElevation(boolean r19, androidx.compose.foundation.interaction.InteractionSource r20, androidx.compose.runtime.Composer r21, int r22) {
        /*
            r18 = this;
            r6 = r18
            r0 = r20
            r7 = r21
            r1 = r22
            r2 = 664514136(0x279bae58, float:4.3210166E-15)
            r7.startReplaceableGroup(r2)
            java.lang.String r3 = "C(animateElevation)1654@78912L46,1655@79001L1473,1655@78967L1507,1706@80977L51:Chip.kt#uh7d8r"
            androidx.compose.runtime.ComposerKt.sourceInformation(r7, r3)
            boolean r3 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r3 == 0) goto L_0x0020
            r3 = -1
            java.lang.String r4 = "androidx.compose.material3.SelectableChipElevation.animateElevation (Chip.kt:1650)"
            androidx.compose.runtime.ComposerKt.traceEventStart(r2, r1, r3, r4)
        L_0x0020:
            r2 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r7.startReplaceableGroup(r2)
            java.lang.String r3 = "CC(remember):Composables.kt#9igjgp"
            androidx.compose.runtime.ComposerKt.sourceInformation(r7, r3)
            java.lang.Object r4 = r21.rememberedValue()
            androidx.compose.runtime.Composer$Companion r5 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r5 = r5.getEmpty()
            if (r4 != r5) goto L_0x003e
            androidx.compose.runtime.snapshots.SnapshotStateList r4 = androidx.compose.runtime.SnapshotStateKt.mutableStateListOf()
            r7.updateRememberedValue(r4)
        L_0x003e:
            r21.endReplaceableGroup()
            androidx.compose.runtime.snapshots.SnapshotStateList r4 = (androidx.compose.runtime.snapshots.SnapshotStateList) r4
            int r1 = r1 >> 3
            r1 = r1 & 14
            r5 = 511388516(0x1e7b2b64, float:1.3296802E-20)
            r7.startReplaceableGroup(r5)
            java.lang.String r5 = "CC(remember)P(1,2):Composables.kt#9igjgp"
            androidx.compose.runtime.ComposerKt.sourceInformation(r7, r5)
            boolean r5 = r7.changed((java.lang.Object) r0)
            boolean r8 = r7.changed((java.lang.Object) r4)
            r5 = r5 | r8
            java.lang.Object r8 = r21.rememberedValue()
            r9 = 0
            if (r5 != 0) goto L_0x006a
            androidx.compose.runtime.Composer$Companion r5 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r5 = r5.getEmpty()
            if (r8 != r5) goto L_0x0075
        L_0x006a:
            androidx.compose.material3.SelectableChipElevation$animateElevation$1$1 r5 = new androidx.compose.material3.SelectableChipElevation$animateElevation$1$1
            r5.<init>(r0, r4, r9)
            r8 = r5
            kotlin.jvm.functions.Function2 r8 = (kotlin.jvm.functions.Function2) r8
            r7.updateRememberedValue(r8)
        L_0x0075:
            r21.endReplaceableGroup()
            kotlin.jvm.functions.Function2 r8 = (kotlin.jvm.functions.Function2) r8
            r10 = 64
            r1 = r1 | r10
            androidx.compose.runtime.EffectsKt.LaunchedEffect((java.lang.Object) r0, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) r8, (androidx.compose.runtime.Composer) r7, (int) r1)
            java.util.List r4 = (java.util.List) r4
            java.lang.Object r0 = kotlin.collections.CollectionsKt.lastOrNull(r4)
            r4 = r0
            androidx.compose.foundation.interaction.Interaction r4 = (androidx.compose.foundation.interaction.Interaction) r4
            if (r19 != 0) goto L_0x008f
            float r0 = r6.disabledElevation
        L_0x008d:
            r5 = r0
            goto L_0x00ae
        L_0x008f:
            boolean r0 = r4 instanceof androidx.compose.foundation.interaction.PressInteraction.Press
            if (r0 == 0) goto L_0x0096
            float r0 = r6.pressedElevation
            goto L_0x008d
        L_0x0096:
            boolean r0 = r4 instanceof androidx.compose.foundation.interaction.HoverInteraction.Enter
            if (r0 == 0) goto L_0x009d
            float r0 = r6.hoveredElevation
            goto L_0x008d
        L_0x009d:
            boolean r0 = r4 instanceof androidx.compose.foundation.interaction.FocusInteraction.Focus
            if (r0 == 0) goto L_0x00a4
            float r0 = r6.focusedElevation
            goto L_0x008d
        L_0x00a4:
            boolean r0 = r4 instanceof androidx.compose.foundation.interaction.DragInteraction.Start
            if (r0 == 0) goto L_0x00ab
            float r0 = r6.draggedElevation
            goto L_0x008d
        L_0x00ab:
            float r0 = r6.elevation
            goto L_0x008d
        L_0x00ae:
            r7.startReplaceableGroup(r2)
            androidx.compose.runtime.ComposerKt.sourceInformation(r7, r3)
            java.lang.Object r0 = r21.rememberedValue()
            androidx.compose.runtime.Composer$Companion r1 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r1 = r1.getEmpty()
            if (r0 != r1) goto L_0x00d9
            androidx.compose.animation.core.Animatable r0 = new androidx.compose.animation.core.Animatable
            androidx.compose.ui.unit.Dp r12 = androidx.compose.ui.unit.Dp.m5624boximpl(r5)
            androidx.compose.ui.unit.Dp$Companion r1 = androidx.compose.ui.unit.Dp.Companion
            androidx.compose.animation.core.TwoWayConverter r13 = androidx.compose.animation.core.VectorConvertersKt.getVectorConverter((androidx.compose.ui.unit.Dp.Companion) r1)
            r14 = 0
            r15 = 0
            r16 = 12
            r17 = 0
            r11 = r0
            r11.<init>(r12, r13, r14, r15, r16, r17)
            r7.updateRememberedValue(r0)
        L_0x00d9:
            r21.endReplaceableGroup()
            r8 = r0
            androidx.compose.animation.core.Animatable r8 = (androidx.compose.animation.core.Animatable) r8
            if (r19 != 0) goto L_0x00fe
            r0 = -699481942(0xffffffffd64ec0aa, float:-5.683172E13)
            r7.startReplaceableGroup(r0)
            java.lang.String r0 = "1710@81127L52"
            androidx.compose.runtime.ComposerKt.sourceInformation(r7, r0)
            androidx.compose.ui.unit.Dp r0 = androidx.compose.ui.unit.Dp.m5624boximpl(r5)
            androidx.compose.material3.SelectableChipElevation$animateElevation$2 r1 = new androidx.compose.material3.SelectableChipElevation$animateElevation$2
            r1.<init>(r8, r5, r9)
            kotlin.jvm.functions.Function2 r1 = (kotlin.jvm.functions.Function2) r1
            androidx.compose.runtime.EffectsKt.LaunchedEffect((java.lang.Object) r0, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) r1, (androidx.compose.runtime.Composer) r7, (int) r10)
            r21.endReplaceableGroup()
            goto L_0x0121
        L_0x00fe:
            r0 = -699481799(0xffffffffd64ec139, float:-5.683232E13)
            r7.startReplaceableGroup(r0)
            java.lang.String r0 = "1712@81209L570"
            androidx.compose.runtime.ComposerKt.sourceInformation(r7, r0)
            androidx.compose.ui.unit.Dp r9 = androidx.compose.ui.unit.Dp.m5624boximpl(r5)
            androidx.compose.material3.SelectableChipElevation$animateElevation$3 r11 = new androidx.compose.material3.SelectableChipElevation$animateElevation$3
            r12 = 0
            r0 = r11
            r1 = r8
            r2 = r18
            r3 = r5
            r5 = r12
            r0.<init>(r1, r2, r3, r4, r5)
            kotlin.jvm.functions.Function2 r11 = (kotlin.jvm.functions.Function2) r11
            androidx.compose.runtime.EffectsKt.LaunchedEffect((java.lang.Object) r9, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) r11, (androidx.compose.runtime.Composer) r7, (int) r10)
            r21.endReplaceableGroup()
        L_0x0121:
            androidx.compose.runtime.State r0 = r8.asState()
            boolean r1 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r1 == 0) goto L_0x012e
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L_0x012e:
            r21.endReplaceableGroup()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.SelectableChipElevation.animateElevation(boolean, androidx.compose.foundation.interaction.InteractionSource, androidx.compose.runtime.Composer, int):androidx.compose.runtime.State");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof SelectableChipElevation)) {
            return false;
        }
        SelectableChipElevation selectableChipElevation = (SelectableChipElevation) obj;
        return Dp.m5631equalsimpl0(this.elevation, selectableChipElevation.elevation) && Dp.m5631equalsimpl0(this.pressedElevation, selectableChipElevation.pressedElevation) && Dp.m5631equalsimpl0(this.focusedElevation, selectableChipElevation.focusedElevation) && Dp.m5631equalsimpl0(this.hoveredElevation, selectableChipElevation.hoveredElevation) && Dp.m5631equalsimpl0(this.disabledElevation, selectableChipElevation.disabledElevation);
    }

    public int hashCode() {
        return (((((((Dp.m5632hashCodeimpl(this.elevation) * 31) + Dp.m5632hashCodeimpl(this.pressedElevation)) * 31) + Dp.m5632hashCodeimpl(this.focusedElevation)) * 31) + Dp.m5632hashCodeimpl(this.hoveredElevation)) * 31) + Dp.m5632hashCodeimpl(this.disabledElevation);
    }
}
