package U5;

import F5.d;
import F5.f;
import F5.g;
import T5.C;
import T5.E;
import T5.InterfaceC0459e;
import T5.r;
import T5.t;
import T5.z;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import i5.AbstractC1744a;
import i5.u;
import i6.A;
import i6.D;
import i6.h;
import i6.i;
import i6.t;
import j5.AbstractC1784C;
import j5.AbstractC1787F;
import j5.AbstractC1803h;
import j5.AbstractC1809n;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import t5.AbstractC2070a;
import w5.k;
import w5.y;

/* JADX INFO: loaded from: classes2.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final byte[] f3983a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final t f3984b = t.f3618n.h(new String[0]);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final E f3985c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final C f3986d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final i6.t f3987e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final TimeZone f3988f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final f f3989g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final boolean f3990h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String f3991i;

    static final class a implements r.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ r f3992a;

        a(r rVar) {
            this.f3992a = rVar;
        }

        @Override // T5.r.c
        public final r a(InterfaceC0459e interfaceC0459e) {
            k.f(interfaceC0459e, "it");
            return this.f3992a;
        }
    }

    static final class b implements ThreadFactory {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f3993a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f3994b;

        b(String str, boolean z6) {
            this.f3993a = str;
            this.f3994b = z6;
        }

        @Override // java.util.concurrent.ThreadFactory
        public final Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable, this.f3993a);
            thread.setDaemon(this.f3994b);
            return thread;
        }
    }

    static {
        byte[] bArr = new byte[0];
        f3983a = bArr;
        f3985c = E.a.d(E.f3339m, bArr, null, 1, null);
        f3986d = C.a.h(C.f3305a, bArr, null, 0, 0, 7, null);
        t.a aVar = i6.t.f20041p;
        i.a aVar2 = i.f20019q;
        f3987e = aVar.d(aVar2.b("efbbbf"), aVar2.b("feff"), aVar2.b("fffe"), aVar2.b("0000ffff"), aVar2.b("ffff0000"));
        TimeZone timeZone = TimeZone.getTimeZone("GMT");
        k.c(timeZone);
        f3988f = timeZone;
        f3989g = new f("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");
        f3990h = false;
        String name = z.class.getName();
        k.e(name, "OkHttpClient::class.java.name");
        f3991i = g.i0(g.h0(name, "okhttp3."), "Client");
    }

    public static final int A(String str, int i7) {
        k.f(str, "$this$indexOfNonWhitespace");
        int length = str.length();
        while (i7 < length) {
            char cCharAt = str.charAt(i7);
            if (cCharAt != ' ' && cCharAt != '\t') {
                return i7;
            }
            i7++;
        }
        return str.length();
    }

    public static final String[] B(String[] strArr, String[] strArr2, Comparator comparator) {
        k.f(strArr, "$this$intersect");
        k.f(strArr2, "other");
        k.f(comparator, "comparator");
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            int length = strArr2.length;
            int i7 = 0;
            while (true) {
                if (i7 >= length) {
                    break;
                }
                if (comparator.compare(str, strArr2[i7]) == 0) {
                    arrayList.add(str);
                    break;
                }
                i7++;
            }
        }
        Object[] array = arrayList.toArray(new String[0]);
        if (array != null) {
            return (String[]) array;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
    }

    public static final boolean C(c6.a aVar, File file) throws IOException {
        k.f(aVar, "$this$isCivilized");
        k.f(file, "file");
        A aB = aVar.b(file);
        try {
            try {
                aVar.f(file);
                AbstractC2070a.a(aB, null);
                return true;
            } catch (IOException unused) {
                u uVar = u.f19985a;
                AbstractC2070a.a(aB, null);
                aVar.f(file);
                return false;
            }
        } finally {
        }
    }

    public static final boolean D(Socket socket, h hVar) {
        k.f(socket, "$this$isHealthy");
        k.f(hVar, "source");
        try {
            int soTimeout = socket.getSoTimeout();
            try {
                socket.setSoTimeout(1);
                boolean z6 = !hVar.O();
                socket.setSoTimeout(soTimeout);
                return z6;
            } catch (Throwable th) {
                socket.setSoTimeout(soTimeout);
                throw th;
            }
        } catch (SocketTimeoutException unused) {
            return true;
        } catch (IOException unused2) {
            return false;
        }
    }

    public static final boolean E(String str) {
        k.f(str, "name");
        return g.p(str, "Authorization", true) || g.p(str, "Cookie", true) || g.p(str, "Proxy-Authorization", true) || g.p(str, "Set-Cookie", true);
    }

    public static final int F(char c7) {
        if ('0' <= c7 && '9' >= c7) {
            return c7 - '0';
        }
        if ('a' <= c7 && 'f' >= c7) {
            return c7 - 'W';
        }
        if ('A' <= c7 && 'F' >= c7) {
            return c7 - '7';
        }
        return -1;
    }

    public static final Charset G(h hVar, Charset charset) {
        Charset charset2;
        String str;
        k.f(hVar, "$this$readBomAsCharset");
        k.f(charset, "default");
        int iR = hVar.R(f3987e);
        if (iR == -1) {
            return charset;
        }
        if (iR == 0) {
            charset2 = StandardCharsets.UTF_8;
            str = "UTF_8";
        } else if (iR == 1) {
            charset2 = StandardCharsets.UTF_16BE;
            str = "UTF_16BE";
        } else {
            if (iR != 2) {
                if (iR == 3) {
                    return d.f1103a.a();
                }
                if (iR == 4) {
                    return d.f1103a.b();
                }
                throw new AssertionError();
            }
            charset2 = StandardCharsets.UTF_16LE;
            str = "UTF_16LE";
        }
        k.e(charset2, str);
        return charset2;
    }

    public static final int H(h hVar) {
        k.f(hVar, "$this$readMedium");
        return b(hVar.q0(), 255) | (b(hVar.q0(), 255) << 16) | (b(hVar.q0(), 255) << 8);
    }

    public static final int I(i6.f fVar, byte b7) throws EOFException {
        k.f(fVar, "$this$skipAll");
        int i7 = 0;
        while (!fVar.O() && fVar.z(0L) == b7) {
            i7++;
            fVar.q0();
        }
        return i7;
    }

    public static final boolean J(i6.C c7, int i7, TimeUnit timeUnit) {
        k.f(c7, "$this$skipAll");
        k.f(timeUnit, "timeUnit");
        long jNanoTime = System.nanoTime();
        long jC = c7.i().e() ? c7.i().c() - jNanoTime : Long.MAX_VALUE;
        c7.i().d(Math.min(jC, timeUnit.toNanos(i7)) + jNanoTime);
        try {
            i6.f fVar = new i6.f();
            while (c7.L0(fVar, 8192L) != -1) {
                fVar.a();
            }
            D dI = c7.i();
            if (jC == Long.MAX_VALUE) {
                dI.a();
            } else {
                dI.d(jNanoTime + jC);
            }
            return true;
        } catch (InterruptedIOException unused) {
            D dI2 = c7.i();
            if (jC == Long.MAX_VALUE) {
                dI2.a();
            } else {
                dI2.d(jNanoTime + jC);
            }
            return false;
        } catch (Throwable th) {
            D dI3 = c7.i();
            if (jC == Long.MAX_VALUE) {
                dI3.a();
            } else {
                dI3.d(jNanoTime + jC);
            }
            throw th;
        }
    }

    public static final ThreadFactory K(String str, boolean z6) {
        k.f(str, "name");
        return new b(str, z6);
    }

    public static final List L(T5.t tVar) {
        k.f(tVar, "$this$toHeaderList");
        C5.c cVarL = C5.g.l(0, tVar.size());
        ArrayList arrayList = new ArrayList(AbstractC1809n.q(cVarL, 10));
        Iterator it = cVarL.iterator();
        while (it.hasNext()) {
            int iD = ((AbstractC1784C) it).d();
            arrayList.add(new b6.c(tVar.h(iD), tVar.m(iD)));
        }
        return arrayList;
    }

    public static final T5.t M(List list) {
        k.f(list, "$this$toHeaders");
        t.a aVar = new t.a();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            b6.c cVar = (b6.c) it.next();
            aVar.c(cVar.a().G(), cVar.b().G());
        }
        return aVar.e();
    }

    public static final String N(int i7) {
        String hexString = Integer.toHexString(i7);
        k.e(hexString, "Integer.toHexString(this)");
        return hexString;
    }

    public static final String O(long j7) {
        String hexString = Long.toHexString(j7);
        k.e(hexString, "java.lang.Long.toHexString(this)");
        return hexString;
    }

    public static final String P(T5.u uVar, boolean z6) {
        String strH;
        k.f(uVar, "$this$toHostHeader");
        if (g.G(uVar.h(), ":", false, 2, null)) {
            strH = '[' + uVar.h() + ']';
        } else {
            strH = uVar.h();
        }
        if (!z6 && uVar.l() == T5.u.f3622l.c(uVar.p())) {
            return strH;
        }
        return strH + ':' + uVar.l();
    }

    public static /* synthetic */ String Q(T5.u uVar, boolean z6, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            z6 = false;
        }
        return P(uVar, z6);
    }

    public static final List R(List list) {
        k.f(list, "$this$toImmutableList");
        List listUnmodifiableList = Collections.unmodifiableList(AbstractC1809n.d0(list));
        k.e(listUnmodifiableList, "Collections.unmodifiableList(toMutableList())");
        return listUnmodifiableList;
    }

    public static final Map S(Map map) {
        k.f(map, "$this$toImmutableMap");
        if (map.isEmpty()) {
            return AbstractC1787F.g();
        }
        Map mapUnmodifiableMap = Collections.unmodifiableMap(new LinkedHashMap(map));
        k.e(mapUnmodifiableMap, "Collections.unmodifiableMap(LinkedHashMap(this))");
        return mapUnmodifiableMap;
    }

    public static final long T(String str, long j7) {
        k.f(str, "$this$toLongOrDefault");
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException unused) {
            return j7;
        }
    }

    public static final int U(String str, int i7) {
        if (str != null) {
            try {
                long j7 = Long.parseLong(str);
                if (j7 > Api.BaseClientBuilder.API_PRIORITY_OTHER) {
                    return Api.BaseClientBuilder.API_PRIORITY_OTHER;
                }
                if (j7 < 0) {
                    return 0;
                }
                return (int) j7;
            } catch (NumberFormatException unused) {
            }
        }
        return i7;
    }

    public static final String V(String str, int i7, int i8) {
        k.f(str, "$this$trimSubstring");
        int iW = w(str, i7, i8);
        String strSubstring = str.substring(iW, y(str, iW, i8));
        k.e(strSubstring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        return strSubstring;
    }

    public static /* synthetic */ String W(String str, int i7, int i8, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            i7 = 0;
        }
        if ((i9 & 2) != 0) {
            i8 = str.length();
        }
        return V(str, i7, i8);
    }

    public static final Throwable X(Exception exc, List list) {
        k.f(exc, "$this$withSuppressed");
        k.f(list, "suppressed");
        if (list.size() > 1) {
            System.out.println(list);
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AbstractC1744a.a(exc, (Exception) it.next());
        }
        return exc;
    }

    public static final void Y(i6.g gVar, int i7) {
        k.f(gVar, "$this$writeMedium");
        gVar.P((i7 >>> 16) & 255);
        gVar.P((i7 >>> 8) & 255);
        gVar.P(i7 & 255);
    }

    public static final void a(List list, Object obj) {
        k.f(list, "$this$addIfAbsent");
        if (list.contains(obj)) {
            return;
        }
        list.add(obj);
    }

    public static final int b(byte b7, int i7) {
        return b7 & i7;
    }

    public static final int c(short s6, int i7) {
        return s6 & i7;
    }

    public static final long d(int i7, long j7) {
        return ((long) i7) & j7;
    }

    public static final r.c e(r rVar) {
        k.f(rVar, "$this$asFactory");
        return new a(rVar);
    }

    public static final boolean f(String str) {
        k.f(str, "$this$canParseAsIpAddress");
        return f3989g.a(str);
    }

    public static final boolean g(T5.u uVar, T5.u uVar2) {
        k.f(uVar, "$this$canReuseConnectionFor");
        k.f(uVar2, "other");
        return k.b(uVar.h(), uVar2.h()) && uVar.l() == uVar2.l() && k.b(uVar.p(), uVar2.p());
    }

    public static final int h(String str, long j7, TimeUnit timeUnit) {
        k.f(str, "name");
        if (!(j7 >= 0)) {
            throw new IllegalStateException((str + " < 0").toString());
        }
        if (!(timeUnit != null)) {
            throw new IllegalStateException("unit == null".toString());
        }
        long millis = timeUnit.toMillis(j7);
        if (!(millis <= ((long) Api.BaseClientBuilder.API_PRIORITY_OTHER))) {
            throw new IllegalArgumentException((str + " too large.").toString());
        }
        if (millis != 0 || j7 <= 0) {
            return (int) millis;
        }
        throw new IllegalArgumentException((str + " too small.").toString());
    }

    public static final void i(long j7, long j8, long j9) {
        if ((j8 | j9) < 0 || j8 > j7 || j7 - j8 < j9) {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    public static final void j(Closeable closeable) {
        k.f(closeable, "$this$closeQuietly");
        try {
            closeable.close();
        } catch (RuntimeException e7) {
            throw e7;
        } catch (Exception unused) {
        }
    }

    public static final void k(Socket socket) {
        k.f(socket, "$this$closeQuietly");
        try {
            socket.close();
        } catch (AssertionError e7) {
            throw e7;
        } catch (RuntimeException e8) {
            if (!k.b(e8.getMessage(), "bio == null")) {
                throw e8;
            }
        } catch (Exception unused) {
        }
    }

    public static final String[] l(String[] strArr, String str) {
        k.f(strArr, "$this$concat");
        k.f(str, "value");
        Object[] objArrCopyOf = Arrays.copyOf(strArr, strArr.length + 1);
        k.e(objArrCopyOf, "java.util.Arrays.copyOf(this, newSize)");
        String[] strArr2 = (String[]) objArrCopyOf;
        strArr2[AbstractC1803h.v(strArr2)] = str;
        return strArr2;
    }

    public static final int m(String str, char c7, int i7, int i8) {
        k.f(str, "$this$delimiterOffset");
        while (i7 < i8) {
            if (str.charAt(i7) == c7) {
                return i7;
            }
            i7++;
        }
        return i8;
    }

    public static final int n(String str, String str2, int i7, int i8) {
        k.f(str, "$this$delimiterOffset");
        k.f(str2, "delimiters");
        while (i7 < i8) {
            if (g.F(str2, str.charAt(i7), false, 2, null)) {
                return i7;
            }
            i7++;
        }
        return i8;
    }

    public static /* synthetic */ int o(String str, char c7, int i7, int i8, int i9, Object obj) {
        if ((i9 & 2) != 0) {
            i7 = 0;
        }
        if ((i9 & 4) != 0) {
            i8 = str.length();
        }
        return m(str, c7, i7, i8);
    }

    public static final boolean p(i6.C c7, int i7, TimeUnit timeUnit) {
        k.f(c7, "$this$discard");
        k.f(timeUnit, "timeUnit");
        try {
            return J(c7, i7, timeUnit);
        } catch (IOException unused) {
            return false;
        }
    }

    public static final String q(String str, Object... objArr) {
        k.f(str, "format");
        k.f(objArr, "args");
        y yVar = y.f22743a;
        Locale locale = Locale.US;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        String str2 = String.format(locale, str, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
        k.e(str2, "java.lang.String.format(locale, format, *args)");
        return str2;
    }

    public static final boolean r(String[] strArr, String[] strArr2, Comparator comparator) {
        k.f(strArr, "$this$hasIntersection");
        k.f(comparator, "comparator");
        if (strArr.length != 0 && strArr2 != null && strArr2.length != 0) {
            for (String str : strArr) {
                for (String str2 : strArr2) {
                    if (comparator.compare(str, str2) == 0) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static final long s(T5.D d7) {
        k.f(d7, "$this$headersContentLength");
        String strF = d7.w().f("Content-Length");
        if (strF != null) {
            return T(strF, -1L);
        }
        return -1L;
    }

    public static final List t(Object... objArr) {
        k.f(objArr, "elements");
        Object[] objArr2 = (Object[]) objArr.clone();
        List listUnmodifiableList = Collections.unmodifiableList(AbstractC1809n.k(Arrays.copyOf(objArr2, objArr2.length)));
        k.e(listUnmodifiableList, "Collections.unmodifiable…istOf(*elements.clone()))");
        return listUnmodifiableList;
    }

    public static final int u(String[] strArr, String str, Comparator comparator) {
        k.f(strArr, "$this$indexOf");
        k.f(str, "value");
        k.f(comparator, "comparator");
        int length = strArr.length;
        for (int i7 = 0; i7 < length; i7++) {
            if (comparator.compare(strArr[i7], str) == 0) {
                return i7;
            }
        }
        return -1;
    }

    public static final int v(String str) {
        k.f(str, "$this$indexOfControlOrNonAscii");
        int length = str.length();
        for (int i7 = 0; i7 < length; i7++) {
            char cCharAt = str.charAt(i7);
            if (k.g(cCharAt, 31) <= 0 || k.g(cCharAt, ModuleDescriptor.MODULE_VERSION) >= 0) {
                return i7;
            }
        }
        return -1;
    }

    public static final int w(String str, int i7, int i8) {
        k.f(str, "$this$indexOfFirstNonAsciiWhitespace");
        while (i7 < i8) {
            char cCharAt = str.charAt(i7);
            if (cCharAt != '\t' && cCharAt != '\n' && cCharAt != '\f' && cCharAt != '\r' && cCharAt != ' ') {
                return i7;
            }
            i7++;
        }
        return i8;
    }

    public static /* synthetic */ int x(String str, int i7, int i8, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            i7 = 0;
        }
        if ((i9 & 2) != 0) {
            i8 = str.length();
        }
        return w(str, i7, i8);
    }

    public static final int y(String str, int i7, int i8) {
        k.f(str, "$this$indexOfLastNonAsciiWhitespace");
        int i9 = i8 - 1;
        if (i9 >= i7) {
            while (true) {
                char cCharAt = str.charAt(i9);
                if (cCharAt != '\t' && cCharAt != '\n' && cCharAt != '\f' && cCharAt != '\r' && cCharAt != ' ') {
                    return i9 + 1;
                }
                if (i9 == i7) {
                    break;
                }
                i9--;
            }
        }
        return i7;
    }

    public static /* synthetic */ int z(String str, int i7, int i8, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            i7 = 0;
        }
        if ((i9 & 2) != 0) {
            i8 = str.length();
        }
        return y(str, i7, i8);
    }
}
