package H2;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import com.facebook.react.bridge.UiThreadUtil;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import w5.k;

/* JADX INFO: loaded from: classes.dex */
public final class b extends View {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final Paint f1361m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final HashMap f1362n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final HashMap f1363o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final Paint f1364p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private List f1365q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(Context context) {
        super(context);
        k.f(context, "context");
        Paint paint = new Paint();
        this.f1361m = paint;
        this.f1362n = new HashMap();
        this.f1363o = new HashMap();
        Paint paint2 = new Paint();
        this.f1364p = paint2;
        this.f1365q = new ArrayList();
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(6.0f);
        paint2.setStyle(Paint.Style.FILL);
        paint2.setColor(-859248897);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(b bVar, int i7) {
        k.f(bVar, "this$0");
        bVar.f1362n.remove(Integer.valueOf(i7));
        bVar.f1363o.remove(Integer.valueOf(i7));
        bVar.invalidate();
    }

    public final void b() {
        this.f1365q.clear();
        invalidate();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        k.f(canvas, "canvas");
        super.onDraw(canvas);
        for (c cVar : this.f1362n.values()) {
            this.f1361m.setColor(cVar.a());
            canvas.drawRect(cVar.c(), this.f1361m);
            final int iB = cVar.b();
            Runnable runnable = new Runnable() { // from class: H2.a
                @Override // java.lang.Runnable
                public final void run() {
                    b.c(this.f1359m, iB);
                }
            };
            if (!this.f1363o.containsKey(Integer.valueOf(iB))) {
                this.f1363o.put(Integer.valueOf(iB), runnable);
                UiThreadUtil.runOnUiThread(runnable, 2000L);
            }
        }
        Iterator it = this.f1365q.iterator();
        while (it.hasNext()) {
            canvas.drawRect((RectF) it.next(), this.f1364p);
        }
    }

    public final void setHighlightedElementsRectangles(List<RectF> list) {
        k.f(list, "elementsRectangles");
        this.f1365q = list;
        invalidate();
    }

    public final void setTraceUpdates(List<c> list) {
        k.f(list, "traceUpdates");
        for (c cVar : list) {
            int iB = cVar.b();
            if (this.f1363o.containsKey(Integer.valueOf(iB))) {
                UiThreadUtil.removeOnUiThread((Runnable) this.f1363o.get(Integer.valueOf(iB)));
                this.f1363o.remove(Integer.valueOf(iB));
            }
            this.f1362n.put(Integer.valueOf(iB), cVar);
        }
        invalidate();
    }
}
