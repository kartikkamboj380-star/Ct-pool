.class Lcom/facebook/react/uimanager/events/ReactEventEmitter;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/facebook/react/uimanager/events/RCTModernEventEmitter;


# static fields
.field static final synthetic $assertionsDisabled:Z = false

.field private static final TAG:Ljava/lang/String; = "ReactEventEmitter"


# instance fields
.field private mDefaultEventEmitter:Lcom/facebook/react/uimanager/events/RCTEventEmitter;

.field private mFabricEventEmitter:Lcom/facebook/react/uimanager/events/RCTModernEventEmitter;

.field private final mReactContext:Lcom/facebook/react/bridge/ReactApplicationContext;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/facebook/react/uimanager/events/ReactEventEmitter;->mFabricEventEmitter:Lcom/facebook/react/uimanager/events/RCTModernEventEmitter;

    iput-object v0, p0, Lcom/facebook/react/uimanager/events/ReactEventEmitter;->mDefaultEventEmitter:Lcom/facebook/react/uimanager/events/RCTEventEmitter;

    iput-object p1, p0, Lcom/facebook/react/uimanager/events/ReactEventEmitter;->mReactContext:Lcom/facebook/react/bridge/ReactApplicationContext;

    return-void
.end method

.method private getDefaultEventEmitter()Lcom/facebook/react/uimanager/events/RCTEventEmitter;
    .locals 2

    iget-object v0, p0, Lcom/facebook/react/uimanager/events/ReactEventEmitter;->mDefaultEventEmitter:Lcom/facebook/react/uimanager/events/RCTEventEmitter;

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/facebook/react/uimanager/events/ReactEventEmitter;->mReactContext:Lcom/facebook/react/bridge/ReactApplicationContext;

    invoke-virtual {v0}, Lcom/facebook/react/bridge/ReactContext;->hasActiveReactInstance()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/facebook/react/uimanager/events/ReactEventEmitter;->mReactContext:Lcom/facebook/react/bridge/ReactApplicationContext;

    const-class v1, Lcom/facebook/react/uimanager/events/RCTEventEmitter;

    invoke-virtual {v0, v1}, Lcom/facebook/react/bridge/ReactContext;->getJSModule(Ljava/lang/Class;)Lcom/facebook/react/bridge/JavaScriptModule;

    move-result-object v0

    check-cast v0, Lcom/facebook/react/uimanager/events/RCTEventEmitter;

    iput-object v0, p0, Lcom/facebook/react/uimanager/events/ReactEventEmitter;->mDefaultEventEmitter:Lcom/facebook/react/uimanager/events/RCTEventEmitter;

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/facebook/react/bridge/ReactNoCrashSoftException;

    const-string v1, "Cannot get RCTEventEmitter from Context, no active Catalyst instance!"

    invoke-direct {v0, v1}, Lcom/facebook/react/bridge/ReactNoCrashSoftException;-><init>(Ljava/lang/String;)V

    const-string v1, "ReactEventEmitter"

    invoke-static {v1, v0}, Lcom/facebook/react/bridge/ReactSoftExceptionLogger;->logSoftException(Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/facebook/react/uimanager/events/ReactEventEmitter;->mDefaultEventEmitter:Lcom/facebook/react/uimanager/events/RCTEventEmitter;

    return-object v0
.end method


# virtual methods
.method public receiveEvent(IILjava/lang/String;Lcom/facebook/react/bridge/WritableMap;)V
    .locals 8

    .line 1
    const/4 v5, 0x0

    const/4 v7, 0x2

    const/4 v4, 0x0

    move-object v0, p0

    move v1, p1

    move v2, p2

    move-object v3, p3

    move-object v6, p4

    invoke-virtual/range {v0 .. v7}, Lcom/facebook/react/uimanager/events/ReactEventEmitter;->receiveEvent(IILjava/lang/String;ZILcom/facebook/react/bridge/WritableMap;I)V

    return-void
.end method

.method public receiveEvent(IILjava/lang/String;ZILcom/facebook/react/bridge/WritableMap;I)V
    .locals 9

    .line 2
    move v1, p1

    move v2, p2

    move-object v3, p3

    invoke-static {p2, p1}, Ly2/a;->b(II)I

    move-result v0

    const/4 v4, 0x2

    move-object v8, p0

    if-ne v0, v4, :cond_0

    iget-object v4, v8, Lcom/facebook/react/uimanager/events/ReactEventEmitter;->mFabricEventEmitter:Lcom/facebook/react/uimanager/events/RCTModernEventEmitter;

    if-eqz v4, :cond_0

    move-object v0, v4

    move v1, p1

    move v2, p2

    move-object v3, p3

    move v4, p4

    move v5, p5

    move-object v6, p6

    move/from16 v7, p7

    invoke-interface/range {v0 .. v7}, Lcom/facebook/react/uimanager/events/RCTModernEventEmitter;->receiveEvent(IILjava/lang/String;ZILcom/facebook/react/bridge/WritableMap;I)V

    goto :goto_0

    :cond_0
    const/4 v4, 0x1

    if-ne v0, v4, :cond_1

    invoke-direct {p0}, Lcom/facebook/react/uimanager/events/ReactEventEmitter;->getDefaultEventEmitter()Lcom/facebook/react/uimanager/events/RCTEventEmitter;

    move-result-object v0

    if-eqz v0, :cond_2

    move-object v1, p6

    invoke-interface {v0, p2, p3, p6}, Lcom/facebook/react/uimanager/events/RCTEventEmitter;->receiveEvent(ILjava/lang/String;Lcom/facebook/react/bridge/WritableMap;)V

    goto :goto_0

    :cond_1
    new-instance v4, Lcom/facebook/react/bridge/ReactNoCrashSoftException;

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "Cannot find EventEmitter for receiveEvent: SurfaceId["

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, "] ReactTag["

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, "] UIManagerType["

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, "] EventName["

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "]"

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v4, v0}, Lcom/facebook/react/bridge/ReactNoCrashSoftException;-><init>(Ljava/lang/String;)V

    const-string v0, "ReactEventEmitter"

    invoke-static {v0, v4}, Lcom/facebook/react/bridge/ReactSoftExceptionLogger;->logSoftException(Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_2
    :goto_0
    return-void
.end method

.method public receiveEvent(ILjava/lang/String;Lcom/facebook/react/bridge/WritableMap;)V
    .locals 1

    .line 3
    const/4 v0, -0x1

    invoke-virtual {p0, v0, p1, p2, p3}, Lcom/facebook/react/uimanager/events/ReactEventEmitter;->receiveEvent(IILjava/lang/String;Lcom/facebook/react/bridge/WritableMap;)V

    return-void
.end method

.method public receiveTouches(Lcom/facebook/react/uimanager/events/q;)V
    .locals 5

    .line 1
    invoke-virtual {p1}, Lcom/facebook/react/uimanager/events/d;->getViewTag()I

    move-result v0

    invoke-virtual {p1}, Lcom/facebook/react/uimanager/events/d;->getViewTag()I

    move-result v1

    invoke-virtual {p1}, Lcom/facebook/react/uimanager/events/d;->getSurfaceId()I

    move-result v2

    invoke-static {v1, v2}, Ly2/a;->b(II)I

    move-result v1

    const/4 v2, 0x2

    if-ne v1, v2, :cond_0

    iget-object v2, p0, Lcom/facebook/react/uimanager/events/ReactEventEmitter;->mFabricEventEmitter:Lcom/facebook/react/uimanager/events/RCTModernEventEmitter;

    if-eqz v2, :cond_0

    invoke-static {v2, p1}, Lcom/facebook/react/uimanager/events/t;->c(Lcom/facebook/react/uimanager/events/RCTModernEventEmitter;Lcom/facebook/react/uimanager/events/q;)V

    goto :goto_0

    :cond_0
    const/4 v2, 0x1

    if-ne v1, v2, :cond_1

    invoke-direct {p0}, Lcom/facebook/react/uimanager/events/ReactEventEmitter;->getDefaultEventEmitter()Lcom/facebook/react/uimanager/events/RCTEventEmitter;

    move-result-object v2

    if-eqz v2, :cond_1

    iget-object v0, p0, Lcom/facebook/react/uimanager/events/ReactEventEmitter;->mDefaultEventEmitter:Lcom/facebook/react/uimanager/events/RCTEventEmitter;

    invoke-static {v0, p1}, Lcom/facebook/react/uimanager/events/t;->d(Lcom/facebook/react/uimanager/events/RCTEventEmitter;Lcom/facebook/react/uimanager/events/q;)V

    goto :goto_0

    :cond_1
    new-instance v2, Lcom/facebook/react/bridge/ReactNoCrashSoftException;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Cannot find EventEmitter for receivedTouches: ReactTag["

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, "] UIManagerType["

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, "] EventName["

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lcom/facebook/react/uimanager/events/q;->getEventName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "]"

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v2, p1}, Lcom/facebook/react/bridge/ReactNoCrashSoftException;-><init>(Ljava/lang/String;)V

    const-string p1, "ReactEventEmitter"

    invoke-static {p1, v2}, Lcom/facebook/react/bridge/ReactSoftExceptionLogger;->logSoftException(Ljava/lang/String;Ljava/lang/Throwable;)V

    :goto_0
    return-void
.end method

.method public receiveTouches(Ljava/lang/String;Lcom/facebook/react/bridge/WritableArray;Lcom/facebook/react/bridge/WritableArray;)V
    .locals 3

    .line 2
    invoke-interface {p2}, Lcom/facebook/react/bridge/ReadableArray;->size()I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-lez v0, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    invoke-static {v0}, LO1/a;->a(Z)V

    invoke-interface {p2, v1}, Lcom/facebook/react/bridge/ReadableArray;->getMap(I)Lcom/facebook/react/bridge/ReadableMap;

    move-result-object v0

    const-string v1, "target"

    invoke-interface {v0, v1}, Lcom/facebook/react/bridge/ReadableMap;->getInt(Ljava/lang/String;)I

    move-result v0

    invoke-static {v0}, Ly2/a;->a(I)I

    move-result v0

    if-ne v0, v2, :cond_1

    invoke-direct {p0}, Lcom/facebook/react/uimanager/events/ReactEventEmitter;->getDefaultEventEmitter()Lcom/facebook/react/uimanager/events/RCTEventEmitter;

    move-result-object v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/facebook/react/uimanager/events/ReactEventEmitter;->mDefaultEventEmitter:Lcom/facebook/react/uimanager/events/RCTEventEmitter;

    invoke-interface {v0, p1, p2, p3}, Lcom/facebook/react/uimanager/events/RCTEventEmitter;->receiveTouches(Ljava/lang/String;Lcom/facebook/react/bridge/WritableArray;Lcom/facebook/react/bridge/WritableArray;)V

    :cond_1
    return-void
.end method

.method public register(ILcom/facebook/react/uimanager/events/RCTEventEmitter;)V
    .locals 0

    .line 1
    iput-object p2, p0, Lcom/facebook/react/uimanager/events/ReactEventEmitter;->mDefaultEventEmitter:Lcom/facebook/react/uimanager/events/RCTEventEmitter;

    return-void
.end method

.method public register(ILcom/facebook/react/uimanager/events/RCTModernEventEmitter;)V
    .locals 0

    .line 2
    iput-object p2, p0, Lcom/facebook/react/uimanager/events/ReactEventEmitter;->mFabricEventEmitter:Lcom/facebook/react/uimanager/events/RCTModernEventEmitter;

    return-void
.end method

.method public unregister(I)V
    .locals 2

    const/4 v0, 0x1

    const/4 v1, 0x0

    if-ne p1, v0, :cond_0

    iput-object v1, p0, Lcom/facebook/react/uimanager/events/ReactEventEmitter;->mDefaultEventEmitter:Lcom/facebook/react/uimanager/events/RCTEventEmitter;

    goto :goto_0

    :cond_0
    iput-object v1, p0, Lcom/facebook/react/uimanager/events/ReactEventEmitter;->mFabricEventEmitter:Lcom/facebook/react/uimanager/events/RCTModernEventEmitter;

    :goto_0
    return-void
.end method
