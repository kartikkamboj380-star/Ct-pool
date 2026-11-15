.class public final Lcom/facebook/react/modules/core/TimingModule;
.super Lcom/facebook/fbreact/specs/NativeTimingSpec;
.source "SourceFile"

# interfaces
.implements Lm2/c;


# annotations
.annotation runtime Li2/a;
    name = "Timing"
.end annotation


# instance fields
.field private final mJavaTimerManager:Lcom/facebook/react/modules/core/JavaTimerManager;


# direct methods
.method public constructor <init>(Lcom/facebook/react/bridge/ReactApplicationContext;LX1/e;)V
    .locals 2

    .line 1
    invoke-direct {p0, p1}, Lcom/facebook/fbreact/specs/NativeTimingSpec;-><init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lcom/facebook/react/modules/core/JavaTimerManager;

    .line 5
    .line 6
    invoke-static {}, Lcom/facebook/react/modules/core/a;->h()Lcom/facebook/react/modules/core/a;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    invoke-direct {v0, p1, p0, v1, p2}, Lcom/facebook/react/modules/core/JavaTimerManager;-><init>(Lcom/facebook/react/bridge/ReactApplicationContext;Lm2/c;Lcom/facebook/react/modules/core/a;LX1/e;)V

    .line 11
    .line 12
    .line 13
    iput-object v0, p0, Lcom/facebook/react/modules/core/TimingModule;->mJavaTimerManager:Lcom/facebook/react/modules/core/JavaTimerManager;

    .line 14
    .line 15
    return-void
.end method


# virtual methods
.method public callIdleCallbacks(D)V
    .locals 2

    invoke-virtual {p0}, Lcom/facebook/react/bridge/BaseJavaModule;->getReactApplicationContextIfActiveOrWarn()Lcom/facebook/react/bridge/ReactApplicationContext;

    move-result-object v0

    if-eqz v0, :cond_0

    const-class v1, Lcom/facebook/react/modules/core/JSTimers;

    invoke-virtual {v0, v1}, Lcom/facebook/react/bridge/ReactContext;->getJSModule(Ljava/lang/Class;)Lcom/facebook/react/bridge/JavaScriptModule;

    move-result-object v0

    check-cast v0, Lcom/facebook/react/modules/core/JSTimers;

    invoke-interface {v0, p1, p2}, Lcom/facebook/react/modules/core/JSTimers;->callIdleCallbacks(D)V

    :cond_0
    return-void
.end method

.method public callTimers(Lcom/facebook/react/bridge/WritableArray;)V
    .locals 2

    invoke-virtual {p0}, Lcom/facebook/react/bridge/BaseJavaModule;->getReactApplicationContextIfActiveOrWarn()Lcom/facebook/react/bridge/ReactApplicationContext;

    move-result-object v0

    if-eqz v0, :cond_0

    const-class v1, Lcom/facebook/react/modules/core/JSTimers;

    invoke-virtual {v0, v1}, Lcom/facebook/react/bridge/ReactContext;->getJSModule(Ljava/lang/Class;)Lcom/facebook/react/bridge/JavaScriptModule;

    move-result-object v0

    check-cast v0, Lcom/facebook/react/modules/core/JSTimers;

    invoke-interface {v0, p1}, Lcom/facebook/react/modules/core/JSTimers;->callTimers(Lcom/facebook/react/bridge/WritableArray;)V

    :cond_0
    return-void
.end method

.method public createTimer(DDDZ)V
    .locals 6

    double-to-int v1, p1

    double-to-int v2, p3

    iget-object v0, p0, Lcom/facebook/react/modules/core/TimingModule;->mJavaTimerManager:Lcom/facebook/react/modules/core/JavaTimerManager;

    move-wide v3, p5

    move v5, p7

    invoke-virtual/range {v0 .. v5}, Lcom/facebook/react/modules/core/JavaTimerManager;->s(IIDZ)V

    return-void
.end method

.method public deleteTimer(D)V
    .locals 0

    double-to-int p1, p1

    iget-object p2, p0, Lcom/facebook/react/modules/core/TimingModule;->mJavaTimerManager:Lcom/facebook/react/modules/core/JavaTimerManager;

    invoke-virtual {p2, p1}, Lcom/facebook/react/modules/core/JavaTimerManager;->deleteTimer(I)V

    return-void
.end method

.method public emitTimeDriftWarning(Ljava/lang/String;)V
    .locals 2

    invoke-virtual {p0}, Lcom/facebook/react/bridge/BaseJavaModule;->getReactApplicationContextIfActiveOrWarn()Lcom/facebook/react/bridge/ReactApplicationContext;

    move-result-object v0

    if-eqz v0, :cond_0

    const-class v1, Lcom/facebook/react/modules/core/JSTimers;

    invoke-virtual {v0, v1}, Lcom/facebook/react/bridge/ReactContext;->getJSModule(Ljava/lang/Class;)Lcom/facebook/react/bridge/JavaScriptModule;

    move-result-object v0

    check-cast v0, Lcom/facebook/react/modules/core/JSTimers;

    invoke-interface {v0, p1}, Lcom/facebook/react/modules/core/JSTimers;->emitTimeDriftWarning(Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public hasActiveTimersInRange(J)Z
    .locals 1

    iget-object v0, p0, Lcom/facebook/react/modules/core/TimingModule;->mJavaTimerManager:Lcom/facebook/react/modules/core/JavaTimerManager;

    invoke-virtual {v0, p1, p2}, Lcom/facebook/react/modules/core/JavaTimerManager;->t(J)Z

    move-result p1

    return p1
.end method

.method public initialize()V
    .locals 2

    invoke-virtual {p0}, Lcom/facebook/react/bridge/BaseJavaModule;->getReactApplicationContext()Lcom/facebook/react/bridge/ReactApplicationContext;

    move-result-object v0

    invoke-static {v0}, Lh2/c;->f(Lcom/facebook/react/bridge/ReactContext;)Lh2/c;

    move-result-object v0

    iget-object v1, p0, Lcom/facebook/react/modules/core/TimingModule;->mJavaTimerManager:Lcom/facebook/react/modules/core/JavaTimerManager;

    invoke-virtual {v0, v1}, Lh2/c;->d(Lh2/d;)V

    return-void
.end method

.method public invalidate()V
    .locals 2

    invoke-virtual {p0}, Lcom/facebook/react/bridge/BaseJavaModule;->getReactApplicationContext()Lcom/facebook/react/bridge/ReactApplicationContext;

    move-result-object v0

    invoke-static {v0}, Lh2/c;->f(Lcom/facebook/react/bridge/ReactContext;)Lh2/c;

    move-result-object v0

    iget-object v1, p0, Lcom/facebook/react/modules/core/TimingModule;->mJavaTimerManager:Lcom/facebook/react/modules/core/JavaTimerManager;

    invoke-virtual {v0, v1}, Lh2/c;->j(Lh2/d;)V

    iget-object v0, p0, Lcom/facebook/react/modules/core/TimingModule;->mJavaTimerManager:Lcom/facebook/react/modules/core/JavaTimerManager;

    invoke-virtual {v0}, Lcom/facebook/react/modules/core/JavaTimerManager;->x()V

    return-void
.end method

.method public setSendIdleEvents(Z)V
    .locals 1

    iget-object v0, p0, Lcom/facebook/react/modules/core/TimingModule;->mJavaTimerManager:Lcom/facebook/react/modules/core/JavaTimerManager;

    invoke-virtual {v0, p1}, Lcom/facebook/react/modules/core/JavaTimerManager;->setSendIdleEvents(Z)V

    return-void
.end method
