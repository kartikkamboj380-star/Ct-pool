package z4;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Map;
import x4.InterfaceC2225a;
import x4.InterfaceC2226b;
import z4.h;

/* JADX INFO: loaded from: classes.dex */
public class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f23331a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f23332b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final w4.d f23333c;

    public static final class a implements InterfaceC2226b {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final w4.d f23334d = new w4.d() { // from class: z4.g
            @Override // w4.d
            public final void a(Object obj, Object obj2) {
                h.a.e(obj, (w4.e) obj2);
            }
        };

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Map f23335a = new HashMap();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Map f23336b = new HashMap();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private w4.d f23337c = f23334d;

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void e(Object obj, w4.e eVar) {
            throw new w4.b("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
        }

        public h c() {
            return new h(new HashMap(this.f23335a), new HashMap(this.f23336b), this.f23337c);
        }

        public a d(InterfaceC2225a interfaceC2225a) {
            interfaceC2225a.a(this);
            return this;
        }

        @Override // x4.InterfaceC2226b
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public a a(Class cls, w4.d dVar) {
            this.f23335a.put(cls, dVar);
            this.f23336b.remove(cls);
            return this;
        }
    }

    h(Map map, Map map2, w4.d dVar) {
        this.f23331a = map;
        this.f23332b = map2;
        this.f23333c = dVar;
    }

    public static a a() {
        return new a();
    }

    public void b(Object obj, OutputStream outputStream) {
        new f(outputStream, this.f23331a, this.f23332b, this.f23333c).t(obj);
    }

    public byte[] c(Object obj) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            b(obj, byteArrayOutputStream);
        } catch (IOException unused) {
        }
        return byteArrayOutputStream.toByteArray();
    }
}
