package E;

import androidx.datastore.preferences.protobuf.AbstractC0627w;

/* JADX INFO: loaded from: classes.dex */
abstract /* synthetic */ class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final /* synthetic */ int[] f1017a;

    static {
        int[] iArr = new int[AbstractC0627w.d.values().length];
        f1017a = iArr;
        try {
            iArr[AbstractC0627w.d.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f1017a[AbstractC0627w.d.NEW_BUILDER.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f1017a[AbstractC0627w.d.BUILD_MESSAGE_INFO.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f1017a[AbstractC0627w.d.GET_DEFAULT_INSTANCE.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            f1017a[AbstractC0627w.d.GET_PARSER.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            f1017a[AbstractC0627w.d.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            f1017a[AbstractC0627w.d.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
    }
}
