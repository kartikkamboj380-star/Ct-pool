package w2;

import android.view.MotionEvent;
import android.view.ViewGroup;
import android.view.ViewParent;
import kotlin.jvm.internal.DefaultConstructorMarker;
import w5.k;

/* JADX INFO: renamed from: w2.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2184a implements InterfaceC2185b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final C0324a f22678c = new C0324a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private volatile int f22679a = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ViewParent f22680b;

    /* JADX INFO: renamed from: w2.a$a, reason: collision with other inner class name */
    private static final class C0324a {
        private C0324a() {
        }

        public /* synthetic */ C0324a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private final void c() {
        ViewParent viewParent = this.f22680b;
        if (viewParent != null) {
            viewParent.requestDisallowInterceptTouchEvent(false);
        }
        this.f22680b = null;
    }

    @Override // w2.InterfaceC2185b
    public boolean a(ViewGroup viewGroup, MotionEvent motionEvent) {
        k.f(viewGroup, "view");
        k.f(motionEvent, "event");
        int i7 = this.f22679a;
        return (i7 == -1 || motionEvent.getAction() == 1 || viewGroup.getId() != i7) ? false : true;
    }

    public final void b() {
        this.f22679a = -1;
        c();
    }

    public final void d(int i7, ViewParent viewParent) {
        this.f22679a = i7;
        c();
        if (viewParent != null) {
            viewParent.requestDisallowInterceptTouchEvent(true);
            this.f22680b = viewParent;
        }
    }
}
