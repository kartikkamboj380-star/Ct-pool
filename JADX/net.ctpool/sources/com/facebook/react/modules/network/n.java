package com.facebook.react.modules.network;

import T5.C;
import T5.x;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.util.Base64;
import i6.q;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;
import java.util.zip.GZIPOutputStream;

/* JADX INFO: loaded from: classes.dex */
abstract class n {

    class a extends C {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ x f11948b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ InputStream f11949c;

        a(x xVar, InputStream inputStream) {
            this.f11948b = xVar;
            this.f11949c = inputStream;
        }

        @Override // T5.C
        public long a() {
            try {
                return this.f11949c.available();
            } catch (IOException unused) {
                return 0L;
            }
        }

        @Override // T5.C
        public x b() {
            return this.f11948b;
        }

        @Override // T5.C
        public void h(i6.g gVar) {
            i6.C cL = null;
            try {
                cL = q.l(this.f11949c);
                gVar.x(cL);
            } finally {
                n.b(cL);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(i6.C c7) {
        try {
            c7.close();
        } catch (RuntimeException e7) {
            throw e7;
        } catch (Exception unused) {
        }
    }

    public static C c(x xVar, InputStream inputStream) {
        return new a(xVar, inputStream);
    }

    public static C d(x xVar, String str) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            gZIPOutputStream.write(str.getBytes());
            gZIPOutputStream.close();
            return C.e(xVar, byteArrayOutputStream.toByteArray());
        } catch (IOException unused) {
            return null;
        }
    }

    public static j e(C c7, i iVar) {
        return new j(c7, iVar);
    }

    private static InputStream f(Context context, Uri uri) throws IOException {
        File fileCreateTempFile = File.createTempFile("RequestBodyUtil", "temp", context.getApplicationContext().getCacheDir());
        fileCreateTempFile.deleteOnExit();
        URL url = new URL(uri.toString());
        FileOutputStream fileOutputStream = new FileOutputStream(fileCreateTempFile);
        try {
            InputStream inputStreamOpenStream = url.openStream();
            try {
                ReadableByteChannel readableByteChannelNewChannel = Channels.newChannel(inputStreamOpenStream);
                try {
                    fileOutputStream.getChannel().transferFrom(readableByteChannelNewChannel, 0L, Long.MAX_VALUE);
                    FileInputStream fileInputStream = new FileInputStream(fileCreateTempFile);
                    if (readableByteChannelNewChannel != null) {
                        readableByteChannelNewChannel.close();
                    }
                    if (inputStreamOpenStream != null) {
                        inputStreamOpenStream.close();
                    }
                    fileOutputStream.close();
                    return fileInputStream;
                } finally {
                }
            } finally {
            }
        } catch (Throwable th) {
            try {
                fileOutputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static C g(String str) {
        if (str.equals("POST") || str.equals("PUT") || str.equals("PATCH")) {
            return C.c(null, i6.i.f20018p);
        }
        return null;
    }

    public static InputStream h(Context context, String str) {
        try {
            Uri uri = Uri.parse(str);
            if (uri.getScheme().startsWith("http")) {
                return f(context, uri);
            }
            if (!str.startsWith("data:")) {
                return context.getContentResolver().openInputStream(uri);
            }
            byte[] bArrDecode = Base64.decode(str.split(",")[1], 0);
            Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            bitmapDecodeByteArray.compress(Bitmap.CompressFormat.PNG, 0, byteArrayOutputStream);
            return new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
        } catch (Exception e7) {
            P0.a.k("ReactNative", "Could not retrieve file for contentUri " + str, e7);
            return null;
        }
    }

    public static boolean i(String str) {
        return "gzip".equalsIgnoreCase(str);
    }
}
