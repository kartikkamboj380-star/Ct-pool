.class public Lcom/facebook/react/x;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Landroid/app/Activity;

.field private b:Lcom/facebook/react/X;

.field private final c:Ljava/lang/String;

.field private d:Landroid/os/Bundle;

.field private e:Lcom/facebook/react/devsupport/I;

.field private f:Lcom/facebook/react/L;

.field private g:Lcom/facebook/react/y;

.field private h:Lc2/a;

.field private i:Z


# direct methods
.method public constructor <init>(Landroid/app/Activity;Lcom/facebook/react/L;Ljava/lang/String;Landroid/os/Bundle;Z)V
    .locals 1

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-boolean v0, Lcom/facebook/react/config/ReactFeatureFlags;->useTurboModules:Z

    iput-boolean p5, p0, Lcom/facebook/react/x;->i:Z

    iput-object p1, p0, Lcom/facebook/react/x;->a:Landroid/app/Activity;

    iput-object p3, p0, Lcom/facebook/react/x;->c:Ljava/lang/String;

    iput-object p4, p0, Lcom/facebook/react/x;->d:Landroid/os/Bundle;

    new-instance p1, Lcom/facebook/react/devsupport/I;

    invoke-direct {p1}, Lcom/facebook/react/devsupport/I;-><init>()V

    iput-object p1, p0, Lcom/facebook/react/x;->e:Lcom/facebook/react/devsupport/I;

    iput-object p2, p0, Lcom/facebook/react/x;->f:Lcom/facebook/react/L;

    return-void
.end method

