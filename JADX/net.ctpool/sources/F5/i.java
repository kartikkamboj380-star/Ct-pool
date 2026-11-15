package F5;

import j5.AbstractC1809n;
import j5.x;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes2.dex */
public abstract class i extends h {

    static final class a extends w5.l implements v5.l {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public static final a f1124m = new a();

        a() {
            super(1);
        }

        @Override // v5.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String i(String str) {
            w5.k.f(str, "line");
            return str;
        }
    }

    static final class b extends w5.l implements v5.l {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        final /* synthetic */ String f1125m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(String str) {
            super(1);
            this.f1125m = str;
        }

        @Override // v5.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String i(String str) {
            w5.k.f(str, "line");
            return this.f1125m + str;
        }
    }

    private static final v5.l b(String str) {
        return str.length() == 0 ? a.f1124m : new b(str);
    }

    private static final int c(String str) {
        int length = str.length();
        int i7 = 0;
        while (true) {
            if (i7 >= length) {
                i7 = -1;
                break;
            }
            if (!F5.b.c(str.charAt(i7))) {
                break;
            }
            i7++;
        }
        return i7 == -1 ? str.length() : i7;
    }

    public static final String d(String str, String str2) {
        String str3;
        w5.k.f(str, "<this>");
        w5.k.f(str2, "newIndent");
        List listZ = q.Z(str);
        ArrayList arrayList = new ArrayList();
        for (Object obj : listZ) {
            if (!g.r((String) obj)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(AbstractC1809n.q(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(Integer.valueOf(c((String) it.next())));
        }
        Integer num = (Integer) AbstractC1809n.Q(arrayList2);
        int i7 = 0;
        int iIntValue = num != null ? num.intValue() : 0;
        int length = str.length() + (str2.length() * listZ.size());
        v5.l lVarB = b(str2);
        int iJ = AbstractC1809n.j(listZ);
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : listZ) {
            int i8 = i7 + 1;
            if (i7 < 0) {
                AbstractC1809n.p();
            }
            String str4 = (String) obj2;
            if ((i7 == 0 || i7 == iJ) && g.r(str4)) {
                str4 = null;
            } else {
                String strD0 = s.D0(str4, iIntValue);
                if (strD0 != null && (str3 = (String) lVarB.i(strD0)) != null) {
                    str4 = str3;
                }
            }
            if (str4 != null) {
                arrayList3.add(str4);
            }
            i7 = i8;
        }
        String string = ((StringBuilder) x.L(arrayList3, new StringBuilder(length), (124 & 2) != 0 ? ", " : "\n", (124 & 4) != 0 ? "" : null, (124 & 8) == 0 ? null : "", (124 & 16) != 0 ? -1 : 0, (124 & 32) != 0 ? "..." : null, (124 & 64) != 0 ? null : null)).toString();
        w5.k.e(string, "toString(...)");
        return string;
    }

    public static final String e(String str, String str2, String str3) {
        int i7;
        String str4;
        w5.k.f(str, "<this>");
        w5.k.f(str2, "newIndent");
        w5.k.f(str3, "marginPrefix");
        if (!(!g.r(str3))) {
            throw new IllegalArgumentException("marginPrefix must be non-blank string.".toString());
        }
        List listZ = q.Z(str);
        int length = str.length() + (str2.length() * listZ.size());
        v5.l lVarB = b(str2);
        int iJ = AbstractC1809n.j(listZ);
        ArrayList arrayList = new ArrayList();
        int i8 = 0;
        for (Object obj : listZ) {
            int i9 = i8 + 1;
            if (i8 < 0) {
                AbstractC1809n.p();
            }
            String str5 = (String) obj;
            String strSubstring = null;
            if ((i8 == 0 || i8 == iJ) && g.r(str5)) {
                str5 = null;
            } else {
                int length2 = str5.length();
                int i10 = 0;
                while (true) {
                    if (i10 >= length2) {
                        i7 = -1;
                        break;
                    }
                    if (!F5.b.c(str5.charAt(i10))) {
                        i7 = i10;
                        break;
                    }
                    i10++;
                }
                if (i7 != -1) {
                    int i11 = i7;
                    if (g.A(str5, str3, i7, false, 4, null)) {
                        int length3 = i11 + str3.length();
                        w5.k.d(str5, "null cannot be cast to non-null type java.lang.String");
                        strSubstring = str5.substring(length3);
                        w5.k.e(strSubstring, "substring(...)");
                    }
                }
                if (strSubstring != null && (str4 = (String) lVarB.i(strSubstring)) != null) {
                    str5 = str4;
                }
            }
            if (str5 != null) {
                arrayList.add(str5);
            }
            i8 = i9;
        }
        String string = ((StringBuilder) x.L(arrayList, new StringBuilder(length), (124 & 2) != 0 ? ", " : "\n", (124 & 4) != 0 ? "" : null, (124 & 8) == 0 ? null : "", (124 & 16) != 0 ? -1 : 0, (124 & 32) != 0 ? "..." : null, (124 & 64) != 0 ? null : null)).toString();
        w5.k.e(string, "toString(...)");
        return string;
    }

    public static String f(String str) {
        w5.k.f(str, "<this>");
        return d(str, "");
    }

    public static final String g(String str, String str2) {
        w5.k.f(str, "<this>");
        w5.k.f(str2, "marginPrefix");
        return e(str, "", str2);
    }

    public static /* synthetic */ String h(String str, String str2, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            str2 = "|";
        }
        return g(str, str2);
    }
}
