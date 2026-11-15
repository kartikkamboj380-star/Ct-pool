package l0;

import android.app.Notification;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f21036a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f21037b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Notification f21038c;

    public e(int i7, Notification notification, int i8) {
        this.f21036a = i7;
        this.f21038c = notification;
        this.f21037b = i8;
    }

    public int a() {
        return this.f21037b;
    }

    public Notification b() {
        return this.f21038c;
    }

    public int c() {
        return this.f21036a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || e.class != obj.getClass()) {
            return false;
        }
        e eVar = (e) obj;
        if (this.f21036a == eVar.f21036a && this.f21037b == eVar.f21037b) {
            return this.f21038c.equals(eVar.f21038c);
        }
        return false;
    }

    public int hashCode() {
        return (((this.f21036a * 31) + this.f21037b) * 31) + this.f21038c.hashCode();
    }

    public String toString() {
        return "ForegroundInfo{mNotificationId=" + this.f21036a + ", mForegroundServiceType=" + this.f21037b + ", mNotification=" + this.f21038c + '}';
    }
}
