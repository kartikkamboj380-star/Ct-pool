.class public final Lcom/facebook/react/views/scroll/f$h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/animation/Animator$AnimatorListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/facebook/react/views/scroll/f;->o(Landroid/view/ViewGroup;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroid/view/ViewGroup;


# direct methods
.method constructor <init>(Landroid/view/ViewGroup;)V
    .locals 0

    iput-object p1, p0, Lcom/facebook/react/views/scroll/f$h;->a:Landroid/view/ViewGroup;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationCancel(Landroid/animation/Animator;)V
    .locals 1

    const-string v0, "animator"

    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Lcom/facebook/react/views/scroll/f$h;->a:Landroid/view/ViewGroup;

    check-cast p1, Lcom/facebook/react/views/scroll/f$c;

    invoke-interface {p1}, Lcom/facebook/react/views/scroll/f$c;->getReactScrollViewScrollState()Lcom/facebook/react/views/scroll/f$g;

    move-result-object p1

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Lcom/facebook/react/views/scroll/f$g;->h(Z)V

    return-void
.end method

.method public onAnimationEnd(Landroid/animation/Animator;)V
    .locals 1

    const-string v0, "animator"

    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Lcom/facebook/react/views/scroll/f$h;->a:Landroid/view/ViewGroup;

    check-cast p1, Lcom/facebook/react/views/scroll/f$c;

    invoke-interface {p1}, Lcom/facebook/react/views/scroll/f$c;->getReactScrollViewScrollState()Lcom/facebook/react/views/scroll/f$g;

    move-result-object p1

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Lcom/facebook/react/views/scroll/f$g;->k(Z)V

    iget-object p1, p0, Lcom/facebook/react/views/scroll/f$h;->a:Landroid/view/ViewGroup;

    invoke-static {p1}, Lcom/facebook/react/views/scroll/f;->q(Landroid/view/ViewGroup;)V

    return-void
.end method

.method public onAnimationRepeat(Landroid/animation/Animator;)V
    .locals 1

    const-string v0, "animator"

    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public onAnimationStart(Landroid/animation/Animator;)V
    .locals 1

    const-string v0, "animator"

    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Lcom/facebook/react/views/scroll/f$h;->a:Landroid/view/ViewGroup;

    check-cast p1, Lcom/facebook/react/views/scroll/f$c;

    invoke-interface {p1}, Lcom/facebook/react/views/scroll/f$c;->getReactScrollViewScrollState()Lcom/facebook/react/views/scroll/f$g;

    move-result-object p1

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lcom/facebook/react/views/scroll/f$g;->h(Z)V

    invoke-virtual {p1, v0}, Lcom/facebook/react/views/scroll/f$g;->k(Z)V

    return-void
.end method
