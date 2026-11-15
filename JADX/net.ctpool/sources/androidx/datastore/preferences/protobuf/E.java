package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.AbstractC0629y;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
abstract class E {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final E f7523a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final E f7524b;

    private static final class b extends E {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final Class f7525c = Collections.unmodifiableList(Collections.emptyList()).getClass();

        private b() {
            super();
        }

        static List f(Object obj, long j7) {
            return (List) p0.A(obj, j7);
        }

        private static List g(Object obj, long j7, int i7) {
            List listJ;
            List list;
            List listF = f(obj, j7);
            if (!listF.isEmpty()) {
                if (f7525c.isAssignableFrom(listF.getClass())) {
                    ArrayList arrayList = new ArrayList(listF.size() + i7);
                    arrayList.addAll(listF);
                    list = arrayList;
                } else if (listF instanceof o0) {
                    C c7 = new C(listF.size() + i7);
                    c7.addAll((o0) listF);
                    list = c7;
                } else {
                    if (!(listF instanceof Y) || !(listF instanceof AbstractC0629y.b)) {
                        return listF;
                    }
                    AbstractC0629y.b bVar = (AbstractC0629y.b) listF;
                    if (bVar.b1()) {
                        return listF;
                    }
                    listJ = bVar.J(listF.size() + i7);
                }
                p0.O(obj, j7, list);
                return list;
            }
            listJ = listF instanceof D ? new C(i7) : ((listF instanceof Y) && (listF instanceof AbstractC0629y.b)) ? ((AbstractC0629y.b) listF).J(i7) : new ArrayList(i7);
            p0.O(obj, j7, listJ);
            return listJ;
        }

        @Override // androidx.datastore.preferences.protobuf.E
        void c(Object obj, long j7) {
            Object objUnmodifiableList;
            List list = (List) p0.A(obj, j7);
            if (list instanceof D) {
                objUnmodifiableList = ((D) list).M0();
            } else {
                if (f7525c.isAssignableFrom(list.getClass())) {
                    return;
                }
                if ((list instanceof Y) && (list instanceof AbstractC0629y.b)) {
                    AbstractC0629y.b bVar = (AbstractC0629y.b) list;
                    if (bVar.b1()) {
                        bVar.z();
                        return;
                    }
                    return;
                }
                objUnmodifiableList = Collections.unmodifiableList(list);
            }
            p0.O(obj, j7, objUnmodifiableList);
        }

        @Override // androidx.datastore.preferences.protobuf.E
        void d(Object obj, Object obj2, long j7) {
            List listF = f(obj2, j7);
            List listG = g(obj, j7, listF.size());
            int size = listG.size();
            int size2 = listF.size();
            if (size > 0 && size2 > 0) {
                listG.addAll(listF);
            }
            if (size > 0) {
                listF = listG;
            }
            p0.O(obj, j7, listF);
        }

        @Override // androidx.datastore.preferences.protobuf.E
        List e(Object obj, long j7) {
            return g(obj, j7, 10);
        }
    }

    private static final class c extends E {
        private c() {
            super();
        }

        static AbstractC0629y.b f(Object obj, long j7) {
            return (AbstractC0629y.b) p0.A(obj, j7);
        }

        @Override // androidx.datastore.preferences.protobuf.E
        void c(Object obj, long j7) {
            f(obj, j7).z();
        }

        @Override // androidx.datastore.preferences.protobuf.E
        void d(Object obj, Object obj2, long j7) {
            AbstractC0629y.b bVarF = f(obj, j7);
            AbstractC0629y.b bVarF2 = f(obj2, j7);
            int size = bVarF.size();
            int size2 = bVarF2.size();
            if (size > 0 && size2 > 0) {
                if (!bVarF.b1()) {
                    bVarF = bVarF.J(size2 + size);
                }
                bVarF.addAll(bVarF2);
            }
            if (size > 0) {
                bVarF2 = bVarF;
            }
            p0.O(obj, j7, bVarF2);
        }

        @Override // androidx.datastore.preferences.protobuf.E
        List e(Object obj, long j7) {
            AbstractC0629y.b bVarF = f(obj, j7);
            if (bVarF.b1()) {
                return bVarF;
            }
            int size = bVarF.size();
            AbstractC0629y.b bVarJ = bVarF.J(size == 0 ? 10 : size * 2);
            p0.O(obj, j7, bVarJ);
            return bVarJ;
        }
    }

    static {
        f7523a = new b();
        f7524b = new c();
    }

    private E() {
    }

    static E a() {
        return f7523a;
    }

    static E b() {
        return f7524b;
    }

    abstract void c(Object obj, long j7);

    abstract void d(Object obj, Object obj2, long j7);

    abstract List e(Object obj, long j7);
}
