package l1;

import android.content.Context;
import android.view.MotionEvent;
import android.view.ViewConfiguration;

/* JADX INFO: renamed from: l1.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1846a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    InterfaceC0300a f21081a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final float f21082b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    boolean f21083c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    boolean f21084d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    long f21085e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    float f21086f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    float f21087g;

    /* JADX INFO: renamed from: l1.a$a, reason: collision with other inner class name */
    public interface InterfaceC0300a {
        boolean e();
    }

    public C1846a(Context context) {
        this.f21082b = ViewConfiguration.get(context).getScaledTouchSlop();
        a();
    }

    public static C1846a c(Context context) {
        return new C1846a(context);
    }

    public void a() {
        this.f21081a = null;
        e();
    }

    public boolean b() {
        return this.f21083c;
    }

    public boolean d(MotionEvent motionEvent) {
        InterfaceC0300a interfaceC0300a;
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action == 1) {
                this.f21083c = false;
                if (Math.abs(motionEvent.getX() - this.f21086f) > this.f21082b || Math.abs(motionEvent.getY() - this.f21087g) > this.f21082b) {
                    this.f21084d = false;
                }
                if (this.f21084d && motionEvent.getEventTime() - this.f21085e <= ViewConfiguration.getLongPressTimeout() && (interfaceC0300a = this.f21081a) != null) {
                    interfaceC0300a.e();
                }
            } else if (action != 2) {
                if (action == 3) {
                    this.f21083c = false;
                }
            } else if (Math.abs(motionEvent.getX() - this.f21086f) > this.f21082b || Math.abs(motionEvent.getY() - this.f21087g) > this.f21082b) {
            }
            this.f21084d = false;
        } else {
            this.f21083c = true;
            this.f21084d = true;
            this.f21085e = motionEvent.getEventTime();
            this.f21086f = motionEvent.getX();
            this.f21087g = motionEvent.getY();
        }
        return true;
    }

    public void e() {
        this.f21083c = false;
        this.f21084d = false;
    }

    public void f(InterfaceC0300a interfaceC0300a) {
        this.f21081a = interfaceC0300a;
    }
}
