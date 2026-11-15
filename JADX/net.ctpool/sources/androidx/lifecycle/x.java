package androidx.lifecycle;

import Y.c;
import android.os.Binder;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import j5.AbstractC1787F;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
public final class x {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f8381f = new a(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final Class[] f8382g = {Boolean.TYPE, boolean[].class, Double.TYPE, double[].class, Integer.TYPE, int[].class, Long.TYPE, long[].class, String.class, String[].class, Binder.class, Bundle.class, Byte.TYPE, byte[].class, Character.TYPE, char[].class, CharSequence.class, CharSequence[].class, ArrayList.class, Float.TYPE, float[].class, Parcelable.class, Parcelable[].class, Serializable.class, Short.TYPE, short[].class, SparseArray.class, Size.class, SizeF.class};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f8383a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f8384b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map f8385c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Map f8386d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final c.InterfaceC0101c f8387e;

    public static final class a {
        private a() {
        }

        public final x a(Bundle bundle, Bundle bundle2) {
            if (bundle == null) {
                if (bundle2 == null) {
                    return new x();
                }
                HashMap map = new HashMap();
                for (String str : bundle2.keySet()) {
                    w5.k.e(str, "key");
                    map.put(str, bundle2.get(str));
                }
                return new x(map);
            }
            ArrayList parcelableArrayList = bundle.getParcelableArrayList("keys");
            ArrayList parcelableArrayList2 = bundle.getParcelableArrayList("values");
            if (parcelableArrayList == null || parcelableArrayList2 == null || parcelableArrayList.size() != parcelableArrayList2.size()) {
                throw new IllegalStateException("Invalid bundle passed as restored state".toString());
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            int size = parcelableArrayList.size();
            for (int i7 = 0; i7 < size; i7++) {
                Object obj = parcelableArrayList.get(i7);
                if (obj == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                }
                linkedHashMap.put((String) obj, parcelableArrayList2.get(i7));
            }
            return new x(linkedHashMap);
        }

        public final boolean b(Object obj) {
            if (obj == null) {
                return true;
            }
            for (Class cls : x.f8382g) {
                w5.k.c(cls);
                if (cls.isInstance(obj)) {
                    return true;
                }
            }
            return false;
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public x() {
        this.f8383a = new LinkedHashMap();
        this.f8384b = new LinkedHashMap();
        this.f8385c = new LinkedHashMap();
        this.f8386d = new LinkedHashMap();
        this.f8387e = new c.InterfaceC0101c() { // from class: androidx.lifecycle.w
            @Override // Y.c.InterfaceC0101c
            public final Bundle a() {
                return x.e(this.f8380a);
            }
        };
    }

    public static final x c(Bundle bundle, Bundle bundle2) {
        return f8381f.a(bundle, bundle2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Bundle e(x xVar) {
        w5.k.f(xVar, "this$0");
        for (Map.Entry entry : AbstractC1787F.q(xVar.f8384b).entrySet()) {
            xVar.f((String) entry.getKey(), ((c.InterfaceC0101c) entry.getValue()).a());
        }
        Set<String> setKeySet = xVar.f8383a.keySet();
        ArrayList arrayList = new ArrayList(setKeySet.size());
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        for (String str : setKeySet) {
            arrayList.add(str);
            arrayList2.add(xVar.f8383a.get(str));
        }
        return androidx.core.os.d.a(i5.q.a("keys", arrayList), i5.q.a("values", arrayList2));
    }

    public final c.InterfaceC0101c d() {
        return this.f8387e;
    }

    public final void f(String str, Object obj) {
        w5.k.f(str, "key");
        if (!f8381f.b(obj)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Can't put value with type ");
            w5.k.c(obj);
            sb.append(obj.getClass());
            sb.append(" into saved state");
            throw new IllegalArgumentException(sb.toString());
        }
        Object obj2 = this.f8385c.get(str);
        q qVar = obj2 instanceof q ? (q) obj2 : null;
        if (qVar != null) {
            qVar.n(obj);
        } else {
            this.f8383a.put(str, obj);
        }
        K5.k kVar = (K5.k) this.f8386d.get(str);
        if (kVar == null) {
            return;
        }
        kVar.setValue(obj);
    }

    public x(Map map) {
        w5.k.f(map, "initialState");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.f8383a = linkedHashMap;
        this.f8384b = new LinkedHashMap();
        this.f8385c = new LinkedHashMap();
        this.f8386d = new LinkedHashMap();
        this.f8387e = new c.InterfaceC0101c() { // from class: androidx.lifecycle.w
            @Override // Y.c.InterfaceC0101c
            public final Bundle a() {
                return x.e(this.f8380a);
            }
        };
        linkedHashMap.putAll(map);
    }
}
