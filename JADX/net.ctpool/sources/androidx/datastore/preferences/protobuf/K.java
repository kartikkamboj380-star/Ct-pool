package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.H;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
class K implements J {
    K() {
    }

    private static int i(int i7, Object obj, Object obj2) {
        I i8 = (I) obj;
        H h7 = (H) obj2;
        int iA = 0;
        if (i8.isEmpty()) {
            return 0;
        }
        for (Map.Entry entry : i8.entrySet()) {
            iA += h7.a(i7, entry.getKey(), entry.getValue());
        }
        return iA;
    }

    private static I j(Object obj, Object obj2) {
        I iM = (I) obj;
        I i7 = (I) obj2;
        if (!i7.isEmpty()) {
            if (!iM.j()) {
                iM = iM.m();
            }
            iM.l(i7);
        }
        return iM;
    }

    @Override // androidx.datastore.preferences.protobuf.J
    public Object a(Object obj, Object obj2) {
        return j(obj, obj2);
    }

    @Override // androidx.datastore.preferences.protobuf.J
    public Object b(Object obj) {
        ((I) obj).k();
        return obj;
    }

    @Override // androidx.datastore.preferences.protobuf.J
    public H.a c(Object obj) {
        return ((H) obj).c();
    }

    @Override // androidx.datastore.preferences.protobuf.J
    public Map d(Object obj) {
        return (I) obj;
    }

    @Override // androidx.datastore.preferences.protobuf.J
    public Object e(Object obj) {
        return I.e().m();
    }

    @Override // androidx.datastore.preferences.protobuf.J
    public int f(int i7, Object obj, Object obj2) {
        return i(i7, obj, obj2);
    }

    @Override // androidx.datastore.preferences.protobuf.J
    public boolean g(Object obj) {
        return !((I) obj).j();
    }

    @Override // androidx.datastore.preferences.protobuf.J
    public Map h(Object obj) {
        return (I) obj;
    }
}
