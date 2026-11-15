package com.facebook.react;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.KeyEvent;
import androidx.appcompat.app.AbstractActivityC0523c;
import m2.InterfaceC1871b;
import m2.InterfaceC1876g;
import m2.InterfaceC1877h;

/* JADX INFO: loaded from: classes.dex */
public abstract class ReactActivity extends AbstractActivityC0523c implements InterfaceC1871b, InterfaceC1876g {

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    private final AbstractC0862u f11132L = m0();

    protected ReactActivity() {
    }

    @Override // m2.InterfaceC1871b
    public void c() {
        super.onBackPressed();
    }

    protected abstract AbstractC0862u m0();

    @Override // androidx.fragment.app.AbstractActivityC0640j, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i7, int i8, Intent intent) {
        super.onActivityResult(i7, i8, intent);
        this.f11132L.n(i7, i8, intent);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (this.f11132L.o()) {
            return;
        }
        super.onBackPressed();
    }

    @Override // androidx.appcompat.app.AbstractActivityC0523c, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f11132L.p(configuration);
    }

    @Override // androidx.fragment.app.AbstractActivityC0640j, androidx.activity.ComponentActivity, androidx.core.app.AbstractActivityC0555g, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f11132L.q(bundle);
    }

    @Override // androidx.appcompat.app.AbstractActivityC0523c, androidx.fragment.app.AbstractActivityC0640j, android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        this.f11132L.r();
    }

    @Override // androidx.appcompat.app.AbstractActivityC0523c, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i7, KeyEvent keyEvent) {
        return this.f11132L.s(i7, keyEvent) || super.onKeyDown(i7, keyEvent);
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyLongPress(int i7, KeyEvent keyEvent) {
        return this.f11132L.t(i7, keyEvent) || super.onKeyLongPress(i7, keyEvent);
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i7, KeyEvent keyEvent) {
        return this.f11132L.u(i7, keyEvent) || super.onKeyUp(i7, keyEvent);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onNewIntent(Intent intent) {
        if (this.f11132L.v(intent)) {
            return;
        }
        super.onNewIntent(intent);
    }

    @Override // androidx.fragment.app.AbstractActivityC0640j, android.app.Activity
    protected void onPause() {
        super.onPause();
        this.f11132L.w();
    }

    @Override // androidx.fragment.app.AbstractActivityC0640j, androidx.activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int i7, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i7, strArr, iArr);
        this.f11132L.x(i7, strArr, iArr);
    }

    @Override // androidx.fragment.app.AbstractActivityC0640j, android.app.Activity
    protected void onResume() {
        super.onResume();
        this.f11132L.y();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z6) {
        super.onWindowFocusChanged(z6);
        this.f11132L.z(z6);
    }

    @Override // m2.InterfaceC1876g
    public void p(String[] strArr, int i7, InterfaceC1877h interfaceC1877h) {
        this.f11132L.A(strArr, i7, interfaceC1877h);
    }
}
