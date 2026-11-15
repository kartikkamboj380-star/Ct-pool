package com.facebook.react.modules.i18nmanager;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.core.text.q;
import java.util.Locale;
import kotlin.jvm.internal.DefaultConstructorMarker;
import w5.k;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C0215a f11899a = new C0215a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final a f11900b = new a();

    /* JADX INFO: renamed from: com.facebook.react.modules.i18nmanager.a$a, reason: collision with other inner class name */
    public static final class C0215a {
        private C0215a() {
        }

        public final a a() {
            return a.f11900b;
        }

        public /* synthetic */ C0215a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private a() {
    }

    private final boolean c(Context context) {
        return (context.getApplicationInfo().flags & 4194304) != 0;
    }

    public static final a f() {
        return f11899a.a();
    }

    private final boolean g() {
        return q.a(Locale.getDefault()) == 1;
    }

    private final boolean h(Context context, String str, boolean z6) {
        return context.getSharedPreferences("com.facebook.react.modules.i18nmanager.I18nUtil", 0).getBoolean(str, z6);
    }

    private final boolean j(Context context) {
        return h(context, "RCTI18nUtil_allowRTL", true);
    }

    private final boolean k(Context context) {
        return h(context, "RCTI18nUtil_forceRTL", false);
    }

    private final void l(Context context, String str, boolean z6) {
        SharedPreferences.Editor editorEdit = context.getSharedPreferences("com.facebook.react.modules.i18nmanager.I18nUtil", 0).edit();
        editorEdit.putBoolean(str, z6);
        editorEdit.apply();
    }

    public final void b(Context context, boolean z6) {
        k.f(context, "context");
        l(context, "RCTI18nUtil_allowRTL", z6);
    }

    public final boolean d(Context context) {
        k.f(context, "context");
        return h(context, "RCTI18nUtil_makeRTLFlipLeftAndRightStyles", true);
    }

    public final void e(Context context, boolean z6) {
        k.f(context, "context");
        l(context, "RCTI18nUtil_forceRTL", z6);
    }

    public final boolean i(Context context) {
        k.f(context, "context");
        return c(context) && (k(context) || (j(context) && g()));
    }

    public final void m(Context context, boolean z6) {
        k.f(context, "context");
        l(context, "RCTI18nUtil_makeRTLFlipLeftAndRightStyles", z6);
    }
}
