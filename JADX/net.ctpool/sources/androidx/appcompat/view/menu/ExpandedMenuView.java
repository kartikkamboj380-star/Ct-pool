package androidx.appcompat.view.menu;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.widget.h0;

/* JADX INFO: loaded from: classes.dex */
public final class ExpandedMenuView extends ListView implements g.b, n, AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final int[] f5326o = {R.attr.background, R.attr.divider};

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private g f5327m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f5328n;

    public ExpandedMenuView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.listViewStyle);
    }

    @Override // androidx.appcompat.view.menu.g.b
    public boolean a(i iVar) {
        return this.f5327m.L(iVar, 0);
    }

    @Override // androidx.appcompat.view.menu.n
    public void b(g gVar) {
        this.f5327m = gVar;
    }

    public int getWindowAnimations() {
        return this.f5328n;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setChildrenDrawingCacheEnabled(false);
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView adapterView, View view, int i7, long j7) {
        a((i) getAdapter().getItem(i7));
    }

    public ExpandedMenuView(Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet);
        setOnItemClickListener(this);
        h0 h0VarV = h0.v(context, attributeSet, f5326o, i7, 0);
        if (h0VarV.s(0)) {
            setBackgroundDrawable(h0VarV.g(0));
        }
        if (h0VarV.s(1)) {
            setDivider(h0VarV.g(1));
        }
        h0VarV.w();
    }
}
