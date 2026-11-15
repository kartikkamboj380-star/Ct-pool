package com.facebook.react.views.textinput;

import android.text.SpannableStringBuilder;
import android.widget.EditText;

/* JADX INFO: loaded from: classes.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final SpannableStringBuilder f13234a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f13235b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f13236c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f13237d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f13238e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f13239f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final CharSequence f13240g;

    public r(EditText editText) {
        this.f13234a = new SpannableStringBuilder(editText.getText());
        this.f13235b = editText.getTextSize();
        this.f13238e = editText.getInputType();
        this.f13240g = editText.getHint();
        this.f13236c = editText.getMinLines();
        this.f13237d = editText.getMaxLines();
        this.f13239f = editText.getBreakStrategy();
    }

    public void a(EditText editText) {
        editText.setText(this.f13234a);
        editText.setTextSize(0, this.f13235b);
        editText.setMinLines(this.f13236c);
        editText.setMaxLines(this.f13237d);
        editText.setInputType(this.f13238e);
        editText.setHint(this.f13240g);
        editText.setBreakStrategy(this.f13239f);
    }
}
