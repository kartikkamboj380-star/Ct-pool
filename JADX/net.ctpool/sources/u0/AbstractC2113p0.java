package u0;

import android.app.NotificationChannel;
import android.app.NotificationChannelGroup;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.TypedValue;
import app.notifee.core.Logger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import z3.AbstractC2272l;
import z3.AbstractC2275o;

/* JADX INFO: renamed from: u0.p0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2113p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static ExecutorService f22466a = Executors.newCachedThreadPool();

    public static Bundle a(NotificationChannel notificationChannel) {
        String strReplace = null;
        if (notificationChannel == null || Build.VERSION.SDK_INT < 26) {
            return null;
        }
        Bundle bundle = new Bundle();
        bundle.putString("id", notificationChannel.getId());
        bundle.putString("name", notificationChannel.getName().toString());
        bundle.putBoolean("badge", notificationChannel.canShowBadge());
        bundle.putBoolean("bypassDnd", notificationChannel.canBypassDnd());
        if (notificationChannel.getDescription() != null) {
            bundle.putString("description", notificationChannel.getDescription());
        }
        if (notificationChannel.getGroup() != null) {
            bundle.putString("groupId", notificationChannel.getGroup());
        }
        bundle.putInt("importance", notificationChannel.getImportance());
        bundle.putBoolean("lights", notificationChannel.shouldShowLights());
        bundle.putBoolean("vibration", notificationChannel.shouldVibrate());
        bundle.putBoolean("blocked", notificationChannel.getImportance() == 0);
        if (notificationChannel.getSound() != null) {
            bundle.putString("soundURI", notificationChannel.getSound().toString());
            Uri sound = notificationChannel.getSound();
            if (sound != null && sound.toString().contains("android.resource")) {
                String lastPathSegment = sound.getLastPathSegment();
                try {
                    int iIntValue = Integer.valueOf(lastPathSegment).intValue();
                    Logger.e("ResourceUtils", "Loaded sound by resource id. New app builds will fail to play sound. Create a new channel to resolve. Issue #341");
                    if (iIntValue != 0) {
                        TypedValue typedValue = new TypedValue();
                        S5.e.f2956a.getResources().getValue(iIntValue, typedValue, true);
                        CharSequence charSequence = typedValue.string;
                        if (charSequence != null || charSequence.length() > 0) {
                            strReplace = charSequence.toString().replace("res/raw/", "");
                        }
                    }
                } catch (NumberFormatException unused) {
                    strReplace = lastPathSegment;
                }
            }
            if (strReplace != null) {
                bundle.putString("sound", strReplace);
            }
        }
        if (notificationChannel.getLightColor() != 0) {
            int lightColor = notificationChannel.getLightColor();
            String str = (String) S5.d.f2955a.get(Integer.valueOf(lightColor));
            if (str == null) {
                str = "#" + Integer.toHexString(lightColor).substring(2);
            }
            bundle.putString("lightColor", str);
        }
        long[] vibrationPattern = notificationChannel.getVibrationPattern();
        if (vibrationPattern != null && vibrationPattern.length > 0) {
            try {
                int[] iArr = new int[vibrationPattern.length];
                for (int i7 = 0; i7 < vibrationPattern.length; i7++) {
                    iArr[i7] = (int) vibrationPattern[i7];
                }
                bundle.putIntArray("vibrationPattern", iArr);
            } catch (Exception e7) {
                Logger.e("ChannelManager", "Unable to convert Vibration Pattern to Channel Bundle", e7);
            }
        }
        int lockscreenVisibility = notificationChannel.getLockscreenVisibility();
        if (lockscreenVisibility != -1000) {
            bundle.putInt("visibility", lockscreenVisibility);
        }
        return bundle;
    }

    public static Bundle b(NotificationChannelGroup notificationChannelGroup) {
        if (notificationChannelGroup == null || Build.VERSION.SDK_INT < 26) {
            return null;
        }
        Bundle bundle = new Bundle();
        bundle.putString("id", notificationChannelGroup.getId());
        bundle.putString("name", notificationChannelGroup.getName().toString());
        List channels = notificationChannelGroup.getChannels();
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>(channels.size());
        Iterator it = channels.iterator();
        while (it.hasNext()) {
            arrayList.add(a(AbstractC2085b0.a(it.next())));
        }
        bundle.putParcelableArrayList("channels", arrayList);
        if (Build.VERSION.SDK_INT >= 28) {
            bundle.putBoolean("blocked", notificationChannelGroup.isBlocked());
            bundle.putString("description", notificationChannelGroup.getDescription());
        } else {
            bundle.putBoolean("blocked", false);
        }
        return bundle;
    }

    public static AbstractC2272l c() {
        return AbstractC2275o.d(f22466a, new Callable() { // from class: u0.l0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return AbstractC2113p0.n();
            }
        });
    }

    public static AbstractC2272l d(final S5.b bVar) {
        return AbstractC2275o.d(f22466a, new Callable() { // from class: u0.f0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return AbstractC2113p0.h(bVar);
            }
        });
    }

    public static AbstractC2272l e(final S5.c cVar) {
        return AbstractC2275o.d(f22466a, new Callable() { // from class: u0.j0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return AbstractC2113p0.i(cVar);
            }
        });
    }

    public static AbstractC2272l f(final String str) {
        return AbstractC2275o.d(f22466a, new Callable() { // from class: u0.g0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return AbstractC2113p0.s(str);
            }
        });
    }

    public static AbstractC2272l g(final List list) {
        return AbstractC2275o.d(f22466a, new Callable() { // from class: u0.m0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return AbstractC2113p0.m(list);
            }
        });
    }

    public static Void h(S5.b bVar) {
        int i7 = Build.VERSION.SDK_INT;
        if (i7 < 26) {
            return null;
        }
        I.a();
        String string = bVar.f2953a.getString("id");
        Objects.requireNonNull(string);
        String string2 = bVar.f2953a.getString("name");
        Objects.requireNonNull(string2);
        NotificationChannelGroup notificationChannelGroupA = AbstractC2122x.a(string, string2);
        if (i7 >= 28 && bVar.f2953a.getString("description") != null) {
            notificationChannelGroupA.setDescription(bVar.f2953a.getString("description"));
        }
        androidx.core.app.T.i(S5.e.f2956a).f(notificationChannelGroupA);
        return null;
    }

    public static Void i(S5.c cVar) {
        long[] jArr;
        if (Build.VERSION.SDK_INT < 26) {
            return null;
        }
        Y.a();
        String string = cVar.f2954a.getString("id");
        Objects.requireNonNull(string);
        String string2 = cVar.f2954a.getString("name");
        Objects.requireNonNull(string2);
        NotificationChannel notificationChannelA = U.a(string, string2, Integer.valueOf(cVar.f2954a.containsKey("importance") ? S5.m.a(cVar.f2954a.get("importance")) : 3).intValue());
        notificationChannelA.setShowBadge(cVar.f2954a.getBoolean("badge", true));
        notificationChannelA.setBypassDnd(cVar.f2954a.getBoolean("bypassDnd", false));
        notificationChannelA.setDescription(cVar.f2954a.getString("description"));
        notificationChannelA.setGroup(cVar.f2954a.getString("groupId"));
        notificationChannelA.enableLights(cVar.f2954a.getBoolean("lights", true));
        if (cVar.a() != null) {
            notificationChannelA.setLightColor(cVar.a().intValue());
        }
        notificationChannelA.setLockscreenVisibility(cVar.f2954a.containsKey("visibility") ? S5.m.a(cVar.f2954a.get("visibility")) : 0);
        notificationChannelA.enableVibration(cVar.f2954a.getBoolean("vibration", true));
        if (cVar.f2954a.containsKey("vibrationPattern")) {
            ArrayList parcelableArrayList = cVar.f2954a.getParcelableArrayList("vibrationPattern");
            Objects.requireNonNull(parcelableArrayList);
            long[] jArr2 = new long[parcelableArrayList.size()];
            for (int i7 = 0; i7 < parcelableArrayList.size(); i7++) {
                jArr2[i7] = ((Integer) parcelableArrayList.get(i7)).longValue();
            }
            jArr = jArr2;
        } else {
            jArr = new long[0];
        }
        if (jArr.length > 0) {
            notificationChannelA.setVibrationPattern(jArr);
        }
        if ((!cVar.f2954a.containsKey("sound") ? null : cVar.f2954a.getString("sound")) != null) {
            Uri uriE = S5.o.e(!cVar.f2954a.containsKey("sound") ? null : cVar.f2954a.getString("sound"));
            if (uriE != null) {
                notificationChannelA.setSound(uriE, new AudioAttributes.Builder().setUsage(5).setContentType(4).build());
            } else {
                Logger.w("ChannelManager", "Unable to retrieve sound for channel, sound was specified as: " + notificationChannelA.getSound());
            }
        } else {
            notificationChannelA.setSound(null, null);
        }
        androidx.core.app.T.i(S5.e.f2956a).e(notificationChannelA);
        return null;
    }

    public static AbstractC2272l j() {
        return AbstractC2275o.d(f22466a, new Callable() { // from class: u0.h0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return AbstractC2113p0.q();
            }
        });
    }

    public static AbstractC2272l k(final String str) {
        return AbstractC2275o.d(f22466a, new Callable() { // from class: u0.o0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return AbstractC2113p0.t(str);
            }
        });
    }

    public static AbstractC2272l l(final List list) {
        return AbstractC2275o.d(f22466a, new Callable() { // from class: u0.i0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return AbstractC2113p0.p(list);
            }
        });
    }

    public static /* synthetic */ Void m(List list) throws InterruptedException {
        if (Build.VERSION.SDK_INT < 26) {
            return null;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AbstractC2275o.a(d((S5.b) it.next()));
        }
        return null;
    }

    public static List n() {
        List listM = androidx.core.app.T.i(S5.e.f2956a).m();
        if (listM.size() == 0 || Build.VERSION.SDK_INT < 26) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList(listM.size());
        Iterator it = listM.iterator();
        while (it.hasNext()) {
            arrayList.add(b(androidx.core.app.L.a(it.next())));
        }
        return arrayList;
    }

    public static AbstractC2272l o(final String str) {
        return AbstractC2275o.d(f22466a, new Callable() { // from class: u0.n0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return AbstractC2113p0.u(str);
            }
        });
    }

    public static /* synthetic */ Void p(List list) throws InterruptedException {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AbstractC2275o.a(e((S5.c) it.next()));
        }
        return null;
    }

    public static List q() {
        List listN = androidx.core.app.T.i(S5.e.f2956a).n();
        if (listN.size() == 0 || Build.VERSION.SDK_INT < 26) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList(listN.size());
        Iterator it = listN.iterator();
        while (it.hasNext()) {
            arrayList.add(a(AbstractC2085b0.a(it.next())));
        }
        return arrayList;
    }

    public static AbstractC2272l r(final String str) {
        return AbstractC2275o.d(f22466a, new Callable() { // from class: u0.k0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return AbstractC2113p0.v(str);
            }
        });
    }

    public static Bundle s(String str) {
        return a(androidx.core.app.T.i(S5.e.f2956a).k(str));
    }

    public static Bundle t(String str) {
        return b(androidx.core.app.T.i(S5.e.f2956a).l(str));
    }

    public static Boolean u(String str) {
        if (Build.VERSION.SDK_INT < 26) {
            return Boolean.FALSE;
        }
        NotificationChannel notificationChannelK = androidx.core.app.T.i(S5.e.f2956a).k(str);
        if (notificationChannelK == null) {
            return Boolean.FALSE;
        }
        return Boolean.valueOf(notificationChannelK.getImportance() == 0);
    }

    public static Boolean v(String str) {
        if (Build.VERSION.SDK_INT < 26) {
            return Boolean.FALSE;
        }
        return Boolean.valueOf(androidx.core.app.T.i(S5.e.f2956a).k(str) != null);
    }
}
