package O2;

import com.facebook.soloader.A;
import com.facebook.soloader.C0921c;
import com.facebook.soloader.m;
import com.facebook.soloader.x;
import com.facebook.soloader.y;

/* JADX INFO: loaded from: classes.dex */
public class h implements f {
    @Override // O2.f
    public boolean a(UnsatisfiedLinkError unsatisfiedLinkError, A[] aArr) {
        y yVar;
        String message;
        if (!(unsatisfiedLinkError instanceof y) || (unsatisfiedLinkError instanceof x) || (message = (yVar = (y) unsatisfiedLinkError).getMessage()) == null || (!message.contains("/app/") && !message.contains("/mnt/"))) {
            return false;
        }
        String strA = yVar.a();
        StringBuilder sb = new StringBuilder();
        sb.append("Reunpacking BackupSoSources due to ");
        sb.append(unsatisfiedLinkError);
        sb.append(strA == null ? "" : ", retrying for specific library " + strA);
        m.b("SoLoader", sb.toString());
        for (A a7 : aArr) {
            if (a7 instanceof C0921c) {
                C0921c c0921c = (C0921c) a7;
                try {
                    m.b("SoLoader", "Runpacking BackupSoSource " + c0921c.c());
                    c0921c.p();
                } catch (Exception e7) {
                    m.c("SoLoader", "Encountered an exception while reunpacking BackupSoSource " + c0921c.c() + " for library " + strA + ": ", e7);
                    return false;
                }
            }
        }
        return true;
    }
}
