package androidx.compose.foundation.pager;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002JO\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\r2\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0007¢\u0006\u0002\u0010\u000fJ\u000e\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013¨\u0006\u0014"}, d2 = {"Landroidx/compose/foundation/pager/PagerDefaults;", "", "()V", "flingBehavior", "Landroidx/compose/foundation/gestures/snapping/SnapFlingBehavior;", "state", "Landroidx/compose/foundation/pager/PagerState;", "pagerSnapDistance", "Landroidx/compose/foundation/pager/PagerSnapDistance;", "lowVelocityAnimationSpec", "Landroidx/compose/animation/core/AnimationSpec;", "", "highVelocityAnimationSpec", "Landroidx/compose/animation/core/DecayAnimationSpec;", "snapAnimationSpec", "(Landroidx/compose/foundation/pager/PagerState;Landroidx/compose/foundation/pager/PagerSnapDistance;Landroidx/compose/animation/core/AnimationSpec;Landroidx/compose/animation/core/DecayAnimationSpec;Landroidx/compose/animation/core/AnimationSpec;Landroidx/compose/runtime/Composer;II)Landroidx/compose/foundation/gestures/snapping/SnapFlingBehavior;", "pageNestedScrollConnection", "Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "orientation", "Landroidx/compose/foundation/gestures/Orientation;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* compiled from: Pager.kt */
public final class PagerDefaults {
    public static final int $stable = 0;
    public static final PagerDefaults INSTANCE = new PagerDefaults();

