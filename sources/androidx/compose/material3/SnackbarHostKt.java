package androidx.compose.material3;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.platform.AccessibilityManager;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000h\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a:\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\u0017\u0010\n\u001a\u0013\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00050\u000b¢\u0006\u0002\b\fH\u0003¢\u0006\u0002\u0010\r\u001a:\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\b\u001a\u00020\t2\u0019\b\u0002\u0010\u0011\u001a\u0013\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00050\u000b¢\u0006\u0002\b\fH\u0007¢\u0006\u0002\u0010\u0012\u001a9\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u000e\b\u0002\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00050\u001bH\u0003¢\u0006\u0002\u0010\u001c\u001a)\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0003¢\u0006\u0002\u0010\u001e\u001a\u001e\u0010\u001f\u001a\u00020 *\u00020!2\u0006\u0010\"\u001a\u00020\u00192\b\u0010#\u001a\u0004\u0018\u00010$H\u0000\"\u000e\u0010\u0000\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000*b\b\u0002\u0010%\"-\u0012\u001e\u0012\u001c\u0012\u0004\u0012\u00020\u00050\u001b¢\u0006\u0002\b\f¢\u0006\f\b&\u0012\b\b'\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u00050\u000b¢\u0006\u0002\b\f2-\u0012\u001e\u0012\u001c\u0012\u0004\u0012\u00020\u00050\u001b¢\u0006\u0002\b\f¢\u0006\f\b&\u0012\b\b'\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u00050\u000b¢\u0006\u0002\b\f¨\u0006("}, d2 = {"SnackbarFadeInMillis", "", "SnackbarFadeOutMillis", "SnackbarInBetweenDelayMillis", "FadeInFadeOutWithScale", "", "current", "Landroidx/compose/material3/SnackbarData;", "modifier", "Landroidx/compose/ui/Modifier;", "content", "Lkotlin/Function1;", "Landroidx/compose/runtime/Composable;", "(Landroidx/compose/material3/SnackbarData;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "SnackbarHost", "hostState", "Landroidx/compose/material3/SnackbarHostState;", "snackbar", "(Landroidx/compose/material3/SnackbarHostState;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "animatedOpacity", "Landroidx/compose/runtime/State;", "", "animation", "Landroidx/compose/animation/core/AnimationSpec;", "visible", "", "onAnimationFinish", "Lkotlin/Function0;", "(Landroidx/compose/animation/core/AnimationSpec;ZLkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;", "animatedScale", "(Landroidx/compose/animation/core/AnimationSpec;ZLandroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "toMillis", "", "Landroidx/compose/material3/SnackbarDuration;", "hasAction", "accessibilityManager", "Landroidx/compose/ui/platform/AccessibilityManager;", "FadeInFadeOutTransition", "Lkotlin/ParameterName;", "name", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: SnackbarHost.kt */
public final class SnackbarHostKt {
    private static final int SnackbarFadeInMillis = 150;
    private static final int SnackbarFadeOutMillis = 75;
    private static final int SnackbarInBetweenDelayMillis = 0;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* compiled from: SnackbarHost.kt */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|2|3|4|5|6|7|9) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        static {
            /*
                androidx.compose.material3.SnackbarDuration[] r0 = androidx.compose.material3.SnackbarDuration.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                androidx.compose.material3.SnackbarDuration r1 = androidx.compose.material3.SnackbarDuration.Indefinite     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                androidx.compose.material3.SnackbarDuration r1 = androidx.compose.material3.SnackbarDuration.Long     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                androidx.compose.material3.SnackbarDuration r1 = androidx.compose.material3.SnackbarDuration.Short     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                $EnumSwitchMapping$0 = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.SnackbarHostKt.WhenMappings.<clinit>():void");
        }
    }

    /* JADX WARNING: Failed to insert additional move for type inference */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void SnackbarHost(androidx.compose.material3.SnackbarHostState r7, androidx.compose.ui.Modifier r8, kotlin.jvm.functions.Function3<? super androidx.compose.material3.SnackbarData, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r9, androidx.compose.runtime.Composer r10, int r11, int r12) {
        /*
            java.lang.String r0 = "hostState"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            r0 = 464178177(0x1baacc01, float:2.8255975E-22)
            androidx.compose.runtime.Composer r10 = r10.startRestartGroup(r0)
            java.lang.String r1 = "C(SnackbarHost)222@9266L7,223@9278L356,233@9639L134:SnackbarHost.kt#uh7d8r"
            androidx.compose.runtime.ComposerKt.sourceInformation(r10, r1)
            r1 = r12 & 1
            if (r1 == 0) goto L_0x0019
            r1 = r11 | 6
            goto L_0x0029
        L_0x0019:
            r1 = r11 & 14
            if (r1 != 0) goto L_0x0028
            boolean r1 = r10.changed((java.lang.Object) r7)
            if (r1 == 0) goto L_0x0025
            r1 = 4
            goto L_0x0026
        L_0x0025:
            r1 = 2
        L_0x0026:
            r1 = r1 | r11
            goto L_0x0029
        L_0x0028:
            r1 = r11
        L_0x0029:
            r2 = r12 & 2
            if (r2 == 0) goto L_0x0030
            r1 = r1 | 48
            goto L_0x0040
        L_0x0030:
            r3 = r11 & 112(0x70, float:1.57E-43)
            if (r3 != 0) goto L_0x0040
            boolean r3 = r10.changed((java.lang.Object) r8)
            if (r3 == 0) goto L_0x003d
            r3 = 32
            goto L_0x003f
        L_0x003d:
            r3 = 16
        L_0x003f:
            r1 = r1 | r3
        L_0x0040:
            r3 = r12 & 4
            if (r3 == 0) goto L_0x0047
            r1 = r1 | 384(0x180, float:5.38E-43)
            goto L_0x0057
        L_0x0047:
            r4 = r11 & 896(0x380, float:1.256E-42)
            if (r4 != 0) goto L_0x0057
            boolean r4 = r10.changedInstance(r9)
            if (r4 == 0) goto L_0x0054
            r4 = 256(0x100, float:3.59E-43)
            goto L_0x0056
        L_0x0054:
            r4 = 128(0x80, float:1.794E-43)
        L_0x0056:
            r1 = r1 | r4
        L_0x0057:
            r4 = r1 & 731(0x2db, float:1.024E-42)
            r5 = 146(0x92, float:2.05E-43)
            if (r4 != r5) goto L_0x006a
            boolean r4 = r10.getSkipping()
            if (r4 != 0) goto L_0x0064
            goto L_0x006a
        L_0x0064:
            r10.skipToGroupEnd()
        L_0x0067:
            r3 = r8
            r4 = r9
            goto L_0x00c9
        L_0x006a:
            if (r2 == 0) goto L_0x0070
            androidx.compose.ui.Modifier$Companion r8 = androidx.compose.ui.Modifier.Companion
            androidx.compose.ui.Modifier r8 = (androidx.compose.ui.Modifier) r8
        L_0x0070:
            if (r3 == 0) goto L_0x0078
            androidx.compose.material3.ComposableSingletons$SnackbarHostKt r9 = androidx.compose.material3.ComposableSingletons$SnackbarHostKt.INSTANCE
            kotlin.jvm.functions.Function3 r9 = r9.m1271getLambda1$material3_release()
        L_0x0078:
            boolean r2 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r2 == 0) goto L_0x0085
            r2 = -1
            java.lang.String r3 = "androidx.compose.material3.SnackbarHost (SnackbarHost.kt:216)"
            androidx.compose.runtime.ComposerKt.traceEventStart(r0, r1, r2, r3)
        L_0x0085:
            androidx.compose.material3.SnackbarData r0 = r7.getCurrentSnackbarData()
            androidx.compose.runtime.ProvidableCompositionLocal r2 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalAccessibilityManager()
            androidx.compose.runtime.CompositionLocal r2 = (androidx.compose.runtime.CompositionLocal) r2
            r3 = 2023513938(0x789c5f52, float:2.5372864E34)
            java.lang.String r4 = "CC:CompositionLocal.kt#9igjgp"
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(r10, r3, r4)
            java.lang.Object r2 = r10.consume(r2)
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(r10)
            androidx.compose.ui.platform.AccessibilityManager r2 = (androidx.compose.ui.platform.AccessibilityManager) r2
            androidx.compose.material3.SnackbarHostKt$SnackbarHost$1 r3 = new androidx.compose.material3.SnackbarHostKt$SnackbarHost$1
            r4 = 0
            r3.<init>(r0, r2, r4)
            kotlin.jvm.functions.Function2 r3 = (kotlin.jvm.functions.Function2) r3
            r2 = 64
            androidx.compose.runtime.EffectsKt.LaunchedEffect((java.lang.Object) r0, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) r3, (androidx.compose.runtime.Composer) r10, (int) r2)
            androidx.compose.material3.SnackbarData r0 = r7.getCurrentSnackbarData()
            r2 = r1 & 112(0x70, float:1.57E-43)
            r1 = r1 & 896(0x380, float:1.256E-42)
            r5 = r2 | r1
            r6 = 0
            r1 = r0
            r2 = r8
            r3 = r9
            r4 = r10
            FadeInFadeOutWithScale(r1, r2, r3, r4, r5, r6)
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto L_0x0067
            androidx.compose.runtime.ComposerKt.traceEventEnd()
            goto L_0x0067
        L_0x00c9:
            androidx.compose.runtime.ScopeUpdateScope r8 = r10.endRestartGroup()
            if (r8 != 0) goto L_0x00d0
            goto L_0x00de
        L_0x00d0:
            androidx.compose.material3.SnackbarHostKt$SnackbarHost$2 r9 = new androidx.compose.material3.SnackbarHostKt$SnackbarHost$2
            r1 = r9
            r2 = r7
            r5 = r11
            r6 = r12
            r1.<init>(r2, r3, r4, r5, r6)
            kotlin.jvm.functions.Function2 r9 = (kotlin.jvm.functions.Function2) r9
            r8.updateScope(r9)
        L_0x00de:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.SnackbarHostKt.SnackbarHost(androidx.compose.material3.SnackbarHostState, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function3, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final long toMillis(SnackbarDuration snackbarDuration, boolean z, AccessibilityManager accessibilityManager) {
        long j;
        Intrinsics.checkNotNullParameter(snackbarDuration, "<this>");
        int i = WhenMappings.$EnumSwitchMapping$0[snackbarDuration.ordinal()];
        if (i == 1) {
            j = Long.MAX_VALUE;
        } else if (i == 2) {
            j = 10000;
        } else if (i == 3) {
            j = 4000;
        } else {
            throw new NoWhenBranchMatchedException();
        }
        long j2 = j;
        if (accessibilityManager == null) {
            return j2;
        }
        return accessibilityManager.calculateRecommendedTimeoutMillis(j2, true, true, z);
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x004e  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x02a0  */
    /* JADX WARNING: Removed duplicated region for block: B:80:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void FadeInFadeOutWithScale(androidx.compose.material3.SnackbarData r17, androidx.compose.ui.Modifier r18, kotlin.jvm.functions.Function3<? super androidx.compose.material3.SnackbarData, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r19, androidx.compose.runtime.Composer r20, int r21, int r22) {
        /*
            r1 = r17
            r3 = r19
            r4 = r21
            r0 = -1316639904(0xffffffffb185ab60, float:-3.8902925E-9)
            r2 = r20
            androidx.compose.runtime.Composer r2 = r2.startRestartGroup(r0)
            java.lang.String r5 = "C(FadeInFadeOutWithScale)P(1,2)343@12564L48,397@14811L242:SnackbarHost.kt#uh7d8r"
            androidx.compose.runtime.ComposerKt.sourceInformation(r2, r5)
            r5 = r22 & 1
            if (r5 == 0) goto L_0x001b
            r5 = r4 | 6
            goto L_0x002b
        L_0x001b:
            r5 = r4 & 14
            if (r5 != 0) goto L_0x002a
            boolean r5 = r2.changed((java.lang.Object) r1)
            if (r5 == 0) goto L_0x0027
            r5 = 4
            goto L_0x0028
        L_0x0027:
            r5 = 2
        L_0x0028:
            r5 = r5 | r4
            goto L_0x002b
        L_0x002a:
            r5 = r4
        L_0x002b:
            r6 = r22 & 2
            if (r6 == 0) goto L_0x0032
            r5 = r5 | 48
            goto L_0x0045
        L_0x0032:
            r7 = r4 & 112(0x70, float:1.57E-43)
            if (r7 != 0) goto L_0x0045
            r7 = r18
            boolean r8 = r2.changed((java.lang.Object) r7)
            if (r8 == 0) goto L_0x0041
            r8 = 32
            goto L_0x0043
        L_0x0041:
            r8 = 16
        L_0x0043:
            r5 = r5 | r8
            goto L_0x0047
        L_0x0045:
            r7 = r18
        L_0x0047:
            r8 = r22 & 4
            if (r8 == 0) goto L_0x004e
            r5 = r5 | 384(0x180, float:5.38E-43)
            goto L_0x005e
        L_0x004e:
            r8 = r4 & 896(0x380, float:1.256E-42)
            if (r8 != 0) goto L_0x005e
            boolean r8 = r2.changedInstance(r3)
            if (r8 == 0) goto L_0x005b
            r8 = 256(0x100, float:3.59E-43)
            goto L_0x005d
        L_0x005b:
            r8 = 128(0x80, float:1.794E-43)
        L_0x005d:
            r5 = r5 | r8
        L_0x005e:
            r8 = r5 & 731(0x2db, float:1.024E-42)
            r9 = 146(0x92, float:2.05E-43)
            if (r8 != r9) goto L_0x0071
            boolean r8 = r2.getSkipping()
            if (r8 != 0) goto L_0x006b
            goto L_0x0071
        L_0x006b:
            r2.skipToGroupEnd()
            r6 = r7
            goto L_0x0299
        L_0x0071:
            if (r6 == 0) goto L_0x0078
            androidx.compose.ui.Modifier$Companion r6 = androidx.compose.ui.Modifier.Companion
            androidx.compose.ui.Modifier r6 = (androidx.compose.ui.Modifier) r6
            goto L_0x0079
        L_0x0078:
            r6 = r7
        L_0x0079:
            boolean r7 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r7 == 0) goto L_0x0086
            r7 = -1
            java.lang.String r8 = "androidx.compose.material3.FadeInFadeOutWithScale (SnackbarHost.kt:338)"
            androidx.compose.runtime.ComposerKt.traceEventStart(r0, r5, r7, r8)
        L_0x0086:
            r0 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r2.startReplaceableGroup(r0)
            java.lang.String r0 = "CC(remember):Composables.kt#9igjgp"
            androidx.compose.runtime.ComposerKt.sourceInformation(r2, r0)
            java.lang.Object r0 = r2.rememberedValue()
            androidx.compose.runtime.Composer$Companion r7 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r7 = r7.getEmpty()
            if (r0 != r7) goto L_0x00a5
            androidx.compose.material3.FadeInFadeOutState r0 = new androidx.compose.material3.FadeInFadeOutState
            r0.<init>()
            r2.updateRememberedValue(r0)
        L_0x00a5:
            r2.endReplaceableGroup()
            androidx.compose.material3.FadeInFadeOutState r0 = (androidx.compose.material3.FadeInFadeOutState) r0
            java.lang.Object r7 = r0.getCurrent()
            boolean r7 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r1, (java.lang.Object) r7)
            r8 = 1
            if (r7 != 0) goto L_0x0133
            r0.setCurrent(r1)
            java.util.List r7 = r0.getItems()
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            java.util.ArrayList r9 = new java.util.ArrayList
            r10 = 10
            int r10 = kotlin.collections.CollectionsKt.collectionSizeOrDefault(r7, r10)
            r9.<init>(r10)
            java.util.Collection r9 = (java.util.Collection) r9
            java.util.Iterator r7 = r7.iterator()
        L_0x00cf:
            boolean r10 = r7.hasNext()
            if (r10 == 0) goto L_0x00e5
            java.lang.Object r10 = r7.next()
            androidx.compose.material3.FadeInFadeOutAnimationItem r10 = (androidx.compose.material3.FadeInFadeOutAnimationItem) r10
            java.lang.Object r10 = r10.getKey()
            androidx.compose.material3.SnackbarData r10 = (androidx.compose.material3.SnackbarData) r10
            r9.add(r10)
            goto L_0x00cf
        L_0x00e5:
            java.util.List r9 = (java.util.List) r9
            java.util.Collection r9 = (java.util.Collection) r9
            java.util.List r7 = kotlin.collections.CollectionsKt.toMutableList(r9)
            boolean r9 = r7.contains(r1)
            if (r9 != 0) goto L_0x00f6
            r7.add(r1)
        L_0x00f6:
            java.util.List r9 = r0.getItems()
            r9.clear()
            r9 = r7
            java.lang.Iterable r9 = (java.lang.Iterable) r9
            java.util.List r9 = kotlin.collections.CollectionsKt.filterNotNull(r9)
            java.lang.Iterable r9 = (java.lang.Iterable) r9
            java.util.List r10 = r0.getItems()
            java.util.Collection r10 = (java.util.Collection) r10
            java.util.Iterator r9 = r9.iterator()
        L_0x0110:
            boolean r11 = r9.hasNext()
            if (r11 == 0) goto L_0x0133
            java.lang.Object r11 = r9.next()
            androidx.compose.material3.SnackbarData r11 = (androidx.compose.material3.SnackbarData) r11
            androidx.compose.material3.FadeInFadeOutAnimationItem r12 = new androidx.compose.material3.FadeInFadeOutAnimationItem
            androidx.compose.material3.SnackbarHostKt$FadeInFadeOutWithScale$1$1 r13 = new androidx.compose.material3.SnackbarHostKt$FadeInFadeOutWithScale$1$1
            r13.<init>(r11, r1, r7, r0)
            r14 = 1365430839(0x5162d237, float:6.0886839E10)
            androidx.compose.runtime.internal.ComposableLambda r13 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(r2, r14, r8, r13)
            kotlin.jvm.functions.Function3 r13 = (kotlin.jvm.functions.Function3) r13
            r12.<init>(r11, r13)
            r10.add(r12)
            goto L_0x0110
        L_0x0133:
            int r7 = r5 >> 3
            r7 = r7 & 14
            r9 = 733328855(0x2bb5b5d7, float:1.2911294E-12)
            r2.startReplaceableGroup(r9)
            java.lang.String r9 = "CC(Box)P(2,1,3)70@3267L67,71@3339L130:Box.kt#2w3rfo"
            androidx.compose.runtime.ComposerKt.sourceInformation(r2, r9)
            androidx.compose.ui.Alignment$Companion r9 = androidx.compose.ui.Alignment.Companion
            androidx.compose.ui.Alignment r9 = r9.getTopStart()
            int r10 = r7 >> 3
            r11 = r10 & 14
            r10 = r10 & 112(0x70, float:1.57E-43)
            r10 = r10 | r11
            r11 = 0
            androidx.compose.ui.layout.MeasurePolicy r9 = androidx.compose.foundation.layout.BoxKt.rememberBoxMeasurePolicy(r9, r11, r2, r10)
            int r7 = r7 << 3
            r7 = r7 & 112(0x70, float:1.57E-43)
            r10 = -1323940314(0xffffffffb1164626, float:-2.1867748E-9)
            r2.startReplaceableGroup(r10)
            java.lang.String r10 = "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh"
            androidx.compose.runtime.ComposerKt.sourceInformation(r2, r10)
            androidx.compose.runtime.ProvidableCompositionLocal r10 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalDensity()
            androidx.compose.runtime.CompositionLocal r10 = (androidx.compose.runtime.CompositionLocal) r10
            r12 = 2023513938(0x789c5f52, float:2.5372864E34)
            java.lang.String r13 = "C:CompositionLocal.kt#9igjgp"
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(r2, r12, r13)
            java.lang.Object r10 = r2.consume(r10)
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(r2)
            androidx.compose.ui.unit.Density r10 = (androidx.compose.ui.unit.Density) r10
            androidx.compose.runtime.ProvidableCompositionLocal r14 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalLayoutDirection()
            androidx.compose.runtime.CompositionLocal r14 = (androidx.compose.runtime.CompositionLocal) r14
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(r2, r12, r13)
            java.lang.Object r14 = r2.consume(r14)
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(r2)
            androidx.compose.ui.unit.LayoutDirection r14 = (androidx.compose.ui.unit.LayoutDirection) r14
            androidx.compose.runtime.ProvidableCompositionLocal r15 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalViewConfiguration()
            androidx.compose.runtime.CompositionLocal r15 = (androidx.compose.runtime.CompositionLocal) r15
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(r2, r12, r13)
            java.lang.Object r12 = r2.consume(r15)
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(r2)
            androidx.compose.ui.platform.ViewConfiguration r12 = (androidx.compose.ui.platform.ViewConfiguration) r12
            androidx.compose.ui.node.ComposeUiNode$Companion r13 = androidx.compose.ui.node.ComposeUiNode.Companion
            kotlin.jvm.functions.Function0 r13 = r13.getConstructor()
            kotlin.jvm.functions.Function3 r15 = androidx.compose.ui.layout.LayoutKt.materializerOf(r6)
            int r7 = r7 << 9
            r7 = r7 & 7168(0x1c00, float:1.0045E-41)
            r16 = 6
            r7 = r7 | 6
            androidx.compose.runtime.Applier r8 = r2.getApplier()
            boolean r8 = r8 instanceof androidx.compose.runtime.Applier
            if (r8 != 0) goto L_0x01bb
            androidx.compose.runtime.ComposablesKt.invalidApplier()
        L_0x01bb:
            r2.startReusableNode()
            boolean r8 = r2.getInserting()
            if (r8 == 0) goto L_0x01c8
            r2.createNode(r13)
            goto L_0x01cb
        L_0x01c8:
            r2.useNode()
        L_0x01cb:
            r2.disableReusing()
            androidx.compose.runtime.Composer r8 = androidx.compose.runtime.Updater.m2444constructorimpl(r2)
            androidx.compose.ui.node.ComposeUiNode$Companion r13 = androidx.compose.ui.node.ComposeUiNode.Companion
            kotlin.jvm.functions.Function2 r13 = r13.getSetMeasurePolicy()
            androidx.compose.runtime.Updater.m2451setimpl((androidx.compose.runtime.Composer) r8, r9, r13)
            androidx.compose.ui.node.ComposeUiNode$Companion r9 = androidx.compose.ui.node.ComposeUiNode.Companion
            kotlin.jvm.functions.Function2 r9 = r9.getSetDensity()
            androidx.compose.runtime.Updater.m2451setimpl((androidx.compose.runtime.Composer) r8, r10, r9)
            androidx.compose.ui.node.ComposeUiNode$Companion r9 = androidx.compose.ui.node.ComposeUiNode.Companion
            kotlin.jvm.functions.Function2 r9 = r9.getSetLayoutDirection()
            androidx.compose.runtime.Updater.m2451setimpl((androidx.compose.runtime.Composer) r8, r14, r9)
            androidx.compose.ui.node.ComposeUiNode$Companion r9 = androidx.compose.ui.node.ComposeUiNode.Companion
            kotlin.jvm.functions.Function2 r9 = r9.getSetViewConfiguration()
            androidx.compose.runtime.Updater.m2451setimpl((androidx.compose.runtime.Composer) r8, r12, r9)
            r2.enableReusing()
            androidx.compose.runtime.Composer r8 = androidx.compose.runtime.SkippableUpdater.m2436constructorimpl(r2)
            androidx.compose.runtime.SkippableUpdater r8 = androidx.compose.runtime.SkippableUpdater.m2435boximpl(r8)
            int r7 = r7 >> 3
            r7 = r7 & 112(0x70, float:1.57E-43)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r15.invoke(r8, r2, r7)
            r7 = 2058660585(0x7ab4aae9, float:4.6903995E35)
            r2.startReplaceableGroup(r7)
            r7 = -1253629305(0xffffffffb5472287, float:-7.418352E-7)
            java.lang.String r8 = "C72@3384L9:Box.kt#2w3rfo"
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(r2, r7, r8)
            androidx.compose.foundation.layout.BoxScopeInstance r7 = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE
            androidx.compose.foundation.layout.BoxScope r7 = (androidx.compose.foundation.layout.BoxScope) r7
            r7 = -1606179266(0xffffffffa043a63e, float:-1.6572147E-19)
            java.lang.String r8 = "C398@14849L21:SnackbarHost.kt#uh7d8r"
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(r2, r7, r8)
            androidx.compose.runtime.RecomposeScope r7 = androidx.compose.runtime.ComposablesKt.getCurrentRecomposeScope(r2, r11)
            r0.setScope(r7)
            r7 = -733277355(0xffffffffd44b1355, float:-3.4888108E12)
            r2.startReplaceableGroup(r7)
            java.lang.String r7 = ""
            androidx.compose.runtime.ComposerKt.sourceInformation(r2, r7)
            java.util.List r0 = r0.getItems()
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Iterator r0 = r0.iterator()
        L_0x0242:
            boolean r7 = r0.hasNext()
            if (r7 == 0) goto L_0x027b
            java.lang.Object r7 = r0.next()
            androidx.compose.material3.FadeInFadeOutAnimationItem r7 = (androidx.compose.material3.FadeInFadeOutAnimationItem) r7
            java.lang.Object r8 = r7.component1()
            androidx.compose.material3.SnackbarData r8 = (androidx.compose.material3.SnackbarData) r8
            kotlin.jvm.functions.Function3 r7 = r7.component2()
            r9 = 870027328(0x33db9040, float:1.0224221E-7)
            r2.startMovableGroup(r9, r8)
            java.lang.String r9 = "401@14960L63"
            androidx.compose.runtime.ComposerKt.sourceInformation(r2, r9)
            androidx.compose.material3.SnackbarHostKt$FadeInFadeOutWithScale$2$1$1 r9 = new androidx.compose.material3.SnackbarHostKt$FadeInFadeOutWithScale$2$1$1
            r9.<init>(r3, r8, r5)
            r8 = -1462081411(0xffffffffa8da687d, float:-2.4248177E-14)
            r10 = 1
            androidx.compose.runtime.internal.ComposableLambda r8 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(r2, r8, r10, r9)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r16)
            r7.invoke(r8, r2, r9)
            r2.endMovableGroup()
            goto L_0x0242
        L_0x027b:
            r2.endReplaceableGroup()
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(r2)
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(r2)
            r2.endReplaceableGroup()
            r2.endNode()
            r2.endReplaceableGroup()
            r2.endReplaceableGroup()
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto L_0x0299
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L_0x0299:
            androidx.compose.runtime.ScopeUpdateScope r7 = r2.endRestartGroup()
            if (r7 != 0) goto L_0x02a0
            goto L_0x02b4
        L_0x02a0:
            androidx.compose.material3.SnackbarHostKt$FadeInFadeOutWithScale$3 r8 = new androidx.compose.material3.SnackbarHostKt$FadeInFadeOutWithScale$3
            r0 = r8
            r1 = r17
            r2 = r6
            r3 = r19
            r4 = r21
            r5 = r22
            r0.<init>(r1, r2, r3, r4, r5)
            kotlin.jvm.functions.Function2 r8 = (kotlin.jvm.functions.Function2) r8
            r7.updateScope(r8)
        L_0x02b4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.SnackbarHostKt.FadeInFadeOutWithScale(androidx.compose.material3.SnackbarData, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function3, androidx.compose.runtime.Composer, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final State<Float> animatedOpacity(AnimationSpec<Float> animationSpec, boolean z, Function0<Unit> function0, Composer composer, int i, int i2) {
        composer.startReplaceableGroup(1431889134);
        ComposerKt.sourceInformation(composer, "C(animatedOpacity)P(!1,2)429@15701L49,430@15755L169:SnackbarHost.kt#uh7d8r");
        if ((i2 & 4) != 0) {
            function0 = SnackbarHostKt$animatedOpacity$1.INSTANCE;
        }
        Function0<Unit> function02 = function0;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1431889134, i, -1, "androidx.compose.material3.animatedOpacity (SnackbarHost.kt:424)");
        }
        composer.startReplaceableGroup(-492369756);
        ComposerKt.sourceInformation(composer, "CC(remember):Composables.kt#9igjgp");
        Object rememberedValue = composer.rememberedValue();
        if (rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = AnimatableKt.Animatable$default(!z ? 1.0f : 0.0f, 0.0f, 2, (Object) null);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        Animatable animatable = (Animatable) rememberedValue;
        EffectsKt.LaunchedEffect((Object) Boolean.valueOf(z), (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) new SnackbarHostKt$animatedOpacity$2(animatable, z, animationSpec, function02, (Continuation<? super SnackbarHostKt$animatedOpacity$2>) null), composer, ((i >> 3) & 14) | 64);
        State<Float> asState = animatable.asState();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return asState;
    }

    /* access modifiers changed from: private */
    public static final State<Float> animatedScale(AnimationSpec<Float> animationSpec, boolean z, Composer composer, int i) {
        composer.startReplaceableGroup(1966809761);
        ComposerKt.sourceInformation(composer, "C(animatedScale)442@16076L51,443@16132L143:SnackbarHost.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1966809761, i, -1, "androidx.compose.material3.animatedScale (SnackbarHost.kt:441)");
        }
        composer.startReplaceableGroup(-492369756);
        ComposerKt.sourceInformation(composer, "CC(remember):Composables.kt#9igjgp");
        Object rememberedValue = composer.rememberedValue();
        if (rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = AnimatableKt.Animatable$default(!z ? 1.0f : 0.8f, 0.0f, 2, (Object) null);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        Animatable animatable = (Animatable) rememberedValue;
        EffectsKt.LaunchedEffect((Object) Boolean.valueOf(z), (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) new SnackbarHostKt$animatedScale$1(animatable, z, animationSpec, (Continuation<? super SnackbarHostKt$animatedScale$1>) null), composer, ((i >> 3) & 14) | 64);
        State<Float> asState = animatable.asState();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return asState;
    }
}
