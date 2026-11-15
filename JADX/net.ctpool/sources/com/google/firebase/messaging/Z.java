package com.google.firebase.messaging;

import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class Z extends Exception {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final int f17583m;

    Z(String str) {
        super(str);
        this.f17583m = a(str);
    }

    private int a(String str) {
        if (str == null) {
            return 0;
        }
        String lowerCase = str.toLowerCase(Locale.US);
        lowerCase.hashCode();
        switch (lowerCase) {
        }
        return 0;
    }
}
