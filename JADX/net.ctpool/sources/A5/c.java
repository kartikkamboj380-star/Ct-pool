package A5;

import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import q5.AbstractC2002b;

/* JADX INFO: loaded from: classes2.dex */
public abstract class c {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final a f655m = new a(null);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final c f656n = AbstractC2002b.f21893a.b();

    public static final class a extends c implements Serializable {
        private a() {
        }

        @Override // A5.c
        public int b() {
            return c.f656n.b();
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public abstract int b();
}
