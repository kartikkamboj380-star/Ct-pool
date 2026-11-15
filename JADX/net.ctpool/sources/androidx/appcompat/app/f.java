package androidx.appcompat.app;

import android.app.Activity;
import android.app.Dialog;
import android.app.LocaleManager;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.LocaleList;
import android.util.Log;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import android.window.OnBackInvokedDispatcher;
import androidx.appcompat.app.u;
import androidx.appcompat.widget.Toolbar;
import java.lang.ref.WeakReference;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public abstract class f {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    static u.a f5086m = new u.a(new u.b());

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static int f5087n = -100;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static androidx.core.os.i f5088o = null;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static androidx.core.os.i f5089p = null;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static Boolean f5090q = null;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static boolean f5091r = false;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final n.b f5092s = new n.b();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final Object f5093t = new Object();

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final Object f5094u = new Object();

    static class a {
        static LocaleList a(String str) {
            return LocaleList.forLanguageTags(str);
        }
    }

    static class b {
        static LocaleList a(Object obj) {
            return ((LocaleManager) obj).getApplicationLocales();
        }

        static void b(Object obj, LocaleList localeList) {
            ((LocaleManager) obj).setApplicationLocales(localeList);
        }
    }

    f() {
    }

    static void G(f fVar) {
        synchronized (f5093t) {
            H(fVar);
        }
    }

    private static void H(f fVar) {
        synchronized (f5093t) {
            try {
                Iterator it = f5092s.iterator();
                while (it.hasNext()) {
                    f fVar2 = (f) ((WeakReference) it.next()).get();
                    if (fVar2 == fVar || fVar2 == null) {
                        it.remove();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void M(int i7) {
        if (i7 != -1 && i7 != 0 && i7 != 1 && i7 != 2 && i7 != 3) {
            Log.d("AppCompatDelegate", "setDefaultNightMode() called with an unknown mode");
        } else if (f5087n != i7) {
            f5087n = i7;
            g();
        }
    }

    static void R(final Context context) {
        if (w(context)) {
            if (androidx.core.os.a.c()) {
                if (f5091r) {
                    return;
                }
                f5086m.execute(new Runnable() { // from class: androidx.appcompat.app.e
                    @Override // java.lang.Runnable
                    public final void run() {
                        f.x(context);
                    }
                });
                return;
            }
            synchronized (f5094u) {
                try {
                    androidx.core.os.i iVar = f5088o;
                    if (iVar == null) {
                        if (f5089p == null) {
                            f5089p = androidx.core.os.i.b(u.b(context));
                        }
                        if (f5089p.f()) {
                        } else {
                            f5088o = f5089p;
                        }
                    } else if (!iVar.equals(f5089p)) {
                        androidx.core.os.i iVar2 = f5088o;
                        f5089p = iVar2;
                        u.a(context, iVar2.h());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    static void d(f fVar) {
        synchronized (f5093t) {
            H(fVar);
            f5092s.add(new WeakReference(fVar));
        }
    }

    private static void g() {
        synchronized (f5093t) {
            try {
                Iterator it = f5092s.iterator();
                while (it.hasNext()) {
                    f fVar = (f) ((WeakReference) it.next()).get();
                    if (fVar != null) {
                        fVar.f();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static f j(Activity activity, d dVar) {
        return new g(activity, dVar);
    }

    public static f k(Dialog dialog, d dVar) {
        return new g(dialog, dVar);
    }

    public static androidx.core.os.i m() {
        if (androidx.core.os.a.c()) {
            Object objQ = q();
            if (objQ != null) {
                return androidx.core.os.i.i(b.a(objQ));
            }
        } else {
            androidx.core.os.i iVar = f5088o;
            if (iVar != null) {
                return iVar;
            }
        }
        return androidx.core.os.i.e();
    }

    public static int o() {
        return f5087n;
    }

    static Object q() {
        Context contextN;
        Iterator it = f5092s.iterator();
        while (it.hasNext()) {
            f fVar = (f) ((WeakReference) it.next()).get();
            if (fVar != null && (contextN = fVar.n()) != null) {
                return contextN.getSystemService("locale");
            }
        }
        return null;
    }

    static androidx.core.os.i s() {
        return f5088o;
    }

    static boolean w(Context context) {
        if (f5090q == null) {
            try {
                Bundle bundle = s.a(context).metaData;
                if (bundle != null) {
                    f5090q = Boolean.valueOf(bundle.getBoolean("autoStoreLocales"));
                }
            } catch (PackageManager.NameNotFoundException unused) {
                Log.d("AppCompatDelegate", "Checking for metadata for AppLocalesMetadataHolderService : Service not found");
                f5090q = Boolean.FALSE;
            }
        }
        return f5090q.booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void x(Context context) {
        u.c(context);
        f5091r = true;
    }

    public abstract void A();

    public abstract void B(Bundle bundle);

    public abstract void C();

    public abstract void D(Bundle bundle);

    public abstract void E();

    public abstract void F();

    public abstract boolean I(int i7);

    public abstract void J(int i7);

    public abstract void K(View view);

    public abstract void L(View view, ViewGroup.LayoutParams layoutParams);

    public void N(OnBackInvokedDispatcher onBackInvokedDispatcher) {
    }

    public abstract void O(Toolbar toolbar);

    public abstract void P(int i7);

    public abstract void Q(CharSequence charSequence);

    public abstract void e(View view, ViewGroup.LayoutParams layoutParams);

    public abstract boolean f();

    public void h(Context context) {
    }

    public Context i(Context context) {
        h(context);
        return context;
    }

    public abstract View l(int i7);

    public abstract Context n();

    public abstract int p();

    public abstract MenuInflater r();

    public abstract AbstractC0521a t();

    public abstract void u();

    public abstract void v();

    public abstract void y(Configuration configuration);

    public abstract void z(Bundle bundle);
}
