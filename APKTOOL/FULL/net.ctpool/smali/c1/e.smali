.class public Lc1/e;
.super Lg1/b;
.source "SourceFile"


# instance fields
.field private final t:Ly1/k;

.field private final u:Lc1/g;

.field private v:LO0/f;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lc1/g;Ly1/k;Ljava/util/Set;Ljava/util/Set;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p4, p5}, Lg1/b;-><init>(Landroid/content/Context;Ljava/util/Set;Ljava/util/Set;)V

    .line 2
    .line 3
    .line 4
    iput-object p3, p0, Lc1/e;->t:Ly1/k;

    .line 5
    .line 6
    iput-object p2, p0, Lc1/e;->u:Lc1/g;

    .line 7
    .line 8
    return-void
.end method

.method public static F(Lg1/b$c;)LJ1/b$c;
    .locals 3

    .line 1
    sget-object v0, Lc1/e$a;->a:[I

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    aget v0, v0, v1

    .line 8
    .line 9
    const/4 v1, 0x1

    .line 10
    if-eq v0, v1, :cond_2

    .line 11
    .line 12
    const/4 v1, 0x2

    .line 13
    if-eq v0, v1, :cond_1

    .line 14
    .line 15
    const/4 v1, 0x3

    .line 16
    if-ne v0, v1, :cond_0

    .line 17
    .line 18
    sget-object p0, LJ1/b$c;->q:LJ1/b$c;

    .line 19
    .line 20
    return-object p0

    .line 21
    :cond_0
    new-instance v0, Ljava/lang/RuntimeException;

    .line 22
    .line 23
    new-instance v1, Ljava/lang/StringBuilder;

    .line 24
    .line 25
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 26
    .line 27
    .line 28
    const-string v2, "Cache level"

    .line 29
    .line 30
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    const-string p0, "is not supported. "

    .line 37
    .line 38
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object p0

    .line 45
    invoke-direct {v0, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    throw v0

    .line 49
    :cond_1
    sget-object p0, LJ1/b$c;->o:LJ1/b$c;

    .line 50
    .line 51
    return-object p0

    .line 52
    :cond_2
    sget-object p0, LJ1/b$c;->n:LJ1/b$c;

    .line 53
    .line 54
    return-object p0
.end method

.method private G()LI0/d;
    .locals 3

    .line 1
    invoke-virtual {p0}, Lg1/b;->l()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, LJ1/b;

    .line 6
    .line 7
    iget-object v1, p0, Lc1/e;->t:Ly1/k;

    .line 8
    .line 9
    invoke-virtual {v1}, Ly1/k;->n()Lw1/k;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    if-eqz v1, :cond_1

    .line 14
    .line 15
    if-eqz v0, :cond_1

    .line 16
    .line 17
    invoke-virtual {v0}, LJ1/b;->k()LJ1/d;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    if-eqz v2, :cond_0

    .line 22
    .line 23
    invoke-virtual {p0}, Lg1/b;->d()Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    invoke-interface {v1, v0, v2}, Lw1/k;->b(LJ1/b;Ljava/lang/Object;)LI0/d;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    goto :goto_0

    .line 32
    :cond_0
    invoke-virtual {p0}, Lg1/b;->d()Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v2

    .line 36
    invoke-interface {v1, v0, v2}, Lw1/k;->a(LJ1/b;Ljava/lang/Object;)LI0/d;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    goto :goto_0

    .line 41
    :cond_1
    const/4 v0, 0x0

    .line 42
    :goto_0
    return-object v0
.end method


# virtual methods
.method protected H(Lm1/a;Ljava/lang/String;LJ1/b;Ljava/lang/Object;Lg1/b$c;)LY0/c;
    .locals 6

    .line 1
    iget-object v0, p0, Lc1/e;->t:Ly1/k;

    .line 2
    .line 3
    invoke-static {p5}, Lc1/e;->F(Lg1/b$c;)LJ1/b$c;

    .line 4
    .line 5
    .line 6
    move-result-object v3

    .line 7
    invoke-virtual {p0, p1}, Lc1/e;->I(Lm1/a;)LF1/e;

    .line 8
    .line 9
    .line 10
    move-result-object v4

    .line 11
    move-object v1, p3

    .line 12
    move-object v2, p4

    .line 13
    move-object v5, p2

    .line 14
    invoke-virtual/range {v0 .. v5}, Ly1/k;->i(LJ1/b;Ljava/lang/Object;LJ1/b$c;LF1/e;Ljava/lang/String;)LY0/c;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    return-object p1
.end method

.method protected I(Lm1/a;)LF1/e;
    .locals 1

    .line 1
    instance-of v0, p1, Lc1/d;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p1, Lc1/d;

    .line 6
    .line 7
    invoke-virtual {p1}, Lc1/d;->o0()LF1/e;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    return-object p1

    .line 12
    :cond_0
    const/4 p1, 0x0

    .line 13
    return-object p1
.end method

.method protected J()Lc1/d;
    .locals 7

    .line 1
    invoke-static {}, LK1/b;->d()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const-string v0, "PipelineDraweeControllerBuilder#obtainController"

    .line 8
    .line 9
    invoke-static {v0}, LK1/b;->a(Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    :cond_0
    :try_start_0
    invoke-virtual {p0}, Lg1/b;->n()Lm1/a;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    invoke-static {}, Lg1/b;->c()Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v3

    .line 20
    instance-of v1, v0, Lc1/d;

    .line 21
    .line 22
    if-eqz v1, :cond_1

    .line 23
    .line 24
    check-cast v0, Lc1/d;

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :catchall_0
    move-exception v0

    .line 28
    goto :goto_1

    .line 29
    :cond_1
    iget-object v0, p0, Lc1/e;->u:Lc1/g;

    .line 30
    .line 31
    invoke-virtual {v0}, Lc1/g;->c()Lc1/d;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    :goto_0
    invoke-virtual {p0, v0, v3}, Lg1/b;->w(Lm1/a;Ljava/lang/String;)LO0/o;

    .line 36
    .line 37
    .line 38
    move-result-object v2

    .line 39
    invoke-direct {p0}, Lc1/e;->G()LI0/d;

    .line 40
    .line 41
    .line 42
    move-result-object v4

    .line 43
    invoke-virtual {p0}, Lg1/b;->d()Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v5

    .line 47
    iget-object v6, p0, Lc1/e;->v:LO0/f;

    .line 48
    .line 49
    move-object v1, v0

    .line 50
    invoke-virtual/range {v1 .. v6}, Lc1/d;->q0(LO0/o;Ljava/lang/String;LI0/d;Ljava/lang/Object;LO0/f;)V

    .line 51
    .line 52
    .line 53
    sget-object v1, LO0/p;->b:LO0/o;

    .line 54
    .line 55
    const/4 v2, 0x0

    .line 56
    invoke-virtual {v0, v2, p0, v1}, Lc1/d;->r0(Lp1/g;Lg1/b;LO0/o;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 57
    .line 58
    .line 59
    invoke-static {}, LK1/b;->d()Z

    .line 60
    .line 61
    .line 62
    move-result v1

    .line 63
    if-eqz v1, :cond_2

    .line 64
    .line 65
    invoke-static {}, LK1/b;->b()V

    .line 66
    .line 67
    .line 68
    :cond_2
    return-object v0

    .line 69
    :goto_1
    invoke-static {}, LK1/b;->d()Z

    .line 70
    .line 71
    .line 72
    move-result v1

    .line 73
    if-eqz v1, :cond_3

    .line 74
    .line 75
    invoke-static {}, LK1/b;->b()V

    .line 76
    .line 77
    .line 78
    :cond_3
    throw v0
.end method

.method public K(Lp1/g;)Lc1/e;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lg1/b;->p()Lg1/b;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, Lc1/e;

    .line 6
    .line 7
    return-object p1
.end method

.method protected bridge synthetic g(Lm1/a;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Lg1/b$c;)LY0/c;
    .locals 0

    .line 1
    check-cast p3, LJ1/b;

    .line 2
    .line 3
    invoke-virtual/range {p0 .. p5}, Lc1/e;->H(Lm1/a;Ljava/lang/String;LJ1/b;Ljava/lang/Object;Lg1/b$c;)LY0/c;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method

.method protected bridge synthetic v()Lg1/a;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lc1/e;->J()Lc1/d;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method
