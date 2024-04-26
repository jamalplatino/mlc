package androidx.compose.foundation.layout;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;

@Metadata(d1 = {"\u0000¶\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0015\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aS\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u00022\u001c\u0010\u000f\u001a\u0018\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00050\u0010¢\u0006\u0002\b\u0012¢\u0006\u0002\b\u0013H\u0007¢\u0006\u0002\u0010\u0014\u001aS\u0010\u0015\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\u0016\u001a\u00020\u00172\b\b\u0002\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u00022\u001c\u0010\u000f\u001a\u0018\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u00050\u0010¢\u0006\u0002\b\u0012¢\u0006\u0002\b\u0013H\u0007¢\u0006\u0002\u0010\u001c\u001a)\u0010\u001d\u001a\u00020\u001e2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\u0006\u0010\u001f\u001a\u00020\u0002H\u0003¢\u0006\u0002\u0010 \u001a\u0001\u0010!\u001a\u00020\u001e2\u0006\u0010\"\u001a\u00020#2*\u0010$\u001a&\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00050%2\u0006\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020-2$\u0010.\u001a \u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00050\u00012\u0006\u0010\u001f\u001a\u00020\u0002H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b/\u00100\u001ax\u00101\u001a\u00020\u00022\f\u00102\u001a\b\u0012\u0004\u0012\u000204032#\u00105\u001a\u001f\u0012\u0004\u0012\u000204\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000206¢\u0006\u0002\b\u00132#\u0010*\u001a\u001f\u0012\u0004\u0012\u000204\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000206¢\u0006\u0002\b\u00132\u0006\u00107\u001a\u00020\u00022\u0006\u00108\u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u0002H\u0002\u001a>\u00101\u001a\u00020\u00022\f\u00102\u001a\b\u0012\u0004\u0012\u000204032\u0006\u00109\u001a\u00020\u00032\u0006\u0010:\u001a\u00020\u00032\u0006\u00107\u001a\u00020\u00022\u0006\u00108\u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u0002H\u0002\u001a9\u0010;\u001a&\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00050%2\u0006\u0010\n\u001a\u00020\u000bH\u0003¢\u0006\u0002\u0010<\u001a9\u0010=\u001a&\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00050%2\u0006\u0010\u0016\u001a\u00020\u0017H\u0003¢\u0006\u0002\u0010>\u001aS\u0010?\u001a\u00020\u00022\f\u00102\u001a\b\u0012\u0004\u0012\u000204032#\u00105\u001a\u001f\u0012\u0004\u0012\u000204\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000206¢\u0006\u0002\b\u00132\u0006\u0010@\u001a\u00020\u00022\u0006\u00108\u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u0002H\u0002\u001ax\u0010A\u001a\u00020\u00022\f\u00102\u001a\b\u0012\u0004\u0012\u000204032#\u00105\u001a\u001f\u0012\u0004\u0012\u000204\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000206¢\u0006\u0002\b\u00132#\u0010*\u001a\u001f\u0012\u0004\u0012\u000204\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000206¢\u0006\u0002\b\u00132\u0006\u0010@\u001a\u00020\u00022\u0006\u00108\u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u0002H\u0002\u001a)\u0010B\u001a\u00020\u001e2\b\b\u0002\u0010\u0016\u001a\u00020\u00172\b\b\u0002\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001f\u001a\u00020\u0002H\u0003¢\u0006\u0002\u0010C\u001a,\u0010D\u001a\u00020E*\u00020\u00042\u0006\u0010F\u001a\u00020G2\u0006\u0010\"\u001a\u00020#2\u0006\u0010H\u001a\u00020I2\u0006\u0010\u001f\u001a\u00020\u0002H\u0000\u001a\u001c\u0010J\u001a\u00020\u0002*\u00020K2\u0006\u0010\"\u001a\u00020#2\u0006\u00105\u001a\u00020\u0002H\u0000\u001a\u0014\u0010*\u001a\u00020\u0002*\u00020L2\u0006\u0010\"\u001a\u00020#H\u0000\u001a\u001c\u0010M\u001a\u00020\u0002*\u00020K2\u0006\u0010\"\u001a\u00020#2\u0006\u0010*\u001a\u00020\u0002H\u0000\u001a\u0014\u00105\u001a\u00020\u0002*\u00020L2\u0006\u0010\"\u001a\u00020#H\u0000\u001a2\u0010N\u001a\u00020\u0002*\u00020K2\u0006\u0010H\u001a\u00020I2\u0006\u0010\"\u001a\u00020#2\u0014\u0010O\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010L\u0012\u0004\u0012\u00020\u00050\u0010H\u0002\",\u0010\u0000\u001a \u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00050\u0001X\u0004¢\u0006\u0002\n\u0000\",\u0010\u0006\u001a \u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00050\u0001X\u0004¢\u0006\u0002\n\u0000\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006P"}, d2 = {"crossAxisColumnArrangement", "Lkotlin/Function4;", "", "", "Landroidx/compose/ui/layout/MeasureScope;", "", "crossAxisRowArrangement", "FlowColumn", "modifier", "Landroidx/compose/ui/Modifier;", "verticalArrangement", "Landroidx/compose/foundation/layout/Arrangement$Vertical;", "horizontalAlignment", "Landroidx/compose/ui/Alignment$Horizontal;", "maxItemsInEachColumn", "content", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/ColumnScope;", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/ui/Alignment$Horizontal;ILkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "FlowRow", "horizontalArrangement", "Landroidx/compose/foundation/layout/Arrangement$Horizontal;", "verticalAlignment", "Landroidx/compose/ui/Alignment$Vertical;", "maxItemsInEachRow", "Landroidx/compose/foundation/layout/RowScope;", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/ui/Alignment$Vertical;ILkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "columnMeasurementHelper", "Landroidx/compose/ui/layout/MeasurePolicy;", "maxItemsInMainAxis", "(Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/ui/Alignment$Horizontal;ILandroidx/compose/runtime/Composer;II)Landroidx/compose/ui/layout/MeasurePolicy;", "flowMeasurePolicy", "orientation", "Landroidx/compose/foundation/layout/LayoutOrientation;", "mainAxisArrangement", "Lkotlin/Function5;", "Landroidx/compose/ui/unit/LayoutDirection;", "Landroidx/compose/ui/unit/Density;", "arrangementSpacing", "Landroidx/compose/ui/unit/Dp;", "crossAxisSize", "Landroidx/compose/foundation/layout/SizeMode;", "crossAxisAlignment", "Landroidx/compose/foundation/layout/CrossAxisAlignment;", "crossAxisArrangement", "flowMeasurePolicy-942rkJo", "(Landroidx/compose/foundation/layout/LayoutOrientation;Lkotlin/jvm/functions/Function5;FLandroidx/compose/foundation/layout/SizeMode;Landroidx/compose/foundation/layout/CrossAxisAlignment;Lkotlin/jvm/functions/Function4;I)Landroidx/compose/ui/layout/MeasurePolicy;", "intrinsicCrossAxisSize", "children", "", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", "mainAxisSize", "Lkotlin/Function3;", "mainAxisAvailable", "mainAxisSpacing", "mainAxisSizes", "crossAxisSizes", "mainAxisColumnArrangement", "(Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/runtime/Composer;I)Lkotlin/jvm/functions/Function5;", "mainAxisRowArrangement", "(Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/runtime/Composer;I)Lkotlin/jvm/functions/Function5;", "maxIntrinsicMainAxisSize", "crossAxisAvailable", "minIntrinsicMainAxisSize", "rowMeasurementHelper", "(Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/ui/Alignment$Vertical;ILandroidx/compose/runtime/Composer;II)Landroidx/compose/ui/layout/MeasurePolicy;", "breakDownItems", "Landroidx/compose/foundation/layout/FlowResult;", "measureHelper", "Landroidx/compose/foundation/layout/RowColumnMeasurementHelper;", "constraints", "Landroidx/compose/foundation/layout/OrientationIndependentConstraints;", "crossAxisMin", "Landroidx/compose/ui/layout/Measurable;", "Landroidx/compose/ui/layout/Placeable;", "mainAxisMin", "measureAndCache", "storePlaceable", "foundation-layout_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: FlowLayout.kt */
public final class FlowLayoutKt {
    private static final Function4<Integer, int[], MeasureScope, int[], Unit> crossAxisColumnArrangement = FlowLayoutKt$crossAxisColumnArrangement$1.INSTANCE;
    private static final Function4<Integer, int[], MeasureScope, int[], Unit> crossAxisRowArrangement = FlowLayoutKt$crossAxisRowArrangement$1.INSTANCE;

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0056  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0059  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0075  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x008e  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0091  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00b2  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00ba  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x01f2  */
    /* JADX WARNING: Removed duplicated region for block: B:89:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void FlowRow(androidx.compose.ui.Modifier r16, androidx.compose.foundation.layout.Arrangement.Horizontal r17, androidx.compose.ui.Alignment.Vertical r18, int r19, kotlin.jvm.functions.Function3<? super androidx.compose.foundation.layout.RowScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r20, androidx.compose.runtime.Composer r21, int r22, int r23) {
        /*
            r5 = r20
            r6 = r22
            java.lang.String r0 = "content"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            r0 = 1098475987(0x417969d3, float:15.588336)
            r1 = r21
            androidx.compose.runtime.Composer r1 = r1.startRestartGroup(r0)
            java.lang.String r2 = "C(FlowRow)P(3,1,4,2)60@2401L111,65@2517L130:FlowLayout.kt#2w3rfo"
            androidx.compose.runtime.ComposerKt.sourceInformation(r1, r2)
            r2 = r23 & 1
            if (r2 == 0) goto L_0x0022
            r3 = r6 | 6
            r4 = r3
            r3 = r16
            goto L_0x0036
        L_0x0022:
            r3 = r6 & 14
            if (r3 != 0) goto L_0x0033
            r3 = r16
            boolean r4 = r1.changed((java.lang.Object) r3)
            if (r4 == 0) goto L_0x0030
            r4 = 4
            goto L_0x0031
        L_0x0030:
            r4 = 2
        L_0x0031:
            r4 = r4 | r6
            goto L_0x0036
        L_0x0033:
            r3 = r16
            r4 = r6
        L_0x0036:
            r7 = r23 & 2
            if (r7 == 0) goto L_0x003d
            r4 = r4 | 48
            goto L_0x0050
        L_0x003d:
            r8 = r6 & 112(0x70, float:1.57E-43)
            if (r8 != 0) goto L_0x0050
            r8 = r17
            boolean r9 = r1.changed((java.lang.Object) r8)
            if (r9 == 0) goto L_0x004c
            r9 = 32
            goto L_0x004e
        L_0x004c:
            r9 = 16
        L_0x004e:
            r4 = r4 | r9
            goto L_0x0052
        L_0x0050:
            r8 = r17
        L_0x0052:
            r9 = r23 & 4
            if (r9 == 0) goto L_0x0059
            r4 = r4 | 384(0x180, float:5.38E-43)
            goto L_0x006c
        L_0x0059:
            r10 = r6 & 896(0x380, float:1.256E-42)
            if (r10 != 0) goto L_0x006c
            r10 = r18
            boolean r11 = r1.changed((java.lang.Object) r10)
            if (r11 == 0) goto L_0x0068
            r11 = 256(0x100, float:3.59E-43)
            goto L_0x006a
        L_0x0068:
            r11 = 128(0x80, float:1.794E-43)
        L_0x006a:
            r4 = r4 | r11
            goto L_0x006e
        L_0x006c:
            r10 = r18
        L_0x006e:
            r11 = r23 & 8
            if (r11 == 0) goto L_0x0075
            r4 = r4 | 3072(0xc00, float:4.305E-42)
            goto L_0x0088
        L_0x0075:
            r12 = r6 & 7168(0x1c00, float:1.0045E-41)
            if (r12 != 0) goto L_0x0088
            r12 = r19
            boolean r13 = r1.changed((int) r12)
            if (r13 == 0) goto L_0x0084
            r13 = 2048(0x800, float:2.87E-42)
            goto L_0x0086
        L_0x0084:
            r13 = 1024(0x400, float:1.435E-42)
        L_0x0086:
            r4 = r4 | r13
            goto L_0x008a
        L_0x0088:
            r12 = r19
        L_0x008a:
            r13 = r23 & 16
            if (r13 == 0) goto L_0x0091
            r4 = r4 | 24576(0x6000, float:3.4438E-41)
            goto L_0x00a3
        L_0x0091:
            r13 = 57344(0xe000, float:8.0356E-41)
            r13 = r13 & r6
            if (r13 != 0) goto L_0x00a3
            boolean r13 = r1.changed((java.lang.Object) r5)
            if (r13 == 0) goto L_0x00a0
            r13 = 16384(0x4000, float:2.2959E-41)
            goto L_0x00a2
        L_0x00a0:
            r13 = 8192(0x2000, float:1.14794E-41)
        L_0x00a2:
            r4 = r4 | r13
        L_0x00a3:
            r13 = 46811(0xb6db, float:6.5596E-41)
            r13 = r13 & r4
            r14 = 9362(0x2492, float:1.3119E-41)
            if (r13 != r14) goto L_0x00ba
            boolean r13 = r1.getSkipping()
            if (r13 != 0) goto L_0x00b2
            goto L_0x00ba
        L_0x00b2:
            r1.skipToGroupEnd()
            r2 = r3
            r3 = r10
            r4 = r12
            goto L_0x01eb
        L_0x00ba:
            if (r2 == 0) goto L_0x00c1
            androidx.compose.ui.Modifier$Companion r2 = androidx.compose.ui.Modifier.Companion
            androidx.compose.ui.Modifier r2 = (androidx.compose.ui.Modifier) r2
            goto L_0x00c2
        L_0x00c1:
            r2 = r3
        L_0x00c2:
            if (r7 == 0) goto L_0x00cb
            androidx.compose.foundation.layout.Arrangement r3 = androidx.compose.foundation.layout.Arrangement.INSTANCE
            androidx.compose.foundation.layout.Arrangement$Horizontal r3 = r3.getStart()
            goto L_0x00cc
        L_0x00cb:
            r3 = r8
        L_0x00cc:
            if (r9 == 0) goto L_0x00d6
            androidx.compose.ui.Alignment$Companion r7 = androidx.compose.ui.Alignment.Companion
            androidx.compose.ui.Alignment$Vertical r7 = r7.getTop()
            r13 = r7
            goto L_0x00d7
        L_0x00d6:
            r13 = r10
        L_0x00d7:
            if (r11 == 0) goto L_0x00de
            r7 = 2147483647(0x7fffffff, float:NaN)
            r14 = r7
            goto L_0x00df
        L_0x00de:
            r14 = r12
        L_0x00df:
            boolean r7 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r7 == 0) goto L_0x00ec
            r7 = -1
            java.lang.String r8 = "androidx.compose.foundation.layout.FlowRow (FlowLayout.kt:53)"
            androidx.compose.runtime.ComposerKt.traceEventStart(r0, r4, r7, r8)
        L_0x00ec:
            int r0 = r4 >> 3
            r7 = r0 & 14
            r8 = r0 & 112(0x70, float:1.57E-43)
            r7 = r7 | r8
            r0 = r0 & 896(0x380, float:1.256E-42)
            r11 = r7 | r0
            r12 = 0
            r7 = r3
            r8 = r13
            r9 = r14
            r10 = r1
            androidx.compose.ui.layout.MeasurePolicy r0 = rowMeasurementHelper(r7, r8, r9, r10, r11, r12)
            int r7 = r4 << 3
            r7 = r7 & 112(0x70, float:1.57E-43)
            r8 = -1323940314(0xffffffffb1164626, float:-2.1867748E-9)
            r1.startReplaceableGroup(r8)
            java.lang.String r8 = "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh"
            androidx.compose.runtime.ComposerKt.sourceInformation(r1, r8)
            androidx.compose.runtime.ProvidableCompositionLocal r8 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalDensity()
            androidx.compose.runtime.CompositionLocal r8 = (androidx.compose.runtime.CompositionLocal) r8
            r9 = 2023513938(0x789c5f52, float:2.5372864E34)
            java.lang.String r10 = "C:CompositionLocal.kt#9igjgp"
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(r1, r9, r10)
            java.lang.Object r8 = r1.consume(r8)
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(r1)
            androidx.compose.ui.unit.Density r8 = (androidx.compose.ui.unit.Density) r8
            androidx.compose.runtime.ProvidableCompositionLocal r11 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalLayoutDirection()
            androidx.compose.runtime.CompositionLocal r11 = (androidx.compose.runtime.CompositionLocal) r11
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(r1, r9, r10)
            java.lang.Object r11 = r1.consume(r11)
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(r1)
            androidx.compose.ui.unit.LayoutDirection r11 = (androidx.compose.ui.unit.LayoutDirection) r11
            androidx.compose.runtime.ProvidableCompositionLocal r12 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalViewConfiguration()
            androidx.compose.runtime.CompositionLocal r12 = (androidx.compose.runtime.CompositionLocal) r12
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(r1, r9, r10)
            java.lang.Object r9 = r1.consume(r12)
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(r1)
            androidx.compose.ui.platform.ViewConfiguration r9 = (androidx.compose.ui.platform.ViewConfiguration) r9
            androidx.compose.ui.node.ComposeUiNode$Companion r10 = androidx.compose.ui.node.ComposeUiNode.Companion
            kotlin.jvm.functions.Function0 r10 = r10.getConstructor()
            kotlin.jvm.functions.Function3 r12 = androidx.compose.ui.layout.LayoutKt.materializerOf(r2)
            int r7 = r7 << 9
            r7 = r7 & 7168(0x1c00, float:1.0045E-41)
            r7 = r7 | 6
            androidx.compose.runtime.Applier r15 = r1.getApplier()
            boolean r15 = r15 instanceof androidx.compose.runtime.Applier
            if (r15 != 0) goto L_0x0165
            androidx.compose.runtime.ComposablesKt.invalidApplier()
        L_0x0165:
            r1.startReusableNode()
            boolean r15 = r1.getInserting()
            if (r15 == 0) goto L_0x0172
            r1.createNode(r10)
            goto L_0x0175
        L_0x0172:
            r1.useNode()
        L_0x0175:
            r1.disableReusing()
            androidx.compose.runtime.Composer r10 = androidx.compose.runtime.Updater.m2444constructorimpl(r1)
            androidx.compose.ui.node.ComposeUiNode$Companion r15 = androidx.compose.ui.node.ComposeUiNode.Companion
            kotlin.jvm.functions.Function2 r15 = r15.getSetMeasurePolicy()
            androidx.compose.runtime.Updater.m2451setimpl((androidx.compose.runtime.Composer) r10, r0, r15)
            androidx.compose.ui.node.ComposeUiNode$Companion r0 = androidx.compose.ui.node.ComposeUiNode.Companion
            kotlin.jvm.functions.Function2 r0 = r0.getSetDensity()
            androidx.compose.runtime.Updater.m2451setimpl((androidx.compose.runtime.Composer) r10, r8, r0)
            androidx.compose.ui.node.ComposeUiNode$Companion r0 = androidx.compose.ui.node.ComposeUiNode.Companion
            kotlin.jvm.functions.Function2 r0 = r0.getSetLayoutDirection()
            androidx.compose.runtime.Updater.m2451setimpl((androidx.compose.runtime.Composer) r10, r11, r0)
            androidx.compose.ui.node.ComposeUiNode$Companion r0 = androidx.compose.ui.node.ComposeUiNode.Companion
            kotlin.jvm.functions.Function2 r0 = r0.getSetViewConfiguration()
            androidx.compose.runtime.Updater.m2451setimpl((androidx.compose.runtime.Composer) r10, r9, r0)
            r1.enableReusing()
            androidx.compose.runtime.Composer r0 = androidx.compose.runtime.SkippableUpdater.m2436constructorimpl(r1)
            androidx.compose.runtime.SkippableUpdater r0 = androidx.compose.runtime.SkippableUpdater.m2435boximpl(r0)
            int r7 = r7 >> 3
            r7 = r7 & 112(0x70, float:1.57E-43)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r12.invoke(r0, r1, r7)
            r0 = 2058660585(0x7ab4aae9, float:4.6903995E35)
            r1.startReplaceableGroup(r0)
            r0 = 483375088(0x1ccfb7f0, float:1.3745658E-21)
            java.lang.String r7 = "C66@2562L9:FlowLayout.kt#2w3rfo"
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(r1, r0, r7)
            androidx.compose.foundation.layout.RowScopeInstance r0 = androidx.compose.foundation.layout.RowScopeInstance.INSTANCE
            int r4 = r4 >> 9
            r4 = r4 & 112(0x70, float:1.57E-43)
            r4 = r4 | 6
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r5.invoke(r0, r1, r4)
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(r1)
            r1.endReplaceableGroup()
            r1.endNode()
            r1.endReplaceableGroup()
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto L_0x01e8
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L_0x01e8:
            r8 = r3
            r3 = r13
            r4 = r14
        L_0x01eb:
            androidx.compose.runtime.ScopeUpdateScope r9 = r1.endRestartGroup()
            if (r9 != 0) goto L_0x01f2
            goto L_0x0205
        L_0x01f2:
            androidx.compose.foundation.layout.FlowLayoutKt$FlowRow$2 r10 = new androidx.compose.foundation.layout.FlowLayoutKt$FlowRow$2
            r0 = r10
            r1 = r2
            r2 = r8
            r5 = r20
            r6 = r22
            r7 = r23
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            kotlin.jvm.functions.Function2 r10 = (kotlin.jvm.functions.Function2) r10
            r9.updateScope(r10)
        L_0x0205:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.layout.FlowLayoutKt.FlowRow(androidx.compose.ui.Modifier, androidx.compose.foundation.layout.Arrangement$Horizontal, androidx.compose.ui.Alignment$Vertical, int, kotlin.jvm.functions.Function3, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0056  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0059  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0075  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x008e  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0091  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00b2  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00ba  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x01f2  */
    /* JADX WARNING: Removed duplicated region for block: B:89:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void FlowColumn(androidx.compose.ui.Modifier r16, androidx.compose.foundation.layout.Arrangement.Vertical r17, androidx.compose.ui.Alignment.Horizontal r18, int r19, kotlin.jvm.functions.Function3<? super androidx.compose.foundation.layout.ColumnScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r20, androidx.compose.runtime.Composer r21, int r22, int r23) {
        /*
            r5 = r20
            r6 = r22
            java.lang.String r0 = "content"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            r0 = -310290901(0xffffffffed81562b, float:-5.003467E27)
            r1 = r21
            androidx.compose.runtime.Composer r1 = r1.startRestartGroup(r0)
            java.lang.String r2 = "C(FlowColumn)P(3,4,1,2)110@4218L117,115@4340L133:FlowLayout.kt#2w3rfo"
            androidx.compose.runtime.ComposerKt.sourceInformation(r1, r2)
            r2 = r23 & 1
            if (r2 == 0) goto L_0x0022
            r3 = r6 | 6
            r4 = r3
            r3 = r16
            goto L_0x0036
        L_0x0022:
            r3 = r6 & 14
            if (r3 != 0) goto L_0x0033
            r3 = r16
            boolean r4 = r1.changed((java.lang.Object) r3)
            if (r4 == 0) goto L_0x0030
            r4 = 4
            goto L_0x0031
        L_0x0030:
            r4 = 2
        L_0x0031:
            r4 = r4 | r6
            goto L_0x0036
        L_0x0033:
            r3 = r16
            r4 = r6
        L_0x0036:
            r7 = r23 & 2
            if (r7 == 0) goto L_0x003d
            r4 = r4 | 48
            goto L_0x0050
        L_0x003d:
            r8 = r6 & 112(0x70, float:1.57E-43)
            if (r8 != 0) goto L_0x0050
            r8 = r17
            boolean r9 = r1.changed((java.lang.Object) r8)
            if (r9 == 0) goto L_0x004c
            r9 = 32
            goto L_0x004e
        L_0x004c:
            r9 = 16
        L_0x004e:
            r4 = r4 | r9
            goto L_0x0052
        L_0x0050:
            r8 = r17
        L_0x0052:
            r9 = r23 & 4
            if (r9 == 0) goto L_0x0059
            r4 = r4 | 384(0x180, float:5.38E-43)
            goto L_0x006c
        L_0x0059:
            r10 = r6 & 896(0x380, float:1.256E-42)
            if (r10 != 0) goto L_0x006c
            r10 = r18
            boolean r11 = r1.changed((java.lang.Object) r10)
            if (r11 == 0) goto L_0x0068
            r11 = 256(0x100, float:3.59E-43)
            goto L_0x006a
        L_0x0068:
            r11 = 128(0x80, float:1.794E-43)
        L_0x006a:
            r4 = r4 | r11
            goto L_0x006e
        L_0x006c:
            r10 = r18
        L_0x006e:
            r11 = r23 & 8
            if (r11 == 0) goto L_0x0075
            r4 = r4 | 3072(0xc00, float:4.305E-42)
            goto L_0x0088
        L_0x0075:
            r12 = r6 & 7168(0x1c00, float:1.0045E-41)
            if (r12 != 0) goto L_0x0088
            r12 = r19
            boolean r13 = r1.changed((int) r12)
            if (r13 == 0) goto L_0x0084
            r13 = 2048(0x800, float:2.87E-42)
            goto L_0x0086
        L_0x0084:
            r13 = 1024(0x400, float:1.435E-42)
        L_0x0086:
            r4 = r4 | r13
            goto L_0x008a
        L_0x0088:
            r12 = r19
        L_0x008a:
            r13 = r23 & 16
            if (r13 == 0) goto L_0x0091
            r4 = r4 | 24576(0x6000, float:3.4438E-41)
            goto L_0x00a3
        L_0x0091:
            r13 = 57344(0xe000, float:8.0356E-41)
            r13 = r13 & r6
            if (r13 != 0) goto L_0x00a3
            boolean r13 = r1.changed((java.lang.Object) r5)
            if (r13 == 0) goto L_0x00a0
            r13 = 16384(0x4000, float:2.2959E-41)
            goto L_0x00a2
        L_0x00a0:
            r13 = 8192(0x2000, float:1.14794E-41)
        L_0x00a2:
            r4 = r4 | r13
        L_0x00a3:
            r13 = 46811(0xb6db, float:6.5596E-41)
            r13 = r13 & r4
            r14 = 9362(0x2492, float:1.3119E-41)
            if (r13 != r14) goto L_0x00ba
            boolean r13 = r1.getSkipping()
            if (r13 != 0) goto L_0x00b2
            goto L_0x00ba
        L_0x00b2:
            r1.skipToGroupEnd()
            r2 = r3
            r3 = r10
            r4 = r12
            goto L_0x01eb
        L_0x00ba:
            if (r2 == 0) goto L_0x00c1
            androidx.compose.ui.Modifier$Companion r2 = androidx.compose.ui.Modifier.Companion
            androidx.compose.ui.Modifier r2 = (androidx.compose.ui.Modifier) r2
            goto L_0x00c2
        L_0x00c1:
            r2 = r3
        L_0x00c2:
            if (r7 == 0) goto L_0x00cb
            androidx.compose.foundation.layout.Arrangement r3 = androidx.compose.foundation.layout.Arrangement.INSTANCE
            androidx.compose.foundation.layout.Arrangement$Vertical r3 = r3.getTop()
            goto L_0x00cc
        L_0x00cb:
            r3 = r8
        L_0x00cc:
            if (r9 == 0) goto L_0x00d6
            androidx.compose.ui.Alignment$Companion r7 = androidx.compose.ui.Alignment.Companion
            androidx.compose.ui.Alignment$Horizontal r7 = r7.getStart()
            r13 = r7
            goto L_0x00d7
        L_0x00d6:
            r13 = r10
        L_0x00d7:
            if (r11 == 0) goto L_0x00de
            r7 = 2147483647(0x7fffffff, float:NaN)
            r14 = r7
            goto L_0x00df
        L_0x00de:
            r14 = r12
        L_0x00df:
            boolean r7 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r7 == 0) goto L_0x00ec
            r7 = -1
            java.lang.String r8 = "androidx.compose.foundation.layout.FlowColumn (FlowLayout.kt:103)"
            androidx.compose.runtime.ComposerKt.traceEventStart(r0, r4, r7, r8)
        L_0x00ec:
            int r0 = r4 >> 3
            r7 = r0 & 14
            r8 = r0 & 112(0x70, float:1.57E-43)
            r7 = r7 | r8
            r0 = r0 & 896(0x380, float:1.256E-42)
            r11 = r7 | r0
            r12 = 0
            r7 = r3
            r8 = r13
            r9 = r14
            r10 = r1
            androidx.compose.ui.layout.MeasurePolicy r0 = columnMeasurementHelper(r7, r8, r9, r10, r11, r12)
            int r7 = r4 << 3
            r7 = r7 & 112(0x70, float:1.57E-43)
            r8 = -1323940314(0xffffffffb1164626, float:-2.1867748E-9)
            r1.startReplaceableGroup(r8)
            java.lang.String r8 = "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh"
            androidx.compose.runtime.ComposerKt.sourceInformation(r1, r8)
            androidx.compose.runtime.ProvidableCompositionLocal r8 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalDensity()
            androidx.compose.runtime.CompositionLocal r8 = (androidx.compose.runtime.CompositionLocal) r8
            r9 = 2023513938(0x789c5f52, float:2.5372864E34)
            java.lang.String r10 = "C:CompositionLocal.kt#9igjgp"
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(r1, r9, r10)
            java.lang.Object r8 = r1.consume(r8)
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(r1)
            androidx.compose.ui.unit.Density r8 = (androidx.compose.ui.unit.Density) r8
            androidx.compose.runtime.ProvidableCompositionLocal r11 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalLayoutDirection()
            androidx.compose.runtime.CompositionLocal r11 = (androidx.compose.runtime.CompositionLocal) r11
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(r1, r9, r10)
            java.lang.Object r11 = r1.consume(r11)
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(r1)
            androidx.compose.ui.unit.LayoutDirection r11 = (androidx.compose.ui.unit.LayoutDirection) r11
            androidx.compose.runtime.ProvidableCompositionLocal r12 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalViewConfiguration()
            androidx.compose.runtime.CompositionLocal r12 = (androidx.compose.runtime.CompositionLocal) r12
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(r1, r9, r10)
            java.lang.Object r9 = r1.consume(r12)
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(r1)
            androidx.compose.ui.platform.ViewConfiguration r9 = (androidx.compose.ui.platform.ViewConfiguration) r9
            androidx.compose.ui.node.ComposeUiNode$Companion r10 = androidx.compose.ui.node.ComposeUiNode.Companion
            kotlin.jvm.functions.Function0 r10 = r10.getConstructor()
            kotlin.jvm.functions.Function3 r12 = androidx.compose.ui.layout.LayoutKt.materializerOf(r2)
            int r7 = r7 << 9
            r7 = r7 & 7168(0x1c00, float:1.0045E-41)
            r7 = r7 | 6
            androidx.compose.runtime.Applier r15 = r1.getApplier()
            boolean r15 = r15 instanceof androidx.compose.runtime.Applier
            if (r15 != 0) goto L_0x0165
            androidx.compose.runtime.ComposablesKt.invalidApplier()
        L_0x0165:
            r1.startReusableNode()
            boolean r15 = r1.getInserting()
            if (r15 == 0) goto L_0x0172
            r1.createNode(r10)
            goto L_0x0175
        L_0x0172:
            r1.useNode()
        L_0x0175:
            r1.disableReusing()
            androidx.compose.runtime.Composer r10 = androidx.compose.runtime.Updater.m2444constructorimpl(r1)
            androidx.compose.ui.node.ComposeUiNode$Companion r15 = androidx.compose.ui.node.ComposeUiNode.Companion
            kotlin.jvm.functions.Function2 r15 = r15.getSetMeasurePolicy()
            androidx.compose.runtime.Updater.m2451setimpl((androidx.compose.runtime.Composer) r10, r0, r15)
            androidx.compose.ui.node.ComposeUiNode$Companion r0 = androidx.compose.ui.node.ComposeUiNode.Companion
            kotlin.jvm.functions.Function2 r0 = r0.getSetDensity()
            androidx.compose.runtime.Updater.m2451setimpl((androidx.compose.runtime.Composer) r10, r8, r0)
            androidx.compose.ui.node.ComposeUiNode$Companion r0 = androidx.compose.ui.node.ComposeUiNode.Companion
            kotlin.jvm.functions.Function2 r0 = r0.getSetLayoutDirection()
            androidx.compose.runtime.Updater.m2451setimpl((androidx.compose.runtime.Composer) r10, r11, r0)
            androidx.compose.ui.node.ComposeUiNode$Companion r0 = androidx.compose.ui.node.ComposeUiNode.Companion
            kotlin.jvm.functions.Function2 r0 = r0.getSetViewConfiguration()
            androidx.compose.runtime.Updater.m2451setimpl((androidx.compose.runtime.Composer) r10, r9, r0)
            r1.enableReusing()
            androidx.compose.runtime.Composer r0 = androidx.compose.runtime.SkippableUpdater.m2436constructorimpl(r1)
            androidx.compose.runtime.SkippableUpdater r0 = androidx.compose.runtime.SkippableUpdater.m2435boximpl(r0)
            int r7 = r7 >> 3
            r7 = r7 & 112(0x70, float:1.57E-43)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r12.invoke(r0, r1, r7)
            r0 = 2058660585(0x7ab4aae9, float:4.6903995E35)
            r1.startReplaceableGroup(r0)
            r0 = -681937629(0xffffffffd75a7523, float:-2.40196633E14)
            java.lang.String r7 = "C116@4388L9:FlowLayout.kt#2w3rfo"
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(r1, r0, r7)
            androidx.compose.foundation.layout.ColumnScopeInstance r0 = androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE
            int r4 = r4 >> 9
            r4 = r4 & 112(0x70, float:1.57E-43)
            r4 = r4 | 6
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r5.invoke(r0, r1, r4)
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(r1)
            r1.endReplaceableGroup()
            r1.endNode()
            r1.endReplaceableGroup()
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto L_0x01e8
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L_0x01e8:
            r8 = r3
            r3 = r13
            r4 = r14
        L_0x01eb:
            androidx.compose.runtime.ScopeUpdateScope r9 = r1.endRestartGroup()
            if (r9 != 0) goto L_0x01f2
            goto L_0x0205
        L_0x01f2:
            androidx.compose.foundation.layout.FlowLayoutKt$FlowColumn$2 r10 = new androidx.compose.foundation.layout.FlowLayoutKt$FlowColumn$2
            r0 = r10
            r1 = r2
            r2 = r8
            r5 = r20
            r6 = r22
            r7 = r23
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            kotlin.jvm.functions.Function2 r10 = (kotlin.jvm.functions.Function2) r10
            r9.updateScope(r10)
        L_0x0205:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.layout.FlowLayoutKt.FlowColumn(androidx.compose.ui.Modifier, androidx.compose.foundation.layout.Arrangement$Vertical, androidx.compose.ui.Alignment$Horizontal, int, kotlin.jvm.functions.Function3, androidx.compose.runtime.Composer, int, int):void");
    }

    private static final Function5<Integer, int[], LayoutDirection, Density, int[], Unit> mainAxisRowArrangement(Arrangement.Horizontal horizontal, Composer composer, int i) {
        composer.startReplaceableGroup(746410833);
        ComposerKt.sourceInformation(composer, "C(mainAxisRowArrangement)125@4646L252:FlowLayout.kt#2w3rfo");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(746410833, i, -1, "androidx.compose.foundation.layout.mainAxisRowArrangement (FlowLayout.kt:123)");
        }
        composer.startReplaceableGroup(1157296644);
        ComposerKt.sourceInformation(composer, "C(remember)P(1):Composables.kt#9igjgp");
        boolean changed = composer.changed((Object) horizontal);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new FlowLayoutKt$mainAxisRowArrangement$1$1(horizontal);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        Function5<Integer, int[], LayoutDirection, Density, int[], Unit> function5 = (Function5) rememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return function5;
    }

    private static final Function5<Integer, int[], LayoutDirection, Density, int[], Unit> mainAxisColumnArrangement(Arrangement.Vertical vertical, Composer composer, int i) {
        composer.startReplaceableGroup(-1642644113);
        ComposerKt.sourceInformation(composer, "C(mainAxisColumnArrangement)136@5068L217:FlowLayout.kt#2w3rfo");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1642644113, i, -1, "androidx.compose.foundation.layout.mainAxisColumnArrangement (FlowLayout.kt:134)");
        }
        composer.startReplaceableGroup(1157296644);
        ComposerKt.sourceInformation(composer, "C(remember)P(1):Composables.kt#9igjgp");
        boolean changed = composer.changed((Object) vertical);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new FlowLayoutKt$mainAxisColumnArrangement$1$1(vertical);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        Function5<Integer, int[], LayoutDirection, Density, int[], Unit> function5 = (Function5) rememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return function5;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v0, resolved type: androidx.compose.foundation.layout.CrossAxisAlignment} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static final androidx.compose.ui.layout.MeasurePolicy rowMeasurementHelper(androidx.compose.foundation.layout.Arrangement.Horizontal r7, androidx.compose.ui.Alignment.Vertical r8, int r9, androidx.compose.runtime.Composer r10, int r11, int r12) {
        /*
            r0 = 1479255111(0x582ba447, float:7.5488822E14)
            r10.startReplaceableGroup(r0)
            java.lang.String r1 = "C(rowMeasurementHelper)P(!1,2)163@6016L45,164@6091L90,167@6193L499:FlowLayout.kt#2w3rfo"
            androidx.compose.runtime.ComposerKt.sourceInformation(r10, r1)
            r1 = r12 & 1
            if (r1 == 0) goto L_0x0015
            androidx.compose.foundation.layout.Arrangement r7 = androidx.compose.foundation.layout.Arrangement.INSTANCE
            androidx.compose.foundation.layout.Arrangement$Horizontal r7 = r7.getEnd()
        L_0x0015:
            r12 = r12 & 2
            if (r12 == 0) goto L_0x001f
            androidx.compose.ui.Alignment$Companion r8 = androidx.compose.ui.Alignment.Companion
            androidx.compose.ui.Alignment$Vertical r8 = r8.getTop()
        L_0x001f:
            boolean r12 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r12 == 0) goto L_0x002c
            r12 = -1
            java.lang.String r1 = "androidx.compose.foundation.layout.rowMeasurementHelper (FlowLayout.kt:158)"
            androidx.compose.runtime.ComposerKt.traceEventStart(r0, r11, r12, r1)
        L_0x002c:
            r11 = r11 & 14
            kotlin.jvm.functions.Function5 r1 = mainAxisRowArrangement(r7, r10, r11)
            r11 = 1157296644(0x44faf204, float:2007.563)
            r10.startReplaceableGroup(r11)
            java.lang.String r11 = "C(remember)P(1):Composables.kt#9igjgp"
            androidx.compose.runtime.ComposerKt.sourceInformation(r10, r11)
            boolean r11 = r10.changed((java.lang.Object) r8)
            java.lang.Object r12 = r10.rememberedValue()
            if (r11 != 0) goto L_0x004f
            androidx.compose.runtime.Composer$Companion r11 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r11 = r11.getEmpty()
            if (r12 != r11) goto L_0x0058
        L_0x004f:
            androidx.compose.foundation.layout.CrossAxisAlignment$Companion r11 = androidx.compose.foundation.layout.CrossAxisAlignment.Companion
            androidx.compose.foundation.layout.CrossAxisAlignment r12 = r11.vertical$foundation_layout_release(r8)
            r10.updateRememberedValue(r12)
        L_0x0058:
            r10.endReplaceableGroup()
            r4 = r12
            androidx.compose.foundation.layout.CrossAxisAlignment r4 = (androidx.compose.foundation.layout.CrossAxisAlignment) r4
            java.lang.Integer r11 = java.lang.Integer.valueOf(r9)
            r12 = 1618982084(0x607fb4c4, float:7.370227E19)
            r10.startReplaceableGroup(r12)
            java.lang.String r12 = "C(remember)P(1,2,3):Composables.kt#9igjgp"
            androidx.compose.runtime.ComposerKt.sourceInformation(r10, r12)
            boolean r12 = r10.changed((java.lang.Object) r7)
            boolean r8 = r10.changed((java.lang.Object) r8)
            r8 = r8 | r12
            boolean r11 = r10.changed((java.lang.Object) r11)
            r8 = r8 | r11
            java.lang.Object r11 = r10.rememberedValue()
            if (r8 != 0) goto L_0x0089
            androidx.compose.runtime.Composer$Companion r8 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r8 = r8.getEmpty()
            if (r11 != r8) goto L_0x009b
        L_0x0089:
            androidx.compose.foundation.layout.LayoutOrientation r0 = androidx.compose.foundation.layout.LayoutOrientation.Horizontal
            float r2 = r7.m418getSpacingD9Ej5fM()
            androidx.compose.foundation.layout.SizeMode r3 = androidx.compose.foundation.layout.SizeMode.Wrap
            kotlin.jvm.functions.Function4<java.lang.Integer, int[], androidx.compose.ui.layout.MeasureScope, int[], kotlin.Unit> r5 = crossAxisRowArrangement
            r6 = r9
            androidx.compose.ui.layout.MeasurePolicy r11 = m463flowMeasurePolicy942rkJo(r0, r1, r2, r3, r4, r5, r6)
            r10.updateRememberedValue(r11)
        L_0x009b:
            r10.endReplaceableGroup()
            androidx.compose.ui.layout.MeasurePolicy r11 = (androidx.compose.ui.layout.MeasurePolicy) r11
            boolean r7 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r7 == 0) goto L_0x00a9
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L_0x00a9:
            r10.endReplaceableGroup()
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.layout.FlowLayoutKt.rowMeasurementHelper(androidx.compose.foundation.layout.Arrangement$Horizontal, androidx.compose.ui.Alignment$Vertical, int, androidx.compose.runtime.Composer, int, int):androidx.compose.ui.layout.MeasurePolicy");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v0, resolved type: androidx.compose.foundation.layout.CrossAxisAlignment} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static final androidx.compose.ui.layout.MeasurePolicy columnMeasurementHelper(androidx.compose.foundation.layout.Arrangement.Vertical r7, androidx.compose.ui.Alignment.Horizontal r8, int r9, androidx.compose.runtime.Composer r10, int r11, int r12) {
        /*
            r0 = -2013098357(0xffffffff88028e8b, float:-3.928801E-34)
            r10.startReplaceableGroup(r0)
            java.lang.String r1 = "C(columnMeasurementHelper)P(2)186@6953L46,187@7029L96,190@7137L497:FlowLayout.kt#2w3rfo"
            androidx.compose.runtime.ComposerKt.sourceInformation(r10, r1)
            r1 = r12 & 1
            if (r1 == 0) goto L_0x0015
            androidx.compose.foundation.layout.Arrangement r7 = androidx.compose.foundation.layout.Arrangement.INSTANCE
            androidx.compose.foundation.layout.Arrangement$Vertical r7 = r7.getTop()
        L_0x0015:
            r12 = r12 & 2
            if (r12 == 0) goto L_0x001f
            androidx.compose.ui.Alignment$Companion r8 = androidx.compose.ui.Alignment.Companion
            androidx.compose.ui.Alignment$Horizontal r8 = r8.getStart()
        L_0x001f:
            boolean r12 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r12 == 0) goto L_0x002c
            r12 = -1
            java.lang.String r1 = "androidx.compose.foundation.layout.columnMeasurementHelper (FlowLayout.kt:181)"
            androidx.compose.runtime.ComposerKt.traceEventStart(r0, r11, r12, r1)
        L_0x002c:
            r11 = r11 & 14
            kotlin.jvm.functions.Function5 r1 = mainAxisColumnArrangement(r7, r10, r11)
            r11 = 1157296644(0x44faf204, float:2007.563)
            r10.startReplaceableGroup(r11)
            java.lang.String r11 = "C(remember)P(1):Composables.kt#9igjgp"
            androidx.compose.runtime.ComposerKt.sourceInformation(r10, r11)
            boolean r11 = r10.changed((java.lang.Object) r8)
            java.lang.Object r12 = r10.rememberedValue()
            if (r11 != 0) goto L_0x004f
            androidx.compose.runtime.Composer$Companion r11 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r11 = r11.getEmpty()
            if (r12 != r11) goto L_0x0058
        L_0x004f:
            androidx.compose.foundation.layout.CrossAxisAlignment$Companion r11 = androidx.compose.foundation.layout.CrossAxisAlignment.Companion
            androidx.compose.foundation.layout.CrossAxisAlignment r12 = r11.horizontal$foundation_layout_release(r8)
            r10.updateRememberedValue(r12)
        L_0x0058:
            r10.endReplaceableGroup()
            r4 = r12
            androidx.compose.foundation.layout.CrossAxisAlignment r4 = (androidx.compose.foundation.layout.CrossAxisAlignment) r4
            java.lang.Integer r11 = java.lang.Integer.valueOf(r9)
            r12 = 1618982084(0x607fb4c4, float:7.370227E19)
            r10.startReplaceableGroup(r12)
            java.lang.String r12 = "C(remember)P(1,2,3):Composables.kt#9igjgp"
            androidx.compose.runtime.ComposerKt.sourceInformation(r10, r12)
            boolean r12 = r10.changed((java.lang.Object) r7)
            boolean r8 = r10.changed((java.lang.Object) r8)
            r8 = r8 | r12
            boolean r11 = r10.changed((java.lang.Object) r11)
            r8 = r8 | r11
            java.lang.Object r11 = r10.rememberedValue()
            if (r8 != 0) goto L_0x0089
            androidx.compose.runtime.Composer$Companion r8 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r8 = r8.getEmpty()
            if (r11 != r8) goto L_0x009b
        L_0x0089:
            androidx.compose.foundation.layout.LayoutOrientation r0 = androidx.compose.foundation.layout.LayoutOrientation.Vertical
            float r2 = r7.m432getSpacingD9Ej5fM()
            kotlin.jvm.functions.Function4<java.lang.Integer, int[], androidx.compose.ui.layout.MeasureScope, int[], kotlin.Unit> r5 = crossAxisColumnArrangement
            androidx.compose.foundation.layout.SizeMode r3 = androidx.compose.foundation.layout.SizeMode.Wrap
            r6 = r9
            androidx.compose.ui.layout.MeasurePolicy r11 = m463flowMeasurePolicy942rkJo(r0, r1, r2, r3, r4, r5, r6)
            r10.updateRememberedValue(r11)
        L_0x009b:
            r10.endReplaceableGroup()
            androidx.compose.ui.layout.MeasurePolicy r11 = (androidx.compose.ui.layout.MeasurePolicy) r11
            boolean r7 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r7 == 0) goto L_0x00a9
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L_0x00a9:
            r10.endReplaceableGroup()
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.layout.FlowLayoutKt.columnMeasurementHelper(androidx.compose.foundation.layout.Arrangement$Vertical, androidx.compose.ui.Alignment$Horizontal, int, androidx.compose.runtime.Composer, int, int):androidx.compose.ui.layout.MeasurePolicy");
    }

    /* renamed from: flowMeasurePolicy-942rkJo  reason: not valid java name */
    private static final MeasurePolicy m463flowMeasurePolicy942rkJo(LayoutOrientation layoutOrientation, Function5<? super Integer, ? super int[], ? super LayoutDirection, ? super Density, ? super int[], Unit> function5, float f, SizeMode sizeMode, CrossAxisAlignment crossAxisAlignment, Function4<? super Integer, ? super int[], ? super MeasureScope, ? super int[], Unit> function4, int i) {
        return new FlowLayoutKt$flowMeasurePolicy$1(layoutOrientation, function5, f, sizeMode, crossAxisAlignment, i, function4);
    }

    /* access modifiers changed from: private */
    public static final int minIntrinsicMainAxisSize(List<? extends IntrinsicMeasurable> list, Function3<? super IntrinsicMeasurable, ? super Integer, ? super Integer, Integer> function3, Function3<? super IntrinsicMeasurable, ? super Integer, ? super Integer, Integer> function32, int i, int i2, int i3) {
        int size = list.size();
        int[] iArr = new int[size];
        for (int i4 = 0; i4 < size; i4++) {
            iArr[i4] = 0;
        }
        int size2 = list.size();
        int[] iArr2 = new int[size2];
        for (int i5 = 0; i5 < size2; i5++) {
            iArr2[i5] = 0;
        }
        int size3 = list.size();
        for (int i6 = 0; i6 < size3; i6++) {
            IntrinsicMeasurable intrinsicMeasurable = (IntrinsicMeasurable) list.get(i6);
            int intValue = function3.invoke(intrinsicMeasurable, Integer.valueOf(i6), Integer.valueOf(i)).intValue();
            iArr[i6] = intValue;
            iArr2[i6] = function32.invoke(intrinsicMeasurable, Integer.valueOf(i6), Integer.valueOf(intValue)).intValue();
        }
        int sum = ArraysKt.sum(iArr);
        if (size2 != 0) {
            int i7 = iArr2[0];
            IntIterator it = new IntRange(1, ArraysKt.getLastIndex(iArr2)).iterator();
            while (it.hasNext()) {
                int i8 = iArr2[it.nextInt()];
                if (i7 < i8) {
                    i7 = i8;
                }
            }
            if (size != 0) {
                int i9 = iArr[0];
                IntIterator it2 = new IntRange(1, ArraysKt.getLastIndex(iArr)).iterator();
                while (it2.hasNext()) {
                    int i10 = iArr[it2.nextInt()];
                    if (i9 < i10) {
                        i9 = i10;
                    }
                }
                int i11 = i9;
                int i12 = i7;
                int i13 = sum;
                while (i11 < sum && i12 != i) {
                    i13 = (i11 + sum) / 2;
                    i12 = intrinsicCrossAxisSize(list, iArr, iArr2, i13, i2, i3);
                    if (i12 == i) {
                        return i13;
                    }
                    if (i12 > i) {
                        i11 = i13 + 1;
                    } else {
                        sum = i13 - 1;
                    }
                }
                return i13;
            }
            throw new NoSuchElementException();
        }
        throw new NoSuchElementException();
    }

    private static final int intrinsicCrossAxisSize(List<? extends IntrinsicMeasurable> list, int[] iArr, int[] iArr2, int i, int i2, int i3) {
        return intrinsicCrossAxisSize(list, (Function3<? super IntrinsicMeasurable, ? super Integer, ? super Integer, Integer>) new FlowLayoutKt$intrinsicCrossAxisSize$1(iArr), (Function3<? super IntrinsicMeasurable, ? super Integer, ? super Integer, Integer>) new FlowLayoutKt$intrinsicCrossAxisSize$2(iArr2), i, i2, i3);
    }

    /* access modifiers changed from: private */
    public static final int intrinsicCrossAxisSize(List<? extends IntrinsicMeasurable> list, Function3<? super IntrinsicMeasurable, ? super Integer, ? super Integer, Integer> function3, Function3<? super IntrinsicMeasurable, ? super Integer, ? super Integer, Integer> function32, int i, int i2, int i3) {
        List<? extends IntrinsicMeasurable> list2 = list;
        Function3<? super IntrinsicMeasurable, ? super Integer, ? super Integer, Integer> function33 = function3;
        Function3<? super IntrinsicMeasurable, ? super Integer, ? super Integer, Integer> function34 = function32;
        if (list.isEmpty()) {
            return 0;
        }
        Object orNull = CollectionsKt.getOrNull(list2, 0);
        IntrinsicMeasurable intrinsicMeasurable = (IntrinsicMeasurable) orNull;
        int intValue = intrinsicMeasurable != null ? function34.invoke(intrinsicMeasurable, 0, Integer.valueOf(i)).intValue() : 0;
        int intValue2 = intrinsicMeasurable != null ? function33.invoke(intrinsicMeasurable, 0, Integer.valueOf(intValue)).intValue() : 0;
        int size = list.size();
        int i4 = i;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        while (i5 < size) {
            IntrinsicMeasurable intrinsicMeasurable2 = (IntrinsicMeasurable) list2.get(i5);
            Intrinsics.checkNotNull(orNull);
            i4 -= intValue2;
            int max = Math.max(i7, intValue);
            i5++;
            Object orNull2 = CollectionsKt.getOrNull(list2, i5);
            IntrinsicMeasurable intrinsicMeasurable3 = (IntrinsicMeasurable) orNull2;
            int intValue3 = intrinsicMeasurable3 != null ? function34.invoke(intrinsicMeasurable3, Integer.valueOf(i5), Integer.valueOf(i)).intValue() : 0;
            int intValue4 = intrinsicMeasurable3 != null ? function33.invoke(intrinsicMeasurable3, Integer.valueOf(i5), Integer.valueOf(intValue3)).intValue() + i2 : 0;
            if (i4 < 0 || i5 == list.size()) {
                int i9 = i3;
            } else if (i5 - i8 != i3 && i4 - intValue4 >= 0) {
                int i10 = intValue3;
                i7 = max;
                orNull = orNull2;
                intValue2 = intValue4;
                intValue = i10;
            }
            i6 += max;
            intValue4 -= i2;
            i4 = i;
            max = 0;
            i8 = i5;
            int i102 = intValue3;
            i7 = max;
            orNull = orNull2;
            intValue2 = intValue4;
            intValue = i102;
        }
        return i6;
    }

    public static final int mainAxisMin(Measurable measurable, LayoutOrientation layoutOrientation, int i) {
        Intrinsics.checkNotNullParameter(measurable, "<this>");
        Intrinsics.checkNotNullParameter(layoutOrientation, "orientation");
        if (layoutOrientation == LayoutOrientation.Horizontal) {
            return measurable.minIntrinsicWidth(i);
        }
        return measurable.minIntrinsicHeight(i);
    }

    public static final int crossAxisMin(Measurable measurable, LayoutOrientation layoutOrientation, int i) {
        Intrinsics.checkNotNullParameter(measurable, "<this>");
        Intrinsics.checkNotNullParameter(layoutOrientation, "orientation");
        if (layoutOrientation == LayoutOrientation.Horizontal) {
            return measurable.minIntrinsicHeight(i);
        }
        return measurable.minIntrinsicWidth(i);
    }

    public static final int mainAxisSize(Placeable placeable, LayoutOrientation layoutOrientation) {
        Intrinsics.checkNotNullParameter(placeable, "<this>");
        Intrinsics.checkNotNullParameter(layoutOrientation, "orientation");
        return layoutOrientation == LayoutOrientation.Horizontal ? placeable.getWidth() : placeable.getHeight();
    }

    public static final int crossAxisSize(Placeable placeable, LayoutOrientation layoutOrientation) {
        Intrinsics.checkNotNullParameter(placeable, "<this>");
        Intrinsics.checkNotNullParameter(layoutOrientation, "orientation");
        return layoutOrientation == LayoutOrientation.Horizontal ? placeable.getHeight() : placeable.getWidth();
    }

    private static final int measureAndCache(Measurable measurable, OrientationIndependentConstraints orientationIndependentConstraints, LayoutOrientation layoutOrientation, Function1<? super Placeable, Unit> function1) {
        if (RowColumnImplKt.getWeight(RowColumnImplKt.getRowColumnParentData(measurable)) != 0.0f) {
            return mainAxisMin(measurable, layoutOrientation, Integer.MAX_VALUE);
        }
        Placeable r8 = measurable.m4520measureBRTryo0(OrientationIndependentConstraints.copy$default(orientationIndependentConstraints, 0, 0, 0, 0, 14, (Object) null).m485toBoxConstraintsOenEA2s(layoutOrientation));
        function1.invoke(r8);
        return mainAxisSize(r8, layoutOrientation);
    }

    /* access modifiers changed from: private */
    public static final int maxIntrinsicMainAxisSize(List<? extends IntrinsicMeasurable> list, Function3<? super IntrinsicMeasurable, ? super Integer, ? super Integer, Integer> function3, int i, int i2, int i3) {
        int size = list.size();
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        while (i4 < size) {
            int intValue = function3.invoke((IntrinsicMeasurable) list.get(i4), Integer.valueOf(i4), Integer.valueOf(i)).intValue() + i2;
            int i8 = i4 + 1;
            if (i8 - i6 == i3 || i8 == list.size()) {
                i5 = Math.max(i5, i7 + intValue);
                i7 = 0;
                i6 = i4;
            } else {
                i7 += intValue;
            }
            i4 = i8;
        }
        return i5;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v3, resolved type: java.lang.Integer} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final androidx.compose.foundation.layout.FlowResult breakDownItems(androidx.compose.ui.layout.MeasureScope r22, androidx.compose.foundation.layout.RowColumnMeasurementHelper r23, androidx.compose.foundation.layout.LayoutOrientation r24, androidx.compose.foundation.layout.OrientationIndependentConstraints r25, int r26) {
        /*
            r6 = r22
            r0 = r24
            java.lang.String r1 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r1)
            java.lang.String r1 = "measureHelper"
            r7 = r23
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r1)
            java.lang.String r1 = "orientation"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
            java.lang.String r1 = "constraints"
            r8 = r25
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r1)
            androidx.compose.runtime.collection.MutableVector r9 = new androidx.compose.runtime.collection.MutableVector
            r1 = 16
            androidx.compose.foundation.layout.RowColumnMeasureHelperResult[] r1 = new androidx.compose.foundation.layout.RowColumnMeasureHelperResult[r1]
            r2 = 0
            r9.<init>(r1, r2)
            int r1 = r25.getMainAxisMax()
            int r3 = r25.getMainAxisMin()
            int r4 = r25.getCrossAxisMax()
            java.util.List r5 = r23.getMeasurables()
            androidx.compose.ui.layout.Placeable[] r10 = r23.getPlaceables()
            float r11 = r23.m534getArrangementSpacingD9Ej5fM()
            float r11 = r6.m5607toPx0680j_4(r11)
            double r11 = (double) r11
            double r11 = java.lang.Math.ceil(r11)
            float r11 = (float) r11
            int r11 = (int) r11
            androidx.compose.foundation.layout.OrientationIndependentConstraints r12 = new androidx.compose.foundation.layout.OrientationIndependentConstraints
            r12.<init>(r3, r1, r2, r4)
            java.lang.Object r4 = kotlin.collections.CollectionsKt.getOrNull(r5, r2)
            androidx.compose.ui.layout.Measurable r4 = (androidx.compose.ui.layout.Measurable) r4
            if (r4 == 0) goto L_0x0069
            androidx.compose.foundation.layout.FlowLayoutKt$breakDownItems$nextSize$1 r14 = new androidx.compose.foundation.layout.FlowLayoutKt$breakDownItems$nextSize$1
            r14.<init>(r10)
            kotlin.jvm.functions.Function1 r14 = (kotlin.jvm.functions.Function1) r14
            int r4 = measureAndCache(r4, r12, r0, r14)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            goto L_0x006a
        L_0x0069:
            r4 = 0
        L_0x006a:
            int r14 = r5.size()
            java.lang.Integer[] r15 = new java.lang.Integer[r14]
            int r14 = r5.size()
            r18 = r1
            r13 = r2
            r17 = r13
            r19 = r17
            r20 = r19
        L_0x007d:
            if (r13 >= r14) goto L_0x00f0
            kotlin.jvm.internal.Intrinsics.checkNotNull(r4)
            int r4 = r4.intValue()
            int r2 = r17 + r4
            int r18 = r18 - r4
            int r4 = r13 + 1
            java.lang.Object r17 = kotlin.collections.CollectionsKt.getOrNull(r5, r4)
            r21 = r1
            r1 = r17
            androidx.compose.ui.layout.Measurable r1 = (androidx.compose.ui.layout.Measurable) r1
            if (r1 == 0) goto L_0x00a9
            androidx.compose.foundation.layout.FlowLayoutKt$breakDownItems$1 r6 = new androidx.compose.foundation.layout.FlowLayoutKt$breakDownItems$1
            r6.<init>(r10, r13)
            kotlin.jvm.functions.Function1 r6 = (kotlin.jvm.functions.Function1) r6
            int r1 = measureAndCache(r1, r12, r0, r6)
            int r1 = r1 + r11
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            goto L_0x00aa
        L_0x00a9:
            r1 = 0
        L_0x00aa:
            int r6 = r5.size()
            if (r4 >= r6) goto L_0x00c6
            int r6 = r4 - r19
            r13 = r26
            if (r6 >= r13) goto L_0x00c8
            if (r1 == 0) goto L_0x00bd
            int r6 = r1.intValue()
            goto L_0x00be
        L_0x00bd:
            r6 = 0
        L_0x00be:
            int r6 = r18 - r6
            if (r6 >= 0) goto L_0x00c3
            goto L_0x00c8
        L_0x00c3:
            r17 = r2
            goto L_0x00e8
        L_0x00c6:
            r13 = r26
        L_0x00c8:
            int r2 = java.lang.Math.max(r3, r2)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r4)
            r15[r20] = r3
            int r20 = r20 + 1
            if (r1 == 0) goto L_0x00e0
            int r1 = r1.intValue()
            int r1 = r1 - r11
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            goto L_0x00e1
        L_0x00e0:
            r1 = 0
        L_0x00e1:
            r3 = r2
            r19 = r4
            r18 = r21
            r17 = 0
        L_0x00e8:
            r2 = 0
            r6 = r22
            r13 = r4
            r4 = r1
            r1 = r21
            goto L_0x007d
        L_0x00f0:
            r14 = 0
            r1 = 0
            r16 = 0
            r17 = 14
            r18 = 0
            r13 = r3
            r6 = r15
            r15 = r1
            androidx.compose.foundation.layout.OrientationIndependentConstraints r1 = androidx.compose.foundation.layout.OrientationIndependentConstraints.copy$default(r12, r13, r14, r15, r16, r17, r18)
            long r10 = r1.m485toBoxConstraintsOenEA2s(r0)
            r0 = 0
            java.lang.Object r1 = kotlin.collections.ArraysKt.getOrNull((T[]) r6, (int) r0)
            java.lang.Integer r1 = (java.lang.Integer) r1
            r4 = r0
            r13 = r4
            r14 = r13
            r12 = r1
            r15 = r3
        L_0x010f:
            if (r12 == 0) goto L_0x013c
            int r5 = r12.intValue()
            r0 = r23
            r1 = r22
            r2 = r10
            androidx.compose.foundation.layout.RowColumnMeasureHelperResult r0 = r0.m535measureWithoutPlacing_EkL_Y(r1, r2, r4, r5)
            int r1 = r0.getCrossAxisSize()
            int r13 = r13 + r1
            int r1 = r0.getMainAxisSize()
            int r15 = java.lang.Math.max(r15, r1)
            r9.add(r0)
            int r4 = r12.intValue()
            int r14 = r14 + 1
            java.lang.Object r0 = kotlin.collections.ArraysKt.getOrNull((T[]) r6, (int) r14)
            r12 = r0
            java.lang.Integer r12 = (java.lang.Integer) r12
            goto L_0x010f
        L_0x013c:
            int r0 = r25.getCrossAxisMin()
            int r0 = java.lang.Math.max(r13, r0)
            int r1 = r25.getMainAxisMin()
            int r1 = java.lang.Math.max(r15, r1)
            androidx.compose.foundation.layout.FlowResult r2 = new androidx.compose.foundation.layout.FlowResult
            r2.<init>(r1, r0, r9)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.layout.FlowLayoutKt.breakDownItems(androidx.compose.ui.layout.MeasureScope, androidx.compose.foundation.layout.RowColumnMeasurementHelper, androidx.compose.foundation.layout.LayoutOrientation, androidx.compose.foundation.layout.OrientationIndependentConstraints, int):androidx.compose.foundation.layout.FlowResult");
    }
}
