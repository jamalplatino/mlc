package androidx.compose.material3;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* compiled from: AlertDialog.kt */
final class AlertDialogKt$AlertDialogFlowRow$1$measure$1 extends Lambda implements Function1<Placeable.PlacementScope, Unit> {
    final /* synthetic */ List<Integer> $crossAxisPositions;
    final /* synthetic */ int $mainAxisLayoutSize;
    final /* synthetic */ float $mainAxisSpacing;
    final /* synthetic */ List<List<Placeable>> $sequences;
    final /* synthetic */ MeasureScope $this_Layout;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    AlertDialogKt$AlertDialogFlowRow$1$measure$1(List<List<Placeable>> list, MeasureScope measureScope, float f, int i, List<Integer> list2) {
        super(1);
        this.$sequences = list;
        this.$this_Layout = measureScope;
        this.$mainAxisSpacing = f;
        this.$mainAxisLayoutSize = i;
        this.$crossAxisPositions = list2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Placeable.PlacementScope) obj);
        return Unit.INSTANCE;
    }

    public final void invoke(Placeable.PlacementScope placementScope) {
        Intrinsics.checkNotNullParameter(placementScope, "$this$layout");
        MeasureScope measureScope = this.$this_Layout;
        float f = this.$mainAxisSpacing;
        int i = this.$mainAxisLayoutSize;
        List<Integer> list = this.$crossAxisPositions;
        int i2 = 0;
        for (Object next : this.$sequences) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            List list2 = (List) next;
            int size = list2.size();
            int[] iArr = new int[size];
            int i4 = 0;
            while (i4 < size) {
                iArr[i4] = ((Placeable) list2.get(i4)).getWidth() + (i4 < CollectionsKt.getLastIndex(list2) ? measureScope.m5601roundToPx0680j_4(f) : 0);
                i4++;
            }
            Arrangement.Horizontal end = Arrangement.INSTANCE.getEnd();
            int[] iArr2 = new int[size];
            for (int i5 = 0; i5 < size; i5++) {
                iArr2[i5] = 0;
            }
            int[] iArr3 = iArr2;
            end.arrange(measureScope, i, iArr, measureScope.getLayoutDirection(), iArr2);
            int i6 = 0;
            for (Object next2 : list2) {
                int i7 = i6 + 1;
                if (i6 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                Placeable.PlacementScope.place$default(placementScope, (Placeable) next2, iArr3[i6], list.get(i2).intValue(), 0.0f, 4, (Object) null);
                i6 = i7;
            }
            i2 = i3;
        }
    }
}
