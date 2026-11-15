package androidx.appcompat.app;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.ViewGroup;
import androidx.appcompat.view.b;

/* JADX INFO: renamed from: androidx.appcompat.app.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0521a {

    /* JADX INFO: renamed from: androidx.appcompat.app.a$a, reason: collision with other inner class name */
    public static class C0120a extends ViewGroup.MarginLayoutParams {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f5077a;

        public C0120a(int i7, int i8) {
            super(i7, i8);
            this.f5077a = 8388627;
        }

        public C0120a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f5077a = 0;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, e.j.f19118t);
            this.f5077a = typedArrayObtainStyledAttributes.getInt(e.j.f19123u, 0);
            typedArrayObtainStyledAttributes.recycle();
        }

        public C0120a(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f5077a = 0;
        }

        public C0120a(C0120a c0120a) {
            super((ViewGroup.MarginLayoutParams) c0120a);
            this.f5077a = 0;
            this.f5077a = c0120a.f5077a;
        }
    }

    public boolean g() {
        return false;
    }

    public abstract boolean h();

    public abstract void i(boolean z6);

    public abstract int j();

    public abstract Context k();

    public boolean l() {
        return false;
    }

    public void m(Configuration configuration) {
    }

    void n() {
    }

    public abstract boolean o(int i7, KeyEvent keyEvent);

    public boolean p(KeyEvent keyEvent) {
        return false;
    }

    public boolean q() {
        return false;
    }

    public abstract void r(boolean z6);

    public abstract void s(boolean z6);

    public abstract void t(Drawable drawable);

    public abstract void u(boolean z6);

    public abstract void v(CharSequence charSequence);

    public abstract void w(CharSequence charSequence);

    public androidx.appcompat.view.b x(b.a aVar) {
        return null;
    }
}
