package androidx.core.graphics.drawable;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import android.graphics.drawable.AdaptiveIconDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import androidx.core.util.f;
import androidx.versionedparcelable.CustomVersionedParcelable;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes.dex */
public class IconCompat extends CustomVersionedParcelable {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    static final PorterDuff.Mode f7128k = PorterDuff.Mode.SRC_IN;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f7129a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    Object f7130b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public byte[] f7131c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Parcelable f7132d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f7133e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f7134f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ColorStateList f7135g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    PorterDuff.Mode f7136h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f7137i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f7138j;

    static class a {
        static IconCompat a(Object obj) {
            f.f(obj);
            int iD = d(obj);
            if (iD == 2) {
                return IconCompat.i(null, c(obj), b(obj));
            }
            if (iD == 4) {
                return IconCompat.g(e(obj));
            }
            if (iD == 6) {
                return IconCompat.d(e(obj));
            }
            IconCompat iconCompat = new IconCompat(-1);
            iconCompat.f7130b = obj;
            return iconCompat;
        }

        static int b(Object obj) {
            if (Build.VERSION.SDK_INT >= 28) {
                return c.a(obj);
            }
            try {
                return ((Integer) obj.getClass().getMethod("getResId", null).invoke(obj, null)).intValue();
            } catch (IllegalAccessException e7) {
                Log.e("IconCompat", "Unable to get icon resource", e7);
                return 0;
            } catch (NoSuchMethodException e8) {
                Log.e("IconCompat", "Unable to get icon resource", e8);
                return 0;
            } catch (InvocationTargetException e9) {
                Log.e("IconCompat", "Unable to get icon resource", e9);
                return 0;
            }
        }

        static String c(Object obj) {
            if (Build.VERSION.SDK_INT >= 28) {
                return c.b(obj);
            }
            try {
                return (String) obj.getClass().getMethod("getResPackage", null).invoke(obj, null);
            } catch (IllegalAccessException e7) {
                Log.e("IconCompat", "Unable to get icon package", e7);
                return null;
            } catch (NoSuchMethodException e8) {
                Log.e("IconCompat", "Unable to get icon package", e8);
                return null;
            } catch (InvocationTargetException e9) {
                Log.e("IconCompat", "Unable to get icon package", e9);
                return null;
            }
        }

        static int d(Object obj) {
            StringBuilder sb;
            if (Build.VERSION.SDK_INT >= 28) {
                return c.c(obj);
            }
            try {
                return ((Integer) obj.getClass().getMethod("getType", null).invoke(obj, null)).intValue();
            } catch (IllegalAccessException e7) {
                e = e7;
                sb = new StringBuilder();
                sb.append("Unable to get icon type ");
                sb.append(obj);
                Log.e("IconCompat", sb.toString(), e);
                return -1;
            } catch (NoSuchMethodException e8) {
                e = e8;
                sb = new StringBuilder();
                sb.append("Unable to get icon type ");
                sb.append(obj);
                Log.e("IconCompat", sb.toString(), e);
                return -1;
            } catch (InvocationTargetException e9) {
                e = e9;
                sb = new StringBuilder();
                sb.append("Unable to get icon type ");
                sb.append(obj);
                Log.e("IconCompat", sb.toString(), e);
                return -1;
            }
        }

        static Uri e(Object obj) {
            if (Build.VERSION.SDK_INT >= 28) {
                return c.d(obj);
            }
            try {
                return (Uri) obj.getClass().getMethod("getUri", null).invoke(obj, null);
            } catch (IllegalAccessException e7) {
                Log.e("IconCompat", "Unable to get icon uri", e7);
                return null;
            } catch (NoSuchMethodException e8) {
                Log.e("IconCompat", "Unable to get icon uri", e8);
                return null;
            } catch (InvocationTargetException e9) {
                Log.e("IconCompat", "Unable to get icon uri", e9);
                return null;
            }
        }

