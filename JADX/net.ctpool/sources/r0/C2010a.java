package r0;

import android.app.Application;

/* JADX INFO: renamed from: r0.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class C2010a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C2010a f22080a = new C2010a();

    private C2010a() {
    }

    public final String a() {
        String processName = Application.getProcessName();
        w5.k.e(processName, "getProcessName()");
        return processName;
    }
}
