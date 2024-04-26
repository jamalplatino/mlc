package androidx.compose.material3;

import androidx.compose.animation.core.CubicBezierEasing;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.graphics.RenderEffect;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.layout.LayoutIdKt;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

@Metadata(d1 = {"\u0000¢\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0001\u0010\u0010\u001a\u00020\u00112\u001c\u0010\u0012\u001a\u0018\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00110\u0013¢\u0006\u0002\b\u0015¢\u0006\u0002\b\u00162\b\b\u0002\u0010\u0017\u001a\u00020\u00182\u0015\b\u0002\u0010\u0019\u001a\u000f\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u001a¢\u0006\u0002\b\u00152\b\b\u0002\u0010\u001b\u001a\u00020\u001c2\b\b\u0002\u0010\u001d\u001a\u00020\u001c2\b\b\u0002\u0010\u001e\u001a\u00020\u00012\b\b\u0002\u0010\u001f\u001a\u00020 2\b\b\u0002\u0010!\u001a\u00020\"H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b#\u0010$\u001ao\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0017\u001a\u00020\u00182\b\b\u0002\u0010\u001b\u001a\u00020\u001c2\b\b\u0002\u0010\u001d\u001a\u00020\u001c2\b\b\u0002\u0010\u001e\u001a\u00020\u00012\b\b\u0002\u0010\u001f\u001a\u00020 2\b\b\u0002\u0010!\u001a\u00020\"2\u001c\u0010%\u001a\u0018\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00110\u0013¢\u0006\u0002\b\u0015¢\u0006\u0002\b\u0016H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b&\u0010'\u001a\u0010(\u001a\u00020\u00112\u0011\u0010)\u001a\r\u0012\u0004\u0012\u00020\u00110\u001a¢\u0006\u0002\b\u00152\b\b\u0002\u0010\u0017\u001a\u00020\u00182\u0013\b\u0002\u0010*\u001a\r\u0012\u0004\u0012\u00020\u00110\u001a¢\u0006\u0002\b\u00152\u001e\b\u0002\u0010\u0012\u001a\u0018\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00110\u0013¢\u0006\u0002\b\u0015¢\u0006\u0002\b\u00162\b\b\u0002\u0010!\u001a\u00020\"2\b\b\u0002\u0010+\u001a\u00020,2\n\b\u0002\u0010-\u001a\u0004\u0018\u00010.H\u0007¢\u0006\u0002\u0010/\u001a\u00100\u001a\u00020\u00112\u0011\u0010)\u001a\r\u0012\u0004\u0012\u00020\u00110\u001a¢\u0006\u0002\b\u00152\b\b\u0002\u0010\u0017\u001a\u00020\u00182\u0013\b\u0002\u0010*\u001a\r\u0012\u0004\u0012\u00020\u00110\u001a¢\u0006\u0002\b\u00152\u001e\b\u0002\u0010\u0012\u001a\u0018\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00110\u0013¢\u0006\u0002\b\u0015¢\u0006\u0002\b\u00162\b\b\u0002\u0010!\u001a\u00020\"2\b\b\u0002\u0010+\u001a\u00020,2\n\b\u0002\u0010-\u001a\u0004\u0018\u00010.H\u0007¢\u0006\u0002\u0010/\u001a\u00101\u001a\u00020\u00112\u0011\u0010)\u001a\r\u0012\u0004\u0012\u00020\u00110\u001a¢\u0006\u0002\b\u00152\b\b\u0002\u0010\u0017\u001a\u00020\u00182\u0013\b\u0002\u0010*\u001a\r\u0012\u0004\u0012\u00020\u00110\u001a¢\u0006\u0002\b\u00152\u001e\b\u0002\u0010\u0012\u001a\u0018\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00110\u0013¢\u0006\u0002\b\u0015¢\u0006\u0002\b\u00162\b\b\u0002\u0010!\u001a\u00020\"2\b\b\u0002\u0010+\u001a\u00020,2\n\b\u0002\u0010-\u001a\u0004\u0018\u00010.H\u0007¢\u0006\u0002\u0010/\u001a\u0001\u00102\u001a\u00020\u00112\b\b\u0002\u0010\u0017\u001a\u00020\u00182\u0011\u0010)\u001a\r\u0012\u0004\u0012\u00020\u00110\u001a¢\u0006\u0002\b\u00152\u0006\u00103\u001a\u0002042\u0006\u00105\u001a\u0002062\u0011\u0010*\u001a\r\u0012\u0004\u0012\u00020\u00110\u001a¢\u0006\u0002\b\u00152\u001c\u0010\u0012\u001a\u0018\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00110\u0013¢\u0006\u0002\b\u0015¢\u0006\u0002\b\u00162\u0006\u0010!\u001a\u00020\"2\u0006\u0010+\u001a\u00020,2\b\u0010-\u001a\u0004\u0018\u00010.H\u0003¢\u0006\u0002\u00107\u001a\u00108\u001a\u00020\u00112\u0011\u0010)\u001a\r\u0012\u0004\u0012\u00020\u00110\u001a¢\u0006\u0002\b\u00152\b\b\u0002\u0010\u0017\u001a\u00020\u00182\u0013\b\u0002\u0010*\u001a\r\u0012\u0004\u0012\u00020\u00110\u001a¢\u0006\u0002\b\u00152\u001e\b\u0002\u0010\u0012\u001a\u0018\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00110\u0013¢\u0006\u0002\b\u0015¢\u0006\u0002\b\u00162\b\b\u0002\u0010!\u001a\u00020\"2\b\b\u0002\u0010+\u001a\u00020,2\n\b\u0002\u0010-\u001a\u0004\u0018\u00010.H\u0007¢\u0006\u0002\u0010/\u001a\u00109\u001a\u00020\u00112\u0011\u0010)\u001a\r\u0012\u0004\u0012\u00020\u00110\u001a¢\u0006\u0002\b\u00152\b\b\u0002\u0010\u0017\u001a\u00020\u00182\u0013\b\u0002\u0010*\u001a\r\u0012\u0004\u0012\u00020\u00110\u001a¢\u0006\u0002\b\u00152\u001e\b\u0002\u0010\u0012\u001a\u0018\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00110\u0013¢\u0006\u0002\b\u0015¢\u0006\u0002\b\u00162\b\b\u0002\u0010!\u001a\u00020\"2\b\b\u0002\u0010+\u001a\u00020,2\n\b\u0002\u0010-\u001a\u0004\u0018\u00010.H\u0007¢\u0006\u0002\u0010/\u001a¦\u0001\u0010:\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010;\u001a\u00020<2\u0006\u0010=\u001a\u00020\u001c2\u0006\u0010>\u001a\u00020\u001c2\u0006\u0010?\u001a\u00020\u001c2\u0011\u0010)\u001a\r\u0012\u0004\u0012\u00020\u00110\u001a¢\u0006\u0002\b\u00152\u0006\u00103\u001a\u0002042\u0006\u0010@\u001a\u00020<2\u0006\u0010A\u001a\u00020B2\u0006\u0010C\u001a\u00020D2\u0006\u0010E\u001a\u00020F2\u0006\u0010G\u001a\u0002062\u0011\u0010*\u001a\r\u0012\u0004\u0012\u00020\u00110\u001a¢\u0006\u0002\b\u00152\u0011\u0010\u0012\u001a\r\u0012\u0004\u0012\u00020\u00110\u001a¢\u0006\u0002\b\u0015H\u0003ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bH\u0010I\u001a¸\u0001\u0010J\u001a\u00020\u00112\b\b\u0002\u0010\u0017\u001a\u00020\u00182\u0011\u0010)\u001a\r\u0012\u0004\u0012\u00020\u00110\u001a¢\u0006\u0002\b\u00152\u0006\u00103\u001a\u0002042\u0006\u0010E\u001a\u00020\u00012\u0011\u0010K\u001a\r\u0012\u0004\u0012\u00020\u00110\u001a¢\u0006\u0002\b\u00152\u0006\u0010L\u001a\u0002042\u0011\u0010*\u001a\r\u0012\u0004\u0012\u00020\u00110\u001a¢\u0006\u0002\b\u00152\u001c\u0010\u0012\u001a\u0018\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00110\u0013¢\u0006\u0002\b\u0015¢\u0006\u0002\b\u00162\u0006\u0010!\u001a\u00020\"2\u0006\u0010+\u001a\u00020,2\u0006\u0010M\u001a\u00020\u00012\u0006\u0010N\u001a\u00020\u00012\b\u0010-\u001a\u0004\u0018\u00010.H\u0003ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bO\u0010P\u001a+\u0010Q\u001a\u00020R2\b\b\u0002\u0010S\u001a\u00020<2\b\b\u0002\u0010T\u001a\u00020<2\b\b\u0002\u0010U\u001a\u00020<H\u0007¢\u0006\u0002\u0010V\u001aD\u0010W\u001a\u00020X2\u0006\u0010Y\u001a\u00020R2\u0006\u0010Z\u001a\u00020<2\u000e\u0010[\u001a\n\u0012\u0004\u0012\u00020<\u0018\u00010\\2\u000e\u0010]\u001a\n\u0012\u0004\u0012\u00020<\u0018\u00010^H@ø\u0001\u0000ø\u0001\u0000¢\u0006\u0002\u0010_\"\u0013\u0010\u0000\u001a\u00020\u0001X\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0002\"\u0019\u0010\u0003\u001a\u00020\u0001X\u0004ø\u0001\u0000¢\u0006\n\n\u0002\u0010\u0002\u001a\u0004\b\u0004\u0010\u0005\"\u0013\u0010\u0006\u001a\u00020\u0001X\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0002\"\u0013\u0010\u0007\u001a\u00020\u0001X\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0002\"\u0013\u0010\b\u001a\u00020\u0001X\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0002\"\u0013\u0010\t\u001a\u00020\u0001X\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0002\"\u0013\u0010\n\u001a\u00020\u0001X\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0002\"\u0013\u0010\u000b\u001a\u00020\u0001X\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0002\"\u0014\u0010\f\u001a\u00020\rX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006`"}, d2 = {"BottomAppBarHorizontalPadding", "Landroidx/compose/ui/unit/Dp;", "F", "BottomAppBarVerticalPadding", "getBottomAppBarVerticalPadding", "()F", "FABHorizontalPadding", "FABVerticalPadding", "LargeTitleBottomPadding", "MediumTitleBottomPadding", "TopAppBarHorizontalPadding", "TopAppBarTitleInset", "TopTitleAlphaEasing", "Landroidx/compose/animation/core/CubicBezierEasing;", "getTopTitleAlphaEasing", "()Landroidx/compose/animation/core/CubicBezierEasing;", "BottomAppBar", "", "actions", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/RowScope;", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "modifier", "Landroidx/compose/ui/Modifier;", "floatingActionButton", "Lkotlin/Function0;", "containerColor", "Landroidx/compose/ui/graphics/Color;", "contentColor", "tonalElevation", "contentPadding", "Landroidx/compose/foundation/layout/PaddingValues;", "windowInsets", "Landroidx/compose/foundation/layout/WindowInsets;", "BottomAppBar-Snr_uVM", "(Lkotlin/jvm/functions/Function3;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;JJFLandroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/foundation/layout/WindowInsets;Landroidx/compose/runtime/Composer;II)V", "content", "BottomAppBar-1oL4kX8", "(Landroidx/compose/ui/Modifier;JJFLandroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/foundation/layout/WindowInsets;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "CenterAlignedTopAppBar", "title", "navigationIcon", "colors", "Landroidx/compose/material3/TopAppBarColors;", "scrollBehavior", "Landroidx/compose/material3/TopAppBarScrollBehavior;", "(Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;Landroidx/compose/foundation/layout/WindowInsets;Landroidx/compose/material3/TopAppBarColors;Landroidx/compose/material3/TopAppBarScrollBehavior;Landroidx/compose/runtime/Composer;II)V", "LargeTopAppBar", "MediumTopAppBar", "SingleRowTopAppBar", "titleTextStyle", "Landroidx/compose/ui/text/TextStyle;", "centeredTitle", "", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/text/TextStyle;ZLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;Landroidx/compose/foundation/layout/WindowInsets;Landroidx/compose/material3/TopAppBarColors;Landroidx/compose/material3/TopAppBarScrollBehavior;Landroidx/compose/runtime/Composer;II)V", "SmallTopAppBar", "TopAppBar", "TopAppBarLayout", "heightPx", "", "navigationIconContentColor", "titleContentColor", "actionIconContentColor", "titleAlpha", "titleVerticalArrangement", "Landroidx/compose/foundation/layout/Arrangement$Vertical;", "titleHorizontalArrangement", "Landroidx/compose/foundation/layout/Arrangement$Horizontal;", "titleBottomPadding", "", "hideTitleSemantics", "TopAppBarLayout-kXwM9vE", "(Landroidx/compose/ui/Modifier;FJJJLkotlin/jvm/functions/Function2;Landroidx/compose/ui/text/TextStyle;FLandroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/foundation/layout/Arrangement$Horizontal;IZLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "TwoRowsTopAppBar", "smallTitle", "smallTitleTextStyle", "maxHeight", "pinnedHeight", "TwoRowsTopAppBar-tjU4iQQ", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/text/TextStyle;FLkotlin/jvm/functions/Function2;Landroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;Landroidx/compose/foundation/layout/WindowInsets;Landroidx/compose/material3/TopAppBarColors;FFLandroidx/compose/material3/TopAppBarScrollBehavior;Landroidx/compose/runtime/Composer;III)V", "rememberTopAppBarState", "Landroidx/compose/material3/TopAppBarState;", "initialHeightOffsetLimit", "initialHeightOffset", "initialContentOffset", "(FFFLandroidx/compose/runtime/Composer;II)Landroidx/compose/material3/TopAppBarState;", "settleAppBar", "Landroidx/compose/ui/unit/Velocity;", "state", "velocity", "flingAnimationSpec", "Landroidx/compose/animation/core/DecayAnimationSpec;", "snapAnimationSpec", "Landroidx/compose/animation/core/AnimationSpec;", "(Landroidx/compose/material3/TopAppBarState;FLandroidx/compose/animation/core/DecayAnimationSpec;Landroidx/compose/animation/core/AnimationSpec;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: AppBar.kt */
public final class AppBarKt {
    /* access modifiers changed from: private */
    public static final float BottomAppBarHorizontalPadding;
    private static final float BottomAppBarVerticalPadding;
    /* access modifiers changed from: private */
    public static final float FABHorizontalPadding;
    /* access modifiers changed from: private */
    public static final float FABVerticalPadding;
    private static final float LargeTitleBottomPadding = Dp.m5626constructorimpl((float) 28);
    private static final float MediumTitleBottomPadding = Dp.m5626constructorimpl((float) 24);
    private static final float TopAppBarHorizontalPadding;
    /* access modifiers changed from: private */
    public static final float TopAppBarTitleInset;
    private static final CubicBezierEasing TopTitleAlphaEasing = new CubicBezierEasing(0.8f, 0.0f, 0.8f, 0.15f);

    public static final float getBottomAppBarVerticalPadding() {
        return BottomAppBarVerticalPadding;
    }

    public static final CubicBezierEasing getTopTitleAlphaEasing() {
        return TopTitleAlphaEasing;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v0, resolved type: kotlin.jvm.functions.Function3<? super androidx.compose.foundation.layout.RowScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v4, resolved type: kotlin.jvm.functions.Function3<? super androidx.compose.foundation.layout.RowScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v5, resolved type: kotlin.jvm.functions.Function3<androidx.compose.foundation.layout.RowScope, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v7, resolved type: kotlin.jvm.functions.Function3<? super androidx.compose.foundation.layout.RowScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v9, resolved type: kotlin.jvm.functions.Function3<? super androidx.compose.foundation.layout.RowScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x01f6  */
    /* JADX WARNING: Removed duplicated region for block: B:122:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x008a  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x009f  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00a7  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00bc  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00c4  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x00c8  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x00ef  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x00fc  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void TopAppBar(kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r30, androidx.compose.ui.Modifier r31, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r32, kotlin.jvm.functions.Function3<? super androidx.compose.foundation.layout.RowScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r33, androidx.compose.foundation.layout.WindowInsets r34, androidx.compose.material3.TopAppBarColors r35, androidx.compose.material3.TopAppBarScrollBehavior r36, androidx.compose.runtime.Composer r37, int r38, int r39) {
        /*
            r12 = r30
            r13 = r38
            java.lang.String r0 = "title"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r0)
            r0 = 1906353009(0x71a0a371, float:1.5908861E30)
            r1 = r37
            androidx.compose.runtime.Composer r11 = r1.startRestartGroup(r0)
            java.lang.String r1 = "C(TopAppBar)P(5,2,3!1,6)125@6259L12,126@6321L17,132@6511L10,129@6400L374:AppBar.kt#uh7d8r"
            androidx.compose.runtime.ComposerKt.sourceInformation(r11, r1)
            r1 = r39 & 1
            if (r1 == 0) goto L_0x001f
            r1 = r13 | 6
            goto L_0x002f
        L_0x001f:
            r1 = r13 & 14
            if (r1 != 0) goto L_0x002e
            boolean r1 = r11.changedInstance(r12)
            if (r1 == 0) goto L_0x002b
            r1 = 4
            goto L_0x002c
        L_0x002b:
            r1 = 2
        L_0x002c:
            r1 = r1 | r13
            goto L_0x002f
        L_0x002e:
            r1 = r13
        L_0x002f:
            r2 = r39 & 2
            if (r2 == 0) goto L_0x0036
            r1 = r1 | 48
            goto L_0x0049
        L_0x0036:
            r3 = r13 & 112(0x70, float:1.57E-43)
            if (r3 != 0) goto L_0x0049
            r3 = r31
            boolean r4 = r11.changed((java.lang.Object) r3)
            if (r4 == 0) goto L_0x0045
            r4 = 32
            goto L_0x0047
        L_0x0045:
            r4 = 16
        L_0x0047:
            r1 = r1 | r4
            goto L_0x004b
        L_0x0049:
            r3 = r31
        L_0x004b:
            r4 = r39 & 4
            if (r4 == 0) goto L_0x0052
            r1 = r1 | 384(0x180, float:5.38E-43)
            goto L_0x0065
        L_0x0052:
            r5 = r13 & 896(0x380, float:1.256E-42)
            if (r5 != 0) goto L_0x0065
            r5 = r32
            boolean r6 = r11.changedInstance(r5)
            if (r6 == 0) goto L_0x0061
            r6 = 256(0x100, float:3.59E-43)
            goto L_0x0063
        L_0x0061:
            r6 = 128(0x80, float:1.794E-43)
        L_0x0063:
            r1 = r1 | r6
            goto L_0x0067
        L_0x0065:
            r5 = r32
        L_0x0067:
            r6 = r39 & 8
            if (r6 == 0) goto L_0x006e
            r1 = r1 | 3072(0xc00, float:4.305E-42)
            goto L_0x0081
        L_0x006e:
            r7 = r13 & 7168(0x1c00, float:1.0045E-41)
            if (r7 != 0) goto L_0x0081
            r7 = r33
            boolean r8 = r11.changedInstance(r7)
            if (r8 == 0) goto L_0x007d
            r8 = 2048(0x800, float:2.87E-42)
            goto L_0x007f
        L_0x007d:
            r8 = 1024(0x400, float:1.435E-42)
        L_0x007f:
            r1 = r1 | r8
            goto L_0x0083
        L_0x0081:
            r7 = r33
        L_0x0083:
            r8 = 57344(0xe000, float:8.0356E-41)
            r9 = r13 & r8
            if (r9 != 0) goto L_0x009f
            r9 = r39 & 16
            if (r9 != 0) goto L_0x0099
            r9 = r34
            boolean r10 = r11.changed((java.lang.Object) r9)
            if (r10 == 0) goto L_0x009b
            r10 = 16384(0x4000, float:2.2959E-41)
            goto L_0x009d
        L_0x0099:
            r9 = r34
        L_0x009b:
            r10 = 8192(0x2000, float:1.14794E-41)
        L_0x009d:
            r1 = r1 | r10
            goto L_0x00a1
        L_0x009f:
            r9 = r34
        L_0x00a1:
            r10 = 458752(0x70000, float:6.42848E-40)
            r14 = r13 & r10
            if (r14 != 0) goto L_0x00bc
            r14 = r39 & 32
            if (r14 != 0) goto L_0x00b6
            r14 = r35
            boolean r15 = r11.changed((java.lang.Object) r14)
            if (r15 == 0) goto L_0x00b8
            r15 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00ba
        L_0x00b6:
            r14 = r35
        L_0x00b8:
            r15 = 65536(0x10000, float:9.18355E-41)
        L_0x00ba:
            r1 = r1 | r15
            goto L_0x00be
        L_0x00bc:
            r14 = r35
        L_0x00be:
            r28 = r39 & 64
            r29 = 3670016(0x380000, float:5.142788E-39)
            if (r28 == 0) goto L_0x00c8
            r15 = 1572864(0x180000, float:2.204052E-39)
            r1 = r1 | r15
            goto L_0x00dc
        L_0x00c8:
            r15 = r13 & r29
            if (r15 != 0) goto L_0x00dc
            r15 = r36
            boolean r16 = r11.changed((java.lang.Object) r15)
            if (r16 == 0) goto L_0x00d7
            r16 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00d9
        L_0x00d7:
            r16 = 524288(0x80000, float:7.34684E-40)
        L_0x00d9:
            r1 = r1 | r16
            goto L_0x00de
        L_0x00dc:
            r15 = r36
        L_0x00de:
            r16 = 2995931(0x2db6db, float:4.198194E-39)
            r10 = r1 & r16
            r8 = 599186(0x92492, float:8.39638E-40)
            if (r10 != r8) goto L_0x00fc
            boolean r8 = r11.getSkipping()
            if (r8 != 0) goto L_0x00ef
            goto L_0x00fc
        L_0x00ef:
            r11.skipToGroupEnd()
            r2 = r3
            r3 = r5
            r4 = r7
            r5 = r9
            r21 = r11
            r6 = r14
            r7 = r15
            goto L_0x01ef
        L_0x00fc:
            r11.startDefaults()
            r8 = r13 & 1
            r10 = -458753(0xfffffffffff8ffff, float:NaN)
            r16 = -57345(0xffffffffffff1fff, float:NaN)
            r0 = 6
            if (r8 == 0) goto L_0x012a
            boolean r8 = r11.getDefaultsInvalid()
            if (r8 == 0) goto L_0x0111
            goto L_0x012a
        L_0x0111:
            r11.skipToGroupEnd()
            r2 = r39 & 16
            if (r2 == 0) goto L_0x011a
            r1 = r1 & r16
        L_0x011a:
            r2 = r39 & 32
            if (r2 == 0) goto L_0x011f
            r1 = r1 & r10
        L_0x011f:
            r16 = r7
            r17 = r9
            r18 = r14
            r19 = r15
            r14 = r3
            r15 = r5
            goto L_0x0180
        L_0x012a:
            if (r2 == 0) goto L_0x0131
            androidx.compose.ui.Modifier$Companion r2 = androidx.compose.ui.Modifier.Companion
            androidx.compose.ui.Modifier r2 = (androidx.compose.ui.Modifier) r2
            goto L_0x0132
        L_0x0131:
            r2 = r3
        L_0x0132:
            if (r4 == 0) goto L_0x013b
            androidx.compose.material3.ComposableSingletons$AppBarKt r3 = androidx.compose.material3.ComposableSingletons$AppBarKt.INSTANCE
            kotlin.jvm.functions.Function2 r3 = r3.m1248getLambda1$material3_release()
            goto L_0x013c
        L_0x013b:
            r3 = r5
        L_0x013c:
            if (r6 == 0) goto L_0x0145
            androidx.compose.material3.ComposableSingletons$AppBarKt r4 = androidx.compose.material3.ComposableSingletons$AppBarKt.INSTANCE
            kotlin.jvm.functions.Function3 r4 = r4.m1252getLambda2$material3_release()
            r7 = r4
        L_0x0145:
            r4 = r39 & 16
            if (r4 == 0) goto L_0x0152
            androidx.compose.material3.TopAppBarDefaults r4 = androidx.compose.material3.TopAppBarDefaults.INSTANCE
            androidx.compose.foundation.layout.WindowInsets r4 = r4.getWindowInsets(r11, r0)
            r1 = r1 & r16
            r9 = r4
        L_0x0152:
            r4 = r39 & 32
            if (r4 == 0) goto L_0x016f
            androidx.compose.material3.TopAppBarDefaults r14 = androidx.compose.material3.TopAppBarDefaults.INSTANCE
            r4 = 0
            r17 = 0
            r19 = 0
            r21 = 0
            r23 = 0
            r26 = 196608(0x30000, float:2.75506E-40)
            r27 = 31
            r15 = r4
            r25 = r11
            androidx.compose.material3.TopAppBarColors r4 = r14.m1854topAppBarColorszjMxDiM(r15, r17, r19, r21, r23, r25, r26, r27)
            r1 = r1 & r10
            r14 = r4
        L_0x016f:
            if (r28 == 0) goto L_0x0176
            r4 = 0
            r15 = r3
            r19 = r4
            goto L_0x0179
        L_0x0176:
            r19 = r36
            r15 = r3
        L_0x0179:
            r16 = r7
            r17 = r9
            r18 = r14
            r14 = r2
        L_0x0180:
            r11.endDefaults()
            boolean r2 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r2 == 0) goto L_0x0193
            r2 = -1
            java.lang.String r3 = "androidx.compose.material3.TopAppBar (AppBar.kt:120)"
            r4 = 1906353009(0x71a0a371, float:1.5908861E30)
            androidx.compose.runtime.ComposerKt.traceEventStart(r4, r1, r2, r3)
        L_0x0193:
            androidx.compose.material3.MaterialTheme r2 = androidx.compose.material3.MaterialTheme.INSTANCE
            androidx.compose.material3.Typography r2 = r2.getTypography(r11, r0)
            androidx.compose.material3.tokens.TopAppBarSmallTokens r3 = androidx.compose.material3.tokens.TopAppBarSmallTokens.INSTANCE
            androidx.compose.material3.tokens.TypographyKeyTokens r3 = r3.getHeadlineFont()
            androidx.compose.ui.text.TextStyle r2 = androidx.compose.material3.TypographyKt.fromToken(r2, r3)
            r3 = 0
            int r4 = r1 >> 3
            r4 = r4 & 14
            r4 = r4 | 3072(0xc00, float:4.305E-42)
            int r5 = r1 << 3
            r5 = r5 & 112(0x70, float:1.57E-43)
            r4 = r4 | r5
            int r0 = r1 << 6
            r1 = 57344(0xe000, float:8.0356E-41)
            r1 = r1 & r0
            r1 = r1 | r4
            r4 = 458752(0x70000, float:6.42848E-40)
            r4 = r4 & r0
            r1 = r1 | r4
            r4 = r0 & r29
            r1 = r1 | r4
            r4 = 29360128(0x1c00000, float:7.052966E-38)
            r4 = r4 & r0
            r1 = r1 | r4
            r4 = 234881024(0xe000000, float:1.5777218E-30)
            r0 = r0 & r4
            r10 = r1 | r0
            r20 = 0
            r0 = r14
            r1 = r30
            r4 = r15
            r5 = r16
            r6 = r17
            r7 = r18
            r8 = r19
            r9 = r11
            r21 = r11
            r11 = r20
            SingleRowTopAppBar(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto L_0x01e5
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L_0x01e5:
            r2 = r14
            r3 = r15
            r4 = r16
            r5 = r17
            r6 = r18
            r7 = r19
        L_0x01ef:
            androidx.compose.runtime.ScopeUpdateScope r10 = r21.endRestartGroup()
            if (r10 != 0) goto L_0x01f6
            goto L_0x0207
        L_0x01f6:
            androidx.compose.material3.AppBarKt$TopAppBar$1 r11 = new androidx.compose.material3.AppBarKt$TopAppBar$1
            r0 = r11
            r1 = r30
            r8 = r38
            r9 = r39
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            kotlin.jvm.functions.Function2 r11 = (kotlin.jvm.functions.Function2) r11
            r10.updateScope(r11)
        L_0x0207:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.AppBarKt.TopAppBar(kotlin.jvm.functions.Function2, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function3, androidx.compose.foundation.layout.WindowInsets, androidx.compose.material3.TopAppBarColors, androidx.compose.material3.TopAppBarScrollBehavior, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v0, resolved type: kotlin.jvm.functions.Function3<? super androidx.compose.foundation.layout.RowScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v4, resolved type: kotlin.jvm.functions.Function3<? super androidx.compose.foundation.layout.RowScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v5, resolved type: kotlin.jvm.functions.Function3<androidx.compose.foundation.layout.RowScope, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v7, resolved type: kotlin.jvm.functions.Function3<? super androidx.compose.foundation.layout.RowScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v9, resolved type: kotlin.jvm.functions.Function3<? super androidx.compose.foundation.layout.RowScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x01cf  */
    /* JADX WARNING: Removed duplicated region for block: B:122:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x008a  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x009f  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00a7  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00bc  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00c4  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x00ca  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x00ec  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x00f9  */
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.WARNING, message = "Use TopAppBar instead.", replaceWith = @kotlin.ReplaceWith(expression = "TopAppBar(title, modifier, navigationIcon, actions, windowInsets, colors, scrollBehavior)", imports = {}))
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void SmallTopAppBar(kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r30, androidx.compose.ui.Modifier r31, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r32, kotlin.jvm.functions.Function3<? super androidx.compose.foundation.layout.RowScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r33, androidx.compose.foundation.layout.WindowInsets r34, androidx.compose.material3.TopAppBarColors r35, androidx.compose.material3.TopAppBarScrollBehavior r36, androidx.compose.runtime.Composer r37, int r38, int r39) {
        /*
            r10 = r30
            r11 = r38
            java.lang.String r0 = "title"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            r0 = -1967617284(0xffffffff8ab88afc, float:-1.7770836E-32)
            r1 = r37
            androidx.compose.runtime.Composer r9 = r1.startRestartGroup(r0)
            java.lang.String r1 = "C(SmallTopAppBar)P(5,2,3!1,6)188@9238L12,189@9300L17,191@9375L89:AppBar.kt#uh7d8r"
            androidx.compose.runtime.ComposerKt.sourceInformation(r9, r1)
            r1 = r39 & 1
            if (r1 == 0) goto L_0x001f
            r1 = r11 | 6
            goto L_0x002f
        L_0x001f:
            r1 = r11 & 14
            if (r1 != 0) goto L_0x002e
            boolean r1 = r9.changedInstance(r10)
            if (r1 == 0) goto L_0x002b
            r1 = 4
            goto L_0x002c
        L_0x002b:
            r1 = 2
        L_0x002c:
            r1 = r1 | r11
            goto L_0x002f
        L_0x002e:
            r1 = r11
        L_0x002f:
            r2 = r39 & 2
            if (r2 == 0) goto L_0x0036
            r1 = r1 | 48
            goto L_0x0049
        L_0x0036:
            r3 = r11 & 112(0x70, float:1.57E-43)
            if (r3 != 0) goto L_0x0049
            r3 = r31
            boolean r4 = r9.changed((java.lang.Object) r3)
            if (r4 == 0) goto L_0x0045
            r4 = 32
            goto L_0x0047
        L_0x0045:
            r4 = 16
        L_0x0047:
            r1 = r1 | r4
            goto L_0x004b
        L_0x0049:
            r3 = r31
        L_0x004b:
            r4 = r39 & 4
            if (r4 == 0) goto L_0x0052
            r1 = r1 | 384(0x180, float:5.38E-43)
            goto L_0x0065
        L_0x0052:
            r5 = r11 & 896(0x380, float:1.256E-42)
            if (r5 != 0) goto L_0x0065
            r5 = r32
            boolean r6 = r9.changedInstance(r5)
            if (r6 == 0) goto L_0x0061
            r6 = 256(0x100, float:3.59E-43)
            goto L_0x0063
        L_0x0061:
            r6 = 128(0x80, float:1.794E-43)
        L_0x0063:
            r1 = r1 | r6
            goto L_0x0067
        L_0x0065:
            r5 = r32
        L_0x0067:
            r6 = r39 & 8
            if (r6 == 0) goto L_0x006e
            r1 = r1 | 3072(0xc00, float:4.305E-42)
            goto L_0x0081
        L_0x006e:
            r7 = r11 & 7168(0x1c00, float:1.0045E-41)
            if (r7 != 0) goto L_0x0081
            r7 = r33
            boolean r8 = r9.changedInstance(r7)
            if (r8 == 0) goto L_0x007d
            r8 = 2048(0x800, float:2.87E-42)
            goto L_0x007f
        L_0x007d:
            r8 = 1024(0x400, float:1.435E-42)
        L_0x007f:
            r1 = r1 | r8
            goto L_0x0083
        L_0x0081:
            r7 = r33
        L_0x0083:
            r8 = 57344(0xe000, float:8.0356E-41)
            r12 = r11 & r8
            if (r12 != 0) goto L_0x009f
            r12 = r39 & 16
            if (r12 != 0) goto L_0x0099
            r12 = r34
            boolean r13 = r9.changed((java.lang.Object) r12)
            if (r13 == 0) goto L_0x009b
            r13 = 16384(0x4000, float:2.2959E-41)
            goto L_0x009d
        L_0x0099:
            r12 = r34
        L_0x009b:
            r13 = 8192(0x2000, float:1.14794E-41)
        L_0x009d:
            r1 = r1 | r13
            goto L_0x00a1
        L_0x009f:
            r12 = r34
        L_0x00a1:
            r26 = 458752(0x70000, float:6.42848E-40)
            r13 = r11 & r26
            if (r13 != 0) goto L_0x00bc
            r13 = r39 & 32
            if (r13 != 0) goto L_0x00b6
            r13 = r35
            boolean r14 = r9.changed((java.lang.Object) r13)
            if (r14 == 0) goto L_0x00b8
            r14 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00ba
        L_0x00b6:
            r13 = r35
        L_0x00b8:
            r14 = 65536(0x10000, float:9.18355E-41)
        L_0x00ba:
            r1 = r1 | r14
            goto L_0x00be
        L_0x00bc:
            r13 = r35
        L_0x00be:
            r27 = r39 & 64
            r28 = 3670016(0x380000, float:5.142788E-39)
            if (r27 == 0) goto L_0x00ca
            r14 = 1572864(0x180000, float:2.204052E-39)
            r1 = r1 | r14
            r15 = r36
            goto L_0x00dc
        L_0x00ca:
            r14 = r11 & r28
            r15 = r36
            if (r14 != 0) goto L_0x00dc
            boolean r14 = r9.changed((java.lang.Object) r15)
            if (r14 == 0) goto L_0x00d9
            r14 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00db
        L_0x00d9:
            r14 = 524288(0x80000, float:7.34684E-40)
        L_0x00db:
            r1 = r1 | r14
        L_0x00dc:
            r14 = 2995931(0x2db6db, float:4.198194E-39)
            r14 = r14 & r1
            r8 = 599186(0x92492, float:8.39638E-40)
            if (r14 != r8) goto L_0x00f9
            boolean r8 = r9.getSkipping()
            if (r8 != 0) goto L_0x00ec
            goto L_0x00f9
        L_0x00ec:
            r9.skipToGroupEnd()
            r2 = r3
            r3 = r5
            r4 = r7
            r19 = r9
            r5 = r12
            r6 = r13
            r7 = r15
            goto L_0x01c8
        L_0x00f9:
            r9.startDefaults()
            r8 = r11 & 1
            r29 = -458753(0xfffffffffff8ffff, float:NaN)
            r14 = -57345(0xffffffffffff1fff, float:NaN)
            if (r8 == 0) goto L_0x0125
            boolean r8 = r9.getDefaultsInvalid()
            if (r8 == 0) goto L_0x010d
            goto L_0x0125
        L_0x010d:
            r9.skipToGroupEnd()
            r2 = r39 & 16
            if (r2 == 0) goto L_0x0115
            r1 = r1 & r14
        L_0x0115:
            r2 = r39 & 32
            if (r2 == 0) goto L_0x011b
            r1 = r1 & r29
        L_0x011b:
            r14 = r7
            r16 = r13
            r17 = r15
            r13 = r5
            r15 = r12
            r12 = r3
            goto L_0x017c
        L_0x0125:
            if (r2 == 0) goto L_0x012c
            androidx.compose.ui.Modifier$Companion r2 = androidx.compose.ui.Modifier.Companion
            androidx.compose.ui.Modifier r2 = (androidx.compose.ui.Modifier) r2
            goto L_0x012d
        L_0x012c:
            r2 = r3
        L_0x012d:
            if (r4 == 0) goto L_0x0136
            androidx.compose.material3.ComposableSingletons$AppBarKt r3 = androidx.compose.material3.ComposableSingletons$AppBarKt.INSTANCE
            kotlin.jvm.functions.Function2 r3 = r3.m1253getLambda3$material3_release()
            goto L_0x0137
        L_0x0136:
            r3 = r5
        L_0x0137:
            if (r6 == 0) goto L_0x0140
            androidx.compose.material3.ComposableSingletons$AppBarKt r4 = androidx.compose.material3.ComposableSingletons$AppBarKt.INSTANCE
            kotlin.jvm.functions.Function3 r4 = r4.m1254getLambda4$material3_release()
            r7 = r4
        L_0x0140:
            r4 = r39 & 16
            if (r4 == 0) goto L_0x014d
            androidx.compose.material3.TopAppBarDefaults r4 = androidx.compose.material3.TopAppBarDefaults.INSTANCE
            r5 = 6
            androidx.compose.foundation.layout.WindowInsets r4 = r4.getWindowInsets(r9, r5)
            r1 = r1 & r14
            goto L_0x014e
        L_0x014d:
            r4 = r12
        L_0x014e:
            r5 = r39 & 32
            if (r5 == 0) goto L_0x016c
            androidx.compose.material3.TopAppBarDefaults r12 = androidx.compose.material3.TopAppBarDefaults.INSTANCE
            r13 = 0
            r5 = 0
            r17 = 0
            r19 = 0
            r21 = 0
            r24 = 196608(0x30000, float:2.75506E-40)
            r25 = 31
            r15 = r5
            r23 = r9
            androidx.compose.material3.TopAppBarColors r5 = r12.m1854topAppBarColorszjMxDiM(r13, r15, r17, r19, r21, r23, r24, r25)
            r1 = r1 & r29
            r13 = r5
        L_0x016c:
            if (r27 == 0) goto L_0x0174
            r5 = 0
            r12 = r2
            r15 = r4
            r17 = r5
            goto L_0x0178
        L_0x0174:
            r17 = r36
            r12 = r2
            r15 = r4
        L_0x0178:
            r14 = r7
            r16 = r13
            r13 = r3
        L_0x017c:
            r9.endDefaults()
            boolean r2 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r2 == 0) goto L_0x018c
            r2 = -1
            java.lang.String r3 = "androidx.compose.material3.SmallTopAppBar (AppBar.kt:183)"
            androidx.compose.runtime.ComposerKt.traceEventStart(r0, r1, r2, r3)
        L_0x018c:
            r0 = r1 & 14
            r2 = r1 & 112(0x70, float:1.57E-43)
            r0 = r0 | r2
            r2 = r1 & 896(0x380, float:1.256E-42)
            r0 = r0 | r2
            r2 = r1 & 7168(0x1c00, float:1.0045E-41)
            r0 = r0 | r2
            r2 = 57344(0xe000, float:8.0356E-41)
            r2 = r2 & r1
            r0 = r0 | r2
            r2 = r1 & r26
            r0 = r0 | r2
            r1 = r1 & r28
            r8 = r0 | r1
            r18 = 0
            r0 = r30
            r1 = r12
            r2 = r13
            r3 = r14
            r4 = r15
            r5 = r16
            r6 = r17
            r7 = r9
            r19 = r9
            r9 = r18
            TopAppBar(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9)
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto L_0x01c0
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L_0x01c0:
            r2 = r12
            r3 = r13
            r4 = r14
            r5 = r15
            r6 = r16
            r7 = r17
        L_0x01c8:
            androidx.compose.runtime.ScopeUpdateScope r12 = r19.endRestartGroup()
            if (r12 != 0) goto L_0x01cf
            goto L_0x01e0
        L_0x01cf:
            androidx.compose.material3.AppBarKt$SmallTopAppBar$1 r13 = new androidx.compose.material3.AppBarKt$SmallTopAppBar$1
            r0 = r13
            r1 = r30
            r8 = r38
            r9 = r39
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            kotlin.jvm.functions.Function2 r13 = (kotlin.jvm.functions.Function2) r13
            r12.updateScope(r13)
        L_0x01e0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.AppBarKt.SmallTopAppBar(kotlin.jvm.functions.Function2, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function3, androidx.compose.foundation.layout.WindowInsets, androidx.compose.material3.TopAppBarColors, androidx.compose.material3.TopAppBarScrollBehavior, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v0, resolved type: kotlin.jvm.functions.Function3<? super androidx.compose.foundation.layout.RowScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v4, resolved type: kotlin.jvm.functions.Function3<? super androidx.compose.foundation.layout.RowScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v5, resolved type: kotlin.jvm.functions.Function3<androidx.compose.foundation.layout.RowScope, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v7, resolved type: kotlin.jvm.functions.Function3<? super androidx.compose.foundation.layout.RowScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v9, resolved type: kotlin.jvm.functions.Function3<? super androidx.compose.foundation.layout.RowScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x01f6  */
    /* JADX WARNING: Removed duplicated region for block: B:122:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x008a  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x009f  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00a7  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00bc  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00c4  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x00c8  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x00ef  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x00fc  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void CenterAlignedTopAppBar(kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r30, androidx.compose.ui.Modifier r31, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r32, kotlin.jvm.functions.Function3<? super androidx.compose.foundation.layout.RowScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r33, androidx.compose.foundation.layout.WindowInsets r34, androidx.compose.material3.TopAppBarColors r35, androidx.compose.material3.TopAppBarScrollBehavior r36, androidx.compose.runtime.Composer r37, int r38, int r39) {
        /*
            r12 = r30
            r13 = r38
            java.lang.String r0 = "title"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r0)
            r0 = -2139286460(0xffffffff807d1444, float:-1.1486707E-38)
            r1 = r37
            androidx.compose.runtime.Composer r11 = r1.startRestartGroup(r0)
            java.lang.String r1 = "C(CenterAlignedTopAppBar)P(5,2,3!1,6)229@11657L12,230@11719L30,237@11930L10,233@11811L381:AppBar.kt#uh7d8r"
            androidx.compose.runtime.ComposerKt.sourceInformation(r11, r1)
            r1 = r39 & 1
            if (r1 == 0) goto L_0x001f
            r1 = r13 | 6
            goto L_0x002f
        L_0x001f:
            r1 = r13 & 14
            if (r1 != 0) goto L_0x002e
            boolean r1 = r11.changedInstance(r12)
            if (r1 == 0) goto L_0x002b
            r1 = 4
            goto L_0x002c
        L_0x002b:
            r1 = 2
        L_0x002c:
            r1 = r1 | r13
            goto L_0x002f
        L_0x002e:
            r1 = r13
        L_0x002f:
            r2 = r39 & 2
            if (r2 == 0) goto L_0x0036
            r1 = r1 | 48
            goto L_0x0049
        L_0x0036:
            r3 = r13 & 112(0x70, float:1.57E-43)
            if (r3 != 0) goto L_0x0049
            r3 = r31
            boolean r4 = r11.changed((java.lang.Object) r3)
            if (r4 == 0) goto L_0x0045
            r4 = 32
            goto L_0x0047
        L_0x0045:
            r4 = 16
        L_0x0047:
            r1 = r1 | r4
            goto L_0x004b
        L_0x0049:
            r3 = r31
        L_0x004b:
            r4 = r39 & 4
            if (r4 == 0) goto L_0x0052
            r1 = r1 | 384(0x180, float:5.38E-43)
            goto L_0x0065
        L_0x0052:
            r5 = r13 & 896(0x380, float:1.256E-42)
            if (r5 != 0) goto L_0x0065
            r5 = r32
            boolean r6 = r11.changedInstance(r5)
            if (r6 == 0) goto L_0x0061
            r6 = 256(0x100, float:3.59E-43)
            goto L_0x0063
        L_0x0061:
            r6 = 128(0x80, float:1.794E-43)
        L_0x0063:
            r1 = r1 | r6
            goto L_0x0067
        L_0x0065:
            r5 = r32
        L_0x0067:
            r6 = r39 & 8
            if (r6 == 0) goto L_0x006e
            r1 = r1 | 3072(0xc00, float:4.305E-42)
            goto L_0x0081
        L_0x006e:
            r7 = r13 & 7168(0x1c00, float:1.0045E-41)
            if (r7 != 0) goto L_0x0081
            r7 = r33
            boolean r8 = r11.changedInstance(r7)
            if (r8 == 0) goto L_0x007d
            r8 = 2048(0x800, float:2.87E-42)
            goto L_0x007f
        L_0x007d:
            r8 = 1024(0x400, float:1.435E-42)
        L_0x007f:
            r1 = r1 | r8
            goto L_0x0083
        L_0x0081:
            r7 = r33
        L_0x0083:
            r8 = 57344(0xe000, float:8.0356E-41)
            r9 = r13 & r8
            if (r9 != 0) goto L_0x009f
            r9 = r39 & 16
            if (r9 != 0) goto L_0x0099
            r9 = r34
            boolean r10 = r11.changed((java.lang.Object) r9)
            if (r10 == 0) goto L_0x009b
            r10 = 16384(0x4000, float:2.2959E-41)
            goto L_0x009d
        L_0x0099:
            r9 = r34
        L_0x009b:
            r10 = 8192(0x2000, float:1.14794E-41)
        L_0x009d:
            r1 = r1 | r10
            goto L_0x00a1
        L_0x009f:
            r9 = r34
        L_0x00a1:
            r10 = 458752(0x70000, float:6.42848E-40)
            r14 = r13 & r10
            if (r14 != 0) goto L_0x00bc
            r14 = r39 & 32
            if (r14 != 0) goto L_0x00b6
            r14 = r35
            boolean r15 = r11.changed((java.lang.Object) r14)
            if (r15 == 0) goto L_0x00b8
            r15 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00ba
        L_0x00b6:
            r14 = r35
        L_0x00b8:
            r15 = 65536(0x10000, float:9.18355E-41)
        L_0x00ba:
            r1 = r1 | r15
            goto L_0x00be
        L_0x00bc:
            r14 = r35
        L_0x00be:
            r28 = r39 & 64
            r29 = 3670016(0x380000, float:5.142788E-39)
            if (r28 == 0) goto L_0x00c8
            r15 = 1572864(0x180000, float:2.204052E-39)
            r1 = r1 | r15
            goto L_0x00dc
        L_0x00c8:
            r15 = r13 & r29
            if (r15 != 0) goto L_0x00dc
            r15 = r36
            boolean r16 = r11.changed((java.lang.Object) r15)
            if (r16 == 0) goto L_0x00d7
            r16 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00d9
        L_0x00d7:
            r16 = 524288(0x80000, float:7.34684E-40)
        L_0x00d9:
            r1 = r1 | r16
            goto L_0x00de
        L_0x00dc:
            r15 = r36
        L_0x00de:
            r16 = 2995931(0x2db6db, float:4.198194E-39)
            r10 = r1 & r16
            r8 = 599186(0x92492, float:8.39638E-40)
            if (r10 != r8) goto L_0x00fc
            boolean r8 = r11.getSkipping()
            if (r8 != 0) goto L_0x00ef
            goto L_0x00fc
        L_0x00ef:
            r11.skipToGroupEnd()
            r2 = r3
            r3 = r5
            r4 = r7
            r5 = r9
            r21 = r11
            r6 = r14
            r7 = r15
            goto L_0x01ef
        L_0x00fc:
            r11.startDefaults()
            r8 = r13 & 1
            r10 = -458753(0xfffffffffff8ffff, float:NaN)
            r16 = -57345(0xffffffffffff1fff, float:NaN)
            r0 = 6
            if (r8 == 0) goto L_0x012a
            boolean r8 = r11.getDefaultsInvalid()
            if (r8 == 0) goto L_0x0111
            goto L_0x012a
        L_0x0111:
            r11.skipToGroupEnd()
            r2 = r39 & 16
            if (r2 == 0) goto L_0x011a
            r1 = r1 & r16
        L_0x011a:
            r2 = r39 & 32
            if (r2 == 0) goto L_0x011f
            r1 = r1 & r10
        L_0x011f:
            r16 = r7
            r17 = r9
            r18 = r14
            r19 = r15
            r14 = r3
            r15 = r5
            goto L_0x0180
        L_0x012a:
            if (r2 == 0) goto L_0x0131
            androidx.compose.ui.Modifier$Companion r2 = androidx.compose.ui.Modifier.Companion
            androidx.compose.ui.Modifier r2 = (androidx.compose.ui.Modifier) r2
            goto L_0x0132
        L_0x0131:
            r2 = r3
        L_0x0132:
            if (r4 == 0) goto L_0x013b
            androidx.compose.material3.ComposableSingletons$AppBarKt r3 = androidx.compose.material3.ComposableSingletons$AppBarKt.INSTANCE
            kotlin.jvm.functions.Function2 r3 = r3.m1255getLambda5$material3_release()
            goto L_0x013c
        L_0x013b:
            r3 = r5
        L_0x013c:
            if (r6 == 0) goto L_0x0145
            androidx.compose.material3.ComposableSingletons$AppBarKt r4 = androidx.compose.material3.ComposableSingletons$AppBarKt.INSTANCE
            kotlin.jvm.functions.Function3 r4 = r4.m1256getLambda6$material3_release()
            r7 = r4
        L_0x0145:
            r4 = r39 & 16
            if (r4 == 0) goto L_0x0152
            androidx.compose.material3.TopAppBarDefaults r4 = androidx.compose.material3.TopAppBarDefaults.INSTANCE
            androidx.compose.foundation.layout.WindowInsets r4 = r4.getWindowInsets(r11, r0)
            r1 = r1 & r16
            r9 = r4
        L_0x0152:
            r4 = r39 & 32
            if (r4 == 0) goto L_0x016f
            androidx.compose.material3.TopAppBarDefaults r14 = androidx.compose.material3.TopAppBarDefaults.INSTANCE
            r4 = 0
            r17 = 0
            r19 = 0
            r21 = 0
            r23 = 0
            r26 = 196608(0x30000, float:2.75506E-40)
            r27 = 31
            r15 = r4
            r25 = r11
            androidx.compose.material3.TopAppBarColors r4 = r14.m1850centerAlignedTopAppBarColorszjMxDiM(r15, r17, r19, r21, r23, r25, r26, r27)
            r1 = r1 & r10
            r14 = r4
        L_0x016f:
            if (r28 == 0) goto L_0x0176
            r4 = 0
            r15 = r3
            r19 = r4
            goto L_0x0179
        L_0x0176:
            r19 = r36
            r15 = r3
        L_0x0179:
            r16 = r7
            r17 = r9
            r18 = r14
            r14 = r2
        L_0x0180:
            r11.endDefaults()
            boolean r2 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r2 == 0) goto L_0x0193
            r2 = -1
            java.lang.String r3 = "androidx.compose.material3.CenterAlignedTopAppBar (AppBar.kt:224)"
            r4 = -2139286460(0xffffffff807d1444, float:-1.1486707E-38)
            androidx.compose.runtime.ComposerKt.traceEventStart(r4, r1, r2, r3)
        L_0x0193:
            androidx.compose.material3.MaterialTheme r2 = androidx.compose.material3.MaterialTheme.INSTANCE
            androidx.compose.material3.Typography r2 = r2.getTypography(r11, r0)
            androidx.compose.material3.tokens.TopAppBarSmallTokens r3 = androidx.compose.material3.tokens.TopAppBarSmallTokens.INSTANCE
            androidx.compose.material3.tokens.TypographyKeyTokens r3 = r3.getHeadlineFont()
            androidx.compose.ui.text.TextStyle r2 = androidx.compose.material3.TypographyKt.fromToken(r2, r3)
            r3 = 1
            int r4 = r1 >> 3
            r4 = r4 & 14
            r4 = r4 | 3072(0xc00, float:4.305E-42)
            int r5 = r1 << 3
            r5 = r5 & 112(0x70, float:1.57E-43)
            r4 = r4 | r5
            int r0 = r1 << 6
            r1 = 57344(0xe000, float:8.0356E-41)
            r1 = r1 & r0
            r1 = r1 | r4
            r4 = 458752(0x70000, float:6.42848E-40)
            r4 = r4 & r0
            r1 = r1 | r4
            r4 = r0 & r29
            r1 = r1 | r4
            r4 = 29360128(0x1c00000, float:7.052966E-38)
            r4 = r4 & r0
            r1 = r1 | r4
            r4 = 234881024(0xe000000, float:1.5777218E-30)
            r0 = r0 & r4
            r10 = r1 | r0
            r20 = 0
            r0 = r14
            r1 = r30
            r4 = r15
            r5 = r16
            r6 = r17
            r7 = r18
            r8 = r19
            r9 = r11
            r21 = r11
            r11 = r20
            SingleRowTopAppBar(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto L_0x01e5
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L_0x01e5:
            r2 = r14
            r3 = r15
            r4 = r16
            r5 = r17
            r6 = r18
            r7 = r19
        L_0x01ef:
            androidx.compose.runtime.ScopeUpdateScope r10 = r21.endRestartGroup()
            if (r10 != 0) goto L_0x01f6
            goto L_0x0207
        L_0x01f6:
            androidx.compose.material3.AppBarKt$CenterAlignedTopAppBar$1 r11 = new androidx.compose.material3.AppBarKt$CenterAlignedTopAppBar$1
            r0 = r11
            r1 = r30
            r8 = r38
            r9 = r39
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            kotlin.jvm.functions.Function2 r11 = (kotlin.jvm.functions.Function2) r11
            r10.updateScope(r11)
        L_0x0207:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.AppBarKt.CenterAlignedTopAppBar(kotlin.jvm.functions.Function2, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function3, androidx.compose.foundation.layout.WindowInsets, androidx.compose.material3.TopAppBarColors, androidx.compose.material3.TopAppBarScrollBehavior, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v0, resolved type: kotlin.jvm.functions.Function3<? super androidx.compose.foundation.layout.RowScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v4, resolved type: kotlin.jvm.functions.Function3<? super androidx.compose.foundation.layout.RowScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v5, resolved type: kotlin.jvm.functions.Function3<androidx.compose.foundation.layout.RowScope, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v7, resolved type: kotlin.jvm.functions.Function3<? super androidx.compose.foundation.layout.RowScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v9, resolved type: kotlin.jvm.functions.Function3<? super androidx.compose.foundation.layout.RowScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x0222  */
    /* JADX WARNING: Removed duplicated region for block: B:121:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x008a  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x009f  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00a6  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00bb  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00c3  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x00c9  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x00eb  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x00f8  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void MediumTopAppBar(kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r31, androidx.compose.ui.Modifier r32, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r33, kotlin.jvm.functions.Function3<? super androidx.compose.foundation.layout.RowScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r34, androidx.compose.foundation.layout.WindowInsets r35, androidx.compose.material3.TopAppBarColors r36, androidx.compose.material3.TopAppBarScrollBehavior r37, androidx.compose.runtime.Composer r38, int r39, int r40) {
        /*
            r13 = r31
            r12 = r39
            java.lang.String r0 = "title"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r0)
            r0 = 1805417862(0x6b9c7d86, float:3.783704E26)
            r1 = r38
            androidx.compose.runtime.Composer r9 = r1.startRestartGroup(r0)
            java.lang.String r1 = "C(MediumTopAppBar)P(5,2,3!1,6)284@14510L12,285@14572L23,291@14766L10,292@14868L10,288@14657L646:AppBar.kt#uh7d8r"
            androidx.compose.runtime.ComposerKt.sourceInformation(r9, r1)
            r1 = r40 & 1
            if (r1 == 0) goto L_0x001f
            r1 = r12 | 6
            goto L_0x002f
        L_0x001f:
            r1 = r12 & 14
            if (r1 != 0) goto L_0x002e
            boolean r1 = r9.changedInstance(r13)
            if (r1 == 0) goto L_0x002b
            r1 = 4
            goto L_0x002c
        L_0x002b:
            r1 = 2
        L_0x002c:
            r1 = r1 | r12
            goto L_0x002f
        L_0x002e:
            r1 = r12
        L_0x002f:
            r2 = r40 & 2
            if (r2 == 0) goto L_0x0036
            r1 = r1 | 48
            goto L_0x0049
        L_0x0036:
            r3 = r12 & 112(0x70, float:1.57E-43)
            if (r3 != 0) goto L_0x0049
            r3 = r32
            boolean r4 = r9.changed((java.lang.Object) r3)
            if (r4 == 0) goto L_0x0045
            r4 = 32
            goto L_0x0047
        L_0x0045:
            r4 = 16
        L_0x0047:
            r1 = r1 | r4
            goto L_0x004b
        L_0x0049:
            r3 = r32
        L_0x004b:
            r4 = r40 & 4
            if (r4 == 0) goto L_0x0052
            r1 = r1 | 384(0x180, float:5.38E-43)
            goto L_0x0065
        L_0x0052:
            r5 = r12 & 896(0x380, float:1.256E-42)
            if (r5 != 0) goto L_0x0065
            r5 = r33
            boolean r6 = r9.changedInstance(r5)
            if (r6 == 0) goto L_0x0061
            r6 = 256(0x100, float:3.59E-43)
            goto L_0x0063
        L_0x0061:
            r6 = 128(0x80, float:1.794E-43)
        L_0x0063:
            r1 = r1 | r6
            goto L_0x0067
        L_0x0065:
            r5 = r33
        L_0x0067:
            r6 = r40 & 8
            if (r6 == 0) goto L_0x006e
            r1 = r1 | 3072(0xc00, float:4.305E-42)
            goto L_0x0081
        L_0x006e:
            r7 = r12 & 7168(0x1c00, float:1.0045E-41)
            if (r7 != 0) goto L_0x0081
            r7 = r34
            boolean r8 = r9.changedInstance(r7)
            if (r8 == 0) goto L_0x007d
            r8 = 2048(0x800, float:2.87E-42)
            goto L_0x007f
        L_0x007d:
            r8 = 1024(0x400, float:1.435E-42)
        L_0x007f:
            r1 = r1 | r8
            goto L_0x0083
        L_0x0081:
            r7 = r34
        L_0x0083:
            r8 = 57344(0xe000, float:8.0356E-41)
            r10 = r12 & r8
            if (r10 != 0) goto L_0x009f
            r10 = r40 & 16
            if (r10 != 0) goto L_0x0099
            r10 = r35
            boolean r11 = r9.changed((java.lang.Object) r10)
            if (r11 == 0) goto L_0x009b
            r11 = 16384(0x4000, float:2.2959E-41)
            goto L_0x009d
        L_0x0099:
            r10 = r35
        L_0x009b:
            r11 = 8192(0x2000, float:1.14794E-41)
        L_0x009d:
            r1 = r1 | r11
            goto L_0x00a1
        L_0x009f:
            r10 = r35
        L_0x00a1:
            r11 = 458752(0x70000, float:6.42848E-40)
            r11 = r11 & r12
            if (r11 != 0) goto L_0x00bb
            r11 = r40 & 32
            if (r11 != 0) goto L_0x00b5
            r11 = r36
            boolean r14 = r9.changed((java.lang.Object) r11)
            if (r14 == 0) goto L_0x00b7
            r14 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00b9
        L_0x00b5:
            r11 = r36
        L_0x00b7:
            r14 = 65536(0x10000, float:9.18355E-41)
        L_0x00b9:
            r1 = r1 | r14
            goto L_0x00bd
        L_0x00bb:
            r11 = r36
        L_0x00bd:
            r28 = r40 & 64
            r29 = 3670016(0x380000, float:5.142788E-39)
            if (r28 == 0) goto L_0x00c9
            r14 = 1572864(0x180000, float:2.204052E-39)
            r1 = r1 | r14
            r15 = r37
            goto L_0x00db
        L_0x00c9:
            r14 = r12 & r29
            r15 = r37
            if (r14 != 0) goto L_0x00db
            boolean r14 = r9.changed((java.lang.Object) r15)
            if (r14 == 0) goto L_0x00d8
            r14 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00da
        L_0x00d8:
            r14 = 524288(0x80000, float:7.34684E-40)
        L_0x00da:
            r1 = r1 | r14
        L_0x00db:
            r14 = 2995931(0x2db6db, float:4.198194E-39)
            r14 = r14 & r1
            r8 = 599186(0x92492, float:8.39638E-40)
            if (r14 != r8) goto L_0x00f8
            boolean r8 = r9.getSkipping()
            if (r8 != 0) goto L_0x00eb
            goto L_0x00f8
        L_0x00eb:
            r9.skipToGroupEnd()
            r2 = r3
            r3 = r5
            r4 = r7
            r23 = r9
            r5 = r10
            r6 = r11
            r7 = r15
            goto L_0x021b
        L_0x00f8:
            r9.startDefaults()
            r8 = r12 & 1
            r30 = -458753(0xfffffffffff8ffff, float:NaN)
            r14 = -57345(0xffffffffffff1fff, float:NaN)
            r0 = 6
            if (r8 == 0) goto L_0x0129
            boolean r8 = r9.getDefaultsInvalid()
            if (r8 == 0) goto L_0x010d
            goto L_0x0129
        L_0x010d:
            r9.skipToGroupEnd()
            r2 = r40 & 16
            if (r2 == 0) goto L_0x0115
            r1 = r1 & r14
        L_0x0115:
            r2 = r40 & 32
            if (r2 == 0) goto L_0x011b
            r1 = r1 & r30
        L_0x011b:
            r17 = r3
            r18 = r5
            r19 = r7
            r20 = r10
            r21 = r11
            r22 = r15
            goto L_0x0184
        L_0x0129:
            if (r2 == 0) goto L_0x0130
            androidx.compose.ui.Modifier$Companion r2 = androidx.compose.ui.Modifier.Companion
            androidx.compose.ui.Modifier r2 = (androidx.compose.ui.Modifier) r2
            goto L_0x0131
        L_0x0130:
            r2 = r3
        L_0x0131:
            if (r4 == 0) goto L_0x013a
            androidx.compose.material3.ComposableSingletons$AppBarKt r3 = androidx.compose.material3.ComposableSingletons$AppBarKt.INSTANCE
            kotlin.jvm.functions.Function2 r3 = r3.m1257getLambda7$material3_release()
            goto L_0x013b
        L_0x013a:
            r3 = r5
        L_0x013b:
            if (r6 == 0) goto L_0x0144
            androidx.compose.material3.ComposableSingletons$AppBarKt r4 = androidx.compose.material3.ComposableSingletons$AppBarKt.INSTANCE
            kotlin.jvm.functions.Function3 r4 = r4.m1258getLambda8$material3_release()
            r7 = r4
        L_0x0144:
            r4 = r40 & 16
            if (r4 == 0) goto L_0x0150
            androidx.compose.material3.TopAppBarDefaults r4 = androidx.compose.material3.TopAppBarDefaults.INSTANCE
            androidx.compose.foundation.layout.WindowInsets r4 = r4.getWindowInsets(r9, r0)
            r1 = r1 & r14
            r10 = r4
        L_0x0150:
            r4 = r40 & 32
            if (r4 == 0) goto L_0x016e
            androidx.compose.material3.TopAppBarDefaults r14 = androidx.compose.material3.TopAppBarDefaults.INSTANCE
            r4 = 0
            r17 = 0
            r19 = 0
            r21 = 0
            r23 = 0
            r26 = 196608(0x30000, float:2.75506E-40)
            r27 = 31
            r15 = r4
            r25 = r9
            androidx.compose.material3.TopAppBarColors r4 = r14.m1852mediumTopAppBarColorszjMxDiM(r15, r17, r19, r21, r23, r25, r26, r27)
            r1 = r1 & r30
            r11 = r4
        L_0x016e:
            if (r28 == 0) goto L_0x0178
            r4 = 0
            r17 = r2
            r18 = r3
            r22 = r4
            goto L_0x017e
        L_0x0178:
            r22 = r37
            r17 = r2
            r18 = r3
        L_0x017e:
            r19 = r7
            r20 = r10
            r21 = r11
        L_0x0184:
            r9.endDefaults()
            boolean r2 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r2 == 0) goto L_0x0197
            r2 = -1
            java.lang.String r3 = "androidx.compose.material3.MediumTopAppBar (AppBar.kt:279)"
            r4 = 1805417862(0x6b9c7d86, float:3.783704E26)
            androidx.compose.runtime.ComposerKt.traceEventStart(r4, r1, r2, r3)
        L_0x0197:
            androidx.compose.material3.MaterialTheme r2 = androidx.compose.material3.MaterialTheme.INSTANCE
            androidx.compose.material3.Typography r2 = r2.getTypography(r9, r0)
            androidx.compose.material3.tokens.TopAppBarMediumTokens r3 = androidx.compose.material3.tokens.TopAppBarMediumTokens.INSTANCE
            androidx.compose.material3.tokens.TypographyKeyTokens r3 = r3.getHeadlineFont()
            androidx.compose.ui.text.TextStyle r2 = androidx.compose.material3.TypographyKt.fromToken(r2, r3)
            androidx.compose.material3.MaterialTheme r3 = androidx.compose.material3.MaterialTheme.INSTANCE
            androidx.compose.material3.Typography r0 = r3.getTypography(r9, r0)
            androidx.compose.material3.tokens.TopAppBarSmallTokens r3 = androidx.compose.material3.tokens.TopAppBarSmallTokens.INSTANCE
            androidx.compose.material3.tokens.TypographyKeyTokens r3 = r3.getHeadlineFont()
            androidx.compose.ui.text.TextStyle r5 = androidx.compose.material3.TypographyKt.fromToken(r0, r3)
            float r3 = MediumTitleBottomPadding
            androidx.compose.material3.tokens.TopAppBarMediumTokens r0 = androidx.compose.material3.tokens.TopAppBarMediumTokens.INSTANCE
            float r10 = r0.m2359getContainerHeightD9Ej5fM()
            androidx.compose.material3.tokens.TopAppBarSmallTokens r0 = androidx.compose.material3.tokens.TopAppBarSmallTokens.INSTANCE
            float r11 = r0.m2369getContainerHeightD9Ej5fM()
            int r0 = r1 >> 3
            r0 = r0 & 14
            r0 = r0 | 3072(0xc00, float:4.305E-42)
            int r4 = r1 << 3
            r4 = r4 & 112(0x70, float:1.57E-43)
            r0 = r0 | r4
            int r4 = r1 << 12
            r6 = 57344(0xe000, float:8.0356E-41)
            r6 = r6 & r4
            r0 = r0 | r6
            r6 = r4 & r29
            r0 = r0 | r6
            r6 = 29360128(0x1c00000, float:7.052966E-38)
            r6 = r6 & r4
            r0 = r0 | r6
            r6 = 234881024(0xe000000, float:1.5777218E-30)
            r6 = r6 & r4
            r0 = r0 | r6
            r6 = 1879048192(0x70000000, float:1.58456325E29)
            r4 = r4 & r6
            r14 = r0 | r4
            int r0 = r1 >> 12
            r0 = r0 & 896(0x380, float:1.256E-42)
            r15 = r0 | 54
            r16 = 0
            r0 = r17
            r1 = r31
            r4 = r31
            r6 = r18
            r7 = r19
            r8 = r20
            r23 = r9
            r9 = r21
            r12 = r22
            r13 = r23
            m1126TwoRowsTopAppBartjU4iQQ(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto L_0x020f
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L_0x020f:
            r2 = r17
            r3 = r18
            r4 = r19
            r5 = r20
            r6 = r21
            r7 = r22
        L_0x021b:
            androidx.compose.runtime.ScopeUpdateScope r10 = r23.endRestartGroup()
            if (r10 != 0) goto L_0x0222
            goto L_0x0233
        L_0x0222:
            androidx.compose.material3.AppBarKt$MediumTopAppBar$1 r11 = new androidx.compose.material3.AppBarKt$MediumTopAppBar$1
            r0 = r11
            r1 = r31
            r8 = r39
            r9 = r40
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            kotlin.jvm.functions.Function2 r11 = (kotlin.jvm.functions.Function2) r11
            r10.updateScope(r11)
        L_0x0233:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.AppBarKt.MediumTopAppBar(kotlin.jvm.functions.Function2, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function3, androidx.compose.foundation.layout.WindowInsets, androidx.compose.material3.TopAppBarColors, androidx.compose.material3.TopAppBarScrollBehavior, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v0, resolved type: kotlin.jvm.functions.Function3<? super androidx.compose.foundation.layout.RowScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v4, resolved type: kotlin.jvm.functions.Function3<? super androidx.compose.foundation.layout.RowScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v5, resolved type: kotlin.jvm.functions.Function3<androidx.compose.foundation.layout.RowScope, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v7, resolved type: kotlin.jvm.functions.Function3<? super androidx.compose.foundation.layout.RowScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v9, resolved type: kotlin.jvm.functions.Function3<? super androidx.compose.foundation.layout.RowScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x0222  */
    /* JADX WARNING: Removed duplicated region for block: B:121:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x008a  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x009f  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00a6  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00bb  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00c3  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x00c9  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x00eb  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x00f8  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void LargeTopAppBar(kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r31, androidx.compose.ui.Modifier r32, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r33, kotlin.jvm.functions.Function3<? super androidx.compose.foundation.layout.RowScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r34, androidx.compose.foundation.layout.WindowInsets r35, androidx.compose.material3.TopAppBarColors r36, androidx.compose.material3.TopAppBarScrollBehavior r37, androidx.compose.runtime.Composer r38, int r39, int r40) {
        /*
            r13 = r31
            r12 = r39
            java.lang.String r0 = "title"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r0)
            r0 = -474540752(0xffffffffe3b71530, float:-6.754562E21)
            r1 = r38
            androidx.compose.runtime.Composer r9 = r1.startRestartGroup(r0)
            java.lang.String r1 = "C(LargeTopAppBar)P(5,2,3!1,6)342@17613L12,343@17675L22,348@17839L10,349@17940L10,346@17759L643:AppBar.kt#uh7d8r"
            androidx.compose.runtime.ComposerKt.sourceInformation(r9, r1)
            r1 = r40 & 1
            if (r1 == 0) goto L_0x001f
            r1 = r12 | 6
            goto L_0x002f
        L_0x001f:
            r1 = r12 & 14
            if (r1 != 0) goto L_0x002e
            boolean r1 = r9.changedInstance(r13)
            if (r1 == 0) goto L_0x002b
            r1 = 4
            goto L_0x002c
        L_0x002b:
            r1 = 2
        L_0x002c:
            r1 = r1 | r12
            goto L_0x002f
        L_0x002e:
            r1 = r12
        L_0x002f:
            r2 = r40 & 2
            if (r2 == 0) goto L_0x0036
            r1 = r1 | 48
            goto L_0x0049
        L_0x0036:
            r3 = r12 & 112(0x70, float:1.57E-43)
            if (r3 != 0) goto L_0x0049
            r3 = r32
            boolean r4 = r9.changed((java.lang.Object) r3)
            if (r4 == 0) goto L_0x0045
            r4 = 32
            goto L_0x0047
        L_0x0045:
            r4 = 16
        L_0x0047:
            r1 = r1 | r4
            goto L_0x004b
        L_0x0049:
            r3 = r32
        L_0x004b:
            r4 = r40 & 4
            if (r4 == 0) goto L_0x0052
            r1 = r1 | 384(0x180, float:5.38E-43)
            goto L_0x0065
        L_0x0052:
            r5 = r12 & 896(0x380, float:1.256E-42)
            if (r5 != 0) goto L_0x0065
            r5 = r33
            boolean r6 = r9.changedInstance(r5)
            if (r6 == 0) goto L_0x0061
            r6 = 256(0x100, float:3.59E-43)
            goto L_0x0063
        L_0x0061:
            r6 = 128(0x80, float:1.794E-43)
        L_0x0063:
            r1 = r1 | r6
            goto L_0x0067
        L_0x0065:
            r5 = r33
        L_0x0067:
            r6 = r40 & 8
            if (r6 == 0) goto L_0x006e
            r1 = r1 | 3072(0xc00, float:4.305E-42)
            goto L_0x0081
        L_0x006e:
            r7 = r12 & 7168(0x1c00, float:1.0045E-41)
            if (r7 != 0) goto L_0x0081
            r7 = r34
            boolean r8 = r9.changedInstance(r7)
            if (r8 == 0) goto L_0x007d
            r8 = 2048(0x800, float:2.87E-42)
            goto L_0x007f
        L_0x007d:
            r8 = 1024(0x400, float:1.435E-42)
        L_0x007f:
            r1 = r1 | r8
            goto L_0x0083
        L_0x0081:
            r7 = r34
        L_0x0083:
            r8 = 57344(0xe000, float:8.0356E-41)
            r10 = r12 & r8
            if (r10 != 0) goto L_0x009f
            r10 = r40 & 16
            if (r10 != 0) goto L_0x0099
            r10 = r35
            boolean r11 = r9.changed((java.lang.Object) r10)
            if (r11 == 0) goto L_0x009b
            r11 = 16384(0x4000, float:2.2959E-41)
            goto L_0x009d
        L_0x0099:
            r10 = r35
        L_0x009b:
            r11 = 8192(0x2000, float:1.14794E-41)
        L_0x009d:
            r1 = r1 | r11
            goto L_0x00a1
        L_0x009f:
            r10 = r35
        L_0x00a1:
            r11 = 458752(0x70000, float:6.42848E-40)
            r11 = r11 & r12
            if (r11 != 0) goto L_0x00bb
            r11 = r40 & 32
            if (r11 != 0) goto L_0x00b5
            r11 = r36
            boolean r14 = r9.changed((java.lang.Object) r11)
            if (r14 == 0) goto L_0x00b7
            r14 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00b9
        L_0x00b5:
            r11 = r36
        L_0x00b7:
            r14 = 65536(0x10000, float:9.18355E-41)
        L_0x00b9:
            r1 = r1 | r14
            goto L_0x00bd
        L_0x00bb:
            r11 = r36
        L_0x00bd:
            r28 = r40 & 64
            r29 = 3670016(0x380000, float:5.142788E-39)
            if (r28 == 0) goto L_0x00c9
            r14 = 1572864(0x180000, float:2.204052E-39)
            r1 = r1 | r14
            r15 = r37
            goto L_0x00db
        L_0x00c9:
            r14 = r12 & r29
            r15 = r37
            if (r14 != 0) goto L_0x00db
            boolean r14 = r9.changed((java.lang.Object) r15)
            if (r14 == 0) goto L_0x00d8
            r14 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00da
        L_0x00d8:
            r14 = 524288(0x80000, float:7.34684E-40)
        L_0x00da:
            r1 = r1 | r14
        L_0x00db:
            r14 = 2995931(0x2db6db, float:4.198194E-39)
            r14 = r14 & r1
            r8 = 599186(0x92492, float:8.39638E-40)
            if (r14 != r8) goto L_0x00f8
            boolean r8 = r9.getSkipping()
            if (r8 != 0) goto L_0x00eb
            goto L_0x00f8
        L_0x00eb:
            r9.skipToGroupEnd()
            r2 = r3
            r3 = r5
            r4 = r7
            r23 = r9
            r5 = r10
            r6 = r11
            r7 = r15
            goto L_0x021b
        L_0x00f8:
            r9.startDefaults()
            r8 = r12 & 1
            r30 = -458753(0xfffffffffff8ffff, float:NaN)
            r14 = -57345(0xffffffffffff1fff, float:NaN)
            r0 = 6
            if (r8 == 0) goto L_0x0129
            boolean r8 = r9.getDefaultsInvalid()
            if (r8 == 0) goto L_0x010d
            goto L_0x0129
        L_0x010d:
            r9.skipToGroupEnd()
            r2 = r40 & 16
            if (r2 == 0) goto L_0x0115
            r1 = r1 & r14
        L_0x0115:
            r2 = r40 & 32
            if (r2 == 0) goto L_0x011b
            r1 = r1 & r30
        L_0x011b:
            r17 = r3
            r18 = r5
            r19 = r7
            r20 = r10
            r21 = r11
            r22 = r15
            goto L_0x0184
        L_0x0129:
            if (r2 == 0) goto L_0x0130
            androidx.compose.ui.Modifier$Companion r2 = androidx.compose.ui.Modifier.Companion
            androidx.compose.ui.Modifier r2 = (androidx.compose.ui.Modifier) r2
            goto L_0x0131
        L_0x0130:
            r2 = r3
        L_0x0131:
            if (r4 == 0) goto L_0x013a
            androidx.compose.material3.ComposableSingletons$AppBarKt r3 = androidx.compose.material3.ComposableSingletons$AppBarKt.INSTANCE
            kotlin.jvm.functions.Function2 r3 = r3.m1259getLambda9$material3_release()
            goto L_0x013b
        L_0x013a:
            r3 = r5
        L_0x013b:
            if (r6 == 0) goto L_0x0144
            androidx.compose.material3.ComposableSingletons$AppBarKt r4 = androidx.compose.material3.ComposableSingletons$AppBarKt.INSTANCE
            kotlin.jvm.functions.Function3 r4 = r4.m1249getLambda10$material3_release()
            r7 = r4
        L_0x0144:
            r4 = r40 & 16
            if (r4 == 0) goto L_0x0150
            androidx.compose.material3.TopAppBarDefaults r4 = androidx.compose.material3.TopAppBarDefaults.INSTANCE
            androidx.compose.foundation.layout.WindowInsets r4 = r4.getWindowInsets(r9, r0)
            r1 = r1 & r14
            r10 = r4
        L_0x0150:
            r4 = r40 & 32
            if (r4 == 0) goto L_0x016e
            androidx.compose.material3.TopAppBarDefaults r14 = androidx.compose.material3.TopAppBarDefaults.INSTANCE
            r4 = 0
            r17 = 0
            r19 = 0
            r21 = 0
            r23 = 0
            r26 = 196608(0x30000, float:2.75506E-40)
            r27 = 31
            r15 = r4
            r25 = r9
            androidx.compose.material3.TopAppBarColors r4 = r14.m1851largeTopAppBarColorszjMxDiM(r15, r17, r19, r21, r23, r25, r26, r27)
            r1 = r1 & r30
            r11 = r4
        L_0x016e:
            if (r28 == 0) goto L_0x0178
            r4 = 0
            r17 = r2
            r18 = r3
            r22 = r4
            goto L_0x017e
        L_0x0178:
            r22 = r37
            r17 = r2
            r18 = r3
        L_0x017e:
            r19 = r7
            r20 = r10
            r21 = r11
        L_0x0184:
            r9.endDefaults()
            boolean r2 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r2 == 0) goto L_0x0197
            r2 = -1
            java.lang.String r3 = "androidx.compose.material3.LargeTopAppBar (AppBar.kt:337)"
            r4 = -474540752(0xffffffffe3b71530, float:-6.754562E21)
            androidx.compose.runtime.ComposerKt.traceEventStart(r4, r1, r2, r3)
        L_0x0197:
            androidx.compose.material3.MaterialTheme r2 = androidx.compose.material3.MaterialTheme.INSTANCE
            androidx.compose.material3.Typography r2 = r2.getTypography(r9, r0)
            androidx.compose.material3.tokens.TopAppBarLargeTokens r3 = androidx.compose.material3.tokens.TopAppBarLargeTokens.INSTANCE
            androidx.compose.material3.tokens.TypographyKeyTokens r3 = r3.getHeadlineFont()
            androidx.compose.ui.text.TextStyle r2 = androidx.compose.material3.TypographyKt.fromToken(r2, r3)
            androidx.compose.material3.MaterialTheme r3 = androidx.compose.material3.MaterialTheme.INSTANCE
            androidx.compose.material3.Typography r0 = r3.getTypography(r9, r0)
            androidx.compose.material3.tokens.TopAppBarSmallTokens r3 = androidx.compose.material3.tokens.TopAppBarSmallTokens.INSTANCE
            androidx.compose.material3.tokens.TypographyKeyTokens r3 = r3.getHeadlineFont()
            androidx.compose.ui.text.TextStyle r5 = androidx.compose.material3.TypographyKt.fromToken(r0, r3)
            float r3 = LargeTitleBottomPadding
            androidx.compose.material3.tokens.TopAppBarLargeTokens r0 = androidx.compose.material3.tokens.TopAppBarLargeTokens.INSTANCE
            float r10 = r0.m2355getContainerHeightD9Ej5fM()
            androidx.compose.material3.tokens.TopAppBarSmallTokens r0 = androidx.compose.material3.tokens.TopAppBarSmallTokens.INSTANCE
            float r11 = r0.m2369getContainerHeightD9Ej5fM()
            int r0 = r1 >> 3
            r0 = r0 & 14
            r0 = r0 | 3072(0xc00, float:4.305E-42)
            int r4 = r1 << 3
            r4 = r4 & 112(0x70, float:1.57E-43)
            r0 = r0 | r4
            int r4 = r1 << 12
            r6 = 57344(0xe000, float:8.0356E-41)
            r6 = r6 & r4
            r0 = r0 | r6
            r6 = r4 & r29
            r0 = r0 | r6
            r6 = 29360128(0x1c00000, float:7.052966E-38)
            r6 = r6 & r4
            r0 = r0 | r6
            r6 = 234881024(0xe000000, float:1.5777218E-30)
            r6 = r6 & r4
            r0 = r0 | r6
            r6 = 1879048192(0x70000000, float:1.58456325E29)
            r4 = r4 & r6
            r14 = r0 | r4
            int r0 = r1 >> 12
            r0 = r0 & 896(0x380, float:1.256E-42)
            r15 = r0 | 54
            r16 = 0
            r0 = r17
            r1 = r31
            r4 = r31
            r6 = r18
            r7 = r19
            r8 = r20
            r23 = r9
            r9 = r21
            r12 = r22
            r13 = r23
            m1126TwoRowsTopAppBartjU4iQQ(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto L_0x020f
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L_0x020f:
            r2 = r17
            r3 = r18
            r4 = r19
            r5 = r20
            r6 = r21
            r7 = r22
        L_0x021b:
            androidx.compose.runtime.ScopeUpdateScope r10 = r23.endRestartGroup()
            if (r10 != 0) goto L_0x0222
            goto L_0x0233
        L_0x0222:
            androidx.compose.material3.AppBarKt$LargeTopAppBar$1 r11 = new androidx.compose.material3.AppBarKt$LargeTopAppBar$1
            r0 = r11
            r1 = r31
            r8 = r39
            r9 = r40
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            kotlin.jvm.functions.Function2 r11 = (kotlin.jvm.functions.Function2) r11
            r10.updateScope(r11)
        L_0x0233:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.AppBarKt.LargeTopAppBar(kotlin.jvm.functions.Function2, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function3, androidx.compose.foundation.layout.WindowInsets, androidx.compose.material3.TopAppBarColors, androidx.compose.material3.TopAppBarScrollBehavior, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:138:0x020b  */
    /* JADX WARNING: Removed duplicated region for block: B:140:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0051  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0054  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0082  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00a0  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00a8  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00af  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00c8  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00cd  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x00e8  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x00fe  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x0111  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x011f  */
    /* renamed from: BottomAppBar-Snr_uVM  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m1124BottomAppBarSnr_uVM(kotlin.jvm.functions.Function3<? super androidx.compose.foundation.layout.RowScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r27, androidx.compose.ui.Modifier r28, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r29, long r30, long r32, float r34, androidx.compose.foundation.layout.PaddingValues r35, androidx.compose.foundation.layout.WindowInsets r36, androidx.compose.runtime.Composer r37, int r38, int r39) {
        /*
            r1 = r27
            r11 = r38
            r12 = r39
            java.lang.String r0 = "actions"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            r0 = 2141738945(0x7fa857c1, float:NaN)
            r2 = r37
            androidx.compose.runtime.Composer r2 = r2.startRestartGroup(r0)
            java.lang.String r3 = "C(BottomAppBar)P(!1,5,4,1:c#ui.graphics.Color,2:c#ui.graphics.Color,6:c#ui.unit.Dp)398@20365L14,399@20407L31,402@20633L12,403@20651L634:AppBar.kt#uh7d8r"
            androidx.compose.runtime.ComposerKt.sourceInformation(r2, r3)
            r3 = r12 & 1
            if (r3 == 0) goto L_0x0021
            r3 = r11 | 6
            goto L_0x0031
        L_0x0021:
            r3 = r11 & 14
            if (r3 != 0) goto L_0x0030
            boolean r3 = r2.changedInstance(r1)
            if (r3 == 0) goto L_0x002d
            r3 = 4
            goto L_0x002e
        L_0x002d:
            r3 = 2
        L_0x002e:
            r3 = r3 | r11
            goto L_0x0031
        L_0x0030:
            r3 = r11
        L_0x0031:
            r4 = r12 & 2
            if (r4 == 0) goto L_0x0038
            r3 = r3 | 48
            goto L_0x004b
        L_0x0038:
            r5 = r11 & 112(0x70, float:1.57E-43)
            if (r5 != 0) goto L_0x004b
            r5 = r28
            boolean r6 = r2.changed((java.lang.Object) r5)
            if (r6 == 0) goto L_0x0047
            r6 = 32
            goto L_0x0049
        L_0x0047:
            r6 = 16
        L_0x0049:
            r3 = r3 | r6
            goto L_0x004d
        L_0x004b:
            r5 = r28
        L_0x004d:
            r6 = r12 & 4
            if (r6 == 0) goto L_0x0054
            r3 = r3 | 384(0x180, float:5.38E-43)
            goto L_0x0067
        L_0x0054:
            r7 = r11 & 896(0x380, float:1.256E-42)
            if (r7 != 0) goto L_0x0067
            r7 = r29
            boolean r8 = r2.changedInstance(r7)
            if (r8 == 0) goto L_0x0063
            r8 = 256(0x100, float:3.59E-43)
            goto L_0x0065
        L_0x0063:
            r8 = 128(0x80, float:1.794E-43)
        L_0x0065:
            r3 = r3 | r8
            goto L_0x0069
        L_0x0067:
            r7 = r29
        L_0x0069:
            r8 = r11 & 7168(0x1c00, float:1.0045E-41)
            if (r8 != 0) goto L_0x0082
            r8 = r12 & 8
            if (r8 != 0) goto L_0x007c
            r8 = r30
            boolean r10 = r2.changed((long) r8)
            if (r10 == 0) goto L_0x007e
            r10 = 2048(0x800, float:2.87E-42)
            goto L_0x0080
        L_0x007c:
            r8 = r30
        L_0x007e:
            r10 = 1024(0x400, float:1.435E-42)
        L_0x0080:
            r3 = r3 | r10
            goto L_0x0084
        L_0x0082:
            r8 = r30
        L_0x0084:
            r10 = 57344(0xe000, float:8.0356E-41)
            r13 = r11 & r10
            if (r13 != 0) goto L_0x00a0
            r13 = r12 & 16
            if (r13 != 0) goto L_0x009a
            r13 = r32
            boolean r15 = r2.changed((long) r13)
            if (r15 == 0) goto L_0x009c
            r15 = 16384(0x4000, float:2.2959E-41)
            goto L_0x009e
        L_0x009a:
            r13 = r32
        L_0x009c:
            r15 = 8192(0x2000, float:1.14794E-41)
        L_0x009e:
            r3 = r3 | r15
            goto L_0x00a2
        L_0x00a0:
            r13 = r32
        L_0x00a2:
            r15 = r12 & 32
            r16 = 458752(0x70000, float:6.42848E-40)
            if (r15 == 0) goto L_0x00af
            r17 = 196608(0x30000, float:2.75506E-40)
            r3 = r3 | r17
            r10 = r34
            goto L_0x00c2
        L_0x00af:
            r17 = r11 & r16
            r10 = r34
            if (r17 != 0) goto L_0x00c2
            boolean r17 = r2.changed((float) r10)
            if (r17 == 0) goto L_0x00be
            r17 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00c0
        L_0x00be:
            r17 = 65536(0x10000, float:9.18355E-41)
        L_0x00c0:
            r3 = r3 | r17
        L_0x00c2:
            r17 = r12 & 64
            r18 = 1572864(0x180000, float:2.204052E-39)
            if (r17 == 0) goto L_0x00cd
            r3 = r3 | r18
            r0 = r35
            goto L_0x00e2
        L_0x00cd:
            r19 = 3670016(0x380000, float:5.142788E-39)
            r19 = r11 & r19
            r0 = r35
            if (r19 != 0) goto L_0x00e2
            boolean r20 = r2.changed((java.lang.Object) r0)
            if (r20 == 0) goto L_0x00de
            r20 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00e0
        L_0x00de:
            r20 = 524288(0x80000, float:7.34684E-40)
        L_0x00e0:
            r3 = r3 | r20
        L_0x00e2:
            r20 = 29360128(0x1c00000, float:7.052966E-38)
            r20 = r11 & r20
            if (r20 != 0) goto L_0x00fe
            r0 = r12 & 128(0x80, float:1.794E-43)
            if (r0 != 0) goto L_0x00f7
            r0 = r36
            boolean r20 = r2.changed((java.lang.Object) r0)
            if (r20 == 0) goto L_0x00f9
            r20 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00fb
        L_0x00f7:
            r0 = r36
        L_0x00f9:
            r20 = 4194304(0x400000, float:5.877472E-39)
        L_0x00fb:
            r3 = r3 | r20
            goto L_0x0100
        L_0x00fe:
            r0 = r36
        L_0x0100:
            r20 = 23967451(0x16db6db, float:4.3661218E-38)
            r0 = r3 & r20
            r5 = 4793490(0x492492, float:6.71711E-39)
            if (r0 != r5) goto L_0x011f
            boolean r0 = r2.getSkipping()
            if (r0 != 0) goto L_0x0111
            goto L_0x011f
        L_0x0111:
            r2.skipToGroupEnd()
            r3 = r28
            r25 = r36
            r4 = r7
            r6 = r8
            r8 = r13
            r13 = r35
            goto L_0x0204
        L_0x011f:
            r2.startDefaults()
            r0 = r11 & 1
            r20 = -57345(0xffffffffffff1fff, float:NaN)
            r5 = 6
            if (r0 == 0) goto L_0x0153
            boolean r0 = r2.getDefaultsInvalid()
            if (r0 == 0) goto L_0x0131
            goto L_0x0153
        L_0x0131:
            r2.skipToGroupEnd()
            r0 = r12 & 8
            if (r0 == 0) goto L_0x013a
            r3 = r3 & -7169(0xffffffffffffe3ff, float:NaN)
        L_0x013a:
            r0 = r12 & 16
            if (r0 == 0) goto L_0x0140
            r3 = r3 & r20
        L_0x0140:
            r0 = r12 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x0148
            r0 = -29360129(0xfffffffffe3fffff, float:-6.380294E37)
            r3 = r3 & r0
        L_0x0148:
            r0 = r28
            r25 = r36
            r4 = r7
            r6 = r8
            r8 = r13
            r13 = r3
            r3 = r35
            goto L_0x01aa
        L_0x0153:
            if (r4 == 0) goto L_0x015a
            androidx.compose.ui.Modifier$Companion r0 = androidx.compose.ui.Modifier.Companion
            androidx.compose.ui.Modifier r0 = (androidx.compose.ui.Modifier) r0
            goto L_0x015c
        L_0x015a:
            r0 = r28
        L_0x015c:
            if (r6 == 0) goto L_0x0160
            r4 = 0
            goto L_0x0161
        L_0x0160:
            r4 = r7
        L_0x0161:
            r6 = r12 & 8
            if (r6 == 0) goto L_0x016e
            androidx.compose.material3.BottomAppBarDefaults r6 = androidx.compose.material3.BottomAppBarDefaults.INSTANCE
            long r6 = r6.getContainerColor(r2, r5)
            r3 = r3 & -7169(0xffffffffffffe3ff, float:NaN)
            goto L_0x016f
        L_0x016e:
            r6 = r8
        L_0x016f:
            r8 = r12 & 16
            if (r8 == 0) goto L_0x017e
            int r8 = r3 >> 9
            r8 = r8 & 14
            long r8 = androidx.compose.material3.ColorSchemeKt.m1242contentColorForek8zF_U(r6, r2, r8)
            r3 = r3 & r20
            goto L_0x017f
        L_0x017e:
            r8 = r13
        L_0x017f:
            if (r15 == 0) goto L_0x0187
            androidx.compose.material3.BottomAppBarDefaults r10 = androidx.compose.material3.BottomAppBarDefaults.INSTANCE
            float r10 = r10.m1139getContainerElevationD9Ej5fM()
        L_0x0187:
            if (r17 == 0) goto L_0x0190
            androidx.compose.material3.BottomAppBarDefaults r13 = androidx.compose.material3.BottomAppBarDefaults.INSTANCE
            androidx.compose.foundation.layout.PaddingValues r13 = r13.getContentPadding()
            goto L_0x0192
        L_0x0190:
            r13 = r35
        L_0x0192:
            r14 = r12 & 128(0x80, float:1.794E-43)
            if (r14 == 0) goto L_0x01a3
            androidx.compose.material3.BottomAppBarDefaults r14 = androidx.compose.material3.BottomAppBarDefaults.INSTANCE
            androidx.compose.foundation.layout.WindowInsets r14 = r14.getWindowInsets(r2, r5)
            r15 = -29360129(0xfffffffffe3fffff, float:-6.380294E37)
            r3 = r3 & r15
            r25 = r14
            goto L_0x01a5
        L_0x01a3:
            r25 = r36
        L_0x01a5:
            r26 = r13
            r13 = r3
            r3 = r26
        L_0x01aa:
            r2.endDefaults()
            boolean r14 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r14 == 0) goto L_0x01bd
            r14 = -1
            java.lang.String r15 = "androidx.compose.material3.BottomAppBar (AppBar.kt:394)"
            r5 = 2141738945(0x7fa857c1, float:NaN)
            androidx.compose.runtime.ComposerKt.traceEventStart(r5, r13, r14, r15)
        L_0x01bd:
            androidx.compose.material3.AppBarKt$BottomAppBar$1 r5 = new androidx.compose.material3.AppBarKt$BottomAppBar$1
            r5.<init>(r1, r13, r4)
            r14 = 1974005449(0x75a8eec9, float:4.282954E32)
            r15 = 1
            androidx.compose.runtime.internal.ComposableLambda r5 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(r2, r14, r15, r5)
            r21 = r5
            kotlin.jvm.functions.Function3 r21 = (kotlin.jvm.functions.Function3) r21
            int r5 = r13 >> 3
            r5 = r5 & 14
            r5 = r5 | r18
            r14 = 6
            int r13 = r13 >> r14
            r14 = r13 & 112(0x70, float:1.57E-43)
            r5 = r5 | r14
            r14 = r13 & 896(0x380, float:1.256E-42)
            r5 = r5 | r14
            r14 = r13 & 7168(0x1c00, float:1.0045E-41)
            r5 = r5 | r14
            r14 = 57344(0xe000, float:8.0356E-41)
            r14 = r14 & r13
            r5 = r5 | r14
            r13 = r13 & r16
            r23 = r5 | r13
            r24 = 0
            r13 = r0
            r14 = r6
            r16 = r8
            r18 = r10
            r19 = r3
            r20 = r25
            r22 = r2
            m1123BottomAppBar1oL4kX8(r13, r14, r16, r18, r19, r20, r21, r22, r23, r24)
            boolean r5 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r5 == 0) goto L_0x0202
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L_0x0202:
            r13 = r3
            r3 = r0
        L_0x0204:
            androidx.compose.runtime.ScopeUpdateScope r14 = r2.endRestartGroup()
            if (r14 != 0) goto L_0x020b
            goto L_0x0224
        L_0x020b:
            androidx.compose.material3.AppBarKt$BottomAppBar$2 r15 = new androidx.compose.material3.AppBarKt$BottomAppBar$2
            r0 = r15
            r1 = r27
            r2 = r3
            r3 = r4
            r4 = r6
            r6 = r8
            r8 = r10
            r9 = r13
            r10 = r25
            r11 = r38
            r12 = r39
            r0.<init>(r1, r2, r3, r4, r6, r8, r9, r10, r11, r12)
            kotlin.jvm.functions.Function2 r15 = (kotlin.jvm.functions.Function2) r15
            r14.updateScope(r15)
        L_0x0224:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.AppBarKt.m1124BottomAppBarSnr_uVM(kotlin.jvm.functions.Function3, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function2, long, long, float, androidx.compose.foundation.layout.PaddingValues, androidx.compose.foundation.layout.WindowInsets, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:113:0x0175  */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x01c4  */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x01d2  */
    /* JADX WARNING: Removed duplicated region for block: B:122:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x008f  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0092  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00ae  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00c2  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00c8  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x00cd  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x00f0  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x00f7  */
    /* renamed from: BottomAppBar-1oL4kX8  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m1123BottomAppBar1oL4kX8(androidx.compose.ui.Modifier r24, long r25, long r27, float r29, androidx.compose.foundation.layout.PaddingValues r30, androidx.compose.foundation.layout.WindowInsets r31, kotlin.jvm.functions.Function3<? super androidx.compose.foundation.layout.RowScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r32, androidx.compose.runtime.Composer r33, int r34, int r35) {
        /*
            r9 = r32
            r10 = r34
            java.lang.String r0 = "content"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            r0 = -1391700845(0xffffffffad0c5493, float:-7.976858E-12)
            r1 = r33
            androidx.compose.runtime.Composer r1 = r1.startRestartGroup(r0)
            java.lang.String r2 = "C(BottomAppBar)P(4,0:c#ui.graphics.Color,2:c#ui.graphics.Color,5:c#ui.unit.Dp,3,6)456@22906L14,457@22948L31,460@23174L12,468@23508L9,463@23241L693:AppBar.kt#uh7d8r"
            androidx.compose.runtime.ComposerKt.sourceInformation(r1, r2)
            r2 = r35 & 1
            if (r2 == 0) goto L_0x0022
            r3 = r10 | 6
            r4 = r3
            r3 = r24
            goto L_0x0036
        L_0x0022:
            r3 = r10 & 14
            if (r3 != 0) goto L_0x0033
            r3 = r24
            boolean r4 = r1.changed((java.lang.Object) r3)
            if (r4 == 0) goto L_0x0030
            r4 = 4
            goto L_0x0031
        L_0x0030:
            r4 = 2
        L_0x0031:
            r4 = r4 | r10
            goto L_0x0036
        L_0x0033:
            r3 = r24
            r4 = r10
        L_0x0036:
            r5 = r10 & 112(0x70, float:1.57E-43)
            if (r5 != 0) goto L_0x004f
            r5 = r35 & 2
            if (r5 != 0) goto L_0x0049
            r5 = r25
            boolean r7 = r1.changed((long) r5)
            if (r7 == 0) goto L_0x004b
            r7 = 32
            goto L_0x004d
        L_0x0049:
            r5 = r25
        L_0x004b:
            r7 = 16
        L_0x004d:
            r4 = r4 | r7
            goto L_0x0051
        L_0x004f:
            r5 = r25
        L_0x0051:
            r7 = r10 & 896(0x380, float:1.256E-42)
            if (r7 != 0) goto L_0x006a
            r7 = r35 & 4
            if (r7 != 0) goto L_0x0064
            r7 = r27
            boolean r11 = r1.changed((long) r7)
            if (r11 == 0) goto L_0x0066
            r11 = 256(0x100, float:3.59E-43)
            goto L_0x0068
        L_0x0064:
            r7 = r27
        L_0x0066:
            r11 = 128(0x80, float:1.794E-43)
        L_0x0068:
            r4 = r4 | r11
            goto L_0x006c
        L_0x006a:
            r7 = r27
        L_0x006c:
            r11 = r35 & 8
            if (r11 == 0) goto L_0x0073
            r4 = r4 | 3072(0xc00, float:4.305E-42)
            goto L_0x0086
        L_0x0073:
            r12 = r10 & 7168(0x1c00, float:1.0045E-41)
            if (r12 != 0) goto L_0x0086
            r12 = r29
            boolean r13 = r1.changed((float) r12)
            if (r13 == 0) goto L_0x0082
            r13 = 2048(0x800, float:2.87E-42)
            goto L_0x0084
        L_0x0082:
            r13 = 1024(0x400, float:1.435E-42)
        L_0x0084:
            r4 = r4 | r13
            goto L_0x0088
        L_0x0086:
            r12 = r29
        L_0x0088:
            r13 = r35 & 16
            r14 = 57344(0xe000, float:8.0356E-41)
            if (r13 == 0) goto L_0x0092
            r4 = r4 | 24576(0x6000, float:3.4438E-41)
            goto L_0x00a6
        L_0x0092:
            r15 = r10 & r14
            if (r15 != 0) goto L_0x00a6
            r15 = r30
            boolean r16 = r1.changed((java.lang.Object) r15)
            if (r16 == 0) goto L_0x00a1
            r16 = 16384(0x4000, float:2.2959E-41)
            goto L_0x00a3
        L_0x00a1:
            r16 = 8192(0x2000, float:1.14794E-41)
        L_0x00a3:
            r4 = r4 | r16
            goto L_0x00a8
        L_0x00a6:
            r15 = r30
        L_0x00a8:
            r16 = 458752(0x70000, float:6.42848E-40)
            r16 = r10 & r16
            if (r16 != 0) goto L_0x00c2
            r16 = r35 & 32
            r14 = r31
            if (r16 != 0) goto L_0x00bd
            boolean r16 = r1.changed((java.lang.Object) r14)
            if (r16 == 0) goto L_0x00bd
            r16 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00bf
        L_0x00bd:
            r16 = 65536(0x10000, float:9.18355E-41)
        L_0x00bf:
            r4 = r4 | r16
            goto L_0x00c4
        L_0x00c2:
            r14 = r31
        L_0x00c4:
            r16 = r35 & 64
            if (r16 == 0) goto L_0x00cd
            r16 = 1572864(0x180000, float:2.204052E-39)
        L_0x00ca:
            r4 = r4 | r16
            goto L_0x00df
        L_0x00cd:
            r16 = 3670016(0x380000, float:5.142788E-39)
            r16 = r10 & r16
            if (r16 != 0) goto L_0x00df
            boolean r16 = r1.changedInstance(r9)
            if (r16 == 0) goto L_0x00dc
            r16 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00ca
        L_0x00dc:
            r16 = 524288(0x80000, float:7.34684E-40)
            goto L_0x00ca
        L_0x00df:
            r16 = 2995931(0x2db6db, float:4.198194E-39)
            r0 = r4 & r16
            r3 = 599186(0x92492, float:8.39638E-40)
            if (r0 != r3) goto L_0x00f7
            boolean r0 = r1.getSkipping()
            if (r0 != 0) goto L_0x00f0
            goto L_0x00f7
        L_0x00f0:
            r1.skipToGroupEnd()
            r2 = r24
            goto L_0x01cb
        L_0x00f7:
            r1.startDefaults()
            r0 = r10 & 1
            r3 = 6
            if (r0 == 0) goto L_0x0124
            boolean r0 = r1.getDefaultsInvalid()
            if (r0 == 0) goto L_0x0106
            goto L_0x0124
        L_0x0106:
            r1.skipToGroupEnd()
            r0 = r35 & 2
            if (r0 == 0) goto L_0x010f
            r4 = r4 & -113(0xffffffffffffff8f, float:NaN)
        L_0x010f:
            r0 = r35 & 4
            if (r0 == 0) goto L_0x0115
            r4 = r4 & -897(0xfffffffffffffc7f, float:NaN)
        L_0x0115:
            r0 = r35 & 32
            if (r0 == 0) goto L_0x011d
            r0 = -458753(0xfffffffffff8ffff, float:NaN)
            r4 = r4 & r0
        L_0x011d:
            r0 = r24
        L_0x011f:
            r11 = r4
            r2 = r12
            r4 = r15
            r15 = r14
            goto L_0x016c
        L_0x0124:
            if (r2 == 0) goto L_0x012b
            androidx.compose.ui.Modifier$Companion r0 = androidx.compose.ui.Modifier.Companion
            androidx.compose.ui.Modifier r0 = (androidx.compose.ui.Modifier) r0
            goto L_0x012d
        L_0x012b:
            r0 = r24
        L_0x012d:
            r2 = r35 & 2
            if (r2 == 0) goto L_0x0139
            androidx.compose.material3.BottomAppBarDefaults r2 = androidx.compose.material3.BottomAppBarDefaults.INSTANCE
            long r5 = r2.getContainerColor(r1, r3)
            r4 = r4 & -113(0xffffffffffffff8f, float:NaN)
        L_0x0139:
            r2 = r35 & 4
            if (r2 == 0) goto L_0x0148
            int r2 = r4 >> 3
            r2 = r2 & 14
            long r7 = androidx.compose.material3.ColorSchemeKt.m1242contentColorForek8zF_U(r5, r1, r2)
            r2 = r4 & -897(0xfffffffffffffc7f, float:NaN)
            r4 = r2
        L_0x0148:
            if (r11 == 0) goto L_0x0151
            androidx.compose.material3.BottomAppBarDefaults r2 = androidx.compose.material3.BottomAppBarDefaults.INSTANCE
            float r2 = r2.m1139getContainerElevationD9Ej5fM()
            r12 = r2
        L_0x0151:
            if (r13 == 0) goto L_0x015a
            androidx.compose.material3.BottomAppBarDefaults r2 = androidx.compose.material3.BottomAppBarDefaults.INSTANCE
            androidx.compose.foundation.layout.PaddingValues r2 = r2.getContentPadding()
            r15 = r2
        L_0x015a:
            r2 = r35 & 32
            if (r2 == 0) goto L_0x011f
            androidx.compose.material3.BottomAppBarDefaults r2 = androidx.compose.material3.BottomAppBarDefaults.INSTANCE
            androidx.compose.foundation.layout.WindowInsets r2 = r2.getWindowInsets(r1, r3)
            r11 = -458753(0xfffffffffff8ffff, float:NaN)
            r4 = r4 & r11
            r11 = r4
            r4 = r15
            r15 = r2
            r2 = r12
        L_0x016c:
            r1.endDefaults()
            boolean r12 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r12 == 0) goto L_0x017f
            r12 = -1
            java.lang.String r13 = "androidx.compose.material3.BottomAppBar (AppBar.kt:454)"
            r14 = -1391700845(0xffffffffad0c5493, float:-7.976858E-12)
            androidx.compose.runtime.ComposerKt.traceEventStart(r14, r11, r12, r13)
        L_0x017f:
            androidx.compose.material3.tokens.BottomAppBarTokens r12 = androidx.compose.material3.tokens.BottomAppBarTokens.INSTANCE
            androidx.compose.material3.tokens.ShapeKeyTokens r12 = r12.getContainerShape()
            androidx.compose.ui.graphics.Shape r12 = androidx.compose.material3.ShapesKt.toShape(r12, r1, r3)
            r18 = 0
            r19 = 0
            androidx.compose.material3.AppBarKt$BottomAppBar$3 r3 = new androidx.compose.material3.AppBarKt$BottomAppBar$3
            r3.<init>(r15, r4, r9, r11)
            r13 = -396569832(0xffffffffe85cd318, float:-4.1712585E24)
            r14 = 1
            androidx.compose.runtime.internal.ComposableLambda r3 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(r1, r13, r14, r3)
            r20 = r3
            kotlin.jvm.functions.Function2 r20 = (kotlin.jvm.functions.Function2) r20
            r3 = r11 & 14
            r13 = 12582912(0xc00000, float:1.7632415E-38)
            r3 = r3 | r13
            int r11 = r11 << 3
            r13 = r11 & 896(0x380, float:1.256E-42)
            r3 = r3 | r13
            r13 = r11 & 7168(0x1c00, float:1.0045E-41)
            r3 = r3 | r13
            r13 = 57344(0xe000, float:8.0356E-41)
            r11 = r11 & r13
            r22 = r3 | r11
            r23 = 96
            r11 = r0
            r13 = r5
            r3 = r15
            r15 = r7
            r17 = r2
            r21 = r1
            androidx.compose.material3.SurfaceKt.m1641SurfaceT9BRK9s(r11, r12, r13, r15, r17, r18, r19, r20, r21, r22, r23)
            boolean r11 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r11 == 0) goto L_0x01c7
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L_0x01c7:
            r12 = r2
            r14 = r3
            r15 = r4
            r2 = r0
        L_0x01cb:
            androidx.compose.runtime.ScopeUpdateScope r13 = r1.endRestartGroup()
            if (r13 != 0) goto L_0x01d2
            goto L_0x01ec
        L_0x01d2:
            androidx.compose.material3.AppBarKt$BottomAppBar$4 r16 = new androidx.compose.material3.AppBarKt$BottomAppBar$4
            r0 = r16
            r1 = r2
            r2 = r5
            r4 = r7
            r6 = r12
            r7 = r15
            r8 = r14
            r9 = r32
            r10 = r34
            r11 = r35
            r0.<init>(r1, r2, r4, r6, r7, r8, r9, r10, r11)
            r0 = r16
            kotlin.jvm.functions.Function2 r0 = (kotlin.jvm.functions.Function2) r0
            r13.updateScope(r0)
        L_0x01ec:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.AppBarKt.m1123BottomAppBar1oL4kX8(androidx.compose.ui.Modifier, long, long, float, androidx.compose.foundation.layout.PaddingValues, androidx.compose.foundation.layout.WindowInsets, kotlin.jvm.functions.Function3, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: kotlin.jvm.functions.Function0} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final androidx.compose.material3.TopAppBarState rememberTopAppBarState(float r7, float r8, float r9, androidx.compose.runtime.Composer r10, int r11, int r12) {
        /*
            r0 = 1801969826(0x6b67e0a2, float:2.8032266E26)
            r10.startReplaceableGroup(r0)
            java.lang.String r1 = "C(rememberTopAppBarState)P(2,1)799@38640L145,799@38593L192:AppBar.kt#uh7d8r"
            androidx.compose.runtime.ComposerKt.sourceInformation(r10, r1)
            r1 = r12 & 1
            if (r1 == 0) goto L_0x0012
            r7 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
        L_0x0012:
            r1 = r12 & 2
            r2 = 0
            if (r1 == 0) goto L_0x0018
            r8 = r2
        L_0x0018:
            r12 = r12 & 4
            if (r12 == 0) goto L_0x001d
            r9 = r2
        L_0x001d:
            boolean r12 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r12 == 0) goto L_0x002a
            r12 = -1
            java.lang.String r1 = "androidx.compose.material3.rememberTopAppBarState (AppBar.kt:794)"
            androidx.compose.runtime.ComposerKt.traceEventStart(r0, r11, r12, r1)
        L_0x002a:
            r11 = 0
            java.lang.Object[] r0 = new java.lang.Object[r11]
            androidx.compose.material3.TopAppBarState$Companion r11 = androidx.compose.material3.TopAppBarState.Companion
            androidx.compose.runtime.saveable.Saver r1 = r11.getSaver()
            r2 = 0
            java.lang.Float r11 = java.lang.Float.valueOf(r7)
            java.lang.Float r12 = java.lang.Float.valueOf(r8)
            java.lang.Float r3 = java.lang.Float.valueOf(r9)
            r4 = 1618982084(0x607fb4c4, float:7.370227E19)
            r10.startReplaceableGroup(r4)
            java.lang.String r4 = "CC(remember)P(1,2,3):Composables.kt#9igjgp"
            androidx.compose.runtime.ComposerKt.sourceInformation(r10, r4)
            boolean r11 = r10.changed((java.lang.Object) r11)
            boolean r12 = r10.changed((java.lang.Object) r12)
            r11 = r11 | r12
            boolean r12 = r10.changed((java.lang.Object) r3)
            r11 = r11 | r12
            java.lang.Object r12 = r10.rememberedValue()
            if (r11 != 0) goto L_0x0067
            androidx.compose.runtime.Composer$Companion r11 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r11 = r11.getEmpty()
            if (r12 != r11) goto L_0x0072
        L_0x0067:
            androidx.compose.material3.AppBarKt$rememberTopAppBarState$1$1 r11 = new androidx.compose.material3.AppBarKt$rememberTopAppBarState$1$1
            r11.<init>(r7, r8, r9)
            r12 = r11
            kotlin.jvm.functions.Function0 r12 = (kotlin.jvm.functions.Function0) r12
            r10.updateRememberedValue(r12)
        L_0x0072:
            r10.endReplaceableGroup()
            r3 = r12
            kotlin.jvm.functions.Function0 r3 = (kotlin.jvm.functions.Function0) r3
            r5 = 72
            r6 = 4
            r4 = r10
            java.lang.Object r7 = androidx.compose.runtime.saveable.RememberSaveableKt.rememberSaveable((java.lang.Object[]) r0, r1, (java.lang.String) r2, r3, (androidx.compose.runtime.Composer) r4, (int) r5, (int) r6)
            androidx.compose.material3.TopAppBarState r7 = (androidx.compose.material3.TopAppBarState) r7
            boolean r8 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r8 == 0) goto L_0x008b
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L_0x008b:
            r10.endReplaceableGroup()
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.AppBarKt.rememberTopAppBarState(float, float, float, androidx.compose.runtime.Composer, int, int):androidx.compose.material3.TopAppBarState");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r30v0, resolved type: kotlin.jvm.functions.Function3} */
    /* access modifiers changed from: private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:139:0x02e8  */
    /* JADX WARNING: Removed duplicated region for block: B:141:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x00c1  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00c7  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x00de  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x00e2  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x00f7  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x00fb  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x011d  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x0122  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void SingleRowTopAppBar(androidx.compose.ui.Modifier r34, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r35, androidx.compose.ui.text.TextStyle r36, boolean r37, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r38, kotlin.jvm.functions.Function3<? super androidx.compose.foundation.layout.RowScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r39, androidx.compose.foundation.layout.WindowInsets r40, androidx.compose.material3.TopAppBarColors r41, androidx.compose.material3.TopAppBarScrollBehavior r42, androidx.compose.runtime.Composer r43, int r44, int r45) {
        /*
            r6 = r39
            r5 = r41
            r4 = r42
            r3 = r44
            r2 = r45
            r0 = 1841601619(0x6dc49c53, float:7.606006E27)
            r1 = r43
            androidx.compose.runtime.Composer r1 = r1.startRestartGroup(r0)
            java.lang.String r7 = "C(SingleRowTopAppBar)P(3,6,7,1,4!1,8)*1035@47262L7,1036@47335L167,1036@47324L178,1049@48098L24,1048@48048L151,1086@49505L1166:AppBar.kt#uh7d8r"
            androidx.compose.runtime.ComposerKt.sourceInformation(r1, r7)
            r7 = r2 & 1
            if (r7 == 0) goto L_0x0022
            r8 = r3 | 6
            r9 = r8
            r8 = r34
            goto L_0x0036
        L_0x0022:
            r8 = r3 & 14
            if (r8 != 0) goto L_0x0033
            r8 = r34
            boolean r9 = r1.changed((java.lang.Object) r8)
            if (r9 == 0) goto L_0x0030
            r9 = 4
            goto L_0x0031
        L_0x0030:
            r9 = 2
        L_0x0031:
            r9 = r9 | r3
            goto L_0x0036
        L_0x0033:
            r8 = r34
            r9 = r3
        L_0x0036:
            r10 = r2 & 2
            if (r10 == 0) goto L_0x003f
            r9 = r9 | 48
            r15 = r35
            goto L_0x0051
        L_0x003f:
            r10 = r3 & 112(0x70, float:1.57E-43)
            r15 = r35
            if (r10 != 0) goto L_0x0051
            boolean r10 = r1.changedInstance(r15)
            if (r10 == 0) goto L_0x004e
            r10 = 32
            goto L_0x0050
        L_0x004e:
            r10 = 16
        L_0x0050:
            r9 = r9 | r10
        L_0x0051:
            r10 = r2 & 4
            if (r10 == 0) goto L_0x005a
            r9 = r9 | 384(0x180, float:5.38E-43)
            r14 = r36
            goto L_0x006c
        L_0x005a:
            r10 = r3 & 896(0x380, float:1.256E-42)
            r14 = r36
            if (r10 != 0) goto L_0x006c
            boolean r10 = r1.changed((java.lang.Object) r14)
            if (r10 == 0) goto L_0x0069
            r10 = 256(0x100, float:3.59E-43)
            goto L_0x006b
        L_0x0069:
            r10 = 128(0x80, float:1.794E-43)
        L_0x006b:
            r9 = r9 | r10
        L_0x006c:
            r10 = r2 & 8
            if (r10 == 0) goto L_0x0075
            r9 = r9 | 3072(0xc00, float:4.305E-42)
            r13 = r37
            goto L_0x0087
        L_0x0075:
            r10 = r3 & 7168(0x1c00, float:1.0045E-41)
            r13 = r37
            if (r10 != 0) goto L_0x0087
            boolean r10 = r1.changed((boolean) r13)
            if (r10 == 0) goto L_0x0084
            r10 = 2048(0x800, float:2.87E-42)
            goto L_0x0086
        L_0x0084:
            r10 = 1024(0x400, float:1.435E-42)
        L_0x0086:
            r9 = r9 | r10
        L_0x0087:
            r10 = r2 & 16
            if (r10 == 0) goto L_0x0090
            r9 = r9 | 24576(0x6000, float:3.4438E-41)
            r12 = r38
            goto L_0x00a4
        L_0x0090:
            r10 = 57344(0xe000, float:8.0356E-41)
            r10 = r10 & r3
            r12 = r38
            if (r10 != 0) goto L_0x00a4
            boolean r10 = r1.changedInstance(r12)
            if (r10 == 0) goto L_0x00a1
            r10 = 16384(0x4000, float:2.2959E-41)
            goto L_0x00a3
        L_0x00a1:
            r10 = 8192(0x2000, float:1.14794E-41)
        L_0x00a3:
            r9 = r9 | r10
        L_0x00a4:
            r10 = r2 & 32
            if (r10 == 0) goto L_0x00ac
            r10 = 196608(0x30000, float:2.75506E-40)
        L_0x00aa:
            r9 = r9 | r10
            goto L_0x00bd
        L_0x00ac:
            r10 = 458752(0x70000, float:6.42848E-40)
            r10 = r10 & r3
            if (r10 != 0) goto L_0x00bd
            boolean r10 = r1.changedInstance(r6)
            if (r10 == 0) goto L_0x00ba
            r10 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00aa
        L_0x00ba:
            r10 = 65536(0x10000, float:9.18355E-41)
            goto L_0x00aa
        L_0x00bd:
            r10 = r2 & 64
            if (r10 == 0) goto L_0x00c7
            r10 = 1572864(0x180000, float:2.204052E-39)
            r9 = r9 | r10
            r11 = r40
            goto L_0x00da
        L_0x00c7:
            r10 = 3670016(0x380000, float:5.142788E-39)
            r10 = r10 & r3
            r11 = r40
            if (r10 != 0) goto L_0x00da
            boolean r10 = r1.changed((java.lang.Object) r11)
            if (r10 == 0) goto L_0x00d7
            r10 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00d9
        L_0x00d7:
            r10 = 524288(0x80000, float:7.34684E-40)
        L_0x00d9:
            r9 = r9 | r10
        L_0x00da:
            r10 = r2 & 128(0x80, float:1.794E-43)
            if (r10 == 0) goto L_0x00e2
            r10 = 12582912(0xc00000, float:1.7632415E-38)
        L_0x00e0:
            r9 = r9 | r10
            goto L_0x00f3
        L_0x00e2:
            r10 = 29360128(0x1c00000, float:7.052966E-38)
            r10 = r10 & r3
            if (r10 != 0) goto L_0x00f3
            boolean r10 = r1.changed((java.lang.Object) r5)
            if (r10 == 0) goto L_0x00f0
            r10 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00e0
        L_0x00f0:
            r10 = 4194304(0x400000, float:5.877472E-39)
            goto L_0x00e0
        L_0x00f3:
            r10 = r2 & 256(0x100, float:3.59E-43)
            if (r10 == 0) goto L_0x00fb
            r10 = 100663296(0x6000000, float:2.4074124E-35)
        L_0x00f9:
            r9 = r9 | r10
            goto L_0x010c
        L_0x00fb:
            r10 = 234881024(0xe000000, float:1.5777218E-30)
            r10 = r10 & r3
            if (r10 != 0) goto L_0x010c
            boolean r10 = r1.changed((java.lang.Object) r4)
            if (r10 == 0) goto L_0x0109
            r10 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x00f9
        L_0x0109:
            r10 = 33554432(0x2000000, float:9.403955E-38)
            goto L_0x00f9
        L_0x010c:
            r10 = r9
            r9 = 191739611(0xb6db6db, float:4.5782105E-32)
            r9 = r9 & r10
            r0 = 38347922(0x2492492, float:1.4777643E-37)
            if (r9 != r0) goto L_0x0122
            boolean r0 = r1.getSkipping()
            if (r0 != 0) goto L_0x011d
            goto L_0x0122
        L_0x011d:
            r1.skipToGroupEnd()
            goto L_0x02e1
        L_0x0122:
            if (r7 == 0) goto L_0x0129
            androidx.compose.ui.Modifier$Companion r0 = androidx.compose.ui.Modifier.Companion
            androidx.compose.ui.Modifier r0 = (androidx.compose.ui.Modifier) r0
            goto L_0x012a
        L_0x0129:
            r0 = r8
        L_0x012a:
            boolean r7 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r7 == 0) goto L_0x013a
            r7 = -1
            java.lang.String r8 = "androidx.compose.material3.SingleRowTopAppBar (AppBar.kt:1021)"
            r9 = 1841601619(0x6dc49c53, float:7.606006E27)
            androidx.compose.runtime.ComposerKt.traceEventStart(r9, r10, r7, r8)
        L_0x013a:
            androidx.compose.runtime.ProvidableCompositionLocal r7 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalDensity()
            androidx.compose.runtime.CompositionLocal r7 = (androidx.compose.runtime.CompositionLocal) r7
            r8 = 2023513938(0x789c5f52, float:2.5372864E34)
            java.lang.String r9 = "CC:CompositionLocal.kt#9igjgp"
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(r1, r8, r9)
            java.lang.Object r7 = r1.consume(r7)
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(r1)
            androidx.compose.ui.unit.Density r7 = (androidx.compose.ui.unit.Density) r7
            androidx.compose.material3.tokens.TopAppBarSmallTokens r8 = androidx.compose.material3.tokens.TopAppBarSmallTokens.INSTANCE
            float r8 = r8.m2369getContainerHeightD9Ej5fM()
            float r7 = r7.m5607toPx0680j_4(r8)
            float r7 = -r7
            java.lang.Float r8 = java.lang.Float.valueOf(r7)
            r9 = 511388516(0x1e7b2b64, float:1.3296802E-20)
            r1.startReplaceableGroup(r9)
            java.lang.String r9 = "CC(remember)P(1,2):Composables.kt#9igjgp"
            androidx.compose.runtime.ComposerKt.sourceInformation(r1, r9)
            boolean r9 = r1.changed((java.lang.Object) r4)
            boolean r8 = r1.changed((java.lang.Object) r8)
            r8 = r8 | r9
            java.lang.Object r9 = r1.rememberedValue()
            if (r8 != 0) goto L_0x0182
            androidx.compose.runtime.Composer$Companion r8 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r8 = r8.getEmpty()
            if (r9 != r8) goto L_0x018d
        L_0x0182:
            androidx.compose.material3.AppBarKt$SingleRowTopAppBar$1$1 r8 = new androidx.compose.material3.AppBarKt$SingleRowTopAppBar$1$1
            r8.<init>(r4, r7)
            r9 = r8
            kotlin.jvm.functions.Function0 r9 = (kotlin.jvm.functions.Function0) r9
            r1.updateRememberedValue(r9)
        L_0x018d:
            r1.endReplaceableGroup()
            kotlin.jvm.functions.Function0 r9 = (kotlin.jvm.functions.Function0) r9
            r7 = 0
            androidx.compose.runtime.EffectsKt.SideEffect(r9, r1, r7)
            r8 = 0
            if (r4 == 0) goto L_0x01a4
            androidx.compose.material3.TopAppBarState r9 = r42.getState()
            if (r9 == 0) goto L_0x01a4
            float r9 = r9.getOverlappedFraction()
            goto L_0x01a5
        L_0x01a4:
            r9 = r8
        L_0x01a5:
            r16 = 1008981770(0x3c23d70a, float:0.01)
            int r9 = (r9 > r16 ? 1 : (r9 == r16 ? 0 : -1))
            if (r9 <= 0) goto L_0x01af
            r9 = 1065353216(0x3f800000, float:1.0)
            goto L_0x01b0
        L_0x01af:
            r9 = r8
        L_0x01b0:
            int r16 = r10 >> 18
            r7 = r16 & 112(0x70, float:1.57E-43)
            long r16 = r5.m1846containerColorXeAY9LY$material3_release(r9, r1, r7)
            r7 = 1137180672(0x43c80000, float:400.0)
            r9 = 5
            r14 = 0
            androidx.compose.animation.core.SpringSpec r7 = androidx.compose.animation.core.AnimationSpecKt.spring$default(r8, r7, r14, r9, r14)
            r9 = r7
            androidx.compose.animation.core.AnimationSpec r9 = (androidx.compose.animation.core.AnimationSpec) r9
            r18 = 0
            r19 = 0
            r20 = 48
            r21 = 12
            r7 = r16
            r23 = r10
            r10 = r18
            r11 = r19
            r12 = r1
            r13 = r20
            r2 = r14
            r14 = r21
            androidx.compose.runtime.State r7 = androidx.compose.animation.SingleValueAnimationKt.m96animateColorAsStateeuL9pac(r7, r9, r10, r11, r12, r13, r14)
            androidx.compose.material3.AppBarKt$SingleRowTopAppBar$actionsRow$1 r8 = new androidx.compose.material3.AppBarKt$SingleRowTopAppBar$actionsRow$1
            r14 = r23
            r8.<init>(r6, r14)
            r9 = 1520880938(0x5aa6cd2a, float:2.34752132E16)
            r13 = 1
            androidx.compose.runtime.internal.ComposableLambda r8 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(r1, r9, r13, r8)
            r16 = r8
            kotlin.jvm.functions.Function2 r16 = (kotlin.jvm.functions.Function2) r16
            r8 = -1008376318(0xffffffffc3e56602, float:-458.79694)
            r1.startReplaceableGroup(r8)
            java.lang.String r8 = "1066@48747L118,1066@48724L141,1069@48895L255"
            androidx.compose.runtime.ComposerKt.sourceInformation(r1, r8)
            if (r4 == 0) goto L_0x027a
            boolean r8 = r42.isPinned()
            if (r8 != 0) goto L_0x027a
            androidx.compose.ui.Modifier$Companion r8 = androidx.compose.ui.Modifier.Companion
            androidx.compose.foundation.gestures.Orientation r25 = androidx.compose.foundation.gestures.Orientation.Vertical
            r9 = 1157296644(0x44faf204, float:2007.563)
            r1.startReplaceableGroup(r9)
            java.lang.String r10 = "CC(remember)P(1):Composables.kt#9igjgp"
            androidx.compose.runtime.ComposerKt.sourceInformation(r1, r10)
            boolean r11 = r1.changed((java.lang.Object) r4)
            java.lang.Object r12 = r1.rememberedValue()
            if (r11 != 0) goto L_0x0224
            androidx.compose.runtime.Composer$Companion r11 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r11 = r11.getEmpty()
            if (r12 != r11) goto L_0x022f
        L_0x0224:
            androidx.compose.material3.AppBarKt$SingleRowTopAppBar$appBarDragModifier$1$1 r11 = new androidx.compose.material3.AppBarKt$SingleRowTopAppBar$appBarDragModifier$1$1
            r11.<init>(r4)
            r12 = r11
            kotlin.jvm.functions.Function1 r12 = (kotlin.jvm.functions.Function1) r12
            r1.updateRememberedValue(r12)
        L_0x022f:
            r1.endReplaceableGroup()
            kotlin.jvm.functions.Function1 r12 = (kotlin.jvm.functions.Function1) r12
            r11 = 0
            androidx.compose.foundation.gestures.DraggableState r24 = androidx.compose.foundation.gestures.DraggableKt.rememberDraggableState(r12, r1, r11)
            r23 = r8
            androidx.compose.ui.Modifier r23 = (androidx.compose.ui.Modifier) r23
            r26 = 0
            r27 = 0
            r28 = 0
            r29 = 0
            r1.startReplaceableGroup(r9)
            androidx.compose.runtime.ComposerKt.sourceInformation(r1, r10)
            boolean r8 = r1.changed((java.lang.Object) r4)
            java.lang.Object r9 = r1.rememberedValue()
            if (r8 != 0) goto L_0x025d
            androidx.compose.runtime.Composer$Companion r8 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r8 = r8.getEmpty()
            if (r9 != r8) goto L_0x0268
        L_0x025d:
            androidx.compose.material3.AppBarKt$SingleRowTopAppBar$appBarDragModifier$2$1 r8 = new androidx.compose.material3.AppBarKt$SingleRowTopAppBar$appBarDragModifier$2$1
            r8.<init>(r4, r2)
            r9 = r8
            kotlin.jvm.functions.Function3 r9 = (kotlin.jvm.functions.Function3) r9
            r1.updateRememberedValue(r9)
        L_0x0268:
            r1.endReplaceableGroup()
            r30 = r9
            kotlin.jvm.functions.Function3 r30 = (kotlin.jvm.functions.Function3) r30
            r31 = 0
            r32 = 188(0xbc, float:2.63E-43)
            r33 = 0
            androidx.compose.ui.Modifier r2 = androidx.compose.foundation.gestures.DraggableKt.draggable$default(r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33)
            goto L_0x027e
        L_0x027a:
            androidx.compose.ui.Modifier$Companion r2 = androidx.compose.ui.Modifier.Companion
            androidx.compose.ui.Modifier r2 = (androidx.compose.ui.Modifier) r2
        L_0x027e:
            r1.endReplaceableGroup()
            androidx.compose.ui.Modifier r2 = r0.then(r2)
            r17 = 0
            long r18 = SingleRowTopAppBar$lambda$3(r7)
            r20 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            androidx.compose.material3.AppBarKt$SingleRowTopAppBar$2 r12 = new androidx.compose.material3.AppBarKt$SingleRowTopAppBar$2
            r7 = r12
            r8 = r40
            r9 = r41
            r10 = r35
            r11 = r36
            r25 = r0
            r0 = r12
            r12 = r37
            r3 = r13
            r13 = r38
            r26 = r14
            r14 = r16
            r15 = r26
            r16 = r42
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16)
            r7 = 376925230(0x16776c2e, float:1.9986637E-25)
            androidx.compose.runtime.internal.ComposableLambda r0 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(r1, r7, r3, r0)
            r16 = r0
            kotlin.jvm.functions.Function2 r16 = (kotlin.jvm.functions.Function2) r16
            r0 = 12582912(0xc00000, float:1.7632415E-38)
            r3 = 122(0x7a, float:1.71E-43)
            r7 = r2
            r8 = r17
            r9 = r18
            r11 = r20
            r13 = r22
            r14 = r23
            r15 = r24
            r17 = r1
            r18 = r0
            r19 = r3
            androidx.compose.material3.SurfaceKt.m1641SurfaceT9BRK9s(r7, r8, r9, r11, r13, r14, r15, r16, r17, r18, r19)
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto L_0x02df
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L_0x02df:
            r8 = r25
        L_0x02e1:
            androidx.compose.runtime.ScopeUpdateScope r12 = r1.endRestartGroup()
            if (r12 != 0) goto L_0x02e8
            goto L_0x0308
        L_0x02e8:
            androidx.compose.material3.AppBarKt$SingleRowTopAppBar$3 r13 = new androidx.compose.material3.AppBarKt$SingleRowTopAppBar$3
            r0 = r13
            r1 = r8
            r2 = r35
            r3 = r36
            r4 = r37
            r5 = r38
            r6 = r39
            r7 = r40
            r8 = r41
            r9 = r42
            r10 = r44
            r11 = r45
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            kotlin.jvm.functions.Function2 r13 = (kotlin.jvm.functions.Function2) r13
            r12.updateScope(r13)
        L_0x0308:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.AppBarKt.SingleRowTopAppBar(androidx.compose.ui.Modifier, kotlin.jvm.functions.Function2, androidx.compose.ui.text.TextStyle, boolean, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function3, androidx.compose.foundation.layout.WindowInsets, androidx.compose.material3.TopAppBarColors, androidx.compose.material3.TopAppBarScrollBehavior, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r34v0, resolved type: kotlin.jvm.functions.Function3} */
    /* access modifiers changed from: private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x014b  */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x014e  */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x0165  */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x0168  */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x017b  */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x017e  */
    /* JADX WARNING: Removed duplicated region for block: B:139:0x01a3  */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x01ab  */
    /* JADX WARNING: Removed duplicated region for block: B:185:0x0387  */
    /* JADX WARNING: Removed duplicated region for block: B:189:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0083  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0086  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x009a  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x009d  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00b9  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00c0  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00d9  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00e0  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x00f9  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x00fd  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0112  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x0116  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x0131  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x0136  */
    /* renamed from: TwoRowsTopAppBar-tjU4iQQ  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m1126TwoRowsTopAppBartjU4iQQ(androidx.compose.ui.Modifier r39, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r40, androidx.compose.ui.text.TextStyle r41, float r42, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r43, androidx.compose.ui.text.TextStyle r44, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r45, kotlin.jvm.functions.Function3<? super androidx.compose.foundation.layout.RowScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r46, androidx.compose.foundation.layout.WindowInsets r47, androidx.compose.material3.TopAppBarColors r48, float r49, float r50, androidx.compose.material3.TopAppBarScrollBehavior r51, androidx.compose.runtime.Composer r52, int r53, int r54, int r55) {
        /*
            r4 = r42
            r8 = r46
            r7 = r48
            r6 = r49
            r5 = r50
            r3 = r51
            r2 = r53
            r1 = r54
            r0 = r55
            r9 = 210227552(0xc87d160, float:2.0926056E-31)
            r10 = r52
            androidx.compose.runtime.Composer r15 = r10.startRestartGroup(r9)
            java.lang.String r10 = "C(TwoRowsTopAppBar)P(3,9,11,10:c#ui.unit.Dp,7,8,4!1,12!1,2:c#ui.unit.Dp,5:c#ui.unit.Dp)*1146@51718L7,1154@52031L189,1154@52020L200,1166@52751L39,1166@52723L68,1203@54215L2301:AppBar.kt#uh7d8r"
            androidx.compose.runtime.ComposerKt.sourceInformation(r15, r10)
            r10 = r0 & 1
            if (r10 == 0) goto L_0x002a
            r13 = r2 | 6
            r14 = r13
            r13 = r39
            goto L_0x003e
        L_0x002a:
            r13 = r2 & 14
            if (r13 != 0) goto L_0x003b
            r13 = r39
            boolean r14 = r15.changed((java.lang.Object) r13)
            if (r14 == 0) goto L_0x0038
            r14 = 4
            goto L_0x0039
        L_0x0038:
            r14 = 2
        L_0x0039:
            r14 = r14 | r2
            goto L_0x003e
        L_0x003b:
            r13 = r39
            r14 = r2
        L_0x003e:
            r16 = r0 & 2
            r17 = 32
            r18 = 16
            if (r16 == 0) goto L_0x004b
            r14 = r14 | 48
            r9 = r40
            goto L_0x005e
        L_0x004b:
            r16 = r2 & 112(0x70, float:1.57E-43)
            r9 = r40
            if (r16 != 0) goto L_0x005e
            boolean r19 = r15.changedInstance(r9)
            if (r19 == 0) goto L_0x005a
            r19 = r17
            goto L_0x005c
        L_0x005a:
            r19 = r18
        L_0x005c:
            r14 = r14 | r19
        L_0x005e:
            r19 = r0 & 4
            r20 = 256(0x100, float:3.59E-43)
            r21 = 128(0x80, float:1.794E-43)
            if (r19 == 0) goto L_0x0069
            r14 = r14 | 384(0x180, float:5.38E-43)
            goto L_0x007d
        L_0x0069:
            r11 = r2 & 896(0x380, float:1.256E-42)
            if (r11 != 0) goto L_0x007d
            r11 = r41
            boolean r19 = r15.changed((java.lang.Object) r11)
            if (r19 == 0) goto L_0x0078
            r19 = r20
            goto L_0x007a
        L_0x0078:
            r19 = r21
        L_0x007a:
            r14 = r14 | r19
            goto L_0x007f
        L_0x007d:
            r11 = r41
        L_0x007f:
            r19 = r0 & 8
            if (r19 == 0) goto L_0x0086
            r14 = r14 | 3072(0xc00, float:4.305E-42)
            goto L_0x0096
        L_0x0086:
            r12 = r2 & 7168(0x1c00, float:1.0045E-41)
            if (r12 != 0) goto L_0x0096
            boolean r12 = r15.changed((float) r4)
            if (r12 == 0) goto L_0x0093
            r12 = 2048(0x800, float:2.87E-42)
            goto L_0x0095
        L_0x0093:
            r12 = 1024(0x400, float:1.435E-42)
        L_0x0095:
            r14 = r14 | r12
        L_0x0096:
            r12 = r0 & 16
            if (r12 == 0) goto L_0x009d
            r14 = r14 | 24576(0x6000, float:3.4438E-41)
            goto L_0x00b3
        L_0x009d:
            r12 = 57344(0xe000, float:8.0356E-41)
            r12 = r12 & r2
            if (r12 != 0) goto L_0x00b3
            r12 = r43
            boolean r22 = r15.changedInstance(r12)
            if (r22 == 0) goto L_0x00ae
            r22 = 16384(0x4000, float:2.2959E-41)
            goto L_0x00b0
        L_0x00ae:
            r22 = 8192(0x2000, float:1.14794E-41)
        L_0x00b0:
            r14 = r14 | r22
            goto L_0x00b5
        L_0x00b3:
            r12 = r43
        L_0x00b5:
            r22 = r0 & 32
            if (r22 == 0) goto L_0x00c0
            r22 = 196608(0x30000, float:2.75506E-40)
            r14 = r14 | r22
            r13 = r44
            goto L_0x00d5
        L_0x00c0:
            r22 = 458752(0x70000, float:6.42848E-40)
            r22 = r2 & r22
            r13 = r44
            if (r22 != 0) goto L_0x00d5
            boolean r22 = r15.changed((java.lang.Object) r13)
            if (r22 == 0) goto L_0x00d1
            r22 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00d3
        L_0x00d1:
            r22 = 65536(0x10000, float:9.18355E-41)
        L_0x00d3:
            r14 = r14 | r22
        L_0x00d5:
            r22 = r0 & 64
            if (r22 == 0) goto L_0x00e0
            r22 = 1572864(0x180000, float:2.204052E-39)
            r14 = r14 | r22
            r13 = r45
            goto L_0x00f5
        L_0x00e0:
            r22 = 3670016(0x380000, float:5.142788E-39)
            r22 = r2 & r22
            r13 = r45
            if (r22 != 0) goto L_0x00f5
            boolean r22 = r15.changedInstance(r13)
            if (r22 == 0) goto L_0x00f1
            r22 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00f3
        L_0x00f1:
            r22 = 524288(0x80000, float:7.34684E-40)
        L_0x00f3:
            r14 = r14 | r22
        L_0x00f5:
            r9 = r0 & 128(0x80, float:1.794E-43)
            if (r9 == 0) goto L_0x00fd
            r9 = 12582912(0xc00000, float:1.7632415E-38)
        L_0x00fb:
            r14 = r14 | r9
            goto L_0x010e
        L_0x00fd:
            r9 = 29360128(0x1c00000, float:7.052966E-38)
            r9 = r9 & r2
            if (r9 != 0) goto L_0x010e
            boolean r9 = r15.changedInstance(r8)
            if (r9 == 0) goto L_0x010b
            r9 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00fb
        L_0x010b:
            r9 = 4194304(0x400000, float:5.877472E-39)
            goto L_0x00fb
        L_0x010e:
            r9 = r0 & 256(0x100, float:3.59E-43)
            if (r9 == 0) goto L_0x0116
            r9 = 100663296(0x6000000, float:2.4074124E-35)
            r14 = r14 | r9
            goto L_0x012b
        L_0x0116:
            r9 = 234881024(0xe000000, float:1.5777218E-30)
            r9 = r9 & r2
            if (r9 != 0) goto L_0x012b
            r9 = r47
            boolean r22 = r15.changed((java.lang.Object) r9)
            if (r22 == 0) goto L_0x0126
            r22 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x0128
        L_0x0126:
            r22 = 33554432(0x2000000, float:9.403955E-38)
        L_0x0128:
            r14 = r14 | r22
            goto L_0x012d
        L_0x012b:
            r9 = r47
        L_0x012d:
            r9 = r0 & 512(0x200, float:7.175E-43)
            if (r9 == 0) goto L_0x0136
            r9 = 805306368(0x30000000, float:4.656613E-10)
        L_0x0133:
            r9 = r9 | r14
            r14 = r9
            goto L_0x0147
        L_0x0136:
            r9 = 1879048192(0x70000000, float:1.58456325E29)
            r9 = r9 & r2
            if (r9 != 0) goto L_0x0147
            boolean r9 = r15.changed((java.lang.Object) r7)
            if (r9 == 0) goto L_0x0144
            r9 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x0133
        L_0x0144:
            r9 = 268435456(0x10000000, float:2.5243549E-29)
            goto L_0x0133
        L_0x0147:
            r9 = r0 & 1024(0x400, float:1.435E-42)
            if (r9 == 0) goto L_0x014e
            r9 = r1 | 6
            goto L_0x0161
        L_0x014e:
            r9 = r1 & 14
            if (r9 != 0) goto L_0x0160
            boolean r9 = r15.changed((float) r6)
            if (r9 == 0) goto L_0x015b
            r19 = 4
            goto L_0x015d
        L_0x015b:
            r19 = 2
        L_0x015d:
            r9 = r1 | r19
            goto L_0x0161
        L_0x0160:
            r9 = r1
        L_0x0161:
            r2 = r0 & 2048(0x800, float:2.87E-42)
            if (r2 == 0) goto L_0x0168
            r9 = r9 | 48
            goto L_0x0177
        L_0x0168:
            r2 = r1 & 112(0x70, float:1.57E-43)
            if (r2 != 0) goto L_0x0177
            boolean r2 = r15.changed((float) r5)
            if (r2 == 0) goto L_0x0173
            goto L_0x0175
        L_0x0173:
            r17 = r18
        L_0x0175:
            r9 = r9 | r17
        L_0x0177:
            r2 = r0 & 4096(0x1000, float:5.74E-42)
            if (r2 == 0) goto L_0x017e
            r9 = r9 | 384(0x180, float:5.38E-43)
            goto L_0x018d
        L_0x017e:
            r2 = r1 & 896(0x380, float:1.256E-42)
            if (r2 != 0) goto L_0x018d
            boolean r2 = r15.changed((java.lang.Object) r3)
            if (r2 == 0) goto L_0x0189
            goto L_0x018b
        L_0x0189:
            r20 = r21
        L_0x018b:
            r9 = r9 | r20
        L_0x018d:
            r2 = 1533916891(0x5b6db6db, float:6.6910621E16)
            r2 = r2 & r14
            r0 = 306783378(0x12492492, float:6.3469493E-28)
            if (r2 != r0) goto L_0x01ab
            r0 = r9 & 731(0x2db, float:1.024E-42)
            r2 = 146(0x92, float:2.05E-43)
            if (r0 != r2) goto L_0x01ab
            boolean r0 = r15.getSkipping()
            if (r0 != 0) goto L_0x01a3
            goto L_0x01ab
        L_0x01a3:
            r15.skipToGroupEnd()
            r1 = r39
            r6 = r15
            goto L_0x0380
        L_0x01ab:
            if (r10 == 0) goto L_0x01b2
            androidx.compose.ui.Modifier$Companion r0 = androidx.compose.ui.Modifier.Companion
            androidx.compose.ui.Modifier r0 = (androidx.compose.ui.Modifier) r0
            goto L_0x01b4
        L_0x01b2:
            r0 = r39
        L_0x01b4:
            boolean r2 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r2 == 0) goto L_0x01c3
            java.lang.String r2 = "androidx.compose.material3.TwoRowsTopAppBar (AppBar.kt:1123)"
            r10 = 210227552(0xc87d160, float:2.0926056E-31)
            androidx.compose.runtime.ComposerKt.traceEventStart(r10, r14, r9, r2)
        L_0x01c3:
            int r2 = androidx.compose.ui.unit.Dp.m5625compareTo0680j_4(r49, r50)
            if (r2 <= 0) goto L_0x03b8
            kotlin.jvm.internal.Ref$FloatRef r2 = new kotlin.jvm.internal.Ref$FloatRef
            r2.<init>()
            kotlin.jvm.internal.Ref$FloatRef r10 = new kotlin.jvm.internal.Ref$FloatRef
            r10.<init>()
            kotlin.jvm.internal.Ref$IntRef r9 = new kotlin.jvm.internal.Ref$IntRef
            r9.<init>()
            androidx.compose.runtime.ProvidableCompositionLocal r16 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalDensity()
            r1 = r16
            androidx.compose.runtime.CompositionLocal r1 = (androidx.compose.runtime.CompositionLocal) r1
            r11 = 2023513938(0x789c5f52, float:2.5372864E34)
            java.lang.String r12 = "CC:CompositionLocal.kt#9igjgp"
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(r15, r11, r12)
            java.lang.Object r1 = r15.consume(r1)
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(r15)
            androidx.compose.ui.unit.Density r1 = (androidx.compose.ui.unit.Density) r1
            float r11 = r1.m5607toPx0680j_4(r5)
            r2.element = r11
            float r11 = r1.m5607toPx0680j_4(r6)
            r10.element = r11
            int r1 = r1.m5601roundToPx0680j_4(r4)
            r9.element = r1
            float r1 = r2.element
            java.lang.Float r1 = java.lang.Float.valueOf(r1)
            float r11 = r10.element
            java.lang.Float r11 = java.lang.Float.valueOf(r11)
            r12 = 1618982084(0x607fb4c4, float:7.370227E19)
            r15.startReplaceableGroup(r12)
            java.lang.String r12 = "CC(remember)P(1,2,3):Composables.kt#9igjgp"
            androidx.compose.runtime.ComposerKt.sourceInformation(r15, r12)
            boolean r12 = r15.changed((java.lang.Object) r3)
            boolean r1 = r15.changed((java.lang.Object) r1)
            r1 = r1 | r12
            boolean r11 = r15.changed((java.lang.Object) r11)
            r1 = r1 | r11
            java.lang.Object r11 = r15.rememberedValue()
            if (r1 != 0) goto L_0x0236
            androidx.compose.runtime.Composer$Companion r1 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r1 = r1.getEmpty()
            if (r11 != r1) goto L_0x0241
        L_0x0236:
            androidx.compose.material3.AppBarKt$TwoRowsTopAppBar$2$1 r1 = new androidx.compose.material3.AppBarKt$TwoRowsTopAppBar$2$1
            r1.<init>(r3, r2, r10)
            r11 = r1
            kotlin.jvm.functions.Function0 r11 = (kotlin.jvm.functions.Function0) r11
            r15.updateRememberedValue(r11)
        L_0x0241:
            r15.endReplaceableGroup()
            kotlin.jvm.functions.Function0 r11 = (kotlin.jvm.functions.Function0) r11
            r1 = 0
            androidx.compose.runtime.EffectsKt.SideEffect(r11, r15, r1)
            if (r3 == 0) goto L_0x0257
            androidx.compose.material3.TopAppBarState r11 = r51.getState()
            if (r11 == 0) goto L_0x0257
            float r11 = r11.getCollapsedFraction()
            goto L_0x0258
        L_0x0257:
            r11 = 0
        L_0x0258:
            int r12 = r14 >> 24
            r12 = r12 & 112(0x70, float:1.57E-43)
            long r16 = r7.m1846containerColorXeAY9LY$material3_release(r11, r15, r12)
            androidx.compose.ui.graphics.Color r12 = androidx.compose.ui.graphics.Color.m2811boximpl(r16)
            androidx.compose.runtime.State r12 = androidx.compose.runtime.SnapshotStateKt.rememberUpdatedState(r12, r15, r1)
            androidx.compose.material3.AppBarKt$TwoRowsTopAppBar$actionsRow$1 r1 = new androidx.compose.material3.AppBarKt$TwoRowsTopAppBar$actionsRow$1
            r1.<init>(r8, r14)
            r4 = -1048401111(0xffffffffc182ab29, float:-16.333574)
            r5 = 1
            androidx.compose.runtime.internal.ComposableLambda r1 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(r15, r4, r5, r1)
            r18 = r1
            kotlin.jvm.functions.Function2 r18 = (kotlin.jvm.functions.Function2) r18
            androidx.compose.animation.core.CubicBezierEasing r1 = TopTitleAlphaEasing
            float r1 = r1.transform(r11)
            r4 = 1065353216(0x3f800000, float:1.0)
            float r24 = r4 - r11
            r4 = 1056964608(0x3f000000, float:0.5)
            int r4 = (r11 > r4 ? 1 : (r11 == r4 ? 0 : -1))
            if (r4 >= 0) goto L_0x028c
            r16 = r5
            goto L_0x028e
        L_0x028c:
            r16 = 0
        L_0x028e:
            r26 = r16 ^ 1
            r4 = -1609665814(0xffffffffa00e72ea, float:-1.206589E-19)
            r15.startReplaceableGroup(r4)
            java.lang.String r4 = "1187@53760L118,1187@53737L141,1190@53908L255"
            androidx.compose.runtime.ComposerKt.sourceInformation(r15, r4)
            if (r3 == 0) goto L_0x031e
            boolean r4 = r51.isPinned()
            if (r4 != 0) goto L_0x031e
            androidx.compose.ui.Modifier$Companion r4 = androidx.compose.ui.Modifier.Companion
            androidx.compose.foundation.gestures.Orientation r29 = androidx.compose.foundation.gestures.Orientation.Vertical
            r11 = 1157296644(0x44faf204, float:2007.563)
            r15.startReplaceableGroup(r11)
            java.lang.String r5 = "CC(remember)P(1):Composables.kt#9igjgp"
            androidx.compose.runtime.ComposerKt.sourceInformation(r15, r5)
            boolean r17 = r15.changed((java.lang.Object) r3)
            java.lang.Object r11 = r15.rememberedValue()
            if (r17 != 0) goto L_0x02c4
            androidx.compose.runtime.Composer$Companion r17 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r6 = r17.getEmpty()
            if (r11 != r6) goto L_0x02cf
        L_0x02c4:
            androidx.compose.material3.AppBarKt$TwoRowsTopAppBar$appBarDragModifier$1$1 r6 = new androidx.compose.material3.AppBarKt$TwoRowsTopAppBar$appBarDragModifier$1$1
            r6.<init>(r3)
            r11 = r6
            kotlin.jvm.functions.Function1 r11 = (kotlin.jvm.functions.Function1) r11
            r15.updateRememberedValue(r11)
        L_0x02cf:
            r15.endReplaceableGroup()
            kotlin.jvm.functions.Function1 r11 = (kotlin.jvm.functions.Function1) r11
            r6 = 0
            androidx.compose.foundation.gestures.DraggableState r28 = androidx.compose.foundation.gestures.DraggableKt.rememberDraggableState(r11, r15, r6)
            r27 = r4
            androidx.compose.ui.Modifier r27 = (androidx.compose.ui.Modifier) r27
            r30 = 0
            r31 = 0
            r32 = 0
            r33 = 0
            r4 = 1157296644(0x44faf204, float:2007.563)
            r15.startReplaceableGroup(r4)
            androidx.compose.runtime.ComposerKt.sourceInformation(r15, r5)
            boolean r4 = r15.changed((java.lang.Object) r3)
            java.lang.Object r5 = r15.rememberedValue()
            if (r4 != 0) goto L_0x0300
            androidx.compose.runtime.Composer$Companion r4 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r4 = r4.getEmpty()
            if (r5 != r4) goto L_0x030c
        L_0x0300:
            androidx.compose.material3.AppBarKt$TwoRowsTopAppBar$appBarDragModifier$2$1 r4 = new androidx.compose.material3.AppBarKt$TwoRowsTopAppBar$appBarDragModifier$2$1
            r5 = 0
            r4.<init>(r3, r5)
            r5 = r4
            kotlin.jvm.functions.Function3 r5 = (kotlin.jvm.functions.Function3) r5
            r15.updateRememberedValue(r5)
        L_0x030c:
            r15.endReplaceableGroup()
            r34 = r5
            kotlin.jvm.functions.Function3 r34 = (kotlin.jvm.functions.Function3) r34
            r35 = 0
            r36 = 188(0xbc, float:2.63E-43)
            r37 = 0
            androidx.compose.ui.Modifier r4 = androidx.compose.foundation.gestures.DraggableKt.draggable$default(r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37)
            goto L_0x0322
        L_0x031e:
            androidx.compose.ui.Modifier$Companion r4 = androidx.compose.ui.Modifier.Companion
            androidx.compose.ui.Modifier r4 = (androidx.compose.ui.Modifier) r4
        L_0x0322:
            r15.endReplaceableGroup()
            androidx.compose.ui.Modifier r4 = r0.then(r4)
            r5 = 0
            long r27 = TwoRowsTopAppBar_tjU4iQQ$lambda$8(r12)
            r29 = 0
            r31 = 0
            r32 = 0
            androidx.compose.material3.AppBarKt$TwoRowsTopAppBar$3 r12 = new androidx.compose.material3.AppBarKt$TwoRowsTopAppBar$3
            r25 = r9
            r9 = r12
            r20 = r10
            r10 = r47
            r11 = r2
            r2 = r12
            r12 = r48
            r13 = r43
            r19 = r14
            r14 = r44
            r6 = r15
            r15 = r1
            r17 = r45
            r21 = r51
            r22 = r40
            r23 = r41
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            r1 = 1985938853(0x765f05a5, float:1.1308561E33)
            r9 = 1
            androidx.compose.runtime.internal.ComposableLambda r1 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(r6, r1, r9, r2)
            r19 = r1
            kotlin.jvm.functions.Function2 r19 = (kotlin.jvm.functions.Function2) r19
            r21 = 12582912(0xc00000, float:1.7632415E-38)
            r22 = 122(0x7a, float:1.71E-43)
            r10 = r4
            r11 = r5
            r12 = r27
            r14 = r29
            r1 = 0
            r16 = r1
            r17 = r31
            r18 = r32
            r20 = r6
            androidx.compose.material3.SurfaceKt.m1641SurfaceT9BRK9s(r10, r11, r12, r14, r16, r17, r18, r19, r20, r21, r22)
            boolean r1 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r1 == 0) goto L_0x037f
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L_0x037f:
            r1 = r0
        L_0x0380:
            androidx.compose.runtime.ScopeUpdateScope r15 = r6.endRestartGroup()
            if (r15 != 0) goto L_0x0387
            goto L_0x03b7
        L_0x0387:
            androidx.compose.material3.AppBarKt$TwoRowsTopAppBar$4 r17 = new androidx.compose.material3.AppBarKt$TwoRowsTopAppBar$4
            r0 = r17
            r2 = r40
            r3 = r41
            r4 = r42
            r5 = r43
            r6 = r44
            r7 = r45
            r8 = r46
            r9 = r47
            r10 = r48
            r11 = r49
            r12 = r50
            r13 = r51
            r14 = r53
            r38 = r15
            r15 = r54
            r16 = r55
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            r0 = r17
            kotlin.jvm.functions.Function2 r0 = (kotlin.jvm.functions.Function2) r0
            r1 = r38
            r1.updateScope(r0)
        L_0x03b7:
            return
        L_0x03b8:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "A TwoRowsTopAppBar max height should be greater than its pinned height"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.AppBarKt.m1126TwoRowsTopAppBartjU4iQQ(androidx.compose.ui.Modifier, kotlin.jvm.functions.Function2, androidx.compose.ui.text.TextStyle, float, kotlin.jvm.functions.Function2, androidx.compose.ui.text.TextStyle, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function3, androidx.compose.foundation.layout.WindowInsets, androidx.compose.material3.TopAppBarColors, float, float, androidx.compose.material3.TopAppBarScrollBehavior, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* access modifiers changed from: private */
    /* renamed from: TopAppBarLayout-kXwM9vE  reason: not valid java name */
    public static final void m1125TopAppBarLayoutkXwM9vE(Modifier modifier, float f, long j, long j2, long j3, Function2<? super Composer, ? super Integer, Unit> function2, TextStyle textStyle, float f2, Arrangement.Vertical vertical, Arrangement.Horizontal horizontal, int i, boolean z, Function2<? super Composer, ? super Integer, Unit> function22, Function2<? super Composer, ? super Integer, Unit> function23, Composer composer, int i2, int i3) {
        int i4;
        int i5;
        float f3 = f;
        long j4 = j2;
        Function2<? super Composer, ? super Integer, Unit> function24 = function2;
        TextStyle textStyle2 = textStyle;
        Arrangement.Vertical vertical2 = vertical;
        Arrangement.Horizontal horizontal2 = horizontal;
        int i6 = i;
        boolean z2 = z;
        Function2<? super Composer, ? super Integer, Unit> function25 = function22;
        Function2<? super Composer, ? super Integer, Unit> function26 = function23;
        int i7 = i2;
        int i8 = i3;
        Composer startRestartGroup = composer.startRestartGroup(-6794037);
        ComposerKt.sourceInformation(startRestartGroup, "C(TopAppBarLayout)P(4,2,6:c#ui.graphics.Color,10:c#ui.graphics.Color,0:c#ui.graphics.Color,7,12,8,13,11,9,3,5)1296@58560L4308:AppBar.kt#uh7d8r");
        int i9 = 4;
        if ((i7 & 14) == 0) {
            i4 = i7 | (startRestartGroup.changed((Object) modifier) ? 4 : 2);
        } else {
            Modifier modifier2 = modifier;
            i4 = i7;
        }
        int i10 = 32;
        if ((i7 & 112) == 0) {
            i4 |= startRestartGroup.changed(f3) ? 32 : 16;
        }
        long j5 = j;
        if ((i7 & 896) == 0) {
            i4 |= startRestartGroup.changed(j5) ? 256 : 128;
        }
        if ((i7 & 7168) == 0) {
            i4 |= startRestartGroup.changed(j4) ? 2048 : 1024;
        }
        long j6 = j3;
        if ((57344 & i7) == 0) {
            i4 |= startRestartGroup.changed(j6) ? 16384 : 8192;
        }
        if ((458752 & i7) == 0) {
            i4 |= startRestartGroup.changedInstance(function24) ? 131072 : 65536;
        }
        if ((3670016 & i7) == 0) {
            i4 |= startRestartGroup.changed((Object) textStyle2) ? 1048576 : 524288;
        }
        if ((29360128 & i7) == 0) {
            i4 |= startRestartGroup.changed(f2) ? 8388608 : 4194304;
        } else {
            float f4 = f2;
        }
        if ((i7 & 234881024) == 0) {
            i4 |= startRestartGroup.changed((Object) vertical2) ? 67108864 : 33554432;
        }
        if ((i7 & 1879048192) == 0) {
            i4 |= startRestartGroup.changed((Object) horizontal2) ? 536870912 : 268435456;
        }
        int i11 = i4;
        int i12 = i;
        if ((i8 & 14) == 0) {
            if (!startRestartGroup.changed(i12)) {
                i9 = 2;
            }
            i5 = i8 | i9;
        } else {
            i5 = i8;
        }
        boolean z3 = z;
        if ((i8 & 112) == 0) {
            if (!startRestartGroup.changed(z3)) {
                i10 = 16;
            }
            i5 |= i10;
        }
        if ((i8 & 896) == 0) {
            i5 |= startRestartGroup.changedInstance(function25) ? 256 : 128;
        }
        if ((i8 & 7168) == 0) {
            i5 |= startRestartGroup.changedInstance(function26) ? 2048 : 1024;
        }
        if ((1533916891 & i11) == 306783378 && (i5 & 5851) == 1170 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
            TextStyle textStyle3 = textStyle2;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-6794037, i11, i5, "androidx.compose.material3.TopAppBarLayout (AppBar.kt:1280)");
            }
            MeasurePolicy appBarKt$TopAppBarLayout$2 = new AppBarKt$TopAppBarLayout$2(f3, horizontal2, vertical2, i12);
            startRestartGroup.startReplaceableGroup(-1323940314);
            ComposerKt.sourceInformation(startRestartGroup, "CC(Layout)P(!1,2)73@2855L7,74@2910L7,75@2969L7,76@2981L460:Layout.kt#80mrfh");
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object consume = startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            Density density = (Density) consume;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object consume2 = startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            LayoutDirection layoutDirection = (LayoutDirection) consume2;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object consume3 = startRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ViewConfiguration viewConfiguration = (ViewConfiguration) consume3;
            Function0<ComposeUiNode> constructor = ComposeUiNode.Companion.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf = LayoutKt.materializerOf(modifier);
            int i13 = ((((i11 << 3) & 112) << 9) & 7168) | 6;
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor);
            } else {
                startRestartGroup.useNode();
            }
            Composer r10 = Updater.m2444constructorimpl(startRestartGroup);
            Updater.m2451setimpl(r10, appBarKt$TopAppBarLayout$2, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.m2451setimpl(r10, density, ComposeUiNode.Companion.getSetDensity());
            Updater.m2451setimpl(r10, layoutDirection, ComposeUiNode.Companion.getSetLayoutDirection());
            Updater.m2451setimpl(r10, viewConfiguration, ComposeUiNode.Companion.getSetViewConfiguration());
            materializerOf.invoke(SkippableUpdater.m2435boximpl(SkippableUpdater.m2436constructorimpl(startRestartGroup)), startRestartGroup, Integer.valueOf((i13 >> 3) & 112));
            startRestartGroup.startReplaceableGroup(2058660585);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -290535407, "C1298@58590L352,1308@58955L577,1322@59545L336:AppBar.kt#uh7d8r");
            Modifier layoutId = LayoutIdKt.layoutId(Modifier.Companion, "navigationIcon");
            float f5 = TopAppBarHorizontalPadding;
            Modifier r4 = PaddingKt.m497paddingqDBjuR0$default(layoutId, f5, 0.0f, 0.0f, 0.0f, 14, (Object) null);
            startRestartGroup.startReplaceableGroup(733328855);
            ComposerKt.sourceInformation(startRestartGroup, "CC(Box)P(2,1,3)70@3267L67,71@3339L130:Box.kt#2w3rfo");
            MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.Companion.getTopStart(), false, startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(-1323940314);
            ComposerKt.sourceInformation(startRestartGroup, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
            Object consume4 = startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            Density density2 = (Density) consume4;
            int i14 = i11;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
            Object consume5 = startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            LayoutDirection layoutDirection2 = (LayoutDirection) consume5;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
            Object consume6 = startRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ViewConfiguration viewConfiguration2 = (ViewConfiguration) consume6;
            Function0<ComposeUiNode> constructor2 = ComposeUiNode.Companion.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf2 = LayoutKt.materializerOf(r4);
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor2);
            } else {
                startRestartGroup.useNode();
            }
            startRestartGroup.disableReusing();
            Composer r6 = Updater.m2444constructorimpl(startRestartGroup);
            Updater.m2451setimpl(r6, rememberBoxMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.m2451setimpl(r6, density2, ComposeUiNode.Companion.getSetDensity());
            Updater.m2451setimpl(r6, layoutDirection2, ComposeUiNode.Companion.getSetLayoutDirection());
            Updater.m2451setimpl(r6, viewConfiguration2, ComposeUiNode.Companion.getSetViewConfiguration());
            startRestartGroup.enableReusing();
            materializerOf2.invoke(SkippableUpdater.m2435boximpl(SkippableUpdater.m2436constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1253629305, "C72@3384L9:Box.kt#2w3rfo");
            BoxScope boxScope = BoxScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1090283935, "C1303@58765L163:AppBar.kt#uh7d8r");
            CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m2811boximpl(j))}, function25, startRestartGroup, ((i5 >> 3) & 112) | 8);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endNode();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            Modifier r62 = PaddingKt.m495paddingVpY3zN4$default(LayoutIdKt.layoutId(Modifier.Companion, "title"), f5, 0.0f, 2, (Object) null);
            Modifier modifier3 = Modifier.Companion;
            if (z3) {
                modifier3 = SemanticsModifierKt.clearAndSetSemantics(modifier3, AppBarKt$TopAppBarLayout$1$2.INSTANCE);
            }
            Modifier r63 = GraphicsLayerModifierKt.m2967graphicsLayerAp8cVGQ$default(r62.then(modifier3), 0.0f, 0.0f, f2, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0, (Shape) null, false, (RenderEffect) null, 0, 0, 0, 131067, (Object) null);
            startRestartGroup.startReplaceableGroup(733328855);
            ComposerKt.sourceInformation(startRestartGroup, "CC(Box)P(2,1,3)70@3267L67,71@3339L130:Box.kt#2w3rfo");
            MeasurePolicy rememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(Alignment.Companion.getTopStart(), false, startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(-1323940314);
            ComposerKt.sourceInformation(startRestartGroup, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
            Object consume7 = startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            Density density3 = (Density) consume7;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
            Object consume8 = startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            LayoutDirection layoutDirection3 = (LayoutDirection) consume8;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
            Object consume9 = startRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ViewConfiguration viewConfiguration3 = (ViewConfiguration) consume9;
            Function0<ComposeUiNode> constructor3 = ComposeUiNode.Companion.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf3 = LayoutKt.materializerOf(r63);
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor3);
            } else {
                startRestartGroup.useNode();
            }
            startRestartGroup.disableReusing();
            Composer r8 = Updater.m2444constructorimpl(startRestartGroup);
            Updater.m2451setimpl(r8, rememberBoxMeasurePolicy2, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.m2451setimpl(r8, density3, ComposeUiNode.Companion.getSetDensity());
            Updater.m2451setimpl(r8, layoutDirection3, ComposeUiNode.Companion.getSetLayoutDirection());
            Updater.m2451setimpl(r8, viewConfiguration3, ComposeUiNode.Companion.getSetViewConfiguration());
            startRestartGroup.enableReusing();
            materializerOf3.invoke(SkippableUpdater.m2435boximpl(SkippableUpdater.m2436constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1253629305, "C72@3384L9:Box.kt#2w3rfo");
            BoxScope boxScope2 = BoxScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1090283420, "C1315@59280L238:AppBar.kt#uh7d8r");
            int i15 = i14;
            TextKt.ProvideTextStyle(textStyle, ComposableLambdaKt.composableLambda(startRestartGroup, 824316656, true, new AppBarKt$TopAppBarLayout$1$3$1(j2, function24, i15)), startRestartGroup, ((i15 >> 18) & 14) | 48);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endNode();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            Modifier r0 = PaddingKt.m497paddingqDBjuR0$default(LayoutIdKt.layoutId(Modifier.Companion, "actionIcons"), 0.0f, 0.0f, f5, 0.0f, 11, (Object) null);
            startRestartGroup.startReplaceableGroup(733328855);
            ComposerKt.sourceInformation(startRestartGroup, "CC(Box)P(2,1,3)70@3267L67,71@3339L130:Box.kt#2w3rfo");
            MeasurePolicy rememberBoxMeasurePolicy3 = BoxKt.rememberBoxMeasurePolicy(Alignment.Companion.getTopStart(), false, startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(-1323940314);
            ComposerKt.sourceInformation(startRestartGroup, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
            Object consume10 = startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            Density density4 = (Density) consume10;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
            Object consume11 = startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            LayoutDirection layoutDirection4 = (LayoutDirection) consume11;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
            Object consume12 = startRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ViewConfiguration viewConfiguration4 = (ViewConfiguration) consume12;
            Function0<ComposeUiNode> constructor4 = ComposeUiNode.Companion.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf4 = LayoutKt.materializerOf(r0);
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor4);
            } else {
                startRestartGroup.useNode();
            }
            startRestartGroup.disableReusing();
            Composer r82 = Updater.m2444constructorimpl(startRestartGroup);
            Updater.m2451setimpl(r82, rememberBoxMeasurePolicy3, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.m2451setimpl(r82, density4, ComposeUiNode.Companion.getSetDensity());
            Updater.m2451setimpl(r82, layoutDirection4, ComposeUiNode.Companion.getSetLayoutDirection());
            Updater.m2451setimpl(r82, viewConfiguration4, ComposeUiNode.Companion.getSetViewConfiguration());
            startRestartGroup.enableReusing();
            materializerOf4.invoke(SkippableUpdater.m2435boximpl(SkippableUpdater.m2436constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1253629305, "C72@3384L9:Box.kt#2w3rfo");
            BoxScope boxScope3 = BoxScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1090282985, "C1327@59715L152:AppBar.kt#uh7d8r");
            CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m2811boximpl(j3))}, function23, startRestartGroup, ((i5 >> 6) & 112) | 8);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endNode();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endNode();
            startRestartGroup.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new AppBarKt$TopAppBarLayout$3(modifier, f, j, j2, j3, function2, textStyle, f2, vertical, horizontal, i, z, function22, function23, i2, i3));
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0053  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00ef  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00f1  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0114 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0115  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object settleAppBar(androidx.compose.material3.TopAppBarState r22, float r23, androidx.compose.animation.core.DecayAnimationSpec<java.lang.Float> r24, androidx.compose.animation.core.AnimationSpec<java.lang.Float> r25, kotlin.coroutines.Continuation<? super androidx.compose.ui.unit.Velocity> r26) {
        /*
            r0 = r22
            r1 = r26
            boolean r2 = r1 instanceof androidx.compose.material3.AppBarKt$settleAppBar$1
            if (r2 == 0) goto L_0x0018
            r2 = r1
            androidx.compose.material3.AppBarKt$settleAppBar$1 r2 = (androidx.compose.material3.AppBarKt$settleAppBar$1) r2
            int r3 = r2.label
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r3 & r4
            if (r3 == 0) goto L_0x0018
            int r1 = r2.label
            int r1 = r1 - r4
            r2.label = r1
            goto L_0x001d
        L_0x0018:
            androidx.compose.material3.AppBarKt$settleAppBar$1 r2 = new androidx.compose.material3.AppBarKt$settleAppBar$1
            r2.<init>(r1)
        L_0x001d:
            java.lang.Object r1 = r2.result
            java.lang.Object r11 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r3 = r2.label
            r10 = 2
            r4 = 1
            r12 = 0
            if (r3 == 0) goto L_0x0053
            if (r3 == r4) goto L_0x0040
            if (r3 != r10) goto L_0x0037
            java.lang.Object r0 = r2.L$0
            kotlin.jvm.internal.Ref$FloatRef r0 = (kotlin.jvm.internal.Ref.FloatRef) r0
            kotlin.ResultKt.throwOnFailure(r1)
            goto L_0x0116
        L_0x0037:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0040:
            java.lang.Object r0 = r2.L$2
            kotlin.jvm.internal.Ref$FloatRef r0 = (kotlin.jvm.internal.Ref.FloatRef) r0
            java.lang.Object r3 = r2.L$1
            androidx.compose.animation.core.AnimationSpec r3 = (androidx.compose.animation.core.AnimationSpec) r3
            java.lang.Object r4 = r2.L$0
            androidx.compose.material3.TopAppBarState r4 = (androidx.compose.material3.TopAppBarState) r4
            kotlin.ResultKt.throwOnFailure(r1)
            r1 = r0
            r13 = r3
            r0 = r4
            goto L_0x00b7
        L_0x0053:
            kotlin.ResultKt.throwOnFailure(r1)
            float r1 = r22.getCollapsedFraction()
            r3 = 1008981770(0x3c23d70a, float:0.01)
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 < 0) goto L_0x0122
            float r1 = r22.getCollapsedFraction()
            r3 = 1065353216(0x3f800000, float:1.0)
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 != 0) goto L_0x006d
            goto L_0x0122
        L_0x006d:
            kotlin.jvm.internal.Ref$FloatRef r1 = new kotlin.jvm.internal.Ref$FloatRef
            r1.<init>()
            r5 = r23
            r1.element = r5
            if (r24 == 0) goto L_0x00b9
            float r6 = java.lang.Math.abs(r23)
            int r3 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r3 <= 0) goto L_0x00b9
            kotlin.jvm.internal.Ref$FloatRef r3 = new kotlin.jvm.internal.Ref$FloatRef
            r3.<init>()
            r13 = 0
            r15 = 0
            r17 = 0
            r19 = 0
            r20 = 28
            r21 = 0
            r14 = r23
            androidx.compose.animation.core.AnimationState r5 = androidx.compose.animation.core.AnimationStateKt.AnimationState$default(r13, r14, r15, r17, r19, r20, r21)
            r6 = 0
            androidx.compose.material3.AppBarKt$settleAppBar$2 r7 = new androidx.compose.material3.AppBarKt$settleAppBar$2
            r7.<init>(r3, r0, r1)
            kotlin.jvm.functions.Function1 r7 = (kotlin.jvm.functions.Function1) r7
            r8 = 2
            r9 = 0
            r2.L$0 = r0
            r13 = r25
            r2.L$1 = r13
            r2.L$2 = r1
            r2.label = r4
            r3 = r5
            r4 = r24
            r5 = r6
            r6 = r7
            r7 = r2
            java.lang.Object r3 = androidx.compose.animation.core.SuspendAnimationKt.animateDecay$default(r3, r4, r5, r6, r7, r8, r9)
            if (r3 != r11) goto L_0x00b7
            return r11
        L_0x00b7:
            r5 = r13
            goto L_0x00bc
        L_0x00b9:
            r13 = r25
            goto L_0x00b7
        L_0x00bc:
            if (r5 == 0) goto L_0x0117
            float r3 = r0.getHeightOffset()
            int r3 = (r3 > r12 ? 1 : (r3 == r12 ? 0 : -1))
            if (r3 >= 0) goto L_0x0117
            float r3 = r0.getHeightOffset()
            float r4 = r0.getHeightOffsetLimit()
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 <= 0) goto L_0x0117
            float r13 = r0.getHeightOffset()
            r14 = 0
            r15 = 0
            r17 = 0
            r19 = 0
            r20 = 30
            r21 = 0
            androidx.compose.animation.core.AnimationState r3 = androidx.compose.animation.core.AnimationStateKt.AnimationState$default(r13, r14, r15, r17, r19, r20, r21)
            float r4 = r0.getCollapsedFraction()
            r6 = 1056964608(0x3f000000, float:0.5)
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 >= 0) goto L_0x00f1
            r4 = r12
            goto L_0x00f5
        L_0x00f1:
            float r4 = r0.getHeightOffsetLimit()
        L_0x00f5:
            java.lang.Float r4 = kotlin.coroutines.jvm.internal.Boxing.boxFloat(r4)
            r6 = 0
            androidx.compose.material3.AppBarKt$settleAppBar$3 r7 = new androidx.compose.material3.AppBarKt$settleAppBar$3
            r7.<init>(r0)
            kotlin.jvm.functions.Function1 r7 = (kotlin.jvm.functions.Function1) r7
            r9 = 4
            r0 = 0
            r2.L$0 = r1
            r8 = 0
            r2.L$1 = r8
            r2.L$2 = r8
            r2.label = r10
            r8 = r2
            r10 = r0
            java.lang.Object r0 = androidx.compose.animation.core.SuspendAnimationKt.animateTo$default(r3, r4, r5, r6, r7, r8, r9, r10)
            if (r0 != r11) goto L_0x0115
            return r11
        L_0x0115:
            r0 = r1
        L_0x0116:
            r1 = r0
        L_0x0117:
            float r0 = r1.element
            long r0 = androidx.compose.ui.unit.VelocityKt.Velocity(r12, r0)
            androidx.compose.ui.unit.Velocity r0 = androidx.compose.ui.unit.Velocity.m5842boximpl(r0)
            return r0
        L_0x0122:
            androidx.compose.ui.unit.Velocity$Companion r0 = androidx.compose.ui.unit.Velocity.Companion
            long r0 = r0.m5862getZero9UxMQ8M()
            androidx.compose.ui.unit.Velocity r0 = androidx.compose.ui.unit.Velocity.m5842boximpl(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.AppBarKt.settleAppBar(androidx.compose.material3.TopAppBarState, float, androidx.compose.animation.core.DecayAnimationSpec, androidx.compose.animation.core.AnimationSpec, kotlin.coroutines.Continuation):java.lang.Object");
    }

    private static final long SingleRowTopAppBar$lambda$3(State<Color> state) {
        return state.getValue().m2831unboximpl();
    }

    private static final long TwoRowsTopAppBar_tjU4iQQ$lambda$8(State<Color> state) {
        return state.getValue().m2831unboximpl();
    }

    static {
        float f = (float) 16;
        float f2 = (float) 12;
        float r1 = Dp.m5626constructorimpl(Dp.m5626constructorimpl(f) - Dp.m5626constructorimpl(f2));
        BottomAppBarHorizontalPadding = r1;
        float r3 = Dp.m5626constructorimpl(Dp.m5626constructorimpl(f) - Dp.m5626constructorimpl(f2));
        BottomAppBarVerticalPadding = r3;
        FABHorizontalPadding = Dp.m5626constructorimpl(Dp.m5626constructorimpl(f) - r1);
        FABVerticalPadding = Dp.m5626constructorimpl(Dp.m5626constructorimpl(f2) - r3);
        float r12 = Dp.m5626constructorimpl((float) 4);
        TopAppBarHorizontalPadding = r12;
        TopAppBarTitleInset = Dp.m5626constructorimpl(Dp.m5626constructorimpl(f) - r12);
    }
}
