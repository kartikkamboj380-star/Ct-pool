package androidx.activity.result;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import androidx.core.app.AbstractC0551c;
import androidx.lifecycle.AbstractC0651h;
import androidx.lifecycle.InterfaceC0653j;
import androidx.lifecycle.l;
import d.AbstractC1600a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;

/* JADX INFO: loaded from: classes.dex */
public abstract class ActivityResultRegistry {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Random f4894a = new Random();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f4895b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final Map f4896c = new HashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Map f4897d = new HashMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    ArrayList f4898e = new ArrayList();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final transient Map f4899f = new HashMap();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final Map f4900g = new HashMap();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final Bundle f4901h = new Bundle();

    class a extends androidx.activity.result.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f4906a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ AbstractC1600a f4907b;

        a(String str, AbstractC1600a abstractC1600a) {
            this.f4906a = str;
            this.f4907b = abstractC1600a;
        }

        @Override // androidx.activity.result.c
        public void b(Object obj, AbstractC0551c abstractC0551c) throws Exception {
            Integer num = (Integer) ActivityResultRegistry.this.f4896c.get(this.f4906a);
            if (num != null) {
                ActivityResultRegistry.this.f4898e.add(this.f4906a);
                try {
                    ActivityResultRegistry.this.f(num.intValue(), this.f4907b, obj, abstractC0551c);
                    return;
                } catch (Exception e7) {
                    ActivityResultRegistry.this.f4898e.remove(this.f4906a);
                    throw e7;
                }
            }
            throw new IllegalStateException("Attempting to launch an unregistered ActivityResultLauncher with contract " + this.f4907b + " and input " + obj + ". You must ensure the ActivityResultLauncher is registered before calling launch().");
        }

