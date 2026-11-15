.class public Le5/d;
.super Landroid/app/Dialog;
.source "SourceFile"


# instance fields
.field private final m:Z


# direct methods
.method public constructor <init>(Landroid/app/Activity;IZ)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Landroid/app/Dialog;-><init>(Landroid/content/Context;I)V

    .line 2
    .line 3
    .line 4
    iput-boolean p3, p0, Le5/d;->m:Z

    .line 5
    .line 6
    invoke-virtual {p0, p1}, Landroid/app/Dialog;->setOwnerActivity(Landroid/app/Activity;)V

    .line 7
    .line 8
    .line 9
    const/4 p1, 0x0

    .line 10
    invoke-virtual {p0, p1}, Landroid/app/Dialog;->setCancelable(Z)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0, p1}, Landroid/app/Dialog;->setCanceledOnTouchOutside(Z)V

    .line 14
    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Runnable;)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroid/app/Dialog;->isShowing()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    invoke-interface {p1}, Ljava/lang/Runnable;->run()V

    .line 8
    .line 9
    .line 10
    return-void

    .line 11
    :cond_0
    new-instance v0, Le5/d$a;

    .line 12
    .line 13
    invoke-direct {v0, p0, p1}, Le5/d$a;-><init>(Le5/d;Ljava/lang/Runnable;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0, v0}, Landroid/app/Dialog;->setOnDismissListener(Landroid/content/DialogInterface$OnDismissListener;)V

    .line 17
    .line 18
    .line 19
    :try_start_0
    invoke-super {p0}, Landroid/app/Dialog;->dismiss()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 20
    .line 21
    .line 22
    goto :goto_0

    .line 23
    :catch_0
    invoke-interface {p1}, Ljava/lang/Runnable;->run()V

    .line 24
    .line 25
    .line 26
    :goto_0
    return-void
.end method

.method public b(Ljava/lang/Runnable;)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroid/app/Dialog;->isShowing()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-interface {p1}, Ljava/lang/Runnable;->run()V

    .line 8
    .line 9
    .line 10
    return-void

    .line 11
    :cond_0
    new-instance v0, Le5/d$b;

    .line 12
    .line 13
    invoke-direct {v0, p0, p1}, Le5/d$b;-><init>(Le5/d;Ljava/lang/Runnable;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0, v0}, Landroid/app/Dialog;->setOnShowListener(Landroid/content/DialogInterface$OnShowListener;)V

    .line 17
    .line 18
    .line 19
    :try_start_0
    invoke-super {p0}, Landroid/app/Dialog;->show()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 20
    .line 21
    .line 22
    goto :goto_0

    .line 23
    :catch_0
    invoke-interface {p1}, Ljava/lang/Runnable;->run()V

    .line 24
    .line 25
    .line 26
    :goto_0
    return-void
.end method

.method public dismiss()V
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroid/app/Dialog;->isShowing()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    :try_start_0
    invoke-super {p0}, Landroid/app/Dialog;->dismiss()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 9
    .line 10
    .line 11
    :catch_0
    return-void
.end method

.method public onBackPressed()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroid/app/Dialog;->getOwnerActivity()Landroid/app/Activity;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const/4 v1, 0x1

    .line 8
    invoke-virtual {v0, v1}, Landroid/app/Activity;->moveTaskToBack(Z)Z

    .line 9
    .line 10
    .line 11
    :cond_0
    return-void
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_1

    .line 6
    .line 7
    const/4 v1, -0x1

    .line 8
    invoke-virtual {v0, v1, v1}, Landroid/view/Window;->setLayout(II)V

    .line 9
    .line 10
    .line 11
    iget-boolean v1, p0, Le5/d;->m:Z

    .line 12
    .line 13
    if-eqz v1, :cond_0

    .line 14
    .line 15
    sget v1, Le5/c;->a:I

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    sget v1, Le5/c;->b:I

    .line 19
    .line 20
    :goto_0
    invoke-virtual {v0, v1}, Landroid/view/Window;->setWindowAnimations(I)V

    .line 21
    .line 22
    .line 23
    invoke-static {}, Lcom/zoontek/rnbootsplash/b;->o()Z

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    if-eqz v1, :cond_1

    .line 28
    .line 29
    sget v1, Le5/b;->a:I

    .line 30
    .line 31
    invoke-virtual {v0, v1}, Landroid/view/Window;->setBackgroundDrawableResource(I)V

    .line 32
    .line 33
    .line 34
    :cond_1
    invoke-super {p0, p1}, Landroid/app/Dialog;->onCreate(Landroid/os/Bundle;)V

    .line 35
    .line 36
    .line 37
    return-void
.end method

.method public show()V
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroid/app/Dialog;->isShowing()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    :try_start_0
    invoke-super {p0}, Landroid/app/Dialog;->show()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 9
    .line 10
    .line 11
    :catch_0
    return-void
.end method
