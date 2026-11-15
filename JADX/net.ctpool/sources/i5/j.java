package i5;

import kotlin.enums.EnumEntries;
import p5.AbstractC1978a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final j f19966m = new j("SYNCHRONIZED", 0);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final j f19967n = new j("PUBLICATION", 1);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final j f19968o = new j("NONE", 2);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final /* synthetic */ j[] f19969p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f19970q;

    static {
        j[] jVarArrE = e();
        f19969p = jVarArrE;
        f19970q = AbstractC1978a.a(jVarArrE);
    }

    private j(String str, int i7) {
    }

    private static final /* synthetic */ j[] e() {
        return new j[]{f19966m, f19967n, f19968o};
    }

    public static j valueOf(String str) {
        return (j) Enum.valueOf(j.class, str);
    }

    public static j[] values() {
        return (j[]) f19969p.clone();
    }
}
