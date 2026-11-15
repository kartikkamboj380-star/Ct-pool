package y;

import android.database.Cursor;
import android.widget.Filter;

/* JADX INFO: renamed from: y.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
class C2230b extends Filter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    a f22862a;

    /* JADX INFO: renamed from: y.b$a */
    interface a {
        void a(Cursor cursor);

        Cursor b();

        CharSequence c(Cursor cursor);

        Cursor d(CharSequence charSequence);
    }

    C2230b(a aVar) {
        this.f22862a = aVar;
    }

    @Override // android.widget.Filter
    public CharSequence convertResultToString(Object obj) {
        return this.f22862a.c((Cursor) obj);
    }

    @Override // android.widget.Filter
    protected Filter.FilterResults performFiltering(CharSequence charSequence) {
        Cursor cursorD = this.f22862a.d(charSequence);
        Filter.FilterResults filterResults = new Filter.FilterResults();
        if (cursorD != null) {
            filterResults.count = cursorD.getCount();
        } else {
            filterResults.count = 0;
            cursorD = null;
        }
        filterResults.values = cursorD;
        return filterResults;
    }

    @Override // android.widget.Filter
    protected void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
        Cursor cursorB = this.f22862a.b();
        Object obj = filterResults.values;
        if (obj == null || obj == cursorB) {
            return;
        }
        this.f22862a.a((Cursor) obj);
    }
}
