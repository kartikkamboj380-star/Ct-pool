package com.facebook.react.uimanager;

import kotlin.Lazy;
import v5.InterfaceC2171a;

/* JADX INFO: loaded from: classes.dex */
public final class X {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final X f12480a = new X();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Lazy f12481b = i5.g.a(i5.j.f19968o, a.f12482m);

    static final class a extends w5.l implements InterfaceC2171a {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public static final a f12482m = new a();

        a() {
            super(0);
        }

        @Override // v5.InterfaceC2171a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final com.facebook.yoga.c invoke() {
            com.facebook.yoga.c cVarA = com.facebook.yoga.d.a();
            cVarA.b(0.0f);
            cVarA.a(com.facebook.yoga.k.ALL);
            return cVarA;
        }
    }

    private X() {
    }

    public static final com.facebook.yoga.c a() {
        return f12480a.b();
    }

    private final com.facebook.yoga.c b() {
        Object value = f12481b.getValue();
        w5.k.e(value, "getValue(...)");
        return (com.facebook.yoga.c) value;
    }
}
