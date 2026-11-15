package X4;

import R4.r;
import java.sql.Date;
import java.sql.Timestamp;

/* JADX INFO: loaded from: classes.dex */
public abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final boolean f4348a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final U4.d f4349b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final U4.d f4350c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final r f4351d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final r f4352e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final r f4353f;

    class a extends U4.d {
        a(Class cls) {
            super(cls);
        }
    }

    class b extends U4.d {
        b(Class cls) {
            super(cls);
        }
    }

    static {
        boolean z6;
        r rVar;
        try {
            Class.forName("java.sql.Date");
            z6 = true;
        } catch (ClassNotFoundException unused) {
            z6 = false;
        }
        f4348a = z6;
        if (z6) {
            f4349b = new a(Date.class);
            f4350c = new b(Timestamp.class);
            f4351d = X4.a.f4342b;
            f4352e = X4.b.f4344b;
            rVar = c.f4346b;
        } else {
            rVar = null;
            f4349b = null;
            f4350c = null;
            f4351d = null;
            f4352e = null;
        }
        f4353f = rVar;
    }
}
