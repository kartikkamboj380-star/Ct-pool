.class public final LW5/a$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Li6/C;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LW5/a;->b(LW5/b;LT5/D;)LT5/D;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field private m:Z

.field final synthetic n:Li6/h;

.field final synthetic o:LW5/b;

.field final synthetic p:Li6/g;


# direct methods
.method constructor <init>(Li6/h;LW5/b;Li6/g;)V
    .locals 0

    .line 1
    iput-object p1, p0, LW5/a$b;->n:Li6/h;

    .line 2
    .line 3
    iput-object p2, p0, LW5/a$b;->o:LW5/b;

    .line 4
    .line 5
    iput-object p3, p0, LW5/a$b;->p:Li6/g;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public L0(Li6/f;J)J
    .locals 8

    .line 1
    const-string v0, "sink"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x1

    .line 7
    :try_start_0
    iget-object v1, p0, LW5/a$b;->n:Li6/h;

    .line 8
    .line 9
    invoke-interface {v1, p1, p2, p3}, Li6/C;->L0(Li6/f;J)J

    .line 10
    .line 11
    .line 12
    move-result-wide p2
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 13
    const-wide/16 v1, -0x1

    .line 14
    .line 15
    cmp-long v3, p2, v1

    .line 16
    .line 17
    if-nez v3, :cond_1

    .line 18
    .line 19
    iget-boolean p1, p0, LW5/a$b;->m:Z

    .line 20
    .line 21
    if-nez p1, :cond_0

    .line 22
    .line 23
    iput-boolean v0, p0, LW5/a$b;->m:Z

    .line 24
    .line 25
    iget-object p1, p0, LW5/a$b;->p:Li6/g;

    .line 26
    .line 27
    invoke-interface {p1}, Li6/A;->close()V

    .line 28
    .line 29
    .line 30
    :cond_0
    return-wide v1

    .line 31
    :cond_1
    iget-object v0, p0, LW5/a$b;->p:Li6/g;

    .line 32
    .line 33
    invoke-interface {v0}, Li6/g;->h()Li6/f;

    .line 34
    .line 35
    .line 36
    move-result-object v3

    .line 37
    invoke-virtual {p1}, Li6/f;->m1()J

    .line 38
    .line 39
    .line 40
    move-result-wide v0

    .line 41
    sub-long v4, v0, p2

    .line 42
    .line 43
    move-object v2, p1

    .line 44
    move-wide v6, p2

    .line 45
    invoke-virtual/range {v2 .. v7}, Li6/f;->g(Li6/f;JJ)Li6/f;

    .line 46
    .line 47
    .line 48
    iget-object p1, p0, LW5/a$b;->p:Li6/g;

    .line 49
    .line 50
    invoke-interface {p1}, Li6/g;->X()Li6/g;

    .line 51
    .line 52
    .line 53
    return-wide p2

    .line 54
    :catch_0
    move-exception p1

    .line 55
    iget-boolean p2, p0, LW5/a$b;->m:Z

    .line 56
    .line 57
    if-nez p2, :cond_2

    .line 58
    .line 59
    iput-boolean v0, p0, LW5/a$b;->m:Z

    .line 60
    .line 61
    iget-object p2, p0, LW5/a$b;->o:LW5/b;

    .line 62
    .line 63
    invoke-interface {p2}, LW5/b;->a()V

    .line 64
    .line 65
    .line 66
    :cond_2
    throw p1
.end method

.method public close()V
    .locals 2

    .line 1
    iget-boolean v0, p0, LW5/a$b;->m:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/16 v0, 0x64

    .line 6
    .line 7
    sget-object v1, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 8
    .line 9
    invoke-static {p0, v0, v1}, LU5/c;->p(Li6/C;ILjava/util/concurrent/TimeUnit;)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    const/4 v0, 0x1

    .line 16
    iput-boolean v0, p0, LW5/a$b;->m:Z

    .line 17
    .line 18
    iget-object v0, p0, LW5/a$b;->o:LW5/b;

    .line 19
    .line 20
    invoke-interface {v0}, LW5/b;->a()V

    .line 21
    .line 22
    .line 23
    :cond_0
    iget-object v0, p0, LW5/a$b;->n:Li6/h;

    .line 24
    .line 25
    invoke-interface {v0}, Li6/C;->close()V

    .line 26
    .line 27
    .line 28
    return-void
.end method

.method public i()Li6/D;
    .locals 1

    .line 1
    iget-object v0, p0, LW5/a$b;->n:Li6/h;

    .line 2
    .line 3
    invoke-interface {v0}, Li6/C;->i()Li6/D;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method
