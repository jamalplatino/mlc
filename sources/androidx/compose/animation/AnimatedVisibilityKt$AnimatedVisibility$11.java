package androidx.compose.animation;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* compiled from: AnimatedVisibility.kt */
final class AnimatedVisibilityKt$AnimatedVisibility$11 extends Lambda implements Function1<Boolean, Boolean> {
    public static final AnimatedVisibilityKt$AnimatedVisibility$11 INSTANCE = new AnimatedVisibilityKt$AnimatedVisibility$11();

    AnimatedVisibilityKt$AnimatedVisibility$11() {
        super(1);
    }

    public final Boolean invoke(boolean z) {
        return Boolean.valueOf(z);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return invoke(((Boolean) obj).booleanValue());
    }
}
