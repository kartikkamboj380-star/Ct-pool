package com.facebook.react.modules.blob;

import com.facebook.react.bridge.JavaScriptContextHolder;
import com.facebook.react.bridge.ReactContext;
import com.facebook.soloader.SoLoader;

/* JADX INFO: loaded from: classes.dex */
abstract class BlobCollector {

    class a implements Runnable {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        final /* synthetic */ ReactContext f11803m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ BlobModule f11804n;

        a(ReactContext reactContext, BlobModule blobModule) {
            this.f11803m = reactContext;
            this.f11804n = blobModule;
        }

        @Override // java.lang.Runnable
        public void run() {
            JavaScriptContextHolder javaScriptContextHolder = this.f11803m.getJavaScriptContextHolder();
            if (javaScriptContextHolder == null || javaScriptContextHolder.get() == 0) {
                return;
            }
            BlobCollector.nativeInstall(this.f11804n, javaScriptContextHolder.get());
        }
    }

    static {
        SoLoader.t("reactnativeblob");
    }

    static void b(ReactContext reactContext, BlobModule blobModule) {
        reactContext.runOnJSQueueThread(new a(reactContext, blobModule));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nativeInstall(Object obj, long j7);
}
