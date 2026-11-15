package U4;

import R4.q;
import R4.r;
import com.google.gson.reflect.TypeToken;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class g implements r {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final T4.c f3872m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    final boolean f3873n;

    private final class a extends q {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final q f3874a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final q f3875b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final T4.i f3876c;

        public a(R4.d dVar, Type type, q qVar, Type type2, q qVar2, T4.i iVar) {
            this.f3874a = new l(dVar, qVar, type);
            this.f3875b = new l(dVar, qVar2, type2);
            this.f3876c = iVar;
        }

        private String e(R4.f fVar) {
            if (!fVar.n()) {
                if (fVar.k()) {
                    return "null";
                }
                throw new AssertionError();
            }
            R4.k kVarH = fVar.h();
            if (kVarH.t()) {
                return String.valueOf(kVarH.p());
            }
            if (kVarH.r()) {
                return Boolean.toString(kVarH.o());
            }
            if (kVarH.u()) {
                return kVarH.q();
            }
            throw new AssertionError();
        }

        @Override // R4.q
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public Map b(Y4.a aVar) throws IOException {
            Y4.b bVarR0 = aVar.R0();
            if (bVarR0 == Y4.b.NULL) {
                aVar.B0();
                return null;
            }
            Map map = (Map) this.f3876c.a();
            if (bVarR0 == Y4.b.BEGIN_ARRAY) {
                aVar.a();
                while (aVar.w()) {
                    aVar.a();
                    Object objB = this.f3874a.b(aVar);
                    if (map.put(objB, this.f3875b.b(aVar)) != null) {
                        throw new R4.l("duplicate key: " + objB);
                    }
                    aVar.g();
                }
                aVar.g();
            } else {
                aVar.b();
                while (aVar.w()) {
                    T4.f.f3245a.a(aVar);
                    Object objB2 = this.f3874a.b(aVar);
                    if (map.put(objB2, this.f3875b.b(aVar)) != null) {
                        throw new R4.l("duplicate key: " + objB2);
                    }
                }
                aVar.j();
            }
            return map;
        }

        @Override // R4.q
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public void d(Y4.c cVar, Map map) throws IOException {
            if (map == null) {
                cVar.J();
                return;
            }
            if (!g.this.f3873n) {
                cVar.e();
                for (Map.Entry entry : map.entrySet()) {
                    cVar.z(String.valueOf(entry.getKey()));
                    this.f3875b.d(cVar, entry.getValue());
                }
                cVar.j();
                return;
            }
            ArrayList arrayList = new ArrayList(map.size());
            ArrayList arrayList2 = new ArrayList(map.size());
            int i7 = 0;
            boolean z6 = false;
            for (Map.Entry entry2 : map.entrySet()) {
                R4.f fVarC = this.f3874a.c(entry2.getKey());
                arrayList.add(fVarC);
                arrayList2.add(entry2.getValue());
                z6 |= fVarC.i() || fVarC.m();
            }
            if (!z6) {
                cVar.e();
                int size = arrayList.size();
                while (i7 < size) {
                    cVar.z(e((R4.f) arrayList.get(i7)));
                    this.f3875b.d(cVar, arrayList2.get(i7));
                    i7++;
                }
                cVar.j();
                return;
            }
            cVar.d();
            int size2 = arrayList.size();
            while (i7 < size2) {
                cVar.d();
                T4.m.a((R4.f) arrayList.get(i7), cVar);
                this.f3875b.d(cVar, arrayList2.get(i7));
                cVar.g();
                i7++;
            }
            cVar.g();
        }
    }

    public g(T4.c cVar, boolean z6) {
        this.f3872m = cVar;
        this.f3873n = z6;
    }

    private q b(R4.d dVar, Type type) {
        return (type == Boolean.TYPE || type == Boolean.class) ? m.f3944f : dVar.k(TypeToken.get(type));
    }

    @Override // R4.r
    public q a(R4.d dVar, TypeToken typeToken) {
        Type type = typeToken.getType();
        Class rawType = typeToken.getRawType();
        if (!Map.class.isAssignableFrom(rawType)) {
            return null;
        }
        Type[] typeArrJ = T4.b.j(type, rawType);
        return new a(dVar, typeArrJ[0], b(dVar, typeArrJ[0]), typeArrJ[1], dVar.k(TypeToken.get(typeArrJ[1])), this.f3872m.b(typeToken));
    }
}
