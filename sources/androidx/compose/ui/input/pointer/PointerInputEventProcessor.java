package androidx.compose.ui.input.pointer;

import androidx.compose.ui.node.HitTestResult;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.PointerInputModifierNode;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J0\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u000bø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0006\u0010\u0019\u001a\u00020\u001aR\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u001b"}, d2 = {"Landroidx/compose/ui/input/pointer/PointerInputEventProcessor;", "", "root", "Landroidx/compose/ui/node/LayoutNode;", "(Landroidx/compose/ui/node/LayoutNode;)V", "hitPathTracker", "Landroidx/compose/ui/input/pointer/HitPathTracker;", "hitResult", "Landroidx/compose/ui/node/HitTestResult;", "Landroidx/compose/ui/node/PointerInputModifierNode;", "isProcessing", "", "pointerInputChangeEventProducer", "Landroidx/compose/ui/input/pointer/PointerInputChangeEventProducer;", "getRoot", "()Landroidx/compose/ui/node/LayoutNode;", "process", "Landroidx/compose/ui/input/pointer/ProcessResult;", "pointerEvent", "Landroidx/compose/ui/input/pointer/PointerInputEvent;", "positionCalculator", "Landroidx/compose/ui/input/pointer/PositionCalculator;", "isInBounds", "process-BIzXfog", "(Landroidx/compose/ui/input/pointer/PointerInputEvent;Landroidx/compose/ui/input/pointer/PositionCalculator;Z)I", "processCancel", "", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* compiled from: PointerInputEventProcessor.kt */
public final class PointerInputEventProcessor {
    private final HitPathTracker hitPathTracker;
    private final HitTestResult<PointerInputModifierNode> hitResult = new HitTestResult<>();
    private boolean isProcessing;
    private final PointerInputChangeEventProducer pointerInputChangeEventProducer = new PointerInputChangeEventProducer();
    private final LayoutNode root;

    public final LayoutNode getRoot() {
        return this.root;
    }

    public PointerInputEventProcessor(LayoutNode layoutNode) {
        Intrinsics.checkNotNullParameter(layoutNode, "root");
        this.root = layoutNode;
        this.hitPathTracker = new HitPathTracker(layoutNode.getCoordinates());
    }

