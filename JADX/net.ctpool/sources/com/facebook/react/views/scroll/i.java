package com.facebook.react.views.scroll;

import android.view.MotionEvent;
import android.view.VelocityTracker;

/* JADX INFO: loaded from: classes.dex */
class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private VelocityTracker f12997a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f12998b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f12999c;

    i() {
    }

    public void a(MotionEvent motionEvent) {
        int action = motionEvent.getAction() & 255;
        if (this.f12997a == null) {
            this.f12997a = VelocityTracker.obtain();
        }
        this.f12997a.addMovement(motionEvent);
        if (action == 1 || action == 3) {
            this.f12997a.computeCurrentVelocity(1);
            this.f12998b = this.f12997a.getXVelocity();
            this.f12999c = this.f12997a.getYVelocity();
            VelocityTracker velocityTracker = this.f12997a;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f12997a = null;
            }
        }
    }

    public float b() {
        return this.f12998b;
    }

    public float c() {
        return this.f12999c;
    }
}
