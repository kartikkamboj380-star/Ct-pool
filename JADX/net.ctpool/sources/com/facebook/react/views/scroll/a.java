package com.facebook.react.views.scroll;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.UIManager;
import com.facebook.react.bridge.UIManagerListener;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.uimanager.AbstractC0884k0;
import com.facebook.react.views.scroll.f;
import java.lang.ref.WeakReference;
import y2.C2239a;

/* JADX INFO: loaded from: classes.dex */
class a implements UIManagerListener {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final ViewGroup f12858m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final boolean f12859n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private b f12860o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private WeakReference f12861p = null;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private Rect f12862q = null;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f12863r = false;

    /* JADX INFO: renamed from: com.facebook.react.views.scroll.a$a, reason: collision with other inner class name */
    class RunnableC0220a implements Runnable {
        RunnableC0220a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            a.this.b();
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f12865a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Integer f12866b;

        b(int i7, Integer num) {
            this.f12865a = i7;
            this.f12866b = num;
        }

        static b a(ReadableMap readableMap) {
            return new b(readableMap.getInt("minIndexForVisible"), readableMap.hasKey("autoscrollToTopThreshold") ? Integer.valueOf(readableMap.getInt("autoscrollToTopThreshold")) : null);
        }
    }

    public a(ViewGroup viewGroup, boolean z6) {
        this.f12858m = viewGroup;
        this.f12859n = z6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        com.facebook.react.views.view.i iVarC;
        float y6;
        int height;
        if (this.f12860o == null || (iVarC = c()) == null) {
            return;
        }
        int scrollX = this.f12859n ? this.f12858m.getScrollX() : this.f12858m.getScrollY();
        for (int i7 = this.f12860o.f12865a; i7 < iVarC.getChildCount(); i7++) {
            View childAt = iVarC.getChildAt(i7);
            if (this.f12859n) {
                y6 = childAt.getX();
                height = childAt.getWidth();
            } else {
                y6 = childAt.getY();
                height = childAt.getHeight();
            }
            if (y6 + height > scrollX || i7 == iVarC.getChildCount() - 1) {
                this.f12861p = new WeakReference(childAt);
                Rect rect = new Rect();
                childAt.getHitRect(rect);
                this.f12862q = rect;
                return;
            }
        }
    }

    private com.facebook.react.views.view.i c() {
        return (com.facebook.react.views.view.i) this.f12858m.getChildAt(0);
    }

    private UIManager d() {
        return (UIManager) O1.a.c(AbstractC0884k0.g((ReactContext) this.f12858m.getContext(), C2239a.a(this.f12858m.getId())));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void i() {
        WeakReference weakReference;
        View view;
        if (this.f12860o == null || (weakReference = this.f12861p) == null || this.f12862q == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        Rect rect = new Rect();
        view.getHitRect(rect);
        if (this.f12859n) {
            int i7 = rect.left - this.f12862q.left;
            if (i7 != 0) {
                int scrollX = this.f12858m.getScrollX();
                ViewGroup viewGroup = this.f12858m;
                ((f.d) viewGroup).b(i7 + scrollX, viewGroup.getScrollY());
                this.f12862q = rect;
                Integer num = this.f12860o.f12866b;
                if (num == null || scrollX > num.intValue()) {
                    return;
                }
                ViewGroup viewGroup2 = this.f12858m;
                ((f.d) viewGroup2).c(0, viewGroup2.getScrollY());
                return;
            }
            return;
        }
        int i8 = rect.top - this.f12862q.top;
        if (i8 != 0) {
            int scrollY = this.f12858m.getScrollY();
            ViewGroup viewGroup3 = this.f12858m;
            ((f.d) viewGroup3).b(viewGroup3.getScrollX(), i8 + scrollY);
            this.f12862q = rect;
            Integer num2 = this.f12860o.f12866b;
            if (num2 == null || scrollY > num2.intValue()) {
                return;
            }
            ViewGroup viewGroup4 = this.f12858m;
            ((f.d) viewGroup4).c(viewGroup4.getScrollX(), 0);
        }
    }

    @Override // com.facebook.react.bridge.UIManagerListener
    public void didDispatchMountItems(UIManager uIManager) {
    }

    @Override // com.facebook.react.bridge.UIManagerListener
    public void didMountItems(UIManager uIManager) {
        i();
    }

    @Override // com.facebook.react.bridge.UIManagerListener
    public void didScheduleMountItems(UIManager uIManager) {
    }

    public void e(b bVar) {
        this.f12860o = bVar;
    }

    public void f() {
        if (this.f12863r) {
            return;
        }
        this.f12863r = true;
        d().addUIManagerEventListener(this);
    }

    public void g() {
        if (this.f12863r) {
            this.f12863r = false;
            d().removeUIManagerEventListener(this);
        }
    }

    public void h() {
        if (C2239a.a(this.f12858m.getId()) == 2) {
            return;
        }
        i();
    }

    @Override // com.facebook.react.bridge.UIManagerListener
    public void willDispatchViewUpdates(UIManager uIManager) {
        UiThreadUtil.runOnUiThread(new RunnableC0220a());
    }

    @Override // com.facebook.react.bridge.UIManagerListener
    public void willMountItems(UIManager uIManager) {
        b();
    }
}
