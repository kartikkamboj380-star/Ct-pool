package Y5;

import T5.C0455a;
import T5.F;
import T5.r;
import T5.z;
import Y5.k;
import b6.n;
import com.google.android.gms.common.internal.ImagesContract;
import i5.u;
import java.io.IOException;
import java.net.Socket;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private k.b f4526a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private k f4527b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f4528c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f4529d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f4530e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private F f4531f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final h f4532g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final C0455a f4533h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final e f4534i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final r f4535j;

    public d(h hVar, C0455a c0455a, e eVar, r rVar) {
        w5.k.f(hVar, "connectionPool");
        w5.k.f(c0455a, "address");
        w5.k.f(eVar, "call");
        w5.k.f(rVar, "eventListener");
        this.f4532g = hVar;
        this.f4533h = c0455a;
        this.f4534i = eVar;
        this.f4535j = rVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x013b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final f b(int i7, int i8, int i9, int i10, boolean z6) throws IOException {
        List listA;
        f fVarL;
        Socket socketY;
        if (this.f4534i.n0()) {
            throw new IOException("Canceled");
        }
        f fVarL2 = this.f4534i.l();
        if (fVarL2 != null) {
            synchronized (fVarL2) {
                try {
                    socketY = (fVarL2.p() || !g(fVarL2.A().a().l())) ? this.f4534i.y() : null;
                    u uVar = u.f19985a;
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (this.f4534i.l() != null) {
                if (socketY == null) {
                    return fVarL2;
                }
                throw new IllegalStateException("Check failed.".toString());
            }
            if (socketY != null) {
                U5.c.k(socketY);
            }
            this.f4535j.l(this.f4534i, fVarL2);
        }
        this.f4528c = 0;
        this.f4529d = 0;
        this.f4530e = 0;
        if (this.f4532g.a(this.f4533h, this.f4534i, null, false)) {
            fVarL = this.f4534i.l();
            w5.k.c(fVarL);
        } else {
            F fC = this.f4531f;
            try {
                if (fC != null) {
                    w5.k.c(fC);
                    this.f4531f = null;
                } else {
                    k.b bVar = this.f4526a;
                    if (bVar != null) {
                        w5.k.c(bVar);
                        if (bVar.b()) {
                            k.b bVar2 = this.f4526a;
                            w5.k.c(bVar2);
                            fC = bVar2.c();
                        }
                    }
                    k kVar = this.f4527b;
                    if (kVar == null) {
                        kVar = new k(this.f4533h, this.f4534i.k().v(), this.f4534i, this.f4535j);
                        this.f4527b = kVar;
                    }
                    k.b bVarD = kVar.d();
                    this.f4526a = bVarD;
                    listA = bVarD.a();
                    if (this.f4534i.n0()) {
                        throw new IOException("Canceled");
                    }
                    if (!this.f4532g.a(this.f4533h, this.f4534i, listA, false)) {
                        fC = bVarD.c();
                        f fVar = new f(this.f4532g, fC);
                        this.f4534i.A(fVar);
                        fVar.f(i7, i8, i9, i10, z6, this.f4534i, this.f4535j);
                        this.f4534i.A(null);
                        this.f4534i.k().v().a(fVar.A());
                        if (this.f4532g.a(this.f4533h, this.f4534i, listA, true)) {
                            synchronized (fVar) {
                                this.f4532g.e(fVar);
                                this.f4534i.c(fVar);
                                u uVar2 = u.f19985a;
                            }
                            this.f4535j.k(this.f4534i, fVar);
                            return fVar;
                        }
                        fVarL = this.f4534i.l();
                        w5.k.c(fVarL);
                        this.f4531f = fC;
                        U5.c.k(fVar.E());
                    }
                    fVarL = this.f4534i.l();
                    w5.k.c(fVarL);
                }
                fVar.f(i7, i8, i9, i10, z6, this.f4534i, this.f4535j);
                this.f4534i.A(null);
                this.f4534i.k().v().a(fVar.A());
                if (this.f4532g.a(this.f4533h, this.f4534i, listA, true)) {
                }
            } catch (Throwable th2) {
                this.f4534i.A(null);
                throw th2;
            }
            listA = null;
            f fVar2 = new f(this.f4532g, fC);
            this.f4534i.A(fVar2);
        }
        this.f4535j.k(this.f4534i, fVarL);
        return fVarL;
    }

    private final f c(int i7, int i8, int i9, int i10, boolean z6, boolean z7) throws IOException {
        while (true) {
            f fVarB = b(i7, i8, i9, i10, z6);
            if (fVarB.u(z7)) {
                return fVarB;
            }
            fVarB.z();
            if (this.f4531f == null) {
                k.b bVar = this.f4526a;
                if (bVar != null ? bVar.b() : true) {
                    continue;
                } else {
                    k kVar = this.f4527b;
                    if (!(kVar != null ? kVar.b() : true)) {
                        throw new IOException("exhausted all routes");
                    }
                }
            }
        }
    }

    private final F f() {
        f fVarL;
        if (this.f4528c > 1 || this.f4529d > 1 || this.f4530e > 0 || (fVarL = this.f4534i.l()) == null) {
            return null;
        }
        synchronized (fVarL) {
            if (fVarL.q() != 0) {
                return null;
            }
            if (U5.c.g(fVarL.A().a().l(), this.f4533h.l())) {
                return fVarL.A();
            }
            return null;
        }
    }

    public final Z5.d a(z zVar, Z5.g gVar) {
        w5.k.f(zVar, "client");
        w5.k.f(gVar, "chain");
        try {
            return c(gVar.e(), gVar.g(), gVar.i(), zVar.D(), zVar.J(), !w5.k.b(gVar.h().h(), "GET")).w(zVar, gVar);
        } catch (j e7) {
            h(e7.c());
            throw e7;
        } catch (IOException e8) {
            h(e8);
            throw new j(e8);
        }
    }

    public final C0455a d() {
        return this.f4533h;
    }

    public final boolean e() {
        k kVar;
        if (this.f4528c == 0 && this.f4529d == 0 && this.f4530e == 0) {
            return false;
        }
        if (this.f4531f != null) {
            return true;
        }
        F f7 = f();
        if (f7 != null) {
            this.f4531f = f7;
            return true;
        }
        k.b bVar = this.f4526a;
        if ((bVar == null || !bVar.b()) && (kVar = this.f4527b) != null) {
            return kVar.b();
        }
        return true;
    }

    public final boolean g(T5.u uVar) {
        w5.k.f(uVar, ImagesContract.URL);
        T5.u uVarL = this.f4533h.l();
        return uVar.l() == uVarL.l() && w5.k.b(uVar.h(), uVarL.h());
    }

    public final void h(IOException iOException) {
        w5.k.f(iOException, "e");
        this.f4531f = null;
        if ((iOException instanceof n) && ((n) iOException).f9958m == b6.b.REFUSED_STREAM) {
            this.f4528c++;
        } else if (iOException instanceof b6.a) {
            this.f4529d++;
        } else {
            this.f4530e++;
        }
    }
}
