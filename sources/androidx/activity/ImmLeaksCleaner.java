package androidx.activity;

import android.app.Activity;
import android.view.inputmethod.InputMethodManager;
import androidx.lifecycle.LifecycleEventObserver;
import java.lang.reflect.Field;

final class ImmLeaksCleaner implements LifecycleEventObserver {
    private static final int INIT_FAILED = 2;
    private static final int INIT_SUCCESS = 1;
    private static final int NOT_INITIALIAZED = 0;
    private static Field sHField;
    private static Field sNextServedViewField;
    private static int sReflectedFieldsInitialized;
    private static Field sServedViewField;
    private Activity mActivity;

    ImmLeaksCleaner(Activity activity) {
        this.mActivity = activity;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:29|30|31) */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0046, code lost:
        return;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x0045 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onStateChanged(androidx.lifecycle.LifecycleOwner r3, androidx.lifecycle.Lifecycle.Event r4) {
        /*
            r2 = this;
            androidx.lifecycle.Lifecycle$Event r3 = androidx.lifecycle.Lifecycle.Event.ON_DESTROY
            if (r4 == r3) goto L_0x0005
            return
        L_0x0005:
            int r3 = sReflectedFieldsInitialized
            if (r3 != 0) goto L_0x000c
            initializeReflectiveFields()
        L_0x000c:
            int r3 = sReflectedFieldsInitialized
            r4 = 1
            if (r3 != r4) goto L_0x004f
            android.app.Activity r3 = r2.mActivity
            java.lang.String r4 = "input_method"
            java.lang.Object r3 = r3.getSystemService(r4)
            android.view.inputmethod.InputMethodManager r3 = (android.view.inputmethod.InputMethodManager) r3
            java.lang.reflect.Field r4 = sHField     // Catch:{ IllegalAccessException -> 0x004f }
            java.lang.Object r4 = r4.get(r3)     // Catch:{ IllegalAccessException -> 0x004f }
            if (r4 != 0) goto L_0x0025
            return
        L_0x0025:
            monitor-enter(r4)
            java.lang.reflect.Field r0 = sServedViewField     // Catch:{ IllegalAccessException -> 0x004b, ClassCastException -> 0x0049 }
            java.lang.Object r0 = r0.get(r3)     // Catch:{ IllegalAccessException -> 0x004b, ClassCastException -> 0x0049 }
            android.view.View r0 = (android.view.View) r0     // Catch:{ IllegalAccessException -> 0x004b, ClassCastException -> 0x0049 }
            if (r0 != 0) goto L_0x0032
            monitor-exit(r4)     // Catch:{ all -> 0x0047 }
            return
        L_0x0032:
            boolean r0 = r0.isAttachedToWindow()     // Catch:{ all -> 0x0047 }
            if (r0 == 0) goto L_0x003a
            monitor-exit(r4)     // Catch:{ all -> 0x0047 }
            return
        L_0x003a:
            java.lang.reflect.Field r0 = sNextServedViewField     // Catch:{ IllegalAccessException -> 0x0045 }
            r1 = 0
            r0.set(r3, r1)     // Catch:{ IllegalAccessException -> 0x0045 }
            monitor-exit(r4)     // Catch:{ all -> 0x0047 }
            r3.isActive()
            goto L_0x004f
        L_0x0045:
            monitor-exit(r4)     // Catch:{ all -> 0x0047 }
            return
        L_0x0047:
            r3 = move-exception
            goto L_0x004d
        L_0x0049:
            monitor-exit(r4)     // Catch:{ all -> 0x0047 }
            return
        L_0x004b:
            monitor-exit(r4)     // Catch:{ all -> 0x0047 }
            return
        L_0x004d:
            monitor-exit(r4)     // Catch:{ all -> 0x0047 }
            throw r3
        L_0x004f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.activity.ImmLeaksCleaner.onStateChanged(androidx.lifecycle.LifecycleOwner, androidx.lifecycle.Lifecycle$Event):void");
    }

    private static void initializeReflectiveFields() {
        try {
            sReflectedFieldsInitialized = 2;
            Field declaredField = InputMethodManager.class.getDeclaredField("mServedView");
            sServedViewField = declaredField;
            declaredField.setAccessible(true);
            Field declaredField2 = InputMethodManager.class.getDeclaredField("mNextServedView");
            sNextServedViewField = declaredField2;
            declaredField2.setAccessible(true);
            Field declaredField3 = InputMethodManager.class.getDeclaredField("mH");
            sHField = declaredField3;
            declaredField3.setAccessible(true);
            sReflectedFieldsInitialized = 1;
        } catch (NoSuchFieldException unused) {
        }
    }
}
