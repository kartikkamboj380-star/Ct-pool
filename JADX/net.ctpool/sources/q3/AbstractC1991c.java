package q3;

import android.os.Parcel;

/* JADX INFO: renamed from: q3.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1991c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final ClassLoader f21879a = AbstractC1991c.class.getClassLoader();

    public static void a(Parcel parcel, boolean z6) {
        parcel.writeInt(1);
    }

    public static boolean b(Parcel parcel) {
        return parcel.readInt() != 0;
    }
}
