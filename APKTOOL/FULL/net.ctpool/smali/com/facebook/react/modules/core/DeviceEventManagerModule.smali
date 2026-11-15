.class public Lcom/facebook/react/modules/core/DeviceEventManagerModule;
.super Lcom/facebook/fbreact/specs/NativeDeviceEventManagerSpec;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/facebook/react/modules/core/DeviceEventManagerModule$RCTDeviceEventEmitter;
    }
.end annotation

.annotation runtime Li2/a;
    name = "DeviceEventManager"
.end annotation


# instance fields
.field private final mInvokeDefaultBackPressRunnable:Ljava/lang/Runnable;


# direct methods
.method public constructor <init>(Lcom/facebook/react/bridge/ReactApplicationContext;Lm2/b;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/facebook/fbreact/specs/NativeDeviceEventManagerSpec;-><init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V

    .line 2
    .line 3
    .line 4
    new-instance p1, Lcom/facebook/react/modules/core/DeviceEventManagerModule$a;

    .line 5
    .line 6
    invoke-direct {p1, p0, p2}, Lcom/facebook/react/modules/core/DeviceEventManagerModule$a;-><init>(Lcom/facebook/react/modules/core/DeviceEventManagerModule;Lm2/b;)V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Lcom/facebook/react/modules/core/DeviceEventManagerModule;->mInvokeDefaultBackPressRunnable:Ljava/lang/Runnable;

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public emitHardwareBackPressed()V
    .locals 3

    invoke-virtual {p0}, Lcom/facebook/react/bridge/BaseJavaModule;->getReactApplicationContextIfActiveOrWarn()Lcom/facebook/react/bridge/ReactApplicationContext;

    move-result-object v0

    if-eqz v0, :cond_0

    const-string v1, "hardwareBackPress"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lcom/facebook/react/bridge/ReactContext;->emitDeviceEvent(Ljava/lang/String;Ljava/lang/Object;)V

    :cond_0
    return-void
.end method

.method public emitNewIntentReceived(Landroid/net/Uri;)V
    .locals 3

    invoke-virtual {p0}, Lcom/facebook/react/bridge/BaseJavaModule;->getReactApplicationContextIfActiveOrWarn()Lcom/facebook/react/bridge/ReactApplicationContext;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-static {}, Lcom/facebook/react/bridge/Arguments;->createMap()Lcom/facebook/react/bridge/WritableMap;

    move-result-object v1

    invoke-virtual {p1}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v2, "url"

    invoke-interface {v1, v2, p1}, Lcom/facebook/react/bridge/WritableMap;->putString(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, v2, v1}, Lcom/facebook/react/bridge/ReactContext;->emitDeviceEvent(Ljava/lang/String;Ljava/lang/Object;)V

    :cond_0
    return-void
.end method

.method public invokeDefaultBackPressHandler()V
    .locals 2

    invoke-virtual {p0}, Lcom/facebook/react/bridge/BaseJavaModule;->getReactApplicationContext()Lcom/facebook/react/bridge/ReactApplicationContext;

    move-result-object v0

    iget-object v1, p0, Lcom/facebook/react/modules/core/DeviceEventManagerModule;->mInvokeDefaultBackPressRunnable:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Lcom/facebook/react/bridge/ReactContext;->runOnUiQueueThread(Ljava/lang/Runnable;)V

    return-void
.end method
