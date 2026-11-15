package androidx.recyclerview.widget;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.core.view.C0574a;
import androidx.core.view.H;
import androidx.core.view.accessibility.C;
import androidx.core.view.accessibility.D;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public class l extends C0574a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final RecyclerView f8867d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final a f8868e;

    public static class a extends C0574a {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final l f8869d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private Map f8870e = new WeakHashMap();

        public a(l lVar) {
            this.f8869d = lVar;
        }

        @Override // androidx.core.view.C0574a
        public boolean a(View view, AccessibilityEvent accessibilityEvent) {
            C0574a c0574a = (C0574a) this.f8870e.get(view);
            return c0574a != null ? c0574a.a(view, accessibilityEvent) : super.a(view, accessibilityEvent);
        }

        @Override // androidx.core.view.C0574a
        public D b(View view) {
            C0574a c0574a = (C0574a) this.f8870e.get(view);
            return c0574a != null ? c0574a.b(view) : super.b(view);
        }

        @Override // androidx.core.view.C0574a
        public void f(View view, AccessibilityEvent accessibilityEvent) {
            C0574a c0574a = (C0574a) this.f8870e.get(view);
            if (c0574a != null) {
                c0574a.f(view, accessibilityEvent);
            } else {
                super.f(view, accessibilityEvent);
            }
        }

        @Override // androidx.core.view.C0574a
        public void g(View view, C c7) {
            if (!this.f8869d.o() && this.f8869d.f8867d.getLayoutManager() != null) {
                this.f8869d.f8867d.getLayoutManager().O0(view, c7);
                C0574a c0574a = (C0574a) this.f8870e.get(view);
                if (c0574a != null) {
                    c0574a.g(view, c7);
                    return;
                }
            }
            super.g(view, c7);
        }

        @Override // androidx.core.view.C0574a
        public void h(View view, AccessibilityEvent accessibilityEvent) {
            C0574a c0574a = (C0574a) this.f8870e.get(view);
            if (c0574a != null) {
                c0574a.h(view, accessibilityEvent);
            } else {
                super.h(view, accessibilityEvent);
            }
        }

        @Override // androidx.core.view.C0574a
        public boolean i(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            C0574a c0574a = (C0574a) this.f8870e.get(viewGroup);
            return c0574a != null ? c0574a.i(viewGroup, view, accessibilityEvent) : super.i(viewGroup, view, accessibilityEvent);
        }

        @Override // androidx.core.view.C0574a
        public boolean j(View view, int i7, Bundle bundle) {
            if (this.f8869d.o() || this.f8869d.f8867d.getLayoutManager() == null) {
                return super.j(view, i7, bundle);
            }
            C0574a c0574a = (C0574a) this.f8870e.get(view);
            if (c0574a != null) {
                if (c0574a.j(view, i7, bundle)) {
                    return true;
                }
            } else if (super.j(view, i7, bundle)) {
                return true;
            }
            return this.f8869d.f8867d.getLayoutManager().i1(view, i7, bundle);
        }

        @Override // androidx.core.view.C0574a
        public void l(View view, int i7) {
            C0574a c0574a = (C0574a) this.f8870e.get(view);
            if (c0574a != null) {
                c0574a.l(view, i7);
            } else {
                super.l(view, i7);
            }
        }

        @Override // androidx.core.view.C0574a
        public void m(View view, AccessibilityEvent accessibilityEvent) {
            C0574a c0574a = (C0574a) this.f8870e.get(view);
            if (c0574a != null) {
                c0574a.m(view, accessibilityEvent);
            } else {
                super.m(view, accessibilityEvent);
            }
        }

        C0574a n(View view) {
            return (C0574a) this.f8870e.remove(view);
        }

        void o(View view) {
            C0574a c0574aL = H.l(view);
            if (c0574aL == null || c0574aL == this) {
                return;
            }
            this.f8870e.put(view, c0574aL);
        }
    }

    public l(RecyclerView recyclerView) {
        this.f8867d = recyclerView;
        C0574a c0574aN = n();
        this.f8868e = (c0574aN == null || !(c0574aN instanceof a)) ? new a(this) : (a) c0574aN;
    }

    @Override // androidx.core.view.C0574a
    public void f(View view, AccessibilityEvent accessibilityEvent) {
        super.f(view, accessibilityEvent);
        if (!(view instanceof RecyclerView) || o()) {
            return;
        }
        RecyclerView recyclerView = (RecyclerView) view;
        if (recyclerView.getLayoutManager() != null) {
            recyclerView.getLayoutManager().K0(accessibilityEvent);
        }
    }

    @Override // androidx.core.view.C0574a
    public void g(View view, C c7) {
        super.g(view, c7);
        if (o() || this.f8867d.getLayoutManager() == null) {
            return;
        }
        this.f8867d.getLayoutManager().M0(c7);
    }

    @Override // androidx.core.view.C0574a
    public boolean j(View view, int i7, Bundle bundle) {
        if (super.j(view, i7, bundle)) {
            return true;
        }
        if (o() || this.f8867d.getLayoutManager() == null) {
            return false;
        }
        return this.f8867d.getLayoutManager().g1(i7, bundle);
    }

    public C0574a n() {
        return this.f8868e;
    }

    boolean o() {
        return this.f8867d.l0();
    }
}
