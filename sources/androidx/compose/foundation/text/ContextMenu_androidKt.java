package androidx.compose.foundation.text;

import androidx.compose.foundation.text.selection.SelectionManager;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a(\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0011\u0010\u0004\u001a\r\u0012\u0004\u0012\u00020\u00010\u0005¢\u0006\u0002\b\u0006H\u0001¢\u0006\u0002\u0010\u0007\u001a(\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\b2\u0011\u0010\u0004\u001a\r\u0012\u0004\u0012\u00020\u00010\u0005¢\u0006\u0002\b\u0006H\u0001¢\u0006\u0002\u0010\t¨\u0006\n"}, d2 = {"ContextMenuArea", "", "manager", "Landroidx/compose/foundation/text/selection/SelectionManager;", "content", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "(Landroidx/compose/foundation/text/selection/SelectionManager;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;", "(Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: ContextMenu.android.kt */
public final class ContextMenu_androidKt {
    public static final void ContextMenuArea(TextFieldSelectionManager textFieldSelectionManager, Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, int i) {
        int i2;
        Intrinsics.checkNotNullParameter(textFieldSelectionManager, "manager");
        Intrinsics.checkNotNullParameter(function2, "content");
        Composer startRestartGroup = composer.startRestartGroup(-1985516685);
        ComposerKt.sourceInformation(startRestartGroup, "C(ContextMenuArea)P(1)27@979L9:ContextMenu.android.kt#423gt5");
        if ((i & 112) == 0) {
            i2 = (startRestartGroup.changedInstance(function2) ? 32 : 16) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 81) != 16 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1985516685, i2, -1, "androidx.compose.foundation.text.ContextMenuArea (ContextMenu.android.kt:23)");
            }
            function2.invoke(startRestartGroup, Integer.valueOf((i2 >> 3) & 14));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new ContextMenu_androidKt$ContextMenuArea$1(textFieldSelectionManager, function2, i));
        }
    }

    public static final void ContextMenuArea(SelectionManager selectionManager, Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, int i) {
        int i2;
        Intrinsics.checkNotNullParameter(selectionManager, "manager");
        Intrinsics.checkNotNullParameter(function2, "content");
        Composer startRestartGroup = composer.startRestartGroup(605522716);
        ComposerKt.sourceInformation(startRestartGroup, "C(ContextMenuArea)P(1)35@1116L9:ContextMenu.android.kt#423gt5");
        if ((i & 112) == 0) {
            i2 = (startRestartGroup.changedInstance(function2) ? 32 : 16) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 81) != 16 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(605522716, i2, -1, "androidx.compose.foundation.text.ContextMenuArea (ContextMenu.android.kt:31)");
            }
            function2.invoke(startRestartGroup, Integer.valueOf((i2 >> 3) & 14));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new ContextMenu_androidKt$ContextMenuArea$2(selectionManager, function2, i));
        }
    }
}
