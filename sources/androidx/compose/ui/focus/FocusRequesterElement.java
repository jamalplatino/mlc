package androidx.compose.ui.focus;

import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\b\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\t\u0010\b\u001a\u00020\u0004HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0004HÆ\u0001J\b\u0010\n\u001a\u00020\u0002H\u0016J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\u0010\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0002H\u0016J\f\u0010\u0015\u001a\u00020\u0016*\u00020\u0017H\u0016R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0018"}, d2 = {"Landroidx/compose/ui/focus/FocusRequesterElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/ui/focus/FocusRequesterModifierNodeImpl;", "focusRequester", "Landroidx/compose/ui/focus/FocusRequester;", "(Landroidx/compose/ui/focus/FocusRequester;)V", "getFocusRequester", "()Landroidx/compose/ui/focus/FocusRequester;", "component1", "copy", "create", "equals", "", "other", "", "hashCode", "", "toString", "", "update", "node", "inspectableProperties", "", "Landroidx/compose/ui/platform/InspectorInfo;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* compiled from: FocusRequesterModifier.kt */
final class FocusRequesterElement extends ModifierNodeElement<FocusRequesterModifierNodeImpl> {
    private final FocusRequester focusRequester;

    public static /* synthetic */ FocusRequesterElement copy$default(FocusRequesterElement focusRequesterElement, FocusRequester focusRequester2, int i, Object obj) {
        if ((i & 1) != 0) {
            focusRequester2 = focusRequesterElement.focusRequester;
        }
        return focusRequesterElement.copy(focusRequester2);
    }

    public final FocusRequester component1() {
        return this.focusRequester;
    }

    public final FocusRequesterElement copy(FocusRequester focusRequester2) {
        Intrinsics.checkNotNullParameter(focusRequester2, "focusRequester");
        return new FocusRequesterElement(focusRequester2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof FocusRequesterElement) && Intrinsics.areEqual((Object) this.focusRequester, (Object) ((FocusRequesterElement) obj).focusRequester);
    }

    public final FocusRequester getFocusRequester() {
        return this.focusRequester;
    }

    public int hashCode() {
        return this.focusRequester.hashCode();
    }

    public String toString() {
        return "FocusRequesterElement(focusRequester=" + this.focusRequester + ')';
    }

    public FocusRequesterElement(FocusRequester focusRequester2) {
        Intrinsics.checkNotNullParameter(focusRequester2, "focusRequester");
        this.focusRequester = focusRequester2;
    }

    public FocusRequesterModifierNodeImpl create() {
        return new FocusRequesterModifierNodeImpl(this.focusRequester);
    }

    public FocusRequesterModifierNodeImpl update(FocusRequesterModifierNodeImpl focusRequesterModifierNodeImpl) {
        Intrinsics.checkNotNullParameter(focusRequesterModifierNodeImpl, "node");
        focusRequesterModifierNodeImpl.getFocusRequester().getFocusRequesterNodes$ui_release().remove(focusRequesterModifierNodeImpl);
        focusRequesterModifierNodeImpl.setFocusRequester(this.focusRequester);
        focusRequesterModifierNodeImpl.getFocusRequester().getFocusRequesterNodes$ui_release().add(focusRequesterModifierNodeImpl);
        return focusRequesterModifierNodeImpl;
    }

    public void inspectableProperties(InspectorInfo inspectorInfo) {
        Intrinsics.checkNotNullParameter(inspectorInfo, "<this>");
        inspectorInfo.setName("focusRequester");
        inspectorInfo.getProperties().set("focusRequester", this.focusRequester);
    }
}