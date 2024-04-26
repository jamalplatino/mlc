package androidx.compose.material3;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

@Metadata(d1 = {"\u0000t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\u001a¦\u0001\u0010\u0007\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\n2\u0011\u0010\u000b\u001a\r\u0012\u0004\u0012\u00020\b0\n¢\u0006\u0002\b\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\u0015\b\u0002\u0010\u0011\u001a\u000f\u0012\u0004\u0012\u00020\b\u0018\u00010\n¢\u0006\u0002\b\f2\u0015\b\u0002\u0010\u0012\u001a\u000f\u0012\u0004\u0012\u00020\b\u0018\u00010\n¢\u0006\u0002\b\f2\b\b\u0002\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u00162\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\b\b\u0002\u0010\u001b\u001a\u00020\u001cH\u0007¢\u0006\u0002\u0010\u001d\u001a¼\u0001\u0010\u001e\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u000e2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\n2\u0006\u0010\u000f\u001a\u00020\u00102\u0011\u0010\u000b\u001a\r\u0012\u0004\u0012\u00020\b0\n¢\u0006\u0002\b\f2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\u0013\u0010\u0011\u001a\u000f\u0012\u0004\u0012\u00020\b\u0018\u00010\n¢\u0006\u0002\b\f2\u0013\u0010\u0012\u001a\u000f\u0012\u0004\u0012\u00020\b\u0018\u00010\n¢\u0006\u0002\b\f2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010#2\u0006\u0010$\u001a\u00020\u00042\u0006\u0010%\u001a\u00020\u00012\u0006\u0010\u001b\u001a\u00020\u001cH\u0003ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b&\u0010'\u001a\u0001\u0010(\u001a\u00020\b2\u0011\u0010\u000b\u001a\r\u0012\u0004\u0012\u00020\b0\n¢\u0006\u0002\b\f2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\u0013\u0010\u0011\u001a\u000f\u0012\u0004\u0012\u00020\b\u0018\u00010\n¢\u0006\u0002\b\f2\u0013\u0010)\u001a\u000f\u0012\u0004\u0012\u00020\b\u0018\u00010\n¢\u0006\u0002\b\f2\u0013\u0010\u0012\u001a\u000f\u0012\u0004\u0012\u00020\b\u0018\u00010\n¢\u0006\u0002\b\f2\u0006\u0010*\u001a\u00020\"2\u0006\u0010+\u001a\u00020\"2\u0006\u0010$\u001a\u00020\u00042\u0006\u0010%\u001a\u00020\u0001H\u0003ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b,\u0010-\u001a¦\u0001\u0010.\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\n2\u0011\u0010\u000b\u001a\r\u0012\u0004\u0012\u00020\b0\n¢\u0006\u0002\b\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\u0015\b\u0002\u0010\u0011\u001a\u000f\u0012\u0004\u0012\u00020\b\u0018\u00010\n¢\u0006\u0002\b\f2\u0015\b\u0002\u0010\u0012\u001a\u000f\u0012\u0004\u0012\u00020\b\u0018\u00010\n¢\u0006\u0002\b\f2\b\b\u0002\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u00162\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\b\b\u0002\u0010\u001b\u001a\u00020\u001cH\u0007¢\u0006\u0002\u0010\u001d\u001a®\u0001\u0010/\u001a\u00020\b2\u0006\u00100\u001a\u00020\u00102\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\n2\u0011\u0010\u000b\u001a\r\u0012\u0004\u0012\u00020\b0\n¢\u0006\u0002\b\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\u0015\b\u0002\u0010\u0011\u001a\u000f\u0012\u0004\u0012\u00020\b\u0018\u00010\n¢\u0006\u0002\b\f2\u0015\b\u0002\u0010\u0012\u001a\u000f\u0012\u0004\u0012\u00020\b\u0018\u00010\n¢\u0006\u0002\b\f2\b\b\u0002\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u0015\u001a\u0002012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u0001022\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u0001032\b\b\u0002\u0010\u001b\u001a\u00020\u001cH\u0007¢\u0006\u0002\u00104\u001a\u0001\u00105\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\n2\u0011\u0010\u000b\u001a\r\u0012\u0004\u0012\u00020\b0\n¢\u0006\u0002\b\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\u0015\b\u0002\u00106\u001a\u000f\u0012\u0004\u0012\u00020\b\u0018\u00010\n¢\u0006\u0002\b\f2\b\b\u0002\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u00162\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\b\b\u0002\u0010\u001b\u001a\u00020\u001cH\u0007¢\u0006\u0002\u00107\u001a®\u0001\u00108\u001a\u00020\b2\u0006\u00100\u001a\u00020\u00102\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\n2\u0011\u0010\u000b\u001a\r\u0012\u0004\u0012\u00020\b0\n¢\u0006\u0002\b\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\u0015\b\u0002\u0010\u0011\u001a\u000f\u0012\u0004\u0012\u00020\b\u0018\u00010\n¢\u0006\u0002\b\f2\u0015\b\u0002\u0010\u0012\u001a\u000f\u0012\u0004\u0012\u00020\b\u0018\u00010\n¢\u0006\u0002\b\f2\b\b\u0002\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u0015\u001a\u0002012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u0001022\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u0001032\b\b\u0002\u0010\u001b\u001a\u00020\u001cH\u0007¢\u0006\u0002\u00104\u001aÅ\u0001\u00109\u001a\u00020\b2\u0006\u00100\u001a\u00020\u00102\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\n2\u0011\u0010\u000b\u001a\r\u0012\u0004\u0012\u00020\b0\n¢\u0006\u0002\b\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\u0015\b\u0002\u0010\u0011\u001a\u000f\u0012\u0004\u0012\u00020\b\u0018\u00010\n¢\u0006\u0002\b\f2\u0015\b\u0002\u0010)\u001a\u000f\u0012\u0004\u0012\u00020\b\u0018\u00010\n¢\u0006\u0002\b\f2\u0015\b\u0002\u0010\u0012\u001a\u000f\u0012\u0004\u0012\u00020\b\u0018\u00010\n¢\u0006\u0002\b\f2\b\b\u0002\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u0015\u001a\u0002012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u0001022\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u0001032\b\b\u0002\u0010\u001b\u001a\u00020\u001cH\u0007¢\u0006\u0002\u0010:\u001aÑ\u0001\u0010;\u001a\u00020\b2\u0006\u00100\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u000e2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\n2\u0006\u0010\u000f\u001a\u00020\u00102\u0011\u0010\u000b\u001a\r\u0012\u0004\u0012\u00020\b0\n¢\u0006\u0002\b\f2\u0006\u0010\u001f\u001a\u00020 2\u0013\u0010\u0011\u001a\u000f\u0012\u0004\u0012\u00020\b\u0018\u00010\n¢\u0006\u0002\b\f2\u0013\u0010)\u001a\u000f\u0012\u0004\u0012\u00020\b\u0018\u00010\n¢\u0006\u0002\b\f2\u0013\u0010\u0012\u001a\u000f\u0012\u0004\u0012\u00020\b\u0018\u00010\n¢\u0006\u0002\b\f2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u0002012\b\u0010\u0017\u001a\u0004\u0018\u0001022\b\u0010\u0019\u001a\u0004\u0018\u00010#2\u0006\u0010$\u001a\u00020\u00042\u0006\u0010%\u001a\u00020\u00012\u0006\u0010\u001b\u001a\u00020\u001cH\u0003ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b<\u0010=\u001a\u0001\u0010>\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\n2\u0011\u0010\u000b\u001a\r\u0012\u0004\u0012\u00020\b0\n¢\u0006\u0002\b\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\u0015\b\u0002\u00106\u001a\u000f\u0012\u0004\u0012\u00020\b\u0018\u00010\n¢\u0006\u0002\b\f2\b\b\u0002\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u00162\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\b\b\u0002\u0010\u001b\u001a\u00020\u001cH\u0007¢\u0006\u0002\u00107\u001a&\u0010?\u001a\u00020\u00012\b\b\u0002\u0010@\u001a\u00020\u00102\b\b\u0002\u0010A\u001a\u00020\u00102\b\b\u0002\u0010B\u001a\u00020\u0010H\u0002\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0004¢\u0006\u0002\n\u0000\"\u0013\u0010\u0003\u001a\u00020\u0004X\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0005\"\u000e\u0010\u0006\u001a\u00020\u0001X\u0004¢\u0006\u0002\n\u0000\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006C"}, d2 = {"AssistChipPadding", "Landroidx/compose/foundation/layout/PaddingValues;", "FilterChipPadding", "HorizontalElementsPadding", "Landroidx/compose/ui/unit/Dp;", "F", "SuggestionChipPadding", "AssistChip", "", "onClick", "Lkotlin/Function0;", "label", "Landroidx/compose/runtime/Composable;", "modifier", "Landroidx/compose/ui/Modifier;", "enabled", "", "leadingIcon", "trailingIcon", "shape", "Landroidx/compose/ui/graphics/Shape;", "colors", "Landroidx/compose/material3/ChipColors;", "elevation", "Landroidx/compose/material3/ChipElevation;", "border", "Landroidx/compose/material3/ChipBorder;", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/ChipColors;Landroidx/compose/material3/ChipElevation;Landroidx/compose/material3/ChipBorder;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/Composer;III)V", "Chip", "labelTextStyle", "Landroidx/compose/ui/text/TextStyle;", "labelColor", "Landroidx/compose/ui/graphics/Color;", "Landroidx/compose/foundation/BorderStroke;", "minHeight", "paddingValues", "Chip-nkUnTEs", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;ZLkotlin/jvm/functions/Function2;Landroidx/compose/ui/text/TextStyle;JLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/ChipColors;Landroidx/compose/material3/ChipElevation;Landroidx/compose/foundation/BorderStroke;FLandroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/Composer;II)V", "ChipContent", "avatar", "leadingIconColor", "trailingIconColor", "ChipContent-fe0OD_I", "(Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/text/TextStyle;JLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;JJFLandroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/runtime/Composer;I)V", "ElevatedAssistChip", "ElevatedFilterChip", "selected", "Landroidx/compose/material3/SelectableChipColors;", "Landroidx/compose/material3/SelectableChipElevation;", "Landroidx/compose/material3/SelectableChipBorder;", "(ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/SelectableChipColors;Landroidx/compose/material3/SelectableChipElevation;Landroidx/compose/material3/SelectableChipBorder;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/Composer;III)V", "ElevatedSuggestionChip", "icon", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function2;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/ChipColors;Landroidx/compose/material3/ChipElevation;Landroidx/compose/material3/ChipBorder;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/Composer;II)V", "FilterChip", "InputChip", "(ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/SelectableChipColors;Landroidx/compose/material3/SelectableChipElevation;Landroidx/compose/material3/SelectableChipBorder;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/Composer;III)V", "SelectableChip", "SelectableChip-u0RnIRE", "(ZLandroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;ZLkotlin/jvm/functions/Function2;Landroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/SelectableChipColors;Landroidx/compose/material3/SelectableChipElevation;Landroidx/compose/foundation/BorderStroke;FLandroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/Composer;II)V", "SuggestionChip", "inputChipPadding", "hasAvatar", "hasLeadingIcon", "hasTrailingIcon", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: Chip.kt */
public final class ChipKt {
    private static final PaddingValues AssistChipPadding;
    private static final PaddingValues FilterChipPadding;
    /* access modifiers changed from: private */
    public static final float HorizontalElementsPadding;
    private static final PaddingValues SuggestionChipPadding;

