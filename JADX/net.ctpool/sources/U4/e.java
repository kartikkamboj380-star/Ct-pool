package U4;

import R4.q;
import R4.r;
import com.google.gson.reflect.TypeToken;

/* JADX INFO: loaded from: classes.dex */
public final class e implements r {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final T4.c f3866m;

    public e(T4.c cVar) {
        this.f3866m = cVar;
    }

    @Override // R4.r
    public q a(R4.d dVar, TypeToken typeToken) {
        S4.b bVar = (S4.b) typeToken.getRawType().getAnnotation(S4.b.class);
        if (bVar == null) {
            return null;
        }
        return b(this.f3866m, dVar, typeToken, bVar);
    }

    q b(T4.c cVar, R4.d dVar, TypeToken typeToken, S4.b bVar) {
        q qVarA;
        Object objA = cVar.b(TypeToken.get(bVar.value())).a();
        boolean zNullSafe = bVar.nullSafe();
        if (objA instanceof q) {
            qVarA = (q) objA;
        } else {
            if (!(objA instanceof r)) {
                throw new IllegalArgumentException("Invalid attempt to bind an instance of " + objA.getClass().getName() + " as a @JsonAdapter for " + typeToken.toString() + ". @JsonAdapter value must be a TypeAdapter, TypeAdapterFactory, JsonSerializer or JsonDeserializer.");
            }
            qVarA = ((r) objA).a(dVar, typeToken);
        }
        return (qVarA == null || !zNullSafe) ? qVarA : qVarA.a();
    }
}
