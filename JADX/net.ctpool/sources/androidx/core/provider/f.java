package androidx.core.provider;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import androidx.core.provider.g;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes.dex */
abstract class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final n.e f7188a = new n.e(16);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final ExecutorService f7189b = h.a("fonts-androidx", 10, 10000);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final Object f7190c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final n.g f7191d = new n.g();

    class a implements Callable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f7192a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f7193b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.core.provider.e f7194c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f7195d;

        a(String str, Context context, androidx.core.provider.e eVar, int i7) {
            this.f7192a = str;
            this.f7193b = context;
            this.f7194c = eVar;
            this.f7195d = i7;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public e call() {
            return f.c(this.f7192a, this.f7193b, this.f7194c, this.f7195d);
        }
    }

    class b implements androidx.core.util.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ androidx.core.provider.a f7196a;

        b(androidx.core.provider.a aVar) {
            this.f7196a = aVar;
        }

        @Override // androidx.core.util.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(e eVar) {
            if (eVar == null) {
                eVar = new e(-3);
            }
            this.f7196a.b(eVar);
        }
    }

    class c implements Callable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f7197a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f7198b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.core.provider.e f7199c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f7200d;

        c(String str, Context context, androidx.core.provider.e eVar, int i7) {
            this.f7197a = str;
            this.f7198b = context;
            this.f7199c = eVar;
            this.f7200d = i7;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public e call() {
            try {
                return f.c(this.f7197a, this.f7198b, this.f7199c, this.f7200d);
            } catch (Throwable unused) {
                return new e(-3);
            }
        }
    }

    class d implements androidx.core.util.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f7201a;

        d(String str) {
            this.f7201a = str;
        }

        @Override // androidx.core.util.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(e eVar) {
            synchronized (f.f7190c) {
                try {
                    n.g gVar = f.f7191d;
                    ArrayList arrayList = (ArrayList) gVar.get(this.f7201a);
                    if (arrayList == null) {
                        return;
                    }
                    gVar.remove(this.f7201a);
                    for (int i7 = 0; i7 < arrayList.size(); i7++) {
                        ((androidx.core.util.a) arrayList.get(i7)).a(eVar);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    static final class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Typeface f7202a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final int f7203b;

        e(int i7) {
            this.f7202a = null;
            this.f7203b = i7;
        }

        boolean a() {
            return this.f7203b == 0;
        }

        e(Typeface typeface) {
            this.f7202a = typeface;
            this.f7203b = 0;
        }
    }

    private static String a(androidx.core.provider.e eVar, int i7) {
        return eVar.d() + "-" + i7;
    }

    private static int b(g.a aVar) {
        int i7 = 1;
        if (aVar.c() != 0) {
            return aVar.c() != 1 ? -3 : -2;
        }
        g.b[] bVarArrB = aVar.b();
        if (bVarArrB != null && bVarArrB.length != 0) {
            i7 = 0;
            for (g.b bVar : bVarArrB) {
                int iB = bVar.b();
                if (iB != 0) {
                    if (iB < 0) {
                        return -3;
                    }
                    return iB;
                }
            }
        }
        return i7;
    }

    static e c(String str, Context context, androidx.core.provider.e eVar, int i7) {
        n.e eVar2 = f7188a;
        Typeface typeface = (Typeface) eVar2.c(str);
        if (typeface != null) {
            return new e(typeface);
        }
        try {
            g.a aVarE = androidx.core.provider.d.e(context, eVar, null);
            int iB = b(aVarE);
            if (iB != 0) {
                return new e(iB);
            }
            Typeface typefaceB = androidx.core.graphics.d.b(context, null, aVarE.b(), i7);
            if (typefaceB == null) {
                return new e(-3);
            }
            eVar2.d(str, typefaceB);
            return new e(typefaceB);
        } catch (PackageManager.NameNotFoundException unused) {
            return new e(-1);
        }
    }

    static Typeface d(Context context, androidx.core.provider.e eVar, int i7, Executor executor, androidx.core.provider.a aVar) {
        String strA = a(eVar, i7);
        Typeface typeface = (Typeface) f7188a.c(strA);
        if (typeface != null) {
            aVar.b(new e(typeface));
            return typeface;
        }
        b bVar = new b(aVar);
        synchronized (f7190c) {
            try {
                n.g gVar = f7191d;
                ArrayList arrayList = (ArrayList) gVar.get(strA);
                if (arrayList != null) {
                    arrayList.add(bVar);
                    return null;
                }
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(bVar);
                gVar.put(strA, arrayList2);
                c cVar = new c(strA, context, eVar, i7);
                if (executor == null) {
                    executor = f7189b;
                }
                h.b(executor, cVar, new d(strA));
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    static Typeface e(Context context, androidx.core.provider.e eVar, androidx.core.provider.a aVar, int i7, int i8) {
        String strA = a(eVar, i7);
        Typeface typeface = (Typeface) f7188a.c(strA);
        if (typeface != null) {
            aVar.b(new e(typeface));
            return typeface;
        }
        if (i8 == -1) {
            e eVarC = c(strA, context, eVar, i7);
            aVar.b(eVarC);
            return eVarC.f7202a;
        }
        try {
            e eVar2 = (e) h.c(f7189b, new a(strA, context, eVar, i7), i8);
            aVar.b(eVar2);
            return eVar2.f7202a;
        } catch (InterruptedException unused) {
            aVar.b(new e(-3));
            return null;
        }
    }
}
