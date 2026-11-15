package androidx.room;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteCallbackList;
import android.os.RemoteException;
import android.util.Log;
import androidx.room.k;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class MultiInstanceInvalidationService extends Service {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f8897m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Map f8898n = new LinkedHashMap();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final RemoteCallbackList f8899o = new b();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final k.a f8900p = new a();

    public static final class a extends k.a {
        a() {
        }

        @Override // androidx.room.k
        public void a0(int i7, String[] strArr) {
            w5.k.f(strArr, "tables");
            RemoteCallbackList remoteCallbackListA = MultiInstanceInvalidationService.this.a();
            MultiInstanceInvalidationService multiInstanceInvalidationService = MultiInstanceInvalidationService.this;
            synchronized (remoteCallbackListA) {
                String str = (String) multiInstanceInvalidationService.b().get(Integer.valueOf(i7));
                if (str == null) {
                    Log.w("ROOM", "Remote invalidation client ID not registered");
                    return;
                }
                int iBeginBroadcast = multiInstanceInvalidationService.a().beginBroadcast();
                for (int i8 = 0; i8 < iBeginBroadcast; i8++) {
                    try {
                        Object broadcastCookie = multiInstanceInvalidationService.a().getBroadcastCookie(i8);
                        w5.k.d(broadcastCookie, "null cannot be cast to non-null type kotlin.Int");
                        Integer num = (Integer) broadcastCookie;
                        int iIntValue = num.intValue();
                        String str2 = (String) multiInstanceInvalidationService.b().get(num);
                        if (i7 != iIntValue && w5.k.b(str, str2)) {
                            try {
                                ((j) multiInstanceInvalidationService.a().getBroadcastItem(i8)).m(strArr);
                            } catch (RemoteException e7) {
                                Log.w("ROOM", "Error invoking a remote callback", e7);
                            }
                        }
                    } catch (Throwable th) {
                        multiInstanceInvalidationService.a().finishBroadcast();
                        throw th;
                    }
                }
                multiInstanceInvalidationService.a().finishBroadcast();
                i5.u uVar = i5.u.f19985a;
            }
        }

        @Override // androidx.room.k
        public void e0(j jVar, int i7) {
            w5.k.f(jVar, "callback");
            RemoteCallbackList remoteCallbackListA = MultiInstanceInvalidationService.this.a();
            MultiInstanceInvalidationService multiInstanceInvalidationService = MultiInstanceInvalidationService.this;
            synchronized (remoteCallbackListA) {
                multiInstanceInvalidationService.a().unregister(jVar);
            }
        }

        @Override // androidx.room.k
        public int v(j jVar, String str) {
            w5.k.f(jVar, "callback");
            int i7 = 0;
            if (str == null) {
                return 0;
            }
            RemoteCallbackList remoteCallbackListA = MultiInstanceInvalidationService.this.a();
            MultiInstanceInvalidationService multiInstanceInvalidationService = MultiInstanceInvalidationService.this;
            synchronized (remoteCallbackListA) {
                try {
                    multiInstanceInvalidationService.d(multiInstanceInvalidationService.c() + 1);
                    int iC = multiInstanceInvalidationService.c();
                    if (multiInstanceInvalidationService.a().register(jVar, Integer.valueOf(iC))) {
                        multiInstanceInvalidationService.b().put(Integer.valueOf(iC), str);
                        i7 = iC;
                    } else {
                        multiInstanceInvalidationService.d(multiInstanceInvalidationService.c() - 1);
                        multiInstanceInvalidationService.c();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return i7;
        }
    }

    public static final class b extends RemoteCallbackList {
        b() {
        }

        @Override // android.os.RemoteCallbackList
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onCallbackDied(j jVar, Object obj) {
            w5.k.f(jVar, "callback");
            w5.k.f(obj, "cookie");
            MultiInstanceInvalidationService.this.b().remove((Integer) obj);
        }
    }

    public final RemoteCallbackList a() {
        return this.f8899o;
    }

    public final Map b() {
        return this.f8898n;
    }

    public final int c() {
        return this.f8897m;
    }

    public final void d(int i7) {
        this.f8897m = i7;
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        w5.k.f(intent, "intent");
        return this.f8900p;
    }
}
