.class public final Lcom/swmansion/rnscreens/u;
.super Lcom/swmansion/rnscreens/q;
.source "SourceFile"

# interfaces
.implements Lcom/swmansion/rnscreens/v;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/swmansion/rnscreens/u$a;,
        Lcom/swmansion/rnscreens/u$b;
    }
.end annotation


# instance fields
.field private A:Lv5/l;

.field private u:Lcom/google/android/material/appbar/AppBarLayout;

.field private v:Landroidx/appcompat/widget/Toolbar;

.field private w:Z

.field private x:Z

.field private y:Landroid/view/View;

.field private z:Lcom/swmansion/rnscreens/c;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Lcom/swmansion/rnscreens/q;-><init>()V

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "ScreenStack fragments should never be restored. Follow instructions from https://github.com/software-mansion/react-native-screens/issues/17#issuecomment-424704067 to properly configure your main activity."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public constructor <init>(Lcom/swmansion/rnscreens/l;)V
    .locals 1

    .line 2
    const-string v0, "screenView"

    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Lcom/swmansion/rnscreens/q;-><init>(Lcom/swmansion/rnscreens/l;)V

    return-void
.end method

.method private final J()Landroid/view/View;
    .locals 3

    .line 1
    invoke-virtual {p0}, Lcom/swmansion/rnscreens/q;->g()Lcom/swmansion/rnscreens/l;

    move-result-object v0

    :goto_0
    const/4 v1, 0x0

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Landroid/view/View;->isFocused()Z

    move-result v2

    if-eqz v2, :cond_0

    return-object v0

    :cond_0
    instance-of v2, v0, Landroid/view/ViewGroup;

    if-eqz v2, :cond_1

    check-cast v0, Landroid/view/ViewGroup;

    invoke-virtual {v0}, Landroid/view/ViewGroup;->getFocusedChild()Landroid/view/View;

    move-result-object v0

    goto :goto_0

    :cond_1
    move-object v0, v1

    goto :goto_0

    :cond_2
    return-object v1
.end method

.method private final L()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getView()Landroid/view/View;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    instance-of v1, v0, Lcom/swmansion/rnscreens/t;

    if-eqz v1, :cond_1

    check-cast v0, Lcom/swmansion/rnscreens/t;

    invoke-virtual {v0}, Lcom/swmansion/rnscreens/t;->I()V

    :cond_1
    return-void
.end method

.method private final R()Z
    .locals 6

    .line 1
    invoke-virtual {p0}, Lcom/swmansion/rnscreens/q;->g()Lcom/swmansion/rnscreens/l;

    move-result-object v0

    invoke-virtual {v0}, Lcom/swmansion/rnscreens/l;->getHeaderConfig()Lcom/swmansion/rnscreens/x;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/swmansion/rnscreens/x;->getConfigSubviewsCount()I

    move-result v2

    goto :goto_0

    :cond_0
    move v2, v1

    :goto_0
    if-eqz v0, :cond_2

    if-lez v2, :cond_2

    move v3, v1

    :goto_1
    if-ge v3, v2, :cond_2

    invoke-virtual {v0, v3}, Lcom/swmansion/rnscreens/x;->e(I)Lcom/swmansion/rnscreens/y;

    move-result-object v4

    invoke-virtual {v4}, Lcom/swmansion/rnscreens/y;->getType()Lcom/swmansion/rnscreens/y$a;

    move-result-object v4

    sget-object v5, Lcom/swmansion/rnscreens/y$a;->q:Lcom/swmansion/rnscreens/y$a;

    if-ne v4, v5, :cond_1

    const/4 v0, 0x1

    return v0

    :cond_1
    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    :cond_2
    return v1
.end method

