package com.google.android.material.textfield;

import android.text.TextWatcher;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;

/* JADX INFO: loaded from: classes.dex */
class k extends f {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final TextWatcher f17245e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final TextInputLayout.f f17246f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final TextInputLayout.g f17247g;

    class a extends com.google.android.material.internal.k {
        a() {
        }

        @Override // com.google.android.material.internal.k, android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i7, int i8, int i9) {
            k.this.f17211c.setChecked(!r1.g());
        }
    }

    class b implements TextInputLayout.f {
        b() {
        }

        @Override // com.google.android.material.textfield.TextInputLayout.f
        public void a(TextInputLayout textInputLayout) {
            EditText editText = textInputLayout.getEditText();
            k.this.f17211c.setChecked(!r0.g());
            editText.removeTextChangedListener(k.this.f17245e);
            editText.addTextChangedListener(k.this.f17245e);
        }
    }

    class c implements TextInputLayout.g {

        class a implements Runnable {

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            final /* synthetic */ EditText f17251m;

            a(EditText editText) {
                this.f17251m = editText;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f17251m.removeTextChangedListener(k.this.f17245e);
            }
        }

        c() {
        }

        @Override // com.google.android.material.textfield.TextInputLayout.g
        public void a(TextInputLayout textInputLayout, int i7) {
            EditText editText = textInputLayout.getEditText();
            if (editText == null || i7 != 1) {
                return;
            }
            editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
            editText.post(new a(editText));
        }
    }

    class d implements View.OnClickListener {
        d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            EditText editText = k.this.f17209a.getEditText();
            if (editText == null) {
                return;
            }
            int selectionEnd = editText.getSelectionEnd();
            editText.setTransformationMethod(k.this.g() ? null : PasswordTransformationMethod.getInstance());
            if (selectionEnd >= 0) {
                editText.setSelection(selectionEnd);
            }
            k.this.f17209a.U();
        }
    }

    k(TextInputLayout textInputLayout, int i7) {
        super(textInputLayout, i7);
        this.f17245e = new a();
        this.f17246f = new b();
        this.f17247g = new c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean g() {
        EditText editText = this.f17209a.getEditText();
        return editText != null && (editText.getTransformationMethod() instanceof PasswordTransformationMethod);
    }

    private static boolean h(EditText editText) {
        return editText != null && (editText.getInputType() == 16 || editText.getInputType() == 128 || editText.getInputType() == 144 || editText.getInputType() == 224);
    }

    @Override // com.google.android.material.textfield.f
    void a() {
        TextInputLayout textInputLayout = this.f17209a;
        int i7 = this.f17212d;
        if (i7 == 0) {
            i7 = A3.d.f175a;
        }
        textInputLayout.setEndIconDrawable(i7);
        TextInputLayout textInputLayout2 = this.f17209a;
        textInputLayout2.setEndIconContentDescription(textInputLayout2.getResources().getText(A3.h.f256p));
        this.f17209a.setEndIconVisible(true);
        this.f17209a.setEndIconCheckable(true);
        this.f17209a.setEndIconOnClickListener(new d());
        this.f17209a.g(this.f17246f);
        this.f17209a.h(this.f17247g);
        EditText editText = this.f17209a.getEditText();
        if (h(editText)) {
            editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }
}
