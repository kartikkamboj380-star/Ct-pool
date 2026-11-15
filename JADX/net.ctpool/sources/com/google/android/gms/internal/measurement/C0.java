package com.google.android.gms.internal.measurement;

import java.net.URL;
import java.net.URLConnection;

/* JADX INFO: loaded from: classes.dex */
final class C0 extends D0 {
    private C0() {
    }

    @Override // com.google.android.gms.internal.measurement.D0
    public final URLConnection b(URL url, String str) {
        return url.openConnection();
    }
}
