package com.google.android.datatransport.cct;

import V2.h;
import V2.m;
import androidx.annotation.Keep;

/* JADX INFO: loaded from: classes.dex */
@Keep
public class CctBackendFactory implements V2.d {
    @Override // V2.d
    public m create(h hVar) {
        return new d(hVar.b(), hVar.e(), hVar.d());
    }
}
