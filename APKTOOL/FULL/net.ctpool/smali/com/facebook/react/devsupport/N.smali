.class public final Lcom/facebook/react/devsupport/N;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LS1/i;


# instance fields
.field private final a:LX1/e;

.field private b:Landroid/view/View;

.field private c:Lcom/facebook/react/devsupport/M;


# direct methods
.method public constructor <init>(LX1/e;)V
    .locals 1

    .line 1
    const-string v0, "devSupportManager"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Lcom/facebook/react/devsupport/N;->a:LX1/e;

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public a()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/devsupport/N;->c:Lcom/facebook/react/devsupport/M;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/app/Dialog;->isShowing()Z

    move-result v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public b()V
    .locals 3

    .line 1
    invoke-virtual {p0}, Lcom/facebook/react/devsupport/N;->a()Z

    move-result v0

    if-nez v0, :cond_3

    invoke-virtual {p0}, Lcom/facebook/react/devsupport/N;->d()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_1

    :cond_0
    iget-object v0, p0, Lcom/facebook/react/devsupport/N;->a:LX1/e;

    invoke-interface {v0}, LX1/e;->j()Landroid/app/Activity;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Landroid/app/Activity;->isFinishing()Z

    move-result v1

    if-eqz v1, :cond_1

    goto :goto_0

    :cond_1
    new-instance v1, Lcom/facebook/react/devsupport/M;

    iget-object v2, p0, Lcom/facebook/react/devsupport/N;->b:Landroid/view/View;

    invoke-direct {v1, v0, v2}, Lcom/facebook/react/devsupport/M;-><init>(Landroid/app/Activity;Landroid/view/View;)V

    iput-object v1, p0, Lcom/facebook/react/devsupport/N;->c:Lcom/facebook/react/devsupport/M;

    const/4 v0, 0x0

    invoke-virtual {v1, v0}, Landroid/app/Dialog;->setCancelable(Z)V

    invoke-virtual {v1}, Landroid/app/Dialog;->show()V

    return-void

    :cond_2
    :goto_0
    const-string v0, "Unable to launch logbox because react activity is not available, here is the error that logbox would\'ve displayed: "

    invoke-static {v0}, LE2/c;->a(Ljava/lang/String;)V

    :cond_3
    :goto_1
    return-void
.end method

.method public c()V
    .locals 3

    .line 1
    invoke-virtual {p0}, Lcom/facebook/react/devsupport/N;->a()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lcom/facebook/react/devsupport/N;->b:Landroid/view/View;

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    goto :goto_0

    :cond_1
    move-object v0, v1

    :goto_0
    check-cast v0, Landroid/view/ViewGroup;

    if-eqz v0, :cond_2

    iget-object v2, p0, Lcom/facebook/react/devsupport/N;->b:Landroid/view/View;

    invoke-virtual {v0, v2}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    :cond_2
    iget-object v0, p0, Lcom/facebook/react/devsupport/N;->c:Lcom/facebook/react/devsupport/M;

    if-eqz v0, :cond_3

    invoke-virtual {v0}, Landroid/app/Dialog;->dismiss()V

    :cond_3
    iput-object v1, p0, Lcom/facebook/react/devsupport/N;->c:Lcom/facebook/react/devsupport/M;

    return-void
.end method

.method public d()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/devsupport/N;->b:Landroid/view/View;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public e()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/facebook/react/devsupport/N;->b:Landroid/view/View;

    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/facebook/react/devsupport/N;->a:LX1/e;

    invoke-interface {v1, v0}, LX1/e;->d(Landroid/view/View;)V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/facebook/react/devsupport/N;->b:Landroid/view/View;

    :cond_0
    return-void
.end method

.method public f(Ljava/lang/String;)V
    .locals 2

    .line 1
    const-string v0, "appKey"

    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "LogBox"

    invoke-static {p1, v0}, Lw5/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    const-string v1, "This surface manager can only create LogBox React application"

    invoke-static {p1, v1}, LO1/a;->b(ZLjava/lang/String;)V

    iget-object p1, p0, Lcom/facebook/react/devsupport/N;->a:LX1/e;

    invoke-interface {p1, v0}, LX1/e;->a(Ljava/lang/String;)Landroid/view/View;

    move-result-object p1

    iput-object p1, p0, Lcom/facebook/react/devsupport/N;->b:Landroid/view/View;

    if-nez p1, :cond_0

    const-string p1, "Unable to launch logbox because react was unable to create the root view"

    invoke-static {p1}, LE2/c;->a(Ljava/lang/String;)V

    :cond_0
    return-void
.end method
