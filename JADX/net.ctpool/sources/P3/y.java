package P3;

import P3.d;

/* JADX INFO: loaded from: classes.dex */
final class y extends d.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f2633a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f2634b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private byte f2635c;

    y() {
    }

    @Override // P3.d.a
    public final d a() {
        if (this.f2635c == 3) {
            return new A(this.f2633a, this.f2634b, null);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.f2635c & 1) == 0) {
            sb.append(" appUpdateType");
        }
        if ((this.f2635c & 2) == 0) {
            sb.append(" allowAssetPackDeletion");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // P3.d.a
    public final d.a b(boolean z6) {
        this.f2634b = z6;
        this.f2635c = (byte) (this.f2635c | 2);
        return this;
    }

    public final d.a c(int i7) {
        this.f2633a = i7;
        this.f2635c = (byte) (this.f2635c | 1);
        return this;
    }
}
