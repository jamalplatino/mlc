package androidx.compose.material3;

import android.view.View;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.node.Ref;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.unit.Density;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* compiled from: ExposedDropdownMenu.kt */
public final class ExposedDropdownMenuKt$ExposedDropdownMenuBox$scope$1$1 implements ExposedDropdownMenuBoxScope {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ Ref<LayoutCoordinates> $coordinates;
    final /* synthetic */ Density $density;
    final /* synthetic */ boolean $expanded;
    final /* synthetic */ FocusRequester $focusRequester;
    final /* synthetic */ MutableState<Integer> $menuHeight$delegate;
    final /* synthetic */ Function1<Boolean, Unit> $onExpandedChange;
    final /* synthetic */ int $verticalMarginInPx;
    final /* synthetic */ View $view;
    final /* synthetic */ MutableState<Integer> $width$delegate;

    ExposedDropdownMenuKt$ExposedDropdownMenuBox$scope$1$1(boolean z, Function1<? super Boolean, Unit> function1, int i, FocusRequester focusRequester, Ref<LayoutCoordinates> ref, View view, int i2, MutableState<Integer> mutableState, MutableState<Integer> mutableState2, Density density) {
        this.$expanded = z;
        this.$onExpandedChange = function1;
        this.$$dirty = i;
        this.$focusRequester = focusRequester;
        this.$coordinates = ref;
        this.$view = view;
        this.$verticalMarginInPx = i2;
        this.$width$delegate = mutableState;
        this.$menuHeight$delegate = mutableState2;
        this.$density = density;
    }

    public Modifier exposedDropdownSize(Modifier modifier, boolean z) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        Density density = this.$density;
        MutableState<Integer> mutableState = this.$menuHeight$delegate;
        MutableState<Integer> mutableState2 = this.$width$delegate;
        Modifier r7 = SizeKt.m551heightInVpY3zN4$default(modifier, 0.0f, density.m5604toDpu2uoSUM(ExposedDropdownMenuKt.ExposedDropdownMenuBox$lambda$4(mutableState)), 1, (Object) null);
        return z ? SizeKt.m568width3ABfNKs(r7, density.m5604toDpu2uoSUM(ExposedDropdownMenuKt.ExposedDropdownMenuBox$lambda$1(mutableState2))) : r7;
    }

    public Modifier menuAnchor(Modifier modifier) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        return ComposedModifierKt.composed(modifier, InspectableValueKt.isDebugInspectorInfoEnabled() ? new ExposedDropdownMenuKt$ExposedDropdownMenuBox$scope$1$1$menuAnchor$$inlined$debugInspectorInfo$1() : InspectableValueKt.getNoInspectorInfo(), new ExposedDropdownMenuKt$ExposedDropdownMenuBox$scope$1$1$menuAnchor$2(this.$expanded, this.$onExpandedChange, this.$$dirty, this.$focusRequester, this.$coordinates, this.$view, this.$verticalMarginInPx, this.$width$delegate, this.$menuHeight$delegate));
    }
}
