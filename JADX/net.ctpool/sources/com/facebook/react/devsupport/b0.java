package com.facebook.react.devsupport;

import T5.B;
import X1.i;
import android.content.Context;
import android.net.Uri;
import android.os.AsyncTask;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import com.facebook.react.AbstractC0831n;
import com.facebook.react.AbstractC0833p;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class b0 extends LinearLayout implements AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private X1.e f11582m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private ListView f11583n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private Button f11584o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private Button f11585p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f11586q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private i.a f11587r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private View.OnClickListener f11588s;

    class a implements i.a {
        a() {
        }
    }

    class b implements View.OnClickListener {
        b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            b0.b(b0.this);
        }
    }

    class c implements View.OnClickListener {
        c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ((X1.e) O1.a.c(b0.this.f11582m)).q();
        }
    }

    class d implements View.OnClickListener {
        d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ((X1.e) O1.a.c(b0.this.f11582m)).o();
        }
    }

    private static class e extends AsyncTask {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final T5.x f11593b = T5.x.f("application/json; charset=utf-8");

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final X1.e f11594a;

        private e(X1.e eVar) {
            this.f11594a = eVar;
        }

        private static JSONObject b(X1.j jVar) {
            return new JSONObject(S1.f.g("file", jVar.b(), "methodName", jVar.c(), "lineNumber", Integer.valueOf(jVar.a()), "column", Integer.valueOf(jVar.e())));
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void doInBackground(X1.j... jVarArr) {
            try {
                String string = Uri.parse(this.f11594a.v()).buildUpon().path("/open-stack-frame").query(null).build().toString();
                T5.z zVar = new T5.z();
                for (X1.j jVar : jVarArr) {
                    zVar.a(new B.a().m(string).h(T5.C.d(f11593b, b(jVar).toString())).b()).f();
                }
            } catch (Exception e7) {
                P0.a.k("ReactNative", "Could not open stack frame", e7);
            }
            return null;
        }
    }

    private static class f extends BaseAdapter {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private final String f11595m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final X1.j[] f11596n;

        private static class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final TextView f11597a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final TextView f11598b;

            private a(View view) {
                this.f11597a = (TextView) view.findViewById(AbstractC0831n.f11990t);
                this.f11598b = (TextView) view.findViewById(AbstractC0831n.f11989s);
            }
        }

        public f(String str, X1.j[] jVarArr) {
            this.f11595m = str;
            this.f11596n = jVarArr;
            O1.a.c(str);
            O1.a.c(jVarArr);
        }

        @Override // android.widget.BaseAdapter, android.widget.ListAdapter
        public boolean areAllItemsEnabled() {
            return false;
        }

        @Override // android.widget.Adapter
        public int getCount() {
            return this.f11596n.length + 1;
        }

        @Override // android.widget.Adapter
        public Object getItem(int i7) {
            return i7 == 0 ? this.f11595m : this.f11596n[i7 - 1];
        }

        @Override // android.widget.Adapter
        public long getItemId(int i7) {
            return i7;
        }

        @Override // android.widget.BaseAdapter, android.widget.Adapter
        public int getItemViewType(int i7) {
            return i7 == 0 ? 0 : 1;
        }

        @Override // android.widget.Adapter
        public View getView(int i7, View view, ViewGroup viewGroup) {
            if (i7 == 0) {
                TextView textView = view != null ? (TextView) view : (TextView) LayoutInflater.from(viewGroup.getContext()).inflate(AbstractC0833p.f12002e, viewGroup, false);
                String str = this.f11595m;
                if (str == null) {
                    str = "<unknown title>";
                }
                textView.setText(str.replaceAll("\\x1b\\[[0-9;]*m", ""));
                return textView;
            }
            if (view == null) {
                view = LayoutInflater.from(viewGroup.getContext()).inflate(AbstractC0833p.f12001d, viewGroup, false);
                view.setTag(new a(view));
            }
            X1.j jVar = this.f11596n[i7 - 1];
            a aVar = (a) view.getTag();
            aVar.f11597a.setText(jVar.c());
            aVar.f11598b.setText(h0.d(jVar));
            aVar.f11597a.setTextColor(jVar.d() ? -5592406 : -1);
            aVar.f11598b.setTextColor(jVar.d() ? -8355712 : -5000269);
            return view;
        }

        @Override // android.widget.BaseAdapter, android.widget.Adapter
        public int getViewTypeCount() {
            return 2;
        }

        @Override // android.widget.BaseAdapter, android.widget.ListAdapter
        public boolean isEnabled(int i7) {
            return i7 > 0;
        }
    }

    public b0(Context context) {
        super(context);
        this.f11586q = false;
        this.f11587r = new a();
        this.f11588s = new b();
    }

    static /* bridge */ /* synthetic */ X1.i b(b0 b0Var) {
        b0Var.getClass();
        return null;
    }

    public void c() {
        LayoutInflater.from(getContext()).inflate(AbstractC0833p.f12003f, this);
        ListView listView = (ListView) findViewById(AbstractC0831n.f11993w);
        this.f11583n = listView;
        listView.setOnItemClickListener(this);
        Button button = (Button) findViewById(AbstractC0831n.f11992v);
        this.f11584o = button;
        button.setOnClickListener(new c());
        Button button2 = (Button) findViewById(AbstractC0831n.f11991u);
        this.f11585p = button2;
        button2.setOnClickListener(new d());
    }

    public void d() {
        String strL = this.f11582m.l();
        X1.j[] jVarArrB = this.f11582m.B();
        this.f11582m.t();
        Pair pairR = this.f11582m.r(Pair.create(strL, jVarArrB));
        f((String) pairR.first, (X1.j[]) pairR.second);
        this.f11582m.y();
    }

    public b0 e(X1.e eVar) {
        this.f11582m = eVar;
        return this;
    }

    public void f(String str, X1.j[] jVarArr) {
        this.f11583n.setAdapter((ListAdapter) new f(str, jVarArr));
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView adapterView, View view, int i7, long j7) {
        new e((X1.e) O1.a.c(this.f11582m)).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, (X1.j) this.f11583n.getAdapter().getItem(i7));
    }

    public b0 g(X1.i iVar) {
        return this;
    }
}
