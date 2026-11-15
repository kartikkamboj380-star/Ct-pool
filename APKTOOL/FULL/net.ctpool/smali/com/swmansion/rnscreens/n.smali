.class public Lcom/swmansion/rnscreens/n;
.super Landroid/view/ViewGroup;
.source "SourceFile"


# instance fields
.field protected final m:Ljava/util/ArrayList;

.field protected n:Landroidx/fragment/app/w;

.field private o:Z

.field private p:Z

.field private q:Z

.field private final r:Lm2/a;

.field private s:Lcom/swmansion/rnscreens/r;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    invoke-direct {p0, p1}, Landroid/view/ViewGroup;-><init>(Landroid/content/Context;)V

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lcom/swmansion/rnscreens/n;->m:Ljava/util/ArrayList;

    new-instance p1, Lcom/swmansion/rnscreens/n$a;

    invoke-direct {p1, p0}, Lcom/swmansion/rnscreens/n$a;-><init>(Lcom/swmansion/rnscreens/n;)V

    iput-object p1, p0, Lcom/swmansion/rnscreens/n;->r:Lm2/a;

    return-void
.end method

.method public static synthetic a(Lcom/swmansion/rnscreens/n;)V
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/swmansion/rnscreens/n;->s(Lcom/swmansion/rnscreens/n;)V

    return-void
.end method

