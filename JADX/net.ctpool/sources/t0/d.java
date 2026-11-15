package t0;

import j5.AbstractC1809n;
import java.util.Iterator;
import java.util.List;
import l0.i;
import q0.j;
import q0.o;
import q0.u;
import q0.x;
import q0.z;
import w5.k;

/* JADX INFO: loaded from: classes.dex */
public abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f22284a;

    static {
        String strI = i.i("DiagnosticsWrkr");
        k.e(strI, "tagWithPrefix(\"DiagnosticsWrkr\")");
        f22284a = strI;
    }

    private static final String c(u uVar, String str, Integer num, String str2) {
        return '\n' + uVar.f21795a + "\t " + uVar.f21797c + "\t " + num + "\t " + uVar.f21796b.name() + "\t " + str + "\t " + str2 + '\t';
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String d(o oVar, z zVar, j jVar, List list) {
        StringBuilder sb = new StringBuilder();
        sb.append("\n Id \t Class Name\t Job Id\t State\t Unique Name\t Tags\t");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            u uVar = (u) it.next();
            q0.i iVarE = jVar.e(x.a(uVar));
            sb.append(c(uVar, AbstractC1809n.O(oVar.b(uVar.f21795a), ",", null, null, 0, null, null, 62, null), iVarE != null ? Integer.valueOf(iVarE.f21770c) : null, AbstractC1809n.O(zVar.b(uVar.f21795a), ",", null, null, 0, null, null, 62, null)));
        }
        String string = sb.toString();
        k.e(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }
}
