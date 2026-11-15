package com.google.android.gms.internal.measurement;

import android.content.SharedPreferences;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.u0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class SharedPreferencesC1215u0 implements SharedPreferences {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f14921a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Set f14922b = new HashSet();

    private final Object a(String str, Object obj) {
        Object obj2 = this.f14921a.get(str);
        return obj2 != null ? obj2 : obj;
    }

    @Override // android.content.SharedPreferences
    public final boolean contains(String str) {
        return this.f14921a.containsKey(str);
    }

    @Override // android.content.SharedPreferences
    public final SharedPreferences.Editor edit() {
        return new SharedPreferencesEditorC1240x0(this);
    }

    @Override // android.content.SharedPreferences
    public final Map getAll() {
        return this.f14921a;
    }

    @Override // android.content.SharedPreferences
    public final boolean getBoolean(String str, boolean z6) {
        return ((Boolean) a(str, Boolean.valueOf(z6))).booleanValue();
    }

    @Override // android.content.SharedPreferences
    public final float getFloat(String str, float f7) {
        return ((Float) a(str, Float.valueOf(f7))).floatValue();
    }

    @Override // android.content.SharedPreferences
    public final int getInt(String str, int i7) {
        return ((Integer) a(str, Integer.valueOf(i7))).intValue();
    }

    @Override // android.content.SharedPreferences
    public final long getLong(String str, long j7) {
        return ((Long) a(str, Long.valueOf(j7))).longValue();
    }

    @Override // android.content.SharedPreferences
    public final String getString(String str, String str2) {
        return (String) a(str, str2);
    }

    @Override // android.content.SharedPreferences
    public final Set getStringSet(String str, Set set) {
        return (Set) a(str, set);
    }

    @Override // android.content.SharedPreferences
    public final void registerOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        this.f14922b.add(onSharedPreferenceChangeListener);
    }

    @Override // android.content.SharedPreferences
    public final void unregisterOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        this.f14922b.remove(onSharedPreferenceChangeListener);
    }
}
