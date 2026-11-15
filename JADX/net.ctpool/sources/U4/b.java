package U4;

import R4.q;
import R4.r;
import com.google.gson.reflect.TypeToken;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class b implements r {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final T4.c f3859m;

    private static final class a extends q {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final q f3860a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final T4.i f3861b;

        public a(R4.d dVar, Type type, q qVar, T4.i iVar) {
            this.f3860a = new l(dVar, qVar, type);
            this.f3861b = iVar;
        }

        @Override // R4.q
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public Collection b(Y4.a aVar) throws IOException {
            if (aVar.R0() == Y4.b.NULL) {
                aVar.B0();
                return null;
            }
            Collection collection = (Collection) this.f3861b.a();
            aVar.a();
            while (aVar.w()) {
                collection.add(this.f3860a.b(aVar));
            }
            aVar.g();
            return collection;
        }

        @Override // R4.q
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(Y4.c cVar, Collection collection) throws IOException {
            if (collection == null) {
                cVar.J();
                return;
            }
            cVar.d();
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                this.f3860a.d(cVar, it.next());
            }
            cVar.g();
        }
    }

    public b(T4.c cVar) {
        this.f3859m = cVar;
    }

    @Override // R4.r
    public q a(R4.d dVar, TypeToken typeToken) {
        Type type = typeToken.getType();
        Class rawType = typeToken.getRawType();
        if (!Collection.class.isAssignableFrom(rawType)) {
            return null;
        }
        Type typeH = T4.b.h(type, rawType);
        return new a(dVar, typeH, dVar.k(TypeToken.get(typeH)), this.f3859m.b(typeToken));
    }
}
