package n3;

import android.util.Log;
import java.util.Objects;

/* JADX INFO: renamed from: n3.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1918k extends ClassLoader {
    @Override // java.lang.ClassLoader
    protected final Class loadClass(String str, boolean z6) {
        if (!Objects.equals(str, "com.google.android.gms.iid.MessengerCompat")) {
            return super.loadClass(str, z6);
        }
        if (!Log.isLoggable("CloudMessengerCompat", 3)) {
            return C1919l.class;
        }
        Log.d("CloudMessengerCompat", "Using renamed FirebaseIidMessengerCompat class");
        return C1919l.class;
    }
}
