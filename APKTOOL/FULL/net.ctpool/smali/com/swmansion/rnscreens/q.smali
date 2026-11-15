.class public Lcom/swmansion/rnscreens/q;
.super Landroidx/fragment/app/Fragment;
.source "SourceFile"

# interfaces
.implements Lcom/swmansion/rnscreens/r;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/swmansion/rnscreens/q$a;,
        Lcom/swmansion/rnscreens/q$b;,
        Lcom/swmansion/rnscreens/q$c;,
        Lcom/swmansion/rnscreens/q$d;
    }
.end annotation


# static fields
.field public static final t:Lcom/swmansion/rnscreens/q$a;


# instance fields
.field public m:Lcom/swmansion/rnscreens/l;

.field private final n:Ljava/util/List;

.field private o:Z

.field private p:F

.field private q:Z

.field private r:Z

.field private s:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/swmansion/rnscreens/q$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/swmansion/rnscreens/q$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/swmansion/rnscreens/q;->t:Lcom/swmansion/rnscreens/q$a;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Landroidx/fragment/app/Fragment;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/swmansion/rnscreens/q;->n:Ljava/util/List;

    const/high16 v0, -0x40800000    # -1.0f

    iput v0, p0, Lcom/swmansion/rnscreens/q;->p:F

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/swmansion/rnscreens/q;->q:Z

    iput-boolean v0, p0, Lcom/swmansion/rnscreens/q;->r:Z

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Screen fragments should never be restored. Follow instructions from https://github.com/software-mansion/react-native-screens/issues/17#issuecomment-424704067 to properly configure your main activity."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public constructor <init>(Lcom/swmansion/rnscreens/l;)V
    .locals 1

    .line 2
    const-string v0, "screenView"

    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Landroidx/fragment/app/Fragment;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/swmansion/rnscreens/q;->n:Ljava/util/List;

    const/high16 v0, -0x40800000    # -1.0f

    iput v0, p0, Lcom/swmansion/rnscreens/q;->p:F

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/swmansion/rnscreens/q;->q:Z

    iput-boolean v0, p0, Lcom/swmansion/rnscreens/q;->r:Z

    invoke-virtual {p0, p1}, Lcom/swmansion/rnscreens/q;->G(Lcom/swmansion/rnscreens/l;)V

    return-void
.end method

.method private final B(Z)V
    .locals 2

    .line 1
    xor-int/lit8 v0, p1, 0x1

    iput-boolean v0, p0, Lcom/swmansion/rnscreens/q;->s:Z

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getParentFragment()Landroidx/fragment/app/Fragment;

    move-result-object v0

    if-eqz v0, :cond_0

    instance-of v1, v0, Lcom/swmansion/rnscreens/q;

    if-eqz v1, :cond_3

    check-cast v0, Lcom/swmansion/rnscreens/q;

    iget-boolean v0, v0, Lcom/swmansion/rnscreens/q;->s:Z

    if-nez v0, :cond_3

    :cond_0
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->isResumed()Z

    move-result v0

    if-eqz v0, :cond_1

    new-instance v0, Lcom/swmansion/rnscreens/p;

    invoke-direct {v0, p1, p0}, Lcom/swmansion/rnscreens/p;-><init>(ZLcom/swmansion/rnscreens/q;)V

    invoke-static {v0}, Lcom/facebook/react/bridge/UiThreadUtil;->runOnUiThread(Ljava/lang/Runnable;)Z

    goto :goto_0

    :cond_1
    if-eqz p1, :cond_2

    invoke-direct {p0}, Lcom/swmansion/rnscreens/q;->x()V

    goto :goto_0

    :cond_2
    invoke-direct {p0}, Lcom/swmansion/rnscreens/q;->z()V

    :cond_3
    :goto_0
    return-void
.end method

.method private static final C(ZLcom/swmansion/rnscreens/q;)V
    .locals 1

    .line 1
    const-string v0, "this$0"

    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p0, :cond_0

    invoke-direct {p1}, Lcom/swmansion/rnscreens/q;->w()V

    goto :goto_0

    :cond_0
    invoke-direct {p1}, Lcom/swmansion/rnscreens/q;->y()V

    :goto_0
    return-void
.end method

