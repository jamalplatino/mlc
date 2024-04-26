package androidx.compose.material3;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.window.AndroidPopup_androidKt;
import androidx.compose.ui.window.PopupPositionProvider;
import androidx.compose.ui.window.PopupProperties;
import androidx.compose.ui.window.SecureFlagPolicy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a6\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\u0011\u0010\u0006\u001a\r\u0012\u0004\u0012\u00020\u00010\u0005¢\u0006\u0002\b\u0007H\u0001¢\u0006\u0002\u0010\b¨\u0006\t"}, d2 = {"TooltipPopup", "", "popupPositionProvider", "Landroidx/compose/ui/window/PopupPositionProvider;", "onDismissRequest", "Lkotlin/Function0;", "content", "Landroidx/compose/runtime/Composable;", "(Landroidx/compose/ui/window/PopupPositionProvider;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: TooltipPopup.android.kt */
public final class TooltipPopup_androidKt {
    public static final void TooltipPopup(PopupPositionProvider popupPositionProvider, Function0<Unit> function0, Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, int i) {
        int i2;
        PopupPositionProvider popupPositionProvider2 = popupPositionProvider;
        Function0<Unit> function02 = function0;
        Function2<? super Composer, ? super Integer, Unit> function22 = function2;
        int i3 = i;
        Intrinsics.checkNotNullParameter(popupPositionProvider2, "popupPositionProvider");
        Intrinsics.checkNotNullParameter(function02, "onDismissRequest");
        Intrinsics.checkNotNullParameter(function22, "content");
        Composer startRestartGroup = composer.startRestartGroup(-1507102480);
        ComposerKt.sourceInformation(startRestartGroup, "C(TooltipPopup)P(2,1)29@1039L174:TooltipPopup.android.kt#uh7d8r");
        if ((i3 & 14) == 0) {
            i2 = (startRestartGroup.changed((Object) popupPositionProvider2) ? 4 : 2) | i3;
        } else {
            i2 = i3;
        }
        if ((i3 & 112) == 0) {
            i2 |= startRestartGroup.changedInstance(function02) ? 32 : 16;
        }
        if ((i3 & 896) == 0) {
            i2 |= startRestartGroup.changedInstance(function22) ? 256 : 128;
        }
        if ((i2 & 731) != 146 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1507102480, i2, -1, "androidx.compose.material3.TooltipPopup (TooltipPopup.android.kt:25)");
            }
            AndroidPopup_androidKt.Popup(popupPositionProvider, function0, new PopupProperties(true, false, false, (SecureFlagPolicy) null, false, false, 62, (DefaultConstructorMarker) null), function2, startRestartGroup, (i2 & 14) | 384 | (i2 & 112) | ((i2 << 3) & 7168), 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new TooltipPopup_androidKt$TooltipPopup$1(popupPositionProvider2, function02, function22, i3));
        }
    }
}
