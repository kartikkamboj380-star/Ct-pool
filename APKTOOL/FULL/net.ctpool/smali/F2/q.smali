.class public LF2/q;
.super Lcom/facebook/react/uimanager/f;
.source "SourceFile"


# direct methods
.method public constructor <init>(Lcom/facebook/react/uimanager/g;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/facebook/react/uimanager/f;-><init>(Lcom/facebook/react/uimanager/g;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public b(Landroid/view/View;Ljava/lang/String;Ljava/lang/Object;)V
    .locals 1

    .line 1
    invoke-virtual {p2}, Ljava/lang/String;->hashCode()I

    .line 2
    .line 3
    .line 4
    const-string v0, "type"

    .line 5
    .line 6
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    invoke-super {p0, p1, p2, p3}, Lcom/facebook/react/uimanager/f;->b(Landroid/view/View;Ljava/lang/String;Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    iget-object p2, p0, Lcom/facebook/react/uimanager/f;->a:Lcom/facebook/react/uimanager/g;

    .line 17
    .line 18
    check-cast p2, LF2/r;

    .line 19
    .line 20
    check-cast p3, Ljava/lang/String;

    .line 21
    .line 22
    invoke-interface {p2, p1, p3}, LF2/r;->setType(Landroid/view/View;Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    return-void
.end method
