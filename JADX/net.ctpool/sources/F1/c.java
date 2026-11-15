package F1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class c implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f1072a;

    public c(Set set) {
        this.f1072a = new ArrayList(set.size());
        Iterator it = set.iterator();
        while (it.hasNext()) {
            e eVar = (e) it.next();
            if (eVar != null) {
                this.f1072a.add(eVar);
            }
        }
    }

    private void l(String str, Throwable th) {
        P0.a.k("ForwardingRequestListener", str, th);
    }

    @Override // com.facebook.imagepipeline.producers.h0
    public void a(String str, String str2) {
        int size = this.f1072a.size();
        for (int i7 = 0; i7 < size; i7++) {
            try {
                ((e) this.f1072a.get(i7)).a(str, str2);
            } catch (Exception e7) {
                l("InternalListener exception in onProducerStart", e7);
            }
        }
    }

    @Override // com.facebook.imagepipeline.producers.h0
    public void b(String str, String str2, Map map) {
        int size = this.f1072a.size();
        for (int i7 = 0; i7 < size; i7++) {
            try {
                ((e) this.f1072a.get(i7)).b(str, str2, map);
            } catch (Exception e7) {
                l("InternalListener exception in onProducerFinishWithCancellation", e7);
            }
        }
    }

    @Override // com.facebook.imagepipeline.producers.h0
    public void c(String str, String str2, boolean z6) {
        int size = this.f1072a.size();
        for (int i7 = 0; i7 < size; i7++) {
            try {
                ((e) this.f1072a.get(i7)).c(str, str2, z6);
            } catch (Exception e7) {
                l("InternalListener exception in onProducerFinishWithSuccess", e7);
            }
        }
    }

    @Override // F1.e
    public void d(J1.b bVar, String str, Throwable th, boolean z6) {
        int size = this.f1072a.size();
        for (int i7 = 0; i7 < size; i7++) {
            try {
                ((e) this.f1072a.get(i7)).d(bVar, str, th, z6);
            } catch (Exception e7) {
                l("InternalListener exception in onRequestFailure", e7);
            }
        }
    }

    @Override // F1.e
    public void e(J1.b bVar, String str, boolean z6) {
        int size = this.f1072a.size();
        for (int i7 = 0; i7 < size; i7++) {
            try {
                ((e) this.f1072a.get(i7)).e(bVar, str, z6);
            } catch (Exception e7) {
                l("InternalListener exception in onRequestSuccess", e7);
            }
        }
    }

    @Override // F1.e
    public void f(J1.b bVar, Object obj, String str, boolean z6) {
        int size = this.f1072a.size();
        for (int i7 = 0; i7 < size; i7++) {
            try {
                ((e) this.f1072a.get(i7)).f(bVar, obj, str, z6);
            } catch (Exception e7) {
                l("InternalListener exception in onRequestStart", e7);
            }
        }
    }

    @Override // com.facebook.imagepipeline.producers.h0
    public boolean g(String str) {
        int size = this.f1072a.size();
        for (int i7 = 0; i7 < size; i7++) {
            if (((e) this.f1072a.get(i7)).g(str)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.facebook.imagepipeline.producers.h0
    public void h(String str, String str2, String str3) {
        int size = this.f1072a.size();
        for (int i7 = 0; i7 < size; i7++) {
            try {
                ((e) this.f1072a.get(i7)).h(str, str2, str3);
            } catch (Exception e7) {
                l("InternalListener exception in onIntermediateChunkStart", e7);
            }
        }
    }

    @Override // com.facebook.imagepipeline.producers.h0
    public void i(String str, String str2, Map map) {
        int size = this.f1072a.size();
        for (int i7 = 0; i7 < size; i7++) {
            try {
                ((e) this.f1072a.get(i7)).i(str, str2, map);
            } catch (Exception e7) {
                l("InternalListener exception in onProducerFinishWithSuccess", e7);
            }
        }
    }

    @Override // com.facebook.imagepipeline.producers.h0
    public void j(String str, String str2, Throwable th, Map map) {
        int size = this.f1072a.size();
        for (int i7 = 0; i7 < size; i7++) {
            try {
                ((e) this.f1072a.get(i7)).j(str, str2, th, map);
            } catch (Exception e7) {
                l("InternalListener exception in onProducerFinishWithFailure", e7);
            }
        }
    }

    @Override // F1.e
    public void k(String str) {
        int size = this.f1072a.size();
        for (int i7 = 0; i7 < size; i7++) {
            try {
                ((e) this.f1072a.get(i7)).k(str);
            } catch (Exception e7) {
                l("InternalListener exception in onRequestCancellation", e7);
            }
        }
    }

    public c(e... eVarArr) {
        this.f1072a = new ArrayList(eVarArr.length);
        for (e eVar : eVarArr) {
            if (eVar != null) {
                this.f1072a.add(eVar);
            }
        }
    }
}
