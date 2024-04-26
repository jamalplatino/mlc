package androidx.compose.material3;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.layout.LayoutIdKt;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.DpKt;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import kotlin.ranges.RangesKt;

@Metadata(d1 = {"\u0000¢\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\u001aÖ\u0002\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00060\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\u0015\b\u0002\u0010\u0012\u001a\u000f\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0013¢\u0006\u0002\b\u00142\u0015\b\u0002\u0010\u0015\u001a\u000f\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0013¢\u0006\u0002\b\u00142\u0015\b\u0002\u0010\u0016\u001a\u000f\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0013¢\u0006\u0002\b\u00142\u0015\b\u0002\u0010\u0017\u001a\u000f\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0013¢\u0006\u0002\b\u00142\u0015\b\u0002\u0010\u0018\u001a\u000f\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0013¢\u0006\u0002\b\u00142\u0015\b\u0002\u0010\u0019\u001a\u000f\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0013¢\u0006\u0002\b\u00142\u0015\b\u0002\u0010\u001a\u001a\u000f\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0013¢\u0006\u0002\b\u00142\b\b\u0002\u0010\u001b\u001a\u00020\u000e2\b\b\u0002\u0010\u001c\u001a\u00020\u001d2\b\b\u0002\u0010\u001e\u001a\u00020\u001f2\b\b\u0002\u0010 \u001a\u00020!2\b\b\u0002\u0010\"\u001a\u00020\u000e2\b\b\u0002\u0010#\u001a\u00020$2\b\b\u0002\u0010%\u001a\u00020$2\b\b\u0002\u0010&\u001a\u00020'2\b\b\u0002\u0010(\u001a\u00020)2\b\b\u0002\u0010*\u001a\u00020+H\u0007¢\u0006\u0002\u0010,\u001a¨\u0002\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00060\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\u0015\b\u0002\u0010\u0012\u001a\u000f\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0013¢\u0006\u0002\b\u00142\u0015\b\u0002\u0010\u0015\u001a\u000f\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0013¢\u0006\u0002\b\u00142\u0015\b\u0002\u0010\u0016\u001a\u000f\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0013¢\u0006\u0002\b\u00142\u0015\b\u0002\u0010\u0017\u001a\u000f\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0013¢\u0006\u0002\b\u00142\u0015\b\u0002\u0010\u001a\u001a\u000f\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0013¢\u0006\u0002\b\u00142\b\b\u0002\u0010\u001b\u001a\u00020\u000e2\b\b\u0002\u0010\u001c\u001a\u00020\u001d2\b\b\u0002\u0010\u001e\u001a\u00020\u001f2\b\b\u0002\u0010 \u001a\u00020!2\b\b\u0002\u0010\"\u001a\u00020\u000e2\b\b\u0002\u0010#\u001a\u00020$2\b\b\u0002\u0010%\u001a\u00020$2\b\b\u0002\u0010&\u001a\u00020'2\b\b\u0002\u0010(\u001a\u00020)2\b\b\u0002\u0010*\u001a\u00020+H\u0007¢\u0006\u0002\u0010-\u001aÖ\u0002\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020.2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u00020\u00060\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\u0015\b\u0002\u0010\u0012\u001a\u000f\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0013¢\u0006\u0002\b\u00142\u0015\b\u0002\u0010\u0015\u001a\u000f\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0013¢\u0006\u0002\b\u00142\u0015\b\u0002\u0010\u0016\u001a\u000f\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0013¢\u0006\u0002\b\u00142\u0015\b\u0002\u0010\u0017\u001a\u000f\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0013¢\u0006\u0002\b\u00142\u0015\b\u0002\u0010\u0018\u001a\u000f\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0013¢\u0006\u0002\b\u00142\u0015\b\u0002\u0010\u0019\u001a\u000f\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0013¢\u0006\u0002\b\u00142\u0015\b\u0002\u0010\u001a\u001a\u000f\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0013¢\u0006\u0002\b\u00142\b\b\u0002\u0010\u001b\u001a\u00020\u000e2\b\b\u0002\u0010\u001c\u001a\u00020\u001d2\b\b\u0002\u0010\u001e\u001a\u00020\u001f2\b\b\u0002\u0010 \u001a\u00020!2\b\b\u0002\u0010\"\u001a\u00020\u000e2\b\b\u0002\u0010#\u001a\u00020$2\b\b\u0002\u0010%\u001a\u00020$2\b\b\u0002\u0010&\u001a\u00020'2\b\b\u0002\u0010(\u001a\u00020)2\b\b\u0002\u0010*\u001a\u00020+H\u0007¢\u0006\u0002\u0010/\u001a¨\u0002\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020.2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u00020\u00060\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\u0015\b\u0002\u0010\u0012\u001a\u000f\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0013¢\u0006\u0002\b\u00142\u0015\b\u0002\u0010\u0015\u001a\u000f\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0013¢\u0006\u0002\b\u00142\u0015\b\u0002\u0010\u0016\u001a\u000f\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0013¢\u0006\u0002\b\u00142\u0015\b\u0002\u0010\u0017\u001a\u000f\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0013¢\u0006\u0002\b\u00142\u0015\b\u0002\u0010\u001a\u001a\u000f\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0013¢\u0006\u0002\b\u00142\b\b\u0002\u0010\u001b\u001a\u00020\u000e2\b\b\u0002\u0010\u001c\u001a\u00020\u001d2\b\b\u0002\u0010\u001e\u001a\u00020\u001f2\b\b\u0002\u0010 \u001a\u00020!2\b\b\u0002\u0010\"\u001a\u00020\u000e2\b\b\u0002\u0010#\u001a\u00020$2\b\b\u0002\u0010%\u001a\u00020$2\b\b\u0002\u0010&\u001a\u00020'2\b\b\u0002\u0010(\u001a\u00020)2\b\b\u0002\u0010*\u001a\u00020+H\u0007¢\u0006\u0002\u00100\u001aì\u0001\u00101\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\f2\u0011\u00102\u001a\r\u0012\u0004\u0012\u00020\u00060\u0013¢\u0006\u0002\b\u00142\u0013\u0010\u0012\u001a\u000f\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0013¢\u0006\u0002\b\u00142\u0019\u0010\u0015\u001a\u0015\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0006\u0018\u00010\n¢\u0006\u0002\b\u00142\u0013\u00103\u001a\u000f\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0013¢\u0006\u0002\b\u00142\u0013\u00104\u001a\u000f\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0013¢\u0006\u0002\b\u00142\u0013\u0010\u0018\u001a\u000f\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0013¢\u0006\u0002\b\u00142\u0013\u0010\u0019\u001a\u000f\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0013¢\u0006\u0002\b\u00142\u0006\u0010\"\u001a\u00020\u000e2\u0006\u00105\u001a\u0002062\u0011\u00107\u001a\r\u0012\u0004\u0012\u00020\u00060\u0013¢\u0006\u0002\b\u00142\u0013\u00108\u001a\u000f\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0013¢\u0006\u0002\b\u00142\u0006\u00109\u001a\u00020:H\u0001¢\u0006\u0002\u0010;\u001au\u0010<\u001a\u00020$2\u0006\u0010=\u001a\u00020$2\u0006\u0010>\u001a\u00020$2\u0006\u0010?\u001a\u00020$2\u0006\u0010@\u001a\u00020$2\u0006\u0010A\u001a\u00020$2\u0006\u0010B\u001a\u00020$2\u0006\u0010C\u001a\u00020$2\u0006\u0010D\u001a\u00020$2\u0006\u0010E\u001a\u00020\u000e2\u0006\u0010F\u001a\u00020G2\u0006\u0010H\u001a\u0002062\u0006\u00109\u001a\u00020:H\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bI\u0010J\u001aU\u0010K\u001a\u00020$2\u0006\u0010L\u001a\u00020$2\u0006\u0010M\u001a\u00020$2\u0006\u0010N\u001a\u00020$2\u0006\u0010O\u001a\u00020$2\u0006\u0010P\u001a\u00020$2\u0006\u0010Q\u001a\u00020$2\u0006\u0010R\u001a\u00020$2\u0006\u0010F\u001a\u00020GH\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bS\u0010T\u001a\u0014\u0010U\u001a\u00020\f*\u00020\f2\u0006\u0010V\u001a\u00020WH\u0000\u001a\u0001\u0010X\u001a\u00020\u0006*\u00020Y2\u0006\u0010Z\u001a\u00020$2\u0006\u0010[\u001a\u00020$2\u0006\u0010\\\u001a\u00020]2\b\u0010^\u001a\u0004\u0018\u00010]2\b\u0010_\u001a\u0004\u0018\u00010]2\b\u0010`\u001a\u0004\u0018\u00010]2\b\u0010a\u001a\u0004\u0018\u00010]2\b\u0010b\u001a\u0004\u0018\u00010]2\b\u0010c\u001a\u0004\u0018\u00010]2\u0006\u0010d\u001a\u00020]2\b\u0010e\u001a\u0004\u0018\u00010]2\u0006\u0010\"\u001a\u00020\u000e2\u0006\u0010f\u001a\u00020$2\u0006\u0010g\u001a\u00020$2\u0006\u00105\u001a\u0002062\u0006\u0010H\u001a\u000206H\u0002\u001a\u0001\u0010h\u001a\u00020\u0006*\u00020Y2\u0006\u0010Z\u001a\u00020$2\u0006\u0010[\u001a\u00020$2\u0006\u0010i\u001a\u00020]2\b\u0010_\u001a\u0004\u0018\u00010]2\b\u0010`\u001a\u0004\u0018\u00010]2\b\u0010a\u001a\u0004\u0018\u00010]2\b\u0010b\u001a\u0004\u0018\u00010]2\b\u0010c\u001a\u0004\u0018\u00010]2\u0006\u0010d\u001a\u00020]2\b\u0010e\u001a\u0004\u0018\u00010]2\u0006\u0010\"\u001a\u00020\u000e2\u0006\u0010H\u001a\u0002062\u0006\u00109\u001a\u00020:H\u0002\"\u0019\u0010\u0000\u001a\u00020\u0001X\u0004ø\u0001\u0000¢\u0006\n\n\u0002\u0010\u0004\u001a\u0004\b\u0002\u0010\u0003\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006j"}, d2 = {"TextFieldWithLabelVerticalPadding", "Landroidx/compose/ui/unit/Dp;", "getTextFieldWithLabelVerticalPadding", "()F", "F", "TextField", "", "value", "Landroidx/compose/ui/text/input/TextFieldValue;", "onValueChange", "Lkotlin/Function1;", "modifier", "Landroidx/compose/ui/Modifier;", "enabled", "", "readOnly", "textStyle", "Landroidx/compose/ui/text/TextStyle;", "label", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "placeholder", "leadingIcon", "trailingIcon", "prefix", "suffix", "supportingText", "isError", "visualTransformation", "Landroidx/compose/ui/text/input/VisualTransformation;", "keyboardOptions", "Landroidx/compose/foundation/text/KeyboardOptions;", "keyboardActions", "Landroidx/compose/foundation/text/KeyboardActions;", "singleLine", "maxLines", "", "minLines", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "shape", "Landroidx/compose/ui/graphics/Shape;", "colors", "Landroidx/compose/material3/TextFieldColors;", "(Landroidx/compose/ui/text/input/TextFieldValue;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZLandroidx/compose/ui/text/input/VisualTransformation;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/KeyboardActions;ZIILandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/TextFieldColors;Landroidx/compose/runtime/Composer;IIII)V", "(Landroidx/compose/ui/text/input/TextFieldValue;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZLandroidx/compose/ui/text/input/VisualTransformation;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/KeyboardActions;ZIILandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/TextFieldColors;Landroidx/compose/runtime/Composer;IIII)V", "", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZLandroidx/compose/ui/text/input/VisualTransformation;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/KeyboardActions;ZIILandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/TextFieldColors;Landroidx/compose/runtime/Composer;IIII)V", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZLandroidx/compose/ui/text/input/VisualTransformation;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/KeyboardActions;ZIILandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/TextFieldColors;Landroidx/compose/runtime/Composer;IIII)V", "TextFieldLayout", "textField", "leading", "trailing", "animationProgress", "", "container", "supporting", "paddingValues", "Landroidx/compose/foundation/layout/PaddingValues;", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZFLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/runtime/Composer;II)V", "calculateHeight", "textFieldHeight", "labelHeight", "leadingHeight", "trailingHeight", "prefixHeight", "suffixHeight", "placeholderHeight", "supportingHeight", "isLabelFocused", "constraints", "Landroidx/compose/ui/unit/Constraints;", "density", "calculateHeight-mKXJcVc", "(IIIIIIIIZJFLandroidx/compose/foundation/layout/PaddingValues;)I", "calculateWidth", "leadingWidth", "trailingWidth", "prefixWidth", "suffixWidth", "textFieldWidth", "labelWidth", "placeholderWidth", "calculateWidth-yeHjK3Y", "(IIIIIIIJ)I", "drawIndicatorLine", "indicatorBorder", "Landroidx/compose/foundation/BorderStroke;", "placeWithLabel", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "width", "totalHeight", "textfieldPlaceable", "Landroidx/compose/ui/layout/Placeable;", "labelPlaceable", "placeholderPlaceable", "leadingPlaceable", "trailingPlaceable", "prefixPlaceable", "suffixPlaceable", "containerPlaceable", "supportingPlaceable", "labelEndPosition", "textPosition", "placeWithoutLabel", "textPlaceable", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: TextField.kt */
public final class TextFieldKt {
    private static final float TextFieldWithLabelVerticalPadding = Dp.m5626constructorimpl((float) 8);

    public static final float getTextFieldWithLabelVerticalPadding() {
        return TextFieldWithLabelVerticalPadding;
    }

