package com.google.android.gms.internal.play_billing;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class Y extends IOException {
    Y(String str, Throwable th) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.: ".concat(String.valueOf(str)), th);
    }

    Y(Throwable th) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.", th);
    }
}
