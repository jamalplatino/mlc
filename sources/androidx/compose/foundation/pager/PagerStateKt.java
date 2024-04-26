package androidx.compose.foundation.pager;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;

@Metadata(d1 = {"\u0000_\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007*\u0003\b\u000b\u001d\u001a\u0017\u0010\u001f\u001a\u00020 2\f\u0010!\u001a\b\u0012\u0004\u0012\u00020#0\"H\b\u001a!\u0010$\u001a\u00020%2\b\b\u0002\u0010&\u001a\u00020\u00102\b\b\u0002\u0010'\u001a\u00020\u000eH\u0007¢\u0006\u0002\u0010(\u001a\u0015\u0010)\u001a\u00020 *\u00020%H@ø\u0001\u0000¢\u0006\u0002\u0010*\u001a\u0015\u0010+\u001a\u00020 *\u00020%H@ø\u0001\u0000¢\u0006\u0002\u0010*\"\u000e\u0010\u0000\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000\"\u0019\u0010\u0002\u001a\u00020\u0003X\u0004ø\u0001\u0000¢\u0006\n\n\u0002\u0010\u0006\u001a\u0004\b\u0004\u0010\u0005\"\u0010\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0004\n\u0002\u0010\t\"\u0010\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0004\n\u0002\u0010\f\"\u000e\u0010\r\u001a\u00020\u000eXT¢\u0006\u0002\n\u0000\"\u000e\u0010\u000f\u001a\u00020\u0010XT¢\u0006\u0002\n\u0000\"\u000e\u0010\u0011\u001a\u00020\u000eXT¢\u0006\u0002\n\u0000\"O\u0010\u0012\u001a=\u0012\u0004\u0012\u00020\u0014\u0012\u0013\u0012\u00110\u000e¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0017\u0012\u0013\u0012\u00110\u000e¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0018\u0012\u0004\u0012\u00020\u000e0\u0013¢\u0006\u0002\b\u0019X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0010\u0010\u001c\u001a\u00020\u001dX\u0004¢\u0006\u0004\n\u0002\u0010\u001e\u0002\u0004\n\u0002\b\u0019¨\u0006,"}, d2 = {"DEBUG", "", "DefaultPositionThreshold", "Landroidx/compose/ui/unit/Dp;", "getDefaultPositionThreshold", "()F", "F", "EmptyInteractionSources", "androidx/compose/foundation/pager/PagerStateKt$EmptyInteractionSources$1", "Landroidx/compose/foundation/pager/PagerStateKt$EmptyInteractionSources$1;", "EmptyLayoutInfo", "androidx/compose/foundation/pager/PagerStateKt$EmptyLayoutInfo$1", "Landroidx/compose/foundation/pager/PagerStateKt$EmptyLayoutInfo$1;", "MaxPageOffset", "", "MaxPagesForAnimateScroll", "", "MinPageOffset", "SnapAlignmentStartToStart", "Lkotlin/Function3;", "Landroidx/compose/ui/unit/Density;", "Lkotlin/ParameterName;", "name", "layoutSize", "itemSize", "Lkotlin/ExtensionFunctionType;", "getSnapAlignmentStartToStart", "()Lkotlin/jvm/functions/Function3;", "UnitDensity", "androidx/compose/foundation/pager/PagerStateKt$UnitDensity$1", "Landroidx/compose/foundation/pager/PagerStateKt$UnitDensity$1;", "debugLog", "", "generateMsg", "Lkotlin/Function0;", "", "rememberPagerState", "Landroidx/compose/foundation/pager/PagerState;", "initialPage", "initialPageOffsetFraction", "(IFLandroidx/compose/runtime/Composer;II)Landroidx/compose/foundation/pager/PagerState;", "animateToNextPage", "(Landroidx/compose/foundation/pager/PagerState;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "animateToPreviousPage", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: PagerState.kt */
public final class PagerStateKt {
    private static final boolean DEBUG = false;
    private static final float DefaultPositionThreshold = Dp.m5626constructorimpl((float) 56);
    /* access modifiers changed from: private */
    public static final PagerStateKt$EmptyInteractionSources$1 EmptyInteractionSources = new PagerStateKt$EmptyInteractionSources$1();
    /* access modifiers changed from: private */
    public static final PagerStateKt$EmptyLayoutInfo$1 EmptyLayoutInfo = new PagerStateKt$EmptyLayoutInfo$1();
    private static final float MaxPageOffset = 0.5f;
    private static final int MaxPagesForAnimateScroll = 3;
    private static final float MinPageOffset = -0.5f;
    private static final Function3<Density, Float, Float, Float> SnapAlignmentStartToStart = PagerStateKt$SnapAlignmentStartToStart$1.INSTANCE;
    /* access modifiers changed from: private */
    public static final PagerStateKt$UnitDensity$1 UnitDensity = new PagerStateKt$UnitDensity$1();

    private static final void debugLog(Function0<String> function0) {
    }

    public static final float getDefaultPositionThreshold() {
        return DefaultPositionThreshold;
    }

    public static final Function3<Density, Float, Float, Float> getSnapAlignmentStartToStart() {
        return SnapAlignmentStartToStart;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v0, resolved type: kotlin.jvm.functions.Function0} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final androidx.compose.foundation.pager.PagerState rememberPagerState(int r10, float r11, androidx.compose.runtime.Composer r12, int r13, int r14) {
        /*
            r0 = 144687223(0x89fc077, float:9.614713E-34)
            r12.startReplaceableGroup(r0)
            java.lang.String r1 = "C(rememberPagerState)70@2945L108,70@2902L151:PagerState.kt#g6yjnt"
            androidx.compose.runtime.ComposerKt.sourceInformation(r12, r1)
            r1 = r14 & 1
            r2 = 0
            if (r1 == 0) goto L_0x0011
            r10 = r2
        L_0x0011:
            r14 = r14 & 2
            if (r14 == 0) goto L_0x0016
            r11 = 0
        L_0x0016:
            boolean r14 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r14 == 0) goto L_0x0023
            r14 = -1
            java.lang.String r1 = "androidx.compose.foundation.pager.rememberPagerState (PagerState.kt:66)"
            androidx.compose.runtime.ComposerKt.traceEventStart(r0, r13, r14, r1)
        L_0x0023:
            java.lang.Object[] r3 = new java.lang.Object[r2]
            androidx.compose.foundation.pager.PagerState$Companion r13 = androidx.compose.foundation.pager.PagerState.Companion
            androidx.compose.runtime.saveable.Saver r4 = r13.getSaver()
            r5 = 0
            java.lang.Integer r13 = java.lang.Integer.valueOf(r10)
            java.lang.Float r14 = java.lang.Float.valueOf(r11)
            r0 = 511388516(0x1e7b2b64, float:1.3296802E-20)
            r12.startReplaceableGroup(r0)
            java.lang.String r0 = "CC(remember)P(1,2):Composables.kt#9igjgp"
            androidx.compose.runtime.ComposerKt.sourceInformation(r12, r0)
            boolean r13 = r12.changed((java.lang.Object) r13)
            boolean r14 = r12.changed((java.lang.Object) r14)
            r13 = r13 | r14
            java.lang.Object r14 = r12.rememberedValue()
            if (r13 != 0) goto L_0x0056
            androidx.compose.runtime.Composer$Companion r13 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r13 = r13.getEmpty()
            if (r14 != r13) goto L_0x0061
        L_0x0056:
            androidx.compose.foundation.pager.PagerStateKt$rememberPagerState$1$1 r13 = new androidx.compose.foundation.pager.PagerStateKt$rememberPagerState$1$1
            r13.<init>(r10, r11)
            r14 = r13
            kotlin.jvm.functions.Function0 r14 = (kotlin.jvm.functions.Function0) r14
            r12.updateRememberedValue(r14)
        L_0x0061:
            r12.endReplaceableGroup()
            r6 = r14
            kotlin.jvm.functions.Function0 r6 = (kotlin.jvm.functions.Function0) r6
            r8 = 72
            r9 = 4
            r7 = r12
            java.lang.Object r10 = androidx.compose.runtime.saveable.RememberSaveableKt.rememberSaveable((java.lang.Object[]) r3, r4, (java.lang.String) r5, r6, (androidx.compose.runtime.Composer) r7, (int) r8, (int) r9)
            androidx.compose.foundation.pager.PagerState r10 = (androidx.compose.foundation.pager.PagerState) r10
            boolean r11 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r11 == 0) goto L_0x007a
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L_0x007a:
            r12.endReplaceableGroup()
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.pager.PagerStateKt.rememberPagerState(int, float, androidx.compose.runtime.Composer, int, int):androidx.compose.foundation.pager.PagerState");
    }

    public static final Object animateToNextPage(PagerState pagerState, Continuation<? super Unit> continuation) {
        if (pagerState.getCurrentPage() + 1 >= pagerState.getPageCount$foundation_release()) {
            return Unit.INSTANCE;
        }
        Object animateScrollToPage$default = PagerState.animateScrollToPage$default(pagerState, pagerState.getCurrentPage() + 1, 0.0f, (AnimationSpec) null, continuation, 6, (Object) null);
        return animateScrollToPage$default == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? animateScrollToPage$default : Unit.INSTANCE;
    }

    public static final Object animateToPreviousPage(PagerState pagerState, Continuation<? super Unit> continuation) {
        if (pagerState.getCurrentPage() - 1 < 0) {
            return Unit.INSTANCE;
        }
        Object animateScrollToPage$default = PagerState.animateScrollToPage$default(pagerState, pagerState.getCurrentPage() - 1, 0.0f, (AnimationSpec) null, continuation, 6, (Object) null);
        return animateScrollToPage$default == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? animateScrollToPage$default : Unit.INSTANCE;
    }
}
