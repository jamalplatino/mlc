package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000¢\u0001\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0015\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0001\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u000b2\u0017\u0010\u0013\u001a\u0013\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00010\u0014¢\u0006\u0002\b\u0016H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0017\u0010\u0018\u001a\u0001\u0010\u0019\u001a\u00020\u00012\u0006\u0010\u001a\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\u001b\u001a\u00020\u000f2\b\b\u0002\u0010\u001c\u001a\u00020\u001d2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u000b2\u0017\u0010\u0013\u001a\u0013\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00010\u0014¢\u0006\u0002\b\u0016H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001e\u0010\u001f\u001a?\u0010 \u001a\u0019\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020$0!¢\u0006\u0002\b\u00162\u0006\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\b\u001a\u00020\tH\u0003ø\u0001\u0001¢\u0006\u0002\u0010%\u001a?\u0010&\u001a\u0019\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020$0!¢\u0006\u0002\b\u00162\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\tH\u0003ø\u0001\u0001¢\u0006\u0002\u0010'\u001aÓ\u0001\u0010(\u001a\u00020\u0001\"\u0004\b\u0000\u0010)*\u00020\u00152\f\u0010(\u001a\b\u0012\u0004\u0012\u0002H)0*2%\b\n\u0010+\u001a\u001f\u0012\u0013\u0012\u0011H)¢\u0006\f\b,\u0012\b\b-\u0012\u0004\b\b(.\u0012\u0004\u0012\u00020/\u0018\u00010\u00142%\b\u0006\u00100\u001a\u001f\u0012\u0013\u0012\u0011H)¢\u0006\f\b,\u0012\b\b-\u0012\u0004\b\b(.\u0012\u0006\u0012\u0004\u0018\u00010/0\u00142%\b\n\u00101\u001a\u001f\u0012\u0013\u0012\u0011H)¢\u0006\f\b,\u0012\b\b-\u0012\u0004\b\b(.\u0012\u0004\u0012\u000202\u0018\u00010\u001423\b\u0004\u00103\u001a-\u0012\u0004\u0012\u000204\u0012\u0013\u0012\u0011H)¢\u0006\f\b,\u0012\b\b-\u0012\u0004\b\b(.\u0012\u0004\u0012\u00020\u00010!¢\u0006\u0002\b5¢\u0006\u0002\b\u0016H\bø\u0001\u0002¢\u0006\u0002\u00106\u001aÓ\u0001\u0010(\u001a\u00020\u0001\"\u0004\b\u0000\u0010)*\u00020\u00152\f\u0010(\u001a\b\u0012\u0004\u0012\u0002H)072%\b\n\u0010+\u001a\u001f\u0012\u0013\u0012\u0011H)¢\u0006\f\b,\u0012\b\b-\u0012\u0004\b\b(.\u0012\u0004\u0012\u00020/\u0018\u00010\u00142%\b\u0006\u00100\u001a\u001f\u0012\u0013\u0012\u0011H)¢\u0006\f\b,\u0012\b\b-\u0012\u0004\b\b(.\u0012\u0006\u0012\u0004\u0018\u00010/0\u00142%\b\n\u00101\u001a\u001f\u0012\u0013\u0012\u0011H)¢\u0006\f\b,\u0012\b\b-\u0012\u0004\b\b(.\u0012\u0004\u0012\u000202\u0018\u00010\u001423\b\u0004\u00103\u001a-\u0012\u0004\u0012\u000204\u0012\u0013\u0012\u0011H)¢\u0006\f\b,\u0012\b\b-\u0012\u0004\b\b(.\u0012\u0004\u0012\u00020\u00010!¢\u0006\u0002\b5¢\u0006\u0002\b\u0016H\bø\u0001\u0002¢\u0006\u0002\u00108\u001a§\u0002\u00109\u001a\u00020\u0001\"\u0004\b\u0000\u0010)*\u00020\u00152\f\u0010(\u001a\b\u0012\u0004\u0012\u0002H)0*2:\b\n\u0010+\u001a4\u0012\u0013\u0012\u00110:¢\u0006\f\b,\u0012\b\b-\u0012\u0004\b\b(;\u0012\u0013\u0012\u0011H)¢\u0006\f\b,\u0012\b\b-\u0012\u0004\b\b(.\u0012\u0004\u0012\u00020/\u0018\u00010!2:\b\u0006\u00100\u001a4\u0012\u0013\u0012\u00110:¢\u0006\f\b,\u0012\b\b-\u0012\u0004\b\b(;\u0012\u0013\u0012\u0011H)¢\u0006\f\b,\u0012\b\b-\u0012\u0004\b\b(.\u0012\u0006\u0012\u0004\u0018\u00010/0!2:\b\n\u00101\u001a4\u0012\u0013\u0012\u00110:¢\u0006\f\b,\u0012\b\b-\u0012\u0004\b\b(;\u0012\u0013\u0012\u0011H)¢\u0006\f\b,\u0012\b\b-\u0012\u0004\b\b(.\u0012\u0004\u0012\u000202\u0018\u00010!2H\b\u0004\u00103\u001aB\u0012\u0004\u0012\u000204\u0012\u0013\u0012\u00110:¢\u0006\f\b,\u0012\b\b-\u0012\u0004\b\b(;\u0012\u0013\u0012\u0011H)¢\u0006\f\b,\u0012\b\b-\u0012\u0004\b\b(.\u0012\u0004\u0012\u00020\u00010<¢\u0006\u0002\b5¢\u0006\u0002\b\u0016H\bø\u0001\u0002¢\u0006\u0002\u0010=\u001a§\u0002\u00109\u001a\u00020\u0001\"\u0004\b\u0000\u0010)*\u00020\u00152\f\u0010(\u001a\b\u0012\u0004\u0012\u0002H)072:\b\n\u0010+\u001a4\u0012\u0013\u0012\u00110:¢\u0006\f\b,\u0012\b\b-\u0012\u0004\b\b(;\u0012\u0013\u0012\u0011H)¢\u0006\f\b,\u0012\b\b-\u0012\u0004\b\b(.\u0012\u0004\u0012\u00020/\u0018\u00010!2:\b\u0006\u00100\u001a4\u0012\u0013\u0012\u00110:¢\u0006\f\b,\u0012\b\b-\u0012\u0004\b\b(;\u0012\u0013\u0012\u0011H)¢\u0006\f\b,\u0012\b\b-\u0012\u0004\b\b(.\u0012\u0006\u0012\u0004\u0018\u00010/0!2:\b\n\u00101\u001a4\u0012\u0013\u0012\u00110:¢\u0006\f\b,\u0012\b\b-\u0012\u0004\b\b(;\u0012\u0013\u0012\u0011H)¢\u0006\f\b,\u0012\b\b-\u0012\u0004\b\b(.\u0012\u0004\u0012\u000202\u0018\u00010!2H\b\u0004\u00103\u001aB\u0012\u0004\u0012\u000204\u0012\u0013\u0012\u00110:¢\u0006\f\b,\u0012\b\b-\u0012\u0004\b\b(;\u0012\u0013\u0012\u0011H)¢\u0006\f\b,\u0012\b\b-\u0012\u0004\b\b(.\u0012\u0004\u0012\u00020\u00010<¢\u0006\u0002\b5¢\u0006\u0002\b\u0016H\bø\u0001\u0002¢\u0006\u0002\u0010>\u0002\u0012\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0005\b20\u0001¨\u0006?"}, d2 = {"LazyHorizontalStaggeredGrid", "", "rows", "Landroidx/compose/foundation/lazy/staggeredgrid/StaggeredGridCells;", "modifier", "Landroidx/compose/ui/Modifier;", "state", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;", "contentPadding", "Landroidx/compose/foundation/layout/PaddingValues;", "reverseLayout", "", "verticalArrangement", "Landroidx/compose/foundation/layout/Arrangement$Vertical;", "horizontalItemSpacing", "Landroidx/compose/ui/unit/Dp;", "flingBehavior", "Landroidx/compose/foundation/gestures/FlingBehavior;", "userScrollEnabled", "content", "Lkotlin/Function1;", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridScope;", "Lkotlin/ExtensionFunctionType;", "LazyHorizontalStaggeredGrid-cJHQLPU", "(Landroidx/compose/foundation/lazy/staggeredgrid/StaggeredGridCells;Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;Landroidx/compose/foundation/layout/PaddingValues;ZLandroidx/compose/foundation/layout/Arrangement$Vertical;FLandroidx/compose/foundation/gestures/FlingBehavior;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "LazyVerticalStaggeredGrid", "columns", "verticalItemSpacing", "horizontalArrangement", "Landroidx/compose/foundation/layout/Arrangement$Horizontal;", "LazyVerticalStaggeredGrid-zadm560", "(Landroidx/compose/foundation/lazy/staggeredgrid/StaggeredGridCells;Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;Landroidx/compose/foundation/layout/PaddingValues;ZFLandroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/foundation/gestures/FlingBehavior;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "rememberColumnWidthSums", "Lkotlin/Function2;", "Landroidx/compose/ui/unit/Density;", "Landroidx/compose/ui/unit/Constraints;", "", "(Landroidx/compose/foundation/lazy/staggeredgrid/StaggeredGridCells;Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/runtime/Composer;I)Lkotlin/jvm/functions/Function2;", "rememberRowHeightSums", "(Landroidx/compose/foundation/lazy/staggeredgrid/StaggeredGridCells;Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/runtime/Composer;I)Lkotlin/jvm/functions/Function2;", "items", "T", "", "key", "Lkotlin/ParameterName;", "name", "item", "", "contentType", "span", "Landroidx/compose/foundation/lazy/staggeredgrid/StaggeredGridItemSpan;", "itemContent", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridItemScope;", "Landroidx/compose/runtime/Composable;", "(Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridScope;[Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function4;)V", "", "(Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridScope;Ljava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function4;)V", "itemsIndexed", "", "index", "Lkotlin/Function3;", "(Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridScope;[Ljava/lang/Object;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function5;)V", "(Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridScope;Ljava/util/List;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function5;)V", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: LazyStaggeredGridDsl.kt */
public final class LazyStaggeredGridDslKt {
    /* JADX WARNING: Removed duplicated region for block: B:104:0x0141  */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x0154  */
    /* JADX WARNING: Removed duplicated region for block: B:150:0x026e  */
    /* JADX WARNING: Removed duplicated region for block: B:152:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0059  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x005f  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x007e  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0081  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x009d  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00a4  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00bd  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00c4  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x00dd  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x00f3  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x00fb  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x0102  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x0119  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x011d  */
    /* renamed from: LazyVerticalStaggeredGrid-zadm560  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m770LazyVerticalStaggeredGridzadm560(androidx.compose.foundation.lazy.staggeredgrid.StaggeredGridCells r28, androidx.compose.ui.Modifier r29, androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState r30, androidx.compose.foundation.layout.PaddingValues r31, boolean r32, float r33, androidx.compose.foundation.layout.Arrangement.Horizontal r34, androidx.compose.foundation.gestures.FlingBehavior r35, boolean r36, kotlin.jvm.functions.Function1<? super androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridScope, kotlin.Unit> r37, androidx.compose.runtime.Composer r38, int r39, int r40) {
        /*
            r1 = r28
            r0 = r37
            r15 = r39
            r14 = r40
            java.lang.String r2 = "columns"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r2)
            java.lang.String r2 = "content"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r2)
            r2 = 1695323794(0x650c9692, float:4.1494302E22)
            r3 = r38
            androidx.compose.runtime.Composer r13 = r3.startRestartGroup(r2)
            java.lang.String r3 = "C(LazyVerticalStaggeredGrid)P(!1,5,7,2,6,9:c#ui.unit.Dp,4,3,8)61@3004L32,66@3301L15,80@3822L71,70@3412L514:LazyStaggeredGridDsl.kt#fzvcnm"
            androidx.compose.runtime.ComposerKt.sourceInformation(r13, r3)
            r3 = r14 & 1
            if (r3 == 0) goto L_0x0029
            r3 = r15 | 6
            goto L_0x0039
        L_0x0029:
            r3 = r15 & 14
            if (r3 != 0) goto L_0x0038
            boolean r3 = r13.changed((java.lang.Object) r1)
            if (r3 == 0) goto L_0x0035
            r3 = 4
            goto L_0x0036
        L_0x0035:
            r3 = 2
        L_0x0036:
            r3 = r3 | r15
            goto L_0x0039
        L_0x0038:
            r3 = r15
        L_0x0039:
            r5 = r14 & 2
            if (r5 == 0) goto L_0x0040
            r3 = r3 | 48
            goto L_0x0053
        L_0x0040:
            r6 = r15 & 112(0x70, float:1.57E-43)
            if (r6 != 0) goto L_0x0053
            r6 = r29
            boolean r7 = r13.changed((java.lang.Object) r6)
            if (r7 == 0) goto L_0x004f
            r7 = 32
            goto L_0x0051
        L_0x004f:
            r7 = 16
        L_0x0051:
            r3 = r3 | r7
            goto L_0x0055
        L_0x0053:
            r6 = r29
        L_0x0055:
            r7 = r14 & 4
            if (r7 == 0) goto L_0x005b
            r3 = r3 | 128(0x80, float:1.794E-43)
        L_0x005b:
            r8 = r14 & 8
            if (r8 == 0) goto L_0x0062
            r3 = r3 | 3072(0xc00, float:4.305E-42)
            goto L_0x0075
        L_0x0062:
            r9 = r15 & 7168(0x1c00, float:1.0045E-41)
            if (r9 != 0) goto L_0x0075
            r9 = r31
            boolean r10 = r13.changed((java.lang.Object) r9)
            if (r10 == 0) goto L_0x0071
            r10 = 2048(0x800, float:2.87E-42)
            goto L_0x0073
        L_0x0071:
            r10 = 1024(0x400, float:1.435E-42)
        L_0x0073:
            r3 = r3 | r10
            goto L_0x0077
        L_0x0075:
            r9 = r31
        L_0x0077:
            r10 = r14 & 16
            r11 = 57344(0xe000, float:8.0356E-41)
            if (r10 == 0) goto L_0x0081
            r3 = r3 | 24576(0x6000, float:3.4438E-41)
            goto L_0x0095
        L_0x0081:
            r12 = r15 & r11
            if (r12 != 0) goto L_0x0095
            r12 = r32
            boolean r16 = r13.changed((boolean) r12)
            if (r16 == 0) goto L_0x0090
            r16 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0092
        L_0x0090:
            r16 = 8192(0x2000, float:1.14794E-41)
        L_0x0092:
            r3 = r3 | r16
            goto L_0x0097
        L_0x0095:
            r12 = r32
        L_0x0097:
            r16 = r14 & 32
            r17 = 458752(0x70000, float:6.42848E-40)
            if (r16 == 0) goto L_0x00a4
            r18 = 196608(0x30000, float:2.75506E-40)
            r3 = r3 | r18
            r11 = r33
            goto L_0x00b7
        L_0x00a4:
            r18 = r15 & r17
            r11 = r33
            if (r18 != 0) goto L_0x00b7
            boolean r18 = r13.changed((float) r11)
            if (r18 == 0) goto L_0x00b3
            r18 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00b5
        L_0x00b3:
            r18 = 65536(0x10000, float:9.18355E-41)
        L_0x00b5:
            r3 = r3 | r18
        L_0x00b7:
            r18 = r14 & 64
            r19 = 3670016(0x380000, float:5.142788E-39)
            if (r18 == 0) goto L_0x00c4
            r20 = 1572864(0x180000, float:2.204052E-39)
            r3 = r3 | r20
            r2 = r34
            goto L_0x00d7
        L_0x00c4:
            r20 = r15 & r19
            r2 = r34
            if (r20 != 0) goto L_0x00d7
            boolean r21 = r13.changed((java.lang.Object) r2)
            if (r21 == 0) goto L_0x00d3
            r21 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00d5
        L_0x00d3:
            r21 = 524288(0x80000, float:7.34684E-40)
        L_0x00d5:
            r3 = r3 | r21
        L_0x00d7:
            r21 = 29360128(0x1c00000, float:7.052966E-38)
            r22 = r15 & r21
            if (r22 != 0) goto L_0x00f3
            r4 = r14 & 128(0x80, float:1.794E-43)
            if (r4 != 0) goto L_0x00ec
            r4 = r35
            boolean r23 = r13.changed((java.lang.Object) r4)
            if (r23 == 0) goto L_0x00ee
            r23 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00f0
        L_0x00ec:
            r4 = r35
        L_0x00ee:
            r23 = 4194304(0x400000, float:5.877472E-39)
        L_0x00f0:
            r3 = r3 | r23
            goto L_0x00f5
        L_0x00f3:
            r4 = r35
        L_0x00f5:
            r2 = r14 & 256(0x100, float:3.59E-43)
            r23 = 234881024(0xe000000, float:1.5777218E-30)
            if (r2 == 0) goto L_0x0102
            r24 = 100663296(0x6000000, float:2.4074124E-35)
            r3 = r3 | r24
            r4 = r36
            goto L_0x0115
        L_0x0102:
            r24 = r15 & r23
            r4 = r36
            if (r24 != 0) goto L_0x0115
            boolean r24 = r13.changed((boolean) r4)
            if (r24 == 0) goto L_0x0111
            r24 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x0113
        L_0x0111:
            r24 = 33554432(0x2000000, float:9.403955E-38)
        L_0x0113:
            r3 = r3 | r24
        L_0x0115:
            r4 = r14 & 512(0x200, float:7.175E-43)
            if (r4 == 0) goto L_0x011d
            r4 = 805306368(0x30000000, float:4.656613E-10)
        L_0x011b:
            r3 = r3 | r4
            goto L_0x012e
        L_0x011d:
            r4 = 1879048192(0x70000000, float:1.58456325E29)
            r4 = r4 & r15
            if (r4 != 0) goto L_0x012e
            boolean r4 = r13.changedInstance(r0)
            if (r4 == 0) goto L_0x012b
            r4 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x011b
        L_0x012b:
            r4 = 268435456(0x10000000, float:2.5243549E-29)
            goto L_0x011b
        L_0x012e:
            r4 = 4
            if (r7 != r4) goto L_0x0154
            r4 = 1533916891(0x5b6db6db, float:6.6910621E16)
            r4 = r4 & r3
            r0 = 306783378(0x12492492, float:6.3469493E-28)
            if (r4 != r0) goto L_0x0154
            boolean r0 = r13.getSkipping()
            if (r0 != 0) goto L_0x0141
            goto L_0x0154
        L_0x0141:
            r13.skipToGroupEnd()
            r3 = r30
            r7 = r34
            r8 = r35
            r2 = r6
            r4 = r9
            r6 = r11
            r5 = r12
            r27 = r13
            r9 = r36
            goto L_0x0267
        L_0x0154:
            r13.startDefaults()
            r0 = r15 & 1
            r4 = -29360129(0xfffffffffe3fffff, float:-6.380294E37)
            if (r0 == 0) goto L_0x0181
            boolean r0 = r13.getDefaultsInvalid()
            if (r0 == 0) goto L_0x0165
            goto L_0x0181
        L_0x0165:
            r13.skipToGroupEnd()
            if (r7 == 0) goto L_0x016c
            r3 = r3 & -897(0xfffffffffffffc7f, float:NaN)
        L_0x016c:
            r0 = r14 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x0171
            r3 = r3 & r4
        L_0x0171:
            r18 = r30
            r25 = r35
            r26 = r36
            r0 = r6
            r24 = r11
            r22 = r12
            r11 = r34
            r12 = r9
            goto L_0x01e3
        L_0x0181:
            if (r5 == 0) goto L_0x0188
            androidx.compose.ui.Modifier$Companion r0 = androidx.compose.ui.Modifier.Companion
            androidx.compose.ui.Modifier r0 = (androidx.compose.ui.Modifier) r0
            r6 = r0
        L_0x0188:
            r0 = 0
            if (r7 == 0) goto L_0x0193
            r5 = 3
            androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState r5 = androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridStateKt.rememberLazyStaggeredGridState(r0, r0, r13, r0, r5)
            r3 = r3 & -897(0xfffffffffffffc7f, float:NaN)
            goto L_0x0195
        L_0x0193:
            r5 = r30
        L_0x0195:
            if (r8 == 0) goto L_0x01a1
            float r7 = (float) r0
            float r7 = androidx.compose.ui.unit.Dp.m5626constructorimpl(r7)
            androidx.compose.foundation.layout.PaddingValues r7 = androidx.compose.foundation.layout.PaddingKt.m486PaddingValues0680j_4(r7)
            goto L_0x01a2
        L_0x01a1:
            r7 = r9
        L_0x01a2:
            if (r10 == 0) goto L_0x01a5
            r12 = r0
        L_0x01a5:
            if (r16 == 0) goto L_0x01ad
            float r8 = (float) r0
            float r8 = androidx.compose.ui.unit.Dp.m5626constructorimpl(r8)
            goto L_0x01ae
        L_0x01ad:
            r8 = r11
        L_0x01ae:
            if (r18 == 0) goto L_0x01be
            androidx.compose.foundation.layout.Arrangement r9 = androidx.compose.foundation.layout.Arrangement.INSTANCE
            float r0 = (float) r0
            float r0 = androidx.compose.ui.unit.Dp.m5626constructorimpl(r0)
            androidx.compose.foundation.layout.Arrangement$HorizontalOrVertical r0 = r9.m410spacedBy0680j_4(r0)
            androidx.compose.foundation.layout.Arrangement$Horizontal r0 = (androidx.compose.foundation.layout.Arrangement.Horizontal) r0
            goto L_0x01c0
        L_0x01be:
            r0 = r34
        L_0x01c0:
            r9 = r14 & 128(0x80, float:1.794E-43)
            if (r9 == 0) goto L_0x01cd
            androidx.compose.foundation.gestures.ScrollableDefaults r9 = androidx.compose.foundation.gestures.ScrollableDefaults.INSTANCE
            r10 = 6
            androidx.compose.foundation.gestures.FlingBehavior r9 = r9.flingBehavior(r13, r10)
            r3 = r3 & r4
            goto L_0x01cf
        L_0x01cd:
            r9 = r35
        L_0x01cf:
            if (r2 == 0) goto L_0x01d6
            r2 = 1
            r11 = r0
            r26 = r2
            goto L_0x01d9
        L_0x01d6:
            r26 = r36
            r11 = r0
        L_0x01d9:
            r18 = r5
            r0 = r6
            r24 = r8
            r25 = r9
            r22 = r12
            r12 = r7
        L_0x01e3:
            r13.endDefaults()
            boolean r2 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r2 == 0) goto L_0x01f6
            r2 = -1
            java.lang.String r4 = "androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid (LazyStaggeredGridDsl.kt:58)"
            r5 = 1695323794(0x650c9692, float:4.1494302E22)
            androidx.compose.runtime.ComposerKt.traceEventStart(r5, r3, r2, r4)
        L_0x01f6:
            androidx.compose.foundation.gestures.Orientation r4 = androidx.compose.foundation.gestures.Orientation.Vertical
            float r16 = r11.m418getSpacingD9Ej5fM()
            r2 = r3 & 14
            int r5 = r3 >> 15
            r5 = r5 & 112(0x70, float:1.57E-43)
            r2 = r2 | r5
            int r5 = r3 >> 3
            r6 = r5 & 896(0x380, float:1.256E-42)
            r2 = r2 | r6
            kotlin.jvm.functions.Function2 r6 = rememberColumnWidthSums(r1, r11, r12, r13, r2)
            int r2 = r3 << 6
            r2 = r2 & 7168(0x1c00, float:1.0045E-41)
            r2 = r2 | 56
            int r7 = r3 << 3
            r8 = 57344(0xe000, float:8.0356E-41)
            r8 = r8 & r7
            r2 = r2 | r8
            r7 = r7 & r17
            r2 = r2 | r7
            r7 = r5 & r19
            r2 = r2 | r7
            r5 = r5 & r21
            r2 = r2 | r5
            int r5 = r3 << 9
            r5 = r5 & r23
            r17 = r2 | r5
            int r2 = r3 >> 27
            r19 = r2 & 14
            r20 = 0
            r2 = r18
            r3 = r4
            r4 = r6
            r5 = r0
            r6 = r12
            r7 = r22
            r8 = r25
            r9 = r26
            r10 = r24
            r21 = r11
            r11 = r16
            r23 = r12
            r12 = r37
            r27 = r13
            r14 = r17
            r15 = r19
            r16 = r20
            androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridKt.m775LazyStaggeredGridLJWHXA8(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            boolean r2 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r2 == 0) goto L_0x0258
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L_0x0258:
            r2 = r0
            r3 = r18
            r7 = r21
            r5 = r22
            r4 = r23
            r6 = r24
            r8 = r25
            r9 = r26
        L_0x0267:
            androidx.compose.runtime.ScopeUpdateScope r13 = r27.endRestartGroup()
            if (r13 != 0) goto L_0x026e
            goto L_0x0281
        L_0x026e:
            androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt$LazyVerticalStaggeredGrid$1 r14 = new androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt$LazyVerticalStaggeredGrid$1
            r0 = r14
            r1 = r28
            r10 = r37
            r11 = r39
            r12 = r40
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            kotlin.jvm.functions.Function2 r14 = (kotlin.jvm.functions.Function2) r14
            r13.updateScope(r14)
        L_0x0281:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt.m770LazyVerticalStaggeredGridzadm560(androidx.compose.foundation.lazy.staggeredgrid.StaggeredGridCells, androidx.compose.ui.Modifier, androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState, androidx.compose.foundation.layout.PaddingValues, boolean, float, androidx.compose.foundation.layout.Arrangement$Horizontal, androidx.compose.foundation.gestures.FlingBehavior, boolean, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    private static final Function2<Density, Constraints, int[]> rememberColumnWidthSums(StaggeredGridCells staggeredGridCells, Arrangement.Horizontal horizontal, PaddingValues paddingValues, Composer composer, int i) {
        composer.startReplaceableGroup(1426908594);
        ComposerKt.sourceInformation(composer, "C(rememberColumnWidthSums)P(!1,2)92@4215L920:LazyStaggeredGridDsl.kt#fzvcnm");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1426908594, i, -1, "androidx.compose.foundation.lazy.staggeredgrid.rememberColumnWidthSums (LazyStaggeredGridDsl.kt:88)");
        }
        composer.startReplaceableGroup(1618982084);
        ComposerKt.sourceInformation(composer, "CC(remember)P(1,2,3):Composables.kt#9igjgp");
        boolean changed = composer.changed((Object) staggeredGridCells) | composer.changed((Object) horizontal) | composer.changed((Object) paddingValues);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new LazyStaggeredGridDslKt$rememberColumnWidthSums$1$1(paddingValues, staggeredGridCells, horizontal);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        Function2<Density, Constraints, int[]> function2 = (Function2) rememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return function2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:104:0x0141  */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x0154  */
    /* JADX WARNING: Removed duplicated region for block: B:150:0x026b  */
    /* JADX WARNING: Removed duplicated region for block: B:152:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0059  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x005f  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x007e  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0081  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x009d  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00a4  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00bd  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00c4  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x00dd  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x00f3  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x00fb  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x0102  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x0119  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x011d  */
    /* renamed from: LazyHorizontalStaggeredGrid-cJHQLPU  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m769LazyHorizontalStaggeredGridcJHQLPU(androidx.compose.foundation.lazy.staggeredgrid.StaggeredGridCells r28, androidx.compose.ui.Modifier r29, androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState r30, androidx.compose.foundation.layout.PaddingValues r31, boolean r32, androidx.compose.foundation.layout.Arrangement.Vertical r33, float r34, androidx.compose.foundation.gestures.FlingBehavior r35, boolean r36, kotlin.jvm.functions.Function1<? super androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridScope, kotlin.Unit> r37, androidx.compose.runtime.Composer r38, int r39, int r40) {
        /*
            r1 = r28
            r0 = r37
            r15 = r39
            r14 = r40
            java.lang.String r2 = "rows"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r2)
            java.lang.String r2 = "content"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r2)
            r2 = -8666074(0xffffffffff7bc426, float:-3.3465469E38)
            r3 = r38
            androidx.compose.runtime.Composer r13 = r3.startRestartGroup(r2)
            java.lang.String r3 = "C(LazyHorizontalStaggeredGrid)P(6,4,7,1,5,9,3:c#ui.unit.Dp,2,8)146@6608L32,151@6903L15,165@7426L64,155@7014L509:LazyStaggeredGridDsl.kt#fzvcnm"
            androidx.compose.runtime.ComposerKt.sourceInformation(r13, r3)
            r3 = r14 & 1
            if (r3 == 0) goto L_0x0029
            r3 = r15 | 6
            goto L_0x0039
        L_0x0029:
            r3 = r15 & 14
            if (r3 != 0) goto L_0x0038
            boolean r3 = r13.changed((java.lang.Object) r1)
            if (r3 == 0) goto L_0x0035
            r3 = 4
            goto L_0x0036
        L_0x0035:
            r3 = 2
        L_0x0036:
            r3 = r3 | r15
            goto L_0x0039
        L_0x0038:
            r3 = r15
        L_0x0039:
            r5 = r14 & 2
            if (r5 == 0) goto L_0x0040
            r3 = r3 | 48
            goto L_0x0053
        L_0x0040:
            r6 = r15 & 112(0x70, float:1.57E-43)
            if (r6 != 0) goto L_0x0053
            r6 = r29
            boolean r7 = r13.changed((java.lang.Object) r6)
            if (r7 == 0) goto L_0x004f
            r7 = 32
            goto L_0x0051
        L_0x004f:
            r7 = 16
        L_0x0051:
            r3 = r3 | r7
            goto L_0x0055
        L_0x0053:
            r6 = r29
        L_0x0055:
            r7 = r14 & 4
            if (r7 == 0) goto L_0x005b
            r3 = r3 | 128(0x80, float:1.794E-43)
        L_0x005b:
            r8 = r14 & 8
            if (r8 == 0) goto L_0x0062
            r3 = r3 | 3072(0xc00, float:4.305E-42)
            goto L_0x0075
        L_0x0062:
            r9 = r15 & 7168(0x1c00, float:1.0045E-41)
            if (r9 != 0) goto L_0x0075
            r9 = r31
            boolean r10 = r13.changed((java.lang.Object) r9)
            if (r10 == 0) goto L_0x0071
            r10 = 2048(0x800, float:2.87E-42)
            goto L_0x0073
        L_0x0071:
            r10 = 1024(0x400, float:1.435E-42)
        L_0x0073:
            r3 = r3 | r10
            goto L_0x0077
        L_0x0075:
            r9 = r31
        L_0x0077:
            r10 = r14 & 16
            r11 = 57344(0xe000, float:8.0356E-41)
            if (r10 == 0) goto L_0x0081
            r3 = r3 | 24576(0x6000, float:3.4438E-41)
            goto L_0x0095
        L_0x0081:
            r12 = r15 & r11
            if (r12 != 0) goto L_0x0095
            r12 = r32
            boolean r16 = r13.changed((boolean) r12)
            if (r16 == 0) goto L_0x0090
            r16 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0092
        L_0x0090:
            r16 = 8192(0x2000, float:1.14794E-41)
        L_0x0092:
            r3 = r3 | r16
            goto L_0x0097
        L_0x0095:
            r12 = r32
        L_0x0097:
            r16 = r14 & 32
            r17 = 458752(0x70000, float:6.42848E-40)
            if (r16 == 0) goto L_0x00a4
            r18 = 196608(0x30000, float:2.75506E-40)
            r3 = r3 | r18
            r11 = r33
            goto L_0x00b7
        L_0x00a4:
            r18 = r15 & r17
            r11 = r33
            if (r18 != 0) goto L_0x00b7
            boolean r18 = r13.changed((java.lang.Object) r11)
            if (r18 == 0) goto L_0x00b3
            r18 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00b5
        L_0x00b3:
            r18 = 65536(0x10000, float:9.18355E-41)
        L_0x00b5:
            r3 = r3 | r18
        L_0x00b7:
            r18 = r14 & 64
            r19 = 3670016(0x380000, float:5.142788E-39)
            if (r18 == 0) goto L_0x00c4
            r20 = 1572864(0x180000, float:2.204052E-39)
            r3 = r3 | r20
            r2 = r34
            goto L_0x00d7
        L_0x00c4:
            r20 = r15 & r19
            r2 = r34
            if (r20 != 0) goto L_0x00d7
            boolean r21 = r13.changed((float) r2)
            if (r21 == 0) goto L_0x00d3
            r21 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00d5
        L_0x00d3:
            r21 = 524288(0x80000, float:7.34684E-40)
        L_0x00d5:
            r3 = r3 | r21
        L_0x00d7:
            r21 = 29360128(0x1c00000, float:7.052966E-38)
            r22 = r15 & r21
            if (r22 != 0) goto L_0x00f3
            r4 = r14 & 128(0x80, float:1.794E-43)
            if (r4 != 0) goto L_0x00ec
            r4 = r35
            boolean r23 = r13.changed((java.lang.Object) r4)
            if (r23 == 0) goto L_0x00ee
            r23 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00f0
        L_0x00ec:
            r4 = r35
        L_0x00ee:
            r23 = 4194304(0x400000, float:5.877472E-39)
        L_0x00f0:
            r3 = r3 | r23
            goto L_0x00f5
        L_0x00f3:
            r4 = r35
        L_0x00f5:
            r2 = r14 & 256(0x100, float:3.59E-43)
            r23 = 234881024(0xe000000, float:1.5777218E-30)
            if (r2 == 0) goto L_0x0102
            r24 = 100663296(0x6000000, float:2.4074124E-35)
            r3 = r3 | r24
            r4 = r36
            goto L_0x0115
        L_0x0102:
            r24 = r15 & r23
            r4 = r36
            if (r24 != 0) goto L_0x0115
            boolean r24 = r13.changed((boolean) r4)
            if (r24 == 0) goto L_0x0111
            r24 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x0113
        L_0x0111:
            r24 = 33554432(0x2000000, float:9.403955E-38)
        L_0x0113:
            r3 = r3 | r24
        L_0x0115:
            r4 = r14 & 512(0x200, float:7.175E-43)
            if (r4 == 0) goto L_0x011d
            r4 = 805306368(0x30000000, float:4.656613E-10)
        L_0x011b:
            r3 = r3 | r4
            goto L_0x012e
        L_0x011d:
            r4 = 1879048192(0x70000000, float:1.58456325E29)
            r4 = r4 & r15
            if (r4 != 0) goto L_0x012e
            boolean r4 = r13.changedInstance(r0)
            if (r4 == 0) goto L_0x012b
            r4 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x011b
        L_0x012b:
            r4 = 268435456(0x10000000, float:2.5243549E-29)
            goto L_0x011b
        L_0x012e:
            r4 = 4
            if (r7 != r4) goto L_0x0154
            r4 = 1533916891(0x5b6db6db, float:6.6910621E16)
            r4 = r4 & r3
            r0 = 306783378(0x12492492, float:6.3469493E-28)
            if (r4 != r0) goto L_0x0154
            boolean r0 = r13.getSkipping()
            if (r0 != 0) goto L_0x0141
            goto L_0x0154
        L_0x0141:
            r13.skipToGroupEnd()
            r3 = r30
            r7 = r34
            r8 = r35
            r2 = r6
            r4 = r9
            r6 = r11
            r5 = r12
            r27 = r13
            r9 = r36
            goto L_0x0264
        L_0x0154:
            r13.startDefaults()
            r0 = r15 & 1
            r4 = -29360129(0xfffffffffe3fffff, float:-6.380294E37)
            if (r0 == 0) goto L_0x017f
            boolean r0 = r13.getDefaultsInvalid()
            if (r0 == 0) goto L_0x0165
            goto L_0x017f
        L_0x0165:
            r13.skipToGroupEnd()
            if (r7 == 0) goto L_0x016c
            r3 = r3 & -897(0xfffffffffffffc7f, float:NaN)
        L_0x016c:
            r0 = r14 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x0171
            r3 = r3 & r4
        L_0x0171:
            r18 = r30
            r24 = r34
            r25 = r35
            r26 = r36
            r0 = r6
            r22 = r12
            r12 = r9
            goto L_0x01e2
        L_0x017f:
            if (r5 == 0) goto L_0x0186
            androidx.compose.ui.Modifier$Companion r0 = androidx.compose.ui.Modifier.Companion
            androidx.compose.ui.Modifier r0 = (androidx.compose.ui.Modifier) r0
            r6 = r0
        L_0x0186:
            r0 = 0
            if (r7 == 0) goto L_0x0191
            r5 = 3
            androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState r5 = androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridStateKt.rememberLazyStaggeredGridState(r0, r0, r13, r0, r5)
            r3 = r3 & -897(0xfffffffffffffc7f, float:NaN)
            goto L_0x0193
        L_0x0191:
            r5 = r30
        L_0x0193:
            if (r8 == 0) goto L_0x019f
            float r7 = (float) r0
            float r7 = androidx.compose.ui.unit.Dp.m5626constructorimpl(r7)
            androidx.compose.foundation.layout.PaddingValues r7 = androidx.compose.foundation.layout.PaddingKt.m486PaddingValues0680j_4(r7)
            goto L_0x01a0
        L_0x019f:
            r7 = r9
        L_0x01a0:
            if (r10 == 0) goto L_0x01a3
            r12 = r0
        L_0x01a3:
            if (r16 == 0) goto L_0x01b3
            androidx.compose.foundation.layout.Arrangement r8 = androidx.compose.foundation.layout.Arrangement.INSTANCE
            float r9 = (float) r0
            float r9 = androidx.compose.ui.unit.Dp.m5626constructorimpl(r9)
            androidx.compose.foundation.layout.Arrangement$HorizontalOrVertical r8 = r8.m410spacedBy0680j_4(r9)
            androidx.compose.foundation.layout.Arrangement$Vertical r8 = (androidx.compose.foundation.layout.Arrangement.Vertical) r8
            goto L_0x01b4
        L_0x01b3:
            r8 = r11
        L_0x01b4:
            if (r18 == 0) goto L_0x01bc
            float r0 = (float) r0
            float r0 = androidx.compose.ui.unit.Dp.m5626constructorimpl(r0)
            goto L_0x01be
        L_0x01bc:
            r0 = r34
        L_0x01be:
            r9 = r14 & 128(0x80, float:1.794E-43)
            if (r9 == 0) goto L_0x01cb
            androidx.compose.foundation.gestures.ScrollableDefaults r9 = androidx.compose.foundation.gestures.ScrollableDefaults.INSTANCE
            r10 = 6
            androidx.compose.foundation.gestures.FlingBehavior r9 = r9.flingBehavior(r13, r10)
            r3 = r3 & r4
            goto L_0x01cd
        L_0x01cb:
            r9 = r35
        L_0x01cd:
            if (r2 == 0) goto L_0x01d5
            r2 = 1
            r24 = r0
            r26 = r2
            goto L_0x01d9
        L_0x01d5:
            r26 = r36
            r24 = r0
        L_0x01d9:
            r18 = r5
            r0 = r6
            r11 = r8
            r25 = r9
            r22 = r12
            r12 = r7
        L_0x01e2:
            r13.endDefaults()
            boolean r2 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r2 == 0) goto L_0x01f5
            r2 = -1
            java.lang.String r4 = "androidx.compose.foundation.lazy.staggeredgrid.LazyHorizontalStaggeredGrid (LazyStaggeredGridDsl.kt:143)"
            r5 = -8666074(0xffffffffff7bc426, float:-3.3465469E38)
            androidx.compose.runtime.ComposerKt.traceEventStart(r5, r3, r2, r4)
        L_0x01f5:
            androidx.compose.foundation.gestures.Orientation r4 = androidx.compose.foundation.gestures.Orientation.Horizontal
            float r16 = r11.m432getSpacingD9Ej5fM()
            r2 = r3 & 14
            int r5 = r3 >> 12
            r5 = r5 & 112(0x70, float:1.57E-43)
            r2 = r2 | r5
            int r5 = r3 >> 3
            r6 = r5 & 896(0x380, float:1.256E-42)
            r2 = r2 | r6
            kotlin.jvm.functions.Function2 r6 = rememberRowHeightSums(r1, r11, r12, r13, r2)
            int r2 = r3 << 6
            r7 = r2 & 7168(0x1c00, float:1.0045E-41)
            r7 = r7 | 56
            int r8 = r3 << 3
            r9 = 57344(0xe000, float:8.0356E-41)
            r9 = r9 & r8
            r7 = r7 | r9
            r8 = r8 & r17
            r7 = r7 | r8
            r8 = r5 & r19
            r7 = r7 | r8
            r5 = r5 & r21
            r5 = r5 | r7
            r2 = r2 & r23
            r17 = r5 | r2
            int r2 = r3 >> 27
            r19 = r2 & 14
            r20 = 0
            r2 = r18
            r3 = r4
            r4 = r6
            r5 = r0
            r6 = r12
            r7 = r22
            r8 = r25
            r9 = r26
            r10 = r24
            r21 = r11
            r11 = r16
            r23 = r12
            r12 = r37
            r27 = r13
            r14 = r17
            r15 = r19
            r16 = r20
            androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridKt.m775LazyStaggeredGridLJWHXA8(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            boolean r2 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r2 == 0) goto L_0x0255
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L_0x0255:
            r2 = r0
            r3 = r18
            r6 = r21
            r5 = r22
            r4 = r23
            r7 = r24
            r8 = r25
            r9 = r26
        L_0x0264:
            androidx.compose.runtime.ScopeUpdateScope r13 = r27.endRestartGroup()
            if (r13 != 0) goto L_0x026b
            goto L_0x027e
        L_0x026b:
            androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt$LazyHorizontalStaggeredGrid$1 r14 = new androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt$LazyHorizontalStaggeredGrid$1
            r0 = r14
            r1 = r28
            r10 = r37
            r11 = r39
            r12 = r40
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            kotlin.jvm.functions.Function2 r14 = (kotlin.jvm.functions.Function2) r14
            r13.updateScope(r14)
        L_0x027e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt.m769LazyHorizontalStaggeredGridcJHQLPU(androidx.compose.foundation.lazy.staggeredgrid.StaggeredGridCells, androidx.compose.ui.Modifier, androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState, androidx.compose.foundation.layout.PaddingValues, boolean, androidx.compose.foundation.layout.Arrangement$Vertical, float, androidx.compose.foundation.gestures.FlingBehavior, boolean, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    private static final Function2<Density, Constraints, int[]> rememberRowHeightSums(StaggeredGridCells staggeredGridCells, Arrangement.Vertical vertical, PaddingValues paddingValues, Composer composer, int i) {
        composer.startReplaceableGroup(-1665208491);
        ComposerKt.sourceInformation(composer, "C(rememberRowHeightSums)P(1,2)177@7800L860:LazyStaggeredGridDsl.kt#fzvcnm");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1665208491, i, -1, "androidx.compose.foundation.lazy.staggeredgrid.rememberRowHeightSums (LazyStaggeredGridDsl.kt:173)");
        }
        composer.startReplaceableGroup(1618982084);
        ComposerKt.sourceInformation(composer, "CC(remember)P(1,2,3):Composables.kt#9igjgp");
        boolean changed = composer.changed((Object) staggeredGridCells) | composer.changed((Object) vertical) | composer.changed((Object) paddingValues);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new LazyStaggeredGridDslKt$rememberRowHeightSums$1$1(paddingValues, staggeredGridCells, vertical);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        Function2<Density, Constraints, int[]> function2 = (Function2) rememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return function2;
    }

    public static /* synthetic */ void items$default(LazyStaggeredGridScope lazyStaggeredGridScope, List list, Function1 function1, Function1 function12, Function1 function13, Function4 function4, int i, Object obj) {
        Function1 function14 = null;
        if ((i & 2) != 0) {
            function1 = null;
        }
        if ((i & 4) != 0) {
            function12 = LazyStaggeredGridDslKt$items$1.INSTANCE;
        }
        if ((i & 8) != 0) {
            function13 = null;
        }
        Intrinsics.checkNotNullParameter(lazyStaggeredGridScope, "<this>");
        Intrinsics.checkNotNullParameter(list, "items");
        Intrinsics.checkNotNullParameter(function12, "contentType");
        Intrinsics.checkNotNullParameter(function4, "itemContent");
        int size = list.size();
        Function1 lazyStaggeredGridDslKt$items$2$1 = function1 != null ? new LazyStaggeredGridDslKt$items$2$1(function1, list) : null;
        Function1 lazyStaggeredGridDslKt$items$3 = new LazyStaggeredGridDslKt$items$3(function12, list);
        if (function13 != null) {
            function14 = new LazyStaggeredGridDslKt$items$4$1(function13, list);
        }
        lazyStaggeredGridScope.items(size, lazyStaggeredGridDslKt$items$2$1, lazyStaggeredGridDslKt$items$3, function14, ComposableLambdaKt.composableLambdaInstance(-886456479, true, new LazyStaggeredGridDslKt$items$5(function4, list)));
    }

