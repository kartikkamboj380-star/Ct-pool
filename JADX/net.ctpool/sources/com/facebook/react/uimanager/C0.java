package com.facebook.react.uimanager;

import android.view.View;
import com.facebook.react.uimanager.I0;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public abstract class C0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Map f12267a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Map f12268b = new HashMap();

    private static class a implements d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Map f12269a;

        private a(Class cls) {
            this.f12269a = I0.h(cls);
        }

        @Override // com.facebook.react.uimanager.C0.c
        public void a(Map map) {
            for (I0.m mVar : this.f12269a.values()) {
                map.put(mVar.a(), mVar.b());
            }
        }

        @Override // com.facebook.react.uimanager.C0.d
        public void c(U u6, String str, Object obj) {
            I0.m mVar = (I0.m) this.f12269a.get(str);
            if (mVar != null) {
                mVar.d(u6, obj);
            }
        }
    }

    private static class b implements e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Map f12270a;

        private b(Class cls) {
            this.f12270a = I0.i(cls);
        }

        @Override // com.facebook.react.uimanager.C0.c
        public void a(Map map) {
            for (I0.m mVar : this.f12270a.values()) {
                map.put(mVar.a(), mVar.b());
            }
        }

        @Override // com.facebook.react.uimanager.C0.e
        public void b(ViewManager viewManager, View view, String str, Object obj) {
            I0.m mVar = (I0.m) this.f12270a.get(str);
            if (mVar != null) {
                mVar.e(viewManager, view, obj);
            }
        }
    }

    public interface c {
        void a(Map map);
    }

    public interface d extends c {
        void c(U u6, String str, Object obj);
    }

    public interface e extends c {
        void b(ViewManager viewManager, View view, String str, Object obj);
    }

    public static void a() {
        I0.b();
        f12267a.clear();
        f12268b.clear();
    }

    private static Object b(Class cls) {
        String name = cls.getName();
        try {
            return Class.forName(name + "$$PropsSetter").newInstance();
        } catch (ClassNotFoundException unused) {
            P0.a.G("ViewManagerPropertyUpdater", "Could not find generated setter for " + cls);
            return null;
        } catch (IllegalAccessException e7) {
            e = e7;
            throw new RuntimeException("Unable to instantiate methods getter for " + name, e);
        } catch (InstantiationException e8) {
            e = e8;
            throw new RuntimeException("Unable to instantiate methods getter for " + name, e);
        }
    }

    private static e c(Class cls) {
        Map map = f12267a;
        e bVar = (e) map.get(cls);
        if (bVar == null) {
            bVar = (e) b(cls);
            if (bVar == null) {
                bVar = new b(cls);
            }
            map.put(cls, bVar);
        }
        return bVar;
    }

    private static d d(Class cls) {
        Map map = f12268b;
        d aVar = (d) map.get(cls);
        if (aVar == null) {
            aVar = (d) b(cls);
            if (aVar == null) {
                aVar = new a(cls);
            }
            map.put(cls, aVar);
        }
        return aVar;
    }

    public static Map e(Class cls, Class cls2) {
        HashMap map = new HashMap();
        c(cls).a(map);
        d(cls2).a(map);
        return map;
    }

    public static void f(U u6, W w6) {
        d dVarD = d(u6.getClass());
        Iterator<Map.Entry<String, Object>> entryIterator = w6.f12479a.getEntryIterator();
        while (entryIterator.hasNext()) {
            Map.Entry<String, Object> next = entryIterator.next();
            dVarD.c(u6, next.getKey(), next.getValue());
        }
    }

    public static void g(ViewManager viewManager, View view, W w6) {
        e eVarC = c(viewManager.getClass());
        Iterator<Map.Entry<String, Object>> entryIterator = w6.f12479a.getEntryIterator();
        while (entryIterator.hasNext()) {
            Map.Entry<String, Object> next = entryIterator.next();
            eVarC.b(viewManager, view, next.getKey(), next.getValue());
        }
    }

    public static void h(A0 a02, View view, W w6) {
        Iterator<Map.Entry<String, Object>> entryIterator = w6.f12479a.getEntryIterator();
        while (entryIterator.hasNext()) {
            Map.Entry<String, Object> next = entryIterator.next();
            a02.b(view, next.getKey(), next.getValue());
        }
    }
}
