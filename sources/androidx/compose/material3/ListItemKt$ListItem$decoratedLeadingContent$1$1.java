package androidx.compose.material3;

import androidx.compose.foundation.layout.RowScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* compiled from: ListItem.kt */
final class ListItemKt$ListItem$decoratedLeadingContent$1$1 extends Lambda implements Function3<RowScope, Composer, Integer, Unit> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ ListItemColors $colors;
    final /* synthetic */ Function2<Composer, Integer, Unit> $it;
    final /* synthetic */ int $listItemType;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ListItemKt$ListItem$decoratedLeadingContent$1$1(ListItemColors listItemColors, int i, int i2, Function2<? super Composer, ? super Integer, Unit> function2) {
        super(3);
        this.$colors = listItemColors;
        this.$$dirty = i;
        this.$listItemType = i2;
        this.$it = function2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        invoke((RowScope) obj, (Composer) obj2, ((Number) obj3).intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(RowScope rowScope, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(rowScope, "$this$null");
        ComposerKt.sourceInformation(composer, "C118@5083L32,117@5029L203:ListItem.kt#uh7d8r");
        if ((i & 14) == 0) {
            i |= composer.changed((Object) rowScope) ? 4 : 2;
        }
        if ((i & 91) != 18 || !composer.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1673725255, i, -1, "androidx.compose.material3.ListItem.<anonymous>.<anonymous> (ListItem.kt:116)");
            }
            ListItemKt.m1409LeadingContent3IgeMak(rowScope, this.$colors.leadingIconColor$material3_release(true, composer, ((this.$$dirty >> 15) & 112) | 6).getValue().m2831unboximpl(), ListItemType.m1422equalsimpl0(this.$listItemType, ListItemType.Companion.m1429getThreeLineAlXitO8()), this.$it, composer, i & 14);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
                return;
            }
            return;
        }
        composer.skipToGroupEnd();
    }
}
