package com.google.android.gms.internal.play_billing;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.k0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class C1304k0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final C1304k0 f15209d = new C1304k0(true);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final AbstractC1339u1 f15210a = new C1305k1(16);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f15211b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f15212c;

    private C1304k0() {
    }

    static int a(N1 n12, int i7, Object obj) {
        AbstractC1264a0.w(i7 << 3);
        if (N1.f15083w == null) {
            byte[] bArr = AbstractC1353z0.f15324d;
        }
        O1 o12 = O1.INT;
        throw null;
    }

    public static int b(InterfaceC1300j0 interfaceC1300j0, Object obj) {
        N1 n1Zzd = interfaceC1300j0.zzd();
        int iA = interfaceC1300j0.a();
        if (!interfaceC1300j0.zzg()) {
            return a(n1Zzd, iA, obj);
        }
        List list = (List) obj;
        int iA2 = 0;
        if (!interfaceC1300j0.c()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                iA2 += a(n1Zzd, iA, it.next());
            }
            return iA2;
        }
        if (list.isEmpty()) {
            return 0;
        }
        Iterator it2 = list.iterator();
        if (!it2.hasNext()) {
            return AbstractC1264a0.w(iA << 3) + AbstractC1264a0.w(0);
        }
        it2.next();
        N1 n12 = N1.f15074n;
        O1 o12 = O1.INT;
        throw null;
    }

    private final void i(Map.Entry entry) {
        androidx.appcompat.app.y.a(entry.getKey());
        entry.getValue();
        throw null;
    }

    private static boolean j(Map.Entry entry) {
        androidx.appcompat.app.y.a(entry.getKey());
        throw null;
    }

    private static final int k(Map.Entry entry) {
        androidx.appcompat.app.y.a(entry.getKey());
        entry.getValue();
        throw null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void l(InterfaceC1300j0 interfaceC1300j0, Object obj) {
        boolean z6;
        interfaceC1300j0.zzd();
        byte[] bArr = AbstractC1353z0.f15324d;
        obj.getClass();
        N1 n12 = N1.f15074n;
        O1 o12 = O1.INT;
        switch (r0.e()) {
            case INT:
                z6 = obj instanceof Integer;
                if (z6) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(interfaceC1300j0.a()), interfaceC1300j0.zzd().e(), obj.getClass().getName()));
            case LONG:
                z6 = obj instanceof Long;
                if (z6) {
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(interfaceC1300j0.a()), interfaceC1300j0.zzd().e(), obj.getClass().getName()));
            case FLOAT:
                z6 = obj instanceof Float;
                if (z6) {
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(interfaceC1300j0.a()), interfaceC1300j0.zzd().e(), obj.getClass().getName()));
            case DOUBLE:
                z6 = obj instanceof Double;
                if (z6) {
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(interfaceC1300j0.a()), interfaceC1300j0.zzd().e(), obj.getClass().getName()));
            case BOOLEAN:
                z6 = obj instanceof Boolean;
                if (z6) {
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(interfaceC1300j0.a()), interfaceC1300j0.zzd().e(), obj.getClass().getName()));
            case STRING:
                z6 = obj instanceof String;
                if (z6) {
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(interfaceC1300j0.a()), interfaceC1300j0.zzd().e(), obj.getClass().getName()));
            case BYTE_STRING:
                if ((obj instanceof S) || (obj instanceof byte[])) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(interfaceC1300j0.a()), interfaceC1300j0.zzd().e(), obj.getClass().getName()));
            case ENUM:
                if ((obj instanceof Integer) || (obj instanceof InterfaceC1335t0)) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(interfaceC1300j0.a()), interfaceC1300j0.zzd().e(), obj.getClass().getName()));
            case MESSAGE:
                if (obj instanceof W0) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(interfaceC1300j0.a()), interfaceC1300j0.zzd().e(), obj.getClass().getName()));
            default:
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(interfaceC1300j0.a()), interfaceC1300j0.zzd().e(), obj.getClass().getName()));
        }
    }

    public final int c() {
        int iK = 0;
        for (int i7 = 0; i7 < this.f15210a.b(); i7++) {
            iK += k(this.f15210a.h(i7));
        }
        Iterator it = this.f15210a.d().iterator();
        while (it.hasNext()) {
            iK += k((Map.Entry) it.next());
        }
        return iK;
    }

    public final /* bridge */ /* synthetic */ Object clone() {
        C1304k0 c1304k0 = new C1304k0();
        for (int i7 = 0; i7 < this.f15210a.b(); i7++) {
            Map.Entry entryH = this.f15210a.h(i7);
            androidx.appcompat.app.y.a(entryH.getKey());
            c1304k0.g(null, entryH.getValue());
        }
        for (Map.Entry entry : this.f15210a.d()) {
            androidx.appcompat.app.y.a(entry.getKey());
            c1304k0.g(null, entry.getValue());
        }
        c1304k0.f15212c = this.f15212c;
        return c1304k0;
    }

    public final Iterator d() {
        return this.f15212c ? new D0(this.f15210a.entrySet().iterator()) : this.f15210a.entrySet().iterator();
    }

    public final void e() {
        if (this.f15211b) {
            return;
        }
        for (int i7 = 0; i7 < this.f15210a.b(); i7++) {
            Map.Entry entryH = this.f15210a.h(i7);
            if (entryH.getValue() instanceof AbstractC1329r0) {
                ((AbstractC1329r0) entryH.getValue()).r();
            }
        }
        this.f15210a.a();
        this.f15211b = true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C1304k0) {
            return this.f15210a.equals(((C1304k0) obj).f15210a);
        }
        return false;
    }

    public final void f(C1304k0 c1304k0) {
        for (int i7 = 0; i7 < c1304k0.f15210a.b(); i7++) {
            i(c1304k0.f15210a.h(i7));
        }
        Iterator it = c1304k0.f15210a.d().iterator();
        while (it.hasNext()) {
            i((Map.Entry) it.next());
        }
    }

    public final void g(InterfaceC1300j0 interfaceC1300j0, Object obj) {
        if (!interfaceC1300j0.zzg()) {
            l(interfaceC1300j0, obj);
        } else {
            if (!(obj instanceof List)) {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            int size = arrayList.size();
            for (int i7 = 0; i7 < size; i7++) {
                l(interfaceC1300j0, arrayList.get(i7));
            }
            obj = arrayList;
        }
        this.f15210a.put(interfaceC1300j0, obj);
    }

    public final boolean h() {
        for (int i7 = 0; i7 < this.f15210a.b(); i7++) {
            if (!j(this.f15210a.h(i7))) {
                return false;
            }
        }
        Iterator it = this.f15210a.d().iterator();
        while (it.hasNext()) {
            if (!j((Map.Entry) it.next())) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return this.f15210a.hashCode();
    }

    private C1304k0(boolean z6) {
        e();
        e();
    }
}
