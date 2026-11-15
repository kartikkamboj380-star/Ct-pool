package com.facebook.react.views.view;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.util.TypedValue;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.SoftAssertions;
import com.facebook.react.uimanager.G;

/* JADX INFO: loaded from: classes.dex */
public abstract class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final TypedValue f13251a = new TypedValue();

    public static Drawable a(Context context, ReadableMap readableMap) {
        Drawable drawableF;
        String string = readableMap.getString("type");
        if ("ThemeAttrAndroid".equals(string)) {
            String string2 = readableMap.getString("attribute");
            int iB = b(context, string2);
            if (!context.getTheme().resolveAttribute(iB, f13251a, true)) {
                throw new JSApplicationIllegalArgumentException("Attribute " + string2 + " with id " + iB + " couldn't be resolved into a drawable");
            }
            drawableF = d(context);
        } else {
            if (!"RippleAndroid".equals(string)) {
                throw new JSApplicationIllegalArgumentException("Invalid type for android drawable: " + string);
            }
            drawableF = f(context, readableMap);
        }
        return g(readableMap, drawableF);
    }

    private static int b(Context context, String str) {
        SoftAssertions.assertNotNull(str);
        return "selectableItemBackground".equals(str) ? R.attr.selectableItemBackground : "selectableItemBackgroundBorderless".equals(str) ? R.attr.selectableItemBackgroundBorderless : context.getResources().getIdentifier(str, "attr", "android");
    }

    private static int c(Context context, ReadableMap readableMap) {
        if (readableMap.hasKey("color") && !readableMap.isNull("color")) {
            return readableMap.getInt("color");
        }
        Resources.Theme theme = context.getTheme();
        TypedValue typedValue = f13251a;
        if (theme.resolveAttribute(R.attr.colorControlHighlight, typedValue, true)) {
            return context.getResources().getColor(typedValue.resourceId);
        }
        throw new JSApplicationIllegalArgumentException("Attribute colorControlHighlight couldn't be resolved into a drawable");
    }

    private static Drawable d(Context context) {
        return context.getResources().getDrawable(f13251a.resourceId, context.getTheme());
    }

    private static Drawable e(ReadableMap readableMap) {
        if (readableMap.hasKey("borderless") && !readableMap.isNull("borderless") && readableMap.getBoolean("borderless")) {
            return null;
        }
        return new ColorDrawable(-1);
    }

    private static RippleDrawable f(Context context, ReadableMap readableMap) {
        int iC = c(context, readableMap);
        return new RippleDrawable(new ColorStateList(new int[][]{new int[0]}, new int[]{iC}), null, e(readableMap));
    }

    private static Drawable g(ReadableMap readableMap, Drawable drawable) {
        if (readableMap.hasKey("rippleRadius") && (drawable instanceof RippleDrawable)) {
            ((RippleDrawable) drawable).setRadius((int) G.c(readableMap.getDouble("rippleRadius")));
        }
        return drawable;
    }
}
