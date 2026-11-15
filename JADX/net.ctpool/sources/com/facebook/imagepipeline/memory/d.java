package com.facebook.imagepipeline.memory;

import G1.G;
import G1.H;
import android.util.SparseIntArray;
import com.facebook.imagepipeline.memory.a;
import w5.k;

/* JADX INFO: loaded from: classes.dex */
public class d extends a implements R0.a {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final int[] f10691k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(R0.d dVar, G g7, H h7) {
        super(dVar, g7, h7);
        k.f(dVar, "memoryTrimmableRegistry");
        k.f(g7, "poolParams");
        k.f(h7, "poolStatsTracker");
        SparseIntArray sparseIntArray = g7.f1186c;
        if (sparseIntArray != null) {
            this.f10691k = new int[sparseIntArray.size()];
            int size = sparseIntArray.size();
            for (int i7 = 0; i7 < size; i7++) {
                this.f10691k[i7] = sparseIntArray.keyAt(i7);
            }
        } else {
            this.f10691k = new int[0];
        }
        r();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.imagepipeline.memory.a
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public void j(byte[] bArr) {
        k.f(bArr, "value");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.imagepipeline.memory.a
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public int n(byte[] bArr) {
        k.f(bArr, "value");
        return bArr.length;
    }

    @Override // com.facebook.imagepipeline.memory.a
    protected int m(int i7) {
        if (i7 <= 0) {
            throw new a.b(Integer.valueOf(i7));
        }
        for (int i8 : this.f10691k) {
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
    public byte[] f(int i7) {
        return new byte[i7];
    }
}
