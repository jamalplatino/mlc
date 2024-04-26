package androidx.compose.foundation.pager;

import androidx.compose.foundation.layout.BoxWithConstraintsScope;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.ui.unit.Density;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;

@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* compiled from: Pager.kt */
final class PagerKt$Pager$4 extends Lambda implements Function3<BoxWithConstraintsScope, Composer, Integer, Unit> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ int $$dirty1;
    final /* synthetic */ int $beyondBoundsPageCount;
    final /* synthetic */ float $calculatedContentPaddings;
    final /* synthetic */ PaddingValues $contentPadding;
    final /* synthetic */ Density $density;
    final /* synthetic */ Alignment.Horizontal $horizontalAlignment;
    final /* synthetic */ boolean $isVertical;
    final /* synthetic */ Function1<Integer, Object> $key;
    final /* synthetic */ Function3<Integer, Composer, Integer, Unit> $pageContent;
    final /* synthetic */ int $pageCount;
    final /* synthetic */ NestedScrollConnection $pageNestedScrollConnection;
    final /* synthetic */ PageSize $pageSize;
    final /* synthetic */ float $pageSpacing;
    final /* synthetic */ PagerWrapperFlingBehavior $pagerFlingBehavior;
    final /* synthetic */ boolean $reverseLayout;
    final /* synthetic */ PagerState $state;
    final /* synthetic */ boolean $userScrollEnabled;
    final /* synthetic */ Alignment.Vertical $verticalAlignment;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    PagerKt$Pager$4(boolean z, Density density, float f, float f2, boolean z2, PagerState pagerState, int i, PaddingValues paddingValues, PagerWrapperFlingBehavior pagerWrapperFlingBehavior, boolean z3, int i2, Alignment.Horizontal horizontal, Alignment.Vertical vertical, int i3, PageSize pageSize, int i4, Function1<? super Integer, ? extends Object> function1, NestedScrollConnection nestedScrollConnection, Function3<? super Integer, ? super Composer, ? super Integer, Unit> function3) {
        super(3);
        this.$isVertical = z;
        this.$density = density;
        this.$pageSpacing = f;
        this.$calculatedContentPaddings = f2;
        this.$reverseLayout = z2;
        this.$state = pagerState;
        this.$$dirty = i;
        this.$contentPadding = paddingValues;
        this.$pagerFlingBehavior = pagerWrapperFlingBehavior;
        this.$userScrollEnabled = z3;
        this.$beyondBoundsPageCount = i2;
        this.$horizontalAlignment = horizontal;
        this.$verticalAlignment = vertical;
        this.$$dirty1 = i3;
        this.$pageSize = pageSize;
        this.$pageCount = i4;
        this.$key = function1;
        this.$pageNestedScrollConnection = nestedScrollConnection;
        this.$pageContent = function3;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        invoke((BoxWithConstraintsScope) obj, (Composer) obj2, ((Number) obj3).intValue());
        return Unit.INSTANCE;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:39:0x010a, code lost:
        if (r6 == androidx.compose.runtime.Composer.Companion.getEmpty()) goto L_0x010c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void invoke(androidx.compose.foundation.layout.BoxWithConstraintsScope r27, androidx.compose.runtime.Composer r28, int r29) {
        /*
            r26 = this;
            r0 = r26
            r1 = r27
            r14 = r28
            r2 = r29
            java.lang.String r3 = "$this$BoxWithConstraints"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r3)
            java.lang.String r3 = "C298@14092L550,321@14914L298,329@15222L1387:Pager.kt#g6yjnt"
            androidx.compose.runtime.ComposerKt.sourceInformation(r14, r3)
            r3 = r2 & 14
            r4 = 4
            if (r3 != 0) goto L_0x0022
            boolean r3 = r14.changed((java.lang.Object) r1)
            if (r3 == 0) goto L_0x001f
            r3 = r4
            goto L_0x0020
        L_0x001f:
            r3 = 2
        L_0x0020:
            r3 = r3 | r2
            goto L_0x0023
        L_0x0022:
            r3 = r2
        L_0x0023:
            r3 = r3 & 91
            r5 = 18
            if (r3 != r5) goto L_0x0035
            boolean r3 = r28.getSkipping()
            if (r3 != 0) goto L_0x0030
            goto L_0x0035
        L_0x0030:
            r28.skipToGroupEnd()
            goto L_0x01bf
        L_0x0035:
            boolean r3 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r3 == 0) goto L_0x0045
            r3 = -1
            java.lang.String r5 = "androidx.compose.foundation.pager.Pager.<anonymous> (Pager.kt:295)"
            r6 = -1677736225(0xffffffff9bffc6df, float:-4.2314729E-22)
            androidx.compose.runtime.ComposerKt.traceEventStart(r6, r2, r3, r5)
        L_0x0045:
            boolean r2 = r0.$isVertical
            if (r2 == 0) goto L_0x0052
            long r1 = r27.m447getConstraintsmsEJaDk()
            int r1 = androidx.compose.ui.unit.Constraints.m5569getMaxHeightimpl(r1)
            goto L_0x005a
        L_0x0052:
            long r1 = r27.m447getConstraintsmsEJaDk()
            int r1 = androidx.compose.ui.unit.Constraints.m5570getMaxWidthimpl(r1)
        L_0x005a:
            androidx.compose.ui.unit.Density r2 = r0.$density
            java.lang.Integer r3 = java.lang.Integer.valueOf(r1)
            float r5 = r0.$pageSpacing
            androidx.compose.ui.unit.Dp r5 = androidx.compose.ui.unit.Dp.m5624boximpl(r5)
            float r6 = r0.$calculatedContentPaddings
            androidx.compose.ui.unit.Dp r6 = androidx.compose.ui.unit.Dp.m5624boximpl(r6)
            java.lang.Object[] r2 = new java.lang.Object[]{r2, r3, r5, r6}
            androidx.compose.ui.unit.Density r3 = r0.$density
            float r5 = r0.$pageSpacing
            float r6 = r0.$calculatedContentPaddings
            androidx.compose.foundation.pager.PageSize r7 = r0.$pageSize
            r8 = -568225417(0xffffffffde219177, float:-2.91055434E18)
            r14.startReplaceableGroup(r8)
            java.lang.String r8 = "CC(remember)P(1):Composables.kt#9igjgp"
            androidx.compose.runtime.ComposerKt.sourceInformation(r14, r8)
            r9 = 0
            r10 = r9
        L_0x0085:
            if (r9 >= r4) goto L_0x0091
            r11 = r2[r9]
            boolean r11 = r14.changed((java.lang.Object) r11)
            r10 = r10 | r11
            int r9 = r9 + 1
            goto L_0x0085
        L_0x0091:
            java.lang.Object r2 = r28.rememberedValue()
            if (r10 != 0) goto L_0x009f
            androidx.compose.runtime.Composer$Companion r4 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r4 = r4.getEmpty()
            if (r2 != r4) goto L_0x00c1
        L_0x009f:
            int r2 = r3.m5601roundToPx0680j_4(r5)
            int r4 = r3.m5601roundToPx0680j_4(r6)
            int r1 = r1 - r4
            int r1 = r7.calculateMainAxisPageSize(r3, r1, r2)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            float r1 = r3.m5604toDpu2uoSUM((int) r1)
            androidx.compose.ui.unit.Dp r2 = androidx.compose.ui.unit.Dp.m5624boximpl(r1)
            r14.updateRememberedValue(r2)
        L_0x00c1:
            r28.endReplaceableGroup()
            androidx.compose.ui.unit.Dp r2 = (androidx.compose.ui.unit.Dp) r2
            float r13 = r2.m5640unboximpl()
            boolean r1 = r0.$reverseLayout
            if (r1 != 0) goto L_0x00d5
            androidx.compose.ui.Alignment$Companion r1 = androidx.compose.ui.Alignment.Companion
            androidx.compose.ui.Alignment$Horizontal r1 = r1.getStart()
            goto L_0x00db
        L_0x00d5:
            androidx.compose.ui.Alignment$Companion r1 = androidx.compose.ui.Alignment.Companion
            androidx.compose.ui.Alignment$Horizontal r1 = r1.getEnd()
        L_0x00db:
            boolean r2 = r0.$reverseLayout
            if (r2 != 0) goto L_0x00e6
            androidx.compose.ui.Alignment$Companion r2 = androidx.compose.ui.Alignment.Companion
            androidx.compose.ui.Alignment$Vertical r2 = r2.getTop()
            goto L_0x00ec
        L_0x00e6:
            androidx.compose.ui.Alignment$Companion r2 = androidx.compose.ui.Alignment.Companion
            androidx.compose.ui.Alignment$Vertical r2 = r2.getBottom()
        L_0x00ec:
            r3 = r2
            androidx.compose.foundation.pager.PagerState r2 = r0.$state
            androidx.compose.ui.unit.Density r4 = r0.$density
            r5 = 1157296644(0x44faf204, float:2007.563)
            r14.startReplaceableGroup(r5)
            androidx.compose.runtime.ComposerKt.sourceInformation(r14, r8)
            boolean r5 = r14.changed((java.lang.Object) r2)
            java.lang.Object r6 = r28.rememberedValue()
            if (r5 != 0) goto L_0x010c
            androidx.compose.runtime.Composer$Companion r5 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r5 = r5.getEmpty()
            if (r6 != r5) goto L_0x0129
        L_0x010c:
            int r4 = r4.m5601roundToPx0680j_4(r13)
            float r4 = (float) r4
            float r5 = r2.getInitialPageOffsetFraction()
            float r4 = r4 * r5
            androidx.compose.foundation.lazy.LazyListState r6 = new androidx.compose.foundation.lazy.LazyListState
            int r5 = r2.getInitialPage()
            int r4 = kotlin.math.MathKt.roundToInt((float) r4)
            r6.<init>(r5, r4)
            r2.loadNewState$foundation_release(r6)
            r14.updateRememberedValue(r6)
        L_0x0129:
            r28.endReplaceableGroup()
            r2 = r6
            androidx.compose.foundation.lazy.LazyListState r2 = (androidx.compose.foundation.lazy.LazyListState) r2
            androidx.compose.ui.Modifier$Companion r4 = androidx.compose.ui.Modifier.Companion
            androidx.compose.foundation.layout.Arrangement r5 = androidx.compose.foundation.layout.Arrangement.INSTANCE
            float r6 = r0.$pageSpacing
            androidx.compose.foundation.layout.Arrangement$Horizontal r12 = r5.m411spacedByD5KLDUw((float) r6, (androidx.compose.ui.Alignment.Horizontal) r1)
            androidx.compose.foundation.layout.Arrangement r1 = androidx.compose.foundation.layout.Arrangement.INSTANCE
            float r5 = r0.$pageSpacing
            androidx.compose.foundation.layout.Arrangement$Vertical r10 = r1.m412spacedByD5KLDUw((float) r5, (androidx.compose.ui.Alignment.Vertical) r3)
            r1 = r4
            androidx.compose.ui.Modifier r1 = (androidx.compose.ui.Modifier) r1
            androidx.compose.foundation.layout.PaddingValues r3 = r0.$contentPadding
            boolean r4 = r0.$reverseLayout
            boolean r5 = r0.$isVertical
            androidx.compose.foundation.pager.PagerWrapperFlingBehavior r6 = r0.$pagerFlingBehavior
            androidx.compose.foundation.gestures.FlingBehavior r6 = (androidx.compose.foundation.gestures.FlingBehavior) r6
            boolean r7 = r0.$userScrollEnabled
            int r8 = r0.$beyondBoundsPageCount
            androidx.compose.ui.Alignment$Horizontal r9 = r0.$horizontalAlignment
            androidx.compose.ui.Alignment$Vertical r11 = r0.$verticalAlignment
            androidx.compose.foundation.pager.PagerKt$Pager$4$1 r23 = new androidx.compose.foundation.pager.PagerKt$Pager$4$1
            int r15 = r0.$pageCount
            kotlin.jvm.functions.Function1<java.lang.Integer, java.lang.Object> r14 = r0.$key
            r27 = r1
            boolean r1 = r0.$isVertical
            r29 = r2
            androidx.compose.ui.input.nestedscroll.NestedScrollConnection r2 = r0.$pageNestedScrollConnection
            r24 = r3
            kotlin.jvm.functions.Function3<java.lang.Integer, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> r3 = r0.$pageContent
            r25 = r4
            int r4 = r0.$$dirty1
            r16 = r15
            r15 = r23
            r17 = r14
            r18 = r1
            r19 = r13
            r20 = r2
            r21 = r3
            r22 = r4
            r15.<init>(r16, r17, r18, r19, r20, r21, r22)
            r13 = r23
            kotlin.jvm.functions.Function1 r13 = (kotlin.jvm.functions.Function1) r13
            int r1 = r0.$$dirty
            int r2 = r1 >> 21
            r2 = r2 & 896(0x380, float:1.256E-42)
            r2 = r2 | 6
            int r3 = r0.$$dirty1
            int r4 = r3 << 3
            r4 = r4 & 7168(0x1c00, float:1.0045E-41)
            r2 = r2 | r4
            int r3 = r3 << 15
            r4 = 3670016(0x380000, float:5.142788E-39)
            r3 = r3 & r4
            r2 = r2 | r3
            r3 = 29360128(0x1c00000, float:7.052966E-38)
            int r4 = r1 << 3
            r3 = r3 & r4
            r2 = r2 | r3
            r3 = 234881024(0xe000000, float:1.5777218E-30)
            r3 = r3 & r1
            r15 = r2 | r3
            int r1 = r1 >> 21
            r16 = r1 & 14
            r17 = 0
            r14 = r28
            r1 = r27
            r2 = r29
            r3 = r24
            r4 = r25
            androidx.compose.foundation.lazy.LazyListKt.LazyList(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            boolean r1 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r1 == 0) goto L_0x01bf
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L_0x01bf:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.pager.PagerKt$Pager$4.invoke(androidx.compose.foundation.layout.BoxWithConstraintsScope, androidx.compose.runtime.Composer, int):void");
    }
}
