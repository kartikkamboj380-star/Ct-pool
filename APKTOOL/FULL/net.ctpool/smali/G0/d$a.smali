.class final LG0/d$a;
.super Lw5/l;
.source "SourceFile"

# interfaces
.implements Lv5/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LG0/d;->g(Lcom/facebook/react/bridge/Promise;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic m:LG0/d;

.field final synthetic n:Lcom/facebook/react/bridge/Promise;


# direct methods
.method constructor <init>(LG0/d;Lcom/facebook/react/bridge/Promise;)V
    .locals 0

    .line 1
    iput-object p1, p0, LG0/d$a;->m:LG0/d;

    .line 2
    .line 3
    iput-object p2, p0, LG0/d$a;->n:Lcom/facebook/react/bridge/Promise;

    .line 4
    .line 5
    const/4 p1, 0x1

    .line 6
    invoke-direct {p0, p1}, Lw5/l;-><init>(I)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final a(LP3/a;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, LP3/a;->b()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x2

    .line 6
    if-eq v0, v1, :cond_1

    .line 7
    .line 8
    const/4 v1, 0x3

    .line 9
    if-ne v0, v1, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const/4 v0, 0x0

    .line 13
    goto :goto_1

    .line 14
    :cond_1
    :goto_0
    const/4 v0, 0x1

    .line 15
    :goto_1
    if-eqz v0, :cond_2

    .line 16
    .line 17
    iget-object v1, p0, LG0/d$a;->m:LG0/d;

    .line 18
    .line 19
    invoke-static {v1}, LG0/d;->d(LG0/d;)Ljava/util/concurrent/atomic/AtomicReference;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    invoke-virtual {v1, p1}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    :cond_2
    iget-object p1, p0, LG0/d$a;->n:Lcom/facebook/react/bridge/Promise;

    .line 27
    .line 28
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    invoke-interface {p1, v0}, Lcom/facebook/react/bridge/Promise;->resolve(Ljava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    return-void
.end method

.method public bridge synthetic i(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, LP3/a;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, LG0/d$a;->a(LP3/a;)V

    .line 4
    .line 5
    .line 6
    sget-object p1, Li5/u;->a:Li5/u;

    .line 7
    .line 8
    return-object p1
.end method
