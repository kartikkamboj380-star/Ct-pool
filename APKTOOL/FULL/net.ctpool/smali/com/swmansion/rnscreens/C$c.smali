.class public final Lcom/swmansion/rnscreens/C$c;
.super Lcom/facebook/react/bridge/GuardedRunnable;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/swmansion/rnscreens/C;->v(Lcom/swmansion/rnscreens/l;Landroid/app/Activity;Lcom/facebook/react/bridge/ReactContext;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic m:Landroid/app/Activity;

.field final synthetic n:Z


# direct methods
.method constructor <init>(Landroid/app/Activity;ZLcom/facebook/react/bridge/JSExceptionHandler;)V
    .locals 0

    iput-object p1, p0, Lcom/swmansion/rnscreens/C$c;->m:Landroid/app/Activity;

    iput-boolean p2, p0, Lcom/swmansion/rnscreens/C$c;->n:Z

    invoke-direct {p0, p3}, Lcom/facebook/react/bridge/GuardedRunnable;-><init>(Lcom/facebook/react/bridge/JSExceptionHandler;)V

    return-void
.end method

.method public static synthetic a(Landroid/view/View;Landroidx/core/view/U;)Landroidx/core/view/U;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/swmansion/rnscreens/C$c;->b(Landroid/view/View;Landroidx/core/view/U;)Landroidx/core/view/U;

    move-result-object p0

    return-object p0
.end method

.method private static final b(Landroid/view/View;Landroidx/core/view/U;)Landroidx/core/view/U;
    .locals 4

    .line 1
    const-string v0, "v"

    invoke-static {p0, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "insets"

    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1}, Landroidx/core/view/H;->b0(Landroid/view/View;Landroidx/core/view/U;)Landroidx/core/view/U;

    move-result-object p0

    const-string p1, "onApplyWindowInsets(...)"

    invoke-static {p0, p1}, Lw5/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v0, 0x1e

    const/4 v1, 0x0

    if-lt p1, v0, :cond_0

    invoke-static {}, Landroidx/core/view/U$m;->e()I

    move-result p1

    invoke-virtual {p0, p1}, Landroidx/core/view/U;->f(I)Landroidx/core/graphics/b;

    move-result-object p0

    const-string p1, "getInsets(...)"

    invoke-static {p0, p1}, Lw5/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Landroidx/core/view/U$b;

    invoke-direct {p1}, Landroidx/core/view/U$b;-><init>()V

    invoke-static {}, Landroidx/core/view/U$m;->e()I

    move-result v0

    iget v2, p0, Landroidx/core/graphics/b;->a:I

    iget v3, p0, Landroidx/core/graphics/b;->c:I

    iget p0, p0, Landroidx/core/graphics/b;->d:I

    invoke-static {v2, v1, v3, p0}, Landroidx/core/graphics/b;->b(IIII)Landroidx/core/graphics/b;

    move-result-object p0

    invoke-virtual {p1, v0, p0}, Landroidx/core/view/U$b;->b(ILandroidx/core/graphics/b;)Landroidx/core/view/U$b;

    move-result-object p0

    invoke-virtual {p0}, Landroidx/core/view/U$b;->a()Landroidx/core/view/U;

    move-result-object p0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Landroidx/core/view/U;->j()I

    move-result p1

    invoke-virtual {p0}, Landroidx/core/view/U;->k()I

    move-result v0

    invoke-virtual {p0}, Landroidx/core/view/U;->i()I

    move-result v2

    invoke-virtual {p0, p1, v1, v0, v2}, Landroidx/core/view/U;->p(IIII)Landroidx/core/view/U;

    move-result-object p0

    :goto_0
    return-object p0
.end method


# virtual methods
.method public runGuarded()V
    .locals 2

    iget-object v0, p0, Lcom/swmansion/rnscreens/C$c;->m:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    const-string v1, "getDecorView(...)"

    invoke-static {v0, v1}, Lw5/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-boolean v1, p0, Lcom/swmansion/rnscreens/C$c;->n:Z

    if-eqz v1, :cond_0

    new-instance v1, Lcom/swmansion/rnscreens/E;

    invoke-direct {v1}, Lcom/swmansion/rnscreens/E;-><init>()V

    :goto_0
    invoke-static {v0, v1}, Landroidx/core/view/H;->C0(Landroid/view/View;Landroidx/core/view/C;)V

    goto :goto_1

    :cond_0
    const/4 v1, 0x0

    goto :goto_0

    :goto_1
    invoke-static {v0}, Landroidx/core/view/H;->m0(Landroid/view/View;)V

    return-void
.end method
