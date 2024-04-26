package androidx.compose.material3;

import androidx.compose.material3.tokens.ColorDarkTokens;
import androidx.compose.material3.tokens.ColorLightTokens;
import androidx.compose.material3.tokens.ColorSchemeKeyTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.unit.Dp;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00004\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b'\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0002\u001a\u001d\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\n\u0010\u000b\u001aµ\u0002\u0010\f\u001a\u00020\u00042\b\b\u0002\u0010\r\u001a\u00020\b2\b\b\u0002\u0010\u000e\u001a\u00020\b2\b\b\u0002\u0010\u000f\u001a\u00020\b2\b\b\u0002\u0010\u0010\u001a\u00020\b2\b\b\u0002\u0010\u0011\u001a\u00020\b2\b\b\u0002\u0010\u0012\u001a\u00020\b2\b\b\u0002\u0010\u0013\u001a\u00020\b2\b\b\u0002\u0010\u0014\u001a\u00020\b2\b\b\u0002\u0010\u0015\u001a\u00020\b2\b\b\u0002\u0010\u0016\u001a\u00020\b2\b\b\u0002\u0010\u0017\u001a\u00020\b2\b\b\u0002\u0010\u0018\u001a\u00020\b2\b\b\u0002\u0010\u0019\u001a\u00020\b2\b\b\u0002\u0010\u001a\u001a\u00020\b2\b\b\u0002\u0010\u001b\u001a\u00020\b2\b\b\u0002\u0010\u001c\u001a\u00020\b2\b\b\u0002\u0010\u001d\u001a\u00020\b2\b\b\u0002\u0010\u001e\u001a\u00020\b2\b\b\u0002\u0010\u001f\u001a\u00020\b2\b\b\u0002\u0010 \u001a\u00020\b2\b\b\u0002\u0010!\u001a\u00020\b2\b\b\u0002\u0010\"\u001a\u00020\b2\b\b\u0002\u0010#\u001a\u00020\b2\b\b\u0002\u0010$\u001a\u00020\b2\b\b\u0002\u0010%\u001a\u00020\b2\b\b\u0002\u0010&\u001a\u00020\b2\b\b\u0002\u0010'\u001a\u00020\b2\b\b\u0002\u0010(\u001a\u00020\b2\b\b\u0002\u0010)\u001a\u00020\bø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b*\u0010+\u001aµ\u0002\u0010,\u001a\u00020\u00042\b\b\u0002\u0010\r\u001a\u00020\b2\b\b\u0002\u0010\u000e\u001a\u00020\b2\b\b\u0002\u0010\u000f\u001a\u00020\b2\b\b\u0002\u0010\u0010\u001a\u00020\b2\b\b\u0002\u0010\u0011\u001a\u00020\b2\b\b\u0002\u0010\u0012\u001a\u00020\b2\b\b\u0002\u0010\u0013\u001a\u00020\b2\b\b\u0002\u0010\u0014\u001a\u00020\b2\b\b\u0002\u0010\u0015\u001a\u00020\b2\b\b\u0002\u0010\u0016\u001a\u00020\b2\b\b\u0002\u0010\u0017\u001a\u00020\b2\b\b\u0002\u0010\u0018\u001a\u00020\b2\b\b\u0002\u0010\u0019\u001a\u00020\b2\b\b\u0002\u0010\u001a\u001a\u00020\b2\b\b\u0002\u0010\u001b\u001a\u00020\b2\b\b\u0002\u0010\u001c\u001a\u00020\b2\b\b\u0002\u0010\u001d\u001a\u00020\b2\b\b\u0002\u0010\u001e\u001a\u00020\b2\b\b\u0002\u0010\u001f\u001a\u00020\b2\b\b\u0002\u0010 \u001a\u00020\b2\b\b\u0002\u0010!\u001a\u00020\b2\b\b\u0002\u0010\"\u001a\u00020\b2\b\b\u0002\u0010#\u001a\u00020\b2\b\b\u0002\u0010$\u001a\u00020\b2\b\b\u0002\u0010%\u001a\u00020\b2\b\b\u0002\u0010&\u001a\u00020\b2\b\b\u0002\u0010'\u001a\u00020\b2\b\b\u0002\u0010(\u001a\u00020\b2\b\b\u0002\u0010)\u001a\u00020\bø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b-\u0010+\u001a)\u0010.\u001a\u00020\b*\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\u0006\u0010/\u001a\u000200H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b1\u00102\u001a\u001f\u0010\u0007\u001a\u00020\b*\u00020\u00042\u0006\u0010\t\u001a\u00020\bø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b3\u00104\u001a\u001c\u00105\u001a\u00020\b*\u00020\u00042\u0006\u00106\u001a\u000207H\u0000ø\u0001\u0001¢\u0006\u0002\u00108\u001a\u001f\u00109\u001a\u00020\b*\u00020\u00042\u0006\u0010/\u001a\u000200ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b:\u0010;\u001a\u0014\u0010<\u001a\u00020\b*\u000207H\u0001ø\u0001\u0001¢\u0006\u0002\u0010=\u001a\u0014\u0010>\u001a\u00020?*\u00020\u00042\u0006\u0010@\u001a\u00020\u0004H\u0000\"\u000e\u0010\u0000\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000\"\u001a\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006A"}, d2 = {"DisabledAlpha", "", "LocalColorScheme", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "Landroidx/compose/material3/ColorScheme;", "getLocalColorScheme", "()Landroidx/compose/runtime/ProvidableCompositionLocal;", "contentColorFor", "Landroidx/compose/ui/graphics/Color;", "backgroundColor", "contentColorFor-ek8zF_U", "(JLandroidx/compose/runtime/Composer;I)J", "darkColorScheme", "primary", "onPrimary", "primaryContainer", "onPrimaryContainer", "inversePrimary", "secondary", "onSecondary", "secondaryContainer", "onSecondaryContainer", "tertiary", "onTertiary", "tertiaryContainer", "onTertiaryContainer", "background", "onBackground", "surface", "onSurface", "surfaceVariant", "onSurfaceVariant", "surfaceTint", "inverseSurface", "inverseOnSurface", "error", "onError", "errorContainer", "onErrorContainer", "outline", "outlineVariant", "scrim", "darkColorScheme-G1PFc-w", "(JJJJJJJJJJJJJJJJJJJJJJJJJJJJJ)Landroidx/compose/material3/ColorScheme;", "lightColorScheme", "lightColorScheme-G1PFc-w", "applyTonalElevation", "elevation", "Landroidx/compose/ui/unit/Dp;", "applyTonalElevation-Hht5A8o", "(Landroidx/compose/material3/ColorScheme;JF)J", "contentColorFor-4WTKRHQ", "(Landroidx/compose/material3/ColorScheme;J)J", "fromToken", "value", "Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;", "(Landroidx/compose/material3/ColorScheme;Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;)J", "surfaceColorAtElevation", "surfaceColorAtElevation-3ABfNKs", "(Landroidx/compose/material3/ColorScheme;F)J", "toColor", "(Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;Landroidx/compose/runtime/Composer;I)J", "updateColorSchemeFrom", "", "other", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: ColorScheme.kt */
public final class ColorSchemeKt {
    public static final float DisabledAlpha = 0.38f;
    private static final ProvidableCompositionLocal<ColorScheme> LocalColorScheme = CompositionLocalKt.staticCompositionLocalOf(ColorSchemeKt$LocalColorScheme$1.INSTANCE);

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* compiled from: ColorScheme.kt */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        /* JADX WARNING: Can't wrap try/catch for region: R(60:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|51|52|53|54|55|56|(2:57|58)|59|61) */
        /* JADX WARNING: Can't wrap try/catch for region: R(61:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|51|52|53|54|55|56|57|58|59|61) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0034 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x003d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0046 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0050 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x005a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0064 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x006e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0078 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x0082 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x008c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x0096 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x00a0 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:35:0x00aa */
        /* JADX WARNING: Missing exception handler attribute for start block: B:37:0x00b4 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:39:0x00be */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:41:0x00c8 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:43:0x00d2 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:45:0x00dc */
        /* JADX WARNING: Missing exception handler attribute for start block: B:47:0x00e6 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:49:0x00f0 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:51:0x00fa */
        /* JADX WARNING: Missing exception handler attribute for start block: B:53:0x0104 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:55:0x010e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:57:0x0118 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0022 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x002b */
        static {
            /*
                androidx.compose.material3.tokens.ColorSchemeKeyTokens[] r0 = androidx.compose.material3.tokens.ColorSchemeKeyTokens.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                androidx.compose.material3.tokens.ColorSchemeKeyTokens r1 = androidx.compose.material3.tokens.ColorSchemeKeyTokens.Background     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                androidx.compose.material3.tokens.ColorSchemeKeyTokens r1 = androidx.compose.material3.tokens.ColorSchemeKeyTokens.Error     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                androidx.compose.material3.tokens.ColorSchemeKeyTokens r1 = androidx.compose.material3.tokens.ColorSchemeKeyTokens.ErrorContainer     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                androidx.compose.material3.tokens.ColorSchemeKeyTokens r1 = androidx.compose.material3.tokens.ColorSchemeKeyTokens.InverseOnSurface     // Catch:{ NoSuchFieldError -> 0x002b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                androidx.compose.material3.tokens.ColorSchemeKeyTokens r1 = androidx.compose.material3.tokens.ColorSchemeKeyTokens.InversePrimary     // Catch:{ NoSuchFieldError -> 0x0034 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0034 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0034 }
            L_0x0034:
                androidx.compose.material3.tokens.ColorSchemeKeyTokens r1 = androidx.compose.material3.tokens.ColorSchemeKeyTokens.InverseSurface     // Catch:{ NoSuchFieldError -> 0x003d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003d }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003d }
            L_0x003d:
                androidx.compose.material3.tokens.ColorSchemeKeyTokens r1 = androidx.compose.material3.tokens.ColorSchemeKeyTokens.OnBackground     // Catch:{ NoSuchFieldError -> 0x0046 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0046 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0046 }
            L_0x0046:
                androidx.compose.material3.tokens.ColorSchemeKeyTokens r1 = androidx.compose.material3.tokens.ColorSchemeKeyTokens.OnError     // Catch:{ NoSuchFieldError -> 0x0050 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0050 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0050 }
            L_0x0050:
                androidx.compose.material3.tokens.ColorSchemeKeyTokens r1 = androidx.compose.material3.tokens.ColorSchemeKeyTokens.OnErrorContainer     // Catch:{ NoSuchFieldError -> 0x005a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x005a }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x005a }
            L_0x005a:
                androidx.compose.material3.tokens.ColorSchemeKeyTokens r1 = androidx.compose.material3.tokens.ColorSchemeKeyTokens.OnPrimary     // Catch:{ NoSuchFieldError -> 0x0064 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0064 }
                r2 = 10
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0064 }
            L_0x0064:
                androidx.compose.material3.tokens.ColorSchemeKeyTokens r1 = androidx.compose.material3.tokens.ColorSchemeKeyTokens.OnPrimaryContainer     // Catch:{ NoSuchFieldError -> 0x006e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006e }
                r2 = 11
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006e }
            L_0x006e:
                androidx.compose.material3.tokens.ColorSchemeKeyTokens r1 = androidx.compose.material3.tokens.ColorSchemeKeyTokens.OnSecondary     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r2 = 12
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                androidx.compose.material3.tokens.ColorSchemeKeyTokens r1 = androidx.compose.material3.tokens.ColorSchemeKeyTokens.OnSecondaryContainer     // Catch:{ NoSuchFieldError -> 0x0082 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0082 }
                r2 = 13
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0082 }
            L_0x0082:
                androidx.compose.material3.tokens.ColorSchemeKeyTokens r1 = androidx.compose.material3.tokens.ColorSchemeKeyTokens.OnSurface     // Catch:{ NoSuchFieldError -> 0x008c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x008c }
                r2 = 14
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x008c }
            L_0x008c:
                androidx.compose.material3.tokens.ColorSchemeKeyTokens r1 = androidx.compose.material3.tokens.ColorSchemeKeyTokens.OnSurfaceVariant     // Catch:{ NoSuchFieldError -> 0x0096 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0096 }
                r2 = 15
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0096 }
            L_0x0096:
                androidx.compose.material3.tokens.ColorSchemeKeyTokens r1 = androidx.compose.material3.tokens.ColorSchemeKeyTokens.SurfaceTint     // Catch:{ NoSuchFieldError -> 0x00a0 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00a0 }
                r2 = 16
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00a0 }
            L_0x00a0:
                androidx.compose.material3.tokens.ColorSchemeKeyTokens r1 = androidx.compose.material3.tokens.ColorSchemeKeyTokens.OnTertiary     // Catch:{ NoSuchFieldError -> 0x00aa }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00aa }
                r2 = 17
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00aa }
            L_0x00aa:
                androidx.compose.material3.tokens.ColorSchemeKeyTokens r1 = androidx.compose.material3.tokens.ColorSchemeKeyTokens.OnTertiaryContainer     // Catch:{ NoSuchFieldError -> 0x00b4 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00b4 }
                r2 = 18
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00b4 }
            L_0x00b4:
                androidx.compose.material3.tokens.ColorSchemeKeyTokens r1 = androidx.compose.material3.tokens.ColorSchemeKeyTokens.Outline     // Catch:{ NoSuchFieldError -> 0x00be }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00be }
                r2 = 19
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00be }
            L_0x00be:
                androidx.compose.material3.tokens.ColorSchemeKeyTokens r1 = androidx.compose.material3.tokens.ColorSchemeKeyTokens.OutlineVariant     // Catch:{ NoSuchFieldError -> 0x00c8 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00c8 }
                r2 = 20
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00c8 }
            L_0x00c8:
                androidx.compose.material3.tokens.ColorSchemeKeyTokens r1 = androidx.compose.material3.tokens.ColorSchemeKeyTokens.Primary     // Catch:{ NoSuchFieldError -> 0x00d2 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00d2 }
                r2 = 21
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00d2 }
            L_0x00d2:
                androidx.compose.material3.tokens.ColorSchemeKeyTokens r1 = androidx.compose.material3.tokens.ColorSchemeKeyTokens.PrimaryContainer     // Catch:{ NoSuchFieldError -> 0x00dc }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00dc }
                r2 = 22
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00dc }
            L_0x00dc:
                androidx.compose.material3.tokens.ColorSchemeKeyTokens r1 = androidx.compose.material3.tokens.ColorSchemeKeyTokens.Scrim     // Catch:{ NoSuchFieldError -> 0x00e6 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00e6 }
                r2 = 23
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00e6 }
            L_0x00e6:
                androidx.compose.material3.tokens.ColorSchemeKeyTokens r1 = androidx.compose.material3.tokens.ColorSchemeKeyTokens.Secondary     // Catch:{ NoSuchFieldError -> 0x00f0 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00f0 }
                r2 = 24
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00f0 }
            L_0x00f0:
                androidx.compose.material3.tokens.ColorSchemeKeyTokens r1 = androidx.compose.material3.tokens.ColorSchemeKeyTokens.SecondaryContainer     // Catch:{ NoSuchFieldError -> 0x00fa }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00fa }
                r2 = 25
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00fa }
            L_0x00fa:
                androidx.compose.material3.tokens.ColorSchemeKeyTokens r1 = androidx.compose.material3.tokens.ColorSchemeKeyTokens.Surface     // Catch:{ NoSuchFieldError -> 0x0104 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0104 }
                r2 = 26
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0104 }
            L_0x0104:
                androidx.compose.material3.tokens.ColorSchemeKeyTokens r1 = androidx.compose.material3.tokens.ColorSchemeKeyTokens.SurfaceVariant     // Catch:{ NoSuchFieldError -> 0x010e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x010e }
                r2 = 27
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x010e }
            L_0x010e:
                androidx.compose.material3.tokens.ColorSchemeKeyTokens r1 = androidx.compose.material3.tokens.ColorSchemeKeyTokens.Tertiary     // Catch:{ NoSuchFieldError -> 0x0118 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0118 }
                r2 = 28
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0118 }
            L_0x0118:
                androidx.compose.material3.tokens.ColorSchemeKeyTokens r1 = androidx.compose.material3.tokens.ColorSchemeKeyTokens.TertiaryContainer     // Catch:{ NoSuchFieldError -> 0x0122 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0122 }
                r2 = 29
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0122 }
            L_0x0122:
                $EnumSwitchMapping$0 = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.ColorSchemeKt.WhenMappings.<clinit>():void");
        }
    }

    public static final ProvidableCompositionLocal<ColorScheme> getLocalColorScheme() {
        return LocalColorScheme;
    }

    /* renamed from: lightColorScheme-G1PFc-w$default  reason: not valid java name */
    public static /* synthetic */ ColorScheme m1246lightColorSchemeG1PFcw$default(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, int i, Object obj) {
        int i2 = i;
        long r1 = (i2 & 1) != 0 ? ColorLightTokens.INSTANCE.m1947getPrimary0d7_KjU() : j;
        return m1245lightColorSchemeG1PFcw(r1, (i2 & 2) != 0 ? ColorLightTokens.INSTANCE.m1937getOnPrimary0d7_KjU() : j2, (i2 & 4) != 0 ? ColorLightTokens.INSTANCE.m1948getPrimaryContainer0d7_KjU() : j3, (i2 & 8) != 0 ? ColorLightTokens.INSTANCE.m1938getOnPrimaryContainer0d7_KjU() : j4, (i2 & 16) != 0 ? ColorLightTokens.INSTANCE.m1932getInversePrimary0d7_KjU() : j5, (i2 & 32) != 0 ? ColorLightTokens.INSTANCE.m1950getSecondary0d7_KjU() : j6, (i2 & 64) != 0 ? ColorLightTokens.INSTANCE.m1939getOnSecondary0d7_KjU() : j7, (i2 & 128) != 0 ? ColorLightTokens.INSTANCE.m1951getSecondaryContainer0d7_KjU() : j8, (i2 & 256) != 0 ? ColorLightTokens.INSTANCE.m1940getOnSecondaryContainer0d7_KjU() : j9, (i2 & 512) != 0 ? ColorLightTokens.INSTANCE.m1955getTertiary0d7_KjU() : j10, (i2 & 1024) != 0 ? ColorLightTokens.INSTANCE.m1943getOnTertiary0d7_KjU() : j11, (i2 & 2048) != 0 ? ColorLightTokens.INSTANCE.m1956getTertiaryContainer0d7_KjU() : j12, (i2 & 4096) != 0 ? ColorLightTokens.INSTANCE.m1944getOnTertiaryContainer0d7_KjU() : j13, (i2 & 8192) != 0 ? ColorLightTokens.INSTANCE.m1928getBackground0d7_KjU() : j14, (i2 & 16384) != 0 ? ColorLightTokens.INSTANCE.m1934getOnBackground0d7_KjU() : j15, (i2 & 32768) != 0 ? ColorLightTokens.INSTANCE.m1952getSurface0d7_KjU() : j16, (i2 & 65536) != 0 ? ColorLightTokens.INSTANCE.m1941getOnSurface0d7_KjU() : j17, (i2 & 131072) != 0 ? ColorLightTokens.INSTANCE.m1954getSurfaceVariant0d7_KjU() : j18, (i2 & 262144) != 0 ? ColorLightTokens.INSTANCE.m1942getOnSurfaceVariant0d7_KjU() : j19, (i2 & 524288) != 0 ? r1 : j20, (i2 & 1048576) != 0 ? ColorLightTokens.INSTANCE.m1933getInverseSurface0d7_KjU() : j21, (i2 & 2097152) != 0 ? ColorLightTokens.INSTANCE.m1931getInverseOnSurface0d7_KjU() : j22, (i2 & 4194304) != 0 ? ColorLightTokens.INSTANCE.m1929getError0d7_KjU() : j23, (i2 & 8388608) != 0 ? ColorLightTokens.INSTANCE.m1935getOnError0d7_KjU() : j24, (i2 & 16777216) != 0 ? ColorLightTokens.INSTANCE.m1930getErrorContainer0d7_KjU() : j25, (i2 & 33554432) != 0 ? ColorLightTokens.INSTANCE.m1936getOnErrorContainer0d7_KjU() : j26, (i2 & 67108864) != 0 ? ColorLightTokens.INSTANCE.m1945getOutline0d7_KjU() : j27, (i2 & 134217728) != 0 ? ColorLightTokens.INSTANCE.m1946getOutlineVariant0d7_KjU() : j28, (i2 & 268435456) != 0 ? ColorLightTokens.INSTANCE.m1949getScrim0d7_KjU() : j29);
    }

    /* renamed from: lightColorScheme-G1PFc-w  reason: not valid java name */
    public static final ColorScheme m1245lightColorSchemeG1PFcw(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29) {
        return new ColorScheme(j, j2, j3, j4, j5, j6, j7, j8, j9, j10, j11, j12, j13, j14, j15, j16, j17, j18, j19, j20, j21, j22, j23, j24, j25, j26, j27, j28, j29, (DefaultConstructorMarker) null);
    }

    /* renamed from: darkColorScheme-G1PFc-w$default  reason: not valid java name */
    public static /* synthetic */ ColorScheme m1244darkColorSchemeG1PFcw$default(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, int i, Object obj) {
        int i2 = i;
        long r1 = (i2 & 1) != 0 ? ColorDarkTokens.INSTANCE.m1918getPrimary0d7_KjU() : j;
        return m1243darkColorSchemeG1PFcw(r1, (i2 & 2) != 0 ? ColorDarkTokens.INSTANCE.m1908getOnPrimary0d7_KjU() : j2, (i2 & 4) != 0 ? ColorDarkTokens.INSTANCE.m1919getPrimaryContainer0d7_KjU() : j3, (i2 & 8) != 0 ? ColorDarkTokens.INSTANCE.m1909getOnPrimaryContainer0d7_KjU() : j4, (i2 & 16) != 0 ? ColorDarkTokens.INSTANCE.m1903getInversePrimary0d7_KjU() : j5, (i2 & 32) != 0 ? ColorDarkTokens.INSTANCE.m1921getSecondary0d7_KjU() : j6, (i2 & 64) != 0 ? ColorDarkTokens.INSTANCE.m1910getOnSecondary0d7_KjU() : j7, (i2 & 128) != 0 ? ColorDarkTokens.INSTANCE.m1922getSecondaryContainer0d7_KjU() : j8, (i2 & 256) != 0 ? ColorDarkTokens.INSTANCE.m1911getOnSecondaryContainer0d7_KjU() : j9, (i2 & 512) != 0 ? ColorDarkTokens.INSTANCE.m1926getTertiary0d7_KjU() : j10, (i2 & 1024) != 0 ? ColorDarkTokens.INSTANCE.m1914getOnTertiary0d7_KjU() : j11, (i2 & 2048) != 0 ? ColorDarkTokens.INSTANCE.m1927getTertiaryContainer0d7_KjU() : j12, (i2 & 4096) != 0 ? ColorDarkTokens.INSTANCE.m1915getOnTertiaryContainer0d7_KjU() : j13, (i2 & 8192) != 0 ? ColorDarkTokens.INSTANCE.m1899getBackground0d7_KjU() : j14, (i2 & 16384) != 0 ? ColorDarkTokens.INSTANCE.m1905getOnBackground0d7_KjU() : j15, (i2 & 32768) != 0 ? ColorDarkTokens.INSTANCE.m1923getSurface0d7_KjU() : j16, (i2 & 65536) != 0 ? ColorDarkTokens.INSTANCE.m1912getOnSurface0d7_KjU() : j17, (i2 & 131072) != 0 ? ColorDarkTokens.INSTANCE.m1925getSurfaceVariant0d7_KjU() : j18, (i2 & 262144) != 0 ? ColorDarkTokens.INSTANCE.m1913getOnSurfaceVariant0d7_KjU() : j19, (i2 & 524288) != 0 ? r1 : j20, (i2 & 1048576) != 0 ? ColorDarkTokens.INSTANCE.m1904getInverseSurface0d7_KjU() : j21, (i2 & 2097152) != 0 ? ColorDarkTokens.INSTANCE.m1902getInverseOnSurface0d7_KjU() : j22, (i2 & 4194304) != 0 ? ColorDarkTokens.INSTANCE.m1900getError0d7_KjU() : j23, (i2 & 8388608) != 0 ? ColorDarkTokens.INSTANCE.m1906getOnError0d7_KjU() : j24, (i2 & 16777216) != 0 ? ColorDarkTokens.INSTANCE.m1901getErrorContainer0d7_KjU() : j25, (i2 & 33554432) != 0 ? ColorDarkTokens.INSTANCE.m1907getOnErrorContainer0d7_KjU() : j26, (i2 & 67108864) != 0 ? ColorDarkTokens.INSTANCE.m1916getOutline0d7_KjU() : j27, (i2 & 134217728) != 0 ? ColorDarkTokens.INSTANCE.m1917getOutlineVariant0d7_KjU() : j28, (i2 & 268435456) != 0 ? ColorDarkTokens.INSTANCE.m1920getScrim0d7_KjU() : j29);
    }

    /* renamed from: darkColorScheme-G1PFc-w  reason: not valid java name */
    public static final ColorScheme m1243darkColorSchemeG1PFcw(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29) {
        return new ColorScheme(j, j2, j3, j4, j5, j6, j7, j8, j9, j10, j11, j12, j13, j14, j15, j16, j17, j18, j19, j20, j21, j22, j23, j24, j25, j26, j27, j28, j29, (DefaultConstructorMarker) null);
    }

    /* renamed from: contentColorFor-4WTKRHQ  reason: not valid java name */
    public static final long m1241contentColorFor4WTKRHQ(ColorScheme colorScheme, long j) {
        Intrinsics.checkNotNullParameter(colorScheme, "$this$contentColorFor");
        if (Color.m2822equalsimpl0(j, colorScheme.m1201getPrimary0d7_KjU())) {
            return colorScheme.m1191getOnPrimary0d7_KjU();
        }
        if (Color.m2822equalsimpl0(j, colorScheme.m1204getSecondary0d7_KjU())) {
            return colorScheme.m1193getOnSecondary0d7_KjU();
        }
        if (Color.m2822equalsimpl0(j, colorScheme.m1209getTertiary0d7_KjU())) {
            return colorScheme.m1197getOnTertiary0d7_KjU();
        }
        if (Color.m2822equalsimpl0(j, colorScheme.m1182getBackground0d7_KjU())) {
            return colorScheme.m1188getOnBackground0d7_KjU();
        }
        if (Color.m2822equalsimpl0(j, colorScheme.m1183getError0d7_KjU())) {
            return colorScheme.m1189getOnError0d7_KjU();
        }
        if (Color.m2822equalsimpl0(j, colorScheme.m1206getSurface0d7_KjU())) {
            return colorScheme.m1195getOnSurface0d7_KjU();
        }
        if (Color.m2822equalsimpl0(j, colorScheme.m1208getSurfaceVariant0d7_KjU())) {
            return colorScheme.m1196getOnSurfaceVariant0d7_KjU();
        }
        if (Color.m2822equalsimpl0(j, colorScheme.m1202getPrimaryContainer0d7_KjU())) {
            return colorScheme.m1192getOnPrimaryContainer0d7_KjU();
        }
        if (Color.m2822equalsimpl0(j, colorScheme.m1205getSecondaryContainer0d7_KjU())) {
            return colorScheme.m1194getOnSecondaryContainer0d7_KjU();
        }
        if (Color.m2822equalsimpl0(j, colorScheme.m1210getTertiaryContainer0d7_KjU())) {
            return colorScheme.m1198getOnTertiaryContainer0d7_KjU();
        }
        if (Color.m2822equalsimpl0(j, colorScheme.m1184getErrorContainer0d7_KjU())) {
            return colorScheme.m1190getOnErrorContainer0d7_KjU();
        }
        if (Color.m2822equalsimpl0(j, colorScheme.m1187getInverseSurface0d7_KjU())) {
            return colorScheme.m1185getInverseOnSurface0d7_KjU();
        }
        return Color.Companion.m2857getUnspecified0d7_KjU();
    }

    /* renamed from: contentColorFor-ek8zF_U  reason: not valid java name */
    public static final long m1242contentColorForek8zF_U(long j, Composer composer, int i) {
        ComposerKt.sourceInformationMarkerStart(composer, 509589638, "C(contentColorFor)P(0:c#ui.graphics.Color)*474@21497L11,475@21581L7:ColorScheme.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(509589638, i, -1, "androidx.compose.material3.contentColorFor (ColorScheme.kt:473)");
        }
        long r3 = m1241contentColorFor4WTKRHQ(MaterialTheme.INSTANCE.getColorScheme(composer, 6), j);
        if (r3 == Color.Companion.m2857getUnspecified0d7_KjU()) {
            ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object consume = composer.consume(ContentColorKt.getLocalContentColor());
            ComposerKt.sourceInformationMarkerEnd(composer);
            r3 = ((Color) consume).m2831unboximpl();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return r3;
    }

    /* renamed from: applyTonalElevation-Hht5A8o  reason: not valid java name */
    public static final long m1240applyTonalElevationHht5A8o(ColorScheme colorScheme, long j, float f) {
        Intrinsics.checkNotNullParameter(colorScheme, "$this$applyTonalElevation");
        return Color.m2822equalsimpl0(j, colorScheme.m1206getSurface0d7_KjU()) ? m1247surfaceColorAtElevation3ABfNKs(colorScheme, f) : j;
    }

    public static final void updateColorSchemeFrom(ColorScheme colorScheme, ColorScheme colorScheme2) {
        Intrinsics.checkNotNullParameter(colorScheme, "<this>");
        Intrinsics.checkNotNullParameter(colorScheme2, "other");
        colorScheme.m1230setPrimary8_81llA$material3_release(colorScheme2.m1201getPrimary0d7_KjU());
        colorScheme.m1220setOnPrimary8_81llA$material3_release(colorScheme2.m1191getOnPrimary0d7_KjU());
        colorScheme.m1231setPrimaryContainer8_81llA$material3_release(colorScheme2.m1202getPrimaryContainer0d7_KjU());
        colorScheme.m1221setOnPrimaryContainer8_81llA$material3_release(colorScheme2.m1192getOnPrimaryContainer0d7_KjU());
        colorScheme.m1215setInversePrimary8_81llA$material3_release(colorScheme2.m1186getInversePrimary0d7_KjU());
        colorScheme.m1233setSecondary8_81llA$material3_release(colorScheme2.m1204getSecondary0d7_KjU());
        colorScheme.m1222setOnSecondary8_81llA$material3_release(colorScheme2.m1193getOnSecondary0d7_KjU());
        colorScheme.m1234setSecondaryContainer8_81llA$material3_release(colorScheme2.m1205getSecondaryContainer0d7_KjU());
        colorScheme.m1223setOnSecondaryContainer8_81llA$material3_release(colorScheme2.m1194getOnSecondaryContainer0d7_KjU());
        colorScheme.m1238setTertiary8_81llA$material3_release(colorScheme2.m1209getTertiary0d7_KjU());
        colorScheme.m1226setOnTertiary8_81llA$material3_release(colorScheme2.m1197getOnTertiary0d7_KjU());
        colorScheme.m1239setTertiaryContainer8_81llA$material3_release(colorScheme2.m1210getTertiaryContainer0d7_KjU());
        colorScheme.m1227setOnTertiaryContainer8_81llA$material3_release(colorScheme2.m1198getOnTertiaryContainer0d7_KjU());
        colorScheme.m1211setBackground8_81llA$material3_release(colorScheme2.m1182getBackground0d7_KjU());
        colorScheme.m1217setOnBackground8_81llA$material3_release(colorScheme2.m1188getOnBackground0d7_KjU());
        colorScheme.m1235setSurface8_81llA$material3_release(colorScheme2.m1206getSurface0d7_KjU());
        colorScheme.m1224setOnSurface8_81llA$material3_release(colorScheme2.m1195getOnSurface0d7_KjU());
        colorScheme.m1237setSurfaceVariant8_81llA$material3_release(colorScheme2.m1208getSurfaceVariant0d7_KjU());
        colorScheme.m1225setOnSurfaceVariant8_81llA$material3_release(colorScheme2.m1196getOnSurfaceVariant0d7_KjU());
        colorScheme.m1236setSurfaceTint8_81llA$material3_release(colorScheme2.m1207getSurfaceTint0d7_KjU());
        colorScheme.m1216setInverseSurface8_81llA$material3_release(colorScheme2.m1187getInverseSurface0d7_KjU());
        colorScheme.m1214setInverseOnSurface8_81llA$material3_release(colorScheme2.m1185getInverseOnSurface0d7_KjU());
        colorScheme.m1212setError8_81llA$material3_release(colorScheme2.m1183getError0d7_KjU());
        colorScheme.m1218setOnError8_81llA$material3_release(colorScheme2.m1189getOnError0d7_KjU());
        colorScheme.m1213setErrorContainer8_81llA$material3_release(colorScheme2.m1184getErrorContainer0d7_KjU());
        colorScheme.m1219setOnErrorContainer8_81llA$material3_release(colorScheme2.m1190getOnErrorContainer0d7_KjU());
        colorScheme.m1228setOutline8_81llA$material3_release(colorScheme2.m1199getOutline0d7_KjU());
        colorScheme.m1229setOutlineVariant8_81llA$material3_release(colorScheme2.m1200getOutlineVariant0d7_KjU());
        colorScheme.m1232setScrim8_81llA$material3_release(colorScheme2.m1203getScrim0d7_KjU());
    }

    public static final long fromToken(ColorScheme colorScheme, ColorSchemeKeyTokens colorSchemeKeyTokens) {
        Intrinsics.checkNotNullParameter(colorScheme, "<this>");
        Intrinsics.checkNotNullParameter(colorSchemeKeyTokens, "value");
        switch (WhenMappings.$EnumSwitchMapping$0[colorSchemeKeyTokens.ordinal()]) {
            case 1:
                return colorScheme.m1182getBackground0d7_KjU();
            case 2:
                return colorScheme.m1183getError0d7_KjU();
            case 3:
                return colorScheme.m1184getErrorContainer0d7_KjU();
            case 4:
                return colorScheme.m1185getInverseOnSurface0d7_KjU();
            case 5:
                return colorScheme.m1186getInversePrimary0d7_KjU();
            case 6:
                return colorScheme.m1187getInverseSurface0d7_KjU();
            case 7:
                return colorScheme.m1188getOnBackground0d7_KjU();
            case 8:
                return colorScheme.m1189getOnError0d7_KjU();
            case 9:
                return colorScheme.m1190getOnErrorContainer0d7_KjU();
            case 10:
                return colorScheme.m1191getOnPrimary0d7_KjU();
            case 11:
                return colorScheme.m1192getOnPrimaryContainer0d7_KjU();
            case 12:
                return colorScheme.m1193getOnSecondary0d7_KjU();
            case 13:
                return colorScheme.m1194getOnSecondaryContainer0d7_KjU();
            case 14:
                return colorScheme.m1195getOnSurface0d7_KjU();
            case 15:
                return colorScheme.m1196getOnSurfaceVariant0d7_KjU();
            case 16:
                return colorScheme.m1207getSurfaceTint0d7_KjU();
            case 17:
                return colorScheme.m1197getOnTertiary0d7_KjU();
            case 18:
                return colorScheme.m1198getOnTertiaryContainer0d7_KjU();
            case 19:
                return colorScheme.m1199getOutline0d7_KjU();
            case 20:
                return colorScheme.m1200getOutlineVariant0d7_KjU();
            case 21:
                return colorScheme.m1201getPrimary0d7_KjU();
            case 22:
                return colorScheme.m1202getPrimaryContainer0d7_KjU();
            case 23:
                return colorScheme.m1203getScrim0d7_KjU();
            case 24:
                return colorScheme.m1204getSecondary0d7_KjU();
            case 25:
                return colorScheme.m1205getSecondaryContainer0d7_KjU();
            case 26:
                return colorScheme.m1206getSurface0d7_KjU();
            case 27:
                return colorScheme.m1208getSurfaceVariant0d7_KjU();
            case 28:
                return colorScheme.m1209getTertiary0d7_KjU();
            case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_HORIZONTAL_BIAS /*29*/:
                return colorScheme.m1210getTertiaryContainer0d7_KjU();
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static final long toColor(ColorSchemeKeyTokens colorSchemeKeyTokens, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(colorSchemeKeyTokens, "<this>");
        ComposerKt.sourceInformationMarkerStart(composer, 1330949347, "C(toColor)612@27498L11:ColorScheme.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1330949347, i, -1, "androidx.compose.material3.toColor (ColorScheme.kt:611)");
        }
        long fromToken = fromToken(MaterialTheme.INSTANCE.getColorScheme(composer, 6), colorSchemeKeyTokens);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return fromToken;
    }

    /* renamed from: surfaceColorAtElevation-3ABfNKs  reason: not valid java name */
    public static final long m1247surfaceColorAtElevation3ABfNKs(ColorScheme colorScheme, float f) {
        Intrinsics.checkNotNullParameter(colorScheme, "$this$surfaceColorAtElevation");
        if (Dp.m5631equalsimpl0(f, Dp.m5626constructorimpl((float) 0))) {
            return colorScheme.m1206getSurface0d7_KjU();
        }
        return ColorKt.m2866compositeOverOWjLjI(Color.m2820copywmQWz5c$default(colorScheme.m1207getSurfaceTint0d7_KjU(), ((((float) Math.log((double) (f + ((float) 1)))) * 4.5f) + 2.0f) / 100.0f, 0.0f, 0.0f, 0.0f, 14, (Object) null), colorScheme.m1206getSurface0d7_KjU());
    }
}
