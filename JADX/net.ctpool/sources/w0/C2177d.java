package w0;

import S5.m;
import android.os.Bundle;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: w0.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C2177d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Bundle f22588a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f22589b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public TimeUnit f22590c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Boolean f22591d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public a f22592e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f22593f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Long f22594g;

    /* JADX INFO: renamed from: w0.d$a */
    public enum a {
        SET,
        SET_AND_ALLOW_WHILE_IDLE,
        SET_EXACT,
        SET_EXACT_AND_ALLOW_WHILE_IDLE,
        SET_ALARM_CLOCK
    }

    public C2177d(Bundle bundle) {
        a aVar;
        String str;
        this.f22589b = -1;
        this.f22590c = null;
        this.f22591d = Boolean.FALSE;
        a aVar2 = a.SET_EXACT;
        this.f22592e = aVar2;
        this.f22593f = null;
        this.f22594g = null;
        this.f22588a = bundle;
        if (bundle.containsKey("repeatFrequency")) {
            int iA = m.a(this.f22588a.get("repeatFrequency"));
            this.f22594g = Long.valueOf(m.d(this.f22588a.get("timestamp")));
            if (iA == 0) {
                this.f22589b = 1;
                this.f22590c = TimeUnit.HOURS;
                str = "HOURLY";
            } else if (iA == 1) {
                this.f22589b = 1;
                this.f22590c = TimeUnit.DAYS;
                str = "DAILY";
            } else if (iA == 2) {
                this.f22589b = 7;
                this.f22590c = TimeUnit.DAYS;
                str = "WEEKLY";
            }
            this.f22593f = str;
        }
        if (this.f22588a.containsKey("alarmManager")) {
            this.f22591d = Boolean.TRUE;
            Bundle bundle2 = this.f22588a.getBundle("alarmManager");
            Object obj = bundle2.get("type");
            int iA2 = obj != null ? m.a(obj) : 2;
            if (bundle2.containsKey("allowWhileIdle") && bundle2.getBoolean("allowWhileIdle")) {
                iA2 = 3;
            }
            if (iA2 == 0) {
                aVar = a.SET;
            } else if (iA2 == 1) {
                aVar = a.SET_AND_ALLOW_WHILE_IDLE;
            } else if (iA2 != 3) {
                if (iA2 != 4) {
                    this.f22592e = aVar2;
                    return;
                }
                aVar = a.SET_ALARM_CLOCK;
            }
            this.f22592e = aVar;
        }
        if (!this.f22588a.containsKey("allowWhileIdle")) {
            return;
        } else {
            this.f22591d = Boolean.TRUE;
        }
        aVar = a.SET_EXACT_AND_ALLOW_WHILE_IDLE;
        this.f22592e = aVar;
    }

    public void a() {
        long j7;
        if (this.f22593f == null) {
            return;
        }
        long jLongValue = this.f22594g.longValue();
        String str = this.f22593f;
        str.getClass();
        switch (str) {
            case "WEEKLY":
                j7 = 604800000;
                break;
            case "DAILY":
                j7 = 86400000;
                break;
            case "HOURLY":
                j7 = 3600000;
                break;
            default:
                j7 = 0;
                break;
        }
        while (jLongValue < System.currentTimeMillis()) {
            jLongValue += j7;
        }
        this.f22594g = Long.valueOf(jLongValue);
    }
}
