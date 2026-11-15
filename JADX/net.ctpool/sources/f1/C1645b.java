package f1;

import android.os.Handler;
import android.os.Looper;
import f1.AbstractC1644a;
import java.util.ArrayList;

/* JADX INFO: renamed from: f1.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
class C1645b extends AbstractC1644a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f19258b = new Object();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Runnable f19262f = new a();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private ArrayList f19260d = new ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private ArrayList f19261e = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Handler f19259c = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: f1.b$a */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (C1645b.this.f19258b) {
                ArrayList arrayList = C1645b.this.f19261e;
                C1645b c1645b = C1645b.this;
                c1645b.f19261e = c1645b.f19260d;
                C1645b.this.f19260d = arrayList;
            }
            int size = C1645b.this.f19261e.size();
            for (int i7 = 0; i7 < size; i7++) {
                ((AbstractC1644a.InterfaceC0256a) C1645b.this.f19261e.get(i7)).release();
            }
            C1645b.this.f19261e.clear();
        }
    }

    @Override // f1.AbstractC1644a
    public void a(AbstractC1644a.InterfaceC0256a interfaceC0256a) {
        synchronized (this.f19258b) {
            this.f19260d.remove(interfaceC0256a);
        }
    }

    @Override // f1.AbstractC1644a
    public void d(AbstractC1644a.InterfaceC0256a interfaceC0256a) {
        if (!AbstractC1644a.c()) {
            interfaceC0256a.release();
            return;
        }
        synchronized (this.f19258b) {
            try {
                if (this.f19260d.contains(interfaceC0256a)) {
                    return;
                }
                this.f19260d.add(interfaceC0256a);
                boolean z6 = true;
                if (this.f19260d.size() != 1) {
                    z6 = false;
                }
                if (z6) {
                    this.f19259c.post(this.f19262f);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
