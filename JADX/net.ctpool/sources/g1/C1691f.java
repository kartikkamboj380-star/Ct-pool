package g1;

import android.graphics.drawable.Animatable;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: g1.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1691f implements InterfaceC1689d {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final List f19527m = new ArrayList(2);

    private synchronized void d(String str, Throwable th) {
        Log.e("FdingControllerListener", str, th);
    }

    @Override // g1.InterfaceC1689d
    public void a(String str, Object obj) {
        int size = this.f19527m.size();
        for (int i7 = 0; i7 < size; i7++) {
            try {
                InterfaceC1689d interfaceC1689d = (InterfaceC1689d) this.f19527m.get(i7);
                if (interfaceC1689d != null) {
                    interfaceC1689d.a(str, obj);
                }
            } catch (Exception e7) {
                d("InternalListener exception in onIntermediateImageSet", e7);
            }
        }
    }

    public synchronized void b(InterfaceC1689d interfaceC1689d) {
        this.f19527m.add(interfaceC1689d);
    }

    public synchronized void c() {
        this.f19527m.clear();
    }

    @Override // g1.InterfaceC1689d
    public synchronized void e(String str, Object obj, Animatable animatable) {
        int size = this.f19527m.size();
        for (int i7 = 0; i7 < size; i7++) {
            try {
                InterfaceC1689d interfaceC1689d = (InterfaceC1689d) this.f19527m.get(i7);
                if (interfaceC1689d != null) {
                    interfaceC1689d.e(str, obj, animatable);
                }
            } catch (Exception e7) {
                d("InternalListener exception in onFinalImageSet", e7);
            }
        }
    }

    @Override // g1.InterfaceC1689d
    public synchronized void i(String str, Throwable th) {
        int size = this.f19527m.size();
        for (int i7 = 0; i7 < size; i7++) {
            try {
                InterfaceC1689d interfaceC1689d = (InterfaceC1689d) this.f19527m.get(i7);
                if (interfaceC1689d != null) {
                    interfaceC1689d.i(str, th);
                }
            } catch (Exception e7) {
                d("InternalListener exception in onFailure", e7);
            }
        }
    }

    @Override // g1.InterfaceC1689d
    public synchronized void k(String str) {
        int size = this.f19527m.size();
        for (int i7 = 0; i7 < size; i7++) {
            try {
                InterfaceC1689d interfaceC1689d = (InterfaceC1689d) this.f19527m.get(i7);
                if (interfaceC1689d != null) {
                    interfaceC1689d.k(str);
                }
            } catch (Exception e7) {
                d("InternalListener exception in onRelease", e7);
            }
        }
    }

    @Override // g1.InterfaceC1689d
    public synchronized void p(String str, Object obj) {
        int size = this.f19527m.size();
        for (int i7 = 0; i7 < size; i7++) {
            try {
                InterfaceC1689d interfaceC1689d = (InterfaceC1689d) this.f19527m.get(i7);
                if (interfaceC1689d != null) {
                    interfaceC1689d.p(str, obj);
                }
            } catch (Exception e7) {
                d("InternalListener exception in onSubmit", e7);
            }
        }
    }

    @Override // g1.InterfaceC1689d
    public void q(String str, Throwable th) {
        int size = this.f19527m.size();
        for (int i7 = 0; i7 < size; i7++) {
            try {
                InterfaceC1689d interfaceC1689d = (InterfaceC1689d) this.f19527m.get(i7);
                if (interfaceC1689d != null) {
                    interfaceC1689d.q(str, th);
                }
            } catch (Exception e7) {
                d("InternalListener exception in onIntermediateImageFailed", e7);
            }
        }
    }
}
