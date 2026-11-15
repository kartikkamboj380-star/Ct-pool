package Q3;

import android.content.Context;
import android.content.IntentFilter;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public abstract class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final p f2772a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final IntentFilter f2773b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Context f2774c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected final Set f2775d = new HashSet();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private volatile boolean f2776e = false;

    protected o(p pVar, IntentFilter intentFilter, Context context) {
        this.f2772a = pVar;
        this.f2773b = intentFilter;
        this.f2774c = C.a(context);
    }
}
