package I0;

import O0.l;
import android.net.Uri;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class f implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final List f1508a;

    public f(List list) {
        this.f1508a = (List) l.g(list);
    }

    @Override // I0.d
    public boolean a(Uri uri) {
        for (int i7 = 0; i7 < this.f1508a.size(); i7++) {
            if (((d) this.f1508a.get(i7)).a(uri)) {
                return true;
            }
        }
        return false;
    }

    @Override // I0.d
    public boolean b() {
        return false;
    }

    @Override // I0.d
    public String c() {
        return ((d) this.f1508a.get(0)).c();
    }

    public List d() {
        return this.f1508a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f) {
            return this.f1508a.equals(((f) obj).f1508a);
        }
        return false;
    }

    public int hashCode() {
        return this.f1508a.hashCode();
    }

    public String toString() {
        return "MultiCacheKey:" + this.f1508a.toString();
    }
}
