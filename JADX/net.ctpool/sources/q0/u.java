package q0;

import j5.AbstractC1809n;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import l.InterfaceC1842a;
import l0.C1844b;
import l0.EnumC1843a;

/* JADX INFO: loaded from: classes.dex */
public final class u {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final a f21792u = new a(null);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final String f21793v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final InterfaceC1842a f21794w;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f21795a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public l0.s f21796b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f21797c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f21798d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public androidx.work.b f21799e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public androidx.work.b f21800f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f21801g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f21802h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f21803i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public C1844b f21804j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f21805k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public EnumC1843a f21806l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f21807m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f21808n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f21809o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public long f21810p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f21811q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public l0.m f21812r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f21813s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final int f21814t;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f21815a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public l0.s f21816b;

        public b(String str, l0.s sVar) {
            w5.k.f(str, "id");
            w5.k.f(sVar, "state");
            this.f21815a = str;
            this.f21816b = sVar;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return w5.k.b(this.f21815a, bVar.f21815a) && this.f21816b == bVar.f21816b;
        }

        public int hashCode() {
            return (this.f21815a.hashCode() * 31) + this.f21816b.hashCode();
        }

        public String toString() {
            return "IdAndState(id=" + this.f21815a + ", state=" + this.f21816b + ')';
        }
    }

    static {
        String strI = l0.i.i("WorkSpec");
        w5.k.e(strI, "tagWithPrefix(\"WorkSpec\")");
        f21793v = strI;
        f21794w = new InterfaceC1842a() { // from class: q0.t
            @Override // l.InterfaceC1842a
            public final Object apply(Object obj) {
                return u.b((List) obj);
            }
        };
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public u(String str, String str2) {
        this(str, null, str2, null, null, null, 0L, 0L, 0L, null, 0, null, 0L, 0L, 0L, 0L, false, null, 0, 0, 1048570, null);
        w5.k.f(str, "id");
        w5.k.f(str2, "workerClassName_");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List b(List list) {
        if (list == null) {
            return null;
        }
        List list2 = list;
        ArrayList arrayList = new ArrayList(AbstractC1809n.q(list2, 10));
        Iterator it = list2.iterator();
        if (!it.hasNext()) {
            return arrayList;
        }
        androidx.appcompat.app.y.a(it.next());
        throw null;
    }

    public final long c() {
        if (i()) {
            return this.f21808n + C5.g.g(this.f21806l == EnumC1843a.LINEAR ? this.f21807m * ((long) this.f21805k) : (long) Math.scalb(this.f21807m, this.f21805k - 1), 18000000L);
        }
        if (!j()) {
            long jCurrentTimeMillis = this.f21808n;
            if (jCurrentTimeMillis == 0) {
                jCurrentTimeMillis = System.currentTimeMillis();
            }
            return jCurrentTimeMillis + this.f21801g;
        }
        int i7 = this.f21813s;
        long j7 = this.f21808n;
        if (i7 == 0) {
            j7 += this.f21801g;
        }
        long j8 = this.f21803i;
        long j9 = this.f21802h;
        if (j8 != j9) {
            j = i7 == 0 ? ((long) (-1)) * j8 : 0L;
            j7 += j9;
        } else if (i7 != 0) {
            j = j9;
        }
        return j7 + j;
    }

    public final u d(String str, l0.s sVar, String str2, String str3, androidx.work.b bVar, androidx.work.b bVar2, long j7, long j8, long j9, C1844b c1844b, int i7, EnumC1843a enumC1843a, long j10, long j11, long j12, long j13, boolean z6, l0.m mVar, int i8, int i9) {
        w5.k.f(str, "id");
        w5.k.f(sVar, "state");
        w5.k.f(str2, "workerClassName");
        w5.k.f(bVar, "input");
        w5.k.f(bVar2, "output");
        w5.k.f(c1844b, "constraints");
        w5.k.f(enumC1843a, "backoffPolicy");
        w5.k.f(mVar, "outOfQuotaPolicy");
        return new u(str, sVar, str2, str3, bVar, bVar2, j7, j8, j9, c1844b, i7, enumC1843a, j10, j11, j12, j13, z6, mVar, i8, i9);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return w5.k.b(this.f21795a, uVar.f21795a) && this.f21796b == uVar.f21796b && w5.k.b(this.f21797c, uVar.f21797c) && w5.k.b(this.f21798d, uVar.f21798d) && w5.k.b(this.f21799e, uVar.f21799e) && w5.k.b(this.f21800f, uVar.f21800f) && this.f21801g == uVar.f21801g && this.f21802h == uVar.f21802h && this.f21803i == uVar.f21803i && w5.k.b(this.f21804j, uVar.f21804j) && this.f21805k == uVar.f21805k && this.f21806l == uVar.f21806l && this.f21807m == uVar.f21807m && this.f21808n == uVar.f21808n && this.f21809o == uVar.f21809o && this.f21810p == uVar.f21810p && this.f21811q == uVar.f21811q && this.f21812r == uVar.f21812r && this.f21813s == uVar.f21813s && this.f21814t == uVar.f21814t;
    }

    public final int f() {
        return this.f21814t;
    }

    public final int g() {
        return this.f21813s;
    }

    public final boolean h() {
        return !w5.k.b(C1844b.f21015j, this.f21804j);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v32, types: [int] */
    /* JADX WARN: Type inference failed for: r1v39 */
    /* JADX WARN: Type inference failed for: r1v41 */
    public int hashCode() {
        int iHashCode = ((((this.f21795a.hashCode() * 31) + this.f21796b.hashCode()) * 31) + this.f21797c.hashCode()) * 31;
        String str = this.f21798d;
        int iHashCode2 = (((((((((((((((((((((((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f21799e.hashCode()) * 31) + this.f21800f.hashCode()) * 31) + Long.hashCode(this.f21801g)) * 31) + Long.hashCode(this.f21802h)) * 31) + Long.hashCode(this.f21803i)) * 31) + this.f21804j.hashCode()) * 31) + Integer.hashCode(this.f21805k)) * 31) + this.f21806l.hashCode()) * 31) + Long.hashCode(this.f21807m)) * 31) + Long.hashCode(this.f21808n)) * 31) + Long.hashCode(this.f21809o)) * 31) + Long.hashCode(this.f21810p)) * 31;
        boolean z6 = this.f21811q;
        ?? r12 = z6;
        if (z6) {
            r12 = 1;
        }
        return ((((((iHashCode2 + r12) * 31) + this.f21812r.hashCode()) * 31) + Integer.hashCode(this.f21813s)) * 31) + Integer.hashCode(this.f21814t);
    }

    public final boolean i() {
        return this.f21796b == l0.s.ENQUEUED && this.f21805k > 0;
    }

    public final boolean j() {
        return this.f21802h != 0;
    }

    public final void k(long j7) {
        if (j7 < 900000) {
            l0.i.e().k(f21793v, "Interval duration lesser than minimum allowed value; Changed to 900000");
        }
        l(C5.g.d(j7, 900000L), C5.g.d(j7, 900000L));
    }

    public final void l(long j7, long j8) {
        if (j7 < 900000) {
            l0.i.e().k(f21793v, "Interval duration lesser than minimum allowed value; Changed to 900000");
        }
        this.f21802h = C5.g.d(j7, 900000L);
        if (j8 < 300000) {
            l0.i.e().k(f21793v, "Flex duration lesser than minimum allowed value; Changed to 300000");
        }
        if (j8 > this.f21802h) {
            l0.i.e().k(f21793v, "Flex duration greater than interval duration; Changed to " + j7);
        }
        this.f21803i = C5.g.i(j8, 300000L, this.f21802h);
    }

    public String toString() {
        return "{WorkSpec: " + this.f21795a + '}';
    }

    public u(String str, l0.s sVar, String str2, String str3, androidx.work.b bVar, androidx.work.b bVar2, long j7, long j8, long j9, C1844b c1844b, int i7, EnumC1843a enumC1843a, long j10, long j11, long j12, long j13, boolean z6, l0.m mVar, int i8, int i9) {
        w5.k.f(str, "id");
        w5.k.f(sVar, "state");
        w5.k.f(str2, "workerClassName");
        w5.k.f(bVar, "input");
        w5.k.f(bVar2, "output");
        w5.k.f(c1844b, "constraints");
        w5.k.f(enumC1843a, "backoffPolicy");
        w5.k.f(mVar, "outOfQuotaPolicy");
        this.f21795a = str;
        this.f21796b = sVar;
        this.f21797c = str2;
        this.f21798d = str3;
        this.f21799e = bVar;
        this.f21800f = bVar2;
        this.f21801g = j7;
        this.f21802h = j8;
        this.f21803i = j9;
        this.f21804j = c1844b;
        this.f21805k = i7;
        this.f21806l = enumC1843a;
        this.f21807m = j10;
        this.f21808n = j11;
        this.f21809o = j12;
        this.f21810p = j13;
        this.f21811q = z6;
        this.f21812r = mVar;
        this.f21813s = i8;
        this.f21814t = i9;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ u(String str, l0.s sVar, String str2, String str3, androidx.work.b bVar, androidx.work.b bVar2, long j7, long j8, long j9, C1844b c1844b, int i7, EnumC1843a enumC1843a, long j10, long j11, long j12, long j13, boolean z6, l0.m mVar, int i8, int i9, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        androidx.work.b bVar3;
        androidx.work.b bVar4;
        l0.s sVar2 = (i10 & 2) != 0 ? l0.s.ENQUEUED : sVar;
        String str4 = (i10 & 8) != 0 ? null : str3;
        if ((i10 & 16) != 0) {
            androidx.work.b bVar5 = androidx.work.b.f9254c;
            w5.k.e(bVar5, "EMPTY");
            bVar3 = bVar5;
        } else {
            bVar3 = bVar;
        }
        if ((i10 & 32) != 0) {
            androidx.work.b bVar6 = androidx.work.b.f9254c;
            w5.k.e(bVar6, "EMPTY");
            bVar4 = bVar6;
        } else {
            bVar4 = bVar2;
        }
        this(str, sVar2, str2, str4, bVar3, bVar4, (i10 & 64) != 0 ? 0L : j7, (i10 & 128) != 0 ? 0L : j8, (i10 & 256) != 0 ? 0L : j9, (i10 & 512) != 0 ? C1844b.f21015j : c1844b, (i10 & 1024) != 0 ? 0 : i7, (i10 & 2048) != 0 ? EnumC1843a.EXPONENTIAL : enumC1843a, (i10 & 4096) != 0 ? 30000L : j10, (i10 & 8192) != 0 ? 0L : j11, (i10 & 16384) != 0 ? 0L : j12, (32768 & i10) != 0 ? -1L : j13, (65536 & i10) != 0 ? false : z6, (131072 & i10) != 0 ? l0.m.RUN_AS_NON_EXPEDITED_WORK_REQUEST : mVar, (262144 & i10) != 0 ? 0 : i8, (i10 & 524288) != 0 ? 0 : i9);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public u(String str, u uVar) {
        this(str, uVar.f21796b, uVar.f21797c, uVar.f21798d, new androidx.work.b(uVar.f21799e), new androidx.work.b(uVar.f21800f), uVar.f21801g, uVar.f21802h, uVar.f21803i, new C1844b(uVar.f21804j), uVar.f21805k, uVar.f21806l, uVar.f21807m, uVar.f21808n, uVar.f21809o, uVar.f21810p, uVar.f21811q, uVar.f21812r, uVar.f21813s, 0, 524288, null);
        w5.k.f(str, "newId");
        w5.k.f(uVar, "other");
    }
}
