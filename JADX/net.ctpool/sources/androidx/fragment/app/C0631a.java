package androidx.fragment.app;

import android.util.Log;
import androidx.fragment.app.E;
import androidx.fragment.app.w;
import com.google.android.gms.common.ConnectionResult;
import java.io.PrintWriter;
import java.util.ArrayList;

/* JADX INFO: renamed from: androidx.fragment.app.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class C0631a extends E implements w.l {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    final w f8090t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    boolean f8091u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    int f8092v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    boolean f8093w;

    C0631a(w wVar) {
        super(wVar.u0(), wVar.w0() != null ? wVar.w0().n().getClassLoader() : null);
        this.f8092v = -1;
        this.f8093w = false;
        this.f8090t = wVar;
    }

    public String A() {
        return this.f7966k;
    }

    public void B() {
        if (this.f7974s != null) {
            for (int i7 = 0; i7 < this.f7974s.size(); i7++) {
                ((Runnable) this.f7974s.get(i7)).run();
            }
            this.f7974s = null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    Fragment C(ArrayList arrayList, Fragment fragment) {
        for (int size = this.f7958c.size() - 1; size >= 0; size--) {
            E.a aVar = (E.a) this.f7958c.get(size);
            int i7 = aVar.f7975a;
            if (i7 == 1) {
                arrayList.remove(aVar.f7976b);
            } else if (i7 != 3) {
                switch (i7) {
                    case 6:
                        arrayList.add(aVar.f7976b);
                        break;
                    case 8:
                        fragment = null;
                        break;
                    case ConnectionResult.SERVICE_INVALID /* 9 */:
                        fragment = aVar.f7976b;
                        break;
                    case 10:
                        aVar.f7983i = aVar.f7982h;
                        break;
                }
            }
        }
        return fragment;
    }

    @Override // androidx.fragment.app.w.l
    public boolean a(ArrayList arrayList, ArrayList arrayList2) {
        if (w.J0(2)) {
            Log.v("FragmentManager", "Run: " + this);
        }
        arrayList.add(this);
        arrayList2.add(Boolean.FALSE);
        if (!this.f7964i) {
            return true;
        }
        this.f8090t.i(this);
        return true;
    }

    @Override // androidx.fragment.app.E
    public int g() {
        return u(false);
    }

    @Override // androidx.fragment.app.E
    public int h() {
        return u(true);
    }

    @Override // androidx.fragment.app.E
    public void i() {
        k();
        this.f8090t.c0(this, false);
    }

    @Override // androidx.fragment.app.E
    public void j() {
        k();
        this.f8090t.c0(this, true);
    }

    @Override // androidx.fragment.app.E
    void l(int i7, Fragment fragment, String str, int i8) {
        super.l(i7, fragment, str, i8);
        fragment.mFragmentManager = this.f8090t;
    }

    @Override // androidx.fragment.app.E
    public E m(Fragment fragment) {
        w wVar = fragment.mFragmentManager;
        if (wVar == null || wVar == this.f8090t) {
            return super.m(fragment);
        }
        throw new IllegalStateException("Cannot remove Fragment attached to a different FragmentManager. Fragment " + fragment.toString() + " is already attached to a FragmentManager.");
    }

    void t(int i7) {
        if (this.f7964i) {
            if (w.J0(2)) {
                Log.v("FragmentManager", "Bump nesting in " + this + " by " + i7);
            }
            int size = this.f7958c.size();
            for (int i8 = 0; i8 < size; i8++) {
                E.a aVar = (E.a) this.f7958c.get(i8);
                Fragment fragment = aVar.f7976b;
                if (fragment != null) {
                    fragment.mBackStackNesting += i7;
                    if (w.J0(2)) {
                        Log.v("FragmentManager", "Bump nesting of " + aVar.f7976b + " to " + aVar.f7976b.mBackStackNesting);
                    }
                }
            }
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("BackStackEntry{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.f8092v >= 0) {
            sb.append(" #");
            sb.append(this.f8092v);
        }
        if (this.f7966k != null) {
            sb.append(" ");
            sb.append(this.f7966k);
        }
        sb.append("}");
        return sb.toString();
    }

    int u(boolean z6) {
        if (this.f8091u) {
            throw new IllegalStateException("commit already called");
        }
        if (w.J0(2)) {
            Log.v("FragmentManager", "Commit: " + this);
            PrintWriter printWriter = new PrintWriter(new J("FragmentManager"));
            v("  ", printWriter);
            printWriter.close();
        }
        this.f8091u = true;
        this.f8092v = this.f7964i ? this.f8090t.m() : -1;
        this.f8090t.Z(this, z6);
        return this.f8092v;
    }

    public void v(String str, PrintWriter printWriter) {
        w(str, printWriter, true);
    }

    public void w(String str, PrintWriter printWriter, boolean z6) {
        String str2;
        if (z6) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.f7966k);
            printWriter.print(" mIndex=");
            printWriter.print(this.f8092v);
            printWriter.print(" mCommitted=");
            printWriter.println(this.f8091u);
            if (this.f7963h != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.f7963h));
            }
            if (this.f7959d != 0 || this.f7960e != 0) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f7959d));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.f7960e));
            }
            if (this.f7961f != 0 || this.f7962g != 0) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f7961f));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.f7962g));
            }
            if (this.f7967l != 0 || this.f7968m != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.f7967l));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.f7968m);
            }
            if (this.f7969n != 0 || this.f7970o != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.f7969n));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.f7970o);
            }
        }
        if (this.f7958c.isEmpty()) {
            return;
        }
        printWriter.print(str);
        printWriter.println("Operations:");
        int size = this.f7958c.size();
        for (int i7 = 0; i7 < size; i7++) {
            E.a aVar = (E.a) this.f7958c.get(i7);
            switch (aVar.f7975a) {
                case 0:
                    str2 = "NULL";
                    break;
                case 1:
                    str2 = "ADD";
                    break;
                case 2:
                    str2 = "REPLACE";
                    break;
                case 3:
                    str2 = "REMOVE";
                    break;
                case 4:
                    str2 = "HIDE";
                    break;
                case 5:
                    str2 = "SHOW";
                    break;
                case 6:
                    str2 = "DETACH";
                    break;
                case 7:
                    str2 = "ATTACH";
                    break;
                case 8:
                    str2 = "SET_PRIMARY_NAV";
                    break;
                case ConnectionResult.SERVICE_INVALID /* 9 */:
                    str2 = "UNSET_PRIMARY_NAV";
                    break;
                case 10:
                    str2 = "OP_SET_MAX_LIFECYCLE";
                    break;
                default:
                    str2 = "cmd=" + aVar.f7975a;
                    break;
            }
            printWriter.print(str);
            printWriter.print("  Op #");
            printWriter.print(i7);
            printWriter.print(": ");
            printWriter.print(str2);
            printWriter.print(" ");
            printWriter.println(aVar.f7976b);
            if (z6) {
                if (aVar.f7978d != 0 || aVar.f7979e != 0) {
                    printWriter.print(str);
                    printWriter.print("enterAnim=#");
                    printWriter.print(Integer.toHexString(aVar.f7978d));
                    printWriter.print(" exitAnim=#");
                    printWriter.println(Integer.toHexString(aVar.f7979e));
                }
                if (aVar.f7980f != 0 || aVar.f7981g != 0) {
                    printWriter.print(str);
                    printWriter.print("popEnterAnim=#");
                    printWriter.print(Integer.toHexString(aVar.f7980f));
                    printWriter.print(" popExitAnim=#");
                    printWriter.println(Integer.toHexString(aVar.f7981g));
                }
            }
        }
    }

    void x() {
        w wVar;
        int size = this.f7958c.size();
        for (int i7 = 0; i7 < size; i7++) {
            E.a aVar = (E.a) this.f7958c.get(i7);
            Fragment fragment = aVar.f7976b;
            if (fragment != null) {
                fragment.mBeingSaved = this.f8093w;
                fragment.setPopDirection(false);
                fragment.setNextTransition(this.f7963h);
                fragment.setSharedElementNames(this.f7971p, this.f7972q);
            }
            switch (aVar.f7975a) {
                case 1:
                    fragment.setAnimations(aVar.f7978d, aVar.f7979e, aVar.f7980f, aVar.f7981g);
                    this.f8090t.q1(fragment, false);
                    this.f8090t.j(fragment);
                    continue;
                    break;
                case 2:
                default:
                    throw new IllegalArgumentException("Unknown cmd: " + aVar.f7975a);
                case 3:
                    fragment.setAnimations(aVar.f7978d, aVar.f7979e, aVar.f7980f, aVar.f7981g);
                    this.f8090t.i1(fragment);
                    continue;
                    break;
                case 4:
                    fragment.setAnimations(aVar.f7978d, aVar.f7979e, aVar.f7980f, aVar.f7981g);
                    this.f8090t.G0(fragment);
                    continue;
                    break;
                case 5:
                    fragment.setAnimations(aVar.f7978d, aVar.f7979e, aVar.f7980f, aVar.f7981g);
                    this.f8090t.q1(fragment, false);
                    this.f8090t.u1(fragment);
                    continue;
                    break;
                case 6:
                    fragment.setAnimations(aVar.f7978d, aVar.f7979e, aVar.f7980f, aVar.f7981g);
                    this.f8090t.x(fragment);
                    continue;
                    break;
                case 7:
                    fragment.setAnimations(aVar.f7978d, aVar.f7979e, aVar.f7980f, aVar.f7981g);
                    this.f8090t.q1(fragment, false);
                    this.f8090t.o(fragment);
                    continue;
                    break;
                case 8:
                    wVar = this.f8090t;
                    break;
                case ConnectionResult.SERVICE_INVALID /* 9 */:
                    wVar = this.f8090t;
                    fragment = null;
                    break;
                case 10:
                    this.f8090t.r1(fragment, aVar.f7983i);
                    continue;
                    break;
            }
            wVar.s1(fragment);
        }
    }

    void y() {
        w wVar;
        for (int size = this.f7958c.size() - 1; size >= 0; size--) {
            E.a aVar = (E.a) this.f7958c.get(size);
            Fragment fragment = aVar.f7976b;
            if (fragment != null) {
                fragment.mBeingSaved = this.f8093w;
                fragment.setPopDirection(true);
                fragment.setNextTransition(w.n1(this.f7963h));
                fragment.setSharedElementNames(this.f7972q, this.f7971p);
            }
            switch (aVar.f7975a) {
                case 1:
                    fragment.setAnimations(aVar.f7978d, aVar.f7979e, aVar.f7980f, aVar.f7981g);
                    this.f8090t.q1(fragment, true);
                    this.f8090t.i1(fragment);
                    continue;
                    break;
                case 2:
                default:
                    throw new IllegalArgumentException("Unknown cmd: " + aVar.f7975a);
                case 3:
                    fragment.setAnimations(aVar.f7978d, aVar.f7979e, aVar.f7980f, aVar.f7981g);
                    this.f8090t.j(fragment);
                    continue;
                    break;
                case 4:
                    fragment.setAnimations(aVar.f7978d, aVar.f7979e, aVar.f7980f, aVar.f7981g);
                    this.f8090t.u1(fragment);
                    continue;
                    break;
                case 5:
                    fragment.setAnimations(aVar.f7978d, aVar.f7979e, aVar.f7980f, aVar.f7981g);
                    this.f8090t.q1(fragment, true);
                    this.f8090t.G0(fragment);
                    continue;
                    break;
                case 6:
                    fragment.setAnimations(aVar.f7978d, aVar.f7979e, aVar.f7980f, aVar.f7981g);
                    this.f8090t.o(fragment);
                    continue;
                    break;
                case 7:
                    fragment.setAnimations(aVar.f7978d, aVar.f7979e, aVar.f7980f, aVar.f7981g);
                    this.f8090t.q1(fragment, true);
                    this.f8090t.x(fragment);
                    continue;
                    break;
                case 8:
                    wVar = this.f8090t;
                    fragment = null;
                    break;
                case ConnectionResult.SERVICE_INVALID /* 9 */:
                    wVar = this.f8090t;
                    break;
                case 10:
                    this.f8090t.r1(fragment, aVar.f7982h);
                    continue;
                    break;
            }
            wVar.s1(fragment);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00b6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    Fragment z(ArrayList arrayList, Fragment fragment) {
        Fragment fragment2 = fragment;
        int i7 = 0;
        while (i7 < this.f7958c.size()) {
            E.a aVar = (E.a) this.f7958c.get(i7);
            int i8 = aVar.f7975a;
            if (i8 == 1) {
                arrayList.add(aVar.f7976b);
            } else if (i8 == 2) {
                Fragment fragment3 = aVar.f7976b;
                int i9 = fragment3.mContainerId;
                boolean z6 = false;
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    Fragment fragment4 = (Fragment) arrayList.get(size);
                    if (fragment4.mContainerId == i9) {
                        if (fragment4 == fragment3) {
                            z6 = true;
                        } else {
                            if (fragment4 == fragment2) {
                                this.f7958c.add(i7, new E.a(9, fragment4, true));
                                i7++;
                                fragment2 = null;
                            }
                            E.a aVar2 = new E.a(3, fragment4, true);
                            aVar2.f7978d = aVar.f7978d;
                            aVar2.f7980f = aVar.f7980f;
                            aVar2.f7979e = aVar.f7979e;
                            aVar2.f7981g = aVar.f7981g;
                            this.f7958c.add(i7, aVar2);
                            arrayList.remove(fragment4);
                            i7++;
                        }
                    }
                }
                if (z6) {
                    this.f7958c.remove(i7);
                    i7--;
                } else {
                    aVar.f7975a = 1;
                    aVar.f7977c = true;
                    arrayList.add(fragment3);
                }
            } else if (i8 == 3 || i8 == 6) {
                arrayList.remove(aVar.f7976b);
                Fragment fragment5 = aVar.f7976b;
                if (fragment5 == fragment2) {
                    this.f7958c.add(i7, new E.a(9, fragment5));
                    i7++;
                    fragment2 = null;
                }
            } else if (i8 != 7) {
                if (i8 == 8) {
                    this.f7958c.add(i7, new E.a(9, fragment2, true));
                    aVar.f7977c = true;
                    i7++;
                    fragment2 = aVar.f7976b;
                }
            }
            i7++;
        }
        return fragment2;
    }
}