    public static final <T> void items(LazyStaggeredGridScope lazyStaggeredGridScope, List<? extends T> list, Function1<? super T, ? extends Object> function1, Function1<? super T, ? extends Object> function12, Function1<? super T, StaggeredGridItemSpan> function13, Function4<? super LazyStaggeredGridItemScope, ? super T, ? super Composer, ? super Integer, Unit> function4) {
        Intrinsics.checkNotNullParameter(lazyStaggeredGridScope, "<this>");
        Intrinsics.checkNotNullParameter(list, "items");
        Intrinsics.checkNotNullParameter(function12, "contentType");
        Intrinsics.checkNotNullParameter(function4, "itemContent");
        int size = list.size();
        Function1 function14 = null;
        Function1 lazyStaggeredGridDslKt$items$2$1 = function1 != null ? new LazyStaggeredGridDslKt$items$2$1(function1, list) : null;
        Function1 lazyStaggeredGridDslKt$items$3 = new LazyStaggeredGridDslKt$items$3(function12, list);
        if (function13 != null) {
            function14 = new LazyStaggeredGridDslKt$items$4$1(function13, list);
        }
        lazyStaggeredGridScope.items(size, lazyStaggeredGridDslKt$items$2$1, lazyStaggeredGridDslKt$items$3, function14, ComposableLambdaKt.composableLambdaInstance(-886456479, true, new LazyStaggeredGridDslKt$items$5(function4, list)));
    }

