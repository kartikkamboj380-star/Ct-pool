.class public final Lcom/swmansion/rnscreens/y;
.super Lcom/facebook/react/views/view/i;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/swmansion/rnscreens/y$a;
    }
.end annotation


# instance fields
.field private m:I

.field private n:I

.field private o:Lcom/swmansion/rnscreens/y$a;


# direct methods
.method public constructor <init>(Lcom/facebook/react/bridge/ReactContext;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/facebook/react/views/view/i;-><init>(Landroid/content/Context;)V

    sget-object p1, Lcom/swmansion/rnscreens/y$a;->o:Lcom/swmansion/rnscreens/y$a;

    iput-object p1, p0, Lcom/swmansion/rnscreens/y;->o:Lcom/swmansion/rnscreens/y$a;

    return-void
.end method


# virtual methods
.method public final getConfig()Lcom/swmansion/rnscreens/x;
    .locals 3

    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    instance-of v1, v0, Lcom/swmansion/rnscreens/d;

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    check-cast v0, Lcom/swmansion/rnscreens/d;

    goto :goto_0

    :cond_0
    move-object v0, v2

    :goto_0
    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lcom/swmansion/rnscreens/d;->getConfig()Lcom/swmansion/rnscreens/x;

    move-result-object v2

    :cond_1
    return-object v2
.end method

.method public final getType()Lcom/swmansion/rnscreens/y$a;
    .locals 1

    iget-object v0, p0, Lcom/swmansion/rnscreens/y;->o:Lcom/swmansion/rnscreens/y$a;

    return-object v0
.end method

.method protected onLayout(ZIIII)V
    .locals 0

    return-void
.end method

.method protected onMeasure(II)V
    .locals 2

    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result v0

    const/high16 v1, 0x40000000    # 2.0f

    if-ne v0, v1, :cond_0

    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result v0

    if-ne v0, v1, :cond_0

    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result p1

    iput p1, p0, Lcom/swmansion/rnscreens/y;->m:I

    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result p1

    iput p1, p0, Lcom/swmansion/rnscreens/y;->n:I

    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-virtual {p0}, Landroid/view/View;->forceLayout()V

    check-cast p1, Landroid/view/View;

    invoke-virtual {p1}, Landroid/view/View;->requestLayout()V

    :cond_0
    iget p1, p0, Lcom/swmansion/rnscreens/y;->m:I

    iget p2, p0, Lcom/swmansion/rnscreens/y;->n:I

    invoke-virtual {p0, p1, p2}, Landroid/view/View;->setMeasuredDimension(II)V

    return-void
.end method

.method public final setType(Lcom/swmansion/rnscreens/y$a;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/swmansion/rnscreens/y;->o:Lcom/swmansion/rnscreens/y$a;

    return-void
.end method
