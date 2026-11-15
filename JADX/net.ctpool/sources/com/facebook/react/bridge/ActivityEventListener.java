package com.facebook.react.bridge;

import android.app.Activity;
import android.content.Intent;

/* JADX INFO: loaded from: classes.dex */
public interface ActivityEventListener {
    void onActivityResult(Activity activity, int i7, int i8, Intent intent);

    void onNewIntent(Intent intent);
}
