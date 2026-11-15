package n5;

import kotlin.enums.EnumEntries;
import p5.AbstractC1978a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: n5.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class EnumC1929a {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final EnumC1929a f21433m = new EnumC1929a("COROUTINE_SUSPENDED", 0);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final EnumC1929a f21434n = new EnumC1929a("UNDECIDED", 1);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final EnumC1929a f21435o = new EnumC1929a("RESUMED", 2);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final /* synthetic */ EnumC1929a[] f21436p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f21437q;

    static {
        EnumC1929a[] enumC1929aArrE = e();
        f21436p = enumC1929aArrE;
        f21437q = AbstractC1978a.a(enumC1929aArrE);
    }

    private EnumC1929a(String str, int i7) {
    }

    private static final /* synthetic */ EnumC1929a[] e() {
        return new EnumC1929a[]{f21433m, f21434n, f21435o};
    }

    public static EnumC1929a valueOf(String str) {
        return (EnumC1929a) Enum.valueOf(EnumC1929a.class, str);
    }

    public static EnumC1929a[] values() {
        return (EnumC1929a[]) f21436p.clone();
    }
}
