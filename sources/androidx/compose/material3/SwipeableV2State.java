package androidx.compose.material3;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.gestures.DraggableState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotMutationPolicy;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.compose.ui.unit.Density;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.CoroutineScopeKt;

@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b5\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u0000 s*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001sB\u0012\u0006\u0010\u0003\u001a\u00028\u0000\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012#\b\u0002\u0010\u0007\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\f0\b\u0012.\b\u0002\u0010\r\u001a(\u0012\u0004\u0012\u00020\u000f\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u0010\u0012\u0004\u0012\u00020\u00060\u000e¢\u0006\u0002\b\u0011\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0013ø\u0001\u0000¢\u0006\u0002\u0010\u0014J#\u0010V\u001a\u00020W2\u0006\u0010Q\u001a\u00028\u00002\b\b\u0002\u0010X\u001a\u00020\u0006H@ø\u0001\u0000¢\u0006\u0002\u0010YJ%\u0010Z\u001a\u00028\u00002\u0006\u0010@\u001a\u00020\u00062\u0006\u0010(\u001a\u00028\u00002\u0006\u0010X\u001a\u00020\u0006H\u0002¢\u0006\u0002\u0010[J\u000e\u0010\\\u001a\u00020\u00062\u0006\u0010]\u001a\u00020\u0006J\u0013\u0010^\u001a\u00020\f2\u0006\u0010_\u001a\u00028\u0000¢\u0006\u0002\u0010`J\b\u0010a\u001a\u00020\u000fH\u0002J\u0006\u0010b\u001a\u00020\u0006J\u0019\u0010c\u001a\u00020W2\u0006\u0010X\u001a\u00020\u0006H@ø\u0001\u0000¢\u0006\u0002\u0010dJ\u0015\u0010e\u001a\u00020W2\u0006\u0010Q\u001a\u00028\u0000H\u0002¢\u0006\u0002\u0010$J\u0019\u0010f\u001a\u00020W2\u0006\u0010Q\u001a\u00028\u0000H@ø\u0001\u0000¢\u0006\u0002\u0010gJ9\u0010h\u001a\u00020W2\b\b\u0002\u0010i\u001a\u00020j2\u001c\u0010k\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020W0l\u0012\u0006\u0012\u0004\u0018\u00010\u00020\bH@ø\u0001\u0000¢\u0006\u0002\u0010mJ\u0017\u0010n\u001a\u00020\f2\u0006\u0010Q\u001a\u00028\u0000H\u0000¢\u0006\u0004\bo\u0010`J!\u0010p\u001a\u00020\f2\u0012\u0010q\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00060\u0016H\u0000¢\u0006\u0002\brRC\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00060\u00162\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00060\u00168@@@X\u0002¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR/\u0010 \u001a\u0004\u0018\u00018\u00002\b\u0010\u0015\u001a\u0004\u0018\u00018\u00008B@BX\u0002¢\u0006\u0012\n\u0004\b%\u0010\u001d\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R/\u0010\u0007\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\f0\bX\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R+\u0010(\u001a\u00028\u00002\u0006\u0010\u0015\u001a\u00028\u00008F@BX\u0002¢\u0006\u0012\n\u0004\b+\u0010\u001d\u001a\u0004\b)\u0010\"\"\u0004\b*\u0010$R\u001c\u0010,\u001a\u0004\u0018\u00010\u000fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\u0011\u00101\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b1\u00102R+\u00103\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u00068F@BX\u0002¢\u0006\u0012\n\u0004\b8\u0010\u001d\u001a\u0004\b4\u00105\"\u0004\b6\u00107R\u001b\u00109\u001a\u00020\u00068FX\u0002¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b:\u00105R\u001b\u0010=\u001a\u00020\u00068FX\u0002¢\u0006\f\n\u0004\b?\u0010<\u001a\u0004\b>\u00105R/\u0010@\u001a\u0004\u0018\u00010\u00062\b\u0010\u0015\u001a\u0004\u0018\u00010\u00068F@BX\u0002¢\u0006\u0012\n\u0004\bE\u0010\u001d\u001a\u0004\bA\u0010B\"\u0004\bC\u0010DR:\u0010\r\u001a(\u0012\u0004\u0012\u00020\u000f\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u0010\u0012\u0004\u0012\u00020\u00060\u000e¢\u0006\u0002\b\u0011X\u0004¢\u0006\b\n\u0000\u001a\u0004\bF\u0010GR\u001b\u0010H\u001a\u00020\u00068FX\u0002¢\u0006\f\n\u0004\bJ\u0010<\u001a\u0004\bI\u00105R\u0014\u0010K\u001a\u00020LX\u0004¢\u0006\b\n\u0000\u001a\u0004\bM\u0010NR\u000e\u0010O\u001a\u00020PX\u0004¢\u0006\u0002\n\u0000R\u001b\u0010Q\u001a\u00028\u00008FX\u0002¢\u0006\f\n\u0004\bS\u0010<\u001a\u0004\bR\u0010\"R\u001f\u0010\u0012\u001a\u00020\u0013X\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010U\u001a\u0004\bT\u00105\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006t"}, d2 = {"Landroidx/compose/material3/SwipeableV2State;", "T", "", "initialValue", "animationSpec", "Landroidx/compose/animation/core/AnimationSpec;", "", "confirmValueChange", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "newValue", "", "positionalThreshold", "Lkotlin/Function2;", "Landroidx/compose/ui/unit/Density;", "totalDistance", "Lkotlin/ExtensionFunctionType;", "velocityThreshold", "Landroidx/compose/ui/unit/Dp;", "(Ljava/lang/Object;Landroidx/compose/animation/core/AnimationSpec;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;FLkotlin/jvm/internal/DefaultConstructorMarker;)V", "<set-?>", "", "anchors", "getAnchors$material3_release", "()Ljava/util/Map;", "setAnchors$material3_release", "(Ljava/util/Map;)V", "anchors$delegate", "Landroidx/compose/runtime/MutableState;", "getAnimationSpec$material3_release", "()Landroidx/compose/animation/core/AnimationSpec;", "animationTarget", "getAnimationTarget", "()Ljava/lang/Object;", "setAnimationTarget", "(Ljava/lang/Object;)V", "animationTarget$delegate", "getConfirmValueChange$material3_release", "()Lkotlin/jvm/functions/Function1;", "currentValue", "getCurrentValue", "setCurrentValue", "currentValue$delegate", "density", "getDensity$material3_release", "()Landroidx/compose/ui/unit/Density;", "setDensity$material3_release", "(Landroidx/compose/ui/unit/Density;)V", "isAnimationRunning", "()Z", "lastVelocity", "getLastVelocity", "()F", "setLastVelocity", "(F)V", "lastVelocity$delegate", "maxOffset", "getMaxOffset", "maxOffset$delegate", "Landroidx/compose/runtime/State;", "minOffset", "getMinOffset", "minOffset$delegate", "offset", "getOffset", "()Ljava/lang/Float;", "setOffset", "(Ljava/lang/Float;)V", "offset$delegate", "getPositionalThreshold$material3_release", "()Lkotlin/jvm/functions/Function2;", "progress", "getProgress", "progress$delegate", "swipeDraggableState", "Landroidx/compose/foundation/gestures/DraggableState;", "getSwipeDraggableState$material3_release", "()Landroidx/compose/foundation/gestures/DraggableState;", "swipeMutex", "Landroidx/compose/material3/InternalMutatorMutex;", "targetValue", "getTargetValue", "targetValue$delegate", "getVelocityThreshold-D9Ej5fM$material3_release", "F", "animateTo", "", "velocity", "(Ljava/lang/Object;FLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "computeTarget", "(FLjava/lang/Object;F)Ljava/lang/Object;", "dispatchRawDelta", "delta", "hasAnchorForValue", "value", "(Ljava/lang/Object;)Z", "requireDensity", "requireOffset", "settle", "(FLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "snap", "snapTo", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "swipe", "swipePriority", "Landroidx/compose/foundation/MutatePriority;", "action", "Lkotlin/coroutines/Continuation;", "(Landroidx/compose/foundation/MutatePriority;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "trySnapTo", "trySnapTo$material3_release", "updateAnchors", "newAnchors", "updateAnchors$material3_release", "Companion", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* compiled from: SwipeableV2.kt */
public final class SwipeableV2State<T> {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private final MutableState anchors$delegate;
    private final AnimationSpec<Float> animationSpec;
    private final MutableState animationTarget$delegate;
    private final Function1<T, Boolean> confirmValueChange;
    private final MutableState currentValue$delegate;
    private Density density;
    private final MutableState lastVelocity$delegate;
    private final State maxOffset$delegate;
    private final State minOffset$delegate;
    private final MutableState offset$delegate;
    private final Function2<Density, Float, Float> positionalThreshold;
    private final State progress$delegate;
    private final DraggableState swipeDraggableState;
    /* access modifiers changed from: private */
    public final InternalMutatorMutex swipeMutex;
    private final State targetValue$delegate;
    private final float velocityThreshold;

