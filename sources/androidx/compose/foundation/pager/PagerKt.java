package androidx.compose.foundation.pager;

import androidx.compose.animation.core.DecayAnimationSpec;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.gestures.snapping.SnapLayoutInfoProvider;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;

@Metadata(d1 = {"\u0000ª\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\u001aÚ\u0001\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00062\b\b\u0002\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u00162\b\b\u0002\u0010\u0017\u001a\u00020\u00182\b\b\u0002\u0010\u0019\u001a\u00020\u00042\b\b\u0002\u0010\u001a\u001a\u00020\u00042%\b\u0002\u0010\u001b\u001a\u001f\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u001d\u0012\b\b\u001e\u0012\u0004\b\b(\u001f\u0012\u0004\u0012\u00020 \u0018\u00010\u001c2\b\b\u0002\u0010!\u001a\u00020\"2&\u0010#\u001a\"\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u001d\u0012\b\b\u001e\u0012\u0004\b\b($\u0012\u0004\u0012\u00020\b0\u001c¢\u0006\u0002\b%H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b&\u0010'\u001aÖ\u0001\u0010(\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010)\u001a\u00020*2\u0006\u0010\u0012\u001a\u00020\u00062\b\b\u0002\u0010\u0015\u001a\u00020\u00162\b\b\u0002\u0010+\u001a\u00020,2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u00042#\u0010\u001b\u001a\u001f\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u001d\u0012\b\b\u001e\u0012\u0004\b\b(\u001f\u0012\u0004\u0012\u00020 \u0018\u00010\u001c2\u0006\u0010!\u001a\u00020\"2&\u0010#\u001a\"\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u001d\u0012\b\b\u001e\u0012\u0004\b\b($\u0012\u0004\u0012\u00020\b0\u001c¢\u0006\u0002\b%H\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b-\u0010.\u001a&\u0010/\u001a\u0002002\u0006\u00101\u001a\u00020\r2\u0006\u00102\u001a\u0002032\f\u00104\u001a\b\u0012\u0004\u0012\u00020605H\u0002\u001aÚ\u0001\u00107\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00062\b\b\u0002\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010+\u001a\u00020,2\b\b\u0002\u0010\u0017\u001a\u00020\u00182\b\b\u0002\u0010\u0019\u001a\u00020\u00042\b\b\u0002\u0010\u001a\u001a\u00020\u00042%\b\u0002\u0010\u001b\u001a\u001f\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u001d\u0012\b\b\u001e\u0012\u0004\b\b(\u001f\u0012\u0004\u0012\u00020 \u0018\u00010\u001c2\b\b\u0002\u0010!\u001a\u00020\"2&\u0010#\u001a\"\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u001d\u0012\b\b\u001e\u0012\u0004\b\b($\u0012\u0004\u0012\u00020\b0\u001c¢\u0006\u0002\b%H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b8\u00109\u001a(\u0010:\u001a\u00020\u00142\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010)\u001a\u00020*2\u0006\u0010;\u001a\u00020<H\u0002ø\u0001\u0001¢\u0006\u0002\u0010=\u001a\u0017\u0010>\u001a\u00020\b2\f\u0010?\u001a\b\u0012\u0004\u0012\u00020A0@H\b\u001a!\u0010B\u001a\u00020\u000b*\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010C\u001a\u00020\u0004H\u0003¢\u0006\u0002\u0010D\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000\"\u000e\u0010\u0005\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006E"}, d2 = {"ConsumeHorizontalFlingNestedScrollConnection", "Landroidx/compose/foundation/pager/ConsumeAllFlingOnDirection;", "ConsumeVerticalFlingNestedScrollConnection", "DEBUG", "", "LowVelocityAnimationDefaultDuration", "", "HorizontalPager", "", "pageCount", "modifier", "Landroidx/compose/ui/Modifier;", "state", "Landroidx/compose/foundation/pager/PagerState;", "contentPadding", "Landroidx/compose/foundation/layout/PaddingValues;", "pageSize", "Landroidx/compose/foundation/pager/PageSize;", "beyondBoundsPageCount", "pageSpacing", "Landroidx/compose/ui/unit/Dp;", "verticalAlignment", "Landroidx/compose/ui/Alignment$Vertical;", "flingBehavior", "Landroidx/compose/foundation/gestures/snapping/SnapFlingBehavior;", "userScrollEnabled", "reverseLayout", "key", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "index", "", "pageNestedScrollConnection", "Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "pageContent", "page", "Landroidx/compose/runtime/Composable;", "HorizontalPager-AlbwjTQ", "(ILandroidx/compose/ui/Modifier;Landroidx/compose/foundation/pager/PagerState;Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/foundation/pager/PageSize;IFLandroidx/compose/ui/Alignment$Vertical;Landroidx/compose/foundation/gestures/snapping/SnapFlingBehavior;ZZLkotlin/jvm/functions/Function1;Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;III)V", "Pager", "orientation", "Landroidx/compose/foundation/gestures/Orientation;", "horizontalAlignment", "Landroidx/compose/ui/Alignment$Horizontal;", "Pager-wKDqQAw", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/pager/PagerState;ILandroidx/compose/foundation/pager/PageSize;FLandroidx/compose/foundation/gestures/Orientation;ILandroidx/compose/ui/Alignment$Vertical;Landroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/foundation/gestures/snapping/SnapFlingBehavior;ZZLkotlin/jvm/functions/Function1;Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;III)V", "SnapLayoutInfoProvider", "Landroidx/compose/foundation/gestures/snapping/SnapLayoutInfoProvider;", "pagerState", "pagerSnapDistance", "Landroidx/compose/foundation/pager/PagerSnapDistance;", "decayAnimationSpec", "Landroidx/compose/animation/core/DecayAnimationSpec;", "", "VerticalPager", "VerticalPager-AlbwjTQ", "(ILandroidx/compose/ui/Modifier;Landroidx/compose/foundation/pager/PagerState;Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/foundation/pager/PageSize;IFLandroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/foundation/gestures/snapping/SnapFlingBehavior;ZZLkotlin/jvm/functions/Function1;Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;III)V", "calculateContentPaddings", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "(Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/foundation/gestures/Orientation;Landroidx/compose/ui/unit/LayoutDirection;)F", "debugLog", "generateMsg", "Lkotlin/Function0;", "", "pagerSemantics", "isVertical", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/pager/PagerState;ZLandroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: Pager.kt */
public final class PagerKt {
    /* access modifiers changed from: private */
    public static final ConsumeAllFlingOnDirection ConsumeHorizontalFlingNestedScrollConnection = new ConsumeAllFlingOnDirection(Orientation.Horizontal);
    /* access modifiers changed from: private */
    public static final ConsumeAllFlingOnDirection ConsumeVerticalFlingNestedScrollConnection = new ConsumeAllFlingOnDirection(Orientation.Vertical);
    private static final boolean DEBUG = false;
    private static final int LowVelocityAnimationDefaultDuration = 500;

    private static final void debugLog(Function0<String> function0) {
    }

    /* JADX WARNING: Removed duplicated region for block: B:108:0x0155  */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x015c  */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x017c  */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x0185  */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x01a5  */
    /* JADX WARNING: Removed duplicated region for block: B:134:0x01ab  */
    /* JADX WARNING: Removed duplicated region for block: B:135:0x01ae  */
    /* JADX WARNING: Removed duplicated region for block: B:149:0x01d8  */
    /* JADX WARNING: Removed duplicated region for block: B:150:0x01f5  */
    /* JADX WARNING: Removed duplicated region for block: B:210:0x03a7  */
    /* JADX WARNING: Removed duplicated region for block: B:212:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0057  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0079  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0096  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x009b  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00b4  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00b9  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00d2  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00d9  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x00f2  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x00f9  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x0114  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x012a  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x0130  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x0135  */
    /* renamed from: HorizontalPager-AlbwjTQ  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m809HorizontalPagerAlbwjTQ(int r35, androidx.compose.ui.Modifier r36, androidx.compose.foundation.pager.PagerState r37, androidx.compose.foundation.layout.PaddingValues r38, androidx.compose.foundation.pager.PageSize r39, int r40, float r41, androidx.compose.ui.Alignment.Vertical r42, androidx.compose.foundation.gestures.snapping.SnapFlingBehavior r43, boolean r44, boolean r45, kotlin.jvm.functions.Function1<? super java.lang.Integer, ? extends java.lang.Object> r46, androidx.compose.ui.input.nestedscroll.NestedScrollConnection r47, kotlin.jvm.functions.Function3<? super java.lang.Integer, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r48, androidx.compose.runtime.Composer r49, int r50, int r51, int r52) {
        /*
            r15 = r48
            r14 = r50
            r13 = r51
            r12 = r52
            java.lang.String r0 = "pageContent"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r15, r0)
            r0 = -547020879(0xffffffffdf651fb1, float:-1.6510109E19)
            r1 = r49
            androidx.compose.runtime.Composer r11 = r1.startRestartGroup(r0)
            java.lang.String r1 = "C(HorizontalPager)P(6,4,11,1,8!1,9:c#ui.unit.Dp,13!1,12,10!1,7)124@6522L20,130@6830L28,139@7169L591:Pager.kt#g6yjnt"
            androidx.compose.runtime.ComposerKt.sourceInformation(r11, r1)
            r1 = r12 & 1
            if (r1 == 0) goto L_0x0025
            r1 = r14 | 6
            r10 = r35
            goto L_0x0037
        L_0x0025:
            r1 = r14 & 14
            r10 = r35
            if (r1 != 0) goto L_0x0036
            boolean r1 = r11.changed((int) r10)
            if (r1 == 0) goto L_0x0033
            r1 = 4
            goto L_0x0034
        L_0x0033:
            r1 = 2
        L_0x0034:
            r1 = r1 | r14
            goto L_0x0037
        L_0x0036:
            r1 = r14
        L_0x0037:
            r4 = r12 & 2
            if (r4 == 0) goto L_0x003e
            r1 = r1 | 48
            goto L_0x0051
        L_0x003e:
            r7 = r14 & 112(0x70, float:1.57E-43)
            if (r7 != 0) goto L_0x0051
            r7 = r36
            boolean r8 = r11.changed((java.lang.Object) r7)
            if (r8 == 0) goto L_0x004d
            r8 = 32
            goto L_0x004f
        L_0x004d:
            r8 = 16
        L_0x004f:
            r1 = r1 | r8
            goto L_0x0053
        L_0x0051:
            r7 = r36
        L_0x0053:
            r8 = r14 & 896(0x380, float:1.256E-42)
            if (r8 != 0) goto L_0x006c
            r8 = r12 & 4
            if (r8 != 0) goto L_0x0066
            r8 = r37
            boolean r9 = r11.changed((java.lang.Object) r8)
            if (r9 == 0) goto L_0x0068
            r9 = 256(0x100, float:3.59E-43)
            goto L_0x006a
        L_0x0066:
            r8 = r37
        L_0x0068:
            r9 = 128(0x80, float:1.794E-43)
        L_0x006a:
            r1 = r1 | r9
            goto L_0x006e
        L_0x006c:
            r8 = r37
        L_0x006e:
            r9 = r12 & 8
            r16 = 2048(0x800, float:2.87E-42)
            r17 = 1024(0x400, float:1.435E-42)
            if (r9 == 0) goto L_0x0079
            r1 = r1 | 3072(0xc00, float:4.305E-42)
            goto L_0x008d
        L_0x0079:
            r2 = r14 & 7168(0x1c00, float:1.0045E-41)
            if (r2 != 0) goto L_0x008d
            r2 = r38
            boolean r18 = r11.changed((java.lang.Object) r2)
            if (r18 == 0) goto L_0x0088
            r18 = r16
            goto L_0x008a
        L_0x0088:
            r18 = r17
        L_0x008a:
            r1 = r1 | r18
            goto L_0x008f
        L_0x008d:
            r2 = r38
        L_0x008f:
            r18 = r12 & 16
            r19 = 57344(0xe000, float:8.0356E-41)
            if (r18 == 0) goto L_0x009b
            r1 = r1 | 24576(0x6000, float:3.4438E-41)
            r3 = r39
            goto L_0x00ae
        L_0x009b:
            r20 = r14 & r19
            r3 = r39
            if (r20 != 0) goto L_0x00ae
            boolean r21 = r11.changed((java.lang.Object) r3)
            if (r21 == 0) goto L_0x00aa
            r21 = 16384(0x4000, float:2.2959E-41)
            goto L_0x00ac
        L_0x00aa:
            r21 = 8192(0x2000, float:1.14794E-41)
        L_0x00ac:
            r1 = r1 | r21
        L_0x00ae:
            r21 = r12 & 32
            r22 = 196608(0x30000, float:2.75506E-40)
            if (r21 == 0) goto L_0x00b9
            r1 = r1 | r22
            r5 = r40
            goto L_0x00ce
        L_0x00b9:
            r23 = 458752(0x70000, float:6.42848E-40)
            r23 = r14 & r23
            r5 = r40
            if (r23 != 0) goto L_0x00ce
            boolean r24 = r11.changed((int) r5)
            if (r24 == 0) goto L_0x00ca
            r24 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00cc
        L_0x00ca:
            r24 = 65536(0x10000, float:9.18355E-41)
        L_0x00cc:
            r1 = r1 | r24
        L_0x00ce:
            r24 = r12 & 64
            if (r24 == 0) goto L_0x00d9
            r25 = 1572864(0x180000, float:2.204052E-39)
            r1 = r1 | r25
            r6 = r41
            goto L_0x00ee
        L_0x00d9:
            r25 = 3670016(0x380000, float:5.142788E-39)
            r25 = r14 & r25
            r6 = r41
            if (r25 != 0) goto L_0x00ee
            boolean r26 = r11.changed((float) r6)
            if (r26 == 0) goto L_0x00ea
            r26 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00ec
        L_0x00ea:
            r26 = 524288(0x80000, float:7.34684E-40)
        L_0x00ec:
            r1 = r1 | r26
        L_0x00ee:
            r0 = r12 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x00f9
            r27 = 12582912(0xc00000, float:1.7632415E-38)
            r1 = r1 | r27
            r2 = r42
            goto L_0x010e
        L_0x00f9:
            r27 = 29360128(0x1c00000, float:7.052966E-38)
            r27 = r14 & r27
            r2 = r42
            if (r27 != 0) goto L_0x010e
            boolean r27 = r11.changed((java.lang.Object) r2)
            if (r27 == 0) goto L_0x010a
            r27 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x010c
        L_0x010a:
            r27 = 4194304(0x400000, float:5.877472E-39)
        L_0x010c:
            r1 = r1 | r27
        L_0x010e:
            r27 = 234881024(0xe000000, float:1.5777218E-30)
            r27 = r14 & r27
            if (r27 != 0) goto L_0x012a
            r2 = r12 & 256(0x100, float:3.59E-43)
            if (r2 != 0) goto L_0x0123
            r2 = r43
            boolean r27 = r11.changed((java.lang.Object) r2)
            if (r27 == 0) goto L_0x0125
            r27 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x0127
        L_0x0123:
            r2 = r43
        L_0x0125:
            r27 = 33554432(0x2000000, float:9.403955E-38)
        L_0x0127:
            r1 = r1 | r27
            goto L_0x012c
        L_0x012a:
            r2 = r43
        L_0x012c:
            r6 = r12 & 512(0x200, float:7.175E-43)
            if (r6 == 0) goto L_0x0135
            r27 = 805306368(0x30000000, float:4.656613E-10)
            r1 = r1 | r27
            goto L_0x014d
        L_0x0135:
            r27 = 1879048192(0x70000000, float:1.58456325E29)
            r27 = r14 & r27
            if (r27 != 0) goto L_0x014d
            r27 = r6
            r6 = r44
            boolean r28 = r11.changed((boolean) r6)
            if (r28 == 0) goto L_0x0148
            r28 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x014a
        L_0x0148:
            r28 = 268435456(0x10000000, float:2.5243549E-29)
        L_0x014a:
            r1 = r1 | r28
            goto L_0x0151
        L_0x014d:
            r27 = r6
            r6 = r44
        L_0x0151:
            r6 = r12 & 1024(0x400, float:1.435E-42)
            if (r6 == 0) goto L_0x015c
            r20 = r13 | 6
            r28 = r6
            r6 = r45
            goto L_0x0178
        L_0x015c:
            r28 = r13 & 14
            if (r28 != 0) goto L_0x0172
            r28 = r6
            r6 = r45
            boolean r29 = r11.changed((boolean) r6)
            if (r29 == 0) goto L_0x016d
            r20 = 4
            goto L_0x016f
        L_0x016d:
            r20 = 2
        L_0x016f:
            r20 = r13 | r20
            goto L_0x0178
        L_0x0172:
            r28 = r6
            r6 = r45
            r20 = r13
        L_0x0178:
            r6 = r12 & 2048(0x800, float:2.87E-42)
            if (r6 == 0) goto L_0x0185
            r20 = r20 | 48
            r29 = r6
            r2 = r20
            r6 = r46
            goto L_0x01a1
        L_0x0185:
            r29 = r13 & 112(0x70, float:1.57E-43)
            if (r29 != 0) goto L_0x019b
            r29 = r6
            r6 = r46
            boolean r30 = r11.changedInstance(r6)
            if (r30 == 0) goto L_0x0196
            r23 = 32
            goto L_0x0198
        L_0x0196:
            r23 = 16
        L_0x0198:
            r20 = r20 | r23
            goto L_0x019f
        L_0x019b:
            r29 = r6
            r6 = r46
        L_0x019f:
            r2 = r20
        L_0x01a1:
            r6 = r12 & 4096(0x1000, float:5.74E-42)
            if (r6 == 0) goto L_0x01a7
            r2 = r2 | 128(0x80, float:1.794E-43)
        L_0x01a7:
            r3 = r12 & 8192(0x2000, float:1.14794E-41)
            if (r3 == 0) goto L_0x01ae
            r2 = r2 | 3072(0xc00, float:4.305E-42)
            goto L_0x01bd
        L_0x01ae:
            r3 = r13 & 7168(0x1c00, float:1.0045E-41)
            if (r3 != 0) goto L_0x01bd
            boolean r3 = r11.changedInstance(r15)
            if (r3 == 0) goto L_0x01b9
            goto L_0x01bb
        L_0x01b9:
            r16 = r17
        L_0x01bb:
            r2 = r2 | r16
        L_0x01bd:
            r3 = r2
            r2 = 4096(0x1000, float:5.74E-42)
            if (r6 != r2) goto L_0x01f5
            r2 = 1533916891(0x5b6db6db, float:6.6910621E16)
            r2 = r2 & r1
            r5 = 306783378(0x12492492, float:6.3469493E-28)
            if (r2 != r5) goto L_0x01f5
            r2 = r3 & 5851(0x16db, float:8.199E-42)
            r5 = 1170(0x492, float:1.64E-42)
            if (r2 != r5) goto L_0x01f5
            boolean r2 = r11.getSkipping()
            if (r2 != 0) goto L_0x01d8
            goto L_0x01f5
        L_0x01d8:
            r11.skipToGroupEnd()
            r4 = r38
            r5 = r39
            r6 = r40
            r9 = r43
            r10 = r44
            r12 = r46
            r13 = r47
            r2 = r7
            r3 = r8
            r22 = r11
            r7 = r41
            r8 = r42
            r11 = r45
            goto L_0x03a0
        L_0x01f5:
            r11.startDefaults()
            r2 = r14 & 1
            if (r2 == 0) goto L_0x0232
            boolean r2 = r11.getDefaultsInvalid()
            if (r2 == 0) goto L_0x0203
            goto L_0x0232
        L_0x0203:
            r11.skipToGroupEnd()
            r0 = r12 & 4
            if (r0 == 0) goto L_0x020c
            r1 = r1 & -897(0xfffffffffffffc7f, float:NaN)
        L_0x020c:
            r0 = r12 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L_0x0214
            r0 = -234881025(0xfffffffff1ffffff, float:-2.535301E30)
            r1 = r1 & r0
        L_0x0214:
            if (r6 == 0) goto L_0x0218
            r3 = r3 & -897(0xfffffffffffffc7f, float:NaN)
        L_0x0218:
            r23 = r38
            r24 = r39
            r25 = r40
            r27 = r41
            r28 = r42
            r29 = r43
            r30 = r44
            r33 = r45
            r31 = r46
            r32 = r47
            r20 = r7
            r21 = r8
            goto L_0x0306
        L_0x0232:
            if (r4 == 0) goto L_0x023b
            androidx.compose.ui.Modifier$Companion r2 = androidx.compose.ui.Modifier.Companion
            androidx.compose.ui.Modifier r2 = (androidx.compose.ui.Modifier) r2
            r16 = r2
            goto L_0x023d
        L_0x023b:
            r16 = r7
        L_0x023d:
            r2 = r12 & 4
            r7 = 0
            if (r2 == 0) goto L_0x024f
            r2 = 0
            r4 = 3
            androidx.compose.foundation.pager.PagerState r2 = androidx.compose.foundation.pager.PagerStateKt.rememberPagerState(r7, r2, r11, r7, r4)
            r1 = r1 & -897(0xfffffffffffffc7f, float:NaN)
            r20 = r1
            r17 = r2
            goto L_0x0253
        L_0x024f:
            r20 = r1
            r17 = r8
        L_0x0253:
            if (r9 == 0) goto L_0x0261
            float r1 = (float) r7
            float r1 = androidx.compose.ui.unit.Dp.m5626constructorimpl(r1)
            androidx.compose.foundation.layout.PaddingValues r1 = androidx.compose.foundation.layout.PaddingKt.m486PaddingValues0680j_4(r1)
            r23 = r1
            goto L_0x0263
        L_0x0261:
            r23 = r38
        L_0x0263:
            if (r18 == 0) goto L_0x026c
            androidx.compose.foundation.pager.PageSize$Fill r1 = androidx.compose.foundation.pager.PageSize.Fill.INSTANCE
            androidx.compose.foundation.pager.PageSize r1 = (androidx.compose.foundation.pager.PageSize) r1
            r18 = r1
            goto L_0x026e
        L_0x026c:
            r18 = r39
        L_0x026e:
            if (r21 == 0) goto L_0x0273
            r21 = r7
            goto L_0x0275
        L_0x0273:
            r21 = r40
        L_0x0275:
            if (r24 == 0) goto L_0x027f
            float r1 = (float) r7
            float r1 = androidx.compose.ui.unit.Dp.m5626constructorimpl(r1)
            r24 = r1
            goto L_0x0281
        L_0x027f:
            r24 = r41
        L_0x0281:
            if (r0 == 0) goto L_0x028a
            androidx.compose.ui.Alignment$Companion r0 = androidx.compose.ui.Alignment.Companion
            androidx.compose.ui.Alignment$Vertical r0 = r0.getCenterVertically()
            goto L_0x028c
        L_0x028a:
            r0 = r42
        L_0x028c:
            r1 = r12 & 256(0x100, float:3.59E-43)
            if (r1 == 0) goto L_0x02b9
            androidx.compose.foundation.pager.PagerDefaults r1 = androidx.compose.foundation.pager.PagerDefaults.INSTANCE
            r4 = 0
            r5 = 0
            r8 = 0
            r9 = 0
            int r2 = r20 >> 6
            r2 = r2 & 14
            r25 = r2 | r22
            r30 = 30
            r2 = r17
            r31 = r3
            r3 = r4
            r4 = r5
            r5 = r8
            r32 = r6
            r6 = r9
            r33 = r7
            r7 = r11
            r8 = r25
            r9 = r30
            androidx.compose.foundation.gestures.snapping.SnapFlingBehavior r1 = r1.flingBehavior(r2, r3, r4, r5, r6, r7, r8, r9)
            r2 = -234881025(0xfffffffff1ffffff, float:-2.535301E30)
            r2 = r20 & r2
            goto L_0x02c3
        L_0x02b9:
            r31 = r3
            r32 = r6
            r33 = r7
            r1 = r43
            r2 = r20
        L_0x02c3:
            if (r27 == 0) goto L_0x02c7
            r3 = 1
            goto L_0x02c9
        L_0x02c7:
            r3 = r44
        L_0x02c9:
            if (r28 == 0) goto L_0x02cc
            goto L_0x02ce
        L_0x02cc:
            r33 = r45
        L_0x02ce:
            if (r29 == 0) goto L_0x02d2
            r4 = 0
            goto L_0x02d4
        L_0x02d2:
            r4 = r46
        L_0x02d4:
            if (r32 == 0) goto L_0x02ee
            androidx.compose.foundation.pager.PagerDefaults r5 = androidx.compose.foundation.pager.PagerDefaults.INSTANCE
            androidx.compose.foundation.gestures.Orientation r6 = androidx.compose.foundation.gestures.Orientation.Horizontal
            androidx.compose.ui.input.nestedscroll.NestedScrollConnection r5 = r5.pageNestedScrollConnection(r6)
            r6 = r31
            r6 = r6 & -897(0xfffffffffffffc7f, float:NaN)
            r28 = r0
            r29 = r1
            r1 = r2
            r30 = r3
            r31 = r4
            r32 = r5
            goto L_0x02fb
        L_0x02ee:
            r6 = r31
            r32 = r47
            r28 = r0
            r29 = r1
            r1 = r2
            r30 = r3
            r31 = r4
        L_0x02fb:
            r3 = r6
            r20 = r16
            r25 = r21
            r27 = r24
            r21 = r17
            r24 = r18
        L_0x0306:
            r11.endDefaults()
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto L_0x0318
            java.lang.String r0 = "androidx.compose.foundation.pager.HorizontalPager (Pager.kt:121)"
            r2 = -547020879(0xffffffffdf651fb1, float:-1.6510109E19)
            androidx.compose.runtime.ComposerKt.traceEventStart(r2, r1, r3, r0)
        L_0x0318:
            androidx.compose.foundation.gestures.Orientation r5 = androidx.compose.foundation.gestures.Orientation.Horizontal
            r8 = 0
            int r0 = r1 >> 3
            r2 = r0 & 14
            r2 = r2 | r22
            r4 = r0 & 112(0x70, float:1.57E-43)
            r2 = r2 | r4
            int r4 = r1 << 6
            r4 = r4 & 896(0x380, float:1.256E-42)
            r2 = r2 | r4
            r0 = r0 & 7168(0x1c00, float:1.0045E-41)
            r0 = r0 | r2
            int r2 = r1 >> 6
            r2 = r2 & r19
            r0 = r0 | r2
            int r2 = r1 << 3
            r4 = 3670016(0x380000, float:5.142788E-39)
            r2 = r2 & r4
            r0 = r0 | r2
            r2 = 29360128(0x1c00000, float:7.052966E-38)
            r2 = r2 & r1
            r0 = r0 | r2
            int r2 = r1 << 18
            r4 = 1879048192(0x70000000, float:1.58456325E29)
            r2 = r2 & r4
            r17 = r0 | r2
            int r0 = r1 >> 24
            r1 = r0 & 14
            r2 = 32768(0x8000, float:4.5918E-41)
            r1 = r1 | r2
            r0 = r0 & 112(0x70, float:1.57E-43)
            r0 = r0 | r1
            int r1 = r3 << 6
            r2 = r1 & 896(0x380, float:1.256E-42)
            r0 = r0 | r2
            r2 = r1 & 7168(0x1c00, float:1.0045E-41)
            r0 = r0 | r2
            r2 = 458752(0x70000, float:6.42848E-40)
            r1 = r1 & r2
            r18 = r0 | r1
            r19 = 256(0x100, float:3.59E-43)
            r0 = r20
            r1 = r21
            r2 = r35
            r3 = r24
            r4 = r27
            r6 = r25
            r7 = r28
            r9 = r23
            r10 = r29
            r22 = r11
            r11 = r30
            r12 = r33
            r13 = r31
            r14 = r32
            r15 = r48
            r16 = r22
            m810PagerwKDqQAw(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto L_0x0388
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L_0x0388:
            r2 = r20
            r3 = r21
            r4 = r23
            r5 = r24
            r6 = r25
            r7 = r27
            r8 = r28
            r9 = r29
            r10 = r30
            r12 = r31
            r13 = r32
            r11 = r33
        L_0x03a0:
            androidx.compose.runtime.ScopeUpdateScope r15 = r22.endRestartGroup()
            if (r15 != 0) goto L_0x03a7
            goto L_0x03c3
        L_0x03a7:
            androidx.compose.foundation.pager.PagerKt$HorizontalPager$1 r18 = new androidx.compose.foundation.pager.PagerKt$HorizontalPager$1
            r0 = r18
            r1 = r35
            r14 = r48
            r34 = r15
            r15 = r50
            r16 = r51
            r17 = r52
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            r0 = r18
            kotlin.jvm.functions.Function2 r0 = (kotlin.jvm.functions.Function2) r0
            r1 = r34
            r1.updateScope(r0)
        L_0x03c3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.pager.PagerKt.m809HorizontalPagerAlbwjTQ(int, androidx.compose.ui.Modifier, androidx.compose.foundation.pager.PagerState, androidx.compose.foundation.layout.PaddingValues, androidx.compose.foundation.pager.PageSize, int, float, androidx.compose.ui.Alignment$Vertical, androidx.compose.foundation.gestures.snapping.SnapFlingBehavior, boolean, boolean, kotlin.jvm.functions.Function1, androidx.compose.ui.input.nestedscroll.NestedScrollConnection, kotlin.jvm.functions.Function3, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:108:0x0155  */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x015c  */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x017c  */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x0185  */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x01a5  */
    /* JADX WARNING: Removed duplicated region for block: B:134:0x01ab  */
    /* JADX WARNING: Removed duplicated region for block: B:135:0x01ae  */
    /* JADX WARNING: Removed duplicated region for block: B:149:0x01d8  */
    /* JADX WARNING: Removed duplicated region for block: B:150:0x01f5  */
    /* JADX WARNING: Removed duplicated region for block: B:210:0x03a7  */
    /* JADX WARNING: Removed duplicated region for block: B:212:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0057  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0079  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0096  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x009b  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00b4  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00b9  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00d2  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00d9  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x00f2  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x00f9  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x0114  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x012a  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x0130  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x0135  */
    /* renamed from: VerticalPager-AlbwjTQ  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m811VerticalPagerAlbwjTQ(int r35, androidx.compose.ui.Modifier r36, androidx.compose.foundation.pager.PagerState r37, androidx.compose.foundation.layout.PaddingValues r38, androidx.compose.foundation.pager.PageSize r39, int r40, float r41, androidx.compose.ui.Alignment.Horizontal r42, androidx.compose.foundation.gestures.snapping.SnapFlingBehavior r43, boolean r44, boolean r45, kotlin.jvm.functions.Function1<? super java.lang.Integer, ? extends java.lang.Object> r46, androidx.compose.ui.input.nestedscroll.NestedScrollConnection r47, kotlin.jvm.functions.Function3<? super java.lang.Integer, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r48, androidx.compose.runtime.Composer r49, int r50, int r51, int r52) {
        /*
            r15 = r48
            r14 = r50
            r13 = r51
            r12 = r52
            java.lang.String r0 = "pageContent"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r15, r0)
            r0 = 26030705(0x18d3271, float:5.18676E-38)
            r1 = r49
            androidx.compose.runtime.Composer r11 = r1.startRestartGroup(r0)
            java.lang.String r1 = "C(VerticalPager)P(7,5,12,1,9!1,10:c#ui.unit.Dp,3!1,13,11!1,8)204@10765L20,210@11079L28,219@11416L593:Pager.kt#g6yjnt"
            androidx.compose.runtime.ComposerKt.sourceInformation(r11, r1)
            r1 = r12 & 1
            if (r1 == 0) goto L_0x0025
            r1 = r14 | 6
            r10 = r35
            goto L_0x0037
        L_0x0025:
            r1 = r14 & 14
            r10 = r35
            if (r1 != 0) goto L_0x0036
            boolean r1 = r11.changed((int) r10)
            if (r1 == 0) goto L_0x0033
            r1 = 4
            goto L_0x0034
        L_0x0033:
            r1 = 2
        L_0x0034:
            r1 = r1 | r14
            goto L_0x0037
        L_0x0036:
            r1 = r14
        L_0x0037:
            r4 = r12 & 2
            if (r4 == 0) goto L_0x003e
            r1 = r1 | 48
            goto L_0x0051
        L_0x003e:
            r7 = r14 & 112(0x70, float:1.57E-43)
            if (r7 != 0) goto L_0x0051
            r7 = r36
            boolean r8 = r11.changed((java.lang.Object) r7)
            if (r8 == 0) goto L_0x004d
            r8 = 32
            goto L_0x004f
        L_0x004d:
            r8 = 16
        L_0x004f:
            r1 = r1 | r8
            goto L_0x0053
        L_0x0051:
            r7 = r36
        L_0x0053:
            r8 = r14 & 896(0x380, float:1.256E-42)
            if (r8 != 0) goto L_0x006c
            r8 = r12 & 4
            if (r8 != 0) goto L_0x0066
            r8 = r37
            boolean r9 = r11.changed((java.lang.Object) r8)
            if (r9 == 0) goto L_0x0068
            r9 = 256(0x100, float:3.59E-43)
            goto L_0x006a
        L_0x0066:
            r8 = r37
        L_0x0068:
            r9 = 128(0x80, float:1.794E-43)
        L_0x006a:
            r1 = r1 | r9
            goto L_0x006e
        L_0x006c:
            r8 = r37
        L_0x006e:
            r9 = r12 & 8
            r16 = 2048(0x800, float:2.87E-42)
            r17 = 1024(0x400, float:1.435E-42)
            if (r9 == 0) goto L_0x0079
            r1 = r1 | 3072(0xc00, float:4.305E-42)
            goto L_0x008d
        L_0x0079:
            r2 = r14 & 7168(0x1c00, float:1.0045E-41)
            if (r2 != 0) goto L_0x008d
            r2 = r38
            boolean r18 = r11.changed((java.lang.Object) r2)
            if (r18 == 0) goto L_0x0088
            r18 = r16
            goto L_0x008a
        L_0x0088:
            r18 = r17
        L_0x008a:
            r1 = r1 | r18
            goto L_0x008f
        L_0x008d:
            r2 = r38
        L_0x008f:
            r18 = r12 & 16
            r19 = 57344(0xe000, float:8.0356E-41)
            if (r18 == 0) goto L_0x009b
            r1 = r1 | 24576(0x6000, float:3.4438E-41)
            r3 = r39
            goto L_0x00ae
        L_0x009b:
            r20 = r14 & r19
            r3 = r39
            if (r20 != 0) goto L_0x00ae
            boolean r21 = r11.changed((java.lang.Object) r3)
            if (r21 == 0) goto L_0x00aa
            r21 = 16384(0x4000, float:2.2959E-41)
            goto L_0x00ac
        L_0x00aa:
            r21 = 8192(0x2000, float:1.14794E-41)
        L_0x00ac:
            r1 = r1 | r21
        L_0x00ae:
            r21 = r12 & 32
            r22 = 196608(0x30000, float:2.75506E-40)
            if (r21 == 0) goto L_0x00b9
            r1 = r1 | r22
            r5 = r40
            goto L_0x00ce
        L_0x00b9:
            r23 = 458752(0x70000, float:6.42848E-40)
            r23 = r14 & r23
            r5 = r40
            if (r23 != 0) goto L_0x00ce
            boolean r24 = r11.changed((int) r5)
            if (r24 == 0) goto L_0x00ca
            r24 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00cc
        L_0x00ca:
            r24 = 65536(0x10000, float:9.18355E-41)
        L_0x00cc:
            r1 = r1 | r24
        L_0x00ce:
            r24 = r12 & 64
            if (r24 == 0) goto L_0x00d9
            r25 = 1572864(0x180000, float:2.204052E-39)
            r1 = r1 | r25
            r6 = r41
            goto L_0x00ee
        L_0x00d9:
            r25 = 3670016(0x380000, float:5.142788E-39)
            r25 = r14 & r25
            r6 = r41
            if (r25 != 0) goto L_0x00ee
            boolean r26 = r11.changed((float) r6)
            if (r26 == 0) goto L_0x00ea
            r26 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00ec
        L_0x00ea:
            r26 = 524288(0x80000, float:7.34684E-40)
        L_0x00ec:
            r1 = r1 | r26
        L_0x00ee:
            r0 = r12 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x00f9
            r27 = 12582912(0xc00000, float:1.7632415E-38)
            r1 = r1 | r27
            r2 = r42
            goto L_0x010e
        L_0x00f9:
            r27 = 29360128(0x1c00000, float:7.052966E-38)
            r27 = r14 & r27
            r2 = r42
            if (r27 != 0) goto L_0x010e
            boolean r27 = r11.changed((java.lang.Object) r2)
            if (r27 == 0) goto L_0x010a
            r27 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x010c
        L_0x010a:
            r27 = 4194304(0x400000, float:5.877472E-39)
        L_0x010c:
            r1 = r1 | r27
        L_0x010e:
            r27 = 234881024(0xe000000, float:1.5777218E-30)
            r27 = r14 & r27
            if (r27 != 0) goto L_0x012a
            r2 = r12 & 256(0x100, float:3.59E-43)
            if (r2 != 0) goto L_0x0123
            r2 = r43
            boolean r27 = r11.changed((java.lang.Object) r2)
            if (r27 == 0) goto L_0x0125
            r27 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x0127
        L_0x0123:
            r2 = r43
        L_0x0125:
            r27 = 33554432(0x2000000, float:9.403955E-38)
        L_0x0127:
            r1 = r1 | r27
            goto L_0x012c
        L_0x012a:
            r2 = r43
        L_0x012c:
            r6 = r12 & 512(0x200, float:7.175E-43)
            if (r6 == 0) goto L_0x0135
            r27 = 805306368(0x30000000, float:4.656613E-10)
            r1 = r1 | r27
            goto L_0x014d
        L_0x0135:
            r27 = 1879048192(0x70000000, float:1.58456325E29)
            r27 = r14 & r27
            if (r27 != 0) goto L_0x014d
            r27 = r6
            r6 = r44
            boolean r28 = r11.changed((boolean) r6)
            if (r28 == 0) goto L_0x0148
            r28 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x014a
        L_0x0148:
            r28 = 268435456(0x10000000, float:2.5243549E-29)
        L_0x014a:
            r1 = r1 | r28
            goto L_0x0151
        L_0x014d:
            r27 = r6
            r6 = r44
        L_0x0151:
            r6 = r12 & 1024(0x400, float:1.435E-42)
            if (r6 == 0) goto L_0x015c
            r20 = r13 | 6
            r28 = r6
            r6 = r45
            goto L_0x0178
        L_0x015c:
            r28 = r13 & 14
            if (r28 != 0) goto L_0x0172
            r28 = r6
            r6 = r45
            boolean r29 = r11.changed((boolean) r6)
            if (r29 == 0) goto L_0x016d
            r20 = 4
            goto L_0x016f
        L_0x016d:
            r20 = 2
        L_0x016f:
            r20 = r13 | r20
            goto L_0x0178
        L_0x0172:
            r28 = r6
            r6 = r45
            r20 = r13
        L_0x0178:
            r6 = r12 & 2048(0x800, float:2.87E-42)
            if (r6 == 0) goto L_0x0185
            r20 = r20 | 48
            r29 = r6
            r2 = r20
            r6 = r46
            goto L_0x01a1
        L_0x0185:
            r29 = r13 & 112(0x70, float:1.57E-43)
            if (r29 != 0) goto L_0x019b
            r29 = r6
            r6 = r46
            boolean r30 = r11.changedInstance(r6)
            if (r30 == 0) goto L_0x0196
            r23 = 32
            goto L_0x0198
        L_0x0196:
            r23 = 16
        L_0x0198:
            r20 = r20 | r23
            goto L_0x019f
        L_0x019b:
            r29 = r6
            r6 = r46
        L_0x019f:
            r2 = r20
        L_0x01a1:
            r6 = r12 & 4096(0x1000, float:5.74E-42)
            if (r6 == 0) goto L_0x01a7
            r2 = r2 | 128(0x80, float:1.794E-43)
        L_0x01a7:
            r3 = r12 & 8192(0x2000, float:1.14794E-41)
            if (r3 == 0) goto L_0x01ae
            r2 = r2 | 3072(0xc00, float:4.305E-42)
            goto L_0x01bd
        L_0x01ae:
            r3 = r13 & 7168(0x1c00, float:1.0045E-41)
            if (r3 != 0) goto L_0x01bd
            boolean r3 = r11.changedInstance(r15)
            if (r3 == 0) goto L_0x01b9
            goto L_0x01bb
        L_0x01b9:
            r16 = r17
        L_0x01bb:
            r2 = r2 | r16
        L_0x01bd:
            r3 = r2
            r2 = 4096(0x1000, float:5.74E-42)
            if (r6 != r2) goto L_0x01f5
            r2 = 1533916891(0x5b6db6db, float:6.6910621E16)
            r2 = r2 & r1
            r5 = 306783378(0x12492492, float:6.3469493E-28)
            if (r2 != r5) goto L_0x01f5
            r2 = r3 & 5851(0x16db, float:8.199E-42)
            r5 = 1170(0x492, float:1.64E-42)
            if (r2 != r5) goto L_0x01f5
            boolean r2 = r11.getSkipping()
            if (r2 != 0) goto L_0x01d8
            goto L_0x01f5
        L_0x01d8:
            r11.skipToGroupEnd()
            r4 = r38
            r5 = r39
            r6 = r40
            r9 = r43
            r10 = r44
            r12 = r46
            r13 = r47
            r2 = r7
            r3 = r8
            r22 = r11
            r7 = r41
            r8 = r42
            r11 = r45
            goto L_0x03a0
        L_0x01f5:
            r11.startDefaults()
            r2 = r14 & 1
            if (r2 == 0) goto L_0x0232
            boolean r2 = r11.getDefaultsInvalid()
            if (r2 == 0) goto L_0x0203
            goto L_0x0232
        L_0x0203:
            r11.skipToGroupEnd()
            r0 = r12 & 4
            if (r0 == 0) goto L_0x020c
            r1 = r1 & -897(0xfffffffffffffc7f, float:NaN)
        L_0x020c:
            r0 = r12 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L_0x0214
            r0 = -234881025(0xfffffffff1ffffff, float:-2.535301E30)
            r1 = r1 & r0
        L_0x0214:
            if (r6 == 0) goto L_0x0218
            r3 = r3 & -897(0xfffffffffffffc7f, float:NaN)
        L_0x0218:
            r23 = r38
            r24 = r39
            r25 = r40
            r27 = r41
            r28 = r42
            r29 = r43
            r30 = r44
            r33 = r45
            r31 = r46
            r32 = r47
            r20 = r7
            r21 = r8
            goto L_0x0306
        L_0x0232:
            if (r4 == 0) goto L_0x023b
            androidx.compose.ui.Modifier$Companion r2 = androidx.compose.ui.Modifier.Companion
            androidx.compose.ui.Modifier r2 = (androidx.compose.ui.Modifier) r2
            r16 = r2
            goto L_0x023d
        L_0x023b:
            r16 = r7
        L_0x023d:
            r2 = r12 & 4
            r7 = 0
            if (r2 == 0) goto L_0x024f
            r2 = 0
            r4 = 3
            androidx.compose.foundation.pager.PagerState r2 = androidx.compose.foundation.pager.PagerStateKt.rememberPagerState(r7, r2, r11, r7, r4)
            r1 = r1 & -897(0xfffffffffffffc7f, float:NaN)
            r20 = r1
            r17 = r2
            goto L_0x0253
        L_0x024f:
            r20 = r1
            r17 = r8
        L_0x0253:
            if (r9 == 0) goto L_0x0261
            float r1 = (float) r7
            float r1 = androidx.compose.ui.unit.Dp.m5626constructorimpl(r1)
            androidx.compose.foundation.layout.PaddingValues r1 = androidx.compose.foundation.layout.PaddingKt.m486PaddingValues0680j_4(r1)
            r23 = r1
            goto L_0x0263
        L_0x0261:
            r23 = r38
        L_0x0263:
            if (r18 == 0) goto L_0x026c
            androidx.compose.foundation.pager.PageSize$Fill r1 = androidx.compose.foundation.pager.PageSize.Fill.INSTANCE
            androidx.compose.foundation.pager.PageSize r1 = (androidx.compose.foundation.pager.PageSize) r1
            r18 = r1
            goto L_0x026e
        L_0x026c:
            r18 = r39
        L_0x026e:
            if (r21 == 0) goto L_0x0273
            r21 = r7
            goto L_0x0275
        L_0x0273:
            r21 = r40
        L_0x0275:
            if (r24 == 0) goto L_0x027f
            float r1 = (float) r7
            float r1 = androidx.compose.ui.unit.Dp.m5626constructorimpl(r1)
            r24 = r1
            goto L_0x0281
        L_0x027f:
            r24 = r41
        L_0x0281:
            if (r0 == 0) goto L_0x028a
            androidx.compose.ui.Alignment$Companion r0 = androidx.compose.ui.Alignment.Companion
            androidx.compose.ui.Alignment$Horizontal r0 = r0.getCenterHorizontally()
            goto L_0x028c
        L_0x028a:
            r0 = r42
        L_0x028c:
            r1 = r12 & 256(0x100, float:3.59E-43)
            if (r1 == 0) goto L_0x02b9
            androidx.compose.foundation.pager.PagerDefaults r1 = androidx.compose.foundation.pager.PagerDefaults.INSTANCE
            r4 = 0
            r5 = 0
            r8 = 0
            r9 = 0
            int r2 = r20 >> 6
            r2 = r2 & 14
            r25 = r2 | r22
            r30 = 30
            r2 = r17
            r31 = r3
            r3 = r4
            r4 = r5
            r5 = r8
            r32 = r6
            r6 = r9
            r33 = r7
            r7 = r11
            r8 = r25
            r9 = r30
            androidx.compose.foundation.gestures.snapping.SnapFlingBehavior r1 = r1.flingBehavior(r2, r3, r4, r5, r6, r7, r8, r9)
            r2 = -234881025(0xfffffffff1ffffff, float:-2.535301E30)
            r2 = r20 & r2
            goto L_0x02c3
        L_0x02b9:
            r31 = r3
            r32 = r6
            r33 = r7
            r1 = r43
            r2 = r20
        L_0x02c3:
            if (r27 == 0) goto L_0x02c7
            r3 = 1
            goto L_0x02c9
        L_0x02c7:
            r3 = r44
        L_0x02c9:
            if (r28 == 0) goto L_0x02cc
            goto L_0x02ce
        L_0x02cc:
            r33 = r45
        L_0x02ce:
            if (r29 == 0) goto L_0x02d2
            r4 = 0
            goto L_0x02d4
        L_0x02d2:
            r4 = r46
        L_0x02d4:
            if (r32 == 0) goto L_0x02ee
            androidx.compose.foundation.pager.PagerDefaults r5 = androidx.compose.foundation.pager.PagerDefaults.INSTANCE
            androidx.compose.foundation.gestures.Orientation r6 = androidx.compose.foundation.gestures.Orientation.Vertical
            androidx.compose.ui.input.nestedscroll.NestedScrollConnection r5 = r5.pageNestedScrollConnection(r6)
            r6 = r31
            r6 = r6 & -897(0xfffffffffffffc7f, float:NaN)
            r28 = r0
            r29 = r1
            r1 = r2
            r30 = r3
            r31 = r4
            r32 = r5
            goto L_0x02fb
        L_0x02ee:
            r6 = r31
            r32 = r47
            r28 = r0
            r29 = r1
            r1 = r2
            r30 = r3
            r31 = r4
        L_0x02fb:
            r3 = r6
            r20 = r16
            r25 = r21
            r27 = r24
            r21 = r17
            r24 = r18
        L_0x0306:
            r11.endDefaults()
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto L_0x0318
            java.lang.String r0 = "androidx.compose.foundation.pager.VerticalPager (Pager.kt:201)"
            r2 = 26030705(0x18d3271, float:5.18676E-38)
            androidx.compose.runtime.ComposerKt.traceEventStart(r2, r1, r3, r0)
        L_0x0318:
            androidx.compose.foundation.gestures.Orientation r5 = androidx.compose.foundation.gestures.Orientation.Vertical
            r7 = 0
            int r0 = r1 >> 3
            r2 = r0 & 14
            r2 = r2 | r22
            r4 = r0 & 112(0x70, float:1.57E-43)
            r2 = r2 | r4
            int r4 = r1 << 6
            r4 = r4 & 896(0x380, float:1.256E-42)
            r2 = r2 | r4
            r0 = r0 & 7168(0x1c00, float:1.0045E-41)
            r0 = r0 | r2
            int r2 = r1 >> 6
            r2 = r2 & r19
            r0 = r0 | r2
            int r2 = r1 << 3
            r4 = 3670016(0x380000, float:5.142788E-39)
            r4 = r4 & r2
            r0 = r0 | r4
            r4 = 234881024(0xe000000, float:1.5777218E-30)
            r2 = r2 & r4
            r0 = r0 | r2
            int r2 = r1 << 18
            r4 = 1879048192(0x70000000, float:1.58456325E29)
            r2 = r2 & r4
            r17 = r0 | r2
            int r0 = r1 >> 24
            r1 = r0 & 14
            r2 = 32768(0x8000, float:4.5918E-41)
            r1 = r1 | r2
            r0 = r0 & 112(0x70, float:1.57E-43)
            r0 = r0 | r1
            int r1 = r3 << 6
            r2 = r1 & 896(0x380, float:1.256E-42)
            r0 = r0 | r2
            r2 = r1 & 7168(0x1c00, float:1.0045E-41)
            r0 = r0 | r2
            r2 = 458752(0x70000, float:6.42848E-40)
            r1 = r1 & r2
            r18 = r0 | r1
            r19 = 128(0x80, float:1.794E-43)
            r0 = r20
            r1 = r21
            r2 = r35
            r3 = r24
            r4 = r27
            r6 = r25
            r8 = r28
            r9 = r23
            r10 = r29
            r22 = r11
            r11 = r30
            r12 = r33
            r13 = r31
            r14 = r32
            r15 = r48
            r16 = r22
            m810PagerwKDqQAw(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto L_0x0388
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L_0x0388:
            r2 = r20
            r3 = r21
            r4 = r23
            r5 = r24
            r6 = r25
            r7 = r27
            r8 = r28
            r9 = r29
            r10 = r30
            r12 = r31
            r13 = r32
            r11 = r33
        L_0x03a0:
            androidx.compose.runtime.ScopeUpdateScope r15 = r22.endRestartGroup()
            if (r15 != 0) goto L_0x03a7
            goto L_0x03c3
        L_0x03a7:
            androidx.compose.foundation.pager.PagerKt$VerticalPager$1 r18 = new androidx.compose.foundation.pager.PagerKt$VerticalPager$1
            r0 = r18
            r1 = r35
            r14 = r48
            r34 = r15
            r15 = r50
            r16 = r51
            r17 = r52
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            r0 = r18
            kotlin.jvm.functions.Function2 r0 = (kotlin.jvm.functions.Function2) r0
            r1 = r34
            r1.updateScope(r0)
        L_0x03c3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.pager.PagerKt.m811VerticalPagerAlbwjTQ(int, androidx.compose.ui.Modifier, androidx.compose.foundation.pager.PagerState, androidx.compose.foundation.layout.PaddingValues, androidx.compose.foundation.pager.PageSize, int, float, androidx.compose.ui.Alignment$Horizontal, androidx.compose.foundation.gestures.snapping.SnapFlingBehavior, boolean, boolean, kotlin.jvm.functions.Function1, androidx.compose.ui.input.nestedscroll.NestedScrollConnection, kotlin.jvm.functions.Function3, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v2, resolved type: androidx.compose.foundation.pager.PagerWrapperFlingBehavior} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v16, resolved type: kotlin.jvm.functions.Function2} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v31, resolved type: kotlin.jvm.functions.Function2} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: Pager-wKDqQAw  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m810PagerwKDqQAw(androidx.compose.ui.Modifier r28, androidx.compose.foundation.pager.PagerState r29, int r30, androidx.compose.foundation.pager.PageSize r31, float r32, androidx.compose.foundation.gestures.Orientation r33, int r34, androidx.compose.ui.Alignment.Vertical r35, androidx.compose.ui.Alignment.Horizontal r36, androidx.compose.foundation.layout.PaddingValues r37, androidx.compose.foundation.gestures.snapping.SnapFlingBehavior r38, boolean r39, boolean r40, kotlin.jvm.functions.Function1<? super java.lang.Integer, ? extends java.lang.Object> r41, androidx.compose.ui.input.nestedscroll.NestedScrollConnection r42, kotlin.jvm.functions.Function3<? super java.lang.Integer, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r43, androidx.compose.runtime.Composer r44, int r45, int r46, int r47) {
        /*
            r1 = r28
            r0 = r29
            r15 = r33
            r14 = r34
            r13 = r37
            r12 = r38
            r11 = r45
            r10 = r47
            java.lang.String r2 = "modifier"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r2)
            java.lang.String r2 = "state"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r2)
            java.lang.String r2 = "pageSize"
            r9 = r31
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r2)
            java.lang.String r2 = "orientation"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r15, r2)
            java.lang.String r2 = "contentPadding"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r2)
            java.lang.String r2 = "flingBehavior"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r2)
            java.lang.String r2 = "pageNestedScrollConnection"
            r8 = r42
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r2)
            java.lang.String r2 = "pageContent"
            r7 = r43
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r2)
            r2 = -765777783(0xffffffffd25b2889, float:-2.35319476E11)
            r3 = r44
            androidx.compose.runtime.Composer r6 = r3.startRestartGroup(r2)
            java.lang.String r3 = "C(Pager)P(5,13,8,10,11:c#ui.unit.Dp,6!1,15,3!2,14,12!1,9)264@12945L7,265@13000L7,266@13044L187,274@13262L94,278@13406L77,278@13362L121,282@13511L188,282@13489L210,295@13843L2772:Pager.kt#g6yjnt"
            androidx.compose.runtime.ComposerKt.sourceInformation(r6, r3)
            r3 = r10 & 128(0x80, float:1.794E-43)
            if (r3 == 0) goto L_0x0061
            androidx.compose.ui.Alignment$Companion r3 = androidx.compose.ui.Alignment.Companion
            androidx.compose.ui.Alignment$Vertical r3 = r3.getCenterVertically()
            r22 = r3
            goto L_0x0063
        L_0x0061:
            r22 = r35
        L_0x0063:
            r3 = r10 & 256(0x100, float:3.59E-43)
            if (r3 == 0) goto L_0x0070
            androidx.compose.ui.Alignment$Companion r3 = androidx.compose.ui.Alignment.Companion
            androidx.compose.ui.Alignment$Horizontal r3 = r3.getCenterHorizontally()
            r23 = r3
            goto L_0x0072
        L_0x0070:
            r23 = r36
        L_0x0072:
            boolean r3 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r3 == 0) goto L_0x0081
            java.lang.String r3 = "androidx.compose.foundation.pager.Pager (Pager.kt:240)"
            r5 = r46
            androidx.compose.runtime.ComposerKt.traceEventStart(r2, r11, r5, r3)
            goto L_0x0083
        L_0x0081:
            r5 = r46
        L_0x0083:
            if (r14 < 0) goto L_0x0278
            androidx.compose.foundation.gestures.Orientation r2 = androidx.compose.foundation.gestures.Orientation.Vertical
            if (r15 != r2) goto L_0x008b
            r3 = 1
            goto L_0x008d
        L_0x008b:
            r2 = 0
            r3 = r2
        L_0x008d:
            androidx.compose.runtime.ProvidableCompositionLocal r2 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalDensity()
            androidx.compose.runtime.CompositionLocal r2 = (androidx.compose.runtime.CompositionLocal) r2
            r4 = 2023513938(0x789c5f52, float:2.5372864E34)
            r36 = r3
            java.lang.String r3 = "CC:CompositionLocal.kt#9igjgp"
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(r6, r4, r3)
            java.lang.Object r2 = r6.consume(r2)
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(r6)
            androidx.compose.ui.unit.Density r2 = (androidx.compose.ui.unit.Density) r2
            androidx.compose.runtime.ProvidableCompositionLocal r16 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalLayoutDirection()
            r5 = r16
            androidx.compose.runtime.CompositionLocal r5 = (androidx.compose.runtime.CompositionLocal) r5
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(r6, r4, r3)
            java.lang.Object r3 = r6.consume(r5)
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(r6)
            androidx.compose.ui.unit.LayoutDirection r3 = (androidx.compose.ui.unit.LayoutDirection) r3
            r4 = 1618982084(0x607fb4c4, float:7.370227E19)
            r6.startReplaceableGroup(r4)
            java.lang.String r5 = "CC(remember)P(1,2,3):Composables.kt#9igjgp"
            androidx.compose.runtime.ComposerKt.sourceInformation(r6, r5)
            boolean r16 = r6.changed((java.lang.Object) r13)
            boolean r17 = r6.changed((java.lang.Object) r15)
            r16 = r16 | r17
            boolean r17 = r6.changed((java.lang.Object) r3)
            r16 = r16 | r17
            java.lang.Object r4 = r6.rememberedValue()
            if (r16 != 0) goto L_0x00e3
            androidx.compose.runtime.Composer$Companion r16 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r7 = r16.getEmpty()
            if (r4 != r7) goto L_0x00ee
        L_0x00e3:
            float r3 = calculateContentPaddings(r13, r15, r3)
            androidx.compose.ui.unit.Dp r4 = androidx.compose.ui.unit.Dp.m5624boximpl(r3)
            r6.updateRememberedValue(r4)
        L_0x00ee:
            r6.endReplaceableGroup()
            androidx.compose.ui.unit.Dp r4 = (androidx.compose.ui.unit.Dp) r4
            float r16 = r4.m5640unboximpl()
            r7 = r11 & 112(0x70, float:1.57E-43)
            r3 = 511388516(0x1e7b2b64, float:1.3296802E-20)
            r6.startReplaceableGroup(r3)
            java.lang.String r3 = "CC(remember)P(1,2):Composables.kt#9igjgp"
            androidx.compose.runtime.ComposerKt.sourceInformation(r6, r3)
            boolean r3 = r6.changed((java.lang.Object) r12)
            boolean r4 = r6.changed((java.lang.Object) r0)
            r3 = r3 | r4
            java.lang.Object r4 = r6.rememberedValue()
            if (r3 != 0) goto L_0x011b
            androidx.compose.runtime.Composer$Companion r3 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r3 = r3.getEmpty()
            if (r4 != r3) goto L_0x0123
        L_0x011b:
            androidx.compose.foundation.pager.PagerWrapperFlingBehavior r4 = new androidx.compose.foundation.pager.PagerWrapperFlingBehavior
            r4.<init>(r12, r0)
            r6.updateRememberedValue(r4)
        L_0x0123:
            r6.endReplaceableGroup()
            r17 = r4
            androidx.compose.foundation.pager.PagerWrapperFlingBehavior r17 = (androidx.compose.foundation.pager.PagerWrapperFlingBehavior) r17
            androidx.compose.ui.unit.Dp r4 = androidx.compose.ui.unit.Dp.m5624boximpl(r32)
            androidx.compose.ui.unit.Dp r3 = androidx.compose.ui.unit.Dp.m5624boximpl(r32)
            int r8 = r11 >> 6
            r8 = r8 & 896(0x380, float:1.256E-42)
            r9 = 1618982084(0x607fb4c4, float:7.370227E19)
            r6.startReplaceableGroup(r9)
            androidx.compose.runtime.ComposerKt.sourceInformation(r6, r5)
            boolean r5 = r6.changed((java.lang.Object) r2)
            boolean r9 = r6.changed((java.lang.Object) r0)
            r5 = r5 | r9
            boolean r3 = r6.changed((java.lang.Object) r3)
            r3 = r3 | r5
            java.lang.Object r5 = r6.rememberedValue()
            r9 = 0
            if (r3 != 0) goto L_0x0161
            androidx.compose.runtime.Composer$Companion r3 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r3 = r3.getEmpty()
            if (r5 != r3) goto L_0x015d
            goto L_0x0161
        L_0x015d:
            r3 = r5
            r5 = r32
            goto L_0x016d
        L_0x0161:
            androidx.compose.foundation.pager.PagerKt$Pager$2$1 r3 = new androidx.compose.foundation.pager.PagerKt$Pager$2$1
            r5 = r32
            r3.<init>(r2, r0, r5, r9)
            kotlin.jvm.functions.Function2 r3 = (kotlin.jvm.functions.Function2) r3
            r6.updateRememberedValue(r3)
        L_0x016d:
            r6.endReplaceableGroup()
            r18 = r3
            kotlin.jvm.functions.Function2 r18 = (kotlin.jvm.functions.Function2) r18
            r3 = r7 | 4096(0x1000, float:5.74E-42)
            r8 = r8 | r3
            r19 = r2
            r24 = r36
            r3 = r29
            r5 = r18
            r35 = r6
            r18 = r7
            r7 = r8
            androidx.compose.runtime.EffectsKt.LaunchedEffect(r2, r3, r4, r5, r6, r7)
            int r2 = r11 >> 3
            r2 = r2 & 14
            r3 = 1157296644(0x44faf204, float:2007.563)
            r8 = r35
            r8.startReplaceableGroup(r3)
            java.lang.String r3 = "CC(remember)P(1):Composables.kt#9igjgp"
            androidx.compose.runtime.ComposerKt.sourceInformation(r8, r3)
            boolean r3 = r8.changed((java.lang.Object) r0)
            java.lang.Object r4 = r8.rememberedValue()
            if (r3 != 0) goto L_0x01aa
            androidx.compose.runtime.Composer$Companion r3 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r3 = r3.getEmpty()
            if (r4 != r3) goto L_0x01b5
        L_0x01aa:
            androidx.compose.foundation.pager.PagerKt$Pager$3$1 r3 = new androidx.compose.foundation.pager.PagerKt$Pager$3$1
            r3.<init>(r0, r9)
            r4 = r3
            kotlin.jvm.functions.Function2 r4 = (kotlin.jvm.functions.Function2) r4
            r8.updateRememberedValue(r4)
        L_0x01b5:
            r8.endReplaceableGroup()
            kotlin.jvm.functions.Function2 r4 = (kotlin.jvm.functions.Function2) r4
            r2 = r2 | 64
            androidx.compose.runtime.EffectsKt.LaunchedEffect((java.lang.Object) r0, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) r4, (androidx.compose.runtime.Composer) r8, (int) r2)
            r2 = 1445594592(0x562a05e0, float:4.6735552E13)
            r8.startReplaceableGroup(r2)
            java.lang.String r2 = "290@13768L33"
            androidx.compose.runtime.ComposerKt.sourceInformation(r8, r2)
            if (r39 == 0) goto L_0x01d9
            androidx.compose.ui.Modifier$Companion r2 = androidx.compose.ui.Modifier.Companion
            androidx.compose.ui.Modifier r2 = (androidx.compose.ui.Modifier) r2
            r3 = r18 | 6
            r4 = r24
            androidx.compose.ui.Modifier r2 = pagerSemantics(r2, r0, r4, r8, r3)
            goto L_0x01df
        L_0x01d9:
            r4 = r24
            androidx.compose.ui.Modifier$Companion r2 = androidx.compose.ui.Modifier.Companion
            androidx.compose.ui.Modifier r2 = (androidx.compose.ui.Modifier) r2
        L_0x01df:
            r8.endReplaceableGroup()
            androidx.compose.ui.Modifier r24 = r1.then(r2)
            r25 = 0
            r26 = 0
            androidx.compose.foundation.pager.PagerKt$Pager$4 r9 = new androidx.compose.foundation.pager.PagerKt$Pager$4
            r2 = r9
            r3 = r4
            r4 = r19
            r5 = r32
            r6 = r16
            r7 = r40
            r0 = r8
            r8 = r29
            r1 = r9
            r9 = r45
            r10 = r37
            r11 = r17
            r12 = r39
            r13 = r34
            r14 = r23
            r15 = r22
            r16 = r46
            r17 = r31
            r18 = r30
            r19 = r41
            r20 = r42
            r21 = r43
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            r2 = -1677736225(0xffffffff9bffc6df, float:-4.2314729E-22)
            r3 = 1
            androidx.compose.runtime.internal.ComposableLambda r1 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(r0, r2, r3, r1)
            r6 = r1
            kotlin.jvm.functions.Function3 r6 = (kotlin.jvm.functions.Function3) r6
            r8 = 3072(0xc00, float:4.305E-42)
            r9 = 6
            r3 = r24
            r4 = r25
            r5 = r26
            r7 = r0
            androidx.compose.foundation.layout.BoxWithConstraintsKt.BoxWithConstraints(r3, r4, r5, r6, r7, r8, r9)
            boolean r1 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r1 == 0) goto L_0x0238
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L_0x0238:
            androidx.compose.runtime.ScopeUpdateScope r15 = r0.endRestartGroup()
            if (r15 != 0) goto L_0x023f
            goto L_0x0277
        L_0x023f:
            androidx.compose.foundation.pager.PagerKt$Pager$5 r20 = new androidx.compose.foundation.pager.PagerKt$Pager$5
            r0 = r20
            r1 = r28
            r2 = r29
            r3 = r30
            r4 = r31
            r5 = r32
            r6 = r33
            r7 = r34
            r8 = r22
            r9 = r23
            r10 = r37
            r11 = r38
            r12 = r39
            r13 = r40
            r14 = r41
            r27 = r15
            r15 = r42
            r16 = r43
            r17 = r45
            r18 = r46
            r19 = r47
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            r0 = r20
            kotlin.jvm.functions.Function2 r0 = (kotlin.jvm.functions.Function2) r0
            r1 = r27
            r1.updateScope(r0)
        L_0x0277:
            return
        L_0x0278:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "beyondBoundsPageCount should be greater than or equal to 0, you selected "
            r0.<init>(r1)
            r1 = r34
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.pager.PagerKt.m810PagerwKDqQAw(androidx.compose.ui.Modifier, androidx.compose.foundation.pager.PagerState, int, androidx.compose.foundation.pager.PageSize, float, androidx.compose.foundation.gestures.Orientation, int, androidx.compose.ui.Alignment$Vertical, androidx.compose.ui.Alignment$Horizontal, androidx.compose.foundation.layout.PaddingValues, androidx.compose.foundation.gestures.snapping.SnapFlingBehavior, boolean, boolean, kotlin.jvm.functions.Function1, androidx.compose.ui.input.nestedscroll.NestedScrollConnection, kotlin.jvm.functions.Function3, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final float calculateContentPaddings(PaddingValues paddingValues, Orientation orientation, LayoutDirection layoutDirection) {
        float f;
        float f2;
        if (orientation == Orientation.Vertical) {
            f = paddingValues.m506calculateTopPaddingD9Ej5fM();
        } else {
            f = paddingValues.m504calculateLeftPaddingu2uoSUM(layoutDirection);
        }
        if (orientation == Orientation.Vertical) {
            f2 = paddingValues.m503calculateBottomPaddingD9Ej5fM();
        } else {
            f2 = paddingValues.m505calculateRightPaddingu2uoSUM(layoutDirection);
        }
        return Dp.m5626constructorimpl(f + f2);
    }

    /* access modifiers changed from: private */
    public static final SnapLayoutInfoProvider SnapLayoutInfoProvider(PagerState pagerState, PagerSnapDistance pagerSnapDistance, DecayAnimationSpec<Float> decayAnimationSpec) {
        return new PagerKt$SnapLayoutInfoProvider$1(pagerState, decayAnimationSpec, pagerSnapDistance);
    }

    private static final Modifier pagerSemantics(Modifier modifier, PagerState pagerState, boolean z, Composer composer, int i) {
        composer.startReplaceableGroup(1509835088);
        ComposerKt.sourceInformation(composer, "C(pagerSemantics)P(1)739@30533L24:Pager.kt#g6yjnt");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1509835088, i, -1, "androidx.compose.foundation.pager.pagerSemantics (Pager.kt:738)");
        }
        composer.startReplaceableGroup(773894976);
        ComposerKt.sourceInformation(composer, "CC(rememberCoroutineScope)476@19869L144:Effects.kt#9igjgp");
        composer.startReplaceableGroup(-492369756);
        ComposerKt.sourceInformation(composer, "CC(remember):Composables.kt#9igjgp");
        Object rememberedValue = composer.rememberedValue();
        if (rememberedValue == Composer.Companion.getEmpty()) {
            CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composer));
            composer.updateRememberedValue(compositionScopedCoroutineScopeCanceller);
            rememberedValue = compositionScopedCoroutineScopeCanceller;
        }
        composer.endReplaceableGroup();
        CoroutineScope coroutineScope = ((CompositionScopedCoroutineScopeCanceller) rememberedValue).getCoroutineScope();
        composer.endReplaceableGroup();
        Modifier then = modifier.then(SemanticsModifierKt.semantics$default(Modifier.Companion, false, new PagerKt$pagerSemantics$1(z, pagerState, coroutineScope), 1, (Object) null));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return then;
    }

    /* access modifiers changed from: private */
    public static final boolean pagerSemantics$performForwardPaging(PagerState pagerState, CoroutineScope coroutineScope) {
        if (!pagerState.getCanScrollForward()) {
            return false;
        }
        Job unused = BuildersKt__Builders_commonKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new PagerKt$pagerSemantics$performForwardPaging$1(pagerState, (Continuation<? super PagerKt$pagerSemantics$performForwardPaging$1>) null), 3, (Object) null);
        return true;
    }

    /* access modifiers changed from: private */
    public static final boolean pagerSemantics$performBackwardPaging(PagerState pagerState, CoroutineScope coroutineScope) {
        if (!pagerState.getCanScrollBackward()) {
            return false;
        }
        Job unused = BuildersKt__Builders_commonKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new PagerKt$pagerSemantics$performBackwardPaging$1(pagerState, (Continuation<? super PagerKt$pagerSemantics$performBackwardPaging$1>) null), 3, (Object) null);
        return true;
    }
}
