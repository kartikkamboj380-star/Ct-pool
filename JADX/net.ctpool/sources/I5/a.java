package I5;

import H5.B0;
import M5.t;
import android.os.Looper;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class a implements t {
    @Override // M5.t
    public String a() {
        return "For tests Dispatchers.setMain from kotlinx-coroutines-test module can be used";
    }

    @Override // M5.t
    public B0 b(List list) {
        Looper mainLooper = Looper.getMainLooper();
        if (mainLooper != null) {
            return new c(e.a(mainLooper, true), null, 2, null);
        }
        throw new IllegalStateException("The main looper is not available");
    }

    @Override // M5.t
    public int c() {
        return 1073741823;
    }
}
