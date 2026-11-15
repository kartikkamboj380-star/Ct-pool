package com.horcrux.svg;

import android.graphics.Paint;
import android.graphics.Path;
import java.util.ArrayList;

/* JADX INFO: renamed from: com.horcrux.svg.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
class C1581t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ArrayList f18094a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int[][] f18095b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Paint f18096c;

    C1581t(Paint paint) {
        ArrayList arrayList = new ArrayList();
        this.f18094a = arrayList;
        this.f18095b = new int[256][];
        this.f18096c = paint;
        arrayList.add(new Path());
    }

    private int a(char c7) {
        int[] iArr = this.f18095b[c7 >> '\b'];
        if (iArr == null) {
            return 0;
        }
        return iArr[c7 & 255];
    }

    Path b(char c7, String str) {
        Path path;
        int iA = a(c7);
        if (iA != 0) {
            path = (Path) this.f18094a.get(iA);
        } else {
            Path path2 = new Path();
            this.f18096c.getTextPath(str, 0, 1, 0.0f, 0.0f, path2);
            int[][] iArr = this.f18095b;
            int i7 = c7 >> '\b';
            int[] iArr2 = iArr[i7];
            if (iArr2 == null) {
                iArr2 = new int[256];
                iArr[i7] = iArr2;
            }
            iArr2[c7 & 255] = this.f18094a.size();
            this.f18094a.add(path2);
            path = path2;
        }
        Path path3 = new Path();
        path3.addPath(path);
        return path3;
    }
}
