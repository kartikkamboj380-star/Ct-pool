package androidx.appcompat.app;

import android.R;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import androidx.appcompat.widget.C0527d;
import androidx.appcompat.widget.C0529f;
import androidx.appcompat.widget.C0530g;
import androidx.appcompat.widget.C0531h;
import androidx.appcompat.widget.C0535l;
import androidx.appcompat.widget.C0539p;
import androidx.appcompat.widget.C0541s;
import androidx.appcompat.widget.C0544v;
import androidx.appcompat.widget.C0545w;
import androidx.appcompat.widget.C0547y;
import androidx.appcompat.widget.D;
import androidx.appcompat.widget.e0;
import androidx.core.view.H;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public class r {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Class[] f5199b = {Context.class, AttributeSet.class};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int[] f5200c = {R.attr.onClick};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int[] f5201d = {R.attr.accessibilityHeading};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int[] f5202e = {R.attr.accessibilityPaneTitle};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int[] f5203f = {R.attr.screenReaderFocusable};

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final String[] f5204g = {"android.widget.", "android.view.", "android.webkit."};

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final n.g f5205h = new n.g();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object[] f5206a = new Object[2];

    private static class a implements View.OnClickListener {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private final View f5207m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final String f5208n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private Method f5209o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private Context f5210p;

        public a(View view, String str) {
            this.f5207m = view;
            this.f5208n = str;
        }

        private void a(Context context) {
            String str;
            Method method;
            while (context != null) {
                try {
                    if (!context.isRestricted() && (method = context.getClass().getMethod(this.f5208n, View.class)) != null) {
                        this.f5209o = method;
                        this.f5210p = context;
                        return;
                    }
                } catch (NoSuchMethodException unused) {
                }
                context = context instanceof ContextWrapper ? ((ContextWrapper) context).getBaseContext() : null;
            }
            int id = this.f5207m.getId();
            if (id == -1) {
                str = "";
            } else {
                str = " with id '" + this.f5207m.getContext().getResources().getResourceEntryName(id) + "'";
            }
            throw new IllegalStateException("Could not find method " + this.f5208n + "(View) in a parent or ancestor Context for android:onClick attribute defined on view " + this.f5207m.getClass() + str);
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (this.f5209o == null) {
                a(this.f5207m.getContext());
            }
            try {
                this.f5209o.invoke(this.f5210p, view);
            } catch (IllegalAccessException e7) {
                throw new IllegalStateException("Could not execute non-public method for android:onClick", e7);
            } catch (InvocationTargetException e8) {
                throw new IllegalStateException("Could not execute method for android:onClick", e8);
            }
        }
    }

    private void a(Context context, View view, AttributeSet attributeSet) {
        if (Build.VERSION.SDK_INT > 28) {
            return;
        }
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f5201d);
        if (typedArrayObtainStyledAttributes.hasValue(0)) {
            H.q0(view, typedArrayObtainStyledAttributes.getBoolean(0, false));
        }
        typedArrayObtainStyledAttributes.recycle();
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, f5202e);
        if (typedArrayObtainStyledAttributes2.hasValue(0)) {
            H.s0(view, typedArrayObtainStyledAttributes2.getString(0));
        }
        typedArrayObtainStyledAttributes2.recycle();
        TypedArray typedArrayObtainStyledAttributes3 = context.obtainStyledAttributes(attributeSet, f5203f);
        if (typedArrayObtainStyledAttributes3.hasValue(0)) {
            H.E0(view, typedArrayObtainStyledAttributes3.getBoolean(0, false));
        }
        typedArrayObtainStyledAttributes3.recycle();
    }

    private void b(View view, AttributeSet attributeSet) {
        Context context = view.getContext();
        if ((context instanceof ContextWrapper) && H.O(view)) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f5200c);
            String string = typedArrayObtainStyledAttributes.getString(0);
            if (string != null) {
                view.setOnClickListener(new a(view, string));
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    private View s(Context context, String str, String str2) {
        String str3;
        n.g gVar = f5205h;
        Constructor constructor = (Constructor) gVar.get(str);
        if (constructor == null) {
            if (str2 != null) {
                try {
                    str3 = str2 + str;
                } catch (Exception unused) {
                    return null;
                }
            } else {
                str3 = str;
            }
            constructor = Class.forName(str3, false, context.getClassLoader()).asSubclass(View.class).getConstructor(f5199b);
            gVar.put(str, constructor);
        }
        constructor.setAccessible(true);
        return (View) constructor.newInstance(this.f5206a);
    }

    private View t(Context context, String str, AttributeSet attributeSet) {
        if (str.equals("view")) {
            str = attributeSet.getAttributeValue(null, "class");
        }
        try {
            Object[] objArr = this.f5206a;
            objArr[0] = context;
            objArr[1] = attributeSet;
            if (-1 != str.indexOf(46)) {
                return s(context, str, null);
            }
            int i7 = 0;
            while (true) {
                String[] strArr = f5204g;
                if (i7 >= strArr.length) {
                    return null;
                }
                View viewS = s(context, str, strArr[i7]);
                if (viewS != null) {
                    return viewS;
                }
                i7++;
            }
        } catch (Exception unused) {
            return null;
        } finally {
            Object[] objArr2 = this.f5206a;
            objArr2[0] = null;
            objArr2[1] = null;
        }
    }

    private static Context u(Context context, AttributeSet attributeSet, boolean z6, boolean z7) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, e.j.f18940H3, 0, 0);
        int resourceId = z6 ? typedArrayObtainStyledAttributes.getResourceId(e.j.f18945I3, 0) : 0;
        if (z7 && resourceId == 0 && (resourceId = typedArrayObtainStyledAttributes.getResourceId(e.j.f18950J3, 0)) != 0) {
            Log.i("AppCompatViewInflater", "app:theme is now deprecated. Please move to using android:theme instead.");
        }
        typedArrayObtainStyledAttributes.recycle();
        return resourceId != 0 ? ((context instanceof androidx.appcompat.view.d) && ((androidx.appcompat.view.d) context).c() == resourceId) ? context : new androidx.appcompat.view.d(context, resourceId) : context;
    }

    private void v(View view, String str) {
        if (view != null) {
            return;
        }
        throw new IllegalStateException(getClass().getName() + " asked to inflate view for <" + str + ">, but returned null");
    }

    protected C0527d c(Context context, AttributeSet attributeSet) {
        return new C0527d(context, attributeSet);
    }

    protected C0529f d(Context context, AttributeSet attributeSet) {
        return new C0529f(context, attributeSet);
    }

    protected C0530g e(Context context, AttributeSet attributeSet) {
        return new C0530g(context, attributeSet);
    }

    protected C0531h f(Context context, AttributeSet attributeSet) {
        return new C0531h(context, attributeSet);
    }

    protected C0535l g(Context context, AttributeSet attributeSet) {
        return new C0535l(context, attributeSet);
    }

    protected C0539p h(Context context, AttributeSet attributeSet) {
        return new C0539p(context, attributeSet);
    }

    protected androidx.appcompat.widget.r i(Context context, AttributeSet attributeSet) {
        return new androidx.appcompat.widget.r(context, attributeSet);
    }

    protected C0541s j(Context context, AttributeSet attributeSet) {
        return new C0541s(context, attributeSet);
    }

    protected C0544v k(Context context, AttributeSet attributeSet) {
        return new C0544v(context, attributeSet);
    }

    protected C0545w l(Context context, AttributeSet attributeSet) {
        return new C0545w(context, attributeSet);
    }

    protected C0547y m(Context context, AttributeSet attributeSet) {
        return new C0547y(context, attributeSet);
    }

    protected androidx.appcompat.widget.A n(Context context, AttributeSet attributeSet) {
        return new androidx.appcompat.widget.A(context, attributeSet);
    }

    protected D o(Context context, AttributeSet attributeSet) {
        return new D(context, attributeSet);
    }

    protected androidx.appcompat.widget.H p(Context context, AttributeSet attributeSet) {
        return new androidx.appcompat.widget.H(context, attributeSet);
    }

    protected View q(Context context, String str, AttributeSet attributeSet) {
        return null;
    }

    public final View r(View view, String str, Context context, AttributeSet attributeSet, boolean z6, boolean z7, boolean z8, boolean z9) {
        Context context2;
        View viewL;
        context2 = (!z6 || view == null) ? context : view.getContext();
        if (z7 || z8) {
            context2 = u(context2, attributeSet, z7, z8);
        }
        if (z9) {
            context2 = e0.b(context2);
        }
        str.hashCode();
        switch (str) {
            case "RatingBar":
                viewL = l(context2, attributeSet);
                v(viewL, str);
                break;
            case "CheckedTextView":
                viewL = f(context2, attributeSet);
                v(viewL, str);
                break;
            case "MultiAutoCompleteTextView":
                viewL = j(context2, attributeSet);
                v(viewL, str);
                break;
            case "TextView":
                viewL = o(context2, attributeSet);
                v(viewL, str);
                break;
            case "ImageButton":
                viewL = h(context2, attributeSet);
                v(viewL, str);
                break;
            case "SeekBar":
                viewL = m(context2, attributeSet);
                v(viewL, str);
                break;
            case "Spinner":
                viewL = n(context2, attributeSet);
                v(viewL, str);
                break;
            case "RadioButton":
                viewL = k(context2, attributeSet);
                v(viewL, str);
                break;
            case "ToggleButton":
                viewL = p(context2, attributeSet);
                v(viewL, str);
                break;
            case "ImageView":
                viewL = i(context2, attributeSet);
                v(viewL, str);
                break;
            case "AutoCompleteTextView":
                viewL = c(context2, attributeSet);
                v(viewL, str);
                break;
            case "CheckBox":
                viewL = e(context2, attributeSet);
                v(viewL, str);
                break;
            case "EditText":
                viewL = g(context2, attributeSet);
                v(viewL, str);
                break;
            case "Button":
                viewL = d(context2, attributeSet);
                v(viewL, str);
                break;
            default:
                viewL = q(context2, str, attributeSet);
                break;
        }
        if (viewL == null && context != context2) {
            viewL = t(context2, str, attributeSet);
        }
        if (viewL != null) {
            b(viewL, attributeSet);
            a(context2, viewL, attributeSet);
        }
        return viewL;
    }
}
