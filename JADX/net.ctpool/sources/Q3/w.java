package Q3;

import android.os.IBinder;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
final class w extends q {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    final /* synthetic */ IBinder f2786n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    final /* synthetic */ z f2787o;

    w(z zVar, IBinder iBinder) {
        this.f2787o = zVar;
        this.f2786n = iBinder;
    }

    @Override // Q3.q
    public final void a() {
        this.f2787o.f2789a.f2759m = j.j0(this.f2786n);
        A.q(this.f2787o.f2789a);
        this.f2787o.f2789a.f2753g = false;
        Iterator it = this.f2787o.f2789a.f2750d.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
        this.f2787o.f2789a.f2750d.clear();
    }
}
