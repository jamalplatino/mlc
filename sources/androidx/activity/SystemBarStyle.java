package androidx.activity;

import android.content.res.Resources;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\r\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B3\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\u0002\u0010\nJ\u0015\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\tH\u0000¢\u0006\u0002\b\u0012J\u0015\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\tH\u0000¢\u0006\u0002\b\u0014R\u0014\u0010\u0004\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR \u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\f¨\u0006\u0016"}, d2 = {"Landroidx/activity/SystemBarStyle;", "", "lightScrim", "", "darkScrim", "nightMode", "detectDarkMode", "Lkotlin/Function1;", "Landroid/content/res/Resources;", "", "(IIILkotlin/jvm/functions/Function1;)V", "getDarkScrim$activity_release", "()I", "getDetectDarkMode$activity_release", "()Lkotlin/jvm/functions/Function1;", "getNightMode$activity_release", "getScrim", "isDark", "getScrim$activity_release", "getScrimWithEnforcedContrast", "getScrimWithEnforcedContrast$activity_release", "Companion", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* compiled from: EdgeToEdge.kt */
public final class SystemBarStyle {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private final int darkScrim;
    private final Function1<Resources, Boolean> detectDarkMode;
    private final int lightScrim;
    private final int nightMode;

    public /* synthetic */ SystemBarStyle(int i, int i2, int i3, Function1 function1, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, i2, i3, function1);
    }

    @JvmStatic
    public static final SystemBarStyle auto(int i, int i2) {
        return Companion.auto(i, i2);
    }

    @JvmStatic
    public static final SystemBarStyle auto(int i, int i2, Function1<? super Resources, Boolean> function1) {
        return Companion.auto(i, i2, function1);
    }

    @JvmStatic
    public static final SystemBarStyle dark(int i) {
        return Companion.dark(i);
    }

    @JvmStatic
    public static final SystemBarStyle light(int i, int i2) {
        return Companion.light(i, i2);
    }

    public final int getDarkScrim$activity_release() {
        return this.darkScrim;
    }

    public final Function1<Resources, Boolean> getDetectDarkMode$activity_release() {
        return this.detectDarkMode;
    }

    public final int getNightMode$activity_release() {
        return this.nightMode;
    }

    public final int getScrim$activity_release(boolean z) {
        return z ? this.darkScrim : this.lightScrim;
    }

    public final int getScrimWithEnforcedContrast$activity_release(boolean z) {
        if (this.nightMode == 0) {
            return 0;
        }
        return z ? this.darkScrim : this.lightScrim;
    }

    private SystemBarStyle(int i, int i2, int i3, Function1<? super Resources, Boolean> function1) {
        this.lightScrim = i;
        this.darkScrim = i2;
        this.nightMode = i3;
        this.detectDarkMode = function1;
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J2\u0010\u0003\u001a\u00020\u00042\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u00062\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\tH\u0007J\u0012\u0010\f\u001a\u00020\u00042\b\b\u0001\u0010\r\u001a\u00020\u0006H\u0007J\u001c\u0010\u000e\u001a\u00020\u00042\b\b\u0001\u0010\r\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u0006H\u0007¨\u0006\u000f"}, d2 = {"Landroidx/activity/SystemBarStyle$Companion;", "", "()V", "auto", "Landroidx/activity/SystemBarStyle;", "lightScrim", "", "darkScrim", "detectDarkMode", "Lkotlin/Function1;", "Landroid/content/res/Resources;", "", "dark", "scrim", "light", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* compiled from: EdgeToEdge.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public final SystemBarStyle auto(int i, int i2) {
            return auto$default(this, i, i2, (Function1) null, 4, (Object) null);
        }

        private Companion() {
        }

        public static /* synthetic */ SystemBarStyle auto$default(Companion companion, int i, int i2, Function1 function1, int i3, Object obj) {
            if ((i3 & 4) != 0) {
                function1 = SystemBarStyle$Companion$auto$1.INSTANCE;
            }
            return companion.auto(i, i2, function1);
        }

        @JvmStatic
        public final SystemBarStyle auto(int i, int i2, Function1<? super Resources, Boolean> function1) {
            Intrinsics.checkNotNullParameter(function1, "detectDarkMode");
            return new SystemBarStyle(i, i2, 0, function1, (DefaultConstructorMarker) null);
        }

        @JvmStatic
        public final SystemBarStyle dark(int i) {
            return new SystemBarStyle(i, i, 2, SystemBarStyle$Companion$dark$1.INSTANCE, (DefaultConstructorMarker) null);
        }

        @JvmStatic
        public final SystemBarStyle light(int i, int i2) {
            return new SystemBarStyle(i, i2, 1, SystemBarStyle$Companion$light$1.INSTANCE, (DefaultConstructorMarker) null);
        }
    }
}