package com.facebook.imagepipeline.producers;

import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;
import java.io.IOException;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
public final class H extends L {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f10765d = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final AssetManager f10766c;

    public static final class a {
        private a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String b(J1.b bVar) {
            String path = bVar.u().getPath();
            w5.k.c(path);
            String strSubstring = path.substring(1);
            w5.k.e(strSubstring, "this as java.lang.String).substring(startIndex)");
            return strSubstring;
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public H(Executor executor, R0.i iVar, AssetManager assetManager) {
        super(executor, iVar);
        w5.k.f(executor, "executor");
        w5.k.f(iVar, "pooledByteBufferFactory");
        w5.k.f(assetManager, "assetManager");
        this.f10766c = assetManager;
    }

    private final int g(J1.b bVar) {
        AssetFileDescriptor assetFileDescriptorOpenFd = null;
        try {
            assetFileDescriptorOpenFd = this.f10766c.openFd(f10765d.b(bVar));
            int length = (int) assetFileDescriptorOpenFd.getLength();
            try {
                assetFileDescriptorOpenFd.close();
                return length;
            } catch (IOException unused) {
                return length;
            }
        } catch (IOException unused2) {
            if (assetFileDescriptorOpenFd != null) {
                try {
                    assetFileDescriptorOpenFd.close();
                } catch (IOException unused3) {
                }
            }
            return -1;
        } catch (Throwable th) {
            if (assetFileDescriptorOpenFd != null) {
                try {
                    assetFileDescriptorOpenFd.close();
                } catch (IOException unused4) {
                }
            }
            throw th;
        }
    }

    @Override // com.facebook.imagepipeline.producers.L
    protected D1.g d(J1.b bVar) {
        w5.k.f(bVar, "imageRequest");
        return e(this.f10766c.open(f10765d.b(bVar), 2), g(bVar));
    }

    @Override // com.facebook.imagepipeline.producers.L
    protected String f() {
        return "LocalAssetFetchProducer";
    }
}
