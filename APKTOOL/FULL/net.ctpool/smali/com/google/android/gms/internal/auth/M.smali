.class public abstract Lcom/google/android/gms/internal/auth/M;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final f:Ljava/lang/Object;

.field private static volatile g:Lcom/google/android/gms/internal/auth/K;

.field private static final h:Ljava/util/concurrent/atomic/AtomicReference;

.field private static final i:Lcom/google/android/gms/internal/auth/O;

.field private static final j:Ljava/util/concurrent/atomic/AtomicInteger;

.field public static final synthetic k:I


# instance fields
.field final a:Lcom/google/android/gms/internal/auth/I;

.field final b:Ljava/lang/String;

.field private final c:Ljava/lang/Object;

.field private volatile d:I

.field private volatile e:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/auth/M;->f:Ljava/lang/Object;

    new-instance v0, Ljava/util/concurrent/atomic/AtomicReference;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/auth/M;->h:Ljava/util/concurrent/atomic/AtomicReference;

    new-instance v0, Lcom/google/android/gms/internal/auth/O;

    sget-object v1, Lcom/google/android/gms/internal/auth/D;->a:Lcom/google/android/gms/internal/auth/D;

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/auth/O;-><init>(Lcom/google/android/gms/internal/auth/D;)V

    sput-object v0, Lcom/google/android/gms/internal/auth/M;->i:Lcom/google/android/gms/internal/auth/O;

    new-instance v0, Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/auth/M;->j:Ljava/util/concurrent/atomic/AtomicInteger;

    return-void
.end method

