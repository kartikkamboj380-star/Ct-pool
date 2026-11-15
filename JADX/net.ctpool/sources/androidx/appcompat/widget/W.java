package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.transition.Transition;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.ListMenuItemView;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public class W extends U implements V {

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    private static Method f5948V;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    private V f5949U;

    static class a {
        static void a(PopupWindow popupWindow, Transition transition) {
            popupWindow.setEnterTransition(transition);
        }

        static void b(PopupWindow popupWindow, Transition transition) {
            popupWindow.setExitTransition(transition);
        }
    }

    static class b {
        static void a(PopupWindow popupWindow, boolean z6) {
            popupWindow.setTouchModal(z6);
        }
    }

    public static class c extends P {

        /* JADX INFO: renamed from: A, reason: collision with root package name */
        final int f5950A;

        /* JADX INFO: renamed from: B, reason: collision with root package name */
        private V f5951B;

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        private MenuItem f5952C;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        final int f5953z;

        static class a {
            static int a(Configuration configuration) {
                return configuration.getLayoutDirection();
            }
        }

        public c(Context context, boolean z6) {
            super(context, z6);
            if (1 == a.a(context.getResources().getConfiguration())) {
                this.f5953z = 21;
                this.f5950A = 22;
            } else {
                this.f5953z = 22;
                this.f5950A = 21;
            }
        }

        @Override // androidx.appcompat.widget.P
        public /* bridge */ /* synthetic */ int d(int i7, int i8, int i9, int i10, int i11) {
            return super.d(i7, i8, i9, i10, i11);
        }

        @Override // androidx.appcompat.widget.P
        public /* bridge */ /* synthetic */ boolean e(MotionEvent motionEvent, int i7) {
            return super.e(motionEvent, i7);
        }

        @Override // androidx.appcompat.widget.P, android.view.ViewGroup, android.view.View
        public /* bridge */ /* synthetic */ boolean hasFocus() {
            return super.hasFocus();
        }

        @Override // androidx.appcompat.widget.P, android.view.View
        public /* bridge */ /* synthetic */ boolean hasWindowFocus() {
            return super.hasWindowFocus();
        }

        @Override // androidx.appcompat.widget.P, android.view.View
        public /* bridge */ /* synthetic */ boolean isFocused() {
            return super.isFocused();
        }

        @Override // androidx.appcompat.widget.P, android.view.View
        public /* bridge */ /* synthetic */ boolean isInTouchMode() {
            return super.isInTouchMode();
        }

        @Override // androidx.appcompat.widget.P, android.view.View
        public boolean onHoverEvent(MotionEvent motionEvent) {
            androidx.appcompat.view.menu.f fVar;
            int headersCount;
            int iPointToPosition;
            int i7;
            if (this.f5951B != null) {
                ListAdapter adapter = getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                    headersCount = headerViewListAdapter.getHeadersCount();
                    fVar = (androidx.appcompat.view.menu.f) headerViewListAdapter.getWrappedAdapter();
                } else {
                    fVar = (androidx.appcompat.view.menu.f) adapter;
                    headersCount = 0;
                }
                androidx.appcompat.view.menu.i item = (motionEvent.getAction() == 10 || (iPointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) == -1 || (i7 = iPointToPosition - headersCount) < 0 || i7 >= fVar.getCount()) ? null : fVar.getItem(i7);
                MenuItem menuItem = this.f5952C;
                if (menuItem != item) {
                    androidx.appcompat.view.menu.g gVarB = fVar.b();
                    if (menuItem != null) {
                        this.f5951B.g(gVarB, menuItem);
                    }
                    this.f5952C = item;
                    if (item != null) {
                        this.f5951B.d(gVarB, item);
                    }
                }
            }
            return super.onHoverEvent(motionEvent);
        }

        @Override // android.widget.ListView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
        public boolean onKeyDown(int i7, KeyEvent keyEvent) {
            ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
            if (listMenuItemView != null && i7 == this.f5953z) {
                if (listMenuItemView.isEnabled() && listMenuItemView.getItemData().hasSubMenu()) {
                    performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
                }
                return true;
            }
            if (listMenuItemView == null || i7 != this.f5950A) {
                return super.onKeyDown(i7, keyEvent);
            }
            setSelection(-1);
            ListAdapter adapter = getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                adapter = ((HeaderViewListAdapter) adapter).getWrappedAdapter();
            }
            ((androidx.appcompat.view.menu.f) adapter).b().e(false);
            return true;
        }

        @Override // androidx.appcompat.widget.P, android.widget.AbsListView, android.view.View
        public /* bridge */ /* synthetic */ boolean onTouchEvent(MotionEvent motionEvent) {
            return super.onTouchEvent(motionEvent);
        }

        public void setHoverListener(V v6) {
            this.f5951B = v6;
        }

        @Override // androidx.appcompat.widget.P, android.widget.AbsListView
        public /* bridge */ /* synthetic */ void setSelector(Drawable drawable) {
            super.setSelector(drawable);
        }
    }

    static {
        try {
            if (Build.VERSION.SDK_INT <= 28) {
                f5948V = PopupWindow.class.getDeclaredMethod("setTouchModal", Boolean.TYPE);
            }
        } catch (NoSuchMethodException unused) {
            Log.i("MenuPopupWindow", "Could not find method setTouchModal() on PopupWindow. Oh well.");
        }
    }

    public W(Context context, AttributeSet attributeSet, int i7, int i8) {
        super(context, attributeSet, i7, i8);
    }

    public void R(Object obj) {
        a.a(this.f5922R, (Transition) obj);
    }

    public void S(Object obj) {
        a.b(this.f5922R, (Transition) obj);
    }

    public void T(V v6) {
        this.f5949U = v6;
    }

    public void U(boolean z6) {
        if (Build.VERSION.SDK_INT > 28) {
            b.a(this.f5922R, z6);
            return;
        }
        Method method = f5948V;
        if (method != null) {
            try {
                method.invoke(this.f5922R, Boolean.valueOf(z6));
            } catch (Exception unused) {
                Log.i("MenuPopupWindow", "Could not invoke setTouchModal() on PopupWindow. Oh well.");
            }
        }
    }

    @Override // androidx.appcompat.widget.V
    public void d(androidx.appcompat.view.menu.g gVar, MenuItem menuItem) {
        V v6 = this.f5949U;
        if (v6 != null) {
            v6.d(gVar, menuItem);
        }
    }

    @Override // androidx.appcompat.widget.V
    public void g(androidx.appcompat.view.menu.g gVar, MenuItem menuItem) {
        V v6 = this.f5949U;
        if (v6 != null) {
            v6.g(gVar, menuItem);
        }
    }

    @Override // androidx.appcompat.widget.U
    P s(Context context, boolean z6) {
        c cVar = new c(context, z6);
        cVar.setHoverListener(this);
        return cVar;
    }
}
