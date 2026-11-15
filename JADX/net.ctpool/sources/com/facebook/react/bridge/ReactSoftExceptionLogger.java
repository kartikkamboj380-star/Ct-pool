package com.facebook.react.bridge;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes.dex */
@R1.a
public class ReactSoftExceptionLogger {
    private static final List<ReactSoftExceptionListener> sListeners = new CopyOnWriteArrayList();

    public interface ReactSoftExceptionListener {
        void logSoftException(String str, Throwable th);
    }

    @R1.a
    public static void addListener(ReactSoftExceptionListener reactSoftExceptionListener) {
        List<ReactSoftExceptionListener> list = sListeners;
        if (list.contains(reactSoftExceptionListener)) {
            return;
        }
        list.add(reactSoftExceptionListener);
    }

    @R1.a
    public static void clearListeners() {
        sListeners.clear();
    }

    @R1.a
    private static void logNoThrowSoftExceptionWithMessage(String str, String str2) {
        logSoftException(str, new ReactNoCrashSoftException(str2));
    }

    @R1.a
    public static void logSoftException(String str, Throwable th) {
        List<ReactSoftExceptionListener> list = sListeners;
        if (list.size() <= 0) {
            P0.a.k(str, "Unhandled SoftException", th);
            return;
        }
        Iterator<ReactSoftExceptionListener> it = list.iterator();
        while (it.hasNext()) {
            it.next().logSoftException(str, th);
        }
    }

    @R1.a
    public static void logSoftExceptionVerbose(String str, Throwable th) {
        logSoftException(str + "|" + th.getClass().getSimpleName() + ":" + th.getMessage(), th);
    }

    @R1.a
    public static void removeListener(ReactSoftExceptionListener reactSoftExceptionListener) {
        sListeners.remove(reactSoftExceptionListener);
    }
}
