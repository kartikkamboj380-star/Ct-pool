package A0;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.w;
import kotlin.jvm.internal.DefaultConstructorMarker;
import v5.l;
import w5.k;

/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final w f55a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f56b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.RNAppleAuthentication.a f57c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final l f58d;

    public static final class a implements Parcelable {
        public static final C0003a CREATOR = new C0003a(null);

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private final String f59m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final String f60n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private final String f61o;

        /* JADX INFO: renamed from: A0.g$a$a, reason: collision with other inner class name */
        public static final class C0003a implements Parcelable.Creator {
            private C0003a() {
            }

            public final a a(com.RNAppleAuthentication.a aVar) {
                k.f(aVar, "configuration");
                Uri.Builder builderBuildUpon = Uri.parse("https://appleid.apple.com/auth/authorize").buildUpon();
                builderBuildUpon.appendQueryParameter("client_id", aVar.a());
                builderBuildUpon.appendQueryParameter("redirect_uri", aVar.d());
                builderBuildUpon.appendQueryParameter("response_type", aVar.e());
                builderBuildUpon.appendQueryParameter("scope", aVar.f());
                builderBuildUpon.appendQueryParameter("response_mode", "form_post");
                builderBuildUpon.appendQueryParameter("state", aVar.g());
                if (!F5.g.r(aVar.b())) {
                    builderBuildUpon.appendQueryParameter("nonce", aVar.b());
                }
                String string = builderBuildUpon.build().toString();
                k.e(string, "toString(...)");
                return new a(string, aVar.d(), aVar.g());
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public a createFromParcel(Parcel parcel) {
                k.f(parcel, "parcel");
                return new a(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public a[] newArray(int i7) {
                return new a[i7];
            }

            public /* synthetic */ C0003a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public a(Parcel parcel) {
            k.f(parcel, "parcel");
            String string = parcel.readString();
            string = string == null ? "invalid" : string;
            String string2 = parcel.readString();
            string2 = string2 == null ? "invalid" : string2;
            String string3 = parcel.readString();
            this(string, string2, string3 != null ? string3 : "invalid");
        }

        public final String a() {
            return this.f59m;
        }

        public final String b() {
            return this.f60n;
        }

        public final String c() {
            return this.f61o;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return k.b(this.f59m, aVar.f59m) && k.b(this.f60n, aVar.f60n) && k.b(this.f61o, aVar.f61o);
        }

        public int hashCode() {
            return (((this.f59m.hashCode() * 31) + this.f60n.hashCode()) * 31) + this.f61o.hashCode();
        }

        public String toString() {
            return "AuthenticationAttempt(authenticationUri=" + this.f59m + ", redirectUri=" + this.f60n + ", state=" + this.f61o + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i7) {
            k.f(parcel, "parcel");
            parcel.writeString(this.f59m);
            parcel.writeString(this.f60n);
            parcel.writeString(this.f61o);
        }

        public a(String str, String str2, String str3) {
            k.f(str, "authenticationUri");
            k.f(str2, "redirectUri");
            k.f(str3, "state");
            this.f59m = str;
            this.f60n = str2;
            this.f61o = str3;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public g(w wVar, String str, com.RNAppleAuthentication.a aVar, d dVar) {
        this(wVar, str, aVar, e.a(dVar));
        k.f(wVar, "fragmentManager");
        k.f(str, "fragmentTag");
        k.f(aVar, "configuration");
        k.f(dVar, "callback");
    }

    public final void a() {
        B0.c cVarA = B0.c.f662o.a(a.CREATOR.a(this.f57c));
        cVarA.v(this.f58d);
        cVarA.show(this.f55a, this.f56b);
    }

    public g(w wVar, String str, com.RNAppleAuthentication.a aVar, l lVar) {
        k.f(wVar, "fragmentManager");
        k.f(str, "fragmentTag");
        k.f(aVar, "configuration");
        k.f(lVar, "callback");
        this.f55a = wVar;
        this.f56b = str;
        this.f57c = aVar;
        this.f58d = lVar;
        Fragment fragmentK0 = wVar.k0(str);
        B0.c cVar = fragmentK0 instanceof B0.c ? (B0.c) fragmentK0 : null;
        if (cVar != null) {
            cVar.v(lVar);
        }
    }
}
