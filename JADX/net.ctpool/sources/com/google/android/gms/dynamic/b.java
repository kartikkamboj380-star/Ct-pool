package com.google.android.gms.dynamic;

import android.os.IBinder;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.a;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes.dex */
public final class b extends a.AbstractBinderC0223a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f13753a;

    private b(Object obj) {
        this.f13753a = obj;
    }

    public static Object j0(a aVar) {
        if (aVar instanceof b) {
            return ((b) aVar).f13753a;
        }
        IBinder iBinderAsBinder = aVar.asBinder();
        Field[] declaredFields = iBinderAsBinder.getClass().getDeclaredFields();
        Field field = null;
        int i7 = 0;
        for (Field field2 : declaredFields) {
            if (!field2.isSynthetic()) {
                i7++;
                field = field2;
            }
        }
        if (i7 != 1) {
            throw new IllegalArgumentException("Unexpected number of IObjectWrapper declared fields: " + declaredFields.length);
        }
        Preconditions.checkNotNull(field);
        if (field.isAccessible()) {
            throw new IllegalArgumentException("IObjectWrapper declared field not private!");
        }
        field.setAccessible(true);
        try {
            return field.get(iBinderAsBinder);
        } catch (IllegalAccessException e7) {
            throw new IllegalArgumentException("Could not access the field in remoteBinder.", e7);
        } catch (NullPointerException e8) {
            throw new IllegalArgumentException("Binder object is null.", e8);
        }
    }

    public static a k0(Object obj) {
        return new b(obj);
    }
}
