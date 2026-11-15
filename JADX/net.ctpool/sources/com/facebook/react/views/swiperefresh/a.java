package com.facebook.react.views.swiperefresh;

import android.view.MotionEvent;
import android.view.ViewConfiguration;
import androidx.swiperefreshlayout.widget.c;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.uimanager.G;
import com.facebook.react.uimanager.events.m;

/* JADX INFO: loaded from: classes.dex */
public class a extends c {

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    private boolean f13003g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    private boolean f13004h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    private float f13005i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    private int f13006j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    private float f13007k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    private boolean f13008l0;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    private boolean f13009m0;

    public a(ReactContext reactContext) {
        super(reactContext);
        this.f13003g0 = false;
        this.f13004h0 = false;
        this.f13005i0 = 0.0f;
        this.f13009m0 = false;
        this.f13006j0 = ViewConfiguration.get(reactContext).getScaledTouchSlop();
    }

    private boolean B(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f13007k0 = motionEvent.getX();
            this.f13008l0 = false;
        } else if (action == 2) {
            float fAbs = Math.abs(motionEvent.getX() - this.f13007k0);
            if (this.f13008l0 || fAbs > this.f13006j0) {
                this.f13008l0 = true;
                return false;
            }
        }
        return true;
    }

    @Override // androidx.swiperefreshlayout.widget.c, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!B(motionEvent) || !super.onInterceptTouchEvent(motionEvent)) {
            return false;
        }
        m.b(this, motionEvent);
        this.f13009m0 = true;
        if (getParent() != null) {
            getParent().requestDisallowInterceptTouchEvent(true);
        }
        return true;
    }

    @Override // androidx.swiperefreshlayout.widget.c, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z6, int i7, int i8, int i9, int i10) {
        super.onLayout(z6, i7, i8, i9, i10);
        if (this.f13003g0) {
            return;
        }
        this.f13003g0 = true;
        setProgressViewOffset(this.f13005i0);
        setRefreshing(this.f13004h0);
    }

    @Override // androidx.swiperefreshlayout.widget.c, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() == 1 && this.f13009m0) {
            m.a(this, motionEvent);
            this.f13009m0 = false;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z6) {
        if (getParent() != null) {
            getParent().requestDisallowInterceptTouchEvent(z6);
        }
    }

    public void setProgressViewOffset(float f7) {
        this.f13005i0 = f7;
        if (this.f13003g0) {
            int progressCircleDiameter = getProgressCircleDiameter();
            s(false, Math.round(G.d(f7)) - progressCircleDiameter, Math.round(G.d(f7 + 64.0f) - progressCircleDiameter));
        }
    }

    @Override // androidx.swiperefreshlayout.widget.c
    public void setRefreshing(boolean z6) {
        this.f13004h0 = z6;
        if (this.f13003g0) {
            super.setRefreshing(z6);
        }
    }
}
