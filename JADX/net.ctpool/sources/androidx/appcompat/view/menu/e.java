package androidx.appcompat.view.menu;

import android.content.Context;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import androidx.appcompat.view.menu.m;
import androidx.appcompat.view.menu.n;
import e.AbstractC1615g;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class e implements m, AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    Context f5416m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    LayoutInflater f5417n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    g f5418o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    ExpandedMenuView f5419p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    int f5420q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    int f5421r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    int f5422s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private m.a f5423t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    a f5424u;

    private class a extends BaseAdapter {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private int f5425m = -1;

        public a() {
            a();
        }

        void a() {
            i iVarV = e.this.f5418o.v();
            if (iVarV != null) {
                ArrayList arrayListZ = e.this.f5418o.z();
                int size = arrayListZ.size();
                for (int i7 = 0; i7 < size; i7++) {
                    if (((i) arrayListZ.get(i7)) == iVarV) {
                        this.f5425m = i7;
                        return;
                    }
                }
            }
            this.f5425m = -1;
        }

        @Override // android.widget.Adapter
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public i getItem(int i7) {
            ArrayList arrayListZ = e.this.f5418o.z();
            int i8 = i7 + e.this.f5420q;
            int i9 = this.f5425m;
            if (i9 >= 0 && i8 >= i9) {
                i8++;
            }
            return (i) arrayListZ.get(i8);
        }

        @Override // android.widget.Adapter
        public int getCount() {
            int size = e.this.f5418o.z().size() - e.this.f5420q;
            return this.f5425m < 0 ? size : size - 1;
        }

        @Override // android.widget.Adapter
        public long getItemId(int i7) {
            return i7;
        }

        @Override // android.widget.Adapter
        public View getView(int i7, View view, ViewGroup viewGroup) {
            if (view == null) {
                e eVar = e.this;
                view = eVar.f5417n.inflate(eVar.f5422s, viewGroup, false);
            }
            ((n.a) view).e(getItem(i7), 0);
            return view;
        }

        @Override // android.widget.BaseAdapter
        public void notifyDataSetChanged() {
            a();
            super.notifyDataSetChanged();
        }
    }

    public e(int i7, int i8) {
        this.f5422s = i7;
        this.f5421r = i8;
    }

    public ListAdapter a() {
        if (this.f5424u == null) {
            this.f5424u = new a();
        }
        return this.f5424u;
    }

    public n b(ViewGroup viewGroup) {
        if (this.f5419p == null) {
            this.f5419p = (ExpandedMenuView) this.f5417n.inflate(AbstractC1615g.f18869g, viewGroup, false);
            if (this.f5424u == null) {
                this.f5424u = new a();
            }
            this.f5419p.setAdapter((ListAdapter) this.f5424u);
            this.f5419p.setOnItemClickListener(this);
        }
        return this.f5419p;
    }

    @Override // androidx.appcompat.view.menu.m
    public void c(g gVar, boolean z6) {
        m.a aVar = this.f5423t;
        if (aVar != null) {
            aVar.c(gVar, z6);
        }
    }

    @Override // androidx.appcompat.view.menu.m
    public void d(boolean z6) {
        a aVar = this.f5424u;
        if (aVar != null) {
            aVar.notifyDataSetChanged();
        }
    }

    @Override // androidx.appcompat.view.menu.m
    public boolean e() {
        return false;
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
    public void h(m.a aVar) {
        this.f5423t = aVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    @Override // androidx.appcompat.view.menu.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void i(Context context, g gVar) {
        LayoutInflater layoutInflaterFrom;
        a aVar;
        if (this.f5421r == 0) {
            if (this.f5416m != null) {
                this.f5416m = context;
                if (this.f5417n == null) {
                    layoutInflaterFrom = LayoutInflater.from(context);
                }
            }
            this.f5418o = gVar;
            aVar = this.f5424u;
            if (aVar == null) {
                aVar.notifyDataSetChanged();
                return;
            }
            return;
        }
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, this.f5421r);
        this.f5416m = contextThemeWrapper;
        layoutInflaterFrom = LayoutInflater.from(contextThemeWrapper);
        this.f5417n = layoutInflaterFrom;
        this.f5418o = gVar;
        aVar = this.f5424u;
        if (aVar == null) {
        }
    }

    @Override // androidx.appcompat.view.menu.m
    public boolean k(r rVar) {
        if (!rVar.hasVisibleItems()) {
            return false;
        }
        new h(rVar).b(null);
        m.a aVar = this.f5423t;
        if (aVar == null) {
            return true;
        }
        aVar.d(rVar);
        return true;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView adapterView, View view, int i7, long j7) {
        this.f5418o.M(this.f5424u.getItem(i7), this, 0);
    }

    public e(Context context, int i7) {
        this(i7, 0);
        this.f5416m = context;
        this.f5417n = LayoutInflater.from(context);
    }
}
