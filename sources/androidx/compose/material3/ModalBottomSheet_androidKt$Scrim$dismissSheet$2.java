package androidx.compose.material3;

import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* compiled from: ModalBottomSheet.android.kt */
final class ModalBottomSheet_androidKt$Scrim$dismissSheet$2 extends Lambda implements Function1<SemanticsPropertyReceiver, Unit> {
    public static final ModalBottomSheet_androidKt$Scrim$dismissSheet$2 INSTANCE = new ModalBottomSheet_androidKt$Scrim$dismissSheet$2();

    ModalBottomSheet_androidKt$Scrim$dismissSheet$2() {
        super(1);
    }

    public final void invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        Intrinsics.checkNotNullParameter(semanticsPropertyReceiver, "$this$clearAndSetSemantics");
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((SemanticsPropertyReceiver) obj);
        return Unit.INSTANCE;
    }
}
