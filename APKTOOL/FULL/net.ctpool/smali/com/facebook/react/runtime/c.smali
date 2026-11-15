.class Lcom/facebook/react/runtime/c;
.super Lcom/facebook/react/bridge/ReactApplicationContext;
.source "SourceFile"

# interfaces
.implements Lcom/facebook/react/uimanager/events/j;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/facebook/react/runtime/c$a;
    }
.end annotation


# instance fields
.field private final m:Lcom/facebook/react/runtime/ReactHostImpl;

.field private final n:Ljava/util/concurrent/atomic/AtomicReference;

.field private final o:Ljava/lang/String;


# direct methods
.method constructor <init>(Landroid/content/Context;Lcom/facebook/react/runtime/ReactHostImpl;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/facebook/react/bridge/ReactApplicationContext;-><init>(Landroid/content/Context;)V

    new-instance p1, Ljava/util/concurrent/atomic/AtomicReference;

    invoke-direct {p1}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    iput-object p1, p0, Lcom/facebook/react/runtime/c;->n:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/facebook/react/runtime/c;->o:Ljava/lang/String;

    iput-object p2, p0, Lcom/facebook/react/runtime/c;->m:Lcom/facebook/react/runtime/ReactHostImpl;

    sget-boolean p1, Lcom/facebook/react/config/ReactFeatureFlags;->unstable_useFabricInterop:Z

    if-eqz p1, :cond_0

    invoke-virtual {p0}, Lcom/facebook/react/bridge/ReactContext;->initializeInteropModules()V

    :cond_0
    return-void
.end method


# virtual methods
.method b()Lm2/b;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/runtime/c;->m:Lcom/facebook/react/runtime/ReactHostImpl;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/facebook/react/runtime/ReactHostImpl;->i0()Lm2/b;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method c()LX1/e;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/runtime/c;->m:Lcom/facebook/react/runtime/ReactHostImpl;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/facebook/react/runtime/ReactHostImpl;->f()LX1/e;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public d(Ljava/lang/String;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/runtime/c;->n:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    return-void
.end method

.method public destroy()V
    .locals 0

    return-void
.end method

.method public emitDeviceEvent(Ljava/lang/String;Ljava/lang/Object;)V
    .locals 2

    iget-object v0, p0, Lcom/facebook/react/runtime/c;->m:Lcom/facebook/react/runtime/ReactHostImpl;

    filled-new-array {p1, p2}, [Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lcom/facebook/react/bridge/Arguments;->fromJavaArgs([Ljava/lang/Object;)Lcom/facebook/react/bridge/WritableNativeArray;

    move-result-object p1

    const-string p2, "RCTDeviceEventEmitter"

    const-string v1, "emit"

    invoke-virtual {v0, p2, v1, p1}, Lcom/facebook/react/runtime/ReactHostImpl;->Z(Ljava/lang/String;Ljava/lang/String;Lcom/facebook/react/bridge/NativeArray;)Lu2/f;

    return-void
.end method

.method public getCatalystInstance()Lcom/facebook/react/bridge/CatalystInstance;
    .locals 2

    iget-object v0, p0, Lcom/facebook/react/runtime/c;->o:Ljava/lang/String;

    const-string v1, "[WARNING] Bridgeless doesn\'t support CatalystInstance. Accessing an API that\'s not part of the new architecture is not encouraged usage."

    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    new-instance v0, Lcom/facebook/react/runtime/BridgelessCatalystInstance;

    iget-object v1, p0, Lcom/facebook/react/runtime/c;->m:Lcom/facebook/react/runtime/ReactHostImpl;

    invoke-direct {v0, v1}, Lcom/facebook/react/runtime/BridgelessCatalystInstance;-><init>(Lcom/facebook/react/runtime/ReactHostImpl;)V

    return-object v0
.end method

.method public getEventDispatcher()Lcom/facebook/react/uimanager/events/e;
    .locals 1

    iget-object v0, p0, Lcom/facebook/react/runtime/c;->m:Lcom/facebook/react/runtime/ReactHostImpl;

    invoke-virtual {v0}, Lcom/facebook/react/runtime/ReactHostImpl;->k0()Lcom/facebook/react/uimanager/events/e;

    move-result-object v0

    return-object v0
.end method

.method public getFabricUIManager()Lcom/facebook/react/bridge/UIManager;
    .locals 1

    iget-object v0, p0, Lcom/facebook/react/runtime/c;->m:Lcom/facebook/react/runtime/ReactHostImpl;

    invoke-virtual {v0}, Lcom/facebook/react/runtime/ReactHostImpl;->A0()Lcom/facebook/react/fabric/FabricUIManager;

    move-result-object v0

    return-object v0
.end method

.method public getJSCallInvokerHolder()Lcom/facebook/react/turbomodule/core/interfaces/CallInvokerHolder;
    .locals 1

    iget-object v0, p0, Lcom/facebook/react/runtime/c;->m:Lcom/facebook/react/runtime/ReactHostImpl;

    invoke-virtual {v0}, Lcom/facebook/react/runtime/ReactHostImpl;->l0()Lcom/facebook/react/turbomodule/core/interfaces/CallInvokerHolder;

    move-result-object v0

    return-object v0
.end method

.method public getJSModule(Ljava/lang/Class;)Lcom/facebook/react/bridge/JavaScriptModule;
    .locals 4

    iget-object v0, p0, Lcom/facebook/react/bridge/ReactContext;->mInteropModuleRegistry:Lcom/facebook/react/bridge/interop/InteropModuleRegistry;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Lcom/facebook/react/bridge/interop/InteropModuleRegistry;->shouldReturnInteropModule(Ljava/lang/Class;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/facebook/react/bridge/ReactContext;->mInteropModuleRegistry:Lcom/facebook/react/bridge/interop/InteropModuleRegistry;

    invoke-virtual {v0, p1}, Lcom/facebook/react/bridge/interop/InteropModuleRegistry;->getInteropModule(Ljava/lang/Class;)Lcom/facebook/react/bridge/JavaScriptModule;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-virtual {p1}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    filled-new-array {p1}, [Ljava/lang/Class;

    move-result-object v1

    new-instance v2, Lcom/facebook/react/runtime/c$a;

    iget-object v3, p0, Lcom/facebook/react/runtime/c;->m:Lcom/facebook/react/runtime/ReactHostImpl;

    invoke-direct {v2, v3, p1}, Lcom/facebook/react/runtime/c$a;-><init>(Lcom/facebook/react/runtime/ReactHostImpl;Ljava/lang/Class;)V

    invoke-static {v0, v1, v2}, Ljava/lang/reflect/Proxy;->newProxyInstance(Ljava/lang/ClassLoader;[Ljava/lang/Class;Ljava/lang/reflect/InvocationHandler;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/facebook/react/bridge/JavaScriptModule;

    return-object p1
.end method

.method public getJavaScriptContextHolder()Lcom/facebook/react/bridge/JavaScriptContextHolder;
    .locals 1

    iget-object v0, p0, Lcom/facebook/react/runtime/c;->m:Lcom/facebook/react/runtime/ReactHostImpl;

    invoke-virtual {v0}, Lcom/facebook/react/runtime/ReactHostImpl;->m0()Lcom/facebook/react/bridge/JavaScriptContextHolder;

    move-result-object v0

    return-object v0
.end method

.method public getNativeModule(Ljava/lang/Class;)Lcom/facebook/react/bridge/NativeModule;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/runtime/c;->m:Lcom/facebook/react/runtime/ReactHostImpl;

    invoke-virtual {v0, p1}, Lcom/facebook/react/runtime/ReactHostImpl;->p0(Ljava/lang/Class;)Lcom/facebook/react/bridge/NativeModule;

    move-result-object p1

    return-object p1
.end method

.method public getNativeModule(Ljava/lang/String;)Lcom/facebook/react/bridge/NativeModule;
    .locals 1

    .line 2
    iget-object v0, p0, Lcom/facebook/react/runtime/c;->m:Lcom/facebook/react/runtime/ReactHostImpl;

    invoke-virtual {v0, p1}, Lcom/facebook/react/runtime/ReactHostImpl;->q0(Ljava/lang/String;)Lcom/facebook/react/bridge/NativeModule;

    move-result-object p1

    return-object p1
.end method

.method public getNativeModules()Ljava/util/Collection;
    .locals 1

    iget-object v0, p0, Lcom/facebook/react/runtime/c;->m:Lcom/facebook/react/runtime/ReactHostImpl;

    invoke-virtual {v0}, Lcom/facebook/react/runtime/ReactHostImpl;->r0()Ljava/util/Collection;

    move-result-object v0

    return-object v0
.end method

.method public getSourceURL()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/facebook/react/runtime/c;->n:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public handleException(Ljava/lang/Exception;)V
    .locals 1

    iget-object v0, p0, Lcom/facebook/react/runtime/c;->m:Lcom/facebook/react/runtime/ReactHostImpl;

    invoke-virtual {v0, p1}, Lcom/facebook/react/runtime/ReactHostImpl;->B0(Ljava/lang/Exception;)V

    return-void
.end method

.method public hasActiveCatalystInstance()Z
    .locals 1

    invoke-virtual {p0}, Lcom/facebook/react/runtime/c;->hasActiveReactInstance()Z

    move-result v0

    return v0
.end method

.method public hasActiveReactInstance()Z
    .locals 1

    iget-object v0, p0, Lcom/facebook/react/runtime/c;->m:Lcom/facebook/react/runtime/ReactHostImpl;

    invoke-virtual {v0}, Lcom/facebook/react/runtime/ReactHostImpl;->D0()Z

    move-result v0

    return v0
.end method

.method public hasCatalystInstance()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public hasNativeModule(Ljava/lang/Class;)Z
    .locals 1

    iget-object v0, p0, Lcom/facebook/react/runtime/c;->m:Lcom/facebook/react/runtime/ReactHostImpl;

    invoke-virtual {v0, p1}, Lcom/facebook/react/runtime/ReactHostImpl;->C0(Ljava/lang/Class;)Z

    move-result p1

    return p1
.end method

.method public hasReactInstance()Z
    .locals 1

    iget-object v0, p0, Lcom/facebook/react/runtime/c;->m:Lcom/facebook/react/runtime/ReactHostImpl;

    invoke-virtual {v0}, Lcom/facebook/react/runtime/ReactHostImpl;->D0()Z

    move-result v0

    return v0
.end method

.method public isBridgeless()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public registerSegment(ILjava/lang/String;Lcom/facebook/react/bridge/Callback;)V
    .locals 1

    iget-object v0, p0, Lcom/facebook/react/runtime/c;->m:Lcom/facebook/react/runtime/ReactHostImpl;

    invoke-virtual {v0, p1, p2, p3}, Lcom/facebook/react/runtime/ReactHostImpl;->z1(ILjava/lang/String;Lcom/facebook/react/bridge/Callback;)Lu2/f;

    return-void
.end method
