package p1;

import android.util.Log;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p1.b;

/* JADX INFO: loaded from: classes.dex */
public class d extends C1961a {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final a f21542o = new a(null);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final List f21543n = new ArrayList(2);

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // p1.C1961a, p1.b
    public void a(String str, Object obj) {
        w5.k.f(str, "id");
        int size = this.f21543n.size();
        for (int i7 = 0; i7 < size; i7++) {
            try {
                try {
                    ((b) this.f21543n.get(i7)).a(str, obj);
                } catch (Exception e7) {
                    Log.e("FwdControllerListener2", "InternalListener exception in onIntermediateImageSet", e7);
                }
            } catch (IndexOutOfBoundsException unused) {
                return;
            }
        }
    }

    @Override // p1.C1961a, p1.b
    public void e(String str, Object obj, b.a aVar) {
        w5.k.f(str, "id");
        int size = this.f21543n.size();
        for (int i7 = 0; i7 < size; i7++) {
            try {
                try {
                    ((b) this.f21543n.get(i7)).e(str, obj, aVar);
                } catch (Exception e7) {
                    Log.e("FwdControllerListener2", "InternalListener exception in onSubmit", e7);
                }
            } catch (IndexOutOfBoundsException unused) {
                return;
            }
        }
    }

    @Override // p1.C1961a, p1.b
    public void f(String str, b.a aVar) {
        w5.k.f(str, "id");
        int size = this.f21543n.size();
        for (int i7 = 0; i7 < size; i7++) {
            try {
                try {
                    ((b) this.f21543n.get(i7)).f(str, aVar);
                } catch (Exception e7) {
                    Log.e("FwdControllerListener2", "InternalListener exception in onRelease", e7);
                }
            } catch (IndexOutOfBoundsException unused) {
                return;
            }
        }
    }

    @Override // p1.C1961a, p1.b
    public void g(String str, Throwable th, b.a aVar) {
        w5.k.f(str, "id");
        int size = this.f21543n.size();
        for (int i7 = 0; i7 < size; i7++) {
            try {
                try {
                    ((b) this.f21543n.get(i7)).g(str, th, aVar);
                } catch (Exception e7) {
                    Log.e("FwdControllerListener2", "InternalListener exception in onFailure", e7);
                }
            } catch (IndexOutOfBoundsException unused) {
                return;
            }
        }
    }

    @Override // p1.C1961a, p1.b
    public void j(String str, Object obj, b.a aVar) {
        w5.k.f(str, "id");
        int size = this.f21543n.size();
        for (int i7 = 0; i7 < size; i7++) {
            try {
                try {
                    ((b) this.f21543n.get(i7)).j(str, obj, aVar);
                } catch (Exception e7) {
                    Log.e("FwdControllerListener2", "InternalListener exception in onFinalImageSet", e7);
                }
            } catch (IndexOutOfBoundsException unused) {
                return;
            }
        }
    }

    @Override // p1.C1961a, p1.b
    public void l(String str) {
        w5.k.f(str, "id");
        int size = this.f21543n.size();
        for (int i7 = 0; i7 < size; i7++) {
            try {
                try {
                    ((b) this.f21543n.get(i7)).l(str);
                } catch (Exception e7) {
                    Log.e("FwdControllerListener2", "InternalListener exception in onIntermediateImageFailed", e7);
                }
            } catch (IndexOutOfBoundsException unused) {
                return;
            }
        }
    }

    public final synchronized void n(b bVar) {
        w5.k.f(bVar, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.f21543n.add(bVar);
    }

    public final synchronized void o(b bVar) {
        w5.k.f(bVar, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.f21543n.remove(bVar);
    }
}
