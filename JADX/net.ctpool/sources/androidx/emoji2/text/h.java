package androidx.emoji2.text;

import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.method.MetaKeyKeyListener;
import android.view.KeyEvent;
import android.view.inputmethod.InputConnection;
import androidx.emoji2.text.e;
import androidx.emoji2.text.m;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final e.i f7885a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final m f7886b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private e.d f7887c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f7888d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int[] f7889e;

    private static final class a {
        static int a(CharSequence charSequence, int i7, int i8) {
            int length = charSequence.length();
            if (i7 < 0 || length < i7 || i8 < 0) {
                return -1;
            }
            while (true) {
                boolean z6 = false;
                while (i8 != 0) {
                    i7--;
                    if (i7 < 0) {
                        return z6 ? -1 : 0;
                    }
                    char cCharAt = charSequence.charAt(i7);
                    if (z6) {
                        if (!Character.isHighSurrogate(cCharAt)) {
                            return -1;
                        }
                        i8--;
                    } else if (!Character.isSurrogate(cCharAt)) {
                        i8--;
                    } else {
                        if (Character.isHighSurrogate(cCharAt)) {
                            return -1;
                        }
                        z6 = true;
                    }
                }
                return i7;
            }
        }

        static int b(CharSequence charSequence, int i7, int i8) {
            int length = charSequence.length();
            if (i7 < 0 || length < i7 || i8 < 0) {
                return -1;
            }
            while (true) {
                boolean z6 = false;
                while (i8 != 0) {
                    if (i7 >= length) {
                        if (z6) {
                            return -1;
                        }
                        return length;
                    }
                    char cCharAt = charSequence.charAt(i7);
                    if (z6) {
                        if (!Character.isLowSurrogate(cCharAt)) {
                            return -1;
                        }
                        i8--;
                        i7++;
                    } else if (!Character.isSurrogate(cCharAt)) {
                        i8--;
                        i7++;
                    } else {
                        if (Character.isLowSurrogate(cCharAt)) {
                            return -1;
                        }
                        i7++;
                        z6 = true;
                    }
                }
                return i7;
            }
        }
    }

    static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f7890a = 1;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final m.a f7891b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private m.a f7892c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private m.a f7893d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f7894e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f7895f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final boolean f7896g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final int[] f7897h;

        b(m.a aVar, boolean z6, int[] iArr) {
            this.f7891b = aVar;
            this.f7892c = aVar;
            this.f7896g = z6;
            this.f7897h = iArr;
        }

        private static boolean d(int i7) {
            return i7 == 65039;
        }

        private static boolean f(int i7) {
            return i7 == 65038;
        }

        private int g() {
            this.f7890a = 1;
            this.f7892c = this.f7891b;
            this.f7895f = 0;
            return 1;
        }

        private boolean h() {
            if (this.f7892c.b().j() || d(this.f7894e)) {
                return true;
            }
            if (this.f7896g) {
                if (this.f7897h == null) {
                    return true;
                }
                if (Arrays.binarySearch(this.f7897h, this.f7892c.b().b(0)) < 0) {
                    return true;
                }
            }
            return false;
        }

        /* JADX WARN: Removed duplicated region for block: B:5:0x000e  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        int a(int i7) {
            m.a aVarA = this.f7892c.a(i7);
            int iG = 2;
            if (this.f7890a != 2) {
                if (aVarA == null) {
                    iG = g();
                } else {
                    this.f7890a = 2;
                    this.f7892c = aVarA;
                    this.f7895f = 1;
                }
            } else if (aVarA != null) {
                this.f7892c = aVarA;
                this.f7895f++;
            } else if (!f(i7)) {
                if (!d(i7)) {
                    if (this.f7892c.b() != null) {
                        iG = 3;
                        if (this.f7895f != 1 || h()) {
                            this.f7893d = this.f7892c;
                            g();
                        }
                    }
                }
            }
            this.f7894e = i7;
            return iG;
        }

        g b() {
            return this.f7892c.b();
        }

        g c() {
            return this.f7893d.b();
        }

        boolean e() {
            return this.f7890a == 2 && this.f7892c.b() != null && (this.f7895f > 1 || h());
        }
    }

    h(m mVar, e.i iVar, e.d dVar, boolean z6, int[] iArr) {
        this.f7885a = iVar;
        this.f7886b = mVar;
        this.f7887c = dVar;
        this.f7888d = z6;
        this.f7889e = iArr;
    }

    private void a(Spannable spannable, g gVar, int i7, int i8) {
        spannable.setSpan(this.f7885a.a(gVar), i7, i8, 33);
    }

    private static boolean b(Editable editable, KeyEvent keyEvent, boolean z6) {
        i[] iVarArr;
        if (g(keyEvent)) {
            return false;
        }
        int selectionStart = Selection.getSelectionStart(editable);
        int selectionEnd = Selection.getSelectionEnd(editable);
        if (!f(selectionStart, selectionEnd) && (iVarArr = (i[]) editable.getSpans(selectionStart, selectionEnd, i.class)) != null && iVarArr.length > 0) {
            for (i iVar : iVarArr) {
                int spanStart = editable.getSpanStart(iVar);
                int spanEnd = editable.getSpanEnd(iVar);
                if ((z6 && spanStart == selectionStart) || ((!z6 && spanEnd == selectionStart) || (selectionStart > spanStart && selectionStart < spanEnd))) {
                    editable.delete(spanStart, spanEnd);
                    return true;
                }
            }
        }
        return false;
    }

    static boolean c(InputConnection inputConnection, Editable editable, int i7, int i8, boolean z6) {
        int iMax;
        int iMin;
        if (editable != null && inputConnection != null && i7 >= 0 && i8 >= 0) {
            int selectionStart = Selection.getSelectionStart(editable);
            int selectionEnd = Selection.getSelectionEnd(editable);
            if (f(selectionStart, selectionEnd)) {
                return false;
            }
            if (z6) {
                iMax = a.a(editable, selectionStart, Math.max(i7, 0));
                iMin = a.b(editable, selectionEnd, Math.max(i8, 0));
                if (iMax == -1 || iMin == -1) {
                    return false;
                }
            } else {
                iMax = Math.max(selectionStart - i7, 0);
                iMin = Math.min(selectionEnd + i8, editable.length());
            }
            i[] iVarArr = (i[]) editable.getSpans(iMax, iMin, i.class);
            if (iVarArr != null && iVarArr.length > 0) {
                for (i iVar : iVarArr) {
                    int spanStart = editable.getSpanStart(iVar);
                    int spanEnd = editable.getSpanEnd(iVar);
                    iMax = Math.min(spanStart, iMax);
                    iMin = Math.max(spanEnd, iMin);
                }
                int iMax2 = Math.max(iMax, 0);
                int iMin2 = Math.min(iMin, editable.length());
                inputConnection.beginBatchEdit();
                editable.delete(iMax2, iMin2);
                inputConnection.endBatchEdit();
                return true;
            }
        }
        return false;
    }

    static boolean d(Editable editable, int i7, KeyEvent keyEvent) {
        if (!(i7 != 67 ? i7 != 112 ? false : b(editable, keyEvent, true) : b(editable, keyEvent, false))) {
            return false;
        }
        MetaKeyKeyListener.adjustMetaAfterKeypress(editable);
        return true;
    }

    private boolean e(CharSequence charSequence, int i7, int i8, g gVar) {
        if (gVar.d() == 0) {
            gVar.k(this.f7887c.a(charSequence, i7, i8, gVar.h()));
        }
        return gVar.d() == 2;
    }

    private static boolean f(int i7, int i8) {
        return i7 == -1 || i8 == -1 || i7 != i8;
    }

    private static boolean g(KeyEvent keyEvent) {
        return !KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState());
    }

    CharSequence h(CharSequence charSequence, int i7, int i8, int i9, boolean z6) {
        p pVar;
        int iCharCount;
        i[] iVarArr;
        boolean z7 = charSequence instanceof n;
        if (z7) {
            ((n) charSequence).a();
        }
        if (!z7) {
            try {
                pVar = charSequence instanceof Spannable ? new p((Spannable) charSequence) : (!(charSequence instanceof Spanned) || ((Spanned) charSequence).nextSpanTransition(i7 + (-1), i8 + 1, i.class) > i8) ? null : new p(charSequence);
            } finally {
                if (z7) {
                    ((n) charSequence).d();
                }
            }
        }
        if (pVar != null && (iVarArr = (i[]) pVar.getSpans(i7, i8, i.class)) != null && iVarArr.length > 0) {
            for (i iVar : iVarArr) {
                int spanStart = pVar.getSpanStart(iVar);
                int spanEnd = pVar.getSpanEnd(iVar);
                if (spanStart != i8) {
                    pVar.removeSpan(iVar);
                }
                i7 = Math.min(spanStart, i7);
                i8 = Math.max(spanEnd, i8);
            }
        }
        if (i7 != i8 && i7 < charSequence.length()) {
            if (i9 != Integer.MAX_VALUE && pVar != null) {
                i9 -= ((i[]) pVar.getSpans(0, pVar.length(), i.class)).length;
            }
            b bVar = new b(this.f7886b.f(), this.f7888d, this.f7889e);
            int iCodePointAt = Character.codePointAt(charSequence, i7);
            int i10 = 0;
            p pVar2 = pVar;
            loop1: while (true) {
                iCharCount = i7;
                while (i7 < i8 && i10 < i9) {
                    int iA = bVar.a(iCodePointAt);
                    if (iA == 1) {
                        iCharCount += Character.charCount(Character.codePointAt(charSequence, iCharCount));
                        if (iCharCount < i8) {
                            iCodePointAt = Character.codePointAt(charSequence, iCharCount);
                        }
                        i7 = iCharCount;
                    } else if (iA == 2) {
                        i7 += Character.charCount(iCodePointAt);
                        if (i7 < i8) {
                            iCodePointAt = Character.codePointAt(charSequence, i7);
                        }
                    } else if (iA == 3) {
                        if (z6 || !e(charSequence, iCharCount, i7, bVar.c())) {
                            if (pVar2 == null) {
                                pVar2 = new p((Spannable) new SpannableString(charSequence));
                            }
                            a(pVar2, bVar.c(), iCharCount, i7);
                            i10++;
                        }
                    }
                }
                break loop1;
            }
            if (bVar.e() && i10 < i9 && (z6 || !e(charSequence, iCharCount, i7, bVar.b()))) {
                if (pVar2 == null) {
                    pVar2 = new p(charSequence);
                }
                a(pVar2, bVar.b(), iCharCount, i7);
            }
            if (pVar2 == null) {
                if (z7) {
                    ((n) charSequence).d();
                }
                return charSequence;
            }
            Spannable spannableB = pVar2.b();
            if (z7) {
                ((n) charSequence).d();
            }
            return spannableB;
        }
        return charSequence;
    }
}
