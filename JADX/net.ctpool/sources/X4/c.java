package X4;

import R4.q;
import R4.r;
import com.google.gson.reflect.TypeToken;
import java.sql.Timestamp;
import java.util.Date;

/* JADX INFO: loaded from: classes.dex */
class c extends q {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final r f4346b = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final q f4347a;

    class a implements r {
        a() {
        }

        @Override // R4.r
        public q a(R4.d dVar, TypeToken typeToken) {
            a aVar = null;
            if (typeToken.getRawType() == Timestamp.class) {
                return new c(dVar.l(Date.class), aVar);
            }
            return null;
        }
    }

    private c(q qVar) {
        this.f4347a = qVar;
    }

    @Override // R4.q
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public Timestamp b(Y4.a aVar) {
        Date date = (Date) this.f4347a.b(aVar);
        if (date != null) {
            return new Timestamp(date.getTime());
        }
        return null;
    }

    @Override // R4.q
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public void d(Y4.c cVar, Timestamp timestamp) {
        this.f4347a.d(cVar, timestamp);
    }

    /* synthetic */ c(q qVar, a aVar) {
        this(qVar);
    }
}
