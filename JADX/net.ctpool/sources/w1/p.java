package w1;

import android.net.Uri;

/* JADX INFO: loaded from: classes.dex */
public class p implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static p f22652a;

    protected p() {
    }

    public static synchronized p f() {
        try {
            if (f22652a == null) {
                f22652a = new p();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f22652a;
    }

    @Override // w1.k
    public I0.d a(J1.b bVar, Object obj) {
        C2181b c2181b = new C2181b(e(bVar.u()).toString(), bVar.q(), bVar.s(), bVar.g(), null, null);
        c2181b.d(obj);
        return c2181b;
    }

    @Override // w1.k
    public I0.d b(J1.b bVar, Object obj) {
        I0.d dVar;
        String name;
        J1.d dVarK = bVar.k();
        if (dVarK != null) {
            I0.d dVarB = dVarK.b();
            name = dVarK.getClass().getName();
            dVar = dVarB;
        } else {
            dVar = null;
            name = null;
        }
        C2181b c2181b = new C2181b(e(bVar.u()).toString(), bVar.q(), bVar.s(), bVar.g(), dVar, name);
        c2181b.d(obj);
        return c2181b;
    }

    @Override // w1.k
    public I0.d c(J1.b bVar, Object obj) {
        return d(bVar, bVar.u(), obj);
    }

    @Override // w1.k
    public I0.d d(J1.b bVar, Uri uri, Object obj) {
        return new I0.i(e(uri).toString());
    }

    protected Uri e(Uri uri) {
        return uri;
    }
}
