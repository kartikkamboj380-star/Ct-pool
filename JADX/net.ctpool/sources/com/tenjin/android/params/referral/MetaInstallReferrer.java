package com.tenjin.android.params.referral;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;

/* JADX INFO: loaded from: classes.dex */
public class MetaInstallReferrer {
    private String getFacebookAppId(Context context) {
        return context.getResources().getString(context.getResources().getIdentifier("facebook_app_id", "string", context.getPackageName()));
    }

    private Uri getProviderUri(Context context, String str) {
        StringBuilder sb;
        String str2;
        if (context.getPackageManager().resolveContentProvider("com.facebook.katana.provider.InstallReferrerProvider", 0) != null) {
            sb = new StringBuilder();
            str2 = "content://com.facebook.katana.provider.InstallReferrerProvider/";
        } else {
            if (context.getPackageManager().resolveContentProvider("com.instagram.contentprovider.InstallReferrerProvider", 0) == null) {
                return null;
            }
            sb = new StringBuilder();
            str2 = "content://com.instagram.contentprovider.InstallReferrerProvider/";
        }
        sb.append(str2);
        sb.append(str);
        return Uri.parse(sb.toString());
    }

    public MetaInstallReferrerInfo getInstallReferrerInfo(Context context) throws Throwable {
        Cursor cursorQuery;
        Cursor cursor = null;
        try {
            Uri providerUri = getProviderUri(context, getFacebookAppId(context));
            if (providerUri == null) {
                return null;
            }
            cursorQuery = context.getContentResolver().query(providerUri, new String[]{"install_referrer", "is_ct", "actual_timestamp"}, null, null, null);
            if (cursorQuery != null) {
                try {
                    if (cursorQuery.moveToFirst()) {
                        int columnIndex = cursorQuery.getColumnIndex("install_referrer");
                        int columnIndex2 = cursorQuery.getColumnIndex("actual_timestamp");
                        int columnIndex3 = cursorQuery.getColumnIndex("is_ct");
                        if (columnIndex != -1 && columnIndex2 != -1 && columnIndex3 != -1) {
                            String string = cursorQuery.getString(columnIndex);
                            long j7 = cursorQuery.getLong(columnIndex2);
                            int i7 = cursorQuery.getInt(columnIndex3);
                            boolean z6 = true;
                            if (i7 != 1) {
                                z6 = false;
                            }
                            MetaInstallReferrerInfo metaInstallReferrerInfo = new MetaInstallReferrerInfo(string, j7, z6);
                            cursorQuery.close();
                            return metaInstallReferrerInfo;
                        }
                        cursorQuery.close();
                        return null;
                    }
                } catch (Exception unused) {
                } catch (Throwable th) {
                    th = th;
                    cursor = cursorQuery;
                    if (cursor != null) {
                        cursor.close();
                    }
                    throw th;
                }
            }
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            return null;
        } catch (Exception unused2) {
            cursorQuery = null;
        } catch (Throwable th2) {
            th = th2;
        }
        if (cursorQuery != null) {
            cursorQuery.close();
        }
        return null;
    }
}
