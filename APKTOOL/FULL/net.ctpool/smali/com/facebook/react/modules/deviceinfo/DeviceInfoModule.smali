.class public final Lcom/facebook/react/modules/deviceinfo/DeviceInfoModule;
.super Lcom/facebook/fbreact/specs/NativeDeviceInfoSpec;
.source "SourceFile"

# interfaces
.implements Lcom/facebook/react/bridge/LifecycleEventListener;


# annotations
.annotation runtime Li2/a;
    name = "DeviceInfo"
.end annotation


# instance fields
.field private fontScale:F

.field private previousDisplayMetrics:Lcom/facebook/react/bridge/ReadableMap;

.field private reactApplicationContext:Lcom/facebook/react/bridge/ReactApplicationContext;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 1
    const-string v0, "context"

    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/facebook/fbreact/specs/NativeDeviceInfoSpec;-><init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V

    iput-object v0, p0, Lcom/facebook/react/modules/deviceinfo/DeviceInfoModule;->reactApplicationContext:Lcom/facebook/react/bridge/ReactApplicationContext;

    invoke-static {p1}, Lcom/facebook/react/uimanager/h;->f(Landroid/content/Context;)V

    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    invoke-virtual {p1}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object p1

    iget p1, p1, Landroid/content/res/Configuration;->fontScale:F

    iput p1, p0, Lcom/facebook/react/modules/deviceinfo/DeviceInfoModule;->fontScale:F

    return-void
.end method

.method public constructor <init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V
    .locals 1

    .line 2
    const-string v0, "reactContext"

    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Lcom/facebook/fbreact/specs/NativeDeviceInfoSpec;-><init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V

    invoke-static {p1}, Lcom/facebook/react/uimanager/h;->f(Landroid/content/Context;)V

    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v0

    iget v0, v0, Landroid/content/res/Configuration;->fontScale:F

    iput v0, p0, Lcom/facebook/react/modules/deviceinfo/DeviceInfoModule;->fontScale:F

    invoke-virtual {p1, p0}, Lcom/facebook/react/bridge/ReactContext;->addLifecycleEventListener(Lcom/facebook/react/bridge/LifecycleEventListener;)V

    iput-object p1, p0, Lcom/facebook/react/modules/deviceinfo/DeviceInfoModule;->reactApplicationContext:Lcom/facebook/react/bridge/ReactApplicationContext;

    return-void
.end method


