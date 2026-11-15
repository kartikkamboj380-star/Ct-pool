package androidx.work;

import android.content.Context;
import androidx.work.a;
import c0.InterfaceC0707a;
import java.util.Collections;
import java.util.List;
import l0.i;
import l0.t;

/* JADX INFO: loaded from: classes.dex */
public final class WorkManagerInitializer implements InterfaceC0707a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f9206a = i.i("WrkMgrInitializer");

    @Override // c0.InterfaceC0707a
    public List a() {
        return Collections.emptyList();
    }

    @Override // c0.InterfaceC0707a
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public t b(Context context) {
        i.e().a(f9206a, "Initializing WorkManager with default configuration.");
        t.i(context, new a.b().a());
        return t.h(context);
    }
}