.method protected static final F(Landroid/view/View;)Landroid/view/View;
    .locals 1

    .line 1
    sget-object v0, Lcom/swmansion/rnscreens/q;->t:Lcom/swmansion/rnscreens/q$a;

    invoke-virtual {v0, p0}, Lcom/swmansion/rnscreens/q$a;->b(Landroid/view/View;)Landroid/view/View;

    move-result-object p0

    return-object p0
.end method

.method private final H()V
    .locals 4

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/j;

    move-result-object v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/swmansion/rnscreens/q;->o:Z

    return-void

    :cond_0
    sget-object v1, Lcom/swmansion/rnscreens/C;->a:Lcom/swmansion/rnscreens/C;

    invoke-virtual {p0}, Lcom/swmansion/rnscreens/q;->g()Lcom/swmansion/rnscreens/l;

    move-result-object v2

    invoke-virtual {p0}, Lcom/swmansion/rnscreens/q;->f()Lcom/facebook/react/bridge/ReactContext;

    move-result-object v3

    invoke-virtual {v1, v2, v0, v3}, Lcom/swmansion/rnscreens/C;->w(Lcom/swmansion/rnscreens/l;Landroid/app/Activity;Lcom/facebook/react/bridge/ReactContext;)V

    return-void
.end method

.method public static synthetic s(ZLcom/swmansion/rnscreens/q;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/swmansion/rnscreens/q;->C(ZLcom/swmansion/rnscreens/q;)V

    return-void
.end method

.method private final w()V
    .locals 2

    .line 1
    sget-object v0, Lcom/swmansion/rnscreens/q$b;->m:Lcom/swmansion/rnscreens/q$b;

    invoke-virtual {p0, v0, p0}, Lcom/swmansion/rnscreens/q;->v(Lcom/swmansion/rnscreens/q$b;Lcom/swmansion/rnscreens/r;)V

    const/high16 v0, 0x3f800000    # 1.0f

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Lcom/swmansion/rnscreens/q;->A(FZ)V

    return-void
.end method

.method private final x()V
    .locals 2

    .line 1
    sget-object v0, Lcom/swmansion/rnscreens/q$b;->o:Lcom/swmansion/rnscreens/q$b;

    invoke-virtual {p0, v0, p0}, Lcom/swmansion/rnscreens/q;->v(Lcom/swmansion/rnscreens/q$b;Lcom/swmansion/rnscreens/r;)V

    const/high16 v0, 0x3f800000    # 1.0f

    const/4 v1, 0x1

    invoke-virtual {p0, v0, v1}, Lcom/swmansion/rnscreens/q;->A(FZ)V

    return-void
.end method

.method private final y()V
    .locals 2

    .line 1
    sget-object v0, Lcom/swmansion/rnscreens/q$b;->n:Lcom/swmansion/rnscreens/q$b;

    invoke-virtual {p0, v0, p0}, Lcom/swmansion/rnscreens/q;->v(Lcom/swmansion/rnscreens/q$b;Lcom/swmansion/rnscreens/r;)V

    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Lcom/swmansion/rnscreens/q;->A(FZ)V

    return-void
.end method

.method private final z()V
    .locals 2

    .line 1
    sget-object v0, Lcom/swmansion/rnscreens/q$b;->p:Lcom/swmansion/rnscreens/q$b;

    invoke-virtual {p0, v0, p0}, Lcom/swmansion/rnscreens/q;->v(Lcom/swmansion/rnscreens/q$b;Lcom/swmansion/rnscreens/r;)V

    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-virtual {p0, v0, v1}, Lcom/swmansion/rnscreens/q;->A(FZ)V

    return-void
.end method


# virtual methods
.method public A(FZ)V
    .locals 9

    .line 1
    instance-of v0, p0, Lcom/swmansion/rnscreens/u;

    if-eqz v0, :cond_2

    iget v0, p0, Lcom/swmansion/rnscreens/q;->p:F

    cmpg-float v0, v0, p1

    if-nez v0, :cond_0

    goto :goto_2

    :cond_0
    const/high16 v0, 0x3f800000    # 1.0f

    invoke-static {v0, p1}, Ljava/lang/Math;->min(FF)F

    move-result p1

    const/4 v0, 0x0

    invoke-static {v0, p1}, Ljava/lang/Math;->max(FF)F

    move-result p1

    iput p1, p0, Lcom/swmansion/rnscreens/q;->p:F

    sget-object v0, Lcom/swmansion/rnscreens/q;->t:Lcom/swmansion/rnscreens/q$a;

    invoke-virtual {v0, p1}, Lcom/swmansion/rnscreens/q$a;->a(F)S

    move-result v7

    invoke-virtual {p0}, Lcom/swmansion/rnscreens/q;->g()Lcom/swmansion/rnscreens/l;

    move-result-object p1

    invoke-virtual {p1}, Lcom/swmansion/rnscreens/l;->getContainer()Lcom/swmansion/rnscreens/n;

    move-result-object p1

    instance-of v0, p1, Lcom/swmansion/rnscreens/t;

    if-eqz v0, :cond_1

    check-cast p1, Lcom/swmansion/rnscreens/t;

    invoke-virtual {p1}, Lcom/swmansion/rnscreens/t;->getGoingForward()Z

    move-result p1

    :goto_0
    move v6, p1

    goto :goto_1

    :cond_1
    const/4 p1, 0x0

    goto :goto_0

    :goto_1
    invoke-virtual {p0}, Lcom/swmansion/rnscreens/q;->g()Lcom/swmansion/rnscreens/l;

    move-result-object p1

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    const-string v0, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext"

    invoke-static {p1, v0}, Lw5/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lcom/facebook/react/bridge/ReactContext;

    invoke-virtual {p0}, Lcom/swmansion/rnscreens/q;->g()Lcom/swmansion/rnscreens/l;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->getId()I

    move-result v0

    invoke-static {p1, v0}, Lcom/facebook/react/uimanager/k0;->c(Lcom/facebook/react/bridge/ReactContext;I)Lcom/facebook/react/uimanager/events/e;

    move-result-object v0

    if-eqz v0, :cond_2

    new-instance v8, Lc5/h;

    invoke-static {p1}, Lcom/facebook/react/uimanager/k0;->e(Landroid/content/Context;)I

    move-result v2

    invoke-virtual {p0}, Lcom/swmansion/rnscreens/q;->g()Lcom/swmansion/rnscreens/l;

    move-result-object p1

    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v3

    iget v4, p0, Lcom/swmansion/rnscreens/q;->p:F

    move-object v1, v8

    move v5, p2

    invoke-direct/range {v1 .. v7}, Lc5/h;-><init>(IIFZZS)V

    invoke-interface {v0, v8}, Lcom/facebook/react/uimanager/events/e;->c(Lcom/facebook/react/uimanager/events/d;)V

    :cond_2
    :goto_2
    return-void
.end method

.method public D()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lcom/swmansion/rnscreens/q;->B(Z)V

    return-void
.end method

.method public E()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/swmansion/rnscreens/q;->B(Z)V

    return-void
.end method

.method public G(Lcom/swmansion/rnscreens/l;)V
    .locals 1

    .line 1
    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/swmansion/rnscreens/q;->m:Lcom/swmansion/rnscreens/l;

    return-void
.end method

.method public a(Lcom/swmansion/rnscreens/n;)V
    .locals 1

    .line 1
    const-string v0, "container"

    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/swmansion/rnscreens/q;->i()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    return-void
.end method

.method public c(Lcom/swmansion/rnscreens/q$b;)V
    .locals 3

    .line 1
    const-string v0, "event"

    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/swmansion/rnscreens/q$d;->a:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v0, p1

    const/4 v0, 0x0

    const/4 v1, 0x1

    if-eq p1, v1, :cond_3

    const/4 v2, 0x2

    if-eq p1, v2, :cond_2

    const/4 v0, 0x3

    if-eq p1, v0, :cond_1

    const/4 v0, 0x4

    if-eq p1, v0, :cond_0

    goto :goto_0

    :cond_0
    iput-boolean v1, p0, Lcom/swmansion/rnscreens/q;->r:Z

    goto :goto_0

    :cond_1
    iput-boolean v1, p0, Lcom/swmansion/rnscreens/q;->q:Z

    goto :goto_0

    :cond_2
    iput-boolean v0, p0, Lcom/swmansion/rnscreens/q;->r:Z

    goto :goto_0

    :cond_3
    iput-boolean v0, p0, Lcom/swmansion/rnscreens/q;->q:Z

    :goto_0
    return-void
.end method

.method public d()Landroid/app/Activity;
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/j;

    move-result-object v0

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    invoke-virtual {p0}, Lcom/swmansion/rnscreens/q;->g()Lcom/swmansion/rnscreens/l;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    instance-of v1, v0, Lcom/facebook/react/bridge/ReactContext;

    if-eqz v1, :cond_1

    check-cast v0, Lcom/facebook/react/bridge/ReactContext;

    invoke-virtual {v0}, Lcom/facebook/react/bridge/ReactContext;->getCurrentActivity()Landroid/app/Activity;

    move-result-object v1

    if-eqz v1, :cond_1

    invoke-virtual {v0}, Lcom/facebook/react/bridge/ReactContext;->getCurrentActivity()Landroid/app/Activity;

    move-result-object v0

    return-object v0

    :cond_1
    invoke-virtual {p0}, Lcom/swmansion/rnscreens/q;->g()Lcom/swmansion/rnscreens/l;

    move-result-object v0

    invoke-virtual {v0}, Lcom/swmansion/rnscreens/l;->getContainer()Lcom/swmansion/rnscreens/n;

    move-result-object v0

    :goto_0
    if-eqz v0, :cond_3

    instance-of v1, v0, Lcom/swmansion/rnscreens/l;

    if-eqz v1, :cond_2

    move-object v1, v0

    check-cast v1, Lcom/swmansion/rnscreens/l;

    invoke-virtual {v1}, Lcom/swmansion/rnscreens/l;->getFragment()Landroidx/fragment/app/Fragment;

    move-result-object v1

    if-eqz v1, :cond_2

    invoke-virtual {v1}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/j;

    move-result-object v1

    if-eqz v1, :cond_2

    return-object v1

    :cond_2
    invoke-interface {v0}, Landroid/view/ViewParent;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    goto :goto_0

    :cond_3
    const/4 v0, 0x0

    return-object v0
.end method

.method public e()Landroidx/fragment/app/Fragment;
    .locals 0

    .line 1
    return-object p0
.end method

.method public f()Lcom/facebook/react/bridge/ReactContext;
    .locals 4

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getContext()Landroid/content/Context;

    move-result-object v0

    instance-of v0, v0, Lcom/facebook/react/bridge/ReactContext;

    const-string v1, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext"

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getContext()Landroid/content/Context;

    move-result-object v0

    :goto_0
    invoke-static {v0, v1}, Lw5/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lcom/facebook/react/bridge/ReactContext;

    return-object v0

    :cond_0
    invoke-virtual {p0}, Lcom/swmansion/rnscreens/q;->g()Lcom/swmansion/rnscreens/l;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    instance-of v0, v0, Lcom/facebook/react/bridge/ReactContext;

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Lcom/swmansion/rnscreens/q;->g()Lcom/swmansion/rnscreens/l;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    goto :goto_0

    :cond_1
    invoke-virtual {p0}, Lcom/swmansion/rnscreens/q;->g()Lcom/swmansion/rnscreens/l;

    move-result-object v0

    invoke-virtual {v0}, Lcom/swmansion/rnscreens/l;->getContainer()Lcom/swmansion/rnscreens/n;

    move-result-object v0

    :goto_1
    if-eqz v0, :cond_3

    instance-of v2, v0, Lcom/swmansion/rnscreens/l;

    if-eqz v2, :cond_2

    move-object v2, v0

    check-cast v2, Lcom/swmansion/rnscreens/l;

    invoke-virtual {v2}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v3

    instance-of v3, v3, Lcom/facebook/react/bridge/ReactContext;

    if-eqz v3, :cond_2

    invoke-virtual {v2}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    goto :goto_0

    :cond_2
    invoke-interface {v0}, Landroid/view/ViewParent;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    goto :goto_1

    :cond_3
    const/4 v0, 0x0

    return-object v0
.end method

.method public g()Lcom/swmansion/rnscreens/l;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/swmansion/rnscreens/q;->m:Lcom/swmansion/rnscreens/l;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "screen"

    invoke-static {v0}, Lw5/k;->t(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public h(Lcom/swmansion/rnscreens/q$b;)V
    .locals 4

    .line 1
    const-string v0, "event"

    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/swmansion/rnscreens/q;->i()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, Lcom/swmansion/rnscreens/n;

    invoke-virtual {v3}, Lcom/swmansion/rnscreens/n;->getScreenCount()I

    move-result v3

    if-lez v3, :cond_0

    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_2
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/swmansion/rnscreens/n;

    invoke-virtual {v1}, Lcom/swmansion/rnscreens/n;->getTopScreen()Lcom/swmansion/rnscreens/l;

    move-result-object v1

    if-eqz v1, :cond_2

    invoke-virtual {v1}, Lcom/swmansion/rnscreens/l;->getFragmentWrapper()Lcom/swmansion/rnscreens/r;

    move-result-object v1

    if-eqz v1, :cond_2

    invoke-virtual {p0, p1, v1}, Lcom/swmansion/rnscreens/q;->v(Lcom/swmansion/rnscreens/q$b;Lcom/swmansion/rnscreens/r;)V

    goto :goto_1

    :cond_3
    return-void
.end method

.method public i()Ljava/util/List;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/swmansion/rnscreens/q;->n:Ljava/util/List;

    return-object v0
.end method

.method public j(Lcom/swmansion/rnscreens/n;)V
    .locals 1

    .line 1
    const-string v0, "container"

    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/swmansion/rnscreens/q;->i()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public k()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/swmansion/rnscreens/q;->H()V

    return-void
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 0

    const-string p2, "inflater"

    invoke-static {p1, p2}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/swmansion/rnscreens/q;->g()Lcom/swmansion/rnscreens/l;

    move-result-object p1

    new-instance p2, Landroid/widget/FrameLayout$LayoutParams;

    const/4 p3, -0x1

    invoke-direct {p2, p3, p3}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    invoke-virtual {p1, p2}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getContext()Landroid/content/Context;

    move-result-object p1

    if-eqz p1, :cond_0

    new-instance p2, Lcom/swmansion/rnscreens/q$c;

    invoke-direct {p2, p1}, Lcom/swmansion/rnscreens/q$c;-><init>(Landroid/content/Context;)V

    invoke-virtual {p0}, Lcom/swmansion/rnscreens/q;->g()Lcom/swmansion/rnscreens/l;

    move-result-object p1

    invoke-static {p1}, Lcom/swmansion/rnscreens/q;->F(Landroid/view/View;)Landroid/view/View;

    move-result-object p1

    invoke-virtual {p2, p1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    goto :goto_0

    :cond_0
    const/4 p2, 0x0

    :goto_0
    return-object p2
.end method

.method public onDestroy()V
    .locals 4

    invoke-super {p0}, Landroidx/fragment/app/Fragment;->onDestroy()V

    invoke-virtual {p0}, Lcom/swmansion/rnscreens/q;->g()Lcom/swmansion/rnscreens/l;

    move-result-object v0

    invoke-virtual {v0}, Lcom/swmansion/rnscreens/l;->getContainer()Lcom/swmansion/rnscreens/n;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0, p0}, Lcom/swmansion/rnscreens/n;->n(Lcom/swmansion/rnscreens/r;)Z

    move-result v0

    if-nez v0, :cond_1

    :cond_0
    invoke-virtual {p0}, Lcom/swmansion/rnscreens/q;->g()Lcom/swmansion/rnscreens/l;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    instance-of v1, v0, Lcom/facebook/react/bridge/ReactContext;

    if-eqz v1, :cond_1

    invoke-static {v0}, Lcom/facebook/react/uimanager/k0;->e(Landroid/content/Context;)I

    move-result v1

    check-cast v0, Lcom/facebook/react/bridge/ReactContext;

    invoke-virtual {p0}, Lcom/swmansion/rnscreens/q;->g()Lcom/swmansion/rnscreens/l;

    move-result-object v2

    invoke-virtual {v2}, Landroid/view/View;->getId()I

    move-result v2

    invoke-static {v0, v2}, Lcom/facebook/react/uimanager/k0;->c(Lcom/facebook/react/bridge/ReactContext;I)Lcom/facebook/react/uimanager/events/e;

    move-result-object v0

    if-eqz v0, :cond_1

    new-instance v2, Lc5/g;

    invoke-virtual {p0}, Lcom/swmansion/rnscreens/q;->g()Lcom/swmansion/rnscreens/l;

    move-result-object v3

    invoke-virtual {v3}, Landroid/view/View;->getId()I

    move-result v3

    invoke-direct {v2, v1, v3}, Lc5/g;-><init>(II)V

    invoke-interface {v0, v2}, Lcom/facebook/react/uimanager/events/e;->c(Lcom/facebook/react/uimanager/events/d;)V

    :cond_1
    invoke-virtual {p0}, Lcom/swmansion/rnscreens/q;->i()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->clear()V

    return-void
.end method

.method public onResume()V
    .locals 4

    invoke-super {p0}, Landroidx/fragment/app/Fragment;->onResume()V

    iget-boolean v0, p0, Lcom/swmansion/rnscreens/q;->o:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/swmansion/rnscreens/q;->o:Z

    sget-object v0, Lcom/swmansion/rnscreens/C;->a:Lcom/swmansion/rnscreens/C;

    invoke-virtual {p0}, Lcom/swmansion/rnscreens/q;->g()Lcom/swmansion/rnscreens/l;

    move-result-object v1

    invoke-virtual {p0}, Lcom/swmansion/rnscreens/q;->d()Landroid/app/Activity;

    move-result-object v2

    invoke-virtual {p0}, Lcom/swmansion/rnscreens/q;->f()Lcom/facebook/react/bridge/ReactContext;

    move-result-object v3

    invoke-virtual {v0, v1, v2, v3}, Lcom/swmansion/rnscreens/C;->w(Lcom/swmansion/rnscreens/l;Landroid/app/Activity;Lcom/facebook/react/bridge/ReactContext;)V

    :cond_0
    return-void
.end method

.method public t(Lcom/swmansion/rnscreens/q$b;)Z
    .locals 3

    .line 1
    const-string v0, "event"

    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/swmansion/rnscreens/q$d;->a:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v0, p1

    const/4 v0, 0x1

    if-eq p1, v0, :cond_4

    const/4 v1, 0x2

    if-eq p1, v1, :cond_3

    const/4 v1, 0x3

    const/4 v2, 0x0

    if-eq p1, v1, :cond_2

    const/4 v1, 0x4

    if-ne p1, v1, :cond_1

    iget-boolean p1, p0, Lcom/swmansion/rnscreens/q;->r:Z

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    move v0, v2

    goto :goto_0

    :cond_1
    new-instance p1, Li5/k;

    invoke-direct {p1}, Li5/k;-><init>()V

    throw p1

    :cond_2
    iget-boolean p1, p0, Lcom/swmansion/rnscreens/q;->q:Z

    if-nez p1, :cond_0

    goto :goto_0

    :cond_3
    iget-boolean v0, p0, Lcom/swmansion/rnscreens/q;->r:Z

    goto :goto_0

    :cond_4
    iget-boolean v0, p0, Lcom/swmansion/rnscreens/q;->q:Z

    :goto_0
    return v0
.end method

.method public u()V
    .locals 4

    .line 1
    invoke-virtual {p0}, Lcom/swmansion/rnscreens/q;->g()Lcom/swmansion/rnscreens/l;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    const-string v1, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext"

    invoke-static {v0, v1}, Lw5/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lcom/facebook/react/bridge/ReactContext;

    invoke-static {v0}, Lcom/facebook/react/uimanager/k0;->e(Landroid/content/Context;)I

    move-result v1

    invoke-virtual {p0}, Lcom/swmansion/rnscreens/q;->g()Lcom/swmansion/rnscreens/l;

    move-result-object v2

    invoke-virtual {v2}, Landroid/view/View;->getId()I

    move-result v2

    invoke-static {v0, v2}, Lcom/facebook/react/uimanager/k0;->c(Lcom/facebook/react/bridge/ReactContext;I)Lcom/facebook/react/uimanager/events/e;

    move-result-object v0

    if-eqz v0, :cond_0

    new-instance v2, Lc5/b;

    invoke-virtual {p0}, Lcom/swmansion/rnscreens/q;->g()Lcom/swmansion/rnscreens/l;

    move-result-object v3

    invoke-virtual {v3}, Landroid/view/View;->getId()I

    move-result v3

    invoke-direct {v2, v1, v3}, Lc5/b;-><init>(II)V

    invoke-interface {v0, v2}, Lcom/facebook/react/uimanager/events/e;->c(Lcom/facebook/react/uimanager/events/d;)V

    :cond_0
    return-void
.end method

.method public v(Lcom/swmansion/rnscreens/q$b;Lcom/swmansion/rnscreens/r;)V
    .locals 4

    .line 1
    const-string v0, "event"

    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "fragmentWrapper"

    invoke-static {p2, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p2}, Lcom/swmansion/rnscreens/g;->e()Landroidx/fragment/app/Fragment;

    move-result-object v0

    instance-of v1, v0, Lcom/swmansion/rnscreens/u;

    if-eqz v1, :cond_5

    check-cast v0, Lcom/swmansion/rnscreens/u;

    invoke-virtual {v0, p1}, Lcom/swmansion/rnscreens/q;->t(Lcom/swmansion/rnscreens/q$b;)Z

    move-result v1

    if-eqz v1, :cond_5

    invoke-virtual {v0}, Lcom/swmansion/rnscreens/q;->g()Lcom/swmansion/rnscreens/l;

    move-result-object v0

    invoke-interface {p2, p1}, Lcom/swmansion/rnscreens/o;->c(Lcom/swmansion/rnscreens/q$b;)V

    invoke-static {v0}, Lcom/facebook/react/uimanager/k0;->f(Landroid/view/View;)I

    move-result v1

    sget-object v2, Lcom/swmansion/rnscreens/q$d;->a:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result v3

    aget v2, v2, v3

    const/4 v3, 0x1

    if-eq v2, v3, :cond_3

    const/4 v3, 0x2

    if-eq v2, v3, :cond_2

    const/4 v3, 0x3

    if-eq v2, v3, :cond_1

    const/4 v3, 0x4

    if-ne v2, v3, :cond_0

    new-instance v2, Lc5/f;

    invoke-virtual {v0}, Landroid/view/View;->getId()I

    move-result v0

    invoke-direct {v2, v1, v0}, Lc5/f;-><init>(II)V

    goto :goto_0

    :cond_0
    new-instance p1, Li5/k;

    invoke-direct {p1}, Li5/k;-><init>()V

    throw p1

    :cond_1
    new-instance v2, Lc5/j;

    invoke-virtual {v0}, Landroid/view/View;->getId()I

    move-result v0

    invoke-direct {v2, v1, v0}, Lc5/j;-><init>(II)V

    goto :goto_0

    :cond_2
    new-instance v2, Lc5/e;

    invoke-virtual {v0}, Landroid/view/View;->getId()I

    move-result v0

    invoke-direct {v2, v1, v0}, Lc5/e;-><init>(II)V

    goto :goto_0

    :cond_3
    new-instance v2, Lc5/i;

    invoke-virtual {v0}, Landroid/view/View;->getId()I

    move-result v0

    invoke-direct {v2, v1, v0}, Lc5/i;-><init>(II)V

    :goto_0
    invoke-virtual {p0}, Lcom/swmansion/rnscreens/q;->g()Lcom/swmansion/rnscreens/l;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    const-string v1, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext"

    invoke-static {v0, v1}, Lw5/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lcom/facebook/react/bridge/ReactContext;

    invoke-virtual {p0}, Lcom/swmansion/rnscreens/q;->g()Lcom/swmansion/rnscreens/l;

    move-result-object v1

    invoke-virtual {v1}, Landroid/view/View;->getId()I

    move-result v1

    invoke-static {v0, v1}, Lcom/facebook/react/uimanager/k0;->c(Lcom/facebook/react/bridge/ReactContext;I)Lcom/facebook/react/uimanager/events/e;

    move-result-object v0

    if-eqz v0, :cond_4

    invoke-interface {v0, v2}, Lcom/facebook/react/uimanager/events/e;->c(Lcom/facebook/react/uimanager/events/d;)V

    :cond_4
    invoke-interface {p2, p1}, Lcom/swmansion/rnscreens/o;->h(Lcom/swmansion/rnscreens/q$b;)V

    :cond_5
    return-void
.end method
