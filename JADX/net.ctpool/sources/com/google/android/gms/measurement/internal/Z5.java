package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.internal.measurement.AbstractC1260z4;
import com.google.android.gms.internal.measurement.B2;
import com.google.android.gms.internal.measurement.C1071e;
import com.google.android.gms.internal.measurement.C1148m4;
import com.google.android.gms.internal.measurement.C1155n2;
import com.google.android.gms.internal.measurement.C1173p2;
import com.google.android.gms.internal.measurement.C1182q2;
import com.google.android.gms.internal.measurement.C1190r2;
import com.google.android.gms.internal.measurement.C1195r7;
import com.google.android.gms.internal.measurement.C1199s2;
import com.google.android.gms.internal.measurement.C1204s7;
import com.google.android.gms.internal.measurement.C1217u2;
import com.google.android.gms.internal.measurement.C1234w2;
import com.google.android.gms.internal.measurement.C1242x2;
import com.google.android.gms.internal.measurement.C1258z2;
import com.google.android.gms.internal.measurement.InterfaceC1086f5;
import com.google.android.gms.internal.measurement.Y6;
import com.google.android.gms.internal.measurement.y7;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

/* JADX INFO: loaded from: classes.dex */
public final class Z5 extends E5 {
    Z5(H5 h52) {
        super(h52);
    }

    private final Bundle A(Map map, boolean z6) {
        String string;
        Bundle bundle = new Bundle();
        for (String str : map.keySet()) {
            Object obj = map.get(str);
            if (obj == null) {
                string = null;
            } else if (obj instanceof Long) {
                bundle.putLong(str, ((Long) obj).longValue());
            } else if (obj instanceof Double) {
                bundle.putDouble(str, ((Double) obj).doubleValue());
            } else if (!(obj instanceof ArrayList)) {
                string = obj.toString();
            } else if (z6) {
                ArrayList arrayList = (ArrayList) obj;
                ArrayList arrayList2 = new ArrayList();
                int size = arrayList.size();
                int i7 = 0;
                while (i7 < size) {
                    Object obj2 = arrayList.get(i7);
                    i7++;
                    arrayList2.add(A((Map) obj2, false));
                }
                bundle.putParcelableArray(str, (Parcelable[]) arrayList2.toArray(new Parcelable[0]));
            }
            bundle.putString(str, string);
        }
        return bundle;
    }

    static C1217u2 D(C1199s2 c1199s2, String str) {
        for (C1217u2 c1217u2 : c1199s2.T()) {
            if (c1217u2.U().equals(str)) {
                return c1217u2;
            }
        }
        return null;
    }

    static InterfaceC1086f5 E(InterfaceC1086f5 interfaceC1086f5, byte[] bArr) {
        C1148m4 c1148m4A = C1148m4.a();
        return c1148m4A != null ? interfaceC1086f5.H0(bArr, c1148m4A) : interfaceC1086f5.a0(bArr);
    }

    static Object H(C1199s2 c1199s2, String str, Object obj) {
        Object objD0 = d0(c1199s2, str);
        return objD0 == null ? obj : objD0;
    }

    private static String L(boolean z6, boolean z7, boolean z8) {
        StringBuilder sb = new StringBuilder();
        if (z6) {
            sb.append("Dynamic ");
        }
        if (z7) {
            sb.append("Sequence ");
        }
        if (z8) {
            sb.append("Session-Scoped ");
        }
        return sb.toString();
    }

    static List M(BitSet bitSet) {
        int length = (bitSet.length() + 63) / 64;
        ArrayList arrayList = new ArrayList(length);
        for (int i7 = 0; i7 < length; i7++) {
            long j7 = 0;
            for (int i8 = 0; i8 < 64; i8++) {
                int i9 = (i7 << 6) + i8;
                if (i9 < bitSet.length()) {
                    if (bitSet.get(i9)) {
                        j7 |= 1 << i8;
                    }
                }
            }
            arrayList.add(Long.valueOf(j7));
        }
        return arrayList;
    }

