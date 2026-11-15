.class public final Lcom/swmansion/rnscreens/t;
.super Lcom/swmansion/rnscreens/n;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/swmansion/rnscreens/t$a;,
        Lcom/swmansion/rnscreens/t$b;,
        Lcom/swmansion/rnscreens/t$c;
    }
.end annotation


# static fields
.field public static final D:Lcom/swmansion/rnscreens/t$a;


# instance fields
.field private A:Z

.field private B:I

.field private C:Z

.field private final t:Ljava/util/ArrayList;

.field private final u:Ljava/util/Set;

.field private final v:Ljava/util/List;

.field private w:Ljava/util/List;

.field private x:Lcom/swmansion/rnscreens/v;

.field private y:Z

.field private z:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/swmansion/rnscreens/t$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/swmansion/rnscreens/t$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/swmansion/rnscreens/t;->D:Lcom/swmansion/rnscreens/t$a;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/swmansion/rnscreens/n;-><init>(Landroid/content/Context;)V

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lcom/swmansion/rnscreens/t;->t:Ljava/util/ArrayList;

    new-instance p1, Ljava/util/HashSet;

    invoke-direct {p1}, Ljava/util/HashSet;-><init>()V

    iput-object p1, p0, Lcom/swmansion/rnscreens/t;->u:Ljava/util/Set;

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lcom/swmansion/rnscreens/t;->v:Ljava/util/List;

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lcom/swmansion/rnscreens/t;->w:Ljava/util/List;

    return-void
.end method

.method public static synthetic A(Lcom/swmansion/rnscreens/r;)V
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/swmansion/rnscreens/t;->H(Lcom/swmansion/rnscreens/r;)V

    return-void
.end method

