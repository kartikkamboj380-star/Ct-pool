package androidx.work;

import android.util.Log;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import l0.i;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f9253b = i.i("Data");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b f9254c = new a().a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    Map f9255a;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Map f9256a = new HashMap();

        public b a() throws Throwable {
            b bVar = new b(this.f9256a);
            b.o(bVar);
            return bVar;
        }

        public a b(String str, Object obj) {
            if (obj == null) {
                this.f9256a.put(str, null);
            } else {
                Class<?> cls = obj.getClass();
                if (cls == Boolean.class || cls == Byte.class || cls == Integer.class || cls == Long.class || cls == Float.class || cls == Double.class || cls == String.class || cls == Boolean[].class || cls == Byte[].class || cls == Integer[].class || cls == Long[].class || cls == Float[].class || cls == Double[].class || cls == String[].class) {
                    this.f9256a.put(str, obj);
                } else if (cls == boolean[].class) {
                    this.f9256a.put(str, b.a((boolean[]) obj));
                } else if (cls == byte[].class) {
                    this.f9256a.put(str, b.b((byte[]) obj));
                } else if (cls == int[].class) {
                    this.f9256a.put(str, b.e((int[]) obj));
                } else if (cls == long[].class) {
                    this.f9256a.put(str, b.f((long[]) obj));
                } else if (cls == float[].class) {
                    this.f9256a.put(str, b.d((float[]) obj));
                } else {
                    if (cls != double[].class) {
                        throw new IllegalArgumentException("Key " + str + "has invalid type " + cls);
                    }
                    this.f9256a.put(str, b.c((double[]) obj));
                }
            }
            return this;
        }

        public a c(b bVar) {
            d(bVar.f9255a);
            return this;
        }

        public a d(Map map) {
            for (Map.Entry entry : map.entrySet()) {
                b((String) entry.getKey(), entry.getValue());
            }
            return this;
        }

        public a e(String str, boolean z6) {
            this.f9256a.put(str, Boolean.valueOf(z6));
            return this;
        }

        public a f(String str, int i7) {
            this.f9256a.put(str, Integer.valueOf(i7));
            return this;
        }

        public a g(String str, String str2) {
            this.f9256a.put(str, str2);
            return this;
        }
    }

    public b(b bVar) {
        this.f9255a = new HashMap(bVar.f9255a);
    }

    public static Boolean[] a(boolean[] zArr) {
        Boolean[] boolArr = new Boolean[zArr.length];
        for (int i7 = 0; i7 < zArr.length; i7++) {
            boolArr[i7] = Boolean.valueOf(zArr[i7]);
        }
        return boolArr;
    }

    public static Byte[] b(byte[] bArr) {
        Byte[] bArr2 = new Byte[bArr.length];
        for (int i7 = 0; i7 < bArr.length; i7++) {
            bArr2[i7] = Byte.valueOf(bArr[i7]);
        }
        return bArr2;
    }

    public static Double[] c(double[] dArr) {
        Double[] dArr2 = new Double[dArr.length];
        for (int i7 = 0; i7 < dArr.length; i7++) {
            dArr2[i7] = Double.valueOf(dArr[i7]);
        }
        return dArr2;
    }

    public static Float[] d(float[] fArr) {
        Float[] fArr2 = new Float[fArr.length];
        for (int i7 = 0; i7 < fArr.length; i7++) {
            fArr2[i7] = Float.valueOf(fArr[i7]);
        }
        return fArr2;
    }

    public static Integer[] e(int[] iArr) {
        Integer[] numArr = new Integer[iArr.length];
        for (int i7 = 0; i7 < iArr.length; i7++) {
            numArr[i7] = Integer.valueOf(iArr[i7]);
        }
        return numArr;
    }

    public static Long[] f(long[] jArr) {
        Long[] lArr = new Long[jArr.length];
        for (int i7 = 0; i7 < jArr.length; i7++) {
            lArr[i7] = Long.valueOf(jArr[i7]);
        }
        return lArr;
    }

    public static byte[] g(Byte[] bArr) {
        byte[] bArr2 = new byte[bArr.length];
        for (int i7 = 0; i7 < bArr.length; i7++) {
            bArr2[i7] = bArr[i7].byteValue();
        }
        return bArr2;
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x0058 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0040 -> B:37:0x0065). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static b h(byte[] bArr) throws Throwable {
        ObjectInputStream objectInputStream;
        Throwable e7;
        if (bArr.length > 10240) {
            throw new IllegalStateException("Data cannot occupy more than 10240 bytes when serialized");
        }
        HashMap map = new HashMap();
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        ObjectInputStream objectInputStream2 = null;
        try {
        } catch (Throwable th) {
            th = th;
        }
        try {
            try {
                objectInputStream = new ObjectInputStream(byteArrayInputStream);
                try {
                    for (int i7 = objectInputStream.readInt(); i7 > 0; i7--) {
                        map.put(objectInputStream.readUTF(), objectInputStream.readObject());
                    }
                    try {
                        objectInputStream.close();
                    } catch (IOException e8) {
                        Log.e(f9253b, "Error in Data#fromByteArray: ", e8);
                    }
                    byteArrayInputStream.close();
                } catch (IOException e9) {
                    e7 = e9;
                    Log.e(f9253b, "Error in Data#fromByteArray: ", e7);
                    if (objectInputStream != null) {
                        try {
                            objectInputStream.close();
                        } catch (IOException e10) {
                            Log.e(f9253b, "Error in Data#fromByteArray: ", e10);
                        }
                    }
                    byteArrayInputStream.close();
                } catch (ClassNotFoundException e11) {
                    e7 = e11;
                    Log.e(f9253b, "Error in Data#fromByteArray: ", e7);
                    if (objectInputStream != null) {
                    }
                    byteArrayInputStream.close();
                }
            } catch (IOException e12) {
                Log.e(f9253b, "Error in Data#fromByteArray: ", e12);
            }
        } catch (IOException e13) {
            e = e13;
            Throwable th2 = e;
            objectInputStream = null;
            e7 = th2;
            Log.e(f9253b, "Error in Data#fromByteArray: ", e7);
            if (objectInputStream != null) {
            }
            byteArrayInputStream.close();
            return new b(map);
        } catch (ClassNotFoundException e14) {
            e = e14;
            Throwable th22 = e;
            objectInputStream = null;
            e7 = th22;
            Log.e(f9253b, "Error in Data#fromByteArray: ", e7);
            if (objectInputStream != null) {
            }
            byteArrayInputStream.close();
            return new b(map);
        } catch (Throwable th3) {
            th = th3;
            if (0 != 0) {
                try {
                    objectInputStream2.close();
                } catch (IOException e15) {
                    Log.e(f9253b, "Error in Data#fromByteArray: ", e15);
                }
            }
            try {
                byteArrayInputStream.close();
                throw th;
            } catch (IOException e16) {
                Log.e(f9253b, "Error in Data#fromByteArray: ", e16);
                throw th;
            }
        }
        return new b(map);
    }

    public static byte[] o(b bVar) throws Throwable {
        ObjectOutputStream objectOutputStream;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ObjectOutputStream objectOutputStream2 = null;
        try {
            try {
                objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
            } catch (Throwable th) {
                th = th;
            }
        } catch (IOException e7) {
            e = e7;
        }
        try {
            objectOutputStream.writeInt(bVar.n());
            for (Map.Entry entry : bVar.f9255a.entrySet()) {
                objectOutputStream.writeUTF((String) entry.getKey());
                objectOutputStream.writeObject(entry.getValue());
            }
            try {
                objectOutputStream.close();
            } catch (IOException e8) {
                Log.e(f9253b, "Error in Data#toByteArray: ", e8);
            }
            try {
                byteArrayOutputStream.close();
            } catch (IOException e9) {
                Log.e(f9253b, "Error in Data#toByteArray: ", e9);
            }
            if (byteArrayOutputStream.size() <= 10240) {
                return byteArrayOutputStream.toByteArray();
            }
            throw new IllegalStateException("Data cannot occupy more than 10240 bytes when serialized");
        } catch (IOException e10) {
            e = e10;
            objectOutputStream2 = objectOutputStream;
            Log.e(f9253b, "Error in Data#toByteArray: ", e);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            if (objectOutputStream2 != null) {
                try {
                    objectOutputStream2.close();
                } catch (IOException e11) {
                    Log.e(f9253b, "Error in Data#toByteArray: ", e11);
                }
            }
            try {
                byteArrayOutputStream.close();
            } catch (IOException e12) {
                Log.e(f9253b, "Error in Data#toByteArray: ", e12);
            }
            return byteArray;
        } catch (Throwable th2) {
            th = th2;
            objectOutputStream2 = objectOutputStream;
            if (objectOutputStream2 != null) {
                try {
                    objectOutputStream2.close();
                } catch (IOException e13) {
                    Log.e(f9253b, "Error in Data#toByteArray: ", e13);
                }
            }
            try {
                byteArrayOutputStream.close();
                throw th;
            } catch (IOException e14) {
                Log.e(f9253b, "Error in Data#toByteArray: ", e14);
                throw th;
            }
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        Set<String> setKeySet = this.f9255a.keySet();
        if (!setKeySet.equals(bVar.f9255a.keySet())) {
            return false;
        }
        for (String str : setKeySet) {
            Object obj2 = this.f9255a.get(str);
            Object obj3 = bVar.f9255a.get(str);
            if (!((obj2 == null || obj3 == null) ? obj2 == obj3 : ((obj2 instanceof Object[]) && (obj3 instanceof Object[])) ? Arrays.deepEquals((Object[]) obj2, (Object[]) obj3) : obj2.equals(obj3))) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return this.f9255a.hashCode() * 31;
    }

    public boolean i(String str, boolean z6) {
        Object obj = this.f9255a.get(str);
        return obj instanceof Boolean ? ((Boolean) obj).booleanValue() : z6;
    }

    public byte[] j(String str) {
        Object obj = this.f9255a.get(str);
        if (obj instanceof Byte[]) {
            return g((Byte[]) obj);
        }
        return null;
    }

    public int k(String str, int i7) {
        Object obj = this.f9255a.get(str);
        return obj instanceof Integer ? ((Integer) obj).intValue() : i7;
    }

    public Map l() {
        return Collections.unmodifiableMap(this.f9255a);
    }

    public String m(String str) {
        Object obj = this.f9255a.get(str);
        if (obj instanceof String) {
            return (String) obj;
        }
        return null;
    }

    public int n() {
        return this.f9255a.size();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Data {");
        if (!this.f9255a.isEmpty()) {
            for (String str : this.f9255a.keySet()) {
                sb.append(str);
                sb.append(" : ");
                Object obj = this.f9255a.get(str);
                if (obj instanceof Object[]) {
                    sb.append(Arrays.toString((Object[]) obj));
                } else {
                    sb.append(obj);
                }
                sb.append(", ");
            }
        }
        sb.append("}");
        return sb.toString();
    }

    public b(Map map) {
        this.f9255a = new HashMap(map);
    }
}
