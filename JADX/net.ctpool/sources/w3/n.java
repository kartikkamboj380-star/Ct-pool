package w3;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.measurement.internal.C1449n2;
import com.google.android.gms.measurement.internal.S2;

/* JADX INFO: loaded from: classes.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f22688a;

    public interface a {
        void a(Context context, Intent intent);
    }

    public n(a aVar) {
        Preconditions.checkNotNull(aVar);
        this.f22688a = aVar;
    }

    public final void a(Context context, Intent intent) {
        C1449n2 c1449n2D = S2.b(context, null, null).d();
        if (intent == null) {
            c1449n2D.J().a("Receiver called with null intent");
            return;
        }
        String action = intent.getAction();
        c1449n2D.I().b("Local receiver got", action);
        if (!"com.google.android.gms.measurement.UPLOAD".equals(action)) {
            if ("com.android.vending.INSTALL_REFERRER".equals(action)) {
                c1449n2D.J().a("Install Referrer Broadcasts are deprecated");
            }
        } else {
            Intent className = new Intent().setClassName(context, "com.google.android.gms.measurement.AppMeasurementService");
            className.setAction("com.google.android.gms.measurement.UPLOAD");
            c1449n2D.I().a("Starting wakeful intent.");
            this.f22688a.a(context, className);
        }
    }
}
