package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.O;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0606a implements O {
    protected int memoizedHashCode = 0;

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.a$a, reason: collision with other inner class name */
    public static abstract class AbstractC0151a implements O.a {
        protected static void g(Iterable iterable, List list) {
            AbstractC0629y.a(iterable);
            if (!(iterable instanceof D)) {
                if (iterable instanceof Y) {
                    list.addAll((Collection) iterable);
                    return;
                } else {
                    h(iterable, list);
                    return;
                }
            }
            List listH0 = ((D) iterable).h0();
            D d7 = (D) list;
            int size = list.size();
            for (Object obj : listH0) {
                if (obj == null) {
                    String str = "Element at index " + (d7.size() - size) + " is null.";
                    for (int size2 = d7.size() - 1; size2 >= size; size2--) {
                        d7.remove(size2);
                    }
                    throw new NullPointerException(str);
                }
                if (obj instanceof AbstractC0612g) {
                    d7.W((AbstractC0612g) obj);
                } else {
                    d7.add((String) obj);
                }
            }
        }

        private static void h(Iterable iterable, List list) {
            if ((list instanceof ArrayList) && (iterable instanceof Collection)) {
                ((ArrayList) list).ensureCapacity(list.size() + ((Collection) iterable).size());
            }
            int size = list.size();
            for (Object obj : iterable) {
                if (obj == null) {
                    String str = "Element at index " + (list.size() - size) + " is null.";
                    for (int size2 = list.size() - 1; size2 >= size; size2--) {
                        list.remove(size2);
                    }
                    throw new NullPointerException(str);
                }
                list.add(obj);
            }
        }

        protected static k0 k(O o6) {
            return new k0(o6);
        }

        protected abstract AbstractC0151a i(AbstractC0606a abstractC0606a);

        @Override // androidx.datastore.preferences.protobuf.O.a
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public AbstractC0151a w(O o6) {
            if (a().getClass().isInstance(o6)) {
                return i((AbstractC0606a) o6);
            }
            throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
        }
    }

    protected static void f(Iterable iterable, List list) {
        AbstractC0151a.g(iterable, list);
    }

    abstract int g();

    int h(e0 e0Var) {
        int iG = g();
        if (iG != -1) {
            return iG;
        }
        int iG2 = e0Var.g(this);
        j(iG2);
        return iG2;
    }

    k0 i() {
        return new k0(this);
    }

    abstract void j(int i7);

    public void k(OutputStream outputStream) {
        AbstractC0615j abstractC0615jZ = AbstractC0615j.Z(outputStream, AbstractC0615j.C(c()));
        d(abstractC0615jZ);
        abstractC0615jZ.W();
    }
}
