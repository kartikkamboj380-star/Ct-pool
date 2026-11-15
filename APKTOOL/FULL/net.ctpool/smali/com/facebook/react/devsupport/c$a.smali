.class Lcom/facebook/react/devsupport/c$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/facebook/react/devsupport/c;->i(Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic m:Z

.field final synthetic n:Lcom/facebook/react/devsupport/c;


# direct methods
.method constructor <init>(Lcom/facebook/react/devsupport/c;Z)V
    .locals 0

    iput-object p1, p0, Lcom/facebook/react/devsupport/c$a;->n:Lcom/facebook/react/devsupport/c;

    iput-boolean p2, p0, Lcom/facebook/react/devsupport/c$a;->m:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 9

    iget-boolean v0, p0, Lcom/facebook/react/devsupport/c$a;->m:Z

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/facebook/react/devsupport/c$a;->n:Lcom/facebook/react/devsupport/c;

    invoke-static {v0}, Lcom/facebook/react/devsupport/c;->a(Lcom/facebook/react/devsupport/c;)Landroid/widget/FrameLayout;

    move-result-object v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/facebook/react/devsupport/c$a;->n:Lcom/facebook/react/devsupport/c;

    invoke-static {v0}, Lcom/facebook/react/devsupport/c;->b(Lcom/facebook/react/devsupport/c;)Lcom/facebook/react/bridge/ReactContext;

    move-result-object v0

    invoke-static {v0}, Lcom/facebook/react/devsupport/c;->e(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "ReactNative"

    const-string v1, "Wait for overlay permission to be set"

    invoke-static {v0, v1}, LP0/a;->b(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_0
    iget-object v0, p0, Lcom/facebook/react/devsupport/c$a;->n:Lcom/facebook/react/devsupport/c;

    new-instance v1, Lcom/facebook/react/devsupport/J;

    iget-object v2, p0, Lcom/facebook/react/devsupport/c$a;->n:Lcom/facebook/react/devsupport/c;

    invoke-static {v2}, Lcom/facebook/react/devsupport/c;->b(Lcom/facebook/react/devsupport/c;)Lcom/facebook/react/bridge/ReactContext;

    move-result-object v2

    invoke-direct {v1, v2}, Lcom/facebook/react/devsupport/J;-><init>(Lcom/facebook/react/bridge/ReactContext;)V

    invoke-static {v0, v1}, Lcom/facebook/react/devsupport/c;->d(Lcom/facebook/react/devsupport/c;Landroid/widget/FrameLayout;)V

    new-instance v0, Landroid/view/WindowManager$LayoutParams;

    sget v6, Lcom/facebook/react/devsupport/i0;->b:I

    const/16 v7, 0x18

    const/4 v8, -0x3

    const/4 v4, -0x1

    const/4 v5, -0x1

    move-object v3, v0

    invoke-direct/range {v3 .. v8}, Landroid/view/WindowManager$LayoutParams;-><init>(IIIII)V

    iget-object v1, p0, Lcom/facebook/react/devsupport/c$a;->n:Lcom/facebook/react/devsupport/c;

    invoke-static {v1}, Lcom/facebook/react/devsupport/c;->c(Lcom/facebook/react/devsupport/c;)Landroid/view/WindowManager;

    move-result-object v1

    iget-object v2, p0, Lcom/facebook/react/devsupport/c$a;->n:Lcom/facebook/react/devsupport/c;

    invoke-static {v2}, Lcom/facebook/react/devsupport/c;->a(Lcom/facebook/react/devsupport/c;)Landroid/widget/FrameLayout;

    move-result-object v2

    invoke-interface {v1, v2, v0}, Landroid/view/ViewManager;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    goto :goto_0

    :cond_1
    iget-boolean v0, p0, Lcom/facebook/react/devsupport/c$a;->m:Z

    if-nez v0, :cond_2

    iget-object v0, p0, Lcom/facebook/react/devsupport/c$a;->n:Lcom/facebook/react/devsupport/c;

    invoke-static {v0}, Lcom/facebook/react/devsupport/c;->a(Lcom/facebook/react/devsupport/c;)Landroid/widget/FrameLayout;

    move-result-object v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/facebook/react/devsupport/c$a;->n:Lcom/facebook/react/devsupport/c;

    invoke-static {v0}, Lcom/facebook/react/devsupport/c;->a(Lcom/facebook/react/devsupport/c;)Landroid/widget/FrameLayout;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/ViewGroup;->removeAllViews()V

    iget-object v0, p0, Lcom/facebook/react/devsupport/c$a;->n:Lcom/facebook/react/devsupport/c;

    invoke-static {v0}, Lcom/facebook/react/devsupport/c;->c(Lcom/facebook/react/devsupport/c;)Landroid/view/WindowManager;

    move-result-object v0

    iget-object v1, p0, Lcom/facebook/react/devsupport/c$a;->n:Lcom/facebook/react/devsupport/c;

    invoke-static {v1}, Lcom/facebook/react/devsupport/c;->a(Lcom/facebook/react/devsupport/c;)Landroid/widget/FrameLayout;

    move-result-object v1

    invoke-interface {v0, v1}, Landroid/view/ViewManager;->removeView(Landroid/view/View;)V

    iget-object v0, p0, Lcom/facebook/react/devsupport/c$a;->n:Lcom/facebook/react/devsupport/c;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/facebook/react/devsupport/c;->d(Lcom/facebook/react/devsupport/c;Landroid/widget/FrameLayout;)V

    :cond_2
    :goto_0
    return-void
.end method
