package s0;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
import r0.t;

/* JADX INFO: renamed from: s0.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C2035c implements InterfaceC2034b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final t f22215a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final Handler f22216b = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Executor f22217c = new a();

    /* JADX INFO: renamed from: s0.c$a */
    class a implements Executor {
        a() {
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            C2035c.this.f22216b.post(runnable);
        }
    }

    public C2035c(Executor executor) {
        this.f22215a = new t(executor);
    }

    @Override // s0.InterfaceC2034b
    public Executor a() {
        return this.f22217c;
    }

    @Override // s0.InterfaceC2034b
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public t b() {
        return this.f22215a;
    }
}
