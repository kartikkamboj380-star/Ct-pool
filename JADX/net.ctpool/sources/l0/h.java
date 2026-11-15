package l0;

/* JADX INFO: loaded from: classes.dex */
public abstract class h {

    class a extends h {
        a() {
        }

        @Override // l0.h
        public g a(String str) {
            return null;
        }
    }

    public static h c() {
        return new a();
    }

    public abstract g a(String str);

    public final g b(String str) {
        g gVarA = a(str);
        return gVarA == null ? g.a(str) : gVarA;
    }
}
