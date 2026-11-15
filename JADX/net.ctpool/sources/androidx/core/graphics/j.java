package androidx.core.graphics;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.CancellationSignal;
import androidx.core.content.res.d;
import androidx.core.provider.g;
import com.google.android.gms.common.api.Api;
import java.io.File;
import java.io.InputStream;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
abstract class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ConcurrentHashMap f7155a = new ConcurrentHashMap();

    class a implements b {
        a() {
        }

        @Override // androidx.core.graphics.j.b
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public int a(g.b bVar) {
            return bVar.e();
        }

        @Override // androidx.core.graphics.j.b
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public boolean b(g.b bVar) {
            return bVar.f();
        }
    }

    private interface b {
        int a(Object obj);

        boolean b(Object obj);
    }

    j() {
    }

    private static Object e(Object[] objArr, int i7, b bVar) {
        return f(objArr, (i7 & 1) == 0 ? 400 : 700, (i7 & 2) != 0, bVar);
    }

    private static Object f(Object[] objArr, int i7, boolean z6, b bVar) {
        Object obj = null;
        int i8 = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        for (Object obj2 : objArr) {
            int iAbs = (Math.abs(bVar.a(obj2) - i7) * 2) + (bVar.b(obj2) == z6 ? 0 : 1);
            if (obj == null || i8 > iAbs) {
                obj = obj2;
                i8 = iAbs;
            }
        }
        return obj;
    }

    public abstract Typeface a(Context context, d.c cVar, Resources resources, int i7);

    public abstract Typeface b(Context context, CancellationSignal cancellationSignal, g.b[] bVarArr, int i7);

    protected Typeface c(Context context, InputStream inputStream) {
        File fileE = k.e(context);
        if (fileE == null) {
            return null;
        }
        try {
            if (k.d(fileE, inputStream)) {
                return Typeface.createFromFile(fileE.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            fileE.delete();
        }
    }

    public Typeface d(Context context, Resources resources, int i7, String str, int i8) {
        File fileE = k.e(context);
        if (fileE == null) {
            return null;
        }
        try {
            if (k.c(fileE, resources, i7)) {
                return Typeface.createFromFile(fileE.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            fileE.delete();
        }
    }

    protected g.b g(g.b[] bVarArr, int i7) {
        return (g.b) e(bVarArr, i7, new a());
    }
}
