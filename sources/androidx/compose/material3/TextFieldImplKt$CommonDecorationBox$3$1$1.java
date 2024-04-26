package androidx.compose.material3;

import androidx.compose.runtime.MutableState;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* compiled from: TextFieldImpl.kt */
final class TextFieldImplKt$CommonDecorationBox$3$1$1 extends Lambda implements Function1<Size, Unit> {
    final /* synthetic */ float $labelProgress;
    final /* synthetic */ MutableState<Size> $labelSize;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    TextFieldImplKt$CommonDecorationBox$3$1$1(float f, MutableState<Size> mutableState) {
        super(1);
        this.$labelProgress = f;
        this.$labelSize = mutableState;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        m1718invokeuvyYCjk(((Size) obj).m2646unboximpl());
        return Unit.INSTANCE;
    }

    /* renamed from: invoke-uvyYCjk  reason: not valid java name */
    public final void m1718invokeuvyYCjk(long j) {
        float r0 = Size.m2641getWidthimpl(j) * this.$labelProgress;
        float r4 = Size.m2638getHeightimpl(j) * this.$labelProgress;
        if (Size.m2641getWidthimpl(this.$labelSize.getValue().m2646unboximpl()) != r0 || Size.m2638getHeightimpl(this.$labelSize.getValue().m2646unboximpl()) != r4) {
            this.$labelSize.setValue(Size.m2629boximpl(SizeKt.Size(r0, r4)));
        }
    }
}
