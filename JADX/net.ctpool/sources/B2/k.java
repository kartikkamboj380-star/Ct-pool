package B2;

import android.view.View;
import android.view.animation.Animation;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
public final class k extends B2.a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final a f723f = new a(null);

    private static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // B2.a
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public Animation b(View view, int i7, int i8, int i9, int i10) {
        w5.k.f(view, "view");
        boolean z6 = true;
        boolean z7 = (((int) view.getX()) == i7 && ((int) view.getY()) == i8) ? false : true;
        if (view.getWidth() == i9 && view.getHeight() == i10) {
            z6 = false;
        }
        if (z7 || z6) {
            return new m(view, i7, i8, i9, i10);
        }
        return null;
    }

    @Override // B2.a
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public boolean e() {
        return this.f686d > 0;
    }
}
