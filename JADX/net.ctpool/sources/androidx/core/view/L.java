package androidx.core.view;

import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;
import x5.InterfaceC2227a;

/* JADX INFO: loaded from: classes.dex */
public abstract class L {

    public static final class a implements E5.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ViewGroup f7290a;

        a(ViewGroup viewGroup) {
            this.f7290a = viewGroup;
        }

        @Override // E5.d
        public Iterator iterator() {
            return L.b(this.f7290a);
        }
    }

    public static final class b implements Iterator, InterfaceC2227a {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private int f7291m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ ViewGroup f7292n;

        b(ViewGroup viewGroup) {
            this.f7292n = viewGroup;
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public View next() {
            ViewGroup viewGroup = this.f7292n;
            int i7 = this.f7291m;
            this.f7291m = i7 + 1;
            View childAt = viewGroup.getChildAt(i7);
            if (childAt != null) {
                return childAt;
            }
            throw new IndexOutOfBoundsException();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f7291m < this.f7292n.getChildCount();
        }

        @Override // java.util.Iterator
        public void remove() {
            ViewGroup viewGroup = this.f7292n;
            int i7 = this.f7291m - 1;
            this.f7291m = i7;
            viewGroup.removeViewAt(i7);
        }
    }

    public static final E5.d a(ViewGroup viewGroup) {
        w5.k.f(viewGroup, "<this>");
        return new a(viewGroup);
    }

    public static final Iterator b(ViewGroup viewGroup) {
        w5.k.f(viewGroup, "<this>");
        return new b(viewGroup);
    }
}
