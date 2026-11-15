package F1;

import com.facebook.imagepipeline.producers.e0;
import j5.AbstractC1809n;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;
import w5.k;

/* JADX INFO: loaded from: classes.dex */
public final class b implements d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f1070b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f1071a;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public b(Set set) {
        if (set == null) {
            this.f1071a = new ArrayList();
            return;
        }
        ArrayList arrayList = new ArrayList(set.size());
        this.f1071a = arrayList;
        AbstractC1809n.G(set, arrayList);
    }

    @Override // com.facebook.imagepipeline.producers.g0
    public void a(e0 e0Var, String str, String str2) {
        k.f(e0Var, "producerContext");
        k.f(str, "producerName");
        k.f(str2, "producerEventName");
        Iterator it = this.f1071a.iterator();
        while (it.hasNext()) {
            try {
                ((d) it.next()).a(e0Var, str, str2);
            } catch (Exception e7) {
                P0.a.k("ForwardingRequestListener2", "InternalListener exception in onIntermediateChunkStart", e7);
            }
        }
    }

    @Override // F1.d
    public void b(e0 e0Var) {
        k.f(e0Var, "producerContext");
        Iterator it = this.f1071a.iterator();
        while (it.hasNext()) {
            try {
                ((d) it.next()).b(e0Var);
            } catch (Exception e7) {
                P0.a.k("ForwardingRequestListener2", "InternalListener exception in onRequestStart", e7);
            }
        }
    }

    @Override // com.facebook.imagepipeline.producers.g0
    public void c(e0 e0Var, String str, boolean z6) {
        k.f(e0Var, "producerContext");
        k.f(str, "producerName");
        Iterator it = this.f1071a.iterator();
        while (it.hasNext()) {
            try {
                ((d) it.next()).c(e0Var, str, z6);
            } catch (Exception e7) {
                P0.a.k("ForwardingRequestListener2", "InternalListener exception in onProducerFinishWithSuccess", e7);
            }
        }
    }

    @Override // com.facebook.imagepipeline.producers.g0
    public void d(e0 e0Var, String str, Map map) {
        Iterator it = this.f1071a.iterator();
        while (it.hasNext()) {
            try {
                ((d) it.next()).d(e0Var, str, map);
            } catch (Exception e7) {
                P0.a.k("ForwardingRequestListener2", "InternalListener exception in onProducerFinishWithCancellation", e7);
            }
        }
    }

    @Override // com.facebook.imagepipeline.producers.g0
    public void e(e0 e0Var, String str) {
        k.f(e0Var, "producerContext");
        k.f(str, "producerName");
        Iterator it = this.f1071a.iterator();
        while (it.hasNext()) {
            try {
                ((d) it.next()).e(e0Var, str);
            } catch (Exception e7) {
                P0.a.k("ForwardingRequestListener2", "InternalListener exception in onProducerStart", e7);
            }
        }
    }

    @Override // F1.d
    public void f(e0 e0Var) {
        k.f(e0Var, "producerContext");
        Iterator it = this.f1071a.iterator();
        while (it.hasNext()) {
            try {
                ((d) it.next()).f(e0Var);
            } catch (Exception e7) {
                P0.a.k("ForwardingRequestListener2", "InternalListener exception in onRequestSuccess", e7);
            }
        }
    }

    @Override // com.facebook.imagepipeline.producers.g0
    public boolean g(e0 e0Var, String str) {
        k.f(e0Var, "producerContext");
        k.f(str, "producerName");
        List list = this.f1071a;
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (((d) it.next()).g(e0Var, str)) {
                return true;
            }
        }
        return false;
    }

    @Override // F1.d
    public void h(e0 e0Var, Throwable th) {
        k.f(e0Var, "producerContext");
        k.f(th, "throwable");
        Iterator it = this.f1071a.iterator();
        while (it.hasNext()) {
            try {
                ((d) it.next()).h(e0Var, th);
            } catch (Exception e7) {
                P0.a.k("ForwardingRequestListener2", "InternalListener exception in onRequestFailure", e7);
            }
        }
    }

    @Override // F1.d
    public void i(e0 e0Var) {
        k.f(e0Var, "producerContext");
        Iterator it = this.f1071a.iterator();
        while (it.hasNext()) {
            try {
                ((d) it.next()).i(e0Var);
            } catch (Exception e7) {
                P0.a.k("ForwardingRequestListener2", "InternalListener exception in onRequestCancellation", e7);
            }
        }
    }

    @Override // com.facebook.imagepipeline.producers.g0
    public void j(e0 e0Var, String str, Map map) {
        Iterator it = this.f1071a.iterator();
        while (it.hasNext()) {
            try {
                ((d) it.next()).j(e0Var, str, map);
            } catch (Exception e7) {
                P0.a.k("ForwardingRequestListener2", "InternalListener exception in onProducerFinishWithSuccess", e7);
            }
        }
    }

    @Override // com.facebook.imagepipeline.producers.g0
    public void k(e0 e0Var, String str, Throwable th, Map map) {
        Iterator it = this.f1071a.iterator();
        while (it.hasNext()) {
            try {
                ((d) it.next()).k(e0Var, str, th, map);
            } catch (Exception e7) {
                P0.a.k("ForwardingRequestListener2", "InternalListener exception in onProducerFinishWithFailure", e7);
            }
        }
    }
}
