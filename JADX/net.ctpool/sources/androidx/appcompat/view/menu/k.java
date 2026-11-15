package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.Rect;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes.dex */
public abstract class k implements p, m, AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private Rect f5507m;

    k() {
    }

    protected static int o(ListAdapter listAdapter, ViewGroup viewGroup, Context context, int i7) {
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        int count = listAdapter.getCount();
        int i8 = 0;
        int i9 = 0;
        View view = null;
        for (int i10 = 0; i10 < count; i10++) {
            int itemViewType = listAdapter.getItemViewType(i10);
            if (itemViewType != i9) {
                view = null;
                i9 = itemViewType;
            }
            if (viewGroup == null) {
                viewGroup = new FrameLayout(context);
            }
            view = listAdapter.getView(i10, view, viewGroup);
            view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
            int measuredWidth = view.getMeasuredWidth();
            if (measuredWidth >= i7) {
                return i7;
            }
            if (measuredWidth > i8) {
                i8 = measuredWidth;
            }
        }
        return i8;
    }

    protected static boolean x(g gVar) {
        int size = gVar.size();
        for (int i7 = 0; i7 < size; i7++) {
            MenuItem item = gVar.getItem(i7);
            if (item.isVisible() && item.getIcon() != null) {
                return true;
            }
        }
        return false;
    }

    protected static f y(ListAdapter listAdapter) {
        return listAdapter instanceof HeaderViewListAdapter ? (f) ((HeaderViewListAdapter) listAdapter).getWrappedAdapter() : (f) listAdapter;
    }

    @Override // androidx.appcompat.view.menu.m
    public boolean f(g gVar, i iVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.m
    public boolean g(g gVar, i iVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.m
    public void i(Context context, g gVar) {
    }

    public abstract void l(g gVar);

    protected boolean m() {
        return true;
    }

    public Rect n() {
        return this.f5507m;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView adapterView, View view, int i7, long j7) {
        ListAdapter listAdapter = (ListAdapter) adapterView.getAdapter();
        y(listAdapter).f5427m.M((MenuItem) listAdapter.getItem(i7), this, m() ? 0 : 4);
    }

    public abstract void p(View view);

    public void q(Rect rect) {
        this.f5507m = rect;
    }

    public abstract void r(boolean z6);

    public abstract void s(int i7);

    public abstract void t(int i7);

    public abstract void u(PopupWindow.OnDismissListener onDismissListener);

    public abstract void v(boolean z6);

    public abstract void w(int i7);
}
