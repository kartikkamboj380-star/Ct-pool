package B2;

import java.util.Locale;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p5.AbstractC1978a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final a f695m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final d f696n = new d("LINEAR", 0);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final d f697o = new d("EASE_IN", 1);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final d f698p = new d("EASE_OUT", 2);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final d f699q = new d("EASE_IN_EASE_OUT", 3);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final d f700r = new d("SPRING", 4);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final /* synthetic */ d[] f701s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f702t;

    public static final class a {
        private a() {
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        public final d a(String str) {
            w5.k.f(str, "name");
            String lowerCase = str.toLowerCase(Locale.ROOT);
            w5.k.e(lowerCase, "toLowerCase(...)");
            switch (lowerCase.hashCode()) {
                case -1965056864:
                    if (lowerCase.equals("easeout")) {
                        return d.f698p;
                    }
                    break;
                case -1310315117:
                    if (lowerCase.equals("easein")) {
                        return d.f697o;
                    }
                    break;
                case -1102672091:
                    if (lowerCase.equals("linear")) {
                        return d.f696n;
                    }
                    break;
                case -895679987:
                    if (lowerCase.equals("spring")) {
                        return d.f700r;
                    }
                    break;
                case 1164546989:
                    if (lowerCase.equals("easeineaseout")) {
                        return d.f699q;
                    }
                    break;
            }
            throw new IllegalArgumentException("Unsupported interpolation type : " + str);
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        d[] dVarArrE = e();
        f701s = dVarArrE;
        f702t = AbstractC1978a.a(dVarArrE);
        f695m = new a(null);
    }

    private d(String str, int i7) {
    }

    private static final /* synthetic */ d[] e() {
        return new d[]{f696n, f697o, f698p, f699q, f700r};
    }

    public static final d h(String str) {
        return f695m.a(str);
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) f701s.clone();
    }
}
