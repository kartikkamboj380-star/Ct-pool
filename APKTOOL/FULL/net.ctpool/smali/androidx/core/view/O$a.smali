.class Landroidx/core/view/O$a;
.super Landroid/animation/AnimatorListenerAdapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/core/view/O;->i(Landroid/view/View;Landroidx/core/view/P;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroidx/core/view/P;

.field final synthetic b:Landroid/view/View;

.field final synthetic c:Landroidx/core/view/O;


# direct methods
.method constructor <init>(Landroidx/core/view/O;Landroidx/core/view/P;Landroid/view/View;)V
    .locals 0

    iput-object p1, p0, Landroidx/core/view/O$a;->c:Landroidx/core/view/O;

    iput-object p2, p0, Landroidx/core/view/O$a;->a:Landroidx/core/view/P;

    iput-object p3, p0, Landroidx/core/view/O$a;->b:Landroid/view/View;

    invoke-direct {p0}, Landroid/animation/AnimatorListenerAdapter;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationCancel(Landroid/animation/Animator;)V
    .locals 1

    iget-object p1, p0, Landroidx/core/view/O$a;->a:Landroidx/core/view/P;

    iget-object v0, p0, Landroidx/core/view/O$a;->b:Landroid/view/View;

    invoke-interface {p1, v0}, Landroidx/core/view/P;->a(Landroid/view/View;)V

    return-void
.end method

.method public onAnimationEnd(Landroid/animation/Animator;)V
    .locals 1

    iget-object p1, p0, Landroidx/core/view/O$a;->a:Landroidx/core/view/P;

    iget-object v0, p0, Landroidx/core/view/O$a;->b:Landroid/view/View;

    invoke-interface {p1, v0}, Landroidx/core/view/P;->b(Landroid/view/View;)V

    return-void
.end method

.method public onAnimationStart(Landroid/animation/Animator;)V
    .locals 1

    iget-object p1, p0, Landroidx/core/view/O$a;->a:Landroidx/core/view/P;

    iget-object v0, p0, Landroidx/core/view/O$a;->b:Landroid/view/View;

    invoke-interface {p1, v0}, Landroidx/core/view/P;->c(Landroid/view/View;)V

    return-void
.end method