.method public static final synthetic b(Lcom/swmansion/rnscreens/n;Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/swmansion/rnscreens/n;->q:Z

    return-void
.end method

.method private final f(Landroidx/fragment/app/E;Landroidx/fragment/app/Fragment;)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getId()I

    move-result v0

    invoke-virtual {p1, v0, p2}, Landroidx/fragment/app/E;->b(ILandroidx/fragment/app/Fragment;)Landroidx/fragment/app/E;

    return-void
.end method

.method private final i(Landroidx/fragment/app/E;Landroidx/fragment/app/Fragment;)V
    .locals 0

    .line 1
    invoke-virtual {p1, p2}, Landroidx/fragment/app/E;->m(Landroidx/fragment/app/Fragment;)Landroidx/fragment/app/E;

    return-void
.end method

.method private final j(Lcom/facebook/react/X;)Landroidx/fragment/app/w;
    .locals 3

    .line 1
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    :goto_0
    instance-of v1, v0, Landroidx/fragment/app/j;

    if-nez v1, :cond_0

    instance-of v2, v0, Landroid/content/ContextWrapper;

    if-eqz v2, :cond_0

    check-cast v0, Landroid/content/ContextWrapper;

    invoke-virtual {v0}, Landroid/content/ContextWrapper;->getBaseContext()Landroid/content/Context;

    move-result-object v0

    goto :goto_0

    :cond_0
    if-eqz v1, :cond_2

    check-cast v0, Landroidx/fragment/app/j;

    invoke-virtual {v0}, Landroidx/fragment/app/j;->O()Landroidx/fragment/app/w;

    move-result-object v1

    invoke-virtual {v1}, Landroidx/fragment/app/w;->v0()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_1

    :catch_0
    invoke-virtual {v0}, Landroidx/fragment/app/j;->O()Landroidx/fragment/app/w;

    move-result-object p1

    :goto_1
    invoke-static {p1}, Lw5/k;->c(Ljava/lang/Object;)V

    goto :goto_2

    :cond_1
    :try_start_0
    invoke-static {p1}, Landroidx/fragment/app/w;->i0(Landroid/view/View;)Landroidx/fragment/app/Fragment;

    move-result-object p1

    invoke-virtual {p1}, Landroidx/fragment/app/Fragment;->getChildFragmentManager()Landroidx/fragment/app/w;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :goto_2
    return-object p1

    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "In order to use RNScreens components your app\'s activity need to extend ReactActivity"

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private final k(Lcom/swmansion/rnscreens/r;)Lcom/swmansion/rnscreens/l$a;
    .locals 0

    .line 1
    invoke-interface {p1}, Lcom/swmansion/rnscreens/r;->g()Lcom/swmansion/rnscreens/l;

    move-result-object p1

    invoke-virtual {p1}, Lcom/swmansion/rnscreens/l;->getActivityState()Lcom/swmansion/rnscreens/l$a;

    move-result-object p1

    return-object p1
.end method

.method private final r()V
    .locals 2

    .line 1
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/swmansion/rnscreens/n;->p:Z

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    const-string v1, "null cannot be cast to non-null type com.facebook.react.uimanager.ThemedReactContext"

    invoke-static {v0, v1}, Lw5/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lcom/facebook/react/uimanager/e0;

    invoke-virtual {v0}, Lcom/facebook/react/uimanager/e0;->b()Lcom/facebook/react/bridge/ReactApplicationContext;

    move-result-object v0

    new-instance v1, Lcom/swmansion/rnscreens/m;

    invoke-direct {v1, p0}, Lcom/swmansion/rnscreens/m;-><init>(Lcom/swmansion/rnscreens/n;)V

    invoke-virtual {v0, v1}, Lcom/facebook/react/bridge/ReactContext;->runOnUiQueueThread(Ljava/lang/Runnable;)V

    return-void
.end method

.method private static final s(Lcom/swmansion/rnscreens/n;)V
    .locals 1

    .line 1
    const-string v0, "this$0"

    invoke-static {p0, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/swmansion/rnscreens/n;->u()V

    return-void
.end method

.method private final setFragmentManager(Landroidx/fragment/app/w;)V
    .locals 0

    iput-object p1, p0, Lcom/swmansion/rnscreens/n;->n:Landroidx/fragment/app/w;

    invoke-virtual {p0}, Lcom/swmansion/rnscreens/n;->v()V

    return-void
.end method

.method private final x(Landroidx/fragment/app/w;)V
    .locals 4

    .line 1
    invoke-virtual {p1}, Landroidx/fragment/app/w;->p()Landroidx/fragment/app/E;

    move-result-object v0

    const-string v1, "beginTransaction(...)"

    invoke-static {v0, v1}, Lw5/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Landroidx/fragment/app/w;->v0()Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    const/4 v1, 0x0

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroidx/fragment/app/Fragment;

    instance-of v3, v2, Lcom/swmansion/rnscreens/q;

    if-eqz v3, :cond_0

    move-object v3, v2

    check-cast v3, Lcom/swmansion/rnscreens/q;

    invoke-virtual {v3}, Lcom/swmansion/rnscreens/q;->g()Lcom/swmansion/rnscreens/l;

    move-result-object v3

    invoke-virtual {v3}, Lcom/swmansion/rnscreens/l;->getContainer()Lcom/swmansion/rnscreens/n;

    move-result-object v3

    if-ne v3, p0, :cond_0

    invoke-virtual {v0, v2}, Landroidx/fragment/app/E;->m(Landroidx/fragment/app/Fragment;)Landroidx/fragment/app/E;

    const/4 v1, 0x1

    goto :goto_0

    :cond_1
    if-eqz v1, :cond_2

    invoke-virtual {v0}, Landroidx/fragment/app/E;->j()V

    :cond_2
    return-void
.end method

.method private final z()V
    .locals 3

    .line 1
    move-object v0, p0

    :goto_0
    instance-of v1, v0, Lcom/facebook/react/X;

    if-nez v1, :cond_0

    instance-of v2, v0, Lcom/swmansion/rnscreens/l;

    if-nez v2, :cond_0

    invoke-interface {v0}, Landroid/view/ViewParent;->getParent()Landroid/view/ViewParent;

    move-result-object v2

    if-eqz v2, :cond_0

    invoke-interface {v0}, Landroid/view/ViewParent;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    const-string v1, "getParent(...)"

    invoke-static {v0, v1}, Lw5/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    instance-of v2, v0, Lcom/swmansion/rnscreens/l;

    if-eqz v2, :cond_3

    check-cast v0, Lcom/swmansion/rnscreens/l;

    invoke-virtual {v0}, Lcom/swmansion/rnscreens/l;->getFragmentWrapper()Lcom/swmansion/rnscreens/r;

    move-result-object v0

    if-eqz v0, :cond_1

    iput-object v0, p0, Lcom/swmansion/rnscreens/n;->s:Lcom/swmansion/rnscreens/r;

    invoke-interface {v0, p0}, Lcom/swmansion/rnscreens/r;->j(Lcom/swmansion/rnscreens/n;)V

    invoke-interface {v0}, Lcom/swmansion/rnscreens/g;->e()Landroidx/fragment/app/Fragment;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->getChildFragmentManager()Landroidx/fragment/app/w;

    move-result-object v0

    const-string v1, "getChildFragmentManager(...)"

    invoke-static {v0, v1}, Lw5/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, v0}, Lcom/swmansion/rnscreens/n;->setFragmentManager(Landroidx/fragment/app/w;)V

    sget-object v0, Li5/u;->a:Li5/u;

    goto :goto_1

    :cond_1
    const/4 v0, 0x0

    :goto_1
    if-eqz v0, :cond_2

    goto :goto_2

    :cond_2
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Parent Screen does not have its Fragment attached"

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_3
    if-eqz v1, :cond_4

    check-cast v0, Lcom/facebook/react/X;

    invoke-direct {p0, v0}, Lcom/swmansion/rnscreens/n;->j(Lcom/facebook/react/X;)Landroidx/fragment/app/w;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/swmansion/rnscreens/n;->setFragmentManager(Landroidx/fragment/app/w;)V

    :goto_2
    return-void

    :cond_4
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "ScreenContainer is not attached under ReactRootView"

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method


# virtual methods
.method protected c(Lcom/swmansion/rnscreens/l;)Lcom/swmansion/rnscreens/r;
    .locals 1

    .line 1
    const-string v0, "screen"

    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/swmansion/rnscreens/q;

    invoke-direct {v0, p1}, Lcom/swmansion/rnscreens/q;-><init>(Lcom/swmansion/rnscreens/l;)V

    return-object v0
.end method

.method public final d(Lcom/swmansion/rnscreens/l;I)V
    .locals 2

    .line 1
    const-string v0, "screen"

    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Lcom/swmansion/rnscreens/n;->c(Lcom/swmansion/rnscreens/l;)Lcom/swmansion/rnscreens/r;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/swmansion/rnscreens/l;->setFragmentWrapper(Lcom/swmansion/rnscreens/r;)V

    iget-object v1, p0, Lcom/swmansion/rnscreens/n;->m:Ljava/util/ArrayList;

    invoke-virtual {v1, p2, v0}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    invoke-virtual {p1, p0}, Lcom/swmansion/rnscreens/l;->setContainer(Lcom/swmansion/rnscreens/n;)V

    invoke-direct {p0}, Lcom/swmansion/rnscreens/n;->r()V

    return-void
.end method

.method public final e()V
    .locals 6

    .line 1
    iget-object v0, p0, Lcom/swmansion/rnscreens/n;->m:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x2

    if-lt v0, v1, :cond_0

    invoke-virtual {p0}, Lcom/swmansion/rnscreens/n;->g()Landroidx/fragment/app/E;

    move-result-object v0

    invoke-virtual {p0}, Lcom/swmansion/rnscreens/n;->getTopScreen()Lcom/swmansion/rnscreens/l;

    move-result-object v2

    const-string v3, "null cannot be cast to non-null type com.swmansion.rnscreens.Screen"

    invoke-static {v2, v3}, Lw5/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v2}, Lcom/swmansion/rnscreens/l;->getFragment()Landroidx/fragment/app/Fragment;

    move-result-object v3

    const-string v4, "null cannot be cast to non-null type androidx.fragment.app.Fragment"

    invoke-static {v3, v4}, Lw5/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, v0, v3}, Lcom/swmansion/rnscreens/n;->i(Landroidx/fragment/app/E;Landroidx/fragment/app/Fragment;)V

    iget-object v3, p0, Lcom/swmansion/rnscreens/n;->m:Ljava/util/ArrayList;

    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v5

    sub-int/2addr v5, v1

    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/swmansion/rnscreens/r;

    invoke-interface {v1}, Lcom/swmansion/rnscreens/g;->e()Landroidx/fragment/app/Fragment;

    move-result-object v1

    invoke-direct {p0, v0, v1}, Lcom/swmansion/rnscreens/n;->f(Landroidx/fragment/app/E;Landroidx/fragment/app/Fragment;)V

    invoke-virtual {v2}, Lcom/swmansion/rnscreens/l;->getFragment()Landroidx/fragment/app/Fragment;

    move-result-object v1

    invoke-static {v1, v4}, Lw5/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, v0, v1}, Lcom/swmansion/rnscreens/n;->f(Landroidx/fragment/app/E;Landroidx/fragment/app/Fragment;)V

    invoke-virtual {v0}, Landroidx/fragment/app/E;->j()V

    return-void

    :cond_0
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "[RNScreens] Unable to run transition for less than 2 screens."

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method protected final g()Landroidx/fragment/app/E;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/swmansion/rnscreens/n;->n:Landroidx/fragment/app/w;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroidx/fragment/app/w;->p()Landroidx/fragment/app/E;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroidx/fragment/app/E;->s(Z)Landroidx/fragment/app/E;

    move-result-object v0

    const-string v1, "setReorderingAllowed(...)"

    invoke-static {v0, v1}, Lw5/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "fragment manager is null when creating transaction"

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final getScreenCount()I
    .locals 1

    iget-object v0, p0, Lcom/swmansion/rnscreens/n;->m:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    return v0
