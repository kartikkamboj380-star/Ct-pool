.class public final Lcom/swmansion/rnscreens/u$b$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/animation/Animation$AnimationListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/swmansion/rnscreens/u$b;-><init>(Landroid/content/Context;Lcom/swmansion/rnscreens/q;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/swmansion/rnscreens/u$b;


# direct methods
.method constructor <init>(Lcom/swmansion/rnscreens/u$b;)V
    .locals 0

    iput-object p1, p0, Lcom/swmansion/rnscreens/u$b$a;->a:Lcom/swmansion/rnscreens/u$b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationEnd(Landroid/view/animation/Animation;)V
    .locals 1

    const-string v0, "animation"

    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Lcom/swmansion/rnscreens/u$b$a;->a:Lcom/swmansion/rnscreens/u$b;

    invoke-static {p1}, Lcom/swmansion/rnscreens/u$b;->b0(Lcom/swmansion/rnscreens/u$b;)Lcom/swmansion/rnscreens/q;

    move-result-object p1

    invoke-virtual {p1}, Lcom/swmansion/rnscreens/q;->D()V

    return-void
.end method

.method public onAnimationRepeat(Landroid/view/animation/Animation;)V
    .locals 1

    const-string v0, "animation"

    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public onAnimationStart(Landroid/view/animation/Animation;)V
    .locals 1

    const-string v0, "animation"

    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Lcom/swmansion/rnscreens/u$b$a;->a:Lcom/swmansion/rnscreens/u$b;

    invoke-static {p1}, Lcom/swmansion/rnscreens/u$b;->b0(Lcom/swmansion/rnscreens/u$b;)Lcom/swmansion/rnscreens/q;

    move-result-object p1

    invoke-virtual {p1}, Lcom/swmansion/rnscreens/q;->E()V

    return-void
.end method
