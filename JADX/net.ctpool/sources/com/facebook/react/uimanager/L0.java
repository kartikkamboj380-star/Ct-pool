package com.facebook.react.uimanager;

import kotlin.Lazy;
import v5.InterfaceC2171a;

/* JADX INFO: loaded from: classes.dex */
public final class L0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final L0 f12442a = new L0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Lazy f12443b = i5.g.a(i5.j.f19966m, a.f12444m);

    static final class a extends w5.l implements InterfaceC2171a {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public static final a f12444m = new a();

        a() {
            super(0);
        }

        @Override // v5.InterfaceC2171a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final S1.b invoke() {
            return new S1.b(1024);
        }
    }

    private L0() {
    }

    public static final S1.b a() {
        return f12442a.b();
    }

    private final S1.b b() {
        return (S1.b) f12443b.getValue();
    }
}
