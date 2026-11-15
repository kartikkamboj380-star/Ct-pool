package w3;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.internal.measurement.C1195r7;
import com.google.android.gms.measurement.internal.G;
import com.google.android.gms.measurement.internal.S2;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class F extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final S2 f22686a;

    public F(S2 s22) {
        this.f22686a = s22;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (intent == null) {
            this.f22686a.d().J().a("App receiver called with null intent");
            return;
        }
        String action = intent.getAction();
        if (action == null) {
            this.f22686a.d().J().a("App receiver called with null action");
            return;
        }
        if (!action.equals("com.google.android.gms.measurement.TRIGGERS_AVAILABLE")) {
            this.f22686a.d().J().a("App receiver called with unknown action");
            return;
        }
        final S2 s22 = this.f22686a;
        if (C1195r7.a() && s22.x().F(null, G.f15475J0)) {
            s22.d().I().a("App receiver notified triggers are available");
            s22.f().B(new Runnable() { // from class: com.google.android.gms.measurement.internal.f6
                @Override // java.lang.Runnable
                public final void run() {
                    S2 s23 = s22;
                    if (!s23.J().V0()) {
                        s23.d().J().a("registerTrigger called but app not eligible");
                        return;
                    }
                    final F3 f3F = s23.F();
                    Objects.requireNonNull(f3F);
                    new Thread(new Runnable() { // from class: com.google.android.gms.measurement.internal.g6
                        @Override // java.lang.Runnable
                        public final void run() {
                            f3F.C0();
                        }
                    }).start();
                }
            });
        }
    }
}
