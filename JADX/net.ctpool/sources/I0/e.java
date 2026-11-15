package I0;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class e {
    public static String a(d dVar) {
        try {
            return dVar instanceof f ? c((d) ((f) dVar).d().get(0)) : c(dVar);
        } catch (UnsupportedEncodingException e7) {
            throw new RuntimeException(e7);
        }
    }

    public static List b(d dVar) {
        ArrayList arrayList;
        try {
            if (dVar instanceof f) {
                List listD = ((f) dVar).d();
                arrayList = new ArrayList(listD.size());
                for (int i7 = 0; i7 < listD.size(); i7++) {
                    arrayList.add(c((d) listD.get(i7)));
                }
            } else {
                arrayList = new ArrayList(1);
                arrayList.add(dVar.b() ? dVar.c() : c(dVar));
            }
            return arrayList;
        } catch (UnsupportedEncodingException e7) {
            throw new RuntimeException(e7);
        }
    }

    private static String c(d dVar) {
        return W0.c.a(dVar.c().getBytes("UTF-8"));
    }
}
