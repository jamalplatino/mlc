package androidx.compose.material3;

import androidx.compose.ui.layout.LayoutModifier;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.OnRemeasuredModifier;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.platform.InspectorValueInfo;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DensityKt;
import androidx.compose.ui.unit.IntSize;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003Bg\u0012!\u0010\u0004\u001a\u001d\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\n0\u0005\u0012!\u0010\u000b\u001a\u001d\u0012\u0013\u0012\u00110\f¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\n0\u0005\u0012\u0017\u0010\u000e\u001a\u0013\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\n0\u0005¢\u0006\u0002\b\u0010ø\u0001\u0000¢\u0006\u0002\u0010\u0011J\u001d\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\fH\u0016ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018J\b\u0010\u0019\u001a\u00020\u001aH\u0016J)\u0010\u001b\u001a\u00020\u001c*\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!H\u0016ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\"\u0010#R\u000e\u0010\u0012\u001a\u00020\u0013X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0013X\u000e¢\u0006\u0002\n\u0000R)\u0010\u0004\u001a\u001d\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\n0\u0005X\u0004¢\u0006\u0002\n\u0000R,\u0010\u000b\u001a\u001d\u0012\u0013\u0012\u00110\f¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\n0\u0005X\u0004ø\u0001\u0000¢\u0006\u0002\n\u0000\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006$"}, d2 = {"Landroidx/compose/material3/SwipeAnchorsModifier;", "Landroidx/compose/ui/layout/LayoutModifier;", "Landroidx/compose/ui/layout/OnRemeasuredModifier;", "Landroidx/compose/ui/platform/InspectorValueInfo;", "onDensityChanged", "Lkotlin/Function1;", "Landroidx/compose/ui/unit/Density;", "Lkotlin/ParameterName;", "name", "density", "", "onSizeChanged", "Landroidx/compose/ui/unit/IntSize;", "layoutSize", "inspectorInfo", "Landroidx/compose/ui/platform/InspectorInfo;", "Lkotlin/ExtensionFunctionType;", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "lastDensity", "", "lastFontScale", "onRemeasured", "size", "onRemeasured-ozmzZPI", "(J)V", "toString", "", "measure", "Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/ui/layout/MeasureScope;", "measurable", "Landroidx/compose/ui/layout/Measurable;", "constraints", "Landroidx/compose/ui/unit/Constraints;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* compiled from: SwipeableV2.kt */
final class SwipeAnchorsModifier extends InspectorValueInfo implements LayoutModifier, OnRemeasuredModifier {
    private float lastDensity = -1.0f;
    private float lastFontScale = -1.0f;
    private final Function1<Density, Unit> onDensityChanged;
    private final Function1<IntSize, Unit> onSizeChanged;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SwipeAnchorsModifier(Function1<? super Density, Unit> function1, Function1<? super IntSize, Unit> function12, Function1<? super InspectorInfo, Unit> function13) {
        super(function13);
        Intrinsics.checkNotNullParameter(function1, "onDensityChanged");
        Intrinsics.checkNotNullParameter(function12, "onSizeChanged");
        Intrinsics.checkNotNullParameter(function13, "inspectorInfo");
        this.onDensityChanged = function1;
        this.onSizeChanged = function12;
    }

    /* renamed from: measure-3p2s80s  reason: not valid java name */
    public MeasureResult m1650measure3p2s80s(MeasureScope measureScope, Measurable measurable, long j) {
        Intrinsics.checkNotNullParameter(measureScope, "$this$measure");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        if (!(measureScope.getDensity() == this.lastDensity && measureScope.getFontScale() == this.lastFontScale)) {
            this.onDensityChanged.invoke(DensityKt.Density(measureScope.getDensity(), measureScope.getFontScale()));
            this.lastDensity = measureScope.getDensity();
            this.lastFontScale = measureScope.getFontScale();
        }
        Placeable r9 = measurable.m4520measureBRTryo0(j);
        return MeasureScope.layout$default(measureScope, r9.getWidth(), r9.getHeight(), (Map) null, new SwipeAnchorsModifier$measure$1(r9), 4, (Object) null);
    }

    /* renamed from: onRemeasured-ozmzZPI  reason: not valid java name */
    public void m1651onRemeasuredozmzZPI(long j) {
        this.onSizeChanged.invoke(IntSize.m5778boximpl(j));
    }

    public String toString() {
        return "SwipeAnchorsModifierImpl(updateDensity=" + this.onDensityChanged + ", onSizeChanged=" + this.onSizeChanged + ')';
    }
}
