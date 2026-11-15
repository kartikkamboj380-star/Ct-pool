package C;

import androidx.appcompat.app.y;
import i5.AbstractC1744a;
import i5.u;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m5.InterfaceC1885d;
import n5.AbstractC1930b;
import o5.AbstractC1949d;
import o5.AbstractC1956k;
import v5.p;
import w5.v;

/* JADX INFO: loaded from: classes.dex */
public abstract class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f772a = new a(null);

    public static final class a {

        /* JADX INFO: renamed from: C.e$a$a, reason: collision with other inner class name */
        static final class C0006a extends AbstractC1956k implements p {

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            int f773q;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            /* synthetic */ Object f774r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            final /* synthetic */ List f775s;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0006a(List list, InterfaceC1885d interfaceC1885d) {
                super(2, interfaceC1885d);
                this.f775s = list;
            }

            @Override // o5.AbstractC1946a
            public final InterfaceC1885d d(Object obj, InterfaceC1885d interfaceC1885d) {
                C0006a c0006a = new C0006a(this.f775s, interfaceC1885d);
                c0006a.f774r = obj;
                return c0006a;
            }

            @Override // o5.AbstractC1946a
            public final Object s(Object obj) {
                Object objC = AbstractC1930b.c();
                int i7 = this.f773q;
                if (i7 == 0) {
                    i5.n.b(obj);
                    i iVar = (i) this.f774r;
                    a aVar = e.f772a;
                    List list = this.f775s;
                    this.f773q = 1;
                    if (aVar.c(list, iVar, this) == objC) {
                        return objC;
                    }
                } else {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    i5.n.b(obj);
                }
                return u.f19985a;
            }

            @Override // v5.p
            /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
            public final Object m(i iVar, InterfaceC1885d interfaceC1885d) {
                return ((C0006a) d(iVar, interfaceC1885d)).s(u.f19985a);
            }
        }

        static final class b extends AbstractC1949d {

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            Object f776p;

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            Object f777q;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            /* synthetic */ Object f778r;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            int f780t;

            b(InterfaceC1885d interfaceC1885d) {
                super(interfaceC1885d);
            }

            @Override // o5.AbstractC1946a
            public final Object s(Object obj) {
                this.f778r = obj;
                this.f780t |= Integer.MIN_VALUE;
                return a.this.c(null, null, this);
            }
        }

        static final class c extends AbstractC1956k implements p {

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            Object f781q;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            Object f782r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            Object f783s;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            int f784t;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            /* synthetic */ Object f785u;

            /* JADX INFO: renamed from: v, reason: collision with root package name */
            final /* synthetic */ List f786v;

            /* JADX INFO: renamed from: w, reason: collision with root package name */
            final /* synthetic */ List f787w;

            /* JADX INFO: renamed from: C.e$a$c$a, reason: collision with other inner class name */
            static final class C0007a extends AbstractC1956k implements v5.l {

                /* JADX INFO: renamed from: q, reason: collision with root package name */
                int f788q;

                C0007a(d dVar, InterfaceC1885d interfaceC1885d) {
                    super(1, interfaceC1885d);
                }

                @Override // o5.AbstractC1946a
                public final Object s(Object obj) {
                    AbstractC1930b.c();
                    int i7 = this.f788q;
                    if (i7 == 0) {
                        i5.n.b(obj);
                        this.f788q = 1;
                        throw null;
                    }
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    i5.n.b(obj);
                    return u.f19985a;
                }

                public final InterfaceC1885d v(InterfaceC1885d interfaceC1885d) {
                    return new C0007a(null, interfaceC1885d);
                }

                @Override // v5.l
                /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
                public final Object i(InterfaceC1885d interfaceC1885d) {
                    return ((C0007a) v(interfaceC1885d)).s(u.f19985a);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(List list, List list2, InterfaceC1885d interfaceC1885d) {
                super(2, interfaceC1885d);
                this.f786v = list;
                this.f787w = list2;
            }

            @Override // o5.AbstractC1946a
            public final InterfaceC1885d d(Object obj, InterfaceC1885d interfaceC1885d) {
                c cVar = new c(this.f786v, this.f787w, interfaceC1885d);
                cVar.f785u = obj;
                return cVar;
            }

            @Override // o5.AbstractC1946a
            public final Object s(Object obj) {
                List list;
                Iterator it;
                AbstractC1930b.c();
                int i7 = this.f784t;
                if (i7 == 0) {
                    i5.n.b(obj);
                    obj = this.f785u;
                    List list2 = this.f786v;
                    list = this.f787w;
                    it = list2.iterator();
                } else if (i7 == 1) {
                    Object obj2 = this.f783s;
                    y.a(this.f782r);
                    Iterator it2 = (Iterator) this.f781q;
                    List list3 = (List) this.f785u;
                    i5.n.b(obj);
                    if (((Boolean) obj).booleanValue()) {
                        list3.add(new C0007a(null, null));
                        this.f785u = list3;
                        this.f781q = it2;
                        this.f782r = null;
                        this.f783s = null;
                        this.f784t = 2;
                        throw null;
                    }
                    obj = obj2;
                    it = it2;
                    list = list3;
                } else {
                    if (i7 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    it = (Iterator) this.f781q;
                    list = (List) this.f785u;
                    i5.n.b(obj);
                }
                if (!it.hasNext()) {
                    return obj;
                }
                y.a(it.next());
                this.f785u = list;
                this.f781q = it;
                this.f782r = null;
                this.f783s = obj;
                this.f784t = 1;
                throw null;
            }

            @Override // v5.p
            /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
            public final Object m(Object obj, InterfaceC1885d interfaceC1885d) {
                return ((c) d(obj, interfaceC1885d)).s(u.f19985a);
            }
        }

        private a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Removed duplicated region for block: B:27:0x0071  */
        /* JADX WARN: Removed duplicated region for block: B:37:0x009c  */
        /* JADX WARN: Removed duplicated region for block: B:39:0x009f  */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x0088 -> B:25:0x006b). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x008b -> B:25:0x006b). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object c(List list, i iVar, InterfaceC1885d interfaceC1885d) throws Throwable {
            b bVar;
            List list2;
            v vVar;
            Iterator it;
            Throwable th;
            if (interfaceC1885d instanceof b) {
                bVar = (b) interfaceC1885d;
                int i7 = bVar.f780t;
                if ((i7 & Integer.MIN_VALUE) != 0) {
                    bVar.f780t = i7 - Integer.MIN_VALUE;
                } else {
                    bVar = new b(interfaceC1885d);
                }
            }
            Object obj = bVar.f778r;
            Object objC = AbstractC1930b.c();
            int i8 = bVar.f780t;
            if (i8 == 0) {
                i5.n.b(obj);
                ArrayList arrayList = new ArrayList();
                p cVar = new c(list, arrayList, null);
                bVar.f776p = arrayList;
                bVar.f780t = 1;
                if (iVar.a(cVar, bVar) == objC) {
                    return objC;
                }
                list2 = arrayList;
            } else {
                if (i8 != 1) {
                    if (i8 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    it = (Iterator) bVar.f777q;
                    vVar = (v) bVar.f776p;
                    try {
                        i5.n.b(obj);
                    } catch (Throwable th2) {
                        Object obj2 = vVar.f22740m;
                        if (obj2 == null) {
                            vVar.f22740m = th2;
                        } else {
                            w5.k.c(obj2);
                            AbstractC1744a.a((Throwable) vVar.f22740m, th2);
                        }
                    }
                    while (it.hasNext()) {
                        v5.l lVar = (v5.l) it.next();
                        bVar.f776p = vVar;
                        bVar.f777q = it;
                        bVar.f780t = 2;
                        if (lVar.i(bVar) == objC) {
                            return objC;
                        }
                    }
                    th = (Throwable) vVar.f22740m;
                    if (th != null) {
                        return u.f19985a;
                    }
                    throw th;
                }
                list2 = (List) bVar.f776p;
                i5.n.b(obj);
            }
            vVar = new v();
            it = list2.iterator();
            while (it.hasNext()) {
            }
            th = (Throwable) vVar.f22740m;
            if (th != null) {
            }
        }

        public final p b(List list) {
            w5.k.f(list, "migrations");
            return new C0006a(list, null);
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