    private static void P(Uri.Builder builder, String str, String str2, Set set) {
        if (set.contains(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        builder.appendQueryParameter(str, str2);
    }

    private static void Q(Uri.Builder builder, String[] strArr, Bundle bundle, Set set) {
        for (String str : strArr) {
            String[] strArrSplit = str.split(",");
            String str2 = strArrSplit[0];
            String str3 = strArrSplit[strArrSplit.length - 1];
            String string = bundle.getString(str2);
            if (string != null) {
                P(builder, str3, string, set);
            }
        }
    }

    static void R(C1199s2.a aVar, String str, Object obj) {
        List listJ = aVar.J();
        int i7 = 0;
        while (true) {
            if (i7 >= listJ.size()) {
                i7 = -1;
                break;
            } else if (str.equals(((C1217u2) listJ.get(i7)).U())) {
                break;
            } else {
                i7++;
            }
        }
        C1217u2.a aVarZ = C1217u2.S().z(str);
        if (obj instanceof Long) {
            aVarZ.v(((Long) obj).longValue());
        } else if (obj instanceof String) {
            aVarZ.B((String) obj);
        } else if (obj instanceof Double) {
            aVarZ.u(((Double) obj).doubleValue());
        }
        if (i7 >= 0) {
            aVar.v(i7, aVarZ);
        } else {
            aVar.z(aVarZ);
        }
    }

    private static void U(StringBuilder sb, int i7) {
        for (int i8 = 0; i8 < i7; i8++) {
            sb.append("  ");
        }
    }

    private final void V(StringBuilder sb, int i7, com.google.android.gms.internal.measurement.S1 s12) {
        if (s12 == null) {
            return;
        }
        U(sb, i7);
        sb.append("filter {\n");
        if (s12.L()) {
            Y(sb, i7, "complement", Boolean.valueOf(s12.K()));
        }
        if (s12.N()) {
            Y(sb, i7, "param_name", e().f(s12.J()));
        }
        if (s12.O()) {
            int i8 = i7 + 1;
            com.google.android.gms.internal.measurement.V1 v1I = s12.I();
            if (v1I != null) {
                U(sb, i8);
                sb.append("string_filter");
                sb.append(" {\n");
                if (v1I.M()) {
                    Y(sb, i8, "match_type", v1I.E().name());
                }
                if (v1I.L()) {
                    Y(sb, i8, "expression", v1I.H());
                }
                if (v1I.K()) {
                    Y(sb, i8, "case_sensitive", Boolean.valueOf(v1I.J()));
                }
                if (v1I.j() > 0) {
                    U(sb, i7 + 2);
                    sb.append("expression_list {\n");
                    for (String str : v1I.I()) {
                        U(sb, i7 + 3);
                        sb.append(str);
                        sb.append("\n");
                    }
                    sb.append("}\n");
                }
                U(sb, i8);
                sb.append("}\n");
            }
        }
        if (s12.M()) {
            W(sb, i7 + 1, "number_filter", s12.H());
        }
        U(sb, i7);
        sb.append("}\n");
    }

    private static void W(StringBuilder sb, int i7, String str, com.google.android.gms.internal.measurement.T1 t12) {
        if (t12 == null) {
            return;
        }
        U(sb, i7);
        sb.append(str);
        sb.append(" {\n");
        if (t12.L()) {
            Y(sb, i7, "comparison_type", t12.E().name());
        }
        if (t12.N()) {
            Y(sb, i7, "match_as_float", Boolean.valueOf(t12.K()));
        }
        if (t12.M()) {
            Y(sb, i7, "comparison_value", t12.H());
        }
        if (t12.P()) {
            Y(sb, i7, "min_comparison_value", t12.J());
        }
        if (t12.O()) {
            Y(sb, i7, "max_comparison_value", t12.I());
        }
        U(sb, i7);
        sb.append("}\n");
    }

    private static void X(StringBuilder sb, int i7, String str, C1258z2 c1258z2) {
        if (c1258z2 == null) {
            return;
        }
        U(sb, 3);
        sb.append(str);
        sb.append(" {\n");
        if (c1258z2.G() != 0) {
            U(sb, 4);
            sb.append("results: ");
            int i8 = 0;
            for (Long l7 : c1258z2.T()) {
                int i9 = i8 + 1;
                if (i8 != 0) {
                    sb.append(", ");
                }
                sb.append(l7);
                i8 = i9;
            }
            sb.append('\n');
        }
        if (c1258z2.M() != 0) {
            U(sb, 4);
            sb.append("status: ");
            int i10 = 0;
            for (Long l8 : c1258z2.V()) {
                int i11 = i10 + 1;
                if (i10 != 0) {
                    sb.append(", ");
                }
                sb.append(l8);
                i10 = i11;
            }
            sb.append('\n');
        }
        if (c1258z2.j() != 0) {
            U(sb, 4);
            sb.append("dynamic_filter_timestamps: {");
            int i12 = 0;
            for (C1190r2 c1190r2 : c1258z2.S()) {
                int i13 = i12 + 1;
                if (i12 != 0) {
                    sb.append(", ");
                }
                sb.append(c1190r2.K() ? Integer.valueOf(c1190r2.j()) : null);
                sb.append(":");
                sb.append(c1190r2.J() ? Long.valueOf(c1190r2.G()) : null);
                i12 = i13;
            }
            sb.append("}\n");
        }
        if (c1258z2.J() != 0) {
            U(sb, 4);
            sb.append("sequence_filter_timestamps: {");
            int i14 = 0;
            for (com.google.android.gms.internal.measurement.A2 a22 : c1258z2.U()) {
                int i15 = i14 + 1;
                if (i14 != 0) {
                    sb.append(", ");
                }
                sb.append(a22.L() ? Integer.valueOf(a22.H()) : null);
                sb.append(": [");
                Iterator it = a22.K().iterator();
                int i16 = 0;
                while (it.hasNext()) {
                    long jLongValue = ((Long) it.next()).longValue();
                    int i17 = i16 + 1;
                    if (i16 != 0) {
                        sb.append(", ");
                    }
                    sb.append(jLongValue);
                    i16 = i17;
                }
                sb.append("]");
                i14 = i15;
            }
            sb.append("}\n");
        }
        U(sb, 3);
        sb.append("}\n");
    }

    private static void Y(StringBuilder sb, int i7, String str, Object obj) {
        if (obj == null) {
            return;
        }
        U(sb, i7 + 1);
        sb.append(str);
        sb.append(": ");
        sb.append(obj);
        sb.append('\n');
    }

    private final void Z(StringBuilder sb, int i7, List list) {
        if (list == null) {
            return;
        }
        int i8 = i7 + 1;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C1217u2 c1217u2 = (C1217u2) it.next();
            if (c1217u2 != null) {
                U(sb, i8);
                sb.append("param {\n");
                Y(sb, i8, "name", c1217u2.b0() ? e().f(c1217u2.U()) : null);
                Y(sb, i8, "string_value", c1217u2.c0() ? c1217u2.V() : null);
                Y(sb, i8, "int_value", c1217u2.Z() ? Long.valueOf(c1217u2.Q()) : null);
                Y(sb, i8, "double_value", c1217u2.X() ? Double.valueOf(c1217u2.E()) : null);
                if (c1217u2.O() > 0) {
                    Z(sb, i8, c1217u2.W());
                }
                U(sb, i8);
                sb.append("}\n");
            }
        }
    }

    static boolean b0(E e7, M5 m52) {
        Preconditions.checkNotNull(e7);
        Preconditions.checkNotNull(m52);
        return (TextUtils.isEmpty(m52.f15696n) && TextUtils.isEmpty(m52.f15679C)) ? false : true;
    }

    static boolean c0(List list, int i7) {
        if (i7 < (list.size() << 6)) {
            return ((1 << (i7 % 64)) & ((Long) list.get(i7 / 64)).longValue()) != 0;
        }
        return false;
    }

    static Object d0(C1199s2 c1199s2, String str) {
        C1217u2 c1217u2D = D(c1199s2, str);
        if (c1217u2D == null) {
            return null;
        }
        if (c1217u2D.c0()) {
            return c1217u2D.V();
        }
        if (c1217u2D.Z()) {
            return Long.valueOf(c1217u2D.Q());
        }
        if (c1217u2D.X()) {
            return Double.valueOf(c1217u2D.E());
        }
        if (c1217u2D.O() > 0) {
            return g0(c1217u2D.W());
        }
        return null;
    }

    static boolean e0(String str) {
        return str != null && str.matches("([+-])?([0-9]+\\.?[0-9]*|[0-9]*\\.?[0-9]+)") && str.length() <= 310;
    }

    static Bundle[] g0(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C1217u2 c1217u2 = (C1217u2) it.next();
            if (c1217u2 != null) {
                Bundle bundle = new Bundle();
                for (C1217u2 c1217u22 : c1217u2.W()) {
                    if (c1217u22.c0()) {
                        bundle.putString(c1217u22.U(), c1217u22.V());
                    } else if (c1217u22.Z()) {
                        bundle.putLong(c1217u22.U(), c1217u22.Q());
                    } else if (c1217u22.X()) {
                        bundle.putDouble(c1217u22.U(), c1217u22.E());
                    }
                }
                if (!bundle.isEmpty()) {
                    arrayList.add(bundle);
                }
            }
        }
        return (Bundle[]) arrayList.toArray(new Bundle[arrayList.size()]);
    }

