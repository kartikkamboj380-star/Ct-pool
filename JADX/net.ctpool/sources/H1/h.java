package H1;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f1357a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f1358b;

    public h(boolean z6, boolean z7) {
        this.f1357a = z6;
        this.f1358b = z7;
    }

    public final boolean a() {
        return this.f1357a;
    }

    public final boolean b() {
        return this.f1358b;
    }

    public /* synthetic */ h(boolean z6, boolean z7, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this((i7 & 1) != 0 ? false : z6, (i7 & 2) != 0 ? false : z7);
    }
}
