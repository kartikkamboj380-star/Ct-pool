.class public Lcom/facebook/react/uimanager/e0;
.super Lcom/facebook/react/bridge/ReactContext;
.source "SourceFile"


# instance fields
.field private final m:Lcom/facebook/react/bridge/ReactApplicationContext;

.field private final n:Ljava/lang/String;

.field private final o:I


# direct methods
.method public constructor <init>(Lcom/facebook/react/bridge/ReactApplicationContext;Landroid/content/Context;Ljava/lang/String;I)V
    .locals 0

    invoke-direct {p0, p2}, Lcom/facebook/react/bridge/ReactContext;-><init>(Landroid/content/Context;)V

    invoke-virtual {p0, p1}, Lcom/facebook/react/bridge/ReactContext;->initializeFromOther(Lcom/facebook/react/bridge/ReactContext;)V

    iput-object p1, p0, Lcom/facebook/react/uimanager/e0;->m:Lcom/facebook/react/bridge/ReactApplicationContext;

    iput-object p3, p0, Lcom/facebook/react/uimanager/e0;->n:Ljava/lang/String;

    iput p4, p0, Lcom/facebook/react/uimanager/e0;->o:I

    return-void
.end method


# virtual methods
.method public addLifecycleEventListener(Lcom/facebook/react/bridge/LifecycleEventListener;)V
    .locals 1

    iget-object v0, p0, Lcom/facebook/react/uimanager/e0;->m:Lcom/facebook/react/bridge/ReactApplicationContext;

    invoke-virtual {v0, p1}, Lcom/facebook/react/bridge/ReactContext;->addLifecycleEventListener(Lcom/facebook/react/bridge/LifecycleEventListener;)V

    return-void
.end method

.method public b()Lcom/facebook/react/bridge/ReactApplicationContext;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/uimanager/e0;->m:Lcom/facebook/react/bridge/ReactApplicationContext;

    return-object v0
.end method

.method public c()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/facebook/react/uimanager/e0;->o:I

    return v0
.end method

.method public destroy()V
    .locals 1

    iget-object v0, p0, Lcom/facebook/react/uimanager/e0;->m:Lcom/facebook/react/bridge/ReactApplicationContext;

    invoke-virtual {v0}, Lcom/facebook/react/bridge/ReactContext;->destroy()V

    return-void
.end method

.method public getCatalystInstance()Lcom/facebook/react/bridge/CatalystInstance;
    .locals 1

    iget-object v0, p0, Lcom/facebook/react/uimanager/e0;->m:Lcom/facebook/react/bridge/ReactApplicationContext;

    invoke-virtual {v0}, Lcom/facebook/react/bridge/ReactContext;->getCatalystInstance()Lcom/facebook/react/bridge/CatalystInstance;

    move-result-object v0

    return-object v0
.end method

.method public getCurrentActivity()Landroid/app/Activity;
    .locals 1

    iget-object v0, p0, Lcom/facebook/react/uimanager/e0;->m:Lcom/facebook/react/bridge/ReactApplicationContext;

    invoke-virtual {v0}, Lcom/facebook/react/bridge/ReactContext;->getCurrentActivity()Landroid/app/Activity;

    move-result-object v0

    return-object v0
.end method

.method public getFabricUIManager()Lcom/facebook/react/bridge/UIManager;
    .locals 1

    iget-object v0, p0, Lcom/facebook/react/uimanager/e0;->m:Lcom/facebook/react/bridge/ReactApplicationContext;

    invoke-virtual {v0}, Lcom/facebook/react/bridge/ReactContext;->getFabricUIManager()Lcom/facebook/react/bridge/UIManager;

    move-result-object v0

    return-object v0
.end method

.method public getJSCallInvokerHolder()Lcom/facebook/react/turbomodule/core/interfaces/CallInvokerHolder;
    .locals 1

    iget-object v0, p0, Lcom/facebook/react/uimanager/e0;->m:Lcom/facebook/react/bridge/ReactApplicationContext;

    invoke-virtual {v0}, Lcom/facebook/react/bridge/ReactContext;->getJSCallInvokerHolder()Lcom/facebook/react/turbomodule/core/interfaces/CallInvokerHolder;

    move-result-object v0

    return-object v0
.end method

.method public getJSModule(Ljava/lang/Class;)Lcom/facebook/react/bridge/JavaScriptModule;
    .locals 1

    iget-object v0, p0, Lcom/facebook/react/uimanager/e0;->m:Lcom/facebook/react/bridge/ReactApplicationContext;

    invoke-virtual {v0, p1}, Lcom/facebook/react/bridge/ReactContext;->getJSModule(Ljava/lang/Class;)Lcom/facebook/react/bridge/JavaScriptModule;

    move-result-object p1

    return-object p1
.end method

.method public getJavaScriptContextHolder()Lcom/facebook/react/bridge/JavaScriptContextHolder;
    .locals 1

    iget-object v0, p0, Lcom/facebook/react/uimanager/e0;->m:Lcom/facebook/react/bridge/ReactApplicationContext;

    invoke-virtual {v0}, Lcom/facebook/react/bridge/ReactContext;->getJavaScriptContextHolder()Lcom/facebook/react/bridge/JavaScriptContextHolder;

    move-result-object v0

    return-object v0
.end method

