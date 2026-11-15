package com.facebook.react.uimanager;

import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import com.facebook.react.bridge.UiThreadUtil;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class G0 implements ComponentCallbacks2 {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final Map f12285m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final H0 f12286n;

    class a implements Runnable {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        final /* synthetic */ List f12287m;

        a(List list) {
            this.f12287m = list;
        }

        @Override // java.lang.Runnable
        public void run() {
            Iterator it = this.f12287m.iterator();
            while (it.hasNext()) {
                ((ViewManager) it.next()).trimMemory();
            }
        }
    }

    public G0(H0 h02) {
        this.f12285m = S1.f.b();
        this.f12286n = h02;
    }

    private ViewManager d(String str) {
        ViewManager viewManagerB = this.f12286n.b(str);
        if (viewManagerB != null) {
            this.f12285m.put(str, viewManagerB);
        }
        return viewManagerB;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void g(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((ViewManager) it.next()).invalidate();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void h(List list, int i7) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((ViewManager) it.next()).onSurfaceStopped(i7);
        }
    }

    public synchronized ViewManager c(String str) {
        try {
            ViewManager viewManager = (ViewManager) this.f12285m.get(str);
            if (viewManager != null) {
                return viewManager;
            }
            String str2 = "RCT" + str;
            ViewManager viewManager2 = (ViewManager) this.f12285m.get(str2);
            if (viewManager2 != null) {
                return viewManager2;
            }
            if (this.f12286n == null) {
                throw new C0892s("No ViewManager found for class " + str);
            }
            ViewManager viewManagerD = d(str);
            if (viewManagerD != null) {
                return viewManagerD;
            }
            ViewManager viewManagerD2 = d(str2);
            if (viewManagerD2 != null) {
                return viewManagerD2;
            }
            throw new C0892s("ViewManagerResolver returned null for either " + str + " or " + str2 + ", existing names are: " + this.f12286n.a());
        } catch (Throwable th) {
            throw th;
        }
    }

    synchronized ViewManager e(String str) {
        ViewManager viewManager = (ViewManager) this.f12285m.get(str);
        if (viewManager != null) {
            return viewManager;
        }
        if (this.f12286n == null) {
            return null;
        }
        return d(str);
    }

    public void f() {
        final ArrayList arrayList;
        synchronized (this) {
            arrayList = new ArrayList(this.f12285m.values());
        }
        Runnable runnable = new Runnable() { // from class: com.facebook.react.uimanager.E0
            @Override // java.lang.Runnable
            public final void run() {
                G0.g(arrayList);
            }
        };
        if (UiThreadUtil.isOnUiThread()) {
            runnable.run();
        } else {
            UiThreadUtil.runOnUiThread(runnable);
        }
    }

    public void i(final int i7) {
        final ArrayList arrayList;
        synchronized (this) {
            arrayList = new ArrayList(this.f12285m.values());
        }
        Runnable runnable = new Runnable() { // from class: com.facebook.react.uimanager.F0
            @Override // java.lang.Runnable
            public final void run() {
                G0.h(arrayList, i7);
            }
        };
        if (UiThreadUtil.isOnUiThread()) {
            runnable.run();
        } else {
            UiThreadUtil.runOnUiThread(runnable);
        }
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
        onTrimMemory(0);
    }

    @Override // android.content.ComponentCallbacks2
    public void onTrimMemory(int i7) {
        ArrayList arrayList;
        synchronized (this) {
            arrayList = new ArrayList(this.f12285m.values());
        }
        a aVar = new a(arrayList);
        if (UiThreadUtil.isOnUiThread()) {
            aVar.run();
        } else {
            UiThreadUtil.runOnUiThread(aVar);
        }
    }

    public G0(List list) {
        HashMap mapB = S1.f.b();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ViewManager viewManager = (ViewManager) it.next();
            mapB.put(viewManager.getName(), viewManager);
        }
        this.f12285m = mapB;
        this.f12286n = null;
    }
}
