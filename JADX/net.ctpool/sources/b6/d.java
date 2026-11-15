package b6;

import com.google.android.gms.common.api.Api;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import i6.C;
import i6.q;
import j5.AbstractC1803h;
import j5.AbstractC1809n;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes2.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final c[] f9755a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Map f9756b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final d f9757c;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final List f9758a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final i6.h f9759b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public c[] f9760c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f9761d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f9762e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f9763f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final int f9764g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private int f9765h;

        public a(C c7, int i7, int i8) {
            w5.k.f(c7, "source");
            this.f9764g = i7;
            this.f9765h = i8;
            this.f9758a = new ArrayList();
            this.f9759b = q.d(c7);
            this.f9760c = new c[8];
            this.f9761d = r2.length - 1;
        }

        private final void a() {
            int i7 = this.f9765h;
            int i8 = this.f9763f;
            if (i7 < i8) {
                if (i7 == 0) {
                    b();
                } else {
                    d(i8 - i7);
                }
            }
        }

        private final void b() {
            AbstractC1803h.l(this.f9760c, null, 0, 0, 6, null);
            this.f9761d = this.f9760c.length - 1;
            this.f9762e = 0;
            this.f9763f = 0;
        }

        private final int c(int i7) {
            return this.f9761d + 1 + i7;
        }

        private final int d(int i7) {
            int i8;
            int i9 = 0;
            if (i7 > 0) {
                int length = this.f9760c.length;
                while (true) {
                    length--;
                    i8 = this.f9761d;
                    if (length < i8 || i7 <= 0) {
                        break;
                    }
                    c cVar = this.f9760c[length];
                    w5.k.c(cVar);
                    int i10 = cVar.f9752a;
                    i7 -= i10;
                    this.f9763f -= i10;
                    this.f9762e--;
                    i9++;
                }
                c[] cVarArr = this.f9760c;
                System.arraycopy(cVarArr, i8 + 1, cVarArr, i8 + 1 + i9, this.f9762e);
                this.f9761d += i9;
            }
            return i9;
        }

        private final i6.i f(int i7) throws IOException {
            c cVar;
            if (!h(i7)) {
                int iC = c(i7 - d.f9757c.c().length);
                if (iC >= 0) {
                    c[] cVarArr = this.f9760c;
                    if (iC < cVarArr.length) {
                        cVar = cVarArr[iC];
                        w5.k.c(cVar);
                    }
                }
                throw new IOException("Header index too large " + (i7 + 1));
            }
            cVar = d.f9757c.c()[i7];
            return cVar.f9753b;
        }

        private final void g(int i7, c cVar) {
            this.f9758a.add(cVar);
            int i8 = cVar.f9752a;
            if (i7 != -1) {
                c cVar2 = this.f9760c[c(i7)];
                w5.k.c(cVar2);
                i8 -= cVar2.f9752a;
            }
            int i9 = this.f9765h;
            if (i8 > i9) {
                b();
                return;
            }
            int iD = d((this.f9763f + i8) - i9);
            if (i7 == -1) {
                int i10 = this.f9762e + 1;
                c[] cVarArr = this.f9760c;
                if (i10 > cVarArr.length) {
                    c[] cVarArr2 = new c[cVarArr.length * 2];
                    System.arraycopy(cVarArr, 0, cVarArr2, cVarArr.length, cVarArr.length);
                    this.f9761d = this.f9760c.length - 1;
                    this.f9760c = cVarArr2;
                }
                int i11 = this.f9761d;
                this.f9761d = i11 - 1;
                this.f9760c[i11] = cVar;
                this.f9762e++;
            } else {
                this.f9760c[i7 + c(i7) + iD] = cVar;
            }
            this.f9763f += i8;
        }

        private final boolean h(int i7) {
            return i7 >= 0 && i7 <= d.f9757c.c().length - 1;
        }

        private final int i() {
            return U5.c.b(this.f9759b.q0(), 255);
        }

        private final void l(int i7) throws IOException {
            if (h(i7)) {
                this.f9758a.add(d.f9757c.c()[i7]);
                return;
            }
            int iC = c(i7 - d.f9757c.c().length);
            if (iC >= 0) {
                c[] cVarArr = this.f9760c;
                if (iC < cVarArr.length) {
                    List list = this.f9758a;
                    c cVar = cVarArr[iC];
                    w5.k.c(cVar);
                    list.add(cVar);
                    return;
                }
            }
            throw new IOException("Header index too large " + (i7 + 1));
        }

        private final void n(int i7) {
            g(-1, new c(f(i7), j()));
        }

        private final void o() {
            g(-1, new c(d.f9757c.a(j()), j()));
        }

        private final void p(int i7) throws IOException {
            this.f9758a.add(new c(f(i7), j()));
        }

        private final void q() throws IOException {
            this.f9758a.add(new c(d.f9757c.a(j()), j()));
        }

        public final List e() {
            List listB0 = AbstractC1809n.b0(this.f9758a);
            this.f9758a.clear();
            return listB0;
        }

        public final i6.i j() {
            int i7 = i();
            boolean z6 = (i7 & 128) == 128;
            long jM = m(i7, ModuleDescriptor.MODULE_VERSION);
            if (!z6) {
                return this.f9759b.t(jM);
            }
            i6.f fVar = new i6.f();
            k.f9949d.b(this.f9759b, jM, fVar);
            return fVar.f1();
        }

        public final void k() throws IOException {
            while (!this.f9759b.O()) {
                int iB = U5.c.b(this.f9759b.q0(), 255);
                if (iB == 128) {
                    throw new IOException("index == 0");
                }
                if ((iB & 128) == 128) {
                    l(m(iB, ModuleDescriptor.MODULE_VERSION) - 1);
                } else if (iB == 64) {
                    o();
                } else if ((iB & 64) == 64) {
                    n(m(iB, 63) - 1);
                } else if ((iB & 32) == 32) {
                    int iM = m(iB, 31);
                    this.f9765h = iM;
                    if (iM < 0 || iM > this.f9764g) {
                        throw new IOException("Invalid dynamic table size update " + this.f9765h);
                    }
                    a();
                } else if (iB == 16 || iB == 0) {
                    q();
                } else {
                    p(m(iB, 15) - 1);
                }
            }
        }

        public final int m(int i7, int i8) {
            int i9 = i7 & i8;
            if (i9 < i8) {
                return i9;
            }
            int i10 = 0;
            while (true) {
                int i11 = i();
                if ((i11 & 128) == 0) {
                    return i8 + (i11 << i10);
                }
                i8 += (i11 & ModuleDescriptor.MODULE_VERSION) << i10;
                i10 += 7;
            }
        }

        public /* synthetic */ a(C c7, int i7, int i8, int i9, DefaultConstructorMarker defaultConstructorMarker) {
            this(c7, i7, (i9 & 4) != 0 ? i7 : i8);
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f9766a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f9767b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f9768c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public c[] f9769d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f9770e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f9771f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f9772g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f9773h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private final boolean f9774i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private final i6.f f9775j;

        public b(int i7, boolean z6, i6.f fVar) {
            w5.k.f(fVar, "out");
            this.f9773h = i7;
            this.f9774i = z6;
            this.f9775j = fVar;
            this.f9766a = Api.BaseClientBuilder.API_PRIORITY_OTHER;
            this.f9768c = i7;
            this.f9769d = new c[8];
            this.f9770e = r2.length - 1;
        }

        private final void a() {
            int i7 = this.f9768c;
            int i8 = this.f9772g;
            if (i7 < i8) {
                if (i7 == 0) {
                    b();
                } else {
                    c(i8 - i7);
                }
            }
        }

        private final void b() {
            AbstractC1803h.l(this.f9769d, null, 0, 0, 6, null);
            this.f9770e = this.f9769d.length - 1;
            this.f9771f = 0;
            this.f9772g = 0;
        }

        private final int c(int i7) {
            int i8;
            int i9 = 0;
            if (i7 > 0) {
                int length = this.f9769d.length;
                while (true) {
                    length--;
                    i8 = this.f9770e;
                    if (length < i8 || i7 <= 0) {
                        break;
                    }
                    c cVar = this.f9769d[length];
                    w5.k.c(cVar);
                    i7 -= cVar.f9752a;
                    int i10 = this.f9772g;
                    c cVar2 = this.f9769d[length];
                    w5.k.c(cVar2);
                    this.f9772g = i10 - cVar2.f9752a;
                    this.f9771f--;
                    i9++;
                }
                c[] cVarArr = this.f9769d;
                System.arraycopy(cVarArr, i8 + 1, cVarArr, i8 + 1 + i9, this.f9771f);
                c[] cVarArr2 = this.f9769d;
                int i11 = this.f9770e;
                Arrays.fill(cVarArr2, i11 + 1, i11 + 1 + i9, (Object) null);
                this.f9770e += i9;
            }
            return i9;
        }

        private final void d(c cVar) {
            int i7 = cVar.f9752a;
            int i8 = this.f9768c;
            if (i7 > i8) {
                b();
                return;
            }
            c((this.f9772g + i7) - i8);
            int i9 = this.f9771f + 1;
            c[] cVarArr = this.f9769d;
            if (i9 > cVarArr.length) {
                c[] cVarArr2 = new c[cVarArr.length * 2];
                System.arraycopy(cVarArr, 0, cVarArr2, cVarArr.length, cVarArr.length);
                this.f9770e = this.f9769d.length - 1;
                this.f9769d = cVarArr2;
            }
            int i10 = this.f9770e;
            this.f9770e = i10 - 1;
            this.f9769d[i10] = cVar;
            this.f9771f++;
            this.f9772g += i7;
        }

        public final void e(int i7) {
            this.f9773h = i7;
            int iMin = Math.min(i7, 16384);
            int i8 = this.f9768c;
            if (i8 == iMin) {
                return;
            }
            if (iMin < i8) {
                this.f9766a = Math.min(this.f9766a, iMin);
            }
            this.f9767b = true;
            this.f9768c = iMin;
            a();
        }

        /* JADX WARN: Removed duplicated region for block: B:8:0x0032  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void f(i6.i iVar) {
            int iC;
            int i7;
            w5.k.f(iVar, "data");
            if (this.f9774i) {
                k kVar = k.f9949d;
                if (kVar.d(iVar) < iVar.C()) {
                    i6.f fVar = new i6.f();
                    kVar.c(iVar, fVar);
                    iVar = fVar.f1();
                    iC = iVar.C();
                    i7 = 128;
                } else {
                    iC = iVar.C();
                    i7 = 0;
                }
            }
            h(iC, ModuleDescriptor.MODULE_VERSION, i7);
            this.f9775j.H(iVar);
        }

        /* JADX WARN: Removed duplicated region for block: B:23:0x0077  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void g(List list) {
            int length;
            int length2;
            w5.k.f(list, "headerBlock");
            if (this.f9767b) {
                int i7 = this.f9766a;
                if (i7 < this.f9768c) {
                    h(i7, 31, 32);
                }
                this.f9767b = false;
                this.f9766a = Api.BaseClientBuilder.API_PRIORITY_OTHER;
                h(this.f9768c, 31, 32);
            }
            int size = list.size();
            for (int i8 = 0; i8 < size; i8++) {
                c cVar = (c) list.get(i8);
                i6.i iVarE = cVar.f9753b.E();
                i6.i iVar = cVar.f9754c;
                d dVar = d.f9757c;
                Integer num = (Integer) dVar.b().get(iVarE);
                if (num != null) {
                    int iIntValue = num.intValue();
                    length2 = iIntValue + 1;
                    if (2 <= length2 && 7 >= length2) {
                        if (w5.k.b(dVar.c()[iIntValue].f9754c, iVar)) {
                            length = length2;
                        } else if (w5.k.b(dVar.c()[length2].f9754c, iVar)) {
                            length = length2;
                            length2 = iIntValue + 2;
                        } else {
                            length = length2;
                            length2 = -1;
                        }
                    }
                } else {
                    length = -1;
                    length2 = -1;
                }
                if (length2 == -1) {
                    int i9 = this.f9770e + 1;
                    int length3 = this.f9769d.length;
                    while (true) {
                        if (i9 >= length3) {
                            break;
                        }
                        c cVar2 = this.f9769d[i9];
                        w5.k.c(cVar2);
                        if (w5.k.b(cVar2.f9753b, iVarE)) {
                            c cVar3 = this.f9769d[i9];
                            w5.k.c(cVar3);
                            if (w5.k.b(cVar3.f9754c, iVar)) {
                                length2 = d.f9757c.c().length + (i9 - this.f9770e);
                                break;
                            } else if (length == -1) {
                                length = (i9 - this.f9770e) + d.f9757c.c().length;
                            }
                        }
                        i9++;
                    }
                }
                if (length2 != -1) {
                    h(length2, ModuleDescriptor.MODULE_VERSION, 128);
                } else {
                    if (length == -1) {
                        this.f9775j.P(64);
                        f(iVarE);
                    } else if (iVarE.D(c.f9745d) && (!w5.k.b(c.f9750i, iVarE))) {
                        h(length, 15, 0);
                        f(iVar);
                    } else {
                        h(length, 63, 64);
                    }
                    f(iVar);
                    d(cVar);
                }
            }
        }

        public final void h(int i7, int i8, int i9) {
            int i10;
            i6.f fVar;
            if (i7 < i8) {
                fVar = this.f9775j;
                i10 = i7 | i9;
            } else {
                this.f9775j.P(i9 | i8);
                i10 = i7 - i8;
                while (i10 >= 128) {
                    this.f9775j.P(128 | (i10 & ModuleDescriptor.MODULE_VERSION));
                    i10 >>>= 7;
                }
                fVar = this.f9775j;
            }
            fVar.P(i10);
        }

        public /* synthetic */ b(int i7, boolean z6, i6.f fVar, int i8, DefaultConstructorMarker defaultConstructorMarker) {
            this((i8 & 1) != 0 ? 4096 : i7, (i8 & 2) != 0 ? true : z6, fVar);
        }
    }

    static {
        d dVar = new d();
        f9757c = dVar;
        c cVar = new c(c.f9750i, "");
        i6.i iVar = c.f9747f;
        c cVar2 = new c(iVar, "GET");
        c cVar3 = new c(iVar, "POST");
        i6.i iVar2 = c.f9748g;
        c cVar4 = new c(iVar2, "/");
        c cVar5 = new c(iVar2, "/index.html");
        i6.i iVar3 = c.f9749h;
        c cVar6 = new c(iVar3, "http");
        c cVar7 = new c(iVar3, "https");
        i6.i iVar4 = c.f9746e;
        f9755a = new c[]{cVar, cVar2, cVar3, cVar4, cVar5, cVar6, cVar7, new c(iVar4, "200"), new c(iVar4, "204"), new c(iVar4, "206"), new c(iVar4, "304"), new c(iVar4, "400"), new c(iVar4, "404"), new c(iVar4, "500"), new c("accept-charset", ""), new c("accept-encoding", "gzip, deflate"), new c("accept-language", ""), new c("accept-ranges", ""), new c("accept", ""), new c("access-control-allow-origin", ""), new c("age", ""), new c("allow", ""), new c("authorization", ""), new c("cache-control", ""), new c("content-disposition", ""), new c("content-encoding", ""), new c("content-language", ""), new c("content-length", ""), new c("content-location", ""), new c("content-range", ""), new c("content-type", ""), new c("cookie", ""), new c("date", ""), new c("etag", ""), new c("expect", ""), new c("expires", ""), new c("from", ""), new c("host", ""), new c("if-match", ""), new c("if-modified-since", ""), new c("if-none-match", ""), new c("if-range", ""), new c("if-unmodified-since", ""), new c("last-modified", ""), new c("link", ""), new c("location", ""), new c("max-forwards", ""), new c("proxy-authenticate", ""), new c("proxy-authorization", ""), new c("range", ""), new c("referer", ""), new c("refresh", ""), new c("retry-after", ""), new c("server", ""), new c("set-cookie", ""), new c("strict-transport-security", ""), new c("transfer-encoding", ""), new c("user-agent", ""), new c("vary", ""), new c("via", ""), new c("www-authenticate", "")};
        f9756b = dVar.d();
    }

    private d() {
    }

    private final Map d() {
        c[] cVarArr = f9755a;
        LinkedHashMap linkedHashMap = new LinkedHashMap(cVarArr.length);
        int length = cVarArr.length;
        for (int i7 = 0; i7 < length; i7++) {
            c[] cVarArr2 = f9755a;
            if (!linkedHashMap.containsKey(cVarArr2[i7].f9753b)) {
                linkedHashMap.put(cVarArr2[i7].f9753b, Integer.valueOf(i7));
            }
        }
        Map mapUnmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        w5.k.e(mapUnmodifiableMap, "Collections.unmodifiableMap(result)");
        return mapUnmodifiableMap;
    }

    public final i6.i a(i6.i iVar) throws IOException {
        w5.k.f(iVar, "name");
        int iC = iVar.C();
        for (int i7 = 0; i7 < iC; i7++) {
            byte b7 = (byte) 65;
            byte b8 = (byte) 90;
            byte bM = iVar.m(i7);
            if (b7 <= bM && b8 >= bM) {
                throw new IOException("PROTOCOL_ERROR response malformed: mixed case name: " + iVar.G());
            }
        }
        return iVar;
    }

    public final Map b() {
        return f9756b;
    }

    public final c[] c() {
        return f9755a;
    }
}
