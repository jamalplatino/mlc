package androidx.compose.material3;

import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;

@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* compiled from: Scaffold.kt */
final class ScaffoldKt$Scaffold$1 extends Lambda implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ Function2<Composer, Integer, Unit> $bottomBar;
    final /* synthetic */ Function3<PaddingValues, Composer, Integer, Unit> $content;
    final /* synthetic */ WindowInsets $contentWindowInsets;
    final /* synthetic */ Function2<Composer, Integer, Unit> $floatingActionButton;
    final /* synthetic */ int $floatingActionButtonPosition;
    final /* synthetic */ Function2<Composer, Integer, Unit> $snackbarHost;
    final /* synthetic */ Function2<Composer, Integer, Unit> $topBar;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ScaffoldKt$Scaffold$1(int i, Function2<? super Composer, ? super Integer, Unit> function2, Function3<? super PaddingValues, ? super Composer, ? super Integer, Unit> function3, Function2<? super Composer, ? super Integer, Unit> function22, Function2<? super Composer, ? super Integer, Unit> function23, WindowInsets windowInsets, Function2<? super Composer, ? super Integer, Unit> function24, int i2) {
        super(2);
        this.$floatingActionButtonPosition = i;
        this.$topBar = function2;
        this.$content = function3;
        this.$snackbarHost = function22;
        this.$floatingActionButton = function23;
        this.$contentWindowInsets = windowInsets;
        this.$bottomBar = function24;
        this.$$dirty = i2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C86@4372L307:Scaffold.kt#uh7d8r");
        if ((i & 11) != 2 || !composer.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1979205334, i, -1, "androidx.compose.material3.Scaffold.<anonymous> (Scaffold.kt:85)");
            }
            int i2 = this.$floatingActionButtonPosition;
            Function2<Composer, Integer, Unit> function2 = this.$topBar;
            Function3<PaddingValues, Composer, Integer, Unit> function3 = this.$content;
            Function2<Composer, Integer, Unit> function22 = this.$snackbarHost;
            Function2<Composer, Integer, Unit> function23 = this.$floatingActionButton;
            WindowInsets windowInsets = this.$contentWindowInsets;
            Function2<Composer, Integer, Unit> function24 = this.$bottomBar;
            int i3 = this.$$dirty;
            ScaffoldKt.m1518ScaffoldLayoutFMILGgc(i2, function2, function3, function22, function23, windowInsets, function24, composer, ((i3 >> 15) & 14) | (i3 & 112) | ((i3 >> 21) & 896) | (i3 & 7168) | (57344 & i3) | ((i3 >> 9) & 458752) | ((i3 << 12) & 3670016));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
                return;
            }
            return;
        }
        composer.skipToGroupEnd();
    }
}
