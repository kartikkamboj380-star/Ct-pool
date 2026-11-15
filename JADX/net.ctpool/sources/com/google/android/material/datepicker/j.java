package com.google.android.material.datepicker;

import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.app.y;

/* JADX INFO: loaded from: classes.dex */
public final class j<S> extends o {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f16861n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private com.google.android.material.datepicker.a f16862o;

    class a extends n {
        a() {
        }
    }

    static j u(d dVar, int i7, com.google.android.material.datepicker.a aVar) {
        j jVar = new j();
        Bundle bundle = new Bundle();
        bundle.putInt("THEME_RES_ID_KEY", i7);
        bundle.putParcelable("DATE_SELECTOR_KEY", dVar);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", aVar);
        jVar.setArguments(bundle);
        return jVar;
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            bundle = getArguments();
        }
        this.f16861n = bundle.getInt("THEME_RES_ID_KEY");
        y.a(bundle.getParcelable("DATE_SELECTOR_KEY"));
        this.f16862o = (com.google.android.material.datepicker.a) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.cloneInContext(new ContextThemeWrapper(getContext(), this.f16861n));
        new a();
        throw null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("THEME_RES_ID_KEY", this.f16861n);
        bundle.putParcelable("DATE_SELECTOR_KEY", null);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.f16862o);
    }
}
