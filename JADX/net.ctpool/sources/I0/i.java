package I0;

import O0.l;
import android.net.Uri;

/* JADX INFO: loaded from: classes.dex */
public class i implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final String f1511a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final boolean f1512b;

    public i(String str) {
        this(str, false);
    }

    @Override // I0.d
    public boolean a(Uri uri) {
        return this.f1511a.contains(uri.toString());
    }

    @Override // I0.d
    public boolean b() {
        return this.f1512b;
    }

    @Override // I0.d
    public String c() {
        return this.f1511a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof i) {
            return this.f1511a.equals(((i) obj).f1511a);
        }
        return false;
    }

    public int hashCode() {
        return this.f1511a.hashCode();
    }

    public String toString() {
        return this.f1511a;
    }

    public i(String str, boolean z6) {
        this.f1511a = (String) l.g(str);
        this.f1512b = z6;
    }
}
