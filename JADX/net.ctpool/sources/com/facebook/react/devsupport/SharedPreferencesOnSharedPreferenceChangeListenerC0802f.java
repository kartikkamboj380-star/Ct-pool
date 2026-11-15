package com.facebook.react.devsupport;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import kotlin.jvm.internal.DefaultConstructorMarker;
import n2.InterfaceC1899a;
import t2.C2060d;

/* JADX INFO: renamed from: com.facebook.react.devsupport.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class SharedPreferencesOnSharedPreferenceChangeListenerC0802f implements InterfaceC1899a, SharedPreferences.OnSharedPreferenceChangeListener {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f11621e = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b f11622a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final SharedPreferences f11623b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final C2060d f11624c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f11625d;

    /* JADX INFO: renamed from: com.facebook.react.devsupport.f$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: renamed from: com.facebook.react.devsupport.f$b */
    public interface b {
        void a();
    }

    public SharedPreferencesOnSharedPreferenceChangeListenerC0802f(Context context, b bVar) {
        w5.k.f(context, "applicationContext");
        this.f11622a = bVar;
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
        w5.k.e(defaultSharedPreferences, "getDefaultSharedPreferences(...)");
        this.f11623b = defaultSharedPreferences;
        this.f11624c = new C2060d(context);
        defaultSharedPreferences.registerOnSharedPreferenceChangeListener(this);
    }

    @Override // n2.InterfaceC1899a
    public boolean a() {
        return this.f11623b.getBoolean("inspector_debug", false);
    }

    @Override // n2.InterfaceC1899a
    public void b(boolean z6) {
        this.f11623b.edit().putBoolean("hot_module_replacement", z6).apply();
    }

    @Override // n2.InterfaceC1899a
    public void c(boolean z6) {
        this.f11623b.edit().putBoolean("inspector_debug", z6).apply();
    }

    @Override // n2.InterfaceC1899a
    public boolean d() {
        return this.f11623b.getBoolean("js_minify_debug", false);
    }

    @Override // n2.InterfaceC1899a
    public void e(boolean z6) {
        this.f11623b.edit().putBoolean("fps_debug", z6).apply();
    }

    @Override // n2.InterfaceC1899a
    public void f(boolean z6) {
        this.f11623b.edit().putBoolean("remote_js_debug", z6).apply();
    }

    @Override // n2.InterfaceC1899a
    public boolean g() {
        return this.f11623b.getBoolean("fps_debug", false);
    }

    @Override // n2.InterfaceC1899a
    public boolean h() {
        return this.f11623b.getBoolean("js_dev_mode_debug", true);
    }

    @Override // n2.InterfaceC1899a
    public boolean i() {
        return this.f11623b.getBoolean("hot_module_replacement", true);
    }

    @Override // n2.InterfaceC1899a
    public C2060d j() {
        return this.f11624c;
    }

    @Override // n2.InterfaceC1899a
    public boolean k() {
        return this.f11625d;
    }

    @Override // n2.InterfaceC1899a
    public void l(boolean z6) {
        this.f11623b.edit().putBoolean("js_dev_mode_debug", z6).apply();
    }

    @Override // n2.InterfaceC1899a
    public boolean m() {
        return this.f11623b.getBoolean("remote_js_debug", false);
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        w5.k.f(sharedPreferences, "sharedPreferences");
        if (this.f11622a != null) {
            if (w5.k.b("fps_debug", str) || w5.k.b("js_dev_mode_debug", str) || w5.k.b("start_sampling_profiler_on_init", str) || w5.k.b("js_minify_debug", str)) {
                this.f11622a.a();
            }
        }
    }
}
