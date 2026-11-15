package X5;

import v5.InterfaceC2171a;

/* JADX INFO: loaded from: classes2.dex */
public final class c extends a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ InterfaceC2171a f4358e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final /* synthetic */ String f4359f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final /* synthetic */ boolean f4360g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(InterfaceC2171a interfaceC2171a, String str, boolean z6, String str2, boolean z7) {
        super(str2, z7);
        this.f4358e = interfaceC2171a;
        this.f4359f = str;
        this.f4360g = z6;
    }

    @Override // X5.a
    public long f() {
        this.f4358e.invoke();
        return -1L;
    }
}
