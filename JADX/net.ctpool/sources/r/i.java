package r;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public abstract class i extends e implements h {

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public e[] f22048w0 = new e[4];

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public int f22049x0 = 0;

    @Override // r.h
    public void b() {
        this.f22049x0 = 0;
        Arrays.fill(this.f22048w0, (Object) null);
    }

    @Override // r.h
    public void c(e eVar) {
        if (eVar == this || eVar == null) {
            return;
        }
        int i7 = this.f22049x0 + 1;
        e[] eVarArr = this.f22048w0;
        if (i7 > eVarArr.length) {
            this.f22048w0 = (e[]) Arrays.copyOf(eVarArr, eVarArr.length * 2);
        }
        e[] eVarArr2 = this.f22048w0;
        int i8 = this.f22049x0;
        eVarArr2[i8] = eVar;
        this.f22049x0 = i8 + 1;
    }

    @Override // r.h
    public void a(f fVar) {
    }
}