        @Override // androidx.activity.result.c
        public void c() {
            ActivityResultRegistry.this.l(this.f4906a);
        }
    }

    class b extends androidx.activity.result.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f4909a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ AbstractC1600a f4910b;

        b(String str, AbstractC1600a abstractC1600a) {
            this.f4909a = str;
            this.f4910b = abstractC1600a;
        }

        @Override // androidx.activity.result.c
        public void b(Object obj, AbstractC0551c abstractC0551c) throws Exception {
            Integer num = (Integer) ActivityResultRegistry.this.f4896c.get(this.f4909a);
            if (num != null) {
                ActivityResultRegistry.this.f4898e.add(this.f4909a);
                try {
                    ActivityResultRegistry.this.f(num.intValue(), this.f4910b, obj, abstractC0551c);
                    return;
                } catch (Exception e7) {
                    ActivityResultRegistry.this.f4898e.remove(this.f4909a);
                    throw e7;
                }
            }
            throw new IllegalStateException("Attempting to launch an unregistered ActivityResultLauncher with contract " + this.f4910b + " and input " + obj + ". You must ensure the ActivityResultLauncher is registered before calling launch().");
        }

        @Override // androidx.activity.result.c
        public void c() {
            ActivityResultRegistry.this.l(this.f4909a);
        }
    }

    private static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final androidx.activity.result.b f4912a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final AbstractC1600a f4913b;

        c(androidx.activity.result.b bVar, AbstractC1600a abstractC1600a) {
            this.f4912a = bVar;
            this.f4913b = abstractC1600a;
        }
    }

    private static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final AbstractC0651h f4914a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final ArrayList f4915b = new ArrayList();

        d(AbstractC0651h abstractC0651h) {
            this.f4914a = abstractC0651h;
        }

        void a(InterfaceC0653j interfaceC0653j) {
            this.f4914a.a(interfaceC0653j);
            this.f4915b.add(interfaceC0653j);
        }

        void b() {
            Iterator it = this.f4915b.iterator();
            while (it.hasNext()) {
                this.f4914a.c((InterfaceC0653j) it.next());
            }
            this.f4915b.clear();
        }
    }

    private void a(int i7, String str) {
        this.f4895b.put(Integer.valueOf(i7), str);
        this.f4896c.put(str, Integer.valueOf(i7));
    }

    private void d(String str, int i7, Intent intent, c cVar) {
        if (cVar == null || cVar.f4912a == null || !this.f4898e.contains(str)) {
            this.f4900g.remove(str);
            this.f4901h.putParcelable(str, new androidx.activity.result.a(i7, intent));
        } else {
            cVar.f4912a.a(cVar.f4913b.c(i7, intent));
            this.f4898e.remove(str);
        }
    }

    private int e() {
        int iNextInt = this.f4894a.nextInt(2147418112);
        while (true) {
            int i7 = iNextInt + 65536;
            if (!this.f4895b.containsKey(Integer.valueOf(i7))) {
                return i7;
            }
            iNextInt = this.f4894a.nextInt(2147418112);
        }
    }

    private void k(String str) {
        if (((Integer) this.f4896c.get(str)) != null) {
            return;
        }
        a(e(), str);
    }

    public final boolean b(int i7, int i8, Intent intent) {
        String str = (String) this.f4895b.get(Integer.valueOf(i7));
        if (str == null) {
            return false;
        }
        d(str, i8, intent, (c) this.f4899f.get(str));
        return true;
    }

    public final boolean c(int i7, Object obj) {
        androidx.activity.result.b bVar;
        String str = (String) this.f4895b.get(Integer.valueOf(i7));
        if (str == null) {
            return false;
        }
        c cVar = (c) this.f4899f.get(str);
        if (cVar == null || (bVar = cVar.f4912a) == null) {
            this.f4901h.remove(str);
            this.f4900g.put(str, obj);
            return true;
        }
        if (!this.f4898e.remove(str)) {
            return true;
        }
        bVar.a(obj);
        return true;
    }

    public abstract void f(int i7, AbstractC1600a abstractC1600a, Object obj, AbstractC0551c abstractC0551c);

    public final void g(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        ArrayList<Integer> integerArrayList = bundle.getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS");
        ArrayList<String> stringArrayList = bundle.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
        if (stringArrayList == null || integerArrayList == null) {
            return;
        }
        this.f4898e = bundle.getStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS");
        this.f4894a = (Random) bundle.getSerializable("KEY_COMPONENT_ACTIVITY_RANDOM_OBJECT");
        this.f4901h.putAll(bundle.getBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT"));
        for (int i7 = 0; i7 < stringArrayList.size(); i7++) {
            String str = stringArrayList.get(i7);
            if (this.f4896c.containsKey(str)) {
                Integer num = (Integer) this.f4896c.remove(str);
                if (!this.f4901h.containsKey(str)) {
                    this.f4895b.remove(num);
                }
            }
            a(integerArrayList.get(i7).intValue(), stringArrayList.get(i7));
        }
    }

    public final void h(Bundle bundle) {
        bundle.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new ArrayList<>(this.f4896c.values()));
        bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new ArrayList<>(this.f4896c.keySet()));
        bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new ArrayList<>(this.f4898e));
        bundle.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", (Bundle) this.f4901h.clone());
        bundle.putSerializable("KEY_COMPONENT_ACTIVITY_RANDOM_OBJECT", this.f4894a);
    }

    public final androidx.activity.result.c i(final String str, l lVar, final AbstractC1600a abstractC1600a, final androidx.activity.result.b bVar) {
        AbstractC0651h lifecycle = lVar.getLifecycle();
        if (lifecycle.b().e(AbstractC0651h.c.STARTED)) {
            throw new IllegalStateException("LifecycleOwner " + lVar + " is attempting to register while current state is " + lifecycle.b() + ". LifecycleOwners must call register before they are STARTED.");
        }
        k(str);
        d dVar = (d) this.f4897d.get(str);
        if (dVar == null) {
            dVar = new d(lifecycle);
        }
        dVar.a(new InterfaceC0653j() { // from class: androidx.activity.result.ActivityResultRegistry.1
            @Override // androidx.lifecycle.InterfaceC0653j
            public void g(l lVar2, AbstractC0651h.b bVar2) {
                if (!AbstractC0651h.b.ON_START.equals(bVar2)) {
                    if (AbstractC0651h.b.ON_STOP.equals(bVar2)) {
                        ActivityResultRegistry.this.f4899f.remove(str);
                        return;
                    } else {
                        if (AbstractC0651h.b.ON_DESTROY.equals(bVar2)) {
                            ActivityResultRegistry.this.l(str);
                            return;
                        }
                        return;
                    }
                }
                ActivityResultRegistry.this.f4899f.put(str, new c(bVar, abstractC1600a));
                if (ActivityResultRegistry.this.f4900g.containsKey(str)) {
                    Object obj = ActivityResultRegistry.this.f4900g.get(str);
                    ActivityResultRegistry.this.f4900g.remove(str);
                    bVar.a(obj);
                }
                androidx.activity.result.a aVar = (androidx.activity.result.a) ActivityResultRegistry.this.f4901h.getParcelable(str);
                if (aVar != null) {
                    ActivityResultRegistry.this.f4901h.remove(str);
                    bVar.a(abstractC1600a.c(aVar.b(), aVar.a()));
                }
            }
        });
        this.f4897d.put(str, dVar);
        return new a(str, abstractC1600a);
    }

    public final androidx.activity.result.c j(String str, AbstractC1600a abstractC1600a, androidx.activity.result.b bVar) {
        k(str);
        this.f4899f.put(str, new c(bVar, abstractC1600a));
        if (this.f4900g.containsKey(str)) {
            Object obj = this.f4900g.get(str);
            this.f4900g.remove(str);
            bVar.a(obj);
        }
        androidx.activity.result.a aVar = (androidx.activity.result.a) this.f4901h.getParcelable(str);
        if (aVar != null) {
            this.f4901h.remove(str);
            bVar.a(abstractC1600a.c(aVar.b(), aVar.a()));
        }
        return new b(str, abstractC1600a);
    }

    final void l(String str) {
        Integer num;
        if (!this.f4898e.contains(str) && (num = (Integer) this.f4896c.remove(str)) != null) {
            this.f4895b.remove(num);
        }
        this.f4899f.remove(str);
        if (this.f4900g.containsKey(str)) {
            Log.w("ActivityResultRegistry", "Dropping pending result for request " + str + ": " + this.f4900g.get(str));
            this.f4900g.remove(str);
        }
        if (this.f4901h.containsKey(str)) {
            Log.w("ActivityResultRegistry", "Dropping pending result for request " + str + ": " + this.f4901h.getParcelable(str));
            this.f4901h.remove(str);
        }
        d dVar = (d) this.f4897d.get(str);
        if (dVar != null) {
            dVar.b();
            this.f4897d.remove(str);
        }
    }
}
