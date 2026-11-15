.class public final Lcom/swmansion/rnscreens/f;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Landroidx/fragment/app/Fragment;

.field private final b:Landroidx/activity/h;

.field private c:Z

.field private d:Z


# direct methods
.method public constructor <init>(Landroidx/fragment/app/Fragment;Landroidx/activity/h;)V
    .locals 1

    const-string v0, "fragment"

    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onBackPressedCallback"

    invoke-static {p2, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/swmansion/rnscreens/f;->a:Landroidx/fragment/app/Fragment;

    iput-object p2, p0, Lcom/swmansion/rnscreens/f;->b:Landroidx/activity/h;

    const/4 p1, 0x1

    iput-boolean p1, p0, Lcom/swmansion/rnscreens/f;->d:Z

    return-void
.end method


# virtual methods
.method public final a()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/swmansion/rnscreens/f;->d:Z

    return v0
.end method

.method public final b()V
    .locals 3

    .line 1
    iget-boolean v0, p0, Lcom/swmansion/rnscreens/f;->c:Z

    if-nez v0, :cond_1

    iget-boolean v0, p0, Lcom/swmansion/rnscreens/f;->d:Z

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/swmansion/rnscreens/f;->a:Landroidx/fragment/app/Fragment;

    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/j;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroidx/activity/ComponentActivity;->b()Landroidx/activity/OnBackPressedDispatcher;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/swmansion/rnscreens/f;->a:Landroidx/fragment/app/Fragment;

    iget-object v2, p0, Lcom/swmansion/rnscreens/f;->b:Landroidx/activity/h;

    invoke-virtual {v0, v1, v2}, Landroidx/activity/OnBackPressedDispatcher;->b(Landroidx/lifecycle/l;Landroidx/activity/h;)V

    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/swmansion/rnscreens/f;->c:Z

    :cond_1
    return-void
.end method

.method public final c()V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/swmansion/rnscreens/f;->c:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/swmansion/rnscreens/f;->b:Landroidx/activity/h;

    invoke-virtual {v0}, Landroidx/activity/h;->d()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/swmansion/rnscreens/f;->c:Z

    :cond_0
    return-void
.end method

.method public final d(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/swmansion/rnscreens/f;->d:Z

    return-void
.end method
