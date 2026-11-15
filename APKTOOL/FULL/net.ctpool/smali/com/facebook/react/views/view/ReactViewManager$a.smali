.class Lcom/facebook/react/views/view/ReactViewManager$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/facebook/react/views/view/ReactViewManager;->setFocusable(Lcom/facebook/react/views/view/i;Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic m:Lcom/facebook/react/views/view/i;

.field final synthetic n:Lcom/facebook/react/views/view/ReactViewManager;


# direct methods
.method constructor <init>(Lcom/facebook/react/views/view/ReactViewManager;Lcom/facebook/react/views/view/i;)V
    .locals 0

    iput-object p1, p0, Lcom/facebook/react/views/view/ReactViewManager$a;->n:Lcom/facebook/react/views/view/ReactViewManager;

    iput-object p2, p0, Lcom/facebook/react/views/view/ReactViewManager$a;->m:Lcom/facebook/react/views/view/i;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 3

    iget-object p1, p0, Lcom/facebook/react/views/view/ReactViewManager$a;->m:Lcom/facebook/react/views/view/i;

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    check-cast p1, Lcom/facebook/react/bridge/ReactContext;

    iget-object v0, p0, Lcom/facebook/react/views/view/ReactViewManager$a;->m:Lcom/facebook/react/views/view/i;

    invoke-virtual {v0}, Landroid/view/View;->getId()I

    move-result v0

    invoke-static {p1, v0}, Lcom/facebook/react/uimanager/k0;->c(Lcom/facebook/react/bridge/ReactContext;I)Lcom/facebook/react/uimanager/events/e;

    move-result-object p1

    if-nez p1, :cond_0

    return-void

    :cond_0
    new-instance v0, Lcom/facebook/react/views/view/j;

    iget-object v1, p0, Lcom/facebook/react/views/view/ReactViewManager$a;->m:Lcom/facebook/react/views/view/i;

    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Lcom/facebook/react/uimanager/k0;->e(Landroid/content/Context;)I

    move-result v1

    iget-object v2, p0, Lcom/facebook/react/views/view/ReactViewManager$a;->m:Lcom/facebook/react/views/view/i;

    invoke-virtual {v2}, Landroid/view/View;->getId()I

    move-result v2

    invoke-direct {v0, v1, v2}, Lcom/facebook/react/views/view/j;-><init>(II)V

    invoke-interface {p1, v0}, Lcom/facebook/react/uimanager/events/e;->c(Lcom/facebook/react/uimanager/events/d;)V

    return-void
.end method
