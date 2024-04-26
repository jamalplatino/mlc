package androidx.compose.foundation.layout;

import androidx.compose.ui.Modifier;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0007\u001a\u0014\u0010\u0004\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0007\u001a\u0014\u0010\u0005\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0007\u001a\u0014\u0010\u0006\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0007¨\u0006\u0007"}, d2 = {"height", "Landroidx/compose/ui/Modifier;", "intrinsicSize", "Landroidx/compose/foundation/layout/IntrinsicSize;", "requiredHeight", "requiredWidth", "width", "foundation-layout_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: Intrinsic.kt */
public final class IntrinsicKt {

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* compiled from: Intrinsic.kt */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        static {
            /*
                androidx.compose.foundation.layout.IntrinsicSize[] r0 = androidx.compose.foundation.layout.IntrinsicSize.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                androidx.compose.foundation.layout.IntrinsicSize r1 = androidx.compose.foundation.layout.IntrinsicSize.Min     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                androidx.compose.foundation.layout.IntrinsicSize r1 = androidx.compose.foundation.layout.IntrinsicSize.Max     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                $EnumSwitchMapping$0 = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.layout.IntrinsicKt.WhenMappings.<clinit>():void");
        }
    }

    public static final Modifier width(Modifier modifier, IntrinsicSize intrinsicSize) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        Intrinsics.checkNotNullParameter(intrinsicSize, "intrinsicSize");
        int i = WhenMappings.$EnumSwitchMapping$0[intrinsicSize.ordinal()];
        if (i == 1) {
            return modifier.then(MinIntrinsicWidthModifier.INSTANCE);
        }
        if (i == 2) {
            return modifier.then(MaxIntrinsicWidthModifier.INSTANCE);
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final Modifier height(Modifier modifier, IntrinsicSize intrinsicSize) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        Intrinsics.checkNotNullParameter(intrinsicSize, "intrinsicSize");
        int i = WhenMappings.$EnumSwitchMapping$0[intrinsicSize.ordinal()];
        if (i == 1) {
            return modifier.then(MinIntrinsicHeightModifier.INSTANCE);
        }
        if (i == 2) {
            return modifier.then(MaxIntrinsicHeightModifier.INSTANCE);
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final Modifier requiredWidth(Modifier modifier, IntrinsicSize intrinsicSize) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        Intrinsics.checkNotNullParameter(intrinsicSize, "intrinsicSize");
        int i = WhenMappings.$EnumSwitchMapping$0[intrinsicSize.ordinal()];
        if (i == 1) {
            return modifier.then(RequiredMinIntrinsicWidthModifier.INSTANCE);
        }
        if (i == 2) {
            return modifier.then(RequiredMaxIntrinsicWidthModifier.INSTANCE);
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final Modifier requiredHeight(Modifier modifier, IntrinsicSize intrinsicSize) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        Intrinsics.checkNotNullParameter(intrinsicSize, "intrinsicSize");
        int i = WhenMappings.$EnumSwitchMapping$0[intrinsicSize.ordinal()];
        if (i == 1) {
            return modifier.then(RequiredMinIntrinsicHeightModifier.INSTANCE);
        }
        if (i == 2) {
            return modifier.then(RequiredMaxIntrinsicHeightModifier.INSTANCE);
        }
        throw new NoWhenBranchMatchedException();
    }
}
