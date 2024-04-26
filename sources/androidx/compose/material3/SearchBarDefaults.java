package androidx.compose.material3;

import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.layout.WindowInsets_androidKt;
import androidx.compose.foundation.text.selection.TextSelectionColors;
import androidx.compose.foundation.text.selection.TextSelectionColorsKt;
import androidx.compose.material3.tokens.FilledTextFieldTokens;
import androidx.compose.material3.tokens.SearchBarTokens;
import androidx.compose.material3.tokens.SearchViewTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shape;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0011\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J3\u0010\u0016\u001a\u00020\u00172\b\b\u0002\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u00192\b\b\u0002\u0010\u001b\u001a\u00020\u001cH\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001eJ\u0001\u0010\u001b\u001a\u00020\u001c2\b\b\u0002\u0010\u001f\u001a\u00020\u00192\b\b\u0002\u0010 \u001a\u00020\u00192\b\b\u0002\u0010!\u001a\u00020\u00192\b\b\u0002\u0010\"\u001a\u00020#2\b\b\u0002\u0010$\u001a\u00020\u00192\b\b\u0002\u0010%\u001a\u00020\u00192\b\b\u0002\u0010&\u001a\u00020\u00192\b\b\u0002\u0010'\u001a\u00020\u00192\b\b\u0002\u0010(\u001a\u00020\u00192\b\b\u0002\u0010)\u001a\u00020\u00192\b\b\u0002\u0010*\u001a\u00020\u00192\b\b\u0002\u0010+\u001a\u00020\u0019H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b,\u0010-J¡\u0001\u0010\u001b\u001a\u00020\u001c2\b\b\u0002\u0010.\u001a\u00020\u00192\b\b\u0002\u0010/\u001a\u00020\u00192\b\b\u0002\u0010 \u001a\u00020\u00192\b\b\u0002\u0010!\u001a\u00020\u00192\b\b\u0002\u0010\"\u001a\u00020#2\b\b\u0002\u0010$\u001a\u00020\u00192\b\b\u0002\u0010%\u001a\u00020\u00192\b\b\u0002\u0010&\u001a\u00020\u00192\b\b\u0002\u0010'\u001a\u00020\u00192\b\b\u0002\u0010(\u001a\u00020\u00192\b\b\u0002\u0010)\u001a\u00020\u00192\b\b\u0002\u00100\u001a\u00020\u00192\b\b\u0002\u00101\u001a\u00020\u00192\b\b\u0002\u0010+\u001a\u00020\u0019H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b2\u00103R\u001c\u0010\u0003\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006R\u001c\u0010\b\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\t\u0010\u0006R\u0011\u0010\n\u001a\u00020\u000b8G¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0011\u0010\u000e\u001a\u00020\u000b8G¢\u0006\u0006\u001a\u0004\b\u000f\u0010\rR\u0011\u0010\u0010\u001a\u00020\u000b8G¢\u0006\u0006\u001a\u0004\b\u0011\u0010\rR\u0011\u0010\u0012\u001a\u00020\u00138G¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u00064"}, d2 = {"Landroidx/compose/material3/SearchBarDefaults;", "", "()V", "Elevation", "Landroidx/compose/ui/unit/Dp;", "getElevation-D9Ej5fM", "()F", "F", "InputFieldHeight", "getInputFieldHeight-D9Ej5fM", "dockedShape", "Landroidx/compose/ui/graphics/Shape;", "getDockedShape", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/Shape;", "fullScreenShape", "getFullScreenShape", "inputFieldShape", "getInputFieldShape", "windowInsets", "Landroidx/compose/foundation/layout/WindowInsets;", "getWindowInsets", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/layout/WindowInsets;", "colors", "Landroidx/compose/material3/SearchBarColors;", "containerColor", "Landroidx/compose/ui/graphics/Color;", "dividerColor", "inputFieldColors", "Landroidx/compose/material3/TextFieldColors;", "colors-Klgx-Pg", "(JJLandroidx/compose/material3/TextFieldColors;Landroidx/compose/runtime/Composer;II)Landroidx/compose/material3/SearchBarColors;", "textColor", "disabledTextColor", "cursorColor", "selectionColors", "Landroidx/compose/foundation/text/selection/TextSelectionColors;", "focusedLeadingIconColor", "unfocusedLeadingIconColor", "disabledLeadingIconColor", "focusedTrailingIconColor", "unfocusedTrailingIconColor", "disabledTrailingIconColor", "placeholderColor", "disabledPlaceholderColor", "inputFieldColors--u-KgnY", "(JJJLandroidx/compose/foundation/text/selection/TextSelectionColors;JJJJJJJJLandroidx/compose/runtime/Composer;III)Landroidx/compose/material3/TextFieldColors;", "focusedTextColor", "unfocusedTextColor", "focusedPlaceholderColor", "unfocusedPlaceholderColor", "inputFieldColors-ITpI4ow", "(JJJJLandroidx/compose/foundation/text/selection/TextSelectionColors;JJJJJJJJJLandroidx/compose/runtime/Composer;III)Landroidx/compose/material3/TextFieldColors;", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* compiled from: SearchBar.kt */
public final class SearchBarDefaults {
    public static final int $stable = 0;
    private static final float Elevation = SearchBarTokens.INSTANCE.m2283getContainerElevationD9Ej5fM();
    public static final SearchBarDefaults INSTANCE = new SearchBarDefaults();
    private static final float InputFieldHeight = SearchBarTokens.INSTANCE.m2284getContainerHeightD9Ej5fM();

    /* renamed from: getElevation-D9Ej5fM  reason: not valid java name */
    public final float m1524getElevationD9Ej5fM() {
        return Elevation;
    }

    /* renamed from: getInputFieldHeight-D9Ej5fM  reason: not valid java name */
    public final float m1525getInputFieldHeightD9Ej5fM() {
        return InputFieldHeight;
    }

    private SearchBarDefaults() {
    }

    public final Shape getInputFieldShape(Composer composer, int i) {
        composer.startReplaceableGroup(-1770571533);
        ComposerKt.sourceInformation(composer, "C504@23164L9:SearchBar.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1770571533, i, -1, "androidx.compose.material3.SearchBarDefaults.<get-inputFieldShape> (SearchBar.kt:504)");
        }
        Shape shape = ShapesKt.toShape(SearchBarTokens.INSTANCE.getContainerShape(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return shape;
    }

    public final Shape getFullScreenShape(Composer composer, int i) {
        composer.startReplaceableGroup(-2009956471);
        ComposerKt.sourceInformation(composer, "C508@23340L9:SearchBar.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2009956471, i, -1, "androidx.compose.material3.SearchBarDefaults.<get-fullScreenShape> (SearchBar.kt:508)");
        }
        Shape shape = ShapesKt.toShape(SearchViewTokens.INSTANCE.getFullScreenContainerShape(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return shape;
    }

    public final Shape getDockedShape(Composer composer, int i) {
        composer.startReplaceableGroup(-1447354121);
        ComposerKt.sourceInformation(composer, "C511@23486L9:SearchBar.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1447354121, i, -1, "androidx.compose.material3.SearchBarDefaults.<get-dockedShape> (SearchBar.kt:511)");
        }
        Shape shape = ShapesKt.toShape(SearchViewTokens.INSTANCE.getDockedContainerShape(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return shape;
    }

    public final WindowInsets getWindowInsets(Composer composer, int i) {
        composer.startReplaceableGroup(-1795925906);
        ComposerKt.sourceInformation(composer, "C514@23617L10:SearchBar.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1795925906, i, -1, "androidx.compose.material3.SearchBarDefaults.<get-windowInsets> (SearchBar.kt:514)");
        }
        WindowInsets statusBars = WindowInsets_androidKt.getStatusBars(WindowInsets.Companion, composer, 8);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return statusBars;
    }

    /* renamed from: colors-Klgx-Pg  reason: not valid java name */
    public final SearchBarColors m1523colorsKlgxPg(long j, long j2, TextFieldColors textFieldColors, Composer composer, int i, int i2) {
        Composer composer2 = composer;
        int i3 = i;
        composer2.startReplaceableGroup(701925149);
        ComposerKt.sourceInformation(composer2, "C(colors)P(0:c#ui.graphics.Color,1:c#ui.graphics.Color)526@24106L9,527@24177L9,528@24232L18:SearchBar.kt#uh7d8r");
        long color = (i2 & 1) != 0 ? ColorSchemeKt.toColor(SearchBarTokens.INSTANCE.getContainerColor(), composer2, 6) : j;
        long color2 = (i2 & 2) != 0 ? ColorSchemeKt.toColor(SearchViewTokens.INSTANCE.getDividerColor(), composer2, 6) : j2;
        TextFieldColors r10 = (i2 & 4) != 0 ? m1527inputFieldColorsITpI4ow(0, 0, 0, 0, (TextSelectionColors) null, 0, 0, 0, 0, 0, 0, 0, 0, 0, composer, 0, (i3 << 3) & 57344, 16383) : textFieldColors;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(701925149, i, -1, "androidx.compose.material3.SearchBarDefaults.colors (SearchBar.kt:525)");
        }
        SearchBarColors searchBarColors = new SearchBarColors(color, color2, r10, (DefaultConstructorMarker) null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return searchBarColors;
    }

    /* renamed from: inputFieldColors-ITpI4ow  reason: not valid java name */
    public final TextFieldColors m1527inputFieldColorsITpI4ow(long j, long j2, long j3, long j4, TextSelectionColors textSelectionColors, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, Composer composer, int i, int i2, int i3) {
        TextSelectionColors textSelectionColors2;
        Composer composer2 = composer;
        int i4 = i;
        int i5 = i2;
        int i6 = i3;
        composer2.startReplaceableGroup(-2048506052);
        ComposerKt.sourceInformation(composer2, "C(inputFieldColors)P(7:c#ui.graphics.Color,12:c#ui.graphics.Color,3:c#ui.graphics.Color,0:c#ui.graphics.Color,9,5:c#ui.graphics.Color,10:c#ui.graphics.Color,1:c#ui.graphics.Color,8:c#ui.graphics.Color,13:c#ui.graphics.Color,4:c#ui.graphics.Color,6:c#ui.graphics.Color,11:c#ui.graphics.Color,2:c#ui.graphics.Color)561@26199L9,562@26277L9,563@26364L9,565@26507L9,566@26590L7,567@26673L9,568@26760L9,570@26873L9,571@27023L9,572@27112L9,574@27227L9,575@27379L9,576@27469L9,577@27563L9,580@27695L847:SearchBar.kt#uh7d8r");
        long color = (i6 & 1) != 0 ? ColorSchemeKt.toColor(SearchBarTokens.INSTANCE.getInputTextColor(), composer2, 6) : j;
        long color2 = (i6 & 2) != 0 ? ColorSchemeKt.toColor(SearchBarTokens.INSTANCE.getInputTextColor(), composer2, 6) : j2;
        long r32 = (i6 & 4) != 0 ? Color.m2820copywmQWz5c$default(ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getDisabledInputColor(), composer2, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, (Object) null) : j3;
        long color3 = (i6 & 8) != 0 ? ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getCaretColor(), composer2, 6) : j4;
        if ((i6 & 16) != 0) {
            ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object consume = composer2.consume(TextSelectionColorsKt.getLocalTextSelectionColors());
            ComposerKt.sourceInformationMarkerEnd(composer);
            textSelectionColors2 = (TextSelectionColors) consume;
        } else {
            textSelectionColors2 = textSelectionColors;
        }
        long color4 = (i6 & 32) != 0 ? ColorSchemeKt.toColor(SearchBarTokens.INSTANCE.getLeadingIconColor(), composer2, 6) : j5;
        long color5 = (i6 & 64) != 0 ? ColorSchemeKt.toColor(SearchBarTokens.INSTANCE.getLeadingIconColor(), composer2, 6) : j6;
        long r42 = (i6 & 128) != 0 ? Color.m2820copywmQWz5c$default(ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getDisabledLeadingIconColor(), composer2, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, (Object) null) : j7;
        long color6 = (i6 & 256) != 0 ? ColorSchemeKt.toColor(SearchBarTokens.INSTANCE.getTrailingIconColor(), composer2, 6) : j8;
        long color7 = (i6 & 512) != 0 ? ColorSchemeKt.toColor(SearchBarTokens.INSTANCE.getTrailingIconColor(), composer2, 6) : j9;
        long r58 = (i6 & 1024) != 0 ? Color.m2820copywmQWz5c$default(ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getDisabledTrailingIconColor(), composer2, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, (Object) null) : j10;
        long color8 = (i6 & 2048) != 0 ? ColorSchemeKt.toColor(SearchBarTokens.INSTANCE.getSupportingTextColor(), composer2, 6) : j11;
        long color9 = (i6 & 4096) != 0 ? ColorSchemeKt.toColor(SearchBarTokens.INSTANCE.getSupportingTextColor(), composer2, 6) : j12;
        long r98 = (i6 & 8192) != 0 ? Color.m2820copywmQWz5c$default(ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getDisabledInputColor(), composer2, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, (Object) null) : j13;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2048506052, i4, i5, "androidx.compose.material3.SearchBarDefaults.inputFieldColors (SearchBar.kt:560)");
        }
        int i7 = i5 << 18;
        TextFieldColors r0 = TextFieldDefaults.INSTANCE.m1696colors0hiis_0(color, color2, r32, 0, 0, 0, 0, 0, color3, 0, textSelectionColors2, 0, 0, 0, 0, color4, color5, r42, 0, color6, color7, r58, 0, 0, 0, 0, 0, color8, color9, r98, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, composer, (i4 & 14) | (i4 & 112) | (i4 & 896) | ((i4 << 15) & 234881024), ((i4 >> 12) & 14) | (458752 & i4) | (3670016 & i4) | (i4 & 29360128) | ((i4 << 3) & 1879048192), ((i4 >> 27) & 14) | ((i5 << 3) & 112) | (i7 & 29360128) | (i7 & 234881024) | (i7 & 1879048192), 0, 3072, 1204058872, 4095);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return r0;
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Maintained for binary compatibility")
    /* renamed from: inputFieldColors--u-KgnY  reason: not valid java name */
    public final /* synthetic */ TextFieldColors m1526inputFieldColorsuKgnY(long j, long j2, long j3, TextSelectionColors textSelectionColors, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, Composer composer, int i, int i2, int i3) {
        TextSelectionColors textSelectionColors2;
        Composer composer2 = composer;
        int i4 = i;
        int i5 = i2;
        int i6 = i3;
        composer2.startReplaceableGroup(1842555178);
        ComposerKt.sourceInformation(composer2, "C(inputFieldColors)P(9:c#ui.graphics.Color,3:c#ui.graphics.Color,0:c#ui.graphics.Color,8,5:c#ui.graphics.Color,10:c#ui.graphics.Color,1:c#ui.graphics.Color,6:c#ui.graphics.Color,11:c#ui.graphics.Color,4:c#ui.graphics.Color,7:c#ui.graphics.Color,2:c#ui.graphics.Color)600@28732L9,601@28819L9,603@28962L9,604@29045L7,605@29128L9,606@29215L9,608@29328L9,609@29478L9,610@29567L9,612@29682L9,613@29827L9,614@29921L9,616@30010L765:SearchBar.kt#uh7d8r");
        long color = (i6 & 1) != 0 ? ColorSchemeKt.toColor(SearchBarTokens.INSTANCE.getInputTextColor(), composer2, 6) : j;
        long r8 = (i6 & 2) != 0 ? Color.m2820copywmQWz5c$default(ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getDisabledInputColor(), composer2, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, (Object) null) : j2;
        long color2 = (i6 & 4) != 0 ? ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getCaretColor(), composer2, 6) : j3;
        if ((i6 & 8) != 0) {
            ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object consume = composer2.consume(TextSelectionColorsKt.getLocalTextSelectionColors());
            ComposerKt.sourceInformationMarkerEnd(composer);
            textSelectionColors2 = (TextSelectionColors) consume;
        } else {
            textSelectionColors2 = textSelectionColors;
        }
        long color3 = (i6 & 16) != 0 ? ColorSchemeKt.toColor(SearchBarTokens.INSTANCE.getLeadingIconColor(), composer2, 6) : j4;
        long color4 = (i6 & 32) != 0 ? ColorSchemeKt.toColor(SearchBarTokens.INSTANCE.getLeadingIconColor(), composer2, 6) : j5;
        long r19 = (i6 & 64) != 0 ? Color.m2820copywmQWz5c$default(ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getDisabledLeadingIconColor(), composer2, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, (Object) null) : j6;
        long color5 = (i6 & 128) != 0 ? ColorSchemeKt.toColor(SearchBarTokens.INSTANCE.getTrailingIconColor(), composer2, 6) : j7;
        long color6 = (i6 & 256) != 0 ? ColorSchemeKt.toColor(SearchBarTokens.INSTANCE.getTrailingIconColor(), composer2, 6) : j8;
        long r25 = (i6 & 512) != 0 ? Color.m2820copywmQWz5c$default(ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getDisabledTrailingIconColor(), composer2, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, (Object) null) : j9;
        long color7 = (i6 & 1024) != 0 ? ColorSchemeKt.toColor(SearchBarTokens.INSTANCE.getSupportingTextColor(), composer2, 6) : j10;
        long r32 = (i6 & 2048) != 0 ? Color.m2820copywmQWz5c$default(ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getDisabledInputColor(), composer2, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, (Object) null) : j11;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1842555178, i4, i5, "androidx.compose.material3.SearchBarDefaults.inputFieldColors (SearchBar.kt:599)");
        }
        int i7 = i4 << 3;
        int i8 = i5 << 6;
        TextFieldColors r0 = m1527inputFieldColorsITpI4ow(color, color, r8, color2, textSelectionColors2, color3, color4, r19, color5, color6, r25, color7, color7, r32, composer, (i4 & 14) | (i7 & 112) | (i7 & 896) | (i7 & 7168) | (i7 & 57344) | (458752 & i7) | (3670016 & i7) | (29360128 & i7) | (234881024 & i7) | (i7 & 1879048192), ((i4 >> 27) & 14) | ((i5 << 3) & 112) | (i8 & 896) | (i8 & 7168) | (i8 & 57344), 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return r0;
    }
}
