package androidx.work.impl;

import Z.h;
import a0.C0500f;
import android.content.Context;
import androidx.work.impl.WorkDatabase;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.DefaultConstructorMarker;
import q0.InterfaceC1986b;

/* JADX INFO: loaded from: classes.dex */
public abstract class WorkDatabase extends androidx.room.u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f9334a = new a(null);

    public static final class a {
        private a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Z.h c(Context context, h.b bVar) {
            w5.k.f(context, "$context");
            w5.k.f(bVar, "configuration");
            h.b.a aVarA = h.b.f4619f.a(context);
            aVarA.d(bVar.f4621b).c(bVar.f4622c).e(true).a(true);
            return new C0500f().a(aVarA.b());
        }

        public final WorkDatabase b(final Context context, Executor executor, boolean z6) {
            w5.k.f(context, "context");
            w5.k.f(executor, "queryExecutor");
            return (WorkDatabase) (z6 ? androidx.room.t.c(context, WorkDatabase.class).c() : androidx.room.t.a(context, WorkDatabase.class, "androidx.work.workdb").f(new h.c() { // from class: androidx.work.impl.y
                @Override // Z.h.c
                public final Z.h a(h.b bVar) {
                    return WorkDatabase.a.c(context, bVar);
                }
            })).g(executor).a(C0663c.f9408a).b(C0669i.f9442c).b(new s(context, 2, 3)).b(C0670j.f9443c).b(C0671k.f9444c).b(new s(context, 5, 6)).b(l.f9445c).b(m.f9446c).b(n.f9447c).b(new F(context)).b(new s(context, 10, 11)).b(C0666f.f9411c).b(C0667g.f9440c).b(C0668h.f9441c).e().d();
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static final WorkDatabase d(Context context, Executor executor, boolean z6) {
        return f9334a.b(context, executor, z6);
    }

    public abstract InterfaceC1986b e();

    public abstract q0.e f();

    public abstract q0.j g();

    public abstract q0.o h();

    public abstract q0.r i();

    public abstract q0.v j();

    public abstract q0.z k();
}
