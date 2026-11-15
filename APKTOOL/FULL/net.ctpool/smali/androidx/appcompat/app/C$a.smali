.class Landroidx/appcompat/app/C$a;
.super Landroidx/core/view/Q;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/appcompat/app/C;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroidx/appcompat/app/C;


# direct methods
.method constructor <init>(Landroidx/appcompat/app/C;)V
    .locals 0

    iput-object p1, p0, Landroidx/appcompat/app/C$a;->a:Landroidx/appcompat/app/C;

    invoke-direct {p0}, Landroidx/core/view/Q;-><init>()V

    return-void
.end method


# virtual methods
.method public b(Landroid/view/View;)V
    .locals 1

    .line 1
    iget-object p1, p0, Landroidx/appcompat/app/C$a;->a:Landroidx/appcompat/app/C;

    iget-boolean v0, p1, Landroidx/appcompat/app/C;->s:Z

    if-eqz v0, :cond_0

    iget-object p1, p1, Landroidx/appcompat/app/C;->h:Landroid/view/View;

    if-eqz p1, :cond_0

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/view/View;->setTranslationY(F)V

    iget-object p1, p0, Landroidx/appcompat/app/C$a;->a:Landroidx/appcompat/app/C;

    iget-object p1, p1, Landroidx/appcompat/app/C;->e:Landroidx/appcompat/widget/ActionBarContainer;

    invoke-virtual {p1, v0}, Landroid/view/View;->setTranslationY(F)V

    :cond_0
    iget-object p1, p0, Landroidx/appcompat/app/C$a;->a:Landroidx/appcompat/app/C;

    iget-object p1, p1, Landroidx/appcompat/app/C;->e:Landroidx/appcompat/widget/ActionBarContainer;

    const/16 v0, 0x8

    invoke-virtual {p1, v0}, Landroidx/appcompat/widget/ActionBarContainer;->setVisibility(I)V

    iget-object p1, p0, Landroidx/appcompat/app/C$a;->a:Landroidx/appcompat/app/C;

    iget-object p1, p1, Landroidx/appcompat/app/C;->e:Landroidx/appcompat/widget/ActionBarContainer;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroidx/appcompat/widget/ActionBarContainer;->setTransitioning(Z)V

    iget-object p1, p0, Landroidx/appcompat/app/C$a;->a:Landroidx/appcompat/app/C;

    const/4 v0, 0x0

    iput-object v0, p1, Landroidx/appcompat/app/C;->x:Landroidx/appcompat/view/h;

    invoke-virtual {p1}, Landroidx/appcompat/app/C;->A()V

    iget-object p1, p0, Landroidx/appcompat/app/C$a;->a:Landroidx/appcompat/app/C;

    iget-object p1, p1, Landroidx/appcompat/app/C;->d:Landroidx/appcompat/widget/ActionBarOverlayLayout;

    if-eqz p1, :cond_1

    invoke-static {p1}, Landroidx/core/view/H;->m0(Landroid/view/View;)V

    :cond_1
    return-void
.end method
