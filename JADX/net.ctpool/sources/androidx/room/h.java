package androidx.room;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public abstract class h extends A {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(u uVar) {
        super(uVar);
        w5.k.f(uVar, "database");
    }

    protected abstract void bind(Z.k kVar, Object obj);

    public final int handle(Object obj) {
        Z.k kVarAcquire = acquire();
        try {
            bind(kVarAcquire, obj);
            return kVarAcquire.D();
        } finally {
            release(kVarAcquire);
        }
    }

    public final int handleMultiple(Iterable<Object> iterable) {
        w5.k.f(iterable, "entities");
        Z.k kVarAcquire = acquire();
        try {
            Iterator<Object> it = iterable.iterator();
            int iD = 0;
            while (it.hasNext()) {
                bind(kVarAcquire, it.next());
                iD += kVarAcquire.D();
            }
            return iD;
        } finally {
            release(kVarAcquire);
        }
    }

    public final int handleMultiple(Object[] objArr) {
        w5.k.f(objArr, "entities");
        Z.k kVarAcquire = acquire();
        try {
            int iD = 0;
            for (Object obj : objArr) {
                bind(kVarAcquire, obj);
                iD += kVarAcquire.D();
            }
            return iD;
        } finally {
            release(kVarAcquire);
        }
    }
}
