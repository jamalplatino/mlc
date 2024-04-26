package androidx.compose.material3;

import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* compiled from: IconButton.kt */
final class IconButtonKt$OutlinedIconToggleButton$2 extends Lambda implements Function1<SemanticsPropertyReceiver, Unit> {
    public static final IconButtonKt$OutlinedIconToggleButton$2 INSTANCE = new IconButtonKt$OutlinedIconToggleButton$2();

    IconButtonKt$OutlinedIconToggleButton$2() {
        super(1);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((SemanticsPropertyReceiver) obj);
        return Unit.INSTANCE;
    }

    public final void invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        Intrinsics.checkNotNullParameter(semanticsPropertyReceiver, "$this$semantics");
        SemanticsPropertiesKt.m4984setRolekuIjeqM(semanticsPropertyReceiver, Role.Companion.m4971getCheckboxo7Vup1c());
    }
}
