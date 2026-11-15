.class public LK2/c;
.super Lcom/facebook/react/views/view/i;
.source "SourceFile"


# instance fields
.field private m:I


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 1
    invoke-direct {p0, p1}, Lcom/facebook/react/views/view/i;-><init>(Landroid/content/Context;)V

    .line 2
    .line 3
    .line 4
    invoke-static {}, Lcom/facebook/react/modules/i18nmanager/a;->f()Lcom/facebook/react/modules/i18nmanager/a;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    invoke-virtual {v0, p1}, Lcom/facebook/react/modules/i18nmanager/a;->i(Landroid/content/Context;)Z

    .line 9
    .line 10
    .line 11
    move-result p1

    .line 12
    iput p1, p0, LK2/c;->m:I

    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public getLayoutDirection()I
    .locals 1

    .line 1
    invoke-static {}, Le2/a;->d()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-super {p0}, Landroid/view/View;->getLayoutDirection()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    return v0

    .line 12
    :cond_0
    iget v0, p0, LK2/c;->m:I

    .line 13
    .line 14
    return v0
.end method

.method protected onLayout(ZIIII)V
    .locals 1

    .line 1
    invoke-virtual {p0}, LK2/c;->getLayoutDirection()I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    const/4 v0, 0x1

    .line 6
    if-ne p1, v0, :cond_0

    .line 7
    .line 8
    sub-int/2addr p4, p2

    .line 9
    const/4 p1, 0x0

    .line 10
    invoke-virtual {p0, p1}, Landroid/view/View;->setLeft(I)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0, p3}, Landroid/view/View;->setTop(I)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0, p4}, Landroid/view/View;->setRight(I)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {p0, p5}, Landroid/view/View;->setBottom(I)V

    .line 20
    .line 21
    .line 22
    :cond_0
    return-void
.end method

.method public setRemoveClippedSubviews(Z)V
    .locals 2

    .line 1
    invoke-virtual {p0}, LK2/c;->getLayoutDirection()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x1

    .line 6
    if-ne v0, v1, :cond_0

    .line 7
    .line 8
    const/4 p1, 0x0

    .line 9
    invoke-super {p0, p1}, Lcom/facebook/react/views/view/i;->setRemoveClippedSubviews(Z)V

    .line 10
    .line 11
    .line 12
    return-void

    .line 13
    :cond_0
    invoke-super {p0, p1}, Lcom/facebook/react/views/view/i;->setRemoveClippedSubviews(Z)V

    .line 14
    .line 15
    .line 16
    return-void
.end method
