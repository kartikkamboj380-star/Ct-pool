package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.internal.measurement.N6;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.n2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1449n2 extends AbstractC1533z3 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private char f16186c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f16187d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f16188e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final C1463p2 f16189f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final C1463p2 f16190g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final C1463p2 f16191h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final C1463p2 f16192i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final C1463p2 f16193j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final C1463p2 f16194k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final C1463p2 f16195l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final C1463p2 f16196m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final C1463p2 f16197n;

    C1449n2(S2 s22) {
        super(s22);
        this.f16186c = (char) 0;
        this.f16187d = -1L;
        this.f16189f = new C1463p2(this, 6, false, false);
        this.f16190g = new C1463p2(this, 6, true, false);
        this.f16191h = new C1463p2(this, 6, false, true);
        this.f16192i = new C1463p2(this, 5, false, false);
        this.f16193j = new C1463p2(this, 5, true, false);
        this.f16194k = new C1463p2(this, 5, false, true);
        this.f16195l = new C1463p2(this, 4, false, false);
        this.f16196m = new C1463p2(this, 3, false, false);
        this.f16197n = new C1463p2(this, 2, false, false);
    }

    private static String C(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        int iLastIndexOf = str.lastIndexOf(46);
        return iLastIndexOf == -1 ? (N6.a() && ((Boolean) G.f15471H0.a(null)).booleanValue()) ? "" : str : str.substring(0, iLastIndexOf);
    }

    private final String N() {
        String str;
        synchronized (this) {
            try {
                if (this.f16188e == null) {
                    this.f16188e = this.f16325a.M() != null ? this.f16325a.M() : "FA";
                }
                Preconditions.checkNotNull(this.f16188e);
                str = this.f16188e;
            } catch (Throwable th) {
                throw th;
            }
        }
        return str;
    }

    protected static Object t(String str) {
        if (str == null) {
            return null;
        }
        return new C1456o2(str);
    }

    private static String u(boolean z6, Object obj) {
        String className;
        if (obj == null) {
            return "";
        }
        if (obj instanceof Integer) {
            obj = Long.valueOf(((Integer) obj).intValue());
        }
        int i7 = 0;
        if (obj instanceof Long) {
            if (!z6) {
                return String.valueOf(obj);
            }
            Long l7 = (Long) obj;
            if (Math.abs(l7.longValue()) < 100) {
                return String.valueOf(obj);
            }
            String str = String.valueOf(obj).charAt(0) == '-' ? "-" : "";
            String strValueOf = String.valueOf(Math.abs(l7.longValue()));
            return str + Math.round(Math.pow(10.0d, strValueOf.length() - 1)) + "..." + str + Math.round(Math.pow(10.0d, strValueOf.length()) - 1.0d);
        }
        if (obj instanceof Boolean) {
            return String.valueOf(obj);
        }
        if (!(obj instanceof Throwable)) {
            return obj instanceof C1456o2 ? ((C1456o2) obj).f16212a : z6 ? "-" : String.valueOf(obj);
        }
        Throwable th = (Throwable) obj;
        StringBuilder sb = new StringBuilder(z6 ? th.getClass().getName() : th.toString());
        String strC = C(S2.class.getCanonicalName());
        StackTraceElement[] stackTrace = th.getStackTrace();
        int length = stackTrace.length;
        while (true) {
            if (i7 >= length) {
                break;
            }
            StackTraceElement stackTraceElement = stackTrace[i7];
            if (!stackTraceElement.isNativeMethod() && (className = stackTraceElement.getClassName()) != null && C(className).equals(strC)) {
                sb.append(": ");
                sb.append(stackTraceElement);
                break;
            }
            i7++;
        }
        return sb.toString();
    }

    static String v(boolean z6, String str, Object obj, Object obj2, Object obj3) {
        String str2 = "";
        if (str == null) {
            str = "";
        }
        String strU = u(z6, obj);
        String strU2 = u(z6, obj2);
        String strU3 = u(z6, obj3);
        StringBuilder sb = new StringBuilder();
        if (!TextUtils.isEmpty(str)) {
            sb.append(str);
            str2 = ": ";
        }
        String str3 = ", ";
        if (!TextUtils.isEmpty(strU)) {
            sb.append(str2);
            sb.append(strU);
            str2 = ", ";
        }
        if (TextUtils.isEmpty(strU2)) {
            str3 = str2;
        } else {
            sb.append(str2);
            sb.append(strU2);
        }
        if (!TextUtils.isEmpty(strU3)) {
            sb.append(str3);
            sb.append(strU3);
        }
        return sb.toString();
    }

    protected final boolean A(int i7) {
        return Log.isLoggable(N(), i7);
    }

    public final C1463p2 D() {
        return this.f16196m;
    }

    public final C1463p2 E() {
        return this.f16189f;
    }

    public final C1463p2 F() {
        return this.f16191h;
    }

    public final C1463p2 G() {
        return this.f16190g;
    }

    public final C1463p2 H() {
        return this.f16195l;
    }

    public final C1463p2 I() {
        return this.f16197n;
    }

    public final C1463p2 J() {
        return this.f16192i;
    }

    public final C1463p2 K() {
        return this.f16194k;
    }

    public final C1463p2 L() {
        return this.f16193j;
    }

    public final String M() {
        Pair pairA;
        if (g().f16373f == null || (pairA = g().f16373f.a()) == null || pairA == C1532z2.f16368B) {
            return null;
        }
        return String.valueOf(pairA.second) + ":" + ((String) pairA.first);
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC1512w3, com.google.android.gms.measurement.internal.InterfaceC1526y3
    public final /* bridge */ /* synthetic */ Context a() {
        return super.a();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC1512w3
    public final /* bridge */ /* synthetic */ C1397g b() {
        return super.b();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC1512w3
    public final /* bridge */ /* synthetic */ C1515x c() {
        return super.c();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC1512w3, com.google.android.gms.measurement.internal.InterfaceC1526y3
    public final /* bridge */ /* synthetic */ C1449n2 d() {
        return super.d();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC1512w3
    public final /* bridge */ /* synthetic */ C1407h2 e() {
        return super.e();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC1512w3, com.google.android.gms.measurement.internal.InterfaceC1526y3
    public final /* bridge */ /* synthetic */ P2 f() {
        return super.f();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC1512w3
    public final /* bridge */ /* synthetic */ C1532z2 g() {
        return super.g();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC1512w3
    public final /* bridge */ /* synthetic */ d6 h() {
        return super.h();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC1512w3
    public final /* bridge */ /* synthetic */ void j() {
        super.j();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC1512w3
    public final /* bridge */ /* synthetic */ void k() {
        super.k();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC1512w3
    public final /* bridge */ /* synthetic */ void l() {
        super.l();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC1533z3
    protected final boolean r() {
        return false;
    }

    protected final void w(int i7, String str) {
        Log.println(i7, N(), str);
    }

    protected final void x(int i7, boolean z6, boolean z7, String str, Object obj, Object obj2, Object obj3) {
        String str2;
        if (!z6 && A(i7)) {
            w(i7, v(false, str, obj, obj2, obj3));
        }
        if (z7 || i7 < 5) {
            return;
        }
        Preconditions.checkNotNull(str);
        P2 p2E = this.f16325a.E();
        if (p2E == null) {
            str2 = "Scheduler not set. Not logging error/warn";
        } else {
            if (p2E.q()) {
                if (i7 < 0) {
                    i7 = 0;
                }
                if (i7 >= 9) {
                    i7 = 8;
                }
                p2E.B(new RunnableC1442m2(this, i7, str, obj, obj2, obj3));
                return;
            }
            str2 = "Scheduler not initialized. Not logging error/warn";
        }
        w(6, str2);
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC1512w3, com.google.android.gms.measurement.internal.InterfaceC1526y3
    public final /* bridge */ /* synthetic */ Clock zzb() {
        return super.zzb();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC1512w3, com.google.android.gms.measurement.internal.InterfaceC1526y3
    public final /* bridge */ /* synthetic */ C1369c zzd() {
        return super.zzd();
    }
}
