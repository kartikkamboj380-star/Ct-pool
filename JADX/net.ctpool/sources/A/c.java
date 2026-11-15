package A;

import android.content.Context;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
import androidx.core.view.H;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public class c {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final Interpolator f18x = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f19a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f20b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private float[] f22d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float[] f23e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private float[] f24f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private float[] f25g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int[] f26h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int[] f27i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int[] f28j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f29k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private VelocityTracker f30l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private float f31m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private float f32n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f33o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final int f34p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f35q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private OverScroller f36r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final AbstractC0002c f37s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private View f38t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private boolean f39u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final ViewGroup f40v;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f21c = -1;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final Runnable f41w = new b();

    class a implements Interpolator {
        a() {
        }

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f7) {
            float f8 = f7 - 1.0f;
            return (f8 * f8 * f8 * f8 * f8) + 1.0f;
        }
    }

    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            c.this.K(0);
        }
    }

    private c(Context context, ViewGroup viewGroup, AbstractC0002c abstractC0002c) {
        if (viewGroup == null) {
            throw new IllegalArgumentException("Parent view may not be null");
        }
        if (abstractC0002c == null) {
            throw new IllegalArgumentException("Callback may not be null");
        }
        this.f40v = viewGroup;
        this.f37s = abstractC0002c;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        int i7 = (int) ((context.getResources().getDisplayMetrics().density * 20.0f) + 0.5f);
        this.f34p = i7;
        this.f33o = i7;
        this.f20b = viewConfiguration.getScaledTouchSlop();
        this.f31m = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f32n = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f36r = new OverScroller(context, f18x);
    }

    private boolean D(int i7) {
        if (C(i7)) {
            return true;
        }
        Log.e("ViewDragHelper", "Ignoring pointerId=" + i7 + " because ACTION_DOWN was not received for this pointer before ACTION_MOVE. It likely happened because  ViewDragHelper did not receive all the events in the event stream.");
        return false;
    }

    private void G() {
        this.f30l.computeCurrentVelocity(1000, this.f31m);
        p(g(this.f30l.getXVelocity(this.f21c), this.f32n, this.f31m), g(this.f30l.getYVelocity(this.f21c), this.f32n, this.f31m));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [int] */
    /* JADX WARN: Type inference failed for: r3v3, types: [A.c$c] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    private void H(float f7, float f8, int i7) {
        boolean zC = c(f7, f8, i7, 1);
        ?? r02 = zC;
        if (c(f8, f7, i7, 4)) {
            r02 = (zC ? 1 : 0) | 4;
        }
        ?? r03 = r02;
        if (c(f7, f8, i7, 2)) {
            r03 = (r02 == true ? 1 : 0) | 2;
        }
        ?? r04 = r03;
        if (c(f8, f7, i7, 8)) {
            r04 = (r03 == true ? 1 : 0) | 8;
        }
        if (r04 != 0) {
            int[] iArr = this.f27i;
            iArr[i7] = iArr[i7] | r04;
            this.f37s.f(r04, i7);
        }
    }

    private void I(float f7, float f8, int i7) {
        s(i7);
        float[] fArr = this.f22d;
        this.f24f[i7] = f7;
        fArr[i7] = f7;
        float[] fArr2 = this.f23e;
        this.f25g[i7] = f8;
        fArr2[i7] = f8;
        this.f26h[i7] = y((int) f7, (int) f8);
        this.f29k |= 1 << i7;
    }

    private void J(MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i7 = 0; i7 < pointerCount; i7++) {
            int pointerId = motionEvent.getPointerId(i7);
            if (D(pointerId)) {
                float x6 = motionEvent.getX(i7);
                float y6 = motionEvent.getY(i7);
                this.f24f[pointerId] = x6;
                this.f25g[pointerId] = y6;
            }
        }
    }

    private boolean c(float f7, float f8, int i7, int i8) {
        float fAbs = Math.abs(f7);
        float fAbs2 = Math.abs(f8);
        if ((this.f26h[i7] & i8) != i8 || (this.f35q & i8) == 0 || (this.f28j[i7] & i8) == i8 || (this.f27i[i7] & i8) == i8) {
            return false;
        }
        int i9 = this.f20b;
        if (fAbs <= i9 && fAbs2 <= i9) {
            return false;
        }
        if (fAbs >= fAbs2 * 0.5f || !this.f37s.g(i8)) {
            return (this.f27i[i7] & i8) == 0 && fAbs > ((float) this.f20b);
        }
        int[] iArr = this.f28j;
        iArr[i7] = iArr[i7] | i8;
        return false;
    }

    private boolean f(View view, float f7, float f8) {
        if (view == null) {
            return false;
        }
        boolean z6 = this.f37s.d(view) > 0;
        boolean z7 = this.f37s.e(view) > 0;
        if (!z6 || !z7) {
            return z6 ? Math.abs(f7) > ((float) this.f20b) : z7 && Math.abs(f8) > ((float) this.f20b);
        }
        float f9 = (f7 * f7) + (f8 * f8);
        int i7 = this.f20b;
        return f9 > ((float) (i7 * i7));
    }

    private float g(float f7, float f8, float f9) {
        float fAbs = Math.abs(f7);
        if (fAbs < f8) {
            return 0.0f;
        }
        return fAbs > f9 ? f7 > 0.0f ? f9 : -f9 : f7;
    }

    private int h(int i7, int i8, int i9) {
        int iAbs = Math.abs(i7);
        if (iAbs < i8) {
            return 0;
        }
        return iAbs > i9 ? i7 > 0 ? i9 : -i9 : i7;
    }

    private void i() {
        float[] fArr = this.f22d;
        if (fArr == null) {
            return;
        }
        Arrays.fill(fArr, 0.0f);
        Arrays.fill(this.f23e, 0.0f);
        Arrays.fill(this.f24f, 0.0f);
        Arrays.fill(this.f25g, 0.0f);
        Arrays.fill(this.f26h, 0);
        Arrays.fill(this.f27i, 0);
        Arrays.fill(this.f28j, 0);
        this.f29k = 0;
    }

    private void j(int i7) {
        if (this.f22d == null || !C(i7)) {
            return;
        }
        this.f22d[i7] = 0.0f;
        this.f23e[i7] = 0.0f;
        this.f24f[i7] = 0.0f;
        this.f25g[i7] = 0.0f;
        this.f26h[i7] = 0;
        this.f27i[i7] = 0;
        this.f28j[i7] = 0;
        this.f29k = (~(1 << i7)) & this.f29k;
    }

    private int k(int i7, int i8, int i9) {
        if (i7 == 0) {
            return 0;
        }
        int width = this.f40v.getWidth();
        float f7 = width / 2;
        float fQ = f7 + (q(Math.min(1.0f, Math.abs(i7) / width)) * f7);
        int iAbs = Math.abs(i8);
        return Math.min(iAbs > 0 ? Math.round(Math.abs(fQ / iAbs) * 1000.0f) * 4 : (int) (((Math.abs(i7) / i9) + 1.0f) * 256.0f), 600);
    }

    private int l(View view, int i7, int i8, int i9, int i10) {
        float f7;
        float f8;
        float f9;
        float f10;
        int iH = h(i9, (int) this.f32n, (int) this.f31m);
        int iH2 = h(i10, (int) this.f32n, (int) this.f31m);
        int iAbs = Math.abs(i7);
        int iAbs2 = Math.abs(i8);
        int iAbs3 = Math.abs(iH);
        int iAbs4 = Math.abs(iH2);
        int i11 = iAbs3 + iAbs4;
        int i12 = iAbs + iAbs2;
        if (iH != 0) {
            f7 = iAbs3;
            f8 = i11;
        } else {
            f7 = iAbs;
            f8 = i12;
        }
        float f11 = f7 / f8;
        if (iH2 != 0) {
            f9 = iAbs4;
            f10 = i11;
        } else {
            f9 = iAbs2;
            f10 = i12;
        }
        return (int) ((k(i7, iH, this.f37s.d(view)) * f11) + (k(i8, iH2, this.f37s.e(view)) * (f9 / f10)));
    }

    public static c n(ViewGroup viewGroup, float f7, AbstractC0002c abstractC0002c) {
        c cVarO = o(viewGroup, abstractC0002c);
        cVarO.f20b = (int) (cVarO.f20b * (1.0f / f7));
        return cVarO;
    }

    public static c o(ViewGroup viewGroup, AbstractC0002c abstractC0002c) {
        return new c(viewGroup.getContext(), viewGroup, abstractC0002c);
    }

    private void p(float f7, float f8) {
        this.f39u = true;
        this.f37s.l(this.f38t, f7, f8);
        this.f39u = false;
        if (this.f19a == 1) {
            K(0);
        }
    }

    private float q(float f7) {
        return (float) Math.sin((f7 - 0.5f) * 0.47123894f);
    }

    private void r(int i7, int i8, int i9, int i10) {
        int left = this.f38t.getLeft();
        int top = this.f38t.getTop();
        if (i9 != 0) {
            i7 = this.f37s.a(this.f38t, i7, i9);
            H.Z(this.f38t, i7 - left);
        }
        int i11 = i7;
        if (i10 != 0) {
            i8 = this.f37s.b(this.f38t, i8, i10);
            H.a0(this.f38t, i8 - top);
        }
        int i12 = i8;
        if (i9 == 0 && i10 == 0) {
            return;
        }
        this.f37s.k(this.f38t, i11, i12, i11 - left, i12 - top);
    }

    private void s(int i7) {
        float[] fArr = this.f22d;
        if (fArr == null || fArr.length <= i7) {
            int i8 = i7 + 1;
            float[] fArr2 = new float[i8];
            float[] fArr3 = new float[i8];
            float[] fArr4 = new float[i8];
            float[] fArr5 = new float[i8];
            int[] iArr = new int[i8];
            int[] iArr2 = new int[i8];
            int[] iArr3 = new int[i8];
            if (fArr != null) {
                System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
                float[] fArr6 = this.f23e;
                System.arraycopy(fArr6, 0, fArr3, 0, fArr6.length);
                float[] fArr7 = this.f24f;
                System.arraycopy(fArr7, 0, fArr4, 0, fArr7.length);
                float[] fArr8 = this.f25g;
                System.arraycopy(fArr8, 0, fArr5, 0, fArr8.length);
                int[] iArr4 = this.f26h;
                System.arraycopy(iArr4, 0, iArr, 0, iArr4.length);
                int[] iArr5 = this.f27i;
                System.arraycopy(iArr5, 0, iArr2, 0, iArr5.length);
                int[] iArr6 = this.f28j;
                System.arraycopy(iArr6, 0, iArr3, 0, iArr6.length);
            }
            this.f22d = fArr2;
            this.f23e = fArr3;
            this.f24f = fArr4;
            this.f25g = fArr5;
            this.f26h = iArr;
            this.f27i = iArr2;
            this.f28j = iArr3;
        }
    }

    private boolean u(int i7, int i8, int i9, int i10) {
        int left = this.f38t.getLeft();
        int top = this.f38t.getTop();
        int i11 = i7 - left;
        int i12 = i8 - top;
        if (i11 == 0 && i12 == 0) {
            this.f36r.abortAnimation();
            K(0);
            return false;
        }
        this.f36r.startScroll(left, top, i11, i12, l(this.f38t, i11, i12, i9, i10));
        K(2);
        return true;
    }

    private int y(int i7, int i8) {
        int i9 = i7 < this.f40v.getLeft() + this.f33o ? 1 : 0;
        if (i8 < this.f40v.getTop() + this.f33o) {
            i9 |= 4;
        }
        if (i7 > this.f40v.getRight() - this.f33o) {
            i9 |= 2;
        }
        return i8 > this.f40v.getBottom() - this.f33o ? i9 | 8 : i9;
    }

    public int A() {
        return this.f19a;
    }

    public boolean B(int i7, int i8) {
        return E(this.f38t, i7, i8);
    }

    public boolean C(int i7) {
        return ((1 << i7) & this.f29k) != 0;
    }

    public boolean E(View view, int i7, int i8) {
        return view != null && i7 >= view.getLeft() && i7 < view.getRight() && i8 >= view.getTop() && i8 < view.getBottom();
    }

    public void F(MotionEvent motionEvent) {
        int i7;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            a();
        }
        if (this.f30l == null) {
            this.f30l = VelocityTracker.obtain();
        }
        this.f30l.addMovement(motionEvent);
        int i8 = 0;
        if (actionMasked == 0) {
            float x6 = motionEvent.getX();
            float y6 = motionEvent.getY();
            int pointerId = motionEvent.getPointerId(0);
            View viewT = t((int) x6, (int) y6);
            I(x6, y6, pointerId);
            R(viewT, pointerId);
            int i9 = this.f26h[pointerId];
            int i10 = this.f35q;
            if ((i9 & i10) != 0) {
                this.f37s.h(i9 & i10, pointerId);
                return;
            }
            return;
        }
        if (actionMasked != 1) {
            if (actionMasked == 2) {
                if (this.f19a != 1) {
                    int pointerCount = motionEvent.getPointerCount();
                    while (i8 < pointerCount) {
                        int pointerId2 = motionEvent.getPointerId(i8);
                        if (D(pointerId2)) {
                            float x7 = motionEvent.getX(i8);
                            float y7 = motionEvent.getY(i8);
                            float f7 = x7 - this.f22d[pointerId2];
                            float f8 = y7 - this.f23e[pointerId2];
                            H(f7, f8, pointerId2);
                            if (this.f19a != 1) {
                                View viewT2 = t((int) x7, (int) y7);
                                if (f(viewT2, f7, f8) && R(viewT2, pointerId2)) {
                                    break;
                                }
                            } else {
                                break;
                            }
                        }
                        i8++;
                    }
                } else {
                    if (!D(this.f21c)) {
                        return;
                    }
                    int iFindPointerIndex = motionEvent.findPointerIndex(this.f21c);
                    float x8 = motionEvent.getX(iFindPointerIndex);
                    float y8 = motionEvent.getY(iFindPointerIndex);
                    float[] fArr = this.f24f;
                    int i11 = this.f21c;
                    int i12 = (int) (x8 - fArr[i11]);
                    int i13 = (int) (y8 - this.f25g[i11]);
                    r(this.f38t.getLeft() + i12, this.f38t.getTop() + i13, i12, i13);
                }
                J(motionEvent);
                return;
            }
            if (actionMasked != 3) {
                if (actionMasked == 5) {
                    int pointerId3 = motionEvent.getPointerId(actionIndex);
                    float x9 = motionEvent.getX(actionIndex);
                    float y9 = motionEvent.getY(actionIndex);
                    I(x9, y9, pointerId3);
                    if (this.f19a != 0) {
                        if (B((int) x9, (int) y9)) {
                            R(this.f38t, pointerId3);
                            return;
                        }
                        return;
                    } else {
                        R(t((int) x9, (int) y9), pointerId3);
                        int i14 = this.f26h[pointerId3];
                        int i15 = this.f35q;
                        if ((i14 & i15) != 0) {
                            this.f37s.h(i14 & i15, pointerId3);
                            return;
                        }
                        return;
                    }
                }
                if (actionMasked != 6) {
                    return;
                }
                int pointerId4 = motionEvent.getPointerId(actionIndex);
                if (this.f19a == 1 && pointerId4 == this.f21c) {
                    int pointerCount2 = motionEvent.getPointerCount();
                    while (true) {
                        if (i8 >= pointerCount2) {
                            i7 = -1;
                            break;
                        }
                        int pointerId5 = motionEvent.getPointerId(i8);
                        if (pointerId5 != this.f21c) {
                            View viewT3 = t((int) motionEvent.getX(i8), (int) motionEvent.getY(i8));
                            View view = this.f38t;
                            if (viewT3 == view && R(view, pointerId5)) {
                                i7 = this.f21c;
                                break;
                            }
                        }
                        i8++;
                    }
                    if (i7 == -1) {
                        G();
                    }
                }
                j(pointerId4);
                return;
            }
            if (this.f19a == 1) {
                p(0.0f, 0.0f);
            }
        } else if (this.f19a == 1) {
            G();
        }
        a();
    }

    void K(int i7) {
        this.f40v.removeCallbacks(this.f41w);
        if (this.f19a != i7) {
            this.f19a = i7;
            this.f37s.j(i7);
            if (this.f19a == 0) {
                this.f38t = null;
            }
        }
    }

    public void L(int i7) {
        this.f33o = i7;
    }

    public void M(int i7) {
        this.f35q = i7;
    }

    public void N(float f7) {
        this.f32n = f7;
    }

    public boolean O(int i7, int i8) {
        if (this.f39u) {
            return u(i7, i8, (int) this.f30l.getXVelocity(this.f21c), (int) this.f30l.getYVelocity(this.f21c));
        }
        throw new IllegalStateException("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00ff  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean P(MotionEvent motionEvent) {
        boolean z6;
        View viewT;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            a();
        }
        if (this.f30l == null) {
            this.f30l = VelocityTracker.obtain();
        }
        this.f30l.addMovement(motionEvent);
        if (actionMasked == 0) {
            float x6 = motionEvent.getX();
            float y6 = motionEvent.getY();
            z6 = false;
            int pointerId = motionEvent.getPointerId(0);
            I(x6, y6, pointerId);
            View viewT2 = t((int) x6, (int) y6);
            if (viewT2 == this.f38t && this.f19a == 2) {
                R(viewT2, pointerId);
            }
            int i7 = this.f26h[pointerId];
            int i8 = this.f35q;
            if ((i7 & i8) != 0) {
                this.f37s.h(i7 & i8, pointerId);
            }
        } else if (actionMasked == 1) {
            a();
            z6 = false;
        } else {
            if (actionMasked != 2) {
                if (actionMasked != 3) {
                    if (actionMasked == 5) {
                        int pointerId2 = motionEvent.getPointerId(actionIndex);
                        float x7 = motionEvent.getX(actionIndex);
                        float y7 = motionEvent.getY(actionIndex);
                        I(x7, y7, pointerId2);
                        int i9 = this.f19a;
                        if (i9 == 0) {
                            int i10 = this.f26h[pointerId2];
                            int i11 = this.f35q;
                            if ((i10 & i11) != 0) {
                                this.f37s.h(i10 & i11, pointerId2);
                            }
                        } else if (i9 == 2 && (viewT = t((int) x7, (int) y7)) == this.f38t) {
                            R(viewT, pointerId2);
                        }
                    } else if (actionMasked == 6) {
                        j(motionEvent.getPointerId(actionIndex));
                    }
                }
            } else if (this.f22d != null && this.f23e != null) {
                int pointerCount = motionEvent.getPointerCount();
                for (int i12 = 0; i12 < pointerCount; i12++) {
                    int pointerId3 = motionEvent.getPointerId(i12);
                    if (D(pointerId3)) {
                        float x8 = motionEvent.getX(i12);
                        float y8 = motionEvent.getY(i12);
                        float f7 = x8 - this.f22d[pointerId3];
                        float f8 = y8 - this.f23e[pointerId3];
                        View viewT3 = t((int) x8, (int) y8);
                        boolean z7 = viewT3 != null && f(viewT3, f7, f8);
                        if (z7) {
                            int left = viewT3.getLeft();
                            int i13 = (int) f7;
                            int iA = this.f37s.a(viewT3, left + i13, i13);
                            int top = viewT3.getTop();
                            int i14 = (int) f8;
                            int iB = this.f37s.b(viewT3, top + i14, i14);
                            int iD = this.f37s.d(viewT3);
                            int iE = this.f37s.e(viewT3);
                            if ((iD == 0 || (iD > 0 && iA == left)) && (iE == 0 || (iE > 0 && iB == top))) {
                                break;
                            }
                            H(f7, f8, pointerId3);
                            if (this.f19a == 1 || (z7 && R(viewT3, pointerId3))) {
                                break;
                            }
                        }
                    }
                }
                J(motionEvent);
            }
            z6 = false;
        }
        if (this.f19a == 1) {
            return true;
        }
        return z6;
    }

    public boolean Q(View view, int i7, int i8) {
        this.f38t = view;
        this.f21c = -1;
        boolean zU = u(i7, i8, 0, 0);
        if (!zU && this.f19a == 0 && this.f38t != null) {
            this.f38t = null;
        }
        return zU;
    }

    boolean R(View view, int i7) {
        if (view == this.f38t && this.f21c == i7) {
            return true;
        }
        if (view == null || !this.f37s.m(view, i7)) {
            return false;
        }
        this.f21c = i7;
        b(view, i7);
        return true;
    }

    public void a() {
        this.f21c = -1;
        i();
        VelocityTracker velocityTracker = this.f30l;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f30l = null;
        }
    }

    public void b(View view, int i7) {
        if (view.getParent() == this.f40v) {
            this.f38t = view;
            this.f21c = i7;
            this.f37s.i(view, i7);
            K(1);
            return;
        }
        throw new IllegalArgumentException("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (" + this.f40v + ")");
    }

    public boolean d(int i7) {
        int length = this.f22d.length;
        for (int i8 = 0; i8 < length; i8++) {
            if (e(i7, i8)) {
                return true;
            }
        }
        return false;
    }

    public boolean e(int i7, int i8) {
        if (!C(i8)) {
            return false;
        }
        boolean z6 = (i7 & 1) == 1;
        boolean z7 = (i7 & 2) == 2;
        float f7 = this.f24f[i8] - this.f22d[i8];
        float f8 = this.f25g[i8] - this.f23e[i8];
        if (!z6 || !z7) {
            return z6 ? Math.abs(f7) > ((float) this.f20b) : z7 && Math.abs(f8) > ((float) this.f20b);
        }
        float f9 = (f7 * f7) + (f8 * f8);
        int i9 = this.f20b;
        return f9 > ((float) (i9 * i9));
    }

    public boolean m(boolean z6) {
        if (this.f19a == 2) {
            boolean zComputeScrollOffset = this.f36r.computeScrollOffset();
            int currX = this.f36r.getCurrX();
            int currY = this.f36r.getCurrY();
            int left = currX - this.f38t.getLeft();
            int top = currY - this.f38t.getTop();
            if (left != 0) {
                H.Z(this.f38t, left);
            }
            if (top != 0) {
                H.a0(this.f38t, top);
            }
            if (left != 0 || top != 0) {
                this.f37s.k(this.f38t, currX, currY, left, top);
            }
            if (zComputeScrollOffset && currX == this.f36r.getFinalX() && currY == this.f36r.getFinalY()) {
                this.f36r.abortAnimation();
                zComputeScrollOffset = false;
            }
            if (!zComputeScrollOffset) {
                if (z6) {
                    this.f40v.post(this.f41w);
                } else {
                    K(0);
                }
            }
        }
        return this.f19a == 2;
    }

    public View t(int i7, int i8) {
        for (int childCount = this.f40v.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = this.f40v.getChildAt(this.f37s.c(childCount));
            if (i7 >= childAt.getLeft() && i7 < childAt.getRight() && i8 >= childAt.getTop() && i8 < childAt.getBottom()) {
                return childAt;
            }
        }
        return null;
    }

    public View v() {
        return this.f38t;
    }

    public int w() {
        return this.f34p;
    }

    public int x() {
        return this.f33o;
    }

    public int z() {
        return this.f20b;
    }

    /* JADX INFO: renamed from: A.c$c, reason: collision with other inner class name */
    public static abstract class AbstractC0002c {
        public abstract int a(View view, int i7, int i8);

        public abstract int b(View view, int i7, int i8);

        public int d(View view) {
            return 0;
        }

        public int e(View view) {
            return 0;
        }

        public boolean g(int i7) {
            return false;
        }

        public abstract void j(int i7);

        public abstract void k(View view, int i7, int i8, int i9, int i10);

        public abstract void l(View view, float f7, float f8);

        public abstract boolean m(View view, int i7);

        public int c(int i7) {
            return i7;
        }

        public void f(int i7, int i8) {
        }

        public void h(int i7, int i8) {
        }

        public void i(View view, int i7) {
        }
    }
}
