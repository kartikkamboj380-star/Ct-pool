package O2;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public class d implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f2469a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a f2470b;

    public d(Context context) {
        this.f2469a = context;
        a aVar = new a(5);
        this.f2470b = aVar;
        aVar.a(context.getApplicationInfo().sourceDir);
    }

    @Override // O2.g
    public f get() {
        return new c(new j(), new e(this.f2469a, this.f2470b), new h(), new i(), new j(), new b(this.f2469a, this.f2470b));
    }
}
