package com.facebook.react.runtime;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.config.ReactFeatureFlags;
import com.facebook.react.uimanager.C0892s;
import com.facebook.react.uimanager.C0893t;
import com.facebook.react.uimanager.C0894u;
import java.util.Objects;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
public final class f0 extends com.facebook.react.X {

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    private static final a f12183L = new a(null);

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private final e0 f12184F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private final C0894u f12185G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private C0893t f12186H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private boolean f12187I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private int f12188J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private int f12189K;

    private static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(Context context, e0 e0Var) {
        super(context);
        w5.k.f(e0Var, "surface");
        this.f12184F = e0Var;
        this.f12185G = new C0894u(this);
        if (ReactFeatureFlags.dispatchPointerEvents) {
            this.f12186H = new C0893t(this);
        }
    }

    private final Point getViewportOffset() {
        int[] iArr = new int[2];
        getLocationOnScreen(iArr);
        Rect rect = new Rect();
        getWindowVisibleDisplayFrame(rect);
        iArr[0] = iArr[0] - rect.left;
        iArr[1] = iArr[1] - rect.top;
        return new Point(iArr[0], iArr[1]);
    }

    @Override // com.facebook.react.X, com.facebook.react.uimanager.Z
    public void a(View view, MotionEvent motionEvent) {
        C0893t c0893t;
        w5.k.f(motionEvent, "ev");
        com.facebook.react.uimanager.events.e eVarI = this.f12184F.i();
        if (eVarI == null) {
            return;
        }
        this.f12185G.e(motionEvent, eVarI);
        if (view == null || (c0893t = this.f12186H) == null) {
            return;
        }
        c0893t.p(view, motionEvent, eVarI);
    }

    @Override // com.facebook.react.X, com.facebook.react.uimanager.Z
    public void b(Throwable th) {
        w5.k.f(th, "t");
        ReactHostImpl reactHostImplL = this.f12184F.l();
        w5.k.e(reactHostImplL, "getReactHost(...)");
        String string = Objects.toString(th.getMessage(), "");
        w5.k.c(string);
        reactHostImplL.B0(new C0892s(string, this, th));
    }

    @Override // com.facebook.react.X, com.facebook.react.uimanager.Z
    public void d(View view, MotionEvent motionEvent) {
        w5.k.f(view, "childView");
        w5.k.f(motionEvent, "ev");
        com.facebook.react.uimanager.events.e eVarI = this.f12184F.i();
        if (eVarI == null) {
            return;
        }
        this.f12185G.d(motionEvent, eVarI);
        C0893t c0893t = this.f12186H;
        if (c0893t != null) {
            c0893t.o();
        }
    }

    @Override // com.facebook.react.X
    protected void g(MotionEvent motionEvent, boolean z6) {
        w5.k.f(motionEvent, "event");
        if (this.f12186H == null) {
            if (ReactFeatureFlags.dispatchPointerEvents) {
                P0.a.G("ReactSurfaceView", "Unable to dispatch pointer events to JS before the dispatcher is available");
                return;
            }
            return;
        }
        com.facebook.react.uimanager.events.e eVarI = this.f12184F.i();
        if (eVarI == null) {
            P0.a.G("ReactSurfaceView", "Unable to dispatch pointer events to JS as the React instance has not been attached");
            return;
        }
        C0893t c0893t = this.f12186H;
        if (c0893t != null) {
            c0893t.k(motionEvent, eVarI, z6);
        }
    }

    @Override // com.facebook.react.X
    public ReactContext getCurrentReactContext() {
        if (this.f12184F.o()) {
            return this.f12184F.l().h0();
        }
        return null;
    }

    @Override // com.facebook.react.X, com.facebook.react.uimanager.S
    public String getJSModuleName() {
        String strJ = this.f12184F.j();
        w5.k.e(strJ, "<get-moduleName>(...)");
        return strJ;
    }

    @Override // com.facebook.react.X, com.facebook.react.uimanager.S
    public int getUIManagerType() {
        return 2;
    }

    @Override // com.facebook.react.X
    protected void h(MotionEvent motionEvent) {
        w5.k.f(motionEvent, "event");
        com.facebook.react.uimanager.events.e eVarI = this.f12184F.i();
        if (eVarI != null) {
            this.f12185G.c(motionEvent, eVarI);
        } else {
            P0.a.G("ReactSurfaceView", "Unable to dispatch touch events to JS as the React instance has not been attached");
        }
    }

    @Override // com.facebook.react.X
    public boolean i() {
        return this.f12184F.o() && this.f12184F.l().h0() != null;
    }

    @Override // com.facebook.react.X
    public boolean j() {
        return this.f12184F.o() && this.f12184F.l().D0();
    }

    @Override // com.facebook.react.X
    public boolean o() {
        return this.f12184F.o();
    }

    @Override // com.facebook.react.X, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z6, int i7, int i8, int i9, int i10) {
        if (this.f12187I && z6) {
            Point viewportOffset = getViewportOffset();
            this.f12184F.s(this.f12188J, this.f12189K, viewportOffset.x, viewportOffset.y);
        }
    }

    @Override // com.facebook.react.X, android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i7, int i8) {
        int size;
        int size2;
        P2.a.c(0L, "ReactSurfaceView.onMeasure");
        int mode = View.MeasureSpec.getMode(i7);
        if (mode == Integer.MIN_VALUE || mode == 0) {
            int childCount = getChildCount();
            int iMax = 0;
            for (int i9 = 0; i9 < childCount; i9++) {
                View childAt = getChildAt(i9);
                iMax = Math.max(iMax, childAt.getLeft() + childAt.getMeasuredWidth() + childAt.getPaddingLeft() + childAt.getPaddingRight());
            }
            size = iMax;
        } else {
            size = View.MeasureSpec.getSize(i7);
        }
        int mode2 = View.MeasureSpec.getMode(i8);
        if (mode2 == Integer.MIN_VALUE || mode2 == 0) {
            int childCount2 = getChildCount();
            int iMax2 = 0;
            for (int i10 = 0; i10 < childCount2; i10++) {
                View childAt2 = getChildAt(i10);
                iMax2 = Math.max(iMax2, childAt2.getTop() + childAt2.getMeasuredHeight() + childAt2.getPaddingTop() + childAt2.getPaddingBottom());
            }
            size2 = iMax2;
        } else {
            size2 = View.MeasureSpec.getSize(i8);
        }
        setMeasuredDimension(size, size2);
        this.f12187I = true;
        this.f12188J = i7;
        this.f12189K = i8;
        Point viewportOffset = getViewportOffset();
        this.f12184F.s(i7, i8, viewportOffset.x, viewportOffset.y);
        P2.a.g(0L);
    }

    @Override // com.facebook.react.X, android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z6) {
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(z6);
        }
    }

    @Override // com.facebook.react.X
    public void setIsFabric(boolean z6) {
        super.setIsFabric(true);
    }
}
