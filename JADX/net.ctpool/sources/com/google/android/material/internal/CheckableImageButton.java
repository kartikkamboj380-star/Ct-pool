package com.google.android.material.internal;

import android.R;
import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.Checkable;
import androidx.appcompat.widget.C0539p;
import androidx.core.view.C0574a;
import androidx.core.view.H;
import androidx.core.view.accessibility.C;
import e.AbstractC1609a;
import z.AbstractC2252a;

/* JADX INFO: loaded from: classes.dex */
public class CheckableImageButton extends C0539p implements Checkable {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final int[] f16902s = {R.attr.state_checked};

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f16903p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f16904q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f16905r;

    class a extends C0574a {
        a() {
        }

        @Override // androidx.core.view.C0574a
        public void f(View view, AccessibilityEvent accessibilityEvent) {
            super.f(view, accessibilityEvent);
            accessibilityEvent.setChecked(CheckableImageButton.this.isChecked());
        }

        @Override // androidx.core.view.C0574a
        public void g(View view, C c7) {
            super.g(view, c7);
            c7.e0(CheckableImageButton.this.a());
            c7.f0(CheckableImageButton.this.isChecked());
        }
    }

    static class b extends AbstractC2252a {
        public static final Parcelable.Creator<b> CREATOR = new a();

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        boolean f16907o;

        class a implements Parcelable.ClassLoaderCreator {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public b createFromParcel(Parcel parcel) {
                return new b(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public b createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new b(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public b[] newArray(int i7) {
                return new b[i7];
            }
        }

        public b(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            b(parcel);
        }

        private void b(Parcel parcel) {
            this.f16907o = parcel.readInt() == 1;
        }

        @Override // z.AbstractC2252a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i7) {
            super.writeToParcel(parcel, i7);
            parcel.writeInt(this.f16907o ? 1 : 0);
        }

        public b(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public CheckableImageButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC1609a.f18753z);
    }

    public boolean a() {
        return this.f16904q;
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
        return this.f16903p;
    }

    @Override // android.widget.ImageView, android.view.View
    public int[] onCreateDrawableState(int i7) {
        if (!this.f16903p) {
            return super.onCreateDrawableState(i7);
        }
        int[] iArr = f16902s;
        return View.mergeDrawableStates(super.onCreateDrawableState(i7 + iArr.length), iArr);
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof b)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        b bVar = (b) parcelable;
        super.onRestoreInstanceState(bVar.a());
        setChecked(bVar.f16907o);
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        b bVar = new b(super.onSaveInstanceState());
        bVar.f16907o = this.f16903p;
        return bVar;
    }

    public void setCheckable(boolean z6) {
        if (this.f16904q != z6) {
            this.f16904q = z6;
            sendAccessibilityEvent(0);
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z6) {
        if (!this.f16904q || this.f16903p == z6) {
            return;
        }
        this.f16903p = z6;
        refreshDrawableState();
        sendAccessibilityEvent(2048);
    }

    public void setPressable(boolean z6) {
        this.f16905r = z6;
    }

    @Override // android.view.View
    public void setPressed(boolean z6) {
        if (this.f16905r) {
            super.setPressed(z6);
        }
    }

    @Override // android.widget.Checkable
    public void toggle() {
        setChecked(!this.f16903p);
    }

    public CheckableImageButton(Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        this.f16904q = true;
        this.f16905r = true;
        H.p0(this, new a());
    }
}
