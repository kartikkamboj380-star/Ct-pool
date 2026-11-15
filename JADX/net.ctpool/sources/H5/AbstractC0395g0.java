package H5;

import java.io.Closeable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m5.AbstractC1883b;
import m5.InterfaceC1888g;

/* JADX INFO: renamed from: H5.g0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC0395g0 extends F implements Closeable {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final a f1426o = new a(null);

    /* JADX INFO: renamed from: H5.g0$a */
    public static final class a extends AbstractC1883b {

        /* JADX INFO: renamed from: H5.g0$a$a, reason: collision with other inner class name */
        static final class C0025a extends w5.l implements v5.l {

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            public static final C0025a f1427m = new C0025a();

            C0025a() {
                super(1);
            }

            @Override // v5.l
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final AbstractC0395g0 i(InterfaceC1888g.b bVar) {
                if (bVar instanceof AbstractC0395g0) {
                    return (AbstractC0395g0) bVar;
                }
                return null;
            }
        }

        private a() {
            super(F.f1384n, C0025a.f1427m);
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
