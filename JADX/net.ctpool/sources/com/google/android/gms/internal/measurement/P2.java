package com.google.android.gms.internal.measurement;

import android.net.Uri;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public abstract class P2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Uri f14305a = Uri.parse("content://com.google.android.gsf.gservices");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Uri f14306b = Uri.parse("content://com.google.android.gsf.gservices/prefix");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Pattern f14307c = Pattern.compile("^(1|true|t|on|yes|y)$", 2);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Pattern f14308d = Pattern.compile("^(0|false|f|off|no|n)$", 2);
}
