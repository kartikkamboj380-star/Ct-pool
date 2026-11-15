package androidx.core.view.accessibility;

import android.view.accessibility.AccessibilityEvent;

/* JADX INFO: renamed from: androidx.core.view.accessibility.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0577b {

    /* JADX INFO: renamed from: androidx.core.view.accessibility.b$a */
    static class a {
        static int a(AccessibilityEvent accessibilityEvent) {
            return accessibilityEvent.getContentChangeTypes();
        }

        static void b(AccessibilityEvent accessibilityEvent, int i7) {
            accessibilityEvent.setContentChangeTypes(i7);
        }
    }

    public static int a(AccessibilityEvent accessibilityEvent) {
        return a.a(accessibilityEvent);
    }

    public static void b(AccessibilityEvent accessibilityEvent, int i7) {
        a.b(accessibilityEvent, i7);
    }
}
