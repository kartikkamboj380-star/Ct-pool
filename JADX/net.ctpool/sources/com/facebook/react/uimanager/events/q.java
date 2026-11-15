package com.facebook.react.uimanager.events;

import android.view.MotionEvent;
import com.facebook.react.bridge.ReactSoftExceptionLogger;
import com.facebook.react.bridge.SoftAssertions;
import com.facebook.react.uimanager.events.s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
public final class q extends d {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f12572f = new a(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final String f12573g = q.class.getSimpleName();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final androidx.core.util.e f12574h = new androidx.core.util.e(3);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private MotionEvent f12575a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private s f12576b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private short f12577c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private float f12578d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float f12579e;

    public static final class a {
        private a() {
        }

        public final q a(int i7, int i8, s sVar, MotionEvent motionEvent, long j7, float f7, float f8, r rVar) {
            w5.k.f(rVar, "touchEventCoalescingKeyHelper");
            q qVar = (q) q.f12574h.b();
            if (qVar == null) {
                qVar = new q(null);
            }
            Object objC = O1.a.c(motionEvent);
            w5.k.e(objC, "assertNotNull(...)");
            qVar.g(i7, i8, sVar, (MotionEvent) objC, j7, f7, f8, rVar);
            return qVar;
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f12580a;

        static {
            int[] iArr = new int[s.values().length];
            try {
                iArr[s.f12583o.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[s.f12584p.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[s.f12586r.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[s.f12585q.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f12580a = iArr;
        }
    }

    private q() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0049  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void g(int i7, int i8, s sVar, MotionEvent motionEvent, long j7, float f7, float f8, r rVar) {
        super.init(i7, i8, motionEvent.getEventTime());
        short sB = 0;
        SoftAssertions.assertCondition(j7 != Long.MIN_VALUE, "Gesture start time must be initialized");
        int action = motionEvent.getAction() & 255;
        if (action == 0) {
            rVar.a(j7);
        } else if (action == 1) {
            rVar.e(j7);
        } else if (action == 2) {
            sB = rVar.b(j7);
        } else if (action != 3) {
            if (action != 5 && action != 6) {
                throw new RuntimeException("Unhandled MotionEvent action: " + action);
            }
            rVar.d(j7);
        }
        this.f12575a = MotionEvent.obtain(motionEvent);
        this.f12576b = sVar;
        this.f12577c = sB;
        this.f12578d = f7;
        this.f12579e = f8;
    }

    public static final q h(int i7, int i8, s sVar, MotionEvent motionEvent, long j7, float f7, float f8, r rVar) {
        return f12572f.a(i7, i8, sVar, motionEvent, j7, f7, f8, rVar);
    }

    private final boolean i() {
        if (this.f12575a != null) {
            return true;
        }
        ReactSoftExceptionLogger.logSoftException(f12573g, new IllegalStateException("Cannot dispatch a TouchEvent that has no MotionEvent; the TouchEvent has been recycled"));
        return false;
    }

    public final MotionEvent c() {
        Object objC = O1.a.c(this.f12575a);
        w5.k.e(objC, "assertNotNull(...)");
        return (MotionEvent) objC;
    }

    @Override // com.facebook.react.uimanager.events.d
    public boolean canCoalesce() {
        s sVar = (s) O1.a.c(this.f12576b);
        int i7 = sVar == null ? -1 : b.f12580a[sVar.ordinal()];
        if (i7 == 1 || i7 == 2 || i7 == 3) {
            return false;
        }
        if (i7 == 4) {
            return true;
        }
        throw new RuntimeException("Unknown touch event type: " + this.f12576b);
    }

    public final s d() {
        Object objC = O1.a.c(this.f12576b);
        w5.k.e(objC, "assertNotNull(...)");
        return (s) objC;
    }

    @Override // com.facebook.react.uimanager.events.d
    public void dispatch(RCTEventEmitter rCTEventEmitter) {
        w5.k.f(rCTEventEmitter, "rctEventEmitter");
        if (i()) {
            t.d(rCTEventEmitter, this);
        }
    }

    @Override // com.facebook.react.uimanager.events.d
    public void dispatchModern(RCTModernEventEmitter rCTModernEventEmitter) {
        w5.k.f(rCTModernEventEmitter, "rctEventEmitter");
        if (i()) {
            rCTModernEventEmitter.receiveTouches(this);
        }
    }

    public final float e() {
        return this.f12578d;
    }

    public final float f() {
        return this.f12579e;
    }

    @Override // com.facebook.react.uimanager.events.d
    public short getCoalescingKey() {
        return this.f12577c;
    }

    @Override // com.facebook.react.uimanager.events.d
    protected int getEventCategory() {
        s sVar = this.f12576b;
        if (sVar == null) {
            return 2;
        }
        int i7 = b.f12580a[sVar.ordinal()];
        if (i7 == 1) {
            return 0;
        }
        if (i7 == 2 || i7 == 3) {
            return 1;
        }
        if (i7 == 4) {
            return 4;
        }
        throw new i5.k();
    }

    @Override // com.facebook.react.uimanager.events.d
    public String getEventName() {
        s.a aVar = s.f12582n;
        Object objC = O1.a.c(this.f12576b);
        w5.k.e(objC, "assertNotNull(...)");
        return aVar.a((s) objC);
    }

    @Override // com.facebook.react.uimanager.events.d
    public void onDispose() {
        MotionEvent motionEvent = this.f12575a;
        if (motionEvent != null) {
            motionEvent.recycle();
        }
        this.f12575a = null;
        try {
            f12574h.a(this);
        } catch (IllegalStateException e7) {
            ReactSoftExceptionLogger.logSoftException(f12573g, e7);
        }
    }

    public /* synthetic */ q(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
