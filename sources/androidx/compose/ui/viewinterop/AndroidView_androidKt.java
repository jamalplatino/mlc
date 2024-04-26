package androidx.compose.ui.viewinterop;

import android.content.Context;
import android.view.View;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionContext;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.saveable.SaveableStateRegistry;
import androidx.compose.runtime.saveable.SaveableStateRegistryKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.lifecycle.LifecycleOwner;
import androidx.savedstate.SavedStateRegistryOwner;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000e\n\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0001\u001au\u0010\n\u001a\u00020\u0006\"\b\b\u0000\u0010\u000b*\u00020\u00052\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u0002H\u000b0\u00042\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u0002H\u000b\u0012\u0004\u0012\u00020\u00060\u00042\b\b\u0002\u0010\u000f\u001a\u00020\u00102\u0014\b\u0002\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u0002H\u000b\u0012\u0004\u0012\u00020\u00060\u00042\u0014\b\u0002\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u0002H\u000b\u0012\u0004\u0012\u00020\u00060\u0004H\u0007¢\u0006\u0002\u0010\u0013\u001aK\u0010\n\u001a\u00020\u0006\"\b\b\u0000\u0010\u000b*\u00020\u00052\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u0002H\u000b0\u00042\b\b\u0002\u0010\u000f\u001a\u00020\u00102\u0014\b\u0002\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u0002H\u000b\u0012\u0004\u0012\u00020\u00060\u0004H\u0007¢\u0006\u0002\u0010\u0014\u001a9\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016\"\b\b\u0000\u0010\u000b*\u00020\u00052\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u0002H\u000b0\u00042\u0006\u0010\u0018\u001a\u00020\u0019H\u0003¢\u0006\u0002\u0010\u001a\u001a\u001c\u0010\u001b\u001a\b\u0012\u0004\u0012\u0002H\u000b0\u001c\"\b\b\u0000\u0010\u000b*\u00020\u0005*\u00020\u0017H\u0002\u001aQ\u0010\u001d\u001a\u00020\u0006\"\b\b\u0000\u0010\u000b*\u00020\u0005*\b\u0012\u0004\u0012\u00020\u00170\u001e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b'\u0010(\"\u0010\u0010\u0000\u001a\u00020\u0001X\u0004¢\u0006\u0004\n\u0002\u0010\u0002\"\"\u0010\u0003\u001a\u0013\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0002\b\u0007¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006)"}, d2 = {"NoOpScrollConnection", "androidx/compose/ui/viewinterop/AndroidView_androidKt$NoOpScrollConnection$1", "Landroidx/compose/ui/viewinterop/AndroidView_androidKt$NoOpScrollConnection$1;", "NoOpUpdate", "Lkotlin/Function1;", "Landroid/view/View;", "", "Lkotlin/ExtensionFunctionType;", "getNoOpUpdate", "()Lkotlin/jvm/functions/Function1;", "AndroidView", "T", "factory", "Landroid/content/Context;", "onReset", "modifier", "Landroidx/compose/ui/Modifier;", "update", "onRelease", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "(Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "createAndroidViewNodeFactory", "Lkotlin/Function0;", "Landroidx/compose/ui/node/LayoutNode;", "dispatcher", "Landroidx/compose/ui/input/nestedscroll/NestedScrollDispatcher;", "(Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/input/nestedscroll/NestedScrollDispatcher;Landroidx/compose/runtime/Composer;I)Lkotlin/jvm/functions/Function0;", "requireViewFactoryHolder", "Landroidx/compose/ui/viewinterop/ViewFactoryHolder;", "updateViewHolderParams", "Landroidx/compose/runtime/Updater;", "density", "Landroidx/compose/ui/unit/Density;", "lifecycleOwner", "Landroidx/lifecycle/LifecycleOwner;", "savedStateRegistryOwner", "Landroidx/savedstate/SavedStateRegistryOwner;", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "updateViewHolderParams-OlIkWs8", "(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/unit/Density;Landroidx/lifecycle/LifecycleOwner;Landroidx/savedstate/SavedStateRegistryOwner;Landroidx/compose/ui/unit/LayoutDirection;)V", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: AndroidView.android.kt */
public final class AndroidView_androidKt {
    private static final AndroidView_androidKt$NoOpScrollConnection$1 NoOpScrollConnection = new AndroidView_androidKt$NoOpScrollConnection$1();
    private static final Function1<View, Unit> NoOpUpdate = AndroidView_androidKt$NoOpUpdate$1.INSTANCE;

    public static final Function1<View, Unit> getNoOpUpdate() {
        return NoOpUpdate;
    }

    /* JADX WARNING: Failed to insert additional move for type inference */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <T extends android.view.View> void AndroidView(kotlin.jvm.functions.Function1<? super android.content.Context, ? extends T> r9, androidx.compose.ui.Modifier r10, kotlin.jvm.functions.Function1<? super T, kotlin.Unit> r11, androidx.compose.runtime.Composer r12, int r13, int r14) {
        /*
            java.lang.String r0 = "factory"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            r0 = -1783766393(0xffffffff95ade287, float:-7.023154E-26)
            androidx.compose.runtime.Composer r12 = r12.startRestartGroup(r0)
            java.lang.String r1 = "C(AndroidView)100@5020L37,104@5219L7,105@5274L7,111@5657L7,112@5728L7,115@5795L49,114@5741L517:AndroidView.android.kt#z33iqn"
            androidx.compose.runtime.ComposerKt.sourceInformation(r12, r1)
            r1 = r14 & 1
            if (r1 == 0) goto L_0x0018
            r1 = r13 | 6
            goto L_0x0028
        L_0x0018:
            r1 = r13 & 14
            if (r1 != 0) goto L_0x0027
            boolean r1 = r12.changedInstance(r9)
            if (r1 == 0) goto L_0x0024
            r1 = 4
            goto L_0x0025
        L_0x0024:
            r1 = 2
        L_0x0025:
            r1 = r1 | r13
            goto L_0x0028
        L_0x0027:
            r1 = r13
        L_0x0028:
            r2 = r14 & 2
            if (r2 == 0) goto L_0x002f
            r1 = r1 | 48
            goto L_0x003f
        L_0x002f:
            r3 = r13 & 112(0x70, float:1.57E-43)
            if (r3 != 0) goto L_0x003f
            boolean r3 = r12.changed((java.lang.Object) r10)
            if (r3 == 0) goto L_0x003c
            r3 = 32
            goto L_0x003e
        L_0x003c:
            r3 = 16
        L_0x003e:
            r1 = r1 | r3
        L_0x003f:
            r3 = r14 & 4
            if (r3 == 0) goto L_0x0046
            r1 = r1 | 384(0x180, float:5.38E-43)
            goto L_0x0056
        L_0x0046:
            r4 = r13 & 896(0x380, float:1.256E-42)
            if (r4 != 0) goto L_0x0056
            boolean r4 = r12.changedInstance(r11)
            if (r4 == 0) goto L_0x0053
            r4 = 256(0x100, float:3.59E-43)
            goto L_0x0055
        L_0x0053:
            r4 = 128(0x80, float:1.794E-43)
        L_0x0055:
            r1 = r1 | r4
        L_0x0056:
            r4 = r1 & 731(0x2db, float:1.024E-42)
            r5 = 146(0x92, float:2.05E-43)
            if (r4 != r5) goto L_0x006a
            boolean r4 = r12.getSkipping()
            if (r4 != 0) goto L_0x0063
            goto L_0x006a
        L_0x0063:
            r12.skipToGroupEnd()
        L_0x0066:
            r3 = r10
            r4 = r11
            goto L_0x0155
        L_0x006a:
            if (r2 == 0) goto L_0x0070
            androidx.compose.ui.Modifier$Companion r10 = androidx.compose.ui.Modifier.Companion
            androidx.compose.ui.Modifier r10 = (androidx.compose.ui.Modifier) r10
        L_0x0070:
            if (r3 == 0) goto L_0x0074
            kotlin.jvm.functions.Function1<android.view.View, kotlin.Unit> r11 = NoOpUpdate
        L_0x0074:
            boolean r2 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r2 == 0) goto L_0x0080
            r2 = -1
            java.lang.String r3 = "androidx.compose.ui.viewinterop.AndroidView (AndroidView.android.kt:95)"
            androidx.compose.runtime.ComposerKt.traceEventStart(r0, r1, r2, r3)
        L_0x0080:
            r0 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r12.startReplaceableGroup(r0)
            java.lang.String r0 = "CC(remember):Composables.kt#9igjgp"
            androidx.compose.runtime.ComposerKt.sourceInformation(r12, r0)
            java.lang.Object r0 = r12.rememberedValue()
            androidx.compose.runtime.Composer$Companion r2 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r2 = r2.getEmpty()
            if (r0 != r2) goto L_0x009f
            androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher r0 = new androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher
            r0.<init>()
            r12.updateRememberedValue(r0)
        L_0x009f:
            r12.endReplaceableGroup()
            androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher r0 = (androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher) r0
            androidx.compose.ui.viewinterop.AndroidView_androidKt$NoOpScrollConnection$1 r2 = NoOpScrollConnection
            androidx.compose.ui.input.nestedscroll.NestedScrollConnection r2 = (androidx.compose.ui.input.nestedscroll.NestedScrollConnection) r2
            androidx.compose.ui.Modifier r2 = androidx.compose.ui.input.nestedscroll.NestedScrollModifierKt.nestedScroll(r10, r2, r0)
            androidx.compose.ui.Modifier r4 = androidx.compose.ui.ComposedModifierKt.materialize(r12, r2)
            androidx.compose.runtime.ProvidableCompositionLocal r2 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalDensity()
            androidx.compose.runtime.CompositionLocal r2 = (androidx.compose.runtime.CompositionLocal) r2
            r3 = 2023513938(0x789c5f52, float:2.5372864E34)
            java.lang.String r5 = "CC:CompositionLocal.kt#9igjgp"
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(r12, r3, r5)
            java.lang.Object r2 = r12.consume(r2)
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(r12)
            androidx.compose.ui.unit.Density r2 = (androidx.compose.ui.unit.Density) r2
            androidx.compose.runtime.ProvidableCompositionLocal r6 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalLayoutDirection()
            androidx.compose.runtime.CompositionLocal r6 = (androidx.compose.runtime.CompositionLocal) r6
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(r12, r3, r5)
            java.lang.Object r6 = r12.consume(r6)
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(r12)
            r8 = r6
            androidx.compose.ui.unit.LayoutDirection r8 = (androidx.compose.ui.unit.LayoutDirection) r8
            androidx.compose.runtime.ProvidableCompositionLocal r6 = androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalLifecycleOwner()
            androidx.compose.runtime.CompositionLocal r6 = (androidx.compose.runtime.CompositionLocal) r6
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(r12, r3, r5)
            java.lang.Object r6 = r12.consume(r6)
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(r12)
            androidx.lifecycle.LifecycleOwner r6 = (androidx.lifecycle.LifecycleOwner) r6
            androidx.compose.runtime.ProvidableCompositionLocal r7 = androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalSavedStateRegistryOwner()
            androidx.compose.runtime.CompositionLocal r7 = (androidx.compose.runtime.CompositionLocal) r7
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(r12, r3, r5)
            java.lang.Object r3 = r12.consume(r7)
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(r12)
            r7 = r3
            androidx.savedstate.SavedStateRegistryOwner r7 = (androidx.savedstate.SavedStateRegistryOwner) r7
            r1 = r1 & 14
            r1 = r1 | 64
            kotlin.jvm.functions.Function0 r0 = createAndroidViewNodeFactory(r9, r0, r12, r1)
            r1 = 1886828752(0x7076b8d0, float:3.0542695E29)
            r12.startReplaceableGroup(r1)
            java.lang.String r1 = "CC(ComposeNode):Composables.kt#9igjgp"
            androidx.compose.runtime.ComposerKt.sourceInformation(r12, r1)
            androidx.compose.runtime.Applier r1 = r12.getApplier()
            boolean r1 = r1 instanceof androidx.compose.ui.node.UiApplier
            if (r1 != 0) goto L_0x011d
            androidx.compose.runtime.ComposablesKt.invalidApplier()
        L_0x011d:
            r12.startNode()
            boolean r1 = r12.getInserting()
            if (r1 == 0) goto L_0x0131
            androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$$inlined$ComposeNode$1 r1 = new androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$$inlined$ComposeNode$1
            r1.<init>(r0)
            kotlin.jvm.functions.Function0 r1 = (kotlin.jvm.functions.Function0) r1
            r12.createNode(r1)
            goto L_0x0134
        L_0x0131:
            r12.useNode()
        L_0x0134:
            androidx.compose.runtime.Composer r0 = androidx.compose.runtime.Updater.m2444constructorimpl(r12)
            r3 = r0
            r5 = r2
            m5866updateViewHolderParamsOlIkWs8(r3, r4, r5, r6, r7, r8)
            androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$1$1 r1 = androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$1$1.INSTANCE
            kotlin.jvm.functions.Function2 r1 = (kotlin.jvm.functions.Function2) r1
            androidx.compose.runtime.Updater.m2451setimpl((androidx.compose.runtime.Composer) r0, r11, r1)
            r12.endNode()
            r12.endReplaceableGroup()
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto L_0x0066
            androidx.compose.runtime.ComposerKt.traceEventEnd()
            goto L_0x0066
        L_0x0155:
            androidx.compose.runtime.ScopeUpdateScope r10 = r12.endRestartGroup()
            if (r10 != 0) goto L_0x015c
            goto L_0x016a
        L_0x015c:
            androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$2 r11 = new androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$2
            r1 = r11
            r2 = r9
            r5 = r13
            r6 = r14
            r1.<init>(r2, r3, r4, r5, r6)
            kotlin.jvm.functions.Function2 r11 = (kotlin.jvm.functions.Function2) r11
            r10.updateScope(r11)
        L_0x016a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.viewinterop.AndroidView_androidKt.AndroidView(kotlin.jvm.functions.Function1, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00b1  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00b8  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x01c3  */
    /* JADX WARNING: Removed duplicated region for block: B:87:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <T extends android.view.View> void AndroidView(kotlin.jvm.functions.Function1<? super android.content.Context, ? extends T> r18, kotlin.jvm.functions.Function1<? super T, kotlin.Unit> r19, androidx.compose.ui.Modifier r20, kotlin.jvm.functions.Function1<? super T, kotlin.Unit> r21, kotlin.jvm.functions.Function1<? super T, kotlin.Unit> r22, androidx.compose.runtime.Composer r23, int r24, int r25) {
        /*
            r1 = r18
            r2 = r19
            r6 = r24
            java.lang.String r0 = "factory"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "onReset"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            r0 = -841537049(0xffffffffcdd729e7, float:-4.51230944E8)
            r3 = r23
            androidx.compose.runtime.Composer r3 = r3.startRestartGroup(r0)
            java.lang.String r4 = "C(AndroidView)P(!1,3!1,4)203@11119L37,208@11319L7,209@11374L7,215@11757L7,216@11828L7,219@11903L49,218@11841L679:AndroidView.android.kt#z33iqn"
            androidx.compose.runtime.ComposerKt.sourceInformation(r3, r4)
            r4 = r25 & 1
            if (r4 == 0) goto L_0x0025
            r4 = r6 | 6
            goto L_0x0035
        L_0x0025:
            r4 = r6 & 14
            if (r4 != 0) goto L_0x0034
            boolean r4 = r3.changedInstance(r1)
            if (r4 == 0) goto L_0x0031
            r4 = 4
            goto L_0x0032
        L_0x0031:
            r4 = 2
        L_0x0032:
            r4 = r4 | r6
            goto L_0x0035
        L_0x0034:
            r4 = r6
        L_0x0035:
            r5 = r25 & 2
            if (r5 == 0) goto L_0x003c
            r4 = r4 | 48
            goto L_0x004c
        L_0x003c:
            r5 = r6 & 112(0x70, float:1.57E-43)
            if (r5 != 0) goto L_0x004c
            boolean r5 = r3.changedInstance(r2)
            if (r5 == 0) goto L_0x0049
            r5 = 32
            goto L_0x004b
        L_0x0049:
            r5 = 16
        L_0x004b:
            r4 = r4 | r5
        L_0x004c:
            r5 = r25 & 4
            if (r5 == 0) goto L_0x0053
            r4 = r4 | 384(0x180, float:5.38E-43)
            goto L_0x0066
        L_0x0053:
            r7 = r6 & 896(0x380, float:1.256E-42)
            if (r7 != 0) goto L_0x0066
            r7 = r20
            boolean r8 = r3.changed((java.lang.Object) r7)
            if (r8 == 0) goto L_0x0062
            r8 = 256(0x100, float:3.59E-43)
            goto L_0x0064
        L_0x0062:
            r8 = 128(0x80, float:1.794E-43)
        L_0x0064:
            r4 = r4 | r8
            goto L_0x0068
        L_0x0066:
            r7 = r20
        L_0x0068:
            r8 = r25 & 8
            if (r8 == 0) goto L_0x006f
            r4 = r4 | 3072(0xc00, float:4.305E-42)
            goto L_0x0082
        L_0x006f:
            r9 = r6 & 7168(0x1c00, float:1.0045E-41)
            if (r9 != 0) goto L_0x0082
            r9 = r21
            boolean r10 = r3.changedInstance(r9)
            if (r10 == 0) goto L_0x007e
            r10 = 2048(0x800, float:2.87E-42)
            goto L_0x0080
        L_0x007e:
            r10 = 1024(0x400, float:1.435E-42)
        L_0x0080:
            r4 = r4 | r10
            goto L_0x0084
        L_0x0082:
            r9 = r21
        L_0x0084:
            r10 = r25 & 16
            if (r10 == 0) goto L_0x008b
            r4 = r4 | 24576(0x6000, float:3.4438E-41)
            goto L_0x00a0
        L_0x008b:
            r11 = 57344(0xe000, float:8.0356E-41)
            r11 = r11 & r6
            if (r11 != 0) goto L_0x00a0
            r11 = r22
            boolean r12 = r3.changedInstance(r11)
            if (r12 == 0) goto L_0x009c
            r12 = 16384(0x4000, float:2.2959E-41)
            goto L_0x009e
        L_0x009c:
            r12 = 8192(0x2000, float:1.14794E-41)
        L_0x009e:
            r4 = r4 | r12
            goto L_0x00a2
        L_0x00a0:
            r11 = r22
        L_0x00a2:
            r12 = 46811(0xb6db, float:6.5596E-41)
            r12 = r12 & r4
            r13 = 9362(0x2492, float:1.3119E-41)
            if (r12 != r13) goto L_0x00b8
            boolean r12 = r3.getSkipping()
            if (r12 != 0) goto L_0x00b1
            goto L_0x00b8
        L_0x00b1:
            r3.skipToGroupEnd()
            r5 = r7
        L_0x00b5:
            r4 = r9
            goto L_0x01bc
        L_0x00b8:
            if (r5 == 0) goto L_0x00bf
            androidx.compose.ui.Modifier$Companion r5 = androidx.compose.ui.Modifier.Companion
            androidx.compose.ui.Modifier r5 = (androidx.compose.ui.Modifier) r5
            goto L_0x00c0
        L_0x00bf:
            r5 = r7
        L_0x00c0:
            if (r8 == 0) goto L_0x00c5
            kotlin.jvm.functions.Function1<android.view.View, kotlin.Unit> r7 = NoOpUpdate
            r9 = r7
        L_0x00c5:
            if (r10 == 0) goto L_0x00ca
            kotlin.jvm.functions.Function1<android.view.View, kotlin.Unit> r7 = NoOpUpdate
            r11 = r7
        L_0x00ca:
            boolean r7 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r7 == 0) goto L_0x00d6
            r7 = -1
            java.lang.String r8 = "androidx.compose.ui.viewinterop.AndroidView (AndroidView.android.kt:187)"
            androidx.compose.runtime.ComposerKt.traceEventStart(r0, r4, r7, r8)
        L_0x00d6:
            r0 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r3.startReplaceableGroup(r0)
            java.lang.String r0 = "CC(remember):Composables.kt#9igjgp"
            androidx.compose.runtime.ComposerKt.sourceInformation(r3, r0)
            java.lang.Object r0 = r3.rememberedValue()
            androidx.compose.runtime.Composer$Companion r7 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r7 = r7.getEmpty()
            if (r0 != r7) goto L_0x00f5
            androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher r0 = new androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher
            r0.<init>()
            r3.updateRememberedValue(r0)
        L_0x00f5:
            r3.endReplaceableGroup()
            androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher r0 = (androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher) r0
            androidx.compose.ui.viewinterop.AndroidView_androidKt$NoOpScrollConnection$1 r7 = NoOpScrollConnection
            androidx.compose.ui.input.nestedscroll.NestedScrollConnection r7 = (androidx.compose.ui.input.nestedscroll.NestedScrollConnection) r7
            androidx.compose.ui.Modifier r7 = androidx.compose.ui.input.nestedscroll.NestedScrollModifierKt.nestedScroll(r5, r7, r0)
            androidx.compose.ui.Modifier r13 = androidx.compose.ui.ComposedModifierKt.materialize(r3, r7)
            androidx.compose.runtime.ProvidableCompositionLocal r7 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalDensity()
            androidx.compose.runtime.CompositionLocal r7 = (androidx.compose.runtime.CompositionLocal) r7
            r8 = 2023513938(0x789c5f52, float:2.5372864E34)
            java.lang.String r10 = "CC:CompositionLocal.kt#9igjgp"
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(r3, r8, r10)
            java.lang.Object r7 = r3.consume(r7)
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(r3)
            r14 = r7
            androidx.compose.ui.unit.Density r14 = (androidx.compose.ui.unit.Density) r14
            androidx.compose.runtime.ProvidableCompositionLocal r7 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalLayoutDirection()
            androidx.compose.runtime.CompositionLocal r7 = (androidx.compose.runtime.CompositionLocal) r7
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(r3, r8, r10)
            java.lang.Object r7 = r3.consume(r7)
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(r3)
            r17 = r7
            androidx.compose.ui.unit.LayoutDirection r17 = (androidx.compose.ui.unit.LayoutDirection) r17
            androidx.compose.runtime.ProvidableCompositionLocal r7 = androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalLifecycleOwner()
            androidx.compose.runtime.CompositionLocal r7 = (androidx.compose.runtime.CompositionLocal) r7
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(r3, r8, r10)
            java.lang.Object r7 = r3.consume(r7)
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(r3)
            r15 = r7
            androidx.lifecycle.LifecycleOwner r15 = (androidx.lifecycle.LifecycleOwner) r15
            androidx.compose.runtime.ProvidableCompositionLocal r7 = androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalSavedStateRegistryOwner()
            androidx.compose.runtime.CompositionLocal r7 = (androidx.compose.runtime.CompositionLocal) r7
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(r3, r8, r10)
            java.lang.Object r7 = r3.consume(r7)
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(r3)
            r16 = r7
            androidx.savedstate.SavedStateRegistryOwner r16 = (androidx.savedstate.SavedStateRegistryOwner) r16
            r4 = r4 & 14
            r4 = r4 | 64
            kotlin.jvm.functions.Function0 r0 = createAndroidViewNodeFactory(r1, r0, r3, r4)
            r4 = 1405779621(0x53ca7ea5, float:1.73941627E12)
            r3.startReplaceableGroup(r4)
            java.lang.String r4 = "CC(ReusableComposeNode):Composables.kt#9igjgp"
            androidx.compose.runtime.ComposerKt.sourceInformation(r3, r4)
            androidx.compose.runtime.Applier r4 = r3.getApplier()
            boolean r4 = r4 instanceof androidx.compose.ui.node.UiApplier
            if (r4 != 0) goto L_0x0177
            androidx.compose.runtime.ComposablesKt.invalidApplier()
        L_0x0177:
            r3.startReusableNode()
            boolean r4 = r3.getInserting()
            if (r4 == 0) goto L_0x018b
            androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$$inlined$ReusableComposeNode$1 r4 = new androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$$inlined$ReusableComposeNode$1
            r4.<init>(r0)
            kotlin.jvm.functions.Function0 r4 = (kotlin.jvm.functions.Function0) r4
            r3.createNode(r4)
            goto L_0x018e
        L_0x018b:
            r3.useNode()
        L_0x018e:
            androidx.compose.runtime.Composer r0 = androidx.compose.runtime.Updater.m2444constructorimpl(r3)
            r12 = r0
            m5866updateViewHolderParamsOlIkWs8(r12, r13, r14, r15, r16, r17)
            androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$3$1 r4 = androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$3$1.INSTANCE
            kotlin.jvm.functions.Function2 r4 = (kotlin.jvm.functions.Function2) r4
            androidx.compose.runtime.Updater.m2451setimpl((androidx.compose.runtime.Composer) r0, r2, r4)
            androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$3$2 r4 = androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$3$2.INSTANCE
            kotlin.jvm.functions.Function2 r4 = (kotlin.jvm.functions.Function2) r4
            androidx.compose.runtime.Updater.m2451setimpl((androidx.compose.runtime.Composer) r0, r9, r4)
            androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$3$3 r4 = androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$3$3.INSTANCE
            kotlin.jvm.functions.Function2 r4 = (kotlin.jvm.functions.Function2) r4
            androidx.compose.runtime.Updater.m2451setimpl((androidx.compose.runtime.Composer) r0, r11, r4)
            r3.endNode()
            r3.endReplaceableGroup()
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto L_0x00b5
            androidx.compose.runtime.ComposerKt.traceEventEnd()
            goto L_0x00b5
        L_0x01bc:
            androidx.compose.runtime.ScopeUpdateScope r8 = r3.endRestartGroup()
            if (r8 != 0) goto L_0x01c3
            goto L_0x01d8
        L_0x01c3:
            androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$4 r9 = new androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$4
            r0 = r9
            r1 = r18
            r2 = r19
            r3 = r5
            r5 = r11
            r6 = r24
            r7 = r25
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            kotlin.jvm.functions.Function2 r9 = (kotlin.jvm.functions.Function2) r9
            r8.updateScope(r9)
        L_0x01d8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.viewinterop.AndroidView_androidKt.AndroidView(kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    private static final <T extends View> Function0<LayoutNode> createAndroidViewNodeFactory(Function1<? super Context, ? extends T> function1, NestedScrollDispatcher nestedScrollDispatcher, Composer composer, int i) {
        composer.startReplaceableGroup(-430628662);
        ComposerKt.sourceInformation(composer, "C(createAndroidViewNodeFactory)P(1)240@12710L7,241@12744L28,242@12824L7,243@12851L23:AndroidView.android.kt#z33iqn");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-430628662, i, -1, "androidx.compose.ui.viewinterop.createAndroidViewNodeFactory (AndroidView.android.kt:236)");
        }
        ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object consume = composer.consume(AndroidCompositionLocals_androidKt.getLocalContext());
        ComposerKt.sourceInformationMarkerEnd(composer);
        CompositionContext rememberCompositionContext = ComposablesKt.rememberCompositionContext(composer, 0);
        ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object consume2 = composer.consume(SaveableStateRegistryKt.getLocalSaveableStateRegistry());
        ComposerKt.sourceInformationMarkerEnd(composer);
        Function0<LayoutNode> androidView_androidKt$createAndroidViewNodeFactory$1 = new AndroidView_androidKt$createAndroidViewNodeFactory$1((Context) consume, function1, rememberCompositionContext, nestedScrollDispatcher, (SaveableStateRegistry) consume2, String.valueOf(ComposablesKt.getCurrentCompositeKeyHash(composer, 0)));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return androidView_androidKt$createAndroidViewNodeFactory$1;
    }

    /* renamed from: updateViewHolderParams-OlIkWs8  reason: not valid java name */
    private static final <T extends View> void m5866updateViewHolderParamsOlIkWs8(Composer composer, Modifier modifier, Density density, LifecycleOwner lifecycleOwner, SavedStateRegistryOwner savedStateRegistryOwner, LayoutDirection layoutDirection) {
        Updater.m2451setimpl(composer, modifier, AndroidView_androidKt$updateViewHolderParams$1.INSTANCE);
        Updater.m2451setimpl(composer, density, AndroidView_androidKt$updateViewHolderParams$2.INSTANCE);
        Updater.m2451setimpl(composer, lifecycleOwner, AndroidView_androidKt$updateViewHolderParams$3.INSTANCE);
        Updater.m2451setimpl(composer, savedStateRegistryOwner, AndroidView_androidKt$updateViewHolderParams$4.INSTANCE);
        Updater.m2451setimpl(composer, layoutDirection, AndroidView_androidKt$updateViewHolderParams$5.INSTANCE);
    }

    /* access modifiers changed from: private */
    public static final <T extends View> ViewFactoryHolder<T> requireViewFactoryHolder(LayoutNode layoutNode) {
        AndroidViewHolder interopViewFactoryHolder$ui_release = layoutNode.getInteropViewFactoryHolder$ui_release();
        if (interopViewFactoryHolder$ui_release != null) {
            Intrinsics.checkNotNull(interopViewFactoryHolder$ui_release, "null cannot be cast to non-null type androidx.compose.ui.viewinterop.ViewFactoryHolder<T of androidx.compose.ui.viewinterop.AndroidView_androidKt.requireViewFactoryHolder>");
            return (ViewFactoryHolder) interopViewFactoryHolder$ui_release;
        }
        throw new IllegalStateException("Required value was null.".toString());
    }
}
