package b3;

import e3.InterfaceC1622a;
import java.util.Map;

/* JADX INFO: renamed from: b3.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class C0677b extends f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC1622a f9579a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f9580b;

    C0677b(InterfaceC1622a interfaceC1622a, Map map) {
        if (interfaceC1622a == null) {
            throw new NullPointerException("Null clock");
        }
        this.f9579a = interfaceC1622a;
        if (map == null) {
            throw new NullPointerException("Null values");
        }
        this.f9580b = map;
    }

    @Override // b3.f
    InterfaceC1622a e() {
        return this.f9579a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f9579a.equals(fVar.e()) && this.f9580b.equals(fVar.h());
    }

    @Override // b3.f
    Map h() {
        return this.f9580b;
    }

    public int hashCode() {
        return ((this.f9579a.hashCode() ^ 1000003) * 1000003) ^ this.f9580b.hashCode();
    }

    public String toString() {
        return "SchedulerConfig{clock=" + this.f9579a + ", values=" + this.f9580b + "}";
    }
}
