package i1;

import android.graphics.drawable.Animatable;
import g1.C1688c;

/* JADX INFO: renamed from: i1.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1740a extends C1688c {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private long f19919n = -1;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private long f19920o = -1;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private b f19921p;

    public C1740a(b bVar) {
        this.f19921p = bVar;
    }

    @Override // g1.C1688c, g1.InterfaceC1689d
    public void e(String str, Object obj, Animatable animatable) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.f19920o = jCurrentTimeMillis;
        b bVar = this.f19921p;
        if (bVar != null) {
            bVar.a(jCurrentTimeMillis - this.f19919n);
        }
    }

    @Override // g1.C1688c, g1.InterfaceC1689d
    public void p(String str, Object obj) {
        this.f19919n = System.currentTimeMillis();
    }
}