    /* renamed from: process-BIzXfog$default  reason: not valid java name */
    public static /* synthetic */ int m4342processBIzXfog$default(PointerInputEventProcessor pointerInputEventProcessor, PointerInputEvent pointerInputEvent, PositionCalculator positionCalculator, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = true;
        }
        return pointerInputEventProcessor.m4343processBIzXfog(pointerInputEvent, positionCalculator, z);
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0047 A[Catch:{ all -> 0x010a }] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0070 A[Catch:{ all -> 0x010a }] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00cf A[Catch:{ all -> 0x010a }] */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x005b A[EDGE_INSN: B:52:0x005b->B:19:0x005b ?: BREAK  , SYNTHETIC] */
    /* renamed from: process-BIzXfog  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int m4343processBIzXfog(androidx.compose.ui.input.pointer.PointerInputEvent r18, androidx.compose.ui.input.pointer.PositionCalculator r19, boolean r20) {
        /*
            r17 = this;
            r1 = r17
            r0 = r18
            r2 = r19
            java.lang.String r3 = "pointerEvent"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r3)
            java.lang.String r3 = "positionCalculator"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r3)
            boolean r3 = r1.isProcessing
            r4 = 0
            if (r3 == 0) goto L_0x001c
            int r0 = androidx.compose.ui.input.pointer.PointerInputEventProcessorKt.ProcessResult(r4, r4)
            return r0
        L_0x001c:
            r3 = 1
            r1.isProcessing = r3     // Catch:{ all -> 0x010a }
            androidx.compose.ui.input.pointer.PointerInputChangeEventProducer r5 = r1.pointerInputChangeEventProducer     // Catch:{ all -> 0x010a }
            androidx.compose.ui.input.pointer.InternalPointerEvent r0 = r5.produce(r0, r2)     // Catch:{ all -> 0x010a }
            java.util.Map r2 = r0.getChanges()     // Catch:{ all -> 0x010a }
            java.util.Collection r2 = r2.values()     // Catch:{ all -> 0x010a }
            java.lang.Iterable r2 = (java.lang.Iterable) r2     // Catch:{ all -> 0x010a }
            boolean r5 = r2 instanceof java.util.Collection     // Catch:{ all -> 0x010a }
            if (r5 == 0) goto L_0x003d
            r5 = r2
            java.util.Collection r5 = (java.util.Collection) r5     // Catch:{ all -> 0x010a }
            boolean r5 = r5.isEmpty()     // Catch:{ all -> 0x010a }
            if (r5 == 0) goto L_0x003d
            goto L_0x005b
        L_0x003d:
            java.util.Iterator r2 = r2.iterator()     // Catch:{ all -> 0x010a }
        L_0x0041:
            boolean r5 = r2.hasNext()     // Catch:{ all -> 0x010a }
            if (r5 == 0) goto L_0x005b
            java.lang.Object r5 = r2.next()     // Catch:{ all -> 0x010a }
            androidx.compose.ui.input.pointer.PointerInputChange r5 = (androidx.compose.ui.input.pointer.PointerInputChange) r5     // Catch:{ all -> 0x010a }
            boolean r6 = r5.getPressed()     // Catch:{ all -> 0x010a }
            if (r6 != 0) goto L_0x0059
            boolean r5 = r5.getPreviousPressed()     // Catch:{ all -> 0x010a }
            if (r5 == 0) goto L_0x0041
        L_0x0059:
            r2 = r4
            goto L_0x005c
        L_0x005b:
            r2 = r3
        L_0x005c:
            java.util.Map r5 = r0.getChanges()     // Catch:{ all -> 0x010a }
            java.util.Collection r5 = r5.values()     // Catch:{ all -> 0x010a }
            java.lang.Iterable r5 = (java.lang.Iterable) r5     // Catch:{ all -> 0x010a }
            java.util.Iterator r5 = r5.iterator()     // Catch:{ all -> 0x010a }
        L_0x006a:
            boolean r6 = r5.hasNext()     // Catch:{ all -> 0x010a }
            if (r6 == 0) goto L_0x00ba
            java.lang.Object r6 = r5.next()     // Catch:{ all -> 0x010a }
            androidx.compose.ui.input.pointer.PointerInputChange r6 = (androidx.compose.ui.input.pointer.PointerInputChange) r6     // Catch:{ all -> 0x010a }
            if (r2 != 0) goto L_0x007e
            boolean r7 = androidx.compose.ui.input.pointer.PointerEventKt.changedToDownIgnoreConsumed(r6)     // Catch:{ all -> 0x010a }
            if (r7 == 0) goto L_0x006a
        L_0x007e:
            int r7 = r6.m4327getTypeT8wyACA()     // Catch:{ all -> 0x010a }
            androidx.compose.ui.input.pointer.PointerType$Companion r8 = androidx.compose.ui.input.pointer.PointerType.Companion     // Catch:{ all -> 0x010a }
            int r8 = r8.m4403getTouchT8wyACA()     // Catch:{ all -> 0x010a }
            boolean r13 = androidx.compose.ui.input.pointer.PointerType.m4396equalsimpl0(r7, r8)     // Catch:{ all -> 0x010a }
            androidx.compose.ui.node.LayoutNode r9 = r1.root     // Catch:{ all -> 0x010a }
            long r10 = r6.m4324getPositionF1C5BW0()     // Catch:{ all -> 0x010a }
            androidx.compose.ui.node.HitTestResult<androidx.compose.ui.node.PointerInputModifierNode> r12 = r1.hitResult     // Catch:{ all -> 0x010a }
            r14 = 0
            r15 = 8
            r16 = 0
            androidx.compose.ui.node.LayoutNode.m4652hitTestM_7yMNQ$ui_release$default(r9, r10, r12, r13, r14, r15, r16)     // Catch:{ all -> 0x010a }
            androidx.compose.ui.node.HitTestResult<androidx.compose.ui.node.PointerInputModifierNode> r7 = r1.hitResult     // Catch:{ all -> 0x010a }
            java.util.Collection r7 = (java.util.Collection) r7     // Catch:{ all -> 0x010a }
            boolean r7 = r7.isEmpty()     // Catch:{ all -> 0x010a }
            r7 = r7 ^ r3
            if (r7 == 0) goto L_0x006a
            androidx.compose.ui.input.pointer.HitPathTracker r7 = r1.hitPathTracker     // Catch:{ all -> 0x010a }
            long r8 = r6.m4323getIdJ3iCeTQ()     // Catch:{ all -> 0x010a }
            androidx.compose.ui.node.HitTestResult<androidx.compose.ui.node.PointerInputModifierNode> r6 = r1.hitResult     // Catch:{ all -> 0x010a }
            java.util.List r6 = (java.util.List) r6     // Catch:{ all -> 0x010a }
            r7.m4255addHitPathKNwqfcY(r8, r6)     // Catch:{ all -> 0x010a }
            androidx.compose.ui.node.HitTestResult<androidx.compose.ui.node.PointerInputModifierNode> r6 = r1.hitResult     // Catch:{ all -> 0x010a }
            r6.clear()     // Catch:{ all -> 0x010a }
            goto L_0x006a
        L_0x00ba:
            androidx.compose.ui.input.pointer.HitPathTracker r2 = r1.hitPathTracker     // Catch:{ all -> 0x010a }
            r2.removeDetachedPointerInputFilters()     // Catch:{ all -> 0x010a }
            androidx.compose.ui.input.pointer.HitPathTracker r2 = r1.hitPathTracker     // Catch:{ all -> 0x010a }
            r5 = r20
            boolean r2 = r2.dispatchChanges(r0, r5)     // Catch:{ all -> 0x010a }
            boolean r5 = r0.getSuppressMovementConsumption()     // Catch:{ all -> 0x010a }
            if (r5 == 0) goto L_0x00cf
        L_0x00cd:
            r3 = r4
            goto L_0x0103
        L_0x00cf:
            java.util.Map r0 = r0.getChanges()     // Catch:{ all -> 0x010a }
            java.util.Collection r0 = r0.values()     // Catch:{ all -> 0x010a }
            java.lang.Iterable r0 = (java.lang.Iterable) r0     // Catch:{ all -> 0x010a }
            boolean r5 = r0 instanceof java.util.Collection     // Catch:{ all -> 0x010a }
            if (r5 == 0) goto L_0x00e7
            r5 = r0
            java.util.Collection r5 = (java.util.Collection) r5     // Catch:{ all -> 0x010a }
            boolean r5 = r5.isEmpty()     // Catch:{ all -> 0x010a }
            if (r5 == 0) goto L_0x00e7
            goto L_0x00cd
        L_0x00e7:
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x010a }
        L_0x00eb:
            boolean r5 = r0.hasNext()     // Catch:{ all -> 0x010a }
            if (r5 == 0) goto L_0x00cd
            java.lang.Object r5 = r0.next()     // Catch:{ all -> 0x010a }
            androidx.compose.ui.input.pointer.PointerInputChange r5 = (androidx.compose.ui.input.pointer.PointerInputChange) r5     // Catch:{ all -> 0x010a }
            boolean r6 = androidx.compose.ui.input.pointer.PointerEventKt.positionChangedIgnoreConsumed(r5)     // Catch:{ all -> 0x010a }
            if (r6 == 0) goto L_0x00eb
            boolean r5 = r5.isConsumed()     // Catch:{ all -> 0x010a }
            if (r5 == 0) goto L_0x00eb
        L_0x0103:
            int r0 = androidx.compose.ui.input.pointer.PointerInputEventProcessorKt.ProcessResult(r2, r3)     // Catch:{ all -> 0x010a }
            r1.isProcessing = r4
            return r0
        L_0x010a:
            r0 = move-exception
            r1.isProcessing = r4
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.input.pointer.PointerInputEventProcessor.m4343processBIzXfog(androidx.compose.ui.input.pointer.PointerInputEvent, androidx.compose.ui.input.pointer.PositionCalculator, boolean):int");
    }

    public final void processCancel() {
        if (!this.isProcessing) {
            this.pointerInputChangeEventProducer.clear();
            this.hitPathTracker.processCancel();
        }
    }
}
