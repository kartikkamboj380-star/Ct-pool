.class public abstract LS0/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Cloneable;
.implements Ljava/io/Closeable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LS0/a$c;
    }
.end annotation


# static fields
.field private static q:Ljava/lang/Class;

.field private static r:I

.field private static final s:LS0/g;

.field private static final t:LS0/a$c;


# instance fields
.field protected m:Z

.field protected final n:LS0/h;

.field protected final o:LS0/a$c;

.field protected final p:Ljava/lang/Throwable;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const-class v0, LS0/a;

    .line 2
    .line 3
    sput-object v0, LS0/a;->q:Ljava/lang/Class;

    .line 4
    .line 5
    new-instance v0, LS0/a$a;

    .line 6
    .line 7
    invoke-direct {v0}, LS0/a$a;-><init>()V

    .line 8
    .line 9
    .line 10
    sput-object v0, LS0/a;->s:LS0/g;

    .line 11
    .line 12
    new-instance v0, LS0/a$b;

    .line 13
    .line 14
    invoke-direct {v0}, LS0/a$b;-><init>()V

    .line 15
    .line 16
    .line 17
    sput-object v0, LS0/a;->t:LS0/a$c;

    .line 18
    .line 19
    return-void
.end method

.method protected constructor <init>(LS0/h;LS0/a$c;Ljava/lang/Throwable;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, LS0/a;->m:Z

    invoke-static {p1}, LO0/l;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LS0/h;

    iput-object v0, p0, LS0/a;->n:LS0/h;

    invoke-virtual {p1}, LS0/h;->b()V

    iput-object p2, p0, LS0/a;->o:LS0/a$c;

    iput-object p3, p0, LS0/a;->p:Ljava/lang/Throwable;

    return-void
.end method

.method protected constructor <init>(Ljava/lang/Object;LS0/g;LS0/a$c;Ljava/lang/Throwable;Z)V
    .locals 1

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, LS0/a;->m:Z

    new-instance v0, LS0/h;

    invoke-direct {v0, p1, p2, p5}, LS0/h;-><init>(Ljava/lang/Object;LS0/g;Z)V

    iput-object v0, p0, LS0/a;->n:LS0/h;

    iput-object p3, p0, LS0/a;->o:LS0/a$c;

    iput-object p4, p0, LS0/a;->p:Ljava/lang/Throwable;

    return-void
.end method

.method public static B(LS0/a;)Z
    .locals 0

    .line 1
    if-eqz p0, :cond_0

    .line 2
    .line 3
    invoke-virtual {p0}, LS0/a;->z()Z

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    if-eqz p0, :cond_0

    .line 8
    .line 9
    const/4 p0, 0x1

    .line 10
    goto :goto_0

    .line 11
    :cond_0
    const/4 p0, 0x0

    .line 12
    :goto_0
    return p0
.end method

.method public static J(Ljava/io/Closeable;)LS0/a;
    .locals 1

    .line 1
    sget-object v0, LS0/a;->s:LS0/g;

    .line 2
    .line 3
    invoke-static {p0, v0}, LS0/a;->W(Ljava/lang/Object;LS0/g;)LS0/a;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public static U(Ljava/io/Closeable;LS0/a$c;)LS0/a;
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p0, :cond_0

    .line 3
    .line 4
    return-object v0

    .line 5
    :cond_0
    sget-object v1, LS0/a;->s:LS0/g;

    .line 6
    .line 7
    invoke-interface {p1}, LS0/a$c;->b()Z

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    if-eqz v2, :cond_1

    .line 12
    .line 13
    new-instance v0, Ljava/lang/Throwable;

    .line 14
    .line 15
    invoke-direct {v0}, Ljava/lang/Throwable;-><init>()V

    .line 16
    .line 17
    .line 18
    :cond_1
    invoke-static {p0, v1, p1, v0}, LS0/a;->j0(Ljava/lang/Object;LS0/g;LS0/a$c;Ljava/lang/Throwable;)LS0/a;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0
.end method

.method public static W(Ljava/lang/Object;LS0/g;)LS0/a;
    .locals 1

    .line 1
    sget-object v0, LS0/a;->t:LS0/a$c;

    .line 2
    .line 3
    invoke-static {p0, p1, v0}, LS0/a;->h0(Ljava/lang/Object;LS0/g;LS0/a$c;)LS0/a;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method static bridge synthetic a()Ljava/lang/Class;
    .locals 1

    .line 1
    sget-object v0, LS0/a;->q:Ljava/lang/Class;

    return-object v0
.end method

.method public static e(LS0/a;)LS0/a;
    .locals 0

    .line 1
    if-eqz p0, :cond_0

    .line 2
    .line 3
    invoke-virtual {p0}, LS0/a;->d()LS0/a;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    goto :goto_0

    .line 8
    :cond_0
    const/4 p0, 0x0

    .line 9
    :goto_0
    return-object p0
.end method

.method public static g(LS0/a;)V
    .locals 0

    .line 1
    if-eqz p0, :cond_0

    .line 2
    .line 3
    invoke-virtual {p0}, LS0/a;->close()V

    .line 4
    .line 5
    .line 6
    :cond_0
    return-void
.end method

.method public static h0(Ljava/lang/Object;LS0/g;LS0/a$c;)LS0/a;
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p0, :cond_0

    .line 3
    .line 4
    return-object v0

    .line 5
    :cond_0
    invoke-interface {p2}, LS0/a$c;->b()Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-eqz v1, :cond_1

    .line 10
    .line 11
    new-instance v0, Ljava/lang/Throwable;

    .line 12
    .line 13
    invoke-direct {v0}, Ljava/lang/Throwable;-><init>()V

    .line 14
    .line 15
    .line 16
    :cond_1
    invoke-static {p0, p1, p2, v0}, LS0/a;->j0(Ljava/lang/Object;LS0/g;LS0/a$c;Ljava/lang/Throwable;)LS0/a;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    return-object p0
.end method

.method public static j0(Ljava/lang/Object;LS0/g;LS0/a$c;Ljava/lang/Throwable;)LS0/a;
    .locals 2

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    const/4 p0, 0x0

    .line 4
    return-object p0

    .line 5
    :cond_0
    instance-of v0, p0, Landroid/graphics/Bitmap;

    .line 6
    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    instance-of v0, p0, LS0/d;

    .line 10
    .line 11
    if-eqz v0, :cond_2

    .line 12
    .line 13
    :cond_1
    sget v0, LS0/a;->r:I

    .line 14
    .line 15
    const/4 v1, 0x1

    .line 16
    if-eq v0, v1, :cond_5

    .line 17
    .line 18
    const/4 v1, 0x2

    .line 19
    if-eq v0, v1, :cond_4

    .line 20
    .line 21
    const/4 v1, 0x3

    .line 22
    if-eq v0, v1, :cond_3

    .line 23
    .line 24
    :cond_2
    new-instance v0, LS0/b;

    .line 25
    .line 26
    invoke-direct {v0, p0, p1, p2, p3}, LS0/b;-><init>(Ljava/lang/Object;LS0/g;LS0/a$c;Ljava/lang/Throwable;)V

    .line 27
    .line 28
    .line 29
    return-object v0

    .line 30
    :cond_3
    new-instance p1, LS0/e;

    .line 31
    .line 32
    invoke-direct {p1, p0}, LS0/e;-><init>(Ljava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    return-object p1

    .line 36
    :cond_4
    new-instance v0, LS0/f;

    .line 37
    .line 38
    invoke-direct {v0, p0, p1, p2, p3}, LS0/f;-><init>(Ljava/lang/Object;LS0/g;LS0/a$c;Ljava/lang/Throwable;)V

    .line 39
    .line 40
    .line 41
    return-object v0

    .line 42
    :cond_5
    new-instance v0, LS0/c;

    .line 43
    .line 44
    invoke-direct {v0, p0, p1, p2, p3}, LS0/c;-><init>(Ljava/lang/Object;LS0/g;LS0/a$c;Ljava/lang/Throwable;)V

    .line 45
    .line 46
    .line 47
    return-object v0
.end method


# virtual methods
.method public abstract b()LS0/a;
.end method

.method public close()V
    .locals 1

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-boolean v0, p0, LS0/a;->m:Z

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    monitor-exit p0

    .line 7
    return-void

    .line 8
    :catchall_0
    move-exception v0

    .line 9
    goto :goto_0

    .line 10
    :cond_0
    const/4 v0, 0x1

    .line 11
    iput-boolean v0, p0, LS0/a;->m:Z

    .line 12
    .line 13
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 14
    iget-object v0, p0, LS0/a;->n:LS0/h;

    .line 15
    .line 16
    invoke-virtual {v0}, LS0/h;->d()V

    .line 17
    .line 18
    .line 19
    return-void

    .line 20
    :goto_0
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 21
    throw v0
.end method

.method public declared-synchronized d()LS0/a;
    .locals 1

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    invoke-virtual {p0}, LS0/a;->z()Z

    .line 3
    .line 4
    .line 5
    move-result v0

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    invoke-virtual {p0}, LS0/a;->b()LS0/a;

    .line 9
    .line 10
    .line 11
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 12
    monitor-exit p0

    .line 13
    return-object v0

    .line 14
    :catchall_0
    move-exception v0

    .line 15
    goto :goto_0

    .line 16
    :cond_0
    monitor-exit p0

    .line 17
    const/4 v0, 0x0

    .line 18
    return-object v0

    .line 19
    :goto_0
    monitor-exit p0

    .line 20
    throw v0
.end method

.method public declared-synchronized j()Ljava/lang/Object;
    .locals 1

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-boolean v0, p0, LS0/a;->m:Z

    .line 3
    .line 4
    xor-int/lit8 v0, v0, 0x1

    .line 5
    .line 6
    invoke-static {v0}, LO0/l;->i(Z)V

    .line 7
    .line 8
    .line 9
    iget-object v0, p0, LS0/a;->n:LS0/h;

    .line 10
    .line 11
    invoke-virtual {v0}, LS0/h;->f()Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-static {v0}, LO0/l;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 19
    monitor-exit p0

    .line 20
    return-object v0

    .line 21
    :catchall_0
    move-exception v0

    .line 22
    monitor-exit p0

    .line 23
    throw v0
.end method

.method public l()I
    .locals 1

    .line 1
    invoke-virtual {p0}, LS0/a;->z()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget-object v0, p0, LS0/a;->n:LS0/h;

    .line 8
    .line 9
    invoke-virtual {v0}, LS0/h;->f()Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-static {v0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    goto :goto_0

    .line 18
    :cond_0
    const/4 v0, 0x0

    .line 19
    :goto_0
    return v0
.end method

.method public declared-synchronized z()Z
    .locals 1

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-boolean v0, p0, LS0/a;->m:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 3
    .line 4
    xor-int/lit8 v0, v0, 0x1

    .line 5
    .line 6
    monitor-exit p0

    .line 7
    return v0

    .line 8
    :catchall_0
    move-exception v0

    .line 9
    monitor-exit p0

    .line 10
    throw v0
.end method
