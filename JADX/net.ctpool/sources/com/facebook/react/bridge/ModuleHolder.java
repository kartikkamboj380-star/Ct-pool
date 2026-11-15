package com.facebook.react.bridge;

import b1.AbstractC0674a;
import com.facebook.react.module.model.ReactModuleInfo;
import java.util.concurrent.atomic.AtomicInteger;
import javax.inject.Provider;

/* JADX INFO: loaded from: classes.dex */
@R1.a
public class ModuleHolder {
    private static final AtomicInteger sInstanceKeyCounter = new AtomicInteger(1);
    private boolean mInitializable;
    private final int mInstanceKey = sInstanceKeyCounter.getAndIncrement();
    private boolean mIsCreating;
    private boolean mIsInitializing;
    private NativeModule mModule;
    private final String mName;
    private Provider mProvider;
    private final ReactModuleInfo mReactModuleInfo;

    public ModuleHolder(NativeModule nativeModule) {
        String name = nativeModule.getName();
        this.mName = name;
        this.mReactModuleInfo = new ReactModuleInfo(nativeModule.getName(), nativeModule.getClass().getSimpleName(), nativeModule.canOverrideExistingModule(), true, CxxModuleWrapper.class.isAssignableFrom(nativeModule.getClass()), ReactModuleInfo.b(nativeModule.getClass()));
        this.mModule = nativeModule;
        a1.c.a().a(AbstractC0674a.f9574e, "NativeModule init: %s", name);
    }

    private NativeModule create() {
        boolean z6 = false;
        SoftAssertions.assertCondition(this.mModule == null, "Creating an already created module.");
        ReactMarker.logMarker(ReactMarkerConstants.CREATE_MODULE_START, this.mName, this.mInstanceKey);
        P2.b.a(0L, "ModuleHolder.createModule").b("name", this.mName).c();
        a1.c.a().a(AbstractC0674a.f9574e, "NativeModule init: %s", this.mName);
        try {
            NativeModule nativeModule = (NativeModule) ((Provider) O1.a.c(this.mProvider)).get();
            this.mProvider = null;
            synchronized (this) {
                try {
                    this.mModule = nativeModule;
                    if (this.mInitializable && !this.mIsInitializing) {
                        z6 = true;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (z6) {
                doInitialize(nativeModule);
            }
            return nativeModule;
        } finally {
        }
    }

    private void doInitialize(NativeModule nativeModule) {
        boolean z6;
        P2.b.a(0L, "ModuleHolder.initialize").b("name", this.mName).c();
        ReactMarker.logMarker(ReactMarkerConstants.INITIALIZE_MODULE_START, this.mName, this.mInstanceKey);
        try {
            synchronized (this) {
                try {
                    if (!this.mInitializable || this.mIsInitializing) {
                        z6 = false;
                    } else {
                        z6 = true;
                        this.mIsInitializing = true;
                    }
                } finally {
                }
            }
            if (z6) {
                nativeModule.initialize();
                synchronized (this) {
                    this.mIsInitializing = false;
                }
            }
        } finally {
            ReactMarker.logMarker(ReactMarkerConstants.INITIALIZE_MODULE_END, this.mName, this.mInstanceKey);
            P2.b.b(0L).c();
        }
    }

    public synchronized void destroy() {
        NativeModule nativeModule = this.mModule;
        if (nativeModule != null) {
            nativeModule.invalidate();
        }
    }

    public boolean getCanOverrideExistingModule() {
        return this.mReactModuleInfo.a();
    }

    public String getClassName() {
        return this.mReactModuleInfo.c();
    }

    @R1.a
    public NativeModule getModule() {
        boolean z6;
        NativeModule nativeModule;
        NativeModule nativeModule2;
        synchronized (this) {
            try {
                NativeModule nativeModule3 = this.mModule;
                if (nativeModule3 != null) {
                    return nativeModule3;
                }
                if (this.mIsCreating) {
                    z6 = false;
                } else {
                    z6 = true;
                    this.mIsCreating = true;
                }
                if (z6) {
                    NativeModule nativeModuleCreate = create();
                    synchronized (this) {
                        this.mIsCreating = false;
                        notifyAll();
                    }
                    return nativeModuleCreate;
                }
                synchronized (this) {
                    while (true) {
                        nativeModule = this.mModule;
                        if (nativeModule != null || !this.mIsCreating) {
                            break;
                        }
                        try {
                            wait();
                        } catch (InterruptedException unused) {
                        }
                    }
                    nativeModule2 = (NativeModule) O1.a.c(nativeModule);
                }
                return nativeModule2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @R1.a
    public String getName() {
        return this.mName;
    }

    synchronized boolean hasInstance() {
        return this.mModule != null;
    }

    public boolean isCxxModule() {
        return this.mReactModuleInfo.d();
    }

    public boolean isTurboModule() {
        return this.mReactModuleInfo.e();
    }

    void markInitializable() {
        boolean z6;
        NativeModule nativeModule;
        synchronized (this) {
            z6 = true;
            try {
                this.mInitializable = true;
                if (this.mModule != null) {
                    O1.a.a(!this.mIsInitializing);
                    nativeModule = this.mModule;
                } else {
                    nativeModule = null;
                    z6 = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z6) {
            doInitialize(nativeModule);
        }
    }

    public ModuleHolder(ReactModuleInfo reactModuleInfo, Provider provider) {
        this.mName = reactModuleInfo.f();
        this.mProvider = provider;
        this.mReactModuleInfo = reactModuleInfo;
        if (reactModuleInfo.g()) {
            this.mModule = create();
        }
    }
}
