.class public abstract Landroidx/fragment/app/j;
.super Landroidx/activity/ComponentActivity;
.source "SourceFile"

# interfaces
.implements Landroidx/core/app/b$c;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/fragment/app/j$a;
    }
.end annotation


# instance fields
.field final E:Landroidx/fragment/app/m;

.field final F:Landroidx/lifecycle/m;

.field G:Z

.field H:Z

.field I:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Landroidx/activity/ComponentActivity;-><init>()V

    new-instance v0, Landroidx/fragment/app/j$a;

    invoke-direct {v0, p0}, Landroidx/fragment/app/j$a;-><init>(Landroidx/fragment/app/j;)V

    invoke-static {v0}, Landroidx/fragment/app/m;->b(Landroidx/fragment/app/o;)Landroidx/fragment/app/m;

    move-result-object v0

    iput-object v0, p0, Landroidx/fragment/app/j;->E:Landroidx/fragment/app/m;

    new-instance v0, Landroidx/lifecycle/m;

    invoke-direct {v0, p0}, Landroidx/lifecycle/m;-><init>(Landroidx/lifecycle/l;)V

    iput-object v0, p0, Landroidx/fragment/app/j;->F:Landroidx/lifecycle/m;

    const/4 v0, 0x1

    iput-boolean v0, p0, Landroidx/fragment/app/j;->I:Z

    invoke-direct {p0}, Landroidx/fragment/app/j;->Q()V

    return-void
.end method

