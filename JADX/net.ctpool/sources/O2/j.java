package O2;

import com.facebook.soloader.A;
import com.facebook.soloader.InterfaceC0920b;
import com.facebook.soloader.k;
import com.facebook.soloader.m;
import com.facebook.soloader.y;

/* JADX INFO: loaded from: classes.dex */
public class j implements f {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // O2.f
    public boolean a(UnsatisfiedLinkError unsatisfiedLinkError, A[] aArr) {
        String strA = unsatisfiedLinkError instanceof y ? ((y) unsatisfiedLinkError).a() : null;
        StringBuilder sb = new StringBuilder();
        sb.append("Waiting on SoSources due to ");
        sb.append(unsatisfiedLinkError);
        sb.append(strA == null ? "" : ", retrying for specific library " + strA);
        m.b("SoLoader", sb.toString());
        for (k kVar : aArr) {
            if (kVar instanceof InterfaceC0920b) {
                m.b("SoLoader", "Waiting on SoSource " + kVar.c());
                kVar.a();
            }
        }
        return true;
    }
}
