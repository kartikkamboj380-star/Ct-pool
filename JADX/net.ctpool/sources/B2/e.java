package B2;

import android.os.Handler;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.UiThreadUtil;

/* JADX INFO: loaded from: classes.dex */
public class e {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f707e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Runnable f709g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final B2.a f703a = new h();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final B2.a f704b = new k();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final B2.a f705c = new i();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final SparseArray f706d = new SparseArray(0);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f708f = -1;

    class a implements Runnable {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        final /* synthetic */ Callback f710m;

        a(Callback callback) {
            this.f710m = callback;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f710m.invoke(Boolean.TRUE);
        }
    }

    private void d(View view) {
        view.setClickable(false);
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i7 = 0; i7 < viewGroup.getChildCount(); i7++) {
                d(viewGroup.getChildAt(i7));
            }
        }
    }

    private void g(long j7) {
        if (this.f709g != null) {
            Handler uiThreadHandler = UiThreadUtil.getUiThreadHandler();
            uiThreadHandler.removeCallbacks(this.f709g);
            uiThreadHandler.postDelayed(this.f709g, j7);
        }
    }

    public void b(View view, int i7, int i8, int i9, int i10) {
        UiThreadUtil.assertOnUiThread();
        int id = view.getId();
        j jVar = (j) this.f706d.get(id);
        if (jVar != null) {
            jVar.a(i7, i8, i9, i10);
            return;
        }
        Animation animationA = ((view.getWidth() == 0 || view.getHeight() == 0) ? this.f703a : this.f704b).a(view, i7, i8, i9, i10);
        if (animationA instanceof j) {
            animationA.setAnimationListener(new b(id));
        } else {
            view.layout(i7, i8, i9 + i7, i10 + i8);
        }
        if (animationA != null) {
            long duration = animationA.getDuration();
            if (duration > this.f708f) {
                this.f708f = duration;
                g(duration);
            }
            view.startAnimation(animationA);
        }
    }

    public void c(View view, f fVar) {
        UiThreadUtil.assertOnUiThread();
        Animation animationA = this.f705c.a(view, view.getLeft(), view.getTop(), view.getWidth(), view.getHeight());
        if (animationA == null) {
            fVar.a();
            return;
        }
        d(view);
        animationA.setAnimationListener(new c(fVar));
        long duration = animationA.getDuration();
        if (duration > this.f708f) {
            g(duration);
            this.f708f = duration;
        }
        view.startAnimation(animationA);
    }

    public void e(ReadableMap readableMap, Callback callback) {
        if (readableMap == null) {
            f();
            return;
        }
        this.f707e = false;
        int i7 = readableMap.hasKey("duration") ? readableMap.getInt("duration") : 0;
        g gVar = g.f717n;
        if (readableMap.hasKey(g.h(gVar))) {
            this.f703a.d(readableMap.getMap(g.h(gVar)), i7);
            this.f707e = true;
        }
        g gVar2 = g.f718o;
        if (readableMap.hasKey(g.h(gVar2))) {
            this.f704b.d(readableMap.getMap(g.h(gVar2)), i7);
            this.f707e = true;
        }
        g gVar3 = g.f719p;
        if (readableMap.hasKey(g.h(gVar3))) {
            this.f705c.d(readableMap.getMap(g.h(gVar3)), i7);
            this.f707e = true;
        }
        if (!this.f707e || callback == null) {
            return;
        }
        this.f709g = new a(callback);
    }

    public void f() {
        this.f703a.f();
        this.f704b.f();
        this.f705c.f();
        this.f709g = null;
        this.f707e = false;
        this.f708f = -1L;
    }

    public boolean h(View view) {
        if (view == null) {
            return false;
        }
        return (this.f707e && view.getParent() != null) || this.f706d.get(view.getId()) != null;
    }

    class b implements Animation.AnimationListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f712a;

        b(int i7) {
            this.f712a = i7;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            e.this.f706d.remove(this.f712a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
            e.this.f706d.put(this.f712a, (j) animation);
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }
    }

    class c implements Animation.AnimationListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ f f714a;

        c(f fVar) {
            this.f714a = fVar;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            this.f714a.a();
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }
    }
}
