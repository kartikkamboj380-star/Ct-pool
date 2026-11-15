package E;

import E.g;
import androidx.datastore.preferences.protobuf.AbstractC0627w;
import androidx.datastore.preferences.protobuf.P;
import androidx.datastore.preferences.protobuf.X;

/* JADX INFO: loaded from: classes.dex */
public final class h extends AbstractC0627w implements P {
    public static final int BOOLEAN_FIELD_NUMBER = 1;
    private static final h DEFAULT_INSTANCE;
    public static final int DOUBLE_FIELD_NUMBER = 7;
    public static final int FLOAT_FIELD_NUMBER = 2;
    public static final int INTEGER_FIELD_NUMBER = 3;
    public static final int LONG_FIELD_NUMBER = 4;
    private static volatile X PARSER = null;
    public static final int STRING_FIELD_NUMBER = 5;
    public static final int STRING_SET_FIELD_NUMBER = 6;
    private int bitField0_;
    private int valueCase_ = 0;
    private Object value_;

    public static final class a extends AbstractC0627w.a implements P {
        private a() {
            super(h.DEFAULT_INSTANCE);
        }

        public a A(long j7) {
            q();
            ((h) this.f7819n).c0(j7);
            return this;
        }

        public a B(String str) {
            q();
            ((h) this.f7819n).d0(str);
            return this;
        }

        public a C(g.a aVar) {
            q();
            ((h) this.f7819n).e0(aVar);
            return this;
        }

        public a v(boolean z6) {
            q();
            ((h) this.f7819n).Y(z6);
            return this;
        }

        public a x(double d7) {
            q();
            ((h) this.f7819n).Z(d7);
            return this;
        }

        public a y(float f7) {
            q();
            ((h) this.f7819n).a0(f7);
            return this;
        }

        public a z(int i7) {
            q();
            ((h) this.f7819n).b0(i7);
            return this;
        }

        /* synthetic */ a(e eVar) {
            this();
        }
    }

    public enum b {
        BOOLEAN(1),
        FLOAT(2),
        INTEGER(3),
        LONG(4),
        STRING(5),
        STRING_SET(6),
        DOUBLE(7),
        VALUE_NOT_SET(0);


        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private final int f1028m;

        b(int i7) {
            this.f1028m = i7;
        }

        public static b e(int i7) {
            switch (i7) {
                case 0:
                    return VALUE_NOT_SET;
                case 1:
                    return BOOLEAN;
                case 2:
                    return FLOAT;
                case 3:
                    return INTEGER;
                case 4:
                    return LONG;
                case 5:
                    return STRING;
                case 6:
                    return STRING_SET;
                case 7:
                    return DOUBLE;
                default:
                    return null;
            }
        }
    }

    static {
        h hVar = new h();
        DEFAULT_INSTANCE = hVar;
        AbstractC0627w.E(h.class, hVar);
    }

    private h() {
    }

    public static h P() {
        return DEFAULT_INSTANCE;
    }

    public static a X() {
        return (a) DEFAULT_INSTANCE.n();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Y(boolean z6) {
        this.valueCase_ = 1;
        this.value_ = Boolean.valueOf(z6);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Z(double d7) {
        this.valueCase_ = 7;
        this.value_ = Double.valueOf(d7);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a0(float f7) {
        this.valueCase_ = 2;
        this.value_ = Float.valueOf(f7);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b0(int i7) {
        this.valueCase_ = 3;
        this.value_ = Integer.valueOf(i7);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c0(long j7) {
        this.valueCase_ = 4;
        this.value_ = Long.valueOf(j7);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d0(String str) {
        str.getClass();
        this.valueCase_ = 5;
        this.value_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e0(g.a aVar) {
        this.value_ = aVar.l();
        this.valueCase_ = 6;
    }

    public boolean O() {
        if (this.valueCase_ == 1) {
            return ((Boolean) this.value_).booleanValue();
        }
        return false;
    }

    public double Q() {
        if (this.valueCase_ == 7) {
            return ((Double) this.value_).doubleValue();
        }
        return 0.0d;
    }

    public float R() {
        if (this.valueCase_ == 2) {
            return ((Float) this.value_).floatValue();
        }
        return 0.0f;
    }

    public int S() {
        if (this.valueCase_ == 3) {
            return ((Integer) this.value_).intValue();
        }
        return 0;
    }

    public long T() {
        if (this.valueCase_ == 4) {
            return ((Long) this.value_).longValue();
        }
        return 0L;
    }

    public String U() {
        return this.valueCase_ == 5 ? (String) this.value_ : "";
    }

    public g V() {
        return this.valueCase_ == 6 ? (g) this.value_ : g.K();
    }

    public b W() {
        return b.e(this.valueCase_);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0627w
    protected final Object q(AbstractC0627w.d dVar, Object obj, Object obj2) {
        e eVar = null;
        switch (e.f1017a[dVar.ordinal()]) {
            case 1:
                return new h();
            case 2:
                return new a(eVar);
            case 3:
                return AbstractC0627w.B(DEFAULT_INSTANCE, "\u0001\u0007\u0001\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001:\u0000\u00024\u0000\u00037\u0000\u00045\u0000\u0005;\u0000\u0006<\u0000\u00073\u0000", new Object[]{"value_", "valueCase_", "bitField0_", g.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                X bVar = PARSER;
                if (bVar == null) {
                    synchronized (h.class) {
                        try {
                            bVar = PARSER;
                            if (bVar == null) {
                                bVar = new AbstractC0627w.b(DEFAULT_INSTANCE);
                                PARSER = bVar;
                            }
                        } finally {
                        }
                        break;
                    }
                }
                return bVar;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
