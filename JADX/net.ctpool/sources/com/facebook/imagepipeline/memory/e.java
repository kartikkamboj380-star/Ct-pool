package com.facebook.imagepipeline.memory;

import G1.G;
import G1.H;
import G1.w;
import O0.l;
import android.util.SparseIntArray;
import com.facebook.imagepipeline.memory.a;

/* JADX INFO: loaded from: classes.dex */
public abstract class e extends a {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final int[] f10692k;

    e(R0.d dVar, G g7, H h7) {
        super(dVar, g7, h7);
        SparseIntArray sparseIntArray = (SparseIntArray) l.g(g7.f1186c);
        this.f10692k = new int[sparseIntArray.size()];
        int i7 = 0;
        while (true) {
            int[] iArr = this.f10692k;
            if (i7 >= iArr.length) {
                r();
                return;
            } else {
                iArr[i7] = sparseIntArray.keyAt(i7);
                i7++;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.imagepipeline.memory.a
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public int n(w wVar) {
        l.g(wVar);
        return wVar.n();
    }

    int B() {
        return this.f10692k[0];
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.imagepipeline.memory.a
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public boolean t(w wVar) {
        l.g(wVar);
        return !wVar.isClosed();
    }

    @Override // com.facebook.imagepipeline.memory.a
    protected int m(int i7) {
        if (i7 <= 0) {
            throw new a.b(Integer.valueOf(i7));
        }
        for (int i8 : this.f10692k) {
            if (i8 >= i7) {
                return i8;
            }
        }
        return i7;
    }

    @Override // com.facebook.imagepipeline.memory.a
    protected int o(int i7) {
        return i7;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.imagepipeline.memory.a
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public void j(w wVar) {
        l.g(wVar);
        wVar.close();
    }
}
