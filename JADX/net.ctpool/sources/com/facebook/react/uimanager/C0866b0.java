package com.facebook.react.uimanager;

import android.util.SparseArray;
import android.util.SparseBooleanArray;

/* JADX INFO: renamed from: com.facebook.react.uimanager.b0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
class C0866b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final SparseArray f12484a = new SparseArray();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final SparseBooleanArray f12485b = new SparseBooleanArray();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final S1.h f12486c = new S1.h();

    public void a(U u6) {
        this.f12486c.a();
        this.f12484a.put(u6.r(), u6);
    }

    public void b(U u6) {
        this.f12486c.a();
        int iR = u6.r();
        this.f12484a.put(iR, u6);
        this.f12485b.put(iR, true);
    }

    public U c(int i7) {
        this.f12486c.a();
        return (U) this.f12484a.get(i7);
    }

    public int d() {
        this.f12486c.a();
        return this.f12485b.size();
    }

    public int e(int i7) {
        this.f12486c.a();
        return this.f12485b.keyAt(i7);
    }

    public boolean f(int i7) {
        this.f12486c.a();
        return this.f12485b.get(i7);
    }

    public void g(int i7) {
        this.f12486c.a();
        if (!this.f12485b.get(i7)) {
            this.f12484a.remove(i7);
            return;
        }
        throw new C0892s("Trying to remove root node " + i7 + " without using removeRootNode!");
    }

    public void h(int i7) {
        this.f12486c.a();
        if (i7 == -1) {
            return;
        }
        if (this.f12485b.get(i7)) {
            this.f12484a.remove(i7);
            this.f12485b.delete(i7);
        } else {
            throw new C0892s("View with tag " + i7 + " is not registered as a root view");
        }
    }
}
