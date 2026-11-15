package androidx.core.app;

import android.app.Notification;
import android.app.RemoteInput;
import android.content.Context;
import android.graphics.drawable.Icon;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.RemoteViews;
import androidx.core.app.AbstractC0559k;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
class G implements InterfaceC0558j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f6872a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Notification.Builder f6873b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final AbstractC0559k.e f6874c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private RemoteViews f6875d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private RemoteViews f6876e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final List f6877f = new ArrayList();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Bundle f6878g = new Bundle();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f6879h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private RemoteViews f6880i;

    G(AbstractC0559k.e eVar) {
        Notification.Builder builder;
        int i7;
        this.f6874c = eVar;
        this.f6872a = eVar.f7016a;
        if (Build.VERSION.SDK_INT >= 26) {
            AbstractC0571x.a();
            builder = r.a(eVar.f7016a, eVar.f7005L);
        } else {
            builder = new Notification.Builder(eVar.f7016a);
        }
        this.f6873b = builder;
        Notification notification = eVar.f7012S;
        this.f6873b.setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, eVar.f7024i).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).setOngoing((notification.flags & 2) != 0).setOnlyAlertOnce((notification.flags & 8) != 0).setAutoCancel((notification.flags & 16) != 0).setDefaults(notification.defaults).setContentTitle(eVar.f7020e).setContentText(eVar.f7021f).setContentInfo(eVar.f7026k).setContentIntent(eVar.f7022g).setDeleteIntent(notification.deleteIntent).setFullScreenIntent(eVar.f7023h, (notification.flags & 128) != 0).setLargeIcon(eVar.f7025j).setNumber(eVar.f7027l).setProgress(eVar.f7036u, eVar.f7037v, eVar.f7038w);
        this.f6873b.setSubText(eVar.f7033r).setUsesChronometer(eVar.f7030o).setPriority(eVar.f7028m);
        Iterator it = eVar.f7017b.iterator();
        while (it.hasNext()) {
            b((AbstractC0559k.a) it.next());
        }
        Bundle bundle = eVar.f6998E;
        if (bundle != null) {
            this.f6878g.putAll(bundle);
        }
        int i8 = Build.VERSION.SDK_INT;
        this.f6875d = eVar.f7002I;
        this.f6876e = eVar.f7003J;
        this.f6873b.setShowWhen(eVar.f7029n);
        this.f6873b.setLocalOnly(eVar.f6994A).setGroup(eVar.f7039x).setGroupSummary(eVar.f7040y).setSortKey(eVar.f7041z);
        this.f6879h = eVar.f7009P;
        this.f6873b.setCategory(eVar.f6997D).setColor(eVar.f6999F).setVisibility(eVar.f7000G).setPublicVersion(eVar.f7001H).setSound(notification.sound, notification.audioAttributes);
        List listE = i8 < 28 ? e(g(eVar.f7018c), eVar.f7015V) : eVar.f7015V;
        if (listE != null && !listE.isEmpty()) {
            Iterator it2 = listE.iterator();
            while (it2.hasNext()) {
                this.f6873b.addPerson((String) it2.next());
            }
        }
        this.f6880i = eVar.f7004K;
        if (eVar.f7019d.size() > 0) {
            Bundle bundle2 = eVar.e().getBundle("android.car.EXTENSIONS");
            bundle2 = bundle2 == null ? new Bundle() : bundle2;
            Bundle bundle3 = new Bundle(bundle2);
            Bundle bundle4 = new Bundle();
            for (int i9 = 0; i9 < eVar.f7019d.size(); i9++) {
                bundle4.putBundle(Integer.toString(i9), H.a((AbstractC0559k.a) eVar.f7019d.get(i9)));
            }
            bundle2.putBundle("invisible_actions", bundle4);
            bundle3.putBundle("invisible_actions", bundle4);
            eVar.e().putBundle("android.car.EXTENSIONS", bundle2);
            this.f6878g.putBundle("android.car.EXTENSIONS", bundle3);
        }
        int i10 = Build.VERSION.SDK_INT;
        Icon icon = eVar.f7014U;
        if (icon != null) {
            this.f6873b.setSmallIcon(icon);
        }
        this.f6873b.setExtras(eVar.f6998E).setRemoteInputHistory(eVar.f7035t);
        RemoteViews remoteViews = eVar.f7002I;
        if (remoteViews != null) {
            this.f6873b.setCustomContentView(remoteViews);
        }
        RemoteViews remoteViews2 = eVar.f7003J;
        if (remoteViews2 != null) {
            this.f6873b.setCustomBigContentView(remoteViews2);
        }
        RemoteViews remoteViews3 = eVar.f7004K;
        if (remoteViews3 != null) {
            this.f6873b.setCustomHeadsUpContentView(remoteViews3);
        }
        if (i10 >= 26) {
            this.f6873b.setBadgeIconType(eVar.f7006M).setSettingsText(eVar.f7034s).setShortcutId(eVar.f7007N).setTimeoutAfter(eVar.f7008O).setGroupAlertBehavior(eVar.f7009P);
            if (eVar.f6996C) {
                this.f6873b.setColorized(eVar.f6995B);
            }
            if (!TextUtils.isEmpty(eVar.f7005L)) {
                this.f6873b.setSound(null).setDefaults(0).setLights(0, 0, 0).setVibrate(null);
            }
        }
        if (i10 >= 28) {
            Iterator it3 = eVar.f7018c.iterator();
            while (it3.hasNext()) {
                this.f6873b.addPerson(((W) it3.next()).h());
            }
        }
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 29) {
            this.f6873b.setAllowSystemGeneratedContextualActions(eVar.f7011R);
            this.f6873b.setBubbleMetadata(AbstractC0559k.d.a(null));
        }
        if (i11 >= 31 && (i7 = eVar.f7010Q) != 0) {
            this.f6873b.setForegroundServiceBehavior(i7);
        }
        if (eVar.f7013T) {
            if (this.f6874c.f7040y) {
                this.f6879h = 2;
            } else {
                this.f6879h = 1;
            }
            this.f6873b.setVibrate(null);
            this.f6873b.setSound(null);
            int i12 = notification.defaults & (-4);
            notification.defaults = i12;
            this.f6873b.setDefaults(i12);
            if (i11 >= 26) {
                if (TextUtils.isEmpty(this.f6874c.f7039x)) {
                    this.f6873b.setGroup("silent");
                }
                this.f6873b.setGroupAlertBehavior(this.f6879h);
            }
        }
    }

    private void b(AbstractC0559k.a aVar) {
        IconCompat iconCompatD = aVar.d();
        Notification.Action.Builder builder = new Notification.Action.Builder(iconCompatD != null ? iconCompatD.s() : null, aVar.h(), aVar.a());
        if (aVar.e() != null) {
            for (RemoteInput remoteInput : Y.b(aVar.e())) {
                builder.addRemoteInput(remoteInput);
            }
        }
        Bundle bundle = aVar.c() != null ? new Bundle(aVar.c()) : new Bundle();
        bundle.putBoolean("android.support.allowGeneratedReplies", aVar.b());
        int i7 = Build.VERSION.SDK_INT;
        builder.setAllowGeneratedReplies(aVar.b());
        bundle.putInt("android.support.action.semanticAction", aVar.f());
        if (i7 >= 28) {
            builder.setSemanticAction(aVar.f());
        }
        if (i7 >= 29) {
            builder.setContextual(aVar.j());
        }
        if (i7 >= 31) {
            builder.setAuthenticationRequired(aVar.i());
        }
        bundle.putBoolean("android.support.action.showsUserInterface", aVar.g());
        builder.addExtras(bundle);
        this.f6873b.addAction(builder.build());
    }

    private static List e(List list, List list2) {
        if (list == null) {
            return list2;
        }
        if (list2 == null) {
            return list;
        }
        n.b bVar = new n.b(list.size() + list2.size());
        bVar.addAll(list);
        bVar.addAll(list2);
        return new ArrayList(bVar);
    }

    private static List g(List list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((W) it.next()).g());
        }
        return arrayList;
    }

    private void h(Notification notification) {
        notification.sound = null;
        notification.vibrate = null;
        notification.defaults &= -4;
    }

    @Override // androidx.core.app.InterfaceC0558j
    public Notification.Builder a() {
        return this.f6873b;
    }

    public Notification c() {
        Bundle bundleA;
        RemoteViews remoteViewsF;
        RemoteViews remoteViewsD;
        AbstractC0559k.h hVar = this.f6874c.f7032q;
        if (hVar != null) {
            hVar.b(this);
        }
        RemoteViews remoteViewsE = hVar != null ? hVar.e(this) : null;
        Notification notificationD = d();
        if (remoteViewsE != null || (remoteViewsE = this.f6874c.f7002I) != null) {
            notificationD.contentView = remoteViewsE;
        }
        if (hVar != null && (remoteViewsD = hVar.d(this)) != null) {
            notificationD.bigContentView = remoteViewsD;
        }
        if (hVar != null && (remoteViewsF = this.f6874c.f7032q.f(this)) != null) {
            notificationD.headsUpContentView = remoteViewsF;
        }
        if (hVar != null && (bundleA = AbstractC0559k.a(notificationD)) != null) {
            hVar.a(bundleA);
        }
        return notificationD;
    }

    protected Notification d() {
        if (Build.VERSION.SDK_INT >= 26) {
            return this.f6873b.build();
        }
        Notification notificationBuild = this.f6873b.build();
        if (this.f6879h != 0) {
            if (notificationBuild.getGroup() != null && (notificationBuild.flags & 512) != 0 && this.f6879h == 2) {
                h(notificationBuild);
            }
            if (notificationBuild.getGroup() != null && (notificationBuild.flags & 512) == 0 && this.f6879h == 1) {
                h(notificationBuild);
            }
        }
        return notificationBuild;
    }

    Context f() {
        return this.f6872a;
    }
}
