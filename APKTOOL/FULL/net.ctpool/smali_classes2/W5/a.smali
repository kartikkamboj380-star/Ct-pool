.class public final LW5/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LT5/v;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LW5/a$a;
    }
.end annotation


# static fields
.field public static final b:LW5/a$a;


# instance fields
.field private final a:LT5/c;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, LW5/a$a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, LW5/a$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, LW5/a;->b:LW5/a$a;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>(LT5/c;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LW5/a;->a:LT5/c;

    .line 5
    .line 6
    return-void
.end method

.method private final b(LW5/b;LT5/D;)LT5/D;
    .locals 4

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    return-object p2

    .line 4
    :cond_0
    invoke-interface {p1}, LW5/b;->b()Li6/A;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    invoke-virtual {p2}, LT5/D;->a()LT5/E;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-static {v1}, Lw5/k;->c(Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {v1}, LT5/E;->j()Li6/h;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    invoke-static {v0}, Li6/q;->c(Li6/A;)Li6/g;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    new-instance v2, LW5/a$b;

    .line 24
    .line 25
    invoke-direct {v2, v1, p1, v0}, LW5/a$b;-><init>(Li6/h;LW5/b;Li6/g;)V

    .line 26
    .line 27
    .line 28
    const-string p1, "Content-Type"

    .line 29
    .line 30
    const/4 v0, 0x2

    .line 31
    const/4 v1, 0x0

    .line 32
    invoke-static {p2, p1, v1, v0, v1}, LT5/D;->o(LT5/D;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    invoke-virtual {p2}, LT5/D;->a()LT5/E;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    invoke-virtual {v0}, LT5/E;->e()J

    .line 41
    .line 42
    .line 43
    move-result-wide v0

    .line 44
    invoke-virtual {p2}, LT5/D;->U()LT5/D$a;

    .line 45
    .line 46
    .line 47
    move-result-object p2

    .line 48
    new-instance v3, LZ5/h;

    .line 49
    .line 50
    invoke-static {v2}, Li6/q;->d(Li6/C;)Li6/h;

    .line 51
    .line 52
    .line 53
    move-result-object v2

    .line 54
    invoke-direct {v3, p1, v0, v1, v2}, LZ5/h;-><init>(Ljava/lang/String;JLi6/h;)V

    .line 55
    .line 56
    .line 57
    invoke-virtual {p2, v3}, LT5/D$a;->b(LT5/E;)LT5/D$a;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    invoke-virtual {p1}, LT5/D$a;->c()LT5/D;

    .line 62
    .line 63
    .line 64
    move-result-object p1

    .line 65
    return-object p1
.end method


# virtual methods
.method public a(LT5/v$a;)LT5/D;
    .locals 8

    .line 1
    const-string v0, "chain"

    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, LT5/v$a;->call()LT5/e;

    move-result-object v0

    iget-object v1, p0, LW5/a;->a:LT5/c;

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    invoke-interface {p1}, LT5/v$a;->o()LT5/B;

    move-result-object v3

    invoke-virtual {v1, v3}, LT5/c;->b(LT5/B;)LT5/D;

    move-result-object v1

    goto :goto_0

    :cond_0
    move-object v1, v2

    :goto_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v3

    new-instance v5, LW5/c$b;

    invoke-interface {p1}, LT5/v$a;->o()LT5/B;

    move-result-object v6

    invoke-direct {v5, v3, v4, v6, v1}, LW5/c$b;-><init>(JLT5/B;LT5/D;)V

    invoke-virtual {v5}, LW5/c$b;->b()LW5/c;

    move-result-object v3

    invoke-virtual {v3}, LW5/c;->b()LT5/B;

    move-result-object v4

    invoke-virtual {v3}, LW5/c;->a()LT5/D;

    move-result-object v5

    iget-object v6, p0, LW5/a;->a:LT5/c;

    if-eqz v6, :cond_1

    invoke-virtual {v6, v3}, LT5/c;->o(LW5/c;)V

    :cond_1
    instance-of v3, v0, LY5/e;

    if-nez v3, :cond_2

    goto :goto_1

    :cond_2
    move-object v2, v0

    :goto_1
    check-cast v2, LY5/e;

    if-eqz v2, :cond_3

    invoke-virtual {v2}, LY5/e;->m()LT5/r;

    move-result-object v2

    if-eqz v2, :cond_3

    goto :goto_2

    :cond_3
    sget-object v2, LT5/r;->a:LT5/r;

    :goto_2
    if-eqz v1, :cond_4

    if-nez v5, :cond_4

    invoke-virtual {v1}, LT5/D;->a()LT5/E;

    move-result-object v3

    if-eqz v3, :cond_4

    invoke-static {v3}, LU5/c;->j(Ljava/io/Closeable;)V

    :cond_4
    if-nez v4, :cond_5

    if-nez v5, :cond_5

    new-instance v1, LT5/D$a;

    invoke-direct {v1}, LT5/D$a;-><init>()V

    invoke-interface {p1}, LT5/v$a;->o()LT5/B;

    move-result-object p1

    invoke-virtual {v1, p1}, LT5/D$a;->r(LT5/B;)LT5/D$a;

    move-result-object p1

    sget-object v1, LT5/A;->o:LT5/A;

    invoke-virtual {p1, v1}, LT5/D$a;->p(LT5/A;)LT5/D$a;

    move-result-object p1

    const/16 v1, 0x1f8

    invoke-virtual {p1, v1}, LT5/D$a;->g(I)LT5/D$a;

    move-result-object p1

    const-string v1, "Unsatisfiable Request (only-if-cached)"

    invoke-virtual {p1, v1}, LT5/D$a;->m(Ljava/lang/String;)LT5/D$a;

    move-result-object p1

    sget-object v1, LU5/c;->c:LT5/E;

    invoke-virtual {p1, v1}, LT5/D$a;->b(LT5/E;)LT5/D$a;

    move-result-object p1

    const-wide/16 v3, -0x1

    invoke-virtual {p1, v3, v4}, LT5/D$a;->s(J)LT5/D$a;

    move-result-object p1

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v3

    invoke-virtual {p1, v3, v4}, LT5/D$a;->q(J)LT5/D$a;

    move-result-object p1

    invoke-virtual {p1}, LT5/D$a;->c()LT5/D;

    move-result-object p1

    invoke-virtual {v2, v0, p1}, LT5/r;->A(LT5/e;LT5/D;)V

    return-object p1

    :cond_5
    if-nez v4, :cond_6

    invoke-static {v5}, Lw5/k;->c(Ljava/lang/Object;)V

    invoke-virtual {v5}, LT5/D;->U()LT5/D$a;

    move-result-object p1

    sget-object v1, LW5/a;->b:LW5/a$a;

    invoke-static {v1, v5}, LW5/a$a;->b(LW5/a$a;LT5/D;)LT5/D;

    move-result-object v1

    invoke-virtual {p1, v1}, LT5/D$a;->d(LT5/D;)LT5/D$a;

    move-result-object p1

    invoke-virtual {p1}, LT5/D$a;->c()LT5/D;

    move-result-object p1

    invoke-virtual {v2, v0, p1}, LT5/r;->b(LT5/e;LT5/D;)V

    return-object p1

    :cond_6
    if-eqz v5, :cond_7

    invoke-virtual {v2, v0, v5}, LT5/r;->a(LT5/e;LT5/D;)V

    goto :goto_3

    :cond_7
    iget-object v3, p0, LW5/a;->a:LT5/c;

    if-eqz v3, :cond_8

    invoke-virtual {v2, v0}, LT5/r;->c(LT5/e;)V

    :cond_8
    :goto_3
    :try_start_0
    invoke-interface {p1, v4}, LT5/v$a;->a(LT5/B;)LT5/D;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez p1, :cond_9

    if-eqz v1, :cond_9

    invoke-virtual {v1}, LT5/D;->a()LT5/E;

    move-result-object v1

    if-eqz v1, :cond_9

    invoke-static {v1}, LU5/c;->j(Ljava/io/Closeable;)V

    :cond_9
    if-eqz v5, :cond_b

    if-eqz p1, :cond_a

    invoke-virtual {p1}, LT5/D;->f()I

    move-result v1

    const/16 v3, 0x130

    if-ne v1, v3, :cond_a

    invoke-virtual {v5}, LT5/D;->U()LT5/D$a;

    move-result-object v1

    sget-object v3, LW5/a;->b:LW5/a$a;

    invoke-virtual {v5}, LT5/D;->w()LT5/t;

    move-result-object v4

    invoke-virtual {p1}, LT5/D;->w()LT5/t;

    move-result-object v6

    invoke-static {v3, v4, v6}, LW5/a$a;->a(LW5/a$a;LT5/t;LT5/t;)LT5/t;

    move-result-object v4

    invoke-virtual {v1, v4}, LT5/D$a;->k(LT5/t;)LT5/D$a;

    move-result-object v1

    invoke-virtual {p1}, LT5/D;->n0()J

    move-result-wide v6

    invoke-virtual {v1, v6, v7}, LT5/D$a;->s(J)LT5/D$a;

    move-result-object v1

    invoke-virtual {p1}, LT5/D;->h0()J

    move-result-wide v6

    invoke-virtual {v1, v6, v7}, LT5/D$a;->q(J)LT5/D$a;

    move-result-object v1

    invoke-static {v3, v5}, LW5/a$a;->b(LW5/a$a;LT5/D;)LT5/D;

    move-result-object v4

    invoke-virtual {v1, v4}, LT5/D$a;->d(LT5/D;)LT5/D$a;

    move-result-object v1

    invoke-static {v3, p1}, LW5/a$a;->b(LW5/a$a;LT5/D;)LT5/D;

    move-result-object v3

    invoke-virtual {v1, v3}, LT5/D$a;->n(LT5/D;)LT5/D$a;

    move-result-object v1

    invoke-virtual {v1}, LT5/D$a;->c()LT5/D;

    move-result-object v1

    invoke-virtual {p1}, LT5/D;->a()LT5/E;

    move-result-object p1

    invoke-static {p1}, Lw5/k;->c(Ljava/lang/Object;)V

    invoke-virtual {p1}, LT5/E;->close()V

    iget-object p1, p0, LW5/a;->a:LT5/c;

    invoke-static {p1}, Lw5/k;->c(Ljava/lang/Object;)V

    invoke-virtual {p1}, LT5/c;->n()V

    iget-object p1, p0, LW5/a;->a:LT5/c;

    invoke-virtual {p1, v5, v1}, LT5/c;->w(LT5/D;LT5/D;)V

    invoke-virtual {v2, v0, v1}, LT5/r;->b(LT5/e;LT5/D;)V

    return-object v1

    :cond_a
    invoke-virtual {v5}, LT5/D;->a()LT5/E;

    move-result-object v1

    if-eqz v1, :cond_b

    invoke-static {v1}, LU5/c;->j(Ljava/io/Closeable;)V

    :cond_b
    invoke-static {p1}, Lw5/k;->c(Ljava/lang/Object;)V

    invoke-virtual {p1}, LT5/D;->U()LT5/D$a;

    move-result-object v1

    sget-object v3, LW5/a;->b:LW5/a$a;

    invoke-static {v3, v5}, LW5/a$a;->b(LW5/a$a;LT5/D;)LT5/D;

    move-result-object v6

    invoke-virtual {v1, v6}, LT5/D$a;->d(LT5/D;)LT5/D$a;

    move-result-object v1

    invoke-static {v3, p1}, LW5/a$a;->b(LW5/a$a;LT5/D;)LT5/D;

    move-result-object p1

    invoke-virtual {v1, p1}, LT5/D$a;->n(LT5/D;)LT5/D$a;

    move-result-object p1

    invoke-virtual {p1}, LT5/D$a;->c()LT5/D;

    move-result-object p1

    iget-object v1, p0, LW5/a;->a:LT5/c;

    if-eqz v1, :cond_e

    invoke-static {p1}, LZ5/e;->b(LT5/D;)Z

    move-result v1

    if-eqz v1, :cond_d

    sget-object v1, LW5/c;->c:LW5/c$a;

    invoke-virtual {v1, p1, v4}, LW5/c$a;->a(LT5/D;LT5/B;)Z

    move-result v1

    if-eqz v1, :cond_d

    iget-object v1, p0, LW5/a;->a:LT5/c;

    invoke-virtual {v1, p1}, LT5/c;->f(LT5/D;)LW5/b;

    move-result-object v1

    invoke-direct {p0, v1, p1}, LW5/a;->b(LW5/b;LT5/D;)LT5/D;

    move-result-object p1

    if-eqz v5, :cond_c

    invoke-virtual {v2, v0}, LT5/r;->c(LT5/e;)V

    :cond_c
    return-object p1

    :cond_d
    sget-object v0, LZ5/f;->a:LZ5/f;

    invoke-virtual {v4}, LT5/B;->h()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, LZ5/f;->a(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_e

    :try_start_1
    iget-object v0, p0, LW5/a;->a:LT5/c;

    invoke-virtual {v0, v4}, LT5/c;->g(LT5/B;)V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    :catch_0
    :cond_e
    return-object p1

    :catchall_0
    move-exception p1

    if-eqz v1, :cond_f

    invoke-virtual {v1}, LT5/D;->a()LT5/E;

    move-result-object v0

    if-eqz v0, :cond_f

    invoke-static {v0}, LU5/c;->j(Ljava/io/Closeable;)V

    :cond_f
    throw p1
.end method
