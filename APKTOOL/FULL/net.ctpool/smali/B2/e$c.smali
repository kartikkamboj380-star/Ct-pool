.class LB2/e$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/animation/Animation$AnimationListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LB2/e;->c(Landroid/view/View;LB2/f;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:LB2/f;

.field final synthetic b:LB2/e;


# direct methods
.method constructor <init>(LB2/e;LB2/f;)V
    .locals 0

    .line 1
    iput-object p1, p0, LB2/e$c;->b:LB2/e;

    .line 2
    .line 3
    iput-object p2, p0, LB2/e$c;->a:LB2/f;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public onAnimationEnd(Landroid/view/animation/Animation;)V
    .locals 0

    .line 1
    iget-object p1, p0, LB2/e$c;->a:LB2/f;

    .line 2
    .line 3
    invoke-interface {p1}, LB2/f;->a()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public onAnimationRepeat(Landroid/view/animation/Animation;)V
    .locals 0

    .line 1
    return-void
.end method

.method public onAnimationStart(Landroid/view/animation/Animation;)V
    .locals 0

    .line 1
    return-void
.end method
