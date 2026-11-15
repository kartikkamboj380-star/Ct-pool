package androidx.core.view.accessibility;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;

/* JADX INFO: renamed from: androidx.core.view.accessibility.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0576a extends ClickableSpan {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final int f7395m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final C f7396n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final int f7397o;

    public C0576a(int i7, C c7, int i8) {
        this.f7395m = i7;
        this.f7396n = c7;
        this.f7397o = i8;
    }

    @Override // android.text.style.ClickableSpan
    public void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.f7395m);
        this.f7396n.W(this.f7397o, bundle);
    }
}
