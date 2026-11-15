package w5;

import java.io.Serializable;
import u5.C2148b;

/* JADX INFO: renamed from: w5.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2199c implements D5.a, Serializable {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final Object f22716s = a.f22723m;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private transient D5.a f22717m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    protected final Object f22718n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final Class f22719o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final String f22720p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final String f22721q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final boolean f22722r;

    /* JADX INFO: renamed from: w5.c$a */
    private static class a implements Serializable {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private static final a f22723m = new a();

        private a() {
        }
    }

    protected AbstractC2199c(Object obj, Class cls, String str, String str2, boolean z6) {
        this.f22718n = obj;
        this.f22719o = cls;
        this.f22720p = str;
        this.f22721q = str2;
        this.f22722r = z6;
    }

    public D5.a a() {
        D5.a aVar = this.f22717m;
        if (aVar != null) {
            return aVar;
        }
        D5.a aVarB = b();
        this.f22717m = aVarB;
        return aVarB;
    }

    protected abstract D5.a b();

    public Object c() {
        return this.f22718n;
    }

    public String d() {
        return this.f22720p;
    }

    public D5.c g() {
        Class cls = this.f22719o;
        if (cls == null) {
            return null;
        }
        return this.f22722r ? w.c(cls) : w.b(cls);
    }

    protected D5.a h() {
        D5.a aVarA = a();
        if (aVarA != this) {
            return aVarA;
        }
        throw new C2148b();
    }

    public String k() {
        return this.f22721q;
    }
}
