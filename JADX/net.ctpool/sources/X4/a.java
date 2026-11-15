package X4;

import R4.l;
import R4.q;
import R4.r;
import com.google.gson.reflect.TypeToken;
import java.io.IOException;
import java.sql.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

/* JADX INFO: loaded from: classes.dex */
final class a extends q {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final r f4342b = new C0100a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final DateFormat f4343a;

    /* JADX INFO: renamed from: X4.a$a, reason: collision with other inner class name */
    class C0100a implements r {
        C0100a() {
        }

        @Override // R4.r
        public q a(R4.d dVar, TypeToken typeToken) {
            C0100a c0100a = null;
            if (typeToken.getRawType() == Date.class) {
                return new a(c0100a);
            }
            return null;
        }
    }

    private a() {
        this.f4343a = new SimpleDateFormat("MMM d, yyyy");
    }

    @Override // R4.q
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public Date b(Y4.a aVar) throws IOException {
        java.util.Date date;
        if (aVar.R0() == Y4.b.NULL) {
            aVar.B0();
            return null;
        }
        String strH0 = aVar.H0();
        try {
            synchronized (this) {
                date = this.f4343a.parse(strH0);
            }
            return new Date(date.getTime());
        } catch (ParseException e7) {
            throw new l("Failed parsing '" + strH0 + "' as SQL Date; at path " + aVar.o(), e7);
        }
    }

    @Override // R4.q
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public void d(Y4.c cVar, Date date) throws IOException {
        String str;
        if (date == null) {
            cVar.J();
            return;
        }
        synchronized (this) {
            str = this.f4343a.format((java.util.Date) date);
        }
        cVar.f1(str);
    }

    /* synthetic */ a(C0100a c0100a) {
        this();
    }
}
