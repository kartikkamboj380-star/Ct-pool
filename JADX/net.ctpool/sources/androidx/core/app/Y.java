package androidx.core.app;

import android.app.RemoteInput;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class Y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f6926a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final CharSequence f6927b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final CharSequence[] f6928c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f6929d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f6930e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Bundle f6931f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Set f6932g;

    static class a {
        static void a(Object obj, Intent intent, Bundle bundle) {
            RemoteInput.addResultsToIntent((RemoteInput[]) obj, intent, bundle);
        }

        public static RemoteInput b(Y y6) {
            Set setD;
            RemoteInput.Builder builderAddExtras = new RemoteInput.Builder(y6.i()).setLabel(y6.h()).setChoices(y6.e()).setAllowFreeFormInput(y6.c()).addExtras(y6.g());
            if (Build.VERSION.SDK_INT >= 26 && (setD = y6.d()) != null) {
                Iterator it = setD.iterator();
                while (it.hasNext()) {
                    b.d(builderAddExtras, (String) it.next(), true);
                }
            }
            if (Build.VERSION.SDK_INT >= 29) {
                c.b(builderAddExtras, y6.f());
            }
            return builderAddExtras.build();
        }

        static Bundle c(Intent intent) {
            return RemoteInput.getResultsFromIntent(intent);
        }
    }

    static class b {
        static void a(Y y6, Intent intent, Map<String, Uri> map) {
            RemoteInput.addDataResultToIntent(Y.a(y6), intent, map);
        }

        static Set<String> b(Object obj) {
            return ((RemoteInput) obj).getAllowedDataTypes();
        }

        static Map<String, Uri> c(Intent intent, String str) {
            return RemoteInput.getDataResultsFromIntent(intent, str);
        }

        static RemoteInput.Builder d(RemoteInput.Builder builder, String str, boolean z6) {
            return builder.setAllowDataType(str, z6);
        }
    }

    static class c {
        static int a(Object obj) {
            return ((RemoteInput) obj).getEditChoicesBeforeSending();
        }

        static RemoteInput.Builder b(RemoteInput.Builder builder, int i7) {
            return builder.setEditChoicesBeforeSending(i7);
        }
    }

    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f6933a;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private CharSequence f6936d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private CharSequence[] f6937e;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Set f6934b = new HashSet();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Bundle f6935c = new Bundle();

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f6938f = true;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f6939g = 0;

        public d(String str) {
            if (str == null) {
                throw new IllegalArgumentException("Result key can't be null");
            }
            this.f6933a = str;
        }

        public Y a() {
            return new Y(this.f6933a, this.f6936d, this.f6937e, this.f6938f, this.f6939g, this.f6935c, this.f6934b);
        }

        public d b(boolean z6) {
            this.f6938f = z6;
            return this;
        }

        public d c(CharSequence[] charSequenceArr) {
            this.f6937e = charSequenceArr;
            return this;
        }

        public d d(int i7) {
            this.f6939g = i7;
            return this;
        }

        public d e(CharSequence charSequence) {
            this.f6936d = charSequence;
            return this;
        }
    }

    Y(String str, CharSequence charSequence, CharSequence[] charSequenceArr, boolean z6, int i7, Bundle bundle, Set set) {
        this.f6926a = str;
        this.f6927b = charSequence;
        this.f6928c = charSequenceArr;
        this.f6929d = z6;
        this.f6930e = i7;
        this.f6931f = bundle;
        this.f6932g = set;
        if (f() == 2 && !c()) {
            throw new IllegalArgumentException("setEditChoicesBeforeSending requires setAllowFreeFormInput");
        }
    }

    static RemoteInput a(Y y6) {
        return a.b(y6);
    }

    static RemoteInput[] b(Y[] yArr) {
        if (yArr == null) {
            return null;
        }
        RemoteInput[] remoteInputArr = new RemoteInput[yArr.length];
        for (int i7 = 0; i7 < yArr.length; i7++) {
            remoteInputArr[i7] = a(yArr[i7]);
        }
        return remoteInputArr;
    }

    public static Bundle j(Intent intent) {
        return a.c(intent);
    }

    public boolean c() {
        return this.f6929d;
    }

    public Set d() {
        return this.f6932g;
    }

    public CharSequence[] e() {
        return this.f6928c;
    }

    public int f() {
        return this.f6930e;
    }

    public Bundle g() {
        return this.f6931f;
    }

    public CharSequence h() {
        return this.f6927b;
    }

    public String i() {
        return this.f6926a;
    }

    public boolean k() {
        return (c() || (e() != null && e().length != 0) || d() == null || d().isEmpty()) ? false : true;
    }
}
