package com.facebook.imagepipeline.producers;

import android.graphics.Bitmap;

/* JADX INFO: renamed from: com.facebook.imagepipeline.producers.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0773j implements d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d0 f10901a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f10902b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f10903c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f10904d;

    /* JADX INFO: renamed from: com.facebook.imagepipeline.producers.j$a */
    private static class a extends AbstractC0782t {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f10905c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final int f10906d;

        a(InterfaceC0777n interfaceC0777n, int i7, int i8) {
            super(interfaceC0777n);
            this.f10905c = i7;
            this.f10906d = i8;
        }

        private void q(S0.a aVar) {
            D1.d dVar;
            Bitmap bitmapZ0;
            int rowBytes;
            if (aVar == null || !aVar.z() || (dVar = (D1.d) aVar.j()) == null || dVar.isClosed() || !(dVar instanceof D1.e) || (bitmapZ0 = ((D1.e) dVar).z0()) == null || (rowBytes = bitmapZ0.getRowBytes() * bitmapZ0.getHeight()) < this.f10905c || rowBytes > this.f10906d) {
                return;
            }
            bitmapZ0.prepareToDraw();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.facebook.imagepipeline.producers.AbstractC0766c
        /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
        public void i(S0.a aVar, int i7) {
            q(aVar);
            p().d(aVar, i7);
        }
    }

    public C0773j(d0 d0Var, int i7, int i8, boolean z6) {
        O0.l.b(Boolean.valueOf(i7 <= i8));
        this.f10901a = (d0) O0.l.g(d0Var);
        this.f10902b = i7;
        this.f10903c = i8;
        this.f10904d = z6;
    }

    @Override // com.facebook.imagepipeline.producers.d0
    public void a(InterfaceC0777n interfaceC0777n, e0 e0Var) {
        if (!e0Var.l() || this.f10904d) {
            this.f10901a.a(new a(interfaceC0777n, this.f10902b, this.f10903c), e0Var);
        } else {
            this.f10901a.a(interfaceC0777n, e0Var);
        }
    }
}
