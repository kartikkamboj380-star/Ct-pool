.class public final Lcom/swmansion/rnscreens/x;
.super Landroid/view/ViewGroup;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/swmansion/rnscreens/x$a;,
        Lcom/swmansion/rnscreens/x$b;
    }
.end annotation


# static fields
.field public static final I:Lcom/swmansion/rnscreens/x$a;


# instance fields
.field private A:Z

.field private B:Z

.field private C:Z

.field private D:I

.field private E:Z

.field private final F:I

.field private final G:I

.field private final H:Landroid/view/View$OnClickListener;

.field private final m:Ljava/util/ArrayList;

.field private final n:Lcom/swmansion/rnscreens/d;

.field private o:Z

.field private p:Z

.field private q:Ljava/lang/Integer;

.field private r:Ljava/lang/String;

.field private s:I

.field private t:Ljava/lang/String;

.field private u:Ljava/lang/String;

.field private v:F

.field private w:I

.field private x:Ljava/lang/Integer;

.field private y:Z

.field private z:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/swmansion/rnscreens/x$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/swmansion/rnscreens/x$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/swmansion/rnscreens/x;->I:Lcom/swmansion/rnscreens/x$a;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 4

    const-string v0, "context"

    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Landroid/view/ViewGroup;-><init>(Landroid/content/Context;)V

    new-instance v0, Ljava/util/ArrayList;

    const/4 v1, 0x3

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    iput-object v0, p0, Lcom/swmansion/rnscreens/x;->m:Ljava/util/ArrayList;

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/swmansion/rnscreens/x;->C:Z

    new-instance v1, Lcom/swmansion/rnscreens/w;

    invoke-direct {v1, p0}, Lcom/swmansion/rnscreens/w;-><init>(Lcom/swmansion/rnscreens/x;)V

    iput-object v1, p0, Lcom/swmansion/rnscreens/x;->H:Landroid/view/View$OnClickListener;

    const/16 v1, 0x8

    invoke-virtual {p0, v1}, Landroid/view/View;->setVisibility(I)V

    new-instance v1, Lcom/swmansion/rnscreens/d;

    invoke-direct {v1, p1, p0}, Lcom/swmansion/rnscreens/d;-><init>(Landroid/content/Context;Lcom/swmansion/rnscreens/x;)V

    iput-object v1, p0, Lcom/swmansion/rnscreens/x;->n:Lcom/swmansion/rnscreens/d;

    invoke-virtual {v1}, Landroidx/appcompat/widget/Toolbar;->getContentInsetStart()I

    move-result v2

    iput v2, p0, Lcom/swmansion/rnscreens/x;->F:I

    invoke-virtual {v1}, Landroidx/appcompat/widget/Toolbar;->getContentInsetStartWithNavigation()I

    move-result v2

    iput v2, p0, Lcom/swmansion/rnscreens/x;->G:I

    new-instance v2, Landroid/util/TypedValue;

    invoke-direct {v2}, Landroid/util/TypedValue;-><init>()V

    invoke-virtual {p1}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object p1

    const v3, 0x1010433

    invoke-virtual {p1, v3, v2, v0}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    move-result p1

    if-eqz p1, :cond_0

    iget p1, v2, Landroid/util/TypedValue;->data:I

    invoke-virtual {v1, p1}, Landroid/view/View;->setBackgroundColor(I)V

    :cond_0
    const/4 p1, 0x0

    invoke-virtual {v1, p1}, Landroid/view/ViewGroup;->setClipChildren(Z)V

    return-void
.end method

