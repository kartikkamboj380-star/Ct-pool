package com.facebook.react.uimanager;

import android.view.MotionEvent;
import android.view.ViewGroup;

/* JADX INFO: renamed from: com.facebook.react.uimanager.u, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0894u {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ViewGroup f12729e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f12725a = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float[] f12726b = new float[2];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f12727c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f12728d = Long.MIN_VALUE;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final com.facebook.react.uimanager.events.r f12730f = new com.facebook.react.uimanager.events.r();

    public C0894u(ViewGroup viewGroup) {
        this.f12729e = viewGroup;
    }

    private void a(MotionEvent motionEvent, com.facebook.react.uimanager.events.e eVar) {
        if (this.f12725a == -1) {
            P0.a.G("ReactNative", "Can't cancel already finished gesture. Is a child View trying to start a gesture from an UP/CANCEL event?");
            return;
        }
        O1.a.b(!this.f12727c, "Expected to not have already sent a cancel for this gesture");
        com.facebook.react.uimanager.events.e eVar2 = (com.facebook.react.uimanager.events.e) O1.a.c(eVar);
        int iF = AbstractC0884k0.f(this.f12729e);
        int i7 = this.f12725a;
        com.facebook.react.uimanager.events.s sVar = com.facebook.react.uimanager.events.s.f12586r;
        long j7 = this.f12728d;
        float[] fArr = this.f12726b;
        eVar2.c(com.facebook.react.uimanager.events.q.h(iF, i7, sVar, motionEvent, j7, fArr[0], fArr[1], this.f12730f));
    }

    private int b(MotionEvent motionEvent) {
        return AbstractC0874f0.c(motionEvent.getX(), motionEvent.getY(), this.f12729e, this.f12726b, null);
    }

    public void c(MotionEvent motionEvent, com.facebook.react.uimanager.events.e eVar) {
        int iF;
        int i7;
        com.facebook.react.uimanager.events.s sVar;
        long j7;
        float f7;
        float f8;
        int action = motionEvent.getAction() & 255;
        if (action != 0) {
            if (this.f12727c) {
                return;
            }
            if (this.f12725a == -1) {
                P0.a.j("ReactNative", "Unexpected state: received touch event but didn't get starting ACTION_DOWN for this gesture before");
                return;
            }
            if (action == 1) {
                b(motionEvent);
                int iF2 = AbstractC0884k0.f(this.f12729e);
                int i8 = this.f12725a;
                com.facebook.react.uimanager.events.s sVar2 = com.facebook.react.uimanager.events.s.f12584p;
                long j8 = this.f12728d;
                float[] fArr = this.f12726b;
                eVar.c(com.facebook.react.uimanager.events.q.h(iF2, i8, sVar2, motionEvent, j8, fArr[0], fArr[1], this.f12730f));
            } else if (action == 2) {
                b(motionEvent);
                iF = AbstractC0884k0.f(this.f12729e);
                i7 = this.f12725a;
                sVar = com.facebook.react.uimanager.events.s.f12585q;
                j7 = this.f12728d;
                float[] fArr2 = this.f12726b;
                f7 = fArr2[0];
                f8 = fArr2[1];
            } else if (action == 5) {
                iF = AbstractC0884k0.f(this.f12729e);
                i7 = this.f12725a;
                sVar = com.facebook.react.uimanager.events.s.f12583o;
                j7 = this.f12728d;
                float[] fArr3 = this.f12726b;
                f7 = fArr3[0];
                f8 = fArr3[1];
            } else if (action == 6) {
                iF = AbstractC0884k0.f(this.f12729e);
                i7 = this.f12725a;
                sVar = com.facebook.react.uimanager.events.s.f12584p;
                j7 = this.f12728d;
                float[] fArr4 = this.f12726b;
                f7 = fArr4[0];
                f8 = fArr4[1];
            } else {
                if (action != 3) {
                    P0.a.G("ReactNative", "Warning : touch event was ignored. Action=" + action + " Target=" + this.f12725a);
                    return;
                }
                if (this.f12730f.c(motionEvent.getDownTime())) {
                    a(motionEvent, eVar);
                } else {
                    P0.a.j("ReactNative", "Received an ACTION_CANCEL touch event for which we have no corresponding ACTION_DOWN");
                }
            }
            this.f12725a = -1;
            this.f12728d = Long.MIN_VALUE;
            return;
        }
        if (this.f12725a != -1) {
            P0.a.j("ReactNative", "Got DOWN touch before receiving UP or CANCEL from last gesture");
        }
        this.f12727c = false;
        this.f12728d = motionEvent.getEventTime();
        this.f12725a = b(motionEvent);
        iF = AbstractC0884k0.f(this.f12729e);
        i7 = this.f12725a;
        sVar = com.facebook.react.uimanager.events.s.f12583o;
        j7 = this.f12728d;
        float[] fArr5 = this.f12726b;
        f7 = fArr5[0];
        f8 = fArr5[1];
        eVar.c(com.facebook.react.uimanager.events.q.h(iF, i7, sVar, motionEvent, j7, f7, f8, this.f12730f));
    }

    public void d(MotionEvent motionEvent, com.facebook.react.uimanager.events.e eVar) {
        this.f12727c = false;
    }

    public void e(MotionEvent motionEvent, com.facebook.react.uimanager.events.e eVar) {
        if (this.f12727c) {
            return;
        }
        a(motionEvent, eVar);
        this.f12727c = true;
        this.f12725a = -1;
    }
}
