package Q;

import Q.c;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import androidx.core.os.e;
import androidx.core.os.l;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public class b extends a {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final c.a f2709o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private Uri f2710p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private String[] f2711q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private String f2712r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private String[] f2713s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private String f2714t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private Cursor f2715u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private e f2716v;

    public b(Context context, Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        super(context);
        this.f2709o = new c.a();
        this.f2710p = uri;
        this.f2711q = strArr;
        this.f2712r = str;
        this.f2713s = strArr2;
        this.f2714t = str2;
    }

    @Override // Q.a
    public void A() {
        super.A();
        synchronized (this) {
            try {
                e eVar = this.f2716v;
                if (eVar != null) {
                    eVar.a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // Q.c
    /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
    public void f(Cursor cursor) {
        if (k()) {
            if (cursor != null) {
                cursor.close();
                return;
            }
            return;
        }
        Cursor cursor2 = this.f2715u;
        this.f2715u = cursor;
        if (l()) {
            super.f(cursor);
        }
        if (cursor2 == null || cursor2 == cursor || cursor2.isClosed()) {
            return;
        }
        cursor2.close();
    }

    @Override // Q.a
    /* JADX INFO: renamed from: K, reason: merged with bridge method [inline-methods] */
    public Cursor G() {
        synchronized (this) {
            if (F()) {
                throw new l();
            }
            this.f2716v = new e();
        }
        try {
            Cursor cursorA = androidx.core.content.a.a(i().getContentResolver(), this.f2710p, this.f2711q, this.f2712r, this.f2713s, this.f2714t, this.f2716v);
            if (cursorA != null) {
                try {
                    cursorA.getCount();
                    cursorA.registerContentObserver(this.f2709o);
                } catch (RuntimeException e7) {
                    cursorA.close();
                    throw e7;
                }
            }
            synchronized (this) {
                this.f2716v = null;
            }
            return cursorA;
        } catch (Throwable th) {
            synchronized (this) {
                this.f2716v = null;
                throw th;
            }
        }
    }

    @Override // Q.a
    /* JADX INFO: renamed from: L, reason: merged with bridge method [inline-methods] */
    public void H(Cursor cursor) {
        if (cursor == null || cursor.isClosed()) {
            return;
        }
        cursor.close();
    }

    @Override // Q.a, Q.c
    public void g(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.g(str, fileDescriptor, printWriter, strArr);
        printWriter.print(str);
        printWriter.print("mUri=");
        printWriter.println(this.f2710p);
        printWriter.print(str);
        printWriter.print("mProjection=");
        printWriter.println(Arrays.toString(this.f2711q));
        printWriter.print(str);
        printWriter.print("mSelection=");
        printWriter.println(this.f2712r);
        printWriter.print(str);
        printWriter.print("mSelectionArgs=");
        printWriter.println(Arrays.toString(this.f2713s));
        printWriter.print(str);
        printWriter.print("mSortOrder=");
        printWriter.println(this.f2714t);
        printWriter.print(str);
        printWriter.print("mCursor=");
        printWriter.println(this.f2715u);
    }

    @Override // Q.c
    protected void q() {
        super.q();
        s();
        Cursor cursor = this.f2715u;
        if (cursor != null && !cursor.isClosed()) {
            this.f2715u.close();
        }
        this.f2715u = null;
    }

    @Override // Q.c
    protected void r() {
        Cursor cursor = this.f2715u;
        if (cursor != null) {
            f(cursor);
        }
        if (y() || this.f2715u == null) {
            h();
        }
    }

    @Override // Q.c
    protected void s() {
        b();
    }
}