    public /* synthetic */ SwipeableV2State(Object obj, AnimationSpec animationSpec2, Function1 function1, Function2 function2, float f, DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, animationSpec2, function1, function2, f);
    }

    public final AnimationSpec<Float> getAnimationSpec$material3_release() {
        return this.animationSpec;
    }

    public final Function1<T, Boolean> getConfirmValueChange$material3_release() {
        return this.confirmValueChange;
    }

    public final Density getDensity$material3_release() {
        return this.density;
    }

    public final Function2<Density, Float, Float> getPositionalThreshold$material3_release() {
        return this.positionalThreshold;
    }

    public final DraggableState getSwipeDraggableState$material3_release() {
        return this.swipeDraggableState;
    }

    /* renamed from: getVelocityThreshold-D9Ej5fM$material3_release  reason: not valid java name */
    public final float m1665getVelocityThresholdD9Ej5fM$material3_release() {
        return this.velocityThreshold;
    }

    public final void setDensity$material3_release(Density density2) {
        this.density = density2;
    }

    private SwipeableV2State(T t, AnimationSpec<Float> animationSpec2, Function1<? super T, Boolean> function1, Function2<? super Density, ? super Float, Float> function2, float f) {
        Intrinsics.checkNotNullParameter(animationSpec2, "animationSpec");
        Intrinsics.checkNotNullParameter(function1, "confirmValueChange");
        Intrinsics.checkNotNullParameter(function2, "positionalThreshold");
        this.animationSpec = animationSpec2;
        this.confirmValueChange = function1;
        this.positionalThreshold = function2;
        this.velocityThreshold = f;
        this.swipeMutex = new InternalMutatorMutex();
        this.swipeDraggableState = new SwipeableV2State$swipeDraggableState$1(this);
        this.currentValue$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(t, (SnapshotMutationPolicy) null, 2, (Object) null);
        this.targetValue$delegate = SnapshotStateKt.derivedStateOf(new SwipeableV2State$targetValue$2(this));
        this.offset$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default((Object) null, (SnapshotMutationPolicy) null, 2, (Object) null);
        this.progress$delegate = SnapshotStateKt.derivedStateOf(new SwipeableV2State$progress$2(this));
        this.lastVelocity$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Float.valueOf(0.0f), (SnapshotMutationPolicy) null, 2, (Object) null);
        this.minOffset$delegate = SnapshotStateKt.derivedStateOf(new SwipeableV2State$minOffset$2(this));
        this.maxOffset$delegate = SnapshotStateKt.derivedStateOf(new SwipeableV2State$maxOffset$2(this));
        this.animationTarget$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default((Object) null, (SnapshotMutationPolicy) null, 2, (Object) null);
        this.anchors$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(MapsKt.emptyMap(), (SnapshotMutationPolicy) null, 2, (Object) null);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SwipeableV2State(Object obj, AnimationSpec animationSpec2, Function1 function1, Function2<Density, Float, Float> function2, float f, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, (i & 2) != 0 ? SwipeableV2Defaults.INSTANCE.getAnimationSpec() : animationSpec2, (i & 4) != 0 ? AnonymousClass1.INSTANCE : function1, (i & 8) != 0 ? SwipeableV2Defaults.INSTANCE.getPositionalThreshold() : function2, (i & 16) != 0 ? SwipeableV2Defaults.INSTANCE.m1662getVelocityThresholdD9Ej5fM() : f, (DefaultConstructorMarker) null);
    }

    public final T getCurrentValue() {
        return this.currentValue$delegate.getValue();
    }

    public final Float getOffset() {
        return (Float) this.offset$delegate.getValue();
    }

    public final float requireOffset() {
        Float offset = getOffset();
        if (offset != null) {
            return offset.floatValue();
        }
        throw new IllegalStateException("The offset was read before being initialized. Did you access the offset in a phase before layout, like effects or composition?".toString());
    }

    public final boolean isAnimationRunning() {
        return getAnimationTarget() != null;
    }

    /* access modifiers changed from: private */
    public final void setLastVelocity(float f) {
        this.lastVelocity$delegate.setValue(Float.valueOf(f));
    }

    public final float getLastVelocity() {
        return ((Number) this.lastVelocity$delegate.getValue()).floatValue();
    }

    /* access modifiers changed from: private */
    public final T getAnimationTarget() {
        return this.animationTarget$delegate.getValue();
    }

    public final Map<T, Float> getAnchors$material3_release() {
        return (Map) this.anchors$delegate.getValue();
    }

    public final boolean updateAnchors$material3_release(Map<T, Float> map) {
        Intrinsics.checkNotNullParameter(map, "newAnchors");
        boolean isEmpty = getAnchors$material3_release().isEmpty();
        setAnchors$material3_release(map);
        if (isEmpty) {
            Object currentValue = getCurrentValue();
            boolean z = ((Float) getAnchors$material3_release().get(currentValue)) != null;
            if (z) {
                trySnapTo$material3_release(currentValue);
            }
            if (!z) {
                return true;
            }
        }
        if (!isEmpty) {
            return true;
        }
        return false;
    }

    public final boolean hasAnchorForValue(T t) {
        return getAnchors$material3_release().containsKey(t);
    }

    public final Object snapTo(T t, Continuation<? super Unit> continuation) {
        Object swipe$default = swipe$default(this, (MutatePriority) null, new SwipeableV2State$snapTo$2(this, t, (Continuation<? super SwipeableV2State$snapTo$2>) null), continuation, 1, (Object) null);
        return swipe$default == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? swipe$default : Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v8, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v7, resolved type: androidx.compose.material3.SwipeableV2State} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0042  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x008e  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00ae  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00b4  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00a9 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object animateTo(T r15, float r16, kotlin.coroutines.Continuation<? super kotlin.Unit> r17) {
        /*
            r14 = this;
            r7 = r14
            r0 = r17
            boolean r1 = r0 instanceof androidx.compose.material3.SwipeableV2State$animateTo$1
            if (r1 == 0) goto L_0x0017
            r1 = r0
            androidx.compose.material3.SwipeableV2State$animateTo$1 r1 = (androidx.compose.material3.SwipeableV2State$animateTo$1) r1
            int r2 = r1.label
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r2 & r3
            if (r2 == 0) goto L_0x0017
            int r0 = r1.label
            int r0 = r0 - r3
            r1.label = r0
            goto L_0x001c
        L_0x0017:
            androidx.compose.material3.SwipeableV2State$animateTo$1 r1 = new androidx.compose.material3.SwipeableV2State$animateTo$1
            r1.<init>(r14, r0)
        L_0x001c:
            r0 = r1
            java.lang.Object r1 = r0.result
            java.lang.Object r8 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r9 = 1056964608(0x3f000000, float:0.5)
            r10 = 1
            r11 = 0
            if (r2 == 0) goto L_0x0042
            if (r2 != r10) goto L_0x0039
            java.lang.Object r0 = r0.L$0
            r2 = r0
            androidx.compose.material3.SwipeableV2State r2 = (androidx.compose.material3.SwipeableV2State) r2
            kotlin.ResultKt.throwOnFailure(r1)     // Catch:{ all -> 0x0036 }
            goto L_0x0073
        L_0x0036:
            r0 = move-exception
            goto L_0x00be
        L_0x0039:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0042:
            kotlin.ResultKt.throwOnFailure(r1)
            java.util.Map r1 = r14.getAnchors$material3_release()
            r3 = r15
            java.lang.Object r1 = r1.get(r15)
            r4 = r1
            java.lang.Float r4 = (java.lang.Float) r4
            if (r4 == 0) goto L_0x0107
            r12 = 0
            androidx.compose.material3.SwipeableV2State$animateTo$2 r13 = new androidx.compose.material3.SwipeableV2State$animateTo$2     // Catch:{ all -> 0x00bc }
            r6 = 0
            r1 = r13
            r2 = r14
            r3 = r15
            r5 = r16
            r1.<init>(r2, r3, r4, r5, r6)     // Catch:{ all -> 0x00bc }
            r3 = r13
            kotlin.jvm.functions.Function1 r3 = (kotlin.jvm.functions.Function1) r3     // Catch:{ all -> 0x00bc }
            r5 = 1
            r6 = 0
            r0.L$0 = r7     // Catch:{ all -> 0x00bc }
            r0.label = r10     // Catch:{ all -> 0x00bc }
            r1 = r14
            r2 = r12
            r4 = r0
            java.lang.Object r0 = swipe$default(r1, r2, r3, r4, r5, r6)     // Catch:{ all -> 0x00bc }
            if (r0 != r8) goto L_0x0072
            return r8
        L_0x0072:
            r2 = r7
        L_0x0073:
            r2.setAnimationTarget(r11)
            float r0 = r2.requireOffset()
            java.util.Map r1 = r2.getAnchors$material3_release()
            java.util.Set r1 = r1.entrySet()
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.Iterator r1 = r1.iterator()
        L_0x0088:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x00a9
            java.lang.Object r3 = r1.next()
            r4 = r3
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4
            java.lang.Object r4 = r4.getValue()
            java.lang.Number r4 = (java.lang.Number) r4
            float r4 = r4.floatValue()
            float r4 = r4 - r0
            float r4 = java.lang.Math.abs(r4)
            int r4 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
            if (r4 >= 0) goto L_0x0088
            goto L_0x00aa
        L_0x00a9:
            r3 = r11
        L_0x00aa:
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            if (r3 == 0) goto L_0x00b2
            java.lang.Object r11 = r3.getKey()
        L_0x00b2:
            if (r11 != 0) goto L_0x00b8
            java.lang.Object r11 = r2.getCurrentValue()
        L_0x00b8:
            r2.setCurrentValue(r11)
            goto L_0x010a
        L_0x00bc:
            r0 = move-exception
            r2 = r7
        L_0x00be:
            r2.setAnimationTarget(r11)
            float r1 = r2.requireOffset()
            java.util.Map r3 = r2.getAnchors$material3_release()
            java.util.Set r3 = r3.entrySet()
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            java.util.Iterator r3 = r3.iterator()
        L_0x00d3:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x00f4
            java.lang.Object r4 = r3.next()
            r5 = r4
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            java.lang.Object r5 = r5.getValue()
            java.lang.Number r5 = (java.lang.Number) r5
            float r5 = r5.floatValue()
            float r5 = r5 - r1
            float r5 = java.lang.Math.abs(r5)
            int r5 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r5 >= 0) goto L_0x00d3
            goto L_0x00f5
        L_0x00f4:
            r4 = r11
        L_0x00f5:
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4
            if (r4 == 0) goto L_0x00fd
            java.lang.Object r11 = r4.getKey()
        L_0x00fd:
            if (r11 != 0) goto L_0x0103
            java.lang.Object r11 = r2.getCurrentValue()
        L_0x0103:
            r2.setCurrentValue(r11)
            throw r0
        L_0x0107:
            r14.setCurrentValue(r15)
        L_0x010a:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.SwipeableV2State.animateTo(java.lang.Object, float, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static /* synthetic */ Object animateTo$default(SwipeableV2State swipeableV2State, Object obj, float f, Continuation continuation, int i, Object obj2) {
        if ((i & 2) != 0) {
            f = swipeableV2State.getLastVelocity();
        }
        return swipeableV2State.animateTo(obj, f, continuation);
    }

    public final Object settle(float f, Continuation<? super Unit> continuation) {
        Object currentValue = getCurrentValue();
        Object computeTarget = computeTarget(requireOffset(), currentValue, f);
        if (this.confirmValueChange.invoke(computeTarget).booleanValue()) {
            Object animateTo = animateTo(computeTarget, f, continuation);
            return animateTo == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? animateTo : Unit.INSTANCE;
        }
        Object animateTo2 = animateTo(currentValue, f, continuation);
        return animateTo2 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? animateTo2 : Unit.INSTANCE;
    }

    public final float dispatchRawDelta(float f) {
        Float offset = getOffset();
        float f2 = 0.0f;
        float floatValue = offset != null ? offset.floatValue() : 0.0f;
        float coerceIn = RangesKt.coerceIn(f + floatValue, getMinOffset(), getMaxOffset()) - floatValue;
        if (Math.abs(coerceIn) >= 0.0f) {
            Float offset2 = getOffset();
            if (offset2 != null) {
                f2 = offset2.floatValue();
            }
            setOffset(Float.valueOf(RangesKt.coerceIn(f2 + coerceIn, getMinOffset(), getMaxOffset())));
        }
        return coerceIn;
    }

    /* access modifiers changed from: private */
    public final T computeTarget(float f, T t, float f2) {
        T access$closestAnchor;
        Map anchors$material3_release = getAnchors$material3_release();
        Float f3 = (Float) anchors$material3_release.get(t);
        Density requireDensity = requireDensity();
        float r3 = requireDensity.m5607toPx0680j_4(this.velocityThreshold);
        if (Intrinsics.areEqual(f3, f) || f3 == null) {
            return t;
        }
        if (f3.floatValue() < f) {
            if (f2 >= r3) {
                return SwipeableV2Kt.closestAnchor(anchors$material3_release, f, true);
            }
            access$closestAnchor = SwipeableV2Kt.closestAnchor(anchors$material3_release, f, true);
            if (f < Math.abs(f3.floatValue() + Math.abs(this.positionalThreshold.invoke(requireDensity, Float.valueOf(Math.abs(((Number) MapsKt.getValue(anchors$material3_release, access$closestAnchor)).floatValue() - f3.floatValue()))).floatValue()))) {
                return t;
            }
        } else if (f2 <= (-r3)) {
            return SwipeableV2Kt.closestAnchor(anchors$material3_release, f, false);
        } else {
            access$closestAnchor = SwipeableV2Kt.closestAnchor(anchors$material3_release, f, false);
            float abs = Math.abs(f3.floatValue() - Math.abs(this.positionalThreshold.invoke(requireDensity, Float.valueOf(Math.abs(f3.floatValue() - ((Number) MapsKt.getValue(anchors$material3_release, access$closestAnchor)).floatValue()))).floatValue()));
            if (f < 0.0f) {
                if (Math.abs(f) < abs) {
                    return t;
                }
            } else if (f > abs) {
                return t;
            }
        }
        return access$closestAnchor;
    }

    private final Density requireDensity() {
        Density density2 = this.density;
        if (density2 != null) {
            return density2;
        }
        throw new IllegalArgumentException(("SwipeableState did not have a density attached. Are you using Modifier.swipeable with this=" + this + " SwipeableState?").toString());
    }

    static /* synthetic */ Object swipe$default(SwipeableV2State swipeableV2State, MutatePriority mutatePriority, Function1 function1, Continuation continuation, int i, Object obj) {
        if ((i & 1) != 0) {
            mutatePriority = MutatePriority.Default;
        }
        return swipeableV2State.swipe(mutatePriority, function1, continuation);
    }

    /* access modifiers changed from: private */
    public final Object swipe(MutatePriority mutatePriority, Function1<? super Continuation<? super Unit>, ? extends Object> function1, Continuation<? super Unit> continuation) {
        Object coroutineScope = CoroutineScopeKt.coroutineScope(new SwipeableV2State$swipe$2(this, mutatePriority, function1, (Continuation<? super SwipeableV2State$swipe$2>) null), continuation);
        return coroutineScope == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? coroutineScope : Unit.INSTANCE;
    }

    public final boolean trySnapTo$material3_release(T t) {
        return this.swipeMutex.tryMutate(new SwipeableV2State$trySnapTo$1(this, t));
    }

    /* access modifiers changed from: private */
    public final void snap(T t) {
        Float f = (Float) getAnchors$material3_release().get(t);
        if (f != null) {
            float floatValue = f.floatValue();
            Float offset = getOffset();
            dispatchRawDelta(floatValue - (offset != null ? offset.floatValue() : 0.0f));
            setCurrentValue(t);
            setAnimationTarget((Object) null);
            return;
        }
        setCurrentValue(t);
    }

    @Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0001\u0010\u0003\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00060\u0005\u0012\u0004\u0012\u0002H\u00060\u0004\"\b\b\u0001\u0010\u0006*\u00020\u00012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u0002H\u0006\u0012\u0004\u0012\u00020\f0\u000b2,\u0010\r\u001a(\u0012\u0004\u0012\u00020\u000f\u0012\u0013\u0012\u00110\t¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0012\u0012\u0004\u0012\u00020\t0\u000e¢\u0006\u0002\b\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0016\u0010\u0017\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0018"}, d2 = {"Landroidx/compose/material3/SwipeableV2State$Companion;", "", "()V", "Saver", "Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/material3/SwipeableV2State;", "T", "animationSpec", "Landroidx/compose/animation/core/AnimationSpec;", "", "confirmValueChange", "Lkotlin/Function1;", "", "positionalThreshold", "Lkotlin/Function2;", "Landroidx/compose/ui/unit/Density;", "Lkotlin/ParameterName;", "name", "distance", "Lkotlin/ExtensionFunctionType;", "velocityThreshold", "Landroidx/compose/ui/unit/Dp;", "Saver-eqLRuRQ", "(Landroidx/compose/animation/core/AnimationSpec;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;F)Landroidx/compose/runtime/saveable/Saver;", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* compiled from: SwipeableV2.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* renamed from: Saver-eqLRuRQ  reason: not valid java name */
        public final <T> Saver<SwipeableV2State<T>, T> m1666SavereqLRuRQ(AnimationSpec<Float> animationSpec, Function1<? super T, Boolean> function1, Function2<? super Density, ? super Float, Float> function2, float f) {
            Intrinsics.checkNotNullParameter(animationSpec, "animationSpec");
            Intrinsics.checkNotNullParameter(function1, "confirmValueChange");
            Intrinsics.checkNotNullParameter(function2, "positionalThreshold");
            return SaverKt.Saver(SwipeableV2State$Companion$Saver$1.INSTANCE, new SwipeableV2State$Companion$Saver$2(animationSpec, function1, function2, f));
        }
    }

    private final void setCurrentValue(T t) {
        this.currentValue$delegate.setValue(t);
    }

    public final T getTargetValue() {
        return this.targetValue$delegate.getValue();
    }

    /* access modifiers changed from: private */
    public final void setOffset(Float f) {
        this.offset$delegate.setValue(f);
    }

    public final float getProgress() {
        return ((Number) this.progress$delegate.getValue()).floatValue();
    }

    public final float getMinOffset() {
        return ((Number) this.minOffset$delegate.getValue()).floatValue();
    }

    public final float getMaxOffset() {
        return ((Number) this.maxOffset$delegate.getValue()).floatValue();
    }

    /* access modifiers changed from: private */
    public final void setAnimationTarget(T t) {
        this.animationTarget$delegate.setValue(t);
    }

    public final void setAnchors$material3_release(Map<T, Float> map) {
        Intrinsics.checkNotNullParameter(map, "<set-?>");
        this.anchors$delegate.setValue(map);
    }
}
