package V3;

import com.google.android.gms.common.api.Api;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Collection;

/* JADX INFO: renamed from: V3.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0486n extends AbstractCollection implements Serializable {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final Object[] f4116m = new Object[0];

    /* JADX INFO: renamed from: V3.n$a */
    static abstract class a extends b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object[] f4117a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f4118b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        boolean f4119c;

        a(int i7) {
            AbstractC0479g.b(i7, "initialCapacity");
            this.f4117a = new Object[i7];
            this.f4118b = 0;
        }

        private void d(int i7) {
            Object[] objArr = this.f4117a;
            if (objArr.length < i7) {
                this.f4117a = Arrays.copyOf(objArr, b.a(objArr.length, i7));
            } else if (!this.f4119c) {
                return;
            } else {
                this.f4117a = (Object[]) objArr.clone();
            }
            this.f4119c = false;
        }

        public b b(Object... objArr) {
            c(objArr, objArr.length);
            return this;
        }

        final void c(Object[] objArr, int i7) {
            F.c(objArr, i7);
            d(this.f4118b + i7);
            System.arraycopy(objArr, 0, this.f4117a, this.f4118b, i7);
            this.f4118b += i7;
        }
    }

    /* JADX INFO: renamed from: V3.n$b */
    public static abstract class b {
        b() {
        }

        static int a(int i7, int i8) {
            if (i8 < 0) {
                throw new AssertionError("cannot store more than MAX_VALUE elements");
            }
            int iHighestOneBit = i7 + (i7 >> 1) + 1;
            if (iHighestOneBit < i8) {
                iHighestOneBit = Integer.highestOneBit(i8 - 1) << 1;
            }
            return iHighestOneBit < 0 ? Api.BaseClientBuilder.API_PRIORITY_OTHER : iHighestOneBit;
        }
    }

    AbstractC0486n() {
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    abstract int c(Object[] objArr, int i7);

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public abstract boolean contains(Object obj);

    Object[] f() {
        return null;
    }

    int h() {
        throw new UnsupportedOperationException();
    }

    int i() {
        throw new UnsupportedOperationException();
    }

    abstract boolean k();

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray() {
        return toArray(f4116m);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        U3.h.i(objArr);
        int size = size();
        if (objArr.length < size) {
            Object[] objArrF = f();
            if (objArrF != null) {
                return H.a(objArrF, i(), h(), objArr);
            }
            objArr = F.d(objArr, size);
        } else if (objArr.length > size) {
            objArr[size] = null;
        }
        c(objArr, 0);
        return objArr;
    }
}
