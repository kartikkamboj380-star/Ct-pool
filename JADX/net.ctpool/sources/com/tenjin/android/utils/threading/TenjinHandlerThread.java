package com.tenjin.android.utils.threading;

import android.os.Handler;
import android.os.HandlerThread;

/* JADX INFO: loaded from: classes.dex */
public class TenjinHandlerThread extends HandlerThread implements IThreading {
    private Handler handler;

    public TenjinHandlerThread(String str) {
        super(str, 10);
    }

    @Override // com.tenjin.android.utils.threading.IThreading
    public void post(Runnable runnable) {
        if (this.handler == null) {
            this.handler = new Handler(getLooper());
        }
        this.handler.post(runnable);
    }
}
