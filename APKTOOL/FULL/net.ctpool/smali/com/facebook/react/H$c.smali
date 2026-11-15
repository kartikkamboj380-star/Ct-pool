.class Lcom/facebook/react/H$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LX1/g;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/facebook/react/H;->n0()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Ln2/a;

.field final synthetic b:Lcom/facebook/react/H;


# direct methods
.method constructor <init>(Lcom/facebook/react/H;Ln2/a;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/facebook/react/H$c;->b:Lcom/facebook/react/H;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/facebook/react/H$c;->a:Ln2/a;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public static synthetic b(Lcom/facebook/react/H$c;ZLn2/a;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lcom/facebook/react/H$c;->c(ZLn2/a;)V

    return-void
.end method

.method private synthetic c(ZLn2/a;)V
    .locals 0

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    iget-object p1, p0, Lcom/facebook/react/H$c;->b:Lcom/facebook/react/H;

    .line 4
    .line 5
    invoke-static {p1}, Lcom/facebook/react/H;->i(Lcom/facebook/react/H;)LX1/e;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-interface {p1}, LX1/e;->q()V

    .line 10
    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    iget-object p1, p0, Lcom/facebook/react/H$c;->b:Lcom/facebook/react/H;

    .line 14
    .line 15
    invoke-static {p1}, Lcom/facebook/react/H;->i(Lcom/facebook/react/H;)LX1/e;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    invoke-interface {p1}, LX1/e;->A()Z

    .line 20
    .line 21
    .line 22
    move-result p1

    .line 23
    if-eqz p1, :cond_1

    .line 24
    .line 25
    invoke-interface {p2}, Ln2/a;->m()Z

    .line 26
    .line 27
    .line 28
    move-result p1

    .line 29
    if-nez p1, :cond_1

    .line 30
    .line 31
    iget-object p1, p0, Lcom/facebook/react/H$c;->b:Lcom/facebook/react/H;

    .line 32
    .line 33
    invoke-static {p1}, Lcom/facebook/react/H;->k(Lcom/facebook/react/H;)Z

    .line 34
    .line 35
    .line 36
    move-result p1

    .line 37
    if-nez p1, :cond_1

    .line 38
    .line 39
    iget-object p1, p0, Lcom/facebook/react/H$c;->b:Lcom/facebook/react/H;

    .line 40
    .line 41
    invoke-static {p1}, Lcom/facebook/react/H;->n(Lcom/facebook/react/H;)V

    .line 42
    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_1
    const/4 p1, 0x0

    .line 46
    invoke-interface {p2, p1}, Ln2/a;->f(Z)V

    .line 47
    .line 48
    .line 49
    iget-object p1, p0, Lcom/facebook/react/H$c;->b:Lcom/facebook/react/H;

    .line 50
    .line 51
    invoke-static {p1}, Lcom/facebook/react/H;->o(Lcom/facebook/react/H;)V

    .line 52
    .line 53
    .line 54
    :goto_0
    return-void
.end method


# virtual methods
.method public a(Z)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/facebook/react/H$c;->a:Ln2/a;

    new-instance v1, Lcom/facebook/react/I;

    invoke-direct {v1, p0, p1, v0}, Lcom/facebook/react/I;-><init>(Lcom/facebook/react/H$c;ZLn2/a;)V

    invoke-static {v1}, Lcom/facebook/react/bridge/UiThreadUtil;->runOnUiThread(Ljava/lang/Runnable;)Z

    return-void
.end method