    public static /* synthetic */ void itemsIndexed$default(LazyStaggeredGridScope lazyStaggeredGridScope, List list, Function2 function2, Function2 function22, Function2 function23, Function5 function5, int i, Object obj) {
        Function1 function1 = null;
        if ((i & 2) != 0) {
            function2 = null;
        }
        if ((i & 4) != 0) {
            function22 = LazyStaggeredGridDslKt$itemsIndexed$1.INSTANCE;
        }
        if ((i & 8) != 0) {
            function23 = null;
        }
        Intrinsics.checkNotNullParameter(lazyStaggeredGridScope, "<this>");
        Intrinsics.checkNotNullParameter(list, "items");
        Intrinsics.checkNotNullParameter(function22, "contentType");
        Intrinsics.checkNotNullParameter(function5, "itemContent");
        int size = list.size();
        Function1 lazyStaggeredGridDslKt$itemsIndexed$2$1 = function2 != null ? new LazyStaggeredGridDslKt$itemsIndexed$2$1(function2, list) : null;
        Function1 lazyStaggeredGridDslKt$itemsIndexed$3 = new LazyStaggeredGridDslKt$itemsIndexed$3(function22, list);
        if (function23 != null) {
            function1 = new LazyStaggeredGridDslKt$itemsIndexed$4$1(function23, list);
        }
        lazyStaggeredGridScope.items(size, lazyStaggeredGridDslKt$itemsIndexed$2$1, lazyStaggeredGridDslKt$itemsIndexed$3, function1, ComposableLambdaKt.composableLambdaInstance(284833944, true, new LazyStaggeredGridDslKt$itemsIndexed$5(function5, list)));
    }

