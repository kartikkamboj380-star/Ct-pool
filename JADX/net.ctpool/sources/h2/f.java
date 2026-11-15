package h2;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
public final class f implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f19603a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final f f19604b = new f();

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private f() {
    }

    @Override // h2.e
    public boolean a() {
        return false;
    }

    @Override // h2.e
    public int b() {
        throw new IllegalStateException("Should not retrieve delay as canRetry is: " + a());
    }

    @Override // h2.e
    public e c() {
        throw new IllegalStateException("Should not update as canRetry is: " + a());
    }

    @Override // h2.e
    public e copy() {
        return this;
    }
}
