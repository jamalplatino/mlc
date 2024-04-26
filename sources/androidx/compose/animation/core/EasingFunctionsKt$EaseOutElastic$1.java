package androidx.compose.animation.core;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0007\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", "", "fraction"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* compiled from: EasingFunctions.kt */
final class EasingFunctionsKt$EaseOutElastic$1 implements Easing {
    public static final EasingFunctionsKt$EaseOutElastic$1 INSTANCE = new EasingFunctionsKt$EaseOutElastic$1();

    EasingFunctionsKt$EaseOutElastic$1() {
    }

    public final float transform(float f) {
        if (f == 0.0f) {
            return 0.0f;
        }
        if (f == 1.0f) {
            return 1.0f;
        }
        return (float) ((((double) ((float) Math.pow((double) 2.0f, (double) (-10.0f * f)))) * Math.sin(((double) ((f * 10.0f) - 0.75f)) * 2.0943951023931953d)) + ((double) 1.0f));
    }
}
