package androidx.fragment.app;

import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public abstract class H {

    class a implements Runnable {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        final /* synthetic */ int f8049m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ ArrayList f8050n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        final /* synthetic */ ArrayList f8051o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ ArrayList f8052p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ ArrayList f8053q;

        a(int i7, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4) {
            this.f8049m = i7;
            this.f8050n = arrayList;
            this.f8051o = arrayList2;
            this.f8052p = arrayList3;
            this.f8053q = arrayList4;
        }

        @Override // java.lang.Runnable
        public void run() {
            for (int i7 = 0; i7 < this.f8049m; i7++) {
                androidx.core.view.H.H0((View) this.f8050n.get(i7), (String) this.f8051o.get(i7));
                androidx.core.view.H.H0((View) this.f8052p.get(i7), (String) this.f8053q.get(i7));
            }
        }
    }

    protected static void d(List list, View view) {
        int size = list.size();
        if (g(list, view, size)) {
            return;
        }
        if (androidx.core.view.H.K(view) != null) {
            list.add(view);
        }
        for (int i7 = size; i7 < list.size(); i7++) {
            View view2 = (View) list.get(i7);
            if (view2 instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view2;
                int childCount = viewGroup.getChildCount();
                for (int i8 = 0; i8 < childCount; i8++) {
                    View childAt = viewGroup.getChildAt(i8);
                    if (!g(list, childAt, size) && androidx.core.view.H.K(childAt) != null) {
                        list.add(childAt);
                    }
                }
            }
        }
    }

    private static boolean g(List list, View view, int i7) {
        for (int i8 = 0; i8 < i7; i8++) {
            if (list.get(i8) == view) {
                return true;
            }
        }
        return false;
    }

    protected static boolean i(List list) {
        return list == null || list.isEmpty();
    }

    public abstract void a(Object obj, View view);

    public abstract void b(Object obj, ArrayList arrayList);

    public abstract void c(ViewGroup viewGroup, Object obj);

    public abstract boolean e(Object obj);

    public abstract Object f(Object obj);

    protected void h(View view, Rect rect) {
        if (androidx.core.view.H.S(view)) {
            RectF rectF = new RectF();
            rectF.set(0.0f, 0.0f, view.getWidth(), view.getHeight());
            view.getMatrix().mapRect(rectF);
            rectF.offset(view.getLeft(), view.getTop());
            Object parent = view.getParent();
            while (parent instanceof View) {
                View view2 = (View) parent;
                rectF.offset(-view2.getScrollX(), -view2.getScrollY());
                view2.getMatrix().mapRect(rectF);
                rectF.offset(view2.getLeft(), view2.getTop());
                parent = view2.getParent();
            }
            view.getRootView().getLocationOnScreen(new int[2]);
            rectF.offset(r1[0], r1[1]);
            rect.set(Math.round(rectF.left), Math.round(rectF.top), Math.round(rectF.right), Math.round(rectF.bottom));
        }
    }

    public abstract Object j(Object obj, Object obj2, Object obj3);

    public abstract Object k(Object obj, Object obj2, Object obj3);

    ArrayList l(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            View view = (View) arrayList.get(i7);
            arrayList2.add(androidx.core.view.H.K(view));
            androidx.core.view.H.H0(view, null);
        }
        return arrayList2;
    }

    public abstract void m(Object obj, View view, ArrayList arrayList);

    public abstract void n(Object obj, Object obj2, ArrayList arrayList, Object obj3, ArrayList arrayList2, Object obj4, ArrayList arrayList3);

    public abstract void o(Object obj, Rect rect);

    public abstract void p(Object obj, View view);

    public void q(Fragment fragment, Object obj, androidx.core.os.e eVar, Runnable runnable) {
        runnable.run();
    }

    void r(View view, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, Map map) {
        int size = arrayList2.size();
        ArrayList arrayList4 = new ArrayList();
        for (int i7 = 0; i7 < size; i7++) {
            View view2 = (View) arrayList.get(i7);
            String strK = androidx.core.view.H.K(view2);
            arrayList4.add(strK);
            if (strK != null) {
                androidx.core.view.H.H0(view2, null);
                String str = (String) map.get(strK);
                int i8 = 0;
                while (true) {
                    if (i8 >= size) {
                        break;
                    }
                    if (str.equals(arrayList3.get(i8))) {
                        androidx.core.view.H.H0((View) arrayList2.get(i8), strK);
                        break;
                    }
                    i8++;
                }
            }
        }
        androidx.core.view.F.a(view, new a(size, arrayList2, arrayList3, arrayList, arrayList4));
    }

    public abstract void s(Object obj, View view, ArrayList arrayList);

    public abstract void t(Object obj, ArrayList arrayList, ArrayList arrayList2);

    public abstract Object u(Object obj);
}
