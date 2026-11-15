package h4;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.GZIPOutputStream;
import k4.F;

/* JADX INFO: loaded from: classes.dex */
class J implements O {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final File f19687a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f19688b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f19689c;

    J(String str, String str2, File file) {
        this.f19688b = str;
        this.f19689c = str2;
        this.f19687a = file;
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x0057 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private byte[] d() {
        GZIPOutputStream gZIPOutputStream;
        byte[] bArr = new byte[8192];
        try {
            InputStream inputStreamB = b();
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
                } finally {
                }
                if (inputStreamB == null) {
                    gZIPOutputStream.close();
                    byteArrayOutputStream.close();
                    if (inputStreamB != null) {
                        inputStreamB.close();
                    }
                    return null;
                }
                while (true) {
                    try {
                        int i7 = inputStreamB.read(bArr);
                        if (i7 <= 0) {
                            gZIPOutputStream.finish();
                            byte[] byteArray = byteArrayOutputStream.toByteArray();
                            gZIPOutputStream.close();
                            byteArrayOutputStream.close();
                            inputStreamB.close();
                            return byteArray;
                        }
                        gZIPOutputStream.write(bArr, 0, i7);
                    } finally {
                    }
                }
            } finally {
            }
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // h4.O
    public String a() {
        return this.f19689c;
    }

    @Override // h4.O
    public InputStream b() {
        if (this.f19687a.exists() && this.f19687a.isFile()) {
            try {
                return new FileInputStream(this.f19687a);
            } catch (FileNotFoundException unused) {
            }
        }
        return null;
    }

    @Override // h4.O
    public F.d.b c() {
        byte[] bArrD = d();
        if (bArrD != null) {
            return F.d.b.a().b(bArrD).c(this.f19688b).a();
        }
        return null;
    }
}
