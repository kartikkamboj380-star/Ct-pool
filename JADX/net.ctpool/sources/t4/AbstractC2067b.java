package t4;

import Y3.f;
import android.content.Intent;
import android.net.Uri;
import t4.C2066a;
import z3.AbstractC2272l;

/* JADX INFO: renamed from: t4.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2067b {
    public static synchronized AbstractC2067b d() {
        return e(f.o());
    }

    public static synchronized AbstractC2067b e(f fVar) {
        return (AbstractC2067b) fVar.k(AbstractC2067b.class);
    }

    public abstract C2066a.c a();

    public abstract AbstractC2272l b(Intent intent);

    public abstract AbstractC2272l c(Uri uri);
}
