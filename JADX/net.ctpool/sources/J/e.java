package J;

import android.text.Editable;
import android.text.method.KeyListener;
import android.view.KeyEvent;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
final class e implements KeyListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final KeyListener f1545a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a f1546b;

    public static class a {
        public boolean a(Editable editable, int i7, KeyEvent keyEvent) {
            return androidx.emoji2.text.e.f(editable, i7, keyEvent);
        }
    }

    e(KeyListener keyListener) {
        this(keyListener, new a());
    }

    @Override // android.text.method.KeyListener
    public void clearMetaKeyState(View view, Editable editable, int i7) {
        this.f1545a.clearMetaKeyState(view, editable, i7);
    }

    @Override // android.text.method.KeyListener
    public int getInputType() {
        return this.f1545a.getInputType();
    }

    @Override // android.text.method.KeyListener
    public boolean onKeyDown(View view, Editable editable, int i7, KeyEvent keyEvent) {
        return this.f1546b.a(editable, i7, keyEvent) || this.f1545a.onKeyDown(view, editable, i7, keyEvent);
    }

    @Override // android.text.method.KeyListener
    public boolean onKeyOther(View view, Editable editable, KeyEvent keyEvent) {
        return this.f1545a.onKeyOther(view, editable, keyEvent);
    }

    @Override // android.text.method.KeyListener
    public boolean onKeyUp(View view, Editable editable, int i7, KeyEvent keyEvent) {
        return this.f1545a.onKeyUp(view, editable, i7, keyEvent);
    }

    e(KeyListener keyListener, a aVar) {
        this.f1545a = keyListener;
        this.f1546b = aVar;
    }
}
