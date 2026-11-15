package c1;

import android.content.res.Resources;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import j1.h;

/* JADX INFO: renamed from: c1.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0710a implements C1.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Resources f9962a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C1.a f9963b;

    public C0710a(Resources resources, C1.a aVar) {
        this.f9962a = resources;
        this.f9963b = aVar;
    }

    private static boolean c(D1.e eVar) {
        return (eVar.g1() == 1 || eVar.g1() == 0) ? false : true;
    }

    private static boolean d(D1.e eVar) {
        return (eVar.T() == 0 || eVar.T() == -1) ? false : true;
    }

    @Override // C1.a
    public Drawable a(D1.d dVar) {
        try {
            if (K1.b.d()) {
                K1.b.a("DefaultDrawableFactory#createDrawable");
            }
            if (dVar instanceof D1.e) {
                D1.e eVar = (D1.e) dVar;
                BitmapDrawable bitmapDrawable = new BitmapDrawable(this.f9962a, eVar.z0());
                if (!d(eVar) && !c(eVar)) {
                    if (K1.b.d()) {
                        K1.b.b();
                    }
                    return bitmapDrawable;
                }
                h hVar = new h(bitmapDrawable, eVar.T(), eVar.g1());
                if (K1.b.d()) {
                    K1.b.b();
                }
                return hVar;
            }
            C1.a aVar = this.f9963b;
            if (aVar == null || !aVar.b(dVar)) {
                if (!K1.b.d()) {
                    return null;
                }
                K1.b.b();
                return null;
            }
            Drawable drawableA = this.f9963b.a(dVar);
            if (K1.b.d()) {
                K1.b.b();
            }
            return drawableA;
        } catch (Throwable th) {
            if (K1.b.d()) {
                K1.b.b();
            }
            throw th;
        }
    }

    @Override // C1.a
    public boolean b(D1.d dVar) {
        return true;
    }
}
