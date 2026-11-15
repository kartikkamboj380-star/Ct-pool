package Z3;

import Y3.f;
import Z3.a;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.C1073e1;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import v3.C2169a;

/* JADX INFO: loaded from: classes.dex */
public class b implements Z3.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static volatile Z3.a f4633c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C2169a f4634a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final Map f4635b;

    class a implements a.InterfaceC0109a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final /* synthetic */ String f4636a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final /* synthetic */ b f4637b;

        a(b bVar, String str) {
            this.f4636a = str;
            this.f4637b = bVar;
        }
    }

    private b(C2169a c2169a) {
        Preconditions.checkNotNull(c2169a);
        this.f4634a = c2169a;
        this.f4635b = new ConcurrentHashMap();
    }

    public static Z3.a d(f fVar, Context context, A4.d dVar) {
        Preconditions.checkNotNull(fVar);
        Preconditions.checkNotNull(context);
        Preconditions.checkNotNull(dVar);
        Preconditions.checkNotNull(context.getApplicationContext());
        if (f4633c == null) {
            synchronized (b.class) {
                try {
                    if (f4633c == null) {
                        Bundle bundle = new Bundle(1);
                        if (fVar.y()) {
                            dVar.c(Y3.b.class, new Executor() { // from class: Z3.c
                                @Override // java.util.concurrent.Executor
                                public final void execute(Runnable runnable) {
                                    runnable.run();
                                }
                            }, new A4.b() { // from class: Z3.d
                                @Override // A4.b
                                public final void a(A4.a aVar) {
                                    b.e(aVar);
                                }
                            });
                            bundle.putBoolean("dataCollectionDefaultEnabled", fVar.x());
                        }
                        f4633c = new b(C1073e1.f(context, null, null, null, bundle).A());
                    }
                } finally {
                }
            }
        }
        return f4633c;
    }

    static /* synthetic */ void e(A4.a aVar) {
        boolean z6 = ((Y3.b) aVar.a()).f4432a;
        synchronized (b.class) {
            ((b) Preconditions.checkNotNull(f4633c)).f4634a.d(z6);
        }
    }

    private final boolean f(String str) {
        return (str.isEmpty() || !this.f4635b.containsKey(str) || this.f4635b.get(str) == null) ? false : true;
    }

    @Override // Z3.a
    public a.InterfaceC0109a a(String str, a.b bVar) {
        Preconditions.checkNotNull(bVar);
        if (!com.google.firebase.analytics.connector.internal.a.g(str) || f(str)) {
            return null;
        }
        C2169a c2169a = this.f4634a;
        Object dVar = "fiam".equals(str) ? new com.google.firebase.analytics.connector.internal.d(c2169a, bVar) : "clx".equals(str) ? new com.google.firebase.analytics.connector.internal.f(c2169a, bVar) : null;
        if (dVar == null) {
            return null;
        }
        this.f4635b.put(str, dVar);
        return new a(this, str);
    }

    @Override // Z3.a
    public void b(String str, String str2, Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        if (com.google.firebase.analytics.connector.internal.a.g(str) && com.google.firebase.analytics.connector.internal.a.c(str2, bundle) && com.google.firebase.analytics.connector.internal.a.e(str, str2, bundle)) {
            com.google.firebase.analytics.connector.internal.a.b(str, str2, bundle);
            this.f4634a.a(str, str2, bundle);
        }
    }

    @Override // Z3.a
    public void c(String str, String str2, Object obj) {
        if (com.google.firebase.analytics.connector.internal.a.g(str) && com.google.firebase.analytics.connector.internal.a.d(str, str2)) {
            this.f4634a.c(str, str2, obj);
        }
    }
}
