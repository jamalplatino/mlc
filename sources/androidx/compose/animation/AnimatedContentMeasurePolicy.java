package androidx.compose.animation;

import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.MeasurePolicy;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.SequencesKt;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u0011\u0012\n\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003¢\u0006\u0002\u0010\u0004J\"\u0010\u0007\u001a\u00020\b*\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\r\u001a\u00020\bH\u0016J\"\u0010\u000e\u001a\u00020\b*\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\u000f\u001a\u00020\bH\u0016J/\u0010\u0010\u001a\u00020\u0011*\u00020\u00122\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00130\u000b2\u0006\u0010\u0014\u001a\u00020\u0015H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\"\u0010\u0018\u001a\u00020\b*\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\r\u001a\u00020\bH\u0016J\"\u0010\u0019\u001a\u00020\b*\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\u000f\u001a\u00020\bH\u0016R\u0015\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u001a"}, d2 = {"Landroidx/compose/animation/AnimatedContentMeasurePolicy;", "Landroidx/compose/ui/layout/MeasurePolicy;", "rootScope", "Landroidx/compose/animation/AnimatedContentScope;", "(Landroidx/compose/animation/AnimatedContentScope;)V", "getRootScope", "()Landroidx/compose/animation/AnimatedContentScope;", "maxIntrinsicHeight", "", "Landroidx/compose/ui/layout/IntrinsicMeasureScope;", "measurables", "", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", "width", "maxIntrinsicWidth", "height", "measure", "Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/ui/layout/Measurable;", "constraints", "Landroidx/compose/ui/unit/Constraints;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Ljava/util/List;J)Landroidx/compose/ui/layout/MeasureResult;", "minIntrinsicHeight", "minIntrinsicWidth", "animation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* compiled from: AnimatedContent.kt */
final class AnimatedContentMeasurePolicy implements MeasurePolicy {
    private final AnimatedContentScope<?> rootScope;

    public final AnimatedContentScope<?> getRootScope() {
        return this.rootScope;
    }

