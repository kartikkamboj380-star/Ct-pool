package D1;

import O0.o;
import android.graphics.ColorSpace;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import s1.C2037b;
import s1.C2038c;
import s1.C2039d;
import x1.C2210a;

/* JADX INFO: loaded from: classes.dex */
public class g implements Closeable {

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static boolean f977z;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final S0.a f978m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final o f979n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private C2038c f980o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f981p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f982q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f983r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f984s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f985t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private int f986u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private C2210a f987v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private ColorSpace f988w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private String f989x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private boolean f990y;

    public g(o oVar) {
        this.f980o = C2038c.f22251d;
        this.f981p = -1;
        this.f982q = 0;
        this.f983r = -1;
        this.f984s = -1;
        this.f985t = 1;
        this.f986u = -1;
        O0.l.g(oVar);
        this.f978m = null;
        this.f979n = oVar;
    }

    private void B0() {
        if (this.f983r < 0 || this.f984s < 0) {
            n0();
        }
    }

    private N1.f D0() throws Throwable {
        InputStream inputStreamO;
        try {
            inputStreamO = o();
        } catch (Throwable th) {
            th = th;
            inputStreamO = null;
        }
        try {
            N1.f fVarC = N1.b.c(inputStreamO);
            this.f988w = fVarC.a();
            i5.l lVarB = fVarC.b();
            if (lVarB != null) {
                this.f983r = ((Integer) lVarB.a()).intValue();
                this.f984s = ((Integer) lVarB.b()).intValue();
            }
            if (inputStreamO != null) {
                try {
                    inputStreamO.close();
                } catch (IOException unused) {
                }
            }
            return fVarC;
        } catch (Throwable th2) {
            th = th2;
            if (inputStreamO != null) {
                try {
                    inputStreamO.close();
                } catch (IOException unused2) {
                }
            }
            throw th;
        }
    }

    private i5.l H0() {
        InputStream inputStreamO = o();
        if (inputStreamO == null) {
            return null;
        }
        i5.l lVarF = N1.j.f(inputStreamO);
        if (lVarF != null) {
            this.f983r = ((Integer) lVarF.a()).intValue();
            this.f984s = ((Integer) lVarF.b()).intValue();
        }
        return lVarF;
    }

    private void U() {
        int iA;
        int iA2;
        C2038c c2038cC = C2039d.c(o());
        this.f980o = c2038cC;
        i5.l lVarH0 = C2037b.b(c2038cC) ? H0() : D0().b();
        if (c2038cC == C2037b.f22237b && this.f981p == -1) {
            if (lVarH0 == null) {
                return;
            } else {
                iA2 = N1.g.b(o());
            }
        } else {
            if (c2038cC != C2037b.f22247l || this.f981p != -1) {
                if (this.f981p == -1) {
                    iA = 0;
                    this.f981p = iA;
                }
                return;
            }
            iA2 = N1.e.a(o());
        }
        this.f982q = iA2;
        iA = N1.g.a(iA2);
        this.f981p = iA;
    }

    public static boolean a0(g gVar) {
        return gVar.f981p >= 0 && gVar.f983r >= 0 && gVar.f984s >= 0;
    }

    public static g b(g gVar) {
        if (gVar != null) {
            return gVar.a();
        }
        return null;
    }

    public static void d(g gVar) {
        if (gVar != null) {
            gVar.close();
        }
    }

    public static boolean j0(g gVar) {
        return gVar != null && gVar.h0();
    }

    public int B() {
        S0.a aVar = this.f978m;
        return (aVar == null || aVar.j() == null) ? this.f986u : ((R0.h) this.f978m.j()).size();
    }

    protected boolean J() {
        return this.f990y;
    }

    public void M0(C2210a c2210a) {
        this.f987v = c2210a;
    }

    public void R0(int i7) {
        this.f982q = i7;
    }

    public void S0(int i7) {
        this.f984s = i7;
    }

    public int T() {
        B0();
        return this.f981p;
    }

