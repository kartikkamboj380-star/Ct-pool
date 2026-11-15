package androidx.appcompat.view;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.widget.O;
import androidx.appcompat.widget.h0;
import androidx.core.view.AbstractC0582b;
import androidx.core.view.AbstractC0600u;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import v.InterfaceMenuC2149a;

/* JADX INFO: loaded from: classes.dex */
public class g extends MenuInflater {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static final Class[] f5263e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    static final Class[] f5264f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Object[] f5265a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final Object[] f5266b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    Context f5267c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Object f5268d;

    private static class a implements MenuItem.OnMenuItemClickListener {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final Class[] f5269c = {MenuItem.class};

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Object f5270a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Method f5271b;

        public a(Object obj, String str) {
            this.f5270a = obj;
            Class<?> cls = obj.getClass();
            try {
                this.f5271b = cls.getMethod(str, f5269c);
            } catch (Exception e7) {
                InflateException inflateException = new InflateException("Couldn't resolve menu item onClick handler " + str + " in class " + cls.getName());
                inflateException.initCause(e7);
                throw inflateException;
            }
        }

        @Override // android.view.MenuItem.OnMenuItemClickListener
        public boolean onMenuItemClick(MenuItem menuItem) {
            try {
                if (this.f5271b.getReturnType() == Boolean.TYPE) {
                    return ((Boolean) this.f5271b.invoke(this.f5270a, menuItem)).booleanValue();
                }
                this.f5271b.invoke(this.f5270a, menuItem);
                return true;
            } catch (Exception e7) {
                throw new RuntimeException(e7);
            }
        }
    }

    private class b {

        /* JADX INFO: renamed from: A, reason: collision with root package name */
        AbstractC0582b f5272A;

        /* JADX INFO: renamed from: B, reason: collision with root package name */
        private CharSequence f5273B;

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        private CharSequence f5274C;

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        private ColorStateList f5275D = null;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        private PorterDuff.Mode f5276E = null;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Menu f5278a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f5279b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f5280c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f5281d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f5282e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f5283f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private boolean f5284g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private boolean f5285h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private int f5286i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private int f5287j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private CharSequence f5288k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private CharSequence f5289l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private int f5290m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private char f5291n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private int f5292o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private char f5293p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private int f5294q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private int f5295r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private boolean f5296s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private boolean f5297t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        private boolean f5298u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        private int f5299v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        private int f5300w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        private String f5301x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        private String f5302y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        private String f5303z;

        public b(Menu menu) {
            this.f5278a = menu;
            h();
        }

        private char c(String str) {
            if (str == null) {
                return (char) 0;
            }
            return str.charAt(0);
        }

        private Object e(String str, Class[] clsArr, Object[] objArr) {
            try {
                Constructor<?> constructor = Class.forName(str, false, g.this.f5267c.getClassLoader()).getConstructor(clsArr);
                constructor.setAccessible(true);
                return constructor.newInstance(objArr);
            } catch (Exception e7) {
                Log.w("SupportMenuInflater", "Cannot instantiate class: " + str, e7);
                return null;
            }
        }

        private void i(MenuItem menuItem) {
            boolean z6 = false;
            menuItem.setChecked(this.f5296s).setVisible(this.f5297t).setEnabled(this.f5298u).setCheckable(this.f5295r >= 1).setTitleCondensed(this.f5289l).setIcon(this.f5290m);
            int i7 = this.f5299v;
            if (i7 >= 0) {
                menuItem.setShowAsAction(i7);
            }
            if (this.f5303z != null) {
                if (g.this.f5267c.isRestricted()) {
                    throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
                }
                menuItem.setOnMenuItemClickListener(new a(g.this.b(), this.f5303z));
            }
            if (this.f5295r >= 2) {
                if (menuItem instanceof androidx.appcompat.view.menu.i) {
                    ((androidx.appcompat.view.menu.i) menuItem).t(true);
                } else if (menuItem instanceof j) {
                    ((j) menuItem).h(true);
                }
            }
            String str = this.f5301x;
            if (str != null) {
                menuItem.setActionView((View) e(str, g.f5263e, g.this.f5265a));
                z6 = true;
            }
            int i8 = this.f5300w;
            if (i8 > 0) {
                if (z6) {
                    Log.w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
                } else {
                    menuItem.setActionView(i8);
                }
            }
            AbstractC0582b abstractC0582b = this.f5272A;
            if (abstractC0582b != null) {
                AbstractC0600u.a(menuItem, abstractC0582b);
            }
            AbstractC0600u.c(menuItem, this.f5273B);
            AbstractC0600u.g(menuItem, this.f5274C);
            AbstractC0600u.b(menuItem, this.f5291n, this.f5292o);
            AbstractC0600u.f(menuItem, this.f5293p, this.f5294q);
            PorterDuff.Mode mode = this.f5276E;
            if (mode != null) {
                AbstractC0600u.e(menuItem, mode);
            }
            ColorStateList colorStateList = this.f5275D;
            if (colorStateList != null) {
                AbstractC0600u.d(menuItem, colorStateList);
            }
        }

