.class public final Lcom/facebook/react/views/modal/b;
.super Lcom/facebook/react/uimanager/v;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/facebook/react/uimanager/v;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic J(Lcom/facebook/react/uimanager/U;I)V
    .locals 0

    .line 1
    check-cast p1, Lcom/facebook/react/uimanager/V;

    invoke-virtual {p0, p1, p2}, Lcom/facebook/react/views/modal/b;->e0(Lcom/facebook/react/uimanager/V;I)V

    return-void
.end method

.method public e0(Lcom/facebook/react/uimanager/V;I)V
    .locals 1

    .line 1
    const-string v0, "child"

    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1, p2}, Lcom/facebook/react/uimanager/V;->e0(Lcom/facebook/react/uimanager/V;I)V

    invoke-virtual {p0}, Lcom/facebook/react/uimanager/V;->G()Lcom/facebook/react/uimanager/e0;

    move-result-object p2

    const-string v0, "getThemedContext(...)"

    invoke-static {p2, v0}, Lw5/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p2}, Lcom/facebook/react/views/modal/a;->a(Landroid/content/Context;)Landroid/graphics/Point;

    move-result-object p2

    iget v0, p2, Landroid/graphics/Point;->x:I

    int-to-float v0, v0

    invoke-virtual {p1, v0}, Lcom/facebook/react/uimanager/V;->B(F)V

    iget p2, p2, Landroid/graphics/Point;->y:I

    int-to-float p2, p2

    invoke-virtual {p1, p2}, Lcom/facebook/react/uimanager/V;->g(F)V

    return-void
.end method
