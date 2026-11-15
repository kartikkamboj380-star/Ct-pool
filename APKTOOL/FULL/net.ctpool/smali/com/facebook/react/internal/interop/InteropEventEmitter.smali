.class public final Lcom/facebook/react/internal/interop/InteropEventEmitter;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/facebook/react/uimanager/events/RCTEventEmitter;


# instance fields
.field private eventDispatcherOverride:Lcom/facebook/react/uimanager/events/e;

.field private final reactContext:Lcom/facebook/react/bridge/ReactContext;


# direct methods
.method public constructor <init>(Lcom/facebook/react/bridge/ReactContext;)V
    .locals 1

    const-string v0, "reactContext"

    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/facebook/react/internal/interop/InteropEventEmitter;->reactContext:Lcom/facebook/react/bridge/ReactContext;

    return-void
.end method


# virtual methods
.method public final overrideEventDispatcher(Lcom/facebook/react/uimanager/events/e;)V
    .locals 0

    iput-object p1, p0, Lcom/facebook/react/internal/interop/InteropEventEmitter;->eventDispatcherOverride:Lcom/facebook/react/uimanager/events/e;

    return-void
.end method

.method public receiveEvent(ILjava/lang/String;Lcom/facebook/react/bridge/WritableMap;)V
    .locals 3

    const-string v0, "eventName"

    invoke-static {p2, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/facebook/react/internal/interop/InteropEventEmitter;->eventDispatcherOverride:Lcom/facebook/react/uimanager/events/e;

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/facebook/react/internal/interop/InteropEventEmitter;->reactContext:Lcom/facebook/react/bridge/ReactContext;

    invoke-static {v0, p1}, Lcom/facebook/react/uimanager/k0;->c(Lcom/facebook/react/bridge/ReactContext;I)Lcom/facebook/react/uimanager/events/e;

    move-result-object v0

    :cond_0
    iget-object v1, p0, Lcom/facebook/react/internal/interop/InteropEventEmitter;->reactContext:Lcom/facebook/react/bridge/ReactContext;

    invoke-static {v1}, Lcom/facebook/react/uimanager/k0;->e(Landroid/content/Context;)I

    move-result v1

    if-eqz v0, :cond_1

    new-instance v2, Lf2/a;

    invoke-direct {v2, p2, p3, v1, p1}, Lf2/a;-><init>(Ljava/lang/String;Lcom/facebook/react/bridge/WritableMap;II)V

    invoke-interface {v0, v2}, Lcom/facebook/react/uimanager/events/e;->c(Lcom/facebook/react/uimanager/events/d;)V

    :cond_1
    return-void
.end method

.method public receiveTouches(Ljava/lang/String;Lcom/facebook/react/bridge/WritableArray;Lcom/facebook/react/bridge/WritableArray;)V
    .locals 1

    const-string v0, "eventName"

    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "touches"

    invoke-static {p2, p1}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "changedIndices"

    invoke-static {p3, p1}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Ljava/lang/UnsupportedOperationException;

    const-string p2, "EventEmitter#receiveTouches is not supported by the Fabric Interop Layer"

    invoke-direct {p1, p2}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
