package com.facebook.react;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.os.PowerManager;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.UiThreadUtil;
import h2.C1706a;
import h2.C1708c;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: renamed from: com.facebook.react.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractServiceC0825h extends Service implements h2.d {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static PowerManager.WakeLock f11772n;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final Set f11773m = new CopyOnWriteArraySet();

    /* JADX INFO: renamed from: com.facebook.react.h$a */
    class a implements InterfaceC0918z {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ C1706a f11774a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ H f11775b;

        a(C1706a c1706a, H h7) {
            this.f11774a = c1706a;
            this.f11775b = h7;
        }

        @Override // com.facebook.react.InterfaceC0918z
        public void a(ReactContext reactContext) {
            AbstractServiceC0825h.this.h(reactContext, this.f11774a);
            this.f11775b.p0(this);
        }
    }

    /* JADX INFO: renamed from: com.facebook.react.h$b */
    class b implements Runnable {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        final /* synthetic */ C1708c f11777m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ C1706a f11778n;

        b(C1708c c1708c, C1706a c1706a) {
            this.f11777m = c1708c;
            this.f11778n = c1706a;
        }

        @Override // java.lang.Runnable
        public void run() {
            AbstractServiceC0825h.this.f11773m.add(Integer.valueOf(this.f11777m.n(this.f11778n)));
        }
    }

    public static void e(Context context) {
        PowerManager.WakeLock wakeLock = f11772n;
        if (wakeLock == null || !wakeLock.isHeld()) {
            PowerManager.WakeLock wakeLockNewWakeLock = ((PowerManager) O1.a.c((PowerManager) context.getSystemService("power"))).newWakeLock(1, AbstractServiceC0825h.class.getCanonicalName());
            f11772n = wakeLockNewWakeLock;
            wakeLockNewWakeLock.setReferenceCounted(false);
            f11772n.acquire();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h(ReactContext reactContext, C1706a c1706a) {
        C1708c c1708cF = C1708c.f(reactContext);
        c1708cF.d(this);
        UiThreadUtil.runOnUiThread(new b(c1708cF, c1706a));
    }

    @Override // h2.d
    public void a(int i7) {
        this.f11773m.remove(Integer.valueOf(i7));
        if (this.f11773m.size() == 0) {
            stopSelf();
        }
    }

    @Override // h2.d
    public void b(int i7) {
    }

    protected L f() {
        return ((InterfaceC0915w) getApplication()).a();
    }

    protected abstract C1706a g(Intent intent);

    protected void i(C1706a c1706a) {
        UiThreadUtil.assertOnUiThread();
        e(this);
        H hO = f().o();
        ReactContext reactContextC = hO.C();
        if (reactContextC != null) {
            h(reactContextC, c1706a);
        } else {
            hO.q(new a(c1706a, hO));
            hO.x();
        }
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public void onDestroy() {
        ReactContext reactContextC;
        super.onDestroy();
        if (f().v() && (reactContextC = f().o().C()) != null) {
            C1708c.f(reactContextC).j(this);
        }
        PowerManager.WakeLock wakeLock = f11772n;
        if (wakeLock != null) {
            wakeLock.release();
        }
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i7, int i8) {
        C1706a c1706aG = g(intent);
        if (c1706aG == null) {
            return 2;
        }
        i(c1706aG);
        return 3;
    }
}
