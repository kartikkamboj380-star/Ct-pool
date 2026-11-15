package B4;

import B4.j;
import a4.InterfaceC0514a;
import android.content.Context;
import android.util.Base64OutputStream;
import b4.C0684E;
import b4.C0688c;
import b4.C0702q;
import b4.InterfaceC0689d;
import b4.InterfaceC0692g;
import java.io.ByteArrayOutputStream;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.zip.GZIPOutputStream;
import org.json.JSONArray;
import org.json.JSONObject;
import z3.AbstractC2272l;
import z3.AbstractC2275o;

/* JADX INFO: loaded from: classes.dex */
public class f implements i, j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final D4.b f758a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Context f759b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final D4.b f760c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Set f761d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Executor f762e;

    f(D4.b bVar, Set set, Executor executor, D4.b bVar2, Context context) {
        this.f758a = bVar;
        this.f761d = set;
        this.f762e = executor;
        this.f760c = bVar2;
        this.f759b = context;
    }

    public static C0688c g() {
        final C0684E c0684eA = C0684E.a(InterfaceC0514a.class, Executor.class);
        return C0688c.f(f.class, i.class, j.class).b(C0702q.l(Context.class)).b(C0702q.l(Y3.f.class)).b(C0702q.o(g.class)).b(C0702q.n(L4.i.class)).b(C0702q.k(c0684eA)).f(new InterfaceC0692g() { // from class: B4.b
            @Override // b4.InterfaceC0692g
            public final Object a(InterfaceC0689d interfaceC0689d) {
                return f.h(c0684eA, interfaceC0689d);
            }
        }).d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ f h(C0684E c0684e, InterfaceC0689d interfaceC0689d) {
        return new f((Context) interfaceC0689d.a(Context.class), ((Y3.f) interfaceC0689d.a(Y3.f.class)).s(), interfaceC0689d.g(g.class), interfaceC0689d.b(L4.i.class), (Executor) interfaceC0689d.e(c0684e));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ String i() {
        String string;
        synchronized (this) {
            try {
                q qVar = (q) this.f758a.get();
                List listC = qVar.c();
                qVar.b();
                JSONArray jSONArray = new JSONArray();
                for (int i7 = 0; i7 < listC.size(); i7++) {
                    r rVar = (r) listC.get(i7);
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("agent", rVar.c());
                    jSONObject.put("dates", new JSONArray((Collection) rVar.b()));
                    jSONArray.put(jSONObject);
                }
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("heartbeats", jSONArray);
                jSONObject2.put("version", "2");
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                Base64OutputStream base64OutputStream = new Base64OutputStream(byteArrayOutputStream, 11);
                try {
                    GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(base64OutputStream);
                    try {
                        gZIPOutputStream.write(jSONObject2.toString().getBytes("UTF-8"));
                        gZIPOutputStream.close();
                        base64OutputStream.close();
                        string = byteArrayOutputStream.toString("UTF-8");
                    } finally {
                    }
                } finally {
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return string;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ q j(Context context, String str) {
        return new q(context, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Void k() {
        synchronized (this) {
            ((q) this.f758a.get()).k(System.currentTimeMillis(), ((L4.i) this.f760c.get()).a());
        }
        return null;
    }

    @Override // B4.i
    public AbstractC2272l a() {
        return androidx.core.os.p.a(this.f759b) ^ true ? AbstractC2275o.f("") : AbstractC2275o.d(this.f762e, new Callable() { // from class: B4.d
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f756a.i();
            }
        });
    }

    @Override // B4.j
    public synchronized j.a b(String str) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        q qVar = (q) this.f758a.get();
        if (!qVar.i(jCurrentTimeMillis)) {
            return j.a.NONE;
        }
        qVar.g();
        return j.a.GLOBAL;
    }

    public AbstractC2272l l() {
        return this.f761d.size() <= 0 ? AbstractC2275o.f(null) : androidx.core.os.p.a(this.f759b) ^ true ? AbstractC2275o.f(null) : AbstractC2275o.d(this.f762e, new Callable() { // from class: B4.e
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f757a.k();
            }
        });
    }

    private f(final Context context, final String str, Set set, D4.b bVar, Executor executor) {
        this(new D4.b() { // from class: B4.c
            @Override // D4.b
            public final Object get() {
                return f.j(context, str);
            }
        }, set, executor, bVar, context);
    }
}
