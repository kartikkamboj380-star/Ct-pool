package androidx.room;

import Z.h;
import android.content.Context;
import android.content.Intent;
import androidx.room.u;
import java.io.File;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f8946a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f8947b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h.c f8948c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final u.e f8949d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List f8950e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f8951f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final u.d f8952g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Executor f8953h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Executor f8954i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Intent f8955j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f8956k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f8957l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final Set f8958m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final String f8959n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final File f8960o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Callable f8961p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final List f8962q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final List f8963r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final boolean f8964s;

    public f(Context context, String str, h.c cVar, u.e eVar, List list, boolean z6, u.d dVar, Executor executor, Executor executor2, Intent intent, boolean z7, boolean z8, Set set, String str2, File file, Callable callable, u.f fVar, List list2, List list3) {
        w5.k.f(context, "context");
        w5.k.f(cVar, "sqliteOpenHelperFactory");
        w5.k.f(eVar, "migrationContainer");
        w5.k.f(dVar, "journalMode");
        w5.k.f(executor, "queryExecutor");
        w5.k.f(executor2, "transactionExecutor");
        w5.k.f(list2, "typeConverters");
        w5.k.f(list3, "autoMigrationSpecs");
        this.f8946a = context;
        this.f8947b = str;
        this.f8948c = cVar;
        this.f8949d = eVar;
        this.f8950e = list;
        this.f8951f = z6;
        this.f8952g = dVar;
        this.f8953h = executor;
        this.f8954i = executor2;
        this.f8955j = intent;
        this.f8956k = z7;
        this.f8957l = z8;
        this.f8958m = set;
        this.f8959n = str2;
        this.f8960o = file;
        this.f8961p = callable;
        this.f8962q = list2;
        this.f8963r = list3;
        this.f8964s = intent != null;
    }

    public boolean a(int i7, int i8) {
        if ((i7 > i8 && this.f8957l) || !this.f8956k) {
            return false;
        }
        Set set = this.f8958m;
        return set == null || !set.contains(Integer.valueOf(i7));
    }
}
