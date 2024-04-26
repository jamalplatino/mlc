package androidx.compose.material3;

import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0017\u0018\u00002\u00020\u0001B*\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003ø\u0001\u0000¢\u0006\u0002\u0010\u0007J\u001e\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\n2\u0006\u0010\u000b\u001a\u00020\fH\u0003ø\u0001\u0000¢\u0006\u0002\u0010\rJ\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001H\u0002J\b\u0010\u0011\u001a\u00020\u0012H\u0016J \u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00030\n2\u0006\u0010\u000b\u001a\u00020\fH\u0001ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\rJ \u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00030\n2\u0006\u0010\u000b\u001a\u00020\fH\u0001ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\rR\u0019\u0010\u0002\u001a\u00020\u0003X\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\n\u0002\u0010\bR\u0019\u0010\u0005\u001a\u00020\u0003X\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\n\u0002\u0010\bR\u0019\u0010\u0006\u001a\u00020\u0003X\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\n\u0002\u0010\bR\u0019\u0010\u0004\u001a\u00020\u0003X\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\n\u0002\u0010\b\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0017"}, d2 = {"Landroidx/compose/material3/FloatingActionButtonElevation;", "", "defaultElevation", "Landroidx/compose/ui/unit/Dp;", "pressedElevation", "focusedElevation", "hoveredElevation", "(FFFFLkotlin/jvm/internal/DefaultConstructorMarker;)V", "F", "animateElevation", "Landroidx/compose/runtime/State;", "interactionSource", "Landroidx/compose/foundation/interaction/InteractionSource;", "(Landroidx/compose/foundation/interaction/InteractionSource;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "equals", "", "other", "hashCode", "", "shadowElevation", "shadowElevation$material3_release", "tonalElevation", "tonalElevation$material3_release", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* compiled from: FloatingActionButton.kt */
public class FloatingActionButtonElevation {
    public static final int $stable = 0;
    private final float defaultElevation;
    /* access modifiers changed from: private */
    public final float focusedElevation;
    /* access modifiers changed from: private */
    public final float hoveredElevation;
    /* access modifiers changed from: private */
    public final float pressedElevation;

    public /* synthetic */ FloatingActionButtonElevation(float f, float f2, float f3, float f4, DefaultConstructorMarker defaultConstructorMarker) {
        this(f, f2, f3, f4);
    }

    private FloatingActionButtonElevation(float f, float f2, float f3, float f4) {
        this.defaultElevation = f;
        this.pressedElevation = f2;
        this.focusedElevation = f3;
        this.hoveredElevation = f4;
    }

    public final State<Dp> shadowElevation$material3_release(InteractionSource interactionSource, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(interactionSource, "interactionSource");
        composer.startReplaceableGroup(-424810125);
        ComposerKt.sourceInformation(composer, "C(shadowElevation)496@24108L55:FloatingActionButton.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-424810125, i, -1, "androidx.compose.material3.FloatingActionButtonElevation.shadowElevation (FloatingActionButton.kt:495)");
        }
        State<Dp> animateElevation = animateElevation(interactionSource, composer, (i & 112) | (i & 14));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return animateElevation;
    }

    public final State<Dp> tonalElevation$material3_release(InteractionSource interactionSource, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(interactionSource, "interactionSource");
        composer.startReplaceableGroup(-550096911);
        ComposerKt.sourceInformation(composer, "C(tonalElevation)501@24285L55:FloatingActionButton.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-550096911, i, -1, "androidx.compose.material3.FloatingActionButtonElevation.tonalElevation (FloatingActionButton.kt:500)");
        }
        State<Dp> animateElevation = animateElevation(interactionSource, composer, (i & 112) | (i & 14));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return animateElevation;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v9, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v15, resolved type: androidx.compose.animation.core.Animatable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v2, resolved type: androidx.compose.animation.core.Animatable} */
    /* JADX WARNING: type inference failed for: r0v10 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final androidx.compose.runtime.State<androidx.compose.ui.unit.Dp> animateElevation(androidx.compose.foundation.interaction.InteractionSource r18, androidx.compose.runtime.Composer r19, int r20) {
        /*
            r17 = this;
            r6 = r17
            r0 = r18
            r7 = r19
            r1 = r20
            r2 = -1845106002(0xffffffff9205eaae, float:-4.2256665E-28)
            r7.startReplaceableGroup(r2)
            java.lang.String r3 = "C(animateElevation)506@24475L46,508@24565L1077,508@24531L1111,545@25986L51,547@26047L499:FloatingActionButton.kt#uh7d8r"
            androidx.compose.runtime.ComposerKt.sourceInformation(r7, r3)
            boolean r3 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r3 == 0) goto L_0x0020
            r3 = -1
            java.lang.String r4 = "androidx.compose.material3.FloatingActionButtonElevation.animateElevation (FloatingActionButton.kt:505)"
            androidx.compose.runtime.ComposerKt.traceEventStart(r2, r1, r3, r4)
        L_0x0020:
            r2 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r7.startReplaceableGroup(r2)
            java.lang.String r3 = "CC(remember):Composables.kt#9igjgp"
            androidx.compose.runtime.ComposerKt.sourceInformation(r7, r3)
            java.lang.Object r4 = r19.rememberedValue()
            androidx.compose.runtime.Composer$Companion r5 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r5 = r5.getEmpty()
            if (r4 != r5) goto L_0x003e
            androidx.compose.runtime.snapshots.SnapshotStateList r4 = androidx.compose.runtime.SnapshotStateKt.mutableStateListOf()
            r7.updateRememberedValue(r4)
        L_0x003e:
            r19.endReplaceableGroup()
            androidx.compose.runtime.snapshots.SnapshotStateList r4 = (androidx.compose.runtime.snapshots.SnapshotStateList) r4
            r1 = r1 & 14
            r5 = 511388516(0x1e7b2b64, float:1.3296802E-20)
            r7.startReplaceableGroup(r5)
            java.lang.String r5 = "CC(remember)P(1,2):Composables.kt#9igjgp"
            androidx.compose.runtime.ComposerKt.sourceInformation(r7, r5)
            boolean r5 = r7.changed((java.lang.Object) r0)
            boolean r8 = r7.changed((java.lang.Object) r4)
            r5 = r5 | r8
            java.lang.Object r8 = r19.rememberedValue()
            if (r5 != 0) goto L_0x0067
            androidx.compose.runtime.Composer$Companion r5 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r5 = r5.getEmpty()
            if (r8 != r5) goto L_0x0073
        L_0x0067:
            androidx.compose.material3.FloatingActionButtonElevation$animateElevation$1$1 r5 = new androidx.compose.material3.FloatingActionButtonElevation$animateElevation$1$1
            r8 = 0
            r5.<init>(r0, r4, r8)
            r8 = r5
            kotlin.jvm.functions.Function2 r8 = (kotlin.jvm.functions.Function2) r8
            r7.updateRememberedValue(r8)
        L_0x0073:
            r19.endReplaceableGroup()
            kotlin.jvm.functions.Function2 r8 = (kotlin.jvm.functions.Function2) r8
            r9 = 64
            r1 = r1 | r9
            androidx.compose.runtime.EffectsKt.LaunchedEffect((java.lang.Object) r0, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) r8, (androidx.compose.runtime.Composer) r7, (int) r1)
            java.util.List r4 = (java.util.List) r4
            java.lang.Object r0 = kotlin.collections.CollectionsKt.lastOrNull(r4)
            r4 = r0
            androidx.compose.foundation.interaction.Interaction r4 = (androidx.compose.foundation.interaction.Interaction) r4
            boolean r0 = r4 instanceof androidx.compose.foundation.interaction.PressInteraction.Press
            if (r0 == 0) goto L_0x008f
            float r0 = r6.pressedElevation
        L_0x008d:
            r5 = r0
            goto L_0x00a0
        L_0x008f:
            boolean r0 = r4 instanceof androidx.compose.foundation.interaction.HoverInteraction.Enter
            if (r0 == 0) goto L_0x0096
            float r0 = r6.hoveredElevation
            goto L_0x008d
        L_0x0096:
            boolean r0 = r4 instanceof androidx.compose.foundation.interaction.FocusInteraction.Focus
            if (r0 == 0) goto L_0x009d
            float r0 = r6.focusedElevation
            goto L_0x008d
        L_0x009d:
            float r0 = r6.defaultElevation
            goto L_0x008d
        L_0x00a0:
            r7.startReplaceableGroup(r2)
            androidx.compose.runtime.ComposerKt.sourceInformation(r7, r3)
            java.lang.Object r0 = r19.rememberedValue()
            androidx.compose.runtime.Composer$Companion r1 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r1 = r1.getEmpty()
            if (r0 != r1) goto L_0x00cb
            androidx.compose.animation.core.Animatable r0 = new androidx.compose.animation.core.Animatable
            androidx.compose.ui.unit.Dp r11 = androidx.compose.ui.unit.Dp.m5624boximpl(r5)
            androidx.compose.ui.unit.Dp$Companion r1 = androidx.compose.ui.unit.Dp.Companion
            androidx.compose.animation.core.TwoWayConverter r12 = androidx.compose.animation.core.VectorConvertersKt.getVectorConverter((androidx.compose.ui.unit.Dp.Companion) r1)
            r13 = 0
            r14 = 0
            r15 = 12
            r16 = 0
            r10 = r0
            r10.<init>(r11, r12, r13, r14, r15, r16)
            r7.updateRememberedValue(r0)
        L_0x00cb:
            r19.endReplaceableGroup()
            r8 = r0
            androidx.compose.animation.core.Animatable r8 = (androidx.compose.animation.core.Animatable) r8
            androidx.compose.ui.unit.Dp r10 = androidx.compose.ui.unit.Dp.m5624boximpl(r5)
            androidx.compose.material3.FloatingActionButtonElevation$animateElevation$2 r11 = new androidx.compose.material3.FloatingActionButtonElevation$animateElevation$2
            r12 = 0
            r0 = r11
            r1 = r8
            r2 = r17
            r3 = r5
            r5 = r12
            r0.<init>(r1, r2, r3, r4, r5)
            kotlin.jvm.functions.Function2 r11 = (kotlin.jvm.functions.Function2) r11
            androidx.compose.runtime.EffectsKt.LaunchedEffect((java.lang.Object) r10, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) r11, (androidx.compose.runtime.Composer) r7, (int) r9)
            androidx.compose.runtime.State r0 = r8.asState()
            boolean r1 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r1 == 0) goto L_0x00f3
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L_0x00f3:
            r19.endReplaceableGroup()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.FloatingActionButtonElevation.animateElevation(androidx.compose.foundation.interaction.InteractionSource, androidx.compose.runtime.Composer, int):androidx.compose.runtime.State");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof FloatingActionButtonElevation)) {
            return false;
        }
        FloatingActionButtonElevation floatingActionButtonElevation = (FloatingActionButtonElevation) obj;
        return Dp.m5631equalsimpl0(this.defaultElevation, floatingActionButtonElevation.defaultElevation) && Dp.m5631equalsimpl0(this.pressedElevation, floatingActionButtonElevation.pressedElevation) && Dp.m5631equalsimpl0(this.focusedElevation, floatingActionButtonElevation.focusedElevation) && Dp.m5631equalsimpl0(this.hoveredElevation, floatingActionButtonElevation.hoveredElevation);
    }

    public int hashCode() {
        return (((((Dp.m5632hashCodeimpl(this.defaultElevation) * 31) + Dp.m5632hashCodeimpl(this.pressedElevation)) * 31) + Dp.m5632hashCodeimpl(this.focusedElevation)) * 31) + Dp.m5632hashCodeimpl(this.hoveredElevation);
    }
}