package com.tenjin.android.store;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import com.tenjin.android.config.TenjinConsts;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class SharedPrefsStore implements DataStore {
    private final SharedPreferences settings;

    public SharedPrefsStore(Context context) {
        this.settings = context.getSharedPreferences(TenjinConsts.INSTALL_PREFERENCE, 0);
    }

    @Override // com.tenjin.android.store.DataStore
    public void clear() {
        this.settings.edit().clear().apply();
    }

    @Override // com.tenjin.android.store.DataStore
    public boolean contains(String str) {
        return this.settings.contains(str);
    }

    @Override // com.tenjin.android.store.DataStore
    public Map<String, ?> getAll() {
        return this.settings.getAll();
    }

    @Override // com.tenjin.android.store.DataStore
    public boolean getBoolean(String str, boolean z6) {
        try {
            return this.settings.getBoolean(str, z6);
        } catch (ClassCastException e7) {
            Log.e("Tenjin", "Tried to retrieve value from shared prefs but got " + e7.getLocalizedMessage());
            return z6;
        }
    }

    @Override // com.tenjin.android.store.DataStore
    public float getFloat(String str, float f7) {
        try {
            return this.settings.getFloat(str, f7);
        } catch (ClassCastException e7) {
            Log.e("Tenjin", "Tried to retrieve value from shared prefs but got " + e7.getLocalizedMessage());
            return f7;
        }
    }

    @Override // com.tenjin.android.store.DataStore
    public int getInt(String str, int i7) {
        try {
            return this.settings.getInt(str, i7);
        } catch (ClassCastException e7) {
            Log.e("Tenjin", "Tried to retrieve value from shared prefs but got " + e7.getLocalizedMessage());
            return i7;
        }
    }

    @Override // com.tenjin.android.store.DataStore
    public long getLong(String str, long j7) {
        try {
            Log.d("Tenjin", "str is " + this.settings.getString(str, ""));
            return this.settings.getLong(str, j7);
        } catch (ClassCastException e7) {
            Log.e("Tenjin", "Tried to retrieve value from shared prefs but got " + e7.getLocalizedMessage());
            return j7;
        }
    }

    @Override // com.tenjin.android.store.DataStore
    public String getString(String str, String str2) {
        try {
            return this.settings.getString(str, str2);
        } catch (ClassCastException e7) {
            Log.e("Tenjin", "Tried to retrieve value from shared prefs but got " + e7.getLocalizedMessage());
            return str2;
        }
    }

    @Override // com.tenjin.android.store.DataStore
    public void putBoolean(String str, boolean z6) {
        this.settings.edit().putBoolean(str, z6).apply();
    }

    @Override // com.tenjin.android.store.DataStore
    public void putFloat(String str, float f7) {
        this.settings.edit().putFloat(str, f7).apply();
    }

    @Override // com.tenjin.android.store.DataStore
    public void putInt(String str, int i7) {
        this.settings.edit().putInt(str, i7).apply();
    }

    @Override // com.tenjin.android.store.DataStore
    public void putLong(String str, long j7) {
        this.settings.edit().putLong(str, j7).apply();
    }

    @Override // com.tenjin.android.store.DataStore
    public void putString(String str, String str2) {
        this.settings.edit().putString(str, str2).apply();
    }

    @Override // com.tenjin.android.store.DataStore
    public void remove(String str) {
        this.settings.edit().remove(str).apply();
    }
}
