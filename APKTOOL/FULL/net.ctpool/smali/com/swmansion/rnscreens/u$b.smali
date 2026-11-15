.class final Lcom/swmansion/rnscreens/u$b;
.super Landroidx/coordinatorlayout/widget/CoordinatorLayout;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/swmansion/rnscreens/u;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "b"
.end annotation


# instance fields
.field private final K:Lcom/swmansion/rnscreens/q;

.field private final L:Landroid/view/animation/Animation$AnimationListener;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/swmansion/rnscreens/q;)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mFragment"

    invoke-static {p2, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Landroidx/coordinatorlayout/widget/CoordinatorLayout;-><init>(Landroid/content/Context;)V

    iput-object p2, p0, Lcom/swmansion/rnscreens/u$b;->K:Lcom/swmansion/rnscreens/q;

    new-instance p1, Lcom/swmansion/rnscreens/u$b$a;

    invoke-direct {p1, p0}, Lcom/swmansion/rnscreens/u$b$a;-><init>(Lcom/swmansion/rnscreens/u$b;)V

    iput-object p1, p0, Lcom/swmansion/rnscreens/u$b;->L:Landroid/view/animation/Animation$AnimationListener;

    return-void
.end method

.method public static final synthetic b0(Lcom/swmansion/rnscreens/u$b;)Lcom/swmansion/rnscreens/q;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/swmansion/rnscreens/u$b;->K:Lcom/swmansion/rnscreens/q;

    return-object p0
.end method


# virtual methods
.method public clearFocus()V
    .locals 2

    invoke-virtual {p0}, Landroid/view/View;->getVisibility()I

    move-result v0

    const/4 v1, 0x4

    if-eq v0, v1, :cond_0

    invoke-super {p0}, Landroid/view/View;->clearFocus()V

    :cond_0
    return-void
.end method

.method public startAnimation(Landroid/view/animation/Animation;)V
    .locals 3

    const-string v0, "animation"

    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/swmansion/rnscreens/u$a;

    iget-object v1, p0, Lcom/swmansion/rnscreens/u$b;->K:Lcom/swmansion/rnscreens/q;

    invoke-direct {v0, v1}, Lcom/swmansion/rnscreens/u$a;-><init>(Lcom/swmansion/rnscreens/q;)V

    invoke-virtual {p1}, Landroid/view/animation/Animation;->getDuration()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Landroid/view/animation/Animation;->setDuration(J)V

    instance-of v1, p1, Landroid/view/animation/AnimationSet;

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/swmansion/rnscreens/u$b;->K:Lcom/swmansion/rnscreens/q;

    invoke-virtual {v1}, Landroidx/fragment/app/Fragment;->isRemoving()Z

    move-result v1

    if-nez v1, :cond_0

    check-cast p1, Landroid/view/animation/AnimationSet;

    invoke-virtual {p1, v0}, Landroid/view/animation/AnimationSet;->addAnimation(Landroid/view/animation/Animation;)V

    iget-object v0, p0, Lcom/swmansion/rnscreens/u$b;->L:Landroid/view/animation/Animation$AnimationListener;

    invoke-virtual {p1, v0}, Landroid/view/animation/Animation;->setAnimationListener(Landroid/view/animation/Animation$AnimationListener;)V

    invoke-super {p0, p1}, Landroid/view/View;->startAnimation(Landroid/view/animation/Animation;)V

    goto :goto_0

    :cond_0
    new-instance v1, Landroid/view/animation/AnimationSet;

    const/4 v2, 0x1

    invoke-direct {v1, v2}, Landroid/view/animation/AnimationSet;-><init>(Z)V

    invoke-virtual {v1, p1}, Landroid/view/animation/AnimationSet;->addAnimation(Landroid/view/animation/Animation;)V

    invoke-virtual {v1, v0}, Landroid/view/animation/AnimationSet;->addAnimation(Landroid/view/animation/Animation;)V

    iget-object p1, p0, Lcom/swmansion/rnscreens/u$b;->L:Landroid/view/animation/Animation$AnimationListener;

    invoke-virtual {v1, p1}, Landroid/view/animation/Animation;->setAnimationListener(Landroid/view/animation/Animation$AnimationListener;)V

    invoke-super {p0, v1}, Landroid/view/View;->startAnimation(Landroid/view/animation/Animation;)V

    :goto_0
    return-void
.end method
