package i3;

import android.os.Bundle;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.internal.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class g implements Api.ApiOptions.Optional {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final g f19936p = new g(new f());

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final String f19937m = null;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final boolean f19938n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final String f19939o;

    public g(f fVar) {
        this.f19938n = fVar.f19934a.booleanValue();
        this.f19939o = fVar.f19935b;
    }

    static /* bridge */ /* synthetic */ String b(g gVar) {
        String str = gVar.f19937m;
        return null;
    }

    public final Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putString("consumer_package", null);
        bundle.putBoolean("force_save_dialog", this.f19938n);
        bundle.putString("log_session_id", this.f19939o);
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        String str = gVar.f19937m;
        return Objects.equal(null, null) && this.f19938n == gVar.f19938n && Objects.equal(this.f19939o, gVar.f19939o);
    }

    public final int hashCode() {
        return Objects.hashCode(null, Boolean.valueOf(this.f19938n), this.f19939o);
    }
}
