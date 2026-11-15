package com.facebook.react.uimanager;

import java.util.Locale;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p5.AbstractC1978a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class H {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final a f12289m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final H f12290n = new H("NONE", 0);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final H f12291o = new H("BOX_NONE", 1);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final H f12292p = new H("BOX_ONLY", 2);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final H f12293q = new H("AUTO", 3);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final /* synthetic */ H[] f12294r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f12295s;

    public static final class a {
        private a() {
        }

        public final boolean a(H h7) {
            w5.k.f(h7, "pointerEvents");
            return h7 == H.f12293q || h7 == H.f12292p;
        }

        public final boolean b(H h7) {
            w5.k.f(h7, "pointerEvents");
            return h7 == H.f12293q || h7 == H.f12291o;
        }

        public final H c(String str) {
            if (str == null) {
                return H.f12293q;
            }
            Locale locale = Locale.US;
            w5.k.e(locale, "US");
            String upperCase = str.toUpperCase(locale);
            w5.k.e(upperCase, "toUpperCase(...)");
            return H.valueOf(F5.g.x(upperCase, "-", "_", false, 4, null));
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        H[] hArrE = e();
        f12294r = hArrE;
        f12295s = AbstractC1978a.a(hArrE);
        f12289m = new a(null);
    }

    private H(String str, int i7) {
    }

    private static final /* synthetic */ H[] e() {
        return new H[]{f12290n, f12291o, f12292p, f12293q};
    }

    public static final boolean h(H h7) {
        return f12289m.a(h7);
    }

    public static final boolean j(H h7) {
        return f12289m.b(h7);
    }

    public static final H k(String str) {
        return f12289m.c(str);
    }

    public static H valueOf(String str) {
        return (H) Enum.valueOf(H.class, str);
    }

    public static H[] values() {
        return (H[]) f12294r.clone();
    }
}
