package M2;

import android.content.Context;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.uimanager.AbstractC0884k0;

/* JADX INFO: loaded from: classes.dex */
public final class f extends ClickableSpan implements h {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final int f2034m;

    public f(int i7) {
        this.f2034m = i7;
    }

    @Override // android.text.style.ClickableSpan
    public void onClick(View view) {
        w5.k.f(view, "view");
        Context context = view.getContext();
        w5.k.d(context, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
        ReactContext reactContext = (ReactContext) context;
        com.facebook.react.uimanager.events.e eVarC = AbstractC0884k0.c(reactContext, this.f2034m);
        if (eVarC != null) {
            eVarC.c(new com.facebook.react.views.view.j(AbstractC0884k0.e(reactContext), this.f2034m));
        }
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public void updateDrawState(TextPaint textPaint) {
        w5.k.f(textPaint, "ds");
    }
}
