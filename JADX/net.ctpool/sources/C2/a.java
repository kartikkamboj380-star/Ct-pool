package C2;

import kotlin.enums.EnumEntries;
import p5.AbstractC1978a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f914A;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final a f915m = new a("BORDER_RADIUS", 0);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final a f916n = new a("BORDER_TOP_LEFT_RADIUS", 1);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final a f917o = new a("BORDER_TOP_RIGHT_RADIUS", 2);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final a f918p = new a("BORDER_BOTTOM_RIGHT_RADIUS", 3);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final a f919q = new a("BORDER_BOTTOM_LEFT_RADIUS", 4);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final a f920r = new a("BORDER_TOP_START_RADIUS", 5);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final a f921s = new a("BORDER_TOP_END_RADIUS", 6);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final a f922t = new a("BORDER_BOTTOM_START_RADIUS", 7);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final a f923u = new a("BORDER_BOTTOM_END_RADIUS", 8);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final a f924v = new a("BORDER_END_END_RADIUS", 9);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final a f925w = new a("BORDER_END_START_RADIUS", 10);

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final a f926x = new a("BORDER_START_END_RADIUS", 11);

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final a f927y = new a("BORDER_START_START_RADIUS", 12);

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static final /* synthetic */ a[] f928z;

    static {
        a[] aVarArrE = e();
        f928z = aVarArrE;
        f914A = AbstractC1978a.a(aVarArrE);
    }

    private a(String str, int i7) {
    }

    private static final /* synthetic */ a[] e() {
        return new a[]{f915m, f916n, f917o, f918p, f919q, f920r, f921s, f922t, f923u, f924v, f925w, f926x, f927y};
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f928z.clone();
    }
}
