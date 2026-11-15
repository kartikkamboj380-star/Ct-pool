package androidx.lifecycle;

import android.content.Context;
import c0.InterfaceC0707a;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class ProcessLifecycleInitializer implements InterfaceC0707a {
    @Override // c0.InterfaceC0707a
    public List a() {
        return Collections.emptyList();
    }

    @Override // c0.InterfaceC0707a
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public l b(Context context) {
        if (!androidx.startup.a.e(context).g(ProcessLifecycleInitializer.class)) {
            throw new IllegalStateException("ProcessLifecycleInitializer cannot be initialized lazily. \nPlease ensure that you have: \n<meta-data\n    android:name='androidx.lifecycle.ProcessLifecycleInitializer' \n    android:value='androidx.startup' /> \nunder InitializationProvider in your AndroidManifest.xml");
        }
        AbstractC0652i.a(context);
        t.j(context);
        return t.i();
    }
}
