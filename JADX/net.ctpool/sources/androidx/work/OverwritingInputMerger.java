package androidx.work;

import androidx.work.b;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import l0.g;

/* JADX INFO: loaded from: classes.dex */
public final class OverwritingInputMerger extends g {
    @Override // l0.g
    public b b(List list) {
        b.a aVar = new b.a();
        HashMap map = new HashMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            map.putAll(((b) it.next()).l());
        }
        aVar.d(map);
        return aVar.a();
    }
}
