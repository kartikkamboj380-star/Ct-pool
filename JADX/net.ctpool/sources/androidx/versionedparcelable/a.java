package androidx.versionedparcelable;

import android.os.Parcelable;
import i0.InterfaceC1739a;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import n.C1890a;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final C1890a f9193a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final C1890a f9194b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final C1890a f9195c;

    public a(C1890a c1890a, C1890a c1890a2, C1890a c1890a3) {
        this.f9193a = c1890a;
        this.f9194b = c1890a2;
        this.f9195c = c1890a3;
    }

    private void N(InterfaceC1739a interfaceC1739a) {
        try {
            I(c(interfaceC1739a.getClass()).getName());
        } catch (ClassNotFoundException e7) {
            throw new RuntimeException(interfaceC1739a.getClass().getSimpleName() + " does not have a Parcelizer", e7);
        }
    }

    private Class c(Class cls) throws ClassNotFoundException {
        Class cls2 = (Class) this.f9195c.get(cls.getName());
        if (cls2 != null) {
            return cls2;
        }
        Class<?> cls3 = Class.forName(String.format("%s.%sParcelizer", cls.getPackage().getName(), cls.getSimpleName()), false, cls.getClassLoader());
        this.f9195c.put(cls.getName(), cls3);
        return cls3;
    }

    private Method d(String str) throws NoSuchMethodException {
        Method method = (Method) this.f9193a.get(str);
        if (method != null) {
            return method;
        }
        System.currentTimeMillis();
        Method declaredMethod = Class.forName(str, true, a.class.getClassLoader()).getDeclaredMethod("read", a.class);
        this.f9193a.put(str, declaredMethod);
        return declaredMethod;
    }

    private Method e(Class cls) throws NoSuchMethodException, ClassNotFoundException {
        Method method = (Method) this.f9194b.get(cls.getName());
        if (method != null) {
            return method;
        }
        Class clsC = c(cls);
        System.currentTimeMillis();
        Method declaredMethod = clsC.getDeclaredMethod("write", cls, a.class);
        this.f9194b.put(cls.getName(), declaredMethod);
        return declaredMethod;
    }

    protected abstract void A(byte[] bArr);

    public void B(byte[] bArr, int i7) {
        w(i7);
        A(bArr);
    }

    protected abstract void C(CharSequence charSequence);

    public void D(CharSequence charSequence, int i7) {
        w(i7);
        C(charSequence);
    }

    protected abstract void E(int i7);

    public void F(int i7, int i8) {
        w(i8);
        E(i7);
    }

    protected abstract void G(Parcelable parcelable);

    public void H(Parcelable parcelable, int i7) {
        w(i7);
        G(parcelable);
    }

    protected abstract void I(String str);

    public void J(String str, int i7) {
        w(i7);
        I(str);
    }

    protected void K(InterfaceC1739a interfaceC1739a, a aVar) {
        try {
            e(interfaceC1739a.getClass()).invoke(null, interfaceC1739a, aVar);
        } catch (ClassNotFoundException e7) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e7);
        } catch (IllegalAccessException e8) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e8);
        } catch (NoSuchMethodException e9) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e9);
        } catch (InvocationTargetException e10) {
            if (!(e10.getCause() instanceof RuntimeException)) {
                throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e10);
            }
            throw ((RuntimeException) e10.getCause());
        }
    }

    protected void L(InterfaceC1739a interfaceC1739a) {
        if (interfaceC1739a == null) {
            I(null);
            return;
        }
        N(interfaceC1739a);
        a aVarB = b();
        K(interfaceC1739a, aVarB);
        aVarB.a();
    }

    public void M(InterfaceC1739a interfaceC1739a, int i7) {
        w(i7);
        L(interfaceC1739a);
    }

    protected abstract void a();

    protected abstract a b();

    public boolean f() {
        return false;
    }

    protected abstract boolean g();

    public boolean h(boolean z6, int i7) {
        return !m(i7) ? z6 : g();
    }

    protected abstract byte[] i();

    public byte[] j(byte[] bArr, int i7) {
        return !m(i7) ? bArr : i();
    }

    protected abstract CharSequence k();

    public CharSequence l(CharSequence charSequence, int i7) {
        return !m(i7) ? charSequence : k();
    }

    protected abstract boolean m(int i7);

    protected InterfaceC1739a n(String str, a aVar) {
        try {
            return (InterfaceC1739a) d(str).invoke(null, aVar);
        } catch (ClassNotFoundException e7) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e7);
        } catch (IllegalAccessException e8) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e8);
        } catch (NoSuchMethodException e9) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e9);
        } catch (InvocationTargetException e10) {
            if (e10.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e10.getCause());
            }
            throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e10);
        }
    }

    protected abstract int o();

    public int p(int i7, int i8) {
        return !m(i8) ? i7 : o();
    }

    protected abstract Parcelable q();

    public Parcelable r(Parcelable parcelable, int i7) {
        return !m(i7) ? parcelable : q();
    }

    protected abstract String s();

    public String t(String str, int i7) {
        return !m(i7) ? str : s();
    }

    protected InterfaceC1739a u() {
        String strS = s();
        if (strS == null) {
            return null;
        }
        return n(strS, b());
    }

    public InterfaceC1739a v(InterfaceC1739a interfaceC1739a, int i7) {
        return !m(i7) ? interfaceC1739a : u();
    }

    protected abstract void w(int i7);

    public void x(boolean z6, boolean z7) {
    }

    protected abstract void y(boolean z6);

    public void z(boolean z6, int i7) {
        w(i7);
        y(z6);
    }
}
