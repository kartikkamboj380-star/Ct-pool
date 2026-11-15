.class Lcom/facebook/react/views/scroll/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/facebook/react/bridge/UIManagerListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/facebook/react/views/scroll/a$b;
    }
.end annotation


# instance fields
.field private final m:Landroid/view/ViewGroup;

.field private final n:Z

.field private o:Lcom/facebook/react/views/scroll/a$b;

.field private p:Ljava/lang/ref/WeakReference;

.field private q:Landroid/graphics/Rect;

.field private r:Z


# direct methods
.method public constructor <init>(Landroid/view/ViewGroup;Z)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/facebook/react/views/scroll/a;->p:Ljava/lang/ref/WeakReference;

    iput-object v0, p0, Lcom/facebook/react/views/scroll/a;->q:Landroid/graphics/Rect;

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/facebook/react/views/scroll/a;->r:Z

    iput-object p1, p0, Lcom/facebook/react/views/scroll/a;->m:Landroid/view/ViewGroup;

    iput-boolean p2, p0, Lcom/facebook/react/views/scroll/a;->n:Z

    return-void
.end method

.method static bridge synthetic a(Lcom/facebook/react/views/scroll/a;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/facebook/react/views/scroll/a;->b()V

    return-void
.end method

.method private b()V
    .locals 6

    .line 1
    iget-object v0, p0, Lcom/facebook/react/views/scroll/a;->o:Lcom/facebook/react/views/scroll/a$b;

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-direct {p0}, Lcom/facebook/react/views/scroll/a;->c()Lcom/facebook/react/views/view/i;

    move-result-object v0

    if-nez v0, :cond_1

    return-void

    :cond_1
    iget-boolean v1, p0, Lcom/facebook/react/views/scroll/a;->n:Z

    if-eqz v1, :cond_2

    iget-object v1, p0, Lcom/facebook/react/views/scroll/a;->m:Landroid/view/ViewGroup;

    invoke-virtual {v1}, Landroid/view/View;->getScrollX()I

    move-result v1

    goto :goto_0

    :cond_2
    iget-object v1, p0, Lcom/facebook/react/views/scroll/a;->m:Landroid/view/ViewGroup;

    invoke-virtual {v1}, Landroid/view/View;->getScrollY()I

    move-result v1

    :goto_0
    iget-object v2, p0, Lcom/facebook/react/views/scroll/a;->o:Lcom/facebook/react/views/scroll/a$b;

    iget v2, v2, Lcom/facebook/react/views/scroll/a$b;->a:I

    :goto_1
    invoke-virtual {v0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v3

    if-ge v2, v3, :cond_6

    invoke-virtual {v0, v2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v3

    iget-boolean v4, p0, Lcom/facebook/react/views/scroll/a;->n:Z

    if-eqz v4, :cond_3

    invoke-virtual {v3}, Landroid/view/View;->getX()F

    move-result v4

    invoke-virtual {v3}, Landroid/view/View;->getWidth()I

    move-result v5

    :goto_2
    int-to-float v5, v5

    add-float/2addr v4, v5

    goto :goto_3

    :cond_3
    invoke-virtual {v3}, Landroid/view/View;->getY()F

    move-result v4

    invoke-virtual {v3}, Landroid/view/View;->getHeight()I

    move-result v5

    goto :goto_2

    :goto_3
    int-to-float v5, v1

    cmpl-float v4, v4, v5

    if-gtz v4, :cond_5

    invoke-virtual {v0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v4

    add-int/lit8 v4, v4, -0x1

    if-ne v2, v4, :cond_4

    goto :goto_4

    :cond_4
    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_5
    :goto_4
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, v3}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/facebook/react/views/scroll/a;->p:Ljava/lang/ref/WeakReference;

    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    invoke-virtual {v3, v0}, Landroid/view/View;->getHitRect(Landroid/graphics/Rect;)V

    iput-object v0, p0, Lcom/facebook/react/views/scroll/a;->q:Landroid/graphics/Rect;

    :cond_6
    return-void
.end method

.method private c()Lcom/facebook/react/views/view/i;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/facebook/react/views/scroll/a;->m:Landroid/view/ViewGroup;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/facebook/react/views/view/i;

    return-object v0
.end method

.method private d()Lcom/facebook/react/bridge/UIManager;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/facebook/react/views/scroll/a;->m:Landroid/view/ViewGroup;

    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    check-cast v0, Lcom/facebook/react/bridge/ReactContext;

    iget-object v1, p0, Lcom/facebook/react/views/scroll/a;->m:Landroid/view/ViewGroup;

    invoke-virtual {v1}, Landroid/view/View;->getId()I

    move-result v1

    invoke-static {v1}, Ly2/a;->a(I)I

    move-result v1

    invoke-static {v0, v1}, Lcom/facebook/react/uimanager/k0;->g(Lcom/facebook/react/bridge/ReactContext;I)Lcom/facebook/react/bridge/UIManager;

    move-result-object v0

    invoke-static {v0}, LO1/a;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/react/bridge/UIManager;

    return-object v0
.end method

.method private i()V
    .locals 6

    .line 1
    iget-object v0, p0, Lcom/facebook/react/views/scroll/a;->o:Lcom/facebook/react/views/scroll/a$b;

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/facebook/react/views/scroll/a;->p:Ljava/lang/ref/WeakReference;

    if-eqz v0, :cond_3

    iget-object v1, p0, Lcom/facebook/react/views/scroll/a;->q:Landroid/graphics/Rect;

    if-nez v1, :cond_0

    goto/16 :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    if-nez v0, :cond_1

    return-void

    :cond_1
    new-instance v1, Landroid/graphics/Rect;

    invoke-direct {v1}, Landroid/graphics/Rect;-><init>()V

    invoke-virtual {v0, v1}, Landroid/view/View;->getHitRect(Landroid/graphics/Rect;)V

    iget-boolean v0, p0, Lcom/facebook/react/views/scroll/a;->n:Z

    const/4 v2, 0x0

    if-eqz v0, :cond_2

    iget v0, v1, Landroid/graphics/Rect;->left:I

    iget-object v3, p0, Lcom/facebook/react/views/scroll/a;->q:Landroid/graphics/Rect;

    iget v3, v3, Landroid/graphics/Rect;->left:I

    sub-int/2addr v0, v3

    if-eqz v0, :cond_3

    iget-object v3, p0, Lcom/facebook/react/views/scroll/a;->m:Landroid/view/ViewGroup;

    invoke-virtual {v3}, Landroid/view/View;->getScrollX()I

    move-result v3

    iget-object v4, p0, Lcom/facebook/react/views/scroll/a;->m:Landroid/view/ViewGroup;

    move-object v5, v4

    check-cast v5, Lcom/facebook/react/views/scroll/f$d;

    add-int/2addr v0, v3

    invoke-virtual {v4}, Landroid/view/View;->getScrollY()I

    move-result v4

    invoke-interface {v5, v0, v4}, Lcom/facebook/react/views/scroll/f$d;->b(II)V

    iput-object v1, p0, Lcom/facebook/react/views/scroll/a;->q:Landroid/graphics/Rect;

    iget-object v0, p0, Lcom/facebook/react/views/scroll/a;->o:Lcom/facebook/react/views/scroll/a$b;

    iget-object v0, v0, Lcom/facebook/react/views/scroll/a$b;->b:Ljava/lang/Integer;

    if-eqz v0, :cond_3

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    if-gt v3, v0, :cond_3

    iget-object v0, p0, Lcom/facebook/react/views/scroll/a;->m:Landroid/view/ViewGroup;

    move-object v1, v0

    check-cast v1, Lcom/facebook/react/views/scroll/f$d;

    invoke-virtual {v0}, Landroid/view/View;->getScrollY()I

    move-result v0

    invoke-interface {v1, v2, v0}, Lcom/facebook/react/views/scroll/f$d;->c(II)V

    goto :goto_0

    :cond_2
    iget v0, v1, Landroid/graphics/Rect;->top:I

    iget-object v3, p0, Lcom/facebook/react/views/scroll/a;->q:Landroid/graphics/Rect;

    iget v3, v3, Landroid/graphics/Rect;->top:I

    sub-int/2addr v0, v3

    if-eqz v0, :cond_3

    iget-object v3, p0, Lcom/facebook/react/views/scroll/a;->m:Landroid/view/ViewGroup;

    invoke-virtual {v3}, Landroid/view/View;->getScrollY()I

    move-result v3

    iget-object v4, p0, Lcom/facebook/react/views/scroll/a;->m:Landroid/view/ViewGroup;

    move-object v5, v4

    check-cast v5, Lcom/facebook/react/views/scroll/f$d;

    invoke-virtual {v4}, Landroid/view/View;->getScrollX()I

    move-result v4

    add-int/2addr v0, v3

    invoke-interface {v5, v4, v0}, Lcom/facebook/react/views/scroll/f$d;->b(II)V

    iput-object v1, p0, Lcom/facebook/react/views/scroll/a;->q:Landroid/graphics/Rect;

    iget-object v0, p0, Lcom/facebook/react/views/scroll/a;->o:Lcom/facebook/react/views/scroll/a$b;

    iget-object v0, v0, Lcom/facebook/react/views/scroll/a$b;->b:Ljava/lang/Integer;

    if-eqz v0, :cond_3

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    if-gt v3, v0, :cond_3

    iget-object v0, p0, Lcom/facebook/react/views/scroll/a;->m:Landroid/view/ViewGroup;

    move-object v1, v0

    check-cast v1, Lcom/facebook/react/views/scroll/f$d;

    invoke-virtual {v0}, Landroid/view/View;->getScrollX()I

    move-result v0

    invoke-interface {v1, v0, v2}, Lcom/facebook/react/views/scroll/f$d;->c(II)V

    :cond_3
    :goto_0
    return-void
.end method


# virtual methods
.method public didDispatchMountItems(Lcom/facebook/react/bridge/UIManager;)V
    .locals 0

    return-void
.end method

.method public didMountItems(Lcom/facebook/react/bridge/UIManager;)V
    .locals 0

    invoke-direct {p0}, Lcom/facebook/react/views/scroll/a;->i()V

    return-void
.end method

.method public didScheduleMountItems(Lcom/facebook/react/bridge/UIManager;)V
    .locals 0

    return-void
.end method

.method public e(Lcom/facebook/react/views/scroll/a$b;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/facebook/react/views/scroll/a;->o:Lcom/facebook/react/views/scroll/a$b;

    return-void
.end method

.method public f()V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/facebook/react/views/scroll/a;->r:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/facebook/react/views/scroll/a;->r:Z

    invoke-direct {p0}, Lcom/facebook/react/views/scroll/a;->d()Lcom/facebook/react/bridge/UIManager;

    move-result-object v0

    invoke-interface {v0, p0}, Lcom/facebook/react/bridge/UIManager;->addUIManagerEventListener(Lcom/facebook/react/bridge/UIManagerListener;)V

    return-void
.end method

.method public g()V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/facebook/react/views/scroll/a;->r:Z

    if-nez v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/facebook/react/views/scroll/a;->r:Z

    invoke-direct {p0}, Lcom/facebook/react/views/scroll/a;->d()Lcom/facebook/react/bridge/UIManager;

    move-result-object v0

    invoke-interface {v0, p0}, Lcom/facebook/react/bridge/UIManager;->removeUIManagerEventListener(Lcom/facebook/react/bridge/UIManagerListener;)V

    return-void
.end method

.method public h()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/facebook/react/views/scroll/a;->m:Landroid/view/ViewGroup;

    invoke-virtual {v0}, Landroid/view/View;->getId()I

    move-result v0

    invoke-static {v0}, Ly2/a;->a(I)I

    move-result v0

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    return-void

    :cond_0
    invoke-direct {p0}, Lcom/facebook/react/views/scroll/a;->i()V

    return-void
.end method

.method public willDispatchViewUpdates(Lcom/facebook/react/bridge/UIManager;)V
    .locals 0

    new-instance p1, Lcom/facebook/react/views/scroll/a$a;

    invoke-direct {p1, p0}, Lcom/facebook/react/views/scroll/a$a;-><init>(Lcom/facebook/react/views/scroll/a;)V

    invoke-static {p1}, Lcom/facebook/react/bridge/UiThreadUtil;->runOnUiThread(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public willMountItems(Lcom/facebook/react/bridge/UIManager;)V
    .locals 0

    invoke-direct {p0}, Lcom/facebook/react/views/scroll/a;->b()V

    return-void
.end method
