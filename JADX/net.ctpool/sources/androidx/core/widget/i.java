package androidx.core.widget;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.icu.text.DecimalFormatSymbols;
import android.os.Build;
import android.text.Editable;
import android.text.PrecomputedText;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.PasswordTransformationMethod;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import androidx.core.text.n;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public abstract class i {

    static class a {
        static boolean a(TextView textView) {
            return textView.getIncludeFontPadding();
        }

        static int b(TextView textView) {
            return textView.getMaxLines();
        }

        static int c(TextView textView) {
            return textView.getMinLines();
        }
    }

    static class b {
        static Drawable[] a(TextView textView) {
            return textView.getCompoundDrawablesRelative();
        }

        static int b(View view) {
            return view.getLayoutDirection();
        }

        static int c(View view) {
            return view.getTextDirection();
        }

        static Locale d(TextView textView) {
            return textView.getTextLocale();
        }

        static void e(TextView textView, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
            textView.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        }

        static void f(TextView textView, int i7, int i8, int i9, int i10) {
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(i7, i8, i9, i10);
        }

        static void g(TextView textView, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        }

        static void h(View view, int i7) {
            view.setTextDirection(i7);
        }
    }

    static class c {
        static int a(TextView textView) {
            return textView.getBreakStrategy();
        }

        static ColorStateList b(TextView textView) {
            return textView.getCompoundDrawableTintList();
        }

        static PorterDuff.Mode c(TextView textView) {
            return textView.getCompoundDrawableTintMode();
        }

        static int d(TextView textView) {
            return textView.getHyphenationFrequency();
        }

        static void e(TextView textView, int i7) {
            textView.setBreakStrategy(i7);
        }

        static void f(TextView textView, ColorStateList colorStateList) {
            textView.setCompoundDrawableTintList(colorStateList);
        }

        static void g(TextView textView, PorterDuff.Mode mode) {
            textView.setCompoundDrawableTintMode(mode);
        }

        static void h(TextView textView, int i7) {
            textView.setHyphenationFrequency(i7);
        }
    }

    static class d {
        static DecimalFormatSymbols a(Locale locale) {
            return DecimalFormatSymbols.getInstance(locale);
        }
    }

    static class e {
        static String[] a(DecimalFormatSymbols decimalFormatSymbols) {
            return decimalFormatSymbols.getDigitStrings();
        }

        static PrecomputedText.Params b(TextView textView) {
            return textView.getTextMetricsParams();
        }

        static void c(TextView textView, int i7) {
            textView.setFirstBaselineToTopHeight(i7);
        }
    }

    private static class f implements ActionMode.Callback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ActionMode.Callback f7499a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final TextView f7500b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Class f7501c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private Method f7502d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f7503e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f7504f = false;

        f(ActionMode.Callback callback, TextView textView) {
            this.f7499a = callback;
            this.f7500b = textView;
        }

        private Intent a() {
            return new Intent().setAction("android.intent.action.PROCESS_TEXT").setType("text/plain");
        }

        private Intent b(ResolveInfo resolveInfo, TextView textView) {
            Intent intentPutExtra = a().putExtra("android.intent.extra.PROCESS_TEXT_READONLY", !e(textView));
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            return intentPutExtra.setClassName(activityInfo.packageName, activityInfo.name);
        }

        private List c(Context context, PackageManager packageManager) {
            ArrayList arrayList = new ArrayList();
            if (!(context instanceof Activity)) {
                return arrayList;
            }
            for (ResolveInfo resolveInfo : packageManager.queryIntentActivities(a(), 0)) {
                if (f(resolveInfo, context)) {
                    arrayList.add(resolveInfo);
                }
            }
            return arrayList;
        }

        private boolean e(TextView textView) {
            return (textView instanceof Editable) && textView.onCheckIsTextEditor() && textView.isEnabled();
        }

        private boolean f(ResolveInfo resolveInfo, Context context) {
            if (context.getPackageName().equals(resolveInfo.activityInfo.packageName)) {
                return true;
            }
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            if (!activityInfo.exported) {
                return false;
            }
            String str = activityInfo.permission;
            return str == null || context.checkSelfPermission(str) == 0;
        }

        private void g(Menu menu) {
            Context context = this.f7500b.getContext();
            PackageManager packageManager = context.getPackageManager();
            if (!this.f7504f) {
                this.f7504f = true;
                try {
                    Class<?> cls = Class.forName("com.android.internal.view.menu.MenuBuilder");
                    this.f7501c = cls;
                    this.f7502d = cls.getDeclaredMethod("removeItemAt", Integer.TYPE);
                    this.f7503e = true;
                } catch (ClassNotFoundException | NoSuchMethodException unused) {
                    this.f7501c = null;
                    this.f7502d = null;
                    this.f7503e = false;
                }
            }
            try {
                Method declaredMethod = (this.f7503e && this.f7501c.isInstance(menu)) ? this.f7502d : menu.getClass().getDeclaredMethod("removeItemAt", Integer.TYPE);
                for (int size = menu.size() - 1; size >= 0; size--) {
                    MenuItem item = menu.getItem(size);
                    if (item.getIntent() != null && "android.intent.action.PROCESS_TEXT".equals(item.getIntent().getAction())) {
                        declaredMethod.invoke(menu, Integer.valueOf(size));
                    }
                }
                List listC = c(context, packageManager);
                for (int i7 = 0; i7 < listC.size(); i7++) {
                    ResolveInfo resolveInfo = (ResolveInfo) listC.get(i7);
                    menu.add(0, 0, i7 + 100, resolveInfo.loadLabel(packageManager)).setIntent(b(resolveInfo, this.f7500b)).setShowAsAction(1);
                }
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused2) {
            }
        }

        ActionMode.Callback d() {
            return this.f7499a;
        }

        @Override // android.view.ActionMode.Callback
        public boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
            return this.f7499a.onActionItemClicked(actionMode, menuItem);
        }

        @Override // android.view.ActionMode.Callback
        public boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
            return this.f7499a.onCreateActionMode(actionMode, menu);
        }

        @Override // android.view.ActionMode.Callback
        public void onDestroyActionMode(ActionMode actionMode) {
            this.f7499a.onDestroyActionMode(actionMode);
        }

        @Override // android.view.ActionMode.Callback
        public boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
            g(menu);
            return this.f7499a.onPrepareActionMode(actionMode, menu);
        }
    }

    public static Drawable[] a(TextView textView) {
        return b.a(textView);
    }

    public static int b(TextView textView) {
        return textView.getPaddingTop() - textView.getPaint().getFontMetricsInt().top;
    }

    public static int c(TextView textView) {
        return textView.getPaddingBottom() + textView.getPaint().getFontMetricsInt().bottom;
    }

    private static int d(TextDirectionHeuristic textDirectionHeuristic) {
        TextDirectionHeuristic textDirectionHeuristic2;
        TextDirectionHeuristic textDirectionHeuristic3 = TextDirectionHeuristics.FIRSTSTRONG_RTL;
        if (textDirectionHeuristic == textDirectionHeuristic3 || textDirectionHeuristic == (textDirectionHeuristic2 = TextDirectionHeuristics.FIRSTSTRONG_LTR)) {
            return 1;
        }
        if (textDirectionHeuristic == TextDirectionHeuristics.ANYRTL_LTR) {
            return 2;
        }
        if (textDirectionHeuristic == TextDirectionHeuristics.LTR) {
            return 3;
        }
        if (textDirectionHeuristic == TextDirectionHeuristics.RTL) {
            return 4;
        }
        if (textDirectionHeuristic == TextDirectionHeuristics.LOCALE) {
            return 5;
        }
        if (textDirectionHeuristic == textDirectionHeuristic2) {
            return 6;
        }
        return textDirectionHeuristic == textDirectionHeuristic3 ? 7 : 1;
    }

    private static TextDirectionHeuristic e(TextView textView) {
        if (textView.getTransformationMethod() instanceof PasswordTransformationMethod) {
            return TextDirectionHeuristics.LTR;
        }
        if (Build.VERSION.SDK_INT >= 28 && (textView.getInputType() & 15) == 3) {
            byte directionality = Character.getDirectionality(e.a(d.a(b.d(textView)))[0].codePointAt(0));
            return (directionality == 1 || directionality == 2) ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR;
        }
        boolean z6 = b.b(textView) == 1;
        switch (b.c(textView)) {
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            default:
                if (!z6) {
                }
                break;
        }
        return TextDirectionHeuristics.LTR;
    }

    public static n.a f(TextView textView) {
        if (Build.VERSION.SDK_INT >= 28) {
            return new n.a(e.b(textView));
        }
        n.a.C0144a c0144a = new n.a.C0144a(new TextPaint(textView.getPaint()));
        c0144a.b(c.a(textView));
        c0144a.c(c.d(textView));
        c0144a.d(e(textView));
        return c0144a.a();
    }

    public static void g(TextView textView, ColorStateList colorStateList) {
        androidx.core.util.f.f(textView);
        c.f(textView, colorStateList);
    }

    public static void h(TextView textView, PorterDuff.Mode mode) {
        androidx.core.util.f.f(textView);
        c.g(textView, mode);
    }

    public static void i(TextView textView, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        b.e(textView, drawable, drawable2, drawable3, drawable4);
    }

    public static void j(TextView textView, int i7) {
        androidx.core.util.f.c(i7);
        if (Build.VERSION.SDK_INT >= 28) {
            e.c(textView, i7);
            return;
        }
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i8 = a.a(textView) ? fontMetricsInt.top : fontMetricsInt.ascent;
        if (i7 > Math.abs(i8)) {
            textView.setPadding(textView.getPaddingLeft(), i7 + i8, textView.getPaddingRight(), textView.getPaddingBottom());
        }
    }

    public static void k(TextView textView, int i7) {
        androidx.core.util.f.c(i7);
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i8 = a.a(textView) ? fontMetricsInt.bottom : fontMetricsInt.descent;
        if (i7 > Math.abs(i8)) {
            textView.setPadding(textView.getPaddingLeft(), textView.getPaddingTop(), textView.getPaddingRight(), i7 - i8);
        }
    }

    public static void l(TextView textView, int i7) {
        androidx.core.util.f.c(i7);
        if (i7 != textView.getPaint().getFontMetricsInt(null)) {
            textView.setLineSpacing(i7 - r0, 1.0f);
        }
    }

    public static void m(TextView textView, n nVar) {
        if (Build.VERSION.SDK_INT >= 29) {
            throw null;
        }
        f(textView);
        throw null;
    }

    public static void n(TextView textView, int i7) {
        textView.setTextAppearance(i7);
    }

    public static void o(TextView textView, n.a aVar) {
        b.h(textView, d(aVar.d()));
        textView.getPaint().set(aVar.e());
        c.e(textView, aVar.b());
        c.h(textView, aVar.c());
    }

    public static ActionMode.Callback p(ActionMode.Callback callback) {
        return (!(callback instanceof f) || Build.VERSION.SDK_INT < 26) ? callback : ((f) callback).d();
    }

    public static ActionMode.Callback q(TextView textView, ActionMode.Callback callback) {
        int i7 = Build.VERSION.SDK_INT;
        return (i7 < 26 || i7 > 27 || (callback instanceof f) || callback == null) ? callback : new f(callback, textView);
    }
}
