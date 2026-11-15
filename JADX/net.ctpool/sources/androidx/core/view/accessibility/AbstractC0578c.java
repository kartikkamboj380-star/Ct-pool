package androidx.core.view.accessibility;

import android.view.accessibility.AccessibilityManager;

/* JADX INFO: renamed from: androidx.core.view.accessibility.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0578c {

    /* JADX INFO: renamed from: androidx.core.view.accessibility.c$a */
    static class a {
        static boolean a(AccessibilityManager accessibilityManager, b bVar) {
            return accessibilityManager.addTouchExplorationStateChangeListener(new AccessibilityManagerTouchExplorationStateChangeListenerC0146c(bVar));
        }

        static boolean b(AccessibilityManager accessibilityManager, b bVar) {
            return accessibilityManager.removeTouchExplorationStateChangeListener(new AccessibilityManagerTouchExplorationStateChangeListenerC0146c(bVar));
        }
    }

    /* JADX INFO: renamed from: androidx.core.view.accessibility.c$b */
    public interface b {
        void onTouchExplorationStateChanged(boolean z6);
    }

    /* JADX INFO: renamed from: androidx.core.view.accessibility.c$c, reason: collision with other inner class name */
    private static final class AccessibilityManagerTouchExplorationStateChangeListenerC0146c implements AccessibilityManager.TouchExplorationStateChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final b f7398a;

        AccessibilityManagerTouchExplorationStateChangeListenerC0146c(b bVar) {
            this.f7398a = bVar;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof AccessibilityManagerTouchExplorationStateChangeListenerC0146c) {
                return this.f7398a.equals(((AccessibilityManagerTouchExplorationStateChangeListenerC0146c) obj).f7398a);
            }
            return false;
        }

        public int hashCode() {
            return this.f7398a.hashCode();
        }

        @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
        public void onTouchExplorationStateChanged(boolean z6) {
            this.f7398a.onTouchExplorationStateChanged(z6);
        }
    }

    public static boolean a(AccessibilityManager accessibilityManager, b bVar) {
        return a.a(accessibilityManager, bVar);
    }

    public static boolean b(AccessibilityManager accessibilityManager, b bVar) {
        return a.b(accessibilityManager, bVar);
    }
}
