package D1;

import com.google.android.gms.common.api.Api;

/* JADX INFO: loaded from: classes.dex */
public class k implements l {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final l f996d = d(Api.BaseClientBuilder.API_PRIORITY_OTHER, true, true);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    int f997a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    boolean f998b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    boolean f999c;

    private k(int i7, boolean z6, boolean z7) {
        this.f997a = i7;
        this.f998b = z6;
        this.f999c = z7;
    }

    public static l d(int i7, boolean z6, boolean z7) {
        return new k(i7, z6, z7);
    }

    @Override // D1.l
    public boolean a() {
        return this.f999c;
    }

    @Override // D1.l
    public boolean b() {
        return this.f998b;
    }

    @Override // D1.l
    public int c() {
        return this.f997a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return this.f997a == kVar.f997a && this.f998b == kVar.f998b && this.f999c == kVar.f999c;
    }

    public int hashCode() {
        return (this.f997a ^ (this.f998b ? 4194304 : 0)) ^ (this.f999c ? 8388608 : 0);
    }
}
