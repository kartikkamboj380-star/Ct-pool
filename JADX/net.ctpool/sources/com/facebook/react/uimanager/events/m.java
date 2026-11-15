package com.facebook.react.uimanager.events;

import android.view.MotionEvent;
import android.view.View;
import com.facebook.react.uimanager.C0864a0;
import com.facebook.react.uimanager.Z;

/* JADX INFO: loaded from: classes.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final m f12533a = new m();

    private m() {
    }

    public static final void a(View view, MotionEvent motionEvent) {
        w5.k.f(view, "view");
        w5.k.f(motionEvent, "event");
        Z zA = C0864a0.a(view);
        if (zA != null) {
            zA.d(view, motionEvent);
        }
    }

    public static final void b(View view, MotionEvent motionEvent) {
        w5.k.f(view, "view");
        w5.k.f(motionEvent, "event");
        Z zA = C0864a0.a(view);
        if (zA != null) {
            zA.a(view, motionEvent);
        }
    }
}
