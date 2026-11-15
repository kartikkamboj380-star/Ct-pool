package com.google.android.gms.internal.measurement;

import android.content.SharedPreferences;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.x0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class SharedPreferencesEditorC1240x0 implements SharedPreferences.Editor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f14960a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Set f14961b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Map f14962c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final /* synthetic */ SharedPreferencesC1215u0 f14963d;

    private SharedPreferencesEditorC1240x0(SharedPreferencesC1215u0 sharedPreferencesC1215u0) {
        this.f14963d = sharedPreferencesC1215u0;
        this.f14960a = false;
        this.f14961b = new HashSet();
        this.f14962c = new HashMap();
    }

    private final void a(String str, Object obj) {
        if (obj != null) {
            this.f14962c.put(str, obj);
        } else {
            remove(str);
        }
    }

    @Override // android.content.SharedPreferences.Editor
    public final void apply() {
        commit();
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor clear() {
        this.f14960a = true;
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final boolean commit() {
        if (this.f14960a) {
            this.f14963d.f14921a.clear();
        }
        this.f14963d.f14921a.keySet().removeAll(this.f14961b);
        for (Map.Entry entry : this.f14962c.entrySet()) {
            this.f14963d.f14921a.put((String) entry.getKey(), entry.getValue());
        }
        for (SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener : this.f14963d.f14922b) {
            V3.S sC = V3.M.c(this.f14961b, this.f14962c.keySet()).iterator();
            while (sC.hasNext()) {
                onSharedPreferenceChangeListener.onSharedPreferenceChanged(this.f14963d, (String) sC.next());
            }
        }
        return (!this.f14960a && this.f14961b.isEmpty() && this.f14962c.isEmpty()) ? false : true;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putBoolean(String str, boolean z6) {
        a(str, Boolean.valueOf(z6));
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putFloat(String str, float f7) {
        a(str, Float.valueOf(f7));
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putInt(String str, int i7) {
        a(str, Integer.valueOf(i7));
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putLong(String str, long j7) {
        a(str, Long.valueOf(j7));
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putString(String str, String str2) {
        a(str, str2);
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putStringSet(String str, Set set) {
        a(str, set);
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor remove(String str) {
        this.f14961b.add(str);
        return this;
    }
}
