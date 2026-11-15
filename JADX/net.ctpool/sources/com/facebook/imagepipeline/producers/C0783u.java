package com.facebook.imagepipeline.producers;

import J1.b;
import java.util.Map;

/* JADX INFO: renamed from: com.facebook.imagepipeline.producers.u, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0783u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C0783u f11010a = new C0783u();

    /* JADX INFO: renamed from: com.facebook.imagepipeline.producers.u$a */
    public static final class a extends Exception {
        public a(String str) {
            super(str);
        }
    }

    private C0783u() {
    }

    public static final w1.j a(J1.b bVar, w1.j jVar, w1.j jVar2, Map map) {
        String strF;
        w5.k.f(bVar, "imageRequest");
        if (bVar.c() == b.EnumC0030b.SMALL) {
            return jVar;
        }
        if (bVar.c() == b.EnumC0030b.DEFAULT) {
            return jVar2;
        }
        if (bVar.c() != b.EnumC0030b.DYNAMIC || map == null || (strF = bVar.f()) == null) {
            return null;
        }
        return (w1.j) map.get(strF);
    }
}
