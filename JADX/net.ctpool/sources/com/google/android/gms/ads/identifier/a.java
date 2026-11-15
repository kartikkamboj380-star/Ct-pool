package com.google.android.gms.ads.identifier;

import android.net.Uri;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
final class a extends Thread {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    final /* synthetic */ Map f13473m;

    a(AdvertisingIdClient advertisingIdClient, Map map) {
        this.f13473m = map;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Map map = this.f13473m;
        Uri.Builder builderBuildUpon = Uri.parse("https://pagead2.googlesyndication.com/pagead/gen_204?id=gmob-apps").buildUpon();
        for (String str : map.keySet()) {
            builderBuildUpon.appendQueryParameter(str, (String) map.get(str));
        }
        zzc.zza(builderBuildUpon.build().toString());
    }
}
