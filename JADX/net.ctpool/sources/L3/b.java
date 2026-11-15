package L3;

import android.R;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Build;
import android.util.Log;

/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final boolean f1973a = true;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int[] f1974b = {R.attr.state_pressed};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int[] f1975c = {R.attr.state_hovered, R.attr.state_focused};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int[] f1976d = {R.attr.state_focused};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int[] f1977e = {R.attr.state_hovered};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int[] f1978f = {R.attr.state_selected, R.attr.state_pressed};

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final int[] f1979g = {R.attr.state_selected, R.attr.state_hovered, R.attr.state_focused};

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int[] f1980h = {R.attr.state_selected, R.attr.state_focused};

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final int[] f1981i = {R.attr.state_selected, R.attr.state_hovered};

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final int[] f1982j = {R.attr.state_selected};

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final int[] f1983k = {R.attr.state_enabled, R.attr.state_pressed};

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    static final String f1984l = b.class.getSimpleName();

    public static ColorStateList a(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return ColorStateList.valueOf(0);
        }
        if (Build.VERSION.SDK_INT <= 27 && Color.alpha(colorStateList.getDefaultColor()) == 0 && Color.alpha(colorStateList.getColorForState(f1983k, 0)) != 0) {
            Log.w(f1984l, "Use a non-transparent color for the default color as it will be used to finish ripple animations.");
        }
        return colorStateList;
    }

    public static boolean b(int[] iArr) {
        boolean z6 = false;
        boolean z7 = false;
        for (int i7 : iArr) {
            if (i7 == 16842910) {
                z6 = true;
            } else if (i7 == 16842908 || i7 == 16842919 || i7 == 16843623) {
                z7 = true;
            }
        }
        return z6 && z7;
    }
}
