package h4;

import android.content.Context;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import k4.F;

/* JADX INFO: loaded from: classes.dex */
public class C {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final Map f19652g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    static final String f19653h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f19654a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final L f19655b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final C1713b f19656c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final q4.d f19657d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final p4.j f19658e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final e4.j f19659f = e4.j.f19211a;

    static {
        HashMap map = new HashMap();
        f19652g = map;
        map.put("armeabi", 5);
        map.put("armeabi-v7a", 6);
        map.put("arm64-v8a", 9);
        map.put("x86", 0);
        map.put("x86_64", 1);
        f19653h = String.format(Locale.US, "Crashlytics Android SDK/%s", "19.2.1");
    }

    public C(Context context, L l7, C1713b c1713b, q4.d dVar, p4.j jVar) {
        this.f19654a = context;
        this.f19655b = l7;
        this.f19656c = c1713b;
        this.f19657d = dVar;
        this.f19658e = jVar;
    }

    private F.e.d.a.c A(F.a aVar) {
        return this.f19659f.a(aVar.e(), aVar.d(), aVar.c());
    }

    private F.a a(F.a aVar) {
        List listUnmodifiableList;
        if (!this.f19658e.b().f21619b.f21628c || this.f19656c.f19710c.size() <= 0) {
            listUnmodifiableList = null;
        } else {
            ArrayList arrayList = new ArrayList();
            for (C1718g c1718g : this.f19656c.f19710c) {
                arrayList.add(F.a.AbstractC0276a.a().d(c1718g.c()).b(c1718g.a()).c(c1718g.b()).a());
            }
            listUnmodifiableList = Collections.unmodifiableList(arrayList);
        }
        return F.a.a().c(aVar.c()).e(aVar.e()).g(aVar.g()).i(aVar.i()).d(aVar.d()).f(aVar.f()).h(aVar.h()).j(aVar.j()).b(listUnmodifiableList).a();
    }

    private F.b b() {
        return k4.F.b().l("19.2.1").h(this.f19656c.f19708a).i(this.f19655b.a().c()).g(this.f19655b.a().e()).f(this.f19655b.a().d()).d(this.f19656c.f19713f).e(this.f19656c.f19714g).k(4);
    }

    private static long f(long j7) {
        if (j7 > 0) {
            return j7;
        }
        return 0L;
    }

    private static int g() {
        Integer num;
        String str = Build.CPU_ABI;
        if (TextUtils.isEmpty(str) || (num = (Integer) f19652g.get(str.toLowerCase(Locale.US))) == null) {
            return 7;
        }
        return num.intValue();
    }

    private F.e.d.a.b.AbstractC0280a h() {
        return F.e.d.a.b.AbstractC0280a.a().b(0L).d(0L).c(this.f19656c.f19712e).e(this.f19656c.f19709b).a();
    }

    private List i() {
        return Collections.singletonList(h());
    }

    private F.e.d.a j(int i7, F.a aVar) {
        return F.e.d.a.a().c(Boolean.valueOf(aVar.c() != 100)).d(A(aVar)).h(i7).f(o(aVar)).a();
    }

    private F.e.d.a k(int i7, q4.e eVar, Thread thread, int i8, int i9, boolean z6) {
        Boolean boolValueOf;
        F.e.d.a.c cVarE = this.f19659f.e(this.f19654a);
        if (cVarE.b() > 0) {
            boolValueOf = Boolean.valueOf(cVarE.b() != 100);
        } else {
            boolValueOf = null;
        }
        return F.e.d.a.a().c(boolValueOf).d(cVarE).b(this.f19659f.d(this.f19654a)).h(i7).f(p(eVar, thread, i8, i9, z6)).a();
    }

    private F.e.d.c l(int i7) {
        C1717f c1717fA = C1717f.a(this.f19654a);
        Float fB = c1717fA.b();
        Double dValueOf = fB != null ? Double.valueOf(fB.doubleValue()) : null;
        int iC = c1717fA.c();
        boolean zN = AbstractC1721j.n(this.f19654a);
        return F.e.d.c.a().b(dValueOf).c(iC).f(zN).e(i7).g(f(AbstractC1721j.b(this.f19654a) - AbstractC1721j.a(this.f19654a))).d(AbstractC1721j.c(Environment.getDataDirectory().getPath())).a();
    }

    private F.e.d.a.b.c m(q4.e eVar, int i7, int i8) {
        return n(eVar, i7, i8, 0);
    }

    private F.e.d.a.b.c n(q4.e eVar, int i7, int i8, int i9) {
        String str = eVar.f21887b;
        String str2 = eVar.f21886a;
        StackTraceElement[] stackTraceElementArr = eVar.f21888c;
        int i10 = 0;
        if (stackTraceElementArr == null) {
            stackTraceElementArr = new StackTraceElement[0];
        }
        q4.e eVar2 = eVar.f21889d;
        if (i9 >= i8) {
            q4.e eVar3 = eVar2;
            while (eVar3 != null) {
                eVar3 = eVar3.f21889d;
                i10++;
            }
        }
        F.e.d.a.b.c.AbstractC0283a abstractC0283aD = F.e.d.a.b.c.a().f(str).e(str2).c(r(stackTraceElementArr, i7)).d(i10);
        if (eVar2 != null && i10 == 0) {
            abstractC0283aD.b(n(eVar2, i7, i8, i9 + 1));
        }
        return abstractC0283aD.a();
    }

