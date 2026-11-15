package O2;

import com.facebook.soloader.A;

/* JADX INFO: loaded from: classes.dex */
public class c implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final f[] f2467a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f2468b = 0;

    public c(f... fVarArr) {
        this.f2467a = fVarArr;
    }

    @Override // O2.f
    public boolean a(UnsatisfiedLinkError unsatisfiedLinkError, A[] aArr) {
        int i7;
        f[] fVarArr;
        do {
            i7 = this.f2468b;
            fVarArr = this.f2467a;
            if (i7 >= fVarArr.length) {
                return false;
            }
            this.f2468b = i7 + 1;
        } while (!fVarArr[i7].a(unsatisfiedLinkError, aArr));
        return true;
    }
}
