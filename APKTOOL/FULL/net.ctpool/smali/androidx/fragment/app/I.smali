.class Landroidx/fragment/app/I;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/lifecycle/g;
.implements LY/e;
.implements Landroidx/lifecycle/I;


# instance fields
.field private final m:Landroidx/fragment/app/Fragment;

.field private final n:Landroidx/lifecycle/H;

.field private o:Landroidx/lifecycle/m;

.field private p:LY/d;


# direct methods
.method constructor <init>(Landroidx/fragment/app/Fragment;Landroidx/lifecycle/H;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Landroidx/fragment/app/I;->o:Landroidx/lifecycle/m;

    iput-object v0, p0, Landroidx/fragment/app/I;->p:LY/d;

    iput-object p1, p0, Landroidx/fragment/app/I;->m:Landroidx/fragment/app/Fragment;

    iput-object p2, p0, Landroidx/fragment/app/I;->n:Landroidx/lifecycle/H;

    return-void
.end method


# virtual methods
.method a(Landroidx/lifecycle/h$b;)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/I;->o:Landroidx/lifecycle/m;

    invoke-virtual {v0, p1}, Landroidx/lifecycle/m;->h(Landroidx/lifecycle/h$b;)V

    return-void
.end method

.method c()V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/I;->o:Landroidx/lifecycle/m;

    if-nez v0, :cond_0

    new-instance v0, Landroidx/lifecycle/m;

    invoke-direct {v0, p0}, Landroidx/lifecycle/m;-><init>(Landroidx/lifecycle/l;)V

    iput-object v0, p0, Landroidx/fragment/app/I;->o:Landroidx/lifecycle/m;

    invoke-static {p0}, LY/d;->a(LY/e;)LY/d;

    move-result-object v0

    iput-object v0, p0, Landroidx/fragment/app/I;->p:LY/d;

    invoke-virtual {v0}, LY/d;->c()V

    :cond_0
    return-void
.end method

.method d()Z
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/I;->o:Landroidx/lifecycle/m;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method e(Landroid/os/Bundle;)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/I;->p:LY/d;

    invoke-virtual {v0, p1}, LY/d;->d(Landroid/os/Bundle;)V

    return-void
.end method

.method f(Landroid/os/Bundle;)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/I;->p:LY/d;

    invoke-virtual {v0, p1}, LY/d;->e(Landroid/os/Bundle;)V

    return-void
.end method

.method g(Landroidx/lifecycle/h$c;)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/I;->o:Landroidx/lifecycle/m;

    invoke-virtual {v0, p1}, Landroidx/lifecycle/m;->o(Landroidx/lifecycle/h$c;)V

    return-void
.end method

.method public getDefaultViewModelCreationExtras()LP/a;
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/I;->m:Landroidx/fragment/app/Fragment;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->requireContext()Landroid/content/Context;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    :goto_0
    instance-of v1, v0, Landroid/content/ContextWrapper;

    .line 12
    .line 13
    if-eqz v1, :cond_1

    .line 14
    .line 15
    instance-of v1, v0, Landroid/app/Application;

    .line 16
    .line 17
    if-eqz v1, :cond_0

    .line 18
    .line 19
    check-cast v0, Landroid/app/Application;

    .line 20
    .line 21
    goto :goto_1

    .line 22
    :cond_0
    check-cast v0, Landroid/content/ContextWrapper;

    .line 23
    .line 24
    invoke-virtual {v0}, Landroid/content/ContextWrapper;->getBaseContext()Landroid/content/Context;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    goto :goto_0

    .line 29
    :cond_1
    const/4 v0, 0x0

    .line 30
    :goto_1
    new-instance v1, LP/d;

    .line 31
    .line 32
    invoke-direct {v1}, LP/d;-><init>()V

    .line 33
    .line 34
    .line 35
    if-eqz v0, :cond_2

    .line 36
    .line 37
    sget-object v2, Landroidx/lifecycle/F$a;->h:LP/a$b;

    .line 38
    .line 39
    invoke-virtual {v1, v2, v0}, LP/d;->c(LP/a$b;Ljava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    :cond_2
    sget-object v0, Landroidx/lifecycle/y;->a:LP/a$b;

    .line 43
    .line 44
    iget-object v2, p0, Landroidx/fragment/app/I;->m:Landroidx/fragment/app/Fragment;

    .line 45
    .line 46
    invoke-virtual {v1, v0, v2}, LP/d;->c(LP/a$b;Ljava/lang/Object;)V

    .line 47
    .line 48
    .line 49
    sget-object v0, Landroidx/lifecycle/y;->b:LP/a$b;

    .line 50
    .line 51
    invoke-virtual {v1, v0, p0}, LP/d;->c(LP/a$b;Ljava/lang/Object;)V

    .line 52
    .line 53
    .line 54
    iget-object v0, p0, Landroidx/fragment/app/I;->m:Landroidx/fragment/app/Fragment;

    .line 55
    .line 56
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->getArguments()Landroid/os/Bundle;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    if-eqz v0, :cond_3

    .line 61
    .line 62
    sget-object v0, Landroidx/lifecycle/y;->c:LP/a$b;

    .line 63
    .line 64
    iget-object v2, p0, Landroidx/fragment/app/I;->m:Landroidx/fragment/app/Fragment;

    .line 65
    .line 66
    invoke-virtual {v2}, Landroidx/fragment/app/Fragment;->getArguments()Landroid/os/Bundle;

    .line 67
    .line 68
    .line 69
    move-result-object v2

    .line 70
    invoke-virtual {v1, v0, v2}, LP/d;->c(LP/a$b;Ljava/lang/Object;)V

    .line 71
    .line 72
    .line 73
    :cond_3
    return-object v1
.end method

.method public getLifecycle()Landroidx/lifecycle/h;
    .locals 1

    invoke-virtual {p0}, Landroidx/fragment/app/I;->c()V

    iget-object v0, p0, Landroidx/fragment/app/I;->o:Landroidx/lifecycle/m;

    return-object v0
.end method

.method public getSavedStateRegistry()LY/c;
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/I;->c()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Landroidx/fragment/app/I;->p:LY/d;

    .line 5
    .line 6
    invoke-virtual {v0}, LY/d;->b()LY/c;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    return-object v0
.end method

.method public getViewModelStore()Landroidx/lifecycle/H;
    .locals 1

    invoke-virtual {p0}, Landroidx/fragment/app/I;->c()V

    iget-object v0, p0, Landroidx/fragment/app/I;->n:Landroidx/lifecycle/H;

    return-object v0
.end method
