package f1;

/* JADX INFO: renamed from: f1.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1647d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f19292a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f19293b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f19294c;

    public C1647d() {
        a();
    }

    public void a() {
        this.f19292a = false;
        this.f19293b = 4;
        c();
    }

    public void b() {
        this.f19294c++;
    }

    public void c() {
        this.f19294c = 0;
    }

    public void d(boolean z6) {
        this.f19292a = z6;
    }

    public boolean e() {
        return this.f19292a && this.f19294c < this.f19293b;
    }
}
