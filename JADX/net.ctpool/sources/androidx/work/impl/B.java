package androidx.work.impl;

/* JADX INFO: loaded from: classes.dex */
public abstract class B {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f9264a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String[] f9265b;

    static {
        String strI = l0.i.i("WrkDbPathHelper");
        w5.k.e(strI, "tagWithPrefix(\"WrkDbPathHelper\")");
        f9264a = strI;
        f9265b = new String[]{"-journal", "-shm", "-wal"};
    }
}
