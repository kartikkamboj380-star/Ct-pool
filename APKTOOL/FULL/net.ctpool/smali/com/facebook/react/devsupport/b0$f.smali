.class Lcom/facebook/react/devsupport/b0$f;
.super Landroid/widget/BaseAdapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/facebook/react/devsupport/b0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "f"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/facebook/react/devsupport/b0$f$a;
    }
.end annotation


# instance fields
.field private final m:Ljava/lang/String;

.field private final n:[LX1/j;


# direct methods
.method public constructor <init>(Ljava/lang/String;[LX1/j;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Landroid/widget/BaseAdapter;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/facebook/react/devsupport/b0$f;->m:Ljava/lang/String;

    .line 5
    .line 6
    iput-object p2, p0, Lcom/facebook/react/devsupport/b0$f;->n:[LX1/j;

    .line 7
    .line 8
    invoke-static {p1}, LO1/a;->c(Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    invoke-static {p2}, LO1/a;->c(Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public areAllItemsEnabled()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public getCount()I
    .locals 1

    iget-object v0, p0, Lcom/facebook/react/devsupport/b0$f;->n:[LX1/j;

    array-length v0, v0

    add-int/lit8 v0, v0, 0x1

    return v0
.end method

.method public getItem(I)Ljava/lang/Object;
    .locals 1

    if-nez p1, :cond_0

    iget-object p1, p0, Lcom/facebook/react/devsupport/b0$f;->m:Ljava/lang/String;

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/facebook/react/devsupport/b0$f;->n:[LX1/j;

    add-int/lit8 p1, p1, -0x1

    aget-object p1, v0, p1

    :goto_0
    return-object p1
.end method

.method public getItemId(I)J
    .locals 2

    int-to-long v0, p1

    return-wide v0
.end method

.method public getItemViewType(I)I
    .locals 0

    if-nez p1, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    const/4 p1, 0x1

    :goto_0
    return p1
.end method

.method public getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 2

    const/4 v0, 0x0

    if-nez p1, :cond_2

    if-eqz p2, :cond_0

    check-cast p2, Landroid/widget/TextView;

    goto :goto_0

    :cond_0
    invoke-virtual {p3}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p1

    sget p2, Lcom/facebook/react/p;->e:I

    invoke-virtual {p1, p2, p3, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    move-object p2, p1

    check-cast p2, Landroid/widget/TextView;

    :goto_0
    iget-object p1, p0, Lcom/facebook/react/devsupport/b0$f;->m:Ljava/lang/String;

    if-nez p1, :cond_1

    const-string p1, "<unknown title>"

    :cond_1
    const-string p3, "\\x1b\\[[0-9;]*m"

    const-string v0, ""

    invoke-virtual {p1, p3, v0}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-object p2

    :cond_2
    if-nez p2, :cond_3

    invoke-virtual {p3}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p2

    invoke-static {p2}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p2

    sget v1, Lcom/facebook/react/p;->d:I

    invoke-virtual {p2, v1, p3, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p2

    new-instance p3, Lcom/facebook/react/devsupport/b0$f$a;

    const/4 v0, 0x0

    invoke-direct {p3, p2, v0}, Lcom/facebook/react/devsupport/b0$f$a;-><init>(Landroid/view/View;Lcom/facebook/react/devsupport/d0;)V

    invoke-virtual {p2, p3}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    :cond_3
    iget-object p3, p0, Lcom/facebook/react/devsupport/b0$f;->n:[LX1/j;

    add-int/lit8 p1, p1, -0x1

    aget-object p1, p3, p1

    invoke-virtual {p2}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Lcom/facebook/react/devsupport/b0$f$a;

    invoke-static {p3}, Lcom/facebook/react/devsupport/b0$f$a;->b(Lcom/facebook/react/devsupport/b0$f$a;)Landroid/widget/TextView;

    move-result-object v0

    invoke-interface {p1}, LX1/j;->c()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-static {p3}, Lcom/facebook/react/devsupport/b0$f$a;->a(Lcom/facebook/react/devsupport/b0$f$a;)Landroid/widget/TextView;

    move-result-object v0

    invoke-static {p1}, Lcom/facebook/react/devsupport/h0;->d(LX1/j;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-static {p3}, Lcom/facebook/react/devsupport/b0$f$a;->b(Lcom/facebook/react/devsupport/b0$f$a;)Landroid/widget/TextView;

    move-result-object v0

    invoke-interface {p1}, LX1/j;->d()Z

    move-result v1

    if-eqz v1, :cond_4

    const v1, -0x555556

    goto :goto_1

    :cond_4
    const/4 v1, -0x1

    :goto_1
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    invoke-static {p3}, Lcom/facebook/react/devsupport/b0$f$a;->a(Lcom/facebook/react/devsupport/b0$f$a;)Landroid/widget/TextView;

    move-result-object p3

    invoke-interface {p1}, LX1/j;->d()Z

    move-result p1

    if-eqz p1, :cond_5

    const p1, -0x7f7f80

    goto :goto_2

    :cond_5
    const p1, -0x4c4c4d

    :goto_2
    invoke-virtual {p3, p1}, Landroid/widget/TextView;->setTextColor(I)V

    return-object p2
.end method

.method public getViewTypeCount()I
    .locals 1

    const/4 v0, 0x2

    return v0
.end method

.method public isEnabled(I)Z
    .locals 0

    if-lez p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method
