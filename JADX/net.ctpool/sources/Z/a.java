package Z;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
public final class a implements j {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final C0106a f4609o = new C0106a(null);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final String f4610m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Object[] f4611n;

    /* JADX INFO: renamed from: Z.a$a, reason: collision with other inner class name */
    public static final class C0106a {
        private C0106a() {
        }

        private final void a(i iVar, int i7, Object obj) {
            long jLongValue;
            int iByteValue;
            double dDoubleValue;
            if (obj == null) {
                iVar.A0(i7);
                return;
            }
            if (obj instanceof byte[]) {
                iVar.i0(i7, (byte[]) obj);
                return;
            }
            if (obj instanceof Float) {
                dDoubleValue = ((Number) obj).floatValue();
            } else {
                if (!(obj instanceof Double)) {
                    if (obj instanceof Long) {
                        jLongValue = ((Number) obj).longValue();
                    } else {
                        if (obj instanceof Integer) {
                            iByteValue = ((Number) obj).intValue();
                        } else if (obj instanceof Short) {
                            iByteValue = ((Number) obj).shortValue();
                        } else if (obj instanceof Byte) {
                            iByteValue = ((Number) obj).byteValue();
                        } else {
                            if (obj instanceof String) {
                                iVar.v(i7, (String) obj);
                                return;
                            }
                            if (!(obj instanceof Boolean)) {
                                throw new IllegalArgumentException("Cannot bind " + obj + " at index " + i7 + " Supported types: Null, ByteArray, Float, Double, Long, Int, Short, Byte, String");
                            }
                            jLongValue = ((Boolean) obj).booleanValue() ? 1L : 0L;
                        }
                        jLongValue = iByteValue;
                    }
                    iVar.b0(i7, jLongValue);
                    return;
                }
                dDoubleValue = ((Number) obj).doubleValue();
            }
            iVar.L(i7, dDoubleValue);
        }

        public final void b(i iVar, Object[] objArr) {
            w5.k.f(iVar, "statement");
            if (objArr == null) {
                return;
            }
            int length = objArr.length;
            int i7 = 0;
            while (i7 < length) {
                Object obj = objArr[i7];
                i7++;
                a(iVar, i7, obj);
            }
        }

        public /* synthetic */ C0106a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a(String str) {
        this(str, null);
        w5.k.f(str, "query");
    }

    @Override // Z.j
    public void a(i iVar) {
        w5.k.f(iVar, "statement");
        f4609o.b(iVar, this.f4611n);
    }

    @Override // Z.j
    public String b() {
        return this.f4610m;
    }

    public a(String str, Object[] objArr) {
        w5.k.f(str, "query");
        this.f4610m = str;
        this.f4611n = objArr;
    }
}
