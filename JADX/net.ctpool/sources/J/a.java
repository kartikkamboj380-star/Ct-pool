package J;

import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
import com.google.android.gms.common.api.Api;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b f1531a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f1532b = Api.BaseClientBuilder.API_PRIORITY_OTHER;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f1533c = 0;

    /* JADX INFO: renamed from: J.a$a, reason: collision with other inner class name */
    private static class C0028a extends b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final EditText f1534a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final g f1535b;

        C0028a(EditText editText, boolean z6) {
            this.f1534a = editText;
            g gVar = new g(editText, z6);
            this.f1535b = gVar;
            editText.addTextChangedListener(gVar);
            editText.setEditableFactory(J.b.getInstance());
        }

        @Override // J.a.b
        KeyListener a(KeyListener keyListener) {
            if (keyListener instanceof e) {
                return keyListener;
            }
            if (keyListener == null) {
                return null;
            }
            return keyListener instanceof NumberKeyListener ? keyListener : new e(keyListener);
        }

        @Override // J.a.b
        InputConnection b(InputConnection inputConnection, EditorInfo editorInfo) {
            return inputConnection instanceof c ? inputConnection : new c(this.f1534a, inputConnection, editorInfo);
        }

        @Override // J.a.b
        void c(boolean z6) {
            this.f1535b.c(z6);
        }
    }

    static class b {
        b() {
        }

        abstract KeyListener a(KeyListener keyListener);

        abstract InputConnection b(InputConnection inputConnection, EditorInfo editorInfo);

        abstract void c(boolean z6);
    }

    public a(EditText editText, boolean z6) {
        androidx.core.util.f.g(editText, "editText cannot be null");
        this.f1531a = new C0028a(editText, z6);
    }

    public KeyListener a(KeyListener keyListener) {
        return this.f1531a.a(keyListener);
    }

    public InputConnection b(InputConnection inputConnection, EditorInfo editorInfo) {
        if (inputConnection == null) {
            return null;
        }
        return this.f1531a.b(inputConnection, editorInfo);
    }

    public void c(boolean z6) {
        this.f1531a.c(z6);
    }
}
