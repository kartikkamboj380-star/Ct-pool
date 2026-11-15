.class Ll6/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;
.implements Ll6/l;


# instance fields
.field private final m:Ll6/k;

.field private final n:Ll6/c;


# direct methods
.method constructor <init>(Ll6/c;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ll6/a;->n:Ll6/c;

    .line 5
    .line 6
    new-instance p1, Ll6/k;

    .line 7
    .line 8
    invoke-direct {p1}, Ll6/k;-><init>()V

    .line 9
    .line 10
    .line 11
    iput-object p1, p0, Ll6/a;->m:Ll6/k;

    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public a(Ll6/q;Ljava/lang/Object;)V
    .locals 0

    .line 1
    invoke-static {p1, p2}, Ll6/j;->a(Ll6/q;Ljava/lang/Object;)Ll6/j;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iget-object p2, p0, Ll6/a;->m:Ll6/k;

    .line 6
    .line 7
    invoke-virtual {p2, p1}, Ll6/k;->a(Ll6/j;)V

    .line 8
    .line 9
    .line 10
    iget-object p1, p0, Ll6/a;->n:Ll6/c;

    .line 11
    .line 12
    invoke-virtual {p1}, Ll6/c;->d()Ljava/util/concurrent/ExecutorService;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    invoke-interface {p1, p0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method public run()V
    .locals 2

    .line 1
    iget-object v0, p0, Ll6/a;->m:Ll6/k;

    .line 2
    .line 3
    invoke-virtual {v0}, Ll6/k;->b()Ll6/j;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iget-object v1, p0, Ll6/a;->n:Ll6/c;

    .line 10
    .line 11
    invoke-virtual {v1, v0}, Ll6/c;->g(Ll6/j;)V

    .line 12
    .line 13
    .line 14
    return-void

    .line 15
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 16
    .line 17
    const-string v1, "No pending post available"

    .line 18
    .line 19
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    throw v0
.end method
