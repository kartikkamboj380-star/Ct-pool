package g5;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import h5.InterfaceC1737a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class g {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static g f19539g = new g();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private ReactContext f19543d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f19545f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f19540a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Handler f19541b = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final HashMap f19542c = new HashMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Boolean f19544e = Boolean.FALSE;

    private boolean g(InterfaceC1737a interfaceC1737a) {
        ReactContext reactContext;
        if (this.f19544e.booleanValue() && (reactContext = this.f19543d) != null && reactContext.hasActiveCatalystInstance()) {
            try {
                ((DeviceEventManagerModule.RCTDeviceEventEmitter) this.f19543d.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit("rnfb_" + interfaceC1737a.b(), interfaceC1737a.a());
                return true;
            } catch (Exception e7) {
                Log.wtf("RNFB_EMITTER", "Error sending Event " + interfaceC1737a.b(), e7);
            }
        }
        return false;
    }

    public static g i() {
        return f19539g;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void j(ReactContext reactContext) {
        this.f19543d = reactContext;
        p();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void k(Boolean bool) {
        this.f19544e = bool;
        p();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void l(InterfaceC1737a interfaceC1737a) {
        synchronized (this.f19542c) {
            try {
                if (!this.f19542c.containsKey(interfaceC1737a.b()) || !g(interfaceC1737a)) {
                    this.f19540a.add(interfaceC1737a);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void p() {
        synchronized (this.f19542c) {
            try {
                for (InterfaceC1737a interfaceC1737a : new ArrayList(this.f19540a)) {
                    if (this.f19542c.containsKey(interfaceC1737a.b())) {
                        this.f19540a.remove(interfaceC1737a);
                        o(interfaceC1737a);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void e(String str) {
        synchronized (this.f19542c) {
            try {
                this.f19545f++;
                if (this.f19542c.containsKey(str)) {
                    this.f19542c.put(str, Integer.valueOf(((Integer) this.f19542c.get(str)).intValue() + 1));
                } else {
                    this.f19542c.put(str, 1);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f19541b.post(new Runnable() { // from class: g5.e
            @Override // java.lang.Runnable
            public final void run() {
                this.f19536m.p();
            }
        });
    }

    public void f(final ReactContext reactContext) {
        this.f19541b.post(new Runnable() { // from class: g5.d
            @Override // java.lang.Runnable
            public final void run() {
                this.f19534m.j(reactContext);
            }
        });
    }

    public WritableMap h() {
        WritableMap writableMapCreateMap = Arguments.createMap();
        WritableMap writableMapCreateMap2 = Arguments.createMap();
        writableMapCreateMap.putInt("listeners", this.f19545f);
        writableMapCreateMap.putInt("queued", this.f19540a.size());
        synchronized (this.f19542c) {
            try {
                for (Map.Entry entry : this.f19542c.entrySet()) {
                    writableMapCreateMap2.putInt((String) entry.getKey(), ((Integer) entry.getValue()).intValue());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        writableMapCreateMap.putMap("events", writableMapCreateMap2);
        return writableMapCreateMap;
    }

    public void m(final Boolean bool) {
        this.f19541b.post(new Runnable() { // from class: g5.c
            @Override // java.lang.Runnable
            public final void run() {
                this.f19532m.k(bool);
            }
        });
    }

    public void n(String str, Boolean bool) {
        synchronized (this.f19542c) {
            try {
                if (this.f19542c.containsKey(str)) {
                    int iIntValue = ((Integer) this.f19542c.get(str)).intValue();
                    if (iIntValue <= 1 || bool.booleanValue()) {
                        this.f19542c.remove(str);
                    } else {
                        this.f19542c.put(str, Integer.valueOf(iIntValue - 1));
                    }
                    int i7 = this.f19545f;
                    if (!bool.booleanValue()) {
                        iIntValue = 1;
                    }
                    this.f19545f = i7 - iIntValue;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void o(final InterfaceC1737a interfaceC1737a) {
        this.f19541b.post(new Runnable() { // from class: g5.f
            @Override // java.lang.Runnable
            public final void run() {
                this.f19537m.l(interfaceC1737a);
            }
        });
    }
}
