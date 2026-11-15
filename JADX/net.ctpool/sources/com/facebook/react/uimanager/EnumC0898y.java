package com.facebook.react.uimanager;

import kotlin.enums.EnumEntries;
import p5.AbstractC1978a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: com.facebook.react.uimanager.y, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC0898y {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final EnumC0898y f12740m = new EnumC0898y("POINT", 0);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final EnumC0898y f12741n = new EnumC0898y("PERCENT", 1);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final /* synthetic */ EnumC0898y[] f12742o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f12743p;

    static {
        EnumC0898y[] enumC0898yArrE = e();
        f12742o = enumC0898yArrE;
        f12743p = AbstractC1978a.a(enumC0898yArrE);
    }

    private EnumC0898y(String str, int i7) {
    }

    private static final /* synthetic */ EnumC0898y[] e() {
        return new EnumC0898y[]{f12740m, f12741n};
    }

    public static EnumC0898y valueOf(String str) {
        return (EnumC0898y) Enum.valueOf(EnumC0898y.class, str);
    }

    public static EnumC0898y[] values() {
        return (EnumC0898y[]) f12742o.clone();
    }
}
