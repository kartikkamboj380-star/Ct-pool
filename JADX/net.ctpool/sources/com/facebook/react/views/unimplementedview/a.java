package com.facebook.react.views.unimplementedview;

import android.content.Context;
import android.widget.LinearLayout;
import androidx.appcompat.widget.D;
import w5.k;

/* JADX INFO: loaded from: classes.dex */
public final class a extends LinearLayout {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final D f13241m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Context context) {
        super(context);
        k.f(context, "context");
        D d7 = new D(context);
        this.f13241m = d7;
        d7.setLayoutParams(new LinearLayout.LayoutParams(-2, -1));
        d7.setGravity(17);
        d7.setTextColor(-1);
        setBackgroundColor(1442775040);
        setGravity(1);
        setOrientation(1);
        addView(d7);
    }

    public final void setName(String str) {
        k.f(str, "name");
        this.f13241m.setText("'" + str + "' is not Fabric compatible yet.");
    }
}