.method public static final synthetic B(Lcom/swmansion/rnscreens/t;Lcom/swmansion/rnscreens/t$b;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/swmansion/rnscreens/t;->J(Lcom/swmansion/rnscreens/t$b;)V

    return-void
.end method

.method private final E()V
    .locals 4

    .line 1
    invoke-static {p0}, Lcom/facebook/react/uimanager/k0;->f(Landroid/view/View;)I

    move-result v0

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    const-string v2, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext"

    invoke-static {v1, v2}, Lw5/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Lcom/facebook/react/bridge/ReactContext;

    invoke-virtual {p0}, Landroid/view/View;->getId()I

    move-result v2

    invoke-static {v1, v2}, Lcom/facebook/react/uimanager/k0;->c(Lcom/facebook/react/bridge/ReactContext;I)Lcom/facebook/react/uimanager/events/e;

    move-result-object v1

    if-eqz v1, :cond_0

    new-instance v2, Lc5/q;

    invoke-virtual {p0}, Landroid/view/View;->getId()I

    move-result v3

    invoke-direct {v2, v0, v3}, Lc5/q;-><init>(II)V

    invoke-interface {v1, v2}, Lcom/facebook/react/uimanager/events/e;->c(Lcom/facebook/react/uimanager/events/d;)V

    :cond_0
    return-void
.end method

.method private final F()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/swmansion/rnscreens/t;->w:Ljava/util/List;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, p0, Lcom/swmansion/rnscreens/t;->w:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/swmansion/rnscreens/t$b;

    invoke-virtual {v1}, Lcom/swmansion/rnscreens/t$b;->a()V

    iget-object v2, p0, Lcom/swmansion/rnscreens/t;->v:Ljava/util/List;

    invoke-interface {v2, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    return-void
.end method

.method private final G()Lcom/swmansion/rnscreens/t$b;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/swmansion/rnscreens/t;->v:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Lcom/swmansion/rnscreens/t$b;

    invoke-direct {v0, p0}, Lcom/swmansion/rnscreens/t$b;-><init>(Lcom/swmansion/rnscreens/t;)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/swmansion/rnscreens/t;->v:Ljava/util/List;

    invoke-static {v0}, Lj5/n;->j(Ljava/util/List;)I

    move-result v1

    invoke-interface {v0, v1}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/swmansion/rnscreens/t$b;

    :goto_0
    return-object v0
.end method

.method private static final H(Lcom/swmansion/rnscreens/r;)V
    .locals 0

    .line 1
    if-eqz p0, :cond_0

    invoke-interface {p0}, Lcom/swmansion/rnscreens/r;->g()Lcom/swmansion/rnscreens/l;

    move-result-object p0

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Landroid/view/View;->bringToFront()V

    :cond_0
    return-void
.end method

.method private final J(Lcom/swmansion/rnscreens/t$b;)V
    .locals 4

    .line 1
    invoke-virtual {p1}, Lcom/swmansion/rnscreens/t$b;->b()Landroid/graphics/Canvas;

    move-result-object v0

    invoke-static {v0}, Lw5/k;->c(Ljava/lang/Object;)V

    invoke-virtual {p1}, Lcom/swmansion/rnscreens/t$b;->c()Landroid/view/View;

    move-result-object v1

    invoke-virtual {p1}, Lcom/swmansion/rnscreens/t$b;->d()J

    move-result-wide v2

    invoke-super {p0, v0, v1, v2, v3}, Landroid/view/ViewGroup;->drawChild(Landroid/graphics/Canvas;Landroid/view/View;J)Z

    return-void
.end method

.method private final K(Lcom/swmansion/rnscreens/r;)V
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/swmansion/rnscreens/n;->m:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-le v0, v2, :cond_1

    if-eqz p1, :cond_1

    iget-object v0, p0, Lcom/swmansion/rnscreens/t;->x:Lcom/swmansion/rnscreens/v;

    if-eqz v0, :cond_1

    sget-object v3, Lcom/swmansion/rnscreens/t;->D:Lcom/swmansion/rnscreens/t$a;

    invoke-static {v3, v0}, Lcom/swmansion/rnscreens/t$a;->a(Lcom/swmansion/rnscreens/t$a;Lcom/swmansion/rnscreens/r;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/swmansion/rnscreens/n;->m:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v3

    sub-int/2addr v3, v2

    invoke-static {v1, v3}, LC5/g;->l(II)LC5/c;

    move-result-object v2

    invoke-static {v0, v2}, Lj5/n;->V(Ljava/util/List;LC5/c;)Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Lj5/n;->y(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/swmansion/rnscreens/r;

    invoke-interface {v2}, Lcom/swmansion/rnscreens/r;->g()Lcom/swmansion/rnscreens/l;

    move-result-object v3

    const/4 v4, 0x4

    invoke-virtual {v3, v4}, Lcom/swmansion/rnscreens/l;->b(I)V

    invoke-static {v2, p1}, Lw5/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    :cond_1
    invoke-virtual {p0}, Lcom/swmansion/rnscreens/t;->getTopScreen()Lcom/swmansion/rnscreens/l;

    move-result-object p1

    if-eqz p1, :cond_2

    invoke-virtual {p1, v1}, Lcom/swmansion/rnscreens/l;->b(I)V

    :cond_2
    return-void
.end method


# virtual methods
.method protected C(Lcom/swmansion/rnscreens/l;)Lcom/swmansion/rnscreens/u;
    .locals 1

    .line 1
    const-string v0, "screen"

    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/swmansion/rnscreens/u;

    invoke-direct {v0, p1}, Lcom/swmansion/rnscreens/u;-><init>(Lcom/swmansion/rnscreens/l;)V

    return-object v0
.end method

.method public final D(Lcom/swmansion/rnscreens/v;)V
    .locals 1

    .line 1
    const-string v0, "screenFragment"

    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/swmansion/rnscreens/t;->u:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    invoke-virtual {p0}, Lcom/swmansion/rnscreens/n;->v()V

    return-void
.end method

.method public final I()V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/swmansion/rnscreens/t;->y:Z

    if-nez v0, :cond_0

    invoke-direct {p0}, Lcom/swmansion/rnscreens/t;->E()V

    :cond_0
    return-void
.end method

.method public bridge synthetic c(Lcom/swmansion/rnscreens/l;)Lcom/swmansion/rnscreens/r;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/swmansion/rnscreens/t;->C(Lcom/swmansion/rnscreens/l;)Lcom/swmansion/rnscreens/u;

    move-result-object p1

    return-object p1
.end method

.method protected dispatchDraw(Landroid/graphics/Canvas;)V
    .locals 3

    const-string v0, "canvas"

    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1}, Landroid/view/View;->dispatchDraw(Landroid/graphics/Canvas;)V

    iget-object p1, p0, Lcom/swmansion/rnscreens/t;->w:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p1

    iget v0, p0, Lcom/swmansion/rnscreens/t;->B:I

    if-ge p1, v0, :cond_0

    const/4 p1, 0x0

    iput-boolean p1, p0, Lcom/swmansion/rnscreens/t;->A:Z

    :cond_0
    iget-object p1, p0, Lcom/swmansion/rnscreens/t;->w:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p1

    iput p1, p0, Lcom/swmansion/rnscreens/t;->B:I

    iget-boolean p1, p0, Lcom/swmansion/rnscreens/t;->A:Z

    if-eqz p1, :cond_1

    iget-object p1, p0, Lcom/swmansion/rnscreens/t;->w:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p1

    const/4 v0, 0x2

    if-lt p1, v0, :cond_1

    iget-object p1, p0, Lcom/swmansion/rnscreens/t;->w:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    iget-object v2, p0, Lcom/swmansion/rnscreens/t;->w:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    sub-int/2addr v2, v0

    invoke-static {p1, v1, v2}, Ljava/util/Collections;->swap(Ljava/util/List;II)V

    :cond_1
    invoke-direct {p0}, Lcom/swmansion/rnscreens/t;->F()V

    return-void
.end method

.method protected drawChild(Landroid/graphics/Canvas;Landroid/view/View;J)Z
    .locals 2

    const-string v0, "canvas"

    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "child"

    invoke-static {p2, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/swmansion/rnscreens/t;->w:Ljava/util/List;

    invoke-direct {p0}, Lcom/swmansion/rnscreens/t;->G()Lcom/swmansion/rnscreens/t$b;

    move-result-object v1

    invoke-virtual {v1, p1}, Lcom/swmansion/rnscreens/t$b;->e(Landroid/graphics/Canvas;)V

    invoke-virtual {v1, p2}, Lcom/swmansion/rnscreens/t$b;->f(Landroid/view/View;)V

    invoke-virtual {v1, p3, p4}, Lcom/swmansion/rnscreens/t$b;->g(J)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    const/4 p1, 0x1

    return p1
.end method

.method public endViewTransition(Landroid/view/View;)V
    .locals 1

    const-string v0, "view"

    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1}, Landroid/view/ViewGroup;->endViewTransition(Landroid/view/View;)V

    iget-boolean p1, p0, Lcom/swmansion/rnscreens/t;->y:Z

    if-eqz p1, :cond_0

    const/4 p1, 0x0

    iput-boolean p1, p0, Lcom/swmansion/rnscreens/t;->y:Z

    invoke-direct {p0}, Lcom/swmansion/rnscreens/t;->E()V

    :cond_0
    return-void
.end method

.method public final getFragments()Ljava/util/ArrayList;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ArrayList<",
            "Lcom/swmansion/rnscreens/v;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/swmansion/rnscreens/t;->t:Ljava/util/ArrayList;

    return-object v0
.end method

.method public final getGoingForward()Z
    .locals 1

    iget-boolean v0, p0, Lcom/swmansion/rnscreens/t;->C:Z

    return v0
.end method

.method public final getRootScreen()Lcom/swmansion/rnscreens/l;
    .locals 4

    invoke-virtual {p0}, Lcom/swmansion/rnscreens/n;->getScreenCount()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_1

    invoke-virtual {p0, v1}, Lcom/swmansion/rnscreens/n;->m(I)Lcom/swmansion/rnscreens/r;

    move-result-object v2

    iget-object v3, p0, Lcom/swmansion/rnscreens/t;->u:Ljava/util/Set;

    invoke-static {v3, v2}, Lj5/n;->D(Ljava/lang/Iterable;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_0

    invoke-interface {v2}, Lcom/swmansion/rnscreens/r;->g()Lcom/swmansion/rnscreens/l;

    move-result-object v0

    return-object v0

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Stack has no root screen set"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public getTopScreen()Lcom/swmansion/rnscreens/l;
    .locals 1

    iget-object v0, p0, Lcom/swmansion/rnscreens/t;->x:Lcom/swmansion/rnscreens/v;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lcom/swmansion/rnscreens/r;->g()Lcom/swmansion/rnscreens/l;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public n(Lcom/swmansion/rnscreens/r;)Z
    .locals 1

    .line 1
    invoke-super {p0, p1}, Lcom/swmansion/rnscreens/n;->n(Lcom/swmansion/rnscreens/r;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/swmansion/rnscreens/t;->u:Ljava/util/Set;

    invoke-static {v0, p1}, Lj5/n;->D(Ljava/lang/Iterable;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method protected p()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/swmansion/rnscreens/t;->t:Ljava/util/ArrayList;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/swmansion/rnscreens/v;

    invoke-interface {v1}, Lcom/swmansion/rnscreens/r;->k()V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public removeView(Landroid/view/View;)V
    .locals 1

    const-string v0, "view"

    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-boolean v0, p0, Lcom/swmansion/rnscreens/t;->z:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/swmansion/rnscreens/t;->z:Z

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/swmansion/rnscreens/t;->A:Z

    :cond_0
    invoke-super {p0, p1}, Lcom/swmansion/rnscreens/n;->removeView(Landroid/view/View;)V

    return-void
.end method

.method public final setGoingForward(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/swmansion/rnscreens/t;->C:Z

    return-void
.end method

.method public startViewTransition(Landroid/view/View;)V
    .locals 1

    const-string v0, "view"

    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1}, Landroid/view/ViewGroup;->startViewTransition(Landroid/view/View;)V

    const/4 p1, 0x1

    iput-boolean p1, p0, Lcom/swmansion/rnscreens/t;->y:Z

    return-void
.end method

.method public t()V
    .locals 9

    .line 1
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/swmansion/rnscreens/t;->z:Z

    iget-object v1, p0, Lcom/swmansion/rnscreens/n;->m:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    const/4 v2, 0x0

    move-object v3, v2

    move-object v4, v3

    if-ltz v1, :cond_3

    :goto_0
    add-int/lit8 v5, v1, -0x1

    invoke-virtual {p0, v1}, Lcom/swmansion/rnscreens/n;->m(I)Lcom/swmansion/rnscreens/r;

    move-result-object v1

    iget-object v6, p0, Lcom/swmansion/rnscreens/t;->u:Ljava/util/Set;

    invoke-static {v6, v1}, Lj5/n;->D(Ljava/lang/Iterable;Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_1

    if-nez v3, :cond_0

    move-object v3, v1

    goto :goto_1

    :cond_0
    move-object v4, v1

    :goto_1
    sget-object v6, Lcom/swmansion/rnscreens/t;->D:Lcom/swmansion/rnscreens/t$a;

    invoke-static {v6, v1}, Lcom/swmansion/rnscreens/t$a;->a(Lcom/swmansion/rnscreens/t$a;Lcom/swmansion/rnscreens/r;)Z

    move-result v1

    if-nez v1, :cond_1

    goto :goto_2

    :cond_1
    if-gez v5, :cond_2

    goto :goto_2

    :cond_2
    move v1, v5

    goto :goto_0

    :cond_3
    :goto_2
    iget-object v1, p0, Lcom/swmansion/rnscreens/t;->t:Ljava/util/ArrayList;

    invoke-static {v1, v3}, Lj5/n;->D(Ljava/lang/Iterable;Ljava/lang/Object;)Z

    move-result v1

    const/4 v5, 0x1

    if-nez v1, :cond_b

    iget-object v1, p0, Lcom/swmansion/rnscreens/t;->x:Lcom/swmansion/rnscreens/v;

    if-eqz v1, :cond_a

    if-eqz v3, :cond_a

    if-eqz v1, :cond_4

    iget-object v6, p0, Lcom/swmansion/rnscreens/n;->m:Ljava/util/ArrayList;

    invoke-virtual {v6, v1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-ne v1, v5, :cond_4

    move v1, v5

    goto :goto_3

    :cond_4
    move v1, v0

    :goto_3
    invoke-interface {v3}, Lcom/swmansion/rnscreens/r;->g()Lcom/swmansion/rnscreens/l;

    move-result-object v6

    invoke-virtual {v6}, Lcom/swmansion/rnscreens/l;->getReplaceAnimation()Lcom/swmansion/rnscreens/l$b;

    move-result-object v6

    sget-object v7, Lcom/swmansion/rnscreens/l$b;->m:Lcom/swmansion/rnscreens/l$b;

    if-ne v6, v7, :cond_5

    move v6, v5

    goto :goto_4

    :cond_5
    move v6, v0

    :goto_4
    if-nez v1, :cond_7

    if-eqz v6, :cond_6

    goto :goto_5

    :cond_6
    move v1, v0

    goto :goto_6

    :cond_7
    :goto_5
    move v1, v5

    :goto_6
    if-eqz v1, :cond_8

    invoke-interface {v3}, Lcom/swmansion/rnscreens/r;->g()Lcom/swmansion/rnscreens/l;

    move-result-object v6

    :goto_7
    invoke-virtual {v6}, Lcom/swmansion/rnscreens/l;->getStackAnimation()Lcom/swmansion/rnscreens/l$c;

    move-result-object v6

    goto :goto_a

    :cond_8
    iget-object v6, p0, Lcom/swmansion/rnscreens/t;->x:Lcom/swmansion/rnscreens/v;

    if-eqz v6, :cond_9

    invoke-interface {v6}, Lcom/swmansion/rnscreens/r;->g()Lcom/swmansion/rnscreens/l;

    move-result-object v6

    if-eqz v6, :cond_9

    goto :goto_7

    :cond_9
    move-object v6, v2

    goto :goto_a

    :cond_a
    if-nez v1, :cond_d

    if-eqz v3, :cond_d

    sget-object v6, Lcom/swmansion/rnscreens/l$c;->n:Lcom/swmansion/rnscreens/l$c;

    iput-boolean v5, p0, Lcom/swmansion/rnscreens/t;->C:Z

    :goto_8
    move v1, v5

    goto :goto_a

    :cond_b
    iget-object v1, p0, Lcom/swmansion/rnscreens/t;->x:Lcom/swmansion/rnscreens/v;

    if-eqz v1, :cond_d

    invoke-static {v1, v3}, Lw5/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_d

    iget-object v1, p0, Lcom/swmansion/rnscreens/t;->x:Lcom/swmansion/rnscreens/v;

    if-eqz v1, :cond_c

    invoke-interface {v1}, Lcom/swmansion/rnscreens/r;->g()Lcom/swmansion/rnscreens/l;

    move-result-object v1

    if-eqz v1, :cond_c

    invoke-virtual {v1}, Lcom/swmansion/rnscreens/l;->getStackAnimation()Lcom/swmansion/rnscreens/l$c;

    move-result-object v1

    move-object v6, v1

    goto :goto_9

    :cond_c
    move-object v6, v2

    :goto_9
    move v1, v0

    goto :goto_a

    :cond_d
    move-object v6, v2

    goto :goto_8

    :goto_a
    invoke-virtual {p0}, Lcom/swmansion/rnscreens/n;->g()Landroidx/fragment/app/E;

    move-result-object v7

    if-eqz v6, :cond_f

    sget-object v8, Lcom/swmansion/rnscreens/t$c;->a:[I

    invoke-virtual {v6}, Ljava/lang/Enum;->ordinal()I

    move-result v6

    if-eqz v1, :cond_e

    aget v6, v8, v6

    packed-switch v6, :pswitch_data_0

    goto :goto_c

    :pswitch_0
    sget v6, Lcom/swmansion/rnscreens/i;->q:I

    sget v8, Lcom/swmansion/rnscreens/i;->t:I

    goto :goto_b

    :pswitch_1
    sget v6, Lcom/swmansion/rnscreens/i;->e:I

    sget v8, Lcom/swmansion/rnscreens/i;->k:I

    :goto_b
    invoke-virtual {v7, v6, v8}, Landroidx/fragment/app/E;->q(II)Landroidx/fragment/app/E;

    goto :goto_c

    :pswitch_2
    sget v6, Lcom/swmansion/rnscreens/i;->m:I

    sget v8, Lcom/swmansion/rnscreens/i;->l:I

    goto :goto_b

    :pswitch_3
    sget v6, Lcom/swmansion/rnscreens/i;->n:I

    sget v8, Lcom/swmansion/rnscreens/i;->u:I

    goto :goto_b

    :pswitch_4
    sget v6, Lcom/swmansion/rnscreens/i;->p:I

    sget v8, Lcom/swmansion/rnscreens/i;->s:I

    goto :goto_b

    :pswitch_5
    sget v6, Lcom/swmansion/rnscreens/i;->f:I

    sget v8, Lcom/swmansion/rnscreens/i;->g:I

    goto :goto_b

    :pswitch_6
    sget v6, Lcom/swmansion/rnscreens/i;->i:I

    invoke-virtual {v7, v6, v6}, Landroidx/fragment/app/E;->q(II)Landroidx/fragment/app/E;

    goto :goto_c

    :pswitch_7
    sget v6, Lcom/swmansion/rnscreens/i;->a:I

    sget v8, Lcom/swmansion/rnscreens/i;->b:I

    goto :goto_b

    :cond_e
    aget v6, v8, v6

    packed-switch v6, :pswitch_data_1

    goto :goto_c

    :pswitch_8
    sget v6, Lcom/swmansion/rnscreens/i;->o:I

    sget v8, Lcom/swmansion/rnscreens/i;->v:I

    goto :goto_b

    :pswitch_9
    sget v6, Lcom/swmansion/rnscreens/i;->j:I

    sget v8, Lcom/swmansion/rnscreens/i;->h:I

    goto :goto_b

    :pswitch_a
    sget v6, Lcom/swmansion/rnscreens/i;->l:I

    sget v8, Lcom/swmansion/rnscreens/i;->r:I

    goto :goto_b

    :pswitch_b
    sget v6, Lcom/swmansion/rnscreens/i;->c:I

    sget v8, Lcom/swmansion/rnscreens/i;->d:I

    goto :goto_b

    :cond_f
    :goto_c
    iput-boolean v1, p0, Lcom/swmansion/rnscreens/t;->C:Z

    if-eqz v1, :cond_10

    if-eqz v3, :cond_10

    sget-object v1, Lcom/swmansion/rnscreens/t;->D:Lcom/swmansion/rnscreens/t$a;

    invoke-static {v1, v3}, Lcom/swmansion/rnscreens/t$a;->b(Lcom/swmansion/rnscreens/t$a;Lcom/swmansion/rnscreens/r;)Z

    move-result v1

    if-eqz v1, :cond_10

    if-nez v4, :cond_10

    iput-boolean v5, p0, Lcom/swmansion/rnscreens/t;->z:Z

    :cond_10
    iget-object v1, p0, Lcom/swmansion/rnscreens/t;->t:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_11
    :goto_d
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_13

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/swmansion/rnscreens/v;

    iget-object v8, p0, Lcom/swmansion/rnscreens/n;->m:Ljava/util/ArrayList;

    invoke-virtual {v8, v6}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_12

    iget-object v8, p0, Lcom/swmansion/rnscreens/t;->u:Ljava/util/Set;

    invoke-interface {v8, v6}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_11

    :cond_12
    invoke-interface {v6}, Lcom/swmansion/rnscreens/g;->e()Landroidx/fragment/app/Fragment;

    move-result-object v6

    invoke-virtual {v7, v6}, Landroidx/fragment/app/E;->m(Landroidx/fragment/app/Fragment;)Landroidx/fragment/app/E;

    goto :goto_d

    :cond_13
    iget-object v1, p0, Lcom/swmansion/rnscreens/n;->m:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_14
    :goto_e
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_16

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/swmansion/rnscreens/r;

    if-ne v6, v4, :cond_15

    goto :goto_f

    :cond_15
    if-eq v6, v3, :cond_14

    iget-object v8, p0, Lcom/swmansion/rnscreens/t;->u:Ljava/util/Set;

    invoke-static {v8, v6}, Lj5/n;->D(Ljava/lang/Iterable;Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_14

    invoke-interface {v6}, Lcom/swmansion/rnscreens/g;->e()Landroidx/fragment/app/Fragment;

    move-result-object v6

    invoke-virtual {v7, v6}, Landroidx/fragment/app/E;->m(Landroidx/fragment/app/Fragment;)Landroidx/fragment/app/E;

    goto :goto_e

    :cond_16
    :goto_f
    if-eqz v4, :cond_19

    invoke-interface {v4}, Lcom/swmansion/rnscreens/g;->e()Landroidx/fragment/app/Fragment;

    move-result-object v1

    invoke-virtual {v1}, Landroidx/fragment/app/Fragment;->isAdded()Z

    move-result v1

    if-nez v1, :cond_19

    iget-object v1, p0, Lcom/swmansion/rnscreens/n;->m:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_17
    :goto_10
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_1a

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/swmansion/rnscreens/r;

    if-eqz v5, :cond_18

    if-ne v6, v4, :cond_17

    move v5, v0

    :cond_18
    invoke-virtual {p0}, Landroid/view/View;->getId()I

    move-result v8

    invoke-interface {v6}, Lcom/swmansion/rnscreens/g;->e()Landroidx/fragment/app/Fragment;

    move-result-object v6

    invoke-virtual {v7, v8, v6}, Landroidx/fragment/app/E;->b(ILandroidx/fragment/app/Fragment;)Landroidx/fragment/app/E;

    move-result-object v6

    new-instance v8, Lcom/swmansion/rnscreens/s;

    invoke-direct {v8, v3}, Lcom/swmansion/rnscreens/s;-><init>(Lcom/swmansion/rnscreens/r;)V

    invoke-virtual {v6, v8}, Landroidx/fragment/app/E;->p(Ljava/lang/Runnable;)Landroidx/fragment/app/E;

    goto :goto_10

    :cond_19
    if-eqz v3, :cond_1a

    invoke-interface {v3}, Lcom/swmansion/rnscreens/g;->e()Landroidx/fragment/app/Fragment;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->isAdded()Z

    move-result v0

    if-nez v0, :cond_1a

    invoke-virtual {p0}, Landroid/view/View;->getId()I

    move-result v0

    invoke-interface {v3}, Lcom/swmansion/rnscreens/g;->e()Landroidx/fragment/app/Fragment;

    move-result-object v1

    invoke-virtual {v7, v0, v1}, Landroidx/fragment/app/E;->b(ILandroidx/fragment/app/Fragment;)Landroidx/fragment/app/E;

    :cond_1a
    instance-of v0, v3, Lcom/swmansion/rnscreens/v;

    if-eqz v0, :cond_1b

    move-object v2, v3

    check-cast v2, Lcom/swmansion/rnscreens/v;

    :cond_1b
    iput-object v2, p0, Lcom/swmansion/rnscreens/t;->x:Lcom/swmansion/rnscreens/v;

    iget-object v0, p0, Lcom/swmansion/rnscreens/t;->t:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    iget-object v0, p0, Lcom/swmansion/rnscreens/t;->t:Ljava/util/ArrayList;

    iget-object v1, p0, Lcom/swmansion/rnscreens/n;->m:Ljava/util/ArrayList;

    new-instance v2, Ljava/util/ArrayList;

    const/16 v3, 0xa

    invoke-static {v1, v3}, Lj5/n;->q(Ljava/lang/Iterable;I)I

    move-result v3

    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_11
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1c

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/swmansion/rnscreens/r;

    const-string v5, "null cannot be cast to non-null type com.swmansion.rnscreens.ScreenStackFragmentWrapper"

    invoke-static {v3, v5}, Lw5/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v3, Lcom/swmansion/rnscreens/v;

    invoke-interface {v2, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_11

    :cond_1c
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    invoke-direct {p0, v4}, Lcom/swmansion/rnscreens/t;->K(Lcom/swmansion/rnscreens/r;)V

    invoke-virtual {v7}, Landroidx/fragment/app/E;->j()V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x1
        :pswitch_b
        :pswitch_6
        :pswitch_5
        :pswitch_3
        :pswitch_4
        :pswitch_a
        :pswitch_9
        :pswitch_8
    .end packed-switch
.end method

.method public w()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/swmansion/rnscreens/t;->u:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->clear()V

    invoke-super {p0}, Lcom/swmansion/rnscreens/n;->w()V

    return-void
.end method

.method public y(I)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/swmansion/rnscreens/t;->u:Ljava/util/Set;

    invoke-virtual {p0, p1}, Lcom/swmansion/rnscreens/n;->m(I)Lcom/swmansion/rnscreens/r;

    move-result-object v1

    invoke-static {v0}, Lw5/z;->a(Ljava/lang/Object;)Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0, v1}, Ljava/util/Collection;->remove(Ljava/lang/Object;)Z

    invoke-super {p0, p1}, Lcom/swmansion/rnscreens/n;->y(I)V

    return-void
.end method
