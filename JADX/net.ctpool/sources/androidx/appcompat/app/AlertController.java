package androidx.appcompat.app;

import android.R;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckedTextView;
import android.widget.CursorAdapter;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.SimpleCursorAdapter;
import android.widget.TextView;
import androidx.appcompat.widget.T;
import androidx.core.view.H;
import androidx.core.widget.NestedScrollView;
import e.AbstractC1609a;
import e.AbstractC1614f;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
class AlertController {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    NestedScrollView f4930A;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private Drawable f4932C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private ImageView f4933D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private TextView f4934E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private TextView f4935F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private View f4936G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    ListAdapter f4937H;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private int f4939J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private int f4940K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    int f4941L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    int f4942M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    int f4943N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    int f4944O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    private boolean f4945P;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    Handler f4947R;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f4949a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final q f4950b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Window f4951c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f4952d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private CharSequence f4953e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private CharSequence f4954f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    ListView f4955g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private View f4956h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f4957i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f4958j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f4959k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f4960l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f4961m;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    Button f4963o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private CharSequence f4964p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    Message f4965q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private Drawable f4966r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    Button f4967s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private CharSequence f4968t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    Message f4969u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private Drawable f4970v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    Button f4971w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private CharSequence f4972x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    Message f4973y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private Drawable f4974z;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f4962n = false;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private int f4931B = 0;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    int f4938I = -1;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    private int f4946Q = 0;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private final View.OnClickListener f4948S = new a();

    public static class RecycleListView extends ListView {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private final int f4975m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final int f4976n;

        public RecycleListView(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, e.j.f19036c2);
            this.f4976n = typedArrayObtainStyledAttributes.getDimensionPixelOffset(e.j.f19041d2, -1);
            this.f4975m = typedArrayObtainStyledAttributes.getDimensionPixelOffset(e.j.f19046e2, -1);
        }

