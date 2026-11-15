package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import androidx.fragment.app.AbstractActivityC0640j;
import androidx.fragment.app.Fragment;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;
import n.C1890a;

/* JADX INFO: loaded from: classes.dex */
public final class zzd extends Fragment implements LifecycleFragment {
    private static final WeakHashMap zza = new WeakHashMap();
    private final Map zzb = Collections.synchronizedMap(new C1890a());
    private int zzc = 0;
    private Bundle zzd;

    public static zzd zzc(AbstractActivityC0640j abstractActivityC0640j) {
        zzd zzdVar;
        WeakHashMap weakHashMap = zza;
        WeakReference weakReference = (WeakReference) weakHashMap.get(abstractActivityC0640j);
        if (weakReference != null && (zzdVar = (zzd) weakReference.get()) != null) {
            return zzdVar;
        }
        try {
            zzd zzdVar2 = (zzd) abstractActivityC0640j.O().k0("SupportLifecycleFragmentImpl");
            if (zzdVar2 == null || zzdVar2.isRemoving()) {
                zzdVar2 = new zzd();
                abstractActivityC0640j.O().p().e(zzdVar2, "SupportLifecycleFragmentImpl").h();
            }
            weakHashMap.put(abstractActivityC0640j, new WeakReference(zzdVar2));
            return zzdVar2;
        } catch (ClassCastException e7) {
            throw new IllegalStateException("Fragment with tag SupportLifecycleFragmentImpl is not a SupportLifecycleFragmentImpl", e7);
        }
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleFragment
    public final void addCallback(String str, LifecycleCallback lifecycleCallback) {
        if (this.zzb.containsKey(str)) {
            throw new IllegalArgumentException("LifecycleCallback with tag " + str + " already added to this fragment.");
        }
        this.zzb.put(str, lifecycleCallback);
        if (this.zzc > 0) {
            new com.google.android.gms.internal.common.t(Looper.getMainLooper()).post(new e0(this, lifecycleCallback, str));
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        Iterator it = this.zzb.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).dump(str, fileDescriptor, printWriter, strArr);
        }
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleFragment
    public final <T extends LifecycleCallback> T getCallbackOrNull(String str, Class<T> cls) {
        return cls.cast(this.zzb.get(str));
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleFragment
    public final /* synthetic */ Activity getLifecycleActivity() {
        return getActivity();
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleFragment
    public final boolean isCreated() {
        return this.zzc > 0;
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleFragment
    public final boolean isStarted() {
        return this.zzc >= 2;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityResult(int i7, int i8, Intent intent) {
        super.onActivityResult(i7, i8, intent);
        Iterator it = this.zzb.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).onActivityResult(i7, i8, intent);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.zzc = 1;
        this.zzd = bundle;
        for (Map.Entry entry : this.zzb.entrySet()) {
            ((LifecycleCallback) entry.getValue()).onCreate(bundle != null ? bundle.getBundle((String) entry.getKey()) : null);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        this.zzc = 5;
        Iterator it = this.zzb.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).onDestroy();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        this.zzc = 3;
        Iterator it = this.zzb.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).onResume();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (bundle == null) {
            return;
        }
        for (Map.Entry entry : this.zzb.entrySet()) {
            Bundle bundle2 = new Bundle();
            ((LifecycleCallback) entry.getValue()).onSaveInstanceState(bundle2);
            bundle.putBundle((String) entry.getKey(), bundle2);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        this.zzc = 2;
        Iterator it = this.zzb.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).onStart();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        this.zzc = 4;
        Iterator it = this.zzb.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).onStop();
        }
    }
}
