package U4;

import R4.q;
import R4.r;
import com.google.gson.reflect.TypeToken;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class a extends q {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final r f3856c = new C0086a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Class f3857a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final q f3858b;

    /* JADX INFO: renamed from: U4.a$a, reason: collision with other inner class name */
    class C0086a implements r {
        C0086a() {
        }

        @Override // R4.r
        public q a(R4.d dVar, TypeToken typeToken) {
            Type type = typeToken.getType();
            if (!(type instanceof GenericArrayType) && (!(type instanceof Class) || !((Class) type).isArray())) {
                return null;
            }
            Type typeG = T4.b.g(type);
            return new a(dVar, dVar.k(TypeToken.get(typeG)), T4.b.k(typeG));
        }
    }

    public a(R4.d dVar, q qVar, Class cls) {
        this.f3858b = new l(dVar, qVar, cls);
        this.f3857a = cls;
    }

    @Override // R4.q
    public Object b(Y4.a aVar) throws IOException {
        if (aVar.R0() == Y4.b.NULL) {
            aVar.B0();
            return null;
        }
        ArrayList arrayList = new ArrayList();
        aVar.a();
        while (aVar.w()) {
            arrayList.add(this.f3858b.b(aVar));
        }
        aVar.g();
        int size = arrayList.size();
        if (!this.f3857a.isPrimitive()) {
            return arrayList.toArray((Object[]) Array.newInstance((Class<?>) this.f3857a, size));
        }
        Object objNewInstance = Array.newInstance((Class<?>) this.f3857a, size);
        for (int i7 = 0; i7 < size; i7++) {
            Array.set(objNewInstance, i7, arrayList.get(i7));
        }
        return objNewInstance;
    }

    @Override // R4.q
    public void d(Y4.c cVar, Object obj) throws IOException {
        if (obj == null) {
            cVar.J();
            return;
        }
        cVar.d();
        int length = Array.getLength(obj);
        for (int i7 = 0; i7 < length; i7++) {
            this.f3858b.d(cVar, Array.get(obj, i7));
        }
        cVar.g();
    }
}