    private F.e.d.a.b o(F.a aVar) {
        return F.e.d.a.b.a().b(aVar).e(w()).c(i()).a();
    }

    private F.e.d.a.b p(q4.e eVar, Thread thread, int i7, int i8, boolean z6) {
        return F.e.d.a.b.a().f(z(eVar, thread, i7, z6)).d(m(eVar, i7, i8)).e(w()).c(i()).a();
    }

    private F.e.d.a.b.AbstractC0286e.AbstractC0288b q(StackTraceElement stackTraceElement, F.e.d.a.b.AbstractC0286e.AbstractC0288b.AbstractC0289a abstractC0289a) {
        long lineNumber = 0;
        long jMax = stackTraceElement.isNativeMethod() ? Math.max(stackTraceElement.getLineNumber(), 0L) : 0L;
        String str = stackTraceElement.getClassName() + "." + stackTraceElement.getMethodName();
        String fileName = stackTraceElement.getFileName();
        if (!stackTraceElement.isNativeMethod() && stackTraceElement.getLineNumber() > 0) {
            lineNumber = stackTraceElement.getLineNumber();
        }
        return abstractC0289a.e(jMax).f(str).b(fileName).d(lineNumber).a();
    }

    private List r(StackTraceElement[] stackTraceElementArr, int i7) {
        ArrayList arrayList = new ArrayList();
        for (StackTraceElement stackTraceElement : stackTraceElementArr) {
            arrayList.add(q(stackTraceElement, F.e.d.a.b.AbstractC0286e.AbstractC0288b.a().c(i7)));
        }
        return Collections.unmodifiableList(arrayList);
    }

    private F.e.a s() {
        return F.e.a.a().e(this.f19655b.f()).g(this.f19656c.f19713f).d(this.f19656c.f19714g).f(this.f19655b.a().c()).b(this.f19656c.f19715h.d()).c(this.f19656c.f19715h.e()).a();
    }

    private F.e t(String str, long j7) {
        return F.e.a().m(j7).j(str).h(f19653h).b(s()).l(v()).e(u()).i(3).a();
    }

    private F.e.c u() {
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        int iG = g();
        int iAvailableProcessors = Runtime.getRuntime().availableProcessors();
        long jB = AbstractC1721j.b(this.f19654a);
        long blockCount = ((long) statFs.getBlockCount()) * ((long) statFs.getBlockSize());
        boolean zW = AbstractC1721j.w();
        int iL = AbstractC1721j.l();
        String str = Build.MANUFACTURER;
        return F.e.c.a().b(iG).f(Build.MODEL).c(iAvailableProcessors).h(jB).d(blockCount).i(zW).j(iL).e(str).g(Build.PRODUCT).a();
    }

    private F.e.AbstractC0293e v() {
        return F.e.AbstractC0293e.a().d(3).e(Build.VERSION.RELEASE).b(Build.VERSION.CODENAME).c(AbstractC1721j.x()).a();
    }

    private F.e.d.a.b.AbstractC0284d w() {
        return F.e.d.a.b.AbstractC0284d.a().d("0").c("0").b(0L).a();
    }

    private F.e.d.a.b.AbstractC0286e x(Thread thread, StackTraceElement[] stackTraceElementArr) {
        return y(thread, stackTraceElementArr, 0);
    }

    private F.e.d.a.b.AbstractC0286e y(Thread thread, StackTraceElement[] stackTraceElementArr, int i7) {
        return F.e.d.a.b.AbstractC0286e.a().d(thread.getName()).c(i7).b(r(stackTraceElementArr, i7)).a();
    }

    private List z(q4.e eVar, Thread thread, int i7, boolean z6) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(y(thread, eVar.f21888c, i7));
        if (z6) {
            for (Map.Entry<Thread, StackTraceElement[]> entry : Thread.getAllStackTraces().entrySet()) {
                Thread key = entry.getKey();
                if (!key.equals(thread)) {
                    arrayList.add(x(key, this.f19657d.a(entry.getValue())));
                }
            }
        }
        return Collections.unmodifiableList(arrayList);
    }

    public F.e.d c(F.a aVar) {
        int i7 = this.f19654a.getResources().getConfiguration().orientation;
        return F.e.d.a().g("anr").f(aVar.i()).b(j(i7, a(aVar))).c(l(i7)).a();
    }

    public F.e.d d(Throwable th, Thread thread, String str, long j7, int i7, int i8, boolean z6) {
        int i9 = this.f19654a.getResources().getConfiguration().orientation;
        return F.e.d.a().g(str).f(j7).b(k(i9, q4.e.a(th, this.f19657d), thread, i7, i8, z6)).c(l(i9)).a();
    }

    public k4.F e(String str, long j7) {
        return b().m(t(str, j7)).a();
    }
}
