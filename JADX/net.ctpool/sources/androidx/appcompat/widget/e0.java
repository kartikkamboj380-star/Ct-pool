package androidx.appcompat.widget;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Resources;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class e0 extends ContextWrapper {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Object f6100c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static ArrayList f6101d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Resources f6102a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Resources.Theme f6103b;

    private e0(Context context) {
        super(context);
        if (!q0.c()) {
            this.f6102a = new g0(this, context.getResources());
            this.f6103b = null;
            return;
        }
        q0 q0Var = new q0(this, context.getResources());
        this.f6102a = q0Var;
        Resources.Theme themeNewTheme = q0Var.newTheme();
        this.f6103b = themeNewTheme;
        themeNewTheme.setTo(context.getTheme());
    }

    private static boolean a(Context context) {
        if ((context instanceof e0) || (context.getResources() instanceof g0) || (context.getResources() instanceof q0)) {
            return false;
        }
        return q0.c();
    }

    public static Context b(Context context) {
        if (!a(context)) {
            return context;
        }
        synchronized (f6100c) {
            try {
                ArrayList arrayList = f6101d;
                if (arrayList == null) {
                    f6101d = new ArrayList();
                } else {
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        WeakReference weakReference = (WeakReference) f6101d.get(size);
                        if (weakReference == null || weakReference.get() == null) {
                            f6101d.remove(size);
                        }
                    }
                    for (int size2 = f6101d.size() - 1; size2 >= 0; size2--) {
                        WeakReference weakReference2 = (WeakReference) f6101d.get(size2);
                        e0 e0Var = weakReference2 != null ? (e0) weakReference2.get() : null;
                        if (e0Var != null && e0Var.getBaseContext() == context) {
                            return e0Var;
                        }
                    }
                }
                e0 e0Var2 = new e0(context);
                f6101d.add(new WeakReference(e0Var2));
                return e0Var2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public AssetManager getAssets() {
        return this.f6102a.getAssets();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        return this.f6102a;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources.Theme getTheme() {
        Resources.Theme theme = this.f6103b;
        return theme == null ? super.getTheme() : theme;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public void setTheme(int i7) {
        Resources.Theme theme = this.f6103b;
        if (theme == null) {
            super.setTheme(i7);
        } else {
            theme.applyStyle(i7, true);
        }
    }
}
