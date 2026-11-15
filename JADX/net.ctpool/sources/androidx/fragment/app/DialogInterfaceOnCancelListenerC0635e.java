package androidx.fragment.app;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;

/* JADX INFO: renamed from: androidx.fragment.app.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class DialogInterfaceOnCancelListenerC0635e extends Fragment implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener {
    private static final String SAVED_BACK_STACK_ID = "android:backStackId";
    private static final String SAVED_CANCELABLE = "android:cancelable";
    private static final String SAVED_DIALOG_STATE_TAG = "android:savedDialogState";
    private static final String SAVED_INTERNAL_DIALOG_SHOWING = "android:dialogShowing";
    private static final String SAVED_SHOWS_DIALOG = "android:showsDialog";
    private static final String SAVED_STYLE = "android:style";
    private static final String SAVED_THEME = "android:theme";
    public static final int STYLE_NORMAL = 0;
    public static final int STYLE_NO_FRAME = 2;
    public static final int STYLE_NO_INPUT = 3;
    public static final int STYLE_NO_TITLE = 1;
    private boolean mCreatingDialog;
    private Dialog mDialog;
    private boolean mDismissed;
    private Handler mHandler;
    private boolean mShownByMe;
    private boolean mViewDestroyed;
    private Runnable mDismissRunnable = new a();
    private DialogInterface.OnCancelListener mOnCancelListener = new b();
    private DialogInterface.OnDismissListener mOnDismissListener = new c();
    private int mStyle = 0;
    private int mTheme = 0;
    private boolean mCancelable = true;
    private boolean mShowsDialog = true;
    private int mBackStackId = -1;
    private androidx.lifecycle.r mObserver = new d();
    private boolean mDialogCreated = false;

    /* JADX INFO: renamed from: androidx.fragment.app.e$a */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            DialogInterfaceOnCancelListenerC0635e.this.mOnDismissListener.onDismiss(DialogInterfaceOnCancelListenerC0635e.this.mDialog);
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.e$b */
    class b implements DialogInterface.OnCancelListener {
        b() {
        }

        @Override // android.content.DialogInterface.OnCancelListener
        public void onCancel(DialogInterface dialogInterface) {
            if (DialogInterfaceOnCancelListenerC0635e.this.mDialog != null) {
                DialogInterfaceOnCancelListenerC0635e dialogInterfaceOnCancelListenerC0635e = DialogInterfaceOnCancelListenerC0635e.this;
                dialogInterfaceOnCancelListenerC0635e.onCancel(dialogInterfaceOnCancelListenerC0635e.mDialog);
            }
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.e$c */
    class c implements DialogInterface.OnDismissListener {
        c() {
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public void onDismiss(DialogInterface dialogInterface) {
            if (DialogInterfaceOnCancelListenerC0635e.this.mDialog != null) {
                DialogInterfaceOnCancelListenerC0635e dialogInterfaceOnCancelListenerC0635e = DialogInterfaceOnCancelListenerC0635e.this;
                dialogInterfaceOnCancelListenerC0635e.onDismiss(dialogInterfaceOnCancelListenerC0635e.mDialog);
            }
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.e$d */
    class d implements androidx.lifecycle.r {
        d() {
        }

        @Override // androidx.lifecycle.r
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(androidx.lifecycle.l lVar) {
            if (lVar == null || !DialogInterfaceOnCancelListenerC0635e.this.mShowsDialog) {
                return;
            }
            View viewRequireView = DialogInterfaceOnCancelListenerC0635e.this.requireView();
            if (viewRequireView.getParent() != null) {
                throw new IllegalStateException("DialogFragment can not be attached to a container view");
            }
            if (DialogInterfaceOnCancelListenerC0635e.this.mDialog != null) {
                if (w.J0(3)) {
                    Log.d("FragmentManager", "DialogFragment " + this + " setting the content view on " + DialogInterfaceOnCancelListenerC0635e.this.mDialog);
                }
                DialogInterfaceOnCancelListenerC0635e.this.mDialog.setContentView(viewRequireView);
            }
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.e$e, reason: collision with other inner class name */
    class C0158e extends AbstractC0642l {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        final /* synthetic */ AbstractC0642l f8160m;

        C0158e(AbstractC0642l abstractC0642l) {
            this.f8160m = abstractC0642l;
        }

        @Override // androidx.fragment.app.AbstractC0642l
        public View f(int i7) {
            return this.f8160m.g() ? this.f8160m.f(i7) : DialogInterfaceOnCancelListenerC0635e.this.onFindViewById(i7);
        }

        @Override // androidx.fragment.app.AbstractC0642l
        public boolean g() {
            return this.f8160m.g() || DialogInterfaceOnCancelListenerC0635e.this.onHasView();
        }
    }

    private void s(boolean z6, boolean z7, boolean z8) {
        if (this.mDismissed) {
            return;
        }
        this.mDismissed = true;
        this.mShownByMe = false;
        Dialog dialog = this.mDialog;
        if (dialog != null) {
            dialog.setOnDismissListener(null);
            this.mDialog.dismiss();
            if (!z7) {
                if (Looper.myLooper() == this.mHandler.getLooper()) {
                    onDismiss(this.mDialog);
                } else {
                    this.mHandler.post(this.mDismissRunnable);
                }
            }
        }
        this.mViewDestroyed = true;
        if (this.mBackStackId >= 0) {
            if (z8) {
                getParentFragmentManager().f1(this.mBackStackId, 1);
            } else {
                getParentFragmentManager().d1(this.mBackStackId, 1, z6);
            }
            this.mBackStackId = -1;
            return;
        }
        E eP = getParentFragmentManager().p();
        eP.s(true);
        eP.m(this);
        if (z8) {
            eP.i();
        } else if (z6) {
            eP.h();
        } else {
            eP.g();
        }
    }

    private void t(Bundle bundle) {
        if (this.mShowsDialog && !this.mDialogCreated) {
            try {
                this.mCreatingDialog = true;
                Dialog dialogOnCreateDialog = onCreateDialog(bundle);
                this.mDialog = dialogOnCreateDialog;
                if (this.mShowsDialog) {
                    setupDialog(dialogOnCreateDialog, this.mStyle);
                    Context context = getContext();
                    if (context instanceof Activity) {
                        this.mDialog.setOwnerActivity((Activity) context);
                    }
                    this.mDialog.setCancelable(this.mCancelable);
                    this.mDialog.setOnCancelListener(this.mOnCancelListener);
                    this.mDialog.setOnDismissListener(this.mOnDismissListener);
                    this.mDialogCreated = true;
                } else {
                    this.mDialog = null;
                }
                this.mCreatingDialog = false;
            } catch (Throwable th) {
                this.mCreatingDialog = false;
                throw th;
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    AbstractC0642l createFragmentContainer() {
        return new C0158e(super.createFragmentContainer());
    }

    public void dismiss() {
        s(false, false, false);
    }

    public void dismissAllowingStateLoss() {
        s(true, false, false);
    }

    public void dismissNow() {
        s(false, false, true);
    }

    public Dialog getDialog() {
        return this.mDialog;
    }

    public boolean getShowsDialog() {
        return this.mShowsDialog;
    }

    public int getTheme() {
        return this.mTheme;
    }

    public boolean isCancelable() {
        return this.mCancelable;
    }

    @Override // androidx.fragment.app.Fragment
    @Deprecated
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        getViewLifecycleOwnerLiveData().i(this.mObserver);
        if (this.mShownByMe) {
            return;
        }
        this.mDismissed = false;
    }

    public void onCancel(DialogInterface dialogInterface) {
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.mHandler = new Handler();
        this.mShowsDialog = this.mContainerId == 0;
        if (bundle != null) {
            this.mStyle = bundle.getInt(SAVED_STYLE, 0);
            this.mTheme = bundle.getInt(SAVED_THEME, 0);
            this.mCancelable = bundle.getBoolean(SAVED_CANCELABLE, true);
            this.mShowsDialog = bundle.getBoolean(SAVED_SHOWS_DIALOG, this.mShowsDialog);
            this.mBackStackId = bundle.getInt(SAVED_BACK_STACK_ID, -1);
        }
    }

    public Dialog onCreateDialog(Bundle bundle) {
        if (w.J0(3)) {
            Log.d("FragmentManager", "onCreateDialog called for DialogFragment " + this);
        }
        return new androidx.activity.g(requireContext(), getTheme());
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        Dialog dialog = this.mDialog;
        if (dialog != null) {
            this.mViewDestroyed = true;
            dialog.setOnDismissListener(null);
            this.mDialog.dismiss();
            if (!this.mDismissed) {
                onDismiss(this.mDialog);
            }
            this.mDialog = null;
            this.mDialogCreated = false;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDetach() {
        super.onDetach();
        if (!this.mShownByMe && !this.mDismissed) {
            this.mDismissed = true;
        }
        getViewLifecycleOwnerLiveData().m(this.mObserver);
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        if (this.mViewDestroyed) {
            return;
        }
        if (w.J0(3)) {
            Log.d("FragmentManager", "onDismiss called for DialogFragment " + this);
        }
        s(true, true, false);
    }

    View onFindViewById(int i7) {
        Dialog dialog = this.mDialog;
        if (dialog != null) {
            return dialog.findViewById(i7);
        }
        return null;
    }

    @Override // androidx.fragment.app.Fragment
    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        StringBuilder sb;
        String str;
        LayoutInflater layoutInflaterOnGetLayoutInflater = super.onGetLayoutInflater(bundle);
        if (this.mShowsDialog && !this.mCreatingDialog) {
            t(bundle);
            if (w.J0(2)) {
                Log.d("FragmentManager", "get layout inflater for DialogFragment " + this + " from dialog context");
            }
            Dialog dialog = this.mDialog;
            return dialog != null ? layoutInflaterOnGetLayoutInflater.cloneInContext(dialog.getContext()) : layoutInflaterOnGetLayoutInflater;
        }
        if (w.J0(2)) {
            String str2 = "getting layout inflater for DialogFragment " + this;
            if (this.mShowsDialog) {
                sb = new StringBuilder();
                str = "mCreatingDialog = true: ";
            } else {
                sb = new StringBuilder();
                str = "mShowsDialog = false: ";
            }
            sb.append(str);
            sb.append(str2);
            Log.d("FragmentManager", sb.toString());
        }
        return layoutInflaterOnGetLayoutInflater;
    }

    boolean onHasView() {
        return this.mDialogCreated;
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        Dialog dialog = this.mDialog;
        if (dialog != null) {
            Bundle bundleOnSaveInstanceState = dialog.onSaveInstanceState();
            bundleOnSaveInstanceState.putBoolean(SAVED_INTERNAL_DIALOG_SHOWING, false);
            bundle.putBundle(SAVED_DIALOG_STATE_TAG, bundleOnSaveInstanceState);
        }
        int i7 = this.mStyle;
        if (i7 != 0) {
            bundle.putInt(SAVED_STYLE, i7);
        }
        int i8 = this.mTheme;
        if (i8 != 0) {
            bundle.putInt(SAVED_THEME, i8);
        }
        boolean z6 = this.mCancelable;
        if (!z6) {
            bundle.putBoolean(SAVED_CANCELABLE, z6);
        }
        boolean z7 = this.mShowsDialog;
        if (!z7) {
            bundle.putBoolean(SAVED_SHOWS_DIALOG, z7);
        }
        int i9 = this.mBackStackId;
        if (i9 != -1) {
            bundle.putInt(SAVED_BACK_STACK_ID, i9);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        Dialog dialog = this.mDialog;
        if (dialog != null) {
            this.mViewDestroyed = false;
            dialog.show();
            View decorView = this.mDialog.getWindow().getDecorView();
            androidx.lifecycle.J.a(decorView, this);
            androidx.lifecycle.K.a(decorView, this);
            Y.f.a(decorView, this);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        Dialog dialog = this.mDialog;
        if (dialog != null) {
            dialog.hide();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewStateRestored(Bundle bundle) {
        Bundle bundle2;
        super.onViewStateRestored(bundle);
        if (this.mDialog == null || bundle == null || (bundle2 = bundle.getBundle(SAVED_DIALOG_STATE_TAG)) == null) {
            return;
        }
        this.mDialog.onRestoreInstanceState(bundle2);
    }

    @Override // androidx.fragment.app.Fragment
    void performCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Bundle bundle2;
        super.performCreateView(layoutInflater, viewGroup, bundle);
        if (this.mView != null || this.mDialog == null || bundle == null || (bundle2 = bundle.getBundle(SAVED_DIALOG_STATE_TAG)) == null) {
            return;
        }
        this.mDialog.onRestoreInstanceState(bundle2);
    }

    public final Dialog requireDialog() {
        Dialog dialog = getDialog();
        if (dialog != null) {
            return dialog;
        }
        throw new IllegalStateException("DialogFragment " + this + " does not have a Dialog.");
    }

    public void setCancelable(boolean z6) {
        this.mCancelable = z6;
        Dialog dialog = this.mDialog;
        if (dialog != null) {
            dialog.setCancelable(z6);
        }
    }

    public void setShowsDialog(boolean z6) {
        this.mShowsDialog = z6;
    }

    public void setStyle(int i7, int i8) {
        if (w.J0(2)) {
            Log.d("FragmentManager", "Setting style and theme for DialogFragment " + this + " to " + i7 + ", " + i8);
        }
        this.mStyle = i7;
        if (i7 == 2 || i7 == 3) {
            this.mTheme = R.style.Theme.Panel;
        }
        if (i8 != 0) {
            this.mTheme = i8;
        }
    }

    public void setupDialog(Dialog dialog, int i7) {
        if (i7 != 1 && i7 != 2) {
            if (i7 != 3) {
                return;
            }
            Window window = dialog.getWindow();
            if (window != null) {
                window.addFlags(24);
            }
        }
        dialog.requestWindowFeature(1);
    }

    public int show(E e7, String str) {
        this.mDismissed = false;
        this.mShownByMe = true;
        e7.e(this, str);
        this.mViewDestroyed = false;
        int iG = e7.g();
        this.mBackStackId = iG;
        return iG;
    }

    public void showNow(w wVar, String str) {
        this.mDismissed = false;
        this.mShownByMe = true;
        E eP = wVar.p();
        eP.s(true);
        eP.e(this, str);
        eP.i();
    }

    public void show(w wVar, String str) {
        this.mDismissed = false;
        this.mShownByMe = true;
        E eP = wVar.p();
        eP.s(true);
        eP.e(this, str);
        eP.g();
    }
}
