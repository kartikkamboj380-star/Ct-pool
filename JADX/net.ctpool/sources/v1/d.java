package v1;

import S0.g;
import android.graphics.Bitmap;

/* JADX INFO: loaded from: classes.dex */
public class d implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static d f22580a;

    private d() {
    }

    public static d b() {
        if (f22580a == null) {
            f22580a = new d();
        }
        return f22580a;
    }

    @Override // S0.g
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void a(Bitmap bitmap) {
        bitmap.recycle();
    }
}
