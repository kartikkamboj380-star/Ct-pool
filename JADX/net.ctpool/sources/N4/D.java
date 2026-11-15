package N4;

import H5.AbstractC0398i;
import H5.InterfaceC0415q0;
import O4.b;
import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import j5.AbstractC1809n;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.LinkedBlockingDeque;
import kotlin.jvm.internal.DefaultConstructorMarker;
import l5.AbstractC1859a;
import m5.InterfaceC1885d;
import m5.InterfaceC1888g;
import n5.AbstractC1930b;
import o5.AbstractC1956k;

/* JADX INFO: loaded from: classes.dex */
public final class D {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final b f2299f = new b(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC1888g f2300a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Messenger f2301b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f2302c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final LinkedBlockingDeque f2303d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final d f2304e;

    public static final class a extends Handler {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final InterfaceC1888g f2305a;

        /* JADX INFO: renamed from: N4.D$a$a, reason: collision with other inner class name */
        static final class C0043a extends AbstractC1956k implements v5.p {

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            int f2306q;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            final /* synthetic */ String f2307r;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0043a(String str, InterfaceC1885d interfaceC1885d) {
                super(2, interfaceC1885d);
                this.f2307r = str;
            }

            @Override // o5.AbstractC1946a
            public final InterfaceC1885d d(Object obj, InterfaceC1885d interfaceC1885d) {
                return new C0043a(this.f2307r, interfaceC1885d);
            }

            @Override // o5.AbstractC1946a
            public final Object s(Object obj) {
                Object objC = AbstractC1930b.c();
                int i7 = this.f2306q;
                if (i7 == 0) {
                    i5.n.b(obj);
                    O4.a aVar = O4.a.f2476a;
                    this.f2306q = 1;
                    obj = aVar.c(this);
                    if (obj == objC) {
                        return objC;
                    }
                } else {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    i5.n.b(obj);
                }
                Collection<O4.b> collectionValues = ((Map) obj).values();
                String str = this.f2307r;
                for (O4.b bVar : collectionValues) {
                    bVar.a(new b.C0050b(str));
                    Log.d("SessionLifecycleClient", "Notified " + bVar.c() + " of new session " + str);
                }
                return i5.u.f19985a;
            }

            @Override // v5.p
            /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
            public final Object m(H5.I i7, InterfaceC1885d interfaceC1885d) {
                return ((C0043a) d(i7, interfaceC1885d)).s(i5.u.f19985a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC1888g interfaceC1888g) {
            super(Looper.getMainLooper());
            w5.k.f(interfaceC1888g, "backgroundDispatcher");
            this.f2305a = interfaceC1888g;
        }

        private final void a(String str) {
            Log.d("SessionLifecycleClient", "Session update received: " + str);
            AbstractC0398i.d(H5.J.a(this.f2305a), null, null, new C0043a(str, null), 3, null);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            String string;
            w5.k.f(message, "msg");
            if (message.what == 3) {
                Bundle data = message.getData();
                if (data == null || (string = data.getString("SessionUpdateExtra")) == null) {
                    string = "";
                }
                a(string);
                return;
            }
            Log.w("SessionLifecycleClient", "Received unexpected event from the SessionLifecycleService: " + message);
            super.handleMessage(message);
        }
    }

    public static final class b {
        private b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static final class c extends AbstractC1956k implements v5.p {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f2308q;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ List f2310s;

        public static final class a implements Comparator {
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return AbstractC1859a.a(Long.valueOf(((Message) obj).getWhen()), Long.valueOf(((Message) obj2).getWhen()));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(List list, InterfaceC1885d interfaceC1885d) {
            super(2, interfaceC1885d);
            this.f2310s = list;
        }

        @Override // o5.AbstractC1946a
        public final InterfaceC1885d d(Object obj, InterfaceC1885d interfaceC1885d) {
            return D.this.new c(this.f2310s, interfaceC1885d);
        }

        @Override // o5.AbstractC1946a
        public final Object s(Object obj) {
            String str;
            Object objC = AbstractC1930b.c();
            int i7 = this.f2308q;
            if (i7 == 0) {
                i5.n.b(obj);
                O4.a aVar = O4.a.f2476a;
                this.f2308q = 1;
                obj = aVar.c(this);
                if (obj == objC) {
                    return objC;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i5.n.b(obj);
            }
            Map map = (Map) obj;
            if (map.isEmpty()) {
                str = "Sessions SDK did not have any dependent SDKs register as dependencies. Events will not be sent.";
            } else {
                Collection collectionValues = map.values();
                if (!(collectionValues instanceof Collection) || !collectionValues.isEmpty()) {
                    Iterator it = collectionValues.iterator();
                    while (it.hasNext()) {
                        if (((O4.b) it.next()).b()) {
                            List listX = AbstractC1809n.X(AbstractC1809n.F(AbstractC1809n.m(D.this.l(this.f2310s, 2), D.this.l(this.f2310s, 1))), new a());
                            D d7 = D.this;
                            Iterator it2 = listX.iterator();
                            while (it2.hasNext()) {
                                d7.p((Message) it2.next());
                            }
                            return i5.u.f19985a;
                        }
                    }
                }
                str = "Data Collection is disabled for all subscribers. Skipping this Event";
            }
            Log.d("SessionLifecycleClient", str);
            return i5.u.f19985a;
        }

        @Override // v5.p
        /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
        public final Object m(H5.I i7, InterfaceC1885d interfaceC1885d) {
            return ((c) d(i7, interfaceC1885d)).s(i5.u.f19985a);
        }
    }

    public static final class d implements ServiceConnection {
        d() {
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            Log.d("SessionLifecycleClient", "Connected to SessionLifecycleService. Queue size " + D.this.f2303d.size());
            D.this.f2301b = new Messenger(iBinder);
            D.this.f2302c = true;
            D d7 = D.this;
            d7.o(d7.j());
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            Log.d("SessionLifecycleClient", "Disconnected from SessionLifecycleService");
            D.this.f2301b = null;
            D.this.f2302c = false;
        }
    }

    public D(InterfaceC1888g interfaceC1888g) {
        w5.k.f(interfaceC1888g, "backgroundDispatcher");
        this.f2300a = interfaceC1888g;
        this.f2303d = new LinkedBlockingDeque(20);
        this.f2304e = new d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List j() {
        ArrayList arrayList = new ArrayList();
        this.f2303d.drainTo(arrayList);
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Message l(List list, int i7) {
        Object obj;
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            if (((Message) obj2).what == i7) {
                arrayList.add(obj2);
            }
        }
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            Object next = it.next();
            if (it.hasNext()) {
                long when = ((Message) next).getWhen();
                do {
                    Object next2 = it.next();
                    long when2 = ((Message) next2).getWhen();
                    if (when < when2) {
                        next = next2;
                        when = when2;
                    }
                } while (it.hasNext());
            }
            obj = next;
        } else {
            obj = null;
        }
        return (Message) obj;
    }

    private final void m(Message message) {
        StringBuilder sb;
        if (this.f2303d.offer(message)) {
            sb = new StringBuilder();
            sb.append("Queued message ");
            sb.append(message.what);
            sb.append(". Queue size ");
            sb.append(this.f2303d.size());
        } else {
            sb = new StringBuilder();
            sb.append("Failed to enqueue message ");
            sb.append(message.what);
            sb.append(". Dropping.");
        }
        Log.d("SessionLifecycleClient", sb.toString());
    }

    private final void n(int i7) {
        List listJ = j();
        Message messageObtain = Message.obtain(null, i7, 0, 0);
        w5.k.e(messageObtain, "obtain(null, messageCode, 0, 0)");
        listJ.add(messageObtain);
        o(listJ);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final InterfaceC0415q0 o(List list) {
        return AbstractC0398i.d(H5.J.a(this.f2300a), null, null, new c(list, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void p(Message message) {
        if (this.f2301b != null) {
            try {
                Log.d("SessionLifecycleClient", "Sending lifecycle " + message.what + " to service");
                Messenger messenger = this.f2301b;
                if (messenger != null) {
                    messenger.send(message);
                    return;
                }
                return;
            } catch (RemoteException e7) {
                Log.w("SessionLifecycleClient", "Unable to deliver message: " + message.what, e7);
            }
        }
        m(message);
    }

    public final void h() {
        n(2);
    }

    public final void i(F f7) {
        w5.k.f(f7, "sessionLifecycleServiceBinder");
        f7.a(new Messenger(new a(this.f2300a)), this.f2304e);
    }

    public final void k() {
        n(1);
    }
}
