package androidx.appcompat.view.menu;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.appcompat.view.menu.n;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class f extends BaseAdapter {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    g f5427m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f5428n = -1;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f5429o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final boolean f5430p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final LayoutInflater f5431q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final int f5432r;

    public f(g gVar, LayoutInflater layoutInflater, boolean z6, int i7) {
        this.f5430p = z6;
        this.f5431q = layoutInflater;
        this.f5427m = gVar;
        this.f5432r = i7;
        a();
    }

    void a() {
        i iVarV = this.f5427m.v();
        if (iVarV != null) {
            ArrayList arrayListZ = this.f5427m.z();
            int size = arrayListZ.size();
            for (int i7 = 0; i7 < size; i7++) {
                if (((i) arrayListZ.get(i7)) == iVarV) {
                    this.f5428n = i7;
                    return;
                }
            }
        }
        this.f5428n = -1;
    }

    public g b() {
        return this.f5427m;
    }

    @Override // android.widget.Adapter
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public i getItem(int i7) {
        ArrayList arrayListZ = this.f5430p ? this.f5427m.z() : this.f5427m.E();
        int i8 = this.f5428n;
        if (i8 >= 0 && i7 >= i8) {
            i7++;
        }
        return (i) arrayListZ.get(i7);
    }

    public void d(boolean z6) {
        this.f5429o = z6;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        ArrayList arrayListZ = this.f5430p ? this.f5427m.z() : this.f5427m.E();
        int i7 = this.f5428n;
        int size = arrayListZ.size();
        return i7 < 0 ? size : size - 1;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i7) {
        return i7;
    }

    @Override // android.widget.Adapter
    public View getView(int i7, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.f5431q.inflate(this.f5432r, viewGroup, false);
        }
        int groupId = getItem(i7).getGroupId();
        int i8 = i7 - 1;
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        listMenuItemView.setGroupDividerEnabled(this.f5427m.F() && groupId != (i8 >= 0 ? getItem(i8).getGroupId() : groupId));
        n.a aVar = (n.a) view;
        if (this.f5429o) {
            listMenuItemView.setForceShowIcon(true);
        }
        aVar.e(getItem(i7), 0);
        return view;
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }
}
