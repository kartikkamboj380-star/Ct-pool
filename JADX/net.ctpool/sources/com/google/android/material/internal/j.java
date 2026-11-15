package com.google.android.material.internal;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextPaint;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public class j {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f17028c;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private K3.d f17031f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final TextPaint f17026a = new TextPaint(1);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final K3.f f17027b = new a();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f17029d = true;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private WeakReference f17030e = new WeakReference(null);

    class a extends K3.f {
        a() {
        }

        @Override // K3.f
        public void a(int i7) {
            j.this.f17029d = true;
            b bVar = (b) j.this.f17030e.get();
            if (bVar != null) {
                bVar.a();
            }
        }

        @Override // K3.f
        public void b(Typeface typeface, boolean z6) {
            if (z6) {
                return;
            }
            j.this.f17029d = true;
            b bVar = (b) j.this.f17030e.get();
            if (bVar != null) {
                bVar.a();
            }
        }
    }

    public interface b {
        void a();

        int[] getState();

        boolean onStateChange(int[] iArr);
    }

    public j(b bVar) {
        g(bVar);
    }

    private float c(CharSequence charSequence) {
        if (charSequence == null) {
            return 0.0f;
        }
        return this.f17026a.measureText(charSequence, 0, charSequence.length());
    }

    public K3.d d() {
        return this.f17031f;
    }

    public TextPaint e() {
        return this.f17026a;
    }

    public float f(String str) {
        if (!this.f17029d) {
            return this.f17028c;
        }
        float fC = c(str);
        this.f17028c = fC;
        this.f17029d = false;
        return fC;
    }

    public void g(b bVar) {
        this.f17030e = new WeakReference(bVar);
    }

    public void h(K3.d dVar, Context context) {
        if (this.f17031f != dVar) {
            this.f17031f = dVar;
            if (dVar != null) {
                dVar.o(context, this.f17026a, this.f17027b);
                b bVar = (b) this.f17030e.get();
                if (bVar != null) {
                    this.f17026a.drawableState = bVar.getState();
                }
                dVar.n(context, this.f17026a, this.f17027b);
                this.f17029d = true;
            }
            b bVar2 = (b) this.f17030e.get();
            if (bVar2 != null) {
                bVar2.a();
                bVar2.onStateChange(bVar2.getState());
            }
        }
    }

    public void i(boolean z6) {
        this.f17029d = z6;
    }

    public void j(Context context) {
        this.f17031f.n(context, this.f17026a, this.f17027b);
    }
}
