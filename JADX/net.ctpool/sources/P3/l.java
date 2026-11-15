package P3;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import z3.AbstractC2272l;

/* JADX INFO: loaded from: classes.dex */
final class l implements InterfaceC0450b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final u f2604a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final i f2605b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Context f2606c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Handler f2607d = new Handler(Looper.getMainLooper());

    l(u uVar, i iVar, Context context) {
        this.f2604a = uVar;
        this.f2605b = iVar;
        this.f2606c = context;
    }

    @Override // P3.InterfaceC0450b
    public final boolean a(C0449a c0449a, int i7, Activity activity, int i8) {
        d dVarC = d.c(i7);
        if (activity == null) {
            return false;
        }
        return c(c0449a, new k(this, activity), dVarC, i8);
    }

    @Override // P3.InterfaceC0450b
    public final AbstractC2272l b() {
        return this.f2604a.c(this.f2606c.getPackageName());
    }

    public final boolean c(C0449a c0449a, R3.a aVar, d dVar, int i7) {
        if (c0449a == null || aVar == null || dVar == null || !c0449a.a(dVar) || c0449a.f()) {
            return false;
        }
        c0449a.e();
        aVar.a(c0449a.c(dVar).getIntentSender(), i7, null, 0, 0, 0, null);
        return true;
    }
}
