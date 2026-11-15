.class public Landroidx/activity/g;
.super Landroid/app/Dialog;
.source "SourceFile"

# interfaces
.implements Landroidx/lifecycle/l;
.implements Landroidx/activity/l;


# instance fields
.field private m:Landroidx/lifecycle/m;

.field private final n:Landroidx/activity/OnBackPressedDispatcher;


# direct methods
.method public constructor <init>(Landroid/content/Context;I)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1, p2}, Landroid/app/Dialog;-><init>(Landroid/content/Context;I)V

    new-instance p1, Landroidx/activity/OnBackPressedDispatcher;

    new-instance p2, Landroidx/activity/f;

    invoke-direct {p2, p0}, Landroidx/activity/f;-><init>(Landroidx/activity/g;)V

    invoke-direct {p1, p2}, Landroidx/activity/OnBackPressedDispatcher;-><init>(Ljava/lang/Runnable;)V

    iput-object p1, p0, Landroidx/activity/g;->n:Landroidx/activity/OnBackPressedDispatcher;

    return-void
.end method

.method public static synthetic a(Landroidx/activity/g;)V
    .locals 0

    .line 1
    invoke-static {p0}, Landroidx/activity/g;->e(Landroidx/activity/g;)V

    return-void
.end method

.method private final c()Landroidx/lifecycle/m;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/activity/g;->m:Landroidx/lifecycle/m;

    if-nez v0, :cond_0

    new-instance v0, Landroidx/lifecycle/m;

    invoke-direct {v0, p0}, Landroidx/lifecycle/m;-><init>(Landroidx/lifecycle/l;)V

    iput-object v0, p0, Landroidx/activity/g;->m:Landroidx/lifecycle/m;

    :cond_0
    return-object v0
.end method

.method private final d()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-static {v0}, Lw5/k;->c(Ljava/lang/Object;)V

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    invoke-static {v0, p0}, Landroidx/lifecycle/J;->a(Landroid/view/View;Landroidx/lifecycle/l;)V

    invoke-virtual {p0}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-static {v0}, Lw5/k;->c(Ljava/lang/Object;)V

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    const-string v1, "window!!.decorView"

    invoke-static {v0, v1}, Lw5/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0, p0}, Landroidx/activity/n;->a(Landroid/view/View;Landroidx/activity/l;)V

    return-void
.end method

.method private static final e(Landroidx/activity/g;)V
    .locals 1

    .line 1
    const-string v0, "this$0"

    invoke-static {p0, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0}, Landroid/app/Dialog;->onBackPressed()V

    return-void
.end method


# virtual methods
.method public addContentView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
    .locals 1

    const-string v0, "view"

    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Landroidx/activity/g;->d()V

    invoke-super {p0, p1, p2}, Landroid/app/Dialog;->addContentView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    return-void
.end method

.method public final b()Landroidx/activity/OnBackPressedDispatcher;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/activity/g;->n:Landroidx/activity/OnBackPressedDispatcher;

    return-object v0
.end method

.method public final getLifecycle()Landroidx/lifecycle/h;
    .locals 1

    invoke-direct {p0}, Landroidx/activity/g;->c()Landroidx/lifecycle/m;

    move-result-object v0

    return-object v0
.end method

.method public onBackPressed()V
    .locals 1

    iget-object v0, p0, Landroidx/activity/g;->n:Landroidx/activity/OnBackPressedDispatcher;

    invoke-virtual {v0}, Landroidx/activity/OnBackPressedDispatcher;->f()V

    return-void
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 1

    invoke-super {p0, p1}, Landroid/app/Dialog;->onCreate(Landroid/os/Bundle;)V

    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v0, 0x21

    if-lt p1, v0, :cond_0

    iget-object p1, p0, Landroidx/activity/g;->n:Landroidx/activity/OnBackPressedDispatcher;

    invoke-static {p0}, Landroidx/activity/e;->a(Landroidx/activity/g;)Landroid/window/OnBackInvokedDispatcher;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroidx/activity/OnBackPressedDispatcher;->g(Landroid/window/OnBackInvokedDispatcher;)V

    :cond_0
    invoke-direct {p0}, Landroidx/activity/g;->c()Landroidx/lifecycle/m;

    move-result-object p1

    sget-object v0, Landroidx/lifecycle/h$b;->ON_CREATE:Landroidx/lifecycle/h$b;

    invoke-virtual {p1, v0}, Landroidx/lifecycle/m;->h(Landroidx/lifecycle/h$b;)V

    return-void
.end method

.method protected onStart()V
    .locals 2

    invoke-super {p0}, Landroid/app/Dialog;->onStart()V

    invoke-direct {p0}, Landroidx/activity/g;->c()Landroidx/lifecycle/m;

    move-result-object v0

    sget-object v1, Landroidx/lifecycle/h$b;->ON_RESUME:Landroidx/lifecycle/h$b;

    invoke-virtual {v0, v1}, Landroidx/lifecycle/m;->h(Landroidx/lifecycle/h$b;)V

    return-void
.end method

.method protected onStop()V
    .locals 2

    invoke-direct {p0}, Landroidx/activity/g;->c()Landroidx/lifecycle/m;

    move-result-object v0

    sget-object v1, Landroidx/lifecycle/h$b;->ON_DESTROY:Landroidx/lifecycle/h$b;

    invoke-virtual {v0, v1}, Landroidx/lifecycle/m;->h(Landroidx/lifecycle/h$b;)V

    const/4 v0, 0x0

    iput-object v0, p0, Landroidx/activity/g;->m:Landroidx/lifecycle/m;

    invoke-super {p0}, Landroid/app/Dialog;->onStop()V

    return-void
.end method

.method public setContentView(I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Landroidx/activity/g;->d()V

    invoke-super {p0, p1}, Landroid/app/Dialog;->setContentView(I)V

    return-void
.end method

.method public setContentView(Landroid/view/View;)V
    .locals 1

    .line 2
    const-string v0, "view"

    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Landroidx/activity/g;->d()V

    invoke-super {p0, p1}, Landroid/app/Dialog;->setContentView(Landroid/view/View;)V

    return-void
.end method

.method public setContentView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
    .locals 1

    .line 3
    const-string v0, "view"

    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Landroidx/activity/g;->d()V

    invoke-super {p0, p1, p2}, Landroid/app/Dialog;->setContentView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    return-void
.end method
