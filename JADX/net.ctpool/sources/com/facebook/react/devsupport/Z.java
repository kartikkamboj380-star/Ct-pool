package com.facebook.react.devsupport;

import android.content.Context;
import com.facebook.react.devsupport.SharedPreferencesOnSharedPreferenceChangeListenerC0802f;
import n2.InterfaceC1899a;

/* JADX INFO: loaded from: classes.dex */
public final class Z extends f0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C0803g f11565b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final InterfaceC1899a f11566c;

    class a implements SharedPreferencesOnSharedPreferenceChangeListenerC0802f.b {
        a() {
        }

        @Override // com.facebook.react.devsupport.SharedPreferencesOnSharedPreferenceChangeListenerC0802f.b
        public void a() {
        }
    }

    public Z(Context context) {
        SharedPreferencesOnSharedPreferenceChangeListenerC0802f sharedPreferencesOnSharedPreferenceChangeListenerC0802f = new SharedPreferencesOnSharedPreferenceChangeListenerC0802f(context, new a());
        this.f11566c = sharedPreferencesOnSharedPreferenceChangeListenerC0802f;
        this.f11565b = new C0803g(sharedPreferencesOnSharedPreferenceChangeListenerC0802f, context, sharedPreferencesOnSharedPreferenceChangeListenerC0802f.j());
    }

    @Override // com.facebook.react.devsupport.f0, X1.e
    public void m() {
        this.f11565b.h();
    }

    @Override // com.facebook.react.devsupport.f0, X1.e
    public InterfaceC1899a w() {
        return this.f11566c;
    }

    @Override // com.facebook.react.devsupport.f0, X1.e
    public void z() {
        this.f11565b.z();
    }
}
