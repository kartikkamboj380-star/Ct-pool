package com.facebook.react.bridge;

/* JADX INFO: loaded from: classes.dex */
public final class SoftAssertions {
    public static final SoftAssertions INSTANCE = new SoftAssertions();

    private SoftAssertions() {
    }

    public static final void assertCondition(boolean z6, String str) {
        w5.k.f(str, "message");
        if (z6) {
            return;
        }
        ReactSoftExceptionLogger.logSoftException("SoftAssertions", new AssertionException(str));
    }

    public static final <T> T assertNotNull(T t6) {
        if (t6 == null) {
            ReactSoftExceptionLogger.logSoftException("SoftAssertions", new AssertionException("Expected object to not be null!"));
        }
        return t6;
    }

    public static final void assertUnreachable(String str) {
        w5.k.f(str, "message");
        ReactSoftExceptionLogger.logSoftException("SoftAssertions", new AssertionException(str));
    }
}
