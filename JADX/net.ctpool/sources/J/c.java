package J;

import android.text.Editable;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.widget.TextView;

/* JADX INFO: loaded from: classes.dex */
final class c extends InputConnectionWrapper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final TextView f1539a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a f1540b;

    public static class a {
        public boolean a(InputConnection inputConnection, Editable editable, int i7, int i8, boolean z6) {
            return androidx.emoji2.text.e.e(inputConnection, editable, i7, i8, z6);
        }

        public void b(EditorInfo editorInfo) {
            if (androidx.emoji2.text.e.h()) {
                androidx.emoji2.text.e.b().u(editorInfo);
            }
        }
    }

    c(TextView textView, InputConnection inputConnection, EditorInfo editorInfo) {
        this(textView, inputConnection, editorInfo, new a());
    }

    private Editable a() {
        return this.f1539a.getEditableText();
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public boolean deleteSurroundingText(int i7, int i8) {
        return this.f1540b.a(this, a(), i7, i8, false) || super.deleteSurroundingText(i7, i8);
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public boolean deleteSurroundingTextInCodePoints(int i7, int i8) {
        return this.f1540b.a(this, a(), i7, i8, true) || super.deleteSurroundingTextInCodePoints(i7, i8);
    }

    c(TextView textView, InputConnection inputConnection, EditorInfo editorInfo, a aVar) {
        super(inputConnection, false);
        this.f1539a = textView;
        this.f1540b = aVar;
        aVar.b(editorInfo);
    }
}
