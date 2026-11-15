.class Lcom/facebook/react/devsupport/B$e;
.super Landroid/widget/ArrayAdapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/facebook/react/devsupport/B;->C()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic m:Ljava/util/Set;

.field final synthetic n:Lcom/facebook/react/devsupport/B;


# direct methods
.method constructor <init>(Lcom/facebook/react/devsupport/B;Landroid/content/Context;I[Ljava/lang/String;Ljava/util/Set;)V
    .locals 0

    iput-object p1, p0, Lcom/facebook/react/devsupport/B$e;->n:Lcom/facebook/react/devsupport/B;

    iput-object p5, p0, Lcom/facebook/react/devsupport/B$e;->m:Ljava/util/Set;

    invoke-direct {p0, p2, p3, p4}, Landroid/widget/ArrayAdapter;-><init>(Landroid/content/Context;I[Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public areAllItemsEnabled()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 0

    invoke-super {p0, p1, p2, p3}, Landroid/widget/ArrayAdapter;->getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;

    move-result-object p2

    invoke-virtual {p0, p1}, Lcom/facebook/react/devsupport/B$e;->isEnabled(I)Z

    move-result p1

    invoke-virtual {p2, p1}, Landroid/view/View;->setEnabled(Z)V

    return-object p2
.end method

.method public isEnabled(I)Z
    .locals 1

    iget-object v0, p0, Lcom/facebook/react/devsupport/B$e;->m:Ljava/util/Set;

    invoke-interface {p0, p1}, Landroid/widget/Adapter;->getItem(I)Ljava/lang/Object;

    move-result-object p1

    invoke-interface {v0, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result p1

    xor-int/lit8 p1, p1, 0x1

    return p1
.end method
