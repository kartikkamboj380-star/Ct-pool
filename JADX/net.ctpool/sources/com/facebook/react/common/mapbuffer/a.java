package com.facebook.react.common.mapbuffer;

import kotlin.enums.EnumEntries;
import p5.AbstractC1978a;
import x5.InterfaceC2227a;

/* JADX INFO: loaded from: classes.dex */
public interface a extends Iterable, InterfaceC2227a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C0208a f11426c = C0208a.f11427a;

    /* JADX INFO: renamed from: com.facebook.react.common.mapbuffer.a$a, reason: collision with other inner class name */
    public static final class C0208a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ C0208a f11427a = new C0208a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final C5.c f11428b = new C5.c(0, 65535);

        private C0208a() {
        }

        public final C5.c a() {
            return f11428b;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class b {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public static final b f11429m = new b("BOOL", 0);

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final b f11430n = new b("INT", 1);

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public static final b f11431o = new b("DOUBLE", 2);

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public static final b f11432p = new b("STRING", 3);

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public static final b f11433q = new b("MAP", 4);

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public static final b f11434r = new b("LONG", 5);

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private static final /* synthetic */ b[] f11435s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private static final /* synthetic */ EnumEntries f11436t;

        static {
            b[] bVarArrE = e();
            f11435s = bVarArrE;
            f11436t = AbstractC1978a.a(bVarArrE);
        }

        private b(String str, int i7) {
        }

        private static final /* synthetic */ b[] e() {
            return new b[]{f11429m, f11430n, f11431o, f11432p, f11433q, f11434r};
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) f11435s.clone();
        }
    }

    public interface c {
        long a();

        double b();

        String c();

        int d();

        a e();

        boolean f();

        int getKey();

        b getType();
    }

    a D0(int i7);

    boolean getBoolean(int i7);

    int getCount();

    double getDouble(int i7);

    int getInt(int i7);

    String getString(int i7);

    boolean j0(int i7);
}
