package B2;

import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p5.AbstractC1978a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final a f687m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final b f688n = new b("OPACITY", 0);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final b f689o = new b("SCALE_X", 1);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final b f690p = new b("SCALE_Y", 2);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final b f691q = new b("SCALE_XY", 3);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final /* synthetic */ b[] f692r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f693s;

    public static final class a {
        private a() {
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        public final b a(String str) {
            w5.k.f(str, "name");
            switch (str.hashCode()) {
                case -1267206133:
                    if (str.equals("opacity")) {
                        return b.f688n;
                    }
                    break;
                case -908189618:
                    if (str.equals("scaleX")) {
                        return b.f689o;
                    }
                    break;
                case -908189617:
                    if (str.equals("scaleY")) {
                        return b.f690p;
                    }
                    break;
                case 1910893003:
                    if (str.equals("scaleXY")) {
                        return b.f691q;
                    }
                    break;
            }
            throw new IllegalArgumentException("Unsupported animated property: " + str);
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        b[] bVarArrE = e();
        f692r = bVarArrE;
        f693s = AbstractC1978a.a(bVarArrE);
        f687m = new a(null);
    }

    private b(String str, int i7) {
    }

    private static final /* synthetic */ b[] e() {
        return new b[]{f688n, f689o, f690p, f691q};
    }

    public static final b h(String str) {
        return f687m.a(str);
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) f692r.clone();
    }
}
