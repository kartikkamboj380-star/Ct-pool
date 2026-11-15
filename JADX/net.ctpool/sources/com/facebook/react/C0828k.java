package com.facebook.react;

import com.facebook.react.bridge.ModuleHolder;
import com.facebook.react.bridge.NativeModuleRegistry;
import com.facebook.react.bridge.ReactApplicationContext;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.facebook.react.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0828k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ReactApplicationContext f11789a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f11790b = new HashMap();

    public C0828k(ReactApplicationContext reactApplicationContext, H h7) {
        this.f11789a = reactApplicationContext;
    }

    public NativeModuleRegistry a() {
        return new NativeModuleRegistry(this.f11789a, this.f11790b);
    }

    public void b(M m7) {
        for (ModuleHolder moduleHolder : m7 instanceof AbstractC0794b ? ((AbstractC0794b) m7).getNativeModuleIterator(this.f11789a) : O.b(m7, this.f11789a)) {
            String name = moduleHolder.getName();
            if (this.f11790b.containsKey(name)) {
                ModuleHolder moduleHolder2 = (ModuleHolder) this.f11790b.get(name);
                if (!moduleHolder.getCanOverrideExistingModule()) {
                    throw new IllegalStateException("Native module " + name + " tried to override " + moduleHolder2.getClassName() + ". Check the getPackages() method in MainApplication.java, it might be that module is being created twice. If this was your intention, set canOverrideExistingModule=true. This error may also be present if the package is present only once in getPackages() but is also automatically added later during build time by autolinking. Try removing the existing entry and rebuild.");
                }
                this.f11790b.remove(moduleHolder2);
            }
            this.f11790b.put(name, moduleHolder);
        }
    }
}
