package androidx.lifecycle;

import androidx.lifecycle.AbstractC0651h;

/* JADX INFO: loaded from: classes.dex */
class FullLifecycleObserverAdapter implements InterfaceC0653j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC0648e f8305a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC0653j f8306b;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f8307a;

        static {
            int[] iArr = new int[AbstractC0651h.b.values().length];
            f8307a = iArr;
            try {
                iArr[AbstractC0651h.b.ON_CREATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f8307a[AbstractC0651h.b.ON_START.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f8307a[AbstractC0651h.b.ON_RESUME.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f8307a[AbstractC0651h.b.ON_PAUSE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f8307a[AbstractC0651h.b.ON_STOP.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f8307a[AbstractC0651h.b.ON_DESTROY.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f8307a[AbstractC0651h.b.ON_ANY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    FullLifecycleObserverAdapter(InterfaceC0648e interfaceC0648e, InterfaceC0653j interfaceC0653j) {
        this.f8305a = interfaceC0648e;
        this.f8306b = interfaceC0653j;
    }

    @Override // androidx.lifecycle.InterfaceC0653j
    public void g(l lVar, AbstractC0651h.b bVar) {
        switch (a.f8307a[bVar.ordinal()]) {
            case 1:
                this.f8305a.a(lVar);
                break;
            case 2:
                this.f8305a.e(lVar);
                break;
            case 3:
                this.f8305a.f(lVar);
                break;
            case 4:
                this.f8305a.b(lVar);
                break;
            case 5:
                this.f8305a.c(lVar);
                break;
            case 6:
                this.f8305a.d(lVar);
                break;
            case 7:
                throw new IllegalArgumentException("ON_ANY must not been send by anybody");
        }
        InterfaceC0653j interfaceC0653j = this.f8306b;
        if (interfaceC0653j != null) {
            interfaceC0653j.g(lVar, bVar);
        }
    }
}
