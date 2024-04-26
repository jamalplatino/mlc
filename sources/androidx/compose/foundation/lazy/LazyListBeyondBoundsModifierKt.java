package androidx.compose.foundation.lazy;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a1\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0001¢\u0006\u0002\u0010\n¨\u0006\u000b"}, d2 = {"lazyListBeyondBoundsModifier", "Landroidx/compose/ui/Modifier;", "state", "Landroidx/compose/foundation/lazy/LazyListState;", "beyondBoundsInfo", "Landroidx/compose/foundation/lazy/LazyListBeyondBoundsInfo;", "reverseLayout", "", "orientation", "Landroidx/compose/foundation/gestures/Orientation;", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/lazy/LazyListState;Landroidx/compose/foundation/lazy/LazyListBeyondBoundsInfo;ZLandroidx/compose/foundation/gestures/Orientation;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: LazyListBeyondBoundsModifier.kt */
public final class LazyListBeyondBoundsModifierKt {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v7, resolved type: androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsModifierLocal} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v14, resolved type: androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsModifierLocal} */
    /* JADX WARNING: type inference failed for: r7v4 */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x009d, code lost:
        if (r7 == androidx.compose.runtime.Composer.Companion.getEmpty()) goto L_0x009f;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final androidx.compose.ui.Modifier lazyListBeyondBoundsModifier(androidx.compose.ui.Modifier r6, androidx.compose.foundation.lazy.LazyListState r7, androidx.compose.foundation.lazy.LazyListBeyondBoundsInfo r8, boolean r9, androidx.compose.foundation.gestures.Orientation r10, androidx.compose.runtime.Composer r11, int r12) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            java.lang.String r0 = "state"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            java.lang.String r0 = "beyondBoundsInfo"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            java.lang.String r0 = "orientation"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            r0 = -62057177(0xfffffffffc4d1527, float:-4.2593995E36)
            r11.startReplaceableGroup(r0)
            java.lang.String r1 = "C(lazyListBeyondBoundsModifier)P(3!1,2)38@1490L7,39@1526L52,40@1600L340:LazyListBeyondBoundsModifier.kt#428nma"
            androidx.compose.runtime.ComposerKt.sourceInformation(r11, r1)
            boolean r1 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r1 == 0) goto L_0x002f
            r1 = -1
            java.lang.String r2 = "androidx.compose.foundation.lazy.lazyListBeyondBoundsModifier (LazyListBeyondBoundsModifier.kt:32)"
            androidx.compose.runtime.ComposerKt.traceEventStart(r0, r12, r1, r2)
        L_0x002f:
            androidx.compose.runtime.ProvidableCompositionLocal r12 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalLayoutDirection()
            androidx.compose.runtime.CompositionLocal r12 = (androidx.compose.runtime.CompositionLocal) r12
            r0 = 2023513938(0x789c5f52, float:2.5372864E34)
            java.lang.String r1 = "CC:CompositionLocal.kt#9igjgp"
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(r11, r0, r1)
            java.lang.Object r12 = r11.consume(r12)
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(r11)
            r4 = r12
            androidx.compose.ui.unit.LayoutDirection r4 = (androidx.compose.ui.unit.LayoutDirection) r4
            r12 = 1157296644(0x44faf204, float:2007.563)
            r11.startReplaceableGroup(r12)
            java.lang.String r12 = "CC(remember)P(1):Composables.kt#9igjgp"
            androidx.compose.runtime.ComposerKt.sourceInformation(r11, r12)
            boolean r0 = r11.changed((java.lang.Object) r7)
            java.lang.Object r1 = r11.rememberedValue()
            if (r0 != 0) goto L_0x0064
            androidx.compose.runtime.Composer$Companion r0 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r0 = r0.getEmpty()
            if (r1 != r0) goto L_0x006c
        L_0x0064:
            androidx.compose.foundation.lazy.LazyListBeyondBoundsState r1 = new androidx.compose.foundation.lazy.LazyListBeyondBoundsState
            r1.<init>(r7)
            r11.updateRememberedValue(r1)
        L_0x006c:
            r11.endReplaceableGroup()
            androidx.compose.foundation.lazy.LazyListBeyondBoundsState r1 = (androidx.compose.foundation.lazy.LazyListBeyondBoundsState) r1
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r9)
            java.lang.Object[] r7 = new java.lang.Object[]{r1, r8, r7, r4, r10}
            r0 = -568225417(0xffffffffde219177, float:-2.91055434E18)
            r11.startReplaceableGroup(r0)
            androidx.compose.runtime.ComposerKt.sourceInformation(r11, r12)
            r12 = 0
            r0 = r12
        L_0x0084:
            r2 = 5
            if (r12 >= r2) goto L_0x0091
            r2 = r7[r12]
            boolean r2 = r11.changed((java.lang.Object) r2)
            r0 = r0 | r2
            int r12 = r12 + 1
            goto L_0x0084
        L_0x0091:
            java.lang.Object r7 = r11.rememberedValue()
            if (r0 != 0) goto L_0x009f
            androidx.compose.runtime.Composer$Companion r12 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r12 = r12.getEmpty()
            if (r7 != r12) goto L_0x00ad
        L_0x009f:
            androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsModifierLocal r7 = new androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsModifierLocal
            androidx.compose.foundation.lazy.layout.BeyondBoundsState r1 = (androidx.compose.foundation.lazy.layout.BeyondBoundsState) r1
            r0 = r7
            r2 = r8
            r3 = r9
            r5 = r10
            r0.<init>(r1, r2, r3, r4, r5)
            r11.updateRememberedValue(r7)
        L_0x00ad:
            r11.endReplaceableGroup()
            androidx.compose.ui.Modifier r7 = (androidx.compose.ui.Modifier) r7
            androidx.compose.ui.Modifier r6 = r6.then(r7)
            boolean r7 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r7 == 0) goto L_0x00bf
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L_0x00bf:
            r11.endReplaceableGroup()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.LazyListBeyondBoundsModifierKt.lazyListBeyondBoundsModifier(androidx.compose.ui.Modifier, androidx.compose.foundation.lazy.LazyListState, androidx.compose.foundation.lazy.LazyListBeyondBoundsInfo, boolean, androidx.compose.foundation.gestures.Orientation, androidx.compose.runtime.Composer, int):androidx.compose.ui.Modifier");
    }
}
