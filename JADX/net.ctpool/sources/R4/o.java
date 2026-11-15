package R4;

import java.io.IOException;
import java.math.BigDecimal;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public abstract class o implements p {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final o f2897m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final o f2898n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final o f2899o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final o f2900p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final /* synthetic */ o[] f2901q;

    enum a extends o {
        a(String str, int i7) {
            super(str, i7, null);
        }

        @Override // R4.p
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public Double e(Y4.a aVar) {
            return Double.valueOf(aVar.W());
        }
    }

    static {
        a aVar = new a("DOUBLE", 0);
        f2897m = aVar;
        o oVar = new o("LAZILY_PARSED_NUMBER", 1) { // from class: R4.o.b
            {
                a aVar2 = null;
            }

            @Override // R4.p
            public Number e(Y4.a aVar2) {
                return new T4.g(aVar2.H0());
            }
        };
        f2898n = oVar;
        o oVar2 = new o("LONG_OR_DOUBLE", 2) { // from class: R4.o.c
            {
                a aVar2 = null;
            }

            @Override // R4.p
            public Number e(Y4.a aVar2) throws IOException {
                String strH0 = aVar2.H0();
                try {
                    try {
                        return Long.valueOf(Long.parseLong(strH0));
                    } catch (NumberFormatException unused) {
                        Double dValueOf = Double.valueOf(strH0);
                        if (dValueOf.isInfinite() || dValueOf.isNaN()) {
                            if (!aVar2.z()) {
                                throw new Y4.d("JSON forbids NaN and infinities: " + dValueOf + "; at path " + aVar2.o());
                            }
                        }
                        return dValueOf;
                    }
                } catch (NumberFormatException e7) {
                    throw new j("Cannot parse " + strH0 + "; at path " + aVar2.o(), e7);
                }
            }
        };
        f2899o = oVar2;
        o oVar3 = new o("BIG_DECIMAL", 3) { // from class: R4.o.d
            {
                a aVar2 = null;
            }

            @Override // R4.p
            /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
            public BigDecimal e(Y4.a aVar2) throws IOException {
                String strH0 = aVar2.H0();
                try {
                    return new BigDecimal(strH0);
                } catch (NumberFormatException e7) {
                    throw new j("Cannot parse " + strH0 + "; at path " + aVar2.o(), e7);
                }
            }
        };
        f2900p = oVar3;
        f2901q = new o[]{aVar, oVar, oVar2, oVar3};
    }

    private o(String str, int i7) {
    }

    public static o valueOf(String str) {
        return (o) Enum.valueOf(o.class, str);
    }

    public static o[] values() {
        return (o[]) f2901q.clone();
    }

    /* synthetic */ o(String str, int i7, a aVar) {
        this(str, i7);
    }
}
