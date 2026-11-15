package androidx.loader.app;

import Q.c;
import android.os.Bundle;
import androidx.lifecycle.I;
import androidx.lifecycle.l;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: androidx.loader.app.a$a, reason: collision with other inner class name */
    public interface InterfaceC0163a {
        c a(int i7, Bundle bundle);

        void b(c cVar);

        void c(c cVar, Object obj);
    }

    public static a b(l lVar) {
        return new b(lVar, ((I) lVar).getViewModelStore());
    }

    public abstract void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);

    public abstract c c(int i7, Bundle bundle, InterfaceC0163a interfaceC0163a);

    public abstract void d();
}
