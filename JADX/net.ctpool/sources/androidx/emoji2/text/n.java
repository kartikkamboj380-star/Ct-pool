package androidx.emoji2.text;

import android.os.Build;
import android.text.Editable;
import android.text.SpanWatcher;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.TextWatcher;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public final class n extends SpannableStringBuilder {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final Class f7924m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final List f7925n;

    private static class a implements TextWatcher, SpanWatcher {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        final Object f7926m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final AtomicInteger f7927n = new AtomicInteger(0);

        a(Object obj) {
            this.f7926m = obj;
        }

        private boolean b(Object obj) {
            return obj instanceof i;
        }

        final void a() {
            this.f7927n.incrementAndGet();
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            ((TextWatcher) this.f7926m).afterTextChanged(editable);
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i7, int i8, int i9) {
            ((TextWatcher) this.f7926m).beforeTextChanged(charSequence, i7, i8, i9);
        }

        final void c() {
            this.f7927n.decrementAndGet();
        }

        @Override // android.text.SpanWatcher
        public void onSpanAdded(Spannable spannable, Object obj, int i7, int i8) {
            if (this.f7927n.get() <= 0 || !b(obj)) {
                ((SpanWatcher) this.f7926m).onSpanAdded(spannable, obj, i7, i8);
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x001e A[PHI: r11
          0x001e: PHI (r11v1 int) = (r11v0 int), (r11v3 int) binds: [B:8:0x0013, B:12:0x0019] A[DONT_GENERATE, DONT_INLINE]] */
        @Override // android.text.SpanWatcher
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void onSpanChanged(Spannable spannable, Object obj, int i7, int i8, int i9, int i10) {
            int i11;
            int i12;
            if (this.f7927n.get() <= 0 || !b(obj)) {
                if (Build.VERSION.SDK_INT >= 28) {
                    i11 = i7;
                    i12 = i9;
                } else {
                    if (i7 > i8) {
                        i7 = 0;
                    }
                    if (i9 > i10) {
                        i11 = i7;
                        i12 = 0;
                    }
                }
                ((SpanWatcher) this.f7926m).onSpanChanged(spannable, obj, i11, i8, i12, i10);
            }
        }

        @Override // android.text.SpanWatcher
        public void onSpanRemoved(Spannable spannable, Object obj, int i7, int i8) {
            if (this.f7927n.get() <= 0 || !b(obj)) {
                ((SpanWatcher) this.f7926m).onSpanRemoved(spannable, obj, i7, i8);
            }
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i7, int i8, int i9) {
            ((TextWatcher) this.f7926m).onTextChanged(charSequence, i7, i8, i9);
        }
    }

    n(Class cls, CharSequence charSequence) {
        super(charSequence);
        this.f7925n = new ArrayList();
        androidx.core.util.f.g(cls, "watcherClass cannot be null");
        this.f7924m = cls;
    }

    private void b() {
        for (int i7 = 0; i7 < this.f7925n.size(); i7++) {
            ((a) this.f7925n.get(i7)).a();
        }
    }

    public static n c(Class cls, CharSequence charSequence) {
        return new n(cls, charSequence);
    }

    private void e() {
        for (int i7 = 0; i7 < this.f7925n.size(); i7++) {
            ((a) this.f7925n.get(i7)).onTextChanged(this, 0, length(), length());
        }
    }

    private a f(Object obj) {
        for (int i7 = 0; i7 < this.f7925n.size(); i7++) {
            a aVar = (a) this.f7925n.get(i7);
            if (aVar.f7926m == obj) {
                return aVar;
            }
        }
        return null;
    }

    private boolean g(Class cls) {
        return this.f7924m == cls;
    }

    private boolean h(Object obj) {
        return obj != null && g(obj.getClass());
    }

    private void i() {
        for (int i7 = 0; i7 < this.f7925n.size(); i7++) {
            ((a) this.f7925n.get(i7)).c();
        }
    }

    public void a() {
        b();
    }

    public void d() {
        i();
        e();
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public int getSpanEnd(Object obj) {
        a aVarF;
        if (h(obj) && (aVarF = f(obj)) != null) {
            obj = aVarF;
        }
        return super.getSpanEnd(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public int getSpanFlags(Object obj) {
        a aVarF;
        if (h(obj) && (aVarF = f(obj)) != null) {
            obj = aVarF;
        }
        return super.getSpanFlags(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public int getSpanStart(Object obj) {
        a aVarF;
        if (h(obj) && (aVarF = f(obj)) != null) {
            obj = aVarF;
        }
        return super.getSpanStart(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public Object[] getSpans(int i7, int i8, Class cls) {
        if (!g(cls)) {
            return super.getSpans(i7, i8, cls);
        }
        a[] aVarArr = (a[]) super.getSpans(i7, i8, a.class);
        Object[] objArr = (Object[]) Array.newInstance((Class<?>) cls, aVarArr.length);
        for (int i9 = 0; i9 < aVarArr.length; i9++) {
            objArr[i9] = aVarArr[i9].f7926m;
        }
        return objArr;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public int nextSpanTransition(int i7, int i8, Class cls) {
        if (cls == null || g(cls)) {
            cls = a.class;
        }
        return super.nextSpanTransition(i7, i8, cls);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spannable
    public void removeSpan(Object obj) {
        a aVarF;
        if (h(obj)) {
            aVarF = f(obj);
            if (aVarF != null) {
                obj = aVarF;
            }
        } else {
            aVarF = null;
        }
        super.removeSpan(obj);
        if (aVarF != null) {
            this.f7925n.remove(aVarF);
        }
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spannable
    public void setSpan(Object obj, int i7, int i8, int i9) {
        if (h(obj)) {
            a aVar = new a(obj);
            this.f7925n.add(aVar);
            obj = aVar;
        }
        super.setSpan(obj, i7, i8, i9);
    }

    @Override // android.text.SpannableStringBuilder, java.lang.CharSequence
    public CharSequence subSequence(int i7, int i8) {
        return new n(this.f7924m, this, i7, i8);
    }

    n(Class cls, CharSequence charSequence, int i7, int i8) {
        super(charSequence, i7, i8);
        this.f7925n = new ArrayList();
        androidx.core.util.f.g(cls, "watcherClass cannot be null");
        this.f7924m = cls;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public SpannableStringBuilder delete(int i7, int i8) {
        super.delete(i7, i8);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public SpannableStringBuilder insert(int i7, CharSequence charSequence) {
        super.insert(i7, charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public SpannableStringBuilder replace(int i7, int i8, CharSequence charSequence) {
        b();
        super.replace(i7, i8, charSequence);
        i();
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public SpannableStringBuilder append(char c7) {
        super.append(c7);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public SpannableStringBuilder insert(int i7, CharSequence charSequence, int i8, int i9) {
        super.insert(i7, charSequence, i8, i9);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public SpannableStringBuilder replace(int i7, int i8, CharSequence charSequence, int i9, int i10) {
        b();
        super.replace(i7, i8, charSequence, i9, i10);
        i();
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public SpannableStringBuilder append(CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public SpannableStringBuilder append(CharSequence charSequence, int i7, int i8) {
        super.append(charSequence, i7, i8);
        return this;
    }

    @Override // android.text.SpannableStringBuilder
    public SpannableStringBuilder append(CharSequence charSequence, Object obj, int i7) {
        super.append(charSequence, obj, i7);
        return this;
    }
}