    public static final <T> void itemsIndexed(LazyStaggeredGridScope lazyStaggeredGridScope, List<? extends T> list, Function2<? super Integer, ? super T, ? extends Object> function2, Function2<? super Integer, ? super T, ? extends Object> function22, Function2<? super Integer, ? super T, StaggeredGridItemSpan> function23, Function5<? super LazyStaggeredGridItemScope, ? super Integer, ? super T, ? super Composer, ? super Integer, Unit> function5) {
        Intrinsics.checkNotNullParameter(lazyStaggeredGridScope, "<this>");
        Intrinsics.checkNotNullParameter(list, "items");
        Intrinsics.checkNotNullParameter(function22, "contentType");
        Intrinsics.checkNotNullParameter(function5, "itemContent");
        int size = list.size();
        Function1 function1 = null;
        Function1 lazyStaggeredGridDslKt$itemsIndexed$2$1 = function2 != null ? new LazyStaggeredGridDslKt$itemsIndexed$2$1(function2, list) : null;
        Function1 lazyStaggeredGridDslKt$itemsIndexed$3 = new LazyStaggeredGridDslKt$itemsIndexed$3(function22, list);
        if (function23 != null) {
            function1 = new LazyStaggeredGridDslKt$itemsIndexed$4$1(function23, list);
        }
        lazyStaggeredGridScope.items(size, lazyStaggeredGridDslKt$itemsIndexed$2$1, lazyStaggeredGridDslKt$itemsIndexed$3, function1, ComposableLambdaKt.composableLambdaInstance(284833944, true, new LazyStaggeredGridDslKt$itemsIndexed$5(function5, list)));
    }

