package com.swmansion.rnscreens;

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import androidx.appcompat.widget.SearchView;
import e.AbstractC1614f;

/* JADX INFO: loaded from: classes.dex */
public final class L {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private SearchView f18377a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Integer f18378b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Drawable f18379c;

    public L(SearchView searchView) {
        w5.k.f(searchView, "searchView");
        this.f18377a = searchView;
    }

    private final ImageView a() {
        return (ImageView) this.f18377a.findViewById(AbstractC1614f.f18861y);
    }

    private final EditText b() {
        View viewFindViewById = this.f18377a.findViewById(AbstractC1614f.f18824D);
        if (viewFindViewById instanceof EditText) {
            return (EditText) viewFindViewById;
        }
        return null;
    }

    private final ImageView c() {
        return (ImageView) this.f18377a.findViewById(AbstractC1614f.f18860x);
    }

    private final View d() {
        return this.f18377a.findViewById(AbstractC1614f.f18823C);
    }

    public final void e(Integer num) {
        if (num != null) {
            int iIntValue = num.intValue();
            c().setColorFilter(iIntValue);
            a().setColorFilter(iIntValue);
        }
    }

    public final void f(Integer num) {
        if (num != null) {
            int iIntValue = num.intValue();
            EditText editTextB = b();
            if (editTextB != null) {
                editTextB.setHintTextColor(iIntValue);
            }
        }
    }

    public final void g(String str, boolean z6) {
        w5.k.f(str, "placeholder");
        if (z6) {
            this.f18377a.setQueryHint(str);
            return;
        }
        EditText editTextB = b();
        if (editTextB == null) {
            return;
        }
        editTextB.setHint(str);
    }

    public final void h(Integer num) {
        EditText editTextB;
        ColorStateList textColors;
        Integer num2 = this.f18378b;
        if (num == null) {
            if (num2 == null || (editTextB = b()) == null) {
                return;
            }
            editTextB.setTextColor(num2.intValue());
            return;
        }
        if (num2 == null) {
            EditText editTextB2 = b();
            this.f18378b = (editTextB2 == null || (textColors = editTextB2.getTextColors()) == null) ? null : Integer.valueOf(textColors.getDefaultColor());
        }
        EditText editTextB3 = b();
        if (editTextB3 != null) {
            editTextB3.setTextColor(num.intValue());
        }
    }

    public final void i(Integer num) {
        Drawable drawable = this.f18379c;
        if (num != null) {
            if (drawable == null) {
                this.f18379c = d().getBackground();
            }
            d().setBackgroundColor(num.intValue());
        } else if (drawable != null) {
            d().setBackground(drawable);
        }
    }
}
