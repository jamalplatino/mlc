package androidx.compose.ui.focus;

import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001e\u0012\u0017\u0010\u0003\u001a\u0013\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0002\b\u0007¢\u0006\u0002\u0010\bJ\u001a\u0010\u000b\u001a\u0013\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0002\b\u0007HÆ\u0003J$\u0010\f\u001a\u00020\u00002\u0019\b\u0002\u0010\u0003\u001a\u0013\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0002\b\u0007HÆ\u0001J\b\u0010\r\u001a\u00020\u0002H\u0016J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\u0010\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u0002H\u0016J\f\u0010\u0018\u001a\u00020\u0006*\u00020\u0019H\u0016R\"\u0010\u0003\u001a\u0013\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0002\b\u0007¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u001a"}, d2 = {"Landroidx/compose/ui/focus/FocusPropertiesElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/ui/focus/FocusPropertiesModifierNodeImpl;", "scope", "Lkotlin/Function1;", "Landroidx/compose/ui/focus/FocusProperties;", "", "Lkotlin/ExtensionFunctionType;", "(Lkotlin/jvm/functions/Function1;)V", "getScope", "()Lkotlin/jvm/functions/Function1;", "component1", "copy", "create", "equals", "", "other", "", "hashCode", "", "toString", "", "update", "node", "inspectableProperties", "Landroidx/compose/ui/platform/InspectorInfo;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* compiled from: FocusProperties.kt */
final class FocusPropertiesElement extends ModifierNodeElement<FocusPropertiesModifierNodeImpl> {
    private final Function1<FocusProperties, Unit> scope;

    public static /* synthetic */ FocusPropertiesElement copy$default(FocusPropertiesElement focusPropertiesElement, Function1<FocusProperties, Unit> function1, int i, Object obj) {
        if ((i & 1) != 0) {
            function1 = focusPropertiesElement.scope;
        }
        return focusPropertiesElement.copy(function1);
    }

    public final Function1<FocusProperties, Unit> component1() {
        return this.scope;
    }

    public final FocusPropertiesElement copy(Function1<? super FocusProperties, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "scope");
        return new FocusPropertiesElement(function1);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof FocusPropertiesElement) && Intrinsics.areEqual((Object) this.scope, (Object) ((FocusPropertiesElement) obj).scope);
    }

    public final Function1<FocusProperties, Unit> getScope() {
        return this.scope;
    }

    public int hashCode() {
        return this.scope.hashCode();
    }

    public String toString() {
        return "FocusPropertiesElement(scope=" + this.scope + ')';
    }

    public FocusPropertiesElement(Function1<? super FocusProperties, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "scope");
        this.scope = function1;
    }

    public FocusPropertiesModifierNodeImpl create() {
        return new FocusPropertiesModifierNodeImpl(this.scope);
    }

    public FocusPropertiesModifierNodeImpl update(FocusPropertiesModifierNodeImpl focusPropertiesModifierNodeImpl) {
        Intrinsics.checkNotNullParameter(focusPropertiesModifierNodeImpl, "node");
        focusPropertiesModifierNodeImpl.setFocusPropertiesScope(this.scope);
        return focusPropertiesModifierNodeImpl;
    }

    public void inspectableProperties(InspectorInfo inspectorInfo) {
        Intrinsics.checkNotNullParameter(inspectorInfo, "<this>");
        inspectorInfo.setName("focusProperties");
        inspectorInfo.getProperties().set("scope", this.scope);
    }
}
