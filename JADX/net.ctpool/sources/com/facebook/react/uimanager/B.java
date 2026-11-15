package com.facebook.react.uimanager;

import kotlin.enums.EnumEntries;
import p5.AbstractC1978a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class B {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final B f12244m = new B("PARENT", 0);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final B f12245n = new B("LEAF", 1);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final B f12246o = new B("NONE", 2);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final /* synthetic */ B[] f12247p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f12248q;

    static {
        B[] bArrE = e();
        f12247p = bArrE;
        f12248q = AbstractC1978a.a(bArrE);
    }

    private B(String str, int i7) {
    }

    private static final /* synthetic */ B[] e() {
        return new B[]{f12244m, f12245n, f12246o};
    }

    public static B valueOf(String str) {
        return (B) Enum.valueOf(B.class, str);
    }

    public static B[] values() {
        return (B[]) f12247p.clone();
    }
}
