package g0;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class s {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public View f19460b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f19459a = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final ArrayList f19461c = new ArrayList();

    public s(View view) {
        this.f19460b = view;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return this.f19460b == sVar.f19460b && this.f19459a.equals(sVar.f19459a);
    }

    public int hashCode() {
        return (this.f19460b.hashCode() * 31) + this.f19459a.hashCode();
    }

    public String toString() {
        String str = (("TransitionValues@" + Integer.toHexString(hashCode()) + ":\n") + "    view = " + this.f19460b + "\n") + "    values:";
        for (String str2 : this.f19459a.keySet()) {
            str = str + "    " + str2 + ": " + this.f19459a.get(str2) + "\n";
        }
        return str;
    }
}