    public static /* synthetic */ void items$default(LazyStaggeredGridScope lazyStaggeredGridScope, Object[] objArr, Function1 function1, Function1 function12, Function1 function13, Function4 function4, int i, Object obj) {
        Function1 function14 = null;
        if ((i & 2) != 0) {
            function1 = null;
        }
        if ((i & 4) != 0) {
            function12 = LazyStaggeredGridDslKt$items$6.INSTANCE;
        }
        if ((i & 8) != 0) {
            function13 = null;
        }
        Intrinsics.checkNotNullParameter(lazyStaggeredGridScope, "<this>");
        Intrinsics.checkNotNullParameter(objArr, "items");
        Intrinsics.checkNotNullParameter(function12, "contentType");
        Intrinsics.checkNotNullParameter(function4, "itemContent");
        int length = objArr.length;
        Function1 lazyStaggeredGridDslKt$items$7$1 = function1 != null ? new LazyStaggeredGridDslKt$items$7$1(function1, objArr) : null;
        Function1 lazyStaggeredGridDslKt$items$8 = new LazyStaggeredGridDslKt$items$8(function12, objArr);
        if (function13 != null) {
            function14 = new LazyStaggeredGridDslKt$items$9$1(function13, objArr);
        }
        lazyStaggeredGridScope.items(length, lazyStaggeredGridDslKt$items$7$1, lazyStaggeredGridDslKt$items$8, function14, ComposableLambdaKt.composableLambdaInstance(2101296000, true, new LazyStaggeredGridDslKt$items$10(function4, objArr)));
    }

