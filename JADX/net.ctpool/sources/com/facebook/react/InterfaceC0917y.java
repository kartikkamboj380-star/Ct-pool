package com.facebook.react;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import c2.InterfaceC0711a;
import m2.InterfaceC1871b;

/* JADX INFO: renamed from: com.facebook.react.y, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC0917y {
    InterfaceC0711a a(Context context, String str, Bundle bundle);

    void b(Activity activity, InterfaceC1871b interfaceC1871b);

    void c(Context context);

    void d(Activity activity);

    void e(Activity activity);

    X1.e f();

    boolean g();

    void onActivityResult(Activity activity, int i7, int i8, Intent intent);

    void onNewIntent(Intent intent);

    void onWindowFocusChange(boolean z6);
}
