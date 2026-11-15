package Z5;

import T5.B;
import T5.C;
import T5.D;
import T5.E;
import T5.v;
import i6.q;
import java.io.IOException;
import java.net.ProtocolException;

/* JADX INFO: loaded from: classes2.dex */
public final class b implements v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f4641a;

    public b(boolean z6) {
        this.f4641a = z6;
    }

    @Override // T5.v
    public D a(v.a aVar) throws IOException {
        boolean z6;
        D.a aVarQ;
        D.a aVarU;
        E eP;
        w5.k.f(aVar, "chain");
        g gVar = (g) aVar;
        Y5.c cVarF = gVar.f();
        w5.k.c(cVarF);
        B bH = gVar.h();
        C cA = bH.a();
        long jCurrentTimeMillis = System.currentTimeMillis();
        cVarF.v(bH);
        if (!f.b(bH.h()) || cA == null) {
            cVarF.o();
            z6 = true;
            aVarQ = null;
        } else {
            if (F5.g.p("100-continue", bH.d("Expect"), true)) {
                cVarF.f();
                aVarQ = cVarF.q(true);
                cVarF.s();
                z6 = false;
            } else {
                z6 = true;
                aVarQ = null;
            }
            if (aVarQ != null) {
                cVarF.o();
                if (!cVarF.h().v()) {
                    cVarF.n();
                }
            } else if (cA.f()) {
                cVarF.f();
                cA.h(q.c(cVarF.c(bH, true)));
            } else {
                i6.g gVarC = q.c(cVarF.c(bH, false));
                cA.h(gVarC);
                gVarC.close();
            }
        }
        if (cA == null || !cA.f()) {
            cVarF.e();
        }
        if (aVarQ == null) {
            aVarQ = cVarF.q(false);
            w5.k.c(aVarQ);
            if (z6) {
                cVarF.s();
                z6 = false;
            }
        }
        D dC = aVarQ.r(bH).i(cVarF.h().r()).s(jCurrentTimeMillis).q(System.currentTimeMillis()).c();
        int iF = dC.f();
        if (iF == 100) {
            D.a aVarQ2 = cVarF.q(false);
            w5.k.c(aVarQ2);
            if (z6) {
                cVarF.s();
            }
            dC = aVarQ2.r(bH).i(cVarF.h().r()).s(jCurrentTimeMillis).q(System.currentTimeMillis()).c();
            iF = dC.f();
        }
        cVarF.r(dC);
        if (this.f4641a && iF == 101) {
            aVarU = dC.U();
            eP = U5.c.f3985c;
        } else {
            aVarU = dC.U();
            eP = cVarF.p(dC);
        }
        D dC2 = aVarU.b(eP).c();
        if (F5.g.p("close", dC2.j0().d("Connection"), true) || F5.g.p("close", D.o(dC2, "Connection", null, 2, null), true)) {
            cVarF.n();
        }
        if (iF == 204 || iF == 205) {
            E eA = dC2.a();
            if ((eA != null ? eA.e() : -1L) > 0) {
                StringBuilder sb = new StringBuilder();
                sb.append("HTTP ");
                sb.append(iF);
                sb.append(" had non-zero Content-Length: ");
                E eA2 = dC2.a();
                sb.append(eA2 != null ? Long.valueOf(eA2.e()) : null);
                throw new ProtocolException(sb.toString());
            }
        }
        return dC2;
    }
}
