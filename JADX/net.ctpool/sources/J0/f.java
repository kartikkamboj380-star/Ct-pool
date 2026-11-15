package J0;

import J0.i;

/* JADX INFO: loaded from: classes.dex */
public class f implements m {

    class a implements l {
        a() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(i.a aVar, i.a aVar2) {
            long jA = aVar.a();
            long jA2 = aVar2.a();
            if (jA < jA2) {
                return -1;
            }
            return jA2 == jA ? 0 : 1;
        }
    }

    @Override // J0.m
    public l get() {
        return new a();
    }
}
