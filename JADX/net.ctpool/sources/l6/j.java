package l6;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
final class j {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final List f21172d = new ArrayList();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    Object f21173a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    q f21174b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    j f21175c;

    private j(Object obj, q qVar) {
        this.f21173a = obj;
        this.f21174b = qVar;
    }

    static j a(q qVar, Object obj) {
        List list = f21172d;
        synchronized (list) {
            try {
                int size = list.size();
                if (size <= 0) {
                    return new j(obj, qVar);
                }
                j jVar = (j) list.remove(size - 1);
                jVar.f21173a = obj;
                jVar.f21174b = qVar;
                jVar.f21175c = null;
                return jVar;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    static void b(j jVar) {
        jVar.f21173a = null;
        jVar.f21174b = null;
        jVar.f21175c = null;
        List list = f21172d;
        synchronized (list) {
            try {
                if (list.size() < 10000) {
                    list.add(jVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
