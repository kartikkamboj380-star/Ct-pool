.class Landroidx/fragment/app/j$a;
.super Landroidx/fragment/app/o;
.source "SourceFile"

# interfaces
.implements Landroidx/core/content/d;
.implements Landroidx/core/content/e;
.implements Landroidx/core/app/U;
.implements Landroidx/core/app/V;
.implements Landroidx/lifecycle/I;
.implements Landroidx/activity/l;
.implements Landroidx/activity/result/d;
.implements LY/e;
.implements Landroidx/fragment/app/A;
.implements Landroidx/core/view/s;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/fragment/app/j;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "a"
.end annotation


# instance fields
.field final synthetic r:Landroidx/fragment/app/j;


# direct methods
.method public constructor <init>(Landroidx/fragment/app/j;)V
    .locals 0

    iput-object p1, p0, Landroidx/fragment/app/j$a;->r:Landroidx/fragment/app/j;

    invoke-direct {p0, p1}, Landroidx/fragment/app/o;-><init>(Landroidx/fragment/app/j;)V

    return-void
.end method


# virtual methods
.method public A()V
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/j$a;->B()V

    return-void
.end method

.method public B()V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/j$a;->r:Landroidx/fragment/app/j;

    invoke-virtual {v0}, Landroidx/activity/ComponentActivity;->D()V

    return-void
.end method

.method public C()Landroidx/fragment/app/j;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/j$a;->r:Landroidx/fragment/app/j;

    return-object v0
.end method

.method public a(Landroidx/fragment/app/w;Landroidx/fragment/app/Fragment;)V
    .locals 0

    .line 1
    iget-object p1, p0, Landroidx/fragment/app/j$a;->r:Landroidx/fragment/app/j;

    invoke-virtual {p1, p2}, Landroidx/fragment/app/j;->X(Landroidx/fragment/app/Fragment;)V

    return-void
.end method

.method public b()Landroidx/activity/OnBackPressedDispatcher;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/j$a;->r:Landroidx/fragment/app/j;

    invoke-virtual {v0}, Landroidx/activity/ComponentActivity;->b()Landroidx/activity/OnBackPressedDispatcher;

    move-result-object v0

    return-object v0
.end method

.method public d(Landroidx/core/view/v;)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/j$a;->r:Landroidx/fragment/app/j;

    invoke-virtual {v0, p1}, Landroidx/activity/ComponentActivity;->d(Landroidx/core/view/v;)V

    return-void
.end method

.method public e(Landroidx/core/util/a;)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/j$a;->r:Landroidx/fragment/app/j;

    invoke-virtual {v0, p1}, Landroidx/activity/ComponentActivity;->e(Landroidx/core/util/a;)V

    return-void
.end method

.method public f(I)Landroid/view/View;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/j$a;->r:Landroidx/fragment/app/j;

    invoke-virtual {v0, p1}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    move-result-object p1

    return-object p1
.end method

.method public g()Z
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/j$a;->r:Landroidx/fragment/app/j;

    invoke-virtual {v0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/view/Window;->peekDecorView()Landroid/view/View;

    move-result-object v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public getLifecycle()Landroidx/lifecycle/h;
    .locals 1

    iget-object v0, p0, Landroidx/fragment/app/j$a;->r:Landroidx/fragment/app/j;

    iget-object v0, v0, Landroidx/fragment/app/j;->F:Landroidx/lifecycle/m;

    return-object v0
.end method

.method public getSavedStateRegistry()LY/c;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/j$a;->r:Landroidx/fragment/app/j;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/activity/ComponentActivity;->getSavedStateRegistry()LY/c;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public getViewModelStore()Landroidx/lifecycle/H;
    .locals 1

    iget-object v0, p0, Landroidx/fragment/app/j$a;->r:Landroidx/fragment/app/j;

    invoke-virtual {v0}, Landroidx/activity/ComponentActivity;->getViewModelStore()Landroidx/lifecycle/H;

    move-result-object v0

    return-object v0
.end method

.method public h(Landroidx/core/util/a;)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/j$a;->r:Landroidx/fragment/app/j;

    invoke-virtual {v0, p1}, Landroidx/activity/ComponentActivity;->h(Landroidx/core/util/a;)V

    return-void
.end method

.method public i(Landroidx/core/util/a;)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/j$a;->r:Landroidx/fragment/app/j;

    invoke-virtual {v0, p1}, Landroidx/activity/ComponentActivity;->i(Landroidx/core/util/a;)V

    return-void
.end method

.method public j(Landroidx/core/util/a;)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/j$a;->r:Landroidx/fragment/app/j;

    invoke-virtual {v0, p1}, Landroidx/activity/ComponentActivity;->j(Landroidx/core/util/a;)V

    return-void
.end method

.method public k()Landroidx/activity/result/ActivityResultRegistry;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/j$a;->r:Landroidx/fragment/app/j;

    invoke-virtual {v0}, Landroidx/activity/ComponentActivity;->k()Landroidx/activity/result/ActivityResultRegistry;

    move-result-object v0

    return-object v0
.end method

.method public l(Landroidx/core/util/a;)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/j$a;->r:Landroidx/fragment/app/j;

    invoke-virtual {v0, p1}, Landroidx/activity/ComponentActivity;->l(Landroidx/core/util/a;)V

    return-void
.end method

.method public o(Landroidx/core/util/a;)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/j$a;->r:Landroidx/fragment/app/j;

    invoke-virtual {v0, p1}, Landroidx/activity/ComponentActivity;->o(Landroidx/core/util/a;)V

    return-void
.end method

.method public q(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/j$a;->r:Landroidx/fragment/app/j;

    invoke-virtual {v0, p1, p2, p3, p4}, Landroidx/fragment/app/j;->dump(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V

    return-void
.end method

.method public r(Landroidx/core/util/a;)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/j$a;->r:Landroidx/fragment/app/j;

    invoke-virtual {v0, p1}, Landroidx/activity/ComponentActivity;->r(Landroidx/core/util/a;)V

    return-void
.end method

.method public s(Landroidx/core/view/v;)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/j$a;->r:Landroidx/fragment/app/j;

    invoke-virtual {v0, p1}, Landroidx/activity/ComponentActivity;->s(Landroidx/core/view/v;)V

    return-void
.end method

.method public t(Landroidx/core/util/a;)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/j$a;->r:Landroidx/fragment/app/j;

    invoke-virtual {v0, p1}, Landroidx/activity/ComponentActivity;->t(Landroidx/core/util/a;)V

    return-void
.end method

.method public bridge synthetic u()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/j$a;->C()Landroidx/fragment/app/j;

    move-result-object v0

    return-object v0
.end method

.method public v()Landroid/view/LayoutInflater;
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/j$a;->r:Landroidx/fragment/app/j;

    invoke-virtual {v0}, Landroid/app/Activity;->getLayoutInflater()Landroid/view/LayoutInflater;

    move-result-object v0

    iget-object v1, p0, Landroidx/fragment/app/j$a;->r:Landroidx/fragment/app/j;

    invoke-virtual {v0, v1}, Landroid/view/LayoutInflater;->cloneInContext(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    return-object v0
.end method

.method public x(Ljava/lang/String;)Z
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/j$a;->r:Landroidx/fragment/app/j;

    invoke-static {v0, p1}, Landroidx/core/app/b;->t(Landroid/app/Activity;Ljava/lang/String;)Z

    move-result p1

    return p1
.end method
