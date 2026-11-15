.class public LG1/D;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LG1/D$a;
    }
.end annotation


# instance fields
.field private final a:LG1/G;

.field private final b:LG1/H;

.field private final c:LG1/G;

.field private final d:LR0/d;

.field private final e:LG1/G;

.field private final f:LG1/H;

.field private final g:LG1/G;

.field private final h:LG1/H;

.field private final i:Ljava/lang/String;

.field private final j:I

.field private final k:I

.field private final l:Z

.field private final m:Z


# direct methods
.method private constructor <init>(LG1/D$a;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {}, LK1/b;->d()Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "PoolConfig()"

    invoke-static {v0}, LK1/b;->a(Ljava/lang/String;)V

    :cond_0
    invoke-static {p1}, LG1/D$a;->c(LG1/D$a;)LG1/G;

    move-result-object v0

    if-nez v0, :cond_1

    invoke-static {}, LG1/n;->a()LG1/G;

    move-result-object v0

    goto :goto_0

    :cond_1
    invoke-static {p1}, LG1/D$a;->c(LG1/D$a;)LG1/G;

    move-result-object v0

    :goto_0
    iput-object v0, p0, LG1/D;->a:LG1/G;

    invoke-static {p1}, LG1/D$a;->d(LG1/D$a;)LG1/H;

    move-result-object v0

    if-nez v0, :cond_2

    invoke-static {}, LG1/A;->h()LG1/A;

    move-result-object v0

    goto :goto_1

    :cond_2
    invoke-static {p1}, LG1/D$a;->d(LG1/D$a;)LG1/H;

    move-result-object v0

    :goto_1
    iput-object v0, p0, LG1/D;->b:LG1/H;

    invoke-static {p1}, LG1/D$a;->f(LG1/D$a;)LG1/G;

    move-result-object v0

    if-nez v0, :cond_3

    invoke-static {}, LG1/p;->b()LG1/G;

    move-result-object v0

    goto :goto_2

    :cond_3
    invoke-static {p1}, LG1/D$a;->f(LG1/D$a;)LG1/G;

    move-result-object v0

    :goto_2
    iput-object v0, p0, LG1/D;->c:LG1/G;

    invoke-static {p1}, LG1/D$a;->i(LG1/D$a;)LR0/d;

    move-result-object v0

    if-nez v0, :cond_4

    invoke-static {}, LR0/e;->b()LR0/e;

    move-result-object v0

    goto :goto_3

    :cond_4
    invoke-static {p1}, LG1/D$a;->i(LG1/D$a;)LR0/d;

    move-result-object v0

    :goto_3
    iput-object v0, p0, LG1/D;->d:LR0/d;

    invoke-static {p1}, LG1/D$a;->g(LG1/D$a;)LG1/G;

    move-result-object v0

    if-nez v0, :cond_5

    invoke-static {}, LG1/q;->a()LG1/G;

    move-result-object v0

    goto :goto_4

    :cond_5
    invoke-static {p1}, LG1/D$a;->g(LG1/D$a;)LG1/G;

    move-result-object v0

    :goto_4
    iput-object v0, p0, LG1/D;->e:LG1/G;

    invoke-static {p1}, LG1/D$a;->h(LG1/D$a;)LG1/H;

    move-result-object v0

    if-nez v0, :cond_6

    invoke-static {}, LG1/A;->h()LG1/A;

    move-result-object v0

    goto :goto_5

    :cond_6
    invoke-static {p1}, LG1/D$a;->h(LG1/D$a;)LG1/H;

    move-result-object v0

    :goto_5
    iput-object v0, p0, LG1/D;->f:LG1/H;

    invoke-static {p1}, LG1/D$a;->k(LG1/D$a;)LG1/G;

    move-result-object v0

    if-nez v0, :cond_7

    invoke-static {}, LG1/o;->a()LG1/G;

    move-result-object v0

    goto :goto_6

    :cond_7
    invoke-static {p1}, LG1/D$a;->k(LG1/D$a;)LG1/G;

    move-result-object v0

    :goto_6
    iput-object v0, p0, LG1/D;->g:LG1/G;

    invoke-static {p1}, LG1/D$a;->l(LG1/D$a;)LG1/H;

    move-result-object v0

    if-nez v0, :cond_8

    invoke-static {}, LG1/A;->h()LG1/A;

    move-result-object v0

    goto :goto_7

    :cond_8
    invoke-static {p1}, LG1/D$a;->l(LG1/D$a;)LG1/H;

    move-result-object v0

    :goto_7
    iput-object v0, p0, LG1/D;->h:LG1/H;

    invoke-static {p1}, LG1/D$a;->e(LG1/D$a;)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_9

    const-string v0, "legacy"

    goto :goto_8

    :cond_9
    invoke-static {p1}, LG1/D$a;->e(LG1/D$a;)Ljava/lang/String;

    move-result-object v0

    :goto_8
    iput-object v0, p0, LG1/D;->i:Ljava/lang/String;

    invoke-static {p1}, LG1/D$a;->b(LG1/D$a;)I

    move-result v0

    iput v0, p0, LG1/D;->j:I

    invoke-static {p1}, LG1/D$a;->a(LG1/D$a;)I

    move-result v0

    if-lez v0, :cond_a

    invoke-static {p1}, LG1/D$a;->a(LG1/D$a;)I

    move-result v0

    goto :goto_9

    :cond_a
    const/high16 v0, 0x400000

    :goto_9
    iput v0, p0, LG1/D;->k:I

    invoke-static {p1}, LG1/D$a;->j(LG1/D$a;)Z

    move-result v0

    iput-boolean v0, p0, LG1/D;->l:Z

    invoke-static {}, LK1/b;->d()Z

    move-result v0

    if-eqz v0, :cond_b

    invoke-static {}, LK1/b;->b()V

    :cond_b
    iget-boolean p1, p1, LG1/D$a;->m:Z

    iput-boolean p1, p0, LG1/D;->m:Z

    return-void
.end method

.method synthetic constructor <init>(LG1/D$a;LG1/E;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1}, LG1/D;-><init>(LG1/D$a;)V

    return-void
.end method

.method public static n()LG1/D$a;
    .locals 2

    .line 1
    new-instance v0, LG1/D$a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, LG1/D$a;-><init>(LG1/C;)V

    .line 5
    .line 6
    .line 7
    return-object v0
.end method


# virtual methods
.method public a()I
    .locals 1

    .line 1
    iget v0, p0, LG1/D;->k:I

    .line 2
    .line 3
    return v0
.end method

.method public b()I
    .locals 1

    .line 1
    iget v0, p0, LG1/D;->j:I

    .line 2
    .line 3
    return v0
.end method

.method public c()LG1/G;
    .locals 1

    .line 1
    iget-object v0, p0, LG1/D;->a:LG1/G;

    .line 2
    .line 3
    return-object v0
.end method

.method public d()LG1/H;
    .locals 1

    .line 1
    iget-object v0, p0, LG1/D;->b:LG1/H;

    .line 2
    .line 3
    return-object v0
.end method

.method public e()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, LG1/D;->i:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public f()LG1/G;
    .locals 1

    .line 1
    iget-object v0, p0, LG1/D;->c:LG1/G;

    .line 2
    .line 3
    return-object v0
.end method

.method public g()LG1/G;
    .locals 1

    .line 1
    iget-object v0, p0, LG1/D;->e:LG1/G;

    .line 2
    .line 3
    return-object v0
.end method

.method public h()LG1/H;
    .locals 1

    .line 1
    iget-object v0, p0, LG1/D;->f:LG1/H;

    .line 2
    .line 3
    return-object v0
.end method

.method public i()LR0/d;
    .locals 1

    .line 1
    iget-object v0, p0, LG1/D;->d:LR0/d;

    .line 2
    .line 3
    return-object v0
.end method

.method public j()LG1/G;
    .locals 1

    .line 1
    iget-object v0, p0, LG1/D;->g:LG1/G;

    .line 2
    .line 3
    return-object v0
.end method

.method public k()LG1/H;
    .locals 1

    .line 1
    iget-object v0, p0, LG1/D;->h:LG1/H;

    .line 2
    .line 3
    return-object v0
.end method

.method public l()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, LG1/D;->m:Z

    .line 2
    .line 3
    return v0
.end method

.method public m()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, LG1/D;->l:Z

    .line 2
    .line 3
    return v0
.end method
