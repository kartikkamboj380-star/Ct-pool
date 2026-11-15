package e4;

import android.content.Context;
import h4.AbstractC1721j;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: e4.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1628f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f19203a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private b f19204b = null;

    /* JADX INFO: renamed from: e4.f$b */
    private class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f19205a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f19206b;

        private b() {
            int iP = AbstractC1721j.p(C1628f.this.f19203a, "com.google.firebase.crashlytics.unity_version", "string");
            if (iP == 0) {
                if (!C1628f.this.c("flutter_assets/NOTICES.Z")) {
                    this.f19205a = null;
                    this.f19206b = null;
                    return;
                } else {
                    this.f19205a = "Flutter";
                    this.f19206b = null;
                    C1629g.f().i("Development platform is: Flutter");
                    return;
                }
            }
            this.f19205a = "Unity";
            String string = C1628f.this.f19203a.getResources().getString(iP);
            this.f19206b = string;
            C1629g.f().i("Unity Editor version is: " + string);
        }
    }

    public C1628f(Context context) {
        this.f19203a = context;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean c(String str) {
        if (this.f19203a.getAssets() == null) {
            return false;
        }
        try {
            InputStream inputStreamOpen = this.f19203a.getAssets().open(str);
            if (inputStreamOpen == null) {
                return true;
            }
            inputStreamOpen.close();
            return true;
        } catch (IOException unused) {
            return false;
        }
    }

    private b f() {
        if (this.f19204b == null) {
            this.f19204b = new b();
        }
        return this.f19204b;
    }

    public static boolean g(Context context) {
        return AbstractC1721j.p(context, "com.google.firebase.crashlytics.unity_version", "string") != 0;
    }

    public String d() {
        return f().f19205a;
    }

    public String e() {
        return f().f19206b;
    }
}
