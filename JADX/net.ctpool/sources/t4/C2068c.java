package t4;

import android.net.Uri;
import android.os.Bundle;
import com.google.android.gms.common.util.DefaultClock;
import u4.C2135a;
import u4.C2137c;

/* JADX INFO: renamed from: t4.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C2068c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C2137c f22335a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C2135a f22336b;

    public C2068c(C2135a c2135a) {
        if (c2135a == null) {
            this.f22336b = null;
            this.f22335a = null;
        } else {
            if (c2135a.w() == 0) {
                c2135a.h1(DefaultClock.getInstance().currentTimeMillis());
            }
            this.f22336b = c2135a;
            this.f22335a = new C2137c(c2135a);
        }
    }

    public Uri a() {
        String strA0;
        C2135a c2135a = this.f22336b;
        if (c2135a == null || (strA0 = c2135a.a0()) == null) {
            return null;
        }
        return Uri.parse(strA0);
    }

    public int b() {
        C2135a c2135a = this.f22336b;
        if (c2135a == null) {
            return 0;
        }
        return c2135a.H0();
    }

    public Bundle c() {
        C2137c c2137c = this.f22335a;
        return c2137c == null ? new Bundle() : c2137c.a();
    }
}
