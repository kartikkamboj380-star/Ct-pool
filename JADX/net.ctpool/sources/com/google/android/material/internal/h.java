package com.google.android.material.internal;

import android.widget.Checkable;

/* JADX INFO: loaded from: classes.dex */
public interface h extends Checkable {

    public interface a {
        void a(Object obj, boolean z6);
    }

    int getId();

    void setInternalOnCheckedChangeListener(a aVar);
}