    static int w(C1242x2.a aVar, String str) {
        if (aVar == null) {
            return -1;
        }
        for (int i7 = 0; i7 < aVar.b0(); i7++) {
            if (str.equals(aVar.M0(i7).S())) {
                return i7;
            }
        }
        return -1;
    }

    static Bundle z(List list) {
        Bundle bundle = new Bundle();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C1217u2 c1217u2 = (C1217u2) it.next();
            String strU = c1217u2.U();
            if (c1217u2.X()) {
                bundle.putDouble(strU, c1217u2.E());
            } else if (c1217u2.Y()) {
                bundle.putFloat(strU, c1217u2.L());
            } else if (c1217u2.c0()) {
                bundle.putString(strU, c1217u2.V());
            } else if (c1217u2.Z()) {
                bundle.putLong(strU, c1217u2.Q());
            }
        }
        return bundle;
    }

    final Parcelable B(byte[] bArr, Parcelable.Creator creator) {
        if (bArr == null) {
            return null;
        }
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.unmarshall(bArr, 0, bArr.length);
            parcelObtain.setDataPosition(0);
            return (Parcelable) creator.createFromParcel(parcelObtain);
        } catch (SafeParcelReader.ParseException unused) {
            d().E().a("Failed to load parcelable from buffer");
            return null;
        } finally {
            parcelObtain.recycle();
        }
    }

    final C1199s2 C(B b7) {
        C1199s2.a aVarY = C1199s2.Q().y(b7.f15372e);
        for (String str : b7.f15373f) {
            C1217u2.a aVarZ = C1217u2.S().z(str);
            Object objH0 = b7.f15373f.H0(str);
            Preconditions.checkNotNull(objH0);
            S(aVarZ, objH0);
            aVarY.z(aVarZ);
        }
        if (b().r(G.f15537j1) && !TextUtils.isEmpty(b7.f15370c) && b7.f15373f.H0("_o") == null) {
            aVarY.A((C1217u2) ((AbstractC1260z4) C1217u2.S().z("_o").B(b7.f15370c).p()));
        }
        return (C1199s2) ((AbstractC1260z4) aVarY.p());
    }

    final E F(C1071e c1071e) {
        Object obj;
        Bundle bundleA = A(c1071e.g(), true);
        String string = (!bundleA.containsKey("_o") || (obj = bundleA.get("_o")) == null) ? "app" : obj.toString();
        String strB = w3.s.b(c1071e.e());
        if (strB == null) {
            strB = c1071e.e();
        }
        return new E(strB, new D(bundleA), string, c1071e.a());
    }

    final B5 G(String str, C1242x2.a aVar, C1199s2.a aVar2, String str2) {
        String strValueOf;
        String strValueOf2;
        int iIndexOf;
        if (!C1195r7.a() || !b().D(str, G.f15473I0)) {
            return null;
        }
        long jCurrentTimeMillis = zzb().currentTimeMillis();
        String[] strArrSplit = b().B(str, G.f15530h0).split(",");
        HashSet hashSet = new HashSet(strArrSplit.length);
        for (String str3 : strArrSplit) {
            Objects.requireNonNull(str3);
            if (!hashSet.add(str3)) {
                throw new IllegalArgumentException("duplicate element: " + ((Object) str3));
            }
        }
        Set setUnmodifiableSet = Collections.unmodifiableSet(hashSet);
        G5 g5R = r();
        String strP = g5R.p().P(str);
        Uri.Builder builder = new Uri.Builder();
        builder.scheme(g5R.b().B(str, G.f15509a0));
        builder.authority(TextUtils.isEmpty(strP) ? g5R.b().B(str, G.f15512b0) : strP + "." + g5R.b().B(str, G.f15512b0));
        builder.path(g5R.b().B(str, G.f15515c0));
        P(builder, "gmp_app_id", aVar.j1(), setUnmodifiableSet);
        P(builder, "gmp_version", "106000", setUnmodifiableSet);
        String strG1 = aVar.g1();
        C1397g c1397gB = b();
        C1365b2 c1365b2 = G.f15479L0;
        if (c1397gB.D(str, c1365b2) && p().Y(str)) {
            strG1 = "";
        }
        P(builder, "app_instance_id", strG1, setUnmodifiableSet);
        P(builder, "rdid", aVar.l1(), setUnmodifiableSet);
        P(builder, "bundle_id", aVar.f1(), setUnmodifiableSet);
        String strI = aVar2.I();
        String strA = w3.s.a(strI);
        if (!TextUtils.isEmpty(strA)) {
            strI = strA;
        }
        P(builder, "app_event_name", strI, setUnmodifiableSet);
        P(builder, "app_version", String.valueOf(aVar.O()), setUnmodifiableSet);
        String strK1 = aVar.k1();
        if (b().D(str, c1365b2) && p().c0(str) && !TextUtils.isEmpty(strK1) && (iIndexOf = strK1.indexOf(".")) != -1) {
            strK1 = strK1.substring(0, iIndexOf);
        }
        P(builder, "os_version", strK1, setUnmodifiableSet);
        P(builder, "timestamp", String.valueOf(aVar2.G()), setUnmodifiableSet);
        if (aVar.M()) {
            P(builder, "lat", "1", setUnmodifiableSet);
        }
        P(builder, "privacy_sandbox_version", String.valueOf(aVar.t()), setUnmodifiableSet);
        P(builder, "trigger_uri_source", "1", setUnmodifiableSet);
        P(builder, "trigger_uri_timestamp", String.valueOf(jCurrentTimeMillis), setUnmodifiableSet);
        P(builder, "request_uuid", str2, setUnmodifiableSet);
        List<C1217u2> listJ = aVar2.J();
        Bundle bundle = new Bundle();
        for (C1217u2 c1217u2 : listJ) {
            String strU = c1217u2.U();
            if (c1217u2.X()) {
                strValueOf2 = String.valueOf(c1217u2.E());
            } else if (c1217u2.Y()) {
                strValueOf2 = String.valueOf(c1217u2.L());
            } else if (c1217u2.c0()) {
                strValueOf2 = c1217u2.V();
            } else if (c1217u2.Z()) {
                strValueOf2 = String.valueOf(c1217u2.Q());
            }
            bundle.putString(strU, strValueOf2);
        }
        Q(builder, b().B(str, G.f15527g0).split("\\|"), bundle, setUnmodifiableSet);
        List<com.google.android.gms.internal.measurement.B2> listK = aVar.K();
        Bundle bundle2 = new Bundle();
        for (com.google.android.gms.internal.measurement.B2 b22 : listK) {
            String strS = b22.S();
            if (b22.U()) {
                strValueOf = String.valueOf(b22.E());
            } else if (b22.V()) {
                strValueOf = String.valueOf(b22.J());
            } else if (b22.Y()) {
                strValueOf = b22.T();
            } else if (b22.W()) {
                strValueOf = String.valueOf(b22.N());
            }
            bundle2.putString(strS, strValueOf);
        }
        Q(builder, b().B(str, G.f15524f0).split("\\|"), bundle2, setUnmodifiableSet);
        P(builder, "dma", aVar.L() ? "1" : "0", setUnmodifiableSet);
        if (!aVar.i1().isEmpty()) {
            P(builder, "dma_cps", aVar.i1(), setUnmodifiableSet);
        }
        if (b().r(G.f15483N0) && aVar.N()) {
            C1155n2 c1155n2R0 = aVar.r0();
            if (!c1155n2R0.Z().isEmpty()) {
                P(builder, "dl_gclid", c1155n2R0.Z(), setUnmodifiableSet);
            }
            if (!c1155n2R0.Y().isEmpty()) {
                P(builder, "dl_gbraid", c1155n2R0.Y(), setUnmodifiableSet);
            }
            if (!c1155n2R0.V().isEmpty()) {
                P(builder, "dl_gs", c1155n2R0.V(), setUnmodifiableSet);
            }
            if (c1155n2R0.E() > 0) {
                P(builder, "dl_ss_ts", String.valueOf(c1155n2R0.E()), setUnmodifiableSet);
            }
            if (!c1155n2R0.d0().isEmpty()) {
                P(builder, "mr_gclid", c1155n2R0.d0(), setUnmodifiableSet);
            }
            if (!c1155n2R0.c0().isEmpty()) {
                P(builder, "mr_gbraid", c1155n2R0.c0(), setUnmodifiableSet);
            }
            if (!c1155n2R0.b0().isEmpty()) {
                P(builder, "mr_gs", c1155n2R0.b0(), setUnmodifiableSet);
            }
            if (c1155n2R0.I() > 0) {
                P(builder, "mr_click_ts", String.valueOf(c1155n2R0.I()), setUnmodifiableSet);
            }
        }
        return new B5(builder.build().toString(), jCurrentTimeMillis, 1);
    }

    final String I(com.google.android.gms.internal.measurement.R1 r12) {
        if (r12 == null) {
            return "null";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("\nevent_filter {\n");
        if (r12.R()) {
            Y(sb, 0, "filter_id", Integer.valueOf(r12.H()));
        }
        Y(sb, 0, "event_name", e().c(r12.L()));
        String strL = L(r12.N(), r12.O(), r12.P());
        if (!strL.isEmpty()) {
            Y(sb, 0, "filter_type", strL);
        }
        if (r12.Q()) {
            W(sb, 1, "event_count_filter", r12.K());
        }
        if (r12.j() > 0) {
            sb.append("  filters {\n");
            Iterator it = r12.M().iterator();
            while (it.hasNext()) {
                V(sb, 2, (com.google.android.gms.internal.measurement.S1) it.next());
            }
        }
        U(sb, 1);
        sb.append("}\n}\n");
        return sb.toString();
    }

    final String J(com.google.android.gms.internal.measurement.U1 u12) {
        if (u12 == null) {
            return "null";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("\nproperty_filter {\n");
        if (u12.M()) {
            Y(sb, 0, "filter_id", Integer.valueOf(u12.j()));
        }
        Y(sb, 0, "property_name", e().g(u12.I()));
        String strL = L(u12.J(), u12.K(), u12.L());
        if (!strL.isEmpty()) {
            Y(sb, 0, "filter_type", strL);
        }
        V(sb, 1, u12.F());
        sb.append("}\n");
        return sb.toString();
    }

    final String K(C1234w2 c1234w2) {
        C1173p2 c1173p2T2;
        if (c1234w2 == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("\nbatch {\n");
        if (y7.a() && b().r(G.f15570y0) && c1234w2.j() > 0) {
            h();
            if (d6.F0(c1234w2.F(0).x2())) {
                if (c1234w2.R()) {
                    Y(sb, 0, "upload_subdomain", c1234w2.O());
                }
                if (c1234w2.Q()) {
                    Y(sb, 0, "sgtm_join_id", c1234w2.N());
                }
            }
        }
        for (C1242x2 c1242x2 : c1234w2.P()) {
            if (c1242x2 != null) {
                U(sb, 1);
                sb.append("bundle {\n");
                if (c1242x2.R0()) {
                    Y(sb, 1, "protocol_version", Integer.valueOf(c1242x2.w1()));
                }
                if (C1204s7.a() && b().D(c1242x2.x2(), G.f15568x0) && c1242x2.U0()) {
                    Y(sb, 1, "session_stitching_token", c1242x2.h0());
                }
                Y(sb, 1, "platform", c1242x2.f0());
                if (c1242x2.M0()) {
                    Y(sb, 1, "gmp_version", Long.valueOf(c1242x2.f2()));
                }
                if (c1242x2.Z0()) {
                    Y(sb, 1, "uploading_gmp_version", Long.valueOf(c1242x2.r2()));
                }
                if (c1242x2.K0()) {
                    Y(sb, 1, "dynamite_version", Long.valueOf(c1242x2.Y1()));
                }
                if (c1242x2.C0()) {
                    Y(sb, 1, "config_version", Long.valueOf(c1242x2.Q1()));
                }
                Y(sb, 1, "gmp_app_id", c1242x2.c0());
                Y(sb, 1, "admob_app_id", c1242x2.w2());
                Y(sb, 1, "app_id", c1242x2.x2());
                Y(sb, 1, "app_version", c1242x2.U());
                if (c1242x2.r0()) {
                    Y(sb, 1, "app_version_major", Integer.valueOf(c1242x2.t0()));
                }
                Y(sb, 1, "firebase_instance_id", c1242x2.b0());
                if (c1242x2.I0()) {
                    Y(sb, 1, "dev_cert_hash", Long.valueOf(c1242x2.U1()));
                }
                Y(sb, 1, "app_store", c1242x2.T());
                if (c1242x2.Y0()) {
                    Y(sb, 1, "upload_timestamp_millis", Long.valueOf(c1242x2.p2()));
                }
                if (c1242x2.V0()) {
                    Y(sb, 1, "start_timestamp_millis", Long.valueOf(c1242x2.l2()));
                }
                if (c1242x2.L0()) {
                    Y(sb, 1, "end_timestamp_millis", Long.valueOf(c1242x2.c2()));
                }
                if (c1242x2.Q0()) {
                    Y(sb, 1, "previous_bundle_start_timestamp_millis", Long.valueOf(c1242x2.j2()));
                }
                if (c1242x2.P0()) {
                    Y(sb, 1, "previous_bundle_end_timestamp_millis", Long.valueOf(c1242x2.h2()));
                }
                Y(sb, 1, "app_instance_id", c1242x2.S());
                Y(sb, 1, "resettable_device_id", c1242x2.g0());
                Y(sb, 1, "ds_id", c1242x2.Z());
                if (c1242x2.O0()) {
                    Y(sb, 1, "limited_ad_tracking", Boolean.valueOf(c1242x2.o0()));
                }
                Y(sb, 1, "os_version", c1242x2.e0());
                Y(sb, 1, "device_model", c1242x2.Y());
                Y(sb, 1, "user_default_language", c1242x2.i0());
                if (c1242x2.X0()) {
                    Y(sb, 1, "time_zone_offset_minutes", Integer.valueOf(c1242x2.G1()));
                }
                if (c1242x2.B0()) {
                    Y(sb, 1, "bundle_sequential_index", Integer.valueOf(c1242x2.a1()));
                }
                if (y7.a()) {
                    h();
                    if (d6.F0(c1242x2.x2()) && b().r(G.f15570y0) && c1242x2.G0()) {
                        Y(sb, 1, "delivery_index", Integer.valueOf(c1242x2.j1()));
                    }
                }
                if (c1242x2.T0()) {
                    Y(sb, 1, "service_upload", Boolean.valueOf(c1242x2.p0()));
                }
                Y(sb, 1, "health_monitor", c1242x2.d0());
                if (c1242x2.S0()) {
                    Y(sb, 1, "retry_counter", Integer.valueOf(c1242x2.B1()));
                }
                if (c1242x2.E0()) {
                    Y(sb, 1, "consent_signals", c1242x2.W());
                }
                if (c1242x2.N0()) {
                    Y(sb, 1, "is_dma_region", Boolean.valueOf(c1242x2.n0()));
                }
                if (c1242x2.F0()) {
                    Y(sb, 1, "core_platform_services", c1242x2.X());
                }
                if (c1242x2.D0()) {
                    Y(sb, 1, "consent_diagnostics", c1242x2.V());
                }
                if (c1242x2.W0()) {
                    Y(sb, 1, "target_os_version", Long.valueOf(c1242x2.n2()));
                }
                if (C1195r7.a() && b().D(c1242x2.x2(), G.f15473I0)) {
                    Y(sb, 1, "ad_services_version", Integer.valueOf(c1242x2.j()));
                    if (c1242x2.s0() && (c1173p2T2 = c1242x2.t2()) != null) {
                        U(sb, 2);
                        sb.append("attribution_eligibility_status {\n");
                        Y(sb, 2, "eligible", Boolean.valueOf(c1173p2T2.P()));
                        Y(sb, 2, "no_access_adservices_attribution_permission", Boolean.valueOf(c1173p2T2.S()));
                        Y(sb, 2, "pre_r", Boolean.valueOf(c1173p2T2.T()));
                        Y(sb, 2, "r_extensions_too_old", Boolean.valueOf(c1173p2T2.U()));
                        Y(sb, 2, "adservices_extension_too_old", Boolean.valueOf(c1173p2T2.N()));
                        Y(sb, 2, "ad_storage_not_allowed", Boolean.valueOf(c1173p2T2.L()));
                        Y(sb, 2, "measurement_manager_disabled", Boolean.valueOf(c1173p2T2.R()));
                        U(sb, 2);
                        sb.append("}\n");
                    }
                }
                if (Y6.a() && b().r(G.f15499V0) && c1242x2.q0()) {
                    C1155n2 c1155n2S2 = c1242x2.s2();
                    U(sb, 2);
                    sb.append("ad_campaign_info {\n");
                    if (c1155n2S2.g0()) {
                        Y(sb, 2, "deep_link_gclid", c1155n2S2.Z());
                    }
                    if (c1155n2S2.f0()) {
                        Y(sb, 2, "deep_link_gbraid", c1155n2S2.Y());
                    }
                    if (c1155n2S2.e0()) {
                        Y(sb, 2, "deep_link_gad_source", c1155n2S2.V());
                    }
                    if (c1155n2S2.h0()) {
                        Y(sb, 2, "deep_link_session_millis", Long.valueOf(c1155n2S2.E()));
                    }
                    if (c1155n2S2.l0()) {
                        Y(sb, 2, "market_referrer_gclid", c1155n2S2.d0());
                    }
                    if (c1155n2S2.k0()) {
                        Y(sb, 2, "market_referrer_gbraid", c1155n2S2.c0());
                    }
                    if (c1155n2S2.j0()) {
                        Y(sb, 2, "market_referrer_gad_source", c1155n2S2.b0());
                    }
                    if (c1155n2S2.i0()) {
                        Y(sb, 2, "market_referrer_click_millis", Long.valueOf(c1155n2S2.I()));
                    }
                    U(sb, 2);
                    sb.append("}\n");
                }
                List<com.google.android.gms.internal.measurement.B2> listL0 = c1242x2.l0();
                if (listL0 != null) {
                    for (com.google.android.gms.internal.measurement.B2 b22 : listL0) {
                        if (b22 != null) {
                            U(sb, 2);
                            sb.append("user_property {\n");
                            Y(sb, 2, "set_timestamp_millis", b22.X() ? Long.valueOf(b22.P()) : null);
                            Y(sb, 2, "name", e().g(b22.S()));
                            Y(sb, 2, "string_value", b22.T());
                            Y(sb, 2, "int_value", b22.W() ? Long.valueOf(b22.N()) : null);
                            Y(sb, 2, "double_value", b22.U() ? Double.valueOf(b22.E()) : null);
                            U(sb, 2);
                            sb.append("}\n");
                        }
                    }
                }
                List<C1182q2> listJ0 = c1242x2.j0();
                c1242x2.x2();
                if (listJ0 != null) {
                    for (C1182q2 c1182q2 : listJ0) {
                        if (c1182q2 != null) {
                            U(sb, 2);
                            sb.append("audience_membership {\n");
                            if (c1182q2.N()) {
                                Y(sb, 2, "audience_id", Integer.valueOf(c1182q2.j()));
                            }
                            if (c1182q2.O()) {
                                Y(sb, 2, "new_audience", Boolean.valueOf(c1182q2.M()));
                            }
                            X(sb, 2, "current_data", c1182q2.K());
                            if (c1182q2.P()) {
                                X(sb, 2, "previous_data", c1182q2.L());
                            }
                            U(sb, 2);
                            sb.append("}\n");
                        }
                    }
                }
                List<C1199s2> listK0 = c1242x2.k0();
                if (listK0 != null) {
                    for (C1199s2 c1199s2 : listK0) {
                        if (c1199s2 != null) {
                            U(sb, 2);
                            sb.append("event {\n");
                            Y(sb, 2, "name", e().c(c1199s2.S()));
                            if (c1199s2.W()) {
                                Y(sb, 2, "timestamp_millis", Long.valueOf(c1199s2.P()));
                            }
                            if (c1199s2.V()) {
                                Y(sb, 2, "previous_timestamp_millis", Long.valueOf(c1199s2.O()));
                            }
                            if (c1199s2.U()) {
                                Y(sb, 2, "count", Integer.valueOf(c1199s2.j()));
                            }
                            if (c1199s2.M() != 0) {
                                Z(sb, 2, c1199s2.T());
                            }
                            U(sb, 2);
                            sb.append("}\n");
                        }
                    }
                }
                U(sb, 1);
                sb.append("}\n");
            }
        }
        sb.append("} // End-of-batch\n");
        return sb.toString();
    }

    final List N(List list, List list2) {
        int i7;
        ArrayList arrayList = new ArrayList(list);
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            if (num.intValue() < 0) {
                d().J().b("Ignoring negative bit index to be cleared", num);
            } else {
                int iIntValue = num.intValue() / 64;
                if (iIntValue >= arrayList.size()) {
                    d().J().c("Ignoring bit index greater than bitSet size", num, Integer.valueOf(arrayList.size()));
                } else {
                    arrayList.set(iIntValue, Long.valueOf(((Long) arrayList.get(iIntValue)).longValue() & (~(1 << (num.intValue() % 64)))));
                }
            }
        }
        int size = arrayList.size();
        int size2 = arrayList.size() - 1;
        while (true) {
            int i8 = size2;
            i7 = size;
            size = i8;
            if (size < 0 || ((Long) arrayList.get(size)).longValue() != 0) {
                break;
            }
            size2 = size - 1;
        }
        return arrayList.subList(0, i7);
    }

    final Map O(Bundle bundle, boolean z6) {
        HashMap map = new HashMap();
        for (String str : bundle.keySet()) {
            Object obj = bundle.get(str);
            boolean z7 = obj instanceof Parcelable[];
            if (z7 || (obj instanceof ArrayList) || (obj instanceof Bundle)) {
                if (z6) {
                    ArrayList arrayList = new ArrayList();
                    if (z7) {
                        for (Parcelable parcelable : (Parcelable[]) obj) {
                            if (parcelable instanceof Bundle) {
                                arrayList.add(O((Bundle) parcelable, false));
                            }
                        }
                    } else if (obj instanceof ArrayList) {
                        ArrayList arrayList2 = (ArrayList) obj;
                        int size = arrayList2.size();
                        int i7 = 0;
                        while (i7 < size) {
                            Object obj2 = arrayList2.get(i7);
                            i7++;
                            if (obj2 instanceof Bundle) {
                                arrayList.add(O((Bundle) obj2, false));
                            }
                        }
                    } else if (obj instanceof Bundle) {
                        arrayList.add(O((Bundle) obj, false));
                    }
                    map.put(str, arrayList);
                }
            } else if (obj != null) {
                map.put(str, obj);
            }
        }
        return map;
    }

    final void S(C1217u2.a aVar, Object obj) {
        Preconditions.checkNotNull(obj);
        aVar.E().C().A().D();
        if (obj instanceof String) {
            aVar.B((String) obj);
            return;
        }
        if (obj instanceof Long) {
            aVar.v(((Long) obj).longValue());
            return;
        }
        if (obj instanceof Double) {
            aVar.u(((Double) obj).doubleValue());
            return;
        }
        if (!(obj instanceof Bundle[])) {
            d().E().b("Ignoring invalid (type) event param value", obj);
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (Bundle bundle : (Bundle[]) obj) {
            if (bundle != null) {
                C1217u2.a aVarS = C1217u2.S();
                for (String str : bundle.keySet()) {
                    C1217u2.a aVarZ = C1217u2.S().z(str);
                    Object obj2 = bundle.get(str);
                    if (obj2 instanceof Long) {
                        aVarZ.v(((Long) obj2).longValue());
                    } else if (obj2 instanceof String) {
                        aVarZ.B((String) obj2);
                    } else if (obj2 instanceof Double) {
                        aVarZ.u(((Double) obj2).doubleValue());
                    }
                    aVarS.x(aVarZ);
                }
                if (aVarS.t() > 0) {
                    arrayList.add((C1217u2) ((AbstractC1260z4) aVarS.p()));
                }
            }
        }
        aVar.y(arrayList);
    }

    final void T(B2.a aVar, Object obj) {
        Preconditions.checkNotNull(obj);
        aVar.B().y().t();
        if (obj instanceof String) {
            aVar.A((String) obj);
            return;
        }
        if (obj instanceof Long) {
            aVar.v(((Long) obj).longValue());
        } else if (obj instanceof Double) {
            aVar.u(((Double) obj).doubleValue());
        } else {
            d().E().b("Ignoring invalid (type) user attribute value", obj);
        }
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC1512w3, com.google.android.gms.measurement.internal.InterfaceC1526y3
    public final /* bridge */ /* synthetic */ Context a() {
        return super.a();
    }

    final boolean a0(long j7, long j8) {
        return j7 == 0 || j8 <= 0 || Math.abs(zzb().currentTimeMillis() - j7) > j8;
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC1512w3
    public final /* bridge */ /* synthetic */ C1397g b() {
        return super.b();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC1512w3
    public final /* bridge */ /* synthetic */ C1515x c() {
        return super.c();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC1512w3, com.google.android.gms.measurement.internal.InterfaceC1526y3
    public final /* bridge */ /* synthetic */ C1449n2 d() {
        return super.d();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC1512w3
    public final /* bridge */ /* synthetic */ C1407h2 e() {
        return super.e();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC1512w3, com.google.android.gms.measurement.internal.InterfaceC1526y3
    public final /* bridge */ /* synthetic */ P2 f() {
        return super.f();
    }

    final byte[] f0(byte[] bArr) throws IOException {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            gZIPOutputStream.write(bArr);
            gZIPOutputStream.close();
            byteArrayOutputStream.close();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e7) {
            d().E().b("Failed to gzip content", e7);
            throw e7;
        }
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC1512w3
    public final /* bridge */ /* synthetic */ C1532z2 g() {
        return super.g();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC1512w3
    public final /* bridge */ /* synthetic */ d6 h() {
        return super.h();
    }

    final byte[] h0(byte[] bArr) throws IOException {
        try {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
            GZIPInputStream gZIPInputStream = new GZIPInputStream(byteArrayInputStream);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] bArr2 = new byte[1024];
            while (true) {
                int i7 = gZIPInputStream.read(bArr2);
                if (i7 <= 0) {
                    gZIPInputStream.close();
                    byteArrayInputStream.close();
                    return byteArrayOutputStream.toByteArray();
                }
                byteArrayOutputStream.write(bArr2, 0, i7);
            }
        } catch (IOException e7) {
            d().E().b("Failed to ungzip content", e7);
            throw e7;
        }
    }

    final List i0() {
        Map mapE = G.e(this.f15455b.a());
        if (mapE == null || mapE.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int iIntValue = ((Integer) G.f15492S.a(null)).intValue();
        for (Map.Entry entry : mapE.entrySet()) {
            if (((String) entry.getKey()).startsWith("measurement.id.")) {
                try {
                    int i7 = Integer.parseInt((String) entry.getValue());
                    if (i7 != 0) {
                        arrayList.add(Integer.valueOf(i7));
                        if (arrayList.size() >= iIntValue) {
                            d().J().b("Too many experiment IDs. Number of IDs", Integer.valueOf(arrayList.size()));
                            break;
                        }
                        continue;
                    } else {
                        continue;
                    }
                } catch (NumberFormatException e7) {
                    d().J().b("Experiment ID NumberFormatException", e7);
                }
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return arrayList;
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC1512w3
    public final /* bridge */ /* synthetic */ void j() {
        super.j();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC1512w3
    public final /* bridge */ /* synthetic */ void k() {
        super.k();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC1512w3
    public final /* bridge */ /* synthetic */ void l() {
        super.l();
    }

    @Override // com.google.android.gms.measurement.internal.F5
    public final /* bridge */ /* synthetic */ Z5 m() {
        return super.m();
    }

    @Override // com.google.android.gms.measurement.internal.F5
    public final /* bridge */ /* synthetic */ h6 n() {
        return super.n();
    }

    @Override // com.google.android.gms.measurement.internal.F5
    public final /* bridge */ /* synthetic */ C1425k o() {
        return super.o();
    }

    @Override // com.google.android.gms.measurement.internal.F5
    public final /* bridge */ /* synthetic */ I2 p() {
        return super.p();
    }

    @Override // com.google.android.gms.measurement.internal.F5
    public final /* bridge */ /* synthetic */ C1424j5 q() {
        return super.q();
    }

    @Override // com.google.android.gms.measurement.internal.F5
    public final /* bridge */ /* synthetic */ G5 r() {
        return super.r();
    }

    @Override // com.google.android.gms.measurement.internal.E5
    protected final boolean v() {
        return false;
    }

    final long x(String str) {
        if (TextUtils.isEmpty(str)) {
            return 0L;
        }
        return y(str.getBytes(Charset.forName("UTF-8")));
    }

    final long y(byte[] bArr) {
        Preconditions.checkNotNull(bArr);
        h().l();
        MessageDigest messageDigestT0 = d6.T0();
        if (messageDigestT0 != null) {
            return d6.z(messageDigestT0.digest(bArr));
        }
        d().E().a("Failed to get MD5");
        return 0L;
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC1512w3, com.google.android.gms.measurement.internal.InterfaceC1526y3
    public final /* bridge */ /* synthetic */ Clock zzb() {
        return super.zzb();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC1512w3, com.google.android.gms.measurement.internal.InterfaceC1526y3
    public final /* bridge */ /* synthetic */ C1369c zzd() {
        return super.zzd();
    }
}
