package androidx.compose.material3;

import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.EnterTransition;
import androidx.compose.animation.ExitTransition;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.CubicBezierEasing;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.material3.tokens.MotionTokens;
import androidx.compose.runtime.State;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntSize;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

@Metadata(d1 = {"\u0000\u0001\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0002\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\u0012\u0010%\u001a\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\"0&2\u0012\u0010'\u001a\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\"0&2\u0006\u0010(\u001a\u00020)2\u0012\u0010*\u001a\u000e\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020\"0&2\b\b\u0002\u0010+\u001a\u00020,2\b\b\u0002\u0010-\u001a\u00020)2\u0015\b\u0002\u0010.\u001a\u000f\u0012\u0004\u0012\u00020\"\u0018\u00010/¢\u0006\u0002\b02\u0015\b\u0002\u00101\u001a\u000f\u0012\u0004\u0012\u00020\"\u0018\u00010/¢\u0006\u0002\b02\u0015\b\u0002\u00102\u001a\u000f\u0012\u0004\u0012\u00020\"\u0018\u00010/¢\u0006\u0002\b02\b\b\u0002\u00103\u001a\u0002042\b\b\u0002\u00105\u001a\u0002062\b\b\u0002\u00107\u001a\u00020\u00102\b\b\u0002\u00108\u001a\u0002092\u001c\u0010:\u001a\u0018\u0012\u0004\u0012\u00020;\u0012\u0004\u0012\u00020\"0&¢\u0006\u0002\b0¢\u0006\u0002\b<H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b=\u0010>\u001a\u0002\u0010?\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\u0012\u0010%\u001a\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\"0&2\u0012\u0010'\u001a\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\"0&2\u0006\u0010(\u001a\u00020)2\u0012\u0010*\u001a\u000e\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020\"0&2\b\b\u0002\u0010+\u001a\u00020,2\b\b\u0002\u0010-\u001a\u00020)2\u0015\b\u0002\u0010.\u001a\u000f\u0012\u0004\u0012\u00020\"\u0018\u00010/¢\u0006\u0002\b02\u0015\b\u0002\u00101\u001a\u000f\u0012\u0004\u0012\u00020\"\u0018\u00010/¢\u0006\u0002\b02\u0015\b\u0002\u00102\u001a\u000f\u0012\u0004\u0012\u00020\"\u0018\u00010/¢\u0006\u0002\b02\b\b\u0002\u00103\u001a\u0002042\b\b\u0002\u00105\u001a\u0002062\b\b\u0002\u00107\u001a\u00020\u00102\b\b\u0002\u0010@\u001a\u00020A2\b\b\u0002\u00108\u001a\u0002092\u001c\u0010:\u001a\u0018\u0012\u0004\u0012\u00020;\u0012\u0004\u0012\u00020\"0&¢\u0006\u0002\b0¢\u0006\u0002\b<H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bB\u0010C\u001aÆ\u0001\u0010D\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\u0012\u0010%\u001a\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\"0&2\u0012\u0010'\u001a\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\"0&2\u0006\u0010(\u001a\u00020)2\u0012\u0010*\u001a\u000e\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020\"0&2\b\b\u0002\u0010+\u001a\u00020,2\b\b\u0002\u0010-\u001a\u00020)2\u0015\b\u0002\u0010.\u001a\u000f\u0012\u0004\u0012\u00020\"\u0018\u00010/¢\u0006\u0002\b02\u0015\b\u0002\u00101\u001a\u000f\u0012\u0004\u0012\u00020\"\u0018\u00010/¢\u0006\u0002\b02\u0015\b\u0002\u00102\u001a\u000f\u0012\u0004\u0012\u00020\"\u0018\u00010/¢\u0006\u0002\b02\b\b\u0002\u00105\u001a\u00020E2\b\b\u0002\u00108\u001a\u000209H\u0003¢\u0006\u0002\u0010F\"\u000e\u0010\u0000\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000\"\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0004¢\u0006\u0002\n\u0000\"\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0006X\u0004ø\u0001\u0000¢\u0006\u0002\n\u0000\"\u000e\u0010\n\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000\"\u000e\u0010\u000b\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000\"\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0004¢\u0006\u0002\n\u0000\"\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\t0\u0006X\u0004ø\u0001\u0000¢\u0006\u0002\n\u0000\"\u000e\u0010\u000e\u001a\u00020\u0007XT¢\u0006\u0002\n\u0000\"\u0019\u0010\u000f\u001a\u00020\u0010X\u0004ø\u0001\u0000¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0011\u0010\u0012\"\u000e\u0010\u0014\u001a\u00020\u0015X\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0016\u001a\u00020\u0017X\u0004¢\u0006\u0002\n\u0000\"\u0019\u0010\u0018\u001a\u00020\u0010X\u0004ø\u0001\u0000¢\u0006\n\n\u0002\u0010\u0013\u0012\u0004\b\u0019\u0010\u001a\"\u0013\u0010\u001b\u001a\u00020\u0010X\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0013\"\u0013\u0010\u001c\u001a\u00020\u0010X\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0013\"\u0019\u0010\u001d\u001a\u00020\u0010X\u0004ø\u0001\u0000¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u001e\u0010\u0012\"\u0019\u0010\u001f\u001a\u00020\u0010X\u0004ø\u0001\u0000¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b \u0010\u0012\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006G"}, d2 = {"AnimationDelayMillis", "", "AnimationEnterDurationMillis", "AnimationEnterEasing", "Landroidx/compose/animation/core/CubicBezierEasing;", "AnimationEnterFloatSpec", "Landroidx/compose/animation/core/FiniteAnimationSpec;", "", "AnimationEnterSizeSpec", "Landroidx/compose/ui/unit/IntSize;", "AnimationExitDurationMillis", "AnimationExitEasing", "AnimationExitFloatSpec", "AnimationExitSizeSpec", "DockedActiveTableMaxHeightScreenRatio", "DockedActiveTableMinHeight", "Landroidx/compose/ui/unit/Dp;", "getDockedActiveTableMinHeight", "()F", "F", "DockedEnterTransition", "Landroidx/compose/animation/EnterTransition;", "DockedExitTransition", "Landroidx/compose/animation/ExitTransition;", "SearchBarCornerRadius", "getSearchBarCornerRadius$annotations", "()V", "SearchBarIconOffsetX", "SearchBarMaxWidth", "SearchBarMinWidth", "getSearchBarMinWidth", "SearchBarVerticalPadding", "getSearchBarVerticalPadding", "DockedSearchBar", "", "query", "", "onQueryChange", "Lkotlin/Function1;", "onSearch", "active", "", "onActiveChange", "modifier", "Landroidx/compose/ui/Modifier;", "enabled", "placeholder", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "leadingIcon", "trailingIcon", "shape", "Landroidx/compose/ui/graphics/Shape;", "colors", "Landroidx/compose/material3/SearchBarColors;", "tonalElevation", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "content", "Landroidx/compose/foundation/layout/ColumnScope;", "Lkotlin/ExtensionFunctionType;", "DockedSearchBar-rpjkMjA", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ZLkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/SearchBarColors;FLandroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;III)V", "SearchBar", "windowInsets", "Landroidx/compose/foundation/layout/WindowInsets;", "SearchBar-Id_Pb_0", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ZLkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/SearchBarColors;FLandroidx/compose/foundation/layout/WindowInsets;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;III)V", "SearchBarInputField", "Landroidx/compose/material3/TextFieldColors;", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ZLkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/material3/TextFieldColors;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/Composer;III)V", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: SearchBar.kt */
public final class SearchBarKt {
    private static final int AnimationDelayMillis = 100;
    private static final int AnimationEnterDurationMillis = 600;
    private static final CubicBezierEasing AnimationEnterEasing;
    private static final FiniteAnimationSpec<Float> AnimationEnterFloatSpec;
    private static final FiniteAnimationSpec<IntSize> AnimationEnterSizeSpec;
    private static final int AnimationExitDurationMillis = 350;
    private static final CubicBezierEasing AnimationExitEasing;
    private static final FiniteAnimationSpec<Float> AnimationExitFloatSpec;
    private static final FiniteAnimationSpec<IntSize> AnimationExitSizeSpec;
    private static final float DockedActiveTableMaxHeightScreenRatio = 0.6666667f;
    private static final float DockedActiveTableMinHeight = Dp.m5626constructorimpl((float) 240);
    /* access modifiers changed from: private */
    public static final EnterTransition DockedEnterTransition;
    /* access modifiers changed from: private */
    public static final ExitTransition DockedExitTransition;
    /* access modifiers changed from: private */
    public static final float SearchBarCornerRadius = Dp.m5626constructorimpl(SearchBarDefaults.INSTANCE.m1525getInputFieldHeightD9Ej5fM() / ((float) 2));
    /* access modifiers changed from: private */
    public static final float SearchBarIconOffsetX = Dp.m5626constructorimpl((float) 4);
    /* access modifiers changed from: private */
    public static final float SearchBarMaxWidth = Dp.m5626constructorimpl((float) 720);
    private static final float SearchBarMinWidth = Dp.m5626constructorimpl((float) 360);
    private static final float SearchBarVerticalPadding = Dp.m5626constructorimpl((float) 8);

    public static final float getDockedActiveTableMinHeight() {
        return DockedActiveTableMinHeight;
    }

    private static /* synthetic */ void getSearchBarCornerRadius$annotations() {
    }

    public static final float getSearchBarMinWidth() {
        return SearchBarMinWidth;
    }

