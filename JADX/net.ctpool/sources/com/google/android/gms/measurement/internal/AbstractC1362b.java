package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.T1;
import com.google.android.gms.internal.measurement.V1;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
abstract class AbstractC1362b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    String f15911a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f15912b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    Boolean f15913c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    Boolean f15914d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    Long f15915e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    Long f15916f;

    AbstractC1362b(String str, int i7) {
        this.f15911a = str;
        this.f15912b = i7;
    }

    static Boolean b(double d7, com.google.android.gms.internal.measurement.T1 t12) {
        try {
            return h(new BigDecimal(d7), t12, Math.ulp(d7));
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    static Boolean c(long j7, com.google.android.gms.internal.measurement.T1 t12) {
        try {
            return h(new BigDecimal(j7), t12, 0.0d);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    static Boolean d(Boolean bool, boolean z6) {
        if (bool == null) {
            return null;
        }
        return Boolean.valueOf(bool.booleanValue() != z6);
    }

    static Boolean e(String str, com.google.android.gms.internal.measurement.T1 t12) {
        if (!Z5.e0(str)) {
            return null;
        }
        try {
            return h(new BigDecimal(str), t12, 0.0d);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    private static Boolean f(String str, V1.b bVar, boolean z6, String str2, List list, String str3, C1449n2 c1449n2) {
        boolean zStartsWith;
        if (str == null) {
            return null;
        }
        if (bVar == V1.b.IN_LIST) {
            if (list == null || list.isEmpty()) {
                return null;
            }
        } else if (str2 == null) {
            return null;
        }
        if (!z6 && bVar != V1.b.REGEXP) {
            str = str.toUpperCase(Locale.ENGLISH);
        }
        switch (k6.f16141a[bVar.ordinal()]) {
            case 1:
                if (str3 == null) {
                    return null;
                }
                try {
                    return Boolean.valueOf(Pattern.compile(str3, z6 ? 0 : 66).matcher(str).matches());
                } catch (PatternSyntaxException unused) {
                    if (c1449n2 != null) {
                        c1449n2.J().b("Invalid regular expression in REGEXP audience filter. expression", str3);
                    }
                    return null;
                }
            case 2:
                zStartsWith = str.startsWith(str2);
                break;
            case 3:
                zStartsWith = str.endsWith(str2);
                break;
            case 4:
                zStartsWith = str.contains(str2);
                break;
            case 5:
                zStartsWith = str.equals(str2);
                break;
            case 6:
                if (list == null) {
                    return null;
                }
                zStartsWith = list.contains(str);
                break;
            default:
                return null;
        }
        return Boolean.valueOf(zStartsWith);
    }

    static Boolean g(String str, com.google.android.gms.internal.measurement.V1 v12, C1449n2 c1449n2) {
        List list;
        Preconditions.checkNotNull(v12);
        if (str == null || !v12.M() || v12.E() == V1.b.UNKNOWN_MATCH_TYPE) {
            return null;
        }
        V1.b bVarE = v12.E();
        V1.b bVar = V1.b.IN_LIST;
        if (bVarE == bVar) {
            if (v12.j() == 0) {
                return null;
            }
        } else if (!v12.L()) {
            return null;
        }
        V1.b bVarE2 = v12.E();
        boolean zJ = v12.J();
        String strH = (zJ || bVarE2 == V1.b.REGEXP || bVarE2 == bVar) ? v12.H() : v12.H().toUpperCase(Locale.ENGLISH);
        if (v12.j() == 0) {
            list = null;
        } else {
            List listI = v12.I();
            if (!zJ) {
                ArrayList arrayList = new ArrayList(listI.size());
                Iterator it = listI.iterator();
                while (it.hasNext()) {
                    arrayList.add(((String) it.next()).toUpperCase(Locale.ENGLISH));
                }
                listI = Collections.unmodifiableList(arrayList);
            }
            list = listI;
        }
        return f(str, bVarE2, zJ, strH, list, bVarE2 == V1.b.REGEXP ? strH : null, c1449n2);
    }

    private static Boolean h(BigDecimal bigDecimal, com.google.android.gms.internal.measurement.T1 t12, double d7) {
        BigDecimal bigDecimal2;
        BigDecimal bigDecimal3;
        BigDecimal bigDecimal4;
        Preconditions.checkNotNull(t12);
        if (t12.L() && t12.E() != T1.b.UNKNOWN_COMPARISON_TYPE) {
            T1.b bVarE = t12.E();
            T1.b bVar = T1.b.BETWEEN;
            if (bVarE == bVar) {
                if (!t12.P() || !t12.O()) {
                    return null;
                }
            } else if (!t12.M()) {
                return null;
            }
            T1.b bVarE2 = t12.E();
            if (t12.E() == bVar) {
                if (Z5.e0(t12.J()) && Z5.e0(t12.I())) {
                    try {
                        BigDecimal bigDecimal5 = new BigDecimal(t12.J());
                        bigDecimal4 = new BigDecimal(t12.I());
                        bigDecimal3 = bigDecimal5;
                        bigDecimal2 = null;
                    } catch (NumberFormatException unused) {
                    }
                }
                return null;
            }
            if (!Z5.e0(t12.H())) {
                return null;
            }
            try {
                bigDecimal2 = new BigDecimal(t12.H());
                bigDecimal3 = null;
                bigDecimal4 = null;
            } catch (NumberFormatException unused2) {
            }
            if (bVarE2 == bVar) {
                if (bigDecimal3 == null) {
                    return null;
                }
            } else if (bigDecimal2 != null) {
            }
            int i7 = k6.f16142b[bVarE2.ordinal()];
            if (i7 != 1) {
                if (i7 != 2) {
                    if (i7 != 3) {
                        if (i7 != 4 || bigDecimal3 == null) {
                            return null;
                        }
                        if (bigDecimal.compareTo(bigDecimal3) >= 0 && bigDecimal.compareTo(bigDecimal4) <= 0) {
                            z = true;
                        }
                        return Boolean.valueOf(z);
                    }
                    if (bigDecimal2 != null) {
                        if (d7 == 0.0d) {
                            return Boolean.valueOf(bigDecimal.compareTo(bigDecimal2) == 0);
                        }
                        if (bigDecimal.compareTo(bigDecimal2.subtract(new BigDecimal(d7).multiply(new BigDecimal(2)))) > 0 && bigDecimal.compareTo(bigDecimal2.add(new BigDecimal(d7).multiply(new BigDecimal(2)))) < 0) {
                            z = true;
                        }
                        return Boolean.valueOf(z);
                    }
                } else if (bigDecimal2 != null) {
                    return Boolean.valueOf(bigDecimal.compareTo(bigDecimal2) > 0);
                }
            } else if (bigDecimal2 != null) {
                return Boolean.valueOf(bigDecimal.compareTo(bigDecimal2) < 0);
            }
        }
        return null;
    }

    abstract int a();

    abstract boolean i();

    abstract boolean j();
}
