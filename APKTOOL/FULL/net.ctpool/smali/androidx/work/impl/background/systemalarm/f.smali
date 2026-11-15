.class public Landroidx/work/impl/background/systemalarm/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ln0/c;
.implements Lr0/D$a;


# static fields
.field private static final y:Ljava/lang/String;


# instance fields
.field private final m:Landroid/content/Context;

.field private final n:I

.field private final o:Lq0/m;

.field private final p:Landroidx/work/impl/background/systemalarm/g;

.field private final q:Ln0/e;

.field private final r:Ljava/lang/Object;

.field private s:I

.field private final t:Ljava/util/concurrent/Executor;

.field private final u:Ljava/util/concurrent/Executor;

.field private v:Landroid/os/PowerManager$WakeLock;

.field private w:Z

.field private final x:Landroidx/work/impl/v;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-string v0, "DelayMetCommandHandler"

    invoke-static {v0}, Ll0/i;->i(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Landroidx/work/impl/background/systemalarm/f;->y:Ljava/lang/String;

    return-void
.end method

.method constructor <init>(Landroid/content/Context;ILandroidx/work/impl/background/systemalarm/g;Landroidx/work/impl/v;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/work/impl/background/systemalarm/f;->m:Landroid/content/Context;

    iput p2, p0, Landroidx/work/impl/background/systemalarm/f;->n:I

    iput-object p3, p0, Landroidx/work/impl/background/systemalarm/f;->p:Landroidx/work/impl/background/systemalarm/g;

    invoke-virtual {p4}, Landroidx/work/impl/v;->a()Lq0/m;

    move-result-object p1

    iput-object p1, p0, Landroidx/work/impl/background/systemalarm/f;->o:Lq0/m;

    iput-object p4, p0, Landroidx/work/impl/background/systemalarm/f;->x:Landroidx/work/impl/v;

    invoke-virtual {p3}, Landroidx/work/impl/background/systemalarm/g;->g()Landroidx/work/impl/E;

    move-result-object p1

    invoke-virtual {p1}, Landroidx/work/impl/E;->u()Lp0/n;

    move-result-object p1

    invoke-virtual {p3}, Landroidx/work/impl/background/systemalarm/g;->f()Ls0/b;

    move-result-object p2

    invoke-interface {p2}, Ls0/b;->b()Ls0/a;

    move-result-object p2

    iput-object p2, p0, Landroidx/work/impl/background/systemalarm/f;->t:Ljava/util/concurrent/Executor;

    invoke-virtual {p3}, Landroidx/work/impl/background/systemalarm/g;->f()Ls0/b;

    move-result-object p2

    invoke-interface {p2}, Ls0/b;->a()Ljava/util/concurrent/Executor;

    move-result-object p2

    iput-object p2, p0, Landroidx/work/impl/background/systemalarm/f;->u:Ljava/util/concurrent/Executor;

    new-instance p2, Ln0/e;

    invoke-direct {p2, p1, p0}, Ln0/e;-><init>(Lp0/n;Ln0/c;)V

    iput-object p2, p0, Landroidx/work/impl/background/systemalarm/f;->q:Ln0/e;

    const/4 p1, 0x0

    iput-boolean p1, p0, Landroidx/work/impl/background/systemalarm/f;->w:Z

    iput p1, p0, Landroidx/work/impl/background/systemalarm/f;->s:I

    new-instance p1, Ljava/lang/Object;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/work/impl/background/systemalarm/f;->r:Ljava/lang/Object;

    return-void
.end method

.method public static synthetic c(Landroidx/work/impl/background/systemalarm/f;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Landroidx/work/impl/background/systemalarm/f;->j()V

    return-void
.end method

.method public static synthetic d(Landroidx/work/impl/background/systemalarm/f;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Landroidx/work/impl/background/systemalarm/f;->i()V

    return-void
.end method

.method private e()V
    .locals 5

    .line 1
    iget-object v0, p0, Landroidx/work/impl/background/systemalarm/f;->r:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Landroidx/work/impl/background/systemalarm/f;->q:Ln0/e;

    invoke-virtual {v1}, Ln0/e;->a()V

    iget-object v1, p0, Landroidx/work/impl/background/systemalarm/f;->p:Landroidx/work/impl/background/systemalarm/g;

    invoke-virtual {v1}, Landroidx/work/impl/background/systemalarm/g;->h()Lr0/D;

    move-result-object v1

    iget-object v2, p0, Landroidx/work/impl/background/systemalarm/f;->o:Lq0/m;

    invoke-virtual {v1, v2}, Lr0/D;->b(Lq0/m;)V

    iget-object v1, p0, Landroidx/work/impl/background/systemalarm/f;->v:Landroid/os/PowerManager$WakeLock;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Landroid/os/PowerManager$WakeLock;->isHeld()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-static {}, Ll0/i;->e()Ll0/i;

    move-result-object v1

    sget-object v2, Landroidx/work/impl/background/systemalarm/f;->y:Ljava/lang/String;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Releasing wakelock "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v4, p0, Landroidx/work/impl/background/systemalarm/f;->v:Landroid/os/PowerManager$WakeLock;

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v4, "for WorkSpec "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v4, p0, Landroidx/work/impl/background/systemalarm/f;->o:Lq0/m;

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Ll0/i;->a(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v1, p0, Landroidx/work/impl/background/systemalarm/f;->v:Landroid/os/PowerManager$WakeLock;

    invoke-virtual {v1}, Landroid/os/PowerManager$WakeLock;->release()V

    goto :goto_0

    :catchall_0
    move-exception v1

    goto :goto_1

    :cond_0
    :goto_0
    monitor-exit v0

    return-void

    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method private i()V
    .locals 4

    .line 1
    iget v0, p0, Landroidx/work/impl/background/systemalarm/f;->s:I

    if-nez v0, :cond_1

    const/4 v0, 0x1

    iput v0, p0, Landroidx/work/impl/background/systemalarm/f;->s:I

    invoke-static {}, Ll0/i;->e()Ll0/i;

    move-result-object v0

    sget-object v1, Landroidx/work/impl/background/systemalarm/f;->y:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "onAllConstraintsMet for "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, p0, Landroidx/work/impl/background/systemalarm/f;->o:Lq0/m;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ll0/i;->a(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Landroidx/work/impl/background/systemalarm/f;->p:Landroidx/work/impl/background/systemalarm/g;

    invoke-virtual {v0}, Landroidx/work/impl/background/systemalarm/g;->e()Landroidx/work/impl/r;

    move-result-object v0

    iget-object v1, p0, Landroidx/work/impl/background/systemalarm/f;->x:Landroidx/work/impl/v;

    invoke-virtual {v0, v1}, Landroidx/work/impl/r;->p(Landroidx/work/impl/v;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroidx/work/impl/background/systemalarm/f;->p:Landroidx/work/impl/background/systemalarm/g;

    invoke-virtual {v0}, Landroidx/work/impl/background/systemalarm/g;->h()Lr0/D;

    move-result-object v0

    iget-object v1, p0, Landroidx/work/impl/background/systemalarm/f;->o:Lq0/m;

    const-wide/32 v2, 0x927c0

    invoke-virtual {v0, v1, v2, v3, p0}, Lr0/D;->a(Lq0/m;JLr0/D$a;)V

    goto :goto_0

    :cond_0
    invoke-direct {p0}, Landroidx/work/impl/background/systemalarm/f;->e()V

    goto :goto_0

    :cond_1
    invoke-static {}, Ll0/i;->e()Ll0/i;

    move-result-object v0

    sget-object v1, Landroidx/work/impl/background/systemalarm/f;->y:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Already started work for "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, p0, Landroidx/work/impl/background/systemalarm/f;->o:Lq0/m;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ll0/i;->a(Ljava/lang/String;Ljava/lang/String;)V

    :goto_0
    return-void
.end method

.method private j()V
    .locals 7

    .line 1
    iget-object v0, p0, Landroidx/work/impl/background/systemalarm/f;->o:Lq0/m;

    invoke-virtual {v0}, Lq0/m;->b()Ljava/lang/String;

    move-result-object v0

    iget v1, p0, Landroidx/work/impl/background/systemalarm/f;->s:I

    const/4 v2, 0x2

    if-ge v1, v2, :cond_1

    iput v2, p0, Landroidx/work/impl/background/systemalarm/f;->s:I

    invoke-static {}, Ll0/i;->e()Ll0/i;

    move-result-object v1

    sget-object v2, Landroidx/work/impl/background/systemalarm/f;->y:Ljava/lang/String;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Stopping work for WorkSpec "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Ll0/i;->a(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v1, p0, Landroidx/work/impl/background/systemalarm/f;->m:Landroid/content/Context;

    iget-object v3, p0, Landroidx/work/impl/background/systemalarm/f;->o:Lq0/m;

    invoke-static {v1, v3}, Landroidx/work/impl/background/systemalarm/b;->f(Landroid/content/Context;Lq0/m;)Landroid/content/Intent;

    move-result-object v1

    iget-object v3, p0, Landroidx/work/impl/background/systemalarm/f;->u:Ljava/util/concurrent/Executor;

    new-instance v4, Landroidx/work/impl/background/systemalarm/g$b;

    iget-object v5, p0, Landroidx/work/impl/background/systemalarm/f;->p:Landroidx/work/impl/background/systemalarm/g;

    iget v6, p0, Landroidx/work/impl/background/systemalarm/f;->n:I

    invoke-direct {v4, v5, v1, v6}, Landroidx/work/impl/background/systemalarm/g$b;-><init>(Landroidx/work/impl/background/systemalarm/g;Landroid/content/Intent;I)V

    invoke-interface {v3, v4}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    iget-object v1, p0, Landroidx/work/impl/background/systemalarm/f;->p:Landroidx/work/impl/background/systemalarm/g;

    invoke-virtual {v1}, Landroidx/work/impl/background/systemalarm/g;->e()Landroidx/work/impl/r;

    move-result-object v1

    iget-object v3, p0, Landroidx/work/impl/background/systemalarm/f;->o:Lq0/m;

    invoke-virtual {v3}, Lq0/m;->b()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Landroidx/work/impl/r;->k(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-static {}, Ll0/i;->e()Ll0/i;

    move-result-object v1

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "WorkSpec "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " needs to be rescheduled"

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v2, v0}, Ll0/i;->a(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Landroidx/work/impl/background/systemalarm/f;->m:Landroid/content/Context;

    iget-object v1, p0, Landroidx/work/impl/background/systemalarm/f;->o:Lq0/m;

    invoke-static {v0, v1}, Landroidx/work/impl/background/systemalarm/b;->e(Landroid/content/Context;Lq0/m;)Landroid/content/Intent;

    move-result-object v0

    iget-object v1, p0, Landroidx/work/impl/background/systemalarm/f;->u:Ljava/util/concurrent/Executor;

    new-instance v2, Landroidx/work/impl/background/systemalarm/g$b;

    iget-object v3, p0, Landroidx/work/impl/background/systemalarm/f;->p:Landroidx/work/impl/background/systemalarm/g;

    iget v4, p0, Landroidx/work/impl/background/systemalarm/f;->n:I

    invoke-direct {v2, v3, v0, v4}, Landroidx/work/impl/background/systemalarm/g$b;-><init>(Landroidx/work/impl/background/systemalarm/g;Landroid/content/Intent;I)V

    invoke-interface {v1, v2}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    goto :goto_1

    :cond_0
    invoke-static {}, Ll0/i;->e()Ll0/i;

    move-result-object v1

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Processor does not have WorkSpec "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ". No need to reschedule"

    goto :goto_0

    :cond_1
    invoke-static {}, Ll0/i;->e()Ll0/i;

    move-result-object v1

    sget-object v2, Landroidx/work/impl/background/systemalarm/f;->y:Ljava/lang/String;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Already stopped work for "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :goto_0
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v2, v0}, Ll0/i;->a(Ljava/lang/String;Ljava/lang/String;)V

    :goto_1
    return-void
.end method


# virtual methods
.method public a(Lq0/m;)V
    .locals 4

    .line 1
    invoke-static {}, Ll0/i;->e()Ll0/i;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sget-object v1, Landroidx/work/impl/background/systemalarm/f;->y:Ljava/lang/String;

    .line 6
    .line 7
    new-instance v2, Ljava/lang/StringBuilder;

    .line 8
    .line 9
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 10
    .line 11
    .line 12
    const-string v3, "Exceeded time limits on execution for "

    .line 13
    .line 14
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 15
    .line 16
    .line 17
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    invoke-virtual {v0, v1, p1}, Ll0/i;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    iget-object p1, p0, Landroidx/work/impl/background/systemalarm/f;->t:Ljava/util/concurrent/Executor;

    .line 28
    .line 29
    new-instance v0, Landroidx/work/impl/background/systemalarm/d;

    .line 30
    .line 31
    invoke-direct {v0, p0}, Landroidx/work/impl/background/systemalarm/d;-><init>(Landroidx/work/impl/background/systemalarm/f;)V

    .line 32
    .line 33
    .line 34
    invoke-interface {p1, v0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 35
    .line 36
    .line 37
    return-void
.end method

.method public b(Ljava/util/List;)V
    .locals 1

    .line 1
    iget-object p1, p0, Landroidx/work/impl/background/systemalarm/f;->t:Ljava/util/concurrent/Executor;

    new-instance v0, Landroidx/work/impl/background/systemalarm/d;

    invoke-direct {v0, p0}, Landroidx/work/impl/background/systemalarm/d;-><init>(Landroidx/work/impl/background/systemalarm/f;)V

    invoke-interface {p1, v0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public f(Ljava/util/List;)V
    .locals 2

    .line 1
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lq0/u;

    invoke-static {v0}, Lq0/x;->a(Lq0/u;)Lq0/m;

    move-result-object v0

    iget-object v1, p0, Landroidx/work/impl/background/systemalarm/f;->o:Lq0/m;

    invoke-virtual {v0, v1}, Lq0/m;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object p1, p0, Landroidx/work/impl/background/systemalarm/f;->t:Ljava/util/concurrent/Executor;

    new-instance v0, Landroidx/work/impl/background/systemalarm/e;

    invoke-direct {v0, p0}, Landroidx/work/impl/background/systemalarm/e;-><init>(Landroidx/work/impl/background/systemalarm/f;)V

    invoke-interface {p1, v0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    :cond_1
    return-void
.end method

.method g()V
    .locals 6

    .line 1
    iget-object v0, p0, Landroidx/work/impl/background/systemalarm/f;->o:Lq0/m;

    invoke-virtual {v0}, Lq0/m;->b()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Landroidx/work/impl/background/systemalarm/f;->m:Landroid/content/Context;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, " ("

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v3, p0, Landroidx/work/impl/background/systemalarm/f;->n:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v3, ")"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lr0/x;->b(Landroid/content/Context;Ljava/lang/String;)Landroid/os/PowerManager$WakeLock;

    move-result-object v1

    iput-object v1, p0, Landroidx/work/impl/background/systemalarm/f;->v:Landroid/os/PowerManager$WakeLock;

    invoke-static {}, Ll0/i;->e()Ll0/i;

    move-result-object v1

    sget-object v2, Landroidx/work/impl/background/systemalarm/f;->y:Ljava/lang/String;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Acquiring wakelock "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v4, p0, Landroidx/work/impl/background/systemalarm/f;->v:Landroid/os/PowerManager$WakeLock;

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v4, "for WorkSpec "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Ll0/i;->a(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v1, p0, Landroidx/work/impl/background/systemalarm/f;->v:Landroid/os/PowerManager$WakeLock;

    invoke-virtual {v1}, Landroid/os/PowerManager$WakeLock;->acquire()V

    iget-object v1, p0, Landroidx/work/impl/background/systemalarm/f;->p:Landroidx/work/impl/background/systemalarm/g;

    invoke-virtual {v1}, Landroidx/work/impl/background/systemalarm/g;->g()Landroidx/work/impl/E;

    move-result-object v1

    invoke-virtual {v1}, Landroidx/work/impl/E;->v()Landroidx/work/impl/WorkDatabase;

    move-result-object v1

    invoke-virtual {v1}, Landroidx/work/impl/WorkDatabase;->j()Lq0/v;

    move-result-object v1

    invoke-interface {v1, v0}, Lq0/v;->q(Ljava/lang/String;)Lq0/u;

    move-result-object v1

    if-nez v1, :cond_0

    iget-object v0, p0, Landroidx/work/impl/background/systemalarm/f;->t:Ljava/util/concurrent/Executor;

    new-instance v1, Landroidx/work/impl/background/systemalarm/d;

    invoke-direct {v1, p0}, Landroidx/work/impl/background/systemalarm/d;-><init>(Landroidx/work/impl/background/systemalarm/f;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void

    :cond_0
    invoke-virtual {v1}, Lq0/u;->h()Z

    move-result v3

    iput-boolean v3, p0, Landroidx/work/impl/background/systemalarm/f;->w:Z

    if-nez v3, :cond_1

    invoke-static {}, Ll0/i;->e()Ll0/i;

    move-result-object v3

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "No constraints for "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v2, v0}, Ll0/i;->a(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {v1}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-virtual {p0, v0}, Landroidx/work/impl/background/systemalarm/f;->f(Ljava/util/List;)V

    goto :goto_0

    :cond_1
    iget-object v0, p0, Landroidx/work/impl/background/systemalarm/f;->q:Ln0/e;

    invoke-static {v1}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v1}, Ln0/e;->b(Ljava/lang/Iterable;)V

    :goto_0
    return-void
.end method

.method h(Z)V
    .locals 4

    .line 1
    invoke-static {}, Ll0/i;->e()Ll0/i;

    move-result-object v0

    sget-object v1, Landroidx/work/impl/background/systemalarm/f;->y:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "onExecuted "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, p0, Landroidx/work/impl/background/systemalarm/f;->o:Lq0/m;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v3, ", "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ll0/i;->a(Ljava/lang/String;Ljava/lang/String;)V

    invoke-direct {p0}, Landroidx/work/impl/background/systemalarm/f;->e()V

    if-eqz p1, :cond_0

    iget-object p1, p0, Landroidx/work/impl/background/systemalarm/f;->m:Landroid/content/Context;

    iget-object v0, p0, Landroidx/work/impl/background/systemalarm/f;->o:Lq0/m;

    invoke-static {p1, v0}, Landroidx/work/impl/background/systemalarm/b;->e(Landroid/content/Context;Lq0/m;)Landroid/content/Intent;

    move-result-object p1

    iget-object v0, p0, Landroidx/work/impl/background/systemalarm/f;->u:Ljava/util/concurrent/Executor;

    new-instance v1, Landroidx/work/impl/background/systemalarm/g$b;

    iget-object v2, p0, Landroidx/work/impl/background/systemalarm/f;->p:Landroidx/work/impl/background/systemalarm/g;

    iget v3, p0, Landroidx/work/impl/background/systemalarm/f;->n:I

    invoke-direct {v1, v2, p1, v3}, Landroidx/work/impl/background/systemalarm/g$b;-><init>(Landroidx/work/impl/background/systemalarm/g;Landroid/content/Intent;I)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    :cond_0
    iget-boolean p1, p0, Landroidx/work/impl/background/systemalarm/f;->w:Z

    if-eqz p1, :cond_1

    iget-object p1, p0, Landroidx/work/impl/background/systemalarm/f;->m:Landroid/content/Context;

    invoke-static {p1}, Landroidx/work/impl/background/systemalarm/b;->b(Landroid/content/Context;)Landroid/content/Intent;

    move-result-object p1

    iget-object v0, p0, Landroidx/work/impl/background/systemalarm/f;->u:Ljava/util/concurrent/Executor;

    new-instance v1, Landroidx/work/impl/background/systemalarm/g$b;

    iget-object v2, p0, Landroidx/work/impl/background/systemalarm/f;->p:Landroidx/work/impl/background/systemalarm/g;

    iget v3, p0, Landroidx/work/impl/background/systemalarm/f;->n:I

    invoke-direct {v1, v2, p1, v3}, Landroidx/work/impl/background/systemalarm/g$b;-><init>(Landroidx/work/impl/background/systemalarm/g;Landroid/content/Intent;I)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    :cond_1
    return-void
.end method
