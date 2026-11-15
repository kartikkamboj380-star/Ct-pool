package com.google.android.material.datepicker;

import java.util.Calendar;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes.dex */
class q {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final q f16885c = new q(null, null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Long f16886a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final TimeZone f16887b;

    private q(Long l7, TimeZone timeZone) {
        this.f16886a = l7;
        this.f16887b = timeZone;
    }

    static q c() {
        return f16885c;
    }

    Calendar a() {
        return b(this.f16887b);
    }

    Calendar b(TimeZone timeZone) {
        Calendar calendar = timeZone == null ? Calendar.getInstance() : Calendar.getInstance(timeZone);
        Long l7 = this.f16886a;
        if (l7 != null) {
            calendar.setTimeInMillis(l7.longValue());
        }
        return calendar;
    }
}
