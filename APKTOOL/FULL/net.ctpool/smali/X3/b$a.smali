.class final LX3/b$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LX3/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "a"
.end annotation


# instance fields
.field final m:Ljava/util/concurrent/Future;

.field final n:LX3/a;


# direct methods
.method constructor <init>(Ljava/util/concurrent/Future;LX3/a;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LX3/b$a;->m:Ljava/util/concurrent/Future;

    .line 5
    .line 6
    iput-object p2, p0, LX3/b$a;->n:LX3/a;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 1
    iget-object v0, p0, LX3/b$a;->m:Ljava/util/concurrent/Future;

    .line 2
    .line 3
    :try_start_0
    invoke-static {v0}, LX3/b;->b(Ljava/util/concurrent/Future;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0
    :try_end_0
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Error; {:try_start_0 .. :try_end_0} :catch_0

    .line 7
    iget-object v1, p0, LX3/b$a;->n:LX3/a;

    .line 8
    .line 9
    invoke-interface {v1, v0}, LX3/a;->b(Ljava/lang/Object;)V

    .line 10
    .line 11
    .line 12
    return-void

    .line 13
    :catch_0
    move-exception v0

    .line 14
    goto :goto_0

    .line 15
    :catch_1
    move-exception v0

    .line 16
    :goto_0
    iget-object v1, p0, LX3/b$a;->n:LX3/a;

    .line 17
    .line 18
    invoke-interface {v1, v0}, LX3/a;->a(Ljava/lang/Throwable;)V

    .line 19
    .line 20
    .line 21
    return-void

    .line 22
    :catch_2
    move-exception v0

    .line 23
    iget-object v1, p0, LX3/b$a;->n:LX3/a;

    .line 24
    .line 25
    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    invoke-interface {v1, v0}, LX3/a;->a(Ljava/lang/Throwable;)V

    .line 30
    .line 31
    .line 32
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 1
    invoke-static {p0}, LU3/d;->a(Ljava/lang/Object;)LU3/d$b;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, p0, LX3/b$a;->n:LX3/a;

    .line 6
    .line 7
    invoke-virtual {v0, v1}, LU3/d$b;->c(Ljava/lang/Object;)LU3/d$b;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-virtual {v0}, LU3/d$b;->toString()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    return-object v0
.end method
