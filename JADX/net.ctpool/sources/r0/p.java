package r0;

import android.content.ComponentName;
import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public abstract class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f22097a = l0.i.i("PackageManagerHelper");

    public static void a(Context context, Class cls, boolean z6) {
        try {
            context.getPackageManager().setComponentEnabledSetting(new ComponentName(context, cls.getName()), z6 ? 1 : 2, 1);
            l0.i iVarE = l0.i.e();
            String str = f22097a;
            StringBuilder sb = new StringBuilder();
            sb.append(cls.getName());
            sb.append(" ");
            sb.append(z6 ? "enabled" : "disabled");
            iVarE.a(str, sb.toString());
        } catch (Exception e7) {
            l0.i iVarE2 = l0.i.e();
            String str2 = f22097a;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(cls.getName());
            sb2.append("could not be ");
            sb2.append(z6 ? "enabled" : "disabled");
            iVarE2.b(str2, sb2.toString(), e7);
        }
    }
}
