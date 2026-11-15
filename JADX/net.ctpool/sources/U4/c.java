package U4;

import R4.q;
import R4.r;
import com.google.gson.reflect.TypeToken;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class c extends q {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final r f3862b = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f3863a;

    class a implements r {
        a() {
        }

        @Override // R4.r
        public q a(R4.d dVar, TypeToken typeToken) {
            if (typeToken.getRawType() == Date.class) {
                return new c();
            }
            return null;
        }
    }

    public c() {
        ArrayList arrayList = new ArrayList();
        this.f3863a = arrayList;
        Locale locale = Locale.US;
        arrayList.add(DateFormat.getDateTimeInstance(2, 2, locale));
        if (!Locale.getDefault().equals(locale)) {
            arrayList.add(DateFormat.getDateTimeInstance(2, 2));
        }
        if (T4.e.d()) {
            arrayList.add(T4.j.c(2, 2));
        }
    }

    private Date e(Y4.a aVar) throws IOException {
        String strH0 = aVar.H0();
        synchronized (this.f3863a) {
            try {
                Iterator it = this.f3863a.iterator();
                while (it.hasNext()) {
                    try {
                        return ((DateFormat) it.next()).parse(strH0);
                    } catch (ParseException unused) {
                    }
                }
                try {
                    return V4.a.c(strH0, new ParsePosition(0));
                } catch (ParseException e7) {
                    throw new R4.l("Failed parsing '" + strH0 + "' as Date; at path " + aVar.o(), e7);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // R4.q
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public Date b(Y4.a aVar) throws IOException {
        if (aVar.R0() != Y4.b.NULL) {
            return e(aVar);
        }
        aVar.B0();
        return null;
    }

    @Override // R4.q
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public void d(Y4.c cVar, Date date) throws IOException {
        String str;
        if (date == null) {
            cVar.J();
            return;
        }
        DateFormat dateFormat = (DateFormat) this.f3863a.get(0);
        synchronized (this.f3863a) {
            str = dateFormat.format(date);
        }
        cVar.f1(str);
    }
}
