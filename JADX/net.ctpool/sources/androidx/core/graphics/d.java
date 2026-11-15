package androidx.core.graphics;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build;
import android.os.CancellationSignal;
import android.os.Handler;
import androidx.core.content.res.d;
import androidx.core.content.res.f;
import androidx.core.provider.g;

/* JADX INFO: loaded from: classes.dex */
public abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final j f7125a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final n.e f7126b;

    public static class a extends g.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private f.e f7127a;

        public a(f.e eVar) {
            this.f7127a = eVar;
        }

        @Override // androidx.core.provider.g.c
        public void a(int i7) {
            f.e eVar = this.f7127a;
            if (eVar != null) {
                eVar.f(i7);
            }
        }

        @Override // androidx.core.provider.g.c
        public void b(Typeface typeface) {
            f.e eVar = this.f7127a;
            if (eVar != null) {
                eVar.g(typeface);
            }
        }
    }

    static {
        int i7 = Build.VERSION.SDK_INT;
        f7125a = i7 >= 29 ? new i() : i7 >= 28 ? new h() : i7 >= 26 ? new g() : f.j() ? new f() : new e();
        f7126b = new n.e(16);
    }

    public static Typeface a(Context context, Typeface typeface, int i7) {
        if (context != null) {
            return Typeface.create(typeface, i7);
        }
        throw new IllegalArgumentException("Context cannot be null");
    }

    public static Typeface b(Context context, CancellationSignal cancellationSignal, g.b[] bVarArr, int i7) {
        return f7125a.b(context, cancellationSignal, bVarArr, i7);
    }

    public static Typeface c(Context context, d.b bVar, Resources resources, int i7, String str, int i8, int i9, f.e eVar, Handler handler, boolean z6) {
        Typeface typefaceA;
        if (bVar instanceof d.e) {
            d.e eVar2 = (d.e) bVar;
            Typeface typefaceG = g(eVar2.c());
            if (typefaceG != null) {
                if (eVar != null) {
                    eVar.d(typefaceG, handler);
                }
                return typefaceG;
            }
            typefaceA = androidx.core.provider.g.c(context, eVar2.b(), i9, !z6 ? eVar != null : eVar2.a() != 0, z6 ? eVar2.d() : -1, f.e.e(handler), new a(eVar));
        } else {
            typefaceA = f7125a.a(context, (d.c) bVar, resources, i9);
            if (eVar != null) {
                if (typefaceA != null) {
                    eVar.d(typefaceA, handler);
                } else {
                    eVar.c(-3, handler);
                }
            }
        }
        if (typefaceA != null) {
            f7126b.d(e(resources, i7, str, i8, i9), typefaceA);
        }
        return typefaceA;
    }

    public static Typeface d(Context context, Resources resources, int i7, String str, int i8, int i9) {
        Typeface typefaceD = f7125a.d(context, resources, i7, str, i9);
        if (typefaceD != null) {
            f7126b.d(e(resources, i7, str, i8, i9), typefaceD);
        }
        return typefaceD;
    }

    private static String e(Resources resources, int i7, String str, int i8, int i9) {
        return resources.getResourcePackageName(i7) + '-' + str + '-' + i8 + '-' + i7 + '-' + i9;
    }

    public static Typeface f(Resources resources, int i7, String str, int i8, int i9) {
        return (Typeface) f7126b.c(e(resources, i7, str, i8, i9));
    }

    private static Typeface g(String str) {
        if (str == null || str.isEmpty()) {
            return null;
        }
        Typeface typefaceCreate = Typeface.create(str, 0);
        Typeface typefaceCreate2 = Typeface.create(Typeface.DEFAULT, 0);
        if (typefaceCreate == null || typefaceCreate.equals(typefaceCreate2)) {
            return null;
        }
        return typefaceCreate;
    }
}
