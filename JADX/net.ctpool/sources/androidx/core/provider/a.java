package androidx.core.provider;

import android.graphics.Typeface;
import android.os.Handler;
import androidx.core.provider.f;
import androidx.core.provider.g;

/* JADX INFO: loaded from: classes.dex */
class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final g.c f7173a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Handler f7174b;

    /* JADX INFO: renamed from: androidx.core.provider.a$a, reason: collision with other inner class name */
    class RunnableC0141a implements Runnable {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        final /* synthetic */ g.c f7175m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ Typeface f7176n;

        RunnableC0141a(g.c cVar, Typeface typeface) {
            this.f7175m = cVar;
            this.f7176n = typeface;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f7175m.b(this.f7176n);
        }
    }

    class b implements Runnable {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        final /* synthetic */ g.c f7178m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ int f7179n;

        b(g.c cVar, int i7) {
            this.f7178m = cVar;
            this.f7179n = i7;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f7178m.a(this.f7179n);
        }
    }

    a(g.c cVar, Handler handler) {
        this.f7173a = cVar;
        this.f7174b = handler;
    }

    private void a(int i7) {
        this.f7174b.post(new b(this.f7173a, i7));
    }

    private void c(Typeface typeface) {
        this.f7174b.post(new RunnableC0141a(this.f7173a, typeface));
    }

    void b(f.e eVar) {
        if (eVar.a()) {
            c(eVar.f7202a);
        } else {
            a(eVar.f7203b);
        }
    }
}
