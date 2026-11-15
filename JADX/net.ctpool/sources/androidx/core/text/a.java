package androidx.core.text;

import android.text.SpannableStringBuilder;
import com.google.android.gms.common.ConnectionResult;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final o f7220d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f7221e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String f7222f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    static final a f7223g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    static final a f7224h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f7225a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f7226b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final o f7227c;

    /* JADX INFO: renamed from: androidx.core.text.a$a, reason: collision with other inner class name */
    public static final class C0143a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f7228a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f7229b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private o f7230c;

        public C0143a() {
            c(a.e(Locale.getDefault()));
        }

        private static a b(boolean z6) {
            return z6 ? a.f7224h : a.f7223g;
        }

        private void c(boolean z6) {
            this.f7228a = z6;
            this.f7230c = a.f7220d;
            this.f7229b = 2;
        }

        public a a() {
            return (this.f7229b == 2 && this.f7230c == a.f7220d) ? b(this.f7228a) : new a(this.f7228a, this.f7229b, this.f7230c);
        }
    }

    private static class b {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final byte[] f7231f = new byte[1792];

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final CharSequence f7232a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final boolean f7233b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f7234c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f7235d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private char f7236e;

        static {
            for (int i7 = 0; i7 < 1792; i7++) {
                f7231f[i7] = Character.getDirectionality(i7);
            }
        }

        b(CharSequence charSequence, boolean z6) {
            this.f7232a = charSequence;
            this.f7233b = z6;
            this.f7234c = charSequence.length();
        }

        private static byte c(char c7) {
            return c7 < 1792 ? f7231f[c7] : Character.getDirectionality(c7);
        }

        private byte f() {
            char cCharAt;
            int i7 = this.f7235d;
            do {
                int i8 = this.f7235d;
                if (i8 <= 0) {
                    break;
                }
                CharSequence charSequence = this.f7232a;
                int i9 = i8 - 1;
                this.f7235d = i9;
                cCharAt = charSequence.charAt(i9);
                this.f7236e = cCharAt;
                if (cCharAt == '&') {
                    return (byte) 12;
                }
            } while (cCharAt != ';');
            this.f7235d = i7;
            this.f7236e = ';';
            return (byte) 13;
        }

        private byte g() {
            char cCharAt;
            do {
                int i7 = this.f7235d;
                if (i7 >= this.f7234c) {
                    return (byte) 12;
                }
                CharSequence charSequence = this.f7232a;
                this.f7235d = i7 + 1;
                cCharAt = charSequence.charAt(i7);
                this.f7236e = cCharAt;
            } while (cCharAt != ';');
            return (byte) 12;
        }

        private byte h() {
            char cCharAt;
            int i7 = this.f7235d;
            while (true) {
                int i8 = this.f7235d;
                if (i8 <= 0) {
                    break;
                }
                CharSequence charSequence = this.f7232a;
                int i9 = i8 - 1;
                this.f7235d = i9;
                char cCharAt2 = charSequence.charAt(i9);
                this.f7236e = cCharAt2;
                if (cCharAt2 == '<') {
                    return (byte) 12;
                }
                if (cCharAt2 == '>') {
                    break;
                }
                if (cCharAt2 == '\"' || cCharAt2 == '\'') {
                    do {
                        int i10 = this.f7235d;
                        if (i10 > 0) {
                            CharSequence charSequence2 = this.f7232a;
                            int i11 = i10 - 1;
                            this.f7235d = i11;
                            cCharAt = charSequence2.charAt(i11);
                            this.f7236e = cCharAt;
                        }
                    } while (cCharAt != cCharAt2);
                }
            }
            this.f7235d = i7;
            this.f7236e = '>';
            return (byte) 13;
        }

        private byte i() {
            char cCharAt;
            int i7 = this.f7235d;
            while (true) {
                int i8 = this.f7235d;
                if (i8 >= this.f7234c) {
                    this.f7235d = i7;
                    this.f7236e = '<';
                    return (byte) 13;
                }
                CharSequence charSequence = this.f7232a;
                this.f7235d = i8 + 1;
                char cCharAt2 = charSequence.charAt(i8);
                this.f7236e = cCharAt2;
                if (cCharAt2 == '>') {
                    return (byte) 12;
                }
                if (cCharAt2 == '\"' || cCharAt2 == '\'') {
                    do {
                        int i9 = this.f7235d;
                        if (i9 < this.f7234c) {
                            CharSequence charSequence2 = this.f7232a;
                            this.f7235d = i9 + 1;
                            cCharAt = charSequence2.charAt(i9);
                            this.f7236e = cCharAt;
                        }
                    } while (cCharAt != cCharAt2);
                }
            }
        }

        byte a() {
            char cCharAt = this.f7232a.charAt(this.f7235d - 1);
            this.f7236e = cCharAt;
            if (Character.isLowSurrogate(cCharAt)) {
                int iCodePointBefore = Character.codePointBefore(this.f7232a, this.f7235d);
                this.f7235d -= Character.charCount(iCodePointBefore);
                return Character.getDirectionality(iCodePointBefore);
            }
            this.f7235d--;
            byte bC = c(this.f7236e);
            if (!this.f7233b) {
                return bC;
            }
            char c7 = this.f7236e;
            return c7 == '>' ? h() : c7 == ';' ? f() : bC;
        }

        byte b() {
            char cCharAt = this.f7232a.charAt(this.f7235d);
            this.f7236e = cCharAt;
            if (Character.isHighSurrogate(cCharAt)) {
                int iCodePointAt = Character.codePointAt(this.f7232a, this.f7235d);
                this.f7235d += Character.charCount(iCodePointAt);
                return Character.getDirectionality(iCodePointAt);
            }
            this.f7235d++;
            byte bC = c(this.f7236e);
            if (!this.f7233b) {
                return bC;
            }
            char c7 = this.f7236e;
            return c7 == '<' ? i() : c7 == '&' ? g() : bC;
        }

        int d() {
            this.f7235d = 0;
            int i7 = 0;
            int i8 = 0;
            int i9 = 0;
            while (this.f7235d < this.f7234c && i7 == 0) {
                byte b7 = b();
                if (b7 != 0) {
                    if (b7 == 1 || b7 == 2) {
                        if (i9 == 0) {
                            return 1;
                        }
                    } else if (b7 != 9) {
                        switch (b7) {
                            case 14:
                            case 15:
                                i9++;
                                i8 = -1;
                                continue;
                            case 16:
                            case 17:
                                i9++;
                                i8 = 1;
                                continue;
                            case ConnectionResult.SERVICE_UPDATING /* 18 */:
                                i9--;
                                i8 = 0;
                                continue;
                        }
                    }
                } else if (i9 == 0) {
                    return -1;
                }
                i7 = i9;
            }
            if (i7 == 0) {
                return 0;
            }
            if (i8 != 0) {
                return i8;
            }
            while (this.f7235d > 0) {
                switch (a()) {
                    case 14:
                    case 15:
                        if (i7 == i9) {
                            return -1;
                        }
                        break;
                    case 16:
                    case 17:
                        if (i7 == i9) {
                            return 1;
                        }
                        break;
                    case ConnectionResult.SERVICE_UPDATING /* 18 */:
                        i9++;
                        continue;
                }
                i9--;
            }
            return 0;
        }

        int e() {
            this.f7235d = this.f7234c;
            int i7 = 0;
            while (true) {
                int i8 = i7;
                while (this.f7235d > 0) {
                    byte bA = a();
                    if (bA == 0) {
                        if (i7 == 0) {
                            return -1;
                        }
                        if (i8 == 0) {
                            break;
                        }
                    } else if (bA == 1 || bA == 2) {
                        if (i7 == 0) {
                            return 1;
                        }
                        if (i8 == 0) {
                            break;
                        }
                    } else if (bA != 9) {
                        switch (bA) {
                            case 14:
                            case 15:
                                if (i8 == i7) {
                                    return -1;
                                }
                                i7--;
                                break;
                            case 16:
                            case 17:
                                if (i8 == i7) {
                                    return 1;
                                }
                                i7--;
                                break;
                            case ConnectionResult.SERVICE_UPDATING /* 18 */:
                                i7++;
                                break;
                            default:
                                if (i8 != 0) {
                                }
                                break;
                        }
                    } else {
                        continue;
                    }
                }
                return 0;
            }
        }
    }

    static {
        o oVar = p.f7248c;
        f7220d = oVar;
        f7221e = Character.toString((char) 8206);
        f7222f = Character.toString((char) 8207);
        f7223g = new a(false, 2, oVar);
        f7224h = new a(true, 2, oVar);
    }

    a(boolean z6, int i7, o oVar) {
        this.f7225a = z6;
        this.f7226b = i7;
        this.f7227c = oVar;
    }

    private static int a(CharSequence charSequence) {
        return new b(charSequence, false).d();
    }

    private static int b(CharSequence charSequence) {
        return new b(charSequence, false).e();
    }

    public static a c() {
        return new C0143a().a();
    }

    static boolean e(Locale locale) {
        return q.a(locale) == 1;
    }

    private String f(CharSequence charSequence, o oVar) {
        boolean zA = oVar.a(charSequence, 0, charSequence.length());
        return (this.f7225a || !(zA || b(charSequence) == 1)) ? this.f7225a ? (!zA || b(charSequence) == -1) ? f7222f : "" : "" : f7221e;
    }

    private String g(CharSequence charSequence, o oVar) {
        boolean zA = oVar.a(charSequence, 0, charSequence.length());
        return (this.f7225a || !(zA || a(charSequence) == 1)) ? this.f7225a ? (!zA || a(charSequence) == -1) ? f7222f : "" : "" : f7221e;
    }

    public boolean d() {
        return (this.f7226b & 2) != 0;
    }

    public CharSequence h(CharSequence charSequence) {
        return i(charSequence, this.f7227c, true);
    }

    public CharSequence i(CharSequence charSequence, o oVar, boolean z6) {
        if (charSequence == null) {
            return null;
        }
        boolean zA = oVar.a(charSequence, 0, charSequence.length());
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (d() && z6) {
            spannableStringBuilder.append((CharSequence) g(charSequence, zA ? p.f7247b : p.f7246a));
        }
        if (zA != this.f7225a) {
            spannableStringBuilder.append(zA ? (char) 8235 : (char) 8234);
            spannableStringBuilder.append(charSequence);
            spannableStringBuilder.append((char) 8236);
        } else {
            spannableStringBuilder.append(charSequence);
        }
        if (z6) {
            spannableStringBuilder.append((CharSequence) f(charSequence, zA ? p.f7247b : p.f7246a));
        }
        return spannableStringBuilder;
    }

    public String j(String str) {
        return k(str, this.f7227c, true);
    }

    public String k(String str, o oVar, boolean z6) {
        if (str == null) {
            return null;
        }
        return i(str, oVar, z6).toString();
    }
}
