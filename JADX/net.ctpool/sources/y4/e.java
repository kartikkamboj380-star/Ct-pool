package y4;

import android.util.Base64;
import android.util.JsonWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.Map;
import w4.g;

/* JADX INFO: loaded from: classes.dex */
final class e implements w4.e, g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private e f23225a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f23226b = true;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final JsonWriter f23227c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Map f23228d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Map f23229e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final w4.d f23230f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f23231g;

    e(Writer writer, Map map, Map map2, w4.d dVar, boolean z6) {
        this.f23227c = new JsonWriter(writer);
        this.f23228d = map;
        this.f23229e = map2;
        this.f23230f = dVar;
        this.f23231g = z6;
    }

    private boolean t(Object obj) {
        return obj == null || obj.getClass().isArray() || (obj instanceof Collection) || (obj instanceof Date) || (obj instanceof Enum) || (obj instanceof Number);
    }

    private e w(String str, Object obj) throws IOException {
        y();
        this.f23227c.name(str);
        if (obj != null) {
            return k(obj, false);
        }
        this.f23227c.nullValue();
        return this;
    }

    private e x(String str, Object obj) throws IOException {
        if (obj == null) {
            return this;
        }
        y();
        this.f23227c.name(str);
        return k(obj, false);
    }

    private void y() throws IOException {
        if (!this.f23226b) {
            throw new IllegalStateException("Parent context used since this context was created. Cannot use this context anymore.");
        }
        e eVar = this.f23225a;
        if (eVar != null) {
            eVar.y();
            this.f23225a.f23226b = false;
            this.f23225a = null;
            this.f23227c.endObject();
        }
    }

    @Override // w4.e
    public w4.e a(w4.c cVar, Object obj) {
        return p(cVar.b(), obj);
    }

    @Override // w4.e
    public w4.e b(w4.c cVar, int i7) {
        return n(cVar.b(), i7);
    }

    @Override // w4.e
    public w4.e c(w4.c cVar, double d7) {
        return m(cVar.b(), d7);
    }

    @Override // w4.e
    public w4.e d(w4.c cVar, long j7) {
        return o(cVar.b(), j7);
    }

    @Override // w4.e
    public w4.e e(w4.c cVar, boolean z6) {
        return q(cVar.b(), z6);
    }

    public e h(double d7) throws IOException {
        y();
        this.f23227c.value(d7);
        return this;
    }

    public e i(int i7) throws IOException {
        y();
        this.f23227c.value(i7);
        return this;
    }

    public e j(long j7) throws IOException {
        y();
        this.f23227c.value(j7);
        return this;
    }

    e k(Object obj, boolean z6) {
        if (z6 && t(obj)) {
            throw new w4.b(String.format("%s cannot be encoded inline", obj == null ? null : obj.getClass()));
        }
        if (obj == null) {
            this.f23227c.nullValue();
            return this;
        }
        if (obj instanceof Number) {
            this.f23227c.value((Number) obj);
            return this;
        }
        int i7 = 0;
        if (!obj.getClass().isArray()) {
            if (obj instanceof Collection) {
                this.f23227c.beginArray();
                Iterator it = ((Collection) obj).iterator();
                while (it.hasNext()) {
                    k(it.next(), false);
                }
                this.f23227c.endArray();
                return this;
            }
            if (obj instanceof Map) {
                this.f23227c.beginObject();
                for (Map.Entry entry : ((Map) obj).entrySet()) {
                    Object key = entry.getKey();
                    try {
                        p((String) key, entry.getValue());
                    } catch (ClassCastException e7) {
                        throw new w4.b(String.format("Only String keys are currently supported in maps, got %s of type %s instead.", key, key.getClass()), e7);
                    }
                }
                this.f23227c.endObject();
                return this;
            }
            w4.d dVar = (w4.d) this.f23228d.get(obj.getClass());
            if (dVar != null) {
                return v(dVar, obj, z6);
            }
            w4.f fVar = (w4.f) this.f23229e.get(obj.getClass());
            if (fVar != null) {
                fVar.a(obj, this);
                return this;
            }
            if (!(obj instanceof Enum)) {
                return v(this.f23230f, obj, z6);
            }
            if (obj instanceof f) {
                i(((f) obj).d());
            } else {
                f(((Enum) obj).name());
            }
            return this;
        }
        if (obj instanceof byte[]) {
            return s((byte[]) obj);
        }
        this.f23227c.beginArray();
        if (obj instanceof int[]) {
            int length = ((int[]) obj).length;
            while (i7 < length) {
                this.f23227c.value(r6[i7]);
                i7++;
            }
        } else if (obj instanceof long[]) {
            long[] jArr = (long[]) obj;
            int length2 = jArr.length;
            while (i7 < length2) {
                j(jArr[i7]);
                i7++;
            }
        } else if (obj instanceof double[]) {
            double[] dArr = (double[]) obj;
            int length3 = dArr.length;
            while (i7 < length3) {
                this.f23227c.value(dArr[i7]);
                i7++;
            }
        } else if (obj instanceof boolean[]) {
            boolean[] zArr = (boolean[]) obj;
            int length4 = zArr.length;
            while (i7 < length4) {
                this.f23227c.value(zArr[i7]);
                i7++;
            }
        } else if (obj instanceof Number[]) {
            for (Number number : (Number[]) obj) {
                k(number, false);
            }
        } else {
            for (Object obj2 : (Object[]) obj) {
                k(obj2, false);
            }
        }
        this.f23227c.endArray();
        return this;
    }

    @Override // w4.g
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public e f(String str) throws IOException {
        y();
        this.f23227c.value(str);
        return this;
    }

    public e m(String str, double d7) throws IOException {
        y();
        this.f23227c.name(str);
        return h(d7);
    }

    public e n(String str, int i7) throws IOException {
        y();
        this.f23227c.name(str);
        return i(i7);
    }

    public e o(String str, long j7) throws IOException {
        y();
        this.f23227c.name(str);
        return j(j7);
    }

    public e p(String str, Object obj) {
        return this.f23231g ? x(str, obj) : w(str, obj);
    }

    public e q(String str, boolean z6) throws IOException {
        y();
        this.f23227c.name(str);
        return g(z6);
    }

    @Override // w4.g
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public e g(boolean z6) throws IOException {
        y();
        this.f23227c.value(z6);
        return this;
    }

    public e s(byte[] bArr) throws IOException {
        y();
        if (bArr == null) {
            this.f23227c.nullValue();
        } else {
            this.f23227c.value(Base64.encodeToString(bArr, 2));
        }
        return this;
    }

    void u() {
        y();
        this.f23227c.flush();
    }

    e v(w4.d dVar, Object obj, boolean z6) throws IOException {
        if (!z6) {
            this.f23227c.beginObject();
        }
        dVar.a(obj, this);
        if (!z6) {
            this.f23227c.endObject();
        }
        return this;
    }
}
