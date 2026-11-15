package O2;

import com.facebook.soloader.A;
import com.facebook.soloader.C;
import com.facebook.soloader.C0921c;
import com.facebook.soloader.m;
import com.facebook.soloader.x;
import com.facebook.soloader.y;

/* JADX INFO: loaded from: classes.dex */
public class i implements f {
    @Override // O2.f
    public boolean a(UnsatisfiedLinkError unsatisfiedLinkError, A[] aArr) {
        if (!(unsatisfiedLinkError instanceof y) || (unsatisfiedLinkError instanceof x)) {
            return false;
        }
        String strA = ((y) unsatisfiedLinkError).a();
        StringBuilder sb = new StringBuilder();
        sb.append("Reunpacking NonApk UnpackingSoSources due to ");
        sb.append(unsatisfiedLinkError);
        sb.append(strA == null ? "" : ", retrying for specific library " + strA);
        m.b("SoLoader", sb.toString());
        for (A a7 : aArr) {
            if (a7 instanceof C) {
                C c7 = (C) a7;
                if (c7 instanceof C0921c) {
                    continue;
                } else {
                    try {
                        m.b("SoLoader", "Runpacking " + c7.c());
                        c7.p();
                    } catch (Exception e7) {
                        m.c("SoLoader", "Encountered an exception while reunpacking " + c7.c() + " for library " + strA + ": ", e7);
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
