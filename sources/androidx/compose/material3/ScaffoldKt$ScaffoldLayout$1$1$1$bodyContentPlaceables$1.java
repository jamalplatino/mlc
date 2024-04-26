package androidx.compose.material3;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.layout.WindowInsetsKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.layout.SubcomposeMeasureScope;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;

@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* compiled from: Scaffold.kt */
final class ScaffoldKt$ScaffoldLayout$1$1$1$bodyContentPlaceables$1 extends Lambda implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ Integer $bottomBarHeight;
    final /* synthetic */ List<Placeable> $bottomBarPlaceables;
    final /* synthetic */ Function3<PaddingValues, Composer, Integer, Unit> $content;
    final /* synthetic */ WindowInsets $contentWindowInsets;
    final /* synthetic */ SubcomposeMeasureScope $this_SubcomposeLayout;
    final /* synthetic */ int $topBarHeight;
    final /* synthetic */ List<Placeable> $topBarPlaceables;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ScaffoldKt$ScaffoldLayout$1$1$1$bodyContentPlaceables$1(WindowInsets windowInsets, SubcomposeMeasureScope subcomposeMeasureScope, List<? extends Placeable> list, int i, List<? extends Placeable> list2, Integer num, Function3<? super PaddingValues, ? super Composer, ? super Integer, Unit> function3, int i2) {
        super(2);
        this.$contentWindowInsets = windowInsets;
        this.$this_SubcomposeLayout = subcomposeMeasureScope;
        this.$topBarPlaceables = list;
        this.$topBarHeight = i;
        this.$bottomBarPlaceables = list2;
        this.$bottomBarHeight = num;
        this.$content = function3;
        this.$$dirty = i2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        float f;
        float f2;
        Integer num;
        ComposerKt.sourceInformation(composer, "C238@10996L21:Scaffold.kt#uh7d8r");
        if ((i & 11) != 2 || !composer.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1643221465, i, -1, "androidx.compose.material3.ScaffoldLayout.<anonymous>.<anonymous>.<anonymous>.<anonymous> (Scaffold.kt:220)");
            }
            PaddingValues asPaddingValues = WindowInsetsKt.asPaddingValues(this.$contentWindowInsets, this.$this_SubcomposeLayout);
            if (this.$topBarPlaceables.isEmpty()) {
                f = asPaddingValues.m506calculateTopPaddingD9Ej5fM();
            } else {
                f = this.$this_SubcomposeLayout.m5604toDpu2uoSUM(this.$topBarHeight);
            }
            if (this.$bottomBarPlaceables.isEmpty() || (num = this.$bottomBarHeight) == null) {
                f2 = asPaddingValues.m503calculateBottomPaddingD9Ej5fM();
            } else {
                f2 = this.$this_SubcomposeLayout.m5604toDpu2uoSUM(num.intValue());
            }
            this.$content.invoke(PaddingKt.m489PaddingValuesa9UjIt4(PaddingKt.calculateStartPadding(asPaddingValues, this.$this_SubcomposeLayout.getLayoutDirection()), f, PaddingKt.calculateEndPadding(asPaddingValues, this.$this_SubcomposeLayout.getLayoutDirection()), f2), composer, Integer.valueOf((this.$$dirty >> 3) & 112));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
                return;
            }
            return;
        }
        composer.skipToGroupEnd();
    }
}
