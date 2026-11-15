package K3;

import android.graphics.Typeface;

/* JADX INFO: loaded from: classes.dex */
public final class a extends f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Typeface f1850a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC0035a f1851b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f1852c;

    /* JADX INFO: renamed from: K3.a$a, reason: collision with other inner class name */
    public interface InterfaceC0035a {
        void a(Typeface typeface);
    }

    public a(InterfaceC0035a interfaceC0035a, Typeface typeface) {
        this.f1850a = typeface;
        this.f1851b = interfaceC0035a;
    }

    private void d(Typeface typeface) {
        if (this.f1852c) {
            return;
        }
        this.f1851b.a(typeface);
    }

    @Override // K3.f
    public void a(int i7) {
        d(this.f1850a);
    }

    @Override // K3.f
    public void b(Typeface typeface, boolean z6) {
        d(typeface);
    }

    public void c() {
        this.f1852c = true;
    }
}
