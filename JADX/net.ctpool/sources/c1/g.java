package c1;

import O0.o;
import android.content.res.Resources;
import f1.AbstractC1644a;
import java.util.concurrent.Executor;
import w1.x;

/* JADX INFO: loaded from: classes.dex */
public class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Resources f9990a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private AbstractC1644a f9991b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private C1.a f9992c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Executor f9993d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private x f9994e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private O0.f f9995f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private o f9996g;

    public void a(Resources resources, AbstractC1644a abstractC1644a, C1.a aVar, Executor executor, x xVar, O0.f fVar, o oVar) {
        this.f9990a = resources;
        this.f9991b = abstractC1644a;
        this.f9992c = aVar;
        this.f9993d = executor;
        this.f9994e = xVar;
        this.f9995f = fVar;
        this.f9996g = oVar;
    }

    protected d b(Resources resources, AbstractC1644a abstractC1644a, C1.a aVar, Executor executor, x xVar, O0.f fVar) {
        return new d(resources, abstractC1644a, aVar, executor, xVar, fVar);
    }

    public d c() {
        d dVarB = b(this.f9990a, this.f9991b, this.f9992c, this.f9993d, this.f9994e, this.f9995f);
        o oVar = this.f9996g;
        if (oVar != null) {
            dVarB.z0(((Boolean) oVar.get()).booleanValue());
        }
        return dVarB;
    }
}
