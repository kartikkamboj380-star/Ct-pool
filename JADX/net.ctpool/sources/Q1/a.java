package Q1;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f2745a = new a();

    private a() {
    }

    public static final int a(int i7, Object obj) {
        return (i7 * 31) + (obj != null ? obj.hashCode() : 0);
    }
}
