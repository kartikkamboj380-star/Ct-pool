package O2;

import android.content.Context;
import com.facebook.soloader.A;
import com.facebook.soloader.m;
import com.facebook.soloader.s;
import java.io.File;

/* JADX INFO: loaded from: classes.dex */
public class e implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f2471a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a f2472b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f2473c;

    public e(Context context, a aVar) {
        this.f2471a = context;
        this.f2472b = aVar;
        this.f2473c = aVar.c();
    }

    private boolean b() {
        String strC = c();
        return new File(strC).exists() && this.f2472b.a(strC);
    }

    private String c() {
        return this.f2471a.getApplicationInfo().sourceDir;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void d(A[] aArr) {
        for (int i7 = 0; i7 < aArr.length; i7++) {
            Object[] objArr = aArr[i7];
            if (objArr instanceof s) {
                aArr[i7] = ((s) objArr).b(this.f2471a);
            }
        }
    }

    @Override // O2.f
    public boolean a(UnsatisfiedLinkError unsatisfiedLinkError, A[] aArr) {
        if (b()) {
            d(aArr);
            return true;
        }
        if (this.f2473c == this.f2472b.c()) {
            return false;
        }
        m.g("soloader.recovery.DetectDataAppMove", "Context was updated (perhaps by another thread)");
        return true;
    }
}
