package P3;

import android.content.Context;
import android.content.IntentFilter;

/* JADX INFO: loaded from: classes.dex */
public final class i extends Q3.o {
    public i(Context context) {
        super(new Q3.p("AppUpdateListenerRegistry"), new IntentFilter("com.google.android.play.core.install.ACTION_INSTALL_STATUS"), context);
    }
}
