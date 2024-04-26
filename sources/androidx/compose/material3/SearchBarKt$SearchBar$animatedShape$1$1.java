package androidx.compose.material3;

import androidx.compose.runtime.State;
import androidx.compose.ui.geometry.CornerRadiusKt;
import androidx.compose.ui.geometry.RoundRectKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* compiled from: SearchBar.kt */
final class SearchBarKt$SearchBar$animatedShape$1$1 extends Lambda implements Function3<Path, Size, LayoutDirection, Unit> {
    final /* synthetic */ State<Float> $animationProgress;
    final /* synthetic */ Density $density;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SearchBarKt$SearchBar$animatedShape$1$1(Density density, State<Float> state) {
        super(3);
        this.$density = density;
        this.$animationProgress = state;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        m1531invoke12SF9DM((Path) obj, ((Size) obj2).m2646unboximpl(), (LayoutDirection) obj3);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke-12SF9DM  reason: not valid java name */
    public final void m1531invoke12SF9DM(Path path, long j, LayoutDirection layoutDirection) {
        Intrinsics.checkNotNullParameter(path, "$this$$receiver");
        Intrinsics.checkNotNullParameter(layoutDirection, "<anonymous parameter 1>");
        path.addRoundRect(RoundRectKt.m2627RoundRectsniSvfs(SizeKt.m2662toRectuvyYCjk(j), CornerRadiusKt.CornerRadius$default(this.$density.m5607toPx0680j_4(Dp.m5626constructorimpl(SearchBarKt.SearchBarCornerRadius * (((float) 1) - this.$animationProgress.getValue().floatValue()))), 0.0f, 2, (Object) null)));
    }
}