.method public static synthetic J(Landroidx/fragment/app/j;Landroid/content/Context;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Landroidx/fragment/app/j;->U(Landroid/content/Context;)V

    return-void
.end method

.method public static synthetic K(Landroidx/fragment/app/j;Landroid/content/res/Configuration;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Landroidx/fragment/app/j;->S(Landroid/content/res/Configuration;)V

    return-void
.end method

.method public static synthetic L(Landroidx/fragment/app/j;)Landroid/os/Bundle;
    .locals 0

    .line 1
    invoke-direct {p0}, Landroidx/fragment/app/j;->R()Landroid/os/Bundle;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic M(Landroidx/fragment/app/j;Landroid/content/Intent;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Landroidx/fragment/app/j;->T(Landroid/content/Intent;)V

    return-void
.end method

.method private Q()V
    .locals 3

    .line 1
    invoke-virtual {p0}, Landroidx/activity/ComponentActivity;->getSavedStateRegistry()LY/c;

    move-result-object v0

    new-instance v1, Landroidx/fragment/app/f;

    invoke-direct {v1, p0}, Landroidx/fragment/app/f;-><init>(Landroidx/fragment/app/j;)V

    const-string v2, "android:support:lifecycle"

    invoke-virtual {v0, v2, v1}, LY/c;->h(Ljava/lang/String;LY/c$c;)V

    new-instance v0, Landroidx/fragment/app/g;

    invoke-direct {v0, p0}, Landroidx/fragment/app/g;-><init>(Landroidx/fragment/app/j;)V

    invoke-virtual {p0, v0}, Landroidx/activity/ComponentActivity;->e(Landroidx/core/util/a;)V

    new-instance v0, Landroidx/fragment/app/h;

    invoke-direct {v0, p0}, Landroidx/fragment/app/h;-><init>(Landroidx/fragment/app/j;)V

    invoke-virtual {p0, v0}, Landroidx/activity/ComponentActivity;->A(Landroidx/core/util/a;)V

    new-instance v0, Landroidx/fragment/app/i;

    invoke-direct {v0, p0}, Landroidx/fragment/app/i;-><init>(Landroidx/fragment/app/j;)V

    invoke-virtual {p0, v0}, Landroidx/activity/ComponentActivity;->z(Lc/b;)V

    return-void
.end method

.method private synthetic R()Landroid/os/Bundle;
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/j;->V()V

    iget-object v0, p0, Landroidx/fragment/app/j;->F:Landroidx/lifecycle/m;

    sget-object v1, Landroidx/lifecycle/h$b;->ON_STOP:Landroidx/lifecycle/h$b;

    invoke-virtual {v0, v1}, Landroidx/lifecycle/m;->h(Landroidx/lifecycle/h$b;)V

    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    return-object v0
.end method

.method private synthetic S(Landroid/content/res/Configuration;)V
    .locals 0

    .line 1
    iget-object p1, p0, Landroidx/fragment/app/j;->E:Landroidx/fragment/app/m;

    invoke-virtual {p1}, Landroidx/fragment/app/m;->m()V

    return-void
.end method

.method private synthetic T(Landroid/content/Intent;)V
    .locals 0

    .line 1
    iget-object p1, p0, Landroidx/fragment/app/j;->E:Landroidx/fragment/app/m;

    invoke-virtual {p1}, Landroidx/fragment/app/m;->m()V

    return-void
.end method

.method private synthetic U(Landroid/content/Context;)V
    .locals 1

    .line 1
    iget-object p1, p0, Landroidx/fragment/app/j;->E:Landroidx/fragment/app/m;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroidx/fragment/app/m;->a(Landroidx/fragment/app/Fragment;)V

    return-void
.end method

.method private static W(Landroidx/fragment/app/w;Landroidx/lifecycle/h$c;)Z
    .locals 5

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/w;->v0()Ljava/util/List;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p0

    const/4 v0, 0x0

    :cond_0
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/fragment/app/Fragment;

    if-nez v1, :cond_1

    goto :goto_0

    :cond_1
    invoke-virtual {v1}, Landroidx/fragment/app/Fragment;->getHost()Ljava/lang/Object;

    move-result-object v2

    if-eqz v2, :cond_2

    invoke-virtual {v1}, Landroidx/fragment/app/Fragment;->getChildFragmentManager()Landroidx/fragment/app/w;

    move-result-object v2

    invoke-static {v2, p1}, Landroidx/fragment/app/j;->W(Landroidx/fragment/app/w;Landroidx/lifecycle/h$c;)Z

    move-result v2

    or-int/2addr v0, v2

    :cond_2
    iget-object v2, v1, Landroidx/fragment/app/Fragment;->mViewLifecycleOwner:Landroidx/fragment/app/I;

    const/4 v3, 0x1

    if-eqz v2, :cond_3

    invoke-virtual {v2}, Landroidx/fragment/app/I;->getLifecycle()Landroidx/lifecycle/h;

    move-result-object v2

    invoke-virtual {v2}, Landroidx/lifecycle/h;->b()Landroidx/lifecycle/h$c;

    move-result-object v2

    sget-object v4, Landroidx/lifecycle/h$c;->p:Landroidx/lifecycle/h$c;

    invoke-virtual {v2, v4}, Landroidx/lifecycle/h$c;->e(Landroidx/lifecycle/h$c;)Z

    move-result v2

    if-eqz v2, :cond_3

    iget-object v0, v1, Landroidx/fragment/app/Fragment;->mViewLifecycleOwner:Landroidx/fragment/app/I;

    invoke-virtual {v0, p1}, Landroidx/fragment/app/I;->g(Landroidx/lifecycle/h$c;)V

    move v0, v3

    :cond_3
    iget-object v2, v1, Landroidx/fragment/app/Fragment;->mLifecycleRegistry:Landroidx/lifecycle/m;

    invoke-virtual {v2}, Landroidx/lifecycle/m;->b()Landroidx/lifecycle/h$c;

    move-result-object v2

    sget-object v4, Landroidx/lifecycle/h$c;->p:Landroidx/lifecycle/h$c;

    invoke-virtual {v2, v4}, Landroidx/lifecycle/h$c;->e(Landroidx/lifecycle/h$c;)Z

    move-result v2

    if-eqz v2, :cond_0

    iget-object v0, v1, Landroidx/fragment/app/Fragment;->mLifecycleRegistry:Landroidx/lifecycle/m;

    invoke-virtual {v0, p1}, Landroidx/lifecycle/m;->o(Landroidx/lifecycle/h$c;)V

    move v0, v3

    goto :goto_0

    :cond_4
    return v0
.end method


# virtual methods
.method final N(Landroid/view/View;Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/j;->E:Landroidx/fragment/app/m;

    invoke-virtual {v0, p1, p2, p3, p4}, Landroidx/fragment/app/m;->n(Landroid/view/View;Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;

    move-result-object p1

    return-object p1
.end method

.method public O()Landroidx/fragment/app/w;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/j;->E:Landroidx/fragment/app/m;

    invoke-virtual {v0}, Landroidx/fragment/app/m;->l()Landroidx/fragment/app/w;

    move-result-object v0

    return-object v0
.end method

.method public P()Landroidx/loader/app/a;
    .locals 1

    .line 1
    invoke-static {p0}, Landroidx/loader/app/a;->b(Landroidx/lifecycle/l;)Landroidx/loader/app/a;

    move-result-object v0

    return-object v0
.end method

.method V()V
    .locals 2

    .line 1
    :cond_0
    invoke-virtual {p0}, Landroidx/fragment/app/j;->O()Landroidx/fragment/app/w;

    move-result-object v0

    sget-object v1, Landroidx/lifecycle/h$c;->o:Landroidx/lifecycle/h$c;

    invoke-static {v0, v1}, Landroidx/fragment/app/j;->W(Landroidx/fragment/app/w;Landroidx/lifecycle/h$c;)Z

    move-result v0

    if-nez v0, :cond_0

    return-void
.end method

.method public X(Landroidx/fragment/app/Fragment;)V
    .locals 0

    .line 1
    return-void
.end method

.method protected Y()V
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/j;->F:Landroidx/lifecycle/m;

    sget-object v1, Landroidx/lifecycle/h$b;->ON_RESUME:Landroidx/lifecycle/h$b;

    invoke-virtual {v0, v1}, Landroidx/lifecycle/m;->h(Landroidx/lifecycle/h$b;)V

    iget-object v0, p0, Landroidx/fragment/app/j;->E:Landroidx/fragment/app/m;

    invoke-virtual {v0}, Landroidx/fragment/app/m;->h()V

    return-void
.end method

.method public final a(I)V
    .locals 0

    .line 1
    return-void
.end method

.method public dump(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V
    .locals 2

    invoke-super {p0, p1, p2, p3, p4}, Landroid/app/Activity;->dump(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V

    invoke-virtual {p0, p4}, Landroidx/core/app/g;->u([Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, "Local FragmentActivity "

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    invoke-static {p0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, " State:"

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "  "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v1, "mCreated="

    invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-boolean v1, p0, Landroidx/fragment/app/j;->G:Z

    invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->print(Z)V

    const-string v1, " mResumed="

    invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-boolean v1, p0, Landroidx/fragment/app/j;->H:Z

    invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->print(Z)V

    const-string v1, " mStopped="

    invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-boolean v1, p0, Landroidx/fragment/app/j;->I:Z

    invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->print(Z)V

    invoke-virtual {p0}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    move-result-object v1

    if-eqz v1, :cond_1

    invoke-static {p0}, Landroidx/loader/app/a;->b(Landroidx/lifecycle/l;)Landroidx/loader/app/a;

    move-result-object v1

    invoke-virtual {v1, v0, p2, p3, p4}, Landroidx/loader/app/a;->a(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V

    :cond_1
    iget-object v0, p0, Landroidx/fragment/app/j;->E:Landroidx/fragment/app/m;

    invoke-virtual {v0}, Landroidx/fragment/app/m;->l()Landroidx/fragment/app/w;

    move-result-object v0

    invoke-virtual {v0, p1, p2, p3, p4}, Landroidx/fragment/app/w;->X(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V

    return-void
.end method

.method protected onActivityResult(IILandroid/content/Intent;)V
    .locals 1

    iget-object v0, p0, Landroidx/fragment/app/j;->E:Landroidx/fragment/app/m;

    invoke-virtual {v0}, Landroidx/fragment/app/m;->m()V

    invoke-super {p0, p1, p2, p3}, Landroidx/activity/ComponentActivity;->onActivityResult(IILandroid/content/Intent;)V

    return-void
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 1

    invoke-super {p0, p1}, Landroidx/activity/ComponentActivity;->onCreate(Landroid/os/Bundle;)V

    iget-object p1, p0, Landroidx/fragment/app/j;->F:Landroidx/lifecycle/m;

    sget-object v0, Landroidx/lifecycle/h$b;->ON_CREATE:Landroidx/lifecycle/h$b;

    invoke-virtual {p1, v0}, Landroidx/lifecycle/m;->h(Landroidx/lifecycle/h$b;)V

    iget-object p1, p0, Landroidx/fragment/app/j;->E:Landroidx/fragment/app/m;

    invoke-virtual {p1}, Landroidx/fragment/app/m;->e()V

    return-void
.end method

.method public onCreateView(Landroid/view/View;Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;
    .locals 1

    .line 1
    invoke-virtual {p0, p1, p2, p3, p4}, Landroidx/fragment/app/j;->N(Landroid/view/View;Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;

    move-result-object v0

    if-nez v0, :cond_0

    invoke-super {p0, p1, p2, p3, p4}, Landroid/app/Activity;->onCreateView(Landroid/view/View;Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;

    move-result-object p1

    return-object p1

    :cond_0
    return-object v0
.end method

.method public onCreateView(Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;
    .locals 1

    .line 2
    const/4 v0, 0x0

    invoke-virtual {p0, v0, p1, p2, p3}, Landroidx/fragment/app/j;->N(Landroid/view/View;Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;

    move-result-object v0

    if-nez v0, :cond_0

    invoke-super {p0, p1, p2, p3}, Landroid/app/Activity;->onCreateView(Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;

    move-result-object p1

    return-object p1

    :cond_0
    return-object v0
.end method

.method protected onDestroy()V
    .locals 2

    invoke-super {p0}, Landroid/app/Activity;->onDestroy()V

    iget-object v0, p0, Landroidx/fragment/app/j;->E:Landroidx/fragment/app/m;

    invoke-virtual {v0}, Landroidx/fragment/app/m;->f()V

    iget-object v0, p0, Landroidx/fragment/app/j;->F:Landroidx/lifecycle/m;

    sget-object v1, Landroidx/lifecycle/h$b;->ON_DESTROY:Landroidx/lifecycle/h$b;

    invoke-virtual {v0, v1}, Landroidx/lifecycle/m;->h(Landroidx/lifecycle/h$b;)V

    return-void
.end method

.method public onMenuItemSelected(ILandroid/view/MenuItem;)Z
    .locals 1

    invoke-super {p0, p1, p2}, Landroidx/activity/ComponentActivity;->onMenuItemSelected(ILandroid/view/MenuItem;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 v0, 0x6

    if-ne p1, v0, :cond_1

    iget-object p1, p0, Landroidx/fragment/app/j;->E:Landroidx/fragment/app/m;

    invoke-virtual {p1, p2}, Landroidx/fragment/app/m;->d(Landroid/view/MenuItem;)Z

    move-result p1

    return p1

    :cond_1
    const/4 p1, 0x0

    return p1
.end method

.method protected onPause()V
    .locals 2

    invoke-super {p0}, Landroid/app/Activity;->onPause()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Landroidx/fragment/app/j;->H:Z

    iget-object v0, p0, Landroidx/fragment/app/j;->E:Landroidx/fragment/app/m;

    invoke-virtual {v0}, Landroidx/fragment/app/m;->g()V

    iget-object v0, p0, Landroidx/fragment/app/j;->F:Landroidx/lifecycle/m;

    sget-object v1, Landroidx/lifecycle/h$b;->ON_PAUSE:Landroidx/lifecycle/h$b;

    invoke-virtual {v0, v1}, Landroidx/lifecycle/m;->h(Landroidx/lifecycle/h$b;)V

    return-void
.end method

.method protected onPostResume()V
    .locals 0

    invoke-super {p0}, Landroid/app/Activity;->onPostResume()V

    invoke-virtual {p0}, Landroidx/fragment/app/j;->Y()V

    return-void
.end method

.method public onRequestPermissionsResult(I[Ljava/lang/String;[I)V
    .locals 1

    iget-object v0, p0, Landroidx/fragment/app/j;->E:Landroidx/fragment/app/m;

    invoke-virtual {v0}, Landroidx/fragment/app/m;->m()V

    invoke-super {p0, p1, p2, p3}, Landroidx/activity/ComponentActivity;->onRequestPermissionsResult(I[Ljava/lang/String;[I)V

    return-void
.end method

.method protected onResume()V
    .locals 1

    iget-object v0, p0, Landroidx/fragment/app/j;->E:Landroidx/fragment/app/m;

    invoke-virtual {v0}, Landroidx/fragment/app/m;->m()V

    invoke-super {p0}, Landroid/app/Activity;->onResume()V

    const/4 v0, 0x1

    iput-boolean v0, p0, Landroidx/fragment/app/j;->H:Z

    iget-object v0, p0, Landroidx/fragment/app/j;->E:Landroidx/fragment/app/m;

    invoke-virtual {v0}, Landroidx/fragment/app/m;->k()Z

    return-void
.end method

.method protected onStart()V
    .locals 2

    iget-object v0, p0, Landroidx/fragment/app/j;->E:Landroidx/fragment/app/m;

    invoke-virtual {v0}, Landroidx/fragment/app/m;->m()V

    invoke-super {p0}, Landroid/app/Activity;->onStart()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Landroidx/fragment/app/j;->I:Z

    iget-boolean v0, p0, Landroidx/fragment/app/j;->G:Z

    if-nez v0, :cond_0

    const/4 v0, 0x1

    iput-boolean v0, p0, Landroidx/fragment/app/j;->G:Z

    iget-object v0, p0, Landroidx/fragment/app/j;->E:Landroidx/fragment/app/m;

    invoke-virtual {v0}, Landroidx/fragment/app/m;->c()V

    :cond_0
    iget-object v0, p0, Landroidx/fragment/app/j;->E:Landroidx/fragment/app/m;

    invoke-virtual {v0}, Landroidx/fragment/app/m;->k()Z

    iget-object v0, p0, Landroidx/fragment/app/j;->F:Landroidx/lifecycle/m;

    sget-object v1, Landroidx/lifecycle/h$b;->ON_START:Landroidx/lifecycle/h$b;

    invoke-virtual {v0, v1}, Landroidx/lifecycle/m;->h(Landroidx/lifecycle/h$b;)V

    iget-object v0, p0, Landroidx/fragment/app/j;->E:Landroidx/fragment/app/m;

    invoke-virtual {v0}, Landroidx/fragment/app/m;->i()V

    return-void
.end method

.method public onStateNotSaved()V
    .locals 1

    iget-object v0, p0, Landroidx/fragment/app/j;->E:Landroidx/fragment/app/m;

    invoke-virtual {v0}, Landroidx/fragment/app/m;->m()V

    return-void
.end method

.method protected onStop()V
    .locals 2

    invoke-super {p0}, Landroid/app/Activity;->onStop()V

    const/4 v0, 0x1

    iput-boolean v0, p0, Landroidx/fragment/app/j;->I:Z

    invoke-virtual {p0}, Landroidx/fragment/app/j;->V()V

    iget-object v0, p0, Landroidx/fragment/app/j;->E:Landroidx/fragment/app/m;

    invoke-virtual {v0}, Landroidx/fragment/app/m;->j()V

    iget-object v0, p0, Landroidx/fragment/app/j;->F:Landroidx/lifecycle/m;

    sget-object v1, Landroidx/lifecycle/h$b;->ON_STOP:Landroidx/lifecycle/h$b;

    invoke-virtual {v0, v1}, Landroidx/lifecycle/m;->h(Landroidx/lifecycle/h$b;)V

    return-void
.end method