    public static final <T> void items(LazyStaggeredGridScope lazyStaggeredGridScope, T[] tArr, Function1<? super T, ? extends Object> function1, Function1<? super T, ? extends Object> function12, Function1<? super T, StaggeredGridItemSpan> function13, Function4<? super LazyStaggeredGridItemScope, ? super T, ? super Composer, ? super Integer, Unit> function4) {
        Intrinsics.checkNotNullParameter(lazyStaggeredGridScope, "<this>");
        Intrinsics.checkNotNullParameter(tArr, "items");
        Intrinsics.checkNotNullParameter(function12, "contentType");
        Intrinsics.checkNotNullParameter(function4, "itemContent");
        int length = tArr.length;
        Function1 function14 = null;
        Function1 lazyStaggeredGridDslKt$items$7$1 = function1 != null ? new LazyStaggeredGridDslKt$items$7$1(function1, tArr) : null;
        Function1 lazyStaggeredGridDslKt$items$8 = new LazyStaggeredGridDslKt$items$8(function12, tArr);
        if (function13 != null) {
            function14 = new LazyStaggeredGridDslKt$items$9$1(function13, tArr);
        }
        lazyStaggeredGridScope.items(length, lazyStaggeredGridDslKt$items$7$1, lazyStaggeredGridDslKt$items$8, function14, ComposableLambdaKt.composableLambdaInstance(2101296000, true, new LazyStaggeredGridDslKt$items$10(function4, tArr)));
    }

