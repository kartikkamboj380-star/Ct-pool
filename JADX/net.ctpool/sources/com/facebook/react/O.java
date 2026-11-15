package com.facebook.react;

import com.facebook.react.bridge.ModuleHolder;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
abstract class O {

    class a implements Iterator {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f11128m = 0;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ List f11129n;

        a(List list) {
            this.f11129n = list;
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public ModuleHolder next() {
            List list = this.f11129n;
            int i7 = this.f11128m;
            this.f11128m = i7 + 1;
            return new ModuleHolder((NativeModule) list.get(i7));
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f11128m < this.f11129n.size();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Cannot remove methods ");
        }
    }

    static Iterable b(M m7, ReactApplicationContext reactApplicationContext) {
        P0.a.b("ReactNative", m7.getClass().getSimpleName() + " is not a LazyReactPackage, falling back to old version.");
        final List listCreateNativeModules = m7.createNativeModules(reactApplicationContext);
        return new Iterable() { // from class: com.facebook.react.N
            @Override // java.lang.Iterable
            public final Iterator iterator() {
                return O.c(listCreateNativeModules);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Iterator c(List list) {
        return new a(list);
    }
}
