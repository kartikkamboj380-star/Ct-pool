.class public final Landroidx/work/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/work/a$b;
    }
.end annotation


# instance fields
.field final a:Ljava/util/concurrent/Executor;

.field final b:Ljava/util/concurrent/Executor;

.field final c:Ll0/v;

.field final d:Ll0/h;

.field final e:Ll0/q;

.field final f:Landroidx/core/util/a;

.field final g:Landroidx/core/util/a;

.field final h:Ljava/lang/String;

.field final i:I

.field final j:I

.field final k:I

.field final l:I

.field private final m:Z


# direct methods
.method constructor <init>(Landroidx/work/a$b;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iget-object v0, p1, Landroidx/work/a$b;->a:Ljava/util/concurrent/Executor;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    invoke-direct {p0, v1}, Landroidx/work/a;->a(Z)Ljava/util/concurrent/Executor;

    move-result-object v0

    :cond_0
    iput-object v0, p0, Landroidx/work/a;->a:Ljava/util/concurrent/Executor;

    iget-object v0, p1, Landroidx/work/a$b;->d:Ljava/util/concurrent/Executor;

    if-nez v0, :cond_1

    const/4 v0, 0x1

    iput-boolean v0, p0, Landroidx/work/a;->m:Z

    invoke-direct {p0, v0}, Landroidx/work/a;->a(Z)Ljava/util/concurrent/Executor;

    move-result-object v0

    :goto_0
    iput-object v0, p0, Landroidx/work/a;->b:Ljava/util/concurrent/Executor;

    goto :goto_1

    :cond_1
    iput-boolean v1, p0, Landroidx/work/a;->m:Z

    goto :goto_0

    :goto_1
    iget-object v0, p1, Landroidx/work/a$b;->b:Ll0/v;

    if-nez v0, :cond_2

    invoke-static {}, Ll0/v;->c()Ll0/v;

    move-result-object v0

    :cond_2
    iput-object v0, p0, Landroidx/work/a;->c:Ll0/v;

    iget-object v0, p1, Landroidx/work/a$b;->c:Ll0/h;

    if-nez v0, :cond_3

    invoke-static {}, Ll0/h;->c()Ll0/h;

    move-result-object v0

    :cond_3
    iput-object v0, p0, Landroidx/work/a;->d:Ll0/h;

    iget-object v0, p1, Landroidx/work/a$b;->e:Ll0/q;

    if-nez v0, :cond_4

    new-instance v0, Landroidx/work/impl/d;

    invoke-direct {v0}, Landroidx/work/impl/d;-><init>()V

    :cond_4
    iput-object v0, p0, Landroidx/work/a;->e:Ll0/q;

    iget v0, p1, Landroidx/work/a$b;->i:I

    iput v0, p0, Landroidx/work/a;->i:I

    iget v0, p1, Landroidx/work/a$b;->j:I

    iput v0, p0, Landroidx/work/a;->j:I

    iget v0, p1, Landroidx/work/a$b;->k:I

    iput v0, p0, Landroidx/work/a;->k:I

    iget v0, p1, Landroidx/work/a$b;->l:I

    iput v0, p0, Landroidx/work/a;->l:I

    iget-object v0, p1, Landroidx/work/a$b;->f:Landroidx/core/util/a;

    iput-object v0, p0, Landroidx/work/a;->f:Landroidx/core/util/a;

    iget-object v0, p1, Landroidx/work/a$b;->g:Landroidx/core/util/a;

    iput-object v0, p0, Landroidx/work/a;->g:Landroidx/core/util/a;

    iget-object p1, p1, Landroidx/work/a$b;->h:Ljava/lang/String;

    iput-object p1, p0, Landroidx/work/a;->h:Ljava/lang/String;

    return-void
.end method

.method private a(Z)Ljava/util/concurrent/Executor;
    .locals 2

    .line 1
    invoke-static {}, Ljava/lang/Runtime;->getRuntime()Ljava/lang/Runtime;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Runtime;->availableProcessors()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    const/4 v1, 0x4

    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    move-result v0

    const/4 v1, 0x2

    invoke-static {v1, v0}, Ljava/lang/Math;->max(II)I

    move-result v0

    invoke-direct {p0, p1}, Landroidx/work/a;->b(Z)Ljava/util/concurrent/ThreadFactory;

    move-result-object p1

    invoke-static {v0, p1}, Ljava/util/concurrent/Executors;->newFixedThreadPool(ILjava/util/concurrent/ThreadFactory;)Ljava/util/concurrent/ExecutorService;

    move-result-object p1

    return-object p1
.end method

.method private b(Z)Ljava/util/concurrent/ThreadFactory;
    .locals 1

    .line 1
    new-instance v0, Landroidx/work/a$a;

    invoke-direct {v0, p0, p1}, Landroidx/work/a$a;-><init>(Landroidx/work/a;Z)V

    return-object v0
.end method


# virtual methods
.method public c()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/work/a;->h:Ljava/lang/String;

    return-object v0
.end method

.method public d()Ljava/util/concurrent/Executor;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/work/a;->a:Ljava/util/concurrent/Executor;

    return-object v0
.end method

.method public e()Landroidx/core/util/a;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/work/a;->f:Landroidx/core/util/a;

    return-object v0
.end method

.method public f()Ll0/h;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/work/a;->d:Ll0/h;

    .line 2
    .line 3
    return-object v0
.end method

.method public g()I
    .locals 1

    .line 1
    iget v0, p0, Landroidx/work/a;->k:I

    return v0
.end method

.method public h()I
    .locals 1

    .line 1
    iget v0, p0, Landroidx/work/a;->l:I

    return v0
.end method

.method public i()I
    .locals 1

    .line 1
    iget v0, p0, Landroidx/work/a;->j:I

    return v0
.end method

.method public j()I
    .locals 1

    .line 1
    iget v0, p0, Landroidx/work/a;->i:I

    return v0
.end method

.method public k()Ll0/q;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/work/a;->e:Ll0/q;

    .line 2
    .line 3
    return-object v0
.end method

.method public l()Landroidx/core/util/a;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/work/a;->g:Landroidx/core/util/a;

    return-object v0
.end method

.method public m()Ljava/util/concurrent/Executor;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/work/a;->b:Ljava/util/concurrent/Executor;

    return-object v0
.end method

.method public n()Ll0/v;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/work/a;->c:Ll0/v;

    .line 2
    .line 3
    return-object v0
.end method
