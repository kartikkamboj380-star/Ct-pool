.class public final Lcom/facebook/react/modules/core/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/facebook/react/modules/core/a$b;
    }
.end annotation


# static fields
.field private static f:Lcom/facebook/react/modules/core/a;


# instance fields
.field private a:Ld2/b$a;

.field private final b:[Ljava/util/ArrayDeque;

.field private final c:Landroid/view/Choreographer$FrameCallback;

.field private d:I

.field private e:Z


# direct methods
.method private constructor <init>(Ld2/b;)V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lcom/facebook/react/modules/core/a$a;

    .line 5
    .line 6
    invoke-direct {v0, p0}, Lcom/facebook/react/modules/core/a$a;-><init>(Lcom/facebook/react/modules/core/a;)V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lcom/facebook/react/modules/core/a;->c:Landroid/view/Choreographer$FrameCallback;

    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    iput v0, p0, Lcom/facebook/react/modules/core/a;->d:I

    .line 13
    .line 14
    iput-boolean v0, p0, Lcom/facebook/react/modules/core/a;->e:Z

    .line 15
    .line 16
    invoke-static {}, Lcom/facebook/react/modules/core/a$b;->values()[Lcom/facebook/react/modules/core/a$b;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    array-length v1, v1

    .line 21
    new-array v1, v1, [Ljava/util/ArrayDeque;

    .line 22
    .line 23
    iput-object v1, p0, Lcom/facebook/react/modules/core/a;->b:[Ljava/util/ArrayDeque;

    .line 24
    .line 25
    :goto_0
    iget-object v1, p0, Lcom/facebook/react/modules/core/a;->b:[Ljava/util/ArrayDeque;

    .line 26
    .line 27
    array-length v2, v1

    .line 28
    if-ge v0, v2, :cond_0

    .line 29
    .line 30
    new-instance v2, Ljava/util/ArrayDeque;

    .line 31
    .line 32
    invoke-direct {v2}, Ljava/util/ArrayDeque;-><init>()V

    .line 33
    .line 34
    .line 35
    aput-object v2, v1, v0

    .line 36
    .line 37
    add-int/lit8 v0, v0, 0x1

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_0
    new-instance v0, Lm2/j;

    .line 41
    .line 42
    invoke-direct {v0, p0, p1}, Lm2/j;-><init>(Lcom/facebook/react/modules/core/a;Ld2/b;)V

    .line 43
    .line 44
    .line 45
    invoke-static {v0}, Lcom/facebook/react/bridge/UiThreadUtil;->runOnUiThread(Ljava/lang/Runnable;)Z

    .line 46
    .line 47
    .line 48
    return-void
.end method

.method public static synthetic a(Lcom/facebook/react/modules/core/a;Ld2/b;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/facebook/react/modules/core/a;->j(Ld2/b;)V

    return-void
.end method

.method public static synthetic b(Lcom/facebook/react/modules/core/a;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/facebook/react/modules/core/a;->k()V

    return-void
.end method

.method static bridge synthetic c(Lcom/facebook/react/modules/core/a;)[Ljava/util/ArrayDeque;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/facebook/react/modules/core/a;->b:[Ljava/util/ArrayDeque;

    return-object p0
.end method

.method static bridge synthetic d(Lcom/facebook/react/modules/core/a;)I
    .locals 0

    .line 1
    iget p0, p0, Lcom/facebook/react/modules/core/a;->d:I

    return p0
.end method

.method static bridge synthetic e(Lcom/facebook/react/modules/core/a;Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/facebook/react/modules/core/a;->e:Z

    return-void
.end method

.method static bridge synthetic f(Lcom/facebook/react/modules/core/a;I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/facebook/react/modules/core/a;->d:I

    return-void
.end method

.method static bridge synthetic g(Lcom/facebook/react/modules/core/a;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/facebook/react/modules/core/a;->l()V

    return-void
.end method

.method public static h()Lcom/facebook/react/modules/core/a;
    .locals 2

    .line 1
    sget-object v0, Lcom/facebook/react/modules/core/a;->f:Lcom/facebook/react/modules/core/a;

    const-string v1, "ReactChoreographer needs to be initialized."

    invoke-static {v0, v1}, LO1/a;->d(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    sget-object v0, Lcom/facebook/react/modules/core/a;->f:Lcom/facebook/react/modules/core/a;

    return-object v0
.end method

.method public static i(Ld2/b;)V
    .locals 1

    .line 1
    sget-object v0, Lcom/facebook/react/modules/core/a;->f:Lcom/facebook/react/modules/core/a;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Lcom/facebook/react/modules/core/a;

    .line 6
    .line 7
    invoke-direct {v0, p0}, Lcom/facebook/react/modules/core/a;-><init>(Ld2/b;)V

    .line 8
    .line 9
    .line 10
    sput-object v0, Lcom/facebook/react/modules/core/a;->f:Lcom/facebook/react/modules/core/a;

    .line 11
    .line 12
    :cond_0
    return-void
.end method

.method private synthetic j(Ld2/b;)V
    .locals 0

    .line 1
    invoke-interface {p1}, Ld2/b;->a()Ld2/b$a;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iput-object p1, p0, Lcom/facebook/react/modules/core/a;->a:Ld2/b$a;

    .line 6
    .line 7
    return-void
.end method

.method private synthetic k()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/facebook/react/modules/core/a;->b:[Ljava/util/ArrayDeque;

    monitor-enter v0

    :try_start_0
    invoke-direct {p0}, Lcom/facebook/react/modules/core/a;->n()V

    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method private l()V
    .locals 3

    .line 1
    iget v0, p0, Lcom/facebook/react/modules/core/a;->d:I

    const/4 v1, 0x0

    if-ltz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    invoke-static {v0}, LO1/a;->a(Z)V

    iget v0, p0, Lcom/facebook/react/modules/core/a;->d:I

    if-nez v0, :cond_2

    iget-boolean v0, p0, Lcom/facebook/react/modules/core/a;->e:Z

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/facebook/react/modules/core/a;->a:Ld2/b$a;

    if-eqz v0, :cond_1

    iget-object v2, p0, Lcom/facebook/react/modules/core/a;->c:Landroid/view/Choreographer$FrameCallback;

    invoke-interface {v0, v2}, Ld2/b$a;->b(Landroid/view/Choreographer$FrameCallback;)V

    :cond_1
    iput-boolean v1, p0, Lcom/facebook/react/modules/core/a;->e:Z

    :cond_2
    return-void
.end method

.method private n()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/facebook/react/modules/core/a;->a:Ld2/b$a;

    iget-object v1, p0, Lcom/facebook/react/modules/core/a;->c:Landroid/view/Choreographer$FrameCallback;

    invoke-interface {v0, v1}, Ld2/b$a;->a(Landroid/view/Choreographer$FrameCallback;)V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/facebook/react/modules/core/a;->e:Z

    return-void
.end method


# virtual methods
.method public m(Lcom/facebook/react/modules/core/a$b;Landroid/view/Choreographer$FrameCallback;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/facebook/react/modules/core/a;->b:[Ljava/util/ArrayDeque;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lcom/facebook/react/modules/core/a;->b:[Ljava/util/ArrayDeque;

    invoke-virtual {p1}, Lcom/facebook/react/modules/core/a$b;->h()I

    move-result p1

    aget-object p1, v1, p1

    invoke-virtual {p1, p2}, Ljava/util/ArrayDeque;->addLast(Ljava/lang/Object;)V

    iget p1, p0, Lcom/facebook/react/modules/core/a;->d:I

    const/4 p2, 0x1

    add-int/2addr p1, p2

    iput p1, p0, Lcom/facebook/react/modules/core/a;->d:I

    if-lez p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p2, 0x0

    :goto_0
    invoke-static {p2}, LO1/a;->a(Z)V

    iget-boolean p1, p0, Lcom/facebook/react/modules/core/a;->e:Z

    if-nez p1, :cond_2

    iget-object p1, p0, Lcom/facebook/react/modules/core/a;->a:Ld2/b$a;

    if-nez p1, :cond_1

    new-instance p1, Lm2/i;

    invoke-direct {p1, p0}, Lm2/i;-><init>(Lcom/facebook/react/modules/core/a;)V

    invoke-static {p1}, Lcom/facebook/react/bridge/UiThreadUtil;->runOnUiThread(Ljava/lang/Runnable;)Z

    goto :goto_1

    :catchall_0
    move-exception p1

    goto :goto_2

    :cond_1
    invoke-direct {p0}, Lcom/facebook/react/modules/core/a;->n()V

    :cond_2
    :goto_1
    monitor-exit v0

    return-void

    :goto_2
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public o(Lcom/facebook/react/modules/core/a$b;Landroid/view/Choreographer$FrameCallback;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/facebook/react/modules/core/a;->b:[Ljava/util/ArrayDeque;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lcom/facebook/react/modules/core/a;->b:[Ljava/util/ArrayDeque;

    invoke-virtual {p1}, Lcom/facebook/react/modules/core/a$b;->h()I

    move-result p1

    aget-object p1, v1, p1

    invoke-virtual {p1, p2}, Ljava/util/ArrayDeque;->removeFirstOccurrence(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    iget p1, p0, Lcom/facebook/react/modules/core/a;->d:I

    add-int/lit8 p1, p1, -0x1

    iput p1, p0, Lcom/facebook/react/modules/core/a;->d:I

    invoke-direct {p0}, Lcom/facebook/react/modules/core/a;->l()V

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    const-string p1, "ReactNative"

    const-string p2, "Tried to remove non-existent frame callback"

    invoke-static {p1, p2}, LP0/a;->j(Ljava/lang/String;Ljava/lang/String;)V

    :goto_0
    monitor-exit v0

    return-void

    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method
