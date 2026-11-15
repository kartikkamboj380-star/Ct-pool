.class public Le1/a;
.super Lp1/a;
.source "SourceFile"

# interfaces
.implements Ljava/io/Closeable;
.implements Lj1/t;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Le1/a$a;
    }
.end annotation


# static fields
.field private static t:Le1/a$a;


# instance fields
.field private final n:LV0/b;

.field private final o:Lp1/i;

.field private final p:Lp1/h;

.field private final q:LO0/o;

.field private r:Lp1/h;

.field private final s:Z


# direct methods
.method public constructor <init>(LV0/b;Lp1/i;Lp1/h;LO0/o;)V
    .locals 6

    const/4 v5, 0x1

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    .line 1
    invoke-direct/range {v0 .. v5}, Le1/a;-><init>(LV0/b;Lp1/i;Lp1/h;LO0/o;Z)V

    return-void
.end method

.method public constructor <init>(LV0/b;Lp1/i;Lp1/h;LO0/o;Z)V
    .locals 1

    .line 2
    invoke-direct {p0}, Lp1/a;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Le1/a;->r:Lp1/h;

    iput-object p1, p0, Le1/a;->n:LV0/b;

    iput-object p2, p0, Le1/a;->o:Lp1/i;

    iput-object p3, p0, Le1/a;->p:Lp1/h;

    iput-object p4, p0, Le1/a;->q:LO0/o;

    iput-boolean p5, p0, Le1/a;->s:Z

    return-void
.end method

.method private U()Z
    .locals 2

    .line 1
    iget-object v0, p0, Le1/a;->q:LO0/o;

    .line 2
    .line 3
    invoke-interface {v0}, LO0/o;->get()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Ljava/lang/Boolean;

    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    sget-object v1, Le1/a;->t:Le1/a$a;

    .line 16
    .line 17
    if-nez v1, :cond_0

    .line 18
    .line 19
    invoke-direct {p0}, Le1/a;->n()V

    .line 20
    .line 21
    .line 22
    :cond_0
    return v0
.end method

.method private W(Lp1/i;Lp1/e;)V
    .locals 2

    .line 1
    invoke-virtual {p1, p2}, Lp1/i;->n(Lp1/e;)V

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Le1/a;->U()Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    sget-object v0, Le1/a;->t:Le1/a$a;

    .line 11
    .line 12
    invoke-static {v0}, LO0/l;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    check-cast v0, Le1/a$a;

    .line 17
    .line 18
    invoke-virtual {v0}, Landroid/os/Handler;->obtainMessage()Landroid/os/Message;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    const/4 v1, 0x1

    .line 23
    iput v1, v0, Landroid/os/Message;->what:I

    .line 24
    .line 25
    invoke-virtual {p2}, Lp1/e;->j()I

    .line 26
    .line 27
    .line 28
    move-result p2

    .line 29
    iput p2, v0, Landroid/os/Message;->arg1:I

    .line 30
    .line 31
    iput-object p1, v0, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 32
    .line 33
    sget-object p1, Le1/a;->t:Le1/a$a;

    .line 34
    .line 35
    invoke-virtual {p1, v0}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 36
    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_0
    iget-object v0, p0, Le1/a;->p:Lp1/h;

    .line 40
    .line 41
    invoke-interface {v0, p1, p2}, Lp1/h;->a(Lp1/i;Lp1/e;)V

    .line 42
    .line 43
    .line 44
    iget-object v0, p0, Le1/a;->r:Lp1/h;

    .line 45
    .line 46
    if-eqz v0, :cond_1

    .line 47
    .line 48
    invoke-interface {v0, p1, p2}, Lp1/h;->a(Lp1/i;Lp1/e;)V

    .line 49
    .line 50
    .line 51
    :cond_1
    :goto_0
    return-void
.end method

