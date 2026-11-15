package E;

import androidx.datastore.preferences.protobuf.AbstractC0627w;
import androidx.datastore.preferences.protobuf.H;
import androidx.datastore.preferences.protobuf.I;
import androidx.datastore.preferences.protobuf.P;
import androidx.datastore.preferences.protobuf.X;
import androidx.datastore.preferences.protobuf.r0;
import java.io.InputStream;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class f extends AbstractC0627w implements P {
    private static final f DEFAULT_INSTANCE;
    private static volatile X PARSER = null;
    public static final int PREFERENCES_FIELD_NUMBER = 1;
    private I preferences_ = I.e();

    public static final class a extends AbstractC0627w.a implements P {
        private a() {
            super(f.DEFAULT_INSTANCE);
        }

        public a v(String str, h hVar) {
            str.getClass();
            hVar.getClass();
            q();
            ((f) this.f7819n).I().put(str, hVar);
            return this;
        }

        /* synthetic */ a(e eVar) {
            this();
        }
    }

    private static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final H f1018a = H.d(r0.b.f7724w, "", r0.b.f7726y, h.P());
    }

    static {
        f fVar = new f();
        DEFAULT_INSTANCE = fVar;
        AbstractC0627w.E(f.class, fVar);
    }

    private f() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map I() {
        return K();
    }

    private I K() {
        if (!this.preferences_.j()) {
            this.preferences_ = this.preferences_.m();
        }
        return this.preferences_;
    }

    private I L() {
        return this.preferences_;
    }

    public static a M() {
        return (a) DEFAULT_INSTANCE.n();
    }

    public static f N(InputStream inputStream) {
        return (f) AbstractC0627w.C(DEFAULT_INSTANCE, inputStream);
    }

    public Map J() {
        return Collections.unmodifiableMap(L());
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0627w
    protected final Object q(AbstractC0627w.d dVar, Object obj, Object obj2) {
        e eVar = null;
        switch (e.f1017a[dVar.ordinal()]) {
            case 1:
                return new f();
            case 2:
                return new a(eVar);
            case 3:
                return AbstractC0627w.B(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"preferences_", b.f1018a});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                X bVar = PARSER;
                if (bVar == null) {
                    synchronized (f.class) {
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
