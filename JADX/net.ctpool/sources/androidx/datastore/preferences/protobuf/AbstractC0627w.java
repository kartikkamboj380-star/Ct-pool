package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.AbstractC0606a;
import androidx.datastore.preferences.protobuf.AbstractC0629y;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.w, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0627w extends AbstractC0606a {
    private static Map<Object, AbstractC0627w> defaultInstanceMap = new ConcurrentHashMap();
    protected m0 unknownFields = m0.e();
    protected int memoizedSerializedSize = -1;

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.w$a */
    public static abstract class a extends AbstractC0606a.AbstractC0151a {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private final AbstractC0627w f7818m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        protected AbstractC0627w f7819n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        protected boolean f7820o = false;

        protected a(AbstractC0627w abstractC0627w) {
            this.f7818m = abstractC0627w;
            this.f7819n = (AbstractC0627w) abstractC0627w.o(d.NEW_MUTABLE_INSTANCE);
        }

        private void u(AbstractC0627w abstractC0627w, AbstractC0627w abstractC0627w2) {
            a0.a().d(abstractC0627w).a(abstractC0627w, abstractC0627w2);
        }

        public final AbstractC0627w l() {
            AbstractC0627w abstractC0627wB0 = B0();
            if (abstractC0627wB0.v()) {
                return abstractC0627wB0;
            }
            throw AbstractC0606a.AbstractC0151a.k(abstractC0627wB0);
        }

        @Override // androidx.datastore.preferences.protobuf.O.a
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public AbstractC0627w B0() {
            if (this.f7820o) {
                return this.f7819n;
            }
            this.f7819n.y();
            this.f7820o = true;
            return this.f7819n;
        }

        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public a clone() {
            a aVarE = a().e();
            aVarE.t(B0());
            return aVarE;
        }

        protected void q() {
            if (this.f7820o) {
                AbstractC0627w abstractC0627w = (AbstractC0627w) this.f7819n.o(d.NEW_MUTABLE_INSTANCE);
                u(abstractC0627w, this.f7819n);
                this.f7819n = abstractC0627w;
                this.f7820o = false;
            }
        }

        @Override // androidx.datastore.preferences.protobuf.P
        /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
        public AbstractC0627w a() {
            return this.f7818m;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // androidx.datastore.preferences.protobuf.AbstractC0606a.AbstractC0151a
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public a i(AbstractC0627w abstractC0627w) {
            return t(abstractC0627w);
        }

        public a t(AbstractC0627w abstractC0627w) {
            q();
            u(this.f7819n, abstractC0627w);
            return this;
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.w$b */
    protected static class b extends AbstractC0607b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final AbstractC0627w f7821b;

        public b(AbstractC0627w abstractC0627w) {
            this.f7821b = abstractC0627w;
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.w$c */
    public static class c extends AbstractC0618m {
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.w$d */
    public enum d {
        GET_MEMOIZED_IS_INITIALIZED,
        SET_MEMOIZED_IS_INITIALIZED,
        BUILD_MESSAGE_INFO,
        NEW_MUTABLE_INSTANCE,
        NEW_BUILDER,
        GET_DEFAULT_INSTANCE,
        GET_PARSER
    }

    protected static Object B(O o6, String str, Object[] objArr) {
        return new c0(o6, str, objArr);
    }

    protected static AbstractC0627w C(AbstractC0627w abstractC0627w, InputStream inputStream) {
        return m(D(abstractC0627w, AbstractC0613h.f(inputStream), C0620o.b()));
    }

    static AbstractC0627w D(AbstractC0627w abstractC0627w, AbstractC0613h abstractC0613h, C0620o c0620o) throws C0630z {
        AbstractC0627w abstractC0627w2 = (AbstractC0627w) abstractC0627w.o(d.NEW_MUTABLE_INSTANCE);
        try {
            e0 e0VarD = a0.a().d(abstractC0627w2);
            e0VarD.b(abstractC0627w2, C0614i.Q(abstractC0613h), c0620o);
            e0VarD.c(abstractC0627w2);
            return abstractC0627w2;
        } catch (IOException e7) {
            if (e7.getCause() instanceof C0630z) {
                throw ((C0630z) e7.getCause());
            }
            throw new C0630z(e7.getMessage()).i(abstractC0627w2);
        } catch (RuntimeException e8) {
            if (e8.getCause() instanceof C0630z) {
                throw ((C0630z) e8.getCause());
            }
            throw e8;
        }
    }

    protected static void E(Class cls, AbstractC0627w abstractC0627w) {
        defaultInstanceMap.put(cls, abstractC0627w);
    }

    private static AbstractC0627w m(AbstractC0627w abstractC0627w) throws C0630z {
        if (abstractC0627w == null || abstractC0627w.v()) {
            return abstractC0627w;
        }
        throw abstractC0627w.i().a().i(abstractC0627w);
    }

    protected static AbstractC0629y.b r() {
        return b0.h();
    }

    static AbstractC0627w s(Class cls) {
        AbstractC0627w abstractC0627wA = defaultInstanceMap.get(cls);
        if (abstractC0627wA == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                abstractC0627wA = defaultInstanceMap.get(cls);
            } catch (ClassNotFoundException e7) {
                throw new IllegalStateException("Class initialization cannot fail.", e7);
            }
        }
        if (abstractC0627wA == null) {
            abstractC0627wA = ((AbstractC0627w) p0.i(cls)).a();
            if (abstractC0627wA == null) {
                throw new IllegalStateException();
            }
            defaultInstanceMap.put(cls, abstractC0627wA);
        }
        return abstractC0627wA;
    }

    static Object u(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e7) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e7);
        } catch (InvocationTargetException e8) {
            Throwable cause = e8.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
        }
    }

    protected static final boolean x(AbstractC0627w abstractC0627w, boolean z6) {
        byte bByteValue = ((Byte) abstractC0627w.o(d.GET_MEMOIZED_IS_INITIALIZED)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        boolean zD = a0.a().d(abstractC0627w).d(abstractC0627w);
        if (z6) {
            abstractC0627w.p(d.SET_MEMOIZED_IS_INITIALIZED, zD ? abstractC0627w : null);
        }
        return zD;
    }

    protected static AbstractC0629y.b z(AbstractC0629y.b bVar) {
        int size = bVar.size();
        return bVar.J(size == 0 ? 10 : size * 2);
    }

    @Override // androidx.datastore.preferences.protobuf.O
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public final a e() {
        return (a) o(d.NEW_BUILDER);
    }

    @Override // androidx.datastore.preferences.protobuf.O
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public final a b() {
        a aVar = (a) o(d.NEW_BUILDER);
        aVar.t(this);
        return aVar;
    }

    @Override // androidx.datastore.preferences.protobuf.O
    public int c() {
        if (this.memoizedSerializedSize == -1) {
            this.memoizedSerializedSize = a0.a().d(this).g(this);
        }
        return this.memoizedSerializedSize;
    }

    @Override // androidx.datastore.preferences.protobuf.O
    public void d(AbstractC0615j abstractC0615j) {
        a0.a().d(this).e(this, C0616k.P(abstractC0615j));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (a().getClass().isInstance(obj)) {
            return a0.a().d(this).f(this, (AbstractC0627w) obj);
        }
        return false;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0606a
    int g() {
        return this.memoizedSerializedSize;
    }

    public int hashCode() {
        int i7 = this.memoizedHashCode;
        if (i7 != 0) {
            return i7;
        }
        int i8 = a0.a().d(this).i(this);
        this.memoizedHashCode = i8;
        return i8;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0606a
    void j(int i7) {
        this.memoizedSerializedSize = i7;
    }

    Object l() {
        return o(d.BUILD_MESSAGE_INFO);
    }

    protected final a n() {
        return (a) o(d.NEW_BUILDER);
    }

    protected Object o(d dVar) {
        return q(dVar, null, null);
    }

    protected Object p(d dVar, Object obj) {
        return q(dVar, obj, null);
    }

    protected abstract Object q(d dVar, Object obj, Object obj2);

    @Override // androidx.datastore.preferences.protobuf.P
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public final AbstractC0627w a() {
        return (AbstractC0627w) o(d.GET_DEFAULT_INSTANCE);
    }

    public String toString() {
        return Q.e(this, super.toString());
    }

    public final boolean v() {
        return x(this, true);
    }

    protected void y() {
        a0.a().d(this).c(this);
    }
}
