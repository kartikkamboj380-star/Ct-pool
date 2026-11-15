package com.google.android.gms.internal.base;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadFactory;

/* JADX INFO: loaded from: classes.dex */
public interface p {
    ExecutorService a(int i7, int i8);

    ExecutorService b(int i7, ThreadFactory threadFactory, int i8);

    ExecutorService c(ThreadFactory threadFactory, int i7);
}
