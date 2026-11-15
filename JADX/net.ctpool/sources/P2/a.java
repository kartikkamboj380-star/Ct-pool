package P2;

import com.facebook.systrace.TraceListener;
import f0.AbstractC1642a;
import kotlin.enums.EnumEntries;
import p5.AbstractC1978a;
import w5.k;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f2562a = new a();

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: renamed from: P2.a$a, reason: collision with other inner class name */
    public static final class EnumC0053a {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final EnumC0053a f2563n = new EnumC0053a("THREAD", 0, 't');

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public static final EnumC0053a f2564o = new EnumC0053a("PROCESS", 1, 'p');

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public static final EnumC0053a f2565p = new EnumC0053a("GLOBAL", 2, 'g');

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private static final /* synthetic */ EnumC0053a[] f2566q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private static final /* synthetic */ EnumEntries f2567r;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private final char f2568m;

        static {
            EnumC0053a[] enumC0053aArrE = e();
            f2566q = enumC0053aArrE;
            f2567r = AbstractC1978a.a(enumC0053aArrE);
        }

        private EnumC0053a(String str, int i7, char c7) {
            this.f2568m = c7;
        }

        private static final /* synthetic */ EnumC0053a[] e() {
            return new EnumC0053a[]{f2563n, f2564o, f2565p};
        }

        public static EnumC0053a valueOf(String str) {
            return (EnumC0053a) Enum.valueOf(EnumC0053a.class, str);
        }

        public static EnumC0053a[] values() {
            return (EnumC0053a[]) f2566q.clone();
        }
    }

    private a() {
    }

    public static final void a(long j7, String str, int i7) {
        k.f(str, "sectionName");
        AbstractC1642a.a(str, i7);
    }

    public static final void b(long j7, String str, int i7, long j8) {
        k.f(str, "sectionName");
        a(j7, str, i7);
    }

    public static final void c(long j7, String str) {
        k.f(str, "sectionName");
        AbstractC1642a.c(str);
    }

    public static final void d(long j7, String str, int i7) {
        k.f(str, "sectionName");
        e(j7, str, i7);
    }

    public static final void e(long j7, String str, int i7) {
        k.f(str, "sectionName");
        AbstractC1642a.d(str, i7);
    }

    public static final void f(long j7, String str, int i7, long j8) {
        k.f(str, "sectionName");
        e(j7, str, i7);
    }

    public static final void g(long j7) {
        AbstractC1642a.f();
    }

    public static final boolean h(long j7) {
        return false;
    }

    public static final void j(long j7, String str, int i7) {
        k.f(str, "sectionName");
        a(j7, str, i7);
    }

    public static final void k(long j7, String str, int i7) {
        k.f(str, "counterName");
        AbstractC1642a.j(str, i7);
    }

    public static final void i(TraceListener traceListener) {
    }

    public static final void m(TraceListener traceListener) {
    }

    public static final void l(long j7, String str, EnumC0053a enumC0053a) {
    }
}
