.class public abstract Landroidx/appcompat/app/q;
.super Landroidx/activity/g;
.source "SourceFile"

# interfaces
.implements Landroidx/appcompat/app/d;


# instance fields
.field private o:Landroidx/appcompat/app/f;

.field private final p:Landroidx/core/view/p$a;


# direct methods
.method public constructor <init>(Landroid/content/Context;I)V
    .locals 1

    invoke-static {p1, p2}, Landroidx/appcompat/app/q;->i(Landroid/content/Context;I)I

    move-result v0

    invoke-direct {p0, p1, v0}, Landroidx/activity/g;-><init>(Landroid/content/Context;I)V

    new-instance v0, Landroidx/appcompat/app/p;

    invoke-direct {v0, p0}, Landroidx/appcompat/app/p;-><init>(Landroidx/appcompat/app/q;)V

    iput-object v0, p0, Landroidx/appcompat/app/q;->p:Landroidx/core/view/p$a;

    invoke-virtual {p0}, Landroidx/appcompat/app/q;->h()Landroidx/appcompat/app/f;

    move-result-object v0

    invoke-static {p1, p2}, Landroidx/appcompat/app/q;->i(Landroid/content/Context;I)I

    move-result p1

    invoke-virtual {v0, p1}, Landroidx/appcompat/app/f;->P(I)V

    const/4 p1, 0x0

    invoke-virtual {v0, p1}, Landroidx/appcompat/app/f;->z(Landroid/os/Bundle;)V

    return-void
.end method

.method private static i(Landroid/content/Context;I)I
    .locals 2

    .line 1
    if-nez p1, :cond_0

    new-instance p1, Landroid/util/TypedValue;

    invoke-direct {p1}, Landroid/util/TypedValue;-><init>()V

    invoke-virtual {p0}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object p0

    sget v0, Le/a;->w:I

    const/4 v1, 0x1

    invoke-virtual {p0, v0, p1, v1}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    iget p1, p1, Landroid/util/TypedValue;->resourceId:I

    :cond_0
    return p1
.end method


# virtual methods
.method public addContentView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
    .locals 1

    invoke-virtual {p0}, Landroidx/appcompat/app/q;->h()Landroidx/appcompat/app/f;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Landroidx/appcompat/app/f;->e(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    return-void
.end method

.method public dismiss()V
    .locals 1

    invoke-super {p0}, Landroid/app/Dialog;->dismiss()V

    invoke-virtual {p0}, Landroidx/appcompat/app/q;->h()Landroidx/appcompat/app/f;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/appcompat/app/f;->A()V

    return-void
.end method

.method public dispatchKeyEvent(Landroid/view/KeyEvent;)Z
    .locals 2

    invoke-virtual {p0}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    iget-object v1, p0, Landroidx/appcompat/app/q;->p:Landroidx/core/view/p$a;

    invoke-static {v1, v0, p0, p1}, Landroidx/core/view/p;->e(Landroidx/core/view/p$a;Landroid/view/View;Landroid/view/Window$Callback;Landroid/view/KeyEvent;)Z

    move-result p1

    return p1
.end method

.method public f(Landroidx/appcompat/view/b;)V
    .locals 0

    .line 1
    return-void
.end method

.method public findViewById(I)Landroid/view/View;
    .locals 1

    invoke-virtual {p0}, Landroidx/appcompat/app/q;->h()Landroidx/appcompat/app/f;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroidx/appcompat/app/f;->l(I)Landroid/view/View;

    move-result-object p1

    return-object p1
.end method

.method public g(Landroidx/appcompat/view/b;)V
    .locals 0

    .line 1
    return-void
.end method

.method public h()Landroidx/appcompat/app/f;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/appcompat/app/q;->o:Landroidx/appcompat/app/f;

    if-nez v0, :cond_0

    invoke-static {p0, p0}, Landroidx/appcompat/app/f;->k(Landroid/app/Dialog;Landroidx/appcompat/app/d;)Landroidx/appcompat/app/f;

    move-result-object v0

    iput-object v0, p0, Landroidx/appcompat/app/q;->o:Landroidx/appcompat/app/f;

    :cond_0
    iget-object v0, p0, Landroidx/appcompat/app/q;->o:Landroidx/appcompat/app/f;

    return-object v0
.end method

.method public invalidateOptionsMenu()V
    .locals 1

    invoke-virtual {p0}, Landroidx/appcompat/app/q;->h()Landroidx/appcompat/app/f;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/appcompat/app/f;->v()V

    return-void
.end method

.method j(Landroid/view/KeyEvent;)Z
    .locals 0

    .line 1
    invoke-super {p0, p1}, Landroid/app/Dialog;->dispatchKeyEvent(Landroid/view/KeyEvent;)Z

    move-result p1

    return p1
.end method

.method public k(I)Z
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroidx/appcompat/app/q;->h()Landroidx/appcompat/app/f;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroidx/appcompat/app/f;->I(I)Z

    move-result p1

    return p1
.end method

.method public n(Landroidx/appcompat/view/b$a;)Landroidx/appcompat/view/b;
    .locals 0

    .line 1
    const/4 p1, 0x0

    return-object p1
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 1

    invoke-virtual {p0}, Landroidx/appcompat/app/q;->h()Landroidx/appcompat/app/f;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/appcompat/app/f;->u()V

    invoke-super {p0, p1}, Landroidx/activity/g;->onCreate(Landroid/os/Bundle;)V

    invoke-virtual {p0}, Landroidx/appcompat/app/q;->h()Landroidx/appcompat/app/f;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroidx/appcompat/app/f;->z(Landroid/os/Bundle;)V

    return-void
.end method

.method protected onStop()V
    .locals 1

    invoke-super {p0}, Landroidx/activity/g;->onStop()V

    invoke-virtual {p0}, Landroidx/appcompat/app/q;->h()Landroidx/appcompat/app/f;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/appcompat/app/f;->F()V

    return-void
.end method

.method public setContentView(I)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroidx/appcompat/app/q;->h()Landroidx/appcompat/app/f;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroidx/appcompat/app/f;->J(I)V

    return-void
.end method

.method public setContentView(Landroid/view/View;)V
    .locals 1

    .line 2
    invoke-virtual {p0}, Landroidx/appcompat/app/q;->h()Landroidx/appcompat/app/f;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroidx/appcompat/app/f;->K(Landroid/view/View;)V

    return-void
.end method

.method public setContentView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
    .locals 1

    .line 3
    invoke-virtual {p0}, Landroidx/appcompat/app/q;->h()Landroidx/appcompat/app/f;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Landroidx/appcompat/app/f;->L(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    return-void
.end method

.method public setTitle(I)V
    .locals 2

    .line 1
    invoke-super {p0, p1}, Landroid/app/Dialog;->setTitle(I)V

    invoke-virtual {p0}, Landroidx/appcompat/app/q;->h()Landroidx/appcompat/app/f;

    move-result-object v0

    invoke-virtual {p0}, Landroid/app/Dialog;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1, p1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroidx/appcompat/app/f;->Q(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public setTitle(Ljava/lang/CharSequence;)V
    .locals 1

    .line 2
    invoke-super {p0, p1}, Landroid/app/Dialog;->setTitle(Ljava/lang/CharSequence;)V

    invoke-virtual {p0}, Landroidx/appcompat/app/q;->h()Landroidx/appcompat/app/f;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroidx/appcompat/app/f;->Q(Ljava/lang/CharSequence;)V

    return-void
.end method
