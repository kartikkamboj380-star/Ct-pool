package U4;

import R4.q;
import U4.j;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;

/* JADX INFO: loaded from: classes.dex */
final class l extends q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final R4.d f3912a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final q f3913b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Type f3914c;

    l(R4.d dVar, q qVar, Type type) {
        this.f3912a = dVar;
        this.f3913b = qVar;
        this.f3914c = type;
    }

    private static Type e(Type type, Object obj) {
        return obj != null ? ((type instanceof Class) || (type instanceof TypeVariable)) ? obj.getClass() : type : type;
    }

    private static boolean f(q qVar) {
        q qVarE;
        while ((qVar instanceof k) && (qVarE = ((k) qVar).e()) != qVar) {
            qVar = qVarE;
        }
        return qVar instanceof j.b;
    }

    @Override // R4.q
    public Object b(Y4.a aVar) {
        return this.f3913b.b(aVar);
    }

    @Override // R4.q
    public void d(Y4.c cVar, Object obj) {
        q qVarK = this.f3913b;
        Type typeE = e(this.f3914c, obj);
        if (typeE != this.f3914c) {
            qVarK = this.f3912a.k(TypeToken.get(typeE));
            if ((qVarK instanceof j.b) && !f(this.f3913b)) {
                qVarK = this.f3913b;
            }
        }
        qVarK.d(cVar, obj);
    }
}
