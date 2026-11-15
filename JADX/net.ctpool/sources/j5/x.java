package j5;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes.dex */
public abstract class x extends w {

    public static final class a implements E5.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Iterable f20429a;

        public a(Iterable iterable) {
            this.f20429a = iterable;
        }

        @Override // E5.d
        public Iterator iterator() {
            return this.f20429a.iterator();
        }
    }

    public static E5.d C(Iterable iterable) {
        w5.k.f(iterable, "<this>");
        return new a(iterable);
    }

    public static boolean D(Iterable iterable, Object obj) {
        w5.k.f(iterable, "<this>");
        return iterable instanceof Collection ? ((Collection) iterable).contains(obj) : K(iterable, obj) >= 0;
    }

    public static List E(List list, int i7) {
        w5.k.f(list, "<this>");
        if (i7 >= 0) {
            return Y(list, C5.g.c(list.size() - i7, 0));
        }
        throw new IllegalArgumentException(("Requested element count " + i7 + " is less than zero.").toString());
    }

    public static List F(Iterable iterable) {
        w5.k.f(iterable, "<this>");
        return (List) AbstractC1809n.G(iterable, new ArrayList());
    }

    public static Collection G(Iterable iterable, Collection collection) {
        w5.k.f(iterable, "<this>");
        w5.k.f(collection, "destination");
        for (Object obj : iterable) {
            if (obj != null) {
                collection.add(obj);
            }
        }
        return collection;
    }

    public static final Object H(Iterable iterable) {
        w5.k.f(iterable, "<this>");
        if (iterable instanceof List) {
            return AbstractC1809n.I((List) iterable);
        }
        Iterator it = iterable.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        throw new NoSuchElementException("Collection is empty.");
    }

    public static Object I(List list) {
        w5.k.f(list, "<this>");
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.get(0);
    }

    public static Object J(List list) {
        w5.k.f(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    public static final int K(Iterable iterable, Object obj) {
        w5.k.f(iterable, "<this>");
        if (iterable instanceof List) {
            return ((List) iterable).indexOf(obj);
        }
        int i7 = 0;
        for (Object obj2 : iterable) {
            if (i7 < 0) {
                AbstractC1809n.p();
            }
            if (w5.k.b(obj, obj2)) {
                return i7;
            }
            i7++;
        }
        return -1;
    }

    public static final Appendable L(Iterable iterable, Appendable appendable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i7, CharSequence charSequence4, v5.l lVar) throws IOException {
        w5.k.f(iterable, "<this>");
        w5.k.f(appendable, "buffer");
        w5.k.f(charSequence, "separator");
        w5.k.f(charSequence2, "prefix");
        w5.k.f(charSequence3, "postfix");
        w5.k.f(charSequence4, "truncated");
        appendable.append(charSequence2);
        int i8 = 0;
        for (Object obj : iterable) {
            i8++;
            if (i8 > 1) {
                appendable.append(charSequence);
            }
            if (i7 >= 0 && i8 > i7) {
                break;
            }
            F5.g.a(appendable, obj, lVar);
        }
        if (i7 >= 0 && i8 > i7) {
            appendable.append(charSequence4);
        }
        appendable.append(charSequence3);
        return appendable;
    }

    public static final String N(Iterable iterable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i7, CharSequence charSequence4, v5.l lVar) {
        w5.k.f(iterable, "<this>");
        w5.k.f(charSequence, "separator");
        w5.k.f(charSequence2, "prefix");
        w5.k.f(charSequence3, "postfix");
        w5.k.f(charSequence4, "truncated");
        String string = ((StringBuilder) L(iterable, new StringBuilder(), charSequence, charSequence2, charSequence3, i7, charSequence4, lVar)).toString();
        w5.k.e(string, "toString(...)");
        return string;
    }

    public static /* synthetic */ String O(Iterable iterable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i7, CharSequence charSequence4, v5.l lVar, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            charSequence = ", ";
        }
        CharSequence charSequence5 = (i8 & 2) != 0 ? "" : charSequence2;
        CharSequence charSequence6 = (i8 & 4) == 0 ? charSequence3 : "";
        if ((i8 & 8) != 0) {
            i7 = -1;
        }
        int i9 = i7;
        if ((i8 & 16) != 0) {
            charSequence4 = "...";
        }
        CharSequence charSequence7 = charSequence4;
        if ((i8 & 32) != 0) {
            lVar = null;
        }
        return N(iterable, charSequence, charSequence5, charSequence6, i9, charSequence7, lVar);
    }

    public static Object P(List list) {
        w5.k.f(list, "<this>");
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.get(AbstractC1809n.j(list));
    }

    public static Comparable Q(Iterable iterable) {
        w5.k.f(iterable, "<this>");
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        Comparable comparable = (Comparable) it.next();
        while (it.hasNext()) {
            Comparable comparable2 = (Comparable) it.next();
            if (comparable.compareTo(comparable2) > 0) {
                comparable = comparable2;
            }
        }
        return comparable;
    }

    public static List R(Collection collection, Iterable iterable) {
        w5.k.f(collection, "<this>");
        w5.k.f(iterable, "elements");
        if (!(iterable instanceof Collection)) {
            ArrayList arrayList = new ArrayList(collection);
            AbstractC1809n.t(arrayList, iterable);
            return arrayList;
        }
        Collection collection2 = (Collection) iterable;
        ArrayList arrayList2 = new ArrayList(collection.size() + collection2.size());
        arrayList2.addAll(collection);
        arrayList2.addAll(collection2);
        return arrayList2;
    }

    public static List S(Collection collection, Object obj) {
        w5.k.f(collection, "<this>");
        ArrayList arrayList = new ArrayList(collection.size() + 1);
        arrayList.addAll(collection);
        arrayList.add(obj);
        return arrayList;
    }

    public static Object T(Iterable iterable) {
        w5.k.f(iterable, "<this>");
        if (iterable instanceof List) {
            return U((List) iterable);
        }
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException("Collection is empty.");
        }
        Object next = it.next();
        if (it.hasNext()) {
            throw new IllegalArgumentException("Collection has more than one element.");
        }
        return next;
    }

    public static final Object U(List list) {
        w5.k.f(list, "<this>");
        int size = list.size();
        if (size == 0) {
            throw new NoSuchElementException("List is empty.");
        }
        if (size == 1) {
            return list.get(0);
        }
        throw new IllegalArgumentException("List has more than one element.");
    }

    public static List V(List list, C5.c cVar) {
        w5.k.f(list, "<this>");
        w5.k.f(cVar, "indices");
        return cVar.isEmpty() ? AbstractC1809n.i() : AbstractC1809n.b0(list.subList(cVar.o().intValue(), cVar.n().intValue() + 1));
    }

    public static List W(Iterable iterable) {
        w5.k.f(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            List listC0 = c0(iterable);
            AbstractC1809n.r(listC0);
            return listC0;
        }
        Collection collection = (Collection) iterable;
        if (collection.size() <= 1) {
            return AbstractC1809n.b0(iterable);
        }
        Object[] array = collection.toArray(new Comparable[0]);
        AbstractC1806k.m((Comparable[]) array);
        return AbstractC1803h.c(array);
    }

    public static List X(Iterable iterable, Comparator comparator) {
        w5.k.f(iterable, "<this>");
        w5.k.f(comparator, "comparator");
        if (!(iterable instanceof Collection)) {
            List listC0 = c0(iterable);
            t.s(listC0, comparator);
            return listC0;
        }
        Collection collection = (Collection) iterable;
        if (collection.size() <= 1) {
            return AbstractC1809n.b0(iterable);
        }
        Object[] array = collection.toArray(new Object[0]);
        AbstractC1806k.n(array, comparator);
        return AbstractC1803h.c(array);
    }

    public static final List Y(Iterable iterable, int i7) {
        w5.k.f(iterable, "<this>");
        if (i7 < 0) {
            throw new IllegalArgumentException(("Requested element count " + i7 + " is less than zero.").toString());
        }
        if (i7 == 0) {
            return AbstractC1809n.i();
        }
        if (iterable instanceof Collection) {
            if (i7 >= ((Collection) iterable).size()) {
                return AbstractC1809n.b0(iterable);
            }
            if (i7 == 1) {
                return AbstractC1809n.d(H(iterable));
            }
        }
        ArrayList arrayList = new ArrayList(i7);
        Iterator it = iterable.iterator();
        int i8 = 0;
        while (it.hasNext()) {
            arrayList.add(it.next());
            i8++;
            if (i8 == i7) {
                break;
            }
        }
        return AbstractC1811p.n(arrayList);
    }

    public static final Collection Z(Iterable iterable, Collection collection) {
        w5.k.f(iterable, "<this>");
        w5.k.f(collection, "destination");
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            collection.add(it.next());
        }
        return collection;
    }

    public static int[] a0(Collection collection) {
        w5.k.f(collection, "<this>");
        int[] iArr = new int[collection.size()];
        Iterator it = collection.iterator();
        int i7 = 0;
        while (it.hasNext()) {
            iArr[i7] = ((Number) it.next()).intValue();
            i7++;
        }
        return iArr;
    }

    public static List b0(Iterable iterable) {
        w5.k.f(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            return AbstractC1811p.n(c0(iterable));
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return AbstractC1809n.i();
        }
        if (size != 1) {
            return AbstractC1809n.d0(collection);
        }
        return AbstractC1809n.d(iterable instanceof List ? ((List) iterable).get(0) : iterable.iterator().next());
    }

    public static final List c0(Iterable iterable) {
        w5.k.f(iterable, "<this>");
        return iterable instanceof Collection ? AbstractC1809n.d0((Collection) iterable) : (List) Z(iterable, new ArrayList());
    }

    public static List d0(Collection collection) {
        w5.k.f(collection, "<this>");
        return new ArrayList(collection);
    }

    public static Set e0(Iterable iterable) {
        w5.k.f(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            return O.f((Set) Z(iterable, new LinkedHashSet()));
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return AbstractC1794M.d();
        }
        if (size != 1) {
            return (Set) Z(iterable, new LinkedHashSet(AbstractC1787F.d(collection.size())));
        }
        return AbstractC1794M.c(iterable instanceof List ? ((List) iterable).get(0) : iterable.iterator().next());
    }

    public static List f0(Iterable iterable, Iterable iterable2) {
        w5.k.f(iterable, "<this>");
        w5.k.f(iterable2, "other");
        Iterator it = iterable.iterator();
        Iterator it2 = iterable2.iterator();
        ArrayList arrayList = new ArrayList(Math.min(AbstractC1809n.q(iterable, 10), AbstractC1809n.q(iterable2, 10)));
        while (it.hasNext() && it2.hasNext()) {
            arrayList.add(i5.q.a(it.next(), it2.next()));
        }
        return arrayList;
    }
}
