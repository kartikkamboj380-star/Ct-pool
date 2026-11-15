package com.google.android.gms.internal.play_billing;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public class B0 extends IOException {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private W0 f15019m;

    public B0(IOException iOException) {
        super(iOException.getMessage(), iOException);
        this.f15019m = null;
    }

    static A0 a() {
        return new A0("Protocol message tag had invalid wire type.");
    }

    static B0 b() {
        return new B0("Protocol message contained an invalid tag (zero).");
    }

    static B0 c() {
        return new B0("Protocol message had invalid UTF-8.");
    }

    static B0 d() {
        return new B0("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    static B0 e() {
        return new B0("Failed to parse the message.");
    }

    static B0 g() {
        return new B0("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    public final B0 f(W0 w02) {
        this.f15019m = w02;
        return this;
    }

    public B0(String str) {
        super(str);
        this.f15019m = null;
    }
}
