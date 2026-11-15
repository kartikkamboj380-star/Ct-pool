package P4;

import P4.h;
import android.content.Context;
import android.os.Bundle;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m5.InterfaceC1885d;
import w5.k;

/* JADX INFO: loaded from: classes.dex */
public final class b implements h {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final a f2636b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Bundle f2637a;

    private static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public b(Context context) {
        k.f(context, "context");
        Bundle bundle = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
        this.f2637a = bundle == null ? Bundle.EMPTY : bundle;
    }

    @Override // P4.h
    public Boolean a() {
        if (this.f2637a.containsKey("firebase_sessions_enabled")) {
            return Boolean.valueOf(this.f2637a.getBoolean("firebase_sessions_enabled"));
        }
        return null;
    }

    @Override // P4.h
    public G5.a b() {
        if (this.f2637a.containsKey("firebase_sessions_sessions_restart_timeout")) {
            return G5.a.h(G5.c.h(this.f2637a.getInt("firebase_sessions_sessions_restart_timeout"), G5.d.f1278q));
        }
        return null;
    }

    @Override // P4.h
    public Double c() {
        if (this.f2637a.containsKey("firebase_sessions_sampling_rate")) {
            return Double.valueOf(this.f2637a.getDouble("firebase_sessions_sampling_rate"));
        }
        return null;
    }

    @Override // P4.h
    public Object d(InterfaceC1885d interfaceC1885d) {
        return h.a.a(this, interfaceC1885d);
    }
}
