package androidx.core.view.accessibility;

import android.view.View;
import android.view.accessibility.AccessibilityRecord;

/* JADX INFO: loaded from: classes.dex */
public abstract class E {

    static class a {
        static int a(AccessibilityRecord accessibilityRecord) {
            return accessibilityRecord.getMaxScrollX();
        }

        static int b(AccessibilityRecord accessibilityRecord) {
            return accessibilityRecord.getMaxScrollY();
        }

        static void c(AccessibilityRecord accessibilityRecord, int i7) {
            accessibilityRecord.setMaxScrollX(i7);
        }

        static void d(AccessibilityRecord accessibilityRecord, int i7) {
            accessibilityRecord.setMaxScrollY(i7);
        }
    }

    static class b {
        static void a(AccessibilityRecord accessibilityRecord, View view, int i7) {
            accessibilityRecord.setSource(view, i7);
        }
    }

    public static void a(AccessibilityRecord accessibilityRecord, int i7) {
        a.c(accessibilityRecord, i7);
    }

    public static void b(AccessibilityRecord accessibilityRecord, int i7) {
        a.d(accessibilityRecord, i7);
    }

    public static void c(AccessibilityRecord accessibilityRecord, View view, int i7) {
        b.a(accessibilityRecord, view, i7);
    }
}
