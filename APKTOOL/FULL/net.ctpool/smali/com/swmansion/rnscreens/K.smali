.class public final Lcom/swmansion/rnscreens/K;
.super Lcom/facebook/react/views/view/i;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/swmansion/rnscreens/K$a;,
        Lcom/swmansion/rnscreens/K$b;
    }
.end annotation


# instance fields
.field private m:Lcom/swmansion/rnscreens/K$b;

.field private n:Lcom/swmansion/rnscreens/K$a;

.field private o:Ljava/lang/Integer;

.field private p:Ljava/lang/Integer;

.field private q:Ljava/lang/Integer;

.field private r:Ljava/lang/Integer;

.field private s:Ljava/lang/String;

.field private t:Z

.field private u:Z

.field private v:Z

.field private w:Lcom/swmansion/rnscreens/L;

.field private x:Z

.field private final y:I


# direct methods
.method public constructor <init>(Lcom/facebook/react/bridge/ReactContext;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/facebook/react/views/view/i;-><init>(Landroid/content/Context;)V

    sget-object p1, Lcom/swmansion/rnscreens/K$b;->m:Lcom/swmansion/rnscreens/K$b;

    iput-object p1, p0, Lcom/swmansion/rnscreens/K;->m:Lcom/swmansion/rnscreens/K$b;

    sget-object p1, Lcom/swmansion/rnscreens/K$a;->m:Lcom/swmansion/rnscreens/K$a;

    iput-object p1, p0, Lcom/swmansion/rnscreens/K;->n:Lcom/swmansion/rnscreens/K$a;

    const-string p1, ""

    iput-object p1, p0, Lcom/swmansion/rnscreens/K;->s:Ljava/lang/String;

    const/4 p1, 0x1

    iput-boolean p1, p0, Lcom/swmansion/rnscreens/K;->t:Z

    iput-boolean p1, p0, Lcom/swmansion/rnscreens/K;->v:Z

    invoke-static {p0}, Lcom/facebook/react/uimanager/k0;->f(Landroid/view/View;)I

    move-result p1

    iput p1, p0, Lcom/swmansion/rnscreens/K;->y:I

    return-void
.end method

.method private final B()V
    .locals 3

    .line 1
    new-instance v0, Lc5/m;

    iget v1, p0, Lcom/swmansion/rnscreens/K;->y:I

    invoke-virtual {p0}, Landroid/view/View;->getId()I

    move-result v2

    invoke-direct {v0, v1, v2}, Lc5/m;-><init>(II)V

    invoke-direct {p0, v0}, Lcom/swmansion/rnscreens/K;->K(Lcom/facebook/react/uimanager/events/d;)V

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/swmansion/rnscreens/K;->setToolbarElementsVisibility(I)V

    return-void
.end method

.method private final C(Z)V
    .locals 2

    .line 1
    if-eqz p1, :cond_0

    new-instance p1, Lc5/n;

    iget v0, p0, Lcom/swmansion/rnscreens/K;->y:I

    invoke-virtual {p0}, Landroid/view/View;->getId()I

    move-result v1

    invoke-direct {p1, v0, v1}, Lc5/n;-><init>(II)V

    goto :goto_0

    :cond_0
    new-instance p1, Lc5/k;

    iget v0, p0, Lcom/swmansion/rnscreens/K;->y:I

    invoke-virtual {p0}, Landroid/view/View;->getId()I

    move-result v1

    invoke-direct {p1, v0, v1}, Lc5/k;-><init>(II)V

    :goto_0
    invoke-direct {p0, p1}, Lcom/swmansion/rnscreens/K;->K(Lcom/facebook/react/uimanager/events/d;)V

    return-void
.end method

.method private final E()V
    .locals 3

    .line 1
    new-instance v0, Lc5/o;

    iget v1, p0, Lcom/swmansion/rnscreens/K;->y:I

    invoke-virtual {p0}, Landroid/view/View;->getId()I

    move-result v2

    invoke-direct {v0, v1, v2}, Lc5/o;-><init>(II)V

    invoke-direct {p0, v0}, Lcom/swmansion/rnscreens/K;->K(Lcom/facebook/react/uimanager/events/d;)V

    const/16 v0, 0x8

    invoke-direct {p0, v0}, Lcom/swmansion/rnscreens/K;->setToolbarElementsVisibility(I)V

    return-void
.end method

.method private final G(Ljava/lang/String;)V
    .locals 3

    .line 1
    new-instance v0, Lc5/l;

    iget v1, p0, Lcom/swmansion/rnscreens/K;->y:I

    invoke-virtual {p0}, Landroid/view/View;->getId()I

    move-result v2

    invoke-direct {v0, v1, v2, p1}, Lc5/l;-><init>(IILjava/lang/String;)V

    invoke-direct {p0, v0}, Lcom/swmansion/rnscreens/K;->K(Lcom/facebook/react/uimanager/events/d;)V

    return-void
.end method

.method private final H(Ljava/lang/String;)V
    .locals 3

    .line 1
    new-instance v0, Lc5/p;

    iget v1, p0, Lcom/swmansion/rnscreens/K;->y:I

    invoke-virtual {p0}, Landroid/view/View;->getId()I

    move-result v2

    invoke-direct {v0, v1, v2, p1}, Lc5/p;-><init>(IILjava/lang/String;)V

    invoke-direct {p0, v0}, Lcom/swmansion/rnscreens/K;->K(Lcom/facebook/react/uimanager/events/d;)V

    return-void
.end method

.method private final K(Lcom/facebook/react/uimanager/events/d;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    const-string v1, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext"

    invoke-static {v0, v1}, Lw5/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lcom/facebook/react/bridge/ReactContext;

    invoke-virtual {p0}, Landroid/view/View;->getId()I

    move-result v1

    invoke-static {v0, v1}, Lcom/facebook/react/uimanager/k0;->c(Lcom/facebook/react/bridge/ReactContext;I)Lcom/facebook/react/uimanager/events/e;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-interface {v0, p1}, Lcom/facebook/react/uimanager/events/e;->c(Lcom/facebook/react/uimanager/events/d;)V

    :cond_0
    return-void
.end method

.method private static final L(Lcom/swmansion/rnscreens/K;Landroid/view/View;Z)V
    .locals 0

    .line 1
    const-string p1, "this$0"

    invoke-static {p0, p1}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p2}, Lcom/swmansion/rnscreens/K;->C(Z)V

    return-void
.end method

.method private static final M(Lcom/swmansion/rnscreens/K;)Z
    .locals 1

    .line 1
    const-string v0, "this$0"

    invoke-static {p0, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/swmansion/rnscreens/K;->B()V

    const/4 p0, 0x0

    return p0
.end method

.method private static final N(Lcom/swmansion/rnscreens/K;Landroid/view/View;)V
    .locals 0

    .line 1
    const-string p1, "this$0"

    invoke-static {p0, p1}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/swmansion/rnscreens/K;->E()V

    return-void
.end method

.method private final O()V
    .locals 4

    .line 1
    invoke-direct {p0}, Lcom/swmansion/rnscreens/K;->getScreenStackFragment()Lcom/swmansion/rnscreens/u;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/swmansion/rnscreens/u;->K()Lcom/swmansion/rnscreens/c;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_7

    iget-boolean v1, p0, Lcom/swmansion/rnscreens/K;->x:Z

    if-nez v1, :cond_1

    invoke-direct {p0, v0}, Lcom/swmansion/rnscreens/K;->setSearchViewListeners(Landroidx/appcompat/widget/SearchView;)V

    const/4 v1, 0x1

    iput-boolean v1, p0, Lcom/swmansion/rnscreens/K;->x:Z

    :cond_1
    iget-object v1, p0, Lcom/swmansion/rnscreens/K;->m:Lcom/swmansion/rnscreens/K$b;

    iget-object v2, p0, Lcom/swmansion/rnscreens/K;->n:Lcom/swmansion/rnscreens/K$a;

    invoke-virtual {v1, v2}, Lcom/swmansion/rnscreens/K$b;->h(Lcom/swmansion/rnscreens/K$a;)I

    move-result v1

    invoke-virtual {v0, v1}, Landroidx/appcompat/widget/SearchView;->setInputType(I)V

    iget-object v1, p0, Lcom/swmansion/rnscreens/K;->w:Lcom/swmansion/rnscreens/L;

    if-eqz v1, :cond_2

    iget-object v2, p0, Lcom/swmansion/rnscreens/K;->o:Ljava/lang/Integer;

    invoke-virtual {v1, v2}, Lcom/swmansion/rnscreens/L;->h(Ljava/lang/Integer;)V

    :cond_2
    iget-object v1, p0, Lcom/swmansion/rnscreens/K;->w:Lcom/swmansion/rnscreens/L;

    if-eqz v1, :cond_3

    iget-object v2, p0, Lcom/swmansion/rnscreens/K;->p:Ljava/lang/Integer;

    invoke-virtual {v1, v2}, Lcom/swmansion/rnscreens/L;->i(Ljava/lang/Integer;)V

    :cond_3
    iget-object v1, p0, Lcom/swmansion/rnscreens/K;->w:Lcom/swmansion/rnscreens/L;

    if-eqz v1, :cond_4

    iget-object v2, p0, Lcom/swmansion/rnscreens/K;->q:Ljava/lang/Integer;

    invoke-virtual {v1, v2}, Lcom/swmansion/rnscreens/L;->e(Ljava/lang/Integer;)V

    :cond_4
    iget-object v1, p0, Lcom/swmansion/rnscreens/K;->w:Lcom/swmansion/rnscreens/L;

    if-eqz v1, :cond_5

    iget-object v2, p0, Lcom/swmansion/rnscreens/K;->r:Ljava/lang/Integer;

    invoke-virtual {v1, v2}, Lcom/swmansion/rnscreens/L;->f(Ljava/lang/Integer;)V

    :cond_5
    iget-object v1, p0, Lcom/swmansion/rnscreens/K;->w:Lcom/swmansion/rnscreens/L;

    if-eqz v1, :cond_6

    iget-object v2, p0, Lcom/swmansion/rnscreens/K;->s:Ljava/lang/String;

    iget-boolean v3, p0, Lcom/swmansion/rnscreens/K;->v:Z

    invoke-virtual {v1, v2, v3}, Lcom/swmansion/rnscreens/L;->g(Ljava/lang/String;Z)V

    :cond_6
    iget-boolean v1, p0, Lcom/swmansion/rnscreens/K;->t:Z

    invoke-virtual {v0, v1}, Lcom/swmansion/rnscreens/c;->setOverrideBackAction(Z)V

    :cond_7
    return-void
.end method

.method private final getHeaderConfig()Lcom/swmansion/rnscreens/x;
    .locals 2

    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    instance-of v1, v0, Lcom/swmansion/rnscreens/y;

    if-eqz v1, :cond_0

    check-cast v0, Lcom/swmansion/rnscreens/y;

    invoke-virtual {v0}, Lcom/swmansion/rnscreens/y;->getConfig()Lcom/swmansion/rnscreens/x;

    move-result-object v0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method private final getScreenStackFragment()Lcom/swmansion/rnscreens/u;
    .locals 1

    invoke-direct {p0}, Lcom/swmansion/rnscreens/K;->getHeaderConfig()Lcom/swmansion/rnscreens/x;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/swmansion/rnscreens/x;->getScreenFragment()Lcom/swmansion/rnscreens/u;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public static synthetic q(Lcom/swmansion/rnscreens/K;Landroid/view/View;Z)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/swmansion/rnscreens/K;->L(Lcom/swmansion/rnscreens/K;Landroid/view/View;Z)V

    return-void
.end method

.method public static synthetic r(Lcom/swmansion/rnscreens/K;)Z
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/swmansion/rnscreens/K;->M(Lcom/swmansion/rnscreens/K;)Z

    move-result p0

    return p0
.end method

.method public static synthetic s(Lcom/swmansion/rnscreens/K;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/swmansion/rnscreens/K;->N(Lcom/swmansion/rnscreens/K;Landroid/view/View;)V

    return-void
.end method

.method private final setSearchViewListeners(Landroidx/appcompat/widget/SearchView;)V
    .locals 1

    new-instance v0, Lcom/swmansion/rnscreens/K$d;

    invoke-direct {v0, p0}, Lcom/swmansion/rnscreens/K$d;-><init>(Lcom/swmansion/rnscreens/K;)V

    invoke-virtual {p1, v0}, Landroidx/appcompat/widget/SearchView;->setOnQueryTextListener(Landroidx/appcompat/widget/SearchView$m;)V

    new-instance v0, Lcom/swmansion/rnscreens/H;

    invoke-direct {v0, p0}, Lcom/swmansion/rnscreens/H;-><init>(Lcom/swmansion/rnscreens/K;)V

    invoke-virtual {p1, v0}, Landroidx/appcompat/widget/SearchView;->setOnQueryTextFocusChangeListener(Landroid/view/View$OnFocusChangeListener;)V

    new-instance v0, Lcom/swmansion/rnscreens/I;

    invoke-direct {v0, p0}, Lcom/swmansion/rnscreens/I;-><init>(Lcom/swmansion/rnscreens/K;)V

    invoke-virtual {p1, v0}, Landroidx/appcompat/widget/SearchView;->setOnCloseListener(Landroidx/appcompat/widget/SearchView$l;)V

    new-instance v0, Lcom/swmansion/rnscreens/J;

    invoke-direct {v0, p0}, Lcom/swmansion/rnscreens/J;-><init>(Lcom/swmansion/rnscreens/K;)V

    invoke-virtual {p1, v0}, Landroidx/appcompat/widget/SearchView;->setOnSearchClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method private final setToolbarElementsVisibility(I)V
    .locals 5

    invoke-direct {p0}, Lcom/swmansion/rnscreens/K;->getHeaderConfig()Lcom/swmansion/rnscreens/x;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/swmansion/rnscreens/x;->getConfigSubviewsCount()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    if-ltz v0, :cond_5

    :goto_1
    invoke-direct {p0}, Lcom/swmansion/rnscreens/K;->getHeaderConfig()Lcom/swmansion/rnscreens/x;

    move-result-object v2

    const/4 v3, 0x0

    if-eqz v2, :cond_1

    invoke-virtual {v2, v1}, Lcom/swmansion/rnscreens/x;->e(I)Lcom/swmansion/rnscreens/y;

    move-result-object v2

    goto :goto_2

    :cond_1
    move-object v2, v3

    :goto_2
    if-eqz v2, :cond_2

    invoke-virtual {v2}, Lcom/swmansion/rnscreens/y;->getType()Lcom/swmansion/rnscreens/y$a;

    move-result-object v3

    :cond_2
    sget-object v4, Lcom/swmansion/rnscreens/y$a;->q:Lcom/swmansion/rnscreens/y$a;

    if-eq v3, v4, :cond_4

    if-nez v2, :cond_3

    goto :goto_3

    :cond_3
    invoke-virtual {v2, p1}, Landroid/view/View;->setVisibility(I)V

    :cond_4
    :goto_3
    if-eq v1, v0, :cond_5

    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_5
    return-void
.end method

.method public static final synthetic t(Lcom/swmansion/rnscreens/K;)Lcom/swmansion/rnscreens/u;
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/swmansion/rnscreens/K;->getScreenStackFragment()Lcom/swmansion/rnscreens/u;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic u(Lcom/swmansion/rnscreens/K;)Lcom/swmansion/rnscreens/L;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/swmansion/rnscreens/K;->w:Lcom/swmansion/rnscreens/L;

    return-object p0
.end method

.method public static final synthetic v(Lcom/swmansion/rnscreens/K;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/swmansion/rnscreens/K;->G(Ljava/lang/String;)V

    return-void
.end method

.method public static final synthetic w(Lcom/swmansion/rnscreens/K;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/swmansion/rnscreens/K;->H(Ljava/lang/String;)V

    return-void
.end method

.method public static final synthetic x(Lcom/swmansion/rnscreens/K;Lcom/swmansion/rnscreens/L;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/swmansion/rnscreens/K;->w:Lcom/swmansion/rnscreens/L;

    return-void
.end method

.method public static final synthetic y(Lcom/swmansion/rnscreens/K;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/swmansion/rnscreens/K;->O()V

    return-void
.end method


# virtual methods
.method public final A()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/swmansion/rnscreens/K;->getScreenStackFragment()Lcom/swmansion/rnscreens/u;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/swmansion/rnscreens/u;->K()Lcom/swmansion/rnscreens/c;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/swmansion/rnscreens/c;->q0()V

    :cond_0
    return-void
.end method

.method public final D()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/swmansion/rnscreens/K;->getScreenStackFragment()Lcom/swmansion/rnscreens/u;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/swmansion/rnscreens/u;->K()Lcom/swmansion/rnscreens/c;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/swmansion/rnscreens/c;->r0()V

    :cond_0
    return-void
.end method

.method public final F(Ljava/lang/String;)V
    .locals 1

    .line 1
    if-eqz p1, :cond_0

    invoke-direct {p0}, Lcom/swmansion/rnscreens/K;->getScreenStackFragment()Lcom/swmansion/rnscreens/u;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/swmansion/rnscreens/u;->K()Lcom/swmansion/rnscreens/c;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Lcom/swmansion/rnscreens/c;->setText(Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public final I(Z)V
    .locals 0

    .line 1
    return-void
.end method

.method public final J()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/swmansion/rnscreens/K;->O()V

    return-void
.end method

.method public final getAutoCapitalize()Lcom/swmansion/rnscreens/K$a;
    .locals 1

    iget-object v0, p0, Lcom/swmansion/rnscreens/K;->n:Lcom/swmansion/rnscreens/K$a;

    return-object v0
.end method

.method public final getAutoFocus()Z
    .locals 1

    iget-boolean v0, p0, Lcom/swmansion/rnscreens/K;->u:Z

    return v0
.end method

.method public final getHeaderIconColor()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lcom/swmansion/rnscreens/K;->q:Ljava/lang/Integer;

    return-object v0
.end method

.method public final getHintTextColor()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lcom/swmansion/rnscreens/K;->r:Ljava/lang/Integer;

    return-object v0
.end method

.method public final getInputType()Lcom/swmansion/rnscreens/K$b;
    .locals 1

    iget-object v0, p0, Lcom/swmansion/rnscreens/K;->m:Lcom/swmansion/rnscreens/K$b;

    return-object v0
.end method

.method public final getPlaceholder()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/swmansion/rnscreens/K;->s:Ljava/lang/String;

    return-object v0
.end method

.method public final getShouldOverrideBackButton()Z
    .locals 1

    iget-boolean v0, p0, Lcom/swmansion/rnscreens/K;->t:Z

    return v0
.end method

.method public final getShouldShowHintSearchIcon()Z
    .locals 1

    iget-boolean v0, p0, Lcom/swmansion/rnscreens/K;->v:Z

    return v0
.end method

.method public final getTextColor()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lcom/swmansion/rnscreens/K;->o:Ljava/lang/Integer;

    return-object v0
.end method

.method public final getTintColor()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lcom/swmansion/rnscreens/K;->p:Ljava/lang/Integer;

    return-object v0
.end method

.method protected onAttachedToWindow()V
    .locals 2

    invoke-super {p0}, Lcom/facebook/react/views/view/i;->onAttachedToWindow()V

    invoke-direct {p0}, Lcom/swmansion/rnscreens/K;->getScreenStackFragment()Lcom/swmansion/rnscreens/u;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance v1, Lcom/swmansion/rnscreens/K$c;

    invoke-direct {v1, p0}, Lcom/swmansion/rnscreens/K$c;-><init>(Lcom/swmansion/rnscreens/K;)V

    invoke-virtual {v0, v1}, Lcom/swmansion/rnscreens/u;->N(Lv5/l;)V

    :goto_0
    return-void
.end method

.method public final setAutoCapitalize(Lcom/swmansion/rnscreens/K$a;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/swmansion/rnscreens/K;->n:Lcom/swmansion/rnscreens/K$a;

    return-void
.end method

.method public final setAutoFocus(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/swmansion/rnscreens/K;->u:Z

    return-void
.end method

.method public final setHeaderIconColor(Ljava/lang/Integer;)V
    .locals 0

    iput-object p1, p0, Lcom/swmansion/rnscreens/K;->q:Ljava/lang/Integer;

    return-void
.end method

.method public final setHintTextColor(Ljava/lang/Integer;)V
    .locals 0

    iput-object p1, p0, Lcom/swmansion/rnscreens/K;->r:Ljava/lang/Integer;

    return-void
.end method

.method public final setInputType(Lcom/swmansion/rnscreens/K$b;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/swmansion/rnscreens/K;->m:Lcom/swmansion/rnscreens/K$b;

    return-void
.end method

.method public final setPlaceholder(Ljava/lang/String;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/swmansion/rnscreens/K;->s:Ljava/lang/String;

    return-void
.end method

.method public final setShouldOverrideBackButton(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/swmansion/rnscreens/K;->t:Z

    return-void
.end method

.method public final setShouldShowHintSearchIcon(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/swmansion/rnscreens/K;->v:Z

    return-void
.end method

.method public final setTextColor(Ljava/lang/Integer;)V
    .locals 0

    iput-object p1, p0, Lcom/swmansion/rnscreens/K;->o:Ljava/lang/Integer;

    return-void
.end method

.method public final setTintColor(Ljava/lang/Integer;)V
    .locals 0

    iput-object p1, p0, Lcom/swmansion/rnscreens/K;->p:Ljava/lang/Integer;

    return-void
.end method

.method public final z()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/swmansion/rnscreens/K;->getScreenStackFragment()Lcom/swmansion/rnscreens/u;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/swmansion/rnscreens/u;->K()Lcom/swmansion/rnscreens/c;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroidx/appcompat/widget/SearchView;->clearFocus()V

    :cond_0
    return-void
.end method
