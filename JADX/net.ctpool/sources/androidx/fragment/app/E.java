package androidx.fragment.app;

import android.view.ViewGroup;
import androidx.lifecycle.AbstractC0651h;
import java.lang.reflect.Modifier;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public abstract class E {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final n f7956a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ClassLoader f7957b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    int f7959d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    int f7960e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    int f7961f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    int f7962g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    int f7963h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    boolean f7964i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    String f7966k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    int f7967l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    CharSequence f7968m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    int f7969n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    CharSequence f7970o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    ArrayList f7971p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    ArrayList f7972q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    ArrayList f7974s;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    ArrayList f7958c = new ArrayList();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    boolean f7965j = true;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    boolean f7973r = false;

    static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f7975a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Fragment f7976b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        boolean f7977c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f7978d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f7979e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f7980f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f7981g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        AbstractC0651h.c f7982h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        AbstractC0651h.c f7983i;

        a() {
        }

        a(int i7, Fragment fragment) {
            this.f7975a = i7;
            this.f7976b = fragment;
            this.f7977c = false;
            AbstractC0651h.c cVar = AbstractC0651h.c.RESUMED;
            this.f7982h = cVar;
            this.f7983i = cVar;
        }

        a(int i7, Fragment fragment, boolean z6) {
            this.f7975a = i7;
            this.f7976b = fragment;
            this.f7977c = z6;
            AbstractC0651h.c cVar = AbstractC0651h.c.RESUMED;
            this.f7982h = cVar;
            this.f7983i = cVar;
        }
    }

    E(n nVar, ClassLoader classLoader) {
        this.f7956a = nVar;
        this.f7957b = classLoader;
    }

    public E b(int i7, Fragment fragment) {
        l(i7, fragment, null, 1);
        return this;
    }

    public E c(int i7, Fragment fragment, String str) {
        l(i7, fragment, str, 1);
        return this;
    }

    E d(ViewGroup viewGroup, Fragment fragment, String str) {
        fragment.mContainer = viewGroup;
        return c(viewGroup.getId(), fragment, str);
    }

    public E e(Fragment fragment, String str) {
        l(0, fragment, str, 1);
        return this;
    }

    void f(a aVar) {
        this.f7958c.add(aVar);
        aVar.f7978d = this.f7959d;
        aVar.f7979e = this.f7960e;
        aVar.f7980f = this.f7961f;
        aVar.f7981g = this.f7962g;
    }

    public abstract int g();

    public abstract int h();

    public abstract void i();

    public abstract void j();

    public E k() {
        if (this.f7964i) {
            throw new IllegalStateException("This transaction is already being added to the back stack");
        }
        this.f7965j = false;
        return this;
    }

    void l(int i7, Fragment fragment, String str, int i8) {
        String str2 = fragment.mPreviousWho;
        if (str2 != null) {
            L.c.f(fragment, str2);
        }
        Class<?> cls = fragment.getClass();
        int modifiers = cls.getModifiers();
        if (cls.isAnonymousClass() || !Modifier.isPublic(modifiers) || (cls.isMemberClass() && !Modifier.isStatic(modifiers))) {
            throw new IllegalStateException("Fragment " + cls.getCanonicalName() + " must be a public static class to be  properly recreated from instance state.");
        }
        if (str != null) {
            String str3 = fragment.mTag;
            if (str3 != null && !str.equals(str3)) {
                throw new IllegalStateException("Can't change tag of fragment " + fragment + ": was " + fragment.mTag + " now " + str);
            }
            fragment.mTag = str;
        }
        if (i7 != 0) {
            if (i7 == -1) {
                throw new IllegalArgumentException("Can't add fragment " + fragment + " with tag " + str + " to container view with no id");
            }
            int i9 = fragment.mFragmentId;
            if (i9 != 0 && i9 != i7) {
                throw new IllegalStateException("Can't change container ID of fragment " + fragment + ": was " + fragment.mFragmentId + " now " + i7);
            }
            fragment.mFragmentId = i7;
            fragment.mContainerId = i7;
        }
        f(new a(i8, fragment));
    }

    public E m(Fragment fragment) {
        f(new a(3, fragment));
        return this;
    }

    public E n(int i7, Fragment fragment) {
        return o(i7, fragment, null);
    }

    public E o(int i7, Fragment fragment, String str) {
        if (i7 == 0) {
            throw new IllegalArgumentException("Must use non-zero containerViewId");
        }
        l(i7, fragment, str, 2);
        return this;
    }

    public E p(Runnable runnable) {
        k();
        if (this.f7974s == null) {
            this.f7974s = new ArrayList();
        }
        this.f7974s.add(runnable);
        return this;
    }

    public E q(int i7, int i8) {
        return r(i7, i8, 0, 0);
    }

    public E r(int i7, int i8, int i9, int i10) {
        this.f7959d = i7;
        this.f7960e = i8;
        this.f7961f = i9;
        this.f7962g = i10;
        return this;
    }

    public E s(boolean z6) {
        this.f7973r = z6;
        return this;
    }
}
