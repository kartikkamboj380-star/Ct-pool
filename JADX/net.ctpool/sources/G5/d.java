package G5;

import java.util.concurrent.TimeUnit;
import kotlin.enums.EnumEntries;
import p5.AbstractC1978a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class d {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final d f1275n = new d("NANOSECONDS", 0, TimeUnit.NANOSECONDS);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final d f1276o = new d("MICROSECONDS", 1, TimeUnit.MICROSECONDS);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final d f1277p = new d("MILLISECONDS", 2, TimeUnit.MILLISECONDS);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final d f1278q = new d("SECONDS", 3, TimeUnit.SECONDS);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final d f1279r = new d("MINUTES", 4, TimeUnit.MINUTES);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final d f1280s = new d("HOURS", 5, TimeUnit.HOURS);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final d f1281t = new d("DAYS", 6, TimeUnit.DAYS);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final /* synthetic */ d[] f1282u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f1283v;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final TimeUnit f1284m;

    static {
        d[] dVarArrE = e();
        f1282u = dVarArrE;
        f1283v = AbstractC1978a.a(dVarArrE);
    }

    private d(String str, int i7, TimeUnit timeUnit) {
        this.f1284m = timeUnit;
    }

    private static final /* synthetic */ d[] e() {
        return new d[]{f1275n, f1276o, f1277p, f1278q, f1279r, f1280s, f1281t};
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) f1282u.clone();
    }

    public final TimeUnit h() {
        return this.f1284m;
    }
}
