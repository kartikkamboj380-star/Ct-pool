.class public abstract Lcom/facebook/react/u;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Landroid/app/Activity;

.field private final b:Ljava/lang/String;

.field private c:Lm2/h;

.field private d:Lcom/facebook/react/bridge/Callback;

.field private e:Lcom/facebook/react/x;


# direct methods
.method public constructor <init>(Lcom/facebook/react/ReactActivity;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/facebook/react/u;->a:Landroid/app/Activity;

    iput-object p2, p0, Lcom/facebook/react/u;->b:Ljava/lang/String;

    return-void
.end method

.method public static synthetic a(Lcom/facebook/react/u;I[Ljava/lang/String;[I[Ljava/lang/Object;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/facebook/react/u;->l(I[Ljava/lang/String;[I[Ljava/lang/Object;)V

    return-void
.end method

.method private synthetic l(I[Ljava/lang/String;[I[Ljava/lang/Object;)V
    .locals 0

    .line 1
    iget-object p4, p0, Lcom/facebook/react/u;->c:Lm2/h;

    if-eqz p4, :cond_0

    invoke-interface {p4, p1, p2, p3}, Lm2/h;->onRequestPermissionsResult(I[Ljava/lang/String;[I)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x0

    iput-object p1, p0, Lcom/facebook/react/u;->c:Lm2/h;

    :cond_0
    return-void
.end method


# virtual methods
.method public A([Ljava/lang/String;ILm2/h;)V
    .locals 0

    .line 1
    iput-object p3, p0, Lcom/facebook/react/u;->c:Lm2/h;

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/facebook/react/u;->g()Landroid/app/Activity;

    .line 4
    .line 5
    .line 6
    move-result-object p3

    .line 7
    invoke-virtual {p3, p1, p2}, Landroid/app/Activity;->requestPermissions([Ljava/lang/String;I)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method protected b()Landroid/os/Bundle;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/facebook/react/u;->e()Landroid/os/Bundle;

    move-result-object v0

    return-object v0
.end method

.method protected c()Lcom/facebook/react/X;
    .locals 1

    .line 1
    const/4 v0, 0x0

    return-object v0
.end method

.method protected d()Landroid/content/Context;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/u;->a:Landroid/app/Activity;

    invoke-static {v0}, LO1/a;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Context;

    return-object v0
.end method

.method protected e()Landroid/os/Bundle;
    .locals 1

    .line 1
    const/4 v0, 0x0

    return-object v0
.end method

.method public f()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/u;->b:Ljava/lang/String;

    return-object v0
.end method

.method protected g()Landroid/app/Activity;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/facebook/react/u;->d()Landroid/content/Context;

    move-result-object v0

    check-cast v0, Landroid/app/Activity;

    return-object v0
.end method

.method public h()Lcom/facebook/react/y;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/facebook/react/u;->g()Landroid/app/Activity;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    move-result-object v0

    check-cast v0, Lcom/facebook/react/w;

    invoke-interface {v0}, Lcom/facebook/react/w;->b()Lcom/facebook/react/y;

    move-result-object v0

    return-object v0
.end method

.method protected i()Lcom/facebook/react/L;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/facebook/react/u;->g()Landroid/app/Activity;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    move-result-object v0

    check-cast v0, Lcom/facebook/react/w;

    invoke-interface {v0}, Lcom/facebook/react/w;->a()Lcom/facebook/react/L;

    move-result-object v0

    return-object v0
.end method

.method protected abstract j()Z
.end method

.method protected k()Z
    .locals 1

    .line 1
    const/4 v0, 0x0

    return v0
.end method

.method protected m(Ljava/lang/String;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/u;->e:Lcom/facebook/react/x;

    invoke-virtual {v0, p1}, Lcom/facebook/react/x;->g(Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/facebook/react/u;->g()Landroid/app/Activity;

    move-result-object p1

    iget-object v0, p0, Lcom/facebook/react/u;->e:Lcom/facebook/react/x;

    invoke-virtual {v0}, Lcom/facebook/react/x;->e()Lcom/facebook/react/X;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/app/Activity;->setContentView(Landroid/view/View;)V

    return-void
.end method

.method public n(IILandroid/content/Intent;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/facebook/react/u;->e:Lcom/facebook/react/x;

    const/4 v1, 0x1

    invoke-virtual {v0, p1, p2, p3, v1}, Lcom/facebook/react/x;->h(IILandroid/content/Intent;Z)V

    return-void
.end method

.method public o()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/u;->e:Lcom/facebook/react/x;

    invoke-virtual {v0}, Lcom/facebook/react/x;->i()Z

    move-result v0

    return v0
.end method

.method public p(Landroid/content/res/Configuration;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/u;->e:Lcom/facebook/react/x;

    invoke-virtual {v0, p1}, Lcom/facebook/react/x;->j(Landroid/content/res/Configuration;)V

    return-void
.end method

.method public q(Landroid/os/Bundle;)V
    .locals 8

    .line 1
    invoke-virtual {p0}, Lcom/facebook/react/u;->f()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0}, Lcom/facebook/react/u;->b()Landroid/os/Bundle;

    move-result-object v5

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1a

    if-lt v0, v1, :cond_0

    invoke-virtual {p0}, Lcom/facebook/react/u;->k()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/facebook/react/u;->a:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/facebook/react/s;->a(Landroid/view/Window;I)V

    :cond_0
    sget-boolean v0, Lcom/facebook/react/config/ReactFeatureFlags;->enableBridgelessArchitecture:Z

    if-eqz v0, :cond_1

    new-instance v0, Lcom/facebook/react/x;

    invoke-virtual {p0}, Lcom/facebook/react/u;->g()Landroid/app/Activity;

    move-result-object v1

    invoke-virtual {p0}, Lcom/facebook/react/u;->h()Lcom/facebook/react/y;

    move-result-object v2

    invoke-direct {v0, v1, v2, p1, v5}, Lcom/facebook/react/x;-><init>(Landroid/app/Activity;Lcom/facebook/react/y;Ljava/lang/String;Landroid/os/Bundle;)V

    iput-object v0, p0, Lcom/facebook/react/u;->e:Lcom/facebook/react/x;

    goto :goto_0

    :cond_1
    new-instance v7, Lcom/facebook/react/u$a;

    invoke-virtual {p0}, Lcom/facebook/react/u;->g()Landroid/app/Activity;

    move-result-object v2

    invoke-virtual {p0}, Lcom/facebook/react/u;->i()Lcom/facebook/react/L;

    move-result-object v3

    invoke-virtual {p0}, Lcom/facebook/react/u;->j()Z

    move-result v6

    move-object v0, v7

    move-object v1, p0

    move-object v4, p1

    invoke-direct/range {v0 .. v6}, Lcom/facebook/react/u$a;-><init>(Lcom/facebook/react/u;Landroid/app/Activity;Lcom/facebook/react/L;Ljava/lang/String;Landroid/os/Bundle;Z)V

    iput-object v7, p0, Lcom/facebook/react/u;->e:Lcom/facebook/react/x;

    :goto_0
    if-eqz p1, :cond_2

    invoke-virtual {p0, p1}, Lcom/facebook/react/u;->m(Ljava/lang/String;)V

    :cond_2
    return-void
.end method

.method public r()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/u;->e:Lcom/facebook/react/x;

    invoke-virtual {v0}, Lcom/facebook/react/x;->k()V

    return-void
.end method

.method public s(ILandroid/view/KeyEvent;)Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/u;->e:Lcom/facebook/react/x;

    invoke-virtual {v0, p1, p2}, Lcom/facebook/react/x;->n(ILandroid/view/KeyEvent;)Z

    move-result p1

    return p1
.end method

.method public t(ILandroid/view/KeyEvent;)Z
    .locals 0

    .line 1
    iget-object p2, p0, Lcom/facebook/react/u;->e:Lcom/facebook/react/x;

    invoke-virtual {p2, p1}, Lcom/facebook/react/x;->o(I)Z

    move-result p1

    return p1
.end method

.method public u(ILandroid/view/KeyEvent;)Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/u;->e:Lcom/facebook/react/x;

    invoke-virtual {v0, p1, p2}, Lcom/facebook/react/x;->r(ILandroid/view/KeyEvent;)Z

    move-result p1

    return p1
.end method

.method public v(Landroid/content/Intent;)Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/u;->e:Lcom/facebook/react/x;

    invoke-virtual {v0, p1}, Lcom/facebook/react/x;->p(Landroid/content/Intent;)Z

    move-result p1

    return p1
.end method

.method public w()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/u;->e:Lcom/facebook/react/x;

    invoke-virtual {v0}, Lcom/facebook/react/x;->l()V

    return-void
.end method

.method public x(I[Ljava/lang/String;[I)V
    .locals 1

    .line 1
    new-instance v0, Lcom/facebook/react/t;

    invoke-direct {v0, p0, p1, p2, p3}, Lcom/facebook/react/t;-><init>(Lcom/facebook/react/u;I[Ljava/lang/String;[I)V

    iput-object v0, p0, Lcom/facebook/react/u;->d:Lcom/facebook/react/bridge/Callback;

    return-void
.end method

.method public y()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/facebook/react/u;->e:Lcom/facebook/react/x;

    invoke-virtual {v0}, Lcom/facebook/react/x;->m()V

    iget-object v0, p0, Lcom/facebook/react/u;->d:Lcom/facebook/react/bridge/Callback;

    if-eqz v0, :cond_0

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    invoke-interface {v0, v1}, Lcom/facebook/react/bridge/Callback;->invoke([Ljava/lang/Object;)V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/facebook/react/u;->d:Lcom/facebook/react/bridge/Callback;

    :cond_0
    return-void
.end method

.method public z(Z)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/u;->e:Lcom/facebook/react/x;

    invoke-virtual {v0, p1}, Lcom/facebook/react/x;->q(Z)V

    return-void
.end method
