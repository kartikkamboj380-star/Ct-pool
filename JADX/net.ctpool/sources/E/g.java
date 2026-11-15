package E;

import androidx.datastore.preferences.protobuf.AbstractC0606a;
import androidx.datastore.preferences.protobuf.AbstractC0627w;
import androidx.datastore.preferences.protobuf.AbstractC0629y;
import androidx.datastore.preferences.protobuf.P;
import androidx.datastore.preferences.protobuf.X;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class g extends AbstractC0627w implements P {
    private static final g DEFAULT_INSTANCE;
    private static volatile X PARSER = null;
    public static final int STRINGS_FIELD_NUMBER = 1;
    private AbstractC0629y.b strings_ = AbstractC0627w.r();

    public static final class a extends AbstractC0627w.a implements P {
        private a() {
            super(g.DEFAULT_INSTANCE);
        }

        public a v(Iterable iterable) {
            q();
            ((g) this.f7819n).I(iterable);
            return this;
        }

        /* synthetic */ a(e eVar) {
            this();
        }
    }

    static {
        g gVar = new g();
        DEFAULT_INSTANCE = gVar;
        AbstractC0627w.E(g.class, gVar);
    }

    private g() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void I(Iterable iterable) {
        J();
        AbstractC0606a.f(iterable, this.strings_);
    }

    private void J() {
        if (this.strings_.b1()) {
            return;
        }
        this.strings_ = AbstractC0627w.z(this.strings_);
    }

    public static g K() {
        return DEFAULT_INSTANCE;
    }

    public static a M() {
        return (a) DEFAULT_INSTANCE.n();
    }

    public List L() {
        return this.strings_;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0627w
    protected final Object q(AbstractC0627w.d dVar, Object obj, Object obj2) {
        e eVar = null;
        switch (e.f1017a[dVar.ordinal()]) {
            case 1:
                return new g();
            case 2:
                return new a(eVar);
            case 3:
                return AbstractC0627w.B(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"strings_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                X bVar = PARSER;
                if (bVar == null) {
                    synchronized (g.class) {
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
