.class Lcom/facebook/react/views/image/h$a;
.super Lcom/facebook/react/views/image/g;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/facebook/react/views/image/h;->setShouldNotifyLoadEvents(Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic r:Lcom/facebook/react/uimanager/events/e;

.field final synthetic s:Lcom/facebook/react/views/image/h;


# direct methods
.method constructor <init>(Lcom/facebook/react/views/image/h;Lcom/facebook/react/uimanager/events/e;)V
    .locals 0

    iput-object p1, p0, Lcom/facebook/react/views/image/h$a;->s:Lcom/facebook/react/views/image/h;

    iput-object p2, p0, Lcom/facebook/react/views/image/h$a;->r:Lcom/facebook/react/uimanager/events/e;

    invoke-direct {p0}, Lcom/facebook/react/views/image/g;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic e(Ljava/lang/String;Ljava/lang/Object;Landroid/graphics/drawable/Animatable;)V
    .locals 0

    .line 1
    check-cast p2, LD1/i;

    invoke-virtual {p0, p1, p2, p3}, Lcom/facebook/react/views/image/h$a;->y(Ljava/lang/String;LD1/i;Landroid/graphics/drawable/Animatable;)V

    return-void
.end method

.method public i(Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 2

    .line 1
    iget-object p1, p0, Lcom/facebook/react/views/image/h$a;->r:Lcom/facebook/react/uimanager/events/e;

    iget-object v0, p0, Lcom/facebook/react/views/image/h$a;->s:Lcom/facebook/react/views/image/h;

    invoke-static {v0}, Lcom/facebook/react/uimanager/k0;->f(Landroid/view/View;)I

    move-result v0

    iget-object v1, p0, Lcom/facebook/react/views/image/h$a;->s:Lcom/facebook/react/views/image/h;

    invoke-virtual {v1}, Landroid/view/View;->getId()I

    move-result v1

    invoke-static {v0, v1, p2}, Lcom/facebook/react/views/image/b;->a(IILjava/lang/Throwable;)Lcom/facebook/react/views/image/b;

    move-result-object p2

    invoke-interface {p1, p2}, Lcom/facebook/react/uimanager/events/e;->c(Lcom/facebook/react/uimanager/events/d;)V

    return-void
.end method

.method public p(Ljava/lang/String;Ljava/lang/Object;)V
    .locals 1

    .line 1
    iget-object p1, p0, Lcom/facebook/react/views/image/h$a;->r:Lcom/facebook/react/uimanager/events/e;

    iget-object p2, p0, Lcom/facebook/react/views/image/h$a;->s:Lcom/facebook/react/views/image/h;

    invoke-static {p2}, Lcom/facebook/react/uimanager/k0;->f(Landroid/view/View;)I

    move-result p2

    iget-object v0, p0, Lcom/facebook/react/views/image/h$a;->s:Lcom/facebook/react/views/image/h;

    invoke-virtual {v0}, Landroid/view/View;->getId()I

    move-result v0

    invoke-static {p2, v0}, Lcom/facebook/react/views/image/b;->e(II)Lcom/facebook/react/views/image/b;

    move-result-object p2

    invoke-interface {p1, p2}, Lcom/facebook/react/uimanager/events/e;->c(Lcom/facebook/react/uimanager/events/d;)V

    return-void
.end method

.method public x(II)V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/facebook/react/views/image/h$a;->r:Lcom/facebook/react/uimanager/events/e;

    iget-object v1, p0, Lcom/facebook/react/views/image/h$a;->s:Lcom/facebook/react/views/image/h;

    invoke-static {v1}, Lcom/facebook/react/uimanager/k0;->f(Landroid/view/View;)I

    move-result v1

    iget-object v2, p0, Lcom/facebook/react/views/image/h$a;->s:Lcom/facebook/react/views/image/h;

    invoke-virtual {v2}, Landroid/view/View;->getId()I

    move-result v2

    iget-object v3, p0, Lcom/facebook/react/views/image/h$a;->s:Lcom/facebook/react/views/image/h;

    invoke-static {v3}, Lcom/facebook/react/views/image/h;->g(Lcom/facebook/react/views/image/h;)LJ2/a;

    move-result-object v3

    invoke-virtual {v3}, LJ2/a;->d()Ljava/lang/String;

    move-result-object v3

    invoke-static {v1, v2, v3, p1, p2}, Lcom/facebook/react/views/image/b;->f(IILjava/lang/String;II)Lcom/facebook/react/views/image/b;

    move-result-object p1

    invoke-interface {v0, p1}, Lcom/facebook/react/uimanager/events/e;->c(Lcom/facebook/react/uimanager/events/d;)V

    return-void
.end method

.method public y(Ljava/lang/String;LD1/i;Landroid/graphics/drawable/Animatable;)V
    .locals 3

    .line 1
    if-eqz p2, :cond_0

    .line 2
    .line 3
    iget-object p1, p0, Lcom/facebook/react/views/image/h$a;->r:Lcom/facebook/react/uimanager/events/e;

    .line 4
    .line 5
    iget-object p3, p0, Lcom/facebook/react/views/image/h$a;->s:Lcom/facebook/react/views/image/h;

    .line 6
    .line 7
    invoke-static {p3}, Lcom/facebook/react/uimanager/k0;->f(Landroid/view/View;)I

    .line 8
    .line 9
    .line 10
    move-result p3

    .line 11
    iget-object v0, p0, Lcom/facebook/react/views/image/h$a;->s:Lcom/facebook/react/views/image/h;

    .line 12
    .line 13
    invoke-virtual {v0}, Landroid/view/View;->getId()I

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    iget-object v1, p0, Lcom/facebook/react/views/image/h$a;->s:Lcom/facebook/react/views/image/h;

    .line 18
    .line 19
    invoke-static {v1}, Lcom/facebook/react/views/image/h;->g(Lcom/facebook/react/views/image/h;)LJ2/a;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    invoke-virtual {v1}, LJ2/a;->d()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    invoke-interface {p2}, LD1/i;->getWidth()I

    .line 28
    .line 29
    .line 30
    move-result v2

    .line 31
    invoke-interface {p2}, LD1/i;->getHeight()I

    .line 32
    .line 33
    .line 34
    move-result p2

    .line 35
    invoke-static {p3, v0, v1, v2, p2}, Lcom/facebook/react/views/image/b;->d(IILjava/lang/String;II)Lcom/facebook/react/views/image/b;

    .line 36
    .line 37
    .line 38
    move-result-object p2

    .line 39
    invoke-interface {p1, p2}, Lcom/facebook/react/uimanager/events/e;->c(Lcom/facebook/react/uimanager/events/d;)V

    .line 40
    .line 41
    .line 42
    iget-object p1, p0, Lcom/facebook/react/views/image/h$a;->r:Lcom/facebook/react/uimanager/events/e;

    .line 43
    .line 44
    iget-object p2, p0, Lcom/facebook/react/views/image/h$a;->s:Lcom/facebook/react/views/image/h;

    .line 45
    .line 46
    invoke-static {p2}, Lcom/facebook/react/uimanager/k0;->f(Landroid/view/View;)I

    .line 47
    .line 48
    .line 49
    move-result p2

    .line 50
    iget-object p3, p0, Lcom/facebook/react/views/image/h$a;->s:Lcom/facebook/react/views/image/h;

    .line 51
    .line 52
    invoke-virtual {p3}, Landroid/view/View;->getId()I

    .line 53
    .line 54
    .line 55
    move-result p3

    .line 56
    invoke-static {p2, p3}, Lcom/facebook/react/views/image/b;->c(II)Lcom/facebook/react/views/image/b;

    .line 57
    .line 58
    .line 59
    move-result-object p2

    .line 60
    invoke-interface {p1, p2}, Lcom/facebook/react/uimanager/events/e;->c(Lcom/facebook/react/uimanager/events/d;)V

    .line 61
    .line 62
    .line 63
    :cond_0
    return-void
.end method
