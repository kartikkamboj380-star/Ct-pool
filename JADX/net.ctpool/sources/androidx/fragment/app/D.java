package androidx.fragment.app;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
class D {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ArrayList f7952a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final HashMap f7953b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final HashMap f7954c = new HashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private z f7955d;

    D() {
    }

    void A(z zVar) {
        this.f7955d = zVar;
    }

    B B(String str, B b7) {
        return (B) (b7 != null ? this.f7954c.put(str, b7) : this.f7954c.remove(str));
    }

    void a(Fragment fragment) {
        if (this.f7952a.contains(fragment)) {
            throw new IllegalStateException("Fragment already added: " + fragment);
        }
        synchronized (this.f7952a) {
            this.f7952a.add(fragment);
        }
        fragment.mAdded = true;
    }

    void b() {
        this.f7953b.values().removeAll(Collections.singleton(null));
    }

    boolean c(String str) {
        return this.f7953b.get(str) != null;
    }

    void d(int i7) {
        for (C c7 : this.f7953b.values()) {
            if (c7 != null) {
                c7.t(i7);
            }
        }
    }

    void e(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        String str2 = str + "    ";
        if (!this.f7953b.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Active Fragments:");
            for (C c7 : this.f7953b.values()) {
                printWriter.print(str);
                if (c7 != null) {
                    Fragment fragmentK = c7.k();
                    printWriter.println(fragmentK);
                    fragmentK.dump(str2, fileDescriptor, printWriter, strArr);
                } else {
                    printWriter.println("null");
                }
            }
        }
        int size = this.f7952a.size();
        if (size > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i7 = 0; i7 < size; i7++) {
                Fragment fragment = (Fragment) this.f7952a.get(i7);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i7);
                printWriter.print(": ");
                printWriter.println(fragment.toString());
            }
        }
    }

    Fragment f(String str) {
        C c7 = (C) this.f7953b.get(str);
        if (c7 != null) {
            return c7.k();
        }
        return null;
    }

    Fragment g(int i7) {
        for (int size = this.f7952a.size() - 1; size >= 0; size--) {
            Fragment fragment = (Fragment) this.f7952a.get(size);
            if (fragment != null && fragment.mFragmentId == i7) {
                return fragment;
            }
        }
        for (C c7 : this.f7953b.values()) {
            if (c7 != null) {
                Fragment fragmentK = c7.k();
                if (fragmentK.mFragmentId == i7) {
                    return fragmentK;
                }
            }
        }
        return null;
    }

    Fragment h(String str) {
        if (str != null) {
            for (int size = this.f7952a.size() - 1; size >= 0; size--) {
                Fragment fragment = (Fragment) this.f7952a.get(size);
                if (fragment != null && str.equals(fragment.mTag)) {
                    return fragment;
                }
            }
        }
        if (str == null) {
            return null;
        }
        for (C c7 : this.f7953b.values()) {
            if (c7 != null) {
                Fragment fragmentK = c7.k();
                if (str.equals(fragmentK.mTag)) {
                    return fragmentK;
                }
            }
        }
        return null;
    }

    Fragment i(String str) {
        Fragment fragmentFindFragmentByWho;
        for (C c7 : this.f7953b.values()) {
            if (c7 != null && (fragmentFindFragmentByWho = c7.k().findFragmentByWho(str)) != null) {
                return fragmentFindFragmentByWho;
            }
        }
        return null;
    }

    int j(Fragment fragment) {
        View view;
        View view2;
        ViewGroup viewGroup = fragment.mContainer;
        if (viewGroup == null) {
            return -1;
        }
        int iIndexOf = this.f7952a.indexOf(fragment);
        for (int i7 = iIndexOf - 1; i7 >= 0; i7--) {
            Fragment fragment2 = (Fragment) this.f7952a.get(i7);
            if (fragment2.mContainer == viewGroup && (view2 = fragment2.mView) != null) {
                return viewGroup.indexOfChild(view2) + 1;
            }
        }
        while (true) {
            iIndexOf++;
            if (iIndexOf >= this.f7952a.size()) {
                return -1;
            }
            Fragment fragment3 = (Fragment) this.f7952a.get(iIndexOf);
            if (fragment3.mContainer == viewGroup && (view = fragment3.mView) != null) {
                return viewGroup.indexOfChild(view);
            }
        }
    }

    List k() {
        ArrayList arrayList = new ArrayList();
        for (C c7 : this.f7953b.values()) {
            if (c7 != null) {
                arrayList.add(c7);
            }
        }
        return arrayList;
    }

    List l() {
        ArrayList arrayList = new ArrayList();
        for (C c7 : this.f7953b.values()) {
            arrayList.add(c7 != null ? c7.k() : null);
        }
        return arrayList;
    }

    ArrayList m() {
        return new ArrayList(this.f7954c.values());
    }

    C n(String str) {
        return (C) this.f7953b.get(str);
    }

    List o() {
        ArrayList arrayList;
        if (this.f7952a.isEmpty()) {
            return Collections.emptyList();
        }
        synchronized (this.f7952a) {
            arrayList = new ArrayList(this.f7952a);
        }
        return arrayList;
    }

    z p() {
        return this.f7955d;
    }

    B q(String str) {
        return (B) this.f7954c.get(str);
    }

    void r(C c7) {
        Fragment fragmentK = c7.k();
        if (c(fragmentK.mWho)) {
            return;
        }
        this.f7953b.put(fragmentK.mWho, c7);
        if (fragmentK.mRetainInstanceChangedWhileDetached) {
            if (fragmentK.mRetainInstance) {
                this.f7955d.f(fragmentK);
            } else {
                this.f7955d.p(fragmentK);
            }
            fragmentK.mRetainInstanceChangedWhileDetached = false;
        }
        if (w.J0(2)) {
            Log.v("FragmentManager", "Added fragment to active set " + fragmentK);
        }
    }

    void s(C c7) {
        Fragment fragmentK = c7.k();
        if (fragmentK.mRetainInstance) {
            this.f7955d.p(fragmentK);
        }
        if (((C) this.f7953b.put(fragmentK.mWho, null)) != null && w.J0(2)) {
            Log.v("FragmentManager", "Removed fragment from active set " + fragmentK);
        }
    }

    void t() {
        Iterator it = this.f7952a.iterator();
        while (it.hasNext()) {
            C c7 = (C) this.f7953b.get(((Fragment) it.next()).mWho);
            if (c7 != null) {
                c7.m();
            }
        }
        for (C c8 : this.f7953b.values()) {
            if (c8 != null) {
                c8.m();
                Fragment fragmentK = c8.k();
                if (fragmentK.mRemoving && !fragmentK.isInBackStack()) {
                    if (fragmentK.mBeingSaved && !this.f7954c.containsKey(fragmentK.mWho)) {
                        c8.r();
                    }
                    s(c8);
                }
            }
        }
    }

    void u(Fragment fragment) {
        synchronized (this.f7952a) {
            this.f7952a.remove(fragment);
        }
        fragment.mAdded = false;
    }

    void v() {
        this.f7953b.clear();
    }

    void w(List list) {
        this.f7952a.clear();
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                Fragment fragmentF = f(str);
                if (fragmentF == null) {
                    throw new IllegalStateException("No instantiated fragment for (" + str + ")");
                }
                if (w.J0(2)) {
                    Log.v("FragmentManager", "restoreSaveState: added (" + str + "): " + fragmentF);
                }
                a(fragmentF);
            }
        }
    }

    void x(ArrayList arrayList) {
        this.f7954c.clear();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            B b7 = (B) it.next();
            this.f7954c.put(b7.f7932n, b7);
        }
    }

    ArrayList y() {
        ArrayList arrayList = new ArrayList(this.f7953b.size());
        for (C c7 : this.f7953b.values()) {
            if (c7 != null) {
                Fragment fragmentK = c7.k();
                c7.r();
                arrayList.add(fragmentK.mWho);
                if (w.J0(2)) {
                    Log.v("FragmentManager", "Saved state of " + fragmentK + ": " + fragmentK.mSavedFragmentState);
                }
            }
        }
        return arrayList;
    }

    ArrayList z() {
        synchronized (this.f7952a) {
            try {
                if (this.f7952a.isEmpty()) {
                    return null;
                }
                ArrayList arrayList = new ArrayList(this.f7952a.size());
                for (Fragment fragment : this.f7952a) {
                    arrayList.add(fragment.mWho);
                    if (w.J0(2)) {
                        Log.v("FragmentManager", "saveAllState: adding fragment (" + fragment.mWho + "): " + fragment);
                    }
                }
                return arrayList;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
