package com.facebook.react.common.mapbuffer;

import android.util.SparseArray;
import com.facebook.react.common.mapbuffer.a;
import java.util.Iterator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import w5.k;
import x5.InterfaceC2227a;

/* JADX INFO: loaded from: classes.dex */
@R1.a
public final class WritableMapBuffer implements com.facebook.react.common.mapbuffer.a {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final a f11418n = new a(null);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final SparseArray f11419m = new SparseArray();

    private static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private final class b implements a.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f11420a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f11421b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final a.b f11422c;

        public b(int i7) {
            this.f11420a = i7;
            this.f11421b = WritableMapBuffer.this.f11419m.keyAt(i7);
            Object objValueAt = WritableMapBuffer.this.f11419m.valueAt(i7);
            k.e(objValueAt, "valueAt(...)");
            this.f11422c = WritableMapBuffer.this.i(objValueAt, getKey());
        }

        @Override // com.facebook.react.common.mapbuffer.a.c
        public long a() {
            int key = getKey();
            Object objValueAt = WritableMapBuffer.this.f11419m.valueAt(this.f11420a);
            if (objValueAt == null) {
                throw new IllegalArgumentException(("Key not found: " + key).toString());
            }
            if (objValueAt instanceof Long) {
                return ((Number) objValueAt).longValue();
            }
            throw new IllegalStateException(("Expected " + Long.class + " for key: " + key + ", found " + objValueAt.getClass() + " instead.").toString());
        }

        @Override // com.facebook.react.common.mapbuffer.a.c
        public double b() {
            int key = getKey();
            Object objValueAt = WritableMapBuffer.this.f11419m.valueAt(this.f11420a);
            if (objValueAt == null) {
                throw new IllegalArgumentException(("Key not found: " + key).toString());
            }
            if (objValueAt instanceof Double) {
                return ((Number) objValueAt).doubleValue();
            }
            throw new IllegalStateException(("Expected " + Double.class + " for key: " + key + ", found " + objValueAt.getClass() + " instead.").toString());
        }

        @Override // com.facebook.react.common.mapbuffer.a.c
        public String c() {
            int key = getKey();
            Object objValueAt = WritableMapBuffer.this.f11419m.valueAt(this.f11420a);
            if (objValueAt == null) {
                throw new IllegalArgumentException(("Key not found: " + key).toString());
            }
            if (objValueAt instanceof String) {
                return (String) objValueAt;
            }
            throw new IllegalStateException(("Expected " + String.class + " for key: " + key + ", found " + objValueAt.getClass() + " instead.").toString());
        }

        @Override // com.facebook.react.common.mapbuffer.a.c
        public int d() {
            int key = getKey();
            Object objValueAt = WritableMapBuffer.this.f11419m.valueAt(this.f11420a);
            if (objValueAt == null) {
                throw new IllegalArgumentException(("Key not found: " + key).toString());
            }
            if (objValueAt instanceof Integer) {
                return ((Number) objValueAt).intValue();
            }
            throw new IllegalStateException(("Expected " + Integer.class + " for key: " + key + ", found " + objValueAt.getClass() + " instead.").toString());
        }

        @Override // com.facebook.react.common.mapbuffer.a.c
        public com.facebook.react.common.mapbuffer.a e() {
            int key = getKey();
            Object objValueAt = WritableMapBuffer.this.f11419m.valueAt(this.f11420a);
            if (objValueAt == null) {
                throw new IllegalArgumentException(("Key not found: " + key).toString());
            }
            if (objValueAt instanceof com.facebook.react.common.mapbuffer.a) {
                return (com.facebook.react.common.mapbuffer.a) objValueAt;
            }
            throw new IllegalStateException(("Expected " + com.facebook.react.common.mapbuffer.a.class + " for key: " + key + ", found " + objValueAt.getClass() + " instead.").toString());
        }

        @Override // com.facebook.react.common.mapbuffer.a.c
        public boolean f() {
            int key = getKey();
            Object objValueAt = WritableMapBuffer.this.f11419m.valueAt(this.f11420a);
            if (objValueAt == null) {
                throw new IllegalArgumentException(("Key not found: " + key).toString());
            }
            if (objValueAt instanceof Boolean) {
                return ((Boolean) objValueAt).booleanValue();
            }
            throw new IllegalStateException(("Expected " + Boolean.class + " for key: " + key + ", found " + objValueAt.getClass() + " instead.").toString());
        }

        @Override // com.facebook.react.common.mapbuffer.a.c
        public int getKey() {
            return this.f11421b;
        }

