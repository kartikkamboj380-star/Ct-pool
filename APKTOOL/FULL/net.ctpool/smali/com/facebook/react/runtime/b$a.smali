.class Lcom/facebook/react/runtime/b$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/facebook/react/devsupport/a0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/facebook/react/runtime/b;->T0(Lcom/facebook/react/runtime/ReactHostImpl;)Lcom/facebook/react/devsupport/a0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/react/runtime/ReactHostImpl;


# direct methods
.method constructor <init>(Lcom/facebook/react/runtime/ReactHostImpl;)V
    .locals 0

    iput-object p1, p0, Lcom/facebook/react/runtime/b$a;->a:Lcom/facebook/react/runtime/ReactHostImpl;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;)Landroid/view/View;
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcom/facebook/react/runtime/b$a;->j()Landroid/app/Activity;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/facebook/react/runtime/b$a;->a:Lcom/facebook/react/runtime/ReactHostImpl;

    invoke-virtual {v1, p1}, Lcom/facebook/react/runtime/ReactHostImpl;->F0(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_0

    new-instance v1, Landroid/os/Bundle;

    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    invoke-static {v0, p1, v1}, Lcom/facebook/react/runtime/e0;->f(Landroid/content/Context;Ljava/lang/String;Landroid/os/Bundle;)Lcom/facebook/react/runtime/e0;

    move-result-object p1

    iget-object v0, p0, Lcom/facebook/react/runtime/b$a;->a:Lcom/facebook/react/runtime/ReactHostImpl;

    invoke-virtual {p1, v0}, Lcom/facebook/react/runtime/e0;->c(Lcom/facebook/react/runtime/ReactHostImpl;)V

    invoke-virtual {p1}, Lcom/facebook/react/runtime/e0;->start()Lb2/a;

    invoke-virtual {p1}, Lcom/facebook/react/runtime/e0;->a()Landroid/view/ViewGroup;

    move-result-object p1

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public b()Lcom/facebook/react/bridge/JavaScriptExecutorFactory;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Not implemented for bridgeless mode"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public d(Landroid/view/View;)V
    .locals 0

    .line 1
    return-void
.end method

.method public h()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/facebook/react/runtime/b$a;->a:Lcom/facebook/react/runtime/ReactHostImpl;

    invoke-virtual {v0}, Lcom/facebook/react/runtime/ReactHostImpl;->h0()Lcom/facebook/react/bridge/ReactContext;

    move-result-object v0

    if-eqz v0, :cond_0

    const-class v1, Lcom/facebook/react/modules/core/DeviceEventManagerModule$RCTDeviceEventEmitter;

    invoke-virtual {v0, v1}, Lcom/facebook/react/bridge/ReactContext;->getJSModule(Ljava/lang/Class;)Lcom/facebook/react/bridge/JavaScriptModule;

    move-result-object v0

    check-cast v0, Lcom/facebook/react/modules/core/DeviceEventManagerModule$RCTDeviceEventEmitter;

    const-string v1, "toggleElementInspector"

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Lcom/facebook/react/modules/core/DeviceEventManagerModule$RCTDeviceEventEmitter;->emit(Ljava/lang/String;Ljava/lang/Object;)V

    :cond_0
    return-void
.end method

.method public j()Landroid/app/Activity;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/runtime/b$a;->a:Lcom/facebook/react/runtime/ReactHostImpl;

    invoke-virtual {v0}, Lcom/facebook/react/runtime/ReactHostImpl;->o0()Landroid/app/Activity;

    move-result-object v0

    return-object v0
.end method
