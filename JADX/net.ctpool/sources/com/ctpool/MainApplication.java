package com.ctpool;

import android.app.Application;
import android.content.Context;
import com.facebook.react.C0829l;
import com.facebook.react.InterfaceC0915w;
import com.facebook.react.InterfaceC0917y;
import com.facebook.react.L;
import com.facebook.react.defaults.b;
import com.facebook.react.defaults.c;
import com.facebook.soloader.SoLoader;
import java.util.ArrayList;
import java.util.List;
import w5.k;

/* JADX INFO: loaded from: classes.dex */
public final class MainApplication extends Application implements InterfaceC0915w {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final L f10391m = new a(this);

    public static final class a extends c {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final boolean f10392c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final boolean f10393d;

        a(MainApplication mainApplication) {
            super(mainApplication);
            this.f10393d = true;
        }

        @Override // com.facebook.react.L
        protected String j() {
            return "index";
        }

        @Override // com.facebook.react.L
        protected List m() {
            ArrayList arrayListA = new C0829l(this).a();
            arrayListA.add(new F0.a());
            k.e(arrayListA, "apply(...)");
            return arrayListA;
        }

        @Override // com.facebook.react.L
        public boolean u() {
            return false;
        }

        @Override // com.facebook.react.defaults.c
        protected Boolean y() {
            return Boolean.valueOf(this.f10393d);
        }

        @Override // com.facebook.react.defaults.c
        protected boolean z() {
            return this.f10392c;
        }
    }

    @Override // com.facebook.react.InterfaceC0915w
    public L a() {
        return this.f10391m;
    }

    @Override // com.facebook.react.InterfaceC0915w
    public InterfaceC0917y b() {
        Context applicationContext = getApplicationContext();
        k.e(applicationContext, "getApplicationContext(...)");
        return b.a(applicationContext, a());
    }

    @Override // android.app.Application
    public void onCreate() {
        super.onCreate();
        SoLoader.m(this, false);
    }
}
