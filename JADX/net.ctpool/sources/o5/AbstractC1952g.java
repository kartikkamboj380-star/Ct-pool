package o5;

import java.lang.reflect.Field;

/* JADX INFO: renamed from: o5.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC1952g {
    private static final void a(int i7, int i8) {
        if (i8 <= i7) {
            return;
        }
        throw new IllegalStateException(("Debug metadata version mismatch. Expected: " + i7 + ", got " + i8 + ". Please update the Kotlin standard library.").toString());
    }

    private static final InterfaceC1951f b(AbstractC1946a abstractC1946a) {
        return (InterfaceC1951f) abstractC1946a.getClass().getAnnotation(InterfaceC1951f.class);
    }

    private static final int c(AbstractC1946a abstractC1946a) {
        try {
            Field declaredField = abstractC1946a.getClass().getDeclaredField("label");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(abstractC1946a);
            Integer num = obj instanceof Integer ? (Integer) obj : null;
            return (num != null ? num.intValue() : 0) - 1;
        } catch (Exception unused) {
            return -1;
        }
    }

    public static final StackTraceElement d(AbstractC1946a abstractC1946a) {
        String strC;
        w5.k.f(abstractC1946a, "<this>");
        InterfaceC1951f interfaceC1951fB = b(abstractC1946a);
        if (interfaceC1951fB == null) {
            return null;
        }
        a(1, interfaceC1951fB.v());
        int iC = c(abstractC1946a);
        int i7 = iC < 0 ? -1 : interfaceC1951fB.l()[iC];
        String strB = C1954i.f21490a.b(abstractC1946a);
        if (strB == null) {
            strC = interfaceC1951fB.c();
        } else {
            strC = strB + '/' + interfaceC1951fB.c();
        }
        return new StackTraceElement(strC, interfaceC1951fB.m(), interfaceC1951fB.f(), i7);
    }
}
