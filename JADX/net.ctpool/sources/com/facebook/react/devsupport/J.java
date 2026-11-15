package com.facebook.react.devsupport;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.facebook.react.AbstractC0831n;
import com.facebook.react.AbstractC0833p;
import com.facebook.react.bridge.ReactContext;
import java.util.Arrays;
import java.util.Locale;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
public final class J extends FrameLayout {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final a f11522p = new a(null);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final TextView f11523m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final com.facebook.react.modules.debug.f f11524n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final b f11525o;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private final class b implements Runnable {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private boolean f11526m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private int f11527n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private int f11528o;

        public b() {
        }

        public final void a() {
            this.f11526m = false;
            J.this.post(this);
        }

        public final void b() {
            this.f11526m = true;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f11526m) {
                return;
            }
            this.f11527n += J.this.f11524n.d() - J.this.f11524n.g();
            this.f11528o += J.this.f11524n.c();
            J j7 = J.this;
            j7.c(j7.f11524n.e(), J.this.f11524n.f(), this.f11527n, this.f11528o);
            J.this.f11524n.j();
            J.this.postDelayed(this, 500L);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public J(ReactContext reactContext) {
        super(reactContext);
        w5.k.c(reactContext);
        View.inflate(reactContext, AbstractC0833p.f11999b, this);
        View viewFindViewById = findViewById(AbstractC0831n.f11982l);
        w5.k.d(viewFindViewById, "null cannot be cast to non-null type android.widget.TextView");
        this.f11523m = (TextView) viewFindViewById;
        this.f11524n = new com.facebook.react.modules.debug.f(reactContext);
        this.f11525o = new b();
        c(0.0d, 0.0d, 0, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void c(double d7, double d8, int i7, int i8) {
        w5.y yVar = w5.y.f22743a;
        String str = String.format(Locale.US, "UI: %.1f fps\n%d dropped so far\n%d stutters (4+) so far\nJS: %.1f fps", Arrays.copyOf(new Object[]{Double.valueOf(d7), Integer.valueOf(i7), Integer.valueOf(i8), Double.valueOf(d8)}, 4));
        w5.k.e(str, "format(...)");
        this.f11523m.setText(str);
        P0.a.b("ReactNative", str);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f11524n.j();
        com.facebook.react.modules.debug.f.l(this.f11524n, 0.0d, 1, null);
        this.f11525o.a();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f11524n.n();
        this.f11525o.b();
    }
}
