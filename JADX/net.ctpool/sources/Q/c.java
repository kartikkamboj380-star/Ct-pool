package Q;

import android.content.Context;
import android.database.ContentObserver;
import android.os.Handler;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* JADX INFO: loaded from: classes.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f2717a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private b f2718b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Context f2719c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f2720d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f2721e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f2722f = true;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f2723g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f2724h = false;

    public final class a extends ContentObserver {
        public a() {
            super(new Handler());
        }

        @Override // android.database.ContentObserver
        public boolean deliverSelfNotifications() {
            return true;
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z6) {
            c.this.o();
        }
    }

    public interface b {
        void a(c cVar, Object obj);
    }

    public c(Context context) {
        this.f2719c = context.getApplicationContext();
    }

    public void a() {
        this.f2721e = true;
        m();
    }

    public boolean b() {
        return n();
    }

    public void c() {
        this.f2724h = false;
    }

    public String d(Object obj) {
        String str;
        StringBuilder sb = new StringBuilder(64);
        if (obj == null) {
            str = "null";
        } else {
            Class<?> cls = obj.getClass();
            sb.append(cls.getSimpleName());
            sb.append("{");
            sb.append(Integer.toHexString(System.identityHashCode(cls)));
            str = "}";
        }
        sb.append(str);
        return sb.toString();
    }

    public void f(Object obj) {
        b bVar = this.f2718b;
        if (bVar != null) {
            bVar.a(this, obj);
        }
    }

    public void g(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.print(str);
        printWriter.print("mId=");
        printWriter.print(this.f2717a);
        printWriter.print(" mListener=");
        printWriter.println(this.f2718b);
        if (this.f2720d || this.f2723g || this.f2724h) {
            printWriter.print(str);
            printWriter.print("mStarted=");
            printWriter.print(this.f2720d);
            printWriter.print(" mContentChanged=");
            printWriter.print(this.f2723g);
            printWriter.print(" mProcessingChange=");
            printWriter.println(this.f2724h);
        }
        if (this.f2721e || this.f2722f) {
            printWriter.print(str);
            printWriter.print("mAbandoned=");
            printWriter.print(this.f2721e);
            printWriter.print(" mReset=");
            printWriter.println(this.f2722f);
        }
    }

    public void h() {
        p();
    }

    public Context i() {
        return this.f2719c;
    }

    public boolean j() {
        return this.f2721e;
    }

    public boolean k() {
        return this.f2722f;
    }

    public boolean l() {
        return this.f2720d;
    }

    protected abstract boolean n();

    public void o() {
        if (this.f2720d) {
            h();
        } else {
            this.f2723g = true;
        }
    }

    protected abstract void r();

    public void t(int i7, b bVar) {
        if (this.f2718b != null) {
            throw new IllegalStateException("There is already a listener registered");
        }
        this.f2718b = bVar;
        this.f2717a = i7;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(64);
        Class<?> cls = getClass();
        sb.append(cls.getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(cls)));
        sb.append(" id=");
        sb.append(this.f2717a);
        sb.append("}");
        return sb.toString();
    }

    public void u() {
        q();
        this.f2722f = true;
        this.f2720d = false;
        this.f2721e = false;
        this.f2723g = false;
        this.f2724h = false;
    }

    public void v() {
        if (this.f2724h) {
            o();
        }
    }

    public final void w() {
        this.f2720d = true;
        this.f2722f = false;
        this.f2721e = false;
        r();
    }

    public void x() {
        this.f2720d = false;
        s();
    }

    public boolean y() {
        boolean z6 = this.f2723g;
        this.f2723g = false;
        this.f2724h |= z6;
        return z6;
    }

    public void z(b bVar) {
        b bVar2 = this.f2718b;
        if (bVar2 == null) {
            throw new IllegalStateException("No listener register");
        }
        if (bVar2 != bVar) {
            throw new IllegalArgumentException("Attempting to unregister the wrong listener");
        }
        this.f2718b = null;
    }

    public void e() {
    }

    protected void m() {
    }

    protected void p() {
    }

    protected void q() {
    }

    protected void s() {
    }
}
