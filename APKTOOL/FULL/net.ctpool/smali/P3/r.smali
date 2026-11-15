.class final LP3/r;
.super LQ3/q;
.source "SourceFile"


# instance fields
.field final synthetic n:Ljava/lang/String;

.field final synthetic o:Lz3/m;

.field final synthetic p:LP3/u;


# direct methods
.method constructor <init>(LP3/u;Lz3/m;Ljava/lang/String;Lz3/m;)V
    .locals 0

    .line 1
    iput-object p1, p0, LP3/r;->p:LP3/u;

    .line 2
    .line 3
    iput-object p3, p0, LP3/r;->n:Ljava/lang/String;

    .line 4
    .line 5
    iput-object p4, p0, LP3/r;->o:Lz3/m;

    .line 6
    .line 7
    invoke-direct {p0, p2}, LQ3/q;-><init>(Lz3/m;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method protected final a()V
    .locals 7

    .line 1
    :try_start_0
    iget-object v0, p0, LP3/r;->p:LP3/u;

    .line 2
    .line 3
    iget-object v0, v0, LP3/u;->a:LQ3/A;

    .line 4
    .line 5
    invoke-virtual {v0}, LQ3/A;->e()Landroid/os/IInterface;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    iget-object v1, p0, LP3/r;->p:LP3/u;

    .line 10
    .line 11
    invoke-static {v1}, LP3/u;->f(LP3/u;)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    iget-object v3, p0, LP3/r;->n:Ljava/lang/String;

    .line 16
    .line 17
    invoke-static {v1, v3}, LP3/u;->b(LP3/u;Ljava/lang/String;)Landroid/os/Bundle;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    new-instance v3, LP3/t;

    .line 22
    .line 23
    iget-object v4, p0, LP3/r;->p:LP3/u;

    .line 24
    .line 25
    iget-object v5, p0, LP3/r;->o:Lz3/m;

    .line 26
    .line 27
    iget-object v6, p0, LP3/r;->n:Ljava/lang/String;

    .line 28
    .line 29
    invoke-direct {v3, v4, v5, v6}, LP3/t;-><init>(LP3/u;Lz3/m;Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    invoke-interface {v0, v2, v1, v3}, LQ3/k;->u(Ljava/lang/String;Landroid/os/Bundle;LQ3/m;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 33
    .line 34
    .line 35
    return-void

    .line 36
    :catch_0
    move-exception v0

    .line 37
    invoke-static {}, LP3/u;->e()LQ3/p;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    iget-object v2, p0, LP3/r;->n:Ljava/lang/String;

    .line 42
    .line 43
    filled-new-array {v2}, [Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v2

    .line 47
    const-string v3, "requestUpdateInfo(%s)"

    .line 48
    .line 49
    invoke-virtual {v1, v0, v3, v2}, LQ3/p;->b(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)I

    .line 50
    .line 51
    .line 52
    iget-object v1, p0, LP3/r;->o:Lz3/m;

    .line 53
    .line 54
    new-instance v2, Ljava/lang/RuntimeException;

    .line 55
    .line 56
    invoke-direct {v2, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    .line 57
    .line 58
    .line 59
    invoke-virtual {v1, v2}, Lz3/m;->d(Ljava/lang/Exception;)Z

    .line 60
    .line 61
    .line 62
    return-void
.end method
