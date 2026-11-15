package com.google.android.gms.common.images;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import com.google.android.gms.common.internal.Asserts;
import com.google.android.gms.internal.base.l;

/* JADX INFO: loaded from: classes.dex */
public abstract class zag {
    final d zaa;
    protected int zab;

    public zag(Uri uri, int i7) {
        this.zab = 0;
        this.zaa = new d(uri);
        this.zab = i7;
    }

    protected abstract void zaa(Drawable drawable, boolean z6, boolean z7, boolean z8);

    final void zab(Context context, l lVar, boolean z6) {
        int i7 = this.zab;
        zaa(i7 != 0 ? context.getResources().getDrawable(i7) : null, z6, false, false);
    }

    final void zac(Context context, Bitmap bitmap, boolean z6) {
        Asserts.checkNotNull(bitmap);
        zaa(new BitmapDrawable(context.getResources(), bitmap), false, false, true);
    }
}
