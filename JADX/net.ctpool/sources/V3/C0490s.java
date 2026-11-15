package V3;

import V3.AbstractC0488p;
import V3.AbstractC0489q;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: V3.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0490s extends AbstractC0489q implements A {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final transient r f4144o;

    /* JADX INFO: renamed from: V3.s$a */
    public static final class a extends AbstractC0489q.a {
        public C0490s a() {
            Collection collectionEntrySet = this.f4140a.entrySet();
            Comparator comparator = this.f4141b;
            if (comparator != null) {
                collectionEntrySet = G.a(comparator).d().b(collectionEntrySet);
            }
            return C0490s.d(collectionEntrySet, this.f4142c);
        }
    }

    C0490s(AbstractC0488p abstractC0488p, int i7, Comparator comparator) {
        super(abstractC0488p, i7);
        this.f4144o = c(comparator);
    }

    private static r c(Comparator comparator) {
        return comparator == null ? r.s() : AbstractC0491t.E(comparator);
    }

    static C0490s d(Collection collection, Comparator comparator) {
        if (collection.isEmpty()) {
            return e();
        }
        AbstractC0488p.a aVar = new AbstractC0488p.a(collection.size());
        Iterator it = collection.iterator();
        int size = 0;
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Object key = entry.getKey();
            r rVarF = f(comparator, (Collection) entry.getValue());
            if (!rVarF.isEmpty()) {
                aVar.e(key, rVarF);
                size += rVarF.size();
            }
        }
        return new C0490s(aVar.b(), size, comparator);
    }

    public static C0490s e() {
        return C0484l.f4115p;
    }

    private static r f(Comparator comparator, Collection collection) {
        return comparator == null ? r.p(collection) : AbstractC0491t.A(comparator, collection);
    }
}
