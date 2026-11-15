package L;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.w;
import j5.AbstractC1787F;
import j5.AbstractC1794M;
import j5.AbstractC1809n;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f1934a = new c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static C0039c f1935b = C0039c.f1946d;

    public enum a {
        PENALTY_LOG,
        PENALTY_DEATH,
        DETECT_FRAGMENT_REUSE,
        DETECT_FRAGMENT_TAG_USAGE,
        DETECT_RETAIN_INSTANCE_USAGE,
        DETECT_SET_USER_VISIBLE_HINT,
        DETECT_TARGET_FRAGMENT_USAGE,
        DETECT_WRONG_FRAGMENT_CONTAINER
    }

    public interface b {
    }

    /* JADX INFO: renamed from: L.c$c, reason: collision with other inner class name */
    public static final class C0039c {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f1945c = new a(null);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final C0039c f1946d = new C0039c(AbstractC1794M.d(), null, AbstractC1787F.g());

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Set f1947a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Map f1948b;

        /* JADX INFO: renamed from: L.c$c$a */
        public static final class a {
            private a() {
            }

            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public C0039c(Set set, b bVar, Map map) {
            w5.k.f(set, "flags");
            w5.k.f(map, "allowedViolations");
            this.f1947a = set;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : map.entrySet()) {
                linkedHashMap.put((String) entry.getKey(), (Set) entry.getValue());
            }
            this.f1948b = linkedHashMap;
        }

        public final Set a() {
            return this.f1947a;
        }

        public final b b() {
            return null;
        }

        public final Map c() {
            return this.f1948b;
        }
    }

    private c() {
    }

    private final C0039c b(Fragment fragment) {
        while (fragment != null) {
            if (fragment.isAdded()) {
                w parentFragmentManager = fragment.getParentFragmentManager();
                w5.k.e(parentFragmentManager, "declaringFragment.parentFragmentManager");
                if (parentFragmentManager.C0() != null) {
                    C0039c c0039cC0 = parentFragmentManager.C0();
                    w5.k.c(c0039cC0);
                    return c0039cC0;
                }
            }
            fragment = fragment.getParentFragment();
        }
        return f1935b;
    }

    private final void c(C0039c c0039c, final m mVar) {
        Fragment fragmentA = mVar.a();
        final String name = fragmentA.getClass().getName();
        if (c0039c.a().contains(a.PENALTY_LOG)) {
            Log.d("FragmentStrictMode", "Policy violation in " + name, mVar);
        }
        c0039c.b();
        if (c0039c.a().contains(a.PENALTY_DEATH)) {
            o(fragmentA, new Runnable() { // from class: L.b
                @Override // java.lang.Runnable
                public final void run() {
                    c.d(name, mVar);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(String str, m mVar) {
        w5.k.f(mVar, "$violation");
        Log.e("FragmentStrictMode", "Policy violation with PENALTY_DEATH in " + str, mVar);
        throw mVar;
    }

    private final void e(m mVar) {
        if (w.J0(3)) {
            Log.d("FragmentManager", "StrictMode violation in " + mVar.a().getClass().getName(), mVar);
        }
    }

    public static final void f(Fragment fragment, String str) {
        w5.k.f(fragment, "fragment");
        w5.k.f(str, "previousFragmentId");
        L.a aVar = new L.a(fragment, str);
        c cVar = f1934a;
        cVar.e(aVar);
        C0039c c0039cB = cVar.b(fragment);
        if (c0039cB.a().contains(a.DETECT_FRAGMENT_REUSE) && cVar.p(c0039cB, fragment.getClass(), aVar.getClass())) {
            cVar.c(c0039cB, aVar);
        }
    }

    public static final void g(Fragment fragment, ViewGroup viewGroup) {
        w5.k.f(fragment, "fragment");
        d dVar = new d(fragment, viewGroup);
        c cVar = f1934a;
        cVar.e(dVar);
        C0039c c0039cB = cVar.b(fragment);
        if (c0039cB.a().contains(a.DETECT_FRAGMENT_TAG_USAGE) && cVar.p(c0039cB, fragment.getClass(), dVar.getClass())) {
            cVar.c(c0039cB, dVar);
        }
    }

    public static final void h(Fragment fragment) {
        w5.k.f(fragment, "fragment");
        e eVar = new e(fragment);
        c cVar = f1934a;
        cVar.e(eVar);
        C0039c c0039cB = cVar.b(fragment);
        if (c0039cB.a().contains(a.DETECT_RETAIN_INSTANCE_USAGE) && cVar.p(c0039cB, fragment.getClass(), eVar.getClass())) {
            cVar.c(c0039cB, eVar);
        }
    }

    public static final void i(Fragment fragment) {
        w5.k.f(fragment, "fragment");
        f fVar = new f(fragment);
        c cVar = f1934a;
        cVar.e(fVar);
        C0039c c0039cB = cVar.b(fragment);
        if (c0039cB.a().contains(a.DETECT_TARGET_FRAGMENT_USAGE) && cVar.p(c0039cB, fragment.getClass(), fVar.getClass())) {
            cVar.c(c0039cB, fVar);
        }
    }

    public static final void j(Fragment fragment) {
        w5.k.f(fragment, "fragment");
        g gVar = new g(fragment);
        c cVar = f1934a;
        cVar.e(gVar);
        C0039c c0039cB = cVar.b(fragment);
        if (c0039cB.a().contains(a.DETECT_TARGET_FRAGMENT_USAGE) && cVar.p(c0039cB, fragment.getClass(), gVar.getClass())) {
            cVar.c(c0039cB, gVar);
        }
    }

    public static final void k(Fragment fragment) {
        w5.k.f(fragment, "fragment");
        i iVar = new i(fragment);
        c cVar = f1934a;
        cVar.e(iVar);
        C0039c c0039cB = cVar.b(fragment);
        if (c0039cB.a().contains(a.DETECT_RETAIN_INSTANCE_USAGE) && cVar.p(c0039cB, fragment.getClass(), iVar.getClass())) {
            cVar.c(c0039cB, iVar);
        }
    }

    public static final void l(Fragment fragment, Fragment fragment2, int i7) {
        w5.k.f(fragment, "violatingFragment");
        w5.k.f(fragment2, "targetFragment");
        j jVar = new j(fragment, fragment2, i7);
        c cVar = f1934a;
        cVar.e(jVar);
        C0039c c0039cB = cVar.b(fragment);
        if (c0039cB.a().contains(a.DETECT_TARGET_FRAGMENT_USAGE) && cVar.p(c0039cB, fragment.getClass(), jVar.getClass())) {
            cVar.c(c0039cB, jVar);
        }
    }

    public static final void m(Fragment fragment, boolean z6) {
        w5.k.f(fragment, "fragment");
        k kVar = new k(fragment, z6);
        c cVar = f1934a;
        cVar.e(kVar);
        C0039c c0039cB = cVar.b(fragment);
        if (c0039cB.a().contains(a.DETECT_SET_USER_VISIBLE_HINT) && cVar.p(c0039cB, fragment.getClass(), kVar.getClass())) {
            cVar.c(c0039cB, kVar);
        }
    }

    public static final void n(Fragment fragment, ViewGroup viewGroup) {
        w5.k.f(fragment, "fragment");
        w5.k.f(viewGroup, "container");
        n nVar = new n(fragment, viewGroup);
        c cVar = f1934a;
        cVar.e(nVar);
        C0039c c0039cB = cVar.b(fragment);
        if (c0039cB.a().contains(a.DETECT_WRONG_FRAGMENT_CONTAINER) && cVar.p(c0039cB, fragment.getClass(), nVar.getClass())) {
            cVar.c(c0039cB, nVar);
        }
    }

    private final void o(Fragment fragment, Runnable runnable) {
        if (fragment.isAdded()) {
            Handler handlerP = fragment.getParentFragmentManager().w0().p();
            w5.k.e(handlerP, "fragment.parentFragmentManager.host.handler");
            if (!w5.k.b(handlerP.getLooper(), Looper.myLooper())) {
                handlerP.post(runnable);
                return;
            }
        }
        runnable.run();
    }

    private final boolean p(C0039c c0039c, Class cls, Class cls2) {
        Set set = (Set) c0039c.c().get(cls.getName());
        if (set == null) {
            return true;
        }
        if (w5.k.b(cls2.getSuperclass(), m.class) || !AbstractC1809n.D(set, cls2.getSuperclass())) {
            return !set.contains(cls2);
        }
        return false;
    }
}
