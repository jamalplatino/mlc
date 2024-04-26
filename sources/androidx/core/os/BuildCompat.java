package androidx.core.os;

import android.os.Build;
import android.os.ext.SdkExtensions;
import java.util.Locale;
import kotlin.time.DurationKt;

public class BuildCompat {
    public static final int AD_SERVICES_EXTENSION_INT;
    public static final int R_EXTENSION_INT;
    public static final int S_EXTENSION_INT;
    public static final int T_EXTENSION_INT;

    public @interface PrereleaseSdkCheck {
    }

    @Deprecated
    public static boolean isAtLeastN() {
        return true;
    }

    @Deprecated
    public static boolean isAtLeastNMR1() {
        return true;
    }

    @Deprecated
    public static boolean isAtLeastO() {
        return true;
    }

    @Deprecated
    public static boolean isAtLeastOMR1() {
        return Build.VERSION.SDK_INT >= 27;
    }

    @Deprecated
    public static boolean isAtLeastP() {
        return Build.VERSION.SDK_INT >= 28;
    }

    @Deprecated
    public static boolean isAtLeastQ() {
        return Build.VERSION.SDK_INT >= 29;
    }

    @Deprecated
    public static boolean isAtLeastR() {
        return Build.VERSION.SDK_INT >= 30;
    }

    private BuildCompat() {
    }

    protected static boolean isAtLeastPreReleaseCodename(String str, String str2) {
        if (!"REL".equals(str2) && str2.toUpperCase(Locale.ROOT).compareTo(str.toUpperCase(Locale.ROOT)) >= 0) {
            return true;
        }
        return false;
    }

    @Deprecated
    public static boolean isAtLeastS() {
        return Build.VERSION.SDK_INT >= 31 || (Build.VERSION.SDK_INT >= 30 && isAtLeastPreReleaseCodename("S", Build.VERSION.CODENAME));
    }

    @Deprecated
    public static boolean isAtLeastSv2() {
        return Build.VERSION.SDK_INT >= 32 || (Build.VERSION.SDK_INT >= 31 && isAtLeastPreReleaseCodename("Sv2", Build.VERSION.CODENAME));
    }

    public static boolean isAtLeastT() {
        return Build.VERSION.SDK_INT >= 33 || (Build.VERSION.SDK_INT >= 32 && isAtLeastPreReleaseCodename("Tiramisu", Build.VERSION.CODENAME));
    }

    public static boolean isAtLeastU() {
        return Build.VERSION.SDK_INT >= 33 && isAtLeastPreReleaseCodename("UpsideDownCake", Build.VERSION.CODENAME);
    }

    static {
        int i;
        int i2;
        int i3;
        int i4 = 0;
        if (Build.VERSION.SDK_INT >= 30) {
            i = Extensions30Impl.R;
        } else {
            i = 0;
        }
        R_EXTENSION_INT = i;
        if (Build.VERSION.SDK_INT >= 30) {
            i2 = Extensions30Impl.S;
        } else {
            i2 = 0;
        }
        S_EXTENSION_INT = i2;
        if (Build.VERSION.SDK_INT >= 30) {
            i3 = Extensions30Impl.TIRAMISU;
        } else {
            i3 = 0;
        }
        T_EXTENSION_INT = i3;
        if (Build.VERSION.SDK_INT >= 30) {
            i4 = Extensions30Impl.AD_SERVICES;
        }
        AD_SERVICES_EXTENSION_INT = i4;
    }

    private static final class Extensions30Impl {
        static final int AD_SERVICES = SdkExtensions.getExtensionVersion(DurationKt.NANOS_IN_MILLIS);
        static final int R = SdkExtensions.getExtensionVersion(30);
        static final int S = SdkExtensions.getExtensionVersion(31);
        static final int TIRAMISU = SdkExtensions.getExtensionVersion(33);

        private Extensions30Impl() {
        }
    }
}
