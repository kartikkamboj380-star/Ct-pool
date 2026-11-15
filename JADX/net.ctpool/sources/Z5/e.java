package Z5;

import T5.C0462h;
import T5.D;
import T5.m;
import T5.n;
import T5.t;
import T5.u;
import com.google.android.gms.common.internal.ImagesContract;
import i6.i;
import j5.AbstractC1787F;
import java.io.EOFException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public abstract class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final i6.i f4645a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final i6.i f4646b;

    static {
        i.a aVar = i6.i.f20019q;
        f4645a = aVar.d("\"\\");
        f4646b = aVar.d("\t ,=");
    }

    public static final List a(t tVar, String str) {
        w5.k.f(tVar, "$this$parseChallenges");
        w5.k.f(str, "headerName");
        ArrayList arrayList = new ArrayList();
        int size = tVar.size();
        for (int i7 = 0; i7 < size; i7++) {
            if (F5.g.p(str, tVar.h(i7), true)) {
                try {
                    c(new i6.f().k0(tVar.m(i7)), arrayList);
                } catch (EOFException e7) {
                    d6.j.f18715c.g().k("Unable to parse challenge", 5, e7);
                }
            }
        }
        return arrayList;
    }

    public static final boolean b(D d7) {
        w5.k.f(d7, "$this$promisesBody");
        if (w5.k.b(d7.j0().h(), "HEAD")) {
            return false;
        }
        int iF = d7.f();
        return (((iF >= 100 && iF < 200) || iF == 204 || iF == 304) && U5.c.s(d7) == -1 && !F5.g.p("chunked", D.o(d7, "Transfer-Encoding", null, 2, null), true)) ? false : true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x0085, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0085, code lost:
    
        continue;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0090  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void c(i6.f fVar, List list) throws EOFException {
        String strE;
        int I6;
        LinkedHashMap linkedHashMap;
        while (true) {
            String strE2 = null;
            while (true) {
                if (strE2 == null) {
                    g(fVar);
                    strE2 = e(fVar);
                    if (strE2 == null) {
                        return;
                    }
                }
                boolean zG = g(fVar);
                strE = e(fVar);
                if (strE == null) {
                    if (fVar.O()) {
                        list.add(new C0462h(strE2, AbstractC1787F.g()));
                        return;
                    }
                    return;
                }
                byte b7 = (byte) 61;
                I6 = U5.c.I(fVar, b7);
                boolean zG2 = g(fVar);
                if (zG || (!zG2 && !fVar.O())) {
                    linkedHashMap = new LinkedHashMap();
                    int I7 = I6 + U5.c.I(fVar, b7);
                    while (true) {
                        if (strE == null) {
                            strE = e(fVar);
                            if (g(fVar)) {
                                break;
                            }
                            I7 = U5.c.I(fVar, b7);
                            if (I7 != 0) {
                                break;
                            }
                            if (I7 > 1 || g(fVar)) {
                                return;
                            }
                            String strD = h(fVar, (byte) 34) ? d(fVar) : e(fVar);
                            if (strD == null || ((String) linkedHashMap.put(strE, strD)) != null) {
                                return;
                            }
                            if (!g(fVar) && !fVar.O()) {
                                return;
                            } else {
                                strE = null;
                            }
                        } else if (I7 != 0) {
                        }
                    }
                }
                list.add(new C0462h(strE2, linkedHashMap));
                strE2 = strE;
            }
            Map mapSingletonMap = Collections.singletonMap(null, strE + F5.g.t("=", I6));
            w5.k.e(mapSingletonMap, "Collections.singletonMap…ek + \"=\".repeat(eqCount))");
            list.add(new C0462h(strE2, mapSingletonMap));
        }
    }

    private static final String d(i6.f fVar) throws EOFException {
        byte b7 = (byte) 34;
        if (!(fVar.q0() == b7)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        i6.f fVar2 = new i6.f();
        while (true) {
            long jW = fVar.W(f4645a);
            if (jW == -1) {
                return null;
            }
            if (fVar.z(jW) == b7) {
                fVar2.w0(fVar, jW);
                fVar.q0();
                return fVar2.J0();
            }
            if (fVar.m1() == jW + 1) {
                return null;
            }
            fVar2.w0(fVar, jW);
            fVar.q0();
            fVar2.w0(fVar, 1L);
        }
    }

    private static final String e(i6.f fVar) {
        long jW = fVar.W(f4646b);
        if (jW == -1) {
            jW = fVar.m1();
        }
        if (jW != 0) {
            return fVar.k1(jW);
        }
        return null;
    }

    public static final void f(n nVar, u uVar, t tVar) {
        w5.k.f(nVar, "$this$receiveHeaders");
        w5.k.f(uVar, ImagesContract.URL);
        w5.k.f(tVar, "headers");
        if (nVar == n.f3596a) {
            return;
        }
        List listE = m.f3577n.e(uVar, tVar);
        if (listE.isEmpty()) {
            return;
        }
        nVar.a(uVar, listE);
    }

    private static final boolean g(i6.f fVar) throws EOFException {
        boolean z6 = false;
        while (!fVar.O()) {
            byte bZ = fVar.z(0L);
            if (bZ == 9 || bZ == 32) {
                fVar.q0();
            } else {
                if (bZ != 44) {
                    break;
                }
                fVar.q0();
                z6 = true;
            }
        }
        return z6;
    }

    private static final boolean h(i6.f fVar, byte b7) {
        return !fVar.O() && fVar.z(0L) == b7;
    }
}
