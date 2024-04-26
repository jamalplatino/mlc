package androidx.compose.foundation.layout;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotMutationPolicy;
import androidx.compose.ui.layout.LayoutModifier;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.modifier.ModifierLocalConsumer;
import androidx.compose.ui.modifier.ModifierLocalReadScope;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.platform.InspectorValueInfo;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003BE\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0017\u0010\u0006\u001a\u0013\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\u0002\b\n\u0012\u001d\u0010\u000b\u001a\u0019\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f¢\u0006\u0002\b\n¢\u0006\u0002\u0010\u000fJ\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0002J\b\u0010\u001c\u001a\u00020\u000eH\u0016J\u0010\u0010\u001d\u001a\u00020\t2\u0006\u0010\u001e\u001a\u00020\u001fH\u0016J)\u0010 \u001a\u00020!*\u00020\"2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b'\u0010(R%\u0010\u000b\u001a\u0019\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f¢\u0006\u0002\b\nX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R+\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u00058B@BX\u0002¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006)"}, d2 = {"Landroidx/compose/foundation/layout/DerivedHeightModifier;", "Landroidx/compose/ui/layout/LayoutModifier;", "Landroidx/compose/ui/modifier/ModifierLocalConsumer;", "Landroidx/compose/ui/platform/InspectorValueInfo;", "insets", "Landroidx/compose/foundation/layout/WindowInsets;", "inspectorInfo", "Lkotlin/Function1;", "Landroidx/compose/ui/platform/InspectorInfo;", "", "Lkotlin/ExtensionFunctionType;", "heightCalc", "Lkotlin/Function2;", "Landroidx/compose/ui/unit/Density;", "", "(Landroidx/compose/foundation/layout/WindowInsets;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;)V", "<set-?>", "unconsumedInsets", "getUnconsumedInsets", "()Landroidx/compose/foundation/layout/WindowInsets;", "setUnconsumedInsets", "(Landroidx/compose/foundation/layout/WindowInsets;)V", "unconsumedInsets$delegate", "Landroidx/compose/runtime/MutableState;", "equals", "", "other", "", "hashCode", "onModifierLocalsUpdated", "scope", "Landroidx/compose/ui/modifier/ModifierLocalReadScope;", "measure", "Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/ui/layout/MeasureScope;", "measurable", "Landroidx/compose/ui/layout/Measurable;", "constraints", "Landroidx/compose/ui/unit/Constraints;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* compiled from: WindowInsetsSize.kt */
final class DerivedHeightModifier extends InspectorValueInfo implements LayoutModifier, ModifierLocalConsumer {
    private final Function2<WindowInsets, Density, Integer> heightCalc;
    private final WindowInsets insets;
    private final MutableState unconsumedInsets$delegate;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DerivedHeightModifier(WindowInsets windowInsets, Function1<? super InspectorInfo, Unit> function1, Function2<? super WindowInsets, ? super Density, Integer> function2) {
        super(function1);
        Intrinsics.checkNotNullParameter(windowInsets, "insets");
        Intrinsics.checkNotNullParameter(function1, "inspectorInfo");
        Intrinsics.checkNotNullParameter(function2, "heightCalc");
        this.insets = windowInsets;
        this.heightCalc = function2;
        this.unconsumedInsets$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(windowInsets, (SnapshotMutationPolicy) null, 2, (Object) null);
    }

    private final WindowInsets getUnconsumedInsets() {
        return (WindowInsets) this.unconsumedInsets$delegate.getValue();
    }

    /* renamed from: measure-3p2s80s  reason: not valid java name */
    public MeasureResult m460measure3p2s80s(MeasureScope measureScope, Measurable measurable, long j) {
        Intrinsics.checkNotNullParameter(measureScope, "$this$measure");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        int intValue = this.heightCalc.invoke(getUnconsumedInsets(), measureScope).intValue();
        if (intValue == 0) {
            return MeasureScope.layout$default(measureScope, 0, 0, (Map) null, DerivedHeightModifier$measure$1.INSTANCE, 4, (Object) null);
        }
        Placeable r11 = measurable.m4520measureBRTryo0(Constraints.m5561copyZbe2FdA$default(j, 0, 0, intValue, intValue, 3, (Object) null));
        return MeasureScope.layout$default(measureScope, r11.getWidth(), intValue, (Map) null, new DerivedHeightModifier$measure$2(r11), 4, (Object) null);
    }

    public void onModifierLocalsUpdated(ModifierLocalReadScope modifierLocalReadScope) {
        Intrinsics.checkNotNullParameter(modifierLocalReadScope, "scope");
        setUnconsumedInsets(WindowInsetsKt.exclude(this.insets, (WindowInsets) modifierLocalReadScope.getCurrent(WindowInsetsPaddingKt.getModifierLocalConsumedWindowInsets())));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DerivedHeightModifier)) {
            return false;
        }
        DerivedHeightModifier derivedHeightModifier = (DerivedHeightModifier) obj;
        if (!Intrinsics.areEqual((Object) this.insets, (Object) derivedHeightModifier.insets) || !Intrinsics.areEqual((Object) this.heightCalc, (Object) derivedHeightModifier.heightCalc)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (this.insets.hashCode() * 31) + this.heightCalc.hashCode();
    }

    private final void setUnconsumedInsets(WindowInsets windowInsets) {
        this.unconsumedInsets$delegate.setValue(windowInsets);
    }
}
