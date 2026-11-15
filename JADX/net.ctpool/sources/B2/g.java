package B2;

import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p5.AbstractC1978a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final a f716m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final g f717n = new g("CREATE", 0);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final g f718o = new g("UPDATE", 1);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final g f719p = new g("DELETE", 2);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final /* synthetic */ g[] f720q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f721r;

    public static final class a {

        /* JADX INFO: renamed from: B2.g$a$a, reason: collision with other inner class name */
        public /* synthetic */ class C0005a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f722a;

            static {
                int[] iArr = new int[g.values().length];
                try {
                    iArr[g.f717n.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[g.f718o.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[g.f719p.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                f722a = iArr;
            }
        }

        private a() {
        }

        public final String a(g gVar) {
            w5.k.f(gVar, "type");
            int i7 = C0005a.f722a[gVar.ordinal()];
            if (i7 == 1) {
                return "create";
            }
            if (i7 == 2) {
                return "update";
            }
            if (i7 == 3) {
                return "delete";
            }
            throw new i5.k();
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        g[] gVarArrE = e();
        f720q = gVarArrE;
        f721r = AbstractC1978a.a(gVarArrE);
        f716m = new a(null);
    }

    private g(String str, int i7) {
    }

    private static final /* synthetic */ g[] e() {
        return new g[]{f717n, f718o, f719p};
    }

    public static final String h(g gVar) {
        return f716m.a(gVar);
    }

    public static g valueOf(String str) {
        return (g) Enum.valueOf(g.class, str);
    }

    public static g[] values() {
        return (g[]) f720q.clone();
    }
}
