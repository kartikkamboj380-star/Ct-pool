package h3;

import android.os.Bundle;
import android.os.IBinder;
import com.google.android.gms.internal.auth.AbstractBinderC0979k0;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
final class g implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f19627a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ Bundle f19628b;

    g(String str, Bundle bundle) {
        this.f19627a = str;
        this.f19628b = bundle;
    }

    @Override // h3.h
    public final /* bridge */ /* synthetic */ Object a(IBinder iBinder) throws IOException, C1709a {
        Bundle bundleQ = AbstractBinderC0979k0.j0(iBinder).Q(this.f19627a, this.f19628b);
        i.f(bundleQ);
        String string = bundleQ.getString("Error");
        if (bundleQ.getBoolean("booleanResult")) {
            return null;
        }
        throw new C1709a(string);
    }
}
