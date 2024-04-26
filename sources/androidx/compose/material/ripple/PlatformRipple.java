package androidx.compose.material.ripple;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B&\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007ø\u0001\u0000¢\u0006\u0002\u0010\tJ\r\u0010\n\u001a\u00020\u000bH\u0003¢\u0006\u0002\u0010\fJI\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u0007H\u0017ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\u0015"}, d2 = {"Landroidx/compose/material/ripple/PlatformRipple;", "Landroidx/compose/material/ripple/Ripple;", "bounded", "", "radius", "Landroidx/compose/ui/unit/Dp;", "color", "Landroidx/compose/runtime/State;", "Landroidx/compose/ui/graphics/Color;", "(ZFLandroidx/compose/runtime/State;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "findNearestViewGroup", "Landroid/view/ViewGroup;", "(Landroidx/compose/runtime/Composer;I)Landroid/view/ViewGroup;", "rememberUpdatedRippleInstance", "Landroidx/compose/material/ripple/RippleIndicationInstance;", "interactionSource", "Landroidx/compose/foundation/interaction/InteractionSource;", "rippleAlpha", "Landroidx/compose/material/ripple/RippleAlpha;", "rememberUpdatedRippleInstance-942rkJo", "(Landroidx/compose/foundation/interaction/InteractionSource;ZFLandroidx/compose/runtime/State;Landroidx/compose/runtime/State;Landroidx/compose/runtime/Composer;I)Landroidx/compose/material/ripple/RippleIndicationInstance;", "material-ripple_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* compiled from: Ripple.android.kt */
public final class PlatformRipple extends Ripple {
    public /* synthetic */ PlatformRipple(boolean z, float f, State state, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, f, state);
    }

    private PlatformRipple(boolean z, float f, State<Color> state) {
        super(z, f, state, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v8, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v16, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v20, resolved type: androidx.compose.material.ripple.AndroidRippleIndicationInstance} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v8, resolved type: androidx.compose.material.ripple.AndroidRippleIndicationInstance} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v21, resolved type: androidx.compose.material.ripple.CommonRippleIndicationInstance} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v9, resolved type: androidx.compose.material.ripple.CommonRippleIndicationInstance} */
    /* JADX WARNING: type inference failed for: r3v9 */
    /* JADX WARNING: type inference failed for: r3v17 */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00e9, code lost:
        if (r3 == androidx.compose.runtime.Composer.Companion.getEmpty()) goto L_0x00eb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x006d, code lost:
        if (r3 == androidx.compose.runtime.Composer.Companion.getEmpty()) goto L_0x006f;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: rememberUpdatedRippleInstance-942rkJo  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public androidx.compose.material.ripple.RippleIndicationInstance m1097rememberUpdatedRippleInstance942rkJo(androidx.compose.foundation.interaction.InteractionSource r13, boolean r14, float r15, androidx.compose.runtime.State<androidx.compose.ui.graphics.Color> r16, androidx.compose.runtime.State<androidx.compose.material.ripple.RippleAlpha> r17, androidx.compose.runtime.Composer r18, int r19) {
        /*
            r12 = this;
            r0 = r12
            r1 = r13
            r2 = r18
            r3 = r19
            java.lang.String r4 = "interactionSource"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r4)
            java.lang.String r4 = "color"
            r8 = r16
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r4)
            java.lang.String r4 = "rippleAlpha"
            r9 = r17
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r4)
            r4 = 331259447(0x13be9e37, float:4.8118755E-27)
            r2.startReplaceableGroup(r4)
            java.lang.String r5 = "C(rememberUpdatedRippleInstance)P(2!1,3:c#ui.unit.Dp)64@2484L22,90@3354L160:Ripple.android.kt#vhb33q"
            androidx.compose.runtime.ComposerKt.sourceInformation(r2, r5)
            boolean r5 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r5 == 0) goto L_0x0034
            r5 = -1
            java.lang.String r6 = "androidx.compose.material.ripple.PlatformRipple.rememberUpdatedRippleInstance (Ripple.android.kt:57)"
            androidx.compose.runtime.ComposerKt.traceEventStart(r4, r3, r5, r6)
        L_0x0034:
            int r3 = r3 >> 15
            r3 = r3 & 14
            android.view.ViewGroup r3 = r12.findNearestViewGroup(r2, r3)
            r4 = 1643267286(0x61f244d6, float:5.5863403E20)
            r2.startReplaceableGroup(r4)
            java.lang.String r4 = "67@2658L133"
            androidx.compose.runtime.ComposerKt.sourceInformation(r2, r4)
            boolean r4 = r3.isInEditMode()
            if (r4 == 0) goto L_0x0096
            r3 = 511388516(0x1e7b2b64, float:1.3296802E-20)
            r2.startReplaceableGroup(r3)
            java.lang.String r3 = "C(remember)P(1,2):Composables.kt#9igjgp"
            androidx.compose.runtime.ComposerKt.sourceInformation(r2, r3)
            boolean r1 = r2.changed((java.lang.Object) r13)
            boolean r3 = r2.changed((java.lang.Object) r12)
            r1 = r1 | r3
            java.lang.Object r3 = r18.rememberedValue()
            if (r1 != 0) goto L_0x006f
            androidx.compose.runtime.Composer$Companion r1 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r1 = r1.getEmpty()
            if (r3 != r1) goto L_0x007f
        L_0x006f:
            androidx.compose.material.ripple.CommonRippleIndicationInstance r3 = new androidx.compose.material.ripple.CommonRippleIndicationInstance
            r10 = 0
            r5 = r3
            r6 = r14
            r7 = r15
            r8 = r16
            r9 = r17
            r5.<init>(r6, r7, r8, r9, r10)
            r2.updateRememberedValue(r3)
        L_0x007f:
            r18.endReplaceableGroup()
            androidx.compose.material.ripple.CommonRippleIndicationInstance r3 = (androidx.compose.material.ripple.CommonRippleIndicationInstance) r3
            r18.endReplaceableGroup()
            boolean r1 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r1 == 0) goto L_0x0090
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L_0x0090:
            r18.endReplaceableGroup()
            androidx.compose.material.ripple.RippleIndicationInstance r3 = (androidx.compose.material.ripple.RippleIndicationInstance) r3
            return r3
        L_0x0096:
            r18.endReplaceableGroup()
            int r4 = r3.getChildCount()
            r5 = 0
        L_0x009e:
            if (r5 >= r4) goto L_0x00ac
            android.view.View r6 = r3.getChildAt(r5)
            boolean r7 = r6 instanceof androidx.compose.material.ripple.RippleContainer
            if (r7 == 0) goto L_0x00a9
            goto L_0x00ad
        L_0x00a9:
            int r5 = r5 + 1
            goto L_0x009e
        L_0x00ac:
            r6 = 0
        L_0x00ad:
            if (r6 != 0) goto L_0x00c4
            androidx.compose.material.ripple.RippleContainer r6 = new androidx.compose.material.ripple.RippleContainer
            android.content.Context r4 = r3.getContext()
            java.lang.String r5 = "view.context"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r5)
            r6.<init>(r4)
            r4 = r6
            android.view.View r4 = (android.view.View) r4
            r3.addView(r4)
        L_0x00c4:
            r3 = 1618982084(0x607fb4c4, float:7.370227E19)
            r2.startReplaceableGroup(r3)
            java.lang.String r3 = "C(remember)P(1,2,3):Composables.kt#9igjgp"
            androidx.compose.runtime.ComposerKt.sourceInformation(r2, r3)
            boolean r1 = r2.changed((java.lang.Object) r13)
            boolean r3 = r2.changed((java.lang.Object) r12)
            r1 = r1 | r3
            boolean r3 = r2.changed((java.lang.Object) r6)
            r1 = r1 | r3
            java.lang.Object r3 = r18.rememberedValue()
            if (r1 != 0) goto L_0x00eb
            androidx.compose.runtime.Composer$Companion r1 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r1 = r1.getEmpty()
            if (r3 != r1) goto L_0x00fe
        L_0x00eb:
            androidx.compose.material.ripple.AndroidRippleIndicationInstance r3 = new androidx.compose.material.ripple.AndroidRippleIndicationInstance
            r10 = r6
            androidx.compose.material.ripple.RippleContainer r10 = (androidx.compose.material.ripple.RippleContainer) r10
            r11 = 0
            r5 = r3
            r6 = r14
            r7 = r15
            r8 = r16
            r9 = r17
            r5.<init>(r6, r7, r8, r9, r10, r11)
            r2.updateRememberedValue(r3)
        L_0x00fe:
            r18.endReplaceableGroup()
            androidx.compose.material.ripple.AndroidRippleIndicationInstance r3 = (androidx.compose.material.ripple.AndroidRippleIndicationInstance) r3
            boolean r1 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r1 == 0) goto L_0x010c
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L_0x010c:
            r18.endReplaceableGroup()
            androidx.compose.material.ripple.RippleIndicationInstance r3 = (androidx.compose.material.ripple.RippleIndicationInstance) r3
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.ripple.PlatformRipple.m1097rememberUpdatedRippleInstance942rkJo(androidx.compose.foundation.interaction.InteractionSource, boolean, float, androidx.compose.runtime.State, androidx.compose.runtime.State, androidx.compose.runtime.Composer, int):androidx.compose.material.ripple.RippleIndicationInstance");
    }

    private final ViewGroup findNearestViewGroup(Composer composer, int i) {
        composer.startReplaceableGroup(-1737891121);
        ComposerKt.sourceInformation(composer, "C(findNearestViewGroup)105@4003L7:Ripple.android.kt#vhb33q");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1737891121, i, -1, "androidx.compose.material.ripple.PlatformRipple.findNearestViewGroup (Ripple.android.kt:104)");
        }
        ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "C:CompositionLocal.kt#9igjgp");
        Object consume = composer.consume(AndroidCompositionLocals_androidKt.getLocalView());
        ComposerKt.sourceInformationMarkerEnd(composer);
        while (!(consume instanceof ViewGroup)) {
            ViewParent parent = ((View) consume).getParent();
            if (parent instanceof View) {
                Intrinsics.checkNotNullExpressionValue(parent, "parent");
                consume = parent;
            } else {
                throw new IllegalArgumentException(("Couldn't find a valid parent for " + consume + ". Are you overriding LocalView and providing a View that is not attached to the view hierarchy?").toString());
            }
        }
        ViewGroup viewGroup = (ViewGroup) consume;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return viewGroup;
    }
}
