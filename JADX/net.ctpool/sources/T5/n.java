package T5;

import com.google.android.gms.common.internal.ImagesContract;
import j5.AbstractC1809n;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes2.dex */
public interface n {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f3597b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final n f3596a = new a.C0080a();

    public static final class a {

        /* JADX INFO: renamed from: T5.n$a$a, reason: collision with other inner class name */
        private static final class C0080a implements n {
            @Override // T5.n
            public void a(u uVar, List list) {
                w5.k.f(uVar, ImagesContract.URL);
                w5.k.f(list, "cookies");
            }

            @Override // T5.n
            public List d(u uVar) {
                w5.k.f(uVar, ImagesContract.URL);
                return AbstractC1809n.i();
            }
        }

        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    void a(u uVar, List list);

    List d(u uVar);
}
