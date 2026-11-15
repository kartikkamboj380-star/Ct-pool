package com.facebook.react;

import kotlin.enums.EnumEntries;
import p5.AbstractC1978a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: com.facebook.react.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC0826i {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final EnumC0826i f11780m = new EnumC0826i("JSC", 0);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final EnumC0826i f11781n = new EnumC0826i("HERMES", 1);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final /* synthetic */ EnumC0826i[] f11782o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f11783p;

    static {
        EnumC0826i[] enumC0826iArrE = e();
        f11782o = enumC0826iArrE;
        f11783p = AbstractC1978a.a(enumC0826iArrE);
    }

    private EnumC0826i(String str, int i7) {
    }

    private static final /* synthetic */ EnumC0826i[] e() {
        return new EnumC0826i[]{f11780m, f11781n};
    }

    public static EnumC0826i valueOf(String str) {
        return (EnumC0826i) Enum.valueOf(EnumC0826i.class, str);
    }

    public static EnumC0826i[] values() {
        return (EnumC0826i[]) f11782o.clone();
    }
}
