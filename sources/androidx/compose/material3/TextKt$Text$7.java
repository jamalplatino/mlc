package androidx.compose.material3;

import androidx.compose.ui.text.TextLayoutResult;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* compiled from: Text.kt */
final class TextKt$Text$7 extends Lambda implements Function1<TextLayoutResult, Unit> {
    public static final TextKt$Text$7 INSTANCE = new TextKt$Text$7();

    TextKt$Text$7() {
        super(1);
    }

    public final void invoke(TextLayoutResult textLayoutResult) {
        Intrinsics.checkNotNullParameter(textLayoutResult, "it");
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((TextLayoutResult) obj);
        return Unit.INSTANCE;
    }
}
