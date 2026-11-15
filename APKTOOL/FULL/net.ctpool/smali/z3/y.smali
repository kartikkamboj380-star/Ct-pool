.class final Lz3/y;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lz3/h;
.implements Lz3/g;
.implements Lz3/e;
.implements Lz3/J;


# instance fields
.field private final a:Ljava/util/concurrent/Executor;

.field private final b:Lz3/c;

.field private final c:Lz3/O;


# direct methods
.method public constructor <init>(Ljava/util/concurrent/Executor;Lz3/c;Lz3/O;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lz3/y;->a:Ljava/util/concurrent/Executor;

    .line 5
    .line 6
    iput-object p2, p0, Lz3/y;->b:Lz3/c;

    .line 7
    .line 8
    iput-object p3, p0, Lz3/y;->c:Lz3/O;

    .line 9
    .line 10
    return-void
.end method

.method static bridge synthetic e(Lz3/y;)Lz3/c;
    .locals 0

    .line 1
    iget-object p0, p0, Lz3/y;->b:Lz3/c;

    .line 2
    .line 3
    return-object p0
.end method

.method static bridge synthetic f(Lz3/y;)Lz3/O;
    .locals 0

    .line 1
    iget-object p0, p0, Lz3/y;->c:Lz3/O;

    .line 2
    .line 3
    return-object p0
.end method


# virtual methods
.method public final a()V
    .locals 1

    .line 1
    iget-object v0, p0, Lz3/y;->c:Lz3/O;

    .line 2
    .line 3
    invoke-virtual {v0}, Lz3/O;->u()Z

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final b(Ljava/lang/Object;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lz3/y;->c:Lz3/O;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lz3/O;->t(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final c(Ljava/lang/Exception;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lz3/y;->c:Lz3/O;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lz3/O;->s(Ljava/lang/Exception;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final d(Lz3/l;)V
    .locals 1

    .line 1
    new-instance v0, Lz3/x;

    .line 2
    .line 3
    invoke-direct {v0, p0, p1}, Lz3/x;-><init>(Lz3/y;Lz3/l;)V

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, Lz3/y;->a:Ljava/util/concurrent/Executor;

    .line 7
    .line 8
    invoke-interface {p1, v0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method
