package com.google.android.gms.internal.measurement;

import java.io.File;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.m0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class C1144m0 implements InterfaceC1153n0 {
    C1144m0() {
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1153n0
    public final String a(String str, AbstractC1188r0 abstractC1188r0, EnumC1162o0 enumC1162o0) {
        return str;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1153n0
    public final /* synthetic */ String b(File file, String str) {
        return d(file, str, AbstractC1188r0.f14802a);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1153n0
    public final /* synthetic */ String c(String str, AbstractC1188r0 abstractC1188r0) {
        return a(str, abstractC1188r0, EnumC1162o0.RAW_FILE_IO_TYPE);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1153n0
    public final /* synthetic */ String d(File file, String str, AbstractC1188r0 abstractC1188r0) {
        return c(new File(file, str).getPath(), abstractC1188r0);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1153n0
    public final /* synthetic */ String f(String str) {
        return c(str, AbstractC1188r0.f14802a);
    }
}
