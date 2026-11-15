package com.facebook.imagepipeline.producers;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.provider.ContactsContract;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
public final class I extends L {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f10767d = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String[] f10768e = {"_id", "_data"};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ContentResolver f10769c;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public I(Executor executor, R0.i iVar, ContentResolver contentResolver) {
        super(executor, iVar);
        w5.k.f(executor, "executor");
        w5.k.f(iVar, "pooledByteBufferFactory");
        w5.k.f(contentResolver, "contentResolver");
        this.f10769c = contentResolver;
    }

    private final D1.g g(Uri uri) throws IOException {
        try {
            ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = this.f10769c.openFileDescriptor(uri, "r");
            if (parcelFileDescriptorOpenFileDescriptor == null) {
                throw new IllegalStateException("Required value was null.".toString());
            }
            D1.g gVarE = e(new FileInputStream(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor()), (int) parcelFileDescriptorOpenFileDescriptor.getStatSize());
            w5.k.e(gVarE, "this.getEncodedImage(Fil…criptor.statSize.toInt())");
            parcelFileDescriptorOpenFileDescriptor.close();
            return gVarE;
        } catch (FileNotFoundException unused) {
            return null;
        }
    }

    @Override // com.facebook.imagepipeline.producers.L
    protected D1.g d(J1.b bVar) throws IOException {
        D1.g gVarG;
        InputStream inputStreamCreateInputStream;
        w5.k.f(bVar, "imageRequest");
        Uri uriU = bVar.u();
        w5.k.e(uriU, "imageRequest.sourceUri");
        if (!W0.f.j(uriU)) {
            if (W0.f.i(uriU) && (gVarG = g(uriU)) != null) {
                return gVarG;
            }
            InputStream inputStreamOpenInputStream = this.f10769c.openInputStream(uriU);
            if (inputStreamOpenInputStream != null) {
                return e(inputStreamOpenInputStream, -1);
            }
            throw new IllegalStateException("Required value was null.".toString());
        }
        String string = uriU.toString();
        w5.k.e(string, "uri.toString()");
        if (F5.g.o(string, "/photo", false, 2, null)) {
            inputStreamCreateInputStream = this.f10769c.openInputStream(uriU);
        } else {
            String string2 = uriU.toString();
            w5.k.e(string2, "uri.toString()");
            if (F5.g.o(string2, "/display_photo", false, 2, null)) {
                try {
                    AssetFileDescriptor assetFileDescriptorOpenAssetFileDescriptor = this.f10769c.openAssetFileDescriptor(uriU, "r");
                    if (assetFileDescriptorOpenAssetFileDescriptor == null) {
                        throw new IllegalStateException("Required value was null.".toString());
                    }
                    inputStreamCreateInputStream = assetFileDescriptorOpenAssetFileDescriptor.createInputStream();
                } catch (IOException unused) {
                    throw new IOException("Contact photo does not exist: " + uriU);
                }
            } else {
                InputStream inputStreamOpenContactPhotoInputStream = ContactsContract.Contacts.openContactPhotoInputStream(this.f10769c, uriU);
                if (inputStreamOpenContactPhotoInputStream == null) {
                    throw new IOException("Contact photo does not exist: " + uriU);
                }
                inputStreamCreateInputStream = inputStreamOpenContactPhotoInputStream;
            }
        }
        if (inputStreamCreateInputStream != null) {
            return e(inputStreamCreateInputStream, -1);
        }
        throw new IllegalStateException("Required value was null.".toString());
    }

    @Override // com.facebook.imagepipeline.producers.L
    protected String f() {
        return "LocalContentUriFetchProducer";
    }
}
