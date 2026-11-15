package j4;

import e4.C1629g;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f20390a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f20391b;

    public j(int i7) {
        this.f20391b = i7;
    }

    public List a() {
        List listB = b();
        ArrayList arrayList = new ArrayList();
        for (int i7 = 0; i7 < listB.size(); i7++) {
            arrayList.add(((i) listB.get(i7)).h());
        }
        return arrayList;
    }

    public synchronized List b() {
        return Collections.unmodifiableList(new ArrayList(this.f20390a));
    }

    public synchronized boolean c(List list) {
        this.f20390a.clear();
        if (list.size() <= this.f20391b) {
            return this.f20390a.addAll(list);
        }
        C1629g.f().k("Ignored 0 entries when adding rollout assignments. Maximum allowable: " + this.f20391b);
        return this.f20390a.addAll(list.subList(0, this.f20391b));
    }
}
