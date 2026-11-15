package androidx.room;

import android.content.Context;
import androidx.room.u;

/* JADX INFO: loaded from: classes.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final t f9021a = new t();

    private t() {
    }

    public static final u.a a(Context context, Class cls, String str) {
        w5.k.f(context, "context");
        w5.k.f(cls, "klass");
        if (true ^ (str == null || F5.g.r(str))) {
            return new u.a(context, cls, str);
        }
        throw new IllegalArgumentException("Cannot build a database with null or empty name. If you are trying to create an in memory database, use Room.inMemoryDatabaseBuilder".toString());
    }

    public static final Object b(Class cls, String str) {
        String str2;
        w5.k.f(cls, "klass");
        w5.k.f(str, "suffix");
        Package r12 = cls.getPackage();
        w5.k.c(r12);
        String name = r12.getName();
        String canonicalName = cls.getCanonicalName();
        w5.k.c(canonicalName);
        w5.k.e(name, "fullPackage");
        if (name.length() != 0) {
            canonicalName = canonicalName.substring(name.length() + 1);
            w5.k.e(canonicalName, "this as java.lang.String).substring(startIndex)");
        }
        String str3 = F5.g.w(canonicalName, '.', '_', false, 4, null) + str;
        try {
            if (name.length() == 0) {
                str2 = str3;
            } else {
                str2 = name + '.' + str3;
            }
            Class<?> cls2 = Class.forName(str2, true, cls.getClassLoader());
            w5.k.d(cls2, "null cannot be cast to non-null type java.lang.Class<T of androidx.room.Room.getGeneratedImplementation>");
            return cls2.newInstance();
        } catch (ClassNotFoundException unused) {
            throw new RuntimeException("Cannot find implementation for " + cls.getCanonicalName() + ". " + str3 + " does not exist");
        } catch (IllegalAccessException unused2) {
            throw new RuntimeException("Cannot access the constructor " + cls + ".canonicalName");
        } catch (InstantiationException unused3) {
            throw new RuntimeException("Failed to create an instance of " + cls + ".canonicalName");
        }
    }

    public static final u.a c(Context context, Class cls) {
        w5.k.f(context, "context");
        w5.k.f(cls, "klass");
        return new u.a(context, cls, null);
    }
}
