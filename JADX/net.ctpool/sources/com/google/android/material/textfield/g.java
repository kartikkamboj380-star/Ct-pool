package com.google.android.material.textfield;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.core.view.H;
import com.google.android.material.internal.CheckableImageButton;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
abstract class g {
    static void a(TextInputLayout textInputLayout, CheckableImageButton checkableImageButton, ColorStateList colorStateList, PorterDuff.Mode mode) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (drawable != null) {
            drawable = androidx.core.graphics.drawable.a.l(drawable).mutate();
            if (colorStateList == null || !colorStateList.isStateful()) {
                androidx.core.graphics.drawable.a.i(drawable, colorStateList);
            } else {
                androidx.core.graphics.drawable.a.i(drawable, ColorStateList.valueOf(colorStateList.getColorForState(b(textInputLayout, checkableImageButton), colorStateList.getDefaultColor())));
            }
            if (mode != null) {
                androidx.core.graphics.drawable.a.j(drawable, mode);
            }
        }
        if (checkableImageButton.getDrawable() != drawable) {
            checkableImageButton.setImageDrawable(drawable);
        }
    }

    private static int[] b(TextInputLayout textInputLayout, CheckableImageButton checkableImageButton) {
        int[] drawableState = textInputLayout.getDrawableState();
        int[] drawableState2 = checkableImageButton.getDrawableState();
        int length = drawableState.length;
        int[] iArrCopyOf = Arrays.copyOf(drawableState, drawableState.length + drawableState2.length);
        System.arraycopy(drawableState2, 0, iArrCopyOf, length, drawableState2.length);
        return iArrCopyOf;
    }

    static void c(TextInputLayout textInputLayout, CheckableImageButton checkableImageButton, ColorStateList colorStateList) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (checkableImageButton.getDrawable() == null || colorStateList == null || !colorStateList.isStateful()) {
            return;
        }
        int colorForState = colorStateList.getColorForState(b(textInputLayout, checkableImageButton), colorStateList.getDefaultColor());
        Drawable drawableMutate = androidx.core.graphics.drawable.a.l(drawable).mutate();
        androidx.core.graphics.drawable.a.i(drawableMutate, ColorStateList.valueOf(colorForState));
        checkableImageButton.setImageDrawable(drawableMutate);
    }

    private static void d(CheckableImageButton checkableImageButton, View.OnLongClickListener onLongClickListener) {
        boolean zO = H.O(checkableImageButton);
        boolean z6 = onLongClickListener != null;
        boolean z7 = zO || z6;
        checkableImageButton.setFocusable(z7);
        checkableImageButton.setClickable(zO);
        checkableImageButton.setPressable(zO);
        checkableImageButton.setLongClickable(z6);
        H.z0(checkableImageButton, z7 ? 1 : 2);
    }

    static void e(CheckableImageButton checkableImageButton, View.OnClickListener onClickListener, View.OnLongClickListener onLongClickListener) {
        checkableImageButton.setOnClickListener(onClickListener);
        d(checkableImageButton, onLongClickListener);
    }

    static void f(CheckableImageButton checkableImageButton, View.OnLongClickListener onLongClickListener) {
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        d(checkableImageButton, onLongClickListener);
    }
}
