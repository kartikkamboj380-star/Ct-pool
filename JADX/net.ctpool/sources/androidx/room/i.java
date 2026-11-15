package androidx.room;

import j5.AbstractC1809n;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import w5.AbstractC2198b;

/* JADX INFO: loaded from: classes.dex */
public abstract class i extends A {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(u uVar) {
        super(uVar);
        w5.k.f(uVar, "database");
    }

    protected abstract void bind(Z.k kVar, Object obj);

    public final void insert(Iterable<Object> iterable) {
        w5.k.f(iterable, "entities");
        Z.k kVarAcquire = acquire();
        try {
            Iterator<Object> it = iterable.iterator();
            while (it.hasNext()) {
                bind(kVarAcquire, it.next());
                kVarAcquire.Y0();
            }
        } finally {
            release(kVarAcquire);
        }
    }

    public final long insertAndReturnId(Object obj) {
        Z.k kVarAcquire = acquire();
        try {
            bind(kVarAcquire, obj);
            return kVarAcquire.Y0();
        } finally {
            release(kVarAcquire);
        }
    }

    public final long[] insertAndReturnIdsArray(Collection<Object> collection) {
        w5.k.f(collection, "entities");
        Z.k kVarAcquire = acquire();
        try {
            long[] jArr = new long[collection.size()];
            int i7 = 0;
            for (Object obj : collection) {
                int i8 = i7 + 1;
                if (i7 < 0) {
                    AbstractC1809n.p();
                }
                bind(kVarAcquire, obj);
                jArr[i7] = kVarAcquire.Y0();
                i7 = i8;
            }
            release(kVarAcquire);
            return jArr;
        } catch (Throwable th) {
            release(kVarAcquire);
            throw th;
        }
    }

    public final Long[] insertAndReturnIdsArrayBox(Collection<Object> collection) {
        w5.k.f(collection, "entities");
        Z.k kVarAcquire = acquire();
        Iterator<Object> it = collection.iterator();
        try {
            int size = collection.size();
            Long[] lArr = new Long[size];
            for (int i7 = 0; i7 < size; i7++) {
                bind(kVarAcquire, it.next());
                lArr[i7] = Long.valueOf(kVarAcquire.Y0());
            }
            return lArr;
        } finally {
            release(kVarAcquire);
        }
    }

    public final List<Long> insertAndReturnIdsList(Collection<Object> collection) {
        w5.k.f(collection, "entities");
        Z.k kVarAcquire = acquire();
        try {
            List listC = AbstractC1809n.c();
            Iterator<T> it = collection.iterator();
            while (it.hasNext()) {
                bind(kVarAcquire, it.next());
                listC.add(Long.valueOf(kVarAcquire.Y0()));
            }
            List<Long> listA = AbstractC1809n.a(listC);
            release(kVarAcquire);
            return listA;
        } catch (Throwable th) {
            release(kVarAcquire);
            throw th;
        }
    }

    public final void insert(Object obj) {
        Z.k kVarAcquire = acquire();
        try {
            bind(kVarAcquire, obj);
            kVarAcquire.Y0();
        } finally {
            release(kVarAcquire);
        }
    }

    public final long[] insertAndReturnIdsArray(Object[] objArr) {
        w5.k.f(objArr, "entities");
        Z.k kVarAcquire = acquire();
        try {
            long[] jArr = new long[objArr.length];
            int length = objArr.length;
            int i7 = 0;
            int i8 = 0;
            while (i7 < length) {
                int i9 = i8 + 1;
                bind(kVarAcquire, objArr[i7]);
                jArr[i8] = kVarAcquire.Y0();
                i7++;
                i8 = i9;
            }
            return jArr;
        } finally {
            release(kVarAcquire);
        }
    }

    public final Long[] insertAndReturnIdsArrayBox(Object[] objArr) {
        w5.k.f(objArr, "entities");
        Z.k kVarAcquire = acquire();
        Iterator itA = AbstractC2198b.a(objArr);
        try {
            int length = objArr.length;
            Long[] lArr = new Long[length];
            for (int i7 = 0; i7 < length; i7++) {
                bind(kVarAcquire, itA.next());
                lArr[i7] = Long.valueOf(kVarAcquire.Y0());
            }
            return lArr;
        } finally {
            release(kVarAcquire);
        }
    }

    public final List<Long> insertAndReturnIdsList(Object[] objArr) {
        w5.k.f(objArr, "entities");
        Z.k kVarAcquire = acquire();
        try {
            List listC = AbstractC1809n.c();
            for (Object obj : objArr) {
                bind(kVarAcquire, obj);
                listC.add(Long.valueOf(kVarAcquire.Y0()));
            }
            List<Long> listA = AbstractC1809n.a(listC);
            release(kVarAcquire);
            return listA;
        } catch (Throwable th) {
            release(kVarAcquire);
            throw th;
        }
    }

    public final void insert(Object[] objArr) {
        w5.k.f(objArr, "entities");
        Z.k kVarAcquire = acquire();
        try {
            for (Object obj : objArr) {
                bind(kVarAcquire, obj);
                kVarAcquire.Y0();
            }
        } finally {
            release(kVarAcquire);
        }
    }
}