.end method

.method public getTopScreen()Lcom/swmansion/rnscreens/l;
    .locals 5

    iget-object v0, p0, Lcom/swmansion/rnscreens/n;->m:Ljava/util/ArrayList;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v3, v1

    check-cast v3, Lcom/swmansion/rnscreens/r;

    invoke-direct {p0, v3}, Lcom/swmansion/rnscreens/n;->k(Lcom/swmansion/rnscreens/r;)Lcom/swmansion/rnscreens/l$a;

    move-result-object v3

    sget-object v4, Lcom/swmansion/rnscreens/l$a;->o:Lcom/swmansion/rnscreens/l$a;

    if-ne v3, v4, :cond_0

    goto :goto_0

    :cond_1
    move-object v1, v2

    :goto_0
    check-cast v1, Lcom/swmansion/rnscreens/r;

    if-eqz v1, :cond_2

    invoke-interface {v1}, Lcom/swmansion/rnscreens/r;->g()Lcom/swmansion/rnscreens/l;

    move-result-object v2

    :cond_2
    return-object v2
.end method

.method public final h()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/swmansion/rnscreens/n;->m:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x2

    if-lt v0, v1, :cond_0

    invoke-virtual {p0}, Lcom/swmansion/rnscreens/n;->g()Landroidx/fragment/app/E;

    move-result-object v0

    iget-object v2, p0, Lcom/swmansion/rnscreens/n;->m:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v3

    sub-int/2addr v3, v1

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/swmansion/rnscreens/r;

    invoke-interface {v1}, Lcom/swmansion/rnscreens/g;->e()Landroidx/fragment/app/Fragment;

    move-result-object v1

    invoke-direct {p0, v0, v1}, Lcom/swmansion/rnscreens/n;->i(Landroidx/fragment/app/E;Landroidx/fragment/app/Fragment;)V

    invoke-virtual {v0}, Landroidx/fragment/app/E;->j()V

    return-void

    :cond_0
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "[RNScreens] Unable to run transition for less than 2 screens."

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final l(I)Lcom/swmansion/rnscreens/l;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/swmansion/rnscreens/n;->m:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/swmansion/rnscreens/r;

    invoke-interface {p1}, Lcom/swmansion/rnscreens/r;->g()Lcom/swmansion/rnscreens/l;

    move-result-object p1

    return-object p1
