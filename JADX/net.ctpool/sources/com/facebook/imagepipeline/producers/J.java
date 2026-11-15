package com.facebook.imagepipeline.producers;

import android.content.ContentResolver;
import android.database.Cursor;
import android.graphics.Rect;
import android.media.ExifInterface;
import android.net.Uri;
import android.provider.MediaStore;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.Executor;
import x1.C2215f;

/* JADX INFO: loaded from: classes.dex */
public class J extends L implements u0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Class f10770d = J.class;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String[] f10771e = {"_id", "_data"};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String[] f10772f = {"_data"};

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final Rect f10773g = new Rect(0, 0, 512, 384);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final Rect f10774h = new Rect(0, 0, 96, 96);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ContentResolver f10775c;

    public J(Executor executor, R0.i iVar, ContentResolver contentResolver) {
        super(executor, iVar);
        this.f10775c = contentResolver;
    }

    private D1.g g(Uri uri, C2215f c2215f) {
        Cursor cursorQuery;
        D1.g gVarJ;
        if (c2215f == null || (cursorQuery = this.f10775c.query(uri, f10771e, null, null, null)) == null) {
            return null;
        }
        try {
            if (!cursorQuery.moveToFirst() || (gVarJ = j(c2215f, cursorQuery.getLong(cursorQuery.getColumnIndex("_id")))) == null) {
                return null;
            }
            int columnIndex = cursorQuery.getColumnIndex("_data");
            if (columnIndex >= 0) {
                gVarJ.f1(i(cursorQuery.getString(columnIndex)));
            }
            return gVarJ;
        } finally {
            cursorQuery.close();
        }
    }

    private static int h(String str) {
        if (str == null) {
            return -1;
        }
        return (int) new File(str).length();
    }

    private static int i(String str) {
        if (str == null) {
            return 0;
        }
        try {
            return N1.g.a(new ExifInterface(str).getAttributeInt("Orientation", 1));
        } catch (IOException e7) {
            P0.a.i(f10770d, e7, "Unable to retrieve thumbnail rotation for %s", str);
            return 0;
        }
    }

    private D1.g j(C2215f c2215f, long j7) {
        Cursor cursorQueryMiniThumbnail;
        int columnIndex;
        int iK = k(c2215f);
        if (iK == 0 || (cursorQueryMiniThumbnail = MediaStore.Images.Thumbnails.queryMiniThumbnail(this.f10775c, j7, iK, f10772f)) == null) {
            return null;
        }
        try {
            if (cursorQueryMiniThumbnail.moveToFirst() && (columnIndex = cursorQueryMiniThumbnail.getColumnIndex("_data")) >= 0) {
                String str = (String) O0.l.g(cursorQueryMiniThumbnail.getString(columnIndex));
                if (new File(str).exists()) {
                    return e(new FileInputStream(str), h(str));
                }
            }
            return null;
        } finally {
            cursorQueryMiniThumbnail.close();
        }
    }

    private static int k(C2215f c2215f) {
        Rect rect = f10774h;
        if (v0.b(rect.width(), rect.height(), c2215f)) {
            return 3;
        }
        Rect rect2 = f10773g;
        return v0.b(rect2.width(), rect2.height(), c2215f) ? 1 : 0;
    }

    @Override // com.facebook.imagepipeline.producers.u0
    public boolean b(C2215f c2215f) {
        Rect rect = f10773g;
        return v0.b(rect.width(), rect.height(), c2215f);
    }

    @Override // com.facebook.imagepipeline.producers.L
    protected D1.g d(J1.b bVar) {
        Uri uriU = bVar.u();
        if (W0.f.i(uriU)) {
            return g(uriU, bVar.q());
        }
        return null;
    }

    @Override // com.facebook.imagepipeline.producers.L
    protected String f() {
        return "LocalContentUriThumbnailFetchProducer";
    }
}
