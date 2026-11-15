package com.google.android.material.appbar;

import android.view.View;
import androidx.core.view.H;

/* JADX INFO: loaded from: classes.dex */
class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final View f16492a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f16493b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f16494c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f16495d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f16496e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f16497f = true;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f16498g = true;

    public e(View view) {
        this.f16492a = view;
    }

    void a() {
        View view = this.f16492a;
        H.a0(view, this.f16495d - (view.getTop() - this.f16493b));
        View view2 = this.f16492a;
        H.Z(view2, this.f16496e - (view2.getLeft() - this.f16494c));
    }

    public int b() {
        return this.f16495d;
    }

    void c() {
        this.f16493b = this.f16492a.getTop();
        this.f16494c = this.f16492a.getLeft();
    }

    public boolean d(int i7) {
        if (!this.f16498g || this.f16496e == i7) {
            return false;
        }
        this.f16496e = i7;
        a();
        return true;
    }

    public boolean e(int i7) {
        if (!this.f16497f || this.f16495d == i7) {
            return false;
        }
        this.f16495d = i7;
        a();
        return true;
    }
}
