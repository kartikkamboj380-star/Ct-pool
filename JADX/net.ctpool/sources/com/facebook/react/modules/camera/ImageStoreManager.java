package com.facebook.react.modules.camera;

import android.net.Uri;
import android.util.Base64OutputStream;
import app.notifee.core.event.LogEvent;
import com.facebook.fbreact.specs.NativeImageStoreAndroidSpec;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.modules.camera.ImageStoreManager;
import i2.InterfaceC1741a;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.Executors;
import kotlin.jvm.internal.DefaultConstructorMarker;
import w5.k;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC1741a(name = "ImageStoreManager")
public final class ImageStoreManager extends NativeImageStoreAndroidSpec {
    private static final int BUFFER_SIZE = 8192;
    public static final a Companion = new a(null);
    public static final String NAME = "ImageStoreManager";

    public static final class a {
        private a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void b(Closeable closeable) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }

        public final String c(InputStream inputStream) {
            k.f(inputStream, "inputStream");
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            Base64OutputStream base64OutputStream = new Base64OutputStream(byteArrayOutputStream, 2);
            byte[] bArr = new byte[ImageStoreManager.BUFFER_SIZE];
            while (true) {
                try {
                    int i7 = inputStream.read(bArr);
                    if (i7 <= -1) {
                        b(base64OutputStream);
                        String string = byteArrayOutputStream.toString();
                        k.e(string, "toString(...)");
                        return string;
                    }
                    base64OutputStream.write(bArr, 0, i7);
                } catch (Throwable th) {
                    b(base64OutputStream);
                    throw th;
                }
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImageStoreManager(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        k.f(reactApplicationContext, "reactContext");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getBase64ForTag$lambda$0(ImageStoreManager imageStoreManager, String str, Callback callback, Callback callback2) {
        a aVar;
        k.f(imageStoreManager, "this$0");
        k.f(str, "$uri");
        k.f(callback, "$success");
        k.f(callback2, "$error");
        try {
            InputStream inputStreamOpenInputStream = imageStoreManager.getReactApplicationContext().getContentResolver().openInputStream(Uri.parse(str));
            k.d(inputStreamOpenInputStream, "null cannot be cast to non-null type java.io.InputStream");
            try {
                try {
                    aVar = Companion;
                    callback.invoke(aVar.c(inputStreamOpenInputStream));
                } catch (IOException e7) {
                    callback2.invoke(e7.getMessage());
                    aVar = Companion;
                }
                aVar.b(inputStreamOpenInputStream);
            } catch (Throwable th) {
                Companion.b(inputStreamOpenInputStream);
                throw th;
            }
        } catch (FileNotFoundException e8) {
            callback2.invoke(e8.getMessage());
        }
    }

    @Override // com.facebook.fbreact.specs.NativeImageStoreAndroidSpec
    public void getBase64ForTag(final String str, final Callback callback, final Callback callback2) {
        k.f(str, "uri");
        k.f(callback, "success");
        k.f(callback2, LogEvent.LEVEL_ERROR);
        Executors.newSingleThreadExecutor().execute(new Runnable() { // from class: l2.a
            @Override // java.lang.Runnable
            public final void run() {
                ImageStoreManager.getBase64ForTag$lambda$0(this.f21088m, str, callback, callback2);
            }
        });
    }
}
