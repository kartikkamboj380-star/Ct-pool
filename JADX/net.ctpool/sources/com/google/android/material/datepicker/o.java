package com.google.android.material.datepicker;

import androidx.fragment.app.Fragment;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes.dex */
abstract class o extends Fragment {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    protected final LinkedHashSet f16883m = new LinkedHashSet();

    o() {
    }

    boolean s(n nVar) {
        return this.f16883m.add(nVar);
    }

    void t() {
        this.f16883m.clear();
    }
}
