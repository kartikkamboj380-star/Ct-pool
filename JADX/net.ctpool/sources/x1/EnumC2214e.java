package x1;

import kotlin.jvm.internal.DefaultConstructorMarker;
import w5.k;

/* JADX INFO: renamed from: x1.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC2214e {
    LOW,
    MEDIUM,
    HIGH;


    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final a f22818m = new a(null);

    /* JADX INFO: renamed from: x1.e$a */
    public static final class a {
        private a() {
        }

        public final EnumC2214e a(EnumC2214e enumC2214e, EnumC2214e enumC2214e2) {
            k.f(enumC2214e, "priority1");
            k.f(enumC2214e2, "priority2");
            return enumC2214e.ordinal() > enumC2214e2.ordinal() ? enumC2214e : enumC2214e2;
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static final EnumC2214e h(EnumC2214e enumC2214e, EnumC2214e enumC2214e2) {
        return f22818m.a(enumC2214e, enumC2214e2);
    }
}
