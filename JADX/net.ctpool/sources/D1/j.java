package D1;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class j implements i {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final int f991m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final int f992n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final int f993o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final l f994p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final Map f995q;

    public j(int i7, int i8, int i9, l lVar, Map map) {
        this.f991m = i7;
        this.f992n = i8;
        this.f993o = i9;
        this.f994p = lVar;
        this.f995q = map;
    }

    @Override // D1.h, o1.InterfaceC1940a
    public Map getExtras() {
        return this.f995q;
    }

    @Override // D1.i
    public int getHeight() {
        return this.f992n;
    }

    @Override // D1.i
    public int getWidth() {
        return this.f991m;
    }
}
