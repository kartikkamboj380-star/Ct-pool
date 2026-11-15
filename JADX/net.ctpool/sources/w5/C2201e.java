package w5;

import j5.AbstractC1787F;
import j5.AbstractC1809n;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import u5.AbstractC2147a;
import v5.InterfaceC2171a;
import v5.InterfaceC2172b;

/* JADX INFO: renamed from: w5.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2201e implements D5.b, InterfaceC2200d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f22724b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Map f22725c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final HashMap f22726d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final HashMap f22727e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final HashMap f22728f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final Map f22729g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Class f22730a;

    /* JADX INFO: renamed from: w5.e$a */
    public static final class a {
        private a() {
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x003b, code lost:
        
            if (r2 == null) goto L13;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final String a(Class cls) {
            String strZ0;
            String str;
            k.f(cls, "jClass");
            String str2 = null;
            if (cls.isAnonymousClass()) {
                return null;
            }
            if (cls.isLocalClass()) {
                String simpleName = cls.getSimpleName();
                Method enclosingMethod = cls.getEnclosingMethod();
                if (enclosingMethod != null) {
                    k.c(simpleName);
                    strZ0 = F5.g.z0(simpleName, enclosingMethod.getName() + '$', null, 2, null);
                }
                Constructor<?> enclosingConstructor = cls.getEnclosingConstructor();
                k.c(simpleName);
                if (enclosingConstructor == null) {
                    return F5.g.y0(simpleName, '$', null, 2, null);
                }
                return F5.g.z0(simpleName, enclosingConstructor.getName() + '$', null, 2, null);
            }
            if (!cls.isArray()) {
                String str3 = (String) C2201e.f22729g.get(cls.getName());
                return str3 == null ? cls.getSimpleName() : str3;
            }
            Class<?> componentType = cls.getComponentType();
            strZ0 = "Array";
            if (componentType.isPrimitive() && (str = (String) C2201e.f22729g.get(componentType.getName())) != null) {
                str2 = str + "Array";
            }
            if (str2 != null) {
                return str2;
            }
            return strZ0;
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        List listK = AbstractC1809n.k(InterfaceC2171a.class, v5.l.class, v5.p.class, v5.q.class, v5.r.class, v5.s.class, v5.t.class, v5.u.class, v5.v.class, v5.w.class, InterfaceC2172b.class, v5.c.class, v5.d.class, v5.e.class, v5.f.class, v5.g.class, v5.h.class, v5.i.class, v5.j.class, v5.k.class, v5.m.class, v5.n.class, v5.o.class);
        ArrayList arrayList = new ArrayList(AbstractC1809n.q(listK, 10));
        int i7 = 0;
        for (Object obj : listK) {
            int i8 = i7 + 1;
            if (i7 < 0) {
                AbstractC1809n.p();
            }
            arrayList.add(i5.q.a((Class) obj, Integer.valueOf(i7)));
            i7 = i8;
        }
        f22725c = AbstractC1787F.o(arrayList);
        HashMap map = new HashMap();
        map.put("boolean", "kotlin.Boolean");
        map.put("char", "kotlin.Char");
        map.put("byte", "kotlin.Byte");
        map.put("short", "kotlin.Short");
        map.put("int", "kotlin.Int");
        map.put("float", "kotlin.Float");
        map.put("long", "kotlin.Long");
        map.put("double", "kotlin.Double");
        f22726d = map;
        HashMap map2 = new HashMap();
        map2.put("java.lang.Boolean", "kotlin.Boolean");
        map2.put("java.lang.Character", "kotlin.Char");
        map2.put("java.lang.Byte", "kotlin.Byte");
        map2.put("java.lang.Short", "kotlin.Short");
        map2.put("java.lang.Integer", "kotlin.Int");
        map2.put("java.lang.Float", "kotlin.Float");
        map2.put("java.lang.Long", "kotlin.Long");
        map2.put("java.lang.Double", "kotlin.Double");
        f22727e = map2;
        HashMap map3 = new HashMap();
        map3.put("java.lang.Object", "kotlin.Any");
        map3.put("java.lang.String", "kotlin.String");
        map3.put("java.lang.CharSequence", "kotlin.CharSequence");
        map3.put("java.lang.Throwable", "kotlin.Throwable");
        map3.put("java.lang.Cloneable", "kotlin.Cloneable");
        map3.put("java.lang.Number", "kotlin.Number");
        map3.put("java.lang.Comparable", "kotlin.Comparable");
        map3.put("java.lang.Enum", "kotlin.Enum");
        map3.put("java.lang.annotation.Annotation", "kotlin.Annotation");
        map3.put("java.lang.Iterable", "kotlin.collections.Iterable");
        map3.put("java.util.Iterator", "kotlin.collections.Iterator");
        map3.put("java.util.Collection", "kotlin.collections.Collection");
        map3.put("java.util.List", "kotlin.collections.List");
        map3.put("java.util.Set", "kotlin.collections.Set");
        map3.put("java.util.ListIterator", "kotlin.collections.ListIterator");
        map3.put("java.util.Map", "kotlin.collections.Map");
        map3.put("java.util.Map$Entry", "kotlin.collections.Map.Entry");
        map3.put("kotlin.jvm.internal.StringCompanionObject", "kotlin.String.Companion");
        map3.put("kotlin.jvm.internal.EnumCompanionObject", "kotlin.Enum.Companion");
        map3.putAll(map);
        map3.putAll(map2);
        Collection<String> collectionValues = map.values();
        k.e(collectionValues, "<get-values>(...)");
        for (String str : collectionValues) {
            StringBuilder sb = new StringBuilder();
            sb.append("kotlin.jvm.internal.");
            k.c(str);
            sb.append(F5.g.B0(str, '.', null, 2, null));
            sb.append("CompanionObject");
            i5.l lVarA = i5.q.a(sb.toString(), str + ".Companion");
            map3.put(lVarA.c(), lVarA.d());
        }
        for (Map.Entry entry : f22725c.entrySet()) {
            map3.put(((Class) entry.getKey()).getName(), "kotlin.Function" + ((Number) entry.getValue()).intValue());
        }
        f22728f = map3;
        LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC1787F.d(map3.size()));
        for (Map.Entry entry2 : map3.entrySet()) {
            linkedHashMap.put(entry2.getKey(), F5.g.B0((String) entry2.getValue(), '.', null, 2, null));
        }
        f22729g = linkedHashMap;
    }

    public C2201e(Class cls) {
        k.f(cls, "jClass");
        this.f22730a = cls;
    }

    @Override // D5.b
    public String a() {
        return f22724b.a(b());
    }

    @Override // w5.InterfaceC2200d
    public Class b() {
        return this.f22730a;
    }

    public boolean equals(Object obj) {
        return (obj instanceof C2201e) && k.b(AbstractC2147a.b(this), AbstractC2147a.b((D5.b) obj));
    }

    public int hashCode() {
        return AbstractC2147a.b(this).hashCode();
    }

    public String toString() {
        return b().toString() + " (Kotlin reflection is not available)";
    }
}