    private PagerDefaults() {
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v9, resolved type: androidx.compose.foundation.gestures.snapping.SnapFlingBehavior} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v2, resolved type: androidx.compose.foundation.gestures.snapping.SnapFlingBehavior} */
    /* JADX WARNING: type inference failed for: r2v7 */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00a7, code lost:
        if (r2 == androidx.compose.runtime.Composer.Companion.getEmpty()) goto L_0x00a9;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final androidx.compose.foundation.gestures.snapping.SnapFlingBehavior flingBehavior(androidx.compose.foundation.pager.PagerState r17, androidx.compose.foundation.pager.PagerSnapDistance r18, androidx.compose.animation.core.AnimationSpec<java.lang.Float> r19, androidx.compose.animation.core.DecayAnimationSpec<java.lang.Float> r20, androidx.compose.animation.core.AnimationSpec<java.lang.Float> r21, androidx.compose.runtime.Composer r22, int r23, int r24) {
        /*
            r16 = this;
            r0 = r17
            r1 = r22
            java.lang.String r2 = "state"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r2)
            r2 = -344874176(0xffffffffeb71a340, float:-2.9212205E26)
            r1.startReplaceableGroup(r2)
            java.lang.String r3 = "C(flingBehavior)P(4,2,1)469@20718L26,472@20905L7,474@20929L662:Pager.kt#g6yjnt"
            androidx.compose.runtime.ComposerKt.sourceInformation(r1, r3)
            r3 = r24 & 2
            if (r3 == 0) goto L_0x0021
            androidx.compose.foundation.pager.PagerSnapDistance$Companion r3 = androidx.compose.foundation.pager.PagerSnapDistance.Companion
            r4 = 1
            androidx.compose.foundation.pager.PagerSnapDistance r3 = r3.atMost(r4)
            goto L_0x0023
        L_0x0021:
            r3 = r18
        L_0x0023:
            r4 = r24 & 4
            r5 = 0
            r6 = 0
            if (r4 == 0) goto L_0x0038
            androidx.compose.animation.core.Easing r4 = androidx.compose.animation.core.EasingKt.getLinearEasing()
            r7 = 500(0x1f4, float:7.0E-43)
            r8 = 2
            androidx.compose.animation.core.TweenSpec r4 = androidx.compose.animation.core.AnimationSpecKt.tween$default(r7, r6, r4, r8, r5)
            androidx.compose.animation.core.AnimationSpec r4 = (androidx.compose.animation.core.AnimationSpec) r4
            r9 = r4
            goto L_0x003a
        L_0x0038:
            r9 = r19
        L_0x003a:
            r4 = r24 & 8
            if (r4 == 0) goto L_0x0044
            androidx.compose.animation.core.DecayAnimationSpec r4 = androidx.compose.animation.SplineBasedFloatDecayAnimationSpec_androidKt.rememberSplineBasedDecay(r1, r6)
            r10 = r4
            goto L_0x0046
        L_0x0044:
            r10 = r20
        L_0x0046:
            r4 = r24 & 16
            r7 = 5
            if (r4 == 0) goto L_0x0056
            r4 = 0
            r8 = 1137180672(0x43c80000, float:400.0)
            androidx.compose.animation.core.SpringSpec r4 = androidx.compose.animation.core.AnimationSpecKt.spring$default(r4, r8, r5, r7, r5)
            androidx.compose.animation.core.AnimationSpec r4 = (androidx.compose.animation.core.AnimationSpec) r4
            r11 = r4
            goto L_0x0058
        L_0x0056:
            r11 = r21
        L_0x0058:
            boolean r4 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r4 == 0) goto L_0x0067
            r4 = -1
            java.lang.String r5 = "androidx.compose.foundation.pager.PagerDefaults.flingBehavior (Pager.kt:462)"
            r8 = r23
            androidx.compose.runtime.ComposerKt.traceEventStart(r2, r8, r4, r5)
        L_0x0067:
            androidx.compose.runtime.ProvidableCompositionLocal r2 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalDensity()
            androidx.compose.runtime.CompositionLocal r2 = (androidx.compose.runtime.CompositionLocal) r2
            r4 = 2023513938(0x789c5f52, float:2.5372864E34)
            java.lang.String r5 = "CC:CompositionLocal.kt#9igjgp"
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(r1, r4, r5)
            java.lang.Object r2 = r1.consume(r2)
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(r22)
            r12 = r2
            androidx.compose.ui.unit.Density r12 = (androidx.compose.ui.unit.Density) r12
            java.lang.Object[] r2 = new java.lang.Object[]{r9, r10, r11, r3, r12}
            r4 = -568225417(0xffffffffde219177, float:-2.91055434E18)
            r1.startReplaceableGroup(r4)
            java.lang.String r4 = "CC(remember)P(1):Composables.kt#9igjgp"
            androidx.compose.runtime.ComposerKt.sourceInformation(r1, r4)
            r4 = r6
        L_0x008f:
            if (r6 >= r7) goto L_0x009b
            r5 = r2[r6]
            boolean r5 = r1.changed((java.lang.Object) r5)
            r4 = r4 | r5
            int r6 = r6 + 1
            goto L_0x008f
        L_0x009b:
            java.lang.Object r2 = r22.rememberedValue()
            if (r4 != 0) goto L_0x00a9
            androidx.compose.runtime.Composer$Companion r4 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r4 = r4.getEmpty()
            if (r2 != r4) goto L_0x00ba
        L_0x00a9:
            androidx.compose.foundation.gestures.snapping.SnapLayoutInfoProvider r8 = androidx.compose.foundation.pager.PagerKt.SnapLayoutInfoProvider(r0, r3, r10)
            androidx.compose.foundation.gestures.snapping.SnapFlingBehavior r2 = new androidx.compose.foundation.gestures.snapping.SnapFlingBehavior
            r13 = 0
            r14 = 32
            r15 = 0
            r7 = r2
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15)
            r1.updateRememberedValue(r2)
        L_0x00ba:
            r22.endReplaceableGroup()
            androidx.compose.foundation.gestures.snapping.SnapFlingBehavior r2 = (androidx.compose.foundation.gestures.snapping.SnapFlingBehavior) r2
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto L_0x00c8
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L_0x00c8:
            r22.endReplaceableGroup()
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.pager.PagerDefaults.flingBehavior(androidx.compose.foundation.pager.PagerState, androidx.compose.foundation.pager.PagerSnapDistance, androidx.compose.animation.core.AnimationSpec, androidx.compose.animation.core.DecayAnimationSpec, androidx.compose.animation.core.AnimationSpec, androidx.compose.runtime.Composer, int, int):androidx.compose.foundation.gestures.snapping.SnapFlingBehavior");
    }

    public final NestedScrollConnection pageNestedScrollConnection(Orientation orientation) {
        Intrinsics.checkNotNullParameter(orientation, "orientation");
        if (orientation == Orientation.Horizontal) {
            return PagerKt.ConsumeHorizontalFlingNestedScrollConnection;
        }
        return PagerKt.ConsumeVerticalFlingNestedScrollConnection;
    }
}
