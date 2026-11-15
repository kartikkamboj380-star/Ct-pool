package com.facebook.hermes.intl;

import android.icu.text.RuleBasedCollator;
import com.facebook.hermes.intl.a;

/* JADX INFO: loaded from: classes.dex */
public class h implements com.facebook.hermes.intl.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private RuleBasedCollator f10656a = null;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f10657a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f10658b;

        static {
            int[] iArr = new int[a.b.values().length];
            f10658b = iArr;
            try {
                iArr[a.b.UPPER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f10658b[a.b.LOWER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f10658b[a.b.FALSE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[a.c.values().length];
            f10657a = iArr2;
            try {
                iArr2[a.c.BASE.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f10657a[a.c.ACCENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f10657a[a.c.CASE.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f10657a[a.c.VARIANT.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    h() {
    }

    @Override // com.facebook.hermes.intl.a
    public int a(String str, String str2) {
        return this.f10656a.compare(str, str2);
    }

    @Override // com.facebook.hermes.intl.a
    public a.c b() {
        RuleBasedCollator ruleBasedCollator = this.f10656a;
        if (ruleBasedCollator == null) {
            return a.c.LOCALE;
        }
        int strength = ruleBasedCollator.getStrength();
        return strength == 0 ? this.f10656a.isCaseLevel() ? a.c.CASE : a.c.BASE : strength == 1 ? a.c.ACCENT : a.c.VARIANT;
    }

    @Override // com.facebook.hermes.intl.a
    public com.facebook.hermes.intl.a c(q1.b bVar) {
        RuleBasedCollator ruleBasedCollator = (RuleBasedCollator) android.icu.text.Collator.getInstance(((q1.g) bVar).h());
        this.f10656a = ruleBasedCollator;
        ruleBasedCollator.setDecomposition(17);
        return this;
    }

    @Override // com.facebook.hermes.intl.a
    public com.facebook.hermes.intl.a d(a.b bVar) {
        int i7 = a.f10658b[bVar.ordinal()];
        if (i7 == 1) {
            this.f10656a.setUpperCaseFirst(true);
        } else if (i7 != 2) {
            this.f10656a.setCaseFirstDefault();
        } else {
            this.f10656a.setLowerCaseFirst(true);
        }
        return this;
    }

    @Override // com.facebook.hermes.intl.a
    public com.facebook.hermes.intl.a e(boolean z6) {
        if (z6) {
            this.f10656a.setNumericCollation(q1.d.e(Boolean.TRUE));
        }
        return this;
    }

    @Override // com.facebook.hermes.intl.a
    public com.facebook.hermes.intl.a f(a.c cVar) {
        int i7 = a.f10657a[cVar.ordinal()];
        if (i7 == 1) {
            this.f10656a.setStrength(0);
        } else if (i7 == 2) {
            this.f10656a.setStrength(1);
        } else if (i7 == 3) {
            this.f10656a.setStrength(0);
            this.f10656a.setCaseLevel(true);
        } else if (i7 == 4) {
            this.f10656a.setStrength(2);
        }
        return this;
    }

    @Override // com.facebook.hermes.intl.a
    public com.facebook.hermes.intl.a g(boolean z6) {
        if (z6) {
            this.f10656a.setAlternateHandlingShifted(true);
        }
        return this;
    }
}
