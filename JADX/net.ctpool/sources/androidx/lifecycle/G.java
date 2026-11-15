package androidx.lifecycle;

import P.a;

/* JADX INFO: loaded from: classes.dex */
public abstract class G {
    public static final P.a a(I i7) {
        w5.k.f(i7, "owner");
        if (!(i7 instanceof InterfaceC0650g)) {
            return a.C0052a.f2550b;
        }
        P.a defaultViewModelCreationExtras = ((InterfaceC0650g) i7).getDefaultViewModelCreationExtras();
        w5.k.e(defaultViewModelCreationExtras, "{\n        owner.defaultV…ModelCreationExtras\n    }");
        return defaultViewModelCreationExtras;
    }
}
