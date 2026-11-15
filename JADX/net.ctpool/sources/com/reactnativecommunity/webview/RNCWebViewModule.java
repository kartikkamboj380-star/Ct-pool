package com.reactnativecommunity.webview;

import android.app.DownloadManager;
import android.net.Uri;
import android.webkit.ValueCallback;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import i2.InterfaceC1741a;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC1741a(name = "RNCWebViewModule")
public class RNCWebViewModule extends ReactContextBaseJavaModule {
    private final l mRNCWebViewModuleImpl;

    public RNCWebViewModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.mRNCWebViewModuleImpl = new l(reactApplicationContext);
    }

    public void downloadFile(String str) {
        this.mRNCWebViewModuleImpl.h(str);
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "RNCWebViewModule";
    }

    public boolean grantFileDownloaderPermissions(String str, String str2) {
        return this.mRNCWebViewModuleImpl.t(str, str2);
    }

    @ReactMethod
    public void isFileUploadSupported(Promise promise) {
        promise.resolve(Boolean.valueOf(this.mRNCWebViewModuleImpl.u()));
    }

    public void setDownloadRequest(DownloadManager.Request request) {
        this.mRNCWebViewModuleImpl.x(request);
    }

    @ReactMethod
    public void shouldStartLoadWithLockIdentifier(boolean z6, double d7) {
        this.mRNCWebViewModuleImpl.y(z6, d7);
    }

    public void startPhotoPickerIntent(ValueCallback<Uri> valueCallback, String str) {
        this.mRNCWebViewModuleImpl.z(str, valueCallback);
    }

    public boolean startPhotoPickerIntent(ValueCallback<Uri[]> valueCallback, String[] strArr, boolean z6, boolean z7) {
        return this.mRNCWebViewModuleImpl.A(strArr, z6, valueCallback, z7);
    }
}
