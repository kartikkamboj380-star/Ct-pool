package h4;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.GZIPOutputStream;
import k4.F;

/* JADX INFO: renamed from: h4.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
class C1719h implements O {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final byte[] f19736a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f19737b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f19738c;

    C1719h(String str, String str2, byte[] bArr) {
        this.f19737b = str;
        this.f19738c = str2;
        this.f19736a = bArr;
    }

    private byte[] d() {
        if (e()) {
            return null;
        }
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
                try {
                    gZIPOutputStream.write(this.f19736a);
                    gZIPOutputStream.finish();
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    gZIPOutputStream.close();
                    byteArrayOutputStream.close();
                    return byteArray;
                } finally {
                }
            } finally {
            }
        } catch (IOException unused) {
            return null;
        }
    }

    private boolean e() {
        byte[] bArr = this.f19736a;
        return bArr == null || bArr.length == 0;
    }

    @Override // h4.O
    public String a() {
        return this.f19738c;
    }

    @Override // h4.O
    public InputStream b() {
        if (e()) {
            return null;
        }
        return new ByteArrayInputStream(this.f19736a);
    }

    @Override // h4.O
    public F.d.b c() {
        byte[] bArrD = d();
        if (bArrD == null) {
            return null;
        }
        return F.d.b.a().b(bArrD).c(this.f19737b).a();
    }
}
