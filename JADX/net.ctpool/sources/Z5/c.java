package Z5;

import i5.u;
import java.text.DateFormat;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final a f4642a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String[] f4643b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final DateFormat[] f4644c;

    public static final class a extends ThreadLocal {
        a() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DateFormat initialValue() {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss 'GMT'", Locale.US);
            simpleDateFormat.setLenient(false);
            simpleDateFormat.setTimeZone(U5.c.f3988f);
            return simpleDateFormat;
        }
    }

    static {
        String[] strArr = {"EEE, dd MMM yyyy HH:mm:ss zzz", "EEEE, dd-MMM-yy HH:mm:ss zzz", "EEE MMM d HH:mm:ss yyyy", "EEE, dd-MMM-yyyy HH:mm:ss z", "EEE, dd-MMM-yyyy HH-mm-ss z", "EEE, dd MMM yy HH:mm:ss z", "EEE dd-MMM-yyyy HH:mm:ss z", "EEE dd MMM yyyy HH:mm:ss z", "EEE dd-MMM-yyyy HH-mm-ss z", "EEE dd-MMM-yy HH:mm:ss z", "EEE dd MMM yy HH:mm:ss z", "EEE,dd-MMM-yy HH:mm:ss z", "EEE,dd-MMM-yyyy HH:mm:ss z", "EEE, dd-MM-yyyy HH:mm:ss z", "EEE MMM d yyyy HH:mm:ss z"};
        f4643b = strArr;
        f4644c = new DateFormat[strArr.length];
    }

    public static final Date a(String str) {
        w5.k.f(str, "$this$toHttpDateOrNull");
        if (str.length() == 0) {
            return null;
        }
        ParsePosition parsePosition = new ParsePosition(0);
        Date date = ((DateFormat) f4642a.get()).parse(str, parsePosition);
        if (parsePosition.getIndex() == str.length()) {
            return date;
        }
        String[] strArr = f4643b;
        synchronized (strArr) {
            try {
                int length = strArr.length;
                for (int i7 = 0; i7 < length; i7++) {
                    DateFormat[] dateFormatArr = f4644c;
                    DateFormat simpleDateFormat = dateFormatArr[i7];
                    if (simpleDateFormat == null) {
                        simpleDateFormat = new SimpleDateFormat(f4643b[i7], Locale.US);
                        simpleDateFormat.setTimeZone(U5.c.f3988f);
                        dateFormatArr[i7] = simpleDateFormat;
                    }
                    parsePosition.setIndex(0);
                    Date date2 = simpleDateFormat.parse(str, parsePosition);
                    if (parsePosition.getIndex() != 0) {
                        return date2;
                    }
                }
                u uVar = u.f19985a;
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static final String b(Date date) {
        w5.k.f(date, "$this$toHttpDateString");
        String str = ((DateFormat) f4642a.get()).format(date);
        w5.k.e(str, "STANDARD_DATE_FORMAT.get().format(this)");
        return str;
    }
}
