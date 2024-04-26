package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.text.StringHelpers_androidKt;
import androidx.compose.ui.text.TextRangeKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a8\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0000ø\u0001\u0000¢\u0006\u0002\u0010\n\u0002\u0004\n\u0002\b\u0019¨\u0006\u000b"}, d2 = {"ensureAtLeastOneChar", "Landroidx/compose/ui/text/TextRange;", "text", "", "offset", "", "lastOffset", "isStartHandle", "", "previousHandlesCrossed", "(Ljava/lang/String;IIZZ)J", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: SelectionAdjustment.kt */
public final class SelectionAdjustmentKt {
    public static final long ensureAtLeastOneChar(String str, int i, int i2, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(str, "text");
        if (i2 == 0) {
            return TextRangeKt.TextRange(i, i);
        }
        if (i == 0) {
            if (z) {
                return TextRangeKt.TextRange(StringHelpers_androidKt.findFollowingBreak(str, 0), 0);
            }
            return TextRangeKt.TextRange(0, StringHelpers_androidKt.findFollowingBreak(str, 0));
        } else if (i == i2) {
            if (z) {
                return TextRangeKt.TextRange(StringHelpers_androidKt.findPrecedingBreak(str, i2), i2);
            }
            return TextRangeKt.TextRange(i2, StringHelpers_androidKt.findPrecedingBreak(str, i2));
        } else if (z) {
            if (!z2) {
                return TextRangeKt.TextRange(StringHelpers_androidKt.findPrecedingBreak(str, i), i);
            }
            return TextRangeKt.TextRange(StringHelpers_androidKt.findFollowingBreak(str, i), i);
        } else if (!z2) {
            return TextRangeKt.TextRange(i, StringHelpers_androidKt.findFollowingBreak(str, i));
        } else {
            return TextRangeKt.TextRange(i, StringHelpers_androidKt.findPrecedingBreak(str, i));
        }
    }
}
