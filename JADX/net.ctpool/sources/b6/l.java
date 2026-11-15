package b6;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes2.dex */
public interface l {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f9954b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final l f9953a = new a.C0189a();

    public static final class a {

        /* JADX INFO: renamed from: b6.l$a$a, reason: collision with other inner class name */
        private static final class C0189a implements l {
            @Override // b6.l
            public void a(int i7, b bVar) {
                w5.k.f(bVar, "errorCode");
            }

            @Override // b6.l
            public boolean b(int i7, i6.h hVar, int i8, boolean z6) {
                w5.k.f(hVar, "source");
                hVar.y0(i8);
                return true;
            }

            @Override // b6.l
            public boolean c(int i7, List list) {
                w5.k.f(list, "requestHeaders");
                return true;
            }

            @Override // b6.l
            public boolean d(int i7, List list, boolean z6) {
                w5.k.f(list, "responseHeaders");
                return true;
            }
        }

        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    void a(int i7, b bVar);

    boolean b(int i7, i6.h hVar, int i8, boolean z6);

    boolean c(int i7, List list);

    boolean d(int i7, List list, boolean z6);
}
