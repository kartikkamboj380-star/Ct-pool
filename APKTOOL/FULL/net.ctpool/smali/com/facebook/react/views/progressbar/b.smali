.class public final Lcom/facebook/react/views/progressbar/b;
.super Lcom/facebook/react/uimanager/v;
.source "SourceFile"

# interfaces
.implements Lcom/facebook/yoga/o;


# instance fields
.field private final A:Landroid/util/SparseIntArray;

.field private final B:Landroid/util/SparseIntArray;

.field private final C:Ljava/util/Set;

.field private D:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/facebook/react/uimanager/v;-><init>()V

    new-instance v0, Landroid/util/SparseIntArray;

    invoke-direct {v0}, Landroid/util/SparseIntArray;-><init>()V

    iput-object v0, p0, Lcom/facebook/react/views/progressbar/b;->A:Landroid/util/SparseIntArray;

    new-instance v0, Landroid/util/SparseIntArray;

    invoke-direct {v0}, Landroid/util/SparseIntArray;-><init>()V

    iput-object v0, p0, Lcom/facebook/react/views/progressbar/b;->B:Landroid/util/SparseIntArray;

    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Lcom/facebook/react/views/progressbar/b;->C:Ljava/util/Set;

    invoke-virtual {p0, p0}, Lcom/facebook/react/uimanager/V;->Y0(Lcom/facebook/yoga/o;)V

    const-string v0, "Normal"

    iput-object v0, p0, Lcom/facebook/react/views/progressbar/b;->D:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public V(Lcom/facebook/yoga/r;FLcom/facebook/yoga/p;FLcom/facebook/yoga/p;)J
    .locals 0

    .line 1
    const-string p2, "node"

    invoke-static {p1, p2}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "widthMode"

    invoke-static {p3, p1}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "heightMode"

    invoke-static {p5, p1}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Lcom/facebook/react/views/progressbar/b;->D:Ljava/lang/String;

    invoke-static {p1}, Lcom/facebook/react/views/progressbar/ReactProgressBarViewManager;->getStyleFromString(Ljava/lang/String;)I

    move-result p1

    iget-object p2, p0, Lcom/facebook/react/views/progressbar/b;->C:Ljava/util/Set;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p3

    invoke-interface {p2, p3}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_0

    invoke-virtual {p0}, Lcom/facebook/react/uimanager/V;->G()Lcom/facebook/react/uimanager/e0;

    move-result-object p2

    invoke-static {p2, p1}, Lcom/facebook/react/views/progressbar/ReactProgressBarViewManager;->createProgressBar(Landroid/content/Context;I)Landroid/widget/ProgressBar;

    move-result-object p2

    const-string p3, "createProgressBar(...)"

    invoke-static {p2, p3}, Lw5/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p3, -0x2

    const/4 p4, 0x0

    invoke-static {p3, p4}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result p3

    invoke-virtual {p2, p3, p3}, Landroid/view/View;->measure(II)V

    iget-object p3, p0, Lcom/facebook/react/views/progressbar/b;->A:Landroid/util/SparseIntArray;

    invoke-virtual {p2}, Landroid/view/View;->getMeasuredHeight()I

    move-result p4

    invoke-virtual {p3, p1, p4}, Landroid/util/SparseIntArray;->put(II)V

    iget-object p3, p0, Lcom/facebook/react/views/progressbar/b;->B:Landroid/util/SparseIntArray;

    invoke-virtual {p2}, Landroid/view/View;->getMeasuredWidth()I

    move-result p2

    invoke-virtual {p3, p1, p2}, Landroid/util/SparseIntArray;->put(II)V

    iget-object p2, p0, Lcom/facebook/react/views/progressbar/b;->C:Ljava/util/Set;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p3

    invoke-interface {p2, p3}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    :cond_0
    iget-object p2, p0, Lcom/facebook/react/views/progressbar/b;->B:Landroid/util/SparseIntArray;

    invoke-virtual {p2, p1}, Landroid/util/SparseIntArray;->get(I)I

    move-result p2

    iget-object p3, p0, Lcom/facebook/react/views/progressbar/b;->A:Landroid/util/SparseIntArray;

    invoke-virtual {p3, p1}, Landroid/util/SparseIntArray;->get(I)I

    move-result p1

    invoke-static {p2, p1}, Lcom/facebook/yoga/q;->b(II)J

    move-result-wide p1

    return-wide p1
.end method

.method public final setStyle(Ljava/lang/String;)V
    .locals 0
    .annotation runtime Lx2/a;
        name = "styleAttr"
    .end annotation

    if-nez p1, :cond_0

    const-string p1, "Normal"

    :cond_0
    iput-object p1, p0, Lcom/facebook/react/views/progressbar/b;->D:Ljava/lang/String;

    return-void
.end method
