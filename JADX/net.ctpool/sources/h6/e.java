package h6;

import T5.t;
import kotlin.jvm.internal.DefaultConstructorMarker;
import w5.k;

/* JADX INFO: loaded from: classes2.dex */
public final class e {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final a f19882g = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f19883a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f19884b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f19885c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Integer f19886d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f19887e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f19888f;

    public static final class a {
        private a() {
        }

        /* JADX WARN: Removed duplicated region for block: B:28:0x008b A[PHI: r7 r9
          0x008b: PHI (r7v6 java.lang.Integer) = (r7v4 java.lang.Integer), (r7v4 java.lang.Integer), (r7v7 java.lang.Integer) binds: [B:47:0x00ba, B:44:0x00b1, B:27:0x0089] A[DONT_GENERATE, DONT_INLINE]
          0x008b: PHI (r9v7 java.lang.Integer) = (r9v4 java.lang.Integer), (r9v5 java.lang.Integer), (r9v4 java.lang.Integer) binds: [B:47:0x00ba, B:44:0x00b1, B:27:0x0089] A[DONT_GENERATE, DONT_INLINE]] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final e a(t tVar) {
            k.f(tVar, "responseHeaders");
            int size = tVar.size();
            boolean z6 = false;
            Integer num = null;
            boolean z7 = false;
            Integer num2 = null;
            boolean z8 = false;
            boolean z9 = false;
            for (int i7 = 0; i7 < size; i7++) {
                if (F5.g.p(tVar.h(i7), "Sec-WebSocket-Extensions", true)) {
                    String strM = tVar.m(i7);
                    int i8 = 0;
                    while (i8 < strM.length()) {
                        int iO = U5.c.o(strM, ',', i8, 0, 4, null);
                        int iM = U5.c.m(strM, ';', i8, iO);
                        String strV = U5.c.V(strM, i8, iM);
                        int i9 = iM + 1;
                        if (F5.g.p(strV, "permessage-deflate", true)) {
                            if (z6) {
                                z9 = true;
                            }
                            while (i9 < iO) {
                                int iM2 = U5.c.m(strM, ';', i9, iO);
                                int iM3 = U5.c.m(strM, '=', i9, iM2);
                                String strV2 = U5.c.V(strM, i9, iM3);
                                String strJ0 = iM3 < iM2 ? F5.g.j0(U5.c.V(strM, iM3 + 1, iM2), "\"") : null;
                                int i10 = iM2 + 1;
                                if (F5.g.p(strV2, "client_max_window_bits", true)) {
                                    if (num != null) {
                                        z9 = true;
                                    }
                                    Integer numI = strJ0 != null ? F5.g.i(strJ0) : null;
                                    num = numI;
                                    if (numI == null) {
                                        z9 = true;
                                    }
                                } else if (F5.g.p(strV2, "client_no_context_takeover", true)) {
                                    if (z7) {
                                        z9 = true;
                                    }
                                    if (strJ0 != null) {
                                        z9 = true;
                                    }
                                    z7 = true;
                                } else if (F5.g.p(strV2, "server_max_window_bits", true)) {
                                    if (num2 != null) {
                                        z9 = true;
                                    }
                                    Integer numI2 = strJ0 != null ? F5.g.i(strJ0) : null;
                                    num2 = numI2;
                                    if (numI2 == null) {
                                    }
                                } else if (F5.g.p(strV2, "server_no_context_takeover", true)) {
                                    if (z8) {
                                        z9 = true;
                                    }
                                    if (strJ0 != null) {
                                        z9 = true;
                                    }
                                    z8 = true;
                                }
                                i9 = i10;
                            }
                            i8 = i9;
                            z6 = true;
                        } else {
                            i8 = i9;
                            z9 = true;
                        }
                    }
                }
            }
            return new e(z6, num, z7, num2, z8, z9);
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public e(boolean z6, Integer num, boolean z7, Integer num2, boolean z8, boolean z9) {
        this.f19883a = z6;
        this.f19884b = num;
        this.f19885c = z7;
        this.f19886d = num2;
        this.f19887e = z8;
        this.f19888f = z9;
    }

    public final boolean a(boolean z6) {
        return z6 ? this.f19885c : this.f19887e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f19883a == eVar.f19883a && k.b(this.f19884b, eVar.f19884b) && this.f19885c == eVar.f19885c && k.b(this.f19886d, eVar.f19886d) && this.f19887e == eVar.f19887e && this.f19888f == eVar.f19888f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v4, types: [int] */
    /* JADX WARN: Type inference failed for: r2v7, types: [int] */
    /* JADX WARN: Type inference failed for: r2v9 */
    public int hashCode() {
        boolean z6 = this.f19883a;
        ?? r02 = z6;
        if (z6) {
            r02 = 1;
        }
        int i7 = r02 * 31;
        Integer num = this.f19884b;
        int iHashCode = (i7 + (num != null ? num.hashCode() : 0)) * 31;
        boolean z7 = this.f19885c;
        ?? r22 = z7;
        if (z7) {
            r22 = 1;
        }
        int i8 = (iHashCode + r22) * 31;
        Integer num2 = this.f19886d;
        int iHashCode2 = (i8 + (num2 != null ? num2.hashCode() : 0)) * 31;
        boolean z8 = this.f19887e;
        ?? r23 = z8;
        if (z8) {
            r23 = 1;
        }
        int i9 = (iHashCode2 + r23) * 31;
        boolean z9 = this.f19888f;
        return i9 + (z9 ? 1 : z9);
    }

    public String toString() {
        return "WebSocketExtensions(perMessageDeflate=" + this.f19883a + ", clientMaxWindowBits=" + this.f19884b + ", clientNoContextTakeover=" + this.f19885c + ", serverMaxWindowBits=" + this.f19886d + ", serverNoContextTakeover=" + this.f19887e + ", unknownValues=" + this.f19888f + ")";
    }
}
