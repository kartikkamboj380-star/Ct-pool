package com.facebook.react.bridge;

/* JADX INFO: loaded from: classes.dex */
@R1.a
public interface JavaJSExecutor {

    public interface Factory {
        JavaJSExecutor create();
    }

    public static class ProxyExecutorException extends Exception {
        public ProxyExecutorException(Throwable th) {
            super(th);
        }
    }

    void close();

    @R1.a
    String executeJSCall(String str, String str2);

    @R1.a
    void loadBundle(String str);

    @R1.a
    void setGlobalVariable(String str, String str2);
}
