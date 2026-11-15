package U4;

import com.google.gson.reflect.TypeToken;
import java.io.IOException;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.InetAddress;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Calendar;
import java.util.Currency;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerArray;

/* JADX INFO: loaded from: classes.dex */
public abstract class m {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static final R4.q f3915A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public static final R4.q f3916B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public static final R4.r f3917C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public static final R4.q f3918D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public static final R4.r f3919E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public static final R4.q f3920F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public static final R4.r f3921G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public static final R4.q f3922H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public static final R4.r f3923I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public static final R4.q f3924J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public static final R4.r f3925K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public static final R4.q f3926L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public static final R4.r f3927M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public static final R4.q f3928N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public static final R4.r f3929O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public static final R4.q f3930P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public static final R4.r f3931Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public static final R4.q f3932R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public static final R4.r f3933S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public static final R4.q f3934T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public static final R4.r f3935U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public static final R4.q f3936V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public static final R4.r f3937W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public static final R4.r f3938X;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final R4.q f3939a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final R4.r f3940b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final R4.q f3941c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final R4.r f3942d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final R4.q f3943e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final R4.q f3944f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final R4.r f3945g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final R4.q f3946h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final R4.r f3947i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final R4.q f3948j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final R4.r f3949k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final R4.q f3950l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final R4.r f3951m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final R4.q f3952n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final R4.r f3953o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final R4.q f3954p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final R4.r f3955q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final R4.q f3956r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final R4.r f3957s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final R4.q f3958t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final R4.q f3959u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final R4.q f3960v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final R4.q f3961w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final R4.r f3962x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final R4.q f3963y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final R4.q f3964z;

