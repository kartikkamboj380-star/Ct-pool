package com.facebook.soloader;

import android.os.StrictMode;
import com.facebook.soloader.o;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: loaded from: classes.dex */
public abstract class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int f13330a = 3;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int f13331b = 3;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static volatile boolean f13333d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static byte[] f13334e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static List f13335f = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static Map f13336g = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static volatile boolean f13337h = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f13332c = 3 + 3;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final ReentrantReadWriteLock f13338i = new ReentrantReadWriteLock();

    private static String[] a(String str) {
        if (f13333d) {
            return i(str);
        }
        if (!f13337h) {
            return null;
        }
        ReentrantReadWriteLock reentrantReadWriteLock = f13338i;
        reentrantReadWriteLock.readLock().lock();
        try {
            String[] strArrI = i(str);
            reentrantReadWriteLock.readLock().unlock();
            return strArrI;
        } catch (Throwable th) {
            f13338i.readLock().unlock();
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String[] b(String str, g gVar) {
        boolean z6 = SoLoader.f13282a;
        if (z6) {
            Api18TraceUtils.a("soloader.NativeDeps.getDependencies[", str, "]");
        }
        try {
            try {
                String[] strArrA = a(str);
                if (strArrA != null) {
                    if (z6) {
                        Api18TraceUtils.b();
                    }
                    return strArrA;
                }
                String[] strArrA2 = o.a(gVar);
                if (z6) {
                    Api18TraceUtils.b();
                }
                return strArrA2;
            } catch (o.a e7) {
                throw z.b(str, e7);
            }
        } catch (Throwable th) {
            if (SoLoader.f13282a) {
            }
            throw th;
        }
        if (SoLoader.f13282a) {
            Api18TraceUtils.b();
        }
        throw th;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x003e, code lost:
    
        if (r2 == false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0040, code lost:
    
        r6 = d(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0044, code lost:
    
        if (r6 != null) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0046, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0047, code lost:
    
        r0.add(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x004e, code lost:
    
        if (r0.isEmpty() == false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0050, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x005d, code lost:
    
        return (java.lang.String[]) r0.toArray(new java.lang.String[r0.size()]);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String[] c(int i7, int i8) {
        byte b7;
        ArrayList arrayList = new ArrayList();
        int i9 = (i7 + i8) - f13332c;
        int i10 = 0;
        boolean z6 = false;
        while (true) {
            byte[] bArr = f13334e;
            if (i9 >= bArr.length || (b7 = bArr[i9]) == 10) {
                break;
            }
            if (b7 == 32) {
                if (z6) {
                    String strD = d(i10);
                    if (strD == null) {
                        return null;
                    }
                    arrayList.add(strD);
                    i10 = 0;
                    z6 = false;
                } else {
                    continue;
                }
            } else {
                if (b7 < 48 || b7 > 57) {
                    break;
                }
                i10 = (i10 * 10) + (b7 - 48);
                z6 = true;
            }
            i9++;
        }
        return null;
    }

    private static String d(int i7) {
        if (i7 >= f13335f.size()) {
            return null;
        }
        int iIntValue = ((Integer) f13335f.get(i7)).intValue();
        int i8 = iIntValue;
        while (true) {
            byte[] bArr = f13334e;
            if (i8 >= bArr.length || bArr[i8] <= 32) {
                break;
            }
            i8++;
        }
        int i9 = (i8 - iIntValue) + f13332c;
        char[] cArr = new char[i9];
        cArr[0] = 'l';
        cArr[1] = 'i';
        cArr[2] = 'b';
        for (int i10 = 0; i10 < i9 - f13332c; i10++) {
            cArr[f13330a + i10] = (char) f13334e[iIntValue + i10];
        }
        cArr[i9 - 3] = '.';
        cArr[i9 - 2] = 's';
        cArr[i9 - 1] = 'o';
        return new String(cArr);
    }

    private static int e(String str) {
        List list = (List) f13336g.get(Integer.valueOf(f(str)));
        if (list == null) {
            return -1;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            int iIntValue = ((Integer) it.next()).intValue();
            if (g(str, iIntValue)) {
                return iIntValue;
            }
        }
        return -1;
    }

    private static int f(String str) {
        int iCodePointAt = 5381;
        for (int i7 = f13330a; i7 < str.length() - f13331b; i7++) {
            iCodePointAt = str.codePointAt(i7) + (iCodePointAt << 5) + iCodePointAt;
        }
        return iCodePointAt;
    }

    private static boolean g(String str, int i7) {
        int i8;
        int i9 = f13330a;
        while (true) {
            int length = str.length();
            i8 = f13331b;
            if (i9 >= length - i8 || i7 >= f13334e.length || (str.codePointAt(i9) & 255) != f13334e[i7]) {
                break;
            }
            i9++;
            i7++;
        }
        return i9 == str.length() - i8;
    }

    public static void h(String str, g gVar, int i7, StrictMode.ThreadPolicy threadPolicy) {
        String[] strArrB = b(str, gVar);
        m.a("SoLoader", "Loading " + str + "'s dependencies: " + Arrays.toString(strArrB));
        for (String str2 : strArrB) {
            if (!str2.startsWith("/")) {
                SoLoader.s(str2, i7, threadPolicy);
            }
        }
    }

    static String[] i(String str) {
        int iE;
        if (f13333d && str.length() > f13332c && (iE = e(str)) != -1) {
            return c(iE, str.length());
        }
        return null;
    }
}
