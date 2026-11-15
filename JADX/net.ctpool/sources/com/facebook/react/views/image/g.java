package com.facebook.react.views.image;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import g1.InterfaceC1689d;
import kotlin.jvm.internal.DefaultConstructorMarker;
import w5.k;

/* JADX INFO: loaded from: classes.dex */
public abstract class g extends j1.g implements InterfaceC1689d {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final a f12782q = new a(null);

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private static final class b extends Drawable {
        @Override // android.graphics.drawable.Drawable
        public void draw(Canvas canvas) {
            k.f(canvas, "canvas");
        }

        @Override // android.graphics.drawable.Drawable
        public int getOpacity() {
            return -1;
        }

        @Override // android.graphics.drawable.Drawable
        public void setAlpha(int i7) {
        }

        @Override // android.graphics.drawable.Drawable
        public void setColorFilter(ColorFilter colorFilter) {
        }
    }

    public g() {
        super(new b());
    }

    @Override // g1.InterfaceC1689d
    public void a(String str, Object obj) {
        k.f(str, "id");
    }

    @Override // g1.InterfaceC1689d
    public void k(String str) {
        k.f(str, "id");
    }

    @Override // j1.g, android.graphics.drawable.Drawable
    protected boolean onLevelChange(int i7) {
        x(i7, 10000);
        return super.onLevelChange(i7);
    }

    @Override // g1.InterfaceC1689d
    public void q(String str, Throwable th) {
        k.f(str, "id");
        k.f(th, "throwable");
    }

    public abstract void x(int i7, int i8);
}
