package androidx.datastore.preferences.protobuf;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes.dex */
public class C extends AbstractC0608c implements D, RandomAccess {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final C f7520o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final D f7521p;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final List f7522n;

    static {
        C c7 = new C();
        f7520o = c7;
        c7.z();
        f7521p = c7;
    }

    public C() {
        this(10);
    }

    private static String h(Object obj) {
        return obj instanceof String ? (String) obj : obj instanceof AbstractC0612g ? ((AbstractC0612g) obj).x() : AbstractC0629y.j((byte[]) obj);
    }

    @Override // androidx.datastore.preferences.protobuf.D
    public D M0() {
        return b1() ? new o0(this) : this;
    }

    @Override // androidx.datastore.preferences.protobuf.D
    public Object R0(int i7) {
        return this.f7522n.get(i7);
    }

    @Override // androidx.datastore.preferences.protobuf.D
    public void W(AbstractC0612g abstractC0612g) {
        c();
        this.f7522n.add(abstractC0612g);
        ((AbstractList) this).modCount++;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0608c, java.util.AbstractList, java.util.List
    public boolean addAll(int i7, Collection collection) {
        c();
        if (collection instanceof D) {
            collection = ((D) collection).h0();
        }
        boolean zAddAll = this.f7522n.addAll(i7, collection);
        ((AbstractList) this).modCount++;
        return zAddAll;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0608c, androidx.datastore.preferences.protobuf.AbstractC0629y.b
    public /* bridge */ /* synthetic */ boolean b1() {
        return super.b1();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0608c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        c();
        this.f7522n.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0608c, java.util.AbstractList, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public void add(int i7, String str) {
        c();
        this.f7522n.add(i7, str);
        ((AbstractList) this).modCount++;
    }

    @Override // androidx.datastore.preferences.protobuf.D
    public List h0() {
        return Collections.unmodifiableList(this.f7522n);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0608c, java.util.AbstractList, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public String get(int i7) {
        Object obj = this.f7522n.get(i7);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof AbstractC0612g) {
            AbstractC0612g abstractC0612g = (AbstractC0612g) obj;
            String strX = abstractC0612g.x();
            if (abstractC0612g.p()) {
                this.f7522n.set(i7, strX);
            }
            return strX;
        }
        byte[] bArr = (byte[]) obj;
        String strJ = AbstractC0629y.j(bArr);
        if (AbstractC0629y.g(bArr)) {
            this.f7522n.set(i7, strJ);
        }
        return strJ;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0629y.b
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public C J(int i7) {
        if (i7 < size()) {
            throw new IllegalArgumentException();
        }
        ArrayList arrayList = new ArrayList(i7);
        arrayList.addAll(this.f7522n);
        return new C(arrayList);
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public String remove(int i7) {
        c();
        Object objRemove = this.f7522n.remove(i7);
        ((AbstractList) this).modCount++;
        return h(objRemove);
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public String set(int i7, String str) {
        c();
        return h(this.f7522n.set(i7, str));
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0608c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean removeAll(Collection collection) {
        return super.removeAll(collection);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0608c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean retainAll(Collection collection) {
        return super.retainAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f7522n.size();
    }

    public C(int i7) {
        this(new ArrayList(i7));
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0608c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection collection) {
        return addAll(size(), collection);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0608c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean remove(Object obj) {
        return super.remove(obj);
    }

    private C(ArrayList arrayList) {
        this.f7522n = arrayList;
    }
}
