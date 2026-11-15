package com.facebook.react;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import com.facebook.react.bridge.MemoryPressureListener;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: com.facebook.react.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class ComponentCallbacks2C0827j implements ComponentCallbacks2 {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final CopyOnWriteArrayList f11787m = new CopyOnWriteArrayList();

    public ComponentCallbacks2C0827j(Context context) {
        context.getApplicationContext().registerComponentCallbacks(this);
    }

    private void c(int i7) {
        Iterator it = this.f11787m.iterator();
        while (it.hasNext()) {
            ((MemoryPressureListener) it.next()).handleMemoryPressure(i7);
        }
    }

    public void a(MemoryPressureListener memoryPressureListener) {
        if (this.f11787m.contains(memoryPressureListener)) {
            return;
        }
        this.f11787m.add(memoryPressureListener);
    }

    public void b(Context context) {
        context.getApplicationContext().unregisterComponentCallbacks(this);
    }

    public void d(MemoryPressureListener memoryPressureListener) {
        this.f11787m.remove(memoryPressureListener);
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
    }

    @Override // android.content.ComponentCallbacks2
    public void onTrimMemory(int i7) {
        c(i7);
    }
}