.method public getNativeModule(Ljava/lang/Class;)Lcom/facebook/react/bridge/NativeModule;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/uimanager/e0;->m:Lcom/facebook/react/bridge/ReactApplicationContext;

    invoke-virtual {v0, p1}, Lcom/facebook/react/bridge/ReactContext;->getNativeModule(Ljava/lang/Class;)Lcom/facebook/react/bridge/NativeModule;

    move-result-object p1

    return-object p1
.end method

.method public getNativeModule(Ljava/lang/String;)Lcom/facebook/react/bridge/NativeModule;
    .locals 1

    .line 2
    iget-object v0, p0, Lcom/facebook/react/uimanager/e0;->m:Lcom/facebook/react/bridge/ReactApplicationContext;

    invoke-virtual {v0, p1}, Lcom/facebook/react/bridge/ReactContext;->getNativeModule(Ljava/lang/String;)Lcom/facebook/react/bridge/NativeModule;

    move-result-object p1

    return-object p1
.end method

.method public getNativeModules()Ljava/util/Collection;
    .locals 1

    iget-object v0, p0, Lcom/facebook/react/uimanager/e0;->m:Lcom/facebook/react/bridge/ReactApplicationContext;

    invoke-virtual {v0}, Lcom/facebook/react/bridge/ReactContext;->getNativeModules()Ljava/util/Collection;

    move-result-object v0

    return-object v0
.end method

.method public getSourceURL()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/facebook/react/uimanager/e0;->m:Lcom/facebook/react/bridge/ReactApplicationContext;

    invoke-virtual {v0}, Lcom/facebook/react/bridge/ReactContext;->getSourceURL()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public handleException(Ljava/lang/Exception;)V
    .locals 1

    iget-object v0, p0, Lcom/facebook/react/uimanager/e0;->m:Lcom/facebook/react/bridge/ReactApplicationContext;

    invoke-virtual {v0, p1}, Lcom/facebook/react/bridge/ReactContext;->handleException(Ljava/lang/Exception;)V

    return-void
.end method

.method public hasActiveCatalystInstance()Z
    .locals 1

    iget-object v0, p0, Lcom/facebook/react/uimanager/e0;->m:Lcom/facebook/react/bridge/ReactApplicationContext;

    invoke-virtual {v0}, Lcom/facebook/react/bridge/ReactContext;->hasActiveCatalystInstance()Z

    move-result v0

    return v0
.end method

.method public hasActiveReactInstance()Z
    .locals 1

    iget-object v0, p0, Lcom/facebook/react/uimanager/e0;->m:Lcom/facebook/react/bridge/ReactApplicationContext;

    invoke-virtual {v0}, Lcom/facebook/react/bridge/ReactContext;->hasActiveCatalystInstance()Z

    move-result v0

    return v0
.end method

.method public hasCatalystInstance()Z
    .locals 1

    iget-object v0, p0, Lcom/facebook/react/uimanager/e0;->m:Lcom/facebook/react/bridge/ReactApplicationContext;

    invoke-virtual {v0}, Lcom/facebook/react/bridge/ReactContext;->hasCatalystInstance()Z

    move-result v0

    return v0
.end method

.method public hasCurrentActivity()Z
    .locals 1

    iget-object v0, p0, Lcom/facebook/react/uimanager/e0;->m:Lcom/facebook/react/bridge/ReactApplicationContext;

    invoke-virtual {v0}, Lcom/facebook/react/bridge/ReactContext;->hasCurrentActivity()Z

    move-result v0

    return v0
.end method

.method public hasNativeModule(Ljava/lang/Class;)Z
    .locals 1

    iget-object v0, p0, Lcom/facebook/react/uimanager/e0;->m:Lcom/facebook/react/bridge/ReactApplicationContext;

    invoke-virtual {v0, p1}, Lcom/facebook/react/bridge/ReactContext;->hasNativeModule(Ljava/lang/Class;)Z

    move-result p1

    return p1
.end method

.method public hasReactInstance()Z
    .locals 1

    iget-object v0, p0, Lcom/facebook/react/uimanager/e0;->m:Lcom/facebook/react/bridge/ReactApplicationContext;

    invoke-virtual {v0}, Lcom/facebook/react/bridge/ReactContext;->hasReactInstance()Z

    move-result v0

    return v0
.end method

.method public isBridgeless()Z
    .locals 1

    iget-object v0, p0, Lcom/facebook/react/uimanager/e0;->m:Lcom/facebook/react/bridge/ReactApplicationContext;

    invoke-virtual {v0}, Lcom/facebook/react/bridge/ReactContext;->isBridgeless()Z

    move-result v0

    return v0
.end method

.method public registerSegment(ILjava/lang/String;Lcom/facebook/react/bridge/Callback;)V
    .locals 1

    iget-object v0, p0, Lcom/facebook/react/uimanager/e0;->m:Lcom/facebook/react/bridge/ReactApplicationContext;

    invoke-virtual {v0, p1, p2, p3}, Lcom/facebook/react/bridge/ReactContext;->registerSegment(ILjava/lang/String;Lcom/facebook/react/bridge/Callback;)V

    return-void
.end method

.method public removeLifecycleEventListener(Lcom/facebook/react/bridge/LifecycleEventListener;)V
    .locals 1

    iget-object v0, p0, Lcom/facebook/react/uimanager/e0;->m:Lcom/facebook/react/bridge/ReactApplicationContext;

    invoke-virtual {v0, p1}, Lcom/facebook/react/bridge/ReactContext;->removeLifecycleEventListener(Lcom/facebook/react/bridge/LifecycleEventListener;)V

    return-void
.end method