    public static final float getSearchBarVerticalPadding() {
        return SearchBarVerticalPadding;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:137:0x01c5, code lost:
        if (r6.changed((java.lang.Object) r57) != false) goto L_0x01cc;
     */
    /* JADX WARNING: Removed duplicated region for block: B:134:0x01bb  */
    /* JADX WARNING: Removed duplicated region for block: B:141:0x01cf  */
    /* JADX WARNING: Removed duplicated region for block: B:144:0x01d5  */
    /* JADX WARNING: Removed duplicated region for block: B:145:0x01da  */
    /* JADX WARNING: Removed duplicated region for block: B:153:0x01f2  */
    /* JADX WARNING: Removed duplicated region for block: B:155:0x01f7  */
    /* JADX WARNING: Removed duplicated region for block: B:167:0x0223  */
    /* JADX WARNING: Removed duplicated region for block: B:168:0x023f  */
    /* JADX WARNING: Removed duplicated region for block: B:272:0x05e6  */
    /* JADX WARNING: Removed duplicated region for block: B:274:? A[RETURN, SYNTHETIC] */
    /* renamed from: SearchBar-Id_Pb_0  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m1529SearchBarId_Pb_0(java.lang.String r44, kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> r45, kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> r46, boolean r47, kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> r48, androidx.compose.ui.Modifier r49, boolean r50, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r51, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r52, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r53, androidx.compose.ui.graphics.Shape r54, androidx.compose.material3.SearchBarColors r55, float r56, androidx.compose.foundation.layout.WindowInsets r57, androidx.compose.foundation.interaction.MutableInteractionSource r58, kotlin.jvm.functions.Function3<? super androidx.compose.foundation.layout.ColumnScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r59, androidx.compose.runtime.Composer r60, int r61, int r62, int r63) {
        /*
            r15 = r44
            r14 = r45
            r13 = r46
            r12 = r47
            r11 = r48
            r10 = r59
            r9 = r61
            r8 = r62
            r7 = r63
            java.lang.String r0 = "query"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r15, r0)
            java.lang.String r0 = "onQueryChange"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r14, r0)
            java.lang.String r0 = "onSearch"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r0)
            java.lang.String r0 = "onActiveChange"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
            java.lang.String r0 = "content"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            r0 = 156000634(0x94c617a, float:2.460144E-33)
            r1 = r60
            androidx.compose.runtime.Composer r6 = r1.startRestartGroup(r0)
            java.lang.String r1 = "C(SearchBar)P(11,8,9!1,7,6,3,10,5,14,12!1,13:c#ui.unit.Dp,15,4)170@8704L15,171@8769L8,173@8884L12,174@8948L39,177@9084L160,182@9287L7,183@9326L7,185@9386L15,186@9453L15,187@9499L101,190@9625L578,210@10651L34,211@10707L179,221@10994L38,225@11170L112,229@11354L1074,218@10892L2701,282@13599L306,291@13941L37,291@13911L67:SearchBar.kt#uh7d8r"
            androidx.compose.runtime.ComposerKt.sourceInformation(r6, r1)
            r1 = r7 & 1
            if (r1 == 0) goto L_0x0045
            r1 = r9 | 6
            goto L_0x0055
        L_0x0045:
            r1 = r9 & 14
            if (r1 != 0) goto L_0x0054
            boolean r1 = r6.changed((java.lang.Object) r15)
            if (r1 == 0) goto L_0x0051
            r1 = 4
            goto L_0x0052
        L_0x0051:
            r1 = 2
        L_0x0052:
            r1 = r1 | r9
            goto L_0x0055
        L_0x0054:
            r1 = r9
        L_0x0055:
            r4 = r7 & 2
            r16 = 16
            if (r4 == 0) goto L_0x005e
            r1 = r1 | 48
            goto L_0x006e
        L_0x005e:
            r4 = r9 & 112(0x70, float:1.57E-43)
            if (r4 != 0) goto L_0x006e
            boolean r4 = r6.changedInstance(r14)
            if (r4 == 0) goto L_0x006b
            r4 = 32
            goto L_0x006d
        L_0x006b:
            r4 = r16
        L_0x006d:
            r1 = r1 | r4
        L_0x006e:
            r4 = r7 & 4
            r17 = 256(0x100, float:3.59E-43)
            r18 = 128(0x80, float:1.794E-43)
            if (r4 == 0) goto L_0x0079
            r1 = r1 | 384(0x180, float:5.38E-43)
            goto L_0x0089
        L_0x0079:
            r4 = r9 & 896(0x380, float:1.256E-42)
            if (r4 != 0) goto L_0x0089
            boolean r4 = r6.changedInstance(r13)
            if (r4 == 0) goto L_0x0086
            r4 = r17
            goto L_0x0088
        L_0x0086:
            r4 = r18
        L_0x0088:
            r1 = r1 | r4
        L_0x0089:
            r4 = r7 & 8
            r19 = 2048(0x800, float:2.87E-42)
            r20 = 1024(0x400, float:1.435E-42)
            if (r4 == 0) goto L_0x0094
            r1 = r1 | 3072(0xc00, float:4.305E-42)
            goto L_0x00a4
        L_0x0094:
            r4 = r9 & 7168(0x1c00, float:1.0045E-41)
            if (r4 != 0) goto L_0x00a4
            boolean r4 = r6.changed((boolean) r12)
            if (r4 == 0) goto L_0x00a1
            r4 = r19
            goto L_0x00a3
        L_0x00a1:
            r4 = r20
        L_0x00a3:
            r1 = r1 | r4
        L_0x00a4:
            r4 = r7 & 16
            r21 = 16384(0x4000, float:2.2959E-41)
            r25 = 57344(0xe000, float:8.0356E-41)
            r22 = 8192(0x2000, float:1.14794E-41)
            if (r4 == 0) goto L_0x00b2
            r1 = r1 | 24576(0x6000, float:3.4438E-41)
            goto L_0x00c2
        L_0x00b2:
            r4 = r9 & r25
            if (r4 != 0) goto L_0x00c2
            boolean r4 = r6.changedInstance(r11)
            if (r4 == 0) goto L_0x00bf
            r4 = r21
            goto L_0x00c1
        L_0x00bf:
            r4 = r22
        L_0x00c1:
            r1 = r1 | r4
        L_0x00c2:
            r4 = r7 & 32
            if (r4 == 0) goto L_0x00cd
            r23 = 196608(0x30000, float:2.75506E-40)
            r1 = r1 | r23
            r2 = r49
            goto L_0x00e2
        L_0x00cd:
            r23 = 458752(0x70000, float:6.42848E-40)
            r23 = r9 & r23
            r2 = r49
            if (r23 != 0) goto L_0x00e2
            boolean r23 = r6.changed((java.lang.Object) r2)
            if (r23 == 0) goto L_0x00de
            r23 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00e0
        L_0x00de:
            r23 = 65536(0x10000, float:9.18355E-41)
        L_0x00e0:
            r1 = r1 | r23
        L_0x00e2:
            r23 = r7 & 64
            if (r23 == 0) goto L_0x00ed
            r24 = 1572864(0x180000, float:2.204052E-39)
            r1 = r1 | r24
            r3 = r50
            goto L_0x0102
        L_0x00ed:
            r24 = 3670016(0x380000, float:5.142788E-39)
            r24 = r9 & r24
            r3 = r50
            if (r24 != 0) goto L_0x0102
            boolean r26 = r6.changed((boolean) r3)
            if (r26 == 0) goto L_0x00fe
            r26 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x0100
        L_0x00fe:
            r26 = 524288(0x80000, float:7.34684E-40)
        L_0x0100:
            r1 = r1 | r26
        L_0x0102:
            r5 = r7 & 128(0x80, float:1.794E-43)
            if (r5 == 0) goto L_0x010d
            r27 = 12582912(0xc00000, float:1.7632415E-38)
            r1 = r1 | r27
            r0 = r51
            goto L_0x0122
        L_0x010d:
            r27 = 29360128(0x1c00000, float:7.052966E-38)
            r27 = r9 & r27
            r0 = r51
            if (r27 != 0) goto L_0x0122
            boolean r28 = r6.changedInstance(r0)
            if (r28 == 0) goto L_0x011e
            r28 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x0120
        L_0x011e:
            r28 = 4194304(0x400000, float:5.877472E-39)
        L_0x0120:
            r1 = r1 | r28
        L_0x0122:
            r0 = r7 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L_0x012d
            r28 = 100663296(0x6000000, float:2.4074124E-35)
            r1 = r1 | r28
            r2 = r52
            goto L_0x0142
        L_0x012d:
            r28 = 234881024(0xe000000, float:1.5777218E-30)
            r28 = r9 & r28
            r2 = r52
            if (r28 != 0) goto L_0x0142
            boolean r28 = r6.changedInstance(r2)
            if (r28 == 0) goto L_0x013e
            r28 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x0140
        L_0x013e:
            r28 = 33554432(0x2000000, float:9.403955E-38)
        L_0x0140:
            r1 = r1 | r28
        L_0x0142:
            r2 = r7 & 512(0x200, float:7.175E-43)
            if (r2 == 0) goto L_0x014d
            r28 = 805306368(0x30000000, float:4.656613E-10)
            r1 = r1 | r28
            r3 = r53
            goto L_0x0162
        L_0x014d:
            r28 = 1879048192(0x70000000, float:1.58456325E29)
            r28 = r9 & r28
            r3 = r53
            if (r28 != 0) goto L_0x0162
            boolean r28 = r6.changedInstance(r3)
            if (r28 == 0) goto L_0x015e
            r28 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x0160
        L_0x015e:
            r28 = 268435456(0x10000000, float:2.5243549E-29)
        L_0x0160:
            r1 = r1 | r28
        L_0x0162:
            r28 = r8 & 14
            if (r28 != 0) goto L_0x017c
            r3 = r7 & 1024(0x400, float:1.435E-42)
            if (r3 != 0) goto L_0x0175
            r3 = r54
            boolean r28 = r6.changed((java.lang.Object) r3)
            if (r28 == 0) goto L_0x0177
            r24 = 4
            goto L_0x0179
        L_0x0175:
            r3 = r54
        L_0x0177:
            r24 = 2
        L_0x0179:
            r24 = r8 | r24
            goto L_0x0180
        L_0x017c:
            r3 = r54
            r24 = r8
        L_0x0180:
            r28 = r8 & 112(0x70, float:1.57E-43)
            if (r28 != 0) goto L_0x0198
            r3 = r7 & 2048(0x800, float:2.87E-42)
            if (r3 != 0) goto L_0x0193
            r3 = r55
            boolean r28 = r6.changed((java.lang.Object) r3)
            if (r28 == 0) goto L_0x0195
            r16 = 32
            goto L_0x0195
        L_0x0193:
            r3 = r55
        L_0x0195:
            r24 = r24 | r16
            goto L_0x019a
        L_0x0198:
            r3 = r55
        L_0x019a:
            r3 = r24
            r11 = r7 & 4096(0x1000, float:5.74E-42)
            if (r11 == 0) goto L_0x01a3
            r3 = r3 | 384(0x180, float:5.38E-43)
            goto L_0x01b5
        L_0x01a3:
            r13 = r8 & 896(0x380, float:1.256E-42)
            if (r13 != 0) goto L_0x01b5
            r13 = r56
            boolean r16 = r6.changed((float) r13)
            if (r16 == 0) goto L_0x01b0
            goto L_0x01b2
        L_0x01b0:
            r17 = r18
        L_0x01b2:
            r3 = r3 | r17
            goto L_0x01b7
        L_0x01b5:
            r13 = r56
        L_0x01b7:
            r13 = r8 & 7168(0x1c00, float:1.0045E-41)
            if (r13 != 0) goto L_0x01cf
            r13 = r7 & 8192(0x2000, float:1.14794E-41)
            if (r13 != 0) goto L_0x01c8
            r13 = r57
            boolean r16 = r6.changed((java.lang.Object) r13)
            if (r16 == 0) goto L_0x01ca
            goto L_0x01cc
        L_0x01c8:
            r13 = r57
        L_0x01ca:
            r19 = r20
        L_0x01cc:
            r3 = r3 | r19
            goto L_0x01d1
        L_0x01cf:
            r13 = r57
        L_0x01d1:
            r13 = r7 & 16384(0x4000, float:2.2959E-41)
            if (r13 == 0) goto L_0x01da
            r3 = r3 | 24576(0x6000, float:3.4438E-41)
            r14 = r58
            goto L_0x01eb
        L_0x01da:
            r16 = r8 & r25
            r14 = r58
            if (r16 != 0) goto L_0x01eb
            boolean r16 = r6.changed((java.lang.Object) r14)
            if (r16 == 0) goto L_0x01e7
            goto L_0x01e9
        L_0x01e7:
            r21 = r22
        L_0x01e9:
            r3 = r3 | r21
        L_0x01eb:
            r16 = 32768(0x8000, float:4.5918E-41)
            r16 = r7 & r16
            if (r16 == 0) goto L_0x01f7
            r16 = 196608(0x30000, float:2.75506E-40)
        L_0x01f4:
            r3 = r3 | r16
            goto L_0x0209
        L_0x01f7:
            r16 = 458752(0x70000, float:6.42848E-40)
            r16 = r8 & r16
            if (r16 != 0) goto L_0x0209
            boolean r16 = r6.changedInstance(r10)
            if (r16 == 0) goto L_0x0206
            r16 = 131072(0x20000, float:1.83671E-40)
            goto L_0x01f4
        L_0x0206:
            r16 = 65536(0x10000, float:9.18355E-41)
            goto L_0x01f4
        L_0x0209:
            r16 = 1533916891(0x5b6db6db, float:6.6910621E16)
            r8 = r1 & r16
            r10 = 306783378(0x12492492, float:6.3469493E-28)
            if (r8 != r10) goto L_0x023f
            r8 = 374491(0x5b6db, float:5.24774E-40)
            r8 = r8 & r3
            r10 = 74898(0x12492, float:1.04954E-40)
            if (r8 != r10) goto L_0x023f
            boolean r8 = r6.getSkipping()
            if (r8 != 0) goto L_0x0223
            goto L_0x023f
        L_0x0223:
            r6.skipToGroupEnd()
            r5 = r48
            r7 = r50
            r8 = r51
            r9 = r52
            r10 = r53
            r11 = r54
            r13 = r56
            r37 = r57
            r4 = r12
            r15 = r14
            r12 = r55
            r14 = r6
            r6 = r49
            goto L_0x05df
        L_0x023f:
            r6.startDefaults()
            r8 = r9 & 1
            java.lang.String r10 = "CC(remember):Composables.kt#9igjgp"
            if (r8 == 0) goto L_0x027b
            boolean r8 = r6.getDefaultsInvalid()
            if (r8 == 0) goto L_0x024f
            goto L_0x027b
        L_0x024f:
            r6.skipToGroupEnd()
            r0 = r7 & 1024(0x400, float:1.435E-42)
            if (r0 == 0) goto L_0x0258
            r3 = r3 & -15
        L_0x0258:
            r0 = r7 & 2048(0x800, float:2.87E-42)
            if (r0 == 0) goto L_0x025e
            r3 = r3 & -113(0xffffffffffffff8f, float:NaN)
        L_0x025e:
            r0 = r7 & 8192(0x2000, float:1.14794E-41)
            if (r0 == 0) goto L_0x0264
            r3 = r3 & -7169(0xffffffffffffe3ff, float:NaN)
        L_0x0264:
            r17 = r50
            r18 = r51
            r19 = r52
            r20 = r53
            r13 = r54
            r21 = r55
            r22 = r56
            r11 = r57
            r9 = r3
            r23 = r14
            r14 = r49
            goto L_0x0335
        L_0x027b:
            if (r4 == 0) goto L_0x0282
            androidx.compose.ui.Modifier$Companion r4 = androidx.compose.ui.Modifier.Companion
            androidx.compose.ui.Modifier r4 = (androidx.compose.ui.Modifier) r4
            goto L_0x0284
        L_0x0282:
            r4 = r49
        L_0x0284:
            if (r23 == 0) goto L_0x0288
            r8 = 1
            goto L_0x028a
        L_0x0288:
            r8 = r50
        L_0x028a:
            if (r5 == 0) goto L_0x028e
            r5 = 0
            goto L_0x0290
        L_0x028e:
            r5 = r51
        L_0x0290:
            if (r0 == 0) goto L_0x0294
            r0 = 0
            goto L_0x0296
        L_0x0294:
            r0 = r52
        L_0x0296:
            if (r2 == 0) goto L_0x029a
            r2 = 0
            goto L_0x029c
        L_0x029a:
            r2 = r53
        L_0x029c:
            r9 = r7 & 1024(0x400, float:1.435E-42)
            if (r9 == 0) goto L_0x02ac
            androidx.compose.material3.SearchBarDefaults r9 = androidx.compose.material3.SearchBarDefaults.INSTANCE
            r49 = r0
            r0 = 6
            androidx.compose.ui.graphics.Shape r9 = r9.getInputFieldShape(r6, r0)
            r3 = r3 & -15
            goto L_0x02b0
        L_0x02ac:
            r49 = r0
            r9 = r54
        L_0x02b0:
            r0 = r7 & 2048(0x800, float:2.87E-42)
            if (r0 == 0) goto L_0x02c9
            androidx.compose.material3.SearchBarDefaults r16 = androidx.compose.material3.SearchBarDefaults.INSTANCE
            r17 = 0
            r19 = 0
            r21 = 0
            r23 = 3072(0xc00, float:4.305E-42)
            r24 = 7
            r22 = r6
            androidx.compose.material3.SearchBarColors r0 = r16.m1523colorsKlgxPg(r17, r19, r21, r22, r23, r24)
            r3 = r3 & -113(0xffffffffffffff8f, float:NaN)
            goto L_0x02cb
        L_0x02c9:
            r0 = r55
        L_0x02cb:
            if (r11 == 0) goto L_0x02d4
            androidx.compose.material3.SearchBarDefaults r11 = androidx.compose.material3.SearchBarDefaults.INSTANCE
            float r11 = r11.m1524getElevationD9Ej5fM()
            goto L_0x02d6
        L_0x02d4:
            r11 = r56
        L_0x02d6:
            r50 = r0
            r0 = r7 & 8192(0x2000, float:1.14794E-41)
            if (r0 == 0) goto L_0x02e9
            androidx.compose.material3.SearchBarDefaults r0 = androidx.compose.material3.SearchBarDefaults.INSTANCE
            r51 = r2
            r2 = 6
            androidx.compose.foundation.layout.WindowInsets r0 = r0.getWindowInsets(r6, r2)
            r2 = r3 & -7169(0xffffffffffffe3ff, float:NaN)
            r3 = r2
            goto L_0x02ed
        L_0x02e9:
            r51 = r2
            r0 = r57
        L_0x02ed:
            if (r13 == 0) goto L_0x0323
            r2 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r6.startReplaceableGroup(r2)
            androidx.compose.runtime.ComposerKt.sourceInformation(r6, r10)
            java.lang.Object r2 = r6.rememberedValue()
            androidx.compose.runtime.Composer$Companion r13 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r13 = r13.getEmpty()
            if (r2 != r13) goto L_0x030b
            androidx.compose.foundation.interaction.MutableInteractionSource r2 = androidx.compose.foundation.interaction.InteractionSourceKt.MutableInteractionSource()
            r6.updateRememberedValue(r2)
        L_0x030b:
            r6.endReplaceableGroup()
            androidx.compose.foundation.interaction.MutableInteractionSource r2 = (androidx.compose.foundation.interaction.MutableInteractionSource) r2
            r19 = r49
            r21 = r50
            r20 = r51
            r23 = r2
            r14 = r4
            r18 = r5
            r17 = r8
            r13 = r9
            r22 = r11
            r11 = r0
            r9 = r3
            goto L_0x0335
        L_0x0323:
            r19 = r49
            r21 = r50
            r20 = r51
            r18 = r5
            r17 = r8
            r13 = r9
            r22 = r11
            r23 = r14
            r11 = r0
            r9 = r3
            r14 = r4
        L_0x0335:
            r6.endDefaults()
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto L_0x0347
            java.lang.String r0 = "androidx.compose.material3.SearchBar (SearchBar.kt:159)"
            r2 = 156000634(0x94c617a, float:2.460144E-33)
            androidx.compose.runtime.ComposerKt.traceEventStart(r2, r1, r9, r0)
        L_0x0347:
            if (r12 == 0) goto L_0x034c
            r0 = 1065353216(0x3f800000, float:1.0)
            goto L_0x034d
        L_0x034c:
            r0 = 0
        L_0x034d:
            if (r12 == 0) goto L_0x0352
            androidx.compose.animation.core.FiniteAnimationSpec<java.lang.Float> r2 = AnimationEnterFloatSpec
            goto L_0x0354
        L_0x0352:
            androidx.compose.animation.core.FiniteAnimationSpec<java.lang.Float> r2 = AnimationExitFloatSpec
        L_0x0354:
            androidx.compose.animation.core.AnimationSpec r2 = (androidx.compose.animation.core.AnimationSpec) r2
            r3 = 0
            r4 = 0
            r5 = 0
            r8 = 64
            r16 = 28
            r49 = r0
            r50 = r2
            r51 = r3
            r52 = r4
            r53 = r5
            r54 = r6
            r55 = r8
            r56 = r16
            androidx.compose.runtime.State r8 = androidx.compose.animation.core.AnimateAsStateKt.animateFloatAsState(r49, r50, r51, r52, r53, r54, r55, r56)
            androidx.compose.runtime.ProvidableCompositionLocal r0 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalFocusManager()
            androidx.compose.runtime.CompositionLocal r0 = (androidx.compose.runtime.CompositionLocal) r0
            r2 = 2023513938(0x789c5f52, float:2.5372864E34)
            java.lang.String r3 = "CC:CompositionLocal.kt#9igjgp"
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(r6, r2, r3)
            java.lang.Object r0 = r6.consume(r0)
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(r6)
            r5 = r0
            androidx.compose.ui.focus.FocusManager r5 = (androidx.compose.ui.focus.FocusManager) r5
            androidx.compose.runtime.ProvidableCompositionLocal r0 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalDensity()
            androidx.compose.runtime.CompositionLocal r0 = (androidx.compose.runtime.CompositionLocal) r0
            java.lang.String r3 = "CC:CompositionLocal.kt#9igjgp"
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(r6, r2, r3)
            java.lang.Object r0 = r6.consume(r0)
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(r6)
            androidx.compose.ui.unit.Density r0 = (androidx.compose.ui.unit.Density) r0
            androidx.compose.material3.SearchBarDefaults r2 = androidx.compose.material3.SearchBarDefaults.INSTANCE
            r4 = 6
            androidx.compose.ui.graphics.Shape r2 = r2.getInputFieldShape(r6, r4)
            androidx.compose.material3.SearchBarDefaults r3 = androidx.compose.material3.SearchBarDefaults.INSTANCE
            androidx.compose.ui.graphics.Shape r3 = r3.getFullScreenShape(r6, r4)
            r4 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r6.startReplaceableGroup(r4)
            androidx.compose.runtime.ComposerKt.sourceInformation(r6, r10)
            java.lang.Object r4 = r6.rememberedValue()
            androidx.compose.runtime.Composer$Companion r16 = androidx.compose.runtime.Composer.Companion
            r24 = r1
            java.lang.Object r1 = r16.getEmpty()
            if (r4 != r1) goto L_0x03d3
            androidx.compose.runtime.SnapshotMutationPolicy r1 = androidx.compose.runtime.SnapshotStateKt.structuralEqualityPolicy()
            androidx.compose.material3.SearchBarKt$SearchBar$useFullScreenShape$2$1 r4 = new androidx.compose.material3.SearchBarKt$SearchBar$useFullScreenShape$2$1
            r4.<init>(r8)
            kotlin.jvm.functions.Function0 r4 = (kotlin.jvm.functions.Function0) r4
            androidx.compose.runtime.State r4 = androidx.compose.runtime.SnapshotStateKt.derivedStateOf(r1, r4)
            r6.updateRememberedValue(r4)
        L_0x03d3:
            r6.endReplaceableGroup()
            androidx.compose.runtime.State r4 = (androidx.compose.runtime.State) r4
            boolean r1 = SearchBar_Id_Pb_0$lambda$2(r4)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r49 = r3
            r3 = 511388516(0x1e7b2b64, float:1.3296802E-20)
            r6.startReplaceableGroup(r3)
            java.lang.String r3 = "CC(remember)P(1,2):Composables.kt#9igjgp"
            androidx.compose.runtime.ComposerKt.sourceInformation(r6, r3)
            boolean r1 = r6.changed((java.lang.Object) r1)
            boolean r16 = r6.changed((java.lang.Object) r13)
            r1 = r1 | r16
            r51 = r5
            java.lang.Object r5 = r6.rememberedValue()
            if (r1 != 0) goto L_0x0407
            androidx.compose.runtime.Composer$Companion r1 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r1 = r1.getEmpty()
            if (r5 != r1) goto L_0x042a
        L_0x0407:
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r13, (java.lang.Object) r2)
            if (r1 == 0) goto L_0x041c
            androidx.compose.foundation.shape.GenericShape r1 = new androidx.compose.foundation.shape.GenericShape
            androidx.compose.material3.SearchBarKt$SearchBar$animatedShape$1$1 r2 = new androidx.compose.material3.SearchBarKt$SearchBar$animatedShape$1$1
            r2.<init>(r0, r8)
            kotlin.jvm.functions.Function3 r2 = (kotlin.jvm.functions.Function3) r2
            r1.<init>(r2)
            androidx.compose.ui.graphics.Shape r1 = (androidx.compose.ui.graphics.Shape) r1
            goto L_0x0426
        L_0x041c:
            boolean r1 = SearchBar_Id_Pb_0$lambda$2(r4)
            if (r1 == 0) goto L_0x0425
            r1 = r49
            goto L_0x0426
        L_0x0425:
            r1 = r13
        L_0x0426:
            r6.updateRememberedValue(r1)
            r5 = r1
        L_0x042a:
            r6.endReplaceableGroup()
            r27 = r5
            androidx.compose.ui.graphics.Shape r27 = (androidx.compose.ui.graphics.Shape) r27
            r1 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r6.startReplaceableGroup(r1)
            androidx.compose.runtime.ComposerKt.sourceInformation(r6, r10)
            java.lang.Object r1 = r6.rememberedValue()
            androidx.compose.runtime.Composer$Companion r2 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r2 = r2.getEmpty()
            if (r1 != r2) goto L_0x0451
            androidx.compose.material3.MutableWindowInsets r1 = new androidx.compose.material3.MutableWindowInsets
            r5 = 1
            r10 = 0
            r1.<init>(r10, r5, r10)
            r6.updateRememberedValue(r1)
            goto L_0x0453
        L_0x0451:
            r5 = 1
            r10 = 0
        L_0x0453:
            r6.endReplaceableGroup()
            androidx.compose.material3.MutableWindowInsets r1 = (androidx.compose.material3.MutableWindowInsets) r1
            r2 = 1157296644(0x44faf204, float:2007.563)
            r6.startReplaceableGroup(r2)
            java.lang.String r2 = "CC(remember)P(1):Composables.kt#9igjgp"
            androidx.compose.runtime.ComposerKt.sourceInformation(r6, r2)
            boolean r2 = r6.changed((java.lang.Object) r0)
            java.lang.Object r4 = r6.rememberedValue()
            if (r2 != 0) goto L_0x0475
            androidx.compose.runtime.Composer$Companion r2 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r2 = r2.getEmpty()
            if (r4 != r2) goto L_0x0483
        L_0x0475:
            androidx.compose.material3.SearchBarKt$SearchBar$topPadding$1$1 r2 = new androidx.compose.material3.SearchBarKt$SearchBar$topPadding$1$1
            r2.<init>(r1, r0)
            kotlin.jvm.functions.Function0 r2 = (kotlin.jvm.functions.Function0) r2
            androidx.compose.runtime.State r4 = androidx.compose.runtime.SnapshotStateKt.derivedStateOf(r2)
            r6.updateRememberedValue(r4)
        L_0x0483:
            r6.endReplaceableGroup()
            androidx.compose.runtime.State r4 = (androidx.compose.runtime.State) r4
            long r29 = r21.m1521getContainerColor0d7_KjU()
            r16 = r11
            long r10 = r21.m1521getContainerColor0d7_KjU()
            r0 = 0
            long r31 = androidx.compose.material3.ColorSchemeKt.m1242contentColorForek8zF_U(r10, r6, r0)
            r0 = 1065353216(0x3f800000, float:1.0)
            androidx.compose.ui.Modifier r0 = androidx.compose.ui.ZIndexModifierKt.zIndex(r14, r0)
            r2 = 511388516(0x1e7b2b64, float:1.3296802E-20)
            r6.startReplaceableGroup(r2)
            androidx.compose.runtime.ComposerKt.sourceInformation(r6, r3)
            boolean r2 = r6.changed((java.lang.Object) r1)
            r11 = r16
            boolean r10 = r6.changed((java.lang.Object) r11)
            r2 = r2 | r10
            java.lang.Object r10 = r6.rememberedValue()
            if (r2 != 0) goto L_0x04bf
            androidx.compose.runtime.Composer$Companion r2 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r2 = r2.getEmpty()
            if (r10 != r2) goto L_0x04ca
        L_0x04bf:
            androidx.compose.material3.SearchBarKt$SearchBar$2$1 r2 = new androidx.compose.material3.SearchBarKt$SearchBar$2$1
            r2.<init>(r1, r11)
            r10 = r2
            kotlin.jvm.functions.Function1 r10 = (kotlin.jvm.functions.Function1) r10
            r6.updateRememberedValue(r10)
        L_0x04ca:
            r6.endReplaceableGroup()
            kotlin.jvm.functions.Function1 r10 = (kotlin.jvm.functions.Function1) r10
            androidx.compose.ui.Modifier r0 = androidx.compose.foundation.layout.WindowInsetsPaddingKt.onConsumedWindowInsetsChanged(r0, r10)
            androidx.compose.foundation.layout.WindowInsets r1 = (androidx.compose.foundation.layout.WindowInsets) r1
            androidx.compose.ui.Modifier r0 = androidx.compose.foundation.layout.WindowInsetsPaddingKt.consumeWindowInsets((androidx.compose.ui.Modifier) r0, (androidx.compose.foundation.layout.WindowInsets) r1)
            r1 = 511388516(0x1e7b2b64, float:1.3296802E-20)
            r6.startReplaceableGroup(r1)
            androidx.compose.runtime.ComposerKt.sourceInformation(r6, r3)
            boolean r1 = r6.changed((java.lang.Object) r4)
            boolean r2 = r6.changed((java.lang.Object) r8)
            r1 = r1 | r2
            java.lang.Object r2 = r6.rememberedValue()
            if (r1 != 0) goto L_0x04f9
            androidx.compose.runtime.Composer$Companion r1 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r1 = r1.getEmpty()
            if (r2 != r1) goto L_0x0504
        L_0x04f9:
            androidx.compose.material3.SearchBarKt$SearchBar$3$1 r1 = new androidx.compose.material3.SearchBarKt$SearchBar$3$1
            r1.<init>(r4, r8)
            r2 = r1
            kotlin.jvm.functions.Function3 r2 = (kotlin.jvm.functions.Function3) r2
            r6.updateRememberedValue(r2)
        L_0x0504:
            r6.endReplaceableGroup()
            kotlin.jvm.functions.Function3 r2 = (kotlin.jvm.functions.Function3) r2
            androidx.compose.ui.Modifier r33 = androidx.compose.ui.layout.LayoutModifierKt.layout(r0, r2)
            r34 = 0
            r35 = 0
            androidx.compose.material3.SearchBarKt$SearchBar$4 r10 = new androidx.compose.material3.SearchBarKt$SearchBar$4
            r0 = r10
            r1 = r44
            r2 = r45
            r3 = r46
            r16 = r4
            r28 = 6
            r4 = r47
            r36 = r51
            r37 = r5
            r5 = r48
            r38 = r6
            r6 = r17
            r7 = r18
            r39 = r8
            r8 = r19
            r26 = r9
            r9 = r20
            r40 = r10
            r10 = r21
            r37 = r11
            r11 = r23
            r12 = r24
            r41 = r13
            r13 = r26
            r42 = r14
            r14 = r39
            r15 = r16
            r16 = r59
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            r0 = -867266817(0xffffffffcc4e8eff, float:-5.4148092E7)
            r14 = r38
            r1 = r40
            r2 = 1
            androidx.compose.runtime.internal.ComposableLambda r0 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(r14, r0, r2, r1)
            r10 = r0
            kotlin.jvm.functions.Function2 r10 = (kotlin.jvm.functions.Function2) r10
            int r0 = r26 << 6
            r0 = r0 & r25
            r1 = 12582912(0xc00000, float:1.7632415E-38)
            r12 = r0 | r1
            r13 = 96
            r1 = r33
            r2 = r27
            r3 = r29
            r5 = r31
            r7 = r22
            r8 = r34
            r9 = r35
            r11 = r14
            androidx.compose.material3.SurfaceKt.m1641SurfaceT9BRK9s(r1, r2, r3, r5, r7, r8, r9, r10, r11, r12, r13)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r47)
            androidx.compose.material3.SearchBarKt$SearchBar$5 r1 = new androidx.compose.material3.SearchBarKt$SearchBar$5
            r4 = r47
            r2 = r36
            r3 = 0
            r1.<init>(r4, r2, r3)
            kotlin.jvm.functions.Function2 r1 = (kotlin.jvm.functions.Function2) r1
            int r2 = r24 >> 9
            r2 = r2 & 14
            r3 = r2 | 64
            androidx.compose.runtime.EffectsKt.LaunchedEffect((java.lang.Object) r0, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) r1, (androidx.compose.runtime.Composer) r14, (int) r3)
            r0 = 1157296644(0x44faf204, float:2007.563)
            r14.startReplaceableGroup(r0)
            java.lang.String r0 = "CC(remember)P(1):Composables.kt#9igjgp"
            androidx.compose.runtime.ComposerKt.sourceInformation(r14, r0)
            r5 = r48
            boolean r0 = r14.changed((java.lang.Object) r5)
            java.lang.Object r1 = r14.rememberedValue()
            if (r0 != 0) goto L_0x05b0
            androidx.compose.runtime.Composer$Companion r0 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r0 = r0.getEmpty()
            if (r1 != r0) goto L_0x05bb
        L_0x05b0:
            androidx.compose.material3.SearchBarKt$SearchBar$6$1 r0 = new androidx.compose.material3.SearchBarKt$SearchBar$6$1
            r0.<init>(r5)
            r1 = r0
            kotlin.jvm.functions.Function0 r1 = (kotlin.jvm.functions.Function0) r1
            r14.updateRememberedValue(r1)
        L_0x05bb:
            r14.endReplaceableGroup()
            kotlin.jvm.functions.Function0 r1 = (kotlin.jvm.functions.Function0) r1
            r0 = 0
            androidx.activity.compose.BackHandlerKt.BackHandler(r4, r1, r14, r2, r0)
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto L_0x05cd
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L_0x05cd:
            r7 = r17
            r8 = r18
            r9 = r19
            r10 = r20
            r12 = r21
            r13 = r22
            r15 = r23
            r11 = r41
            r6 = r42
        L_0x05df:
            androidx.compose.runtime.ScopeUpdateScope r14 = r14.endRestartGroup()
            if (r14 != 0) goto L_0x05e6
            goto L_0x060c
        L_0x05e6:
            androidx.compose.material3.SearchBarKt$SearchBar$7 r20 = new androidx.compose.material3.SearchBarKt$SearchBar$7
            r0 = r20
            r1 = r44
            r2 = r45
            r3 = r46
            r4 = r47
            r5 = r48
            r43 = r14
            r14 = r37
            r16 = r59
            r17 = r61
            r18 = r62
            r19 = r63
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            r0 = r20
            kotlin.jvm.functions.Function2 r0 = (kotlin.jvm.functions.Function2) r0
            r1 = r43
            r1.updateScope(r0)
        L_0x060c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.SearchBarKt.m1529SearchBarId_Pb_0(java.lang.String, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, boolean, kotlin.jvm.functions.Function1, androidx.compose.ui.Modifier, boolean, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, androidx.compose.ui.graphics.Shape, androidx.compose.material3.SearchBarColors, float, androidx.compose.foundation.layout.WindowInsets, androidx.compose.foundation.interaction.MutableInteractionSource, kotlin.jvm.functions.Function3, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:134:0x01bb  */
    /* JADX WARNING: Removed duplicated region for block: B:135:0x01be  */
    /* JADX WARNING: Removed duplicated region for block: B:144:0x01d6  */
    /* JADX WARNING: Removed duplicated region for block: B:145:0x01d9  */
    /* JADX WARNING: Removed duplicated region for block: B:157:0x0200  */
    /* JADX WARNING: Removed duplicated region for block: B:158:0x021c  */
    /* JADX WARNING: Removed duplicated region for block: B:216:0x03ff  */
    /* JADX WARNING: Removed duplicated region for block: B:218:? A[RETURN, SYNTHETIC] */
    /* renamed from: DockedSearchBar-rpjkMjA  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m1528DockedSearchBarrpjkMjA(java.lang.String r39, kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> r40, kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> r41, boolean r42, kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> r43, androidx.compose.ui.Modifier r44, boolean r45, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r46, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r47, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r48, androidx.compose.ui.graphics.Shape r49, androidx.compose.material3.SearchBarColors r50, float r51, androidx.compose.foundation.interaction.MutableInteractionSource r52, kotlin.jvm.functions.Function3<? super androidx.compose.foundation.layout.ColumnScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r53, androidx.compose.runtime.Composer r54, int r55, int r56, int r57) {
        /*
            r15 = r39
            r14 = r40
            r13 = r41
            r12 = r42
            r11 = r43
            r10 = r53
            r9 = r55
            r8 = r56
            r7 = r57
            java.lang.String r0 = "query"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r15, r0)
            java.lang.String r0 = "onQueryChange"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r14, r0)
            java.lang.String r0 = "onSearch"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r0)
            java.lang.String r0 = "onActiveChange"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
            java.lang.String r0 = "content"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            r0 = -451213062(0xffffffffe51b08fa, float:-4.5758275E22)
            r1 = r54
            androidx.compose.runtime.Composer r6 = r1.startRestartGroup(r0)
            java.lang.String r1 = "C(DockedSearchBar)P(11,8,9!1,7,6,3,10,5,14,12!1,13:c#ui.unit.Dp,4)353@17339L11,354@17400L8,356@17514L39,359@17649L7,364@17756L38,361@17662L1564,406@19232L306,415@19574L37,415@19544L67:SearchBar.kt#uh7d8r"
            androidx.compose.runtime.ComposerKt.sourceInformation(r6, r1)
            r1 = r7 & 1
            if (r1 == 0) goto L_0x0045
            r1 = r9 | 6
            goto L_0x0055
        L_0x0045:
            r1 = r9 & 14
            if (r1 != 0) goto L_0x0054
            boolean r1 = r6.changed((java.lang.Object) r15)
            if (r1 == 0) goto L_0x0051
            r1 = 4
            goto L_0x0052
        L_0x0051:
            r1 = 2
        L_0x0052:
            r1 = r1 | r9
            goto L_0x0055
        L_0x0054:
            r1 = r9
        L_0x0055:
            r4 = r7 & 2
            r16 = 16
            if (r4 == 0) goto L_0x005e
            r1 = r1 | 48
            goto L_0x006e
        L_0x005e:
            r4 = r9 & 112(0x70, float:1.57E-43)
            if (r4 != 0) goto L_0x006e
            boolean r4 = r6.changedInstance(r14)
            if (r4 == 0) goto L_0x006b
            r4 = 32
            goto L_0x006d
        L_0x006b:
            r4 = r16
        L_0x006d:
            r1 = r1 | r4
        L_0x006e:
            r4 = r7 & 4
            r17 = 256(0x100, float:3.59E-43)
            r18 = 128(0x80, float:1.794E-43)
            if (r4 == 0) goto L_0x0079
            r1 = r1 | 384(0x180, float:5.38E-43)
            goto L_0x0089
        L_0x0079:
            r4 = r9 & 896(0x380, float:1.256E-42)
            if (r4 != 0) goto L_0x0089
            boolean r4 = r6.changedInstance(r13)
            if (r4 == 0) goto L_0x0086
            r4 = r17
            goto L_0x0088
        L_0x0086:
            r4 = r18
        L_0x0088:
            r1 = r1 | r4
        L_0x0089:
            r4 = r7 & 8
            r19 = 2048(0x800, float:2.87E-42)
            r20 = 1024(0x400, float:1.435E-42)
            if (r4 == 0) goto L_0x0094
            r1 = r1 | 3072(0xc00, float:4.305E-42)
            goto L_0x00a4
        L_0x0094:
            r4 = r9 & 7168(0x1c00, float:1.0045E-41)
            if (r4 != 0) goto L_0x00a4
            boolean r4 = r6.changed((boolean) r12)
            if (r4 == 0) goto L_0x00a1
            r4 = r19
            goto L_0x00a3
        L_0x00a1:
            r4 = r20
        L_0x00a3:
            r1 = r1 | r4
        L_0x00a4:
            r4 = r7 & 16
            r21 = 16384(0x4000, float:2.2959E-41)
            r22 = 8192(0x2000, float:1.14794E-41)
            r25 = 57344(0xe000, float:8.0356E-41)
            if (r4 == 0) goto L_0x00b2
            r1 = r1 | 24576(0x6000, float:3.4438E-41)
            goto L_0x00c2
        L_0x00b2:
            r4 = r9 & r25
            if (r4 != 0) goto L_0x00c2
            boolean r4 = r6.changedInstance(r11)
            if (r4 == 0) goto L_0x00bf
            r4 = r21
            goto L_0x00c1
        L_0x00bf:
            r4 = r22
        L_0x00c1:
            r1 = r1 | r4
        L_0x00c2:
            r4 = r7 & 32
            if (r4 == 0) goto L_0x00cd
            r23 = 196608(0x30000, float:2.75506E-40)
            r1 = r1 | r23
            r2 = r44
            goto L_0x00e2
        L_0x00cd:
            r23 = 458752(0x70000, float:6.42848E-40)
            r23 = r9 & r23
            r2 = r44
            if (r23 != 0) goto L_0x00e2
            boolean r23 = r6.changed((java.lang.Object) r2)
            if (r23 == 0) goto L_0x00de
            r23 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00e0
        L_0x00de:
            r23 = 65536(0x10000, float:9.18355E-41)
        L_0x00e0:
            r1 = r1 | r23
        L_0x00e2:
            r23 = r7 & 64
            if (r23 == 0) goto L_0x00ed
            r24 = 1572864(0x180000, float:2.204052E-39)
            r1 = r1 | r24
            r3 = r45
            goto L_0x0102
        L_0x00ed:
            r24 = 3670016(0x380000, float:5.142788E-39)
            r24 = r9 & r24
            r3 = r45
            if (r24 != 0) goto L_0x0102
            boolean r26 = r6.changed((boolean) r3)
            if (r26 == 0) goto L_0x00fe
            r26 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x0100
        L_0x00fe:
            r26 = 524288(0x80000, float:7.34684E-40)
        L_0x0100:
            r1 = r1 | r26
        L_0x0102:
            r5 = r7 & 128(0x80, float:1.794E-43)
            if (r5 == 0) goto L_0x010d
            r27 = 12582912(0xc00000, float:1.7632415E-38)
            r1 = r1 | r27
            r0 = r46
            goto L_0x0122
        L_0x010d:
            r27 = 29360128(0x1c00000, float:7.052966E-38)
            r27 = r9 & r27
            r0 = r46
            if (r27 != 0) goto L_0x0122
            boolean r28 = r6.changedInstance(r0)
            if (r28 == 0) goto L_0x011e
            r28 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x0120
        L_0x011e:
            r28 = 4194304(0x400000, float:5.877472E-39)
        L_0x0120:
            r1 = r1 | r28
        L_0x0122:
            r0 = r7 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L_0x012d
            r28 = 100663296(0x6000000, float:2.4074124E-35)
            r1 = r1 | r28
            r2 = r47
            goto L_0x0142
        L_0x012d:
            r28 = 234881024(0xe000000, float:1.5777218E-30)
            r28 = r9 & r28
            r2 = r47
            if (r28 != 0) goto L_0x0142
            boolean r28 = r6.changedInstance(r2)
            if (r28 == 0) goto L_0x013e
            r28 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x0140
        L_0x013e:
            r28 = 33554432(0x2000000, float:9.403955E-38)
        L_0x0140:
            r1 = r1 | r28
        L_0x0142:
            r2 = r7 & 512(0x200, float:7.175E-43)
            if (r2 == 0) goto L_0x014d
            r28 = 805306368(0x30000000, float:4.656613E-10)
            r1 = r1 | r28
            r3 = r48
            goto L_0x0162
        L_0x014d:
            r28 = 1879048192(0x70000000, float:1.58456325E29)
            r28 = r9 & r28
            r3 = r48
            if (r28 != 0) goto L_0x0162
            boolean r28 = r6.changedInstance(r3)
            if (r28 == 0) goto L_0x015e
            r28 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x0160
        L_0x015e:
            r28 = 268435456(0x10000000, float:2.5243549E-29)
        L_0x0160:
            r1 = r1 | r28
        L_0x0162:
            r28 = r8 & 14
            if (r28 != 0) goto L_0x017c
            r3 = r7 & 1024(0x400, float:1.435E-42)
            if (r3 != 0) goto L_0x0175
            r3 = r49
            boolean r28 = r6.changed((java.lang.Object) r3)
            if (r28 == 0) goto L_0x0177
            r24 = 4
            goto L_0x0179
        L_0x0175:
            r3 = r49
        L_0x0177:
            r24 = 2
        L_0x0179:
            r24 = r8 | r24
            goto L_0x0180
        L_0x017c:
            r3 = r49
            r24 = r8
        L_0x0180:
            r28 = r8 & 112(0x70, float:1.57E-43)
            if (r28 != 0) goto L_0x0198
            r3 = r7 & 2048(0x800, float:2.87E-42)
            if (r3 != 0) goto L_0x0193
            r3 = r50
            boolean r28 = r6.changed((java.lang.Object) r3)
            if (r28 == 0) goto L_0x0195
            r16 = 32
            goto L_0x0195
        L_0x0193:
            r3 = r50
        L_0x0195:
            r24 = r24 | r16
            goto L_0x019a
        L_0x0198:
            r3 = r50
        L_0x019a:
            r3 = r24
            r11 = r7 & 4096(0x1000, float:5.74E-42)
            if (r11 == 0) goto L_0x01a3
            r3 = r3 | 384(0x180, float:5.38E-43)
            goto L_0x01b5
        L_0x01a3:
            r12 = r8 & 896(0x380, float:1.256E-42)
            if (r12 != 0) goto L_0x01b5
            r12 = r51
            boolean r16 = r6.changed((float) r12)
            if (r16 == 0) goto L_0x01b0
            goto L_0x01b2
        L_0x01b0:
            r17 = r18
        L_0x01b2:
            r3 = r3 | r17
            goto L_0x01b7
        L_0x01b5:
            r12 = r51
        L_0x01b7:
            r12 = r7 & 8192(0x2000, float:1.14794E-41)
            if (r12 == 0) goto L_0x01be
            r3 = r3 | 3072(0xc00, float:4.305E-42)
            goto L_0x01d0
        L_0x01be:
            r13 = r8 & 7168(0x1c00, float:1.0045E-41)
            if (r13 != 0) goto L_0x01d0
            r13 = r52
            boolean r16 = r6.changed((java.lang.Object) r13)
            if (r16 == 0) goto L_0x01cb
            goto L_0x01cd
        L_0x01cb:
            r19 = r20
        L_0x01cd:
            r3 = r3 | r19
            goto L_0x01d2
        L_0x01d0:
            r13 = r52
        L_0x01d2:
            r13 = r7 & 16384(0x4000, float:2.2959E-41)
            if (r13 == 0) goto L_0x01d9
            r3 = r3 | 24576(0x6000, float:3.4438E-41)
            goto L_0x01e8
        L_0x01d9:
            r13 = r8 & r25
            if (r13 != 0) goto L_0x01e8
            boolean r13 = r6.changedInstance(r10)
            if (r13 == 0) goto L_0x01e4
            goto L_0x01e6
        L_0x01e4:
            r21 = r22
        L_0x01e6:
            r3 = r3 | r21
        L_0x01e8:
            r13 = 1533916891(0x5b6db6db, float:6.6910621E16)
            r13 = r13 & r1
            r8 = 306783378(0x12492492, float:6.3469493E-28)
            if (r13 != r8) goto L_0x021c
            r8 = 46811(0xb6db, float:6.5596E-41)
            r8 = r8 & r3
            r13 = 9362(0x2492, float:1.3119E-41)
            if (r8 != r13) goto L_0x021c
            boolean r8 = r6.getSkipping()
            if (r8 != 0) goto L_0x0200
            goto L_0x021c
        L_0x0200:
            r6.skipToGroupEnd()
            r4 = r42
            r5 = r43
            r7 = r45
            r8 = r46
            r9 = r47
            r10 = r48
            r11 = r49
            r12 = r50
            r13 = r51
            r14 = r52
            r15 = r6
            r6 = r44
            goto L_0x03f8
        L_0x021c:
            r6.startDefaults()
            r8 = r9 & 1
            if (r8 == 0) goto L_0x024e
            boolean r8 = r6.getDefaultsInvalid()
            if (r8 == 0) goto L_0x022a
            goto L_0x024e
        L_0x022a:
            r6.skipToGroupEnd()
            r0 = r7 & 1024(0x400, float:1.435E-42)
            if (r0 == 0) goto L_0x0233
            r3 = r3 & -15
        L_0x0233:
            r0 = r7 & 2048(0x800, float:2.87E-42)
            if (r0 == 0) goto L_0x0239
            r3 = r3 & -113(0xffffffffffffff8f, float:NaN)
        L_0x0239:
            r15 = r44
            r16 = r45
            r17 = r46
            r18 = r47
            r19 = r48
            r20 = r49
            r21 = r50
            r22 = r51
            r23 = r52
            r13 = r3
            goto L_0x02ee
        L_0x024e:
            if (r4 == 0) goto L_0x0255
            androidx.compose.ui.Modifier$Companion r4 = androidx.compose.ui.Modifier.Companion
            androidx.compose.ui.Modifier r4 = (androidx.compose.ui.Modifier) r4
            goto L_0x0257
        L_0x0255:
            r4 = r44
        L_0x0257:
            if (r23 == 0) goto L_0x025b
            r8 = 1
            goto L_0x025d
        L_0x025b:
            r8 = r45
        L_0x025d:
            if (r5 == 0) goto L_0x0261
            r5 = 0
            goto L_0x0263
        L_0x0261:
            r5 = r46
        L_0x0263:
            if (r0 == 0) goto L_0x0267
            r0 = 0
            goto L_0x0269
        L_0x0267:
            r0 = r47
        L_0x0269:
            if (r2 == 0) goto L_0x026d
            r2 = 0
            goto L_0x026f
        L_0x026d:
            r2 = r48
        L_0x026f:
            r13 = r7 & 1024(0x400, float:1.435E-42)
            if (r13 == 0) goto L_0x027d
            androidx.compose.material3.SearchBarDefaults r13 = androidx.compose.material3.SearchBarDefaults.INSTANCE
            r15 = 6
            androidx.compose.ui.graphics.Shape r13 = r13.getDockedShape(r6, r15)
            r3 = r3 & -15
            goto L_0x0280
        L_0x027d:
            r15 = 6
            r13 = r49
        L_0x0280:
            r15 = r7 & 2048(0x800, float:2.87E-42)
            if (r15 == 0) goto L_0x0299
            androidx.compose.material3.SearchBarDefaults r16 = androidx.compose.material3.SearchBarDefaults.INSTANCE
            r17 = 0
            r19 = 0
            r21 = 0
            r23 = 3072(0xc00, float:4.305E-42)
            r24 = 7
            r22 = r6
            androidx.compose.material3.SearchBarColors r15 = r16.m1523colorsKlgxPg(r17, r19, r21, r22, r23, r24)
            r3 = r3 & -113(0xffffffffffffff8f, float:NaN)
            goto L_0x029b
        L_0x0299:
            r15 = r50
        L_0x029b:
            if (r11 == 0) goto L_0x02a4
            androidx.compose.material3.SearchBarDefaults r11 = androidx.compose.material3.SearchBarDefaults.INSTANCE
            float r11 = r11.m1524getElevationD9Ej5fM()
            goto L_0x02a6
        L_0x02a4:
            r11 = r51
        L_0x02a6:
            if (r12 == 0) goto L_0x02da
            r12 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r6.startReplaceableGroup(r12)
            java.lang.String r12 = "CC(remember):Composables.kt#9igjgp"
            androidx.compose.runtime.ComposerKt.sourceInformation(r6, r12)
            java.lang.Object r12 = r6.rememberedValue()
            androidx.compose.runtime.Composer$Companion r16 = androidx.compose.runtime.Composer.Companion
            r44 = r0
            java.lang.Object r0 = r16.getEmpty()
            if (r12 != r0) goto L_0x02c8
            androidx.compose.foundation.interaction.MutableInteractionSource r12 = androidx.compose.foundation.interaction.InteractionSourceKt.MutableInteractionSource()
            r6.updateRememberedValue(r12)
        L_0x02c8:
            r6.endReplaceableGroup()
            androidx.compose.foundation.interaction.MutableInteractionSource r12 = (androidx.compose.foundation.interaction.MutableInteractionSource) r12
            r18 = r44
            r19 = r2
            r17 = r5
            r16 = r8
            r22 = r11
            r23 = r12
            goto L_0x02e8
        L_0x02da:
            r44 = r0
            r18 = r44
            r23 = r52
            r19 = r2
            r17 = r5
            r16 = r8
            r22 = r11
        L_0x02e8:
            r20 = r13
            r21 = r15
            r13 = r3
            r15 = r4
        L_0x02ee:
            r6.endDefaults()
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto L_0x0300
            java.lang.String r0 = "androidx.compose.material3.DockedSearchBar (SearchBar.kt:342)"
            r2 = -451213062(0xffffffffe51b08fa, float:-4.5758275E22)
            androidx.compose.runtime.ComposerKt.traceEventStart(r2, r1, r13, r0)
        L_0x0300:
            androidx.compose.runtime.ProvidableCompositionLocal r0 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalFocusManager()
            androidx.compose.runtime.CompositionLocal r0 = (androidx.compose.runtime.CompositionLocal) r0
            r2 = 2023513938(0x789c5f52, float:2.5372864E34)
            java.lang.String r3 = "CC:CompositionLocal.kt#9igjgp"
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(r6, r2, r3)
            java.lang.Object r0 = r6.consume(r0)
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(r6)
            r12 = r0
            androidx.compose.ui.focus.FocusManager r12 = (androidx.compose.ui.focus.FocusManager) r12
            long r29 = r21.m1521getContainerColor0d7_KjU()
            long r2 = r21.m1521getContainerColor0d7_KjU()
            r0 = 0
            long r31 = androidx.compose.material3.ColorSchemeKt.m1242contentColorForek8zF_U(r2, r6, r0)
            r0 = 1065353216(0x3f800000, float:1.0)
            androidx.compose.ui.Modifier r0 = androidx.compose.ui.ZIndexModifierKt.zIndex(r15, r0)
            float r2 = SearchBarMinWidth
            androidx.compose.ui.Modifier r24 = androidx.compose.foundation.layout.SizeKt.m568width3ABfNKs(r0, r2)
            r27 = 0
            r33 = 0
            androidx.compose.material3.SearchBarKt$DockedSearchBar$2 r11 = new androidx.compose.material3.SearchBarKt$DockedSearchBar$2
            r0 = r11
            r34 = r1
            r1 = r39
            r2 = r40
            r3 = r41
            r4 = r42
            r5 = r43
            r8 = r6
            r6 = r16
            r7 = r17
            r44 = r15
            r15 = r8
            r8 = r18
            r9 = r19
            r10 = r21
            r35 = r11
            r11 = r23
            r36 = r12
            r12 = r34
            r26 = r13
            r37 = 6
            r14 = r53
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            r0 = -1764436203(0xffffffff96d4d715, float:-3.4386183E-25)
            r1 = r35
            r2 = 1
            androidx.compose.runtime.internal.ComposableLambda r0 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(r15, r0, r2, r1)
            r10 = r0
            kotlin.jvm.functions.Function2 r10 = (kotlin.jvm.functions.Function2) r10
            int r0 = r26 << 3
            r0 = r0 & 112(0x70, float:1.57E-43)
            r1 = 12582912(0xc00000, float:1.7632415E-38)
            r0 = r0 | r1
            int r1 = r26 << 6
            r1 = r1 & r25
            r12 = r0 | r1
            r13 = 96
            r1 = r24
            r2 = r20
            r3 = r29
            r5 = r31
            r7 = r22
            r8 = r27
            r9 = r33
            r11 = r15
            androidx.compose.material3.SurfaceKt.m1641SurfaceT9BRK9s(r1, r2, r3, r5, r7, r8, r9, r10, r11, r12, r13)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r42)
            androidx.compose.material3.SearchBarKt$DockedSearchBar$3 r1 = new androidx.compose.material3.SearchBarKt$DockedSearchBar$3
            r4 = r42
            r2 = r36
            r3 = 0
            r1.<init>(r4, r2, r3)
            kotlin.jvm.functions.Function2 r1 = (kotlin.jvm.functions.Function2) r1
            int r2 = r34 >> 9
            r2 = r2 & 14
            r3 = r2 | 64
            androidx.compose.runtime.EffectsKt.LaunchedEffect((java.lang.Object) r0, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) r1, (androidx.compose.runtime.Composer) r15, (int) r3)
            r0 = 1157296644(0x44faf204, float:2007.563)
            r15.startReplaceableGroup(r0)
            java.lang.String r0 = "CC(remember)P(1):Composables.kt#9igjgp"
            androidx.compose.runtime.ComposerKt.sourceInformation(r15, r0)
            r5 = r43
            boolean r0 = r15.changed((java.lang.Object) r5)
            java.lang.Object r1 = r15.rememberedValue()
            if (r0 != 0) goto L_0x03c9
            androidx.compose.runtime.Composer$Companion r0 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r0 = r0.getEmpty()
            if (r1 != r0) goto L_0x03d4
        L_0x03c9:
            androidx.compose.material3.SearchBarKt$DockedSearchBar$4$1 r0 = new androidx.compose.material3.SearchBarKt$DockedSearchBar$4$1
            r0.<init>(r5)
            r1 = r0
            kotlin.jvm.functions.Function0 r1 = (kotlin.jvm.functions.Function0) r1
            r15.updateRememberedValue(r1)
        L_0x03d4:
            r15.endReplaceableGroup()
            kotlin.jvm.functions.Function0 r1 = (kotlin.jvm.functions.Function0) r1
            r0 = 0
            androidx.activity.compose.BackHandlerKt.BackHandler(r4, r1, r15, r2, r0)
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto L_0x03e6
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L_0x03e6:
            r6 = r44
            r7 = r16
            r8 = r17
            r9 = r18
            r10 = r19
            r11 = r20
            r12 = r21
            r13 = r22
            r14 = r23
        L_0x03f8:
            androidx.compose.runtime.ScopeUpdateScope r15 = r15.endRestartGroup()
            if (r15 != 0) goto L_0x03ff
            goto L_0x0423
        L_0x03ff:
            androidx.compose.material3.SearchBarKt$DockedSearchBar$5 r19 = new androidx.compose.material3.SearchBarKt$DockedSearchBar$5
            r0 = r19
            r1 = r39
            r2 = r40
            r3 = r41
            r4 = r42
            r5 = r43
            r38 = r15
            r15 = r53
            r16 = r55
            r17 = r56
            r18 = r57
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            r0 = r19
            kotlin.jvm.functions.Function2 r0 = (kotlin.jvm.functions.Function2) r0
            r1 = r38
            r1.updateScope(r0)
        L_0x0423:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.SearchBarKt.m1528DockedSearchBarrpjkMjA(java.lang.String, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, boolean, kotlin.jvm.functions.Function1, androidx.compose.ui.Modifier, boolean, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, androidx.compose.ui.graphics.Shape, androidx.compose.material3.SearchBarColors, float, androidx.compose.foundation.interaction.MutableInteractionSource, kotlin.jvm.functions.Function3, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r40v0, resolved type: kotlin.jvm.functions.Function1} */
    /* access modifiers changed from: private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x0137  */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x014d  */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x0155  */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x015a  */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x0186  */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x0199  */
    /* JADX WARNING: Removed duplicated region for block: B:197:0x04ed  */
    /* JADX WARNING: Removed duplicated region for block: B:200:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00b7  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00be  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x00d7  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x00de  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x00f7  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x00fe  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x0117  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x011e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void SearchBarInputField(java.lang.String r81, kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> r82, kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> r83, boolean r84, kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> r85, androidx.compose.ui.Modifier r86, boolean r87, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r88, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r89, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r90, androidx.compose.material3.TextFieldColors r91, androidx.compose.foundation.interaction.MutableInteractionSource r92, androidx.compose.runtime.Composer r93, int r94, int r95, int r96) {
        /*
            r15 = r81
            r13 = r83
            r12 = r84
            r11 = r85
            r10 = r94
            r9 = r96
            r0 = -1330051158(0xffffffffb0b907aa, float:-1.34627E-9)
            r1 = r93
            androidx.compose.runtime.Composer r8 = r1.startRestartGroup(r0)
            java.lang.String r1 = "C(SearchBarInputField)P(10,7,8!1,6,5,2,9,4,11)433@20114L18,434@20184L39,436@20254L29,437@20310L34,438@20385L39,450@20838L42,451@20904L304,463@21299L7,464@21384L28,466@21547L19,443@20594L2004:SearchBar.kt#uh7d8r"
            androidx.compose.runtime.ComposerKt.sourceInformation(r8, r1)
            r1 = r9 & 1
            if (r1 == 0) goto L_0x0021
            r1 = r10 | 6
            goto L_0x0031
        L_0x0021:
            r1 = r10 & 14
            if (r1 != 0) goto L_0x0030
            boolean r1 = r8.changed((java.lang.Object) r15)
            if (r1 == 0) goto L_0x002d
            r1 = 4
            goto L_0x002e
        L_0x002d:
            r1 = 2
        L_0x002e:
            r1 = r1 | r10
            goto L_0x0031
        L_0x0030:
            r1 = r10
        L_0x0031:
            r4 = r9 & 2
            if (r4 == 0) goto L_0x003a
            r1 = r1 | 48
            r7 = r82
            goto L_0x004c
        L_0x003a:
            r4 = r10 & 112(0x70, float:1.57E-43)
            r7 = r82
            if (r4 != 0) goto L_0x004c
            boolean r4 = r8.changedInstance(r7)
            if (r4 == 0) goto L_0x0049
            r4 = 32
            goto L_0x004b
        L_0x0049:
            r4 = 16
        L_0x004b:
            r1 = r1 | r4
        L_0x004c:
            r4 = r9 & 4
            if (r4 == 0) goto L_0x0053
            r1 = r1 | 384(0x180, float:5.38E-43)
            goto L_0x0063
        L_0x0053:
            r4 = r10 & 896(0x380, float:1.256E-42)
            if (r4 != 0) goto L_0x0063
            boolean r4 = r8.changedInstance(r13)
            if (r4 == 0) goto L_0x0060
            r4 = 256(0x100, float:3.59E-43)
            goto L_0x0062
        L_0x0060:
            r4 = 128(0x80, float:1.794E-43)
        L_0x0062:
            r1 = r1 | r4
        L_0x0063:
            r4 = r9 & 8
            if (r4 == 0) goto L_0x006a
            r1 = r1 | 3072(0xc00, float:4.305E-42)
            goto L_0x007a
        L_0x006a:
            r4 = r10 & 7168(0x1c00, float:1.0045E-41)
            if (r4 != 0) goto L_0x007a
            boolean r4 = r8.changed((boolean) r12)
            if (r4 == 0) goto L_0x0077
            r4 = 2048(0x800, float:2.87E-42)
            goto L_0x0079
        L_0x0077:
            r4 = 1024(0x400, float:1.435E-42)
        L_0x0079:
            r1 = r1 | r4
        L_0x007a:
            r4 = r9 & 16
            if (r4 == 0) goto L_0x0081
            r1 = r1 | 24576(0x6000, float:3.4438E-41)
            goto L_0x0093
        L_0x0081:
            r4 = 57344(0xe000, float:8.0356E-41)
            r4 = r4 & r10
            if (r4 != 0) goto L_0x0093
            boolean r4 = r8.changedInstance(r11)
            if (r4 == 0) goto L_0x0090
            r4 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0092
        L_0x0090:
            r4 = 8192(0x2000, float:1.14794E-41)
        L_0x0092:
            r1 = r1 | r4
        L_0x0093:
            r4 = r9 & 32
            r48 = 196608(0x30000, float:2.75506E-40)
            if (r4 == 0) goto L_0x009c
            r1 = r1 | r48
            goto L_0x00b1
        L_0x009c:
            r14 = 458752(0x70000, float:6.42848E-40)
            r14 = r14 & r10
            if (r14 != 0) goto L_0x00b1
            r14 = r86
            boolean r16 = r8.changed((java.lang.Object) r14)
            if (r16 == 0) goto L_0x00ac
            r16 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00ae
        L_0x00ac:
            r16 = 65536(0x10000, float:9.18355E-41)
        L_0x00ae:
            r1 = r1 | r16
            goto L_0x00b3
        L_0x00b1:
            r14 = r86
        L_0x00b3:
            r16 = r9 & 64
            if (r16 == 0) goto L_0x00be
            r17 = 1572864(0x180000, float:2.204052E-39)
            r1 = r1 | r17
            r2 = r87
            goto L_0x00d3
        L_0x00be:
            r17 = 3670016(0x380000, float:5.142788E-39)
            r17 = r10 & r17
            r2 = r87
            if (r17 != 0) goto L_0x00d3
            boolean r17 = r8.changed((boolean) r2)
            if (r17 == 0) goto L_0x00cf
            r17 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00d1
        L_0x00cf:
            r17 = 524288(0x80000, float:7.34684E-40)
        L_0x00d1:
            r1 = r1 | r17
        L_0x00d3:
            r5 = r9 & 128(0x80, float:1.794E-43)
            if (r5 == 0) goto L_0x00de
            r18 = 12582912(0xc00000, float:1.7632415E-38)
            r1 = r1 | r18
            r6 = r88
            goto L_0x00f3
        L_0x00de:
            r18 = 29360128(0x1c00000, float:7.052966E-38)
            r18 = r10 & r18
            r6 = r88
            if (r18 != 0) goto L_0x00f3
            boolean r19 = r8.changedInstance(r6)
            if (r19 == 0) goto L_0x00ef
            r19 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00f1
        L_0x00ef:
            r19 = 4194304(0x400000, float:5.877472E-39)
        L_0x00f1:
            r1 = r1 | r19
        L_0x00f3:
            r3 = r9 & 256(0x100, float:3.59E-43)
            if (r3 == 0) goto L_0x00fe
            r19 = 100663296(0x6000000, float:2.4074124E-35)
            r1 = r1 | r19
            r0 = r89
            goto L_0x0113
        L_0x00fe:
            r19 = 234881024(0xe000000, float:1.5777218E-30)
            r19 = r10 & r19
            r0 = r89
            if (r19 != 0) goto L_0x0113
            boolean r19 = r8.changedInstance(r0)
            if (r19 == 0) goto L_0x010f
            r19 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x0111
        L_0x010f:
            r19 = 33554432(0x2000000, float:9.403955E-38)
        L_0x0111:
            r1 = r1 | r19
        L_0x0113:
            r0 = r9 & 512(0x200, float:7.175E-43)
            if (r0 == 0) goto L_0x011e
            r19 = 805306368(0x30000000, float:4.656613E-10)
            r1 = r1 | r19
            r2 = r90
            goto L_0x0133
        L_0x011e:
            r19 = 1879048192(0x70000000, float:1.58456325E29)
            r19 = r10 & r19
            r2 = r90
            if (r19 != 0) goto L_0x0133
            boolean r19 = r8.changedInstance(r2)
            if (r19 == 0) goto L_0x012f
            r19 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x0131
        L_0x012f:
            r19 = 268435456(0x10000000, float:2.5243549E-29)
        L_0x0131:
            r1 = r1 | r19
        L_0x0133:
            r19 = r95 & 14
            if (r19 != 0) goto L_0x014d
            r2 = r9 & 1024(0x400, float:1.435E-42)
            if (r2 != 0) goto L_0x0146
            r2 = r91
            boolean r19 = r8.changed((java.lang.Object) r2)
            if (r19 == 0) goto L_0x0148
            r19 = 4
            goto L_0x014a
        L_0x0146:
            r2 = r91
        L_0x0148:
            r19 = 2
        L_0x014a:
            r19 = r95 | r19
            goto L_0x0151
        L_0x014d:
            r2 = r91
            r19 = r95
        L_0x0151:
            r2 = r9 & 2048(0x800, float:2.87E-42)
            if (r2 == 0) goto L_0x015a
            r19 = r19 | 48
            r6 = r92
            goto L_0x016d
        L_0x015a:
            r20 = r95 & 112(0x70, float:1.57E-43)
            r6 = r92
            if (r20 != 0) goto L_0x016d
            boolean r20 = r8.changed((java.lang.Object) r6)
            if (r20 == 0) goto L_0x0169
            r17 = 32
            goto L_0x016b
        L_0x0169:
            r17 = 16
        L_0x016b:
            r19 = r19 | r17
        L_0x016d:
            r49 = r19
            r17 = 1533916891(0x5b6db6db, float:6.6910621E16)
            r6 = r1 & r17
            r7 = 306783378(0x12492492, float:6.3469493E-28)
            if (r6 != r7) goto L_0x0199
            r6 = r49 & 91
            r7 = 18
            if (r6 != r7) goto L_0x0199
            boolean r6 = r8.getSkipping()
            if (r6 != 0) goto L_0x0186
            goto L_0x0199
        L_0x0186:
            r8.skipToGroupEnd()
            r7 = r87
            r9 = r89
            r10 = r90
            r11 = r91
            r12 = r92
            r0 = r8
            r6 = r14
            r8 = r88
            goto L_0x04e6
        L_0x0199:
            r8.startDefaults()
            r6 = r10 & 1
            if (r6 == 0) goto L_0x01c2
            boolean r6 = r8.getDefaultsInvalid()
            if (r6 == 0) goto L_0x01a7
            goto L_0x01c2
        L_0x01a7:
            r8.skipToGroupEnd()
            r0 = r9 & 1024(0x400, float:1.435E-42)
            if (r0 == 0) goto L_0x01b0
            r49 = r49 & -15
        L_0x01b0:
            r7 = r86
            r30 = r87
            r31 = r88
            r32 = r89
            r33 = r90
            r6 = r91
            r34 = r92
            r5 = r49
            goto L_0x024e
        L_0x01c2:
            if (r4 == 0) goto L_0x01c9
            androidx.compose.ui.Modifier$Companion r4 = androidx.compose.ui.Modifier.Companion
            androidx.compose.ui.Modifier r4 = (androidx.compose.ui.Modifier) r4
            goto L_0x01cb
        L_0x01c9:
            r4 = r86
        L_0x01cb:
            if (r16 == 0) goto L_0x01cf
            r6 = 1
            goto L_0x01d1
        L_0x01cf:
            r6 = r87
        L_0x01d1:
            if (r5 == 0) goto L_0x01d5
            r5 = 0
            goto L_0x01d7
        L_0x01d5:
            r5 = r88
        L_0x01d7:
            if (r3 == 0) goto L_0x01db
            r3 = 0
            goto L_0x01dd
        L_0x01db:
            r3 = r89
        L_0x01dd:
            if (r0 == 0) goto L_0x01e1
            r0 = 0
            goto L_0x01e3
        L_0x01e1:
            r0 = r90
        L_0x01e3:
            r7 = r9 & 1024(0x400, float:1.435E-42)
            if (r7 == 0) goto L_0x0214
            androidx.compose.material3.SearchBarDefaults r16 = androidx.compose.material3.SearchBarDefaults.INSTANCE
            r17 = 0
            r19 = 0
            r21 = 0
            r23 = 0
            r25 = 0
            r26 = 0
            r28 = 0
            r30 = 0
            r32 = 0
            r34 = 0
            r36 = 0
            r38 = 0
            r40 = 0
            r42 = 0
            r45 = 0
            r46 = 24576(0x6000, float:3.4438E-41)
            r47 = 16383(0x3fff, float:2.2957E-41)
            r44 = r8
            androidx.compose.material3.TextFieldColors r7 = r16.m1527inputFieldColorsITpI4ow(r17, r19, r21, r23, r25, r26, r28, r30, r32, r34, r36, r38, r40, r42, r44, r45, r46, r47)
            r49 = r49 & -15
            goto L_0x0216
        L_0x0214:
            r7 = r91
        L_0x0216:
            if (r2 == 0) goto L_0x0240
            r2 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r8.startReplaceableGroup(r2)
            java.lang.String r2 = "CC(remember):Composables.kt#9igjgp"
            androidx.compose.runtime.ComposerKt.sourceInformation(r8, r2)
            java.lang.Object r2 = r8.rememberedValue()
            androidx.compose.runtime.Composer$Companion r16 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r14 = r16.getEmpty()
            if (r2 != r14) goto L_0x0236
            androidx.compose.foundation.interaction.MutableInteractionSource r2 = androidx.compose.foundation.interaction.InteractionSourceKt.MutableInteractionSource()
            r8.updateRememberedValue(r2)
        L_0x0236:
            r8.endReplaceableGroup()
            androidx.compose.foundation.interaction.MutableInteractionSource r2 = (androidx.compose.foundation.interaction.MutableInteractionSource) r2
            r33 = r0
            r34 = r2
            goto L_0x0244
        L_0x0240:
            r34 = r92
            r33 = r0
        L_0x0244:
            r32 = r3
            r31 = r5
            r30 = r6
            r6 = r7
            r5 = r49
            r7 = r4
        L_0x024e:
            r8.endDefaults()
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto L_0x0260
            java.lang.String r0 = "androidx.compose.material3.SearchBarInputField (SearchBar.kt:422)"
            r2 = -1330051158(0xffffffffb0b907aa, float:-1.34627E-9)
            androidx.compose.runtime.ComposerKt.traceEventStart(r2, r1, r5, r0)
        L_0x0260:
            r0 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r8.startReplaceableGroup(r0)
            java.lang.String r0 = "CC(remember):Composables.kt#9igjgp"
            androidx.compose.runtime.ComposerKt.sourceInformation(r8, r0)
            java.lang.Object r0 = r8.rememberedValue()
            androidx.compose.runtime.Composer$Companion r2 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r2 = r2.getEmpty()
            if (r0 != r2) goto L_0x027f
            androidx.compose.ui.focus.FocusRequester r0 = new androidx.compose.ui.focus.FocusRequester
            r0.<init>()
            r8.updateRememberedValue(r0)
        L_0x027f:
            r8.endReplaceableGroup()
            androidx.compose.ui.focus.FocusRequester r0 = (androidx.compose.ui.focus.FocusRequester) r0
            androidx.compose.material3.Strings$Companion r2 = androidx.compose.material3.Strings.Companion
            int r2 = r2.m1613getSearchBarSearchadMyvUU()
            r4 = 6
            java.lang.String r2 = androidx.compose.material3.Strings_androidKt.m1632getStringNWtq28(r2, r8, r4)
            androidx.compose.material3.Strings$Companion r3 = androidx.compose.material3.Strings.Companion
            int r3 = r3.m1617getSuggestionsAvailableadMyvUU()
            java.lang.String r3 = androidx.compose.material3.Strings_androidKt.m1632getStringNWtq28(r3, r8, r4)
            r14 = 462567106(0x1b9236c2, float:2.418906E-22)
            r8.startReplaceableGroup(r14)
            java.lang.String r14 = "*439@20460L7,440@20502L74"
            androidx.compose.runtime.ComposerKt.sourceInformation(r8, r14)
            androidx.compose.runtime.ProvidableCompositionLocal r14 = androidx.compose.material3.TextKt.getLocalTextStyle()
            androidx.compose.runtime.CompositionLocal r14 = (androidx.compose.runtime.CompositionLocal) r14
            r4 = 2023513938(0x789c5f52, float:2.5372864E34)
            java.lang.String r9 = "CC:CompositionLocal.kt#9igjgp"
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(r8, r4, r9)
            java.lang.Object r4 = r8.consume(r14)
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(r8)
            androidx.compose.ui.text.TextStyle r4 = (androidx.compose.ui.text.TextStyle) r4
            long r16 = r4.m5151getColor0d7_KjU()
            androidx.compose.ui.graphics.Color$Companion r4 = androidx.compose.ui.graphics.Color.Companion
            long r19 = r4.m2857getUnspecified0d7_KjU()
            int r4 = (r16 > r19 ? 1 : (r16 == r19 ? 0 : -1))
            if (r4 == 0) goto L_0x02ca
            goto L_0x02f9
        L_0x02ca:
            r9 = r34
            androidx.compose.foundation.interaction.InteractionSource r9 = (androidx.compose.foundation.interaction.InteractionSource) r9
            int r14 = r1 >> 18
            r14 = r14 & 14
            r14 = r14 | 48
            int r4 = r5 << 3
            r4 = r4 & 896(0x380, float:1.256E-42)
            r4 = r4 | r14
            int r14 = r5 << 9
            r14 = r14 & 7168(0x1c00, float:1.0045E-41)
            r4 = r4 | r14
            r86 = r6
            r87 = r30
            r14 = 0
            r88 = r14
            r89 = r9
            r90 = r8
            r91 = r4
            androidx.compose.runtime.State r4 = r86.textColor$material3_release(r87, r88, r89, r90, r91)
            java.lang.Object r4 = r4.getValue()
            androidx.compose.ui.graphics.Color r4 = (androidx.compose.ui.graphics.Color) r4
            long r16 = r4.m2831unboximpl()
        L_0x02f9:
            r51 = r16
            r8.endReplaceableGroup()
            androidx.compose.material3.SearchBarDefaults r4 = androidx.compose.material3.SearchBarDefaults.INSTANCE
            float r4 = r4.m1525getInputFieldHeightD9Ej5fM()
            androidx.compose.ui.Modifier r4 = androidx.compose.foundation.layout.SizeKt.m549height3ABfNKs(r7, r4)
            r9 = 0
            r93 = r1
            r1 = 1
            r14 = 0
            androidx.compose.ui.Modifier r4 = androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(r4, r9, r1, r14)
            androidx.compose.ui.Modifier r1 = androidx.compose.ui.focus.FocusRequesterModifierKt.focusRequester(r4, r0)
            r4 = 1157296644(0x44faf204, float:2007.563)
            r8.startReplaceableGroup(r4)
            java.lang.String r4 = "CC(remember)P(1):Composables.kt#9igjgp"
            androidx.compose.runtime.ComposerKt.sourceInformation(r8, r4)
            boolean r4 = r8.changed((java.lang.Object) r11)
            java.lang.Object r9 = r8.rememberedValue()
            if (r4 != 0) goto L_0x0332
            androidx.compose.runtime.Composer$Companion r4 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r4 = r4.getEmpty()
            if (r9 != r4) goto L_0x033d
        L_0x0332:
            androidx.compose.material3.SearchBarKt$SearchBarInputField$2$1 r4 = new androidx.compose.material3.SearchBarKt$SearchBarInputField$2$1
            r4.<init>(r11)
            r9 = r4
            kotlin.jvm.functions.Function1 r9 = (kotlin.jvm.functions.Function1) r9
            r8.updateRememberedValue(r9)
        L_0x033d:
            r8.endReplaceableGroup()
            kotlin.jvm.functions.Function1 r9 = (kotlin.jvm.functions.Function1) r9
            androidx.compose.ui.Modifier r1 = androidx.compose.ui.focus.FocusChangedModifierKt.onFocusChanged(r1, r9)
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r84)
            java.lang.Object[] r4 = new java.lang.Object[]{r2, r4, r3, r0}
            r9 = -568225417(0xffffffffde219177, float:-2.91055434E18)
            r8.startReplaceableGroup(r9)
            java.lang.String r9 = "CC(remember)P(1):Composables.kt#9igjgp"
            androidx.compose.runtime.ComposerKt.sourceInformation(r8, r9)
            r9 = 4
            r14 = 0
            r16 = 0
        L_0x035d:
            if (r14 >= r9) goto L_0x036b
            r9 = r4[r14]
            boolean r9 = r8.changed((java.lang.Object) r9)
            r16 = r16 | r9
            int r14 = r14 + 1
            r9 = 4
            goto L_0x035d
        L_0x036b:
            java.lang.Object r4 = r8.rememberedValue()
            if (r16 != 0) goto L_0x0379
            androidx.compose.runtime.Composer$Companion r9 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r9 = r9.getEmpty()
            if (r4 != r9) goto L_0x0383
        L_0x0379:
            androidx.compose.material3.SearchBarKt$SearchBarInputField$3$1 r4 = new androidx.compose.material3.SearchBarKt$SearchBarInputField$3$1
            r4.<init>(r2, r12, r3, r0)
            kotlin.jvm.functions.Function1 r4 = (kotlin.jvm.functions.Function1) r4
            r8.updateRememberedValue(r4)
        L_0x0383:
            r8.endReplaceableGroup()
            kotlin.jvm.functions.Function1 r4 = (kotlin.jvm.functions.Function1) r4
            r0 = 0
            r2 = 0
            r3 = 1
            androidx.compose.ui.Modifier r16 = androidx.compose.ui.semantics.SemanticsModifierKt.semantics$default(r1, r0, r4, r3, r2)
            androidx.compose.runtime.ProvidableCompositionLocal r0 = androidx.compose.material3.TextKt.getLocalTextStyle()
            androidx.compose.runtime.CompositionLocal r0 = (androidx.compose.runtime.CompositionLocal) r0
            r1 = 2023513938(0x789c5f52, float:2.5372864E34)
            java.lang.String r2 = "CC:CompositionLocal.kt#9igjgp"
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(r8, r1, r2)
            java.lang.Object r0 = r8.consume(r0)
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(r8)
            androidx.compose.ui.text.TextStyle r0 = (androidx.compose.ui.text.TextStyle) r0
            androidx.compose.ui.text.TextStyle r1 = new androidx.compose.ui.text.TextStyle
            r50 = r1
            r53 = 0
            r55 = 0
            r56 = 0
            r57 = 0
            r58 = 0
            r59 = 0
            r60 = 0
            r62 = 0
            r63 = 0
            r64 = 0
            r65 = 0
            r67 = 0
            r68 = 0
            r69 = 0
            r70 = 0
            r71 = 0
            r73 = 0
            r74 = 0
            r75 = 0
            r76 = 0
            r77 = 0
            r78 = 4194302(0x3ffffe, float:5.877469E-39)
            r79 = 0
            r50.<init>((long) r51, (long) r53, (androidx.compose.ui.text.font.FontWeight) r55, (androidx.compose.ui.text.font.FontStyle) r56, (androidx.compose.ui.text.font.FontSynthesis) r57, (androidx.compose.ui.text.font.FontFamily) r58, (java.lang.String) r59, (long) r60, (androidx.compose.ui.text.style.BaselineShift) r62, (androidx.compose.ui.text.style.TextGeometricTransform) r63, (androidx.compose.ui.text.intl.LocaleList) r64, (long) r65, (androidx.compose.ui.text.style.TextDecoration) r67, (androidx.compose.ui.graphics.Shadow) r68, (androidx.compose.ui.text.style.TextAlign) r69, (androidx.compose.ui.text.style.TextDirection) r70, (long) r71, (androidx.compose.ui.text.style.TextIndent) r73, (androidx.compose.ui.text.PlatformTextStyle) r74, (androidx.compose.ui.text.style.LineHeightStyle) r75, (androidx.compose.ui.text.style.LineBreak) r76, (androidx.compose.ui.text.style.Hyphens) r77, (int) r78, (kotlin.jvm.internal.DefaultConstructorMarker) r79)
            androidx.compose.ui.text.TextStyle r23 = r0.merge((androidx.compose.ui.text.TextStyle) r1)
            androidx.compose.ui.graphics.SolidColor r0 = new androidx.compose.ui.graphics.SolidColor
            int r1 = r5 << 3
            r1 = r1 & 112(0x70, float:1.57E-43)
            r4 = 6
            r1 = r1 | r4
            r2 = 0
            androidx.compose.runtime.State r1 = r6.cursorColor$material3_release(r2, r8, r1)
            java.lang.Object r1 = r1.getValue()
            androidx.compose.ui.graphics.Color r1 = (androidx.compose.ui.graphics.Color) r1
            long r1 = r1.m2831unboximpl()
            r9 = 0
            r0.<init>(r1, r9)
            androidx.compose.foundation.text.KeyboardOptions r26 = new androidx.compose.foundation.text.KeyboardOptions
            r1 = 0
            r2 = 0
            r9 = 0
            androidx.compose.ui.text.input.ImeAction$Companion r14 = androidx.compose.ui.text.input.ImeAction.Companion
            int r14 = r14.m5297getSearcheUduSuo()
            r17 = 7
            r18 = 0
            r86 = r26
            r87 = r1
            r88 = r2
            r89 = r9
            r90 = r14
            r91 = r17
            r92 = r18
            r86.<init>(r87, r88, r89, r90, r91, r92)
            r36 = 0
            r37 = 0
            r38 = 0
            r39 = 0
            r1 = 511388516(0x1e7b2b64, float:1.3296802E-20)
            r8.startReplaceableGroup(r1)
            java.lang.String r1 = "CC(remember)P(1,2):Composables.kt#9igjgp"
            androidx.compose.runtime.ComposerKt.sourceInformation(r8, r1)
            boolean r1 = r8.changed((java.lang.Object) r13)
            boolean r2 = r8.changed((java.lang.Object) r15)
            r1 = r1 | r2
            java.lang.Object r2 = r8.rememberedValue()
            if (r1 != 0) goto L_0x0445
            androidx.compose.runtime.Composer$Companion r1 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r1 = r1.getEmpty()
            if (r2 != r1) goto L_0x0450
        L_0x0445:
            androidx.compose.material3.SearchBarKt$SearchBarInputField$4$1 r1 = new androidx.compose.material3.SearchBarKt$SearchBarInputField$4$1
            r1.<init>(r13, r15)
            r2 = r1
            kotlin.jvm.functions.Function1 r2 = (kotlin.jvm.functions.Function1) r2
            r8.updateRememberedValue(r2)
        L_0x0450:
            r8.endReplaceableGroup()
            r40 = r2
            kotlin.jvm.functions.Function1 r40 = (kotlin.jvm.functions.Function1) r40
            r41 = 0
            r42 = 47
            r43 = 0
            androidx.compose.foundation.text.KeyboardActions r35 = new androidx.compose.foundation.text.KeyboardActions
            r17 = r35
            r35.<init>(r36, r37, r38, r39, r40, r41, r42, r43)
            r14 = 0
            r9 = r3
            r18 = 1
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r24 = r0
            androidx.compose.ui.graphics.Brush r24 = (androidx.compose.ui.graphics.Brush) r24
            androidx.compose.material3.SearchBarKt$SearchBarInputField$5 r3 = new androidx.compose.material3.SearchBarKt$SearchBarInputField$5
            r0 = r3
            r27 = r93
            r1 = r81
            r2 = r30
            r14 = r3
            r3 = r34
            r28 = r4
            r4 = r31
            r49 = r5
            r5 = r32
            r35 = r6
            r6 = r33
            r36 = r7
            r7 = r35
            r15 = r8
            r8 = r27
            r10 = r9
            r9 = r49
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            r0 = 584727264(0x22da3ae0, float:5.9151355E-18)
            androidx.compose.runtime.internal.ComposableLambda r0 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(r15, r0, r10, r14)
            r25 = r0
            kotlin.jvm.functions.Function3 r25 = (kotlin.jvm.functions.Function3) r25
            r0 = r27 & 14
            r1 = 102236160(0x6180000, float:2.8588023E-35)
            r0 = r0 | r1
            r1 = r27 & 112(0x70, float:1.57E-43)
            r0 = r0 | r1
            int r1 = r27 >> 9
            r1 = r1 & 7168(0x1c00, float:1.0045E-41)
            r27 = r0 | r1
            int r0 = r49 << 6
            r0 = r0 & 7168(0x1c00, float:1.0045E-41)
            r28 = r0 | r48
            r29 = 7696(0x1e10, float:1.0784E-41)
            r10 = r81
            r11 = r82
            r12 = r16
            r13 = r30
            r0 = r15
            r15 = r23
            r16 = r26
            r23 = r34
            r26 = r0
            r14 = 0
            androidx.compose.foundation.text.BasicTextFieldKt.BasicTextField((java.lang.String) r10, (kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit>) r11, (androidx.compose.ui.Modifier) r12, (boolean) r13, (boolean) r14, (androidx.compose.ui.text.TextStyle) r15, (androidx.compose.foundation.text.KeyboardOptions) r16, (androidx.compose.foundation.text.KeyboardActions) r17, (boolean) r18, (int) r19, (int) r20, (androidx.compose.ui.text.input.VisualTransformation) r21, (kotlin.jvm.functions.Function1<? super androidx.compose.ui.text.TextLayoutResult, kotlin.Unit>) r22, (androidx.compose.foundation.interaction.MutableInteractionSource) r23, (androidx.compose.ui.graphics.Brush) r24, (kotlin.jvm.functions.Function3<? super kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>) r25, (androidx.compose.runtime.Composer) r26, (int) r27, (int) r28, (int) r29)
            boolean r1 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r1 == 0) goto L_0x04d8
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L_0x04d8:
            r7 = r30
            r8 = r31
            r9 = r32
            r10 = r33
            r12 = r34
            r11 = r35
            r6 = r36
        L_0x04e6:
            androidx.compose.runtime.ScopeUpdateScope r15 = r0.endRestartGroup()
            if (r15 != 0) goto L_0x04ed
            goto L_0x050f
        L_0x04ed:
            androidx.compose.material3.SearchBarKt$SearchBarInputField$6 r16 = new androidx.compose.material3.SearchBarKt$SearchBarInputField$6
            r0 = r16
            r1 = r81
            r2 = r82
            r3 = r83
            r4 = r84
            r5 = r85
            r13 = r94
            r14 = r95
            r80 = r15
            r15 = r96
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            r0 = r16
            kotlin.jvm.functions.Function2 r0 = (kotlin.jvm.functions.Function2) r0
            r1 = r80
            r1.updateScope(r0)
        L_0x050f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.SearchBarKt.SearchBarInputField(java.lang.String, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, boolean, kotlin.jvm.functions.Function1, androidx.compose.ui.Modifier, boolean, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, androidx.compose.material3.TextFieldColors, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.runtime.Composer, int, int, int):void");
    }

    static {
        CubicBezierEasing easingEmphasizedDecelerateCubicBezier = MotionTokens.INSTANCE.getEasingEmphasizedDecelerateCubicBezier();
        AnimationEnterEasing = easingEmphasizedDecelerateCubicBezier;
        CubicBezierEasing cubicBezierEasing = new CubicBezierEasing(0.0f, 1.0f, 0.0f, 1.0f);
        AnimationExitEasing = cubicBezierEasing;
        FiniteAnimationSpec<Float> tween = AnimationSpecKt.tween(AnimationEnterDurationMillis, 100, easingEmphasizedDecelerateCubicBezier);
        AnimationEnterFloatSpec = tween;
        FiniteAnimationSpec<Float> tween2 = AnimationSpecKt.tween(AnimationExitDurationMillis, 100, cubicBezierEasing);
        AnimationExitFloatSpec = tween2;
        FiniteAnimationSpec<IntSize> tween3 = AnimationSpecKt.tween(AnimationEnterDurationMillis, 100, easingEmphasizedDecelerateCubicBezier);
        AnimationEnterSizeSpec = tween3;
        FiniteAnimationSpec<IntSize> tween4 = AnimationSpecKt.tween(AnimationExitDurationMillis, 100, cubicBezierEasing);
        AnimationExitSizeSpec = tween4;
        DockedEnterTransition = EnterExitTransitionKt.fadeIn$default(tween, 0.0f, 2, (Object) null).plus(EnterExitTransitionKt.expandVertically$default(tween3, (Alignment.Vertical) null, false, (Function1) null, 14, (Object) null));
        DockedExitTransition = EnterExitTransitionKt.fadeOut$default(tween2, 0.0f, 2, (Object) null).plus(EnterExitTransitionKt.shrinkVertically$default(tween4, (Alignment.Vertical) null, false, (Function1) null, 14, (Object) null));
    }

    /* access modifiers changed from: private */
    public static final boolean SearchBar_Id_Pb_0$lambda$2(State<Boolean> state) {
        return state.getValue().booleanValue();
    }
}
