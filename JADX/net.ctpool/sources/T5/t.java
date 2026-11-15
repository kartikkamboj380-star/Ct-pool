package T5;

import j5.AbstractC1803h;
import j5.AbstractC1809n;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import w5.AbstractC2198b;
import x5.InterfaceC2227a;

/* JADX INFO: loaded from: classes2.dex */
public final class t implements Iterable, InterfaceC2227a {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final b f3618n = new b(null);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final String[] f3619m;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final List f3620a = new ArrayList(20);

        public final a a(String str, String str2) {
            w5.k.f(str, "name");
            w5.k.f(str2, "value");
            b bVar = t.f3618n;
            bVar.d(str);
            bVar.e(str2, str);
            c(str, str2);
            return this;
        }

        public final a b(String str) {
            w5.k.f(str, "line");
            int iQ = F5.g.Q(str, ':', 1, false, 4, null);
            if (iQ != -1) {
                String strSubstring = str.substring(0, iQ);
                w5.k.e(strSubstring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                String strSubstring2 = str.substring(iQ + 1);
                w5.k.e(strSubstring2, "(this as java.lang.String).substring(startIndex)");
                c(strSubstring, strSubstring2);
            } else {
                if (str.charAt(0) == ':') {
                    str = str.substring(1);
                    w5.k.e(str, "(this as java.lang.String).substring(startIndex)");
                }
                c("", str);
            }
            return this;
        }

        public final a c(String str, String str2) {
            w5.k.f(str, "name");
            w5.k.f(str2, "value");
            this.f3620a.add(str);
            this.f3620a.add(F5.g.C0(str2).toString());
            return this;
        }

        public final a d(String str, String str2) {
            w5.k.f(str, "name");
            w5.k.f(str2, "value");
            t.f3618n.d(str);
            c(str, str2);
            return this;
        }

        public final t e() {
            Object[] array = this.f3620a.toArray(new String[0]);
            if (array != null) {
                return new t((String[]) array, null);
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
        }

        public final String f(String str) {
            w5.k.f(str, "name");
            C5.a aVarK = C5.g.k(C5.g.j(this.f3620a.size() - 2, 0), 2);
            int iF = aVarK.f();
            int iH = aVarK.h();
            int i7 = aVarK.i();
            if (i7 >= 0) {
                if (iF > iH) {
                    return null;
                }
            } else if (iF < iH) {
                return null;
            }
            while (!F5.g.p(str, (String) this.f3620a.get(iF), true)) {
                if (iF == iH) {
                    return null;
                }
                iF += i7;
            }
            return (String) this.f3620a.get(iF + 1);
        }

        public final List g() {
            return this.f3620a;
        }

        public final a h(String str) {
            w5.k.f(str, "name");
            int i7 = 0;
            while (i7 < this.f3620a.size()) {
                if (F5.g.p(str, (String) this.f3620a.get(i7), true)) {
                    this.f3620a.remove(i7);
                    this.f3620a.remove(i7);
                    i7 -= 2;
                }
                i7 += 2;
            }
            return this;
        }

        public final a i(String str, String str2) {
            w5.k.f(str, "name");
            w5.k.f(str2, "value");
            b bVar = t.f3618n;
            bVar.d(str);
            bVar.e(str2, str);
            h(str);
            c(str, str2);
            return this;
        }
    }

    public static final class b {
        private b() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void d(String str) {
            if (!(str.length() > 0)) {
                throw new IllegalArgumentException("name is empty".toString());
            }
            int length = str.length();
            for (int i7 = 0; i7 < length; i7++) {
                char cCharAt = str.charAt(i7);
                if (!('!' <= cCharAt && '~' >= cCharAt)) {
                    throw new IllegalArgumentException(U5.c.q("Unexpected char %#04x at %d in header name: %s", Integer.valueOf(cCharAt), Integer.valueOf(i7), str).toString());
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void e(String str, String str2) {
            int length = str.length();
            for (int i7 = 0; i7 < length; i7++) {
                char cCharAt = str.charAt(i7);
                if (!(cCharAt == '\t' || (' ' <= cCharAt && '~' >= cCharAt))) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(U5.c.q("Unexpected char %#04x at %d in %s value", Integer.valueOf(cCharAt), Integer.valueOf(i7), str2));
                    sb.append(U5.c.E(str2) ? "" : ": " + str);
                    throw new IllegalArgumentException(sb.toString().toString());
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String f(String[] strArr, String str) {
            C5.a aVarK = C5.g.k(C5.g.j(strArr.length - 2, 0), 2);
            int iF = aVarK.f();
            int iH = aVarK.h();
            int i7 = aVarK.i();
            if (i7 >= 0) {
                if (iF > iH) {
                    return null;
                }
            } else if (iF < iH) {
                return null;
            }
            while (!F5.g.p(str, strArr[iF], true)) {
                if (iF == iH) {
                    return null;
                }
                iF += i7;
            }
            return strArr[iF + 1];
        }

        public final t g(Map map) {
            w5.k.f(map, "$this$toHeaders");
            String[] strArr = new String[map.size() * 2];
            int i7 = 0;
            for (Map.Entry entry : map.entrySet()) {
                String str = (String) entry.getKey();
                String str2 = (String) entry.getValue();
                if (str == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.CharSequence");
                }
                String string = F5.g.C0(str).toString();
                if (str2 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.CharSequence");
                }
                String string2 = F5.g.C0(str2).toString();
                d(string);
                e(string2, string);
                strArr[i7] = string;
                strArr[i7 + 1] = string2;
                i7 += 2;
            }
            return new t(strArr, null);
        }

        public final t h(String... strArr) throws CloneNotSupportedException {
            w5.k.f(strArr, "namesAndValues");
            if (!(strArr.length % 2 == 0)) {
                throw new IllegalArgumentException("Expected alternating header names and values".toString());
            }
            Object objClone = strArr.clone();
            if (objClone == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<kotlin.String>");
            }
            String[] strArr2 = (String[]) objClone;
            int length = strArr2.length;
            for (int i7 = 0; i7 < length; i7++) {
                String str = strArr2[i7];
                if (!(str != null)) {
                    throw new IllegalArgumentException("Headers cannot be null".toString());
                }
                if (str == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.CharSequence");
                }
                strArr2[i7] = F5.g.C0(str).toString();
            }
            C5.a aVarK = C5.g.k(AbstractC1803h.t(strArr2), 2);
            int iF = aVarK.f();
            int iH = aVarK.h();
            int i8 = aVarK.i();
            if (i8 < 0 ? iF >= iH : iF <= iH) {
                while (true) {
                    String str2 = strArr2[iF];
                    String str3 = strArr2[iF + 1];
                    d(str2);
                    e(str3, str2);
                    if (iF == iH) {
                        break;
                    }
                    iF += i8;
                }
            }
            return new t(strArr2, null);
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private t(String[] strArr) {
        this.f3619m = strArr;
    }

    public static final t k(Map map) {
        return f3618n.g(map);
    }

    public boolean equals(Object obj) {
        return (obj instanceof t) && Arrays.equals(this.f3619m, ((t) obj).f3619m);
    }

    public final String f(String str) {
        w5.k.f(str, "name");
        return f3618n.f(this.f3619m, str);
    }

    public final String h(int i7) {
        return this.f3619m[i7 * 2];
    }

    public int hashCode() {
        return Arrays.hashCode(this.f3619m);
    }

    public final a i() {
        a aVar = new a();
        AbstractC1809n.u(aVar.g(), this.f3619m);
        return aVar;
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        int size = size();
        i5.l[] lVarArr = new i5.l[size];
        for (int i7 = 0; i7 < size; i7++) {
            lVarArr[i7] = i5.q.a(h(i7), m(i7));
        }
        return AbstractC2198b.a(lVarArr);
    }

    public final String m(int i7) {
        return this.f3619m[(i7 * 2) + 1];
    }

    public final List n(String str) {
        w5.k.f(str, "name");
        int size = size();
        ArrayList arrayList = null;
        for (int i7 = 0; i7 < size; i7++) {
            if (F5.g.p(str, h(i7), true)) {
                if (arrayList == null) {
                    arrayList = new ArrayList(2);
                }
                arrayList.add(m(i7));
            }
        }
        if (arrayList == null) {
            return AbstractC1809n.i();
        }
        List listUnmodifiableList = Collections.unmodifiableList(arrayList);
        w5.k.e(listUnmodifiableList, "Collections.unmodifiableList(result)");
        return listUnmodifiableList;
    }

    public final int size() {
        return this.f3619m.length / 2;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        int size = size();
        for (int i7 = 0; i7 < size; i7++) {
            String strH = h(i7);
            String strM = m(i7);
            sb.append(strH);
            sb.append(": ");
            if (U5.c.E(strH)) {
                strM = "██";
            }
            sb.append(strM);
            sb.append("\n");
        }
        String string = sb.toString();
        w5.k.e(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    public /* synthetic */ t(String[] strArr, DefaultConstructorMarker defaultConstructorMarker) {
        this(strArr);
    }
}
