package com.th3rdwave.safeareacontext;

import kotlin.enums.EnumEntries;
import p5.AbstractC1978a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class l {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final l f18607m = new l("OFF", 0);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final l f18608n = new l("ADDITIVE", 1);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final l f18609o = new l("MAXIMUM", 2);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final /* synthetic */ l[] f18610p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f18611q;

    static {
        l[] lVarArrE = e();
        f18610p = lVarArrE;
        f18611q = AbstractC1978a.a(lVarArrE);
    }

    private l(String str, int i7) {
    }

    private static final /* synthetic */ l[] e() {
        return new l[]{f18607m, f18608n, f18609o};
    }

    public static l valueOf(String str) {
        return (l) Enum.valueOf(l.class, str);
    }

    public static l[] values() {
        return (l[]) f18610p.clone();
    }
}
