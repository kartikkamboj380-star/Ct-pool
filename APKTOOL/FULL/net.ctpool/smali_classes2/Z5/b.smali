.class public final LZ5/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LT5/v;


# instance fields
.field private final a:Z


# direct methods
.method public constructor <init>(Z)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-boolean p1, p0, LZ5/b;->a:Z

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public a(LT5/v$a;)LT5/D;
    .locals 11

    .line 1
    const-string v0, "chain"

    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, LZ5/g;

    invoke-virtual {p1}, LZ5/g;->f()LY5/c;

    move-result-object v0

    invoke-static {v0}, Lw5/k;->c(Ljava/lang/Object;)V

    invoke-virtual {p1}, LZ5/g;->h()LT5/B;

    move-result-object p1

    invoke-virtual {p1}, LT5/B;->a()LT5/C;

    move-result-object v1

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    invoke-virtual {v0, p1}, LY5/c;->v(LT5/B;)V

    invoke-virtual {p1}, LT5/B;->h()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, LZ5/f;->b(Ljava/lang/String;)Z

    move-result v4

    const/4 v5, 0x0

    const/4 v6, 0x1

    const/4 v7, 0x0

    if-eqz v4, :cond_3

    if-eqz v1, :cond_3

    const-string v4, "Expect"

    invoke-virtual {p1, v4}, LT5/B;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    const-string v8, "100-continue"

    invoke-static {v8, v4, v6}, LF5/g;->p(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-virtual {v0}, LY5/c;->f()V

    invoke-virtual {v0, v6}, LY5/c;->q(Z)LT5/D$a;

    move-result-object v4

    invoke-virtual {v0}, LY5/c;->s()V

    move v8, v5

    goto :goto_0

    :cond_0
    move v8, v6

    move-object v4, v7

    :goto_0
    if-nez v4, :cond_2

    invoke-virtual {v1}, LT5/C;->f()Z

    move-result v9

    if-eqz v9, :cond_1

    invoke-virtual {v0}, LY5/c;->f()V

    invoke-virtual {v0, p1, v6}, LY5/c;->c(LT5/B;Z)Li6/A;

    move-result-object v9

    invoke-static {v9}, Li6/q;->c(Li6/A;)Li6/g;

    move-result-object v9

    invoke-virtual {v1, v9}, LT5/C;->h(Li6/g;)V

    goto :goto_1

    :cond_1
    invoke-virtual {v0, p1, v5}, LY5/c;->c(LT5/B;Z)Li6/A;

    move-result-object v9

    invoke-static {v9}, Li6/q;->c(Li6/A;)Li6/g;

    move-result-object v9

    invoke-virtual {v1, v9}, LT5/C;->h(Li6/g;)V

    invoke-interface {v9}, Li6/A;->close()V

    goto :goto_1

    :cond_2
    invoke-virtual {v0}, LY5/c;->o()V

    invoke-virtual {v0}, LY5/c;->h()LY5/f;

    move-result-object v9

    invoke-virtual {v9}, LY5/f;->v()Z

    move-result v9

    if-nez v9, :cond_4

    invoke-virtual {v0}, LY5/c;->n()V

    goto :goto_1

    :cond_3
    invoke-virtual {v0}, LY5/c;->o()V

    move v8, v6

    move-object v4, v7

    :cond_4
    :goto_1
    if-eqz v1, :cond_5

    invoke-virtual {v1}, LT5/C;->f()Z

    move-result v1

    if-nez v1, :cond_6

    :cond_5
    invoke-virtual {v0}, LY5/c;->e()V

    :cond_6
    if-nez v4, :cond_7

    invoke-virtual {v0, v5}, LY5/c;->q(Z)LT5/D$a;

    move-result-object v4

    invoke-static {v4}, Lw5/k;->c(Ljava/lang/Object;)V

    if-eqz v8, :cond_7

    invoke-virtual {v0}, LY5/c;->s()V

    move v8, v5

    :cond_7
    invoke-virtual {v4, p1}, LT5/D$a;->r(LT5/B;)LT5/D$a;

    move-result-object v1

    invoke-virtual {v0}, LY5/c;->h()LY5/f;

    move-result-object v4

    invoke-virtual {v4}, LY5/f;->r()LT5/s;

    move-result-object v4

    invoke-virtual {v1, v4}, LT5/D$a;->i(LT5/s;)LT5/D$a;

    move-result-object v1

    invoke-virtual {v1, v2, v3}, LT5/D$a;->s(J)LT5/D$a;

    move-result-object v1

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v9

    invoke-virtual {v1, v9, v10}, LT5/D$a;->q(J)LT5/D$a;

    move-result-object v1

    invoke-virtual {v1}, LT5/D$a;->c()LT5/D;

    move-result-object v1

    invoke-virtual {v1}, LT5/D;->f()I

    move-result v4

    const/16 v9, 0x64

    if-ne v4, v9, :cond_9

    invoke-virtual {v0, v5}, LY5/c;->q(Z)LT5/D$a;

    move-result-object v1

    invoke-static {v1}, Lw5/k;->c(Ljava/lang/Object;)V

    if-eqz v8, :cond_8

    invoke-virtual {v0}, LY5/c;->s()V

    :cond_8
    invoke-virtual {v1, p1}, LT5/D$a;->r(LT5/B;)LT5/D$a;

    move-result-object p1

    invoke-virtual {v0}, LY5/c;->h()LY5/f;

    move-result-object v1

    invoke-virtual {v1}, LY5/f;->r()LT5/s;

    move-result-object v1

    invoke-virtual {p1, v1}, LT5/D$a;->i(LT5/s;)LT5/D$a;

    move-result-object p1

    invoke-virtual {p1, v2, v3}, LT5/D$a;->s(J)LT5/D$a;

    move-result-object p1

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    invoke-virtual {p1, v1, v2}, LT5/D$a;->q(J)LT5/D$a;

    move-result-object p1

    invoke-virtual {p1}, LT5/D$a;->c()LT5/D;

    move-result-object v1

    invoke-virtual {v1}, LT5/D;->f()I

    move-result v4

    :cond_9
    invoke-virtual {v0, v1}, LY5/c;->r(LT5/D;)V

    iget-boolean p1, p0, LZ5/b;->a:Z

    if-eqz p1, :cond_a

    const/16 p1, 0x65

    if-ne v4, p1, :cond_a

    invoke-virtual {v1}, LT5/D;->U()LT5/D$a;

    move-result-object p1

    sget-object v1, LU5/c;->c:LT5/E;

    :goto_2
    invoke-virtual {p1, v1}, LT5/D$a;->b(LT5/E;)LT5/D$a;

    move-result-object p1

    invoke-virtual {p1}, LT5/D$a;->c()LT5/D;

    move-result-object p1

    goto :goto_3

    :cond_a
    invoke-virtual {v1}, LT5/D;->U()LT5/D$a;

    move-result-object p1

    invoke-virtual {v0, v1}, LY5/c;->p(LT5/D;)LT5/E;

    move-result-object v1

    goto :goto_2

    :goto_3
    invoke-virtual {p1}, LT5/D;->j0()LT5/B;

    move-result-object v1

    const-string v2, "Connection"

    invoke-virtual {v1, v2}, LT5/B;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-string v3, "close"

    invoke-static {v3, v1, v6}, LF5/g;->p(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v1

    if-nez v1, :cond_b

    const/4 v1, 0x2

    invoke-static {p1, v2, v7, v1, v7}, LT5/D;->o(LT5/D;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v3, v1, v6}, LF5/g;->p(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v1

    if-eqz v1, :cond_c

    :cond_b
    invoke-virtual {v0}, LY5/c;->n()V

    :cond_c
    const/16 v0, 0xcc

    if-eq v4, v0, :cond_d

    const/16 v0, 0xcd

    if-ne v4, v0, :cond_10

    :cond_d
    invoke-virtual {p1}, LT5/D;->a()LT5/E;

    move-result-object v0

    if-eqz v0, :cond_e

    invoke-virtual {v0}, LT5/E;->e()J

    move-result-wide v0

    goto :goto_4

    :cond_e
    const-wide/16 v0, -0x1

    :goto_4
    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-lez v0, :cond_10

    new-instance v0, Ljava/net/ProtocolException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "HTTP "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, " had non-zero Content-Length: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, LT5/D;->a()LT5/E;

    move-result-object p1

    if-eqz p1, :cond_f

    invoke-virtual {p1}, LT5/E;->e()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v7

    :cond_f
    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_10
    return-object p1
.end method
