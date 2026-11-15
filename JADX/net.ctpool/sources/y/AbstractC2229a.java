package y;

import android.content.Context;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import y.C2230b;

/* JADX INFO: renamed from: y.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2229a extends BaseAdapter implements Filterable, C2230b.a {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    protected boolean f22852m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    protected boolean f22853n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    protected Cursor f22854o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    protected Context f22855p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    protected int f22856q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    protected C0328a f22857r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    protected DataSetObserver f22858s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    protected C2230b f22859t;

    /* JADX INFO: renamed from: y.a$a, reason: collision with other inner class name */
    private class C0328a extends ContentObserver {
        C0328a() {
            super(new Handler());
        }

        @Override // android.database.ContentObserver
        public boolean deliverSelfNotifications() {
            return true;
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z6) {
            AbstractC2229a.this.i();
        }
    }

    /* JADX INFO: renamed from: y.a$b */
    private class b extends DataSetObserver {
        b() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            AbstractC2229a abstractC2229a = AbstractC2229a.this;
            abstractC2229a.f22852m = true;
            abstractC2229a.notifyDataSetChanged();
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            AbstractC2229a abstractC2229a = AbstractC2229a.this;
            abstractC2229a.f22852m = false;
            abstractC2229a.notifyDataSetInvalidated();
        }
    }

    public AbstractC2229a(Context context, Cursor cursor, boolean z6) {
        f(context, cursor, z6 ? 1 : 2);
    }

    public void a(Cursor cursor) {
        Cursor cursorJ = j(cursor);
        if (cursorJ != null) {
            cursorJ.close();
        }
    }

    @Override // y.C2230b.a
    public Cursor b() {
        return this.f22854o;
    }

    public abstract CharSequence c(Cursor cursor);

    public abstract void e(View view, Context context, Cursor cursor);

    void f(Context context, Cursor cursor, int i7) {
        b bVar;
        if ((i7 & 1) == 1) {
            i7 |= 2;
            this.f22853n = true;
        } else {
            this.f22853n = false;
        }
        boolean z6 = cursor != null;
        this.f22854o = cursor;
        this.f22852m = z6;
        this.f22855p = context;
        this.f22856q = z6 ? cursor.getColumnIndexOrThrow("_id") : -1;
        if ((i7 & 2) == 2) {
            this.f22857r = new C0328a();
            bVar = new b();
        } else {
            bVar = null;
            this.f22857r = null;
        }
        this.f22858s = bVar;
        if (z6) {
            C0328a c0328a = this.f22857r;
            if (c0328a != null) {
                cursor.registerContentObserver(c0328a);
            }
            DataSetObserver dataSetObserver = this.f22858s;
            if (dataSetObserver != null) {
                cursor.registerDataSetObserver(dataSetObserver);
            }
        }
    }

    public abstract View g(Context context, Cursor cursor, ViewGroup viewGroup);

    @Override // android.widget.Adapter
    public int getCount() {
        Cursor cursor;
        if (!this.f22852m || (cursor = this.f22854o) == null) {
            return 0;
        }
        return cursor.getCount();
    }

    @Override // android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public View getDropDownView(int i7, View view, ViewGroup viewGroup) {
        if (!this.f22852m) {
            return null;
        }
        this.f22854o.moveToPosition(i7);
        if (view == null) {
            view = g(this.f22855p, this.f22854o, viewGroup);
        }
        e(view, this.f22855p, this.f22854o);
        return view;
    }

    @Override // android.widget.Filterable
    public Filter getFilter() {
        if (this.f22859t == null) {
            this.f22859t = new C2230b(this);
        }
        return this.f22859t;
    }

    @Override // android.widget.Adapter
    public Object getItem(int i7) {
        Cursor cursor;
        if (!this.f22852m || (cursor = this.f22854o) == null) {
            return null;
        }
        cursor.moveToPosition(i7);
        return this.f22854o;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i7) {
        Cursor cursor;
        if (this.f22852m && (cursor = this.f22854o) != null && cursor.moveToPosition(i7)) {
            return this.f22854o.getLong(this.f22856q);
        }
        return 0L;
    }

    @Override // android.widget.Adapter
    public View getView(int i7, View view, ViewGroup viewGroup) {
        if (!this.f22852m) {
            throw new IllegalStateException("this should only be called when the cursor is valid");
        }
        if (this.f22854o.moveToPosition(i7)) {
            if (view == null) {
                view = h(this.f22855p, this.f22854o, viewGroup);
            }
            e(view, this.f22855p, this.f22854o);
            return view;
        }
        throw new IllegalStateException("couldn't move cursor to position " + i7);
    }

    public abstract View h(Context context, Cursor cursor, ViewGroup viewGroup);

    protected void i() {
        Cursor cursor;
        if (!this.f22853n || (cursor = this.f22854o) == null || cursor.isClosed()) {
            return;
        }
        this.f22852m = this.f22854o.requery();
    }

    public Cursor j(Cursor cursor) {
        Cursor cursor2 = this.f22854o;
        if (cursor == cursor2) {
            return null;
        }
        if (cursor2 != null) {
            C0328a c0328a = this.f22857r;
            if (c0328a != null) {
                cursor2.unregisterContentObserver(c0328a);
            }
            DataSetObserver dataSetObserver = this.f22858s;
            if (dataSetObserver != null) {
                cursor2.unregisterDataSetObserver(dataSetObserver);
            }
        }
        this.f22854o = cursor;
        if (cursor != null) {
            C0328a c0328a2 = this.f22857r;
            if (c0328a2 != null) {
                cursor.registerContentObserver(c0328a2);
            }
            DataSetObserver dataSetObserver2 = this.f22858s;
            if (dataSetObserver2 != null) {
                cursor.registerDataSetObserver(dataSetObserver2);
            }
            this.f22856q = cursor.getColumnIndexOrThrow("_id");
            this.f22852m = true;
            notifyDataSetChanged();
        } else {
            this.f22856q = -1;
            this.f22852m = false;
            notifyDataSetInvalidated();
        }
        return cursor2;
    }
}
