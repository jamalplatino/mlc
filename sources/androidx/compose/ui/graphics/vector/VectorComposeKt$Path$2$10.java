package androidx.compose.ui.graphics.vector;

import androidx.compose.ui.graphics.StrokeCap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* compiled from: VectorCompose.kt */
final class VectorComposeKt$Path$2$10 extends Lambda implements Function2<PathComponent, StrokeCap, Unit> {
    public static final VectorComposeKt$Path$2$10 INSTANCE = new VectorComposeKt$Path$2$10();

    VectorComposeKt$Path$2$10() {
        super(2);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        m3541invokeCSYIeUk((PathComponent) obj, ((StrokeCap) obj2).m3203unboximpl());
        return Unit.INSTANCE;
    }

    /* renamed from: invoke-CSYIeUk  reason: not valid java name */
    public final void m3541invokeCSYIeUk(PathComponent pathComponent, int i) {
        Intrinsics.checkNotNullParameter(pathComponent, "$this$set");
        pathComponent.m3538setStrokeLineCapBeK7IIE(i);
    }
}
