package p2;

import P2.a;
import android.util.Pair;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: p2.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1963b extends F1.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    int f21609a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    Map f21610b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    Map f21611c = new HashMap();

    @Override // F1.a, com.facebook.imagepipeline.producers.h0
    public void a(String str, String str2) {
        if (P2.a.h(0L)) {
            Pair pairCreate = Pair.create(Integer.valueOf(this.f21609a), "FRESCO_PRODUCER_" + str2.replace(':', '_'));
            P2.a.a(0L, (String) pairCreate.second, this.f21609a);
            this.f21610b.put(str, pairCreate);
            this.f21609a = this.f21609a + 1;
        }
    }

    @Override // F1.a, com.facebook.imagepipeline.producers.h0
    public void b(String str, String str2, Map map) {
        if (P2.a.h(0L) && this.f21610b.containsKey(str)) {
            Pair pair = (Pair) this.f21610b.get(str);
            P2.a.e(0L, (String) pair.second, ((Integer) pair.first).intValue());
            this.f21610b.remove(str);
        }
    }

    @Override // F1.e
    public void d(J1.b bVar, String str, Throwable th, boolean z6) {
        if (P2.a.h(0L) && this.f21611c.containsKey(str)) {
            Pair pair = (Pair) this.f21611c.get(str);
            P2.a.e(0L, (String) pair.second, ((Integer) pair.first).intValue());
            this.f21611c.remove(str);
        }
    }

    @Override // F1.e
    public void e(J1.b bVar, String str, boolean z6) {
        if (P2.a.h(0L) && this.f21611c.containsKey(str)) {
            Pair pair = (Pair) this.f21611c.get(str);
            P2.a.e(0L, (String) pair.second, ((Integer) pair.first).intValue());
            this.f21611c.remove(str);
        }
    }

    @Override // F1.e
    public void f(J1.b bVar, Object obj, String str, boolean z6) {
        if (P2.a.h(0L)) {
            Pair pairCreate = Pair.create(Integer.valueOf(this.f21609a), "FRESCO_REQUEST_" + bVar.u().toString().replace(':', '_'));
            P2.a.a(0L, (String) pairCreate.second, this.f21609a);
            this.f21611c.put(str, pairCreate);
            this.f21609a = this.f21609a + 1;
        }
    }

    @Override // F1.a, com.facebook.imagepipeline.producers.h0
    public boolean g(String str) {
        return false;
    }

    @Override // F1.a, com.facebook.imagepipeline.producers.h0
    public void h(String str, String str2, String str3) {
        if (P2.a.h(0L)) {
            P2.a.l(0L, "FRESCO_PRODUCER_EVENT_" + str.replace(':', '_') + "_" + str2.replace(':', '_') + "_" + str3.replace(':', '_'), a.EnumC0053a.f2563n);
        }
    }

    @Override // F1.a, com.facebook.imagepipeline.producers.h0
    public void i(String str, String str2, Map map) {
        if (P2.a.h(0L) && this.f21610b.containsKey(str)) {
            Pair pair = (Pair) this.f21610b.get(str);
            P2.a.e(0L, (String) pair.second, ((Integer) pair.first).intValue());
            this.f21610b.remove(str);
        }
    }

    @Override // F1.a, com.facebook.imagepipeline.producers.h0
    public void j(String str, String str2, Throwable th, Map map) {
        if (P2.a.h(0L) && this.f21610b.containsKey(str)) {
            Pair pair = (Pair) this.f21610b.get(str);
            P2.a.e(0L, (String) pair.second, ((Integer) pair.first).intValue());
            this.f21610b.remove(str);
        }
    }

    @Override // F1.e
    public void k(String str) {
        if (P2.a.h(0L) && this.f21611c.containsKey(str)) {
            Pair pair = (Pair) this.f21611c.get(str);
            P2.a.e(0L, (String) pair.second, ((Integer) pair.first).intValue());
            this.f21611c.remove(str);
        }
    }
}
