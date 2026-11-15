package z4;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import z4.d;

/* JADX INFO: loaded from: classes.dex */
final class f implements w4.e {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Charset f23321f = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final w4.c f23322g = w4.c.a("key").b(C2277a.b().c(1).a()).a();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final w4.c f23323h = w4.c.a("value").b(C2277a.b().c(2).a()).a();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final w4.d f23324i = new w4.d() { // from class: z4.e
        @Override // w4.d
        public final void a(Object obj, Object obj2) {
            f.w((Map.Entry) obj, (w4.e) obj2);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private OutputStream f23325a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f23326b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map f23327c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final w4.d f23328d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final i f23329e = new i(this);

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f23330a;

        static {
            int[] iArr = new int[d.a.values().length];
            f23330a = iArr;
            try {
                iArr[d.a.DEFAULT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f23330a[d.a.SIGNED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f23330a[d.a.FIXED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    f(OutputStream outputStream, Map map, Map map2, w4.d dVar) {
        this.f23325a = outputStream;
        this.f23326b = map;
        this.f23327c = map2;
        this.f23328d = dVar;
    }

    private static ByteBuffer p(int i7) {
        return ByteBuffer.allocate(i7).order(ByteOrder.LITTLE_ENDIAN);
    }

    private long q(w4.d dVar, Object obj) throws IOException {
        C2278b c2278b = new C2278b();
        try {
            OutputStream outputStream = this.f23325a;
            this.f23325a = c2278b;
            try {
                dVar.a(obj, this);
                this.f23325a = outputStream;
                long jA = c2278b.a();
                c2278b.close();
                return jA;
            } catch (Throwable th) {
                this.f23325a = outputStream;
                throw th;
            }
        } catch (Throwable th2) {
            try {
                c2278b.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    private f r(w4.d dVar, w4.c cVar, Object obj, boolean z6) throws IOException {
        long jQ = q(dVar, obj);
        if (z6 && jQ == 0) {
            return this;
        }
        x((v(cVar) << 3) | 2);
        y(jQ);
        dVar.a(obj, this);
        return this;
    }

    private f s(w4.f fVar, w4.c cVar, Object obj, boolean z6) {
        this.f23329e.b(cVar, z6);
        fVar.a(obj, this.f23329e);
        return this;
    }

    private static d u(w4.c cVar) {
        d dVar = (d) cVar.c(d.class);
        if (dVar != null) {
            return dVar;
        }
        throw new w4.b("Field has no @Protobuf config");
    }

    private static int v(w4.c cVar) {
        d dVar = (d) cVar.c(d.class);
        if (dVar != null) {
            return dVar.tag();
        }
        throw new w4.b("Field has no @Protobuf config");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void w(Map.Entry entry, w4.e eVar) {
        eVar.a(f23322g, entry.getKey());
        eVar.a(f23323h, entry.getValue());
    }

    private void x(int i7) throws IOException {
        while ((i7 & (-128)) != 0) {
            this.f23325a.write((i7 & ModuleDescriptor.MODULE_VERSION) | 128);
            i7 >>>= 7;
        }
        this.f23325a.write(i7 & ModuleDescriptor.MODULE_VERSION);
    }

    private void y(long j7) throws IOException {
        while (((-128) & j7) != 0) {
            this.f23325a.write((((int) j7) & ModuleDescriptor.MODULE_VERSION) | 128);
            j7 >>>= 7;
        }
        this.f23325a.write(((int) j7) & ModuleDescriptor.MODULE_VERSION);
    }

    @Override // w4.e
    public w4.e a(w4.c cVar, Object obj) {
        return i(cVar, obj, true);
    }

    @Override // w4.e
    public w4.e c(w4.c cVar, double d7) {
        return g(cVar, d7, true);
    }

    w4.e g(w4.c cVar, double d7, boolean z6) throws IOException {
        if (z6 && d7 == 0.0d) {
            return this;
        }
        x((v(cVar) << 3) | 1);
        this.f23325a.write(p(8).putDouble(d7).array());
        return this;
    }

    w4.e h(w4.c cVar, float f7, boolean z6) throws IOException {
        if (z6 && f7 == 0.0f) {
            return this;
        }
        x((v(cVar) << 3) | 5);
        this.f23325a.write(p(4).putFloat(f7).array());
        return this;
    }

    w4.e i(w4.c cVar, Object obj, boolean z6) throws IOException {
        if (obj == null) {
            return this;
        }
        if (obj instanceof CharSequence) {
            CharSequence charSequence = (CharSequence) obj;
            if (z6 && charSequence.length() == 0) {
                return this;
            }
            x((v(cVar) << 3) | 2);
            byte[] bytes = charSequence.toString().getBytes(f23321f);
            x(bytes.length);
            this.f23325a.write(bytes);
            return this;
        }
        if (obj instanceof Collection) {
            Iterator it = ((Collection) obj).iterator();
            while (it.hasNext()) {
                i(cVar, it.next(), false);
            }
            return this;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                r(f23324i, cVar, (Map.Entry) it2.next(), false);
            }
            return this;
        }
        if (obj instanceof Double) {
            return g(cVar, ((Double) obj).doubleValue(), z6);
        }
        if (obj instanceof Float) {
            return h(cVar, ((Float) obj).floatValue(), z6);
        }
        if (obj instanceof Number) {
            return m(cVar, ((Number) obj).longValue(), z6);
        }
        if (obj instanceof Boolean) {
            return o(cVar, ((Boolean) obj).booleanValue(), z6);
        }
        if (!(obj instanceof byte[])) {
            w4.d dVar = (w4.d) this.f23326b.get(obj.getClass());
            if (dVar != null) {
                return r(dVar, cVar, obj, z6);
            }
            w4.f fVar = (w4.f) this.f23327c.get(obj.getClass());
            return fVar != null ? s(fVar, cVar, obj, z6) : obj instanceof c ? b(cVar, ((c) obj).d()) : obj instanceof Enum ? b(cVar, ((Enum) obj).ordinal()) : r(this.f23328d, cVar, obj, z6);
        }
        byte[] bArr = (byte[]) obj;
        if (z6 && bArr.length == 0) {
            return this;
        }
        x((v(cVar) << 3) | 2);
        x(bArr.length);
        this.f23325a.write(bArr);
        return this;
    }

    @Override // w4.e
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public f b(w4.c cVar, int i7) {
        return k(cVar, i7, true);
    }

    f k(w4.c cVar, int i7, boolean z6) throws IOException {
        if (z6 && i7 == 0) {
            return this;
        }
        d dVarU = u(cVar);
        int i8 = a.f23330a[dVarU.intEncoding().ordinal()];
        if (i8 == 1) {
            x(dVarU.tag() << 3);
            x(i7);
        } else if (i8 == 2) {
            x(dVarU.tag() << 3);
            x((i7 << 1) ^ (i7 >> 31));
        } else if (i8 == 3) {
            x((dVarU.tag() << 3) | 5);
            this.f23325a.write(p(4).putInt(i7).array());
        }
        return this;
    }

    @Override // w4.e
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public f d(w4.c cVar, long j7) {
        return m(cVar, j7, true);
    }

    f m(w4.c cVar, long j7, boolean z6) throws IOException {
        if (z6 && j7 == 0) {
            return this;
        }
        d dVarU = u(cVar);
        int i7 = a.f23330a[dVarU.intEncoding().ordinal()];
        if (i7 == 1) {
            x(dVarU.tag() << 3);
            y(j7);
        } else if (i7 == 2) {
            x(dVarU.tag() << 3);
            y((j7 >> 63) ^ (j7 << 1));
        } else if (i7 == 3) {
            x((dVarU.tag() << 3) | 1);
            this.f23325a.write(p(8).putLong(j7).array());
        }
        return this;
    }

    @Override // w4.e
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public f e(w4.c cVar, boolean z6) {
        return o(cVar, z6, true);
    }

    f o(w4.c cVar, boolean z6, boolean z7) {
        return k(cVar, z6 ? 1 : 0, z7);
    }

    f t(Object obj) {
        if (obj == null) {
            return this;
        }
        w4.d dVar = (w4.d) this.f23326b.get(obj.getClass());
        if (dVar != null) {
            dVar.a(obj, this);
            return this;
        }
        throw new w4.b("No encoder for " + obj.getClass());
    }
}
