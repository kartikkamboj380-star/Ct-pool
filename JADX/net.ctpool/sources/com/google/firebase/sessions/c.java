package com.google.firebase.sessions;

import F5.g;
import N4.I;
import N4.y;
import Y3.m;
import java.util.Locale;
import java.util.UUID;
import kotlin.jvm.internal.DefaultConstructorMarker;
import v5.InterfaceC2171a;
import w5.i;
import w5.k;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final b f17735f = new b(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final I f17736a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC2171a f17737b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f17738c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f17739d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private y f17740e;

    /* synthetic */ class a extends i implements InterfaceC2171a {

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public static final a f17741v = new a();

        a() {
            super(0, UUID.class, "randomUUID", "randomUUID()Ljava/util/UUID;", 0);
        }

        @Override // v5.InterfaceC2171a
        /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
        public final UUID invoke() {
            return UUID.randomUUID();
        }
    }

    public static final class b {
        private b() {
        }

        public final c a() {
            Object objK = m.a(Y3.c.f4433a).k(c.class);
            k.e(objK, "Firebase.app[SessionGenerator::class.java]");
            return (c) objK;
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public c(I i7, InterfaceC2171a interfaceC2171a) {
        k.f(i7, "timeProvider");
        k.f(interfaceC2171a, "uuidGenerator");
        this.f17736a = i7;
        this.f17737b = interfaceC2171a;
        this.f17738c = b();
        this.f17739d = -1;
    }

    private final String b() {
        String string = ((UUID) this.f17737b.invoke()).toString();
        k.e(string, "uuidGenerator().toString()");
        String lowerCase = g.x(string, "-", "", false, 4, null).toLowerCase(Locale.ROOT);
        k.e(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        return lowerCase;
    }

    public final y a() {
        int i7 = this.f17739d + 1;
        this.f17739d = i7;
        this.f17740e = new y(i7 == 0 ? this.f17738c : b(), this.f17738c, this.f17739d, this.f17736a.a());
        return c();
    }

    public final y c() {
        y yVar = this.f17740e;
        if (yVar != null) {
            return yVar;
        }
        k.t("currentSession");
        return null;
    }

    public /* synthetic */ c(I i7, InterfaceC2171a interfaceC2171a, int i8, DefaultConstructorMarker defaultConstructorMarker) {
        this(i7, (i8 & 2) != 0 ? a.f17741v : interfaceC2171a);
    }
}
