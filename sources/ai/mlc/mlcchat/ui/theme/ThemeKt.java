package ai.mlc.mlcchat.ui.theme;

import android.content.Context;
import android.os.Build;
import android.view.View;
import androidx.compose.foundation.DarkThemeKt;
import androidx.compose.material3.ColorScheme;
import androidx.compose.material3.ColorSchemeKt;
import androidx.compose.material3.DynamicTonalPaletteKt;
import androidx.compose.material3.MaterialThemeKt;
import androidx.compose.material3.Shapes;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a4\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\u0011\u0010\b\u001a\r\u0012\u0004\u0012\u00020\u00040\t¢\u0006\u0002\b\nH\u0007¢\u0006\u0002\u0010\u000b\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"DarkColorScheme", "Landroidx/compose/material3/ColorScheme;", "LightColorScheme", "MLCChatTheme", "", "darkTheme", "", "dynamicColor", "content", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "(ZZLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "app_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: Theme.kt */
public final class ThemeKt {
    private static final ColorScheme DarkColorScheme;
    private static final ColorScheme LightColorScheme;

    static {
        long blue80 = ColorKt.getBlue80();
        long blue20 = ColorKt.getBlue20();
        long blue30 = ColorKt.getBlue30();
        long blue90 = ColorKt.getBlue90();
        long blue40 = ColorKt.getBlue40();
        long darkBlue80 = ColorKt.getDarkBlue80();
        long darkBlue20 = ColorKt.getDarkBlue20();
        long darkBlue30 = ColorKt.getDarkBlue30();
        long darkBlue90 = ColorKt.getDarkBlue90();
        long yellow80 = ColorKt.getYellow80();
        long yellow20 = ColorKt.getYellow20();
        long yellow30 = ColorKt.getYellow30();
        long yellow90 = ColorKt.getYellow90();
        long red80 = ColorKt.getRed80();
        long red20 = ColorKt.getRed20();
        long red30 = ColorKt.getRed30();
        long red90 = ColorKt.getRed90();
        DarkColorScheme = ColorSchemeKt.m1244darkColorSchemeG1PFcw$default(blue80, blue20, blue30, blue90, blue40, darkBlue80, darkBlue20, darkBlue30, darkBlue90, yellow80, yellow20, yellow30, yellow90, ColorKt.getGrey10(), ColorKt.getGrey90(), ColorKt.getGrey10(), ColorKt.getGrey80(), ColorKt.getBlueGrey30(), ColorKt.getBlueGrey80(), 0, ColorKt.getGrey90(), ColorKt.getGrey20(), red80, red20, red30, red90, ColorKt.getBlueGrey60(), 0, 0, 403177472, (Object) null);
        long blue402 = ColorKt.getBlue40();
        long r3 = Color.Companion.m2858getWhite0d7_KjU();
        long blue902 = ColorKt.getBlue90();
        long blue10 = ColorKt.getBlue10();
        long blue802 = ColorKt.getBlue80();
        long darkBlue40 = ColorKt.getDarkBlue40();
        long r13 = Color.Companion.m2858getWhite0d7_KjU();
        long darkBlue902 = ColorKt.getDarkBlue90();
        long darkBlue10 = ColorKt.getDarkBlue10();
        long yellow40 = ColorKt.getYellow40();
        long r21 = Color.Companion.m2858getWhite0d7_KjU();
        long yellow902 = ColorKt.getYellow90();
        long yellow10 = ColorKt.getYellow10();
        long red40 = ColorKt.getRed40();
        long r47 = Color.Companion.m2858getWhite0d7_KjU();
        long red902 = ColorKt.getRed90();
        long red10 = ColorKt.getRed10();
        LightColorScheme = ColorSchemeKt.m1246lightColorSchemeG1PFcw$default(blue402, r3, blue902, blue10, blue802, darkBlue40, r13, darkBlue902, darkBlue10, yellow40, r21, yellow902, yellow10, ColorKt.getGrey99(), ColorKt.getGrey10(), ColorKt.getGrey99(), ColorKt.getGrey10(), ColorKt.getBlueGrey90(), ColorKt.getBlueGrey30(), 0, ColorKt.getGrey20(), ColorKt.getGrey95(), red40, r47, red902, red10, ColorKt.getBlueGrey50(), 0, 0, 403177472, (Object) null);
    }

    public static final void MLCChatTheme(boolean z, boolean z2, Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, int i, int i2) {
        int i3;
        ColorScheme colorScheme;
        Intrinsics.checkNotNullParameter(function2, "content");
        Composer startRestartGroup = composer.startRestartGroup(-1848693893);
        ComposerKt.sourceInformation(startRestartGroup, "C(MLCChatTheme)P(1,2)");
        if ((i & 14) == 0) {
            i3 = (((i2 & 1) != 0 || !startRestartGroup.changed(z)) ? 2 : 4) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= startRestartGroup.changed(z2) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 896) == 0) {
            i3 |= startRestartGroup.changedInstance(function2) ? 256 : 128;
        }
        if ((i3 & 731) != 146 || !startRestartGroup.getSkipping()) {
            startRestartGroup.startDefaults();
            if ((i & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                if ((i2 & 1) != 0) {
                    z = DarkThemeKt.isSystemInDarkTheme(startRestartGroup, 0);
                    i3 &= -15;
                }
                if (i4 != 0) {
                    z2 = true;
                }
            } else {
                startRestartGroup.skipToGroupEnd();
                if ((i2 & 1) != 0) {
                    i3 &= -15;
                }
            }
            startRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1848693893, i3, -1, "ai.mlc.mlcchat.ui.theme.MLCChatTheme (Theme.kt:77)");
            }
            startRestartGroup.startReplaceableGroup(-805652256);
            if (!z2 || Build.VERSION.SDK_INT < 31) {
                colorScheme = z ? DarkColorScheme : LightColorScheme;
            } else {
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                Object consume = startRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                Context context = (Context) consume;
                colorScheme = z ? DynamicTonalPaletteKt.dynamicDarkColorScheme(context) : DynamicTonalPaletteKt.dynamicLightColorScheme(context);
            }
            startRestartGroup.endReplaceableGroup();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object consume2 = startRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalView());
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            View view = (View) consume2;
            startRestartGroup.startReplaceableGroup(-805651905);
            if (!view.isInEditMode()) {
                EffectsKt.SideEffect(new ThemeKt$MLCChatTheme$1(view, colorScheme, z), startRestartGroup, 0);
            }
            startRestartGroup.endReplaceableGroup();
            MaterialThemeKt.MaterialTheme(colorScheme, (Shapes) null, TypeKt.getTypography(), function2, startRestartGroup, ((i3 << 3) & 7168) | 384, 2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        boolean z3 = z;
        boolean z4 = z2;
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new ThemeKt$MLCChatTheme$2(z3, z4, function2, i, i2));
        }
    }
}
