package m6;

import l6.g;
import l6.h;

/* JADX INFO: loaded from: classes2.dex */
public abstract class a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final a f21268c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f21269a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f21270b;

    static {
        f21268c = b.c() ? b.b() : null;
    }

    public a(g gVar, h hVar) {
        this.f21269a = gVar;
        this.f21270b = hVar;
    }

    public static boolean a() {
        return f21268c != null;
    }

    public static a b() {
        return f21268c;
    }
}
