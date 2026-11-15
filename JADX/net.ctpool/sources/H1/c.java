package H1;

import G1.i;
import G1.r;
import O0.l;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapRegionDecoder;
import android.graphics.ColorSpace;
import android.graphics.Rect;
import android.os.Build;
import com.facebook.imagepipeline.platform.PreverificationHelper;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public abstract class c implements f {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Class f1347f = c.class;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final byte[] f1348g = {-1, -39};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final i f1349a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f1350b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f1351c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final PreverificationHelper f1352d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final androidx.core.util.d f1353e;

    public c(i iVar, androidx.core.util.d dVar, h hVar) {
        this.f1352d = Build.VERSION.SDK_INT >= 26 ? new PreverificationHelper() : null;
        this.f1349a = iVar;
        if (iVar instanceof r) {
            this.f1350b = hVar.a();
            this.f1351c = hVar.b();
        }
        this.f1353e = dVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:30:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00c7 A[Catch: all -> 0x00a3, RuntimeException -> 0x00a6, IllegalArgumentException -> 0x00a8, TRY_LEAVE, TryCatch #8 {IllegalArgumentException -> 0x00a8, RuntimeException -> 0x00a6, blocks: (B:36:0x007d, B:39:0x0087, B:49:0x009f, B:68:0x00c7, B:64:0x00c0, B:65:0x00c3, B:62:0x00ba), top: B:98:0x007d, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00f1  */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private S0.a c(InputStream inputStream, BitmapFactory.Options options, Rect rect, ColorSpace colorSpace) {
        Bitmap bitmap;
        ByteBuffer byteBufferAllocate;
        Bitmap bitmapDecodeStream;
        BitmapRegionDecoder bitmapRegionDecoderNewInstance;
        PreverificationHelper preverificationHelper;
        l.g(inputStream);
        int i7 = options.outWidth;
        int iHeight = options.outHeight;
        ?? r02 = i7;
        if (rect != null) {
            int iWidth = rect.width() / options.inSampleSize;
            iHeight = rect.height() / options.inSampleSize;
            r02 = iWidth;
        }
        int i8 = Build.VERSION.SDK_INT;
        boolean z6 = i8 >= 26 && (preverificationHelper = this.f1352d) != null && preverificationHelper.shouldUseHardwareBitmapConfig(options.inPreferredConfig);
        BitmapRegionDecoder bitmapRegionDecoder = 0;
        try {
            try {
                if (rect != null || !z6) {
                    if (rect != null && z6) {
                        options.inPreferredConfig = Bitmap.Config.ARGB_8888;
                    }
                    if (!this.f1350b) {
                        Bitmap bitmap2 = (Bitmap) this.f1349a.get(d(r02, iHeight, options));
                        bitmap = bitmap2;
                        if (bitmap2 == null) {
                            throw new NullPointerException("BitmapPool.get returned null");
                        }
                    }
                    options.inBitmap = bitmap;
                    if (i8 >= 26) {
                        if (colorSpace == null) {
                            colorSpace = ColorSpace.get(ColorSpace.Named.SRGB);
                        }
                        options.inPreferredColorSpace = colorSpace;
                    }
                    byteBufferAllocate = (ByteBuffer) this.f1353e.b();
                    if (byteBufferAllocate == null) {
                        byteBufferAllocate = ByteBuffer.allocate(R0.b.e());
                    }
                    options.inTempStorage = byteBufferAllocate.array();
                    if (rect != null || bitmap == 0) {
                        bitmapDecodeStream = null;
                    } else {
                        Bitmap.Config config = options.inPreferredConfig;
                        try {
                            if (config != null) {
                                try {
                                    bitmap.reconfigure(r02, iHeight, config);
                                    bitmapRegionDecoderNewInstance = BitmapRegionDecoder.newInstance(inputStream, true);
                                    if (bitmapRegionDecoderNewInstance != null) {
                                        try {
                                            bitmapDecodeStream = bitmapRegionDecoderNewInstance.decodeRegion(rect, options);
                                        } catch (IOException unused) {
                                            P0.a.h(f1347f, "Could not decode region %s, decoding full bitmap instead.", rect);
                                            if (bitmapRegionDecoderNewInstance != null) {
                                                bitmapRegionDecoderNewInstance.recycle();
                                            }
                                            bitmapDecodeStream = null;
                                        }
                                    } else {
                                        bitmapDecodeStream = null;
                                    }
                                    if (bitmapRegionDecoderNewInstance != null) {
                                        bitmapRegionDecoderNewInstance.recycle();
                                    }
                                } catch (IOException unused2) {
                                    bitmapRegionDecoderNewInstance = null;
                                } catch (Throwable th) {
                                    th = th;
                                    if (bitmapRegionDecoder != 0) {
                                        bitmapRegionDecoder.recycle();
                                    }
                                    throw th;
                                }
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            bitmapRegionDecoder = r02;
                        }
                    }
                    if (bitmapDecodeStream == null) {
                        bitmapDecodeStream = BitmapFactory.decodeStream(inputStream, null, options);
                    }
                    this.f1353e.a(byteBufferAllocate);
                    if (bitmap != 0 || bitmap == bitmapDecodeStream) {
                        return !this.f1351c ? S0.a.W(bitmapDecodeStream, a.f1354a) : S0.a.W(bitmapDecodeStream, this.f1349a);
                    }
                    this.f1349a.a(bitmap);
                    if (bitmapDecodeStream != null) {
                        bitmapDecodeStream.recycle();
                    }
                    throw new IllegalStateException();
                }
                options.inMutable = false;
                options.inTempStorage = byteBufferAllocate.array();
                if (rect != null) {
                    bitmapDecodeStream = null;
                }
                if (bitmapDecodeStream == null) {
                }
                this.f1353e.a(byteBufferAllocate);
                if (bitmap != 0) {
                }
                if (!this.f1351c) {
                }
            } catch (Throwable th3) {
                this.f1353e.a(byteBufferAllocate);
                throw th3;
            }
        } catch (IllegalArgumentException e7) {
            if (bitmap != 0) {
                this.f1349a.a(bitmap);
            }
            try {
                inputStream.reset();
                Bitmap bitmapDecodeStream2 = BitmapFactory.decodeStream(inputStream);
                if (bitmapDecodeStream2 == null) {
                    throw e7;
                }
                S0.a aVarW = S0.a.W(bitmapDecodeStream2, v1.d.b());
                this.f1353e.a(byteBufferAllocate);
                return aVarW;
            } catch (IOException unused3) {
                throw e7;
            }
        } catch (RuntimeException e8) {
            if (bitmap != 0) {
                this.f1349a.a(bitmap);
            }
            throw e8;
        }
        bitmap = 0;
        options.inBitmap = bitmap;
        if (i8 >= 26) {
        }
        byteBufferAllocate = (ByteBuffer) this.f1353e.b();
        if (byteBufferAllocate == null) {
        }
    }

    private static BitmapFactory.Options e(D1.g gVar, Bitmap.Config config, boolean z6) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inSampleSize = gVar.z();
        options.inJustDecodeBounds = true;
        options.inDither = true;
        boolean z7 = Build.VERSION.SDK_INT >= 26 && config == Bitmap.Config.HARDWARE;
        if (!z7) {
            options.inPreferredConfig = config;
        }
        options.inMutable = true;
        if (!z6) {
            BitmapFactory.decodeStream(gVar.o(), null, options);
            if (options.outWidth == -1 || options.outHeight == -1) {
                throw new IllegalArgumentException();
            }
        }
        if (z7) {
            options.inPreferredConfig = config;
        }
        options.inJustDecodeBounds = false;
        return options;
    }

    @Override // H1.f
    public S0.a a(D1.g gVar, Bitmap.Config config, Rect rect, int i7, ColorSpace colorSpace) {
        boolean zW = gVar.W(i7);
        BitmapFactory.Options optionsE = e(gVar, config, this.f1350b);
        InputStream inputStreamO = gVar.o();
        l.g(inputStreamO);
        if (gVar.B() > i7) {
            inputStreamO = new U0.a(inputStreamO, i7);
        }
        if (!zW) {
            inputStreamO = new U0.b(inputStreamO, f1348g);
        }
        boolean z6 = optionsE.inPreferredConfig != Bitmap.Config.ARGB_8888;
        try {
            try {
                return c(inputStreamO, optionsE, rect, colorSpace);
            } catch (RuntimeException e7) {
                if (!z6) {
                    throw e7;
                }
                S0.a aVarA = a(gVar, Bitmap.Config.ARGB_8888, rect, i7, colorSpace);
                try {
                    inputStreamO.close();
                } catch (IOException e8) {
                    e8.printStackTrace();
                }
                return aVarA;
            }
        } finally {
            try {
                inputStreamO.close();
            } catch (IOException e9) {
                e9.printStackTrace();
            }
        }
    }

    @Override // H1.f
    public S0.a b(D1.g gVar, Bitmap.Config config, Rect rect, ColorSpace colorSpace) {
        BitmapFactory.Options optionsE = e(gVar, config, this.f1350b);
        boolean z6 = optionsE.inPreferredConfig != Bitmap.Config.ARGB_8888;
        try {
            return c((InputStream) l.g(gVar.o()), optionsE, rect, colorSpace);
        } catch (RuntimeException e7) {
            if (z6) {
                return b(gVar, Bitmap.Config.ARGB_8888, rect, colorSpace);
            }
            throw e7;
        }
    }

    public abstract int d(int i7, int i8, BitmapFactory.Options options);

    private static final class a implements S0.g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final a f1354a = new a();

        private a() {
        }

        @Override // S0.g
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void a(Bitmap bitmap) {
        }
    }
}
