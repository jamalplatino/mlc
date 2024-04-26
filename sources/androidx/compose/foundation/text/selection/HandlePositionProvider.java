package androidx.compose.foundation.text.selection;

import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.IntRect;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.window.PopupPositionProvider;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0018\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005ø\u0001\u0000¢\u0006\u0002\u0010\u0006J5\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\fH\u0016ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u0019\u0010\u0004\u001a\u00020\u0005X\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\n\u0002\u0010\u0007\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0012"}, d2 = {"Landroidx/compose/foundation/text/selection/HandlePositionProvider;", "Landroidx/compose/ui/window/PopupPositionProvider;", "handleReferencePoint", "Landroidx/compose/foundation/text/selection/HandleReferencePoint;", "offset", "Landroidx/compose/ui/unit/IntOffset;", "(Landroidx/compose/foundation/text/selection/HandleReferencePoint;JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "J", "calculatePosition", "anchorBounds", "Landroidx/compose/ui/unit/IntRect;", "windowSize", "Landroidx/compose/ui/unit/IntSize;", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "popupContentSize", "calculatePosition-llwVHH4", "(Landroidx/compose/ui/unit/IntRect;JLandroidx/compose/ui/unit/LayoutDirection;J)J", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* compiled from: AndroidSelectionHandles.android.kt */
public final class HandlePositionProvider implements PopupPositionProvider {
    private final HandleReferencePoint handleReferencePoint;
    private final long offset;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* compiled from: AndroidSelectionHandles.android.kt */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|2|3|4|5|6|7|9) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        static {
            /*
                androidx.compose.foundation.text.selection.HandleReferencePoint[] r0 = androidx.compose.foundation.text.selection.HandleReferencePoint.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                androidx.compose.foundation.text.selection.HandleReferencePoint r1 = androidx.compose.foundation.text.selection.HandleReferencePoint.TopLeft     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                androidx.compose.foundation.text.selection.HandleReferencePoint r1 = androidx.compose.foundation.text.selection.HandleReferencePoint.TopRight     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                androidx.compose.foundation.text.selection.HandleReferencePoint r1 = androidx.compose.foundation.text.selection.HandleReferencePoint.TopMiddle     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                $EnumSwitchMapping$0 = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.selection.HandlePositionProvider.WhenMappings.<clinit>():void");
        }
    }

    public /* synthetic */ HandlePositionProvider(HandleReferencePoint handleReferencePoint2, long j, DefaultConstructorMarker defaultConstructorMarker) {
        this(handleReferencePoint2, j);
    }

    private HandlePositionProvider(HandleReferencePoint handleReferencePoint2, long j) {
        this.handleReferencePoint = handleReferencePoint2;
        this.offset = j;
    }

    /* renamed from: calculatePosition-llwVHH4  reason: not valid java name */
    public long m979calculatePositionllwVHH4(IntRect intRect, long j, LayoutDirection layoutDirection, long j2) {
        Intrinsics.checkNotNullParameter(intRect, "anchorBounds");
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        int i = WhenMappings.$EnumSwitchMapping$0[this.handleReferencePoint.ordinal()];
        if (i == 1) {
            return IntOffsetKt.IntOffset(intRect.getLeft() + IntOffset.m5744getXimpl(this.offset), intRect.getTop() + IntOffset.m5745getYimpl(this.offset));
        }
        if (i == 2) {
            return IntOffsetKt.IntOffset((intRect.getLeft() + IntOffset.m5744getXimpl(this.offset)) - IntSize.m5786getWidthimpl(j2), intRect.getTop() + IntOffset.m5745getYimpl(this.offset));
        }
        if (i == 3) {
            return IntOffsetKt.IntOffset((intRect.getLeft() + IntOffset.m5744getXimpl(this.offset)) - (IntSize.m5786getWidthimpl(j2) / 2), intRect.getTop() + IntOffset.m5745getYimpl(this.offset));
        }
        throw new NoWhenBranchMatchedException();
    }
}
