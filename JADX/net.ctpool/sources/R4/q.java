package R4;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public abstract class q {

    class a extends q {
        a() {
        }

        @Override // R4.q
        public Object b(Y4.a aVar) throws IOException {
            if (aVar.R0() != Y4.b.NULL) {
                return q.this.b(aVar);
            }
            aVar.B0();
            return null;
        }

        @Override // R4.q
        public void d(Y4.c cVar, Object obj) throws IOException {
            if (obj == null) {
                cVar.J();
            } else {
                q.this.d(cVar, obj);
            }
        }
    }

    public final q a() {
        return new a();
    }

    public abstract Object b(Y4.a aVar);

    public final f c(Object obj) {
        try {
            U4.f fVar = new U4.f();
            d(fVar, obj);
            return fVar.j1();
        } catch (IOException e7) {
            throw new g(e7);
        }
    }

    public abstract void d(Y4.c cVar, Object obj);
}
