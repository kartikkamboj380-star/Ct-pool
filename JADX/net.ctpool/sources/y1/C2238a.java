package y1;

import S0.a;
import android.util.Log;
import java.io.Closeable;

/* JADX INFO: renamed from: y1.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C2238a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a.c f22900a;

    /* JADX INFO: renamed from: y1.a$a, reason: collision with other inner class name */
    class C0330a implements a.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ A1.a f22901a;

        C0330a(A1.a aVar) {
            this.f22901a = aVar;
        }

        @Override // S0.a.c
        public void a(S0.h hVar, Throwable th) {
            this.f22901a.a(hVar, th);
            Object objF = hVar.f();
            P0.a.I("Fresco", "Finalized without closing: %x %x (type = %s).\nStack:\n%s", Integer.valueOf(System.identityHashCode(this)), Integer.valueOf(System.identityHashCode(hVar)), objF != null ? objF.getClass().getName() : "<value is null>", C2238a.d(th));
        }

        @Override // S0.a.c
        public boolean b() {
            return this.f22901a.b();
        }
    }

    public C2238a(A1.a aVar) {
        this.f22900a = new C0330a(aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String d(Throwable th) {
        return th == null ? "" : Log.getStackTraceString(th);
    }

    public S0.a b(Closeable closeable) {
        return S0.a.U(closeable, this.f22900a);
    }

    public S0.a c(Object obj, S0.g gVar) {
        return S0.a.h0(obj, gVar, this.f22900a);
    }
}
