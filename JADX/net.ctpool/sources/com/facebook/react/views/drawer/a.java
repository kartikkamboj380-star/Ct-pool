package com.facebook.react.views.drawer;

import H.a;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.core.view.C0574a;
import androidx.core.view.H;
import androidx.core.view.accessibility.C;
import com.facebook.react.AbstractC0831n;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.uimanager.I;
import com.facebook.react.uimanager.events.m;

/* JADX INFO: loaded from: classes.dex */
class a extends H.a {

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    private int f12763f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    private int f12764g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    private boolean f12765h0;

    /* JADX INFO: renamed from: com.facebook.react.views.drawer.a$a, reason: collision with other inner class name */
    class C0219a extends C0574a {
        C0219a() {
        }

        @Override // androidx.core.view.C0574a
        public void f(View view, AccessibilityEvent accessibilityEvent) {
            super.f(view, accessibilityEvent);
            I.e eVar = (I.e) view.getTag(AbstractC0831n.f11977g);
            if (eVar != null) {
                accessibilityEvent.setClassName(I.e.l(eVar));
            }
        }

        @Override // androidx.core.view.C0574a
        public void g(View view, C c7) {
            super.g(view, c7);
            I.e eVarK = I.e.k(view);
            if (eVarK != null) {
                c7.g0(I.e.l(eVarK));
            }
        }
    }

    public a(ReactContext reactContext) {
        super(reactContext);
        this.f12763f0 = 8388611;
        this.f12764g0 = -1;
        this.f12765h0 = false;
        H.p0(this, new C0219a());
    }

    void W() {
        d(this.f12763f0);
    }

    void X() {
        I(this.f12763f0);
    }

    void Y(int i7) {
        this.f12763f0 = i7;
        Z();
    }

    void Z() {
        if (getChildCount() == 2) {
            View childAt = getChildAt(1);
            a.f fVar = (a.f) childAt.getLayoutParams();
            fVar.f1331a = this.f12763f0;
            ((ViewGroup.MarginLayoutParams) fVar).width = this.f12764g0;
            childAt.setLayoutParams(fVar);
            childAt.setClickable(true);
        }
    }

    void a0(int i7) {
        this.f12764g0 = i7;
        Z();
    }

    @Override // H.a, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        try {
            if (!super.onInterceptTouchEvent(motionEvent)) {
                return false;
            }
            m.b(this, motionEvent);
            this.f12765h0 = true;
            return true;
        } catch (IllegalArgumentException e7) {
            P0.a.H("ReactNative", "Error intercepting touch event.", e7);
            return false;
        }
    }

    @Override // H.a, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() == 1 && this.f12765h0) {
            m.a(this, motionEvent);
            this.f12765h0 = false;
        }
        return super.onTouchEvent(motionEvent);
    }
}
