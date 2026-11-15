.class public final Lcom/swmansion/rnscreens/n$a;
.super Lm2/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/swmansion/rnscreens/n;-><init>(Landroid/content/Context;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/swmansion/rnscreens/n;


# direct methods
.method constructor <init>(Lcom/swmansion/rnscreens/n;)V
    .locals 0

    iput-object p1, p0, Lcom/swmansion/rnscreens/n$a;->a:Lcom/swmansion/rnscreens/n;

    invoke-direct {p0}, Lm2/a;-><init>()V

    return-void
.end method


# virtual methods
.method public doFrame(J)V
    .locals 3

    iget-object p1, p0, Lcom/swmansion/rnscreens/n$a;->a:Lcom/swmansion/rnscreens/n;

    const/4 p2, 0x0

    invoke-static {p1, p2}, Lcom/swmansion/rnscreens/n;->b(Lcom/swmansion/rnscreens/n;Z)V

    iget-object p1, p0, Lcom/swmansion/rnscreens/n$a;->a:Lcom/swmansion/rnscreens/n;

    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    move-result p2

    const/high16 v0, 0x40000000    # 2.0f

    invoke-static {p2, v0}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result p2

    iget-object v1, p0, Lcom/swmansion/rnscreens/n$a;->a:Lcom/swmansion/rnscreens/n;

    invoke-virtual {v1}, Landroid/view/View;->getHeight()I

    move-result v1

    invoke-static {v1, v0}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v0

    invoke-virtual {p1, p2, v0}, Landroid/view/View;->measure(II)V

    iget-object p1, p0, Lcom/swmansion/rnscreens/n$a;->a:Lcom/swmansion/rnscreens/n;

    invoke-virtual {p1}, Landroid/view/View;->getLeft()I

    move-result p2

    iget-object v0, p0, Lcom/swmansion/rnscreens/n$a;->a:Lcom/swmansion/rnscreens/n;

    invoke-virtual {v0}, Landroid/view/View;->getTop()I

    move-result v0

    iget-object v1, p0, Lcom/swmansion/rnscreens/n$a;->a:Lcom/swmansion/rnscreens/n;

    invoke-virtual {v1}, Landroid/view/View;->getRight()I

    move-result v1

    iget-object v2, p0, Lcom/swmansion/rnscreens/n$a;->a:Lcom/swmansion/rnscreens/n;

    invoke-virtual {v2}, Landroid/view/View;->getBottom()I

    move-result v2

    invoke-virtual {p1, p2, v0, v1, v2}, Landroid/view/View;->layout(IIII)V

    return-void
.end method
