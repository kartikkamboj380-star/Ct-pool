package V4;

import java.text.ParseException;
import java.text.ParsePosition;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final TimeZone f4152a = TimeZone.getTimeZone("UTC");

    private static boolean a(String str, int i7, char c7) {
        return i7 < str.length() && str.charAt(i7) == c7;
    }

    private static int b(String str, int i7) {
        while (i7 < str.length()) {
            char cCharAt = str.charAt(i7);
            if (cCharAt < '0' || cCharAt > '9') {
                return i7;
            }
            i7++;
        }
        return str.length();
    }

    /* JADX WARN: Removed duplicated region for block: B:85:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01f5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Date c(String str, ParsePosition parsePosition) throws ParseException {
        String str2;
        String message;
        int i7;
        int i8;
        int i9;
        int iD;
        int length;
        TimeZone timeZone;
        char cCharAt;
        try {
            int index = parsePosition.getIndex();
            int i10 = index + 4;
            int iD2 = d(str, index, i10);
            if (a(str, i10, '-')) {
                i10 = index + 5;
            }
            int i11 = i10 + 2;
            int iD3 = d(str, i10, i11);
            if (a(str, i11, '-')) {
                i11 = i10 + 3;
            }
            int i12 = i11 + 2;
            int iD4 = d(str, i11, i12);
            boolean zA = a(str, i12, 'T');
            if (!zA && str.length() <= i12) {
                GregorianCalendar gregorianCalendar = new GregorianCalendar(iD2, iD3 - 1, iD4);
                gregorianCalendar.setLenient(false);
                parsePosition.setIndex(i12);
                return gregorianCalendar.getTime();
            }
            if (zA) {
                int i13 = i11 + 5;
                int iD5 = d(str, i11 + 3, i13);
                if (a(str, i13, ':')) {
                    i13 = i11 + 6;
                }
                int i14 = i13 + 2;
                int iD6 = d(str, i13, i14);
                if (a(str, i14, ':')) {
                    i14 = i13 + 3;
                }
                if (str.length() <= i14 || (cCharAt = str.charAt(i14)) == 'Z' || cCharAt == '+' || cCharAt == '-') {
                    i8 = iD6;
                    i9 = 0;
                    iD = 0;
                    i12 = i14;
                    i7 = iD5;
                } else {
                    int i15 = i14 + 2;
                    iD = d(str, i14, i15);
                    if (iD > 59 && iD < 63) {
                        iD = 59;
                    }
                    if (a(str, i15, '.')) {
                        int i16 = i14 + 3;
                        int iB = b(str, i14 + 4);
                        int iMin = Math.min(iB, i14 + 6);
                        int iD7 = d(str, i16, iMin);
                        int i17 = iMin - i16;
                        if (i17 == 1) {
                            iD7 *= 100;
                        } else if (i17 == 2) {
                            iD7 *= 10;
                        }
                        i7 = iD5;
                        i12 = iB;
                        i8 = iD6;
                        i9 = iD7;
                    } else {
                        i7 = iD5;
                        i12 = i15;
                        i8 = iD6;
                        i9 = 0;
                    }
                }
            } else {
                i7 = 0;
                i8 = 0;
                i9 = 0;
                iD = 0;
            }
            if (str.length() <= i12) {
                throw new IllegalArgumentException("No time zone indicator");
            }
            char cCharAt2 = str.charAt(i12);
            if (cCharAt2 == 'Z') {
                timeZone = f4152a;
                length = i12 + 1;
            } else {
                if (cCharAt2 != '+' && cCharAt2 != '-') {
                    throw new IndexOutOfBoundsException("Invalid time zone indicator '" + cCharAt2 + "'");
                }
                String strSubstring = str.substring(i12);
                if (strSubstring.length() < 5) {
                    strSubstring = strSubstring + "00";
                }
                length = i12 + strSubstring.length();
                if ("+0000".equals(strSubstring) || "+00:00".equals(strSubstring)) {
                    timeZone = f4152a;
                } else {
                    String str3 = "GMT" + strSubstring;
                    TimeZone timeZone2 = TimeZone.getTimeZone(str3);
                    String id = timeZone2.getID();
                    if (!id.equals(str3) && !id.replace(":", "").equals(str3)) {
                        throw new IndexOutOfBoundsException("Mismatching time zone indicator: " + str3 + " given, resolves to " + timeZone2.getID());
                    }
                    timeZone = timeZone2;
                }
            }
            GregorianCalendar gregorianCalendar2 = new GregorianCalendar(timeZone);
            gregorianCalendar2.setLenient(false);
            gregorianCalendar2.set(1, iD2);
            gregorianCalendar2.set(2, iD3 - 1);
            gregorianCalendar2.set(5, iD4);
            gregorianCalendar2.set(11, i7);
            gregorianCalendar2.set(12, i8);
            gregorianCalendar2.set(13, iD);
            gregorianCalendar2.set(14, i9);
            parsePosition.setIndex(length);
            return gregorianCalendar2.getTime();
        } catch (IndexOutOfBoundsException e7) {
            e = e7;
            if (str == null) {
                str2 = null;
            } else {
                str2 = '\"' + str + '\"';
            }
            message = e.getMessage();
            if (message == null || message.isEmpty()) {
                message = "(" + e.getClass().getName() + ")";
            }
            ParseException parseException = new ParseException("Failed to parse date [" + str2 + "]: " + message, parsePosition.getIndex());
            parseException.initCause(e);
            throw parseException;
        } catch (NumberFormatException e8) {
            e = e8;
            if (str == null) {
            }
            message = e.getMessage();
            if (message == null) {
                message = "(" + e.getClass().getName() + ")";
            }
            ParseException parseException2 = new ParseException("Failed to parse date [" + str2 + "]: " + message, parsePosition.getIndex());
            parseException2.initCause(e);
            throw parseException2;
        } catch (IllegalArgumentException e9) {
            e = e9;
            if (str == null) {
            }
            message = e.getMessage();
            if (message == null) {
            }
            ParseException parseException22 = new ParseException("Failed to parse date [" + str2 + "]: " + message, parsePosition.getIndex());
            parseException22.initCause(e);
            throw parseException22;
        }
    }

    private static int d(String str, int i7, int i8) {
        int i9;
        int i10;
        if (i7 < 0 || i8 > str.length() || i7 > i8) {
            throw new NumberFormatException(str);
        }
        if (i7 < i8) {
            i10 = i7 + 1;
            int iDigit = Character.digit(str.charAt(i7), 10);
            if (iDigit < 0) {
                throw new NumberFormatException("Invalid number: " + str.substring(i7, i8));
            }
            i9 = -iDigit;
        } else {
            i9 = 0;
            i10 = i7;
        }
        while (i10 < i8) {
            int i11 = i10 + 1;
            int iDigit2 = Character.digit(str.charAt(i10), 10);
            if (iDigit2 < 0) {
                throw new NumberFormatException("Invalid number: " + str.substring(i7, i8));
            }
            i9 = (i9 * 10) - iDigit2;
            i10 = i11;
        }
        return -i9;
    }
}
