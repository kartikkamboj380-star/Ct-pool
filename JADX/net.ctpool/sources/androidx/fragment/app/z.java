package androidx.fragment.app;

import android.util.Log;
import androidx.lifecycle.F;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
final class z extends androidx.lifecycle.E {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final F.b f8265k = new a();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f8269g;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final HashMap f8266d = new HashMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final HashMap f8267e = new HashMap();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final HashMap f8268f = new HashMap();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f8270h = false;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f8271i = false;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f8272j = false;

    class a implements F.b {
        a() {
        }

        @Override // androidx.lifecycle.F.b
        public androidx.lifecycle.E a(Class cls) {
            return new z(true);
        }
    }

    z(boolean z6) {
        this.f8269g = z6;
    }

    private void i(String str) {
        z zVar = (z) this.f8267e.get(str);
        if (zVar != null) {
            zVar.d();
            this.f8267e.remove(str);
        }
        androidx.lifecycle.H h7 = (androidx.lifecycle.H) this.f8268f.get(str);
        if (h7 != null) {
            h7.a();
            this.f8268f.remove(str);
        }
    }

    static z l(androidx.lifecycle.H h7) {
        return (z) new androidx.lifecycle.F(h7, f8265k).a(z.class);
    }

    @Override // androidx.lifecycle.E
    protected void d() {
        if (w.J0(3)) {
            Log.d("FragmentManager", "onCleared called for " + this);
        }
        this.f8270h = true;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || z.class != obj.getClass()) {
            return false;
        }
        z zVar = (z) obj;
        return this.f8266d.equals(zVar.f8266d) && this.f8267e.equals(zVar.f8267e) && this.f8268f.equals(zVar.f8268f);
    }

    void f(Fragment fragment) {
        if (this.f8272j) {
            if (w.J0(2)) {
                Log.v("FragmentManager", "Ignoring addRetainedFragment as the state is already saved");
            }
        } else {
            if (this.f8266d.containsKey(fragment.mWho)) {
                return;
            }
            this.f8266d.put(fragment.mWho, fragment);
            if (w.J0(2)) {
                Log.v("FragmentManager", "Updating retained Fragments: Added " + fragment);
            }
        }
    }

    void g(Fragment fragment) {
        if (w.J0(3)) {
            Log.d("FragmentManager", "Clearing non-config state for " + fragment);
        }
        i(fragment.mWho);
    }

    void h(String str) {
        if (w.J0(3)) {
            Log.d("FragmentManager", "Clearing non-config state for saved state of Fragment " + str);
        }
        i(str);
    }

    public int hashCode() {
        return (((this.f8266d.hashCode() * 31) + this.f8267e.hashCode()) * 31) + this.f8268f.hashCode();
    }

    Fragment j(String str) {
        return (Fragment) this.f8266d.get(str);
    }

    z k(Fragment fragment) {
        z zVar = (z) this.f8267e.get(fragment.mWho);
        if (zVar != null) {
            return zVar;
        }
        z zVar2 = new z(this.f8269g);
        this.f8267e.put(fragment.mWho, zVar2);
        return zVar2;
    }

    Collection m() {
        return new ArrayList(this.f8266d.values());
    }

    androidx.lifecycle.H n(Fragment fragment) {
        androidx.lifecycle.H h7 = (androidx.lifecycle.H) this.f8268f.get(fragment.mWho);
        if (h7 != null) {
            return h7;
        }
        androidx.lifecycle.H h8 = new androidx.lifecycle.H();
        this.f8268f.put(fragment.mWho, h8);
        return h8;
    }

    boolean o() {
        return this.f8270h;
    }

    void p(Fragment fragment) {
        if (this.f8272j) {
            if (w.J0(2)) {
                Log.v("FragmentManager", "Ignoring removeRetainedFragment as the state is already saved");
            }
        } else {
            if (this.f8266d.remove(fragment.mWho) == null || !w.J0(2)) {
                return;
            }
            Log.v("FragmentManager", "Updating retained Fragments: Removed " + fragment);
        }
    }

    void q(boolean z6) {
        this.f8272j = z6;
    }

    boolean r(Fragment fragment) {
        if (this.f8266d.containsKey(fragment.mWho)) {
            return this.f8269g ? this.f8270h : !this.f8271i;
        }
        return true;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("FragmentManagerViewModel{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} Fragments (");
        Iterator it = this.f8266d.values().iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") Child Non Config (");
        Iterator it2 = this.f8267e.keySet().iterator();
        while (it2.hasNext()) {
            sb.append((String) it2.next());
            if (it2.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") ViewModelStores (");
        Iterator it3 = this.f8268f.keySet().iterator();
        while (it3.hasNext()) {
            sb.append((String) it3.next());
            if (it3.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(')');
        return sb.toString();
    }
}
