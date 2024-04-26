package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.foundation.lazy.layout.LazyLayoutItemProviderKt;
import androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope;
import androidx.compose.foundation.lazy.layout.LazyLayoutPinnedItemList;
import androidx.compose.runtime.snapshots.Snapshot;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArrayDeque;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.math.MathKt;

@Metadata(d1 = {"\u0000\u0001\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\u001a\u0017\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\b\u001a5\u0010\u0007\u001a\u0002H\b\"\u0004\b\u0000\u0010\b2\u0006\u0010\t\u001a\u00020\n2\u0017\u0010\u000b\u001a\u0013\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u0002H\b0\f¢\u0006\u0002\b\rH\b¢\u0006\u0002\u0010\u000e\u001aJ\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010*\u00020\u00122\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00110\f2!\u0010\u0015\u001a\u001d\u0012\u0013\u0012\u00110\u0016¢\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(\u0019\u0012\u0004\u0012\u00020\u00010\fH\b\u001a;\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010*\u00020\u00122\u0012\u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u001d0\u001c2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u0016H\u0002¢\u0006\u0002\u0010!\u001a\u001d\u0010\"\u001a\u00020\u0006*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u001d0\u001cH\u0002¢\u0006\u0002\u0010#\u001a\u001c\u0010$\u001a\u00020\u0003*\u00020\u00122\u0006\u0010%\u001a\u00020\u001f2\u0006\u0010&\u001a\u00020\u0016H\u0002\u001a\u001c\u0010'\u001a\u00020\u0016*\u00020\u00122\u0006\u0010(\u001a\u00020\u00162\u0006\u0010)\u001a\u00020\u0016H\u0002\u001a.\u0010*\u001a\u00020\u0003*\u00020+2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00030\fH\bø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b,\u0010-\u001a\f\u0010.\u001a\u00020\u0016*\u00020\u001fH\u0002\u001a2\u0010/\u001a\u00020\u0016\"\u0004\b\u0000\u0010\b*\b\u0012\u0004\u0012\u0002H\b0\u001c2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u0002H\b\u0012\u0004\u0012\u00020\u00160\fH\b¢\u0006\u0002\u00100\u001a\u0016\u00101\u001a\u00020\u0016*\u00020\u001f2\b\b\u0002\u00102\u001a\u00020\u0016H\u0000\u001a!\u00103\u001a\u00020\u0016*\u00020\u001f2\u0006\u00104\u001a\u00020+H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b5\u00106\u001a,\u00107\u001a\u000208*\u00020\u00122\u0006\u00109\u001a\u00020\u00162\u0006\u0010:\u001a\u00020\u001f2\u0006\u0010;\u001a\u00020\u001f2\u0006\u0010<\u001a\u00020\u0001H\u0003\u001ay\u0010=\u001a\u000208*\u00020\n2\u0006\u0010>\u001a\u00020?2\u0006\u0010@\u001a\u00020A2\u0006\u0010B\u001a\u00020\u001f2\u0006\u0010C\u001a\u00020D2\u0006\u0010E\u001a\u00020\u00012\u0006\u0010F\u001a\u00020\u00012\u0006\u0010G\u001a\u00020H2\u0006\u0010I\u001a\u00020\u00162\u0006\u0010J\u001a\u00020\u00162\u0006\u0010K\u001a\u00020\u00162\u0006\u0010L\u001a\u00020\u00162\u0006\u0010M\u001a\u00020\u0016H\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bN\u0010O\u001a\u0014\u0010P\u001a\u00020\u0003*\u00020\u001f2\u0006\u0010Q\u001a\u00020\u0016H\u0002\u001a!\u0010R\u001a\u00020\u001f*\u00020\u001f2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00160\fH\b\"\u000e\u0010\u0000\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006S"}, d2 = {"DebugLoggingEnabled", "", "debugLog", "", "message", "Lkotlin/Function0;", "", "withDebugLogging", "T", "scope", "Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;", "block", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "(Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "calculateExtraItems", "", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridPositionedItem;", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext;", "position", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasuredItem;", "filter", "", "Lkotlin/ParameterName;", "name", "itemIndex", "calculatePositionedItems", "measuredItems", "", "Lkotlin/collections/ArrayDeque;", "itemScrollOffsets", "", "mainAxisLayoutSize", "(Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext;[Lkotlin/collections/ArrayDeque;[II)Ljava/util/List;", "debugRender", "([Lkotlin/collections/ArrayDeque;)Ljava/lang/String;", "ensureIndicesInRange", "indices", "itemCount", "findPreviousItemIndex", "item", "lane", "forEach", "Landroidx/compose/foundation/lazy/staggeredgrid/SpanRange;", "forEach-nIS5qE8", "(JLkotlin/jvm/functions/Function1;)V", "indexOfMaxValue", "indexOfMinBy", "([Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)I", "indexOfMinValue", "minBound", "maxInRange", "indexRange", "maxInRange-jy6DScQ", "([IJ)I", "measure", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureResult;", "initialScrollDelta", "initialItemIndices", "initialItemOffsets", "canRestartMeasure", "measureStaggeredGrid", "state", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;", "itemProvider", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridItemProvider;", "resolvedSlotSums", "constraints", "Landroidx/compose/ui/unit/Constraints;", "isVertical", "reverseLayout", "contentOffset", "Landroidx/compose/ui/unit/IntOffset;", "mainAxisAvailableSize", "mainAxisSpacing", "crossAxisSpacing", "beforeContentPadding", "afterContentPadding", "measureStaggeredGrid-BTfHGGE", "(Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridItemProvider;[IJZZJIIIII)Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureResult;", "offsetBy", "delta", "transform", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: LazyStaggeredGridMeasure.kt */
public final class LazyStaggeredGridMeasureKt {
    private static final boolean DebugLoggingEnabled = false;

    private static final void debugLog(Function0<String> function0) {
    }

    private static final String debugRender(ArrayDeque<LazyStaggeredGridMeasuredItem>[] arrayDequeArr) {
        return "";
    }

    private static final <T> T withDebugLogging(LazyLayoutMeasureScope lazyLayoutMeasureScope, Function1<? super LazyLayoutMeasureScope, ? extends T> function1) {
        return function1.invoke(lazyLayoutMeasureScope);
    }

    /* renamed from: measureStaggeredGrid-BTfHGGE  reason: not valid java name */
    public static final LazyStaggeredGridMeasureResult m784measureStaggeredGridBTfHGGE(LazyLayoutMeasureScope lazyLayoutMeasureScope, LazyStaggeredGridState lazyStaggeredGridState, LazyStaggeredGridItemProvider lazyStaggeredGridItemProvider, int[] iArr, long j, boolean z, boolean z2, long j2, int i, int i2, int i3, int i4, int i5) {
        Snapshot makeCurrent;
        Object obj;
        Object obj2;
        int i6;
        int i7;
        int[] iArr2 = iArr;
        Intrinsics.checkNotNullParameter(lazyLayoutMeasureScope, "$this$measureStaggeredGrid");
        Intrinsics.checkNotNullParameter(lazyStaggeredGridState, "state");
        Intrinsics.checkNotNullParameter(lazyStaggeredGridItemProvider, "itemProvider");
        Intrinsics.checkNotNullParameter(iArr2, "resolvedSlotSums");
        LazyStaggeredGridMeasureContext lazyStaggeredGridMeasureContext = r1;
        LazyStaggeredGridMeasureContext lazyStaggeredGridMeasureContext2 = new LazyStaggeredGridMeasureContext(lazyStaggeredGridState, lazyStaggeredGridItemProvider, iArr, j, z, lazyLayoutMeasureScope, i, j2, i4, i5, z2, i2, i3, (DefaultConstructorMarker) null);
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
        Snapshot createNonObservableSnapshot = Snapshot.Companion.createNonObservableSnapshot();
        try {
            makeCurrent = createNonObservableSnapshot.makeCurrent();
            int[] indices = lazyStaggeredGridState.getScrollPosition$foundation_release().getIndices();
            int[] offsets = lazyStaggeredGridState.getScrollPosition$foundation_release().getOffsets();
            if (indices.length == iArr2.length) {
                obj = indices;
            } else {
                lazyStaggeredGridMeasureContext.getLaneInfo().reset();
                int length = iArr2.length;
                int[] iArr3 = new int[length];
                for (int i8 = 0; i8 < length; i8++) {
                    if (i8 < indices.length && (i7 = indices[i8]) != -1) {
                        i6 = i7;
                    } else if (i8 == 0) {
                        i6 = 0;
                    } else {
                        i6 = m783maxInRangejy6DScQ(iArr3, SpanRange.m794constructorimpl(0, i8)) + 1;
                    }
                    iArr3[i8] = i6;
                    lazyStaggeredGridMeasureContext.getLaneInfo().setLane(iArr3[i8], i8);
                }
                obj = iArr3;
            }
            objectRef.element = obj;
            if (offsets.length == iArr2.length) {
                obj2 = offsets;
            } else {
                int length2 = iArr2.length;
                int[] iArr4 = new int[length2];
                int i9 = 0;
                while (i9 < length2) {
                    iArr4[i9] = i9 < offsets.length ? offsets[i9] : i9 == 0 ? 0 : iArr4[i9 - 1];
                    i9++;
                }
                obj2 = iArr4;
            }
            objectRef2.element = obj2;
            Unit unit = Unit.INSTANCE;
            createNonObservableSnapshot.restoreCurrent(makeCurrent);
            createNonObservableSnapshot.dispose();
            return measure(lazyStaggeredGridMeasureContext, MathKt.roundToInt(lazyStaggeredGridState.getScrollToBeConsumed$foundation_release()), (int[]) objectRef.element, (int[]) objectRef2.element, true);
        } catch (Throwable th) {
            createNonObservableSnapshot.dispose();
            throw th;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:134:0x02d7, code lost:
        r5 = indexOfMinValue$default(r4, 0, 1, (java.lang.Object) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x02e2, code lost:
        if (r5 == indexOfMaxValue(r27)) goto L_0x02e5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x02e4, code lost:
        r1 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x02e5, code lost:
        r7 = r27[r5];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x02e8, code lost:
        if (r7 != -1) goto L_0x02eb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x02ea, code lost:
        r7 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x02eb, code lost:
        r7 = findPreviousItemIndex(r0, r7, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x02ef, code lost:
        if (r7 >= 0) goto L_0x032f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x02f1, code lost:
        r8 = r27;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x02f3, code lost:
        if (r1 != false) goto L_0x02fb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x02f9, code lost:
        if (measure$lambda$37$misalignedStart(r8, r0, r4, r5) == false) goto L_0x0325;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x02fb, code lost:
        if (r41 == false) goto L_0x0325;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x02fd, code lost:
        r37.getLaneInfo().reset();
        r1 = r8.length;
        r2 = new int[r1];
        r3 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:0x0308, code lost:
        if (r3 >= r1) goto L_0x0310;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x030a, code lost:
        r2[r3] = -1;
        r3 = r3 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x0310, code lost:
        r1 = r4.length;
        r3 = new int[r1];
        r6 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:0x0314, code lost:
        if (r6 >= r1) goto L_0x031d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:152:0x0316, code lost:
        r3[r6] = r4[r5];
        r6 = r6 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x0324, code lost:
        return measure(r0, r26, r2, r3, false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x0325, code lost:
        r13 = r26;
        r40 = r2;
        r38 = r10;
        r24 = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x032f, code lost:
        r13 = r26;
        r8 = r27;
        r38 = r10;
        r24 = r11;
        r10 = r0.m780getSpanRangelOCCd4c(r37.getItemProvider(), r7, r5);
        r5 = r37.getLaneInfo();
        r26 = r15;
        r14 = (int) (r10 & 4294967295L);
        r27 = r1;
        r40 = r2;
        r1 = (int) (r10 >> 32);
        r2 = r14 - r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x0359, code lost:
        if (r2 == 1) goto L_0x035d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x035b, code lost:
        r15 = -2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:159:0x035d, code lost:
        r15 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x035e, code lost:
        r5.setLane(r7, r15);
        r5 = r37.getMeasuredItemProvider().m788getAndMeasurejy6DScQ(r7, r10);
        r10 = m783maxInRangejy6DScQ(r4, r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:161:0x036e, code lost:
        if (r2 == 1) goto L_0x0379;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x0370, code lost:
        r2 = r37.getLaneInfo().getGaps(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:163:0x0379, code lost:
        r2 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:164:0x037a, code lost:
        if (r1 >= r14) goto L_0x039a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:166:0x037e, code lost:
        if (r4[r1] == r10) goto L_0x0382;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:167:0x0380, code lost:
        r27 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:168:0x0382, code lost:
        r9[r1].addFirst(r5);
        r8[r1] = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:169:0x0389, code lost:
        if (r2 != null) goto L_0x038d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:170:0x038b, code lost:
        r11 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:171:0x038d, code lost:
        r11 = r2[r1];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:172:0x038f, code lost:
        r4[r1] = (r5.getSizeWithSpacings() + r10) + r11;
        r1 = r1 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:230:0x051c, code lost:
        if (r8[r10] > r3) goto L_0x0534;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:237:0x0534, code lost:
        r20 = r5;
        r21 = r6;
        r5 = r0.m780getSpanRangelOCCd4c(r37.getItemProvider(), r3, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:238:0x0541, code lost:
        if (r14 != null) goto L_0x054b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:239:0x0543, code lost:
        r14 = new java.util.ArrayList();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:240:0x054b, code lost:
        r3 = r37.getMeasuredItemProvider().m788getAndMeasurejy6DScQ(r3, r5);
        r11 = r11 - r3.getSizeWithSpacings();
        r14.add(r3.position(0, r11, 0, r7));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:293:0x06af, code lost:
        r7 = r25;
        r13 = r26;
        r8 = r27;
        r4 = r28;
        r25 = r3;
        r24 = r11;
        r2 = r0.m780getSpanRangelOCCd4c(r37.getItemProvider(), r1, r5);
        r5 = r37.getLaneInfo();
        r14 = r6;
        r11 = r7;
        r6 = (int) (r2 & 4294967295L);
        r38 = r14;
        r13 = (int) (r2 >> 32);
        r14 = r6 - r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:294:0x06dc, code lost:
        if (r14 == 1) goto L_0x06e0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:295:0x06de, code lost:
        r7 = -2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:296:0x06e0, code lost:
        r7 = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:297:0x06e1, code lost:
        r5.setLane(r1, r7);
        r5 = r37.getMeasuredItemProvider().m788getAndMeasurejy6DScQ(r1, r2);
        r2 = m783maxInRangejy6DScQ(r12, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:298:0x06f1, code lost:
        if (r14 == 1) goto L_0x0704;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:299:0x06f3, code lost:
        r14 = r37.getLaneInfo().getGaps(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:300:0x06fb, code lost:
        if (r14 != null) goto L_0x0705;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:301:0x06fd, code lost:
        r14 = new int[r37.getLaneCount()];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:302:0x0704, code lost:
        r14 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:303:0x0705, code lost:
        r7 = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:304:0x0706, code lost:
        if (r7 >= r6) goto L_0x0723;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:305:0x0708, code lost:
        if (r14 == null) goto L_0x0710;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:306:0x070a, code lost:
        r14[r7] = r2 - r12[r7];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:307:0x0710, code lost:
        r10[r7] = r1;
        r12[r7] = r2 + r5.getSizeWithSpacings();
        r9[r7].addLast(r5);
        r7 = r7 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:308:0x0723, code lost:
        r37.getLaneInfo().setGaps(r1, r14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:309:0x0732, code lost:
        if (r12[r13] > (r29 + r37.getMainAxisSpacing())) goto L_0x0738;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:310:0x0734, code lost:
        r5.setVisible(false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x020b, code lost:
        r2 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x0221, code lost:
        r5 = indexOfMinValue$default(r12, 0, 1, (java.lang.Object) null);
        r1 = kotlin.collections.ArraysKt.maxOrThrow(r10) + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x022a, code lost:
        if (r1 < r15) goto L_0x06af;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static final androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasureResult measure(androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasureContext r37, int r38, int[] r39, int[] r40, boolean r41) {
        /*
            r0 = r37
            r1 = r38
            r2 = r39
            r3 = r40
            androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope r4 = r37.getMeasureScope()
            androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemProvider r5 = r37.getItemProvider()
            int r15 = r5.getItemCount()
            if (r15 <= 0) goto L_0x0746
            int r5 = r37.getLaneCount()
            if (r5 != 0) goto L_0x001e
            goto L_0x0746
        L_0x001e:
            int r5 = r2.length
            int[] r7 = java.util.Arrays.copyOf(r2, r5)
            java.lang.String r5 = "copyOf(this, size)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r7, r5)
            int r2 = r3.length
            int[] r8 = java.util.Arrays.copyOf(r3, r2)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r8, r5)
            ensureIndicesInRange(r0, r7, r15)
            int r2 = -r1
            offsetBy(r8, r2)
            int r6 = r37.getLaneCount()
            kotlin.collections.ArrayDeque[] r9 = new kotlin.collections.ArrayDeque[r6]
            r2 = 0
        L_0x003f:
            if (r2 >= r6) goto L_0x004d
            kotlin.collections.ArrayDeque r3 = new kotlin.collections.ArrayDeque
            r11 = 16
            r3.<init>((int) r11)
            r9[r2] = r3
            int r2 = r2 + 1
            goto L_0x003f
        L_0x004d:
            int r2 = r37.getBeforeContentPadding()
            int r2 = -r2
            offsetBy(r8, r2)
        L_0x0055:
            boolean r2 = measure$lambda$37$hasSpaceBeforeFirst(r7, r8, r0)
            if (r2 == 0) goto L_0x00d5
            int r2 = indexOfMaxValue(r7)
            r14 = r7[r2]
            int r10 = r8.length
            r3 = 0
        L_0x0063:
            if (r3 >= r10) goto L_0x0076
            r11 = r7[r3]
            r12 = r7[r2]
            if (r11 == r12) goto L_0x0073
            r11 = r8[r3]
            r12 = r8[r2]
            if (r11 >= r12) goto L_0x0073
            r8[r3] = r12
        L_0x0073:
            int r3 = r3 + 1
            goto L_0x0063
        L_0x0076:
            int r3 = findPreviousItemIndex(r0, r14, r2)
            if (r3 >= 0) goto L_0x007d
            goto L_0x00d6
        L_0x007d:
            androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemProvider r10 = r37.getItemProvider()
            long r10 = r0.m780getSpanRangelOCCd4c(r10, r3, r2)
            androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridLaneInfo r2 = r37.getLaneInfo()
            r12 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r12 = r12 & r10
            int r12 = (int) r12
            r13 = 32
            long r13 = r10 >> r13
            int r13 = (int) r13
            int r14 = r12 - r13
            r17 = r13
            r13 = 1
            if (r14 == r13) goto L_0x009e
            r13 = -2
            goto L_0x00a0
        L_0x009e:
            r13 = r17
        L_0x00a0:
            r2.setLane(r3, r13)
            androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasureProvider r2 = r37.getMeasuredItemProvider()
            androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasuredItem r2 = r2.m788getAndMeasurejy6DScQ(r3, r10)
            int r10 = m783maxInRangejy6DScQ(r8, r10)
            r11 = 1
            if (r14 == r11) goto L_0x00bb
            androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridLaneInfo r11 = r37.getLaneInfo()
            int[] r11 = r11.getGaps(r3)
            goto L_0x00bc
        L_0x00bb:
            r11 = 0
        L_0x00bc:
            r13 = r17
        L_0x00be:
            if (r13 >= r12) goto L_0x0055
            r7[r13] = r3
            if (r11 != 0) goto L_0x00c6
            r14 = 0
            goto L_0x00c8
        L_0x00c6:
            r14 = r11[r13]
        L_0x00c8:
            int r16 = r2.getSizeWithSpacings()
            int r16 = r10 + r16
            int r16 = r16 + r14
            r8[r13] = r16
            int r13 = r13 + 1
            goto L_0x00be
        L_0x00d5:
            r2 = -1
        L_0x00d6:
            int r3 = r37.getBeforeContentPadding()
            int r3 = -r3
            r10 = 0
            r11 = r8[r10]
            if (r11 >= r3) goto L_0x00e6
            int r1 = r1 + r11
            int r11 = r3 - r11
            offsetBy(r8, r11)
        L_0x00e6:
            int r11 = r37.getBeforeContentPadding()
            offsetBy(r8, r11)
            r11 = -1
            if (r2 != r11) goto L_0x00f4
            int r2 = kotlin.collections.ArraysKt.indexOf((int[]) r7, (int) r10)
        L_0x00f4:
            if (r2 == r11) goto L_0x0124
            boolean r10 = measure$lambda$37$misalignedStart(r7, r0, r8, r2)
            if (r10 == 0) goto L_0x0124
            if (r41 == 0) goto L_0x0124
            androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridLaneInfo r3 = r37.getLaneInfo()
            r3.reset()
            int r3 = r7.length
            int[] r4 = new int[r3]
            r5 = 0
        L_0x0109:
            if (r5 >= r3) goto L_0x0111
            r4[r5] = r11
            int r5 = r5 + 1
            r11 = -1
            goto L_0x0109
        L_0x0111:
            int r3 = r8.length
            int[] r5 = new int[r3]
            r6 = 0
        L_0x0115:
            if (r6 >= r3) goto L_0x011e
            r7 = r8[r2]
            r5[r6] = r7
            int r6 = r6 + 1
            goto L_0x0115
        L_0x011e:
            r6 = 0
            androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasureResult r0 = measure(r0, r1, r4, r5, r6)
            return r0
        L_0x0124:
            int r2 = r7.length
            int[] r10 = java.util.Arrays.copyOf(r7, r2)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r10, r5)
            int r11 = r8.length
            int[] r12 = new int[r11]
            r2 = 0
        L_0x0130:
            if (r2 >= r11) goto L_0x013a
            r13 = r8[r2]
            int r13 = -r13
            r12[r2] = r13
            int r2 = r2 + 1
            goto L_0x0130
        L_0x013a:
            int r2 = r37.getMainAxisAvailableSize()
            int r13 = r37.getAfterContentPadding()
            int r2 = r2 + r13
            r13 = 0
            int r2 = kotlin.ranges.RangesKt.coerceAtLeast((int) r2, (int) r13)
            r23 = r4
            r4 = 1
            r14 = 0
            int r24 = indexOfMinValue$default(r10, r13, r4, r14)
            r13 = r24
            r4 = 0
        L_0x0153:
            r14 = -1
            if (r13 == r14) goto L_0x01ee
            int r14 = r37.getLaneCount()
            if (r4 >= r14) goto L_0x01ee
            r14 = r10[r13]
            int r24 = indexOfMinValue(r10, r14)
            int r4 = r4 + 1
            if (r14 < 0) goto L_0x01ce
            r38 = r4
            androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemProvider r4 = r37.getItemProvider()
            r25 = r5
            long r4 = r0.m780getSpanRangelOCCd4c(r4, r14, r13)
            androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasureProvider r13 = r37.getMeasuredItemProvider()
            androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasuredItem r13 = r13.m788getAndMeasurejy6DScQ(r14, r4)
            r26 = r1
            androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridLaneInfo r1 = r37.getLaneInfo()
            r27 = r7
            r28 = r8
            r21 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r7 = r4 & r21
            int r7 = (int) r7
            r40 = r2
            r29 = r3
            r8 = 32
            long r2 = r4 >> r8
            int r2 = (int) r2
            int r3 = r7 - r2
            r8 = 1
            if (r3 == r8) goto L_0x019c
            r8 = -2
            goto L_0x019d
        L_0x019c:
            r8 = r2
        L_0x019d:
            r1.setLane(r14, r8)
            int r1 = m783maxInRangejy6DScQ(r12, r4)
            int r4 = r13.getSizeWithSpacings()
            int r1 = r1 + r4
            r4 = r2
        L_0x01aa:
            if (r4 >= r7) goto L_0x01b8
            r12[r4] = r1
            r10[r4] = r14
            r5 = r9[r4]
            r5.addLast(r13)
            int r4 = r4 + 1
            goto L_0x01aa
        L_0x01b8:
            r1 = r12[r2]
            int r2 = r37.getMainAxisSpacing()
            int r2 = r29 + r2
            if (r1 > r2) goto L_0x01c6
            r1 = 0
            r13.setVisible(r1)
        L_0x01c6:
            r1 = 1
            if (r3 == r1) goto L_0x01dc
            int r4 = r37.getLaneCount()
            goto L_0x01de
        L_0x01ce:
            r26 = r1
            r40 = r2
            r29 = r3
            r38 = r4
            r25 = r5
            r27 = r7
            r28 = r8
        L_0x01dc:
            r4 = r38
        L_0x01de:
            r2 = r40
            r13 = r24
            r5 = r25
            r1 = r26
            r7 = r27
            r8 = r28
            r3 = r29
            goto L_0x0153
        L_0x01ee:
            r26 = r1
            r40 = r2
            r29 = r3
            r25 = r5
            r27 = r7
            r28 = r8
        L_0x01fa:
            r1 = 0
        L_0x01fb:
            if (r1 >= r11) goto L_0x020f
            r2 = r12[r1]
            r3 = r40
            if (r2 < r3) goto L_0x020b
            if (r2 > 0) goto L_0x0206
            goto L_0x020b
        L_0x0206:
            int r1 = r1 + 1
            r40 = r3
            goto L_0x01fb
        L_0x020b:
            r1 = 0
            r2 = 1
            r4 = 0
            goto L_0x0221
        L_0x020f:
            r3 = r40
            r1 = 0
        L_0x0212:
            if (r1 >= r6) goto L_0x020b
            r2 = r9[r1]
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L_0x021e
            r2 = 1
            goto L_0x022c
        L_0x021e:
            int r1 = r1 + 1
            goto L_0x0212
        L_0x0221:
            int r5 = indexOfMinValue$default(r12, r4, r2, r1)
            int r1 = kotlin.collections.ArraysKt.maxOrThrow((int[]) r10)
            int r1 = r1 + r2
            if (r1 < r15) goto L_0x06af
        L_0x022c:
            r1 = 0
        L_0x022d:
            if (r1 >= r6) goto L_0x0283
            r4 = r9[r1]
        L_0x0231:
            int r5 = r4.size()
            if (r5 <= r2) goto L_0x026f
            java.lang.Object r5 = r4.first()
            androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasuredItem r5 = (androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasuredItem) r5
            boolean r5 = r5.isVisible()
            if (r5 != 0) goto L_0x026f
            java.lang.Object r5 = r4.removeFirst()
            androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasuredItem r5 = (androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasuredItem) r5
            int r7 = r5.getSpan()
            if (r7 == r2) goto L_0x025c
            androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridLaneInfo r2 = r37.getLaneInfo()
            int r7 = r5.getIndex()
            int[] r2 = r2.getGaps(r7)
            goto L_0x025d
        L_0x025c:
            r2 = 0
        L_0x025d:
            r7 = r28[r1]
            int r5 = r5.getSizeWithSpacings()
            if (r2 != 0) goto L_0x0267
            r2 = 0
            goto L_0x0269
        L_0x0267:
            r2 = r2[r1]
        L_0x0269:
            int r5 = r5 + r2
            int r7 = r7 - r5
            r28[r1] = r7
            r2 = 1
            goto L_0x0231
        L_0x026f:
            java.lang.Object r2 = r4.firstOrNull()
            androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasuredItem r2 = (androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasuredItem) r2
            if (r2 == 0) goto L_0x027c
            int r2 = r2.getIndex()
            goto L_0x027d
        L_0x027c:
            r2 = -1
        L_0x027d:
            r27[r1] = r2
            int r1 = r1 + 1
            r2 = 1
            goto L_0x022d
        L_0x0283:
            int r1 = r10.length
            r2 = 0
        L_0x0285:
            if (r2 >= r1) goto L_0x0299
            r4 = r10[r2]
            int r5 = r15 + -1
            if (r4 != r5) goto L_0x0296
            int r1 = r37.getMainAxisSpacing()
            int r1 = -r1
            offsetBy(r12, r1)
            goto L_0x0299
        L_0x0296:
            int r2 = r2 + 1
            goto L_0x0285
        L_0x0299:
            r1 = 0
        L_0x029a:
            if (r1 >= r11) goto L_0x02b6
            r2 = r12[r1]
            int r4 = r37.getMainAxisAvailableSize()
            if (r2 >= r4) goto L_0x02a7
            int r1 = r1 + 1
            goto L_0x029a
        L_0x02a7:
            r38 = r10
            r24 = r11
            r1 = r26
            r8 = r27
            r4 = r28
            r14 = 0
            r26 = r15
            goto L_0x03ef
        L_0x02b6:
            int r1 = indexOfMaxValue(r12)
            int r2 = r37.getMainAxisAvailableSize()
            r1 = r12[r1]
            int r2 = r2 - r1
            int r1 = -r2
            r4 = r28
            offsetBy(r4, r1)
            offsetBy(r12, r2)
            r1 = 0
        L_0x02cb:
            int r5 = r4.length
            r7 = 0
        L_0x02cd:
            if (r7 >= r5) goto L_0x03bc
            r8 = r4[r7]
            int r13 = r37.getBeforeContentPadding()
            if (r8 >= r13) goto L_0x03aa
            r8 = 0
            r13 = 1
            r14 = 0
            int r5 = indexOfMinValue$default(r4, r14, r13, r8)
            int r7 = indexOfMaxValue(r27)
            if (r5 == r7) goto L_0x02e5
            r1 = 1
        L_0x02e5:
            r7 = r27[r5]
            r8 = -1
            if (r7 != r8) goto L_0x02eb
            r7 = r15
        L_0x02eb:
            int r7 = findPreviousItemIndex(r0, r7, r5)
            if (r7 >= 0) goto L_0x032f
            r8 = r27
            if (r1 != 0) goto L_0x02fb
            boolean r7 = measure$lambda$37$misalignedStart(r8, r0, r4, r5)
            if (r7 == 0) goto L_0x0325
        L_0x02fb:
            if (r41 == 0) goto L_0x0325
            androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridLaneInfo r1 = r37.getLaneInfo()
            r1.reset()
            int r1 = r8.length
            int[] r2 = new int[r1]
            r3 = 0
        L_0x0308:
            if (r3 >= r1) goto L_0x0310
            r6 = -1
            r2[r3] = r6
            int r3 = r3 + 1
            goto L_0x0308
        L_0x0310:
            int r1 = r4.length
            int[] r3 = new int[r1]
            r6 = 0
        L_0x0314:
            if (r6 >= r1) goto L_0x031d
            r7 = r4[r5]
            r3[r6] = r7
            int r6 = r6 + 1
            goto L_0x0314
        L_0x031d:
            r13 = r26
            r6 = 0
            androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasureResult r0 = measure(r0, r13, r2, r3, r6)
            return r0
        L_0x0325:
            r13 = r26
            r40 = r2
            r38 = r10
            r24 = r11
            goto L_0x03c6
        L_0x032f:
            r13 = r26
            r8 = r27
            androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemProvider r14 = r37.getItemProvider()
            r38 = r10
            r24 = r11
            long r10 = r0.m780getSpanRangelOCCd4c(r14, r7, r5)
            androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridLaneInfo r5 = r37.getLaneInfo()
            r26 = r15
            r21 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r14 = r10 & r21
            int r14 = (int) r14
            r27 = r1
            r40 = r2
            r15 = 32
            long r1 = r10 >> r15
            int r1 = (int) r1
            int r2 = r14 - r1
            r15 = 1
            if (r2 == r15) goto L_0x035d
            r15 = -2
            goto L_0x035e
        L_0x035d:
            r15 = r1
        L_0x035e:
            r5.setLane(r7, r15)
            androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasureProvider r5 = r37.getMeasuredItemProvider()
            androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasuredItem r5 = r5.m788getAndMeasurejy6DScQ(r7, r10)
            int r10 = m783maxInRangejy6DScQ(r4, r10)
            r11 = 1
            if (r2 == r11) goto L_0x0379
            androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridLaneInfo r2 = r37.getLaneInfo()
            int[] r2 = r2.getGaps(r7)
            goto L_0x037a
        L_0x0379:
            r2 = 0
        L_0x037a:
            if (r1 >= r14) goto L_0x039a
            r11 = r4[r1]
            if (r11 == r10) goto L_0x0382
            r27 = 1
        L_0x0382:
            r11 = r9[r1]
            r11.addFirst(r5)
            r8[r1] = r7
            if (r2 != 0) goto L_0x038d
            r11 = 0
            goto L_0x038f
        L_0x038d:
            r11 = r2[r1]
        L_0x038f:
            int r15 = r5.getSizeWithSpacings()
            int r15 = r15 + r10
            int r15 = r15 + r11
            r4[r1] = r15
            int r1 = r1 + 1
            goto L_0x037a
        L_0x039a:
            r10 = r38
            r2 = r40
            r11 = r24
            r15 = r26
            r1 = r27
            r27 = r8
            r26 = r13
            goto L_0x02cb
        L_0x03aa:
            r40 = r2
            r38 = r10
            r24 = r11
            r13 = r26
            r8 = r27
            r26 = r15
            int r7 = r7 + 1
            r26 = r13
            goto L_0x02cd
        L_0x03bc:
            r40 = r2
            r38 = r10
            r24 = r11
            r13 = r26
            r8 = r27
        L_0x03c6:
            r26 = r15
            if (r1 == 0) goto L_0x03d9
            if (r41 == 0) goto L_0x03d9
            androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridLaneInfo r1 = r37.getLaneInfo()
            r1.reset()
            r1 = 0
            androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasureResult r0 = measure(r0, r13, r8, r4, r1)
            return r0
        L_0x03d9:
            r1 = 0
            int r2 = r13 + r40
            r5 = 1
            r14 = 0
            int r7 = indexOfMinValue$default(r4, r1, r5, r14)
            r1 = r4[r7]
            if (r1 >= 0) goto L_0x03ee
            int r2 = r2 + r1
            offsetBy(r12, r1)
            int r1 = -r1
            offsetBy(r4, r1)
        L_0x03ee:
            r1 = r2
        L_0x03ef:
            androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState r2 = r37.getState()
            float r2 = r2.getScrollToBeConsumed$foundation_release()
            int r2 = kotlin.math.MathKt.roundToInt((float) r2)
            int r2 = kotlin.math.MathKt.getSign((int) r2)
            int r5 = kotlin.math.MathKt.getSign((int) r1)
            if (r2 != r5) goto L_0x041d
            androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState r2 = r37.getState()
            float r2 = r2.getScrollToBeConsumed$foundation_release()
            int r2 = kotlin.math.MathKt.roundToInt((float) r2)
            int r2 = java.lang.Math.abs(r2)
            int r5 = java.lang.Math.abs(r1)
            if (r2 < r5) goto L_0x041d
            float r1 = (float) r1
            goto L_0x0425
        L_0x041d:
            androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState r1 = r37.getState()
            float r1 = r1.getScrollToBeConsumed$foundation_release()
        L_0x0425:
            int r2 = r4.length
            int[] r2 = java.util.Arrays.copyOf(r4, r2)
            r7 = r25
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r7)
            int r5 = r2.length
            r7 = 0
        L_0x0431:
            if (r7 >= r5) goto L_0x043b
            r10 = r2[r7]
            int r10 = -r10
            r2[r7] = r10
            int r7 = r7 + 1
            goto L_0x0431
        L_0x043b:
            int r5 = r37.getBeforeContentPadding()
            if (r5 <= 0) goto L_0x0490
            r5 = 0
        L_0x0442:
            if (r5 >= r6) goto L_0x0490
            r7 = r9[r5]
            int r10 = r7.size()
            r11 = 0
        L_0x044b:
            if (r11 >= r10) goto L_0x048c
            java.lang.Object r13 = r7.get(r11)
            androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasuredItem r13 = (androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasuredItem) r13
            androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridLaneInfo r15 = r37.getLaneInfo()
            int r14 = r13.getIndex()
            int[] r14 = r15.getGaps(r14)
            int r13 = r13.getSizeWithSpacings()
            if (r14 != 0) goto L_0x0467
            r14 = 0
            goto L_0x0469
        L_0x0467:
            r14 = r14[r5]
        L_0x0469:
            int r13 = r13 + r14
            r14 = r7
            java.util.List r14 = (java.util.List) r14
            int r14 = kotlin.collections.CollectionsKt.getLastIndex(r14)
            if (r11 == r14) goto L_0x048c
            r14 = r4[r5]
            if (r14 == 0) goto L_0x048c
            if (r14 < r13) goto L_0x048c
            int r14 = r14 - r13
            r4[r5] = r14
            int r11 = r11 + 1
            java.lang.Object r13 = r7.get(r11)
            androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasuredItem r13 = (androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasuredItem) r13
            int r13 = r13.getIndex()
            r8[r5] = r13
            r14 = 0
            goto L_0x044b
        L_0x048c:
            int r5 = r5 + 1
            r14 = 0
            goto L_0x0442
        L_0x0490:
            boolean r5 = r37.isVertical()
            if (r5 == 0) goto L_0x049f
            long r5 = r37.m777getConstraintsmsEJaDk()
            int r5 = androidx.compose.ui.unit.Constraints.m5570getMaxWidthimpl(r5)
            goto L_0x04ab
        L_0x049f:
            long r5 = r37.m777getConstraintsmsEJaDk()
            int r7 = kotlin.collections.ArraysKt.maxOrThrow((int[]) r12)
            int r5 = androidx.compose.ui.unit.ConstraintsKt.m5584constrainWidthK40F9xA(r5, r7)
        L_0x04ab:
            boolean r6 = r37.isVertical()
            if (r6 == 0) goto L_0x04be
            long r6 = r37.m777getConstraintsmsEJaDk()
            int r10 = kotlin.collections.ArraysKt.maxOrThrow((int[]) r12)
            int r6 = androidx.compose.ui.unit.ConstraintsKt.m5583constrainHeightK40F9xA(r6, r10)
            goto L_0x04c6
        L_0x04be:
            long r6 = r37.m777getConstraintsmsEJaDk()
            int r6 = androidx.compose.ui.unit.Constraints.m5569getMaxHeightimpl(r6)
        L_0x04c6:
            boolean r7 = r37.isVertical()
            if (r7 == 0) goto L_0x04ce
            r7 = r6
            goto L_0x04cf
        L_0x04ce:
            r7 = r5
        L_0x04cf:
            int r10 = r37.getMainAxisAvailableSize()
            int r7 = java.lang.Math.min(r7, r10)
            r10 = 0
            r11 = r2[r10]
            androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState r10 = r37.getState()
            androidx.compose.foundation.lazy.layout.LazyLayoutPinnedItemList r10 = r10.getPinnedItems$foundation_release()
            java.util.List r10 = (java.util.List) r10
            int r13 = r10.size()
            r14 = 0
            r15 = 0
        L_0x04ea:
            if (r15 >= r13) goto L_0x056d
            java.lang.Object r20 = r10.get(r15)
            androidx.compose.foundation.lazy.layout.LazyLayoutPinnedItemList$PinnedItem r20 = (androidx.compose.foundation.lazy.layout.LazyLayoutPinnedItemList.PinnedItem) r20
            androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemProvider r21 = r37.getItemProvider()
            r40 = r10
            r10 = r21
            androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider r10 = (androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider) r10
            r41 = r13
            java.lang.Object r13 = r20.getKey()
            r25 = r3
            int r3 = r20.getIndex()
            int r3 = androidx.compose.foundation.lazy.layout.LazyLayoutItemProviderKt.findIndexByKey(r10, r13, r3)
            androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridLaneInfo r10 = r37.getLaneInfo()
            int r10 = r10.getLane(r3)
            r13 = -2
            if (r10 == r13) goto L_0x051f
            r13 = -1
            if (r10 == r13) goto L_0x051f
            r10 = r8[r10]
            if (r10 <= r3) goto L_0x052e
            goto L_0x0534
        L_0x051f:
            int r10 = r8.length
            r13 = 0
        L_0x0521:
            if (r13 >= r10) goto L_0x0534
            r20 = r10
            r10 = r8[r13]
            if (r10 <= r3) goto L_0x052e
            int r13 = r13 + 1
            r10 = r20
            goto L_0x0521
        L_0x052e:
            r20 = r5
            r21 = r6
            r13 = 0
            goto L_0x055f
        L_0x0534:
            androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemProvider r10 = r37.getItemProvider()
            r20 = r5
            r21 = r6
            r13 = 0
            long r5 = r0.m780getSpanRangelOCCd4c(r10, r3, r13)
            if (r14 != 0) goto L_0x054b
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            r14 = r10
            java.util.List r14 = (java.util.List) r14
        L_0x054b:
            androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasureProvider r10 = r37.getMeasuredItemProvider()
            androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasuredItem r3 = r10.m788getAndMeasurejy6DScQ(r3, r5)
            int r5 = r3.getSizeWithSpacings()
            int r11 = r11 - r5
            androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridPositionedItem r3 = r3.position(r13, r11, r13, r7)
            r14.add(r3)
        L_0x055f:
            int r15 = r15 + 1
            r10 = r40
            r13 = r41
            r5 = r20
            r6 = r21
            r3 = r25
            goto L_0x04ea
        L_0x056d:
            r25 = r3
            r20 = r5
            r21 = r6
            r13 = 0
            if (r14 != 0) goto L_0x057a
            java.util.List r14 = kotlin.collections.CollectionsKt.emptyList()
        L_0x057a:
            java.util.List r15 = calculatePositionedItems(r0, r9, r2, r7)
            r2 = r2[r13]
            androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState r3 = r37.getState()
            androidx.compose.foundation.lazy.layout.LazyLayoutPinnedItemList r3 = r3.getPinnedItems$foundation_release()
            java.util.List r3 = (java.util.List) r3
            int r5 = r3.size()
            r6 = 0
            r9 = 0
        L_0x0590:
            if (r9 >= r5) goto L_0x0624
            java.lang.Object r10 = r3.get(r9)
            androidx.compose.foundation.lazy.layout.LazyLayoutPinnedItemList$PinnedItem r10 = (androidx.compose.foundation.lazy.layout.LazyLayoutPinnedItemList.PinnedItem) r10
            androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemProvider r11 = r37.getItemProvider()
            androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider r11 = (androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider) r11
            java.lang.Object r13 = r10.getKey()
            int r10 = r10.getIndex()
            int r10 = androidx.compose.foundation.lazy.layout.LazyLayoutItemProviderKt.findIndexByKey(r11, r13, r10)
            r11 = r26
            if (r10 < r11) goto L_0x05b5
            r13 = r38
            r40 = r3
        L_0x05b2:
            r38 = r5
            goto L_0x05e4
        L_0x05b5:
            androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridLaneInfo r13 = r37.getLaneInfo()
            int r13 = r13.getLane(r10)
            r40 = r3
            r3 = -2
            if (r13 == r3) goto L_0x05d1
            r3 = -1
            if (r13 == r3) goto L_0x05d1
            r13 = r38[r13]
            if (r13 >= r10) goto L_0x05ce
            r13 = r38
            r38 = r5
            goto L_0x05e9
        L_0x05ce:
            r13 = r38
            goto L_0x05b2
        L_0x05d1:
            r13 = r38
            int r3 = r13.length
            r38 = r5
            r5 = 0
        L_0x05d7:
            if (r5 >= r3) goto L_0x05e9
            r22 = r3
            r3 = r13[r5]
            if (r3 >= r10) goto L_0x05e4
            int r5 = r5 + 1
            r3 = r22
            goto L_0x05d7
        L_0x05e4:
            r22 = r14
            r41 = r15
            goto L_0x0614
        L_0x05e9:
            androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemProvider r3 = r37.getItemProvider()
            r22 = r14
            r41 = r15
            r5 = 0
            long r14 = r0.m780getSpanRangelOCCd4c(r3, r10, r5)
            if (r6 != 0) goto L_0x0600
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r6 = r3
            java.util.List r6 = (java.util.List) r6
        L_0x0600:
            androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasureProvider r3 = r37.getMeasuredItemProvider()
            androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasuredItem r3 = r3.m788getAndMeasurejy6DScQ(r10, r14)
            androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridPositionedItem r10 = r3.position(r5, r2, r5, r7)
            int r3 = r3.getSizeWithSpacings()
            int r2 = r2 + r3
            r6.add(r10)
        L_0x0614:
            int r9 = r9 + 1
            r5 = r38
            r3 = r40
            r15 = r41
            r26 = r11
            r38 = r13
            r14 = r22
            goto L_0x0590
        L_0x0624:
            r13 = r38
            r22 = r14
            r41 = r15
            r11 = r26
            if (r6 != 0) goto L_0x0632
            java.util.List r6 = kotlin.collections.CollectionsKt.emptyList()
        L_0x0632:
            r2 = 0
            r3 = r8[r2]
            if (r3 != 0) goto L_0x063e
            r3 = r4[r2]
            if (r3 <= 0) goto L_0x063c
            goto L_0x063e
        L_0x063c:
            r2 = 0
            goto L_0x063f
        L_0x063e:
            r2 = 1
        L_0x063f:
            r3 = r24
            r10 = 0
        L_0x0642:
            if (r10 >= r3) goto L_0x0650
            r5 = r12[r10]
            int r7 = r37.getMainAxisAvailableSize()
            if (r5 <= r7) goto L_0x064d
            goto L_0x0660
        L_0x064d:
            int r10 = r10 + 1
            goto L_0x0642
        L_0x0650:
            int r3 = r13.length
            r10 = 0
        L_0x0652:
            if (r10 >= r3) goto L_0x0660
            r5 = r13[r10]
            int r15 = r11 + -1
            if (r5 >= r15) goto L_0x065d
            int r10 = r10 + 1
            goto L_0x0652
        L_0x065d:
            r18 = 0
            goto L_0x0662
        L_0x0660:
            r18 = 1
        L_0x0662:
            r30 = r23
            androidx.compose.ui.layout.MeasureScope r30 = (androidx.compose.ui.layout.MeasureScope) r30
            r33 = 0
            androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasureKt$measure$1$29 r3 = new androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasureKt$measure$1$29
            r5 = r41
            r14 = r22
            r3.<init>(r14, r5, r6, r0)
            r34 = r3
            kotlin.jvm.functions.Function1 r34 = (kotlin.jvm.functions.Function1) r34
            r35 = 4
            r36 = 0
            r31 = r20
            r32 = r21
            androidx.compose.ui.layout.MeasureResult r10 = androidx.compose.ui.layout.MeasureScope.layout$default(r30, r31, r32, r33, r34, r35, r36)
            boolean r13 = r37.isVertical()
            r3 = r20
            r6 = r21
            long r16 = androidx.compose.ui.unit.IntSizeKt.IntSize(r3, r6)
            int r20 = r37.getBeforeContentPadding()
            int r21 = r37.getAfterContentPadding()
            int r22 = r37.getMainAxisSpacing()
            androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasureResult r0 = new androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasureResult
            r6 = r0
            r23 = 0
            r7 = r8
            r8 = r4
            r9 = r1
            r15 = r11
            r11 = r18
            r12 = r2
            r14 = r15
            r15 = r5
            r18 = r29
            r19 = r25
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r18, r19, r20, r21, r22, r23)
            return r0
        L_0x06af:
            r7 = r25
            r13 = r26
            r8 = r27
            r4 = r28
            r25 = r3
            r3 = r11
            androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemProvider r2 = r37.getItemProvider()
            r24 = r3
            long r2 = r0.m780getSpanRangelOCCd4c(r2, r1, r5)
            androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridLaneInfo r5 = r37.getLaneInfo()
            r14 = r6
            r11 = r7
            r21 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r6 = r2 & r21
            int r6 = (int) r6
            r38 = r14
            r7 = 32
            long r13 = r2 >> r7
            int r13 = (int) r13
            int r14 = r6 - r13
            r7 = 1
            if (r14 == r7) goto L_0x06e0
            r7 = -2
            goto L_0x06e1
        L_0x06e0:
            r7 = r13
        L_0x06e1:
            r5.setLane(r1, r7)
            androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasureProvider r5 = r37.getMeasuredItemProvider()
            androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasuredItem r5 = r5.m788getAndMeasurejy6DScQ(r1, r2)
            int r2 = m783maxInRangejy6DScQ(r12, r2)
            r3 = 1
            if (r14 == r3) goto L_0x0704
            androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridLaneInfo r7 = r37.getLaneInfo()
            int[] r14 = r7.getGaps(r1)
            if (r14 != 0) goto L_0x0705
            int r7 = r37.getLaneCount()
            int[] r14 = new int[r7]
            goto L_0x0705
        L_0x0704:
            r14 = 0
        L_0x0705:
            r7 = r13
        L_0x0706:
            if (r7 >= r6) goto L_0x0723
            if (r14 == 0) goto L_0x0710
            r19 = r12[r7]
            int r19 = r2 - r19
            r14[r7] = r19
        L_0x0710:
            r10[r7] = r1
            int r19 = r5.getSizeWithSpacings()
            int r19 = r2 + r19
            r12[r7] = r19
            r3 = r9[r7]
            r3.addLast(r5)
            int r7 = r7 + 1
            r3 = 1
            goto L_0x0706
        L_0x0723:
            androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridLaneInfo r2 = r37.getLaneInfo()
            r2.setGaps(r1, r14)
            r1 = r12[r13]
            int r2 = r37.getMainAxisSpacing()
            int r3 = r29 + r2
            if (r1 > r3) goto L_0x0738
            r1 = 0
            r5.setVisible(r1)
        L_0x0738:
            r6 = r38
            r28 = r4
            r27 = r8
            r40 = r25
            r25 = r11
            r11 = r24
            goto L_0x01fa
        L_0x0746:
            r23 = r4
            r30 = r23
            androidx.compose.ui.layout.MeasureScope r30 = (androidx.compose.ui.layout.MeasureScope) r30
            long r3 = r37.m777getConstraintsmsEJaDk()
            int r31 = androidx.compose.ui.unit.Constraints.m5572getMinWidthimpl(r3)
            long r3 = r37.m777getConstraintsmsEJaDk()
            int r32 = androidx.compose.ui.unit.Constraints.m5571getMinHeightimpl(r3)
            r33 = 0
            androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasureKt$measure$1$1 r1 = androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasureKt$measure$1$1.INSTANCE
            r34 = r1
            kotlin.jvm.functions.Function1 r34 = (kotlin.jvm.functions.Function1) r34
            r35 = 4
            r36 = 0
            androidx.compose.ui.layout.MeasureResult r5 = androidx.compose.ui.layout.MeasureScope.layout$default(r30, r31, r32, r33, r34, r35, r36)
            boolean r8 = r37.isVertical()
            java.util.List r10 = kotlin.collections.CollectionsKt.emptyList()
            long r3 = r37.m777getConstraintsmsEJaDk()
            int r1 = androidx.compose.ui.unit.Constraints.m5572getMinWidthimpl(r3)
            long r3 = r37.m777getConstraintsmsEJaDk()
            int r3 = androidx.compose.ui.unit.Constraints.m5571getMinHeightimpl(r3)
            long r11 = androidx.compose.ui.unit.IntSizeKt.IntSize(r1, r3)
            int r1 = r37.getBeforeContentPadding()
            int r13 = -r1
            int r1 = r37.getMainAxisAvailableSize()
            int r3 = r37.getAfterContentPadding()
            int r14 = r1 + r3
            int r1 = r37.getBeforeContentPadding()
            r9 = r15
            r15 = r1
            int r16 = r37.getAfterContentPadding()
            int r17 = r37.getMainAxisSpacing()
            androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasureResult r0 = new androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasureResult
            r1 = r0
            r4 = 0
            r6 = 0
            r7 = 0
            r18 = 0
            r2 = r39
            r3 = r40
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r13, r14, r15, r16, r17, r18)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasureKt.measure(androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasureContext, int, int[], int[], boolean):androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasureResult");
    }

    private static final boolean measure$lambda$37$hasSpaceBeforeFirst(int[] iArr, int[] iArr2, LazyStaggeredGridMeasureContext lazyStaggeredGridMeasureContext) {
        int length = iArr.length;
        for (int i = 0; i < length; i++) {
            int i2 = iArr[i];
            if (iArr2[i] < Math.max(-lazyStaggeredGridMeasureContext.getMainAxisSpacing(), 0) && i2 > 0) {
                return true;
            }
        }
        return false;
    }

    private static final boolean measure$lambda$37$misalignedStart(int[] iArr, LazyStaggeredGridMeasureContext lazyStaggeredGridMeasureContext, int[] iArr2, int i) {
        int length = iArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (findPreviousItemIndex(lazyStaggeredGridMeasureContext, iArr[i2], i2) == -1 && iArr2[i2] != iArr2[i]) {
                return true;
            }
        }
        int length2 = iArr.length;
        for (int i3 = 0; i3 < length2; i3++) {
            if (findPreviousItemIndex(lazyStaggeredGridMeasureContext, iArr[i3], i3) != -1 && iArr2[i3] >= iArr2[i]) {
                return true;
            }
        }
        int lane = lazyStaggeredGridMeasureContext.getLaneInfo().getLane(0);
        if (lane == 0 || lane == -1 || lane == -2) {
            return false;
        }
        return true;
    }

    private static final List<LazyStaggeredGridPositionedItem> calculatePositionedItems(LazyStaggeredGridMeasureContext lazyStaggeredGridMeasureContext, ArrayDeque<LazyStaggeredGridMeasuredItem>[] arrayDequeArr, int[] iArr, int i) {
        int i2;
        int i3 = 0;
        for (ArrayDeque<LazyStaggeredGridMeasuredItem> size : arrayDequeArr) {
            i3 += size.size();
        }
        ArrayList arrayList = new ArrayList(i3);
        while (true) {
            int length = arrayDequeArr.length;
            int i4 = 0;
            while (i4 < length) {
                if (!arrayDequeArr[i4].isEmpty()) {
                    int length2 = arrayDequeArr.length;
                    int i5 = -1;
                    int i6 = Integer.MAX_VALUE;
                    for (int i7 = 0; i7 < length2; i7++) {
                        LazyStaggeredGridMeasuredItem firstOrNull = arrayDequeArr[i7].firstOrNull();
                        int index = firstOrNull != null ? firstOrNull.getIndex() : Integer.MAX_VALUE;
                        if (i6 > index) {
                            i5 = i7;
                            i6 = index;
                        }
                    }
                    LazyStaggeredGridMeasuredItem removeFirst = arrayDequeArr[i5].removeFirst();
                    if (removeFirst.getLane() == i5) {
                        long r5 = SpanRange.m794constructorimpl(removeFirst.getLane(), removeFirst.getSpan());
                        int r3 = m783maxInRangejy6DScQ(iArr, r5);
                        if (i5 == 0) {
                            i2 = 0;
                        } else {
                            i2 = lazyStaggeredGridMeasureContext.getResolvedSlotSums()[i5 - 1] + (lazyStaggeredGridMeasureContext.getCrossAxisSpacing() * i5);
                        }
                        if (!removeFirst.getPlaceables().isEmpty()) {
                            arrayList.add(removeFirst.position(i5, r3, i2, i));
                            int i8 = (int) (r5 & 4294967295L);
                            for (int i9 = (int) (r5 >> 32); i9 < i8; i9++) {
                                iArr[i9] = removeFirst.getSizeWithSpacings() + r3;
                            }
                        }
                    }
                } else {
                    i4++;
                }
            }
            return arrayList;
        }
    }

    private static final List<LazyStaggeredGridPositionedItem> calculateExtraItems(LazyStaggeredGridMeasureContext lazyStaggeredGridMeasureContext, Function1<? super LazyStaggeredGridMeasuredItem, LazyStaggeredGridPositionedItem> function1, Function1<? super Integer, Boolean> function12) {
        List pinnedItems$foundation_release = lazyStaggeredGridMeasureContext.getState().getPinnedItems$foundation_release();
        int size = pinnedItems$foundation_release.size();
        List<LazyStaggeredGridPositionedItem> list = null;
        for (int i = 0; i < size; i++) {
            LazyLayoutPinnedItemList.PinnedItem pinnedItem = (LazyLayoutPinnedItemList.PinnedItem) pinnedItems$foundation_release.get(i);
            int findIndexByKey = LazyLayoutItemProviderKt.findIndexByKey(lazyStaggeredGridMeasureContext.getItemProvider(), pinnedItem.getKey(), pinnedItem.getIndex());
            if (function12.invoke(Integer.valueOf(findIndexByKey)).booleanValue()) {
                long r6 = lazyStaggeredGridMeasureContext.m780getSpanRangelOCCd4c(lazyStaggeredGridMeasureContext.getItemProvider(), findIndexByKey, 0);
                if (list == null) {
                    list = new ArrayList<>();
                }
                list.add(function1.invoke(lazyStaggeredGridMeasureContext.getMeasuredItemProvider().m788getAndMeasurejy6DScQ(findIndexByKey, r6)));
            }
        }
        return list == null ? CollectionsKt.emptyList() : list;
    }

    /* renamed from: forEach-nIS5qE8  reason: not valid java name */
    private static final void m782forEachnIS5qE8(long j, Function1<? super Integer, Unit> function1) {
        int i = (int) (j & 4294967295L);
        for (int i2 = (int) (j >> 32); i2 < i; i2++) {
            function1.invoke(Integer.valueOf(i2));
        }
    }

    private static final void offsetBy(int[] iArr, int i) {
        int length = iArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            iArr[i2] = iArr[i2] + i;
        }
    }

    /* renamed from: maxInRange-jy6DScQ  reason: not valid java name */
    private static final int m783maxInRangejy6DScQ(int[] iArr, long j) {
        int i = (int) (j & 4294967295L);
        int i2 = Integer.MIN_VALUE;
        for (int i3 = (int) (j >> 32); i3 < i; i3++) {
            i2 = Math.max(i2, iArr[i3]);
        }
        return i2;
    }

    public static /* synthetic */ int indexOfMinValue$default(int[] iArr, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = Integer.MIN_VALUE;
        }
        return indexOfMinValue(iArr, i);
    }

    public static final int indexOfMinValue(int[] iArr, int i) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        int length = iArr.length;
        int i2 = -1;
        int i3 = Integer.MAX_VALUE;
        for (int i4 = 0; i4 < length; i4++) {
            int i5 = i + 1;
            int i6 = iArr[i4];
            if (i5 <= i6 && i6 < i3) {
                i2 = i4;
                i3 = i6;
            }
        }
        return i2;
    }

    private static final <T> int indexOfMinBy(T[] tArr, Function1<? super T, Integer> function1) {
        int length = tArr.length;
        int i = -1;
        int i2 = Integer.MAX_VALUE;
        for (int i3 = 0; i3 < length; i3++) {
            int intValue = function1.invoke(tArr[i3]).intValue();
            if (i2 > intValue) {
                i = i3;
                i2 = intValue;
            }
        }
        return i;
    }

    private static final int indexOfMaxValue(int[] iArr) {
        int length = iArr.length;
        int i = -1;
        int i2 = Integer.MIN_VALUE;
        for (int i3 = 0; i3 < length; i3++) {
            int i4 = iArr[i3];
            if (i2 < i4) {
                i = i3;
                i2 = i4;
            }
        }
        return i;
    }

    private static final int[] transform(int[] iArr, Function1<? super Integer, Integer> function1) {
        int length = iArr.length;
        for (int i = 0; i < length; i++) {
            iArr[i] = function1.invoke(Integer.valueOf(iArr[i])).intValue();
        }
        return iArr;
    }

    private static final void ensureIndicesInRange(LazyStaggeredGridMeasureContext lazyStaggeredGridMeasureContext, int[] iArr, int i) {
        int length = iArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i2 = length - 1;
                while (true) {
                    if (iArr[length] < i && lazyStaggeredGridMeasureContext.getLaneInfo().assignedToLane(iArr[length], length)) {
                        break;
                    }
                    iArr[length] = findPreviousItemIndex(lazyStaggeredGridMeasureContext, iArr[length], length);
                }
                if (iArr[length] >= 0 && !lazyStaggeredGridMeasureContext.isFullSpan(lazyStaggeredGridMeasureContext.getItemProvider(), iArr[length])) {
                    lazyStaggeredGridMeasureContext.getLaneInfo().setLane(iArr[length], length);
                }
                if (i2 >= 0) {
                    length = i2;
                } else {
                    return;
                }
            }
        }
    }

    private static final int findPreviousItemIndex(LazyStaggeredGridMeasureContext lazyStaggeredGridMeasureContext, int i, int i2) {
        return lazyStaggeredGridMeasureContext.getLaneInfo().findPreviousItemIndex(i, i2);
    }
}