    public static /* synthetic */ void itemsIndexed$default(LazyStaggeredGridScope lazyStaggeredGridScope, Object[] objArr, Function2 function2, Function2 function22, Function2 function23, Function5 function5, int i, Object obj) {
        Function1 function1 = null;
        if ((i & 2) != 0) {
            function2 = null;
        }
        if ((i & 4) != 0) {
            function22 = LazyStaggeredGridDslKt$itemsIndexed$6.INSTANCE;
        }
        if ((i & 8) != 0) {
            function23 = null;
        }
        Intrinsics.checkNotNullParameter(lazyStaggeredGridScope, "<this>");
        Intrinsics.checkNotNullParameter(objArr, "items");
        Intrinsics.checkNotNullParameter(function22, "contentType");
        Intrinsics.checkNotNullParameter(function5, "itemContent");
        int length = objArr.length;
        Function1 lazyStaggeredGridDslKt$itemsIndexed$7$1 = function2 != null ? new LazyStaggeredGridDslKt$itemsIndexed$7$1(function2, objArr) : null;
        Function1 lazyStaggeredGridDslKt$itemsIndexed$8 = new LazyStaggeredGridDslKt$itemsIndexed$8(function22, objArr);
        if (function23 != null) {
            function1 = new LazyStaggeredGridDslKt$itemsIndexed$9$1(function23, objArr);
        }
        lazyStaggeredGridScope.items(length, lazyStaggeredGridDslKt$itemsIndexed$7$1, lazyStaggeredGridDslKt$itemsIndexed$8, function1, ComposableLambdaKt.composableLambdaInstance(-804487775, true, new LazyStaggeredGridDslKt$itemsIndexed$10(function5, objArr)));
    }

