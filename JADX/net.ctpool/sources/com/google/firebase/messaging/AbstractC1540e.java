package com.google.firebase.messaging;

import android.os.Bundle;
import java.util.concurrent.TimeUnit;
import n.C1890a;

/* JADX INFO: renamed from: com.google.firebase.messaging.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1540e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final long f17628a = TimeUnit.MINUTES.toMillis(3);

    /* JADX INFO: renamed from: com.google.firebase.messaging.e$a */
    public static final class a {
        public static C1890a a(Bundle bundle) {
            C1890a c1890a = new C1890a();
            for (String str : bundle.keySet()) {
                Object obj = bundle.get(str);
                if (obj instanceof String) {
                    String str2 = (String) obj;
                    if (!str.startsWith("google.") && !str.startsWith("gcm.") && !str.equals("from") && !str.equals("message_type") && !str.equals("collapse_key")) {
                        c1890a.put(str, str2);
                    }
                }
            }
            return c1890a;
        }
    }
}
