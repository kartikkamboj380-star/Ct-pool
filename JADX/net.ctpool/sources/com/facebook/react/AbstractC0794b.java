package com.facebook.react;

import com.facebook.react.bridge.ModuleHolder;
import com.facebook.react.bridge.ModuleSpec;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.config.ReactFeatureFlags;
import com.facebook.react.module.model.ReactModuleInfo;
import com.facebook.react.uimanager.ViewManager;
import j2.InterfaceC1778a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import javax.inject.Provider;

/* JADX INFO: renamed from: com.facebook.react.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0794b implements M {

    /* JADX INFO: renamed from: com.facebook.react.b$a */
    class a implements Iterator {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        Map.Entry f11382m = null;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ Iterator f11383n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        final /* synthetic */ ReactApplicationContext f11384o;

        a(Iterator it, ReactApplicationContext reactApplicationContext) {
            this.f11383n = it;
            this.f11384o = reactApplicationContext;
        }

        private void c() {
            while (this.f11383n.hasNext()) {
                Map.Entry entry = (Map.Entry) this.f11383n.next();
                ReactModuleInfo reactModuleInfo = (ReactModuleInfo) entry.getValue();
                if (!ReactFeatureFlags.useTurboModules || !reactModuleInfo.e()) {
                    this.f11382m = entry;
                    return;
                }
            }
            this.f11382m = null;
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public ModuleHolder next() {
            if (this.f11382m == null) {
                c();
            }
            Map.Entry entry = this.f11382m;
            if (entry == null) {
                throw new NoSuchElementException("ModuleHolder not found");
            }
            c();
            return new ModuleHolder((ReactModuleInfo) entry.getValue(), AbstractC0794b.this.new C0207b((String) entry.getKey(), this.f11384o));
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f11382m == null) {
                c();
            }
            return this.f11382m != null;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Cannot remove native modules from the list");
        }
    }

    /* JADX INFO: renamed from: com.facebook.react.b$b, reason: collision with other inner class name */
    private class C0207b implements Provider {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f11386a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final ReactApplicationContext f11387b;

        public C0207b(String str, ReactApplicationContext reactApplicationContext) {
            this.f11386a = str;
            this.f11387b = reactApplicationContext;
        }

        @Override // javax.inject.Provider
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public NativeModule get() {
            return AbstractC0794b.this.getModule(this.f11386a, this.f11387b);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Iterator d(Iterator it, ReactApplicationContext reactApplicationContext) {
        return new a(it, reactApplicationContext);
    }

    @Override // com.facebook.react.M
    public List<NativeModule> createNativeModules(ReactApplicationContext reactApplicationContext) {
        throw new UnsupportedOperationException("createNativeModules method is not supported. Use getModule() method instead.");
    }

    @Override // com.facebook.react.M
    public List<ViewManager> createViewManagers(ReactApplicationContext reactApplicationContext) {
        List viewManagers = getViewManagers(reactApplicationContext);
        if (viewManagers == null || viewManagers.isEmpty()) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = viewManagers.iterator();
        while (it.hasNext()) {
            arrayList.add((ViewManager) ((ModuleSpec) it.next()).getProvider().get());
        }
        return arrayList;
    }

    @Override // com.facebook.react.M
    public abstract NativeModule getModule(String str, ReactApplicationContext reactApplicationContext);

    Iterable<ModuleHolder> getNativeModuleIterator(final ReactApplicationContext reactApplicationContext) {
        final Iterator it = getReactModuleInfoProvider().a().entrySet().iterator();
        return new Iterable() { // from class: com.facebook.react.a
            @Override // java.lang.Iterable
            public final Iterator iterator() {
                return this.f11166m.d(it, reactApplicationContext);
            }
        };
    }

    public abstract InterfaceC1778a getReactModuleInfoProvider();

    protected List getViewManagers(ReactApplicationContext reactApplicationContext) {
        return Collections.emptyList();
    }
}
