package androidx.compose.ui.graphics.vector;

import androidx.compose.ui.graphics.PathFillType;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* compiled from: VectorCompose.kt */
final class VectorComposeKt$Path$2$3 extends Lambda implements Function2<PathComponent, PathFillType, Unit> {
    public static final VectorComposeKt$Path$2$3 INSTANCE = new VectorComposeKt$Path$2$3();

    VectorComposeKt$Path$2$3() {
        super(2);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        m3542invokepweu1eQ((PathComponent) obj, ((PathFillType) obj2).m3113unboximpl());
        return Unit.INSTANCE;
    }

    /* renamed from: invoke-pweu1eQ  reason: not valid java name */
    public final void m3542invokepweu1eQ(PathComponent pathComponent, int i) {
        Intrinsics.checkNotNullParameter(pathComponent, "$this$set");
        pathComponent.m3537setPathFillTypeoQ8Xj4U(i);
    }
}
