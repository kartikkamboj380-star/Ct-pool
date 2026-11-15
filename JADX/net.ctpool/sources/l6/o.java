package l6;

import java.lang.reflect.Method;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: loaded from: classes2.dex */
public class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Method f21182a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final ThreadMode f21183b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final Class f21184c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final int f21185d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final boolean f21186e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    String f21187f;

    public o(Method method, Class cls, ThreadMode threadMode, int i7, boolean z6) {
        this.f21182a = method;
        this.f21183b = threadMode;
        this.f21184c = cls;
        this.f21185d = i7;
        this.f21186e = z6;
    }

    private synchronized void a() {
        if (this.f21187f == null) {
            StringBuilder sb = new StringBuilder(64);
            sb.append(this.f21182a.getDeclaringClass().getName());
            sb.append('#');
            sb.append(this.f21182a.getName());
            sb.append('(');
            sb.append(this.f21184c.getName());
            this.f21187f = sb.toString();
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        a();
        o oVar = (o) obj;
        oVar.a();
        return this.f21187f.equals(oVar.f21187f);
    }

    public int hashCode() {
        return this.f21182a.hashCode();
    }
}
