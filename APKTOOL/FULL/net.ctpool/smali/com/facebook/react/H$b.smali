.class Lcom/facebook/react/H$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/facebook/react/devsupport/a0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/facebook/react/H;->v()Lcom/facebook/react/devsupport/a0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/react/H;


# direct methods
.method constructor <init>(Lcom/facebook/react/H;)V
    .locals 0

    iput-object p1, p0, Lcom/facebook/react/H$b;->a:Lcom/facebook/react/H;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;)Landroid/view/View;
    .locals 3

    .line 1
    invoke-virtual {p0}, Lcom/facebook/react/H$b;->j()Landroid/app/Activity;

    move-result-object v0

    if-eqz v0, :cond_0

    new-instance v1, Lcom/facebook/react/X;

    invoke-direct {v1, v0}, Lcom/facebook/react/X;-><init>(Landroid/content/Context;)V

    sget-boolean v0, Lcom/facebook/react/config/ReactFeatureFlags;->enableFabricRenderer:Z

    invoke-virtual {v1, v0}, Lcom/facebook/react/X;->setIsFabric(Z)V

    iget-object v0, p0, Lcom/facebook/react/H$b;->a:Lcom/facebook/react/H;

    new-instance v2, Landroid/os/Bundle;

    invoke-direct {v2}, Landroid/os/Bundle;-><init>()V

    invoke-virtual {v1, v0, p1, v2}, Lcom/facebook/react/X;->u(Lcom/facebook/react/H;Ljava/lang/String;Landroid/os/Bundle;)V

    return-object v1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public b()Lcom/facebook/react/bridge/JavaScriptExecutorFactory;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/H$b;->a:Lcom/facebook/react/H;

    invoke-static {v0}, Lcom/facebook/react/H;->l(Lcom/facebook/react/H;)Lcom/facebook/react/bridge/JavaScriptExecutorFactory;

    move-result-object v0

    return-object v0
.end method

.method public d(Landroid/view/View;)V
    .locals 1

    .line 1
    instance-of v0, p1, Lcom/facebook/react/X;

    if-eqz v0, :cond_0

    check-cast p1, Lcom/facebook/react/X;

    invoke-virtual {p1}, Lcom/facebook/react/X;->v()V

    :cond_0
    return-void
.end method

.method public h()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/H$b;->a:Lcom/facebook/react/H;

    invoke-static {v0}, Lcom/facebook/react/H;->p(Lcom/facebook/react/H;)V

    return-void
.end method

.method public j()Landroid/app/Activity;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/H$b;->a:Lcom/facebook/react/H;

    invoke-static {v0}, Lcom/facebook/react/H;->h(Lcom/facebook/react/H;)Landroid/app/Activity;

    move-result-object v0

    return-object v0
.end method
