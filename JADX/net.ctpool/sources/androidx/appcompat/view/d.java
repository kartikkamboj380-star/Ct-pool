package androidx.appcompat.view;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.view.LayoutInflater;

/* JADX INFO: loaded from: classes.dex */
public class d extends ContextWrapper {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static Configuration f5244f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f5245a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Resources.Theme f5246b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private LayoutInflater f5247c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Configuration f5248d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Resources f5249e;

    static class a {
        static Context a(d dVar, Configuration configuration) {
            return dVar.createConfigurationContext(configuration);
        }
    }

    public d(Context context, int i7) {
        super(context);
        this.f5245a = i7;
    }

    private Resources b() {
        if (this.f5249e == null) {
            Configuration configuration = this.f5248d;
            this.f5249e = (configuration == null || (Build.VERSION.SDK_INT >= 26 && e(configuration))) ? super.getResources() : a.a(this, this.f5248d).getResources();
        }
        return this.f5249e;
    }

    private void d() {
        boolean z6 = this.f5246b == null;
        if (z6) {
            this.f5246b = getResources().newTheme();
            Resources.Theme theme = getBaseContext().getTheme();
            if (theme != null) {
                this.f5246b.setTo(theme);
            }
        }
        f(this.f5246b, this.f5245a, z6);
    }

    private static boolean e(Configuration configuration) {
        if (configuration == null) {
            return true;
        }
        if (f5244f == null) {
            Configuration configuration2 = new Configuration();
            configuration2.fontScale = 0.0f;
            f5244f = configuration2;
        }
        return configuration.equals(f5244f);
    }

    public void a(Configuration configuration) {
        if (this.f5249e != null) {
            throw new IllegalStateException("getResources() or getAssets() has already been called");
        }
        if (this.f5248d != null) {
            throw new IllegalStateException("Override configuration has already been set");
        }
        this.f5248d = new Configuration(configuration);
    }

    @Override // android.content.ContextWrapper
    protected void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    public int c() {
        return this.f5245a;
    }

    protected void f(Resources.Theme theme, int i7, boolean z6) {
        theme.applyStyle(i7, true);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public AssetManager getAssets() {
        return getResources().getAssets();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        return b();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Object getSystemService(String str) {
        if (!"layout_inflater".equals(str)) {
            return getBaseContext().getSystemService(str);
        }
        if (this.f5247c == null) {
            this.f5247c = LayoutInflater.from(getBaseContext()).cloneInContext(this);
        }
        return this.f5247c;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources.Theme getTheme() {
        Resources.Theme theme = this.f5246b;
        if (theme != null) {
            return theme;
        }
        if (this.f5245a == 0) {
            this.f5245a = e.i.f18900d;
        }
        d();
        return this.f5246b;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public void setTheme(int i7) {
        if (this.f5245a != i7) {
            this.f5245a = i7;
            d();
        }
    }

    public d(Context context, Resources.Theme theme) {
        super(context);
        this.f5246b = theme;
    }
}
