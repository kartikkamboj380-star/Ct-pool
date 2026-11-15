package o5;

import m5.InterfaceC1885d;
import m5.InterfaceC1886e;
import m5.InterfaceC1888g;

/* JADX INFO: renamed from: o5.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC1949d extends AbstractC1946a {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final InterfaceC1888g f21488n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private transient InterfaceC1885d f21489o;

    public AbstractC1949d(InterfaceC1885d interfaceC1885d) {
        this(interfaceC1885d, interfaceC1885d != null ? interfaceC1885d.a() : null);
    }

    @Override // m5.InterfaceC1885d
    public InterfaceC1888g a() {
        InterfaceC1888g interfaceC1888g = this.f21488n;
        w5.k.c(interfaceC1888g);
        return interfaceC1888g;
    }

    @Override // o5.AbstractC1946a
    protected void t() {
        InterfaceC1885d interfaceC1885d = this.f21489o;
        if (interfaceC1885d != null && interfaceC1885d != this) {
            InterfaceC1888g.b bVarB = a().b(InterfaceC1886e.f21264l);
            w5.k.c(bVarB);
            ((InterfaceC1886e) bVarB).z(interfaceC1885d);
        }
        this.f21489o = C1948c.f21487m;
    }

    public final InterfaceC1885d u() {
        InterfaceC1885d interfaceC1885dJ = this.f21489o;
        if (interfaceC1885dJ == null) {
            InterfaceC1886e interfaceC1886e = (InterfaceC1886e) a().b(InterfaceC1886e.f21264l);
            if (interfaceC1886e == null || (interfaceC1885dJ = interfaceC1886e.J(this)) == null) {
                interfaceC1885dJ = this;
            }
            this.f21489o = interfaceC1885dJ;
        }
        return interfaceC1885dJ;
    }

    public AbstractC1949d(InterfaceC1885d interfaceC1885d, InterfaceC1888g interfaceC1888g) {
        super(interfaceC1885d);
        this.f21488n = interfaceC1888g;
    }
}
