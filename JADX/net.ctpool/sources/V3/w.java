package V3;

import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public abstract class w {

    class a extends S {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        boolean f4147m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ Object f4148n;

        a(Object obj) {
            this.f4148n = obj;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return !this.f4147m;
        }

        @Override // java.util.Iterator
        public Object next() {
            if (this.f4147m) {
                throw new NoSuchElementException();
            }
            this.f4147m = true;
            return this.f4148n;
        }
    }

    public static boolean a(Collection collection, Iterator it) {
        U3.h.i(collection);
        U3.h.i(it);
        boolean zAdd = false;
        while (it.hasNext()) {
            zAdd |= collection.add(it.next());
        }
        return zAdd;
    }

    public static boolean b(Iterator it, Iterator it2) {
        while (it.hasNext()) {
            if (!it2.hasNext() || !U3.f.a(it.next(), it2.next())) {
                return false;
            }
        }
        return !it2.hasNext();
    }

    public static S c(Object obj) {
        return new a(obj);
    }
}
