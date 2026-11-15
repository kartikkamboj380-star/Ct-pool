package y;

import android.content.Context;
import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: renamed from: y.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2231c extends AbstractC2229a {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private int f22863u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private int f22864v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private LayoutInflater f22865w;

    public AbstractC2231c(Context context, int i7, Cursor cursor, boolean z6) {
        super(context, cursor, z6);
        this.f22864v = i7;
        this.f22863u = i7;
        this.f22865w = (LayoutInflater) context.getSystemService("layout_inflater");
    }

    @Override // y.AbstractC2229a
    public View g(Context context, Cursor cursor, ViewGroup viewGroup) {
        return this.f22865w.inflate(this.f22864v, viewGroup, false);
    }

    @Override // y.AbstractC2229a
    public View h(Context context, Cursor cursor, ViewGroup viewGroup) {
        return this.f22865w.inflate(this.f22863u, viewGroup, false);
    }
}
