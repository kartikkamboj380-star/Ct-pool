package U4;

import R4.o;
import R4.p;
import R4.q;
import R4.r;
import com.google.gson.reflect.TypeToken;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class h extends q {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final r f3878b = f(o.f2898n);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p f3879a;

    class a implements r {
        a() {
        }

        @Override // R4.r
        public q a(R4.d dVar, TypeToken typeToken) {
            if (typeToken.getRawType() == Number.class) {
                return h.this;
            }
            return null;
        }
    }

    static /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f3881a;

        static {
            int[] iArr = new int[Y4.b.values().length];
            f3881a = iArr;
            try {
                iArr[Y4.b.NULL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f3881a[Y4.b.NUMBER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f3881a[Y4.b.STRING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    private h(p pVar) {
        this.f3879a = pVar;
    }

    public static r e(p pVar) {
        return pVar == o.f2898n ? f3878b : f(pVar);
    }

    private static r f(p pVar) {
        return new h(pVar).new a();
    }

    @Override // R4.q
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public Number b(Y4.a aVar) throws IOException {
        Y4.b bVarR0 = aVar.R0();
        int i7 = b.f3881a[bVarR0.ordinal()];
        if (i7 == 1) {
            aVar.B0();
            return null;
        }
        if (i7 == 2 || i7 == 3) {
            return this.f3879a.e(aVar);
        }
        throw new R4.l("Expecting number, got: " + bVarR0 + "; at path " + aVar.F0());
    }

    @Override // R4.q
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public void d(Y4.c cVar, Number number) throws IOException {
        cVar.b1(number);
    }
}