    public boolean W(int i7) {
        C2038c c2038c = this.f980o;
        if ((c2038c != C2037b.f22237b && c2038c != C2037b.f22248m) || this.f979n != null) {
            return true;
        }
        O0.l.g(this.f978m);
        R0.h hVar = (R0.h) this.f978m.j();
        return hVar.k(i7 + (-2)) == -1 && hVar.k(i7 - 1) == -39;
    }

    public g a() {
        g gVar;
        o oVar = this.f979n;
        if (oVar != null) {
            gVar = new g(oVar, this.f986u);
        } else {
            S0.a aVarE = S0.a.e(this.f978m);
            if (aVarE == null) {
                gVar = null;
            } else {
                try {
                    gVar = new g(aVarE);
                } finally {
                    S0.a.g(aVarE);
                }
            }
        }
        if (gVar != null) {
            gVar.e(this);
        }
        return gVar;
    }

    public void b1(C2038c c2038c) {
        this.f980o = c2038c;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        S0.a.g(this.f978m);
    }

    public void e(g gVar) {
        this.f980o = gVar.n();
        this.f983r = gVar.getWidth();
        this.f984s = gVar.getHeight();
        this.f981p = gVar.T();
        this.f982q = gVar.g1();
        this.f985t = gVar.z();
        this.f986u = gVar.B();
        this.f987v = gVar.g();
        this.f988w = gVar.j();
        this.f990y = gVar.J();
    }

    public S0.a f() {
        return S0.a.e(this.f978m);
    }

    public void f1(int i7) {
        this.f981p = i7;
    }

    public C2210a g() {
        return this.f987v;
    }

    public int g1() {
        B0();
        return this.f982q;
    }

    public int getHeight() {
        B0();
        return this.f984s;
    }

    public int getWidth() {
        B0();
        return this.f983r;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0012  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public synchronized boolean h0() {
        boolean z6;
        if (!S0.a.B(this.f978m)) {
            z6 = this.f979n != null;
        }
        return z6;
    }

    public void h1(int i7) {
        this.f985t = i7;
    }

    public void i1(String str) {
        this.f989x = str;
    }

    public ColorSpace j() {
        B0();
        return this.f988w;
    }

    public void j1(int i7) {
        this.f983r = i7;
    }

    public String l(int i7) {
        S0.a aVarF = f();
        if (aVarF == null) {
            return "";
        }
        int iMin = Math.min(B(), i7);
        byte[] bArr = new byte[iMin];
        try {
            R0.h hVar = (R0.h) aVarF.j();
            if (hVar == null) {
                return "";
            }
            hVar.m(0, bArr, 0, iMin);
            aVarF.close();
            StringBuilder sb = new StringBuilder(iMin * 2);
            for (int i8 = 0; i8 < iMin; i8++) {
                sb.append(String.format("%02X", Byte.valueOf(bArr[i8])));
            }
            return sb.toString();
        } finally {
            aVarF.close();
        }
    }

    public C2038c n() {
        B0();
        return this.f980o;
    }

    public void n0() {
        if (!f977z) {
            U();
        } else {
            if (this.f990y) {
                return;
            }
            U();
            this.f990y = true;
        }
    }

    public InputStream o() {
        o oVar = this.f979n;
        if (oVar != null) {
            return (InputStream) oVar.get();
        }
        S0.a aVarE = S0.a.e(this.f978m);
        if (aVarE == null) {
            return null;
        }
        try {
            return new R0.j((R0.h) aVarE.j());
        } finally {
            S0.a.g(aVarE);
        }
    }

    public InputStream w() {
        return (InputStream) O0.l.g(o());
    }

    public int z() {
        return this.f985t;
    }

    public g(o oVar, int i7) {
        this(oVar);
        this.f986u = i7;
    }

    public g(S0.a aVar) {
        this.f980o = C2038c.f22251d;
        this.f981p = -1;
        this.f982q = 0;
        this.f983r = -1;
        this.f984s = -1;
        this.f985t = 1;
        this.f986u = -1;
        O0.l.b(Boolean.valueOf(S0.a.B(aVar)));
        this.f978m = aVar.clone();
        this.f979n = null;
    }
}