        public void a(boolean z6, boolean z7) {
            if (z7 && z6) {
                return;
            }
            setPadding(getPaddingLeft(), z6 ? getPaddingTop() : this.f4975m, getPaddingRight(), z7 ? getPaddingBottom() : this.f4976n);
        }
    }

    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Message message;
            Message message2;
            AlertController alertController = AlertController.this;
            Message messageObtain = ((view != alertController.f4963o || (message2 = alertController.f4965q) == null) && (view != alertController.f4967s || (message2 = alertController.f4969u) == null)) ? (view != alertController.f4971w || (message = alertController.f4973y) == null) ? null : Message.obtain(message) : Message.obtain(message2);
            if (messageObtain != null) {
                messageObtain.sendToTarget();
            }
            AlertController alertController2 = AlertController.this;
            alertController2.f4947R.obtainMessage(1, alertController2.f4950b).sendToTarget();
        }
    }

    public static class b {

        /* JADX INFO: renamed from: A, reason: collision with root package name */
        public int f4978A;

        /* JADX INFO: renamed from: B, reason: collision with root package name */
        public int f4979B;

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        public int f4980C;

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        public int f4981D;

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        public boolean[] f4983F;

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        public boolean f4984G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        public boolean f4985H;

        /* JADX INFO: renamed from: J, reason: collision with root package name */
        public DialogInterface.OnMultiChoiceClickListener f4987J;

        /* JADX INFO: renamed from: K, reason: collision with root package name */
        public Cursor f4988K;

        /* JADX INFO: renamed from: L, reason: collision with root package name */
        public String f4989L;

        /* JADX INFO: renamed from: M, reason: collision with root package name */
        public String f4990M;

        /* JADX INFO: renamed from: N, reason: collision with root package name */
        public AdapterView.OnItemSelectedListener f4991N;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Context f4993a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final LayoutInflater f4994b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Drawable f4996d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public CharSequence f4998f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public View f4999g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public CharSequence f5000h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public CharSequence f5001i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public Drawable f5002j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public DialogInterface.OnClickListener f5003k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public CharSequence f5004l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public Drawable f5005m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public DialogInterface.OnClickListener f5006n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public CharSequence f5007o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public Drawable f5008p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public DialogInterface.OnClickListener f5009q;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public DialogInterface.OnCancelListener f5011s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public DialogInterface.OnDismissListener f5012t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public DialogInterface.OnKeyListener f5013u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public CharSequence[] f5014v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public ListAdapter f5015w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public DialogInterface.OnClickListener f5016x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public int f5017y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public View f5018z;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f4995c = 0;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f4997e = 0;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        public boolean f4982E = false;

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        public int f4986I = -1;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        public boolean f4992O = true;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public boolean f5010r = true;

        class a extends ArrayAdapter {

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            final /* synthetic */ RecycleListView f5019m;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(Context context, int i7, int i8, CharSequence[] charSequenceArr, RecycleListView recycleListView) {
                super(context, i7, i8, charSequenceArr);
                this.f5019m = recycleListView;
            }

            @Override // android.widget.ArrayAdapter, android.widget.Adapter
            public View getView(int i7, View view, ViewGroup viewGroup) {
                View view2 = super.getView(i7, view, viewGroup);
                boolean[] zArr = b.this.f4983F;
                if (zArr != null && zArr[i7]) {
                    this.f5019m.setItemChecked(i7, true);
                }
                return view2;
            }
        }

        /* JADX INFO: renamed from: androidx.appcompat.app.AlertController$b$b, reason: collision with other inner class name */
        class C0119b extends CursorAdapter {

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            private final int f5021m;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            private final int f5022n;

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            final /* synthetic */ RecycleListView f5023o;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            final /* synthetic */ AlertController f5024p;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0119b(Context context, Cursor cursor, boolean z6, RecycleListView recycleListView, AlertController alertController) {
                super(context, cursor, z6);
                this.f5023o = recycleListView;
                this.f5024p = alertController;
                Cursor cursor2 = getCursor();
                this.f5021m = cursor2.getColumnIndexOrThrow(b.this.f4989L);
                this.f5022n = cursor2.getColumnIndexOrThrow(b.this.f4990M);
            }

            @Override // android.widget.CursorAdapter
            public void bindView(View view, Context context, Cursor cursor) {
                ((CheckedTextView) view.findViewById(R.id.text1)).setText(cursor.getString(this.f5021m));
                this.f5023o.setItemChecked(cursor.getPosition(), cursor.getInt(this.f5022n) == 1);
            }

            @Override // android.widget.CursorAdapter
            public View newView(Context context, Cursor cursor, ViewGroup viewGroup) {
                return b.this.f4994b.inflate(this.f5024p.f4942M, viewGroup, false);
            }
        }

        class c implements AdapterView.OnItemClickListener {

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            final /* synthetic */ AlertController f5026m;

            c(AlertController alertController) {
                this.f5026m = alertController;
            }

            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView adapterView, View view, int i7, long j7) {
                b.this.f5016x.onClick(this.f5026m.f4950b, i7);
                if (b.this.f4985H) {
                    return;
                }
                this.f5026m.f4950b.dismiss();
            }
        }

        class d implements AdapterView.OnItemClickListener {

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            final /* synthetic */ RecycleListView f5028m;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            final /* synthetic */ AlertController f5029n;

            d(RecycleListView recycleListView, AlertController alertController) {
                this.f5028m = recycleListView;
                this.f5029n = alertController;
            }

            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView adapterView, View view, int i7, long j7) {
                boolean[] zArr = b.this.f4983F;
                if (zArr != null) {
                    zArr[i7] = this.f5028m.isItemChecked(i7);
                }
                b.this.f4987J.onClick(this.f5029n.f4950b, i7, this.f5028m.isItemChecked(i7));
            }
        }

        public b(Context context) {
            this.f4993a = context;
            this.f4994b = (LayoutInflater) context.getSystemService("layout_inflater");
        }

        /* JADX WARN: Removed duplicated region for block: B:29:0x008a  */
        /* JADX WARN: Removed duplicated region for block: B:32:0x0091  */
        /* JADX WARN: Removed duplicated region for block: B:34:0x0096  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private void b(AlertController alertController) {
            ListAdapter dVar;
            AdapterView.OnItemClickListener dVar2;
            AdapterView.OnItemSelectedListener onItemSelectedListener;
            int i7;
            RecycleListView recycleListView = (RecycleListView) this.f4994b.inflate(alertController.f4941L, (ViewGroup) null);
            if (this.f4984G) {
                dVar = this.f4988K == null ? new a(this.f4993a, alertController.f4942M, R.id.text1, this.f5014v, recycleListView) : new C0119b(this.f4993a, this.f4988K, false, recycleListView, alertController);
            } else {
                int i8 = this.f4985H ? alertController.f4943N : alertController.f4944O;
                if (this.f4988K != null) {
                    dVar = new SimpleCursorAdapter(this.f4993a, i8, this.f4988K, new String[]{this.f4989L}, new int[]{R.id.text1});
                } else {
                    dVar = this.f5015w;
                    if (dVar == null) {
                        dVar = new d(this.f4993a, i8, R.id.text1, this.f5014v);
                    }
                }
            }
            alertController.f4937H = dVar;
            alertController.f4938I = this.f4986I;
            if (this.f5016x == null) {
                if (this.f4987J != null) {
                    dVar2 = new d(recycleListView, alertController);
                }
                onItemSelectedListener = this.f4991N;
                if (onItemSelectedListener != null) {
                    recycleListView.setOnItemSelectedListener(onItemSelectedListener);
                }
                if (this.f4985H) {
                    i7 = this.f4984G ? 2 : 1;
                    alertController.f4955g = recycleListView;
                }
                recycleListView.setChoiceMode(i7);
                alertController.f4955g = recycleListView;
            }
            dVar2 = new c(alertController);
            recycleListView.setOnItemClickListener(dVar2);
            onItemSelectedListener = this.f4991N;
            if (onItemSelectedListener != null) {
            }
            if (this.f4985H) {
            }
            recycleListView.setChoiceMode(i7);
            alertController.f4955g = recycleListView;
        }

        public void a(AlertController alertController) {
            View view = this.f4999g;
            if (view != null) {
                alertController.k(view);
            } else {
                CharSequence charSequence = this.f4998f;
                if (charSequence != null) {
                    alertController.p(charSequence);
                }
                Drawable drawable = this.f4996d;
                if (drawable != null) {
                    alertController.m(drawable);
                }
                int i7 = this.f4995c;
                if (i7 != 0) {
                    alertController.l(i7);
                }
                int i8 = this.f4997e;
                if (i8 != 0) {
                    alertController.l(alertController.c(i8));
                }
            }
            CharSequence charSequence2 = this.f5000h;
            if (charSequence2 != null) {
                alertController.n(charSequence2);
            }
            CharSequence charSequence3 = this.f5001i;
            if (charSequence3 != null || this.f5002j != null) {
                alertController.j(-1, charSequence3, this.f5003k, null, this.f5002j);
            }
            CharSequence charSequence4 = this.f5004l;
            if (charSequence4 != null || this.f5005m != null) {
                alertController.j(-2, charSequence4, this.f5006n, null, this.f5005m);
            }
            CharSequence charSequence5 = this.f5007o;
            if (charSequence5 != null || this.f5008p != null) {
                alertController.j(-3, charSequence5, this.f5009q, null, this.f5008p);
            }
            if (this.f5014v != null || this.f4988K != null || this.f5015w != null) {
                b(alertController);
            }
            View view2 = this.f5018z;
            if (view2 != null) {
                if (this.f4982E) {
                    alertController.s(view2, this.f4978A, this.f4979B, this.f4980C, this.f4981D);
                    return;
                } else {
                    alertController.r(view2);
                    return;
                }
            }
            int i9 = this.f5017y;
            if (i9 != 0) {
                alertController.q(i9);
            }
        }
    }

    private static final class c extends Handler {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private WeakReference f5031a;

        public c(DialogInterface dialogInterface) {
            this.f5031a = new WeakReference(dialogInterface);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i7 = message.what;
            if (i7 == -3 || i7 == -2 || i7 == -1) {
                ((DialogInterface.OnClickListener) message.obj).onClick((DialogInterface) this.f5031a.get(), message.what);
            } else {
                if (i7 != 1) {
                    return;
                }
                ((DialogInterface) message.obj).dismiss();
            }
        }
    }

    private static class d extends ArrayAdapter {
        public d(Context context, int i7, int i8, CharSequence[] charSequenceArr) {
            super(context, i7, i8, charSequenceArr);
        }

        @Override // android.widget.ArrayAdapter, android.widget.Adapter
        public long getItemId(int i7) {
            return i7;
        }

        @Override // android.widget.BaseAdapter, android.widget.Adapter
        public boolean hasStableIds() {
            return true;
        }
    }

    public AlertController(Context context, q qVar, Window window) {
        this.f4949a = context;
        this.f4950b = qVar;
        this.f4951c = window;
        this.f4947R = new c(qVar);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, e.j.f18926F, AbstractC1609a.f18738k, 0);
        this.f4939J = typedArrayObtainStyledAttributes.getResourceId(e.j.f18931G, 0);
        this.f4940K = typedArrayObtainStyledAttributes.getResourceId(e.j.f18941I, 0);
        this.f4941L = typedArrayObtainStyledAttributes.getResourceId(e.j.f18951K, 0);
        this.f4942M = typedArrayObtainStyledAttributes.getResourceId(e.j.f18956L, 0);
        this.f4943N = typedArrayObtainStyledAttributes.getResourceId(e.j.f18966N, 0);
        this.f4944O = typedArrayObtainStyledAttributes.getResourceId(e.j.f18946J, 0);
        this.f4945P = typedArrayObtainStyledAttributes.getBoolean(e.j.f18961M, true);
        this.f4952d = typedArrayObtainStyledAttributes.getDimensionPixelSize(e.j.f18936H, 0);
        typedArrayObtainStyledAttributes.recycle();
        qVar.k(1);
    }

    static boolean a(View view) {
        if (view.onCheckIsTextEditor()) {
            return true;
        }
        if (!(view instanceof ViewGroup)) {
            return false;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        while (childCount > 0) {
            childCount--;
            if (a(viewGroup.getChildAt(childCount))) {
                return true;
            }
        }
        return false;
    }

    private void b(Button button) {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) button.getLayoutParams();
        layoutParams.gravity = 1;
        layoutParams.weight = 0.5f;
        button.setLayoutParams(layoutParams);
    }

    private ViewGroup h(View view, View view2) {
        if (view == null) {
            if (view2 instanceof ViewStub) {
                view2 = ((ViewStub) view2).inflate();
            }
            return (ViewGroup) view2;
        }
        if (view2 != null) {
            ViewParent parent = view2.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view2);
            }
        }
        if (view instanceof ViewStub) {
            view = ((ViewStub) view).inflate();
        }
        return (ViewGroup) view;
    }

    private int i() {
        int i7 = this.f4940K;
        return (i7 != 0 && this.f4946Q == 1) ? i7 : this.f4939J;
    }

    private void o(ViewGroup viewGroup, View view, int i7, int i8) {
        View viewFindViewById = this.f4951c.findViewById(AbstractC1614f.f18858v);
        View viewFindViewById2 = this.f4951c.findViewById(AbstractC1614f.f18857u);
        H.F0(view, i7, i8);
        if (viewFindViewById != null) {
            viewGroup.removeView(viewFindViewById);
        }
        if (viewFindViewById2 != null) {
            viewGroup.removeView(viewFindViewById2);
        }
    }

    private void t(ViewGroup viewGroup) {
        int i7;
        Button button;
        Button button2 = (Button) viewGroup.findViewById(R.id.button1);
        this.f4963o = button2;
        button2.setOnClickListener(this.f4948S);
        if (TextUtils.isEmpty(this.f4964p) && this.f4966r == null) {
            this.f4963o.setVisibility(8);
            i7 = 0;
        } else {
            this.f4963o.setText(this.f4964p);
            Drawable drawable = this.f4966r;
            if (drawable != null) {
                int i8 = this.f4952d;
                drawable.setBounds(0, 0, i8, i8);
                this.f4963o.setCompoundDrawables(this.f4966r, null, null, null);
            }
            this.f4963o.setVisibility(0);
            i7 = 1;
        }
        Button button3 = (Button) viewGroup.findViewById(R.id.button2);
        this.f4967s = button3;
        button3.setOnClickListener(this.f4948S);
        if (TextUtils.isEmpty(this.f4968t) && this.f4970v == null) {
            this.f4967s.setVisibility(8);
        } else {
            this.f4967s.setText(this.f4968t);
            Drawable drawable2 = this.f4970v;
            if (drawable2 != null) {
                int i9 = this.f4952d;
                drawable2.setBounds(0, 0, i9, i9);
                this.f4967s.setCompoundDrawables(this.f4970v, null, null, null);
            }
            this.f4967s.setVisibility(0);
            i7 |= 2;
        }
        Button button4 = (Button) viewGroup.findViewById(R.id.button3);
        this.f4971w = button4;
        button4.setOnClickListener(this.f4948S);
        if (TextUtils.isEmpty(this.f4972x) && this.f4974z == null) {
            this.f4971w.setVisibility(8);
        } else {
            this.f4971w.setText(this.f4972x);
            Drawable drawable3 = this.f4974z;
            if (drawable3 != null) {
                int i10 = this.f4952d;
                drawable3.setBounds(0, 0, i10, i10);
                this.f4971w.setCompoundDrawables(this.f4974z, null, null, null);
            }
            this.f4971w.setVisibility(0);
            i7 |= 4;
        }
        if (y(this.f4949a)) {
            if (i7 == 1) {
                button = this.f4963o;
            } else if (i7 == 2) {
                button = this.f4967s;
            } else if (i7 == 4) {
                button = this.f4971w;
            }
            b(button);
        }
        if (i7 != 0) {
            return;
        }
        viewGroup.setVisibility(8);
    }

    private void u(ViewGroup viewGroup) {
        NestedScrollView nestedScrollView = (NestedScrollView) this.f4951c.findViewById(AbstractC1614f.f18859w);
        this.f4930A = nestedScrollView;
        nestedScrollView.setFocusable(false);
        this.f4930A.setNestedScrollingEnabled(false);
        TextView textView = (TextView) viewGroup.findViewById(R.id.message);
        this.f4935F = textView;
        if (textView == null) {
            return;
        }
        CharSequence charSequence = this.f4954f;
        if (charSequence != null) {
            textView.setText(charSequence);
            return;
        }
        textView.setVisibility(8);
        this.f4930A.removeView(this.f4935F);
        if (this.f4955g == null) {
            viewGroup.setVisibility(8);
            return;
        }
        ViewGroup viewGroup2 = (ViewGroup) this.f4930A.getParent();
        int iIndexOfChild = viewGroup2.indexOfChild(this.f4930A);
        viewGroup2.removeViewAt(iIndexOfChild);
        viewGroup2.addView(this.f4955g, iIndexOfChild, new ViewGroup.LayoutParams(-1, -1));
    }

    private void v(ViewGroup viewGroup) {
        View viewInflate = this.f4956h;
        if (viewInflate == null) {
            viewInflate = this.f4957i != 0 ? LayoutInflater.from(this.f4949a).inflate(this.f4957i, viewGroup, false) : null;
        }
        boolean z6 = viewInflate != null;
        if (!z6 || !a(viewInflate)) {
            this.f4951c.setFlags(131072, 131072);
        }
        if (!z6) {
            viewGroup.setVisibility(8);
            return;
        }
        FrameLayout frameLayout = (FrameLayout) this.f4951c.findViewById(AbstractC1614f.f18850n);
        frameLayout.addView(viewInflate, new ViewGroup.LayoutParams(-1, -1));
        if (this.f4962n) {
            frameLayout.setPadding(this.f4958j, this.f4959k, this.f4960l, this.f4961m);
        }
        if (this.f4955g != null) {
            ((LinearLayout.LayoutParams) ((T.a) viewGroup.getLayoutParams())).weight = 0.0f;
        }
    }

    private void w(ViewGroup viewGroup) {
        View viewFindViewById;
        if (this.f4936G != null) {
            viewGroup.addView(this.f4936G, 0, new ViewGroup.LayoutParams(-1, -2));
            viewFindViewById = this.f4951c.findViewById(AbstractC1614f.f18835O);
        } else {
            this.f4933D = (ImageView) this.f4951c.findViewById(R.id.icon);
            if ((!TextUtils.isEmpty(this.f4953e)) && this.f4945P) {
                TextView textView = (TextView) this.f4951c.findViewById(AbstractC1614f.f18846j);
                this.f4934E = textView;
                textView.setText(this.f4953e);
                int i7 = this.f4931B;
                if (i7 != 0) {
                    this.f4933D.setImageResource(i7);
                    return;
                }
                Drawable drawable = this.f4932C;
                if (drawable != null) {
                    this.f4933D.setImageDrawable(drawable);
                    return;
                } else {
                    this.f4934E.setPadding(this.f4933D.getPaddingLeft(), this.f4933D.getPaddingTop(), this.f4933D.getPaddingRight(), this.f4933D.getPaddingBottom());
                    this.f4933D.setVisibility(8);
                    return;
                }
            }
            this.f4951c.findViewById(AbstractC1614f.f18835O).setVisibility(8);
            this.f4933D.setVisibility(8);
            viewFindViewById = viewGroup;
        }
        viewFindViewById.setVisibility(8);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a5 A[PHI: r1
      0x00a5: PHI (r1v6 android.view.View) = (r1v5 android.view.View), (r1v13 android.view.View) binds: [B:36:0x00a3, B:32:0x0098] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void x() {
        ListAdapter listAdapter;
        View viewFindViewById;
        View viewFindViewById2 = this.f4951c.findViewById(AbstractC1614f.f18856t);
        View viewFindViewById3 = viewFindViewById2.findViewById(AbstractC1614f.f18836P);
        View viewFindViewById4 = viewFindViewById2.findViewById(AbstractC1614f.f18849m);
        View viewFindViewById5 = viewFindViewById2.findViewById(AbstractC1614f.f18847k);
        ViewGroup viewGroup = (ViewGroup) viewFindViewById2.findViewById(AbstractC1614f.f18851o);
        v(viewGroup);
        View viewFindViewById6 = viewGroup.findViewById(AbstractC1614f.f18836P);
        View viewFindViewById7 = viewGroup.findViewById(AbstractC1614f.f18849m);
        View viewFindViewById8 = viewGroup.findViewById(AbstractC1614f.f18847k);
        ViewGroup viewGroupH = h(viewFindViewById6, viewFindViewById3);
        ViewGroup viewGroupH2 = h(viewFindViewById7, viewFindViewById4);
        ViewGroup viewGroupH3 = h(viewFindViewById8, viewFindViewById5);
        u(viewGroupH2);
        t(viewGroupH3);
        w(viewGroupH);
        boolean z6 = viewGroup.getVisibility() != 8;
        boolean z7 = (viewGroupH == null || viewGroupH.getVisibility() == 8) ? 0 : 1;
        boolean z8 = (viewGroupH3 == null || viewGroupH3.getVisibility() == 8) ? false : true;
        if (!z8 && viewGroupH2 != null && (viewFindViewById = viewGroupH2.findViewById(AbstractC1614f.f18831K)) != null) {
            viewFindViewById.setVisibility(0);
        }
        if (z7 != 0) {
            NestedScrollView nestedScrollView = this.f4930A;
            if (nestedScrollView != null) {
                nestedScrollView.setClipToPadding(true);
            }
            View viewFindViewById9 = (this.f4954f == null && this.f4955g == null) ? null : viewGroupH.findViewById(AbstractC1614f.f18834N);
            if (viewFindViewById9 != null) {
                viewFindViewById9.setVisibility(0);
            }
        } else if (viewGroupH2 != null && (viewFindViewById9 = viewGroupH2.findViewById(AbstractC1614f.f18832L)) != null) {
        }
        ListView listView = this.f4955g;
        if (listView instanceof RecycleListView) {
            ((RecycleListView) listView).a(z7, z8);
        }
        if (!z6) {
            View view = this.f4955g;
            if (view == null) {
                view = this.f4930A;
            }
            if (view != null) {
                o(viewGroupH2, view, z7 | (z8 ? 2 : 0), 3);
            }
        }
        ListView listView2 = this.f4955g;
        if (listView2 == null || (listAdapter = this.f4937H) == null) {
            return;
        }
        listView2.setAdapter(listAdapter);
        int i7 = this.f4938I;
        if (i7 > -1) {
            listView2.setItemChecked(i7, true);
            listView2.setSelection(i7);
        }
    }

    private static boolean y(Context context) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(AbstractC1609a.f18737j, typedValue, true);
        return typedValue.data != 0;
    }

    public int c(int i7) {
        TypedValue typedValue = new TypedValue();
        this.f4949a.getTheme().resolveAttribute(i7, typedValue, true);
        return typedValue.resourceId;
    }

    public ListView d() {
        return this.f4955g;
    }

    public void e() {
        this.f4950b.setContentView(i());
        x();
    }

    public boolean f(int i7, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f4930A;
        return nestedScrollView != null && nestedScrollView.s(keyEvent);
    }

    public boolean g(int i7, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f4930A;
        return nestedScrollView != null && nestedScrollView.s(keyEvent);
    }

    public void j(int i7, CharSequence charSequence, DialogInterface.OnClickListener onClickListener, Message message, Drawable drawable) {
        if (message == null && onClickListener != null) {
            message = this.f4947R.obtainMessage(i7, onClickListener);
        }
        if (i7 == -3) {
            this.f4972x = charSequence;
            this.f4973y = message;
            this.f4974z = drawable;
        } else if (i7 == -2) {
            this.f4968t = charSequence;
            this.f4969u = message;
            this.f4970v = drawable;
        } else {
            if (i7 != -1) {
                throw new IllegalArgumentException("Button does not exist");
            }
            this.f4964p = charSequence;
            this.f4965q = message;
            this.f4966r = drawable;
        }
    }

    public void k(View view) {
        this.f4936G = view;
    }

    public void l(int i7) {
        this.f4932C = null;
        this.f4931B = i7;
        ImageView imageView = this.f4933D;
        if (imageView != null) {
            if (i7 == 0) {
                imageView.setVisibility(8);
            } else {
                imageView.setVisibility(0);
                this.f4933D.setImageResource(this.f4931B);
            }
        }
    }

    public void m(Drawable drawable) {
        this.f4932C = drawable;
        this.f4931B = 0;
        ImageView imageView = this.f4933D;
        if (imageView != null) {
            if (drawable == null) {
                imageView.setVisibility(8);
            } else {
                imageView.setVisibility(0);
                this.f4933D.setImageDrawable(drawable);
            }
        }
    }

    public void n(CharSequence charSequence) {
        this.f4954f = charSequence;
        TextView textView = this.f4935F;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    public void p(CharSequence charSequence) {
        this.f4953e = charSequence;
        TextView textView = this.f4934E;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    public void q(int i7) {
        this.f4956h = null;
        this.f4957i = i7;
        this.f4962n = false;
    }

    public void r(View view) {
        this.f4956h = view;
        this.f4957i = 0;
        this.f4962n = false;
    }

    public void s(View view, int i7, int i8, int i9, int i10) {
        this.f4956h = view;
        this.f4957i = 0;
        this.f4962n = true;
        this.f4958j = i7;
        this.f4959k = i8;
        this.f4960l = i9;
        this.f4961m = i10;
    }
}
