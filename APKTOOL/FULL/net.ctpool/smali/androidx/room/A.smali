.class public abstract Landroidx/room/A;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final database:Landroidx/room/u;

.field private final lock:Ljava/util/concurrent/atomic/AtomicBoolean;

.field private final stmt$delegate:Lkotlin/Lazy;


# direct methods
.method public constructor <init>(Landroidx/room/u;)V
    .locals 1

    const-string v0, "database"

    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/room/A;->database:Landroidx/room/u;

    new-instance p1, Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v0, 0x0

    invoke-direct {p1, v0}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object p1, p0, Landroidx/room/A;->lock:Ljava/util/concurrent/atomic/AtomicBoolean;

    new-instance p1, Landroidx/room/A$a;

    invoke-direct {p1, p0}, Landroidx/room/A$a;-><init>(Landroidx/room/A;)V

    invoke-static {p1}, Li5/g;->b(Lv5/a;)Lkotlin/Lazy;

    move-result-object p1

    iput-object p1, p0, Landroidx/room/A;->stmt$delegate:Lkotlin/Lazy;

    return-void
.end method

.method private final a()LZ/k;
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroidx/room/A;->createQuery()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, p0, Landroidx/room/A;->database:Landroidx/room/u;

    .line 6
    .line 7
    invoke-virtual {v1, v0}, Landroidx/room/u;->compileStatement(Ljava/lang/String;)LZ/k;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    return-object v0
.end method

.method public static final synthetic access$createNewStatement(Landroidx/room/A;)LZ/k;
    .locals 0

    .line 1
    invoke-direct {p0}, Landroidx/room/A;->a()LZ/k;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private final b()LZ/k;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/room/A;->stmt$delegate:Lkotlin/Lazy;

    .line 2
    .line 3
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, LZ/k;

    .line 8
    .line 9
    return-object v0
.end method

.method private final c(Z)LZ/k;
    .locals 0

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    invoke-direct {p0}, Landroidx/room/A;->b()LZ/k;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    goto :goto_0

    .line 8
    :cond_0
    invoke-direct {p0}, Landroidx/room/A;->a()LZ/k;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    :goto_0
    return-object p1
.end method


# virtual methods
.method public acquire()LZ/k;
    .locals 3

    .line 1
    invoke-virtual {p0}, Landroidx/room/A;->assertNotMainThread()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Landroidx/room/A;->lock:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    const/4 v2, 0x1

    .line 8
    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    invoke-direct {p0, v0}, Landroidx/room/A;->c(Z)LZ/k;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    return-object v0
.end method

.method protected assertNotMainThread()V
    .locals 1

    iget-object v0, p0, Landroidx/room/A;->database:Landroidx/room/u;

    invoke-virtual {v0}, Landroidx/room/u;->assertNotMainThread()V

    return-void
.end method

.method protected abstract createQuery()Ljava/lang/String;
.end method

.method public release(LZ/k;)V
    .locals 1

    .line 1
    const-string v0, "statement"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Landroidx/room/A;->b()LZ/k;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    if-ne p1, v0, :cond_0

    .line 11
    .line 12
    iget-object p1, p0, Landroidx/room/A;->lock:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 13
    .line 14
    const/4 v0, 0x0

    .line 15
    invoke-virtual {p1, v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 16
    .line 17
    .line 18
    :cond_0
    return-void
.end method
