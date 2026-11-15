package Y0;

import O0.o;

/* JADX INFO: loaded from: classes.dex */
public abstract class d {

    class a implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Throwable f4409a;

        a(Throwable th) {
            this.f4409a = th;
        }

        @Override // O0.o
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public c get() {
            return d.b(this.f4409a);
        }
    }

    public static o a(Throwable th) {
        return new a(th);
    }

    public static c b(Throwable th) {
        i iVarX = i.x();
        iVarX.p(th);
        return iVarX;
    }
}
