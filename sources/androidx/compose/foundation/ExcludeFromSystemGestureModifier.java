package androidx.compose.foundation;

import android.view.View;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.layout.OnGloballyPositionedModifier;
import java.util.List;
import kotlin.Metadata;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005¢\u0006\u0002\u0010\bJ\u0018\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0007H\u0002J\u0010\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u0006H\u0002J\u0010\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0006H\u0016J\u0006\u0010\u0019\u001a\u00020\u0017J\u0010\u0010\u001a\u001a\u00020\u00172\b\u0010\u001b\u001a\u0004\u0018\u00010\fR\u001f\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001c"}, d2 = {"Landroidx/compose/foundation/ExcludeFromSystemGestureModifier;", "Landroidx/compose/ui/layout/OnGloballyPositionedModifier;", "view", "Landroid/view/View;", "exclusion", "Lkotlin/Function1;", "Landroidx/compose/ui/layout/LayoutCoordinates;", "Landroidx/compose/ui/geometry/Rect;", "(Landroid/view/View;Lkotlin/jvm/functions/Function1;)V", "getExclusion", "()Lkotlin/jvm/functions/Function1;", "rect", "Landroid/graphics/Rect;", "getRect", "()Landroid/graphics/Rect;", "setRect", "(Landroid/graphics/Rect;)V", "getView", "()Landroid/view/View;", "calcBounds", "layoutCoordinates", "findRoot", "onGloballyPositioned", "", "coordinates", "removeRect", "replaceRect", "newRect", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* compiled from: SystemGestureExclusion.kt */
final class ExcludeFromSystemGestureModifier implements OnGloballyPositionedModifier {
    private final Function1<LayoutCoordinates, Rect> exclusion;
    private android.graphics.Rect rect;
    private final View view;

    public final Function1<LayoutCoordinates, Rect> getExclusion() {
        return this.exclusion;
    }

    public final android.graphics.Rect getRect() {
        return this.rect;
    }

    public final View getView() {
        return this.view;
    }

    public final void setRect(android.graphics.Rect rect2) {
        this.rect = rect2;
    }

    public ExcludeFromSystemGestureModifier(View view2, Function1<? super LayoutCoordinates, Rect> function1) {
        Intrinsics.checkNotNullParameter(view2, "view");
        this.view = view2;
        this.exclusion = function1;
    }

    public void onGloballyPositioned(LayoutCoordinates layoutCoordinates) {
        android.graphics.Rect rect2;
        Intrinsics.checkNotNullParameter(layoutCoordinates, "coordinates");
        Function1<LayoutCoordinates, Rect> function1 = this.exclusion;
        if (function1 == null) {
            Rect boundsInRoot = LayoutCoordinatesKt.boundsInRoot(layoutCoordinates);
            rect2 = new android.graphics.Rect(MathKt.roundToInt(boundsInRoot.getLeft()), MathKt.roundToInt(boundsInRoot.getTop()), MathKt.roundToInt(boundsInRoot.getRight()), MathKt.roundToInt(boundsInRoot.getBottom()));
        } else {
            rect2 = calcBounds(layoutCoordinates, function1.invoke(layoutCoordinates));
        }
        replaceRect(rect2);
    }

    public final void removeRect() {
        replaceRect((android.graphics.Rect) null);
    }

    private final android.graphics.Rect calcBounds(LayoutCoordinates layoutCoordinates, Rect rect2) {
        LayoutCoordinates layoutCoordinates2 = layoutCoordinates;
        LayoutCoordinates findRoot = findRoot(layoutCoordinates);
        long r2 = findRoot.m4497localPositionOfR5De75A(layoutCoordinates2, rect2.m2607getTopLeftF1C5BW0());
        long r4 = findRoot.m4497localPositionOfR5De75A(layoutCoordinates2, rect2.m2608getTopRightF1C5BW0());
        long r6 = findRoot.m4497localPositionOfR5De75A(layoutCoordinates2, rect2.m2600getBottomLeftF1C5BW0());
        long r0 = findRoot.m4497localPositionOfR5De75A(layoutCoordinates2, rect2.m2601getBottomRightF1C5BW0());
        return new android.graphics.Rect(MathKt.roundToInt(ComparisonsKt.minOf(Offset.m2572getXimpl(r2), Offset.m2572getXimpl(r4), Offset.m2572getXimpl(r6), Offset.m2572getXimpl(r0))), MathKt.roundToInt(ComparisonsKt.minOf(Offset.m2573getYimpl(r2), Offset.m2573getYimpl(r4), Offset.m2573getYimpl(r6), Offset.m2573getYimpl(r0))), MathKt.roundToInt(ComparisonsKt.maxOf(Offset.m2572getXimpl(r2), Offset.m2572getXimpl(r4), Offset.m2572getXimpl(r6), Offset.m2572getXimpl(r0))), MathKt.roundToInt(ComparisonsKt.maxOf(Offset.m2573getYimpl(r2), Offset.m2573getYimpl(r4), Offset.m2573getYimpl(r6), Offset.m2573getYimpl(r0))));
    }

    private final LayoutCoordinates findRoot(LayoutCoordinates layoutCoordinates) {
        LayoutCoordinates parentLayoutCoordinates = layoutCoordinates.getParentLayoutCoordinates();
        while (true) {
            LayoutCoordinates layoutCoordinates2 = parentLayoutCoordinates;
            LayoutCoordinates layoutCoordinates3 = layoutCoordinates;
            layoutCoordinates = layoutCoordinates2;
            if (layoutCoordinates == null) {
                return layoutCoordinates3;
            }
            parentLayoutCoordinates = layoutCoordinates.getParentLayoutCoordinates();
        }
    }

    public final void replaceRect(android.graphics.Rect rect2) {
        MutableVector mutableVector = new MutableVector(new android.graphics.Rect[16], 0);
        List<android.graphics.Rect> systemGestureExclusionRects = this.view.getSystemGestureExclusionRects();
        Intrinsics.checkNotNullExpressionValue(systemGestureExclusionRects, "view.systemGestureExclusionRects");
        mutableVector.addAll(mutableVector.getSize(), systemGestureExclusionRects);
        android.graphics.Rect rect3 = this.rect;
        if (rect3 != null) {
            mutableVector.remove(rect3);
        }
        if (rect2 != null && !rect2.isEmpty()) {
            mutableVector.add(rect2);
        }
        this.view.setSystemGestureExclusionRects(mutableVector.asMutableList());
        this.rect = rect2;
    }
}
