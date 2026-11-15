package androidx.core.app;

import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import androidx.core.view.AbstractC0596p;
import androidx.lifecycle.AbstractC0651h;

/* JADX INFO: renamed from: androidx.core.app.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractActivityC0555g extends Activity implements androidx.lifecycle.l, AbstractC0596p.a {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private n.g f6962m = new n.g();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private androidx.lifecycle.m f6963n = new androidx.lifecycle.m(this);

    private static boolean v(String[] strArr) {
        if (strArr != null && strArr.length > 0) {
            String str = strArr[0];
            str.hashCode();
            switch (str) {
                case "--translation":
                    if (Build.VERSION.SDK_INT < 31) {
                        break;
                    }
                    break;
                case "--contentcapture":
                    if (Build.VERSION.SDK_INT < 29) {
                        break;
                    }
                    break;
                case "--autofill":
                    if (Build.VERSION.SDK_INT < 26) {
                        break;
                    }
                    break;
            }
            return false;
        }
        return false;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        View decorView = getWindow().getDecorView();
        if (decorView == null || !AbstractC0596p.d(decorView, keyEvent)) {
            return AbstractC0596p.e(this, decorView, this, keyEvent);
        }
        return true;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        View decorView = getWindow().getDecorView();
        if (decorView == null || !AbstractC0596p.d(decorView, keyEvent)) {
            return super.dispatchKeyShortcutEvent(keyEvent);
        }
        return true;
    }

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        androidx.lifecycle.v.g(this);
    }

    @Override // android.app.Activity
    protected void onSaveInstanceState(Bundle bundle) {
        this.f6963n.j(AbstractC0651h.c.CREATED);
        super.onSaveInstanceState(bundle);
    }

    @Override // androidx.core.view.AbstractC0596p.a
    public boolean q(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    protected final boolean u(String[] strArr) {
        return !v(strArr);
    }
}