.method private a0(Lp1/i;Lp1/l;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Le1/a;->U()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    sget-object v0, Le1/a;->t:Le1/a$a;

    .line 8
    .line 9
    invoke-static {v0}, LO0/l;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    check-cast v0, Le1/a$a;

    .line 14
    .line 15
    invoke-virtual {v0}, Landroid/os/Handler;->obtainMessage()Landroid/os/Message;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    const/4 v1, 0x2

    .line 20
    iput v1, v0, Landroid/os/Message;->what:I

    .line 21
    .line 22
    invoke-virtual {p2}, Lp1/l;->j()I

    .line 23
    .line 24
    .line 25
    move-result p2

    .line 26
    iput p2, v0, Landroid/os/Message;->arg1:I

    .line 27
    .line 28
    iput-object p1, v0, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 29
    .line 30
    sget-object p1, Le1/a;->t:Le1/a$a;

    .line 31
    .line 32
    invoke-virtual {p1, v0}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 33
    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_0
    iget-object v0, p0, Le1/a;->p:Lp1/h;

    .line 37
    .line 38
    invoke-interface {v0, p1, p2}, Lp1/h;->b(Lp1/i;Lp1/l;)V

    .line 39
    .line 40
    .line 41
    iget-object v0, p0, Le1/a;->r:Lp1/h;

    .line 42
    .line 43
    if-eqz v0, :cond_1

    .line 44
    .line 45
    invoke-interface {v0, p1, p2}, Lp1/h;->b(Lp1/i;Lp1/l;)V

    .line 46
    .line 47
    .line 48
    :cond_1
    :goto_0
    return-void
.end method

.method private declared-synchronized n()V
    .locals 4

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    sget-object v0, Le1/a;->t:Le1/a$a;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    monitor-exit p0

    .line 7
    return-void

    .line 8
    :cond_0
    :try_start_1
    new-instance v0, Landroid/os/HandlerThread;

    .line 9
    .line 10
    const-string v1, "ImagePerfControllerListener2Thread"

    .line 11
    .line 12
    invoke-direct {v0, v1}, Landroid/os/HandlerThread;-><init>(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    invoke-static {v0}, LO0/l;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    check-cast v0, Landroid/os/Looper;

    .line 27
    .line 28
    new-instance v1, Le1/a$a;

    .line 29
    .line 30
    iget-object v2, p0, Le1/a;->p:Lp1/h;

    .line 31
    .line 32
    iget-object v3, p0, Le1/a;->r:Lp1/h;

    .line 33
    .line 34
    invoke-direct {v1, v0, v2, v3}, Le1/a$a;-><init>(Landroid/os/Looper;Lp1/h;Lp1/h;)V

    .line 35
    .line 36
    .line 37
    sput-object v1, Le1/a;->t:Le1/a$a;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 38
    .line 39
    monitor-exit p0

    .line 40
    return-void

    .line 41
    :catchall_0
    move-exception v0

    .line 42
    monitor-exit p0

    .line 43
    throw v0
.end method

.method private z(Lp1/i;J)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-virtual {p1, v0}, Lp1/i;->x(Z)V

    .line 3
    .line 4
    .line 5
    invoke-virtual {p1, p2, p3}, Lp1/i;->r(J)V

    .line 6
    .line 7
    .line 8
    sget-object p2, Lp1/l;->r:Lp1/l;

    .line 9
    .line 10
    invoke-direct {p0, p1, p2}, Le1/a;->a0(Lp1/i;Lp1/l;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public B(Lp1/i;J)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-virtual {p1, v0}, Lp1/i;->x(Z)V

    .line 3
    .line 4
    .line 5
    invoke-virtual {p1, p2, p3}, Lp1/i;->w(J)V

    .line 6
    .line 7
    .line 8
    sget-object p2, Lp1/l;->q:Lp1/l;

    .line 9
    .line 10
    invoke-direct {p0, p1, p2}, Le1/a;->a0(Lp1/i;Lp1/l;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public J()V
    .locals 1

    .line 1
    iget-object v0, p0, Le1/a;->o:Lp1/i;

    .line 2
    .line 3
    invoke-virtual {v0}, Lp1/i;->b()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public bridge synthetic a(Ljava/lang/String;Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p2, LD1/i;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2}, Le1/a;->w(Ljava/lang/String;LD1/i;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public b()V
    .locals 0

    .line 1
    return-void
.end method

.method public close()V
    .locals 0

    .line 1
    invoke-virtual {p0}, Le1/a;->J()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public d(Z)V
    .locals 2

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    iget-object p1, p0, Le1/a;->o:Lp1/i;

    .line 4
    .line 5
    iget-object v0, p0, Le1/a;->n:LV0/b;

    .line 6
    .line 7
    invoke-interface {v0}, LV0/b;->now()J

    .line 8
    .line 9
    .line 10
    move-result-wide v0

    .line 11
    invoke-virtual {p0, p1, v0, v1}, Le1/a;->B(Lp1/i;J)V

    .line 12
    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    iget-object p1, p0, Le1/a;->o:Lp1/i;

    .line 16
    .line 17
    iget-object v0, p0, Le1/a;->n:LV0/b;

    .line 18
    .line 19
    invoke-interface {v0}, LV0/b;->now()J

    .line 20
    .line 21
    .line 22
    move-result-wide v0

    .line 23
    invoke-direct {p0, p1, v0, v1}, Le1/a;->z(Lp1/i;J)V

    .line 24
    .line 25
    .line 26
    :goto_0
    return-void
.end method

.method public e(Ljava/lang/String;Ljava/lang/Object;Lp1/b$a;)V
    .locals 3

    .line 1
    iget-object v0, p0, Le1/a;->n:LV0/b;

    .line 2
    .line 3
    invoke-interface {v0}, LV0/b;->now()J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    iget-object v2, p0, Le1/a;->o:Lp1/i;

    .line 8
    .line 9
    invoke-virtual {v2}, Lp1/i;->c()V

    .line 10
    .line 11
    .line 12
    invoke-virtual {v2, v0, v1}, Lp1/i;->j(J)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {v2, p1}, Lp1/i;->h(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {v2, p2}, Lp1/i;->d(Ljava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {v2, p3}, Lp1/i;->l(Lp1/b$a;)V

    .line 22
    .line 23
    .line 24
    sget-object p1, Lp1/e;->q:Lp1/e;

    .line 25
    .line 26
    invoke-direct {p0, v2, p1}, Le1/a;->W(Lp1/i;Lp1/e;)V

    .line 27
    .line 28
    .line 29
    iget-boolean p1, p0, Le1/a;->s:Z

    .line 30
    .line 31
    if-eqz p1, :cond_0

    .line 32
    .line 33
    invoke-virtual {p0, v2, v0, v1}, Le1/a;->B(Lp1/i;J)V

    .line 34
    .line 35
    .line 36
    :cond_0
    return-void
.end method

.method public f(Ljava/lang/String;Lp1/b$a;)V
    .locals 3

    .line 1
    iget-object v0, p0, Le1/a;->n:LV0/b;

    .line 2
    .line 3
    invoke-interface {v0}, LV0/b;->now()J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    iget-object v2, p0, Le1/a;->o:Lp1/i;

    .line 8
    .line 9
    invoke-virtual {v2, p2}, Lp1/i;->l(Lp1/b$a;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {v2, p1}, Lp1/i;->h(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {v2}, Lp1/i;->a()Lp1/e;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    sget-object p2, Lp1/e;->s:Lp1/e;

    .line 20
    .line 21
    if-eq p1, p2, :cond_0

    .line 22
    .line 23
    sget-object p2, Lp1/e;->u:Lp1/e;

    .line 24
    .line 25
    if-eq p1, p2, :cond_0

    .line 26
    .line 27
    sget-object p2, Lp1/e;->v:Lp1/e;

    .line 28
    .line 29
    if-eq p1, p2, :cond_0

    .line 30
    .line 31
    invoke-virtual {v2, v0, v1}, Lp1/i;->e(J)V

    .line 32
    .line 33
    .line 34
    sget-object p1, Lp1/e;->t:Lp1/e;

    .line 35
    .line 36
    invoke-direct {p0, v2, p1}, Le1/a;->W(Lp1/i;Lp1/e;)V

    .line 37
    .line 38
    .line 39
    :cond_0
    sget-object p1, Lp1/e;->x:Lp1/e;

    .line 40
    .line 41
    invoke-direct {p0, v2, p1}, Le1/a;->W(Lp1/i;Lp1/e;)V

    .line 42
    .line 43
    .line 44
    iget-boolean p1, p0, Le1/a;->s:Z

    .line 45
    .line 46
    if-eqz p1, :cond_1

    .line 47
    .line 48
    invoke-direct {p0, v2, v0, v1}, Le1/a;->z(Lp1/i;J)V

    .line 49
    .line 50
    .line 51
    :cond_1
    return-void
.end method

.method public g(Ljava/lang/String;Ljava/lang/Throwable;Lp1/b$a;)V
    .locals 3

    .line 1
    iget-object v0, p0, Le1/a;->n:LV0/b;

    .line 2
    .line 3
    invoke-interface {v0}, LV0/b;->now()J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    iget-object v2, p0, Le1/a;->o:Lp1/i;

    .line 8
    .line 9
    invoke-virtual {v2, p3}, Lp1/i;->l(Lp1/b$a;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {v2, v0, v1}, Lp1/i;->f(J)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {v2, p1}, Lp1/i;->h(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {v2, p2}, Lp1/i;->k(Ljava/lang/Throwable;)V

    .line 19
    .line 20
    .line 21
    sget-object p1, Lp1/e;->u:Lp1/e;

    .line 22
    .line 23
    invoke-direct {p0, v2, p1}, Le1/a;->W(Lp1/i;Lp1/e;)V

    .line 24
    .line 25
    .line 26
    invoke-direct {p0, v2, v0, v1}, Le1/a;->z(Lp1/i;J)V

    .line 27
    .line 28
    .line 29
    return-void
.end method

.method public bridge synthetic j(Ljava/lang/String;Ljava/lang/Object;Lp1/b$a;)V
    .locals 0

    .line 1
    check-cast p2, LD1/i;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2, p3}, Le1/a;->o(Ljava/lang/String;LD1/i;Lp1/b$a;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public o(Ljava/lang/String;LD1/i;Lp1/b$a;)V
    .locals 3

    .line 1
    iget-object v0, p0, Le1/a;->n:LV0/b;

    .line 2
    .line 3
    invoke-interface {v0}, LV0/b;->now()J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    iget-object v2, p0, Le1/a;->o:Lp1/i;

    .line 8
    .line 9
    invoke-virtual {v2, p3}, Lp1/i;->l(Lp1/b$a;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {v2, v0, v1}, Lp1/i;->g(J)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {v2, v0, v1}, Lp1/i;->p(J)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {v2, p1}, Lp1/i;->h(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {v2, p2}, Lp1/i;->m(Ljava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    sget-object p1, Lp1/e;->s:Lp1/e;

    .line 25
    .line 26
    invoke-direct {p0, v2, p1}, Le1/a;->W(Lp1/i;Lp1/e;)V

    .line 27
    .line 28
    .line 29
    return-void
.end method

.method public w(Ljava/lang/String;LD1/i;)V
    .locals 3

    .line 1
    iget-object v0, p0, Le1/a;->n:LV0/b;

    .line 2
    .line 3
    invoke-interface {v0}, LV0/b;->now()J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    iget-object v2, p0, Le1/a;->o:Lp1/i;

    .line 8
    .line 9
    invoke-virtual {v2, v0, v1}, Lp1/i;->i(J)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {v2, p1}, Lp1/i;->h(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {v2, p2}, Lp1/i;->m(Ljava/lang/Object;)V

    .line 16
    .line 17
    .line 18
    sget-object p1, Lp1/e;->r:Lp1/e;

    .line 19
    .line 20
    invoke-direct {p0, v2, p1}, Le1/a;->W(Lp1/i;Lp1/e;)V

    .line 21
    .line 22
    .line 23
    return-void
.end method
