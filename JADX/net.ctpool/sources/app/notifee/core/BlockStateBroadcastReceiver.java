package app.notifee.core;

import S5.e;
import S5.m;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import androidx.annotation.Keep;
import androidx.concurrent.futures.c;
import androidx.work.b;
import androidx.work.c;
import app.notifee.core.BlockStateBroadcastReceiver;
import app.notifee.core.event.BlockStateEvent;
import app.notifee.core.interfaces.MethodCallResult;
import java.util.concurrent.TimeUnit;
import l0.d;
import l0.k;
import l0.t;

/* JADX INFO: loaded from: classes.dex */
public class BlockStateBroadcastReceiver extends BroadcastReceiver {
    @Keep
    public BlockStateBroadcastReceiver() {
    }

    public static /* synthetic */ void b(c.a aVar, m.a aVar2, Exception exc, Bundle bundle) {
        if (exc == null) {
            aVar2.a(bundle);
        } else {
            Logger.e("BlockState", "Failed getting channel or channel group bundle, received error: ", exc);
            aVar.b(c.a.c());
        }
    }

    public static /* synthetic */ void c(c.a aVar, Exception exc, Void r32) {
        c.a aVarC;
        if (exc != null) {
            Logger.e("BlockState", "background work failed with error: ", exc);
            aVarC = c.a.a();
        } else {
            Logger.v("BlockState", "background work completed successfully");
            aVarC = c.a.c();
        }
        aVar.b(aVarC);
    }

    public static void d(b bVar, final c.a aVar) {
        Logger.v("BlockState", "starting background work");
        final boolean zI = bVar.i("blocked", false);
        final int iK = bVar.k("type", 4);
        final m.a aVar2 = new m.a() { // from class: u0.a
            @Override // S5.m.a
            public final void a(Object obj) {
                Bundle bundle = (Bundle) obj;
                S5.f.a(new BlockStateEvent(iK, bundle, zI, new MethodCallResult() { // from class: u0.c
                    @Override // app.notifee.core.interfaces.MethodCallResult
                    public final void onComplete(Exception exc, Object obj2) {
                        BlockStateBroadcastReceiver.c(aVar, exc, (Void) obj2);
                    }
                }));
            }
        };
        if (iK == 4) {
            aVar2.a(null);
            return;
        }
        MethodCallResult<Bundle> methodCallResult = new MethodCallResult() { // from class: u0.b
            @Override // app.notifee.core.interfaces.MethodCallResult
            public final void onComplete(Exception exc, Object obj) {
                BlockStateBroadcastReceiver.b(aVar, aVar2, exc, (Bundle) obj);
            }
        };
        String strM = bVar.m("channelOrGroupId");
        if (iK == 5) {
            Notifee.getInstance().getChannel(strM, methodCallResult);
        } else if (iK == 6) {
            Notifee.getInstance().getChannelGroup(strM, methodCallResult);
        } else {
            Logger.e("BlockState", "unknown block state work type");
            aVar.b(c.a.c());
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        String action;
        b.a aVar;
        String stringExtra;
        StringBuilder sb;
        if (Build.VERSION.SDK_INT >= 28 && (action = intent.getAction()) != null) {
            if (e.f2956a == null) {
                e.a(context.getApplicationContext());
            }
            aVar = new b.a();
            aVar.g("workType", "app.notifee.core.BlockStateBroadcastReceiver.WORKER");
            switch (action) {
                case "android.app.action.APP_BLOCK_STATE_CHANGED":
                    aVar.f("type", 4);
                    aVar.e("blocked", intent.getBooleanExtra("android.app.extra.BLOCKED_STATE", false));
                    try {
                        t.h(e.f2956a).g(action, d.REPLACE, (k) ((k.a) ((k.a) new k.a(Worker.class).j(1L, TimeUnit.SECONDS)).k(aVar.a())).b());
                        break;
                    } catch (IllegalStateException e7) {
                        Logger.e("BlockState", "Error while calling WorkManager.getInstance", (Exception) e7);
                        if (e.f2956a == null) {
                            Logger.e("BlockState", "Application Context is null");
                        }
                    }
                    Logger.v("BlockState", "scheduled new background work with id " + action);
                    break;
                case "android.app.action.NOTIFICATION_CHANNEL_GROUP_BLOCK_STATE_CHANGED":
                    aVar.f("type", 6);
                    stringExtra = intent.getStringExtra("android.app.extra.NOTIFICATION_CHANNEL_GROUP_ID");
                    aVar.g("channelOrGroupId", stringExtra);
                    sb = new StringBuilder();
                    sb.append(action);
                    sb.append(".");
                    sb.append(stringExtra);
                    action = sb.toString();
                    aVar.e("blocked", intent.getBooleanExtra("android.app.extra.BLOCKED_STATE", false));
                    t.h(e.f2956a).g(action, d.REPLACE, (k) ((k.a) ((k.a) new k.a(Worker.class).j(1L, TimeUnit.SECONDS)).k(aVar.a())).b());
                    Logger.v("BlockState", "scheduled new background work with id " + action);
                    break;
                case "android.app.action.NOTIFICATION_CHANNEL_BLOCK_STATE_CHANGED":
                    aVar.f("type", 5);
                    stringExtra = intent.getStringExtra("android.app.extra.NOTIFICATION_CHANNEL_ID");
                    aVar.g("channelOrGroupId", stringExtra);
                    sb = new StringBuilder();
                    sb.append(action);
                    sb.append(".");
                    sb.append(stringExtra);
                    action = sb.toString();
                    aVar.e("blocked", intent.getBooleanExtra("android.app.extra.BLOCKED_STATE", false));
                    t.h(e.f2956a).g(action, d.REPLACE, (k) ((k.a) ((k.a) new k.a(Worker.class).j(1L, TimeUnit.SECONDS)).k(aVar.a())).b());
                    Logger.v("BlockState", "scheduled new background work with id " + action);
                    break;
                default:
                    Logger.d("BlockState", "unknown intent action received, ignoring.");
                    break;
            }
        }
    }
}
