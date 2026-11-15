package s1;

import O0.q;
import i5.g;
import i5.j;
import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.DefaultConstructorMarker;
import s1.C2038c;
import v5.InterfaceC2171a;
import w5.k;
import w5.l;

/* JADX INFO: renamed from: s1.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2039d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final b f22254d = new b(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Lazy f22255e = g.a(j.f19966m, a.f22259m);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f22256a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List f22257b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final C2036a f22258c;

    /* JADX INFO: renamed from: s1.d$a */
    static final class a extends l implements InterfaceC2171a {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public static final a f22259m = new a();

        a() {
            super(0);
        }

        @Override // v5.InterfaceC2171a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C2039d invoke() {
            return new C2039d(null);
        }
    }

    /* JADX INFO: renamed from: s1.d$b */
    public static final class b {
        private b() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final int e(int i7, InputStream inputStream, byte[] bArr) throws IOException {
            if (bArr.length < i7) {
                throw new IllegalStateException("Check failed.".toString());
            }
            if (!inputStream.markSupported()) {
                return O0.a.b(inputStream, bArr, 0, i7);
            }
            try {
                inputStream.mark(i7);
                return O0.a.b(inputStream, bArr, 0, i7);
            } finally {
                inputStream.reset();
            }
        }

        public final C2038c b(InputStream inputStream) {
            k.f(inputStream, "is");
            return d().b(inputStream);
        }

        public final C2038c c(InputStream inputStream) throws Throwable {
            k.f(inputStream, "is");
            try {
                return b(inputStream);
            } catch (IOException e7) {
                RuntimeException runtimeExceptionA = q.a(e7);
                k.e(runtimeExceptionA, "propagate(ioe)");
                throw runtimeExceptionA;
            }
        }

        public final C2039d d() {
            return (C2039d) C2039d.f22255e.getValue();
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private C2039d() {
        this.f22258c = new C2036a();
        d();
    }

    public static final C2038c c(InputStream inputStream) {
        return f22254d.c(inputStream);
    }

    private final void d() {
        this.f22256a = this.f22258c.a();
        List list = this.f22257b;
        if (list != null) {
            k.c(list);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                this.f22256a = Math.max(this.f22256a, ((C2038c.b) it.next()).a());
            }
        }
    }

    public final C2038c b(InputStream inputStream) throws IOException {
        k.f(inputStream, "is");
        int i7 = this.f22256a;
        byte[] bArr = new byte[i7];
        int iE = f22254d.e(i7, inputStream, bArr);
        C2038c c2038cB = this.f22258c.b(bArr, iE);
        if (c2038cB != C2038c.f22251d) {
            return c2038cB;
        }
        List list = this.f22257b;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C2038c c2038cB2 = ((C2038c.b) it.next()).b(bArr, iE);
                if (c2038cB2 != C2038c.f22251d) {
                    return c2038cB2;
                }
            }
        }
        return C2038c.f22251d;
    }

    public /* synthetic */ C2039d(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
