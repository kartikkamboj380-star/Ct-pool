package com.google.android.material.timepicker;

import A3.e;
import A3.g;
import android.content.Context;
import android.content.res.Configuration;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Checkable;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.material.chip.Chip;
import com.google.android.material.internal.k;
import com.google.android.material.internal.n;
import com.google.android.material.textfield.TextInputLayout;

/* JADX INFO: loaded from: classes.dex */
class ChipTextInputComboView extends FrameLayout implements Checkable {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final Chip f17262m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final TextInputLayout f17263n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final EditText f17264o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private TextWatcher f17265p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private TextView f17266q;

    private class b extends k {
        private b() {
        }

        @Override // com.google.android.material.internal.k, android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            if (TextUtils.isEmpty(editable)) {
                ChipTextInputComboView.this.f17262m.setText(ChipTextInputComboView.this.c("00"));
            } else {
                ChipTextInputComboView.this.f17262m.setText(ChipTextInputComboView.this.c(editable));
            }
        }
    }

    public ChipTextInputComboView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String c(CharSequence charSequence) {
        return c.a(getResources(), charSequence);
    }

    private void d() {
        this.f17264o.setImeHintLocales(getContext().getResources().getConfiguration().getLocales());
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
        return this.f17262m.isChecked();
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        d();
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z6) {
        this.f17262m.setChecked(z6);
        this.f17264o.setVisibility(z6 ? 0 : 4);
        this.f17262m.setVisibility(z6 ? 8 : 0);
        if (isChecked()) {
            n.h(this.f17264o);
            if (TextUtils.isEmpty(this.f17264o.getText())) {
                return;
            }
            EditText editText = this.f17264o;
            editText.setSelection(editText.getText().length());
        }
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.f17262m.setOnClickListener(onClickListener);
    }

    @Override // android.view.View
    public void setTag(int i7, Object obj) {
        this.f17262m.setTag(i7, obj);
    }

    @Override // android.widget.Checkable
    public void toggle() {
        this.f17262m.toggle();
    }

    public ChipTextInputComboView(Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        Chip chip = (Chip) layoutInflaterFrom.inflate(g.f229g, (ViewGroup) this, false);
        this.f17262m = chip;
        chip.setAccessibilityClassName("android.view.View");
        TextInputLayout textInputLayout = (TextInputLayout) layoutInflaterFrom.inflate(g.f230h, (ViewGroup) this, false);
        this.f17263n = textInputLayout;
        EditText editText = textInputLayout.getEditText();
        this.f17264o = editText;
        editText.setVisibility(4);
        b bVar = new b();
        this.f17265p = bVar;
        editText.addTextChangedListener(bVar);
        d();
        addView(chip);
        addView(textInputLayout);
        this.f17266q = (TextView) findViewById(e.f206l);
        editText.setSaveEnabled(false);
        editText.setLongClickable(false);
    }
}