.method public constructor <init>(Landroid/app/Activity;Lcom/facebook/react/y;Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-boolean v0, Lcom/facebook/react/config/ReactFeatureFlags;->enableFabricRenderer:Z

    iput-boolean v0, p0, Lcom/facebook/react/x;->i:Z

    iput-object p1, p0, Lcom/facebook/react/x;->a:Landroid/app/Activity;

    iput-object p3, p0, Lcom/facebook/react/x;->c:Ljava/lang/String;

    iput-object p4, p0, Lcom/facebook/react/x;->d:Landroid/os/Bundle;

    new-instance p1, Lcom/facebook/react/devsupport/I;

    invoke-direct {p1}, Lcom/facebook/react/devsupport/I;-><init>()V

    iput-object p1, p0, Lcom/facebook/react/x;->e:Lcom/facebook/react/devsupport/I;

    iput-object p2, p0, Lcom/facebook/react/x;->g:Lcom/facebook/react/y;

    return-void
.end method

.method private b()LX1/e;
    .locals 1

    .line 1
    sget-boolean v0, Lcom/facebook/react/config/ReactFeatureFlags;->enableBridgelessArchitecture:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lcom/facebook/react/x;->g:Lcom/facebook/react/y;

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-interface {v0}, Lcom/facebook/react/y;->f()LX1/e;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    iget-object v0, p0, Lcom/facebook/react/x;->g:Lcom/facebook/react/y;

    .line 16
    .line 17
    invoke-interface {v0}, Lcom/facebook/react/y;->f()LX1/e;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    return-object v0

    .line 22
    :cond_0
    invoke-direct {p0}, Lcom/facebook/react/x;->d()Lcom/facebook/react/L;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    invoke-virtual {v0}, Lcom/facebook/react/L;->v()Z

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    if-eqz v0, :cond_1

    .line 31
    .line 32
    invoke-direct {p0}, Lcom/facebook/react/x;->d()Lcom/facebook/react/L;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    invoke-virtual {v0}, Lcom/facebook/react/L;->o()Lcom/facebook/react/H;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    if-eqz v0, :cond_1

    .line 41
    .line 42
    invoke-direct {p0}, Lcom/facebook/react/x;->d()Lcom/facebook/react/L;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    invoke-virtual {v0}, Lcom/facebook/react/L;->o()Lcom/facebook/react/H;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    invoke-virtual {v0}, Lcom/facebook/react/H;->D()LX1/e;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    return-object v0

    .line 55
    :cond_1
    const/4 v0, 0x0

    .line 56
    return-object v0
.end method

.method private d()Lcom/facebook/react/L;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/x;->f:Lcom/facebook/react/L;

    return-object v0
.end method


# virtual methods
.method protected a()Lcom/facebook/react/X;
    .locals 2

    .line 1
    new-instance v0, Lcom/facebook/react/X;

    iget-object v1, p0, Lcom/facebook/react/x;->a:Landroid/app/Activity;

    invoke-direct {v0, v1}, Lcom/facebook/react/X;-><init>(Landroid/content/Context;)V

    invoke-virtual {p0}, Lcom/facebook/react/x;->f()Z

    move-result v1

    invoke-virtual {v0, v1}, Lcom/facebook/react/X;->setIsFabric(Z)V

    return-object v0
.end method

.method public c()Lcom/facebook/react/H;
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/facebook/react/x;->d()Lcom/facebook/react/L;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/react/L;->o()Lcom/facebook/react/H;

    move-result-object v0

    return-object v0
.end method

.method public e()Lcom/facebook/react/X;
    .locals 1

    .line 1
    sget-boolean v0, Lcom/facebook/react/config/ReactFeatureFlags;->enableBridgelessArchitecture:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/facebook/react/x;->h:Lc2/a;

    invoke-interface {v0}, Lc2/a;->a()Landroid/view/ViewGroup;

    move-result-object v0

    check-cast v0, Lcom/facebook/react/X;

    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/facebook/react/x;->b:Lcom/facebook/react/X;

    return-object v0
.end method

.method protected f()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/facebook/react/x;->i:Z

    return v0
.end method

.method public g(Ljava/lang/String;)V
    .locals 3

    .line 1
    sget-boolean v0, Lcom/facebook/react/config/ReactFeatureFlags;->enableBridgelessArchitecture:Z

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/facebook/react/x;->h:Lc2/a;

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/facebook/react/x;->g:Lcom/facebook/react/y;

    iget-object v1, p0, Lcom/facebook/react/x;->a:Landroid/app/Activity;

    iget-object v2, p0, Lcom/facebook/react/x;->d:Landroid/os/Bundle;

    invoke-interface {v0, v1, p1, v2}, Lcom/facebook/react/y;->a(Landroid/content/Context;Ljava/lang/String;Landroid/os/Bundle;)Lc2/a;

    move-result-object p1

    iput-object p1, p0, Lcom/facebook/react/x;->h:Lc2/a;

    iget-object v0, p0, Lcom/facebook/react/x;->a:Landroid/app/Activity;

    invoke-interface {p1}, Lc2/a;->a()Landroid/view/ViewGroup;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/app/Activity;->setContentView(Landroid/view/View;)V

    :cond_0
    iget-object p1, p0, Lcom/facebook/react/x;->h:Lc2/a;

    invoke-interface {p1}, Lc2/a;->start()Lb2/a;

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lcom/facebook/react/x;->b:Lcom/facebook/react/X;

    if-nez v0, :cond_2

    invoke-virtual {p0}, Lcom/facebook/react/x;->a()Lcom/facebook/react/X;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/react/x;->b:Lcom/facebook/react/X;

    invoke-direct {p0}, Lcom/facebook/react/x;->d()Lcom/facebook/react/L;

    move-result-object v1

    invoke-virtual {v1}, Lcom/facebook/react/L;->o()Lcom/facebook/react/H;

    move-result-object v1

    iget-object v2, p0, Lcom/facebook/react/x;->d:Landroid/os/Bundle;

    invoke-virtual {v0, v1, p1, v2}, Lcom/facebook/react/X;->u(Lcom/facebook/react/H;Ljava/lang/String;Landroid/os/Bundle;)V

    :goto_0
    return-void

    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Cannot loadApp while app is already running."

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public h(IILandroid/content/Intent;Z)V
    .locals 1

    .line 1
    sget-boolean v0, Lcom/facebook/react/config/ReactFeatureFlags;->enableBridgelessArchitecture:Z

    if-eqz v0, :cond_0

    iget-object p4, p0, Lcom/facebook/react/x;->g:Lcom/facebook/react/y;

    iget-object v0, p0, Lcom/facebook/react/x;->a:Landroid/app/Activity;

    invoke-interface {p4, v0, p1, p2, p3}, Lcom/facebook/react/y;->onActivityResult(Landroid/app/Activity;IILandroid/content/Intent;)V

    goto :goto_0

    :cond_0
    invoke-direct {p0}, Lcom/facebook/react/x;->d()Lcom/facebook/react/L;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/react/L;->v()Z

    move-result v0

    if-eqz v0, :cond_1

    if-eqz p4, :cond_1

    invoke-direct {p0}, Lcom/facebook/react/x;->d()Lcom/facebook/react/L;

    move-result-object p4

    invoke-virtual {p4}, Lcom/facebook/react/L;->o()Lcom/facebook/react/H;

    move-result-object p4

    iget-object v0, p0, Lcom/facebook/react/x;->a:Landroid/app/Activity;

    invoke-virtual {p4, v0, p1, p2, p3}, Lcom/facebook/react/H;->X(Landroid/app/Activity;IILandroid/content/Intent;)V

    :cond_1
    :goto_0
    return-void
.end method

.method public i()Z
    .locals 2

    .line 1
    sget-boolean v0, Lcom/facebook/react/config/ReactFeatureFlags;->enableBridgelessArchitecture:Z

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/facebook/react/x;->g:Lcom/facebook/react/y;

    invoke-interface {v0}, Lcom/facebook/react/y;->g()Z

    return v1

    :cond_0
    invoke-direct {p0}, Lcom/facebook/react/x;->d()Lcom/facebook/react/L;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/react/L;->v()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-direct {p0}, Lcom/facebook/react/x;->d()Lcom/facebook/react/L;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/react/L;->o()Lcom/facebook/react/H;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/react/H;->Y()V

    return v1

    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method public j(Landroid/content/res/Configuration;)V
    .locals 2

    .line 1
    sget-boolean v0, Lcom/facebook/react/config/ReactFeatureFlags;->enableBridgelessArchitecture:Z

    if-eqz v0, :cond_0

    iget-object p1, p0, Lcom/facebook/react/x;->g:Lcom/facebook/react/y;

    iget-object v0, p0, Lcom/facebook/react/x;->a:Landroid/app/Activity;

    invoke-static {v0}, LO1/a;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Context;

    invoke-interface {p1, v0}, Lcom/facebook/react/y;->c(Landroid/content/Context;)V

    goto :goto_0

    :cond_0
    invoke-direct {p0}, Lcom/facebook/react/x;->d()Lcom/facebook/react/L;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/react/L;->v()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Lcom/facebook/react/x;->c()Lcom/facebook/react/H;

    move-result-object v0

    iget-object v1, p0, Lcom/facebook/react/x;->a:Landroid/app/Activity;

    invoke-static {v1}, LO1/a;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/content/Context;

    invoke-virtual {v0, v1, p1}, Lcom/facebook/react/H;->Z(Landroid/content/Context;Landroid/content/res/Configuration;)V

    :cond_1
    :goto_0
    return-void
.end method

.method public k()V
    .locals 2

    .line 1
    sget-boolean v0, Lcom/facebook/react/config/ReactFeatureFlags;->enableBridgelessArchitecture:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/facebook/react/x;->h:Lc2/a;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lc2/a;->stop()Lb2/a;

    iput-object v1, p0, Lcom/facebook/react/x;->h:Lc2/a;

    :cond_0
    iget-object v0, p0, Lcom/facebook/react/x;->g:Lcom/facebook/react/y;

    iget-object v1, p0, Lcom/facebook/react/x;->a:Landroid/app/Activity;

    invoke-interface {v0, v1}, Lcom/facebook/react/y;->e(Landroid/app/Activity;)V

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lcom/facebook/react/x;->b:Lcom/facebook/react/X;

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Lcom/facebook/react/X;->v()V

    iput-object v1, p0, Lcom/facebook/react/x;->b:Lcom/facebook/react/X;

    :cond_2
    invoke-direct {p0}, Lcom/facebook/react/x;->d()Lcom/facebook/react/L;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/react/L;->v()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-direct {p0}, Lcom/facebook/react/x;->d()Lcom/facebook/react/L;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/react/L;->o()Lcom/facebook/react/H;

    move-result-object v0

    iget-object v1, p0, Lcom/facebook/react/x;->a:Landroid/app/Activity;

    invoke-virtual {v0, v1}, Lcom/facebook/react/H;->b0(Landroid/app/Activity;)V

    :cond_3
    :goto_0
    return-void
.end method

.method public l()V
    .locals 2

    .line 1
    sget-boolean v0, Lcom/facebook/react/config/ReactFeatureFlags;->enableBridgelessArchitecture:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/facebook/react/x;->g:Lcom/facebook/react/y;

    iget-object v1, p0, Lcom/facebook/react/x;->a:Landroid/app/Activity;

    invoke-interface {v0, v1}, Lcom/facebook/react/y;->d(Landroid/app/Activity;)V

    goto :goto_0

    :cond_0
    invoke-direct {p0}, Lcom/facebook/react/x;->d()Lcom/facebook/react/L;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/react/L;->v()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-direct {p0}, Lcom/facebook/react/x;->d()Lcom/facebook/react/L;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/react/L;->o()Lcom/facebook/react/H;

    move-result-object v0

    iget-object v1, p0, Lcom/facebook/react/x;->a:Landroid/app/Activity;

    invoke-virtual {v0, v1}, Lcom/facebook/react/H;->d0(Landroid/app/Activity;)V

    :cond_1
    :goto_0
    return-void
.end method

.method public m()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/facebook/react/x;->a:Landroid/app/Activity;

    instance-of v1, v0, Lm2/b;

    if-eqz v1, :cond_2

    sget-boolean v1, Lcom/facebook/react/config/ReactFeatureFlags;->enableBridgelessArchitecture:Z

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/facebook/react/x;->g:Lcom/facebook/react/y;

    move-object v2, v0

    check-cast v2, Lm2/b;

    invoke-interface {v1, v0, v2}, Lcom/facebook/react/y;->b(Landroid/app/Activity;Lm2/b;)V

    goto :goto_0

    :cond_0
    invoke-direct {p0}, Lcom/facebook/react/x;->d()Lcom/facebook/react/L;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/react/L;->v()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-direct {p0}, Lcom/facebook/react/x;->d()Lcom/facebook/react/L;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/react/L;->o()Lcom/facebook/react/H;

    move-result-object v0

    iget-object v1, p0, Lcom/facebook/react/x;->a:Landroid/app/Activity;

    move-object v2, v1

    check-cast v2, Lm2/b;

    invoke-virtual {v0, v1, v2}, Lcom/facebook/react/H;->f0(Landroid/app/Activity;Lm2/b;)V

    :cond_1
    :goto_0
    return-void

    :cond_2
    new-instance v0, Ljava/lang/ClassCastException;

    const-string v1, "Host Activity does not implement DefaultHardwareBackBtnHandler"

    invoke-direct {v0, v1}, Ljava/lang/ClassCastException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public n(ILandroid/view/KeyEvent;)Z
    .locals 1

    .line 1
    const/16 v0, 0x5a

    if-ne p1, v0, :cond_2

    sget-boolean p1, Lcom/facebook/react/config/ReactFeatureFlags;->enableBridgelessArchitecture:Z

    if-eqz p1, :cond_0

    iget-object p1, p0, Lcom/facebook/react/x;->g:Lcom/facebook/react/y;

    if-eqz p1, :cond_0

    invoke-interface {p1}, Lcom/facebook/react/y;->f()LX1/e;

    move-result-object p1

    if-nez p1, :cond_1

    :cond_0
    invoke-direct {p0}, Lcom/facebook/react/x;->d()Lcom/facebook/react/L;

    move-result-object p1

    invoke-virtual {p1}, Lcom/facebook/react/L;->v()Z

    move-result p1

    if-eqz p1, :cond_2

    invoke-direct {p0}, Lcom/facebook/react/x;->d()Lcom/facebook/react/L;

    move-result-object p1

    invoke-virtual {p1}, Lcom/facebook/react/L;->u()Z

    move-result p1

    if-eqz p1, :cond_2

    :cond_1
    invoke-virtual {p2}, Landroid/view/KeyEvent;->startTracking()V

    const/4 p1, 0x1

    return p1

    :cond_2
    const/4 p1, 0x0

    return p1
.end method

.method public o(I)Z
    .locals 2

    .line 1
    const/16 v0, 0x5a

    if-ne p1, v0, :cond_1

    sget-boolean p1, Lcom/facebook/react/config/ReactFeatureFlags;->enableBridgelessArchitecture:Z

    const/4 v0, 0x1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lcom/facebook/react/x;->g:Lcom/facebook/react/y;

    if-eqz p1, :cond_0

    invoke-interface {p1}, Lcom/facebook/react/y;->f()LX1/e;

    move-result-object p1

    if-eqz p1, :cond_1

    instance-of v1, p1, Lcom/facebook/react/devsupport/f0;

    if-nez v1, :cond_1

    invoke-interface {p1}, LX1/e;->C()V

    return v0

    :cond_0
    invoke-direct {p0}, Lcom/facebook/react/x;->d()Lcom/facebook/react/L;

    move-result-object p1

    invoke-virtual {p1}, Lcom/facebook/react/L;->v()Z

    move-result p1

    if-eqz p1, :cond_1

    invoke-direct {p0}, Lcom/facebook/react/x;->d()Lcom/facebook/react/L;

    move-result-object p1

    invoke-virtual {p1}, Lcom/facebook/react/L;->u()Z

    move-result p1

    if-eqz p1, :cond_1

    invoke-direct {p0}, Lcom/facebook/react/x;->d()Lcom/facebook/react/L;

    move-result-object p1

    invoke-virtual {p1}, Lcom/facebook/react/L;->o()Lcom/facebook/react/H;

    move-result-object p1

    invoke-virtual {p1}, Lcom/facebook/react/H;->s0()V

    return v0

    :cond_1
    const/4 p1, 0x0

    return p1
.end method

.method public p(Landroid/content/Intent;)Z
    .locals 2

    .line 1
    sget-boolean v0, Lcom/facebook/react/config/ReactFeatureFlags;->enableBridgelessArchitecture:Z

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/facebook/react/x;->g:Lcom/facebook/react/y;

    invoke-interface {v0, p1}, Lcom/facebook/react/y;->onNewIntent(Landroid/content/Intent;)V

    return v1

    :cond_0
    invoke-direct {p0}, Lcom/facebook/react/x;->d()Lcom/facebook/react/L;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/react/L;->v()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-direct {p0}, Lcom/facebook/react/x;->d()Lcom/facebook/react/L;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/react/L;->o()Lcom/facebook/react/H;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/facebook/react/H;->h0(Landroid/content/Intent;)V

    return v1

    :cond_1
    const/4 p1, 0x0

    return p1
.end method

.method public q(Z)V
    .locals 1

    .line 1
    sget-boolean v0, Lcom/facebook/react/config/ReactFeatureFlags;->enableBridgelessArchitecture:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/facebook/react/x;->g:Lcom/facebook/react/y;

    invoke-interface {v0, p1}, Lcom/facebook/react/y;->onWindowFocusChange(Z)V

    goto :goto_0

    :cond_0
    invoke-direct {p0}, Lcom/facebook/react/x;->d()Lcom/facebook/react/L;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/react/L;->v()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-direct {p0}, Lcom/facebook/react/x;->d()Lcom/facebook/react/L;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/react/L;->o()Lcom/facebook/react/H;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/facebook/react/H;->i0(Z)V

    :cond_1
    :goto_0
    return-void
.end method

.method public r(ILandroid/view/KeyEvent;)Z
    .locals 4

    .line 1
    invoke-direct {p0}, Lcom/facebook/react/x;->b()LX1/e;

    move-result-object p2

    const/4 v0, 0x0

    if-eqz p2, :cond_2

    instance-of v1, p2, Lcom/facebook/react/devsupport/f0;

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    const/16 v1, 0x52

    const/4 v2, 0x1

    if-ne p1, v1, :cond_1

    invoke-interface {p2}, LX1/e;->C()V

    return v2

    :cond_1
    iget-object v1, p0, Lcom/facebook/react/x;->e:Lcom/facebook/react/devsupport/I;

    invoke-static {v1}, LO1/a;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/facebook/react/devsupport/I;

    iget-object v3, p0, Lcom/facebook/react/x;->a:Landroid/app/Activity;

    invoke-virtual {v3}, Landroid/app/Activity;->getCurrentFocus()Landroid/view/View;

    move-result-object v3

    invoke-virtual {v1, p1, v3}, Lcom/facebook/react/devsupport/I;->b(ILandroid/view/View;)Z

    move-result p1

    if-eqz p1, :cond_2

    invoke-interface {p2}, LX1/e;->q()V

    return v2

    :cond_2
    :goto_0
    return v0
.end method