.method private final S(Landroid/view/Menu;)V
    .locals 2

    .line 1
    invoke-interface {p1}, Landroid/view/Menu;->clear()V

    invoke-direct {p0}, Lcom/swmansion/rnscreens/u;->R()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getContext()Landroid/content/Context;

    move-result-object v0

    iget-object v1, p0, Lcom/swmansion/rnscreens/u;->z:Lcom/swmansion/rnscreens/c;

    if-nez v1, :cond_0

    if-eqz v0, :cond_0

    new-instance v1, Lcom/swmansion/rnscreens/c;

    invoke-direct {v1, v0, p0}, Lcom/swmansion/rnscreens/c;-><init>(Landroid/content/Context;Landroidx/fragment/app/Fragment;)V

    iput-object v1, p0, Lcom/swmansion/rnscreens/u;->z:Lcom/swmansion/rnscreens/c;

    iget-object v0, p0, Lcom/swmansion/rnscreens/u;->A:Lv5/l;

    if-eqz v0, :cond_0

    invoke-interface {v0, v1}, Lv5/l;->i(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    const-string v0, ""

    invoke-interface {p1, v0}, Landroid/view/Menu;->add(Ljava/lang/CharSequence;)Landroid/view/MenuItem;

    move-result-object p1

    const/4 v0, 0x2

    invoke-interface {p1, v0}, Landroid/view/MenuItem;->setShowAsAction(I)V

    iget-object v0, p0, Lcom/swmansion/rnscreens/u;->z:Lcom/swmansion/rnscreens/c;

    invoke-interface {p1, v0}, Landroid/view/MenuItem;->setActionView(Landroid/view/View;)Landroid/view/MenuItem;

    :cond_1
    return-void
.end method


# virtual methods
.method public D()V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/swmansion/rnscreens/q;->D()V

    invoke-direct {p0}, Lcom/swmansion/rnscreens/u;->L()V

    return-void
.end method

.method public I()Z
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcom/swmansion/rnscreens/q;->g()Lcom/swmansion/rnscreens/l;

    move-result-object v0

    invoke-virtual {v0}, Lcom/swmansion/rnscreens/l;->getContainer()Lcom/swmansion/rnscreens/n;

    move-result-object v0

    instance-of v1, v0, Lcom/swmansion/rnscreens/t;

    if-eqz v1, :cond_2

    check-cast v0, Lcom/swmansion/rnscreens/t;

    invoke-virtual {v0}, Lcom/swmansion/rnscreens/t;->getRootScreen()Lcom/swmansion/rnscreens/l;

    move-result-object v0

    invoke-virtual {p0}, Lcom/swmansion/rnscreens/q;->g()Lcom/swmansion/rnscreens/l;

    move-result-object v1

    invoke-static {v0, v1}, Lw5/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getParentFragment()Landroidx/fragment/app/Fragment;

    move-result-object v0

    instance-of v1, v0, Lcom/swmansion/rnscreens/u;

    if-eqz v1, :cond_0

    check-cast v0, Lcom/swmansion/rnscreens/u;

    invoke-virtual {v0}, Lcom/swmansion/rnscreens/u;->I()Z

    move-result v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0

    :cond_1
    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_2
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "ScreenStackFragment added into a non-stack container"

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final K()Lcom/swmansion/rnscreens/c;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/swmansion/rnscreens/u;->z:Lcom/swmansion/rnscreens/c;

    return-object v0
.end method

.method public M()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/swmansion/rnscreens/u;->u:Lcom/google/android/material/appbar/AppBarLayout;

    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/swmansion/rnscreens/u;->v:Landroidx/appcompat/widget/Toolbar;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v2

    if-ne v2, v0, :cond_0

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    :cond_0
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/swmansion/rnscreens/u;->v:Landroidx/appcompat/widget/Toolbar;

    return-void
.end method

.method public final N(Lv5/l;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/swmansion/rnscreens/u;->A:Lv5/l;

    .line 2
    .line 3
    return-void
.end method

.method public O(Landroidx/appcompat/widget/Toolbar;)V
    .locals 3

    .line 1
    const-string v0, "toolbar"

    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/swmansion/rnscreens/u;->u:Lcom/google/android/material/appbar/AppBarLayout;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    :cond_0
    new-instance v0, Lcom/google/android/material/appbar/AppBarLayout$e;

    const/4 v1, -0x1

    const/4 v2, -0x2

    invoke-direct {v0, v1, v2}, Lcom/google/android/material/appbar/AppBarLayout$e;-><init>(II)V

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/google/android/material/appbar/AppBarLayout$e;->g(I)V

    invoke-virtual {p1, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    iput-object p1, p0, Lcom/swmansion/rnscreens/u;->v:Landroidx/appcompat/widget/Toolbar;

    return-void
.end method

.method public P(Z)V
    .locals 2

    .line 1
    iget-boolean v0, p0, Lcom/swmansion/rnscreens/u;->w:Z

    if-eq v0, p1, :cond_3

    iget-object v0, p0, Lcom/swmansion/rnscreens/u;->u:Lcom/google/android/material/appbar/AppBarLayout;

    if-nez v0, :cond_0

    goto :goto_1

    :cond_0
    if-eqz p1, :cond_1

    const/4 v1, 0x0

    goto :goto_0

    :cond_1
    const/high16 v1, 0x40800000    # 4.0f

    invoke-static {v1}, Lcom/facebook/react/uimanager/G;->d(F)F

    move-result v1

    :goto_0
    invoke-virtual {v0, v1}, Lcom/google/android/material/appbar/AppBarLayout;->setElevation(F)V

    :goto_1
    iget-object v0, p0, Lcom/swmansion/rnscreens/u;->u:Lcom/google/android/material/appbar/AppBarLayout;

    if-nez v0, :cond_2

    goto :goto_2

    :cond_2
    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setStateListAnimator(Landroid/animation/StateListAnimator;)V

    :goto_2
    iput-boolean p1, p0, Lcom/swmansion/rnscreens/u;->w:Z

    :cond_3
    return-void
.end method

.method public Q(Z)V
    .locals 2

    .line 1
    iget-boolean v0, p0, Lcom/swmansion/rnscreens/u;->x:Z

    if-eq v0, p1, :cond_1

    invoke-virtual {p0}, Lcom/swmansion/rnscreens/q;->g()Lcom/swmansion/rnscreens/l;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    const-string v1, "null cannot be cast to non-null type androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams"

    invoke-static {v0, v1}, Lw5/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Landroidx/coordinatorlayout/widget/CoordinatorLayout$f;

    if-eqz p1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    new-instance v1, Lcom/google/android/material/appbar/AppBarLayout$ScrollingViewBehavior;

    invoke-direct {v1}, Lcom/google/android/material/appbar/AppBarLayout$ScrollingViewBehavior;-><init>()V

    :goto_0
    invoke-virtual {v0, v1}, Landroidx/coordinatorlayout/widget/CoordinatorLayout$f;->n(Landroidx/coordinatorlayout/widget/CoordinatorLayout$c;)V

    iput-boolean p1, p0, Lcom/swmansion/rnscreens/u;->x:Z

    :cond_1
    return-void
.end method

.method public dismiss()V
    .locals 2

    invoke-virtual {p0}, Lcom/swmansion/rnscreens/q;->g()Lcom/swmansion/rnscreens/l;

    move-result-object v0

    invoke-virtual {v0}, Lcom/swmansion/rnscreens/l;->getContainer()Lcom/swmansion/rnscreens/n;

    move-result-object v0

    instance-of v1, v0, Lcom/swmansion/rnscreens/t;

    if-eqz v1, :cond_0

    check-cast v0, Lcom/swmansion/rnscreens/t;

    invoke-virtual {v0, p0}, Lcom/swmansion/rnscreens/t;->D(Lcom/swmansion/rnscreens/v;)V

    return-void

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "ScreenStackFragment added into a non-stack container"

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public k()V
    .locals 1

    .line 1
    invoke-super {p0}, Lcom/swmansion/rnscreens/q;->k()V

    invoke-virtual {p0}, Lcom/swmansion/rnscreens/q;->g()Lcom/swmansion/rnscreens/l;

    move-result-object v0

    invoke-virtual {v0}, Lcom/swmansion/rnscreens/l;->getHeaderConfig()Lcom/swmansion/rnscreens/x;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/swmansion/rnscreens/x;->i()V

    :cond_0
    return-void
.end method

.method public onCreateOptionsMenu(Landroid/view/Menu;Landroid/view/MenuInflater;)V
    .locals 1

    const-string v0, "menu"

    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "inflater"

    invoke-static {p2, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Lcom/swmansion/rnscreens/u;->S(Landroid/view/Menu;)V

    invoke-super {p0, p1, p2}, Landroidx/fragment/app/Fragment;->onCreateOptionsMenu(Landroid/view/Menu;Landroid/view/MenuInflater;)V

    return-void
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 3

    const-string p2, "inflater"

    invoke-static {p1, p2}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getContext()Landroid/content/Context;

    move-result-object p1

    const/4 p2, 0x0

    if-eqz p1, :cond_0

    new-instance p3, Lcom/swmansion/rnscreens/u$b;

    invoke-direct {p3, p1, p0}, Lcom/swmansion/rnscreens/u$b;-><init>(Landroid/content/Context;Lcom/swmansion/rnscreens/q;)V

    goto :goto_0

    :cond_0
    move-object p3, p2

    :goto_0
    invoke-virtual {p0}, Lcom/swmansion/rnscreens/q;->g()Lcom/swmansion/rnscreens/l;

    move-result-object p1

    new-instance v0, Landroidx/coordinatorlayout/widget/CoordinatorLayout$f;

    const/4 v1, -0x1

    invoke-direct {v0, v1, v1}, Landroidx/coordinatorlayout/widget/CoordinatorLayout$f;-><init>(II)V

    iget-boolean v2, p0, Lcom/swmansion/rnscreens/u;->x:Z

    if-eqz v2, :cond_1

    move-object v2, p2

    goto :goto_1

    :cond_1
    new-instance v2, Lcom/google/android/material/appbar/AppBarLayout$ScrollingViewBehavior;

    invoke-direct {v2}, Lcom/google/android/material/appbar/AppBarLayout$ScrollingViewBehavior;-><init>()V

    :goto_1
    invoke-virtual {v0, v2}, Landroidx/coordinatorlayout/widget/CoordinatorLayout$f;->n(Landroidx/coordinatorlayout/widget/CoordinatorLayout$c;)V

    invoke-virtual {p1, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    if-eqz p3, :cond_2

    invoke-virtual {p0}, Lcom/swmansion/rnscreens/q;->g()Lcom/swmansion/rnscreens/l;

    move-result-object p1

    invoke-static {p1}, Lcom/swmansion/rnscreens/q;->F(Landroid/view/View;)Landroid/view/View;

    move-result-object p1

    invoke-virtual {p3, p1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    :cond_2
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getContext()Landroid/content/Context;

    move-result-object p1

    if-eqz p1, :cond_3

    new-instance v0, Lcom/google/android/material/appbar/AppBarLayout;

    invoke-direct {v0, p1}, Lcom/google/android/material/appbar/AppBarLayout;-><init>(Landroid/content/Context;)V

    const/4 p1, 0x0

    invoke-virtual {v0, p1}, Landroid/view/View;->setBackgroundColor(I)V

    new-instance p1, Lcom/google/android/material/appbar/AppBarLayout$e;

    const/4 v2, -0x2

    invoke-direct {p1, v1, v2}, Lcom/google/android/material/appbar/AppBarLayout$e;-><init>(II)V

    invoke-virtual {v0, p1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    goto :goto_2

    :cond_3
    move-object v0, p2

    :goto_2
    iput-object v0, p0, Lcom/swmansion/rnscreens/u;->u:Lcom/google/android/material/appbar/AppBarLayout;

    if-eqz p3, :cond_4

    invoke-virtual {p3, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    :cond_4
    iget-boolean p1, p0, Lcom/swmansion/rnscreens/u;->w:Z

    if-eqz p1, :cond_7

    iget-object p1, p0, Lcom/swmansion/rnscreens/u;->u:Lcom/google/android/material/appbar/AppBarLayout;

    if-nez p1, :cond_5

    goto :goto_3

    :cond_5
    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lcom/google/android/material/appbar/AppBarLayout;->setElevation(F)V

    :goto_3
    iget-object p1, p0, Lcom/swmansion/rnscreens/u;->u:Lcom/google/android/material/appbar/AppBarLayout;

    if-nez p1, :cond_6

    goto :goto_4

    :cond_6
    invoke-virtual {p1, p2}, Landroid/view/View;->setStateListAnimator(Landroid/animation/StateListAnimator;)V

    :cond_7
    :goto_4
    iget-object p1, p0, Lcom/swmansion/rnscreens/u;->v:Landroidx/appcompat/widget/Toolbar;

    if-eqz p1, :cond_8

    iget-object p2, p0, Lcom/swmansion/rnscreens/u;->u:Lcom/google/android/material/appbar/AppBarLayout;

    if-eqz p2, :cond_8

    invoke-static {p1}, Lcom/swmansion/rnscreens/q;->F(Landroid/view/View;)Landroid/view/View;

    move-result-object p1

    invoke-virtual {p2, p1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    :cond_8
    const/4 p1, 0x1

    invoke-virtual {p0, p1}, Landroidx/fragment/app/Fragment;->setHasOptionsMenu(Z)V

    return-object p3
.end method

.method public onPrepareOptionsMenu(Landroid/view/Menu;)V
    .locals 1

    const-string v0, "menu"

    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Lcom/swmansion/rnscreens/u;->S(Landroid/view/Menu;)V

    invoke-super {p0, p1}, Landroidx/fragment/app/Fragment;->onPrepareOptionsMenu(Landroid/view/Menu;)V

    return-void
.end method

.method public onStart()V
    .locals 1

    iget-object v0, p0, Lcom/swmansion/rnscreens/u;->y:Landroid/view/View;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/view/View;->requestFocus()Z

    :cond_0
    invoke-super {p0}, Landroidx/fragment/app/Fragment;->onStart()V

    return-void
.end method

.method public onStop()V
    .locals 2

    sget-object v0, Ld5/a;->a:Ld5/a;

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v0, v1}, Ld5/a;->a(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-direct {p0}, Lcom/swmansion/rnscreens/u;->J()Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/swmansion/rnscreens/u;->y:Landroid/view/View;

    :cond_0
    invoke-super {p0}, Landroidx/fragment/app/Fragment;->onStop()V

    return-void
.end method
