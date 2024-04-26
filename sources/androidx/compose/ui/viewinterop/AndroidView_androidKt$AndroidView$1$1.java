package androidx.compose.ui.viewinterop;

import androidx.compose.ui.node.LayoutNode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* compiled from: AndroidView.android.kt */
final class AndroidView_androidKt$AndroidView$1$1 extends Lambda implements Function2<LayoutNode, Function1<? super T, ? extends Unit>, Unit> {
    public static final AndroidView_androidKt$AndroidView$1$1 INSTANCE = new AndroidView_androidKt$AndroidView$1$1();

    AndroidView_androidKt$AndroidView$1$1() {
        super(2);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((LayoutNode) obj, (Function1) obj2);
        return Unit.INSTANCE;
    }

    public final void invoke(LayoutNode layoutNode, Function1<? super T, Unit> function1) {
        Intrinsics.checkNotNullParameter(layoutNode, "$this$set");
        Intrinsics.checkNotNullParameter(function1, "it");
        AndroidView_androidKt.requireViewFactoryHolder(layoutNode).setUpdateBlock(function1);
    }
}
