package Z5;

import T5.B;
import T5.C;
import T5.D;
import T5.E;
import T5.m;
import T5.n;
import T5.v;
import T5.x;
import i6.q;
import j5.AbstractC1809n;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class a implements v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final n f4640a;

    public a(n nVar) {
        w5.k.f(nVar, "cookieJar");
        this.f4640a = nVar;
    }

    private final String b(List list) {
        StringBuilder sb = new StringBuilder();
        int i7 = 0;
        for (Object obj : list) {
            int i8 = i7 + 1;
            if (i7 < 0) {
                AbstractC1809n.p();
            }
            m mVar = (m) obj;
            if (i7 > 0) {
                sb.append("; ");
            }
            sb.append(mVar.e());
            sb.append('=');
            sb.append(mVar.g());
            i7 = i8;
        }
        String string = sb.toString();
        w5.k.e(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    @Override // T5.v
    public D a(v.a aVar) {
        E eA;
        w5.k.f(aVar, "chain");
        B bO = aVar.o();
        B.a aVarI = bO.i();
        C cA = bO.a();
        if (cA != null) {
            x xVarB = cA.b();
            if (xVarB != null) {
                aVarI.e("Content-Type", xVarB.toString());
            }
            long jA = cA.a();
            if (jA != -1) {
                aVarI.e("Content-Length", String.valueOf(jA));
                aVarI.i("Transfer-Encoding");
            } else {
                aVarI.e("Transfer-Encoding", "chunked");
                aVarI.i("Content-Length");
            }
        }
        boolean z6 = false;
        if (bO.d("Host") == null) {
            aVarI.e("Host", U5.c.Q(bO.l(), false, 1, null));
        }
        if (bO.d("Connection") == null) {
            aVarI.e("Connection", "Keep-Alive");
        }
        if (bO.d("Accept-Encoding") == null && bO.d("Range") == null) {
            aVarI.e("Accept-Encoding", "gzip");
            z6 = true;
        }
        List listD = this.f4640a.d(bO.l());
        if (!listD.isEmpty()) {
            aVarI.e("Cookie", b(listD));
        }
        if (bO.d("User-Agent") == null) {
            aVarI.e("User-Agent", "okhttp/4.9.2");
        }
        D dA = aVar.a(aVarI.b());
        e.f(this.f4640a, bO.l(), dA.w());
        D.a aVarR = dA.U().r(bO);
        if (z6 && F5.g.p("gzip", D.o(dA, "Content-Encoding", null, 2, null), true) && e.b(dA) && (eA = dA.a()) != null) {
            i6.n nVar = new i6.n(eA.j());
            aVarR.k(dA.w().i().h("Content-Encoding").h("Content-Length").e());
            aVarR.b(new h(D.o(dA, "Content-Type", null, 2, null), -1L, q.d(nVar)));
        }
        return aVarR.c();
    }
}
