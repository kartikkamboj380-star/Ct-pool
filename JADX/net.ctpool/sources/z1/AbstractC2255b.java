package z1;

import android.graphics.Bitmap;

/* JADX INFO: renamed from: z1.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2255b extends Y0.b {
    @Override // Y0.b
    public void f(Y0.c cVar) {
        if (cVar.b()) {
            S0.a aVar = (S0.a) cVar.g();
            try {
                g((aVar == null || !(aVar.j() instanceof D1.c)) ? null : ((D1.c) aVar.j()).z0());
            } finally {
                S0.a.g(aVar);
            }
        }
    }

    protected abstract void g(Bitmap bitmap);
}
