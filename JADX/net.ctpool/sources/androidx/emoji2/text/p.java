package androidx.emoji2.text;

import android.os.Build;
import android.text.Spannable;
import android.text.SpannableString;
import java.util.stream.IntStream;

/* JADX INFO: loaded from: classes.dex */
class p implements Spannable {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f7929m = false;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private Spannable f7930n;

    private static class a {
        static IntStream a(CharSequence charSequence) {
            return charSequence.chars();
        }

        static IntStream b(CharSequence charSequence) {
            return charSequence.codePoints();
        }
    }

    static class b {
        b() {
        }

        boolean a(CharSequence charSequence) {
            return charSequence instanceof androidx.core.text.n;
        }
    }

    static class c extends b {
        c() {
        }

        @Override // androidx.emoji2.text.p.b
        boolean a(CharSequence charSequence) {
            return q.a(charSequence) || (charSequence instanceof androidx.core.text.n);
        }
    }

    p(Spannable spannable) {
        this.f7930n = spannable;
    }

    private void a() {
        Spannable spannable = this.f7930n;
        if (!this.f7929m && c().a(spannable)) {
            this.f7930n = new SpannableString(spannable);
        }
        this.f7929m = true;
    }

    static b c() {
        return Build.VERSION.SDK_INT < 28 ? new b() : new c();
    }

    Spannable b() {
        return this.f7930n;
    }

    @Override // java.lang.CharSequence
    public char charAt(int i7) {
        return this.f7930n.charAt(i7);
    }

    @Override // java.lang.CharSequence
    public IntStream chars() {
        return a.a(this.f7930n);
    }

    @Override // java.lang.CharSequence
    public IntStream codePoints() {
        return a.b(this.f7930n);
    }

    @Override // android.text.Spanned
    public int getSpanEnd(Object obj) {
        return this.f7930n.getSpanEnd(obj);
    }

    @Override // android.text.Spanned
    public int getSpanFlags(Object obj) {
        return this.f7930n.getSpanFlags(obj);
    }

    @Override // android.text.Spanned
    public int getSpanStart(Object obj) {
        return this.f7930n.getSpanStart(obj);
    }

    @Override // android.text.Spanned
    public Object[] getSpans(int i7, int i8, Class cls) {
        return this.f7930n.getSpans(i7, i8, cls);
    }

    @Override // java.lang.CharSequence
    public int length() {
        return this.f7930n.length();
    }

    @Override // android.text.Spanned
    public int nextSpanTransition(int i7, int i8, Class cls) {
        return this.f7930n.nextSpanTransition(i7, i8, cls);
    }

    @Override // android.text.Spannable
    public void removeSpan(Object obj) {
        a();
        this.f7930n.removeSpan(obj);
    }

    @Override // android.text.Spannable
    public void setSpan(Object obj, int i7, int i8, int i9) {
        a();
        this.f7930n.setSpan(obj, i7, i8, i9);
    }

    @Override // java.lang.CharSequence
    public CharSequence subSequence(int i7, int i8) {
        return this.f7930n.subSequence(i7, i8);
    }

    @Override // java.lang.CharSequence
    public String toString() {
        return this.f7930n.toString();
    }

    p(CharSequence charSequence) {
        this.f7930n = new SpannableString(charSequence);
    }
}
