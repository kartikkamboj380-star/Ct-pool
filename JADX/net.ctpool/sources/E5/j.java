package E5;

import j5.AbstractC1809n;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import v5.l;
import x5.InterfaceC2227a;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes2.dex */
public abstract class j extends i {

    public static final class a implements Iterable, InterfaceC2227a {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        final /* synthetic */ d f1048m;

        public a(d dVar) {
            this.f1048m = dVar;
        }

        @Override // java.lang.Iterable
        public Iterator iterator() {
            return this.f1048m.iterator();
        }
    }

    public static Iterable c(d dVar) {
        w5.k.f(dVar, "<this>");
        return new a(dVar);
    }

    public static d d(d dVar, int i7) {
        w5.k.f(dVar, "<this>");
        if (i7 >= 0) {
            return i7 == 0 ? dVar : dVar instanceof c ? ((c) dVar).a(i7) : new b(dVar, i7);
        }
        throw new IllegalArgumentException(("Requested element count " + i7 + " is less than zero.").toString());
    }

    public static final Appendable e(d dVar, Appendable appendable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i7, CharSequence charSequence4, l lVar) throws IOException {
        w5.k.f(dVar, "<this>");
        w5.k.f(appendable, "buffer");
        w5.k.f(charSequence, "separator");
        w5.k.f(charSequence2, "prefix");
        w5.k.f(charSequence3, "postfix");
        w5.k.f(charSequence4, "truncated");
        appendable.append(charSequence2);
        int i8 = 0;
        for (Object obj : dVar) {
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

    public static final String f(d dVar, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i7, CharSequence charSequence4, l lVar) {
        w5.k.f(dVar, "<this>");
        w5.k.f(charSequence, "separator");
        w5.k.f(charSequence2, "prefix");
        w5.k.f(charSequence3, "postfix");
        w5.k.f(charSequence4, "truncated");
        String string = ((StringBuilder) e(dVar, new StringBuilder(), charSequence, charSequence2, charSequence3, i7, charSequence4, lVar)).toString();
        w5.k.e(string, "toString(...)");
        return string;
    }

    public static /* synthetic */ String g(d dVar, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i7, CharSequence charSequence4, l lVar, int i8, Object obj) {
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
        return f(dVar, charSequence, charSequence5, charSequence6, i9, charSequence7, lVar);
    }

    public static d h(d dVar, l lVar) {
        w5.k.f(dVar, "<this>");
        w5.k.f(lVar, "transform");
        return new k(dVar, lVar);
    }

    public static List i(d dVar) {
        w5.k.f(dVar, "<this>");
        Iterator it = dVar.iterator();
        if (!it.hasNext()) {
            return AbstractC1809n.i();
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return AbstractC1809n.d(next);
        }
        ArrayList arrayList = new ArrayList();
        while (true) {
            arrayList.add(next);
            if (!it.hasNext()) {
                return arrayList;
            }
            next = it.next();
        }
    }
}
