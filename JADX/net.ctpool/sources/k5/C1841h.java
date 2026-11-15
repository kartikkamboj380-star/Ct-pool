package k5;

import j5.AbstractC1800e;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;
import w5.k;
import x5.InterfaceC2228b;

/* JADX INFO: renamed from: k5.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1841h extends AbstractC1800e implements Set, Serializable, InterfaceC2228b {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final a f21008n = new a(null);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final C1841h f21009o = new C1841h(C1837d.f20985z.e());

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final C1837d f21010m;

    /* JADX INFO: renamed from: k5.h$a */
    private static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public C1841h() {
        this(new C1837d());
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean add(Object obj) {
        return this.f21010m.j(obj) >= 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean addAll(Collection collection) {
        k.f(collection, "elements");
        this.f21010m.m();
        return super.addAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        this.f21010m.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return this.f21010m.containsKey(obj);
    }

    @Override // j5.AbstractC1800e
    public int f() {
        return this.f21010m.size();
    }

    public final Set h() {
        this.f21010m.l();
        return size() > 0 ? this : f21009o;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean isEmpty() {
        return this.f21010m.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator iterator() {
        return this.f21010m.D();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        return this.f21010m.L(obj) >= 0;
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean removeAll(Collection collection) {
        k.f(collection, "elements");
        this.f21010m.m();
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean retainAll(Collection collection) {
        k.f(collection, "elements");
        this.f21010m.m();
        return super.retainAll(collection);
    }

    public C1841h(C1837d c1837d) {
        k.f(c1837d, "backing");
        this.f21010m = c1837d;
    }
}
