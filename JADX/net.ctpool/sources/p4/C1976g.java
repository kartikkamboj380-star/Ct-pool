package p4;

import android.content.Context;
import android.content.SharedPreferences;
import e4.C1629g;
import h4.AbstractC1721j;
import h4.F;
import h4.G;
import h4.H;
import h4.L;
import h4.d0;
import java.util.Locale;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicReference;
import n4.C1928g;
import org.json.JSONObject;
import z3.AbstractC2272l;
import z3.AbstractC2275o;
import z3.C2273m;
import z3.InterfaceC2271k;

/* JADX INFO: renamed from: p4.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1976g implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f21636a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final k f21637b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final C1977h f21638c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final F f21639d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final C1970a f21640e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final l f21641f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final G f21642g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final AtomicReference f21643h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final AtomicReference f21644i;

    /* JADX INFO: renamed from: p4.g$a */
    class a implements InterfaceC2271k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ i4.f f21645a;

        a(i4.f fVar) {
            this.f21645a = fVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ JSONObject b() {
            return C1976g.this.f21641f.a(C1976g.this.f21637b, true);
        }

        @Override // z3.InterfaceC2271k
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public AbstractC2272l then(Void r52) throws Throwable {
            JSONObject jSONObject = (JSONObject) this.f21645a.f19954d.c().submit(new Callable() { // from class: p4.f
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return this.f21635a.b();
                }
            }).get();
            if (jSONObject != null) {
                C1973d c1973dB = C1976g.this.f21638c.b(jSONObject);
                C1976g.this.f21640e.c(c1973dB.f21620c, jSONObject);
                C1976g.this.q(jSONObject, "Loaded settings: ");
                C1976g c1976g = C1976g.this;
                c1976g.r(c1976g.f21637b.f21653f);
                C1976g.this.f21643h.set(c1973dB);
                ((C2273m) C1976g.this.f21644i.get()).e(c1973dB);
            }
            return AbstractC2275o.f(null);
        }
    }

    C1976g(Context context, k kVar, F f7, C1977h c1977h, C1970a c1970a, l lVar, G g7) {
        AtomicReference atomicReference = new AtomicReference();
        this.f21643h = atomicReference;
        this.f21644i = new AtomicReference(new C2273m());
        this.f21636a = context;
        this.f21637b = kVar;
        this.f21639d = f7;
        this.f21638c = c1977h;
        this.f21640e = c1970a;
        this.f21641f = lVar;
        this.f21642g = g7;
        atomicReference.set(C1971b.b(f7));
    }

    public static C1976g l(Context context, String str, L l7, m4.b bVar, String str2, String str3, C1928g c1928g, G g7) {
        String strG = l7.g();
        d0 d0Var = new d0();
        return new C1976g(context, new k(str, l7.h(), l7.i(), l7.j(), l7, AbstractC1721j.h(AbstractC1721j.m(context), str, str3, str2), str3, str2, H.h(strG).j()), d0Var, new C1977h(d0Var), new C1970a(c1928g), new C1972c(String.format(Locale.US, "https://firebase-settings.crashlytics.com/spi/v2/platforms/android/gmp/%s/settings", str), bVar), g7);
    }

    private C1973d m(EnumC1974e enumC1974e) throws Throwable {
        C1973d c1973d = null;
        try {
            if (!EnumC1974e.SKIP_CACHE_LOOKUP.equals(enumC1974e)) {
                JSONObject jSONObjectB = this.f21640e.b();
                if (jSONObjectB != null) {
                    C1973d c1973dB = this.f21638c.b(jSONObjectB);
                    if (c1973dB != null) {
                        q(jSONObjectB, "Loaded cached settings: ");
                        long jA = this.f21639d.a();
                        if (EnumC1974e.IGNORE_CACHE_EXPIRATION.equals(enumC1974e) || !c1973dB.a(jA)) {
                            try {
                                C1629g.f().i("Returning cached settings.");
                                c1973d = c1973dB;
                            } catch (Exception e7) {
                                e = e7;
                                c1973d = c1973dB;
                                C1629g.f().e("Failed to get cached settings", e);
                            }
                        } else {
                            C1629g.f().i("Cached settings have expired.");
                        }
                    } else {
                        C1629g.f().e("Failed to parse cached settings data.", null);
                    }
                } else {
                    C1629g.f().b("No cached settings data found.");
                }
            }
        } catch (Exception e8) {
            e = e8;
        }
        return c1973d;
    }

    private String n() {
        return AbstractC1721j.q(this.f21636a).getString("existing_instance_identifier", "");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void q(JSONObject jSONObject, String str) {
        C1629g.f().b(str + jSONObject.toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean r(String str) {
        SharedPreferences.Editor editorEdit = AbstractC1721j.q(this.f21636a).edit();
        editorEdit.putString("existing_instance_identifier", str);
        editorEdit.apply();
        return true;
    }

    @Override // p4.j
    public AbstractC2272l a() {
        return ((C2273m) this.f21644i.get()).a();
    }

    @Override // p4.j
    public C1973d b() {
        return (C1973d) this.f21643h.get();
    }

    boolean k() {
        return !n().equals(this.f21637b.f21653f);
    }

    public AbstractC2272l o(i4.f fVar) {
        return p(EnumC1974e.USE_CACHE, fVar);
    }

    public AbstractC2272l p(EnumC1974e enumC1974e, i4.f fVar) throws Throwable {
        C1973d c1973dM;
        if (!k() && (c1973dM = m(enumC1974e)) != null) {
            this.f21643h.set(c1973dM);
            ((C2273m) this.f21644i.get()).e(c1973dM);
            return AbstractC2275o.f(null);
        }
        C1973d c1973dM2 = m(EnumC1974e.IGNORE_CACHE_EXPIRATION);
        if (c1973dM2 != null) {
            this.f21643h.set(c1973dM2);
            ((C2273m) this.f21644i.get()).e(c1973dM2);
        }
        return this.f21642g.k().q(fVar.f19951a, new a(fVar));
    }
}
