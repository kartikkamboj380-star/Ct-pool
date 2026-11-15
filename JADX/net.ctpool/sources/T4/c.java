package T4;

import androidx.appcompat.app.y;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ConcurrentNavigableMap;
import java.util.concurrent.ConcurrentSkipListMap;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f3215a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f3216b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List f3217c;

    class a implements T4.i {
        a() {
        }

        @Override // T4.i
        public Object a() {
            return new TreeSet();
        }
    }

    class b implements T4.i {
        b() {
        }

        @Override // T4.i
        public Object a() {
            return new LinkedHashSet();
        }
    }

    /* JADX INFO: renamed from: T4.c$c, reason: collision with other inner class name */
    class C0073c implements T4.i {
        C0073c() {
        }

        @Override // T4.i
        public Object a() {
            return new ArrayDeque();
        }
    }

    class d implements T4.i {
        d() {
        }

        @Override // T4.i
        public Object a() {
            return new ArrayList();
        }
    }

    class e implements T4.i {
        e() {
        }

        @Override // T4.i
        public Object a() {
            return new ConcurrentSkipListMap();
        }
    }

    class f implements T4.i {
        f() {
        }

        @Override // T4.i
        public Object a() {
            return new ConcurrentHashMap();
        }
    }

    class g implements T4.i {
        g() {
        }

        @Override // T4.i
        public Object a() {
            return new TreeMap();
        }
    }

    class h implements T4.i {
        h() {
        }

        @Override // T4.i
        public Object a() {
            return new LinkedHashMap();
        }
    }

    class i implements T4.i {
        i() {
        }

        @Override // T4.i
        public Object a() {
            return new T4.h();
        }
    }

    class j implements T4.i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Class f3218a;

        j(Class cls) {
            this.f3218a = cls;
        }

        @Override // T4.i
        public Object a() {
            try {
                return T4.n.f3279a.d(this.f3218a);
            } catch (Exception e7) {
                throw new RuntimeException("Unable to create instance of " + this.f3218a + ". Registering an InstanceCreator or a TypeAdapter for this type, or adding a no-args constructor may fix this problem.", e7);
            }
        }
    }

    class k implements T4.i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f3220a;

        k(String str) {
            this.f3220a = str;
        }

        @Override // T4.i
        public Object a() {
            throw new R4.g(this.f3220a);
        }
    }

    class l implements T4.i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f3222a;

        l(String str) {
            this.f3222a = str;
        }

        @Override // T4.i
        public Object a() {
            throw new R4.g(this.f3222a);
        }
    }

    class m implements T4.i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f3224a;

        m(String str) {
            this.f3224a = str;
        }

        @Override // T4.i
        public Object a() {
            throw new R4.g(this.f3224a);
        }
    }

    class n implements T4.i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Type f3226a;

        n(Type type) {
            this.f3226a = type;
        }

        @Override // T4.i
        public Object a() {
            Type type = this.f3226a;
            if (!(type instanceof ParameterizedType)) {
                throw new R4.g("Invalid EnumSet type: " + this.f3226a.toString());
            }
            Type type2 = ((ParameterizedType) type).getActualTypeArguments()[0];
            if (type2 instanceof Class) {
                return EnumSet.noneOf((Class) type2);
            }
            throw new R4.g("Invalid EnumSet type: " + this.f3226a.toString());
        }
    }

    class o implements T4.i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Type f3227a;

        o(Type type) {
            this.f3227a = type;
        }

        @Override // T4.i
        public Object a() {
            Type type = this.f3227a;
            if (!(type instanceof ParameterizedType)) {
                throw new R4.g("Invalid EnumMap type: " + this.f3227a.toString());
            }
            Type type2 = ((ParameterizedType) type).getActualTypeArguments()[0];
            if (type2 instanceof Class) {
                return new EnumMap((Class) type2);
            }
            throw new R4.g("Invalid EnumMap type: " + this.f3227a.toString());
        }
    }

    class p implements T4.i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f3228a;

        p(String str) {
            this.f3228a = str;
        }

        @Override // T4.i
        public Object a() {
            throw new R4.g(this.f3228a);
        }
    }

    class q implements T4.i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f3229a;

        q(String str) {
            this.f3229a = str;
        }

        @Override // T4.i
        public Object a() {
            throw new R4.g(this.f3229a);
        }
    }

    class r implements T4.i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Constructor f3230a;

        r(Constructor constructor) {
            this.f3230a = constructor;
        }

        @Override // T4.i
        public Object a() {
            try {
                return this.f3230a.newInstance(null);
            } catch (IllegalAccessException e7) {
                throw W4.a.e(e7);
            } catch (InstantiationException e8) {
                throw new RuntimeException("Failed to invoke constructor '" + W4.a.c(this.f3230a) + "' with no args", e8);
            } catch (InvocationTargetException e9) {
                throw new RuntimeException("Failed to invoke constructor '" + W4.a.c(this.f3230a) + "' with no args", e9.getCause());
            }
        }
    }

    public c(Map map, boolean z6, List list) {
        this.f3215a = map;
        this.f3216b = z6;
        this.f3217c = list;
    }

    static String a(Class cls) {
        StringBuilder sb;
        String str;
        int modifiers = cls.getModifiers();
        if (Modifier.isInterface(modifiers)) {
            sb = new StringBuilder();
            str = "Interfaces can't be instantiated! Register an InstanceCreator or a TypeAdapter for this type. Interface name: ";
        } else {
            if (!Modifier.isAbstract(modifiers)) {
                return null;
            }
            sb = new StringBuilder();
            str = "Abstract classes can't be instantiated! Register an InstanceCreator or a TypeAdapter for this type. Class name: ";
        }
        sb.append(str);
        sb.append(cls.getName());
        return sb.toString();
    }

    private static T4.i c(Class cls, R4.n nVar) {
        String strM;
        if (Modifier.isAbstract(cls.getModifiers())) {
            return null;
        }
        try {
            Constructor declaredConstructor = cls.getDeclaredConstructor(null);
            R4.n nVar2 = R4.n.ALLOW;
            if (nVar == nVar2 || (T4.l.a(declaredConstructor, null) && (nVar != R4.n.BLOCK_ALL || Modifier.isPublic(declaredConstructor.getModifiers())))) {
                return (nVar != nVar2 || (strM = W4.a.m(declaredConstructor)) == null) ? new r(declaredConstructor) : new q(strM);
            }
            return new p("Unable to invoke no-args constructor of " + cls + "; constructor is not accessible and ReflectionAccessFilter does not permit making it accessible. Register an InstanceCreator or a TypeAdapter for this type, change the visibility of the constructor or adjust the access filter.");
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    private static T4.i d(Type type, Class cls) {
        if (Collection.class.isAssignableFrom(cls)) {
            return SortedSet.class.isAssignableFrom(cls) ? new a() : Set.class.isAssignableFrom(cls) ? new b() : Queue.class.isAssignableFrom(cls) ? new C0073c() : new d();
        }
        if (Map.class.isAssignableFrom(cls)) {
            return ConcurrentNavigableMap.class.isAssignableFrom(cls) ? new e() : ConcurrentMap.class.isAssignableFrom(cls) ? new f() : SortedMap.class.isAssignableFrom(cls) ? new g() : (!(type instanceof ParameterizedType) || String.class.isAssignableFrom(TypeToken.get(((ParameterizedType) type).getActualTypeArguments()[0]).getRawType())) ? new i() : new h();
        }
        return null;
    }

    private static T4.i e(Type type, Class cls) {
        if (EnumSet.class.isAssignableFrom(cls)) {
            return new n(type);
        }
        if (cls == EnumMap.class) {
            return new o(type);
        }
        return null;
    }

    private T4.i f(Class cls) {
        if (this.f3216b) {
            return new j(cls);
        }
        return new k("Unable to create instance of " + cls + "; usage of JDK Unsafe is disabled. Registering an InstanceCreator or a TypeAdapter for this type, adding a no-args constructor, or enabling usage of JDK Unsafe may fix this problem.");
    }

    public T4.i b(TypeToken typeToken) {
        Type type = typeToken.getType();
        Class rawType = typeToken.getRawType();
        y.a(this.f3215a.get(type));
        y.a(this.f3215a.get(rawType));
        T4.i iVarE = e(type, rawType);
        if (iVarE != null) {
            return iVarE;
        }
        R4.n nVarB = T4.l.b(this.f3217c, rawType);
        T4.i iVarC = c(rawType, nVarB);
        if (iVarC != null) {
            return iVarC;
        }
        T4.i iVarD = d(type, rawType);
        if (iVarD != null) {
            return iVarD;
        }
        String strA = a(rawType);
        if (strA != null) {
            return new l(strA);
        }
        if (nVarB == R4.n.ALLOW) {
            return f(rawType);
        }
        return new m("Unable to create instance of " + rawType + "; ReflectionAccessFilter does not permit using reflection or Unsafe. Register an InstanceCreator or a TypeAdapter for this type or adjust the access filter to allow using reflection.");
    }

    public String toString() {
        return this.f3215a.toString();
    }
}
