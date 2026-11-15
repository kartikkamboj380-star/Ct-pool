package com.google.firebase.messaging;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.Preconditions;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import z3.AbstractC2272l;
import z3.C2273m;

/* JADX INFO: loaded from: classes.dex */
public class I implements Closeable {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final URL f17533m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private volatile Future f17534n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private AbstractC2272l f17535o;

    private I(URL url) {
        this.f17533m = url;
    }

    private byte[] d() throws IOException {
        URLConnection uRLConnectionOpenConnection = this.f17533m.openConnection();
        if (uRLConnectionOpenConnection.getContentLength() > 1048576) {
            throw new IOException("Content-Length exceeds max size of 1048576");
        }
        InputStream inputStream = uRLConnectionOpenConnection.getInputStream();
        try {
            byte[] bArrD = AbstractC1537b.d(AbstractC1537b.b(inputStream, 1048577L));
            if (inputStream != null) {
                inputStream.close();
            }
            if (Log.isLoggable("FirebaseMessaging", 2)) {
                Log.v("FirebaseMessaging", "Downloaded " + bArrD.length + " bytes from " + this.f17533m);
            }
            if (bArrD.length <= 1048576) {
                return bArrD;
            }
            throw new IOException("Image exceeds max size of 1048576");
        } catch (Throwable th) {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public static I e(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return new I(new URL(str));
        } catch (MalformedURLException unused) {
            Log.w("FirebaseMessaging", "Not downloading image, bad URL: " + str);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void g(C2273m c2273m) {
        try {
            c2273m.c(b());
        } catch (Exception e7) {
            c2273m.b(e7);
        }
    }

    public Bitmap b() throws IOException {
        if (Log.isLoggable("FirebaseMessaging", 4)) {
            Log.i("FirebaseMessaging", "Starting download of: " + this.f17533m);
        }
        byte[] bArrD = d();
        Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrD, 0, bArrD.length);
        if (bitmapDecodeByteArray == null) {
            throw new IOException("Failed to decode image: " + this.f17533m);
        }
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Successfully downloaded image: " + this.f17533m);
        }
        return bitmapDecodeByteArray;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f17534n.cancel(true);
    }

    public AbstractC2272l f() {
        return (AbstractC2272l) Preconditions.checkNotNull(this.f17535o);
    }

    public void j(ExecutorService executorService) {
        final C2273m c2273m = new C2273m();
        this.f17534n = executorService.submit(new Runnable() { // from class: com.google.firebase.messaging.H
            @Override // java.lang.Runnable
            public final void run() {
                this.f17531m.g(c2273m);
            }
        });
        this.f17535o = c2273m.a();
    }
}