        public void a() {
            this.f5285h = true;
            i(this.f5278a.add(this.f5279b, this.f5286i, this.f5287j, this.f5288k));
        }

        public SubMenu b() {
            this.f5285h = true;
            SubMenu subMenuAddSubMenu = this.f5278a.addSubMenu(this.f5279b, this.f5286i, this.f5287j, this.f5288k);
            i(subMenuAddSubMenu.getItem());
            return subMenuAddSubMenu;
        }

        public boolean d() {
            return this.f5285h;
        }

        public void f(AttributeSet attributeSet) {
            TypedArray typedArrayObtainStyledAttributes = g.this.f5267c.obtainStyledAttributes(attributeSet, e.j.f19095o1);
            this.f5279b = typedArrayObtainStyledAttributes.getResourceId(e.j.f19105q1, 0);
            this.f5280c = typedArrayObtainStyledAttributes.getInt(e.j.f19115s1, 0);
            this.f5281d = typedArrayObtainStyledAttributes.getInt(e.j.f19120t1, 0);
            this.f5282e = typedArrayObtainStyledAttributes.getInt(e.j.f19125u1, 0);
            this.f5283f = typedArrayObtainStyledAttributes.getBoolean(e.j.f19110r1, true);
            this.f5284g = typedArrayObtainStyledAttributes.getBoolean(e.j.f19100p1, true);
            typedArrayObtainStyledAttributes.recycle();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public void g(AttributeSet attributeSet) {
            h0 h0VarU = h0.u(g.this.f5267c, attributeSet, e.j.f19130v1);
            this.f5286i = h0VarU.n(e.j.f19145y1, 0);
            this.f5287j = (h0VarU.k(e.j.f18908B1, this.f5280c) & (-65536)) | (h0VarU.k(e.j.f18913C1, this.f5281d) & 65535);
            this.f5288k = h0VarU.p(e.j.f18918D1);
            this.f5289l = h0VarU.p(e.j.f18923E1);
            this.f5290m = h0VarU.n(e.j.f19135w1, 0);
            this.f5291n = c(h0VarU.o(e.j.f18928F1));
            this.f5292o = h0VarU.k(e.j.f18963M1, 4096);
            this.f5293p = c(h0VarU.o(e.j.f18933G1));
            this.f5294q = h0VarU.k(e.j.f18983Q1, 4096);
            this.f5295r = h0VarU.s(e.j.f18938H1) ? h0VarU.a(e.j.f18938H1, false) : this.f5282e;
            this.f5296s = h0VarU.a(e.j.f19150z1, false);
            this.f5297t = h0VarU.a(e.j.f18903A1, this.f5283f);
            this.f5298u = h0VarU.a(e.j.f19140x1, this.f5284g);
            this.f5299v = h0VarU.k(e.j.f18988R1, -1);
            this.f5303z = h0VarU.o(e.j.f18943I1);
            this.f5300w = h0VarU.n(e.j.f18948J1, 0);
            this.f5301x = h0VarU.o(e.j.f18958L1);
            String strO = h0VarU.o(e.j.f18953K1);
            this.f5302y = strO;
            boolean z6 = strO != null;
            if (z6 && this.f5300w == 0 && this.f5301x == null) {
                this.f5272A = (AbstractC0582b) e(strO, g.f5264f, g.this.f5266b);
            } else {
                if (z6) {
                    Log.w("SupportMenuInflater", "Ignoring attribute 'actionProviderClass'. Action view already specified.");
                }
                this.f5272A = null;
            }
            this.f5273B = h0VarU.p(e.j.f18968N1);
            this.f5274C = h0VarU.p(e.j.f18993S1);
            if (h0VarU.s(e.j.f18978P1)) {
                this.f5276E = O.e(h0VarU.k(e.j.f18978P1, -1), this.f5276E);
            } else {
                this.f5276E = null;
            }
            if (h0VarU.s(e.j.f18973O1)) {
                this.f5275D = h0VarU.c(e.j.f18973O1);
            } else {
                this.f5275D = null;
            }
            h0VarU.w();
            this.f5285h = false;
        }

        public void h() {
            this.f5279b = 0;
            this.f5280c = 0;
            this.f5281d = 0;
            this.f5282e = 0;
            this.f5283f = true;
            this.f5284g = true;
        }
    }

