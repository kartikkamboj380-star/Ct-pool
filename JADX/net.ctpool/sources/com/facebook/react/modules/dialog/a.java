package com.facebook.react.modules.dialog;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.os.Bundle;
import androidx.appcompat.app.DialogInterfaceC0522b;
import androidx.fragment.app.DialogInterfaceOnCancelListenerC0635e;
import com.facebook.react.modules.dialog.DialogModule;
import e.j;

/* JADX INFO: loaded from: classes.dex */
public class a extends DialogInterfaceOnCancelListenerC0635e implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final DialogModule.b f11896m;

    public a() {
        this.f11896m = null;
    }

    private static Dialog u(Context context, Bundle bundle, DialogInterface.OnClickListener onClickListener) {
        DialogInterfaceC0522b.a aVarM = new DialogInterfaceC0522b.a(context).m(bundle.getString("title"));
        if (bundle.containsKey("button_positive")) {
            aVarM.k(bundle.getString("button_positive"), onClickListener);
        }
        if (bundle.containsKey("button_negative")) {
            aVarM.h(bundle.getString("button_negative"), onClickListener);
        }
        if (bundle.containsKey("button_neutral")) {
            aVarM.i(bundle.getString("button_neutral"), onClickListener);
        }
        if (bundle.containsKey("message")) {
            aVarM.g(bundle.getString("message"));
        }
        if (bundle.containsKey("items")) {
            aVarM.f(bundle.getCharSequenceArray("items"), onClickListener);
        }
        return aVarM.a();
    }

    private static Dialog v(Context context, Bundle bundle, DialogInterface.OnClickListener onClickListener) {
        AlertDialog.Builder title = new AlertDialog.Builder(context).setTitle(bundle.getString("title"));
        if (bundle.containsKey("button_positive")) {
            title.setPositiveButton(bundle.getString("button_positive"), onClickListener);
        }
        if (bundle.containsKey("button_negative")) {
            title.setNegativeButton(bundle.getString("button_negative"), onClickListener);
        }
        if (bundle.containsKey("button_neutral")) {
            title.setNeutralButton(bundle.getString("button_neutral"), onClickListener);
        }
        if (bundle.containsKey("message")) {
            title.setMessage(bundle.getString("message"));
        }
        if (bundle.containsKey("items")) {
            title.setItems(bundle.getCharSequenceArray("items"), onClickListener);
        }
        return title.create();
    }

    public static Dialog w(Context context, Bundle bundle, DialogInterface.OnClickListener onClickListener) {
        return x(context) ? u(context, bundle, onClickListener) : v(context, bundle, onClickListener);
    }

    private static boolean x(Context context) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(j.f19144y0);
        boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(j.f18917D0);
        typedArrayObtainStyledAttributes.recycle();
        return zHasValue;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialogInterface, int i7) {
        DialogModule.b bVar = this.f11896m;
        if (bVar != null) {
            bVar.onClick(dialogInterface, i7);
        }
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0635e
    public Dialog onCreateDialog(Bundle bundle) {
        return w(requireActivity(), requireArguments(), this);
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0635e, android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        DialogModule.b bVar = this.f11896m;
        if (bVar != null) {
            bVar.onDismiss(dialogInterface);
        }
    }

    public a(DialogModule.b bVar, Bundle bundle) {
        this.f11896m = bVar;
        setArguments(bundle);
    }
}
