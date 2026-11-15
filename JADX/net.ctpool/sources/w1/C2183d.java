package w1;

import java.util.LinkedHashSet;

/* JADX INFO: renamed from: w1.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2183d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f22614a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final LinkedHashSet f22615b;

    public C2183d(int i7) {
        this.f22614a = i7;
        this.f22615b = new LinkedHashSet(i7);
    }

    public final synchronized boolean a(Object obj) {
        try {
            if (this.f22615b.size() == this.f22614a) {
                LinkedHashSet linkedHashSet = this.f22615b;
                linkedHashSet.remove(linkedHashSet.iterator().next());
            }
            this.f22615b.remove(obj);
        } catch (Throwable th) {
            throw th;
        }
        return this.f22615b.add(obj);
    }

    public final synchronized boolean b(Object obj) {
        return this.f22615b.contains(obj);
    }
}
