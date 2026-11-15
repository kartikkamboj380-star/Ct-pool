package com.facebook.imagepipeline.nativecode;

import java.lang.reflect.InvocationTargetException;
import w5.k;

/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f f10706a = new f();

    private f() {
    }

    public static final L1.d a(int i7, boolean z6, boolean z7) {
        try {
            Class cls = Integer.TYPE;
            Class cls2 = Boolean.TYPE;
            Object objNewInstance = NativeJpegTranscoderFactory.class.getConstructor(cls, cls2, cls2).newInstance(Integer.valueOf(i7), Boolean.valueOf(z6), Boolean.valueOf(z7));
            k.d(objNewInstance, "null cannot be cast to non-null type com.facebook.imagepipeline.transcoder.ImageTranscoderFactory");
            return (L1.d) objNewInstance;
        } catch (ClassNotFoundException e7) {
            throw new RuntimeException("Dependency ':native-imagetranscoder' is needed to use the default native image transcoder.", e7);
        } catch (IllegalAccessException e8) {
            throw new RuntimeException("Dependency ':native-imagetranscoder' is needed to use the default native image transcoder.", e8);
        } catch (IllegalArgumentException e9) {
            throw new RuntimeException("Dependency ':native-imagetranscoder' is needed to use the default native image transcoder.", e9);
        } catch (InstantiationException e10) {
            throw new RuntimeException("Dependency ':native-imagetranscoder' is needed to use the default native image transcoder.", e10);
        } catch (NoSuchMethodException e11) {
            throw new RuntimeException("Dependency ':native-imagetranscoder' is needed to use the default native image transcoder.", e11);
        } catch (SecurityException e12) {
            throw new RuntimeException("Dependency ':native-imagetranscoder' is needed to use the default native image transcoder.", e12);
        } catch (InvocationTargetException e13) {
            throw new RuntimeException("Dependency ':native-imagetranscoder' is needed to use the default native image transcoder.", e13);
        }
    }
}
