package com.google.android.gms.internal.measurement;

import com.google.android.gms.common.ConnectionResult;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.s4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class C1201s4 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final C1201s4 f14830d = new C1201s4(true);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final AbstractC1237w5 f14831a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f14832b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f14833c;

    private C1201s4() {
        this.f14831a = new C1261z5();
    }

    public static int b(InterfaceC1219u4 interfaceC1219u4, Object obj) {
        T5 t5Zzb = interfaceC1219u4.zzb();
        int iA = interfaceC1219u4.a();
        if (!interfaceC1219u4.b()) {
            return c(t5Zzb, iA, obj);
        }
        List list = (List) obj;
        int size = list.size();
        int i7 = 0;
        if (!interfaceC1219u4.zzd()) {
            int iC = 0;
            while (i7 < size) {
                iC += c(t5Zzb, iA, list.get(i7));
                i7++;
            }
            return iC;
        }
        if (list.isEmpty()) {
            return 0;
        }
        int iD = 0;
        while (i7 < size) {
            iD += d(t5Zzb, list.get(i7));
            i7++;
        }
        return AbstractC1112i4.s0(iA) + iD + AbstractC1112i4.v0(iD);
    }

    static int c(T5 t52, int i7, Object obj) {
        int iS0 = AbstractC1112i4.s0(i7);
        if (t52 == T5.f14364x) {
            B4.g((InterfaceC1095g5) obj);
            iS0 <<= 1;
        }
        return iS0 + d(t52, obj);
    }

    private static int d(T5 t52, Object obj) {
        switch (AbstractC1192r4.f14808b[t52.ordinal()]) {
            case 1:
                return AbstractC1112i4.c(((Double) obj).doubleValue());
            case 2:
                return AbstractC1112i4.d(((Float) obj).floatValue());
            case 3:
                return AbstractC1112i4.a0(((Long) obj).longValue());
            case 4:
                return AbstractC1112i4.n0(((Long) obj).longValue());
            case 5:
                return AbstractC1112i4.g0(((Integer) obj).intValue());
            case 6:
                return AbstractC1112i4.S(((Long) obj).longValue());
            case 7:
                return AbstractC1112i4.c0(((Integer) obj).intValue());
            case 8:
                return AbstractC1112i4.h(((Boolean) obj).booleanValue());
            case ConnectionResult.SERVICE_INVALID /* 9 */:
                return AbstractC1112i4.B((InterfaceC1095g5) obj);
            case 10:
                return AbstractC1112i4.T((InterfaceC1095g5) obj);
            case ConnectionResult.LICENSE_CHECK_FAILED /* 11 */:
                return obj instanceof R3 ? AbstractC1112i4.A((R3) obj) : AbstractC1112i4.C((String) obj);
            case 12:
                return obj instanceof R3 ? AbstractC1112i4.A((R3) obj) : AbstractC1112i4.i((byte[]) obj);
            case 13:
                return AbstractC1112i4.v0(((Integer) obj).intValue());
            case 14:
                return AbstractC1112i4.k0(((Integer) obj).intValue());
            case 15:
                return AbstractC1112i4.f0(((Long) obj).longValue());
            case 16:
                return AbstractC1112i4.o0(((Integer) obj).intValue());
            case 17:
                return AbstractC1112i4.j0(((Long) obj).longValue());
            case ConnectionResult.SERVICE_UPDATING /* 18 */:
                return obj instanceof E4 ? AbstractC1112i4.X(((E4) obj).a()) : AbstractC1112i4.X(((Integer) obj).intValue());
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    private static int e(Map.Entry entry) {
        androidx.appcompat.app.y.a(entry.getKey());
        entry.getValue();
        throw null;
    }

    private final void g(InterfaceC1219u4 interfaceC1219u4, Object obj) {
        if (!interfaceC1219u4.b()) {
            j(interfaceC1219u4, obj);
        } else {
            if (!(obj instanceof List)) {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
            List list = (List) obj;
            int size = list.size();
            ArrayList arrayList = new ArrayList(size);
            for (int i7 = 0; i7 < size; i7++) {
                Object obj2 = list.get(i7);
                j(interfaceC1219u4, obj2);
                arrayList.add(obj2);
            }
            obj = arrayList;
        }
        this.f14831a.put(interfaceC1219u4, obj);
    }

    private final void h(Map.Entry entry) {
        androidx.appcompat.app.y.a(entry.getKey());
        entry.getValue();
        throw null;
    }

    private static void j(InterfaceC1219u4 interfaceC1219u4, Object obj) {
        T5 t5Zzb = interfaceC1219u4.zzb();
        B4.e(obj);
        boolean z6 = true;
        switch (AbstractC1192r4.f14807a[t5Zzb.e().ordinal()]) {
            case 1:
                z6 = obj instanceof Integer;
                break;
            case 2:
                z6 = obj instanceof Long;
                break;
            case 3:
                z6 = obj instanceof Float;
                break;
            case 4:
                z6 = obj instanceof Double;
                break;
            case 5:
                z6 = obj instanceof Boolean;
                break;
            case 6:
                z6 = obj instanceof String;
                break;
            case 7:
                if (!(obj instanceof R3) && !(obj instanceof byte[])) {
                    z6 = false;
                }
                break;
            case 8:
                if (!(obj instanceof Integer) && !(obj instanceof E4)) {
                    z6 = false;
                }
                break;
            case ConnectionResult.SERVICE_INVALID /* 9 */:
                if (!(obj instanceof InterfaceC1095g5)) {
                    z6 = false;
                }
                break;
            default:
                z6 = false;
                break;
        }
        if (!z6) {
            throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(interfaceC1219u4.a()), interfaceC1219u4.zzb().e(), obj.getClass().getName()));
        }
    }

    private static boolean k(Map.Entry entry) {
        androidx.appcompat.app.y.a(entry.getKey());
        throw null;
    }

    public final int a() {
        int iA = this.f14831a.a();
        int iE = 0;
        for (int i7 = 0; i7 < iA; i7++) {
            iE += e(this.f14831a.g(i7));
        }
        Iterator it = this.f14831a.h().iterator();
        while (it.hasNext()) {
            iE += e((Map.Entry) it.next());
        }
        return iE;
    }

    public final /* synthetic */ Object clone() {
        C1201s4 c1201s4 = new C1201s4();
        int iA = this.f14831a.a();
        for (int i7 = 0; i7 < iA; i7++) {
            Map.Entry entryG = this.f14831a.g(i7);
            androidx.appcompat.app.y.a(entryG.getKey());
            c1201s4.g(null, entryG.getValue());
        }
        for (Map.Entry entry : this.f14831a.h()) {
            androidx.appcompat.app.y.a(entry.getKey());
            c1201s4.g(null, entry.getValue());
        }
        c1201s4.f14833c = this.f14833c;
        return c1201s4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C1201s4) {
            return this.f14831a.equals(((C1201s4) obj).f14831a);
        }
        return false;
    }

    public final void f(C1201s4 c1201s4) {
        int iA = c1201s4.f14831a.a();
        for (int i7 = 0; i7 < iA; i7++) {
            h(c1201s4.f14831a.g(i7));
        }
        Iterator it = c1201s4.f14831a.h().iterator();
        while (it.hasNext()) {
            h((Map.Entry) it.next());
        }
    }

    public final int hashCode() {
        return this.f14831a.hashCode();
    }

    final Iterator i() {
        return this.f14831a.isEmpty() ? Collections.emptyIterator() : this.f14833c ? new M4(this.f14831a.l().iterator()) : this.f14831a.l().iterator();
    }

    public final Iterator l() {
        return this.f14831a.isEmpty() ? Collections.emptyIterator() : this.f14833c ? new M4(this.f14831a.entrySet().iterator()) : this.f14831a.entrySet().iterator();
    }

    public final void m() {
        if (this.f14832b) {
            return;
        }
        int iA = this.f14831a.a();
        for (int i7 = 0; i7 < iA; i7++) {
            Object value = this.f14831a.g(i7).getValue();
            if (value instanceof AbstractC1260z4) {
                ((AbstractC1260z4) value).B();
            }
        }
        Iterator it = this.f14831a.h().iterator();
        while (it.hasNext()) {
            Object value2 = ((Map.Entry) it.next()).getValue();
            if (value2 instanceof AbstractC1260z4) {
                ((AbstractC1260z4) value2).B();
            }
        }
        this.f14831a.m();
        this.f14832b = true;
    }

    public final boolean n() {
        int iA = this.f14831a.a();
        for (int i7 = 0; i7 < iA; i7++) {
            if (!k(this.f14831a.g(i7))) {
                return false;
            }
        }
        Iterator it = this.f14831a.h().iterator();
        while (it.hasNext()) {
            if (!k((Map.Entry) it.next())) {
                return false;
            }
        }
        return true;
    }

    private C1201s4(AbstractC1237w5 abstractC1237w5) {
        this.f14831a = abstractC1237w5;
        m();
    }

    private C1201s4(boolean z6) {
        this(new C1261z5());
        m();
    }
}
