package com.facebook.imagepipeline.producers;

/* JADX INFO: renamed from: com.facebook.imagepipeline.producers.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0766c implements InterfaceC0777n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f10875a = false;

    public static boolean e(int i7) {
        return (i7 & 1) == 1;
    }

    public static boolean f(int i7) {
        return !e(i7);
    }

    public static int l(boolean z6) {
        return z6 ? 1 : 0;
    }

    public static boolean m(int i7, int i8) {
        return (i7 & i8) != 0;
    }

    public static boolean n(int i7, int i8) {
        return (i7 & i8) == i8;
    }

    public static int o(int i7, int i8) {
        return i7 & (~i8);
    }

    @Override // com.facebook.imagepipeline.producers.InterfaceC0777n
    public synchronized void a(Throwable th) {
        if (this.f10875a) {
            return;
        }
        this.f10875a = true;
        try {
            h(th);
        } catch (Exception e7) {
            k(e7);
        }
    }

    @Override // com.facebook.imagepipeline.producers.InterfaceC0777n
    public synchronized void b() {
        if (this.f10875a) {
            return;
        }
        this.f10875a = true;
        try {
            g();
        } catch (Exception e7) {
            k(e7);
        }
    }

    @Override // com.facebook.imagepipeline.producers.InterfaceC0777n
    public synchronized void c(float f7) {
        if (this.f10875a) {
            return;
        }
        try {
            j(f7);
        } catch (Exception e7) {
            k(e7);
        }
    }

    @Override // com.facebook.imagepipeline.producers.InterfaceC0777n
    public synchronized void d(Object obj, int i7) {
        if (this.f10875a) {
            return;
        }
        this.f10875a = e(i7);
        try {
            i(obj, i7);
        } catch (Exception e7) {
            k(e7);
        }
    }

    protected abstract void g();

    protected abstract void h(Throwable th);

    protected abstract void i(Object obj, int i7);

    protected abstract void j(float f7);

    protected void k(Exception exc) {
        P0.a.K(getClass(), "unhandled exception", exc);
    }
}
