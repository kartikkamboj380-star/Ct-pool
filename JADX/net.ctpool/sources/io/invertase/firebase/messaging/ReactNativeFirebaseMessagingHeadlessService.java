package io.invertase.firebase.messaging;

import android.content.Intent;
import com.facebook.react.AbstractServiceC0825h;
import com.google.firebase.messaging.V;
import h2.C1706a;

/* JADX INFO: loaded from: classes.dex */
public class ReactNativeFirebaseMessagingHeadlessService extends AbstractServiceC0825h {
    @Override // com.facebook.react.AbstractServiceC0825h
    protected C1706a g(Intent intent) {
        if (intent.getExtras() == null) {
            return null;
        }
        return new C1706a("ReactNativeFirebaseMessagingHeadlessTask", q.i((V) intent.getParcelableExtra("message")), g5.i.h().f("messaging_android_headless_task_timeout", 60000L), true);
    }
}
