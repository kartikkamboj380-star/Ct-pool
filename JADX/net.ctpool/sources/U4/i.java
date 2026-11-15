package U4;

import R4.o;
import R4.p;
import R4.q;
import R4.r;
import com.google.gson.reflect.TypeToken;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class i extends q {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final r f3882c = f(o.f2897m);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final R4.d f3883a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p f3884b;

    class a implements r {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        final /* synthetic */ p f3885m;

        a(p pVar) {
            this.f3885m = pVar;
        }

        @Override // R4.r
        public q a(R4.d dVar, TypeToken typeToken) {
            a aVar = null;
            if (typeToken.getRawType() == Object.class) {
                return new i(dVar, this.f3885m, aVar);
            }
            return null;
        }
    }

    static /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f3886a;

        static {
            int[] iArr = new int[Y4.b.values().length];
            f3886a = iArr;
            try {
                iArr[Y4.b.BEGIN_ARRAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f3886a[Y4.b.BEGIN_OBJECT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f3886a[Y4.b.STRING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f3886a[Y4.b.NUMBER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f3886a[Y4.b.BOOLEAN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f3886a[Y4.b.NULL.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    private i(R4.d dVar, p pVar) {
        this.f3883a = dVar;
        this.f3884b = pVar;
    }

    public static r e(p pVar) {
        return pVar == o.f2897m ? f3882c : f(pVar);
    }

    private static r f(p pVar) {
        return new a(pVar);
    }

    private Object g(Y4.a aVar, Y4.b bVar) throws IOException {
        int i7 = b.f3886a[bVar.ordinal()];
        if (i7 == 3) {
            return aVar.H0();
        }
        if (i7 == 4) {
            return this.f3884b.e(aVar);
        }
        if (i7 == 5) {
            return Boolean.valueOf(aVar.U());
        }
        if (i7 == 6) {
            aVar.B0();
            return null;
        }
        throw new IllegalStateException("Unexpected token: " + bVar);
    }

    private Object h(Y4.a aVar, Y4.b bVar) throws IOException {
        int i7 = b.f3886a[bVar.ordinal()];
        if (i7 == 1) {
            aVar.a();
            return new ArrayList();
        }
        if (i7 != 2) {
            return null;
        }
        aVar.b();
        return new T4.h();
    }

    @Override // R4.q
    public Object b(Y4.a aVar) throws IOException {
        Y4.b bVarR0 = aVar.R0();
        Object objH = h(aVar, bVarR0);
        if (objH == null) {
            return g(aVar, bVarR0);
        }
        ArrayDeque arrayDeque = new ArrayDeque();
        while (true) {
            if (aVar.w()) {
                String strJ0 = objH instanceof Map ? aVar.j0() : null;
                Y4.b bVarR02 = aVar.R0();
                Object objH2 = h(aVar, bVarR02);
                boolean z6 = objH2 != null;
                if (objH2 == null) {
                    objH2 = g(aVar, bVarR02);
                }
                if (objH instanceof List) {
                    ((List) objH).add(objH2);
                } else {
                    ((Map) objH).put(strJ0, objH2);
                }
                if (z6) {
                    arrayDeque.addLast(objH);
                    objH = objH2;
                }
            } else {
                if (objH instanceof List) {
                    aVar.g();
                } else {
                    aVar.j();
                }
                if (arrayDeque.isEmpty()) {
                    return objH;
                }
                objH = arrayDeque.removeLast();
            }
        }
    }

    @Override // R4.q
    public void d(Y4.c cVar, Object obj) throws IOException {
        if (obj == null) {
            cVar.J();
            return;
        }
        q qVarL = this.f3883a.l(obj.getClass());
        if (!(qVarL instanceof i)) {
            qVarL.d(cVar, obj);
        } else {
            cVar.e();
            cVar.j();
        }
    }

    /* synthetic */ i(R4.d dVar, p pVar, a aVar) {
        this(dVar, pVar);
    }
}
