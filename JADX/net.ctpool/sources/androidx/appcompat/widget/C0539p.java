package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageButton;
import e.AbstractC1609a;

/* JADX INFO: renamed from: androidx.appcompat.widget.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0539p extends ImageButton {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final C0528e f6193m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final C0540q f6194n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f6195o;

    public C0539p(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC1609a.f18753z);
    }

    @Override // android.widget.ImageView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        C0528e c0528e = this.f6193m;
        if (c0528e != null) {
            c0528e.b();
        }
        C0540q c0540q = this.f6194n;
        if (c0540q != null) {
            c0540q.c();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0528e c0528e = this.f6193m;
        if (c0528e != null) {
            return c0528e.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0528e c0528e = this.f6193m;
        if (c0528e != null) {
            return c0528e.d();
        }
        return null;
    }

    public ColorStateList getSupportImageTintList() {
        C0540q c0540q = this.f6194n;
        if (c0540q != null) {
            return c0540q.d();
        }
        return null;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        C0540q c0540q = this.f6194n;
        if (c0540q != null) {
            return c0540q.e();
        }
        return null;
    }

    @Override // android.widget.ImageView, android.view.View
    public boolean hasOverlappingRendering() {
        return this.f6194n.f() && super.hasOverlappingRendering();
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0528e c0528e = this.f6193m;
        if (c0528e != null) {
            c0528e.f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i7) {
        super.setBackgroundResource(i7);
        C0528e c0528e = this.f6193m;
        if (c0528e != null) {
            c0528e.g(i7);
        }
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        C0540q c0540q = this.f6194n;
        if (c0540q != null) {
            c0540q.c();
        }
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        C0540q c0540q = this.f6194n;
        if (c0540q != null && drawable != null && !this.f6195o) {
            c0540q.h(drawable);
        }
        super.setImageDrawable(drawable);
        C0540q c0540q2 = this.f6194n;
        if (c0540q2 != null) {
            c0540q2.c();
            if (this.f6195o) {
                return;
            }
            this.f6194n.b();
        }
    }

    @Override // android.widget.ImageView
    public void setImageLevel(int i7) {
        super.setImageLevel(i7);
        this.f6195o = true;
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i7) {
        this.f6194n.i(i7);
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        C0540q c0540q = this.f6194n;
        if (c0540q != null) {
            c0540q.c();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0528e c0528e = this.f6193m;
        if (c0528e != null) {
            c0528e.i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0528e c0528e = this.f6193m;
        if (c0528e != null) {
            c0528e.j(mode);
        }
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        C0540q c0540q = this.f6194n;
        if (c0540q != null) {
            c0540q.j(colorStateList);
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        C0540q c0540q = this.f6194n;
        if (c0540q != null) {
            c0540q.k(mode);
        }
    }

    public C0539p(Context context, AttributeSet attributeSet, int i7) {
        super(e0.b(context), attributeSet, i7);
        this.f6195o = false;
        d0.a(this, getContext());
        C0528e c0528e = new C0528e(this);
        this.f6193m = c0528e;
        c0528e.e(attributeSet, i7);
        C0540q c0540q = new C0540q(this);
        this.f6194n = c0540q;
        c0540q.g(attributeSet, i7);
    }
}
