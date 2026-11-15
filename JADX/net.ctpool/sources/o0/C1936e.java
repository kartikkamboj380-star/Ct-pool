package o0;

import android.os.Build;
import kotlin.jvm.internal.DefaultConstructorMarker;
import l0.i;
import l0.j;
import n0.C1892b;
import q0.u;
import w5.k;

/* JADX INFO: renamed from: o0.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1936e extends AbstractC1934c {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f21452f = new a(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final String f21453g;

    /* JADX INFO: renamed from: o0.e$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        String strI = i.i("NetworkMeteredCtrlr");
        k.e(strI, "tagWithPrefix(\"NetworkMeteredCtrlr\")");
        f21453g = strI;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1936e(p0.h hVar) {
        super(hVar);
        k.f(hVar, "tracker");
    }

    @Override // o0.AbstractC1934c
    public boolean b(u uVar) {
        k.f(uVar, "workSpec");
        return uVar.f21804j.d() == j.METERED;
    }

    @Override // o0.AbstractC1934c
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public boolean c(C1892b c1892b) {
        k.f(c1892b, "value");
        if (Build.VERSION.SDK_INT < 26) {
            i.e().a(f21453g, "Metered network constraint is not supported before API 26, only checking for connected state.");
            if (c1892b.a()) {
                return false;
            }
        } else if (c1892b.a() && c1892b.b()) {
            return false;
        }
        return true;
    }
}
