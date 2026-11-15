package s3;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: loaded from: classes.dex */
public class f extends Handler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Looper f22264a;

    public f(Looper looper) {
        super(looper);
        this.f22264a = Looper.getMainLooper();
    }

    public f(Looper looper, Handler.Callback callback) {
        super(looper, callback);
        this.f22264a = Looper.getMainLooper();
    }
}
