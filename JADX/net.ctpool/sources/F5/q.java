package F5;

import j5.AbstractC1784C;
import j5.AbstractC1803h;
import j5.AbstractC1809n;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes2.dex */
public abstract class q extends p {

    static final class a extends w5.l implements v5.p {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        final /* synthetic */ char[] f1126m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ boolean f1127n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(char[] cArr, boolean z6) {
            super(2);
            this.f1126m = cArr;
            this.f1127n = z6;
        }

        public final i5.l a(CharSequence charSequence, int i7) {
            w5.k.f(charSequence, "$this$$receiver");
            int iS = q.S(charSequence, this.f1126m, i7, this.f1127n);
            if (iS < 0) {
                return null;
            }
            return i5.q.a(Integer.valueOf(iS), 1);
        }

        @Override // v5.p
        public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
            return a((CharSequence) obj, ((Number) obj2).intValue());
        }
    }

    static final class b extends w5.l implements v5.p {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        final /* synthetic */ List f1128m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ boolean f1129n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(List list, boolean z6) {
            super(2);
            this.f1128m = list;
            this.f1129n = z6;
        }

        public final i5.l a(CharSequence charSequence, int i7) {
            w5.k.f(charSequence, "$this$$receiver");
            i5.l lVarJ = q.J(charSequence, this.f1128m, i7, this.f1129n, false);
            if (lVarJ != null) {
                return i5.q.a(lVarJ.c(), Integer.valueOf(((String) lVarJ.d()).length()));
            }
            return null;
        }

        @Override // v5.p
        public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
            return a((CharSequence) obj, ((Number) obj2).intValue());
        }
    }

    static final class c extends w5.l implements v5.l {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        final /* synthetic */ CharSequence f1130m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(CharSequence charSequence) {
            super(1);
            this.f1130m = charSequence;
        }

        @Override // v5.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String i(C5.c cVar) {
            w5.k.f(cVar, "it");
            return q.v0(this.f1130m, cVar);
        }
    }

    public static String A0(String str, char c7, String str2) {
        w5.k.f(str, "<this>");
        w5.k.f(str2, "missingDelimiterValue");
        int iV = g.V(str, c7, 0, false, 6, null);
        if (iV == -1) {
            return str2;
        }
        String strSubstring = str.substring(iV + 1, str.length());
        w5.k.e(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static /* synthetic */ String B0(String str, char c7, String str2, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            str2 = str;
        }
        return g.A0(str, c7, str2);
    }

    public static CharSequence C0(CharSequence charSequence) {
        w5.k.f(charSequence, "<this>");
        int length = charSequence.length() - 1;
        int i7 = 0;
        boolean z6 = false;
        while (i7 <= length) {
            boolean zC = F5.b.c(charSequence.charAt(!z6 ? i7 : length));
            if (z6) {
                if (!zC) {
                    break;
                }
                length--;
            } else if (zC) {
                i7++;
            } else {
                z6 = true;
            }
        }
        return charSequence.subSequence(i7, length + 1);
    }

    public static final boolean D(CharSequence charSequence, char c7, boolean z6) {
        w5.k.f(charSequence, "<this>");
        return g.Q(charSequence, c7, 0, z6, 2, null) >= 0;
    }

    public static final boolean E(CharSequence charSequence, CharSequence charSequence2, boolean z6) {
        w5.k.f(charSequence, "<this>");
        w5.k.f(charSequence2, "other");
        if (charSequence2 instanceof String) {
            if (g.R(charSequence, (String) charSequence2, 0, z6, 2, null) < 0) {
                return false;
            }
        } else if (P(charSequence, charSequence2, 0, charSequence.length(), z6, false, 16, null) < 0) {
            return false;
        }
        return true;
    }

    public static /* synthetic */ boolean F(CharSequence charSequence, char c7, boolean z6, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            z6 = false;
        }
        return D(charSequence, c7, z6);
    }

    public static /* synthetic */ boolean G(CharSequence charSequence, CharSequence charSequence2, boolean z6, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            z6 = false;
        }
        return E(charSequence, charSequence2, z6);
    }

    public static final boolean H(CharSequence charSequence, CharSequence charSequence2, boolean z6) {
        w5.k.f(charSequence, "<this>");
        w5.k.f(charSequence2, "suffix");
        return (!z6 && (charSequence instanceof String) && (charSequence2 instanceof String)) ? g.o((String) charSequence, (String) charSequence2, false, 2, null) : g0(charSequence, charSequence.length() - charSequence2.length(), charSequence2, 0, charSequence2.length(), z6);
    }

    public static /* synthetic */ boolean I(CharSequence charSequence, CharSequence charSequence2, boolean z6, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            z6 = false;
        }
        return H(charSequence, charSequence2, z6);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0096, code lost:
    
        return i5.q.a(java.lang.Integer.valueOf(r12), r9);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final i5.l J(CharSequence charSequence, Collection collection, int i7, boolean z6, boolean z7) {
        int iF;
        Object next;
        String str;
        Object next2;
        if (!z6 && collection.size() == 1) {
            String str2 = (String) AbstractC1809n.T(collection);
            int iR = !z7 ? g.R(charSequence, str2, i7, false, 4, null) : g.W(charSequence, str2, i7, false, 4, null);
            if (iR < 0) {
                return null;
            }
            return i5.q.a(Integer.valueOf(iR), str2);
        }
        C5.a cVar = !z7 ? new C5.c(C5.g.c(i7, 0), charSequence.length()) : C5.g.j(C5.g.f(i7, L(charSequence)), 0);
        if (charSequence instanceof String) {
            iF = cVar.f();
            int iH = cVar.h();
            int i8 = cVar.i();
            if ((i8 > 0 && iF <= iH) || (i8 < 0 && iH <= iF)) {
                while (true) {
                    Iterator it = collection.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            next2 = null;
                            break;
                        }
                        next2 = it.next();
                        String str3 = (String) next2;
                        if (p.s(str3, 0, (String) charSequence, iF, str3.length(), z6)) {
                            break;
                        }
                    }
                    str = (String) next2;
                    if (str == null) {
                        if (iF == iH) {
                            break;
                        }
                        iF += i8;
                    } else {
                        break;
                    }
                }
            }
            return null;
        }
        iF = cVar.f();
        int iH2 = cVar.h();
        int i9 = cVar.i();
        if ((i9 > 0 && iF <= iH2) || (i9 < 0 && iH2 <= iF)) {
            while (true) {
                Iterator it2 = collection.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it2.next();
                    String str4 = (String) next;
                    if (g0(str4, 0, charSequence, iF, str4.length(), z6)) {
                        break;
                    }
                }
                str = (String) next;
                if (str == null) {
                    if (iF == iH2) {
                        break;
                    }
                    iF += i9;
                } else {
                    break;
                }
            }
        }
        return null;
    }

    public static final C5.c K(CharSequence charSequence) {
        w5.k.f(charSequence, "<this>");
        return new C5.c(0, charSequence.length() - 1);
    }

    public static final int L(CharSequence charSequence) {
        w5.k.f(charSequence, "<this>");
        return charSequence.length() - 1;
    }

    public static final int M(CharSequence charSequence, char c7, int i7, boolean z6) {
        w5.k.f(charSequence, "<this>");
        return (z6 || !(charSequence instanceof String)) ? S(charSequence, new char[]{c7}, i7, z6) : ((String) charSequence).indexOf(c7, i7);
    }

    public static final int N(CharSequence charSequence, String str, int i7, boolean z6) {
        w5.k.f(charSequence, "<this>");
        w5.k.f(str, "string");
        return (z6 || !(charSequence instanceof String)) ? P(charSequence, str, i7, charSequence.length(), z6, false, 16, null) : ((String) charSequence).indexOf(str, i7);
    }

    private static final int O(CharSequence charSequence, CharSequence charSequence2, int i7, int i8, boolean z6, boolean z7) {
        C5.a cVar = !z7 ? new C5.c(C5.g.c(i7, 0), C5.g.f(i8, charSequence.length())) : C5.g.j(C5.g.f(i7, L(charSequence)), C5.g.c(i8, 0));
        if ((charSequence instanceof String) && (charSequence2 instanceof String)) {
            int iF = cVar.f();
            int iH = cVar.h();
            int i9 = cVar.i();
            if ((i9 <= 0 || iF > iH) && (i9 >= 0 || iH > iF)) {
                return -1;
            }
            while (!p.s((String) charSequence2, 0, (String) charSequence, iF, charSequence2.length(), z6)) {
                if (iF == iH) {
                    return -1;
                }
                iF += i9;
            }
            return iF;
        }
        int iF2 = cVar.f();
        int iH2 = cVar.h();
        int i10 = cVar.i();
        if ((i10 <= 0 || iF2 > iH2) && (i10 >= 0 || iH2 > iF2)) {
            return -1;
        }
        while (!g0(charSequence2, 0, charSequence, iF2, charSequence2.length(), z6)) {
            if (iF2 == iH2) {
                return -1;
            }
            iF2 += i10;
        }
        return iF2;
    }

    static /* synthetic */ int P(CharSequence charSequence, CharSequence charSequence2, int i7, int i8, boolean z6, boolean z7, int i9, Object obj) {
        if ((i9 & 16) != 0) {
            z7 = false;
        }
        return O(charSequence, charSequence2, i7, i8, z6, z7);
    }

    public static /* synthetic */ int Q(CharSequence charSequence, char c7, int i7, boolean z6, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            i7 = 0;
        }
        if ((i8 & 4) != 0) {
            z6 = false;
        }
        return M(charSequence, c7, i7, z6);
    }

    public static /* synthetic */ int R(CharSequence charSequence, String str, int i7, boolean z6, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            i7 = 0;
        }
        if ((i8 & 4) != 0) {
            z6 = false;
        }
        return N(charSequence, str, i7, z6);
    }

    public static final int S(CharSequence charSequence, char[] cArr, int i7, boolean z6) {
        w5.k.f(charSequence, "<this>");
        w5.k.f(cArr, "chars");
        if (!z6 && cArr.length == 1 && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(AbstractC1803h.C(cArr), i7);
        }
        AbstractC1784C it = new C5.c(C5.g.c(i7, 0), L(charSequence)).iterator();
        while (it.hasNext()) {
            int iD = it.d();
            char cCharAt = charSequence.charAt(iD);
            for (char c7 : cArr) {
                if (F5.c.d(c7, cCharAt, z6)) {
                    return iD;
                }
            }
        }
        return -1;
    }

    public static final int T(CharSequence charSequence, char c7, int i7, boolean z6) {
        w5.k.f(charSequence, "<this>");
        return (z6 || !(charSequence instanceof String)) ? X(charSequence, new char[]{c7}, i7, z6) : ((String) charSequence).lastIndexOf(c7, i7);
    }

    public static final int U(CharSequence charSequence, String str, int i7, boolean z6) {
        w5.k.f(charSequence, "<this>");
        w5.k.f(str, "string");
        return (z6 || !(charSequence instanceof String)) ? O(charSequence, str, i7, 0, z6, true) : ((String) charSequence).lastIndexOf(str, i7);
    }

    public static /* synthetic */ int V(CharSequence charSequence, char c7, int i7, boolean z6, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            i7 = L(charSequence);
        }
        if ((i8 & 4) != 0) {
            z6 = false;
        }
        return T(charSequence, c7, i7, z6);
    }

    public static /* synthetic */ int W(CharSequence charSequence, String str, int i7, boolean z6, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            i7 = L(charSequence);
        }
        if ((i8 & 4) != 0) {
            z6 = false;
        }
        return U(charSequence, str, i7, z6);
    }

    public static final int X(CharSequence charSequence, char[] cArr, int i7, boolean z6) {
        w5.k.f(charSequence, "<this>");
        w5.k.f(cArr, "chars");
        if (!z6 && cArr.length == 1 && (charSequence instanceof String)) {
            return ((String) charSequence).lastIndexOf(AbstractC1803h.C(cArr), i7);
        }
        for (int iF = C5.g.f(i7, L(charSequence)); -1 < iF; iF--) {
            char cCharAt = charSequence.charAt(iF);
            for (char c7 : cArr) {
                if (F5.c.d(c7, cCharAt, z6)) {
                    return iF;
                }
            }
        }
        return -1;
    }

    public static final E5.d Y(CharSequence charSequence) {
        w5.k.f(charSequence, "<this>");
        return s0(charSequence, new String[]{"\r\n", "\n", "\r"}, false, 0, 6, null);
    }

    public static final List Z(CharSequence charSequence) {
        w5.k.f(charSequence, "<this>");
        return E5.e.i(Y(charSequence));
    }

    public static final CharSequence a0(CharSequence charSequence, int i7, char c7) {
        w5.k.f(charSequence, "<this>");
        if (i7 < 0) {
            throw new IllegalArgumentException("Desired length " + i7 + " is less than zero.");
        }
        if (i7 <= charSequence.length()) {
            return charSequence.subSequence(0, charSequence.length());
        }
        StringBuilder sb = new StringBuilder(i7);
        AbstractC1784C it = new C5.c(1, i7 - charSequence.length()).iterator();
        while (it.hasNext()) {
            it.d();
            sb.append(c7);
        }
        sb.append(charSequence);
        return sb;
    }

    public static String b0(String str, int i7, char c7) {
        w5.k.f(str, "<this>");
        return a0(str, i7, c7).toString();
    }

    private static final E5.d c0(CharSequence charSequence, char[] cArr, int i7, boolean z6, int i8) {
        l0(i8);
        return new e(charSequence, i7, i8, new a(cArr, z6));
    }

    private static final E5.d d0(CharSequence charSequence, String[] strArr, int i7, boolean z6, int i8) {
        l0(i8);
        return new e(charSequence, i7, i8, new b(AbstractC1803h.c(strArr), z6));
    }

    static /* synthetic */ E5.d e0(CharSequence charSequence, char[] cArr, int i7, boolean z6, int i8, int i9, Object obj) {
        if ((i9 & 2) != 0) {
            i7 = 0;
        }
        if ((i9 & 4) != 0) {
            z6 = false;
        }
        if ((i9 & 8) != 0) {
            i8 = 0;
        }
        return c0(charSequence, cArr, i7, z6, i8);
    }

    static /* synthetic */ E5.d f0(CharSequence charSequence, String[] strArr, int i7, boolean z6, int i8, int i9, Object obj) {
        if ((i9 & 2) != 0) {
            i7 = 0;
        }
        if ((i9 & 4) != 0) {
            z6 = false;
        }
        if ((i9 & 8) != 0) {
            i8 = 0;
        }
        return d0(charSequence, strArr, i7, z6, i8);
    }

    public static final boolean g0(CharSequence charSequence, int i7, CharSequence charSequence2, int i8, int i9, boolean z6) {
        w5.k.f(charSequence, "<this>");
        w5.k.f(charSequence2, "other");
        if (i8 < 0 || i7 < 0 || i7 > charSequence.length() - i9 || i8 > charSequence2.length() - i9) {
            return false;
        }
        for (int i10 = 0; i10 < i9; i10++) {
            if (!F5.c.d(charSequence.charAt(i7 + i10), charSequence2.charAt(i8 + i10), z6)) {
                return false;
            }
        }
        return true;
    }

    public static String h0(String str, CharSequence charSequence) {
        w5.k.f(str, "<this>");
        w5.k.f(charSequence, "prefix");
        if (!u0(str, charSequence, false, 2, null)) {
            return str;
        }
        String strSubstring = str.substring(charSequence.length());
        w5.k.e(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static String i0(String str, CharSequence charSequence) {
        w5.k.f(str, "<this>");
        w5.k.f(charSequence, "suffix");
        if (!I(str, charSequence, false, 2, null)) {
            return str;
        }
        String strSubstring = str.substring(0, str.length() - charSequence.length());
        w5.k.e(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static String j0(String str, CharSequence charSequence) {
        w5.k.f(str, "<this>");
        w5.k.f(charSequence, "delimiter");
        return k0(str, charSequence, charSequence);
    }

    public static final String k0(String str, CharSequence charSequence, CharSequence charSequence2) {
        w5.k.f(str, "<this>");
        w5.k.f(charSequence, "prefix");
        w5.k.f(charSequence2, "suffix");
        if (str.length() < charSequence.length() + charSequence2.length() || !u0(str, charSequence, false, 2, null) || !I(str, charSequence2, false, 2, null)) {
            return str;
        }
        String strSubstring = str.substring(charSequence.length(), str.length() - charSequence2.length());
        w5.k.e(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static final void l0(int i7) {
        if (i7 >= 0) {
            return;
        }
        throw new IllegalArgumentException(("Limit must be non-negative, but was " + i7).toString());
    }

    public static final List m0(CharSequence charSequence, char[] cArr, boolean z6, int i7) {
        w5.k.f(charSequence, "<this>");
        w5.k.f(cArr, "delimiters");
        if (cArr.length == 1) {
            return o0(charSequence, String.valueOf(cArr[0]), z6, i7);
        }
        Iterable iterableC = E5.e.c(e0(charSequence, cArr, 0, z6, i7, 2, null));
        ArrayList arrayList = new ArrayList(AbstractC1809n.q(iterableC, 10));
        Iterator it = iterableC.iterator();
        while (it.hasNext()) {
            arrayList.add(v0(charSequence, (C5.c) it.next()));
        }
        return arrayList;
    }

    public static final List n0(CharSequence charSequence, String[] strArr, boolean z6, int i7) {
        w5.k.f(charSequence, "<this>");
        w5.k.f(strArr, "delimiters");
        if (strArr.length == 1) {
            String str = strArr[0];
            if (str.length() != 0) {
                return o0(charSequence, str, z6, i7);
            }
        }
        Iterable iterableC = E5.e.c(f0(charSequence, strArr, 0, z6, i7, 2, null));
        ArrayList arrayList = new ArrayList(AbstractC1809n.q(iterableC, 10));
        Iterator it = iterableC.iterator();
        while (it.hasNext()) {
            arrayList.add(v0(charSequence, (C5.c) it.next()));
        }
        return arrayList;
    }

    private static final List o0(CharSequence charSequence, String str, boolean z6, int i7) {
        l0(i7);
        int length = 0;
        int iN = N(charSequence, str, 0, z6);
        if (iN == -1 || i7 == 1) {
            return AbstractC1809n.d(charSequence.toString());
        }
        boolean z7 = i7 > 0;
        ArrayList arrayList = new ArrayList(z7 ? C5.g.f(i7, 10) : 10);
        do {
            arrayList.add(charSequence.subSequence(length, iN).toString());
            length = str.length() + iN;
            if (z7 && arrayList.size() == i7 - 1) {
                break;
            }
            iN = N(charSequence, str, length, z6);
        } while (iN != -1);
        arrayList.add(charSequence.subSequence(length, charSequence.length()).toString());
        return arrayList;
    }

    public static /* synthetic */ List p0(CharSequence charSequence, char[] cArr, boolean z6, int i7, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            z6 = false;
        }
        if ((i8 & 4) != 0) {
            i7 = 0;
        }
        return m0(charSequence, cArr, z6, i7);
    }

    public static /* synthetic */ List q0(CharSequence charSequence, String[] strArr, boolean z6, int i7, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            z6 = false;
        }
        if ((i8 & 4) != 0) {
            i7 = 0;
        }
        return n0(charSequence, strArr, z6, i7);
    }

    public static final E5.d r0(CharSequence charSequence, String[] strArr, boolean z6, int i7) {
        w5.k.f(charSequence, "<this>");
        w5.k.f(strArr, "delimiters");
        return E5.e.h(f0(charSequence, strArr, 0, z6, i7, 2, null), new c(charSequence));
    }

    public static /* synthetic */ E5.d s0(CharSequence charSequence, String[] strArr, boolean z6, int i7, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            z6 = false;
        }
        if ((i8 & 4) != 0) {
            i7 = 0;
        }
        return r0(charSequence, strArr, z6, i7);
    }

    public static final boolean t0(CharSequence charSequence, CharSequence charSequence2, boolean z6) {
        w5.k.f(charSequence, "<this>");
        w5.k.f(charSequence2, "prefix");
        return (!z6 && (charSequence instanceof String) && (charSequence2 instanceof String)) ? g.B((String) charSequence, (String) charSequence2, false, 2, null) : g0(charSequence, 0, charSequence2, 0, charSequence2.length(), z6);
    }

    public static /* synthetic */ boolean u0(CharSequence charSequence, CharSequence charSequence2, boolean z6, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            z6 = false;
        }
        return t0(charSequence, charSequence2, z6);
    }

    public static final String v0(CharSequence charSequence, C5.c cVar) {
        w5.k.f(charSequence, "<this>");
        w5.k.f(cVar, "range");
        return charSequence.subSequence(cVar.o().intValue(), cVar.n().intValue() + 1).toString();
    }

    public static final String w0(String str, char c7, String str2) {
        w5.k.f(str, "<this>");
        w5.k.f(str2, "missingDelimiterValue");
        int iQ = g.Q(str, c7, 0, false, 6, null);
        if (iQ == -1) {
            return str2;
        }
        String strSubstring = str.substring(iQ + 1, str.length());
        w5.k.e(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static final String x0(String str, String str2, String str3) {
        w5.k.f(str, "<this>");
        w5.k.f(str2, "delimiter");
        w5.k.f(str3, "missingDelimiterValue");
        int iR = g.R(str, str2, 0, false, 6, null);
        if (iR == -1) {
            return str3;
        }
        String strSubstring = str.substring(iR + str2.length(), str.length());
        w5.k.e(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static /* synthetic */ String y0(String str, char c7, String str2, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            str2 = str;
        }
        return w0(str, c7, str2);
    }

    public static /* synthetic */ String z0(String str, String str2, String str3, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            str3 = str;
        }
        return x0(str, str2, str3);
    }
}
