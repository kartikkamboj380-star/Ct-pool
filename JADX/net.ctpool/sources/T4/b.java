package T4;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Properties;

/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final Type[] f3208a = new Type[0];

    private static final class a implements GenericArrayType, Serializable {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private final Type f3209m;

        public a(Type type) {
            Objects.requireNonNull(type);
            this.f3209m = b.b(type);
        }

        public boolean equals(Object obj) {
            return (obj instanceof GenericArrayType) && b.f(this, (GenericArrayType) obj);
        }

        @Override // java.lang.reflect.GenericArrayType
        public Type getGenericComponentType() {
            return this.f3209m;
        }

        public int hashCode() {
            return this.f3209m.hashCode();
        }

        public String toString() {
            return b.t(this.f3209m) + "[]";
        }
    }

    /* JADX INFO: renamed from: T4.b$b, reason: collision with other inner class name */
    private static final class C0072b implements ParameterizedType, Serializable {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private final Type f3210m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final Type f3211n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private final Type[] f3212o;

        public C0072b(Type type, Type type2, Type... typeArr) {
            Objects.requireNonNull(type2);
            if (type2 instanceof Class) {
                Class cls = (Class) type2;
                boolean z6 = true;
                boolean z7 = Modifier.isStatic(cls.getModifiers()) || cls.getEnclosingClass() == null;
                if (type == null && !z7) {
                    z6 = false;
                }
                T4.a.a(z6);
            }
            this.f3210m = type == null ? null : b.b(type);
            this.f3211n = b.b(type2);
            Type[] typeArr2 = (Type[]) typeArr.clone();
            this.f3212o = typeArr2;
            int length = typeArr2.length;
            for (int i7 = 0; i7 < length; i7++) {
                Objects.requireNonNull(this.f3212o[i7]);
                b.c(this.f3212o[i7]);
                Type[] typeArr3 = this.f3212o;
                typeArr3[i7] = b.b(typeArr3[i7]);
            }
        }

        private static int a(Object obj) {
            if (obj != null) {
                return obj.hashCode();
            }
            return 0;
        }

        public boolean equals(Object obj) {
            return (obj instanceof ParameterizedType) && b.f(this, (ParameterizedType) obj);
        }

        @Override // java.lang.reflect.ParameterizedType
        public Type[] getActualTypeArguments() {
            return (Type[]) this.f3212o.clone();
        }

        @Override // java.lang.reflect.ParameterizedType
        public Type getOwnerType() {
            return this.f3210m;
        }

        @Override // java.lang.reflect.ParameterizedType
        public Type getRawType() {
            return this.f3211n;
        }

        public int hashCode() {
            return (Arrays.hashCode(this.f3212o) ^ this.f3211n.hashCode()) ^ a(this.f3210m);
        }

        public String toString() {
            int length = this.f3212o.length;
            if (length == 0) {
                return b.t(this.f3211n);
            }
            StringBuilder sb = new StringBuilder((length + 1) * 30);
            sb.append(b.t(this.f3211n));
            sb.append("<");
            sb.append(b.t(this.f3212o[0]));
            for (int i7 = 1; i7 < length; i7++) {
                sb.append(", ");
                sb.append(b.t(this.f3212o[i7]));
            }
            sb.append(">");
            return sb.toString();
        }
    }

    private static final class c implements WildcardType, Serializable {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private final Type f3213m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final Type f3214n;

        public c(Type[] typeArr, Type[] typeArr2) {
            T4.a.a(typeArr2.length <= 1);
            T4.a.a(typeArr.length == 1);
            if (typeArr2.length != 1) {
                Objects.requireNonNull(typeArr[0]);
                b.c(typeArr[0]);
                this.f3214n = null;
                this.f3213m = b.b(typeArr[0]);
                return;
            }
            Objects.requireNonNull(typeArr2[0]);
            b.c(typeArr2[0]);
            T4.a.a(typeArr[0] == Object.class);
            this.f3214n = b.b(typeArr2[0]);
            this.f3213m = Object.class;
        }

        public boolean equals(Object obj) {
            return (obj instanceof WildcardType) && b.f(this, (WildcardType) obj);
        }

        @Override // java.lang.reflect.WildcardType
        public Type[] getLowerBounds() {
            Type type = this.f3214n;
            return type != null ? new Type[]{type} : b.f3208a;
        }

        @Override // java.lang.reflect.WildcardType
        public Type[] getUpperBounds() {
            return new Type[]{this.f3213m};
        }

        public int hashCode() {
            Type type = this.f3214n;
            return (type != null ? type.hashCode() + 31 : 1) ^ (this.f3213m.hashCode() + 31);
        }

        public String toString() {
            StringBuilder sb;
            Type type;
            if (this.f3214n != null) {
                sb = new StringBuilder();
                sb.append("? super ");
                type = this.f3214n;
            } else {
                if (this.f3213m == Object.class) {
                    return "?";
                }
                sb = new StringBuilder();
                sb.append("? extends ");
                type = this.f3213m;
            }
            sb.append(b.t(type));
            return sb.toString();
        }
    }

    public static GenericArrayType a(Type type) {
        return new a(type);
    }

    public static Type b(Type type) {
        if (type instanceof Class) {
            Class cls = (Class) type;
            return cls.isArray() ? new a(b(cls.getComponentType())) : cls;
        }
        if (type instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) type;
            return new C0072b(parameterizedType.getOwnerType(), parameterizedType.getRawType(), parameterizedType.getActualTypeArguments());
        }
        if (type instanceof GenericArrayType) {
            return new a(((GenericArrayType) type).getGenericComponentType());
        }
        if (!(type instanceof WildcardType)) {
            return type;
        }
        WildcardType wildcardType = (WildcardType) type;
        return new c(wildcardType.getUpperBounds(), wildcardType.getLowerBounds());
    }

    static void c(Type type) {
        T4.a.a(((type instanceof Class) && ((Class) type).isPrimitive()) ? false : true);
    }

    private static Class d(TypeVariable typeVariable) {
        GenericDeclaration genericDeclaration = typeVariable.getGenericDeclaration();
        if (genericDeclaration instanceof Class) {
            return (Class) genericDeclaration;
        }
        return null;
    }

    private static boolean e(Object obj, Object obj2) {
        return Objects.equals(obj, obj2);
    }

    public static boolean f(Type type, Type type2) {
        if (type == type2) {
            return true;
        }
        if (type instanceof Class) {
            return type.equals(type2);
        }
        if (type instanceof ParameterizedType) {
            if (!(type2 instanceof ParameterizedType)) {
                return false;
            }
            ParameterizedType parameterizedType = (ParameterizedType) type;
            ParameterizedType parameterizedType2 = (ParameterizedType) type2;
            return e(parameterizedType.getOwnerType(), parameterizedType2.getOwnerType()) && parameterizedType.getRawType().equals(parameterizedType2.getRawType()) && Arrays.equals(parameterizedType.getActualTypeArguments(), parameterizedType2.getActualTypeArguments());
        }
        if (type instanceof GenericArrayType) {
            if (type2 instanceof GenericArrayType) {
                return f(((GenericArrayType) type).getGenericComponentType(), ((GenericArrayType) type2).getGenericComponentType());
            }
            return false;
        }
        if (type instanceof WildcardType) {
            if (!(type2 instanceof WildcardType)) {
                return false;
            }
            WildcardType wildcardType = (WildcardType) type;
            WildcardType wildcardType2 = (WildcardType) type2;
            return Arrays.equals(wildcardType.getUpperBounds(), wildcardType2.getUpperBounds()) && Arrays.equals(wildcardType.getLowerBounds(), wildcardType2.getLowerBounds());
        }
        if (!(type instanceof TypeVariable) || !(type2 instanceof TypeVariable)) {
            return false;
        }
        TypeVariable typeVariable = (TypeVariable) type;
        TypeVariable typeVariable2 = (TypeVariable) type2;
        return typeVariable.getGenericDeclaration() == typeVariable2.getGenericDeclaration() && typeVariable.getName().equals(typeVariable2.getName());
    }

    public static Type g(Type type) {
        return type instanceof GenericArrayType ? ((GenericArrayType) type).getGenericComponentType() : ((Class) type).getComponentType();
    }

    public static Type h(Type type, Class cls) {
        Type typeL = l(type, cls, Collection.class);
        return typeL instanceof ParameterizedType ? ((ParameterizedType) typeL).getActualTypeArguments()[0] : Object.class;
    }

    private static Type i(Type type, Class cls, Class cls2) {
        if (cls2 == cls) {
            return type;
        }
        if (cls2.isInterface()) {
            Class<?>[] interfaces = cls.getInterfaces();
            int length = interfaces.length;
            for (int i7 = 0; i7 < length; i7++) {
                Class<?> cls3 = interfaces[i7];
                if (cls3 == cls2) {
                    return cls.getGenericInterfaces()[i7];
                }
                if (cls2.isAssignableFrom(cls3)) {
                    return i(cls.getGenericInterfaces()[i7], interfaces[i7], cls2);
                }
            }
        }
        if (!cls.isInterface()) {
            while (cls != Object.class) {
                Class<?> superclass = cls.getSuperclass();
                if (superclass == cls2) {
                    return cls.getGenericSuperclass();
                }
                if (cls2.isAssignableFrom(superclass)) {
                    return i(cls.getGenericSuperclass(), superclass, cls2);
                }
                cls = superclass;
            }
        }
        return cls2;
    }

    public static Type[] j(Type type, Class cls) {
        if (type == Properties.class) {
            return new Type[]{String.class, String.class};
        }
        Type typeL = l(type, cls, Map.class);
        return typeL instanceof ParameterizedType ? ((ParameterizedType) typeL).getActualTypeArguments() : new Type[]{Object.class, Object.class};
    }

    public static Class k(Type type) {
        if (type instanceof Class) {
            return (Class) type;
        }
        if (type instanceof ParameterizedType) {
            Type rawType = ((ParameterizedType) type).getRawType();
            T4.a.a(rawType instanceof Class);
            return (Class) rawType;
        }
        if (type instanceof GenericArrayType) {
            return Array.newInstance((Class<?>) k(((GenericArrayType) type).getGenericComponentType()), 0).getClass();
        }
        if (type instanceof TypeVariable) {
            return Object.class;
        }
        if (type instanceof WildcardType) {
            return k(((WildcardType) type).getUpperBounds()[0]);
        }
        throw new IllegalArgumentException("Expected a Class, ParameterizedType, or GenericArrayType, but <" + type + "> is of type " + (type == null ? "null" : type.getClass().getName()));
    }

    private static Type l(Type type, Class cls, Class cls2) {
        if (type instanceof WildcardType) {
            type = ((WildcardType) type).getUpperBounds()[0];
        }
        T4.a.a(cls2.isAssignableFrom(cls));
        return o(type, cls, i(type, cls, cls2));
    }

    private static int m(Object[] objArr, Object obj) {
        int length = objArr.length;
        for (int i7 = 0; i7 < length; i7++) {
            if (obj.equals(objArr[i7])) {
                return i7;
            }
        }
        throw new NoSuchElementException();
    }

    public static ParameterizedType n(Type type, Type type2, Type... typeArr) {
        return new C0072b(type, type2, typeArr);
    }

    public static Type o(Type type, Class cls, Type type2) {
        return p(type, cls, type2, new HashMap());
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x005e, code lost:
    
        if (e(r1, r9) != false) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00d7, code lost:
    
        if (r0 == null) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00d9, code lost:
    
        r12.put(r0, r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00dc, code lost:
    
        return r11;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004c  */
    /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.reflect.Type] */
    /* JADX WARN: Type inference failed for: r11v1, types: [java.lang.reflect.Type] */
    /* JADX WARN: Type inference failed for: r11v10, types: [java.lang.Object, java.lang.reflect.Type] */
    /* JADX WARN: Type inference failed for: r11v13, types: [java.lang.reflect.Type] */
    /* JADX WARN: Type inference failed for: r11v2, types: [java.lang.reflect.WildcardType] */
    /* JADX WARN: Type inference failed for: r11v3, types: [java.lang.reflect.WildcardType] */
    /* JADX WARN: Type inference failed for: r11v4, types: [java.lang.reflect.WildcardType] */
    /* JADX WARN: Type inference failed for: r11v5, types: [java.lang.reflect.ParameterizedType] */
    /* JADX WARN: Type inference failed for: r11v6, types: [java.lang.reflect.GenericArrayType] */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r11v9 */
    /* JADX WARN: Type inference failed for: r12v0, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v19 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static Type p(Type type, Class cls, Type type2, Map map) {
        Type typeP;
        Type typeN;
        Type typeP2;
        TypeVariable typeVariable = null;
        while (true) {
            if (type2 instanceof TypeVariable) {
                TypeVariable typeVariable2 = (TypeVariable) type2;
                Type type3 = (Type) map.get(typeVariable2);
                if (type3 != null) {
                    return type3 == Void.TYPE ? type2 : type3;
                }
                map.put(typeVariable2, Void.TYPE);
                if (typeVariable == null) {
                    typeVariable = typeVariable2;
                }
                type2 = q(type, cls, typeVariable2);
                if (type2 == typeVariable2) {
                    break;
                }
            } else if (type2 instanceof Class) {
                Class cls2 = (Class) type2;
                if (cls2.isArray()) {
                    Class<?> componentType = cls2.getComponentType();
                    typeP2 = p(type, cls, componentType, map);
                    if (e(componentType, typeP2)) {
                        type2 = cls2;
                    }
                    typeN = a(typeP2);
                } else if (type2 instanceof GenericArrayType) {
                    type2 = (GenericArrayType) type2;
                    Type genericComponentType = type2.getGenericComponentType();
                    typeP2 = p(type, cls, genericComponentType, map);
                } else {
                    if (type2 instanceof ParameterizedType) {
                        type2 = (ParameterizedType) type2;
                        Type ownerType = type2.getOwnerType();
                        Type typeP3 = p(type, cls, ownerType, map);
                        boolean z6 = !e(typeP3, ownerType);
                        Type[] actualTypeArguments = type2.getActualTypeArguments();
                        int length = actualTypeArguments.length;
                        for (int i7 = 0; i7 < length; i7++) {
                            Type typeP4 = p(type, cls, actualTypeArguments[i7], map);
                            if (!e(typeP4, actualTypeArguments[i7])) {
                                if (!z6) {
                                    actualTypeArguments = (Type[]) actualTypeArguments.clone();
                                    z6 = true;
                                }
                                actualTypeArguments[i7] = typeP4;
                            }
                        }
                        if (z6) {
                            typeN = n(typeP3, type2.getRawType(), actualTypeArguments);
                        }
                    } else if (type2 instanceof WildcardType) {
                        type2 = (WildcardType) type2;
                        Type[] lowerBounds = type2.getLowerBounds();
                        Type[] upperBounds = type2.getUpperBounds();
                        if (lowerBounds.length == 1) {
                            Type typeP5 = p(type, cls, lowerBounds[0], map);
                            if (typeP5 != lowerBounds[0]) {
                                type2 = s(typeP5);
                            }
                        } else if (upperBounds.length == 1 && (typeP = p(type, cls, upperBounds[0], map)) != upperBounds[0]) {
                            type2 = r(typeP);
                        }
                    }
                }
                type2 = typeN;
            }
        }
    }

    private static Type q(Type type, Class cls, TypeVariable typeVariable) {
        Class clsD = d(typeVariable);
        if (clsD == null) {
            return typeVariable;
        }
        Type typeI = i(type, cls, clsD);
        if (!(typeI instanceof ParameterizedType)) {
            return typeVariable;
        }
        return ((ParameterizedType) typeI).getActualTypeArguments()[m(clsD.getTypeParameters(), typeVariable)];
    }

    public static WildcardType r(Type type) {
        return new c(type instanceof WildcardType ? ((WildcardType) type).getUpperBounds() : new Type[]{type}, f3208a);
    }

    public static WildcardType s(Type type) {
        return new c(new Type[]{Object.class}, type instanceof WildcardType ? ((WildcardType) type).getLowerBounds() : new Type[]{type});
    }

    public static String t(Type type) {
        return type instanceof Class ? ((Class) type).getName() : type.toString();
    }
}
