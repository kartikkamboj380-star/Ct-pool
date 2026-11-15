package androidx.appcompat.widget;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.drawable.Drawable;

/* JADX INFO: renamed from: androidx.appcompat.widget.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
class C0525b extends Drawable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final ActionBarContainer f5984a;

    /* JADX INFO: renamed from: androidx.appcompat.widget.b$a */
    private static class a {
        public static void a(Drawable drawable, Outline outline) {
            drawable.getOutline(outline);
        }
    }

    public C0525b(ActionBarContainer actionBarContainer) {
        this.f5984a = actionBarContainer;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        ActionBarContainer actionBarContainer = this.f5984a;
        if (actionBarContainer.f5583t) {
            Drawable drawable = actionBarContainer.f5582s;
            if (drawable != null) {
                drawable.draw(canvas);
                return;
            }
            return;
        }
        Drawable drawable2 = actionBarContainer.f5580q;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        ActionBarContainer actionBarContainer2 = this.f5984a;
        Drawable drawable3 = actionBarContainer2.f5581r;
        if (drawable3 == null || !actionBarContainer2.f5584u) {
            return;
        }
        drawable3.draw(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        Drawable drawable;
        ActionBarContainer actionBarContainer = this.f5984a;
        if (!actionBarContainer.f5583t) {
            drawable = actionBarContainer.f5580q;
            if (drawable == null) {
                return;
            }
        } else if (actionBarContainer.f5582s == null) {
            return;
        } else {
            drawable = actionBarContainer.f5580q;
        }
        a.a(drawable, outline);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i7) {
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }
}