.method public static synthetic a(Lcom/swmansion/rnscreens/x;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/swmansion/rnscreens/x;->c(Lcom/swmansion/rnscreens/x;Landroid/view/View;)V

    return-void
.end method

.method private static final c(Lcom/swmansion/rnscreens/x;Landroid/view/View;)V
    .locals 1

    .line 1
    const-string p1, "this$0"

    invoke-static {p0, p1}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/swmansion/rnscreens/x;->getScreenFragment()Lcom/swmansion/rnscreens/u;

    move-result-object p1

    if-eqz p1, :cond_3

    invoke-direct {p0}, Lcom/swmansion/rnscreens/x;->getScreenStack()Lcom/swmansion/rnscreens/t;

    move-result-object p0

    if-eqz p0, :cond_1

    invoke-virtual {p0}, Lcom/swmansion/rnscreens/t;->getRootScreen()Lcom/swmansion/rnscreens/l;

    move-result-object p0

    invoke-virtual {p1}, Lcom/swmansion/rnscreens/q;->g()Lcom/swmansion/rnscreens/l;

    move-result-object v0

    invoke-static {p0, v0}, Lw5/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_1

    invoke-virtual {p1}, Landroidx/fragment/app/Fragment;->getParentFragment()Landroidx/fragment/app/Fragment;

    move-result-object p0

    instance-of p1, p0, Lcom/swmansion/rnscreens/u;

    if-eqz p1, :cond_3

    check-cast p0, Lcom/swmansion/rnscreens/u;

    invoke-virtual {p0}, Lcom/swmansion/rnscreens/q;->g()Lcom/swmansion/rnscreens/l;

    move-result-object p1

    invoke-virtual {p1}, Lcom/swmansion/rnscreens/l;->getNativeBackButtonDismissalEnabled()Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-virtual {p0}, Lcom/swmansion/rnscreens/u;->dismiss()V

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lcom/swmansion/rnscreens/q;->u()V

    goto :goto_0

    :cond_1
    invoke-virtual {p1}, Lcom/swmansion/rnscreens/q;->g()Lcom/swmansion/rnscreens/l;

    move-result-object p0

    invoke-virtual {p0}, Lcom/swmansion/rnscreens/l;->getNativeBackButtonDismissalEnabled()Z

    move-result p0

    if-eqz p0, :cond_2

    invoke-virtual {p1}, Lcom/swmansion/rnscreens/u;->dismiss()V

    goto :goto_0

    :cond_2
    invoke-virtual {p1}, Lcom/swmansion/rnscreens/q;->u()V

    :cond_3
    :goto_0
    return-void
.end method

.method private final getScreen()Lcom/swmansion/rnscreens/l;
    .locals 2

    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    instance-of v1, v0, Lcom/swmansion/rnscreens/l;

    if-eqz v1, :cond_0

    check-cast v0, Lcom/swmansion/rnscreens/l;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method private final getScreenStack()Lcom/swmansion/rnscreens/t;
    .locals 3

    invoke-direct {p0}, Lcom/swmansion/rnscreens/x;->getScreen()Lcom/swmansion/rnscreens/l;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/swmansion/rnscreens/l;->getContainer()Lcom/swmansion/rnscreens/n;

    move-result-object v0

    goto :goto_0

    :cond_0
    move-object v0, v1

    :goto_0
    instance-of v2, v0, Lcom/swmansion/rnscreens/t;

    if-eqz v2, :cond_1

    move-object v1, v0

    check-cast v1, Lcom/swmansion/rnscreens/t;

    :cond_1
    return-object v1
.end method

.method private final h()V
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Lcom/swmansion/rnscreens/x;->A:Z

    if-nez v0, :cond_0

    invoke-direct {p0}, Lcom/swmansion/rnscreens/x;->getScreen()Lcom/swmansion/rnscreens/l;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/swmansion/rnscreens/l;->d()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lcom/swmansion/rnscreens/x;->i()V

    :cond_0
    return-void
.end method


# virtual methods
.method public final b(Lcom/swmansion/rnscreens/y;I)V
    .locals 1

    .line 1
    const-string v0, "child"

    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/swmansion/rnscreens/x;->m:Ljava/util/ArrayList;

    invoke-virtual {v0, p2, p1}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    invoke-direct {p0}, Lcom/swmansion/rnscreens/x;->h()V

    return-void
.end method

.method public final d()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/swmansion/rnscreens/x;->A:Z

    return-void
.end method

.method public final e(I)Lcom/swmansion/rnscreens/y;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/swmansion/rnscreens/x;->m:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    const-string v0, "get(...)"

    invoke-static {p1, v0}, Lw5/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lcom/swmansion/rnscreens/y;

    return-object p1
.end method

.method public final f()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/swmansion/rnscreens/x;->o:Z

    return v0
.end method

.method public final g()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/swmansion/rnscreens/x;->p:Z

    return v0
.end method

.method public final getConfigSubviewsCount()I
    .locals 1

    iget-object v0, p0, Lcom/swmansion/rnscreens/x;->m:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    return v0
.end method

.method public final getScreenFragment()Lcom/swmansion/rnscreens/u;
    .locals 2

    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    instance-of v1, v0, Lcom/swmansion/rnscreens/l;

    if-eqz v1, :cond_0

    check-cast v0, Lcom/swmansion/rnscreens/l;

    invoke-virtual {v0}, Lcom/swmansion/rnscreens/l;->getFragment()Landroidx/fragment/app/Fragment;

    move-result-object v0

    instance-of v1, v0, Lcom/swmansion/rnscreens/u;

    if-eqz v1, :cond_0

    check-cast v0, Lcom/swmansion/rnscreens/u;

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public final getToolbar()Lcom/swmansion/rnscreens/d;
    .locals 1

    iget-object v0, p0, Lcom/swmansion/rnscreens/x;->n:Lcom/swmansion/rnscreens/d;

    return-object v0
.end method

.method public final i()V
    .locals 11

    .line 1
    invoke-direct {p0}, Lcom/swmansion/rnscreens/x;->getScreenStack()Lcom/swmansion/rnscreens/t;

    move-result-object v0

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lcom/swmansion/rnscreens/t;->getTopScreen()Lcom/swmansion/rnscreens/l;

    move-result-object v0

    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v3

    invoke-static {v0, v3}, Lw5/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    move v0, v2

    goto :goto_1

    :cond_1
    :goto_0
    move v0, v1

    :goto_1
    iget-boolean v3, p0, Lcom/swmansion/rnscreens/x;->E:Z

    if-eqz v3, :cond_26

    if-eqz v0, :cond_26

    iget-boolean v0, p0, Lcom/swmansion/rnscreens/x;->A:Z

    if-eqz v0, :cond_2

    goto/16 :goto_f

    :cond_2
    invoke-virtual {p0}, Lcom/swmansion/rnscreens/x;->getScreenFragment()Lcom/swmansion/rnscreens/u;

    move-result-object v0

    const/4 v3, 0x0

    if-eqz v0, :cond_3

    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/j;

    move-result-object v0

    goto :goto_2

    :cond_3
    move-object v0, v3

    :goto_2
    check-cast v0, Landroidx/appcompat/app/c;

    if-nez v0, :cond_4

    return-void

    :cond_4
    iget-object v4, p0, Lcom/swmansion/rnscreens/x;->u:Ljava/lang/String;

    if-eqz v4, :cond_6

    const-string v5, "rtl"

    invoke-static {v4, v5}, Lw5/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_5

    iget-object v4, p0, Lcom/swmansion/rnscreens/x;->n:Lcom/swmansion/rnscreens/d;

    invoke-virtual {v4, v1}, Landroid/view/View;->setLayoutDirection(I)V

    goto :goto_3

    :cond_5
    iget-object v4, p0, Lcom/swmansion/rnscreens/x;->u:Ljava/lang/String;

    const-string v5, "ltr"

    invoke-static {v4, v5}, Lw5/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_6

    iget-object v4, p0, Lcom/swmansion/rnscreens/x;->n:Lcom/swmansion/rnscreens/d;

    invoke-virtual {v4, v2}, Landroid/view/View;->setLayoutDirection(I)V

    :cond_6
    :goto_3
    invoke-direct {p0}, Lcom/swmansion/rnscreens/x;->getScreen()Lcom/swmansion/rnscreens/l;

    move-result-object v4

    if-eqz v4, :cond_9

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v5

    instance-of v5, v5, Lcom/facebook/react/bridge/ReactContext;

    if-eqz v5, :cond_7

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v5

    const-string v6, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext"

    invoke-static {v5, v6}, Lw5/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v5, Lcom/facebook/react/bridge/ReactContext;

    goto :goto_4

    :cond_7
    invoke-virtual {v4}, Lcom/swmansion/rnscreens/l;->getFragmentWrapper()Lcom/swmansion/rnscreens/r;

    move-result-object v5

    if-eqz v5, :cond_8

    invoke-interface {v5}, Lcom/swmansion/rnscreens/r;->f()Lcom/facebook/react/bridge/ReactContext;

    move-result-object v5

    goto :goto_4

    :cond_8
    move-object v5, v3

    :goto_4
    sget-object v6, Lcom/swmansion/rnscreens/C;->a:Lcom/swmansion/rnscreens/C;

    invoke-virtual {v6, v4, v0, v5}, Lcom/swmansion/rnscreens/C;->w(Lcom/swmansion/rnscreens/l;Landroid/app/Activity;Lcom/facebook/react/bridge/ReactContext;)V

    :cond_9
    iget-boolean v4, p0, Lcom/swmansion/rnscreens/x;->o:Z

    if-eqz v4, :cond_b

    iget-object v0, p0, Lcom/swmansion/rnscreens/x;->n:Lcom/swmansion/rnscreens/d;

    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    if-eqz v0, :cond_a

    invoke-virtual {p0}, Lcom/swmansion/rnscreens/x;->getScreenFragment()Lcom/swmansion/rnscreens/u;

    move-result-object v0

    if-eqz v0, :cond_a

    invoke-virtual {v0}, Lcom/swmansion/rnscreens/u;->M()V

    :cond_a
    return-void

    :cond_b
    iget-object v4, p0, Lcom/swmansion/rnscreens/x;->n:Lcom/swmansion/rnscreens/d;

    invoke-virtual {v4}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v4

    if-nez v4, :cond_c

    invoke-virtual {p0}, Lcom/swmansion/rnscreens/x;->getScreenFragment()Lcom/swmansion/rnscreens/u;

    move-result-object v4

    if-eqz v4, :cond_c

    iget-object v5, p0, Lcom/swmansion/rnscreens/x;->n:Lcom/swmansion/rnscreens/d;

    invoke-virtual {v4, v5}, Lcom/swmansion/rnscreens/u;->O(Landroidx/appcompat/widget/Toolbar;)V

    :cond_c
    iget-boolean v4, p0, Lcom/swmansion/rnscreens/x;->C:Z

    if-eqz v4, :cond_e

    iget-object v4, p0, Lcom/swmansion/rnscreens/x;->q:Ljava/lang/Integer;

    iget-object v5, p0, Lcom/swmansion/rnscreens/x;->n:Lcom/swmansion/rnscreens/d;

    if-eqz v4, :cond_d

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v4

    goto :goto_5

    :cond_d
    move v4, v2

    :goto_5
    invoke-virtual {v5, v2, v4, v2, v2}, Landroid/view/View;->setPadding(IIII)V

    goto :goto_6

    :cond_e
    iget-object v4, p0, Lcom/swmansion/rnscreens/x;->n:Lcom/swmansion/rnscreens/d;

    invoke-virtual {v4}, Landroid/view/View;->getPaddingTop()I

    move-result v4

    if-lez v4, :cond_f

    iget-object v4, p0, Lcom/swmansion/rnscreens/x;->n:Lcom/swmansion/rnscreens/d;

    invoke-virtual {v4, v2, v2, v2, v2}, Landroid/view/View;->setPadding(IIII)V

    :cond_f
    :goto_6
    iget-object v4, p0, Lcom/swmansion/rnscreens/x;->n:Lcom/swmansion/rnscreens/d;

    invoke-virtual {v0, v4}, Landroidx/appcompat/app/c;->j0(Landroidx/appcompat/widget/Toolbar;)V

    invoke-virtual {v0}, Landroidx/appcompat/app/c;->a0()Landroidx/appcompat/app/a;

    move-result-object v0

    if-eqz v0, :cond_25

    const-string v4, "requireNotNull(...)"

    invoke-static {v0, v4}, Lw5/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v4, p0, Lcom/swmansion/rnscreens/x;->n:Lcom/swmansion/rnscreens/d;

    iget v5, p0, Lcom/swmansion/rnscreens/x;->G:I

    invoke-virtual {v4, v5}, Landroidx/appcompat/widget/Toolbar;->setContentInsetStartWithNavigation(I)V

    iget-object v4, p0, Lcom/swmansion/rnscreens/x;->n:Lcom/swmansion/rnscreens/d;

    iget v5, p0, Lcom/swmansion/rnscreens/x;->F:I

    invoke-virtual {v4, v5, v5}, Landroidx/appcompat/widget/Toolbar;->L(II)V

    invoke-virtual {p0}, Lcom/swmansion/rnscreens/x;->getScreenFragment()Lcom/swmansion/rnscreens/u;

    move-result-object v4

    if-eqz v4, :cond_10

    invoke-virtual {v4}, Lcom/swmansion/rnscreens/u;->I()Z

    move-result v4

    if-ne v4, v1, :cond_10

    iget-boolean v4, p0, Lcom/swmansion/rnscreens/x;->y:Z

    if-nez v4, :cond_10

    move v4, v1

    goto :goto_7

    :cond_10
    move v4, v2

    :goto_7
    invoke-virtual {v0, v4}, Landroidx/appcompat/app/a;->s(Z)V

    iget-object v4, p0, Lcom/swmansion/rnscreens/x;->n:Lcom/swmansion/rnscreens/d;

    iget-object v5, p0, Lcom/swmansion/rnscreens/x;->H:Landroid/view/View$OnClickListener;

    invoke-virtual {v4, v5}, Landroidx/appcompat/widget/Toolbar;->setNavigationOnClickListener(Landroid/view/View$OnClickListener;)V

    invoke-virtual {p0}, Lcom/swmansion/rnscreens/x;->getScreenFragment()Lcom/swmansion/rnscreens/u;

    move-result-object v4

    if-eqz v4, :cond_11

    iget-boolean v5, p0, Lcom/swmansion/rnscreens/x;->z:Z

    invoke-virtual {v4, v5}, Lcom/swmansion/rnscreens/u;->P(Z)V

    :cond_11
    invoke-virtual {p0}, Lcom/swmansion/rnscreens/x;->getScreenFragment()Lcom/swmansion/rnscreens/u;

    move-result-object v4

    if-eqz v4, :cond_12

    iget-boolean v5, p0, Lcom/swmansion/rnscreens/x;->p:Z

    invoke-virtual {v4, v5}, Lcom/swmansion/rnscreens/u;->Q(Z)V

    :cond_12
    iget-object v4, p0, Lcom/swmansion/rnscreens/x;->r:Ljava/lang/String;

    invoke-virtual {v0, v4}, Landroidx/appcompat/app/a;->v(Ljava/lang/CharSequence;)V

    iget-object v4, p0, Lcom/swmansion/rnscreens/x;->r:Ljava/lang/String;

    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v4

    if-eqz v4, :cond_13

    iget-object v4, p0, Lcom/swmansion/rnscreens/x;->n:Lcom/swmansion/rnscreens/d;

    invoke-virtual {v4, v2}, Landroidx/appcompat/widget/Toolbar;->setContentInsetStartWithNavigation(I)V

    :cond_13
    sget-object v4, Lcom/swmansion/rnscreens/x;->I:Lcom/swmansion/rnscreens/x$a;

    iget-object v5, p0, Lcom/swmansion/rnscreens/x;->n:Lcom/swmansion/rnscreens/d;

    invoke-virtual {v4, v5}, Lcom/swmansion/rnscreens/x$a;->a(Landroidx/appcompat/widget/Toolbar;)Landroid/widget/TextView;

    move-result-object v4

    iget v5, p0, Lcom/swmansion/rnscreens/x;->s:I

    if-eqz v5, :cond_14

    iget-object v6, p0, Lcom/swmansion/rnscreens/x;->n:Lcom/swmansion/rnscreens/d;

    invoke-virtual {v6, v5}, Landroidx/appcompat/widget/Toolbar;->setTitleTextColor(I)V

    :cond_14
    if-eqz v4, :cond_17

    iget-object v5, p0, Lcom/swmansion/rnscreens/x;->t:Ljava/lang/String;

    if-nez v5, :cond_15

    iget v6, p0, Lcom/swmansion/rnscreens/x;->w:I

    if-lez v6, :cond_16

    :cond_15
    iget v6, p0, Lcom/swmansion/rnscreens/x;->w:I

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v7

    invoke-virtual {v7}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    move-result-object v7

    invoke-static {v3, v2, v6, v5, v7}, Lcom/facebook/react/views/text/o;->a(Landroid/graphics/Typeface;IILjava/lang/String;Landroid/content/res/AssetManager;)Landroid/graphics/Typeface;

    move-result-object v5

    const-string v6, "applyStyles(...)"

    invoke-static {v5, v6}, Lw5/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v4, v5}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    :cond_16
    iget v5, p0, Lcom/swmansion/rnscreens/x;->v:F

    const/4 v6, 0x0

    cmpl-float v6, v5, v6

    if-lez v6, :cond_17

    invoke-virtual {v4, v5}, Landroid/widget/TextView;->setTextSize(F)V

    :cond_17
    iget-object v4, p0, Lcom/swmansion/rnscreens/x;->x:Ljava/lang/Integer;

    if-eqz v4, :cond_18

    invoke-virtual {v4}, Ljava/lang/Number;->intValue()I

    move-result v4

    iget-object v5, p0, Lcom/swmansion/rnscreens/x;->n:Lcom/swmansion/rnscreens/d;

    invoke-virtual {v5, v4}, Landroid/view/View;->setBackgroundColor(I)V

    :cond_18
    iget v4, p0, Lcom/swmansion/rnscreens/x;->D:I

    if-eqz v4, :cond_1a

    iget-object v4, p0, Lcom/swmansion/rnscreens/x;->n:Lcom/swmansion/rnscreens/d;

    invoke-virtual {v4}, Landroidx/appcompat/widget/Toolbar;->getNavigationIcon()Landroid/graphics/drawable/Drawable;

    move-result-object v4

    if-nez v4, :cond_19

    goto :goto_8

    :cond_19
    new-instance v5, Landroid/graphics/PorterDuffColorFilter;

    iget v6, p0, Lcom/swmansion/rnscreens/x;->D:I

    sget-object v7, Landroid/graphics/PorterDuff$Mode;->SRC_ATOP:Landroid/graphics/PorterDuff$Mode;

    invoke-direct {v5, v6, v7}, Landroid/graphics/PorterDuffColorFilter;-><init>(ILandroid/graphics/PorterDuff$Mode;)V

    invoke-virtual {v4, v5}, Landroid/graphics/drawable/Drawable;->setColorFilter(Landroid/graphics/ColorFilter;)V

    :cond_1a
    :goto_8
    iget-object v4, p0, Lcom/swmansion/rnscreens/x;->n:Lcom/swmansion/rnscreens/d;

    invoke-virtual {v4}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v4

    sub-int/2addr v4, v1

    :goto_9
    const/4 v5, -0x1

    if-ge v5, v4, :cond_1c

    iget-object v5, p0, Lcom/swmansion/rnscreens/x;->n:Lcom/swmansion/rnscreens/d;

    invoke-virtual {v5, v4}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v5

    instance-of v5, v5, Lcom/swmansion/rnscreens/y;

    if-eqz v5, :cond_1b

    iget-object v5, p0, Lcom/swmansion/rnscreens/x;->n:Lcom/swmansion/rnscreens/d;

    invoke-virtual {v5, v4}, Landroid/view/ViewGroup;->removeViewAt(I)V

    :cond_1b
    add-int/lit8 v4, v4, -0x1

    goto :goto_9

    :cond_1c
    iget-object v4, p0, Lcom/swmansion/rnscreens/x;->m:Ljava/util/ArrayList;

    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v4

    move v6, v2

    :goto_a
    if-ge v6, v4, :cond_24

    iget-object v7, p0, Lcom/swmansion/rnscreens/x;->m:Ljava/util/ArrayList;

    invoke-virtual {v7, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v7

    const-string v8, "get(...)"

    invoke-static {v7, v8}, Lw5/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v7, Lcom/swmansion/rnscreens/y;

    invoke-virtual {v7}, Lcom/swmansion/rnscreens/y;->getType()Lcom/swmansion/rnscreens/y$a;

    move-result-object v8

    sget-object v9, Lcom/swmansion/rnscreens/y$a;->p:Lcom/swmansion/rnscreens/y$a;

    if-ne v8, v9, :cond_1f

    invoke-virtual {v7, v2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v7

    instance-of v8, v7, Landroid/widget/ImageView;

    if-eqz v8, :cond_1d

    check-cast v7, Landroid/widget/ImageView;

    goto :goto_b

    :cond_1d
    move-object v7, v3

    :goto_b
    if-eqz v7, :cond_1e

    invoke-virtual {v7}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v7

    invoke-virtual {v0, v7}, Landroidx/appcompat/app/a;->t(Landroid/graphics/drawable/Drawable;)V

    :goto_c
    add-int/lit8 v6, v6, 0x1

    goto :goto_a

    :cond_1e
    new-instance v0, Lcom/facebook/react/bridge/JSApplicationIllegalArgumentException;

    const-string v1, "Back button header config view should have Image as first child"

    invoke-direct {v0, v1}, Lcom/facebook/react/bridge/JSApplicationIllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1f
    new-instance v9, Landroidx/appcompat/widget/Toolbar$g;

    const/4 v10, -0x2

    invoke-direct {v9, v10, v5}, Landroidx/appcompat/widget/Toolbar$g;-><init>(II)V

    sget-object v10, Lcom/swmansion/rnscreens/x$b;->a:[I

    invoke-virtual {v8}, Ljava/lang/Enum;->ordinal()I

    move-result v8

    aget v8, v10, v8

    if-eq v8, v1, :cond_22

    const/4 v10, 0x2

    if-eq v8, v10, :cond_21

    const/4 v10, 0x3

    if-eq v8, v10, :cond_20

    goto :goto_e

    :cond_20
    iput v5, v9, Landroid/view/ViewGroup$MarginLayoutParams;->width:I

    iput v1, v9, Landroidx/appcompat/app/a$a;->a:I

    iget-object v8, p0, Lcom/swmansion/rnscreens/x;->n:Lcom/swmansion/rnscreens/d;

    invoke-virtual {v8, v3}, Landroidx/appcompat/widget/Toolbar;->setTitle(Ljava/lang/CharSequence;)V

    goto :goto_e

    :cond_21
    const v8, 0x800005

    :goto_d
    iput v8, v9, Landroidx/appcompat/app/a$a;->a:I

    goto :goto_e

    :cond_22
    iget-boolean v8, p0, Lcom/swmansion/rnscreens/x;->B:Z

    if-nez v8, :cond_23

    iget-object v8, p0, Lcom/swmansion/rnscreens/x;->n:Lcom/swmansion/rnscreens/d;

    invoke-virtual {v8, v3}, Landroidx/appcompat/widget/Toolbar;->setNavigationIcon(Landroid/graphics/drawable/Drawable;)V

    :cond_23
    iget-object v8, p0, Lcom/swmansion/rnscreens/x;->n:Lcom/swmansion/rnscreens/d;

    invoke-virtual {v8, v3}, Landroidx/appcompat/widget/Toolbar;->setTitle(Ljava/lang/CharSequence;)V

    const v8, 0x800003

    goto :goto_d

    :goto_e
    invoke-virtual {v7, v9}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    iget-object v8, p0, Lcom/swmansion/rnscreens/x;->n:Lcom/swmansion/rnscreens/d;

    invoke-virtual {v8, v7}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    goto :goto_c

    :cond_24
    return-void

    :cond_25
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Required value was null."

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_26
    :goto_f
    return-void
.end method

.method public final j()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/swmansion/rnscreens/x;->m:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    invoke-direct {p0}, Lcom/swmansion/rnscreens/x;->h()V

    return-void
.end method

.method public final k(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/swmansion/rnscreens/x;->m:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    invoke-direct {p0}, Lcom/swmansion/rnscreens/x;->h()V

    return-void
.end method

.method protected onAttachedToWindow()V
    .locals 4

    invoke-super {p0}, Landroid/view/ViewGroup;->onAttachedToWindow()V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/swmansion/rnscreens/x;->E:Z

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

    new-instance v2, Lc5/a;

    invoke-virtual {p0}, Landroid/view/View;->getId()I

    move-result v3

    invoke-direct {v2, v0, v3}, Lc5/a;-><init>(II)V

    invoke-interface {v1, v2}, Lcom/facebook/react/uimanager/events/e;->c(Lcom/facebook/react/uimanager/events/d;)V

    :cond_0
    iget-object v0, p0, Lcom/swmansion/rnscreens/x;->q:Ljava/lang/Integer;

    if-nez v0, :cond_2

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1e

    if-lt v0, v1, :cond_1

    invoke-virtual {p0}, Landroid/view/View;->getRootWindowInsets()Landroid/view/WindowInsets;

    move-result-object v0

    invoke-static {}, Lcom/facebook/react/W;->a()I

    move-result v1

    invoke-static {v0, v1}, Landroidx/core/view/k0;->a(Landroid/view/WindowInsets;I)Landroid/graphics/Insets;

    move-result-object v0

    invoke-static {v0}, Landroidx/appcompat/widget/L;->a(Landroid/graphics/Insets;)I

    move-result v0

    :goto_0
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    goto :goto_1

    :cond_1
    invoke-virtual {p0}, Landroid/view/View;->getRootWindowInsets()Landroid/view/WindowInsets;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/WindowInsets;->getSystemWindowInsetTop()I

    move-result v0

    goto :goto_0

    :goto_1
    iput-object v0, p0, Lcom/swmansion/rnscreens/x;->q:Ljava/lang/Integer;

    :cond_2
    invoke-virtual {p0}, Lcom/swmansion/rnscreens/x;->i()V

    return-void
.end method

.method protected onDetachedFromWindow()V
    .locals 4

    invoke-super {p0}, Landroid/view/ViewGroup;->onDetachedFromWindow()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/swmansion/rnscreens/x;->E:Z

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

    new-instance v2, Lc5/c;

    invoke-virtual {p0}, Landroid/view/View;->getId()I

    move-result v3

    invoke-direct {v2, v0, v3}, Lc5/c;-><init>(II)V

    invoke-interface {v1, v2}, Lcom/facebook/react/uimanager/events/e;->c(Lcom/facebook/react/uimanager/events/d;)V

    :cond_0
    return-void
.end method

.method protected onLayout(ZIIII)V
    .locals 0

    return-void
.end method

.method public final setBackButtonInCustomView(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/swmansion/rnscreens/x;->B:Z

    return-void
.end method

.method public final setBackgroundColor(Ljava/lang/Integer;)V
    .locals 0

    iput-object p1, p0, Lcom/swmansion/rnscreens/x;->x:Ljava/lang/Integer;

    return-void
.end method

.method public final setDirection(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/swmansion/rnscreens/x;->u:Ljava/lang/String;

    return-void
.end method

.method public final setHeaderHidden(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/swmansion/rnscreens/x;->o:Z

    return-void
.end method

.method public final setHeaderTranslucent(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/swmansion/rnscreens/x;->p:Z

    return-void
.end method

.method public final setHidden(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/swmansion/rnscreens/x;->o:Z

    return-void
.end method

.method public final setHideBackButton(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/swmansion/rnscreens/x;->y:Z

    return-void
.end method

.method public final setHideShadow(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/swmansion/rnscreens/x;->z:Z

    return-void
.end method

.method public final setTintColor(I)V
    .locals 0

    iput p1, p0, Lcom/swmansion/rnscreens/x;->D:I

    return-void
.end method

.method public final setTitle(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/swmansion/rnscreens/x;->r:Ljava/lang/String;

    return-void
.end method

.method public final setTitleColor(I)V
    .locals 0

    iput p1, p0, Lcom/swmansion/rnscreens/x;->s:I

    return-void
.end method

.method public final setTitleFontFamily(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/swmansion/rnscreens/x;->t:Ljava/lang/String;

    return-void
.end method

.method public final setTitleFontSize(F)V
    .locals 0

    iput p1, p0, Lcom/swmansion/rnscreens/x;->v:F

    return-void
.end method

.method public final setTitleFontWeight(Ljava/lang/String;)V
    .locals 0

    invoke-static {p1}, Lcom/facebook/react/views/text/o;->d(Ljava/lang/String;)I

    move-result p1

    iput p1, p0, Lcom/swmansion/rnscreens/x;->w:I

    return-void
.end method

.method public final setTopInsetEnabled(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/swmansion/rnscreens/x;->C:Z

    return-void
.end method

.method public final setTranslucent(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/swmansion/rnscreens/x;->p:Z

    return-void
.end method
