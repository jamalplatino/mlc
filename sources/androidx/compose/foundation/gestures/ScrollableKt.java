package androidx.compose.foundation.gestures;

import androidx.compose.foundation.OverscrollEffect;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.runtime.State;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.MotionDurationScale;
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.modifier.ModifierLocalKt;
import androidx.compose.ui.modifier.ProvidableModifierLocal;
import androidx.compose.ui.platform.InspectableValueKt;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001e\u0010\r\u001a\u00020\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\u0012\u001a\u00020\bH\u0002\u001a\u0015\u0010\u0013\u001a\u00020\u0014*\u00020\u0015H@ø\u0001\u0000¢\u0006\u0002\u0010\u0016\u001a\"\u0010\u0017\u001a\u00020\u0018*\u00020\u00182\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\u001a\u001a\u00020\u001bH\u0002\u001aO\u0010\u001c\u001a\u00020\u0018*\u00020\u00182\b\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\b2\u0006\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010%2\b\u0010&\u001a\u0004\u0018\u00010'2\u0006\u0010\u0012\u001a\u00020\bH\u0003¢\u0006\u0002\u0010(\u001aR\u0010)\u001a\u00020\u0018*\u00020\u00182\u0006\u0010*\u001a\u00020#2\u0006\u0010\u001f\u001a\u00020 2\b\u0010&\u001a\u0004\u0018\u00010'2\b\b\u0002\u0010\u0012\u001a\u00020\b2\b\b\u0002\u0010!\u001a\u00020\b2\n\b\u0002\u0010$\u001a\u0004\u0018\u00010%2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0007\u001aF\u0010)\u001a\u00020\u0018*\u00020\u00182\u0006\u0010*\u001a\u00020#2\u0006\u0010\u001f\u001a\u00020 2\b\b\u0002\u0010\u0012\u001a\u00020\b2\b\b\u0002\u0010!\u001a\u00020\b2\n\b\u0002\u0010$\u001a\u0004\u0018\u00010%2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001e\"\u0014\u0010\u0000\u001a\u00020\u0001X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0003\"\u000e\u0010\u0004\u001a\u00020\u0005XT¢\u0006\u0002\n\u0000\"\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\"\u000e\u0010\u000b\u001a\u00020\fX\u0004¢\u0006\u0002\n\u0000\u0002\u0004\n\u0002\b\u0019¨\u0006+"}, d2 = {"DefaultScrollMotionDurationScale", "Landroidx/compose/ui/MotionDurationScale;", "getDefaultScrollMotionDurationScale", "()Landroidx/compose/ui/MotionDurationScale;", "DefaultScrollMotionDurationScaleFactor", "", "ModifierLocalScrollableContainer", "Landroidx/compose/ui/modifier/ProvidableModifierLocal;", "", "getModifierLocalScrollableContainer", "()Landroidx/compose/ui/modifier/ProvidableModifierLocal;", "NoOpScrollScope", "Landroidx/compose/foundation/gestures/ScrollScope;", "scrollableNestedScrollConnection", "Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "scrollLogic", "Landroidx/compose/runtime/State;", "Landroidx/compose/foundation/gestures/ScrollingLogic;", "enabled", "awaitScrollEvent", "Landroidx/compose/ui/input/pointer/PointerEvent;", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;", "(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "mouseWheelScroll", "Landroidx/compose/ui/Modifier;", "scrollingLogicState", "mouseWheelScrollConfig", "Landroidx/compose/foundation/gestures/ScrollConfig;", "pointerScrollable", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "orientation", "Landroidx/compose/foundation/gestures/Orientation;", "reverseDirection", "controller", "Landroidx/compose/foundation/gestures/ScrollableState;", "flingBehavior", "Landroidx/compose/foundation/gestures/FlingBehavior;", "overscrollEffect", "Landroidx/compose/foundation/OverscrollEffect;", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/foundation/gestures/Orientation;ZLandroidx/compose/foundation/gestures/ScrollableState;Landroidx/compose/foundation/gestures/FlingBehavior;Landroidx/compose/foundation/OverscrollEffect;ZLandroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;", "scrollable", "state", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: Scrollable.kt */
public final class ScrollableKt {
    private static final MotionDurationScale DefaultScrollMotionDurationScale = new ScrollableKt$DefaultScrollMotionDurationScale$1();
    private static final float DefaultScrollMotionDurationScaleFactor = 1.0f;
    private static final ProvidableModifierLocal<Boolean> ModifierLocalScrollableContainer = ModifierLocalKt.modifierLocalOf(ScrollableKt$ModifierLocalScrollableContainer$1.INSTANCE);
    /* access modifiers changed from: private */
    public static final ScrollScope NoOpScrollScope = new ScrollableKt$NoOpScrollScope$1();

    public static final MotionDurationScale getDefaultScrollMotionDurationScale() {
        return DefaultScrollMotionDurationScale;
    }

    public static final ProvidableModifierLocal<Boolean> getModifierLocalScrollableContainer() {
        return ModifierLocalScrollableContainer;
    }

    public static /* synthetic */ Modifier scrollable$default(Modifier modifier, ScrollableState scrollableState, Orientation orientation, boolean z, boolean z2, FlingBehavior flingBehavior, MutableInteractionSource mutableInteractionSource, int i, Object obj) {
        if ((i & 4) != 0) {
            z = true;
        }
        boolean z3 = z;
        if ((i & 8) != 0) {
            z2 = false;
        }
        return scrollable(modifier, scrollableState, orientation, z3, z2, (i & 16) != 0 ? null : flingBehavior, (i & 32) != 0 ? null : mutableInteractionSource);
    }

    public static final Modifier scrollable(Modifier modifier, ScrollableState scrollableState, Orientation orientation, boolean z, boolean z2, FlingBehavior flingBehavior, MutableInteractionSource mutableInteractionSource) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        Intrinsics.checkNotNullParameter(scrollableState, "state");
        Intrinsics.checkNotNullParameter(orientation, "orientation");
        return scrollable(modifier, scrollableState, orientation, (OverscrollEffect) null, z, z2, flingBehavior, mutableInteractionSource);
    }

    public static /* synthetic */ Modifier scrollable$default(Modifier modifier, ScrollableState scrollableState, Orientation orientation, OverscrollEffect overscrollEffect, boolean z, boolean z2, FlingBehavior flingBehavior, MutableInteractionSource mutableInteractionSource, int i, Object obj) {
        return scrollable(modifier, scrollableState, orientation, overscrollEffect, (i & 8) != 0 ? true : z, (i & 16) != 0 ? false : z2, (i & 32) != 0 ? null : flingBehavior, (i & 64) != 0 ? null : mutableInteractionSource);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v0, resolved type: kotlin.jvm.functions.Function0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v0, resolved type: kotlin.jvm.functions.Function3} */
    /* access modifiers changed from: private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final androidx.compose.ui.Modifier pointerScrollable(androidx.compose.ui.Modifier r24, androidx.compose.foundation.interaction.MutableInteractionSource r25, androidx.compose.foundation.gestures.Orientation r26, boolean r27, androidx.compose.foundation.gestures.ScrollableState r28, androidx.compose.foundation.gestures.FlingBehavior r29, androidx.compose.foundation.OverscrollEffect r30, boolean r31, androidx.compose.runtime.Composer r32, int r33) {
        /*
            r0 = r32
            r1 = -2012025036(0xffffffff8812ef34, float:-4.421646E-34)
            r0.startReplaceableGroup(r1)
            java.lang.String r2 = "C(pointerScrollable)P(3,4,6!1,2,5)251@10630L53,252@10706L224,262@10964L88,265@11078L46,266@11148L22,274@11392L47,275@11465L160:Scrollable.kt#8bwon0"
            androidx.compose.runtime.ComposerKt.sourceInformation(r0, r2)
            boolean r2 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r2 == 0) goto L_0x001c
            r2 = -1
            java.lang.String r3 = "androidx.compose.foundation.gestures.pointerScrollable (Scrollable.kt:241)"
            r4 = r33
            androidx.compose.runtime.ComposerKt.traceEventStart(r1, r4, r2, r3)
        L_0x001c:
            r1 = -1730186281(0xffffffff98df73d7, float:-5.7761117E-24)
            r0.startReplaceableGroup(r1)
            java.lang.String r1 = "250@10581L15"
            androidx.compose.runtime.ComposerKt.sourceInformation(r0, r1)
            if (r29 != 0) goto L_0x0032
            androidx.compose.foundation.gestures.ScrollableDefaults r1 = androidx.compose.foundation.gestures.ScrollableDefaults.INSTANCE
            r2 = 6
            androidx.compose.foundation.gestures.FlingBehavior r1 = r1.flingBehavior(r0, r2)
            r7 = r1
            goto L_0x0034
        L_0x0032:
            r7 = r29
        L_0x0034:
            r32.endReplaceableGroup()
            r1 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r0.startReplaceableGroup(r1)
            java.lang.String r9 = "CC(remember):Composables.kt#9igjgp"
            androidx.compose.runtime.ComposerKt.sourceInformation(r0, r9)
            java.lang.Object r2 = r32.rememberedValue()
            androidx.compose.runtime.Composer$Companion r3 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r3 = r3.getEmpty()
            r10 = 0
            if (r2 != r3) goto L_0x005c
            androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher r2 = new androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher
            r2.<init>()
            r3 = 2
            androidx.compose.runtime.MutableState r2 = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(r2, r10, r3, r10)
            r0.updateRememberedValue(r2)
        L_0x005c:
            r32.endReplaceableGroup()
            r11 = r2
            androidx.compose.runtime.MutableState r11 = (androidx.compose.runtime.MutableState) r11
            androidx.compose.foundation.gestures.ScrollingLogic r12 = new androidx.compose.foundation.gestures.ScrollingLogic
            r5 = r11
            androidx.compose.runtime.State r5 = (androidx.compose.runtime.State) r5
            r2 = r12
            r3 = r26
            r4 = r27
            r6 = r28
            r8 = r30
            r2.<init>(r3, r4, r5, r6, r7, r8)
            r2 = 0
            androidx.compose.runtime.State r3 = androidx.compose.runtime.SnapshotStateKt.rememberUpdatedState(r12, r0, r2)
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r31)
            r5 = 1157296644(0x44faf204, float:2007.563)
            r0.startReplaceableGroup(r5)
            java.lang.String r6 = "CC(remember)P(1):Composables.kt#9igjgp"
            androidx.compose.runtime.ComposerKt.sourceInformation(r0, r6)
            boolean r4 = r0.changed((java.lang.Object) r4)
            java.lang.Object r7 = r32.rememberedValue()
            if (r4 != 0) goto L_0x009d
            androidx.compose.runtime.Composer$Companion r4 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r4 = r4.getEmpty()
            if (r7 != r4) goto L_0x009a
            goto L_0x009d
        L_0x009a:
            r4 = r31
            goto L_0x00a6
        L_0x009d:
            r4 = r31
            androidx.compose.ui.input.nestedscroll.NestedScrollConnection r7 = scrollableNestedScrollConnection(r3, r4)
            r0.updateRememberedValue(r7)
        L_0x00a6:
            r32.endReplaceableGroup()
            androidx.compose.ui.input.nestedscroll.NestedScrollConnection r7 = (androidx.compose.ui.input.nestedscroll.NestedScrollConnection) r7
            r0.startReplaceableGroup(r1)
            androidx.compose.runtime.ComposerKt.sourceInformation(r0, r9)
            java.lang.Object r1 = r32.rememberedValue()
            androidx.compose.runtime.Composer$Companion r8 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r8 = r8.getEmpty()
            if (r1 != r8) goto L_0x00c5
            androidx.compose.foundation.gestures.ScrollDraggableState r1 = new androidx.compose.foundation.gestures.ScrollDraggableState
            r1.<init>(r3)
            r0.updateRememberedValue(r1)
        L_0x00c5:
            r32.endReplaceableGroup()
            androidx.compose.foundation.gestures.ScrollDraggableState r1 = (androidx.compose.foundation.gestures.ScrollDraggableState) r1
            androidx.compose.foundation.gestures.ScrollConfig r2 = androidx.compose.foundation.gestures.AndroidScrollable_androidKt.platformScrollConfig(r0, r2)
            r13 = r1
            androidx.compose.foundation.gestures.DraggableState r13 = (androidx.compose.foundation.gestures.DraggableState) r13
            androidx.compose.foundation.gestures.ScrollableKt$pointerScrollable$1 r1 = androidx.compose.foundation.gestures.ScrollableKt$pointerScrollable$1.INSTANCE
            r14 = r1
            kotlin.jvm.functions.Function1 r14 = (kotlin.jvm.functions.Function1) r14
            r0.startReplaceableGroup(r5)
            androidx.compose.runtime.ComposerKt.sourceInformation(r0, r6)
            boolean r1 = r0.changed((java.lang.Object) r3)
            java.lang.Object r5 = r32.rememberedValue()
            if (r1 != 0) goto L_0x00ee
            androidx.compose.runtime.Composer$Companion r1 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r1 = r1.getEmpty()
            if (r5 != r1) goto L_0x00f9
        L_0x00ee:
            androidx.compose.foundation.gestures.ScrollableKt$pointerScrollable$2$1 r1 = new androidx.compose.foundation.gestures.ScrollableKt$pointerScrollable$2$1
            r1.<init>(r3)
            r5 = r1
            kotlin.jvm.functions.Function0 r5 = (kotlin.jvm.functions.Function0) r5
            r0.updateRememberedValue(r5)
        L_0x00f9:
            r32.endReplaceableGroup()
            r18 = r5
            kotlin.jvm.functions.Function0 r18 = (kotlin.jvm.functions.Function0) r18
            r19 = 0
            r1 = 511388516(0x1e7b2b64, float:1.3296802E-20)
            r0.startReplaceableGroup(r1)
            java.lang.String r1 = "CC(remember)P(1,2):Composables.kt#9igjgp"
            androidx.compose.runtime.ComposerKt.sourceInformation(r0, r1)
            boolean r1 = r0.changed((java.lang.Object) r11)
            boolean r5 = r0.changed((java.lang.Object) r3)
            r1 = r1 | r5
            java.lang.Object r5 = r32.rememberedValue()
            if (r1 != 0) goto L_0x0124
            androidx.compose.runtime.Composer$Companion r1 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r1 = r1.getEmpty()
            if (r5 != r1) goto L_0x012f
        L_0x0124:
            androidx.compose.foundation.gestures.ScrollableKt$pointerScrollable$3$1 r1 = new androidx.compose.foundation.gestures.ScrollableKt$pointerScrollable$3$1
            r1.<init>(r11, r3, r10)
            r5 = r1
            kotlin.jvm.functions.Function3 r5 = (kotlin.jvm.functions.Function3) r5
            r0.updateRememberedValue(r5)
        L_0x012f:
            r32.endReplaceableGroup()
            r20 = r5
            kotlin.jvm.functions.Function3 r20 = (kotlin.jvm.functions.Function3) r20
            r21 = 0
            r22 = 64
            r23 = 0
            r12 = r24
            r15 = r26
            r16 = r31
            r17 = r25
            androidx.compose.ui.Modifier r1 = androidx.compose.foundation.gestures.DraggableKt.draggable$default(r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
            androidx.compose.ui.Modifier r1 = mouseWheelScroll(r1, r3, r2)
            java.lang.Object r2 = r11.getValue()
            androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher r2 = (androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher) r2
            androidx.compose.ui.Modifier r1 = androidx.compose.ui.input.nestedscroll.NestedScrollModifierKt.nestedScroll(r1, r7, r2)
            boolean r2 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r2 == 0) goto L_0x015f
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L_0x015f:
            r32.endReplaceableGroup()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.ScrollableKt.pointerScrollable(androidx.compose.ui.Modifier, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.foundation.gestures.Orientation, boolean, androidx.compose.foundation.gestures.ScrollableState, androidx.compose.foundation.gestures.FlingBehavior, androidx.compose.foundation.OverscrollEffect, boolean, androidx.compose.runtime.Composer, int):androidx.compose.ui.Modifier");
    }

    private static final Modifier mouseWheelScroll(Modifier modifier, State<ScrollingLogic> state, ScrollConfig scrollConfig) {
        return SuspendingPointerInputFilterKt.pointerInput(modifier, state, scrollConfig, new ScrollableKt$mouseWheelScroll$1(scrollConfig, state, (Continuation<? super ScrollableKt$mouseWheelScroll$1>) null));
    }

    /* access modifiers changed from: private */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0045 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0058 A[RETURN] */
    public static final java.lang.Object awaitScrollEvent(androidx.compose.ui.input.pointer.AwaitPointerEventScope r5, kotlin.coroutines.Continuation<? super androidx.compose.ui.input.pointer.PointerEvent> r6) {
        /*
            boolean r0 = r6 instanceof androidx.compose.foundation.gestures.ScrollableKt$awaitScrollEvent$1
            if (r0 == 0) goto L_0x0014
            r0 = r6
            androidx.compose.foundation.gestures.ScrollableKt$awaitScrollEvent$1 r0 = (androidx.compose.foundation.gestures.ScrollableKt$awaitScrollEvent$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L_0x0014
            int r6 = r0.label
            int r6 = r6 - r2
            r0.label = r6
            goto L_0x0019
        L_0x0014:
            androidx.compose.foundation.gestures.ScrollableKt$awaitScrollEvent$1 r0 = new androidx.compose.foundation.gestures.ScrollableKt$awaitScrollEvent$1
            r0.<init>(r6)
        L_0x0019:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0037
            if (r2 != r3) goto L_0x002e
            java.lang.Object r5 = r0.L$0
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r5 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r5
            kotlin.ResultKt.throwOnFailure(r6)
            goto L_0x0046
        L_0x002e:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0037:
            kotlin.ResultKt.throwOnFailure(r6)
        L_0x003a:
            r0.L$0 = r5
            r0.label = r3
            r6 = 0
            java.lang.Object r6 = androidx.compose.ui.input.pointer.AwaitPointerEventScope.awaitPointerEvent$default(r5, r6, r0, r3, r6)
            if (r6 != r1) goto L_0x0046
            return r1
        L_0x0046:
            androidx.compose.ui.input.pointer.PointerEvent r6 = (androidx.compose.ui.input.pointer.PointerEvent) r6
            int r2 = r6.m4269getType7fucELk()
            androidx.compose.ui.input.pointer.PointerEventType$Companion r4 = androidx.compose.ui.input.pointer.PointerEventType.Companion
            int r4 = r4.m4285getScroll7fucELk()
            boolean r2 = androidx.compose.ui.input.pointer.PointerEventType.m4276equalsimpl0(r2, r4)
            if (r2 == 0) goto L_0x003a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.ScrollableKt.awaitScrollEvent(androidx.compose.ui.input.pointer.AwaitPointerEventScope, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* access modifiers changed from: private */
    public static final NestedScrollConnection scrollableNestedScrollConnection(State<ScrollingLogic> state, boolean z) {
        return new ScrollableKt$scrollableNestedScrollConnection$1(state, z);
    }

    public static final Modifier scrollable(Modifier modifier, ScrollableState scrollableState, Orientation orientation, OverscrollEffect overscrollEffect, boolean z, boolean z2, FlingBehavior flingBehavior, MutableInteractionSource mutableInteractionSource) {
        Modifier modifier2 = modifier;
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        ScrollableState scrollableState2 = scrollableState;
        Intrinsics.checkNotNullParameter(scrollableState, "state");
        Orientation orientation2 = orientation;
        Intrinsics.checkNotNullParameter(orientation, "orientation");
        return ComposedModifierKt.composed(modifier, InspectableValueKt.isDebugInspectorInfoEnabled() ? new ScrollableKt$scrollable$$inlined$debugInspectorInfo$1(orientation, scrollableState, overscrollEffect, z, z2, flingBehavior, mutableInteractionSource) : InspectableValueKt.getNoInspectorInfo(), new ScrollableKt$scrollable$2(orientation, scrollableState, z2, mutableInteractionSource, flingBehavior, overscrollEffect, z));
    }
}
