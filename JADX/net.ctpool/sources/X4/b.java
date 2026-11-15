package X4;

import R4.l;
import R4.q;
import R4.r;
import com.google.gson.reflect.TypeToken;
import java.io.IOException;
import java.sql.Time;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/* JADX INFO: loaded from: classes.dex */
final class b extends q {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final r f4344b = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final DateFormat f4345a;

    class a implements r {
        a() {
        }

        @Override // R4.r
        public q a(R4.d dVar, TypeToken typeToken) {
            a aVar = null;
            if (typeToken.getRawType() == Time.class) {
                return new b(aVar);
            }
            return null;
        }
    }

    private b() {
        this.f4345a = new SimpleDateFormat("hh:mm:ss a");
    }

    @Override // R4.q
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public Time b(Y4.a aVar) throws IOException {
        Time time;
        if (aVar.R0() == Y4.b.NULL) {
            aVar.B0();
            return null;
        }
        String strH0 = aVar.H0();
        try {
            synchronized (this) {
                time = new Time(this.f4345a.parse(strH0).getTime());
            }
            return time;
        } catch (ParseException e7) {
            throw new l("Failed parsing '" + strH0 + "' as SQL Time; at path " + aVar.o(), e7);
        }
    }

    @Override // R4.q
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public void d(Y4.c cVar, Time time) throws IOException {
        String str;
        if (time == null) {
            cVar.J();
            return;
        }
        synchronized (this) {
            str = this.f4345a.format((Date) time);
        }
        cVar.f1(str);
    }

    /* synthetic */ b(a aVar) {
        this();
    }
}
