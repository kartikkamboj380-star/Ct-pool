package V2;

import android.content.Context;
import e3.InterfaceC1622a;

/* JADX INFO: loaded from: classes.dex */
final class c extends h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f4024a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC1622a f4025b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final InterfaceC1622a f4026c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f4027d;

    c(Context context, InterfaceC1622a interfaceC1622a, InterfaceC1622a interfaceC1622a2, String str) {
        if (context == null) {
            throw new NullPointerException("Null applicationContext");
        }
        this.f4024a = context;
        if (interfaceC1622a == null) {
            throw new NullPointerException("Null wallClock");
        }
        this.f4025b = interfaceC1622a;
        if (interfaceC1622a2 == null) {
            throw new NullPointerException("Null monotonicClock");
        }
        this.f4026c = interfaceC1622a2;
        if (str == null) {
            throw new NullPointerException("Null backendName");
        }
        this.f4027d = str;
    }

    @Override // V2.h
    public Context b() {
        return this.f4024a;
    }

    @Override // V2.h
    public String c() {
        return this.f4027d;
    }

    @Override // V2.h
    public InterfaceC1622a d() {
        return this.f4026c;
    }

    @Override // V2.h
    public InterfaceC1622a e() {
        return this.f4025b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return this.f4024a.equals(hVar.b()) && this.f4025b.equals(hVar.e()) && this.f4026c.equals(hVar.d()) && this.f4027d.equals(hVar.c());
    }

    public int hashCode() {
        return ((((((this.f4024a.hashCode() ^ 1000003) * 1000003) ^ this.f4025b.hashCode()) * 1000003) ^ this.f4026c.hashCode()) * 1000003) ^ this.f4027d.hashCode();
    }

    public String toString() {
        return "CreationContext{applicationContext=" + this.f4024a + ", wallClock=" + this.f4025b + ", monotonicClock=" + this.f4026c + ", backendName=" + this.f4027d + "}";
    }
}
