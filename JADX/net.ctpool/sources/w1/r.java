package w1;

import w1.x;

/* JADX INFO: loaded from: classes.dex */
public abstract class r {

    class a implements D {
        a() {
        }

        @Override // w1.D
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public int a(R0.h hVar) {
            return hVar.size();
        }
    }

    public static n a(O0.o oVar, R0.d dVar, x.a aVar) {
        w wVar = new w(new a(), aVar, oVar, null, false, false);
        dVar.a(wVar);
        return wVar;
    }
}
