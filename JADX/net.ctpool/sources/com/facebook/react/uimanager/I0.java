package com.facebook.react.uimanager;

import android.content.Context;
import android.view.View;
import com.facebook.react.bridge.ColorPropConverter;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.DynamicFromObject;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import x2.InterfaceC2218a;
import x2.InterfaceC2219b;

/* JADX INFO: loaded from: classes.dex */
abstract class I0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Map f12420a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Map f12421b = new HashMap();

    class a extends ThreadLocal {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f12422a;

        a(int i7) {
            this.f12422a = i7;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Object[] initialValue() {
            return new Object[this.f12422a];
        }
    }

    private static class b extends m {
        public b(InterfaceC2218a interfaceC2218a, Method method) {
            super(interfaceC2218a, "Array", method);
        }

        @Override // com.facebook.react.uimanager.I0.m
        protected Object c(Object obj, Context context) {
            return (ReadableArray) obj;
        }
    }

    private static class c extends m {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private final boolean f12423i;

        public c(InterfaceC2218a interfaceC2218a, Method method, boolean z6) {
            super(interfaceC2218a, "boolean", method);
            this.f12423i = z6;
        }

        @Override // com.facebook.react.uimanager.I0.m
        protected Object c(Object obj, Context context) {
            return obj == null ? this.f12423i : ((Boolean) obj).booleanValue() ? Boolean.TRUE : Boolean.FALSE;
        }
    }

    private static class d extends m {
        public d(InterfaceC2218a interfaceC2218a, Method method) {
            super(interfaceC2218a, "boolean", method);
        }

        @Override // com.facebook.react.uimanager.I0.m
        protected Object c(Object obj, Context context) {
            if (obj != null) {
                return ((Boolean) obj).booleanValue() ? Boolean.TRUE : Boolean.FALSE;
            }
            return null;
        }
    }

    private static class e extends m {
        public e(InterfaceC2218a interfaceC2218a, Method method) {
            super(interfaceC2218a, "mixed", method);
        }

        @Override // com.facebook.react.uimanager.I0.m
        protected Object c(Object obj, Context context) {
            if (obj != null) {
                return ColorPropConverter.getColor(obj, context);
            }
            return null;
        }

        public e(InterfaceC2219b interfaceC2219b, Method method, int i7) {
            super(interfaceC2219b, "mixed", method, i7);
        }
    }

    private static class f extends m {
        public f(InterfaceC2218a interfaceC2218a, Method method) {
            super(interfaceC2218a, "number", method);
        }

        @Override // com.facebook.react.uimanager.I0.m
        protected Object c(Object obj, Context context) {
            if (obj != null) {
                return obj instanceof Double ? Integer.valueOf(((Double) obj).intValue()) : (Integer) obj;
            }
            return null;
        }

        public f(InterfaceC2219b interfaceC2219b, Method method, int i7) {
            super(interfaceC2219b, "number", method, i7);
        }
    }

    private static class g extends m {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private final int f12424i;

        public g(InterfaceC2218a interfaceC2218a, Method method, int i7) {
            super(interfaceC2218a, "mixed", method);
            this.f12424i = i7;
        }

        @Override // com.facebook.react.uimanager.I0.m
        protected Object c(Object obj, Context context) {
            return obj == null ? Integer.valueOf(this.f12424i) : ColorPropConverter.getColor(obj, context);
        }

        public g(InterfaceC2219b interfaceC2219b, Method method, int i7, int i8) {
            super(interfaceC2219b, "mixed", method, i7);
            this.f12424i = i8;
        }
    }

    private static class h extends m {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private final double f12425i;

        public h(InterfaceC2218a interfaceC2218a, Method method, double d7) {
            super(interfaceC2218a, "number", method);
            this.f12425i = d7;
        }

        @Override // com.facebook.react.uimanager.I0.m
        protected Object c(Object obj, Context context) {
            return Double.valueOf(obj == null ? this.f12425i : ((Double) obj).doubleValue());
        }

        public h(InterfaceC2219b interfaceC2219b, Method method, int i7, double d7) {
            super(interfaceC2219b, "number", method, i7);
            this.f12425i = d7;
        }
    }

    private static class i extends m {
        public i(InterfaceC2218a interfaceC2218a, Method method) {
            super(interfaceC2218a, "mixed", method);
        }

        @Override // com.facebook.react.uimanager.I0.m
        protected Object c(Object obj, Context context) {
            return obj instanceof Dynamic ? obj : new DynamicFromObject(obj);
        }

        public i(InterfaceC2219b interfaceC2219b, Method method, int i7) {
            super(interfaceC2219b, "mixed", method, i7);
        }
    }

    private static class j extends m {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private final float f12426i;

        public j(InterfaceC2218a interfaceC2218a, Method method, float f7) {
            super(interfaceC2218a, "number", method);
            this.f12426i = f7;
        }

        @Override // com.facebook.react.uimanager.I0.m
        protected Object c(Object obj, Context context) {
            return Float.valueOf(obj == null ? this.f12426i : ((Double) obj).floatValue());
        }

        public j(InterfaceC2219b interfaceC2219b, Method method, int i7, float f7) {
            super(interfaceC2219b, "number", method, i7);
            this.f12426i = f7;
        }
    }

    private static class k extends m {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private final int f12427i;

        public k(InterfaceC2218a interfaceC2218a, Method method, int i7) {
            super(interfaceC2218a, "number", method);
            this.f12427i = i7;
        }

        @Override // com.facebook.react.uimanager.I0.m
        protected Object c(Object obj, Context context) {
            return Integer.valueOf(obj == null ? this.f12427i : ((Double) obj).intValue());
        }

        public k(InterfaceC2219b interfaceC2219b, Method method, int i7, int i8) {
            super(interfaceC2219b, "number", method, i7);
            this.f12427i = i8;
        }
    }

    private static class l extends m {
        public l(InterfaceC2218a interfaceC2218a, Method method) {
            super(interfaceC2218a, "Map", method);
        }

        @Override // com.facebook.react.uimanager.I0.m
        protected Object c(Object obj, Context context) {
            return (ReadableMap) obj;
        }
    }

    private static class n extends m {
        public n(InterfaceC2218a interfaceC2218a, Method method) {
            super(interfaceC2218a, "String", method);
        }

        @Override // com.facebook.react.uimanager.I0.m
        protected Object c(Object obj, Context context) {
            return (String) obj;
        }
    }

    public static void b() {
        f12420a.clear();
        f12421b.clear();
    }

    private static m c(InterfaceC2218a interfaceC2218a, Method method, Class cls) {
        if (cls == Dynamic.class) {
            return new i(interfaceC2218a, method);
        }
        if (cls == Boolean.TYPE) {
            return new c(interfaceC2218a, method, interfaceC2218a.defaultBoolean());
        }
        if (cls == Integer.TYPE) {
            return "Color".equals(interfaceC2218a.customType()) ? new g(interfaceC2218a, method, interfaceC2218a.defaultInt()) : new k(interfaceC2218a, method, interfaceC2218a.defaultInt());
        }
        if (cls == Float.TYPE) {
            return new j(interfaceC2218a, method, interfaceC2218a.defaultFloat());
        }
        if (cls == Double.TYPE) {
            return new h(interfaceC2218a, method, interfaceC2218a.defaultDouble());
        }
        if (cls == String.class) {
            return new n(interfaceC2218a, method);
        }
        if (cls == Boolean.class) {
            return new d(interfaceC2218a, method);
        }
        if (cls == Integer.class) {
            return "Color".equals(interfaceC2218a.customType()) ? new e(interfaceC2218a, method) : new f(interfaceC2218a, method);
        }
        if (cls == ReadableArray.class) {
            return new b(interfaceC2218a, method);
        }
        if (cls == ReadableMap.class) {
            return new l(interfaceC2218a, method);
        }
        throw new RuntimeException("Unrecognized type: " + cls + " for method: " + method.getDeclaringClass().getName() + "#" + method.getName());
    }

    private static void d(InterfaceC2219b interfaceC2219b, Method method, Class cls, Map map) {
        String str;
        m fVar;
        String str2;
        m kVar;
        String[] strArrNames = interfaceC2219b.names();
        int i7 = 0;
        if (cls == Dynamic.class) {
            while (i7 < strArrNames.length) {
                map.put(strArrNames[i7], new i(interfaceC2219b, method, i7));
                i7++;
            }
            return;
        }
        if (cls == Integer.TYPE) {
            while (i7 < strArrNames.length) {
                if ("Color".equals(interfaceC2219b.customType())) {
                    str2 = strArrNames[i7];
                    kVar = new g(interfaceC2219b, method, i7, interfaceC2219b.defaultInt());
                } else {
                    str2 = strArrNames[i7];
                    kVar = new k(interfaceC2219b, method, i7, interfaceC2219b.defaultInt());
                }
                map.put(str2, kVar);
                i7++;
            }
            return;
        }
        if (cls == Float.TYPE) {
            while (i7 < strArrNames.length) {
                map.put(strArrNames[i7], new j(interfaceC2219b, method, i7, interfaceC2219b.defaultFloat()));
                i7++;
            }
            return;
        }
        if (cls == Double.TYPE) {
            while (i7 < strArrNames.length) {
                map.put(strArrNames[i7], new h(interfaceC2219b, method, i7, interfaceC2219b.defaultDouble()));
                i7++;
            }
            return;
        }
        if (cls != Integer.class) {
            throw new RuntimeException("Unrecognized type: " + cls + " for method: " + method.getDeclaringClass().getName() + "#" + method.getName());
        }
        while (i7 < strArrNames.length) {
            if ("Color".equals(interfaceC2219b.customType())) {
                str = strArrNames[i7];
                fVar = new e(interfaceC2219b, method, i7);
            } else {
                str = strArrNames[i7];
                fVar = new f(interfaceC2219b, method, i7);
            }
            map.put(str, fVar);
            i7++;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static ThreadLocal e(int i7) {
        if (i7 <= 0) {
            return null;
        }
        return new a(i7);
    }

    private static void f(Class cls, Map map) {
        for (Method method : cls.getDeclaredMethods()) {
            InterfaceC2218a interfaceC2218a = (InterfaceC2218a) method.getAnnotation(InterfaceC2218a.class);
            if (interfaceC2218a != null) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length != 1) {
                    throw new RuntimeException("Wrong number of args for prop setter: " + cls.getName() + "#" + method.getName());
                }
                map.put(interfaceC2218a.name(), c(interfaceC2218a, method, parameterTypes[0]));
            }
            InterfaceC2219b interfaceC2219b = (InterfaceC2219b) method.getAnnotation(InterfaceC2219b.class);
            if (interfaceC2219b != null) {
                Class<?>[] parameterTypes2 = method.getParameterTypes();
                if (parameterTypes2.length != 2) {
                    throw new RuntimeException("Wrong number of args for group prop setter: " + cls.getName() + "#" + method.getName());
                }
                if (parameterTypes2[0] != Integer.TYPE) {
                    throw new RuntimeException("Second argument should be property index: " + cls.getName() + "#" + method.getName());
                }
                d(interfaceC2219b, method, parameterTypes2[1], map);
            }
        }
    }

    private static void g(Class cls, Map map) {
        for (Method method : cls.getDeclaredMethods()) {
            InterfaceC2218a interfaceC2218a = (InterfaceC2218a) method.getAnnotation(InterfaceC2218a.class);
            if (interfaceC2218a != null) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length != 2) {
                    throw new RuntimeException("Wrong number of args for prop setter: " + cls.getName() + "#" + method.getName());
                }
                if (!View.class.isAssignableFrom(parameterTypes[0])) {
                    throw new RuntimeException("First param should be a view subclass to be updated: " + cls.getName() + "#" + method.getName());
                }
                map.put(interfaceC2218a.name(), c(interfaceC2218a, method, parameterTypes[1]));
            }
            InterfaceC2219b interfaceC2219b = (InterfaceC2219b) method.getAnnotation(InterfaceC2219b.class);
            if (interfaceC2219b != null) {
                Class<?>[] parameterTypes2 = method.getParameterTypes();
                if (parameterTypes2.length != 3) {
                    throw new RuntimeException("Wrong number of args for group prop setter: " + cls.getName() + "#" + method.getName());
                }
                if (!View.class.isAssignableFrom(parameterTypes2[0])) {
                    throw new RuntimeException("First param should be a view subclass to be updated: " + cls.getName() + "#" + method.getName());
                }
                if (parameterTypes2[1] != Integer.TYPE) {
                    throw new RuntimeException("Second argument should be property index: " + cls.getName() + "#" + method.getName());
                }
                d(interfaceC2219b, method, parameterTypes2[2], map);
            }
        }
    }

    static Map h(Class cls) {
        if (cls == null) {
            return f12421b;
        }
        for (Class<?> cls2 : cls.getInterfaces()) {
            if (cls2 == U.class) {
                return f12421b;
            }
        }
        Map map = f12420a;
        Map map2 = (Map) map.get(cls);
        if (map2 != null) {
            return map2;
        }
        HashMap map3 = new HashMap(h(cls.getSuperclass()));
        f(cls, map3);
        map.put(cls, map3);
        return map3;
    }

    static Map i(Class cls) {
        if (cls == ViewManager.class) {
            return f12421b;
        }
        Map map = f12420a;
        Map map2 = (Map) map.get(cls);
        if (map2 != null) {
            return map2;
        }
        HashMap map3 = new HashMap(i(cls.getSuperclass()));
        g(cls, map3);
        map.put(cls, map3);
        return map3;
    }

    static abstract class m {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final ThreadLocal f12428e = I0.e(2);

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final ThreadLocal f12429f = I0.e(3);

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static final ThreadLocal f12430g = I0.e(1);

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static final ThreadLocal f12431h = I0.e(2);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        protected final String f12432a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        protected final String f12433b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        protected final Method f12434c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        protected final Integer f12435d;

        private m(InterfaceC2218a interfaceC2218a, String str, Method method) {
            this.f12432a = interfaceC2218a.name();
            this.f12433b = "__default_type__".equals(interfaceC2218a.customType()) ? str : interfaceC2218a.customType();
            this.f12434c = method;
            this.f12435d = null;
        }

        public String a() {
            return this.f12432a;
        }

        public String b() {
            return this.f12433b;
        }

        protected abstract Object c(Object obj, Context context);

        public void d(U u6, Object obj) {
            Object[] objArr;
            try {
                if (this.f12435d == null) {
                    objArr = (Object[]) f12430g.get();
                    objArr[0] = c(obj, u6.G());
                } else {
                    objArr = (Object[]) f12431h.get();
                    objArr[0] = this.f12435d;
                    objArr[1] = c(obj, u6.G());
                }
                this.f12434c.invoke(u6, objArr);
                Arrays.fill(objArr, (Object) null);
            } catch (Throwable th) {
                P0.a.g(ViewManager.class, "Error while updating prop " + this.f12432a, th);
                throw new JSApplicationIllegalArgumentException("Error while updating property '" + this.f12432a + "' in shadow node of type: " + u6.N(), th);
            }
        }

        public void e(ViewManager viewManager, View view, Object obj) {
            Object[] objArr;
            try {
                if (this.f12435d == null) {
                    objArr = (Object[]) f12428e.get();
                    objArr[0] = view;
                    objArr[1] = c(obj, view.getContext());
                } else {
                    objArr = (Object[]) f12429f.get();
                    objArr[0] = view;
                    objArr[1] = this.f12435d;
                    objArr[2] = c(obj, view.getContext());
                }
                this.f12434c.invoke(viewManager, objArr);
                Arrays.fill(objArr, (Object) null);
            } catch (Throwable th) {
                P0.a.g(ViewManager.class, "Error while updating prop " + this.f12432a, th);
                throw new JSApplicationIllegalArgumentException("Error while updating property '" + this.f12432a + "' of a view managed by: " + viewManager.getName(), th);
            }
        }

        private m(InterfaceC2219b interfaceC2219b, String str, Method method, int i7) {
            this.f12432a = interfaceC2219b.names()[i7];
            this.f12433b = "__default_type__".equals(interfaceC2219b.customType()) ? str : interfaceC2219b.customType();
            this.f12434c = method;
            this.f12435d = Integer.valueOf(i7);
        }
    }
}
