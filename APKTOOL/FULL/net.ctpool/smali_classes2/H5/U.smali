.class public abstract LH5/U;
.super LO5/h;
.source "SourceFile"


# instance fields
.field public o:I


# direct methods
.method public constructor <init>(I)V
    .locals 0

    .line 1
    invoke-direct {p0}, LO5/h;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, LH5/U;->o:I

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public abstract d(Ljava/lang/Object;Ljava/lang/Throwable;)V
.end method

.method public abstract e()Lm5/d;
.end method

.method public f(Ljava/lang/Object;)Ljava/lang/Throwable;
    .locals 2

    .line 1
    instance-of v0, p1, LH5/z;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    check-cast p1, LH5/z;

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_0
    move-object p1, v1

    .line 10
    :goto_0
    if-eqz p1, :cond_1

    .line 11
    .line 12
    iget-object v1, p1, LH5/z;->a:Ljava/lang/Throwable;

    .line 13
    .line 14
    :cond_1
    return-object v1
.end method

.method public i(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    return-object p1
.end method

.method public final j(Ljava/lang/Throwable;Ljava/lang/Throwable;)V
    .locals 2

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    if-nez p2, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    if-eqz p1, :cond_1

    .line 7
    .line 8
    if-eqz p2, :cond_1

    .line 9
    .line 10
    invoke-static {p1, p2}, Li5/a;->a(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    .line 11
    .line 12
    .line 13
    :cond_1
    if-nez p1, :cond_2

    .line 14
    .line 15
    move-object p1, p2

    .line 16
    :cond_2
    new-instance p2, LH5/L;

    .line 17
    .line 18
    new-instance v0, Ljava/lang/StringBuilder;

    .line 19
    .line 20
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 21
    .line 22
    .line 23
    const-string v1, "Fatal exception in coroutines machinery for "

    .line 24
    .line 25
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    const-string v1, ". Please read KDoc to \'handleFatalException\' method and report this incident to maintainers"

    .line 32
    .line 33
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    invoke-static {p1}, Lw5/k;->c(Ljava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    invoke-direct {p2, v0, p1}, LH5/L;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 44
    .line 45
    .line 46
    invoke-virtual {p0}, LH5/U;->e()Lm5/d;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    invoke-interface {p1}, Lm5/d;->a()Lm5/g;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    invoke-static {p1, p2}, LH5/H;->a(Lm5/g;Ljava/lang/Throwable;)V

    .line 55
    .line 56
    .line 57
    return-void
.end method

.method public abstract l()Ljava/lang/Object;
.end method

.method public final run()V
    .locals 10

    .line 1
    iget-object v0, p0, LO5/h;->n:LO5/i;

    :try_start_0
    invoke-virtual {p0}, LH5/U;->e()Lm5/d;

    move-result-object v1

    const-string v2, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTask>"

    invoke-static {v1, v2}, Lw5/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, LM5/j;

    iget-object v2, v1, LM5/j;->q:Lm5/d;

    iget-object v1, v1, LM5/j;->s:Ljava/lang/Object;

    invoke-interface {v2}, Lm5/d;->a()Lm5/g;

    move-result-object v3

    invoke-static {v3, v1}, LM5/J;->c(Lm5/g;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    sget-object v4, LM5/J;->a:LM5/F;

    const/4 v5, 0x0

    if-eq v1, v4, :cond_0

    invoke-static {v2, v3, v1}, LH5/E;->g(Lm5/d;Lm5/g;Ljava/lang/Object;)LH5/N0;

    move-result-object v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v1

    goto/16 :goto_6

    :cond_0
    move-object v4, v5

    :goto_0
    :try_start_1
    invoke-interface {v2}, Lm5/d;->a()Lm5/g;

    move-result-object v6

    invoke-virtual {p0}, LH5/U;->l()Ljava/lang/Object;

    move-result-object v7

    invoke-virtual {p0, v7}, LH5/U;->f(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v8

    if-nez v8, :cond_1

    iget v9, p0, LH5/U;->o:I

    invoke-static {v9}, LH5/V;->b(I)Z

    move-result v9

    if-eqz v9, :cond_1

    sget-object v9, LH5/q0;->b:LH5/q0$b;

    invoke-interface {v6, v9}, Lm5/g;->b(Lm5/g$c;)Lm5/g$b;

    move-result-object v6

    check-cast v6, LH5/q0;

    goto :goto_1

    :catchall_1
    move-exception v2

    goto :goto_5

    :cond_1
    move-object v6, v5

    :goto_1
    if-eqz v6, :cond_2

    invoke-interface {v6}, LH5/q0;->d()Z

    move-result v9

    if-nez v9, :cond_2

    invoke-interface {v6}, LH5/q0;->w()Ljava/util/concurrent/CancellationException;

    move-result-object v6

    invoke-virtual {p0, v7, v6}, LH5/U;->d(Ljava/lang/Object;Ljava/lang/Throwable;)V

    sget-object v7, Li5/m;->m:Li5/m$a;

    invoke-static {v6}, Li5/n;->a(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v6

    invoke-static {v6}, Li5/m;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    :goto_2
    invoke-interface {v2, v6}, Lm5/d;->h(Ljava/lang/Object;)V

    goto :goto_3

    :cond_2
    if-eqz v8, :cond_3

    sget-object v6, Li5/m;->m:Li5/m$a;

    invoke-static {v8}, Li5/n;->a(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v6

    invoke-static {v6}, Li5/m;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    goto :goto_2

    :cond_3
    sget-object v6, Li5/m;->m:Li5/m$a;

    invoke-virtual {p0, v7}, LH5/U;->i(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    invoke-static {v6}, Li5/m;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    goto :goto_2

    :goto_3
    sget-object v2, Li5/u;->a:Li5/u;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    if-eqz v4, :cond_4

    :try_start_2
    invoke-virtual {v4}, LH5/N0;->N0()Z

    move-result v2

    if-eqz v2, :cond_5

    :cond_4
    invoke-static {v3, v1}, LM5/J;->a(Lm5/g;Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :cond_5
    :try_start_3
    invoke-interface {v0}, LO5/i;->a()V

    sget-object v0, Li5/u;->a:Li5/u;

    invoke-static {v0}, Li5/m;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    goto :goto_4

    :catchall_2
    move-exception v0

    sget-object v1, Li5/m;->m:Li5/m$a;

    invoke-static {v0}, Li5/n;->a(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Li5/m;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    :goto_4
    invoke-static {v0}, Li5/m;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v0

    invoke-virtual {p0, v5, v0}, LH5/U;->j(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    goto :goto_8

    :goto_5
    if-eqz v4, :cond_6

    :try_start_4
    invoke-virtual {v4}, LH5/N0;->N0()Z

    move-result v4

    if-eqz v4, :cond_7

    :cond_6
    invoke-static {v3, v1}, LM5/J;->a(Lm5/g;Ljava/lang/Object;)V

    :cond_7
    throw v2
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    :goto_6
    :try_start_5
    sget-object v2, Li5/m;->m:Li5/m$a;

    invoke-interface {v0}, LO5/i;->a()V

    sget-object v0, Li5/u;->a:Li5/u;

    invoke-static {v0}, Li5/m;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    goto :goto_7

    :catchall_3
    move-exception v0

    sget-object v2, Li5/m;->m:Li5/m$a;

    invoke-static {v0}, Li5/n;->a(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Li5/m;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    :goto_7
    invoke-static {v0}, Li5/m;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v0

    invoke-virtual {p0, v1, v0}, LH5/U;->j(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    :goto_8
    return-void
.end method
