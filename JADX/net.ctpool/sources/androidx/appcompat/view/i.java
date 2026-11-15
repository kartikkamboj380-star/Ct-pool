package androidx.appcompat.view;

import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.KeyboardShortcutGroup;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.SearchEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityEvent;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class i implements Window.Callback {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    final Window.Callback f5313m;

    static class a {
        static boolean a(Window.Callback callback, SearchEvent searchEvent) {
            return callback.onSearchRequested(searchEvent);
        }

        static ActionMode b(Window.Callback callback, ActionMode.Callback callback2, int i7) {
            return callback.onWindowStartingActionMode(callback2, i7);
        }
    }

    static class b {
        static void a(Window.Callback callback, List<KeyboardShortcutGroup> list, Menu menu, int i7) {
            callback.onProvideKeyboardShortcuts(list, menu, i7);
        }
    }

    static class c {
        static void a(Window.Callback callback, boolean z6) {
            callback.onPointerCaptureChanged(z6);
        }
    }

    public i(Window.Callback callback) {
        if (callback == null) {
            throw new IllegalArgumentException("Window callback may not be null");
        }
        this.f5313m = callback;
    }

    public final Window.Callback a() {
        return this.f5313m;
    }

    @Override // android.view.Window.Callback
    public boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        return this.f5313m.dispatchGenericMotionEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return this.f5313m.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.Window.Callback
    public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        return this.f5313m.dispatchKeyShortcutEvent(keyEvent);
    }

    @Override // android.view.Window.Callback
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return this.f5313m.dispatchPopulateAccessibilityEvent(accessibilityEvent);
    }

    @Override // android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return this.f5313m.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public boolean dispatchTrackballEvent(MotionEvent motionEvent) {
        return this.f5313m.dispatchTrackballEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public void onActionModeFinished(ActionMode actionMode) {
        this.f5313m.onActionModeFinished(actionMode);
    }

    @Override // android.view.Window.Callback
    public void onActionModeStarted(ActionMode actionMode) {
        this.f5313m.onActionModeStarted(actionMode);
    }

    @Override // android.view.Window.Callback
    public void onAttachedToWindow() {
        this.f5313m.onAttachedToWindow();
    }

    @Override // android.view.Window.Callback
    public boolean onCreatePanelMenu(int i7, Menu menu) {
        return this.f5313m.onCreatePanelMenu(i7, menu);
    }

    @Override // android.view.Window.Callback
    public View onCreatePanelView(int i7) {
        return this.f5313m.onCreatePanelView(i7);
    }

    @Override // android.view.Window.Callback
    public void onDetachedFromWindow() {
        this.f5313m.onDetachedFromWindow();
    }

    @Override // android.view.Window.Callback
    public boolean onMenuItemSelected(int i7, MenuItem menuItem) {
        return this.f5313m.onMenuItemSelected(i7, menuItem);
    }

    @Override // android.view.Window.Callback
    public boolean onMenuOpened(int i7, Menu menu) {
        return this.f5313m.onMenuOpened(i7, menu);
    }

    @Override // android.view.Window.Callback
    public void onPanelClosed(int i7, Menu menu) {
        this.f5313m.onPanelClosed(i7, menu);
    }

    @Override // android.view.Window.Callback
    public void onPointerCaptureChanged(boolean z6) {
        c.a(this.f5313m, z6);
    }

    @Override // android.view.Window.Callback
    public boolean onPreparePanel(int i7, View view, Menu menu) {
        return this.f5313m.onPreparePanel(i7, view, menu);
    }

    @Override // android.view.Window.Callback
    public void onProvideKeyboardShortcuts(List list, Menu menu, int i7) {
        b.a(this.f5313m, list, menu, i7);
    }

    @Override // android.view.Window.Callback
    public boolean onSearchRequested() {
        return this.f5313m.onSearchRequested();
    }

    @Override // android.view.Window.Callback
    public void onWindowAttributesChanged(WindowManager.LayoutParams layoutParams) {
        this.f5313m.onWindowAttributesChanged(layoutParams);
    }

    @Override // android.view.Window.Callback
    public void onWindowFocusChanged(boolean z6) {
        this.f5313m.onWindowFocusChanged(z6);
    }

    @Override // android.view.Window.Callback
    public ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i7) {
        return a.b(this.f5313m, callback, i7);
    }

    @Override // android.view.Window.Callback
    public boolean onSearchRequested(SearchEvent searchEvent) {
        return a.a(this.f5313m, searchEvent);
    }
}
