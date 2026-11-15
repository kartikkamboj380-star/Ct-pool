package b4;

/* JADX INFO: loaded from: classes.dex */
public class w implements D4.b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Object f9723c = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private volatile Object f9724a = f9723c;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile D4.b f9725b;

    public w(D4.b bVar) {
        this.f9725b = bVar;
    }

    @Override // D4.b
    public Object get() {
        Object obj = this.f9724a;
        Object obj2 = f9723c;
        if (obj == obj2) {
            synchronized (this) {
                try {
                    obj = this.f9724a;
                    if (obj == obj2) {
                        obj = this.f9725b.get();
                        this.f9724a = obj;
                        this.f9725b = null;
                    }
                } finally {
                }
            }
        }
        return obj;
    }
}
