package com.google.android.gms.common.internal;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.Button;
import com.google.android.gms.common.util.DeviceProperties;
import m3.AbstractC1880a;

/* JADX INFO: loaded from: classes.dex */
public final class zaaa extends Button {
    public zaaa(Context context, AttributeSet attributeSet) {
        super(context, null, R.attr.buttonStyle);
    }

    private static final int zab(int i7, int i8, int i9, int i10) {
        if (i7 == 0) {
            return i8;
        }
        if (i7 == 1) {
            return i9;
        }
        if (i7 == 2) {
            return i10;
        }
        throw new IllegalStateException("Unknown color scheme: " + i7);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zaa(Resources resources, int i7, int i8) {
        int i9;
        setTypeface(Typeface.DEFAULT_BOLD);
        setTextSize(14.0f);
        int i10 = (int) ((resources.getDisplayMetrics().density * 48.0f) + 0.5f);
        setMinHeight(i10);
        setMinWidth(i10);
        int i11 = m3.b.f21228b;
        int i12 = m3.b.f21229c;
        int iZab = zab(i8, i11, i12, i12);
        int i13 = m3.b.f21230d;
        int i14 = m3.b.f21231e;
        int iZab2 = zab(i8, i13, i14, i14);
        if (i7 == 0 || i7 == 1) {
            iZab = iZab2;
        } else if (i7 != 2) {
            throw new IllegalStateException("Unknown button size: " + i7);
        }
        Drawable drawableL = androidx.core.graphics.drawable.a.l(resources.getDrawable(iZab));
        androidx.core.graphics.drawable.a.i(drawableL, resources.getColorStateList(AbstractC1880a.f21226c));
        androidx.core.graphics.drawable.a.j(drawableL, PorterDuff.Mode.SRC_ATOP);
        setBackgroundDrawable(drawableL);
        int i15 = AbstractC1880a.f21224a;
        int i16 = AbstractC1880a.f21225b;
        setTextColor((ColorStateList) Preconditions.checkNotNull(resources.getColorStateList(zab(i8, i15, i16, i16))));
        if (i7 == 0) {
            i9 = m3.c.f21247p;
        } else {
            if (i7 != 1) {
                if (i7 != 2) {
                    throw new IllegalStateException("Unknown button size: " + i7);
                }
                setText((CharSequence) null);
                setTransformationMethod(null);
                if (DeviceProperties.isWearable(getContext())) {
                    return;
                }
                setGravity(19);
                return;
            }
            i9 = m3.c.f21248q;
        }
        setText(resources.getString(i9));
        setTransformationMethod(null);
        if (DeviceProperties.isWearable(getContext())) {
        }
    }
}
