.class Lcom/facebook/react/devsupport/e0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LS1/i;


# instance fields
.field private final a:Lcom/facebook/react/devsupport/I;

.field private final b:LX1/e;

.field private c:Landroid/app/Dialog;

.field private d:Lcom/facebook/react/devsupport/b0;


# direct methods
.method public constructor <init>(LX1/e;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/facebook/react/devsupport/e0;->b:LX1/e;

    .line 5
    .line 6
    new-instance p1, Lcom/facebook/react/devsupport/I;

    .line 7
    .line 8
    invoke-direct {p1}, Lcom/facebook/react/devsupport/I;-><init>()V

    .line 9
    .line 10
    .line 11
    iput-object p1, p0, Lcom/facebook/react/devsupport/e0;->a:Lcom/facebook/react/devsupport/I;

    .line 12
    .line 13
    return-void
.end method

.method static bridge synthetic g(Lcom/facebook/react/devsupport/e0;)LX1/e;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/facebook/react/devsupport/e0;->b:LX1/e;

    return-object p0
.end method

.method static bridge synthetic h(Lcom/facebook/react/devsupport/e0;)Lcom/facebook/react/devsupport/I;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/facebook/react/devsupport/e0;->a:Lcom/facebook/react/devsupport/I;

    return-object p0
.end method


# virtual methods
.method public a()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/devsupport/e0;->c:Landroid/app/Dialog;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/app/Dialog;->isShowing()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public b()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/facebook/react/devsupport/e0;->b:LX1/e;

    invoke-interface {v0}, LX1/e;->l()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/facebook/react/devsupport/e0;->b:LX1/e;

    invoke-interface {v1}, LX1/e;->j()Landroid/app/Activity;

    move-result-object v1

    if-eqz v1, :cond_4

    invoke-virtual {v1}, Landroid/app/Activity;->isFinishing()Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/facebook/react/devsupport/e0;->d:Lcom/facebook/react/devsupport/b0;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    if-eq v0, v1, :cond_2

    :cond_1
    const-string v0, "RedBox"

    invoke-virtual {p0, v0}, Lcom/facebook/react/devsupport/e0;->f(Ljava/lang/String;)V

    :cond_2
    iget-object v0, p0, Lcom/facebook/react/devsupport/e0;->d:Lcom/facebook/react/devsupport/b0;

    invoke-virtual {v0}, Lcom/facebook/react/devsupport/b0;->d()V

    iget-object v0, p0, Lcom/facebook/react/devsupport/e0;->c:Landroid/app/Dialog;

    if-nez v0, :cond_3

    new-instance v0, Lcom/facebook/react/devsupport/e0$a;

    sget v2, Lcom/facebook/react/r;->b:I

    invoke-direct {v0, p0, v1, v2}, Lcom/facebook/react/devsupport/e0$a;-><init>(Lcom/facebook/react/devsupport/e0;Landroid/content/Context;I)V

    iput-object v0, p0, Lcom/facebook/react/devsupport/e0;->c:Landroid/app/Dialog;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/app/Dialog;->requestWindowFeature(I)Z

    iget-object v0, p0, Lcom/facebook/react/devsupport/e0;->c:Landroid/app/Dialog;

    iget-object v1, p0, Lcom/facebook/react/devsupport/e0;->d:Lcom/facebook/react/devsupport/b0;

    invoke-virtual {v0, v1}, Landroid/app/Dialog;->setContentView(Landroid/view/View;)V

    :cond_3
    iget-object v0, p0, Lcom/facebook/react/devsupport/e0;->c:Landroid/app/Dialog;

    invoke-virtual {v0}, Landroid/app/Dialog;->show()V

    return-void

    :cond_4
    :goto_0
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Unable to launch redbox because react activity is not available, here is the error that redbox would\'ve displayed: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    if-eqz v0, :cond_5

    goto :goto_1

    :cond_5
    const-string v0, "N/A"

    :goto_1
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "ReactNative"

    invoke-static {v1, v0}, LP0/a;->j(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public c()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/devsupport/e0;->c:Landroid/app/Dialog;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/app/Dialog;->dismiss()V

    invoke-virtual {p0}, Lcom/facebook/react/devsupport/e0;->e()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/facebook/react/devsupport/e0;->c:Landroid/app/Dialog;

    :cond_0
    return-void
.end method

.method public d()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/devsupport/e0;->d:Lcom/facebook/react/devsupport/b0;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public e()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/facebook/react/devsupport/e0;->d:Lcom/facebook/react/devsupport/b0;

    return-void
.end method

.method public f(Ljava/lang/String;)V
    .locals 2

    .line 1
    iget-object p1, p0, Lcom/facebook/react/devsupport/e0;->b:LX1/e;

    invoke-interface {p1}, LX1/e;->y()LX1/i;

    iget-object p1, p0, Lcom/facebook/react/devsupport/e0;->b:LX1/e;

    invoke-interface {p1}, LX1/e;->j()Landroid/app/Activity;

    move-result-object p1

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Landroid/app/Activity;->isFinishing()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/facebook/react/devsupport/b0;

    invoke-direct {v0, p1}, Lcom/facebook/react/devsupport/b0;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/facebook/react/devsupport/e0;->d:Lcom/facebook/react/devsupport/b0;

    iget-object p1, p0, Lcom/facebook/react/devsupport/e0;->b:LX1/e;

    invoke-virtual {v0, p1}, Lcom/facebook/react/devsupport/b0;->e(LX1/e;)Lcom/facebook/react/devsupport/b0;

    move-result-object p1

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lcom/facebook/react/devsupport/b0;->g(LX1/i;)Lcom/facebook/react/devsupport/b0;

    move-result-object p1

    invoke-virtual {p1}, Lcom/facebook/react/devsupport/b0;->c()V

    return-void

    :cond_1
    :goto_0
    iget-object p1, p0, Lcom/facebook/react/devsupport/e0;->b:LX1/e;

    invoke-interface {p1}, LX1/e;->l()Ljava/lang/String;

    move-result-object p1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Unable to launch redbox because react activity is not available, here is the error that redbox would\'ve displayed: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    if-eqz p1, :cond_2

    goto :goto_1

    :cond_2
    const-string p1, "N/A"

    :goto_1
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "ReactNative"

    invoke-static {v0, p1}, LP0/a;->j(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method
