package H0;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import kotlin.jvm.internal.DefaultConstructorMarker;
import w5.k;

/* JADX INFO: loaded from: classes.dex */
public final class b implements H0.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f1345b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final File f1346a;

    public static final class a {
        private a() {
        }

        public final b a(File file) {
            k.f(file, "file");
            return new b(file, null);
        }

        public final b b(File file) {
            DefaultConstructorMarker defaultConstructorMarker = null;
            if (file != null) {
                return new b(file, defaultConstructorMarker);
            }
            return null;
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private b(File file) {
        this.f1346a = file;
    }

    public static final b b(File file) {
        return f1345b.a(file);
    }

    public static final b c(File file) {
        return f1345b.b(file);
    }

    @Override // H0.a
    public InputStream a() {
        return new FileInputStream(this.f1346a);
    }

    public final File d() {
        return this.f1346a;
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof b)) {
            return false;
        }
        return k.b(this.f1346a, ((b) obj).f1346a);
    }

    public int hashCode() {
        return this.f1346a.hashCode();
    }

    @Override // H0.a
    public long size() {
        return this.f1346a.length();
    }

    public /* synthetic */ b(File file, DefaultConstructorMarker defaultConstructorMarker) {
        this(file);
    }
}
