.class public Lcom/facebook/react/views/drawer/ReactDrawerLayoutManager$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LH/a$e;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/facebook/react/views/drawer/ReactDrawerLayoutManager;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field private final a:LH/a;

.field private final b:Lcom/facebook/react/uimanager/events/e;


# direct methods
.method public constructor <init>(LH/a;Lcom/facebook/react/uimanager/events/e;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/facebook/react/views/drawer/ReactDrawerLayoutManager$a;->a:LH/a;

    .line 5
    .line 6
    iput-object p2, p0, Lcom/facebook/react/views/drawer/ReactDrawerLayoutManager$a;->b:Lcom/facebook/react/uimanager/events/e;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public a(Landroid/view/View;)V
    .locals 3

    .line 1
    iget-object p1, p0, Lcom/facebook/react/views/drawer/ReactDrawerLayoutManager$a;->b:Lcom/facebook/react/uimanager/events/e;

    new-instance v0, LI2/b;

    iget-object v1, p0, Lcom/facebook/react/views/drawer/ReactDrawerLayoutManager$a;->a:LH/a;

    invoke-static {v1}, Lcom/facebook/react/uimanager/k0;->f(Landroid/view/View;)I

    move-result v1

    iget-object v2, p0, Lcom/facebook/react/views/drawer/ReactDrawerLayoutManager$a;->a:LH/a;

    invoke-virtual {v2}, Landroid/view/View;->getId()I

    move-result v2

    invoke-direct {v0, v1, v2}, LI2/b;-><init>(II)V

    invoke-interface {p1, v0}, Lcom/facebook/react/uimanager/events/e;->c(Lcom/facebook/react/uimanager/events/d;)V

    return-void
.end method

.method public b(Landroid/view/View;)V
    .locals 3

    .line 1
    iget-object p1, p0, Lcom/facebook/react/views/drawer/ReactDrawerLayoutManager$a;->b:Lcom/facebook/react/uimanager/events/e;

    new-instance v0, LI2/a;

    iget-object v1, p0, Lcom/facebook/react/views/drawer/ReactDrawerLayoutManager$a;->a:LH/a;

    invoke-static {v1}, Lcom/facebook/react/uimanager/k0;->f(Landroid/view/View;)I

    move-result v1

    iget-object v2, p0, Lcom/facebook/react/views/drawer/ReactDrawerLayoutManager$a;->a:LH/a;

    invoke-virtual {v2}, Landroid/view/View;->getId()I

    move-result v2

    invoke-direct {v0, v1, v2}, LI2/a;-><init>(II)V

    invoke-interface {p1, v0}, Lcom/facebook/react/uimanager/events/e;->c(Lcom/facebook/react/uimanager/events/d;)V

    return-void
.end method

.method public c(I)V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/facebook/react/views/drawer/ReactDrawerLayoutManager$a;->b:Lcom/facebook/react/uimanager/events/e;

    new-instance v1, LI2/d;

    iget-object v2, p0, Lcom/facebook/react/views/drawer/ReactDrawerLayoutManager$a;->a:LH/a;

    invoke-static {v2}, Lcom/facebook/react/uimanager/k0;->f(Landroid/view/View;)I

    move-result v2

    iget-object v3, p0, Lcom/facebook/react/views/drawer/ReactDrawerLayoutManager$a;->a:LH/a;

    invoke-virtual {v3}, Landroid/view/View;->getId()I

    move-result v3

    invoke-direct {v1, v2, v3, p1}, LI2/d;-><init>(III)V

    invoke-interface {v0, v1}, Lcom/facebook/react/uimanager/events/e;->c(Lcom/facebook/react/uimanager/events/d;)V

    return-void
.end method

.method public d(Landroid/view/View;F)V
    .locals 3

    .line 1
    iget-object p1, p0, Lcom/facebook/react/views/drawer/ReactDrawerLayoutManager$a;->b:Lcom/facebook/react/uimanager/events/e;

    new-instance v0, LI2/c;

    iget-object v1, p0, Lcom/facebook/react/views/drawer/ReactDrawerLayoutManager$a;->a:LH/a;

    invoke-static {v1}, Lcom/facebook/react/uimanager/k0;->f(Landroid/view/View;)I

    move-result v1

    iget-object v2, p0, Lcom/facebook/react/views/drawer/ReactDrawerLayoutManager$a;->a:LH/a;

    invoke-virtual {v2}, Landroid/view/View;->getId()I

    move-result v2

    invoke-direct {v0, v1, v2, p2}, LI2/c;-><init>(IIF)V

    invoke-interface {p1, v0}, Lcom/facebook/react/uimanager/events/e;->c(Lcom/facebook/react/uimanager/events/d;)V

    return-void
.end method
