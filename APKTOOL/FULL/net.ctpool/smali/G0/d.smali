.class public final LG0/d;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:LP3/b;

.field private b:Ljava/util/concurrent/atomic/AtomicReference;

.field private c:Ljava/util/concurrent/atomic/AtomicBoolean;


# direct methods
.method public constructor <init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V
    .locals 1

    .line 1
    const-string v0, "context"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    invoke-static {p1}, LP3/c;->a(Landroid/content/Context;)LP3/b;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    const-string v0, "create(...)"

    .line 14
    .line 15
    invoke-static {p1, v0}, Lw5/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    iput-object p1, p0, LG0/d;->a:LP3/b;

    .line 19
    .line 20
    new-instance p1, Ljava/util/concurrent/atomic/AtomicReference;

    .line 21
    .line 22
    invoke-direct {p1}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    .line 23
    .line 24
    .line 25
    iput-object p1, p0, LG0/d;->b:Ljava/util/concurrent/atomic/AtomicReference;

    .line 26
    .line 27
    new-instance p1, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 28
    .line 29
    invoke-direct {p1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>()V

    .line 30
    .line 31
    .line 32
    iput-object p1, p0, LG0/d;->c:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 33
    .line 34
    return-void
.end method

.method public static synthetic a(Lv5/l;Ljava/lang/Object;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, LG0/d;->h(Lv5/l;Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic b(LG0/d;Landroid/app/Activity;[Ljava/lang/Object;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, LG0/d;->f(LG0/d;Landroid/app/Activity;[Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic c(Lcom/facebook/react/bridge/Promise;Ljava/lang/Exception;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, LG0/d;->i(Lcom/facebook/react/bridge/Promise;Ljava/lang/Exception;)V

    return-void
.end method

.method public static final synthetic d(LG0/d;)Ljava/util/concurrent/atomic/AtomicReference;
    .locals 0

    .line 1
    iget-object p0, p0, LG0/d;->b:Ljava/util/concurrent/atomic/AtomicReference;

    .line 2
    .line 3
    return-object p0
.end method

.method private static final f(LG0/d;Landroid/app/Activity;[Ljava/lang/Object;)V
    .locals 1

    .line 1
    const-string v0, "this$0"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "$activity"

    .line 7
    .line 8
    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "args"

    .line 12
    .line 13
    invoke-static {p2, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    invoke-static {p2}, Lj5/h;->r([Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object p2

    .line 20
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 21
    .line 22
    invoke-static {p2, v0}, Lw5/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    move-result p2

    .line 26
    if-eqz p2, :cond_0

    .line 27
    .line 28
    :try_start_0
    invoke-direct {p0, p1}, LG0/d;->k(Landroid/app/Activity;)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 29
    .line 30
    .line 31
    goto :goto_0

    .line 32
    :catch_0
    move-exception p0

    .line 33
    invoke-virtual {p0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 34
    .line 35
    .line 36
    :cond_0
    :goto_0
    return-void
.end method

.method private static final h(Lv5/l;Ljava/lang/Object;)V
    .locals 1

    .line 1
    const-string v0, "$tmp0"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-interface {p0, p1}, Lv5/l;->i(Ljava/lang/Object;)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method private static final i(Lcom/facebook/react/bridge/Promise;Ljava/lang/Exception;)V
    .locals 1

    .line 1
    const-string v0, "$promise"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "it"

    .line 7
    .line 8
    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-interface {p0, p1}, Lcom/facebook/react/bridge/Promise;->reject(Ljava/lang/Throwable;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method private final k(Landroid/app/Activity;)Z
    .locals 4

    .line 1
    iget-object v0, p0, LG0/d;->b:Ljava/util/concurrent/atomic/AtomicReference;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicReference;->getAndSet(Ljava/lang/Object;)Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    check-cast v0, LP3/a;

    .line 9
    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    const/4 p1, 0x0

    .line 13
    return p1

    .line 14
    :cond_0
    iget-object v1, p0, LG0/d;->a:LP3/b;

    .line 15
    .line 16
    const/4 v2, 0x1

    .line 17
    const/16 v3, 0x65

    .line 18
    .line 19
    invoke-interface {v1, v0, v2, p1, v3}, LP3/b;->a(LP3/a;ILandroid/app/Activity;I)Z

    .line 20
    .line 21
    .line 22
    move-result p1

    .line 23
    return p1
.end method


# virtual methods
.method public final e(Landroid/app/Activity;II)V
    .locals 1

    .line 1
    const-string v0, "activity"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const/16 v0, 0x65

    .line 7
    .line 8
    if-eq p2, v0, :cond_0

    .line 9
    .line 10
    return-void

    .line 11
    :cond_0
    if-nez p3, :cond_1

    .line 12
    .line 13
    iget-object p2, p0, LG0/d;->c:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 14
    .line 15
    invoke-virtual {p2}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 16
    .line 17
    .line 18
    move-result p2

    .line 19
    if-eqz p2, :cond_1

    .line 20
    .line 21
    new-instance p2, LG0/a;

    .line 22
    .line 23
    invoke-direct {p2, p0, p1}, LG0/a;-><init>(LG0/d;Landroid/app/Activity;)V

    .line 24
    .line 25
    .line 26
    new-instance p1, Lcom/facebook/react/bridge/PromiseImpl;

    .line 27
    .line 28
    const/4 p3, 0x0

    .line 29
    invoke-direct {p1, p2, p3}, Lcom/facebook/react/bridge/PromiseImpl;-><init>(Lcom/facebook/react/bridge/Callback;Lcom/facebook/react/bridge/Callback;)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {p0, p1}, LG0/d;->g(Lcom/facebook/react/bridge/Promise;)V

    .line 33
    .line 34
    .line 35
    :cond_1
    return-void
.end method

.method public final g(Lcom/facebook/react/bridge/Promise;)V
    .locals 3

    .line 1
    const-string v0, "promise"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LG0/d;->b:Ljava/util/concurrent/atomic/AtomicReference;

    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    .line 10
    .line 11
    .line 12
    iget-object v0, p0, LG0/d;->a:LP3/b;

    .line 13
    .line 14
    invoke-interface {v0}, LP3/b;->b()Lz3/l;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    const-string v1, "getAppUpdateInfo(...)"

    .line 19
    .line 20
    invoke-static {v0, v1}, Lw5/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    new-instance v1, LG0/d$a;

    .line 24
    .line 25
    invoke-direct {v1, p0, p1}, LG0/d$a;-><init>(LG0/d;Lcom/facebook/react/bridge/Promise;)V

    .line 26
    .line 27
    .line 28
    new-instance v2, LG0/b;

    .line 29
    .line 30
    invoke-direct {v2, v1}, LG0/b;-><init>(Lv5/l;)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {v0, v2}, Lz3/l;->g(Lz3/h;)Lz3/l;

    .line 34
    .line 35
    .line 36
    new-instance v1, LG0/c;

    .line 37
    .line 38
    invoke-direct {v1, p1}, LG0/c;-><init>(Lcom/facebook/react/bridge/Promise;)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {v0, v1}, Lz3/l;->e(Lz3/g;)Lz3/l;

    .line 42
    .line 43
    .line 44
    return-void
.end method

.method public final j(ZLandroid/app/Activity;)Z
    .locals 1

    .line 1
    const-string v0, "activity"

    .line 2
    .line 3
    invoke-static {p2, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LG0/d;->c:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 7
    .line 8
    invoke-virtual {v0, p1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 9
    .line 10
    .line 11
    invoke-direct {p0, p2}, LG0/d;->k(Landroid/app/Activity;)Z

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    return p1
.end method
