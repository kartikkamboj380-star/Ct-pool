package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import h0.AbstractC1704b;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public final class X {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static X f5955i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private WeakHashMap f5957a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private n.g f5958b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private n.h f5959c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final WeakHashMap f5960d = new WeakHashMap(0);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private TypedValue f5961e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f5962f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private c f5963g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final PorterDuff.Mode f5954h = PorterDuff.Mode.SRC_IN;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final a f5956j = new a(6);

    private static class a extends n.e {
        public a(int i7) {
            super(i7);
        }

        private static int j(int i7, PorterDuff.Mode mode) {
            return ((i7 + 31) * 31) + mode.hashCode();
        }

        PorterDuffColorFilter k(int i7, PorterDuff.Mode mode) {
            return (PorterDuffColorFilter) c(Integer.valueOf(j(i7, mode)));
        }

        PorterDuffColorFilter l(int i7, PorterDuff.Mode mode, PorterDuffColorFilter porterDuffColorFilter) {
            return (PorterDuffColorFilter) d(Integer.valueOf(j(i7, mode)), porterDuffColorFilter);
        }
    }

    private interface b {
        Drawable a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme);
    }

    public interface c {
        boolean a(Context context, int i7, Drawable drawable);

        PorterDuff.Mode b(int i7);

        Drawable c(X x6, Context context, int i7);

        ColorStateList d(Context context, int i7);

        boolean e(Context context, int i7, Drawable drawable);
    }

    private synchronized boolean a(Context context, long j7, Drawable drawable) {
        try {
            Drawable.ConstantState constantState = drawable.getConstantState();
            if (constantState == null) {
                return false;
            }
            n.d dVar = (n.d) this.f5960d.get(context);
            if (dVar == null) {
                dVar = new n.d();
                this.f5960d.put(context, dVar);
            }
            dVar.i(j7, new WeakReference(constantState));
            return true;
        } catch (Throwable th) {
            throw th;
        }
    }

    private void b(Context context, int i7, ColorStateList colorStateList) {
        if (this.f5957a == null) {
            this.f5957a = new WeakHashMap();
        }
        n.h hVar = (n.h) this.f5957a.get(context);
        if (hVar == null) {
            hVar = new n.h();
            this.f5957a.put(context, hVar);
        }
        hVar.a(i7, colorStateList);
    }

    private void c(Context context) {
        if (this.f5962f) {
            return;
        }
        this.f5962f = true;
        Drawable drawableI = i(context, h.b.f19559a);
        if (drawableI == null || !p(drawableI)) {
            this.f5962f = false;
            throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
        }
    }

    private static long d(TypedValue typedValue) {
        return (((long) typedValue.assetCookie) << 32) | ((long) typedValue.data);
    }

    private Drawable e(Context context, int i7) {
        if (this.f5961e == null) {
            this.f5961e = new TypedValue();
        }
        TypedValue typedValue = this.f5961e;
        context.getResources().getValue(i7, typedValue, true);
        long jD = d(typedValue);
        Drawable drawableH = h(context, jD);
        if (drawableH != null) {
            return drawableH;
        }
        c cVar = this.f5963g;
        Drawable drawableC = cVar == null ? null : cVar.c(this, context, i7);
        if (drawableC != null) {
            drawableC.setChangingConfigurations(typedValue.changingConfigurations);
            a(context, jD, drawableC);
        }
        return drawableC;
    }

    private static PorterDuffColorFilter f(ColorStateList colorStateList, PorterDuff.Mode mode, int[] iArr) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return k(colorStateList.getColorForState(iArr, 0), mode);
    }

    public static synchronized X g() {
        try {
            if (f5955i == null) {
                X x6 = new X();
                f5955i = x6;
                o(x6);
            }
        } catch (Throwable th) {
            throw th;
        }
        return f5955i;
    }

    private synchronized Drawable h(Context context, long j7) {
        n.d dVar = (n.d) this.f5960d.get(context);
        if (dVar == null) {
            return null;
        }
        WeakReference weakReference = (WeakReference) dVar.d(j7);
        if (weakReference != null) {
            Drawable.ConstantState constantState = (Drawable.ConstantState) weakReference.get();
            if (constantState != null) {
                return constantState.newDrawable(context.getResources());
            }
            dVar.j(j7);
        }
        return null;
    }

    public static synchronized PorterDuffColorFilter k(int i7, PorterDuff.Mode mode) {
        PorterDuffColorFilter porterDuffColorFilterK;
        a aVar = f5956j;
        porterDuffColorFilterK = aVar.k(i7, mode);
        if (porterDuffColorFilterK == null) {
            porterDuffColorFilterK = new PorterDuffColorFilter(i7, mode);
            aVar.l(i7, mode, porterDuffColorFilterK);
        }
        return porterDuffColorFilterK;
    }

    private ColorStateList m(Context context, int i7) {
        n.h hVar;
        WeakHashMap weakHashMap = this.f5957a;
        if (weakHashMap == null || (hVar = (n.h) weakHashMap.get(context)) == null) {
            return null;
        }
        return (ColorStateList) hVar.g(i7);
    }

    private static void o(X x6) {
    }

    private static boolean p(Drawable drawable) {
        return (drawable instanceof AbstractC1704b) || "android.graphics.drawable.VectorDrawable".equals(drawable.getClass().getName());
    }

    private Drawable q(Context context, int i7) {
        int next;
        n.g gVar = this.f5958b;
        if (gVar == null || gVar.isEmpty()) {
            return null;
        }
        n.h hVar = this.f5959c;
        if (hVar != null) {
            String str = (String) hVar.g(i7);
            if ("appcompat_skip_skip".equals(str) || (str != null && this.f5958b.get(str) == null)) {
                return null;
            }
        } else {
            this.f5959c = new n.h();
        }
        if (this.f5961e == null) {
            this.f5961e = new TypedValue();
        }
        TypedValue typedValue = this.f5961e;
        Resources resources = context.getResources();
        resources.getValue(i7, typedValue, true);
        long jD = d(typedValue);
        Drawable drawableH = h(context, jD);
        if (drawableH != null) {
            return drawableH;
        }
        CharSequence charSequence = typedValue.string;
        if (charSequence != null && charSequence.toString().endsWith(".xml")) {
            try {
                XmlResourceParser xml = resources.getXml(i7);
                AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
                do {
                    next = xml.next();
                    if (next == 2) {
                        break;
                    }
                } while (next != 1);
                if (next != 2) {
                    throw new XmlPullParserException("No start tag found");
                }
                String name = xml.getName();
                this.f5959c.a(i7, name);
                b bVar = (b) this.f5958b.get(name);
                if (bVar != null) {
                    drawableH = bVar.a(context, xml, attributeSetAsAttributeSet, context.getTheme());
                }
                if (drawableH != null) {
                    drawableH.setChangingConfigurations(typedValue.changingConfigurations);
                    a(context, jD, drawableH);
                }
            } catch (Exception e7) {
                Log.e("ResourceManagerInternal", "Exception while inflating drawable", e7);
            }
        }
        if (drawableH == null) {
            this.f5959c.a(i7, "appcompat_skip_skip");
        }
        return drawableH;
    }

    private Drawable u(Context context, int i7, boolean z6, Drawable drawable) {
        ColorStateList colorStateListL = l(context, i7);
        if (colorStateListL == null) {
            c cVar = this.f5963g;
            if ((cVar == null || !cVar.e(context, i7, drawable)) && !w(context, i7, drawable) && z6) {
                return null;
            }
            return drawable;
        }
        if (O.a(drawable)) {
            drawable = drawable.mutate();
        }
        Drawable drawableL = androidx.core.graphics.drawable.a.l(drawable);
        androidx.core.graphics.drawable.a.i(drawableL, colorStateListL);
        PorterDuff.Mode modeN = n(i7);
        if (modeN == null) {
            return drawableL;
        }
        androidx.core.graphics.drawable.a.j(drawableL, modeN);
        return drawableL;
    }

    static void v(Drawable drawable, f0 f0Var, int[] iArr) {
        int[] state = drawable.getState();
        if (O.a(drawable) && drawable.mutate() != drawable) {
            Log.d("ResourceManagerInternal", "Mutated drawable is not the same instance as the input.");
            return;
        }
        if ((drawable instanceof LayerDrawable) && drawable.isStateful()) {
            drawable.setState(new int[0]);
            drawable.setState(state);
        }
        boolean z6 = f0Var.f6110d;
        if (z6 || f0Var.f6109c) {
            drawable.setColorFilter(f(z6 ? f0Var.f6107a : null, f0Var.f6109c ? f0Var.f6108b : f5954h, iArr));
        } else {
            drawable.clearColorFilter();
        }
    }

    public synchronized Drawable i(Context context, int i7) {
        return j(context, i7, false);
    }

    synchronized Drawable j(Context context, int i7, boolean z6) {
        Drawable drawableQ;
        try {
            c(context);
            drawableQ = q(context, i7);
            if (drawableQ == null) {
                drawableQ = e(context, i7);
            }
            if (drawableQ == null) {
                drawableQ = androidx.core.content.b.e(context, i7);
            }
            if (drawableQ != null) {
                drawableQ = u(context, i7, z6, drawableQ);
            }
            if (drawableQ != null) {
                O.b(drawableQ);
            }
        } catch (Throwable th) {
            throw th;
        }
        return drawableQ;
    }

    synchronized ColorStateList l(Context context, int i7) {
        ColorStateList colorStateListM;
        colorStateListM = m(context, i7);
        if (colorStateListM == null) {
            c cVar = this.f5963g;
            colorStateListM = cVar == null ? null : cVar.d(context, i7);
            if (colorStateListM != null) {
                b(context, i7, colorStateListM);
            }
        }
        return colorStateListM;
    }

    PorterDuff.Mode n(int i7) {
        c cVar = this.f5963g;
        if (cVar == null) {
            return null;
        }
        return cVar.b(i7);
    }

    public synchronized void r(Context context) {
        n.d dVar = (n.d) this.f5960d.get(context);
        if (dVar != null) {
            dVar.a();
        }
    }

    synchronized Drawable s(Context context, q0 q0Var, int i7) {
        try {
            Drawable drawableQ = q(context, i7);
            if (drawableQ == null) {
                drawableQ = q0Var.a(i7);
            }
            if (drawableQ == null) {
                return null;
            }
            return u(context, i7, false, drawableQ);
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void t(c cVar) {
        this.f5963g = cVar;
    }

    boolean w(Context context, int i7, Drawable drawable) {
        c cVar = this.f5963g;
        return cVar != null && cVar.a(context, i7, drawable);
    }
}
