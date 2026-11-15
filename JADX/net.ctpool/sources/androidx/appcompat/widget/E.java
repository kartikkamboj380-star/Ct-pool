package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.widget.TextView;
import com.google.android.gms.common.api.Api;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
class E {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final RectF f5698l = new RectF();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static ConcurrentHashMap f5699m = new ConcurrentHashMap();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static ConcurrentHashMap f5700n = new ConcurrentHashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f5701a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f5702b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f5703c = -1.0f;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private float f5704d = -1.0f;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float f5705e = -1.0f;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int[] f5706f = new int[0];

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f5707g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private TextPaint f5708h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final TextView f5709i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Context f5710j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final f f5711k;

    private static final class a {
        static StaticLayout a(CharSequence charSequence, Layout.Alignment alignment, int i7, TextView textView, TextPaint textPaint) {
            return new StaticLayout(charSequence, textPaint, i7, alignment, textView.getLineSpacingMultiplier(), textView.getLineSpacingExtra(), textView.getIncludeFontPadding());
        }

        static int b(TextView textView) {
            return textView.getMaxLines();
        }
    }

    private static final class b {
        static boolean a(View view) {
            return view.isInLayout();
        }
    }

    private static final class c {
        static StaticLayout a(CharSequence charSequence, Layout.Alignment alignment, int i7, int i8, TextView textView, TextPaint textPaint, f fVar) {
            StaticLayout.Builder builderObtain = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), textPaint, i7);
            StaticLayout.Builder hyphenationFrequency = builderObtain.setAlignment(alignment).setLineSpacing(textView.getLineSpacingExtra(), textView.getLineSpacingMultiplier()).setIncludePad(textView.getIncludeFontPadding()).setBreakStrategy(textView.getBreakStrategy()).setHyphenationFrequency(textView.getHyphenationFrequency());
            if (i8 == -1) {
                i8 = Api.BaseClientBuilder.API_PRIORITY_OTHER;
            }
            hyphenationFrequency.setMaxLines(i8);
            try {
                fVar.a(builderObtain, textView);
            } catch (ClassCastException unused) {
                Log.w("ACTVAutoSizeHelper", "Failed to obtain TextDirectionHeuristic, auto size may be incorrect");
            }
            return builderObtain.build();
        }
    }

    private static class d extends f {
        d() {
        }

        @Override // androidx.appcompat.widget.E.f
        void a(StaticLayout.Builder builder, TextView textView) {
            builder.setTextDirection((TextDirectionHeuristic) E.m(textView, "getTextDirectionHeuristic", TextDirectionHeuristics.FIRSTSTRONG_LTR));
        }
    }

    private static class e extends d {
        e() {
        }

        @Override // androidx.appcompat.widget.E.d, androidx.appcompat.widget.E.f
        void a(StaticLayout.Builder builder, TextView textView) {
            builder.setTextDirection(textView.getTextDirectionHeuristic());
        }

        @Override // androidx.appcompat.widget.E.f
        boolean b(TextView textView) {
            return textView.isHorizontallyScrollable();
        }
    }

    private static class f {
        f() {
        }

        abstract void a(StaticLayout.Builder builder, TextView textView);

        boolean b(TextView textView) {
            return ((Boolean) E.m(textView, "getHorizontallyScrolling", Boolean.FALSE)).booleanValue();
        }
    }

    E(TextView textView) {
        this.f5709i = textView;
        this.f5710j = textView.getContext();
        this.f5711k = Build.VERSION.SDK_INT >= 29 ? new e() : new d();
    }

    private int[] b(int[] iArr) {
        int length = iArr.length;
        if (length == 0) {
            return iArr;
        }
        Arrays.sort(iArr);
        ArrayList arrayList = new ArrayList();
        for (int i7 : iArr) {
            if (i7 > 0 && Collections.binarySearch(arrayList, Integer.valueOf(i7)) < 0) {
                arrayList.add(Integer.valueOf(i7));
            }
        }
        if (length == arrayList.size()) {
            return iArr;
        }
        int size = arrayList.size();
        int[] iArr2 = new int[size];
        for (int i8 = 0; i8 < size; i8++) {
            iArr2[i8] = ((Integer) arrayList.get(i8)).intValue();
        }
        return iArr2;
    }

    private void c() {
        this.f5701a = 0;
        this.f5704d = -1.0f;
        this.f5705e = -1.0f;
        this.f5703c = -1.0f;
        this.f5706f = new int[0];
        this.f5702b = false;
    }

    private int e(RectF rectF) {
        int length = this.f5706f.length;
        if (length == 0) {
            throw new IllegalStateException("No available text sizes to choose from.");
        }
        int i7 = 1;
        int i8 = length - 1;
        int i9 = 0;
        while (i7 <= i8) {
            int i10 = (i7 + i8) / 2;
            if (x(this.f5706f[i10], rectF)) {
                int i11 = i10 + 1;
                i9 = i7;
                i7 = i11;
            } else {
                i9 = i10 - 1;
                i8 = i9;
            }
        }
        return this.f5706f[i9];
    }

    private static Method k(String str) {
        try {
            Method declaredMethod = (Method) f5699m.get(str);
            if (declaredMethod == null && (declaredMethod = TextView.class.getDeclaredMethod(str, null)) != null) {
                declaredMethod.setAccessible(true);
                f5699m.put(str, declaredMethod);
            }
            return declaredMethod;
        } catch (Exception e7) {
            Log.w("ACTVAutoSizeHelper", "Failed to retrieve TextView#" + str + "() method", e7);
            return null;
        }
    }

    static Object m(Object obj, String str, Object obj2) {
        try {
            return k(str).invoke(obj, null);
        } catch (Exception e7) {
            Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#" + str + "() method", e7);
            return obj2;
        }
    }

    private void s(float f7) {
        if (f7 != this.f5709i.getPaint().getTextSize()) {
            this.f5709i.getPaint().setTextSize(f7);
            boolean zA = b.a(this.f5709i);
            if (this.f5709i.getLayout() != null) {
                this.f5702b = false;
                try {
                    Method methodK = k("nullLayouts");
                    if (methodK != null) {
                        methodK.invoke(this.f5709i, null);
                    }
                } catch (Exception e7) {
                    Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#nullLayouts() method", e7);
                }
                if (zA) {
                    this.f5709i.forceLayout();
                } else {
                    this.f5709i.requestLayout();
                }
                this.f5709i.invalidate();
            }
        }
    }

    private boolean u() {
        if (y() && this.f5701a == 1) {
            if (!this.f5707g || this.f5706f.length == 0) {
                int iFloor = ((int) Math.floor((this.f5705e - this.f5704d) / this.f5703c)) + 1;
                int[] iArr = new int[iFloor];
                for (int i7 = 0; i7 < iFloor; i7++) {
                    iArr[i7] = Math.round(this.f5704d + (i7 * this.f5703c));
                }
                this.f5706f = b(iArr);
            }
            this.f5702b = true;
        } else {
            this.f5702b = false;
        }
        return this.f5702b;
    }

    private void v(TypedArray typedArray) {
        int length = typedArray.length();
        int[] iArr = new int[length];
        if (length > 0) {
            for (int i7 = 0; i7 < length; i7++) {
                iArr[i7] = typedArray.getDimensionPixelSize(i7, -1);
            }
            this.f5706f = b(iArr);
            w();
        }
    }

    private boolean w() {
        boolean z6 = this.f5706f.length > 0;
        this.f5707g = z6;
        if (z6) {
            this.f5701a = 1;
            this.f5704d = r0[0];
            this.f5705e = r0[r1 - 1];
            this.f5703c = -1.0f;
        }
        return z6;
    }

    private boolean x(int i7, RectF rectF) {
        CharSequence transformation;
        CharSequence text = this.f5709i.getText();
        TransformationMethod transformationMethod = this.f5709i.getTransformationMethod();
        if (transformationMethod != null && (transformation = transformationMethod.getTransformation(text, this.f5709i)) != null) {
            text = transformation;
        }
        int iB = a.b(this.f5709i);
        l(i7);
        StaticLayout staticLayoutD = d(text, (Layout.Alignment) m(this.f5709i, "getLayoutAlignment", Layout.Alignment.ALIGN_NORMAL), Math.round(rectF.right), iB);
        return (iB == -1 || (staticLayoutD.getLineCount() <= iB && staticLayoutD.getLineEnd(staticLayoutD.getLineCount() - 1) == text.length())) && ((float) staticLayoutD.getHeight()) <= rectF.bottom;
    }

    private boolean y() {
        return !(this.f5709i instanceof C0535l);
    }

    private void z(float f7, float f8, float f9) {
        if (f7 <= 0.0f) {
            throw new IllegalArgumentException("Minimum auto-size text size (" + f7 + "px) is less or equal to (0px)");
        }
        if (f8 <= f7) {
            throw new IllegalArgumentException("Maximum auto-size text size (" + f8 + "px) is less or equal to minimum auto-size text size (" + f7 + "px)");
        }
        if (f9 <= 0.0f) {
            throw new IllegalArgumentException("The auto-size step granularity (" + f9 + "px) is less or equal to (0px)");
        }
        this.f5701a = 1;
        this.f5704d = f7;
        this.f5705e = f8;
        this.f5703c = f9;
        this.f5707g = false;
    }

    void a() {
        if (n()) {
            if (this.f5702b) {
                if (this.f5709i.getMeasuredHeight() <= 0 || this.f5709i.getMeasuredWidth() <= 0) {
                    return;
                }
                int measuredWidth = this.f5711k.b(this.f5709i) ? 1048576 : (this.f5709i.getMeasuredWidth() - this.f5709i.getTotalPaddingLeft()) - this.f5709i.getTotalPaddingRight();
                int height = (this.f5709i.getHeight() - this.f5709i.getCompoundPaddingBottom()) - this.f5709i.getCompoundPaddingTop();
                if (measuredWidth <= 0 || height <= 0) {
                    return;
                }
                RectF rectF = f5698l;
                synchronized (rectF) {
                    try {
                        rectF.setEmpty();
                        rectF.right = measuredWidth;
                        rectF.bottom = height;
                        float fE = e(rectF);
                        if (fE != this.f5709i.getTextSize()) {
                            t(0, fE);
                        }
                    } finally {
                    }
                }
            }
            this.f5702b = true;
        }
    }

    StaticLayout d(CharSequence charSequence, Layout.Alignment alignment, int i7, int i8) {
        return c.a(charSequence, alignment, i7, i8, this.f5709i, this.f5708h, this.f5711k);
    }

    int f() {
        return Math.round(this.f5705e);
    }

    int g() {
        return Math.round(this.f5704d);
    }

    int h() {
        return Math.round(this.f5703c);
    }

    int[] i() {
        return this.f5706f;
    }

    int j() {
        return this.f5701a;
    }

    void l(int i7) {
        TextPaint textPaint = this.f5708h;
        if (textPaint == null) {
            this.f5708h = new TextPaint();
        } else {
            textPaint.reset();
        }
        this.f5708h.set(this.f5709i.getPaint());
        this.f5708h.setTextSize(i7);
    }

    boolean n() {
        return y() && this.f5701a != 0;
    }

    void o(AttributeSet attributeSet, int i7) {
        int resourceId;
        TypedArray typedArrayObtainStyledAttributes = this.f5710j.obtainStyledAttributes(attributeSet, e.j.f19054g0, i7, 0);
        TextView textView = this.f5709i;
        androidx.core.view.H.n0(textView, textView.getContext(), e.j.f19054g0, attributeSet, typedArrayObtainStyledAttributes, i7, 0);
        if (typedArrayObtainStyledAttributes.hasValue(e.j.f19079l0)) {
            this.f5701a = typedArrayObtainStyledAttributes.getInt(e.j.f19079l0, 0);
        }
        float dimension = typedArrayObtainStyledAttributes.hasValue(e.j.f19074k0) ? typedArrayObtainStyledAttributes.getDimension(e.j.f19074k0, -1.0f) : -1.0f;
        float dimension2 = typedArrayObtainStyledAttributes.hasValue(e.j.f19064i0) ? typedArrayObtainStyledAttributes.getDimension(e.j.f19064i0, -1.0f) : -1.0f;
        float dimension3 = typedArrayObtainStyledAttributes.hasValue(e.j.f19059h0) ? typedArrayObtainStyledAttributes.getDimension(e.j.f19059h0, -1.0f) : -1.0f;
        if (typedArrayObtainStyledAttributes.hasValue(e.j.f19069j0) && (resourceId = typedArrayObtainStyledAttributes.getResourceId(e.j.f19069j0, 0)) > 0) {
            TypedArray typedArrayObtainTypedArray = typedArrayObtainStyledAttributes.getResources().obtainTypedArray(resourceId);
            v(typedArrayObtainTypedArray);
            typedArrayObtainTypedArray.recycle();
        }
        typedArrayObtainStyledAttributes.recycle();
        if (!y()) {
            this.f5701a = 0;
            return;
        }
        if (this.f5701a == 1) {
            if (!this.f5707g) {
                DisplayMetrics displayMetrics = this.f5710j.getResources().getDisplayMetrics();
                if (dimension2 == -1.0f) {
                    dimension2 = TypedValue.applyDimension(2, 12.0f, displayMetrics);
                }
                if (dimension3 == -1.0f) {
                    dimension3 = TypedValue.applyDimension(2, 112.0f, displayMetrics);
                }
                if (dimension == -1.0f) {
                    dimension = 1.0f;
                }
                z(dimension2, dimension3, dimension);
            }
            u();
        }
    }

    void p(int i7, int i8, int i9, int i10) {
        if (y()) {
            DisplayMetrics displayMetrics = this.f5710j.getResources().getDisplayMetrics();
            z(TypedValue.applyDimension(i10, i7, displayMetrics), TypedValue.applyDimension(i10, i8, displayMetrics), TypedValue.applyDimension(i10, i9, displayMetrics));
            if (u()) {
                a();
            }
        }
    }

    void q(int[] iArr, int i7) {
        if (y()) {
            int length = iArr.length;
            if (length > 0) {
                int[] iArrCopyOf = new int[length];
                if (i7 == 0) {
                    iArrCopyOf = Arrays.copyOf(iArr, length);
                } else {
                    DisplayMetrics displayMetrics = this.f5710j.getResources().getDisplayMetrics();
                    for (int i8 = 0; i8 < length; i8++) {
                        iArrCopyOf[i8] = Math.round(TypedValue.applyDimension(i7, iArr[i8], displayMetrics));
                    }
                }
                this.f5706f = b(iArrCopyOf);
                if (!w()) {
                    throw new IllegalArgumentException("None of the preset sizes is valid: " + Arrays.toString(iArr));
                }
            } else {
                this.f5707g = false;
            }
            if (u()) {
                a();
            }
        }
    }

    void r(int i7) {
        if (y()) {
            if (i7 == 0) {
                c();
                return;
            }
            if (i7 != 1) {
                throw new IllegalArgumentException("Unknown auto-size text type: " + i7);
            }
            DisplayMetrics displayMetrics = this.f5710j.getResources().getDisplayMetrics();
            z(TypedValue.applyDimension(2, 12.0f, displayMetrics), TypedValue.applyDimension(2, 112.0f, displayMetrics), 1.0f);
            if (u()) {
                a();
            }
        }
    }

    void t(int i7, float f7) {
        Context context = this.f5710j;
        s(TypedValue.applyDimension(i7, f7, (context == null ? Resources.getSystem() : context.getResources()).getDisplayMetrics()));
    }
}
