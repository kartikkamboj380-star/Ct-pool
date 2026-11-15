package com.facebook.imagepipeline.producers;

import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import java.io.IOException;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
public final class N extends L {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f10793d = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Resources f10794c;

    public static final class a {
        private a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final int b(J1.b bVar) {
            String path = bVar.u().getPath();
            if (path == null) {
                throw new IllegalStateException("Required value was null.".toString());
            }
            String strSubstring = path.substring(1);
            w5.k.e(strSubstring, "this as java.lang.String).substring(startIndex)");
            return Integer.parseInt(strSubstring);
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public N(Executor executor, R0.i iVar, Resources resources) {
        super(executor, iVar);
        w5.k.f(executor, "executor");
        w5.k.f(iVar, "pooledByteBufferFactory");
        w5.k.f(resources, "resources");
        this.f10794c = resources;
    }

    private final int g(J1.b bVar) {
        AssetFileDescriptor assetFileDescriptorOpenRawResourceFd = null;
        try {
            assetFileDescriptorOpenRawResourceFd = this.f10794c.openRawResourceFd(f10793d.b(bVar));
            int length = (int) assetFileDescriptorOpenRawResourceFd.getLength();
            try {
                assetFileDescriptorOpenRawResourceFd.close();
                return length;
            } catch (IOException unused) {
                return length;
            }
        } catch (Resources.NotFoundException unused2) {
            if (assetFileDescriptorOpenRawResourceFd != null) {
                try {
                    assetFileDescriptorOpenRawResourceFd.close();
                } catch (IOException unused3) {
                }
            }
            return -1;
        } catch (Throwable th) {
            if (assetFileDescriptorOpenRawResourceFd != null) {
                try {
                    assetFileDescriptorOpenRawResourceFd.close();
                } catch (IOException unused4) {
                }
            }
            throw th;
        }
    }

    @Override // com.facebook.imagepipeline.producers.L
    protected D1.g d(J1.b bVar) {
        w5.k.f(bVar, "imageRequest");
        return e(this.f10794c.openRawResource(f10793d.b(bVar)), g(bVar));
    }

    @Override // com.facebook.imagepipeline.producers.L
    protected String f() {
        return "LocalResourceFetchProducer";
    }
}
