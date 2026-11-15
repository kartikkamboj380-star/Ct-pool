package U4;

import R4.n;
import R4.q;
import R4.r;
import com.google.gson.reflect.TypeToken;
import java.io.IOException;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class j implements r {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final T4.c f3887m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final R4.c f3888n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final T4.d f3889o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final U4.e f3890p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final List f3891q;

    class a extends c {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ boolean f3892f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ Method f3893g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ boolean f3894h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ q f3895i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ R4.d f3896j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final /* synthetic */ TypeToken f3897k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        final /* synthetic */ boolean f3898l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        final /* synthetic */ boolean f3899m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(String str, Field field, boolean z6, boolean z7, boolean z8, Method method, boolean z9, q qVar, R4.d dVar, TypeToken typeToken, boolean z10, boolean z11) {
            super(str, field, z6, z7);
            this.f3892f = z8;
            this.f3893g = method;
            this.f3894h = z9;
            this.f3895i = qVar;
            this.f3896j = dVar;
            this.f3897k = typeToken;
            this.f3898l = z10;
            this.f3899m = z11;
        }

        @Override // U4.j.c
        void a(Y4.a aVar, int i7, Object[] objArr) {
            Object objB = this.f3895i.b(aVar);
            if (objB != null || !this.f3898l) {
                objArr[i7] = objB;
                return;
            }
            throw new R4.j("null is not allowed as value for record component '" + this.f3904c + "' of primitive type; at path " + aVar.F0());
        }

        @Override // U4.j.c
        void b(Y4.a aVar, Object obj) throws IllegalAccessException {
            Object objB = this.f3895i.b(aVar);
            if (objB == null && this.f3898l) {
                return;
            }
            if (this.f3892f) {
                j.c(obj, this.f3903b);
            } else if (this.f3899m) {
                throw new R4.g("Cannot set value of 'static final' " + W4.a.g(this.f3903b, false));
            }
            this.f3903b.set(obj, objB);
        }

        @Override // U4.j.c
        void c(Y4.c cVar, Object obj) throws IllegalAccessException {
            Object objInvoke;
            if (this.f3905d) {
                if (this.f3892f) {
                    AccessibleObject accessibleObject = this.f3893g;
                    if (accessibleObject == null) {
                        accessibleObject = this.f3903b;
                    }
                    j.c(obj, accessibleObject);
                }
                Method method = this.f3893g;
                if (method != null) {
                    try {
                        objInvoke = method.invoke(obj, null);
                    } catch (InvocationTargetException e7) {
                        throw new R4.g("Accessor " + W4.a.g(this.f3893g, false) + " threw exception", e7.getCause());
                    }
                } else {
                    objInvoke = this.f3903b.get(obj);
                }
                if (objInvoke == obj) {
                    return;
                }
                cVar.z(this.f3902a);
                (this.f3894h ? this.f3895i : new l(this.f3896j, this.f3895i, this.f3897k.getType())).d(cVar, objInvoke);
            }
        }
    }

    public static abstract class b extends q {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Map f3901a;

        b(Map map) {
            this.f3901a = map;
        }

        @Override // R4.q
        public Object b(Y4.a aVar) throws IOException {
            if (aVar.R0() == Y4.b.NULL) {
                aVar.B0();
                return null;
            }
            Object objE = e();
            try {
                aVar.b();
                while (aVar.w()) {
                    c cVar = (c) this.f3901a.get(aVar.j0());
                    if (cVar == null || !cVar.f3906e) {
                        aVar.n1();
                    } else {
                        g(objE, aVar, cVar);
                    }
                }
                aVar.j();
                return f(objE);
            } catch (IllegalAccessException e7) {
                throw W4.a.e(e7);
            } catch (IllegalStateException e8) {
                throw new R4.l(e8);
            }
        }

        @Override // R4.q
        public void d(Y4.c cVar, Object obj) throws IOException {
            if (obj == null) {
                cVar.J();
                return;
            }
            cVar.e();
            try {
                Iterator it = this.f3901a.values().iterator();
                while (it.hasNext()) {
                    ((c) it.next()).c(cVar, obj);
                }
                cVar.j();
            } catch (IllegalAccessException e7) {
                throw W4.a.e(e7);
            }
        }

        abstract Object e();

        abstract Object f(Object obj);

        abstract void g(Object obj, Y4.a aVar, c cVar);
    }

    static abstract class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final String f3902a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Field f3903b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final String f3904c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final boolean f3905d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final boolean f3906e;

        protected c(String str, Field field, boolean z6, boolean z7) {
            this.f3902a = str;
            this.f3903b = field;
            this.f3904c = field.getName();
            this.f3905d = z6;
            this.f3906e = z7;
        }

        abstract void a(Y4.a aVar, int i7, Object[] objArr);

        abstract void b(Y4.a aVar, Object obj);

        abstract void c(Y4.c cVar, Object obj);
    }

    private static final class e extends b {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        static final Map f3908e = j();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Constructor f3909b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Object[] f3910c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final Map f3911d;

        e(Class cls, Map map, boolean z6) {
            super(map);
            this.f3911d = new HashMap();
            Constructor constructorI = W4.a.i(cls);
            this.f3909b = constructorI;
            if (z6) {
                j.c(null, constructorI);
            } else {
                W4.a.l(constructorI);
            }
            String[] strArrJ = W4.a.j(cls);
            for (int i7 = 0; i7 < strArrJ.length; i7++) {
                this.f3911d.put(strArrJ[i7], Integer.valueOf(i7));
            }
            Class<?>[] parameterTypes = this.f3909b.getParameterTypes();
            this.f3910c = new Object[parameterTypes.length];
            for (int i8 = 0; i8 < parameterTypes.length; i8++) {
                this.f3910c[i8] = f3908e.get(parameterTypes[i8]);
            }
        }

        private static Map j() {
            HashMap map = new HashMap();
            map.put(Byte.TYPE, (byte) 0);
            map.put(Short.TYPE, (short) 0);
            map.put(Integer.TYPE, 0);
            map.put(Long.TYPE, 0L);
            map.put(Float.TYPE, Float.valueOf(0.0f));
            map.put(Double.TYPE, Double.valueOf(0.0d));
            map.put(Character.TYPE, (char) 0);
            map.put(Boolean.TYPE, Boolean.FALSE);
            return map;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // U4.j.b
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public Object[] e() {
            return (Object[]) this.f3910c.clone();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // U4.j.b
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public Object f(Object[] objArr) {
            try {
                return this.f3909b.newInstance(objArr);
            } catch (IllegalAccessException e7) {
                throw W4.a.e(e7);
            } catch (IllegalArgumentException e8) {
                e = e8;
                throw new RuntimeException("Failed to invoke constructor '" + W4.a.c(this.f3909b) + "' with args " + Arrays.toString(objArr), e);
            } catch (InstantiationException e9) {
                e = e9;
                throw new RuntimeException("Failed to invoke constructor '" + W4.a.c(this.f3909b) + "' with args " + Arrays.toString(objArr), e);
            } catch (InvocationTargetException e10) {
                throw new RuntimeException("Failed to invoke constructor '" + W4.a.c(this.f3909b) + "' with args " + Arrays.toString(objArr), e10.getCause());
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // U4.j.b
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public void g(Object[] objArr, Y4.a aVar, c cVar) {
            Integer num = (Integer) this.f3911d.get(cVar.f3904c);
            if (num != null) {
                cVar.a(aVar, num.intValue(), objArr);
                return;
            }
            throw new IllegalStateException("Could not find the index in the constructor '" + W4.a.c(this.f3909b) + "' for field with name '" + cVar.f3904c + "', unable to determine which argument in the constructor the field corresponds to. This is unexpected behavior, as we expect the RecordComponents to have the same names as the fields in the Java class, and that the order of the RecordComponents is the same as the order of the canonical constructor parameters.");
        }
    }

    public j(T4.c cVar, R4.c cVar2, T4.d dVar, U4.e eVar, List list) {
        this.f3887m = cVar;
        this.f3888n = cVar2;
        this.f3889o = dVar;
        this.f3890p = eVar;
        this.f3891q = list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static void c(Object obj, AccessibleObject accessibleObject) {
        if (Modifier.isStatic(((Member) accessibleObject).getModifiers())) {
            obj = null;
        }
        if (T4.l.a(accessibleObject, obj)) {
            return;
        }
        throw new R4.g(W4.a.g(accessibleObject, true) + " is not accessible and ReflectionAccessFilter does not permit making it accessible. Register a TypeAdapter for the declaring type, adjust the access filter or increase the visibility of the element and its declaring type.");
    }

    private c d(R4.d dVar, Field field, Method method, String str, TypeToken typeToken, boolean z6, boolean z7, boolean z8) {
        boolean zA = T4.k.a(typeToken.getRawType());
        int modifiers = field.getModifiers();
        boolean z9 = Modifier.isStatic(modifiers) && Modifier.isFinal(modifiers);
        S4.b bVar = (S4.b) field.getAnnotation(S4.b.class);
        q qVarB = bVar != null ? this.f3890p.b(this.f3887m, dVar, typeToken, bVar) : null;
        boolean z10 = qVarB != null;
        if (qVarB == null) {
            qVarB = dVar.k(typeToken);
        }
        return new a(str, field, z6, z7, z8, method, z10, qVarB, dVar, typeToken, zA, z9);
    }

    private Map e(R4.d dVar, TypeToken typeToken, Class cls, boolean z6, boolean z7) {
        boolean z8;
        Method method;
        int i7;
        int i8;
        boolean z9;
        j jVar = this;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (cls.isInterface()) {
            return linkedHashMap;
        }
        TypeToken typeToken2 = typeToken;
        boolean z10 = z6;
        Class rawType = cls;
        while (rawType != Object.class) {
            Field[] declaredFields = rawType.getDeclaredFields();
            boolean z11 = true;
            boolean z12 = false;
            if (rawType != cls && declaredFields.length > 0) {
                n nVarB = T4.l.b(jVar.f3891q, rawType);
                if (nVarB == n.BLOCK_ALL) {
                    throw new R4.g("ReflectionAccessFilter does not permit using reflection for " + rawType + " (supertype of " + cls + "). Register a TypeAdapter for this type or adjust the access filter.");
                }
                z10 = nVarB == n.BLOCK_INACCESSIBLE;
            }
            boolean z13 = z10;
            int length = declaredFields.length;
            int i9 = 0;
            while (i9 < length) {
                Field field = declaredFields[i9];
                boolean zG = jVar.g(field, z11);
                boolean zG2 = jVar.g(field, z12);
                if (zG || zG2) {
                    c cVar = null;
                    if (!z7) {
                        z8 = zG2;
                        method = null;
                    } else if (Modifier.isStatic(field.getModifiers())) {
                        method = null;
                        z8 = z12;
                    } else {
                        Method methodH = W4.a.h(rawType, field);
                        if (!z13) {
                            W4.a.l(methodH);
                        }
                        if (methodH.getAnnotation(S4.c.class) != null && field.getAnnotation(S4.c.class) == null) {
                            throw new R4.g("@SerializedName on " + W4.a.g(methodH, z12) + " is not supported");
                        }
                        z8 = zG2;
                        method = methodH;
                    }
                    if (!z13 && method == null) {
                        W4.a.l(field);
                    }
                    Type typeO = T4.b.o(typeToken2.getType(), rawType, field.getGenericType());
                    List listF = jVar.f(field);
                    int size = listF.size();
                    int i10 = z12;
                    while (i10 < size) {
                        String str = (String) listF.get(i10);
                        boolean z14 = i10 != 0 ? z12 : zG;
                        int i11 = i10;
                        c cVar2 = cVar;
                        int i12 = size;
                        List list = listF;
                        Field field2 = field;
                        int i13 = i9;
                        int i14 = length;
                        boolean z15 = z12;
                        cVar = cVar2 == null ? (c) linkedHashMap.put(str, d(dVar, field, method, str, TypeToken.get(typeO), z14, z8, z13)) : cVar2;
                        i10 = i11 + 1;
                        zG = z14;
                        i9 = i13;
                        size = i12;
                        listF = list;
                        field = field2;
                        length = i14;
                        z12 = z15;
                    }
                    c cVar3 = cVar;
                    Field field3 = field;
                    i7 = i9;
                    i8 = length;
                    z9 = z12;
                    if (cVar3 != null) {
                        throw new IllegalArgumentException("Class " + cls.getName() + " declares multiple JSON fields named '" + cVar3.f3902a + "'; conflict is caused by fields " + W4.a.f(cVar3.f3903b) + " and " + W4.a.f(field3));
                    }
                } else {
                    i7 = i9;
                    i8 = length;
                    z9 = z12;
                }
                i9 = i7 + 1;
                z11 = true;
                jVar = this;
                length = i8;
                z12 = z9;
            }
            typeToken2 = TypeToken.get(T4.b.o(typeToken2.getType(), rawType, rawType.getGenericSuperclass()));
            rawType = typeToken2.getRawType();
            jVar = this;
            z10 = z13;
        }
        return linkedHashMap;
    }

    private List f(Field field) {
        S4.c cVar = (S4.c) field.getAnnotation(S4.c.class);
        if (cVar == null) {
            return Collections.singletonList(this.f3888n.e(field));
        }
        String strValue = cVar.value();
        String[] strArrAlternate = cVar.alternate();
        if (strArrAlternate.length == 0) {
            return Collections.singletonList(strValue);
        }
        ArrayList arrayList = new ArrayList(strArrAlternate.length + 1);
        arrayList.add(strValue);
        Collections.addAll(arrayList, strArrAlternate);
        return arrayList;
    }

    private boolean g(Field field, boolean z6) {
        return (this.f3889o.c(field.getType(), z6) || this.f3889o.g(field, z6)) ? false : true;
    }

    @Override // R4.r
    public q a(R4.d dVar, TypeToken typeToken) {
        Class rawType = typeToken.getRawType();
        if (!Object.class.isAssignableFrom(rawType)) {
            return null;
        }
        n nVarB = T4.l.b(this.f3891q, rawType);
        if (nVarB != n.BLOCK_ALL) {
            boolean z6 = nVarB == n.BLOCK_INACCESSIBLE;
            return W4.a.k(rawType) ? new e(rawType, e(dVar, typeToken, rawType, z6, true), z6) : new d(this.f3887m.b(typeToken), e(dVar, typeToken, rawType, z6, false));
        }
        throw new R4.g("ReflectionAccessFilter does not permit using reflection for " + rawType + ". Register a TypeAdapter for this type or adjust the access filter.");
    }

    private static final class d extends b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final T4.i f3907b;

        d(T4.i iVar, Map map) {
            super(map);
            this.f3907b = iVar;
        }

        @Override // U4.j.b
        Object e() {
            return this.f3907b.a();
        }

        @Override // U4.j.b
        void g(Object obj, Y4.a aVar, c cVar) {
            cVar.b(aVar, obj);
        }

        @Override // U4.j.b
        Object f(Object obj) {
            return obj;
        }
    }
}
