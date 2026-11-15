package androidx.core.view;

import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes.dex */
public class B {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f7264a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f7265b;

    public B(ViewGroup viewGroup) {
    }

    public int a() {
        return this.f7264a | this.f7265b;
    }

    public void b(View view, View view2, int i7) {
        c(view, view2, i7, 0);
    }

    public void c(View view, View view2, int i7, int i8) {
        if (i8 == 1) {
            this.f7265b = i7;
        } else {
            this.f7264a = i7;
        }
    }

    public void d(View view) {
        e(view, 0);
    }

    public void e(View view, int i7) {
        if (i7 == 1) {
            this.f7265b = 0;
        } else {
            this.f7264a = 0;
        }
    }
}
