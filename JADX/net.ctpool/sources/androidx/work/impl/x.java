package androidx.work.impl;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import r0.RunnableC2012c;

/* JADX INFO: loaded from: classes.dex */
public class x extends l0.r {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final String f9518j = l0.i.i("WorkContinuationImpl");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final E f9519a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f9520b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final l0.d f9521c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List f9522d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final List f9523e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final List f9524f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final List f9525g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f9526h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private l0.l f9527i;

    public x(E e7, String str, l0.d dVar, List list) {
        this(e7, str, dVar, list, null);
    }

    private static boolean i(x xVar, Set set) {
        set.addAll(xVar.c());
        Set setL = l(xVar);
        Iterator it = set.iterator();
        while (it.hasNext()) {
            if (setL.contains((String) it.next())) {
                return true;
            }
        }
        List listE = xVar.e();
        if (listE != null && !listE.isEmpty()) {
            Iterator it2 = listE.iterator();
            while (it2.hasNext()) {
                if (i((x) it2.next(), set)) {
                    return true;
                }
            }
        }
        set.removeAll(xVar.c());
        return false;
    }

    public static Set l(x xVar) {
        HashSet hashSet = new HashSet();
        List listE = xVar.e();
        if (listE != null && !listE.isEmpty()) {
            Iterator it = listE.iterator();
            while (it.hasNext()) {
                hashSet.addAll(((x) it.next()).c());
            }
        }
        return hashSet;
    }

    public l0.l a() {
        if (this.f9526h) {
            l0.i.e().k(f9518j, "Already enqueued work ids (" + TextUtils.join(", ", this.f9523e) + ")");
        } else {
            RunnableC2012c runnableC2012c = new RunnableC2012c(this);
            this.f9519a.w().c(runnableC2012c);
            this.f9527i = runnableC2012c.d();
        }
        return this.f9527i;
    }

    public l0.d b() {
        return this.f9521c;
    }

    public List c() {
        return this.f9523e;
    }

    public String d() {
        return this.f9520b;
    }

    public List e() {
        return this.f9525g;
    }

    public List f() {
        return this.f9522d;
    }

    public E g() {
        return this.f9519a;
    }

    public boolean h() {
        return i(this, new HashSet());
    }

    public boolean j() {
        return this.f9526h;
    }

    public void k() {
        this.f9526h = true;
    }

    public x(E e7, String str, l0.d dVar, List list, List list2) {
        this.f9519a = e7;
        this.f9520b = str;
        this.f9521c = dVar;
        this.f9522d = list;
        this.f9525g = list2;
        this.f9523e = new ArrayList(list.size());
        this.f9524f = new ArrayList();
        if (list2 != null) {
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                this.f9524f.addAll(((x) it.next()).f9524f);
            }
        }
        for (int i7 = 0; i7 < list.size(); i7++) {
            String strB = ((l0.u) list.get(i7)).b();
            this.f9523e.add(strB);
            this.f9524f.add(strB);
        }
    }

    public x(E e7, List list) {
        this(e7, null, l0.d.KEEP, list, null);
    }
}