.end method

.method public final m(I)Lcom/swmansion/rnscreens/r;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/swmansion/rnscreens/n;->m:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    const-string v0, "get(...)"

    invoke-static {p1, v0}, Lw5/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lcom/swmansion/rnscreens/r;

    return-object p1
.end method

.method public n(Lcom/swmansion/rnscreens/r;)Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/swmansion/rnscreens/n;->m:Ljava/util/ArrayList;

    invoke-static {v0, p1}, Lj5/n;->D(Ljava/lang/Iterable;Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final o()V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/swmansion/rnscreens/n;->v()V

    return-void
.end method

.method protected onAttachedToWindow()V
    .locals 1

    invoke-super {p0}, Landroid/view/ViewGroup;->onAttachedToWindow()V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/swmansion/rnscreens/n;->o:Z

    invoke-direct {p0}, Lcom/swmansion/rnscreens/n;->z()V

    return-void
.end method

.method protected onDetachedFromWindow()V
    .locals 2

    iget-object v0, p0, Lcom/swmansion/rnscreens/n;->n:Landroidx/fragment/app/w;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroidx/fragment/app/w;->I0()Z

    move-result v1

    if-nez v1, :cond_0

    invoke-direct {p0, v0}, Lcom/swmansion/rnscreens/n;->x(Landroidx/fragment/app/w;)V

    invoke-virtual {v0}, Landroidx/fragment/app/w;->f0()Z

    :cond_0
    iget-object v0, p0, Lcom/swmansion/rnscreens/n;->s:Lcom/swmansion/rnscreens/r;

    if-eqz v0, :cond_1

    invoke-interface {v0, p0}, Lcom/swmansion/rnscreens/r;->a(Lcom/swmansion/rnscreens/n;)V

    :cond_1
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/swmansion/rnscreens/n;->s:Lcom/swmansion/rnscreens/r;

    invoke-super {p0}, Landroid/view/ViewGroup;->onDetachedFromWindow()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/swmansion/rnscreens/n;->o:Z

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    :goto_0
    const/4 v1, -0x1

    if-ge v1, v0, :cond_2

    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->removeViewAt(I)V

    add-int/lit8 v0, v0, -0x1

    goto :goto_0

    :cond_2
    return-void
.end method

.method protected onLayout(ZIIII)V
    .locals 1

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result p1

    const/4 p2, 0x0

    move p3, p2

    :goto_0
    if-ge p3, p1, :cond_0

    invoke-virtual {p0, p3}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object p4

    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result p5

    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v0

    invoke-virtual {p4, p2, p2, p5, v0}, Landroid/view/View;->layout(IIII)V

    add-int/lit8 p3, p3, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method protected onMeasure(II)V
    .locals 3

    invoke-super {p0, p1, p2}, Landroid/view/View;->onMeasure(II)V

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    invoke-virtual {p0, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v2

    invoke-virtual {v2, p1, p2}, Landroid/view/View;->measure(II)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method protected p()V
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/swmansion/rnscreens/n;->getTopScreen()Lcom/swmansion/rnscreens/l;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/swmansion/rnscreens/l;->getFragmentWrapper()Lcom/swmansion/rnscreens/r;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lcom/swmansion/rnscreens/r;->k()V

    :cond_0
    return-void
.end method

.method public final q()V
    .locals 4

    .line 1
    invoke-virtual {p0}, Lcom/swmansion/rnscreens/n;->getTopScreen()Lcom/swmansion/rnscreens/l;

    move-result-object v0

    const-string v1, "null cannot be cast to non-null type com.swmansion.rnscreens.Screen"

    invoke-static {v0, v1}, Lw5/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    instance-of v1, v1, Lcom/facebook/react/bridge/ReactContext;

    if-eqz v1, :cond_0

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Lcom/facebook/react/uimanager/k0;->e(Landroid/content/Context;)I

    move-result v1

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v2

    const-string v3, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext"

    invoke-static {v2, v3}, Lw5/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v2, Lcom/facebook/react/bridge/ReactContext;

    invoke-virtual {v0}, Landroid/view/View;->getId()I

    move-result v3

    invoke-static {v2, v3}, Lcom/facebook/react/uimanager/k0;->c(Lcom/facebook/react/bridge/ReactContext;I)Lcom/facebook/react/uimanager/events/e;

    move-result-object v2

    if-eqz v2, :cond_0

    new-instance v3, Lc5/g;

    invoke-virtual {v0}, Landroid/view/View;->getId()I

    move-result v0

    invoke-direct {v3, v1, v0}, Lc5/g;-><init>(II)V

    invoke-interface {v2, v3}, Lcom/facebook/react/uimanager/events/e;->c(Lcom/facebook/react/uimanager/events/d;)V

    :cond_0
    return-void
.end method

.method public removeView(Landroid/view/View;)V
    .locals 3

    const-string v0, "view"

    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getFocusedChild()Landroid/view/View;

    move-result-object v0

    if-ne p1, v0, :cond_0

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    const-string v1, "input_method"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    const-string v1, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager"

    invoke-static {v0, v1}, Lw5/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Landroid/view/inputmethod/InputMethodManager;

    invoke-virtual {p0}, Landroid/view/View;->getWindowToken()Landroid/os/IBinder;

    move-result-object v1

    const/4 v2, 0x2

    invoke-virtual {v0, v1, v2}, Landroid/view/inputmethod/InputMethodManager;->hideSoftInputFromWindow(Landroid/os/IBinder;I)Z

    :cond_0
    invoke-super {p0, p1}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    return-void
.end method

.method public requestLayout()V
    .locals 3

    invoke-super {p0}, Landroid/view/View;->requestLayout()V

    iget-boolean v0, p0, Lcom/swmansion/rnscreens/n;->q:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/swmansion/rnscreens/n;->r:Lm2/a;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/swmansion/rnscreens/n;->q:Z

    invoke-static {}, Lcom/facebook/react/modules/core/a;->h()Lcom/facebook/react/modules/core/a;

    move-result-object v0

    sget-object v1, Lcom/facebook/react/modules/core/a$b;->p:Lcom/facebook/react/modules/core/a$b;

    iget-object v2, p0, Lcom/swmansion/rnscreens/n;->r:Lm2/a;

    invoke-virtual {v0, v1, v2}, Lcom/facebook/react/modules/core/a;->m(Lcom/facebook/react/modules/core/a$b;Landroid/view/Choreographer$FrameCallback;)V

    :cond_0
    return-void
.end method

.method public t()V
    .locals 10

    .line 1
    invoke-virtual {p0}, Lcom/swmansion/rnscreens/n;->g()Landroidx/fragment/app/E;

    move-result-object v0

    iget-object v1, p0, Lcom/swmansion/rnscreens/n;->n:Landroidx/fragment/app/w;

    if-eqz v1, :cond_9

    invoke-virtual {v1}, Landroidx/fragment/app/w;->v0()Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/util/Collection;

    new-instance v2, Ljava/util/HashSet;

    invoke-direct {v2, v1}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    iget-object v1, p0, Lcom/swmansion/rnscreens/n;->m:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/swmansion/rnscreens/r;

    invoke-static {v3}, Lw5/k;->c(Ljava/lang/Object;)V

    invoke-direct {p0, v3}, Lcom/swmansion/rnscreens/n;->k(Lcom/swmansion/rnscreens/r;)Lcom/swmansion/rnscreens/l$a;

    move-result-object v4

    sget-object v5, Lcom/swmansion/rnscreens/l$a;->m:Lcom/swmansion/rnscreens/l$a;

    if-ne v4, v5, :cond_0

    invoke-interface {v3}, Lcom/swmansion/rnscreens/g;->e()Landroidx/fragment/app/Fragment;

    move-result-object v4

    invoke-virtual {v4}, Landroidx/fragment/app/Fragment;->isAdded()Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-interface {v3}, Lcom/swmansion/rnscreens/g;->e()Landroidx/fragment/app/Fragment;

    move-result-object v4

    invoke-direct {p0, v0, v4}, Lcom/swmansion/rnscreens/n;->i(Landroidx/fragment/app/E;Landroidx/fragment/app/Fragment;)V

    :cond_0
    invoke-interface {v3}, Lcom/swmansion/rnscreens/g;->e()Landroidx/fragment/app/Fragment;

    move-result-object v3

    invoke-interface {v2, v3}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    const/4 v3, 0x1

    xor-int/2addr v1, v3

    const/4 v4, 0x0

    if-eqz v1, :cond_3

    new-array v1, v4, [Landroidx/fragment/app/Fragment;

    invoke-interface {v2, v1}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [Landroidx/fragment/app/Fragment;

    array-length v2, v1

    move v5, v4

    :goto_1
    if-ge v5, v2, :cond_3

    aget-object v6, v1, v5

    instance-of v7, v6, Lcom/swmansion/rnscreens/q;

    if-eqz v7, :cond_2

    move-object v7, v6

    check-cast v7, Lcom/swmansion/rnscreens/q;

    invoke-virtual {v7}, Lcom/swmansion/rnscreens/q;->g()Lcom/swmansion/rnscreens/l;

    move-result-object v7

    invoke-virtual {v7}, Lcom/swmansion/rnscreens/l;->getContainer()Lcom/swmansion/rnscreens/n;

    move-result-object v7

    if-nez v7, :cond_2

    invoke-direct {p0, v0, v6}, Lcom/swmansion/rnscreens/n;->i(Landroidx/fragment/app/E;Landroidx/fragment/app/Fragment;)V

    :cond_2
    add-int/lit8 v5, v5, 0x1

    goto :goto_1

    :cond_3
    invoke-virtual {p0}, Lcom/swmansion/rnscreens/n;->getTopScreen()Lcom/swmansion/rnscreens/l;

    move-result-object v1

    if-nez v1, :cond_4

    move v1, v3

    goto :goto_2

    :cond_4
    move v1, v4

    :goto_2
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    iget-object v5, p0, Lcom/swmansion/rnscreens/n;->m:Ljava/util/ArrayList;

    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_3
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_7

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/swmansion/rnscreens/r;

    invoke-static {v6}, Lw5/k;->c(Ljava/lang/Object;)V

    invoke-direct {p0, v6}, Lcom/swmansion/rnscreens/n;->k(Lcom/swmansion/rnscreens/r;)Lcom/swmansion/rnscreens/l$a;

    move-result-object v7

    sget-object v8, Lcom/swmansion/rnscreens/l$a;->m:Lcom/swmansion/rnscreens/l$a;

    if-eq v7, v8, :cond_5

    invoke-interface {v6}, Lcom/swmansion/rnscreens/g;->e()Landroidx/fragment/app/Fragment;

    move-result-object v9

    invoke-virtual {v9}, Landroidx/fragment/app/Fragment;->isAdded()Z

    move-result v9

    if-nez v9, :cond_5

    invoke-interface {v6}, Lcom/swmansion/rnscreens/g;->e()Landroidx/fragment/app/Fragment;

    move-result-object v4

    invoke-direct {p0, v0, v4}, Lcom/swmansion/rnscreens/n;->f(Landroidx/fragment/app/E;Landroidx/fragment/app/Fragment;)V

    move v4, v3

    goto :goto_4

    :cond_5
    if-eq v7, v8, :cond_6

    if-eqz v4, :cond_6

    invoke-interface {v6}, Lcom/swmansion/rnscreens/g;->e()Landroidx/fragment/app/Fragment;

    move-result-object v7

    invoke-direct {p0, v0, v7}, Lcom/swmansion/rnscreens/n;->i(Landroidx/fragment/app/E;Landroidx/fragment/app/Fragment;)V

    invoke-virtual {v2, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_6
    :goto_4
    invoke-interface {v6}, Lcom/swmansion/rnscreens/r;->g()Lcom/swmansion/rnscreens/l;

    move-result-object v6

    invoke-virtual {v6, v1}, Lcom/swmansion/rnscreens/l;->setTransitioning(Z)V

    goto :goto_3

    :cond_7
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_5
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_8

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/swmansion/rnscreens/r;

    invoke-interface {v2}, Lcom/swmansion/rnscreens/g;->e()Landroidx/fragment/app/Fragment;

    move-result-object v2

    invoke-direct {p0, v0, v2}, Lcom/swmansion/rnscreens/n;->f(Landroidx/fragment/app/E;Landroidx/fragment/app/Fragment;)V

    goto :goto_5

    :cond_8
    invoke-virtual {v0}, Landroidx/fragment/app/E;->j()V

    return-void

    :cond_9
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "fragment manager is null when performing update in ScreenContainer"

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final u()V
    .locals 2

    .line 1
    iget-boolean v0, p0, Lcom/swmansion/rnscreens/n;->p:Z

    if-eqz v0, :cond_1

    iget-boolean v0, p0, Lcom/swmansion/rnscreens/n;->o:Z

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/swmansion/rnscreens/n;->n:Landroidx/fragment/app/w;

    if-eqz v0, :cond_1

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroidx/fragment/app/w;->I0()Z

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/swmansion/rnscreens/n;->p:Z

    invoke-virtual {p0}, Lcom/swmansion/rnscreens/n;->t()V

    invoke-virtual {p0}, Lcom/swmansion/rnscreens/n;->p()V

    :cond_1
    :goto_0
    return-void
.end method

.method protected final v()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/swmansion/rnscreens/n;->p:Z

    invoke-virtual {p0}, Lcom/swmansion/rnscreens/n;->u()V

    return-void
.end method

.method public w()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/swmansion/rnscreens/n;->m:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/swmansion/rnscreens/r;

    invoke-interface {v1}, Lcom/swmansion/rnscreens/r;->g()Lcom/swmansion/rnscreens/l;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Lcom/swmansion/rnscreens/l;->setContainer(Lcom/swmansion/rnscreens/n;)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/swmansion/rnscreens/n;->m:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    invoke-direct {p0}, Lcom/swmansion/rnscreens/n;->r()V

    return-void
.end method

.method public y(I)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/swmansion/rnscreens/n;->m:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/swmansion/rnscreens/r;

    invoke-interface {v0}, Lcom/swmansion/rnscreens/r;->g()Lcom/swmansion/rnscreens/l;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/swmansion/rnscreens/l;->setContainer(Lcom/swmansion/rnscreens/n;)V

    iget-object v0, p0, Lcom/swmansion/rnscreens/n;->m:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    invoke-direct {p0}, Lcom/swmansion/rnscreens/n;->r()V

    return-void
.end method