    public static final <T> void itemsIndexed(LazyStaggeredGridScope lazyStaggeredGridScope, T[] tArr, Function2<? super Integer, ? super T, ? extends Object> function2, Function2<? super Integer, ? super T, ? extends Object> function22, Function2<? super Integer, ? super T, StaggeredGridItemSpan> function23, Function5<? super LazyStaggeredGridItemScope, ? super Integer, ? super T, ? super Composer, ? super Integer, Unit> function5) {
        Intrinsics.checkNotNullParameter(lazyStaggeredGridScope, "<this>");
        Intrinsics.checkNotNullParameter(tArr, "items");
        Intrinsics.checkNotNullParameter(function22, "contentType");
        Intrinsics.checkNotNullParameter(function5, "itemContent");
        int length = tArr.length;
        Function1 function1 = null;
        Function1 lazyStaggeredGridDslKt$itemsIndexed$7$1 = function2 != null ? new LazyStaggeredGridDslKt$itemsIndexed$7$1(function2, tArr) : null;
        Function1 lazyStaggeredGridDslKt$itemsIndexed$8 = new LazyStaggeredGridDslKt$itemsIndexed$8(function22, tArr);
        if (function23 != null) {
            function1 = new LazyStaggeredGridDslKt$itemsIndexed$9$1(function23, tArr);
        }
        lazyStaggeredGridScope.items(length, lazyStaggeredGridDslKt$itemsIndexed$7$1, lazyStaggeredGridDslKt$itemsIndexed$8, function1, ComposableLambdaKt.composableLambdaInstance(-804487775, true, new LazyStaggeredGridDslKt$itemsIndexed$10(function5, tArr)));
    }
}
