package J;

import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.TextWatcher;
import android.widget.EditText;
import androidx.emoji2.text.e;
import com.google.android.gms.common.api.Api;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
final class g implements TextWatcher {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final EditText f1552m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final boolean f1553n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private e.AbstractC0156e f1554o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f1555p = Api.BaseClientBuilder.API_PRIORITY_OTHER;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f1556q = 0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f1557r = true;

    private static class a extends e.AbstractC0156e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Reference f1558a;

        a(EditText editText) {
            this.f1558a = new WeakReference(editText);
        }

        @Override // androidx.emoji2.text.e.AbstractC0156e
        public void b() {
            super.b();
            g.b((EditText) this.f1558a.get(), 1);
        }
    }

    g(EditText editText, boolean z6) {
        this.f1552m = editText;
        this.f1553n = z6;
    }

    private e.AbstractC0156e a() {
        if (this.f1554o == null) {
            this.f1554o = new a(this.f1552m);
        }
        return this.f1554o;
    }

    static void b(EditText editText, int i7) {
        if (i7 == 1 && editText != null && editText.isAttachedToWindow()) {
            Editable editableText = editText.getEditableText();
            int selectionStart = Selection.getSelectionStart(editableText);
            int selectionEnd = Selection.getSelectionEnd(editableText);
            androidx.emoji2.text.e.b().o(editableText);
            d.b(editableText, selectionStart, selectionEnd);
        }
    }

    private boolean d() {
        return (this.f1557r && (this.f1553n || androidx.emoji2.text.e.h())) ? false : true;
    }

    public void c(boolean z6) {
        if (this.f1557r != z6) {
            if (this.f1554o != null) {
                androidx.emoji2.text.e.b().t(this.f1554o);
            }
            this.f1557r = z6;
            if (z6) {
                b(this.f1552m, androidx.emoji2.text.e.b().d());
            }
        }
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(CharSequence charSequence, int i7, int i8, int i9) {
        if (this.f1552m.isInEditMode() || d() || i8 > i9 || !(charSequence instanceof Spannable)) {
            return;
        }
        int iD = androidx.emoji2.text.e.b().d();
        if (iD != 0) {
            if (iD == 1) {
                androidx.emoji2.text.e.b().r((Spannable) charSequence, i7, i7 + i9, this.f1555p, this.f1556q);
                return;
            } else if (iD != 3) {
                return;
            }
        }
        androidx.emoji2.text.e.b().s(a());
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence charSequence, int i7, int i8, int i9) {
    }
}
