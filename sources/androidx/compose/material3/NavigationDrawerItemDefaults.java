package androidx.compose.material3;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.material3.tokens.NavigationDrawerTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002Je\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\n2\b\b\u0002\u0010\u000e\u001a\u00020\n2\b\b\u0002\u0010\u000f\u001a\u00020\n2\b\b\u0002\u0010\u0010\u001a\u00020\n2\b\b\u0002\u0010\u0011\u001a\u00020\nH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0014"}, d2 = {"Landroidx/compose/material3/NavigationDrawerItemDefaults;", "", "()V", "ItemPadding", "Landroidx/compose/foundation/layout/PaddingValues;", "getItemPadding", "()Landroidx/compose/foundation/layout/PaddingValues;", "colors", "Landroidx/compose/material3/NavigationDrawerItemColors;", "selectedContainerColor", "Landroidx/compose/ui/graphics/Color;", "unselectedContainerColor", "selectedIconColor", "unselectedIconColor", "selectedTextColor", "unselectedTextColor", "selectedBadgeColor", "unselectedBadgeColor", "colors-oq7We08", "(JJJJJJJJLandroidx/compose/runtime/Composer;II)Landroidx/compose/material3/NavigationDrawerItemColors;", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* compiled from: NavigationDrawer.kt */
public final class NavigationDrawerItemDefaults {
    public static final int $stable = 0;
    public static final NavigationDrawerItemDefaults INSTANCE = new NavigationDrawerItemDefaults();
    private static final PaddingValues ItemPadding = PaddingKt.m488PaddingValuesYgX7TsA$default(Dp.m5626constructorimpl((float) 12), 0.0f, 2, (Object) null);

    public final PaddingValues getItemPadding() {
        return ItemPadding;
    }

    private NavigationDrawerItemDefaults() {
    }

    /* renamed from: colors-oq7We08  reason: not valid java name */
    public final NavigationDrawerItemColors m1452colorsoq7We08(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, Composer composer, int i, int i2) {
        Composer composer2 = composer;
        int i3 = i2;
        composer2.startReplaceableGroup(-1574983348);
        ComposerKt.sourceInformation(composer2, "C(colors)P(1:c#ui.graphics.Color,5:c#ui.graphics.Color,2:c#ui.graphics.Color,6:c#ui.graphics.Color,3:c#ui.graphics.Color,7:c#ui.graphics.Color,0:c#ui.graphics.Color,4:c#ui.graphics.Color)749@29055L9,750@29146L9,751@29231L9,752@29320L9,753@29410L9,754@29504L9:NavigationDrawer.kt#uh7d8r");
        long color = (i3 & 1) != 0 ? ColorSchemeKt.toColor(NavigationDrawerTokens.INSTANCE.getActiveIndicatorColor(), composer2, 6) : j;
        long color2 = (i3 & 2) != 0 ? ColorSchemeKt.toColor(NavigationDrawerTokens.INSTANCE.getContainerColor(), composer2, 6) : j2;
        long color3 = (i3 & 4) != 0 ? ColorSchemeKt.toColor(NavigationDrawerTokens.INSTANCE.getActiveIconColor(), composer2, 6) : j3;
        long color4 = (i3 & 8) != 0 ? ColorSchemeKt.toColor(NavigationDrawerTokens.INSTANCE.getInactiveIconColor(), composer2, 6) : j4;
        long color5 = (i3 & 16) != 0 ? ColorSchemeKt.toColor(NavigationDrawerTokens.INSTANCE.getActiveLabelTextColor(), composer2, 6) : j5;
        long color6 = (i3 & 32) != 0 ? ColorSchemeKt.toColor(NavigationDrawerTokens.INSTANCE.getInactiveLabelTextColor(), composer2, 6) : j6;
        long j9 = (i3 & 64) != 0 ? color5 : j7;
        long j10 = (i3 & 128) != 0 ? color6 : j8;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1574983348, i, -1, "androidx.compose.material3.NavigationDrawerItemDefaults.colors (NavigationDrawer.kt:748)");
        }
        DefaultDrawerItemsColor defaultDrawerItemsColor = new DefaultDrawerItemsColor(color3, color4, color5, color6, color, color2, j9, j10, (DefaultConstructorMarker) null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return defaultDrawerItemsColor;
    }
}
