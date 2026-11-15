package com.google.android.gms.internal.measurement;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public class I4 extends IOException {
    public I4(String str) {
        super(str);
    }

    static L4 a() {
        return new L4("Protocol message tag had invalid wire type.");
    }

    static I4 b() {
        return new I4("Protocol message contained an invalid tag (zero).");
    }

    static I4 c() {
        return new I4("Protocol message had invalid UTF-8.");
    }

    static I4 d() {
        return new I4("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    static I4 e() {
        return new I4("Failed to parse the message.");
    }

    static I4 f() {
        return new I4("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
    }

    static I4 g() {
        return new I4("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }
}
