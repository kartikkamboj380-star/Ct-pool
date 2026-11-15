package M2;

import android.graphics.drawable.Drawable;
import android.text.Spannable;
import android.text.style.ReplacementSpan;
import android.widget.TextView;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
public abstract class n extends ReplacementSpan implements h {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final a f2044m = new a(null);

    public static final class a {
        private a() {
        }

        public final void a(Spannable spannable, TextView textView) {
            w5.k.f(spannable, "spannable");
            Object[] spans = spannable.getSpans(0, spannable.length(), n.class);
            w5.k.e(spans, "getSpans(...)");
            for (Object obj : spans) {
                n nVar = (n) obj;
                nVar.c();
                nVar.h(textView);
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static final void g(Spannable spannable, TextView textView) {
        f2044m.a(spannable, textView);
    }

    public abstract Drawable a();

    public abstract int b();

    public abstract void c();

    public abstract void d();

    public abstract void e();

    public abstract void f();

    public abstract void h(TextView textView);
}
