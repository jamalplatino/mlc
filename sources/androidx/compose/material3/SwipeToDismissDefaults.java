package androidx.compose.material3;

import androidx.compose.ui.unit.Density;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R7\u0010\u0003\u001a(\u0012\u0004\u0012\u00020\u0005\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0002\b\n¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Landroidx/compose/material3/SwipeToDismissDefaults;", "", "()V", "FixedPositionalThreshold", "Lkotlin/Function2;", "Landroidx/compose/ui/unit/Density;", "", "Lkotlin/ParameterName;", "name", "totalDistance", "Lkotlin/ExtensionFunctionType;", "getFixedPositionalThreshold", "()Lkotlin/jvm/functions/Function2;", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* compiled from: SwipeToDismiss.kt */
public final class SwipeToDismissDefaults {
    public static final int $stable = 0;
    private static final Function2<Density, Float, Float> FixedPositionalThreshold = SwipeToDismissDefaults$FixedPositionalThreshold$1.INSTANCE;
    public static final SwipeToDismissDefaults INSTANCE = new SwipeToDismissDefaults();

    public final Function2<Density, Float, Float> getFixedPositionalThreshold() {
        return FixedPositionalThreshold;
    }

    private SwipeToDismissDefaults() {
    }
}
