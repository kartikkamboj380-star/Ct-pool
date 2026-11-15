package P3;

/* JADX INFO: loaded from: classes.dex */
public abstract class d {

    public static abstract class a {
        public abstract d a();

        public abstract a b(boolean z6);
    }

    public static d c(int i7) {
        return d(i7).a();
    }

    public static a d(int i7) {
        y yVar = new y();
        yVar.c(i7);
        yVar.b(false);
        return yVar;
    }

    public abstract boolean a();

    public abstract int b();
}
