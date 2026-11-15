package app.notifee.core;

import S5.e;
import S5.f;
import android.content.Context;
import app.notifee.core.event.BlockStateEvent;
import app.notifee.core.event.ForegroundServiceEvent;
import app.notifee.core.event.LogEvent;
import app.notifee.core.event.NotificationEvent;
import app.notifee.core.interfaces.EventListener;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import l6.m;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: loaded from: classes.dex */
@KeepForSdk
public class EventSubscriber {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final EventSubscriber f9530b = new EventSubscriber();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f9531a = new HashSet();

    private EventSubscriber() {
        f.c(this);
    }

    @KeepForSdk
    public static Context getContext() {
        return e.f2956a;
    }

    @KeepForSdk
    public static void register(EventListener eventListener) {
        f9530b.f9531a.add(eventListener);
    }

    @KeepForSdk
    public static void unregister(EventListener eventListener) {
        f9530b.f9531a.remove(eventListener);
    }

    @m(threadMode = ThreadMode.MAIN)
    public void onBlockStateEvent(BlockStateEvent blockStateEvent) {
        Iterator it = this.f9531a.iterator();
        while (it.hasNext()) {
            ((EventListener) it.next()).onBlockStateEvent(blockStateEvent);
        }
    }

    @m(threadMode = ThreadMode.MAIN)
    public void onForegroundServiceEvent(ForegroundServiceEvent foregroundServiceEvent) {
        Iterator it = this.f9531a.iterator();
        while (it.hasNext()) {
            ((EventListener) it.next()).onForegroundServiceEvent(foregroundServiceEvent);
        }
    }

    @m(threadMode = ThreadMode.MAIN)
    public void onLogEvent(LogEvent logEvent) {
        Iterator it = this.f9531a.iterator();
        while (it.hasNext()) {
            ((EventListener) it.next()).onLogEvent(logEvent);
        }
    }

    @m(threadMode = ThreadMode.MAIN)
    public void onNotificationEvent(NotificationEvent notificationEvent) {
        Iterator it = this.f9531a.iterator();
        while (it.hasNext()) {
            ((EventListener) it.next()).onNotificationEvent(notificationEvent);
        }
    }
}
