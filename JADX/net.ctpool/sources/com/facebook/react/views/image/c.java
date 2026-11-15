package com.facebook.react.views.image;

import kotlin.enums.EnumEntries;
import p5.AbstractC1978a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final c f12775m = new c("AUTO", 0);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final c f12776n = new c("RESIZE", 1);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final c f12777o = new c("SCALE", 2);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final /* synthetic */ c[] f12778p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f12779q;

    static {
        c[] cVarArrE = e();
        f12778p = cVarArrE;
        f12779q = AbstractC1978a.a(cVarArrE);
    }

    private c(String str, int i7) {
    }

    private static final /* synthetic */ c[] e() {
        return new c[]{f12775m, f12776n, f12777o};
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) f12778p.clone();
    }
}