        @Override // com.facebook.react.common.mapbuffer.a.c
        public a.b getType() {
            return this.f11422c;
        }
    }

    public static final class c implements Iterator, InterfaceC2227a {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private int f11424m;

        c() {
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public a.c next() {
            WritableMapBuffer writableMapBuffer = WritableMapBuffer.this;
            int i7 = this.f11424m;
            this.f11424m = i7 + 1;
            return writableMapBuffer.new b(i7);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f11424m < WritableMapBuffer.this.f11419m.size();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    static {
        U1.a.a();
    }

    @R1.a
    private final int[] getKeys() {
        int size = this.f11419m.size();
        int[] iArr = new int[size];
        for (int i7 = 0; i7 < size; i7++) {
            iArr[i7] = this.f11419m.keyAt(i7);
        }
        return iArr;
    }

    @R1.a
    private final Object[] getValues() {
        int size = this.f11419m.size();
        Object[] objArr = new Object[size];
        for (int i7 = 0; i7 < size; i7++) {
            Object objValueAt = this.f11419m.valueAt(i7);
            k.e(objValueAt, "valueAt(...)");
            objArr[i7] = objValueAt;
        }
        return objArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final a.b i(Object obj, int i7) {
        if (obj instanceof Boolean) {
            return a.b.f11429m;
        }
        if (obj instanceof Integer) {
            return a.b.f11430n;
        }
        if (obj instanceof Long) {
            return a.b.f11434r;
        }
        if (obj instanceof Double) {
            return a.b.f11431o;
        }
        if (obj instanceof String) {
            return a.b.f11432p;
        }
        if (obj instanceof com.facebook.react.common.mapbuffer.a) {
            return a.b.f11433q;
        }
        throw new IllegalStateException("Key " + i7 + " has value of unknown type: " + obj.getClass());
    }

    @Override // com.facebook.react.common.mapbuffer.a
    public com.facebook.react.common.mapbuffer.a D0(int i7) {
        Object obj = this.f11419m.get(i7);
        if (obj == null) {
            throw new IllegalArgumentException(("Key not found: " + i7).toString());
        }
        if (obj instanceof com.facebook.react.common.mapbuffer.a) {
            return (com.facebook.react.common.mapbuffer.a) obj;
        }
        throw new IllegalStateException(("Expected " + com.facebook.react.common.mapbuffer.a.class + " for key: " + i7 + ", found " + obj.getClass() + " instead.").toString());
    }

    @Override // com.facebook.react.common.mapbuffer.a
    public boolean getBoolean(int i7) {
        Object obj = this.f11419m.get(i7);
        if (obj == null) {
            throw new IllegalArgumentException(("Key not found: " + i7).toString());
        }
        if (obj instanceof Boolean) {
            return ((Boolean) obj).booleanValue();
        }
        throw new IllegalStateException(("Expected " + Boolean.class + " for key: " + i7 + ", found " + obj.getClass() + " instead.").toString());
    }

    @Override // com.facebook.react.common.mapbuffer.a
    public int getCount() {
        return this.f11419m.size();
    }

    @Override // com.facebook.react.common.mapbuffer.a
    public double getDouble(int i7) {
        Object obj = this.f11419m.get(i7);
        if (obj == null) {
            throw new IllegalArgumentException(("Key not found: " + i7).toString());
        }
        if (obj instanceof Double) {
            return ((Number) obj).doubleValue();
        }
        throw new IllegalStateException(("Expected " + Double.class + " for key: " + i7 + ", found " + obj.getClass() + " instead.").toString());
    }

    @Override // com.facebook.react.common.mapbuffer.a
    public int getInt(int i7) {
        Object obj = this.f11419m.get(i7);
        if (obj == null) {
            throw new IllegalArgumentException(("Key not found: " + i7).toString());
        }
        if (obj instanceof Integer) {
            return ((Number) obj).intValue();
        }
        throw new IllegalStateException(("Expected " + Integer.class + " for key: " + i7 + ", found " + obj.getClass() + " instead.").toString());
    }

    @Override // com.facebook.react.common.mapbuffer.a
    public String getString(int i7) {
        Object obj = this.f11419m.get(i7);
        if (obj == null) {
            throw new IllegalArgumentException(("Key not found: " + i7).toString());
        }
        if (obj instanceof String) {
            return (String) obj;
        }
        throw new IllegalStateException(("Expected " + String.class + " for key: " + i7 + ", found " + obj.getClass() + " instead.").toString());
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        return new c();
    }

    @Override // com.facebook.react.common.mapbuffer.a
    public boolean j0(int i7) {
        return this.f11419m.get(i7) != null;
    }
}
