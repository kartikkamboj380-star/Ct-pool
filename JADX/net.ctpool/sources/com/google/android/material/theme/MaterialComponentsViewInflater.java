package com.google.android.material.theme;

import D3.a;
import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.app.r;
import androidx.appcompat.widget.C0527d;
import androidx.appcompat.widget.C0529f;
import androidx.appcompat.widget.C0530g;
import androidx.appcompat.widget.C0544v;
import androidx.appcompat.widget.D;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.i;
import com.google.android.material.textview.MaterialTextView;

/* JADX INFO: loaded from: classes.dex */
public class MaterialComponentsViewInflater extends r {
    @Override // androidx.appcompat.app.r
    protected C0527d c(Context context, AttributeSet attributeSet) {
        return new i(context, attributeSet);
    }

    @Override // androidx.appcompat.app.r
    protected C0529f d(Context context, AttributeSet attributeSet) {
        return new MaterialButton(context, attributeSet);
    }

    @Override // androidx.appcompat.app.r
    protected C0530g e(Context context, AttributeSet attributeSet) {
        return new a(context, attributeSet);
    }

    @Override // androidx.appcompat.app.r
    protected C0544v k(Context context, AttributeSet attributeSet) {
        return new J3.a(context, attributeSet);
    }

    @Override // androidx.appcompat.app.r
    protected D o(Context context, AttributeSet attributeSet) {
        return new MaterialTextView(context, attributeSet);
    }
}
