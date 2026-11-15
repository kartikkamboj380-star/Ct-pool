package com.facebook.react.defaults;

import com.facebook.jni.HybridData;
import com.facebook.react.T;
import com.facebook.react.bridge.ReactApplicationContext;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import v5.l;
import w5.k;

/* JADX INFO: loaded from: classes.dex */
public final class DefaultTurboModuleManagerDelegate extends T {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final b f11452f = new b(null);

    public static final class a extends T.a {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private List f11453c = new ArrayList();

        public final a e(l lVar) {
            k.f(lVar, "provider");
            this.f11453c.add(lVar);
            return this;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.facebook.react.T.a
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public DefaultTurboModuleManagerDelegate b(ReactApplicationContext reactApplicationContext, List list) {
            k.f(reactApplicationContext, "context");
            k.f(list, "packages");
            ArrayList arrayList = new ArrayList();
            Iterator it = this.f11453c.iterator();
            while (it.hasNext()) {
                arrayList.add(((l) it.next()).i(reactApplicationContext));
            }
            return new DefaultTurboModuleManagerDelegate(reactApplicationContext, list, arrayList, null);
        }
    }

    private static final class b {
        private b() {
        }

        @R1.a
        public final HybridData initHybrid(List<Object> list) {
            return DefaultTurboModuleManagerDelegate.initHybrid(list);
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        d.f11459a.a();
    }

    private DefaultTurboModuleManagerDelegate(ReactApplicationContext reactApplicationContext, List list, List list2) {
        super(reactApplicationContext, list, f11452f.initHybrid(list2));
    }

    @R1.a
    public static final native HybridData initHybrid(List<Object> list);

    @Override // com.facebook.react.internal.turbomodule.core.TurboModuleManagerDelegate
    protected HybridData initHybrid() {
        throw new UnsupportedOperationException("DefaultTurboModuleManagerDelegate.initHybrid() must never be called!");
    }

    public /* synthetic */ DefaultTurboModuleManagerDelegate(ReactApplicationContext reactApplicationContext, List list, List list2, DefaultConstructorMarker defaultConstructorMarker) {
        this(reactApplicationContext, list, list2);
    }
}
