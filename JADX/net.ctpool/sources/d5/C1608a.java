package d5;

import android.content.Context;
import android.content.pm.PackageManager;

/* JADX INFO: renamed from: d5.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1608a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C1608a f18682a = new C1608a();

    private C1608a() {
    }

    public final boolean a(Context context) {
        PackageManager packageManager;
        return (context == null || (packageManager = context.getPackageManager()) == null || !packageManager.hasSystemFeature("android.software.leanback")) ? false : true;
    }
}
