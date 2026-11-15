.class public final Lcom/facebook/react/modules/debug/DevSettingsModule;
.super Lcom/facebook/fbreact/specs/NativeDevSettingsSpec;
.source "SourceFile"


# annotations
.annotation runtime Li2/a;
    name = "DevSettings"
.end annotation


# instance fields
.field private final devSupportManager:LX1/e;


# direct methods
.method public constructor <init>(Lcom/facebook/react/bridge/ReactApplicationContext;LX1/e;)V
    .locals 1

    .line 1
    const-string v0, "devSupportManager"

    .line 2
    .line 3
    invoke-static {p2, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0, p1}, Lcom/facebook/fbreact/specs/NativeDevSettingsSpec;-><init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V

    .line 7
    .line 8
    .line 9
    iput-object p2, p0, Lcom/facebook/react/modules/debug/DevSettingsModule;->devSupportManager:LX1/e;

    .line 10
    .line 11
    return-void
.end method

.method public static synthetic a(Ljava/lang/String;Lcom/facebook/react/modules/debug/DevSettingsModule;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/facebook/react/modules/debug/DevSettingsModule;->addMenuItem$lambda$1(Ljava/lang/String;Lcom/facebook/react/modules/debug/DevSettingsModule;)V

    return-void
.end method

.method private static final addMenuItem$lambda$1(Ljava/lang/String;Lcom/facebook/react/modules/debug/DevSettingsModule;)V
    .locals 2

    const-string v0, "$title"

    invoke-static {p0, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "this$0"

    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, Lcom/facebook/react/bridge/Arguments;->createMap()Lcom/facebook/react/bridge/WritableMap;

    move-result-object v0

    const-string v1, "title"

    invoke-interface {v0, v1, p0}, Lcom/facebook/react/bridge/WritableMap;->putString(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/facebook/react/bridge/BaseJavaModule;->getReactApplicationContextIfActiveOrWarn()Lcom/facebook/react/bridge/ReactApplicationContext;

    move-result-object p0

    if-eqz p0, :cond_0

    const-string p1, "didPressMenuItem"

    invoke-virtual {p0, p1, v0}, Lcom/facebook/react/bridge/ReactContext;->emitDeviceEvent(Ljava/lang/String;Ljava/lang/Object;)V

    :cond_0
    return-void
.end method

.method public static synthetic b(Lcom/facebook/react/modules/debug/DevSettingsModule;)V
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/facebook/react/modules/debug/DevSettingsModule;->reload$lambda$0(Lcom/facebook/react/modules/debug/DevSettingsModule;)V

    return-void
.end method

.method private static final reload$lambda$0(Lcom/facebook/react/modules/debug/DevSettingsModule;)V
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p0, p0, Lcom/facebook/react/modules/debug/DevSettingsModule;->devSupportManager:LX1/e;

    invoke-interface {p0}, LX1/e;->q()V

    return-void
.end method


# virtual methods
.method public addListener(Ljava/lang/String;)V
    .locals 1

    const-string v0, "eventName"

    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public addMenuItem(Ljava/lang/String;)V
    .locals 2

    const-string v0, "title"

    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/facebook/react/modules/debug/DevSettingsModule;->devSupportManager:LX1/e;

    new-instance v1, Lcom/facebook/react/modules/debug/a;

    invoke-direct {v1, p1, p0}, Lcom/facebook/react/modules/debug/a;-><init>(Ljava/lang/String;Lcom/facebook/react/modules/debug/DevSettingsModule;)V

    invoke-interface {v0, p1, v1}, LX1/e;->x(Ljava/lang/String;LX1/d;)V

    return-void
.end method

.method public onFastRefresh()V
    .locals 0

    return-void
.end method

.method public openDebugger()V
    .locals 1

    iget-object v0, p0, Lcom/facebook/react/modules/debug/DevSettingsModule;->devSupportManager:LX1/e;

    invoke-interface {v0}, LX1/e;->E()V

    return-void
.end method

.method public reload()V
    .locals 1

    iget-object v0, p0, Lcom/facebook/react/modules/debug/DevSettingsModule;->devSupportManager:LX1/e;

    invoke-interface {v0}, LX1/e;->n()Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Lcom/facebook/react/modules/debug/b;

    invoke-direct {v0, p0}, Lcom/facebook/react/modules/debug/b;-><init>(Lcom/facebook/react/modules/debug/DevSettingsModule;)V

    invoke-static {v0}, Lcom/facebook/react/bridge/UiThreadUtil;->runOnUiThread(Ljava/lang/Runnable;)Z

    :cond_0
    return-void
.end method

.method public reloadWithReason(Ljava/lang/String;)V
    .locals 1

    const-string v0, "reason"

    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/facebook/react/modules/debug/DevSettingsModule;->reload()V

    return-void
.end method

.method public removeListeners(D)V
    .locals 0

    return-void
.end method

.method public setHotLoadingEnabled(Z)V
    .locals 1

    iget-object v0, p0, Lcom/facebook/react/modules/debug/DevSettingsModule;->devSupportManager:LX1/e;

    invoke-interface {v0, p1}, LX1/e;->b(Z)V

    return-void
.end method

.method public setIsDebuggingRemotely(Z)V
    .locals 1

    iget-object v0, p0, Lcom/facebook/react/modules/debug/DevSettingsModule;->devSupportManager:LX1/e;

    invoke-interface {v0, p1}, LX1/e;->f(Z)V

    return-void
.end method

.method public setIsShakeToShowDevMenuEnabled(Z)V
    .locals 0

    return-void
.end method

.method public setProfilingEnabled(Z)V
    .locals 1

    iget-object v0, p0, Lcom/facebook/react/modules/debug/DevSettingsModule;->devSupportManager:LX1/e;

    invoke-interface {v0, p1}, LX1/e;->e(Z)V

    return-void
.end method

.method public toggleElementInspector()V
    .locals 1

    iget-object v0, p0, Lcom/facebook/react/modules/debug/DevSettingsModule;->devSupportManager:LX1/e;

    invoke-interface {v0}, LX1/e;->h()V

    return-void
.end method
