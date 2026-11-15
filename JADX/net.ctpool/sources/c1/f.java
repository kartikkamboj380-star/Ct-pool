package c1;

import O0.o;
import android.content.Context;
import f1.AbstractC1644a;
import java.util.Set;
import y1.k;

/* JADX INFO: loaded from: classes.dex */
public class f implements o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f9985a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final k f9986b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final g f9987c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Set f9988d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Set f9989e;

    public f(Context context, b bVar) {
        this(context, y1.o.n(), bVar);
    }

    @Override // O0.o
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public e get() {
        return new e(this.f9985a, this.f9987c, this.f9986b, this.f9988d, this.f9989e).K(null);
    }

    public f(Context context, y1.o oVar, b bVar) {
        this(context, oVar, null, null, bVar);
    }

    public f(Context context, y1.o oVar, Set set, Set set2, b bVar) {
        this.f9985a = context;
        k kVarL = oVar.l();
        this.f9986b = kVarL;
        g gVar = new g();
        this.f9987c = gVar;
        gVar.a(context.getResources(), AbstractC1644a.b(), oVar.b(context), M0.f.g(), kVarL.m(), null, null);
        this.f9988d = set;
        this.f9989e = set2;
    }
}
