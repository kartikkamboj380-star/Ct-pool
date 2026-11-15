package androidx.fragment.app;

import L.c;
import Y.c;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.OnBackPressedDispatcher;
import androidx.activity.result.ActivityResultRegistry;
import androidx.activity.result.e;
import androidx.core.app.C0556h;
import androidx.core.app.U;
import androidx.core.app.V;
import androidx.core.app.X;
import androidx.core.view.InterfaceC0598s;
import androidx.core.view.InterfaceC0601v;
import androidx.fragment.app.E;
import androidx.lifecycle.AbstractC0651h;
import d.AbstractC1600a;
import d.C1601b;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public abstract class w {

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private static boolean f8196S = false;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private androidx.activity.result.c f8200D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private androidx.activity.result.c f8201E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private androidx.activity.result.c f8202F;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private boolean f8204H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private boolean f8205I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private boolean f8206J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private boolean f8207K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    private boolean f8208L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    private ArrayList f8209M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private ArrayList f8210N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private ArrayList f8211O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    private z f8212P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    private c.C0039c f8213Q;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f8216b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    ArrayList f8218d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private ArrayList f8219e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private OnBackPressedDispatcher f8221g;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private ArrayList f8227m;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private o f8236v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private AbstractC0642l f8237w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private Fragment f8238x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    Fragment f8239y;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ArrayList f8215a = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final D f8217c = new D();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final p f8220f = new p(this);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final androidx.activity.h f8222h = new b(false);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final AtomicInteger f8223i = new AtomicInteger();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Map f8224j = Collections.synchronizedMap(new HashMap());

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final Map f8225k = Collections.synchronizedMap(new HashMap());

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final Map f8226l = Collections.synchronizedMap(new HashMap());

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final q f8228n = new q(this);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final CopyOnWriteArrayList f8229o = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final androidx.core.util.a f8230p = new androidx.core.util.a() { // from class: androidx.fragment.app.r
        @Override // androidx.core.util.a
        public final void a(Object obj) {
            this.f8191a.S0((Configuration) obj);
        }
    };

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final androidx.core.util.a f8231q = new androidx.core.util.a() { // from class: androidx.fragment.app.s
        @Override // androidx.core.util.a
        public final void a(Object obj) {
            this.f8192a.T0((Integer) obj);
        }
    };

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final androidx.core.util.a f8232r = new androidx.core.util.a() { // from class: androidx.fragment.app.t
        @Override // androidx.core.util.a
        public final void a(Object obj) {
            this.f8193a.U0((C0556h) obj);
        }
    };

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final androidx.core.util.a f8233s = new androidx.core.util.a() { // from class: androidx.fragment.app.u
        @Override // androidx.core.util.a
        public final void a(Object obj) {
            this.f8194a.V0((X) obj);
        }
    };

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final InterfaceC0601v f8234t = new c();

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    int f8235u = -1;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private n f8240z = null;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private n f8197A = new d();

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private L f8198B = null;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private L f8199C = new e();

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    ArrayDeque f8203G = new ArrayDeque();

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    private Runnable f8214R = new f();

    class a implements androidx.activity.result.b {
        a() {
        }

        @Override // androidx.activity.result.b
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(Map map) {
            StringBuilder sb;
            String[] strArr = (String[]) map.keySet().toArray(new String[0]);
            ArrayList arrayList = new ArrayList(map.values());
            int[] iArr = new int[arrayList.size()];
            for (int i7 = 0; i7 < arrayList.size(); i7++) {
                iArr[i7] = ((Boolean) arrayList.get(i7)).booleanValue() ? 0 : -1;
            }
            k kVar = (k) w.this.f8203G.pollFirst();
            if (kVar == null) {
                sb = new StringBuilder();
                sb.append("No permissions were requested for ");
                sb.append(this);
            } else {
                String str = kVar.f8251m;
                int i8 = kVar.f8252n;
                Fragment fragmentI = w.this.f8217c.i(str);
                if (fragmentI != null) {
                    fragmentI.onRequestPermissionsResult(i8, strArr, iArr);
                    return;
                } else {
                    sb = new StringBuilder();
                    sb.append("Permission request result delivered for unknown Fragment ");
                    sb.append(str);
                }
            }
            Log.w("FragmentManager", sb.toString());
        }
    }

    class b extends androidx.activity.h {
        b(boolean z6) {
            super(z6);
        }

        @Override // androidx.activity.h
        public void b() {
            w.this.F0();
        }
    }

    class c implements InterfaceC0601v {
        c() {
        }

        @Override // androidx.core.view.InterfaceC0601v
        public boolean a(MenuItem menuItem) {
            return w.this.K(menuItem);
        }

        @Override // androidx.core.view.InterfaceC0601v
        public void b(Menu menu) {
            w.this.L(menu);
        }

        @Override // androidx.core.view.InterfaceC0601v
        public void c(Menu menu, MenuInflater menuInflater) {
            w.this.D(menu, menuInflater);
        }

        @Override // androidx.core.view.InterfaceC0601v
        public void d(Menu menu) {
            w.this.P(menu);
        }
    }

    class d extends n {
        d() {
        }

        @Override // androidx.fragment.app.n
        public Fragment a(ClassLoader classLoader, String str) {
            return w.this.w0().c(w.this.w0().n(), str, null);
        }
    }

    class e implements L {
        e() {
        }

        @Override // androidx.fragment.app.L
        public K a(ViewGroup viewGroup) {
            return new C0634d(viewGroup);
        }
    }

    class f implements Runnable {
        f() {
        }

        @Override // java.lang.Runnable
        public void run() {
            w.this.b0(true);
        }
    }

    class g implements A {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        final /* synthetic */ Fragment f8247m;

        g(Fragment fragment) {
            this.f8247m = fragment;
        }

        @Override // androidx.fragment.app.A
        public void a(w wVar, Fragment fragment) {
            this.f8247m.onAttachFragment(fragment);
        }
    }

    class h implements androidx.activity.result.b {
        h() {
        }

        @Override // androidx.activity.result.b
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(androidx.activity.result.a aVar) {
            k kVar = (k) w.this.f8203G.pollFirst();
            if (kVar == null) {
                Log.w("FragmentManager", "No Activities were started for result for " + this);
                return;
            }
            String str = kVar.f8251m;
            int i7 = kVar.f8252n;
            Fragment fragmentI = w.this.f8217c.i(str);
            if (fragmentI != null) {
                fragmentI.onActivityResult(i7, aVar.b(), aVar.a());
                return;
            }
            Log.w("FragmentManager", "Activity result delivered for unknown Fragment " + str);
        }
    }

    class i implements androidx.activity.result.b {
        i() {
        }

        @Override // androidx.activity.result.b
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(androidx.activity.result.a aVar) {
            k kVar = (k) w.this.f8203G.pollFirst();
            if (kVar == null) {
                Log.w("FragmentManager", "No IntentSenders were started for " + this);
                return;
            }
            String str = kVar.f8251m;
            int i7 = kVar.f8252n;
            Fragment fragmentI = w.this.f8217c.i(str);
            if (fragmentI != null) {
                fragmentI.onActivityResult(i7, aVar.b(), aVar.a());
                return;
            }
            Log.w("FragmentManager", "Intent Sender result delivered for unknown Fragment " + str);
        }
    }

    static class j extends AbstractC1600a {
        j() {
        }

        @Override // d.AbstractC1600a
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public Intent a(Context context, androidx.activity.result.e eVar) {
            Bundle bundleExtra;
            Intent intent = new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST");
            Intent intentA = eVar.a();
            if (intentA != null && (bundleExtra = intentA.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) != null) {
                intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundleExtra);
                intentA.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                if (intentA.getBooleanExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", false)) {
                    eVar = new e.b(eVar.d()).b(null).c(eVar.c(), eVar.b()).a();
                }
            }
            intent.putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", eVar);
            if (w.J0(2)) {
                Log.v("FragmentManager", "CreateIntent created the following intent: " + intent);
            }
            return intent;
        }

        @Override // d.AbstractC1600a
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public androidx.activity.result.a c(int i7, Intent intent) {
            return new androidx.activity.result.a(i7, intent);
        }
    }

    static class k implements Parcelable {
        public static final Parcelable.Creator<k> CREATOR = new a();

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        String f8251m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f8252n;

        class a implements Parcelable.Creator {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public k createFromParcel(Parcel parcel) {
                return new k(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public k[] newArray(int i7) {
                return new k[i7];
            }
        }

        k(Parcel parcel) {
            this.f8251m = parcel.readString();
            this.f8252n = parcel.readInt();
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i7) {
            parcel.writeString(this.f8251m);
            parcel.writeInt(this.f8252n);
        }

        k(String str, int i7) {
            this.f8251m = str;
            this.f8252n = i7;
        }
    }

    interface l {
        boolean a(ArrayList arrayList, ArrayList arrayList2);
    }

    private class m implements l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final String f8253a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final int f8254b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final int f8255c;

        m(String str, int i7, int i8) {
            this.f8253a = str;
            this.f8254b = i7;
            this.f8255c = i8;
        }

        @Override // androidx.fragment.app.w.l
        public boolean a(ArrayList arrayList, ArrayList arrayList2) {
            Fragment fragment = w.this.f8239y;
            if (fragment == null || this.f8254b >= 0 || this.f8253a != null || !fragment.getChildFragmentManager().e1()) {
                return w.this.h1(arrayList, arrayList2, this.f8253a, this.f8254b, this.f8255c);
            }
            return false;
        }
    }

    static Fragment D0(View view) {
        Object tag = view.getTag(K.b.f1831a);
        if (tag instanceof Fragment) {
            return (Fragment) tag;
        }
        return null;
    }

    public static boolean J0(int i7) {
        return f8196S || Log.isLoggable("FragmentManager", i7);
    }

    private boolean K0(Fragment fragment) {
        return (fragment.mHasMenu && fragment.mMenuVisible) || fragment.mChildFragmentManager.q();
    }

    private boolean L0() {
        Fragment fragment = this.f8238x;
        if (fragment == null) {
            return true;
        }
        return fragment.isAdded() && this.f8238x.getParentFragmentManager().L0();
    }

    private void M(Fragment fragment) {
        if (fragment == null || !fragment.equals(g0(fragment.mWho))) {
            return;
        }
        fragment.performPrimaryNavigationFragmentChanged();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void S0(Configuration configuration) {
        if (L0()) {
            A(configuration, false);
        }
    }

    private void T(int i7) {
        try {
            this.f8216b = true;
            this.f8217c.d(i7);
            Z0(i7, false);
            Iterator it = u().iterator();
            while (it.hasNext()) {
                ((K) it.next()).j();
            }
            this.f8216b = false;
            b0(true);
        } catch (Throwable th) {
            this.f8216b = false;
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void T0(Integer num) {
        if (L0() && num.intValue() == 80) {
            G(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void U0(C0556h c0556h) {
        if (L0()) {
            H(c0556h.a(), false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void V0(X x6) {
        if (L0()) {
            O(x6.a(), false);
        }
    }

    private void W() {
        if (this.f8208L) {
            this.f8208L = false;
            v1();
        }
    }

    private void Y() {
        Iterator it = u().iterator();
        while (it.hasNext()) {
            ((K) it.next()).j();
        }
    }

    private void a0(boolean z6) {
        if (this.f8216b) {
            throw new IllegalStateException("FragmentManager is already executing transactions");
        }
        if (this.f8236v == null) {
            if (!this.f8207K) {
                throw new IllegalStateException("FragmentManager has not been attached to a host.");
            }
            throw new IllegalStateException("FragmentManager has been destroyed");
        }
        if (Looper.myLooper() != this.f8236v.p().getLooper()) {
            throw new IllegalStateException("Must be called from main thread of fragment host");
        }
        if (!z6) {
            r();
        }
        if (this.f8209M == null) {
            this.f8209M = new ArrayList();
            this.f8210N = new ArrayList();
        }
    }

    private static void d0(ArrayList arrayList, ArrayList arrayList2, int i7, int i8) {
        while (i7 < i8) {
            C0631a c0631a = (C0631a) arrayList.get(i7);
            if (((Boolean) arrayList2.get(i7)).booleanValue()) {
                c0631a.t(-1);
                c0631a.y();
            } else {
                c0631a.t(1);
                c0631a.x();
            }
            i7++;
        }
    }

    private void e0(ArrayList arrayList, ArrayList arrayList2, int i7, int i8) {
        boolean z6 = ((C0631a) arrayList.get(i7)).f7973r;
        ArrayList arrayList3 = this.f8211O;
        if (arrayList3 == null) {
            this.f8211O = new ArrayList();
        } else {
            arrayList3.clear();
        }
        this.f8211O.addAll(this.f8217c.o());
        Fragment fragmentA0 = A0();
        boolean z7 = false;
        for (int i9 = i7; i9 < i8; i9++) {
            C0631a c0631a = (C0631a) arrayList.get(i9);
            fragmentA0 = !((Boolean) arrayList2.get(i9)).booleanValue() ? c0631a.z(this.f8211O, fragmentA0) : c0631a.C(this.f8211O, fragmentA0);
            z7 = z7 || c0631a.f7964i;
        }
        this.f8211O.clear();
        if (!z6 && this.f8235u >= 1) {
            for (int i10 = i7; i10 < i8; i10++) {
                Iterator it = ((C0631a) arrayList.get(i10)).f7958c.iterator();
                while (it.hasNext()) {
                    Fragment fragment = ((E.a) it.next()).f7976b;
                    if (fragment != null && fragment.mFragmentManager != null) {
                        this.f8217c.r(w(fragment));
                    }
                }
            }
        }
        d0(arrayList, arrayList2, i7, i8);
        boolean zBooleanValue = ((Boolean) arrayList2.get(i8 - 1)).booleanValue();
        for (int i11 = i7; i11 < i8; i11++) {
            C0631a c0631a2 = (C0631a) arrayList.get(i11);
            if (zBooleanValue) {
                for (int size = c0631a2.f7958c.size() - 1; size >= 0; size--) {
                    Fragment fragment2 = ((E.a) c0631a2.f7958c.get(size)).f7976b;
                    if (fragment2 != null) {
                        w(fragment2).m();
                    }
                }
            } else {
                Iterator it2 = c0631a2.f7958c.iterator();
                while (it2.hasNext()) {
                    Fragment fragment3 = ((E.a) it2.next()).f7976b;
                    if (fragment3 != null) {
                        w(fragment3).m();
                    }
                }
            }
        }
        Z0(this.f8235u, true);
        for (K k7 : v(arrayList, i7, i8)) {
            k7.r(zBooleanValue);
            k7.p();
            k7.g();
        }
        while (i7 < i8) {
            C0631a c0631a3 = (C0631a) arrayList.get(i7);
            if (((Boolean) arrayList2.get(i7)).booleanValue() && c0631a3.f8092v >= 0) {
                c0631a3.f8092v = -1;
            }
            c0631a3.B();
            i7++;
        }
        if (z7) {
            l1();
        }
    }

    private boolean g1(String str, int i7, int i8) {
        b0(false);
        a0(true);
        Fragment fragment = this.f8239y;
        if (fragment != null && i7 < 0 && str == null && fragment.getChildFragmentManager().e1()) {
            return true;
        }
        boolean zH1 = h1(this.f8209M, this.f8210N, str, i7, i8);
        if (zH1) {
            this.f8216b = true;
            try {
                j1(this.f8209M, this.f8210N);
            } finally {
                s();
            }
        }
        x1();
        W();
        this.f8217c.b();
        return zH1;
    }

    private int h0(String str, int i7, boolean z6) {
        ArrayList arrayList = this.f8218d;
        if (arrayList == null || arrayList.isEmpty()) {
            return -1;
        }
        if (str == null && i7 < 0) {
            if (z6) {
                return 0;
            }
            return this.f8218d.size() - 1;
        }
        int size = this.f8218d.size() - 1;
        while (size >= 0) {
            C0631a c0631a = (C0631a) this.f8218d.get(size);
            if ((str != null && str.equals(c0631a.A())) || (i7 >= 0 && i7 == c0631a.f8092v)) {
                break;
            }
            size--;
        }
        if (size < 0) {
            return size;
        }
        if (!z6) {
            if (size == this.f8218d.size() - 1) {
                return -1;
            }
            return size + 1;
        }
        while (size > 0) {
            C0631a c0631a2 = (C0631a) this.f8218d.get(size - 1);
            if ((str == null || !str.equals(c0631a2.A())) && (i7 < 0 || i7 != c0631a2.f8092v)) {
                return size;
            }
            size--;
        }
        return size;
    }

    public static Fragment i0(View view) {
        Fragment fragmentN0 = n0(view);
        if (fragmentN0 != null) {
            return fragmentN0;
        }
        throw new IllegalStateException("View " + view + " does not have a Fragment set");
    }

    private void j1(ArrayList arrayList, ArrayList arrayList2) {
        if (arrayList.isEmpty()) {
            return;
        }
        if (arrayList.size() != arrayList2.size()) {
            throw new IllegalStateException("Internal error with the back stack records");
        }
        int size = arrayList.size();
        int i7 = 0;
        int i8 = 0;
        while (i7 < size) {
            if (!((C0631a) arrayList.get(i7)).f7973r) {
                if (i8 != i7) {
                    e0(arrayList, arrayList2, i8, i7);
                }
                i8 = i7 + 1;
                if (((Boolean) arrayList2.get(i7)).booleanValue()) {
                    while (i8 < size && ((Boolean) arrayList2.get(i8)).booleanValue() && !((C0631a) arrayList.get(i8)).f7973r) {
                        i8++;
                    }
                }
                e0(arrayList, arrayList2, i7, i8);
                i7 = i8 - 1;
            }
            i7++;
        }
        if (i8 != size) {
            e0(arrayList, arrayList2, i8, size);
        }
    }

    private void l1() {
        ArrayList arrayList = this.f8227m;
        if (arrayList == null || arrayList.size() <= 0) {
            return;
        }
        androidx.appcompat.app.y.a(this.f8227m.get(0));
        throw null;
    }

    static w m0(View view) {
        AbstractActivityC0640j abstractActivityC0640j;
        Fragment fragmentN0 = n0(view);
        if (fragmentN0 != null) {
            if (fragmentN0.isAdded()) {
                return fragmentN0.getChildFragmentManager();
            }
            throw new IllegalStateException("The Fragment " + fragmentN0 + " that owns View " + view + " has already been destroyed. Nested fragments should always use the child FragmentManager.");
        }
        Context context = view.getContext();
        while (true) {
            if (!(context instanceof ContextWrapper)) {
                abstractActivityC0640j = null;
                break;
            }
            if (context instanceof AbstractActivityC0640j) {
                abstractActivityC0640j = (AbstractActivityC0640j) context;
                break;
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
        if (abstractActivityC0640j != null) {
            return abstractActivityC0640j.O();
        }
        throw new IllegalStateException("View " + view + " is not within a subclass of FragmentActivity.");
    }

    private static Fragment n0(View view) {
        while (view != null) {
            Fragment fragmentD0 = D0(view);
            if (fragmentD0 != null) {
                return fragmentD0;
            }
            Object parent = view.getParent();
            view = parent instanceof View ? (View) parent : null;
        }
        return null;
    }

    static int n1(int i7) {
        int i8 = 4097;
        if (i7 == 4097) {
            return 8194;
        }
        if (i7 != 8194) {
            i8 = 8197;
            if (i7 == 8197) {
                return 4100;
            }
            if (i7 == 4099) {
                return 4099;
            }
            if (i7 != 4100) {
                return 0;
            }
        }
        return i8;
    }

    private void o0() {
        Iterator it = u().iterator();
        while (it.hasNext()) {
            ((K) it.next()).k();
        }
    }

    private boolean p0(ArrayList arrayList, ArrayList arrayList2) {
        synchronized (this.f8215a) {
            if (this.f8215a.isEmpty()) {
                return false;
            }
            try {
                int size = this.f8215a.size();
                boolean zA = false;
                for (int i7 = 0; i7 < size; i7++) {
                    zA |= ((l) this.f8215a.get(i7)).a(arrayList, arrayList2);
                }
                return zA;
            } finally {
                this.f8215a.clear();
                this.f8236v.p().removeCallbacks(this.f8214R);
            }
        }
    }

    private void r() {
        if (Q0()) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
    }

    private z r0(Fragment fragment) {
        return this.f8212P.k(fragment);
    }

    private void s() {
        this.f8216b = false;
        this.f8210N.clear();
        this.f8209M.clear();
    }

    private void t() {
        o oVar = this.f8236v;
        if (oVar instanceof androidx.lifecycle.I ? this.f8217c.p().o() : oVar.n() instanceof Activity ? !((Activity) this.f8236v.n()).isChangingConfigurations() : true) {
            Iterator it = this.f8224j.values().iterator();
            while (it.hasNext()) {
                Iterator it2 = ((C0633c) it.next()).f8108m.iterator();
                while (it2.hasNext()) {
                    this.f8217c.p().h((String) it2.next());
                }
            }
        }
    }

    private ViewGroup t0(Fragment fragment) {
        ViewGroup viewGroup = fragment.mContainer;
        if (viewGroup != null) {
            return viewGroup;
        }
        if (fragment.mContainerId > 0 && this.f8237w.g()) {
            View viewF = this.f8237w.f(fragment.mContainerId);
            if (viewF instanceof ViewGroup) {
                return (ViewGroup) viewF;
            }
        }
        return null;
    }

    private void t1(Fragment fragment) {
        ViewGroup viewGroupT0 = t0(fragment);
        if (viewGroupT0 == null || fragment.getEnterAnim() + fragment.getExitAnim() + fragment.getPopEnterAnim() + fragment.getPopExitAnim() <= 0) {
            return;
        }
        if (viewGroupT0.getTag(K.b.f1833c) == null) {
            viewGroupT0.setTag(K.b.f1833c, fragment);
        }
        ((Fragment) viewGroupT0.getTag(K.b.f1833c)).setPopDirection(fragment.getPopDirection());
    }

    private Set u() {
        HashSet hashSet = new HashSet();
        Iterator it = this.f8217c.k().iterator();
        while (it.hasNext()) {
            ViewGroup viewGroup = ((C) it.next()).k().mContainer;
            if (viewGroup != null) {
                hashSet.add(K.o(viewGroup, B0()));
            }
        }
        return hashSet;
    }

    private Set v(ArrayList arrayList, int i7, int i8) {
        ViewGroup viewGroup;
        HashSet hashSet = new HashSet();
        while (i7 < i8) {
            Iterator it = ((C0631a) arrayList.get(i7)).f7958c.iterator();
            while (it.hasNext()) {
                Fragment fragment = ((E.a) it.next()).f7976b;
                if (fragment != null && (viewGroup = fragment.mContainer) != null) {
                    hashSet.add(K.n(viewGroup, this));
                }
            }
            i7++;
        }
        return hashSet;
    }

    private void v1() {
        Iterator it = this.f8217c.k().iterator();
        while (it.hasNext()) {
            c1((C) it.next());
        }
    }

    private void w1(RuntimeException runtimeException) {
        Log.e("FragmentManager", runtimeException.getMessage());
        Log.e("FragmentManager", "Activity state:");
        PrintWriter printWriter = new PrintWriter(new J("FragmentManager"));
        o oVar = this.f8236v;
        try {
            if (oVar != null) {
                oVar.q("  ", null, printWriter, new String[0]);
            } else {
                X("  ", null, printWriter, new String[0]);
            }
            throw runtimeException;
        } catch (Exception e7) {
            Log.e("FragmentManager", "Failed dumping state", e7);
            throw runtimeException;
        }
    }

    private void x1() {
        synchronized (this.f8215a) {
            try {
                if (this.f8215a.isEmpty()) {
                    this.f8222h.f(q0() > 0 && O0(this.f8238x));
                } else {
                    this.f8222h.f(true);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    void A(Configuration configuration, boolean z6) {
        if (z6 && (this.f8236v instanceof androidx.core.content.d)) {
            w1(new IllegalStateException("Do not call dispatchConfigurationChanged() on host. Host implements OnConfigurationChangedProvider and automatically dispatches configuration changes to fragments."));
        }
        for (Fragment fragment : this.f8217c.o()) {
            if (fragment != null) {
                fragment.performConfigurationChanged(configuration);
                if (z6) {
                    fragment.mChildFragmentManager.A(configuration, true);
                }
            }
        }
    }

    public Fragment A0() {
        return this.f8239y;
    }

    boolean B(MenuItem menuItem) {
        if (this.f8235u < 1) {
            return false;
        }
        for (Fragment fragment : this.f8217c.o()) {
            if (fragment != null && fragment.performContextItemSelected(menuItem)) {
                return true;
            }
        }
        return false;
    }

    L B0() {
        L l7 = this.f8198B;
        if (l7 != null) {
            return l7;
        }
        Fragment fragment = this.f8238x;
        return fragment != null ? fragment.mFragmentManager.B0() : this.f8199C;
    }

    void C() {
        this.f8205I = false;
        this.f8206J = false;
        this.f8212P.q(false);
        T(1);
    }

    public c.C0039c C0() {
        return this.f8213Q;
    }

    boolean D(Menu menu, MenuInflater menuInflater) {
        if (this.f8235u < 1) {
            return false;
        }
        ArrayList arrayList = null;
        boolean z6 = false;
        for (Fragment fragment : this.f8217c.o()) {
            if (fragment != null && N0(fragment) && fragment.performCreateOptionsMenu(menu, menuInflater)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(fragment);
                z6 = true;
            }
        }
        if (this.f8219e != null) {
            for (int i7 = 0; i7 < this.f8219e.size(); i7++) {
                Fragment fragment2 = (Fragment) this.f8219e.get(i7);
                if (arrayList == null || !arrayList.contains(fragment2)) {
                    fragment2.onDestroyOptionsMenu();
                }
            }
        }
        this.f8219e = arrayList;
        return z6;
    }

    void E() {
        this.f8207K = true;
        b0(true);
        Y();
        t();
        T(-1);
        Object obj = this.f8236v;
        if (obj instanceof androidx.core.content.e) {
            ((androidx.core.content.e) obj).i(this.f8231q);
        }
        Object obj2 = this.f8236v;
        if (obj2 instanceof androidx.core.content.d) {
            ((androidx.core.content.d) obj2).o(this.f8230p);
        }
        Object obj3 = this.f8236v;
        if (obj3 instanceof U) {
            ((U) obj3).t(this.f8232r);
        }
        Object obj4 = this.f8236v;
        if (obj4 instanceof V) {
            ((V) obj4).h(this.f8233s);
        }
        Object obj5 = this.f8236v;
        if ((obj5 instanceof InterfaceC0598s) && this.f8238x == null) {
            ((InterfaceC0598s) obj5).d(this.f8234t);
        }
        this.f8236v = null;
        this.f8237w = null;
        this.f8238x = null;
        if (this.f8221g != null) {
            this.f8222h.d();
            this.f8221g = null;
        }
        androidx.activity.result.c cVar = this.f8200D;
        if (cVar != null) {
            cVar.c();
            this.f8201E.c();
            this.f8202F.c();
        }
    }

    androidx.lifecycle.H E0(Fragment fragment) {
        return this.f8212P.n(fragment);
    }

    void F() {
        T(1);
    }

    void F0() {
        b0(true);
        if (this.f8222h.c()) {
            e1();
        } else {
            this.f8221g.f();
        }
    }

    void G(boolean z6) {
        if (z6 && (this.f8236v instanceof androidx.core.content.e)) {
            w1(new IllegalStateException("Do not call dispatchLowMemory() on host. Host implements OnTrimMemoryProvider and automatically dispatches low memory callbacks to fragments."));
        }
        for (Fragment fragment : this.f8217c.o()) {
            if (fragment != null) {
                fragment.performLowMemory();
                if (z6) {
                    fragment.mChildFragmentManager.G(true);
                }
            }
        }
    }

    void G0(Fragment fragment) {
        if (J0(2)) {
            Log.v("FragmentManager", "hide: " + fragment);
        }
        if (fragment.mHidden) {
            return;
        }
        fragment.mHidden = true;
        fragment.mHiddenChanged = true ^ fragment.mHiddenChanged;
        t1(fragment);
    }

    void H(boolean z6, boolean z7) {
        if (z7 && (this.f8236v instanceof U)) {
            w1(new IllegalStateException("Do not call dispatchMultiWindowModeChanged() on host. Host implements OnMultiWindowModeChangedProvider and automatically dispatches multi-window mode changes to fragments."));
        }
        for (Fragment fragment : this.f8217c.o()) {
            if (fragment != null) {
                fragment.performMultiWindowModeChanged(z6);
                if (z7) {
                    fragment.mChildFragmentManager.H(z6, true);
                }
            }
        }
    }

    void H0(Fragment fragment) {
        if (fragment.mAdded && K0(fragment)) {
            this.f8204H = true;
        }
    }

    void I(Fragment fragment) {
        Iterator it = this.f8229o.iterator();
        while (it.hasNext()) {
            ((A) it.next()).a(this, fragment);
        }
    }

    public boolean I0() {
        return this.f8207K;
    }

    void J() {
        for (Fragment fragment : this.f8217c.l()) {
            if (fragment != null) {
                fragment.onHiddenChanged(fragment.isHidden());
                fragment.mChildFragmentManager.J();
            }
        }
    }

    boolean K(MenuItem menuItem) {
        if (this.f8235u < 1) {
            return false;
        }
        for (Fragment fragment : this.f8217c.o()) {
            if (fragment != null && fragment.performOptionsItemSelected(menuItem)) {
                return true;
            }
        }
        return false;
    }

    void L(Menu menu) {
        if (this.f8235u < 1) {
            return;
        }
        for (Fragment fragment : this.f8217c.o()) {
            if (fragment != null) {
                fragment.performOptionsMenuClosed(menu);
            }
        }
    }

    boolean M0(Fragment fragment) {
        if (fragment == null) {
            return false;
        }
        return fragment.isHidden();
    }

    void N() {
        T(5);
    }

    boolean N0(Fragment fragment) {
        if (fragment == null) {
            return true;
        }
        return fragment.isMenuVisible();
    }

    void O(boolean z6, boolean z7) {
        if (z7 && (this.f8236v instanceof V)) {
            w1(new IllegalStateException("Do not call dispatchPictureInPictureModeChanged() on host. Host implements OnPictureInPictureModeChangedProvider and automatically dispatches picture-in-picture mode changes to fragments."));
        }
        for (Fragment fragment : this.f8217c.o()) {
            if (fragment != null) {
                fragment.performPictureInPictureModeChanged(z6);
                if (z7) {
                    fragment.mChildFragmentManager.O(z6, true);
                }
            }
        }
    }

    boolean O0(Fragment fragment) {
        if (fragment == null) {
            return true;
        }
        w wVar = fragment.mFragmentManager;
        return fragment.equals(wVar.A0()) && O0(wVar.f8238x);
    }

    boolean P(Menu menu) {
        boolean z6 = false;
        if (this.f8235u < 1) {
            return false;
        }
        for (Fragment fragment : this.f8217c.o()) {
            if (fragment != null && N0(fragment) && fragment.performPrepareOptionsMenu(menu)) {
                z6 = true;
            }
        }
        return z6;
    }

    boolean P0(int i7) {
        return this.f8235u >= i7;
    }

    void Q() {
        x1();
        M(this.f8239y);
    }

    public boolean Q0() {
        return this.f8205I || this.f8206J;
    }

    void R() {
        this.f8205I = false;
        this.f8206J = false;
        this.f8212P.q(false);
        T(7);
    }

    void S() {
        this.f8205I = false;
        this.f8206J = false;
        this.f8212P.q(false);
        T(5);
    }

    void U() {
        this.f8206J = true;
        this.f8212P.q(true);
        T(4);
    }

    void V() {
        T(2);
    }

    void W0(Fragment fragment, String[] strArr, int i7) {
        if (this.f8202F == null) {
            this.f8236v.w(fragment, strArr, i7);
            return;
        }
        this.f8203G.addLast(new k(fragment.mWho, i7));
        this.f8202F.a(strArr);
    }

    public void X(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int size;
        int size2;
        String str2 = str + "    ";
        this.f8217c.e(str, fileDescriptor, printWriter, strArr);
        ArrayList arrayList = this.f8219e;
        if (arrayList != null && (size2 = arrayList.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i7 = 0; i7 < size2; i7++) {
                Fragment fragment = (Fragment) this.f8219e.get(i7);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i7);
                printWriter.print(": ");
                printWriter.println(fragment.toString());
            }
        }
        ArrayList arrayList2 = this.f8218d;
        if (arrayList2 != null && (size = arrayList2.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i8 = 0; i8 < size; i8++) {
                C0631a c0631a = (C0631a) this.f8218d.get(i8);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i8);
                printWriter.print(": ");
                printWriter.println(c0631a.toString());
                c0631a.v(str2, printWriter);
            }
        }
        printWriter.print(str);
        printWriter.println("Back Stack Index: " + this.f8223i.get());
        synchronized (this.f8215a) {
            try {
                int size3 = this.f8215a.size();
                if (size3 > 0) {
                    printWriter.print(str);
                    printWriter.println("Pending Actions:");
                    for (int i9 = 0; i9 < size3; i9++) {
                        l lVar = (l) this.f8215a.get(i9);
                        printWriter.print(str);
                        printWriter.print("  #");
                        printWriter.print(i9);
                        printWriter.print(": ");
                        printWriter.println(lVar);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        printWriter.print(str);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(str);
        printWriter.print("  mHost=");
        printWriter.println(this.f8236v);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.f8237w);
        if (this.f8238x != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.f8238x);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.f8235u);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.f8205I);
        printWriter.print(" mStopped=");
        printWriter.print(this.f8206J);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.f8207K);
        if (this.f8204H) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.f8204H);
        }
    }

    void X0(Fragment fragment, Intent intent, int i7, Bundle bundle) {
        if (this.f8200D == null) {
            this.f8236v.y(fragment, intent, i7, bundle);
            return;
        }
        this.f8203G.addLast(new k(fragment.mWho, i7));
        if (intent != null && bundle != null) {
            intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundle);
        }
        this.f8200D.a(intent);
    }

    void Y0(Fragment fragment, IntentSender intentSender, int i7, Intent intent, int i8, int i9, int i10, Bundle bundle) {
        Intent intent2;
        if (this.f8201E == null) {
            this.f8236v.z(fragment, intentSender, i7, intent, i8, i9, i10, bundle);
            return;
        }
        if (bundle != null) {
            if (intent == null) {
                intent2 = new Intent();
                intent2.putExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", true);
            } else {
                intent2 = intent;
            }
            if (J0(2)) {
                Log.v("FragmentManager", "ActivityOptions " + bundle + " were added to fillInIntent " + intent2 + " for fragment " + fragment);
            }
            intent2.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundle);
        } else {
            intent2 = intent;
        }
        androidx.activity.result.e eVarA = new e.b(intentSender).b(intent2).c(i9, i8).a();
        this.f8203G.addLast(new k(fragment.mWho, i7));
        if (J0(2)) {
            Log.v("FragmentManager", "Fragment " + fragment + "is launching an IntentSender for result ");
        }
        this.f8201E.a(eVarA);
    }

    void Z(l lVar, boolean z6) {
        if (!z6) {
            if (this.f8236v == null) {
                if (!this.f8207K) {
                    throw new IllegalStateException("FragmentManager has not been attached to a host.");
                }
                throw new IllegalStateException("FragmentManager has been destroyed");
            }
            r();
        }
        synchronized (this.f8215a) {
            try {
                if (this.f8236v == null) {
                    if (!z6) {
                        throw new IllegalStateException("Activity has been destroyed");
                    }
                } else {
                    this.f8215a.add(lVar);
                    p1();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    void Z0(int i7, boolean z6) {
        o oVar;
        if (this.f8236v == null && i7 != -1) {
            throw new IllegalStateException("No activity");
        }
        if (z6 || i7 != this.f8235u) {
            this.f8235u = i7;
            this.f8217c.t();
            v1();
            if (this.f8204H && (oVar = this.f8236v) != null && this.f8235u == 7) {
                oVar.A();
                this.f8204H = false;
            }
        }
    }

    void a1() {
        if (this.f8236v == null) {
            return;
        }
        this.f8205I = false;
        this.f8206J = false;
        this.f8212P.q(false);
        for (Fragment fragment : this.f8217c.o()) {
            if (fragment != null) {
                fragment.noteStateNotSaved();
            }
        }
    }

    boolean b0(boolean z6) {
        a0(z6);
        boolean z7 = false;
        while (p0(this.f8209M, this.f8210N)) {
            z7 = true;
            this.f8216b = true;
            try {
                j1(this.f8209M, this.f8210N);
            } finally {
                s();
            }
        }
        x1();
        W();
        this.f8217c.b();
        return z7;
    }

    void b1(FragmentContainerView fragmentContainerView) {
        View view;
        for (C c7 : this.f8217c.k()) {
            Fragment fragmentK = c7.k();
            if (fragmentK.mContainerId == fragmentContainerView.getId() && (view = fragmentK.mView) != null && view.getParent() == null) {
                fragmentK.mContainer = fragmentContainerView;
                c7.b();
            }
        }
    }

    void c0(l lVar, boolean z6) {
        if (z6 && (this.f8236v == null || this.f8207K)) {
            return;
        }
        a0(z6);
        if (lVar.a(this.f8209M, this.f8210N)) {
            this.f8216b = true;
            try {
                j1(this.f8209M, this.f8210N);
            } finally {
                s();
            }
        }
        x1();
        W();
        this.f8217c.b();
    }

    void c1(C c7) {
        Fragment fragmentK = c7.k();
        if (fragmentK.mDeferStart) {
            if (this.f8216b) {
                this.f8208L = true;
            } else {
                fragmentK.mDeferStart = false;
                c7.m();
            }
        }
    }

    void d1(int i7, int i8, boolean z6) {
        if (i7 >= 0) {
            Z(new m(null, i7, i8), z6);
            return;
        }
        throw new IllegalArgumentException("Bad id: " + i7);
    }

    public boolean e1() {
        return g1(null, -1, 0);
    }

    public boolean f0() {
        boolean zB0 = b0(true);
        o0();
        return zB0;
    }

    public boolean f1(int i7, int i8) {
        if (i7 >= 0) {
            return g1(null, i7, i8);
        }
        throw new IllegalArgumentException("Bad id: " + i7);
    }

    Fragment g0(String str) {
        return this.f8217c.f(str);
    }

    boolean h1(ArrayList arrayList, ArrayList arrayList2, String str, int i7, int i8) {
        int iH0 = h0(str, i7, (i8 & 1) != 0);
        if (iH0 < 0) {
            return false;
        }
        for (int size = this.f8218d.size() - 1; size >= iH0; size--) {
            arrayList.add((C0631a) this.f8218d.remove(size));
            arrayList2.add(Boolean.TRUE);
        }
        return true;
    }

    void i(C0631a c0631a) {
        if (this.f8218d == null) {
            this.f8218d = new ArrayList();
        }
        this.f8218d.add(c0631a);
    }

    void i1(Fragment fragment) {
        if (J0(2)) {
            Log.v("FragmentManager", "remove: " + fragment + " nesting=" + fragment.mBackStackNesting);
        }
        boolean z6 = !fragment.isInBackStack();
        if (!fragment.mDetached || z6) {
            this.f8217c.u(fragment);
            if (K0(fragment)) {
                this.f8204H = true;
            }
            fragment.mRemoving = true;
            t1(fragment);
        }
    }

    C j(Fragment fragment) {
        String str = fragment.mPreviousWho;
        if (str != null) {
            L.c.f(fragment, str);
        }
        if (J0(2)) {
            Log.v("FragmentManager", "add: " + fragment);
        }
        C cW = w(fragment);
        fragment.mFragmentManager = this;
        this.f8217c.r(cW);
        if (!fragment.mDetached) {
            this.f8217c.a(fragment);
            fragment.mRemoving = false;
            if (fragment.mView == null) {
                fragment.mHiddenChanged = false;
            }
            if (K0(fragment)) {
                this.f8204H = true;
            }
        }
        return cW;
    }

    public Fragment j0(int i7) {
        return this.f8217c.g(i7);
    }

    public void k(A a7) {
        this.f8229o.add(a7);
    }

    public Fragment k0(String str) {
        return this.f8217c.h(str);
    }

    void k1(Fragment fragment) {
        this.f8212P.p(fragment);
    }

    void l(Fragment fragment) {
        this.f8212P.f(fragment);
    }

    Fragment l0(String str) {
        return this.f8217c.i(str);
    }

    int m() {
        return this.f8223i.getAndIncrement();
    }

    void m1(Parcelable parcelable) {
        C c7;
        Bundle bundle;
        Bundle bundle2;
        if (parcelable == null) {
            return;
        }
        Bundle bundle3 = (Bundle) parcelable;
        for (String str : bundle3.keySet()) {
            if (str.startsWith("result_") && (bundle2 = bundle3.getBundle(str)) != null) {
                bundle2.setClassLoader(this.f8236v.n().getClassLoader());
                this.f8225k.put(str.substring(7), bundle2);
            }
        }
        ArrayList arrayList = new ArrayList();
        for (String str2 : bundle3.keySet()) {
            if (str2.startsWith("fragment_") && (bundle = bundle3.getBundle(str2)) != null) {
                bundle.setClassLoader(this.f8236v.n().getClassLoader());
                arrayList.add((B) bundle.getParcelable("state"));
            }
        }
        this.f8217c.x(arrayList);
        y yVar = (y) bundle3.getParcelable("state");
        if (yVar == null) {
            return;
        }
        this.f8217c.v();
        Iterator it = yVar.f8257m.iterator();
        while (it.hasNext()) {
            B B6 = this.f8217c.B((String) it.next(), null);
            if (B6 != null) {
                Fragment fragmentJ = this.f8212P.j(B6.f7932n);
                if (fragmentJ != null) {
                    if (J0(2)) {
                        Log.v("FragmentManager", "restoreSaveState: re-attaching retained " + fragmentJ);
                    }
                    c7 = new C(this.f8228n, this.f8217c, fragmentJ, B6);
                } else {
                    c7 = new C(this.f8228n, this.f8217c, this.f8236v.n().getClassLoader(), u0(), B6);
                }
                Fragment fragmentK = c7.k();
                fragmentK.mFragmentManager = this;
                if (J0(2)) {
                    Log.v("FragmentManager", "restoreSaveState: active (" + fragmentK.mWho + "): " + fragmentK);
                }
                c7.o(this.f8236v.n().getClassLoader());
                this.f8217c.r(c7);
                c7.t(this.f8235u);
            }
        }
        for (Fragment fragment : this.f8212P.m()) {
            if (!this.f8217c.c(fragment.mWho)) {
                if (J0(2)) {
                    Log.v("FragmentManager", "Discarding retained Fragment " + fragment + " that was not found in the set of active Fragments " + yVar.f8257m);
                }
                this.f8212P.p(fragment);
                fragment.mFragmentManager = this;
                C c8 = new C(this.f8228n, this.f8217c, fragment);
                c8.t(1);
                c8.m();
                fragment.mRemoving = true;
                c8.m();
            }
        }
        this.f8217c.w(yVar.f8258n);
        if (yVar.f8259o != null) {
            this.f8218d = new ArrayList(yVar.f8259o.length);
            int i7 = 0;
            while (true) {
                C0632b[] c0632bArr = yVar.f8259o;
                if (i7 >= c0632bArr.length) {
                    break;
                }
                C0631a c0631aB = c0632bArr[i7].b(this);
                if (J0(2)) {
                    Log.v("FragmentManager", "restoreAllState: back stack #" + i7 + " (index " + c0631aB.f8092v + "): " + c0631aB);
                    PrintWriter printWriter = new PrintWriter(new J("FragmentManager"));
                    c0631aB.w("  ", printWriter, false);
                    printWriter.close();
                }
                this.f8218d.add(c0631aB);
                i7++;
            }
        } else {
            this.f8218d = null;
        }
        this.f8223i.set(yVar.f8260p);
        String str3 = yVar.f8261q;
        if (str3 != null) {
            Fragment fragmentG0 = g0(str3);
            this.f8239y = fragmentG0;
            M(fragmentG0);
        }
        ArrayList arrayList2 = yVar.f8262r;
        if (arrayList2 != null) {
            for (int i8 = 0; i8 < arrayList2.size(); i8++) {
                this.f8224j.put((String) arrayList2.get(i8), (C0633c) yVar.f8263s.get(i8));
            }
        }
        this.f8203G = new ArrayDeque(yVar.f8264t);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0150  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    void n(o oVar, AbstractC0642l abstractC0642l, Fragment fragment) {
        A gVar;
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        Object obj7;
        String str;
        Bundle bundleB;
        if (this.f8236v != null) {
            throw new IllegalStateException("Already attached");
        }
        this.f8236v = oVar;
        this.f8237w = abstractC0642l;
        this.f8238x = fragment;
        if (fragment == null) {
            if (oVar instanceof A) {
                gVar = (A) oVar;
            }
            if (this.f8238x != null) {
                x1();
            }
            if (oVar instanceof androidx.activity.l) {
                androidx.activity.l lVar = (androidx.activity.l) oVar;
                OnBackPressedDispatcher onBackPressedDispatcherB = lVar.b();
                this.f8221g = onBackPressedDispatcherB;
                androidx.lifecycle.l lVar2 = lVar;
                if (fragment != null) {
                    lVar2 = fragment;
                }
                onBackPressedDispatcherB.b(lVar2, this.f8222h);
            }
            this.f8212P = fragment == null ? fragment.mFragmentManager.r0(fragment) : oVar instanceof androidx.lifecycle.I ? z.l(((androidx.lifecycle.I) oVar).getViewModelStore()) : new z(false);
            this.f8212P.q(Q0());
            this.f8217c.A(this.f8212P);
            obj = this.f8236v;
            if ((obj instanceof Y.e) && fragment == null) {
                Y.c savedStateRegistry = ((Y.e) obj).getSavedStateRegistry();
                savedStateRegistry.h("android:support:fragments", new c.InterfaceC0101c() { // from class: androidx.fragment.app.v
                    @Override // Y.c.InterfaceC0101c
                    public final Bundle a() {
                        return this.f8195a.R0();
                    }
                });
                bundleB = savedStateRegistry.b("android:support:fragments");
                if (bundleB != null) {
                    m1(bundleB);
                }
            }
            obj2 = this.f8236v;
            if (obj2 instanceof androidx.activity.result.d) {
                ActivityResultRegistry activityResultRegistryK = ((androidx.activity.result.d) obj2).k();
                if (fragment != null) {
                    str = fragment.mWho + ":";
                } else {
                    str = "";
                }
                String str2 = "FragmentManager:" + str;
                this.f8200D = activityResultRegistryK.j(str2 + "StartActivityForResult", new d.c(), new h());
                this.f8201E = activityResultRegistryK.j(str2 + "StartIntentSenderForResult", new j(), new i());
                this.f8202F = activityResultRegistryK.j(str2 + "RequestPermissions", new C1601b(), new a());
            }
            obj3 = this.f8236v;
            if (obj3 instanceof androidx.core.content.d) {
                ((androidx.core.content.d) obj3).e(this.f8230p);
            }
            obj4 = this.f8236v;
            if (obj4 instanceof androidx.core.content.e) {
                ((androidx.core.content.e) obj4).r(this.f8231q);
            }
            obj5 = this.f8236v;
            if (obj5 instanceof U) {
                ((U) obj5).l(this.f8232r);
            }
            obj6 = this.f8236v;
            if (obj6 instanceof V) {
                ((V) obj6).j(this.f8233s);
            }
            obj7 = this.f8236v;
            if ((obj7 instanceof InterfaceC0598s) || fragment != null) {
            }
            ((InterfaceC0598s) obj7).s(this.f8234t);
            return;
        }
        gVar = new g(fragment);
        k(gVar);
        if (this.f8238x != null) {
        }
        if (oVar instanceof androidx.activity.l) {
        }
        this.f8212P = fragment == null ? fragment.mFragmentManager.r0(fragment) : oVar instanceof androidx.lifecycle.I ? z.l(((androidx.lifecycle.I) oVar).getViewModelStore()) : new z(false);
        this.f8212P.q(Q0());
        this.f8217c.A(this.f8212P);
        obj = this.f8236v;
        if (obj instanceof Y.e) {
            Y.c savedStateRegistry2 = ((Y.e) obj).getSavedStateRegistry();
            savedStateRegistry2.h("android:support:fragments", new c.InterfaceC0101c() { // from class: androidx.fragment.app.v
                @Override // Y.c.InterfaceC0101c
                public final Bundle a() {
                    return this.f8195a.R0();
                }
            });
            bundleB = savedStateRegistry2.b("android:support:fragments");
            if (bundleB != null) {
            }
        }
        obj2 = this.f8236v;
        if (obj2 instanceof androidx.activity.result.d) {
        }
        obj3 = this.f8236v;
        if (obj3 instanceof androidx.core.content.d) {
        }
        obj4 = this.f8236v;
        if (obj4 instanceof androidx.core.content.e) {
        }
        obj5 = this.f8236v;
        if (obj5 instanceof U) {
        }
        obj6 = this.f8236v;
        if (obj6 instanceof V) {
        }
        obj7 = this.f8236v;
        if (obj7 instanceof InterfaceC0598s) {
        }
    }

    void o(Fragment fragment) {
        if (J0(2)) {
            Log.v("FragmentManager", "attach: " + fragment);
        }
        if (fragment.mDetached) {
            fragment.mDetached = false;
            if (fragment.mAdded) {
                return;
            }
            this.f8217c.a(fragment);
            if (J0(2)) {
                Log.v("FragmentManager", "add from attach: " + fragment);
            }
            if (K0(fragment)) {
                this.f8204H = true;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: renamed from: o1, reason: merged with bridge method [inline-methods] */
    public Bundle R0() {
        C0632b[] c0632bArr;
        int size;
        Bundle bundle = new Bundle();
        o0();
        Y();
        b0(true);
        this.f8205I = true;
        this.f8212P.q(true);
        ArrayList arrayListY = this.f8217c.y();
        ArrayList<B> arrayListM = this.f8217c.m();
        if (!arrayListM.isEmpty()) {
            ArrayList arrayListZ = this.f8217c.z();
            ArrayList arrayList = this.f8218d;
            if (arrayList == null || (size = arrayList.size()) <= 0) {
                c0632bArr = null;
            } else {
                c0632bArr = new C0632b[size];
                for (int i7 = 0; i7 < size; i7++) {
                    c0632bArr[i7] = new C0632b((C0631a) this.f8218d.get(i7));
                    if (J0(2)) {
                        Log.v("FragmentManager", "saveAllState: adding back stack #" + i7 + ": " + this.f8218d.get(i7));
                    }
                }
            }
            y yVar = new y();
            yVar.f8257m = arrayListY;
            yVar.f8258n = arrayListZ;
            yVar.f8259o = c0632bArr;
            yVar.f8260p = this.f8223i.get();
            Fragment fragment = this.f8239y;
            if (fragment != null) {
                yVar.f8261q = fragment.mWho;
            }
            yVar.f8262r.addAll(this.f8224j.keySet());
            yVar.f8263s.addAll(this.f8224j.values());
            yVar.f8264t = new ArrayList(this.f8203G);
            bundle.putParcelable("state", yVar);
            for (String str : this.f8225k.keySet()) {
                bundle.putBundle("result_" + str, (Bundle) this.f8225k.get(str));
            }
            for (B b7 : arrayListM) {
                Bundle bundle2 = new Bundle();
                bundle2.putParcelable("state", b7);
                bundle.putBundle("fragment_" + b7.f7932n, bundle2);
            }
        } else if (J0(2)) {
            Log.v("FragmentManager", "saveAllState: no fragments!");
        }
        return bundle;
    }

    public E p() {
        return new C0631a(this);
    }

    void p1() {
        synchronized (this.f8215a) {
            try {
                if (this.f8215a.size() == 1) {
                    this.f8236v.p().removeCallbacks(this.f8214R);
                    this.f8236v.p().post(this.f8214R);
                    x1();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    boolean q() {
        boolean zK0 = false;
        for (Fragment fragment : this.f8217c.l()) {
            if (fragment != null) {
                zK0 = K0(fragment);
            }
            if (zK0) {
                return true;
            }
        }
        return false;
    }

    public int q0() {
        ArrayList arrayList = this.f8218d;
        if (arrayList != null) {
            return arrayList.size();
        }
        return 0;
    }

    void q1(Fragment fragment, boolean z6) {
        ViewGroup viewGroupT0 = t0(fragment);
        if (viewGroupT0 == null || !(viewGroupT0 instanceof FragmentContainerView)) {
            return;
        }
        ((FragmentContainerView) viewGroupT0).setDrawDisappearingViewsLast(!z6);
    }

    void r1(Fragment fragment, AbstractC0651h.c cVar) {
        if (fragment.equals(g0(fragment.mWho)) && (fragment.mHost == null || fragment.mFragmentManager == this)) {
            fragment.mMaxState = cVar;
            return;
        }
        throw new IllegalArgumentException("Fragment " + fragment + " is not an active fragment of FragmentManager " + this);
    }

    AbstractC0642l s0() {
        return this.f8237w;
    }

    void s1(Fragment fragment) {
        if (fragment == null || (fragment.equals(g0(fragment.mWho)) && (fragment.mHost == null || fragment.mFragmentManager == this))) {
            Fragment fragment2 = this.f8239y;
            this.f8239y = fragment;
            M(fragment2);
            M(this.f8239y);
            return;
        }
        throw new IllegalArgumentException("Fragment " + fragment + " is not an active fragment of FragmentManager " + this);
    }

    public String toString() {
        Object obj;
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        Fragment fragment = this.f8238x;
        if (fragment != null) {
            sb.append(fragment.getClass().getSimpleName());
            sb.append("{");
            obj = this.f8238x;
        } else {
            o oVar = this.f8236v;
            if (oVar == null) {
                sb.append("null");
                sb.append("}}");
                return sb.toString();
            }
            sb.append(oVar.getClass().getSimpleName());
            sb.append("{");
            obj = this.f8236v;
        }
        sb.append(Integer.toHexString(System.identityHashCode(obj)));
        sb.append("}");
        sb.append("}}");
        return sb.toString();
    }

    public n u0() {
        n nVar = this.f8240z;
        if (nVar != null) {
            return nVar;
        }
        Fragment fragment = this.f8238x;
        return fragment != null ? fragment.mFragmentManager.u0() : this.f8197A;
    }

    void u1(Fragment fragment) {
        if (J0(2)) {
            Log.v("FragmentManager", "show: " + fragment);
        }
        if (fragment.mHidden) {
            fragment.mHidden = false;
            fragment.mHiddenChanged = !fragment.mHiddenChanged;
        }
    }

    public List v0() {
        return this.f8217c.o();
    }

    C w(Fragment fragment) {
        C cN = this.f8217c.n(fragment.mWho);
        if (cN != null) {
            return cN;
        }
        C c7 = new C(this.f8228n, this.f8217c, fragment);
        c7.o(this.f8236v.n().getClassLoader());
        c7.t(this.f8235u);
        return c7;
    }

    public o w0() {
        return this.f8236v;
    }

    void x(Fragment fragment) {
        if (J0(2)) {
            Log.v("FragmentManager", "detach: " + fragment);
        }
        if (fragment.mDetached) {
            return;
        }
        fragment.mDetached = true;
        if (fragment.mAdded) {
            if (J0(2)) {
                Log.v("FragmentManager", "remove from detach: " + fragment);
            }
            this.f8217c.u(fragment);
            if (K0(fragment)) {
                this.f8204H = true;
            }
            t1(fragment);
        }
    }

    LayoutInflater.Factory2 x0() {
        return this.f8220f;
    }

    void y() {
        this.f8205I = false;
        this.f8206J = false;
        this.f8212P.q(false);
        T(4);
    }

    q y0() {
        return this.f8228n;
    }

    void z() {
        this.f8205I = false;
        this.f8206J = false;
        this.f8212P.q(false);
        T(0);
    }

    Fragment z0() {
        return this.f8238x;
    }
}
