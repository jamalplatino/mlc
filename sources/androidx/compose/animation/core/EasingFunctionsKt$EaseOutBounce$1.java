package androidx.compose.animation.core;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0007\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", "", "fraction"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* compiled from: EasingFunctions.kt */
final class EasingFunctionsKt$EaseOutBounce$1 implements Easing {
    public static final EasingFunctionsKt$EaseOutBounce$1 INSTANCE = new EasingFunctionsKt$EaseOutBounce$1();

    EasingFunctionsKt$EaseOutBounce$1() {
    }

    public final float transform(float f) {
        float f2;
        float f3;
        if (f < 0.36363637f) {
            return 7.5625f * f * f;
        }
        if (f < 0.72727275f) {
            float f4 = f - 0.54545456f;
            f2 = 7.5625f * f4 * f4;
            f3 = 0.75f;
        } else if (f < 0.90909094f) {
            float f5 = f - 0.8181818f;
            f2 = 7.5625f * f5 * f5;
            f3 = 0.9375f;
        } else {
            float f6 = f - 0.95454544f;
            f2 = 7.5625f * f6 * f6;
            f3 = 0.984375f;
        }
        return f2 + f3;
    }
}
