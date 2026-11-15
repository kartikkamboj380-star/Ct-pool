package Y3;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.StringResourceValueReader;
import com.google.android.gms.common.util.Strings;

/* JADX INFO: loaded from: classes.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f4452a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f4453b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f4454c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f4455d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f4456e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f4457f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f4458g;

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f4459a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f4460b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f4461c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private String f4462d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private String f4463e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private String f4464f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private String f4465g;

        public n a() {
            return new n(this.f4460b, this.f4459a, this.f4461c, this.f4462d, this.f4463e, this.f4464f, this.f4465g);
        }

        public b b(String str) {
            this.f4459a = Preconditions.checkNotEmpty(str, "ApiKey must be set.");
            return this;
        }

        public b c(String str) {
            this.f4460b = Preconditions.checkNotEmpty(str, "ApplicationId must be set.");
            return this;
        }

        public b d(String str) {
            this.f4461c = str;
            return this;
        }

        public b e(String str) {
            this.f4462d = str;
            return this;
        }

        public b f(String str) {
            this.f4463e = str;
            return this;
        }

        public b g(String str) {
            this.f4465g = str;
            return this;
        }

        public b h(String str) {
            this.f4464f = str;
            return this;
        }
    }

    private n(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        Preconditions.checkState(!Strings.isEmptyOrWhitespace(str), "ApplicationId must be set.");
        this.f4453b = str;
        this.f4452a = str2;
        this.f4454c = str3;
        this.f4455d = str4;
        this.f4456e = str5;
        this.f4457f = str6;
        this.f4458g = str7;
    }

    public static n a(Context context) {
        StringResourceValueReader stringResourceValueReader = new StringResourceValueReader(context);
        String string = stringResourceValueReader.getString("google_app_id");
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        return new n(string, stringResourceValueReader.getString("google_api_key"), stringResourceValueReader.getString("firebase_database_url"), stringResourceValueReader.getString("ga_trackingId"), stringResourceValueReader.getString("gcm_defaultSenderId"), stringResourceValueReader.getString("google_storage_bucket"), stringResourceValueReader.getString("project_id"));
    }

    public String b() {
        return this.f4452a;
    }

    public String c() {
        return this.f4453b;
    }

    public String d() {
        return this.f4454c;
    }

    public String e() {
        return this.f4455d;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return Objects.equal(this.f4453b, nVar.f4453b) && Objects.equal(this.f4452a, nVar.f4452a) && Objects.equal(this.f4454c, nVar.f4454c) && Objects.equal(this.f4455d, nVar.f4455d) && Objects.equal(this.f4456e, nVar.f4456e) && Objects.equal(this.f4457f, nVar.f4457f) && Objects.equal(this.f4458g, nVar.f4458g);
    }

    public String f() {
        return this.f4456e;
    }

    public String g() {
        return this.f4458g;
    }

    public String h() {
        return this.f4457f;
    }

    public int hashCode() {
        return Objects.hashCode(this.f4453b, this.f4452a, this.f4454c, this.f4455d, this.f4456e, this.f4457f, this.f4458g);
    }

    public String toString() {
        return Objects.toStringHelper(this).add("applicationId", this.f4453b).add("apiKey", this.f4452a).add("databaseUrl", this.f4454c).add("gcmSenderId", this.f4456e).add("storageBucket", this.f4457f).add("projectId", this.f4458g).toString();
    }
}
