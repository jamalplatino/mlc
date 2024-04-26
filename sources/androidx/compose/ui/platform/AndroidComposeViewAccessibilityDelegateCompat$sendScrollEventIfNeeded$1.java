package androidx.compose.ui.platform;

import android.os.Build;
import android.view.accessibility.AccessibilityEvent;
import androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat;
import androidx.compose.ui.semantics.ScrollAxisRange;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* compiled from: AndroidComposeViewAccessibilityDelegateCompat.android.kt */
final class AndroidComposeViewAccessibilityDelegateCompat$sendScrollEventIfNeeded$1 extends Lambda implements Function0<Unit> {
    final /* synthetic */ ScrollObservationScope $scrollObservationScope;
    final /* synthetic */ AndroidComposeViewAccessibilityDelegateCompat this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    AndroidComposeViewAccessibilityDelegateCompat$sendScrollEventIfNeeded$1(ScrollObservationScope scrollObservationScope, AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat) {
        super(0);
        this.$scrollObservationScope = scrollObservationScope;
        this.this$0 = androidComposeViewAccessibilityDelegateCompat;
    }

    public final void invoke() {
        ScrollAxisRange horizontalScrollAxisRange = this.$scrollObservationScope.getHorizontalScrollAxisRange();
        ScrollAxisRange verticalScrollAxisRange = this.$scrollObservationScope.getVerticalScrollAxisRange();
        Float oldXValue = this.$scrollObservationScope.getOldXValue();
        Float oldYValue = this.$scrollObservationScope.getOldYValue();
        float floatValue = (horizontalScrollAxisRange == null || oldXValue == null) ? 0.0f : horizontalScrollAxisRange.getValue().invoke().floatValue() - oldXValue.floatValue();
        float floatValue2 = (verticalScrollAxisRange == null || oldYValue == null) ? 0.0f : verticalScrollAxisRange.getValue().invoke().floatValue() - oldYValue.floatValue();
        if (!(floatValue == 0.0f && floatValue2 == 0.0f)) {
            int access$semanticsNodeIdToAccessibilityVirtualNodeId = this.this$0.semanticsNodeIdToAccessibilityVirtualNodeId(this.$scrollObservationScope.getSemanticsNodeId());
            AndroidComposeViewAccessibilityDelegateCompat.sendEventForVirtualView$default(this.this$0, access$semanticsNodeIdToAccessibilityVirtualNodeId, 2048, 1, (List) null, 8, (Object) null);
            AccessibilityEvent createEvent$ui_release = this.this$0.createEvent$ui_release(access$semanticsNodeIdToAccessibilityVirtualNodeId, 4096);
            if (horizontalScrollAxisRange != null) {
                createEvent$ui_release.setScrollX((int) horizontalScrollAxisRange.getValue().invoke().floatValue());
                createEvent$ui_release.setMaxScrollX((int) horizontalScrollAxisRange.getMaxValue().invoke().floatValue());
            }
            if (verticalScrollAxisRange != null) {
                createEvent$ui_release.setScrollY((int) verticalScrollAxisRange.getValue().invoke().floatValue());
                createEvent$ui_release.setMaxScrollY((int) verticalScrollAxisRange.getMaxValue().invoke().floatValue());
            }
            if (Build.VERSION.SDK_INT >= 28) {
                AndroidComposeViewAccessibilityDelegateCompat.Api28Impl.setScrollEventDelta(createEvent$ui_release, (int) floatValue, (int) floatValue2);
            }
            boolean unused = this.this$0.sendEvent(createEvent$ui_release);
        }
        if (horizontalScrollAxisRange != null) {
            this.$scrollObservationScope.setOldXValue(horizontalScrollAxisRange.getValue().invoke());
        }
        if (verticalScrollAxisRange != null) {
            this.$scrollObservationScope.setOldYValue(verticalScrollAxisRange.getValue().invoke());
        }
    }
}