    /* JADX WARNING: Removed duplicated region for block: B:106:0x013b  */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x0141  */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x0148  */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x0176  */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x018c  */
    /* JADX WARNING: Removed duplicated region for block: B:193:0x0395  */
    /* JADX WARNING: Removed duplicated region for block: B:195:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0073  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x008f  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0092  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00ab  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00b2  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00cd  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x00e1  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x00e9  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x00ff  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0107  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x011d  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x0125  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void AssistChip(kotlin.jvm.functions.Function0<kotlin.Unit> r46, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r47, androidx.compose.ui.Modifier r48, boolean r49, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r50, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r51, androidx.compose.ui.graphics.Shape r52, androidx.compose.material3.ChipColors r53, androidx.compose.material3.ChipElevation r54, androidx.compose.material3.ChipBorder r55, androidx.compose.foundation.interaction.MutableInteractionSource r56, androidx.compose.runtime.Composer r57, int r58, int r59, int r60) {
        /*
            r15 = r46
            r12 = r47
            r11 = r58
            r10 = r60
            java.lang.String r0 = "onClick"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r15, r0)
            java.lang.String r0 = "label"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r0)
            r0 = -1932300596(0xffffffff8cd36ecc, float:-3.257638E-31)
            r1 = r57
            androidx.compose.runtime.Composer r14 = r1.startRestartGroup(r0)
            java.lang.String r1 = "C(AssistChip)P(8,5,7,3,6,10,9,1,2)110@5623L5,111@5674L18,112@5745L21,113@5813L18,114@5883L39,120@6059L10,121@6137L19,115@5928L543:Chip.kt#uh7d8r"
            androidx.compose.runtime.ComposerKt.sourceInformation(r14, r1)
            r1 = r10 & 1
            if (r1 == 0) goto L_0x0029
            r1 = r11 | 6
            goto L_0x0039
        L_0x0029:
            r1 = r11 & 14
            if (r1 != 0) goto L_0x0038
            boolean r1 = r14.changedInstance(r15)
            if (r1 == 0) goto L_0x0035
            r1 = 4
            goto L_0x0036
        L_0x0035:
            r1 = 2
        L_0x0036:
            r1 = r1 | r11
            goto L_0x0039
        L_0x0038:
            r1 = r11
        L_0x0039:
            r4 = r10 & 2
            if (r4 == 0) goto L_0x0040
            r1 = r1 | 48
            goto L_0x0050
        L_0x0040:
            r4 = r11 & 112(0x70, float:1.57E-43)
            if (r4 != 0) goto L_0x0050
            boolean r4 = r14.changedInstance(r12)
            if (r4 == 0) goto L_0x004d
            r4 = 32
            goto L_0x004f
        L_0x004d:
            r4 = 16
        L_0x004f:
            r1 = r1 | r4
        L_0x0050:
            r4 = r10 & 4
            if (r4 == 0) goto L_0x0057
            r1 = r1 | 384(0x180, float:5.38E-43)
            goto L_0x006a
        L_0x0057:
            r5 = r11 & 896(0x380, float:1.256E-42)
            if (r5 != 0) goto L_0x006a
            r5 = r48
            boolean r6 = r14.changed((java.lang.Object) r5)
            if (r6 == 0) goto L_0x0066
            r6 = 256(0x100, float:3.59E-43)
            goto L_0x0068
        L_0x0066:
            r6 = 128(0x80, float:1.794E-43)
        L_0x0068:
            r1 = r1 | r6
            goto L_0x006c
        L_0x006a:
            r5 = r48
        L_0x006c:
            r6 = r10 & 8
            if (r6 == 0) goto L_0x0073
            r1 = r1 | 3072(0xc00, float:4.305E-42)
            goto L_0x0086
        L_0x0073:
            r7 = r11 & 7168(0x1c00, float:1.0045E-41)
            if (r7 != 0) goto L_0x0086
            r7 = r49
            boolean r8 = r14.changed((boolean) r7)
            if (r8 == 0) goto L_0x0082
            r8 = 2048(0x800, float:2.87E-42)
            goto L_0x0084
        L_0x0082:
            r8 = 1024(0x400, float:1.435E-42)
        L_0x0084:
            r1 = r1 | r8
            goto L_0x0088
        L_0x0086:
            r7 = r49
        L_0x0088:
            r8 = r10 & 16
            r36 = 57344(0xe000, float:8.0356E-41)
            if (r8 == 0) goto L_0x0092
            r1 = r1 | 24576(0x6000, float:3.4438E-41)
            goto L_0x00a5
        L_0x0092:
            r9 = r11 & r36
            if (r9 != 0) goto L_0x00a5
            r9 = r50
            boolean r13 = r14.changedInstance(r9)
            if (r13 == 0) goto L_0x00a1
            r13 = 16384(0x4000, float:2.2959E-41)
            goto L_0x00a3
        L_0x00a1:
            r13 = 8192(0x2000, float:1.14794E-41)
        L_0x00a3:
            r1 = r1 | r13
            goto L_0x00a7
        L_0x00a5:
            r9 = r50
        L_0x00a7:
            r13 = r10 & 32
            if (r13 == 0) goto L_0x00b2
            r16 = 196608(0x30000, float:2.75506E-40)
            r1 = r1 | r16
            r2 = r51
            goto L_0x00c7
        L_0x00b2:
            r16 = 458752(0x70000, float:6.42848E-40)
            r16 = r11 & r16
            r2 = r51
            if (r16 != 0) goto L_0x00c7
            boolean r16 = r14.changedInstance(r2)
            if (r16 == 0) goto L_0x00c3
            r16 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00c5
        L_0x00c3:
            r16 = 65536(0x10000, float:9.18355E-41)
        L_0x00c5:
            r1 = r1 | r16
        L_0x00c7:
            r37 = 3670016(0x380000, float:5.142788E-39)
            r16 = r11 & r37
            if (r16 != 0) goto L_0x00e1
            r16 = r10 & 64
            r0 = r52
            if (r16 != 0) goto L_0x00dc
            boolean r16 = r14.changed((java.lang.Object) r0)
            if (r16 == 0) goto L_0x00dc
            r16 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00de
        L_0x00dc:
            r16 = 524288(0x80000, float:7.34684E-40)
        L_0x00de:
            r1 = r1 | r16
            goto L_0x00e3
        L_0x00e1:
            r0 = r52
        L_0x00e3:
            r38 = 29360128(0x1c00000, float:7.052966E-38)
            r16 = r11 & r38
            if (r16 != 0) goto L_0x00ff
            r3 = r10 & 128(0x80, float:1.794E-43)
            if (r3 != 0) goto L_0x00f8
            r3 = r53
            boolean r17 = r14.changed((java.lang.Object) r3)
            if (r17 == 0) goto L_0x00fa
            r17 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00fc
        L_0x00f8:
            r3 = r53
        L_0x00fa:
            r17 = 4194304(0x400000, float:5.877472E-39)
        L_0x00fc:
            r1 = r1 | r17
            goto L_0x0101
        L_0x00ff:
            r3 = r53
        L_0x0101:
            r39 = 234881024(0xe000000, float:1.5777218E-30)
            r17 = r11 & r39
            if (r17 != 0) goto L_0x011d
            r0 = r10 & 256(0x100, float:3.59E-43)
            if (r0 != 0) goto L_0x0116
            r0 = r54
            boolean r17 = r14.changed((java.lang.Object) r0)
            if (r17 == 0) goto L_0x0118
            r17 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x011a
        L_0x0116:
            r0 = r54
        L_0x0118:
            r17 = 33554432(0x2000000, float:9.403955E-38)
        L_0x011a:
            r1 = r1 | r17
            goto L_0x011f
        L_0x011d:
            r0 = r54
        L_0x011f:
            r40 = 1879048192(0x70000000, float:1.58456325E29)
            r17 = r11 & r40
            if (r17 != 0) goto L_0x013b
            r0 = r10 & 512(0x200, float:7.175E-43)
            if (r0 != 0) goto L_0x0134
            r0 = r55
            boolean r17 = r14.changed((java.lang.Object) r0)
            if (r17 == 0) goto L_0x0136
            r17 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x0138
        L_0x0134:
            r0 = r55
        L_0x0136:
            r17 = 268435456(0x10000000, float:2.5243549E-29)
        L_0x0138:
            r1 = r1 | r17
            goto L_0x013d
        L_0x013b:
            r0 = r55
        L_0x013d:
            r9 = r10 & 1024(0x400, float:1.435E-42)
            if (r9 == 0) goto L_0x0148
            r17 = r59 | 6
            r41 = r9
        L_0x0145:
            r9 = r17
            goto L_0x0160
        L_0x0148:
            r17 = r59 & 14
            r41 = r9
            r9 = r56
            if (r17 != 0) goto L_0x015e
            boolean r17 = r14.changed((java.lang.Object) r9)
            if (r17 == 0) goto L_0x0159
            r17 = 4
            goto L_0x015b
        L_0x0159:
            r17 = 2
        L_0x015b:
            r17 = r59 | r17
            goto L_0x0145
        L_0x015e:
            r9 = r59
        L_0x0160:
            r17 = 1533916891(0x5b6db6db, float:6.6910621E16)
            r0 = r1 & r17
            r2 = 306783378(0x12492492, float:6.3469493E-28)
            if (r0 != r2) goto L_0x018c
            r0 = r9 & 11
            r2 = 2
            if (r0 != r2) goto L_0x018c
            boolean r0 = r14.getSkipping()
            if (r0 != 0) goto L_0x0176
            goto L_0x018c
        L_0x0176:
            r14.skipToGroupEnd()
            r6 = r51
            r9 = r54
            r10 = r55
            r11 = r56
            r8 = r3
            r3 = r5
            r4 = r7
            r23 = r14
            r5 = r50
            r7 = r52
            goto L_0x038e
        L_0x018c:
            r14.startDefaults()
            r0 = r11 & 1
            r42 = 0
            r2 = 6
            if (r0 == 0) goto L_0x01d3
            boolean r0 = r14.getDefaultsInvalid()
            if (r0 == 0) goto L_0x019d
            goto L_0x01d3
        L_0x019d:
            r14.skipToGroupEnd()
            r0 = r10 & 64
            if (r0 == 0) goto L_0x01a8
            r0 = -3670017(0xffffffffffc7ffff, float:NaN)
            r1 = r1 & r0
        L_0x01a8:
            r0 = r10 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x01b0
            r0 = -29360129(0xfffffffffe3fffff, float:-6.380294E37)
            r1 = r1 & r0
        L_0x01b0:
            r0 = r10 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L_0x01b8
            r0 = -234881025(0xfffffffff1ffffff, float:-2.535301E30)
            r1 = r1 & r0
        L_0x01b8:
            r0 = r10 & 512(0x200, float:7.175E-43)
            if (r0 == 0) goto L_0x01c0
            r0 = -1879048193(0xffffffff8fffffff, float:-2.5243547E-29)
            r1 = r1 & r0
        L_0x01c0:
            r44 = r50
            r20 = r51
            r45 = r52
            r21 = r54
            r22 = r56
            r8 = r3
            r19 = r5
            r0 = r9
            r9 = r7
            r7 = r55
            goto L_0x02ba
        L_0x01d3:
            if (r4 == 0) goto L_0x01da
            androidx.compose.ui.Modifier$Companion r0 = androidx.compose.ui.Modifier.Companion
            androidx.compose.ui.Modifier r0 = (androidx.compose.ui.Modifier) r0
            goto L_0x01db
        L_0x01da:
            r0 = r5
        L_0x01db:
            if (r6 == 0) goto L_0x01e1
            r4 = 1
            r43 = r4
            goto L_0x01e3
        L_0x01e1:
            r43 = r7
        L_0x01e3:
            if (r8 == 0) goto L_0x01e8
            r44 = r42
            goto L_0x01ea
        L_0x01e8:
            r44 = r50
        L_0x01ea:
            if (r13 == 0) goto L_0x01ef
            r13 = r42
            goto L_0x01f1
        L_0x01ef:
            r13 = r51
        L_0x01f1:
            r4 = r10 & 64
            if (r4 == 0) goto L_0x0202
            androidx.compose.material3.AssistChipDefaults r4 = androidx.compose.material3.AssistChipDefaults.INSTANCE
            androidx.compose.ui.graphics.Shape r4 = r4.getShape(r14, r2)
            r5 = -3670017(0xffffffffffc7ffff, float:NaN)
            r1 = r1 & r5
            r45 = r4
            goto L_0x0204
        L_0x0202:
            r45 = r52
        L_0x0204:
            r4 = r10 & 128(0x80, float:1.794E-43)
            if (r4 == 0) goto L_0x0228
            androidx.compose.material3.AssistChipDefaults r16 = androidx.compose.material3.AssistChipDefaults.INSTANCE
            r17 = 0
            r19 = 0
            r21 = 0
            r23 = 0
            r25 = 0
            r27 = 0
            r29 = 0
            r31 = 0
            r34 = 100663296(0x6000000, float:2.4074124E-35)
            r35 = 255(0xff, float:3.57E-43)
            r33 = r14
            androidx.compose.material3.ChipColors r3 = r16.m1131assistChipColorsoq7We08(r17, r19, r21, r23, r25, r27, r29, r31, r33, r34, r35)
            r4 = -29360129(0xfffffffffe3fffff, float:-6.380294E37)
            r1 = r1 & r4
        L_0x0228:
            r26 = r3
            r3 = r10 & 256(0x100, float:3.59E-43)
            if (r3 == 0) goto L_0x024f
            androidx.compose.material3.AssistChipDefaults r16 = androidx.compose.material3.AssistChipDefaults.INSTANCE
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r24 = 1572864(0x180000, float:2.204052E-39)
            r25 = 63
            r23 = r14
            androidx.compose.material3.ChipElevation r3 = r16.m1132assistChipElevationaqJV_2Y(r17, r18, r19, r20, r21, r22, r23, r24, r25)
            r4 = -234881025(0xfffffffff1ffffff, float:-2.535301E30)
            r1 = r1 & r4
            r17 = r1
            r16 = r3
            goto L_0x0253
        L_0x024f:
            r16 = r54
            r17 = r1
        L_0x0253:
            r1 = r10 & 512(0x200, float:7.175E-43)
            if (r1 == 0) goto L_0x0279
            androidx.compose.material3.AssistChipDefaults r1 = androidx.compose.material3.AssistChipDefaults.INSTANCE
            r3 = 0
            r5 = 0
            r7 = 0
            r8 = 3072(0xc00, float:4.305E-42)
            r18 = 7
            r2 = r3
            r4 = r5
            r6 = r7
            r7 = r14
            r48 = r0
            r0 = r9
            r19 = r41
            r9 = r18
            androidx.compose.material3.ChipBorder r1 = r1.m1130assistChipBorderd_3_b6Q(r2, r4, r6, r7, r8, r9)
            r2 = -1879048193(0xffffffff8fffffff, float:-2.5243547E-29)
            r2 = r17 & r2
            r17 = r2
            goto L_0x0280
        L_0x0279:
            r48 = r0
            r0 = r9
            r19 = r41
            r1 = r55
        L_0x0280:
            if (r19 == 0) goto L_0x02ab
            r2 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r14.startReplaceableGroup(r2)
            java.lang.String r2 = "CC(remember):Composables.kt#9igjgp"
            androidx.compose.runtime.ComposerKt.sourceInformation(r14, r2)
            java.lang.Object r2 = r14.rememberedValue()
            androidx.compose.runtime.Composer$Companion r3 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r3 = r3.getEmpty()
            if (r2 != r3) goto L_0x02a0
            androidx.compose.foundation.interaction.MutableInteractionSource r2 = androidx.compose.foundation.interaction.InteractionSourceKt.MutableInteractionSource()
            r14.updateRememberedValue(r2)
        L_0x02a0:
            r14.endReplaceableGroup()
            androidx.compose.foundation.interaction.MutableInteractionSource r2 = (androidx.compose.foundation.interaction.MutableInteractionSource) r2
            r19 = r48
            r7 = r1
            r22 = r2
            goto L_0x02b0
        L_0x02ab:
            r19 = r48
            r22 = r56
            r7 = r1
        L_0x02b0:
            r20 = r13
            r21 = r16
            r1 = r17
            r8 = r26
            r9 = r43
        L_0x02ba:
            r14.endDefaults()
            boolean r2 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r2 == 0) goto L_0x02cc
            java.lang.String r2 = "androidx.compose.material3.AssistChip (Chip.kt:103)"
            r3 = -1932300596(0xffffffff8cd36ecc, float:-3.257638E-31)
            androidx.compose.runtime.ComposerKt.traceEventStart(r3, r1, r0, r2)
        L_0x02cc:
            androidx.compose.material3.MaterialTheme r2 = androidx.compose.material3.MaterialTheme.INSTANCE
            r3 = 6
            androidx.compose.material3.Typography r2 = r2.getTypography(r14, r3)
            androidx.compose.material3.tokens.AssistChipTokens r3 = androidx.compose.material3.tokens.AssistChipTokens.INSTANCE
            androidx.compose.material3.tokens.TypographyKeyTokens r3 = r3.getLabelTextFont()
            androidx.compose.ui.text.TextStyle r4 = androidx.compose.material3.TypographyKt.fromToken(r2, r3)
            int r2 = r1 >> 9
            r2 = r2 & 14
            int r3 = r1 >> 18
            r3 = r3 & 112(0x70, float:1.57E-43)
            r3 = r3 | r2
            androidx.compose.runtime.State r3 = r8.labelColor$material3_release(r9, r14, r3)
            java.lang.Object r3 = r3.getValue()
            androidx.compose.ui.graphics.Color r3 = (androidx.compose.ui.graphics.Color) r3
            long r5 = r3.m2831unboximpl()
            r3 = 839902004(0x320fe334, float:8.3753555E-9)
            r14.startReplaceableGroup(r3)
            java.lang.String r3 = "127@6316L21"
            androidx.compose.runtime.ComposerKt.sourceInformation(r14, r3)
            if (r7 != 0) goto L_0x0304
            r2 = r42
            goto L_0x030d
        L_0x0304:
            int r3 = r1 >> 24
            r3 = r3 & 112(0x70, float:1.57E-43)
            r2 = r2 | r3
            androidx.compose.runtime.State r2 = r7.borderStroke$material3_release(r9, r14, r2)
        L_0x030d:
            r14.endReplaceableGroup()
            if (r2 == 0) goto L_0x031a
            java.lang.Object r2 = r2.getValue()
            androidx.compose.foundation.BorderStroke r2 = (androidx.compose.foundation.BorderStroke) r2
            r42 = r2
        L_0x031a:
            androidx.compose.material3.AssistChipDefaults r2 = androidx.compose.material3.AssistChipDefaults.INSTANCE
            float r13 = r2.m1135getHeightD9Ej5fM()
            androidx.compose.foundation.layout.PaddingValues r2 = AssistChipPadding
            r23 = r14
            r14 = r2
            int r2 = r1 >> 6
            r2 = r2 & 14
            int r3 = r1 << 3
            r3 = r3 & 112(0x70, float:1.57E-43)
            r2 = r2 | r3
            int r3 = r1 >> 3
            r3 = r3 & 896(0x380, float:1.256E-42)
            r2 = r2 | r3
            int r3 = r1 << 6
            r48 = r7
            r7 = r3 & 7168(0x1c00, float:1.0045E-41)
            r2 = r2 | r7
            r7 = r3 & r37
            r2 = r2 | r7
            r7 = r3 & r38
            r2 = r2 | r7
            r7 = r3 & r39
            r2 = r2 | r7
            r3 = r3 & r40
            r17 = r2 | r3
            int r1 = r1 >> 24
            r1 = r1 & 14
            r1 = r1 | 3456(0xd80, float:4.843E-42)
            int r0 = r0 << 12
            r0 = r0 & r36
            r18 = r1 | r0
            r0 = r19
            r1 = r46
            r2 = r9
            r3 = r47
            r24 = r48
            r7 = r44
            r26 = r8
            r8 = r20
            r43 = r9
            r9 = r45
            r10 = r26
            r11 = r21
            r12 = r42
            r15 = r22
            r16 = r23
            m1173ChipnkUnTEs(r0, r1, r2, r3, r4, r5, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto L_0x037c
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L_0x037c:
            r3 = r19
            r6 = r20
            r9 = r21
            r11 = r22
            r10 = r24
            r8 = r26
            r4 = r43
            r5 = r44
            r7 = r45
        L_0x038e:
            androidx.compose.runtime.ScopeUpdateScope r15 = r23.endRestartGroup()
            if (r15 != 0) goto L_0x0395
            goto L_0x03ad
        L_0x0395:
            androidx.compose.material3.ChipKt$AssistChip$2 r16 = new androidx.compose.material3.ChipKt$AssistChip$2
            r0 = r16
            r1 = r46
            r2 = r47
            r12 = r58
            r13 = r59
            r14 = r60
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            r0 = r16
            kotlin.jvm.functions.Function2 r0 = (kotlin.jvm.functions.Function2) r0
            r15.updateScope(r0)
        L_0x03ad:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.ChipKt.AssistChip(kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function2, androidx.compose.ui.Modifier, boolean, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, androidx.compose.ui.graphics.Shape, androidx.compose.material3.ChipColors, androidx.compose.material3.ChipElevation, androidx.compose.material3.ChipBorder, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:108:0x0147  */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x014e  */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x017c  */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x0192  */
    /* JADX WARNING: Removed duplicated region for block: B:190:0x037f  */
    /* JADX WARNING: Removed duplicated region for block: B:192:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0073  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x008f  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0092  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00ab  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00b2  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00cd  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x00e1  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x00e9  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x00ff  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0107  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x011d  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x0125  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x012e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void ElevatedAssistChip(kotlin.jvm.functions.Function0<kotlin.Unit> r49, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r50, androidx.compose.ui.Modifier r51, boolean r52, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r53, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r54, androidx.compose.ui.graphics.Shape r55, androidx.compose.material3.ChipColors r56, androidx.compose.material3.ChipElevation r57, androidx.compose.material3.ChipBorder r58, androidx.compose.foundation.interaction.MutableInteractionSource r59, androidx.compose.runtime.Composer r60, int r61, int r62, int r63) {
        /*
            r15 = r49
            r14 = r50
            r13 = r61
            r12 = r63
            java.lang.String r0 = "onClick"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r15, r0)
            java.lang.String r0 = "label"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r14, r0)
            r0 = 1295844802(0x4d3d05c2, float:1.98204448E8)
            r1 = r60
            androidx.compose.runtime.Composer r11 = r1.startRestartGroup(r0)
            java.lang.String r1 = "C(ElevatedAssistChip)P(8,5,7,3,6,10,9,1,2)181@9326L5,182@9377L26,183@9456L29,185@9569L39,191@9744L10,192@9822L19,186@9613L543:Chip.kt#uh7d8r"
            androidx.compose.runtime.ComposerKt.sourceInformation(r11, r1)
            r1 = r12 & 1
            if (r1 == 0) goto L_0x0029
            r1 = r13 | 6
            goto L_0x0039
        L_0x0029:
            r1 = r13 & 14
            if (r1 != 0) goto L_0x0038
            boolean r1 = r11.changedInstance(r15)
            if (r1 == 0) goto L_0x0035
            r1 = 4
            goto L_0x0036
        L_0x0035:
            r1 = 2
        L_0x0036:
            r1 = r1 | r13
            goto L_0x0039
        L_0x0038:
            r1 = r13
        L_0x0039:
            r4 = r12 & 2
            if (r4 == 0) goto L_0x0040
            r1 = r1 | 48
            goto L_0x0050
        L_0x0040:
            r4 = r13 & 112(0x70, float:1.57E-43)
            if (r4 != 0) goto L_0x0050
            boolean r4 = r11.changedInstance(r14)
            if (r4 == 0) goto L_0x004d
            r4 = 32
            goto L_0x004f
        L_0x004d:
            r4 = 16
        L_0x004f:
            r1 = r1 | r4
        L_0x0050:
            r4 = r12 & 4
            if (r4 == 0) goto L_0x0057
            r1 = r1 | 384(0x180, float:5.38E-43)
            goto L_0x006a
        L_0x0057:
            r5 = r13 & 896(0x380, float:1.256E-42)
            if (r5 != 0) goto L_0x006a
            r5 = r51
            boolean r6 = r11.changed((java.lang.Object) r5)
            if (r6 == 0) goto L_0x0066
            r6 = 256(0x100, float:3.59E-43)
            goto L_0x0068
        L_0x0066:
            r6 = 128(0x80, float:1.794E-43)
        L_0x0068:
            r1 = r1 | r6
            goto L_0x006c
        L_0x006a:
            r5 = r51
        L_0x006c:
            r6 = r12 & 8
            if (r6 == 0) goto L_0x0073
            r1 = r1 | 3072(0xc00, float:4.305E-42)
            goto L_0x0086
        L_0x0073:
            r7 = r13 & 7168(0x1c00, float:1.0045E-41)
            if (r7 != 0) goto L_0x0086
            r7 = r52
            boolean r8 = r11.changed((boolean) r7)
            if (r8 == 0) goto L_0x0082
            r8 = 2048(0x800, float:2.87E-42)
            goto L_0x0084
        L_0x0082:
            r8 = 1024(0x400, float:1.435E-42)
        L_0x0084:
            r1 = r1 | r8
            goto L_0x0088
        L_0x0086:
            r7 = r52
        L_0x0088:
            r8 = r12 & 16
            r36 = 57344(0xe000, float:8.0356E-41)
            if (r8 == 0) goto L_0x0092
            r1 = r1 | 24576(0x6000, float:3.4438E-41)
            goto L_0x00a5
        L_0x0092:
            r9 = r13 & r36
            if (r9 != 0) goto L_0x00a5
            r9 = r53
            boolean r10 = r11.changedInstance(r9)
            if (r10 == 0) goto L_0x00a1
            r10 = 16384(0x4000, float:2.2959E-41)
            goto L_0x00a3
        L_0x00a1:
            r10 = 8192(0x2000, float:1.14794E-41)
        L_0x00a3:
            r1 = r1 | r10
            goto L_0x00a7
        L_0x00a5:
            r9 = r53
        L_0x00a7:
            r10 = r12 & 32
            if (r10 == 0) goto L_0x00b2
            r16 = 196608(0x30000, float:2.75506E-40)
            r1 = r1 | r16
            r2 = r54
            goto L_0x00c7
        L_0x00b2:
            r16 = 458752(0x70000, float:6.42848E-40)
            r16 = r13 & r16
            r2 = r54
            if (r16 != 0) goto L_0x00c7
            boolean r16 = r11.changedInstance(r2)
            if (r16 == 0) goto L_0x00c3
            r16 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00c5
        L_0x00c3:
            r16 = 65536(0x10000, float:9.18355E-41)
        L_0x00c5:
            r1 = r1 | r16
        L_0x00c7:
            r37 = 3670016(0x380000, float:5.142788E-39)
            r16 = r13 & r37
            if (r16 != 0) goto L_0x00e1
            r16 = r12 & 64
            r0 = r55
            if (r16 != 0) goto L_0x00dc
            boolean r16 = r11.changed((java.lang.Object) r0)
            if (r16 == 0) goto L_0x00dc
            r16 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00de
        L_0x00dc:
            r16 = 524288(0x80000, float:7.34684E-40)
        L_0x00de:
            r1 = r1 | r16
            goto L_0x00e3
        L_0x00e1:
            r0 = r55
        L_0x00e3:
            r38 = 29360128(0x1c00000, float:7.052966E-38)
            r16 = r13 & r38
            if (r16 != 0) goto L_0x00ff
            r3 = r12 & 128(0x80, float:1.794E-43)
            if (r3 != 0) goto L_0x00f8
            r3 = r56
            boolean r17 = r11.changed((java.lang.Object) r3)
            if (r17 == 0) goto L_0x00fa
            r17 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00fc
        L_0x00f8:
            r3 = r56
        L_0x00fa:
            r17 = 4194304(0x400000, float:5.877472E-39)
        L_0x00fc:
            r1 = r1 | r17
            goto L_0x0101
        L_0x00ff:
            r3 = r56
        L_0x0101:
            r39 = 234881024(0xe000000, float:1.5777218E-30)
            r17 = r13 & r39
            if (r17 != 0) goto L_0x011d
            r0 = r12 & 256(0x100, float:3.59E-43)
            if (r0 != 0) goto L_0x0116
            r0 = r57
            boolean r17 = r11.changed((java.lang.Object) r0)
            if (r17 == 0) goto L_0x0118
            r17 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x011a
        L_0x0116:
            r0 = r57
        L_0x0118:
            r17 = 33554432(0x2000000, float:9.403955E-38)
        L_0x011a:
            r1 = r1 | r17
            goto L_0x011f
        L_0x011d:
            r0 = r57
        L_0x011f:
            r9 = r12 & 512(0x200, float:7.175E-43)
            r40 = 1879048192(0x70000000, float:1.58456325E29)
            if (r9 == 0) goto L_0x012e
            r17 = 805306368(0x30000000, float:4.656613E-10)
            r1 = r1 | r17
            r41 = r9
            r9 = r58
            goto L_0x0143
        L_0x012e:
            r17 = r13 & r40
            r41 = r9
            r9 = r58
            if (r17 != 0) goto L_0x0143
            boolean r17 = r11.changed((java.lang.Object) r9)
            if (r17 == 0) goto L_0x013f
            r17 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x0141
        L_0x013f:
            r17 = 268435456(0x10000000, float:2.5243549E-29)
        L_0x0141:
            r1 = r1 | r17
        L_0x0143:
            r9 = r12 & 1024(0x400, float:1.435E-42)
            if (r9 == 0) goto L_0x014e
            r17 = r62 | 6
            r42 = r9
        L_0x014b:
            r9 = r17
            goto L_0x0166
        L_0x014e:
            r17 = r62 & 14
            r42 = r9
            r9 = r59
            if (r17 != 0) goto L_0x0164
            boolean r17 = r11.changed((java.lang.Object) r9)
            if (r17 == 0) goto L_0x015f
            r17 = 4
            goto L_0x0161
        L_0x015f:
            r17 = 2
        L_0x0161:
            r17 = r62 | r17
            goto L_0x014b
        L_0x0164:
            r9 = r62
        L_0x0166:
            r17 = 1533916891(0x5b6db6db, float:6.6910621E16)
            r0 = r1 & r17
            r2 = 306783378(0x12492492, float:6.3469493E-28)
            if (r0 != r2) goto L_0x0192
            r0 = r9 & 11
            r2 = 2
            if (r0 != r2) goto L_0x0192
            boolean r0 = r11.getSkipping()
            if (r0 != 0) goto L_0x017c
            goto L_0x0192
        L_0x017c:
            r11.skipToGroupEnd()
            r6 = r54
            r9 = r57
            r10 = r58
            r8 = r3
            r3 = r5
            r4 = r7
            r25 = r11
            r5 = r53
            r7 = r55
            r11 = r59
            goto L_0x0378
        L_0x0192:
            r11.startDefaults()
            r0 = r13 & 1
            r2 = -3670017(0xffffffffffc7ffff, float:NaN)
            r43 = 0
            r60 = r9
            r9 = 6
            if (r0 == 0) goto L_0x01d4
            boolean r0 = r11.getDefaultsInvalid()
            if (r0 == 0) goto L_0x01a8
            goto L_0x01d4
        L_0x01a8:
            r11.skipToGroupEnd()
            r0 = r12 & 64
            if (r0 == 0) goto L_0x01b0
            r1 = r1 & r2
        L_0x01b0:
            r0 = r12 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x01b8
            r0 = -29360129(0xfffffffffe3fffff, float:-6.380294E37)
            r1 = r1 & r0
        L_0x01b8:
            r0 = r12 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L_0x01c0
            r0 = -234881025(0xfffffffff1ffffff, float:-2.535301E30)
            r1 = r1 & r0
        L_0x01c0:
            r45 = r53
            r46 = r54
            r47 = r55
            r20 = r57
            r8 = r58
            r21 = r59
            r48 = r60
            r9 = r3
            r19 = r5
            r10 = r7
            goto L_0x029e
        L_0x01d4:
            if (r4 == 0) goto L_0x01db
            androidx.compose.ui.Modifier$Companion r0 = androidx.compose.ui.Modifier.Companion
            androidx.compose.ui.Modifier r0 = (androidx.compose.ui.Modifier) r0
            goto L_0x01dc
        L_0x01db:
            r0 = r5
        L_0x01dc:
            if (r6 == 0) goto L_0x01e2
            r4 = 1
            r44 = r4
            goto L_0x01e4
        L_0x01e2:
            r44 = r7
        L_0x01e4:
            if (r8 == 0) goto L_0x01e9
            r45 = r43
            goto L_0x01eb
        L_0x01e9:
            r45 = r53
        L_0x01eb:
            if (r10 == 0) goto L_0x01f0
            r46 = r43
            goto L_0x01f2
        L_0x01f0:
            r46 = r54
        L_0x01f2:
            r4 = r12 & 64
            if (r4 == 0) goto L_0x0200
            androidx.compose.material3.AssistChipDefaults r4 = androidx.compose.material3.AssistChipDefaults.INSTANCE
            androidx.compose.ui.graphics.Shape r4 = r4.getShape(r11, r9)
            r1 = r1 & r2
            r47 = r4
            goto L_0x0202
        L_0x0200:
            r47 = r55
        L_0x0202:
            r2 = r12 & 128(0x80, float:1.794E-43)
            if (r2 == 0) goto L_0x022b
            androidx.compose.material3.AssistChipDefaults r16 = androidx.compose.material3.AssistChipDefaults.INSTANCE
            r17 = 0
            r19 = 0
            r21 = 0
            r23 = 0
            r25 = 0
            r27 = 0
            r29 = 0
            r31 = 0
            r34 = 100663296(0x6000000, float:2.4074124E-35)
            r35 = 255(0xff, float:3.57E-43)
            r33 = r11
            androidx.compose.material3.ChipColors r2 = r16.m1133elevatedAssistChipColorsoq7We08(r17, r19, r21, r23, r25, r27, r29, r31, r33, r34, r35)
            r3 = -29360129(0xfffffffffe3fffff, float:-6.380294E37)
            r1 = r1 & r3
            r17 = r1
            r16 = r2
            goto L_0x022f
        L_0x022b:
            r17 = r1
            r16 = r3
        L_0x022f:
            r1 = r12 & 256(0x100, float:3.59E-43)
            if (r1 == 0) goto L_0x0255
            androidx.compose.material3.AssistChipDefaults r1 = androidx.compose.material3.AssistChipDefaults.INSTANCE
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r10 = 1572864(0x180000, float:2.204052E-39)
            r18 = 63
            r8 = r11
            r48 = r60
            r19 = r41
            r20 = r42
            r9 = r10
            r10 = r18
            androidx.compose.material3.ChipElevation r1 = r1.m1134elevatedAssistChipElevationaqJV_2Y(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r2 = -234881025(0xfffffffff1ffffff, float:-2.535301E30)
            r2 = r17 & r2
            r17 = r2
            goto L_0x025d
        L_0x0255:
            r48 = r60
            r19 = r41
            r20 = r42
            r1 = r57
        L_0x025d:
            if (r19 == 0) goto L_0x0262
            r2 = r43
            goto L_0x0264
        L_0x0262:
            r2 = r58
        L_0x0264:
            if (r20 == 0) goto L_0x0291
            r3 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r11.startReplaceableGroup(r3)
            java.lang.String r3 = "CC(remember):Composables.kt#9igjgp"
            androidx.compose.runtime.ComposerKt.sourceInformation(r11, r3)
            java.lang.Object r3 = r11.rememberedValue()
            androidx.compose.runtime.Composer$Companion r4 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r4 = r4.getEmpty()
            if (r3 != r4) goto L_0x0284
            androidx.compose.foundation.interaction.MutableInteractionSource r3 = androidx.compose.foundation.interaction.InteractionSourceKt.MutableInteractionSource()
            r11.updateRememberedValue(r3)
        L_0x0284:
            r11.endReplaceableGroup()
            androidx.compose.foundation.interaction.MutableInteractionSource r3 = (androidx.compose.foundation.interaction.MutableInteractionSource) r3
            r19 = r0
            r20 = r1
            r8 = r2
            r21 = r3
            goto L_0x0298
        L_0x0291:
            r21 = r59
            r19 = r0
            r20 = r1
            r8 = r2
        L_0x0298:
            r9 = r16
            r1 = r17
            r10 = r44
        L_0x029e:
            r11.endDefaults()
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto L_0x02b3
            java.lang.String r0 = "androidx.compose.material3.ElevatedAssistChip (Chip.kt:174)"
            r2 = r48
            r3 = 1295844802(0x4d3d05c2, float:1.98204448E8)
            androidx.compose.runtime.ComposerKt.traceEventStart(r3, r1, r2, r0)
            goto L_0x02b5
        L_0x02b3:
            r2 = r48
        L_0x02b5:
            androidx.compose.material3.MaterialTheme r0 = androidx.compose.material3.MaterialTheme.INSTANCE
            r3 = 6
            androidx.compose.material3.Typography r0 = r0.getTypography(r11, r3)
            androidx.compose.material3.tokens.AssistChipTokens r3 = androidx.compose.material3.tokens.AssistChipTokens.INSTANCE
            androidx.compose.material3.tokens.TypographyKeyTokens r3 = r3.getLabelTextFont()
            androidx.compose.ui.text.TextStyle r4 = androidx.compose.material3.TypographyKt.fromToken(r0, r3)
            int r0 = r1 >> 9
            r0 = r0 & 14
            int r3 = r1 >> 18
            r3 = r3 & 112(0x70, float:1.57E-43)
            r3 = r3 | r0
            androidx.compose.runtime.State r3 = r9.labelColor$material3_release(r10, r11, r3)
            java.lang.Object r3 = r3.getValue()
            androidx.compose.ui.graphics.Color r3 = (androidx.compose.ui.graphics.Color) r3
            long r5 = r3.m2831unboximpl()
            androidx.compose.material3.AssistChipDefaults r3 = androidx.compose.material3.AssistChipDefaults.INSTANCE
            float r16 = r3.m1135getHeightD9Ej5fM()
            androidx.compose.foundation.layout.PaddingValues r22 = AssistChipPadding
            r3 = -227039519(0xfffffffff277a6e1, float:-4.9052507E30)
            r11.startReplaceableGroup(r3)
            java.lang.String r3 = "200@10083L21"
            androidx.compose.runtime.ComposerKt.sourceInformation(r11, r3)
            if (r8 != 0) goto L_0x02f5
            r0 = r43
            goto L_0x02fe
        L_0x02f5:
            int r3 = r1 >> 24
            r3 = r3 & 112(0x70, float:1.57E-43)
            r0 = r0 | r3
            androidx.compose.runtime.State r0 = r8.borderStroke$material3_release(r10, r11, r0)
        L_0x02fe:
            r11.endReplaceableGroup()
            if (r0 == 0) goto L_0x030b
            java.lang.Object r0 = r0.getValue()
            androidx.compose.foundation.BorderStroke r0 = (androidx.compose.foundation.BorderStroke) r0
            r43 = r0
        L_0x030b:
            int r0 = r1 >> 6
            r0 = r0 & 14
            int r3 = r1 << 3
            r3 = r3 & 112(0x70, float:1.57E-43)
            r0 = r0 | r3
            int r3 = r1 >> 3
            r3 = r3 & 896(0x380, float:1.256E-42)
            r0 = r0 | r3
            int r3 = r1 << 6
            r7 = r3 & 7168(0x1c00, float:1.0045E-41)
            r0 = r0 | r7
            r7 = r3 & r37
            r0 = r0 | r7
            r7 = r3 & r38
            r0 = r0 | r7
            r7 = r3 & r39
            r0 = r0 | r7
            r3 = r3 & r40
            r17 = r0 | r3
            int r0 = r1 >> 24
            r0 = r0 & 14
            r0 = r0 | 3456(0xd80, float:4.843E-42)
            int r1 = r2 << 12
            r1 = r1 & r36
            r18 = r0 | r1
            r0 = r19
            r1 = r49
            r2 = r10
            r3 = r50
            r7 = r45
            r23 = r8
            r8 = r46
            r24 = r9
            r9 = r47
            r44 = r10
            r10 = r24
            r25 = r11
            r11 = r20
            r12 = r43
            r13 = r16
            r14 = r22
            r15 = r21
            r16 = r25
            m1173ChipnkUnTEs(r0, r1, r2, r3, r4, r5, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto L_0x0366
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L_0x0366:
            r3 = r19
            r9 = r20
            r11 = r21
            r10 = r23
            r8 = r24
            r4 = r44
            r5 = r45
            r6 = r46
            r7 = r47
        L_0x0378:
            androidx.compose.runtime.ScopeUpdateScope r15 = r25.endRestartGroup()
            if (r15 != 0) goto L_0x037f
            goto L_0x0397
        L_0x037f:
            androidx.compose.material3.ChipKt$ElevatedAssistChip$2 r16 = new androidx.compose.material3.ChipKt$ElevatedAssistChip$2
            r0 = r16
            r1 = r49
            r2 = r50
            r12 = r61
            r13 = r62
            r14 = r63
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            r0 = r16
            kotlin.jvm.functions.Function2 r0 = (kotlin.jvm.functions.Function2) r0
            r15.updateScope(r0)
        L_0x0397:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.ChipKt.ElevatedAssistChip(kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function2, androidx.compose.ui.Modifier, boolean, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, androidx.compose.ui.graphics.Shape, androidx.compose.material3.ChipColors, androidx.compose.material3.ChipElevation, androidx.compose.material3.ChipBorder, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:105:0x013d  */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x0143  */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x0159  */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x0161  */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x016a  */
    /* JADX WARNING: Removed duplicated region for block: B:134:0x0198  */
    /* JADX WARNING: Removed duplicated region for block: B:135:0x01ac  */
    /* JADX WARNING: Removed duplicated region for block: B:203:0x03c3  */
    /* JADX WARNING: Removed duplicated region for block: B:205:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x008f  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00ab  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00b2  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00cb  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00d2  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x00eb  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x0101  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x0109  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x011f  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x0127  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void FilterChip(boolean r55, kotlin.jvm.functions.Function0<kotlin.Unit> r56, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r57, androidx.compose.ui.Modifier r58, boolean r59, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r60, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r61, androidx.compose.ui.graphics.Shape r62, androidx.compose.material3.SelectableChipColors r63, androidx.compose.material3.SelectableChipElevation r64, androidx.compose.material3.SelectableChipBorder r65, androidx.compose.foundation.interaction.MutableInteractionSource r66, androidx.compose.runtime.Composer r67, int r68, int r69, int r70) {
        /*
            r15 = r55
            r14 = r56
            r13 = r57
            r12 = r68
            r11 = r70
            java.lang.String r0 = "onClick"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r14, r0)
            java.lang.String r0 = "label"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r0)
            r0 = -1878072905(0xffffffff900ee1b7, float:-2.8178447E-29)
            r1 = r67
            androidx.compose.runtime.Composer r10 = r1.startRestartGroup(r0)
            java.lang.String r1 = "C(FilterChip)P(9,8,5,7,3,6,11,10,1,2)263@13479L5,264@13540L18,265@13621L21,266@13699L18,267@13769L39,274@13979L10,268@13813L556:Chip.kt#uh7d8r"
            androidx.compose.runtime.ComposerKt.sourceInformation(r10, r1)
            r1 = r11 & 1
            if (r1 == 0) goto L_0x002b
            r1 = r12 | 6
            goto L_0x003b
        L_0x002b:
            r1 = r12 & 14
            if (r1 != 0) goto L_0x003a
            boolean r1 = r10.changed((boolean) r15)
            if (r1 == 0) goto L_0x0037
            r1 = 4
            goto L_0x0038
        L_0x0037:
            r1 = 2
        L_0x0038:
            r1 = r1 | r12
            goto L_0x003b
        L_0x003a:
            r1 = r12
        L_0x003b:
            r4 = r11 & 2
            if (r4 == 0) goto L_0x0042
            r1 = r1 | 48
            goto L_0x0052
        L_0x0042:
            r4 = r12 & 112(0x70, float:1.57E-43)
            if (r4 != 0) goto L_0x0052
            boolean r4 = r10.changedInstance(r14)
            if (r4 == 0) goto L_0x004f
            r4 = 32
            goto L_0x0051
        L_0x004f:
            r4 = 16
        L_0x0051:
            r1 = r1 | r4
        L_0x0052:
            r4 = r11 & 4
            if (r4 == 0) goto L_0x0059
            r1 = r1 | 384(0x180, float:5.38E-43)
            goto L_0x0069
        L_0x0059:
            r4 = r12 & 896(0x380, float:1.256E-42)
            if (r4 != 0) goto L_0x0069
            boolean r4 = r10.changedInstance(r13)
            if (r4 == 0) goto L_0x0066
            r4 = 256(0x100, float:3.59E-43)
            goto L_0x0068
        L_0x0066:
            r4 = 128(0x80, float:1.794E-43)
        L_0x0068:
            r1 = r1 | r4
        L_0x0069:
            r4 = r11 & 8
            if (r4 == 0) goto L_0x0070
            r1 = r1 | 3072(0xc00, float:4.305E-42)
            goto L_0x0083
        L_0x0070:
            r7 = r12 & 7168(0x1c00, float:1.0045E-41)
            if (r7 != 0) goto L_0x0083
            r7 = r58
            boolean r8 = r10.changed((java.lang.Object) r7)
            if (r8 == 0) goto L_0x007f
            r8 = 2048(0x800, float:2.87E-42)
            goto L_0x0081
        L_0x007f:
            r8 = 1024(0x400, float:1.435E-42)
        L_0x0081:
            r1 = r1 | r8
            goto L_0x0085
        L_0x0083:
            r7 = r58
        L_0x0085:
            r8 = r11 & 16
            r45 = 57344(0xe000, float:8.0356E-41)
            if (r8 == 0) goto L_0x008f
            r1 = r1 | 24576(0x6000, float:3.4438E-41)
            goto L_0x00a3
        L_0x008f:
            r9 = r12 & r45
            if (r9 != 0) goto L_0x00a3
            r9 = r59
            boolean r16 = r10.changed((boolean) r9)
            if (r16 == 0) goto L_0x009e
            r16 = 16384(0x4000, float:2.2959E-41)
            goto L_0x00a0
        L_0x009e:
            r16 = 8192(0x2000, float:1.14794E-41)
        L_0x00a0:
            r1 = r1 | r16
            goto L_0x00a5
        L_0x00a3:
            r9 = r59
        L_0x00a5:
            r16 = r11 & 32
            r46 = 458752(0x70000, float:6.42848E-40)
            if (r16 == 0) goto L_0x00b2
            r17 = 196608(0x30000, float:2.75506E-40)
            r1 = r1 | r17
            r2 = r60
            goto L_0x00c5
        L_0x00b2:
            r17 = r12 & r46
            r2 = r60
            if (r17 != 0) goto L_0x00c5
            boolean r17 = r10.changedInstance(r2)
            if (r17 == 0) goto L_0x00c1
            r17 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00c3
        L_0x00c1:
            r17 = 65536(0x10000, float:9.18355E-41)
        L_0x00c3:
            r1 = r1 | r17
        L_0x00c5:
            r17 = r11 & 64
            r47 = 3670016(0x380000, float:5.142788E-39)
            if (r17 == 0) goto L_0x00d2
            r18 = 1572864(0x180000, float:2.204052E-39)
            r1 = r1 | r18
            r3 = r61
            goto L_0x00e5
        L_0x00d2:
            r18 = r12 & r47
            r3 = r61
            if (r18 != 0) goto L_0x00e5
            boolean r19 = r10.changedInstance(r3)
            if (r19 == 0) goto L_0x00e1
            r19 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00e3
        L_0x00e1:
            r19 = 524288(0x80000, float:7.34684E-40)
        L_0x00e3:
            r1 = r1 | r19
        L_0x00e5:
            r19 = 29360128(0x1c00000, float:7.052966E-38)
            r19 = r12 & r19
            if (r19 != 0) goto L_0x0101
            r5 = r11 & 128(0x80, float:1.794E-43)
            if (r5 != 0) goto L_0x00fa
            r5 = r62
            boolean r20 = r10.changed((java.lang.Object) r5)
            if (r20 == 0) goto L_0x00fc
            r20 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00fe
        L_0x00fa:
            r5 = r62
        L_0x00fc:
            r20 = 4194304(0x400000, float:5.877472E-39)
        L_0x00fe:
            r1 = r1 | r20
            goto L_0x0103
        L_0x0101:
            r5 = r62
        L_0x0103:
            r20 = 234881024(0xe000000, float:1.5777218E-30)
            r20 = r12 & r20
            if (r20 != 0) goto L_0x011f
            r6 = r11 & 256(0x100, float:3.59E-43)
            if (r6 != 0) goto L_0x0118
            r6 = r63
            boolean r21 = r10.changed((java.lang.Object) r6)
            if (r21 == 0) goto L_0x011a
            r21 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x011c
        L_0x0118:
            r6 = r63
        L_0x011a:
            r21 = 33554432(0x2000000, float:9.403955E-38)
        L_0x011c:
            r1 = r1 | r21
            goto L_0x0121
        L_0x011f:
            r6 = r63
        L_0x0121:
            r21 = 1879048192(0x70000000, float:1.58456325E29)
            r21 = r12 & r21
            if (r21 != 0) goto L_0x013d
            r0 = r11 & 512(0x200, float:7.175E-43)
            if (r0 != 0) goto L_0x0136
            r0 = r64
            boolean r21 = r10.changed((java.lang.Object) r0)
            if (r21 == 0) goto L_0x0138
            r21 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x013a
        L_0x0136:
            r0 = r64
        L_0x0138:
            r21 = 268435456(0x10000000, float:2.5243549E-29)
        L_0x013a:
            r1 = r1 | r21
            goto L_0x013f
        L_0x013d:
            r0 = r64
        L_0x013f:
            r21 = r69 & 14
            if (r21 != 0) goto L_0x0159
            r0 = r11 & 1024(0x400, float:1.435E-42)
            if (r0 != 0) goto L_0x0152
            r0 = r65
            boolean r21 = r10.changed((java.lang.Object) r0)
            if (r21 == 0) goto L_0x0154
            r18 = 4
            goto L_0x0156
        L_0x0152:
            r0 = r65
        L_0x0154:
            r18 = 2
        L_0x0156:
            r18 = r69 | r18
            goto L_0x015d
        L_0x0159:
            r0 = r65
            r18 = r69
        L_0x015d:
            r9 = r11 & 2048(0x800, float:2.87E-42)
            if (r9 == 0) goto L_0x016a
            r18 = r18 | 48
            r67 = r9
            r48 = r18
            r9 = r66
            goto L_0x0181
        L_0x016a:
            r21 = r69 & 112(0x70, float:1.57E-43)
            r67 = r9
            r9 = r66
            if (r21 != 0) goto L_0x017f
            boolean r21 = r10.changed((java.lang.Object) r9)
            if (r21 == 0) goto L_0x017b
            r19 = 32
            goto L_0x017d
        L_0x017b:
            r19 = 16
        L_0x017d:
            r18 = r18 | r19
        L_0x017f:
            r48 = r18
        L_0x0181:
            r18 = 1533916891(0x5b6db6db, float:6.6910621E16)
            r0 = r1 & r18
            r2 = 306783378(0x12492492, float:6.3469493E-28)
            if (r0 != r2) goto L_0x01ac
            r0 = r48 & 91
            r2 = 18
            if (r0 != r2) goto L_0x01ac
            boolean r0 = r10.getSkipping()
            if (r0 != 0) goto L_0x0198
            goto L_0x01ac
        L_0x0198:
            r10.skipToGroupEnd()
            r11 = r65
            r8 = r5
            r4 = r7
            r12 = r9
            r24 = r10
            r5 = r59
            r10 = r64
            r7 = r3
            r9 = r6
            r6 = r60
            goto L_0x03bc
        L_0x01ac:
            r10.startDefaults()
            r0 = r12 & 1
            r49 = 0
            r2 = 6
            if (r0 == 0) goto L_0x01f4
            boolean r0 = r10.getDefaultsInvalid()
            if (r0 == 0) goto L_0x01bd
            goto L_0x01f4
        L_0x01bd:
            r10.skipToGroupEnd()
            r0 = r11 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x01c8
            r0 = -29360129(0xfffffffffe3fffff, float:-6.380294E37)
            r1 = r1 & r0
        L_0x01c8:
            r0 = r11 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L_0x01d0
            r0 = -234881025(0xfffffffff1ffffff, float:-2.535301E30)
            r1 = r1 & r0
        L_0x01d0:
            r0 = r11 & 512(0x200, float:7.175E-43)
            if (r0 == 0) goto L_0x01d8
            r0 = -1879048193(0xffffffff8fffffff, float:-2.5243547E-29)
            r1 = r1 & r0
        L_0x01d8:
            r0 = r11 & 1024(0x400, float:1.435E-42)
            if (r0 == 0) goto L_0x01de
            r48 = r48 & -15
        L_0x01de:
            r51 = r60
            r20 = r64
            r8 = r65
            r52 = r3
            r53 = r5
            r30 = r6
            r19 = r7
            r21 = r9
            r0 = r48
            r9 = r59
            goto L_0x02ec
        L_0x01f4:
            if (r4 == 0) goto L_0x01fb
            androidx.compose.ui.Modifier$Companion r0 = androidx.compose.ui.Modifier.Companion
            androidx.compose.ui.Modifier r0 = (androidx.compose.ui.Modifier) r0
            goto L_0x01fc
        L_0x01fb:
            r0 = r7
        L_0x01fc:
            if (r8 == 0) goto L_0x0202
            r4 = 1
            r50 = r4
            goto L_0x0204
        L_0x0202:
            r50 = r59
        L_0x0204:
            if (r16 == 0) goto L_0x0209
            r51 = r49
            goto L_0x020b
        L_0x0209:
            r51 = r60
        L_0x020b:
            if (r17 == 0) goto L_0x0210
            r52 = r49
            goto L_0x0212
        L_0x0210:
            r52 = r3
        L_0x0212:
            r3 = r11 & 128(0x80, float:1.794E-43)
            if (r3 == 0) goto L_0x0223
            androidx.compose.material3.FilterChipDefaults r3 = androidx.compose.material3.FilterChipDefaults.INSTANCE
            androidx.compose.ui.graphics.Shape r3 = r3.getShape(r10, r2)
            r4 = -29360129(0xfffffffffe3fffff, float:-6.380294E37)
            r1 = r1 & r4
            r53 = r3
            goto L_0x0225
        L_0x0223:
            r53 = r5
        L_0x0225:
            r3 = r11 & 256(0x100, float:3.59E-43)
            if (r3 == 0) goto L_0x0258
            androidx.compose.material3.FilterChipDefaults r16 = androidx.compose.material3.FilterChipDefaults.INSTANCE
            r17 = 0
            r19 = 0
            r21 = 0
            r23 = 0
            r25 = 0
            r27 = 0
            r29 = 0
            r31 = 0
            r33 = 0
            r35 = 0
            r37 = 0
            r39 = 0
            r42 = 0
            r43 = 384(0x180, float:5.38E-43)
            r44 = 4095(0xfff, float:5.738E-42)
            r41 = r10
            androidx.compose.material3.SelectableChipColors r3 = r16.m1362filterChipColorsXqyqHi0(r17, r19, r21, r23, r25, r27, r29, r31, r33, r35, r37, r39, r41, r42, r43, r44)
            r4 = -234881025(0xfffffffff1ffffff, float:-2.535301E30)
            r1 = r1 & r4
            r16 = r1
            r30 = r3
            goto L_0x025c
        L_0x0258:
            r16 = r1
            r30 = r6
        L_0x025c:
            r1 = r11 & 512(0x200, float:7.175E-43)
            if (r1 == 0) goto L_0x0285
            androidx.compose.material3.FilterChipDefaults r1 = androidx.compose.material3.FilterChipDefaults.INSTANCE
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r17 = 1572864(0x180000, float:2.204052E-39)
            r18 = 63
            r2 = r3
            r3 = r4
            r4 = r5
            r5 = r6
            r6 = r7
            r7 = r8
            r8 = r10
            r31 = r67
            r9 = r17
            r58 = r10
            r10 = r18
            androidx.compose.material3.SelectableChipElevation r1 = r1.m1363filterChipElevationaqJV_2Y(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r2 = -1879048193(0xffffffff8fffffff, float:-2.5243547E-29)
            r2 = r16 & r2
            goto L_0x028d
        L_0x0285:
            r31 = r67
            r58 = r10
            r1 = r64
            r2 = r16
        L_0x028d:
            r3 = r11 & 1024(0x400, float:1.435E-42)
            if (r3 == 0) goto L_0x02ac
            androidx.compose.material3.FilterChipDefaults r16 = androidx.compose.material3.FilterChipDefaults.INSTANCE
            r17 = 0
            r19 = 0
            r21 = 0
            r23 = 0
            r25 = 0
            r26 = 0
            r28 = 1572864(0x180000, float:2.204052E-39)
            r29 = 63
            r27 = r58
            androidx.compose.material3.SelectableChipBorder r3 = r16.m1361filterChipBordergHcDVlo(r17, r19, r21, r23, r25, r26, r27, r28, r29)
            r48 = r48 & -15
            goto L_0x02ae
        L_0x02ac:
            r3 = r65
        L_0x02ae:
            if (r31 == 0) goto L_0x02de
            r4 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r10 = r58
            r10.startReplaceableGroup(r4)
            java.lang.String r4 = "CC(remember):Composables.kt#9igjgp"
            androidx.compose.runtime.ComposerKt.sourceInformation(r10, r4)
            java.lang.Object r4 = r10.rememberedValue()
            androidx.compose.runtime.Composer$Companion r5 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r5 = r5.getEmpty()
            if (r4 != r5) goto L_0x02d0
            androidx.compose.foundation.interaction.MutableInteractionSource r4 = androidx.compose.foundation.interaction.InteractionSourceKt.MutableInteractionSource()
            r10.updateRememberedValue(r4)
        L_0x02d0:
            r10.endReplaceableGroup()
            androidx.compose.foundation.interaction.MutableInteractionSource r4 = (androidx.compose.foundation.interaction.MutableInteractionSource) r4
            r19 = r0
            r20 = r1
            r1 = r2
            r8 = r3
            r21 = r4
            goto L_0x02e8
        L_0x02de:
            r10 = r58
            r21 = r66
            r19 = r0
            r20 = r1
            r1 = r2
            r8 = r3
        L_0x02e8:
            r0 = r48
            r9 = r50
        L_0x02ec:
            r10.endDefaults()
            boolean r2 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r2 == 0) goto L_0x02fe
            java.lang.String r2 = "androidx.compose.material3.FilterChip (Chip.kt:255)"
            r3 = -1878072905(0xffffffff900ee1b7, float:-2.8178447E-29)
            androidx.compose.runtime.ComposerKt.traceEventStart(r3, r1, r0, r2)
        L_0x02fe:
            androidx.compose.material3.MaterialTheme r2 = androidx.compose.material3.MaterialTheme.INSTANCE
            r3 = 6
            androidx.compose.material3.Typography r2 = r2.getTypography(r10, r3)
            androidx.compose.material3.tokens.FilterChipTokens r3 = androidx.compose.material3.tokens.FilterChipTokens.INSTANCE
            androidx.compose.material3.tokens.TypographyKeyTokens r3 = r3.getLabelTextFont()
            androidx.compose.ui.text.TextStyle r5 = androidx.compose.material3.TypographyKt.fromToken(r2, r3)
            androidx.compose.material3.FilterChipDefaults r2 = androidx.compose.material3.FilterChipDefaults.INSTANCE
            float r16 = r2.m1364getHeightD9Ej5fM()
            androidx.compose.foundation.layout.PaddingValues r22 = FilterChipPadding
            r2 = 276171431(0x10760aa7, float:4.8523152E-29)
            r10.startReplaceableGroup(r2)
            java.lang.String r2 = "283@14286L31"
            androidx.compose.runtime.ComposerKt.sourceInformation(r10, r2)
            if (r8 != 0) goto L_0x0327
            r2 = r49
            goto L_0x0339
        L_0x0327:
            int r2 = r1 >> 12
            r2 = r2 & 14
            int r3 = r1 << 3
            r3 = r3 & 112(0x70, float:1.57E-43)
            r2 = r2 | r3
            int r3 = r0 << 6
            r3 = r3 & 896(0x380, float:1.256E-42)
            r2 = r2 | r3
            androidx.compose.runtime.State r2 = r8.borderStroke$material3_release(r9, r15, r10, r2)
        L_0x0339:
            r10.endReplaceableGroup()
            if (r2 == 0) goto L_0x0346
            java.lang.Object r2 = r2.getValue()
            androidx.compose.foundation.BorderStroke r2 = (androidx.compose.foundation.BorderStroke) r2
            r49 = r2
        L_0x0346:
            r7 = 0
            r2 = r1 & 14
            r3 = 12582912(0xc00000, float:1.7632415E-38)
            r2 = r2 | r3
            int r3 = r1 >> 6
            r3 = r3 & 112(0x70, float:1.57E-43)
            r2 = r2 | r3
            int r3 = r1 << 3
            r4 = r3 & 896(0x380, float:1.256E-42)
            r2 = r2 | r4
            int r4 = r1 >> 3
            r4 = r4 & 7168(0x1c00, float:1.0045E-41)
            r2 = r2 | r4
            int r4 = r1 << 6
            r6 = r4 & r45
            r2 = r2 | r6
            r3 = r3 & r47
            r2 = r2 | r3
            r3 = 234881024(0xe000000, float:1.5777218E-30)
            r3 = r3 & r4
            r2 = r2 | r3
            r3 = 1879048192(0x70000000, float:1.58456325E29)
            r3 = r3 & r4
            r17 = r2 | r3
            int r1 = r1 >> 24
            r2 = r1 & 14
            r2 = r2 | 27648(0x6c00, float:3.8743E-41)
            r1 = r1 & 112(0x70, float:1.57E-43)
            r1 = r1 | r2
            int r0 = r0 << 12
            r0 = r0 & r46
            r18 = r1 | r0
            r0 = r55
            r1 = r19
            r2 = r56
            r3 = r9
            r4 = r57
            r6 = r51
            r23 = r8
            r8 = r52
            r50 = r9
            r9 = r53
            r24 = r10
            r10 = r30
            r11 = r20
            r12 = r49
            r13 = r16
            r14 = r22
            r15 = r21
            r16 = r24
            m1175SelectableChipu0RnIRE(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto L_0x03aa
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L_0x03aa:
            r4 = r19
            r10 = r20
            r12 = r21
            r11 = r23
            r9 = r30
            r5 = r50
            r6 = r51
            r7 = r52
            r8 = r53
        L_0x03bc:
            androidx.compose.runtime.ScopeUpdateScope r15 = r24.endRestartGroup()
            if (r15 != 0) goto L_0x03c3
            goto L_0x03e1
        L_0x03c3:
            androidx.compose.material3.ChipKt$FilterChip$2 r16 = new androidx.compose.material3.ChipKt$FilterChip$2
            r0 = r16
            r1 = r55
            r2 = r56
            r3 = r57
            r13 = r68
            r14 = r69
            r54 = r15
            r15 = r70
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            r0 = r16
            kotlin.jvm.functions.Function2 r0 = (kotlin.jvm.functions.Function2) r0
            r1 = r54
            r1.updateScope(r0)
        L_0x03e1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.ChipKt.FilterChip(boolean, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function2, androidx.compose.ui.Modifier, boolean, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, androidx.compose.ui.graphics.Shape, androidx.compose.material3.SelectableChipColors, androidx.compose.material3.SelectableChipElevation, androidx.compose.material3.SelectableChipBorder, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:105:0x013d  */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x0143  */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x014a  */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x0166  */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x016b  */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x0199  */
    /* JADX WARNING: Removed duplicated region for block: B:134:0x01ae  */
    /* JADX WARNING: Removed duplicated region for block: B:199:0x03ad  */
    /* JADX WARNING: Removed duplicated region for block: B:201:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x008f  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00ab  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00b2  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00cb  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00d2  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x00eb  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x0101  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x0109  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x011f  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x0127  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void ElevatedFilterChip(boolean r56, kotlin.jvm.functions.Function0<kotlin.Unit> r57, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r58, androidx.compose.ui.Modifier r59, boolean r60, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r61, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r62, androidx.compose.ui.graphics.Shape r63, androidx.compose.material3.SelectableChipColors r64, androidx.compose.material3.SelectableChipElevation r65, androidx.compose.material3.SelectableChipBorder r66, androidx.compose.foundation.interaction.MutableInteractionSource r67, androidx.compose.runtime.Composer r68, int r69, int r70, int r71) {
        /*
            r15 = r56
            r14 = r57
            r13 = r58
            r12 = r69
            r11 = r71
            java.lang.String r0 = "onClick"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r14, r0)
            java.lang.String r0 = "label"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r0)
            r0 = 1904578605(0x7185902d, float:1.3227457E30)
            r1 = r68
            androidx.compose.runtime.Composer r10 = r1.startRestartGroup(r0)
            java.lang.String r1 = "C(ElevatedFilterChip)P(9,8,5,7,3,6,11,10,1,2)343@17577L5,344@17638L26,345@17727L29,347@17850L39,354@18060L10,348@17894L556:Chip.kt#uh7d8r"
            androidx.compose.runtime.ComposerKt.sourceInformation(r10, r1)
            r1 = r11 & 1
            if (r1 == 0) goto L_0x002b
            r1 = r12 | 6
            goto L_0x003b
        L_0x002b:
            r1 = r12 & 14
            if (r1 != 0) goto L_0x003a
            boolean r1 = r10.changed((boolean) r15)
            if (r1 == 0) goto L_0x0037
            r1 = 4
            goto L_0x0038
        L_0x0037:
            r1 = 2
        L_0x0038:
            r1 = r1 | r12
            goto L_0x003b
        L_0x003a:
            r1 = r12
        L_0x003b:
            r4 = r11 & 2
            if (r4 == 0) goto L_0x0042
            r1 = r1 | 48
            goto L_0x0052
        L_0x0042:
            r4 = r12 & 112(0x70, float:1.57E-43)
            if (r4 != 0) goto L_0x0052
            boolean r4 = r10.changedInstance(r14)
            if (r4 == 0) goto L_0x004f
            r4 = 32
            goto L_0x0051
        L_0x004f:
            r4 = 16
        L_0x0051:
            r1 = r1 | r4
        L_0x0052:
            r4 = r11 & 4
            if (r4 == 0) goto L_0x0059
            r1 = r1 | 384(0x180, float:5.38E-43)
            goto L_0x0069
        L_0x0059:
            r4 = r12 & 896(0x380, float:1.256E-42)
            if (r4 != 0) goto L_0x0069
            boolean r4 = r10.changedInstance(r13)
            if (r4 == 0) goto L_0x0066
            r4 = 256(0x100, float:3.59E-43)
            goto L_0x0068
        L_0x0066:
            r4 = 128(0x80, float:1.794E-43)
        L_0x0068:
            r1 = r1 | r4
        L_0x0069:
            r4 = r11 & 8
            if (r4 == 0) goto L_0x0070
            r1 = r1 | 3072(0xc00, float:4.305E-42)
            goto L_0x0083
        L_0x0070:
            r7 = r12 & 7168(0x1c00, float:1.0045E-41)
            if (r7 != 0) goto L_0x0083
            r7 = r59
            boolean r8 = r10.changed((java.lang.Object) r7)
            if (r8 == 0) goto L_0x007f
            r8 = 2048(0x800, float:2.87E-42)
            goto L_0x0081
        L_0x007f:
            r8 = 1024(0x400, float:1.435E-42)
        L_0x0081:
            r1 = r1 | r8
            goto L_0x0085
        L_0x0083:
            r7 = r59
        L_0x0085:
            r8 = r11 & 16
            r45 = 57344(0xe000, float:8.0356E-41)
            if (r8 == 0) goto L_0x008f
            r1 = r1 | 24576(0x6000, float:3.4438E-41)
            goto L_0x00a3
        L_0x008f:
            r9 = r12 & r45
            if (r9 != 0) goto L_0x00a3
            r9 = r60
            boolean r16 = r10.changed((boolean) r9)
            if (r16 == 0) goto L_0x009e
            r16 = 16384(0x4000, float:2.2959E-41)
            goto L_0x00a0
        L_0x009e:
            r16 = 8192(0x2000, float:1.14794E-41)
        L_0x00a0:
            r1 = r1 | r16
            goto L_0x00a5
        L_0x00a3:
            r9 = r60
        L_0x00a5:
            r16 = r11 & 32
            r46 = 458752(0x70000, float:6.42848E-40)
            if (r16 == 0) goto L_0x00b2
            r17 = 196608(0x30000, float:2.75506E-40)
            r1 = r1 | r17
            r2 = r61
            goto L_0x00c5
        L_0x00b2:
            r17 = r12 & r46
            r2 = r61
            if (r17 != 0) goto L_0x00c5
            boolean r17 = r10.changedInstance(r2)
            if (r17 == 0) goto L_0x00c1
            r17 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00c3
        L_0x00c1:
            r17 = 65536(0x10000, float:9.18355E-41)
        L_0x00c3:
            r1 = r1 | r17
        L_0x00c5:
            r17 = r11 & 64
            r47 = 3670016(0x380000, float:5.142788E-39)
            if (r17 == 0) goto L_0x00d2
            r18 = 1572864(0x180000, float:2.204052E-39)
            r1 = r1 | r18
            r3 = r62
            goto L_0x00e5
        L_0x00d2:
            r18 = r12 & r47
            r3 = r62
            if (r18 != 0) goto L_0x00e5
            boolean r19 = r10.changedInstance(r3)
            if (r19 == 0) goto L_0x00e1
            r19 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00e3
        L_0x00e1:
            r19 = 524288(0x80000, float:7.34684E-40)
        L_0x00e3:
            r1 = r1 | r19
        L_0x00e5:
            r19 = 29360128(0x1c00000, float:7.052966E-38)
            r19 = r12 & r19
            if (r19 != 0) goto L_0x0101
            r5 = r11 & 128(0x80, float:1.794E-43)
            if (r5 != 0) goto L_0x00fa
            r5 = r63
            boolean r20 = r10.changed((java.lang.Object) r5)
            if (r20 == 0) goto L_0x00fc
            r20 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00fe
        L_0x00fa:
            r5 = r63
        L_0x00fc:
            r20 = 4194304(0x400000, float:5.877472E-39)
        L_0x00fe:
            r1 = r1 | r20
            goto L_0x0103
        L_0x0101:
            r5 = r63
        L_0x0103:
            r20 = 234881024(0xe000000, float:1.5777218E-30)
            r20 = r12 & r20
            if (r20 != 0) goto L_0x011f
            r6 = r11 & 256(0x100, float:3.59E-43)
            if (r6 != 0) goto L_0x0118
            r6 = r64
            boolean r21 = r10.changed((java.lang.Object) r6)
            if (r21 == 0) goto L_0x011a
            r21 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x011c
        L_0x0118:
            r6 = r64
        L_0x011a:
            r21 = 33554432(0x2000000, float:9.403955E-38)
        L_0x011c:
            r1 = r1 | r21
            goto L_0x0121
        L_0x011f:
            r6 = r64
        L_0x0121:
            r21 = 1879048192(0x70000000, float:1.58456325E29)
            r21 = r12 & r21
            if (r21 != 0) goto L_0x013d
            r0 = r11 & 512(0x200, float:7.175E-43)
            if (r0 != 0) goto L_0x0136
            r0 = r65
            boolean r21 = r10.changed((java.lang.Object) r0)
            if (r21 == 0) goto L_0x0138
            r21 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x013a
        L_0x0136:
            r0 = r65
        L_0x0138:
            r21 = 268435456(0x10000000, float:2.5243549E-29)
        L_0x013a:
            r1 = r1 | r21
            goto L_0x013f
        L_0x013d:
            r0 = r65
        L_0x013f:
            r9 = r11 & 1024(0x400, float:1.435E-42)
            if (r9 == 0) goto L_0x014a
            r18 = r70 | 6
            r48 = r9
            r9 = r66
            goto L_0x0162
        L_0x014a:
            r21 = r70 & 14
            r48 = r9
            r9 = r66
            if (r21 != 0) goto L_0x0160
            boolean r21 = r10.changed((java.lang.Object) r9)
            if (r21 == 0) goto L_0x015b
            r18 = 4
            goto L_0x015d
        L_0x015b:
            r18 = 2
        L_0x015d:
            r18 = r70 | r18
            goto L_0x0162
        L_0x0160:
            r18 = r70
        L_0x0162:
            r9 = r11 & 2048(0x800, float:2.87E-42)
            if (r9 == 0) goto L_0x016b
            r18 = r18 | 48
            r68 = r9
            goto L_0x0180
        L_0x016b:
            r21 = r70 & 112(0x70, float:1.57E-43)
            r68 = r9
            r9 = r67
            if (r21 != 0) goto L_0x0180
            boolean r21 = r10.changed((java.lang.Object) r9)
            if (r21 == 0) goto L_0x017c
            r19 = 32
            goto L_0x017e
        L_0x017c:
            r19 = 16
        L_0x017e:
            r18 = r18 | r19
        L_0x0180:
            r9 = r18
            r18 = 1533916891(0x5b6db6db, float:6.6910621E16)
            r0 = r1 & r18
            r2 = 306783378(0x12492492, float:6.3469493E-28)
            if (r0 != r2) goto L_0x01ae
            r0 = r9 & 91
            r2 = 18
            if (r0 != r2) goto L_0x01ae
            boolean r0 = r10.getSkipping()
            if (r0 != 0) goto L_0x0199
            goto L_0x01ae
        L_0x0199:
            r10.skipToGroupEnd()
            r11 = r66
            r12 = r67
            r8 = r5
            r9 = r6
            r4 = r7
            r25 = r10
            r5 = r60
            r6 = r61
            r10 = r65
            r7 = r3
            goto L_0x03a6
        L_0x01ae:
            r10.startDefaults()
            r0 = r12 & 1
            r49 = 0
            r2 = 6
            if (r0 == 0) goto L_0x01f1
            boolean r0 = r10.getDefaultsInvalid()
            if (r0 == 0) goto L_0x01bf
            goto L_0x01f1
        L_0x01bf:
            r10.skipToGroupEnd()
            r0 = r11 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x01ca
            r0 = -29360129(0xfffffffffe3fffff, float:-6.380294E37)
            r1 = r1 & r0
        L_0x01ca:
            r0 = r11 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L_0x01d2
            r0 = -234881025(0xfffffffff1ffffff, float:-2.535301E30)
            r1 = r1 & r0
        L_0x01d2:
            r0 = r11 & 512(0x200, float:7.175E-43)
            if (r0 == 0) goto L_0x01da
            r0 = -1879048193(0xffffffff8fffffff, float:-2.5243547E-29)
            r1 = r1 & r0
        L_0x01da:
            r51 = r61
            r21 = r65
            r22 = r67
            r52 = r3
            r53 = r5
            r20 = r6
            r19 = r7
            r54 = r9
            r14 = r10
            r10 = r60
            r9 = r66
            goto L_0x02d1
        L_0x01f1:
            if (r4 == 0) goto L_0x01f8
            androidx.compose.ui.Modifier$Companion r0 = androidx.compose.ui.Modifier.Companion
            androidx.compose.ui.Modifier r0 = (androidx.compose.ui.Modifier) r0
            goto L_0x01f9
        L_0x01f8:
            r0 = r7
        L_0x01f9:
            if (r8 == 0) goto L_0x01ff
            r4 = 1
            r50 = r4
            goto L_0x0201
        L_0x01ff:
            r50 = r60
        L_0x0201:
            if (r16 == 0) goto L_0x0206
            r51 = r49
            goto L_0x0208
        L_0x0206:
            r51 = r61
        L_0x0208:
            if (r17 == 0) goto L_0x020d
            r52 = r49
            goto L_0x020f
        L_0x020d:
            r52 = r3
        L_0x020f:
            r3 = r11 & 128(0x80, float:1.794E-43)
            if (r3 == 0) goto L_0x0220
            androidx.compose.material3.FilterChipDefaults r3 = androidx.compose.material3.FilterChipDefaults.INSTANCE
            androidx.compose.ui.graphics.Shape r3 = r3.getShape(r10, r2)
            r4 = -29360129(0xfffffffffe3fffff, float:-6.380294E37)
            r1 = r1 & r4
            r53 = r3
            goto L_0x0222
        L_0x0220:
            r53 = r5
        L_0x0222:
            r3 = r11 & 256(0x100, float:3.59E-43)
            if (r3 == 0) goto L_0x0255
            androidx.compose.material3.FilterChipDefaults r16 = androidx.compose.material3.FilterChipDefaults.INSTANCE
            r17 = 0
            r19 = 0
            r21 = 0
            r23 = 0
            r25 = 0
            r27 = 0
            r29 = 0
            r31 = 0
            r33 = 0
            r35 = 0
            r37 = 0
            r39 = 0
            r42 = 0
            r43 = 384(0x180, float:5.38E-43)
            r44 = 4095(0xfff, float:5.738E-42)
            r41 = r10
            androidx.compose.material3.SelectableChipColors r3 = r16.m1359elevatedFilterChipColorsXqyqHi0(r17, r19, r21, r23, r25, r27, r29, r31, r33, r35, r37, r39, r41, r42, r43, r44)
            r4 = -234881025(0xfffffffff1ffffff, float:-2.535301E30)
            r1 = r1 & r4
            r17 = r1
            r16 = r3
            goto L_0x0259
        L_0x0255:
            r17 = r1
            r16 = r6
        L_0x0259:
            r1 = r11 & 512(0x200, float:7.175E-43)
            if (r1 == 0) goto L_0x0287
            androidx.compose.material3.FilterChipDefaults r1 = androidx.compose.material3.FilterChipDefaults.INSTANCE
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r18 = 1572864(0x180000, float:2.204052E-39)
            r19 = 63
            r2 = r3
            r3 = r4
            r4 = r5
            r5 = r6
            r6 = r7
            r7 = r8
            r8 = r10
            r21 = r68
            r54 = r9
            r20 = r48
            r9 = r18
            r14 = r10
            r10 = r19
            androidx.compose.material3.SelectableChipElevation r1 = r1.m1360elevatedFilterChipElevationaqJV_2Y(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r2 = -1879048193(0xffffffff8fffffff, float:-2.5243547E-29)
            r2 = r17 & r2
            r17 = r2
            goto L_0x0290
        L_0x0287:
            r21 = r68
            r54 = r9
            r14 = r10
            r20 = r48
            r1 = r65
        L_0x0290:
            if (r20 == 0) goto L_0x0295
            r2 = r49
            goto L_0x0297
        L_0x0295:
            r2 = r66
        L_0x0297:
            if (r21 == 0) goto L_0x02c4
            r3 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r14.startReplaceableGroup(r3)
            java.lang.String r3 = "CC(remember):Composables.kt#9igjgp"
            androidx.compose.runtime.ComposerKt.sourceInformation(r14, r3)
            java.lang.Object r3 = r14.rememberedValue()
            androidx.compose.runtime.Composer$Companion r4 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r4 = r4.getEmpty()
            if (r3 != r4) goto L_0x02b7
            androidx.compose.foundation.interaction.MutableInteractionSource r3 = androidx.compose.foundation.interaction.InteractionSourceKt.MutableInteractionSource()
            r14.updateRememberedValue(r3)
        L_0x02b7:
            r14.endReplaceableGroup()
            androidx.compose.foundation.interaction.MutableInteractionSource r3 = (androidx.compose.foundation.interaction.MutableInteractionSource) r3
            r19 = r0
            r21 = r1
            r9 = r2
            r22 = r3
            goto L_0x02cb
        L_0x02c4:
            r22 = r67
            r19 = r0
            r21 = r1
            r9 = r2
        L_0x02cb:
            r20 = r16
            r1 = r17
            r10 = r50
        L_0x02d1:
            r14.endDefaults()
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto L_0x02e6
            java.lang.String r0 = "androidx.compose.material3.ElevatedFilterChip (Chip.kt:335)"
            r2 = r54
            r3 = 1904578605(0x7185902d, float:1.3227457E30)
            androidx.compose.runtime.ComposerKt.traceEventStart(r3, r1, r2, r0)
            goto L_0x02e8
        L_0x02e6:
            r2 = r54
        L_0x02e8:
            androidx.compose.material3.MaterialTheme r0 = androidx.compose.material3.MaterialTheme.INSTANCE
            r3 = 6
            androidx.compose.material3.Typography r0 = r0.getTypography(r14, r3)
            androidx.compose.material3.tokens.FilterChipTokens r3 = androidx.compose.material3.tokens.FilterChipTokens.INSTANCE
            androidx.compose.material3.tokens.TypographyKeyTokens r3 = r3.getLabelTextFont()
            androidx.compose.ui.text.TextStyle r5 = androidx.compose.material3.TypographyKt.fromToken(r0, r3)
            androidx.compose.material3.FilterChipDefaults r0 = androidx.compose.material3.FilterChipDefaults.INSTANCE
            float r16 = r0.m1364getHeightD9Ej5fM()
            androidx.compose.foundation.layout.PaddingValues r23 = FilterChipPadding
            r0 = -790769778(0xffffffffd0ddcf8e, float:-2.97709363E10)
            r14.startReplaceableGroup(r0)
            java.lang.String r0 = "363@18367L31"
            androidx.compose.runtime.ComposerKt.sourceInformation(r14, r0)
            if (r9 != 0) goto L_0x0311
            r0 = r49
            goto L_0x0323
        L_0x0311:
            int r0 = r1 >> 12
            r0 = r0 & 14
            int r3 = r1 << 3
            r3 = r3 & 112(0x70, float:1.57E-43)
            r0 = r0 | r3
            int r3 = r2 << 6
            r3 = r3 & 896(0x380, float:1.256E-42)
            r0 = r0 | r3
            androidx.compose.runtime.State r0 = r9.borderStroke$material3_release(r10, r15, r14, r0)
        L_0x0323:
            r14.endReplaceableGroup()
            if (r0 == 0) goto L_0x0330
            java.lang.Object r0 = r0.getValue()
            androidx.compose.foundation.BorderStroke r0 = (androidx.compose.foundation.BorderStroke) r0
            r49 = r0
        L_0x0330:
            r7 = 0
            r0 = r1 & 14
            r3 = 12582912(0xc00000, float:1.7632415E-38)
            r0 = r0 | r3
            int r3 = r1 >> 6
            r3 = r3 & 112(0x70, float:1.57E-43)
            r0 = r0 | r3
            int r3 = r1 << 3
            r4 = r3 & 896(0x380, float:1.256E-42)
            r0 = r0 | r4
            int r4 = r1 >> 3
            r4 = r4 & 7168(0x1c00, float:1.0045E-41)
            r0 = r0 | r4
            int r4 = r1 << 6
            r6 = r4 & r45
            r0 = r0 | r6
            r3 = r3 & r47
            r0 = r0 | r3
            r3 = 234881024(0xe000000, float:1.5777218E-30)
            r3 = r3 & r4
            r0 = r0 | r3
            r3 = 1879048192(0x70000000, float:1.58456325E29)
            r3 = r3 & r4
            r17 = r0 | r3
            int r0 = r1 >> 24
            r1 = r0 & 14
            r1 = r1 | 27648(0x6c00, float:3.8743E-41)
            r0 = r0 & 112(0x70, float:1.57E-43)
            r0 = r0 | r1
            int r1 = r2 << 12
            r1 = r1 & r46
            r18 = r0 | r1
            r0 = r56
            r1 = r19
            r2 = r57
            r3 = r10
            r4 = r58
            r6 = r51
            r8 = r52
            r24 = r9
            r9 = r53
            r50 = r10
            r10 = r20
            r11 = r21
            r12 = r49
            r13 = r16
            r25 = r14
            r14 = r23
            r15 = r22
            r16 = r25
            m1175SelectableChipu0RnIRE(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto L_0x0394
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L_0x0394:
            r4 = r19
            r9 = r20
            r10 = r21
            r12 = r22
            r11 = r24
            r5 = r50
            r6 = r51
            r7 = r52
            r8 = r53
        L_0x03a6:
            androidx.compose.runtime.ScopeUpdateScope r15 = r25.endRestartGroup()
            if (r15 != 0) goto L_0x03ad
            goto L_0x03cb
        L_0x03ad:
            androidx.compose.material3.ChipKt$ElevatedFilterChip$2 r16 = new androidx.compose.material3.ChipKt$ElevatedFilterChip$2
            r0 = r16
            r1 = r56
            r2 = r57
            r3 = r58
            r13 = r69
            r14 = r70
            r55 = r15
            r15 = r71
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            r0 = r16
            kotlin.jvm.functions.Function2 r0 = (kotlin.jvm.functions.Function2) r0
            r1 = r55
            r1.updateScope(r0)
        L_0x03cb:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.ChipKt.ElevatedFilterChip(boolean, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function2, androidx.compose.ui.Modifier, boolean, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, androidx.compose.ui.graphics.Shape, androidx.compose.material3.SelectableChipColors, androidx.compose.material3.SelectableChipElevation, androidx.compose.material3.SelectableChipBorder, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v17, resolved type: androidx.compose.foundation.interaction.MutableInteractionSource} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x0141  */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x0147  */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x015d  */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x0165  */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x017b  */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x0183  */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x0186  */
    /* JADX WARNING: Removed duplicated region for block: B:143:0x01b3  */
    /* JADX WARNING: Removed duplicated region for block: B:144:0x01cc  */
    /* JADX WARNING: Removed duplicated region for block: B:230:0x0425  */
    /* JADX WARNING: Removed duplicated region for block: B:232:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x008f  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0094  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00ab  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00b2  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00cb  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00d2  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x00eb  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x00f2  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x010d  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x0123  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x012b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void InputChip(boolean r50, kotlin.jvm.functions.Function0<kotlin.Unit> r51, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r52, androidx.compose.ui.Modifier r53, boolean r54, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r55, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r56, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r57, androidx.compose.ui.graphics.Shape r58, androidx.compose.material3.SelectableChipColors r59, androidx.compose.material3.SelectableChipElevation r60, androidx.compose.material3.SelectableChipBorder r61, androidx.compose.foundation.interaction.MutableInteractionSource r62, androidx.compose.runtime.Composer r63, int r64, int r65, int r66) {
        /*
            r15 = r50
            r13 = r51
            r12 = r52
            r11 = r64
            r10 = r65
            r9 = r66
            java.lang.String r0 = "onClick"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r0)
            java.lang.String r0 = "label"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r0)
            r0 = -1599030387(0xffffffffa0b0bb8d, float:-2.993967E-19)
            r1 = r63
            androidx.compose.runtime.Composer r8 = r1.startRestartGroup(r0)
            java.lang.String r1 = "C(InputChip)P(10,9,6,8,4,7!1,12,11,2,3)428@21836L5,429@21896L17,430@21975L20,431@22051L17,432@22120L39,459@23091L10,453@22901L787:Chip.kt#uh7d8r"
            androidx.compose.runtime.ComposerKt.sourceInformation(r8, r1)
            r1 = r9 & 1
            if (r1 == 0) goto L_0x002d
            r1 = r11 | 6
            goto L_0x003d
        L_0x002d:
            r1 = r11 & 14
            if (r1 != 0) goto L_0x003c
            boolean r1 = r8.changed((boolean) r15)
            if (r1 == 0) goto L_0x0039
            r1 = 4
            goto L_0x003a
        L_0x0039:
            r1 = 2
        L_0x003a:
            r1 = r1 | r11
            goto L_0x003d
        L_0x003c:
            r1 = r11
        L_0x003d:
            r4 = r9 & 2
            if (r4 == 0) goto L_0x0044
            r1 = r1 | 48
            goto L_0x0054
        L_0x0044:
            r4 = r11 & 112(0x70, float:1.57E-43)
            if (r4 != 0) goto L_0x0054
            boolean r4 = r8.changedInstance(r13)
            if (r4 == 0) goto L_0x0051
            r4 = 32
            goto L_0x0053
        L_0x0051:
            r4 = 16
        L_0x0053:
            r1 = r1 | r4
        L_0x0054:
            r4 = r9 & 4
            if (r4 == 0) goto L_0x005b
            r1 = r1 | 384(0x180, float:5.38E-43)
            goto L_0x006b
        L_0x005b:
            r4 = r11 & 896(0x380, float:1.256E-42)
            if (r4 != 0) goto L_0x006b
            boolean r4 = r8.changedInstance(r12)
            if (r4 == 0) goto L_0x0068
            r4 = 256(0x100, float:3.59E-43)
            goto L_0x006a
        L_0x0068:
            r4 = 128(0x80, float:1.794E-43)
        L_0x006a:
            r1 = r1 | r4
        L_0x006b:
            r4 = r9 & 8
            if (r4 == 0) goto L_0x0072
            r1 = r1 | 3072(0xc00, float:4.305E-42)
            goto L_0x0086
        L_0x0072:
            r2 = r11 & 7168(0x1c00, float:1.0045E-41)
            if (r2 != 0) goto L_0x0086
            r2 = r53
            boolean r16 = r8.changed((java.lang.Object) r2)
            if (r16 == 0) goto L_0x0081
            r16 = 2048(0x800, float:2.87E-42)
            goto L_0x0083
        L_0x0081:
            r16 = 1024(0x400, float:1.435E-42)
        L_0x0083:
            r1 = r1 | r16
            goto L_0x0088
        L_0x0086:
            r2 = r53
        L_0x0088:
            r16 = r9 & 16
            r47 = 57344(0xe000, float:8.0356E-41)
            if (r16 == 0) goto L_0x0094
            r1 = r1 | 24576(0x6000, float:3.4438E-41)
            r3 = r54
            goto L_0x00a7
        L_0x0094:
            r17 = r11 & r47
            r3 = r54
            if (r17 != 0) goto L_0x00a7
            boolean r18 = r8.changed((boolean) r3)
            if (r18 == 0) goto L_0x00a3
            r18 = 16384(0x4000, float:2.2959E-41)
            goto L_0x00a5
        L_0x00a3:
            r18 = 8192(0x2000, float:1.14794E-41)
        L_0x00a5:
            r1 = r1 | r18
        L_0x00a7:
            r18 = r9 & 32
            if (r18 == 0) goto L_0x00b2
            r19 = 196608(0x30000, float:2.75506E-40)
            r1 = r1 | r19
            r5 = r55
            goto L_0x00c7
        L_0x00b2:
            r19 = 458752(0x70000, float:6.42848E-40)
            r19 = r11 & r19
            r5 = r55
            if (r19 != 0) goto L_0x00c7
            boolean r20 = r8.changedInstance(r5)
            if (r20 == 0) goto L_0x00c3
            r20 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00c5
        L_0x00c3:
            r20 = 65536(0x10000, float:9.18355E-41)
        L_0x00c5:
            r1 = r1 | r20
        L_0x00c7:
            r20 = r9 & 64
            if (r20 == 0) goto L_0x00d2
            r21 = 1572864(0x180000, float:2.204052E-39)
            r1 = r1 | r21
            r6 = r56
            goto L_0x00e7
        L_0x00d2:
            r21 = 3670016(0x380000, float:5.142788E-39)
            r21 = r11 & r21
            r6 = r56
            if (r21 != 0) goto L_0x00e7
            boolean r22 = r8.changedInstance(r6)
            if (r22 == 0) goto L_0x00e3
            r22 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00e5
        L_0x00e3:
            r22 = 524288(0x80000, float:7.34684E-40)
        L_0x00e5:
            r1 = r1 | r22
        L_0x00e7:
            r7 = r9 & 128(0x80, float:1.794E-43)
            if (r7 == 0) goto L_0x00f2
            r23 = 12582912(0xc00000, float:1.7632415E-38)
            r1 = r1 | r23
            r14 = r57
            goto L_0x0107
        L_0x00f2:
            r23 = 29360128(0x1c00000, float:7.052966E-38)
            r23 = r11 & r23
            r14 = r57
            if (r23 != 0) goto L_0x0107
            boolean r24 = r8.changedInstance(r14)
            if (r24 == 0) goto L_0x0103
            r24 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x0105
        L_0x0103:
            r24 = 4194304(0x400000, float:5.877472E-39)
        L_0x0105:
            r1 = r1 | r24
        L_0x0107:
            r24 = 234881024(0xe000000, float:1.5777218E-30)
            r24 = r11 & r24
            if (r24 != 0) goto L_0x0123
            r0 = r9 & 256(0x100, float:3.59E-43)
            if (r0 != 0) goto L_0x011c
            r0 = r58
            boolean r24 = r8.changed((java.lang.Object) r0)
            if (r24 == 0) goto L_0x011e
            r24 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x0120
        L_0x011c:
            r0 = r58
        L_0x011e:
            r24 = 33554432(0x2000000, float:9.403955E-38)
        L_0x0120:
            r1 = r1 | r24
            goto L_0x0125
        L_0x0123:
            r0 = r58
        L_0x0125:
            r24 = 1879048192(0x70000000, float:1.58456325E29)
            r24 = r11 & r24
            if (r24 != 0) goto L_0x0141
            r0 = r9 & 512(0x200, float:7.175E-43)
            if (r0 != 0) goto L_0x013a
            r0 = r59
            boolean r24 = r8.changed((java.lang.Object) r0)
            if (r24 == 0) goto L_0x013c
            r24 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x013e
        L_0x013a:
            r0 = r59
        L_0x013c:
            r24 = 268435456(0x10000000, float:2.5243549E-29)
        L_0x013e:
            r1 = r1 | r24
            goto L_0x0143
        L_0x0141:
            r0 = r59
        L_0x0143:
            r24 = r10 & 14
            if (r24 != 0) goto L_0x015d
            r0 = r9 & 1024(0x400, float:1.435E-42)
            if (r0 != 0) goto L_0x0156
            r0 = r60
            boolean r24 = r8.changed((java.lang.Object) r0)
            if (r24 == 0) goto L_0x0158
            r17 = 4
            goto L_0x015a
        L_0x0156:
            r0 = r60
        L_0x0158:
            r17 = 2
        L_0x015a:
            r17 = r10 | r17
            goto L_0x0161
        L_0x015d:
            r0 = r60
            r17 = r10
        L_0x0161:
            r24 = r10 & 112(0x70, float:1.57E-43)
            if (r24 != 0) goto L_0x017b
            r0 = r9 & 2048(0x800, float:2.87E-42)
            if (r0 != 0) goto L_0x0174
            r0 = r61
            boolean r24 = r8.changed((java.lang.Object) r0)
            if (r24 == 0) goto L_0x0176
            r19 = 32
            goto L_0x0178
        L_0x0174:
            r0 = r61
        L_0x0176:
            r19 = 16
        L_0x0178:
            r17 = r17 | r19
            goto L_0x017d
        L_0x017b:
            r0 = r61
        L_0x017d:
            r0 = r17
            r2 = r9 & 4096(0x1000, float:5.74E-42)
            if (r2 == 0) goto L_0x0186
            r0 = r0 | 384(0x180, float:5.38E-43)
            goto L_0x019a
        L_0x0186:
            r3 = r10 & 896(0x380, float:1.256E-42)
            if (r3 != 0) goto L_0x019a
            r3 = r62
            boolean r17 = r8.changed((java.lang.Object) r3)
            if (r17 == 0) goto L_0x0195
            r22 = 256(0x100, float:3.59E-43)
            goto L_0x0197
        L_0x0195:
            r22 = 128(0x80, float:1.794E-43)
        L_0x0197:
            r0 = r0 | r22
            goto L_0x019c
        L_0x019a:
            r3 = r62
        L_0x019c:
            r17 = 1533916891(0x5b6db6db, float:6.6910621E16)
            r3 = r1 & r17
            r5 = 306783378(0x12492492, float:6.3469493E-28)
            if (r3 != r5) goto L_0x01cc
            r3 = r0 & 731(0x2db, float:1.024E-42)
            r5 = 146(0x92, float:2.05E-43)
            if (r3 != r5) goto L_0x01cc
            boolean r3 = r8.getSkipping()
            if (r3 != 0) goto L_0x01b3
            goto L_0x01cc
        L_0x01b3:
            r8.skipToGroupEnd()
            r4 = r53
            r5 = r54
            r9 = r58
            r10 = r59
            r11 = r60
            r12 = r61
            r13 = r62
            r7 = r6
            r30 = r8
            r8 = r14
            r6 = r55
            goto L_0x041e
        L_0x01cc:
            r8.startDefaults()
            r3 = r11 & 1
            if (r3 == 0) goto L_0x020d
            boolean r3 = r8.getDefaultsInvalid()
            if (r3 == 0) goto L_0x01da
            goto L_0x020d
        L_0x01da:
            r8.skipToGroupEnd()
            r2 = r9 & 256(0x100, float:3.59E-43)
            if (r2 == 0) goto L_0x01e5
            r2 = -234881025(0xfffffffff1ffffff, float:-2.535301E30)
            r1 = r1 & r2
        L_0x01e5:
            r2 = r9 & 512(0x200, float:7.175E-43)
            if (r2 == 0) goto L_0x01ed
            r2 = -1879048193(0xffffffff8fffffff, float:-2.5243547E-29)
            r1 = r1 & r2
        L_0x01ed:
            r2 = r9 & 1024(0x400, float:1.435E-42)
            if (r2 == 0) goto L_0x01f3
            r0 = r0 & -15
        L_0x01f3:
            r2 = r9 & 2048(0x800, float:2.87E-42)
            if (r2 == 0) goto L_0x01f9
            r0 = r0 & -113(0xffffffffffffff8f, float:NaN)
        L_0x01f9:
            r19 = r53
            r7 = r54
            r48 = r55
            r21 = r58
            r22 = r59
            r23 = r60
            r5 = r61
            r24 = r62
            r20 = r14
            goto L_0x02fe
        L_0x020d:
            if (r4 == 0) goto L_0x0214
            androidx.compose.ui.Modifier$Companion r3 = androidx.compose.ui.Modifier.Companion
            androidx.compose.ui.Modifier r3 = (androidx.compose.ui.Modifier) r3
            goto L_0x0216
        L_0x0214:
            r3 = r53
        L_0x0216:
            if (r16 == 0) goto L_0x021a
            r4 = 1
            goto L_0x021c
        L_0x021a:
            r4 = r54
        L_0x021c:
            if (r18 == 0) goto L_0x0221
            r48 = 0
            goto L_0x0223
        L_0x0221:
            r48 = r55
        L_0x0223:
            if (r20 == 0) goto L_0x0226
            r6 = 0
        L_0x0226:
            if (r7 == 0) goto L_0x0229
            r14 = 0
        L_0x0229:
            r7 = r9 & 256(0x100, float:3.59E-43)
            if (r7 == 0) goto L_0x0239
            androidx.compose.material3.InputChipDefaults r7 = androidx.compose.material3.InputChipDefaults.INSTANCE
            r5 = 6
            androidx.compose.ui.graphics.Shape r7 = r7.getShape(r8, r5)
            r5 = -234881025(0xfffffffff1ffffff, float:-2.535301E30)
            r1 = r1 & r5
            goto L_0x023b
        L_0x0239:
            r7 = r58
        L_0x023b:
            r5 = r9 & 512(0x200, float:7.175E-43)
            if (r5 == 0) goto L_0x026d
            androidx.compose.material3.InputChipDefaults r16 = androidx.compose.material3.InputChipDefaults.INSTANCE
            r17 = 0
            r19 = 0
            r21 = 0
            r23 = 0
            r25 = 0
            r27 = 0
            r29 = 0
            r31 = 0
            r33 = 0
            r35 = 0
            r37 = 0
            r39 = 0
            r41 = 0
            r44 = 0
            r45 = 3072(0xc00, float:4.305E-42)
            r46 = 8191(0x1fff, float:1.1478E-41)
            r43 = r8
            androidx.compose.material3.SelectableChipColors r5 = r16.m1395inputChipColorskwJvTHA(r17, r19, r21, r23, r25, r27, r29, r31, r33, r35, r37, r39, r41, r43, r44, r45, r46)
            r16 = -1879048193(0xffffffff8fffffff, float:-2.5243547E-29)
            r1 = r1 & r16
            goto L_0x026f
        L_0x026d:
            r5 = r59
        L_0x026f:
            r53 = r1
            r1 = r9 & 1024(0x400, float:1.435E-42)
            if (r1 == 0) goto L_0x0290
            androidx.compose.material3.InputChipDefaults r16 = androidx.compose.material3.InputChipDefaults.INSTANCE
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r24 = 1572864(0x180000, float:2.204052E-39)
            r25 = 63
            r23 = r8
            androidx.compose.material3.SelectableChipElevation r1 = r16.m1396inputChipElevationaqJV_2Y(r17, r18, r19, r20, r21, r22, r23, r24, r25)
            r0 = r0 & -15
            goto L_0x0292
        L_0x0290:
            r1 = r60
        L_0x0292:
            r54 = r1
            r1 = r9 & 2048(0x800, float:2.87E-42)
            if (r1 == 0) goto L_0x02b3
            androidx.compose.material3.InputChipDefaults r16 = androidx.compose.material3.InputChipDefaults.INSTANCE
            r17 = 0
            r19 = 0
            r21 = 0
            r23 = 0
            r25 = 0
            r26 = 0
            r28 = 1572864(0x180000, float:2.204052E-39)
            r29 = 63
            r27 = r8
            androidx.compose.material3.SelectableChipBorder r1 = r16.m1394inputChipBordergHcDVlo(r17, r19, r21, r23, r25, r26, r27, r28, r29)
            r0 = r0 & -113(0xffffffffffffff8f, float:NaN)
            goto L_0x02b5
        L_0x02b3:
            r1 = r61
        L_0x02b5:
            if (r2 == 0) goto L_0x02ec
            r2 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r8.startReplaceableGroup(r2)
            java.lang.String r2 = "CC(remember):Composables.kt#9igjgp"
            androidx.compose.runtime.ComposerKt.sourceInformation(r8, r2)
            java.lang.Object r2 = r8.rememberedValue()
            androidx.compose.runtime.Composer$Companion r16 = androidx.compose.runtime.Composer.Companion
            r55 = r0
            java.lang.Object r0 = r16.getEmpty()
            if (r2 != r0) goto L_0x02d7
            androidx.compose.foundation.interaction.MutableInteractionSource r2 = androidx.compose.foundation.interaction.InteractionSourceKt.MutableInteractionSource()
            r8.updateRememberedValue(r2)
        L_0x02d7:
            r8.endReplaceableGroup()
            r0 = r2
            androidx.compose.foundation.interaction.MutableInteractionSource r0 = (androidx.compose.foundation.interaction.MutableInteractionSource) r0
            r23 = r54
            r24 = r0
            r19 = r3
            r22 = r5
            r21 = r7
            r20 = r14
            r0 = r55
            goto L_0x02fa
        L_0x02ec:
            r55 = r0
            r23 = r54
            r24 = r62
            r19 = r3
            r22 = r5
            r21 = r7
            r20 = r14
        L_0x02fa:
            r5 = r1
            r7 = r4
            r1 = r53
        L_0x02fe:
            r8.endDefaults()
            boolean r2 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r2 == 0) goto L_0x0310
            java.lang.String r2 = "androidx.compose.material3.InputChip (Chip.kt:419)"
            r3 = -1599030387(0xffffffffa0b0bb8d, float:-2.993967E-19)
            androidx.compose.runtime.ComposerKt.traceEventStart(r3, r1, r0, r2)
        L_0x0310:
            r2 = -1372002056(0xffffffffae38e8f8, float:-4.2043674E-11)
            r8.startReplaceableGroup(r2)
            java.lang.String r2 = "439@22510L9"
            androidx.compose.runtime.ComposerKt.sourceInformation(r8, r2)
            if (r6 == 0) goto L_0x0342
            if (r7 == 0) goto L_0x0322
            r2 = 1065353216(0x3f800000, float:1.0)
            goto L_0x0325
        L_0x0322:
            r2 = 1052938076(0x3ec28f5c, float:0.38)
        L_0x0325:
            androidx.compose.material3.tokens.InputChipTokens r3 = androidx.compose.material3.tokens.InputChipTokens.INSTANCE
            androidx.compose.material3.tokens.ShapeKeyTokens r3 = r3.getAvatarShape()
            r4 = 6
            androidx.compose.ui.graphics.Shape r3 = androidx.compose.material3.ShapesKt.toShape(r3, r8, r4)
            androidx.compose.material3.ChipKt$InputChip$2 r14 = new androidx.compose.material3.ChipKt$InputChip$2
            r14.<init>(r2, r3, r6, r1)
            r2 = -352359235(0xffffffffeaff6cbd, float:-1.5439479E26)
            r3 = 1
            androidx.compose.runtime.internal.ComposableLambda r2 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(r8, r2, r3, r14)
            kotlin.jvm.functions.Function2 r2 = (kotlin.jvm.functions.Function2) r2
            r16 = r2
            goto L_0x0346
        L_0x0342:
            r3 = 1
            r4 = 6
            r16 = 0
        L_0x0346:
            r8.endReplaceableGroup()
            androidx.compose.material3.MaterialTheme r2 = androidx.compose.material3.MaterialTheme.INSTANCE
            androidx.compose.material3.Typography r2 = r2.getTypography(r8, r4)
            androidx.compose.material3.tokens.InputChipTokens r4 = androidx.compose.material3.tokens.InputChipTokens.INSTANCE
            androidx.compose.material3.tokens.TypographyKeyTokens r4 = r4.getLabelTextFont()
            androidx.compose.ui.text.TextStyle r25 = androidx.compose.material3.TypographyKt.fromToken(r2, r4)
            r2 = -1372001052(0xffffffffae38ece4, float:-4.2047157E-11)
            r8.startReplaceableGroup(r2)
            java.lang.String r2 = "466@23351L31"
            androidx.compose.runtime.ComposerKt.sourceInformation(r8, r2)
            if (r5 != 0) goto L_0x0368
            r2 = 0
            goto L_0x037a
        L_0x0368:
            int r2 = r1 >> 12
            r2 = r2 & 14
            int r4 = r1 << 3
            r4 = r4 & 112(0x70, float:1.57E-43)
            r2 = r2 | r4
            int r4 = r0 << 3
            r4 = r4 & 896(0x380, float:1.256E-42)
            r2 = r2 | r4
            androidx.compose.runtime.State r2 = r5.borderStroke$material3_release(r7, r15, r8, r2)
        L_0x037a:
            r8.endReplaceableGroup()
            if (r2 == 0) goto L_0x0388
            java.lang.Object r2 = r2.getValue()
            androidx.compose.foundation.BorderStroke r2 = (androidx.compose.foundation.BorderStroke) r2
            r26 = r2
            goto L_0x038a
        L_0x0388:
            r26 = 0
        L_0x038a:
            androidx.compose.material3.InputChipDefaults r2 = androidx.compose.material3.InputChipDefaults.INSTANCE
            float r27 = r2.m1392getHeightD9Ej5fM()
            r2 = 0
            if (r16 == 0) goto L_0x0395
            r4 = r3
            goto L_0x0396
        L_0x0395:
            r4 = r2
        L_0x0396:
            if (r48 == 0) goto L_0x039a
            r14 = r3
            goto L_0x039b
        L_0x039a:
            r14 = r2
        L_0x039b:
            if (r20 == 0) goto L_0x039e
            r2 = r3
        L_0x039e:
            androidx.compose.foundation.layout.PaddingValues r14 = inputChipPadding(r4, r14, r2)
            r2 = r1 & 14
            int r3 = r1 >> 6
            r3 = r3 & 112(0x70, float:1.57E-43)
            r2 = r2 | r3
            int r3 = r1 << 3
            r4 = r3 & 896(0x380, float:1.256E-42)
            r2 = r2 | r4
            int r4 = r1 >> 3
            r4 = r4 & 7168(0x1c00, float:1.0045E-41)
            r2 = r2 | r4
            int r4 = r1 << 6
            r4 = r4 & r47
            r2 = r2 | r4
            r4 = 3670016(0x380000, float:5.142788E-39)
            r4 = r4 & r3
            r2 = r2 | r4
            r4 = 234881024(0xe000000, float:1.5777218E-30)
            r4 = r4 & r3
            r2 = r2 | r4
            r4 = 1879048192(0x70000000, float:1.58456325E29)
            r3 = r3 & r4
            r17 = r2 | r3
            int r1 = r1 >> 27
            r1 = r1 & 14
            r1 = r1 | 3072(0xc00, float:4.305E-42)
            int r2 = r0 << 3
            r2 = r2 & 112(0x70, float:1.57E-43)
            r1 = r1 | r2
            int r0 = r0 << 9
            r2 = 458752(0x70000, float:6.42848E-40)
            r0 = r0 & r2
            r18 = r1 | r0
            r0 = r50
            r1 = r19
            r2 = r51
            r3 = r7
            r4 = r52
            r28 = r5
            r5 = r25
            r25 = r6
            r6 = r48
            r29 = r7
            r7 = r16
            r30 = r8
            r8 = r20
            r9 = r21
            r10 = r22
            r11 = r23
            r12 = r26
            r13 = r27
            r15 = r24
            r16 = r30
            m1175SelectableChipu0RnIRE(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto L_0x040a
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L_0x040a:
            r4 = r19
            r8 = r20
            r9 = r21
            r10 = r22
            r11 = r23
            r13 = r24
            r7 = r25
            r12 = r28
            r5 = r29
            r6 = r48
        L_0x041e:
            androidx.compose.runtime.ScopeUpdateScope r15 = r30.endRestartGroup()
            if (r15 != 0) goto L_0x0425
            goto L_0x0443
        L_0x0425:
            androidx.compose.material3.ChipKt$InputChip$3 r17 = new androidx.compose.material3.ChipKt$InputChip$3
            r0 = r17
            r1 = r50
            r2 = r51
            r3 = r52
            r14 = r64
            r49 = r15
            r15 = r65
            r16 = r66
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            r0 = r17
            kotlin.jvm.functions.Function2 r0 = (kotlin.jvm.functions.Function2) r0
            r1 = r49
            r1.updateScope(r0)
        L_0x0443:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.ChipKt.InputChip(boolean, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function2, androidx.compose.ui.Modifier, boolean, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, androidx.compose.ui.graphics.Shape, androidx.compose.material3.SelectableChipColors, androidx.compose.material3.SelectableChipElevation, androidx.compose.material3.SelectableChipBorder, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:100:0x0121  */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x012a  */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x0150  */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x0162  */
    /* JADX WARNING: Removed duplicated region for block: B:178:0x0356  */
    /* JADX WARNING: Removed duplicated region for block: B:180:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0073  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x008f  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0092  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00ac  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00c1  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00c9  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x00de  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x00e5  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x00fb  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x0103  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x0119  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void SuggestionChip(kotlin.jvm.functions.Function0<kotlin.Unit> r41, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r42, androidx.compose.ui.Modifier r43, boolean r44, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r45, androidx.compose.ui.graphics.Shape r46, androidx.compose.material3.ChipColors r47, androidx.compose.material3.ChipElevation r48, androidx.compose.material3.ChipBorder r49, androidx.compose.foundation.interaction.MutableInteractionSource r50, androidx.compose.runtime.Composer r51, int r52, int r53) {
        /*
            r15 = r41
            r12 = r42
            r11 = r52
            r10 = r53
            java.lang.String r0 = "onClick"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r15, r0)
            java.lang.String r0 = "label"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r0)
            r0 = 170629701(0xa2b9a45, float:8.2623654E-33)
            r1 = r51
            androidx.compose.runtime.Composer r14 = r1.startRestartGroup(r0)
            java.lang.String r1 = "C(SuggestionChip)P(8,6,7,3,4,9,1,2)523@26368L5,524@26423L22,525@26502L25,526@26578L22,527@26652L39,533@26828L10,534@26910L19,528@26697L540:Chip.kt#uh7d8r"
            androidx.compose.runtime.ComposerKt.sourceInformation(r14, r1)
            r1 = r10 & 1
            if (r1 == 0) goto L_0x0029
            r1 = r11 | 6
            goto L_0x0039
        L_0x0029:
            r1 = r11 & 14
            if (r1 != 0) goto L_0x0038
            boolean r1 = r14.changedInstance(r15)
            if (r1 == 0) goto L_0x0035
            r1 = 4
            goto L_0x0036
        L_0x0035:
            r1 = 2
        L_0x0036:
            r1 = r1 | r11
            goto L_0x0039
        L_0x0038:
            r1 = r11
        L_0x0039:
            r2 = r10 & 2
            if (r2 == 0) goto L_0x0040
            r1 = r1 | 48
            goto L_0x0050
        L_0x0040:
            r2 = r11 & 112(0x70, float:1.57E-43)
            if (r2 != 0) goto L_0x0050
            boolean r2 = r14.changedInstance(r12)
            if (r2 == 0) goto L_0x004d
            r2 = 32
            goto L_0x004f
        L_0x004d:
            r2 = 16
        L_0x004f:
            r1 = r1 | r2
        L_0x0050:
            r2 = r10 & 4
            if (r2 == 0) goto L_0x0057
            r1 = r1 | 384(0x180, float:5.38E-43)
            goto L_0x006a
        L_0x0057:
            r3 = r11 & 896(0x380, float:1.256E-42)
            if (r3 != 0) goto L_0x006a
            r3 = r43
            boolean r4 = r14.changed((java.lang.Object) r3)
            if (r4 == 0) goto L_0x0066
            r4 = 256(0x100, float:3.59E-43)
            goto L_0x0068
        L_0x0066:
            r4 = 128(0x80, float:1.794E-43)
        L_0x0068:
            r1 = r1 | r4
            goto L_0x006c
        L_0x006a:
            r3 = r43
        L_0x006c:
            r4 = r10 & 8
            if (r4 == 0) goto L_0x0073
            r1 = r1 | 3072(0xc00, float:4.305E-42)
            goto L_0x0086
        L_0x0073:
            r5 = r11 & 7168(0x1c00, float:1.0045E-41)
            if (r5 != 0) goto L_0x0086
            r5 = r44
            boolean r6 = r14.changed((boolean) r5)
            if (r6 == 0) goto L_0x0082
            r6 = 2048(0x800, float:2.87E-42)
            goto L_0x0084
        L_0x0082:
            r6 = 1024(0x400, float:1.435E-42)
        L_0x0084:
            r1 = r1 | r6
            goto L_0x0088
        L_0x0086:
            r5 = r44
        L_0x0088:
            r6 = r10 & 16
            r32 = 57344(0xe000, float:8.0356E-41)
            if (r6 == 0) goto L_0x0092
            r1 = r1 | 24576(0x6000, float:3.4438E-41)
            goto L_0x00a5
        L_0x0092:
            r7 = r11 & r32
            if (r7 != 0) goto L_0x00a5
            r7 = r45
            boolean r8 = r14.changedInstance(r7)
            if (r8 == 0) goto L_0x00a1
            r8 = 16384(0x4000, float:2.2959E-41)
            goto L_0x00a3
        L_0x00a1:
            r8 = 8192(0x2000, float:1.14794E-41)
        L_0x00a3:
            r1 = r1 | r8
            goto L_0x00a7
        L_0x00a5:
            r7 = r45
        L_0x00a7:
            r8 = 458752(0x70000, float:6.42848E-40)
            r8 = r8 & r11
            if (r8 != 0) goto L_0x00c1
            r8 = r10 & 32
            if (r8 != 0) goto L_0x00bb
            r8 = r46
            boolean r9 = r14.changed((java.lang.Object) r8)
            if (r9 == 0) goto L_0x00bd
            r9 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00bf
        L_0x00bb:
            r8 = r46
        L_0x00bd:
            r9 = 65536(0x10000, float:9.18355E-41)
        L_0x00bf:
            r1 = r1 | r9
            goto L_0x00c3
        L_0x00c1:
            r8 = r46
        L_0x00c3:
            r33 = 3670016(0x380000, float:5.142788E-39)
            r9 = r11 & r33
            if (r9 != 0) goto L_0x00de
            r9 = r10 & 64
            if (r9 != 0) goto L_0x00d8
            r9 = r47
            boolean r13 = r14.changed((java.lang.Object) r9)
            if (r13 == 0) goto L_0x00da
            r13 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00dc
        L_0x00d8:
            r9 = r47
        L_0x00da:
            r13 = 524288(0x80000, float:7.34684E-40)
        L_0x00dc:
            r1 = r1 | r13
            goto L_0x00e0
        L_0x00de:
            r9 = r47
        L_0x00e0:
            r13 = 29360128(0x1c00000, float:7.052966E-38)
            r13 = r13 & r11
            if (r13 != 0) goto L_0x00fb
            r13 = r10 & 128(0x80, float:1.794E-43)
            if (r13 != 0) goto L_0x00f4
            r13 = r48
            boolean r16 = r14.changed((java.lang.Object) r13)
            if (r16 == 0) goto L_0x00f6
            r16 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00f8
        L_0x00f4:
            r13 = r48
        L_0x00f6:
            r16 = 4194304(0x400000, float:5.877472E-39)
        L_0x00f8:
            r1 = r1 | r16
            goto L_0x00fd
        L_0x00fb:
            r13 = r48
        L_0x00fd:
            r34 = 234881024(0xe000000, float:1.5777218E-30)
            r16 = r11 & r34
            if (r16 != 0) goto L_0x0119
            r0 = r10 & 256(0x100, float:3.59E-43)
            if (r0 != 0) goto L_0x0112
            r0 = r49
            boolean r16 = r14.changed((java.lang.Object) r0)
            if (r16 == 0) goto L_0x0114
            r16 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x0116
        L_0x0112:
            r0 = r49
        L_0x0114:
            r16 = 33554432(0x2000000, float:9.403955E-38)
        L_0x0116:
            r1 = r1 | r16
            goto L_0x011b
        L_0x0119:
            r0 = r49
        L_0x011b:
            r9 = r10 & 512(0x200, float:7.175E-43)
            r35 = 1879048192(0x70000000, float:1.58456325E29)
            if (r9 == 0) goto L_0x012a
            r16 = 805306368(0x30000000, float:4.656613E-10)
            r1 = r1 | r16
            r51 = r9
            r9 = r50
            goto L_0x013f
        L_0x012a:
            r16 = r11 & r35
            r51 = r9
            r9 = r50
            if (r16 != 0) goto L_0x013f
            boolean r16 = r14.changed((java.lang.Object) r9)
            if (r16 == 0) goto L_0x013b
            r16 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x013d
        L_0x013b:
            r16 = 268435456(0x10000000, float:2.5243549E-29)
        L_0x013d:
            r1 = r1 | r16
        L_0x013f:
            r16 = 1533916891(0x5b6db6db, float:6.6910621E16)
            r0 = r1 & r16
            r3 = 306783378(0x12492492, float:6.3469493E-28)
            if (r0 != r3) goto L_0x0162
            boolean r0 = r14.getSkipping()
            if (r0 != 0) goto L_0x0150
            goto L_0x0162
        L_0x0150:
            r14.skipToGroupEnd()
            r3 = r43
            r4 = r5
            r5 = r7
            r6 = r8
            r10 = r9
            r8 = r13
            r22 = r14
            r7 = r47
            r9 = r49
            goto L_0x034f
        L_0x0162:
            r14.startDefaults()
            r0 = r11 & 1
            r3 = -29360129(0xfffffffffe3fffff, float:-6.380294E37)
            r36 = -3670017(0xffffffffffc7ffff, float:NaN)
            r16 = -458753(0xfffffffffff8ffff, float:NaN)
            r37 = 0
            r9 = 6
            if (r0 == 0) goto L_0x01aa
            boolean r0 = r14.getDefaultsInvalid()
            if (r0 == 0) goto L_0x017c
            goto L_0x01aa
        L_0x017c:
            r14.skipToGroupEnd()
            r0 = r10 & 32
            if (r0 == 0) goto L_0x0185
            r1 = r1 & r16
        L_0x0185:
            r0 = r10 & 64
            if (r0 == 0) goto L_0x018b
            r1 = r1 & r36
        L_0x018b:
            r0 = r10 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x0190
            r1 = r1 & r3
        L_0x0190:
            r0 = r10 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L_0x0198
            r0 = -234881025(0xfffffffff1ffffff, float:-2.535301E30)
            r1 = r1 & r0
        L_0x0198:
            r19 = r43
            r21 = r50
            r39 = r7
            r40 = r8
            r0 = r9
            r20 = r13
            r8 = r47
            r7 = r49
            r9 = r5
            goto L_0x027b
        L_0x01aa:
            if (r2 == 0) goto L_0x01b1
            androidx.compose.ui.Modifier$Companion r0 = androidx.compose.ui.Modifier.Companion
            androidx.compose.ui.Modifier r0 = (androidx.compose.ui.Modifier) r0
            goto L_0x01b3
        L_0x01b1:
            r0 = r43
        L_0x01b3:
            if (r4 == 0) goto L_0x01b9
            r2 = 1
            r38 = r2
            goto L_0x01bb
        L_0x01b9:
            r38 = r5
        L_0x01bb:
            if (r6 == 0) goto L_0x01c0
            r39 = r37
            goto L_0x01c2
        L_0x01c0:
            r39 = r7
        L_0x01c2:
            r2 = r10 & 32
            if (r2 == 0) goto L_0x01d1
            androidx.compose.material3.SuggestionChipDefaults r2 = androidx.compose.material3.SuggestionChipDefaults.INSTANCE
            androidx.compose.ui.graphics.Shape r2 = r2.getShape(r14, r9)
            r1 = r1 & r16
            r40 = r2
            goto L_0x01d3
        L_0x01d1:
            r40 = r8
        L_0x01d3:
            r2 = r10 & 64
            if (r2 == 0) goto L_0x01f4
            androidx.compose.material3.SuggestionChipDefaults r16 = androidx.compose.material3.SuggestionChipDefaults.INSTANCE
            r17 = 0
            r19 = 0
            r21 = 0
            r23 = 0
            r25 = 0
            r27 = 0
            r30 = 1572864(0x180000, float:2.204052E-39)
            r31 = 63
            r29 = r14
            androidx.compose.material3.ChipColors r2 = r16.m1639suggestionChipColors5tl4gsc(r17, r19, r21, r23, r25, r27, r29, r30, r31)
            r1 = r1 & r36
            r26 = r2
            goto L_0x01f6
        L_0x01f4:
            r26 = r47
        L_0x01f6:
            r2 = r10 & 128(0x80, float:1.794E-43)
            if (r2 == 0) goto L_0x0217
            androidx.compose.material3.SuggestionChipDefaults r16 = androidx.compose.material3.SuggestionChipDefaults.INSTANCE
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r24 = 1572864(0x180000, float:2.204052E-39)
            r25 = 63
            r23 = r14
            androidx.compose.material3.ChipElevation r2 = r16.m1640suggestionChipElevationaqJV_2Y(r17, r18, r19, r20, r21, r22, r23, r24, r25)
            r1 = r1 & r3
            r16 = r1
            r13 = r2
            goto L_0x0219
        L_0x0217:
            r16 = r1
        L_0x0219:
            r1 = r10 & 256(0x100, float:3.59E-43)
            if (r1 == 0) goto L_0x023c
            androidx.compose.material3.SuggestionChipDefaults r1 = androidx.compose.material3.SuggestionChipDefaults.INSTANCE
            r2 = 0
            r4 = 0
            r6 = 0
            r8 = 3072(0xc00, float:4.305E-42)
            r17 = 7
            r7 = r14
            r18 = r51
            r43 = r0
            r0 = r9
            r9 = r17
            androidx.compose.material3.ChipBorder r1 = r1.m1638suggestionChipBorderd_3_b6Q(r2, r4, r6, r7, r8, r9)
            r2 = -234881025(0xfffffffff1ffffff, float:-2.535301E30)
            r2 = r16 & r2
            r16 = r2
            goto L_0x0243
        L_0x023c:
            r18 = r51
            r43 = r0
            r0 = r9
            r1 = r49
        L_0x0243:
            if (r18 == 0) goto L_0x026e
            r2 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r14.startReplaceableGroup(r2)
            java.lang.String r2 = "CC(remember):Composables.kt#9igjgp"
            androidx.compose.runtime.ComposerKt.sourceInformation(r14, r2)
            java.lang.Object r2 = r14.rememberedValue()
            androidx.compose.runtime.Composer$Companion r3 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r3 = r3.getEmpty()
            if (r2 != r3) goto L_0x0263
            androidx.compose.foundation.interaction.MutableInteractionSource r2 = androidx.compose.foundation.interaction.InteractionSourceKt.MutableInteractionSource()
            r14.updateRememberedValue(r2)
        L_0x0263:
            r14.endReplaceableGroup()
            androidx.compose.foundation.interaction.MutableInteractionSource r2 = (androidx.compose.foundation.interaction.MutableInteractionSource) r2
            r19 = r43
            r7 = r1
            r21 = r2
            goto L_0x0273
        L_0x026e:
            r19 = r43
            r21 = r50
            r7 = r1
        L_0x0273:
            r20 = r13
            r1 = r16
            r8 = r26
            r9 = r38
        L_0x027b:
            r14.endDefaults()
            boolean r2 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r2 == 0) goto L_0x028e
            r2 = -1
            java.lang.String r3 = "androidx.compose.material3.SuggestionChip (Chip.kt:517)"
            r4 = 170629701(0xa2b9a45, float:8.2623654E-33)
            androidx.compose.runtime.ComposerKt.traceEventStart(r4, r1, r2, r3)
        L_0x028e:
            androidx.compose.material3.MaterialTheme r2 = androidx.compose.material3.MaterialTheme.INSTANCE
            androidx.compose.material3.Typography r0 = r2.getTypography(r14, r0)
            androidx.compose.material3.tokens.SuggestionChipTokens r2 = androidx.compose.material3.tokens.SuggestionChipTokens.INSTANCE
            androidx.compose.material3.tokens.TypographyKeyTokens r2 = r2.getLabelTextFont()
            androidx.compose.ui.text.TextStyle r4 = androidx.compose.material3.TypographyKt.fromToken(r0, r2)
            int r0 = r1 >> 9
            r0 = r0 & 14
            int r2 = r1 >> 15
            r3 = r2 & 112(0x70, float:1.57E-43)
            r3 = r3 | r0
            androidx.compose.runtime.State r3 = r8.labelColor$material3_release(r9, r14, r3)
            java.lang.Object r3 = r3.getValue()
            androidx.compose.ui.graphics.Color r3 = (androidx.compose.ui.graphics.Color) r3
            long r5 = r3.m2831unboximpl()
            r16 = 0
            r3 = 2118455055(0x7e450f0f, float:6.5484026E37)
            r14.startReplaceableGroup(r3)
            java.lang.String r3 = "540@27074L21"
            androidx.compose.runtime.ComposerKt.sourceInformation(r14, r3)
            if (r7 != 0) goto L_0x02c7
            r0 = r37
            goto L_0x02d0
        L_0x02c7:
            int r3 = r1 >> 21
            r3 = r3 & 112(0x70, float:1.57E-43)
            r0 = r0 | r3
            androidx.compose.runtime.State r0 = r7.borderStroke$material3_release(r9, r14, r0)
        L_0x02d0:
            r14.endReplaceableGroup()
            if (r0 == 0) goto L_0x02dd
            java.lang.Object r0 = r0.getValue()
            androidx.compose.foundation.BorderStroke r0 = (androidx.compose.foundation.BorderStroke) r0
            r37 = r0
        L_0x02dd:
            androidx.compose.material3.SuggestionChipDefaults r0 = androidx.compose.material3.SuggestionChipDefaults.INSTANCE
            float r13 = r0.m1636getHeightD9Ej5fM()
            androidx.compose.foundation.layout.PaddingValues r0 = SuggestionChipPadding
            r22 = r14
            r14 = r0
            int r0 = r1 >> 6
            r0 = r0 & 14
            r3 = 12582912(0xc00000, float:1.7632415E-38)
            r0 = r0 | r3
            int r3 = r1 << 3
            r3 = r3 & 112(0x70, float:1.57E-43)
            r0 = r0 | r3
            int r3 = r1 >> 3
            r3 = r3 & 896(0x380, float:1.256E-42)
            r0 = r0 | r3
            int r3 = r1 << 6
            r43 = r7
            r7 = r3 & 7168(0x1c00, float:1.0045E-41)
            r0 = r0 | r7
            r3 = r3 & r33
            r0 = r0 | r3
            int r3 = r1 << 9
            r7 = r3 & r34
            r0 = r0 | r7
            r3 = r3 & r35
            r17 = r0 | r3
            int r0 = r1 >> 21
            r0 = r0 & 14
            r0 = r0 | 3456(0xd80, float:4.843E-42)
            r1 = r2 & r32
            r18 = r0 | r1
            r0 = r19
            r1 = r41
            r2 = r9
            r3 = r42
            r23 = r43
            r7 = r39
            r26 = r8
            r8 = r16
            r38 = r9
            r9 = r40
            r10 = r26
            r11 = r20
            r12 = r37
            r15 = r21
            r16 = r22
            m1173ChipnkUnTEs(r0, r1, r2, r3, r4, r5, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto L_0x033f
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L_0x033f:
            r3 = r19
            r8 = r20
            r10 = r21
            r9 = r23
            r7 = r26
            r4 = r38
            r5 = r39
            r6 = r40
        L_0x034f:
            androidx.compose.runtime.ScopeUpdateScope r13 = r22.endRestartGroup()
            if (r13 != 0) goto L_0x0356
            goto L_0x0369
        L_0x0356:
            androidx.compose.material3.ChipKt$SuggestionChip$2 r14 = new androidx.compose.material3.ChipKt$SuggestionChip$2
            r0 = r14
            r1 = r41
            r2 = r42
            r11 = r52
            r12 = r53
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            kotlin.jvm.functions.Function2 r14 = (kotlin.jvm.functions.Function2) r14
            r13.updateScope(r14)
        L_0x0369:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.ChipKt.SuggestionChip(kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function2, androidx.compose.ui.Modifier, boolean, kotlin.jvm.functions.Function2, androidx.compose.ui.graphics.Shape, androidx.compose.material3.ChipColors, androidx.compose.material3.ChipElevation, androidx.compose.material3.ChipBorder, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:100:0x012c  */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x0152  */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x0164  */
    /* JADX WARNING: Removed duplicated region for block: B:174:0x032f  */
    /* JADX WARNING: Removed duplicated region for block: B:176:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0073  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x008f  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0092  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00ac  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00c1  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00c9  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x00de  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x00e5  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x00fb  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x0103  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x010a  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x0123  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void ElevatedSuggestionChip(kotlin.jvm.functions.Function0<kotlin.Unit> r42, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r43, androidx.compose.ui.Modifier r44, boolean r45, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r46, androidx.compose.ui.graphics.Shape r47, androidx.compose.material3.ChipColors r48, androidx.compose.material3.ChipElevation r49, androidx.compose.material3.ChipBorder r50, androidx.compose.foundation.interaction.MutableInteractionSource r51, androidx.compose.runtime.Composer r52, int r53, int r54) {
        /*
            r15 = r42
            r14 = r43
            r13 = r53
            r12 = r54
            java.lang.String r0 = "onClick"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r15, r0)
            java.lang.String r0 = "label"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r14, r0)
            r0 = 1668751803(0x637721bb, float:4.5587763E21)
            r1 = r52
            androidx.compose.runtime.Composer r11 = r1.startRestartGroup(r0)
            java.lang.String r1 = "C(ElevatedSuggestionChip)P(8,6,7,3,4,9,1,2)591@29894L5,592@29949L30,593@30036L33,595@30153L39,601@30329L10,602@30411L19,596@30198L540:Chip.kt#uh7d8r"
            androidx.compose.runtime.ComposerKt.sourceInformation(r11, r1)
            r1 = r12 & 1
            if (r1 == 0) goto L_0x0029
            r1 = r13 | 6
            goto L_0x0039
        L_0x0029:
            r1 = r13 & 14
            if (r1 != 0) goto L_0x0038
            boolean r1 = r11.changedInstance(r15)
            if (r1 == 0) goto L_0x0035
            r1 = 4
            goto L_0x0036
        L_0x0035:
            r1 = 2
        L_0x0036:
            r1 = r1 | r13
            goto L_0x0039
        L_0x0038:
            r1 = r13
        L_0x0039:
            r2 = r12 & 2
            if (r2 == 0) goto L_0x0040
            r1 = r1 | 48
            goto L_0x0050
        L_0x0040:
            r2 = r13 & 112(0x70, float:1.57E-43)
            if (r2 != 0) goto L_0x0050
            boolean r2 = r11.changedInstance(r14)
            if (r2 == 0) goto L_0x004d
            r2 = 32
            goto L_0x004f
        L_0x004d:
            r2 = 16
        L_0x004f:
            r1 = r1 | r2
        L_0x0050:
            r2 = r12 & 4
            if (r2 == 0) goto L_0x0057
            r1 = r1 | 384(0x180, float:5.38E-43)
            goto L_0x006a
        L_0x0057:
            r3 = r13 & 896(0x380, float:1.256E-42)
            if (r3 != 0) goto L_0x006a
            r3 = r44
            boolean r4 = r11.changed((java.lang.Object) r3)
            if (r4 == 0) goto L_0x0066
            r4 = 256(0x100, float:3.59E-43)
            goto L_0x0068
        L_0x0066:
            r4 = 128(0x80, float:1.794E-43)
        L_0x0068:
            r1 = r1 | r4
            goto L_0x006c
        L_0x006a:
            r3 = r44
        L_0x006c:
            r4 = r12 & 8
            if (r4 == 0) goto L_0x0073
            r1 = r1 | 3072(0xc00, float:4.305E-42)
            goto L_0x0086
        L_0x0073:
            r5 = r13 & 7168(0x1c00, float:1.0045E-41)
            if (r5 != 0) goto L_0x0086
            r5 = r45
            boolean r6 = r11.changed((boolean) r5)
            if (r6 == 0) goto L_0x0082
            r6 = 2048(0x800, float:2.87E-42)
            goto L_0x0084
        L_0x0082:
            r6 = 1024(0x400, float:1.435E-42)
        L_0x0084:
            r1 = r1 | r6
            goto L_0x0088
        L_0x0086:
            r5 = r45
        L_0x0088:
            r6 = r12 & 16
            r32 = 57344(0xe000, float:8.0356E-41)
            if (r6 == 0) goto L_0x0092
            r1 = r1 | 24576(0x6000, float:3.4438E-41)
            goto L_0x00a5
        L_0x0092:
            r7 = r13 & r32
            if (r7 != 0) goto L_0x00a5
            r7 = r46
            boolean r8 = r11.changedInstance(r7)
            if (r8 == 0) goto L_0x00a1
            r8 = 16384(0x4000, float:2.2959E-41)
            goto L_0x00a3
        L_0x00a1:
            r8 = 8192(0x2000, float:1.14794E-41)
        L_0x00a3:
            r1 = r1 | r8
            goto L_0x00a7
        L_0x00a5:
            r7 = r46
        L_0x00a7:
            r8 = 458752(0x70000, float:6.42848E-40)
            r8 = r8 & r13
            if (r8 != 0) goto L_0x00c1
            r8 = r12 & 32
            if (r8 != 0) goto L_0x00bb
            r8 = r47
            boolean r9 = r11.changed((java.lang.Object) r8)
            if (r9 == 0) goto L_0x00bd
            r9 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00bf
        L_0x00bb:
            r8 = r47
        L_0x00bd:
            r9 = 65536(0x10000, float:9.18355E-41)
        L_0x00bf:
            r1 = r1 | r9
            goto L_0x00c3
        L_0x00c1:
            r8 = r47
        L_0x00c3:
            r33 = 3670016(0x380000, float:5.142788E-39)
            r9 = r13 & r33
            if (r9 != 0) goto L_0x00de
            r9 = r12 & 64
            if (r9 != 0) goto L_0x00d8
            r9 = r48
            boolean r10 = r11.changed((java.lang.Object) r9)
            if (r10 == 0) goto L_0x00da
            r10 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00dc
        L_0x00d8:
            r9 = r48
        L_0x00da:
            r10 = 524288(0x80000, float:7.34684E-40)
        L_0x00dc:
            r1 = r1 | r10
            goto L_0x00e0
        L_0x00de:
            r9 = r48
        L_0x00e0:
            r10 = 29360128(0x1c00000, float:7.052966E-38)
            r10 = r10 & r13
            if (r10 != 0) goto L_0x00fb
            r10 = r12 & 128(0x80, float:1.794E-43)
            if (r10 != 0) goto L_0x00f4
            r10 = r49
            boolean r16 = r11.changed((java.lang.Object) r10)
            if (r16 == 0) goto L_0x00f6
            r16 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00f8
        L_0x00f4:
            r10 = r49
        L_0x00f6:
            r16 = 4194304(0x400000, float:5.877472E-39)
        L_0x00f8:
            r1 = r1 | r16
            goto L_0x00fd
        L_0x00fb:
            r10 = r49
        L_0x00fd:
            r0 = r12 & 256(0x100, float:3.59E-43)
            r34 = 234881024(0xe000000, float:1.5777218E-30)
            if (r0 == 0) goto L_0x010a
            r16 = 100663296(0x6000000, float:2.4074124E-35)
            r1 = r1 | r16
            r10 = r50
            goto L_0x011d
        L_0x010a:
            r16 = r13 & r34
            r10 = r50
            if (r16 != 0) goto L_0x011d
            boolean r16 = r11.changed((java.lang.Object) r10)
            if (r16 == 0) goto L_0x0119
            r16 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x011b
        L_0x0119:
            r16 = 33554432(0x2000000, float:9.403955E-38)
        L_0x011b:
            r1 = r1 | r16
        L_0x011d:
            r10 = r12 & 512(0x200, float:7.175E-43)
            r35 = 1879048192(0x70000000, float:1.58456325E29)
            if (r10 == 0) goto L_0x012c
            r16 = 805306368(0x30000000, float:4.656613E-10)
            r1 = r1 | r16
            r52 = r10
            r10 = r51
            goto L_0x0141
        L_0x012c:
            r16 = r13 & r35
            r52 = r10
            r10 = r51
            if (r16 != 0) goto L_0x0141
            boolean r16 = r11.changed((java.lang.Object) r10)
            if (r16 == 0) goto L_0x013d
            r16 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x013f
        L_0x013d:
            r16 = 268435456(0x10000000, float:2.5243549E-29)
        L_0x013f:
            r1 = r1 | r16
        L_0x0141:
            r16 = 1533916891(0x5b6db6db, float:6.6910621E16)
            r3 = r1 & r16
            r5 = 306783378(0x12492492, float:6.3469493E-28)
            if (r3 != r5) goto L_0x0164
            boolean r3 = r11.getSkipping()
            if (r3 != 0) goto L_0x0152
            goto L_0x0164
        L_0x0152:
            r11.skipToGroupEnd()
            r3 = r44
            r4 = r45
            r5 = r7
            r6 = r8
            r7 = r9
            r24 = r11
            r8 = r49
            r9 = r50
            goto L_0x0328
        L_0x0164:
            r11.startDefaults()
            r3 = r13 & 1
            r36 = -29360129(0xfffffffffe3fffff, float:-6.380294E37)
            r5 = -3670017(0xffffffffffc7ffff, float:NaN)
            r16 = -458753(0xfffffffffff8ffff, float:NaN)
            r37 = 0
            r10 = 6
            if (r3 == 0) goto L_0x01a3
            boolean r3 = r11.getDefaultsInvalid()
            if (r3 == 0) goto L_0x017e
            goto L_0x01a3
        L_0x017e:
            r11.skipToGroupEnd()
            r0 = r12 & 32
            if (r0 == 0) goto L_0x0187
            r1 = r1 & r16
        L_0x0187:
            r0 = r12 & 64
            if (r0 == 0) goto L_0x018c
            r1 = r1 & r5
        L_0x018c:
            r0 = r12 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x0192
            r1 = r1 & r36
        L_0x0192:
            r38 = r44
            r19 = r49
            r20 = r51
            r40 = r7
            r41 = r8
            r12 = r10
            r10 = r45
            r7 = r50
            goto L_0x0255
        L_0x01a3:
            if (r2 == 0) goto L_0x01ac
            androidx.compose.ui.Modifier$Companion r2 = androidx.compose.ui.Modifier.Companion
            androidx.compose.ui.Modifier r2 = (androidx.compose.ui.Modifier) r2
            r38 = r2
            goto L_0x01ae
        L_0x01ac:
            r38 = r44
        L_0x01ae:
            if (r4 == 0) goto L_0x01b4
            r2 = 1
            r39 = r2
            goto L_0x01b6
        L_0x01b4:
            r39 = r45
        L_0x01b6:
            if (r6 == 0) goto L_0x01bb
            r40 = r37
            goto L_0x01bd
        L_0x01bb:
            r40 = r7
        L_0x01bd:
            r2 = r12 & 32
            if (r2 == 0) goto L_0x01cc
            androidx.compose.material3.SuggestionChipDefaults r2 = androidx.compose.material3.SuggestionChipDefaults.INSTANCE
            androidx.compose.ui.graphics.Shape r2 = r2.getShape(r11, r10)
            r1 = r1 & r16
            r41 = r2
            goto L_0x01ce
        L_0x01cc:
            r41 = r8
        L_0x01ce:
            r2 = r12 & 64
            if (r2 == 0) goto L_0x01f0
            androidx.compose.material3.SuggestionChipDefaults r16 = androidx.compose.material3.SuggestionChipDefaults.INSTANCE
            r17 = 0
            r19 = 0
            r21 = 0
            r23 = 0
            r25 = 0
            r27 = 0
            r30 = 1572864(0x180000, float:2.204052E-39)
            r31 = 63
            r29 = r11
            androidx.compose.material3.ChipColors r2 = r16.m1634elevatedSuggestionChipColors5tl4gsc(r17, r19, r21, r23, r25, r27, r29, r30, r31)
            r1 = r1 & r5
            r17 = r1
            r16 = r2
            goto L_0x01f4
        L_0x01f0:
            r17 = r1
            r16 = r9
        L_0x01f4:
            r1 = r12 & 128(0x80, float:1.794E-43)
            if (r1 == 0) goto L_0x0213
            androidx.compose.material3.SuggestionChipDefaults r1 = androidx.compose.material3.SuggestionChipDefaults.INSTANCE
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r9 = 1572864(0x180000, float:2.204052E-39)
            r18 = 63
            r8 = r11
            r19 = r52
            r12 = r10
            r10 = r18
            androidx.compose.material3.ChipElevation r1 = r1.m1635elevatedSuggestionChipElevationaqJV_2Y(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r2 = r17 & r36
            r17 = r2
            goto L_0x0218
        L_0x0213:
            r19 = r52
            r12 = r10
            r1 = r49
        L_0x0218:
            if (r0 == 0) goto L_0x021d
            r0 = r37
            goto L_0x021f
        L_0x021d:
            r0 = r50
        L_0x021f:
            if (r19 == 0) goto L_0x024a
            r2 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r11.startReplaceableGroup(r2)
            java.lang.String r2 = "CC(remember):Composables.kt#9igjgp"
            androidx.compose.runtime.ComposerKt.sourceInformation(r11, r2)
            java.lang.Object r2 = r11.rememberedValue()
            androidx.compose.runtime.Composer$Companion r3 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r3 = r3.getEmpty()
            if (r2 != r3) goto L_0x023f
            androidx.compose.foundation.interaction.MutableInteractionSource r2 = androidx.compose.foundation.interaction.InteractionSourceKt.MutableInteractionSource()
            r11.updateRememberedValue(r2)
        L_0x023f:
            r11.endReplaceableGroup()
            androidx.compose.foundation.interaction.MutableInteractionSource r2 = (androidx.compose.foundation.interaction.MutableInteractionSource) r2
            r7 = r0
            r19 = r1
            r20 = r2
            goto L_0x024f
        L_0x024a:
            r20 = r51
            r7 = r0
            r19 = r1
        L_0x024f:
            r9 = r16
            r1 = r17
            r10 = r39
        L_0x0255:
            r11.endDefaults()
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto L_0x0268
            r0 = -1
            java.lang.String r2 = "androidx.compose.material3.ElevatedSuggestionChip (Chip.kt:585)"
            r3 = 1668751803(0x637721bb, float:4.5587763E21)
            androidx.compose.runtime.ComposerKt.traceEventStart(r3, r1, r0, r2)
        L_0x0268:
            androidx.compose.material3.MaterialTheme r0 = androidx.compose.material3.MaterialTheme.INSTANCE
            androidx.compose.material3.Typography r0 = r0.getTypography(r11, r12)
            androidx.compose.material3.tokens.SuggestionChipTokens r2 = androidx.compose.material3.tokens.SuggestionChipTokens.INSTANCE
            androidx.compose.material3.tokens.TypographyKeyTokens r2 = r2.getLabelTextFont()
            androidx.compose.ui.text.TextStyle r4 = androidx.compose.material3.TypographyKt.fromToken(r0, r2)
            int r0 = r1 >> 9
            r0 = r0 & 14
            int r2 = r1 >> 15
            r3 = r2 & 112(0x70, float:1.57E-43)
            r3 = r3 | r0
            androidx.compose.runtime.State r3 = r9.labelColor$material3_release(r10, r11, r3)
            java.lang.Object r3 = r3.getValue()
            androidx.compose.ui.graphics.Color r3 = (androidx.compose.ui.graphics.Color) r3
            long r5 = r3.m2831unboximpl()
            androidx.compose.material3.SuggestionChipDefaults r3 = androidx.compose.material3.SuggestionChipDefaults.INSTANCE
            float r16 = r3.m1636getHeightD9Ej5fM()
            androidx.compose.foundation.layout.PaddingValues r21 = SuggestionChipPadding
            r3 = -1455593716(0xffffffffa93d670c, float:-4.205581E-14)
            r11.startReplaceableGroup(r3)
            java.lang.String r3 = "610@30665L21"
            androidx.compose.runtime.ComposerKt.sourceInformation(r11, r3)
            if (r7 != 0) goto L_0x02a7
            r0 = r37
            goto L_0x02b0
        L_0x02a7:
            int r3 = r1 >> 21
            r3 = r3 & 112(0x70, float:1.57E-43)
            r0 = r0 | r3
            androidx.compose.runtime.State r0 = r7.borderStroke$material3_release(r10, r11, r0)
        L_0x02b0:
            r11.endReplaceableGroup()
            if (r0 == 0) goto L_0x02bd
            java.lang.Object r0 = r0.getValue()
            androidx.compose.foundation.BorderStroke r0 = (androidx.compose.foundation.BorderStroke) r0
            r12 = r0
            goto L_0x02bf
        L_0x02bd:
            r12 = r37
        L_0x02bf:
            r8 = 0
            int r0 = r1 >> 6
            r0 = r0 & 14
            r3 = 12582912(0xc00000, float:1.7632415E-38)
            r0 = r0 | r3
            int r3 = r1 << 3
            r3 = r3 & 112(0x70, float:1.57E-43)
            r0 = r0 | r3
            int r3 = r1 >> 3
            r3 = r3 & 896(0x380, float:1.256E-42)
            r0 = r0 | r3
            int r3 = r1 << 6
            r8 = r3 & 7168(0x1c00, float:1.0045E-41)
            r0 = r0 | r8
            r3 = r3 & r33
            r0 = r0 | r3
            int r3 = r1 << 9
            r8 = r3 & r34
            r0 = r0 | r8
            r3 = r3 & r35
            r17 = r0 | r3
            int r0 = r1 >> 21
            r0 = r0 & 14
            r0 = r0 | 3456(0xd80, float:4.843E-42)
            r1 = r2 & r32
            r18 = r0 | r1
            r0 = r38
            r1 = r42
            r2 = r10
            r3 = r43
            r22 = r7
            r7 = r40
            r23 = r9
            r9 = r41
            r39 = r10
            r10 = r23
            r24 = r11
            r11 = r19
            r13 = r16
            r14 = r21
            r15 = r20
            r16 = r24
            r8 = 0
            m1173ChipnkUnTEs(r0, r1, r2, r3, r4, r5, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto L_0x0318
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L_0x0318:
            r8 = r19
            r10 = r20
            r9 = r22
            r7 = r23
            r3 = r38
            r4 = r39
            r5 = r40
            r6 = r41
        L_0x0328:
            androidx.compose.runtime.ScopeUpdateScope r13 = r24.endRestartGroup()
            if (r13 != 0) goto L_0x032f
            goto L_0x0342
        L_0x032f:
            androidx.compose.material3.ChipKt$ElevatedSuggestionChip$2 r14 = new androidx.compose.material3.ChipKt$ElevatedSuggestionChip$2
            r0 = r14
            r1 = r42
            r2 = r43
            r11 = r53
            r12 = r54
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            kotlin.jvm.functions.Function2 r14 = (kotlin.jvm.functions.Function2) r14
            r13.updateScope(r14)
        L_0x0342:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.ChipKt.ElevatedSuggestionChip(kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function2, androidx.compose.ui.Modifier, boolean, kotlin.jvm.functions.Function2, androidx.compose.ui.graphics.Shape, androidx.compose.material3.ChipColors, androidx.compose.material3.ChipElevation, androidx.compose.material3.ChipBorder, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.runtime.Composer, int, int):void");
    }

    /* access modifiers changed from: private */
    /* renamed from: Chip-nkUnTEs  reason: not valid java name */
    public static final void m1173ChipnkUnTEs(Modifier modifier, Function0<Unit> function0, boolean z, Function2<? super Composer, ? super Integer, Unit> function2, TextStyle textStyle, long j, Function2<? super Composer, ? super Integer, Unit> function22, Function2<? super Composer, ? super Integer, Unit> function23, Shape shape, ChipColors chipColors, ChipElevation chipElevation, BorderStroke borderStroke, float f, PaddingValues paddingValues, MutableInteractionSource mutableInteractionSource, Composer composer, int i, int i2) {
        int i3;
        int i4;
        Composer composer2;
        Modifier modifier2 = modifier;
        boolean z2 = z;
        ChipColors chipColors2 = chipColors;
        ChipElevation chipElevation2 = chipElevation;
        MutableInteractionSource mutableInteractionSource2 = mutableInteractionSource;
        int i5 = i;
        int i6 = i2;
        Composer startRestartGroup = composer.startRestartGroup(1400504719);
        ComposerKt.sourceInformation(startRestartGroup, "C(Chip)P(10,11,3,5,7,6:c#ui.graphics.Color,8,14,13,1,2!1,9:c#ui.unit.Dp,12)1323@66508L23,1318@66337L961:Chip.kt#uh7d8r");
        int i7 = 4;
        if ((i5 & 14) == 0) {
            i3 = (startRestartGroup.changed((Object) modifier2) ? 4 : 2) | i5;
        } else {
            i3 = i5;
        }
        int i8 = 32;
        Function0<Unit> function02 = function0;
        if ((i5 & 112) == 0) {
            i3 |= startRestartGroup.changedInstance(function02) ? 32 : 16;
        }
        int i9 = 256;
        if ((i5 & 896) == 0) {
            i3 |= startRestartGroup.changed(z2) ? 256 : 128;
        }
        int i10 = 2048;
        if ((i5 & 7168) == 0) {
            i3 |= startRestartGroup.changedInstance(function2) ? 2048 : 1024;
        } else {
            Function2<? super Composer, ? super Integer, Unit> function24 = function2;
        }
        int i11 = 16384;
        TextStyle textStyle2 = textStyle;
        if ((i5 & 57344) == 0) {
            i3 |= startRestartGroup.changed((Object) textStyle2) ? 16384 : 8192;
        }
        long j2 = j;
        if ((i5 & 458752) == 0) {
            i3 |= startRestartGroup.changed(j2) ? 131072 : 65536;
        }
        Function2<? super Composer, ? super Integer, Unit> function25 = function22;
        if ((i5 & 3670016) == 0) {
            i3 |= startRestartGroup.changedInstance(function25) ? 1048576 : 524288;
        }
        if ((29360128 & i5) == 0) {
            i3 |= startRestartGroup.changedInstance(function23) ? 8388608 : 4194304;
        } else {
            Function2<? super Composer, ? super Integer, Unit> function26 = function23;
        }
        Shape shape2 = shape;
        if ((i5 & 234881024) == 0) {
            i3 |= startRestartGroup.changed((Object) shape2) ? 67108864 : 33554432;
        }
        if ((i5 & 1879048192) == 0) {
            i3 |= startRestartGroup.changed((Object) chipColors2) ? 536870912 : 268435456;
        }
        if ((i6 & 14) == 0) {
            if (!startRestartGroup.changed((Object) chipElevation2)) {
                i7 = 2;
            }
            i4 = i7 | i6;
        } else {
            i4 = i6;
        }
        if ((i6 & 112) == 0) {
            if (!startRestartGroup.changed((Object) borderStroke)) {
                i8 = 16;
            }
            i4 |= i8;
        } else {
            BorderStroke borderStroke2 = borderStroke;
        }
        if ((i6 & 896) == 0) {
            if (!startRestartGroup.changed(f)) {
                i9 = 128;
            }
            i4 |= i9;
        } else {
            float f2 = f;
        }
        if ((i6 & 7168) == 0) {
            if (!startRestartGroup.changed((Object) paddingValues)) {
                i10 = 1024;
            }
            i4 |= i10;
        } else {
            PaddingValues paddingValues2 = paddingValues;
        }
        if ((i6 & 57344) == 0) {
            if (!startRestartGroup.changed((Object) mutableInteractionSource2)) {
                i11 = 8192;
            }
            i4 |= i11;
        }
        if ((i3 & 1533916891) == 306783378 && (46811 & i4) == 9362 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
            composer2 = startRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1400504719, i3, i4, "androidx.compose.material3.Chip (Chip.kt:1301)");
            }
            Modifier semantics$default = SemanticsModifierKt.semantics$default(modifier2, false, ChipKt$Chip$1.INSTANCE, 1, (Object) null);
            int i12 = (i3 >> 6) & 14;
            long r20 = chipColors2.containerColor$material3_release(z2, startRestartGroup, i12 | ((i3 >> 24) & 112)).getValue().m2831unboximpl();
            startRestartGroup.startReplaceableGroup(64018752);
            ComposerKt.sourceInformation(startRestartGroup, "1324@66575L42");
            State<Dp> state = chipElevation2 == null ? null : chipElevation2.tonalElevation$material3_release(z2, mutableInteractionSource2, startRestartGroup, i12 | ((i4 >> 9) & 112) | ((i4 << 6) & 896));
            startRestartGroup.endReplaceableGroup();
            float r26 = state != null ? state.getValue().m5640unboximpl() : Dp.m5626constructorimpl((float) 0);
            startRestartGroup.startReplaceableGroup(64018848);
            ComposerKt.sourceInformation(startRestartGroup, "1325@66671L43");
            State<Dp> shadowElevation$material3_release = chipElevation2 == null ? null : chipElevation2.shadowElevation$material3_release(z2, mutableInteractionSource2, startRestartGroup, i12 | ((i4 >> 9) & 112) | ((i4 << 6) & 896));
            startRestartGroup.endReplaceableGroup();
            float r27 = shadowElevation$material3_release != null ? shadowElevation$material3_release.getValue().m5640unboximpl() : Dp.m5626constructorimpl((float) 0);
            int i13 = i4;
            int i14 = i3;
            composer2 = startRestartGroup;
            ChipKt$Chip$2 chipKt$Chip$2 = r2;
            ChipKt$Chip$2 chipKt$Chip$22 = new ChipKt$Chip$2(function2, textStyle, j, function22, function23, chipColors, z, i14, f, paddingValues, i13);
            int i15 = i14;
            SurfaceKt.m1644Surfaceo_FOJdg(function0, semantics$default, z, shape, r20, 0, r26, r27, borderStroke, mutableInteractionSource, ComposableLambdaKt.composableLambda(composer2, -1985962652, true, chipKt$Chip$2), composer2, ((i15 >> 3) & 14) | (i15 & 896) | ((i15 >> 15) & 7168) | ((i13 << 21) & 234881024) | ((i13 << 15) & 1879048192), 6, 32);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new ChipKt$Chip$3(modifier, function0, z, function2, textStyle, j, function22, function23, shape, chipColors, chipElevation, borderStroke, f, paddingValues, mutableInteractionSource, i, i2));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: SelectableChip-u0RnIRE  reason: not valid java name */
    public static final void m1175SelectableChipu0RnIRE(boolean z, Modifier modifier, Function0<Unit> function0, boolean z2, Function2<? super Composer, ? super Integer, Unit> function2, TextStyle textStyle, Function2<? super Composer, ? super Integer, Unit> function22, Function2<? super Composer, ? super Integer, Unit> function23, Function2<? super Composer, ? super Integer, Unit> function24, Shape shape, SelectableChipColors selectableChipColors, SelectableChipElevation selectableChipElevation, BorderStroke borderStroke, float f, PaddingValues paddingValues, MutableInteractionSource mutableInteractionSource, Composer composer, int i, int i2) {
        int i3;
        int i4;
        Composer composer2;
        boolean z3 = z;
        Modifier modifier2 = modifier;
        boolean z4 = z2;
        SelectableChipColors selectableChipColors2 = selectableChipColors;
        SelectableChipElevation selectableChipElevation2 = selectableChipElevation;
        MutableInteractionSource mutableInteractionSource2 = mutableInteractionSource;
        int i5 = i;
        int i6 = i2;
        Composer startRestartGroup = composer.startRestartGroup(402951308);
        ComposerKt.sourceInformation(startRestartGroup, "C(SelectableChip)P(13,10,11,4,6,7,8!1,15,14,2,3!1,9:c#ui.unit.Dp,12)1371@68165L33,1365@67963L1080:Chip.kt#uh7d8r");
        int i7 = 2;
        if ((i5 & 14) == 0) {
            i3 = (startRestartGroup.changed(z3) ? 4 : 2) | i5;
        } else {
            i3 = i5;
        }
        int i8 = 32;
        if ((i5 & 112) == 0) {
            i3 |= startRestartGroup.changed((Object) modifier2) ? 32 : 16;
        }
        int i9 = 256;
        if ((i5 & 896) == 0) {
            i3 |= startRestartGroup.changedInstance(function0) ? 256 : 128;
        } else {
            Function0<Unit> function02 = function0;
        }
        int i10 = 2048;
        if ((i5 & 7168) == 0) {
            i3 |= startRestartGroup.changed(z4) ? 2048 : 1024;
        }
        int i11 = 16384;
        if ((i5 & 57344) == 0) {
            i3 |= startRestartGroup.changedInstance(function2) ? 16384 : 8192;
        } else {
            Function2<? super Composer, ? super Integer, Unit> function25 = function2;
        }
        int i12 = 131072;
        TextStyle textStyle2 = textStyle;
        if ((i5 & 458752) == 0) {
            i3 |= startRestartGroup.changed((Object) textStyle2) ? 131072 : 65536;
        }
        Function2<? super Composer, ? super Integer, Unit> function26 = function22;
        if ((i5 & 3670016) == 0) {
            i3 |= startRestartGroup.changedInstance(function26) ? 1048576 : 524288;
        }
        Function2<? super Composer, ? super Integer, Unit> function27 = function23;
        if ((i5 & 29360128) == 0) {
            i3 |= startRestartGroup.changedInstance(function27) ? 8388608 : 4194304;
        }
        Function2<? super Composer, ? super Integer, Unit> function28 = function24;
        if ((i5 & 234881024) == 0) {
            i3 |= startRestartGroup.changedInstance(function28) ? 67108864 : 33554432;
        }
        int i13 = i5 & 1879048192;
        Shape shape2 = shape;
        if (i13 == 0) {
            i3 |= startRestartGroup.changed((Object) shape2) ? 536870912 : 268435456;
        }
        if ((i6 & 14) == 0) {
            if (startRestartGroup.changed((Object) selectableChipColors2)) {
                i7 = 4;
            }
            i4 = i7 | i6;
        } else {
            i4 = i6;
        }
        if ((i6 & 112) == 0) {
            if (!startRestartGroup.changed((Object) selectableChipElevation2)) {
                i8 = 16;
            }
            i4 |= i8;
        }
        if ((i6 & 896) == 0) {
            if (!startRestartGroup.changed((Object) borderStroke)) {
                i9 = 128;
            }
            i4 |= i9;
        } else {
            BorderStroke borderStroke2 = borderStroke;
        }
        if ((i6 & 7168) == 0) {
            if (!startRestartGroup.changed(f)) {
                i10 = 1024;
            }
            i4 |= i10;
        } else {
            float f2 = f;
        }
        PaddingValues paddingValues2 = paddingValues;
        if ((i6 & 57344) == 0) {
            if (!startRestartGroup.changed((Object) paddingValues2)) {
                i11 = 8192;
            }
            i4 |= i11;
        }
        if ((i6 & 458752) == 0) {
            if (!startRestartGroup.changed((Object) mutableInteractionSource2)) {
                i12 = 65536;
            }
            i4 |= i12;
        }
        if ((i3 & 1533916891) == 306783378 && (374491 & i4) == 74898 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
            composer2 = startRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(402951308, i3, i4, "androidx.compose.material3.SelectableChip (Chip.kt:1346)");
            }
            Modifier semantics$default = SemanticsModifierKt.semantics$default(modifier2, false, ChipKt$SelectableChip$1.INSTANCE, 1, (Object) null);
            int i14 = (i3 >> 9) & 14;
            long r21 = selectableChipColors2.containerColor$material3_release(z4, z3, startRestartGroup, ((i3 << 3) & 112) | i14 | ((i4 << 6) & 896)).getValue().m2831unboximpl();
            startRestartGroup.startReplaceableGroup(1036660941);
            ComposerKt.sourceInformation(startRestartGroup, "1372@68242L42");
            State<Dp> state = selectableChipElevation2 == null ? null : selectableChipElevation2.tonalElevation$material3_release(z4, mutableInteractionSource2, startRestartGroup, ((i4 << 3) & 896) | ((i4 >> 12) & 112) | i14);
            startRestartGroup.endReplaceableGroup();
            float r19 = state != null ? state.getValue().m5640unboximpl() : Dp.m5626constructorimpl((float) 0);
            startRestartGroup.startReplaceableGroup(1036661049);
            ComposerKt.sourceInformation(startRestartGroup, "1374@68350L43");
            State<Dp> shadowElevation$material3_release = selectableChipElevation2 == null ? null : selectableChipElevation2.shadowElevation$material3_release(z4, mutableInteractionSource2, startRestartGroup, i14 | ((i4 >> 12) & 112) | ((i4 << 3) & 896));
            startRestartGroup.endReplaceableGroup();
            float r25 = shadowElevation$material3_release != null ? shadowElevation$material3_release.getValue().m5640unboximpl() : Dp.m5626constructorimpl((float) 0);
            int i15 = i3;
            int i16 = i4;
            ChipKt$SelectableChip$2 chipKt$SelectableChip$2 = r0;
            Composer composer3 = startRestartGroup;
            ChipKt$SelectableChip$2 chipKt$SelectableChip$22 = new ChipKt$SelectableChip$2(selectableChipColors, z2, z, i15, i16, function2, textStyle, function22, function23, function24, f, paddingValues);
            int i17 = i15;
            composer2 = composer3;
            SurfaceKt.m1642Surfaced85dljk(z, function0, semantics$default, z2, shape, r21, 0, r19, r25, borderStroke, mutableInteractionSource, (Function2<? super Composer, ? super Integer, Unit>) ComposableLambdaKt.composableLambda(composer3, -577614814, true, chipKt$SelectableChip$2), composer3, (i17 & 14) | ((i17 >> 3) & 112) | (i17 & 7168) | ((i17 >> 15) & 57344) | ((i16 << 21) & 1879048192), ((i16 >> 15) & 14) | 48, 64);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new ChipKt$SelectableChip$3(z, modifier, function0, z2, function2, textStyle, function22, function23, function24, shape, selectableChipColors, selectableChipElevation, borderStroke, f, paddingValues, mutableInteractionSource, i, i2));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: ChipContent-fe0OD_I  reason: not valid java name */
    public static final void m1174ChipContentfe0OD_I(Function2<? super Composer, ? super Integer, Unit> function2, TextStyle textStyle, long j, Function2<? super Composer, ? super Integer, Unit> function22, Function2<? super Composer, ? super Integer, Unit> function23, Function2<? super Composer, ? super Integer, Unit> function24, long j2, long j3, float f, PaddingValues paddingValues, Composer composer, int i) {
        int i2;
        int i3;
        TextStyle textStyle2 = textStyle;
        int i4 = i;
        Composer startRestartGroup = composer.startRestartGroup(-782878228);
        ComposerKt.sourceInformation(startRestartGroup, "C(ChipContent)P(1,3,2:c#ui.graphics.Color,4!1,8,5:c#ui.graphics.Color,9:c#ui.graphics.Color,6:c#ui.unit.Dp)1407@69420L1012:Chip.kt#uh7d8r");
        if ((i4 & 14) == 0) {
            i2 = (startRestartGroup.changedInstance(function2) ? 4 : 2) | i4;
        } else {
            Function2<? super Composer, ? super Integer, Unit> function25 = function2;
            i2 = i4;
        }
        if ((i4 & 112) == 0) {
            i2 |= startRestartGroup.changed((Object) textStyle2) ? 32 : 16;
        }
        if ((i4 & 896) == 0) {
            i2 |= startRestartGroup.changed(j) ? 256 : 128;
        } else {
            long j4 = j;
        }
        if ((i4 & 7168) == 0) {
            i2 |= startRestartGroup.changedInstance(function22) ? 2048 : 1024;
        } else {
            Function2<? super Composer, ? super Integer, Unit> function26 = function22;
        }
        if ((57344 & i4) == 0) {
            i2 |= startRestartGroup.changedInstance(function23) ? 16384 : 8192;
        } else {
            Function2<? super Composer, ? super Integer, Unit> function27 = function23;
        }
        if ((458752 & i4) == 0) {
            i2 |= startRestartGroup.changedInstance(function24) ? 131072 : 65536;
        } else {
            Function2<? super Composer, ? super Integer, Unit> function28 = function24;
        }
        if ((3670016 & i4) == 0) {
            i2 |= startRestartGroup.changed(j2) ? 1048576 : 524288;
        } else {
            long j5 = j2;
        }
        if ((29360128 & i4) == 0) {
            i3 = i2 | (startRestartGroup.changed(j3) ? 8388608 : 4194304);
        } else {
            i3 = i2;
            long j6 = j3;
        }
        if ((234881024 & i4) == 0) {
            i3 |= startRestartGroup.changed(f) ? 67108864 : 33554432;
        } else {
            float f2 = f;
        }
        PaddingValues paddingValues2 = paddingValues;
        if ((i4 & 1879048192) == 0) {
            i3 |= startRestartGroup.changed((Object) paddingValues2) ? 536870912 : 268435456;
        }
        if ((i3 & 1533916891) != 306783378 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-782878228, i3, -1, "androidx.compose.material3.ChipContent (Chip.kt:1395)");
            }
            CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m2811boximpl(j)), TextKt.getLocalTextStyle().provides(textStyle2)}, (Function2<? super Composer, ? super Integer, Unit>) ComposableLambdaKt.composableLambda(startRestartGroup, 1748799148, true, new ChipKt$ChipContent$1(f, paddingValues, function23, i3, function22, j2, function2, function24, j3)), startRestartGroup, 56);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new ChipKt$ChipContent$2(function2, textStyle, j, function22, function23, function24, j2, j3, f, paddingValues, i));
        }
    }

    static /* synthetic */ PaddingValues inputChipPadding$default(boolean z, boolean z2, boolean z3, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        if ((i & 2) != 0) {
            z2 = false;
        }
        if ((i & 4) != 0) {
            z3 = false;
        }
        return inputChipPadding(z, z2, z3);
    }

    private static final PaddingValues inputChipPadding(boolean z, boolean z2, boolean z3) {
        return PaddingKt.m490PaddingValuesa9UjIt4$default(Dp.m5626constructorimpl((z || !z2) ? (float) 4 : (float) 8), 0.0f, Dp.m5626constructorimpl(z3 ? (float) 8 : (float) 4), 0.0f, 10, (Object) null);
    }

    static {
        float r0 = Dp.m5626constructorimpl((float) 8);
        HorizontalElementsPadding = r0;
        AssistChipPadding = PaddingKt.m488PaddingValuesYgX7TsA$default(r0, 0.0f, 2, (Object) null);
        FilterChipPadding = PaddingKt.m488PaddingValuesYgX7TsA$default(r0, 0.0f, 2, (Object) null);
        SuggestionChipPadding = PaddingKt.m488PaddingValuesYgX7TsA$default(r0, 0.0f, 2, (Object) null);
    }
}
