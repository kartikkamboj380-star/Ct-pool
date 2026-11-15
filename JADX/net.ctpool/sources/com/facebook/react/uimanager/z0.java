package com.facebook.react.uimanager;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/* JADX INFO: loaded from: classes.dex */
public class z0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ViewGroup f12754a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f12755b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int[] f12756c;

    class a implements Comparator {
        a() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(View view, View view2) {
            Integer viewZIndex = ViewGroupManager.getViewZIndex(view);
            if (viewZIndex == null) {
                viewZIndex = num;
            }
            Integer viewZIndex2 = ViewGroupManager.getViewZIndex(view2);
            return viewZIndex.intValue() - (viewZIndex2 != null ? viewZIndex2 : 0).intValue();
        }
    }

    public z0(ViewGroup viewGroup) {
        this.f12754a = viewGroup;
    }

    public int a(int i7, int i8) {
        int[] iArr = this.f12756c;
        if (iArr != null && (i8 >= iArr.length || iArr[i8] >= i7)) {
            P0.a.I("ReactNative", "getChildDrawingOrder index out of bounds! Please check any custom view manipulations you may have done. childCount = %d, index = %d", Integer.valueOf(i7), Integer.valueOf(i8));
            e();
        }
        if (this.f12756c == null) {
            ArrayList arrayList = new ArrayList();
            for (int i9 = 0; i9 < i7; i9++) {
                arrayList.add(this.f12754a.getChildAt(i9));
            }
            Collections.sort(arrayList, new a());
            this.f12756c = new int[i7];
            for (int i10 = 0; i10 < i7; i10++) {
                this.f12756c[i10] = this.f12754a.indexOfChild((View) arrayList.get(i10));
            }
        }
        return this.f12756c[i8];
    }

    public void b(View view) {
        if (ViewGroupManager.getViewZIndex(view) != null) {
            this.f12755b++;
        }
        this.f12756c = null;
    }

    public void c(View view) {
        if (ViewGroupManager.getViewZIndex(view) != null) {
            this.f12755b--;
        }
        this.f12756c = null;
    }

    public boolean d() {
        return this.f12755b > 0;
    }

    public void e() {
        this.f12755b = 0;
        for (int i7 = 0; i7 < this.f12754a.getChildCount(); i7++) {
            if (ViewGroupManager.getViewZIndex(this.f12754a.getChildAt(i7)) != null) {
                this.f12755b++;
            }
        }
        this.f12756c = null;
    }
}
