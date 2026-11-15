package androidx.datastore.preferences.protobuf;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
class C0626v implements N {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final C0626v f7817a = new C0626v();

    private C0626v() {
    }

    public static C0626v c() {
        return f7817a;
    }

    @Override // androidx.datastore.preferences.protobuf.N
    public M a(Class cls) {
        if (!AbstractC0627w.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Unsupported message type: " + cls.getName());
        }
        try {
            return (M) AbstractC0627w.s(cls.asSubclass(AbstractC0627w.class)).l();
        } catch (Exception e7) {
            throw new RuntimeException("Unable to get message info for " + cls.getName(), e7);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.N
    public boolean b(Class cls) {
        return AbstractC0627w.class.isAssignableFrom(cls);
    }
}