# virtual methods
.method public final emitUpdateDimensionsEvent()V
    .locals 3

    iget-object v0, p0, Lcom/facebook/react/modules/deviceinfo/DeviceInfoModule;->reactApplicationContext:Lcom/facebook/react/bridge/ReactApplicationContext;

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Lcom/facebook/react/bridge/ReactContext;->hasActiveReactInstance()Z

    move-result v1

    if-eqz v1, :cond_1

    iget v1, p0, Lcom/facebook/react/modules/deviceinfo/DeviceInfoModule;->fontScale:F

    float-to-double v1, v1

    invoke-static {v1, v2}, Lcom/facebook/react/uimanager/h;->a(D)Lcom/facebook/react/bridge/WritableMap;

    move-result-object v1

    iget-object v2, p0, Lcom/facebook/react/modules/deviceinfo/DeviceInfoModule;->previousDisplayMetrics:Lcom/facebook/react/bridge/ReadableMap;

    if-nez v2, :cond_0

    invoke-interface {v1}, Lcom/facebook/react/bridge/WritableMap;->copy()Lcom/facebook/react/bridge/WritableMap;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/react/modules/deviceinfo/DeviceInfoModule;->previousDisplayMetrics:Lcom/facebook/react/bridge/ReadableMap;

    goto :goto_0

    :cond_0
    invoke-static {v1, v2}, Lw5/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_2

    invoke-interface {v1}, Lcom/facebook/react/bridge/WritableMap;->copy()Lcom/facebook/react/bridge/WritableMap;

    move-result-object v2

    iput-object v2, p0, Lcom/facebook/react/modules/deviceinfo/DeviceInfoModule;->previousDisplayMetrics:Lcom/facebook/react/bridge/ReadableMap;

    const-string v2, "didUpdateDimensions"

    invoke-virtual {v0, v2, v1}, Lcom/facebook/react/bridge/ReactContext;->emitDeviceEvent(Ljava/lang/String;Ljava/lang/Object;)V

    goto :goto_0

    :cond_1
    new-instance v0, Lcom/facebook/react/bridge/ReactNoCrashSoftException;

    const-string v1, "No active CatalystInstance, cannot emitUpdateDimensionsEvent"

    invoke-direct {v0, v1}, Lcom/facebook/react/bridge/ReactNoCrashSoftException;-><init>(Ljava/lang/String;)V

    const-string v1, "DeviceInfo"

    invoke-static {v1, v0}, Lcom/facebook/react/bridge/ReactSoftExceptionLogger;->logSoftException(Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_2
    :goto_0
    return-void
.end method

.method public getTypedExportedConstants()Ljava/util/Map;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    iget v0, p0, Lcom/facebook/react/modules/deviceinfo/DeviceInfoModule;->fontScale:F

    float-to-double v0, v0

    invoke-static {v0, v1}, Lcom/facebook/react/uimanager/h;->a(D)Lcom/facebook/react/bridge/WritableMap;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/react/bridge/WritableMap;->copy()Lcom/facebook/react/bridge/WritableMap;

    move-result-object v1

    iput-object v1, p0, Lcom/facebook/react/modules/deviceinfo/DeviceInfoModule;->previousDisplayMetrics:Lcom/facebook/react/bridge/ReadableMap;

    const-string v1, "Dimensions"

    invoke-interface {v0}, Lcom/facebook/react/bridge/ReadableMap;->toHashMap()Ljava/util/HashMap;

    move-result-object v0

    invoke-static {v1, v0}, Li5/q;->a(Ljava/lang/Object;Ljava/lang/Object;)Li5/l;

    move-result-object v0

    invoke-static {v0}, Lj5/F;->e(Li5/l;)Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method public invalidate()V
    .locals 1

    invoke-super {p0}, Lcom/facebook/react/bridge/BaseJavaModule;->invalidate()V

    iget-object v0, p0, Lcom/facebook/react/modules/deviceinfo/DeviceInfoModule;->reactApplicationContext:Lcom/facebook/react/bridge/ReactApplicationContext;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p0}, Lcom/facebook/react/bridge/ReactContext;->removeLifecycleEventListener(Lcom/facebook/react/bridge/LifecycleEventListener;)V

    :cond_0
    return-void
.end method

.method public onHostDestroy()V
    .locals 0

    return-void
.end method

.method public onHostPause()V
    .locals 0

    return-void
.end method

.method public onHostResume()V
    .locals 2

    iget-object v0, p0, Lcom/facebook/react/modules/deviceinfo/DeviceInfoModule;->reactApplicationContext:Lcom/facebook/react/bridge/ReactApplicationContext;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v0

    if-eqz v0, :cond_0

    iget v0, v0, Landroid/content/res/Configuration;->fontScale:F

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_1

    iget v1, p0, Lcom/facebook/react/modules/deviceinfo/DeviceInfoModule;->fontScale:F

    invoke-static {v0, v1}, Lw5/k;->a(Ljava/lang/Float;F)Z

    move-result v1

    if-nez v1, :cond_1

    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    move-result v0

    iput v0, p0, Lcom/facebook/react/modules/deviceinfo/DeviceInfoModule;->fontScale:F

    invoke-virtual {p0}, Lcom/facebook/react/modules/deviceinfo/DeviceInfoModule;->emitUpdateDimensionsEvent()V

    :cond_1
    return-void
.end method
