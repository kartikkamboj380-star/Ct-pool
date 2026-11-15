package androidx.appcompat.view;

import android.view.View;
import android.view.animation.Interpolator;
import androidx.core.view.O;
import androidx.core.view.P;
import androidx.core.view.Q;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class h {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Interpolator f5306c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    P f5307d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f5308e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f5305b = -1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Q f5309f = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final ArrayList f5304a = new ArrayList();

    class a extends Q {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f5310a = false;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f5311b = 0;

        a() {
        }

        @Override // androidx.core.view.P
        public void b(View view) {
            int i7 = this.f5311b + 1;
            this.f5311b = i7;
            if (i7 == h.this.f5304a.size()) {
                P p6 = h.this.f5307d;
                if (p6 != null) {
                    p6.b(null);
                }
                d();
            }
        }

        @Override // androidx.core.view.Q, androidx.core.view.P
        public void c(View view) {
            if (this.f5310a) {
                return;
            }
            this.f5310a = true;
            P p6 = h.this.f5307d;
            if (p6 != null) {
                p6.c(null);
            }
        }

        void d() {
            this.f5311b = 0;
            this.f5310a = false;
            h.this.b();
        }
    }

    public void a() {
        if (this.f5308e) {
            Iterator it = this.f5304a.iterator();
            while (it.hasNext()) {
                ((O) it.next()).c();
            }
            this.f5308e = false;
        }
    }

    void b() {
        this.f5308e = false;
    }

    public h c(O o6) {
        if (!this.f5308e) {
            this.f5304a.add(o6);
        }
        return this;
    }

    public h d(O o6, O o7) {
        this.f5304a.add(o6);
        o7.j(o6.d());
        this.f5304a.add(o7);
        return this;
    }

    public h e(long j7) {
        if (!this.f5308e) {
            this.f5305b = j7;
        }
        return this;
    }

    public h f(Interpolator interpolator) {
        if (!this.f5308e) {
            this.f5306c = interpolator;
        }
        return this;
    }

    public h g(P p6) {
        if (!this.f5308e) {
            this.f5307d = p6;
        }
        return this;
    }

    public void h() {
        if (this.f5308e) {
            return;
        }
        for (O o6 : this.f5304a) {
            long j7 = this.f5305b;
            if (j7 >= 0) {
                o6.f(j7);
            }
            Interpolator interpolator = this.f5306c;
            if (interpolator != null) {
                o6.g(interpolator);
            }
            if (this.f5307d != null) {
                o6.h(this.f5309f);
            }
            o6.l();
        }
        this.f5308e = true;
    }
}
