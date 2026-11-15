package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.r0;
import com.google.android.gms.common.ConnectionResult;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class C0623s {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final C0623s f7741d = new C0623s(true);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final h0 f7742a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f7743b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f7744c;

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.s$a */
    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f7745a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f7746b;

        static {
            int[] iArr = new int[r0.b.values().length];
            f7746b = iArr;
            try {
                iArr[r0.b.f7716o.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f7746b[r0.b.f7717p.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f7746b[r0.b.f7718q.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f7746b[r0.b.f7719r.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f7746b[r0.b.f7720s.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f7746b[r0.b.f7721t.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f7746b[r0.b.f7722u.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f7746b[r0.b.f7723v.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f7746b[r0.b.f7725x.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f7746b[r0.b.f7726y.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f7746b[r0.b.f7724w.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f7746b[r0.b.f7727z.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f7746b[r0.b.f7709A.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f7746b[r0.b.f7711C.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f7746b[r0.b.f7712D.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f7746b[r0.b.f7713E.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f7746b[r0.b.f7714F.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f7746b[r0.b.f7710B.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            int[] iArr2 = new int[r0.c.values().length];
            f7745a = iArr2;
            try {
                iArr2[r0.c.INT.ordinal()] = 1;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f7745a[r0.c.LONG.ordinal()] = 2;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                f7745a[r0.c.FLOAT.ordinal()] = 3;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                f7745a[r0.c.DOUBLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                f7745a[r0.c.BOOLEAN.ordinal()] = 5;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                f7745a[r0.c.STRING.ordinal()] = 6;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                f7745a[r0.c.BYTE_STRING.ordinal()] = 7;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                f7745a[r0.c.ENUM.ordinal()] = 8;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                f7745a[r0.c.MESSAGE.ordinal()] = 9;
            } catch (NoSuchFieldError unused27) {
            }
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.s$b */
    public interface b extends Comparable {
        int d();

        boolean f();

        r0.b g();

        boolean i();
    }

    private C0623s() {
        this.f7742a = h0.r(16);
    }

    static int b(r0.b bVar, int i7, Object obj) {
        int iP = AbstractC0615j.P(i7);
        if (bVar == r0.b.f7725x) {
            iP *= 2;
        }
        return iP + c(bVar, obj);
    }

    static int c(r0.b bVar, Object obj) {
        switch (a.f7746b[bVar.ordinal()]) {
            case 1:
                return AbstractC0615j.i(((Double) obj).doubleValue());
            case 2:
                return AbstractC0615j.q(((Float) obj).floatValue());
            case 3:
                return AbstractC0615j.x(((Long) obj).longValue());
            case 4:
                return AbstractC0615j.T(((Long) obj).longValue());
            case 5:
                return AbstractC0615j.v(((Integer) obj).intValue());
            case 6:
                return AbstractC0615j.o(((Long) obj).longValue());
            case 7:
                return AbstractC0615j.m(((Integer) obj).intValue());
            case 8:
                return AbstractC0615j.d(((Boolean) obj).booleanValue());
            case ConnectionResult.SERVICE_INVALID /* 9 */:
                return AbstractC0615j.s((O) obj);
            case 10:
                return AbstractC0615j.A((O) obj);
            case ConnectionResult.LICENSE_CHECK_FAILED /* 11 */:
                return obj instanceof AbstractC0612g ? AbstractC0615j.g((AbstractC0612g) obj) : AbstractC0615j.O((String) obj);
            case 12:
                return obj instanceof AbstractC0612g ? AbstractC0615j.g((AbstractC0612g) obj) : AbstractC0615j.e((byte[]) obj);
            case 13:
                return AbstractC0615j.R(((Integer) obj).intValue());
            case 14:
                return AbstractC0615j.G(((Integer) obj).intValue());
            case 15:
                return AbstractC0615j.I(((Long) obj).longValue());
            case 16:
                return AbstractC0615j.K(((Integer) obj).intValue());
            case 17:
                return AbstractC0615j.M(((Long) obj).longValue());
            case ConnectionResult.SERVICE_UPDATING /* 18 */:
                return AbstractC0615j.k(((Integer) obj).intValue());
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    public static int d(b bVar, Object obj) {
        r0.b bVarG = bVar.g();
        int iD = bVar.d();
        if (!bVar.f()) {
            return b(bVarG, iD, obj);
        }
        int iB = 0;
        List list = (List) obj;
        if (bVar.i()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                iB += c(bVarG, it.next());
            }
            return AbstractC0615j.P(iD) + iB + AbstractC0615j.E(iB);
        }
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            iB += b(bVarG, iD, it2.next());
        }
        return iB;
    }

    private int g(Map.Entry entry) {
        androidx.appcompat.app.y.a(entry.getKey());
        entry.getValue();
        throw null;
    }

    static int i(r0.b bVar, boolean z6) {
        if (z6) {
            return 2;
        }
        return bVar.h();
    }

    private static boolean l(Map.Entry entry) {
        androidx.appcompat.app.y.a(entry.getKey());
        throw null;
    }

    private static boolean m(r0.b bVar, Object obj) {
        AbstractC0629y.a(obj);
        switch (a.f7745a[bVar.e().ordinal()]) {
            case 1:
                return obj instanceof Integer;
            case 2:
                return obj instanceof Long;
            case 3:
                return obj instanceof Float;
            case 4:
                return obj instanceof Double;
            case 5:
                return obj instanceof Boolean;
            case 6:
                return obj instanceof String;
            case 7:
                return (obj instanceof AbstractC0612g) || (obj instanceof byte[]);
            case 8:
                return obj instanceof Integer;
            case ConnectionResult.SERVICE_INVALID /* 9 */:
                return obj instanceof O;
            default:
                return false;
        }
    }

    private void q(Map.Entry entry) {
        androidx.appcompat.app.y.a(entry.getKey());
        entry.getValue();
        throw null;
    }

    public static C0623s r() {
        return new C0623s();
    }

    private void t(r0.b bVar, Object obj) {
        if (!m(bVar, obj)) {
            throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
        }
    }

    static void u(AbstractC0615j abstractC0615j, r0.b bVar, int i7, Object obj) {
        if (bVar == r0.b.f7725x) {
            abstractC0615j.r0(i7, (O) obj);
        } else {
            abstractC0615j.N0(i7, i(bVar, false));
            v(abstractC0615j, bVar, obj);
        }
    }

    static void v(AbstractC0615j abstractC0615j, r0.b bVar, Object obj) {
        switch (a.f7746b[bVar.ordinal()]) {
            case 1:
                abstractC0615j.i0(((Double) obj).doubleValue());
                return;
            case 2:
                abstractC0615j.q0(((Float) obj).floatValue());
                return;
            case 3:
                abstractC0615j.y0(((Long) obj).longValue());
                return;
            case 4:
                abstractC0615j.R0(((Long) obj).longValue());
                return;
            case 5:
                abstractC0615j.w0(((Integer) obj).intValue());
                return;
            case 6:
                abstractC0615j.o0(((Long) obj).longValue());
                return;
            case 7:
                abstractC0615j.m0(((Integer) obj).intValue());
                return;
            case 8:
                abstractC0615j.c0(((Boolean) obj).booleanValue());
                return;
            case ConnectionResult.SERVICE_INVALID /* 9 */:
                abstractC0615j.t0((O) obj);
                return;
            case 10:
                abstractC0615j.A0((O) obj);
                return;
            case ConnectionResult.LICENSE_CHECK_FAILED /* 11 */:
                if (!(obj instanceof AbstractC0612g)) {
                    abstractC0615j.M0((String) obj);
                    return;
                }
                break;
            case 12:
                if (!(obj instanceof AbstractC0612g)) {
                    abstractC0615j.d0((byte[]) obj);
                    return;
                }
                break;
            case 13:
                abstractC0615j.P0(((Integer) obj).intValue());
                return;
            case 14:
                abstractC0615j.E0(((Integer) obj).intValue());
                return;
            case 15:
                abstractC0615j.G0(((Long) obj).longValue());
                return;
            case 16:
                abstractC0615j.I0(((Integer) obj).intValue());
                return;
            case 17:
                abstractC0615j.K0(((Long) obj).longValue());
                return;
            case ConnectionResult.SERVICE_UPDATING /* 18 */:
                abstractC0615j.k0(((Integer) obj).intValue());
                return;
            default:
                return;
        }
        abstractC0615j.g0((AbstractC0612g) obj);
    }

    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public C0623s clone() {
        C0623s c0623sR = r();
        for (int i7 = 0; i7 < this.f7742a.l(); i7++) {
            Map.Entry entryK = this.f7742a.k(i7);
            androidx.appcompat.app.y.a(entryK.getKey());
            c0623sR.s(null, entryK.getValue());
        }
        for (Map.Entry entry : this.f7742a.n()) {
            androidx.appcompat.app.y.a(entry.getKey());
            c0623sR.s(null, entry.getValue());
        }
        c0623sR.f7744c = this.f7744c;
        return c0623sR;
    }

    Iterator e() {
        return this.f7744c ? new B(this.f7742a.i().iterator()) : this.f7742a.i().iterator();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0623s) {
            return this.f7742a.equals(((C0623s) obj).f7742a);
        }
        return false;
    }

    public int f() {
        int iG = 0;
        for (int i7 = 0; i7 < this.f7742a.l(); i7++) {
            iG += g(this.f7742a.k(i7));
        }
        Iterator it = this.f7742a.n().iterator();
        while (it.hasNext()) {
            iG += g((Map.Entry) it.next());
        }
        return iG;
    }

    public int h() {
        int iD = 0;
        for (int i7 = 0; i7 < this.f7742a.l(); i7++) {
            Map.Entry entryK = this.f7742a.k(i7);
            androidx.appcompat.app.y.a(entryK.getKey());
            iD += d(null, entryK.getValue());
        }
        for (Map.Entry entry : this.f7742a.n()) {
            androidx.appcompat.app.y.a(entry.getKey());
            iD += d(null, entry.getValue());
        }
        return iD;
    }

    public int hashCode() {
        return this.f7742a.hashCode();
    }

    boolean j() {
        return this.f7742a.isEmpty();
    }

    public boolean k() {
        for (int i7 = 0; i7 < this.f7742a.l(); i7++) {
            if (!l(this.f7742a.k(i7))) {
                return false;
            }
        }
        Iterator it = this.f7742a.n().iterator();
        while (it.hasNext()) {
            if (!l((Map.Entry) it.next())) {
                return false;
            }
        }
        return true;
    }

    public Iterator n() {
        return this.f7744c ? new B(this.f7742a.entrySet().iterator()) : this.f7742a.entrySet().iterator();
    }

    public void o() {
        if (this.f7743b) {
            return;
        }
        this.f7742a.q();
        this.f7743b = true;
    }

    public void p(C0623s c0623s) {
        for (int i7 = 0; i7 < c0623s.f7742a.l(); i7++) {
            q(c0623s.f7742a.k(i7));
        }
        Iterator it = c0623s.f7742a.n().iterator();
        while (it.hasNext()) {
            q((Map.Entry) it.next());
        }
    }

    public void s(b bVar, Object obj) {
        if (!bVar.f()) {
            t(bVar.g(), obj);
        } else {
            if (!(obj instanceof List)) {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                t(bVar.g(), it.next());
            }
            obj = arrayList;
        }
        this.f7742a.s(bVar, obj);
    }

    private C0623s(h0 h0Var) {
        this.f7742a = h0Var;
        o();
    }

    private C0623s(boolean z6) {
        this(h0.r(0));
        o();
    }
}