    static {
        Class[] clsArr = {Context.class};
        f5263e = clsArr;
        f5264f = clsArr;
    }

    public g(Context context) {
        super(context);
        this.f5267c = context;
        Object[] objArr = {context};
        this.f5265a = objArr;
        this.f5266b = objArr;
    }

    private Object a(Object obj) {
        return (!(obj instanceof Activity) && (obj instanceof ContextWrapper)) ? a(((ContextWrapper) obj).getBaseContext()) : obj;
    }

    private void c(XmlPullParser xmlPullParser, AttributeSet attributeSet, Menu menu) throws XmlPullParserException, IOException {
        b bVar = new b(menu);
        int eventType = xmlPullParser.getEventType();
        while (true) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if (!name.equals("menu")) {
                    throw new RuntimeException("Expecting menu, got " + name);
                }
                eventType = xmlPullParser.next();
            } else {
                eventType = xmlPullParser.next();
                if (eventType == 1) {
                    break;
                }
            }
        }
        boolean z6 = false;
        boolean z7 = false;
        String str = null;
        while (!z6) {
            if (eventType == 1) {
                throw new RuntimeException("Unexpected end of document");
            }
            if (eventType != 2) {
                if (eventType == 3) {
                    String name2 = xmlPullParser.getName();
                    if (z7 && name2.equals(str)) {
                        z7 = false;
                        str = null;
                    } else if (name2.equals("group")) {
                        bVar.h();
                    } else if (name2.equals("item")) {
                        if (!bVar.d()) {
                            AbstractC0582b abstractC0582b = bVar.f5272A;
                            if (abstractC0582b == null || !abstractC0582b.a()) {
                                bVar.a();
                            } else {
                                bVar.b();
                            }
                        }
                    } else if (name2.equals("menu")) {
                        z6 = true;
                    }
                }
            } else if (!z7) {
                String name3 = xmlPullParser.getName();
                if (name3.equals("group")) {
                    bVar.f(attributeSet);
                } else if (name3.equals("item")) {
                    bVar.g(attributeSet);
                } else if (name3.equals("menu")) {
                    c(xmlPullParser, attributeSet, bVar.b());
                } else {
                    str = name3;
                    z7 = true;
                }
            }
            eventType = xmlPullParser.next();
        }
    }

    Object b() {
        if (this.f5268d == null) {
            this.f5268d = a(this.f5267c);
        }
        return this.f5268d;
    }

    @Override // android.view.MenuInflater
    public void inflate(int i7, Menu menu) {
        if (!(menu instanceof InterfaceMenuC2149a)) {
            super.inflate(i7, menu);
            return;
        }
        XmlResourceParser layout = null;
        try {
            try {
                try {
                    layout = this.f5267c.getResources().getLayout(i7);
                    c(layout, Xml.asAttributeSet(layout), menu);
                } catch (IOException e7) {
                    throw new InflateException("Error inflating menu XML", e7);
                }
            } catch (XmlPullParserException e8) {
                throw new InflateException("Error inflating menu XML", e8);
            }
        } finally {
            if (layout != null) {
                layout.close();
            }
        }
    }
}
