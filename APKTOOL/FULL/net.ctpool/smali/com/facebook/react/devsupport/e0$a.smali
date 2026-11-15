.class Lcom/facebook/react/devsupport/e0$a;
.super Landroid/app/Dialog;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/facebook/react/devsupport/e0;->b()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic m:Lcom/facebook/react/devsupport/e0;


# direct methods
.method constructor <init>(Lcom/facebook/react/devsupport/e0;Landroid/content/Context;I)V
    .locals 0

    iput-object p1, p0, Lcom/facebook/react/devsupport/e0$a;->m:Lcom/facebook/react/devsupport/e0;

    invoke-direct {p0, p2, p3}, Landroid/app/Dialog;-><init>(Landroid/content/Context;I)V

    return-void
.end method


# virtual methods
.method public onKeyUp(ILandroid/view/KeyEvent;)Z
    .locals 2

    const/16 v0, 0x52

    if-ne p1, v0, :cond_0

    iget-object p1, p0, Lcom/facebook/react/devsupport/e0$a;->m:Lcom/facebook/react/devsupport/e0;

    invoke-static {p1}, Lcom/facebook/react/devsupport/e0;->g(Lcom/facebook/react/devsupport/e0;)LX1/e;

    move-result-object p1

    invoke-interface {p1}, LX1/e;->C()V

    const/4 p1, 0x1

    return p1

    :cond_0
    iget-object v0, p0, Lcom/facebook/react/devsupport/e0$a;->m:Lcom/facebook/react/devsupport/e0;

    invoke-static {v0}, Lcom/facebook/react/devsupport/e0;->h(Lcom/facebook/react/devsupport/e0;)Lcom/facebook/react/devsupport/I;

    move-result-object v0

    invoke-virtual {p0}, Landroid/app/Dialog;->getCurrentFocus()Landroid/view/View;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lcom/facebook/react/devsupport/I;->b(ILandroid/view/View;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/facebook/react/devsupport/e0$a;->m:Lcom/facebook/react/devsupport/e0;

    invoke-static {v0}, Lcom/facebook/react/devsupport/e0;->g(Lcom/facebook/react/devsupport/e0;)LX1/e;

    move-result-object v0

    invoke-interface {v0}, LX1/e;->q()V

    :cond_1
    invoke-super {p0, p1, p2}, Landroid/app/Dialog;->onKeyUp(ILandroid/view/KeyEvent;)Z

    move-result p1

    return p1
.end method
