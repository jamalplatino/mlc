package androidx.core.app;

import android.app.LocaleManager;
import android.content.Context;
import android.content.res.Configuration;
import android.os.LocaleList;
import androidx.core.os.BuildCompat;
import androidx.core.os.LocaleListCompat;
import java.util.Locale;

public final class LocaleManagerCompat {
    private LocaleManagerCompat() {
    }

    public static LocaleListCompat getSystemLocales(Context context) {
        LocaleListCompat emptyLocaleList = LocaleListCompat.getEmptyLocaleList();
        if (!BuildCompat.isAtLeastT()) {
            return getConfigurationLocales(context.getApplicationContext().getResources().getConfiguration());
        }
        Object localeManagerForApplication = getLocaleManagerForApplication(context);
        if (localeManagerForApplication != null) {
            return LocaleListCompat.wrap(Api33Impl.localeManagerGetSystemLocales(localeManagerForApplication));
        }
        return emptyLocaleList;
    }

    private static Object getLocaleManagerForApplication(Context context) {
        return context.getSystemService("locale");
    }

    static LocaleListCompat getConfigurationLocales(Configuration configuration) {
        return Api24Impl.getLocales(configuration);
    }

    static class Api21Impl {
        private Api21Impl() {
        }

        static String toLanguageTag(Locale locale) {
            return locale.toLanguageTag();
        }
    }

    static class Api24Impl {
        private Api24Impl() {
        }

        static LocaleListCompat getLocales(Configuration configuration) {
            return LocaleListCompat.forLanguageTags(configuration.getLocales().toLanguageTags());
        }
    }

    static class Api33Impl {
        private Api33Impl() {
        }

        static LocaleList localeManagerGetSystemLocales(Object obj) {
            return ((LocaleManager) obj).getSystemLocales();
        }
    }
}
