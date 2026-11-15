package com.facebook.react.modules.network;

import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;

/* JADX INFO: loaded from: classes.dex */
class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final CharsetDecoder f11945a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private byte[] f11946b = null;

    public l(Charset charset) {
        this.f11945a = charset.newDecoder();
    }

    public String a(byte[] bArr, int i7) {
        byte[] bArr2 = this.f11946b;
        if (bArr2 != null) {
            byte[] bArr3 = new byte[bArr2.length + i7];
            System.arraycopy(bArr2, 0, bArr3, 0, bArr2.length);
            System.arraycopy(bArr, 0, bArr3, this.f11946b.length, i7);
            i7 += this.f11946b.length;
            bArr = bArr3;
        }
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr, 0, i7);
        boolean z6 = false;
        int i8 = 0;
        CharBuffer charBufferDecode = null;
        while (!z6 && i8 < 4) {
            try {
                charBufferDecode = this.f11945a.decode(byteBufferWrap);
                z6 = true;
            } catch (CharacterCodingException unused) {
                i8++;
                byteBufferWrap = ByteBuffer.wrap(bArr, 0, i7 - i8);
            }
        }
        if (!z6 || i8 <= 0) {
            this.f11946b = null;
        } else {
            byte[] bArr4 = new byte[i8];
            this.f11946b = bArr4;
            System.arraycopy(bArr, i7 - i8, bArr4, 0, i8);
        }
        if (z6) {
            return new String(charBufferDecode.array(), 0, charBufferDecode.length());
        }
        P0.a.G("ReactNative", "failed to decode string from byte array");
        return "";
    }
}
