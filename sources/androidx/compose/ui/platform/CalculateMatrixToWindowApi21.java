package androidx.compose.ui.platform;

import android.view.View;
import android.view.ViewParent;
import androidx.compose.ui.graphics.AndroidMatrixConversions_androidKt;
import androidx.compose.ui.graphics.Matrix;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J%\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0006H\u0016ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ%\u0010\u000f\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0006H\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u000eJ!\u0010\u0011\u001a\u00020\t*\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0013H\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015J)\u0010\u0016\u001a\u00020\t*\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0018H\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u0019\u0010\u0005\u001a\u00020\u0006X\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\n\u0002\u0010\u0007\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001c"}, d2 = {"Landroidx/compose/ui/platform/CalculateMatrixToWindowApi21;", "Landroidx/compose/ui/platform/CalculateMatrixToWindow;", "()V", "tmpLocation", "", "tmpMatrix", "Landroidx/compose/ui/graphics/Matrix;", "[F", "calculateMatrixToWindow", "", "view", "Landroid/view/View;", "matrix", "calculateMatrixToWindow-EL8BTi8", "(Landroid/view/View;[F)V", "transformMatrixToWindow", "transformMatrixToWindow-EL8BTi8", "preConcat", "other", "Landroid/graphics/Matrix;", "preConcat-tU-YjHk", "([FLandroid/graphics/Matrix;)V", "preTranslate", "x", "", "y", "preTranslate-3XD1CNM", "([FFF)V", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* compiled from: AndroidComposeView.android.kt */
final class CalculateMatrixToWindowApi21 implements CalculateMatrixToWindow {
    private final int[] tmpLocation = new int[2];
    private final float[] tmpMatrix = Matrix.m3048constructorimpl$default((float[]) null, 1, (DefaultConstructorMarker) null);

    /* renamed from: calculateMatrixToWindow-EL8BTi8  reason: not valid java name */
    public void m4873calculateMatrixToWindowEL8BTi8(View view, float[] fArr) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(fArr, "matrix");
        Matrix.m3057resetimpl(fArr);
        m4872transformMatrixToWindowEL8BTi8(view, fArr);
    }

    /* renamed from: transformMatrixToWindow-EL8BTi8  reason: not valid java name */
    private final void m4872transformMatrixToWindowEL8BTi8(View view, float[] fArr) {
        ViewParent parent = view.getParent();
        if (parent instanceof View) {
            m4872transformMatrixToWindowEL8BTi8((View) parent, fArr);
            m4871preTranslate3XD1CNM(fArr, -((float) view.getScrollX()), -((float) view.getScrollY()));
            m4871preTranslate3XD1CNM(fArr, (float) view.getLeft(), (float) view.getTop());
        } else {
            int[] iArr = this.tmpLocation;
            view.getLocationInWindow(iArr);
            m4871preTranslate3XD1CNM(fArr, -((float) view.getScrollX()), -((float) view.getScrollY()));
            m4871preTranslate3XD1CNM(fArr, (float) iArr[0], (float) iArr[1]);
        }
        android.graphics.Matrix matrix = view.getMatrix();
        if (!matrix.isIdentity()) {
            Intrinsics.checkNotNullExpressionValue(matrix, "viewMatrix");
            m4870preConcattUYjHk(fArr, matrix);
        }
    }

    /* renamed from: preConcat-tU-YjHk  reason: not valid java name */
    private final void m4870preConcattUYjHk(float[] fArr, android.graphics.Matrix matrix) {
        AndroidMatrixConversions_androidKt.m2684setFromtUYjHk(this.tmpMatrix, matrix);
        AndroidComposeView_androidKt.m4868preTransformJiSxe2E(fArr, this.tmpMatrix);
    }

    /* renamed from: preTranslate-3XD1CNM  reason: not valid java name */
    private final void m4871preTranslate3XD1CNM(float[] fArr, float f, float f2) {
        Matrix.m3057resetimpl(this.tmpMatrix);
        Matrix.m3068translateimpl$default(this.tmpMatrix, f, f2, 0.0f, 4, (Object) null);
        AndroidComposeView_androidKt.m4868preTransformJiSxe2E(fArr, this.tmpMatrix);
    }
}
