package androidx.datastore.preferences.protobuf;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class k0 extends RuntimeException {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final List f7656m;

    public k0(O o6) {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
        this.f7656m = null;
    }

    public C0630z a() {
        return new C0630z(getMessage());
    }
}
