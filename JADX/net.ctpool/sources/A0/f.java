package A0;

import app.notifee.core.event.LogEvent;
import kotlin.jvm.internal.DefaultConstructorMarker;
import w5.k;

/* JADX INFO: loaded from: classes.dex */
public abstract class f {

    public static final class a extends f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f49a = new a();

        private a() {
            super(null);
        }
    }

    public static final class b extends f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Throwable f50a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Throwable th) {
            super(null);
            k.f(th, LogEvent.LEVEL_ERROR);
            this.f50a = th;
        }

        public final Throwable a() {
            return this.f50a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && k.b(this.f50a, ((b) obj).f50a);
        }

        public int hashCode() {
            return this.f50a.hashCode();
        }

        public String toString() {
            return "Failure(error=" + this.f50a + ")";
        }
    }

    public static final class c extends f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f51a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f52b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final String f53c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final String f54d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str, String str2, String str3, String str4) {
            super(null);
            k.f(str, "code");
            k.f(str2, "id_token");
            k.f(str3, "state");
            k.f(str4, "user");
            this.f51a = str;
            this.f52b = str2;
            this.f53c = str3;
            this.f54d = str4;
        }

        public final String a() {
            return this.f51a;
        }

        public final String b() {
            return this.f52b;
        }

        public final String c() {
            return this.f53c;
        }

        public final String d() {
            return this.f54d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return k.b(this.f51a, cVar.f51a) && k.b(this.f52b, cVar.f52b) && k.b(this.f53c, cVar.f53c) && k.b(this.f54d, cVar.f54d);
        }

        public int hashCode() {
            return (((((this.f51a.hashCode() * 31) + this.f52b.hashCode()) * 31) + this.f53c.hashCode()) * 31) + this.f54d.hashCode();
        }

        public String toString() {
            return "Success(code=" + this.f51a + ", id_token=" + this.f52b + ", state=" + this.f53c + ", user=" + this.f54d + ")";
        }
    }

    private f() {
    }

    public /* synthetic */ f(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
