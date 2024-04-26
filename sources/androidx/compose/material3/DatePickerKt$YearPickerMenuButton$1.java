package androidx.compose.material3;

import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.filled.ArrowDropDownKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.RotateKt;
import androidx.compose.ui.graphics.vector.ImageVector;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* compiled from: DatePicker.kt */
final class DatePickerKt$YearPickerMenuButton$1 extends Lambda implements Function3<RowScope, Composer, Integer, Unit> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ Function2<Composer, Integer, Unit> $content;
    final /* synthetic */ boolean $expanded;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    DatePickerKt$YearPickerMenuButton$1(Function2<? super Composer, ? super Integer, Unit> function2, int i, boolean z) {
        super(3);
        this.$content = function2;
        this.$$dirty = i;
        this.$expanded = z;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        invoke((RowScope) obj, (Composer) obj2, ((Number) obj3).intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(RowScope rowScope, Composer composer, int i) {
        String str;
        Intrinsics.checkNotNullParameter(rowScope, "$this$TextButton");
        ComposerKt.sourceInformation(composer, "C1845@75485L9,1846@75503L49,1847@75561L329:DatePicker.kt#uh7d8r");
        if ((i & 81) != 16 || !composer.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1899012021, i, -1, "androidx.compose.material3.YearPickerMenuButton.<anonymous> (DatePicker.kt:1844)");
            }
            this.$content.invoke(composer, Integer.valueOf((this.$$dirty >> 9) & 14));
            SpacerKt.Spacer(SizeKt.m563size3ABfNKs(Modifier.Companion, ButtonDefaults.INSTANCE.m1157getIconSpacingD9Ej5fM()), composer, 6);
            ImageVector arrowDropDown = ArrowDropDownKt.getArrowDropDown(Icons.Filled.INSTANCE);
            if (this.$expanded) {
                composer.startReplaceableGroup(1071182504);
                ComposerKt.sourceInformation(composer, "1850@75672L49");
                str = Strings_androidKt.m1632getStringNWtq28(Strings.Companion.m1591getDatePickerSwitchToDaySelectionadMyvUU(), composer, 6);
                composer.endReplaceableGroup();
            } else {
                composer.startReplaceableGroup(1071182591);
                ComposerKt.sourceInformation(composer, "1852@75759L50");
                str = Strings_androidKt.m1632getStringNWtq28(Strings.Companion.m1595getDatePickerSwitchToYearSelectionadMyvUU(), composer, 6);
                composer.endReplaceableGroup();
            }
            IconKt.m1389Iconww6aTOc(arrowDropDown, str, RotateKt.rotate(Modifier.Companion, this.$expanded ? 180.0f : 0.0f), 0, composer, 0, 8);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
                return;
            }
            return;
        }
        composer.skipToGroupEnd();
    }
}