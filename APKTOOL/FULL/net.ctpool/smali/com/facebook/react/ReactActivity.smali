.class public abstract Lcom/facebook/react/ReactActivity;
.super Landroidx/appcompat/app/c;
.source "SourceFile"

# interfaces
.implements Lm2/b;
.implements Lm2/g;


# instance fields
.field private final L:Lcom/facebook/react/u;


# direct methods
.method protected constructor <init>()V
    .locals 1

    invoke-direct {p0}, Landroidx/appcompat/app/c;-><init>()V

    invoke-virtual {p0}, Lcom/facebook/react/ReactActivity;->m0()Lcom/facebook/react/u;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/react/ReactActivity;->L:Lcom/facebook/react/u;

    return-void
.end method


# virtual methods
.method public c()V
    .locals 0

    .line 1
    invoke-super {p0}, Landroidx/activity/ComponentActivity;->onBackPressed()V

    return-void
.end method

.method protected abstract m0()Lcom/facebook/react/u;
.end method

.method public onActivityResult(IILandroid/content/Intent;)V
    .locals 1

    invoke-super {p0, p1, p2, p3}, Landroidx/fragment/app/j;->onActivityResult(IILandroid/content/Intent;)V

    iget-object v0, p0, Lcom/facebook/react/ReactActivity;->L:Lcom/facebook/react/u;

    invoke-virtual {v0, p1, p2, p3}, Lcom/facebook/react/u;->n(IILandroid/content/Intent;)V

    return-void
.end method

.method public onBackPressed()V
    .locals 1

    iget-object v0, p0, Lcom/facebook/react/ReactActivity;->L:Lcom/facebook/react/u;

    invoke-virtual {v0}, Lcom/facebook/react/u;->o()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-super {p0}, Landroidx/activity/ComponentActivity;->onBackPressed()V

    :cond_0
    return-void
.end method

.method public onConfigurationChanged(Landroid/content/res/Configuration;)V
    .locals 1

    invoke-super {p0, p1}, Landroidx/appcompat/app/c;->onConfigurationChanged(Landroid/content/res/Configuration;)V

    iget-object v0, p0, Lcom/facebook/react/ReactActivity;->L:Lcom/facebook/react/u;

    invoke-virtual {v0, p1}, Lcom/facebook/react/u;->p(Landroid/content/res/Configuration;)V

    return-void
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 1

    invoke-super {p0, p1}, Landroidx/fragment/app/j;->onCreate(Landroid/os/Bundle;)V

    iget-object v0, p0, Lcom/facebook/react/ReactActivity;->L:Lcom/facebook/react/u;

    invoke-virtual {v0, p1}, Lcom/facebook/react/u;->q(Landroid/os/Bundle;)V

    return-void
.end method

.method protected onDestroy()V
    .locals 1

    invoke-super {p0}, Landroidx/appcompat/app/c;->onDestroy()V

    iget-object v0, p0, Lcom/facebook/react/ReactActivity;->L:Lcom/facebook/react/u;

    invoke-virtual {v0}, Lcom/facebook/react/u;->r()V

    return-void
.end method

.method public onKeyDown(ILandroid/view/KeyEvent;)Z
    .locals 1

    iget-object v0, p0, Lcom/facebook/react/ReactActivity;->L:Lcom/facebook/react/u;

    invoke-virtual {v0, p1, p2}, Lcom/facebook/react/u;->s(ILandroid/view/KeyEvent;)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-super {p0, p1, p2}, Landroidx/appcompat/app/c;->onKeyDown(ILandroid/view/KeyEvent;)Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    :goto_1
    return p1
.end method

.method public onKeyLongPress(ILandroid/view/KeyEvent;)Z
    .locals 1

    iget-object v0, p0, Lcom/facebook/react/ReactActivity;->L:Lcom/facebook/react/u;

    invoke-virtual {v0, p1, p2}, Lcom/facebook/react/u;->t(ILandroid/view/KeyEvent;)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-super {p0, p1, p2}, Landroid/app/Activity;->onKeyLongPress(ILandroid/view/KeyEvent;)Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    :goto_1
    return p1
.end method

.method public onKeyUp(ILandroid/view/KeyEvent;)Z
    .locals 1

    iget-object v0, p0, Lcom/facebook/react/ReactActivity;->L:Lcom/facebook/react/u;

    invoke-virtual {v0, p1, p2}, Lcom/facebook/react/u;->u(ILandroid/view/KeyEvent;)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-super {p0, p1, p2}, Landroid/app/Activity;->onKeyUp(ILandroid/view/KeyEvent;)Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    :goto_1
    return p1
.end method

.method public onNewIntent(Landroid/content/Intent;)V
    .locals 1

    iget-object v0, p0, Lcom/facebook/react/ReactActivity;->L:Lcom/facebook/react/u;

    invoke-virtual {v0, p1}, Lcom/facebook/react/u;->v(Landroid/content/Intent;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-super {p0, p1}, Landroidx/activity/ComponentActivity;->onNewIntent(Landroid/content/Intent;)V

    :cond_0
    return-void
.end method

.method protected onPause()V
    .locals 1

    invoke-super {p0}, Landroidx/fragment/app/j;->onPause()V

    iget-object v0, p0, Lcom/facebook/react/ReactActivity;->L:Lcom/facebook/react/u;

    invoke-virtual {v0}, Lcom/facebook/react/u;->w()V

    return-void
.end method

.method public onRequestPermissionsResult(I[Ljava/lang/String;[I)V
    .locals 1

    invoke-super {p0, p1, p2, p3}, Landroidx/fragment/app/j;->onRequestPermissionsResult(I[Ljava/lang/String;[I)V

    iget-object v0, p0, Lcom/facebook/react/ReactActivity;->L:Lcom/facebook/react/u;

    invoke-virtual {v0, p1, p2, p3}, Lcom/facebook/react/u;->x(I[Ljava/lang/String;[I)V

    return-void
.end method

.method protected onResume()V
    .locals 1

    invoke-super {p0}, Landroidx/fragment/app/j;->onResume()V

    iget-object v0, p0, Lcom/facebook/react/ReactActivity;->L:Lcom/facebook/react/u;

    invoke-virtual {v0}, Lcom/facebook/react/u;->y()V

    return-void
.end method

.method public onWindowFocusChanged(Z)V
    .locals 1

    invoke-super {p0, p1}, Landroid/app/Activity;->onWindowFocusChanged(Z)V

    iget-object v0, p0, Lcom/facebook/react/ReactActivity;->L:Lcom/facebook/react/u;

    invoke-virtual {v0, p1}, Lcom/facebook/react/u;->z(Z)V

    return-void
.end method

.method public p([Ljava/lang/String;ILm2/h;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/ReactActivity;->L:Lcom/facebook/react/u;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2, p3}, Lcom/facebook/react/u;->A([Ljava/lang/String;ILm2/h;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method