.method synthetic constructor <init>(Lcom/google/android/gms/internal/auth/I;Ljava/lang/String;Ljava/lang/Object;ZLcom/google/android/gms/internal/auth/L;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 p4, -0x1

    iput p4, p0, Lcom/google/android/gms/internal/auth/M;->d:I

    iget-object p4, p1, Lcom/google/android/gms/internal/auth/I;->a:Landroid/net/Uri;

    if-eqz p4, :cond_0

    iput-object p1, p0, Lcom/google/android/gms/internal/auth/M;->a:Lcom/google/android/gms/internal/auth/I;

    iput-object p2, p0, Lcom/google/android/gms/internal/auth/M;->b:Ljava/lang/String;

    iput-object p3, p0, Lcom/google/android/gms/internal/auth/M;->c:Ljava/lang/Object;

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Must pass a valid SharedPreferences file name or ContentProvider URI"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static c()V
    .locals 1

    .line 1
    sget-object v0, Lcom/google/android/gms/internal/auth/M;->j:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I

    return-void
.end method

.method public static d(Landroid/content/Context;)V
    .locals 3

    .line 1
    sget-object v0, Lcom/google/android/gms/internal/auth/M;->g:Lcom/google/android/gms/internal/auth/K;

    if-nez v0, :cond_5

    if-nez p0, :cond_0

    goto :goto_4

    :cond_0
    sget-object v0, Lcom/google/android/gms/internal/auth/M;->f:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    sget-object v1, Lcom/google/android/gms/internal/auth/M;->g:Lcom/google/android/gms/internal/auth/K;

    if-nez v1, :cond_4

    monitor-enter v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :try_start_1
    sget-object v1, Lcom/google/android/gms/internal/auth/M;->g:Lcom/google/android/gms/internal/auth/K;

    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v2

    if-eqz v2, :cond_1

    move-object p0, v2

    :cond_1
    if-eqz v1, :cond_2

    invoke-virtual {v1}, Lcom/google/android/gms/internal/auth/K;->a()Landroid/content/Context;

    move-result-object v1

    if-eq v1, p0, :cond_3

    goto :goto_0

    :catchall_0
    move-exception p0

    goto :goto_1

    :cond_2
    :goto_0
    invoke-static {}, Lcom/google/android/gms/internal/auth/q;->d()V

    invoke-static {}, Lcom/google/android/gms/internal/auth/N;->c()V

    invoke-static {}, Lcom/google/android/gms/internal/auth/x;->e()V

    new-instance v1, Lcom/google/android/gms/internal/auth/C;

    invoke-direct {v1, p0}, Lcom/google/android/gms/internal/auth/C;-><init>(Landroid/content/Context;)V

    invoke-static {v1}, Lcom/google/android/gms/internal/auth/Z;->a(Lcom/google/android/gms/internal/auth/U;)Lcom/google/android/gms/internal/auth/U;

    move-result-object v1

    new-instance v2, Lcom/google/android/gms/internal/auth/n;

    invoke-direct {v2, p0, v1}, Lcom/google/android/gms/internal/auth/n;-><init>(Landroid/content/Context;Lcom/google/android/gms/internal/auth/U;)V

    sput-object v2, Lcom/google/android/gms/internal/auth/M;->g:Lcom/google/android/gms/internal/auth/K;

    sget-object p0, Lcom/google/android/gms/internal/auth/M;->j:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I

    :cond_3
    monitor-exit v0

    goto :goto_2

    :goto_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    throw p0

    :catchall_1
    move-exception p0

    goto :goto_3

    :cond_4
    :goto_2
    monitor-exit v0

    return-void

    :goto_3
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    throw p0

    :cond_5
    :goto_4
    return-void
.end method


# virtual methods
.method abstract a(Ljava/lang/Object;)Ljava/lang/Object;
.end method

.method public final b()Ljava/lang/Object;
    .locals 8

    .line 1
    sget-object v0, Lcom/google/android/gms/internal/auth/M;->j:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result v0

    iget v1, p0, Lcom/google/android/gms/internal/auth/M;->d:I

    if-ge v1, v0, :cond_c

    monitor-enter p0

    :try_start_0
    iget v1, p0, Lcom/google/android/gms/internal/auth/M;->d:I

    if-ge v1, v0, :cond_b

    sget-object v1, Lcom/google/android/gms/internal/auth/M;->g:Lcom/google/android/gms/internal/auth/K;

    invoke-static {}, Lcom/google/android/gms/internal/auth/S;->c()Lcom/google/android/gms/internal/auth/S;

    move-result-object v2

    const/4 v3, 0x0

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Lcom/google/android/gms/internal/auth/K;->b()Lcom/google/android/gms/internal/auth/U;

    move-result-object v2

    invoke-interface {v2}, Lcom/google/android/gms/internal/auth/U;->a()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/google/android/gms/internal/auth/S;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/auth/S;->b()Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-virtual {v2}, Lcom/google/android/gms/internal/auth/S;->a()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/google/android/gms/internal/auth/r;

    iget-object v5, p0, Lcom/google/android/gms/internal/auth/M;->a:Lcom/google/android/gms/internal/auth/I;

    iget-object v6, v5, Lcom/google/android/gms/internal/auth/I;->a:Landroid/net/Uri;

    iget-object v5, v5, Lcom/google/android/gms/internal/auth/I;->c:Ljava/lang/String;

    iget-object v7, p0, Lcom/google/android/gms/internal/auth/M;->b:Ljava/lang/String;

    invoke-virtual {v4, v6, v3, v5, v7}, Lcom/google/android/gms/internal/auth/r;->a(Landroid/net/Uri;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    goto :goto_0

    :catchall_0
    move-exception v0

    goto/16 :goto_8

    :cond_0
    move-object v4, v3

    :goto_0
    const-string v5, "Must call PhenotypeFlag.init() first"

    if-eqz v1, :cond_a

    iget-object v5, p0, Lcom/google/android/gms/internal/auth/M;->a:Lcom/google/android/gms/internal/auth/I;

    iget-object v5, v5, Lcom/google/android/gms/internal/auth/I;->a:Landroid/net/Uri;

    if-eqz v5, :cond_2

    invoke-virtual {v1}, Lcom/google/android/gms/internal/auth/K;->a()Landroid/content/Context;

    move-result-object v6

    invoke-static {v6, v5}, Lcom/google/android/gms/internal/auth/z;->a(Landroid/content/Context;Landroid/net/Uri;)Z

    move-result v5

    if-eqz v5, :cond_1

    invoke-virtual {v1}, Lcom/google/android/gms/internal/auth/K;->a()Landroid/content/Context;

    move-result-object v5

    invoke-virtual {v5}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v5

    iget-object v6, p0, Lcom/google/android/gms/internal/auth/M;->a:Lcom/google/android/gms/internal/auth/I;

    iget-object v6, v6, Lcom/google/android/gms/internal/auth/I;->a:Landroid/net/Uri;

    sget-object v7, Lcom/google/android/gms/internal/auth/B;->m:Lcom/google/android/gms/internal/auth/B;

    invoke-static {v5, v6, v7}, Lcom/google/android/gms/internal/auth/q;->b(Landroid/content/ContentResolver;Landroid/net/Uri;Ljava/lang/Runnable;)Lcom/google/android/gms/internal/auth/q;

    move-result-object v5

    goto :goto_2

    :cond_1
    :goto_1
    move-object v5, v3

    goto :goto_2

    :cond_2
    invoke-virtual {v1}, Lcom/google/android/gms/internal/auth/K;->a()Landroid/content/Context;

    move-result-object v5

    sget-object v6, Lcom/google/android/gms/internal/auth/B;->m:Lcom/google/android/gms/internal/auth/B;

    invoke-static {v5, v3, v6}, Lcom/google/android/gms/internal/auth/N;->b(Landroid/content/Context;Ljava/lang/String;Ljava/lang/Runnable;)Lcom/google/android/gms/internal/auth/N;

    goto :goto_1

    :goto_2
    if-eqz v5, :cond_3

    iget-object v6, p0, Lcom/google/android/gms/internal/auth/M;->b:Ljava/lang/String;

    invoke-interface {v5, v6}, Lcom/google/android/gms/internal/auth/u;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v5

    if-eqz v5, :cond_3

    invoke-virtual {p0, v5}, Lcom/google/android/gms/internal/auth/M;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    goto :goto_3

    :cond_3
    move-object v5, v3

    :goto_3
    if-nez v5, :cond_7

    iget-object v5, p0, Lcom/google/android/gms/internal/auth/M;->a:Lcom/google/android/gms/internal/auth/I;

    iget-boolean v5, v5, Lcom/google/android/gms/internal/auth/I;->d:Z

    if-nez v5, :cond_5

    invoke-virtual {v1}, Lcom/google/android/gms/internal/auth/K;->a()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Lcom/google/android/gms/internal/auth/x;->b(Landroid/content/Context;)Lcom/google/android/gms/internal/auth/x;

    move-result-object v1

    iget-object v5, p0, Lcom/google/android/gms/internal/auth/M;->a:Lcom/google/android/gms/internal/auth/I;

    iget-boolean v5, v5, Lcom/google/android/gms/internal/auth/I;->d:Z

    if-eqz v5, :cond_4

    move-object v5, v3

    goto :goto_4

    :cond_4
    iget-object v5, p0, Lcom/google/android/gms/internal/auth/M;->b:Ljava/lang/String;

    :goto_4
    invoke-virtual {v1, v5}, Lcom/google/android/gms/internal/auth/x;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_5

    invoke-virtual {p0, v1}, Lcom/google/android/gms/internal/auth/M;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    :cond_5
    if-nez v3, :cond_6

    iget-object v5, p0, Lcom/google/android/gms/internal/auth/M;->c:Ljava/lang/Object;

    goto :goto_5

    :cond_6
    move-object v5, v3

    :cond_7
    :goto_5
    invoke-virtual {v2}, Lcom/google/android/gms/internal/auth/S;->b()Z

    move-result v1

    if-eqz v1, :cond_9

    if-nez v4, :cond_8

    iget-object v5, p0, Lcom/google/android/gms/internal/auth/M;->c:Ljava/lang/Object;

    goto :goto_6

    :cond_8
    invoke-virtual {p0, v4}, Lcom/google/android/gms/internal/auth/M;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    :cond_9
    :goto_6
    iput-object v5, p0, Lcom/google/android/gms/internal/auth/M;->e:Ljava/lang/Object;

    iput v0, p0, Lcom/google/android/gms/internal/auth/M;->d:I

    goto :goto_7

    :cond_a
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, v5}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_b
    :goto_7
    monitor-exit p0

    goto :goto_9

    :goto_8
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0

    :cond_c
    :goto_9
    iget-object v0, p0, Lcom/google/android/gms/internal/auth/M;->e:Ljava/lang/Object;

    return-object v0
.end method