    public AnimatedContentMeasurePolicy(AnimatedContentScope<?> animatedContentScope) {
        Intrinsics.checkNotNullParameter(animatedContentScope, "rootScope");
        this.rootScope = animatedContentScope;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v7, resolved type: androidx.compose.animation.AnimatedContentScope$ChildData} */
    /* JADX WARNING: type inference failed for: r10v0 */
    /* JADX WARNING: type inference failed for: r10v1, types: [androidx.compose.ui.layout.Placeable] */
    /* JADX WARNING: type inference failed for: r10v12 */
    /* JADX WARNING: type inference failed for: r10v14 */
    /* JADX WARNING: type inference failed for: r10v17 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: measure-3p2s80s  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public androidx.compose.ui.layout.MeasureResult m37measure3p2s80s(androidx.compose.ui.layout.MeasureScope r16, java.util.List<? extends androidx.compose.ui.layout.Measurable> r17, long r18) {
        /*
            r15 = this;
            r0 = r15
            r1 = r17
            r2 = r18
            java.lang.String r4 = "$this$measure"
            r5 = r16
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r4)
            java.lang.String r4 = "measurables"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r4)
            int r4 = r17.size()
            androidx.compose.ui.layout.Placeable[] r6 = new androidx.compose.ui.layout.Placeable[r4]
            int r7 = r17.size()
            r8 = 0
            r9 = r8
        L_0x001e:
            r10 = 0
            r11 = 1
            if (r9 >= r7) goto L_0x0044
            java.lang.Object r12 = r1.get(r9)
            androidx.compose.ui.layout.Measurable r12 = (androidx.compose.ui.layout.Measurable) r12
            java.lang.Object r13 = r12.getParentData()
            boolean r14 = r13 instanceof androidx.compose.animation.AnimatedContentScope.ChildData
            if (r14 == 0) goto L_0x0033
            r10 = r13
            androidx.compose.animation.AnimatedContentScope$ChildData r10 = (androidx.compose.animation.AnimatedContentScope.ChildData) r10
        L_0x0033:
            if (r10 == 0) goto L_0x0041
            boolean r10 = r10.isTarget()
            if (r10 != r11) goto L_0x0041
            androidx.compose.ui.layout.Placeable r10 = r12.m4520measureBRTryo0(r2)
            r6[r9] = r10
        L_0x0041:
            int r9 = r9 + 1
            goto L_0x001e
        L_0x0044:
            int r7 = r17.size()
            r9 = r8
        L_0x0049:
            if (r9 >= r7) goto L_0x005e
            java.lang.Object r12 = r1.get(r9)
            androidx.compose.ui.layout.Measurable r12 = (androidx.compose.ui.layout.Measurable) r12
            r13 = r6[r9]
            if (r13 != 0) goto L_0x005b
            androidx.compose.ui.layout.Placeable r12 = r12.m4520measureBRTryo0(r2)
            r6[r9] = r12
        L_0x005b:
            int r9 = r9 + 1
            goto L_0x0049
        L_0x005e:
            if (r4 != 0) goto L_0x0062
            r1 = r10
            goto L_0x0095
        L_0x0062:
            r1 = r6[r8]
            int r2 = kotlin.collections.ArraysKt.getLastIndex((T[]) r6)
            if (r2 != 0) goto L_0x006b
            goto L_0x0095
        L_0x006b:
            if (r1 == 0) goto L_0x0072
            int r3 = r1.getWidth()
            goto L_0x0073
        L_0x0072:
            r3 = r8
        L_0x0073:
            kotlin.ranges.IntRange r7 = new kotlin.ranges.IntRange
            r7.<init>(r11, r2)
            kotlin.collections.IntIterator r2 = r7.iterator()
        L_0x007c:
            boolean r7 = r2.hasNext()
            if (r7 == 0) goto L_0x0095
            int r7 = r2.nextInt()
            r7 = r6[r7]
            if (r7 == 0) goto L_0x008f
            int r9 = r7.getWidth()
            goto L_0x0090
        L_0x008f:
            r9 = r8
        L_0x0090:
            if (r3 >= r9) goto L_0x007c
            r1 = r7
            r3 = r9
            goto L_0x007c
        L_0x0095:
            if (r1 == 0) goto L_0x009c
            int r1 = r1.getWidth()
            goto L_0x009d
        L_0x009c:
            r1 = r8
        L_0x009d:
            if (r4 != 0) goto L_0x00a0
            goto L_0x00d3
        L_0x00a0:
            r10 = r6[r8]
            int r2 = kotlin.collections.ArraysKt.getLastIndex((T[]) r6)
            if (r2 != 0) goto L_0x00a9
            goto L_0x00d3
        L_0x00a9:
            if (r10 == 0) goto L_0x00b0
            int r3 = r10.getHeight()
            goto L_0x00b1
        L_0x00b0:
            r3 = r8
        L_0x00b1:
            kotlin.ranges.IntRange r4 = new kotlin.ranges.IntRange
            r4.<init>(r11, r2)
            kotlin.collections.IntIterator r2 = r4.iterator()
        L_0x00ba:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L_0x00d3
            int r4 = r2.nextInt()
            r4 = r6[r4]
            if (r4 == 0) goto L_0x00cd
            int r7 = r4.getHeight()
            goto L_0x00ce
        L_0x00cd:
            r7 = r8
        L_0x00ce:
            if (r3 >= r7) goto L_0x00ba
            r10 = r4
            r3 = r7
            goto L_0x00ba
        L_0x00d3:
            if (r10 == 0) goto L_0x00db
            int r2 = r10.getHeight()
            r7 = r2
            goto L_0x00dc
        L_0x00db:
            r7 = r8
        L_0x00dc:
            androidx.compose.animation.AnimatedContentScope<?> r2 = r0.rootScope
            long r3 = androidx.compose.ui.unit.IntSizeKt.IntSize(r1, r7)
            r2.m47setMeasuredSizeozmzZPI$animation_release(r3)
            r8 = 0
            androidx.compose.animation.AnimatedContentMeasurePolicy$measure$3 r2 = new androidx.compose.animation.AnimatedContentMeasurePolicy$measure$3
            r2.<init>(r6, r15, r1, r7)
            r9 = r2
            kotlin.jvm.functions.Function1 r9 = (kotlin.jvm.functions.Function1) r9
            r10 = 4
            r11 = 0
            r5 = r16
            r6 = r1
            androidx.compose.ui.layout.MeasureResult r1 = androidx.compose.ui.layout.MeasureScope.layout$default(r5, r6, r7, r8, r9, r10, r11)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.AnimatedContentMeasurePolicy.m37measure3p2s80s(androidx.compose.ui.layout.MeasureScope, java.util.List, long):androidx.compose.ui.layout.MeasureResult");
    }

    public int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i) {
        Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
        Intrinsics.checkNotNullParameter(list, "measurables");
        Integer num = (Integer) SequencesKt.maxOrNull(SequencesKt.map(CollectionsKt.asSequence(list), new AnimatedContentMeasurePolicy$minIntrinsicWidth$1(i)));
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    public int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i) {
        Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
        Intrinsics.checkNotNullParameter(list, "measurables");
        Integer num = (Integer) SequencesKt.maxOrNull(SequencesKt.map(CollectionsKt.asSequence(list), new AnimatedContentMeasurePolicy$minIntrinsicHeight$1(i)));
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    public int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i) {
        Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
        Intrinsics.checkNotNullParameter(list, "measurables");
        Integer num = (Integer) SequencesKt.maxOrNull(SequencesKt.map(CollectionsKt.asSequence(list), new AnimatedContentMeasurePolicy$maxIntrinsicWidth$1(i)));
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    public int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i) {
        Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
        Intrinsics.checkNotNullParameter(list, "measurables");
        Integer num = (Integer) SequencesKt.maxOrNull(SequencesKt.map(CollectionsKt.asSequence(list), new AnimatedContentMeasurePolicy$maxIntrinsicHeight$1(i)));
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }
}