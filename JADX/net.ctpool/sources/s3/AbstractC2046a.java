package s3;

import android.os.Build;

/* JADX INFO: renamed from: s3.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2046a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f22261a;

    static {
        f22261a = Build.VERSION.SDK_INT >= 31 ? 33554432 : 0;
    }
}
