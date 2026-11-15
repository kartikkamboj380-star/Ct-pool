package o0;

import kotlin.jvm.internal.DefaultConstructorMarker;
import l0.i;
import l0.j;
import n0.C1892b;
import q0.u;
import w5.k;

/* JADX INFO: renamed from: o0.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1937f extends AbstractC1934c {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f21454f = new a(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final String f21455g;

    /* JADX INFO: renamed from: o0.f$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        String strI = i.i("NetworkNotRoamingCtrlr");
        k.e(strI, "tagWithPrefix(\"NetworkNotRoamingCtrlr\")");
        f21455g = strI;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1937f(p0.h hVar) {
        super(hVar);
        k.f(hVar, "tracker");
    }

    @Override // o0.AbstractC1934c
    public boolean b(u uVar) {
        k.f(uVar, "workSpec");
        return uVar.f21804j.d() == j.NOT_ROAMING;
    }

    @Override // o0.AbstractC1934c
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public boolean c(C1892b c1892b) {
        k.f(c1892b, "value");
        return (c1892b.a() && c1892b.c()) ? false : true;
    }
}
