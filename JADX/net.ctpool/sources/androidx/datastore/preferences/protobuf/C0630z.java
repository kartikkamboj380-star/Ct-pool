package androidx.datastore.preferences.protobuf;

import java.io.IOException;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.z, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0630z extends IOException {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private O f7835m;

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.z$a */
    public static class a extends C0630z {
        public a(String str) {
            super(str);
        }
    }

    public C0630z(String str) {
        super(str);
        this.f7835m = null;
    }

    static C0630z a() {
        return new C0630z("Protocol message end-group tag did not match expected tag.");
    }

    static C0630z b() {
        return new C0630z("Protocol message contained an invalid tag (zero).");
    }

    static C0630z c() {
        return new C0630z("Protocol message had invalid UTF-8.");
    }

    static a d() {
        return new a("Protocol message tag had invalid wire type.");
    }

    static C0630z e() {
        return new C0630z("CodedInputStream encountered a malformed varint.");
    }

    static C0630z f() {
        return new C0630z("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    static C0630z g() {
        return new C0630z("Failed to parse the message.");
    }

    static C0630z h() {
        return new C0630z("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
    }

    static C0630z j() {
        return new C0630z("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
    }

    static C0630z k() {
        return new C0630z("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    public C0630z i(O o6) {
        this.f7835m = o6;
        return this;
    }
}
