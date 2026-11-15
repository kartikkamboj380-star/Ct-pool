package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.r0;

/* JADX INFO: loaded from: classes.dex */
public class H {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f7529a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f7530b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object f7531c;

    static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final r0.b f7532a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Object f7533b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final r0.b f7534c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Object f7535d;

        public a(r0.b bVar, Object obj, r0.b bVar2, Object obj2) {
            this.f7532a = bVar;
            this.f7533b = obj;
            this.f7534c = bVar2;
            this.f7535d = obj2;
        }
    }

    private H(r0.b bVar, Object obj, r0.b bVar2, Object obj2) {
        this.f7529a = new a(bVar, obj, bVar2, obj2);
        this.f7530b = obj;
        this.f7531c = obj2;
    }

    static int b(a aVar, Object obj, Object obj2) {
        return C0623s.b(aVar.f7532a, 1, obj) + C0623s.b(aVar.f7534c, 2, obj2);
    }

    public static H d(r0.b bVar, Object obj, r0.b bVar2, Object obj2) {
        return new H(bVar, obj, bVar2, obj2);
    }

    static void e(AbstractC0615j abstractC0615j, a aVar, Object obj, Object obj2) {
        C0623s.u(abstractC0615j, aVar.f7532a, 1, obj);
        C0623s.u(abstractC0615j, aVar.f7534c, 2, obj2);
    }

    public int a(int i7, Object obj, Object obj2) {
        return AbstractC0615j.P(i7) + AbstractC0615j.y(b(this.f7529a, obj, obj2));
    }

    a c() {
        return this.f7529a;
    }
}
