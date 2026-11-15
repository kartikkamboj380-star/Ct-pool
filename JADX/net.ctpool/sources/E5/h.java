package E5;

import java.util.Iterator;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes2.dex */
public abstract class h extends g {

    public static final class a implements d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Iterator f1047a;

        public a(Iterator it) {
            this.f1047a = it;
        }

        @Override // E5.d
        public Iterator iterator() {
            return this.f1047a;
        }
    }

    public static d a(Iterator it) {
        w5.k.f(it, "<this>");
        return b(new a(it));
    }

    public static final d b(d dVar) {
        w5.k.f(dVar, "<this>");
        return dVar instanceof E5.a ? dVar : new E5.a(dVar);
    }
}
