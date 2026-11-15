package com.google.android.gms.measurement.internal;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;

/* JADX INFO: loaded from: classes.dex */
public final class i6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final S2 f16084a;

    public i6(S2 s22) {
        this.f16084a = s22;
    }

    private final boolean d() {
        return this.f16084a.D().f16393z.a() > 0;
    }

    private final boolean e() {
        return d() && this.f16084a.zzb().currentTimeMillis() - this.f16084a.D().f16393z.a() > this.f16084a.x().y(null, G.f15500W);
    }

    final void a() {
        this.f16084a.f().l();
        if (d()) {
            if (e()) {
                this.f16084a.D().f16392y.b(null);
                Bundle bundle = new Bundle();
                bundle.putString("source", "(not set)");
                bundle.putString("medium", "(not set)");
                bundle.putString("_cis", "intent");
                bundle.putLong("_cc", 1L);
                this.f16084a.F().Z0("auto", "_cmpx", bundle);
            } else {
                String strA = this.f16084a.D().f16392y.a();
                if (TextUtils.isEmpty(strA)) {
                    this.f16084a.d().G().a("Cache still valid but referrer not found");
                } else {
                    long jA = ((this.f16084a.D().f16393z.a() / 3600000) - 1) * 3600000;
                    Uri uri = Uri.parse(strA);
                    Bundle bundle2 = new Bundle();
                    Pair pair = new Pair(uri.getPath(), bundle2);
                    for (String str : uri.getQueryParameterNames()) {
                        bundle2.putString(str, uri.getQueryParameter(str));
                    }
                    ((Bundle) pair.second).putLong("_cc", jA);
                    Object obj = pair.first;
                    this.f16084a.F().Z0(obj == null ? "app" : (String) obj, "_cmp", (Bundle) pair.second);
                }
                this.f16084a.D().f16392y.b(null);
            }
            this.f16084a.D().f16393z.b(0L);
        }
    }

    final void b(String str, Bundle bundle) {
        String string;
        this.f16084a.f().l();
        if (this.f16084a.n()) {
            return;
        }
        if (bundle == null || bundle.isEmpty()) {
            string = null;
        } else {
            if (str == null || str.isEmpty()) {
                str = "auto";
            }
            Uri.Builder builder = new Uri.Builder();
            builder.path(str);
            for (String str2 : bundle.keySet()) {
                builder.appendQueryParameter(str2, bundle.getString(str2));
            }
            string = builder.build().toString();
        }
        if (TextUtils.isEmpty(string)) {
            return;
        }
        this.f16084a.D().f16392y.b(string);
        this.f16084a.D().f16393z.b(this.f16084a.zzb().currentTimeMillis());
    }

    final void c() {
        if (d() && e()) {
            this.f16084a.D().f16392y.b(null);
        }
    }
}
