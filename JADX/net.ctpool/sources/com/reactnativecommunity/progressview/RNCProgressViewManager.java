package com.reactnativecommunity.progressview;

import android.widget.ProgressBar;
import com.facebook.react.uimanager.C0872e0;
import com.facebook.react.uimanager.SimpleViewManager;
import i2.InterfaceC1741a;
import x2.InterfaceC2218a;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC1741a(name = "RNCProgressView")
public class RNCProgressViewManager extends SimpleViewManager<ProgressBar> {
    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return "RNCProgressView";
    }

    @InterfaceC2218a(name = "isIndeterminate")
    public void setIsIndeterminate(ProgressBar progressBar, boolean z6) {
        a.b(progressBar, z6);
    }

    @InterfaceC2218a(name = "progress")
    public void setProgress(ProgressBar progressBar, double d7) {
        a.c(progressBar, d7);
    }

    @InterfaceC2218a(customType = "Color", name = "progressTintColor")
    public void setProgressTintColor(ProgressBar progressBar, int i7) {
        a.d(progressBar, i7);
    }

    @InterfaceC2218a(customType = "Color", name = "trackTintColor")
    public void setTrackTintColor(ProgressBar progressBar, int i7) {
        a.e(progressBar, i7);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.ViewManager
    public ProgressBar createViewInstance(C0872e0 c0872e0) {
        return a.a(c0872e0);
    }
}
