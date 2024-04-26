package androidx.compose.ui.node;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.Modifier;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000Z\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\u001a\u001a\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0002\u001a8\u0010\u0005\u001a\n\u0012\u0004\u0012\u0002H\u0007\u0018\u00010\u0006\"\u0006\b\u0000\u0010\u0007\u0018\u0001*\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\u00070\nH\bø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000b\u0010\f\u001a\u001c\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0006*\u00020\b2\u0006\u0010\r\u001a\u00020\u000eH\u0001\u001a6\u0010\u000f\u001a\u0004\u0018\u0001H\u0007\"\n\b\u0000\u0010\u0007\u0018\u0001*\u00020\u0010*\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\u00070\nH\bø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u0016\u0010\u000f\u001a\u0004\u0018\u00010\u0003*\u00020\b2\u0006\u0010\r\u001a\u00020\u000eH\u0001\u001a%\u0010\u0013\u001a\u00020\u0014*\u00020\b2\n\u0010\t\u001a\u0006\u0012\u0002\b\u00030\nH\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0015\u0010\u0016\u001a\f\u0010\u0017\u001a\u00020\u0001*\u00020\bH\u0007\u001a2\u0010\u0018\u001a\u0004\u0018\u0001H\u0007\"\u0006\b\u0000\u0010\u0007\u0018\u0001*\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\u00070\nH\bø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0019\u0010\u0012\u001a\u0016\u0010\u0018\u001a\u0004\u0018\u00010\u0003*\u00020\b2\u0006\u0010\r\u001a\u00020\u000eH\u0001\u001a2\u0010\u001a\u001a\u0004\u0018\u0001H\u0007\"\u0006\b\u0000\u0010\u0007\u0018\u0001*\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\u00070\nH\bø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001b\u0010\u0012\u001a\u0016\u0010\u001a\u001a\u0004\u0018\u00010\u0003*\u00020\b2\u0006\u0010\r\u001a\u00020\u000eH\u0001\u001a6\u0010\u001c\u001a\u0004\u0018\u0001H\u0007\"\n\b\u0000\u0010\u0007\u0018\u0001*\u00020\u0010*\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\u00070\nH\bø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001d\u0010\u0012\u001a\u0016\u0010\u001c\u001a\u0004\u0018\u00010\u0003*\u00020\b2\u0006\u0010\r\u001a\u00020\u000eH\u0001\u001a%\u0010\u001e\u001a\u00020\u001f*\u00020\b2\n\u0010 \u001a\u0006\u0012\u0002\b\u00030\nH\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b!\u0010\"\u001a\f\u0010#\u001a\u00020$*\u00020\bH\u0001\u001a\f\u0010%\u001a\u00020&*\u00020\bH\u0001\u001aG\u0010'\u001a\u00020\u0001\"\u0006\b\u0000\u0010\u0007\u0018\u0001*\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\u00070\n2\u0012\u0010(\u001a\u000e\u0012\u0004\u0012\u0002H\u0007\u0012\u0004\u0012\u00020\u00010)H\bø\u0001\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b*\u0010+\u001a,\u0010'\u001a\u00020\u0001*\u00020\b2\u0006\u0010\r\u001a\u00020\u000e2\u0012\u0010(\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010)H\bø\u0001\u0002\u001aG\u0010,\u001a\u00020\u0001\"\u0006\b\u0000\u0010\u0007\u0018\u0001*\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\u00070\n2\u0012\u0010(\u001a\u000e\u0012\u0004\u0012\u0002H\u0007\u0012\u0004\u0012\u00020\u00010)H\bø\u0001\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b-\u0010+\u001a,\u0010,\u001a\u00020\u0001*\u00020\b2\u0006\u0010\r\u001a\u00020\u000e2\u0012\u0010(\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010)H\bø\u0001\u0002\u001aG\u0010.\u001a\u00020\u0001\"\u0006\b\u0000\u0010\u0007\u0018\u0001*\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\u00070\n2\u0012\u0010(\u001a\u000e\u0012\u0004\u0012\u0002H\u0007\u0012\u0004\u0012\u00020\u00010)H\bø\u0001\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b/\u0010+\u001a,\u0010.\u001a\u00020\u0001*\u00020\b2\u0006\u0010\r\u001a\u00020\u000e2\u0012\u0010(\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010)H\bø\u0001\u0002\u001aG\u00100\u001a\u00020\u0001\"\u0006\b\u0000\u0010\u0007\u0018\u0001*\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\u00070\n2\u0012\u0010(\u001a\u000e\u0012\u0004\u0012\u0002H\u0007\u0012\u0004\u0012\u00020\u00010)H\bø\u0001\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b1\u0010+\u001a,\u00100\u001a\u00020\u0001*\u00020\b2\u0006\u0010\r\u001a\u00020\u000e2\u0012\u0010(\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010)H\bø\u0001\u0002\u001aG\u00102\u001a\u00020\u0001\"\u0006\b\u0000\u0010\u0007\u0018\u0001*\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\u00070\n2\u0012\u0010(\u001a\u000e\u0012\u0004\u0012\u0002H\u0007\u0012\u0004\u0012\u00020\u00010)H\bø\u0001\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b3\u0010+\u001a,\u00102\u001a\u00020\u0001*\u00020\b2\u0006\u0010\r\u001a\u00020\u000e2\u0012\u0010(\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010)H\bø\u0001\u0002\u001aG\u00104\u001a\u00020\u0001\"\u0006\b\u0000\u0010\u0007\u0018\u0001*\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\u00070\n2\u0012\u0010(\u001a\u000e\u0012\u0004\u0012\u0002H\u0007\u0012\u0004\u0012\u00020\u00140)H\bø\u0001\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b5\u0010+\u001a,\u00104\u001a\u00020\u0001*\u00020\b2\u0006\u0010\r\u001a\u00020\u000e2\u0012\u0010(\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00140)H\bø\u0001\u0002\u0002\u0012\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0005\b20\u0001¨\u00066"}, d2 = {"addLayoutNodeChildren", "", "Landroidx/compose/runtime/collection/MutableVector;", "Landroidx/compose/ui/Modifier$Node;", "node", "ancestors", "", "T", "Landroidx/compose/ui/node/DelegatableNode;", "type", "Landroidx/compose/ui/node/NodeKind;", "ancestors-64DMado", "(Landroidx/compose/ui/node/DelegatableNode;I)Ljava/util/List;", "mask", "", "firstChild", "", "firstChild-64DMado", "(Landroidx/compose/ui/node/DelegatableNode;I)Ljava/lang/Object;", "has", "", "has-64DMado", "(Landroidx/compose/ui/node/DelegatableNode;I)Z", "invalidateSubtree", "localChild", "localChild-64DMado", "localParent", "localParent-64DMado", "nearestAncestor", "nearestAncestor-64DMado", "requireCoordinator", "Landroidx/compose/ui/node/NodeCoordinator;", "kind", "requireCoordinator-64DMado", "(Landroidx/compose/ui/node/DelegatableNode;I)Landroidx/compose/ui/node/NodeCoordinator;", "requireLayoutNode", "Landroidx/compose/ui/node/LayoutNode;", "requireOwner", "Landroidx/compose/ui/node/Owner;", "visitAncestors", "block", "Lkotlin/Function1;", "visitAncestors-6rFNWt0", "(Landroidx/compose/ui/node/DelegatableNode;ILkotlin/jvm/functions/Function1;)V", "visitChildren", "visitChildren-6rFNWt0", "visitLocalChildren", "visitLocalChildren-6rFNWt0", "visitLocalParents", "visitLocalParents-6rFNWt0", "visitSubtree", "visitSubtree-6rFNWt0", "visitSubtreeIf", "visitSubtreeIf-6rFNWt0", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: DelegatableNode.kt */
public final class DelegatableNodeKt {
    public static final Modifier.Node localChild(DelegatableNode delegatableNode, int i) {
        Intrinsics.checkNotNullParameter(delegatableNode, "<this>");
        Modifier.Node child$ui_release = delegatableNode.getNode().getChild$ui_release();
        if (child$ui_release == null || (child$ui_release.getAggregateChildKindSet$ui_release() & i) == 0) {
            return null;
        }
        while (child$ui_release != null) {
            if ((child$ui_release.getKindSet$ui_release() & i) != 0) {
                return child$ui_release;
            }
            child$ui_release = child$ui_release.getChild$ui_release();
        }
        return null;
    }

    public static final Modifier.Node localParent(DelegatableNode delegatableNode, int i) {
        Intrinsics.checkNotNullParameter(delegatableNode, "<this>");
        for (Modifier.Node parent$ui_release = delegatableNode.getNode().getParent$ui_release(); parent$ui_release != null; parent$ui_release = parent$ui_release.getParent$ui_release()) {
            if ((parent$ui_release.getKindSet$ui_release() & i) != 0) {
                return parent$ui_release;
            }
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0049, code lost:
        r0 = r2.getNodes$ui_release();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void visitAncestors(androidx.compose.ui.node.DelegatableNode r2, int r3, kotlin.jvm.functions.Function1<? super androidx.compose.ui.Modifier.Node, kotlin.Unit> r4) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "block"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            androidx.compose.ui.Modifier$Node r0 = r2.getNode()
            boolean r0 = r0.isAttached()
            if (r0 == 0) goto L_0x0057
            androidx.compose.ui.Modifier$Node r0 = r2.getNode()
            androidx.compose.ui.Modifier$Node r0 = r0.getParent$ui_release()
            androidx.compose.ui.node.LayoutNode r2 = requireLayoutNode(r2)
        L_0x0021:
            if (r2 == 0) goto L_0x0056
            androidx.compose.ui.node.NodeChain r1 = r2.getNodes$ui_release()
            androidx.compose.ui.Modifier$Node r1 = r1.getHead$ui_release()
            int r1 = r1.getAggregateChildKindSet$ui_release()
            r1 = r1 & r3
            if (r1 == 0) goto L_0x0043
        L_0x0032:
            if (r0 == 0) goto L_0x0043
            int r1 = r0.getKindSet$ui_release()
            r1 = r1 & r3
            if (r1 == 0) goto L_0x003e
            r4.invoke(r0)
        L_0x003e:
            androidx.compose.ui.Modifier$Node r0 = r0.getParent$ui_release()
            goto L_0x0032
        L_0x0043:
            androidx.compose.ui.node.LayoutNode r2 = r2.getParent$ui_release()
            if (r2 == 0) goto L_0x0054
            androidx.compose.ui.node.NodeChain r0 = r2.getNodes$ui_release()
            if (r0 == 0) goto L_0x0054
            androidx.compose.ui.Modifier$Node r0 = r0.getTail$ui_release()
            goto L_0x0021
        L_0x0054:
            r0 = 0
            goto L_0x0021
        L_0x0056:
            return
        L_0x0057:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r3 = "Check failed."
            java.lang.String r3 = r3.toString()
            r2.<init>(r3)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.node.DelegatableNodeKt.visitAncestors(androidx.compose.ui.node.DelegatableNode, int, kotlin.jvm.functions.Function1):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0051, code lost:
        r0 = r4.getNodes$ui_release();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.util.List<androidx.compose.ui.Modifier.Node> ancestors(androidx.compose.ui.node.DelegatableNode r4, int r5) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            androidx.compose.ui.Modifier$Node r0 = r4.getNode()
            boolean r0 = r0.isAttached()
            if (r0 == 0) goto L_0x005f
            androidx.compose.ui.Modifier$Node r0 = r4.getNode()
            androidx.compose.ui.Modifier$Node r0 = r0.getParent$ui_release()
            androidx.compose.ui.node.LayoutNode r4 = requireLayoutNode(r4)
            r1 = 0
            r2 = r1
        L_0x001d:
            if (r4 == 0) goto L_0x005e
            androidx.compose.ui.node.NodeChain r3 = r4.getNodes$ui_release()
            androidx.compose.ui.Modifier$Node r3 = r3.getHead$ui_release()
            int r3 = r3.getAggregateChildKindSet$ui_release()
            r3 = r3 & r5
            if (r3 == 0) goto L_0x004b
        L_0x002e:
            if (r0 == 0) goto L_0x004b
            int r3 = r0.getKindSet$ui_release()
            r3 = r3 & r5
            if (r3 == 0) goto L_0x0046
            if (r2 != 0) goto L_0x0040
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.List r2 = (java.util.List) r2
        L_0x0040:
            r3 = r2
            java.util.Collection r3 = (java.util.Collection) r3
            r3.add(r0)
        L_0x0046:
            androidx.compose.ui.Modifier$Node r0 = r0.getParent$ui_release()
            goto L_0x002e
        L_0x004b:
            androidx.compose.ui.node.LayoutNode r4 = r4.getParent$ui_release()
            if (r4 == 0) goto L_0x005c
            androidx.compose.ui.node.NodeChain r0 = r4.getNodes$ui_release()
            if (r0 == 0) goto L_0x005c
            androidx.compose.ui.Modifier$Node r0 = r0.getTail$ui_release()
            goto L_0x001d
        L_0x005c:
            r0 = r1
            goto L_0x001d
        L_0x005e:
            return r2
        L_0x005f:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "Check failed."
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.node.DelegatableNodeKt.ancestors(androidx.compose.ui.node.DelegatableNode, int):java.util.List");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0042, code lost:
        r0 = r3.getNodes$ui_release();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final androidx.compose.ui.Modifier.Node nearestAncestor(androidx.compose.ui.node.DelegatableNode r3, int r4) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            androidx.compose.ui.Modifier$Node r0 = r3.getNode()
            boolean r0 = r0.isAttached()
            if (r0 == 0) goto L_0x0050
            androidx.compose.ui.Modifier$Node r0 = r3.getNode()
            androidx.compose.ui.Modifier$Node r0 = r0.getParent$ui_release()
            androidx.compose.ui.node.LayoutNode r3 = requireLayoutNode(r3)
        L_0x001b:
            r1 = 0
            if (r3 == 0) goto L_0x004f
            androidx.compose.ui.node.NodeChain r2 = r3.getNodes$ui_release()
            androidx.compose.ui.Modifier$Node r2 = r2.getHead$ui_release()
            int r2 = r2.getAggregateChildKindSet$ui_release()
            r2 = r2 & r4
            if (r2 == 0) goto L_0x003c
        L_0x002d:
            if (r0 == 0) goto L_0x003c
            int r2 = r0.getKindSet$ui_release()
            r2 = r2 & r4
            if (r2 == 0) goto L_0x0037
            return r0
        L_0x0037:
            androidx.compose.ui.Modifier$Node r0 = r0.getParent$ui_release()
            goto L_0x002d
        L_0x003c:
            androidx.compose.ui.node.LayoutNode r3 = r3.getParent$ui_release()
            if (r3 == 0) goto L_0x004d
            androidx.compose.ui.node.NodeChain r0 = r3.getNodes$ui_release()
            if (r0 == 0) goto L_0x004d
            androidx.compose.ui.Modifier$Node r0 = r0.getTail$ui_release()
            goto L_0x001b
        L_0x004d:
            r0 = r1
            goto L_0x001b
        L_0x004f:
            return r1
        L_0x0050:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r4 = "Check failed."
            java.lang.String r4 = r4.toString()
            r3.<init>(r4)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.node.DelegatableNodeKt.nearestAncestor(androidx.compose.ui.node.DelegatableNode, int):androidx.compose.ui.Modifier$Node");
    }

    public static final Modifier.Node firstChild(DelegatableNode delegatableNode, int i) {
        Intrinsics.checkNotNullParameter(delegatableNode, "<this>");
        if (delegatableNode.getNode().isAttached()) {
            MutableVector mutableVector = new MutableVector(new Modifier.Node[16], 0);
            Modifier.Node child$ui_release = delegatableNode.getNode().getChild$ui_release();
            if (child$ui_release == null) {
                addLayoutNodeChildren(mutableVector, delegatableNode.getNode());
            } else {
                mutableVector.add(child$ui_release);
            }
            while (mutableVector.isNotEmpty()) {
                Modifier.Node node = (Modifier.Node) mutableVector.removeAt(mutableVector.getSize() - 1);
                if ((node.getAggregateChildKindSet$ui_release() & i) == 0) {
                    addLayoutNodeChildren(mutableVector, node);
                } else {
                    while (node != null) {
                        if ((node.getKindSet$ui_release() & i) != 0) {
                            return node;
                        }
                        node = node.getChild$ui_release();
                    }
                    continue;
                }
            }
            return null;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    public static final void visitSubtree(DelegatableNode delegatableNode, int i, Function1<? super Modifier.Node, Unit> function1) {
        Intrinsics.checkNotNullParameter(delegatableNode, "<this>");
        Intrinsics.checkNotNullParameter(function1, "block");
        if (delegatableNode.getNode().isAttached()) {
            Modifier.Node child$ui_release = delegatableNode.getNode().getChild$ui_release();
            NestedVectorStack nestedVectorStack = new NestedVectorStack();
            for (LayoutNode requireLayoutNode = requireLayoutNode(delegatableNode); requireLayoutNode != null; requireLayoutNode = nestedVectorStack.isNotEmpty() ? (LayoutNode) nestedVectorStack.pop() : null) {
                if (child$ui_release == null) {
                    child$ui_release = requireLayoutNode.getNodes$ui_release().getHead$ui_release();
                }
                if ((child$ui_release.getAggregateChildKindSet$ui_release() & i) != 0) {
                    while (child$ui_release != null) {
                        if ((child$ui_release.getKindSet$ui_release() & i) != 0) {
                            function1.invoke(child$ui_release);
                        }
                        child$ui_release = child$ui_release.getChild$ui_release();
                    }
                    child$ui_release = null;
                }
                nestedVectorStack.push(requireLayoutNode.get_children$ui_release());
            }
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    /* access modifiers changed from: private */
    public static final void addLayoutNodeChildren(MutableVector<Modifier.Node> mutableVector, Modifier.Node node) {
        MutableVector<LayoutNode> mutableVector2 = requireLayoutNode(node).get_children$ui_release();
        int size = mutableVector2.getSize();
        if (size > 0) {
            int i = size - 1;
            Object[] content = mutableVector2.getContent();
            do {
                mutableVector.add(((LayoutNode) content[i]).getNodes$ui_release().getHead$ui_release());
                i--;
            } while (i >= 0);
        }
    }

    public static final void visitChildren(DelegatableNode delegatableNode, int i, Function1<? super Modifier.Node, Unit> function1) {
        Intrinsics.checkNotNullParameter(delegatableNode, "<this>");
        Intrinsics.checkNotNullParameter(function1, "block");
        if (delegatableNode.getNode().isAttached()) {
            MutableVector mutableVector = new MutableVector(new Modifier.Node[16], 0);
            Modifier.Node child$ui_release = delegatableNode.getNode().getChild$ui_release();
            if (child$ui_release == null) {
                addLayoutNodeChildren(mutableVector, delegatableNode.getNode());
            } else {
                mutableVector.add(child$ui_release);
            }
            while (mutableVector.isNotEmpty()) {
                Modifier.Node node = (Modifier.Node) mutableVector.removeAt(mutableVector.getSize() - 1);
                if ((node.getAggregateChildKindSet$ui_release() & i) == 0) {
                    addLayoutNodeChildren(mutableVector, node);
                } else {
                    while (true) {
                        if (node == null) {
                            break;
                        } else if ((node.getKindSet$ui_release() & i) != 0) {
                            function1.invoke(node);
                            break;
                        } else {
                            node = node.getChild$ui_release();
                        }
                    }
                }
            }
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    public static final void visitSubtreeIf(DelegatableNode delegatableNode, int i, Function1<? super Modifier.Node, Boolean> function1) {
        Intrinsics.checkNotNullParameter(delegatableNode, "<this>");
        Intrinsics.checkNotNullParameter(function1, "block");
        if (delegatableNode.getNode().isAttached()) {
            MutableVector mutableVector = new MutableVector(new Modifier.Node[16], 0);
            Modifier.Node child$ui_release = delegatableNode.getNode().getChild$ui_release();
            if (child$ui_release == null) {
                addLayoutNodeChildren(mutableVector, delegatableNode.getNode());
            } else {
                mutableVector.add(child$ui_release);
            }
            while (mutableVector.isNotEmpty()) {
                Modifier.Node node = (Modifier.Node) mutableVector.removeAt(mutableVector.getSize() - 1);
                if ((node.getAggregateChildKindSet$ui_release() & i) != 0) {
                    Modifier.Node node2 = node;
                    while (true) {
                        if (node2 != null) {
                            if ((node2.getKindSet$ui_release() & i) != 0 && !function1.invoke(node2).booleanValue()) {
                                break;
                            }
                            node2 = node2.getChild$ui_release();
                        } else {
                            break;
                        }
                    }
                }
                addLayoutNodeChildren(mutableVector, node);
            }
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    public static final void visitLocalChildren(DelegatableNode delegatableNode, int i, Function1<? super Modifier.Node, Unit> function1) {
        Intrinsics.checkNotNullParameter(delegatableNode, "<this>");
        Intrinsics.checkNotNullParameter(function1, "block");
        if (delegatableNode.getNode().isAttached()) {
            Modifier.Node node = delegatableNode.getNode();
            if ((node.getAggregateChildKindSet$ui_release() & i) != 0) {
                for (Modifier.Node child$ui_release = node.getChild$ui_release(); child$ui_release != null; child$ui_release = child$ui_release.getChild$ui_release()) {
                    if ((child$ui_release.getKindSet$ui_release() & i) != 0) {
                        function1.invoke(child$ui_release);
                    }
                }
                return;
            }
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    public static final void visitLocalParents(DelegatableNode delegatableNode, int i, Function1<? super Modifier.Node, Unit> function1) {
        Intrinsics.checkNotNullParameter(delegatableNode, "<this>");
        Intrinsics.checkNotNullParameter(function1, "block");
        if (delegatableNode.getNode().isAttached()) {
            for (Modifier.Node parent$ui_release = delegatableNode.getNode().getParent$ui_release(); parent$ui_release != null; parent$ui_release = parent$ui_release.getParent$ui_release()) {
                if ((parent$ui_release.getKindSet$ui_release() & i) != 0) {
                    function1.invoke(parent$ui_release);
                }
            }
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    /* renamed from: localParent-64DMado  reason: not valid java name */
    public static final /* synthetic */ <T> T m4620localParent64DMado(DelegatableNode delegatableNode, int i) {
        Intrinsics.checkNotNullParameter(delegatableNode, "$this$localParent");
        T localParent = localParent(delegatableNode, i);
        Intrinsics.reifiedOperationMarker(2, "T");
        return (Object) localParent;
    }

    /* renamed from: localChild-64DMado  reason: not valid java name */
    public static final /* synthetic */ <T> T m4619localChild64DMado(DelegatableNode delegatableNode, int i) {
        Intrinsics.checkNotNullParameter(delegatableNode, "$this$localChild");
        T localChild = localChild(delegatableNode, i);
        Intrinsics.reifiedOperationMarker(2, "T");
        return (Object) localChild;
    }

    /* renamed from: ancestors-64DMado  reason: not valid java name */
    public static final /* synthetic */ <T> List<T> m4616ancestors64DMado(DelegatableNode delegatableNode, int i) {
        Intrinsics.checkNotNullParameter(delegatableNode, "$this$ancestors");
        List<Modifier.Node> ancestors = ancestors(delegatableNode, i);
        if (ancestors instanceof List) {
            return ancestors;
        }
        return null;
    }

    /* renamed from: nearestAncestor-64DMado  reason: not valid java name */
    public static final /* synthetic */ <T> T m4621nearestAncestor64DMado(DelegatableNode delegatableNode, int i) {
        Intrinsics.checkNotNullParameter(delegatableNode, "$this$nearestAncestor");
        T nearestAncestor = nearestAncestor(delegatableNode, i);
        Intrinsics.reifiedOperationMarker(2, "T");
        return (Object) nearestAncestor;
    }

    /* renamed from: firstChild-64DMado  reason: not valid java name */
    public static final /* synthetic */ <T> T m4617firstChild64DMado(DelegatableNode delegatableNode, int i) {
        Intrinsics.checkNotNullParameter(delegatableNode, "$this$firstChild");
        T firstChild = firstChild(delegatableNode, i);
        Intrinsics.reifiedOperationMarker(2, "T");
        return (Object) firstChild;
    }

    /* renamed from: has-64DMado  reason: not valid java name */
    public static final boolean m4618has64DMado(DelegatableNode delegatableNode, int i) {
        Intrinsics.checkNotNullParameter(delegatableNode, "$this$has");
        return (delegatableNode.getNode().getAggregateChildKindSet$ui_release() & i) != 0;
    }

    /* renamed from: requireCoordinator-64DMado  reason: not valid java name */
    public static final NodeCoordinator m4622requireCoordinator64DMado(DelegatableNode delegatableNode, int i) {
        Intrinsics.checkNotNullParameter(delegatableNode, "$this$requireCoordinator");
        NodeCoordinator coordinator$ui_release = delegatableNode.getNode().getCoordinator$ui_release();
        Intrinsics.checkNotNull(coordinator$ui_release);
        if (coordinator$ui_release.getTail() != delegatableNode || !NodeKindKt.m4788getIncludeSelfInTraversalH91voCI(i)) {
            return coordinator$ui_release;
        }
        NodeCoordinator wrapped$ui_release = coordinator$ui_release.getWrapped$ui_release();
        Intrinsics.checkNotNull(wrapped$ui_release);
        return wrapped$ui_release;
    }

    public static final LayoutNode requireLayoutNode(DelegatableNode delegatableNode) {
        Intrinsics.checkNotNullParameter(delegatableNode, "<this>");
        NodeCoordinator coordinator$ui_release = delegatableNode.getNode().getCoordinator$ui_release();
        if (coordinator$ui_release != null) {
            return coordinator$ui_release.getLayoutNode();
        }
        throw new IllegalStateException("Required value was null.".toString());
    }

    public static final Owner requireOwner(DelegatableNode delegatableNode) {
        Intrinsics.checkNotNullParameter(delegatableNode, "<this>");
        Owner owner$ui_release = requireLayoutNode(delegatableNode).getOwner$ui_release();
        if (owner$ui_release != null) {
            return owner$ui_release;
        }
        throw new IllegalStateException("Required value was null.".toString());
    }

    public static final void invalidateSubtree(DelegatableNode delegatableNode) {
        Intrinsics.checkNotNullParameter(delegatableNode, "<this>");
        if (delegatableNode.getNode().isAttached()) {
            LayoutNode.invalidateSubtree$default(requireLayoutNode(delegatableNode), false, 1, (Object) null);
        }
    }

    /* renamed from: visitLocalChildren-6rFNWt0  reason: not valid java name */
    public static final /* synthetic */ <T> void m4625visitLocalChildren6rFNWt0(DelegatableNode delegatableNode, int i, Function1<? super T, Unit> function1) {
        Intrinsics.checkNotNullParameter(delegatableNode, "$this$visitLocalChildren");
        Intrinsics.checkNotNullParameter(function1, "block");
        if (delegatableNode.getNode().isAttached()) {
            Modifier.Node node = delegatableNode.getNode();
            if ((node.getAggregateChildKindSet$ui_release() & i) != 0) {
                for (Modifier.Node child$ui_release = node.getChild$ui_release(); child$ui_release != null; child$ui_release = child$ui_release.getChild$ui_release()) {
                    if ((child$ui_release.getKindSet$ui_release() & i) != 0) {
                        Modifier.Node node2 = child$ui_release;
                        Intrinsics.reifiedOperationMarker(3, "T");
                        if (child$ui_release instanceof Object) {
                            function1.invoke(child$ui_release);
                        }
                    }
                }
                return;
            }
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    /* renamed from: visitLocalParents-6rFNWt0  reason: not valid java name */
    public static final /* synthetic */ <T> void m4626visitLocalParents6rFNWt0(DelegatableNode delegatableNode, int i, Function1<? super T, Unit> function1) {
        Intrinsics.checkNotNullParameter(delegatableNode, "$this$visitLocalParents");
        Intrinsics.checkNotNullParameter(function1, "block");
        if (delegatableNode.getNode().isAttached()) {
            for (Modifier.Node parent$ui_release = delegatableNode.getNode().getParent$ui_release(); parent$ui_release != null; parent$ui_release = parent$ui_release.getParent$ui_release()) {
                if ((parent$ui_release.getKindSet$ui_release() & i) != 0) {
                    Modifier.Node node = parent$ui_release;
                    Intrinsics.reifiedOperationMarker(3, "T");
                    if (parent$ui_release instanceof Object) {
                        function1.invoke(parent$ui_release);
                    }
                }
            }
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0056, code lost:
        r0 = r3.getNodes$ui_release();
     */
    /* renamed from: visitAncestors-6rFNWt0  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final /* synthetic */ <T> void m4623visitAncestors6rFNWt0(androidx.compose.ui.node.DelegatableNode r3, int r4, kotlin.jvm.functions.Function1<? super T, kotlin.Unit> r5) {
        /*
            java.lang.String r0 = "$this$visitAncestors"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = "block"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            androidx.compose.ui.Modifier$Node r0 = r3.getNode()
            boolean r0 = r0.isAttached()
            if (r0 == 0) goto L_0x0064
            androidx.compose.ui.Modifier$Node r0 = r3.getNode()
            androidx.compose.ui.Modifier$Node r0 = r0.getParent$ui_release()
            androidx.compose.ui.node.LayoutNode r3 = requireLayoutNode(r3)
        L_0x0021:
            if (r3 == 0) goto L_0x0063
            androidx.compose.ui.node.NodeChain r1 = r3.getNodes$ui_release()
            androidx.compose.ui.Modifier$Node r1 = r1.getHead$ui_release()
            int r1 = r1.getAggregateChildKindSet$ui_release()
            r1 = r1 & r4
            if (r1 == 0) goto L_0x0050
        L_0x0032:
            if (r0 == 0) goto L_0x0050
            int r1 = r0.getKindSet$ui_release()
            r1 = r1 & r4
            if (r1 == 0) goto L_0x004b
            r1 = r0
            androidx.compose.ui.Modifier$Node r1 = (androidx.compose.ui.Modifier.Node) r1
            r1 = 3
            java.lang.String r2 = "T"
            kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(r1, r2)
            boolean r1 = r0 instanceof java.lang.Object
            if (r1 == 0) goto L_0x004b
            r5.invoke(r0)
        L_0x004b:
            androidx.compose.ui.Modifier$Node r0 = r0.getParent$ui_release()
            goto L_0x0032
        L_0x0050:
            androidx.compose.ui.node.LayoutNode r3 = r3.getParent$ui_release()
            if (r3 == 0) goto L_0x0061
            androidx.compose.ui.node.NodeChain r0 = r3.getNodes$ui_release()
            if (r0 == 0) goto L_0x0061
            androidx.compose.ui.Modifier$Node r0 = r0.getTail$ui_release()
            goto L_0x0021
        L_0x0061:
            r0 = 0
            goto L_0x0021
        L_0x0063:
            return
        L_0x0064:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r4 = "Check failed."
            java.lang.String r4 = r4.toString()
            r3.<init>(r4)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.node.DelegatableNodeKt.m4623visitAncestors6rFNWt0(androidx.compose.ui.node.DelegatableNode, int, kotlin.jvm.functions.Function1):void");
    }

    /* renamed from: visitSubtree-6rFNWt0  reason: not valid java name */
    public static final /* synthetic */ <T> void m4627visitSubtree6rFNWt0(DelegatableNode delegatableNode, int i, Function1<? super T, Unit> function1) {
        Intrinsics.checkNotNullParameter(delegatableNode, "$this$visitSubtree");
        Intrinsics.checkNotNullParameter(function1, "block");
        if (delegatableNode.getNode().isAttached()) {
            Modifier.Node child$ui_release = delegatableNode.getNode().getChild$ui_release();
            NestedVectorStack nestedVectorStack = new NestedVectorStack();
            for (LayoutNode requireLayoutNode = requireLayoutNode(delegatableNode); requireLayoutNode != null; requireLayoutNode = nestedVectorStack.isNotEmpty() ? (LayoutNode) nestedVectorStack.pop() : null) {
                if (child$ui_release == null) {
                    child$ui_release = requireLayoutNode.getNodes$ui_release().getHead$ui_release();
                }
                if ((child$ui_release.getAggregateChildKindSet$ui_release() & i) != 0) {
                    while (child$ui_release != null) {
                        if ((child$ui_release.getKindSet$ui_release() & i) != 0) {
                            Modifier.Node node = child$ui_release;
                            Intrinsics.reifiedOperationMarker(3, "T");
                            if (child$ui_release instanceof Object) {
                                function1.invoke(child$ui_release);
                            }
                        }
                        child$ui_release = child$ui_release.getChild$ui_release();
                    }
                    child$ui_release = null;
                }
                nestedVectorStack.push(requireLayoutNode.get_children$ui_release());
            }
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    /* renamed from: visitChildren-6rFNWt0  reason: not valid java name */
    public static final /* synthetic */ <T> void m4624visitChildren6rFNWt0(DelegatableNode delegatableNode, int i, Function1<? super T, Unit> function1) {
        Intrinsics.checkNotNullParameter(delegatableNode, "$this$visitChildren");
        Intrinsics.checkNotNullParameter(function1, "block");
        if (delegatableNode.getNode().isAttached()) {
            MutableVector mutableVector = new MutableVector(new Modifier.Node[16], 0);
            Modifier.Node child$ui_release = delegatableNode.getNode().getChild$ui_release();
            if (child$ui_release == null) {
                addLayoutNodeChildren(mutableVector, delegatableNode.getNode());
            } else {
                mutableVector.add(child$ui_release);
            }
            while (mutableVector.isNotEmpty()) {
                Modifier.Node node = (Modifier.Node) mutableVector.removeAt(mutableVector.getSize() - 1);
                if ((node.getAggregateChildKindSet$ui_release() & i) == 0) {
                    addLayoutNodeChildren(mutableVector, node);
                } else {
                    while (true) {
                        if (node == null) {
                            break;
                        } else if ((node.getKindSet$ui_release() & i) != 0) {
                            Modifier.Node node2 = node;
                            Intrinsics.reifiedOperationMarker(3, "T");
                            if (node instanceof Object) {
                                function1.invoke(node);
                            }
                        } else {
                            node = node.getChild$ui_release();
                        }
                    }
                }
            }
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    /* renamed from: visitSubtreeIf-6rFNWt0  reason: not valid java name */
    public static final /* synthetic */ <T> void m4628visitSubtreeIf6rFNWt0(DelegatableNode delegatableNode, int i, Function1<? super T, Boolean> function1) {
        Intrinsics.checkNotNullParameter(delegatableNode, "$this$visitSubtreeIf");
        Intrinsics.checkNotNullParameter(function1, "block");
        if (delegatableNode.getNode().isAttached()) {
            MutableVector mutableVector = new MutableVector(new Modifier.Node[16], 0);
            Modifier.Node child$ui_release = delegatableNode.getNode().getChild$ui_release();
            if (child$ui_release == null) {
                addLayoutNodeChildren(mutableVector, delegatableNode.getNode());
            } else {
                mutableVector.add(child$ui_release);
            }
            while (mutableVector.isNotEmpty()) {
                Modifier.Node node = (Modifier.Node) mutableVector.removeAt(mutableVector.getSize() - 1);
                if ((node.getAggregateChildKindSet$ui_release() & i) != 0) {
                    Modifier.Node node2 = node;
                    while (true) {
                        if (node2 == null) {
                            break;
                        }
                        if ((node2.getKindSet$ui_release() & i) != 0) {
                            Modifier.Node node3 = node2;
                            Intrinsics.reifiedOperationMarker(3, "T");
                            if ((node2 instanceof Object) && !function1.invoke(node2).booleanValue()) {
                                break;
                            }
                        }
                        node2 = node2.getChild$ui_release();
                    }
                }
                addLayoutNodeChildren(mutableVector, node);
            }
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }
}