    static /* synthetic */ class A {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f3965a;

        static {
            int[] iArr = new int[Y4.b.values().length];
            f3965a = iArr;
            try {
                iArr[Y4.b.NUMBER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f3965a[Y4.b.STRING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f3965a[Y4.b.BOOLEAN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f3965a[Y4.b.BEGIN_ARRAY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f3965a[Y4.b.BEGIN_OBJECT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f3965a[Y4.b.NULL.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    class B extends R4.q {
        B() {
        }

        @Override // R4.q
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public Boolean b(Y4.a aVar) throws IOException {
            Y4.b bVarR0 = aVar.R0();
            if (bVarR0 != Y4.b.NULL) {
                return bVarR0 == Y4.b.STRING ? Boolean.valueOf(Boolean.parseBoolean(aVar.H0())) : Boolean.valueOf(aVar.U());
            }
            aVar.B0();
            return null;
        }

        @Override // R4.q
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(Y4.c cVar, Boolean bool) throws IOException {
            cVar.S0(bool);
        }
    }

    class C extends R4.q {
        C() {
        }

        @Override // R4.q
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public Boolean b(Y4.a aVar) throws IOException {
            if (aVar.R0() != Y4.b.NULL) {
                return Boolean.valueOf(aVar.H0());
            }
            aVar.B0();
            return null;
        }

        @Override // R4.q
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(Y4.c cVar, Boolean bool) throws IOException {
            cVar.f1(bool == null ? "null" : bool.toString());
        }
    }

    class D extends R4.q {
        D() {
        }

        @Override // R4.q
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public Number b(Y4.a aVar) throws IOException {
            if (aVar.R0() == Y4.b.NULL) {
                aVar.B0();
                return null;
            }
            try {
                int iA0 = aVar.a0();
                if (iA0 <= 255 && iA0 >= -128) {
                    return Byte.valueOf((byte) iA0);
                }
                throw new R4.l("Lossy conversion from " + iA0 + " to byte; at path " + aVar.o());
            } catch (NumberFormatException e7) {
                throw new R4.l(e7);
            }
        }

        @Override // R4.q
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(Y4.c cVar, Number number) throws IOException {
            if (number == null) {
                cVar.J();
            } else {
                cVar.R0(number.byteValue());
            }
        }
    }

    class E extends R4.q {
        E() {
        }

        @Override // R4.q
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public Number b(Y4.a aVar) throws IOException {
            if (aVar.R0() == Y4.b.NULL) {
                aVar.B0();
                return null;
            }
            try {
                int iA0 = aVar.a0();
                if (iA0 <= 65535 && iA0 >= -32768) {
                    return Short.valueOf((short) iA0);
                }
                throw new R4.l("Lossy conversion from " + iA0 + " to short; at path " + aVar.o());
            } catch (NumberFormatException e7) {
                throw new R4.l(e7);
            }
        }

        @Override // R4.q
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(Y4.c cVar, Number number) throws IOException {
            if (number == null) {
                cVar.J();
            } else {
                cVar.R0(number.shortValue());
            }
        }
    }

    class F extends R4.q {
        F() {
        }

        @Override // R4.q
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public Number b(Y4.a aVar) throws IOException {
            if (aVar.R0() == Y4.b.NULL) {
                aVar.B0();
                return null;
            }
            try {
                return Integer.valueOf(aVar.a0());
            } catch (NumberFormatException e7) {
                throw new R4.l(e7);
            }
        }

        @Override // R4.q
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(Y4.c cVar, Number number) throws IOException {
            if (number == null) {
                cVar.J();
            } else {
                cVar.R0(number.intValue());
            }
        }
    }

    class G extends R4.q {
        G() {
        }

        @Override // R4.q
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public AtomicInteger b(Y4.a aVar) {
            try {
                return new AtomicInteger(aVar.a0());
            } catch (NumberFormatException e7) {
                throw new R4.l(e7);
            }
        }

        @Override // R4.q
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(Y4.c cVar, AtomicInteger atomicInteger) throws IOException {
            cVar.R0(atomicInteger.get());
        }
    }

    class H extends R4.q {
        H() {
        }

        @Override // R4.q
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public AtomicBoolean b(Y4.a aVar) {
            return new AtomicBoolean(aVar.U());
        }

        @Override // R4.q
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(Y4.c cVar, AtomicBoolean atomicBoolean) throws IOException {
            cVar.h1(atomicBoolean.get());
        }
    }

    private static final class I extends R4.q {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Map f3966a = new HashMap();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Map f3967b = new HashMap();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Map f3968c = new HashMap();

        class a implements PrivilegedAction {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ Class f3969a;

            a(Class cls) {
                this.f3969a = cls;
            }

            @Override // java.security.PrivilegedAction
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public Field[] run() {
                Field[] declaredFields = this.f3969a.getDeclaredFields();
                ArrayList arrayList = new ArrayList(declaredFields.length);
                for (Field field : declaredFields) {
                    if (field.isEnumConstant()) {
                        arrayList.add(field);
                    }
                }
                Field[] fieldArr = (Field[]) arrayList.toArray(new Field[0]);
                AccessibleObject.setAccessible(fieldArr, true);
                return fieldArr;
            }
        }

        public I(Class cls) {
            try {
                for (Field field : (Field[]) AccessController.doPrivileged(new a(cls))) {
                    Enum r42 = (Enum) field.get(null);
                    String strName = r42.name();
                    String string = r42.toString();
                    S4.c cVar = (S4.c) field.getAnnotation(S4.c.class);
                    if (cVar != null) {
                        strName = cVar.value();
                        for (String str : cVar.alternate()) {
                            this.f3966a.put(str, r42);
                        }
                    }
                    this.f3966a.put(strName, r42);
                    this.f3967b.put(string, r42);
                    this.f3968c.put(r42, strName);
                }
            } catch (IllegalAccessException e7) {
                throw new AssertionError(e7);
            }
        }

        @Override // R4.q
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public Enum b(Y4.a aVar) throws IOException {
            if (aVar.R0() == Y4.b.NULL) {
                aVar.B0();
                return null;
            }
            String strH0 = aVar.H0();
            Enum r02 = (Enum) this.f3966a.get(strH0);
            return r02 == null ? (Enum) this.f3967b.get(strH0) : r02;
        }

        @Override // R4.q
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(Y4.c cVar, Enum r32) throws IOException {
            cVar.f1(r32 == null ? null : (String) this.f3968c.get(r32));
        }
    }

    /* JADX INFO: renamed from: U4.m$a, reason: case insensitive filesystem */
    class C0464a extends R4.q {
        C0464a() {
        }

        @Override // R4.q
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public AtomicIntegerArray b(Y4.a aVar) throws IOException {
            ArrayList arrayList = new ArrayList();
            aVar.a();
            while (aVar.w()) {
                try {
                    arrayList.add(Integer.valueOf(aVar.a0()));
                } catch (NumberFormatException e7) {
                    throw new R4.l(e7);
                }
            }
            aVar.g();
            int size = arrayList.size();
            AtomicIntegerArray atomicIntegerArray = new AtomicIntegerArray(size);
            for (int i7 = 0; i7 < size; i7++) {
                atomicIntegerArray.set(i7, ((Integer) arrayList.get(i7)).intValue());
            }
            return atomicIntegerArray;
        }

        @Override // R4.q
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(Y4.c cVar, AtomicIntegerArray atomicIntegerArray) throws IOException {
            cVar.d();
            int length = atomicIntegerArray.length();
            for (int i7 = 0; i7 < length; i7++) {
                cVar.R0(atomicIntegerArray.get(i7));
            }
            cVar.g();
        }
    }

    /* JADX INFO: renamed from: U4.m$b, reason: case insensitive filesystem */
    class C0465b extends R4.q {
        C0465b() {
        }

        @Override // R4.q
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public Number b(Y4.a aVar) throws IOException {
            if (aVar.R0() == Y4.b.NULL) {
                aVar.B0();
                return null;
            }
            try {
                return Long.valueOf(aVar.h0());
            } catch (NumberFormatException e7) {
                throw new R4.l(e7);
            }
        }

        @Override // R4.q
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(Y4.c cVar, Number number) throws IOException {
            if (number == null) {
                cVar.J();
            } else {
                cVar.R0(number.longValue());
            }
        }
    }

    /* JADX INFO: renamed from: U4.m$c, reason: case insensitive filesystem */
    class C0466c extends R4.q {
        C0466c() {
        }

        @Override // R4.q
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public Number b(Y4.a aVar) throws IOException {
            if (aVar.R0() != Y4.b.NULL) {
                return Float.valueOf((float) aVar.W());
            }
            aVar.B0();
            return null;
        }

        @Override // R4.q
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(Y4.c cVar, Number number) throws IOException {
            if (number == null) {
                cVar.J();
                return;
            }
            if (!(number instanceof Float)) {
                number = Float.valueOf(number.floatValue());
            }
            cVar.b1(number);
        }
    }

    /* JADX INFO: renamed from: U4.m$d, reason: case insensitive filesystem */
    class C0467d extends R4.q {
        C0467d() {
        }

        @Override // R4.q
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public Number b(Y4.a aVar) throws IOException {
            if (aVar.R0() != Y4.b.NULL) {
                return Double.valueOf(aVar.W());
            }
            aVar.B0();
            return null;
        }

        @Override // R4.q
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(Y4.c cVar, Number number) throws IOException {
            if (number == null) {
                cVar.J();
            } else {
                cVar.M0(number.doubleValue());
            }
        }
    }

    /* JADX INFO: renamed from: U4.m$e, reason: case insensitive filesystem */
    class C0468e extends R4.q {
        C0468e() {
        }

        @Override // R4.q
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public Character b(Y4.a aVar) throws IOException {
            if (aVar.R0() == Y4.b.NULL) {
                aVar.B0();
                return null;
            }
            String strH0 = aVar.H0();
            if (strH0.length() == 1) {
                return Character.valueOf(strH0.charAt(0));
            }
            throw new R4.l("Expecting character, got: " + strH0 + "; at " + aVar.o());
        }

        @Override // R4.q
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(Y4.c cVar, Character ch) throws IOException {
            cVar.f1(ch == null ? null : String.valueOf(ch));
        }
    }

    /* JADX INFO: renamed from: U4.m$f, reason: case insensitive filesystem */
    class C0469f extends R4.q {
        C0469f() {
        }

        @Override // R4.q
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public String b(Y4.a aVar) throws IOException {
            Y4.b bVarR0 = aVar.R0();
            if (bVarR0 != Y4.b.NULL) {
                return bVarR0 == Y4.b.BOOLEAN ? Boolean.toString(aVar.U()) : aVar.H0();
            }
            aVar.B0();
            return null;
        }

        @Override // R4.q
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(Y4.c cVar, String str) throws IOException {
            cVar.f1(str);
        }
    }

    /* JADX INFO: renamed from: U4.m$g, reason: case insensitive filesystem */
    class C0470g extends R4.q {
        C0470g() {
        }

        @Override // R4.q
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public BigDecimal b(Y4.a aVar) throws IOException {
            if (aVar.R0() == Y4.b.NULL) {
                aVar.B0();
                return null;
            }
            String strH0 = aVar.H0();
            try {
                return new BigDecimal(strH0);
            } catch (NumberFormatException e7) {
                throw new R4.l("Failed parsing '" + strH0 + "' as BigDecimal; at path " + aVar.o(), e7);
            }
        }

        @Override // R4.q
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(Y4.c cVar, BigDecimal bigDecimal) throws IOException {
            cVar.b1(bigDecimal);
        }
    }

    /* JADX INFO: renamed from: U4.m$h, reason: case insensitive filesystem */
    class C0471h extends R4.q {
        C0471h() {
        }

        @Override // R4.q
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public BigInteger b(Y4.a aVar) throws IOException {
            if (aVar.R0() == Y4.b.NULL) {
                aVar.B0();
                return null;
            }
            String strH0 = aVar.H0();
            try {
                return new BigInteger(strH0);
            } catch (NumberFormatException e7) {
                throw new R4.l("Failed parsing '" + strH0 + "' as BigInteger; at path " + aVar.o(), e7);
            }
        }

        @Override // R4.q
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(Y4.c cVar, BigInteger bigInteger) throws IOException {
            cVar.b1(bigInteger);
        }
    }

    /* JADX INFO: renamed from: U4.m$i, reason: case insensitive filesystem */
    class C0472i extends R4.q {
        C0472i() {
        }

        @Override // R4.q
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public T4.g b(Y4.a aVar) throws IOException {
            if (aVar.R0() != Y4.b.NULL) {
                return new T4.g(aVar.H0());
            }
            aVar.B0();
            return null;
        }

        @Override // R4.q
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(Y4.c cVar, T4.g gVar) throws IOException {
            cVar.b1(gVar);
        }
    }

    class j extends R4.q {
        j() {
        }

        @Override // R4.q
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public StringBuilder b(Y4.a aVar) throws IOException {
            if (aVar.R0() != Y4.b.NULL) {
                return new StringBuilder(aVar.H0());
            }
            aVar.B0();
            return null;
        }

        @Override // R4.q
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(Y4.c cVar, StringBuilder sb) throws IOException {
            cVar.f1(sb == null ? null : sb.toString());
        }
    }

    class k extends R4.q {
        k() {
        }

        @Override // R4.q
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public Class b(Y4.a aVar) {
            throw new UnsupportedOperationException("Attempted to deserialize a java.lang.Class. Forgot to register a type adapter?");
        }

        @Override // R4.q
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(Y4.c cVar, Class cls) {
            throw new UnsupportedOperationException("Attempted to serialize java.lang.Class: " + cls.getName() + ". Forgot to register a type adapter?");
        }
    }

    class l extends R4.q {
        l() {
        }

        @Override // R4.q
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public StringBuffer b(Y4.a aVar) throws IOException {
            if (aVar.R0() != Y4.b.NULL) {
                return new StringBuffer(aVar.H0());
            }
            aVar.B0();
            return null;
        }

        @Override // R4.q
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(Y4.c cVar, StringBuffer stringBuffer) throws IOException {
            cVar.f1(stringBuffer == null ? null : stringBuffer.toString());
        }
    }

    /* JADX INFO: renamed from: U4.m$m, reason: collision with other inner class name */
    class C0087m extends R4.q {
        C0087m() {
        }

        @Override // R4.q
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public URL b(Y4.a aVar) throws IOException {
            if (aVar.R0() == Y4.b.NULL) {
                aVar.B0();
                return null;
            }
            String strH0 = aVar.H0();
            if ("null".equals(strH0)) {
                return null;
            }
            return new URL(strH0);
        }

        @Override // R4.q
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(Y4.c cVar, URL url) throws IOException {
            cVar.f1(url == null ? null : url.toExternalForm());
        }
    }

    class n extends R4.q {
        n() {
        }

        @Override // R4.q
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public URI b(Y4.a aVar) throws IOException {
            if (aVar.R0() == Y4.b.NULL) {
                aVar.B0();
                return null;
            }
            try {
                String strH0 = aVar.H0();
                if ("null".equals(strH0)) {
                    return null;
                }
                return new URI(strH0);
            } catch (URISyntaxException e7) {
                throw new R4.g(e7);
            }
        }

        @Override // R4.q
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(Y4.c cVar, URI uri) throws IOException {
            cVar.f1(uri == null ? null : uri.toASCIIString());
        }
    }

    class o extends R4.q {
        o() {
        }

        @Override // R4.q
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public InetAddress b(Y4.a aVar) throws IOException {
            if (aVar.R0() != Y4.b.NULL) {
                return InetAddress.getByName(aVar.H0());
            }
            aVar.B0();
            return null;
        }

        @Override // R4.q
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(Y4.c cVar, InetAddress inetAddress) throws IOException {
            cVar.f1(inetAddress == null ? null : inetAddress.getHostAddress());
        }
    }

    class p extends R4.q {
        p() {
        }

        @Override // R4.q
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public UUID b(Y4.a aVar) throws IOException {
            if (aVar.R0() == Y4.b.NULL) {
                aVar.B0();
                return null;
            }
            String strH0 = aVar.H0();
            try {
                return UUID.fromString(strH0);
            } catch (IllegalArgumentException e7) {
                throw new R4.l("Failed parsing '" + strH0 + "' as UUID; at path " + aVar.o(), e7);
            }
        }

        @Override // R4.q
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(Y4.c cVar, UUID uuid) throws IOException {
            cVar.f1(uuid == null ? null : uuid.toString());
        }
    }

    class q extends R4.q {
        q() {
        }

        @Override // R4.q
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public Currency b(Y4.a aVar) throws IOException {
            String strH0 = aVar.H0();
            try {
                return Currency.getInstance(strH0);
            } catch (IllegalArgumentException e7) {
                throw new R4.l("Failed parsing '" + strH0 + "' as Currency; at path " + aVar.o(), e7);
            }
        }

        @Override // R4.q
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(Y4.c cVar, Currency currency) throws IOException {
            cVar.f1(currency.getCurrencyCode());
        }
    }

    class r extends R4.q {
        r() {
        }

        @Override // R4.q
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public Calendar b(Y4.a aVar) throws IOException {
            if (aVar.R0() == Y4.b.NULL) {
                aVar.B0();
                return null;
            }
            aVar.b();
            int i7 = 0;
            int i8 = 0;
            int i9 = 0;
            int i10 = 0;
            int i11 = 0;
            int i12 = 0;
            while (aVar.R0() != Y4.b.END_OBJECT) {
                String strJ0 = aVar.j0();
                int iA0 = aVar.a0();
                if ("year".equals(strJ0)) {
                    i7 = iA0;
                } else if ("month".equals(strJ0)) {
                    i8 = iA0;
                } else if ("dayOfMonth".equals(strJ0)) {
                    i9 = iA0;
                } else if ("hourOfDay".equals(strJ0)) {
                    i10 = iA0;
                } else if ("minute".equals(strJ0)) {
                    i11 = iA0;
                } else if ("second".equals(strJ0)) {
                    i12 = iA0;
                }
            }
            aVar.j();
            return new GregorianCalendar(i7, i8, i9, i10, i11, i12);
        }

        @Override // R4.q
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(Y4.c cVar, Calendar calendar) throws IOException {
            if (calendar == null) {
                cVar.J();
                return;
            }
            cVar.e();
            cVar.z("year");
            cVar.R0(calendar.get(1));
            cVar.z("month");
            cVar.R0(calendar.get(2));
            cVar.z("dayOfMonth");
            cVar.R0(calendar.get(5));
            cVar.z("hourOfDay");
            cVar.R0(calendar.get(11));
            cVar.z("minute");
            cVar.R0(calendar.get(12));
            cVar.z("second");
            cVar.R0(calendar.get(13));
            cVar.j();
        }
    }

    class s extends R4.q {
        s() {
        }

        @Override // R4.q
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public Locale b(Y4.a aVar) throws IOException {
            if (aVar.R0() == Y4.b.NULL) {
                aVar.B0();
                return null;
            }
            StringTokenizer stringTokenizer = new StringTokenizer(aVar.H0(), "_");
            String strNextToken = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
            String strNextToken2 = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
            String strNextToken3 = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
            return (strNextToken2 == null && strNextToken3 == null) ? new Locale(strNextToken) : strNextToken3 == null ? new Locale(strNextToken, strNextToken2) : new Locale(strNextToken, strNextToken2, strNextToken3);
        }

        @Override // R4.q
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(Y4.c cVar, Locale locale) throws IOException {
            cVar.f1(locale == null ? null : locale.toString());
        }
    }

    class t extends R4.q {
        t() {
        }

        private R4.f f(Y4.a aVar, Y4.b bVar) throws IOException {
            int i7 = A.f3965a[bVar.ordinal()];
            if (i7 == 1) {
                return new R4.k(new T4.g(aVar.H0()));
            }
            if (i7 == 2) {
                return new R4.k(aVar.H0());
            }
            if (i7 == 3) {
                return new R4.k(Boolean.valueOf(aVar.U()));
            }
            if (i7 == 6) {
                aVar.B0();
                return R4.h.f2886m;
            }
            throw new IllegalStateException("Unexpected token: " + bVar);
        }

        private R4.f g(Y4.a aVar, Y4.b bVar) throws IOException {
            int i7 = A.f3965a[bVar.ordinal()];
            if (i7 == 4) {
                aVar.a();
                return new R4.e();
            }
            if (i7 != 5) {
                return null;
            }
            aVar.b();
            return new R4.i();
        }

        @Override // R4.q
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public R4.f b(Y4.a aVar) throws IOException {
            Y4.b bVarR0 = aVar.R0();
            R4.f fVarG = g(aVar, bVarR0);
            if (fVarG == null) {
                return f(aVar, bVarR0);
            }
            ArrayDeque arrayDeque = new ArrayDeque();
            while (true) {
                if (aVar.w()) {
                    String strJ0 = fVarG instanceof R4.i ? aVar.j0() : null;
                    Y4.b bVarR02 = aVar.R0();
                    R4.f fVarG2 = g(aVar, bVarR02);
                    boolean z6 = fVarG2 != null;
                    if (fVarG2 == null) {
                        fVarG2 = f(aVar, bVarR02);
                    }
                    if (fVarG instanceof R4.e) {
                        ((R4.e) fVarG).o(fVarG2);
                    } else {
                        ((R4.i) fVarG).o(strJ0, fVarG2);
                    }
                    if (z6) {
                        arrayDeque.addLast(fVarG);
                        fVarG = fVarG2;
                    }
                } else {
                    if (fVarG instanceof R4.e) {
                        aVar.g();
                    } else {
                        aVar.j();
                    }
                    if (arrayDeque.isEmpty()) {
                        return fVarG;
                    }
                    fVarG = (R4.f) arrayDeque.removeLast();
                }
            }
        }

        @Override // R4.q
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public void d(Y4.c cVar, R4.f fVar) throws IOException {
            if (fVar == null || fVar.k()) {
                cVar.J();
                return;
            }
            if (fVar.n()) {
                R4.k kVarH = fVar.h();
                if (kVarH.t()) {
                    cVar.b1(kVarH.p());
                    return;
                } else if (kVarH.r()) {
                    cVar.h1(kVarH.o());
                    return;
                } else {
                    cVar.f1(kVarH.q());
                    return;
                }
            }
            if (fVar.i()) {
                cVar.d();
                Iterator it = fVar.c().iterator();
                while (it.hasNext()) {
                    d(cVar, (R4.f) it.next());
                }
                cVar.g();
                return;
            }
            if (!fVar.m()) {
                throw new IllegalArgumentException("Couldn't write " + fVar.getClass());
            }
            cVar.e();
            for (Map.Entry entry : fVar.f().p()) {
                cVar.z((String) entry.getKey());
                d(cVar, (R4.f) entry.getValue());
            }
            cVar.j();
        }
    }

    class u implements R4.r {
        u() {
        }

        @Override // R4.r
        public R4.q a(R4.d dVar, TypeToken typeToken) {
            Class rawType = typeToken.getRawType();
            if (!Enum.class.isAssignableFrom(rawType) || rawType == Enum.class) {
                return null;
            }
            if (!rawType.isEnum()) {
                rawType = rawType.getSuperclass();
            }
            return new I(rawType);
        }
    }

    class v extends R4.q {
        v() {
        }

        @Override // R4.q
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public BitSet b(Y4.a aVar) throws IOException {
            BitSet bitSet = new BitSet();
            aVar.a();
            Y4.b bVarR0 = aVar.R0();
            int i7 = 0;
            while (bVarR0 != Y4.b.END_ARRAY) {
                int i8 = A.f3965a[bVarR0.ordinal()];
                boolean zU = true;
                if (i8 == 1 || i8 == 2) {
                    int iA0 = aVar.a0();
                    if (iA0 == 0) {
                        zU = false;
                    } else if (iA0 != 1) {
                        throw new R4.l("Invalid bitset value " + iA0 + ", expected 0 or 1; at path " + aVar.o());
                    }
                } else {
                    if (i8 != 3) {
                        throw new R4.l("Invalid bitset value type: " + bVarR0 + "; at path " + aVar.F0());
                    }
                    zU = aVar.U();
                }
                if (zU) {
                    bitSet.set(i7);
                }
                i7++;
                bVarR0 = aVar.R0();
            }
            aVar.g();
            return bitSet;
        }

        @Override // R4.q
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(Y4.c cVar, BitSet bitSet) throws IOException {
            cVar.d();
            int length = bitSet.length();
            for (int i7 = 0; i7 < length; i7++) {
                cVar.R0(bitSet.get(i7) ? 1L : 0L);
            }
            cVar.g();
        }
    }

    class w implements R4.r {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        final /* synthetic */ Class f3971m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ R4.q f3972n;

        w(Class cls, R4.q qVar) {
            this.f3971m = cls;
            this.f3972n = qVar;
        }

        @Override // R4.r
        public R4.q a(R4.d dVar, TypeToken typeToken) {
            if (typeToken.getRawType() == this.f3971m) {
                return this.f3972n;
            }
            return null;
        }

        public String toString() {
            return "Factory[type=" + this.f3971m.getName() + ",adapter=" + this.f3972n + "]";
        }
    }

    class x implements R4.r {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        final /* synthetic */ Class f3973m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ Class f3974n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        final /* synthetic */ R4.q f3975o;

        x(Class cls, Class cls2, R4.q qVar) {
            this.f3973m = cls;
            this.f3974n = cls2;
            this.f3975o = qVar;
        }

        @Override // R4.r
        public R4.q a(R4.d dVar, TypeToken typeToken) {
            Class rawType = typeToken.getRawType();
            if (rawType == this.f3973m || rawType == this.f3974n) {
                return this.f3975o;
            }
            return null;
        }

        public String toString() {
            return "Factory[type=" + this.f3974n.getName() + "+" + this.f3973m.getName() + ",adapter=" + this.f3975o + "]";
        }
    }

    class y implements R4.r {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        final /* synthetic */ Class f3976m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ Class f3977n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        final /* synthetic */ R4.q f3978o;

        y(Class cls, Class cls2, R4.q qVar) {
            this.f3976m = cls;
            this.f3977n = cls2;
            this.f3978o = qVar;
        }

        @Override // R4.r
        public R4.q a(R4.d dVar, TypeToken typeToken) {
            Class rawType = typeToken.getRawType();
            if (rawType == this.f3976m || rawType == this.f3977n) {
                return this.f3978o;
            }
            return null;
        }

        public String toString() {
            return "Factory[type=" + this.f3976m.getName() + "+" + this.f3977n.getName() + ",adapter=" + this.f3978o + "]";
        }
    }

    class z implements R4.r {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        final /* synthetic */ Class f3979m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ R4.q f3980n;

        class a extends R4.q {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ Class f3981a;

            a(Class cls) {
                this.f3981a = cls;
            }

            @Override // R4.q
            public Object b(Y4.a aVar) {
                Object objB = z.this.f3980n.b(aVar);
                if (objB == null || this.f3981a.isInstance(objB)) {
                    return objB;
                }
                throw new R4.l("Expected a " + this.f3981a.getName() + " but was " + objB.getClass().getName() + "; at path " + aVar.o());
            }

            @Override // R4.q
            public void d(Y4.c cVar, Object obj) {
                z.this.f3980n.d(cVar, obj);
            }
        }

        z(Class cls, R4.q qVar) {
            this.f3979m = cls;
            this.f3980n = qVar;
        }

        @Override // R4.r
        public R4.q a(R4.d dVar, TypeToken typeToken) {
            Class<?> rawType = typeToken.getRawType();
            if (this.f3979m.isAssignableFrom(rawType)) {
                return new a(rawType);
            }
            return null;
        }

        public String toString() {
            return "Factory[typeHierarchy=" + this.f3979m.getName() + ",adapter=" + this.f3980n + "]";
        }
    }

    static {
        R4.q qVarA = new k().a();
        f3939a = qVarA;
        f3940b = a(Class.class, qVarA);
        R4.q qVarA2 = new v().a();
        f3941c = qVarA2;
        f3942d = a(BitSet.class, qVarA2);
        B b7 = new B();
        f3943e = b7;
        f3944f = new C();
        f3945g = b(Boolean.TYPE, Boolean.class, b7);
        D d7 = new D();
        f3946h = d7;
        f3947i = b(Byte.TYPE, Byte.class, d7);
        E e7 = new E();
        f3948j = e7;
        f3949k = b(Short.TYPE, Short.class, e7);
        F f7 = new F();
        f3950l = f7;
        f3951m = b(Integer.TYPE, Integer.class, f7);
        R4.q qVarA3 = new G().a();
        f3952n = qVarA3;
        f3953o = a(AtomicInteger.class, qVarA3);
        R4.q qVarA4 = new H().a();
        f3954p = qVarA4;
        f3955q = a(AtomicBoolean.class, qVarA4);
        R4.q qVarA5 = new C0464a().a();
        f3956r = qVarA5;
        f3957s = a(AtomicIntegerArray.class, qVarA5);
        f3958t = new C0465b();
        f3959u = new C0466c();
        f3960v = new C0467d();
        C0468e c0468e = new C0468e();
        f3961w = c0468e;
        f3962x = b(Character.TYPE, Character.class, c0468e);
        C0469f c0469f = new C0469f();
        f3963y = c0469f;
        f3964z = new C0470g();
        f3915A = new C0471h();
        f3916B = new C0472i();
        f3917C = a(String.class, c0469f);
        j jVar = new j();
        f3918D = jVar;
        f3919E = a(StringBuilder.class, jVar);
        l lVar = new l();
        f3920F = lVar;
        f3921G = a(StringBuffer.class, lVar);
        C0087m c0087m = new C0087m();
        f3922H = c0087m;
        f3923I = a(URL.class, c0087m);
        n nVar = new n();
        f3924J = nVar;
        f3925K = a(URI.class, nVar);
        o oVar = new o();
        f3926L = oVar;
        f3927M = d(InetAddress.class, oVar);
        p pVar = new p();
        f3928N = pVar;
        f3929O = a(UUID.class, pVar);
        R4.q qVarA6 = new q().a();
        f3930P = qVarA6;
        f3931Q = a(Currency.class, qVarA6);
        r rVar = new r();
        f3932R = rVar;
        f3933S = c(Calendar.class, GregorianCalendar.class, rVar);
        s sVar = new s();
        f3934T = sVar;
        f3935U = a(Locale.class, sVar);
        t tVar = new t();
        f3936V = tVar;
        f3937W = d(R4.f.class, tVar);
        f3938X = new u();
    }

    public static R4.r a(Class cls, R4.q qVar) {
        return new w(cls, qVar);
    }

    public static R4.r b(Class cls, Class cls2, R4.q qVar) {
        return new x(cls, cls2, qVar);
    }

    public static R4.r c(Class cls, Class cls2, R4.q qVar) {
        return new y(cls, cls2, qVar);
    }

    public static R4.r d(Class cls, R4.q qVar) {
        return new z(cls, qVar);
    }
}
