package u4;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.TaskApiCall;
import com.google.android.gms.common.api.internal.TaskUtil;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelableSerializer;
import t4.AbstractC2067b;
import t4.C2066a;
import t4.C2068c;
import u4.InterfaceC2142h;
import z3.AbstractC2272l;
import z3.AbstractC2275o;
import z3.C2273m;

/* JADX INFO: renamed from: u4.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C2141g extends AbstractC2067b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final GoogleApi f22547a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final D4.b f22548b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Y3.f f22549c;

    /* JADX INFO: renamed from: u4.g$a */
    static class a extends InterfaceC2142h.a {
        a() {
        }

        @Override // u4.InterfaceC2142h
        public void E(Status status, C2135a c2135a) {
            throw new UnsupportedOperationException();
        }

        @Override // u4.InterfaceC2142h
        public void h0(Status status, C2144j c2144j) {
            throw new UnsupportedOperationException();
        }
    }

    /* JADX INFO: renamed from: u4.g$b */
    static class b extends a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final C2273m f22550a;

        b(C2273m c2273m) {
            this.f22550a = c2273m;
        }

        @Override // u4.C2141g.a, u4.InterfaceC2142h
        public void h0(Status status, C2144j c2144j) {
            TaskUtil.setResultOrApiException(status, c2144j, this.f22550a);
        }
    }

    /* JADX INFO: renamed from: u4.g$c */
    static final class c extends TaskApiCall {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Bundle f22551a;

        c(Bundle bundle) {
            super(null, false, 13202);
            this.f22551a = bundle;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.android.gms.common.api.internal.TaskApiCall
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void doExecute(C2139e c2139e, C2273m c2273m) {
            c2139e.d(new b(c2273m), this.f22551a);
        }
    }

    /* JADX INFO: renamed from: u4.g$d */
    static class d extends a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final C2273m f22552a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final D4.b f22553b;

        public d(D4.b bVar, C2273m c2273m) {
            this.f22553b = bVar;
            this.f22552a = c2273m;
        }

        @Override // u4.C2141g.a, u4.InterfaceC2142h
        public void E(Status status, C2135a c2135a) {
            Bundle bundle;
            Z3.a aVar;
            TaskUtil.setResultOrApiException(status, c2135a == null ? null : new C2068c(c2135a), this.f22552a);
            if (c2135a == null || (bundle = c2135a.B0().getBundle("scionData")) == null || bundle.keySet() == null || (aVar = (Z3.a) this.f22553b.get()) == null) {
                return;
            }
            for (String str : bundle.keySet()) {
                aVar.b("fdl", str, bundle.getBundle(str));
            }
        }
    }

    /* JADX INFO: renamed from: u4.g$e */
    static final class e extends TaskApiCall {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f22554a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final D4.b f22555b;

        e(D4.b bVar, String str) {
            super(null, false, 13201);
            this.f22554a = str;
            this.f22555b = bVar;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.android.gms.common.api.internal.TaskApiCall
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void doExecute(C2139e c2139e, C2273m c2273m) {
            c2139e.e(new d(this.f22555b, c2273m), this.f22554a);
        }
    }

    public C2141g(Y3.f fVar, D4.b bVar) {
        this(new C2138d(fVar.m()), fVar, bVar);
    }

    public static Uri f(Bundle bundle) {
        j(bundle);
        Uri uri = (Uri) bundle.getParcelable("dynamicLink");
        if (uri != null) {
            return uri;
        }
        Uri.Builder builder = new Uri.Builder();
        Uri uri2 = Uri.parse((String) Preconditions.checkNotNull(bundle.getString("domainUriPrefix")));
        builder.scheme(uri2.getScheme());
        builder.authority(uri2.getAuthority());
        builder.path(uri2.getPath());
        Bundle bundle2 = bundle.getBundle("parameters");
        if (bundle2 != null) {
            for (String str : bundle2.keySet()) {
                Object obj = bundle2.get(str);
                if (obj != null) {
                    builder.appendQueryParameter(str, obj.toString());
                }
            }
        }
        return builder.build();
    }

    public static void j(Bundle bundle) {
        Uri uri = (Uri) bundle.getParcelable("dynamicLink");
        if (TextUtils.isEmpty(bundle.getString("domainUriPrefix")) && uri == null) {
            throw new IllegalArgumentException("FDL domain is missing. Set with setDomainUriPrefix() or setDynamicLinkDomain().");
        }
    }

    @Override // t4.AbstractC2067b
    public C2066a.c a() {
        return new C2066a.c(this);
    }

    @Override // t4.AbstractC2067b
    public AbstractC2272l b(Intent intent) {
        C2068c c2068cI;
        AbstractC2272l abstractC2272lDoWrite = this.f22547a.doWrite(new e(this.f22548b, intent != null ? intent.getDataString() : null));
        return (intent == null || (c2068cI = i(intent)) == null) ? abstractC2272lDoWrite : AbstractC2275o.f(c2068cI);
    }

    @Override // t4.AbstractC2067b
    public AbstractC2272l c(Uri uri) {
        return this.f22547a.doWrite(new e(this.f22548b, uri.toString()));
    }

    public AbstractC2272l g(Bundle bundle) {
        j(bundle);
        return this.f22547a.doWrite(new c(bundle));
    }

    public Y3.f h() {
        return this.f22549c;
    }

    public C2068c i(Intent intent) {
        C2135a c2135a = (C2135a) SafeParcelableSerializer.deserializeFromIntentExtra(intent, "com.google.firebase.dynamiclinks.DYNAMIC_LINK_DATA", C2135a.CREATOR);
        if (c2135a != null) {
            return new C2068c(c2135a);
        }
        return null;
    }

    public C2141g(GoogleApi googleApi, Y3.f fVar, D4.b bVar) {
        this.f22547a = googleApi;
        this.f22549c = (Y3.f) Preconditions.checkNotNull(fVar);
        this.f22548b = bVar;
        if (bVar.get() == null) {
            Log.w("FDL", "FDL logging failed. Add a dependency for Firebase Analytics to your app to enable logging of Dynamic Link events.");
        }
    }
}
