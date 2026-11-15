package l6;

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import l6.g;

/* JADX INFO: loaded from: classes2.dex */
public class d {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final ExecutorService f21153m = Executors.newCachedThreadPool();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    boolean f21158e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    boolean f21160g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    boolean f21161h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    List f21163j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    g f21164k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    h f21165l;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    boolean f21154a = true;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    boolean f21155b = true;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    boolean f21156c = true;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    boolean f21157d = true;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    boolean f21159f = true;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    ExecutorService f21162i = f21153m;

    d() {
    }

    public c a() {
        return new c(this);
    }

    g b() {
        g gVar = this.f21164k;
        return gVar != null ? gVar : g.a.a();
    }

    h c() {
        h hVar = this.f21165l;
        if (hVar != null) {
            return hVar;
        }
        if (m6.a.a()) {
            return m6.a.b().f21270b;
        }
        return null;
    }
}
