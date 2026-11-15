package com.th3rdwave.safeareacontext;

import kotlin.enums.EnumEntries;
import p5.AbstractC1978a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class o {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final o f18619m = new o("PADDING", 0);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final o f18620n = new o("MARGIN", 1);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final /* synthetic */ o[] f18621o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f18622p;

    static {
        o[] oVarArrE = e();
        f18621o = oVarArrE;
        f18622p = AbstractC1978a.a(oVarArrE);
    }

    private o(String str, int i7) {
    }

    private static final /* synthetic */ o[] e() {
        return new o[]{f18619m, f18620n};
    }

    public static o valueOf(String str) {
        return (o) Enum.valueOf(o.class, str);
    }

    public static o[] values() {
        return (o[]) f18621o.clone();
    }
}
