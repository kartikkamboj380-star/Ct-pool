package e5;

import java.util.Vector;

/* JADX INFO: renamed from: e5.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1640k extends Vector {
    public void c(Object obj) {
        addElement(obj);
    }

    public synchronized Object h() {
        if (size() == 0) {
            return null;
        }
        Object objElementAt = elementAt(0);
        removeElementAt(0);
        return objElementAt;
    }
}
