package com.google.android.gms.common.util;

import com.google.android.gms.common.annotation.KeepForSdk;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import n.C1890a;
import n.b;

/* JADX INFO: loaded from: classes.dex */
@KeepForSdk
public final class CollectionUtils {
    private CollectionUtils() {
    }

    @KeepForSdk
    public static boolean isEmpty(Collection<?> collection) {
        if (collection == null) {
            return true;
        }
        return collection.isEmpty();
    }

    @KeepForSdk
    @Deprecated
    public static <T> List<T> listOf() {
        return Collections.emptyList();
    }

    @KeepForSdk
    public static <K, V> Map<K, V> mapOf(K k7, V v6, K k8, V v7, K k9, V v8) {
        Map mapZza = zza(3, false);
        mapZza.put(k7, v6);
        mapZza.put(k8, v7);
        mapZza.put(k9, v8);
        return Collections.unmodifiableMap(mapZza);
    }

    @KeepForSdk
    public static <K, V> Map<K, V> mapOfKeyValueArrays(K[] kArr, V[] vArr) {
        int length = kArr.length;
        int length2 = vArr.length;
        if (length != length2) {
            throw new IllegalArgumentException("Key and values array lengths not equal: " + length + " != " + length2);
        }
        if (length == 0) {
            return Collections.emptyMap();
        }
        if (length == 1) {
            return Collections.singletonMap(kArr[0], vArr[0]);
        }
        Map mapZza = zza(length, false);
        for (int i7 = 0; i7 < kArr.length; i7++) {
            mapZza.put(kArr[i7], vArr[i7]);
        }
        return Collections.unmodifiableMap(mapZza);
    }

    @KeepForSdk
    public static <T> Set<T> mutableSetOfWithSize(int i7) {
        return i7 == 0 ? new b() : zzb(i7, true);
    }

    @KeepForSdk
    @Deprecated
    public static <T> Set<T> setOf(T t6, T t7, T t8) {
        Set setZzb = zzb(3, false);
        setZzb.add(t6);
        setZzb.add(t7);
        setZzb.add(t8);
        return Collections.unmodifiableSet(setZzb);
    }

    private static Map zza(int i7, boolean z6) {
        return i7 <= 256 ? new C1890a(i7) : new HashMap(i7, 1.0f);
    }

    private static Set zzb(int i7, boolean z6) {
        if (i7 <= (true != z6 ? 256 : 128)) {
            return new b(i7);
        }
        return new HashSet(i7, true != z6 ? 1.0f : 0.75f);
    }

    @KeepForSdk
    @Deprecated
    public static <T> List<T> listOf(T t6) {
        return Collections.singletonList(t6);
    }

    @KeepForSdk
    public static <K, V> Map<K, V> mapOf(K k7, V v6, K k8, V v7, K k9, V v8, K k10, V v9, K k11, V v10, K k12, V v11) {
        Map mapZza = zza(6, false);
        mapZza.put(k7, v6);
        mapZza.put(k8, v7);
        mapZza.put(k9, v8);
        mapZza.put(k10, v9);
        mapZza.put(k11, v10);
        mapZza.put(k12, v11);
        return Collections.unmodifiableMap(mapZza);
    }

    @KeepForSdk
    @Deprecated
    public static <T> Set<T> setOf(T... tArr) {
        int length = tArr.length;
        if (length == 0) {
            return Collections.emptySet();
        }
        if (length == 1) {
            return Collections.singleton(tArr[0]);
        }
        if (length == 2) {
            T t6 = tArr[0];
            T t7 = tArr[1];
            Set setZzb = zzb(2, false);
            setZzb.add(t6);
            setZzb.add(t7);
            return Collections.unmodifiableSet(setZzb);
        }
        if (length == 3) {
            return setOf(tArr[0], tArr[1], tArr[2]);
        }
        if (length != 4) {
            Set setZzb2 = zzb(length, false);
            Collections.addAll(setZzb2, tArr);
            return Collections.unmodifiableSet(setZzb2);
        }
        T t8 = tArr[0];
        T t9 = tArr[1];
        T t10 = tArr[2];
        T t11 = tArr[3];
        Set setZzb3 = zzb(4, false);
        setZzb3.add(t8);
        setZzb3.add(t9);
        setZzb3.add(t10);
        setZzb3.add(t11);
        return Collections.unmodifiableSet(setZzb3);
    }

    @KeepForSdk
    @Deprecated
    public static <T> List<T> listOf(T... tArr) {
        int length = tArr.length;
        return length != 0 ? length != 1 ? Collections.unmodifiableList(Arrays.asList(tArr)) : Collections.singletonList(tArr[0]) : Collections.emptyList();
    }
}
