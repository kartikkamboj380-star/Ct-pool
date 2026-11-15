package G1;

import android.util.SparseArray;
import java.util.LinkedList;

/* JADX INFO: loaded from: classes.dex */
public class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final SparseArray f1205a = new SparseArray();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    a f1206b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    a f1207c;

    static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        a f1208a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f1209b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        LinkedList f1210c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        a f1211d;

        private a(a aVar, int i7, LinkedList linkedList, a aVar2) {
            this.f1208a = aVar;
            this.f1209b = i7;
            this.f1210c = linkedList;
            this.f1211d = aVar2;
        }

        public String toString() {
            return "LinkedEntry(key: " + this.f1209b + ")";
        }
    }

    private void b(a aVar) {
        if (aVar == null || !aVar.f1210c.isEmpty()) {
            return;
        }
        d(aVar);
        this.f1205a.remove(aVar.f1209b);
    }

    private void c(a aVar) {
        if (this.f1206b == aVar) {
            return;
        }
        d(aVar);
        a aVar2 = this.f1206b;
        if (aVar2 == null) {
            this.f1206b = aVar;
            this.f1207c = aVar;
        } else {
            aVar.f1211d = aVar2;
            aVar2.f1208a = aVar;
            this.f1206b = aVar;
        }
    }

    private synchronized void d(a aVar) {
        try {
            a aVar2 = aVar.f1208a;
            a aVar3 = aVar.f1211d;
            if (aVar2 != null) {
                aVar2.f1211d = aVar3;
            }
            if (aVar3 != null) {
                aVar3.f1208a = aVar2;
            }
            aVar.f1208a = null;
            aVar.f1211d = null;
            if (aVar == this.f1206b) {
                this.f1206b = aVar3;
            }
            if (aVar == this.f1207c) {
                this.f1207c = aVar2;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized Object a(int i7) {
        a aVar = (a) this.f1205a.get(i7);
        if (aVar == null) {
            return null;
        }
        Object objPollFirst = aVar.f1210c.pollFirst();
        c(aVar);
        return objPollFirst;
    }

    public synchronized void e(int i7, Object obj) {
        try {
            a aVar = (a) this.f1205a.get(i7);
            if (aVar == null) {
                aVar = new a(null, i7, new LinkedList(), null);
                this.f1205a.put(i7, aVar);
            }
            aVar.f1210c.addLast(obj);
            c(aVar);
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized Object f() {
        a aVar = this.f1207c;
        if (aVar == null) {
            return null;
        }
        Object objPollLast = aVar.f1210c.pollLast();
        b(aVar);
        return objPollLast;
    }
}
