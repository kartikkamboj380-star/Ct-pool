package h4;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
class N {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f19700a;

    N() {
    }

    private static String b(Context context) {
        String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
        return installerPackageName == null ? "" : installerPackageName;
    }

    synchronized String a(Context context) {
        try {
            if (this.f19700a == null) {
                this.f19700a = b(context);
            }
        } finally {
        }
        return "".equals(this.f19700a) ? null : this.f19700a;
    }
}
