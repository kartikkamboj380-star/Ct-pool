package J;

import android.text.InputFilter;
import android.text.Selection;
import android.text.Spannable;
import android.text.Spanned;
import android.widget.TextView;
import androidx.emoji2.text.e;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
final class d implements InputFilter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final TextView f1541a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private e.AbstractC0156e f1542b;

    private static class a extends e.AbstractC0156e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Reference f1543a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Reference f1544b;

        a(TextView textView, d dVar) {
            this.f1543a = new WeakReference(textView);
            this.f1544b = new WeakReference(dVar);
        }

        private boolean c(TextView textView, InputFilter inputFilter) {
            InputFilter[] filters;
            if (inputFilter == null || textView == null || (filters = textView.getFilters()) == null) {
                return false;
            }
            for (InputFilter inputFilter2 : filters) {
                if (inputFilter2 == inputFilter) {
                    return true;
                }
            }
            return false;
        }

        @Override // androidx.emoji2.text.e.AbstractC0156e
        public void b() {
            CharSequence text;
            CharSequence charSequenceO;
            super.b();
            TextView textView = (TextView) this.f1543a.get();
            if (c(textView, (InputFilter) this.f1544b.get()) && textView.isAttachedToWindow() && text != (charSequenceO = androidx.emoji2.text.e.b().o((text = textView.getText())))) {
                int selectionStart = Selection.getSelectionStart(charSequenceO);
                int selectionEnd = Selection.getSelectionEnd(charSequenceO);
                textView.setText(charSequenceO);
                if (charSequenceO instanceof Spannable) {
                    d.b((Spannable) charSequenceO, selectionStart, selectionEnd);
                }
            }
        }
    }

    d(TextView textView) {
        this.f1541a = textView;
    }

    private e.AbstractC0156e a() {
        if (this.f1542b == null) {
            this.f1542b = new a(this.f1541a, this);
        }
        return this.f1542b;
    }

    static void b(Spannable spannable, int i7, int i8) {
        if (i7 >= 0 && i8 >= 0) {
            Selection.setSelection(spannable, i7, i8);
        } else if (i7 >= 0) {
            Selection.setSelection(spannable, i7);
        } else if (i8 >= 0) {
            Selection.setSelection(spannable, i8);
        }
    }

    @Override // android.text.InputFilter
    public CharSequence filter(CharSequence charSequence, int i7, int i8, Spanned spanned, int i9, int i10) {
        if (this.f1541a.isInEditMode()) {
            return charSequence;
        }
        int iD = androidx.emoji2.text.e.b().d();
        if (iD != 0) {
            if (iD == 1) {
                if ((i10 == 0 && i9 == 0 && spanned.length() == 0 && charSequence == this.f1541a.getText()) || charSequence == null) {
                    return charSequence;
                }
                if (i7 != 0 || i8 != charSequence.length()) {
                    charSequence = charSequence.subSequence(i7, i8);
                }
                return androidx.emoji2.text.e.b().p(charSequence, 0, charSequence.length());
            }
            if (iD != 3) {
                return charSequence;
            }
        }
        androidx.emoji2.text.e.b().s(a());
        return charSequence;
    }
}
