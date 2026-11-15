package R4;

import java.lang.reflect.Field;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Field f2842a;

    public a(Field field) {
        Objects.requireNonNull(field);
        this.f2842a = field;
    }

    public String toString() {
        return this.f2842a.toString();
    }
}
