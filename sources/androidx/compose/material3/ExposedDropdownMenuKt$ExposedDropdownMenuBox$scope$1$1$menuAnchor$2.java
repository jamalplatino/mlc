package androidx.compose.material3;

import android.view.View;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.node.Ref;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;

@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* compiled from: ExposedDropdownMenu.kt */
final class ExposedDropdownMenuKt$ExposedDropdownMenuBox$scope$1$1$menuAnchor$2 extends Lambda implements Function3<Modifier, Composer, Integer, Modifier> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ Ref<LayoutCoordinates> $coordinates;
    final /* synthetic */ boolean $expanded;
    final /* synthetic */ FocusRequester $focusRequester;
    final /* synthetic */ MutableState<Integer> $menuHeight$delegate;
    final /* synthetic */ Function1<Boolean, Unit> $onExpandedChange;
    final /* synthetic */ int $verticalMarginInPx;
    final /* synthetic */ View $view;
    final /* synthetic */ MutableState<Integer> $width$delegate;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ExposedDropdownMenuKt$ExposedDropdownMenuBox$scope$1$1$menuAnchor$2(boolean z, Function1<? super Boolean, Unit> function1, int i, FocusRequester focusRequester, Ref<LayoutCoordinates> ref, View view, int i2, MutableState<Integer> mutableState, MutableState<Integer> mutableState2) {
        super(3);
        this.$expanded = z;
        this.$onExpandedChange = function1;
        this.$$dirty = i;
        this.$focusRequester = focusRequester;
        this.$coordinates = ref;
        this.$view = view;
        this.$verticalMarginInPx = i2;
        this.$width$delegate = mutableState;
        this.$menuHeight$delegate = mutableState2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return invoke((Modifier) obj, (Composer) obj2, ((Number) obj3).intValue());
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: kotlin.jvm.functions.Function0} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final androidx.compose.ui.Modifier invoke(androidx.compose.ui.Modifier r10, androidx.compose.runtime.Composer r11, int r12) {
        /*
            r9 = this;
            java.lang.String r0 = "$this$composed"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            r0 = 1714866713(0x6636ca19, float:2.1579969E23)
            r11.startReplaceableGroup(r0)
            java.lang.String r1 = "C131@6216L31,129@6116L154:ExposedDropdownMenu.kt#uh7d8r"
            androidx.compose.runtime.ComposerKt.sourceInformation(r11, r1)
            boolean r1 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r1 == 0) goto L_0x001d
            r1 = -1
            java.lang.String r2 = "androidx.compose.material3.ExposedDropdownMenuBox.<anonymous>.<no name provided>.menuAnchor.<anonymous> (ExposedDropdownMenu.kt:118)"
            androidx.compose.runtime.ComposerKt.traceEventStart(r0, r12, r1, r2)
        L_0x001d:
            androidx.compose.material3.ExposedDropdownMenuKt$ExposedDropdownMenuBox$scope$1$1$menuAnchor$2$1 r12 = new androidx.compose.material3.ExposedDropdownMenuKt$ExposedDropdownMenuBox$scope$1$1$menuAnchor$2$1
            androidx.compose.ui.node.Ref<androidx.compose.ui.layout.LayoutCoordinates> r4 = r9.$coordinates
            android.view.View r5 = r9.$view
            int r6 = r9.$verticalMarginInPx
            androidx.compose.runtime.MutableState<java.lang.Integer> r7 = r9.$width$delegate
            androidx.compose.runtime.MutableState<java.lang.Integer> r8 = r9.$menuHeight$delegate
            r3 = r12
            r3.<init>(r4, r5, r6, r7, r8)
            kotlin.jvm.functions.Function1 r12 = (kotlin.jvm.functions.Function1) r12
            androidx.compose.ui.Modifier r0 = androidx.compose.ui.layout.OnGloballyPositionedModifierKt.onGloballyPositioned(r10, r12)
            boolean r1 = r9.$expanded
            kotlin.jvm.functions.Function1<java.lang.Boolean, kotlin.Unit> r10 = r9.$onExpandedChange
            java.lang.Boolean r12 = java.lang.Boolean.valueOf(r1)
            kotlin.jvm.functions.Function1<java.lang.Boolean, kotlin.Unit> r2 = r9.$onExpandedChange
            boolean r3 = r9.$expanded
            r4 = 511388516(0x1e7b2b64, float:1.3296802E-20)
            r11.startReplaceableGroup(r4)
            java.lang.String r4 = "CC(remember)P(1,2):Composables.kt#9igjgp"
            androidx.compose.runtime.ComposerKt.sourceInformation(r11, r4)
            boolean r10 = r11.changed((java.lang.Object) r10)
            boolean r12 = r11.changed((java.lang.Object) r12)
            r10 = r10 | r12
            java.lang.Object r12 = r11.rememberedValue()
            if (r10 != 0) goto L_0x0061
            androidx.compose.runtime.Composer$Companion r10 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r10 = r10.getEmpty()
            if (r12 != r10) goto L_0x006c
        L_0x0061:
            androidx.compose.material3.ExposedDropdownMenuKt$ExposedDropdownMenuBox$scope$1$1$menuAnchor$2$2$1 r10 = new androidx.compose.material3.ExposedDropdownMenuKt$ExposedDropdownMenuBox$scope$1$1$menuAnchor$2$2$1
            r10.<init>(r2, r3)
            r12 = r10
            kotlin.jvm.functions.Function0 r12 = (kotlin.jvm.functions.Function0) r12
            r11.updateRememberedValue(r12)
        L_0x006c:
            r11.endReplaceableGroup()
            r2 = r12
            kotlin.jvm.functions.Function0 r2 = (kotlin.jvm.functions.Function0) r2
            r3 = 0
            r4 = 0
            r5 = 0
            int r10 = r9.$$dirty
            int r10 = r10 << 3
            r7 = r10 & 112(0x70, float:1.57E-43)
            r8 = 28
            r6 = r11
            androidx.compose.ui.Modifier r10 = androidx.compose.material3.ExposedDropdownMenuKt.expandable(r0, r1, r2, r3, r4, r5, r6, r7, r8)
            androidx.compose.ui.focus.FocusRequester r12 = r9.$focusRequester
            androidx.compose.ui.Modifier r10 = androidx.compose.ui.focus.FocusRequesterModifierKt.focusRequester(r10, r12)
            boolean r12 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r12 == 0) goto L_0x0091
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L_0x0091:
            r11.endReplaceableGroup()
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.ExposedDropdownMenuKt$ExposedDropdownMenuBox$scope$1$1$menuAnchor$2.invoke(androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int):androidx.compose.ui.Modifier");
    }
}