    /* JADX WARNING: Removed duplicated region for block: B:105:0x015d  */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x0162  */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x017c  */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x017f  */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x0198  */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x019b  */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x01b5  */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x01b8  */
    /* JADX WARNING: Removed duplicated region for block: B:147:0x01d0  */
    /* JADX WARNING: Removed duplicated region for block: B:148:0x01d3  */
    /* JADX WARNING: Removed duplicated region for block: B:157:0x01f5  */
    /* JADX WARNING: Removed duplicated region for block: B:158:0x01fc  */
    /* JADX WARNING: Removed duplicated region for block: B:167:0x0215  */
    /* JADX WARNING: Removed duplicated region for block: B:168:0x021c  */
    /* JADX WARNING: Removed duplicated region for block: B:177:0x0235  */
    /* JADX WARNING: Removed duplicated region for block: B:178:0x023c  */
    /* JADX WARNING: Removed duplicated region for block: B:187:0x0257  */
    /* JADX WARNING: Removed duplicated region for block: B:194:0x026d  */
    /* JADX WARNING: Removed duplicated region for block: B:197:0x0273  */
    /* JADX WARNING: Removed duplicated region for block: B:198:0x027a  */
    /* JADX WARNING: Removed duplicated region for block: B:207:0x0295  */
    /* JADX WARNING: Removed duplicated region for block: B:208:0x029a  */
    /* JADX WARNING: Removed duplicated region for block: B:218:0x02b4  */
    /* JADX WARNING: Removed duplicated region for block: B:225:0x02ca  */
    /* JADX WARNING: Removed duplicated region for block: B:228:0x02d0  */
    /* JADX WARNING: Removed duplicated region for block: B:236:0x02e6  */
    /* JADX WARNING: Removed duplicated region for block: B:245:0x030a  */
    /* JADX WARNING: Removed duplicated region for block: B:246:0x033a  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0079  */
    /* JADX WARNING: Removed duplicated region for block: B:350:0x06c6  */
    /* JADX WARNING: Removed duplicated region for block: B:352:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x007c  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x009a  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x009f  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00bf  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x00d3  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00db  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00e2  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x00fd  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x0104  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x011d  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x0124  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x013d  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x0144  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void TextField(java.lang.String r120, kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> r121, androidx.compose.ui.Modifier r122, boolean r123, boolean r124, androidx.compose.ui.text.TextStyle r125, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r126, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r127, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r128, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r129, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r130, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r131, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r132, boolean r133, androidx.compose.ui.text.input.VisualTransformation r134, androidx.compose.foundation.text.KeyboardOptions r135, androidx.compose.foundation.text.KeyboardActions r136, boolean r137, int r138, int r139, androidx.compose.foundation.interaction.MutableInteractionSource r140, androidx.compose.ui.graphics.Shape r141, androidx.compose.material3.TextFieldColors r142, androidx.compose.runtime.Composer r143, int r144, int r145, int r146, int r147) {
        /*
            r15 = r120
            r14 = r121
            r13 = r144
            r12 = r145
            r11 = r146
            r9 = r147
            java.lang.String r0 = "value"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r15, r0)
            java.lang.String r0 = "onValueChange"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r14, r0)
            r0 = -676242365(0xffffffffd7b15c43, float:-3.90019638E14)
            r1 = r143
            androidx.compose.runtime.Composer r8 = r1.startRestartGroup(r0)
            java.lang.String r0 = "C(TextField)P(21,11,10,1,14,19,6,12,7,20,13,17,18,3,22,5,4,16,8,9,2,15)171@8945L7,186@9697L39,187@9775L5,188@9830L8,196@10192L15,196@10126L1825:TextField.kt#uh7d8r"
            androidx.compose.runtime.ComposerKt.sourceInformation(r8, r0)
            r0 = r9 & 1
            if (r0 == 0) goto L_0x002d
            r0 = r13 | 6
            goto L_0x003d
        L_0x002d:
            r0 = r13 & 14
            if (r0 != 0) goto L_0x003c
            boolean r0 = r8.changed((java.lang.Object) r15)
            if (r0 == 0) goto L_0x0039
            r0 = 4
            goto L_0x003a
        L_0x0039:
            r0 = 2
        L_0x003a:
            r0 = r0 | r13
            goto L_0x003d
        L_0x003c:
            r0 = r13
        L_0x003d:
            r3 = r9 & 2
            if (r3 == 0) goto L_0x0044
            r0 = r0 | 48
            goto L_0x0054
        L_0x0044:
            r3 = r13 & 112(0x70, float:1.57E-43)
            if (r3 != 0) goto L_0x0054
            boolean r3 = r8.changedInstance(r14)
            if (r3 == 0) goto L_0x0051
            r3 = 32
            goto L_0x0053
        L_0x0051:
            r3 = 16
        L_0x0053:
            r0 = r0 | r3
        L_0x0054:
            r3 = r9 & 4
            if (r3 == 0) goto L_0x005b
            r0 = r0 | 384(0x180, float:5.38E-43)
            goto L_0x006f
        L_0x005b:
            r10 = r13 & 896(0x380, float:1.256E-42)
            if (r10 != 0) goto L_0x006f
            r10 = r122
            boolean r16 = r8.changed((java.lang.Object) r10)
            if (r16 == 0) goto L_0x006a
            r16 = 256(0x100, float:3.59E-43)
            goto L_0x006c
        L_0x006a:
            r16 = 128(0x80, float:1.794E-43)
        L_0x006c:
            r0 = r0 | r16
            goto L_0x0071
        L_0x006f:
            r10 = r122
        L_0x0071:
            r16 = r9 & 8
            r17 = 2048(0x800, float:2.87E-42)
            r18 = 1024(0x400, float:1.435E-42)
            if (r16 == 0) goto L_0x007c
            r0 = r0 | 3072(0xc00, float:4.305E-42)
            goto L_0x0090
        L_0x007c:
            r1 = r13 & 7168(0x1c00, float:1.0045E-41)
            if (r1 != 0) goto L_0x0090
            r1 = r123
            boolean r19 = r8.changed((boolean) r1)
            if (r19 == 0) goto L_0x008b
            r19 = r17
            goto L_0x008d
        L_0x008b:
            r19 = r18
        L_0x008d:
            r0 = r0 | r19
            goto L_0x0092
        L_0x0090:
            r1 = r123
        L_0x0092:
            r19 = r9 & 16
            r20 = 16384(0x4000, float:2.2959E-41)
            r21 = 8192(0x2000, float:1.14794E-41)
            if (r19 == 0) goto L_0x009f
            r0 = r0 | 24576(0x6000, float:3.4438E-41)
            r2 = r124
            goto L_0x00b5
        L_0x009f:
            r22 = 57344(0xe000, float:8.0356E-41)
            r22 = r13 & r22
            r2 = r124
            if (r22 != 0) goto L_0x00b5
            boolean r23 = r8.changed((boolean) r2)
            if (r23 == 0) goto L_0x00b1
            r23 = r20
            goto L_0x00b3
        L_0x00b1:
            r23 = r21
        L_0x00b3:
            r0 = r0 | r23
        L_0x00b5:
            r23 = 458752(0x70000, float:6.42848E-40)
            r23 = r13 & r23
            r24 = 131072(0x20000, float:1.83671E-40)
            r25 = 65536(0x10000, float:9.18355E-41)
            if (r23 != 0) goto L_0x00d3
            r23 = r9 & 32
            r4 = r125
            if (r23 != 0) goto L_0x00ce
            boolean r26 = r8.changed((java.lang.Object) r4)
            if (r26 == 0) goto L_0x00ce
            r26 = r24
            goto L_0x00d0
        L_0x00ce:
            r26 = r25
        L_0x00d0:
            r0 = r0 | r26
            goto L_0x00d5
        L_0x00d3:
            r4 = r125
        L_0x00d5:
            r26 = r9 & 64
            r27 = 524288(0x80000, float:7.34684E-40)
            if (r26 == 0) goto L_0x00e2
            r28 = 1572864(0x180000, float:2.204052E-39)
            r0 = r0 | r28
            r5 = r126
            goto L_0x00f7
        L_0x00e2:
            r28 = 3670016(0x380000, float:5.142788E-39)
            r28 = r13 & r28
            r5 = r126
            if (r28 != 0) goto L_0x00f7
            boolean r29 = r8.changedInstance(r5)
            if (r29 == 0) goto L_0x00f3
            r29 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00f5
        L_0x00f3:
            r29 = r27
        L_0x00f5:
            r0 = r0 | r29
        L_0x00f7:
            r6 = r9 & 128(0x80, float:1.794E-43)
            r30 = 4194304(0x400000, float:5.877472E-39)
            if (r6 == 0) goto L_0x0104
            r31 = 12582912(0xc00000, float:1.7632415E-38)
            r0 = r0 | r31
            r7 = r127
            goto L_0x0119
        L_0x0104:
            r31 = 29360128(0x1c00000, float:7.052966E-38)
            r31 = r13 & r31
            r7 = r127
            if (r31 != 0) goto L_0x0119
            boolean r32 = r8.changedInstance(r7)
            if (r32 == 0) goto L_0x0115
            r32 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x0117
        L_0x0115:
            r32 = r30
        L_0x0117:
            r0 = r0 | r32
        L_0x0119:
            r1 = r9 & 256(0x100, float:3.59E-43)
            if (r1 == 0) goto L_0x0124
            r32 = 100663296(0x6000000, float:2.4074124E-35)
            r0 = r0 | r32
            r2 = r128
            goto L_0x0139
        L_0x0124:
            r32 = 234881024(0xe000000, float:1.5777218E-30)
            r32 = r13 & r32
            r2 = r128
            if (r32 != 0) goto L_0x0139
            boolean r32 = r8.changedInstance(r2)
            if (r32 == 0) goto L_0x0135
            r32 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x0137
        L_0x0135:
            r32 = 33554432(0x2000000, float:9.403955E-38)
        L_0x0137:
            r0 = r0 | r32
        L_0x0139:
            r2 = r9 & 512(0x200, float:7.175E-43)
            if (r2 == 0) goto L_0x0144
            r32 = 805306368(0x30000000, float:4.656613E-10)
            r0 = r0 | r32
            r4 = r129
            goto L_0x0159
        L_0x0144:
            r32 = 1879048192(0x70000000, float:1.58456325E29)
            r32 = r13 & r32
            r4 = r129
            if (r32 != 0) goto L_0x0159
            boolean r32 = r8.changedInstance(r4)
            if (r32 == 0) goto L_0x0155
            r32 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x0157
        L_0x0155:
            r32 = 268435456(0x10000000, float:2.5243549E-29)
        L_0x0157:
            r0 = r0 | r32
        L_0x0159:
            r4 = r9 & 1024(0x400, float:1.435E-42)
            if (r4 == 0) goto L_0x0162
            r32 = r12 | 6
            r5 = r130
            goto L_0x0178
        L_0x0162:
            r32 = r12 & 14
            r5 = r130
            if (r32 != 0) goto L_0x0176
            boolean r32 = r8.changedInstance(r5)
            if (r32 == 0) goto L_0x0171
            r32 = 4
            goto L_0x0173
        L_0x0171:
            r32 = 2
        L_0x0173:
            r32 = r12 | r32
            goto L_0x0178
        L_0x0176:
            r32 = r12
        L_0x0178:
            r5 = r9 & 2048(0x800, float:2.87E-42)
            if (r5 == 0) goto L_0x017f
            r32 = r32 | 48
            goto L_0x0192
        L_0x017f:
            r33 = r12 & 112(0x70, float:1.57E-43)
            r7 = r131
            if (r33 != 0) goto L_0x0192
            boolean r33 = r8.changedInstance(r7)
            if (r33 == 0) goto L_0x018e
            r33 = 32
            goto L_0x0190
        L_0x018e:
            r33 = 16
        L_0x0190:
            r32 = r32 | r33
        L_0x0192:
            r7 = r32
            r10 = r9 & 4096(0x1000, float:5.74E-42)
            if (r10 == 0) goto L_0x019b
            r7 = r7 | 384(0x180, float:5.38E-43)
            goto L_0x01af
        L_0x019b:
            r14 = r12 & 896(0x380, float:1.256E-42)
            if (r14 != 0) goto L_0x01af
            r14 = r132
            boolean r32 = r8.changedInstance(r14)
            if (r32 == 0) goto L_0x01aa
            r32 = 256(0x100, float:3.59E-43)
            goto L_0x01ac
        L_0x01aa:
            r32 = 128(0x80, float:1.794E-43)
        L_0x01ac:
            r7 = r7 | r32
            goto L_0x01b1
        L_0x01af:
            r14 = r132
        L_0x01b1:
            r14 = r9 & 8192(0x2000, float:1.14794E-41)
            if (r14 == 0) goto L_0x01b8
            r7 = r7 | 3072(0xc00, float:4.305E-42)
            goto L_0x01ca
        L_0x01b8:
            r15 = r12 & 7168(0x1c00, float:1.0045E-41)
            if (r15 != 0) goto L_0x01ca
            r15 = r133
            boolean r32 = r8.changed((boolean) r15)
            if (r32 == 0) goto L_0x01c5
            goto L_0x01c7
        L_0x01c5:
            r17 = r18
        L_0x01c7:
            r7 = r7 | r17
            goto L_0x01cc
        L_0x01ca:
            r15 = r133
        L_0x01cc:
            r15 = r9 & 16384(0x4000, float:2.2959E-41)
            if (r15 == 0) goto L_0x01d3
            r7 = r7 | 24576(0x6000, float:3.4438E-41)
            goto L_0x01ea
        L_0x01d3:
            r17 = 57344(0xe000, float:8.0356E-41)
            r17 = r12 & r17
            if (r17 != 0) goto L_0x01ea
            r17 = r15
            r15 = r134
            boolean r18 = r8.changed((java.lang.Object) r15)
            if (r18 == 0) goto L_0x01e5
            goto L_0x01e7
        L_0x01e5:
            r20 = r21
        L_0x01e7:
            r7 = r7 | r20
            goto L_0x01ee
        L_0x01ea:
            r17 = r15
            r15 = r134
        L_0x01ee:
            r18 = 32768(0x8000, float:4.5918E-41)
            r18 = r9 & r18
            if (r18 == 0) goto L_0x01fc
            r20 = 196608(0x30000, float:2.75506E-40)
            r7 = r7 | r20
            r15 = r135
            goto L_0x0211
        L_0x01fc:
            r20 = 458752(0x70000, float:6.42848E-40)
            r20 = r12 & r20
            r15 = r135
            if (r20 != 0) goto L_0x0211
            boolean r20 = r8.changed((java.lang.Object) r15)
            if (r20 == 0) goto L_0x020d
            r20 = r24
            goto L_0x020f
        L_0x020d:
            r20 = r25
        L_0x020f:
            r7 = r7 | r20
        L_0x0211:
            r20 = r9 & r25
            if (r20 == 0) goto L_0x021c
            r21 = 1572864(0x180000, float:2.204052E-39)
            r7 = r7 | r21
            r15 = r136
            goto L_0x0231
        L_0x021c:
            r21 = 3670016(0x380000, float:5.142788E-39)
            r21 = r12 & r21
            r15 = r136
            if (r21 != 0) goto L_0x0231
            boolean r21 = r8.changed((java.lang.Object) r15)
            if (r21 == 0) goto L_0x022d
            r21 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x022f
        L_0x022d:
            r21 = r27
        L_0x022f:
            r7 = r7 | r21
        L_0x0231:
            r21 = r9 & r24
            if (r21 == 0) goto L_0x023c
            r24 = 12582912(0xc00000, float:1.7632415E-38)
            r7 = r7 | r24
            r15 = r137
            goto L_0x0251
        L_0x023c:
            r24 = 29360128(0x1c00000, float:7.052966E-38)
            r24 = r12 & r24
            r15 = r137
            if (r24 != 0) goto L_0x0251
            boolean r24 = r8.changed((boolean) r15)
            if (r24 == 0) goto L_0x024d
            r24 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x024f
        L_0x024d:
            r24 = r30
        L_0x024f:
            r7 = r7 | r24
        L_0x0251:
            r24 = 234881024(0xe000000, float:1.5777218E-30)
            r24 = r12 & r24
            if (r24 != 0) goto L_0x026d
            r24 = 262144(0x40000, float:3.67342E-40)
            r24 = r9 & r24
            r15 = r138
            if (r24 != 0) goto L_0x0268
            boolean r24 = r8.changed((int) r15)
            if (r24 == 0) goto L_0x0268
            r24 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x026a
        L_0x0268:
            r24 = 33554432(0x2000000, float:9.403955E-38)
        L_0x026a:
            r7 = r7 | r24
            goto L_0x026f
        L_0x026d:
            r15 = r138
        L_0x026f:
            r24 = r9 & r27
            if (r24 == 0) goto L_0x027a
            r25 = 805306368(0x30000000, float:4.656613E-10)
            r7 = r7 | r25
            r12 = r139
            goto L_0x028f
        L_0x027a:
            r25 = 1879048192(0x70000000, float:1.58456325E29)
            r25 = r12 & r25
            r12 = r139
            if (r25 != 0) goto L_0x028f
            boolean r25 = r8.changed((int) r12)
            if (r25 == 0) goto L_0x028b
            r25 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x028d
        L_0x028b:
            r25 = 268435456(0x10000000, float:2.5243549E-29)
        L_0x028d:
            r7 = r7 | r25
        L_0x028f:
            r25 = 1048576(0x100000, float:1.469368E-39)
            r25 = r9 & r25
            if (r25 == 0) goto L_0x029a
            r22 = r11 | 6
            r12 = r140
            goto L_0x02b0
        L_0x029a:
            r27 = r11 & 14
            r12 = r140
            if (r27 != 0) goto L_0x02ae
            boolean r27 = r8.changed((java.lang.Object) r12)
            if (r27 == 0) goto L_0x02a9
            r22 = 4
            goto L_0x02ab
        L_0x02a9:
            r22 = 2
        L_0x02ab:
            r22 = r11 | r22
            goto L_0x02b0
        L_0x02ae:
            r22 = r11
        L_0x02b0:
            r27 = r11 & 112(0x70, float:1.57E-43)
            if (r27 != 0) goto L_0x02ca
            r27 = 2097152(0x200000, float:2.938736E-39)
            r27 = r9 & r27
            r12 = r141
            if (r27 != 0) goto L_0x02c5
            boolean r27 = r8.changed((java.lang.Object) r12)
            if (r27 == 0) goto L_0x02c5
            r23 = 32
            goto L_0x02c7
        L_0x02c5:
            r23 = 16
        L_0x02c7:
            r22 = r22 | r23
            goto L_0x02cc
        L_0x02ca:
            r12 = r141
        L_0x02cc:
            r12 = r11 & 896(0x380, float:1.256E-42)
            if (r12 != 0) goto L_0x02e6
            r12 = r9 & r30
            if (r12 != 0) goto L_0x02df
            r12 = r142
            boolean r23 = r8.changed((java.lang.Object) r12)
            if (r23 == 0) goto L_0x02e1
            r29 = 256(0x100, float:3.59E-43)
            goto L_0x02e3
        L_0x02df:
            r12 = r142
        L_0x02e1:
            r29 = 128(0x80, float:1.794E-43)
        L_0x02e3:
            r22 = r22 | r29
            goto L_0x02e8
        L_0x02e6:
            r12 = r142
        L_0x02e8:
            r11 = r22
            r22 = 1533916891(0x5b6db6db, float:6.6910621E16)
            r12 = r0 & r22
            r15 = 306783378(0x12492492, float:6.3469493E-28)
            if (r12 != r15) goto L_0x033a
            r12 = 1533916891(0x5b6db6db, float:6.6910621E16)
            r12 = r12 & r7
            r15 = 306783378(0x12492492, float:6.3469493E-28)
            if (r12 != r15) goto L_0x033a
            r12 = r11 & 731(0x2db, float:1.024E-42)
            r15 = 146(0x92, float:2.05E-43)
            if (r12 != r15) goto L_0x033a
            boolean r12 = r8.getSkipping()
            if (r12 != 0) goto L_0x030a
            goto L_0x033a
        L_0x030a:
            r8.skipToGroupEnd()
            r3 = r122
            r4 = r123
            r5 = r124
            r6 = r125
            r7 = r126
            r9 = r128
            r10 = r129
            r11 = r130
            r12 = r131
            r13 = r132
            r14 = r133
            r15 = r134
            r16 = r135
            r17 = r136
            r18 = r137
            r19 = r138
            r20 = r139
            r21 = r140
            r22 = r141
            r23 = r142
            r1 = r8
            r8 = r127
            goto L_0x06bf
        L_0x033a:
            r8.startDefaults()
            r12 = r13 & 1
            if (r12 == 0) goto L_0x03c8
            boolean r12 = r8.getDefaultsInvalid()
            if (r12 == 0) goto L_0x0349
            goto L_0x03c8
        L_0x0349:
            r8.skipToGroupEnd()
            r1 = r9 & 32
            if (r1 == 0) goto L_0x0354
            r1 = -458753(0xfffffffffff8ffff, float:NaN)
            r0 = r0 & r1
        L_0x0354:
            r1 = 262144(0x40000, float:3.67342E-40)
            r1 = r1 & r9
            if (r1 == 0) goto L_0x035d
            r1 = -234881025(0xfffffffff1ffffff, float:-2.535301E30)
            r7 = r7 & r1
        L_0x035d:
            r1 = 2097152(0x200000, float:2.938736E-39)
            r1 = r1 & r9
            if (r1 == 0) goto L_0x0364
            r11 = r11 & -113(0xffffffffffffff8f, float:NaN)
        L_0x0364:
            r1 = r9 & r30
            if (r1 == 0) goto L_0x0399
            r1 = r11 & -897(0xfffffffffffffc7f, float:NaN)
            r27 = r122
            r28 = r123
            r110 = r124
            r15 = r125
            r29 = r126
            r30 = r127
            r31 = r128
            r32 = r129
            r33 = r130
            r34 = r131
            r35 = r132
            r36 = r133
            r37 = r134
            r111 = r135
            r112 = r136
            r113 = r137
            r38 = r138
            r115 = r139
            r39 = r140
            r40 = r141
            r14 = r142
            r12 = r0
            r5 = r1
            r4 = r7
            goto L_0x0586
        L_0x0399:
            r27 = r122
            r28 = r123
            r110 = r124
            r15 = r125
            r29 = r126
            r30 = r127
            r31 = r128
            r32 = r129
            r33 = r130
            r34 = r131
            r35 = r132
            r36 = r133
            r37 = r134
            r111 = r135
            r112 = r136
            r113 = r137
            r38 = r138
            r115 = r139
            r39 = r140
            r40 = r141
            r14 = r142
            r12 = r0
            r4 = r7
            r5 = r11
            goto L_0x0586
        L_0x03c8:
            if (r3 == 0) goto L_0x03cf
            androidx.compose.ui.Modifier$Companion r3 = androidx.compose.ui.Modifier.Companion
            androidx.compose.ui.Modifier r3 = (androidx.compose.ui.Modifier) r3
            goto L_0x03d1
        L_0x03cf:
            r3 = r122
        L_0x03d1:
            if (r16 == 0) goto L_0x03d5
            r12 = 1
            goto L_0x03d7
        L_0x03d5:
            r12 = r123
        L_0x03d7:
            if (r19 == 0) goto L_0x03dc
            r110 = 0
            goto L_0x03de
        L_0x03dc:
            r110 = r124
        L_0x03de:
            r16 = r9 & 32
            if (r16 == 0) goto L_0x0404
            androidx.compose.runtime.ProvidableCompositionLocal r16 = androidx.compose.material3.TextKt.getLocalTextStyle()
            r15 = r16
            androidx.compose.runtime.CompositionLocal r15 = (androidx.compose.runtime.CompositionLocal) r15
            r122 = r3
            r3 = 2023513938(0x789c5f52, float:2.5372864E34)
            r123 = r12
            java.lang.String r12 = "CC:CompositionLocal.kt#9igjgp"
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(r8, r3, r12)
            java.lang.Object r3 = r8.consume(r15)
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(r8)
            androidx.compose.ui.text.TextStyle r3 = (androidx.compose.ui.text.TextStyle) r3
            r12 = -458753(0xfffffffffff8ffff, float:NaN)
            r0 = r0 & r12
            goto L_0x040a
        L_0x0404:
            r122 = r3
            r123 = r12
            r3 = r125
        L_0x040a:
            r12 = 0
            if (r26 == 0) goto L_0x040f
            r15 = r12
            goto L_0x0411
        L_0x040f:
            r15 = r126
        L_0x0411:
            if (r6 == 0) goto L_0x0415
            r6 = r12
            goto L_0x0417
        L_0x0415:
            r6 = r127
        L_0x0417:
            if (r1 == 0) goto L_0x041b
            r1 = r12
            goto L_0x041d
        L_0x041b:
            r1 = r128
        L_0x041d:
            if (r2 == 0) goto L_0x0421
            r2 = r12
            goto L_0x0423
        L_0x0421:
            r2 = r129
        L_0x0423:
            if (r4 == 0) goto L_0x0427
            r4 = r12
            goto L_0x0429
        L_0x0427:
            r4 = r130
        L_0x0429:
            if (r5 == 0) goto L_0x042d
            r5 = r12
            goto L_0x042f
        L_0x042d:
            r5 = r131
        L_0x042f:
            if (r10 == 0) goto L_0x0432
            goto L_0x0434
        L_0x0432:
            r12 = r132
        L_0x0434:
            if (r14 == 0) goto L_0x0438
            r10 = 0
            goto L_0x043a
        L_0x0438:
            r10 = r133
        L_0x043a:
            if (r17 == 0) goto L_0x0443
            androidx.compose.ui.text.input.VisualTransformation$Companion r14 = androidx.compose.ui.text.input.VisualTransformation.Companion
            androidx.compose.ui.text.input.VisualTransformation r14 = r14.getNone()
            goto L_0x0445
        L_0x0443:
            r14 = r134
        L_0x0445:
            if (r18 == 0) goto L_0x0450
            androidx.compose.foundation.text.KeyboardOptions$Companion r16 = androidx.compose.foundation.text.KeyboardOptions.Companion
            androidx.compose.foundation.text.KeyboardOptions r16 = r16.getDefault()
            r111 = r16
            goto L_0x0452
        L_0x0450:
            r111 = r135
        L_0x0452:
            if (r20 == 0) goto L_0x045d
            androidx.compose.foundation.text.KeyboardActions$Companion r16 = androidx.compose.foundation.text.KeyboardActions.Companion
            androidx.compose.foundation.text.KeyboardActions r16 = r16.getDefault()
            r112 = r16
            goto L_0x045f
        L_0x045d:
            r112 = r136
        L_0x045f:
            if (r21 == 0) goto L_0x0464
            r113 = 0
            goto L_0x0466
        L_0x0464:
            r113 = r137
        L_0x0466:
            r16 = 262144(0x40000, float:3.67342E-40)
            r16 = r9 & r16
            if (r16 == 0) goto L_0x047e
            if (r113 == 0) goto L_0x0471
            r16 = 1
            goto L_0x0474
        L_0x0471:
            r16 = 2147483647(0x7fffffff, float:NaN)
        L_0x0474:
            r17 = -234881025(0xfffffffff1ffffff, float:-2.535301E30)
            r7 = r7 & r17
            r114 = r7
            r7 = r16
            goto L_0x0482
        L_0x047e:
            r114 = r7
            r7 = r138
        L_0x0482:
            if (r24 == 0) goto L_0x0487
            r115 = 1
            goto L_0x0489
        L_0x0487:
            r115 = r139
        L_0x0489:
            r124 = r0
            if (r25 == 0) goto L_0x04b3
            r0 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r8.startReplaceableGroup(r0)
            java.lang.String r0 = "CC(remember):Composables.kt#9igjgp"
            androidx.compose.runtime.ComposerKt.sourceInformation(r8, r0)
            java.lang.Object r0 = r8.rememberedValue()
            androidx.compose.runtime.Composer$Companion r16 = androidx.compose.runtime.Composer.Companion
            r125 = r1
            java.lang.Object r1 = r16.getEmpty()
            if (r0 != r1) goto L_0x04ad
            androidx.compose.foundation.interaction.MutableInteractionSource r0 = androidx.compose.foundation.interaction.InteractionSourceKt.MutableInteractionSource()
            r8.updateRememberedValue(r0)
        L_0x04ad:
            r8.endReplaceableGroup()
            androidx.compose.foundation.interaction.MutableInteractionSource r0 = (androidx.compose.foundation.interaction.MutableInteractionSource) r0
            goto L_0x04b7
        L_0x04b3:
            r125 = r1
            r0 = r140
        L_0x04b7:
            r1 = 2097152(0x200000, float:2.938736E-39)
            r1 = r1 & r9
            if (r1 == 0) goto L_0x04c8
            androidx.compose.material3.TextFieldDefaults r1 = androidx.compose.material3.TextFieldDefaults.INSTANCE
            r126 = r0
            r0 = 6
            androidx.compose.ui.graphics.Shape r0 = r1.getShape(r8, r0)
            r11 = r11 & -113(0xffffffffffffff8f, float:NaN)
            goto L_0x04cc
        L_0x04c8:
            r126 = r0
            r0 = r141
        L_0x04cc:
            r1 = r9 & r30
            if (r1 == 0) goto L_0x0562
            androidx.compose.material3.TextFieldDefaults r16 = androidx.compose.material3.TextFieldDefaults.INSTANCE
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
            r38 = 0
            r40 = 0
            r42 = 0
            r44 = 0
            r46 = 0
            r48 = 0
            r50 = 0
            r52 = 0
            r54 = 0
            r56 = 0
            r58 = 0
            r60 = 0
            r62 = 0
            r64 = 0
            r66 = 0
            r68 = 0
            r70 = 0
            r72 = 0
            r74 = 0
            r76 = 0
            r78 = 0
            r80 = 0
            r82 = 0
            r84 = 0
            r86 = 0
            r88 = 0
            r90 = 0
            r92 = 0
            r94 = 0
            r96 = 0
            r98 = 0
            r100 = 0
            r103 = 0
            r104 = 0
            r105 = 0
            r106 = 0
            r107 = 3072(0xc00, float:4.305E-42)
            r108 = 2147483647(0x7fffffff, float:NaN)
            r109 = 4095(0xfff, float:5.738E-42)
            r102 = r8
            androidx.compose.material3.TextFieldColors r1 = r16.m1696colors0hiis_0(r17, r19, r21, r23, r25, r27, r29, r31, r33, r35, r37, r38, r40, r42, r44, r46, r48, r50, r52, r54, r56, r58, r60, r62, r64, r66, r68, r70, r72, r74, r76, r78, r80, r82, r84, r86, r88, r90, r92, r94, r96, r98, r100, r102, r103, r104, r105, r106, r107, r108, r109)
            r11 = r11 & -897(0xfffffffffffffc7f, float:NaN)
            r27 = r122
            r28 = r123
            r31 = r125
            r39 = r126
            r40 = r0
            r32 = r2
            r33 = r4
            r34 = r5
            r30 = r6
            r38 = r7
            r36 = r10
            r5 = r11
            r35 = r12
            r37 = r14
            r29 = r15
            r4 = r114
            r12 = r124
            r14 = r1
            goto L_0x0585
        L_0x0562:
            r27 = r122
            r28 = r123
            r31 = r125
            r39 = r126
            r40 = r0
            r32 = r2
            r33 = r4
            r34 = r5
            r30 = r6
            r38 = r7
            r36 = r10
            r5 = r11
            r35 = r12
            r37 = r14
            r29 = r15
            r4 = r114
            r12 = r124
            r14 = r142
        L_0x0585:
            r15 = r3
        L_0x0586:
            r8.endDefaults()
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto L_0x0598
            r0 = -676242365(0xffffffffd7b15c43, float:-3.90019638E14)
            java.lang.String r1 = "androidx.compose.material3.TextField (TextField.kt:165)"
            androidx.compose.runtime.ComposerKt.traceEventStart(r0, r12, r4, r1)
        L_0x0598:
            r0 = -1263331616(0xffffffffb4b316e0, float:-3.3357992E-7)
            r8.startReplaceableGroup(r0)
            java.lang.String r0 = "*192@9990L46"
            androidx.compose.runtime.ComposerKt.sourceInformation(r8, r0)
            long r0 = r15.m5151getColor0d7_KjU()
            androidx.compose.ui.graphics.Color$Companion r2 = androidx.compose.ui.graphics.Color.Companion
            long r2 = r2.m2857getUnspecified0d7_KjU()
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 == 0) goto L_0x05b2
            goto L_0x05e3
        L_0x05b2:
            r0 = r39
            androidx.compose.foundation.interaction.InteractionSource r0 = (androidx.compose.foundation.interaction.InteractionSource) r0
            int r1 = r12 >> 9
            r1 = r1 & 14
            int r2 = r4 >> 6
            r2 = r2 & 112(0x70, float:1.57E-43)
            r1 = r1 | r2
            int r2 = r5 << 6
            r2 = r2 & 896(0x380, float:1.256E-42)
            r1 = r1 | r2
            int r2 = r5 << 3
            r2 = r2 & 7168(0x1c00, float:1.0045E-41)
            r1 = r1 | r2
            r122 = r14
            r123 = r28
            r124 = r36
            r125 = r0
            r126 = r8
            r127 = r1
            androidx.compose.runtime.State r0 = r122.textColor$material3_release(r123, r124, r125, r126, r127)
            java.lang.Object r0 = r0.getValue()
            androidx.compose.ui.graphics.Color r0 = (androidx.compose.ui.graphics.Color) r0
            long r0 = r0.m2831unboximpl()
        L_0x05e3:
            r42 = r0
            r8.endReplaceableGroup()
            androidx.compose.ui.text.TextStyle r0 = new androidx.compose.ui.text.TextStyle
            r41 = r0
            r44 = 0
            r46 = 0
            r47 = 0
            r48 = 0
            r49 = 0
            r50 = 0
            r51 = 0
            r53 = 0
            r54 = 0
            r55 = 0
            r56 = 0
            r58 = 0
            r59 = 0
            r60 = 0
            r61 = 0
            r62 = 0
            r64 = 0
            r65 = 0
            r66 = 0
            r67 = 0
            r68 = 0
            r69 = 4194302(0x3ffffe, float:5.877469E-39)
            r70 = 0
            r41.<init>((long) r42, (long) r44, (androidx.compose.ui.text.font.FontWeight) r46, (androidx.compose.ui.text.font.FontStyle) r47, (androidx.compose.ui.text.font.FontSynthesis) r48, (androidx.compose.ui.text.font.FontFamily) r49, (java.lang.String) r50, (long) r51, (androidx.compose.ui.text.style.BaselineShift) r53, (androidx.compose.ui.text.style.TextGeometricTransform) r54, (androidx.compose.ui.text.intl.LocaleList) r55, (long) r56, (androidx.compose.ui.text.style.TextDecoration) r58, (androidx.compose.ui.graphics.Shadow) r59, (androidx.compose.ui.text.style.TextAlign) r60, (androidx.compose.ui.text.style.TextDirection) r61, (long) r62, (androidx.compose.ui.text.style.TextIndent) r64, (androidx.compose.ui.text.PlatformTextStyle) r65, (androidx.compose.ui.text.style.LineHeightStyle) r66, (androidx.compose.ui.text.style.LineBreak) r67, (androidx.compose.ui.text.style.Hyphens) r68, (int) r69, (kotlin.jvm.internal.DefaultConstructorMarker) r70)
            androidx.compose.ui.text.TextStyle r10 = r15.merge((androidx.compose.ui.text.TextStyle) r0)
            r11 = 1
            androidx.compose.runtime.ProvidedValue[] r7 = new androidx.compose.runtime.ProvidedValue[r11]
            androidx.compose.runtime.ProvidableCompositionLocal r0 = androidx.compose.foundation.text.selection.TextSelectionColorsKt.getLocalTextSelectionColors()
            int r1 = r5 >> 6
            r1 = r1 & 14
            androidx.compose.foundation.text.selection.TextSelectionColors r1 = r14.getSelectionColors(r8, r1)
            androidx.compose.runtime.ProvidedValue r0 = r0.provides(r1)
            r1 = 0
            r7[r1] = r0
            androidx.compose.material3.TextFieldKt$TextField$2 r6 = new androidx.compose.material3.TextFieldKt$TextField$2
            r0 = r6
            r1 = r27
            r2 = r14
            r3 = r36
            r116 = r6
            r6 = r120
            r117 = r7
            r7 = r121
            r118 = r8
            r8 = r28
            r9 = r110
            r16 = r11
            r11 = r111
            r18 = r12
            r12 = r112
            r13 = r113
            r41 = r14
            r14 = r38
            r42 = r15
            r15 = r115
            r16 = r37
            r17 = r39
            r19 = r29
            r20 = r30
            r21 = r31
            r22 = r32
            r23 = r33
            r24 = r34
            r25 = r35
            r26 = r40
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            r0 = 1859145987(0x6ed05103, float:3.223541E28)
            r2 = r116
            r1 = r118
            r3 = 1
            androidx.compose.runtime.internal.ComposableLambda r0 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(r1, r0, r3, r2)
            kotlin.jvm.functions.Function2 r0 = (kotlin.jvm.functions.Function2) r0
            r2 = 56
            r3 = r117
            androidx.compose.runtime.CompositionLocalKt.CompositionLocalProvider((androidx.compose.runtime.ProvidedValue<?>[]) r3, (kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>) r0, (androidx.compose.runtime.Composer) r1, (int) r2)
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto L_0x0695
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L_0x0695:
            r3 = r27
            r4 = r28
            r7 = r29
            r8 = r30
            r9 = r31
            r10 = r32
            r11 = r33
            r12 = r34
            r13 = r35
            r14 = r36
            r15 = r37
            r19 = r38
            r21 = r39
            r22 = r40
            r23 = r41
            r6 = r42
            r5 = r110
            r16 = r111
            r17 = r112
            r18 = r113
            r20 = r115
        L_0x06bf:
            androidx.compose.runtime.ScopeUpdateScope r2 = r1.endRestartGroup()
            if (r2 != 0) goto L_0x06c6
            goto L_0x06e4
        L_0x06c6:
            androidx.compose.material3.TextFieldKt$TextField$3 r28 = new androidx.compose.material3.TextFieldKt$TextField$3
            r0 = r28
            r1 = r120
            r119 = r2
            r2 = r121
            r24 = r144
            r25 = r145
            r26 = r146
            r27 = r147
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            r0 = r28
            kotlin.jvm.functions.Function2 r0 = (kotlin.jvm.functions.Function2) r0
            r1 = r119
            r1.updateScope(r0)
        L_0x06e4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.TextFieldKt.TextField(java.lang.String, kotlin.jvm.functions.Function1, androidx.compose.ui.Modifier, boolean, boolean, androidx.compose.ui.text.TextStyle, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, boolean, androidx.compose.ui.text.input.VisualTransformation, androidx.compose.foundation.text.KeyboardOptions, androidx.compose.foundation.text.KeyboardActions, boolean, int, int, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.ui.graphics.Shape, androidx.compose.material3.TextFieldColors, androidx.compose.runtime.Composer, int, int, int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:105:0x015d  */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x0162  */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x017c  */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x017f  */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x0198  */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x019b  */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x01b5  */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x01b8  */
    /* JADX WARNING: Removed duplicated region for block: B:147:0x01d0  */
    /* JADX WARNING: Removed duplicated region for block: B:148:0x01d3  */
    /* JADX WARNING: Removed duplicated region for block: B:157:0x01f5  */
    /* JADX WARNING: Removed duplicated region for block: B:158:0x01fc  */
    /* JADX WARNING: Removed duplicated region for block: B:167:0x0215  */
    /* JADX WARNING: Removed duplicated region for block: B:168:0x021c  */
    /* JADX WARNING: Removed duplicated region for block: B:177:0x0235  */
    /* JADX WARNING: Removed duplicated region for block: B:178:0x023c  */
    /* JADX WARNING: Removed duplicated region for block: B:187:0x0257  */
    /* JADX WARNING: Removed duplicated region for block: B:194:0x026d  */
    /* JADX WARNING: Removed duplicated region for block: B:197:0x0273  */
    /* JADX WARNING: Removed duplicated region for block: B:198:0x027a  */
    /* JADX WARNING: Removed duplicated region for block: B:207:0x0295  */
    /* JADX WARNING: Removed duplicated region for block: B:208:0x029a  */
    /* JADX WARNING: Removed duplicated region for block: B:218:0x02b4  */
    /* JADX WARNING: Removed duplicated region for block: B:225:0x02ca  */
    /* JADX WARNING: Removed duplicated region for block: B:228:0x02d0  */
    /* JADX WARNING: Removed duplicated region for block: B:236:0x02e6  */
    /* JADX WARNING: Removed duplicated region for block: B:245:0x030a  */
    /* JADX WARNING: Removed duplicated region for block: B:246:0x033a  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0079  */
    /* JADX WARNING: Removed duplicated region for block: B:350:0x06c6  */
    /* JADX WARNING: Removed duplicated region for block: B:352:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x007c  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x009a  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x009f  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00bf  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x00d3  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00db  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00e2  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x00fd  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x0104  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x011d  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x0124  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x013d  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x0144  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void TextField(androidx.compose.ui.text.input.TextFieldValue r120, kotlin.jvm.functions.Function1<? super androidx.compose.ui.text.input.TextFieldValue, kotlin.Unit> r121, androidx.compose.ui.Modifier r122, boolean r123, boolean r124, androidx.compose.ui.text.TextStyle r125, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r126, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r127, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r128, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r129, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r130, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r131, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r132, boolean r133, androidx.compose.ui.text.input.VisualTransformation r134, androidx.compose.foundation.text.KeyboardOptions r135, androidx.compose.foundation.text.KeyboardActions r136, boolean r137, int r138, int r139, androidx.compose.foundation.interaction.MutableInteractionSource r140, androidx.compose.ui.graphics.Shape r141, androidx.compose.material3.TextFieldColors r142, androidx.compose.runtime.Composer r143, int r144, int r145, int r146, int r147) {
        /*
            r15 = r120
            r14 = r121
            r13 = r144
            r12 = r145
            r11 = r146
            r9 = r147
            java.lang.String r0 = "value"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r15, r0)
            java.lang.String r0 = "onValueChange"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r14, r0)
            r0 = -1268528240(0xffffffffb463cb90, float:-2.1215078E-7)
            r1 = r143
            androidx.compose.runtime.Composer r8 = r1.startRestartGroup(r0)
            java.lang.String r0 = "C(TextField)P(21,11,10,1,14,19,6,12,7,20,13,17,18,3,22,5,4,16,8,9,2,15)316@17035L7,331@17787L39,332@17865L5,333@17920L8,341@18282L15,341@18216L1830:TextField.kt#uh7d8r"
            androidx.compose.runtime.ComposerKt.sourceInformation(r8, r0)
            r0 = r9 & 1
            if (r0 == 0) goto L_0x002d
            r0 = r13 | 6
            goto L_0x003d
        L_0x002d:
            r0 = r13 & 14
            if (r0 != 0) goto L_0x003c
            boolean r0 = r8.changed((java.lang.Object) r15)
            if (r0 == 0) goto L_0x0039
            r0 = 4
            goto L_0x003a
        L_0x0039:
            r0 = 2
        L_0x003a:
            r0 = r0 | r13
            goto L_0x003d
        L_0x003c:
            r0 = r13
        L_0x003d:
            r3 = r9 & 2
            if (r3 == 0) goto L_0x0044
            r0 = r0 | 48
            goto L_0x0054
        L_0x0044:
            r3 = r13 & 112(0x70, float:1.57E-43)
            if (r3 != 0) goto L_0x0054
            boolean r3 = r8.changedInstance(r14)
            if (r3 == 0) goto L_0x0051
            r3 = 32
            goto L_0x0053
        L_0x0051:
            r3 = 16
        L_0x0053:
            r0 = r0 | r3
        L_0x0054:
            r3 = r9 & 4
            if (r3 == 0) goto L_0x005b
            r0 = r0 | 384(0x180, float:5.38E-43)
            goto L_0x006f
        L_0x005b:
            r10 = r13 & 896(0x380, float:1.256E-42)
            if (r10 != 0) goto L_0x006f
            r10 = r122
            boolean r16 = r8.changed((java.lang.Object) r10)
            if (r16 == 0) goto L_0x006a
            r16 = 256(0x100, float:3.59E-43)
            goto L_0x006c
        L_0x006a:
            r16 = 128(0x80, float:1.794E-43)
        L_0x006c:
            r0 = r0 | r16
            goto L_0x0071
        L_0x006f:
            r10 = r122
        L_0x0071:
            r16 = r9 & 8
            r17 = 2048(0x800, float:2.87E-42)
            r18 = 1024(0x400, float:1.435E-42)
            if (r16 == 0) goto L_0x007c
            r0 = r0 | 3072(0xc00, float:4.305E-42)
            goto L_0x0090
        L_0x007c:
            r1 = r13 & 7168(0x1c00, float:1.0045E-41)
            if (r1 != 0) goto L_0x0090
            r1 = r123
            boolean r19 = r8.changed((boolean) r1)
            if (r19 == 0) goto L_0x008b
            r19 = r17
            goto L_0x008d
        L_0x008b:
            r19 = r18
        L_0x008d:
            r0 = r0 | r19
            goto L_0x0092
        L_0x0090:
            r1 = r123
        L_0x0092:
            r19 = r9 & 16
            r20 = 16384(0x4000, float:2.2959E-41)
            r21 = 8192(0x2000, float:1.14794E-41)
            if (r19 == 0) goto L_0x009f
            r0 = r0 | 24576(0x6000, float:3.4438E-41)
            r2 = r124
            goto L_0x00b5
        L_0x009f:
            r22 = 57344(0xe000, float:8.0356E-41)
            r22 = r13 & r22
            r2 = r124
            if (r22 != 0) goto L_0x00b5
            boolean r23 = r8.changed((boolean) r2)
            if (r23 == 0) goto L_0x00b1
            r23 = r20
            goto L_0x00b3
        L_0x00b1:
            r23 = r21
        L_0x00b3:
            r0 = r0 | r23
        L_0x00b5:
            r23 = 458752(0x70000, float:6.42848E-40)
            r23 = r13 & r23
            r24 = 131072(0x20000, float:1.83671E-40)
            r25 = 65536(0x10000, float:9.18355E-41)
            if (r23 != 0) goto L_0x00d3
            r23 = r9 & 32
            r4 = r125
            if (r23 != 0) goto L_0x00ce
            boolean r26 = r8.changed((java.lang.Object) r4)
            if (r26 == 0) goto L_0x00ce
            r26 = r24
            goto L_0x00d0
        L_0x00ce:
            r26 = r25
        L_0x00d0:
            r0 = r0 | r26
            goto L_0x00d5
        L_0x00d3:
            r4 = r125
        L_0x00d5:
            r26 = r9 & 64
            r27 = 524288(0x80000, float:7.34684E-40)
            if (r26 == 0) goto L_0x00e2
            r28 = 1572864(0x180000, float:2.204052E-39)
            r0 = r0 | r28
            r5 = r126
            goto L_0x00f7
        L_0x00e2:
            r28 = 3670016(0x380000, float:5.142788E-39)
            r28 = r13 & r28
            r5 = r126
            if (r28 != 0) goto L_0x00f7
            boolean r29 = r8.changedInstance(r5)
            if (r29 == 0) goto L_0x00f3
            r29 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00f5
        L_0x00f3:
            r29 = r27
        L_0x00f5:
            r0 = r0 | r29
        L_0x00f7:
            r6 = r9 & 128(0x80, float:1.794E-43)
            r30 = 4194304(0x400000, float:5.877472E-39)
            if (r6 == 0) goto L_0x0104
            r31 = 12582912(0xc00000, float:1.7632415E-38)
            r0 = r0 | r31
            r7 = r127
            goto L_0x0119
        L_0x0104:
            r31 = 29360128(0x1c00000, float:7.052966E-38)
            r31 = r13 & r31
            r7 = r127
            if (r31 != 0) goto L_0x0119
            boolean r32 = r8.changedInstance(r7)
            if (r32 == 0) goto L_0x0115
            r32 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x0117
        L_0x0115:
            r32 = r30
        L_0x0117:
            r0 = r0 | r32
        L_0x0119:
            r1 = r9 & 256(0x100, float:3.59E-43)
            if (r1 == 0) goto L_0x0124
            r32 = 100663296(0x6000000, float:2.4074124E-35)
            r0 = r0 | r32
            r2 = r128
            goto L_0x0139
        L_0x0124:
            r32 = 234881024(0xe000000, float:1.5777218E-30)
            r32 = r13 & r32
            r2 = r128
            if (r32 != 0) goto L_0x0139
            boolean r32 = r8.changedInstance(r2)
            if (r32 == 0) goto L_0x0135
            r32 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x0137
        L_0x0135:
            r32 = 33554432(0x2000000, float:9.403955E-38)
        L_0x0137:
            r0 = r0 | r32
        L_0x0139:
            r2 = r9 & 512(0x200, float:7.175E-43)
            if (r2 == 0) goto L_0x0144
            r32 = 805306368(0x30000000, float:4.656613E-10)
            r0 = r0 | r32
            r4 = r129
            goto L_0x0159
        L_0x0144:
            r32 = 1879048192(0x70000000, float:1.58456325E29)
            r32 = r13 & r32
            r4 = r129
            if (r32 != 0) goto L_0x0159
            boolean r32 = r8.changedInstance(r4)
            if (r32 == 0) goto L_0x0155
            r32 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x0157
        L_0x0155:
            r32 = 268435456(0x10000000, float:2.5243549E-29)
        L_0x0157:
            r0 = r0 | r32
        L_0x0159:
            r4 = r9 & 1024(0x400, float:1.435E-42)
            if (r4 == 0) goto L_0x0162
            r32 = r12 | 6
            r5 = r130
            goto L_0x0178
        L_0x0162:
            r32 = r12 & 14
            r5 = r130
            if (r32 != 0) goto L_0x0176
            boolean r32 = r8.changedInstance(r5)
            if (r32 == 0) goto L_0x0171
            r32 = 4
            goto L_0x0173
        L_0x0171:
            r32 = 2
        L_0x0173:
            r32 = r12 | r32
            goto L_0x0178
        L_0x0176:
            r32 = r12
        L_0x0178:
            r5 = r9 & 2048(0x800, float:2.87E-42)
            if (r5 == 0) goto L_0x017f
            r32 = r32 | 48
            goto L_0x0192
        L_0x017f:
            r33 = r12 & 112(0x70, float:1.57E-43)
            r7 = r131
            if (r33 != 0) goto L_0x0192
            boolean r33 = r8.changedInstance(r7)
            if (r33 == 0) goto L_0x018e
            r33 = 32
            goto L_0x0190
        L_0x018e:
            r33 = 16
        L_0x0190:
            r32 = r32 | r33
        L_0x0192:
            r7 = r32
            r10 = r9 & 4096(0x1000, float:5.74E-42)
            if (r10 == 0) goto L_0x019b
            r7 = r7 | 384(0x180, float:5.38E-43)
            goto L_0x01af
        L_0x019b:
            r14 = r12 & 896(0x380, float:1.256E-42)
            if (r14 != 0) goto L_0x01af
            r14 = r132
            boolean r32 = r8.changedInstance(r14)
            if (r32 == 0) goto L_0x01aa
            r32 = 256(0x100, float:3.59E-43)
            goto L_0x01ac
        L_0x01aa:
            r32 = 128(0x80, float:1.794E-43)
        L_0x01ac:
            r7 = r7 | r32
            goto L_0x01b1
        L_0x01af:
            r14 = r132
        L_0x01b1:
            r14 = r9 & 8192(0x2000, float:1.14794E-41)
            if (r14 == 0) goto L_0x01b8
            r7 = r7 | 3072(0xc00, float:4.305E-42)
            goto L_0x01ca
        L_0x01b8:
            r15 = r12 & 7168(0x1c00, float:1.0045E-41)
            if (r15 != 0) goto L_0x01ca
            r15 = r133
            boolean r32 = r8.changed((boolean) r15)
            if (r32 == 0) goto L_0x01c5
            goto L_0x01c7
        L_0x01c5:
            r17 = r18
        L_0x01c7:
            r7 = r7 | r17
            goto L_0x01cc
        L_0x01ca:
            r15 = r133
        L_0x01cc:
            r15 = r9 & 16384(0x4000, float:2.2959E-41)
            if (r15 == 0) goto L_0x01d3
            r7 = r7 | 24576(0x6000, float:3.4438E-41)
            goto L_0x01ea
        L_0x01d3:
            r17 = 57344(0xe000, float:8.0356E-41)
            r17 = r12 & r17
            if (r17 != 0) goto L_0x01ea
            r17 = r15
            r15 = r134
            boolean r18 = r8.changed((java.lang.Object) r15)
            if (r18 == 0) goto L_0x01e5
            goto L_0x01e7
        L_0x01e5:
            r20 = r21
        L_0x01e7:
            r7 = r7 | r20
            goto L_0x01ee
        L_0x01ea:
            r17 = r15
            r15 = r134
        L_0x01ee:
            r18 = 32768(0x8000, float:4.5918E-41)
            r18 = r9 & r18
            if (r18 == 0) goto L_0x01fc
            r20 = 196608(0x30000, float:2.75506E-40)
            r7 = r7 | r20
            r15 = r135
            goto L_0x0211
        L_0x01fc:
            r20 = 458752(0x70000, float:6.42848E-40)
            r20 = r12 & r20
            r15 = r135
            if (r20 != 0) goto L_0x0211
            boolean r20 = r8.changed((java.lang.Object) r15)
            if (r20 == 0) goto L_0x020d
            r20 = r24
            goto L_0x020f
        L_0x020d:
            r20 = r25
        L_0x020f:
            r7 = r7 | r20
        L_0x0211:
            r20 = r9 & r25
            if (r20 == 0) goto L_0x021c
            r21 = 1572864(0x180000, float:2.204052E-39)
            r7 = r7 | r21
            r15 = r136
            goto L_0x0231
        L_0x021c:
            r21 = 3670016(0x380000, float:5.142788E-39)
            r21 = r12 & r21
            r15 = r136
            if (r21 != 0) goto L_0x0231
            boolean r21 = r8.changed((java.lang.Object) r15)
            if (r21 == 0) goto L_0x022d
            r21 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x022f
        L_0x022d:
            r21 = r27
        L_0x022f:
            r7 = r7 | r21
        L_0x0231:
            r21 = r9 & r24
            if (r21 == 0) goto L_0x023c
            r24 = 12582912(0xc00000, float:1.7632415E-38)
            r7 = r7 | r24
            r15 = r137
            goto L_0x0251
        L_0x023c:
            r24 = 29360128(0x1c00000, float:7.052966E-38)
            r24 = r12 & r24
            r15 = r137
            if (r24 != 0) goto L_0x0251
            boolean r24 = r8.changed((boolean) r15)
            if (r24 == 0) goto L_0x024d
            r24 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x024f
        L_0x024d:
            r24 = r30
        L_0x024f:
            r7 = r7 | r24
        L_0x0251:
            r24 = 234881024(0xe000000, float:1.5777218E-30)
            r24 = r12 & r24
            if (r24 != 0) goto L_0x026d
            r24 = 262144(0x40000, float:3.67342E-40)
            r24 = r9 & r24
            r15 = r138
            if (r24 != 0) goto L_0x0268
            boolean r24 = r8.changed((int) r15)
            if (r24 == 0) goto L_0x0268
            r24 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x026a
        L_0x0268:
            r24 = 33554432(0x2000000, float:9.403955E-38)
        L_0x026a:
            r7 = r7 | r24
            goto L_0x026f
        L_0x026d:
            r15 = r138
        L_0x026f:
            r24 = r9 & r27
            if (r24 == 0) goto L_0x027a
            r25 = 805306368(0x30000000, float:4.656613E-10)
            r7 = r7 | r25
            r12 = r139
            goto L_0x028f
        L_0x027a:
            r25 = 1879048192(0x70000000, float:1.58456325E29)
            r25 = r12 & r25
            r12 = r139
            if (r25 != 0) goto L_0x028f
            boolean r25 = r8.changed((int) r12)
            if (r25 == 0) goto L_0x028b
            r25 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x028d
        L_0x028b:
            r25 = 268435456(0x10000000, float:2.5243549E-29)
        L_0x028d:
            r7 = r7 | r25
        L_0x028f:
            r25 = 1048576(0x100000, float:1.469368E-39)
            r25 = r9 & r25
            if (r25 == 0) goto L_0x029a
            r22 = r11 | 6
            r12 = r140
            goto L_0x02b0
        L_0x029a:
            r27 = r11 & 14
            r12 = r140
            if (r27 != 0) goto L_0x02ae
            boolean r27 = r8.changed((java.lang.Object) r12)
            if (r27 == 0) goto L_0x02a9
            r22 = 4
            goto L_0x02ab
        L_0x02a9:
            r22 = 2
        L_0x02ab:
            r22 = r11 | r22
            goto L_0x02b0
        L_0x02ae:
            r22 = r11
        L_0x02b0:
            r27 = r11 & 112(0x70, float:1.57E-43)
            if (r27 != 0) goto L_0x02ca
            r27 = 2097152(0x200000, float:2.938736E-39)
            r27 = r9 & r27
            r12 = r141
            if (r27 != 0) goto L_0x02c5
            boolean r27 = r8.changed((java.lang.Object) r12)
            if (r27 == 0) goto L_0x02c5
            r23 = 32
            goto L_0x02c7
        L_0x02c5:
            r23 = 16
        L_0x02c7:
            r22 = r22 | r23
            goto L_0x02cc
        L_0x02ca:
            r12 = r141
        L_0x02cc:
            r12 = r11 & 896(0x380, float:1.256E-42)
            if (r12 != 0) goto L_0x02e6
            r12 = r9 & r30
            if (r12 != 0) goto L_0x02df
            r12 = r142
            boolean r23 = r8.changed((java.lang.Object) r12)
            if (r23 == 0) goto L_0x02e1
            r29 = 256(0x100, float:3.59E-43)
            goto L_0x02e3
        L_0x02df:
            r12 = r142
        L_0x02e1:
            r29 = 128(0x80, float:1.794E-43)
        L_0x02e3:
            r22 = r22 | r29
            goto L_0x02e8
        L_0x02e6:
            r12 = r142
        L_0x02e8:
            r11 = r22
            r22 = 1533916891(0x5b6db6db, float:6.6910621E16)
            r12 = r0 & r22
            r15 = 306783378(0x12492492, float:6.3469493E-28)
            if (r12 != r15) goto L_0x033a
            r12 = 1533916891(0x5b6db6db, float:6.6910621E16)
            r12 = r12 & r7
            r15 = 306783378(0x12492492, float:6.3469493E-28)
            if (r12 != r15) goto L_0x033a
            r12 = r11 & 731(0x2db, float:1.024E-42)
            r15 = 146(0x92, float:2.05E-43)
            if (r12 != r15) goto L_0x033a
            boolean r12 = r8.getSkipping()
            if (r12 != 0) goto L_0x030a
            goto L_0x033a
        L_0x030a:
            r8.skipToGroupEnd()
            r3 = r122
            r4 = r123
            r5 = r124
            r6 = r125
            r7 = r126
            r9 = r128
            r10 = r129
            r11 = r130
            r12 = r131
            r13 = r132
            r14 = r133
            r15 = r134
            r16 = r135
            r17 = r136
            r18 = r137
            r19 = r138
            r20 = r139
            r21 = r140
            r22 = r141
            r23 = r142
            r1 = r8
            r8 = r127
            goto L_0x06bf
        L_0x033a:
            r8.startDefaults()
            r12 = r13 & 1
            if (r12 == 0) goto L_0x03c8
            boolean r12 = r8.getDefaultsInvalid()
            if (r12 == 0) goto L_0x0349
            goto L_0x03c8
        L_0x0349:
            r8.skipToGroupEnd()
            r1 = r9 & 32
            if (r1 == 0) goto L_0x0354
            r1 = -458753(0xfffffffffff8ffff, float:NaN)
            r0 = r0 & r1
        L_0x0354:
            r1 = 262144(0x40000, float:3.67342E-40)
            r1 = r1 & r9
            if (r1 == 0) goto L_0x035d
            r1 = -234881025(0xfffffffff1ffffff, float:-2.535301E30)
            r7 = r7 & r1
        L_0x035d:
            r1 = 2097152(0x200000, float:2.938736E-39)
            r1 = r1 & r9
            if (r1 == 0) goto L_0x0364
            r11 = r11 & -113(0xffffffffffffff8f, float:NaN)
        L_0x0364:
            r1 = r9 & r30
            if (r1 == 0) goto L_0x0399
            r1 = r11 & -897(0xfffffffffffffc7f, float:NaN)
            r27 = r122
            r28 = r123
            r110 = r124
            r15 = r125
            r29 = r126
            r30 = r127
            r31 = r128
            r32 = r129
            r33 = r130
            r34 = r131
            r35 = r132
            r36 = r133
            r37 = r134
            r111 = r135
            r112 = r136
            r113 = r137
            r38 = r138
            r115 = r139
            r39 = r140
            r40 = r141
            r14 = r142
            r12 = r0
            r5 = r1
            r4 = r7
            goto L_0x0586
        L_0x0399:
            r27 = r122
            r28 = r123
            r110 = r124
            r15 = r125
            r29 = r126
            r30 = r127
            r31 = r128
            r32 = r129
            r33 = r130
            r34 = r131
            r35 = r132
            r36 = r133
            r37 = r134
            r111 = r135
            r112 = r136
            r113 = r137
            r38 = r138
            r115 = r139
            r39 = r140
            r40 = r141
            r14 = r142
            r12 = r0
            r4 = r7
            r5 = r11
            goto L_0x0586
        L_0x03c8:
            if (r3 == 0) goto L_0x03cf
            androidx.compose.ui.Modifier$Companion r3 = androidx.compose.ui.Modifier.Companion
            androidx.compose.ui.Modifier r3 = (androidx.compose.ui.Modifier) r3
            goto L_0x03d1
        L_0x03cf:
            r3 = r122
        L_0x03d1:
            if (r16 == 0) goto L_0x03d5
            r12 = 1
            goto L_0x03d7
        L_0x03d5:
            r12 = r123
        L_0x03d7:
            if (r19 == 0) goto L_0x03dc
            r110 = 0
            goto L_0x03de
        L_0x03dc:
            r110 = r124
        L_0x03de:
            r16 = r9 & 32
            if (r16 == 0) goto L_0x0404
            androidx.compose.runtime.ProvidableCompositionLocal r16 = androidx.compose.material3.TextKt.getLocalTextStyle()
            r15 = r16
            androidx.compose.runtime.CompositionLocal r15 = (androidx.compose.runtime.CompositionLocal) r15
            r122 = r3
            r3 = 2023513938(0x789c5f52, float:2.5372864E34)
            r123 = r12
            java.lang.String r12 = "CC:CompositionLocal.kt#9igjgp"
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(r8, r3, r12)
            java.lang.Object r3 = r8.consume(r15)
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(r8)
            androidx.compose.ui.text.TextStyle r3 = (androidx.compose.ui.text.TextStyle) r3
            r12 = -458753(0xfffffffffff8ffff, float:NaN)
            r0 = r0 & r12
            goto L_0x040a
        L_0x0404:
            r122 = r3
            r123 = r12
            r3 = r125
        L_0x040a:
            r12 = 0
            if (r26 == 0) goto L_0x040f
            r15 = r12
            goto L_0x0411
        L_0x040f:
            r15 = r126
        L_0x0411:
            if (r6 == 0) goto L_0x0415
            r6 = r12
            goto L_0x0417
        L_0x0415:
            r6 = r127
        L_0x0417:
            if (r1 == 0) goto L_0x041b
            r1 = r12
            goto L_0x041d
        L_0x041b:
            r1 = r128
        L_0x041d:
            if (r2 == 0) goto L_0x0421
            r2 = r12
            goto L_0x0423
        L_0x0421:
            r2 = r129
        L_0x0423:
            if (r4 == 0) goto L_0x0427
            r4 = r12
            goto L_0x0429
        L_0x0427:
            r4 = r130
        L_0x0429:
            if (r5 == 0) goto L_0x042d
            r5 = r12
            goto L_0x042f
        L_0x042d:
            r5 = r131
        L_0x042f:
            if (r10 == 0) goto L_0x0432
            goto L_0x0434
        L_0x0432:
            r12 = r132
        L_0x0434:
            if (r14 == 0) goto L_0x0438
            r10 = 0
            goto L_0x043a
        L_0x0438:
            r10 = r133
        L_0x043a:
            if (r17 == 0) goto L_0x0443
            androidx.compose.ui.text.input.VisualTransformation$Companion r14 = androidx.compose.ui.text.input.VisualTransformation.Companion
            androidx.compose.ui.text.input.VisualTransformation r14 = r14.getNone()
            goto L_0x0445
        L_0x0443:
            r14 = r134
        L_0x0445:
            if (r18 == 0) goto L_0x0450
            androidx.compose.foundation.text.KeyboardOptions$Companion r16 = androidx.compose.foundation.text.KeyboardOptions.Companion
            androidx.compose.foundation.text.KeyboardOptions r16 = r16.getDefault()
            r111 = r16
            goto L_0x0452
        L_0x0450:
            r111 = r135
        L_0x0452:
            if (r20 == 0) goto L_0x045d
            androidx.compose.foundation.text.KeyboardActions$Companion r16 = androidx.compose.foundation.text.KeyboardActions.Companion
            androidx.compose.foundation.text.KeyboardActions r16 = r16.getDefault()
            r112 = r16
            goto L_0x045f
        L_0x045d:
            r112 = r136
        L_0x045f:
            if (r21 == 0) goto L_0x0464
            r113 = 0
            goto L_0x0466
        L_0x0464:
            r113 = r137
        L_0x0466:
            r16 = 262144(0x40000, float:3.67342E-40)
            r16 = r9 & r16
            if (r16 == 0) goto L_0x047e
            if (r113 == 0) goto L_0x0471
            r16 = 1
            goto L_0x0474
        L_0x0471:
            r16 = 2147483647(0x7fffffff, float:NaN)
        L_0x0474:
            r17 = -234881025(0xfffffffff1ffffff, float:-2.535301E30)
            r7 = r7 & r17
            r114 = r7
            r7 = r16
            goto L_0x0482
        L_0x047e:
            r114 = r7
            r7 = r138
        L_0x0482:
            if (r24 == 0) goto L_0x0487
            r115 = 1
            goto L_0x0489
        L_0x0487:
            r115 = r139
        L_0x0489:
            r124 = r0
            if (r25 == 0) goto L_0x04b3
            r0 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r8.startReplaceableGroup(r0)
            java.lang.String r0 = "CC(remember):Composables.kt#9igjgp"
            androidx.compose.runtime.ComposerKt.sourceInformation(r8, r0)
            java.lang.Object r0 = r8.rememberedValue()
            androidx.compose.runtime.Composer$Companion r16 = androidx.compose.runtime.Composer.Companion
            r125 = r1
            java.lang.Object r1 = r16.getEmpty()
            if (r0 != r1) goto L_0x04ad
            androidx.compose.foundation.interaction.MutableInteractionSource r0 = androidx.compose.foundation.interaction.InteractionSourceKt.MutableInteractionSource()
            r8.updateRememberedValue(r0)
        L_0x04ad:
            r8.endReplaceableGroup()
            androidx.compose.foundation.interaction.MutableInteractionSource r0 = (androidx.compose.foundation.interaction.MutableInteractionSource) r0
            goto L_0x04b7
        L_0x04b3:
            r125 = r1
            r0 = r140
        L_0x04b7:
            r1 = 2097152(0x200000, float:2.938736E-39)
            r1 = r1 & r9
            if (r1 == 0) goto L_0x04c8
            androidx.compose.material3.TextFieldDefaults r1 = androidx.compose.material3.TextFieldDefaults.INSTANCE
            r126 = r0
            r0 = 6
            androidx.compose.ui.graphics.Shape r0 = r1.getShape(r8, r0)
            r11 = r11 & -113(0xffffffffffffff8f, float:NaN)
            goto L_0x04cc
        L_0x04c8:
            r126 = r0
            r0 = r141
        L_0x04cc:
            r1 = r9 & r30
            if (r1 == 0) goto L_0x0562
            androidx.compose.material3.TextFieldDefaults r16 = androidx.compose.material3.TextFieldDefaults.INSTANCE
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
            r38 = 0
            r40 = 0
            r42 = 0
            r44 = 0
            r46 = 0
            r48 = 0
            r50 = 0
            r52 = 0
            r54 = 0
            r56 = 0
            r58 = 0
            r60 = 0
            r62 = 0
            r64 = 0
            r66 = 0
            r68 = 0
            r70 = 0
            r72 = 0
            r74 = 0
            r76 = 0
            r78 = 0
            r80 = 0
            r82 = 0
            r84 = 0
            r86 = 0
            r88 = 0
            r90 = 0
            r92 = 0
            r94 = 0
            r96 = 0
            r98 = 0
            r100 = 0
            r103 = 0
            r104 = 0
            r105 = 0
            r106 = 0
            r107 = 3072(0xc00, float:4.305E-42)
            r108 = 2147483647(0x7fffffff, float:NaN)
            r109 = 4095(0xfff, float:5.738E-42)
            r102 = r8
            androidx.compose.material3.TextFieldColors r1 = r16.m1696colors0hiis_0(r17, r19, r21, r23, r25, r27, r29, r31, r33, r35, r37, r38, r40, r42, r44, r46, r48, r50, r52, r54, r56, r58, r60, r62, r64, r66, r68, r70, r72, r74, r76, r78, r80, r82, r84, r86, r88, r90, r92, r94, r96, r98, r100, r102, r103, r104, r105, r106, r107, r108, r109)
            r11 = r11 & -897(0xfffffffffffffc7f, float:NaN)
            r27 = r122
            r28 = r123
            r31 = r125
            r39 = r126
            r40 = r0
            r32 = r2
            r33 = r4
            r34 = r5
            r30 = r6
            r38 = r7
            r36 = r10
            r5 = r11
            r35 = r12
            r37 = r14
            r29 = r15
            r4 = r114
            r12 = r124
            r14 = r1
            goto L_0x0585
        L_0x0562:
            r27 = r122
            r28 = r123
            r31 = r125
            r39 = r126
            r40 = r0
            r32 = r2
            r33 = r4
            r34 = r5
            r30 = r6
            r38 = r7
            r36 = r10
            r5 = r11
            r35 = r12
            r37 = r14
            r29 = r15
            r4 = r114
            r12 = r124
            r14 = r142
        L_0x0585:
            r15 = r3
        L_0x0586:
            r8.endDefaults()
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto L_0x0598
            r0 = -1268528240(0xffffffffb463cb90, float:-2.1215078E-7)
            java.lang.String r1 = "androidx.compose.material3.TextField (TextField.kt:310)"
            androidx.compose.runtime.ComposerKt.traceEventStart(r0, r12, r4, r1)
        L_0x0598:
            r0 = -1263323526(0xffffffffb4b3367a, float:-3.3380985E-7)
            r8.startReplaceableGroup(r0)
            java.lang.String r0 = "*337@18080L46"
            androidx.compose.runtime.ComposerKt.sourceInformation(r8, r0)
            long r0 = r15.m5151getColor0d7_KjU()
            androidx.compose.ui.graphics.Color$Companion r2 = androidx.compose.ui.graphics.Color.Companion
            long r2 = r2.m2857getUnspecified0d7_KjU()
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 == 0) goto L_0x05b2
            goto L_0x05e3
        L_0x05b2:
            r0 = r39
            androidx.compose.foundation.interaction.InteractionSource r0 = (androidx.compose.foundation.interaction.InteractionSource) r0
            int r1 = r12 >> 9
            r1 = r1 & 14
            int r2 = r4 >> 6
            r2 = r2 & 112(0x70, float:1.57E-43)
            r1 = r1 | r2
            int r2 = r5 << 6
            r2 = r2 & 896(0x380, float:1.256E-42)
            r1 = r1 | r2
            int r2 = r5 << 3
            r2 = r2 & 7168(0x1c00, float:1.0045E-41)
            r1 = r1 | r2
            r122 = r14
            r123 = r28
            r124 = r36
            r125 = r0
            r126 = r8
            r127 = r1
            androidx.compose.runtime.State r0 = r122.textColor$material3_release(r123, r124, r125, r126, r127)
            java.lang.Object r0 = r0.getValue()
            androidx.compose.ui.graphics.Color r0 = (androidx.compose.ui.graphics.Color) r0
            long r0 = r0.m2831unboximpl()
        L_0x05e3:
            r42 = r0
            r8.endReplaceableGroup()
            androidx.compose.ui.text.TextStyle r0 = new androidx.compose.ui.text.TextStyle
            r41 = r0
            r44 = 0
            r46 = 0
            r47 = 0
            r48 = 0
            r49 = 0
            r50 = 0
            r51 = 0
            r53 = 0
            r54 = 0
            r55 = 0
            r56 = 0
            r58 = 0
            r59 = 0
            r60 = 0
            r61 = 0
            r62 = 0
            r64 = 0
            r65 = 0
            r66 = 0
            r67 = 0
            r68 = 0
            r69 = 4194302(0x3ffffe, float:5.877469E-39)
            r70 = 0
            r41.<init>((long) r42, (long) r44, (androidx.compose.ui.text.font.FontWeight) r46, (androidx.compose.ui.text.font.FontStyle) r47, (androidx.compose.ui.text.font.FontSynthesis) r48, (androidx.compose.ui.text.font.FontFamily) r49, (java.lang.String) r50, (long) r51, (androidx.compose.ui.text.style.BaselineShift) r53, (androidx.compose.ui.text.style.TextGeometricTransform) r54, (androidx.compose.ui.text.intl.LocaleList) r55, (long) r56, (androidx.compose.ui.text.style.TextDecoration) r58, (androidx.compose.ui.graphics.Shadow) r59, (androidx.compose.ui.text.style.TextAlign) r60, (androidx.compose.ui.text.style.TextDirection) r61, (long) r62, (androidx.compose.ui.text.style.TextIndent) r64, (androidx.compose.ui.text.PlatformTextStyle) r65, (androidx.compose.ui.text.style.LineHeightStyle) r66, (androidx.compose.ui.text.style.LineBreak) r67, (androidx.compose.ui.text.style.Hyphens) r68, (int) r69, (kotlin.jvm.internal.DefaultConstructorMarker) r70)
            androidx.compose.ui.text.TextStyle r10 = r15.merge((androidx.compose.ui.text.TextStyle) r0)
            r11 = 1
            androidx.compose.runtime.ProvidedValue[] r7 = new androidx.compose.runtime.ProvidedValue[r11]
            androidx.compose.runtime.ProvidableCompositionLocal r0 = androidx.compose.foundation.text.selection.TextSelectionColorsKt.getLocalTextSelectionColors()
            int r1 = r5 >> 6
            r1 = r1 & 14
            androidx.compose.foundation.text.selection.TextSelectionColors r1 = r14.getSelectionColors(r8, r1)
            androidx.compose.runtime.ProvidedValue r0 = r0.provides(r1)
            r1 = 0
            r7[r1] = r0
            androidx.compose.material3.TextFieldKt$TextField$5 r6 = new androidx.compose.material3.TextFieldKt$TextField$5
            r0 = r6
            r1 = r27
            r2 = r14
            r3 = r36
            r116 = r6
            r6 = r120
            r117 = r7
            r7 = r121
            r118 = r8
            r8 = r28
            r9 = r110
            r16 = r11
            r11 = r111
            r18 = r12
            r12 = r112
            r13 = r113
            r41 = r14
            r14 = r38
            r42 = r15
            r15 = r115
            r16 = r37
            r17 = r39
            r19 = r29
            r20 = r30
            r21 = r31
            r22 = r32
            r23 = r33
            r24 = r34
            r25 = r35
            r26 = r40
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            r0 = -1163788208(0xffffffffbaa20050, float:-0.0012359712)
            r2 = r116
            r1 = r118
            r3 = 1
            androidx.compose.runtime.internal.ComposableLambda r0 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(r1, r0, r3, r2)
            kotlin.jvm.functions.Function2 r0 = (kotlin.jvm.functions.Function2) r0
            r2 = 56
            r3 = r117
            androidx.compose.runtime.CompositionLocalKt.CompositionLocalProvider((androidx.compose.runtime.ProvidedValue<?>[]) r3, (kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>) r0, (androidx.compose.runtime.Composer) r1, (int) r2)
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto L_0x0695
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L_0x0695:
            r3 = r27
            r4 = r28
            r7 = r29
            r8 = r30
            r9 = r31
            r10 = r32
            r11 = r33
            r12 = r34
            r13 = r35
            r14 = r36
            r15 = r37
            r19 = r38
            r21 = r39
            r22 = r40
            r23 = r41
            r6 = r42
            r5 = r110
            r16 = r111
            r17 = r112
            r18 = r113
            r20 = r115
        L_0x06bf:
            androidx.compose.runtime.ScopeUpdateScope r2 = r1.endRestartGroup()
            if (r2 != 0) goto L_0x06c6
            goto L_0x06e4
        L_0x06c6:
            androidx.compose.material3.TextFieldKt$TextField$6 r28 = new androidx.compose.material3.TextFieldKt$TextField$6
            r0 = r28
            r1 = r120
            r119 = r2
            r2 = r121
            r24 = r144
            r25 = r145
            r26 = r146
            r27 = r147
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            r0 = r28
            kotlin.jvm.functions.Function2 r0 = (kotlin.jvm.functions.Function2) r0
            r1 = r119
            r1.updateScope(r0)
        L_0x06e4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.TextFieldKt.TextField(androidx.compose.ui.text.input.TextFieldValue, kotlin.jvm.functions.Function1, androidx.compose.ui.Modifier, boolean, boolean, androidx.compose.ui.text.TextStyle, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, boolean, androidx.compose.ui.text.input.VisualTransformation, androidx.compose.foundation.text.KeyboardOptions, androidx.compose.foundation.text.KeyboardActions, boolean, int, int, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.ui.graphics.Shape, androidx.compose.material3.TextFieldColors, androidx.compose.runtime.Composer, int, int, int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:105:0x0150  */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x0155  */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x016f  */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x0172  */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x018b  */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x018e  */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x01a8  */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x01ab  */
    /* JADX WARNING: Removed duplicated region for block: B:148:0x01c5  */
    /* JADX WARNING: Removed duplicated region for block: B:149:0x01c8  */
    /* JADX WARNING: Removed duplicated region for block: B:159:0x01e9  */
    /* JADX WARNING: Removed duplicated region for block: B:160:0x01f0  */
    /* JADX WARNING: Removed duplicated region for block: B:169:0x0207  */
    /* JADX WARNING: Removed duplicated region for block: B:176:0x021b  */
    /* JADX WARNING: Removed duplicated region for block: B:179:0x0223  */
    /* JADX WARNING: Removed duplicated region for block: B:180:0x022a  */
    /* JADX WARNING: Removed duplicated region for block: B:189:0x0243  */
    /* JADX WARNING: Removed duplicated region for block: B:190:0x024a  */
    /* JADX WARNING: Removed duplicated region for block: B:199:0x0261  */
    /* JADX WARNING: Removed duplicated region for block: B:206:0x0275  */
    /* JADX WARNING: Removed duplicated region for block: B:209:0x027b  */
    /* JADX WARNING: Removed duplicated region for block: B:216:0x0291  */
    /* JADX WARNING: Removed duplicated region for block: B:225:0x02b4  */
    /* JADX WARNING: Removed duplicated region for block: B:226:0x02e1  */
    /* JADX WARNING: Removed duplicated region for block: B:321:0x05a8  */
    /* JADX WARNING: Removed duplicated region for block: B:323:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0075  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0092  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0097  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00b2  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x00c6  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00d2  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00d9  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x00f2  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x00f9  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0112  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x0119  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x0132  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x0139  */
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Use overload with prefix and suffix parameters")
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final /* synthetic */ void TextField(java.lang.String r123, kotlin.jvm.functions.Function1 r124, androidx.compose.ui.Modifier r125, boolean r126, boolean r127, androidx.compose.ui.text.TextStyle r128, kotlin.jvm.functions.Function2 r129, kotlin.jvm.functions.Function2 r130, kotlin.jvm.functions.Function2 r131, kotlin.jvm.functions.Function2 r132, kotlin.jvm.functions.Function2 r133, boolean r134, androidx.compose.ui.text.input.VisualTransformation r135, androidx.compose.foundation.text.KeyboardOptions r136, androidx.compose.foundation.text.KeyboardActions r137, boolean r138, int r139, int r140, androidx.compose.foundation.interaction.MutableInteractionSource r141, androidx.compose.ui.graphics.Shape r142, androidx.compose.material3.TextFieldColors r143, androidx.compose.runtime.Composer r144, int r145, int r146, int r147, int r148) {
        /*
            r15 = r123
            r14 = r124
            r13 = r145
            r12 = r146
            r9 = r148
            java.lang.String r0 = "value"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r15, r0)
            java.lang.String r0 = "onValueChange"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r14, r0)
            r0 = -1500728277(0xffffffffa68cb42b, float:-9.763286E-16)
            r1 = r144
            androidx.compose.runtime.Composer r8 = r1.startRestartGroup(r0)
            java.lang.String r0 = "C(TextField)P(19,11,10,1,13,17,6,12,7,18,16,3,20,5,4,15,8,9,2,14)395@20391L7,408@21051L39,409@21129L5,410@21184L8,412@21201L763:TextField.kt#uh7d8r"
            androidx.compose.runtime.ComposerKt.sourceInformation(r8, r0)
            r0 = r9 & 1
            if (r0 == 0) goto L_0x002b
            r0 = r13 | 6
            goto L_0x003b
        L_0x002b:
            r0 = r13 & 14
            if (r0 != 0) goto L_0x003a
            boolean r0 = r8.changed((java.lang.Object) r15)
            if (r0 == 0) goto L_0x0037
            r0 = 4
            goto L_0x0038
        L_0x0037:
            r0 = 2
        L_0x0038:
            r0 = r0 | r13
            goto L_0x003b
        L_0x003a:
            r0 = r13
        L_0x003b:
            r3 = r9 & 2
            if (r3 == 0) goto L_0x0042
            r0 = r0 | 48
            goto L_0x0052
        L_0x0042:
            r3 = r13 & 112(0x70, float:1.57E-43)
            if (r3 != 0) goto L_0x0052
            boolean r3 = r8.changedInstance(r14)
            if (r3 == 0) goto L_0x004f
            r3 = 32
            goto L_0x0051
        L_0x004f:
            r3 = 16
        L_0x0051:
            r0 = r0 | r3
        L_0x0052:
            r3 = r9 & 4
            if (r3 == 0) goto L_0x0059
            r0 = r0 | 384(0x180, float:5.38E-43)
            goto L_0x006c
        L_0x0059:
            r10 = r13 & 896(0x380, float:1.256E-42)
            if (r10 != 0) goto L_0x006c
            r10 = r125
            boolean r11 = r8.changed((java.lang.Object) r10)
            if (r11 == 0) goto L_0x0068
            r11 = 256(0x100, float:3.59E-43)
            goto L_0x006a
        L_0x0068:
            r11 = 128(0x80, float:1.794E-43)
        L_0x006a:
            r0 = r0 | r11
            goto L_0x006e
        L_0x006c:
            r10 = r125
        L_0x006e:
            r11 = r9 & 8
            if (r11 == 0) goto L_0x0075
            r0 = r0 | 3072(0xc00, float:4.305E-42)
            goto L_0x0089
        L_0x0075:
            r1 = r13 & 7168(0x1c00, float:1.0045E-41)
            if (r1 != 0) goto L_0x0089
            r1 = r126
            boolean r16 = r8.changed((boolean) r1)
            if (r16 == 0) goto L_0x0084
            r16 = 2048(0x800, float:2.87E-42)
            goto L_0x0086
        L_0x0084:
            r16 = 1024(0x400, float:1.435E-42)
        L_0x0086:
            r0 = r0 | r16
            goto L_0x008b
        L_0x0089:
            r1 = r126
        L_0x008b:
            r16 = r9 & 16
            r110 = 57344(0xe000, float:8.0356E-41)
            if (r16 == 0) goto L_0x0097
            r0 = r0 | 24576(0x6000, float:3.4438E-41)
            r4 = r127
            goto L_0x00aa
        L_0x0097:
            r17 = r13 & r110
            r4 = r127
            if (r17 != 0) goto L_0x00aa
            boolean r18 = r8.changed((boolean) r4)
            if (r18 == 0) goto L_0x00a6
            r18 = 16384(0x4000, float:2.2959E-41)
            goto L_0x00a8
        L_0x00a6:
            r18 = 8192(0x2000, float:1.14794E-41)
        L_0x00a8:
            r0 = r0 | r18
        L_0x00aa:
            r111 = 458752(0x70000, float:6.42848E-40)
            r18 = r13 & r111
            r19 = 65536(0x10000, float:9.18355E-41)
            if (r18 != 0) goto L_0x00c6
            r18 = r9 & 32
            r5 = r128
            if (r18 != 0) goto L_0x00c1
            boolean r20 = r8.changed((java.lang.Object) r5)
            if (r20 == 0) goto L_0x00c1
            r20 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00c3
        L_0x00c1:
            r20 = r19
        L_0x00c3:
            r0 = r0 | r20
            goto L_0x00c8
        L_0x00c6:
            r5 = r128
        L_0x00c8:
            r20 = r9 & 64
            r112 = 3670016(0x380000, float:5.142788E-39)
            r21 = 1048576(0x100000, float:1.469368E-39)
            r22 = 524288(0x80000, float:7.34684E-40)
            if (r20 == 0) goto L_0x00d9
            r23 = 1572864(0x180000, float:2.204052E-39)
            r0 = r0 | r23
            r6 = r129
            goto L_0x00ec
        L_0x00d9:
            r23 = r13 & r112
            r6 = r129
            if (r23 != 0) goto L_0x00ec
            boolean r24 = r8.changedInstance(r6)
            if (r24 == 0) goto L_0x00e8
            r24 = r21
            goto L_0x00ea
        L_0x00e8:
            r24 = r22
        L_0x00ea:
            r0 = r0 | r24
        L_0x00ec:
            r7 = r9 & 128(0x80, float:1.794E-43)
            r113 = 29360128(0x1c00000, float:7.052966E-38)
            if (r7 == 0) goto L_0x00f9
            r25 = 12582912(0xc00000, float:1.7632415E-38)
            r0 = r0 | r25
            r2 = r130
            goto L_0x010c
        L_0x00f9:
            r25 = r13 & r113
            r2 = r130
            if (r25 != 0) goto L_0x010c
            boolean r26 = r8.changedInstance(r2)
            if (r26 == 0) goto L_0x0108
            r26 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x010a
        L_0x0108:
            r26 = 4194304(0x400000, float:5.877472E-39)
        L_0x010a:
            r0 = r0 | r26
        L_0x010c:
            r1 = r9 & 256(0x100, float:3.59E-43)
            r114 = 234881024(0xe000000, float:1.5777218E-30)
            if (r1 == 0) goto L_0x0119
            r26 = 100663296(0x6000000, float:2.4074124E-35)
            r0 = r0 | r26
            r2 = r131
            goto L_0x012c
        L_0x0119:
            r26 = r13 & r114
            r2 = r131
            if (r26 != 0) goto L_0x012c
            boolean r26 = r8.changedInstance(r2)
            if (r26 == 0) goto L_0x0128
            r26 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x012a
        L_0x0128:
            r26 = 33554432(0x2000000, float:9.403955E-38)
        L_0x012a:
            r0 = r0 | r26
        L_0x012c:
            r2 = r9 & 512(0x200, float:7.175E-43)
            r115 = 1879048192(0x70000000, float:1.58456325E29)
            if (r2 == 0) goto L_0x0139
            r26 = 805306368(0x30000000, float:4.656613E-10)
            r0 = r0 | r26
            r4 = r132
            goto L_0x014c
        L_0x0139:
            r26 = r13 & r115
            r4 = r132
            if (r26 != 0) goto L_0x014c
            boolean r26 = r8.changedInstance(r4)
            if (r26 == 0) goto L_0x0148
            r26 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x014a
        L_0x0148:
            r26 = 268435456(0x10000000, float:2.5243549E-29)
        L_0x014a:
            r0 = r0 | r26
        L_0x014c:
            r4 = r9 & 1024(0x400, float:1.435E-42)
            if (r4 == 0) goto L_0x0155
            r26 = r12 | 6
            r5 = r133
            goto L_0x016b
        L_0x0155:
            r26 = r12 & 14
            r5 = r133
            if (r26 != 0) goto L_0x0169
            boolean r26 = r8.changedInstance(r5)
            if (r26 == 0) goto L_0x0164
            r26 = 4
            goto L_0x0166
        L_0x0164:
            r26 = 2
        L_0x0166:
            r26 = r12 | r26
            goto L_0x016b
        L_0x0169:
            r26 = r12
        L_0x016b:
            r5 = r9 & 2048(0x800, float:2.87E-42)
            if (r5 == 0) goto L_0x0172
            r26 = r26 | 48
            goto L_0x0185
        L_0x0172:
            r27 = r12 & 112(0x70, float:1.57E-43)
            r6 = r134
            if (r27 != 0) goto L_0x0185
            boolean r27 = r8.changed((boolean) r6)
            if (r27 == 0) goto L_0x0181
            r17 = 32
            goto L_0x0183
        L_0x0181:
            r17 = 16
        L_0x0183:
            r26 = r26 | r17
        L_0x0185:
            r6 = r26
            r10 = r9 & 4096(0x1000, float:5.74E-42)
            if (r10 == 0) goto L_0x018e
            r6 = r6 | 384(0x180, float:5.38E-43)
            goto L_0x01a2
        L_0x018e:
            r14 = r12 & 896(0x380, float:1.256E-42)
            if (r14 != 0) goto L_0x01a2
            r14 = r135
            boolean r17 = r8.changed((java.lang.Object) r14)
            if (r17 == 0) goto L_0x019d
            r23 = 256(0x100, float:3.59E-43)
            goto L_0x019f
        L_0x019d:
            r23 = 128(0x80, float:1.794E-43)
        L_0x019f:
            r6 = r6 | r23
            goto L_0x01a4
        L_0x01a2:
            r14 = r135
        L_0x01a4:
            r14 = r9 & 8192(0x2000, float:1.14794E-41)
            if (r14 == 0) goto L_0x01ab
            r6 = r6 | 3072(0xc00, float:4.305E-42)
            goto L_0x01bf
        L_0x01ab:
            r15 = r12 & 7168(0x1c00, float:1.0045E-41)
            if (r15 != 0) goto L_0x01bf
            r15 = r136
            boolean r17 = r8.changed((java.lang.Object) r15)
            if (r17 == 0) goto L_0x01ba
            r17 = 2048(0x800, float:2.87E-42)
            goto L_0x01bc
        L_0x01ba:
            r17 = 1024(0x400, float:1.435E-42)
        L_0x01bc:
            r6 = r6 | r17
            goto L_0x01c1
        L_0x01bf:
            r15 = r136
        L_0x01c1:
            r15 = r9 & 16384(0x4000, float:2.2959E-41)
            if (r15 == 0) goto L_0x01c8
            r6 = r6 | 24576(0x6000, float:3.4438E-41)
            goto L_0x01de
        L_0x01c8:
            r17 = r12 & r110
            if (r17 != 0) goto L_0x01de
            r17 = r15
            r15 = r137
            boolean r18 = r8.changed((java.lang.Object) r15)
            if (r18 == 0) goto L_0x01d9
            r18 = 16384(0x4000, float:2.2959E-41)
            goto L_0x01db
        L_0x01d9:
            r18 = 8192(0x2000, float:1.14794E-41)
        L_0x01db:
            r6 = r6 | r18
            goto L_0x01e2
        L_0x01de:
            r17 = r15
            r15 = r137
        L_0x01e2:
            r18 = 32768(0x8000, float:4.5918E-41)
            r18 = r9 & r18
            if (r18 == 0) goto L_0x01f0
            r23 = 196608(0x30000, float:2.75506E-40)
            r6 = r6 | r23
            r15 = r138
            goto L_0x0203
        L_0x01f0:
            r23 = r12 & r111
            r15 = r138
            if (r23 != 0) goto L_0x0203
            boolean r23 = r8.changed((boolean) r15)
            if (r23 == 0) goto L_0x01ff
            r23 = 131072(0x20000, float:1.83671E-40)
            goto L_0x0201
        L_0x01ff:
            r23 = r19
        L_0x0201:
            r6 = r6 | r23
        L_0x0203:
            r23 = r12 & r112
            if (r23 != 0) goto L_0x021b
            r23 = r9 & r19
            r15 = r139
            if (r23 != 0) goto L_0x0216
            boolean r23 = r8.changed((int) r15)
            if (r23 == 0) goto L_0x0216
            r23 = r21
            goto L_0x0218
        L_0x0216:
            r23 = r22
        L_0x0218:
            r6 = r6 | r23
            goto L_0x021d
        L_0x021b:
            r15 = r139
        L_0x021d:
            r23 = 131072(0x20000, float:1.83671E-40)
            r23 = r9 & r23
            if (r23 == 0) goto L_0x022a
            r24 = 12582912(0xc00000, float:1.7632415E-38)
            r6 = r6 | r24
            r15 = r140
            goto L_0x023d
        L_0x022a:
            r24 = r12 & r113
            r15 = r140
            if (r24 != 0) goto L_0x023d
            boolean r24 = r8.changed((int) r15)
            if (r24 == 0) goto L_0x0239
            r24 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x023b
        L_0x0239:
            r24 = 4194304(0x400000, float:5.877472E-39)
        L_0x023b:
            r6 = r6 | r24
        L_0x023d:
            r24 = 262144(0x40000, float:3.67342E-40)
            r24 = r9 & r24
            if (r24 == 0) goto L_0x024a
            r26 = 100663296(0x6000000, float:2.4074124E-35)
            r6 = r6 | r26
            r15 = r141
            goto L_0x025d
        L_0x024a:
            r26 = r12 & r114
            r15 = r141
            if (r26 != 0) goto L_0x025d
            boolean r26 = r8.changed((java.lang.Object) r15)
            if (r26 == 0) goto L_0x0259
            r26 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x025b
        L_0x0259:
            r26 = 33554432(0x2000000, float:9.403955E-38)
        L_0x025b:
            r6 = r6 | r26
        L_0x025d:
            r26 = r12 & r115
            if (r26 != 0) goto L_0x0275
            r26 = r9 & r22
            r12 = r142
            if (r26 != 0) goto L_0x0270
            boolean r26 = r8.changed((java.lang.Object) r12)
            if (r26 == 0) goto L_0x0270
            r26 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x0272
        L_0x0270:
            r26 = 268435456(0x10000000, float:2.5243549E-29)
        L_0x0272:
            r6 = r6 | r26
            goto L_0x0277
        L_0x0275:
            r12 = r142
        L_0x0277:
            r26 = r147 & 14
            if (r26 != 0) goto L_0x0291
            r26 = r9 & r21
            r12 = r143
            if (r26 != 0) goto L_0x028a
            boolean r26 = r8.changed((java.lang.Object) r12)
            if (r26 == 0) goto L_0x028a
            r26 = 4
            goto L_0x028c
        L_0x028a:
            r26 = 2
        L_0x028c:
            r26 = r147 | r26
            r116 = r26
            goto L_0x0295
        L_0x0291:
            r12 = r143
            r116 = r147
        L_0x0295:
            r26 = 1533916891(0x5b6db6db, float:6.6910621E16)
            r12 = r0 & r26
            r15 = 306783378(0x12492492, float:6.3469493E-28)
            if (r12 != r15) goto L_0x02e1
            r12 = 1533916891(0x5b6db6db, float:6.6910621E16)
            r12 = r12 & r6
            r15 = 306783378(0x12492492, float:6.3469493E-28)
            if (r12 != r15) goto L_0x02e1
            r12 = r116 & 11
            r15 = 2
            if (r12 != r15) goto L_0x02e1
            boolean r12 = r8.getSkipping()
            if (r12 != 0) goto L_0x02b4
            goto L_0x02e1
        L_0x02b4:
            r8.skipToGroupEnd()
            r3 = r125
            r4 = r126
            r5 = r127
            r6 = r128
            r7 = r129
            r9 = r131
            r10 = r132
            r11 = r133
            r12 = r134
            r13 = r135
            r14 = r136
            r15 = r137
            r16 = r138
            r17 = r139
            r18 = r140
            r19 = r141
            r20 = r142
            r21 = r143
            r43 = r8
            r8 = r130
            goto L_0x05a1
        L_0x02e1:
            r8.startDefaults()
            r12 = r13 & 1
            if (r12 == 0) goto L_0x0338
            boolean r12 = r8.getDefaultsInvalid()
            if (r12 == 0) goto L_0x02ef
            goto L_0x0338
        L_0x02ef:
            r8.skipToGroupEnd()
            r1 = r9 & 32
            if (r1 == 0) goto L_0x02fa
            r1 = -458753(0xfffffffffff8ffff, float:NaN)
            r0 = r0 & r1
        L_0x02fa:
            r1 = r9 & r19
            if (r1 == 0) goto L_0x0302
            r1 = -3670017(0xffffffffffc7ffff, float:NaN)
            r6 = r6 & r1
        L_0x0302:
            r1 = r9 & r22
            if (r1 == 0) goto L_0x030a
            r1 = -1879048193(0xffffffff8fffffff, float:-2.5243547E-29)
            r6 = r6 & r1
        L_0x030a:
            r1 = r9 & r21
            if (r1 == 0) goto L_0x0310
            r116 = r116 & -15
        L_0x0310:
            r118 = r125
            r28 = r126
            r117 = r127
            r29 = r128
            r30 = r129
            r31 = r130
            r32 = r131
            r33 = r132
            r34 = r133
            r35 = r134
            r36 = r135
            r37 = r136
            r38 = r137
            r119 = r138
            r39 = r139
            r120 = r140
            r40 = r141
            r41 = r142
            r42 = r143
            goto L_0x04e3
        L_0x0338:
            if (r3 == 0) goto L_0x033f
            androidx.compose.ui.Modifier$Companion r3 = androidx.compose.ui.Modifier.Companion
            androidx.compose.ui.Modifier r3 = (androidx.compose.ui.Modifier) r3
            goto L_0x0341
        L_0x033f:
            r3 = r125
        L_0x0341:
            if (r11 == 0) goto L_0x0345
            r11 = 1
            goto L_0x0347
        L_0x0345:
            r11 = r126
        L_0x0347:
            if (r16 == 0) goto L_0x034e
            r16 = 0
            r117 = r16
            goto L_0x0350
        L_0x034e:
            r117 = r127
        L_0x0350:
            r16 = r9 & 32
            if (r16 == 0) goto L_0x0374
            androidx.compose.runtime.ProvidableCompositionLocal r16 = androidx.compose.material3.TextKt.getLocalTextStyle()
            r12 = r16
            androidx.compose.runtime.CompositionLocal r12 = (androidx.compose.runtime.CompositionLocal) r12
            r15 = 2023513938(0x789c5f52, float:2.5372864E34)
            r118 = r3
            java.lang.String r3 = "CC:CompositionLocal.kt#9igjgp"
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(r8, r15, r3)
            java.lang.Object r3 = r8.consume(r12)
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(r8)
            androidx.compose.ui.text.TextStyle r3 = (androidx.compose.ui.text.TextStyle) r3
            r12 = -458753(0xfffffffffff8ffff, float:NaN)
            r0 = r0 & r12
            goto L_0x0378
        L_0x0374:
            r118 = r3
            r3 = r128
        L_0x0378:
            r12 = 0
            if (r20 == 0) goto L_0x037d
            r15 = r12
            goto L_0x037f
        L_0x037d:
            r15 = r129
        L_0x037f:
            if (r7 == 0) goto L_0x0383
            r7 = r12
            goto L_0x0385
        L_0x0383:
            r7 = r130
        L_0x0385:
            if (r1 == 0) goto L_0x0389
            r1 = r12
            goto L_0x038b
        L_0x0389:
            r1 = r131
        L_0x038b:
            if (r2 == 0) goto L_0x038f
            r2 = r12
            goto L_0x0391
        L_0x038f:
            r2 = r132
        L_0x0391:
            if (r4 == 0) goto L_0x0394
            goto L_0x0396
        L_0x0394:
            r12 = r133
        L_0x0396:
            if (r5 == 0) goto L_0x039a
            r4 = 0
            goto L_0x039c
        L_0x039a:
            r4 = r134
        L_0x039c:
            if (r10 == 0) goto L_0x03a5
            androidx.compose.ui.text.input.VisualTransformation$Companion r5 = androidx.compose.ui.text.input.VisualTransformation.Companion
            androidx.compose.ui.text.input.VisualTransformation r5 = r5.getNone()
            goto L_0x03a7
        L_0x03a5:
            r5 = r135
        L_0x03a7:
            if (r14 == 0) goto L_0x03b0
            androidx.compose.foundation.text.KeyboardOptions$Companion r10 = androidx.compose.foundation.text.KeyboardOptions.Companion
            androidx.compose.foundation.text.KeyboardOptions r10 = r10.getDefault()
            goto L_0x03b2
        L_0x03b0:
            r10 = r136
        L_0x03b2:
            if (r17 == 0) goto L_0x03bb
            androidx.compose.foundation.text.KeyboardActions$Companion r14 = androidx.compose.foundation.text.KeyboardActions.Companion
            androidx.compose.foundation.text.KeyboardActions r14 = r14.getDefault()
            goto L_0x03bd
        L_0x03bb:
            r14 = r137
        L_0x03bd:
            if (r18 == 0) goto L_0x03c4
            r16 = 0
            r119 = r16
            goto L_0x03c6
        L_0x03c4:
            r119 = r138
        L_0x03c6:
            r16 = r9 & r19
            if (r16 == 0) goto L_0x03de
            if (r119 == 0) goto L_0x03cf
            r16 = 1
            goto L_0x03d2
        L_0x03cf:
            r16 = 2147483647(0x7fffffff, float:NaN)
        L_0x03d2:
            r17 = -3670017(0xffffffffffc7ffff, float:NaN)
            r6 = r6 & r17
            r122 = r16
            r16 = r6
            r6 = r122
            goto L_0x03e2
        L_0x03de:
            r16 = r6
            r6 = r139
        L_0x03e2:
            if (r23 == 0) goto L_0x03e7
            r120 = 1
            goto L_0x03e9
        L_0x03e7:
            r120 = r140
        L_0x03e9:
            r125 = r0
            if (r24 == 0) goto L_0x0413
            r0 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r8.startReplaceableGroup(r0)
            java.lang.String r0 = "CC(remember):Composables.kt#9igjgp"
            androidx.compose.runtime.ComposerKt.sourceInformation(r8, r0)
            java.lang.Object r0 = r8.rememberedValue()
            androidx.compose.runtime.Composer$Companion r17 = androidx.compose.runtime.Composer.Companion
            r126 = r1
            java.lang.Object r1 = r17.getEmpty()
            if (r0 != r1) goto L_0x040d
            androidx.compose.foundation.interaction.MutableInteractionSource r0 = androidx.compose.foundation.interaction.InteractionSourceKt.MutableInteractionSource()
            r8.updateRememberedValue(r0)
        L_0x040d:
            r8.endReplaceableGroup()
            androidx.compose.foundation.interaction.MutableInteractionSource r0 = (androidx.compose.foundation.interaction.MutableInteractionSource) r0
            goto L_0x0417
        L_0x0413:
            r126 = r1
            r0 = r141
        L_0x0417:
            r1 = r9 & r22
            if (r1 == 0) goto L_0x042a
            androidx.compose.material3.TextFieldDefaults r1 = androidx.compose.material3.TextFieldDefaults.INSTANCE
            r127 = r0
            r0 = 6
            androidx.compose.ui.graphics.Shape r1 = r1.getShape(r8, r0)
            r0 = -1879048193(0xffffffff8fffffff, float:-2.5243547E-29)
            r0 = r16 & r0
            goto L_0x0430
        L_0x042a:
            r127 = r0
            r1 = r142
            r0 = r16
        L_0x0430:
            r16 = r9 & r21
            if (r16 == 0) goto L_0x04c2
            androidx.compose.material3.TextFieldDefaults r16 = androidx.compose.material3.TextFieldDefaults.INSTANCE
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
            r38 = 0
            r40 = 0
            r42 = 0
            r44 = 0
            r46 = 0
            r48 = 0
            r50 = 0
            r52 = 0
            r54 = 0
            r56 = 0
            r58 = 0
            r60 = 0
            r62 = 0
            r64 = 0
            r66 = 0
            r68 = 0
            r70 = 0
            r72 = 0
            r74 = 0
            r76 = 0
            r78 = 0
            r80 = 0
            r82 = 0
            r84 = 0
            r86 = 0
            r88 = 0
            r90 = 0
            r92 = 0
            r94 = 0
            r96 = 0
            r98 = 0
            r100 = 0
            r103 = 0
            r104 = 0
            r105 = 0
            r106 = 0
            r107 = 3072(0xc00, float:4.305E-42)
            r108 = 2147483647(0x7fffffff, float:NaN)
            r109 = 4095(0xfff, float:5.738E-42)
            r102 = r8
            androidx.compose.material3.TextFieldColors r16 = r16.m1696colors0hiis_0(r17, r19, r21, r23, r25, r27, r29, r31, r33, r35, r37, r38, r40, r42, r44, r46, r48, r50, r52, r54, r56, r58, r60, r62, r64, r66, r68, r70, r72, r74, r76, r78, r80, r82, r84, r86, r88, r90, r92, r94, r96, r98, r100, r102, r103, r104, r105, r106, r107, r108, r109)
            r116 = r116 & -15
            r32 = r126
            r40 = r127
            r41 = r1
            r33 = r2
            r29 = r3
            r35 = r4
            r36 = r5
            r39 = r6
            r31 = r7
            r37 = r10
            r28 = r11
            r34 = r12
            r38 = r14
            r30 = r15
            r42 = r16
            goto L_0x04e0
        L_0x04c2:
            r32 = r126
            r40 = r127
            r42 = r143
            r41 = r1
            r33 = r2
            r29 = r3
            r35 = r4
            r36 = r5
            r39 = r6
            r31 = r7
            r37 = r10
            r28 = r11
            r34 = r12
            r38 = r14
            r30 = r15
        L_0x04e0:
            r6 = r0
            r0 = r125
        L_0x04e3:
            r8.endDefaults()
            boolean r1 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r1 == 0) goto L_0x04f5
            r1 = -1500728277(0xffffffffa68cb42b, float:-9.763286E-16)
            java.lang.String r2 = "androidx.compose.material3.TextField (TextField.kt:389)"
            androidx.compose.runtime.ComposerKt.traceEventStart(r1, r0, r6, r2)
        L_0x04f5:
            r10 = 0
            r11 = 0
            r1 = r0 & 14
            r2 = r0 & 112(0x70, float:1.57E-43)
            r1 = r1 | r2
            r2 = r0 & 896(0x380, float:1.256E-42)
            r1 = r1 | r2
            r2 = r0 & 7168(0x1c00, float:1.0045E-41)
            r1 = r1 | r2
            r2 = r0 & r110
            r1 = r1 | r2
            r2 = r0 & r111
            r1 = r1 | r2
            r2 = r0 & r112
            r1 = r1 | r2
            r2 = r0 & r113
            r1 = r1 | r2
            r2 = r0 & r114
            r1 = r1 | r2
            r0 = r0 & r115
            r24 = r1 | r0
            int r0 = r6 << 6
            r1 = r0 & 896(0x380, float:1.256E-42)
            r1 = r1 | 54
            r2 = r0 & 7168(0x1c00, float:1.0045E-41)
            r1 = r1 | r2
            r2 = r0 & r110
            r1 = r1 | r2
            r2 = r0 & r111
            r1 = r1 | r2
            r2 = r0 & r112
            r1 = r1 | r2
            r2 = r0 & r113
            r1 = r1 | r2
            r2 = r0 & r114
            r1 = r1 | r2
            r0 = r0 & r115
            r25 = r1 | r0
            int r0 = r6 >> 24
            r1 = r0 & 14
            r0 = r0 & 112(0x70, float:1.57E-43)
            r0 = r0 | r1
            r1 = 6
            int r1 = r116 << 6
            r1 = r1 & 896(0x380, float:1.256E-42)
            r26 = r0 | r1
            r27 = 0
            r0 = r123
            r1 = r124
            r2 = r118
            r3 = r28
            r4 = r117
            r5 = r29
            r6 = r30
            r7 = r31
            r43 = r8
            r8 = r32
            r9 = r33
            r12 = r34
            r13 = r35
            r14 = r36
            r15 = r37
            r16 = r38
            r17 = r119
            r18 = r39
            r19 = r120
            r20 = r40
            r21 = r41
            r22 = r42
            r23 = r43
            TextField((java.lang.String) r0, (kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit>) r1, (androidx.compose.ui.Modifier) r2, (boolean) r3, (boolean) r4, (androidx.compose.ui.text.TextStyle) r5, (kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>) r6, (kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>) r7, (kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>) r8, (kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>) r9, (kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>) r10, (kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>) r11, (kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>) r12, (boolean) r13, (androidx.compose.ui.text.input.VisualTransformation) r14, (androidx.compose.foundation.text.KeyboardOptions) r15, (androidx.compose.foundation.text.KeyboardActions) r16, (boolean) r17, (int) r18, (int) r19, (androidx.compose.foundation.interaction.MutableInteractionSource) r20, (androidx.compose.ui.graphics.Shape) r21, (androidx.compose.material3.TextFieldColors) r22, (androidx.compose.runtime.Composer) r23, (int) r24, (int) r25, (int) r26, (int) r27)
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto L_0x057b
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L_0x057b:
            r4 = r28
            r6 = r29
            r7 = r30
            r8 = r31
            r9 = r32
            r10 = r33
            r11 = r34
            r12 = r35
            r13 = r36
            r14 = r37
            r15 = r38
            r17 = r39
            r19 = r40
            r20 = r41
            r21 = r42
            r5 = r117
            r3 = r118
            r16 = r119
            r18 = r120
        L_0x05a1:
            androidx.compose.runtime.ScopeUpdateScope r2 = r43.endRestartGroup()
            if (r2 != 0) goto L_0x05a8
            goto L_0x05c6
        L_0x05a8:
            androidx.compose.material3.TextFieldKt$TextField$8 r26 = new androidx.compose.material3.TextFieldKt$TextField$8
            r0 = r26
            r1 = r123
            r121 = r2
            r2 = r124
            r22 = r145
            r23 = r146
            r24 = r147
            r25 = r148
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)
            r0 = r26
            kotlin.jvm.functions.Function2 r0 = (kotlin.jvm.functions.Function2) r0
            r1 = r121
            r1.updateScope(r0)
        L_0x05c6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.TextFieldKt.TextField(java.lang.String, kotlin.jvm.functions.Function1, androidx.compose.ui.Modifier, boolean, boolean, androidx.compose.ui.text.TextStyle, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, boolean, androidx.compose.ui.text.input.VisualTransformation, androidx.compose.foundation.text.KeyboardOptions, androidx.compose.foundation.text.KeyboardActions, boolean, int, int, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.ui.graphics.Shape, androidx.compose.material3.TextFieldColors, androidx.compose.runtime.Composer, int, int, int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:105:0x0150  */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x0155  */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x016f  */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x0172  */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x018b  */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x018e  */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x01a8  */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x01ab  */
    /* JADX WARNING: Removed duplicated region for block: B:148:0x01c5  */
    /* JADX WARNING: Removed duplicated region for block: B:149:0x01c8  */
    /* JADX WARNING: Removed duplicated region for block: B:159:0x01e9  */
    /* JADX WARNING: Removed duplicated region for block: B:160:0x01f0  */
    /* JADX WARNING: Removed duplicated region for block: B:169:0x0207  */
    /* JADX WARNING: Removed duplicated region for block: B:176:0x021b  */
    /* JADX WARNING: Removed duplicated region for block: B:179:0x0223  */
    /* JADX WARNING: Removed duplicated region for block: B:180:0x022a  */
    /* JADX WARNING: Removed duplicated region for block: B:189:0x0243  */
    /* JADX WARNING: Removed duplicated region for block: B:190:0x024a  */
    /* JADX WARNING: Removed duplicated region for block: B:199:0x0261  */
    /* JADX WARNING: Removed duplicated region for block: B:206:0x0275  */
    /* JADX WARNING: Removed duplicated region for block: B:209:0x027b  */
    /* JADX WARNING: Removed duplicated region for block: B:216:0x0291  */
    /* JADX WARNING: Removed duplicated region for block: B:225:0x02b4  */
    /* JADX WARNING: Removed duplicated region for block: B:226:0x02e1  */
    /* JADX WARNING: Removed duplicated region for block: B:321:0x05a8  */
    /* JADX WARNING: Removed duplicated region for block: B:323:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0075  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0092  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0097  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00b2  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x00c6  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00d2  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00d9  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x00f2  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x00f9  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0112  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x0119  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x0132  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x0139  */
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Use overload with prefix and suffix parameters")
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final /* synthetic */ void TextField(androidx.compose.ui.text.input.TextFieldValue r123, kotlin.jvm.functions.Function1 r124, androidx.compose.ui.Modifier r125, boolean r126, boolean r127, androidx.compose.ui.text.TextStyle r128, kotlin.jvm.functions.Function2 r129, kotlin.jvm.functions.Function2 r130, kotlin.jvm.functions.Function2 r131, kotlin.jvm.functions.Function2 r132, kotlin.jvm.functions.Function2 r133, boolean r134, androidx.compose.ui.text.input.VisualTransformation r135, androidx.compose.foundation.text.KeyboardOptions r136, androidx.compose.foundation.text.KeyboardActions r137, boolean r138, int r139, int r140, androidx.compose.foundation.interaction.MutableInteractionSource r141, androidx.compose.ui.graphics.Shape r142, androidx.compose.material3.TextFieldColors r143, androidx.compose.runtime.Composer r144, int r145, int r146, int r147, int r148) {
        /*
            r15 = r123
            r14 = r124
            r13 = r145
            r12 = r146
            r9 = r148
            java.lang.String r0 = "value"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r15, r0)
            java.lang.String r0 = "onValueChange"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r14, r0)
            r0 = 1523846136(0x5ad40bf8, float:2.98429274E16)
            r1 = r144
            androidx.compose.runtime.Composer r8 = r1.startRestartGroup(r0)
            java.lang.String r0 = "C(TextField)P(19,11,10,1,13,17,6,12,7,18,16,3,20,5,4,15,8,9,2,14)448@22325L7,461@22985L39,462@23063L5,463@23118L8,465@23135L763:TextField.kt#uh7d8r"
            androidx.compose.runtime.ComposerKt.sourceInformation(r8, r0)
            r0 = r9 & 1
            if (r0 == 0) goto L_0x002b
            r0 = r13 | 6
            goto L_0x003b
        L_0x002b:
            r0 = r13 & 14
            if (r0 != 0) goto L_0x003a
            boolean r0 = r8.changed((java.lang.Object) r15)
            if (r0 == 0) goto L_0x0037
            r0 = 4
            goto L_0x0038
        L_0x0037:
            r0 = 2
        L_0x0038:
            r0 = r0 | r13
            goto L_0x003b
        L_0x003a:
            r0 = r13
        L_0x003b:
            r3 = r9 & 2
            if (r3 == 0) goto L_0x0042
            r0 = r0 | 48
            goto L_0x0052
        L_0x0042:
            r3 = r13 & 112(0x70, float:1.57E-43)
            if (r3 != 0) goto L_0x0052
            boolean r3 = r8.changedInstance(r14)
            if (r3 == 0) goto L_0x004f
            r3 = 32
            goto L_0x0051
        L_0x004f:
            r3 = 16
        L_0x0051:
            r0 = r0 | r3
        L_0x0052:
            r3 = r9 & 4
            if (r3 == 0) goto L_0x0059
            r0 = r0 | 384(0x180, float:5.38E-43)
            goto L_0x006c
        L_0x0059:
            r10 = r13 & 896(0x380, float:1.256E-42)
            if (r10 != 0) goto L_0x006c
            r10 = r125
            boolean r11 = r8.changed((java.lang.Object) r10)
            if (r11 == 0) goto L_0x0068
            r11 = 256(0x100, float:3.59E-43)
            goto L_0x006a
        L_0x0068:
            r11 = 128(0x80, float:1.794E-43)
        L_0x006a:
            r0 = r0 | r11
            goto L_0x006e
        L_0x006c:
            r10 = r125
        L_0x006e:
            r11 = r9 & 8
            if (r11 == 0) goto L_0x0075
            r0 = r0 | 3072(0xc00, float:4.305E-42)
            goto L_0x0089
        L_0x0075:
            r1 = r13 & 7168(0x1c00, float:1.0045E-41)
            if (r1 != 0) goto L_0x0089
            r1 = r126
            boolean r16 = r8.changed((boolean) r1)
            if (r16 == 0) goto L_0x0084
            r16 = 2048(0x800, float:2.87E-42)
            goto L_0x0086
        L_0x0084:
            r16 = 1024(0x400, float:1.435E-42)
        L_0x0086:
            r0 = r0 | r16
            goto L_0x008b
        L_0x0089:
            r1 = r126
        L_0x008b:
            r16 = r9 & 16
            r110 = 57344(0xe000, float:8.0356E-41)
            if (r16 == 0) goto L_0x0097
            r0 = r0 | 24576(0x6000, float:3.4438E-41)
            r4 = r127
            goto L_0x00aa
        L_0x0097:
            r17 = r13 & r110
            r4 = r127
            if (r17 != 0) goto L_0x00aa
            boolean r18 = r8.changed((boolean) r4)
            if (r18 == 0) goto L_0x00a6
            r18 = 16384(0x4000, float:2.2959E-41)
            goto L_0x00a8
        L_0x00a6:
            r18 = 8192(0x2000, float:1.14794E-41)
        L_0x00a8:
            r0 = r0 | r18
        L_0x00aa:
            r111 = 458752(0x70000, float:6.42848E-40)
            r18 = r13 & r111
            r19 = 65536(0x10000, float:9.18355E-41)
            if (r18 != 0) goto L_0x00c6
            r18 = r9 & 32
            r5 = r128
            if (r18 != 0) goto L_0x00c1
            boolean r20 = r8.changed((java.lang.Object) r5)
            if (r20 == 0) goto L_0x00c1
            r20 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00c3
        L_0x00c1:
            r20 = r19
        L_0x00c3:
            r0 = r0 | r20
            goto L_0x00c8
        L_0x00c6:
            r5 = r128
        L_0x00c8:
            r20 = r9 & 64
            r112 = 3670016(0x380000, float:5.142788E-39)
            r21 = 1048576(0x100000, float:1.469368E-39)
            r22 = 524288(0x80000, float:7.34684E-40)
            if (r20 == 0) goto L_0x00d9
            r23 = 1572864(0x180000, float:2.204052E-39)
            r0 = r0 | r23
            r6 = r129
            goto L_0x00ec
        L_0x00d9:
            r23 = r13 & r112
            r6 = r129
            if (r23 != 0) goto L_0x00ec
            boolean r24 = r8.changedInstance(r6)
            if (r24 == 0) goto L_0x00e8
            r24 = r21
            goto L_0x00ea
        L_0x00e8:
            r24 = r22
        L_0x00ea:
            r0 = r0 | r24
        L_0x00ec:
            r7 = r9 & 128(0x80, float:1.794E-43)
            r113 = 29360128(0x1c00000, float:7.052966E-38)
            if (r7 == 0) goto L_0x00f9
            r25 = 12582912(0xc00000, float:1.7632415E-38)
            r0 = r0 | r25
            r2 = r130
            goto L_0x010c
        L_0x00f9:
            r25 = r13 & r113
            r2 = r130
            if (r25 != 0) goto L_0x010c
            boolean r26 = r8.changedInstance(r2)
            if (r26 == 0) goto L_0x0108
            r26 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x010a
        L_0x0108:
            r26 = 4194304(0x400000, float:5.877472E-39)
        L_0x010a:
            r0 = r0 | r26
        L_0x010c:
            r1 = r9 & 256(0x100, float:3.59E-43)
            r114 = 234881024(0xe000000, float:1.5777218E-30)
            if (r1 == 0) goto L_0x0119
            r26 = 100663296(0x6000000, float:2.4074124E-35)
            r0 = r0 | r26
            r2 = r131
            goto L_0x012c
        L_0x0119:
            r26 = r13 & r114
            r2 = r131
            if (r26 != 0) goto L_0x012c
            boolean r26 = r8.changedInstance(r2)
            if (r26 == 0) goto L_0x0128
            r26 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x012a
        L_0x0128:
            r26 = 33554432(0x2000000, float:9.403955E-38)
        L_0x012a:
            r0 = r0 | r26
        L_0x012c:
            r2 = r9 & 512(0x200, float:7.175E-43)
            r115 = 1879048192(0x70000000, float:1.58456325E29)
            if (r2 == 0) goto L_0x0139
            r26 = 805306368(0x30000000, float:4.656613E-10)
            r0 = r0 | r26
            r4 = r132
            goto L_0x014c
        L_0x0139:
            r26 = r13 & r115
            r4 = r132
            if (r26 != 0) goto L_0x014c
            boolean r26 = r8.changedInstance(r4)
            if (r26 == 0) goto L_0x0148
            r26 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x014a
        L_0x0148:
            r26 = 268435456(0x10000000, float:2.5243549E-29)
        L_0x014a:
            r0 = r0 | r26
        L_0x014c:
            r4 = r9 & 1024(0x400, float:1.435E-42)
            if (r4 == 0) goto L_0x0155
            r26 = r12 | 6
            r5 = r133
            goto L_0x016b
        L_0x0155:
            r26 = r12 & 14
            r5 = r133
            if (r26 != 0) goto L_0x0169
            boolean r26 = r8.changedInstance(r5)
            if (r26 == 0) goto L_0x0164
            r26 = 4
            goto L_0x0166
        L_0x0164:
            r26 = 2
        L_0x0166:
            r26 = r12 | r26
            goto L_0x016b
        L_0x0169:
            r26 = r12
        L_0x016b:
            r5 = r9 & 2048(0x800, float:2.87E-42)
            if (r5 == 0) goto L_0x0172
            r26 = r26 | 48
            goto L_0x0185
        L_0x0172:
            r27 = r12 & 112(0x70, float:1.57E-43)
            r6 = r134
            if (r27 != 0) goto L_0x0185
            boolean r27 = r8.changed((boolean) r6)
            if (r27 == 0) goto L_0x0181
            r17 = 32
            goto L_0x0183
        L_0x0181:
            r17 = 16
        L_0x0183:
            r26 = r26 | r17
        L_0x0185:
            r6 = r26
            r10 = r9 & 4096(0x1000, float:5.74E-42)
            if (r10 == 0) goto L_0x018e
            r6 = r6 | 384(0x180, float:5.38E-43)
            goto L_0x01a2
        L_0x018e:
            r14 = r12 & 896(0x380, float:1.256E-42)
            if (r14 != 0) goto L_0x01a2
            r14 = r135
            boolean r17 = r8.changed((java.lang.Object) r14)
            if (r17 == 0) goto L_0x019d
            r23 = 256(0x100, float:3.59E-43)
            goto L_0x019f
        L_0x019d:
            r23 = 128(0x80, float:1.794E-43)
        L_0x019f:
            r6 = r6 | r23
            goto L_0x01a4
        L_0x01a2:
            r14 = r135
        L_0x01a4:
            r14 = r9 & 8192(0x2000, float:1.14794E-41)
            if (r14 == 0) goto L_0x01ab
            r6 = r6 | 3072(0xc00, float:4.305E-42)
            goto L_0x01bf
        L_0x01ab:
            r15 = r12 & 7168(0x1c00, float:1.0045E-41)
            if (r15 != 0) goto L_0x01bf
            r15 = r136
            boolean r17 = r8.changed((java.lang.Object) r15)
            if (r17 == 0) goto L_0x01ba
            r17 = 2048(0x800, float:2.87E-42)
            goto L_0x01bc
        L_0x01ba:
            r17 = 1024(0x400, float:1.435E-42)
        L_0x01bc:
            r6 = r6 | r17
            goto L_0x01c1
        L_0x01bf:
            r15 = r136
        L_0x01c1:
            r15 = r9 & 16384(0x4000, float:2.2959E-41)
            if (r15 == 0) goto L_0x01c8
            r6 = r6 | 24576(0x6000, float:3.4438E-41)
            goto L_0x01de
        L_0x01c8:
            r17 = r12 & r110
            if (r17 != 0) goto L_0x01de
            r17 = r15
            r15 = r137
            boolean r18 = r8.changed((java.lang.Object) r15)
            if (r18 == 0) goto L_0x01d9
            r18 = 16384(0x4000, float:2.2959E-41)
            goto L_0x01db
        L_0x01d9:
            r18 = 8192(0x2000, float:1.14794E-41)
        L_0x01db:
            r6 = r6 | r18
            goto L_0x01e2
        L_0x01de:
            r17 = r15
            r15 = r137
        L_0x01e2:
            r18 = 32768(0x8000, float:4.5918E-41)
            r18 = r9 & r18
            if (r18 == 0) goto L_0x01f0
            r23 = 196608(0x30000, float:2.75506E-40)
            r6 = r6 | r23
            r15 = r138
            goto L_0x0203
        L_0x01f0:
            r23 = r12 & r111
            r15 = r138
            if (r23 != 0) goto L_0x0203
            boolean r23 = r8.changed((boolean) r15)
            if (r23 == 0) goto L_0x01ff
            r23 = 131072(0x20000, float:1.83671E-40)
            goto L_0x0201
        L_0x01ff:
            r23 = r19
        L_0x0201:
            r6 = r6 | r23
        L_0x0203:
            r23 = r12 & r112
            if (r23 != 0) goto L_0x021b
            r23 = r9 & r19
            r15 = r139
            if (r23 != 0) goto L_0x0216
            boolean r23 = r8.changed((int) r15)
            if (r23 == 0) goto L_0x0216
            r23 = r21
            goto L_0x0218
        L_0x0216:
            r23 = r22
        L_0x0218:
            r6 = r6 | r23
            goto L_0x021d
        L_0x021b:
            r15 = r139
        L_0x021d:
            r23 = 131072(0x20000, float:1.83671E-40)
            r23 = r9 & r23
            if (r23 == 0) goto L_0x022a
            r24 = 12582912(0xc00000, float:1.7632415E-38)
            r6 = r6 | r24
            r15 = r140
            goto L_0x023d
        L_0x022a:
            r24 = r12 & r113
            r15 = r140
            if (r24 != 0) goto L_0x023d
            boolean r24 = r8.changed((int) r15)
            if (r24 == 0) goto L_0x0239
            r24 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x023b
        L_0x0239:
            r24 = 4194304(0x400000, float:5.877472E-39)
        L_0x023b:
            r6 = r6 | r24
        L_0x023d:
            r24 = 262144(0x40000, float:3.67342E-40)
            r24 = r9 & r24
            if (r24 == 0) goto L_0x024a
            r26 = 100663296(0x6000000, float:2.4074124E-35)
            r6 = r6 | r26
            r15 = r141
            goto L_0x025d
        L_0x024a:
            r26 = r12 & r114
            r15 = r141
            if (r26 != 0) goto L_0x025d
            boolean r26 = r8.changed((java.lang.Object) r15)
            if (r26 == 0) goto L_0x0259
            r26 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x025b
        L_0x0259:
            r26 = 33554432(0x2000000, float:9.403955E-38)
        L_0x025b:
            r6 = r6 | r26
        L_0x025d:
            r26 = r12 & r115
            if (r26 != 0) goto L_0x0275
            r26 = r9 & r22
            r12 = r142
            if (r26 != 0) goto L_0x0270
            boolean r26 = r8.changed((java.lang.Object) r12)
            if (r26 == 0) goto L_0x0270
            r26 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x0272
        L_0x0270:
            r26 = 268435456(0x10000000, float:2.5243549E-29)
        L_0x0272:
            r6 = r6 | r26
            goto L_0x0277
        L_0x0275:
            r12 = r142
        L_0x0277:
            r26 = r147 & 14
            if (r26 != 0) goto L_0x0291
            r26 = r9 & r21
            r12 = r143
            if (r26 != 0) goto L_0x028a
            boolean r26 = r8.changed((java.lang.Object) r12)
            if (r26 == 0) goto L_0x028a
            r26 = 4
            goto L_0x028c
        L_0x028a:
            r26 = 2
        L_0x028c:
            r26 = r147 | r26
            r116 = r26
            goto L_0x0295
        L_0x0291:
            r12 = r143
            r116 = r147
        L_0x0295:
            r26 = 1533916891(0x5b6db6db, float:6.6910621E16)
            r12 = r0 & r26
            r15 = 306783378(0x12492492, float:6.3469493E-28)
            if (r12 != r15) goto L_0x02e1
            r12 = 1533916891(0x5b6db6db, float:6.6910621E16)
            r12 = r12 & r6
            r15 = 306783378(0x12492492, float:6.3469493E-28)
            if (r12 != r15) goto L_0x02e1
            r12 = r116 & 11
            r15 = 2
            if (r12 != r15) goto L_0x02e1
            boolean r12 = r8.getSkipping()
            if (r12 != 0) goto L_0x02b4
            goto L_0x02e1
        L_0x02b4:
            r8.skipToGroupEnd()
            r3 = r125
            r4 = r126
            r5 = r127
            r6 = r128
            r7 = r129
            r9 = r131
            r10 = r132
            r11 = r133
            r12 = r134
            r13 = r135
            r14 = r136
            r15 = r137
            r16 = r138
            r17 = r139
            r18 = r140
            r19 = r141
            r20 = r142
            r21 = r143
            r43 = r8
            r8 = r130
            goto L_0x05a1
        L_0x02e1:
            r8.startDefaults()
            r12 = r13 & 1
            if (r12 == 0) goto L_0x0338
            boolean r12 = r8.getDefaultsInvalid()
            if (r12 == 0) goto L_0x02ef
            goto L_0x0338
        L_0x02ef:
            r8.skipToGroupEnd()
            r1 = r9 & 32
            if (r1 == 0) goto L_0x02fa
            r1 = -458753(0xfffffffffff8ffff, float:NaN)
            r0 = r0 & r1
        L_0x02fa:
            r1 = r9 & r19
            if (r1 == 0) goto L_0x0302
            r1 = -3670017(0xffffffffffc7ffff, float:NaN)
            r6 = r6 & r1
        L_0x0302:
            r1 = r9 & r22
            if (r1 == 0) goto L_0x030a
            r1 = -1879048193(0xffffffff8fffffff, float:-2.5243547E-29)
            r6 = r6 & r1
        L_0x030a:
            r1 = r9 & r21
            if (r1 == 0) goto L_0x0310
            r116 = r116 & -15
        L_0x0310:
            r118 = r125
            r28 = r126
            r117 = r127
            r29 = r128
            r30 = r129
            r31 = r130
            r32 = r131
            r33 = r132
            r34 = r133
            r35 = r134
            r36 = r135
            r37 = r136
            r38 = r137
            r119 = r138
            r39 = r139
            r120 = r140
            r40 = r141
            r41 = r142
            r42 = r143
            goto L_0x04e3
        L_0x0338:
            if (r3 == 0) goto L_0x033f
            androidx.compose.ui.Modifier$Companion r3 = androidx.compose.ui.Modifier.Companion
            androidx.compose.ui.Modifier r3 = (androidx.compose.ui.Modifier) r3
            goto L_0x0341
        L_0x033f:
            r3 = r125
        L_0x0341:
            if (r11 == 0) goto L_0x0345
            r11 = 1
            goto L_0x0347
        L_0x0345:
            r11 = r126
        L_0x0347:
            if (r16 == 0) goto L_0x034e
            r16 = 0
            r117 = r16
            goto L_0x0350
        L_0x034e:
            r117 = r127
        L_0x0350:
            r16 = r9 & 32
            if (r16 == 0) goto L_0x0374
            androidx.compose.runtime.ProvidableCompositionLocal r16 = androidx.compose.material3.TextKt.getLocalTextStyle()
            r12 = r16
            androidx.compose.runtime.CompositionLocal r12 = (androidx.compose.runtime.CompositionLocal) r12
            r15 = 2023513938(0x789c5f52, float:2.5372864E34)
            r118 = r3
            java.lang.String r3 = "CC:CompositionLocal.kt#9igjgp"
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(r8, r15, r3)
            java.lang.Object r3 = r8.consume(r12)
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(r8)
            androidx.compose.ui.text.TextStyle r3 = (androidx.compose.ui.text.TextStyle) r3
            r12 = -458753(0xfffffffffff8ffff, float:NaN)
            r0 = r0 & r12
            goto L_0x0378
        L_0x0374:
            r118 = r3
            r3 = r128
        L_0x0378:
            r12 = 0
            if (r20 == 0) goto L_0x037d
            r15 = r12
            goto L_0x037f
        L_0x037d:
            r15 = r129
        L_0x037f:
            if (r7 == 0) goto L_0x0383
            r7 = r12
            goto L_0x0385
        L_0x0383:
            r7 = r130
        L_0x0385:
            if (r1 == 0) goto L_0x0389
            r1 = r12
            goto L_0x038b
        L_0x0389:
            r1 = r131
        L_0x038b:
            if (r2 == 0) goto L_0x038f
            r2 = r12
            goto L_0x0391
        L_0x038f:
            r2 = r132
        L_0x0391:
            if (r4 == 0) goto L_0x0394
            goto L_0x0396
        L_0x0394:
            r12 = r133
        L_0x0396:
            if (r5 == 0) goto L_0x039a
            r4 = 0
            goto L_0x039c
        L_0x039a:
            r4 = r134
        L_0x039c:
            if (r10 == 0) goto L_0x03a5
            androidx.compose.ui.text.input.VisualTransformation$Companion r5 = androidx.compose.ui.text.input.VisualTransformation.Companion
            androidx.compose.ui.text.input.VisualTransformation r5 = r5.getNone()
            goto L_0x03a7
        L_0x03a5:
            r5 = r135
        L_0x03a7:
            if (r14 == 0) goto L_0x03b0
            androidx.compose.foundation.text.KeyboardOptions$Companion r10 = androidx.compose.foundation.text.KeyboardOptions.Companion
            androidx.compose.foundation.text.KeyboardOptions r10 = r10.getDefault()
            goto L_0x03b2
        L_0x03b0:
            r10 = r136
        L_0x03b2:
            if (r17 == 0) goto L_0x03bb
            androidx.compose.foundation.text.KeyboardActions$Companion r14 = androidx.compose.foundation.text.KeyboardActions.Companion
            androidx.compose.foundation.text.KeyboardActions r14 = r14.getDefault()
            goto L_0x03bd
        L_0x03bb:
            r14 = r137
        L_0x03bd:
            if (r18 == 0) goto L_0x03c4
            r16 = 0
            r119 = r16
            goto L_0x03c6
        L_0x03c4:
            r119 = r138
        L_0x03c6:
            r16 = r9 & r19
            if (r16 == 0) goto L_0x03de
            if (r119 == 0) goto L_0x03cf
            r16 = 1
            goto L_0x03d2
        L_0x03cf:
            r16 = 2147483647(0x7fffffff, float:NaN)
        L_0x03d2:
            r17 = -3670017(0xffffffffffc7ffff, float:NaN)
            r6 = r6 & r17
            r122 = r16
            r16 = r6
            r6 = r122
            goto L_0x03e2
        L_0x03de:
            r16 = r6
            r6 = r139
        L_0x03e2:
            if (r23 == 0) goto L_0x03e7
            r120 = 1
            goto L_0x03e9
        L_0x03e7:
            r120 = r140
        L_0x03e9:
            r125 = r0
            if (r24 == 0) goto L_0x0413
            r0 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r8.startReplaceableGroup(r0)
            java.lang.String r0 = "CC(remember):Composables.kt#9igjgp"
            androidx.compose.runtime.ComposerKt.sourceInformation(r8, r0)
            java.lang.Object r0 = r8.rememberedValue()
            androidx.compose.runtime.Composer$Companion r17 = androidx.compose.runtime.Composer.Companion
            r126 = r1
            java.lang.Object r1 = r17.getEmpty()
            if (r0 != r1) goto L_0x040d
            androidx.compose.foundation.interaction.MutableInteractionSource r0 = androidx.compose.foundation.interaction.InteractionSourceKt.MutableInteractionSource()
            r8.updateRememberedValue(r0)
        L_0x040d:
            r8.endReplaceableGroup()
            androidx.compose.foundation.interaction.MutableInteractionSource r0 = (androidx.compose.foundation.interaction.MutableInteractionSource) r0
            goto L_0x0417
        L_0x0413:
            r126 = r1
            r0 = r141
        L_0x0417:
            r1 = r9 & r22
            if (r1 == 0) goto L_0x042a
            androidx.compose.material3.TextFieldDefaults r1 = androidx.compose.material3.TextFieldDefaults.INSTANCE
            r127 = r0
            r0 = 6
            androidx.compose.ui.graphics.Shape r1 = r1.getShape(r8, r0)
            r0 = -1879048193(0xffffffff8fffffff, float:-2.5243547E-29)
            r0 = r16 & r0
            goto L_0x0430
        L_0x042a:
            r127 = r0
            r1 = r142
            r0 = r16
        L_0x0430:
            r16 = r9 & r21
            if (r16 == 0) goto L_0x04c2
            androidx.compose.material3.TextFieldDefaults r16 = androidx.compose.material3.TextFieldDefaults.INSTANCE
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
            r38 = 0
            r40 = 0
            r42 = 0
            r44 = 0
            r46 = 0
            r48 = 0
            r50 = 0
            r52 = 0
            r54 = 0
            r56 = 0
            r58 = 0
            r60 = 0
            r62 = 0
            r64 = 0
            r66 = 0
            r68 = 0
            r70 = 0
            r72 = 0
            r74 = 0
            r76 = 0
            r78 = 0
            r80 = 0
            r82 = 0
            r84 = 0
            r86 = 0
            r88 = 0
            r90 = 0
            r92 = 0
            r94 = 0
            r96 = 0
            r98 = 0
            r100 = 0
            r103 = 0
            r104 = 0
            r105 = 0
            r106 = 0
            r107 = 3072(0xc00, float:4.305E-42)
            r108 = 2147483647(0x7fffffff, float:NaN)
            r109 = 4095(0xfff, float:5.738E-42)
            r102 = r8
            androidx.compose.material3.TextFieldColors r16 = r16.m1696colors0hiis_0(r17, r19, r21, r23, r25, r27, r29, r31, r33, r35, r37, r38, r40, r42, r44, r46, r48, r50, r52, r54, r56, r58, r60, r62, r64, r66, r68, r70, r72, r74, r76, r78, r80, r82, r84, r86, r88, r90, r92, r94, r96, r98, r100, r102, r103, r104, r105, r106, r107, r108, r109)
            r116 = r116 & -15
            r32 = r126
            r40 = r127
            r41 = r1
            r33 = r2
            r29 = r3
            r35 = r4
            r36 = r5
            r39 = r6
            r31 = r7
            r37 = r10
            r28 = r11
            r34 = r12
            r38 = r14
            r30 = r15
            r42 = r16
            goto L_0x04e0
        L_0x04c2:
            r32 = r126
            r40 = r127
            r42 = r143
            r41 = r1
            r33 = r2
            r29 = r3
            r35 = r4
            r36 = r5
            r39 = r6
            r31 = r7
            r37 = r10
            r28 = r11
            r34 = r12
            r38 = r14
            r30 = r15
        L_0x04e0:
            r6 = r0
            r0 = r125
        L_0x04e3:
            r8.endDefaults()
            boolean r1 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r1 == 0) goto L_0x04f5
            r1 = 1523846136(0x5ad40bf8, float:2.98429274E16)
            java.lang.String r2 = "androidx.compose.material3.TextField (TextField.kt:442)"
            androidx.compose.runtime.ComposerKt.traceEventStart(r1, r0, r6, r2)
        L_0x04f5:
            r10 = 0
            r11 = 0
            r1 = r0 & 14
            r2 = r0 & 112(0x70, float:1.57E-43)
            r1 = r1 | r2
            r2 = r0 & 896(0x380, float:1.256E-42)
            r1 = r1 | r2
            r2 = r0 & 7168(0x1c00, float:1.0045E-41)
            r1 = r1 | r2
            r2 = r0 & r110
            r1 = r1 | r2
            r2 = r0 & r111
            r1 = r1 | r2
            r2 = r0 & r112
            r1 = r1 | r2
            r2 = r0 & r113
            r1 = r1 | r2
            r2 = r0 & r114
            r1 = r1 | r2
            r0 = r0 & r115
            r24 = r1 | r0
            int r0 = r6 << 6
            r1 = r0 & 896(0x380, float:1.256E-42)
            r1 = r1 | 54
            r2 = r0 & 7168(0x1c00, float:1.0045E-41)
            r1 = r1 | r2
            r2 = r0 & r110
            r1 = r1 | r2
            r2 = r0 & r111
            r1 = r1 | r2
            r2 = r0 & r112
            r1 = r1 | r2
            r2 = r0 & r113
            r1 = r1 | r2
            r2 = r0 & r114
            r1 = r1 | r2
            r0 = r0 & r115
            r25 = r1 | r0
            int r0 = r6 >> 24
            r1 = r0 & 14
            r0 = r0 & 112(0x70, float:1.57E-43)
            r0 = r0 | r1
            r1 = 6
            int r1 = r116 << 6
            r1 = r1 & 896(0x380, float:1.256E-42)
            r26 = r0 | r1
            r27 = 0
            r0 = r123
            r1 = r124
            r2 = r118
            r3 = r28
            r4 = r117
            r5 = r29
            r6 = r30
            r7 = r31
            r43 = r8
            r8 = r32
            r9 = r33
            r12 = r34
            r13 = r35
            r14 = r36
            r15 = r37
            r16 = r38
            r17 = r119
            r18 = r39
            r19 = r120
            r20 = r40
            r21 = r41
            r22 = r42
            r23 = r43
            TextField((androidx.compose.ui.text.input.TextFieldValue) r0, (kotlin.jvm.functions.Function1<? super androidx.compose.ui.text.input.TextFieldValue, kotlin.Unit>) r1, (androidx.compose.ui.Modifier) r2, (boolean) r3, (boolean) r4, (androidx.compose.ui.text.TextStyle) r5, (kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>) r6, (kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>) r7, (kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>) r8, (kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>) r9, (kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>) r10, (kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>) r11, (kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>) r12, (boolean) r13, (androidx.compose.ui.text.input.VisualTransformation) r14, (androidx.compose.foundation.text.KeyboardOptions) r15, (androidx.compose.foundation.text.KeyboardActions) r16, (boolean) r17, (int) r18, (int) r19, (androidx.compose.foundation.interaction.MutableInteractionSource) r20, (androidx.compose.ui.graphics.Shape) r21, (androidx.compose.material3.TextFieldColors) r22, (androidx.compose.runtime.Composer) r23, (int) r24, (int) r25, (int) r26, (int) r27)
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto L_0x057b
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L_0x057b:
            r4 = r28
            r6 = r29
            r7 = r30
            r8 = r31
            r9 = r32
            r10 = r33
            r11 = r34
            r12 = r35
            r13 = r36
            r14 = r37
            r15 = r38
            r17 = r39
            r19 = r40
            r20 = r41
            r21 = r42
            r5 = r117
            r3 = r118
            r16 = r119
            r18 = r120
        L_0x05a1:
            androidx.compose.runtime.ScopeUpdateScope r2 = r43.endRestartGroup()
            if (r2 != 0) goto L_0x05a8
            goto L_0x05c6
        L_0x05a8:
            androidx.compose.material3.TextFieldKt$TextField$10 r26 = new androidx.compose.material3.TextFieldKt$TextField$10
            r0 = r26
            r1 = r123
            r121 = r2
            r2 = r124
            r22 = r145
            r23 = r146
            r24 = r147
            r25 = r148
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)
            r0 = r26
            kotlin.jvm.functions.Function2 r0 = (kotlin.jvm.functions.Function2) r0
            r1 = r121
            r1.updateScope(r0)
        L_0x05c6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.TextFieldKt.TextField(androidx.compose.ui.text.input.TextFieldValue, kotlin.jvm.functions.Function1, androidx.compose.ui.Modifier, boolean, boolean, androidx.compose.ui.text.TextStyle, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, boolean, androidx.compose.ui.text.input.VisualTransformation, androidx.compose.foundation.text.KeyboardOptions, androidx.compose.foundation.text.KeyboardActions, boolean, int, int, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.ui.graphics.Shape, androidx.compose.material3.TextFieldColors, androidx.compose.runtime.Composer, int, int, int, int):void");
    }

    public static final void TextFieldLayout(Modifier modifier, Function2<? super Composer, ? super Integer, Unit> function2, Function2<? super Composer, ? super Integer, Unit> function22, Function3<? super Modifier, ? super Composer, ? super Integer, Unit> function3, Function2<? super Composer, ? super Integer, Unit> function23, Function2<? super Composer, ? super Integer, Unit> function24, Function2<? super Composer, ? super Integer, Unit> function25, Function2<? super Composer, ? super Integer, Unit> function26, boolean z, float f, Function2<? super Composer, ? super Integer, Unit> function27, Function2<? super Composer, ? super Integer, Unit> function28, PaddingValues paddingValues, Composer composer, int i, int i2) {
        int i3;
        int i4;
        PaddingValues paddingValues2;
        int i5;
        int i6;
        float f2;
        float f3;
        float f4;
        Modifier modifier2 = modifier;
        Function2<? super Composer, ? super Integer, Unit> function29 = function2;
        Function2<? super Composer, ? super Integer, Unit> function210 = function22;
        Function3<? super Modifier, ? super Composer, ? super Integer, Unit> function32 = function3;
        Function2<? super Composer, ? super Integer, Unit> function211 = function23;
        Function2<? super Composer, ? super Integer, Unit> function212 = function24;
        Function2<? super Composer, ? super Integer, Unit> function213 = function25;
        Function2<? super Composer, ? super Integer, Unit> function214 = function26;
        boolean z2 = z;
        float f5 = f;
        Function2<? super Composer, ? super Integer, Unit> function215 = function27;
        Function2<? super Composer, ? super Integer, Unit> function216 = function28;
        int i7 = i;
        int i8 = i2;
        Intrinsics.checkNotNullParameter(modifier2, "modifier");
        Intrinsics.checkNotNullParameter(function29, "textField");
        Intrinsics.checkNotNullParameter(function215, "container");
        Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
        Composer startRestartGroup = composer.startRestartGroup(-1830307184);
        ComposerKt.sourceInformation(startRestartGroup, "C(TextFieldLayout)P(4,11,2,6,3,12,7,9,8!2,10)512@24588L139,515@24775L7,516@24787L3994:TextField.kt#uh7d8r");
        int i9 = 4;
        if ((i7 & 14) == 0) {
            i3 = (startRestartGroup.changed((Object) modifier2) ? 4 : 2) | i7;
        } else {
            i3 = i7;
        }
        if ((i7 & 112) == 0) {
            i3 |= startRestartGroup.changedInstance(function29) ? 32 : 16;
        }
        if ((i7 & 896) == 0) {
            i3 |= startRestartGroup.changedInstance(function210) ? 256 : 128;
        }
        if ((i7 & 7168) == 0) {
            i3 |= startRestartGroup.changedInstance(function32) ? 2048 : 1024;
        }
        if ((57344 & i7) == 0) {
            i3 |= startRestartGroup.changedInstance(function211) ? 16384 : 8192;
        }
        if ((458752 & i7) == 0) {
            i3 |= startRestartGroup.changedInstance(function212) ? 131072 : 65536;
        }
        if ((3670016 & i7) == 0) {
            i3 |= startRestartGroup.changedInstance(function213) ? 1048576 : 524288;
        }
        if ((29360128 & i7) == 0) {
            i3 |= startRestartGroup.changedInstance(function214) ? 8388608 : 4194304;
        }
        if ((234881024 & i7) == 0) {
            i3 |= startRestartGroup.changed(z2) ? 67108864 : 33554432;
        }
        if ((1879048192 & i7) == 0) {
            i3 |= startRestartGroup.changed(f5) ? 536870912 : 268435456;
        }
        if ((i8 & 14) == 0) {
            if (!startRestartGroup.changedInstance(function215)) {
                i9 = 2;
            }
            i4 = i8 | i9;
        } else {
            i4 = i8;
        }
        Function2<? super Composer, ? super Integer, Unit> function217 = function28;
        if ((i8 & 112) == 0) {
            i4 |= startRestartGroup.changedInstance(function217) ? 32 : 16;
        }
        if ((i8 & 896) == 0) {
            paddingValues2 = paddingValues;
            i4 |= startRestartGroup.changed((Object) paddingValues2) ? 256 : 128;
        } else {
            paddingValues2 = paddingValues;
        }
        if ((i3 & 1533916891) == 306783378 && (i4 & 731) == 146 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
            Function2<? super Composer, ? super Integer, Unit> function218 = function28;
            Function3<? super Modifier, ? super Composer, ? super Integer, Unit> function33 = function32;
            float f6 = f5;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1830307184, i3, i4, "androidx.compose.material3.TextFieldLayout (TextField.kt:497)");
            }
            Boolean valueOf = Boolean.valueOf(z);
            Float valueOf2 = Float.valueOf(f);
            startRestartGroup.startReplaceableGroup(1618982084);
            ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1,2,3):Composables.kt#9igjgp");
            boolean changed = startRestartGroup.changed((Object) valueOf) | startRestartGroup.changed((Object) valueOf2) | startRestartGroup.changed((Object) paddingValues2);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new TextFieldMeasurePolicy(z2, f5, paddingValues2);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            startRestartGroup.endReplaceableGroup();
            TextFieldMeasurePolicy textFieldMeasurePolicy = (TextFieldMeasurePolicy) rememberedValue;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object consume = startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            LayoutDirection layoutDirection = (LayoutDirection) consume;
            startRestartGroup.startReplaceableGroup(-1323940314);
            ComposerKt.sourceInformation(startRestartGroup, "CC(Layout)P(!1,2)73@2855L7,74@2910L7,75@2969L7,76@2981L460:Layout.kt#80mrfh");
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object consume2 = startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            Density density = (Density) consume2;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object consume3 = startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            LayoutDirection layoutDirection2 = (LayoutDirection) consume3;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object consume4 = startRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ViewConfiguration viewConfiguration = (ViewConfiguration) consume4;
            Function0<ComposeUiNode> constructor = ComposeUiNode.Companion.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf = LayoutKt.materializerOf(modifier);
            int i10 = ((((i3 << 3) & 112) << 9) & 7168) | 6;
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor);
            } else {
                startRestartGroup.useNode();
            }
            Composer r4 = Updater.m2444constructorimpl(startRestartGroup);
            Updater.m2451setimpl(r4, textFieldMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.m2451setimpl(r4, density, ComposeUiNode.Companion.getSetDensity());
            Updater.m2451setimpl(r4, layoutDirection2, ComposeUiNode.Companion.getSetLayoutDirection());
            Updater.m2451setimpl(r4, viewConfiguration, ComposeUiNode.Companion.getSetViewConfiguration());
            materializerOf.invoke(SkippableUpdater.m2435boximpl(SkippableUpdater.m2436constructorimpl(startRestartGroup)), startRestartGroup, Integer.valueOf((i10 >> 3) & 112));
            startRestartGroup.startReplaceableGroup(2058660585);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -95272033, "C522@25106L11,605@28102L229:TextField.kt#uh7d8r");
            function215.invoke(startRestartGroup, Integer.valueOf(i4 & 14));
            startRestartGroup.startReplaceableGroup(-95272008);
            ComposerKt.sourceInformation(startRestartGroup, "525@25170L269");
            if (function211 != null) {
                Modifier then = LayoutIdKt.layoutId(Modifier.Companion, TextFieldImplKt.LeadingId).then(TextFieldImplKt.getIconDefaultSizeModifier());
                Alignment center = Alignment.Companion.getCenter();
                startRestartGroup.startReplaceableGroup(733328855);
                ComposerKt.sourceInformation(startRestartGroup, "CC(Box)P(2,1,3)70@3267L67,71@3339L130:Box.kt#2w3rfo");
                MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(center, false, startRestartGroup, 6);
                startRestartGroup.startReplaceableGroup(-1323940314);
                ComposerKt.sourceInformation(startRestartGroup, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
                Object consume5 = startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                Density density2 = (Density) consume5;
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
                Object consume6 = startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                LayoutDirection layoutDirection3 = (LayoutDirection) consume6;
                i5 = i4;
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
                Object consume7 = startRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ViewConfiguration viewConfiguration2 = (ViewConfiguration) consume7;
                Function0<ComposeUiNode> constructor2 = ComposeUiNode.Companion.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf2 = LayoutKt.materializerOf(then);
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
                Composer r1 = Updater.m2444constructorimpl(startRestartGroup);
                Updater.m2451setimpl(r1, rememberBoxMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
                Updater.m2451setimpl(r1, density2, ComposeUiNode.Companion.getSetDensity());
                Updater.m2451setimpl(r1, layoutDirection3, ComposeUiNode.Companion.getSetLayoutDirection());
                Updater.m2451setimpl(r1, viewConfiguration2, ComposeUiNode.Companion.getSetViewConfiguration());
                startRestartGroup.enableReusing();
                materializerOf2.invoke(SkippableUpdater.m2435boximpl(SkippableUpdater.m2436constructorimpl(startRestartGroup)), startRestartGroup, 0);
                startRestartGroup.startReplaceableGroup(2058660585);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1253629305, "C72@3384L9:Box.kt#2w3rfo");
                BoxScope boxScope = BoxScopeInstance.INSTANCE;
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1219124082, "C531@25412L9:TextField.kt#uh7d8r");
                function211.invoke(startRestartGroup, Integer.valueOf((i3 >> 12) & 14));
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endNode();
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endReplaceableGroup();
            } else {
                i5 = i4;
            }
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.startReplaceableGroup(-95271673);
            ComposerKt.sourceInformation(startRestartGroup, "535@25506L271");
            if (function212 != null) {
                Modifier then2 = LayoutIdKt.layoutId(Modifier.Companion, TextFieldImplKt.TrailingId).then(TextFieldImplKt.getIconDefaultSizeModifier());
                Alignment center2 = Alignment.Companion.getCenter();
                startRestartGroup.startReplaceableGroup(733328855);
                ComposerKt.sourceInformation(startRestartGroup, "CC(Box)P(2,1,3)70@3267L67,71@3339L130:Box.kt#2w3rfo");
                MeasurePolicy rememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(center2, false, startRestartGroup, 6);
                startRestartGroup.startReplaceableGroup(-1323940314);
                ComposerKt.sourceInformation(startRestartGroup, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
                Object consume8 = startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                Density density3 = (Density) consume8;
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
                Object consume9 = startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                LayoutDirection layoutDirection4 = (LayoutDirection) consume9;
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
                Object consume10 = startRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ViewConfiguration viewConfiguration3 = (ViewConfiguration) consume10;
                Function0<ComposeUiNode> constructor3 = ComposeUiNode.Companion.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf3 = LayoutKt.materializerOf(then2);
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
                Composer r12 = Updater.m2444constructorimpl(startRestartGroup);
                Updater.m2451setimpl(r12, rememberBoxMeasurePolicy2, ComposeUiNode.Companion.getSetMeasurePolicy());
                Updater.m2451setimpl(r12, density3, ComposeUiNode.Companion.getSetDensity());
                Updater.m2451setimpl(r12, layoutDirection4, ComposeUiNode.Companion.getSetLayoutDirection());
                Updater.m2451setimpl(r12, viewConfiguration3, ComposeUiNode.Companion.getSetViewConfiguration());
                startRestartGroup.enableReusing();
                materializerOf3.invoke(SkippableUpdater.m2435boximpl(SkippableUpdater.m2436constructorimpl(startRestartGroup)), startRestartGroup, 0);
                startRestartGroup.startReplaceableGroup(2058660585);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1253629305, "C72@3384L9:Box.kt#2w3rfo");
                BoxScope boxScope2 = BoxScopeInstance.INSTANCE;
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1219124419, "C541@25749L10:TextField.kt#uh7d8r");
                function212.invoke(startRestartGroup, Integer.valueOf((i3 >> 15) & 14));
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endNode();
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endReplaceableGroup();
            }
            startRestartGroup.endReplaceableGroup();
            PaddingValues paddingValues3 = paddingValues;
            float calculateStartPadding = PaddingKt.calculateStartPadding(paddingValues3, layoutDirection);
            float calculateEndPadding = PaddingKt.calculateEndPadding(paddingValues3, layoutDirection);
            if (function211 != null) {
                i6 = 0;
                calculateStartPadding = Dp.m5626constructorimpl(RangesKt.coerceAtLeast(Dp.m5626constructorimpl(calculateStartPadding - TextFieldImplKt.getHorizontalIconPadding()), Dp.m5626constructorimpl((float) 0)));
            } else {
                i6 = 0;
            }
            if (function212 != null) {
                calculateEndPadding = Dp.m5626constructorimpl(RangesKt.coerceAtLeast(Dp.m5626constructorimpl(calculateEndPadding - TextFieldImplKt.getHorizontalIconPadding()), Dp.m5626constructorimpl((float) i6)));
            }
            startRestartGroup.startReplaceableGroup(-95270733);
            ComposerKt.sourceInformation(startRestartGroup, "560@26444L334");
            Function2<? super Composer, ? super Integer, Unit> function219 = function25;
            if (function219 != null) {
                Modifier r13 = PaddingKt.m497paddingqDBjuR0$default(SizeKt.wrapContentHeight$default(SizeKt.m551heightInVpY3zN4$default(LayoutIdKt.layoutId(Modifier.Companion, TextFieldImplKt.PrefixId), TextFieldImplKt.getMinTextLineHeight(), 0.0f, 2, (Object) null), (Alignment.Vertical) null, false, 3, (Object) null), calculateStartPadding, 0.0f, TextFieldImplKt.getPrefixSuffixTextPadding(), 0.0f, 10, (Object) null);
                startRestartGroup.startReplaceableGroup(733328855);
                ComposerKt.sourceInformation(startRestartGroup, "CC(Box)P(2,1,3)70@3267L67,71@3339L130:Box.kt#2w3rfo");
                MeasurePolicy rememberBoxMeasurePolicy3 = BoxKt.rememberBoxMeasurePolicy(Alignment.Companion.getTopStart(), false, startRestartGroup, 0);
                startRestartGroup.startReplaceableGroup(-1323940314);
                ComposerKt.sourceInformation(startRestartGroup, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
                Object consume11 = startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                Density density4 = (Density) consume11;
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
                Object consume12 = startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                LayoutDirection layoutDirection5 = (LayoutDirection) consume12;
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
                Object consume13 = startRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ViewConfiguration viewConfiguration4 = (ViewConfiguration) consume13;
                Function0<ComposeUiNode> constructor4 = ComposeUiNode.Companion.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf4 = LayoutKt.materializerOf(r13);
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
                Composer r5 = Updater.m2444constructorimpl(startRestartGroup);
                Updater.m2451setimpl(r5, rememberBoxMeasurePolicy3, ComposeUiNode.Companion.getSetMeasurePolicy());
                Updater.m2451setimpl(r5, density4, ComposeUiNode.Companion.getSetDensity());
                Updater.m2451setimpl(r5, layoutDirection5, ComposeUiNode.Companion.getSetLayoutDirection());
                Updater.m2451setimpl(r5, viewConfiguration4, ComposeUiNode.Companion.getSetViewConfiguration());
                startRestartGroup.enableReusing();
                materializerOf4.invoke(SkippableUpdater.m2435boximpl(SkippableUpdater.m2436constructorimpl(startRestartGroup)), startRestartGroup, 0);
                startRestartGroup.startReplaceableGroup(2058660585);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1253629305, "C72@3384L9:Box.kt#2w3rfo");
                BoxScope boxScope3 = BoxScopeInstance.INSTANCE;
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1219125422, "C567@26752L8:TextField.kt#uh7d8r");
                function219.invoke(startRestartGroup, Integer.valueOf((i3 >> 18) & 14));
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endNode();
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endReplaceableGroup();
            }
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.startReplaceableGroup(-95270334);
            ComposerKt.sourceInformation(startRestartGroup, "571@26843L332");
            Function2<? super Composer, ? super Integer, Unit> function220 = function26;
            if (function220 != null) {
                Modifier r14 = PaddingKt.m497paddingqDBjuR0$default(SizeKt.wrapContentHeight$default(SizeKt.m551heightInVpY3zN4$default(LayoutIdKt.layoutId(Modifier.Companion, TextFieldImplKt.SuffixId), TextFieldImplKt.getMinTextLineHeight(), 0.0f, 2, (Object) null), (Alignment.Vertical) null, false, 3, (Object) null), TextFieldImplKt.getPrefixSuffixTextPadding(), 0.0f, calculateEndPadding, 0.0f, 10, (Object) null);
                startRestartGroup.startReplaceableGroup(733328855);
                ComposerKt.sourceInformation(startRestartGroup, "CC(Box)P(2,1,3)70@3267L67,71@3339L130:Box.kt#2w3rfo");
                MeasurePolicy rememberBoxMeasurePolicy4 = BoxKt.rememberBoxMeasurePolicy(Alignment.Companion.getTopStart(), false, startRestartGroup, 0);
                startRestartGroup.startReplaceableGroup(-1323940314);
                ComposerKt.sourceInformation(startRestartGroup, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
                Object consume14 = startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                Density density5 = (Density) consume14;
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
                Object consume15 = startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                LayoutDirection layoutDirection6 = (LayoutDirection) consume15;
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
                Object consume16 = startRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ViewConfiguration viewConfiguration5 = (ViewConfiguration) consume16;
                Function0<ComposeUiNode> constructor5 = ComposeUiNode.Companion.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf5 = LayoutKt.materializerOf(r14);
                if (!(startRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                startRestartGroup.startReusableNode();
                if (startRestartGroup.getInserting()) {
                    startRestartGroup.createNode(constructor5);
                } else {
                    startRestartGroup.useNode();
                }
                startRestartGroup.disableReusing();
                Composer r11 = Updater.m2444constructorimpl(startRestartGroup);
                Updater.m2451setimpl(r11, rememberBoxMeasurePolicy4, ComposeUiNode.Companion.getSetMeasurePolicy());
                Updater.m2451setimpl(r11, density5, ComposeUiNode.Companion.getSetDensity());
                Updater.m2451setimpl(r11, layoutDirection6, ComposeUiNode.Companion.getSetLayoutDirection());
                Updater.m2451setimpl(r11, viewConfiguration5, ComposeUiNode.Companion.getSetViewConfiguration());
                startRestartGroup.enableReusing();
                materializerOf5.invoke(SkippableUpdater.m2435boximpl(SkippableUpdater.m2436constructorimpl(startRestartGroup)), startRestartGroup, 0);
                startRestartGroup.startReplaceableGroup(2058660585);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1253629305, "C72@3384L9:Box.kt#2w3rfo");
                BoxScope boxScope4 = BoxScopeInstance.INSTANCE;
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1219125819, "C578@27149L8:TextField.kt#uh7d8r");
                function220.invoke(startRestartGroup, Integer.valueOf((i3 >> 21) & 14));
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endNode();
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endReplaceableGroup();
            }
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.startReplaceableGroup(-95269936);
            ComposerKt.sourceInformation(startRestartGroup, "583@27240L347");
            Function2<? super Composer, ? super Integer, Unit> function221 = function22;
            if (function221 != null) {
                f2 = calculateStartPadding;
                Modifier r15 = PaddingKt.m497paddingqDBjuR0$default(SizeKt.wrapContentHeight$default(SizeKt.m551heightInVpY3zN4$default(LayoutIdKt.layoutId(Modifier.Companion, TextFieldImplKt.LabelId), DpKt.m5669lerpMdfbLM(TextFieldImplKt.getMinTextLineHeight(), TextFieldImplKt.getMinFocusedLabelLineHeight(), f), 0.0f, 2, (Object) null), (Alignment.Vertical) null, false, 3, (Object) null), f2, 0.0f, calculateEndPadding, 0.0f, 10, (Object) null);
                startRestartGroup.startReplaceableGroup(733328855);
                ComposerKt.sourceInformation(startRestartGroup, "CC(Box)P(2,1,3)70@3267L67,71@3339L130:Box.kt#2w3rfo");
                MeasurePolicy rememberBoxMeasurePolicy5 = BoxKt.rememberBoxMeasurePolicy(Alignment.Companion.getTopStart(), false, startRestartGroup, 0);
                startRestartGroup.startReplaceableGroup(-1323940314);
                ComposerKt.sourceInformation(startRestartGroup, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
                Object consume17 = startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                Density density6 = (Density) consume17;
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
                Object consume18 = startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                LayoutDirection layoutDirection7 = (LayoutDirection) consume18;
                f3 = calculateEndPadding;
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
                Object consume19 = startRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ViewConfiguration viewConfiguration6 = (ViewConfiguration) consume19;
                Function0<ComposeUiNode> constructor6 = ComposeUiNode.Companion.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf6 = LayoutKt.materializerOf(r15);
                if (!(startRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                startRestartGroup.startReusableNode();
                if (startRestartGroup.getInserting()) {
                    startRestartGroup.createNode(constructor6);
                } else {
                    startRestartGroup.useNode();
                }
                startRestartGroup.disableReusing();
                Composer r3 = Updater.m2444constructorimpl(startRestartGroup);
                Updater.m2451setimpl(r3, rememberBoxMeasurePolicy5, ComposeUiNode.Companion.getSetMeasurePolicy());
                Updater.m2451setimpl(r3, density6, ComposeUiNode.Companion.getSetDensity());
                Updater.m2451setimpl(r3, layoutDirection7, ComposeUiNode.Companion.getSetLayoutDirection());
                Updater.m2451setimpl(r3, viewConfiguration6, ComposeUiNode.Companion.getSetViewConfiguration());
                startRestartGroup.enableReusing();
                materializerOf6.invoke(SkippableUpdater.m2435boximpl(SkippableUpdater.m2436constructorimpl(startRestartGroup)), startRestartGroup, 0);
                startRestartGroup.startReplaceableGroup(2058660585);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1253629305, "C72@3384L9:Box.kt#2w3rfo");
                BoxScope boxScope5 = BoxScopeInstance.INSTANCE;
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1219126248, "C589@27578L7:TextField.kt#uh7d8r");
                function221.invoke(startRestartGroup, Integer.valueOf((i3 >> 6) & 14));
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endNode();
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endReplaceableGroup();
            } else {
                float f7 = f;
                f3 = calculateEndPadding;
                f2 = calculateStartPadding;
            }
            startRestartGroup.endReplaceableGroup();
            Modifier wrapContentHeight$default = SizeKt.wrapContentHeight$default(SizeKt.m551heightInVpY3zN4$default(Modifier.Companion, TextFieldImplKt.getMinTextLineHeight(), 0.0f, 2, (Object) null), (Alignment.Vertical) null, false, 3, (Object) null);
            float r29 = function25 == null ? f2 : Dp.m5626constructorimpl((float) 0);
            if (function220 == null) {
                f4 = f3;
            } else {
                f4 = Dp.m5626constructorimpl((float) 0);
            }
            Modifier r16 = PaddingKt.m497paddingqDBjuR0$default(wrapContentHeight$default, r29, 0.0f, f4, 0.0f, 10, (Object) null);
            startRestartGroup.startReplaceableGroup(-95269212);
            ComposerKt.sourceInformation(startRestartGroup, "601@27970L105");
            Function3<? super Modifier, ? super Composer, ? super Integer, Unit> function34 = function3;
            if (function34 != null) {
                function34.invoke(LayoutIdKt.layoutId(Modifier.Companion, TextFieldImplKt.PlaceholderId).then(r16), startRestartGroup, Integer.valueOf((i3 >> 6) & 112));
            }
            startRestartGroup.endReplaceableGroup();
            Modifier then3 = LayoutIdKt.layoutId(Modifier.Companion, TextFieldImplKt.TextFieldId).then(r16);
            startRestartGroup.startReplaceableGroup(733328855);
            ComposerKt.sourceInformation(startRestartGroup, "CC(Box)P(2,1,3)70@3267L67,71@3339L130:Box.kt#2w3rfo");
            MeasurePolicy rememberBoxMeasurePolicy6 = BoxKt.rememberBoxMeasurePolicy(Alignment.Companion.getTopStart(), true, startRestartGroup, 48);
            startRestartGroup.startReplaceableGroup(-1323940314);
            ComposerKt.sourceInformation(startRestartGroup, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
            Object consume20 = startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            Density density7 = (Density) consume20;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
            Object consume21 = startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            LayoutDirection layoutDirection8 = (LayoutDirection) consume21;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
            Object consume22 = startRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ViewConfiguration viewConfiguration7 = (ViewConfiguration) consume22;
            Function0<ComposeUiNode> constructor7 = ComposeUiNode.Companion.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf7 = LayoutKt.materializerOf(then3);
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor7);
            } else {
                startRestartGroup.useNode();
            }
            startRestartGroup.disableReusing();
            Composer r42 = Updater.m2444constructorimpl(startRestartGroup);
            Updater.m2451setimpl(r42, rememberBoxMeasurePolicy6, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.m2451setimpl(r42, density7, ComposeUiNode.Companion.getSetDensity());
            Updater.m2451setimpl(r42, layoutDirection8, ComposeUiNode.Companion.getSetLayoutDirection());
            Updater.m2451setimpl(r42, viewConfiguration7, ComposeUiNode.Companion.getSetViewConfiguration());
            startRestartGroup.enableReusing();
            materializerOf7.invoke(SkippableUpdater.m2435boximpl(SkippableUpdater.m2436constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1253629305, "C72@3384L9:Box.kt#2w3rfo");
            BoxScope boxScope6 = BoxScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1219126976, "C611@28306L11:TextField.kt#uh7d8r");
            function2.invoke(startRestartGroup, Integer.valueOf((i3 >> 3) & 14));
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endNode();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.startReplaceableGroup(243142693);
            ComposerKt.sourceInformation(startRestartGroup, "616@28443L269");
            Function2<? super Composer, ? super Integer, Unit> function222 = function28;
            if (function222 != null) {
                Modifier padding = PaddingKt.padding(SizeKt.wrapContentHeight$default(SizeKt.m551heightInVpY3zN4$default(LayoutIdKt.layoutId(Modifier.Companion, TextFieldImplKt.SupportingId), TextFieldImplKt.getMinSupportingTextLineHeight(), 0.0f, 2, (Object) null), (Alignment.Vertical) null, false, 3, (Object) null), TextFieldDefaults.m1692supportingTextPaddinga9UjIt4$material3_release$default(TextFieldDefaults.INSTANCE, 0.0f, 0.0f, 0.0f, 0.0f, 15, (Object) null));
                startRestartGroup.startReplaceableGroup(733328855);
                ComposerKt.sourceInformation(startRestartGroup, "CC(Box)P(2,1,3)70@3267L67,71@3339L130:Box.kt#2w3rfo");
                MeasurePolicy rememberBoxMeasurePolicy7 = BoxKt.rememberBoxMeasurePolicy(Alignment.Companion.getTopStart(), false, startRestartGroup, 0);
                startRestartGroup.startReplaceableGroup(-1323940314);
                ComposerKt.sourceInformation(startRestartGroup, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
                Object consume23 = startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                Density density8 = (Density) consume23;
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
                Object consume24 = startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                LayoutDirection layoutDirection9 = (LayoutDirection) consume24;
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
                Object consume25 = startRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ViewConfiguration viewConfiguration8 = (ViewConfiguration) consume25;
                Function0<ComposeUiNode> constructor8 = ComposeUiNode.Companion.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf8 = LayoutKt.materializerOf(padding);
                if (!(startRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                startRestartGroup.startReusableNode();
                if (startRestartGroup.getInserting()) {
                    startRestartGroup.createNode(constructor8);
                } else {
                    startRestartGroup.useNode();
                }
                startRestartGroup.disableReusing();
                Composer r9 = Updater.m2444constructorimpl(startRestartGroup);
                Updater.m2451setimpl(r9, rememberBoxMeasurePolicy7, ComposeUiNode.Companion.getSetMeasurePolicy());
                Updater.m2451setimpl(r9, density8, ComposeUiNode.Companion.getSetDensity());
                Updater.m2451setimpl(r9, layoutDirection9, ComposeUiNode.Companion.getSetLayoutDirection());
                Updater.m2451setimpl(r9, viewConfiguration8, ComposeUiNode.Companion.getSetViewConfiguration());
                startRestartGroup.enableReusing();
                materializerOf8.invoke(SkippableUpdater.m2435boximpl(SkippableUpdater.m2436constructorimpl(startRestartGroup)), startRestartGroup, 0);
                startRestartGroup.startReplaceableGroup(2058660585);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1253629305, "C72@3384L9:Box.kt#2w3rfo");
                BoxScope boxScope7 = BoxScopeInstance.INSTANCE;
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1219127368, "C621@28698L12:TextField.kt#uh7d8r");
                function222.invoke(startRestartGroup, Integer.valueOf((i5 >> 3) & 14));
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endNode();
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endReplaceableGroup();
            }
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
            endRestartGroup.updateScope(new TextFieldKt$TextFieldLayout$2(modifier, function2, function22, function3, function23, function24, function25, function26, z, f, function27, function28, paddingValues, i, i2));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: calculateWidth-yeHjK3Y  reason: not valid java name */
    public static final int m1723calculateWidthyeHjK3Y(int i, int i2, int i3, int i4, int i5, int i6, int i7, long j) {
        int i8 = i3 + i4;
        return Math.max(i + Math.max(i5 + i8, Math.max(i7 + i8, i6)) + i2, Constraints.m5572getMinWidthimpl(j));
    }

    /* access modifiers changed from: private */
    /* renamed from: calculateHeight-mKXJcVc  reason: not valid java name */
    public static final int m1722calculateHeightmKXJcVc(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, boolean z, long j, float f, PaddingValues paddingValues) {
        float f2;
        int i9;
        boolean z2 = i2 > 0;
        if (!z2 || z) {
            f2 = Dp.m5626constructorimpl(paddingValues.m506calculateTopPaddingD9Ej5fM() + paddingValues.m503calculateBottomPaddingD9Ej5fM());
        } else {
            f2 = Dp.m5626constructorimpl(TextFieldImplKt.getTextFieldPadding() * ((float) 2));
        }
        float f3 = f * f2;
        if (!z2 || !z) {
            i9 = Math.max(i2, Math.max(i, i7));
        } else {
            f3 += (float) i2;
            i9 = Math.max(i, i7);
        }
        return Math.max(Constraints.m5571getMinHeightimpl(j), ComparisonsKt.maxOf(i3, i4, i5, i6, MathKt.roundToInt(f3 + ((float) i9))) + i8);
    }

    /* access modifiers changed from: private */
    public static final void placeWithLabel(Placeable.PlacementScope placementScope, int i, int i2, Placeable placeable, Placeable placeable2, Placeable placeable3, Placeable placeable4, Placeable placeable5, Placeable placeable6, Placeable placeable7, Placeable placeable8, Placeable placeable9, boolean z, int i3, int i4, float f, float f2) {
        int i5;
        Placeable.PlacementScope.m4560place70tqf50$default(placementScope, placeable8, IntOffset.Companion.m5754getZeronOccac(), 0.0f, 2, (Object) null);
        int heightOrZero = i2 - TextFieldImplKt.heightOrZero(placeable9);
        if (placeable4 != null) {
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable4, 0, Alignment.Companion.getCenterVertically().align(placeable4.getHeight(), heightOrZero), 0.0f, 4, (Object) null);
        }
        if (placeable5 != null) {
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable5, i - placeable5.getWidth(), Alignment.Companion.getCenterVertically().align(placeable5.getHeight(), heightOrZero), 0.0f, 4, (Object) null);
        }
        if (placeable2 != null) {
            if (z) {
                i5 = Alignment.Companion.getCenterVertically().align(placeable2.getHeight(), heightOrZero);
            } else {
                i5 = MathKt.roundToInt(TextFieldImplKt.getTextFieldPadding() * f2);
            }
            int roundToInt = i5 - MathKt.roundToInt(((float) (i5 - i3)) * f);
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable2, TextFieldImplKt.widthOrZero(placeable4), roundToInt, 0.0f, 4, (Object) null);
        }
        if (placeable6 != null) {
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable6, TextFieldImplKt.widthOrZero(placeable4), i4, 0.0f, 4, (Object) null);
        }
        if (placeable7 != null) {
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable7, (i - TextFieldImplKt.widthOrZero(placeable5)) - placeable7.getWidth(), i4, 0.0f, 4, (Object) null);
        }
        int widthOrZero = TextFieldImplKt.widthOrZero(placeable4) + TextFieldImplKt.widthOrZero(placeable6);
        Placeable.PlacementScope.placeRelative$default(placementScope, placeable, widthOrZero, i4, 0.0f, 4, (Object) null);
        if (placeable3 != null) {
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable3, widthOrZero, i4, 0.0f, 4, (Object) null);
        }
        if (placeable9 != null) {
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable9, 0, heightOrZero, 0.0f, 4, (Object) null);
        }
    }

    /* access modifiers changed from: private */
    public static final void placeWithoutLabel(Placeable.PlacementScope placementScope, int i, int i2, Placeable placeable, Placeable placeable2, Placeable placeable3, Placeable placeable4, Placeable placeable5, Placeable placeable6, Placeable placeable7, Placeable placeable8, boolean z, float f, PaddingValues paddingValues) {
        Placeable placeable9 = placeable2;
        Placeable placeable10 = placeable5;
        Placeable placeable11 = placeable6;
        boolean z2 = z;
        Placeable.PlacementScope.m4560place70tqf50$default(placementScope, placeable7, IntOffset.Companion.m5754getZeronOccac(), 0.0f, 2, (Object) null);
        int heightOrZero = i2 - TextFieldImplKt.heightOrZero(placeable8);
        int roundToInt = MathKt.roundToInt(paddingValues.m506calculateTopPaddingD9Ej5fM() * f);
        if (placeable3 != null) {
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable3, 0, Alignment.Companion.getCenterVertically().align(placeable3.getHeight(), heightOrZero), 0.0f, 4, (Object) null);
        }
        if (placeable4 != null) {
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable4, i - placeable4.getWidth(), Alignment.Companion.getCenterVertically().align(placeable4.getHeight(), heightOrZero), 0.0f, 4, (Object) null);
        }
        if (placeable10 != null) {
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable5, TextFieldImplKt.widthOrZero(placeable3), placeWithoutLabel$calculateVerticalPosition(z2, heightOrZero, roundToInt, placeable10), 0.0f, 4, (Object) null);
        }
        if (placeable11 != null) {
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable6, (i - TextFieldImplKt.widthOrZero(placeable4)) - placeable6.getWidth(), placeWithoutLabel$calculateVerticalPosition(z2, heightOrZero, roundToInt, placeable11), 0.0f, 4, (Object) null);
        }
        int widthOrZero = TextFieldImplKt.widthOrZero(placeable3) + TextFieldImplKt.widthOrZero(placeable5);
        Placeable.PlacementScope.placeRelative$default(placementScope, placeable, widthOrZero, placeWithoutLabel$calculateVerticalPosition(z2, heightOrZero, roundToInt, placeable), 0.0f, 4, (Object) null);
        if (placeable9 != null) {
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable2, widthOrZero, placeWithoutLabel$calculateVerticalPosition(z2, heightOrZero, roundToInt, placeable9), 0.0f, 4, (Object) null);
        }
        if (placeable8 != null) {
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable8, 0, heightOrZero, 0.0f, 4, (Object) null);
        }
    }

    private static final int placeWithoutLabel$calculateVerticalPosition(boolean z, int i, int i2, Placeable placeable) {
        return z ? Alignment.Companion.getCenterVertically().align(placeable.getHeight(), i) : i2;
    }

    public static final Modifier drawIndicatorLine(Modifier modifier, BorderStroke borderStroke) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        Intrinsics.checkNotNullParameter(borderStroke, "indicatorBorder");
        return DrawModifierKt.drawWithContent(modifier, new TextFieldKt$drawIndicatorLine$1(borderStroke.m200getWidthD9Ej5fM(), borderStroke));
    }
}
