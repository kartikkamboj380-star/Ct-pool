package com.facebook.react.devsupport;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.widget.EditText;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
public final class I {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final a f11519b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f11520a;

    private static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(I i7) {
        w5.k.f(i7, "this$0");
        i7.f11520a = false;
    }

    public final boolean b(int i7, View view) {
        if (i7 == 46 && !(view instanceof EditText)) {
            if (this.f11520a) {
                this.f11520a = false;
                return true;
            }
            this.f11520a = true;
            new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: com.facebook.react.devsupport.H
                @Override // java.lang.Runnable
                public final void run() {
                    I.c(this.f11518m);
                }
            }, 200L);
        }
        return false;
    }
}
