package X5;

import kotlin.jvm.internal.DefaultConstructorMarker;
import w5.k;

/* JADX INFO: loaded from: classes2.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private d f4354a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f4355b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f4356c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f4357d;

    public a(String str, boolean z6) {
        k.f(str, "name");
        this.f4356c = str;
        this.f4357d = z6;
        this.f4355b = -1L;
    }

    public final boolean a() {
        return this.f4357d;
    }

    public final String b() {
        return this.f4356c;
    }

    public final long c() {
        return this.f4355b;
    }

    public final d d() {
        return this.f4354a;
    }

    public final void e(d dVar) {
        k.f(dVar, "queue");
        d dVar2 = this.f4354a;
        if (dVar2 == dVar) {
            return;
        }
        if (!(dVar2 == null)) {
            throw new IllegalStateException("task is in multiple queues".toString());
        }
        this.f4354a = dVar;
    }

    public abstract long f();

    public final void g(long j7) {
        this.f4355b = j7;
    }

    public String toString() {
        return this.f4356c;
    }

    public /* synthetic */ a(String str, boolean z6, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i7 & 2) != 0 ? true : z6);
    }
}
