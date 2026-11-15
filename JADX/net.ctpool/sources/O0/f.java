package O0;

import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: loaded from: classes.dex */
public class f extends ArrayList {
    private f(int i7) {
        super(i7);
    }

    public static f c(Object... objArr) {
        f fVar = new f(objArr.length);
        Collections.addAll(fVar, objArr);
        return fVar;
    }
}
