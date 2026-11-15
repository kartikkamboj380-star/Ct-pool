package androidx.activity;

import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.lifecycle.AbstractC0651h;
import androidx.lifecycle.InterfaceC0653j;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class OnBackPressedDispatcher {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Runnable f4869a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private androidx.core.util.a f4871c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private OnBackInvokedCallback f4872d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private OnBackInvokedDispatcher f4873e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final ArrayDeque f4870b = new ArrayDeque();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f4874f = false;

    private class LifecycleOnBackPressedCancellable implements InterfaceC0653j, androidx.activity.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final AbstractC0651h f4875a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final h f4876b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private androidx.activity.a f4877c;

        LifecycleOnBackPressedCancellable(AbstractC0651h abstractC0651h, h hVar) {
            this.f4875a = abstractC0651h;
            this.f4876b = hVar;
            abstractC0651h.a(this);
        }

        @Override // androidx.activity.a
        public void cancel() {
            this.f4875a.c(this);
            this.f4876b.e(this);
            androidx.activity.a aVar = this.f4877c;
            if (aVar != null) {
                aVar.cancel();
                this.f4877c = null;
            }
        }

        @Override // androidx.lifecycle.InterfaceC0653j
        public void g(androidx.lifecycle.l lVar, AbstractC0651h.b bVar) {
            if (bVar == AbstractC0651h.b.ON_START) {
                this.f4877c = OnBackPressedDispatcher.this.c(this.f4876b);
                return;
            }
            if (bVar != AbstractC0651h.b.ON_STOP) {
                if (bVar == AbstractC0651h.b.ON_DESTROY) {
                    cancel();
                }
            } else {
                androidx.activity.a aVar = this.f4877c;
                if (aVar != null) {
                    aVar.cancel();
                }
            }
        }
    }

    static class a {
        static OnBackInvokedCallback a(Runnable runnable) {
            Objects.requireNonNull(runnable);
            return new k(runnable);
        }

        static void b(Object obj, int i7, Object obj2) {
            ((OnBackInvokedDispatcher) obj).registerOnBackInvokedCallback(i7, (OnBackInvokedCallback) obj2);
        }

        static void c(Object obj, Object obj2) {
            ((OnBackInvokedDispatcher) obj).unregisterOnBackInvokedCallback((OnBackInvokedCallback) obj2);
        }
    }

    private class b implements androidx.activity.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final h f4879a;

        b(h hVar) {
            this.f4879a = hVar;
        }

        @Override // androidx.activity.a
        public void cancel() {
            OnBackPressedDispatcher.this.f4870b.remove(this.f4879a);
            this.f4879a.e(this);
            if (androidx.core.os.a.c()) {
                this.f4879a.g(null);
                OnBackPressedDispatcher.this.h();
            }
        }
    }

    public OnBackPressedDispatcher(Runnable runnable) {
        this.f4869a = runnable;
        if (androidx.core.os.a.c()) {
            this.f4871c = new androidx.core.util.a() { // from class: androidx.activity.i
                @Override // androidx.core.util.a
                public final void a(Object obj) {
                    this.f4890a.e((Boolean) obj);
                }
            };
            this.f4872d = a.a(new Runnable() { // from class: androidx.activity.j
                @Override // java.lang.Runnable
                public final void run() {
                    this.f4891m.f();
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e(Boolean bool) {
        if (androidx.core.os.a.c()) {
            h();
        }
    }

    public void b(androidx.lifecycle.l lVar, h hVar) {
        AbstractC0651h lifecycle = lVar.getLifecycle();
        if (lifecycle.b() == AbstractC0651h.c.DESTROYED) {
            return;
        }
        hVar.a(new LifecycleOnBackPressedCancellable(lifecycle, hVar));
        if (androidx.core.os.a.c()) {
            h();
            hVar.g(this.f4871c);
        }
    }

    androidx.activity.a c(h hVar) {
        this.f4870b.add(hVar);
        b bVar = new b(hVar);
        hVar.a(bVar);
        if (androidx.core.os.a.c()) {
            h();
            hVar.g(this.f4871c);
        }
        return bVar;
    }

    public boolean d() {
        Iterator itDescendingIterator = this.f4870b.descendingIterator();
        while (itDescendingIterator.hasNext()) {
            if (((h) itDescendingIterator.next()).c()) {
                return true;
            }
        }
        return false;
    }

    public void f() {
        Iterator itDescendingIterator = this.f4870b.descendingIterator();
        while (itDescendingIterator.hasNext()) {
            h hVar = (h) itDescendingIterator.next();
            if (hVar.c()) {
                hVar.b();
                return;
            }
        }
        Runnable runnable = this.f4869a;
        if (runnable != null) {
            runnable.run();
        }
    }

    public void g(OnBackInvokedDispatcher onBackInvokedDispatcher) {
        this.f4873e = onBackInvokedDispatcher;
        h();
    }

    void h() {
        boolean zD = d();
        OnBackInvokedDispatcher onBackInvokedDispatcher = this.f4873e;
        if (onBackInvokedDispatcher != null) {
            if (zD && !this.f4874f) {
                a.b(onBackInvokedDispatcher, 0, this.f4872d);
                this.f4874f = true;
            } else {
                if (zD || !this.f4874f) {
                    return;
                }
                a.c(onBackInvokedDispatcher, this.f4872d);
                this.f4874f = false;
            }
        }
    }
}
