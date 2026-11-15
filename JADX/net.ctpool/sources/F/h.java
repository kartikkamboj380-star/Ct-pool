package F;

import C.k;
import E.f;
import E.h;
import F.d;
import androidx.datastore.preferences.protobuf.AbstractC0627w;
import i5.u;
import j5.AbstractC1809n;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.Map;
import java.util.Set;
import m5.InterfaceC1885d;

/* JADX INFO: loaded from: classes.dex */
public final class h implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final h f1066a = new h();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f1067b = "preferences_pb";

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f1068a;

        static {
            int[] iArr = new int[h.b.values().length];
            iArr[h.b.BOOLEAN.ordinal()] = 1;
            iArr[h.b.FLOAT.ordinal()] = 2;
            iArr[h.b.DOUBLE.ordinal()] = 3;
            iArr[h.b.INTEGER.ordinal()] = 4;
            iArr[h.b.LONG.ordinal()] = 5;
            iArr[h.b.STRING.ordinal()] = 6;
            iArr[h.b.STRING_SET.ordinal()] = 7;
            iArr[h.b.VALUE_NOT_SET.ordinal()] = 8;
            f1068a = iArr;
        }
    }

    private h() {
    }

    private final void d(String str, E.h hVar, F.a aVar) throws C.a {
        d.a aVarA;
        Object objValueOf;
        h.b bVarW = hVar.W();
        switch (bVarW == null ? -1 : a.f1068a[bVarW.ordinal()]) {
            case -1:
                throw new C.a("Value case is null.", null, 2, null);
            case 0:
            default:
                throw new i5.k();
            case 1:
                aVarA = f.a(str);
                objValueOf = Boolean.valueOf(hVar.O());
                break;
            case 2:
                aVarA = f.c(str);
                objValueOf = Float.valueOf(hVar.R());
                break;
            case 3:
                aVarA = f.b(str);
                objValueOf = Double.valueOf(hVar.Q());
                break;
            case 4:
                aVarA = f.d(str);
                objValueOf = Integer.valueOf(hVar.S());
                break;
            case 5:
                aVarA = f.e(str);
                objValueOf = Long.valueOf(hVar.T());
                break;
            case 6:
                aVarA = f.f(str);
                objValueOf = hVar.U();
                w5.k.e(objValueOf, "value.string");
                break;
            case 7:
                aVarA = f.g(str);
                List listL = hVar.V().L();
                w5.k.e(listL, "value.stringSet.stringsList");
                objValueOf = AbstractC1809n.e0(listL);
                break;
            case 8:
                throw new C.a("Value not set.", null, 2, null);
        }
        aVar.i(aVarA, objValueOf);
    }

    private final E.h g(Object obj) {
        AbstractC0627w abstractC0627wL;
        String str;
        if (obj instanceof Boolean) {
            abstractC0627wL = E.h.X().v(((Boolean) obj).booleanValue()).l();
            str = "newBuilder().setBoolean(value).build()";
        } else if (obj instanceof Float) {
            abstractC0627wL = E.h.X().y(((Number) obj).floatValue()).l();
            str = "newBuilder().setFloat(value).build()";
        } else if (obj instanceof Double) {
            abstractC0627wL = E.h.X().x(((Number) obj).doubleValue()).l();
            str = "newBuilder().setDouble(value).build()";
        } else if (obj instanceof Integer) {
            abstractC0627wL = E.h.X().z(((Number) obj).intValue()).l();
            str = "newBuilder().setInteger(value).build()";
        } else if (obj instanceof Long) {
            abstractC0627wL = E.h.X().A(((Number) obj).longValue()).l();
            str = "newBuilder().setLong(value).build()";
        } else if (obj instanceof String) {
            abstractC0627wL = E.h.X().B((String) obj).l();
            str = "newBuilder().setString(value).build()";
        } else {
            if (!(obj instanceof Set)) {
                throw new IllegalStateException(w5.k.m("PreferencesSerializer does not support type: ", obj.getClass().getName()));
            }
            abstractC0627wL = E.h.X().C(E.g.M().v((Set) obj)).l();
            str = "newBuilder().setStringSet(\n                    StringSet.newBuilder().addAllStrings(value as Set<String>)\n                ).build()";
        }
        w5.k.e(abstractC0627wL, str);
        return (E.h) abstractC0627wL;
    }

    @Override // C.k
    public Object a(InputStream inputStream, InterfaceC1885d interfaceC1885d) throws C.a {
        E.f fVarA = E.d.f1016a.a(inputStream);
        F.a aVarB = e.b(new d.b[0]);
        Map mapJ = fVarA.J();
        w5.k.e(mapJ, "preferencesProto.preferencesMap");
        for (Map.Entry entry : mapJ.entrySet()) {
            String str = (String) entry.getKey();
            E.h hVar = (E.h) entry.getValue();
            h hVar2 = f1066a;
            w5.k.e(str, "name");
            w5.k.e(hVar, "value");
            hVar2.d(str, hVar, aVarB);
        }
        return aVarB.d();
    }

    @Override // C.k
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public d b() {
        return e.a();
    }

    public final String f() {
        return f1067b;
    }

    @Override // C.k
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public Object c(d dVar, OutputStream outputStream, InterfaceC1885d interfaceC1885d) {
        Map mapA = dVar.a();
        f.a aVarM = E.f.M();
        for (Map.Entry entry : mapA.entrySet()) {
            aVarM.v(((d.a) entry.getKey()).a(), g(entry.getValue()));
        }
        ((E.f) aVarM.l()).k(outputStream);
        return u.f19985a;
    }
}
