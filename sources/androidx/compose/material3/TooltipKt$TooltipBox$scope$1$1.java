package androidx.compose.material3;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* compiled from: Tooltip.kt */
public final class TooltipKt$TooltipBox$scope$1$1 implements TooltipBoxScope {
    final /* synthetic */ CoroutineScope $coroutineScope;
    final /* synthetic */ String $longPressLabel;
    final /* synthetic */ TooltipState $tooltipState;

    TooltipKt$TooltipBox$scope$1$1(TooltipState tooltipState, CoroutineScope coroutineScope, String str) {
        this.$tooltipState = tooltipState;
        this.$coroutineScope = coroutineScope;
        this.$longPressLabel = str;
    }

    public Modifier tooltipAnchor(Modifier modifier) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        Function0 tooltipKt$TooltipBox$scope$1$1$tooltipAnchor$onLongPress$1 = new TooltipKt$TooltipBox$scope$1$1$tooltipAnchor$onLongPress$1(this.$coroutineScope, this.$tooltipState);
        return SemanticsModifierKt.semantics(SuspendingPointerInputFilterKt.pointerInput(modifier, (Object) this.$tooltipState, (Function2<? super PointerInputScope, ? super Continuation<? super Unit>, ? extends Object>) new TooltipKt$TooltipBox$scope$1$1$tooltipAnchor$1(tooltipKt$TooltipBox$scope$1$1$tooltipAnchor$onLongPress$1, (Continuation<? super TooltipKt$TooltipBox$scope$1$1$tooltipAnchor$1>) null)), true, new TooltipKt$TooltipBox$scope$1$1$tooltipAnchor$2(this.$longPressLabel, tooltipKt$TooltipBox$scope$1$1$tooltipAnchor$onLongPress$1));
    }
}
