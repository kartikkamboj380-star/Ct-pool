package N1;

import androidx.exifinterface.media.ExifInterface;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e f2132a = new e();

    private e() {
    }

    public static final int a(InputStream inputStream) {
        if (inputStream == null) {
            P0.a.b("HeifExifUtil", "Trying to read Heif Exif from null inputStream -> ignoring");
            return 0;
        }
        try {
            return new ExifInterface(inputStream).getAttributeInt("Orientation", 1);
        } catch (IOException e7) {
            P0.a.e("HeifExifUtil", "Failed reading Heif Exif orientation -> ignoring", e7);
            return 0;
        }
    }
}
