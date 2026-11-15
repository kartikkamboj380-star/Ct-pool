package com.facebook.react.devsupport;

import java.io.EOFException;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
class T {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final i6.h f11552a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f11553b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f11554c;

    public interface a {
        void a(Map map, i6.f fVar, boolean z6);

        void b(Map map, long j7, long j8);
    }

    public T(i6.h hVar, String str) {
        this.f11552a = hVar;
        this.f11553b = str;
    }

    private void a(i6.f fVar, boolean z6, a aVar) throws EOFException {
        long J6 = fVar.J(i6.i.l("\r\n\r\n"));
        if (J6 == -1) {
            aVar.a(null, fVar, z6);
            return;
        }
        i6.f fVar2 = new i6.f();
        i6.f fVar3 = new i6.f();
        fVar.L0(fVar2, J6);
        fVar.y0(r0.C());
        fVar.d1(fVar3);
        aVar.a(c(fVar2), fVar3, z6);
    }

    private void b(Map map, long j7, boolean z6, a aVar) {
        if (map == null || aVar == null) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - this.f11554c > 16 || z6) {
            this.f11554c = jCurrentTimeMillis;
            aVar.b(map, j7, map.get("Content-Length") != null ? Long.parseLong((String) map.get("Content-Length")) : 0L);
        }
    }

    private Map c(i6.f fVar) {
        HashMap map = new HashMap();
        for (String str : fVar.J0().split("\r\n")) {
            int iIndexOf = str.indexOf(":");
            if (iIndexOf != -1) {
                map.put(str.substring(0, iIndexOf).trim(), str.substring(iIndexOf + 1).trim());
            }
        }
        return map;
    }

    public boolean d(a aVar) throws EOFException {
        boolean z6;
        long j7;
        i6.i iVarL = i6.i.l("\r\n--" + this.f11553b + "\r\n");
        i6.i iVarL2 = i6.i.l("\r\n--" + this.f11553b + "--\r\n");
        i6.i iVarL3 = i6.i.l("\r\n\r\n");
        i6.f fVar = new i6.f();
        long j8 = 0L;
        long jC = 0L;
        long jM1 = 0L;
        Map mapC = null;
        while (true) {
            long jMax = Math.max(j8 - ((long) iVarL2.C()), jC);
            long jU = fVar.U(iVarL, jMax);
            if (jU == -1) {
                jU = fVar.U(iVarL2, jMax);
                z6 = true;
            } else {
                z6 = false;
            }
            if (jU == -1) {
                long jM12 = fVar.m1();
                if (mapC == null) {
                    long jU2 = fVar.U(iVarL3, jMax);
                    if (jU2 >= 0) {
                        this.f11552a.L0(fVar, jU2);
                        i6.f fVar2 = new i6.f();
                        j7 = jC;
                        fVar.g(fVar2, jMax, jU2 - jMax);
                        jM1 = fVar2.m1() + ((long) iVarL3.C());
                        mapC = c(fVar2);
                    } else {
                        j7 = jC;
                    }
                } else {
                    j7 = jC;
                    b(mapC, fVar.m1() - jM1, false, aVar);
                }
                if (this.f11552a.L0(fVar, 4096) <= 0) {
                    return false;
                }
                j8 = jM12;
                jC = j7;
            } else {
                long j9 = jC;
                long j10 = jU - j9;
                if (j9 > 0) {
                    i6.f fVar3 = new i6.f();
                    fVar.y0(j9);
                    fVar.L0(fVar3, j10);
                    b(mapC, fVar3.m1() - jM1, true, aVar);
                    a(fVar3, z6, aVar);
                    jM1 = 0;
                    mapC = null;
                } else {
                    fVar.y0(jU);
                }
                if (z6) {
                    return true;
                }
                jC = iVarL.C();
                j8 = jC;
            }
        }
    }
}