        static Drawable f(Icon icon, Context context) {
            return icon.loadDrawable(context);
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x002c, code lost:
        
            if (r0 >= 26) goto L14;
         */
        /* JADX WARN: Removed duplicated region for block: B:31:0x00ab  */
        /* JADX WARN: Removed duplicated region for block: B:34:0x00b4  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        static Icon g(IconCompat iconCompat, Context context) {
            Bitmap bitmapB;
            Icon iconCreateWithResource;
            Bitmap bitmapDecodeStream;
            ColorStateList colorStateList;
            PorterDuff.Mode mode;
            switch (iconCompat.f7129a) {
                case -1:
                    return (Icon) iconCompat.f7130b;
                case 0:
                default:
                    throw new IllegalArgumentException("Unknown type");
                case 1:
                    bitmapB = (Bitmap) iconCompat.f7130b;
                    iconCreateWithResource = Icon.createWithBitmap(bitmapB);
                    colorStateList = iconCompat.f7135g;
                    if (colorStateList != null) {
                        iconCreateWithResource.setTintList(colorStateList);
                    }
                    mode = iconCompat.f7136h;
                    if (mode != IconCompat.f7128k) {
                        iconCreateWithResource.setTintMode(mode);
                    }
                    return iconCreateWithResource;
                case 2:
                    iconCreateWithResource = Icon.createWithResource(iconCompat.l(), iconCompat.f7133e);
                    colorStateList = iconCompat.f7135g;
                    if (colorStateList != null) {
                    }
                    mode = iconCompat.f7136h;
                    if (mode != IconCompat.f7128k) {
                    }
                    return iconCreateWithResource;
                case 3:
                    iconCreateWithResource = Icon.createWithData((byte[]) iconCompat.f7130b, iconCompat.f7133e, iconCompat.f7134f);
                    colorStateList = iconCompat.f7135g;
                    if (colorStateList != null) {
                    }
                    mode = iconCompat.f7136h;
                    if (mode != IconCompat.f7128k) {
                    }
                    return iconCreateWithResource;
                case 4:
                    iconCreateWithResource = Icon.createWithContentUri((String) iconCompat.f7130b);
                    colorStateList = iconCompat.f7135g;
                    if (colorStateList != null) {
                    }
                    mode = iconCompat.f7136h;
                    if (mode != IconCompat.f7128k) {
                    }
                    return iconCreateWithResource;
                case 5:
                    if (Build.VERSION.SDK_INT >= 26) {
                        bitmapDecodeStream = (Bitmap) iconCompat.f7130b;
                        iconCreateWithResource = b.b(bitmapDecodeStream);
                        colorStateList = iconCompat.f7135g;
                        if (colorStateList != null) {
                        }
                        mode = iconCompat.f7136h;
                        if (mode != IconCompat.f7128k) {
                        }
                        return iconCreateWithResource;
                    }
                    bitmapDecodeStream = (Bitmap) iconCompat.f7130b;
                    bitmapB = IconCompat.b(bitmapDecodeStream, false);
                    iconCreateWithResource = Icon.createWithBitmap(bitmapB);
                    colorStateList = iconCompat.f7135g;
                    if (colorStateList != null) {
                    }
                    mode = iconCompat.f7136h;
                    if (mode != IconCompat.f7128k) {
                    }
                    return iconCreateWithResource;
                case 6:
                    int i7 = Build.VERSION.SDK_INT;
                    if (i7 >= 30) {
                        iconCreateWithResource = d.a(iconCompat.n());
                        colorStateList = iconCompat.f7135g;
                        if (colorStateList != null) {
                        }
                        mode = iconCompat.f7136h;
                        if (mode != IconCompat.f7128k) {
                        }
                        return iconCreateWithResource;
                    }
                    if (context == null) {
                        throw new IllegalArgumentException("Context is required to resolve the file uri of the icon: " + iconCompat.n());
                    }
                    InputStream inputStreamO = iconCompat.o(context);
                    if (inputStreamO == null) {
                        throw new IllegalStateException("Cannot load adaptive icon from uri: " + iconCompat.n());
                    }
                    bitmapDecodeStream = BitmapFactory.decodeStream(inputStreamO);
                    break;
                    break;
            }
        }
    }

    static class b {
        static Drawable a(Drawable drawable, Drawable drawable2) {
            return new AdaptiveIconDrawable(drawable, drawable2);
        }

        static Icon b(Bitmap bitmap) {
            return Icon.createWithAdaptiveBitmap(bitmap);
        }
    }

    static class c {
        static int a(Object obj) {
            return ((Icon) obj).getResId();
        }

        static String b(Object obj) {
            return ((Icon) obj).getResPackage();
        }

        static int c(Object obj) {
            return ((Icon) obj).getType();
        }

        static Uri d(Object obj) {
            return ((Icon) obj).getUri();
        }
    }

    static class d {
        static Icon a(Uri uri) {
            return Icon.createWithAdaptiveBitmapContentUri(uri);
        }
    }

    public IconCompat() {
        this.f7129a = -1;
        this.f7131c = null;
        this.f7132d = null;
        this.f7133e = 0;
        this.f7134f = 0;
        this.f7135g = null;
        this.f7136h = f7128k;
        this.f7137i = null;
    }

    public static IconCompat a(Icon icon) {
        return a.a(icon);
    }

    static Bitmap b(Bitmap bitmap, boolean z6) {
        int iMin = (int) (Math.min(bitmap.getWidth(), bitmap.getHeight()) * 0.6666667f);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iMin, iMin, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Paint paint = new Paint(3);
        float f7 = iMin;
        float f8 = 0.5f * f7;
        float f9 = 0.9166667f * f8;
        if (z6) {
            float f10 = 0.010416667f * f7;
            paint.setColor(0);
            paint.setShadowLayer(f10, 0.0f, f7 * 0.020833334f, 1023410176);
            canvas.drawCircle(f8, f8, f9, paint);
            paint.setShadowLayer(f10, 0.0f, 0.0f, 503316480);
            canvas.drawCircle(f8, f8, f9, paint);
            paint.clearShadowLayer();
        }
        paint.setColor(-16777216);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        Matrix matrix = new Matrix();
        matrix.setTranslate((-(bitmap.getWidth() - iMin)) / 2.0f, (-(bitmap.getHeight() - iMin)) / 2.0f);
        bitmapShader.setLocalMatrix(matrix);
        paint.setShader(bitmapShader);
        canvas.drawCircle(f8, f8, f9, paint);
        canvas.setBitmap(null);
        return bitmapCreateBitmap;
    }

    public static IconCompat c(Bitmap bitmap) {
        androidx.core.util.b.c(bitmap);
        IconCompat iconCompat = new IconCompat(5);
        iconCompat.f7130b = bitmap;
        return iconCompat;
    }

    public static IconCompat d(Uri uri) {
        androidx.core.util.b.c(uri);
        return e(uri.toString());
    }

    public static IconCompat e(String str) {
        androidx.core.util.b.c(str);
        IconCompat iconCompat = new IconCompat(6);
        iconCompat.f7130b = str;
        return iconCompat;
    }

    public static IconCompat f(Bitmap bitmap) {
        androidx.core.util.b.c(bitmap);
        IconCompat iconCompat = new IconCompat(1);
        iconCompat.f7130b = bitmap;
        return iconCompat;
    }

    public static IconCompat g(Uri uri) {
        androidx.core.util.b.c(uri);
        return h(uri.toString());
    }

    public static IconCompat h(String str) {
        androidx.core.util.b.c(str);
        IconCompat iconCompat = new IconCompat(4);
        iconCompat.f7130b = str;
        return iconCompat;
    }

    public static IconCompat i(Resources resources, String str, int i7) {
        androidx.core.util.b.c(str);
        if (i7 == 0) {
            throw new IllegalArgumentException("Drawable resource ID must not be 0");
        }
        IconCompat iconCompat = new IconCompat(2);
        iconCompat.f7133e = i7;
        if (resources != null) {
            try {
                iconCompat.f7130b = resources.getResourceName(i7);
            } catch (Resources.NotFoundException unused) {
                throw new IllegalArgumentException("Icon resource cannot be found");
            }
        } else {
            iconCompat.f7130b = str;
        }
        iconCompat.f7138j = str;
        return iconCompat;
    }

    private static String u(int i7) {
        switch (i7) {
            case 1:
                return "BITMAP";
            case 2:
                return "RESOURCE";
            case 3:
                return "DATA";
            case 4:
                return "URI";
            case 5:
                return "BITMAP_MASKABLE";
            case 6:
                return "URI_MASKABLE";
            default:
                return "UNKNOWN";
        }
    }

    public Bitmap j() {
        int i7 = this.f7129a;
        if (i7 == -1) {
            Object obj = this.f7130b;
            if (obj instanceof Bitmap) {
                return (Bitmap) obj;
            }
            return null;
        }
        if (i7 == 1) {
            return (Bitmap) this.f7130b;
        }
        if (i7 == 5) {
            return b((Bitmap) this.f7130b, true);
        }
        throw new IllegalStateException("called getBitmap() on " + this);
    }

    public int k() {
        int i7 = this.f7129a;
        if (i7 == -1) {
            return a.b(this.f7130b);
        }
        if (i7 == 2) {
            return this.f7133e;
        }
        throw new IllegalStateException("called getResId() on " + this);
    }

    public String l() {
        int i7 = this.f7129a;
        if (i7 == -1) {
            return a.c(this.f7130b);
        }
        if (i7 == 2) {
            String str = this.f7138j;
            return (str == null || TextUtils.isEmpty(str)) ? ((String) this.f7130b).split(":", -1)[0] : this.f7138j;
        }
        throw new IllegalStateException("called getResPackage() on " + this);
    }

    public int m() {
        int i7 = this.f7129a;
        return i7 == -1 ? a.d(this.f7130b) : i7;
    }

    public Uri n() {
        int i7 = this.f7129a;
        if (i7 == -1) {
            return a.e(this.f7130b);
        }
        if (i7 == 4 || i7 == 6) {
            return Uri.parse((String) this.f7130b);
        }
        throw new IllegalStateException("called getUri() on " + this);
    }

    public InputStream o(Context context) {
        StringBuilder sb;
        String str;
        Uri uriN = n();
        String scheme = uriN.getScheme();
        if ("content".equals(scheme) || "file".equals(scheme)) {
            try {
                return context.getContentResolver().openInputStream(uriN);
            } catch (Exception e7) {
                e = e7;
                sb = new StringBuilder();
                str = "Unable to load image from URI: ";
            }
        } else {
            try {
                return new FileInputStream(new File((String) this.f7130b));
            } catch (FileNotFoundException e8) {
                e = e8;
                sb = new StringBuilder();
                str = "Unable to load image from path: ";
            }
        }
        sb.append(str);
        sb.append(uriN);
        Log.w("IconCompat", sb.toString(), e);
        return null;
    }

    public void p() {
        Parcelable parcelable;
        this.f7136h = PorterDuff.Mode.valueOf(this.f7137i);
        switch (this.f7129a) {
            case -1:
                parcelable = this.f7132d;
                if (parcelable == null) {
                    throw new IllegalArgumentException("Invalid icon");
                }
                break;
            case 0:
            default:
                return;
            case 1:
            case 5:
                parcelable = this.f7132d;
                if (parcelable == null) {
                    byte[] bArr = this.f7131c;
                    this.f7130b = bArr;
                    this.f7129a = 3;
                    this.f7133e = 0;
                    this.f7134f = bArr.length;
                    return;
                }
                break;
            case 2:
            case 4:
            case 6:
                String str = new String(this.f7131c, Charset.forName("UTF-16"));
                this.f7130b = str;
                if (this.f7129a == 2 && this.f7138j == null) {
                    this.f7138j = str.split(":", -1)[0];
                    return;
                }
                return;
            case 3:
                this.f7130b = this.f7131c;
                return;
        }
        this.f7130b = parcelable;
    }

    public void q(boolean z6) {
        this.f7137i = this.f7136h.name();
        switch (this.f7129a) {
            case -1:
                if (z6) {
                    throw new IllegalArgumentException("Can't serialize Icon created with IconCompat#createFromIcon");
                }
                break;
            case 0:
            default:
                return;
            case 1:
            case 5:
                if (z6) {
                    Bitmap bitmap = (Bitmap) this.f7130b;
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    bitmap.compress(Bitmap.CompressFormat.PNG, 90, byteArrayOutputStream);
                    this.f7131c = byteArrayOutputStream.toByteArray();
                    return;
                }
                break;
            case 2:
                this.f7131c = ((String) this.f7130b).getBytes(Charset.forName("UTF-16"));
                return;
            case 3:
                this.f7131c = (byte[]) this.f7130b;
                return;
            case 4:
            case 6:
                this.f7131c = this.f7130b.toString().getBytes(Charset.forName("UTF-16"));
                return;
        }
        this.f7132d = (Parcelable) this.f7130b;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x005c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Bundle r() {
        Parcelable parcelable;
        ColorStateList colorStateList;
        PorterDuff.Mode mode;
        Bundle bundle = new Bundle();
        switch (this.f7129a) {
            case -1:
                parcelable = (Parcelable) this.f7130b;
                bundle.putParcelable("obj", parcelable);
                bundle.putInt("type", this.f7129a);
                bundle.putInt("int1", this.f7133e);
                bundle.putInt("int2", this.f7134f);
                bundle.putString("string1", this.f7138j);
                colorStateList = this.f7135g;
                if (colorStateList != null) {
                    bundle.putParcelable("tint_list", colorStateList);
                }
                mode = this.f7136h;
                if (mode != f7128k) {
                    bundle.putString("tint_mode", mode.name());
                }
                return bundle;
            case 0:
            default:
                throw new IllegalArgumentException("Invalid icon");
            case 1:
            case 5:
                parcelable = (Bitmap) this.f7130b;
                bundle.putParcelable("obj", parcelable);
                bundle.putInt("type", this.f7129a);
                bundle.putInt("int1", this.f7133e);
                bundle.putInt("int2", this.f7134f);
                bundle.putString("string1", this.f7138j);
                colorStateList = this.f7135g;
                if (colorStateList != null) {
                }
                mode = this.f7136h;
                if (mode != f7128k) {
                }
                return bundle;
            case 2:
            case 4:
            case 6:
                bundle.putString("obj", (String) this.f7130b);
                bundle.putInt("type", this.f7129a);
                bundle.putInt("int1", this.f7133e);
                bundle.putInt("int2", this.f7134f);
                bundle.putString("string1", this.f7138j);
                colorStateList = this.f7135g;
                if (colorStateList != null) {
                }
                mode = this.f7136h;
                if (mode != f7128k) {
                }
                return bundle;
            case 3:
                bundle.putByteArray("obj", (byte[]) this.f7130b);
                bundle.putInt("type", this.f7129a);
                bundle.putInt("int1", this.f7133e);
                bundle.putInt("int2", this.f7134f);
                bundle.putString("string1", this.f7138j);
                colorStateList = this.f7135g;
                if (colorStateList != null) {
                }
                mode = this.f7136h;
                if (mode != f7128k) {
                }
                return bundle;
        }
    }

    public Icon s() {
        return t(null);
    }

    public Icon t(Context context) {
        return a.g(this, context);
    }

    public String toString() {
        int height;
        if (this.f7129a == -1) {
            return String.valueOf(this.f7130b);
        }
        StringBuilder sb = new StringBuilder("Icon(typ=");
        sb.append(u(this.f7129a));
        switch (this.f7129a) {
            case 1:
            case 5:
                sb.append(" size=");
                sb.append(((Bitmap) this.f7130b).getWidth());
                sb.append("x");
                height = ((Bitmap) this.f7130b).getHeight();
                sb.append(height);
                break;
            case 2:
                sb.append(" pkg=");
                sb.append(this.f7138j);
                sb.append(" id=");
                sb.append(String.format("0x%08x", Integer.valueOf(k())));
                break;
            case 3:
                sb.append(" len=");
                sb.append(this.f7133e);
                if (this.f7134f != 0) {
                    sb.append(" off=");
                    height = this.f7134f;
                    sb.append(height);
                }
                break;
            case 4:
            case 6:
                sb.append(" uri=");
                sb.append(this.f7130b);
                break;
        }
        if (this.f7135g != null) {
            sb.append(" tint=");
            sb.append(this.f7135g);
        }
        if (this.f7136h != f7128k) {
            sb.append(" mode=");
            sb.append(this.f7136h);
        }
        sb.append(")");
        return sb.toString();
    }

    IconCompat(int i7) {
        this.f7131c = null;
        this.f7132d = null;
        this.f7133e = 0;
        this.f7134f = 0;
        this.f7135g = null;
        this.f7136h = f7128k;
        this.f7137i = null;
        this.f7129a = i7;
    }
}
