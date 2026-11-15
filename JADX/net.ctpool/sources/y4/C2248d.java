package y4;

import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import w4.InterfaceC2196a;
import w4.g;
import x4.InterfaceC2225a;
import x4.InterfaceC2226b;

/* JADX INFO: renamed from: y4.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2248d implements InterfaceC2226b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final w4.d f23215e = new w4.d() { // from class: y4.a
        @Override // w4.d
        public final void a(Object obj, Object obj2) {
            C2248d.l(obj, (w4.e) obj2);
        }
    };

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final w4.f f23216f = new w4.f() { // from class: y4.b
        @Override // w4.f
        public final void a(Object obj, Object obj2) {
            ((g) obj2).f((String) obj);
        }
    };

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final w4.f f23217g = new w4.f() { // from class: y4.c
        @Override // w4.f
        public final void a(Object obj, Object obj2) {
            C2248d.n((Boolean) obj, (g) obj2);
        }
    };

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final b f23218h = new b(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f23219a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f23220b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private w4.d f23221c = f23215e;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f23222d = false;

    /* JADX INFO: renamed from: y4.d$a */
    class a implements InterfaceC2196a {
        a() {
        }

        @Override // w4.InterfaceC2196a
        public void a(Object obj, Writer writer) {
            e eVar = new e(writer, C2248d.this.f23219a, C2248d.this.f23220b, C2248d.this.f23221c, C2248d.this.f23222d);
            eVar.k(obj, false);
            eVar.u();
        }

        @Override // w4.InterfaceC2196a
        public String b(Object obj) {
            StringWriter stringWriter = new StringWriter();
            try {
                a(obj, stringWriter);
            } catch (IOException unused) {
            }
            return stringWriter.toString();
        }
    }

    /* JADX INFO: renamed from: y4.d$b */
    private static final class b implements w4.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final DateFormat f23224a;

        static {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
            f23224a = simpleDateFormat;
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        }

        private b() {
        }

        @Override // w4.f
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(Date date, g gVar) {
            gVar.f(f23224a.format(date));
        }

        /* synthetic */ b(a aVar) {
            this();
        }
    }

    public C2248d() {
        p(String.class, f23216f);
        p(Boolean.class, f23217g);
        p(Date.class, f23218h);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void l(Object obj, w4.e eVar) {
        throw new w4.b("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void n(Boolean bool, g gVar) {
        gVar.g(bool.booleanValue());
    }

    public InterfaceC2196a i() {
        return new a();
    }

    public C2248d j(InterfaceC2225a interfaceC2225a) {
        interfaceC2225a.a(this);
        return this;
    }

    public C2248d k(boolean z6) {
        this.f23222d = z6;
        return this;
    }

    @Override // x4.InterfaceC2226b
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public C2248d a(Class cls, w4.d dVar) {
        this.f23219a.put(cls, dVar);
        this.f23220b.remove(cls);
        return this;
    }

    public C2248d p(Class cls, w4.f fVar) {
        this.f23220b.put(cls, fVar);
        this.f23219a.remove(cls);
        return this;
    }
}
