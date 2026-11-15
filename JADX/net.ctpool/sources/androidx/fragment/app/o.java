package androidx.fragment.app;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import androidx.core.app.AbstractC0550b;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* JADX INFO: loaded from: classes.dex */
public abstract class o extends AbstractC0642l {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final Activity f8181m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Context f8182n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final Handler f8183o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final int f8184p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    final w f8185q;

    o(Activity activity, Context context, Handler handler, int i7) {
        this.f8185q = new x();
        this.f8181m = activity;
        this.f8182n = (Context) androidx.core.util.f.g(context, "context == null");
        this.f8183o = (Handler) androidx.core.util.f.g(handler, "handler == null");
        this.f8184p = i7;
    }

    public abstract void A();

    Activity m() {
        return this.f8181m;
    }

    Context n() {
        return this.f8182n;
    }

    public Handler p() {
        return this.f8183o;
    }

    public abstract void q(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);

    public abstract Object u();

    public abstract LayoutInflater v();

    public void w(Fragment fragment, String[] strArr, int i7) {
    }

    public abstract boolean x(String str);

    public void y(Fragment fragment, Intent intent, int i7, Bundle bundle) {
        if (i7 != -1) {
            throw new IllegalStateException("Starting activity with a requestCode requires a FragmentActivity host");
        }
        androidx.core.content.b.m(this.f8182n, intent, bundle);
    }

    public void z(Fragment fragment, IntentSender intentSender, int i7, Intent intent, int i8, int i9, int i10, Bundle bundle) throws IntentSender.SendIntentException {
        if (i7 != -1) {
            throw new IllegalStateException("Starting intent sender with a requestCode requires a FragmentActivity host");
        }
        AbstractC0550b.v(this.f8181m, intentSender, i7, intent, i8, i9, i10, bundle);
    }

    o(AbstractActivityC0640j abstractActivityC0640j) {
        this(abstractActivityC0640j, abstractActivityC0640j, new Handler(), 0);
    }
}
