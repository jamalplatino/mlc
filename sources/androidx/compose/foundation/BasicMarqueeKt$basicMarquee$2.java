package androidx.compose.foundation;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import kotlin.Metadata;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "Landroidx/compose/ui/Modifier;", "invoke", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* compiled from: BasicMarquee.kt */
final class BasicMarqueeKt$basicMarquee$2 extends Lambda implements Function3<Modifier, Composer, Integer, Modifier> {
    final /* synthetic */ int $animationMode;
    final /* synthetic */ int $delayMillis;
    final /* synthetic */ int $initialDelayMillis;
    final /* synthetic */ int $iterations;
    final /* synthetic */ MarqueeSpacing $spacing;
    final /* synthetic */ float $velocity;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    BasicMarqueeKt$basicMarquee$2(int i, int i2, int i3, float f, MarqueeSpacing marqueeSpacing, int i4) {
        super(3);
        this.$iterations = i;
        this.$delayMillis = i2;
        this.$initialDelayMillis = i3;
        this.$velocity = f;
        this.$spacing = marqueeSpacing;
        this.$animationMode = i4;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return invoke((Modifier) obj, (Composer) obj2, ((Number) obj3).intValue());
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v9, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v14, resolved type: androidx.compose.foundation.MarqueeModifier} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v7, resolved type: androidx.compose.foundation.MarqueeModifier} */
    /* JADX WARNING: type inference failed for: r0v10 */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0092, code lost:
        if (r0 == androidx.compose.runtime.Composer.Companion.getEmpty()) goto L_0x0094;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final androidx.compose.ui.Modifier invoke(androidx.compose.ui.Modifier r10, androidx.compose.runtime.Composer r11, int r12) {
        /*
            r9 = this;
            java.lang.String r0 = "$this$composed"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            r10 = -562302205(0xffffffffde7bf303, float:-4.53871446E18)
            r11.startReplaceableGroup(r10)
            java.lang.String r0 = "C151@7528L7,152@7583L7,153@7610L421,172@8136L39,172@8111L64:BasicMarquee.kt#71ulvw"
            androidx.compose.runtime.ComposerKt.sourceInformation(r11, r0)
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto L_0x001d
            r0 = -1
            java.lang.String r1 = "androidx.compose.foundation.basicMarquee.<anonymous> (BasicMarquee.kt:150)"
            androidx.compose.runtime.ComposerKt.traceEventStart(r10, r12, r0, r1)
        L_0x001d:
            androidx.compose.runtime.ProvidableCompositionLocal r10 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalDensity()
            androidx.compose.runtime.CompositionLocal r10 = (androidx.compose.runtime.CompositionLocal) r10
            r12 = 2023513938(0x789c5f52, float:2.5372864E34)
            java.lang.String r0 = "CC:CompositionLocal.kt#9igjgp"
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(r11, r12, r0)
            java.lang.Object r10 = r11.consume(r10)
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(r11)
            androidx.compose.ui.unit.Density r10 = (androidx.compose.ui.unit.Density) r10
            androidx.compose.runtime.ProvidableCompositionLocal r1 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalLayoutDirection()
            androidx.compose.runtime.CompositionLocal r1 = (androidx.compose.runtime.CompositionLocal) r1
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(r11, r12, r0)
            java.lang.Object r12 = r11.consume(r1)
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(r11)
            androidx.compose.ui.unit.LayoutDirection r12 = (androidx.compose.ui.unit.LayoutDirection) r12
            int r0 = r9.$iterations
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            int r0 = r9.$delayMillis
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            int r0 = r9.$initialDelayMillis
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
            float r0 = r9.$velocity
            androidx.compose.ui.unit.Dp r4 = androidx.compose.ui.unit.Dp.m5624boximpl(r0)
            r5 = r10
            r6 = r12
            java.lang.Object[] r0 = new java.lang.Object[]{r1, r2, r3, r4, r5, r6}
            int r2 = r9.$iterations
            int r3 = r9.$delayMillis
            int r4 = r9.$initialDelayMillis
            float r1 = r9.$velocity
            r5 = -568225417(0xffffffffde219177, float:-2.91055434E18)
            r11.startReplaceableGroup(r5)
            java.lang.String r8 = "CC(remember)P(1):Composables.kt#9igjgp"
            androidx.compose.runtime.ComposerKt.sourceInformation(r11, r8)
            r5 = 0
            r6 = r5
        L_0x0079:
            r7 = 6
            if (r5 >= r7) goto L_0x0086
            r7 = r0[r5]
            boolean r7 = r11.changed((java.lang.Object) r7)
            r6 = r6 | r7
            int r5 = r5 + 1
            goto L_0x0079
        L_0x0086:
            java.lang.Object r0 = r11.rememberedValue()
            if (r6 != 0) goto L_0x0094
            androidx.compose.runtime.Composer$Companion r5 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r5 = r5.getEmpty()
            if (r0 != r5) goto L_0x00ad
        L_0x0094:
            androidx.compose.foundation.MarqueeModifier r0 = new androidx.compose.foundation.MarqueeModifier
            androidx.compose.ui.unit.LayoutDirection r5 = androidx.compose.ui.unit.LayoutDirection.Ltr
            if (r12 != r5) goto L_0x009d
            r12 = 1065353216(0x3f800000, float:1.0)
            goto L_0x009f
        L_0x009d:
            r12 = -1082130432(0xffffffffbf800000, float:-1.0)
        L_0x009f:
            float r1 = r1 * r12
            float r5 = androidx.compose.ui.unit.Dp.m5626constructorimpl(r1)
            r7 = 0
            r1 = r0
            r6 = r10
            r1.<init>(r2, r3, r4, r5, r6, r7)
            r11.updateRememberedValue(r0)
        L_0x00ad:
            r11.endReplaceableGroup()
            androidx.compose.foundation.MarqueeModifier r0 = (androidx.compose.foundation.MarqueeModifier) r0
            androidx.compose.foundation.MarqueeSpacing r10 = r9.$spacing
            r0.setSpacing(r10)
            int r10 = r9.$animationMode
            r0.m247setAnimationMode97h66l8(r10)
            r10 = 1157296644(0x44faf204, float:2007.563)
            r11.startReplaceableGroup(r10)
            androidx.compose.runtime.ComposerKt.sourceInformation(r11, r8)
            boolean r10 = r11.changed((java.lang.Object) r0)
            java.lang.Object r12 = r11.rememberedValue()
            if (r10 != 0) goto L_0x00d7
            androidx.compose.runtime.Composer$Companion r10 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r10 = r10.getEmpty()
            if (r12 != r10) goto L_0x00e3
        L_0x00d7:
            androidx.compose.foundation.BasicMarqueeKt$basicMarquee$2$1$1 r10 = new androidx.compose.foundation.BasicMarqueeKt$basicMarquee$2$1$1
            r12 = 0
            r10.<init>(r0, r12)
            r12 = r10
            kotlin.jvm.functions.Function2 r12 = (kotlin.jvm.functions.Function2) r12
            r11.updateRememberedValue(r12)
        L_0x00e3:
            r11.endReplaceableGroup()
            kotlin.jvm.functions.Function2 r12 = (kotlin.jvm.functions.Function2) r12
            r10 = 64
            androidx.compose.runtime.EffectsKt.LaunchedEffect((java.lang.Object) r0, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) r12, (androidx.compose.runtime.Composer) r11, (int) r10)
            boolean r10 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r10 == 0) goto L_0x00f6
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L_0x00f6:
            r11.endReplaceableGroup()
            androidx.compose.ui.Modifier r0 = (androidx.compose.ui.Modifier) r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.BasicMarqueeKt$basicMarquee$2.invoke(androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int):androidx.compose.ui.Modifier");
    }
}
