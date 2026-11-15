package com.facebook.react.bridge;

import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
@R1.a
class JavaModuleWrapper {
    private final JSInstance mJSInstance;
    private final ModuleHolder mModuleHolder;
    private final ArrayList<NativeMethod> mMethods = new ArrayList<>();
    private final ArrayList<MethodDescriptor> mDescs = new ArrayList<>();

    @R1.a
    public static class MethodDescriptor {

        @R1.a
        Method method;

        @R1.a
        String name;

        @R1.a
        String signature;

        @R1.a
        String type;
    }

    interface NativeMethod {
        String getType();

        void invoke(JSInstance jSInstance, ReadableArray readableArray);
    }

    public JavaModuleWrapper(JSInstance jSInstance, ModuleHolder moduleHolder) {
        this.mJSInstance = jSInstance;
        this.mModuleHolder = moduleHolder;
    }

    @R1.a
    private void findMethods() {
        P2.a.c(0L, "findMethods");
        Class<?> cls = this.mModuleHolder.getModule().getClass();
        Class<? super Object> superclass = cls.getSuperclass();
        if (TurboModule.class.isAssignableFrom(superclass)) {
            cls = superclass;
        }
        for (Method method : cls.getDeclaredMethods()) {
            ReactMethod reactMethod = (ReactMethod) method.getAnnotation(ReactMethod.class);
            if (reactMethod != null) {
                String name = method.getName();
                MethodDescriptor methodDescriptor = new MethodDescriptor();
                JavaMethodWrapper javaMethodWrapper = new JavaMethodWrapper(this, method, reactMethod.isBlockingSynchronousMethod());
                methodDescriptor.name = name;
                String type = javaMethodWrapper.getType();
                methodDescriptor.type = type;
                if (BaseJavaModule.METHOD_TYPE_SYNC.equals(type)) {
                    methodDescriptor.signature = javaMethodWrapper.getSignature();
                    methodDescriptor.method = method;
                }
                this.mMethods.add(javaMethodWrapper);
                this.mDescs.add(methodDescriptor);
            }
        }
        P2.a.g(0L);
    }

    @R1.a
    public NativeMap getConstants() {
        String name = getName();
        P2.b.a(0L, "JavaModuleWrapper.getConstants").b("moduleName", name).c();
        ReactMarker.logMarker(ReactMarkerConstants.GET_CONSTANTS_START, name);
        BaseJavaModule module = getModule();
        P2.a.c(0L, "module.getConstants");
        Map<String, Object> constants = module.getConstants();
        P2.a.g(0L);
        P2.a.c(0L, "create WritableNativeMap");
        ReactMarker.logMarker(ReactMarkerConstants.CONVERT_CONSTANTS_START, name);
        try {
            return Arguments.makeNativeMap(constants);
        } finally {
            ReactMarker.logMarker(ReactMarkerConstants.CONVERT_CONSTANTS_END, name);
            P2.a.g(0L);
            ReactMarker.logMarker(ReactMarkerConstants.GET_CONSTANTS_END, name);
            P2.b.b(0L).c();
        }
    }

    @R1.a
    public List<MethodDescriptor> getMethodDescriptors() {
        if (this.mDescs.isEmpty()) {
            findMethods();
        }
        return this.mDescs;
    }

    @R1.a
    public BaseJavaModule getModule() {
        return (BaseJavaModule) this.mModuleHolder.getModule();
    }

    @R1.a
    public String getName() {
        return this.mModuleHolder.getName();
    }

    @R1.a
    public void invoke(int i7, ReadableNativeArray readableNativeArray) {
        if (i7 >= this.mMethods.size()) {
            return;
        }
        this.mMethods.get(i7).invoke(this.mJSInstance, readableNativeArray);
    }
}
