package i5;

import kotlin.Lazy;
import kotlin.jvm.internal.DefaultConstructorMarker;
import v5.InterfaceC2171a;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes.dex */
public abstract class h {

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f19965a;

        static {
            int[] iArr = new int[j.values().length];
            try {
                iArr[j.f19966m.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[j.f19967n.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[j.f19968o.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f19965a = iArr;
        }
    }

    public static Lazy a(j jVar, InterfaceC2171a interfaceC2171a) {
        w5.k.f(jVar, "mode");
        w5.k.f(interfaceC2171a, "initializer");
        int i7 = a.f19965a[jVar.ordinal()];
        int i8 = 2;
        if (i7 == 1) {
            DefaultConstructorMarker defaultConstructorMarker = null;
            return new p(interfaceC2171a, defaultConstructorMarker, i8, defaultConstructorMarker);
        }
        if (i7 == 2) {
            return new o(interfaceC2171a);
        }
        if (i7 == 3) {
            return new v(interfaceC2171a);
        }
        throw new k();
    }

    public static Lazy b(InterfaceC2171a interfaceC2171a) {
        w5.k.f(interfaceC2171a, "initializer");
        DefaultConstructorMarker defaultConstructorMarker = null;
        return new p(interfaceC2171a, defaultConstructorMarker, 2, defaultConstructorMarker);
    }
}
