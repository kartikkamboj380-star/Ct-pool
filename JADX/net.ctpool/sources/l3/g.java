package l3;

import android.content.Context;
import android.util.Log;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.internal.SignInConnectionListener;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class g extends Q.a implements SignInConnectionListener {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final Semaphore f21103o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final Set f21104p;

    public g(Context context, Set set) {
        super(context);
        this.f21103o = new Semaphore(0);
        this.f21104p = set;
    }

    @Override // Q.a
    public final /* bridge */ /* synthetic */ Object G() {
        Iterator it = this.f21104p.iterator();
        int i7 = 0;
        while (it.hasNext()) {
            if (((GoogleApiClient) it.next()).maybeSignIn(this)) {
                i7++;
            }
        }
        try {
            this.f21103o.tryAcquire(i7, 5L, TimeUnit.SECONDS);
            return null;
        } catch (InterruptedException e7) {
            Log.i("GACSignInLoader", "Unexpected InterruptedException", e7);
            Thread.currentThread().interrupt();
            return null;
        }
    }

    @Override // com.google.android.gms.common.api.internal.SignInConnectionListener
    public final void onComplete() {
        this.f21103o.release();
    }

    @Override // Q.c
    protected final void r() {
        this.f21103o.drainPermits();
        h();
    }
}
